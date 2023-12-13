package com.eppixcomm.eppix.common.util;


import java.lang.reflect.InvocationTargetException;
import java.rmi.RemoteException;
import java.rmi.ServerException;
import java.sql.Connection;
import java.sql.SQLException;

import java.util.Hashtable;
import java.util.Map;

import javax.ejb.EJBException;
import javax.ejb.EJBHome;
import javax.ejb.EJBObject;
import javax.ejb.HomeHandle;

import javax.jms.JMSException;
import javax.jms.ObjectMessage;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.jms.Topic;
import javax.jms.TopicConnection;
import javax.jms.TopicConnectionFactory;
import javax.jms.TopicPublisher;
import javax.jms.TopicSession;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import javax.rmi.PortableRemoteObject;

import javax.sql.DataSource;

import org.apache.log4j.Logger;

import com.eppixcomm.eppix.base.error.EPPIXFatalException;
import com.eppixcomm.eppix.base.error.EPPIXSecurityException;
import com.eppixcomm.eppix.base.error.Thrower;

/**
 * Locates and caches services obtained via JNDI lookup.
 * 
 * @author $Author$
 * @version $Revision: 1.1 $
 * 
 * @since 1.4
 */
public class ServiceLocator {
  /** Logger. */
  private static Logger logger = Logger.getLogger(ServiceLocator.class);

  private static Thrower thrower = Thrower.getThrower(ServiceLocator.class);

  /** Service locator singleton. */
  private static ServiceLocator serviceLocatorRef = null;

  /** Initial naming context. */
  private Context ctx = null;

  /** Home interface cache. */
  private Map homeHandleCache = null;

  /** Data source cache. */
  private Map dataSourceCache = null;

  /** Environment entry cache. */
  private Map envEntryCache = null;

  /** Topic Connection factory cache. */
  private Map topicConnectionFactoryCache = null;

  /** Topic cache. */
  private Map topicCache = null;

  /**
   * Creates a new ServiceLocator object.
   *
   * @throws NamingException
   */
  private ServiceLocator() throws NamingException {

    logger.debug("constructor()");

    ctx = new InitialContext();
    homeHandleCache = new Hashtable();
    dataSourceCache = new Hashtable();
    envEntryCache = new Hashtable();
    topicConnectionFactoryCache = new Hashtable();
    topicCache = new Hashtable();
  }

  /**
   * Retrieves the service locator singleton.
   *
   * @return service locator object.
   *
   * @throws ServiceLocatorException
   */
  public static ServiceLocator getInstance() throws ServiceLocatorException {
    if (logger.isDebugEnabled()) {
      logger.debug("getInstance()");
    }

    try {

      if (serviceLocatorRef == null) {

        serviceLocatorRef = new ServiceLocator();
      }

    } catch (NamingException e) {

      throwServiceLocatorException("getInstance()", e);
    }

    return serviceLocatorRef;
  }

  /**
   * Retrieves a home interface from the cache for the specified home interface 
   * class. If the cache does not contain the home interface, a JNDI lookup is 
   * performed and the resulting home interface is cached. If the home interface
   * class has a JNDI_NAME field, it is used to provide the JNDI name for the 
   * lookup. Otherwise, the name of the home interface class is used.
   *
   * @param homeClass home interface class.
   *
   * @return EJBHome object.
   *
   * @throws ServiceLocatorException
   */
  public EJBHome getEJBHome(Class homeClass) throws ServiceLocatorException {

    String jndiName = null;

    try {

      jndiName = (String) homeClass.getField("JNDI_NAME").get(null);

    } catch (IllegalArgumentException e) {

      throwServiceLocatorException("getEJBHome()", e);

    } catch (SecurityException e) {

      throwServiceLocatorException("getEJBHome()", e);

    } catch (IllegalAccessException e) {

      throwServiceLocatorException("getEJBHome()", e);

    } catch (NoSuchFieldException e) {

      jndiName = homeClass.getName();
    }

    return getEJBHome(homeClass, jndiName);
  }

