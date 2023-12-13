/* ====================================================================== *
 * (c) Copyright Eppixcomm Tech Ltd.                                      *
 * All Rights Reserved                                                    *
 *                                                                        *
 * Legal Information                                                      *
 * ====================================================================== */
package com.eppixcomm.eppix.common.data;

import java.io.IOException;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

import com.eppixcomm.eppix.base.dml.DML;
import com.eppixcomm.eppix.base.dml.DMLDynamicQuery;
import com.eppixcomm.eppix.base.dml.DMLDynamicUpdate;
import com.eppixcomm.eppix.base.dml.DMLException;
import com.eppixcomm.eppix.base.dml.DMLFactory;
import com.eppixcomm.eppix.base.dml.DMLParamQuery;
import com.eppixcomm.eppix.base.dml.DMLStaticQuery;
import com.eppixcomm.eppix.base.dml.DMLStaticUpdate;
import com.eppixcomm.eppix.base.dml.DMLTable;
import com.eppixcomm.eppix.base.error.EPPIXFatalException;
import com.eppixcomm.eppix.base.error.EPPIXObjectBusyException;
import com.eppixcomm.eppix.base.error.EPPIXObjectExpiredException;
import com.eppixcomm.eppix.base.error.EPPIXObjectNotFoundException;
import com.eppixcomm.eppix.base.error.EPPIXSeriousException;
import com.eppixcomm.eppix.common.util.DateTime;

/**
 * This is the standard (JDBC 2.1 API compliant) implementation of the {@link
 * DAO} (Data Access Object) interface. This implementation can be extented
 * to incorporate any database vendor specific enhancements to the JDBC API.
 * DAO implementations should be instantiated by DAO factory classes, one
 * per EPPIX module. A {@link DMLFactory} is required to provide the SQL
 * statements that the DAO methods can execute.
 *
 * @author $Author: bhenderson $
 * @version $Revision: 1.10 $
 * @since $jdk$
 */
public class DAOImpl implements DAO {

//	private SimpleDateFormat dtFormat = new SimpleDateFormat("");

  /** The thrower to use if setThrower is not used. */
  static private DAOThrower defaultThrower = DAOThrower
      .getDAOThrower(DAOImpl.class);

  /** Use standard JDBC. */
  private static final int JDBC_STANDARD = 0;

  /** Use Oracle specific JDBC. */
  private static final int JDBC_ORACLE = 1;

  /** internal error code */
  private static final int ERROR_SQL = 0;

  /** internal error code */
  private static final int ERROR_MORE_THAN_ONE_ROW = 1;

  /** internal error code */
  private static final int ERROR_NOT_FOUND = 2;

  /** internal error code */
  private static final int ERROR_VERSION_MISMATCH = 3;

  /** internal error code */
  private static final int ERROR_LOCK_NOT_ACQUIRED = 4;

  /** internal error code */
  private static final int ERROR_DMO_HAS_NO_VERSION = 5;

  /** internal error code */
  private static final int ERROR_CLOB_NOT_INIT = 6;

  /**
   * the default initial capacity for a List returned by the getList methods
   * when the initialCapacity parameter is omitted
   */
  public static final int LIST_CAPACITY_DEFAULT = 100;

  /**
   * the maximum number of elements allowed in a List returned by any
   * of the getList methods
   */
  public static final int LIST_CAPACITY_MAX = 4000;

  /** number of times to attempt to acquire a FOR UPDATE lock */
  public static final int LOCK_MAX_RETRIES = 3;

  /** number of milliseconds to wait before retrying a FOR UPDATE lock */
  public static final int LOCK_RETRY_WAIT = 5000;

  /** Connection context */
  protected ConnectionContext connectionContext;

  /** database connection used by the DAO */
  protected Connection conn;

  /** DMLFactory used to provide SQL statements */
  protected DMLFactory dmlFactory;

  /** internal statement pool */
  protected DAOStmtPool stmtPool = new DAOStmtPool();

  /** Exception handler/logger. */
  protected DAOThrower thrower;

  protected Logger logger;

  /** generated key dispenser */
  	private DMOKeyDispenser keyDispenser;
  /** DMLFactory name used to comment sql statements */
  protected String dmlFactoryName;

  /**
   * Governs whether identifying comments are prefixed to sql before being sent
   * to the database - derived from system property 'eppix.database.comment-sql'.
   */
  private boolean commentSql;

  private int jdbc = JDBC_STANDARD;

  /**
   * Creates a new DAOImpl object.
   *
   * @param connectionContext database connection to use.
   * @param dmlFactory DMLFactory to use as the source of SQL statements.
   */
  public DAOImpl(ConnectionContext connectionContext, DMLFactory dmlFactory)
      throws EPPIXFatalException {

    this.connectionContext = connectionContext;
    this.conn = connectionContext.getConnection();

    // BaH ...
    //    try {
    //      OracleConnection oconn = (OracleConnection)((WrappedConnection) conn).getUnderlyingConnection();
    //      //System.out.println("Setting = " + oconn.getDefaultFixedString());
    //      oconn.setDefaultFixedString(false);
    //    } catch (SQLException e) {
    //      thrower.fatal(e);
    //    }
    // BaH

    this.dmlFactory = dmlFactory;
    this.thrower = defaultThrower;
    this.logger = defaultThrower.getLogger();
    //		this.keyDispenser = DMOKeyDispenser
    //				.getDispenser(dmlFactory.getModuleCode());

    dmlFactoryName = dmlFactory.getClass().getName();

    if (dmlFactoryName.startsWith("com.eppixcomm.eppix.base.")) {
      String moduleName = "";
      int c = dmlFactoryName.indexOf('.', 17);
      if (c >= 0) {
        moduleName = dmlFactoryName.substring(17, c);
      }
      dmlFactoryName = moduleName + "."
          + dmlFactoryName.substring(dmlFactoryName.lastIndexOf('.') + 1);
    }

    commentSql = System.getProperty("eppix.database.comment-sql", "true")
        .equalsIgnoreCase("true");

    String databaseProductName = null;
    try {
      databaseProductName = conn.getMetaData().getDatabaseProductName();
    } catch (SQLException e) {
      thrower.fatal(e);
    }
    if (databaseProductName.equalsIgnoreCase("Oracle")) {
      jdbc = JDBC_ORACLE;
    }
  }

  /**
   * Allows an exception handler/logger other than the default provided by
   * the DAO implentation to be used.
   *
   * @param thrower exception handler/logger.
   */
  public void setThrower(DAOThrower thrower) {
    this.thrower = thrower;
    this.logger = thrower.getLogger();
  }

  /**
   * Closes all of the database resources (prepared statements) allocated to
   * this DAO.
   *
   * @throws EPPIXSeriousException if an SQL error is detected.
   */
  public void close() throws EPPIXSeriousException {
    stmtPool.close();
  }

  /**
   * Closes the database resources (prepared statements) associated with the
   * named DML. Note: there can be more than one if the dmlName refers to a
   * parameterised SQL query.
   *
   * @param dmlName name of the DML in the DMLFactory.
   *
   * @throws EPPIXSeriousException if an SQL error is detected.
   */
  public void close(String dmlName) throws EPPIXSeriousException {
    stmtPool.close();
  }

  /**
   * Retrieves a single {@link DBO} from the database. The class of the DBO
   * is used to consult the {@link DMLFactory} to obtain a {@link DMLTable}
   * definition, that will provide an appropriate SELECT statement to
   * populate the DBO based on its primary key.
   *
   * @param dbo (required) the DBO to be populated for which a table
   *        definition exists in the DMLFactory.
   *
   * @return a populated DBO or null if no data was found.
   *
   * @throws EPPIXSeriousException if any of the required parameters is null;
   *         the DMLFactory is unable to provide a SELECT statement; more
   *         than one row was retrieved; or an SQL error is detected.
   *
   * @see #lock(DBO dbo)
   */
  public DBO get(DBO dbo) throws EPPIXSeriousException {
    try {
      return get("get(DBO)", DML.STMT_SELECT, dbo, null);
    } catch (EPPIXObjectBusyException e) {
      thrower.unexpected(e);
    }

    return null;
  }

  public DBO get(DBO dbo, String tableName) throws EPPIXSeriousException {
    try {
      return get("get(DBO)", DML.STMT_SELECT, dbo, tableName);
    } catch (EPPIXObjectBusyException e) {
      thrower.unexpected(e);
    }

    return null;
  }

  /**
   * The same as {@link #get(DBO dbo)} except a 'FOR UPDATE' lock is placed
   * on the row.
   *
   * @param dbo (required) the DBO to be populated for which a table
   *        definition exists in the DMLFactory.
   *
   * @return a populated DBO or null if no data was found.
   *
   * @throws EPPIXSeriousException if any of the required parameters is null;
   *         the DMLFactory is unable to provide a SELECT statement; more
   *         than one row was retrieved; or an SQL error is detected.
   * @throws EPPIXObjectBusyException if the record in the database can not
   *         be locked for update.
   */
  public DBO lock(DBO dbo) throws EPPIXSeriousException,
      EPPIXObjectBusyException {
    return get("lock(DBO)", DML.STMT_LOCK, dbo, null);
  }

  /**
   * Provides the functionality for both the {@link #get(DBO dbo)} and {@link
   * #lock(DBO dbo)} methods.
   *
   * @param methodDesc short description of the method used when logging the
   *        DML.
   * @param stmtType the type of SELECT statement to be retrieved from the
   *        DMLFactory ({@link DML#STMT_SELECT} or {@link DML#STMT_LOCK}).
   * @param dbo (required) the Data Base Object to be populated.
   *
   * @return a populated DBO or null if no data was found.
   *
   * @throws EPPIXSeriousException if any of the required parameters is null;
   *         the DMLFactory is unable to provide a SELECT statement; more
   *         than one row was retrieved; or an SQL error is detected.
   * @throws EPPIXObjectBusyException if the record in the database can not
   *         be locked for update.
   */
  protected DBO get(String methodDesc, int stmtType, DBO dbo, String tableName)
      throws EPPIXSeriousException, EPPIXObjectBusyException {
    if (dbo == null) {
      thrower.unexpected("Parameter 'dbo' is required.");
    }


    DBO fetchedDBO = null;

    try {
      DMLTable dmlTable = dmlFactory.getTable(dbo);
      PreparedStatement stmt;
      if (dmlTable.isHasPrimaryKey()) {
        stmt = stmtPool.get(dmlTable, stmtType, null, "filterByPrimaryKey",
            tableName);
      } else {
        stmt = stmtPool.get(dmlTable, stmtType, null, "NONE", tableName);
      }

      DAOArgs primaryKey = dbo.primaryKey();
      ResultSet rs = null;

      try {
        primaryKey.bind(stmt, 1);

        int retryCount = 0;
        boolean retry = false;

        do {
          try {
            retry = false;
            rs = stmt.executeQuery();

            if (logger.isDebugEnabled()) {
              if (dmlTable.isHasPrimaryKey()) {
                logger.debug(debugDML(methodDesc, dmlTable, stmtType,
                    "filterByPrimaryKey", "", primaryKey.toString()));
              } else {
                logger.debug(debugDML(methodDesc, dmlTable, stmtType, "NONE",
                    "", null));
              }
            }
          } catch (SQLException e) {
            if ((stmtType == DML.STMT_LOCK) && e.getSQLState().equals("61000")) {
              if ((++retryCount) > LOCK_MAX_RETRIES) {
                thrower.objectBusy(getErrorMessage(ERROR_LOCK_NOT_ACQUIRED,
                    dmlTable, stmtType, "filterByPrimaryKey", "", primaryKey
                        .toString()));
              }

              retry = true;

              try {
                Thread.sleep(LOCK_RETRY_WAIT);
              } catch (InterruptedException ie) {
              }
            } else {
              throw e;
            }
          }
        } while (retry);

        if (rs.next()) {
          fetchedDBO = (DBO) fetchDMO(dbo, rs);

          if (rs.next()) {
            thrower.unexpected(getErrorMessage(ERROR_MORE_THAN_ONE_ROW,
                dmlTable, stmtType, "filterByPrimaryKey", "", primaryKey
                    .toString()));
          }
        }
      } catch (SQLException e) {
        thrower.unexpected(getErrorMessage(e, dmlTable, stmtType,
            "filterByPrimaryKey", "", primaryKey.toString()), e);
      } finally { // close the result set

        try {
          if (rs != null) {
            rs.close();
          }
        } catch (SQLException e) {
          thrower.unexpected(getErrorMessage(e), e);
        }
      }
    } catch (DMLException e) {
      thrower.unexpected(e);
    }

    return fetchedDBO;
  }

  public DMO get(String dmlName, String filterBy, DAOArgs filterArgs)
      throws EPPIXSeriousException {

    return get(dmlName, filterBy, filterArgs, (String) null);
  }

  /**
   * Retrieves a single {@link DMO} from the database as a result of
   * executing a {@linkPlain DMLParamQuery parameterised SQL query} defined
   * in the {@link DMLFactory}.
   *
   * @param dmlName (required) the name of the parameterised query or table
   *        defined in the DMLFactory.
   * @param filterBy (required) name of the filter defined for the query or
   *        table that will be used to select the row in the database.
   * @param filterArgs (required) arguments that satisfy the placeholder(s)
   *        of the filter as defined in the DMLFactory.
   *
   * @return a populated DMO or null if no data was found.
   *
   * @throws EPPIXSeriousException if any of the required parameters is null;
   *         the named DML does not exist in the DMLFactory; the named DML
   *         does not refer to a parameterised query; the DMO class does not
   *         exist or can not be instantiated; the query retrieves more than
   *         one row; or an SQL error is detected
   *
   * @see #lock( String dmlName, String filterBy, DAOArgs filterArgs )
   */
  public DMO get(String dmlName, String filterBy, DAOArgs filterArgs,
      String tableName) throws EPPIXSeriousException {
    try {
      return get("get(param SQL)", DML.STMT_SELECT, dmlName, filterBy,
          filterArgs, null, tableName);
    } catch (EPPIXObjectBusyException e) {
      thrower.unexpected(e);
    }

    return null;
  }

  public DMO lock(String dmlName, String filterBy, DAOArgs filterArgs)
      throws EPPIXSeriousException, EPPIXObjectBusyException {

    return lock(dmlName, filterBy, filterArgs, (String) null);
  }

  /**
   * The same as {@link #get( String dmlName, String filterBy, DAOArgs
   * filterArgs )} except a 'FOR UPDATE' lock is placed on the row.
   *
   * @param dmlName (required) the name of the parameterised query or table
   *        defined in the DMLFactory.
   * @param filterBy (required) name of the filter defined for the query or
   *        table that will be used to select the row in the database.
   * @param filterArgs (required) arguments that satisfy the placeholder(s)
   *        of the filter as defined in the DMLFactory.
   *
   * @return a populated DMO or null if no data was found.
   *
   * @throws EPPIXSeriousException if any of the required parameters is null;
   *         the named DML does not exist in the DMLFactory; the named DML
   *         does not refer to a parameterised query; the DMO class does not
   *         exist or can not be instantiated; the query retrieves more than
   *         one row; or an SQL error is detected.
   * @throws EPPIXObjectBusyException if the record in the database can not
   *         be locked for update.
   */
  public DMO lock(String dmlName, String filterBy, DAOArgs filterArgs,
      String tableName) throws EPPIXSeriousException, EPPIXObjectBusyException {

    return get("lock(param SQL)", DML.STMT_LOCK, dmlName, filterBy, filterArgs,
        null, tableName);
  }

  /**
   * Retrieves a single {@link DMO} from the database as a result of
   * executing a {@linkPlain DMLParamQuery parameterised SQL query} defined
   * in the {@link DMLFactory}.
   *
   * @param dmlName (required) the name of the parameterised query or table
   *        defined in the DMLFactory.
   * @param filterBy (required) name of the filter defined for the query or
   *        table that will be used to select the row in the database.
   * @param filterArgs (required) arguments that satisfy the placeholder(s)
   *        of the filter as defined in the DMLFactory.
   * @param dmo the DMO to be populated or null if a new DMO is to be
   *        instantiated. Note: the class of the passed DMO is not checked
   *        against that defined for the parameterised query, in the
   *        DMLFactory, as this allows for overiding. However, care must be
   *        taken to ensure that the DMO fields match the columns in the
   *        SELECT list, otherwise an SQL error will occur.
   *
   * @return a populated DMO or null if no data was found.
   *
   * @throws EPPIXSeriousException if any of the required parameters is null;
   *         the named DML does not exist in the DMLFactory; the named DML
   *         does not refer to a parameterised query; the DMO class does not
   *         exist or can not be instantiated; the query retrieves more than
   *         one row; or an SQL error is detected.
   *
   * @see #lock( String dmlName, String filterBy, DAOArgs filterArgs, DMO dmo
   *      )
   */
  public DMO get(String dmlName, String filterBy, DAOArgs filterArgs, DMO dmo)
      throws EPPIXSeriousException {

    try {
      return get("get(param SQL)", DML.STMT_SELECT, dmlName, filterBy,
          filterArgs, dmo);
    } catch (EPPIXObjectBusyException e) {
      thrower.unexpected(e);
    }

    return null;
  }

  /**
   * The same as {@link #get( String dmlName, String filterBy, DAOArgs
   * filterArgs, DMO dmo )} except a 'FOR UPDATE' lock is placed on the row.
   *
   * @param dmlName (required) the name of the parameterised query or table
   *        defined in the DMLFactory.
   * @param filterBy (required) name of the filter defined for the query or
   *        table that will be used to select the row in the database.
   * @param filterArgs (required) arguments that satisfy the placeholder(s)
   *        of the filter as defined in the DMLFactory.
   * @param dmo the DMO to be populated or null if a new DMO is to be
   *        instantiated. Note: the class of the passed DMO is not checked
   *        against that defined for the parameterised query, in the
   *        DMLFactory, as this allows for overiding. However, care must be
   *        taken to ensure that the DMO fields match the columns in the
   *        SELECT list, otherwise an SQL error will occur.
   *
   * @return a populated DMO or null if no data was found.
   *
   * @throws EPPIXSeriousException if any of the required parameters is null;
   *         the named DML does not exist in the DMLFactory; the named DML
   *         does not refer to a parameterised query; the DMO class does not
   *         exist or can not be instantiated; the query retrieves more than
   *         one row; or an SQL error is detected.
   * @throws EPPIXObjectBusyException if the record in the database can not
   *         be locked for update.
   */
  public DMO lock(String dmlName, String filterBy, DAOArgs filterArgs, DMO dmo)
      throws EPPIXSeriousException, EPPIXObjectBusyException {
    return get("lock(param SQL)", DML.STMT_LOCK, dmlName, filterBy, filterArgs,
        dmo);
  }

  public DMO lock(String dmlName, String filterBy, DAOArgs filterArgs, DMO dmo,
      String tableName) throws EPPIXSeriousException, EPPIXObjectBusyException {
    return get("lock(param SQL)", DML.STMT_LOCK, dmlName, filterBy, filterArgs,
        dmo, tableName);
  }

  protected DMO get(String methodDesc, int stmtType, String dmlName,
      String filterBy, DAOArgs filterArgs, DMO dmo)
      throws EPPIXSeriousException, EPPIXObjectBusyException {
    return get(methodDesc, stmtType, dmlName, filterBy, filterArgs, dmo, null);
  }

