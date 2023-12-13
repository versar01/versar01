// Could change to use a more generic logging

/**************************************************************************************************************************************************************************************************************************************************************
 * Type : Java Source File Class : ConnectionManager Package : Common.src.Common.libsrc.EppJLib Description : Eppix Library Class To establish an SQLJ database connection and set the default context Notes : Can also be used for non SQLJ apps. ie JDBC Need
 * to make a case where the conrtuctor is called with out debug and log files then must log to screen Package description from part of new structure Old package structure is EppJLib Changes : [20070228] Created (BW)
 *************************************************************************************************************************************************************************************************************************************************************/

// For compilation in new scheme
package com.eppixcomm.eppix.common.data;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Date;
import java.util.Properties;

import com.eppixcomm.eppix.common.util.ResourceLoader;

//import sqlj.runtime.ref.DefaultContext;

/* ------------------------------------------------------ */
/* Class ConnectionManager */
/*                                                       */
/* Parent : */
/* Interfaces : */
/* Methods : ConnectionManager() */
/* newConnection() */
/* initContext() */
/*                                                       */
/* ------------------------------------------------------ */

/**
 * Class to connect to an Informix Database. <br>
 * Uses the DriverManager.getConnection method but <br>
 * can also be used for the Data source object connection method.
 * 
 * @throws
 * @author B.Williams
 * @version 1.0
 */
public class ConnectionManager {
	private static Properties properties;
	

  /* ------------------------------------------------------ */
  /* Private Data */
  /* ------------------------------------------------------ */
  //	static private Debug coDebug;
  //	static private EppLogger coEppLogFile;
  /* ------------------------------------------------------ */
  /* Public data */
  /* ------------------------------------------------------ */
  private static Connection conn = null;

  // public static IfxDataSource eppDataSrc;
  static public String DRIVER = null; // JDBC Driver class

  static public String DBURL = null; // Database URL

  static public String UID = null; // User ID for database account

  static public String PWD = null; // Password for database account

  /* ------------------------------------------------------ */
  /* Private Methods */
  /* ------------------------------------------------------ */

  /* ------------------------------------------------------ */
  /* Public Methods */
  /* ------------------------------------------------------ */

  /* ------------------------------------------------------ */
  // Method : ConnectionManager() - Contructor
  /* ------------------------------------------------------ */

  static public Connection newConnection(String driver, String url) {
    return newConnection(driver, url, null, null);
  }
  
