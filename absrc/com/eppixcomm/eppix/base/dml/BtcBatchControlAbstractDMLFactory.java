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
 * This is the DMLFactory for BtcBatchControl.
 *
 * @version $Revision: 1.1 $
 * @author $Author$
 * @since $jdk$
 */
public class BtcBatchControlAbstractDMLFactory
  extends BaseDMLFactory {
  //~ Static variables/initializers //////////////////////////////////////////

  /** The DMLFactory singleton */
  private static DMLFactory dml = null;

  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new BtcBatchControlAbstractDMLFactory object.
   *
   * @throws DMLException DOCUMENT ME!
   */
  protected BtcBatchControlAbstractDMLFactory(  )
    throws DMLException {
    ;

    DMLTable table = defTable( "BtcBatchControl", // dmlName
        "blo.BtcBatchControlDMO", // dmoName
        "BTC_BATCH_CONTROL", // tableName
        25, // numColumns
        "BTC_BATCH_TYPE, BTC_BATCH_ID, BTC_DESCRIPTION, BTC_BATCH_RUN_NUM, BTC_START_TIME, BTC_BATCH_PROGRAM, BTC_PARAMETER_1, BTC_PARAMETER_2, BTC_PARAMETER_3"
        + ", BTC_PARAMETER_4, BTC_PARAMETER_5, BTC_PARAMETER_6, BTC_PARAMETER_7, BTC_PARAMETER_8, BTC_PARAMETER_9, BTC_PARAMETER_10, BTC_PARAMETER_11, BTC_PARAMETER_12"
        + ", BTC_PARAMETER_13, BTC_PARAMETER_14, BTC_PARAMETER_15, BTC_PROCESS_ID, BTC_LOCATION_ID, BTC_BATCH_RUN_STAT, BTC_BATCH_RUN_TYPE", // columnList
        "BTC_BATCH_TYPE" + ", BTC_BATCH_ID", //primaryKey
        "" // versionCol     
      , false, // generatedKey
        "BTC_BATCH_TYPE, BTC_BATCH_ID, BTC_DESCRIPTION, BTC_BATCH_RUN_NUM, BTC_START_TIME, BTC_BATCH_PROGRAM, BTC_PARAMETER_1, BTC_PARAMETER_2, BTC_PARAMETER_3"
        + ", BTC_PARAMETER_4, BTC_PARAMETER_5, BTC_PARAMETER_6, BTC_PARAMETER_7, BTC_PARAMETER_8, BTC_PARAMETER_9, BTC_PARAMETER_10, BTC_PARAMETER_11, BTC_PARAMETER_12"
        + ", BTC_PARAMETER_13, BTC_PARAMETER_14, BTC_PARAMETER_15, BTC_PROCESS_ID, BTC_LOCATION_ID, BTC_BATCH_RUN_STAT, BTC_BATCH_RUN_TYPE",
        "", "",
        new String[] {
          "BTC_BATCH_TYPE", "BTC_BATCH_ID", "BTC_DESCRIPTION",
          "BTC_BATCH_RUN_NUM", "BTC_START_TIME", "BTC_BATCH_PROGRAM",
          "BTC_PARAMETER_1", "BTC_PARAMETER_2", "BTC_PARAMETER_3",
          "BTC_PARAMETER_4", "BTC_PARAMETER_5", "BTC_PARAMETER_6",
          "BTC_PARAMETER_7", "BTC_PARAMETER_8", "BTC_PARAMETER_9",
          "BTC_PARAMETER_10", "BTC_PARAMETER_11", "BTC_PARAMETER_12",
          "BTC_PARAMETER_13", "BTC_PARAMETER_14", "BTC_PARAMETER_15",
          "BTC_PROCESS_ID", "BTC_LOCATION_ID", "BTC_BATCH_RUN_STAT",
          "BTC_BATCH_RUN_TYPE"
        } );

    table.addFilterBy( "equalBtcBatchType", /* PK attribute */
      "BTC_BATCH_TYPE = ?" )
         .addFilterBy( "filterByBtcBatchTypeMatch", "BTC_BATCH_TYPE LIKE ?" )
         .addFilterBy( "INBtcBatchType", "BTC_BATCH_TYPE IN ( ? )" ) // IN

         .addFilterBy( "NOTINBtcBatchType", "BTC_BATCH_TYPE NOT IN ( ? )" ) // NOT IN

         .addFilterBy( "notequalBtcBatchType", "BTC_BATCH_TYPE != ?" ) // NOTEQUAL

         .addFilterBy( "nullBtcBatchType",
      "(BTC_BATCH_TYPE IS NULL OR LENGTH(BTC_BATCH_TYPE) IS NULL OR LENGTH(BTC_BATCH_TYPE) = 0)" ) // IS NULL

         .addFilterBy( "notnullBtcBatchType", "BTC_BATCH_TYPE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanBtcBatchType", "BTC_BATCH_TYPE < ?" ) // LESS THAN

         .addFilterBy( "greaterthanBtcBatchType", "BTC_BATCH_TYPE > ?" ) // GREATER THAN

         .addFilterBy( "filterByBtcBatchTypeMatch", "BTC_BATCH_TYPE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullBtcBatchType",
      "(BTC_BATCH_TYPE = ? OR BTC_BATCH_TYPE IS NULL)" ) // EQUALORNULL
                                                         // TODO : we may need to wrap this with a TRIM() 

         .addOrderBy( "BtcBatchTypeasc", "BTC_BATCH_TYPE ASC" ) // ORDER ASCENDING

         .addOrderBy( "BtcBatchTypedesc", "BTC_BATCH_TYPE DESC" ) // ORDER DESCENDING

         .addFilterBy( "equalBtcBatchId", /* PK attribute */
      "BTC_BATCH_ID = ?" )
         .addFilterBy( "filterByBtcBatchIdMatch", "BTC_BATCH_ID LIKE ?" )
         .addFilterBy( "INBtcBatchId", "BTC_BATCH_ID IN ( ? )" ) // IN

         .addFilterBy( "NOTINBtcBatchId", "BTC_BATCH_ID NOT IN ( ? )" ) // NOT IN

         .addFilterBy( "notequalBtcBatchId", "BTC_BATCH_ID != ?" ) // NOTEQUAL

         .addFilterBy( "nullBtcBatchId",
      "(BTC_BATCH_ID IS NULL OR LENGTH(BTC_BATCH_ID) IS NULL OR LENGTH(BTC_BATCH_ID) = 0)" ) // IS NULL

         .addFilterBy( "notnullBtcBatchId", "BTC_BATCH_ID IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanBtcBatchId", "BTC_BATCH_ID < ?" ) // LESS THAN

         .addFilterBy( "greaterthanBtcBatchId", "BTC_BATCH_ID > ?" ) // GREATER THAN

         .addFilterBy( "filterByBtcBatchIdMatch", "BTC_BATCH_ID LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullBtcBatchId",
      "(BTC_BATCH_ID = ? OR BTC_BATCH_ID IS NULL)" ) // EQUALORNULL
                                                     // TODO : we may need to wrap this with a TRIM() 

         .addOrderBy( "BtcBatchIdasc", "BTC_BATCH_ID ASC" ) // ORDER ASCENDING

         .addOrderBy( "BtcBatchIddesc", "BTC_BATCH_ID DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalBtcDescription", "BTC_DESCRIPTION = ?" ) // EQUAL

         .addFilterBy( "notequalBtcDescription", "BTC_DESCRIPTION != ?" ) // NOTEQUAL

         .addFilterBy( "nullBtcDescription",
      "(BTC_DESCRIPTION IS NULL OR LENGTH(BTC_DESCRIPTION) IS NULL OR LENGTH(BTC_DESCRIPTION) = 0)" ) // IS NULL

         .addFilterBy( "notnullBtcDescription", "BTC_DESCRIPTION IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanBtcDescription", "BTC_DESCRIPTION < ?" ) // LESS THAN

         .addFilterBy( "greaterthanBtcDescription", "BTC_DESCRIPTION > ?" ) // GREATER THAN

         .addFilterBy( "filterByBtcDescriptionMatch", "BTC_DESCRIPTION LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullBtcDescription",
      "(BTC_DESCRIPTION = ? OR BTC_DESCRIPTION IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INBtcDescription", "BTC_DESCRIPTION IN ( ? )" ) // IN

         .addFilterBy( "NOTINBtcDescription", "BTC_DESCRIPTION NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "BtcDescriptionasc", "BTC_DESCRIPTION ASC" ) // ORDER ASCENDING

         .addOrderBy( "BtcDescriptiondesc", "BTC_DESCRIPTION DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalBtcBatchRunNum", "BTC_BATCH_RUN_NUM = ?" ) // EQUAL

         .addFilterBy( "notequalBtcBatchRunNum", "BTC_BATCH_RUN_NUM != ?" ) // NOTEQUAL

         .addFilterBy( "nullBtcBatchRunNum", "BTC_BATCH_RUN_NUM IS NULL" ) // IS NULL

         .addFilterBy( "notnullBtcBatchRunNum",
      "BTC_BATCH_RUN_NUM IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanBtcBatchRunNum", "BTC_BATCH_RUN_NUM < ?" ) // LESS THAN

         .addFilterBy( "greaterthanBtcBatchRunNum", "BTC_BATCH_RUN_NUM > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalBtcBatchRunNum",
      "BTC_BATCH_RUN_NUM <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalBtcBatchRunNum",
      "BTC_BATCH_RUN_NUM >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "filterByBtcBatchRunNumMatch",
      "BTC_BATCH_RUN_NUM LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "betweenBtcBatchRunNum",
      "BTC_BATCH_RUN_NUM BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullBtcBatchRunNum",
      "(BTC_BATCH_RUN_NUM IS NULL OR BTC_BATCH_RUN_NUM = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullBtcBatchRunNum",
      "(BTC_BATCH_RUN_NUM IS NULL OR BTC_BATCH_RUN_NUM < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullBtcBatchRunNum",
      "(BTC_BATCH_RUN_NUM IS NULL OR BTC_BATCH_RUN_NUM > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INBtcBatchRunNum", "BTC_BATCH_RUN_NUM IN ( ? )" ) // IN

         .addFilterBy( "NOTINBtcBatchRunNum", "BTC_BATCH_RUN_NUM NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "BtcBatchRunNumasc", "BTC_BATCH_RUN_NUM ASC" ) // ORDER ASCENDING

         .addOrderBy( "BtcBatchRunNumdesc", "BTC_BATCH_RUN_NUM DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalBtcStartTime", "BTC_START_TIME = ?" ) // EQUAL

         .addFilterBy( "notequalBtcStartTime", "BTC_START_TIME != ?" ) // NOTEQUAL

         .addFilterBy( "nullBtcStartTime", "BTC_START_TIME IS NULL" ) // IS NULL

         .addFilterBy( "notnullBtcStartTime", "BTC_START_TIME IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanBtcStartTime", "BTC_START_TIME < ?" ) // LESS THAN

         .addFilterBy( "greaterthanBtcStartTime", "BTC_START_TIME > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalBtcStartTime", "BTC_START_TIME <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalBtcStartTime", "BTC_START_TIME >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "filterByBtcStartTimeMatch", "BTC_START_TIME LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "betweenBtcStartTime", "BTC_START_TIME BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullBtcStartTime",
      "(BTC_START_TIME IS NULL OR BTC_START_TIME = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullBtcStartTime",
      "(BTC_START_TIME IS NULL OR BTC_START_TIME < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullBtcStartTime",
      "(BTC_START_TIME IS NULL OR BTC_START_TIME > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INBtcStartTime", "BTC_START_TIME IN ( ? )" ) // IN

         .addFilterBy( "NOTINBtcStartTime", "BTC_START_TIME NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "BtcStartTimeasc", "BTC_START_TIME ASC" ) // ORDER ASCENDING

         .addOrderBy( "BtcStartTimedesc", "BTC_START_TIME DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalBtcBatchProgram", "BTC_BATCH_PROGRAM = ?" ) // EQUAL

         .addFilterBy( "notequalBtcBatchProgram", "BTC_BATCH_PROGRAM != ?" ) // NOTEQUAL

         .addFilterBy( "nullBtcBatchProgram",
      "(BTC_BATCH_PROGRAM IS NULL OR LENGTH(BTC_BATCH_PROGRAM) IS NULL OR LENGTH(BTC_BATCH_PROGRAM) = 0)" ) // IS NULL

         .addFilterBy( "notnullBtcBatchProgram",
      "BTC_BATCH_PROGRAM IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanBtcBatchProgram", "BTC_BATCH_PROGRAM < ?" ) // LESS THAN

         .addFilterBy( "greaterthanBtcBatchProgram", "BTC_BATCH_PROGRAM > ?" ) // GREATER THAN

         .addFilterBy( "filterByBtcBatchProgramMatch",
      "BTC_BATCH_PROGRAM LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullBtcBatchProgram",
      "(BTC_BATCH_PROGRAM = ? OR BTC_BATCH_PROGRAM IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INBtcBatchProgram", "BTC_BATCH_PROGRAM IN ( ? )" ) // IN

         .addFilterBy( "NOTINBtcBatchProgram",
      "BTC_BATCH_PROGRAM NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "BtcBatchProgramasc", "BTC_BATCH_PROGRAM ASC" ) // ORDER ASCENDING

         .addOrderBy( "BtcBatchProgramdesc", "BTC_BATCH_PROGRAM DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalBtcParameter1", "BTC_PARAMETER_1 = ?" ) // EQUAL

         .addFilterBy( "notequalBtcParameter1", "BTC_PARAMETER_1 != ?" ) // NOTEQUAL

         .addFilterBy( "nullBtcParameter1",
      "(BTC_PARAMETER_1 IS NULL OR LENGTH(BTC_PARAMETER_1) IS NULL OR LENGTH(BTC_PARAMETER_1) = 0)" ) // IS NULL

         .addFilterBy( "notnullBtcParameter1", "BTC_PARAMETER_1 IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanBtcParameter1", "BTC_PARAMETER_1 < ?" ) // LESS THAN

         .addFilterBy( "greaterthanBtcParameter1", "BTC_PARAMETER_1 > ?" ) // GREATER THAN

         .addFilterBy( "filterByBtcParameter1Match", "BTC_PARAMETER_1 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullBtcParameter1",
      "(BTC_PARAMETER_1 = ? OR BTC_PARAMETER_1 IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INBtcParameter1", "BTC_PARAMETER_1 IN ( ? )" ) // IN

         .addFilterBy( "NOTINBtcParameter1", "BTC_PARAMETER_1 NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "BtcParameter1asc", "BTC_PARAMETER_1 ASC" ) // ORDER ASCENDING

         .addOrderBy( "BtcParameter1desc", "BTC_PARAMETER_1 DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalBtcParameter2", "BTC_PARAMETER_2 = ?" ) // EQUAL

         .addFilterBy( "notequalBtcParameter2", "BTC_PARAMETER_2 != ?" ) // NOTEQUAL

         .addFilterBy( "nullBtcParameter2",
      "(BTC_PARAMETER_2 IS NULL OR LENGTH(BTC_PARAMETER_2) IS NULL OR LENGTH(BTC_PARAMETER_2) = 0)" ) // IS NULL

         .addFilterBy( "notnullBtcParameter2", "BTC_PARAMETER_2 IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanBtcParameter2", "BTC_PARAMETER_2 < ?" ) // LESS THAN

         .addFilterBy( "greaterthanBtcParameter2", "BTC_PARAMETER_2 > ?" ) // GREATER THAN

         .addFilterBy( "filterByBtcParameter2Match", "BTC_PARAMETER_2 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullBtcParameter2",
      "(BTC_PARAMETER_2 = ? OR BTC_PARAMETER_2 IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INBtcParameter2", "BTC_PARAMETER_2 IN ( ? )" ) // IN

         .addFilterBy( "NOTINBtcParameter2", "BTC_PARAMETER_2 NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "BtcParameter2asc", "BTC_PARAMETER_2 ASC" ) // ORDER ASCENDING

         .addOrderBy( "BtcParameter2desc", "BTC_PARAMETER_2 DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalBtcParameter3", "BTC_PARAMETER_3 = ?" ) // EQUAL

         .addFilterBy( "notequalBtcParameter3", "BTC_PARAMETER_3 != ?" ) // NOTEQUAL

         .addFilterBy( "nullBtcParameter3",
      "(BTC_PARAMETER_3 IS NULL OR LENGTH(BTC_PARAMETER_3) IS NULL OR LENGTH(BTC_PARAMETER_3) = 0)" ) // IS NULL

         .addFilterBy( "notnullBtcParameter3", "BTC_PARAMETER_3 IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanBtcParameter3", "BTC_PARAMETER_3 < ?" ) // LESS THAN

         .addFilterBy( "greaterthanBtcParameter3", "BTC_PARAMETER_3 > ?" ) // GREATER THAN

         .addFilterBy( "filterByBtcParameter3Match", "BTC_PARAMETER_3 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullBtcParameter3",
      "(BTC_PARAMETER_3 = ? OR BTC_PARAMETER_3 IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INBtcParameter3", "BTC_PARAMETER_3 IN ( ? )" ) // IN

         .addFilterBy( "NOTINBtcParameter3", "BTC_PARAMETER_3 NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "BtcParameter3asc", "BTC_PARAMETER_3 ASC" ) // ORDER ASCENDING

         .addOrderBy( "BtcParameter3desc", "BTC_PARAMETER_3 DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalBtcParameter4", "BTC_PARAMETER_4 = ?" ) // EQUAL

         .addFilterBy( "notequalBtcParameter4", "BTC_PARAMETER_4 != ?" ) // NOTEQUAL

         .addFilterBy( "nullBtcParameter4",
      "(BTC_PARAMETER_4 IS NULL OR LENGTH(BTC_PARAMETER_4) IS NULL OR LENGTH(BTC_PARAMETER_4) = 0)" ) // IS NULL

         .addFilterBy( "notnullBtcParameter4", "BTC_PARAMETER_4 IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanBtcParameter4", "BTC_PARAMETER_4 < ?" ) // LESS THAN

         .addFilterBy( "greaterthanBtcParameter4", "BTC_PARAMETER_4 > ?" ) // GREATER THAN

         .addFilterBy( "filterByBtcParameter4Match", "BTC_PARAMETER_4 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullBtcParameter4",
      "(BTC_PARAMETER_4 = ? OR BTC_PARAMETER_4 IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INBtcParameter4", "BTC_PARAMETER_4 IN ( ? )" ) // IN

         .addFilterBy( "NOTINBtcParameter4", "BTC_PARAMETER_4 NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "BtcParameter4asc", "BTC_PARAMETER_4 ASC" ) // ORDER ASCENDING

         .addOrderBy( "BtcParameter4desc", "BTC_PARAMETER_4 DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalBtcParameter5", "BTC_PARAMETER_5 = ?" ) // EQUAL

         .addFilterBy( "notequalBtcParameter5", "BTC_PARAMETER_5 != ?" ) // NOTEQUAL

         .addFilterBy( "nullBtcParameter5",
      "(BTC_PARAMETER_5 IS NULL OR LENGTH(BTC_PARAMETER_5) IS NULL OR LENGTH(BTC_PARAMETER_5) = 0)" ) // IS NULL

         .addFilterBy( "notnullBtcParameter5", "BTC_PARAMETER_5 IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanBtcParameter5", "BTC_PARAMETER_5 < ?" ) // LESS THAN

         .addFilterBy( "greaterthanBtcParameter5", "BTC_PARAMETER_5 > ?" ) // GREATER THAN

         .addFilterBy( "filterByBtcParameter5Match", "BTC_PARAMETER_5 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullBtcParameter5",
      "(BTC_PARAMETER_5 = ? OR BTC_PARAMETER_5 IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INBtcParameter5", "BTC_PARAMETER_5 IN ( ? )" ) // IN

         .addFilterBy( "NOTINBtcParameter5", "BTC_PARAMETER_5 NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "BtcParameter5asc", "BTC_PARAMETER_5 ASC" ) // ORDER ASCENDING

         .addOrderBy( "BtcParameter5desc", "BTC_PARAMETER_5 DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalBtcParameter6", "BTC_PARAMETER_6 = ?" ) // EQUAL

         .addFilterBy( "notequalBtcParameter6", "BTC_PARAMETER_6 != ?" ) // NOTEQUAL

         .addFilterBy( "nullBtcParameter6",
      "(BTC_PARAMETER_6 IS NULL OR LENGTH(BTC_PARAMETER_6) IS NULL OR LENGTH(BTC_PARAMETER_6) = 0)" ) // IS NULL

         .addFilterBy( "notnullBtcParameter6", "BTC_PARAMETER_6 IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanBtcParameter6", "BTC_PARAMETER_6 < ?" ) // LESS THAN

         .addFilterBy( "greaterthanBtcParameter6", "BTC_PARAMETER_6 > ?" ) // GREATER THAN

         .addFilterBy( "filterByBtcParameter6Match", "BTC_PARAMETER_6 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullBtcParameter6",
      "(BTC_PARAMETER_6 = ? OR BTC_PARAMETER_6 IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INBtcParameter6", "BTC_PARAMETER_6 IN ( ? )" ) // IN

         .addFilterBy( "NOTINBtcParameter6", "BTC_PARAMETER_6 NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "BtcParameter6asc", "BTC_PARAMETER_6 ASC" ) // ORDER ASCENDING

         .addOrderBy( "BtcParameter6desc", "BTC_PARAMETER_6 DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalBtcParameter7", "BTC_PARAMETER_7 = ?" ) // EQUAL

         .addFilterBy( "notequalBtcParameter7", "BTC_PARAMETER_7 != ?" ) // NOTEQUAL

         .addFilterBy( "nullBtcParameter7",
      "(BTC_PARAMETER_7 IS NULL OR LENGTH(BTC_PARAMETER_7) IS NULL OR LENGTH(BTC_PARAMETER_7) = 0)" ) // IS NULL

         .addFilterBy( "notnullBtcParameter7", "BTC_PARAMETER_7 IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanBtcParameter7", "BTC_PARAMETER_7 < ?" ) // LESS THAN

         .addFilterBy( "greaterthanBtcParameter7", "BTC_PARAMETER_7 > ?" ) // GREATER THAN

         .addFilterBy( "filterByBtcParameter7Match", "BTC_PARAMETER_7 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullBtcParameter7",
      "(BTC_PARAMETER_7 = ? OR BTC_PARAMETER_7 IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INBtcParameter7", "BTC_PARAMETER_7 IN ( ? )" ) // IN

         .addFilterBy( "NOTINBtcParameter7", "BTC_PARAMETER_7 NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "BtcParameter7asc", "BTC_PARAMETER_7 ASC" ) // ORDER ASCENDING

         .addOrderBy( "BtcParameter7desc", "BTC_PARAMETER_7 DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalBtcParameter8", "BTC_PARAMETER_8 = ?" ) // EQUAL

         .addFilterBy( "notequalBtcParameter8", "BTC_PARAMETER_8 != ?" ) // NOTEQUAL

         .addFilterBy( "nullBtcParameter8",
      "(BTC_PARAMETER_8 IS NULL OR LENGTH(BTC_PARAMETER_8) IS NULL OR LENGTH(BTC_PARAMETER_8) = 0)" ) // IS NULL

         .addFilterBy( "notnullBtcParameter8", "BTC_PARAMETER_8 IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanBtcParameter8", "BTC_PARAMETER_8 < ?" ) // LESS THAN

         .addFilterBy( "greaterthanBtcParameter8", "BTC_PARAMETER_8 > ?" ) // GREATER THAN

         .addFilterBy( "filterByBtcParameter8Match", "BTC_PARAMETER_8 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullBtcParameter8",
      "(BTC_PARAMETER_8 = ? OR BTC_PARAMETER_8 IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INBtcParameter8", "BTC_PARAMETER_8 IN ( ? )" ) // IN

         .addFilterBy( "NOTINBtcParameter8", "BTC_PARAMETER_8 NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "BtcParameter8asc", "BTC_PARAMETER_8 ASC" ) // ORDER ASCENDING

         .addOrderBy( "BtcParameter8desc", "BTC_PARAMETER_8 DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalBtcParameter9", "BTC_PARAMETER_9 = ?" ) // EQUAL

         .addFilterBy( "notequalBtcParameter9", "BTC_PARAMETER_9 != ?" ) // NOTEQUAL

         .addFilterBy( "nullBtcParameter9",
      "(BTC_PARAMETER_9 IS NULL OR LENGTH(BTC_PARAMETER_9) IS NULL OR LENGTH(BTC_PARAMETER_9) = 0)" ) // IS NULL

         .addFilterBy( "notnullBtcParameter9", "BTC_PARAMETER_9 IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanBtcParameter9", "BTC_PARAMETER_9 < ?" ) // LESS THAN

         .addFilterBy( "greaterthanBtcParameter9", "BTC_PARAMETER_9 > ?" ) // GREATER THAN

         .addFilterBy( "filterByBtcParameter9Match", "BTC_PARAMETER_9 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullBtcParameter9",
      "(BTC_PARAMETER_9 = ? OR BTC_PARAMETER_9 IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INBtcParameter9", "BTC_PARAMETER_9 IN ( ? )" ) // IN

         .addFilterBy( "NOTINBtcParameter9", "BTC_PARAMETER_9 NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "BtcParameter9asc", "BTC_PARAMETER_9 ASC" ) // ORDER ASCENDING

         .addOrderBy( "BtcParameter9desc", "BTC_PARAMETER_9 DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalBtcParameter10", "BTC_PARAMETER_10 = ?" ) // EQUAL

         .addFilterBy( "notequalBtcParameter10", "BTC_PARAMETER_10 != ?" ) // NOTEQUAL

         .addFilterBy( "nullBtcParameter10",
      "(BTC_PARAMETER_10 IS NULL OR LENGTH(BTC_PARAMETER_10) IS NULL OR LENGTH(BTC_PARAMETER_10) = 0)" ) // IS NULL

         .addFilterBy( "notnullBtcParameter10", "BTC_PARAMETER_10 IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanBtcParameter10", "BTC_PARAMETER_10 < ?" ) // LESS THAN

         .addFilterBy( "greaterthanBtcParameter10", "BTC_PARAMETER_10 > ?" ) // GREATER THAN

         .addFilterBy( "filterByBtcParameter10Match",
      "BTC_PARAMETER_10 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullBtcParameter10",
      "(BTC_PARAMETER_10 = ? OR BTC_PARAMETER_10 IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INBtcParameter10", "BTC_PARAMETER_10 IN ( ? )" ) // IN

         .addFilterBy( "NOTINBtcParameter10", "BTC_PARAMETER_10 NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "BtcParameter10asc", "BTC_PARAMETER_10 ASC" ) // ORDER ASCENDING

         .addOrderBy( "BtcParameter10desc", "BTC_PARAMETER_10 DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalBtcParameter11", "BTC_PARAMETER_11 = ?" ) // EQUAL

         .addFilterBy( "notequalBtcParameter11", "BTC_PARAMETER_11 != ?" ) // NOTEQUAL

         .addFilterBy( "nullBtcParameter11",
      "(BTC_PARAMETER_11 IS NULL OR LENGTH(BTC_PARAMETER_11) IS NULL OR LENGTH(BTC_PARAMETER_11) = 0)" ) // IS NULL

         .addFilterBy( "notnullBtcParameter11", "BTC_PARAMETER_11 IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanBtcParameter11", "BTC_PARAMETER_11 < ?" ) // LESS THAN

         .addFilterBy( "greaterthanBtcParameter11", "BTC_PARAMETER_11 > ?" ) // GREATER THAN

         .addFilterBy( "filterByBtcParameter11Match",
      "BTC_PARAMETER_11 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullBtcParameter11",
      "(BTC_PARAMETER_11 = ? OR BTC_PARAMETER_11 IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INBtcParameter11", "BTC_PARAMETER_11 IN ( ? )" ) // IN

         .addFilterBy( "NOTINBtcParameter11", "BTC_PARAMETER_11 NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "BtcParameter11asc", "BTC_PARAMETER_11 ASC" ) // ORDER ASCENDING

         .addOrderBy( "BtcParameter11desc", "BTC_PARAMETER_11 DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalBtcParameter12", "BTC_PARAMETER_12 = ?" ) // EQUAL

         .addFilterBy( "notequalBtcParameter12", "BTC_PARAMETER_12 != ?" ) // NOTEQUAL

         .addFilterBy( "nullBtcParameter12",
      "(BTC_PARAMETER_12 IS NULL OR LENGTH(BTC_PARAMETER_12) IS NULL OR LENGTH(BTC_PARAMETER_12) = 0)" ) // IS NULL

         .addFilterBy( "notnullBtcParameter12", "BTC_PARAMETER_12 IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanBtcParameter12", "BTC_PARAMETER_12 < ?" ) // LESS THAN

         .addFilterBy( "greaterthanBtcParameter12", "BTC_PARAMETER_12 > ?" ) // GREATER THAN

         .addFilterBy( "filterByBtcParameter12Match",
      "BTC_PARAMETER_12 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullBtcParameter12",
      "(BTC_PARAMETER_12 = ? OR BTC_PARAMETER_12 IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INBtcParameter12", "BTC_PARAMETER_12 IN ( ? )" ) // IN

         .addFilterBy( "NOTINBtcParameter12", "BTC_PARAMETER_12 NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "BtcParameter12asc", "BTC_PARAMETER_12 ASC" ) // ORDER ASCENDING

         .addOrderBy( "BtcParameter12desc", "BTC_PARAMETER_12 DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalBtcParameter13", "BTC_PARAMETER_13 = ?" ) // EQUAL

         .addFilterBy( "notequalBtcParameter13", "BTC_PARAMETER_13 != ?" ) // NOTEQUAL

         .addFilterBy( "nullBtcParameter13",
      "(BTC_PARAMETER_13 IS NULL OR LENGTH(BTC_PARAMETER_13) IS NULL OR LENGTH(BTC_PARAMETER_13) = 0)" ) // IS NULL

         .addFilterBy( "notnullBtcParameter13", "BTC_PARAMETER_13 IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanBtcParameter13", "BTC_PARAMETER_13 < ?" ) // LESS THAN

         .addFilterBy( "greaterthanBtcParameter13", "BTC_PARAMETER_13 > ?" ) // GREATER THAN

         .addFilterBy( "filterByBtcParameter13Match",
      "BTC_PARAMETER_13 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullBtcParameter13",
      "(BTC_PARAMETER_13 = ? OR BTC_PARAMETER_13 IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INBtcParameter13", "BTC_PARAMETER_13 IN ( ? )" ) // IN

         .addFilterBy( "NOTINBtcParameter13", "BTC_PARAMETER_13 NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "BtcParameter13asc", "BTC_PARAMETER_13 ASC" ) // ORDER ASCENDING

         .addOrderBy( "BtcParameter13desc", "BTC_PARAMETER_13 DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalBtcParameter14", "BTC_PARAMETER_14 = ?" ) // EQUAL

         .addFilterBy( "notequalBtcParameter14", "BTC_PARAMETER_14 != ?" ) // NOTEQUAL

         .addFilterBy( "nullBtcParameter14",
      "(BTC_PARAMETER_14 IS NULL OR LENGTH(BTC_PARAMETER_14) IS NULL OR LENGTH(BTC_PARAMETER_14) = 0)" ) // IS NULL

         .addFilterBy( "notnullBtcParameter14", "BTC_PARAMETER_14 IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanBtcParameter14", "BTC_PARAMETER_14 < ?" ) // LESS THAN

         .addFilterBy( "greaterthanBtcParameter14", "BTC_PARAMETER_14 > ?" ) // GREATER THAN

         .addFilterBy( "filterByBtcParameter14Match",
      "BTC_PARAMETER_14 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullBtcParameter14",
      "(BTC_PARAMETER_14 = ? OR BTC_PARAMETER_14 IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INBtcParameter14", "BTC_PARAMETER_14 IN ( ? )" ) // IN

         .addFilterBy( "NOTINBtcParameter14", "BTC_PARAMETER_14 NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "BtcParameter14asc", "BTC_PARAMETER_14 ASC" ) // ORDER ASCENDING

         .addOrderBy( "BtcParameter14desc", "BTC_PARAMETER_14 DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalBtcParameter15", "BTC_PARAMETER_15 = ?" ) // EQUAL

         .addFilterBy( "notequalBtcParameter15", "BTC_PARAMETER_15 != ?" ) // NOTEQUAL

         .addFilterBy( "nullBtcParameter15",
      "(BTC_PARAMETER_15 IS NULL OR LENGTH(BTC_PARAMETER_15) IS NULL OR LENGTH(BTC_PARAMETER_15) = 0)" ) // IS NULL

         .addFilterBy( "notnullBtcParameter15", "BTC_PARAMETER_15 IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanBtcParameter15", "BTC_PARAMETER_15 < ?" ) // LESS THAN

         .addFilterBy( "greaterthanBtcParameter15", "BTC_PARAMETER_15 > ?" ) // GREATER THAN

         .addFilterBy( "filterByBtcParameter15Match",
      "BTC_PARAMETER_15 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullBtcParameter15",
      "(BTC_PARAMETER_15 = ? OR BTC_PARAMETER_15 IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INBtcParameter15", "BTC_PARAMETER_15 IN ( ? )" ) // IN

         .addFilterBy( "NOTINBtcParameter15", "BTC_PARAMETER_15 NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "BtcParameter15asc", "BTC_PARAMETER_15 ASC" ) // ORDER ASCENDING

         .addOrderBy( "BtcParameter15desc", "BTC_PARAMETER_15 DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalBtcProcessId", "BTC_PROCESS_ID = ?" ) // EQUAL

         .addFilterBy( "notequalBtcProcessId", "BTC_PROCESS_ID != ?" ) // NOTEQUAL

         .addFilterBy( "nullBtcProcessId", "BTC_PROCESS_ID IS NULL" ) // IS NULL

         .addFilterBy( "notnullBtcProcessId", "BTC_PROCESS_ID IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanBtcProcessId", "BTC_PROCESS_ID < ?" ) // LESS THAN

         .addFilterBy( "greaterthanBtcProcessId", "BTC_PROCESS_ID > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalBtcProcessId", "BTC_PROCESS_ID <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalBtcProcessId", "BTC_PROCESS_ID >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "filterByBtcProcessIdMatch", "BTC_PROCESS_ID LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "betweenBtcProcessId", "BTC_PROCESS_ID BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullBtcProcessId",
      "(BTC_PROCESS_ID IS NULL OR BTC_PROCESS_ID = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullBtcProcessId",
      "(BTC_PROCESS_ID IS NULL OR BTC_PROCESS_ID < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullBtcProcessId",
      "(BTC_PROCESS_ID IS NULL OR BTC_PROCESS_ID > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INBtcProcessId", "BTC_PROCESS_ID IN ( ? )" ) // IN

         .addFilterBy( "NOTINBtcProcessId", "BTC_PROCESS_ID NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "BtcProcessIdasc", "BTC_PROCESS_ID ASC" ) // ORDER ASCENDING

         .addOrderBy( "BtcProcessIddesc", "BTC_PROCESS_ID DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalBtcLocationId", "BTC_LOCATION_ID = ?" ) // EQUAL

         .addFilterBy( "notequalBtcLocationId", "BTC_LOCATION_ID != ?" ) // NOTEQUAL

         .addFilterBy( "nullBtcLocationId", "BTC_LOCATION_ID IS NULL" ) // IS NULL

         .addFilterBy( "notnullBtcLocationId", "BTC_LOCATION_ID IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanBtcLocationId", "BTC_LOCATION_ID < ?" ) // LESS THAN

         .addFilterBy( "greaterthanBtcLocationId", "BTC_LOCATION_ID > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalBtcLocationId", "BTC_LOCATION_ID <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalBtcLocationId",
      "BTC_LOCATION_ID >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "filterByBtcLocationIdMatch", "BTC_LOCATION_ID LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "betweenBtcLocationId",
      "BTC_LOCATION_ID BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullBtcLocationId",
      "(BTC_LOCATION_ID IS NULL OR BTC_LOCATION_ID = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullBtcLocationId",
      "(BTC_LOCATION_ID IS NULL OR BTC_LOCATION_ID < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullBtcLocationId",
      "(BTC_LOCATION_ID IS NULL OR BTC_LOCATION_ID > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INBtcLocationId", "BTC_LOCATION_ID IN ( ? )" ) // IN

         .addFilterBy( "NOTINBtcLocationId", "BTC_LOCATION_ID NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "BtcLocationIdasc", "BTC_LOCATION_ID ASC" ) // ORDER ASCENDING

         .addOrderBy( "BtcLocationIddesc", "BTC_LOCATION_ID DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalBtcBatchRunStat", "BTC_BATCH_RUN_STAT = ?" ) // EQUAL

         .addFilterBy( "notequalBtcBatchRunStat", "BTC_BATCH_RUN_STAT != ?" ) // NOTEQUAL

         .addFilterBy( "nullBtcBatchRunStat",
      "(BTC_BATCH_RUN_STAT IS NULL OR LENGTH(BTC_BATCH_RUN_STAT) IS NULL OR LENGTH(BTC_BATCH_RUN_STAT) = 0)" ) // IS NULL

         .addFilterBy( "notnullBtcBatchRunStat",
      "BTC_BATCH_RUN_STAT IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanBtcBatchRunStat", "BTC_BATCH_RUN_STAT < ?" ) // LESS THAN

         .addFilterBy( "greaterthanBtcBatchRunStat", "BTC_BATCH_RUN_STAT > ?" ) // GREATER THAN

         .addFilterBy( "filterByBtcBatchRunStatMatch",
      "BTC_BATCH_RUN_STAT LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullBtcBatchRunStat",
      "(BTC_BATCH_RUN_STAT = ? OR BTC_BATCH_RUN_STAT IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INBtcBatchRunStat", "BTC_BATCH_RUN_STAT IN ( ? )" ) // IN

         .addFilterBy( "NOTINBtcBatchRunStat",
      "BTC_BATCH_RUN_STAT NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "BtcBatchRunStatasc", "BTC_BATCH_RUN_STAT ASC" ) // ORDER ASCENDING

         .addOrderBy( "BtcBatchRunStatdesc", "BTC_BATCH_RUN_STAT DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalBtcBatchRunType", "BTC_BATCH_RUN_TYPE = ?" ) // EQUAL

         .addFilterBy( "notequalBtcBatchRunType", "BTC_BATCH_RUN_TYPE != ?" ) // NOTEQUAL

         .addFilterBy( "nullBtcBatchRunType",
      "(BTC_BATCH_RUN_TYPE IS NULL OR LENGTH(BTC_BATCH_RUN_TYPE) IS NULL OR LENGTH(BTC_BATCH_RUN_TYPE) = 0)" ) // IS NULL

         .addFilterBy( "notnullBtcBatchRunType",
      "BTC_BATCH_RUN_TYPE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanBtcBatchRunType", "BTC_BATCH_RUN_TYPE < ?" ) // LESS THAN

         .addFilterBy( "greaterthanBtcBatchRunType", "BTC_BATCH_RUN_TYPE > ?" ) // GREATER THAN

         .addFilterBy( "filterByBtcBatchRunTypeMatch",
      "BTC_BATCH_RUN_TYPE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullBtcBatchRunType",
      "(BTC_BATCH_RUN_TYPE = ? OR BTC_BATCH_RUN_TYPE IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INBtcBatchRunType", "BTC_BATCH_RUN_TYPE IN ( ? )" ) // IN

         .addFilterBy( "NOTINBtcBatchRunType",
      "BTC_BATCH_RUN_TYPE NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "BtcBatchRunTypeasc", "BTC_BATCH_RUN_TYPE ASC" ) // ORDER ASCENDING

         .addOrderBy( "BtcBatchRunTypedesc", "BTC_BATCH_RUN_TYPE DESC" ) // ORDER DESCENDING
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
      dml = new BtcBatchControlDMLFactory(  );
    }

    return dml;
  }
}