  /**
   * Provides the functionality for both the {@link #get( String dmlName,
   * String filterBy, DAOArgs filterArgs, DMO dmo )} and {@link #lock(
   * String dmlName, String filterBy, DAOArgs filterArgs, DMO dmo )} methods
   * by retrieving a single {@link DMO} from the database as a result of
   * executing a {@linkPlain DMLParamQuery parameterised SQL query} defined
   * in the {@link DMLFactory}.
   *
   * @param methodDesc short description of the method used when logging the
   *        DML.
   * @param stmtType the type of SELECT statement to be retrieved from the
   *        DMLFactory ({@link DML#STMT_SELECT} or {@link DML#STMT_LOCK}).
   * @param dmlName (required) the name of the parameterised query or table
   *        defined in the DMLFactory.
   * @param filterBy (required) name of the filter defined for the query or
   *        table that will be used to select the row in the database.
   * @param filterArgs (required) arguments that satisfy the placeholder(s)
   *        of the filter as defined in the DMLFactory.
   * @param dmo the DMO to be populated or null if a new DMO is to be
   *        instantiated. Note: the class of the passed DMO is not checked
   *        against that defined for the parameterised query, in the
   *        DMLFactory, as this allows for overiding. However, care must be
   *        taken to ensure that the DMO fields match the columns in the
   *        SELECT list, otherwise an SQL error will occur.
   *
   * @return a populated DMO or null if no data was found.
   *
   * @throws EPPIXSeriousException if any of the required parameters is null;
   *         the named DML does not exist in the DMLFactory; the named DML
   *         does not refer to a parameterised query; the DMO class does not
   *         exist or can not be instantiated; the query retrieves more than
   *         one row; or an SQL error is detected.
   * @throws EPPIXObjectBusyException if the record in the database can not
   *         be locked for update.
   */
  protected DMO get(String methodDesc, int stmtType, String dmlName,
      String filterBy, DAOArgs filterArgs, DMO dmo, String tableName)
      throws EPPIXSeriousException, EPPIXObjectBusyException {

    if (isNull(dmlName)) {
      thrower.unexpected("Parameter 'dmlName' is required.");
    }

    if (isNull(filterBy)) {
      thrower.unexpected("Parameter 'filterBy' is required.");
    }

    //    if (isNull(filterArgs)) {
    //      thrower.unexpected("Parameter 'filterArgs' is required.");
    //    }

    DMO fetchedDMO = null;

    try {
      DMLParamQuery dmlQuery = dmlFactory.getParamQuery(dmlName);

      /*if ( dmlQuery.isMultiRow( filterBy ) ) {
       thrower.unexpected( "Filter '" + filterBy
       + "' is defined as returning more than one row." );
       }*/
      Class dmoClass = (dmo == null) ? dmlQuery.getDMOClass() : null;

      PreparedStatement stmt = stmtPool.get(dmlQuery, stmtType, null, filterBy,
          tableName);

      ResultSet rs = null;

      try {
        filterArgs.bind(stmt, 1);

        int retryCount = 0;
        boolean retry = false;

        do {

          try {
            retry = false;
            rs = stmt.executeQuery();

            if (logger.isDebugEnabled()) {
              logger.debug(debugDML(methodDesc, dmlQuery, stmtType, filterBy,
                  "", toString(filterArgs)));
            }

          } catch (SQLException e) {

            if ((stmtType == DML.STMT_LOCK) && e.getSQLState().equals("61000")) {
              if ((++retryCount) > LOCK_MAX_RETRIES) {
                thrower.objectBusy(getErrorMessage(ERROR_LOCK_NOT_ACQUIRED,
                    dmlQuery, stmtType, filterBy, "", toString(filterArgs)));
              }

              retry = true;

              try {
                Thread.sleep(LOCK_RETRY_WAIT);
              } catch (InterruptedException ie) {
              }
            } else {
            	if(logger.isDebugEnabled()){
            		logger.debug("ERROR IN GETTING RECORDS: EXCEPTION: " + e.getMessage());
            		logger.debug("ERROR IN GETTING RECORDS: EXCEPTION: SQL ERROR CODE: " + e.getErrorCode());
            		logger.debug("ERROR IN GETTING RECORDS: EXCEPTION: SQLSTATE: " + e.getSQLState());
            	}

            	if ((++retryCount) > LOCK_MAX_RETRIES) {
                  throw e;
                }

                retry = true;

	              try {
	                Thread.sleep(LOCK_RETRY_WAIT);
	              } catch (InterruptedException ie) {
	              }
            }
          }
        } while (retry);

        if (rs.next()) {
          fetchedDMO = (dmo == null) ? fetchDMO(dmoClass, rs) : fetchDMO(dmo,
              rs);

          if (rs.next()) {
            thrower.unexpected(getErrorMessage(ERROR_MORE_THAN_ONE_ROW,
                dmlQuery, stmtType, filterBy, "", toString(filterArgs)));
          }
        }
      } catch (SQLException e) {

        thrower.unexpected(getErrorMessage(e, dmlQuery, stmtType, filterBy, "",
            toString(filterArgs)), e);

      } finally { // close the result set

        try {
          if (rs != null) {
            rs.close();
          }
        } catch (SQLException e) {
          thrower.unexpected(getErrorMessage(e), e);
        }
      }
    } catch (DMLException e) {
      thrower.unexpected(e);
    }

    return fetchedDMO;
  }

  /**
   * Retrieves a single {@link DMO} from the database as a result of
   * executing a {@linkPlain DMLStaticQuery static SQL query} defined in the
   * {@link DMLFactory}.
   *
   * @param dmlName (required) the name of the static SQL query defined in
   *        the DMLFactory.
   * @param stmtArgs arguments that satisfy the placeholder(s) of the SELECT
   *        statement defined in the DMLFactory.
   *
   * @return a populated DMO or null if no data was found.
   *
   * @throws EPPIXSeriousException if any of the required parameters is null;
   *         the named DML does not exist in the DMLFactory; the named DML
   *         does not refer to a parameterised SQL query; the DMO class does
   *         not exist or can not be instantiated; the query retrieves more
   *         than one row; or an SQL error is detected.
   */
  public DMO get(String dmlName, DAOArgs stmtArgs) throws EPPIXSeriousException {
    return get(dmlName, stmtArgs, null);
  }

  public DMO get(String dmlName, DAOArgs stmtArgs, DMO dmo)
      throws EPPIXSeriousException {
    return get(dmlName, stmtArgs, dmo, null);
  }

  /**
   * Retrieves a single {@link DMO} from the database as a result of
   * executing a {@linkPlain DMLStaticQuery static SQL query} defined in the
   * {@link DMLFactory}.
   *
   * @param dmlName (required) the name of the static SQL query defined in
   *        the DMLFactory.
   * @param stmtArgs arguments that satisfy the placeholder(s) of the SELECT
   *        statement defined in the DMLFactory.
   * @param dmo the DMO to be populated or null if a new DMO is to be
   *        instantiated. Note: the class of the passed DMO is not checked
   *        against that defined for the static SQL query, in the
   *        DMLFactory, as this allows for overiding. However, care must be
   *        taken to ensure that the DMO fields match the columns in the
   *        SELECT list, otherwise an SQL error will occur.
   *
   * @return a populated DMO or null if no data was found.
   *
   * @throws EPPIXSeriousException if any of the required parameters is null;
   *         the named DML does not exist in the DMLFactory; the named DML
   *         does not refer to a parameterised SQL query; the DMO class does
   *         not exist or can not be instantiated; the query retrieves more
   *         than one row; or an SQL error is detected.
   */
  public DMO get(String dmlName, DAOArgs stmtArgs, DMO dmo, String tableName)
      throws EPPIXSeriousException {
    final String methodDesc = "get(static SQL)";

    if (isNull(dmlName)) {
      thrower.unexpected("Parameter 'dmlName' is required.");
    }

    if(logger.isDebugEnabled()){
    	logger.debug("DML NAME: " + dmlName);
    }

    DMO fetchedDMO = null;

    try {
      DMLStaticQuery dmlQuery = dmlFactory.getStaticQuery(dmlName);

      /*if ( dmlQuery.isMultiRow() ) {
       thrower.unexpected( "Query '" + dmlName
       + "' is defined as returning more than one row." );
       }*/
      Class dmoClass = (dmo == null) ? dmlQuery.getDMOClass() : null;

      PreparedStatement stmt = stmtPool.get(dmlQuery, DML.STMT_SELECT, null,
          tableName);

      ResultSet rs = null;

      try {
        if (!isNull(stmtArgs)) {
          stmtArgs.bind(stmt, 1);
        }
        rs = stmt.executeQuery();

        if (logger.isDebugEnabled()) {

          logger.debug(debugDML(methodDesc, dmlQuery, DML.STMT_SELECT, "", "",
              toString(stmtArgs)));
        }

        if (rs.next()) {
//        	System.out.println(rs.toString());
          fetchedDMO = (dmo == null) ? fetchDMO(dmoClass, rs) : fetchDMO(dmo, rs);

          if (rs.next()) {
            thrower.unexpected(getErrorMessage(ERROR_MORE_THAN_ONE_ROW,
                dmlQuery, DML.STMT_SELECT, "", "", toString(stmtArgs)));
          }
        }
      } catch (SQLException e) {
    	  e.printStackTrace();

        thrower.unexpected(getErrorMessage(e, dmlQuery, DML.STMT_SELECT, "",
            "", toString(stmtArgs)), e);

      } finally { // close the result set

        try {
          if (rs != null) {
            rs.close();
          }
        } catch (SQLException e) {
          thrower.unexpected(getErrorMessage(e), e);
        }
      }
    } catch (DMLException e) {
      thrower.unexpected(e);
    }

    return fetchedDMO;
  }

  /**
   * Retrieves a single {@link DMO} from the database as a result of
   * executing a {@linkPlain DMLDynamicQuery dynamic SQL query} defined in
   * the {@link DMLFactory}.
   *
   * @param dmlName (required) the name of the dynamic SQL query defined in
   *        the DMLFactory.
   * @param args (required) string arguments that are passed to the dynamic
   *        query class (DMLDynamicQuery), to enable it to compose an
   *        appropriate SQL SELECT statament.
   *
   * @return a populated DMO or null if no data was found.
   *
   * @throws EPPIXSeriousException any of the required parameters is null;
   *         the named DML does not exist in the DMLFactory; the named DML
   *         does not refer to a dynamic SQL query; the DMO class does not
   *         exist or can not be instantiated; the query retrieves more than
   *         one row; or an SQL error is detected.
   */
  public DMO get(String dmlName, String[] args) throws EPPIXSeriousException {
    return get(dmlName, args, null);
  }

  /**
   * Retrieves a single {@link DMO} from the database as a result of
   * executing a {@linkPlain DMLDynamicQuery dynamic SQL query} defined in
   * the {@link DMLFactory}.
   *
   * @param dmlName (required) the name of the dynamic SQL query.
   * @param args (required) string arguments that are passed to the dynamic
   *        query class (DMLDynamicQuery), to enable it to compose an
   *        appropriate SQL SELECT statament.
   * @param dmo the DMO to be populated or null if a new DMO is to be
   *        instantiated. Note: the class of the passed DMO is not checked
   *        against that defined for the dynamic SQL query, in the
   *        DMLFactory, as this allows for overiding. However, care must be
   *        taken to ensure that the DMO fields match the columns in the
   *        SELECT list, otherwise an SQL error will occur.
   *
   * @return a populated DMO or null if no data was found.
   *
   * @throws EPPIXSeriousException if any of the required parameters is null;
   *         the named DML does not exist in the DMLFactory; the named DML
   *         does not refer to a dynamic SQL query; the DMO class does not
   *         exist or can not be instantiated; the query retrieves more than
   *         one row; or an SQL error is detected.
   */
  public DMO get(String dmlName, String[] args, DMO dmo)
      throws EPPIXSeriousException {
    final String methodDesc = "get(dynamic SQL)";

    if (isNull(dmlName)) {
      thrower.unexpected("Parameter 'dmlName' is required.");
    }

    if (isNull(args)) {
      thrower.unexpected("Parameter 'args' is required.");
    }

    DMO fetchedDMO = null;

    try {
      DMLDynamicQuery dmlQuery = dmlFactory.getDynamicQuery(dmlName);

      String stmtString = dmlQuery.getStmtString(args);
      DAOArgs stmtArgs = dmlQuery.getStmtArgs(args);

      Class dmoClass = (dmo == null) ? dmlQuery.getDMOClass() : null;

      PreparedStatement stmt = null;
      ResultSet rs = null;

      try {
        stmt = conn.prepareStatement(commentSql(dmlName, stmtString));

        if (!isNull(stmtArgs)) {
          stmtArgs.bind(stmt, 1);
        }

        rs = stmt.executeQuery();

        if (logger.isDebugEnabled()) {

          logger.debug(debugDML(methodDesc, dmlQuery, stmtString,
              toString(stmtArgs)));
        }

        if (rs.next()) {
          fetchedDMO = (dmo == null) ? fetchDMO(dmoClass, rs) : fetchDMO(dmo,
              rs);

          if (rs.next()) {
            thrower.unexpected(getErrorMessage(ERROR_MORE_THAN_ONE_ROW,
                dmlQuery, stmtString, toString(stmtArgs)));
          }
        }

      } catch (SQLException e) {

        thrower.unexpected(getErrorMessage(e, dmlQuery, stmtString,
            toString(stmtArgs)), e);

      } finally { // close the result set and statement

        try {
          if (rs != null) {
            rs.close();
          }

          if (stmt != null) {
            stmt.close();
          }
        } catch (SQLException e) {
          thrower.unexpected(getErrorMessage(e), e);
        }
      }
    } catch (DMLException e) {
      thrower.unexpected(e);
    }

    return fetchedDMO;
  }

  public boolean exists(DAOParamQueryArgs queryArgs)
      throws EPPIXSeriousException {
    return exists(queryArgs, null);
  }

  /**
   * Indicates whether the {@linkPlain
   * com.eppixcomm.eppix.common.dml.DMLParamQuery parameterised SQL query}
   * returns any rows.
   *
   * @param queryArgs parameterised query arguments object.
   *
   * @return true if the query returns one or more rows, false if not.
   *
   * @throws EPPIXSeriousException if a fatal error occurs.
   */
  public boolean exists(DAOParamQueryArgs queryArgs, String tableName)
      throws EPPIXSeriousException {

    thrower.ifParameterMissing("queryArgs", queryArgs);

    return exists(queryArgs.getDMLName(), queryArgs.getFilterBy(), queryArgs,
        tableName);
  }

  public boolean exists(DBO dbo) throws EPPIXSeriousException {
    return exists(dbo, null);
  }

  /**
   * Indicates whether the {@link DBO} exists in the database. The class of
   * the DBO is used to consult the {@link DMLFactory} to obtain a {@link
   * DMLTable} definition that will provide an appropriate SELECT statement
   * to ascertain whether the DBO exists based on its primary key.
   *
   * @param dbo a DBO for which a table definition exists in the DMLFactory.
   *
   * @return true if the DBO exists in the database, false if not.
   *
   * @throws EPPIXSeriousException if any of the required parameters is null;
   *         the DMLFactory is unable to provide a SELECT statement; or an
   *         SQL error is detected.
   */
  public boolean exists(DBO dbo, String tableName) throws EPPIXSeriousException {
    final String methodDesc = "exists(DBO)";

    if (dbo == null) {
      thrower.unexpected("Parameter 'dbo' is required.");
    }

    boolean exists = false;

    try {
      DMLTable dmlTable = dmlFactory.getTable(dbo);
      PreparedStatement stmt = stmtPool.get(dmlTable, DML.STMT_EXISTS, null,
          "filterByPrimaryKey", tableName);

      DAOArgs primaryKey = dbo.primaryKey();

      ResultSet rs = null;

      try {
        primaryKey.bind(stmt, 1);
        rs = stmt.executeQuery();

        if (logger.isDebugEnabled()) {
          logger.debug(debugDML(methodDesc, dmlTable, DML.STMT_EXISTS,
              "filterByPrimaryKey", "", primaryKey.toString()));
        }

        exists = rs.next();
      } catch (SQLException e) {
        thrower.unexpected(getErrorMessage(e, dmlTable, DML.STMT_EXISTS,
            "filterByPrimaryKey", "", primaryKey.toString()), e);
      } finally { // close the result set

        try {
          if (rs != null) {
            rs.close();
          }
        } catch (SQLException e) {
          thrower.unexpected(getErrorMessage(e), e);
        }
      }
    } catch (DMLException e) {
      thrower.unexpected(e);
    }

    return exists;
  }

  public boolean exists(String dmlName, String filterBy, DAOArgs filterArgs)
      throws EPPIXSeriousException {
    return exists(dmlName, filterBy, filterArgs, null);
  }

  /**
   * Indicates whether the {@linkPlain DMLParamQuery parameterised SQL query}
   * returns any rows.
   *
   * @param dmlName (required) the name of the parameterised query or table
   *        defined in the DMLFactory.
   * @param filterBy name of the filter defined for the query or table that
   *        will be used to select the row(s) in the database.
   * @param filterArgs arguments that satisfy the placeholder(s) of the
   *        filter as defined in the DMLFactory.
   *
   * @return true if the query returns one or more rows, false if not.
   *
   * @throws EPPIXSeriousException if any of the required parameters is null;
   *         the named DML does not exist in the DMLFactory; the named DML
   *         does not refer to a parameterised query; or an SQL error is
   *         detected.
   */
  public boolean exists(String dmlName, String filterBy, DAOArgs filterArgs,
      String tableName) throws EPPIXSeriousException {
    final String methodDesc = "exists(param SQL)";

    if (isNull(dmlName)) {
      thrower.unexpected("Parameter 'dmlName' is required.");
    }

    boolean exists = false;

    try {
      DMLParamQuery dmlQuery = dmlFactory.getParamQuery(dmlName);
      PreparedStatement stmt = stmtPool.get(dmlQuery, DML.STMT_EXISTS, null,
          filterBy, tableName);

      ResultSet rs = null;

      try {
        if (!isNull(filterArgs)) {
          filterArgs.bind(stmt, 1);
        }

        rs = stmt.executeQuery();

        if (logger.isDebugEnabled()) {

          logger.debug(debugDML(methodDesc, dmlQuery, DML.STMT_EXISTS,
              filterBy, "", toString(filterArgs)));
        }

        exists = rs.next();

      } catch (SQLException e) {

        thrower.unexpected(getErrorMessage(e, dmlQuery, DML.STMT_EXISTS,
            filterBy, "", toString(filterArgs)), e);

      } finally { // close the result set

        try {
          if (rs != null) {
            rs.close();
          }
        } catch (SQLException e) {
          thrower.unexpected(getErrorMessage(e), e);
        }
      }
    } catch (DMLException e) {
      thrower.unexpected(e);
    }

    return exists;
  }

  public int count(String dmlName, String filterBy, DAOArgs filterArgs)
      throws EPPIXSeriousException {
    return count(dmlName, filterBy, filterArgs, null);
  }

  /**
   * Counts the number of rows retrieved by the {@linkPlain DMLParamQuery
   * parameterised SQL query}.
   *
   * @param dmlName (required) the name of the parameterised query or table
   *        defined in the DMLFactory.
   * @param filterBy name of the filter defined for the query or table that
   *        will be used to select the row(s) in the database.
   * @param filterArgs arguments that satisfy the placeholder(s) of the
   *        filter as defined in the DMLFactory.
   *
   * @return the number of rows retrieved by the query.
   *
   * @throws EPPIXSeriousException if any of the required parameters is null;
   *         the named DML does not exist in the DMLFactory; the named DML
   *         does not refer to a parameterised query; or an SQL error is
   *         detected.
   */
  public int count(String dmlName, String filterBy, DAOArgs filterArgs,
      String tableName) throws EPPIXSeriousException {
    final String methodDesc = "count(param SQL)";

    if (isNull(dmlName)) {
      thrower.unexpected("Parameter 'dmlName' is required.");
    }

    int count = 0;

    try {
      DMLParamQuery dmlQuery = dmlFactory.getParamQuery(dmlName);
      PreparedStatement stmt = stmtPool.get(dmlQuery, DML.STMT_COUNT, null,
          filterBy, tableName);

      ResultSet rs = null;

      try {
        if (!isNull(filterArgs)) {
          filterArgs.bind(stmt, 1);
        }

        rs = stmt.executeQuery();

        if (logger.isDebugEnabled()) {
          logger.debug(debugDML(methodDesc, dmlQuery, DML.STMT_COUNT, filterBy,
              "", (isNull(filterArgs) ? "" : filterArgs.toString())));
        }

        if (rs.next()) {
          count = rs.getInt(1);
        }
      } catch (SQLException e) {
        thrower
            .unexpected(getErrorMessage(e, dmlQuery, DML.STMT_COUNT, filterBy,
                "", (isNull(filterArgs) ? "" : filterArgs.toString())), e);
      } finally { // close the result set

        try {
          if (rs != null) {
            rs.close();
          }
        } catch (SQLException e) {
          thrower.unexpected(getErrorMessage(e), e);
        }
      }
    } catch (DMLException e) {
      thrower.unexpected(e);
    }

    return count;
  }

  public Object max(String dmlName, String filterBy, DAOArgs filterArgs,
      int maxField) throws EPPIXSeriousException {
    return max(dmlName, filterBy, filterArgs, maxField, null);
  }

  public Object max(String dmlName, String filterBy, DAOArgs filterArgs,
      int maxField, String tableName) throws EPPIXSeriousException {
    final String methodDesc = "max(param SQL)";

    if (isNull(dmlName)) {
      thrower.unexpected("Parameter 'dmlName' is required.");
    }

    Object max = null;

    try {
      DMLParamQuery dmlQuery = dmlFactory.getParamQuery(dmlName);
      PreparedStatement stmt = stmtPool.get(dmlQuery, DML.STMT_MAX, null,
          filterBy, null, tableName, maxField, null);

      ResultSet rs = null;

      try {
        if (!isNull(filterArgs)) {
          filterArgs.bind(stmt, 1);
        }

        rs = stmt.executeQuery();

        if (logger.isDebugEnabled()) {
          logger.debug(debugDML(methodDesc, dmlQuery, DML.STMT_MAX, filterBy,
              "", (isNull(filterArgs) ? "" : filterArgs.toString())));
        }

        if (rs.next()) {
          max = rs.getObject(1);
        }
      } catch (SQLException e) {
        thrower.unexpected(getErrorMessage(e, dmlQuery, DML.STMT_MAX, filterBy,
            "", (isNull(filterArgs) ? "" : filterArgs.toString())), e);
      } finally { // close the result set

        try {
          if (rs != null) {
            rs.close();
          }
        } catch (SQLException e) {
          thrower.unexpected(getErrorMessage(e), e);
        }
      }
    } catch (DMLException e) {
      thrower.unexpected(e);
    }

    return max;
  }

