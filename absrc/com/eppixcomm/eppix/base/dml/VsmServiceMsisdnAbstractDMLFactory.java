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
 * This is the DMLFactory for VsmServiceMsisdn.
 *
 * @version $Revision: 1.1 $
 * @author $Author$
 * @since $jdk$
 */
public class VsmServiceMsisdnAbstractDMLFactory
  extends BaseDMLFactory {
  //~ Static variables/initializers //////////////////////////////////////////

  /** The DMLFactory singleton */
  private static DMLFactory dml = null;

  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new VsmServiceMsisdnAbstractDMLFactory object.
   *
   * @throws DMLException DOCUMENT ME!
   */
  protected VsmServiceMsisdnAbstractDMLFactory(  )
    throws DMLException {
    ;

    DMLTable table = defTable( "VsmServiceMsisdn", // dmlName
        "blo.VsmServiceMsisdnDMO", // dmoName
        "VSM_SERVICE_MSISDN", // tableName
        7, // numColumns
        "VSM_SUBSCRIBER_ID, VSM_SERVICE_CODE, VSM_MSISDN_NO, VSM_ACTIVATE_DATE, VSM_DEACT_DATE, VSM_BILLED_UPTO, VSM_NODE_SENT", // columnList
        "VSM_SUBSCRIBER_ID" + ", VSM_SERVICE_CODE"
        + ", VSM_MSISDN_NO", //primaryKey
        "" // versionCol
      , false, // generatedKey
        "VSM_SUBSCRIBER_ID, VSM_SERVICE_CODE, VSM_MSISDN_NO, VSM_ACTIVATE_DATE, VSM_DEACT_DATE, VSM_BILLED_UPTO, VSM_NODE_SENT",
        "", "",
        new String[] {
          "VSM_SUBSCRIBER_ID", "VSM_SERVICE_CODE", "VSM_MSISDN_NO",
          "VSM_ACTIVATE_DATE", "VSM_DEACT_DATE", "VSM_BILLED_UPTO",
          "VSM_NODE_SENT"
        } );

    table.addFilterBy( "equalVsmSubscriberId", /* PK attribute */
      "VSM_SUBSCRIBER_ID = ?" )
         .addFilterBy( "filterByVsmSubscriberIdMatch",
      "VSM_SUBSCRIBER_ID LIKE ?" )
         .addFilterBy( "INVsmSubscriberId", "VSM_SUBSCRIBER_ID IN ( ? )" ) // IN

         .addFilterBy( "NOTINVsmSubscriberId",
      "VSM_SUBSCRIBER_ID NOT IN ( ? )" ) // NOT IN

         .addFilterBy( "notequalVsmSubscriberId", "VSM_SUBSCRIBER_ID != ?" ) // NOTEQUAL

         .addFilterBy( "nullVsmSubscriberId", "VSM_SUBSCRIBER_ID IS NULL" ) // IS NULL

         .addFilterBy( "notnullVsmSubscriberId",
      "VSM_SUBSCRIBER_ID IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanVsmSubscriberId", "VSM_SUBSCRIBER_ID < ?" ) // LESS THAN

         .addFilterBy( "greaterthanVsmSubscriberId", "VSM_SUBSCRIBER_ID > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalVsmSubscriberId",
      "VSM_SUBSCRIBER_ID <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalVsmSubscriberId",
      "VSM_SUBSCRIBER_ID >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "filterByVsmSubscriberIdMatch",
      "VSM_SUBSCRIBER_ID LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "betweenVsmSubscriberId",
      "VSM_SUBSCRIBER_ID BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullVsmSubscriberId",
      "(VSM_SUBSCRIBER_ID IS NULL OR VSM_SUBSCRIBER_ID = ?)" ) // EQUALORNULL
                                                               // TODO : we may need to wrap this with a ()

         .addFilterBy( "lessthanornullVsmSubscriberId",
      "(VSM_SUBSCRIBER_ID IS NULL OR VSM_SUBSCRIBER_ID < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullVsmSubscriberId",
      "(VSM_SUBSCRIBER_ID IS NULL OR VSM_SUBSCRIBER_ID > ?)" ) // GREATERTHANORNULL

         .addOrderBy( "VsmSubscriberIdasc", "VSM_SUBSCRIBER_ID ASC" ) // ORDER ASCENDING

         .addOrderBy( "VsmSubscriberIddesc", "VSM_SUBSCRIBER_ID DESC" ) // ORDER DESCENDING

         .addFilterBy( "equalVsmServiceCode", /* PK attribute */
      "(VSM_SERVICE_CODE) = ?" )
         .addFilterBy( "filterByVsmServiceCodeMatch",
      "VSM_SERVICE_CODE LIKE ?" )
         .addFilterBy( "INVsmServiceCode", "(VSM_SERVICE_CODE) IN ( ? )" ) // IN

         .addFilterBy( "NOTINVsmServiceCode",
      "(VSM_SERVICE_CODE) NOT IN ( ? )" ) // NOT IN

         .addFilterBy( "notequalVsmServiceCode", "(VSM_SERVICE_CODE) != ?" ) // NOTEQUAL

         .addFilterBy( "nullVsmServiceCode",
      "(VSM_SERVICE_CODE IS NULL OR LENGTH((VSM_SERVICE_CODE)) IS NULL OR LENGTH((VSM_SERVICE_CODE)) = 0)" ) // IS NULL

         .addFilterBy( "notnullVsmServiceCode", "VSM_SERVICE_CODE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanVsmServiceCode", "VSM_SERVICE_CODE < ?" ) // LESS THAN

         .addFilterBy( "greaterthanVsmServiceCode", "VSM_SERVICE_CODE > ?" ) // GREATER THAN

         .addFilterBy( "filterByVsmServiceCodeMatch",
      "VSM_SERVICE_CODE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullVsmServiceCode",
      "((VSM_SERVICE_CODE) = ? OR VSM_SERVICE_CODE IS NULL)" ) // EQUALORNULL
                                                                   // TODO : we may need to wrap this with a ()

         .addOrderBy( "VsmServiceCodeasc", "VSM_SERVICE_CODE ASC" ) // ORDER ASCENDING

         .addOrderBy( "VsmServiceCodedesc", "VSM_SERVICE_CODE DESC" ) // ORDER DESCENDING

         .addFilterBy( "equalVsmMsisdnNo", /* PK attribute */
      "(VSM_MSISDN_NO) = ?" )
         .addFilterBy( "filterByVsmMsisdnNoMatch", "VSM_MSISDN_NO LIKE ?" )
         .addFilterBy( "INVsmMsisdnNo", "(VSM_MSISDN_NO) IN ( ? )" ) // IN

         .addFilterBy( "NOTINVsmMsisdnNo", "(VSM_MSISDN_NO) NOT IN ( ? )" ) // NOT IN

         .addFilterBy( "notequalVsmMsisdnNo", "(VSM_MSISDN_NO) != ?" ) // NOTEQUAL

         .addFilterBy( "nullVsmMsisdnNo",
      "(VSM_MSISDN_NO IS NULL OR LENGTH((VSM_MSISDN_NO)) IS NULL OR LENGTH((VSM_MSISDN_NO)) = 0)" ) // IS NULL

         .addFilterBy( "notnullVsmMsisdnNo", "VSM_MSISDN_NO IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanVsmMsisdnNo", "VSM_MSISDN_NO < ?" ) // LESS THAN

         .addFilterBy( "greaterthanVsmMsisdnNo", "VSM_MSISDN_NO > ?" ) // GREATER THAN

         .addFilterBy( "filterByVsmMsisdnNoMatch", "VSM_MSISDN_NO LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullVsmMsisdnNo",
      "((VSM_MSISDN_NO) = ? OR VSM_MSISDN_NO IS NULL)" ) // EQUALORNULL
                                                             // TODO : we may need to wrap this with a ()

         .addOrderBy( "VsmMsisdnNoasc", "VSM_MSISDN_NO ASC" ) // ORDER ASCENDING

         .addOrderBy( "VsmMsisdnNodesc", "VSM_MSISDN_NO DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalVsmActivateDate", "VSM_ACTIVATE_DATE = ?" ) // EQUAL

         .addFilterBy( "notequalVsmActivateDate", "VSM_ACTIVATE_DATE != ?" ) // NOTEQUAL

         .addFilterBy( "nullVsmActivateDate", "VSM_ACTIVATE_DATE IS NULL" ) // IS NULL

         .addFilterBy( "notnullVsmActivateDate",
      "VSM_ACTIVATE_DATE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanVsmActivateDate", "VSM_ACTIVATE_DATE < ?" ) // LESS THAN

         .addFilterBy( "greaterthanVsmActivateDate", "VSM_ACTIVATE_DATE > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalVsmActivateDate",
      "VSM_ACTIVATE_DATE <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalVsmActivateDate",
      "VSM_ACTIVATE_DATE >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "filterByVsmActivateDateMatch",
      "VSM_ACTIVATE_DATE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "betweenVsmActivateDate",
      "VSM_ACTIVATE_DATE BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullVsmActivateDate",
      "(VSM_ACTIVATE_DATE IS NULL OR VSM_ACTIVATE_DATE = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullVsmActivateDate",
      "(VSM_ACTIVATE_DATE IS NULL OR VSM_ACTIVATE_DATE < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullVsmActivateDate",
      "(VSM_ACTIVATE_DATE IS NULL OR VSM_ACTIVATE_DATE > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INVsmActivateDate", "VSM_ACTIVATE_DATE IN ( ? )" ) // IN

         .addFilterBy( "NOTINVsmActivateDate",
      "VSM_ACTIVATE_DATE NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "VsmActivateDateasc", "VSM_ACTIVATE_DATE ASC" ) // ORDER ASCENDING

         .addOrderBy( "VsmActivateDatedesc", "VSM_ACTIVATE_DATE DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalVsmDeactDate", "VSM_DEACT_DATE = ?" ) // EQUAL

         .addFilterBy( "notequalVsmDeactDate", "VSM_DEACT_DATE != ?" ) // NOTEQUAL

         .addFilterBy( "nullVsmDeactDate", "VSM_DEACT_DATE IS NULL" ) // IS NULL

         .addFilterBy( "notnullVsmDeactDate", "VSM_DEACT_DATE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanVsmDeactDate", "VSM_DEACT_DATE < ?" ) // LESS THAN

         .addFilterBy( "greaterthanVsmDeactDate", "VSM_DEACT_DATE > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalVsmDeactDate", "VSM_DEACT_DATE <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalVsmDeactDate", "VSM_DEACT_DATE >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "filterByVsmDeactDateMatch", "VSM_DEACT_DATE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "betweenVsmDeactDate", "VSM_DEACT_DATE BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullVsmDeactDate",
      "(VSM_DEACT_DATE IS NULL OR VSM_DEACT_DATE = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullVsmDeactDate",
      "(VSM_DEACT_DATE IS NULL OR VSM_DEACT_DATE < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullVsmDeactDate",
      "(VSM_DEACT_DATE IS NULL OR VSM_DEACT_DATE > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INVsmDeactDate", "VSM_DEACT_DATE IN ( ? )" ) // IN

         .addFilterBy( "NOTINVsmDeactDate", "VSM_DEACT_DATE NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "VsmDeactDateasc", "VSM_DEACT_DATE ASC" ) // ORDER ASCENDING

         .addOrderBy( "VsmDeactDatedesc", "VSM_DEACT_DATE DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalVsmBilledUpto", "VSM_BILLED_UPTO = ?" ) // EQUAL

         .addFilterBy( "notequalVsmBilledUpto", "VSM_BILLED_UPTO != ?" ) // NOTEQUAL

         .addFilterBy( "nullVsmBilledUpto", "VSM_BILLED_UPTO IS NULL" ) // IS NULL

         .addFilterBy( "notnullVsmBilledUpto", "VSM_BILLED_UPTO IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanVsmBilledUpto", "VSM_BILLED_UPTO < ?" ) // LESS THAN

         .addFilterBy( "greaterthanVsmBilledUpto", "VSM_BILLED_UPTO > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalVsmBilledUpto", "VSM_BILLED_UPTO <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalVsmBilledUpto",
      "VSM_BILLED_UPTO >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "filterByVsmBilledUptoMatch", "VSM_BILLED_UPTO LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "betweenVsmBilledUpto",
      "VSM_BILLED_UPTO BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullVsmBilledUpto",
      "(VSM_BILLED_UPTO IS NULL OR VSM_BILLED_UPTO = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullVsmBilledUpto",
      "(VSM_BILLED_UPTO IS NULL OR VSM_BILLED_UPTO < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullVsmBilledUpto",
      "(VSM_BILLED_UPTO IS NULL OR VSM_BILLED_UPTO > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INVsmBilledUpto", "VSM_BILLED_UPTO IN ( ? )" ) // IN

         .addFilterBy( "NOTINVsmBilledUpto", "VSM_BILLED_UPTO NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "VsmBilledUptoasc", "VSM_BILLED_UPTO ASC" ) // ORDER ASCENDING

         .addOrderBy( "VsmBilledUptodesc", "VSM_BILLED_UPTO DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalVsmNodeSent", "(VSM_NODE_SENT) = ?" ) // EQUAL

         .addFilterBy( "notequalVsmNodeSent", "(VSM_NODE_SENT) != ?" ) // NOTEQUAL

         .addFilterBy( "nullVsmNodeSent",
      "(VSM_NODE_SENT IS NULL OR LENGTH((VSM_NODE_SENT)) IS NULL OR LENGTH((VSM_NODE_SENT)) = 0)" ) // IS NULL

         .addFilterBy( "notnullVsmNodeSent", "VSM_NODE_SENT IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanVsmNodeSent", "VSM_NODE_SENT < ?" ) // LESS THAN

         .addFilterBy( "greaterthanVsmNodeSent", "VSM_NODE_SENT > ?" ) // GREATER THAN

         .addFilterBy( "filterByVsmNodeSentMatch", "VSM_NODE_SENT LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullVsmNodeSent",
      "((VSM_NODE_SENT) = ? OR VSM_NODE_SENT IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INVsmNodeSent", "(VSM_NODE_SENT) IN ( ? )" ) // IN

         .addFilterBy( "NOTINVsmNodeSent", "(VSM_NODE_SENT) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "VsmNodeSentasc", "VSM_NODE_SENT ASC" ) // ORDER ASCENDING

         .addOrderBy( "VsmNodeSentdesc", "VSM_NODE_SENT DESC" ) // ORDER DESCENDING
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
      dml = new VsmServiceMsisdnAbstractDMLFactory(  );
    }

    return dml;
  }
}
