/* ====================================================================== *
 * (c) Copyright Eppixcomm Tech Ltd.                                      *
 * All Rights Reserved                                                    *
 *                                                                        *
 * Legal Information                                                      *
 * ====================================================================== */
package com.eppixcomm.eppix.base.dml;

import java.util.Date;

/**
 * DOCUMENT ME!
 *
 * @version $Revision: 1.2 $
 * @author $author$
 * @since $jdk$
 */
public abstract class DML {
  /** DOCUMENT ME! */
  public static final int STMT_SELECT = 0;
  /** DOCUMENT ME! */
  public static final int STMT_LOCK = 1;
  /** DOCUMENT ME! */
  public static final int STMT_LIST_ABS = 2;
  /** DOCUMENT ME! */
  public static final int STMT_LIST_KEY = 3;
  /** DOCUMENT ME! */
  public static final int STMT_LIST_KEY_NEXT = 4;
  /** DOCUMENT ME! */
  public static final int STMT_LIST_KEY_PREV = 5;
  /** DOCUMENT ME! */  
  public static final int STMT_LIST_KEY_DESC = 6;
  /** DOCUMENT ME! */
  public static final int STMT_LIST_KEY_DESC_NEXT = 7;
  /** DOCUMENT ME! */
  public static final int STMT_LIST_KEY_DESC_PREV = 8;  
  /** DOCUMENT ME! */
  public static final int STMT_EXISTS = 9;
  /** DOCUMENT ME! */
  public static final int STMT_COUNT = 10;
  /** DOCUMENT ME! */
  public static final int STMT_INSERT = 11;
  /** DOCUMENT ME! */
  public static final int STMT_UPDATE = 12;
  /** DOCUMENT ME! */
  public static final int STMT_DELETE = 13;
  public static final int STMT_MAX = 14;
  public static final int STMT_MIN = 15;
  public static final int STMT_CUSTOM_UPDATE = 16;
  /** DOCUMENT ME! */
  protected String dmlName;


  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getName() {
    return dmlName;
  }

  /**
   * DOCUMENT ME!
   *
   * @param stmtType DOCUMENT ME!
   * @param filterBy DOCUMENT ME!
   * @param orderBy DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   *
   * @throws DMLException DOCUMENT ME!
   */
  abstract public String getStmtString( int   stmtType,
                                        String filterBy,
                                        String orderBy,
                                        String tableName,
                                        String maxField,
                                        String setArgs)
                                throws DMLException;


  //////////////////////////////////////////////////////////////////////////////

  /*
   * Static helper methods used to handle arguments passed into
   * DMLDynamicQuery and DMLDynamicUpdate.
   */

  /**
   * DOCUMENT ME!
   *
   * @param args DOCUMENT ME!
   * @param numArgs DOCUMENT ME!
   *
   * @throws DMLException DOCUMENT ME!
   */
  protected static void checkArgs( String[] args,
                                   int     numArgs )
                           throws DMLException {
    if ( numArgs > 0 ) {
      if ( args == null ) {
        throw new DMLException( "Parameter args[] is required." );
      }

      if ( args.length != numArgs ) {
        throw new DMLException( "Parameter args[] requires " + numArgs
                                + " elements." );
      }
    }
  }

  /**
   * DOCUMENT ME!
   *
   * @param args DOCUMENT ME!
   * @param idx DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   *
   * @throws DMLException DOCUMENT ME!
   */
  protected static String argNullString( String[] args,
                                         int     idx )
                                 throws DMLException {
    String arg = args[idx];

    return ( arg == null || arg.length() == 0 ) ? null : arg;
  }

  /**
   * DOCUMENT ME!
   *
   * @param args DOCUMENT ME!
   * @param idx DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   *
   * @throws DMLException DOCUMENT ME!
   */
  protected static String argNotNullString( String[] args,
                                            int     idx )
                                    throws DMLException {
    String arg = args[idx];

    if ( ( arg == null ) || ( arg.length() == 0 ) ) {
      throw new DMLException( "Parameter args[" + idx
                              + "] requires a String value of one or more "
                              + "characters." );
    }

    return arg;
  }

