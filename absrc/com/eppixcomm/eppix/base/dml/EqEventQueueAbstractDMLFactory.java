package com.eppixcomm.eppix.base.dml;



/**
 * This is the DMLFactory for EqEventQueue.
 *
 * @version $Revision: 1.1 $
 * @author $Author$
 * @since $jdk$
 */
public class EqEventQueueAbstractDMLFactory
  extends BaseDMLFactory {
  //~ Static variables/initializers //////////////////////////////////////////

  /** The DMLFactory singleton */
  private static DMLFactory dml = null;

  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new EqEventQueueAbstractDMLFactory object.
   *
   * @throws DMLException DOCUMENT ME!
   */
  protected EqEventQueueAbstractDMLFactory(  )
    throws DMLException {
    ;

    DMLTable table = defTable( "EqEventQueue", // dmlName
        "blo.EqEventQueueDMO", // dmoName
        "EQ_EVENT_QUEUE", // tableName
        4, // numColumns
        "EQ_COMMAND, EQ_MESSAGE, EQ_NETWORK, EQ_PRIORITY", // columnList
        null, //primaryKey
        "" // versionCol     
      , false, // generatedKey
        "EQ_COMMAND, EQ_MESSAGE, EQ_NETWORK, EQ_PRIORITY",
        "", "",
        new String[] {
          "EQ_COMMAND", "EQ_MESSAGE", "EQ_NETWORK", "EQ_PRIORITY"
        }, false );

    ;

    table.addFilterBy( "equalEqCommand", "(EQ_COMMAND) = ?" ) // EQUAL

         .addFilterBy( "notequalEqCommand", "(EQ_COMMAND) != ?" ) // NOTEQUAL

         .addFilterBy( "nullEqCommand",
      "(EQ_COMMAND IS NULL OR LENGTH((EQ_COMMAND)) IS NULL OR LENGTH((EQ_COMMAND)) = 0)" ) // IS NULL

         .addFilterBy( "notnullEqCommand", "EQ_COMMAND IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanEqCommand", "EQ_COMMAND < ?" ) // LESS THAN

         .addFilterBy( "greaterthanEqCommand", "EQ_COMMAND > ?" ) // GREATER THAN

         .addFilterBy( "filterByEqCommandMatch", "EQ_COMMAND LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullEqCommand",
      "((EQ_COMMAND) = ? OR EQ_COMMAND IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INEqCommand", "(EQ_COMMAND) IN ( ? )" ) // IN

         .addFilterBy( "NOTINEqCommand", "(EQ_COMMAND) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "EqCommandasc", "EQ_COMMAND ASC" ) // ORDER ASCENDING

         .addOrderBy( "EqCommanddesc", "EQ_COMMAND DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalEqMessage", "(EQ_MESSAGE) = ?" ) // EQUAL

         .addFilterBy( "notequalEqMessage", "(EQ_MESSAGE) != ?" ) // NOTEQUAL

         .addFilterBy( "nullEqMessage",
      "(EQ_MESSAGE IS NULL OR LENGTH((EQ_MESSAGE)) IS NULL OR LENGTH((EQ_MESSAGE)) = 0)" ) // IS NULL

         .addFilterBy( "notnullEqMessage", "EQ_MESSAGE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanEqMessage", "EQ_MESSAGE < ?" ) // LESS THAN

         .addFilterBy( "greaterthanEqMessage", "EQ_MESSAGE > ?" ) // GREATER THAN

         .addFilterBy( "filterByEqMessageMatch", "EQ_MESSAGE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullEqMessage",
      "((EQ_MESSAGE) = ? OR EQ_MESSAGE IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INEqMessage", "(EQ_MESSAGE) IN ( ? )" ) // IN

         .addFilterBy( "NOTINEqMessage", "(EQ_MESSAGE) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "EqMessageasc", "EQ_MESSAGE ASC" ) // ORDER ASCENDING

         .addOrderBy( "EqMessagedesc", "EQ_MESSAGE DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalEqNetwork", "(EQ_NETWORK) = ?" ) // EQUAL

         .addFilterBy( "notequalEqNetwork", "(EQ_NETWORK) != ?" ) // NOTEQUAL

         .addFilterBy( "nullEqNetwork",
      "(EQ_NETWORK IS NULL OR LENGTH((EQ_NETWORK)) IS NULL OR LENGTH((EQ_NETWORK)) = 0)" ) // IS NULL

         .addFilterBy( "notnullEqNetwork", "EQ_NETWORK IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanEqNetwork", "EQ_NETWORK < ?" ) // LESS THAN

         .addFilterBy( "greaterthanEqNetwork", "EQ_NETWORK > ?" ) // GREATER THAN

         .addFilterBy( "filterByEqNetworkMatch", "EQ_NETWORK LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullEqNetwork",
      "((EQ_NETWORK) = ? OR EQ_NETWORK IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INEqNetwork", "(EQ_NETWORK) IN ( ? )" ) // IN

         .addFilterBy( "NOTINEqNetwork", "(EQ_NETWORK) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "EqNetworkasc", "EQ_NETWORK ASC" ) // ORDER ASCENDING

         .addOrderBy( "EqNetworkdesc", "EQ_NETWORK DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalEqPriority", "EQ_PRIORITY = ?" ) // EQUAL

         .addFilterBy( "notequalEqPriority", "EQ_PRIORITY != ?" ) // NOTEQUAL

         .addFilterBy( "nullEqPriority", "EQ_PRIORITY IS NULL" ) // IS NULL

         .addFilterBy( "notnullEqPriority", "EQ_PRIORITY IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanEqPriority", "EQ_PRIORITY < ?" ) // LESS THAN

         .addFilterBy( "greaterthanEqPriority", "EQ_PRIORITY > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalEqPriority", "EQ_PRIORITY <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalEqPriority", "EQ_PRIORITY >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "filterByEqPriorityMatch", "EQ_PRIORITY LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "betweenEqPriority", "EQ_PRIORITY BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullEqPriority",
      "(EQ_PRIORITY IS NULL OR EQ_PRIORITY = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullEqPriority",
      "(EQ_PRIORITY IS NULL OR EQ_PRIORITY < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullEqPriority",
      "(EQ_PRIORITY IS NULL OR EQ_PRIORITY > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INEqPriority", "EQ_PRIORITY IN ( ? )" ) // IN

         .addFilterBy( "NOTINEqPriority", "EQ_PRIORITY NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "EqPriorityasc", "EQ_PRIORITY ASC" ) // ORDER ASCENDING

         .addOrderBy( "EqPrioritydesc", "EQ_PRIORITY DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalEqTechnologyInd", "(EQ_TECHNOLOGY_IND) = ?" ) // EQUAL

         .addFilterBy( "notequalEqTechnologyInd",
      "(EQ_TECHNOLOGY_IND) != ?" ) // NOTEQUAL

//         .addFilterBy( "nullEqTechnologyInd",
//      "(EQ_TECHNOLOGY_IND IS NULL OR LENGTH((EQ_TECHNOLOGY_IND)) IS NULL OR LENGTH((EQ_TECHNOLOGY_IND)) = 0)" ) // IS NULL

//         .addFilterBy( "notnullEqTechnologyInd",
//      "EQ_TECHNOLOGY_IND IS NOT NULL" ) // IS NOT NULL

//         .addFilterBy( "lessthanEqTechnologyInd", "EQ_TECHNOLOGY_IND < ?" ) // LESS THAN

//         .addFilterBy( "greaterthanEqTechnologyInd", "EQ_TECHNOLOGY_IND > ?" ) // GREATER THAN

//         .addFilterBy( "filterByEqTechnologyIndMatch",
//      "EQ_TECHNOLOGY_IND LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

//         .addFilterBy( "equalornullEqTechnologyInd",
//      "((EQ_TECHNOLOGY_IND) = ? OR EQ_TECHNOLOGY_IND IS NULL)" ) // EQUALORNULL

//         .addFilterBy( "INEqTechnologyInd", "(EQ_TECHNOLOGY_IND) IN ( ? )" ) // IN

//         .addFilterBy( "NOTINEqTechnologyInd",
//      "(EQ_TECHNOLOGY_IND) NOT IN ( ? )" ) // NOT IN

//         .addOrderBy( "EqTechnologyIndasc", "EQ_TECHNOLOGY_IND ASC" ) // ORDER ASCENDING

//         .addOrderBy( "EqTechnologyInddesc", "EQ_TECHNOLOGY_IND DESC" ) // ORDER DESCENDING
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
      dml = new EqEventQueueAbstractDMLFactory(  );
    }

    return dml;
  }
}

