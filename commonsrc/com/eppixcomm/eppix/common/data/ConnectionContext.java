/* ====================================================================== *
 * (c) Copyright Eppixcomm Tech Ltd.                                      *
 * All Rights Reserved                                                    *
 *                                                                        *
 * Legal Information                                                      *
 * ====================================================================== */
package com.eppixcomm.eppix.common.data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import org.apache.log4j.Logger;

//import com.eppixcomm.eppix.common.util.ServiceLocator;
//import com.eppixcomm.eppix.common.util.ServiceLocatorException;
//import com.eppixcomm.eppix.common.core.UserContext;
import com.eppixcomm.eppix.base.error.EPPIXFatalException;
import com.eppixcomm.eppix.base.error.Thrower;

/**
 * Retrieves cached connections and establishes database tracing appropriate to
 * the database product and the following system properties: - 1.
 * eppix.database.trace – Enables or disables database tracing. It can have a
 * value of standard, advanced or user. Any other value is treated as off which
 * is the default. The standard and advanced options enable logging at the
 * appropriate level. The user option uses the databaseTraceLevel specified in a
 * user’s locale object. This allows the front end to dictate whether tracing is
 * required. <br>
 * 2. eppix.database.trace-user – Database tracing is limited to those users
 * specified in this list of comma separated user login names. This property is
 * ignored when eppix.database.trace=user. If the list is empty or the property
 * has not been set, tracing is performed for all users. <br>
 * 3. eppix.database.trace-module – Database tracing is limited to those modules
 * in this list of comma separated module names. Tracing is performed for all
 * modules if the list is empty or the property has not been set. <br>
 * 
 * @author $Author$
 * @version $Revision: 1.3 $
 */
public class ConnectionContext {

  private static Thrower thrower = Thrower.getThrower(ConnectionContext.class);
  private static Logger logger = thrower.getLogger();
  private static int usersHashCode = 0;
  private static String[] users;
  private static int modulesHashCode = 0;
  private static String[] modules;

  private Connection connection = null;
  /**
   * Set to true by the DAOImpl via setIsDirty() when the database has been
   * updated and hence will require rolling back when an EPPIXException is
   * thrown that is deemed to cause a rollback.
   */
  private boolean isDirty = false;
  private int traceLevel = 0;
  private String databaseProductName = "";

  private static ThreadLocal context = new ThreadLocal() {

    protected Object initialValue() {
      return new ConnectionContext();
    }
  };

  /**
   * Gets the ConnectionContext object from thread local storage.
   * 
   * @return ConnectionContext object.
   */
  public static ConnectionContext get() {

    logger.debug("get()");

    return (ConnectionContext) context.get();
  }

  /**
   * Employs the specified database connection and establishes database tracing
   * as specified by the 'eppix.database.trace' system properties.
   * 
   * @param userContext the user's context.
   * @param connection JDBC database connection.
   * 
   * @return ConnectionContext object.
   * 
   * @throws EPPIXFatalException
   */
  public static ConnectionContext connect(Connection connection) throws EPPIXFatalException {

    logger.debug("connect( connection )");

    ConnectionContext connectionContext = get();

    connectionContext.setConnection( connection);

    return connectionContext;
  }
  
  /**
   * TODO: SJ Need to ensure that we get the same connection 
   * object everytime and not a new connection. 
   * Only get a new connection if there is no existing 
   * connection available from the pool
   * 
   * @param userContext
   * @param dataSourceRef
   * @return
   * @throws EPPIXFatalException
   */
//  public static ConnectionContext getConnectionFromDataSource(String dataSourceRef, String providerUrl) 
//  		throws EPPIXFatalException {
//
//	    logger.debug("connect( dataSourceRef, String providerUrl)");
//	    Connection connection = null;	 
//
//	    try {
//
//		  Properties prop = new Properties();
//		  prop.put(Context.INITIAL_CONTEXT_FACTORY,"weblogic.jndi.WLInitialContextFactory");
//		  prop.put(Context.PROVIDER_URL, providerUrl);
//
//		  Context ctx = new InitialContext(prop);
//		  DataSource ds = (DataSource)ctx.lookup(dataSourceRef);
//		  connection = ds.getConnection();
//  
//	    }catch(NamingException e){
//	    	logger.debug("ConnectionContext connect(String dataSourceRef, String providerUrl) " + e.toString());
//			throw new EPPIXFatalException("ConnectionContext connect(String dataSourceRef, String providerUrl) " + e.toString());
//	    }catch (SQLException e) {
//	    	logger.debug("ConnectionContext connect(String dataSourceRef, String providerUrl) " + e.toString());
//	    	throw new EPPIXFatalException("ConnectionContext connect(String dataSourceRef, String providerUrl) " + e.toString());
//		}
//	    
//	    ConnectionContext connectionContext = get();
//	    connectionContext.setConnection(connection);
//	    return connectionContext;
//	  }
  