  public Object min(String dmlName, String filterBy, DAOArgs filterArgs,
      int minField) throws EPPIXSeriousException {
    return min(dmlName, filterBy, filterArgs, minField, null);
  }

  public Object min(String dmlName, String filterBy, DAOArgs filterArgs,
      int minField, String tableName) throws EPPIXSeriousException {
    final String methodDesc = "min(param SQL)";

    if (isNull(dmlName)) {
      thrower.unexpected("Parameter 'dmlName' is required.");
    }

    Object min = null;

    try {
      DMLParamQuery dmlQuery = dmlFactory.getParamQuery(dmlName);
      PreparedStatement stmt = stmtPool.get(dmlQuery, DML.STMT_MIN, null, null,
          filterBy, tableName, minField, null);

      ResultSet rs = null;

      try {
        if (!isNull(filterArgs)) {
          filterArgs.bind(stmt, 1);
        }

        rs = stmt.executeQuery();

        if (logger.isDebugEnabled()) {
          logger.debug(debugDML(methodDesc, dmlQuery, DML.STMT_MIN, filterBy,
              "", (isNull(filterArgs) ? "" : filterArgs.toString())));
        }

        if (rs.next()) {
          min = rs.getObject(1);
        }
      } catch (SQLException e) {
        thrower.unexpected(getErrorMessage(e, dmlQuery, DML.STMT_MIN, filterBy,
            "", (isNull(filterArgs) ? "" : filterArgs.toString())), e);
      } finally { // close the result set

        try {
          if (rs != null) {
            rs.close();
          }
        } catch (SQLException e) {
          thrower.unexpected(getErrorMessage(e), e);
        }
      }
    } catch (DMLException e) {
      thrower.unexpected(e);
    }

    return min;
  }

  public List getList(DAOParamQueryArgs queryArgs) throws EPPIXSeriousException {
    return getList(queryArgs, null);
  }

  /**
   * Retrieves a List of {@link DMO DMOs} as a result of executing a
   * {@linkPlain DMLParamQuery parameterised SQL query}. A default value for
   * the initialCapacity of the List is assumed ({@link
   * #LIST_CAPACITY_DEFAULT}).
   *
   * @param queryArgs query arguments object.
   *
   * @return List of DMOs - empty when no rows are found.
   *
   * @throws EPPIXSeriousException if any of the required parameters is null;
   *         the List overflows LIST_CAPACITY_MAX; the named DML does
   *         not exist in the DMLFactory; the named DML does not refer to a
   *         parameterised SQL query; the DMLFactory is unable to provide a
   *         SELECT statement for the specified filterBy or orderBy; the DMO
   *         class does not exist or can not be instantiated; or an SQL
   *         error is detected.
   */
  public List getList(DAOParamQueryArgs queryArgs, String tableName)
      throws EPPIXSeriousException {

    thrower.ifParameterMissing("queryArgs", queryArgs);

    return getList(queryArgs.getDMLName(), queryArgs.getFilterBy(), queryArgs,
        queryArgs.getOrderBy(), LIST_CAPACITY_DEFAULT, tableName);
  }

  /**
   * Retrieves a List of {@link DMO DMOs} as a result of executing a
   * {@linkPlain DMLStaticQuery static SQL query}. A default value for the
   * initialCapacity of the List is assumed ({@link #LIST_CAPACITY_DEFAULT}).
   *
   * @param dmlName (required) the name of the static SQL query defined in
   *        the DMLFactory.
   * @param stmtArgs arguments that satisfy the placeholder(s) of the SELECT
   *        statement defined in the DMLFactory.
   *
   * @return List of DMOs - empty when no rows are found.
   *
   * @throws EPPIXSeriousException if any of the required parameters is null;
   *         the List overflows LIST_CAPACITY_MAX; the named DML does
   *         not exist in the DMLFactory; the named DML does not refer to a
   *         static SQL query; the DMO class does not exist or can not be
   *         instantiated; or an SQL error is detected.
   */
  public List getList(String dmlName, DAOArgs stmtArgs)
      throws EPPIXSeriousException {
    return getList(dmlName, stmtArgs, LIST_CAPACITY_DEFAULT);
  }

  public List getList(String dmlName, DAOArgs stmtArgs, String tableName)
      throws EPPIXSeriousException {
    return getList(dmlName, stmtArgs, LIST_CAPACITY_DEFAULT, tableName);
  }

  public List getList(String dmlName, DAOArgs stmtArgs, int initialCapacity)
      throws EPPIXSeriousException {
    return getList(dmlName, stmtArgs, initialCapacity, null);
  }

  /**
   * Retrieves a List of {@link DMO DMOs} as a result of executing a
   * {@linkPlain DMLStaticQuery static SQL query}.
   *
   * @param dmlName (required) the name of the static SQL query defined in
   *        the DMLFactory.
   * @param stmtArgs arguments that satisfy the placeholder(s) of the SELECT
   *        statement defined in the DMLFactory.
   * @param initialCapacity the initial capacity of the List to be
   *        returned.
   *
   * @return List of DMOs - empty when no rows are found.
   *
   * @throws EPPIXSeriousException if any of the required parameters is null;
   *         initialCapacity is less than zero or greater than
   *         LIST_CAPACITY_MAX; the List overflows LIST_CAPACITY_MAX;
   *         the named DML does not exist in the DMLFactory; the named DML
   *         does not refer to a static SQL query; the DMO class does not
   *         exist or can not be instantiated; or an SQL error is detected.
   */
  public List getList(String dmlName, DAOArgs stmtArgs, int initialCapacity,
      String tableName) throws EPPIXSeriousException {

  	if(logger.isDebugEnabled()){
  		logger.debug("getList(String dmlName, DAOArgs stmtArgs, int initialCapacity, String tableName)+ \n" +
  				"DML Name: " + dmlName + " STATEMENT ARGUMENTS CONTAINS: " + stmtArgs.toString() + " Initails Capacity: " + initialCapacity + " Table Name: " + tableName);
	}

    final String methodDesc = "getList(static SQL)";

    thrower.ifParameterMissing("dmlName", dmlName);

    if ((initialCapacity < 0) || (initialCapacity > LIST_CAPACITY_MAX)) {
      thrower.unexpected("Parameter 'initialCapacity' must be between 0 and "
          + LIST_CAPACITY_MAX + ".");
    }

    List list = null;

    try {
      DMLStaticQuery dmlQuery = dmlFactory.getStaticQuery(dmlName);
      Class dmoClass = dmlQuery.getDMOClass();

      if(logger.isDebugEnabled()){
      		logger.debug("AFTER DMLQUERY RETRIEVED: " + stmtArgs.toString());
      }

      PreparedStatement stmt = stmtPool.get(dmlQuery, DML.STMT_SELECT, null,
          tableName);

      if(logger.isDebugEnabled()){
    		logger.debug("AFTER STATEMENT CREATED: " + stmtArgs.toString());
      }

      ResultSet rs = null;

      try {
          if(logger.isDebugEnabled()){
        		logger.debug("STEP ONE IN SECOND TRY: " + stmtArgs.toString());
          }

        if (!isNull(stmtArgs)) {
          	if(logger.isDebugEnabled()){
          		logger.debug("1 ARGUMENT BEFORE BINDING: " + stmtArgs.toString());
          	}
          stmtArgs.bind(stmt, 1);
        }

      	if(logger.isDebugEnabled()){
      		logger.debug("2 ARGUMENT BEFORE BINDING: " + stmtArgs.toString());
      	}

        rs = stmt.executeQuery();

        if (logger.isDebugEnabled()) {
          logger.debug(debugDML(methodDesc, dmlQuery, DML.STMT_SELECT, "", "",
              ((isNull(stmtArgs)) ? "" : stmtArgs.toString())));
        }

        list = new ArrayList(initialCapacity);

        int count = 0;

        while (rs.next()) {
          if ((++count) > LIST_CAPACITY_MAX) {
            thrower.unexpected("List capacity limit of " + LIST_CAPACITY_MAX
                + " has been exceeded.");
          }

          list.add(fetchDMO(dmoClass, rs));
        }
      } catch (SQLException e) {

        	if(logger.isDebugEnabled()){
          		logger.debug("sql exception: " + e.toString());
          	}
        	e.printStackTrace();

        thrower.unexpected(getErrorMessage(e, dmlQuery, DML.STMT_SELECT, "",
            "", ((isNull(stmtArgs)) ? "" : stmtArgs.toString())), e);

      } finally { // close the result set

        try {
          if (rs != null) {
            rs.close();
          }
        } catch (SQLException e) {
          thrower.unexpected(getErrorMessage(e), e);
        }
      }

    } catch (DMLException e) {
    	e.printStackTrace();
      thrower.unexpected(e);
    }

    return list;
  }

  public List getList(String dmlName, String filterBy, DAOArgs filterArgs,
      String orderBy) throws EPPIXSeriousException {

    return getList(dmlName, filterBy, filterArgs, orderBy, null);
  }

  /**
   * Retrieves a List of {@link DMO DMOs} as a result of executing a
   * {@linkPlain DMLParamQuery parameterised SQL query}. A default value for the
   * initialCapacity of the List is assumed.
   *
   * @param dmlName (required) the name of the parameterised query or table
   *        defined in the DMLFactory.
   * @param filterBy name of the filter defined for the query or table that
   *        will be used to select the row in the database. null = all rows.
   * @param filterArgs arguments that satisfy the placeholder(s) of the
   *        filter as defined in the DMLFactory.
   * @param orderBy name of the sort order, as defined in the DMLFactory, to
   *        be applied to the result. null = order not defined.
   *
   * @return List of DMOs - empty when no rows are found.
   *
   * @throws EPPIXSeriousException if any of the required parameters is null;
   *         the List overflows ARRAY_CAPACITY_MAX; the named DML does
   *         not exist in the DMLFactory; the named DML does not refer to a
   *         parameterised SQL query; the DMLFactory is unable to provide a
   *         SELECT statement for the specified filterBy or orderBy; the DMO
   *         class does not exist or can not be instantiated; or an SQL
   *         error is detected.
   */
  public List getList(String dmlName, String filterBy, DAOArgs filterArgs,
      String orderBy, String tableName) throws EPPIXSeriousException {

    return getList(dmlName, filterBy, filterArgs, orderBy,
        LIST_CAPACITY_DEFAULT, tableName);
  }

  public List getList(String dmlName, String filterBy, DAOArgs filterArgs,
      String orderBy, int initialCapacity) throws EPPIXSeriousException {
    return getList(dmlName, filterBy, filterArgs, orderBy, initialCapacity,
        null);
  }

  /**
   * Retrieves a List of {@link DMO DMOs} as a result of executing a
   * {@linkPlain DMLParamQuery parameterised SQL query}.
   *
   * @param dmlName (required) the name of the parameterised query or table
   *        defined in the DMLFactory.
   * @param filterBy name of the filter defined for the query or table that
   *        will be used to select the row in the database. null = all rows.
   * @param filterArgs arguments that satisfy the placeholder(s) of the
   *        filter as defined in the DMLFactory.
   * @param orderBy name of the sort order, as defined in the DMLFactory, to
   *        be applied to the result. null = order not defined.
   * @param initialCapacity the initial capacity of the List to be
   *        returned.
   *
   * @return List of DMOs - empty when no rows are found.
   *
   * @throws EPPIXSeriousException if any of the required parameters is null;
   *         initialCapacity is less than zero or greater than
   *         LIST_CAPACITY_MAX; the List overflows LIST_CAPACITY_MAX;
   *         the named DML does not exist in the DMLFactory; the named DML
   *         does not refer to a parameterised SQL query; the DMLFactory is
   *         unable to provide a SELECT statement for the specified filterBy
   *         or orderBy; the DMO class does not exist or can not be
   *         instantiated; or an SQL error is detected.
   */
  public List getList(String dmlName, String filterBy, DAOArgs filterArgs,
      String orderBy, int initialCapacity, String tableName)
      throws EPPIXSeriousException {

    final String methodDesc = "getList(param SQL)";

    thrower.ifParameterMissing("dmlName", dmlName);

    if ((initialCapacity < 0) || (initialCapacity > LIST_CAPACITY_MAX)) {
      thrower.unexpected("Parameter 'initialCapacity' must be between 0 and "
          + LIST_CAPACITY_MAX + ".");
    }

    List list = null;

    try {
      DMLParamQuery dmlQuery = dmlFactory.getParamQuery(dmlName);
      Class dmoClass = dmlQuery.getDMOClass();

      PreparedStatement stmt = stmtPool.get(dmlQuery, DML.STMT_SELECT, null,
          filterBy, orderBy, tableName, null);

      ResultSet rs = null;

      try {
        if (!isNull(filterArgs)) {
          filterArgs.bind(stmt, 1);
        }

        rs = stmt.executeQuery();

        if (logger.isDebugEnabled()) {
          logger.debug(debugDML(methodDesc, dmlQuery, DML.STMT_SELECT,
              filterBy, orderBy, ((isNull(filterArgs)) ? "" : filterArgs
                  .toString())));
        }

        list = new ArrayList(initialCapacity);

        int count = 0;

        while (rs.next()) {
          if ((++count) > LIST_CAPACITY_MAX) {
            thrower.unexpected("List capacity limit of " + LIST_CAPACITY_MAX
                + " has been exceeded.");
          }

          list.add(fetchDMO(dmoClass, rs));
        }

      } catch (SQLException e) {

        thrower.unexpected(getErrorMessage(e, dmlQuery, DML.STMT_SELECT,
            filterBy, orderBy, ((isNull(filterArgs)) ? "" : filterArgs
                .toString())), e);

      } finally { // close the result set

        try {
          if (rs != null) {
            rs.close();
          }
        } catch (SQLException e) {
          thrower.unexpected(getErrorMessage(e), e);
        }
      }

    } catch (DMLException e) {
      thrower.unexpected(e);
    }

    return list;
  }

  /**
   * Retrieves a List of {@link DMO DMOs} as a result of executing a
   * {@linkPlain DMLDynamicQuery dynamic SQL query}. A default value for the
   * initialCapacity of the List is assumed ({@link #LIST_CAPACITY_DEFAULT}).
   *
   * @param dmlName (required) the name of the dynamic SQL query defined in
   *        the DMLFactory.
   * @param args (required) string arguments that are passed to the dynamic
   *        query class (DMLDynamicQuery), to enable it to compose an
   *        appropriate SQL SELECT statament.
   *
   * @return List of DMOs - empty when no rows are found.
   *
   * @throws EPPIXSeriousException if any of the required parameters is null;
   *         initialCapacity is less than zero or greater than
   *         LIST_CAPACITY_MAX; the List overflows LIST_CAPACITY_MAX;
   *         the named DML does not exist in the DMLFactory; the named DML
   *         does not refer to a dynamic SQL query; the DMO class does not
   *         exist or can not be instantiated; or an SQL error is detected.
   */
  public List getList(String dmlName, String[] args)
      throws EPPIXSeriousException {
    return getList(dmlName, args, LIST_CAPACITY_DEFAULT);
  }

  /**
   * Retrieves a List of {@link DMO DMOs} as a result of executing a
   * {@linkPlain DMLDynamicQuery dynamic SQL query}.
   *
   * @param dmlName (required) the name of the dynamic SQL query defined in
   *        the DMLFactory.
   * @param args (required) string arguments that are passed to the dynamic
   *        query class (DMLDynamicQuery), to enable it to compose an
   *        appropriate SQL SELECT statament.
   * @param initialCapacity the initial capacity of the List to be
   *        returned.
   *
   * @return List of DMOs - empty when no rows are found.
   *
   * @throws EPPIXSeriousException if any of the required parameters is null;
   *         initialCapacity is less than zero or greater than
   *         LIST_CAPACITY_MAX; the List overflows LIST_CAPACITY_MAX;
   *         the named DML does not exist in the DMLFactory; the named DML
   *         does not refer to a dynamic SQL query; the DMO class does not
   *         exist or can not be instantiated; or an SQL error is detected.
   */
  public List getList(String dmlName, String[] args, int initialCapacity)
      throws EPPIXSeriousException {

    final String methodDesc = "getList(dynamic SQL)";

    thrower.ifParameterMissing("dmlName", dmlName);
    thrower.ifParameterMissing("args", args);

    if ((initialCapacity < 0) || (initialCapacity > LIST_CAPACITY_MAX)) {
      thrower.unexpected("Parameter 'initialCapacity' must be between 0 and "
          + LIST_CAPACITY_MAX + ".");
    }

    List list = null;

    try {
      DMLDynamicQuery dmlQuery = dmlFactory.getDynamicQuery(dmlName);
      String stmtString = dmlQuery.getStmtString(args);
      DAOArgs stmtArgs = dmlQuery.getStmtArgs(args);

      Class dmoClass = dmlQuery.getDMOClass();

      PreparedStatement stmt = null;
      ResultSet rs = null;

      try {
        stmt = conn.prepareStatement(commentSql(dmlName, stmtString));

        if (!isNull(stmtArgs)) {
          stmtArgs.bind(stmt, 1);
        }

        rs = stmt.executeQuery();

        if (logger.isDebugEnabled()) {
          logger.debug(debugDML(methodDesc, dmlQuery, stmtString,
              (isNull(stmtArgs) ? "" : stmtArgs.toString())));
        }

        list = new ArrayList(initialCapacity);

        int count = 0;

        while (rs.next()) {
          if ((++count) > LIST_CAPACITY_MAX) {
            thrower.unexpected("List capacity limit of " + LIST_CAPACITY_MAX
                + " has been exceeded.");
          }

          list.add(fetchDMO(dmoClass, rs));
        }

      } catch (SQLException e) {

        thrower.unexpected(getErrorMessage(e, dmlQuery, stmtString,
            (isNull(stmtArgs) ? "" : stmtArgs.toString())), e);

      } finally { // close the result set and statement

        try {
          if (rs != null) {
            rs.close();
          }

          if (stmt != null) {
            stmt.close();
          }
        } catch (SQLException e) {
          thrower.unexpected(getErrorMessage(e), e);
        }
      }

    } catch (DMLException e) {
      thrower.unexpected(e);
    }

    return list;
  }

