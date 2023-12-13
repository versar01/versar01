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
 * This is the DMLFactory for PtmPermToMarket.
 *
 * @version $Revision: 1.1 $
 * @author $Author$
 * @since $jdk$
 */
public class PtmPermToMarketAbstractDMLFactory
  extends BaseDMLFactory {
  //~ Static variables/initializers //////////////////////////////////////////

  /** The DMLFactory singleton */
  private static DMLFactory dml = null;

  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new PtmPermToMarketAbstractDMLFactory object.
   *
   * @throws DMLException DOCUMENT ME!
   */
  protected PtmPermToMarketAbstractDMLFactory(  )
    throws DMLException {
    ;

    DMLTable table = defTable( "PtmPermToMarket", // dmlName
        "blo.PtmPermToMarketDMO", // dmoName
        "PTM_PERM_TO_MARKET", // tableName
        37, // numColumns
        "PTM_BILL_AC_NO, PTM_IND, PTM_TITLE, PTM_SURNAME, PTM_FIRSTNAME, PTM_PREF_COMMS, PTM_AUD_ID, PTM_ANALYSIS_1, PTM_ANALYSIS_2"
        + ", PTM_ANALYSIS_3, PTM_ANALYSIS_4, PTM_ANALYSIS_5, PTM_ANALYSIS_6, PTM_ANALYSIS_7, PTM_ANALYSIS_8, PTM_ANALYSIS_9, PTM_ANALYSIS_10, PTM_ANALYSIS_11"
        + ", PTM_ANALYSIS_12, PTM_ANALYSIS_13, PTM_ANALYSIS_14, PTM_ANALYSIS_15, PTM_ANALYSIS_16, PTM_ANALYSIS_17, PTM_ANALYSIS_18, PTM_ANALYSIS_19, PTM_ANALYSIS_20"
        + ", PTM_ANALYSIS_21, PTM_ANALYSIS_22, PTM_ANALYSIS_23, PTM_ANALYSIS_24, PTM_ANALYSIS_25, PTM_ANALYSIS_26, PTM_ANALYSIS_27, PTM_ANALYSIS_28, PTM_ANALYSIS_29"
        + ", PTM_ANALYSIS_30", // columnList
        "PTM_BILL_AC_NO", //primaryKey
        "" // versionCol     
      , false, // generatedKey
        "PTM_BILL_AC_NO, PTM_IND, PTM_TITLE, PTM_SURNAME, PTM_FIRSTNAME, PTM_PREF_COMMS, PTM_AUD_ID, PTM_ANALYSIS_1, PTM_ANALYSIS_2"
        + ", PTM_ANALYSIS_3, PTM_ANALYSIS_4, PTM_ANALYSIS_5, PTM_ANALYSIS_6, PTM_ANALYSIS_7, PTM_ANALYSIS_8, PTM_ANALYSIS_9, PTM_ANALYSIS_10, PTM_ANALYSIS_11"
        + ", PTM_ANALYSIS_12, PTM_ANALYSIS_13, PTM_ANALYSIS_14, PTM_ANALYSIS_15, PTM_ANALYSIS_16, PTM_ANALYSIS_17, PTM_ANALYSIS_18, PTM_ANALYSIS_19, PTM_ANALYSIS_20"
        + ", PTM_ANALYSIS_21, PTM_ANALYSIS_22, PTM_ANALYSIS_23, PTM_ANALYSIS_24, PTM_ANALYSIS_25, PTM_ANALYSIS_26, PTM_ANALYSIS_27, PTM_ANALYSIS_28, PTM_ANALYSIS_29"
        + ", PTM_ANALYSIS_30", "", "",
        new String[] {
          "PTM_BILL_AC_NO", "PTM_IND", "PTM_TITLE", "PTM_SURNAME",
          "PTM_FIRSTNAME", "PTM_PREF_COMMS", "PTM_AUD_ID", "PTM_ANALYSIS_1",
          "PTM_ANALYSIS_2", "PTM_ANALYSIS_3", "PTM_ANALYSIS_4",
          "PTM_ANALYSIS_5", "PTM_ANALYSIS_6", "PTM_ANALYSIS_7",
          "PTM_ANALYSIS_8", "PTM_ANALYSIS_9", "PTM_ANALYSIS_10",
          "PTM_ANALYSIS_11", "PTM_ANALYSIS_12", "PTM_ANALYSIS_13",
          "PTM_ANALYSIS_14", "PTM_ANALYSIS_15", "PTM_ANALYSIS_16",
          "PTM_ANALYSIS_17", "PTM_ANALYSIS_18", "PTM_ANALYSIS_19",
          "PTM_ANALYSIS_20", "PTM_ANALYSIS_21", "PTM_ANALYSIS_22",
          "PTM_ANALYSIS_23", "PTM_ANALYSIS_24", "PTM_ANALYSIS_25",
          "PTM_ANALYSIS_26", "PTM_ANALYSIS_27", "PTM_ANALYSIS_28",
          "PTM_ANALYSIS_29", "PTM_ANALYSIS_30"
        } );

    table.addFilterBy( "equalPtmBillAcNo", /* PK attribute */
      "PTM_BILL_AC_NO = ?" )
         .addFilterBy( "filterByPtmBillAcNoMatch", "PTM_BILL_AC_NO LIKE ?" )
         .addFilterBy( "INPtmBillAcNo", "(PTM_BILL_AC_NO) IN ( ? )" ) // IN

         .addFilterBy( "NOTINPtmBillAcNo", "(PTM_BILL_AC_NO) NOT IN ( ? )" ) // NOT IN

         .addFilterBy( "notequalPtmBillAcNo", "(PTM_BILL_AC_NO) != ?" ) // NOTEQUAL

         .addFilterBy( "nullPtmBillAcNo",
      "(PTM_BILL_AC_NO IS NULL OR LENGTH((PTM_BILL_AC_NO)) IS NULL OR LENGTH((PTM_BILL_AC_NO)) = 0)" ) // IS NULL

         .addFilterBy( "notnullPtmBillAcNo", "PTM_BILL_AC_NO IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByPtmBillAcNoMatch", "PTM_BILL_AC_NO LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullPtmBillAcNo",
      "(PTM_BILL_AC_NO = ? OR PTM_BILL_AC_NO IS NULL)" ) // EQUALORNULL
                                                               // TODO : we may need to wrap this with a () 

         .addOrderBy( "PtmBillAcNoasc", "PTM_BILL_AC_NO ASC" ) // ORDER ASCENDING

         .addOrderBy( "PtmBillAcNodesc", "PTM_BILL_AC_NO DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalPtmInd", "(PTM_IND) = ?" ) // EQUAL

         .addFilterBy( "notequalPtmInd", "(PTM_IND) != ?" ) // NOTEQUAL

         .addFilterBy( "nullPtmInd",
      "(PTM_IND IS NULL OR LENGTH((PTM_IND)) IS NULL OR LENGTH((PTM_IND)) = 0)" ) // IS NULL

         .addFilterBy( "notnullPtmInd", "PTM_IND IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByPtmIndMatch", "PTM_IND LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullPtmInd",
      "((PTM_IND) = ? OR PTM_IND IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INPtmInd", "(PTM_IND) IN ( ? )" ) // IN

         .addFilterBy( "NOTINPtmInd", "(PTM_IND) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "PtmIndasc", "PTM_IND ASC" ) // ORDER ASCENDING

         .addOrderBy( "PtmInddesc", "PTM_IND DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalPtmTitle", "(PTM_TITLE) = ?" ) // EQUAL

         .addFilterBy( "notequalPtmTitle", "(PTM_TITLE) != ?" ) // NOTEQUAL

         .addFilterBy( "nullPtmTitle",
      "(PTM_TITLE IS NULL OR LENGTH((PTM_TITLE)) IS NULL OR LENGTH((PTM_TITLE)) = 0)" ) // IS NULL

         .addFilterBy( "notnullPtmTitle", "PTM_TITLE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByPtmTitleMatch", "PTM_TITLE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullPtmTitle",
      "((PTM_TITLE) = ? OR PTM_TITLE IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INPtmTitle", "(PTM_TITLE) IN ( ? )" ) // IN

         .addFilterBy( "NOTINPtmTitle", "(PTM_TITLE) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "PtmTitleasc", "PTM_TITLE ASC" ) // ORDER ASCENDING

         .addOrderBy( "PtmTitledesc", "PTM_TITLE DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalPtmSurname", "(PTM_SURNAME) = ?" ) // EQUAL

         .addFilterBy( "notequalPtmSurname", "(PTM_SURNAME) != ?" ) // NOTEQUAL

         .addFilterBy( "nullPtmSurname",
      "(PTM_SURNAME IS NULL OR LENGTH((PTM_SURNAME)) IS NULL OR LENGTH((PTM_SURNAME)) = 0)" ) // IS NULL

         .addFilterBy( "notnullPtmSurname", "PTM_SURNAME IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByPtmSurnameMatch", "PTM_SURNAME LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullPtmSurname",
      "((PTM_SURNAME) = ? OR PTM_SURNAME IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INPtmSurname", "(PTM_SURNAME) IN ( ? )" ) // IN

         .addFilterBy( "NOTINPtmSurname", "(PTM_SURNAME) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "PtmSurnameasc", "PTM_SURNAME ASC" ) // ORDER ASCENDING

         .addOrderBy( "PtmSurnamedesc", "PTM_SURNAME DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalPtmFirstname", "(PTM_FIRSTNAME) = ?" ) // EQUAL

         .addFilterBy( "notequalPtmFirstname", "(PTM_FIRSTNAME) != ?" ) // NOTEQUAL

         .addFilterBy( "nullPtmFirstname",
      "(PTM_FIRSTNAME IS NULL OR LENGTH((PTM_FIRSTNAME)) IS NULL OR LENGTH((PTM_FIRSTNAME)) = 0)" ) // IS NULL

         .addFilterBy( "notnullPtmFirstname", "PTM_FIRSTNAME IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByPtmFirstnameMatch", "PTM_FIRSTNAME LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullPtmFirstname",
      "((PTM_FIRSTNAME) = ? OR PTM_FIRSTNAME IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INPtmFirstname", "(PTM_FIRSTNAME) IN ( ? )" ) // IN

         .addFilterBy( "NOTINPtmFirstname", "(PTM_FIRSTNAME) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "PtmFirstnameasc", "PTM_FIRSTNAME ASC" ) // ORDER ASCENDING

         .addOrderBy( "PtmFirstnamedesc", "PTM_FIRSTNAME DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalPtmPrefComms", "(PTM_PREF_COMMS) = ?" ) // EQUAL

         .addFilterBy( "notequalPtmPrefComms", "(PTM_PREF_COMMS) != ?" ) // NOTEQUAL

         .addFilterBy( "nullPtmPrefComms",
      "(PTM_PREF_COMMS IS NULL OR LENGTH((PTM_PREF_COMMS)) IS NULL OR LENGTH((PTM_PREF_COMMS)) = 0)" ) // IS NULL

         .addFilterBy( "notnullPtmPrefComms", "PTM_PREF_COMMS IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByPtmPrefCommsMatch", "PTM_PREF_COMMS LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullPtmPrefComms",
      "((PTM_PREF_COMMS) = ? OR PTM_PREF_COMMS IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INPtmPrefComms", "(PTM_PREF_COMMS) IN ( ? )" ) // IN

         .addFilterBy( "NOTINPtmPrefComms",
      "(PTM_PREF_COMMS) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "PtmPrefCommsasc", "PTM_PREF_COMMS ASC" ) // ORDER ASCENDING

         .addOrderBy( "PtmPrefCommsdesc", "PTM_PREF_COMMS DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalPtmAudId", "PTM_AUD_ID = ?" ) // EQUAL

         .addFilterBy( "notequalPtmAudId", "PTM_AUD_ID != ?" ) // NOTEQUAL

         .addFilterBy( "nullPtmAudId", "PTM_AUD_ID IS NULL" ) // IS NULL

         .addFilterBy( "notnullPtmAudId", "PTM_AUD_ID IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanPtmAudId", "PTM_AUD_ID < ?" ) // LESS THAN

         .addFilterBy( "greaterthanPtmAudId", "PTM_AUD_ID > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalPtmAudId", "PTM_AUD_ID <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalPtmAudId", "PTM_AUD_ID >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "filterByPtmAudIdMatch", "PTM_AUD_ID LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "betweenPtmAudId", "PTM_AUD_ID BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullPtmAudId",
      "(PTM_AUD_ID IS NULL OR PTM_AUD_ID = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullPtmAudId",
      "(PTM_AUD_ID IS NULL OR PTM_AUD_ID < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullPtmAudId",
      "(PTM_AUD_ID IS NULL OR PTM_AUD_ID > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INPtmAudId", "PTM_AUD_ID IN ( ? )" ) // IN

         .addFilterBy( "NOTINPtmAudId", "PTM_AUD_ID NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "PtmAudIdasc", "PTM_AUD_ID ASC" ) // ORDER ASCENDING

         .addOrderBy( "PtmAudIddesc", "PTM_AUD_ID DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalPtmAnalysis1", "(PTM_ANALYSIS_1) = ?" ) // EQUAL

         .addFilterBy( "notequalPtmAnalysis1", "(PTM_ANALYSIS_1) != ?" ) // NOTEQUAL

         .addFilterBy( "nullPtmAnalysis1",
      "(PTM_ANALYSIS_1 IS NULL OR LENGTH((PTM_ANALYSIS_1)) IS NULL OR LENGTH((PTM_ANALYSIS_1)) = 0)" ) // IS NULL

         .addFilterBy( "notnullPtmAnalysis1", "PTM_ANALYSIS_1 IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByPtmAnalysis1Match", "PTM_ANALYSIS_1 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullPtmAnalysis1",
      "((PTM_ANALYSIS_1) = ? OR PTM_ANALYSIS_1 IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INPtmAnalysis1", "(PTM_ANALYSIS_1) IN ( ? )" ) // IN

         .addFilterBy( "NOTINPtmAnalysis1",
      "(PTM_ANALYSIS_1) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "PtmAnalysis1asc", "PTM_ANALYSIS_1 ASC" ) // ORDER ASCENDING

         .addOrderBy( "PtmAnalysis1desc", "PTM_ANALYSIS_1 DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalPtmAnalysis2", "(PTM_ANALYSIS_2) = ?" ) // EQUAL

         .addFilterBy( "notequalPtmAnalysis2", "(PTM_ANALYSIS_2) != ?" ) // NOTEQUAL

         .addFilterBy( "nullPtmAnalysis2",
      "(PTM_ANALYSIS_2 IS NULL OR LENGTH((PTM_ANALYSIS_2)) IS NULL OR LENGTH((PTM_ANALYSIS_2)) = 0)" ) // IS NULL

         .addFilterBy( "notnullPtmAnalysis2", "PTM_ANALYSIS_2 IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByPtmAnalysis2Match", "PTM_ANALYSIS_2 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullPtmAnalysis2",
      "((PTM_ANALYSIS_2) = ? OR PTM_ANALYSIS_2 IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INPtmAnalysis2", "(PTM_ANALYSIS_2) IN ( ? )" ) // IN

         .addFilterBy( "NOTINPtmAnalysis2",
      "(PTM_ANALYSIS_2) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "PtmAnalysis2asc", "PTM_ANALYSIS_2 ASC" ) // ORDER ASCENDING

         .addOrderBy( "PtmAnalysis2desc", "PTM_ANALYSIS_2 DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalPtmAnalysis3", "(PTM_ANALYSIS_3) = ?" ) // EQUAL

         .addFilterBy( "notequalPtmAnalysis3", "(PTM_ANALYSIS_3) != ?" ) // NOTEQUAL

         .addFilterBy( "nullPtmAnalysis3",
      "(PTM_ANALYSIS_3 IS NULL OR LENGTH((PTM_ANALYSIS_3)) IS NULL OR LENGTH((PTM_ANALYSIS_3)) = 0)" ) // IS NULL

         .addFilterBy( "notnullPtmAnalysis3", "PTM_ANALYSIS_3 IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByPtmAnalysis3Match", "PTM_ANALYSIS_3 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullPtmAnalysis3",
      "((PTM_ANALYSIS_3) = ? OR PTM_ANALYSIS_3 IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INPtmAnalysis3", "(PTM_ANALYSIS_3) IN ( ? )" ) // IN

         .addFilterBy( "NOTINPtmAnalysis3",
      "(PTM_ANALYSIS_3) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "PtmAnalysis3asc", "PTM_ANALYSIS_3 ASC" ) // ORDER ASCENDING

         .addOrderBy( "PtmAnalysis3desc", "PTM_ANALYSIS_3 DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalPtmAnalysis4", "(PTM_ANALYSIS_4) = ?" ) // EQUAL

         .addFilterBy( "notequalPtmAnalysis4", "(PTM_ANALYSIS_4) != ?" ) // NOTEQUAL

         .addFilterBy( "nullPtmAnalysis4",
      "(PTM_ANALYSIS_4 IS NULL OR LENGTH((PTM_ANALYSIS_4)) IS NULL OR LENGTH((PTM_ANALYSIS_4)) = 0)" ) // IS NULL

         .addFilterBy( "notnullPtmAnalysis4", "PTM_ANALYSIS_4 IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByPtmAnalysis4Match", "PTM_ANALYSIS_4 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullPtmAnalysis4",
      "((PTM_ANALYSIS_4) = ? OR PTM_ANALYSIS_4 IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INPtmAnalysis4", "(PTM_ANALYSIS_4) IN ( ? )" ) // IN

         .addFilterBy( "NOTINPtmAnalysis4",
      "(PTM_ANALYSIS_4) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "PtmAnalysis4asc", "PTM_ANALYSIS_4 ASC" ) // ORDER ASCENDING

         .addOrderBy( "PtmAnalysis4desc", "PTM_ANALYSIS_4 DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalPtmAnalysis5", "(PTM_ANALYSIS_5) = ?" ) // EQUAL

         .addFilterBy( "notequalPtmAnalysis5", "(PTM_ANALYSIS_5) != ?" ) // NOTEQUAL

         .addFilterBy( "nullPtmAnalysis5",
      "(PTM_ANALYSIS_5 IS NULL OR LENGTH((PTM_ANALYSIS_5)) IS NULL OR LENGTH((PTM_ANALYSIS_5)) = 0)" ) // IS NULL

         .addFilterBy( "notnullPtmAnalysis5", "PTM_ANALYSIS_5 IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByPtmAnalysis5Match", "PTM_ANALYSIS_5 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullPtmAnalysis5",
      "((PTM_ANALYSIS_5) = ? OR PTM_ANALYSIS_5 IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INPtmAnalysis5", "(PTM_ANALYSIS_5) IN ( ? )" ) // IN

         .addFilterBy( "NOTINPtmAnalysis5",
      "(PTM_ANALYSIS_5) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "PtmAnalysis5asc", "PTM_ANALYSIS_5 ASC" ) // ORDER ASCENDING

         .addOrderBy( "PtmAnalysis5desc", "PTM_ANALYSIS_5 DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalPtmAnalysis6", "(PTM_ANALYSIS_6) = ?" ) // EQUAL

         .addFilterBy( "notequalPtmAnalysis6", "(PTM_ANALYSIS_6) != ?" ) // NOTEQUAL

         .addFilterBy( "nullPtmAnalysis6",
      "(PTM_ANALYSIS_6 IS NULL OR LENGTH((PTM_ANALYSIS_6)) IS NULL OR LENGTH((PTM_ANALYSIS_6)) = 0)" ) // IS NULL

         .addFilterBy( "notnullPtmAnalysis6", "PTM_ANALYSIS_6 IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByPtmAnalysis6Match", "PTM_ANALYSIS_6 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullPtmAnalysis6",
      "((PTM_ANALYSIS_6) = ? OR PTM_ANALYSIS_6 IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INPtmAnalysis6", "(PTM_ANALYSIS_6) IN ( ? )" ) // IN

         .addFilterBy( "NOTINPtmAnalysis6",
      "(PTM_ANALYSIS_6) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "PtmAnalysis6asc", "PTM_ANALYSIS_6 ASC" ) // ORDER ASCENDING

         .addOrderBy( "PtmAnalysis6desc", "PTM_ANALYSIS_6 DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalPtmAnalysis7", "(PTM_ANALYSIS_7) = ?" ) // EQUAL

         .addFilterBy( "notequalPtmAnalysis7", "(PTM_ANALYSIS_7) != ?" ) // NOTEQUAL

         .addFilterBy( "nullPtmAnalysis7",
      "(PTM_ANALYSIS_7 IS NULL OR LENGTH((PTM_ANALYSIS_7)) IS NULL OR LENGTH((PTM_ANALYSIS_7)) = 0)" ) // IS NULL

         .addFilterBy( "notnullPtmAnalysis7", "PTM_ANALYSIS_7 IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByPtmAnalysis7Match", "PTM_ANALYSIS_7 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullPtmAnalysis7",
      "((PTM_ANALYSIS_7) = ? OR PTM_ANALYSIS_7 IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INPtmAnalysis7", "(PTM_ANALYSIS_7) IN ( ? )" ) // IN

         .addFilterBy( "NOTINPtmAnalysis7",
      "(PTM_ANALYSIS_7) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "PtmAnalysis7asc", "PTM_ANALYSIS_7 ASC" ) // ORDER ASCENDING

         .addOrderBy( "PtmAnalysis7desc", "PTM_ANALYSIS_7 DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalPtmAnalysis8", "(PTM_ANALYSIS_8) = ?" ) // EQUAL

         .addFilterBy( "notequalPtmAnalysis8", "(PTM_ANALYSIS_8) != ?" ) // NOTEQUAL

         .addFilterBy( "nullPtmAnalysis8",
      "(PTM_ANALYSIS_8 IS NULL OR LENGTH((PTM_ANALYSIS_8)) IS NULL OR LENGTH((PTM_ANALYSIS_8)) = 0)" ) // IS NULL

         .addFilterBy( "notnullPtmAnalysis8", "PTM_ANALYSIS_8 IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByPtmAnalysis8Match", "PTM_ANALYSIS_8 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullPtmAnalysis8",
      "((PTM_ANALYSIS_8) = ? OR PTM_ANALYSIS_8 IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INPtmAnalysis8", "(PTM_ANALYSIS_8) IN ( ? )" ) // IN

         .addFilterBy( "NOTINPtmAnalysis8",
      "(PTM_ANALYSIS_8) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "PtmAnalysis8asc", "PTM_ANALYSIS_8 ASC" ) // ORDER ASCENDING

         .addOrderBy( "PtmAnalysis8desc", "PTM_ANALYSIS_8 DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalPtmAnalysis9", "(PTM_ANALYSIS_9) = ?" ) // EQUAL

         .addFilterBy( "notequalPtmAnalysis9", "(PTM_ANALYSIS_9) != ?" ) // NOTEQUAL

         .addFilterBy( "nullPtmAnalysis9",
      "(PTM_ANALYSIS_9 IS NULL OR LENGTH((PTM_ANALYSIS_9)) IS NULL OR LENGTH((PTM_ANALYSIS_9)) = 0)" ) // IS NULL

         .addFilterBy( "notnullPtmAnalysis9", "PTM_ANALYSIS_9 IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByPtmAnalysis9Match", "PTM_ANALYSIS_9 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullPtmAnalysis9",
      "((PTM_ANALYSIS_9) = ? OR PTM_ANALYSIS_9 IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INPtmAnalysis9", "(PTM_ANALYSIS_9) IN ( ? )" ) // IN

         .addFilterBy( "NOTINPtmAnalysis9",
      "(PTM_ANALYSIS_9) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "PtmAnalysis9asc", "PTM_ANALYSIS_9 ASC" ) // ORDER ASCENDING

         .addOrderBy( "PtmAnalysis9desc", "PTM_ANALYSIS_9 DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalPtmAnalysis10", "(PTM_ANALYSIS_10) = ?" ) // EQUAL

         .addFilterBy( "notequalPtmAnalysis10", "(PTM_ANALYSIS_10) != ?" ) // NOTEQUAL

         .addFilterBy( "nullPtmAnalysis10",
      "(PTM_ANALYSIS_10 IS NULL OR LENGTH((PTM_ANALYSIS_10)) IS NULL OR LENGTH((PTM_ANALYSIS_10)) = 0)" ) // IS NULL

         .addFilterBy( "notnullPtmAnalysis10", "PTM_ANALYSIS_10 IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByPtmAnalysis10Match", "PTM_ANALYSIS_10 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullPtmAnalysis10",
      "((PTM_ANALYSIS_10) = ? OR PTM_ANALYSIS_10 IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INPtmAnalysis10", "(PTM_ANALYSIS_10) IN ( ? )" ) // IN

         .addFilterBy( "NOTINPtmAnalysis10",
      "(PTM_ANALYSIS_10) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "PtmAnalysis10asc", "PTM_ANALYSIS_10 ASC" ) // ORDER ASCENDING

         .addOrderBy( "PtmAnalysis10desc", "PTM_ANALYSIS_10 DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalPtmAnalysis11", "(PTM_ANALYSIS_11) = ?" ) // EQUAL

         .addFilterBy( "notequalPtmAnalysis11", "(PTM_ANALYSIS_11) != ?" ) // NOTEQUAL

         .addFilterBy( "nullPtmAnalysis11",
      "(PTM_ANALYSIS_11 IS NULL OR LENGTH((PTM_ANALYSIS_11)) IS NULL OR LENGTH((PTM_ANALYSIS_11)) = 0)" ) // IS NULL

         .addFilterBy( "notnullPtmAnalysis11", "PTM_ANALYSIS_11 IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByPtmAnalysis11Match", "PTM_ANALYSIS_11 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullPtmAnalysis11",
      "((PTM_ANALYSIS_11) = ? OR PTM_ANALYSIS_11 IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INPtmAnalysis11", "(PTM_ANALYSIS_11) IN ( ? )" ) // IN

         .addFilterBy( "NOTINPtmAnalysis11",
      "(PTM_ANALYSIS_11) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "PtmAnalysis11asc", "PTM_ANALYSIS_11 ASC" ) // ORDER ASCENDING

         .addOrderBy( "PtmAnalysis11desc", "PTM_ANALYSIS_11 DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalPtmAnalysis12", "(PTM_ANALYSIS_12) = ?" ) // EQUAL

         .addFilterBy( "notequalPtmAnalysis12", "(PTM_ANALYSIS_12) != ?" ) // NOTEQUAL

         .addFilterBy( "nullPtmAnalysis12",
      "(PTM_ANALYSIS_12 IS NULL OR LENGTH((PTM_ANALYSIS_12)) IS NULL OR LENGTH((PTM_ANALYSIS_12)) = 0)" ) // IS NULL

         .addFilterBy( "notnullPtmAnalysis12", "PTM_ANALYSIS_12 IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByPtmAnalysis12Match", "PTM_ANALYSIS_12 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullPtmAnalysis12",
      "((PTM_ANALYSIS_12) = ? OR PTM_ANALYSIS_12 IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INPtmAnalysis12", "(PTM_ANALYSIS_12) IN ( ? )" ) // IN

         .addFilterBy( "NOTINPtmAnalysis12",
      "(PTM_ANALYSIS_12) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "PtmAnalysis12asc", "PTM_ANALYSIS_12 ASC" ) // ORDER ASCENDING

         .addOrderBy( "PtmAnalysis12desc", "PTM_ANALYSIS_12 DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalPtmAnalysis13", "(PTM_ANALYSIS_13) = ?" ) // EQUAL

         .addFilterBy( "notequalPtmAnalysis13", "(PTM_ANALYSIS_13) != ?" ) // NOTEQUAL

         .addFilterBy( "nullPtmAnalysis13",
      "(PTM_ANALYSIS_13 IS NULL OR LENGTH((PTM_ANALYSIS_13)) IS NULL OR LENGTH((PTM_ANALYSIS_13)) = 0)" ) // IS NULL

         .addFilterBy( "notnullPtmAnalysis13", "PTM_ANALYSIS_13 IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByPtmAnalysis13Match", "PTM_ANALYSIS_13 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullPtmAnalysis13",
      "((PTM_ANALYSIS_13) = ? OR PTM_ANALYSIS_13 IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INPtmAnalysis13", "(PTM_ANALYSIS_13) IN ( ? )" ) // IN

         .addFilterBy( "NOTINPtmAnalysis13",
      "(PTM_ANALYSIS_13) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "PtmAnalysis13asc", "PTM_ANALYSIS_13 ASC" ) // ORDER ASCENDING

         .addOrderBy( "PtmAnalysis13desc", "PTM_ANALYSIS_13 DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalPtmAnalysis14", "(PTM_ANALYSIS_14) = ?" ) // EQUAL

         .addFilterBy( "notequalPtmAnalysis14", "(PTM_ANALYSIS_14) != ?" ) // NOTEQUAL

         .addFilterBy( "nullPtmAnalysis14",
      "(PTM_ANALYSIS_14 IS NULL OR LENGTH((PTM_ANALYSIS_14)) IS NULL OR LENGTH((PTM_ANALYSIS_14)) = 0)" ) // IS NULL

         .addFilterBy( "notnullPtmAnalysis14", "PTM_ANALYSIS_14 IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByPtmAnalysis14Match", "PTM_ANALYSIS_14 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullPtmAnalysis14",
      "((PTM_ANALYSIS_14) = ? OR PTM_ANALYSIS_14 IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INPtmAnalysis14", "(PTM_ANALYSIS_14) IN ( ? )" ) // IN

         .addFilterBy( "NOTINPtmAnalysis14",
      "(PTM_ANALYSIS_14) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "PtmAnalysis14asc", "PTM_ANALYSIS_14 ASC" ) // ORDER ASCENDING

         .addOrderBy( "PtmAnalysis14desc", "PTM_ANALYSIS_14 DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalPtmAnalysis15", "(PTM_ANALYSIS_15) = ?" ) // EQUAL

         .addFilterBy( "notequalPtmAnalysis15", "(PTM_ANALYSIS_15) != ?" ) // NOTEQUAL

         .addFilterBy( "nullPtmAnalysis15",
      "(PTM_ANALYSIS_15 IS NULL OR LENGTH((PTM_ANALYSIS_15)) IS NULL OR LENGTH((PTM_ANALYSIS_15)) = 0)" ) // IS NULL

         .addFilterBy( "notnullPtmAnalysis15", "PTM_ANALYSIS_15 IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByPtmAnalysis15Match", "PTM_ANALYSIS_15 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullPtmAnalysis15",
      "((PTM_ANALYSIS_15) = ? OR PTM_ANALYSIS_15 IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INPtmAnalysis15", "(PTM_ANALYSIS_15) IN ( ? )" ) // IN

         .addFilterBy( "NOTINPtmAnalysis15",
      "(PTM_ANALYSIS_15) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "PtmAnalysis15asc", "PTM_ANALYSIS_15 ASC" ) // ORDER ASCENDING

         .addOrderBy( "PtmAnalysis15desc", "PTM_ANALYSIS_15 DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalPtmAnalysis16", "(PTM_ANALYSIS_16) = ?" ) // EQUAL

         .addFilterBy( "notequalPtmAnalysis16", "(PTM_ANALYSIS_16) != ?" ) // NOTEQUAL

         .addFilterBy( "nullPtmAnalysis16",
      "(PTM_ANALYSIS_16 IS NULL OR LENGTH((PTM_ANALYSIS_16)) IS NULL OR LENGTH((PTM_ANALYSIS_16)) = 0)" ) // IS NULL

         .addFilterBy( "notnullPtmAnalysis16", "PTM_ANALYSIS_16 IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByPtmAnalysis16Match", "PTM_ANALYSIS_16 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullPtmAnalysis16",
      "((PTM_ANALYSIS_16) = ? OR PTM_ANALYSIS_16 IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INPtmAnalysis16", "(PTM_ANALYSIS_16) IN ( ? )" ) // IN

         .addFilterBy( "NOTINPtmAnalysis16",
      "(PTM_ANALYSIS_16) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "PtmAnalysis16asc", "PTM_ANALYSIS_16 ASC" ) // ORDER ASCENDING

         .addOrderBy( "PtmAnalysis16desc", "PTM_ANALYSIS_16 DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalPtmAnalysis17", "(PTM_ANALYSIS_17) = ?" ) // EQUAL

         .addFilterBy( "notequalPtmAnalysis17", "(PTM_ANALYSIS_17) != ?" ) // NOTEQUAL

         .addFilterBy( "nullPtmAnalysis17",
      "(PTM_ANALYSIS_17 IS NULL OR LENGTH((PTM_ANALYSIS_17)) IS NULL OR LENGTH((PTM_ANALYSIS_17)) = 0)" ) // IS NULL

         .addFilterBy( "notnullPtmAnalysis17", "PTM_ANALYSIS_17 IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByPtmAnalysis17Match", "PTM_ANALYSIS_17 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullPtmAnalysis17",
      "((PTM_ANALYSIS_17) = ? OR PTM_ANALYSIS_17 IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INPtmAnalysis17", "(PTM_ANALYSIS_17) IN ( ? )" ) // IN

         .addFilterBy( "NOTINPtmAnalysis17",
      "(PTM_ANALYSIS_17) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "PtmAnalysis17asc", "PTM_ANALYSIS_17 ASC" ) // ORDER ASCENDING

         .addOrderBy( "PtmAnalysis17desc", "PTM_ANALYSIS_17 DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalPtmAnalysis18", "(PTM_ANALYSIS_18) = ?" ) // EQUAL

         .addFilterBy( "notequalPtmAnalysis18", "(PTM_ANALYSIS_18) != ?" ) // NOTEQUAL

         .addFilterBy( "nullPtmAnalysis18",
      "(PTM_ANALYSIS_18 IS NULL OR LENGTH((PTM_ANALYSIS_18)) IS NULL OR LENGTH((PTM_ANALYSIS_18)) = 0)" ) // IS NULL

         .addFilterBy( "notnullPtmAnalysis18", "PTM_ANALYSIS_18 IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByPtmAnalysis18Match", "PTM_ANALYSIS_18 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullPtmAnalysis18",
      "((PTM_ANALYSIS_18) = ? OR PTM_ANALYSIS_18 IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INPtmAnalysis18", "(PTM_ANALYSIS_18) IN ( ? )" ) // IN

         .addFilterBy( "NOTINPtmAnalysis18",
      "(PTM_ANALYSIS_18) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "PtmAnalysis18asc", "PTM_ANALYSIS_18 ASC" ) // ORDER ASCENDING

         .addOrderBy( "PtmAnalysis18desc", "PTM_ANALYSIS_18 DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalPtmAnalysis19", "(PTM_ANALYSIS_19) = ?" ) // EQUAL

         .addFilterBy( "notequalPtmAnalysis19", "(PTM_ANALYSIS_19) != ?" ) // NOTEQUAL

         .addFilterBy( "nullPtmAnalysis19",
      "(PTM_ANALYSIS_19 IS NULL OR LENGTH((PTM_ANALYSIS_19)) IS NULL OR LENGTH((PTM_ANALYSIS_19)) = 0)" ) // IS NULL

         .addFilterBy( "notnullPtmAnalysis19", "PTM_ANALYSIS_19 IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByPtmAnalysis19Match", "PTM_ANALYSIS_19 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullPtmAnalysis19",
      "((PTM_ANALYSIS_19) = ? OR PTM_ANALYSIS_19 IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INPtmAnalysis19", "(PTM_ANALYSIS_19) IN ( ? )" ) // IN

         .addFilterBy( "NOTINPtmAnalysis19",
      "(PTM_ANALYSIS_19) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "PtmAnalysis19asc", "PTM_ANALYSIS_19 ASC" ) // ORDER ASCENDING

         .addOrderBy( "PtmAnalysis19desc", "PTM_ANALYSIS_19 DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalPtmAnalysis20", "(PTM_ANALYSIS_20) = ?" ) // EQUAL

         .addFilterBy( "notequalPtmAnalysis20", "(PTM_ANALYSIS_20) != ?" ) // NOTEQUAL

         .addFilterBy( "nullPtmAnalysis20",
      "(PTM_ANALYSIS_20 IS NULL OR LENGTH((PTM_ANALYSIS_20)) IS NULL OR LENGTH((PTM_ANALYSIS_20)) = 0)" ) // IS NULL

         .addFilterBy( "notnullPtmAnalysis20", "PTM_ANALYSIS_20 IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByPtmAnalysis20Match", "PTM_ANALYSIS_20 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullPtmAnalysis20",
      "((PTM_ANALYSIS_20) = ? OR PTM_ANALYSIS_20 IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INPtmAnalysis20", "(PTM_ANALYSIS_20) IN ( ? )" ) // IN

         .addFilterBy( "NOTINPtmAnalysis20",
      "(PTM_ANALYSIS_20) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "PtmAnalysis20asc", "PTM_ANALYSIS_20 ASC" ) // ORDER ASCENDING

         .addOrderBy( "PtmAnalysis20desc", "PTM_ANALYSIS_20 DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalPtmAnalysis21", "(PTM_ANALYSIS_21) = ?" ) // EQUAL

         .addFilterBy( "notequalPtmAnalysis21", "(PTM_ANALYSIS_21) != ?" ) // NOTEQUAL

         .addFilterBy( "nullPtmAnalysis21",
      "(PTM_ANALYSIS_21 IS NULL OR LENGTH((PTM_ANALYSIS_21)) IS NULL OR LENGTH((PTM_ANALYSIS_21)) = 0)" ) // IS NULL

         .addFilterBy( "notnullPtmAnalysis21", "PTM_ANALYSIS_21 IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByPtmAnalysis21Match", "PTM_ANALYSIS_21 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullPtmAnalysis21",
      "((PTM_ANALYSIS_21) = ? OR PTM_ANALYSIS_21 IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INPtmAnalysis21", "(PTM_ANALYSIS_21) IN ( ? )" ) // IN

         .addFilterBy( "NOTINPtmAnalysis21",
      "(PTM_ANALYSIS_21) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "PtmAnalysis21asc", "PTM_ANALYSIS_21 ASC" ) // ORDER ASCENDING

         .addOrderBy( "PtmAnalysis21desc", "PTM_ANALYSIS_21 DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalPtmAnalysis22", "(PTM_ANALYSIS_22) = ?" ) // EQUAL

         .addFilterBy( "notequalPtmAnalysis22", "(PTM_ANALYSIS_22) != ?" ) // NOTEQUAL

         .addFilterBy( "nullPtmAnalysis22",
      "(PTM_ANALYSIS_22 IS NULL OR LENGTH((PTM_ANALYSIS_22)) IS NULL OR LENGTH((PTM_ANALYSIS_22)) = 0)" ) // IS NULL

         .addFilterBy( "notnullPtmAnalysis22", "PTM_ANALYSIS_22 IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByPtmAnalysis22Match", "PTM_ANALYSIS_22 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullPtmAnalysis22",
      "((PTM_ANALYSIS_22) = ? OR PTM_ANALYSIS_22 IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INPtmAnalysis22", "(PTM_ANALYSIS_22) IN ( ? )" ) // IN

         .addFilterBy( "NOTINPtmAnalysis22",
      "(PTM_ANALYSIS_22) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "PtmAnalysis22asc", "PTM_ANALYSIS_22 ASC" ) // ORDER ASCENDING

         .addOrderBy( "PtmAnalysis22desc", "PTM_ANALYSIS_22 DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalPtmAnalysis23", "(PTM_ANALYSIS_23) = ?" ) // EQUAL

         .addFilterBy( "notequalPtmAnalysis23", "(PTM_ANALYSIS_23) != ?" ) // NOTEQUAL

         .addFilterBy( "nullPtmAnalysis23",
      "(PTM_ANALYSIS_23 IS NULL OR LENGTH((PTM_ANALYSIS_23)) IS NULL OR LENGTH((PTM_ANALYSIS_23)) = 0)" ) // IS NULL

         .addFilterBy( "notnullPtmAnalysis23", "PTM_ANALYSIS_23 IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByPtmAnalysis23Match", "PTM_ANALYSIS_23 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullPtmAnalysis23",
      "((PTM_ANALYSIS_23) = ? OR PTM_ANALYSIS_23 IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INPtmAnalysis23", "(PTM_ANALYSIS_23) IN ( ? )" ) // IN

         .addFilterBy( "NOTINPtmAnalysis23",
      "(PTM_ANALYSIS_23) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "PtmAnalysis23asc", "PTM_ANALYSIS_23 ASC" ) // ORDER ASCENDING

         .addOrderBy( "PtmAnalysis23desc", "PTM_ANALYSIS_23 DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalPtmAnalysis24", "(PTM_ANALYSIS_24) = ?" ) // EQUAL

         .addFilterBy( "notequalPtmAnalysis24", "(PTM_ANALYSIS_24) != ?" ) // NOTEQUAL

         .addFilterBy( "nullPtmAnalysis24",
      "(PTM_ANALYSIS_24 IS NULL OR LENGTH((PTM_ANALYSIS_24)) IS NULL OR LENGTH((PTM_ANALYSIS_24)) = 0)" ) // IS NULL

         .addFilterBy( "notnullPtmAnalysis24", "PTM_ANALYSIS_24 IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByPtmAnalysis24Match", "PTM_ANALYSIS_24 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullPtmAnalysis24",
      "((PTM_ANALYSIS_24) = ? OR PTM_ANALYSIS_24 IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INPtmAnalysis24", "(PTM_ANALYSIS_24) IN ( ? )" ) // IN

         .addFilterBy( "NOTINPtmAnalysis24",
      "(PTM_ANALYSIS_24) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "PtmAnalysis24asc", "PTM_ANALYSIS_24 ASC" ) // ORDER ASCENDING

         .addOrderBy( "PtmAnalysis24desc", "PTM_ANALYSIS_24 DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalPtmAnalysis25", "(PTM_ANALYSIS_25) = ?" ) // EQUAL

         .addFilterBy( "notequalPtmAnalysis25", "(PTM_ANALYSIS_25) != ?" ) // NOTEQUAL

         .addFilterBy( "nullPtmAnalysis25",
      "(PTM_ANALYSIS_25 IS NULL OR LENGTH((PTM_ANALYSIS_25)) IS NULL OR LENGTH((PTM_ANALYSIS_25)) = 0)" ) // IS NULL

         .addFilterBy( "notnullPtmAnalysis25", "PTM_ANALYSIS_25 IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByPtmAnalysis25Match", "PTM_ANALYSIS_25 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullPtmAnalysis25",
      "((PTM_ANALYSIS_25) = ? OR PTM_ANALYSIS_25 IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INPtmAnalysis25", "(PTM_ANALYSIS_25) IN ( ? )" ) // IN

         .addFilterBy( "NOTINPtmAnalysis25",
      "(PTM_ANALYSIS_25) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "PtmAnalysis25asc", "PTM_ANALYSIS_25 ASC" ) // ORDER ASCENDING

         .addOrderBy( "PtmAnalysis25desc", "PTM_ANALYSIS_25 DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalPtmAnalysis26", "(PTM_ANALYSIS_26) = ?" ) // EQUAL

         .addFilterBy( "notequalPtmAnalysis26", "(PTM_ANALYSIS_26) != ?" ) // NOTEQUAL

         .addFilterBy( "nullPtmAnalysis26",
      "(PTM_ANALYSIS_26 IS NULL OR LENGTH((PTM_ANALYSIS_26)) IS NULL OR LENGTH((PTM_ANALYSIS_26)) = 0)" ) // IS NULL

         .addFilterBy( "notnullPtmAnalysis26", "PTM_ANALYSIS_26 IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByPtmAnalysis26Match", "PTM_ANALYSIS_26 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullPtmAnalysis26",
      "((PTM_ANALYSIS_26) = ? OR PTM_ANALYSIS_26 IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INPtmAnalysis26", "(PTM_ANALYSIS_26) IN ( ? )" ) // IN

         .addFilterBy( "NOTINPtmAnalysis26",
      "(PTM_ANALYSIS_26) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "PtmAnalysis26asc", "PTM_ANALYSIS_26 ASC" ) // ORDER ASCENDING

         .addOrderBy( "PtmAnalysis26desc", "PTM_ANALYSIS_26 DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalPtmAnalysis27", "(PTM_ANALYSIS_27) = ?" ) // EQUAL

         .addFilterBy( "notequalPtmAnalysis27", "(PTM_ANALYSIS_27) != ?" ) // NOTEQUAL

         .addFilterBy( "nullPtmAnalysis27",
      "(PTM_ANALYSIS_27 IS NULL OR LENGTH((PTM_ANALYSIS_27)) IS NULL OR LENGTH((PTM_ANALYSIS_27)) = 0)" ) // IS NULL

         .addFilterBy( "notnullPtmAnalysis27", "PTM_ANALYSIS_27 IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByPtmAnalysis27Match", "PTM_ANALYSIS_27 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullPtmAnalysis27",
      "((PTM_ANALYSIS_27) = ? OR PTM_ANALYSIS_27 IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INPtmAnalysis27", "(PTM_ANALYSIS_27) IN ( ? )" ) // IN

         .addFilterBy( "NOTINPtmAnalysis27",
      "(PTM_ANALYSIS_27) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "PtmAnalysis27asc", "PTM_ANALYSIS_27 ASC" ) // ORDER ASCENDING

         .addOrderBy( "PtmAnalysis27desc", "PTM_ANALYSIS_27 DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalPtmAnalysis28", "(PTM_ANALYSIS_28) = ?" ) // EQUAL

         .addFilterBy( "notequalPtmAnalysis28", "(PTM_ANALYSIS_28) != ?" ) // NOTEQUAL

         .addFilterBy( "nullPtmAnalysis28",
      "(PTM_ANALYSIS_28 IS NULL OR LENGTH((PTM_ANALYSIS_28)) IS NULL OR LENGTH((PTM_ANALYSIS_28)) = 0)" ) // IS NULL

         .addFilterBy( "notnullPtmAnalysis28", "PTM_ANALYSIS_28 IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByPtmAnalysis28Match", "PTM_ANALYSIS_28 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullPtmAnalysis28",
      "((PTM_ANALYSIS_28) = ? OR PTM_ANALYSIS_28 IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INPtmAnalysis28", "(PTM_ANALYSIS_28) IN ( ? )" ) // IN

         .addFilterBy( "NOTINPtmAnalysis28",
      "(PTM_ANALYSIS_28) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "PtmAnalysis28asc", "PTM_ANALYSIS_28 ASC" ) // ORDER ASCENDING

         .addOrderBy( "PtmAnalysis28desc", "PTM_ANALYSIS_28 DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalPtmAnalysis29", "(PTM_ANALYSIS_29) = ?" ) // EQUAL

         .addFilterBy( "notequalPtmAnalysis29", "(PTM_ANALYSIS_29) != ?" ) // NOTEQUAL

         .addFilterBy( "nullPtmAnalysis29",
      "(PTM_ANALYSIS_29 IS NULL OR LENGTH((PTM_ANALYSIS_29)) IS NULL OR LENGTH((PTM_ANALYSIS_29)) = 0)" ) // IS NULL

         .addFilterBy( "notnullPtmAnalysis29", "PTM_ANALYSIS_29 IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByPtmAnalysis29Match", "PTM_ANALYSIS_29 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullPtmAnalysis29",
      "((PTM_ANALYSIS_29) = ? OR PTM_ANALYSIS_29 IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INPtmAnalysis29", "(PTM_ANALYSIS_29) IN ( ? )" ) // IN

         .addFilterBy( "NOTINPtmAnalysis29",
      "(PTM_ANALYSIS_29) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "PtmAnalysis29asc", "PTM_ANALYSIS_29 ASC" ) // ORDER ASCENDING

         .addOrderBy( "PtmAnalysis29desc", "PTM_ANALYSIS_29 DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalPtmAnalysis30", "(PTM_ANALYSIS_30) = ?" ) // EQUAL

         .addFilterBy( "notequalPtmAnalysis30", "(PTM_ANALYSIS_30) != ?" ) // NOTEQUAL

         .addFilterBy( "nullPtmAnalysis30",
      "(PTM_ANALYSIS_30 IS NULL OR LENGTH((PTM_ANALYSIS_30)) IS NULL OR LENGTH((PTM_ANALYSIS_30)) = 0)" ) // IS NULL

         .addFilterBy( "notnullPtmAnalysis30", "PTM_ANALYSIS_30 IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByPtmAnalysis30Match", "PTM_ANALYSIS_30 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullPtmAnalysis30",
      "((PTM_ANALYSIS_30) = ? OR PTM_ANALYSIS_30 IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INPtmAnalysis30", "(PTM_ANALYSIS_30) IN ( ? )" ) // IN

         .addFilterBy( "NOTINPtmAnalysis30",
      "(PTM_ANALYSIS_30) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "PtmAnalysis30asc", "PTM_ANALYSIS_30 ASC" ) // ORDER ASCENDING

         .addOrderBy( "PtmAnalysis30desc", "PTM_ANALYSIS_30 DESC" ) // ORDER DESCENDING
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
      dml = new PtmPermToMarketDMLFactory(  );
    }

    return dml;
  }
}
