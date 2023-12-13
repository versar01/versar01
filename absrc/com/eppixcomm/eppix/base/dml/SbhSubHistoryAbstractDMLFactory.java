/*


*/

/*============================================================================================= *
 *
 * (c) 2007 Copyright Eppixcomm.
 * All Rights Reserved
 * Legal Information goes here.
 *
 *============================================================================================= */

/**----------------------------------------------------------------------------------------------
 *
 * Version control details:
 *    @version $Revision: $
 *    @author  $Author: $
 *----------------------------------------------------------------------------------------------*/
package com.eppixcomm.eppix.base.dml;


/**
 * This is the DMLFactory for SbhSubHistory.
 *
 * @version $Revision: 1.1 $
 * @author $Author$
 * @since $jdk$
 */
public class SbhSubHistoryAbstractDMLFactory
  extends BaseDMLFactory {
  //~ Static variables/initializers //////////////////////////////////////////

  /** The DMLFactory singleton */
  private static DMLFactory dml = null;

  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new SbhSubHistoryAbstractDMLFactory object.
   *
   * @throws DMLException DOCUMENT ME!
   */
  protected SbhSubHistoryAbstractDMLFactory(  )
    throws DMLException {
    ;

    DMLTable table = defTable( "SbhSubHistory", // dmlName
        "blo.SbhSubHistoryDMO", // dmoName
        "SBH_SUB_HISTORY", // tableName
        8, // numColumns
        "SBH_SUBSCRIBER_ID, SBH_FIELD_ID, SBH_HIST_CODE, SBH_OLD_VALUE, SBH_NEW_VALUE, SBH_USER_ID, SBH_TERMINAL_ID, SBH_TIMESTAMP", // columnList
        null, //primaryKey
        "" // versionCol     
      , false, // generatedKey
        "SBH_SUBSCRIBER_ID, SBH_FIELD_ID, SBH_HIST_CODE, SBH_OLD_VALUE, SBH_NEW_VALUE, SBH_USER_ID, SBH_TERMINAL_ID, SBH_TIMESTAMP",
        "", "",
        new String[] {
          "SBH_SUBSCRIBER_ID", "SBH_FIELD_ID", "SBH_HIST_CODE",
          "SBH_OLD_VALUE", "SBH_NEW_VALUE", "SBH_USER_ID", "SBH_TERMINAL_ID",
          "SBH_TIMESTAMP"
        }, false );

    ;

    table.addFilterBy( "equalSbhSubscriberId", "SBH_SUBSCRIBER_ID = ?" ) // EQUAL

         .addFilterBy( "notequalSbhSubscriberId", "SBH_SUBSCRIBER_ID != ?" ) // NOTEQUAL

         .addFilterBy( "nullSbhSubscriberId", "SBH_SUBSCRIBER_ID IS NULL" ) // IS NULL

         .addFilterBy( "notnullSbhSubscriberId",
      "SBH_SUBSCRIBER_ID IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanSbhSubscriberId", "SBH_SUBSCRIBER_ID < ?" ) // LESS THAN

         .addFilterBy( "greaterthanSbhSubscriberId", "SBH_SUBSCRIBER_ID > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalSbhSubscriberId",
      "SBH_SUBSCRIBER_ID <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalSbhSubscriberId",
      "SBH_SUBSCRIBER_ID >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "filterBySbhSubscriberIdMatch",
      "SBH_SUBSCRIBER_ID LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "betweenSbhSubscriberId",
      "SBH_SUBSCRIBER_ID BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullSbhSubscriberId",
      "(SBH_SUBSCRIBER_ID IS NULL OR SBH_SUBSCRIBER_ID = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullSbhSubscriberId",
      "(SBH_SUBSCRIBER_ID IS NULL OR SBH_SUBSCRIBER_ID < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullSbhSubscriberId",
      "(SBH_SUBSCRIBER_ID IS NULL OR SBH_SUBSCRIBER_ID > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INSbhSubscriberId", "SBH_SUBSCRIBER_ID IN ( ? )" ) // IN

         .addFilterBy( "NOTINSbhSubscriberId",
      "SBH_SUBSCRIBER_ID NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "SbhSubscriberIdasc", "SBH_SUBSCRIBER_ID ASC" ) // ORDER ASCENDING

         .addOrderBy( "SbhSubscriberIddesc", "SBH_SUBSCRIBER_ID DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalSbhFieldId", "SBH_FIELD_ID = ?" ) // EQUAL

         .addFilterBy( "notequalSbhFieldId", "SBH_FIELD_ID != ?" ) // NOTEQUAL

         .addFilterBy( "nullSbhFieldId", "SBH_FIELD_ID IS NULL" ) // IS NULL

         .addFilterBy( "notnullSbhFieldId", "SBH_FIELD_ID IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanSbhFieldId", "SBH_FIELD_ID < ?" ) // LESS THAN

         .addFilterBy( "greaterthanSbhFieldId", "SBH_FIELD_ID > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalSbhFieldId", "SBH_FIELD_ID <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalSbhFieldId", "SBH_FIELD_ID >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "filterBySbhFieldIdMatch", "SBH_FIELD_ID LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "betweenSbhFieldId", "SBH_FIELD_ID BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullSbhFieldId",
      "(SBH_FIELD_ID IS NULL OR SBH_FIELD_ID = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullSbhFieldId",
      "(SBH_FIELD_ID IS NULL OR SBH_FIELD_ID < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullSbhFieldId",
      "(SBH_FIELD_ID IS NULL OR SBH_FIELD_ID > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INSbhFieldId", "SBH_FIELD_ID IN ( ? )" ) // IN

         .addFilterBy( "NOTINSbhFieldId", "SBH_FIELD_ID NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "SbhFieldIdasc", "SBH_FIELD_ID ASC" ) // ORDER ASCENDING

         .addOrderBy( "SbhFieldIddesc", "SBH_FIELD_ID DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalSbhHistCode", "SBH_HIST_CODE = ?" ) // EQUAL

         .addFilterBy( "notequalSbhHistCode", "SBH_HIST_CODE != ?" ) // NOTEQUAL

         .addFilterBy( "nullSbhHistCode",
      "(SBH_HIST_CODE IS NULL OR LENGTH(SBH_HIST_CODE) IS NULL OR LENGTH(SBH_HIST_CODE) = 0)" ) // IS NULL

         .addFilterBy( "notnullSbhHistCode", "SBH_HIST_CODE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanSbhHistCode", "SBH_HIST_CODE < ?" ) // LESS THAN

         .addFilterBy( "greaterthanSbhHistCode", "SBH_HIST_CODE > ?" ) // GREATER THAN

         .addFilterBy( "filterBySbhHistCodeMatch", "SBH_HIST_CODE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullSbhHistCode",
      "(SBH_HIST_CODE = ? OR SBH_HIST_CODE IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INSbhHistCode", "SBH_HIST_CODE IN ( ? )" ) // IN

         .addFilterBy( "NOTINSbhHistCode", "SBH_HIST_CODE NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "SbhHistCodeasc", "SBH_HIST_CODE ASC" ) // ORDER ASCENDING

         .addOrderBy( "SbhHistCodedesc", "SBH_HIST_CODE DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalSbhOldValue", "SBH_OLD_VALUE = ?" ) // EQUAL

         .addFilterBy( "notequalSbhOldValue", "SBH_OLD_VALUE != ?" ) // NOTEQUAL

         .addFilterBy( "nullSbhOldValue",
      "(SBH_OLD_VALUE IS NULL OR LENGTH(SBH_OLD_VALUE) IS NULL OR LENGTH(SBH_OLD_VALUE) = 0)" ) // IS NULL

         .addFilterBy( "notnullSbhOldValue", "SBH_OLD_VALUE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanSbhOldValue", "SBH_OLD_VALUE < ?" ) // LESS THAN

         .addFilterBy( "greaterthanSbhOldValue", "SBH_OLD_VALUE > ?" ) // GREATER THAN

         .addFilterBy( "filterBySbhOldValueMatch", "SBH_OLD_VALUE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullSbhOldValue",
      "(SBH_OLD_VALUE = ? OR SBH_OLD_VALUE IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INSbhOldValue", "SBH_OLD_VALUE IN ( ? )" ) // IN

         .addFilterBy( "NOTINSbhOldValue", "SBH_OLD_VALUE NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "SbhOldValueasc", "SBH_OLD_VALUE ASC" ) // ORDER ASCENDING

         .addOrderBy( "SbhOldValuedesc", "SBH_OLD_VALUE DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalSbhNewValue", "SBH_NEW_VALUE = ?" ) // EQUAL

         .addFilterBy( "notequalSbhNewValue", "SBH_NEW_VALUE != ?" ) // NOTEQUAL

         .addFilterBy( "nullSbhNewValue",
      "(SBH_NEW_VALUE IS NULL OR LENGTH(SBH_NEW_VALUE) IS NULL OR LENGTH(SBH_NEW_VALUE) = 0)" ) // IS NULL

         .addFilterBy( "notnullSbhNewValue", "SBH_NEW_VALUE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanSbhNewValue", "SBH_NEW_VALUE < ?" ) // LESS THAN

         .addFilterBy( "greaterthanSbhNewValue", "SBH_NEW_VALUE > ?" ) // GREATER THAN

         .addFilterBy( "filterBySbhNewValueMatch", "SBH_NEW_VALUE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullSbhNewValue",
      "(SBH_NEW_VALUE = ? OR SBH_NEW_VALUE IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INSbhNewValue", "SBH_NEW_VALUE IN ( ? )" ) // IN

         .addFilterBy( "NOTINSbhNewValue", "SBH_NEW_VALUE NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "SbhNewValueasc", "SBH_NEW_VALUE ASC" ) // ORDER ASCENDING

         .addOrderBy( "SbhNewValuedesc", "SBH_NEW_VALUE DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalSbhUserId", "SBH_USER_ID = ?" ) // EQUAL

         .addFilterBy( "notequalSbhUserId", "SBH_USER_ID != ?" ) // NOTEQUAL

         .addFilterBy( "nullSbhUserId",
      "(SBH_USER_ID IS NULL OR LENGTH(SBH_USER_ID) IS NULL OR LENGTH(SBH_USER_ID) = 0)" ) // IS NULL

         .addFilterBy( "notnullSbhUserId", "SBH_USER_ID IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanSbhUserId", "SBH_USER_ID < ?" ) // LESS THAN

         .addFilterBy( "greaterthanSbhUserId", "SBH_USER_ID > ?" ) // GREATER THAN

         .addFilterBy( "filterBySbhUserIdMatch", "SBH_USER_ID LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullSbhUserId",
      "(SBH_USER_ID = ? OR SBH_USER_ID IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INSbhUserId", "SBH_USER_ID IN ( ? )" ) // IN

         .addFilterBy( "NOTINSbhUserId", "SBH_USER_ID NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "SbhUserIdasc", "SBH_USER_ID ASC" ) // ORDER ASCENDING

         .addOrderBy( "SbhUserIddesc", "SBH_USER_ID DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalSbhTerminalId", "SBH_TERMINAL_ID = ?" ) // EQUAL

         .addFilterBy( "notequalSbhTerminalId", "SBH_TERMINAL_ID != ?" ) // NOTEQUAL

         .addFilterBy( "nullSbhTerminalId",
      "(SBH_TERMINAL_ID IS NULL OR LENGTH(SBH_TERMINAL_ID) IS NULL OR LENGTH(SBH_TERMINAL_ID) = 0)" ) // IS NULL

         .addFilterBy( "notnullSbhTerminalId", "SBH_TERMINAL_ID IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanSbhTerminalId", "SBH_TERMINAL_ID < ?" ) // LESS THAN

         .addFilterBy( "greaterthanSbhTerminalId", "SBH_TERMINAL_ID > ?" ) // GREATER THAN

         .addFilterBy( "filterBySbhTerminalIdMatch", "SBH_TERMINAL_ID LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullSbhTerminalId",
      "(SBH_TERMINAL_ID = ? OR SBH_TERMINAL_ID IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INSbhTerminalId", "SBH_TERMINAL_ID IN ( ? )" ) // IN

         .addFilterBy( "NOTINSbhTerminalId", "SBH_TERMINAL_ID NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "SbhTerminalIdasc", "SBH_TERMINAL_ID ASC" ) // ORDER ASCENDING

         .addOrderBy( "SbhTerminalIddesc", "SBH_TERMINAL_ID DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalSbhTimestamp", "SBH_TIMESTAMP = ?" ) // EQUAL

         .addFilterBy( "notequalSbhTimestamp", "SBH_TIMESTAMP != ?" ) // NOTEQUAL

         .addFilterBy( "nullSbhTimestamp", "SBH_TIMESTAMP IS NULL" ) // IS NULL

         .addFilterBy( "notnullSbhTimestamp", "SBH_TIMESTAMP IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanSbhTimestamp", "SBH_TIMESTAMP < ?" ) // LESS THAN

         .addFilterBy( "greaterthanSbhTimestamp", "SBH_TIMESTAMP > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalSbhTimestamp", "SBH_TIMESTAMP <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalSbhTimestamp", "SBH_TIMESTAMP >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "filterBySbhTimestampMatch", "SBH_TIMESTAMP LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "betweenSbhTimestamp", "SBH_TIMESTAMP BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullSbhTimestamp",
      "(SBH_TIMESTAMP IS NULL OR SBH_TIMESTAMP = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullSbhTimestamp",
      "(SBH_TIMESTAMP IS NULL OR SBH_TIMESTAMP < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullSbhTimestamp",
      "(SBH_TIMESTAMP IS NULL OR SBH_TIMESTAMP > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INSbhTimestamp", "SBH_TIMESTAMP IN ( ? )" ) // IN

         .addFilterBy( "NOTINSbhTimestamp", "SBH_TIMESTAMP NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "SbhTimestampasc", "SBH_TIMESTAMP ASC" ) // ORDER ASCENDING

         .addOrderBy( "SbhTimestampdesc", "SBH_TIMESTAMP DESC" ) // ORDER DESCENDING
    ;

    ;
  }

  //~ Methods ////////////////////////////////////////////////////////////////

  /**
   * Gets the DMLFactory singleton instance.
   *
   * @return the DMLFactory object reference.
   *
   * @throws DMLException if an error is detected when instantiating the
   *         DMLFactory.
   */
  public static DMLFactory getDMLFactory(  )
    throws DMLException {
    if ( dml == null ) {
      dml = new SbhSubHistoryDMLFactory(  );
    }

    return dml;
  }
}