  //  public DTOList getListAbs(DTOListState state, DAOParamQueryArgs queryArgs)
  //      throws EPPIXSeriousException {
  //
  //    return getListAbs(state, queryArgs, null);
  //  }
  //
  //  /**
  //   * Retrieves a {@link DTOList} populated with {@link DMO DMOs} as a result
  //   * of executing a {@linkPlain DMLParamQuery parameterised SQL query}. Each
  //   * subsequent set of values is retrieved by absolute row number that is
  //   * stored in the state ({@link DTOListState}).
  //   *
  //   * @param state current state of the list.
  //   * @param queryArgs query arguments object.
  //   *
  //   * @return DTOList of DMOs - empty when no rows are found.
  //   *
  //   * @throws EPPIXSeriousException if any of the required parameters is null;
  //   *         the named DML does not exist in the DMLFactory; the named DML
  //   *         does not refer to a parameterised SQL query; the DMLFactory is
  //   *         unable to provide a SELECT statement for the specified filterBy
  //   *         or orderBy; the DMO class does not exist or can not be
  //   *         instantiated; or an SQL error is detected.
  //   */
  //  public DTOList getListAbs(DTOListState state, DAOParamQueryArgs queryArgs,
  //      String tableName) throws EPPIXSeriousException {
  //
  //    thrower.ifParameterMissing("queryArgs", queryArgs);
  //
  //    return getListAbs(state, queryArgs.getDMLName(), queryArgs.getFilterBy(),
  //        queryArgs, queryArgs.getOrderBy(), tableName);
  //  }
  //
  //  public DTOList getListAbs(DTOListState state, String dmlName, DAOArgs stmtArgs)
  //      throws EPPIXSeriousException {
  //    return getListAbs(state, dmlName, stmtArgs, null);
  //  }
  //
  //  /**
  //   * Retrieves a {@link DTOList} populated with {@link DMO DMOs} as a result
  //   * of executing a {@linkPlain DMLStaticQuery static SQL query}. Each
  //   * subsequent set of values is retrieved by absolute row number that is
  //   * stored in the state ({@link DTOListState}).
  //   *
  //   * @param state current state of the list.
  //   * @param dmlName (required) the name of the static SQL query defined in
  //   *        the DMLFactory.
  //   * @param stmtArgs arguments that satisfy the placeholder(s) of the SELECT
  //   *        statement defined in the DMLFactory.
  //   *
  //   * @return DTOList of DMOs - empty when no rows are found.
  //   *
  //   * @throws EPPIXSeriousException if any of the required parameters is null;
  //   *         the named DML does not exist in the DMLFactory; the named DML
  //   *         does not refer to a static SQL query; the DMO class does not
  //   *         exist or can not be instantiated; or an SQL error is detected.
  //   */
  //  public DTOList getListAbs(DTOListState state, String dmlName,
  //      DAOArgs stmtArgs, String tableName) throws EPPIXSeriousException {
  //
  //    final String methodDesc = "getListAbs(static SQL)";
  //
  //    thrower.ifParameterMissing("dmlName", dmlName);
  //
  //    DAOListControl listControl = new DAOListControl(state);
  //
  //    try {
  //
  //      DMLStaticQuery dmlQuery = dmlFactory.getStaticQuery(dmlName);
  //      Class dmoClass = dmlQuery.getDMOClass();
  //
  //      PreparedStatement stmt = stmtPool.get(dmlQuery, DML.STMT_LIST_ABS, null,
  //          tableName);
  //
  //      ResultSet rs = null;
  //
  //      try {
  //
  //        bind(stmtArgs, stmt, 1);
  //        rs = stmt.executeQuery();
  //
  //        if (logger.isDebugEnabled()) {
  //          logger.debug(debugDML(methodDesc, dmlQuery, DML.STMT_LIST_ABS, "",
  //              "", toString(stmtArgs)));
  //        }
  //
  //        listControl.absFetch(dmoClass, rs);
  //
  //      } catch (SQLException e) {
  //
  //        thrower.unexpected(getErrorMessage(e, dmlQuery, DML.STMT_LIST_ABS, "",
  //            "", toString(stmtArgs)), e);
  //
  //      } finally { // close the result set
  //
  //        try {
  //          if (rs != null) {
  //            rs.close();
  //          }
  //        } catch (SQLException e) {
  //          thrower.unexpected(getErrorMessage(e), e);
  //        }
  //      }
  //
  //    } catch (DMLException e) {
  //      thrower.unexpected(e);
  //    }
  //
  //    return listControl.getDTOList();
  //  }
  //
  //  public DTOList getListAbs(DTOListState state, String dmlName,
  //      String filterBy, DAOArgs filterArgs, String orderBy)
  //      throws EPPIXSeriousException {
  //
  //    return getListAbs(state, dmlName, filterBy, filterArgs, orderBy, null);
  //  }
  //
  //  /**
  //   * Retrieves a {@link DTOList} populated with {@link DMO DMOs} as a result
  //   * of executing a {@linkPlain DMLParamQuery parameterised SQL query}. Each
  //   * subsequent set of values is retrieved by absolute row number that is
  //   * stored in the state ({@link DTOListState}).
  //   *
  //   * @param state current state of the list.
  //   * @param dmlName (required) the name of the parameterised query or table
  //   *        defined in the DMLFactory.
  //   * @param filterBy name of the filter defined for the query or table that
  //   *        will be used to select the row in the database. null = all rows.
  //   * @param filterArgs arguments that satisfy the placeholder(s) of the
  //   *        filter as defined in the DMLFactory.
  //   * @param orderBy name of the sort order, as defined in the DMLFactory, to
  //   *        be applied to the result. null = order not defined.
  //   *
  //   * @return DTOList of DMOs - empty when no rows are found.
  //   *
  //   * @throws EPPIXSeriousException if any of the required parameters is null;
  //   *         the named DML does not exist in the DMLFactory; the named DML
  //   *         does not refer to a parameterised SQL query; the DMLFactory is
  //   *         unable to provide a SELECT statement for the specified filterBy
  //   *         or orderBy; the DMO class does not exist or can not be
  //   *         instantiated; or an SQL error is detected.
  //   */
  //  public DTOList getListAbs(DTOListState state, String dmlName,
  //      String filterBy, DAOArgs filterArgs, String orderBy, String tableName)
  //      throws EPPIXSeriousException {
  //
  //    final String methodDesc = "getListAbs(param SQL)";
  //
  //    thrower.ifParameterMissing("dmlName", dmlName);
  //
  //    DAOListControl listControl = new DAOListControl(state);
  //
  //    try {
  //      DMLParamQuery dmlQuery = dmlFactory.getParamQuery(dmlName);
  //      Class dmoClass = dmlQuery.getDMOClass();
  //
  //      PreparedStatement stmt = stmtPool.get(dmlQuery, DML.STMT_LIST_ABS, null,
  //          filterBy, orderBy, tableName, null);
  //
  //      ResultSet rs = null;
  //
  //      try {
  //
  //        bind(filterArgs, stmt, 1);
  //        rs = stmt.executeQuery();
  //
  //        if (logger.isDebugEnabled()) {
  //          logger.debug(debugDML(methodDesc, dmlQuery, DML.STMT_LIST_ABS,
  //              filterBy, orderBy, toString(filterArgs)));
  //        }
  //
  //        listControl.absFetch(dmoClass, rs);
  //
  //      } catch (SQLException e) {
  //
  //        thrower.unexpected(getErrorMessage(e, dmlQuery, DML.STMT_LIST_ABS,
  //            filterBy, orderBy, toString(filterArgs)), e);
  //
  //      } finally { // close the result set
  //
  //        try {
  //          if (rs != null) {
  //            rs.close();
  //          }
  //        } catch (SQLException e) {
  //          thrower.unexpected(getErrorMessage(e), e);
  //        }
  //      }
  //    } catch (DMLException e) {
  //      thrower.unexpected(e);
  //    }
  //
  //    return listControl.getDTOList();
  //  }
  //
  //  /**
  //   * Retrieves a {@link DTOList} populated with {@link DMO DMOs} as a result
  //   * of executing a {@linkPlain DMLDynamicQuery dynamic SQL query}. Each
  //   * subsequent set of values is retrieved by absolute row number that is
  //   * stored in the state ({@link DTOListState}).
  //   *
  //   * @param state current state of the list.
  //   * @param dmlName (required) the name of the dynamic SQL query defined in
  //   *        the DMLFactory.
  //   * @param args (required) string arguments that are passed to the dynamic
  //   *        query class ({@link DMLDynamicQuery#getStmtString(String[]
  //   *        args)}), to enable it to compose an appropriate SQL SELECT
  //   *        statament.
  //   *
  //   * @return DTOList of DMOs - empty when no rows are found.
  //   *
  //   * @throws EPPIXSeriousException if any of the required parameters is null;
  //   *         the named DML does not exist in the DMLFactory; the named DML
  //   *         does not refer to a dynamic SQL query; the DMO class does not
  //   *         exist or can not be instantiated; or an SQL error is detected.
  //   */
  //  public DTOList getListAbs(DTOListState state, String dmlName, String[] args)
  //      throws EPPIXSeriousException {
  //
  //    final String methodDesc = "getListAbs(dynamic SQL)";
  //
  //    thrower.ifParameterMissing("dmlName", args);
  //    thrower.ifParameterMissing("args", args);
  //
  //    DAOListControl listControl = new DAOListControl(state);
  //
  //    try {
  //
  //      DMLDynamicQuery dmlQuery = dmlFactory.getDynamicQuery(dmlName);
  //      String stmtString = dmlQuery.getStmtString(args);
  //      DAOArgs stmtArgs = dmlQuery.getStmtArgs(args);
  //
  //      Class dmoClass = dmlQuery.getDMOClass();
  //
  //      PreparedStatement stmt = null;
  //      ResultSet rs = null;
  //
  //      try {
  //
  //        stmt = conn.prepareStatement(commentSql(dmlName, stmtString),
  //            ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
  //
  //        bind(stmtArgs, stmt, 1);
  //        rs = stmt.executeQuery();
  //
  //        if (logger.isDebugEnabled()) {
  //          logger.debug(debugDML(methodDesc, dmlQuery, stmtString,
  //              toString(stmtArgs)));
  //        }
  //
  //        listControl.absFetch(dmoClass, rs);
  //
  //      } catch (SQLException e) {
  //
  //        thrower.unexpected(getErrorMessage(e, dmlQuery, stmtString,
  //            toString(stmtArgs)), e);
  //
  //      } finally { // close the result set and statement
  //
  //        try {
  //          if (rs != null) {
  //            rs.close();
  //          }
  //
  //          if (stmt != null) {
  //            stmt.close();
  //          }
  //        } catch (SQLException e) {
  //          thrower.unexpected(getErrorMessage(e), e);
  //        }
  //      }
  //
  //    } catch (DMLException e) {
  //      thrower.unexpected(e);
  //    }
  //
  //    return listControl.getDTOList();
  //  }
  //
  //  /**
  //   * Retrieves a {@link DTOList} populated with {@link DMO DMOs} as a result
  //   * of executing a {@linkPlain DMLParamQuery parameterised SQL query}. The
  //   * list is ordered by ascending primary key. Each subsequent set of values is
  //   * retrieved based on the primary key that is stored in the state ({@link
  //   * DTOListState}).
  //   *
  //   * @param state current state of the list.
  //   * @param dmlName (required) the name of the parameterised query or table
  //   *        defined in the DMLFactory.
  //   * @param filterBy name of the filter defined for the query or table that
  //   *        will be used to select the row in the database. null = all rows.
  //   * @param filterArgs arguments that satisfy the placeholder(s) of the
  //   *        filter as defined in the DMLFactory.
  //   *
  //   * @return DTOList of DMOs - empty when no rows are found.
  //   *
  //   * @throws EPPIXSeriousException if any of the required parameters is null;
  //   *         the named DML does not exist in the DMLFactory; the named DML
  //   *         does not refer to a parameterised SQL query; the DMLFactory is
  //   *         unable to provide a SELECT statement for the specified filterBy
  //   *         or orderBy; the DMO class does not exist or can not be
  //   *         instantiated; or an SQL error is detected.
  //   */
  //  public DTOList getListKey(DTOListState state, String dmlName,
  //      String filterBy, DAOArgs filterArgs) throws EPPIXSeriousException {
  //    return getListKey(state, dmlName, filterBy, filterArgs, true);
  //  }
  //
  //  public DTOList getListKey(DTOListState state, String dmlName,
  //      String filterBy, DAOArgs filterArgs, boolean isAscending)
  //      throws EPPIXSeriousException {
  //    return getListKey(state, dmlName, filterBy, filterArgs, isAscending, null);
  //  }
  //
  //  /**
  //   * Retrieves a {@link DTOList} populated with {@link DMO DMOs} as a result
  //   * of executing a {@linkPlain DMLParamQuery parameterised SQL query}. The
  //   * list is ordered by primary key. Each subsequent set of values is
  //   * retrieved based on the primary key that is stored in the state ({@link
  //   * DTOListState}).
  //   *
  //   * @param state current state of the list.
  //   * @param dmlName (required) the name of the parameterised query or table
  //   *        defined in the DMLFactory.
  //   * @param filterBy name of the filter defined for the query or table that
  //   *        will be used to select the row in the database. null = all rows.
  //   * @param filterArgs arguments that satisfy the placeholder(s) of the
  //   *        filter as defined in the DMLFactory.
  //   * @param isAscending boolean flag; when true the list is ordered by
  //   *        ascending primary key, when false the list is ordered by
  //   *        descending primary key.
  //   *
  //   * @return DTOList of DMOs - empty when no rows are found.
  //   *
  //   * @throws EPPIXSeriousException if any of the required parameters is null;
  //   *         the named DML does not exist in the DMLFactory; the named DML
  //   *         does not refer to a parameterised SQL query; the DMLFactory is
  //   *         unable to provide a SELECT statement for the specified filterBy
  //   *         or orderBy; the DMO class does not exist or can not be
  //   *         instantiated; or an SQL error is detected.
  //   */
  //  public DTOList getListKey(DTOListState state, String dmlName,
  //      String filterBy, DAOArgs filterArgs, boolean isAscending, String tableName)
  //      throws EPPIXSeriousException {
  //
  //    final String methodDesc = "getListKey(param SQL)";
  //
  //    thrower.ifParameterMissing("dmlName", dmlName);
  //
  //    DAOListControl listControl = new DAOListControl(state);
  //
  //    try {
  //
  //      int stmtType = listControl.keyStmtType(isAscending);
  //
  //      DMLParamQuery dmlQuery = dmlFactory.getParamQuery(dmlName);
  //
  //      Class dmoClass = dmlQuery.getDMOClass();
  //
  //      PreparedStatement stmt = stmtPool.get(dmlQuery, stmtType, null, filterBy,
  //          tableName);
  //
  //      ResultSet rs = null;
  //
  //      DAOArgs keyArgs = listControl.keyArgs();
  //
  //      try {
  //
  //        bind(keyArgs, stmt, bind(filterArgs, stmt, 1));
  //        rs = stmt.executeQuery();
  //
  //        if (logger.isDebugEnabled()) {
  //          logger.debug(debugDML(methodDesc, dmlQuery, stmtType, filterBy, "",
  //              toString(toString(filterArgs), keyArgs)));
  //        }
  //
  //        listControl.keyFetch(dmoClass, rs);
  //
  //      } catch (SQLException e) {
  //
  //        thrower.unexpected(getErrorMessage(e, dmlQuery, stmtType, filterBy, "",
  //            toString(toString(filterArgs), keyArgs)), e);
  //
  //      } finally { // close the result set
  //
  //        try {
  //          if (rs != null) {
  //            rs.close();
  //          }
  //        } catch (SQLException e) {
  //          thrower.unexpected(getErrorMessage(e), e);
  //        }
  //      }
  //
  //    } catch (DMLException e) {
  //      thrower.unexpected(e);
  //    }
  //
  //    return listControl.getDTOList();
  //  }

  /**
   * Retrieves the dml name of the table definition associated with the dmoClass
   * from the dml factory.
   *
   * @param dmoClass dmo class
   *
   * @return dml name or the empty string if no table definition is found.
   */
  public String getTableDMLName(Class dmoClass) {

    DMLTable dml = null;

    try {
      dml = dmlFactory.getTable(dmoClass);
    } catch (DMLException e) {
    }

    return (dml == null) ? "" : dml.getName();
  }

  /**
   * Instantiates a {@link DAOIterator} that can be used to retrieve {@link
   * DMO DMOs} as the result of executing a {@linkPlain DMLParamQuery
   * parameterised SQL query}. e.g., DAO dao = ...; DAOArgs byNameMatch =
   * new DAOArgs(2).arg("R%").arg("R%"); DAOIterator itr =
   * dao.iterator("Customer", "NameMatch", byNameMatch, "Name"); while
   * (itr.hasNext())  CustomerDMO cstDMO = (CustomerDMO) itr.next(); ...
   * itr.close();
   *
   * @param dmlName (required) the name of the parameterised query or table
   *        defined in the DMLFactory.
   * @param filterBy name of the filter defined for the query or table that
   *        will be used to select the row in the database. null = all rows.
   * @param filterArgs arguments that satisfy the placeholder(s) of the
   *        filter as defined in the DMLFactory.
   * @param orderBy name of the sort order, as defined in the DMLFactory, to
   *        be applied to the result. null = order not defined.
   *
   * @return DAOIterator - use the hasNext() and next() methods (Iterator
   *         interface) to retrieve DMOs. Remember to use the close() method
   *         when the iterator is exhausted.
   *
   * @throws EPPIXSeriousException if any of the required parameters is null;
   *         the named DML does not exist in the DMLFactory; the named DML
   *         does not refer to a parameterised SQL query; the DMLFactory is
   *         unable to provide a SELECT statement for the specified filterBy
   *         or orderBy; or an SQL error is detected.
   */
  public DAOIterator iterator(String dmlName, String filterBy,
      DAOArgs filterArgs, String orderBy) throws EPPIXSeriousException {
    return iterator(dmlName, filterBy, filterArgs, orderBy, false, null);
  }

  public DAOIterator iterator(String dmlName, String filterBy,
      DAOArgs filterArgs, String orderBy, boolean forUpdate)
      throws EPPIXSeriousException {

    return iterator(dmlName, filterBy, filterArgs, orderBy, forUpdate, null);
  }

  /**
   * Instantiates a {@link DAOIterator} that can be used to retrieve {@link
   * DMO DMOs} as the result of executing a {@linkPlain DMLParamQuery
   * parameterised SQL query}. The rows can optionally be locked 'FOR
   * UPDATE'. e.g., DAO dao = ...; DAOArgs byNameMatch = new
   * DAOArgs(2).arg("R%").arg("R%"); DAOIterator itr =
   * dao.iterator("Customer", "NameMatch", byNameMatch, "Name", true); while
   * (itr.hasNext())  CustomerDMO cstDMO = (CustomerDMO) itr.next(); ...
   * itr.close();
   *
   * @param dmlName (required) the name of the parameterised query or table
   *        defined in the DMLFactory.
   * @param filterBy name of the filter defined for the query or table that
   *        will be used to select the row in the database. null = all rows.
   * @param filterArgs arguments that satisfy the placeholder(s) of the
   *        filter as defined in the DMLFactory.
   * @param orderBy name of the sort order, as defined in the DMLFactory, to
   *        be applied to the result. null = order not defined.
   * @param forUpdate when true, a 'FOR UPDATE' lock is acquired.
   *
   * @return - DAOIterator - use the hasNext() and next() methods (Iterator
   *         interface) to retrieve DMOs. Remember to use the close() method
   *         when the iterator is exhausted.
   *
   * @throws EPPIXSeriousException if any of the required parameters is null;
   *         the named DML does not exist in the DMLFactory; the named DML
   *         does not refer to a parameterised SQL query; the DMLFactory is
   *         unable to provide a SELECT statement for the specified filterBy
   *         or orderBy; or an SQL error is detected.
   */
  public DAOIterator iterator(String dmlName, String filterBy,
      DAOArgs filterArgs, String orderBy, boolean forUpdate, String tableName)
      throws EPPIXSeriousException {
    final String methodDesc = "iterator(param SQL)";

    if (isNull(dmlName)) {
      thrower.unexpected("Parameter 'dmlName' is required.");
    }

    DAOIterator iterator = null;

    try {
      DMLParamQuery dmlQuery = dmlFactory.getParamQuery(dmlName);
      Class dmoClass = dmlQuery.getDMOClass();

      int stmtType = forUpdate ? DML.STMT_LOCK : DML.STMT_SELECT;
      PreparedStatement stmt = stmtPool.get(dmlQuery, stmtType, null, filterBy,
          orderBy, tableName, null);

      try {
        if (!isNull(filterArgs)) {
          filterArgs.bind(stmt, 1);
        }

        ResultSet rs = stmt.executeQuery();

        if (logger.isDebugEnabled()) {

          logger.debug(debugDML(methodDesc, dmlQuery, stmtType, filterBy,
              orderBy, toString(filterArgs)));
        }

        boolean hasNext = rs.next();
        iterator = (DAOIterator) new DAOIteratorImpl(this, dmoClass, null, rs,
            hasNext);

      } catch (SQLException e) {

        thrower.unexpected(getErrorMessage(e, dmlQuery, stmtType, filterBy,
            orderBy, toString(filterArgs)), e);
      }
    } catch (DMLException e) {
      thrower.unexpected(e);
    }

    return iterator;
  }

  public DAOIterator iterator(DAOParamQueryArgs queryArgs)
      throws EPPIXSeriousException {
    return iterator(queryArgs, null);
  }

  /**
   * Instantiates a {@link DAOIterator} that can be used to retrieve {@link
   * DMO DMOs} as the result of executing a {@linkPlain DMLStaticQuery
   * static SQL query}.
   *
   * @param queryArgs (required) query arguments object.
   *
   * @return DAOIterator - use the hasNext() and next() methods (Iterator
   *         interface) to retrieve DMOs. Remember to use the close() method
   *         when the iterator is exhausted.
   *
   * @throws EPPIXSeriousException if any of the required parameters is null;
   *         the named DML does not exist in the DMLFactory; the named DML
   *         does not refer to a static SQL query; or an SQL error is
   *         detected.
   */
  public DAOIterator iterator(DAOParamQueryArgs queryArgs, String tableName)
      throws EPPIXSeriousException {

    thrower.ifParameterMissing("queryArgs", queryArgs);

    return iterator(queryArgs.getDMLName(), queryArgs.getFilterBy(), queryArgs,
        queryArgs.getOrderBy(), false, tableName);
  }

