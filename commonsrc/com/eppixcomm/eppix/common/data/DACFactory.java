/* ====================================================================== *
 * (c) Copyright Eppixcomm Tech Ltd.                                      *
 * All Rights Reserved                                                    *
 *                                                                        *
 * Legal Information                                                      *
 * ====================================================================== */
package com.eppixcomm.eppix.common.data;

//import com.eppixcomm.eppix.common.core.UserContext;
import com.eppixcomm.eppix.base.dml.DMLFactory;
import com.eppixcomm.eppix.base.error.EPPIXFatalException;
import com.eppixcomm.eppix.base.error.EPPIXSeriousException;
import com.eppixcomm.eppix.base.error.EPPIXUnexpectedException;
import com.eppixcomm.eppix.base.error.Thrower;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;

/**
 * Superclass for Data Access Controller factories.
 * 
 * @author $Author$
 * @version $Revision: 1.4 $
 */
abstract public class DACFactory {

  /** Error handler/logger */
  private Thrower thrower;

  private Logger logger;

  /** User's context. */
//  private UserContext userContext;

  /** The connection context. */
  private ConnectionContext connectionContext;

  /**
   * User's working language.
   * 
   * @deprecated
   */
  protected String defaultLanguageCode;

  /** List of DACs that will be closed when the factory is closed. */
  private List dacList = Collections
      .synchronizedList(new ArrayList());

  /**
   * Creates a new Data Access Controller factory object.
   * 
   * @param userContext the user's context.
   * @param dataSourceRef data source reference.
   * @param thrower exception handler/logger.
   * 
   * @throws EPPIXFatalException
   */
  protected DACFactory(String dataSourceRef,
      Thrower thrower) throws EPPIXFatalException {

    this.thrower = thrower;
    this.logger = thrower.getLogger();

    logger.debug("constructor( userContext, dataSourceRef, thrower )");

//    this.userContext = userContext;
//    this.connectionContext = ConnectionContext.connect(        );
//    this.defaultLanguageCode = userContext.getLocale().getLanguageCode();
  }

  /**
   * Creates a new Data Access Controller factory object.
   * 
   * @param userContext the user's context.
   * @param connection JDBC database connection.
   * @param thrower exception handler/logger.
   * 
   * @throws EPPIXFatalException
   */
  protected DACFactory(Connection connection,
      Thrower thrower) throws EPPIXFatalException {

    this.thrower = thrower;
    this.logger = thrower.getLogger();

    logger.debug("constructor( connection, thrower )");

//    this.userContext = userContext;
    this.connectionContext = ConnectionContext.connect( connection);
//    this.defaultLanguageCode = userContext.getLocale().getLanguageCode();
  }

  /**
   * Creates a new DACImpl object from the specified class.
   * 
   * @param dacImplClass DACImpl class.
   * @param dmlFactory DML factory object.
   * 
   * @return DACImpl object.
   * 
   * @throws EPPIXFatalException
   */
  protected DAC getDAC(Class dacImplClass, DMLFactory dmlFactory)
      throws EPPIXFatalException {

    logger.debug("getDAC( dacImplClass, dmlFactory )" + dacImplClass.getName() + " " + dmlFactory.toString());

    DAC dac = null;

    try {

     thrower.ifParameterMissing("dacImplClass", dacImplClass);
      thrower.ifParameterMissing("dmlFactory", dmlFactory);

      if (!DAC.class.isAssignableFrom(dacImplClass)) {
        thrower.fatal(dacImplClass.getName() + " must be a subclass of "
            + DAC.class.getName());
      } 

      this.logger.debug("BEFORE INSTANTIATION DAC CLASS: " + dacImplClass.toString());
      
      dac = (DAC) dacImplClass.getConstructor( new Class[]{DAO.class}).newInstance(new Object[]{new DAOImpl(connectionContext, dmlFactory) }
          );
      
      
      dacList.add(dac);
      this.logger.debug("AFTER ADDING DAC CLASS: " + dacImplClass.toString() + " TO MAP");

    } catch (SecurityException e) {
    	e.printStackTrace();
      thrower.fatal(e);
    } catch (NoSuchMethodException e) {
    	e.printStackTrace();
      thrower.fatal(e);
    } catch (IllegalArgumentException e) {
    	e.printStackTrace();
      thrower.fatal(e);
    } catch (InstantiationException e) {
    	e.printStackTrace();
      thrower.fatal(e);
    } catch (IllegalAccessException e) {
    	e.printStackTrace();
      thrower.fatal(e);
    } catch (InvocationTargetException e) {
    	e.printStackTrace();
      thrower.fatal(e);
    } catch (EPPIXSeriousException e) {
    	e.printStackTrace();
      thrower.fatal(e);
    }

    return dac;
  }

  /**
   * Adds the specified data access controller to the list of controllers that
   * will be closed when the this factory is closed.
   * 
   * @param dac Data Access Controller.
   * 
   * @return the Data Access Controller.
   * 
   * @deprecated
   */
  protected DAC add(DAC dac) {

    logger.debug("add( dac )");
    dacList.add(dac);
    return dac;
  }

  /**
   * Closes all of the Data Access Controllers added to this factory.
   * 
   * @throws EPPIXUnexpectedException
   * @throws SQLException 
   */
  public void close() throws EPPIXUnexpectedException, SQLException {

    logger.debug("close()");

    // Close all of the DACs
    synchronized (dacList) {
      for (Iterator i = dacList.iterator(); i.hasNext();) {
        ((Connection) i.next()).close();
      }
    }
    
    if (connectionContext != null) {
      connectionContext.close();
    }
  }

  /**
   * Indicates whether the database has been updated.
   * 
   * @return 'true' if the database has been modified; 'false' otherwise.
   */
  public boolean isDatabaseDirty() {
    return connectionContext.isDirty();
  }
}