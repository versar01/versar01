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
 * This is the DMLFactory for MshMsisdnHistory.
 *
 * @version $Revision: 1.1 $
 * @author $Author$
 * @since $jdk$
 */
public class MshMsisdnHistoryAbstractDMLFactory
  extends BaseDMLFactory {
  //~ Static variables/initializers //////////////////////////////////////////

  /** The DMLFactory singleton */
  private static DMLFactory dml = null;

  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new MshMsisdnHistoryAbstractDMLFactory object.
   *
   * @throws DMLException DOCUMENT ME!
   */
  protected MshMsisdnHistoryAbstractDMLFactory(  )
    throws DMLException {
    ;

    DMLTable table = defTable( "MshMsisdnHistory", // dmlName
        "blo.MshMsisdnHistoryDMO", // dmoName
        "MSH_MSISDN_HISTORY", // tableName
        7, // numColumns
        "MSH_SUBSCRIBER_ID, MSH_MSISDN_NO, MSH_HIST_CODE, MSH_COMMENT, MSH_USER_ID, MSH_TERMINAL_ID, MSH_TIMESTAMP", // columnList
        null, //primaryKey
        "" // versionCol     
      , false, // generatedKey
        "MSH_SUBSCRIBER_ID, MSH_MSISDN_NO, MSH_HIST_CODE, MSH_COMMENT, MSH_USER_ID, MSH_TERMINAL_ID, MSH_TIMESTAMP",
        "", "",
        new String[] {
          "MSH_SUBSCRIBER_ID", "MSH_MSISDN_NO", "MSH_HIST_CODE", "MSH_COMMENT",
          "MSH_USER_ID", "MSH_TERMINAL_ID", "MSH_TIMESTAMP"
        }, false );

    ;

    table.addFilterBy( "equalMshSubscriberId", "MSH_SUBSCRIBER_ID = ?" ) // EQUAL

         .addFilterBy( "notequalMshSubscriberId", "MSH_SUBSCRIBER_ID != ?" ) // NOTEQUAL

         .addFilterBy( "nullMshSubscriberId", "MSH_SUBSCRIBER_ID IS NULL" ) // IS NULL

         .addFilterBy( "notnullMshSubscriberId",
      "MSH_SUBSCRIBER_ID IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanMshSubscriberId", "MSH_SUBSCRIBER_ID < ?" ) // LESS THAN

         .addFilterBy( "greaterthanMshSubscriberId", "MSH_SUBSCRIBER_ID > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalMshSubscriberId",
      "MSH_SUBSCRIBER_ID <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalMshSubscriberId",
      "MSH_SUBSCRIBER_ID >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "filterByMshSubscriberIdMatch",
      "MSH_SUBSCRIBER_ID LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "betweenMshSubscriberId",
      "MSH_SUBSCRIBER_ID BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullMshSubscriberId",
      "(MSH_SUBSCRIBER_ID IS NULL OR MSH_SUBSCRIBER_ID = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullMshSubscriberId",
      "(MSH_SUBSCRIBER_ID IS NULL OR MSH_SUBSCRIBER_ID < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullMshSubscriberId",
      "(MSH_SUBSCRIBER_ID IS NULL OR MSH_SUBSCRIBER_ID > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INMshSubscriberId", "MSH_SUBSCRIBER_ID IN ( ? )" ) // IN

         .addFilterBy( "NOTINMshSubscriberId",
      "MSH_SUBSCRIBER_ID NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "MshSubscriberIdasc", "MSH_SUBSCRIBER_ID ASC" ) // ORDER ASCENDING

         .addOrderBy( "MshSubscriberIddesc", "MSH_SUBSCRIBER_ID DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalMshMsisdnNo", "(MSH_MSISDN_NO) = ?" ) // EQUAL

         .addFilterBy( "notequalMshMsisdnNo", "(MSH_MSISDN_NO) != ?" ) // NOTEQUAL

         .addFilterBy( "nullMshMsisdnNo",
      "(MSH_MSISDN_NO IS NULL OR LENGTH((MSH_MSISDN_NO)) IS NULL OR LENGTH((MSH_MSISDN_NO)) = 0)" ) // IS NULL

         .addFilterBy( "notnullMshMsisdnNo", "MSH_MSISDN_NO IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanMshMsisdnNo", "MSH_MSISDN_NO < ?" ) // LESS THAN

         .addFilterBy( "greaterthanMshMsisdnNo", "MSH_MSISDN_NO > ?" ) // GREATER THAN

         .addFilterBy( "filterByMshMsisdnNoMatch", "MSH_MSISDN_NO LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullMshMsisdnNo",
      "((MSH_MSISDN_NO) = ? OR MSH_MSISDN_NO IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INMshMsisdnNo", "(MSH_MSISDN_NO) IN ( ? )" ) // IN

         .addFilterBy( "NOTINMshMsisdnNo", "(MSH_MSISDN_NO) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "MshMsisdnNoasc", "MSH_MSISDN_NO ASC" ) // ORDER ASCENDING

         .addOrderBy( "MshMsisdnNodesc", "MSH_MSISDN_NO DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalMshHistCode", "(MSH_HIST_CODE) = ?" ) // EQUAL

         .addFilterBy( "notequalMshHistCode", "(MSH_HIST_CODE) != ?" ) // NOTEQUAL

         .addFilterBy( "nullMshHistCode",
      "(MSH_HIST_CODE IS NULL OR LENGTH((MSH_HIST_CODE)) IS NULL OR LENGTH((MSH_HIST_CODE)) = 0)" ) // IS NULL

         .addFilterBy( "notnullMshHistCode", "MSH_HIST_CODE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanMshHistCode", "MSH_HIST_CODE < ?" ) // LESS THAN

         .addFilterBy( "greaterthanMshHistCode", "MSH_HIST_CODE > ?" ) // GREATER THAN

         .addFilterBy( "filterByMshHistCodeMatch", "MSH_HIST_CODE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullMshHistCode",
      "((MSH_HIST_CODE) = ? OR MSH_HIST_CODE IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INMshHistCode", "(MSH_HIST_CODE) IN ( ? )" ) // IN

         .addFilterBy( "NOTINMshHistCode", "(MSH_HIST_CODE) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "MshHistCodeasc", "MSH_HIST_CODE ASC" ) // ORDER ASCENDING

         .addOrderBy( "MshHistCodedesc", "MSH_HIST_CODE DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalMshComment", "(MSH_COMMENT) = ?" ) // EQUAL

         .addFilterBy( "notequalMshComment", "(MSH_COMMENT) != ?" ) // NOTEQUAL

         .addFilterBy( "nullMshComment",
      "(MSH_COMMENT IS NULL OR LENGTH((MSH_COMMENT)) IS NULL OR LENGTH((MSH_COMMENT)) = 0)" ) // IS NULL

         .addFilterBy( "notnullMshComment", "MSH_COMMENT IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanMshComment", "MSH_COMMENT < ?" ) // LESS THAN

         .addFilterBy( "greaterthanMshComment", "MSH_COMMENT > ?" ) // GREATER THAN

         .addFilterBy( "filterByMshCommentMatch", "MSH_COMMENT LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullMshComment",
      "((MSH_COMMENT) = ? OR MSH_COMMENT IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INMshComment", "(MSH_COMMENT) IN ( ? )" ) // IN

         .addFilterBy( "NOTINMshComment", "(MSH_COMMENT) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "MshCommentasc", "MSH_COMMENT ASC" ) // ORDER ASCENDING

         .addOrderBy( "MshCommentdesc", "MSH_COMMENT DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalMshUserId", "(MSH_USER_ID) = ?" ) // EQUAL

         .addFilterBy( "notequalMshUserId", "(MSH_USER_ID) != ?" ) // NOTEQUAL

         .addFilterBy( "nullMshUserId",
      "(MSH_USER_ID IS NULL OR LENGTH((MSH_USER_ID)) IS NULL OR LENGTH((MSH_USER_ID)) = 0)" ) // IS NULL

         .addFilterBy( "notnullMshUserId", "MSH_USER_ID IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanMshUserId", "MSH_USER_ID < ?" ) // LESS THAN

         .addFilterBy( "greaterthanMshUserId", "MSH_USER_ID > ?" ) // GREATER THAN

         .addFilterBy( "filterByMshUserIdMatch", "MSH_USER_ID LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullMshUserId",
      "((MSH_USER_ID) = ? OR MSH_USER_ID IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INMshUserId", "(MSH_USER_ID) IN ( ? )" ) // IN

         .addFilterBy( "NOTINMshUserId", "(MSH_USER_ID) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "MshUserIdasc", "MSH_USER_ID ASC" ) // ORDER ASCENDING

         .addOrderBy( "MshUserIddesc", "MSH_USER_ID DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalMshTerminalId", "(MSH_TERMINAL_ID) = ?" ) // EQUAL

         .addFilterBy( "notequalMshTerminalId", "(MSH_TERMINAL_ID) != ?" ) // NOTEQUAL

         .addFilterBy( "nullMshTerminalId",
      "(MSH_TERMINAL_ID IS NULL OR LENGTH((MSH_TERMINAL_ID)) IS NULL OR LENGTH((MSH_TERMINAL_ID)) = 0)" ) // IS NULL

         .addFilterBy( "notnullMshTerminalId", "MSH_TERMINAL_ID IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanMshTerminalId", "MSH_TERMINAL_ID < ?" ) // LESS THAN

         .addFilterBy( "greaterthanMshTerminalId", "MSH_TERMINAL_ID > ?" ) // GREATER THAN

         .addFilterBy( "filterByMshTerminalIdMatch", "MSH_TERMINAL_ID LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullMshTerminalId",
      "((MSH_TERMINAL_ID) = ? OR MSH_TERMINAL_ID IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INMshTerminalId", "(MSH_TERMINAL_ID) IN ( ? )" ) // IN

         .addFilterBy( "NOTINMshTerminalId",
      "(MSH_TERMINAL_ID) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "MshTerminalIdasc", "MSH_TERMINAL_ID ASC" ) // ORDER ASCENDING

         .addOrderBy( "MshTerminalIddesc", "MSH_TERMINAL_ID DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalMshTimestamp", "MSH_TIMESTAMP = ?" ) // EQUAL

         .addFilterBy( "notequalMshTimestamp", "MSH_TIMESTAMP != ?" ) // NOTEQUAL

         .addFilterBy( "nullMshTimestamp", "MSH_TIMESTAMP IS NULL" ) // IS NULL

         .addFilterBy( "notnullMshTimestamp", "MSH_TIMESTAMP IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanMshTimestamp", "MSH_TIMESTAMP < ?" ) // LESS THAN

         .addFilterBy( "greaterthanMshTimestamp", "MSH_TIMESTAMP > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalMshTimestamp", "MSH_TIMESTAMP <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalMshTimestamp", "MSH_TIMESTAMP >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "filterByMshTimestampMatch", "MSH_TIMESTAMP LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "betweenMshTimestamp", "MSH_TIMESTAMP BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullMshTimestamp",
      "(MSH_TIMESTAMP IS NULL OR MSH_TIMESTAMP = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullMshTimestamp",
      "(MSH_TIMESTAMP IS NULL OR MSH_TIMESTAMP < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullMshTimestamp",
      "(MSH_TIMESTAMP IS NULL OR MSH_TIMESTAMP > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INMshTimestamp", "MSH_TIMESTAMP IN ( ? )" ) // IN

         .addFilterBy( "NOTINMshTimestamp", "MSH_TIMESTAMP NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "MshTimestampasc", "MSH_TIMESTAMP ASC" ) // ORDER ASCENDING

         .addOrderBy( "MshTimestampdesc", "MSH_TIMESTAMP DESC" ) // ORDER DESCENDING
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
      dml = new MshMsisdnHistoryDMLFactory(  );
    }

    return dml;
  }
}