  public DAOIterator iterator(String dmlName, DAOArgs stmtArgs)
      throws EPPIXSeriousException {
    return iterator(dmlName, stmtArgs, null);
  }

  /**
   * Instantiates a {@link DAOIterator} that can be used to retrieve {@link
   * DMO DMOs} as the result of executing a {@linkPlain DMLStaticQuery
   * static SQL query}.
   *
   * @param dmlName (required) the name of the static SQL query defined in
   *        the DMLFactory.
   * @param stmtArgs arguments that satisfy the placeholder(s) of the SELECT
   *        statement defined in the DMLFactory.
   *
   * @return DAOIterator - use the hasNext() and next() methods (Iterator
   *         interface) to retrieve DMOs. Remember to use the close() method
   *         when the iterator is exhausted.
   *
   * @throws EPPIXSeriousException if any of the required parameters is null;
   *         the named DML does not exist in the DMLFactory; the named DML
   *         does not refer to a static SQL query; or an SQL error is
   *         detected.
   */
  public DAOIterator iterator(String dmlName, DAOArgs stmtArgs, String tableName)
      throws EPPIXSeriousException {
    final String methodDesc = "iterator(static SQL)";

    if (isNull(dmlName)) {
      thrower.unexpected("Parameter 'dmlName' is required.");
    }

    DAOIterator iterator = null;

    try {
      DMLStaticQuery dmlQuery = dmlFactory.getStaticQuery(dmlName);
      Class dmoClass = dmlQuery.getDMOClass();

      PreparedStatement stmt = stmtPool.get(dmlQuery, DML.STMT_SELECT, null,
          "NONE", tableName);

      try {
        if (!isNull(stmtArgs)) {
          stmtArgs.bind(stmt, 1);
        }

        ResultSet rs = stmt.executeQuery();

        if (logger.isDebugEnabled()) {

          logger.debug(debugDML(methodDesc, dmlQuery, DML.STMT_SELECT, "", "",
              toString(stmtArgs)));
        }

        boolean hasNext = rs.next();
        iterator = (DAOIterator) new DAOIteratorImpl(this, dmoClass, null, rs,
            hasNext);

      } catch (SQLException e) {

        thrower.unexpected(getErrorMessage(e, dmlQuery, DML.STMT_SELECT, "",
            "", toString(stmtArgs)), e);
      }

    } catch (DMLException e) {
      thrower.unexpected(e);
    }

    return iterator;
  }

  /**
   * Instantiates a {@link DAOIterator} that can be used to retrieve {@link
   * DMO DMOs} as the result of executing a {@linkPlain DMLDynamicQuery
   * dynamic SQL query}.
   *
   * @param dmlName (required) the name of the dynamic SQL query defined in
   *        the DMLFactory.
   * @param args (required) string arguments that are passed to the dynamic
   *        query class (DMLDynamicQuery), to enable it to compose an
   *        appropriate SQL SELECT statament.
   *
   * @return DAOIterator - use the hasNext() and next() methods (Iterator
   *         interface) to retrieve DMOs. Remember to use the close() method
   *         when the iterator is exhausted.
   *
   * @throws EPPIXSeriousException if any of the required parameters is null;
   *         the named DML does not exist in the DMLFactory; the named DML
   *         does not refer to a dynamic SQL query; or an SQL error is
   *         detected.
   */
  public DAOIterator iterator(String dmlName, String[] args)
      throws EPPIXSeriousException {
    final String methodDesc = "iterator(dynamic SQL)";

    if (isNull(dmlName)) {
      thrower.unexpected("Parameter 'dmlName' is required.");
    }

    if (isNull(args)) {
      thrower.unexpected("Parameter 'args' is required.");
    }

    DAOIterator iterator = null;

    try {
      DMLDynamicQuery dmlQuery = dmlFactory.getDynamicQuery(dmlName);
      Class dmoClass = dmlQuery.getDMOClass();
      String stmtString = dmlQuery.getStmtString(args);
      DAOArgs stmtArgs = dmlQuery.getStmtArgs(args);

      try {
        PreparedStatement stmt = conn.prepareStatement(commentSql(dmlName,
            stmtString));

        if (!isNull(stmtArgs)) {
          stmtArgs.bind(stmt, 1);
        }

        ResultSet rs = stmt.executeQuery();

        if (logger.isDebugEnabled()) {

          logger.debug(debugDML(methodDesc, dmlQuery, stmtString,
              toString(stmtArgs)));
        }

        boolean hasNext = rs.next();
        iterator = (DAOIterator) new DAOIteratorImpl(this, dmoClass, stmt, rs,
            hasNext);

      } catch (SQLException e) {

        thrower.unexpected(getErrorMessage(e, dmlQuery, stmtString,
            toString(stmtArgs)), e);

      }
    } catch (DMLException e) {
      thrower.unexpected(e);
    }

    return iterator;
  }

  public void insert(DBO dbo) throws EPPIXSeriousException {
    insert(dbo, null);
  }

  /**
   * Inserts a single {@link DBO} into the database. The class of the DBO is
   * used to consult the {@link DMLFactory} to obtain a {@link DMLTable}
   * definition, that will provide an appropriate INSERT statement. If the
   * underlying table has a version number (used for optimistic locking)
   * then the version number of the DBO is set to 1.
   *
   * @param dbo (required) the DBO to be inserted, for which a table
   *        definition exists in the DMLFactory.
   *
   * @throws EPPIXSeriousException if any of the required parameters is null;
   *         the DMLFactory is unable to provide an INSERT statement; or an
   *         SQL error is detected.
   */
  public void insert(DBO dbo, String tableName) throws EPPIXSeriousException {

    final String methodDesc = "insert(DBO)";

    thrower.ifParameterMissing("dbo", dbo);


    try {
      DMLTable dmlTable = dmlFactory.getTable(dbo);

      PreparedStatement stmt = stmtPool.get(dmlTable, DML.STMT_INSERT, dbo,
          tableName);


      if (dmlTable.hasVersion()) {
        dbo.initVersion();
      }

      DAOArgs fields = dbo.fields();

      if (logger.isDebugEnabled()) {
          logger.debug(fields.toString());
      }

      try {
        fields.bind(stmt, 1);

//        if (dmlTable.hasGeneratedKey()) {
//          ((CallableStatement) stmt).registerOutParameter(
//              fields.getCount() + 1, Types.INTEGER);
//        }

        if (stmt.executeUpdate() > 0) {

          connectionContext.setIsDirty();

          if (dmlTable.hasGeneratedKey()) {
        	 /**
        	  * SJ: We changed this to retireve the generated keys from
        	  * the preparedStamtent  object.
        	  */
        	  ResultSet rs = stmt.getGeneratedKeys();

        	  while(rs.next()){
        		  dbo.generatedKey(new Integer(rs.getInt(1)));
        	  }

//        	  dbo.generatedKey(new Integer(((CallableStatement) stmt).getInt(fields.getCount() + 1)));

          }

        }

        if (logger.isDebugEnabled()) {

          logger.debug(debugDML(methodDesc, dmlTable, DML.STMT_INSERT, "", "",
              fields.toString()));
        }

        if (fields.containsClob()) {
          writeClob(dmlTable, "filterByPrimaryKey", dbo.primaryKey(), fields,
              null);
        }

        // reset the action field
        dbo.actionNone();
      } catch (SQLException e) {
        thrower.unexpected(getErrorMessage(e, dmlTable, DML.STMT_INSERT, "",
            "", fields.toString()), e);
      }
    } catch (DMLException e) {
      thrower.unexpected(e);
      //		} catch (DMOKeyDispenserException e) {
      //			thrower.unexpected(e);
    }

  }

  public void insert(DBO[] dbos) throws EPPIXSeriousException {
    insert(dbos, null);
  }

  /**
   * Inserts an array of {@link DBO DBOs} into the database. The class of the
   * first DBO element in the array, is used to consult the {@link
   * DMLFactory} to obtain a {@link DMLTable} definition, that will provide
   * an appropriate INSERT statement. If the underlying table has a version
   * number (used for optimistic locking) then the version number of the DBO
   * is set to 1.
   *
   * @param dbos (required) the array of DBOs to be inserted, for which a
   *        table definition exists in the DMLFactory. All of the DBOs in
   *        the array must be of the same class.
   *
   * @throws EPPIXSeriousException if any of the required parameters is null;
   *         the DMLFactory is unable to provide an INSERT statement; or an
   *         SQL error is detected.
   */
  public void insert(DBO[] dbos, String tblName) throws EPPIXSeriousException {
    final String methodDesc = "insert(DBO[])";
    boolean isDebugEnabled = logger.isDebugEnabled();

    if ((dbos == null) || (dbos.length == 0) || (dbos[0] == null)) {
      thrower.unexpected("Parameter 'dbos' is required.");
    }

    try {
      DMLTable dmlTable = dmlFactory.getTable(dbos[0]);
      PreparedStatement stmt = stmtPool.get(dmlTable, DML.STMT_INSERT, null,
          tblName);
      //			String tableName = dmlTable.getTableName();
      //			boolean hasGeneratedKey = dmlTable.hasGeneratedKey();
      boolean hasVersion = dmlTable.hasVersion();

      try {
        for (int i = 0; i < dbos.length; ++i) {
          if (dbos[i] == null) {
            continue;
          }

          //					if (hasGeneratedKey) {
          //						dbos[i].generatedKey(keyDispenser.useNext(tableName));
          //					}

          if (hasVersion) {
            dbos[i].initVersion();
          }

          DAOArgs fields = dbos[i].fields();
          fields.bind(stmt, 1);
          stmt.addBatch();

          if (isDebugEnabled) {
            logger.debug(debugDML(methodDesc, dmlTable, DML.STMT_INSERT, "",
                "", fields.toString()));
          }
        }

        stmt.executeBatch();
        connectionContext.setIsDirty();

        // reset the action fields
        for (int i = 0; i < dbos.length; ++i) {
          if (dbos[i] != null) {
            dbos[i].actionNone();
          }
        }
      } catch (SQLException e) {
        thrower.unexpected(getErrorMessage(e, dmlTable, DML.STMT_INSERT, "",
            "", "|<Array>"));
      }
    } catch (DMLException e) {
      thrower.unexpected(e);
      //		} catch (DMOKeyDispenserException e) {
      //			thrower.unexpected(e);
    }
  }

  /**
   * Inserts an List of {@link DBO DBOs} into the database. The class of
   * the first DBO element in the collection, is used to consult the {@link
   * DMLFactory} to obtain a {@link DMLTable} definition, that will provide
   * an appropriate INSERT statement. If the underlying table has a version
   * number (used for optimistic locking) then the version number of the DBO
   * is set to 1.
   *
   * @param dbos (required) the List of DBOs to be inserted, for which a
   *        table definition exists in the DMLFactory. All of the DBOs in
   *        the collection must be of the same class.
   *
   * @throws EPPIXSeriousException if any of the required parameters is null;
   *         the DMLFactory is unable to provide an INSERT statement; or an
   *         SQL error is detected.
   */
  public void insert(List dbos) throws EPPIXSeriousException {
    insert((DBO[]) dbos.toArray(new DBO[dbos.size()]));
  }

  /**
   * Updates a single {@link DBO}, by its primary key, in the database. The
   * class of the DBO is used to consult the {@link DMLFactory} to obtain a
   * {@link DMLTable} definition, that will provide a suitable UPDATE
   * statement. If the underlying table has a version number (used for
   * optimistic locking) then the version number of the DBO is incremented
   * by 1.
   *
   * @param dbo (required) the DBO to be updated, for which a table
   *        definition exists in the DMLFactory.
   *
   * @throws EPPIXSeriousException if any of the required parameters is null;
   *         the DMLFactory is unable to provide an UPDATE statement; or an
   *         SQL error is detected.
   * @throws EPPIXObjectExpiredException if the version number contained in
   *         the DBO does not match that found in the database. This is an
   *         optimistic lock exception.
   * @throws EPPIXObjectNotFoundException if the DBO does not exist in the
   *         database.
   */
  public void update(DBO dbo) throws EPPIXSeriousException,
      EPPIXObjectExpiredException, EPPIXObjectNotFoundException {

    thrower.ifParameterMissing("dbo", dbo);

    update(dbo, "filterByPrimaryKey", dbo.primaryKey());
  }

  public void update(DBO dbo, String tableName) throws EPPIXSeriousException,
      EPPIXObjectExpiredException, EPPIXObjectNotFoundException {

    thrower.ifParameterMissing("dbo", dbo);

    update(dbo, "filterByPrimaryKey", dbo.primaryKey(), tableName, null);
  }

  public void update(DBO dbo, DAOParamQueryArgs queryArgs)
      throws EPPIXSeriousException, EPPIXObjectExpiredException,
      EPPIXObjectNotFoundException {

    update(dbo, queryArgs);
  }

  /**
   * Updates a single {@link DBO}, by the specified filter, in the database.
   * The filter must be defined as identifying a single row in the database.
   * The class of the DBO is used to consult the {@link DMLFactory} to
   * obtain a {@link DMLTable} definition, that will provide a suitable
   * UPDATE statement. If the underlying table has a version number (used
   * for optimistic locking) then the version number of the DBO is
   * incremented by 1.
   *
   * @param dbo (required) the DBO to be updated, for which a table
   *        definition exists in the DMLFactory.
   * @param queryArgs (required) query arguments object.
   *
   * @throws EPPIXSeriousException if any of the required parameters is null;
   *         the DMLFactory is unable to provide an UPDATE statement; the
   *         filter is defined as returning more than one row; more than one
   *         row is affected by the update; or an SQL error is detected.
   * @throws EPPIXObjectExpiredException if the version number contained in
   *         the DBO does not match that found in the database. This is an
   *         optimistic lock exception.
   * @throws EPPIXObjectNotFoundException if the DBO does not exist in the
   *         database.
   */
  public void update(DBO dbo, DAOParamQueryArgs queryArgs, String tableName)
      throws EPPIXSeriousException, EPPIXObjectExpiredException,
      EPPIXObjectNotFoundException {

    update(dbo, queryArgs.getFilterBy(), queryArgs, tableName, queryArgs
        .getSetArgs());

  }

  public void update(DBO dbo, String filterBy, DAOArgs filterArgs)
      throws EPPIXSeriousException, EPPIXObjectExpiredException,
      EPPIXObjectNotFoundException {
    update(dbo, filterBy, filterArgs, null, null);
  }

  /**
   * Updates a single {@link DBO}, by the specified filter, in the database.
   * The filter must be defined as identifying a single row in the database.
   * The class of the DBO is used to consult the {@link DMLFactory} to
   * obtain a {@link DMLTable} definition, that will provide a suitable
   * UPDATE statement. If the underlying table has a version number (used
   * for optimistic locking) then the version number of the DBO is
   * incremented by 1.
   *
   * @param dbo (required) the DBO to be updated, for which a table
   *        definition exists in the DMLFactory.
   * @param filterBy (required) name of the filter defined for the table that
   *        will be used to update the row in the database.
   * @param filterArgs (required) arguments that satisfy the placeholder(s)
   *        of the filter as defined in the DMLFactory.
   *
   * @throws EPPIXSeriousException if any of the required parameters is null;
   *         the DMLFactory is unable to provide an UPDATE statement; the
   *         filter is defined as returning more than one row; more than one
   *         row is affected by the update; or an SQL error is detected.
   * @throws EPPIXObjectExpiredException if the version number contained in
   *         the DBO does not match that found in the database. This is an
   *         optimistic lock exception.
   * @throws EPPIXObjectNotFoundException if the DBO does not exist in the
   *         database.
   */
  public void update(DBO dbo, String filterBy, DAOArgs filterArgs,
      String tableName, String setArgs) throws EPPIXSeriousException,
      EPPIXObjectExpiredException, EPPIXObjectNotFoundException {
    final String methodDesc = "update(DBO)";

    thrower.ifParameterMissing("dbo", dbo);
    thrower.ifParameterMissing("filterBy", filterBy);
    thrower.ifParameterMissing("filterArgs", filterArgs);

    try {
      DMLTable dmlTable = dmlFactory.getTable(dbo);

      /*if ( dmlTable.isMultiRow( filterBy ) ) {
       thrower.unexpected( "Filter '" + filterBy
       + "' is defined as returning more than one row." );
       }*/
      PreparedStatement stmt = stmtPool.get(dmlTable, DML.STMT_UPDATE, null,
          filterBy, null, tableName, setArgs);

      boolean hasVersion = dmlTable.hasVersion();
      DAOArgs version = null;

      if (hasVersion && ((version = dbo.nextVersion()) == null)) {
        thrower.unexpected(getErrorMessage(ERROR_DMO_HAS_NO_VERSION, dmlTable,
            DML.STMT_UPDATE, filterBy, "", ""));
      }

      DAOArgs fields = dbo.fields();

      try {

        int pos = fields.bind(stmt, 1);

        if (fields.containsClob()) {
          writeClob(dmlTable, filterBy, filterArgs, fields, stmt);
        }

        pos = filterArgs.bind(stmt, pos);

        if (hasVersion) {
          version.bind(stmt, pos);
        }

        int rowCount = stmt.executeUpdate();
        if (rowCount > 0) {
          connectionContext.setIsDirty();
        }

        if (logger.isDebugEnabled()) {
          logger.debug(debugDML(methodDesc, dmlTable, DML.STMT_UPDATE,
              filterBy, "", toString(toString(toString(fields), filterArgs),
                  version)));
        }

        if (rowCount == 0) {
          if (hasVersion && exists(dbo)) {

            thrower.objectExpired(getErrorMessage(ERROR_VERSION_MISMATCH,
                dmlTable, DML.STMT_UPDATE, filterBy, "", toString(toString(
                    toString(fields), filterArgs), version)));

          } else {

            thrower.objectNotFound(getErrorMessage(ERROR_NOT_FOUND, dmlTable,
                DML.STMT_UPDATE, filterBy, "", toString(toString(
                    toString(fields), filterArgs), version)));
          }
        }

        if (rowCount > 1) {

          thrower.unexpected(getErrorMessage(ERROR_MORE_THAN_ONE_ROW, dmlTable,
              DML.STMT_UPDATE, filterBy, "", toString(toString(
                  toString(fields), filterArgs), version)));
        }

        // reset action field
        dbo.actionNone();

      } catch (SQLException e) {

        thrower.unexpected(getErrorMessage(e, dmlTable, DML.STMT_UPDATE,
            filterBy, "", toString(toString(toString(fields), filterArgs),
                version)), e);

      }
    } catch (DMLException e) {
      thrower.unexpected(e);
    }
  }

  public void updateCustom(DBO dbo, DAOParamQueryArgs queryArgs)
      throws EPPIXSeriousException, EPPIXObjectExpiredException,
      EPPIXObjectNotFoundException {

    updateCustom(dbo, queryArgs, null);

  }

  public void updateCustom(DBO dbo, DAOParamQueryArgs queryArgs,
      String tableName) throws EPPIXSeriousException,
      EPPIXObjectExpiredException, EPPIXObjectNotFoundException {
	  
	  logger.debug("\nCOUNT NUMBER ARGS: " + queryArgs.getCount());

    updateCustom(dbo, queryArgs.getFilterBy(), queryArgs, tableName, queryArgs
        .getSetArgs());

  }

