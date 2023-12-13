package com.eppixcomm.eppix.base.dml;


/**
 * This is the DMLFactory for EcdEventCmdDet.
 *
 * @version $Revision: 1.1 $
 * @author $Author$
 * @since $jdk$
 */
public class EcdEventCmdDetAbstractDMLFactory
  extends BaseDMLFactory {
  //~ Static variables/initializers //////////////////////////////////////////

  /** The DMLFactory singleton */
  private static DMLFactory dml = null;

  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new EcdEventCmdDetAbstractDMLFactory object.
   *
   * @throws DMLException DOCUMENT ME!
   */
  protected EcdEventCmdDetAbstractDMLFactory(  )
    throws DMLException {
    ;

    DMLTable table = defTable( "EcdEventCmdDet", // dmlName
        "blo.EcdEventCmdDetDMO", // dmoName
        "ECD_EVENT_CMD_DET", // tableName
        6, // numColumns
        "ECD_COMMAND, ECD_SEQNO, ECD_DET_TYPE, ECD_TEXT, ECD_FLAG, ECD_TIMESTAMP", // columnList
        "(ECD_COMMAND)" + ", ECD_SEQNO", //primaryKey
        "" // versionCol     
      , false, // generatedKey
        "ECD_COMMAND, ECD_SEQNO, ECD_DET_TYPE, ECD_TEXT, ECD_FLAG, ECD_TIMESTAMP", "", "",
        new String[] {
          "ECD_COMMAND", "ECD_SEQNO", "ECD_DET_TYPE", "ECD_TEXT", "ECD_FLAG", "ECD_TIMESTAMP"
        } );

    table.addFilterBy( "equalEcdCommand", /* PK attribute */
      "(ECD_COMMAND) = ?" )
         .addFilterBy( "filterByEcdCommandMatch", "ECD_COMMAND LIKE ?" )
         .addFilterBy( "INEcdCommand", "(ECD_COMMAND) IN ( ? )" ) // IN

         .addFilterBy( "NOTINEcdCommand", "(ECD_COMMAND) NOT IN ( ? )" ) // NOT IN

         .addFilterBy( "notequalEcdCommand", "(ECD_COMMAND) != ?" ) // NOTEQUAL

         .addFilterBy( "nullEcdCommand",
      "(ECD_COMMAND IS NULL OR LENGTH((ECD_COMMAND)) IS NULL OR LENGTH((ECD_COMMAND)) = 0)" ) // IS NULL

         .addFilterBy( "notnullEcdCommand", "ECD_COMMAND IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanEcdCommand", "ECD_COMMAND < ?" ) // LESS THAN

         .addFilterBy( "greaterthanEcdCommand", "ECD_COMMAND > ?" ) // GREATER THAN

         .addFilterBy( "filterByEcdCommandMatch", "ECD_COMMAND LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullEcdCommand",
      "((ECD_COMMAND) = ? OR ECD_COMMAND IS NULL)" ) // EQUALORNULL
                                                         // TODO : we may need to wrap this with a () 

         .addOrderBy( "EcdCommandasc", "ECD_COMMAND ASC" ) // ORDER ASCENDING

         .addOrderBy( "EcdCommanddesc", "ECD_COMMAND DESC" ) // ORDER DESCENDING

         .addFilterBy( "equalEcdSeqno", /* PK attribute */
      "ECD_SEQNO = ?" )
         .addFilterBy( "filterByEcdSeqnoMatch", "ECD_SEQNO LIKE ?" )
         .addFilterBy( "INEcdSeqno", "ECD_SEQNO IN ( ? )" ) // IN

         .addFilterBy( "NOTINEcdSeqno", "ECD_SEQNO NOT IN ( ? )" ) // NOT IN

         .addFilterBy( "notequalEcdSeqno", "ECD_SEQNO != ?" ) // NOTEQUAL

         .addFilterBy( "nullEcdSeqno", "ECD_SEQNO IS NULL" ) // IS NULL

         .addFilterBy( "notnullEcdSeqno", "ECD_SEQNO IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanEcdSeqno", "ECD_SEQNO < ?" ) // LESS THAN

         .addFilterBy( "greaterthanEcdSeqno", "ECD_SEQNO > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalEcdSeqno", "ECD_SEQNO <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalEcdSeqno", "ECD_SEQNO >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "filterByEcdSeqnoMatch", "ECD_SEQNO LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "betweenEcdSeqno", "ECD_SEQNO BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullEcdSeqno",
      "(ECD_SEQNO IS NULL OR ECD_SEQNO = ?)" ) // EQUALORNULL
                                               // TODO : we may need to wrap this with a () 

         .addFilterBy( "lessthanornullEcdSeqno",
      "(ECD_SEQNO IS NULL OR ECD_SEQNO < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullEcdSeqno",
      "(ECD_SEQNO IS NULL OR ECD_SEQNO > ?)" ) // GREATERTHANORNULL

         .addOrderBy( "EcdSeqnoasc", "ECD_SEQNO ASC" ) // ORDER ASCENDING

         .addOrderBy( "EcdSeqnodesc", "ECD_SEQNO DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalEcdDetType", "(ECD_DET_TYPE) = ?" ) // EQUAL

         .addFilterBy( "notequalEcdDetType", "(ECD_DET_TYPE) != ?" ) // NOTEQUAL

         .addFilterBy( "nullEcdDetType",
      "(ECD_DET_TYPE IS NULL OR LENGTH((ECD_DET_TYPE)) IS NULL OR LENGTH((ECD_DET_TYPE)) = 0)" ) // IS NULL

         .addFilterBy( "notnullEcdDetType", "ECD_DET_TYPE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanEcdDetType", "ECD_DET_TYPE < ?" ) // LESS THAN

         .addFilterBy( "greaterthanEcdDetType", "ECD_DET_TYPE > ?" ) // GREATER THAN

         .addFilterBy( "filterByEcdDetTypeMatch", "ECD_DET_TYPE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullEcdDetType",
      "((ECD_DET_TYPE) = ? OR ECD_DET_TYPE IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INEcdDetType", "(ECD_DET_TYPE) IN ( ? )" ) // IN

         .addFilterBy( "NOTINEcdDetType", "(ECD_DET_TYPE) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "EcdDetTypeasc", "ECD_DET_TYPE ASC" ) // ORDER ASCENDING

         .addOrderBy( "EcdDetTypedesc", "ECD_DET_TYPE DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalEcdText", "ECD_TEXT = ?" ) // EQUAL

         .addFilterBy( "notequalEcdText", "ECD_TEXT != ?" ) // NOTEQUAL

         .addFilterBy( "nullEcdText",
      "(ECD_TEXT IS NULL OR LENGTH((ECD_TEXT)) IS NULL OR LENGTH((ECD_TEXT)) = 0)" ) // IS NULL

         .addFilterBy( "notnullEcdText", "ECD_TEXT IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanEcdText", "ECD_TEXT < ?" ) // LESS THAN

         .addFilterBy( "greaterthanEcdText", "ECD_TEXT > ?" ) // GREATER THAN

         .addFilterBy( "filterByEcdTextMatch", "ECD_TEXT LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullEcdText",
      "(ECD_TEXT = ? OR ECD_TEXT IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INEcdText", "(ECD_TEXT) IN ( ? )" ) // IN

         .addFilterBy( "NOTINEcdText", "(ECD_TEXT) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "EcdTextasc", "ECD_TEXT ASC" ) // ORDER ASCENDING

         .addOrderBy( "EcdTextdesc", "ECD_TEXT DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalEcdFlag", "(ECD_FLAG) = ?" ) // EQUAL

         .addFilterBy( "notequalEcdFlag", "(ECD_FLAG) != ?" ) // NOTEQUAL

         .addFilterBy( "nullEcdFlag",
      "(ECD_FLAG IS NULL OR LENGTH((ECD_FLAG)) IS NULL OR LENGTH((ECD_FLAG)) = 0)" ) // IS NULL

         .addFilterBy( "notnullEcdFlag", "ECD_FLAG IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanEcdFlag", "ECD_FLAG < ?" ) // LESS THAN

         .addFilterBy( "greaterthanEcdFlag", "ECD_FLAG > ?" ) // GREATER THAN

         .addFilterBy( "filterByEcdFlagMatch", "ECD_FLAG LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullEcdFlag",
      "((ECD_FLAG) = ? OR ECD_FLAG IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INEcdFlag", "(ECD_FLAG) IN ( ? )" ) // IN

         .addFilterBy( "NOTINEcdFlag", "(ECD_FLAG) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "EcdFlagasc", "ECD_FLAG ASC" ) // ORDER ASCENDING

         .addOrderBy( "EcdFlagdesc", "ECD_FLAG DESC" ) // ORDER DESCENDING
    ;

    // SJ Addition
    table.addFilterBy( "equalEcdTimestamp", "(ECD_TIMESTAMP) = ?" ) // EQUAL

    .addFilterBy( "notequalEcdTimestamp", "(ECD_TIMESTAMP) != ?" ) // NOTEQUAL

    .addFilterBy( "nullEcdTimestamp",
 "(ECD_TIMESTAMP IS NULL OR LENGTH((ECD_TIMESTAMP)) IS NULL OR LENGTH((ECD_TIMESTAMP)) = 0)" ) // IS NULL

    .addFilterBy( "notnullEcdTimestamp", "ECD_TIMESTAMP IS NOT NULL" ) // IS NOT NULL

    .addFilterBy( "lessthanEcdTimestamp", "ECD_TIMESTAMP < ?" ) // LESS THAN

    .addFilterBy( "greaterthanEcdTimestamp", "ECD_TIMESTAMP > ?" ) // GREATER THAN

    .addFilterBy( "filterByEcdTimestampMatch", "ECD_TIMESTAMP LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

    .addFilterBy( "equalornullEcdTimestamp",
 "((ECD_FLAG) = ? OR ECD_TIMESTAMP IS NULL)" ) // EQUALORNULL

    .addFilterBy( "INEcdTimestamp", "(ECD_TIMESTAMP) IN ( ? )" ) // IN

    .addFilterBy( "NOTINEcdTimestamp", "(ECD_TIMESTAMP) NOT IN ( ? )" ) // NOT IN

    .addOrderBy( "EcdTimestampasc", "ECD_TIMESTAMP ASC" ) // ORDER ASCENDING

    .addOrderBy( "EcdTimestampdesc", "ECD_TIMESTAMP DESC" ) // ORDER DESCENDING
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
      dml = new EcdEventCmdDetAbstractDMLFactory(  );
    }

    return dml;
  }
}