  /* ------------------------------------------------------ */
  // Method : newConnection() - Create a new connection to the DataBase
  /**
   * Establishes a new DB connection with the default context. <br>
   * Needs the Driver string: <br>
   * <t>eg:<t>com.informix.jdbc.IfxDriver <br>
   * Needs the database URL string: <br>
   * <t>eg:<t>jdbc:informix-sqli:mtnepp01:1528/eppix:informixserver=eppix_tcp_01;IFX_LOCK_MODE_WAIT=10
   * 
   * @param
   * @return
   * @throws
   */
  static public Connection newConnection(String driver, String url,
      String user, String pass) {

    DRIVER = driver;
    DBURL = url;

    try {
      final Driver d = (Driver) (Class.forName(DRIVER).newInstance());
      DriverManager.registerDriver(d);
      //			coDebug.log(
      //					"LIB DEBUG INFO: ConnectionManager.newConnection(): loaded driver: "
      //							+ DRIVER + " : " + new Date(), 3);
    } catch (final Exception e) {
      //			coDebug.log(
      //					"LIB DEBUG ERROR: ConnectionManager.newConnection(): Could not load driver: "
      //							+ DRIVER + " : " + new Date(), 0);
      //			coEppLogFile
      //					.log("LIB PROGRAM ERROR: ConnectionManager.newConnection(): Could not load driver: "
      //							+ DRIVER + " : " + new Date());
      //			coEppLogFile.log(e);
      e.printStackTrace();

      System.exit(1);
    }

    try {
      // A connection can be made in 2 ways
      // 1> With the DriverManager.getConnection (DBURL) function. But this is Driver implementation
      // specific. And does not allow portability or limitedINFORMIX Specific environment variable setting.
      // 2> The Data source object is much more granular and supports dynamic service requests
      // This will allow future implementation of a separate configuration service.
      // For now it allows us finer tunining of the connection
      // conn = DriverManager.getConnection (DBURL, UID, PWD);
      // [DB URL= jdbc:informix-sqli://[{ip-address|host-name}:port-number][/dbname]:INFORMIXSERVER=server-name;[user=user;password=password][;name=value[;name=value]...]]
      // jdbc url = jdbc:informix-sqli:mtnepp01:1528/eppix:informixserver=eppix_tcp_01

      // The driver manger method is currently used

      // The Driver manager method
      if (user != null) {
        setConn(DriverManager.getConnection(DBURL, user, pass));
      } else {
        setConn(DriverManager.getConnection(DBURL));
      }

      // The data source simple method
      // create a data source object
      // eppDataSrc=new IfxDataSource();
      // eppDataSrc.setDatabaseName("eppix");
      // eppDataSrc.setPortNumber(1528);
      // eppDataSrc.setServerName("eppix_tcp_01") ;
      // eppDataSrc.setIfxIFXHOST("mtnepp01") ;
      // eppDataSrc.setIfxIFX_LOCK_MODE_WAIT(10);
      // eppDataSrc.setIfxSQLH_TYPE("FILE");
      // Estabish the connection
      // conn = eppDataSrc.getConnection();

      // The following is a list of the available data source methods
      // Currently not used
      // ////////
      /*
       * void setDatabaseName(java.lang.String dbName) Sets the database name. void setDataSourceName(java.lang.String dsName) Sets the DataSource name. void setDescription(java.lang.String descrip) Sets the description of the DataSource. void
       * setIfxALLOWREGISTEROUTFORINPARAM(java.lang.String ALLOWOUT_Flag) Sets the value of Informix specific variable ALLOWREGISTEROUTFORINPARAM. void setIfxBIG_FET_BUF_SIZE(int fetbufsize) Sets the value of Informix specific variable
       * BIG_FET_BUF_SIZE. void setIfxCLIENT_LOCALE(java.lang.String client_locale) Sets the value of Informix specific variable CLIENT_LOCALE. void setIfxCSM(java.lang.String csm) Sets the value of Informix specific variable CSM. void
       * setIfxDB_LOCALE(java.lang.String dblocale) Sets the value of Informix specific variable DBLOCALE. void setIfxDBANSIWARN(boolean dbansiwarn) Sets the value of Informix specific variable DBANSIWARN. void setIfxDBCENTURY(java.lang.String
       * dbcentury) Sets the value of Informix specific variable DBCENTURY. void setIfxDBDATE(java.lang.String dbdate) Sets the value of Informix specific variable DBDATE. void setIfxDBSPACETEMP(java.lang.String dbspacetemp) Sets the value of
       * Informix specific variable DBSPACETEMP. void setIfxDBTEMP(java.lang.String dbtemp) Sets the value of Informix specific variable DBTEMP. void setIfxDBTIME(java.lang.String dbtime) Sets the value of Informix specific variable DBTIME. void
       * setIfxDBUPSPACE(java.lang.String dbupspace) Sets the value of Informix specific variable DBUPSPACE. void setIfxDELIMIDENT(boolean delimident) Sets the value of Informix specific variable DELIMIDENT. void setIfxDirectConnection() Makes this
       * connection direct to the server. void setIfxENABLE_HDRSWITCH(boolean hdrFlag) Sets the value of Informix specific variable ENABLE_HDRSWITCH. void setIfxENABLE_TYPE_CACHE(boolean enableCacheType) Sets the value of Informix specific variable
       * ENABLE_CACHE_TYPE. void setIfxFET_BUF_SIZE(int fetbufsize) Sets the value of Informix specific variable FET_BUF_SIZE. void setIfxGL_DATE(java.lang.String gldate) Sets the value of Informix specific variable GL_DATE. void
       * setIfxGL_DATETIME(java.lang.String gldatetime) Sets the value of Informix specific variable GL_DATETIME. void setIfxIFX_AUTOFREE(boolean ifx_autofree) Sets the value of Informix specific variable IFXAUTOFREE. void
       * setIfxIFX_BATCHUPDATE_PER_SPEC(int bBatchUpdateFlag) Sets the value of Informix specific variable IFX_BATCHUPDATE_PER_SPEC. void setIfxIFX_CODESETLOB(int codesetlobFlag) Sets the value of Informix specific variable IFX_CODESETLOB. void
       * setIfxIFX_DIRECTIVES(java.lang.String ifxdirectvs) Sets the value of Informix specific variable IFX_DIRECTIVES. void setIfxIFX_EXTDIRECTIVES(java.lang.String ifxextdirectvs) Sets the value of Informix specific variable IFX_EXTDIRECTIVES.
       * void setIfxIFX_GET_SMFLOAT_AS_FLOAT(int mapFloat) Sets the value of Informix specific variable IFX_GET_SMFLOAT_AS_FLOAT. void setIfxIFX_ISOLATION_LEVEL(java.lang.String iso_level) Sets the value of Informix specific variable
       * IFX_ISOLATION_LEVEL. void setIfxIFX_LOCK_MODE_WAIT(int lockMode) Sets the value of Informix specific variable IFX_LOCK_MODE_WAIT. void setIfxIFX_PAD_VARCHAR(java.lang.String pad_varchar) Sets the value of Informix specific variable
       * IFX_PAD_VARCHAR void setIfxIFX_SET_FLOAT_AS_SMFLOAT(int mapFloat) Sets the value of Informix specific variable IFX_SET_FLOAT_AS_SMFLOAT. void setIfxIFX_USEPUT(boolean ifx_useput) Sets the value of Informix specific variable IFX_USEPUT. void
       * setIfxIFXHOST_SECONDARY(java.lang.String addr) Sets the value of Informix specific variable IFXHOST_SECONDARY. void setIfxIFXHOST(java.lang.String addr) Sets the value of Informix specific variable IFXHOST. void setIfxINFORMIXCONRETRY(int
       * ifx_con_retry) Sets the value of Informix specific variable INFORMIXCONRETRY. void setIfxINFORMIXCONTIME(int contime) Sets the value of Informix specific variable INFORMIXCONTIME. void setIfxINFORMIXOPCACHE(java.lang.String ifxopcache) Sets
       * the value of Informix specific variable INFORMIXOPCACHE. void setIfxINFORMIXSERVER_SECONDARY(java.lang.String servername) Sets the value of Informix specific variable INFORMIXSERVER_SECONDARY. void setIfxINFORMIXSTACKSIZE(int
       * informixstacksize) Sets the value of Informix specific variable INFORMIXSTACKSIZE. void setIfxJDBCTEMP(java.lang.String jdbctemp) Sets the value of Informix specific variable JDBCTEMP. void setIfxLDAP_IFXBASE(java.lang.String ldapIfxBase)
       * Sets the value of Informix specific variable LDAP_IFXBASE. void setIfxLDAP_PASSWD(java.lang.String ldapPasswd) Sets the value of Informix specific variable LDAP_PASSWD. void setIfxLDAP_URL(java.lang.String ldapUrl) Sets the value of
       * Informix specific variable LDAP_URL. void setIfxLDAP_USER(java.lang.String ldapUser) Sets the value of Informix specific variable LDAP_USER. void setIfxLOBCACHE(int lobCacheSize) Sets the value of Informix specific variable LOBCACHE. void
       * setIfxNEWCODESET(java.lang.String newcodeset) Sets the value of Informix specific variable NEWCODESET. void setIfxNEWLOCALE(java.lang.String newlocale) Sets the value of Informix specific variable NEWLOCALE. void
       * setIfxNEWNLSMAP(java.lang.String nlsmap) Sets the value of Informix specific variable NEWNLSMAP. void setIfxNODEFDAC(java.lang.String defdac) Sets the value of Informix specific variable NODEFDAC. void setIfxOPT_GOAL(java.lang.String
       * opt_goal) Sets the value of Informix specific variable OPT_GOAL. void setIfxOPTCOMPIND(java.lang.String optcompind) Sets the value of Informix specific variable OPTCOMPIND. void setIfxOPTOFC(java.lang.String optofc) Sets the value of
       * Informix specific variable OPTOFC. void setIfxPATH(java.lang.String path) Sets the value of Informix specific variable PATH. void setIfxPDQPRIORITY(java.lang.String pqqpriority) Sets the value of Informix specific variable PDQPRIORITY. void
       * setIfxPLCONFIG(java.lang.String plconfig) Sets the value of Informix specific variable PLCONFIG. void setIfxPLOAD_LO_PATH(java.lang.String ploadlopath) Sets the value of Informix specific variable PLOAD_LO_PATH. void
       * setIfxPORTNO_SECONDARY(int portNo) Sets the value of Informix specific variable PORTNO_SEONDARY. void setIfxPROTOCOLTRACE(int pLevel) Sets the value of Informix specific variable PROTOCOLTRACE. void setIfxPROTOCOLTRACEFILE(java.lang.String
       * fname) Sets the value of Informix specific variable PROTOCOLTRACEFILE. void setIfxPROXY(java.lang.String proxy) Sets the value of Informix specific variable PROXY. void setIfxPSORT_DBTEMP(java.lang.String psortdbtemp) Sets the value of
       * Informix specific variable PSORT_DBTEMP. void setIfxPSORT_NPROCS(java.lang.String psortnprocs) Sets the value of Informix specific variable PSORT_NPROCS. void setIfxSECURITY(java.lang.String security) Sets the value of Informix specific
       * variable SECURITY. void setIfxSQLH_FILE(java.lang.String sqlHFile) Sets the value of Informix specific variable SQLH_FILE. void setIfxSQLH_LOC(java.lang.String sqlhloc) Sets the value of Informix specific variable SQLH_LOC. void
       * setIfxSQLH_TYPE(java.lang.String sqlHType) Sets the value of Informix specific variable SQLH_TYPE. void setIfxSQLIDEBUG(java.lang.String fname) Sets the value of Informix specific variable SQLIDEBUG. void setIfxSTMT_CACHE(java.lang.String
       * stmt_cache) Sets the value of Informix specific variable STMT_CACHE. void setIfxTRACE(int tLevel) Sets the value of Informix specific variable TRACE. void setIfxTRACEFILE(java.lang.String fname) Sets the value of Informix specific variable
       * TRACEFILE. void setIfxUSE_DTENV(boolean use_dtenv) Sets the value of Informix specific variable USE_DTENV. void setIfxUSEV5SERVER(boolean useV5server) Sets the value of Informix specific variable USEV5SERVER. void setLoginTimeout(int
       * seconds) Sets the login time out. void setLogWriter(java.io.PrintWriter out) Sets the logwriter for the DataSource. void setPassword(java.lang.String passwd) sets the password to be used to connect to the database. void setPortNumber(int
       * portNo) Sets the port number to be used to connect to the database. void setRoleName(java.lang.String roleNm) Sets the role name for the DataSource. void setServerName(java.lang.String ServerNm) Sets the name of the server instance.
       */
      // /////////
      // the following sets transaction to immeadiate execution
      // Else we need to use the following statement ...sql[o_ctx] { COMMIT work };
      getConn().setAutoCommit(true /* true */); // Turn AutoCommit on. So no transaction logging

      //			coDebug.log(
      //					"LIB DEBUG INFO: ConnectionManager.newConnection(): connected to URL: "
      //							+ DBURL + " : " + new Date(), 3);
      //			coDebug
      //					.log(
      //							"LIB DEBUG INFO: ConnectionManager.newConnection(): Set Auto Commit",
      //							3);
    } catch (final SQLException exception) {

      //			coDebug
      //					.log(
      //							"LIB DEBUG ERROR: ConnectionManager.newConnection(): could not get a connection. Check JDBC URL in the config file!",
      //							0);
      //			coEppLogFile
      //					.log("LIB PROGRAM ERROR: ConnectionManager.newConnection(): could not get a connection. Check JDBC URL in the config file!");
      //			coEppLogFile.log(exception);
      exception.printStackTrace();
      System.exit(1);
    }
    return getConn();
  }

  /**
   * ConnectionManager <b>Constructor</b>. <br>
   * Simply sets up the log and debug files.
   * 
   * @param poDebug
   *            Path to debug file.
   * @param poEppLogFile
   *            Path to log file.
   * @throws
   */
  //	public ConnectionManager(Debug poDebug, EppLogger poEppLogFile)
  //	{
  //		// Set the log object
  //		coEppLogFile = poEppLogFile;
  //		// Set debug object
  //		coDebug = poDebug;
  //
  //	}
  /**
   * @param conn the conn to set
   */
  public static void setConn(Connection conn) {
    ConnectionManager.conn = conn;
  }

  /**
   * @return the conn
   */
  public static Connection getConn() {
    return conn;
  }
  
  /**
   * New method that will create a database connection
   * from a generic properties file. /usr.eppix310/scrips/eppix.base.properties
   * 
   * 
   */
  static public Connection newConnectionFromProperties(){
	  properties = ResourceLoader.loadProperties();
	  
	  return ConnectionManager.newConnection(
			  properties.getProperty("jdbc_driver"), 
			  properties.getProperty("jdbc_url"), 
			  properties.getProperty("jdbc_user"), 
			  properties.getProperty("jdbc_pass"));
  }

}