  public void updateCustom(DBO dbo, String filterBy, DAOArgs filterArgs,
      String tableName, String setArgs) throws EPPIXSeriousException,
      EPPIXObjectExpiredException, EPPIXObjectNotFoundException {
    final String methodDesc = "updateCustom(DBO)";

    thrower.ifParameterMissing("dbo", dbo);
    thrower.ifParameterMissing("filterBy", filterBy);
    thrower.ifParameterMissing("filterArgs", filterArgs);

    try {
      DMLTable dmlTable = dmlFactory.getTable(dbo);

      /*if ( dmlTable.isMultiRow( filterBy ) ) {
       thrower.unexpected( "Filter '" + filterBy
       + "' is defined as returning more than one row." );
       }*/

//      DMLStaticQuery dmlQuery = dmlFactory.getStaticQuery(dmlName);
//      Class dmoClass = dmlQuery.getDMOClass();
//
//      PreparedStatement stmt = stmtPool.get(dmlQuery, DML.STMT_UPDATE, null,
//          "NONE", tableName);

      PreparedStatement stmt = stmtPool.get(dmlTable, DML.STMT_CUSTOM_UPDATE,
          null, filterBy, null, tableName, setArgs);

      boolean hasVersion = dmlTable.hasVersion();
      DAOArgs version = null;

      if (hasVersion && ((version = dbo.nextVersion()) == null)) {
        thrower.unexpected(getErrorMessage(ERROR_DMO_HAS_NO_VERSION, dmlTable,
            DML.STMT_CUSTOM_UPDATE, filterBy, "", "", setArgs));
      }

      int retryCount = 0;
      boolean retry = false;
      do {
	      try {

	        int pos = filterArgs.bind(stmt, 1);


	        if (hasVersion) {
	          version.bind(stmt, pos);
	        }


	        int rowCount = stmt.executeUpdate();
	        if (rowCount > 0) {
	          connectionContext.setIsDirty();
	        }


	        if (logger.isDebugEnabled()) {
	          logger.debug(debugDML(methodDesc, dmlTable, DML.STMT_CUSTOM_UPDATE,
	              filterBy, "", (isNull(filterArgs) ? "" : filterArgs.toString()),
	              setArgs));
	        }


	        if (rowCount == 0) {
	          if (hasVersion && exists(dbo)) {

	            thrower.objectExpired(getErrorMessage(ERROR_VERSION_MISMATCH,
	                dmlTable, DML.STMT_CUSTOM_UPDATE, filterBy, "",
	                (isNull(filterArgs) ? "" : filterArgs.toString()), setArgs));

	          } else {

	            thrower.objectNotFound(getErrorMessage(ERROR_NOT_FOUND, dmlTable,
	                DML.STMT_CUSTOM_UPDATE, filterBy, "", (isNull(filterArgs) ? ""
	                    : filterArgs.toString()), setArgs));
	          }
	        }

	        if (rowCount > 1) {

	          thrower.unexpected(getErrorMessage(ERROR_MORE_THAN_ONE_ROW, dmlTable,
	              DML.STMT_CUSTOM_UPDATE, filterBy, "", (isNull(filterArgs) ? ""
	                  : filterArgs.toString()), setArgs));
	        }

	        // reset action field
	        dbo.actionNone();
	        retry = false;

	      } catch (SQLException e) {
	              if ((++retryCount) > LOCK_MAX_RETRIES) {
	            	  thrower.unexpected(getErrorMessage(e, dmlTable, DML.STMT_CUSTOM_UPDATE,
	          	            filterBy, "", (isNull(filterArgs) ? "" : filterArgs.toString()),
	          	            setArgs), e);
	              }else{


	      	    	if(logger.isDebugEnabled()){
	      	    		logger.debug("DAOImpl Custom Update(): Date Time: " + (new DateTime()).toString() + " RETRY: " + retryCount);
	      	    		logger.debug("ERROR IN GETTING RECORDS: EXCEPTION: " + e.getMessage());
	            		logger.debug("ERROR IN GETTING RECORDS: EXCEPTION: SQL ERROR CODE: " + e.getErrorCode());
	            		logger.debug("ERROR IN GETTING RECORDS: EXCEPTION: SQLSTATE: " + e.getSQLState());
	            	}
		              retry = true;

		              try {
		                Thread.sleep(LOCK_RETRY_WAIT);
		              } catch (InterruptedException ie) {
		              }
	              }
	      }
      } while (retry);
    } catch (DMLException e) {
      thrower.unexpected(e);
    }
  }


  /**
   * SJ: Changes to allow for multiple record update.
   * 12-11-2014
   *
   * If isMultiple = true, we will not fail on row count > 1
   */


  public void updateCustomMultiple(DBO dbo, DAOParamQueryArgs queryArgs, boolean isMultiple)
	      throws EPPIXSeriousException, EPPIXObjectExpiredException,
	      EPPIXObjectNotFoundException {

	  updateCustomMultiple(dbo, queryArgs, null, isMultiple);

	  }

	  public void updateCustomMultiple(DBO dbo, DAOParamQueryArgs queryArgs,
	      String tableName, boolean isMultiple) throws EPPIXSeriousException,
	      EPPIXObjectExpiredException, EPPIXObjectNotFoundException {

		  updateCustomMultiple(dbo, queryArgs.getFilterBy(), queryArgs, tableName, queryArgs
	        .getSetArgs(), isMultiple);

	  }

	  public void updateCustomMultiple(DBO dbo, String filterBy, DAOArgs filterArgs,
	      String tableName, String setArgs, boolean isMultiple) throws EPPIXSeriousException,
	      EPPIXObjectExpiredException, EPPIXObjectNotFoundException {
	    final String methodDesc = "updateCustom(DBO)";

	    thrower.ifParameterMissing("dbo", dbo);
	    thrower.ifParameterMissing("filterBy", filterBy);
	    thrower.ifParameterMissing("filterArgs", filterArgs);

	    try {
	      DMLTable dmlTable = dmlFactory.getTable(dbo);

	      /*if ( dmlTable.isMultiRow( filterBy ) ) {
	       thrower.unexpected( "Filter '" + filterBy
	       + "' is defined as returning more than one row." );
	       }*/

//	      DMLStaticQuery dmlQuery = dmlFactory.getStaticQuery(dmlName);
//	      Class dmoClass = dmlQuery.getDMOClass();
	//
//	      PreparedStatement stmt = stmtPool.get(dmlQuery, DML.STMT_UPDATE, null,
//	          "NONE", tableName);

	      PreparedStatement stmt = stmtPool.get(dmlTable, DML.STMT_CUSTOM_UPDATE,
	          null, filterBy, null, tableName, setArgs);

	      boolean hasVersion = dmlTable.hasVersion();
	      DAOArgs version = null;

	      if (hasVersion && ((version = dbo.nextVersion()) == null)) {
	        thrower.unexpected(getErrorMessage(ERROR_DMO_HAS_NO_VERSION, dmlTable,
	            DML.STMT_CUSTOM_UPDATE, filterBy, "", "", setArgs));
	      }

	      int retryCount = 0;
	      boolean retry = false;
	      do {
		      try {

		        int pos = filterArgs.bind(stmt, 1);


		        if (hasVersion) {
		          version.bind(stmt, pos);
		        }


		        int rowCount = stmt.executeUpdate();
//		        System.out.println("ROW COUNT TO BE UPDATED: " + rowCount);


		        if (logger.isDebugEnabled()) {
		          logger.debug(debugDML(methodDesc, dmlTable, DML.STMT_CUSTOM_UPDATE,
		              filterBy, "", (isNull(filterArgs) ? "" : filterArgs.toString()),
		              setArgs));
		        }


		        if (rowCount == 0) {
		          if (hasVersion && exists(dbo)) {

		            thrower.objectExpired(getErrorMessage(ERROR_VERSION_MISMATCH,
		                dmlTable, DML.STMT_CUSTOM_UPDATE, filterBy, "",
		                (isNull(filterArgs) ? "" : filterArgs.toString()), setArgs));

		          } else {

		            thrower.objectNotFound(getErrorMessage(ERROR_NOT_FOUND, dmlTable,
		                DML.STMT_CUSTOM_UPDATE, filterBy, "", (isNull(filterArgs) ? ""
		                    : filterArgs.toString()), setArgs));
		          }
		        }

//		        if (rowCount > 1) {
//
//		          thrower.unexpected(getErrorMessage(ERROR_MORE_THAN_ONE_ROW, dmlTable,
//		              DML.STMT_CUSTOM_UPDATE, filterBy, "", (isNull(filterArgs) ? ""
//		                  : filterArgs.toString()), setArgs));
//		        }

		        // reset action field
		        dbo.actionNone();
		        retry = false;

		      } catch (SQLException e) {
		              if ((++retryCount) > LOCK_MAX_RETRIES) {
		            	  thrower.unexpected(getErrorMessage(e, dmlTable, DML.STMT_CUSTOM_UPDATE,
		          	            filterBy, "", (isNull(filterArgs) ? "" : filterArgs.toString()),
		          	            setArgs), e);
		              }else{


		      	    	if(logger.isDebugEnabled()){
		      	    		logger.debug("DAOImpl Custom Update(): Date Time: " + (new DateTime()).toString() + " RETRY: " + retryCount);
		      	    		logger.debug("ERROR IN GETTING RECORDS: EXCEPTION: " + e.getMessage());
		            		logger.debug("ERROR IN GETTING RECORDS: EXCEPTION: SQL ERROR CODE: " + e.getErrorCode());
		            		logger.debug("ERROR IN GETTING RECORDS: EXCEPTION: SQLSTATE: " + e.getSQLState());
		            	}
			              retry = true;

			              try {
			                Thread.sleep(LOCK_RETRY_WAIT);
			              } catch (InterruptedException ie) {
			              }
		              }
		      }
	      } while (retry);
	    } catch (DMLException e) {
	      thrower.unexpected(e);
	    }
	  }

  public void update(DBO[] dbos) throws EPPIXSeriousException {
    update(dbos, null);
  }

  /**
   * Updates an array of {@link DBO DBOs}, by primary key, in the database.
   * The class of the first DBO element in the array, is used to consult the
   * {@link DMLFactory} to obtain a {@link DMLTable} definition, that will
   * provide a suitable UPDATE statement. If the underlying table has a
   * version number (used for optimistic locking) then the version number of
   * the DBO is incremented by 1.
   *
   * @param dbos (required) the array of DBOs to be updated, for which a
   *        table definition exists in the DMLFactory. All of the DBOs in
   *        the array must be of the same class.
   *
   * @throws EPPIXSeriousException if any of the required parameters is null;
   *         the DMLFactory is unable to provide an UPDATE statement; or an
   *         SQL error is detected.
   */
  public void update(DBO[] dbos, String tableName) throws EPPIXSeriousException {
    final String methodDesc = "update(DBO[])";
    boolean isDebugEnabled = logger.isDebugEnabled();

    if ((dbos == null) || (dbos.length == 0) || (dbos[0] == null)) {
      thrower.unexpected("Parameter 'dbos' is required.");
    }

    try {
      DMLTable dmlTable = dmlFactory.getTable(dbos[0]);
      PreparedStatement stmt = stmtPool.get(dmlTable, DML.STMT_UPDATE, null,
          "filterByPrimaryKey", tableName);
      boolean hasVersion = dmlTable.hasVersion();
      DAOArgs version = null;

      try {
        for (int i = 0; i < dbos.length; ++i) {
          if (dbos[i] == null) {
            continue;
          }

          if (hasVersion && ((version = dbos[i].nextVersion()) == null)) {

            thrower.unexpected(getErrorMessage(ERROR_DMO_HAS_NO_VERSION,
                dmlTable, DML.STMT_UPDATE, "filterByPrimaryKey", "", ""));
          }

          DAOArgs fields = dbos[i].fields();
          DAOArgs primaryKey = dbos[i].primaryKey();

          int pos = fields.bind(stmt, 1);
          pos = primaryKey.bind(stmt, pos);

          if (hasVersion) {
            version.bind(stmt, pos);
          }

          stmt.addBatch();

          if (isDebugEnabled) {
            logger.debug(debugDML(methodDesc, dmlTable, DML.STMT_UPDATE,
                "filterByPrimaryKey", "", toString(toString(toString(fields),
                    primaryKey), version)));
          }
        }

        stmt.executeBatch();
        connectionContext.setIsDirty();

        // reset action fields
        for (int i = 0; i < dbos.length; ++i) {
          if (dbos[i] != null) {
            dbos[i].actionNone();
          }
        }
      } catch (SQLException e) {

        thrower.unexpected(getErrorMessage(e, dmlTable, DML.STMT_UPDATE,
            "filterByPrimaryKey", "", "|<Array>"), e);
      }
    } catch (DMLException e) {
      thrower.unexpected(e);
    }
  }

  /**
   * Updates an List of {@link DBO DBOs}, by primary key, in the
   * database. The class of the first DBO element in the collection, is used
   * to consult the {@link DMLFactory} to obtain a {@link DMLTable}
   * definition, that will provide a suitable UPDATE statement. If the
   * underlying table has a version number (used for optimistic locking)
   * then the version number of the DBO is incremented by 1.
   *
   * @param dbos (required) the List of DBOs to be updated, for which a
   *        table definition exists in the DMLFactory. All of the DBOs in
   *        the array must be of the same class.
   *
   * @throws EPPIXSeriousException if any of the required parameters is null;
   *         the DMLFactory is unable to provide an UPDATE statement; or an
   *         SQL error is detected.
   */
  public void update(List dbos) throws EPPIXSeriousException {
    update((DBO[]) dbos.toArray(new DBO[dbos.size()]));
  }

  public void delete(DBO dbo) throws EPPIXSeriousException,
      EPPIXObjectExpiredException, EPPIXObjectNotFoundException {
    delete(dbo, null);
  }

  /**
   * Deletes a single {@link DBO}, by its primary key, from the database. The
   * class of the DBO is used to consult the {@link DMLFactory} to obtain a
   * {@link DMLTable} definition, that will provide a suitable DELETE
   * statement.
   *
   * @param dbo (required) the DBO to be deleted, for which a table
   *        definition exists in the DMLFactory.
   *
   * @throws EPPIXSeriousException if any of the required parameters is null;
   *         the DMLFactory is unable to provide a DELETE statement; or an
   *         SQL error is detected.
   * @throws EPPIXObjectExpiredException if the version number contained in
   *         the DBO does not match that found in the database. This is an
   *         optimistic lock exception.
   * @throws EPPIXObjectNotFoundException if the DBO does not exist in the
   *         database.
   */
  public void delete(DBO dbo, String tableName) throws EPPIXSeriousException,
      EPPIXObjectExpiredException, EPPIXObjectNotFoundException {
    final String methodDesc = "delete(DBO)";

    if (dbo == null) {
      thrower.unexpected("Parameter 'dbo' is required.");
    }

    try {
      DMLTable dmlTable = dmlFactory.getTable(dbo);
      PreparedStatement stmt = stmtPool.get(dmlTable, DML.STMT_DELETE, null,
          "filterByPrimaryKey", tableName);

      boolean hasVersion = dmlTable.hasVersion();
      DAOArgs version = null;

      if (hasVersion && ((version = dbo.nextVersion()) == null)) {
        thrower.unexpected(getErrorMessage(ERROR_DMO_HAS_NO_VERSION, dmlTable,
            DML.STMT_DELETE, "filterByPrimaryKey", "", ""));
      }

      DAOArgs primaryKey = dbo.primaryKey();

      try {
        int pos = primaryKey.bind(stmt, 1);

        if (hasVersion) {
          version.bind(stmt, pos);
        }

        int rowCount = stmt.executeUpdate();
        if (rowCount > 0) {
          connectionContext.setIsDirty();
        }

        if (logger.isDebugEnabled()) {
          logger
              .debug(debugDML(methodDesc, dmlTable, DML.STMT_DELETE,
                  "filterByPrimaryKey", "", toString(toString(primaryKey),
                      version)));
        }

        if (rowCount == 0) {

          if (hasVersion && exists(dbo)) {

            thrower.objectExpired(getErrorMessage(ERROR_VERSION_MISMATCH,
                dmlTable, DML.STMT_DELETE, "filterByPrimaryKey", "", toString(
                    toString(primaryKey), version)));

          } else {

            thrower.objectNotFound(getErrorMessage(ERROR_NOT_FOUND, dmlTable,
                DML.STMT_DELETE, "filterByPrimaryKey", "", toString(
                    toString(primaryKey), version)));
          }
        }

        if (rowCount > 1) {

          thrower.unexpected(getErrorMessage(ERROR_MORE_THAN_ONE_ROW, dmlTable,
              DML.STMT_DELETE, "filterByPrimaryKey", "", toString(
                  toString(primaryKey), version)));
        }

        // reset action field
        dbo.actionNone();

      } catch (SQLException e) {

        thrower.unexpected(getErrorMessage(e, dmlTable, DML.STMT_DELETE,
            "filterByPrimaryKey", "", toString(toString(primaryKey), version)),
            e);
      }
    } catch (DMLException e) {
      thrower.unexpected(e);
    }
  }

  public void delete(DBO[] dbos) throws EPPIXSeriousException {
    delete(dbos, null);
  }

  /**
   * Deletes an array of {@link DBO DBOs}, by primary key, from the database.
   * The class of the first DBO element in the array, is used to consult the
   * {@link DMLFactory} to obtain a {@link DMLTable} definition, that will
   * provide an appropriate DELETE statement.
   *
   * @param dbos (required) the array of DBOs to be deleted, for which a
   *        table definition exists in the DMLFactory. All of the DBOs in
   *        the array must be of the same class.
   *
   * @throws EPPIXSeriousException if any of the required parameters is null;
   *         the DMLFactory is unable to provide a DELETE statement; or an
   *         SQL error is detected.
   */
  public void delete(DBO[] dbos, String tableName) throws EPPIXSeriousException {
    final String methodDesc = "delete(DBO[])";
    boolean isDebugEnabled = logger.isDebugEnabled();

    if ((dbos == null) || (dbos.length == 0) || (dbos[0] == null)) {
      thrower.unexpected("Parameter 'dbos' is required.");
    }

    try {
      DMLTable dmlTable = dmlFactory.getTable(dbos[0]);
      PreparedStatement stmt = stmtPool.get(dmlTable, DML.STMT_DELETE, null,
          "filterByPrimaryKey", tableName);
      boolean hasVersion = dmlTable.hasVersion();
      DAOArgs version = null;

      try {
        for (int i = 0; i < dbos.length; ++i) {
          if (dbos[i] == null) {
            continue;
          }

          if (hasVersion && ((version = dbos[i].nextVersion()) == null)) {
            thrower.unexpected(getErrorMessage(ERROR_DMO_HAS_NO_VERSION,
                dmlTable, DML.STMT_DELETE, "filterByPrimaryKey", "", ""));
          }

          DAOArgs primaryKey = dbos[i].primaryKey();
          int pos = primaryKey.bind(stmt, 1);

          if (hasVersion) {
            version.bind(stmt, pos);
          }

          stmt.addBatch();

          if (isDebugEnabled) {

            logger.debug(debugDML(methodDesc, dmlTable, DML.STMT_DELETE,
                "filterByPrimaryKey", "", toString(toString(primaryKey),
                    version)));
          }
        }

        stmt.executeBatch();
        connectionContext.setIsDirty();

        // reset action fields
        for (int i = 0; i < dbos.length; ++i) {
          if (dbos[i] != null) {
            dbos[i].actionNone();
          }
        }
      } catch (SQLException e) {
        thrower.unexpected(getErrorMessage(e, dmlTable, DML.STMT_DELETE,
            "filterByPrimaryKey", "", "|<Array>"), e);
      }
    } catch (DMLException e) {
      thrower.unexpected(e);
    }
  }

  /**
   * Deletes an List of {@link DBO DBOs}, by primary key, from the
   * database. The class of the first DBO element in the collection, is used
   * to consult the {@link DMLFactory} to obtain a {@link DMLTable}
   * definition, that will provide an appropriate DELETE statement.
   *
   * @param dbos (required) the collection of DBOs to be deleted, for which a
   *        table definition exists in the DMLFactory. All of the DBOs in
   *        the collection must be of the same class.
   *
   * @throws EPPIXSeriousException if any of the required parameters is null;
   *         the DMLFactory is unable to provide a DELETE statement; or an
   *         SQL error is detected.
   */
  public void delete(List dbos) throws EPPIXSeriousException {
    delete((DBO[]) dbos.toArray(new DBO[dbos.size()]));
  }

  public int delete(String dmlName, String filterBy, DAOArgs filterArgs)
      throws EPPIXSeriousException {
    return delete(dmlName, filterBy, filterArgs, null);
  }

  /**
   * Deletes 0 or more rows from the database as identified by the
   * {@linkPlain DMLParamQuery parameterised SQL query}.
   *
   * @param dmlName (required) the name of the parameterised query or table
   *        defined in the DMLFactory.
   * @param filterBy name of the filter defined for the query or table that
   *        will be used to delete the row from the database.
   * @param filterArgs arguments that satisfy the placeholder(s) of the
   *        filter as defined in the DMLFactory.
   *
   * @return the number of rows deleted.
   *
   * @throws EPPIXSeriousException if any of the required parameters is null;
   *         the named DML does not exist in the DMLFactory; the named DML
   *         does not refer to a parameterised query; or an SQL error is
   *         detected.
   */
  public int delete(String dmlName, String filterBy, DAOArgs filterArgs,
      String tableName) throws EPPIXSeriousException {
    final String methodDesc = "delete(param SQL)";

    if (isNull(dmlName)) {
      thrower.unexpected("Parameter 'dmlName' is required.");
    }

    int rowCount = 0;

    try {
      DMLTable dmlTable = dmlFactory.getTable(dmlName);

      // disallow for single row filters or tables that have version
      // numbers ???
      // if (!dmlTable.isMultiRow(filterBy) || dmlTable.hasVersion())
      PreparedStatement stmt = stmtPool.get(dmlTable, DML.STMT_DELETE, null,
          filterBy, tableName);

      int retryCount = 0;
      boolean retry = false;
	      do {

		      try {
		        if (!isNull(filterArgs)) {
		          filterArgs.bind(stmt, 1);
		        }


		        rowCount = stmt.executeUpdate();
		        if (rowCount > 0) {
		          connectionContext.setIsDirty();
		        }

		        if (logger.isDebugEnabled()) {

		          logger.debug(debugDML(methodDesc, dmlTable, DML.STMT_DELETE,
		              filterBy, "", toString(filterArgs)));
		        }

		        retry = false;

		    } catch (SQLException e) {
		        if ((++retryCount) > LOCK_MAX_RETRIES) {
		        		thrower.unexpected(getErrorMessage(e, dmlTable, DML.STMT_DELETE,
		        				filterBy, "", toString(filterArgs)), e);
		        }else{


			    	if(logger.isDebugEnabled()){
			    		logger.debug("DAOImpl Custom Update(): Date Time" + (new DateTime()).toString() + " RETRY: " + retryCount);
			    		logger.debug("ERROR IN DELETING RECORDS: EXCEPTION: " + e.getMessage());
			    		logger.debug("ERROR IN DELETING RECORDS: EXCEPTION: SQL ERROR CODE: " + e.getErrorCode());
			    		logger.debug("ERROR IN DELETING RECORDS: EXCEPTION: SQLSTATE: " + e.getSQLState());
		      	}
		            retry = true;

		            try {
		              Thread.sleep(LOCK_RETRY_WAIT);
		            } catch (InterruptedException ie) {
		            }
		        }
		    }
		} while (retry);

    } catch (DMLException e) {
      thrower.unexpected(e);
    }

    return rowCount;
  }