  /**
   * Retrieves a home interface from the cache for the specified JNDI name. If 
   * the cache does not contain the home interface, a JNDI lookup is performed 
   * using the JNDI name and the resulting home interface is cached.
   *
   * @param homeClass home interface class.
   * @param jndiName JNDI name of the home interface.
   *
   * @return EJBHome object.
   *
   * @throws ServiceLocatorException
   */
  public EJBHome getEJBHome(Class homeClass, String jndiName)
      throws ServiceLocatorException {

    if (logger.isDebugEnabled()) {
      logger.debug("getEJBHome( homeClass=" + homeClass.getName()
          + ", jndiName=" + jndiName + " )");
    }

    HomeHandle homeHandle = (HomeHandle)homeHandleCache.get(jndiName);
    EJBHome ejbHome = null;

    try {

      if (homeHandle != null) {

        ejbHome = homeHandle.getEJBHome();

      } else {

        ejbHome = (EJBHome) PortableRemoteObject.narrow(ctx.lookup(jndiName),
            homeClass);
        homeHandle = ejbHome.getHomeHandle();
        homeHandleCache.put(jndiName, homeHandle);
      }

    } catch (ClassCastException e) {

      throwServiceLocatorException("getEJBHome()", e);

    } catch (NamingException e) {

      throwServiceLocatorException("getEJBHome()", e);

    } catch (RemoteException e) {

      throwServiceLocatorException("getEJBHome()", e);
    }

    return ejbHome;
  }

  /**
   * Creates a new EJBObject by invoking the create method of the cached home
   * interface specified by the home interface class.
   * 
   * @param homeClass home interface class.
   * 
   * @return EJB object.
   * 
   * @throws EPPIXSecurityException
   * @throws EPPIXFatalException
   */
  public EJBObject createEJBObject(Class homeClass)
      throws EPPIXSecurityException, EPPIXFatalException {

    if (logger.isDebugEnabled()) {
      logger.debug("createEJBObject( homeClass=" + homeClass.getName() + " )");
    }

    EJBObject ejbObject = null;

    try {

      EJBHome ejbHome = getEJBHome(homeClass);

      ejbObject = (EJBObject) homeClass.getMethod("create", (Class[]) null)
          .invoke(ejbHome, (Object[]) null);

    } catch (ServiceLocatorException e) {
      thrower.fatal(e);
    } catch (IllegalArgumentException e) {
      thrower.fatal(e);
    } catch (SecurityException e) {
      thrower.fatal(e);
    } catch (IllegalAccessException e) {
      thrower.fatal(e);
    } catch (NoSuchMethodException e) {
      thrower.fatal(e);
    } catch (InvocationTargetException e) {

      Throwable e1 = e.getCause();

      if (e1 instanceof ServerException) {

        Throwable e2 = ((ServerException) e1).detail;

        while (e2 != null && e2 instanceof ServerException) {

          e2 = ((ServerException) e2).detail;
        }

        if (e2 != null && e2 instanceof EJBException) {

          Exception e3 = ((EJBException) e2).getCausedByException();

          if (e3 instanceof SecurityException) {

            thrower.security(((SecurityException) e3).getMessage(), e);
          }
        }
      }
      thrower.fatal(e);
    }

    return ejbObject;
  }

  /**
   * Retrieves a database connection from the cached data source specified by
   * the JNDI name. If the data source is not in the cache, a JNDI lookup is
   * performed to obtain the datasource which is then cached.
   *
   * @param jndiName JNDI name of the data source.
   *
   * @return database connection object.
   *
   * @throws ServiceLocatorException
   */
  public Connection getConnection(String jndiName)
      throws ServiceLocatorException {

    if (logger.isDebugEnabled()) {
      logger.debug("getConnection( jndiName=" + jndiName + " )");
    }

    /* Checking to see if the requested DataSource is in the Cache */
    DataSource dataSource = (DataSource)dataSourceCache.get(jndiName);
    Connection connection = null;

    try {

      if (dataSource == null) {

        dataSource = (DataSource) ctx.lookup(jndiName);
        dataSourceCache.put(jndiName, dataSource);
      }

      connection = dataSource.getConnection();

    } catch (SQLException e) {

      throwServiceLocatorException("getConnection()", e);

    } catch (NamingException e) {

      throwServiceLocatorException("getConnection()", e);
    }

    return connection;
  }

  /**
   * Retrieves an environment entry from the cache for the specified JNDI name.
   * If the environment entry is not in the cache, a JNDI lookup is performed 
   * to obtain it.
   *
   * @param jndiName JNDI name of the environment entry.
   *
   * @return environment string.
   *
   * @throws ServiceLocatorException
   */
  public String getEnvEntry(String jndiName) throws ServiceLocatorException {

    if (logger.isDebugEnabled()) {
      logger.debug("getEnvEntry( jndiName=" + jndiName + " )");
    }

    /* Checking to see if the requested DataSource is in the Cache */
    String envEntry = (String)envEntryCache.get(jndiName);

    try {
      if (envEntry == null) {

        envEntry = (String) ctx.lookup(jndiName);
        envEntryCache.put(jndiName, envEntry);
      }

    } catch (NamingException e) {

      throwServiceLocatorException("getEnvEntry()", e);
    }

    return envEntry;
  }

