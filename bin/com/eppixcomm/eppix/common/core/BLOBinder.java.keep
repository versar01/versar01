/* ====================================================================== *
 * (c) Copyright Eppixcomm Tech Ltd.                                      *
 * All Rights Reserved                                                    *
 *                                                                        *
 * Legal Information                                                      *
 * ====================================================================== */
package com.eppixcomm.eppix.common.core;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import javax.ejb.EJBContext;
import javax.ejb.MessageDrivenContext;

import org.apache.log4j.Logger;

import com.eppixcomm.eppix.common.data.DAC;
import com.eppixcomm.eppix.common.data.DACFactory;
import com.eppixcomm.eppix.base.error.EPPIXFatalException;
import com.eppixcomm.eppix.base.error.EPPIXUnexpectedException;
import com.eppixcomm.eppix.base.error.Thrower;
import com.eppixcomm.eppix.common.util.EppixLocale;

/**
 * This is the superclass for all business logic object binder classes. It
 * provides a cache of business logic objects (BLOs) and a mechanism that allows
 * BLOs to call one another. Also, it initialises BLO instance variables,
 * including locale, loginName and DAC implementation.
 * 
 * @author $Author: adonohoe $
 * @version $Revision: 1.11 $
 * 
 * @since $jdk$
 */
public class BLOBinder {

  /** Error handler/logger. */
  private Thrower thrower;

  private Logger logger;

  /** Data access controller factory. */
  protected DACFactory dacFactory;

  /** The user's context. */
  private UserContext userContext;

  /** EJB context. */
  private EppixLocale locale;

  /** User's (caller's) login name. */
  private String loginName;

  /** BLO cache. */
  private Map bloMap = Collections
      .synchronizedMap(new HashMap());

  private boolean closed = false;

  /**
   * Create a new binder object.
   * 
   * @param ctx EJB context.
   * @param locale the user's locale object.
   * @param dacFactoryClass DAC factory class.
   * @param thrower error handler/logger.
   * 
   * @throws EPPIXFatalException
   */
  protected BLOBinder(EJBContext ctx, EppixLocale locale,
      Class dacFactoryClass, Thrower thrower) throws EPPIXFatalException {

    this(ctx, null, locale, dacFactoryClass, null, thrower);
  }

  /**
   * Create a new binder object.
   * 
   * @param loginName the user's login identifier.
   * @param locale the user's locale object.
   * @param dacFactoryClass DAC factory class.
   * @param connection JDBC database connection.
   * @param thrower error handler/logger.
   * 
   * @throws EPPIXFatalException
   */
  protected BLOBinder(String loginName, EppixLocale locale,
      Class dacFactoryClass, Connection connection, Thrower thrower)
      throws EPPIXFatalException {

    this(null, loginName, locale, dacFactoryClass, connection, thrower);
  }

  /**
   * Create a new binder object.
   * 
   * @param ctx EJB context.
   * @param loginName the user's login identifier.
   * @param locale the user's locale object.
   * @param dacFactoryClass DAC factory class.
   * @param connection JDBC database connection.
   * @param thrower error handler/logger.
   * 
   * @throws EPPIXFatalException
   */
  private BLOBinder(EJBContext ctx, String loginName, EppixLocale locale,
      Class dacFactoryClass, Connection connection, Thrower thrower)
      throws EPPIXFatalException {

    this.thrower = thrower;
    this.logger = thrower.getLogger();
    this.locale = locale;

    if (ctx != null) {

      try {

        if (!(ctx instanceof MessageDrivenContext)) {

          loginName = ctx.getCallerPrincipal().getName();

        }

      } catch (IllegalStateException e) {
        logger.error(e);
        loginName = "";
      }

    }

    if (loginName == null) {
      loginName = "";
    }

    this.loginName = loginName;

    String moduleName = "";
    String moduleClassName = "";
    String moduleMethodName = "";
    // Find the calling method by inspecting the stack for a method that is
    // not a constructor.
    StackTraceElement[] stackTraceElements = new Throwable().getStackTrace();
    for (int i = 0; i < stackTraceElements.length; ++i) {
      if (!stackTraceElements[i].getMethodName().equals("<init>")) {
        moduleClassName = stackTraceElements[i].getClassName();
        if (moduleClassName.startsWith("com.eppixcomm.eppix.")) {
          int c = moduleClassName.indexOf('.', 17);
          if (c >= 0) {
            moduleName = moduleClassName.substring(17, c);
          }
          moduleClassName = moduleClassName.substring(moduleClassName
              .lastIndexOf('.') + 1);
        }
        moduleMethodName = stackTraceElements[i].getMethodName();
        break;
      }
    }

    userContext = UserContext.set(loginName, moduleName, moduleClassName,
        moduleMethodName, locale);

    try {

      if (dacFactoryClass != null) {

        if (!DACFactory.class.isAssignableFrom(dacFactoryClass)) {
          thrower.fatal(dacFactoryClass.getName() + " must be a subclass of "
              + DACFactory.class.getName());
        }

        if (connection == null) {

          dacFactory = (DACFactory) dacFactoryClass.getConstructor(
              new Class[] { UserContext.class }).newInstance(
              new Object[] { userContext });

        } else {

          dacFactory = (DACFactory) dacFactoryClass.getConstructor(
              new Class[] { UserContext.class, Connection.class }).newInstance(
              new Object[] { userContext, connection });
        }
      }

    } catch (SecurityException e) {
      thrower.fatal(e);
    } catch (NoSuchMethodException e) {
      thrower.fatal(e);
    } catch (IllegalArgumentException e) {
      thrower.fatal(e);
    } catch (InstantiationException e) {
      thrower.fatal(e);
    } catch (IllegalAccessException e) {
      thrower.fatal(e);
    } catch (InvocationTargetException e) {
      thrower.fatal(e);
    }
  }