  public int execute(String dmlName, DAOArgs stmtArgs)
      throws EPPIXSeriousException {
    return execute(dmlName, stmtArgs, null);
  }

  /**
   * Executes a {@linkPlain DMLStaticUpdate static SQL update} defined in the
   * {@link DMLFactory}.
   *
   * @param dmlName (required) the name of the static SQL update defined in
   *        the DMLFactory.
   * @param stmtArgs arguments that satisfy the placeholder(s) of the UPDATE
   *        or DELETE statement defined in the DMLFactory.
   *
   * @return the number of rows affected by the update.
   *
   * @throws EPPIXSeriousException if any of the required parameters is null;
   *         the named DML does not exist in the DMLFactory; the named DML
   *         does not refer to a static SQL update; or an SQL error is
   *         detected.
   */
  public int execute(String dmlName, DAOArgs stmtArgs, String tableName)
      throws EPPIXSeriousException {
    final String methodDesc = "execute(static SQL)";

    if (isNull(dmlName)) {
      thrower.unexpected("Parameter 'dmlName' is required.");
    }

    int rowCount = 0;

    try {
      DMLStaticUpdate dmlUpdate = dmlFactory.getStaticUpdate(dmlName);

      PreparedStatement stmt = stmtPool.get(dmlUpdate, DML.STMT_UPDATE, null,
          tableName);

      try {
        if (!isNull(stmtArgs)) {
          stmtArgs.bind(stmt, 1);
        }

        rowCount = stmt.executeUpdate();
        if (rowCount > 0) {
          connectionContext.setIsDirty();
        }

        if (logger.isDebugEnabled()) {

          logger.debug(debugDML(methodDesc, dmlUpdate, DML.STMT_UPDATE, "", "",
              toString(stmtArgs)));
        }

      } catch (SQLException e) {

        thrower.unexpected(getErrorMessage(e, dmlUpdate, DML.STMT_UPDATE, "",
            "", toString(stmtArgs)), e);
      }
    } catch (DMLException e) {
      thrower.unexpected(e);
    }

    return rowCount;
  }

  /**
   * Executes a {@linkPlain DMLDynamicUpdate dynamic SQL update} defined in
   * the {@link DMLFactory}.
   *
   * @param dmlName (required) the name of the dynamic SQL update defined in
   *        the DMLFactory.
   * @param args (required) string arguments that are passed to the dynamic
   *        update class (DMLDynamicUpdate), to enable it to compose an
   *        appropriate SQL UPDATE or DELETE statament.
   *
   * @return the number of rows affected by the update.
   *
   * @throws EPPIXSeriousException if any of the required parameters is null;
   *         the named DML does not exist in the DMLFactory; the named DML
   *         does not refer to a dynamic SQL update; or an SQL error is
   *         detected.
   */
  public int execute(String dmlName, String[] args)
      throws EPPIXSeriousException {
    final String methodDesc = "execute(dynamic SQL)";

    if (isNull(dmlName)) {
      thrower.unexpected("Parameter 'dmlName' is required.");
    }

    if (isNull(args)) {
      thrower.unexpected("Parameter 'args' is required.");
    }

    int rowCount = 0;

    try {
      DMLDynamicUpdate dmlUpdate = dmlFactory.getDynamicUpdate(dmlName);
      String stmtString = dmlUpdate.getStmtString(args);
      DAOArgs stmtArgs = dmlUpdate.getStmtArgs(args);

      try {
        PreparedStatement stmt = conn.prepareStatement(commentSql(dmlName,
            stmtString));

        if (!isNull(stmtArgs)) {
          stmtArgs.bind(stmt, 1);
        }

        rowCount = stmt.executeUpdate();
        if (rowCount > 0) {
          connectionContext.setIsDirty();
        }

        if (logger.isDebugEnabled()) {

          logger.debug(debugDML(methodDesc, dmlUpdate, stmtString,
              toString(stmtArgs)));
        }

        stmt.close();

      } catch (SQLException e) {

        thrower.unexpected(getErrorMessage(e, dmlUpdate, stmtString,
            toString(stmtArgs)), e);
      }
    } catch (DMLException e) {
      thrower.unexpected(e);
    }

    return rowCount;
  }

  /**
   * Performs an action on a {@link DBO} according to its {@link DMO#_action}
   * field.
   *
   * @param dbo (required) the DBO to be inserted, for which a table
   *        definition exists in the DMLFactory.
   *
   * @throws EPPIXSeriousException if any of the required parameters is null;
   *         the DMLFactory is unable to provide an INSERT statement; or an
   *         SQL error is detected.
   * @throws EPPIXObjectExpiredException if the version number contained in
   *         the DBO does not match that found in the database. This is an
   *         optimistic lock exception.
   * @throws EPPIXObjectNotFoundException if the DBO does not exist in the
   *         database.
   */
  public void action(DBO dbo) throws EPPIXSeriousException,
      EPPIXObjectExpiredException, EPPIXObjectNotFoundException {
    switch (dbo.getAction()) {
    case DMO.ACTION_INSERT:
      insert(dbo);

      break;

    case DMO.ACTION_UPDATE:
      update(dbo);

      break;

    case DMO.ACTION_DELETE:
      delete(dbo);

      break;
    }
  }

  public void action(List dbos) throws EPPIXSeriousException {
    action(dbos, null);
  }

  /**
   * For each {@link DBO} in the List an action is performed according
   * to its {@link DMO#_action} field.
   *
   * @param dbos (required) the List of DBOs to be actioned, for which a
   *        table definition exists in the DMLFactory. All of the DBOs in
   *        the collection must be of the same class.
   *
   * @throws EPPIXSeriousException if any of the required parameters is null;
   *         the DMLFactory is unable to provide appropriate statements; or
   *         an SQL error is detected.
   */
  public void action(List dbos, String tblName) throws EPPIXSeriousException {
    final String methodDesc = "action(List)";
    boolean isDebugEnabled = logger.isDebugEnabled();

    if ((dbos == null) || dbos.isEmpty() || (dbos.get(0) == null)) {
      thrower.unexpected("Parameter 'dbos' is required.");
    }

    try {
      DMLTable dmlTable = dmlFactory.getTable((DBO) dbos.get(0));
      //			String tableName = dmlTable.getTableName();
      //			boolean hasGeneratedKey = dmlTable.hasGeneratedKey();
      boolean hasVersion = dmlTable.hasVersion();

      PreparedStatement insStmt = stmtPool.get(dmlTable, DML.STMT_INSERT, null,
          tblName);
      PreparedStatement updStmt = stmtPool.get(dmlTable, DML.STMT_UPDATE, null,
          "filterByPrimaryKey", tblName);
      PreparedStatement delStmt = stmtPool.get(dmlTable, DML.STMT_DELETE, null,
          "filterByPrimaryKey", tblName);

      int insCount = 0;
      int updCount = 0;
      int delCount = 0;

      DAOArgs primaryKey = null;
      DAOArgs dboVersion = null;
      DAOArgs dboFields = null;
      int pos;

      for (Iterator i = dbos.iterator(); i.hasNext();) {
        DBO dbo = (DBO) i.next();

        if (dbo != null) {
          switch (dbo.getAction()) {
          case DMO.ACTION_INSERT:

            try {
              //							if (hasGeneratedKey) {
              //								dbo.generatedKey(keyDispenser.useNext(tableName));
              //							}

              if (hasVersion) {
                dbo.initVersion();
              }

              dboFields = dbo.fields();
              dboFields.bind(insStmt, 1);
              insStmt.addBatch();
              ++insCount;

              if (isDebugEnabled) {
                logger.debug(debugDML(methodDesc, dmlTable, DML.STMT_INSERT,
                    "", "", dboFields.toString()));
              }
            } catch (SQLException e) {
              thrower.unexpected(getErrorMessage(e, dmlTable, DML.STMT_INSERT,
                  "", "", dboFields.toString()));
              //						} catch (DMOKeyDispenserException e) {
              //							thrower.unexpected(e);
            }

            break;

          case DMO.ACTION_UPDATE:

            try {
              if (hasVersion && ((dboVersion = dbo.nextVersion()) == null)) {
                thrower.unexpected(getErrorMessage(ERROR_DMO_HAS_NO_VERSION,
                    dmlTable, DML.STMT_UPDATE, "filterByPrimaryKey", "", ""));
              }

              dboFields = dbo.fields();
              primaryKey = dbo.primaryKey();
              pos = dboFields.bind(updStmt, 1);
              pos = primaryKey.bind(updStmt, pos);

              if (hasVersion) {
                dboVersion.bind(updStmt, pos);
              }

              updStmt.addBatch();
              ++updCount;

              if (isDebugEnabled) {
                logger.debug(debugDML(methodDesc, dmlTable, DML.STMT_UPDATE,
                    "filterByPrimaryKey", "", dboFields.toString()
                        + primaryKey.toString()
                        + (hasVersion ? dboVersion.toString() : "")));
              }
            } catch (SQLException e) {
              thrower.unexpected(getErrorMessage(e, dmlTable, DML.STMT_UPDATE,
                  "filterByPrimaryKey", "", dboFields.toString()
                      + primaryKey.toString()
                      + (hasVersion ? dboVersion.toString() : "")));
            }

            break;

          case DMO.ACTION_DELETE:

            try {
              if (hasVersion && ((dboVersion = dbo.nextVersion()) == null)) {
                thrower.unexpected(getErrorMessage(ERROR_DMO_HAS_NO_VERSION,
                    dmlTable, DML.STMT_DELETE, "filterByPrimaryKey", "", ""));
              }

              primaryKey = dbo.primaryKey();
              pos = primaryKey.bind(delStmt, 1);

              if (hasVersion) {
                dboVersion.bind(updStmt, pos);
              }

              delStmt.addBatch();
              ++delCount;

              if (isDebugEnabled) {
                logger.debug(debugDML(methodDesc, dmlTable, DML.STMT_DELETE,
                    "filterByPrimaryKey", "", primaryKey.toString()
                        + (hasVersion ? dboVersion.toString() : "")));
              }
            } catch (SQLException e) {
              thrower.unexpected(getErrorMessage(e, dmlTable, DML.STMT_DELETE,
                  "filterByPrimaryKey", "", primaryKey.toString()
                      + (hasVersion ? dboVersion.toString() : "")));
            }

            break;
          }
        }
      }

      if (delCount > 0) {
        try {
          delStmt.executeBatch();
          connectionContext.setIsDirty();
        } catch (SQLException e) {
          thrower.unexpected(getErrorMessage(e, dmlTable, DML.STMT_DELETE,
              "filterByPrimaryKey", "", "|<Array>"));
        }
      }

      if (updCount > 0) {
        try {
          updStmt.executeBatch();
          connectionContext.setIsDirty();
        } catch (SQLException e) {
          thrower.unexpected(getErrorMessage(e, dmlTable, DML.STMT_UPDATE,
              "filterByPrimaryKey", "", "|<Array>"));
        }
      }

      if (insCount > 0) {
        try {
          insStmt.executeBatch();
          connectionContext.setIsDirty();
        } catch (SQLException e) {
          thrower.unexpected(getErrorMessage(e, dmlTable, DML.STMT_INSERT, "",
              "", "|<Array>"));
        }
      }

      // reset action fields
      for (Iterator i = dbos.iterator(); i.hasNext();) {
        DMO dbo = (DMO) i.next();

        if (dbo != null) {
          dbo.actionNone();
        }
      }
    } catch (DMLException e) {
      thrower.unexpected(e);
    }
  }

  /**
   * Provides the wildcard character used by the database to match any
   * sequence.
   *
   * @return wildcard string.
   */
  public String wildcardForAnySequence() {
    return "%";
  }

  /**
   * Provides the wildcard character used by the database to match a single
   * character.
   *
   * @return wildcard string.
   */
  public String wildcardForSingleChar() {
    return "_";
  }

  /**
   * Populates the fields in a {@link DMO} with values from the current row
   * of a ResultSet.
   *
   * @param dmo data model object to populate.
   * @param rs ResultSet containing current row.
   *
   * @return the populated DMO
   *
   * @throws SQLException if a SQL error is detected.
   */
  protected DMO fetchDMO(DMO dmo, ResultSet resultSet) throws SQLException {

//    logger.debug("fetchDMO( dmo, resultSet)");

    int[] fieldTypes = dmo.fieldTypes();
    Object[] fields = new Object[fieldTypes.length];

    for (int i = 0; i < fieldTypes.length; ++i) {

//    	System.out.println("FIELD TYPE IN DAOImpl: " + i + " " + fieldTypes[i]);
//    	System.out.println("FIELD NAME IN DAOImpl: " + i + " " + fields[i]);

      switch (fieldTypes[i] & DMO.FIELD_TYPE) {
      
      case DMO.FIELD_TYPE_STRING:
        fields[i] = resultSet.getString(i + 1);
        break;

      case DMO.FIELD_TYPE_DATE:
        java.sql.Timestamp dateVal = resultSet.getTimestamp(i + 1);
        if (dateVal != null) {
          fields[i] = new java.util.Date(dateVal.getTime());
        }
        break;

      case DMO.FIELD_TYPE_DATEONLY:
        java.sql.Date dateOnlyVal = resultSet.getDate(i + 1);
        if (dateOnlyVal != null) {
          fields[i] = new com.eppixcomm.eppix.common.util.Date(dateOnlyVal.getTime());
        }
        break;

      case DMO.FIELD_TYPE_DATETIME:
        java.sql.Timestamp dateTimeVal = resultSet.getTimestamp(i + 1);
        if (dateTimeVal != null) {
          fields[i] = new com.eppixcomm.eppix.common.util.DateTime(dateTimeVal
              .getTime());
        }
        break;

      case DMO.FIELD_TYPE_TIMEONLY:
        java.sql.Time timeOnlyVal = resultSet.getTime(i + 1);
        if (timeOnlyVal != null) {
          fields[i] = new com.eppixcomm.eppix.common.util.Time(timeOnlyVal.getTime());
        }
        break;

      case DMO.FIELD_TYPE_BIGDECIMAL:
        fields[i] = resultSet.getBigDecimal(i + 1);
        break;

      case DMO.FIELD_TYPE_SHORT:
//    	  System.out.println("SHORT FROM RESULTSET: " + resultSet.getShort(i + 1));
        short shortVal = resultSet.getShort(i + 1);
        if (!resultSet.wasNull()) {
          fields[i] = new Short(shortVal);
        }
        break;

      case DMO.FIELD_TYPE_INTEGER:

    	  try {
	          int intVal = resultSet.getInt(i + 1);
	          if (!resultSet.wasNull()) {
	            fields[i] = new Integer(intVal);
	          }
	          break;
    	  } catch (Exception e) {
//  			System.out.println("ERROR 1: " + resultSet.getString(i + 1) + " = " + (i + 1));
  			e.printStackTrace();
  		}
          
//        int intVal = 0;
//		try {
//			System.out.println("ERROR: " + resultSet.getInt(i + 1));
//			System.out.println("COUNTER: " + i + 1);
//			intVal = resultSet.getInt(i);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			System.out.println("ERROR 1: " + resultSet.getString(i + 1) + " = " + i + 1);
//			System.out.println("FIELD 1: " + fields[i]  + " = " + i + 1);
//			e.printStackTrace();
//			
//		}
//		
//        if (!resultSet.wasNull()) {
//          fields[i] = new Integer(intVal);
//        }
//        break;

      case DMO.FIELD_TYPE_LONG:
        long longVal = resultSet.getLong(i + 1);
        if (!resultSet.wasNull()) {
          fields[i] = new Long(longVal);
        }
        break;

      case DMO.FIELD_TYPE_FLOAT:
        float floatVal = resultSet.getFloat(i + 1);
        if (!resultSet.wasNull()) {
          fields[i] = new Float(floatVal);
        }
        break;

      case DMO.FIELD_TYPE_DOUBLE:
        double doubleVal = resultSet.getDouble(i + 1);
        if (!resultSet.wasNull()) {
          fields[i] = new Double(doubleVal);
        }
        break;

      case DMO.FIELD_TYPE_BOOLEAN:
        boolean booleanVal = resultSet.getBoolean(i + 1);
        if (!resultSet.wasNull()) {
          fields[i] = new Boolean(booleanVal);
        }
        break;

      case DMO.FIELD_TYPE_TEXT:
        Clob clob = resultSet.getClob(i + 1);
        if (clob != null && clob.length() > 0) {
          fields[i] = clob.getSubString((long) 1, (int) clob.length());
        } else {
          fields[i] = null;
        }

        break;
      }
    }

    logger.debug("ROW COMPLETED AND DMO CREATED: ROW: " + fields.toString());

    dmo.set(fields);

    return dmo;
  }

  /**
   * Binds the specified 'args' to the statement 'ps' starting with the
   * placeholder at position 'pos'.
   *
   * @param args variable number of arguments that can be bound to prepared
   *        statements.
   * @param ps prepared statement.
   * @param pos position of the placeholder in the prepared statement at which
   *        to commence binding arguments.
   *
   * @return the next position at which to bind arguments.
   *
   * @throws SQLException
   */
  private static int bind(DAOArgs args, PreparedStatement ps, int pos)
      throws SQLException {

    if (args != null && args.count > 0) {
      return args.bind(ps, pos);
    }
    return pos;
  }

  /**
   * Converts the specified 'args' to their String representation. If 'args' is
   * null or contains no arguments, then the empty string is returned.
   *
   * @param args variable number of arguments that can be bound to prepared
   *        statements.
   *
   * @return string representation of arguments.
   */
  private static String toString(DAOArgs args) {
    if (args != null) {
      return args.toString();
    }
    return "";
  }

  private static String toString(String argString, DAOArgs args) {
    if (args != null) {
      return args.toString(argString);
    }
    return argString;
  }

  /**
   * Instantiates a {@link DMO} and populates its fields with values from the
   * current row of a ResultSet.
   *
   * @param dmoClass class of the DMO to be instantiated.
   * @param rs ResultSet containing current row.
   *
   * @return the instantiated and populated DMO.
   *
   * @throws EPPIXSeriousException if the DMO can not be instantiated.
   * @throws SQLException if a SQL error is detected.
   */
  protected DMO fetchDMO(Class dmoClass, ResultSet resultSet)
      throws EPPIXSeriousException, SQLException {
    DMO dmo = null;

    try {
      dmo = (DMO) dmoClass.newInstance();
      fetchDMO(dmo, resultSet);
    } catch (InstantiationException e) {
      thrower.unexpected(e);
    } catch (IllegalAccessException e) {
      thrower.unexpected(e);
    }

    return dmo.toDMO();
  }

  /**
   * Composes an error message.
   *
   * @param errCode internal error code.
   *
   * @return error message
   */
  protected static String getErrorMessage(int errCode) {
    switch (errCode) {
    case ERROR_SQL:
      return "SQL Error:";

    case ERROR_MORE_THAN_ONE_ROW:
      return "More than one row was processed by single row operation:";

    case ERROR_NOT_FOUND:
      return "No data found:";

    case ERROR_VERSION_MISMATCH:
      return "Row version mismatch:";

    case ERROR_LOCK_NOT_ACQUIRED:
      return "Lock not acquired after " + LOCK_MAX_RETRIES + " retries:";

    case ERROR_DMO_HAS_NO_VERSION:
      return "DMO failed to provide its version number:";

    case ERROR_CLOB_NOT_INIT:
      return "CLOB not initialised:";

    default:
      return "Unknown error:";
    }
  }