  /**
   * Throws a service locator exception.
   * 
   * @param methodName name of the calling method.
   * @param e cause.
   * 
   * @throws ServiceLocatorException
   */
  private static void throwServiceLocatorException(String methodName,
      Throwable e) throws ServiceLocatorException {

    ServiceLocatorException fatalException = new ServiceLocatorException(e);
    logger.fatal(methodName, fatalException);
    throw fatalException;
  }

  /**
   *
   * @param jndiName JNDI name of the connectio factory.
   *
   * @return EJBHome object.
   *
   * @throws ServiceLocatorException
   */
  public TopicConnectionFactory getTopicConnectionFactory(String jndiName)
      throws ServiceLocatorException {

    TopicConnectionFactory factory = (TopicConnectionFactory) topicConnectionFactoryCache
        .get(jndiName);

    try {

      if (factory == null) {

        factory = (TopicConnectionFactory) ctx.lookup(jndiName);
        topicConnectionFactoryCache.put(jndiName, factory);

      }

    } catch (ClassCastException e) {

      throwServiceLocatorException("getTopicConnectionFactory()", e);

    } catch (NamingException e) {

      throwServiceLocatorException("getTopicConnectionFactory()", e);
    }
    return factory;
  }

  /**
   *
   * @param jndiName JNDI name of the Topic.
   *
   * @return EJBHome object.
   *
   * @throws ServiceLocatorException
   */
  public Topic getTopic(String jndiName) throws ServiceLocatorException {

    Topic topic = (Topic) topicCache.get(jndiName);

    try {

      if (topic == null) {

        topic = (Topic) ctx.lookup(jndiName);

        topicConnectionFactoryCache.put("jndiName", topic);

      }

    } catch (ClassCastException e) {

      throwServiceLocatorException("getTopicConnectionFactory()", e);

    } catch (NamingException e) {

      throwServiceLocatorException("getTopicConnectionFactory()", e);
    }

    return topic;
  }

  /**
   *
   * @param connectionFactoryJndiName JNDI name of the TopicPublisher.
   *
   * @return EJBHome object.
   *
   * @throws ServiceLocatorException
   */
  public TopicPublisher getTopicPublisher(String connectionFactoryJndiName,
      String topicJndiName) throws ServiceLocatorException {

    TopicPublisher topicPublisher = null;

    try {

      TopicConnectionFactory factory = getTopicConnectionFactory(connectionFactoryJndiName);
      TopicConnection connection = factory.createTopicConnection();
      TopicSession session = connection.createTopicSession(false,
          Session.AUTO_ACKNOWLEDGE);
      Topic topic = getTopic(topicJndiName);

      topicPublisher = session.createPublisher(topic);

    } catch (ClassCastException e) {

      throwServiceLocatorException("getTopicConnectionFactory()", e);

    } catch (JMSException e) {

      throwServiceLocatorException("getTopicConnectionFactory()", e);
    }

    return topicPublisher;
  }

  /**
   *
   * @param connectionFactoryJndiName JNDI name of the connectionFactory
   *
   * @return EJBHome object.
   *
   * @throws ServiceLocatorException
   */
  public TextMessage getTopicTextMessage(String connectionFactoryJndiName)
      throws ServiceLocatorException {

    TopicSession session = null;
    TextMessage message = null;

    try {

      TopicConnectionFactory factory = getTopicConnectionFactory(connectionFactoryJndiName);
      TopicConnection connection = factory.createTopicConnection();
      session = connection.createTopicSession(false, Session.AUTO_ACKNOWLEDGE);
      message = session.createTextMessage();

    } catch (ClassCastException e) {

      throwServiceLocatorException("getTopicConnectionFactory()", e);

    } catch (JMSException e) {

      throwServiceLocatorException("getTopicConnectionFactory()", e);
    }

    return message;
  }

  /**
   *
   * @param connectionFactoryJndiName JNDI name of the connectionFactory.
   *
   * @return EJBHome object.
   *
   * @throws ServiceLocatorException
   */
  public ObjectMessage getTopicObjectMessage(String connectionFactoryJndiName)
      throws ServiceLocatorException {

    TopicSession session = null;
    ObjectMessage message = null;

    try {

      TopicConnectionFactory factory = getTopicConnectionFactory(connectionFactoryJndiName);
      TopicConnection connection = factory.createTopicConnection();
      session = connection.createTopicSession(false, Session.AUTO_ACKNOWLEDGE);
      message = session.createObjectMessage();

    } catch (ClassCastException e) {

      throwServiceLocatorException("getTopicConnectionFactory()", e);

    } catch (JMSException e) {

      throwServiceLocatorException("getTopicConnectionFactory()", e);
    }

    return message;
  }

}