  /**
   * DOCUMENT ME!
   *
   * @param args DOCUMENT ME!
   * @param idx DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   *
   * @throws DMLException DOCUMENT ME!
   */
  protected static Integer argNullInteger( String[] args,
                                           int     idx )
                                   throws DMLException {
    Integer i = null;
    String arg = args[idx];

    if ( ( arg != null ) && ( arg.length() > 0 ) ) {
      try {
        i = new Integer( arg );
      } catch ( NumberFormatException e ) {
        throw new DMLException( "Parameter args[" + idx
                                + "] does not contain a numeric String value "
                                + "that represents an Integer: " + arg );
      }
    }

    return i;
  }

  /**
   * DOCUMENT ME!
   *
   * @param args DOCUMENT ME!
   * @param idx DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   *
   * @throws DMLException DOCUMENT ME!
   */
  protected static Integer argNotNullInteger( String[] args,
                                              int     idx )
                                      throws DMLException {
    String arg = args[idx];

    if ( ( arg == null ) || ( arg.length() == 0 ) ) {
      throw new DMLException( "Parameter args[" + idx
                              + "] requires a String value that represents an Integer." );
    }

    return argNullInteger( args, idx );
  }

  /**
   * DOCUMENT ME!
   *
   * @param args DOCUMENT ME!
   * @param idx DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   *
   * @throws DMLException DOCUMENT ME!
   */
  protected static Boolean argNullBoolean( String[] args,
                                           int     idx )
                                   throws DMLException {
    String arg = args[idx];

    return ( arg == null || arg.length() == 0 ) ? null : new Boolean( arg );
  }

  /**
   * DOCUMENT ME!
   *
   * @param args DOCUMENT ME!
   * @param idx DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   *
   * @throws DMLException DOCUMENT ME!
   */
  protected static Boolean argNotNullBoolean( String[] args,
                                              int     idx )
                                      throws DMLException {
    String arg = args[idx];

    if ( ( arg == null ) || ( arg.length() == 0 ) ) {
      throw new DMLException( "Parameter args[" + idx
                              + "] requires a String value that represents a Boolean." );
    }

    return new Boolean( arg );
  }

  /**
   * Creates a new getNullDateArg object.
   *
   * @param args DOCUMENT ME!
   * @param idx DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   *
   * @throws DMLException DOCUMENT ME!
   */
  protected static Date argNullDate( String[] args,
                                     int     idx )
                             throws DMLException {
    Date date = null;
    String arg = args[idx];

    if ( ( arg != null ) && ( arg.length() > 0 ) ) {
      try {
        date = new Date( Long.parseLong( arg ) );
      } catch ( NumberFormatException e ) {
        throw new DMLException( "Parameter args[" + idx
                                + "] does not contain a "
                                + "numeric String value that represents a Date as a "
                                + "Long integer: " + arg );
      }
    }

    return date;
  }

  /**
   * DOCUMENT ME!
   *
   * @param args DOCUMENT ME!
   * @param idx DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   *
   * @throws DMLException DOCUMENT ME!
   */
  protected static Date argNotNullDate( String[] args,
                                        int     idx )
                                throws DMLException {
    if ( ( args[idx] == null ) || ( args[idx].length() == 0 ) ) {
      throw new DMLException( "Parameter args[" + idx
                              + "] requires a String "
                              + "value that represents a Date as a Long integer." );
    }

    return argNullDate( args, idx );
  }

  /*
  protected static String argNullDateTimeString( String[] args,
                                                 int     idx )
                                         throws DMLException {
    String date = null;
    String arg = args[idx];

    if ( ( arg != null ) && ( arg.length() > 0 ) ) {
      try {
        date = "TO_DATE('"
               + new SimpleDateFormat( "yyyy/MM/dd HH:mm:ss" ).format(
                       new Date( Long.parseLong( arg ) ) )
               + "', 'YYYY/MM/DD HH24:MI:SS')";
      } catch ( NumberFormatException e ) {
        throw new DMLException( "Parameter args[" + idx
                                + "] does not contain a numeric String value "
                                + "that represents a Date as a Long integer: "
                                + arg );
      }
    }

    return date;
  }

  protected static String argNotNullDateTimeString( String[] args,
                                                    int     idx )
                                            throws DMLException {
    if ( ( args[idx] == null ) || ( args[idx].length() == 0 ) ) {
      throw new DMLException( "Parameter args[" + idx
                              + "] requires a String value that represents a "
                              + "Date as a Long integer." );
    }

    return argNullDateTimeString( args, idx );
  }*/
}