  public static Connection getConnectionFromDataSource(String dataSourceRef, String providerUrl) 
	throws EPPIXFatalException {

  logger.debug("connect( dataSourceRef, String providerUrl)");
  Connection connection = null;	 

  try {

	  Properties prop = new Properties();
	  prop.put(Context.INITIAL_CONTEXT_FACTORY,"weblogic.jndi.WLInitialContextFactory");
	  prop.put(Context.PROVIDER_URL, providerUrl);

	  Context ctx = new InitialContext(prop);
	  DataSource ds = (DataSource)ctx.lookup(dataSourceRef);
	  connection = ds.getConnection();

  }catch(NamingException e){
  	logger.debug("ConnectionContext connect(String dataSourceRef, String providerUrl) " + e.toString());
		throw new EPPIXFatalException("ConnectionContext connect(String dataSourceRef, String providerUrl) " + e.toString());
  }catch (SQLException e) {
  	logger.debug("ConnectionContext connect(String dataSourceRef, String providerUrl) " + e.toString());
  	throw new EPPIXFatalException("ConnectionContext connect(String dataSourceRef, String providerUrl) " + e.toString());
	}
  
//  ConnectionContext connectionContext = get();
//  connectionContext.setConnection(connection);
  return connection;
}

  /**
   * Employs the specified database connection and establishes database tracing
   * as specified by the 'eppix.database.trace' system properties.
   * 
   * @param userContext the user's context.
   * @param connection JDBC database connection.
   * 
   * @throws EPPIXFatalException
   */
  private void setConnection(Connection connection)
    throws EPPIXFatalException {

    this.connection = connection;
    this.isDirty = false;
    this.traceLevel = 0;

    String trace = System.getProperty("eppix.database.trace", "off");
//    if (trace.equalsIgnoreCase("standard") && isUserIncluded(userContext)) {
//      this.traceLevel = 1;
//    } else if (trace.equalsIgnoreCase("advanced")
//      && isUserIncluded(userContext)) {
//      this.traceLevel = 2;
//    } else if (trace.equalsIgnoreCase("user")) {
//      this.traceLevel = userContext.getLocale().getDatabaseTraceLevel();
//      if (this.traceLevel < 0 || this.traceLevel > 2) {
//        this.traceLevel = 0;
//      }
//    }
//
//    if (this.traceLevel > 0 && !isMethodIncluded(userContext)) {
//      this.traceLevel = 0;
//    }

    if (this.traceLevel > 0) {

      Statement stmt = null;
      PreparedStatement preparedStatement = null;

      try {

        this.databaseProductName = this.connection.getMetaData()
          .getDatabaseProductName();

        if (this.databaseProductName.equalsIgnoreCase("Oracle")) {

          stmt = this.connection.createStatement();

          String stmtString = "ALTER SESSION SET EVENTS '10046 trace name context forever, level "
            + ((this.traceLevel == 1) ? "4'" : "12'");
          logger.debug(stmtString);
          stmt.executeUpdate(stmtString);

          stmtString = "begin dbms_application_info.set_client_info(?);"
            + "dbms_application_info.set_module(?,?); end;";
          logger.debug(stmtString);

          preparedStatement = this.connection.prepareStatement(stmtString);
//          preparedStatement.setString(1, userContext.getLoginName());
//          preparedStatement.setString(2, userContext.getLoginName() + ":"
//            + userContext.getModuleName() + "."
//            + userContext.getModuleClassName());
//          preparedStatement.setString(3, userContext.getModuleMethodName());
          preparedStatement.executeUpdate();
        }

      } catch (SQLException e) {

        logger.error("connect(): Failed to start database tracing: ", e);

      } finally {

        if (stmt != null) {
          try {
            stmt.close();
          } catch (SQLException e) {
            // do nothing
          }
        }
        if (preparedStatement != null) {
          try {
            preparedStatement.close();
          } catch (SQLException e) {
            // do nothing
          }
        }
      }
    }
  }

