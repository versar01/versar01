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
 * This is the DMLFactory for AuxCustomers.
 *
 * @version $Revision: 1.1 $
 * @author $Author$
 * @since $jdk$
 */
public class AuxCustomersAbstractDMLFactory
  extends BaseDMLFactory {
  //~ Static variables/initializers //////////////////////////////////////////

  /** The DMLFactory singleton */
  private static DMLFactory dml = null;

  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new AuxCustomersAbstractDMLFactory object.
   *
   * @throws DMLException DOCUMENT ME!
   */
  protected AuxCustomersAbstractDMLFactory(  )
    throws DMLException {
    ;

    DMLTable table = defTable( "AuxCustomers", // dmlName
        "blo.AuxCustomersDMO", // dmoName
        "AUX_CUSTOMERS", // tableName
        83, // numColumns
        "AUX_TITLE, AUX_FIRSTNAME, AUX_INVOICE_ADDRID, BANK_NAME, BANK_ADDR1, BANK_ADDR2, BANK_AC_NAME, REF, BANK_SCODE"
        + ", BANK_AC_NO, BANK_AC_TYPE, BANK_PAY_TYPE, AUX_PREF_DEBIT_DAY, BILL_AC_NO, PROTECT_CODE, HANDSET_CT, BANK_DATE, CONF_DATE"
        + ", AUX_COMMENT, DATE_OF_BIRTH, REF_PAY_DATE, AC_CLOS_DATE, NO_REAS_DATE, REM_LET_DATE, AC_TRAN_DATE, NO_AC_DATE, SR_FLAG"
        + ", PROCESSED, PACKAGE_CODE, AUX_ACCOUNT_TYPE, AUX_BILL_CYCLE, CREDIT_CARD_NO, CREDIT_CARD_NAME, EXPIRY_DATE, AUX_CARD_CVV_NO, CREDIT_SCORE"
        + ", SERV_PROV_ID, DEALER_ID, SALESMAN, ID_NUMBER, ACC_STATUS, COMP_REG_NO, STATIONARY_TYPE, MAX_NO_SUBS, AUX_CURRENCY"
        + ", AUX_COUNTRY_CODE, AUX_GENDER, AUX_SUB_GRP_ACC_NO, AUX_PREPAID_STAT, AUX_CREDIT_CLASS, AUX_AUTO_LIMIT_IND, AUX_LMT_UP_VAL, AUX_LMT_DN_VAL"
        + ", AUX_ANALYSIS_1, AUX_ANALYSIS_2, AUX_ANALYSIS_3, AUX_ANALYSIS_4, AUX_ANALYSIS_5, AUX_ANALYSIS_6, AUX_ANALYSIS_7"
        + ", AUX_ANALYSIS_8, AUX_ANALYSIS_9, AUX_ANALYSIS_10, AUX_ANALYSIS_11, AUX_ANALYSIS_12, AUX_ANALYSIS_13, AUX_ANALYSIS_14, AUX_ANALYSIS_15, AUX_ANALYSIS_16"
        + ", AUX_ANALYSIS_17, AUX_ANALYSIS_18, AUX_ANALYSIS_19, AUX_ANALYSIS_20, AUX_ANALYSIS_21, AUX_ANALYSIS_22, AUX_ANALYSIS_23, AUX_ANALYSIS_24, AUX_ANALYSIS_25"
        + ", AUX_ANALYSIS_26, AUX_ANALYSIS_27, AUX_ANALYSIS_28, AUX_ANALYSIS_29, AUX_ANALYSIS_30", // columnList
        "(BILL_AC_NO)", //primaryKey
        "" // versionCol     
      , false, // generatedKey
        "AUX_TITLE, AUX_FIRSTNAME, AUX_INVOICE_ADDRID, BANK_NAME, BANK_ADDR1, BANK_ADDR2, BANK_AC_NAME, REF, BANK_SCODE"
        + ", BANK_AC_NO, BANK_AC_TYPE, BANK_PAY_TYPE, AUX_PREF_DEBIT_DAY, BILL_AC_NO, PROTECT_CODE, HANDSET_CT, BANK_DATE, CONF_DATE"
        + ", AUX_COMMENT, DATE_OF_BIRTH, REF_PAY_DATE, AC_CLOS_DATE, NO_REAS_DATE, REM_LET_DATE, AC_TRAN_DATE, NO_AC_DATE, SR_FLAG"
        + ", PROCESSED, PACKAGE_CODE, AUX_ACCOUNT_TYPE, AUX_BILL_CYCLE, CREDIT_CARD_NO, CREDIT_CARD_NAME, EXPIRY_DATE, AUX_CARD_CVV_NO, CREDIT_SCORE"
        + ", SERV_PROV_ID, DEALER_ID, SALESMAN, ID_NUMBER, ACC_STATUS, COMP_REG_NO, STATIONARY_TYPE, MAX_NO_SUBS, AUX_CURRENCY"
        + ", AUX_COUNTRY_CODE, AUX_GENDER, AUX_SUB_GRP_ACC_NO, AUX_PREPAID_STAT, AUX_CREDIT_CLASS, AUX_AUTO_LIMIT_IND, AUX_LMT_UP_VAL, AUX_LMT_DN_VAL"
        + ", AUX_ANALYSIS_1, AUX_ANALYSIS_2, AUX_ANALYSIS_3, AUX_ANALYSIS_4, AUX_ANALYSIS_5, AUX_ANALYSIS_6, AUX_ANALYSIS_7"
        + ", AUX_ANALYSIS_8, AUX_ANALYSIS_9, AUX_ANALYSIS_10, AUX_ANALYSIS_11, AUX_ANALYSIS_12, AUX_ANALYSIS_13, AUX_ANALYSIS_14, AUX_ANALYSIS_15, AUX_ANALYSIS_16"
        + ", AUX_ANALYSIS_17, AUX_ANALYSIS_18, AUX_ANALYSIS_19, AUX_ANALYSIS_20, AUX_ANALYSIS_21, AUX_ANALYSIS_22, AUX_ANALYSIS_23, AUX_ANALYSIS_24, AUX_ANALYSIS_25"
        + ", AUX_ANALYSIS_26, AUX_ANALYSIS_27, AUX_ANALYSIS_28, AUX_ANALYSIS_29, AUX_ANALYSIS_30",
        "", "",
        new String[] {
          "AUX_TITLE", "AUX_FIRSTNAME", "AUX_INVOICE_ADDRID", "BANK_NAME",
          "BANK_ADDR1", "BANK_ADDR2", "BANK_AC_NAME", "REF", "BANK_SCODE",
          "BANK_AC_NO", "BANK_AC_TYPE", "BANK_PAY_TYPE", "AUX_PREF_DEBIT_DAY",
          "BILL_AC_NO", "PROTECT_CODE", "HANDSET_CT", "BANK_DATE", "CONF_DATE",
          "AUX_COMMENT", "DATE_OF_BIRTH", "REF_PAY_DATE", "AC_CLOS_DATE",
          "NO_REAS_DATE", "REM_LET_DATE", "AC_TRAN_DATE", "NO_AC_DATE",
          "SR_FLAG", "PROCESSED", "PACKAGE_CODE", "AUX_ACCOUNT_TYPE",
          "AUX_BILL_CYCLE", "CREDIT_CARD_NO", "CREDIT_CARD_NAME",
          "EXPIRY_DATE", "AUX_CARD_CVV_NO", "CREDIT_SCORE", "SERV_PROV_ID",
          "DEALER_ID", "SALESMAN", "ID_NUMBER", "ACC_STATUS", "COMP_REG_NO",
          "STATIONARY_TYPE", "MAX_NO_SUBS", "AUX_CURRENCY", "AUX_COUNTRY_CODE",
          "AUX_GENDER", "AUX_SUB_GRP_ACC_NO", "AUX_PREPAID_STAT",
          "AUX_CREDIT_CLASS", "AUX_AUTO_LIMIT_IND", "AUX_LMT_UP_VAL",
          "AUX_LMT_DN_VAL", 
          "AUX_ANALYSIS_1", "AUX_ANALYSIS_2", "AUX_ANALYSIS_3",
          "AUX_ANALYSIS_4", "AUX_ANALYSIS_5", "AUX_ANALYSIS_6",
          "AUX_ANALYSIS_7", "AUX_ANALYSIS_8", "AUX_ANALYSIS_9",
          "AUX_ANALYSIS_10", "AUX_ANALYSIS_11", "AUX_ANALYSIS_12",
          "AUX_ANALYSIS_13", "AUX_ANALYSIS_14", "AUX_ANALYSIS_15",
          "AUX_ANALYSIS_16", "AUX_ANALYSIS_17", "AUX_ANALYSIS_18",
          "AUX_ANALYSIS_19", "AUX_ANALYSIS_20", "AUX_ANALYSIS_21",
          "AUX_ANALYSIS_22", "AUX_ANALYSIS_23", "AUX_ANALYSIS_24",
          "AUX_ANALYSIS_25", "AUX_ANALYSIS_26", "AUX_ANALYSIS_27",
          "AUX_ANALYSIS_28", "AUX_ANALYSIS_29", "AUX_ANALYSIS_30"
        } );

    table.addFilterBy( "equalBillAcNo", /* PK attribute */
      "(BILL_AC_NO) = ?" )
         .addFilterBy( "filterByBillAcNoMatch", "BILL_AC_NO LIKE ?" )
         .addFilterBy( "INBillAcNo", "BILL_AC_NO IN ( ? )" ) // IN

         .addFilterBy( "NOTINBillAcNo", "BILL_AC_NO NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "BillAcNoasc", "BILL_AC_NO ASC" ) // ORDER ASCENDING

         .addOrderBy( "BillAcNodesc", "BILL_AC_NO DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalAuxTitle", "(AUX_TITLE) = ?" ) // EQUAL

         .addFilterBy( "notequalAuxTitle", "(AUX_TITLE) != ?" ) // NOTEQUAL

         .addFilterBy( "nullAuxTitle",
      "(AUX_TITLE IS NULL OR LENGTH((AUX_TITLE)) = 0)" ) // IS NULL

         .addFilterBy( "notnullAuxTitle", "AUX_TITLE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByAuxTitleMatch", "AUX_TITLE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullAuxTitle",
      "((AUX_TITLE) = ? OR AUX_TITLE IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INAuxTitle", "AUX_TITLE IN ( ? )" ) // IN

         .addFilterBy( "NOTINAuxTitle", "AUX_TITLE NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "AuxTitleasc", "AUX_TITLE ASC" ) // ORDER ASCENDING

         .addOrderBy( "AuxTitledesc", "AUX_TITLE DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalAuxFirstname", "(AUX_FIRSTNAME) = ?" ) // EQUAL

         .addFilterBy( "notequalAuxFirstname", "(AUX_FIRSTNAME) != ?" ) // NOTEQUAL

         .addFilterBy( "nullAuxFirstname",
      "(AUX_FIRSTNAME IS NULL OR LENGTH((AUX_FIRSTNAME)) = 0)" ) // IS NULL

         .addFilterBy( "notnullAuxFirstname", "AUX_FIRSTNAME IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByAuxFirstnameMatch", "AUX_FIRSTNAME LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullAuxFirstname",
      "((AUX_FIRSTNAME) = ? OR AUX_FIRSTNAME IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INAuxFirstname", "AUX_FIRSTNAME IN ( ? )" ) // IN

         .addFilterBy( "NOTINAuxFirstname", "AUX_FIRSTNAME NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "AuxFirstnameasc", "AUX_FIRSTNAME ASC" ) // ORDER ASCENDING

         .addOrderBy( "AuxFirstnamedesc", "AUX_FIRSTNAME DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalAuxInvoiceAddrid", "AUX_INVOICE_ADDRID = ?" ) // EQUAL

         .addFilterBy( "notequalAuxInvoiceAddrid", "AUX_INVOICE_ADDRID != ?" ) // NOTEQUAL

         .addFilterBy( "nullAuxInvoiceAddrid", "AUX_INVOICE_ADDRID IS NULL" ) // IS NULL

         .addFilterBy( "notnullAuxInvoiceAddrid",
      "AUX_INVOICE_ADDRID IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanAuxInvoiceAddrid", "AUX_INVOICE_ADDRID < ?" ) // LESS THAN

         .addFilterBy( "greaterthanAuxInvoiceAddrid", "AUX_INVOICE_ADDRID > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalAuxInvoiceAddrid",
      "AUX_INVOICE_ADDRID <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalAuxInvoiceAddrid",
      "AUX_INVOICE_ADDRID >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "betweenAuxInvoiceAddrid",
      "AUX_INVOICE_ADDRID BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullAuxInvoiceAddrid",
      "(AUX_INVOICE_ADDRID IS NULL OR AUX_INVOICE_ADDRID = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullAuxInvoiceAddrid",
      "(AUX_INVOICE_ADDRID IS NULL OR AUX_INVOICE_ADDRID < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullAuxInvoiceAddrid",
      "(AUX_INVOICE_ADDRID IS NULL OR AUX_INVOICE_ADDRID > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INAuxInvoiceAddrid", "AUX_INVOICE_ADDRID IN ( ? )" ) // IN

         .addFilterBy( "NOTINAuxInvoiceAddrid",
      "AUX_INVOICE_ADDRID NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "AuxInvoiceAddridasc", "AUX_INVOICE_ADDRID ASC" ) // ORDER ASCENDING

         .addOrderBy( "AuxInvoiceAddriddesc", "AUX_INVOICE_ADDRID DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalBankName", "(BANK_NAME) = ?" ) // EQUAL

         .addFilterBy( "notequalBankName", "(BANK_NAME) != ?" ) // NOTEQUAL

         .addFilterBy( "nullBankName",
      "(BANK_NAME IS NULL OR LENGTH((BANK_NAME)) = 0)" ) // IS NULL

         .addFilterBy( "notnullBankName", "BANK_NAME IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByBankNameMatch", "BANK_NAME LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullBankName",
      "((BANK_NAME) = ? OR BANK_NAME IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INBankName", "BANK_NAME IN ( ? )" ) // IN

         .addFilterBy( "NOTINBankName", "BANK_NAME NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "BankNameasc", "BANK_NAME ASC" ) // ORDER ASCENDING

         .addOrderBy( "BankNamedesc", "BANK_NAME DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalBankAddr1", "(BANK_ADDR1) = ?" ) // EQUAL

         .addFilterBy( "notequalBankAddr1", "(BANK_ADDR1) != ?" ) // NOTEQUAL

         .addFilterBy( "nullBankAddr1",
      "(BANK_ADDR1 IS NULL OR LENGTH((BANK_ADDR1)) = 0)" ) // IS NULL

         .addFilterBy( "notnullBankAddr1", "BANK_ADDR1 IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByBankAddr1Match", "BANK_ADDR1 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullBankAddr1",
      "((BANK_ADDR1) = ? OR BANK_ADDR1 IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INBankAddr1", "BANK_ADDR1 IN ( ? )" ) // IN

         .addFilterBy( "NOTINBankAddr1", "BANK_ADDR1 NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "BankAddr1asc", "BANK_ADDR1 ASC" ) // ORDER ASCENDING

         .addOrderBy( "BankAddr1desc", "BANK_ADDR1 DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalBankAddr2", "(BANK_ADDR2) = ?" ) // EQUAL

         .addFilterBy( "notequalBankAddr2", "(BANK_ADDR2) != ?" ) // NOTEQUAL

         .addFilterBy( "nullBankAddr2",
      "(BANK_ADDR2 IS NULL OR LENGTH((BANK_ADDR2)) = 0)" ) // IS NULL

         .addFilterBy( "notnullBankAddr2", "BANK_ADDR2 IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByBankAddr2Match", "BANK_ADDR2 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullBankAddr2",
      "((BANK_ADDR2) = ? OR BANK_ADDR2 IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INBankAddr2", "BANK_ADDR2 IN ( ? )" ) // IN

         .addFilterBy( "NOTINBankAddr2", "BANK_ADDR2 NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "BankAddr2asc", "BANK_ADDR2 ASC" ) // ORDER ASCENDING

         .addOrderBy( "BankAddr2desc", "BANK_ADDR2 DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalBankAcName", "(BANK_AC_NAME) = ?" ) // EQUAL

         .addFilterBy( "notequalBankAcName", "(BANK_AC_NAME) != ?" ) // NOTEQUAL

         .addFilterBy( "nullBankAcName",
      "(BANK_AC_NAME IS NULL OR LENGTH((BANK_AC_NAME)) = 0)" ) // IS NULL

         .addFilterBy( "notnullBankAcName", "BANK_AC_NAME IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByBankAcNameMatch", "BANK_AC_NAME LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullBankAcName",
      "((BANK_AC_NAME) = ? OR BANK_AC_NAME IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INBankAcName", "BANK_AC_NAME IN ( ? )" ) // IN

         .addFilterBy( "NOTINBankAcName", "BANK_AC_NAME NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "BankAcNameasc", "BANK_AC_NAME ASC" ) // ORDER ASCENDING

         .addOrderBy( "BankAcNamedesc", "BANK_AC_NAME DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalRef", "(REF) = ?" ) // EQUAL

         .addFilterBy( "notequalRef", "(REF) != ?" ) // NOTEQUAL

         .addFilterBy( "nullRef", "(REF IS NULL OR LENGTH((REF)) = 0)" ) // IS NULL

         .addFilterBy( "notnullRef", "REF IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByRefMatch", "REF LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullRef", "((REF) = ? OR REF IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INRef", "REF IN ( ? )" ) // IN

         .addFilterBy( "NOTINRef", "REF NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "Refasc", "REF ASC" ) // ORDER ASCENDING

         .addOrderBy( "Refdesc", "REF DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalBankScode", "(BANK_SCODE) = ?" ) // EQUAL

         .addFilterBy( "notequalBankScode", "(BANK_SCODE) != ?" ) // NOTEQUAL

         .addFilterBy( "nullBankScode",
      "(BANK_SCODE IS NULL OR LENGTH((BANK_SCODE)) = 0)" ) // IS NULL

         .addFilterBy( "notnullBankScode", "BANK_SCODE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByBankScodeMatch", "BANK_SCODE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullBankScode",
      "((BANK_SCODE) = ? OR BANK_SCODE IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INBankScode", "BANK_SCODE IN ( ? )" ) // IN

         .addFilterBy( "NOTINBankScode", "BANK_SCODE NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "BankScodeasc", "BANK_SCODE ASC" ) // ORDER ASCENDING

         .addOrderBy( "BankScodedesc", "BANK_SCODE DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalBankAcNo", "(BANK_AC_NO) = ?" ) // EQUAL

         .addFilterBy( "notequalBankAcNo", "(BANK_AC_NO) != ?" ) // NOTEQUAL

         .addFilterBy( "nullBankAcNo",
      "(BANK_AC_NO IS NULL OR LENGTH((BANK_AC_NO)) = 0)" ) // IS NULL

         .addFilterBy( "notnullBankAcNo", "BANK_AC_NO IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByBankAcNoMatch", "BANK_AC_NO LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullBankAcNo",
      "((BANK_AC_NO) = ? OR BANK_AC_NO IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INBankAcNo", "BANK_AC_NO IN ( ? )" ) // IN

         .addFilterBy( "NOTINBankAcNo", "BANK_AC_NO NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "BankAcNoasc", "BANK_AC_NO ASC" ) // ORDER ASCENDING

         .addOrderBy( "BankAcNodesc", "BANK_AC_NO DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalBankAcType", "(BANK_AC_TYPE) = ?" ) // EQUAL

         .addFilterBy( "notequalBankAcType", "(BANK_AC_TYPE) != ?" ) // NOTEQUAL

         .addFilterBy( "nullBankAcType",
      "(BANK_AC_TYPE IS NULL OR LENGTH((BANK_AC_TYPE)) = 0)" ) // IS NULL

         .addFilterBy( "notnullBankAcType", "BANK_AC_TYPE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByBankAcTypeMatch", "BANK_AC_TYPE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullBankAcType",
      "((BANK_AC_TYPE) = ? OR BANK_AC_TYPE IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INBankAcType", "BANK_AC_TYPE IN ( ? )" ) // IN

         .addFilterBy( "NOTINBankAcType", "BANK_AC_TYPE NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "BankAcTypeasc", "BANK_AC_TYPE ASC" ) // ORDER ASCENDING

         .addOrderBy( "BankAcTypedesc", "BANK_AC_TYPE DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalBankPayType", "(BANK_PAY_TYPE) = ?" ) // EQUAL

         .addFilterBy( "notequalBankPayType", "(BANK_PAY_TYPE) != ?" ) // NOTEQUAL

         .addFilterBy( "nullBankPayType",
      "(BANK_PAY_TYPE IS NULL OR LENGTH((BANK_PAY_TYPE)) = 0)" ) // IS NULL

         .addFilterBy( "notnullBankPayType", "BANK_PAY_TYPE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByBankPayTypeMatch", "BANK_PAY_TYPE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullBankPayType",
      "((BANK_PAY_TYPE) = ? OR BANK_PAY_TYPE IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INBankPayType", "BANK_PAY_TYPE IN ( ? )" ) // IN

         .addFilterBy( "NOTINBankPayType", "BANK_PAY_TYPE NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "BankPayTypeasc", "BANK_PAY_TYPE ASC" ) // ORDER ASCENDING

         .addOrderBy( "BankPayTypedesc", "BANK_PAY_TYPE DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalAuxPrefDebitDay", "AUX_PREF_DEBIT_DAY = ?" ) // EQUAL

         .addFilterBy( "notequalAuxPrefDebitDay", "AUX_PREF_DEBIT_DAY != ?" ) // NOTEQUAL

         .addFilterBy( "nullAuxPrefDebitDay", "AUX_PREF_DEBIT_DAY IS NULL" ) // IS NULL

         .addFilterBy( "notnullAuxPrefDebitDay",
      "AUX_PREF_DEBIT_DAY IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanAuxPrefDebitDay", "AUX_PREF_DEBIT_DAY < ?" ) // LESS THAN

         .addFilterBy( "greaterthanAuxPrefDebitDay", "AUX_PREF_DEBIT_DAY > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalAuxPrefDebitDay",
      "AUX_PREF_DEBIT_DAY <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalAuxPrefDebitDay",
      "AUX_PREF_DEBIT_DAY >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "betweenAuxPrefDebitDay",
      "AUX_PREF_DEBIT_DAY BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullAuxPrefDebitDay",
      "(AUX_PREF_DEBIT_DAY IS NULL OR AUX_PREF_DEBIT_DAY = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullAuxPrefDebitDay",
      "(AUX_PREF_DEBIT_DAY IS NULL OR AUX_PREF_DEBIT_DAY < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullAuxPrefDebitDay",
      "(AUX_PREF_DEBIT_DAY IS NULL OR AUX_PREF_DEBIT_DAY > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INAuxPrefDebitDay", "AUX_PREF_DEBIT_DAY IN ( ? )" ) // IN

         .addFilterBy( "NOTINAuxPrefDebitDay",
      "AUX_PREF_DEBIT_DAY NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "AuxPrefDebitDayasc", "AUX_PREF_DEBIT_DAY ASC" ) // ORDER ASCENDING

         .addOrderBy( "AuxPrefDebitDaydesc", "AUX_PREF_DEBIT_DAY DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalProtectCode", "(PROTECT_CODE) = ?" ) // EQUAL

         .addFilterBy( "notequalProtectCode", "(PROTECT_CODE) != ?" ) // NOTEQUAL

         .addFilterBy( "nullProtectCode",
      "(PROTECT_CODE IS NULL OR LENGTH((PROTECT_CODE)) = 0)" ) // IS NULL

         .addFilterBy( "notnullProtectCode", "PROTECT_CODE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByProtectCodeMatch", "PROTECT_CODE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullProtectCode",
      "((PROTECT_CODE) = ? OR PROTECT_CODE IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INProtectCode", "PROTECT_CODE IN ( ? )" ) // IN

         .addFilterBy( "NOTINProtectCode", "PROTECT_CODE NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "ProtectCodeasc", "PROTECT_CODE ASC" ) // ORDER ASCENDING

         .addOrderBy( "ProtectCodedesc", "PROTECT_CODE DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalHandsetCt", "HANDSET_CT = ?" ) // EQUAL

         .addFilterBy( "notequalHandsetCt", "HANDSET_CT != ?" ) // NOTEQUAL

         .addFilterBy( "nullHandsetCt", "HANDSET_CT IS NULL" ) // IS NULL

         .addFilterBy( "notnullHandsetCt", "HANDSET_CT IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanHandsetCt", "HANDSET_CT < ?" ) // LESS THAN

         .addFilterBy( "greaterthanHandsetCt", "HANDSET_CT > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalHandsetCt", "HANDSET_CT <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalHandsetCt", "HANDSET_CT >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "betweenHandsetCt", "HANDSET_CT BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullHandsetCt",
      "(HANDSET_CT IS NULL OR HANDSET_CT = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullHandsetCt",
      "(HANDSET_CT IS NULL OR HANDSET_CT < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullHandsetCt",
      "(HANDSET_CT IS NULL OR HANDSET_CT > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INHandsetCt", "HANDSET_CT IN ( ? )" ) // IN

         .addFilterBy( "NOTINHandsetCt", "HANDSET_CT NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "HandsetCtasc", "HANDSET_CT ASC" ) // ORDER ASCENDING

         .addOrderBy( "HandsetCtdesc", "HANDSET_CT DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalBankDate", "BANK_DATE = ?" ) // EQUAL

         .addFilterBy( "notequalBankDate", "BANK_DATE != ?" ) // NOTEQUAL

         .addFilterBy( "nullBankDate", "BANK_DATE IS NULL" ) // IS NULL

         .addFilterBy( "notnullBankDate", "BANK_DATE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanBankDate", "BANK_DATE < ?" ) // LESS THAN

         .addFilterBy( "greaterthanBankDate", "BANK_DATE > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalBankDate", "BANK_DATE <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalBankDate", "BANK_DATE >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "betweenBankDate", "BANK_DATE BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullBankDate",
      "(BANK_DATE IS NULL OR BANK_DATE = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullBankDate",
      "(BANK_DATE IS NULL OR BANK_DATE < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullBankDate",
      "(BANK_DATE IS NULL OR BANK_DATE > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INBankDate", "BANK_DATE IN ( ? )" ) // IN

         .addFilterBy( "NOTINBankDate", "BANK_DATE NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "BankDateasc", "BANK_DATE ASC" ) // ORDER ASCENDING

         .addOrderBy( "BankDatedesc", "BANK_DATE DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalConfDate", "CONF_DATE = ?" ) // EQUAL

         .addFilterBy( "notequalConfDate", "CONF_DATE != ?" ) // NOTEQUAL

         .addFilterBy( "nullConfDate", "CONF_DATE IS NULL" ) // IS NULL

         .addFilterBy( "notnullConfDate", "CONF_DATE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanConfDate", "CONF_DATE < ?" ) // LESS THAN

         .addFilterBy( "greaterthanConfDate", "CONF_DATE > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalConfDate", "CONF_DATE <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalConfDate", "CONF_DATE >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "betweenConfDate", "CONF_DATE BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullConfDate",
      "(CONF_DATE IS NULL OR CONF_DATE = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullConfDate",
      "(CONF_DATE IS NULL OR CONF_DATE < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullConfDate",
      "(CONF_DATE IS NULL OR CONF_DATE > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INConfDate", "CONF_DATE IN ( ? )" ) // IN

         .addFilterBy( "NOTINConfDate", "CONF_DATE NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "ConfDateasc", "CONF_DATE ASC" ) // ORDER ASCENDING

         .addOrderBy( "ConfDatedesc", "CONF_DATE DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalAuxComment", "(AUX_COMMENT) = ?" ) // EQUAL

         .addFilterBy( "notequalAuxComment", "(AUX_COMMENT) != ?" ) // NOTEQUAL

         .addFilterBy( "nullAuxComment",
      "(AUX_COMMENT IS NULL OR LENGTH((AUX_COMMENT)) = 0)" ) // IS NULL

         .addFilterBy( "notnullAuxComment", "AUX_COMMENT IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByAuxCommentMatch", "AUX_COMMENT LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullAuxComment",
      "((AUX_COMMENT) = ? OR AUX_COMMENT IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INAuxComment", "AUX_COMMENT IN ( ? )" ) // IN

         .addFilterBy( "NOTINAuxComment", "AUX_COMMENT NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "AuxCommentasc", "AUX_COMMENT ASC" ) // ORDER ASCENDING

         .addOrderBy( "AuxCommentdesc", "AUX_COMMENT DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalDateOfBirth", "DATE_OF_BIRTH = ?" ) // EQUAL

         .addFilterBy( "notequalDateOfBirth", "DATE_OF_BIRTH != ?" ) // NOTEQUAL

         .addFilterBy( "nullDateOfBirth", "DATE_OF_BIRTH IS NULL" ) // IS NULL

         .addFilterBy( "notnullDateOfBirth", "DATE_OF_BIRTH IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanDateOfBirth", "DATE_OF_BIRTH < ?" ) // LESS THAN

         .addFilterBy( "greaterthanDateOfBirth", "DATE_OF_BIRTH > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalDateOfBirth", "DATE_OF_BIRTH <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalDateOfBirth", "DATE_OF_BIRTH >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "betweenDateOfBirth", "DATE_OF_BIRTH BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullDateOfBirth",
      "(DATE_OF_BIRTH IS NULL OR DATE_OF_BIRTH = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullDateOfBirth",
      "(DATE_OF_BIRTH IS NULL OR DATE_OF_BIRTH < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullDateOfBirth",
      "(DATE_OF_BIRTH IS NULL OR DATE_OF_BIRTH > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INDateOfBirth", "DATE_OF_BIRTH IN ( ? )" ) // IN

         .addFilterBy( "NOTINDateOfBirth", "DATE_OF_BIRTH NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "DateOfBirthasc", "DATE_OF_BIRTH ASC" ) // ORDER ASCENDING

         .addOrderBy( "DateOfBirthdesc", "DATE_OF_BIRTH DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalRefPayDate", "REF_PAY_DATE = ?" ) // EQUAL

         .addFilterBy( "notequalRefPayDate", "REF_PAY_DATE != ?" ) // NOTEQUAL

         .addFilterBy( "nullRefPayDate", "REF_PAY_DATE IS NULL" ) // IS NULL

         .addFilterBy( "notnullRefPayDate", "REF_PAY_DATE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanRefPayDate", "REF_PAY_DATE < ?" ) // LESS THAN

         .addFilterBy( "greaterthanRefPayDate", "REF_PAY_DATE > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalRefPayDate", "REF_PAY_DATE <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalRefPayDate", "REF_PAY_DATE >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "betweenRefPayDate", "REF_PAY_DATE BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullRefPayDate",
      "(REF_PAY_DATE IS NULL OR REF_PAY_DATE = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullRefPayDate",
      "(REF_PAY_DATE IS NULL OR REF_PAY_DATE < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullRefPayDate",
      "(REF_PAY_DATE IS NULL OR REF_PAY_DATE > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INRefPayDate", "REF_PAY_DATE IN ( ? )" ) // IN

         .addFilterBy( "NOTINRefPayDate", "REF_PAY_DATE NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "RefPayDateasc", "REF_PAY_DATE ASC" ) // ORDER ASCENDING

         .addOrderBy( "RefPayDatedesc", "REF_PAY_DATE DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalAcClosDate", "AC_CLOS_DATE = ?" ) // EQUAL

         .addFilterBy( "notequalAcClosDate", "AC_CLOS_DATE != ?" ) // NOTEQUAL

         .addFilterBy( "nullAcClosDate", "AC_CLOS_DATE IS NULL" ) // IS NULL

         .addFilterBy( "notnullAcClosDate", "AC_CLOS_DATE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanAcClosDate", "AC_CLOS_DATE < ?" ) // LESS THAN

         .addFilterBy( "greaterthanAcClosDate", "AC_CLOS_DATE > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalAcClosDate", "AC_CLOS_DATE <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalAcClosDate", "AC_CLOS_DATE >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "betweenAcClosDate", "AC_CLOS_DATE BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullAcClosDate",
      "(AC_CLOS_DATE IS NULL OR AC_CLOS_DATE = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullAcClosDate",
      "(AC_CLOS_DATE IS NULL OR AC_CLOS_DATE < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullAcClosDate",
      "(AC_CLOS_DATE IS NULL OR AC_CLOS_DATE > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INAcClosDate", "AC_CLOS_DATE IN ( ? )" ) // IN

         .addFilterBy( "NOTINAcClosDate", "AC_CLOS_DATE NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "AcClosDateasc", "AC_CLOS_DATE ASC" ) // ORDER ASCENDING

         .addOrderBy( "AcClosDatedesc", "AC_CLOS_DATE DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalNoReasDate", "NO_REAS_DATE = ?" ) // EQUAL

         .addFilterBy( "notequalNoReasDate", "NO_REAS_DATE != ?" ) // NOTEQUAL

         .addFilterBy( "nullNoReasDate", "NO_REAS_DATE IS NULL" ) // IS NULL

         .addFilterBy( "notnullNoReasDate", "NO_REAS_DATE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanNoReasDate", "NO_REAS_DATE < ?" ) // LESS THAN

         .addFilterBy( "greaterthanNoReasDate", "NO_REAS_DATE > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalNoReasDate", "NO_REAS_DATE <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalNoReasDate", "NO_REAS_DATE >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "betweenNoReasDate", "NO_REAS_DATE BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullNoReasDate",
      "(NO_REAS_DATE IS NULL OR NO_REAS_DATE = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullNoReasDate",
      "(NO_REAS_DATE IS NULL OR NO_REAS_DATE < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullNoReasDate",
      "(NO_REAS_DATE IS NULL OR NO_REAS_DATE > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INNoReasDate", "NO_REAS_DATE IN ( ? )" ) // IN

         .addFilterBy( "NOTINNoReasDate", "NO_REAS_DATE NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "NoReasDateasc", "NO_REAS_DATE ASC" ) // ORDER ASCENDING

         .addOrderBy( "NoReasDatedesc", "NO_REAS_DATE DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalRemLetDate", "REM_LET_DATE = ?" ) // EQUAL

         .addFilterBy( "notequalRemLetDate", "REM_LET_DATE != ?" ) // NOTEQUAL

         .addFilterBy( "nullRemLetDate", "REM_LET_DATE IS NULL" ) // IS NULL

         .addFilterBy( "notnullRemLetDate", "REM_LET_DATE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanRemLetDate", "REM_LET_DATE < ?" ) // LESS THAN

         .addFilterBy( "greaterthanRemLetDate", "REM_LET_DATE > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalRemLetDate", "REM_LET_DATE <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalRemLetDate", "REM_LET_DATE >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "betweenRemLetDate", "REM_LET_DATE BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullRemLetDate",
      "(REM_LET_DATE IS NULL OR REM_LET_DATE = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullRemLetDate",
      "(REM_LET_DATE IS NULL OR REM_LET_DATE < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullRemLetDate",
      "(REM_LET_DATE IS NULL OR REM_LET_DATE > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INRemLetDate", "REM_LET_DATE IN ( ? )" ) // IN

         .addFilterBy( "NOTINRemLetDate", "REM_LET_DATE NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "RemLetDateasc", "REM_LET_DATE ASC" ) // ORDER ASCENDING

         .addOrderBy( "RemLetDatedesc", "REM_LET_DATE DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalAcTranDate", "AC_TRAN_DATE = ?" ) // EQUAL

         .addFilterBy( "notequalAcTranDate", "AC_TRAN_DATE != ?" ) // NOTEQUAL

         .addFilterBy( "nullAcTranDate", "AC_TRAN_DATE IS NULL" ) // IS NULL

         .addFilterBy( "notnullAcTranDate", "AC_TRAN_DATE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanAcTranDate", "AC_TRAN_DATE < ?" ) // LESS THAN

         .addFilterBy( "greaterthanAcTranDate", "AC_TRAN_DATE > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalAcTranDate", "AC_TRAN_DATE <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalAcTranDate", "AC_TRAN_DATE >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "betweenAcTranDate", "AC_TRAN_DATE BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullAcTranDate",
      "(AC_TRAN_DATE IS NULL OR AC_TRAN_DATE = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullAcTranDate",
      "(AC_TRAN_DATE IS NULL OR AC_TRAN_DATE < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullAcTranDate",
      "(AC_TRAN_DATE IS NULL OR AC_TRAN_DATE > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INAcTranDate", "AC_TRAN_DATE IN ( ? )" ) // IN

         .addFilterBy( "NOTINAcTranDate", "AC_TRAN_DATE NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "AcTranDateasc", "AC_TRAN_DATE ASC" ) // ORDER ASCENDING

         .addOrderBy( "AcTranDatedesc", "AC_TRAN_DATE DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalNoAcDate", "NO_AC_DATE = ?" ) // EQUAL

         .addFilterBy( "notequalNoAcDate", "NO_AC_DATE != ?" ) // NOTEQUAL

         .addFilterBy( "nullNoAcDate", "NO_AC_DATE IS NULL" ) // IS NULL

         .addFilterBy( "notnullNoAcDate", "NO_AC_DATE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanNoAcDate", "NO_AC_DATE < ?" ) // LESS THAN

         .addFilterBy( "greaterthanNoAcDate", "NO_AC_DATE > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalNoAcDate", "NO_AC_DATE <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalNoAcDate", "NO_AC_DATE >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "betweenNoAcDate", "NO_AC_DATE BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullNoAcDate",
      "(NO_AC_DATE IS NULL OR NO_AC_DATE = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullNoAcDate",
      "(NO_AC_DATE IS NULL OR NO_AC_DATE < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullNoAcDate",
      "(NO_AC_DATE IS NULL OR NO_AC_DATE > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INNoAcDate", "NO_AC_DATE IN ( ? )" ) // IN

         .addFilterBy( "NOTINNoAcDate", "NO_AC_DATE NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "NoAcDateasc", "NO_AC_DATE ASC" ) // ORDER ASCENDING

         .addOrderBy( "NoAcDatedesc", "NO_AC_DATE DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalSrFlag", "(SR_FLAG) = ?" ) // EQUAL

         .addFilterBy( "notequalSrFlag", "(SR_FLAG) != ?" ) // NOTEQUAL

         .addFilterBy( "nullSrFlag",
      "(SR_FLAG IS NULL OR LENGTH((SR_FLAG)) = 0)" ) // IS NULL

         .addFilterBy( "notnullSrFlag", "SR_FLAG IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterBySrFlagMatch", "SR_FLAG LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullSrFlag",
      "((SR_FLAG) = ? OR SR_FLAG IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INSrFlag", "SR_FLAG IN ( ? )" ) // IN

         .addFilterBy( "NOTINSrFlag", "SR_FLAG NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "SrFlagasc", "SR_FLAG ASC" ) // ORDER ASCENDING

         .addOrderBy( "SrFlagdesc", "SR_FLAG DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalProcessed", "(PROCESSED) = ?" ) // EQUAL

         .addFilterBy( "notequalProcessed", "(PROCESSED) != ?" ) // NOTEQUAL

         .addFilterBy( "nullProcessed",
      "(PROCESSED IS NULL OR LENGTH((PROCESSED)) = 0)" ) // IS NULL

         .addFilterBy( "notnullProcessed", "PROCESSED IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByProcessedMatch", "PROCESSED LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullProcessed",
      "((PROCESSED) = ? OR PROCESSED IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INProcessed", "PROCESSED IN ( ? )" ) // IN

         .addFilterBy( "NOTINProcessed", "PROCESSED NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "Processedasc", "PROCESSED ASC" ) // ORDER ASCENDING

         .addOrderBy( "Processeddesc", "PROCESSED DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalPackageCode", "(PACKAGE_CODE) = ?" ) // EQUAL

         .addFilterBy( "notequalPackageCode", "(PACKAGE_CODE) != ?" ) // NOTEQUAL

         .addFilterBy( "nullPackageCode",
      "(PACKAGE_CODE IS NULL OR LENGTH((PACKAGE_CODE)) = 0)" ) // IS NULL

         .addFilterBy( "notnullPackageCode", "PACKAGE_CODE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByPackageCodeMatch", "PACKAGE_CODE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullPackageCode",
      "((PACKAGE_CODE) = ? OR PACKAGE_CODE IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INPackageCode", "PACKAGE_CODE IN ( ? )" ) // IN

         .addFilterBy( "NOTINPackageCode", "PACKAGE_CODE NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "PackageCodeasc", "PACKAGE_CODE ASC" ) // ORDER ASCENDING

         .addOrderBy( "PackageCodedesc", "PACKAGE_CODE DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalAuxAccountType", "(AUX_ACCOUNT_TYPE) = ?" ) // EQUAL

         .addFilterBy( "notequalAuxAccountType", "(AUX_ACCOUNT_TYPE) != ?" ) // NOTEQUAL

         .addFilterBy( "nullAuxAccountType",
      "(AUX_ACCOUNT_TYPE IS NULL OR LENGTH((AUX_ACCOUNT_TYPE)) = 0)" ) // IS NULL

         .addFilterBy( "notnullAuxAccountType", "AUX_ACCOUNT_TYPE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByAuxAccountTypeMatch",
      "AUX_ACCOUNT_TYPE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullAuxAccountType",
      "((AUX_ACCOUNT_TYPE) = ? OR AUX_ACCOUNT_TYPE IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INAuxAccountType", "AUX_ACCOUNT_TYPE IN ( ? )" ) // IN

         .addFilterBy( "NOTINAuxAccountType", "AUX_ACCOUNT_TYPE NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "AuxAccountTypeasc", "AUX_ACCOUNT_TYPE ASC" ) // ORDER ASCENDING

         .addOrderBy( "AuxAccountTypedesc", "AUX_ACCOUNT_TYPE DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalAuxBillCycle", "(AUX_BILL_CYCLE) = ?" ) // EQUAL

         .addFilterBy( "notequalAuxBillCycle", "(AUX_BILL_CYCLE) != ?" ) // NOTEQUAL

         .addFilterBy( "nullAuxBillCycle",
      "(AUX_BILL_CYCLE IS NULL OR LENGTH((AUX_BILL_CYCLE)) = 0)" ) // IS NULL

         .addFilterBy( "notnullAuxBillCycle", "AUX_BILL_CYCLE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByAuxBillCycleMatch", "AUX_BILL_CYCLE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullAuxBillCycle",
      "((AUX_BILL_CYCLE) = ? OR AUX_BILL_CYCLE IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INAuxBillCycle", "AUX_BILL_CYCLE IN ( ? )" ) // IN

         .addFilterBy( "NOTINAuxBillCycle", "AUX_BILL_CYCLE NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "AuxBillCycleasc", "AUX_BILL_CYCLE ASC" ) // ORDER ASCENDING

         .addOrderBy( "AuxBillCycledesc", "AUX_BILL_CYCLE DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalCreditCardNo", "(CREDIT_CARD_NO) = ?" ) // EQUAL

         .addFilterBy( "notequalCreditCardNo", "(CREDIT_CARD_NO) != ?" ) // NOTEQUAL

         .addFilterBy( "nullCreditCardNo",
      "(CREDIT_CARD_NO IS NULL OR LENGTH((CREDIT_CARD_NO)) = 0)" ) // IS NULL

         .addFilterBy( "notnullCreditCardNo", "CREDIT_CARD_NO IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByCreditCardNoMatch", "CREDIT_CARD_NO LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullCreditCardNo",
      "((CREDIT_CARD_NO) = ? OR CREDIT_CARD_NO IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INCreditCardNo", "CREDIT_CARD_NO IN ( ? )" ) // IN

         .addFilterBy( "NOTINCreditCardNo", "CREDIT_CARD_NO NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "CreditCardNoasc", "CREDIT_CARD_NO ASC" ) // ORDER ASCENDING

         .addOrderBy( "CreditCardNodesc", "CREDIT_CARD_NO DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalCreditCardName", "(CREDIT_CARD_NAME) = ?" ) // EQUAL

         .addFilterBy( "notequalCreditCardName", "(CREDIT_CARD_NAME) != ?" ) // NOTEQUAL

         .addFilterBy( "nullCreditCardName",
      "(CREDIT_CARD_NAME IS NULL OR LENGTH((CREDIT_CARD_NAME)) = 0)" ) // IS NULL

         .addFilterBy( "notnullCreditCardName", "CREDIT_CARD_NAME IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByCreditCardNameMatch",
      "CREDIT_CARD_NAME LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullCreditCardName",
      "((CREDIT_CARD_NAME) = ? OR CREDIT_CARD_NAME IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INCreditCardName", "CREDIT_CARD_NAME IN ( ? )" ) // IN

         .addFilterBy( "NOTINCreditCardName", "CREDIT_CARD_NAME NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "CreditCardNameasc", "CREDIT_CARD_NAME ASC" ) // ORDER ASCENDING

         .addOrderBy( "CreditCardNamedesc", "CREDIT_CARD_NAME DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalExpiryDate", "EXPIRY_DATE = ?" ) // EQUAL

         .addFilterBy( "notequalExpiryDate", "EXPIRY_DATE != ?" ) // NOTEQUAL

         .addFilterBy( "nullExpiryDate", "EXPIRY_DATE IS NULL" ) // IS NULL

         .addFilterBy( "notnullExpiryDate", "EXPIRY_DATE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanExpiryDate", "EXPIRY_DATE < ?" ) // LESS THAN

         .addFilterBy( "greaterthanExpiryDate", "EXPIRY_DATE > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalExpiryDate", "EXPIRY_DATE <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalExpiryDate", "EXPIRY_DATE >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "betweenExpiryDate", "EXPIRY_DATE BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullExpiryDate",
      "(EXPIRY_DATE IS NULL OR EXPIRY_DATE = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullExpiryDate",
      "(EXPIRY_DATE IS NULL OR EXPIRY_DATE < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullExpiryDate",
      "(EXPIRY_DATE IS NULL OR EXPIRY_DATE > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INExpiryDate", "EXPIRY_DATE IN ( ? )" ) // IN

         .addFilterBy( "NOTINExpiryDate", "EXPIRY_DATE NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "ExpiryDateasc", "EXPIRY_DATE ASC" ) // ORDER ASCENDING

         .addOrderBy( "ExpiryDatedesc", "EXPIRY_DATE DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalAuxCardCvvNo", "(AUX_CARD_CVV_NO) = ?" ) // EQUAL

         .addFilterBy( "notequalAuxCardCvvNo", "(AUX_CARD_CVV_NO) != ?" ) // NOTEQUAL

         .addFilterBy( "nullAuxCardCvvNo",
      "(AUX_CARD_CVV_NO IS NULL OR LENGTH((AUX_CARD_CVV_NO)) = 0)" ) // IS NULL

         .addFilterBy( "notnullAuxCardCvvNo", "AUX_CARD_CVV_NO IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByAuxCardCvvNoMatch", "AUX_CARD_CVV_NO LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullAuxCardCvvNo",
      "((AUX_CARD_CVV_NO) = ? OR AUX_CARD_CVV_NO IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INAuxCardCvvNo", "AUX_CARD_CVV_NO IN ( ? )" ) // IN

         .addFilterBy( "NOTINAuxCardCvvNo", "AUX_CARD_CVV_NO NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "AuxCardCvvNoasc", "AUX_CARD_CVV_NO ASC" ) // ORDER ASCENDING

         .addOrderBy( "AuxCardCvvNodesc", "AUX_CARD_CVV_NO DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalCreditScore", "CREDIT_SCORE = ?" ) // EQUAL

         .addFilterBy( "notequalCreditScore", "CREDIT_SCORE != ?" ) // NOTEQUAL

         .addFilterBy( "nullCreditScore", "CREDIT_SCORE IS NULL" ) // IS NULL

         .addFilterBy( "notnullCreditScore", "CREDIT_SCORE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanCreditScore", "CREDIT_SCORE < ?" ) // LESS THAN

         .addFilterBy( "greaterthanCreditScore", "CREDIT_SCORE > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalCreditScore", "CREDIT_SCORE <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalCreditScore", "CREDIT_SCORE >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "betweenCreditScore", "CREDIT_SCORE BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullCreditScore",
      "(CREDIT_SCORE IS NULL OR CREDIT_SCORE = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullCreditScore",
      "(CREDIT_SCORE IS NULL OR CREDIT_SCORE < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullCreditScore",
      "(CREDIT_SCORE IS NULL OR CREDIT_SCORE > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INCreditScore", "CREDIT_SCORE IN ( ? )" ) // IN

         .addFilterBy( "NOTINCreditScore", "CREDIT_SCORE NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "CreditScoreasc", "CREDIT_SCORE ASC" ) // ORDER ASCENDING

         .addOrderBy( "CreditScoredesc", "CREDIT_SCORE DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalServProvId", "SERV_PROV_ID = ?" ) // EQUAL

         .addFilterBy( "notequalServProvId", "SERV_PROV_ID != ?" ) // NOTEQUAL

         .addFilterBy( "nullServProvId", "SERV_PROV_ID IS NULL" ) // IS NULL

         .addFilterBy( "notnullServProvId", "SERV_PROV_ID IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanServProvId", "SERV_PROV_ID < ?" ) // LESS THAN

         .addFilterBy( "greaterthanServProvId", "SERV_PROV_ID > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalServProvId", "SERV_PROV_ID <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalServProvId", "SERV_PROV_ID >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "betweenServProvId", "SERV_PROV_ID BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullServProvId",
      "(SERV_PROV_ID IS NULL OR SERV_PROV_ID = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullServProvId",
      "(SERV_PROV_ID IS NULL OR SERV_PROV_ID < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullServProvId",
      "(SERV_PROV_ID IS NULL OR SERV_PROV_ID > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INServProvId", "SERV_PROV_ID IN ( ? )" ) // IN

         .addFilterBy( "NOTINServProvId", "SERV_PROV_ID NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "ServProvIdasc", "SERV_PROV_ID ASC" ) // ORDER ASCENDING

         .addOrderBy( "ServProvIddesc", "SERV_PROV_ID DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalDealerId", "(DEALER_ID) = ?" ) // EQUAL

         .addFilterBy( "notequalDealerId", "(DEALER_ID) != ?" ) // NOTEQUAL

         .addFilterBy( "nullDealerId",
      "(DEALER_ID IS NULL OR LENGTH((DEALER_ID)) = 0)" ) // IS NULL

         .addFilterBy( "notnullDealerId", "DEALER_ID IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByDealerIdMatch", "DEALER_ID LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullDealerId",
      "((DEALER_ID) = ? OR DEALER_ID IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INDealerId", "DEALER_ID IN ( ? )" ) // IN

         .addFilterBy( "NOTINDealerId", "DEALER_ID NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "DealerIdasc", "DEALER_ID ASC" ) // ORDER ASCENDING

         .addOrderBy( "DealerIddesc", "DEALER_ID DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalSalesman", "(SALESMAN) = ?" ) // EQUAL

         .addFilterBy( "notequalSalesman", "(SALESMAN) != ?" ) // NOTEQUAL

         .addFilterBy( "nullSalesman",
      "(SALESMAN IS NULL OR LENGTH((SALESMAN)) = 0)" ) // IS NULL

         .addFilterBy( "notnullSalesman", "SALESMAN IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterBySalesmanMatch", "SALESMAN LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullSalesman",
      "((SALESMAN) = ? OR SALESMAN IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INSalesman", "SALESMAN IN ( ? )" ) // IN

         .addFilterBy( "NOTINSalesman", "SALESMAN NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "Salesmanasc", "SALESMAN ASC" ) // ORDER ASCENDING

         .addOrderBy( "Salesmandesc", "SALESMAN DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalIdNumber", "(ID_NUMBER) = ?" ) // EQUAL

         .addFilterBy( "notequalIdNumber", "(ID_NUMBER) != ?" ) // NOTEQUAL

         .addFilterBy( "nullIdNumber",
      "(ID_NUMBER IS NULL OR LENGTH((ID_NUMBER)) = 0)" ) // IS NULL

         .addFilterBy( "notnullIdNumber", "ID_NUMBER IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByIdNumberMatch", "ID_NUMBER LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullIdNumber",
      "((ID_NUMBER) = ? OR ID_NUMBER IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INIdNumber", "ID_NUMBER IN ( ? )" ) // IN

         .addFilterBy( "NOTINIdNumber", "ID_NUMBER NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "IdNumberasc", "ID_NUMBER ASC" ) // ORDER ASCENDING

         .addOrderBy( "IdNumberdesc", "ID_NUMBER DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalAccStatus", "(ACC_STATUS) = ?" ) // EQUAL

         .addFilterBy( "notequalAccStatus", "(ACC_STATUS) != ?" ) // NOTEQUAL

         .addFilterBy( "nullAccStatus",
      "(ACC_STATUS IS NULL OR LENGTH((ACC_STATUS)) = 0)" ) // IS NULL

         .addFilterBy( "notnullAccStatus", "ACC_STATUS IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByAccStatusMatch", "ACC_STATUS LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullAccStatus",
      "((ACC_STATUS) = ? OR ACC_STATUS IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INAccStatus", "ACC_STATUS IN ( ? )" ) // IN

         .addFilterBy( "NOTINAccStatus", "ACC_STATUS NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "AccStatusasc", "ACC_STATUS ASC" ) // ORDER ASCENDING

         .addOrderBy( "AccStatusdesc", "ACC_STATUS DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalCompRegNo", "(COMP_REG_NO) = ?" ) // EQUAL

         .addFilterBy( "notequalCompRegNo", "(COMP_REG_NO) != ?" ) // NOTEQUAL

         .addFilterBy( "nullCompRegNo",
      "(COMP_REG_NO IS NULL OR LENGTH((COMP_REG_NO)) = 0)" ) // IS NULL

         .addFilterBy( "notnullCompRegNo", "COMP_REG_NO IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByCompRegNoMatch", "COMP_REG_NO LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullCompRegNo",
      "((COMP_REG_NO) = ? OR COMP_REG_NO IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INCompRegNo", "COMP_REG_NO IN ( ? )" ) // IN

         .addFilterBy( "NOTINCompRegNo", "COMP_REG_NO NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "CompRegNoasc", "COMP_REG_NO ASC" ) // ORDER ASCENDING

         .addOrderBy( "CompRegNodesc", "COMP_REG_NO DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalStationaryType", "(STATIONARY_TYPE) = ?" ) // EQUAL

         .addFilterBy( "notequalStationaryType", "(STATIONARY_TYPE) != ?" ) // NOTEQUAL

         .addFilterBy( "nullStationaryType",
      "(STATIONARY_TYPE IS NULL OR LENGTH((STATIONARY_TYPE)) = 0)" ) // IS NULL

         .addFilterBy( "notnullStationaryType", "STATIONARY_TYPE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByStationaryTypeMatch", "STATIONARY_TYPE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullStationaryType",
      "((STATIONARY_TYPE) = ? OR STATIONARY_TYPE IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INStationaryType", "STATIONARY_TYPE IN ( ? )" ) // IN

         .addFilterBy( "NOTINStationaryType", "STATIONARY_TYPE NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "StationaryTypeasc", "STATIONARY_TYPE ASC" ) // ORDER ASCENDING

         .addOrderBy( "StationaryTypedesc", "STATIONARY_TYPE DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalMaxNoSubs", "MAX_NO_SUBS = ?" ) // EQUAL

         .addFilterBy( "notequalMaxNoSubs", "MAX_NO_SUBS != ?" ) // NOTEQUAL

         .addFilterBy( "nullMaxNoSubs", "MAX_NO_SUBS IS NULL" ) // IS NULL

         .addFilterBy( "notnullMaxNoSubs", "MAX_NO_SUBS IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanMaxNoSubs", "MAX_NO_SUBS < ?" ) // LESS THAN

         .addFilterBy( "greaterthanMaxNoSubs", "MAX_NO_SUBS > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalMaxNoSubs", "MAX_NO_SUBS <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalMaxNoSubs", "MAX_NO_SUBS >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "betweenMaxNoSubs", "MAX_NO_SUBS BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullMaxNoSubs",
      "(MAX_NO_SUBS IS NULL OR MAX_NO_SUBS = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullMaxNoSubs",
      "(MAX_NO_SUBS IS NULL OR MAX_NO_SUBS < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullMaxNoSubs",
      "(MAX_NO_SUBS IS NULL OR MAX_NO_SUBS > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INMaxNoSubs", "MAX_NO_SUBS IN ( ? )" ) // IN

         .addFilterBy( "NOTINMaxNoSubs", "MAX_NO_SUBS NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "MaxNoSubsasc", "MAX_NO_SUBS ASC" ) // ORDER ASCENDING

         .addOrderBy( "MaxNoSubsdesc", "MAX_NO_SUBS DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalAuxCurrency", "(AUX_CURRENCY) = ?" ) // EQUAL

         .addFilterBy( "notequalAuxCurrency", "(AUX_CURRENCY) != ?" ) // NOTEQUAL

         .addFilterBy( "nullAuxCurrency",
      "(AUX_CURRENCY IS NULL OR LENGTH((AUX_CURRENCY)) = 0)" ) // IS NULL

         .addFilterBy( "notnullAuxCurrency", "AUX_CURRENCY IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByAuxCurrencyMatch", "AUX_CURRENCY LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullAuxCurrency",
      "((AUX_CURRENCY) = ? OR AUX_CURRENCY IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INAuxCurrency", "AUX_CURRENCY IN ( ? )" ) // IN

         .addFilterBy( "NOTINAuxCurrency", "AUX_CURRENCY NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "AuxCurrencyasc", "AUX_CURRENCY ASC" ) // ORDER ASCENDING

         .addOrderBy( "AuxCurrencydesc", "AUX_CURRENCY DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalAuxCountryCode", "(AUX_COUNTRY_CODE) = ?" ) // EQUAL

         .addFilterBy( "notequalAuxCountryCode", "(AUX_COUNTRY_CODE) != ?" ) // NOTEQUAL

         .addFilterBy( "nullAuxCountryCode",
      "(AUX_COUNTRY_CODE IS NULL OR LENGTH((AUX_COUNTRY_CODE)) = 0)" ) // IS NULL

         .addFilterBy( "notnullAuxCountryCode", "AUX_COUNTRY_CODE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByAuxCountryCodeMatch",
      "AUX_COUNTRY_CODE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullAuxCountryCode",
      "((AUX_COUNTRY_CODE) = ? OR AUX_COUNTRY_CODE IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INAuxCountryCode", "AUX_COUNTRY_CODE IN ( ? )" ) // IN

         .addFilterBy( "NOTINAuxCountryCode", "AUX_COUNTRY_CODE NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "AuxCountryCodeasc", "AUX_COUNTRY_CODE ASC" ) // ORDER ASCENDING

         .addOrderBy( "AuxCountryCodedesc", "AUX_COUNTRY_CODE DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalAuxGender", "(AUX_GENDER) = ?" ) // EQUAL

         .addFilterBy( "notequalAuxGender", "(AUX_GENDER) != ?" ) // NOTEQUAL

         .addFilterBy( "nullAuxGender",
      "(AUX_GENDER IS NULL OR LENGTH((AUX_GENDER)) = 0)" ) // IS NULL

         .addFilterBy( "notnullAuxGender", "AUX_GENDER IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByAuxGenderMatch", "AUX_GENDER LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullAuxGender",
      "((AUX_GENDER) = ? OR AUX_GENDER IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INAuxGender", "AUX_GENDER IN ( ? )" ) // IN

         .addFilterBy( "NOTINAuxGender", "AUX_GENDER NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "AuxGenderasc", "AUX_GENDER ASC" ) // ORDER ASCENDING

         .addOrderBy( "AuxGenderdesc", "AUX_GENDER DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalAuxSubGrpAccNo", "(AUX_SUB_GRP_ACC_NO) = ?" ) // EQUAL

         .addFilterBy( "notequalAuxSubGrpAccNo",
      "(AUX_SUB_GRP_ACC_NO) != ?" ) // NOTEQUAL

         .addFilterBy( "nullAuxSubGrpAccNo",
      "(AUX_SUB_GRP_ACC_NO IS NULL OR LENGTH((AUX_SUB_GRP_ACC_NO)) = 0)" ) // IS NULL

         .addFilterBy( "notnullAuxSubGrpAccNo",
      "AUX_SUB_GRP_ACC_NO IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByAuxSubGrpAccNoMatch",
      "AUX_SUB_GRP_ACC_NO LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullAuxSubGrpAccNo",
      "((AUX_SUB_GRP_ACC_NO) = ? OR AUX_SUB_GRP_ACC_NO IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INAuxSubGrpAccNo", "AUX_SUB_GRP_ACC_NO IN ( ? )" ) // IN

         .addFilterBy( "NOTINAuxSubGrpAccNo",
      "AUX_SUB_GRP_ACC_NO NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "AuxSubGrpAccNoasc", "AUX_SUB_GRP_ACC_NO ASC" ) // ORDER ASCENDING

         .addOrderBy( "AuxSubGrpAccNodesc", "AUX_SUB_GRP_ACC_NO DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalAuxPrepaidStat", "(AUX_PREPAID_STAT) = ?" ) // EQUAL

         .addFilterBy( "notequalAuxPrepaidStat", "(AUX_PREPAID_STAT) != ?" ) // NOTEQUAL

         .addFilterBy( "nullAuxPrepaidStat",
      "(AUX_PREPAID_STAT IS NULL OR LENGTH((AUX_PREPAID_STAT)) = 0)" ) // IS NULL

         .addFilterBy( "notnullAuxPrepaidStat", "AUX_PREPAID_STAT IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByAuxPrepaidStatMatch",
      "AUX_PREPAID_STAT LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullAuxPrepaidStat",
      "((AUX_PREPAID_STAT) = ? OR AUX_PREPAID_STAT IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INAuxPrepaidStat", "AUX_PREPAID_STAT IN ( ? )" ) // IN

         .addFilterBy( "NOTINAuxPrepaidStat", "AUX_PREPAID_STAT NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "AuxPrepaidStatasc", "AUX_PREPAID_STAT ASC" ) // ORDER ASCENDING

         .addOrderBy( "AuxPrepaidStatdesc", "AUX_PREPAID_STAT DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalAuxCreditClass", "(AUX_CREDIT_CLASS) = ?" ) // EQUAL

         .addFilterBy( "notequalAuxCreditClass", "(AUX_CREDIT_CLASS) != ?" ) // NOTEQUAL

         .addFilterBy( "nullAuxCreditClass",
      "(AUX_CREDIT_CLASS IS NULL OR LENGTH((AUX_CREDIT_CLASS)) = 0)" ) // IS NULL

         .addFilterBy( "notnullAuxCreditClass", "AUX_CREDIT_CLASS IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByAuxCreditClassMatch",
      "AUX_CREDIT_CLASS LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullAuxCreditClass",
      "((AUX_CREDIT_CLASS) = ? OR AUX_CREDIT_CLASS IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INAuxCreditClass", "AUX_CREDIT_CLASS IN ( ? )" ) // IN

         .addFilterBy( "NOTINAuxCreditClass", "AUX_CREDIT_CLASS NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "AuxCreditClassasc", "AUX_CREDIT_CLASS ASC" ) // ORDER ASCENDING

         .addOrderBy( "AuxCreditClassdesc", "AUX_CREDIT_CLASS DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalAuxAutoLimitInd", "(AUX_AUTO_LIMIT_IND) = ?" ) // EQUAL

         .addFilterBy( "notequalAuxAutoLimitInd",
      "(AUX_AUTO_LIMIT_IND) != ?" ) // NOTEQUAL

         .addFilterBy( "nullAuxAutoLimitInd",
      "(AUX_AUTO_LIMIT_IND IS NULL OR LENGTH((AUX_AUTO_LIMIT_IND)) = 0)" ) // IS NULL

         .addFilterBy( "notnullAuxAutoLimitInd",
      "AUX_AUTO_LIMIT_IND IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByAuxAutoLimitIndMatch",
      "AUX_AUTO_LIMIT_IND LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullAuxAutoLimitInd",
      "((AUX_AUTO_LIMIT_IND) = ? OR AUX_AUTO_LIMIT_IND IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INAuxAutoLimitInd", "AUX_AUTO_LIMIT_IND IN ( ? )" ) // IN

         .addFilterBy( "NOTINAuxAutoLimitInd",
      "AUX_AUTO_LIMIT_IND NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "AuxAutoLimitIndasc", "AUX_AUTO_LIMIT_IND ASC" ) // ORDER ASCENDING

         .addOrderBy( "AuxAutoLimitInddesc", "AUX_AUTO_LIMIT_IND DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalAuxLmtUpVal", "AUX_LMT_UP_VAL = ?" ) // EQUAL

         .addFilterBy( "notequalAuxLmtUpVal", "AUX_LMT_UP_VAL != ?" ) // NOTEQUAL

         .addFilterBy( "nullAuxLmtUpVal", "AUX_LMT_UP_VAL IS NULL" ) // IS NULL

         .addFilterBy( "notnullAuxLmtUpVal", "AUX_LMT_UP_VAL IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanAuxLmtUpVal", "AUX_LMT_UP_VAL < ?" ) // LESS THAN

         .addFilterBy( "greaterthanAuxLmtUpVal", "AUX_LMT_UP_VAL > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalAuxLmtUpVal", "AUX_LMT_UP_VAL <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalAuxLmtUpVal", "AUX_LMT_UP_VAL >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "betweenAuxLmtUpVal", "AUX_LMT_UP_VAL BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullAuxLmtUpVal",
      "(AUX_LMT_UP_VAL IS NULL OR AUX_LMT_UP_VAL = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullAuxLmtUpVal",
      "(AUX_LMT_UP_VAL IS NULL OR AUX_LMT_UP_VAL < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullAuxLmtUpVal",
      "(AUX_LMT_UP_VAL IS NULL OR AUX_LMT_UP_VAL > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INAuxLmtUpVal", "AUX_LMT_UP_VAL IN ( ? )" ) // IN

         .addFilterBy( "NOTINAuxLmtUpVal", "AUX_LMT_UP_VAL NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "AuxLmtUpValasc", "AUX_LMT_UP_VAL ASC" ) // ORDER ASCENDING

         .addOrderBy( "AuxLmtUpValdesc", "AUX_LMT_UP_VAL DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalAuxLmtDnVal", "AUX_LMT_DN_VAL = ?" ) // EQUAL

         .addFilterBy( "notequalAuxLmtDnVal", "AUX_LMT_DN_VAL != ?" ) // NOTEQUAL

         .addFilterBy( "nullAuxLmtDnVal", "AUX_LMT_DN_VAL IS NULL" ) // IS NULL

         .addFilterBy( "notnullAuxLmtDnVal", "AUX_LMT_DN_VAL IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanAuxLmtDnVal", "AUX_LMT_DN_VAL < ?" ) // LESS THAN

         .addFilterBy( "greaterthanAuxLmtDnVal", "AUX_LMT_DN_VAL > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalAuxLmtDnVal", "AUX_LMT_DN_VAL <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalAuxLmtDnVal", "AUX_LMT_DN_VAL >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "betweenAuxLmtDnVal", "AUX_LMT_DN_VAL BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullAuxLmtDnVal",
      "(AUX_LMT_DN_VAL IS NULL OR AUX_LMT_DN_VAL = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullAuxLmtDnVal",
      "(AUX_LMT_DN_VAL IS NULL OR AUX_LMT_DN_VAL < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullAuxLmtDnVal",
      "(AUX_LMT_DN_VAL IS NULL OR AUX_LMT_DN_VAL > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INAuxLmtDnVal", "AUX_LMT_DN_VAL IN ( ? )" ) // IN

         .addFilterBy( "NOTINAuxLmtDnVal", "AUX_LMT_DN_VAL NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "AuxLmtDnValasc", "AUX_LMT_DN_VAL ASC" ) // ORDER ASCENDING

         .addOrderBy( "AuxLmtDnValdesc", "AUX_LMT_DN_VAL DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalAuxAnalysis1", "(AUX_ANALYSIS_1) = ?" ) // EQUAL

         .addFilterBy( "notequalAuxAnalysis1", "(AUX_ANALYSIS_1) != ?" ) // NOTEQUAL

         .addFilterBy( "nullAuxAnalysis1",
      "(AUX_ANALYSIS_1 IS NULL OR LENGTH((AUX_ANALYSIS_1)) = 0)" ) // IS NULL

         .addFilterBy( "notnullAuxAnalysis1", "AUX_ANALYSIS_1 IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByAuxAnalysis1Match", "AUX_ANALYSIS_1 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullAuxAnalysis1",
      "((AUX_ANALYSIS_1) = ? OR AUX_ANALYSIS_1 IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INAuxAnalysis1", "AUX_ANALYSIS_1 IN ( ? )" ) // IN

         .addFilterBy( "NOTINAuxAnalysis1", "AUX_ANALYSIS_1 NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "AuxAnalysis1asc", "AUX_ANALYSIS_1 ASC" ) // ORDER ASCENDING

         .addOrderBy( "AuxAnalysis1desc", "AUX_ANALYSIS_1 DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalAuxAnalysis2", "(AUX_ANALYSIS_2) = ?" ) // EQUAL

         .addFilterBy( "notequalAuxAnalysis2", "(AUX_ANALYSIS_2) != ?" ) // NOTEQUAL

         .addFilterBy( "nullAuxAnalysis2",
      "(AUX_ANALYSIS_2 IS NULL OR LENGTH((AUX_ANALYSIS_2)) = 0)" ) // IS NULL

         .addFilterBy( "notnullAuxAnalysis2", "AUX_ANALYSIS_2 IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByAuxAnalysis2Match", "AUX_ANALYSIS_2 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullAuxAnalysis2",
      "((AUX_ANALYSIS_2) = ? OR AUX_ANALYSIS_2 IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INAuxAnalysis2", "AUX_ANALYSIS_2 IN ( ? )" ) // IN

         .addFilterBy( "NOTINAuxAnalysis2", "AUX_ANALYSIS_2 NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "AuxAnalysis2asc", "AUX_ANALYSIS_2 ASC" ) // ORDER ASCENDING

         .addOrderBy( "AuxAnalysis2desc", "AUX_ANALYSIS_2 DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalAuxAnalysis3", "(AUX_ANALYSIS_3) = ?" ) // EQUAL

         .addFilterBy( "notequalAuxAnalysis3", "(AUX_ANALYSIS_3) != ?" ) // NOTEQUAL

         .addFilterBy( "nullAuxAnalysis3",
      "(AUX_ANALYSIS_3 IS NULL OR LENGTH((AUX_ANALYSIS_3)) = 0)" ) // IS NULL

         .addFilterBy( "notnullAuxAnalysis3", "AUX_ANALYSIS_3 IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByAuxAnalysis3Match", "AUX_ANALYSIS_3 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullAuxAnalysis3",
      "((AUX_ANALYSIS_3) = ? OR AUX_ANALYSIS_3 IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INAuxAnalysis3", "AUX_ANALYSIS_3 IN ( ? )" ) // IN

         .addFilterBy( "NOTINAuxAnalysis3", "AUX_ANALYSIS_3 NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "AuxAnalysis3asc", "AUX_ANALYSIS_3 ASC" ) // ORDER ASCENDING

         .addOrderBy( "AuxAnalysis3desc", "AUX_ANALYSIS_3 DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalAuxAnalysis4", "(AUX_ANALYSIS_4) = ?" ) // EQUAL

         .addFilterBy( "notequalAuxAnalysis4", "(AUX_ANALYSIS_4) != ?" ) // NOTEQUAL

         .addFilterBy( "nullAuxAnalysis4",
      "(AUX_ANALYSIS_4 IS NULL OR LENGTH((AUX_ANALYSIS_4)) = 0)" ) // IS NULL

         .addFilterBy( "notnullAuxAnalysis4", "AUX_ANALYSIS_4 IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByAuxAnalysis4Match", "AUX_ANALYSIS_4 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullAuxAnalysis4",
      "((AUX_ANALYSIS_4) = ? OR AUX_ANALYSIS_4 IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INAuxAnalysis4", "AUX_ANALYSIS_4 IN ( ? )" ) // IN

         .addFilterBy( "NOTINAuxAnalysis4", "AUX_ANALYSIS_4 NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "AuxAnalysis4asc", "AUX_ANALYSIS_4 ASC" ) // ORDER ASCENDING

         .addOrderBy( "AuxAnalysis4desc", "AUX_ANALYSIS_4 DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalAuxAnalysis5", "(AUX_ANALYSIS_5) = ?" ) // EQUAL

         .addFilterBy( "notequalAuxAnalysis5", "(AUX_ANALYSIS_5) != ?" ) // NOTEQUAL

         .addFilterBy( "nullAuxAnalysis5",
      "(AUX_ANALYSIS_5 IS NULL OR LENGTH((AUX_ANALYSIS_5)) = 0)" ) // IS NULL

         .addFilterBy( "notnullAuxAnalysis5", "AUX_ANALYSIS_5 IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByAuxAnalysis5Match", "AUX_ANALYSIS_5 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullAuxAnalysis5",
      "((AUX_ANALYSIS_5) = ? OR AUX_ANALYSIS_5 IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INAuxAnalysis5", "AUX_ANALYSIS_5 IN ( ? )" ) // IN

         .addFilterBy( "NOTINAuxAnalysis5", "AUX_ANALYSIS_5 NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "AuxAnalysis5asc", "AUX_ANALYSIS_5 ASC" ) // ORDER ASCENDING

         .addOrderBy( "AuxAnalysis5desc", "AUX_ANALYSIS_5 DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalAuxAnalysis6", "(AUX_ANALYSIS_6) = ?" ) // EQUAL

         .addFilterBy( "notequalAuxAnalysis6", "(AUX_ANALYSIS_6) != ?" ) // NOTEQUAL

         .addFilterBy( "nullAuxAnalysis6",
      "(AUX_ANALYSIS_6 IS NULL OR LENGTH((AUX_ANALYSIS_6)) = 0)" ) // IS NULL

         .addFilterBy( "notnullAuxAnalysis6", "AUX_ANALYSIS_6 IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByAuxAnalysis6Match", "AUX_ANALYSIS_6 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullAuxAnalysis6",
      "((AUX_ANALYSIS_6) = ? OR AUX_ANALYSIS_6 IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INAuxAnalysis6", "AUX_ANALYSIS_6 IN ( ? )" ) // IN

         .addFilterBy( "NOTINAuxAnalysis6", "AUX_ANALYSIS_6 NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "AuxAnalysis6asc", "AUX_ANALYSIS_6 ASC" ) // ORDER ASCENDING

         .addOrderBy( "AuxAnalysis6desc", "AUX_ANALYSIS_6 DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalAuxAnalysis7", "(AUX_ANALYSIS_7) = ?" ) // EQUAL

         .addFilterBy( "notequalAuxAnalysis7", "(AUX_ANALYSIS_7) != ?" ) // NOTEQUAL

         .addFilterBy( "nullAuxAnalysis7",
      "(AUX_ANALYSIS_7 IS NULL OR LENGTH((AUX_ANALYSIS_7)) = 0)" ) // IS NULL

         .addFilterBy( "notnullAuxAnalysis7", "AUX_ANALYSIS_7 IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByAuxAnalysis7Match", "AUX_ANALYSIS_7 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullAuxAnalysis7",
      "((AUX_ANALYSIS_7) = ? OR AUX_ANALYSIS_7 IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INAuxAnalysis7", "AUX_ANALYSIS_7 IN ( ? )" ) // IN

         .addFilterBy( "NOTINAuxAnalysis7", "AUX_ANALYSIS_7 NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "AuxAnalysis7asc", "AUX_ANALYSIS_7 ASC" ) // ORDER ASCENDING

         .addOrderBy( "AuxAnalysis7desc", "AUX_ANALYSIS_7 DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalAuxAnalysis8", "(AUX_ANALYSIS_8) = ?" ) // EQUAL

         .addFilterBy( "notequalAuxAnalysis8", "(AUX_ANALYSIS_8) != ?" ) // NOTEQUAL

         .addFilterBy( "nullAuxAnalysis8",
      "(AUX_ANALYSIS_8 IS NULL OR LENGTH((AUX_ANALYSIS_8)) = 0)" ) // IS NULL

         .addFilterBy( "notnullAuxAnalysis8", "AUX_ANALYSIS_8 IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByAuxAnalysis8Match", "AUX_ANALYSIS_8 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullAuxAnalysis8",
      "((AUX_ANALYSIS_8) = ? OR AUX_ANALYSIS_8 IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INAuxAnalysis8", "AUX_ANALYSIS_8 IN ( ? )" ) // IN

         .addFilterBy( "NOTINAuxAnalysis8", "AUX_ANALYSIS_8 NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "AuxAnalysis8asc", "AUX_ANALYSIS_8 ASC" ) // ORDER ASCENDING

         .addOrderBy( "AuxAnalysis8desc", "AUX_ANALYSIS_8 DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalAuxAnalysis9", "(AUX_ANALYSIS_9) = ?" ) // EQUAL

         .addFilterBy( "notequalAuxAnalysis9", "(AUX_ANALYSIS_9) != ?" ) // NOTEQUAL

         .addFilterBy( "nullAuxAnalysis9",
      "(AUX_ANALYSIS_9 IS NULL OR LENGTH((AUX_ANALYSIS_9)) = 0)" ) // IS NULL

         .addFilterBy( "notnullAuxAnalysis9", "AUX_ANALYSIS_9 IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByAuxAnalysis9Match", "AUX_ANALYSIS_9 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullAuxAnalysis9",
      "((AUX_ANALYSIS_9) = ? OR AUX_ANALYSIS_9 IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INAuxAnalysis9", "AUX_ANALYSIS_9 IN ( ? )" ) // IN

         .addFilterBy( "NOTINAuxAnalysis9", "AUX_ANALYSIS_9 NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "AuxAnalysis9asc", "AUX_ANALYSIS_9 ASC" ) // ORDER ASCENDING

         .addOrderBy( "AuxAnalysis9desc", "AUX_ANALYSIS_9 DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalAuxAnalysis10", "(AUX_ANALYSIS_10) = ?" ) // EQUAL

         .addFilterBy( "notequalAuxAnalysis10", "(AUX_ANALYSIS_10) != ?" ) // NOTEQUAL

         .addFilterBy( "nullAuxAnalysis10",
      "(AUX_ANALYSIS_10 IS NULL OR LENGTH((AUX_ANALYSIS_10)) = 0)" ) // IS NULL

         .addFilterBy( "notnullAuxAnalysis10", "AUX_ANALYSIS_10 IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByAuxAnalysis10Match", "AUX_ANALYSIS_10 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullAuxAnalysis10",
      "((AUX_ANALYSIS_10) = ? OR AUX_ANALYSIS_10 IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INAuxAnalysis10", "AUX_ANALYSIS_10 IN ( ? )" ) // IN

         .addFilterBy( "NOTINAuxAnalysis10", "AUX_ANALYSIS_10 NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "AuxAnalysis10asc", "AUX_ANALYSIS_10 ASC" ) // ORDER ASCENDING

         .addOrderBy( "AuxAnalysis10desc", "AUX_ANALYSIS_10 DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalAuxAnalysis11", "(AUX_ANALYSIS_11) = ?" ) // EQUAL

         .addFilterBy( "notequalAuxAnalysis11", "(AUX_ANALYSIS_11) != ?" ) // NOTEQUAL

         .addFilterBy( "nullAuxAnalysis11",
      "(AUX_ANALYSIS_11 IS NULL OR LENGTH((AUX_ANALYSIS_11)) = 0)" ) // IS NULL

         .addFilterBy( "notnullAuxAnalysis11", "AUX_ANALYSIS_11 IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByAuxAnalysis11Match", "AUX_ANALYSIS_11 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullAuxAnalysis11",
      "((AUX_ANALYSIS_11) = ? OR AUX_ANALYSIS_11 IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INAuxAnalysis11", "AUX_ANALYSIS_11 IN ( ? )" ) // IN

         .addFilterBy( "NOTINAuxAnalysis11", "AUX_ANALYSIS_11 NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "AuxAnalysis11asc", "AUX_ANALYSIS_11 ASC" ) // ORDER ASCENDING

         .addOrderBy( "AuxAnalysis11desc", "AUX_ANALYSIS_11 DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalAuxAnalysis12", "(AUX_ANALYSIS_12) = ?" ) // EQUAL

         .addFilterBy( "notequalAuxAnalysis12", "(AUX_ANALYSIS_12) != ?" ) // NOTEQUAL

         .addFilterBy( "nullAuxAnalysis12",
      "(AUX_ANALYSIS_12 IS NULL OR LENGTH((AUX_ANALYSIS_12)) = 0)" ) // IS NULL

         .addFilterBy( "notnullAuxAnalysis12", "AUX_ANALYSIS_12 IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByAuxAnalysis12Match", "AUX_ANALYSIS_12 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullAuxAnalysis12",
      "((AUX_ANALYSIS_12) = ? OR AUX_ANALYSIS_12 IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INAuxAnalysis12", "AUX_ANALYSIS_12 IN ( ? )" ) // IN

         .addFilterBy( "NOTINAuxAnalysis12", "AUX_ANALYSIS_12 NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "AuxAnalysis12asc", "AUX_ANALYSIS_12 ASC" ) // ORDER ASCENDING

         .addOrderBy( "AuxAnalysis12desc", "AUX_ANALYSIS_12 DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalAuxAnalysis13", "(AUX_ANALYSIS_13) = ?" ) // EQUAL

         .addFilterBy( "notequalAuxAnalysis13", "(AUX_ANALYSIS_13) != ?" ) // NOTEQUAL

         .addFilterBy( "nullAuxAnalysis13",
      "(AUX_ANALYSIS_13 IS NULL OR LENGTH((AUX_ANALYSIS_13)) = 0)" ) // IS NULL

         .addFilterBy( "notnullAuxAnalysis13", "AUX_ANALYSIS_13 IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByAuxAnalysis13Match", "AUX_ANALYSIS_13 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullAuxAnalysis13",
      "((AUX_ANALYSIS_13) = ? OR AUX_ANALYSIS_13 IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INAuxAnalysis13", "AUX_ANALYSIS_13 IN ( ? )" ) // IN

         .addFilterBy( "NOTINAuxAnalysis13", "AUX_ANALYSIS_13 NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "AuxAnalysis13asc", "AUX_ANALYSIS_13 ASC" ) // ORDER ASCENDING

         .addOrderBy( "AuxAnalysis13desc", "AUX_ANALYSIS_13 DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalAuxAnalysis14", "(AUX_ANALYSIS_14) = ?" ) // EQUAL

         .addFilterBy( "notequalAuxAnalysis14", "(AUX_ANALYSIS_14) != ?" ) // NOTEQUAL

         .addFilterBy( "nullAuxAnalysis14",
      "(AUX_ANALYSIS_14 IS NULL OR LENGTH((AUX_ANALYSIS_14)) = 0)" ) // IS NULL

         .addFilterBy( "notnullAuxAnalysis14", "AUX_ANALYSIS_14 IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByAuxAnalysis14Match", "AUX_ANALYSIS_14 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullAuxAnalysis14",
      "((AUX_ANALYSIS_14) = ? OR AUX_ANALYSIS_14 IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INAuxAnalysis14", "AUX_ANALYSIS_14 IN ( ? )" ) // IN

         .addFilterBy( "NOTINAuxAnalysis14", "AUX_ANALYSIS_14 NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "AuxAnalysis14asc", "AUX_ANALYSIS_14 ASC" ) // ORDER ASCENDING

         .addOrderBy( "AuxAnalysis14desc", "AUX_ANALYSIS_14 DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalAuxAnalysis15", "(AUX_ANALYSIS_15) = ?" ) // EQUAL

         .addFilterBy( "notequalAuxAnalysis15", "(AUX_ANALYSIS_15) != ?" ) // NOTEQUAL

         .addFilterBy( "nullAuxAnalysis15",
      "(AUX_ANALYSIS_15 IS NULL OR LENGTH((AUX_ANALYSIS_15)) = 0)" ) // IS NULL

         .addFilterBy( "notnullAuxAnalysis15", "AUX_ANALYSIS_15 IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByAuxAnalysis15Match", "AUX_ANALYSIS_15 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullAuxAnalysis15",
      "((AUX_ANALYSIS_15) = ? OR AUX_ANALYSIS_15 IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INAuxAnalysis15", "AUX_ANALYSIS_15 IN ( ? )" ) // IN

         .addFilterBy( "NOTINAuxAnalysis15", "AUX_ANALYSIS_15 NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "AuxAnalysis15asc", "AUX_ANALYSIS_15 ASC" ) // ORDER ASCENDING

         .addOrderBy( "AuxAnalysis15desc", "AUX_ANALYSIS_15 DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalAuxAnalysis16", "(AUX_ANALYSIS_16) = ?" ) // EQUAL

         .addFilterBy( "notequalAuxAnalysis16", "(AUX_ANALYSIS_16) != ?" ) // NOTEQUAL

         .addFilterBy( "nullAuxAnalysis16",
      "(AUX_ANALYSIS_16 IS NULL OR LENGTH((AUX_ANALYSIS_16)) = 0)" ) // IS NULL

         .addFilterBy( "notnullAuxAnalysis16", "AUX_ANALYSIS_16 IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByAuxAnalysis16Match", "AUX_ANALYSIS_16 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullAuxAnalysis16",
      "((AUX_ANALYSIS_16) = ? OR AUX_ANALYSIS_16 IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INAuxAnalysis16", "AUX_ANALYSIS_16 IN ( ? )" ) // IN

         .addFilterBy( "NOTINAuxAnalysis16", "AUX_ANALYSIS_16 NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "AuxAnalysis16asc", "AUX_ANALYSIS_16 ASC" ) // ORDER ASCENDING

         .addOrderBy( "AuxAnalysis16desc", "AUX_ANALYSIS_16 DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalAuxAnalysis17", "(AUX_ANALYSIS_17) = ?" ) // EQUAL

         .addFilterBy( "notequalAuxAnalysis17", "(AUX_ANALYSIS_17) != ?" ) // NOTEQUAL

         .addFilterBy( "nullAuxAnalysis17",
      "(AUX_ANALYSIS_17 IS NULL OR LENGTH((AUX_ANALYSIS_17)) = 0)" ) // IS NULL

         .addFilterBy( "notnullAuxAnalysis17", "AUX_ANALYSIS_17 IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByAuxAnalysis17Match", "AUX_ANALYSIS_17 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullAuxAnalysis17",
      "((AUX_ANALYSIS_17) = ? OR AUX_ANALYSIS_17 IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INAuxAnalysis17", "AUX_ANALYSIS_17 IN ( ? )" ) // IN

         .addFilterBy( "NOTINAuxAnalysis17", "AUX_ANALYSIS_17 NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "AuxAnalysis17asc", "AUX_ANALYSIS_17 ASC" ) // ORDER ASCENDING

         .addOrderBy( "AuxAnalysis17desc", "AUX_ANALYSIS_17 DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalAuxAnalysis18", "(AUX_ANALYSIS_18) = ?" ) // EQUAL

         .addFilterBy( "notequalAuxAnalysis18", "(AUX_ANALYSIS_18) != ?" ) // NOTEQUAL

         .addFilterBy( "nullAuxAnalysis18",
      "(AUX_ANALYSIS_18 IS NULL OR LENGTH((AUX_ANALYSIS_18)) = 0)" ) // IS NULL

         .addFilterBy( "notnullAuxAnalysis18", "AUX_ANALYSIS_18 IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByAuxAnalysis18Match", "AUX_ANALYSIS_18 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullAuxAnalysis18",
      "((AUX_ANALYSIS_18) = ? OR AUX_ANALYSIS_18 IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INAuxAnalysis18", "AUX_ANALYSIS_18 IN ( ? )" ) // IN

         .addFilterBy( "NOTINAuxAnalysis18", "AUX_ANALYSIS_18 NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "AuxAnalysis18asc", "AUX_ANALYSIS_18 ASC" ) // ORDER ASCENDING

         .addOrderBy( "AuxAnalysis18desc", "AUX_ANALYSIS_18 DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalAuxAnalysis19", "(AUX_ANALYSIS_19) = ?" ) // EQUAL

         .addFilterBy( "notequalAuxAnalysis19", "(AUX_ANALYSIS_19) != ?" ) // NOTEQUAL

         .addFilterBy( "nullAuxAnalysis19",
      "(AUX_ANALYSIS_19 IS NULL OR LENGTH((AUX_ANALYSIS_19)) = 0)" ) // IS NULL

         .addFilterBy( "notnullAuxAnalysis19", "AUX_ANALYSIS_19 IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByAuxAnalysis19Match", "AUX_ANALYSIS_19 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullAuxAnalysis19",
      "((AUX_ANALYSIS_19) = ? OR AUX_ANALYSIS_19 IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INAuxAnalysis19", "AUX_ANALYSIS_19 IN ( ? )" ) // IN

         .addFilterBy( "NOTINAuxAnalysis19", "AUX_ANALYSIS_19 NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "AuxAnalysis19asc", "AUX_ANALYSIS_19 ASC" ) // ORDER ASCENDING

         .addOrderBy( "AuxAnalysis19desc", "AUX_ANALYSIS_19 DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalAuxAnalysis20", "(AUX_ANALYSIS_20) = ?" ) // EQUAL

         .addFilterBy( "notequalAuxAnalysis20", "(AUX_ANALYSIS_20) != ?" ) // NOTEQUAL

         .addFilterBy( "nullAuxAnalysis20",
      "(AUX_ANALYSIS_20 IS NULL OR LENGTH((AUX_ANALYSIS_20)) = 0)" ) // IS NULL

         .addFilterBy( "notnullAuxAnalysis20", "AUX_ANALYSIS_20 IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByAuxAnalysis20Match", "AUX_ANALYSIS_20 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullAuxAnalysis20",
      "((AUX_ANALYSIS_20) = ? OR AUX_ANALYSIS_20 IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INAuxAnalysis20", "AUX_ANALYSIS_20 IN ( ? )" ) // IN

         .addFilterBy( "NOTINAuxAnalysis20", "AUX_ANALYSIS_20 NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "AuxAnalysis20asc", "AUX_ANALYSIS_20 ASC" ) // ORDER ASCENDING

         .addOrderBy( "AuxAnalysis20desc", "AUX_ANALYSIS_20 DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalAuxAnalysis21", "(AUX_ANALYSIS_21) = ?" ) // EQUAL

         .addFilterBy( "notequalAuxAnalysis21", "(AUX_ANALYSIS_21) != ?" ) // NOTEQUAL

         .addFilterBy( "nullAuxAnalysis21",
      "(AUX_ANALYSIS_21 IS NULL OR LENGTH((AUX_ANALYSIS_21)) = 0)" ) // IS NULL

         .addFilterBy( "notnullAuxAnalysis21", "AUX_ANALYSIS_21 IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByAuxAnalysis21Match", "AUX_ANALYSIS_21 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullAuxAnalysis21",
      "((AUX_ANALYSIS_21) = ? OR AUX_ANALYSIS_21 IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INAuxAnalysis21", "AUX_ANALYSIS_21 IN ( ? )" ) // IN

         .addFilterBy( "NOTINAuxAnalysis21", "AUX_ANALYSIS_21 NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "AuxAnalysis21asc", "AUX_ANALYSIS_21 ASC" ) // ORDER ASCENDING

         .addOrderBy( "AuxAnalysis21desc", "AUX_ANALYSIS_21 DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalAuxAnalysis22", "(AUX_ANALYSIS_22) = ?" ) // EQUAL

         .addFilterBy( "notequalAuxAnalysis22", "(AUX_ANALYSIS_22) != ?" ) // NOTEQUAL

         .addFilterBy( "nullAuxAnalysis22",
      "(AUX_ANALYSIS_22 IS NULL OR LENGTH((AUX_ANALYSIS_22)) = 0)" ) // IS NULL

         .addFilterBy( "notnullAuxAnalysis22", "AUX_ANALYSIS_22 IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByAuxAnalysis22Match", "AUX_ANALYSIS_22 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullAuxAnalysis22",
      "((AUX_ANALYSIS_22) = ? OR AUX_ANALYSIS_22 IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INAuxAnalysis22", "AUX_ANALYSIS_22 IN ( ? )" ) // IN

         .addFilterBy( "NOTINAuxAnalysis22", "AUX_ANALYSIS_22 NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "AuxAnalysis22asc", "AUX_ANALYSIS_22 ASC" ) // ORDER ASCENDING

         .addOrderBy( "AuxAnalysis22desc", "AUX_ANALYSIS_22 DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalAuxAnalysis23", "(AUX_ANALYSIS_23) = ?" ) // EQUAL

         .addFilterBy( "notequalAuxAnalysis23", "(AUX_ANALYSIS_23) != ?" ) // NOTEQUAL

         .addFilterBy( "nullAuxAnalysis23",
      "(AUX_ANALYSIS_23 IS NULL OR LENGTH((AUX_ANALYSIS_23)) = 0)" ) // IS NULL

         .addFilterBy( "notnullAuxAnalysis23", "AUX_ANALYSIS_23 IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByAuxAnalysis23Match", "AUX_ANALYSIS_23 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullAuxAnalysis23",
      "((AUX_ANALYSIS_23) = ? OR AUX_ANALYSIS_23 IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INAuxAnalysis23", "AUX_ANALYSIS_23 IN ( ? )" ) // IN

         .addFilterBy( "NOTINAuxAnalysis23", "AUX_ANALYSIS_23 NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "AuxAnalysis23asc", "AUX_ANALYSIS_23 ASC" ) // ORDER ASCENDING

         .addOrderBy( "AuxAnalysis23desc", "AUX_ANALYSIS_23 DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalAuxAnalysis24", "(AUX_ANALYSIS_24) = ?" ) // EQUAL

         .addFilterBy( "notequalAuxAnalysis24", "(AUX_ANALYSIS_24) != ?" ) // NOTEQUAL

         .addFilterBy( "nullAuxAnalysis24",
      "(AUX_ANALYSIS_24 IS NULL OR LENGTH((AUX_ANALYSIS_24)) = 0)" ) // IS NULL

         .addFilterBy( "notnullAuxAnalysis24", "AUX_ANALYSIS_24 IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByAuxAnalysis24Match", "AUX_ANALYSIS_24 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullAuxAnalysis24",
      "((AUX_ANALYSIS_24) = ? OR AUX_ANALYSIS_24 IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INAuxAnalysis24", "AUX_ANALYSIS_24 IN ( ? )" ) // IN

         .addFilterBy( "NOTINAuxAnalysis24", "AUX_ANALYSIS_24 NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "AuxAnalysis24asc", "AUX_ANALYSIS_24 ASC" ) // ORDER ASCENDING

         .addOrderBy( "AuxAnalysis24desc", "AUX_ANALYSIS_24 DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalAuxAnalysis25", "(AUX_ANALYSIS_25) = ?" ) // EQUAL

         .addFilterBy( "notequalAuxAnalysis25", "(AUX_ANALYSIS_25) != ?" ) // NOTEQUAL

         .addFilterBy( "nullAuxAnalysis25",
      "(AUX_ANALYSIS_25 IS NULL OR LENGTH((AUX_ANALYSIS_25)) = 0)" ) // IS NULL

         .addFilterBy( "notnullAuxAnalysis25", "AUX_ANALYSIS_25 IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByAuxAnalysis25Match", "AUX_ANALYSIS_25 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullAuxAnalysis25",
      "((AUX_ANALYSIS_25) = ? OR AUX_ANALYSIS_25 IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INAuxAnalysis25", "AUX_ANALYSIS_25 IN ( ? )" ) // IN

         .addFilterBy( "NOTINAuxAnalysis25", "AUX_ANALYSIS_25 NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "AuxAnalysis25asc", "AUX_ANALYSIS_25 ASC" ) // ORDER ASCENDING

         .addOrderBy( "AuxAnalysis25desc", "AUX_ANALYSIS_25 DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalAuxAnalysis26", "(AUX_ANALYSIS_26) = ?" ) // EQUAL

         .addFilterBy( "notequalAuxAnalysis26", "(AUX_ANALYSIS_26) != ?" ) // NOTEQUAL

         .addFilterBy( "nullAuxAnalysis26",
      "(AUX_ANALYSIS_26 IS NULL OR LENGTH((AUX_ANALYSIS_26)) = 0)" ) // IS NULL

         .addFilterBy( "notnullAuxAnalysis26", "AUX_ANALYSIS_26 IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByAuxAnalysis26Match", "AUX_ANALYSIS_26 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullAuxAnalysis26",
      "((AUX_ANALYSIS_26) = ? OR AUX_ANALYSIS_26 IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INAuxAnalysis26", "AUX_ANALYSIS_26 IN ( ? )" ) // IN

         .addFilterBy( "NOTINAuxAnalysis26", "AUX_ANALYSIS_26 NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "AuxAnalysis26asc", "AUX_ANALYSIS_26 ASC" ) // ORDER ASCENDING

         .addOrderBy( "AuxAnalysis26desc", "AUX_ANALYSIS_26 DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalAuxAnalysis27", "(AUX_ANALYSIS_27) = ?" ) // EQUAL

         .addFilterBy( "notequalAuxAnalysis27", "(AUX_ANALYSIS_27) != ?" ) // NOTEQUAL

         .addFilterBy( "nullAuxAnalysis27",
      "(AUX_ANALYSIS_27 IS NULL OR LENGTH((AUX_ANALYSIS_27)) = 0)" ) // IS NULL

         .addFilterBy( "notnullAuxAnalysis27", "AUX_ANALYSIS_27 IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByAuxAnalysis27Match", "AUX_ANALYSIS_27 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullAuxAnalysis27",
      "((AUX_ANALYSIS_27) = ? OR AUX_ANALYSIS_27 IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INAuxAnalysis27", "AUX_ANALYSIS_27 IN ( ? )" ) // IN

         .addFilterBy( "NOTINAuxAnalysis27", "AUX_ANALYSIS_27 NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "AuxAnalysis27asc", "AUX_ANALYSIS_27 ASC" ) // ORDER ASCENDING

         .addOrderBy( "AuxAnalysis27desc", "AUX_ANALYSIS_27 DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalAuxAnalysis28", "(AUX_ANALYSIS_28) = ?" ) // EQUAL

         .addFilterBy( "notequalAuxAnalysis28", "(AUX_ANALYSIS_28) != ?" ) // NOTEQUAL

         .addFilterBy( "nullAuxAnalysis28",
      "(AUX_ANALYSIS_28 IS NULL OR LENGTH((AUX_ANALYSIS_28)) = 0)" ) // IS NULL

         .addFilterBy( "notnullAuxAnalysis28", "AUX_ANALYSIS_28 IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByAuxAnalysis28Match", "AUX_ANALYSIS_28 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullAuxAnalysis28",
      "((AUX_ANALYSIS_28) = ? OR AUX_ANALYSIS_28 IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INAuxAnalysis28", "AUX_ANALYSIS_28 IN ( ? )" ) // IN

         .addFilterBy( "NOTINAuxAnalysis28", "AUX_ANALYSIS_28 NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "AuxAnalysis28asc", "AUX_ANALYSIS_28 ASC" ) // ORDER ASCENDING

         .addOrderBy( "AuxAnalysis28desc", "AUX_ANALYSIS_28 DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalAuxAnalysis29", "(AUX_ANALYSIS_29) = ?" ) // EQUAL

         .addFilterBy( "notequalAuxAnalysis29", "(AUX_ANALYSIS_29) != ?" ) // NOTEQUAL

         .addFilterBy( "nullAuxAnalysis29",
      "(AUX_ANALYSIS_29 IS NULL OR LENGTH((AUX_ANALYSIS_29)) = 0)" ) // IS NULL

         .addFilterBy( "notnullAuxAnalysis29", "AUX_ANALYSIS_29 IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByAuxAnalysis29Match", "AUX_ANALYSIS_29 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullAuxAnalysis29",
      "((AUX_ANALYSIS_29) = ? OR AUX_ANALYSIS_29 IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INAuxAnalysis29", "AUX_ANALYSIS_29 IN ( ? )" ) // IN

         .addFilterBy( "NOTINAuxAnalysis29", "AUX_ANALYSIS_29 NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "AuxAnalysis29asc", "AUX_ANALYSIS_29 ASC" ) // ORDER ASCENDING

         .addOrderBy( "AuxAnalysis29desc", "AUX_ANALYSIS_29 DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalAuxAnalysis30", "(AUX_ANALYSIS_30) = ?" ) // EQUAL

         .addFilterBy( "notequalAuxAnalysis30", "(AUX_ANALYSIS_30) != ?" ) // NOTEQUAL

         .addFilterBy( "nullAuxAnalysis30",
      "(AUX_ANALYSIS_30 IS NULL OR LENGTH((AUX_ANALYSIS_30)) = 0)" ) // IS NULL

         .addFilterBy( "notnullAuxAnalysis30", "AUX_ANALYSIS_30 IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByAuxAnalysis30Match", "AUX_ANALYSIS_30 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullAuxAnalysis30",
      "((AUX_ANALYSIS_30) = ? OR AUX_ANALYSIS_30 IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INAuxAnalysis30", "AUX_ANALYSIS_30 IN ( ? )" ) // IN

         .addFilterBy( "NOTINAuxAnalysis30", "AUX_ANALYSIS_30 NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "AuxAnalysis30asc", "AUX_ANALYSIS_30 ASC" ) // ORDER ASCENDING

         .addOrderBy( "AuxAnalysis30desc", "AUX_ANALYSIS_30 DESC" ) // ORDER DESCENDING
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
      dml = new AuxCustomersDMLFactory(  );
    }

    return dml;
  }
}