  /**
   * Composes an error message.
   *
   * @param e SQL exception to be described.
   *
   * @return error message.
   */
  protected static String getErrorMessage(SQLException e) {
    return getErrorMessage(ERROR_SQL) + " Reason: " + e.getMessage()
        + ", SQL State: " + e.getSQLState() + ", Vendor Code: "
        + e.getErrorCode();
  }

  /**
   * Composes an error message.
   *
   * @param e SQL exception to be described.
   * @param dml the DML object involved.
   * @param stmt the SQL statement that caused the exception.
   * @param args arguments provided for the placeholders in the SQL statement
   *        string.
   *
   * @return error message.
   */
  protected static String getErrorMessage(SQLException e, DML dml, String stmt,
      String args) {
    return getErrorMessage(e) + ", DML Name: " + dml.getName()
        + ", SQL Statement: " + stmt + ", Argument(s): "
        + ((isNull(args)) ? "None" : "|" + args + "|");
  }

  /**
   * Composes an error message.
   *
   * @param errCode internal error code.
   * @param dml the DML object involved.
   * @param stmt the SQL statement.
   * @param args arguments provided for the placeholders in the SQL statement
   *        string.
   *
   * @return error message.
   */
  protected static String getErrorMessage(int errCode, DML dml, String stmt,
      String args) {
    return getErrorMessage(errCode) + ", DML Name: " + dml.getName()
        + ", SQL Statement: " + stmt + ", Argument(s): "
        + ((isNull(args)) ? "None" : "|" + args + "|");
  }

  /**
   * Composes an error message.
   *
   * @param errCode internal error code.
   * @param dml the DML object involved.
   * @param stmtType the DML statement type.
   * @param filterBy name of the filter in the DMLFactory.
   * @param orderBy name of the sort order in the DMLFactory.
   * @param args arguments bound to the SQL statement.
   *
   * @return error message.
   *
   * @throws DMLException if the DMLFactory is unable to provide the SQL
   *         statement.
   */
  protected static String getErrorMessage(int errCode, DML dml, int stmtType,
      String filterBy, String orderBy, String args) throws DMLException {
    return getErrorMessage(errCode) + " DML Name: " + dml.getName()
        + ", SQL Statement: "
        + dml.getStmtString(stmtType, filterBy, orderBy, null, null, null)
        + ", Argument(s): " + ((isNull(args)) ? "None" : "|" + args + "|");
  }

  protected static String getErrorMessage(int errCode, DML dml, int stmtType,
      String filterBy, String orderBy, String args, String setArgs)
      throws DMLException {
    return getErrorMessage(errCode) + " DML Name: " + dml.getName()
        + ", SQL Statement: "
        + dml.getStmtString(stmtType, filterBy, orderBy, null, null, setArgs)
        + ", Argument(s): " + ((isNull(args)) ? "None" : "|" + args + "|");
  }

  /**
   * Composes an error message.
   *
   * @param e SQL exception to describe.
   * @param dml the DML object involved.
   * @param stmtType the DML statement type.
   * @param filterBy name of the filter in the DMLFactory.
   * @param orderBy name of the sort order in the DMLFactory.
   * @param args arguments bound to the SQL statement.
   *
   * @return error message.
   *
   * @throws DMLException if the DMLFactory is unable to provide the SQL
   *         statement.
   */
  protected static String getErrorMessage(SQLException e, DML dml,
      int stmtType, String filterBy, String orderBy, String args)
      throws DMLException {
    return getErrorMessage(e) + ", DML Name: " + dml.getName()
        + ", SQL Statement: "
        + dml.getStmtString(stmtType, filterBy, orderBy, null, null, null)
        + ", Argument(s): " + ((isNull(args)) ? "None" : "|" + args + "|");
  }

  protected static String getErrorMessage(SQLException e, DML dml,
      int stmtType, String filterBy, String orderBy, String args, String setArgs)
      throws DMLException {
    return getErrorMessage(e) + ", DML Name: " + dml.getName()
        + ", SQL Statement: "
        + dml.getStmtString(stmtType, filterBy, orderBy, null, null, setArgs)
        + ", Argument(s): " + ((isNull(args)) ? "None" : "|" + args + "|");
  }

  /**
   * Outputs DML to the log for debug.
   *
   * @param methodDesc DOCUMENT ME!
   * @param dml the DML object proividing the SQL statement.
   * @param stmtType DML statement type.
   * @param filterBy name of the filter.
   * @param orderBy name of the sort order.
   * @param args arguments provided for the placeholders in the SQL statement
   *        string.
   *
   * @return DOCUMENT ME!
   *
   * @throws DMLException if the DMLFactory is unable to provide the SQL
   *         statement.
   */
  protected static String debugDML(String methodDesc, DML dml, int stmtType,
      String filterBy, String orderBy, String args) throws DMLException {

//	System.out.println(methodDesc + ": DML Name: " + dml.getName()
//	        + "\nExecute SQL Statement: "
//	        + dml.getStmtString(stmtType, filterBy, orderBy, null, null, null)
//	        + "\nArgument(s): "
//	        + ((args == null || args.length() == 0) ? "None" : "|" + args + "|"));


    return methodDesc + ": DML Name: " + dml.getName()
        + "\nExecute SQL Statement: "
        + dml.getStmtString(stmtType, filterBy, orderBy, null, null, null)
        + "\nArgument(s): "
        + ((args == null || args.length() == 0) ? "None" : "|" + args + "|");
  }

  protected static String debugDML(String methodDesc, DML dml, int stmtType,
      String filterBy, String orderBy, String args, String setArgs)
      throws DMLException {
    return methodDesc + ": DML Name: " + dml.getName()
        + "\nExecute SQL Statement: "
        + dml.getStmtString(stmtType, filterBy, orderBy, null, null, setArgs)
        + "\nArgument(s): "
        + ((args == null || args.length() == 0) ? "None" : "|" + args + "|");
  }

  /**
   * Outputs DML to the log for debug.
   *
   * @param methodDesc DOCUMENT ME!
   * @param dml the DML object proividing the SQL statement.
   * @param stmtString the SQL statement string.
   * @param args arguments provided for the placeholders in the SQL statement
   *        string.
   *
   * @return DOCUMENT ME!
   */
  protected static String debugDML(String methodDesc, DML dml,
      String stmtString, String args) {
    return methodDesc + ": DML Name: " + dml.getName()
        + "\nExecute SQL Statement: " + stmtString + "\nArgument(s): "
        + ((args == null || args.length() == 0) ? "None" : "|" + args + "|");
  }

  /**
   * Helper method to check if a string is null.
   *
   * @param s the string to test.
   *
   * @return true if the string is null, false otherwise.
   */
  protected static boolean isNull(String s) {
    return (s == null) || (s.length() == 0);
  }

  /**
   * Helper method to check if a string array is null.
   *
   * @param args the string array to test.
   *
   * @return true if the string array is null, false otherwise.
   */
  protected static boolean isNull(String[] args) {
    return (args == null) || (args.length == 0);
  }

  /**
   * Helper method to check if the DAO arguments is null.
   *
   * @param args the DAO arguments to test.
   *
   * @return true if args is null, false otherwise.
   */
  protected static boolean isNull(DAOArgs args) {
    return (args == null) || (args.count == 0);
  }

  /**
   * The statement pool is an optimisation that eliminates the need to always
   * refer to the DMLFactory to provide SQL statement strings. Once a
   * statement has been retrieved from the DMLFactory and prepared, it is
   * stored in the pool. Subsequent references to the same statement are
   * satisfied by the pool, saving the time required for the DMLFactory to
   * compose the statement string. Note: Dynamic SQL queries and updates are
   * not handled by the statement pool. Dynamic statements must be composed
   * each time the statement is executed. Implicit statement caching is then
   * relied upon to optimise performance.
   *
   * @version $Revision: 1.10 $
   * @author $Author$
   * @since $jdk$
   */
  protected class DAOStmtPool {
    /** the statement pool */
    private Map stmtPool = Collections.synchronizedMap(new HashMap());

    /**
     * Retrieves a prepared statement from the pool. If the statement does
     * not exist in the pool, then the DMLFactory is asked to provide a SQL
     * statement string which is then prepared and stored in the pool.
     *
     * @param dml the DML object required to provide the SQL statement
     *        string.
     * @param stmtType DML statement type.
     * @param dbo the dbo.
     * @return a prepared SQL statement.
     *
     * @throws EPPIXSeriousException if the DMLFactory is unable to provide a
     *         SQL statement string; or an SQL error is detected.
     */
    public PreparedStatement get(DML dml, int stmtType, DBO dbo,
        String tableName) throws EPPIXSeriousException {
      return get(dml, stmtType, dbo, null, tableName);
    }

    /**
     * Retrieves a prepared statement from the pool. If the statement does
     * not exist in the pool, then the DMLFactory is asked to provide a SQL
     * statement string which is then prepared and stored in the pool.
     *
     * @param dml the DML object required to provide the SQL statement
     *        string.
     * @param stmtType DML statement type.
     * @param dbo the dbo.
     * @param filterBy name of the filter defined for the DML object.
     * @return a prepared SQL statement.
     *
     * @throws EPPIXSeriousException if the DMLFactory is unable to provide a
     *         SQL statement string; or an SQL error is detected.
     */
    public PreparedStatement get(DML dml, int stmtType, DBO dbo,
        String filterBy, String tableName) throws EPPIXSeriousException {
      return get(dml, stmtType, dbo, filterBy, null, tableName, null);
    }

    //    public PreparedStatement get(DML dml, int stmtType, DBO dbo,
    //        String filterBy, String orderBy, String tableName, String setArgs) throws EPPIXSeriousException {
    //      return get(dml, stmtType, dbo, filterBy, null, tableName, setArgs);
    //    }

    public PreparedStatement get(DML dml, int stmtType, DBO dbo,
        String filterBy, String orderBy, String tableName, String setArgs)
        throws EPPIXSeriousException {

      return get(dml, stmtType, dbo, filterBy, orderBy, tableName, -1, setArgs);
    }

    /**
     * Retrieves a prepared statement from the pool. If the statement does
     * not exist in the pool, then the DMLFactory is asked to provide a SQL
     * statement string which is then prepared and stored in the pool.
     *
     * @param dml the DML object required to provide the SQL statement
     *        string.
     * @param stmtType DML statement type.
     * @param dbo the dbo
     * @param filterBy name of the filter defined for the DML object.
     * @param orderBy name of the sort order defined for the DML object.
     * @return a prepared SQL statement.
     *
     * @throws EPPIXSeriousException if the DMLFactory is unable to provide a
     *         SQL statement string; or an SQL error is detected.
     */
    public PreparedStatement get(DML dml, int stmtType, DBO dbo,
        String filterBy, String orderBy, String tableName, int maxField,
        String setArgs) throws EPPIXSeriousException {

      String dmlName = dml.getName();

      // compose the HashMap key
      String dmlKey = dmlName + "|" + stmtType + "|"
          + ((filterBy == null) ? "" : filterBy) + "|"
          + ((orderBy == null) ? "" : orderBy);

      if(logger.isDebugEnabled()){
    	  logger.debug("\n======================================================================\n" + dmlKey + "\n");
      }

      PreparedStatement stmt = null;

      synchronized (this) {
        // check if the statement has already been prepared
    	/**
    	 *  SJ: If this is a customised update, the prepared statement will change constantly
    	 *  and cannot be retrieved from cashed method. Better to build on the fly.
    	 *
    	 *  Test if statement type is STMT_CUSTOM_UPDATE
    	 */

//    	  System.out.println("@@@@@@@@@@ STATEMENT TYPE VALUE: " + stmtType);


//    	if(stmtType != 16 && stmtType != 0){
    	  if(stmtType != 16){
	        if ((stmt = (PreparedStatement) stmtPool.get(dmlKey)) != null) {
	          return stmt; // it has
	        }
    	}else{
    		if ((stmt = (PreparedStatement) stmtPool.get(dmlKey)) != null) {
	        	try {
					stmt.close();// SJ: 5 Nov 2012: close the existing statement
				} catch (SQLException e) {
					logger.error("Closing prepared statmenet: DML KEY: " + dmlKey + ": " + e.getMessage());
				}finally{
					stmt = null;
					stmtPool.remove(dmlKey);
				}
	        }
    	}

        try {
          // get the statement string from the DML factory
//        	System.out.println("SET ARGS: " + setArgs);

          String stmtString = dml.getStmtString(stmtType,filterBy,orderBy,tableName,
                  (((stmtType == DML.STMT_MAX || stmtType == DML.STMT_MIN) && maxField >= 0) ? ((DMLTable) dml)
                      .getFields()[maxField]
                      : null), setArgs);

//                  int[] fields = null;
//                  if (stmtType == DML.STMT_INSERT) {
//                    fields = new int[1];
//                    //for (int i = 0; i < fields.length; i++) {
//                      fields[0] = 1;
//                    //}
//                  }


//          if (stmtType == DML.STMT_INSERT
//              && (((DMLTable) dml).hasGeneratedKey())) {
//            stmtString = "begin " + stmtString + " returning "
//                + ((DMLTable) dml).getPrimaryKey() + " into ?; end;";
//          }

//          System.out.println("STATEMENT STRING: \n" + stmtString);
//          System.out.println("STATEMENT: " + stmt);

          try {
            // prepare the statement
            stmt = (stmtType == DML.STMT_LIST_ABS
                || stmtType == DML.STMT_LIST_KEY_PREV || stmtType == DML.STMT_LIST_KEY_DESC_PREV)
                ? conn.prepareStatement(commentSql(dmlName, stmtString),
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY)
                : (stmtType == DML.STMT_INSERT)
                ? (((DMLTable) dml).hasGeneratedKey())
                		? //conn.prepareCall(commentSql(dmlName, stmtString))
                                        conn.prepareStatement(commentSql(dmlName, stmtString), Statement.RETURN_GENERATED_KEYS)

                    : conn.prepareStatement(commentSql(dmlName, stmtString))
                    : conn.prepareStatement(commentSql(dmlName, stmtString));

          } catch (SQLException e) {
            thrower.unexpected(getErrorMessage(e, dml, stmtString, ""), e);
          }
        } catch (DMLException e) {
          thrower.unexpected(e);
        }catch (NullPointerException e) {
			e.printStackTrace();
		}

        stmtPool.put(dmlKey, stmt);
      }

      return stmt;
    }

    /**
     * Closes all of the prepared statements in the statement pool freeing
     * associated database resources.
     *
     * @throws EPPIXSeriousException if an SQL error is detected.
     */
    public void close() throws EPPIXSeriousException {
      try {
        for (Iterator i = ((Map) stmtPool).values().iterator(); i.hasNext();) {
          ((Statement) i.next()).close();
        }

        stmtPool.clear();
      } catch (SQLException e) {
        thrower.unexpected(getErrorMessage(e), e);
      }
    }
  } /* class DAOStmtPool */

  /**
   * Prefixes the specified sql with an identifying comment.
   */
  private String commentSql(String dmlName, String sql) {
    if (commentSql) {
      sql = "-- " + dmlFactoryName + "." + dmlName + " --\n" + sql;
    }
    return sql;
  }

  /**
   * Writes the CLOBs to the database.
   *
   * @param dmlTable
   * @param filterBy
   * @param filterArgs
   * @param fields
   * @param updateStmt
   *
   * @throws EPPIXSeriousException
   */
  private void writeClob(DMLTable dmlTable, String filterBy,
      DAOArgs filterArgs, DAOArgs fields, PreparedStatement updateStmt)
      throws EPPIXSeriousException {

    // Locate the CLOB(s), locking the row FOR UPDATE if being called before an
    // UPDATE statement. Otherwise, this method is being called after an INSERT
    // statement, so no additional lock is required as we will already be
    // holding an exclusive lock.
    int stmtType = (updateStmt == null) ? DML.STMT_SELECT : DML.STMT_LOCK;
    PreparedStatement stmt = stmtPool.get(dmlTable, stmtType, null, null,
        filterBy);

    try {

      try {

        filterArgs.bind(stmt, 1);

        ResultSet rs = null;
        int retryCount = 0;
        boolean retry = false;

        do {

          try {
            retry = false;
            rs = stmt.executeQuery();

          } catch (SQLException e) {

            if ((stmtType == DML.STMT_LOCK)
                && (e.getSQLState().equals("61000"))) {
              if ((++retryCount) > LOCK_MAX_RETRIES) {
                thrower.unexpected(getErrorMessage(ERROR_LOCK_NOT_ACQUIRED,
                    dmlTable, stmtType, filterBy, "", toString(filterArgs)));
              }

              retry = true;

              try {
                Thread.sleep(LOCK_RETRY_WAIT);
              } catch (InterruptedException ie) {
              }
            } else {
              throw e;
            }
          }
        } while (retry);

        if (rs.next()) {

          // Update each field that is of type CLOB.
          List clobArgs = fields.getClobArgs();
          for (int i = 0, n = clobArgs.size(); i < n; ++i) {
            DAOArgs.ClobArg clobArg = (DAOArgs.ClobArg) clobArgs.get(i);
            Clob clob = rs.getClob(clobArg.getPos());

            if (clob == null) {
              // The CLOB has not been initialised.
              thrower.unexpected(getErrorMessage(ERROR_CLOB_NOT_INIT, dmlTable,
                  DML.STMT_SELECT, filterBy, "", filterArgs.toString()));
            }

            // BaH : Changed here. Hopefully it works now in Oracle.
            //						if (jdbc == JDBC_ORACLE) {
            //							// Use Oracle specific calls to update the CLOB because the
            //							// standard calls do not work.
            //							CLOB oraClob = (CLOB) clob;
            //							oraClob.trim(0);
            //							if (!clobArg.isNull()) {
            //								clobArg.write(oraClob.getCharacterOutputStream());
            //							}
            //
            //						} else {
            // Use standard JDBC calls to update the CLOB.
            clob.truncate(0);
            if (!clobArg.isNull()) {
              clobArg.write(clob.setCharacterStream(0));
            }
            //						}

            if (updateStmt != null) {
              // This method is being called before an UPDATE statement, so
              // bind the CLOB to its placeholder.
              updateStmt.setClob(clobArg.getSetPos(), clob);
            }
          }
        }

      } catch (SQLException e) {

        thrower.unexpected(getErrorMessage(e, dmlTable, DML.STMT_SELECT,
            filterBy, "", filterArgs.toString()), e);

      } catch (IOException e) {
        thrower.unexpected(e);
      }

    } catch (DMLException e) {
      thrower.unexpected(e);
    }
  }

  public void defStaticUpdate(String dmlName, String stmt) throws DMLException {
    if (!dmlFactory.dmlExists(dmlName)) {
      dmlFactory.defStaticUpdate(dmlName, stmt);
    }
  }

  public DAOIterator iterator(DAOParamQueryArgs queryArgs, String tableName,
      boolean forUpdate) throws EPPIXSeriousException {

    return iterator(queryArgs.getDMLName(), queryArgs.getFilterBy(), queryArgs,
        queryArgs.getOrderBy(), forUpdate, tableName);
  }

  public DAOIterator iterator(DAOParamQueryArgs queryArgs, boolean forUpdate)
      throws EPPIXSeriousException {
    return iterator(queryArgs.getDMLName(), queryArgs.getFilterBy(), queryArgs,
        queryArgs.getOrderBy(), forUpdate);
  }

public DTOList getListAbs(DTOListState state, DAOParamQueryArgs queryArgs)
		throws EPPIXSeriousException {
	// TODO Auto-generated method stub
	return null;
}

public DTOList getListAbs(DTOListState state, DAOParamQueryArgs queryArgs,
		String tableName) throws EPPIXSeriousException {
	// TODO Auto-generated method stub
	return null;
}

public DTOList getListAbs(DTOListState state, String dmlName, DAOArgs stmtArgs)
		throws EPPIXSeriousException {
	// TODO Auto-generated method stub
	return null;
}

public DTOList getListAbs(DTOListState state, String dmlName, String filterBy,
		DAOArgs filterArgs, String orderBy) throws EPPIXSeriousException {
	// TODO Auto-generated method stub
	return null;
}

public DTOList getListAbs(DTOListState state, String dmlName, String[] args)
		throws EPPIXSeriousException {
	// TODO Auto-generated method stub
	return null;
}

public DTOList getListKey(DTOListState state, String dmlName, String filterBy,
		DAOArgs filterArgs) throws EPPIXSeriousException {
	// TODO Auto-generated method stub
	return null;
}

public DTOList getListKey(DTOListState state, String dmlName, String filterBy,
		DAOArgs filterArgs, boolean isAscending) throws EPPIXSeriousException {
	// TODO Auto-generated method stub
	return null;
}

} /* class DAOImpl */