  /**
   * Tests whether the loginName provided by the userContext is specified in the
   * comma separated list of login names provided by the
   * 'eppix.database.trace-user' system property.
   * 
   * @param userContext the user's context.
   * @return true if the system property has not been set or if the user's login
   *         name appears in the list; otherwise false.
   */
//  private static boolean isUserIncluded(UserContext userContext) {
//
//    String userList = System.getProperty("eppix.database.trace-user", "");
//    if (userList.length() == 0) {
//      return true;
//    }
//
//    return (Arrays.binarySearch(users(userList), userContext.getLoginName()
//      .toLowerCase()) >= 0);
//  }

  private static String[] users(String userList) {
    int hashCode = userList.hashCode();
    if (hashCode != usersHashCode) {
      setUsers(hashCode, userList);
    }
    return users;
  }

  synchronized private static void setUsers(int hashCode, String userList) {
    if (hashCode != usersHashCode) {
      users = userList.replaceAll(" ", "").toLowerCase().split(",");
      Arrays.sort(users);
      usersHashCode = hashCode;
    }
  }

  /**
   * Tests whether the moduleName provided by the userContext is specified in
   * the comma separated list of module names provided by the
   * 'eppix.database.trace-module' system property.
   * 
   * @param userContext the user's context.
   * @return true if the system property has not been set or if the module name
   *         appears in the list; otherwise false.
   */
//  private static boolean isMethodIncluded(UserContext userContext) {
//
//    String moduleList = System.getProperty("eppix.database.trace-module", "");
//    if (moduleList.length() == 0) {
//      return true;
//    }
//
//    return (Arrays.binarySearch(modules(moduleList), userContext
//      .getModuleName().toLowerCase()) >= 0);
//  }

  private static String[] modules(String moduleList) {
    int hashCode = moduleList.hashCode();
    if (hashCode != modulesHashCode) {
      setModules(hashCode, moduleList);
    }
    return modules;
  }

  synchronized private static void setModules(int hashCode, String moduleList) {
    if (hashCode != modulesHashCode) {
      modules = moduleList.replaceAll(" ", "").toLowerCase().split(",");
      Arrays.sort(modules);
      modulesHashCode = hashCode;
    }
  }

  public Connection getConnection() {
    return connection;
  }

  /**
   * Ends database tracing.
   */
  protected void close() {

    logger.debug("close()");

    if (connection != null && traceLevel > 0) {

      Statement stmt = null;

      try {

        if (databaseProductName.equalsIgnoreCase("Oracle")) {
          stmt = connection.createStatement();
          String stmtString = "ALTER SESSION SET EVENTS '10046 trace name context off'";
          logger.debug(stmtString);
          stmt.executeUpdate(stmtString);
        }

      } catch (SQLException e) {

        logger.error("close(): Failed to end database tracing: ", e);

      } finally {

        if (stmt != null) {
          try {
            stmt.close();
          } catch (SQLException e) {
            // do nothing
          }
          connection = null;
          isDirty = false;
          traceLevel = 0;
        }
      }
    } else if (connection != null) {
    	// BaH
    	// We really have to close the database connection!
    	// It is still pooled tho.. so we aren't really closing it.
   	try {
			connection.close();
			connection = null;
		} catch (SQLException e) {
			// do nothing
		}
    }
  }

  /**
   * Called by the DAOImpl to indicate that it has modified the database.
   */
  protected void setIsDirty() {
    isDirty = true;
  }

  /**
   * Indicates whether the database has been updated.
   * 
   * @return 'true' if the database has been modified; 'false' otherwise.
   */
  public boolean isDirty() {
    return isDirty;
  }
}