  /**
   * Retrieves a business logic object (BLO) of the specified class from the
   * cache. If the cahce does not contain the required BLO, then one is
   * instantiated and added to the cache. The binder object itself, locale
   * object and loginName are passed to the BLO. The DACFactory is accessed, by
   * invoking a get[BLOName]DAC method, to provide a suitable DAC implementation
   * for the BLO.
   * 
   * @param bloClass business logic object class.
   * 
   * @return business logic object.
   * 
   * @throws EPPIXFatalException
   */
  protected BLO getBLO(Class bloClass) throws EPPIXFatalException {

    String bloClassName = bloClass.getName();

    if (logger.isDebugEnabled()) {
      logger.debug("getBLO( bloClass=" + bloClassName + " )");
    }

    BLO blo = (BLO)bloMap.get(bloClassName);

    if (blo == null) {

      synchronized (this) {

        blo = (BLO)bloMap.get(bloClassName);

        if (blo == null) {

          try {

            blo = (BLO) bloClass.newInstance();
            blo.setBinder(this);
            if (userContext != null) {
              blo.setUserContext(userContext);
            } else {
              blo.setLoginName(loginName);
              blo.setLocale(locale);
            }

            int i = bloClassName.lastIndexOf('.');

            if (dacFactory != null) {

              Class dacClass = blo.getDACClass();

//              blo.setDAC(dacFactory.getDAC(dacClass));

	            String methodName = "get"
	                + ((i < 0) ? bloClassName : bloClassName.substring(i + 1))
	                + "DAC";
	            
	            Method getDAC = dacFactory.getClass().getMethod(methodName,
	                (Class[]) null);
	            blo.setDAC((DAC) (getDAC.invoke(dacFactory, (Object[]) null)));

            }

            bloMap.put(bloClassName, blo);

          } catch (InstantiationException e) {
            thrower.fatal(e);
          } catch (IllegalAccessException e) {
            thrower.fatal(e);
          } catch (SecurityException e) {
            thrower.fatal(e);
          } catch (NoSuchMethodException e) {
            thrower.fatal(e);
          } catch (IllegalArgumentException e) {
            thrower.fatal(e);
          } catch (InvocationTargetException e) {
            thrower.fatal(e);
          }
        }
      }
    }

    return blo;
  }

  /**
   * Releases resources allocated to this binder object.
   */
  public void close() {

    logger.debug("close( )");

    closed = true;

    if (dacFactory != null) {

      try {

        dacFactory.close();

      } catch (EPPIXUnexpectedException e) {
        logger.error(e);
      } catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    }
  }

  /**
   * Releases resources allocated to the specified binder object.
   * 
   * @param bloBinder BLO binder object.
   */
  static public void close(BLOBinder bloBinder) {

    if (bloBinder != null) {
      bloBinder.close();
    }
  }

  /**
   * Indicates whether the database has been updated.
   * 
   * @return 'true' if the database has been modified; 'false' otherwise.
   */
  public boolean isDatabaseDirty() {
    return (dacFactory != null && dacFactory.isDatabaseDirty());
  }

  public boolean isClosed() {
    return closed;
  }

}