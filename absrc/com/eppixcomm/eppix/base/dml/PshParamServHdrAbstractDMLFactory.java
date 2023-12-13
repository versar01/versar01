package com.eppixcomm.eppix.base.dml;



/**
 * This is the DMLFactory for PshParamServHdr.
 *
 * @version $Revision: 1.1 $
 * @author $Author$
 * @since $jdk$
 */
public class PshParamServHdrAbstractDMLFactory
  extends BaseDMLFactory {
  //~ Static variables/initializers //////////////////////////////////////////

  /** The DMLFactory singleton */
  private static DMLFactory dml = null;

  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new PshParamServHdrAbstractDMLFactory object.
   *
   * @throws DMLException DOCUMENT ME!
   */
  protected PshParamServHdrAbstractDMLFactory(  )
    throws DMLException {
    ;

    DMLTable table = defTable( "PshParamServHdr", // dmlName
        "blo.PshParamServHdrDMO", // dmoName
        "PSH_PARAM_SERV_HDR", // tableName
        7, // numColumns
        "PSH_ID, PSH_SERVICE_CODE, PSH_SERVICE_TYPE, PSH_SUBSCRIBER_ID, PSH_SIM_NO, PSH_MSISDN_NO, PSH_ARCHIVED", // columnList
        "PSH_ID", //primaryKey
        "" // versionCol     
      , true, // generatedKey
        "PSH_ID, PSH_SERVICE_CODE, PSH_SERVICE_TYPE, PSH_SUBSCRIBER_ID, PSH_SIM_NO, PSH_MSISDN_NO, PSH_ARCHIVED",
        "", "",
        new String[] {
          "PSH_ID", "PSH_SERVICE_CODE", "PSH_SERVICE_TYPE", "PSH_SUBSCRIBER_ID", "PSH_SIM_NO",
          "PSH_MSISDN_NO", "PSH_ARCHIVED"
        } );

    table.addFilterBy( "equalPshId", /* PK attribute */
      "PSH_ID = ?" )
         .addFilterBy( "filterByPshIdMatch", "PSH_ID LIKE ?" )
         .addFilterBy( "INPshId", "PSH_ID IN ( ? )" ) // IN

         .addFilterBy( "NOTINPshId", "PSH_ID NOT IN ( ? )" ) // NOT IN

         .addFilterBy( "notequalPshId", "PSH_ID != ?" ) // NOTEQUAL

         .addFilterBy( "nullPshId", "PSH_ID IS NULL" ) // IS NULL

         .addFilterBy( "notnullPshId", "PSH_ID IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanPshId", "PSH_ID < ?" ) // LESS THAN

         .addFilterBy( "greaterthanPshId", "PSH_ID > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalPshId", "PSH_ID <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalPshId", "PSH_ID >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "filterByPshIdMatch", "PSH_ID LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "betweenPshId", "PSH_ID BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullPshId", "(PSH_ID IS NULL OR PSH_ID = ?)" ) // EQUALORNULL
                                                                              // TODO : we may need to wrap this with a () 

         .addFilterBy( "lessthanornullPshId", "(PSH_ID IS NULL OR PSH_ID < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullPshId",
      "(PSH_ID IS NULL OR PSH_ID > ?)" ) // GREATERTHANORNULL

         .addOrderBy( "PshIdasc", "PSH_ID ASC" ) // ORDER ASCENDING

         .addOrderBy( "PshIddesc", "PSH_ID DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalPshServiceCode", "(PSH_SERVICE_CODE) = ?" ) // EQUAL

         .addFilterBy( "notequalPshServiceCode", "(PSH_SERVICE_CODE) != ?" ) // NOTEQUAL

         .addFilterBy( "nullPshServiceCode",
      "(PSH_SERVICE_CODE IS NULL OR LENGTH((PSH_SERVICE_CODE)) = 0)" ) // IS NULL

         .addFilterBy( "notnullPshServiceCode", "PSH_SERVICE_CODE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanPshServiceCode", "PSH_SERVICE_CODE < ?" ) // LESS THAN

         .addFilterBy( "greaterthanPshServiceCode", "PSH_SERVICE_CODE > ?" ) // GREATER THAN

         .addFilterBy( "filterByPshServiceCodeMatch",
      "PSH_SERVICE_CODE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullPshServiceCode",
      "((PSH_SERVICE_CODE) = ? OR PSH_SERVICE_CODE IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INPshServiceCode", "(PSH_SERVICE_CODE) IN ( ? )" ) // IN

         .addFilterBy( "NOTINPshServiceCode",
      "(PSH_SERVICE_CODE) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "PshServiceCodeasc", "PSH_SERVICE_CODE ASC" ) // ORDER ASCENDING

         .addOrderBy( "PshServiceCodedesc", "PSH_SERVICE_CODE DESC" ) // ORDER DESCENDING
    ;

//===========================================================================================
    table.addFilterBy( "equalPshServiceType", "(PSH_SERVICE_TYPE) = ?" ) // EQUAL

    .addFilterBy( "notequalPshServiceType", "(PSH_SERVICE_TYPE) != ?" ) // NOTEQUAL

    .addFilterBy( "nullPshServiceType",
 "(PSH_SERVICE_TYPE IS NULL OR LENGTH((PSH_SERVICE_TYPE)) = 0)" ) // IS NULL

    .addFilterBy( "notnullPshServiceType", "PSH_SERVICE_TYPE IS NOT NULL" ) // IS NOT NULL

    .addFilterBy( "lessthanPshServiceType", "PSH_SERVICE_TYPE < ?" ) // LESS THAN

    .addFilterBy( "greaterthanPshServiceType", "PSH_SERVICE_TYPE > ?" ) // GREATER THAN

    .addFilterBy( "filterByPshServiceTypeMatch",
 "PSH_SERVICE_TYPE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

    .addFilterBy( "equalornullPshServiceType",
 "((PSH_SERVICE_TYPE) = ? OR PSH_SERVICE_TYPE IS NULL)" ) // EQUALORNULL

    .addFilterBy( "INPshServiceType", "(PSH_SERVICE_TYPE) IN ( ? )" ) // IN

    .addFilterBy( "NOTINPshServiceType",
 "(PSH_SERVICE_TYPE) NOT IN ( ? )" ) // NOT IN

    .addOrderBy( "PshServiceTypeasc", "PSH_SERVICE_TYPE ASC" ) // ORDER ASCENDING

    .addOrderBy( "PshServiceTypedesc", "PSH_SERVICE_TYPE DESC" ) // ORDER DESCENDING
;
//===========================================================================================    
    
    table.addFilterBy( "equalPshSubscriberId", "PSH_SUBSCRIBER_ID = ?" ) // EQUAL

         .addFilterBy( "notequalPshSubscriberId", "PSH_SUBSCRIBER_ID != ?" ) // NOTEQUAL

         .addFilterBy( "nullPshSubscriberId", "PSH_SUBSCRIBER_ID IS NULL" ) // IS NULL

         .addFilterBy( "notnullPshSubscriberId",
      "PSH_SUBSCRIBER_ID IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanPshSubscriberId", "PSH_SUBSCRIBER_ID < ?" ) // LESS THAN

         .addFilterBy( "greaterthanPshSubscriberId", "PSH_SUBSCRIBER_ID > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalPshSubscriberId",
      "PSH_SUBSCRIBER_ID <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalPshSubscriberId",
      "PSH_SUBSCRIBER_ID >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "filterByPshSubscriberIdMatch",
      "PSH_SUBSCRIBER_ID LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "betweenPshSubscriberId",
      "PSH_SUBSCRIBER_ID BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullPshSubscriberId",
      "(PSH_SUBSCRIBER_ID IS NULL OR PSH_SUBSCRIBER_ID = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullPshSubscriberId",
      "(PSH_SUBSCRIBER_ID IS NULL OR PSH_SUBSCRIBER_ID < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullPshSubscriberId",
      "(PSH_SUBSCRIBER_ID IS NULL OR PSH_SUBSCRIBER_ID > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INPshSubscriberId", "PSH_SUBSCRIBER_ID IN ( ? )" ) // IN

         .addFilterBy( "NOTINPshSubscriberId",
      "PSH_SUBSCRIBER_ID NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "PshSubscriberIdasc", "PSH_SUBSCRIBER_ID ASC" ) // ORDER ASCENDING

         .addOrderBy( "PshSubscriberIddesc", "PSH_SUBSCRIBER_ID DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalPshSimNo", "(PSH_SIM_NO) = ?" ) // EQUAL

         .addFilterBy( "notequalPshSimNo", "(PSH_SIM_NO) != ?" ) // NOTEQUAL

         .addFilterBy( "nullPshSimNo",
      "(PSH_SIM_NO IS NULL OR LENGTH((PSH_SIM_NO)) = 0)" ) // IS NULL

         .addFilterBy( "notnullPshSimNo", "PSH_SIM_NO IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanPshSimNo", "PSH_SIM_NO < ?" ) // LESS THAN

         .addFilterBy( "greaterthanPshSimNo", "PSH_SIM_NO > ?" ) // GREATER THAN

         .addFilterBy( "filterByPshSimNoMatch", "PSH_SIM_NO LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullPshSimNo",
      "((PSH_SIM_NO) = ? OR PSH_SIM_NO IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INPshSimNo", "(PSH_SIM_NO) IN ( ? )" ) // IN

         .addFilterBy( "NOTINPshSimNo", "(PSH_SIM_NO) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "PshSimNoasc", "PSH_SIM_NO ASC" ) // ORDER ASCENDING

         .addOrderBy( "PshSimNodesc", "PSH_SIM_NO DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalPshMsisdnNo", "(PSH_MSISDN_NO) = ?" ) // EQUAL

         .addFilterBy( "notequalPshMsisdnNo", "(PSH_MSISDN_NO) != ?" ) // NOTEQUAL

         .addFilterBy( "nullPshMsisdnNo",
      "(PSH_MSISDN_NO IS NULL OR LENGTH((PSH_MSISDN_NO)) = 0)" ) // IS NULL

         .addFilterBy( "notnullPshMsisdnNo", "PSH_MSISDN_NO IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanPshMsisdnNo", "PSH_MSISDN_NO < ?" ) // LESS THAN

         .addFilterBy( "greaterthanPshMsisdnNo", "PSH_MSISDN_NO > ?" ) // GREATER THAN

         .addFilterBy( "filterByPshMsisdnNoMatch", "PSH_MSISDN_NO LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullPshMsisdnNo",
      "((PSH_MSISDN_NO) = ? OR PSH_MSISDN_NO IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INPshMsisdnNo", "(PSH_MSISDN_NO) IN ( ? )" ) // IN

         .addFilterBy( "NOTINPshMsisdnNo", "(PSH_MSISDN_NO) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "PshMsisdnNoasc", "PSH_MSISDN_NO ASC" ) // ORDER ASCENDING

         .addOrderBy( "PshMsisdnNodesc", "PSH_MSISDN_NO DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalPshArchived", "(PSH_ARCHIVED) = ?" ) // EQUAL

         .addFilterBy( "notequalPshArchived", "(PSH_ARCHIVED) != ?" ) // NOTEQUAL

         .addFilterBy( "nullPshArchived",
      "(PSH_ARCHIVED IS NULL OR LENGTH((PSH_ARCHIVED)) = 0)" ) // IS NULL

         .addFilterBy( "notnullPshArchived", "PSH_ARCHIVED IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanPshArchived", "PSH_ARCHIVED < ?" ) // LESS THAN

         .addFilterBy( "greaterthanPshArchived", "PSH_ARCHIVED > ?" ) // GREATER THAN

         .addFilterBy( "filterByPshArchivedMatch", "PSH_ARCHIVED LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullPshArchived",
      "((PSH_ARCHIVED) = ? OR PSH_ARCHIVED IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INPshArchived", "(PSH_ARCHIVED) IN ( ? )" ) // IN

         .addFilterBy( "NOTINPshArchived", "(PSH_ARCHIVED) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "PshArchivedasc", "PSH_ARCHIVED ASC" ) // ORDER ASCENDING

         .addOrderBy( "PshArchiveddesc", "PSH_ARCHIVED DESC" ) // ORDER DESCENDING
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
      dml = new PshParamServHdrAbstractDMLFactory(  );
    }

    return dml;
  }
}
