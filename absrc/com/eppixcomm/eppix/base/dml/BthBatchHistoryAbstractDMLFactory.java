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
 * This is the DMLFactory for BthBatchHistory.
 *
 * @version $Revision: 1.1 $
 * @author $Author$
 * @since $jdk$
 */
public class BthBatchHistoryAbstractDMLFactory
  extends BaseDMLFactory {
  //~ Static variables/initializers //////////////////////////////////////////

  /** The DMLFactory singleton */
  private static DMLFactory dml = null;

  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new BthBatchHistoryAbstractDMLFactory object.
   *
   * @throws DMLException DOCUMENT ME!
   */
  protected BthBatchHistoryAbstractDMLFactory(  )
    throws DMLException {
    ;

    DMLTable table = defTable( "BthBatchHistory", // dmlName
        "blo.BthBatchHistoryDMO", // dmoName
        "BTH_BATCH_HISTORY", // tableName
        34, // numColumns
        "BTH_BATCH_RUN_NUM, BTH_BATCH_TYPE, BTH_BATCH_ID, BTH_PARAMETER_1, BTH_PARAMETER_2, BTH_PARAMETER_3, BTH_PARAMETER_4, BTH_PARAMETER_5, BTH_PARAMETER_6"
        + ", BTH_PARAMETER_7, BTH_PARAMETER_8, BTH_PARAMETER_9, BTH_PARAMETER_10, BTH_PARAMETER_11, BTH_PARAMETER_12, BTH_PARAMETER_13, BTH_PARAMETER_14, BTH_PARAMETER_15"
        + ", BTH_START_TIME, BTH_END_TIME, BTH_LOCATION_ID, BTH_RECS_PROCESSED, BTH_RECS_REJECTED, BTH_BATCH_END_STAT, BTH_STATUS_VALUE, BTH_STATUS_CLASS, BTH_ISAM_VALUE"
        + ", BTH_ERROR_MESS, BTH_ANALYSIS_1, BTH_ANALYSIS_2, BTH_ANALYSIS_3, BTH_ANALYSIS_4, BTH_ANALYSIS_5, BTH_BATCH_RUN_TYPE", // columnList
        "BTH_BATCH_RUN_NUM", //primaryKey
        "" // versionCol     
      , true, // generatedKey
        "BTH_BATCH_RUN_NUM, BTH_BATCH_TYPE, BTH_BATCH_ID, BTH_PARAMETER_1, BTH_PARAMETER_2, BTH_PARAMETER_3, BTH_PARAMETER_4, BTH_PARAMETER_5, BTH_PARAMETER_6"
        + ", BTH_PARAMETER_7, BTH_PARAMETER_8, BTH_PARAMETER_9, BTH_PARAMETER_10, BTH_PARAMETER_11, BTH_PARAMETER_12, BTH_PARAMETER_13, BTH_PARAMETER_14, BTH_PARAMETER_15"
        + ", BTH_START_TIME, BTH_END_TIME, BTH_LOCATION_ID, BTH_RECS_PROCESSED, BTH_RECS_REJECTED, BTH_BATCH_END_STAT, BTH_STATUS_VALUE, BTH_STATUS_CLASS, BTH_ISAM_VALUE"
        + ", BTH_ERROR_MESS, BTH_ANALYSIS_1, BTH_ANALYSIS_2, BTH_ANALYSIS_3, BTH_ANALYSIS_4, BTH_ANALYSIS_5, BTH_BATCH_RUN_TYPE",
        "", "",
        new String[] {
          "BTH_BATCH_RUN_NUM", "BTH_BATCH_TYPE", "BTH_BATCH_ID",
          "BTH_PARAMETER_1", "BTH_PARAMETER_2", "BTH_PARAMETER_3",
          "BTH_PARAMETER_4", "BTH_PARAMETER_5", "BTH_PARAMETER_6",
          "BTH_PARAMETER_7", "BTH_PARAMETER_8", "BTH_PARAMETER_9",
          "BTH_PARAMETER_10", "BTH_PARAMETER_11", "BTH_PARAMETER_12",
          "BTH_PARAMETER_13", "BTH_PARAMETER_14", "BTH_PARAMETER_15",
          "BTH_START_TIME", "BTH_END_TIME", "BTH_LOCATION_ID",
          "BTH_RECS_PROCESSED", "BTH_RECS_REJECTED", "BTH_BATCH_END_STAT",
          "BTH_STATUS_VALUE", "BTH_STATUS_CLASS", "BTH_ISAM_VALUE",
          "BTH_ERROR_MESS", "BTH_ANALYSIS_1", "BTH_ANALYSIS_2",
          "BTH_ANALYSIS_3", "BTH_ANALYSIS_4", "BTH_ANALYSIS_5",
          "BTH_BATCH_RUN_TYPE"
        } );

    table.addFilterBy( "equalBthBatchRunNum", /* PK attribute */
      "BTH_BATCH_RUN_NUM = ?" )
         .addFilterBy( "filterByBthBatchRunNumMatch",
      "BTH_BATCH_RUN_NUM LIKE ?" )
         .addFilterBy( "INBthBatchRunNum", "BTH_BATCH_RUN_NUM IN ( ? )" ) // IN

         .addFilterBy( "NOTINBthBatchRunNum", "BTH_BATCH_RUN_NUM NOT IN ( ? )" ) // NOT IN

         .addFilterBy( "notequalBthBatchRunNum", "BTH_BATCH_RUN_NUM != ?" ) // NOTEQUAL

         .addFilterBy( "nullBthBatchRunNum", "BTH_BATCH_RUN_NUM IS NULL" ) // IS NULL

         .addFilterBy( "notnullBthBatchRunNum",
      "BTH_BATCH_RUN_NUM IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanBthBatchRunNum", "BTH_BATCH_RUN_NUM < ?" ) // LESS THAN

         .addFilterBy( "greaterthanBthBatchRunNum", "BTH_BATCH_RUN_NUM > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalBthBatchRunNum",
      "BTH_BATCH_RUN_NUM <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalBthBatchRunNum",
      "BTH_BATCH_RUN_NUM >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "filterByBthBatchRunNumMatch",
      "BTH_BATCH_RUN_NUM LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "betweenBthBatchRunNum",
      "BTH_BATCH_RUN_NUM BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullBthBatchRunNum",
      "(BTH_BATCH_RUN_NUM IS NULL OR BTH_BATCH_RUN_NUM = ?)" ) // EQUALORNULL
                                                               // TODO : we may need to wrap this with a () 

         .addFilterBy( "lessthanornullBthBatchRunNum",
      "(BTH_BATCH_RUN_NUM IS NULL OR BTH_BATCH_RUN_NUM < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullBthBatchRunNum",
      "(BTH_BATCH_RUN_NUM IS NULL OR BTH_BATCH_RUN_NUM > ?)" ) // GREATERTHANORNULL

         .addOrderBy( "BthBatchRunNumasc", "BTH_BATCH_RUN_NUM ASC" ) // ORDER ASCENDING

         .addOrderBy( "BthBatchRunNumdesc", "BTH_BATCH_RUN_NUM DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalBthBatchType", "(BTH_BATCH_TYPE) = ?" ) // EQUAL

         .addFilterBy( "notequalBthBatchType", "(BTH_BATCH_TYPE) != ?" ) // NOTEQUAL

         .addFilterBy( "nullBthBatchType",
      "(BTH_BATCH_TYPE IS NULL OR LENGTH((BTH_BATCH_TYPE)) IS NULL OR LENGTH((BTH_BATCH_TYPE)) = 0)" ) // IS NULL

         .addFilterBy( "notnullBthBatchType", "BTH_BATCH_TYPE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanBthBatchType", "BTH_BATCH_TYPE < ?" ) // LESS THAN

         .addFilterBy( "greaterthanBthBatchType", "BTH_BATCH_TYPE > ?" ) // GREATER THAN

         .addFilterBy( "filterByBthBatchTypeMatch", "BTH_BATCH_TYPE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullBthBatchType",
      "((BTH_BATCH_TYPE) = ? OR BTH_BATCH_TYPE IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INBthBatchType", "(BTH_BATCH_TYPE) IN ( ? )" ) // IN

         .addFilterBy( "NOTINBthBatchType",
      "(BTH_BATCH_TYPE) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "BthBatchTypeasc", "BTH_BATCH_TYPE ASC" ) // ORDER ASCENDING

         .addOrderBy( "BthBatchTypedesc", "BTH_BATCH_TYPE DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalBthBatchId", "(BTH_BATCH_ID) = ?" ) // EQUAL

         .addFilterBy( "notequalBthBatchId", "(BTH_BATCH_ID) != ?" ) // NOTEQUAL

         .addFilterBy( "nullBthBatchId",
      "(BTH_BATCH_ID IS NULL OR LENGTH((BTH_BATCH_ID)) IS NULL OR LENGTH((BTH_BATCH_ID)) = 0)" ) // IS NULL

         .addFilterBy( "notnullBthBatchId", "BTH_BATCH_ID IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanBthBatchId", "BTH_BATCH_ID < ?" ) // LESS THAN

         .addFilterBy( "greaterthanBthBatchId", "BTH_BATCH_ID > ?" ) // GREATER THAN

         .addFilterBy( "filterByBthBatchIdMatch", "BTH_BATCH_ID LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullBthBatchId",
      "((BTH_BATCH_ID) = ? OR BTH_BATCH_ID IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INBthBatchId", "(BTH_BATCH_ID) IN ( ? )" ) // IN

         .addFilterBy( "NOTINBthBatchId", "(BTH_BATCH_ID) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "BthBatchIdasc", "BTH_BATCH_ID ASC" ) // ORDER ASCENDING

         .addOrderBy( "BthBatchIddesc", "BTH_BATCH_ID DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalBthParameter1", "(BTH_PARAMETER_1) = ?" ) // EQUAL

         .addFilterBy( "notequalBthParameter1", "(BTH_PARAMETER_1) != ?" ) // NOTEQUAL

         .addFilterBy( "nullBthParameter1",
      "(BTH_PARAMETER_1 IS NULL OR LENGTH((BTH_PARAMETER_1)) IS NULL OR LENGTH((BTH_PARAMETER_1)) = 0)" ) // IS NULL

         .addFilterBy( "notnullBthParameter1", "BTH_PARAMETER_1 IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanBthParameter1", "BTH_PARAMETER_1 < ?" ) // LESS THAN

         .addFilterBy( "greaterthanBthParameter1", "BTH_PARAMETER_1 > ?" ) // GREATER THAN

         .addFilterBy( "filterByBthParameter1Match", "BTH_PARAMETER_1 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullBthParameter1",
      "((BTH_PARAMETER_1) = ? OR BTH_PARAMETER_1 IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INBthParameter1", "(BTH_PARAMETER_1) IN ( ? )" ) // IN

         .addFilterBy( "NOTINBthParameter1",
      "(BTH_PARAMETER_1) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "BthParameter1asc", "BTH_PARAMETER_1 ASC" ) // ORDER ASCENDING

         .addOrderBy( "BthParameter1desc", "BTH_PARAMETER_1 DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalBthParameter2", "(BTH_PARAMETER_2) = ?" ) // EQUAL

         .addFilterBy( "notequalBthParameter2", "(BTH_PARAMETER_2) != ?" ) // NOTEQUAL

         .addFilterBy( "nullBthParameter2",
      "(BTH_PARAMETER_2 IS NULL OR LENGTH((BTH_PARAMETER_2)) IS NULL OR LENGTH((BTH_PARAMETER_2)) = 0)" ) // IS NULL

         .addFilterBy( "notnullBthParameter2", "BTH_PARAMETER_2 IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanBthParameter2", "BTH_PARAMETER_2 < ?" ) // LESS THAN

         .addFilterBy( "greaterthanBthParameter2", "BTH_PARAMETER_2 > ?" ) // GREATER THAN

         .addFilterBy( "filterByBthParameter2Match", "BTH_PARAMETER_2 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullBthParameter2",
      "((BTH_PARAMETER_2) = ? OR BTH_PARAMETER_2 IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INBthParameter2", "(BTH_PARAMETER_2) IN ( ? )" ) // IN

         .addFilterBy( "NOTINBthParameter2",
      "(BTH_PARAMETER_2) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "BthParameter2asc", "BTH_PARAMETER_2 ASC" ) // ORDER ASCENDING

         .addOrderBy( "BthParameter2desc", "BTH_PARAMETER_2 DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalBthParameter3", "(BTH_PARAMETER_3) = ?" ) // EQUAL

         .addFilterBy( "notequalBthParameter3", "(BTH_PARAMETER_3) != ?" ) // NOTEQUAL

         .addFilterBy( "nullBthParameter3",
      "(BTH_PARAMETER_3 IS NULL OR LENGTH((BTH_PARAMETER_3)) IS NULL OR LENGTH((BTH_PARAMETER_3)) = 0)" ) // IS NULL

         .addFilterBy( "notnullBthParameter3", "BTH_PARAMETER_3 IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanBthParameter3", "BTH_PARAMETER_3 < ?" ) // LESS THAN

         .addFilterBy( "greaterthanBthParameter3", "BTH_PARAMETER_3 > ?" ) // GREATER THAN

         .addFilterBy( "filterByBthParameter3Match", "BTH_PARAMETER_3 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullBthParameter3",
      "((BTH_PARAMETER_3) = ? OR BTH_PARAMETER_3 IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INBthParameter3", "(BTH_PARAMETER_3) IN ( ? )" ) // IN

         .addFilterBy( "NOTINBthParameter3",
      "(BTH_PARAMETER_3) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "BthParameter3asc", "BTH_PARAMETER_3 ASC" ) // ORDER ASCENDING

         .addOrderBy( "BthParameter3desc", "BTH_PARAMETER_3 DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalBthParameter4", "(BTH_PARAMETER_4) = ?" ) // EQUAL

         .addFilterBy( "notequalBthParameter4", "(BTH_PARAMETER_4) != ?" ) // NOTEQUAL

         .addFilterBy( "nullBthParameter4",
      "(BTH_PARAMETER_4 IS NULL OR LENGTH((BTH_PARAMETER_4)) IS NULL OR LENGTH((BTH_PARAMETER_4)) = 0)" ) // IS NULL

         .addFilterBy( "notnullBthParameter4", "BTH_PARAMETER_4 IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanBthParameter4", "BTH_PARAMETER_4 < ?" ) // LESS THAN

         .addFilterBy( "greaterthanBthParameter4", "BTH_PARAMETER_4 > ?" ) // GREATER THAN

         .addFilterBy( "filterByBthParameter4Match", "BTH_PARAMETER_4 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullBthParameter4",
      "((BTH_PARAMETER_4) = ? OR BTH_PARAMETER_4 IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INBthParameter4", "(BTH_PARAMETER_4) IN ( ? )" ) // IN

         .addFilterBy( "NOTINBthParameter4",
      "(BTH_PARAMETER_4) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "BthParameter4asc", "BTH_PARAMETER_4 ASC" ) // ORDER ASCENDING

         .addOrderBy( "BthParameter4desc", "BTH_PARAMETER_4 DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalBthParameter5", "(BTH_PARAMETER_5) = ?" ) // EQUAL

         .addFilterBy( "notequalBthParameter5", "(BTH_PARAMETER_5) != ?" ) // NOTEQUAL

         .addFilterBy( "nullBthParameter5",
      "(BTH_PARAMETER_5 IS NULL OR LENGTH((BTH_PARAMETER_5)) IS NULL OR LENGTH((BTH_PARAMETER_5)) = 0)" ) // IS NULL

         .addFilterBy( "notnullBthParameter5", "BTH_PARAMETER_5 IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanBthParameter5", "BTH_PARAMETER_5 < ?" ) // LESS THAN

         .addFilterBy( "greaterthanBthParameter5", "BTH_PARAMETER_5 > ?" ) // GREATER THAN

         .addFilterBy( "filterByBthParameter5Match", "BTH_PARAMETER_5 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullBthParameter5",
      "((BTH_PARAMETER_5) = ? OR BTH_PARAMETER_5 IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INBthParameter5", "(BTH_PARAMETER_5) IN ( ? )" ) // IN

         .addFilterBy( "NOTINBthParameter5",
      "(BTH_PARAMETER_5) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "BthParameter5asc", "BTH_PARAMETER_5 ASC" ) // ORDER ASCENDING

         .addOrderBy( "BthParameter5desc", "BTH_PARAMETER_5 DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalBthParameter6", "(BTH_PARAMETER_6) = ?" ) // EQUAL

         .addFilterBy( "notequalBthParameter6", "(BTH_PARAMETER_6) != ?" ) // NOTEQUAL

         .addFilterBy( "nullBthParameter6",
      "(BTH_PARAMETER_6 IS NULL OR LENGTH((BTH_PARAMETER_6)) IS NULL OR LENGTH((BTH_PARAMETER_6)) = 0)" ) // IS NULL

         .addFilterBy( "notnullBthParameter6", "BTH_PARAMETER_6 IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanBthParameter6", "BTH_PARAMETER_6 < ?" ) // LESS THAN

         .addFilterBy( "greaterthanBthParameter6", "BTH_PARAMETER_6 > ?" ) // GREATER THAN

         .addFilterBy( "filterByBthParameter6Match", "BTH_PARAMETER_6 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullBthParameter6",
      "((BTH_PARAMETER_6) = ? OR BTH_PARAMETER_6 IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INBthParameter6", "(BTH_PARAMETER_6) IN ( ? )" ) // IN

         .addFilterBy( "NOTINBthParameter6",
      "(BTH_PARAMETER_6) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "BthParameter6asc", "BTH_PARAMETER_6 ASC" ) // ORDER ASCENDING

         .addOrderBy( "BthParameter6desc", "BTH_PARAMETER_6 DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalBthParameter7", "(BTH_PARAMETER_7) = ?" ) // EQUAL

         .addFilterBy( "notequalBthParameter7", "(BTH_PARAMETER_7) != ?" ) // NOTEQUAL

         .addFilterBy( "nullBthParameter7",
      "(BTH_PARAMETER_7 IS NULL OR LENGTH((BTH_PARAMETER_7)) IS NULL OR LENGTH((BTH_PARAMETER_7)) = 0)" ) // IS NULL

         .addFilterBy( "notnullBthParameter7", "BTH_PARAMETER_7 IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanBthParameter7", "BTH_PARAMETER_7 < ?" ) // LESS THAN

         .addFilterBy( "greaterthanBthParameter7", "BTH_PARAMETER_7 > ?" ) // GREATER THAN

         .addFilterBy( "filterByBthParameter7Match", "BTH_PARAMETER_7 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullBthParameter7",
      "((BTH_PARAMETER_7) = ? OR BTH_PARAMETER_7 IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INBthParameter7", "(BTH_PARAMETER_7) IN ( ? )" ) // IN

         .addFilterBy( "NOTINBthParameter7",
      "(BTH_PARAMETER_7) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "BthParameter7asc", "BTH_PARAMETER_7 ASC" ) // ORDER ASCENDING

         .addOrderBy( "BthParameter7desc", "BTH_PARAMETER_7 DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalBthParameter8", "(BTH_PARAMETER_8) = ?" ) // EQUAL

         .addFilterBy( "notequalBthParameter8", "(BTH_PARAMETER_8) != ?" ) // NOTEQUAL

         .addFilterBy( "nullBthParameter8",
      "(BTH_PARAMETER_8 IS NULL OR LENGTH((BTH_PARAMETER_8)) IS NULL OR LENGTH((BTH_PARAMETER_8)) = 0)" ) // IS NULL

         .addFilterBy( "notnullBthParameter8", "BTH_PARAMETER_8 IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanBthParameter8", "BTH_PARAMETER_8 < ?" ) // LESS THAN

         .addFilterBy( "greaterthanBthParameter8", "BTH_PARAMETER_8 > ?" ) // GREATER THAN

         .addFilterBy( "filterByBthParameter8Match", "BTH_PARAMETER_8 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullBthParameter8",
      "((BTH_PARAMETER_8) = ? OR BTH_PARAMETER_8 IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INBthParameter8", "(BTH_PARAMETER_8) IN ( ? )" ) // IN

         .addFilterBy( "NOTINBthParameter8",
      "(BTH_PARAMETER_8) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "BthParameter8asc", "BTH_PARAMETER_8 ASC" ) // ORDER ASCENDING

         .addOrderBy( "BthParameter8desc", "BTH_PARAMETER_8 DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalBthParameter9", "(BTH_PARAMETER_9) = ?" ) // EQUAL

         .addFilterBy( "notequalBthParameter9", "(BTH_PARAMETER_9) != ?" ) // NOTEQUAL

         .addFilterBy( "nullBthParameter9",
      "(BTH_PARAMETER_9 IS NULL OR LENGTH((BTH_PARAMETER_9)) IS NULL OR LENGTH((BTH_PARAMETER_9)) = 0)" ) // IS NULL

         .addFilterBy( "notnullBthParameter9", "BTH_PARAMETER_9 IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanBthParameter9", "BTH_PARAMETER_9 < ?" ) // LESS THAN

         .addFilterBy( "greaterthanBthParameter9", "BTH_PARAMETER_9 > ?" ) // GREATER THAN

         .addFilterBy( "filterByBthParameter9Match", "BTH_PARAMETER_9 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullBthParameter9",
      "((BTH_PARAMETER_9) = ? OR BTH_PARAMETER_9 IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INBthParameter9", "(BTH_PARAMETER_9) IN ( ? )" ) // IN

         .addFilterBy( "NOTINBthParameter9",
      "(BTH_PARAMETER_9) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "BthParameter9asc", "BTH_PARAMETER_9 ASC" ) // ORDER ASCENDING

         .addOrderBy( "BthParameter9desc", "BTH_PARAMETER_9 DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalBthParameter10", "(BTH_PARAMETER_10) = ?" ) // EQUAL

         .addFilterBy( "notequalBthParameter10", "(BTH_PARAMETER_10) != ?" ) // NOTEQUAL

         .addFilterBy( "nullBthParameter10",
      "(BTH_PARAMETER_10 IS NULL OR LENGTH((BTH_PARAMETER_10)) IS NULL OR LENGTH((BTH_PARAMETER_10)) = 0)" ) // IS NULL

         .addFilterBy( "notnullBthParameter10", "BTH_PARAMETER_10 IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanBthParameter10", "BTH_PARAMETER_10 < ?" ) // LESS THAN

         .addFilterBy( "greaterthanBthParameter10", "BTH_PARAMETER_10 > ?" ) // GREATER THAN

         .addFilterBy( "filterByBthParameter10Match",
      "BTH_PARAMETER_10 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullBthParameter10",
      "((BTH_PARAMETER_10) = ? OR BTH_PARAMETER_10 IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INBthParameter10", "(BTH_PARAMETER_10) IN ( ? )" ) // IN

         .addFilterBy( "NOTINBthParameter10",
      "(BTH_PARAMETER_10) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "BthParameter10asc", "BTH_PARAMETER_10 ASC" ) // ORDER ASCENDING

         .addOrderBy( "BthParameter10desc", "BTH_PARAMETER_10 DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalBthParameter11", "(BTH_PARAMETER_11) = ?" ) // EQUAL

         .addFilterBy( "notequalBthParameter11", "(BTH_PARAMETER_11) != ?" ) // NOTEQUAL

         .addFilterBy( "nullBthParameter11",
      "(BTH_PARAMETER_11 IS NULL OR LENGTH((BTH_PARAMETER_11)) IS NULL OR LENGTH((BTH_PARAMETER_11)) = 0)" ) // IS NULL

         .addFilterBy( "notnullBthParameter11", "BTH_PARAMETER_11 IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanBthParameter11", "BTH_PARAMETER_11 < ?" ) // LESS THAN

         .addFilterBy( "greaterthanBthParameter11", "BTH_PARAMETER_11 > ?" ) // GREATER THAN

         .addFilterBy( "filterByBthParameter11Match",
      "BTH_PARAMETER_11 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullBthParameter11",
      "((BTH_PARAMETER_11) = ? OR BTH_PARAMETER_11 IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INBthParameter11", "(BTH_PARAMETER_11) IN ( ? )" ) // IN

         .addFilterBy( "NOTINBthParameter11",
      "(BTH_PARAMETER_11) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "BthParameter11asc", "BTH_PARAMETER_11 ASC" ) // ORDER ASCENDING

         .addOrderBy( "BthParameter11desc", "BTH_PARAMETER_11 DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalBthParameter12", "(BTH_PARAMETER_12) = ?" ) // EQUAL

         .addFilterBy( "notequalBthParameter12", "(BTH_PARAMETER_12) != ?" ) // NOTEQUAL

         .addFilterBy( "nullBthParameter12",
      "(BTH_PARAMETER_12 IS NULL OR LENGTH((BTH_PARAMETER_12)) IS NULL OR LENGTH((BTH_PARAMETER_12)) = 0)" ) // IS NULL

         .addFilterBy( "notnullBthParameter12", "BTH_PARAMETER_12 IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanBthParameter12", "BTH_PARAMETER_12 < ?" ) // LESS THAN

         .addFilterBy( "greaterthanBthParameter12", "BTH_PARAMETER_12 > ?" ) // GREATER THAN

         .addFilterBy( "filterByBthParameter12Match",
      "BTH_PARAMETER_12 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullBthParameter12",
      "((BTH_PARAMETER_12) = ? OR BTH_PARAMETER_12 IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INBthParameter12", "(BTH_PARAMETER_12) IN ( ? )" ) // IN

         .addFilterBy( "NOTINBthParameter12",
      "(BTH_PARAMETER_12) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "BthParameter12asc", "BTH_PARAMETER_12 ASC" ) // ORDER ASCENDING

         .addOrderBy( "BthParameter12desc", "BTH_PARAMETER_12 DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalBthParameter13", "(BTH_PARAMETER_13) = ?" ) // EQUAL

         .addFilterBy( "notequalBthParameter13", "(BTH_PARAMETER_13) != ?" ) // NOTEQUAL

         .addFilterBy( "nullBthParameter13",
      "(BTH_PARAMETER_13 IS NULL OR LENGTH((BTH_PARAMETER_13)) IS NULL OR LENGTH((BTH_PARAMETER_13)) = 0)" ) // IS NULL

         .addFilterBy( "notnullBthParameter13", "BTH_PARAMETER_13 IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanBthParameter13", "BTH_PARAMETER_13 < ?" ) // LESS THAN

         .addFilterBy( "greaterthanBthParameter13", "BTH_PARAMETER_13 > ?" ) // GREATER THAN

         .addFilterBy( "filterByBthParameter13Match",
      "BTH_PARAMETER_13 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullBthParameter13",
      "((BTH_PARAMETER_13) = ? OR BTH_PARAMETER_13 IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INBthParameter13", "(BTH_PARAMETER_13) IN ( ? )" ) // IN

         .addFilterBy( "NOTINBthParameter13",
      "(BTH_PARAMETER_13) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "BthParameter13asc", "BTH_PARAMETER_13 ASC" ) // ORDER ASCENDING

         .addOrderBy( "BthParameter13desc", "BTH_PARAMETER_13 DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalBthParameter14", "(BTH_PARAMETER_14) = ?" ) // EQUAL

         .addFilterBy( "notequalBthParameter14", "(BTH_PARAMETER_14) != ?" ) // NOTEQUAL

         .addFilterBy( "nullBthParameter14",
      "(BTH_PARAMETER_14 IS NULL OR LENGTH((BTH_PARAMETER_14)) IS NULL OR LENGTH((BTH_PARAMETER_14)) = 0)" ) // IS NULL

         .addFilterBy( "notnullBthParameter14", "BTH_PARAMETER_14 IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanBthParameter14", "BTH_PARAMETER_14 < ?" ) // LESS THAN

         .addFilterBy( "greaterthanBthParameter14", "BTH_PARAMETER_14 > ?" ) // GREATER THAN

         .addFilterBy( "filterByBthParameter14Match",
      "BTH_PARAMETER_14 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullBthParameter14",
      "((BTH_PARAMETER_14) = ? OR BTH_PARAMETER_14 IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INBthParameter14", "(BTH_PARAMETER_14) IN ( ? )" ) // IN

         .addFilterBy( "NOTINBthParameter14",
      "(BTH_PARAMETER_14) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "BthParameter14asc", "BTH_PARAMETER_14 ASC" ) // ORDER ASCENDING

         .addOrderBy( "BthParameter14desc", "BTH_PARAMETER_14 DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalBthParameter15", "(BTH_PARAMETER_15) = ?" ) // EQUAL

         .addFilterBy( "notequalBthParameter15", "(BTH_PARAMETER_15) != ?" ) // NOTEQUAL

         .addFilterBy( "nullBthParameter15",
      "(BTH_PARAMETER_15 IS NULL OR LENGTH((BTH_PARAMETER_15)) IS NULL OR LENGTH((BTH_PARAMETER_15)) = 0)" ) // IS NULL

         .addFilterBy( "notnullBthParameter15", "BTH_PARAMETER_15 IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanBthParameter15", "BTH_PARAMETER_15 < ?" ) // LESS THAN

         .addFilterBy( "greaterthanBthParameter15", "BTH_PARAMETER_15 > ?" ) // GREATER THAN

         .addFilterBy( "filterByBthParameter15Match",
      "BTH_PARAMETER_15 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullBthParameter15",
      "((BTH_PARAMETER_15) = ? OR BTH_PARAMETER_15 IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INBthParameter15", "(BTH_PARAMETER_15) IN ( ? )" ) // IN

         .addFilterBy( "NOTINBthParameter15",
      "(BTH_PARAMETER_15) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "BthParameter15asc", "BTH_PARAMETER_15 ASC" ) // ORDER ASCENDING

         .addOrderBy( "BthParameter15desc", "BTH_PARAMETER_15 DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalBthStartTime", "BTH_START_TIME = ?" ) // EQUAL

         .addFilterBy( "notequalBthStartTime", "BTH_START_TIME != ?" ) // NOTEQUAL

         .addFilterBy( "nullBthStartTime", "BTH_START_TIME IS NULL" ) // IS NULL

         .addFilterBy( "notnullBthStartTime", "BTH_START_TIME IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanBthStartTime", "BTH_START_TIME < ?" ) // LESS THAN

         .addFilterBy( "greaterthanBthStartTime", "BTH_START_TIME > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalBthStartTime", "BTH_START_TIME <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalBthStartTime", "BTH_START_TIME >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "filterByBthStartTimeMatch", "BTH_START_TIME LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "betweenBthStartTime", "BTH_START_TIME BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullBthStartTime",
      "(BTH_START_TIME IS NULL OR BTH_START_TIME = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullBthStartTime",
      "(BTH_START_TIME IS NULL OR BTH_START_TIME < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullBthStartTime",
      "(BTH_START_TIME IS NULL OR BTH_START_TIME > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INBthStartTime", "BTH_START_TIME IN ( ? )" ) // IN

         .addFilterBy( "NOTINBthStartTime", "BTH_START_TIME NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "BthStartTimeasc", "BTH_START_TIME ASC" ) // ORDER ASCENDING

         .addOrderBy( "BthStartTimedesc", "BTH_START_TIME DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalBthEndTime", "BTH_END_TIME = ?" ) // EQUAL

         .addFilterBy( "notequalBthEndTime", "BTH_END_TIME != ?" ) // NOTEQUAL

         .addFilterBy( "nullBthEndTime", "BTH_END_TIME IS NULL" ) // IS NULL

         .addFilterBy( "notnullBthEndTime", "BTH_END_TIME IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanBthEndTime", "BTH_END_TIME < ?" ) // LESS THAN

         .addFilterBy( "greaterthanBthEndTime", "BTH_END_TIME > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalBthEndTime", "BTH_END_TIME <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalBthEndTime", "BTH_END_TIME >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "filterByBthEndTimeMatch", "BTH_END_TIME LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "betweenBthEndTime", "BTH_END_TIME BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullBthEndTime",
      "(BTH_END_TIME IS NULL OR BTH_END_TIME = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullBthEndTime",
      "(BTH_END_TIME IS NULL OR BTH_END_TIME < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullBthEndTime",
      "(BTH_END_TIME IS NULL OR BTH_END_TIME > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INBthEndTime", "BTH_END_TIME IN ( ? )" ) // IN

         .addFilterBy( "NOTINBthEndTime", "BTH_END_TIME NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "BthEndTimeasc", "BTH_END_TIME ASC" ) // ORDER ASCENDING

         .addOrderBy( "BthEndTimedesc", "BTH_END_TIME DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalBthLocationId", "BTH_LOCATION_ID = ?" ) // EQUAL

         .addFilterBy( "notequalBthLocationId", "BTH_LOCATION_ID != ?" ) // NOTEQUAL

         .addFilterBy( "nullBthLocationId", "BTH_LOCATION_ID IS NULL" ) // IS NULL

         .addFilterBy( "notnullBthLocationId", "BTH_LOCATION_ID IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanBthLocationId", "BTH_LOCATION_ID < ?" ) // LESS THAN

         .addFilterBy( "greaterthanBthLocationId", "BTH_LOCATION_ID > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalBthLocationId", "BTH_LOCATION_ID <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalBthLocationId",
      "BTH_LOCATION_ID >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "filterByBthLocationIdMatch", "BTH_LOCATION_ID LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "betweenBthLocationId",
      "BTH_LOCATION_ID BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullBthLocationId",
      "(BTH_LOCATION_ID IS NULL OR BTH_LOCATION_ID = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullBthLocationId",
      "(BTH_LOCATION_ID IS NULL OR BTH_LOCATION_ID < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullBthLocationId",
      "(BTH_LOCATION_ID IS NULL OR BTH_LOCATION_ID > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INBthLocationId", "BTH_LOCATION_ID IN ( ? )" ) // IN

         .addFilterBy( "NOTINBthLocationId", "BTH_LOCATION_ID NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "BthLocationIdasc", "BTH_LOCATION_ID ASC" ) // ORDER ASCENDING

         .addOrderBy( "BthLocationIddesc", "BTH_LOCATION_ID DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalBthRecsProcessed", "BTH_RECS_PROCESSED = ?" ) // EQUAL

         .addFilterBy( "notequalBthRecsProcessed", "BTH_RECS_PROCESSED != ?" ) // NOTEQUAL

         .addFilterBy( "nullBthRecsProcessed", "BTH_RECS_PROCESSED IS NULL" ) // IS NULL

         .addFilterBy( "notnullBthRecsProcessed",
      "BTH_RECS_PROCESSED IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanBthRecsProcessed", "BTH_RECS_PROCESSED < ?" ) // LESS THAN

         .addFilterBy( "greaterthanBthRecsProcessed", "BTH_RECS_PROCESSED > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalBthRecsProcessed",
      "BTH_RECS_PROCESSED <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalBthRecsProcessed",
      "BTH_RECS_PROCESSED >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "filterByBthRecsProcessedMatch",
      "BTH_RECS_PROCESSED LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "betweenBthRecsProcessed",
      "BTH_RECS_PROCESSED BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullBthRecsProcessed",
      "(BTH_RECS_PROCESSED IS NULL OR BTH_RECS_PROCESSED = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullBthRecsProcessed",
      "(BTH_RECS_PROCESSED IS NULL OR BTH_RECS_PROCESSED < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullBthRecsProcessed",
      "(BTH_RECS_PROCESSED IS NULL OR BTH_RECS_PROCESSED > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INBthRecsProcessed", "BTH_RECS_PROCESSED IN ( ? )" ) // IN

         .addFilterBy( "NOTINBthRecsProcessed",
      "BTH_RECS_PROCESSED NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "BthRecsProcessedasc", "BTH_RECS_PROCESSED ASC" ) // ORDER ASCENDING

         .addOrderBy( "BthRecsProcesseddesc", "BTH_RECS_PROCESSED DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalBthRecsRejected", "BTH_RECS_REJECTED = ?" ) // EQUAL

         .addFilterBy( "notequalBthRecsRejected", "BTH_RECS_REJECTED != ?" ) // NOTEQUAL

         .addFilterBy( "nullBthRecsRejected", "BTH_RECS_REJECTED IS NULL" ) // IS NULL

         .addFilterBy( "notnullBthRecsRejected",
      "BTH_RECS_REJECTED IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanBthRecsRejected", "BTH_RECS_REJECTED < ?" ) // LESS THAN

         .addFilterBy( "greaterthanBthRecsRejected", "BTH_RECS_REJECTED > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalBthRecsRejected",
      "BTH_RECS_REJECTED <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalBthRecsRejected",
      "BTH_RECS_REJECTED >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "filterByBthRecsRejectedMatch",
      "BTH_RECS_REJECTED LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "betweenBthRecsRejected",
      "BTH_RECS_REJECTED BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullBthRecsRejected",
      "(BTH_RECS_REJECTED IS NULL OR BTH_RECS_REJECTED = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullBthRecsRejected",
      "(BTH_RECS_REJECTED IS NULL OR BTH_RECS_REJECTED < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullBthRecsRejected",
      "(BTH_RECS_REJECTED IS NULL OR BTH_RECS_REJECTED > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INBthRecsRejected", "BTH_RECS_REJECTED IN ( ? )" ) // IN

         .addFilterBy( "NOTINBthRecsRejected",
      "BTH_RECS_REJECTED NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "BthRecsRejectedasc", "BTH_RECS_REJECTED ASC" ) // ORDER ASCENDING

         .addOrderBy( "BthRecsRejecteddesc", "BTH_RECS_REJECTED DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalBthBatchEndStat", "(BTH_BATCH_END_STAT) = ?" ) // EQUAL

         .addFilterBy( "notequalBthBatchEndStat",
      "(BTH_BATCH_END_STAT) != ?" ) // NOTEQUAL

         .addFilterBy( "nullBthBatchEndStat",
      "(BTH_BATCH_END_STAT IS NULL OR LENGTH((BTH_BATCH_END_STAT)) IS NULL OR LENGTH((BTH_BATCH_END_STAT)) = 0)" ) // IS NULL

         .addFilterBy( "notnullBthBatchEndStat",
      "BTH_BATCH_END_STAT IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanBthBatchEndStat", "BTH_BATCH_END_STAT < ?" ) // LESS THAN

         .addFilterBy( "greaterthanBthBatchEndStat", "BTH_BATCH_END_STAT > ?" ) // GREATER THAN

         .addFilterBy( "filterByBthBatchEndStatMatch",
      "BTH_BATCH_END_STAT LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullBthBatchEndStat",
      "((BTH_BATCH_END_STAT) = ? OR BTH_BATCH_END_STAT IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INBthBatchEndStat",
      "(BTH_BATCH_END_STAT) IN ( ? )" ) // IN

         .addFilterBy( "NOTINBthBatchEndStat",
      "(BTH_BATCH_END_STAT) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "BthBatchEndStatasc", "BTH_BATCH_END_STAT ASC" ) // ORDER ASCENDING

         .addOrderBy( "BthBatchEndStatdesc", "BTH_BATCH_END_STAT DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalBthStatusValue", "BTH_STATUS_VALUE = ?" ) // EQUAL

         .addFilterBy( "notequalBthStatusValue", "BTH_STATUS_VALUE != ?" ) // NOTEQUAL

         .addFilterBy( "nullBthStatusValue", "BTH_STATUS_VALUE IS NULL" ) // IS NULL

         .addFilterBy( "notnullBthStatusValue", "BTH_STATUS_VALUE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanBthStatusValue", "BTH_STATUS_VALUE < ?" ) // LESS THAN

         .addFilterBy( "greaterthanBthStatusValue", "BTH_STATUS_VALUE > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalBthStatusValue",
      "BTH_STATUS_VALUE <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalBthStatusValue",
      "BTH_STATUS_VALUE >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "filterByBthStatusValueMatch",
      "BTH_STATUS_VALUE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "betweenBthStatusValue",
      "BTH_STATUS_VALUE BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullBthStatusValue",
      "(BTH_STATUS_VALUE IS NULL OR BTH_STATUS_VALUE = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullBthStatusValue",
      "(BTH_STATUS_VALUE IS NULL OR BTH_STATUS_VALUE < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullBthStatusValue",
      "(BTH_STATUS_VALUE IS NULL OR BTH_STATUS_VALUE > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INBthStatusValue", "BTH_STATUS_VALUE IN ( ? )" ) // IN

         .addFilterBy( "NOTINBthStatusValue", "BTH_STATUS_VALUE NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "BthStatusValueasc", "BTH_STATUS_VALUE ASC" ) // ORDER ASCENDING

         .addOrderBy( "BthStatusValuedesc", "BTH_STATUS_VALUE DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalBthStatusClass", "BTH_STATUS_CLASS = ?" ) // EQUAL

         .addFilterBy( "notequalBthStatusClass", "BTH_STATUS_CLASS != ?" ) // NOTEQUAL

         .addFilterBy( "nullBthStatusClass", "BTH_STATUS_CLASS IS NULL" ) // IS NULL

         .addFilterBy( "notnullBthStatusClass", "BTH_STATUS_CLASS IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanBthStatusClass", "BTH_STATUS_CLASS < ?" ) // LESS THAN

         .addFilterBy( "greaterthanBthStatusClass", "BTH_STATUS_CLASS > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalBthStatusClass",
      "BTH_STATUS_CLASS <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalBthStatusClass",
      "BTH_STATUS_CLASS >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "filterByBthStatusClassMatch",
      "BTH_STATUS_CLASS LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "betweenBthStatusClass",
      "BTH_STATUS_CLASS BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullBthStatusClass",
      "(BTH_STATUS_CLASS IS NULL OR BTH_STATUS_CLASS = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullBthStatusClass",
      "(BTH_STATUS_CLASS IS NULL OR BTH_STATUS_CLASS < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullBthStatusClass",
      "(BTH_STATUS_CLASS IS NULL OR BTH_STATUS_CLASS > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INBthStatusClass", "BTH_STATUS_CLASS IN ( ? )" ) // IN

         .addFilterBy( "NOTINBthStatusClass", "BTH_STATUS_CLASS NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "BthStatusClassasc", "BTH_STATUS_CLASS ASC" ) // ORDER ASCENDING

         .addOrderBy( "BthStatusClassdesc", "BTH_STATUS_CLASS DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalBthIsamValue", "BTH_ISAM_VALUE = ?" ) // EQUAL

         .addFilterBy( "notequalBthIsamValue", "BTH_ISAM_VALUE != ?" ) // NOTEQUAL

         .addFilterBy( "nullBthIsamValue", "BTH_ISAM_VALUE IS NULL" ) // IS NULL

         .addFilterBy( "notnullBthIsamValue", "BTH_ISAM_VALUE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanBthIsamValue", "BTH_ISAM_VALUE < ?" ) // LESS THAN

         .addFilterBy( "greaterthanBthIsamValue", "BTH_ISAM_VALUE > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalBthIsamValue", "BTH_ISAM_VALUE <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalBthIsamValue", "BTH_ISAM_VALUE >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "filterByBthIsamValueMatch", "BTH_ISAM_VALUE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "betweenBthIsamValue", "BTH_ISAM_VALUE BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullBthIsamValue",
      "(BTH_ISAM_VALUE IS NULL OR BTH_ISAM_VALUE = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullBthIsamValue",
      "(BTH_ISAM_VALUE IS NULL OR BTH_ISAM_VALUE < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullBthIsamValue",
      "(BTH_ISAM_VALUE IS NULL OR BTH_ISAM_VALUE > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INBthIsamValue", "BTH_ISAM_VALUE IN ( ? )" ) // IN

         .addFilterBy( "NOTINBthIsamValue", "BTH_ISAM_VALUE NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "BthIsamValueasc", "BTH_ISAM_VALUE ASC" ) // ORDER ASCENDING

         .addOrderBy( "BthIsamValuedesc", "BTH_ISAM_VALUE DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalBthErrorMess", "(BTH_ERROR_MESS) = ?" ) // EQUAL

         .addFilterBy( "notequalBthErrorMess", "(BTH_ERROR_MESS) != ?" ) // NOTEQUAL

         .addFilterBy( "nullBthErrorMess",
      "(BTH_ERROR_MESS IS NULL OR LENGTH((BTH_ERROR_MESS)) IS NULL OR LENGTH((BTH_ERROR_MESS)) = 0)" ) // IS NULL

         .addFilterBy( "notnullBthErrorMess", "BTH_ERROR_MESS IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanBthErrorMess", "BTH_ERROR_MESS < ?" ) // LESS THAN

         .addFilterBy( "greaterthanBthErrorMess", "BTH_ERROR_MESS > ?" ) // GREATER THAN

         .addFilterBy( "filterByBthErrorMessMatch", "BTH_ERROR_MESS LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullBthErrorMess",
      "((BTH_ERROR_MESS) = ? OR BTH_ERROR_MESS IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INBthErrorMess", "(BTH_ERROR_MESS) IN ( ? )" ) // IN

         .addFilterBy( "NOTINBthErrorMess",
      "(BTH_ERROR_MESS) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "BthErrorMessasc", "BTH_ERROR_MESS ASC" ) // ORDER ASCENDING

         .addOrderBy( "BthErrorMessdesc", "BTH_ERROR_MESS DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalBthAnalysis1", "(BTH_ANALYSIS_1) = ?" ) // EQUAL

         .addFilterBy( "notequalBthAnalysis1", "(BTH_ANALYSIS_1) != ?" ) // NOTEQUAL

         .addFilterBy( "nullBthAnalysis1",
      "(BTH_ANALYSIS_1 IS NULL OR LENGTH((BTH_ANALYSIS_1)) IS NULL OR LENGTH((BTH_ANALYSIS_1)) = 0)" ) // IS NULL

         .addFilterBy( "notnullBthAnalysis1", "BTH_ANALYSIS_1 IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanBthAnalysis1", "BTH_ANALYSIS_1 < ?" ) // LESS THAN

         .addFilterBy( "greaterthanBthAnalysis1", "BTH_ANALYSIS_1 > ?" ) // GREATER THAN

         .addFilterBy( "filterByBthAnalysis1Match", "BTH_ANALYSIS_1 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullBthAnalysis1",
      "((BTH_ANALYSIS_1) = ? OR BTH_ANALYSIS_1 IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INBthAnalysis1", "(BTH_ANALYSIS_1) IN ( ? )" ) // IN

         .addFilterBy( "NOTINBthAnalysis1",
      "(BTH_ANALYSIS_1) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "BthAnalysis1asc", "BTH_ANALYSIS_1 ASC" ) // ORDER ASCENDING

         .addOrderBy( "BthAnalysis1desc", "BTH_ANALYSIS_1 DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalBthAnalysis2", "(BTH_ANALYSIS_2) = ?" ) // EQUAL

         .addFilterBy( "notequalBthAnalysis2", "(BTH_ANALYSIS_2) != ?" ) // NOTEQUAL

         .addFilterBy( "nullBthAnalysis2",
      "(BTH_ANALYSIS_2 IS NULL OR LENGTH((BTH_ANALYSIS_2)) IS NULL OR LENGTH((BTH_ANALYSIS_2)) = 0)" ) // IS NULL

         .addFilterBy( "notnullBthAnalysis2", "BTH_ANALYSIS_2 IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanBthAnalysis2", "BTH_ANALYSIS_2 < ?" ) // LESS THAN

         .addFilterBy( "greaterthanBthAnalysis2", "BTH_ANALYSIS_2 > ?" ) // GREATER THAN

         .addFilterBy( "filterByBthAnalysis2Match", "BTH_ANALYSIS_2 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullBthAnalysis2",
      "((BTH_ANALYSIS_2) = ? OR BTH_ANALYSIS_2 IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INBthAnalysis2", "(BTH_ANALYSIS_2) IN ( ? )" ) // IN

         .addFilterBy( "NOTINBthAnalysis2",
      "(BTH_ANALYSIS_2) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "BthAnalysis2asc", "BTH_ANALYSIS_2 ASC" ) // ORDER ASCENDING

         .addOrderBy( "BthAnalysis2desc", "BTH_ANALYSIS_2 DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalBthAnalysis3", "(BTH_ANALYSIS_3) = ?" ) // EQUAL

         .addFilterBy( "notequalBthAnalysis3", "(BTH_ANALYSIS_3) != ?" ) // NOTEQUAL

         .addFilterBy( "nullBthAnalysis3",
      "(BTH_ANALYSIS_3 IS NULL OR LENGTH((BTH_ANALYSIS_3)) IS NULL OR LENGTH((BTH_ANALYSIS_3)) = 0)" ) // IS NULL

         .addFilterBy( "notnullBthAnalysis3", "BTH_ANALYSIS_3 IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanBthAnalysis3", "BTH_ANALYSIS_3 < ?" ) // LESS THAN

         .addFilterBy( "greaterthanBthAnalysis3", "BTH_ANALYSIS_3 > ?" ) // GREATER THAN

         .addFilterBy( "filterByBthAnalysis3Match", "BTH_ANALYSIS_3 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullBthAnalysis3",
      "((BTH_ANALYSIS_3) = ? OR BTH_ANALYSIS_3 IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INBthAnalysis3", "(BTH_ANALYSIS_3) IN ( ? )" ) // IN

         .addFilterBy( "NOTINBthAnalysis3",
      "(BTH_ANALYSIS_3) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "BthAnalysis3asc", "BTH_ANALYSIS_3 ASC" ) // ORDER ASCENDING

         .addOrderBy( "BthAnalysis3desc", "BTH_ANALYSIS_3 DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalBthAnalysis4", "(BTH_ANALYSIS_4) = ?" ) // EQUAL

         .addFilterBy( "notequalBthAnalysis4", "(BTH_ANALYSIS_4) != ?" ) // NOTEQUAL

         .addFilterBy( "nullBthAnalysis4",
      "(BTH_ANALYSIS_4 IS NULL OR LENGTH((BTH_ANALYSIS_4)) IS NULL OR LENGTH((BTH_ANALYSIS_4)) = 0)" ) // IS NULL

         .addFilterBy( "notnullBthAnalysis4", "BTH_ANALYSIS_4 IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanBthAnalysis4", "BTH_ANALYSIS_4 < ?" ) // LESS THAN

         .addFilterBy( "greaterthanBthAnalysis4", "BTH_ANALYSIS_4 > ?" ) // GREATER THAN

         .addFilterBy( "filterByBthAnalysis4Match", "BTH_ANALYSIS_4 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullBthAnalysis4",
      "((BTH_ANALYSIS_4) = ? OR BTH_ANALYSIS_4 IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INBthAnalysis4", "(BTH_ANALYSIS_4) IN ( ? )" ) // IN

         .addFilterBy( "NOTINBthAnalysis4",
      "(BTH_ANALYSIS_4) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "BthAnalysis4asc", "BTH_ANALYSIS_4 ASC" ) // ORDER ASCENDING

         .addOrderBy( "BthAnalysis4desc", "BTH_ANALYSIS_4 DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalBthAnalysis5", "(BTH_ANALYSIS_5) = ?" ) // EQUAL

         .addFilterBy( "notequalBthAnalysis5", "(BTH_ANALYSIS_5) != ?" ) // NOTEQUAL

         .addFilterBy( "nullBthAnalysis5",
      "(BTH_ANALYSIS_5 IS NULL OR LENGTH((BTH_ANALYSIS_5)) IS NULL OR LENGTH((BTH_ANALYSIS_5)) = 0)" ) // IS NULL

         .addFilterBy( "notnullBthAnalysis5", "BTH_ANALYSIS_5 IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanBthAnalysis5", "BTH_ANALYSIS_5 < ?" ) // LESS THAN

         .addFilterBy( "greaterthanBthAnalysis5", "BTH_ANALYSIS_5 > ?" ) // GREATER THAN

         .addFilterBy( "filterByBthAnalysis5Match", "BTH_ANALYSIS_5 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullBthAnalysis5",
      "((BTH_ANALYSIS_5) = ? OR BTH_ANALYSIS_5 IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INBthAnalysis5", "(BTH_ANALYSIS_5) IN ( ? )" ) // IN

         .addFilterBy( "NOTINBthAnalysis5",
      "(BTH_ANALYSIS_5) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "BthAnalysis5asc", "BTH_ANALYSIS_5 ASC" ) // ORDER ASCENDING

         .addOrderBy( "BthAnalysis5desc", "BTH_ANALYSIS_5 DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalBthBatchRunType", "(BTH_BATCH_RUN_TYPE) = ?" ) // EQUAL

         .addFilterBy( "notequalBthBatchRunType",
      "(BTH_BATCH_RUN_TYPE) != ?" ) // NOTEQUAL

         .addFilterBy( "nullBthBatchRunType",
      "(BTH_BATCH_RUN_TYPE IS NULL OR LENGTH((BTH_BATCH_RUN_TYPE)) IS NULL OR LENGTH((BTH_BATCH_RUN_TYPE)) = 0)" ) // IS NULL

         .addFilterBy( "notnullBthBatchRunType",
      "BTH_BATCH_RUN_TYPE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanBthBatchRunType", "BTH_BATCH_RUN_TYPE < ?" ) // LESS THAN

         .addFilterBy( "greaterthanBthBatchRunType", "BTH_BATCH_RUN_TYPE > ?" ) // GREATER THAN

         .addFilterBy( "filterByBthBatchRunTypeMatch",
      "BTH_BATCH_RUN_TYPE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullBthBatchRunType",
      "((BTH_BATCH_RUN_TYPE) = ? OR BTH_BATCH_RUN_TYPE IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INBthBatchRunType",
      "(BTH_BATCH_RUN_TYPE) IN ( ? )" ) // IN

         .addFilterBy( "NOTINBthBatchRunType",
      "(BTH_BATCH_RUN_TYPE) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "BthBatchRunTypeasc", "BTH_BATCH_RUN_TYPE ASC" ) // ORDER ASCENDING

         .addOrderBy( "BthBatchRunTypedesc", "BTH_BATCH_RUN_TYPE DESC" ) // ORDER DESCENDING
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
      dml = new BthBatchHistoryDMLFactory(  );
    }

    return dml;
  }
}
