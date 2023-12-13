package com.eppixcomm.eppix.base.dml;



/**
 * This is the DMLFactory for EcEventCommand.
 *
 * @version $Revision: 1.1 $
 * @author $Author$
 * @since $jdk$
 */
public class EcEventCommandAbstractDMLFactory
  extends BaseDMLFactory {
  //~ Static variables/initializers //////////////////////////////////////////

  /** The DMLFactory singleton */
  private static DMLFactory dml = null;

  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new EcEventCommandAbstractDMLFactory object.
   *
   * @throws DMLException DOCUMENT ME!
   */
  protected EcEventCommandAbstractDMLFactory(  )
    throws DMLException {
    ;

    DMLTable table = defTable( "EcEventCommand", // dmlName
        "blo.EcEventCommandDMO", // dmoName
        "EC_EVENT_COMMAND", // tableName
        14, // numColumns
        "EC_COMMAND, EC_STATUS, EC_DATE, EC_TIME, EC_MESSAGE, EC_NETWORK, EC_TYPE, EC_PRIORITY, EC_SEND_SEQ"
        + ", EC_SUBSCRIBER_ID, EC_MSISDN, EC_SIM, EC_OPERATOR, EC_TTY", // columnList , EC_TECHNOLOGY_IND
        "(EC_COMMAND)", //primaryKey
        "" // versionCol     
      , false, // generatedKey
        "EC_COMMAND, EC_STATUS, EC_DATE, EC_TIME, EC_MESSAGE, EC_NETWORK, EC_TYPE, EC_PRIORITY, EC_SEND_SEQ"
        + ", EC_SUBSCRIBER_ID, EC_MSISDN, EC_SIM, EC_OPERATOR, EC_TTY", //, EC_TECHNOLOGY_IND
        "", "",
        new String[] {
          "EC_COMMAND", "EC_STATUS", "EC_DATE", "EC_TIME", "EC_MESSAGE",
          "EC_NETWORK", "EC_TYPE", "EC_PRIORITY", "EC_SEND_SEQ",
          "EC_SUBSCRIBER_ID", "EC_MSISDN", "EC_SIM", "EC_OPERATOR",
          "EC_TTY"//, "EC_TECHNOLOGY_IND"
        } );

    table.addFilterBy( "equalEcCommand", /* PK attribute */
      "(EC_COMMAND) = ?" )
         .addFilterBy( "filterByEcCommandMatch", "EC_COMMAND LIKE ?" )
         .addFilterBy( "INEcCommand", "(EC_COMMAND) IN ( ? )" ) // IN

         .addFilterBy( "NOTINEcCommand", "(EC_COMMAND) NOT IN ( ? )" ) // NOT IN

         .addFilterBy( "notequalEcCommand", "(EC_COMMAND) != ?" ) // NOTEQUAL

         .addFilterBy( "nullEcCommand",
      "(EC_COMMAND IS NULL OR LENGTH((EC_COMMAND)) IS NULL OR LENGTH((EC_COMMAND)) = 0)" ) // IS NULL

         .addFilterBy( "notnullEcCommand", "EC_COMMAND IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanEcCommand", "EC_COMMAND < ?" ) // LESS THAN

         .addFilterBy( "greaterthanEcCommand", "EC_COMMAND > ?" ) // GREATER THAN

         .addFilterBy( "filterByEcCommandMatch", "EC_COMMAND LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullEcCommand",
      "((EC_COMMAND) = ? OR EC_COMMAND IS NULL)" ) // EQUALORNULL
                                                       // TODO : we may need to wrap this with a () 

         .addOrderBy( "EcCommandasc", "EC_COMMAND ASC" ) // ORDER ASCENDING

         .addOrderBy( "EcCommanddesc", "EC_COMMAND DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalEcStatus", "(EC_STATUS) = ?" ) // EQUAL

         .addFilterBy( "notequalEcStatus", "(EC_STATUS) != ?" ) // NOTEQUAL

         .addFilterBy( "nullEcStatus",
      "(EC_STATUS IS NULL OR LENGTH((EC_STATUS)) IS NULL OR LENGTH((EC_STATUS)) = 0)" ) // IS NULL

         .addFilterBy( "notnullEcStatus", "EC_STATUS IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanEcStatus", "EC_STATUS < ?" ) // LESS THAN

         .addFilterBy( "greaterthanEcStatus", "EC_STATUS > ?" ) // GREATER THAN

         .addFilterBy( "filterByEcStatusMatch", "EC_STATUS LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullEcStatus",
      "((EC_STATUS) = ? OR EC_STATUS IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INEcStatus", "(EC_STATUS) IN ( ? )" ) // IN

         .addFilterBy( "NOTINEcStatus", "(EC_STATUS) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "EcStatusasc", "EC_STATUS ASC" ) // ORDER ASCENDING

         .addOrderBy( "EcStatusdesc", "EC_STATUS DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalEcDate", "EC_DATE = ?" ) // EQUAL

         .addFilterBy( "notequalEcDate", "EC_DATE != ?" ) // NOTEQUAL

         .addFilterBy( "nullEcDate", "EC_DATE IS NULL" ) // IS NULL

         .addFilterBy( "notnullEcDate", "EC_DATE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanEcDate", "EC_DATE < ?" ) // LESS THAN

         .addFilterBy( "greaterthanEcDate", "EC_DATE > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalEcDate", "EC_DATE <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalEcDate", "EC_DATE >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "filterByEcDateMatch", "EC_DATE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "betweenEcDate", "EC_DATE BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullEcDate", "(EC_DATE IS NULL OR EC_DATE = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullEcDate",
      "(EC_DATE IS NULL OR EC_DATE < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullEcDate",
      "(EC_DATE IS NULL OR EC_DATE > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INEcDate", "EC_DATE IN ( ? )" ) // IN

         .addFilterBy( "NOTINEcDate", "EC_DATE NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "EcDateasc", "EC_DATE ASC" ) // ORDER ASCENDING

         .addOrderBy( "EcDatedesc", "EC_DATE DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalEcTime", "EC_TIME = ?" ) // EQUAL

         .addFilterBy( "notequalEcTime", "EC_TIME != ?" ) // NOTEQUAL

         .addFilterBy( "nullEcTime", "EC_TIME IS NULL" ) // IS NULL

         .addFilterBy( "notnullEcTime", "EC_TIME IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanEcTime", "EC_TIME < ?" ) // LESS THAN

         .addFilterBy( "greaterthanEcTime", "EC_TIME > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalEcTime", "EC_TIME <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalEcTime", "EC_TIME >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "filterByEcTimeMatch", "EC_TIME LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "betweenEcTime", "EC_TIME BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullEcTime", "(EC_TIME IS NULL OR EC_TIME = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullEcTime",
      "(EC_TIME IS NULL OR EC_TIME < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullEcTime",
      "(EC_TIME IS NULL OR EC_TIME > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INEcTime", "EC_TIME IN ( ? )" ) // IN

         .addFilterBy( "NOTINEcTime", "EC_TIME NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "EcTimeasc", "EC_TIME ASC" ) // ORDER ASCENDING

         .addOrderBy( "EcTimedesc", "EC_TIME DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalEcMessage", "(EC_MESSAGE) = ?" ) // EQUAL

         .addFilterBy( "notequalEcMessage", "(EC_MESSAGE) != ?" ) // NOTEQUAL

         .addFilterBy( "nullEcMessage",
      "(EC_MESSAGE IS NULL OR LENGTH((EC_MESSAGE)) IS NULL OR LENGTH((EC_MESSAGE)) = 0)" ) // IS NULL

         .addFilterBy( "notnullEcMessage", "EC_MESSAGE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanEcMessage", "EC_MESSAGE < ?" ) // LESS THAN

         .addFilterBy( "greaterthanEcMessage", "EC_MESSAGE > ?" ) // GREATER THAN

         .addFilterBy( "filterByEcMessageMatch", "EC_MESSAGE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullEcMessage",
      "((EC_MESSAGE) = ? OR EC_MESSAGE IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INEcMessage", "(EC_MESSAGE) IN ( ? )" ) // IN

         .addFilterBy( "NOTINEcMessage", "(EC_MESSAGE) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "EcMessageasc", "EC_MESSAGE ASC" ) // ORDER ASCENDING

         .addOrderBy( "EcMessagedesc", "EC_MESSAGE DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalEcNetwork", "(EC_NETWORK) = ?" ) // EQUAL

         .addFilterBy( "notequalEcNetwork", "(EC_NETWORK) != ?" ) // NOTEQUAL

         .addFilterBy( "nullEcNetwork",
      "(EC_NETWORK IS NULL OR LENGTH((EC_NETWORK)) IS NULL OR LENGTH((EC_NETWORK)) = 0)" ) // IS NULL

         .addFilterBy( "notnullEcNetwork", "EC_NETWORK IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanEcNetwork", "EC_NETWORK < ?" ) // LESS THAN

         .addFilterBy( "greaterthanEcNetwork", "EC_NETWORK > ?" ) // GREATER THAN

         .addFilterBy( "filterByEcNetworkMatch", "EC_NETWORK LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullEcNetwork",
      "((EC_NETWORK) = ? OR EC_NETWORK IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INEcNetwork", "(EC_NETWORK) IN ( ? )" ) // IN

         .addFilterBy( "NOTINEcNetwork", "(EC_NETWORK) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "EcNetworkasc", "EC_NETWORK ASC" ) // ORDER ASCENDING

         .addOrderBy( "EcNetworkdesc", "EC_NETWORK DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalEcType", "(EC_TYPE) = ?" ) // EQUAL

         .addFilterBy( "notequalEcType", "(EC_TYPE) != ?" ) // NOTEQUAL

         .addFilterBy( "nullEcType",
      "(EC_TYPE IS NULL OR LENGTH((EC_TYPE)) IS NULL OR LENGTH((EC_TYPE)) = 0)" ) // IS NULL

         .addFilterBy( "notnullEcType", "EC_TYPE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanEcType", "EC_TYPE < ?" ) // LESS THAN

         .addFilterBy( "greaterthanEcType", "EC_TYPE > ?" ) // GREATER THAN

         .addFilterBy( "filterByEcTypeMatch", "EC_TYPE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullEcType",
      "((EC_TYPE) = ? OR EC_TYPE IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INEcType", "(EC_TYPE) IN ( ? )" ) // IN

         .addFilterBy( "NOTINEcType", "(EC_TYPE) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "EcTypeasc", "EC_TYPE ASC" ) // ORDER ASCENDING

         .addOrderBy( "EcTypedesc", "EC_TYPE DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalEcPriority", "EC_PRIORITY = ?" ) // EQUAL

         .addFilterBy( "notequalEcPriority", "EC_PRIORITY != ?" ) // NOTEQUAL

         .addFilterBy( "nullEcPriority", "EC_PRIORITY IS NULL" ) // IS NULL

         .addFilterBy( "notnullEcPriority", "EC_PRIORITY IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanEcPriority", "EC_PRIORITY < ?" ) // LESS THAN

         .addFilterBy( "greaterthanEcPriority", "EC_PRIORITY > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalEcPriority", "EC_PRIORITY <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalEcPriority", "EC_PRIORITY >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "filterByEcPriorityMatch", "EC_PRIORITY LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "betweenEcPriority", "EC_PRIORITY BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullEcPriority",
      "(EC_PRIORITY IS NULL OR EC_PRIORITY = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullEcPriority",
      "(EC_PRIORITY IS NULL OR EC_PRIORITY < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullEcPriority",
      "(EC_PRIORITY IS NULL OR EC_PRIORITY > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INEcPriority", "EC_PRIORITY IN ( ? )" ) // IN

         .addFilterBy( "NOTINEcPriority", "EC_PRIORITY NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "EcPriorityasc", "EC_PRIORITY ASC" ) // ORDER ASCENDING

         .addOrderBy( "EcPrioritydesc", "EC_PRIORITY DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalEcSendSeq", "EC_SEND_SEQ = ?" ) // EQUAL

         .addFilterBy( "notequalEcSendSeq", "EC_SEND_SEQ != ?" ) // NOTEQUAL

         .addFilterBy( "nullEcSendSeq", "EC_SEND_SEQ IS NULL" ) // IS NULL

         .addFilterBy( "notnullEcSendSeq", "EC_SEND_SEQ IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanEcSendSeq", "EC_SEND_SEQ < ?" ) // LESS THAN

         .addFilterBy( "greaterthanEcSendSeq", "EC_SEND_SEQ > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalEcSendSeq", "EC_SEND_SEQ <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalEcSendSeq", "EC_SEND_SEQ >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "filterByEcSendSeqMatch", "EC_SEND_SEQ LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "betweenEcSendSeq", "EC_SEND_SEQ BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullEcSendSeq",
      "(EC_SEND_SEQ IS NULL OR EC_SEND_SEQ = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullEcSendSeq",
      "(EC_SEND_SEQ IS NULL OR EC_SEND_SEQ < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullEcSendSeq",
      "(EC_SEND_SEQ IS NULL OR EC_SEND_SEQ > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INEcSendSeq", "EC_SEND_SEQ IN ( ? )" ) // IN

         .addFilterBy( "NOTINEcSendSeq", "EC_SEND_SEQ NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "EcSendSeqasc", "EC_SEND_SEQ ASC" ) // ORDER ASCENDING

         .addOrderBy( "EcSendSeqdesc", "EC_SEND_SEQ DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalEcSubscriberId", "EC_SUBSCRIBER_ID = ?" ) // EQUAL

         .addFilterBy( "notequalEcSubscriberId", "EC_SUBSCRIBER_ID != ?" ) // NOTEQUAL

         .addFilterBy( "nullEcSubscriberId", "EC_SUBSCRIBER_ID IS NULL" ) // IS NULL

         .addFilterBy( "notnullEcSubscriberId", "EC_SUBSCRIBER_ID IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanEcSubscriberId", "EC_SUBSCRIBER_ID < ?" ) // LESS THAN

         .addFilterBy( "greaterthanEcSubscriberId", "EC_SUBSCRIBER_ID > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalEcSubscriberId",
      "EC_SUBSCRIBER_ID <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalEcSubscriberId",
      "EC_SUBSCRIBER_ID >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "filterByEcSubscriberIdMatch",
      "EC_SUBSCRIBER_ID LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "betweenEcSubscriberId",
      "EC_SUBSCRIBER_ID BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullEcSubscriberId",
      "(EC_SUBSCRIBER_ID IS NULL OR EC_SUBSCRIBER_ID = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullEcSubscriberId",
      "(EC_SUBSCRIBER_ID IS NULL OR EC_SUBSCRIBER_ID < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullEcSubscriberId",
      "(EC_SUBSCRIBER_ID IS NULL OR EC_SUBSCRIBER_ID > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INEcSubscriberId", "EC_SUBSCRIBER_ID IN ( ? )" ) // IN

         .addFilterBy( "NOTINEcSubscriberId", "EC_SUBSCRIBER_ID NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "EcSubscriberIdasc", "EC_SUBSCRIBER_ID ASC" ) // ORDER ASCENDING

         .addOrderBy( "EcSubscriberIddesc", "EC_SUBSCRIBER_ID DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalEcMsisdn", "(EC_MSISDN) = ?" ) // EQUAL

         .addFilterBy( "notequalEcMsisdn", "(EC_MSISDN) != ?" ) // NOTEQUAL

         .addFilterBy( "nullEcMsisdn",
      "(EC_MSISDN IS NULL OR LENGTH((EC_MSISDN)) IS NULL OR LENGTH((EC_MSISDN)) = 0)" ) // IS NULL

         .addFilterBy( "notnullEcMsisdn", "EC_MSISDN IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanEcMsisdn", "EC_MSISDN < ?" ) // LESS THAN

         .addFilterBy( "greaterthanEcMsisdn", "EC_MSISDN > ?" ) // GREATER THAN

         .addFilterBy( "filterByEcMsisdnMatch", "EC_MSISDN LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullEcMsisdn",
      "((EC_MSISDN) = ? OR EC_MSISDN IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INEcMsisdn", "(EC_MSISDN) IN ( ? )" ) // IN

         .addFilterBy( "NOTINEcMsisdn",
      "(EC_MSISDN) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "EcMsisdnasc", "EC_MSISDN ASC" ) // ORDER ASCENDING

         .addOrderBy( "EcMsisdndesc", "EC_MSISDN DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalEcSim", "(EC_SIM) = ?" ) // EQUAL

         .addFilterBy( "notequalEcSim", "(EC_SIM) != ?" ) // NOTEQUAL

         .addFilterBy( "nullEcSim",
      "(EC_SIM IS NULL OR LENGTH((EC_SIM)) IS NULL OR LENGTH((EC_SIM)) = 0)" ) // IS NULL

         .addFilterBy( "notnullEcSim", "EC_SIM IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanEcSim", "EC_SIM < ?" ) // LESS THAN

         .addFilterBy( "greaterthanEcSim", "EC_SIM > ?" ) // GREATER THAN

         .addFilterBy( "filterByEcSimMatch", "EC_SIM LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullEcSim",
      "((EC_SIM) = ? OR EC_SIM IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INEcSim", "(EC_SIM) IN ( ? )" ) // IN

         .addFilterBy( "NOTINEcSim", "(EC_SIM) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "EcSimasc", "EC_SIM ASC" ) // ORDER ASCENDING

         .addOrderBy( "EcSimdesc", "EC_SIM DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalEcOperator", "(EC_OPERATOR) = ?" ) // EQUAL

         .addFilterBy( "notequalEcOperator", "(EC_OPERATOR) != ?" ) // NOTEQUAL

         .addFilterBy( "nullEcOperator",
      "(EC_OPERATOR IS NULL OR LENGTH((EC_OPERATOR)) IS NULL OR LENGTH((EC_OPERATOR)) = 0)" ) // IS NULL

         .addFilterBy( "notnullEcOperator", "EC_OPERATOR IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanEcOperator", "EC_OPERATOR < ?" ) // LESS THAN

         .addFilterBy( "greaterthanEcOperator", "EC_OPERATOR > ?" ) // GREATER THAN

         .addFilterBy( "filterByEcOperatorMatch", "EC_OPERATOR LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullEcOperator",
      "((EC_OPERATOR) = ? OR EC_OPERATOR IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INEcOperator", "(EC_OPERATOR) IN ( ? )" ) // IN

         .addFilterBy( "NOTINEcOperator", "(EC_OPERATOR) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "EcOperatorasc", "EC_OPERATOR ASC" ) // ORDER ASCENDING

         .addOrderBy( "EcOperatordesc", "EC_OPERATOR DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalEcTty", "(EC_TTY) = ?" ) // EQUAL

         .addFilterBy( "notequalEcTty", "(EC_TTY) != ?" ) // NOTEQUAL

         .addFilterBy( "nullEcTty",
      "(EC_TTY IS NULL OR LENGTH((EC_TTY)) IS NULL OR LENGTH((EC_TTY)) = 0)" ) // IS NULL

         .addFilterBy( "notnullEcTty", "EC_TTY IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanEcTty", "EC_TTY < ?" ) // LESS THAN

         .addFilterBy( "greaterthanEcTty", "EC_TTY > ?" ) // GREATER THAN

         .addFilterBy( "filterByEcTtyMatch", "EC_TTY LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullEcTty",
      "((EC_TTY) = ? OR EC_TTY IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INEcTty", "(EC_TTY) IN ( ? )" ) // IN

         .addFilterBy( "NOTINEcTty", "(EC_TTY) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "EcTtyasc", "EC_TTY ASC" ) // ORDER ASCENDING

         .addOrderBy( "EcTtydesc", "EC_TTY DESC" ) // ORDER DESCENDING
    ;

//    table.addFilterBy( "equalEcTechnologyInd", "(EC_TECHNOLOGY_IND) = ?" ) // EQUAL
//
//         .addFilterBy( "notequalEcTechnologyInd",
//      "(EC_TECHNOLOGY_IND) != ?" ) // NOTEQUAL
//
//         .addFilterBy( "nullEcTechnologyInd",
//      "(EC_TECHNOLOGY_IND IS NULL OR LENGTH((EC_TECHNOLOGY_IND)) IS NULL OR LENGTH((EC_TECHNOLOGY_IND)) = 0)" ) // IS NULL
//
//         .addFilterBy( "notnullEcTechnologyInd",
//      "EC_TECHNOLOGY_IND IS NOT NULL" ) // IS NOT NULL
//
//         .addFilterBy( "lessthanEcTechnologyInd", "EC_TECHNOLOGY_IND < ?" ) // LESS THAN
//
//         .addFilterBy( "greaterthanEcTechnologyInd", "EC_TECHNOLOGY_IND > ?" ) // GREATER THAN
//
//         .addFilterBy( "filterByEcTechnologyIndMatch",
//      "EC_TECHNOLOGY_IND LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY
//
//         .addFilterBy( "equalornullEcTechnologyInd",
//      "((EC_TECHNOLOGY_IND) = ? OR EC_TECHNOLOGY_IND IS NULL)" ) // EQUALORNULL
//
//         .addFilterBy( "INEcTechnologyInd", "(EC_TECHNOLOGY_IND) IN ( ? )" ) // IN
//
//         .addFilterBy( "NOTINEcTechnologyInd",
//      "(EC_TECHNOLOGY_IND) NOT IN ( ? )" ) // NOT IN
//
//         .addOrderBy( "EcTechnologyIndasc", "EC_TECHNOLOGY_IND ASC" ) // ORDER ASCENDING
//
//         .addOrderBy( "EcTechnologyInddesc", "EC_TECHNOLOGY_IND DESC" ) // ORDER DESCENDING
//    ;

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
      dml = new EcEventCommandAbstractDMLFactory(  );
    }
    return dml;
  }
}

