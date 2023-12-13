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
 * This is the DMLFactory for Slcustm.
 *
 * @version $Revision: 1.1 $
 * @author $Author$
 * @since $jdk$
 */
public class SlcustmAbstractDMLFactory
  extends BaseDMLFactory {
  //~ Static variables/initializers //////////////////////////////////////////

  /** The DMLFactory singleton */
  private static DMLFactory dml = null;

  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new SlcustmAbstractDMLFactory object.
   *
   * @throws DMLException DOCUMENT ME!
   */
  protected SlcustmAbstractDMLFactory(  )
    throws DMLException {
    ;

    DMLTable table = defTable( "Slcustm", // dmlName
        "blo.SlcustmDMO", // dmoName
        "SLCUSTM", // tableName
        93, // numColumns
        "CUSTOMER, ALPHA, NAME, ADDRESS1, ADDRESS2, ADDRESS3, ADDRESS4, ADDRESS5, CREDIT_CATEGORY"
        + ", EXPORT_INDICATOR, CUST_DISC_CODE, CURRENCY, TERRITORY, CLASS, REGION, INVOICE_CUSTOMER, STATEMENT_CUSTOMER, GROUP_CUSTOMER"
        + ", DATE_LAST_ISSUE, DATE_CREATED, ANALYSIS_CODES1, ANALYSIS_CODES2, ANALYSIS_CODES3, ANALYSIS_CODES4, ANALYSIS_CODES5, REMINDER_CAT, SETTLEMENT_CODE"
        + ", SETT_DAYS_CODE, PRICE_LIST, LETTER_CODE, BALANCE_FWD, CREDIT_LIMIT, YTD_SALES, YTD_COST_OF_SALES, CUMULATIVE_SALES, ORDER_BALANCE"
        + ", SALES_NL_CAT, SPECIAL_PRICE, VAT_REGISTRATION, DIRECT_DEBIT, INVOICES_PRINTED, CONSOLIDATED_INV, COMMENT_ONLY_INV, BANK_ACCOUNT_NO, BANK_SORT_CODE"
        + ", BANK_NAME, BANK_ADDRESS1, BANK_ADDRESS2, BANK_ADDRESS3, BANK_ADDRESS4, ANALYSIS_CODE_6, PRODUCE_STATEMENTS, EDI_CUSTOMER, VAT_TYPE"
        + ", LANGUAGE, DELIVERY_METHOD, CARRIER, VAT_REG_NUMBER, VAT_EXE_NUMBER, PAYDAYS1, PAYDAYS2, PAYDAYS3, BANK_BRANCH_CODE"
        + ", PRINT_CP_WITH_STAT, PAYMENT_METHOD, CUSTOMER_CLASS, SALES_TYPE, CP_LOWER_VALUE, ADDRESS6, FAX, TELEX, BTX"
        + ", CP_CHARGE, CONTROL_DIGIT, PAYER, RESPONSIBILITY, DESPATCH_HELD, CREDIT_CONTROLLER, REMINDER_LETTERS, SEVERITY_DAYS1, SEVERITY_DAYS2"
        + ", SEVERITY_DAYS3, SEVERITY_DAYS4, SEVERITY_DAYS5, SEVERITY_DAYS6, DELIVERY_REASON, SHIPPER_CODE1, SHIPPER_CODE2, SHIPPER_CODE3, SHIPPING_NOTE_IND"
        + ", ACCOUNT_TYPE, ADMIN_FEE, INTREST_RATE", // columnList
        "(CUSTOMER)", //primaryKey
        "" // versionCol     
      , false, // generatedKey
        "CUSTOMER, ALPHA, NAME, ADDRESS1, ADDRESS2, ADDRESS3, ADDRESS4, ADDRESS5, CREDIT_CATEGORY"
        + ", EXPORT_INDICATOR, CUST_DISC_CODE, CURRENCY, TERRITORY, CLASS, REGION, INVOICE_CUSTOMER, STATEMENT_CUSTOMER, GROUP_CUSTOMER"
        + ", DATE_LAST_ISSUE, DATE_CREATED, ANALYSIS_CODES1, ANALYSIS_CODES2, ANALYSIS_CODES3, ANALYSIS_CODES4, ANALYSIS_CODES5, REMINDER_CAT, SETTLEMENT_CODE"
        + ", SETT_DAYS_CODE, PRICE_LIST, LETTER_CODE, BALANCE_FWD, CREDIT_LIMIT, YTD_SALES, YTD_COST_OF_SALES, CUMULATIVE_SALES, ORDER_BALANCE"
        + ", SALES_NL_CAT, SPECIAL_PRICE, VAT_REGISTRATION, DIRECT_DEBIT, INVOICES_PRINTED, CONSOLIDATED_INV, COMMENT_ONLY_INV, BANK_ACCOUNT_NO, BANK_SORT_CODE"
        + ", BANK_NAME, BANK_ADDRESS1, BANK_ADDRESS2, BANK_ADDRESS3, BANK_ADDRESS4, ANALYSIS_CODE_6, PRODUCE_STATEMENTS, EDI_CUSTOMER, VAT_TYPE"
        + ", LANGUAGE, DELIVERY_METHOD, CARRIER, VAT_REG_NUMBER, VAT_EXE_NUMBER, PAYDAYS1, PAYDAYS2, PAYDAYS3, BANK_BRANCH_CODE"
        + ", PRINT_CP_WITH_STAT, PAYMENT_METHOD, CUSTOMER_CLASS, SALES_TYPE, CP_LOWER_VALUE, ADDRESS6, FAX, TELEX, BTX"
        + ", CP_CHARGE, CONTROL_DIGIT, PAYER, RESPONSIBILITY, DESPATCH_HELD, CREDIT_CONTROLLER, REMINDER_LETTERS, SEVERITY_DAYS1, SEVERITY_DAYS2"
        + ", SEVERITY_DAYS3, SEVERITY_DAYS4, SEVERITY_DAYS5, SEVERITY_DAYS6, DELIVERY_REASON, SHIPPER_CODE1, SHIPPER_CODE2, SHIPPER_CODE3, SHIPPING_NOTE_IND"
        + ", ACCOUNT_TYPE, ADMIN_FEE, INTREST_RATE", "", "",
        new String[] {
          "CUSTOMER", "ALPHA", "NAME", "ADDRESS1", "ADDRESS2", "ADDRESS3",
          "ADDRESS4", "ADDRESS5", "CREDIT_CATEGORY", "EXPORT_INDICATOR",
          "CUST_DISC_CODE", "CURRENCY", "TERRITORY", "CLASS", "REGION",
          "INVOICE_CUSTOMER", "STATEMENT_CUSTOMER", "GROUP_CUSTOMER",
          "DATE_LAST_ISSUE", "DATE_CREATED", "ANALYSIS_CODES1",
          "ANALYSIS_CODES2", "ANALYSIS_CODES3", "ANALYSIS_CODES4",
          "ANALYSIS_CODES5", "REMINDER_CAT", "SETTLEMENT_CODE",
          "SETT_DAYS_CODE", "PRICE_LIST", "LETTER_CODE", "BALANCE_FWD",
          "CREDIT_LIMIT", "YTD_SALES", "YTD_COST_OF_SALES", "CUMULATIVE_SALES",
          "ORDER_BALANCE", "SALES_NL_CAT", "SPECIAL_PRICE", "VAT_REGISTRATION",
          "DIRECT_DEBIT", "INVOICES_PRINTED", "CONSOLIDATED_INV",
          "COMMENT_ONLY_INV", "BANK_ACCOUNT_NO", "BANK_SORT_CODE", "BANK_NAME",
          "BANK_ADDRESS1", "BANK_ADDRESS2", "BANK_ADDRESS3", "BANK_ADDRESS4",
          "ANALYSIS_CODE_6", "PRODUCE_STATEMENTS", "EDI_CUSTOMER", "VAT_TYPE",
          "LANGUAGE", "DELIVERY_METHOD", "CARRIER", "VAT_REG_NUMBER",
          "VAT_EXE_NUMBER", "PAYDAYS1", "PAYDAYS2", "PAYDAYS3",
          "BANK_BRANCH_CODE", "PRINT_CP_WITH_STAT", "PAYMENT_METHOD",
          "CUSTOMER_CLASS", "SALES_TYPE", "CP_LOWER_VALUE", "ADDRESS6", "FAX",
          "TELEX", "BTX", "CP_CHARGE", "CONTROL_DIGIT", "PAYER",
          "RESPONSIBILITY", "DESPATCH_HELD", "CREDIT_CONTROLLER",
          "REMINDER_LETTERS", "SEVERITY_DAYS1", "SEVERITY_DAYS2",
          "SEVERITY_DAYS3", "SEVERITY_DAYS4", "SEVERITY_DAYS5",
          "SEVERITY_DAYS6", "DELIVERY_REASON", "SHIPPER_CODE1",
          "SHIPPER_CODE2", "SHIPPER_CODE3", "SHIPPING_NOTE_IND",
          "ACCOUNT_TYPE", "ADMIN_FEE", "INTREST_RATE"
        } );

    table.addFilterBy( "equalCustomer", /* PK attribute */
      "(CUSTOMER) = ?" )
         .addFilterBy( "filterByCustomerMatch", "CUSTOMER LIKE ?" )
         .addFilterBy( "INCustomer", "CUSTOMER IN ( ? )" ) // IN

         .addFilterBy( "NOTINCustomer", "CUSTOMER NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "Customerasc", "CUSTOMER ASC" ) // ORDER ASCENDING

         .addOrderBy( "Customerdesc", "CUSTOMER DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalAlpha", "(ALPHA) = ?" ) // EQUAL

         .addFilterBy( "notequalAlpha", "(ALPHA) != ?" ) // NOTEQUAL

         .addFilterBy( "nullAlpha",
      "(ALPHA IS NULL OR LENGTH((ALPHA)) = 0)" ) // IS NULL

         .addFilterBy( "notnullAlpha", "ALPHA IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByAlphaMatch", "ALPHA LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullAlpha",
      "((ALPHA) = ? OR ALPHA IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INAlpha", "ALPHA IN ( ? )" ) // IN

         .addFilterBy( "NOTINAlpha", "ALPHA NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "Alphaasc", "ALPHA ASC" ) // ORDER ASCENDING

         .addOrderBy( "Alphadesc", "ALPHA DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalName", "(NAME) = ?" ) // EQUAL

         .addFilterBy( "notequalName", "(NAME) != ?" ) // NOTEQUAL

         .addFilterBy( "nullName", "(NAME IS NULL OR LENGTH((NAME)) = 0)" ) // IS NULL

         .addFilterBy( "notnullName", "NAME IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByNameMatch", "NAME LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullName", "((NAME) = ? OR NAME IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INName", "NAME IN ( ? )" ) // IN

         .addFilterBy( "NOTINName", "NAME NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "Nameasc", "NAME ASC" ) // ORDER ASCENDING

         .addOrderBy( "Namedesc", "NAME DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalAddress1", "(ADDRESS1) = ?" ) // EQUAL

         .addFilterBy( "notequalAddress1", "(ADDRESS1) != ?" ) // NOTEQUAL

         .addFilterBy( "nullAddress1",
      "(ADDRESS1 IS NULL OR LENGTH((ADDRESS1)) = 0)" ) // IS NULL

         .addFilterBy( "notnullAddress1", "ADDRESS1 IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByAddress1Match", "ADDRESS1 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullAddress1",
      "((ADDRESS1) = ? OR ADDRESS1 IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INAddress1", "ADDRESS1 IN ( ? )" ) // IN

         .addFilterBy( "NOTINAddress1", "ADDRESS1 NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "Address1asc", "ADDRESS1 ASC" ) // ORDER ASCENDING

         .addOrderBy( "Address1desc", "ADDRESS1 DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalAddress2", "(ADDRESS2) = ?" ) // EQUAL

         .addFilterBy( "notequalAddress2", "(ADDRESS2) != ?" ) // NOTEQUAL

         .addFilterBy( "nullAddress2",
      "(ADDRESS2 IS NULL OR LENGTH((ADDRESS2)) = 0)" ) // IS NULL

         .addFilterBy( "notnullAddress2", "ADDRESS2 IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByAddress2Match", "ADDRESS2 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullAddress2",
      "((ADDRESS2) = ? OR ADDRESS2 IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INAddress2", "ADDRESS2 IN ( ? )" ) // IN

         .addFilterBy( "NOTINAddress2", "ADDRESS2 NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "Address2asc", "ADDRESS2 ASC" ) // ORDER ASCENDING

         .addOrderBy( "Address2desc", "ADDRESS2 DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalAddress3", "(ADDRESS3) = ?" ) // EQUAL

         .addFilterBy( "notequalAddress3", "(ADDRESS3) != ?" ) // NOTEQUAL

         .addFilterBy( "nullAddress3",
      "(ADDRESS3 IS NULL OR LENGTH((ADDRESS3)) = 0)" ) // IS NULL

         .addFilterBy( "notnullAddress3", "ADDRESS3 IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByAddress3Match", "ADDRESS3 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullAddress3",
      "((ADDRESS3) = ? OR ADDRESS3 IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INAddress3", "ADDRESS3 IN ( ? )" ) // IN

         .addFilterBy( "NOTINAddress3", "ADDRESS3 NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "Address3asc", "ADDRESS3 ASC" ) // ORDER ASCENDING

         .addOrderBy( "Address3desc", "ADDRESS3 DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalAddress4", "(ADDRESS4) = ?" ) // EQUAL

         .addFilterBy( "notequalAddress4", "(ADDRESS4) != ?" ) // NOTEQUAL

         .addFilterBy( "nullAddress4",
      "(ADDRESS4 IS NULL OR LENGTH((ADDRESS4)) = 0)" ) // IS NULL

         .addFilterBy( "notnullAddress4", "ADDRESS4 IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByAddress4Match", "ADDRESS4 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullAddress4",
      "((ADDRESS4) = ? OR ADDRESS4 IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INAddress4", "ADDRESS4 IN ( ? )" ) // IN

         .addFilterBy( "NOTINAddress4", "ADDRESS4 NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "Address4asc", "ADDRESS4 ASC" ) // ORDER ASCENDING

         .addOrderBy( "Address4desc", "ADDRESS4 DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalAddress5", "(ADDRESS5) = ?" ) // EQUAL

         .addFilterBy( "notequalAddress5", "(ADDRESS5) != ?" ) // NOTEQUAL

         .addFilterBy( "nullAddress5",
      "(ADDRESS5 IS NULL OR LENGTH((ADDRESS5)) = 0)" ) // IS NULL

         .addFilterBy( "notnullAddress5", "ADDRESS5 IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByAddress5Match", "ADDRESS5 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullAddress5",
      "((ADDRESS5) = ? OR ADDRESS5 IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INAddress5", "ADDRESS5 IN ( ? )" ) // IN

         .addFilterBy( "NOTINAddress5", "ADDRESS5 NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "Address5asc", "ADDRESS5 ASC" ) // ORDER ASCENDING

         .addOrderBy( "Address5desc", "ADDRESS5 DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalCreditCategory", "(CREDIT_CATEGORY) = ?" ) // EQUAL

         .addFilterBy( "notequalCreditCategory", "(CREDIT_CATEGORY) != ?" ) // NOTEQUAL

         .addFilterBy( "nullCreditCategory",
      "(CREDIT_CATEGORY IS NULL OR LENGTH((CREDIT_CATEGORY)) = 0)" ) // IS NULL

         .addFilterBy( "notnullCreditCategory", "CREDIT_CATEGORY IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByCreditCategoryMatch", "CREDIT_CATEGORY LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullCreditCategory",
      "((CREDIT_CATEGORY) = ? OR CREDIT_CATEGORY IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INCreditCategory", "CREDIT_CATEGORY IN ( ? )" ) // IN

         .addFilterBy( "NOTINCreditCategory", "CREDIT_CATEGORY NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "CreditCategoryasc", "CREDIT_CATEGORY ASC" ) // ORDER ASCENDING

         .addOrderBy( "CreditCategorydesc", "CREDIT_CATEGORY DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalExportIndicator", "(EXPORT_INDICATOR) = ?" ) // EQUAL

         .addFilterBy( "notequalExportIndicator",
      "(EXPORT_INDICATOR) != ?" ) // NOTEQUAL

         .addFilterBy( "nullExportIndicator",
      "(EXPORT_INDICATOR IS NULL OR LENGTH((EXPORT_INDICATOR)) = 0)" ) // IS NULL

         .addFilterBy( "notnullExportIndicator",
      "EXPORT_INDICATOR IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByExportIndicatorMatch",
      "EXPORT_INDICATOR LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullExportIndicator",
      "((EXPORT_INDICATOR) = ? OR EXPORT_INDICATOR IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INExportIndicator", "EXPORT_INDICATOR IN ( ? )" ) // IN

         .addFilterBy( "NOTINExportIndicator", "EXPORT_INDICATOR NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "ExportIndicatorasc", "EXPORT_INDICATOR ASC" ) // ORDER ASCENDING

         .addOrderBy( "ExportIndicatordesc", "EXPORT_INDICATOR DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalCustDiscCode", "(CUST_DISC_CODE) = ?" ) // EQUAL

         .addFilterBy( "notequalCustDiscCode", "(CUST_DISC_CODE) != ?" ) // NOTEQUAL

         .addFilterBy( "nullCustDiscCode",
      "(CUST_DISC_CODE IS NULL OR LENGTH((CUST_DISC_CODE)) = 0)" ) // IS NULL

         .addFilterBy( "notnullCustDiscCode", "CUST_DISC_CODE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByCustDiscCodeMatch", "CUST_DISC_CODE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullCustDiscCode",
      "((CUST_DISC_CODE) = ? OR CUST_DISC_CODE IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INCustDiscCode", "CUST_DISC_CODE IN ( ? )" ) // IN

         .addFilterBy( "NOTINCustDiscCode", "CUST_DISC_CODE NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "CustDiscCodeasc", "CUST_DISC_CODE ASC" ) // ORDER ASCENDING

         .addOrderBy( "CustDiscCodedesc", "CUST_DISC_CODE DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalCurrency", "(CURRENCY) = ?" ) // EQUAL

         .addFilterBy( "notequalCurrency", "(CURRENCY) != ?" ) // NOTEQUAL

         .addFilterBy( "nullCurrency",
      "(CURRENCY IS NULL OR LENGTH((CURRENCY)) = 0)" ) // IS NULL

         .addFilterBy( "notnullCurrency", "CURRENCY IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByCurrencyMatch", "CURRENCY LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullCurrency",
      "((CURRENCY) = ? OR CURRENCY IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INCurrency", "CURRENCY IN ( ? )" ) // IN

         .addFilterBy( "NOTINCurrency", "CURRENCY NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "Currencyasc", "CURRENCY ASC" ) // ORDER ASCENDING

         .addOrderBy( "Currencydesc", "CURRENCY DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalTerritory", "(TERRITORY) = ?" ) // EQUAL

         .addFilterBy( "notequalTerritory", "(TERRITORY) != ?" ) // NOTEQUAL

         .addFilterBy( "nullTerritory",
      "(TERRITORY IS NULL OR LENGTH((TERRITORY)) = 0)" ) // IS NULL

         .addFilterBy( "notnullTerritory", "TERRITORY IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByTerritoryMatch", "TERRITORY LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullTerritory",
      "((TERRITORY) = ? OR TERRITORY IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INTerritory", "TERRITORY IN ( ? )" ) // IN

         .addFilterBy( "NOTINTerritory", "TERRITORY NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "Territoryasc", "TERRITORY ASC" ) // ORDER ASCENDING

         .addOrderBy( "Territorydesc", "TERRITORY DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalKlass", "(CLASS) = ?" ) // EQUAL

         .addFilterBy( "notequalKlass", "(CLASS) != ?" ) // NOTEQUAL

         .addFilterBy( "nullKlass",
      "(CLASS IS NULL OR LENGTH((CLASS)) = 0)" ) // IS NULL

         .addFilterBy( "notnullKlass", "CLASS IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByKlassMatch", "CLASS LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullKlass",
      "((CLASS) = ? OR CLASS IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INKlass", "CLASS IN ( ? )" ) // IN

         .addFilterBy( "NOTINKlass", "CLASS NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "Klassasc", "CLASS ASC" ) // ORDER ASCENDING

         .addOrderBy( "Klassdesc", "CLASS DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalRegion", "(REGION) = ?" ) // EQUAL

         .addFilterBy( "notequalRegion", "(REGION) != ?" ) // NOTEQUAL

         .addFilterBy( "nullRegion",
      "(REGION IS NULL OR LENGTH((REGION)) = 0)" ) // IS NULL

         .addFilterBy( "notnullRegion", "REGION IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByRegionMatch", "REGION LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullRegion",
      "((REGION) = ? OR REGION IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INRegion", "REGION IN ( ? )" ) // IN

         .addFilterBy( "NOTINRegion", "REGION NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "Regionasc", "REGION ASC" ) // ORDER ASCENDING

         .addOrderBy( "Regiondesc", "REGION DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalInvoiceCustomer", "(INVOICE_CUSTOMER) = ?" ) // EQUAL

         .addFilterBy( "notequalInvoiceCustomer",
      "(INVOICE_CUSTOMER) != ?" ) // NOTEQUAL

         .addFilterBy( "nullInvoiceCustomer",
      "(INVOICE_CUSTOMER IS NULL OR LENGTH((INVOICE_CUSTOMER)) = 0)" ) // IS NULL

         .addFilterBy( "notnullInvoiceCustomer",
      "INVOICE_CUSTOMER IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByInvoiceCustomerMatch",
      "INVOICE_CUSTOMER LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullInvoiceCustomer",
      "((INVOICE_CUSTOMER) = ? OR INVOICE_CUSTOMER IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INInvoiceCustomer", "INVOICE_CUSTOMER IN ( ? )" ) // IN

         .addFilterBy( "NOTINInvoiceCustomer", "INVOICE_CUSTOMER NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "InvoiceCustomerasc", "INVOICE_CUSTOMER ASC" ) // ORDER ASCENDING

         .addOrderBy( "InvoiceCustomerdesc", "INVOICE_CUSTOMER DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalStatementCustomer",
      "(STATEMENT_CUSTOMER) = ?" ) // EQUAL

         .addFilterBy( "notequalStatementCustomer",
      "(STATEMENT_CUSTOMER) != ?" ) // NOTEQUAL

         .addFilterBy( "nullStatementCustomer",
      "(STATEMENT_CUSTOMER IS NULL OR LENGTH((STATEMENT_CUSTOMER)) = 0)" ) // IS NULL

         .addFilterBy( "notnullStatementCustomer",
      "STATEMENT_CUSTOMER IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByStatementCustomerMatch",
      "STATEMENT_CUSTOMER LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullStatementCustomer",
      "((STATEMENT_CUSTOMER) = ? OR STATEMENT_CUSTOMER IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INStatementCustomer", "STATEMENT_CUSTOMER IN ( ? )" ) // IN

         .addFilterBy( "NOTINStatementCustomer",
      "STATEMENT_CUSTOMER NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "StatementCustomerasc", "STATEMENT_CUSTOMER ASC" ) // ORDER ASCENDING

         .addOrderBy( "StatementCustomerdesc", "STATEMENT_CUSTOMER DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalGroupCustomer", "(GROUP_CUSTOMER) = ?" ) // EQUAL

         .addFilterBy( "notequalGroupCustomer", "(GROUP_CUSTOMER) != ?" ) // NOTEQUAL

         .addFilterBy( "nullGroupCustomer",
      "(GROUP_CUSTOMER IS NULL OR LENGTH((GROUP_CUSTOMER)) = 0)" ) // IS NULL

         .addFilterBy( "notnullGroupCustomer", "GROUP_CUSTOMER IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByGroupCustomerMatch", "GROUP_CUSTOMER LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullGroupCustomer",
      "((GROUP_CUSTOMER) = ? OR GROUP_CUSTOMER IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INGroupCustomer", "GROUP_CUSTOMER IN ( ? )" ) // IN

         .addFilterBy( "NOTINGroupCustomer", "GROUP_CUSTOMER NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "GroupCustomerasc", "GROUP_CUSTOMER ASC" ) // ORDER ASCENDING

         .addOrderBy( "GroupCustomerdesc", "GROUP_CUSTOMER DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalDateLastIssue", "DATE_LAST_ISSUE = ?" ) // EQUAL

         .addFilterBy( "notequalDateLastIssue", "DATE_LAST_ISSUE != ?" ) // NOTEQUAL

         .addFilterBy( "nullDateLastIssue", "DATE_LAST_ISSUE IS NULL" ) // IS NULL

         .addFilterBy( "notnullDateLastIssue", "DATE_LAST_ISSUE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanDateLastIssue", "DATE_LAST_ISSUE < ?" ) // LESS THAN

         .addFilterBy( "greaterthanDateLastIssue", "DATE_LAST_ISSUE > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalDateLastIssue", "DATE_LAST_ISSUE <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalDateLastIssue",
      "DATE_LAST_ISSUE >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "betweenDateLastIssue",
      "DATE_LAST_ISSUE BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullDateLastIssue",
      "(DATE_LAST_ISSUE IS NULL OR DATE_LAST_ISSUE = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullDateLastIssue",
      "(DATE_LAST_ISSUE IS NULL OR DATE_LAST_ISSUE < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullDateLastIssue",
      "(DATE_LAST_ISSUE IS NULL OR DATE_LAST_ISSUE > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INDateLastIssue", "DATE_LAST_ISSUE IN ( ? )" ) // IN

         .addFilterBy( "NOTINDateLastIssue", "DATE_LAST_ISSUE NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "DateLastIssueasc", "DATE_LAST_ISSUE ASC" ) // ORDER ASCENDING

         .addOrderBy( "DateLastIssuedesc", "DATE_LAST_ISSUE DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalDateCreated", "DATE_CREATED = ?" ) // EQUAL

         .addFilterBy( "notequalDateCreated", "DATE_CREATED != ?" ) // NOTEQUAL

         .addFilterBy( "nullDateCreated", "DATE_CREATED IS NULL" ) // IS NULL

         .addFilterBy( "notnullDateCreated", "DATE_CREATED IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanDateCreated", "DATE_CREATED < ?" ) // LESS THAN

         .addFilterBy( "greaterthanDateCreated", "DATE_CREATED > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalDateCreated", "DATE_CREATED <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalDateCreated", "DATE_CREATED >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "betweenDateCreated", "DATE_CREATED BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullDateCreated",
      "(DATE_CREATED IS NULL OR DATE_CREATED = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullDateCreated",
      "(DATE_CREATED IS NULL OR DATE_CREATED < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullDateCreated",
      "(DATE_CREATED IS NULL OR DATE_CREATED > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INDateCreated", "DATE_CREATED IN ( ? )" ) // IN

         .addFilterBy( "NOTINDateCreated", "DATE_CREATED NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "DateCreatedasc", "DATE_CREATED ASC" ) // ORDER ASCENDING

         .addOrderBy( "DateCreateddesc", "DATE_CREATED DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalAnalysisCodes1", "(ANALYSIS_CODES1) = ?" ) // EQUAL

         .addFilterBy( "notequalAnalysisCodes1", "(ANALYSIS_CODES1) != ?" ) // NOTEQUAL

         .addFilterBy( "nullAnalysisCodes1",
      "(ANALYSIS_CODES1 IS NULL OR LENGTH((ANALYSIS_CODES1)) = 0)" ) // IS NULL

         .addFilterBy( "notnullAnalysisCodes1", "ANALYSIS_CODES1 IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByAnalysisCodes1Match", "ANALYSIS_CODES1 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullAnalysisCodes1",
      "((ANALYSIS_CODES1) = ? OR ANALYSIS_CODES1 IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INAnalysisCodes1", "ANALYSIS_CODES1 IN ( ? )" ) // IN

         .addFilterBy( "NOTINAnalysisCodes1", "ANALYSIS_CODES1 NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "AnalysisCodes1asc", "ANALYSIS_CODES1 ASC" ) // ORDER ASCENDING

         .addOrderBy( "AnalysisCodes1desc", "ANALYSIS_CODES1 DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalAnalysisCodes2", "(ANALYSIS_CODES2) = ?" ) // EQUAL

         .addFilterBy( "notequalAnalysisCodes2", "(ANALYSIS_CODES2) != ?" ) // NOTEQUAL

         .addFilterBy( "nullAnalysisCodes2",
      "(ANALYSIS_CODES2 IS NULL OR LENGTH((ANALYSIS_CODES2)) = 0)" ) // IS NULL

         .addFilterBy( "notnullAnalysisCodes2", "ANALYSIS_CODES2 IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByAnalysisCodes2Match", "ANALYSIS_CODES2 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullAnalysisCodes2",
      "((ANALYSIS_CODES2) = ? OR ANALYSIS_CODES2 IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INAnalysisCodes2", "ANALYSIS_CODES2 IN ( ? )" ) // IN

         .addFilterBy( "NOTINAnalysisCodes2", "ANALYSIS_CODES2 NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "AnalysisCodes2asc", "ANALYSIS_CODES2 ASC" ) // ORDER ASCENDING

         .addOrderBy( "AnalysisCodes2desc", "ANALYSIS_CODES2 DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalAnalysisCodes3", "(ANALYSIS_CODES3) = ?" ) // EQUAL

         .addFilterBy( "notequalAnalysisCodes3", "(ANALYSIS_CODES3) != ?" ) // NOTEQUAL

         .addFilterBy( "nullAnalysisCodes3",
      "(ANALYSIS_CODES3 IS NULL OR LENGTH((ANALYSIS_CODES3)) = 0)" ) // IS NULL

         .addFilterBy( "notnullAnalysisCodes3", "ANALYSIS_CODES3 IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByAnalysisCodes3Match", "ANALYSIS_CODES3 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullAnalysisCodes3",
      "((ANALYSIS_CODES3) = ? OR ANALYSIS_CODES3 IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INAnalysisCodes3", "ANALYSIS_CODES3 IN ( ? )" ) // IN

         .addFilterBy( "NOTINAnalysisCodes3", "ANALYSIS_CODES3 NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "AnalysisCodes3asc", "ANALYSIS_CODES3 ASC" ) // ORDER ASCENDING

         .addOrderBy( "AnalysisCodes3desc", "ANALYSIS_CODES3 DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalAnalysisCodes4", "(ANALYSIS_CODES4) = ?" ) // EQUAL

         .addFilterBy( "notequalAnalysisCodes4", "(ANALYSIS_CODES4) != ?" ) // NOTEQUAL

         .addFilterBy( "nullAnalysisCodes4",
      "(ANALYSIS_CODES4 IS NULL OR LENGTH((ANALYSIS_CODES4)) = 0)" ) // IS NULL

         .addFilterBy( "notnullAnalysisCodes4", "ANALYSIS_CODES4 IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByAnalysisCodes4Match", "ANALYSIS_CODES4 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullAnalysisCodes4",
      "((ANALYSIS_CODES4) = ? OR ANALYSIS_CODES4 IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INAnalysisCodes4", "ANALYSIS_CODES4 IN ( ? )" ) // IN

         .addFilterBy( "NOTINAnalysisCodes4", "ANALYSIS_CODES4 NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "AnalysisCodes4asc", "ANALYSIS_CODES4 ASC" ) // ORDER ASCENDING

         .addOrderBy( "AnalysisCodes4desc", "ANALYSIS_CODES4 DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalAnalysisCodes5", "(ANALYSIS_CODES5) = ?" ) // EQUAL

         .addFilterBy( "notequalAnalysisCodes5", "(ANALYSIS_CODES5) != ?" ) // NOTEQUAL

         .addFilterBy( "nullAnalysisCodes5",
      "(ANALYSIS_CODES5 IS NULL OR LENGTH((ANALYSIS_CODES5)) = 0)" ) // IS NULL

         .addFilterBy( "notnullAnalysisCodes5", "ANALYSIS_CODES5 IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByAnalysisCodes5Match", "ANALYSIS_CODES5 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullAnalysisCodes5",
      "((ANALYSIS_CODES5) = ? OR ANALYSIS_CODES5 IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INAnalysisCodes5", "ANALYSIS_CODES5 IN ( ? )" ) // IN

         .addFilterBy( "NOTINAnalysisCodes5", "ANALYSIS_CODES5 NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "AnalysisCodes5asc", "ANALYSIS_CODES5 ASC" ) // ORDER ASCENDING

         .addOrderBy( "AnalysisCodes5desc", "ANALYSIS_CODES5 DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalReminderCat", "(REMINDER_CAT) = ?" ) // EQUAL

         .addFilterBy( "notequalReminderCat", "(REMINDER_CAT) != ?" ) // NOTEQUAL

         .addFilterBy( "nullReminderCat",
      "(REMINDER_CAT IS NULL OR LENGTH((REMINDER_CAT)) = 0)" ) // IS NULL

         .addFilterBy( "notnullReminderCat", "REMINDER_CAT IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByReminderCatMatch", "REMINDER_CAT LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullReminderCat",
      "((REMINDER_CAT) = ? OR REMINDER_CAT IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INReminderCat", "REMINDER_CAT IN ( ? )" ) // IN

         .addFilterBy( "NOTINReminderCat", "REMINDER_CAT NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "ReminderCatasc", "REMINDER_CAT ASC" ) // ORDER ASCENDING

         .addOrderBy( "ReminderCatdesc", "REMINDER_CAT DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalSettlementCode", "(SETTLEMENT_CODE) = ?" ) // EQUAL

         .addFilterBy( "notequalSettlementCode", "(SETTLEMENT_CODE) != ?" ) // NOTEQUAL

         .addFilterBy( "nullSettlementCode",
      "(SETTLEMENT_CODE IS NULL OR LENGTH((SETTLEMENT_CODE)) = 0)" ) // IS NULL

         .addFilterBy( "notnullSettlementCode", "SETTLEMENT_CODE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterBySettlementCodeMatch", "SETTLEMENT_CODE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullSettlementCode",
      "((SETTLEMENT_CODE) = ? OR SETTLEMENT_CODE IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INSettlementCode", "SETTLEMENT_CODE IN ( ? )" ) // IN

         .addFilterBy( "NOTINSettlementCode", "SETTLEMENT_CODE NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "SettlementCodeasc", "SETTLEMENT_CODE ASC" ) // ORDER ASCENDING

         .addOrderBy( "SettlementCodedesc", "SETTLEMENT_CODE DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalSettDaysCode", "(SETT_DAYS_CODE) = ?" ) // EQUAL

         .addFilterBy( "notequalSettDaysCode", "(SETT_DAYS_CODE) != ?" ) // NOTEQUAL

         .addFilterBy( "nullSettDaysCode",
      "(SETT_DAYS_CODE IS NULL OR LENGTH((SETT_DAYS_CODE)) = 0)" ) // IS NULL

         .addFilterBy( "notnullSettDaysCode", "SETT_DAYS_CODE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterBySettDaysCodeMatch", "SETT_DAYS_CODE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullSettDaysCode",
      "((SETT_DAYS_CODE) = ? OR SETT_DAYS_CODE IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INSettDaysCode", "SETT_DAYS_CODE IN ( ? )" ) // IN

         .addFilterBy( "NOTINSettDaysCode", "SETT_DAYS_CODE NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "SettDaysCodeasc", "SETT_DAYS_CODE ASC" ) // ORDER ASCENDING

         .addOrderBy( "SettDaysCodedesc", "SETT_DAYS_CODE DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalPriceList", "(PRICE_LIST) = ?" ) // EQUAL

         .addFilterBy( "notequalPriceList", "(PRICE_LIST) != ?" ) // NOTEQUAL

         .addFilterBy( "nullPriceList",
      "(PRICE_LIST IS NULL OR LENGTH((PRICE_LIST)) = 0)" ) // IS NULL

         .addFilterBy( "notnullPriceList", "PRICE_LIST IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByPriceListMatch", "PRICE_LIST LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullPriceList",
      "((PRICE_LIST) = ? OR PRICE_LIST IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INPriceList", "PRICE_LIST IN ( ? )" ) // IN

         .addFilterBy( "NOTINPriceList", "PRICE_LIST NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "PriceListasc", "PRICE_LIST ASC" ) // ORDER ASCENDING

         .addOrderBy( "PriceListdesc", "PRICE_LIST DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalLetterCode", "(LETTER_CODE) = ?" ) // EQUAL

         .addFilterBy( "notequalLetterCode", "(LETTER_CODE) != ?" ) // NOTEQUAL

         .addFilterBy( "nullLetterCode",
      "(LETTER_CODE IS NULL OR LENGTH((LETTER_CODE)) = 0)" ) // IS NULL

         .addFilterBy( "notnullLetterCode", "LETTER_CODE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByLetterCodeMatch", "LETTER_CODE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullLetterCode",
      "((LETTER_CODE) = ? OR LETTER_CODE IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INLetterCode", "LETTER_CODE IN ( ? )" ) // IN

         .addFilterBy( "NOTINLetterCode", "LETTER_CODE NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "LetterCodeasc", "LETTER_CODE ASC" ) // ORDER ASCENDING

         .addOrderBy( "LetterCodedesc", "LETTER_CODE DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalBalanceFwd", "(BALANCE_FWD) = ?" ) // EQUAL

         .addFilterBy( "notequalBalanceFwd", "(BALANCE_FWD) != ?" ) // NOTEQUAL

         .addFilterBy( "nullBalanceFwd",
      "(BALANCE_FWD IS NULL OR LENGTH((BALANCE_FWD)) = 0)" ) // IS NULL

         .addFilterBy( "notnullBalanceFwd", "BALANCE_FWD IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByBalanceFwdMatch", "BALANCE_FWD LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullBalanceFwd",
      "((BALANCE_FWD) = ? OR BALANCE_FWD IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INBalanceFwd", "BALANCE_FWD IN ( ? )" ) // IN

         .addFilterBy( "NOTINBalanceFwd", "BALANCE_FWD NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "BalanceFwdasc", "BALANCE_FWD ASC" ) // ORDER ASCENDING

         .addOrderBy( "BalanceFwddesc", "BALANCE_FWD DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalCreditLimit", "CREDIT_LIMIT = ?" ) // EQUAL

         .addFilterBy( "notequalCreditLimit", "CREDIT_LIMIT != ?" ) // NOTEQUAL

         .addFilterBy( "nullCreditLimit", "CREDIT_LIMIT IS NULL" ) // IS NULL

         .addFilterBy( "notnullCreditLimit", "CREDIT_LIMIT IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanCreditLimit", "CREDIT_LIMIT < ?" ) // LESS THAN

         .addFilterBy( "greaterthanCreditLimit", "CREDIT_LIMIT > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalCreditLimit", "CREDIT_LIMIT <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalCreditLimit", "CREDIT_LIMIT >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "betweenCreditLimit", "CREDIT_LIMIT BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullCreditLimit",
      "(CREDIT_LIMIT IS NULL OR CREDIT_LIMIT = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullCreditLimit",
      "(CREDIT_LIMIT IS NULL OR CREDIT_LIMIT < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullCreditLimit",
      "(CREDIT_LIMIT IS NULL OR CREDIT_LIMIT > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INCreditLimit", "CREDIT_LIMIT IN ( ? )" ) // IN

         .addFilterBy( "NOTINCreditLimit", "CREDIT_LIMIT NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "CreditLimitasc", "CREDIT_LIMIT ASC" ) // ORDER ASCENDING

         .addOrderBy( "CreditLimitdesc", "CREDIT_LIMIT DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalYtdSales", "YTD_SALES = ?" ) // EQUAL

         .addFilterBy( "notequalYtdSales", "YTD_SALES != ?" ) // NOTEQUAL

         .addFilterBy( "nullYtdSales", "YTD_SALES IS NULL" ) // IS NULL

         .addFilterBy( "notnullYtdSales", "YTD_SALES IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanYtdSales", "YTD_SALES < ?" ) // LESS THAN

         .addFilterBy( "greaterthanYtdSales", "YTD_SALES > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalYtdSales", "YTD_SALES <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalYtdSales", "YTD_SALES >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "betweenYtdSales", "YTD_SALES BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullYtdSales",
      "(YTD_SALES IS NULL OR YTD_SALES = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullYtdSales",
      "(YTD_SALES IS NULL OR YTD_SALES < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullYtdSales",
      "(YTD_SALES IS NULL OR YTD_SALES > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INYtdSales", "YTD_SALES IN ( ? )" ) // IN

         .addFilterBy( "NOTINYtdSales", "YTD_SALES NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "YtdSalesasc", "YTD_SALES ASC" ) // ORDER ASCENDING

         .addOrderBy( "YtdSalesdesc", "YTD_SALES DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalYtdCostOfSales", "YTD_COST_OF_SALES = ?" ) // EQUAL

         .addFilterBy( "notequalYtdCostOfSales", "YTD_COST_OF_SALES != ?" ) // NOTEQUAL

         .addFilterBy( "nullYtdCostOfSales", "YTD_COST_OF_SALES IS NULL" ) // IS NULL

         .addFilterBy( "notnullYtdCostOfSales",
      "YTD_COST_OF_SALES IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanYtdCostOfSales", "YTD_COST_OF_SALES < ?" ) // LESS THAN

         .addFilterBy( "greaterthanYtdCostOfSales", "YTD_COST_OF_SALES > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalYtdCostOfSales",
      "YTD_COST_OF_SALES <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalYtdCostOfSales",
      "YTD_COST_OF_SALES >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "betweenYtdCostOfSales",
      "YTD_COST_OF_SALES BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullYtdCostOfSales",
      "(YTD_COST_OF_SALES IS NULL OR YTD_COST_OF_SALES = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullYtdCostOfSales",
      "(YTD_COST_OF_SALES IS NULL OR YTD_COST_OF_SALES < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullYtdCostOfSales",
      "(YTD_COST_OF_SALES IS NULL OR YTD_COST_OF_SALES > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INYtdCostOfSales", "YTD_COST_OF_SALES IN ( ? )" ) // IN

         .addFilterBy( "NOTINYtdCostOfSales", "YTD_COST_OF_SALES NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "YtdCostOfSalesasc", "YTD_COST_OF_SALES ASC" ) // ORDER ASCENDING

         .addOrderBy( "YtdCostOfSalesdesc", "YTD_COST_OF_SALES DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalCumulativeSales", "CUMULATIVE_SALES = ?" ) // EQUAL

         .addFilterBy( "notequalCumulativeSales", "CUMULATIVE_SALES != ?" ) // NOTEQUAL

         .addFilterBy( "nullCumulativeSales", "CUMULATIVE_SALES IS NULL" ) // IS NULL

         .addFilterBy( "notnullCumulativeSales",
      "CUMULATIVE_SALES IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanCumulativeSales", "CUMULATIVE_SALES < ?" ) // LESS THAN

         .addFilterBy( "greaterthanCumulativeSales", "CUMULATIVE_SALES > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalCumulativeSales",
      "CUMULATIVE_SALES <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalCumulativeSales",
      "CUMULATIVE_SALES >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "betweenCumulativeSales",
      "CUMULATIVE_SALES BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullCumulativeSales",
      "(CUMULATIVE_SALES IS NULL OR CUMULATIVE_SALES = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullCumulativeSales",
      "(CUMULATIVE_SALES IS NULL OR CUMULATIVE_SALES < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullCumulativeSales",
      "(CUMULATIVE_SALES IS NULL OR CUMULATIVE_SALES > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INCumulativeSales", "CUMULATIVE_SALES IN ( ? )" ) // IN

         .addFilterBy( "NOTINCumulativeSales", "CUMULATIVE_SALES NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "CumulativeSalesasc", "CUMULATIVE_SALES ASC" ) // ORDER ASCENDING

         .addOrderBy( "CumulativeSalesdesc", "CUMULATIVE_SALES DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalOrderBalance", "ORDER_BALANCE = ?" ) // EQUAL

         .addFilterBy( "notequalOrderBalance", "ORDER_BALANCE != ?" ) // NOTEQUAL

         .addFilterBy( "nullOrderBalance", "ORDER_BALANCE IS NULL" ) // IS NULL

         .addFilterBy( "notnullOrderBalance", "ORDER_BALANCE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanOrderBalance", "ORDER_BALANCE < ?" ) // LESS THAN

         .addFilterBy( "greaterthanOrderBalance", "ORDER_BALANCE > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalOrderBalance", "ORDER_BALANCE <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalOrderBalance", "ORDER_BALANCE >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "betweenOrderBalance", "ORDER_BALANCE BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullOrderBalance",
      "(ORDER_BALANCE IS NULL OR ORDER_BALANCE = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullOrderBalance",
      "(ORDER_BALANCE IS NULL OR ORDER_BALANCE < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullOrderBalance",
      "(ORDER_BALANCE IS NULL OR ORDER_BALANCE > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INOrderBalance", "ORDER_BALANCE IN ( ? )" ) // IN

         .addFilterBy( "NOTINOrderBalance", "ORDER_BALANCE NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "OrderBalanceasc", "ORDER_BALANCE ASC" ) // ORDER ASCENDING

         .addOrderBy( "OrderBalancedesc", "ORDER_BALANCE DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalSalesNlCat", "(SALES_NL_CAT) = ?" ) // EQUAL

         .addFilterBy( "notequalSalesNlCat", "(SALES_NL_CAT) != ?" ) // NOTEQUAL

         .addFilterBy( "nullSalesNlCat",
      "(SALES_NL_CAT IS NULL OR LENGTH((SALES_NL_CAT)) = 0)" ) // IS NULL

         .addFilterBy( "notnullSalesNlCat", "SALES_NL_CAT IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterBySalesNlCatMatch", "SALES_NL_CAT LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullSalesNlCat",
      "((SALES_NL_CAT) = ? OR SALES_NL_CAT IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INSalesNlCat", "SALES_NL_CAT IN ( ? )" ) // IN

         .addFilterBy( "NOTINSalesNlCat", "SALES_NL_CAT NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "SalesNlCatasc", "SALES_NL_CAT ASC" ) // ORDER ASCENDING

         .addOrderBy( "SalesNlCatdesc", "SALES_NL_CAT DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalSpecialPrice", "(SPECIAL_PRICE) = ?" ) // EQUAL

         .addFilterBy( "notequalSpecialPrice", "(SPECIAL_PRICE) != ?" ) // NOTEQUAL

         .addFilterBy( "nullSpecialPrice",
      "(SPECIAL_PRICE IS NULL OR LENGTH((SPECIAL_PRICE)) = 0)" ) // IS NULL

         .addFilterBy( "notnullSpecialPrice", "SPECIAL_PRICE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterBySpecialPriceMatch", "SPECIAL_PRICE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullSpecialPrice",
      "((SPECIAL_PRICE) = ? OR SPECIAL_PRICE IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INSpecialPrice", "SPECIAL_PRICE IN ( ? )" ) // IN

         .addFilterBy( "NOTINSpecialPrice", "SPECIAL_PRICE NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "SpecialPriceasc", "SPECIAL_PRICE ASC" ) // ORDER ASCENDING

         .addOrderBy( "SpecialPricedesc", "SPECIAL_PRICE DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalVatRegistration", "(VAT_REGISTRATION) = ?" ) // EQUAL

         .addFilterBy( "notequalVatRegistration",
      "(VAT_REGISTRATION) != ?" ) // NOTEQUAL

         .addFilterBy( "nullVatRegistration",
      "(VAT_REGISTRATION IS NULL OR LENGTH((VAT_REGISTRATION)) = 0)" ) // IS NULL

         .addFilterBy( "notnullVatRegistration",
      "VAT_REGISTRATION IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByVatRegistrationMatch",
      "VAT_REGISTRATION LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullVatRegistration",
      "((VAT_REGISTRATION) = ? OR VAT_REGISTRATION IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INVatRegistration", "VAT_REGISTRATION IN ( ? )" ) // IN

         .addFilterBy( "NOTINVatRegistration", "VAT_REGISTRATION NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "VatRegistrationasc", "VAT_REGISTRATION ASC" ) // ORDER ASCENDING

         .addOrderBy( "VatRegistrationdesc", "VAT_REGISTRATION DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalDirectDebit", "(DIRECT_DEBIT) = ?" ) // EQUAL

         .addFilterBy( "notequalDirectDebit", "(DIRECT_DEBIT) != ?" ) // NOTEQUAL

         .addFilterBy( "nullDirectDebit",
      "(DIRECT_DEBIT IS NULL OR LENGTH((DIRECT_DEBIT)) = 0)" ) // IS NULL

         .addFilterBy( "notnullDirectDebit", "DIRECT_DEBIT IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByDirectDebitMatch", "DIRECT_DEBIT LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullDirectDebit",
      "((DIRECT_DEBIT) = ? OR DIRECT_DEBIT IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INDirectDebit", "DIRECT_DEBIT IN ( ? )" ) // IN

         .addFilterBy( "NOTINDirectDebit", "DIRECT_DEBIT NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "DirectDebitasc", "DIRECT_DEBIT ASC" ) // ORDER ASCENDING

         .addOrderBy( "DirectDebitdesc", "DIRECT_DEBIT DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalInvoicesPrinted", "(INVOICES_PRINTED) = ?" ) // EQUAL

         .addFilterBy( "notequalInvoicesPrinted",
      "(INVOICES_PRINTED) != ?" ) // NOTEQUAL

         .addFilterBy( "nullInvoicesPrinted",
      "(INVOICES_PRINTED IS NULL OR LENGTH((INVOICES_PRINTED)) = 0)" ) // IS NULL

         .addFilterBy( "notnullInvoicesPrinted",
      "INVOICES_PRINTED IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByInvoicesPrintedMatch",
      "INVOICES_PRINTED LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullInvoicesPrinted",
      "((INVOICES_PRINTED) = ? OR INVOICES_PRINTED IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INInvoicesPrinted", "INVOICES_PRINTED IN ( ? )" ) // IN

         .addFilterBy( "NOTINInvoicesPrinted", "INVOICES_PRINTED NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "InvoicesPrintedasc", "INVOICES_PRINTED ASC" ) // ORDER ASCENDING

         .addOrderBy( "InvoicesPrinteddesc", "INVOICES_PRINTED DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalConsolidatedInv", "(CONSOLIDATED_INV) = ?" ) // EQUAL

         .addFilterBy( "notequalConsolidatedInv",
      "(CONSOLIDATED_INV) != ?" ) // NOTEQUAL

         .addFilterBy( "nullConsolidatedInv",
      "(CONSOLIDATED_INV IS NULL OR LENGTH((CONSOLIDATED_INV)) = 0)" ) // IS NULL

         .addFilterBy( "notnullConsolidatedInv",
      "CONSOLIDATED_INV IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByConsolidatedInvMatch",
      "CONSOLIDATED_INV LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullConsolidatedInv",
      "((CONSOLIDATED_INV) = ? OR CONSOLIDATED_INV IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INConsolidatedInv", "CONSOLIDATED_INV IN ( ? )" ) // IN

         .addFilterBy( "NOTINConsolidatedInv", "CONSOLIDATED_INV NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "ConsolidatedInvasc", "CONSOLIDATED_INV ASC" ) // ORDER ASCENDING

         .addOrderBy( "ConsolidatedInvdesc", "CONSOLIDATED_INV DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalCommentOnlyInv", "(COMMENT_ONLY_INV) = ?" ) // EQUAL

         .addFilterBy( "notequalCommentOnlyInv", "(COMMENT_ONLY_INV) != ?" ) // NOTEQUAL

         .addFilterBy( "nullCommentOnlyInv",
      "(COMMENT_ONLY_INV IS NULL OR LENGTH((COMMENT_ONLY_INV)) = 0)" ) // IS NULL

         .addFilterBy( "notnullCommentOnlyInv", "COMMENT_ONLY_INV IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByCommentOnlyInvMatch",
      "COMMENT_ONLY_INV LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullCommentOnlyInv",
      "((COMMENT_ONLY_INV) = ? OR COMMENT_ONLY_INV IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INCommentOnlyInv", "COMMENT_ONLY_INV IN ( ? )" ) // IN

         .addFilterBy( "NOTINCommentOnlyInv", "COMMENT_ONLY_INV NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "CommentOnlyInvasc", "COMMENT_ONLY_INV ASC" ) // ORDER ASCENDING

         .addOrderBy( "CommentOnlyInvdesc", "COMMENT_ONLY_INV DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalBankAccountNo", "(BANK_ACCOUNT_NO) = ?" ) // EQUAL

         .addFilterBy( "notequalBankAccountNo", "(BANK_ACCOUNT_NO) != ?" ) // NOTEQUAL

         .addFilterBy( "nullBankAccountNo",
      "(BANK_ACCOUNT_NO IS NULL OR LENGTH((BANK_ACCOUNT_NO)) = 0)" ) // IS NULL

         .addFilterBy( "notnullBankAccountNo", "BANK_ACCOUNT_NO IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByBankAccountNoMatch", "BANK_ACCOUNT_NO LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullBankAccountNo",
      "((BANK_ACCOUNT_NO) = ? OR BANK_ACCOUNT_NO IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INBankAccountNo", "BANK_ACCOUNT_NO IN ( ? )" ) // IN

         .addFilterBy( "NOTINBankAccountNo", "BANK_ACCOUNT_NO NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "BankAccountNoasc", "BANK_ACCOUNT_NO ASC" ) // ORDER ASCENDING

         .addOrderBy( "BankAccountNodesc", "BANK_ACCOUNT_NO DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalBankSortCode", "(BANK_SORT_CODE) = ?" ) // EQUAL

         .addFilterBy( "notequalBankSortCode", "(BANK_SORT_CODE) != ?" ) // NOTEQUAL

         .addFilterBy( "nullBankSortCode",
      "(BANK_SORT_CODE IS NULL OR LENGTH((BANK_SORT_CODE)) = 0)" ) // IS NULL

         .addFilterBy( "notnullBankSortCode", "BANK_SORT_CODE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByBankSortCodeMatch", "BANK_SORT_CODE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullBankSortCode",
      "((BANK_SORT_CODE) = ? OR BANK_SORT_CODE IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INBankSortCode", "BANK_SORT_CODE IN ( ? )" ) // IN

         .addFilterBy( "NOTINBankSortCode", "BANK_SORT_CODE NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "BankSortCodeasc", "BANK_SORT_CODE ASC" ) // ORDER ASCENDING

         .addOrderBy( "BankSortCodedesc", "BANK_SORT_CODE DESC" ) // ORDER DESCENDING
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

    table.addFilterBy( "equalBankAddress1", "(BANK_ADDRESS1) = ?" ) // EQUAL

         .addFilterBy( "notequalBankAddress1", "(BANK_ADDRESS1) != ?" ) // NOTEQUAL

         .addFilterBy( "nullBankAddress1",
      "(BANK_ADDRESS1 IS NULL OR LENGTH((BANK_ADDRESS1)) = 0)" ) // IS NULL

         .addFilterBy( "notnullBankAddress1", "BANK_ADDRESS1 IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByBankAddress1Match", "BANK_ADDRESS1 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullBankAddress1",
      "((BANK_ADDRESS1) = ? OR BANK_ADDRESS1 IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INBankAddress1", "BANK_ADDRESS1 IN ( ? )" ) // IN

         .addFilterBy( "NOTINBankAddress1", "BANK_ADDRESS1 NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "BankAddress1asc", "BANK_ADDRESS1 ASC" ) // ORDER ASCENDING

         .addOrderBy( "BankAddress1desc", "BANK_ADDRESS1 DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalBankAddress2", "(BANK_ADDRESS2) = ?" ) // EQUAL

         .addFilterBy( "notequalBankAddress2", "(BANK_ADDRESS2) != ?" ) // NOTEQUAL

         .addFilterBy( "nullBankAddress2",
      "(BANK_ADDRESS2 IS NULL OR LENGTH((BANK_ADDRESS2)) = 0)" ) // IS NULL

         .addFilterBy( "notnullBankAddress2", "BANK_ADDRESS2 IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByBankAddress2Match", "BANK_ADDRESS2 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullBankAddress2",
      "((BANK_ADDRESS2) = ? OR BANK_ADDRESS2 IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INBankAddress2", "BANK_ADDRESS2 IN ( ? )" ) // IN

         .addFilterBy( "NOTINBankAddress2", "BANK_ADDRESS2 NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "BankAddress2asc", "BANK_ADDRESS2 ASC" ) // ORDER ASCENDING

         .addOrderBy( "BankAddress2desc", "BANK_ADDRESS2 DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalBankAddress3", "(BANK_ADDRESS3) = ?" ) // EQUAL

         .addFilterBy( "notequalBankAddress3", "(BANK_ADDRESS3) != ?" ) // NOTEQUAL

         .addFilterBy( "nullBankAddress3",
      "(BANK_ADDRESS3 IS NULL OR LENGTH((BANK_ADDRESS3)) = 0)" ) // IS NULL

         .addFilterBy( "notnullBankAddress3", "BANK_ADDRESS3 IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByBankAddress3Match", "BANK_ADDRESS3 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullBankAddress3",
      "((BANK_ADDRESS3) = ? OR BANK_ADDRESS3 IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INBankAddress3", "BANK_ADDRESS3 IN ( ? )" ) // IN

         .addFilterBy( "NOTINBankAddress3", "BANK_ADDRESS3 NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "BankAddress3asc", "BANK_ADDRESS3 ASC" ) // ORDER ASCENDING

         .addOrderBy( "BankAddress3desc", "BANK_ADDRESS3 DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalBankAddress4", "(BANK_ADDRESS4) = ?" ) // EQUAL

         .addFilterBy( "notequalBankAddress4", "(BANK_ADDRESS4) != ?" ) // NOTEQUAL

         .addFilterBy( "nullBankAddress4",
      "(BANK_ADDRESS4 IS NULL OR LENGTH((BANK_ADDRESS4)) = 0)" ) // IS NULL

         .addFilterBy( "notnullBankAddress4", "BANK_ADDRESS4 IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByBankAddress4Match", "BANK_ADDRESS4 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullBankAddress4",
      "((BANK_ADDRESS4) = ? OR BANK_ADDRESS4 IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INBankAddress4", "BANK_ADDRESS4 IN ( ? )" ) // IN

         .addFilterBy( "NOTINBankAddress4", "BANK_ADDRESS4 NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "BankAddress4asc", "BANK_ADDRESS4 ASC" ) // ORDER ASCENDING

         .addOrderBy( "BankAddress4desc", "BANK_ADDRESS4 DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalAnalysisCode6", "(ANALYSIS_CODE_6) = ?" ) // EQUAL

         .addFilterBy( "notequalAnalysisCode6", "(ANALYSIS_CODE_6) != ?" ) // NOTEQUAL

         .addFilterBy( "nullAnalysisCode6",
      "(ANALYSIS_CODE_6 IS NULL OR LENGTH((ANALYSIS_CODE_6)) = 0)" ) // IS NULL

         .addFilterBy( "notnullAnalysisCode6", "ANALYSIS_CODE_6 IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByAnalysisCode6Match", "ANALYSIS_CODE_6 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullAnalysisCode6",
      "((ANALYSIS_CODE_6) = ? OR ANALYSIS_CODE_6 IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INAnalysisCode6", "ANALYSIS_CODE_6 IN ( ? )" ) // IN

         .addFilterBy( "NOTINAnalysisCode6", "ANALYSIS_CODE_6 NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "AnalysisCode6asc", "ANALYSIS_CODE_6 ASC" ) // ORDER ASCENDING

         .addOrderBy( "AnalysisCode6desc", "ANALYSIS_CODE_6 DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalProduceStatements",
      "(PRODUCE_STATEMENTS) = ?" ) // EQUAL

         .addFilterBy( "notequalProduceStatements",
      "(PRODUCE_STATEMENTS) != ?" ) // NOTEQUAL

         .addFilterBy( "nullProduceStatements",
      "(PRODUCE_STATEMENTS IS NULL OR LENGTH((PRODUCE_STATEMENTS)) = 0)" ) // IS NULL

         .addFilterBy( "notnullProduceStatements",
      "PRODUCE_STATEMENTS IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByProduceStatementsMatch",
      "PRODUCE_STATEMENTS LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullProduceStatements",
      "((PRODUCE_STATEMENTS) = ? OR PRODUCE_STATEMENTS IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INProduceStatements", "PRODUCE_STATEMENTS IN ( ? )" ) // IN

         .addFilterBy( "NOTINProduceStatements",
      "PRODUCE_STATEMENTS NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "ProduceStatementsasc", "PRODUCE_STATEMENTS ASC" ) // ORDER ASCENDING

         .addOrderBy( "ProduceStatementsdesc", "PRODUCE_STATEMENTS DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalEdiCustomer", "(EDI_CUSTOMER) = ?" ) // EQUAL

         .addFilterBy( "notequalEdiCustomer", "(EDI_CUSTOMER) != ?" ) // NOTEQUAL

         .addFilterBy( "nullEdiCustomer",
      "(EDI_CUSTOMER IS NULL OR LENGTH((EDI_CUSTOMER)) = 0)" ) // IS NULL

         .addFilterBy( "notnullEdiCustomer", "EDI_CUSTOMER IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByEdiCustomerMatch", "EDI_CUSTOMER LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullEdiCustomer",
      "((EDI_CUSTOMER) = ? OR EDI_CUSTOMER IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INEdiCustomer", "EDI_CUSTOMER IN ( ? )" ) // IN

         .addFilterBy( "NOTINEdiCustomer", "EDI_CUSTOMER NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "EdiCustomerasc", "EDI_CUSTOMER ASC" ) // ORDER ASCENDING

         .addOrderBy( "EdiCustomerdesc", "EDI_CUSTOMER DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalVatType", "(VAT_TYPE) = ?" ) // EQUAL

         .addFilterBy( "notequalVatType", "(VAT_TYPE) != ?" ) // NOTEQUAL

         .addFilterBy( "nullVatType",
      "(VAT_TYPE IS NULL OR LENGTH((VAT_TYPE)) = 0)" ) // IS NULL

         .addFilterBy( "notnullVatType", "VAT_TYPE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByVatTypeMatch", "VAT_TYPE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullVatType",
      "((VAT_TYPE) = ? OR VAT_TYPE IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INVatType", "VAT_TYPE IN ( ? )" ) // IN

         .addFilterBy( "NOTINVatType", "VAT_TYPE NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "VatTypeasc", "VAT_TYPE ASC" ) // ORDER ASCENDING

         .addOrderBy( "VatTypedesc", "VAT_TYPE DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalLanguage", "(LANGUAGE) = ?" ) // EQUAL

         .addFilterBy( "notequalLanguage", "(LANGUAGE) != ?" ) // NOTEQUAL

         .addFilterBy( "nullLanguage", "(LANGUAGE IS NULL OR LENGTH((LANGUAGE)) = 0)" ) // IS NULL

         .addFilterBy( "notnullLanguage", "LANGUAGE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByLanguageMatch", "LANGUAGE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullLanguage", "((LANGUAGE) = ? OR LANGUAGE IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INLanguage", "LANGUAGE IN ( ? )" ) // IN

         .addFilterBy( "NOTINLanguage", "LANGUAGE NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "Languageasc", "LANGUAGE ASC" ) // ORDER ASCENDING

         .addOrderBy( "Languagedesc", "LANGUAGE DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalDeliveryMethod", "(DELIVERY_METHOD) = ?" ) // EQUAL

         .addFilterBy( "notequalDeliveryMethod", "(DELIVERY_METHOD) != ?" ) // NOTEQUAL

         .addFilterBy( "nullDeliveryMethod",
      "(DELIVERY_METHOD IS NULL OR LENGTH((DELIVERY_METHOD)) = 0)" ) // IS NULL

         .addFilterBy( "notnullDeliveryMethod", "DELIVERY_METHOD IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByDeliveryMethodMatch", "DELIVERY_METHOD LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullDeliveryMethod",
      "((DELIVERY_METHOD) = ? OR DELIVERY_METHOD IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INDeliveryMethod", "DELIVERY_METHOD IN ( ? )" ) // IN

         .addFilterBy( "NOTINDeliveryMethod", "DELIVERY_METHOD NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "DeliveryMethodasc", "DELIVERY_METHOD ASC" ) // ORDER ASCENDING

         .addOrderBy( "DeliveryMethoddesc", "DELIVERY_METHOD DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalCarrier", "(CARRIER) = ?" ) // EQUAL

         .addFilterBy( "notequalCarrier", "(CARRIER) != ?" ) // NOTEQUAL

         .addFilterBy( "nullCarrier",
      "(CARRIER IS NULL OR LENGTH((CARRIER)) = 0)" ) // IS NULL

         .addFilterBy( "notnullCarrier", "CARRIER IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByCarrierMatch", "CARRIER LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullCarrier",
      "((CARRIER) = ? OR CARRIER IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INCarrier", "CARRIER IN ( ? )" ) // IN

         .addFilterBy( "NOTINCarrier", "CARRIER NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "Carrierasc", "CARRIER ASC" ) // ORDER ASCENDING

         .addOrderBy( "Carrierdesc", "CARRIER DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalVatRegNumber", "(VAT_REG_NUMBER) = ?" ) // EQUAL

         .addFilterBy( "notequalVatRegNumber", "(VAT_REG_NUMBER) != ?" ) // NOTEQUAL

         .addFilterBy( "nullVatRegNumber",
      "(VAT_REG_NUMBER IS NULL OR LENGTH((VAT_REG_NUMBER)) = 0)" ) // IS NULL

         .addFilterBy( "notnullVatRegNumber", "VAT_REG_NUMBER IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByVatRegNumberMatch", "VAT_REG_NUMBER LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullVatRegNumber",
      "((VAT_REG_NUMBER) = ? OR VAT_REG_NUMBER IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INVatRegNumber", "VAT_REG_NUMBER IN ( ? )" ) // IN

         .addFilterBy( "NOTINVatRegNumber", "VAT_REG_NUMBER NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "VatRegNumberasc", "VAT_REG_NUMBER ASC" ) // ORDER ASCENDING

         .addOrderBy( "VatRegNumberdesc", "VAT_REG_NUMBER DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalVatExeNumber", "(VAT_EXE_NUMBER) = ?" ) // EQUAL

         .addFilterBy( "notequalVatExeNumber", "(VAT_EXE_NUMBER) != ?" ) // NOTEQUAL

         .addFilterBy( "nullVatExeNumber",
      "(VAT_EXE_NUMBER IS NULL OR LENGTH((VAT_EXE_NUMBER)) = 0)" ) // IS NULL

         .addFilterBy( "notnullVatExeNumber", "VAT_EXE_NUMBER IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByVatExeNumberMatch", "VAT_EXE_NUMBER LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullVatExeNumber",
      "((VAT_EXE_NUMBER) = ? OR VAT_EXE_NUMBER IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INVatExeNumber", "VAT_EXE_NUMBER IN ( ? )" ) // IN

         .addFilterBy( "NOTINVatExeNumber", "VAT_EXE_NUMBER NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "VatExeNumberasc", "VAT_EXE_NUMBER ASC" ) // ORDER ASCENDING

         .addOrderBy( "VatExeNumberdesc", "VAT_EXE_NUMBER DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalPaydays1", "(PAYDAYS1) = ?" ) // EQUAL

         .addFilterBy( "notequalPaydays1", "(PAYDAYS1) != ?" ) // NOTEQUAL

         .addFilterBy( "nullPaydays1",
      "(PAYDAYS1 IS NULL OR LENGTH((PAYDAYS1)) = 0)" ) // IS NULL

         .addFilterBy( "notnullPaydays1", "PAYDAYS1 IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByPaydays1Match", "PAYDAYS1 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullPaydays1",
      "((PAYDAYS1) = ? OR PAYDAYS1 IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INPaydays1", "PAYDAYS1 IN ( ? )" ) // IN

         .addFilterBy( "NOTINPaydays1", "PAYDAYS1 NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "Paydays1asc", "PAYDAYS1 ASC" ) // ORDER ASCENDING

         .addOrderBy( "Paydays1desc", "PAYDAYS1 DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalPaydays2", "(PAYDAYS2) = ?" ) // EQUAL

         .addFilterBy( "notequalPaydays2", "(PAYDAYS2) != ?" ) // NOTEQUAL

         .addFilterBy( "nullPaydays2",
      "(PAYDAYS2 IS NULL OR LENGTH((PAYDAYS2)) = 0)" ) // IS NULL

         .addFilterBy( "notnullPaydays2", "PAYDAYS2 IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByPaydays2Match", "PAYDAYS2 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullPaydays2",
      "((PAYDAYS2) = ? OR PAYDAYS2 IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INPaydays2", "PAYDAYS2 IN ( ? )" ) // IN

         .addFilterBy( "NOTINPaydays2", "PAYDAYS2 NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "Paydays2asc", "PAYDAYS2 ASC" ) // ORDER ASCENDING

         .addOrderBy( "Paydays2desc", "PAYDAYS2 DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalPaydays3", "(PAYDAYS3) = ?" ) // EQUAL

         .addFilterBy( "notequalPaydays3", "(PAYDAYS3) != ?" ) // NOTEQUAL

         .addFilterBy( "nullPaydays3",
      "(PAYDAYS3 IS NULL OR LENGTH((PAYDAYS3)) = 0)" ) // IS NULL

         .addFilterBy( "notnullPaydays3", "PAYDAYS3 IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByPaydays3Match", "PAYDAYS3 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullPaydays3",
      "((PAYDAYS3) = ? OR PAYDAYS3 IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INPaydays3", "PAYDAYS3 IN ( ? )" ) // IN

         .addFilterBy( "NOTINPaydays3", "PAYDAYS3 NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "Paydays3asc", "PAYDAYS3 ASC" ) // ORDER ASCENDING

         .addOrderBy( "Paydays3desc", "PAYDAYS3 DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalBankBranchCode", "(BANK_BRANCH_CODE) = ?" ) // EQUAL

         .addFilterBy( "notequalBankBranchCode", "(BANK_BRANCH_CODE) != ?" ) // NOTEQUAL

         .addFilterBy( "nullBankBranchCode",
      "(BANK_BRANCH_CODE IS NULL OR LENGTH((BANK_BRANCH_CODE)) = 0)" ) // IS NULL

         .addFilterBy( "notnullBankBranchCode", "BANK_BRANCH_CODE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByBankBranchCodeMatch",
      "BANK_BRANCH_CODE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullBankBranchCode",
      "((BANK_BRANCH_CODE) = ? OR BANK_BRANCH_CODE IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INBankBranchCode", "BANK_BRANCH_CODE IN ( ? )" ) // IN

         .addFilterBy( "NOTINBankBranchCode", "BANK_BRANCH_CODE NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "BankBranchCodeasc", "BANK_BRANCH_CODE ASC" ) // ORDER ASCENDING

         .addOrderBy( "BankBranchCodedesc", "BANK_BRANCH_CODE DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalPrintCpWithStat", "(PRINT_CP_WITH_STAT) = ?" ) // EQUAL

         .addFilterBy( "notequalPrintCpWithStat",
      "(PRINT_CP_WITH_STAT) != ?" ) // NOTEQUAL

         .addFilterBy( "nullPrintCpWithStat",
      "(PRINT_CP_WITH_STAT IS NULL OR LENGTH((PRINT_CP_WITH_STAT)) = 0)" ) // IS NULL

         .addFilterBy( "notnullPrintCpWithStat",
      "PRINT_CP_WITH_STAT IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByPrintCpWithStatMatch",
      "PRINT_CP_WITH_STAT LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullPrintCpWithStat",
      "((PRINT_CP_WITH_STAT) = ? OR PRINT_CP_WITH_STAT IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INPrintCpWithStat", "PRINT_CP_WITH_STAT IN ( ? )" ) // IN

         .addFilterBy( "NOTINPrintCpWithStat",
      "PRINT_CP_WITH_STAT NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "PrintCpWithStatasc", "PRINT_CP_WITH_STAT ASC" ) // ORDER ASCENDING

         .addOrderBy( "PrintCpWithStatdesc", "PRINT_CP_WITH_STAT DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalPaymentMethod", "(PAYMENT_METHOD) = ?" ) // EQUAL

         .addFilterBy( "notequalPaymentMethod", "(PAYMENT_METHOD) != ?" ) // NOTEQUAL

         .addFilterBy( "nullPaymentMethod",
      "(PAYMENT_METHOD IS NULL OR LENGTH((PAYMENT_METHOD)) = 0)" ) // IS NULL

         .addFilterBy( "notnullPaymentMethod", "PAYMENT_METHOD IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByPaymentMethodMatch", "PAYMENT_METHOD LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullPaymentMethod",
      "((PAYMENT_METHOD) = ? OR PAYMENT_METHOD IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INPaymentMethod", "PAYMENT_METHOD IN ( ? )" ) // IN

         .addFilterBy( "NOTINPaymentMethod", "PAYMENT_METHOD NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "PaymentMethodasc", "PAYMENT_METHOD ASC" ) // ORDER ASCENDING

         .addOrderBy( "PaymentMethoddesc", "PAYMENT_METHOD DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalCustomerClass", "(CUSTOMER_CLASS) = ?" ) // EQUAL

         .addFilterBy( "notequalCustomerClass", "(CUSTOMER_CLASS) != ?" ) // NOTEQUAL

         .addFilterBy( "nullCustomerClass",
      "(CUSTOMER_CLASS IS NULL OR LENGTH((CUSTOMER_CLASS)) = 0)" ) // IS NULL

         .addFilterBy( "notnullCustomerClass", "CUSTOMER_CLASS IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByCustomerClassMatch", "CUSTOMER_CLASS LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullCustomerClass",
      "((CUSTOMER_CLASS) = ? OR CUSTOMER_CLASS IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INCustomerClass", "CUSTOMER_CLASS IN ( ? )" ) // IN

         .addFilterBy( "NOTINCustomerClass", "CUSTOMER_CLASS NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "CustomerClassasc", "CUSTOMER_CLASS ASC" ) // ORDER ASCENDING

         .addOrderBy( "CustomerClassdesc", "CUSTOMER_CLASS DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalSalesType", "(SALES_TYPE) = ?" ) // EQUAL

         .addFilterBy( "notequalSalesType", "(SALES_TYPE) != ?" ) // NOTEQUAL

         .addFilterBy( "nullSalesType",
      "(SALES_TYPE IS NULL OR LENGTH((SALES_TYPE)) = 0)" ) // IS NULL

         .addFilterBy( "notnullSalesType", "SALES_TYPE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterBySalesTypeMatch", "SALES_TYPE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullSalesType",
      "((SALES_TYPE) = ? OR SALES_TYPE IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INSalesType", "SALES_TYPE IN ( ? )" ) // IN

         .addFilterBy( "NOTINSalesType", "SALES_TYPE NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "SalesTypeasc", "SALES_TYPE ASC" ) // ORDER ASCENDING

         .addOrderBy( "SalesTypedesc", "SALES_TYPE DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalCpLowerValue", "CP_LOWER_VALUE = ?" ) // EQUAL

         .addFilterBy( "notequalCpLowerValue", "CP_LOWER_VALUE != ?" ) // NOTEQUAL

         .addFilterBy( "nullCpLowerValue", "CP_LOWER_VALUE IS NULL" ) // IS NULL

         .addFilterBy( "notnullCpLowerValue", "CP_LOWER_VALUE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanCpLowerValue", "CP_LOWER_VALUE < ?" ) // LESS THAN

         .addFilterBy( "greaterthanCpLowerValue", "CP_LOWER_VALUE > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalCpLowerValue", "CP_LOWER_VALUE <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalCpLowerValue", "CP_LOWER_VALUE >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "betweenCpLowerValue", "CP_LOWER_VALUE BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullCpLowerValue",
      "(CP_LOWER_VALUE IS NULL OR CP_LOWER_VALUE = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullCpLowerValue",
      "(CP_LOWER_VALUE IS NULL OR CP_LOWER_VALUE < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullCpLowerValue",
      "(CP_LOWER_VALUE IS NULL OR CP_LOWER_VALUE > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INCpLowerValue", "CP_LOWER_VALUE IN ( ? )" ) // IN

         .addFilterBy( "NOTINCpLowerValue", "CP_LOWER_VALUE NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "CpLowerValueasc", "CP_LOWER_VALUE ASC" ) // ORDER ASCENDING

         .addOrderBy( "CpLowerValuedesc", "CP_LOWER_VALUE DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalAddress6", "(ADDRESS6) = ?" ) // EQUAL

         .addFilterBy( "notequalAddress6", "(ADDRESS6) != ?" ) // NOTEQUAL

         .addFilterBy( "nullAddress6",
      "(ADDRESS6 IS NULL OR LENGTH((ADDRESS6)) = 0)" ) // IS NULL

         .addFilterBy( "notnullAddress6", "ADDRESS6 IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByAddress6Match", "ADDRESS6 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullAddress6",
      "((ADDRESS6) = ? OR ADDRESS6 IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INAddress6", "ADDRESS6 IN ( ? )" ) // IN

         .addFilterBy( "NOTINAddress6", "ADDRESS6 NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "Address6asc", "ADDRESS6 ASC" ) // ORDER ASCENDING

         .addOrderBy( "Address6desc", "ADDRESS6 DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalFax", "(FAX) = ?" ) // EQUAL

         .addFilterBy( "notequalFax", "(FAX) != ?" ) // NOTEQUAL

         .addFilterBy( "nullFax", "(FAX IS NULL OR LENGTH((FAX)) = 0)" ) // IS NULL

         .addFilterBy( "notnullFax", "FAX IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByFaxMatch", "FAX LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullFax", "((FAX) = ? OR FAX IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INFax", "FAX IN ( ? )" ) // IN

         .addFilterBy( "NOTINFax", "FAX NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "Faxasc", "FAX ASC" ) // ORDER ASCENDING

         .addOrderBy( "Faxdesc", "FAX DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalTelex", "(TELEX) = ?" ) // EQUAL

         .addFilterBy( "notequalTelex", "(TELEX) != ?" ) // NOTEQUAL

         .addFilterBy( "nullTelex",
      "(TELEX IS NULL OR LENGTH((TELEX)) = 0)" ) // IS NULL

         .addFilterBy( "notnullTelex", "TELEX IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByTelexMatch", "TELEX LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullTelex",
      "((TELEX) = ? OR TELEX IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INTelex", "TELEX IN ( ? )" ) // IN

         .addFilterBy( "NOTINTelex", "TELEX NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "Telexasc", "TELEX ASC" ) // ORDER ASCENDING

         .addOrderBy( "Telexdesc", "TELEX DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalBtx", "(BTX) = ?" ) // EQUAL

         .addFilterBy( "notequalBtx", "(BTX) != ?" ) // NOTEQUAL

         .addFilterBy( "nullBtx", "(BTX IS NULL OR LENGTH((BTX)) = 0)" ) // IS NULL

         .addFilterBy( "notnullBtx", "BTX IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByBtxMatch", "BTX LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullBtx", "((BTX) = ? OR BTX IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INBtx", "BTX IN ( ? )" ) // IN

         .addFilterBy( "NOTINBtx", "BTX NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "Btxasc", "BTX ASC" ) // ORDER ASCENDING

         .addOrderBy( "Btxdesc", "BTX DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalCpCharge", "(CP_CHARGE) = ?" ) // EQUAL

         .addFilterBy( "notequalCpCharge", "(CP_CHARGE) != ?" ) // NOTEQUAL

         .addFilterBy( "nullCpCharge",
      "(CP_CHARGE IS NULL OR LENGTH((CP_CHARGE)) = 0)" ) // IS NULL

         .addFilterBy( "notnullCpCharge", "CP_CHARGE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByCpChargeMatch", "CP_CHARGE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullCpCharge",
      "((CP_CHARGE) = ? OR CP_CHARGE IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INCpCharge", "CP_CHARGE IN ( ? )" ) // IN

         .addFilterBy( "NOTINCpCharge", "CP_CHARGE NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "CpChargeasc", "CP_CHARGE ASC" ) // ORDER ASCENDING

         .addOrderBy( "CpChargedesc", "CP_CHARGE DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalControlDigit", "(CONTROL_DIGIT) = ?" ) // EQUAL

         .addFilterBy( "notequalControlDigit", "(CONTROL_DIGIT) != ?" ) // NOTEQUAL

         .addFilterBy( "nullControlDigit",
      "(CONTROL_DIGIT IS NULL OR LENGTH((CONTROL_DIGIT)) = 0)" ) // IS NULL

         .addFilterBy( "notnullControlDigit", "CONTROL_DIGIT IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByControlDigitMatch", "CONTROL_DIGIT LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullControlDigit",
      "((CONTROL_DIGIT) = ? OR CONTROL_DIGIT IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INControlDigit", "CONTROL_DIGIT IN ( ? )" ) // IN

         .addFilterBy( "NOTINControlDigit", "CONTROL_DIGIT NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "ControlDigitasc", "CONTROL_DIGIT ASC" ) // ORDER ASCENDING

         .addOrderBy( "ControlDigitdesc", "CONTROL_DIGIT DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalPayer", "(PAYER) = ?" ) // EQUAL

         .addFilterBy( "notequalPayer", "(PAYER) != ?" ) // NOTEQUAL

         .addFilterBy( "nullPayer",
      "(PAYER IS NULL OR LENGTH((PAYER)) = 0)" ) // IS NULL

         .addFilterBy( "notnullPayer", "PAYER IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByPayerMatch", "PAYER LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullPayer",
      "((PAYER) = ? OR PAYER IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INPayer", "PAYER IN ( ? )" ) // IN

         .addFilterBy( "NOTINPayer", "PAYER NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "Payerasc", "PAYER ASC" ) // ORDER ASCENDING

         .addOrderBy( "Payerdesc", "PAYER DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalResponsibility", "(RESPONSIBILITY) = ?" ) // EQUAL

         .addFilterBy( "notequalResponsibility", "(RESPONSIBILITY) != ?" ) // NOTEQUAL

         .addFilterBy( "nullResponsibility",
      "(RESPONSIBILITY IS NULL OR LENGTH((RESPONSIBILITY)) = 0)" ) // IS NULL

         .addFilterBy( "notnullResponsibility", "RESPONSIBILITY IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByResponsibilityMatch", "RESPONSIBILITY LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullResponsibility",
      "((RESPONSIBILITY) = ? OR RESPONSIBILITY IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INResponsibility", "RESPONSIBILITY IN ( ? )" ) // IN

         .addFilterBy( "NOTINResponsibility", "RESPONSIBILITY NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "Responsibilityasc", "RESPONSIBILITY ASC" ) // ORDER ASCENDING

         .addOrderBy( "Responsibilitydesc", "RESPONSIBILITY DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalDespatchHeld", "(DESPATCH_HELD) = ?" ) // EQUAL

         .addFilterBy( "notequalDespatchHeld", "(DESPATCH_HELD) != ?" ) // NOTEQUAL

         .addFilterBy( "nullDespatchHeld",
      "(DESPATCH_HELD IS NULL OR LENGTH((DESPATCH_HELD)) = 0)" ) // IS NULL

         .addFilterBy( "notnullDespatchHeld", "DESPATCH_HELD IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByDespatchHeldMatch", "DESPATCH_HELD LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullDespatchHeld",
      "((DESPATCH_HELD) = ? OR DESPATCH_HELD IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INDespatchHeld", "DESPATCH_HELD IN ( ? )" ) // IN

         .addFilterBy( "NOTINDespatchHeld", "DESPATCH_HELD NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "DespatchHeldasc", "DESPATCH_HELD ASC" ) // ORDER ASCENDING

         .addOrderBy( "DespatchHelddesc", "DESPATCH_HELD DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalCreditController", "(CREDIT_CONTROLLER) = ?" ) // EQUAL

         .addFilterBy( "notequalCreditController",
      "(CREDIT_CONTROLLER) != ?" ) // NOTEQUAL

         .addFilterBy( "nullCreditController",
      "(CREDIT_CONTROLLER IS NULL OR LENGTH((CREDIT_CONTROLLER)) = 0)" ) // IS NULL

         .addFilterBy( "notnullCreditController",
      "CREDIT_CONTROLLER IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByCreditControllerMatch",
      "CREDIT_CONTROLLER LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullCreditController",
      "((CREDIT_CONTROLLER) = ? OR CREDIT_CONTROLLER IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INCreditController", "CREDIT_CONTROLLER IN ( ? )" ) // IN

         .addFilterBy( "NOTINCreditController",
      "CREDIT_CONTROLLER NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "CreditControllerasc", "CREDIT_CONTROLLER ASC" ) // ORDER ASCENDING

         .addOrderBy( "CreditControllerdesc", "CREDIT_CONTROLLER DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalReminderLetters", "(REMINDER_LETTERS) = ?" ) // EQUAL

         .addFilterBy( "notequalReminderLetters",
      "(REMINDER_LETTERS) != ?" ) // NOTEQUAL

         .addFilterBy( "nullReminderLetters",
      "(REMINDER_LETTERS IS NULL OR LENGTH((REMINDER_LETTERS)) = 0)" ) // IS NULL

         .addFilterBy( "notnullReminderLetters",
      "REMINDER_LETTERS IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByReminderLettersMatch",
      "REMINDER_LETTERS LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullReminderLetters",
      "((REMINDER_LETTERS) = ? OR REMINDER_LETTERS IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INReminderLetters", "REMINDER_LETTERS IN ( ? )" ) // IN

         .addFilterBy( "NOTINReminderLetters", "REMINDER_LETTERS NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "ReminderLettersasc", "REMINDER_LETTERS ASC" ) // ORDER ASCENDING

         .addOrderBy( "ReminderLettersdesc", "REMINDER_LETTERS DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalSeverityDays1", "SEVERITY_DAYS1 = ?" ) // EQUAL

         .addFilterBy( "notequalSeverityDays1", "SEVERITY_DAYS1 != ?" ) // NOTEQUAL

         .addFilterBy( "nullSeverityDays1", "SEVERITY_DAYS1 IS NULL" ) // IS NULL

         .addFilterBy( "notnullSeverityDays1", "SEVERITY_DAYS1 IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanSeverityDays1", "SEVERITY_DAYS1 < ?" ) // LESS THAN

         .addFilterBy( "greaterthanSeverityDays1", "SEVERITY_DAYS1 > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalSeverityDays1", "SEVERITY_DAYS1 <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalSeverityDays1",
      "SEVERITY_DAYS1 >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "betweenSeverityDays1",
      "SEVERITY_DAYS1 BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullSeverityDays1",
      "(SEVERITY_DAYS1 IS NULL OR SEVERITY_DAYS1 = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullSeverityDays1",
      "(SEVERITY_DAYS1 IS NULL OR SEVERITY_DAYS1 < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullSeverityDays1",
      "(SEVERITY_DAYS1 IS NULL OR SEVERITY_DAYS1 > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INSeverityDays1", "SEVERITY_DAYS1 IN ( ? )" ) // IN

         .addFilterBy( "NOTINSeverityDays1", "SEVERITY_DAYS1 NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "SeverityDays1asc", "SEVERITY_DAYS1 ASC" ) // ORDER ASCENDING

         .addOrderBy( "SeverityDays1desc", "SEVERITY_DAYS1 DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalSeverityDays2", "SEVERITY_DAYS2 = ?" ) // EQUAL

         .addFilterBy( "notequalSeverityDays2", "SEVERITY_DAYS2 != ?" ) // NOTEQUAL

         .addFilterBy( "nullSeverityDays2", "SEVERITY_DAYS2 IS NULL" ) // IS NULL

         .addFilterBy( "notnullSeverityDays2", "SEVERITY_DAYS2 IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanSeverityDays2", "SEVERITY_DAYS2 < ?" ) // LESS THAN

         .addFilterBy( "greaterthanSeverityDays2", "SEVERITY_DAYS2 > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalSeverityDays2", "SEVERITY_DAYS2 <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalSeverityDays2",
      "SEVERITY_DAYS2 >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "betweenSeverityDays2",
      "SEVERITY_DAYS2 BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullSeverityDays2",
      "(SEVERITY_DAYS2 IS NULL OR SEVERITY_DAYS2 = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullSeverityDays2",
      "(SEVERITY_DAYS2 IS NULL OR SEVERITY_DAYS2 < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullSeverityDays2",
      "(SEVERITY_DAYS2 IS NULL OR SEVERITY_DAYS2 > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INSeverityDays2", "SEVERITY_DAYS2 IN ( ? )" ) // IN

         .addFilterBy( "NOTINSeverityDays2", "SEVERITY_DAYS2 NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "SeverityDays2asc", "SEVERITY_DAYS2 ASC" ) // ORDER ASCENDING

         .addOrderBy( "SeverityDays2desc", "SEVERITY_DAYS2 DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalSeverityDays3", "SEVERITY_DAYS3 = ?" ) // EQUAL

         .addFilterBy( "notequalSeverityDays3", "SEVERITY_DAYS3 != ?" ) // NOTEQUAL

         .addFilterBy( "nullSeverityDays3", "SEVERITY_DAYS3 IS NULL" ) // IS NULL

         .addFilterBy( "notnullSeverityDays3", "SEVERITY_DAYS3 IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanSeverityDays3", "SEVERITY_DAYS3 < ?" ) // LESS THAN

         .addFilterBy( "greaterthanSeverityDays3", "SEVERITY_DAYS3 > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalSeverityDays3", "SEVERITY_DAYS3 <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalSeverityDays3",
      "SEVERITY_DAYS3 >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "betweenSeverityDays3",
      "SEVERITY_DAYS3 BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullSeverityDays3",
      "(SEVERITY_DAYS3 IS NULL OR SEVERITY_DAYS3 = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullSeverityDays3",
      "(SEVERITY_DAYS3 IS NULL OR SEVERITY_DAYS3 < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullSeverityDays3",
      "(SEVERITY_DAYS3 IS NULL OR SEVERITY_DAYS3 > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INSeverityDays3", "SEVERITY_DAYS3 IN ( ? )" ) // IN

         .addFilterBy( "NOTINSeverityDays3", "SEVERITY_DAYS3 NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "SeverityDays3asc", "SEVERITY_DAYS3 ASC" ) // ORDER ASCENDING

         .addOrderBy( "SeverityDays3desc", "SEVERITY_DAYS3 DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalSeverityDays4", "SEVERITY_DAYS4 = ?" ) // EQUAL

         .addFilterBy( "notequalSeverityDays4", "SEVERITY_DAYS4 != ?" ) // NOTEQUAL

         .addFilterBy( "nullSeverityDays4", "SEVERITY_DAYS4 IS NULL" ) // IS NULL

         .addFilterBy( "notnullSeverityDays4", "SEVERITY_DAYS4 IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanSeverityDays4", "SEVERITY_DAYS4 < ?" ) // LESS THAN

         .addFilterBy( "greaterthanSeverityDays4", "SEVERITY_DAYS4 > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalSeverityDays4", "SEVERITY_DAYS4 <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalSeverityDays4",
      "SEVERITY_DAYS4 >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "betweenSeverityDays4",
      "SEVERITY_DAYS4 BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullSeverityDays4",
      "(SEVERITY_DAYS4 IS NULL OR SEVERITY_DAYS4 = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullSeverityDays4",
      "(SEVERITY_DAYS4 IS NULL OR SEVERITY_DAYS4 < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullSeverityDays4",
      "(SEVERITY_DAYS4 IS NULL OR SEVERITY_DAYS4 > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INSeverityDays4", "SEVERITY_DAYS4 IN ( ? )" ) // IN

         .addFilterBy( "NOTINSeverityDays4", "SEVERITY_DAYS4 NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "SeverityDays4asc", "SEVERITY_DAYS4 ASC" ) // ORDER ASCENDING

         .addOrderBy( "SeverityDays4desc", "SEVERITY_DAYS4 DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalSeverityDays5", "SEVERITY_DAYS5 = ?" ) // EQUAL

         .addFilterBy( "notequalSeverityDays5", "SEVERITY_DAYS5 != ?" ) // NOTEQUAL

         .addFilterBy( "nullSeverityDays5", "SEVERITY_DAYS5 IS NULL" ) // IS NULL

         .addFilterBy( "notnullSeverityDays5", "SEVERITY_DAYS5 IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanSeverityDays5", "SEVERITY_DAYS5 < ?" ) // LESS THAN

         .addFilterBy( "greaterthanSeverityDays5", "SEVERITY_DAYS5 > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalSeverityDays5", "SEVERITY_DAYS5 <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalSeverityDays5",
      "SEVERITY_DAYS5 >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "betweenSeverityDays5",
      "SEVERITY_DAYS5 BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullSeverityDays5",
      "(SEVERITY_DAYS5 IS NULL OR SEVERITY_DAYS5 = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullSeverityDays5",
      "(SEVERITY_DAYS5 IS NULL OR SEVERITY_DAYS5 < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullSeverityDays5",
      "(SEVERITY_DAYS5 IS NULL OR SEVERITY_DAYS5 > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INSeverityDays5", "SEVERITY_DAYS5 IN ( ? )" ) // IN

         .addFilterBy( "NOTINSeverityDays5", "SEVERITY_DAYS5 NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "SeverityDays5asc", "SEVERITY_DAYS5 ASC" ) // ORDER ASCENDING

         .addOrderBy( "SeverityDays5desc", "SEVERITY_DAYS5 DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalSeverityDays6", "SEVERITY_DAYS6 = ?" ) // EQUAL

         .addFilterBy( "notequalSeverityDays6", "SEVERITY_DAYS6 != ?" ) // NOTEQUAL

         .addFilterBy( "nullSeverityDays6", "SEVERITY_DAYS6 IS NULL" ) // IS NULL

         .addFilterBy( "notnullSeverityDays6", "SEVERITY_DAYS6 IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanSeverityDays6", "SEVERITY_DAYS6 < ?" ) // LESS THAN

         .addFilterBy( "greaterthanSeverityDays6", "SEVERITY_DAYS6 > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalSeverityDays6", "SEVERITY_DAYS6 <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalSeverityDays6",
      "SEVERITY_DAYS6 >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "betweenSeverityDays6",
      "SEVERITY_DAYS6 BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullSeverityDays6",
      "(SEVERITY_DAYS6 IS NULL OR SEVERITY_DAYS6 = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullSeverityDays6",
      "(SEVERITY_DAYS6 IS NULL OR SEVERITY_DAYS6 < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullSeverityDays6",
      "(SEVERITY_DAYS6 IS NULL OR SEVERITY_DAYS6 > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INSeverityDays6", "SEVERITY_DAYS6 IN ( ? )" ) // IN

         .addFilterBy( "NOTINSeverityDays6", "SEVERITY_DAYS6 NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "SeverityDays6asc", "SEVERITY_DAYS6 ASC" ) // ORDER ASCENDING

         .addOrderBy( "SeverityDays6desc", "SEVERITY_DAYS6 DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalDeliveryReason", "(DELIVERY_REASON) = ?" ) // EQUAL

         .addFilterBy( "notequalDeliveryReason", "(DELIVERY_REASON) != ?" ) // NOTEQUAL

         .addFilterBy( "nullDeliveryReason",
      "(DELIVERY_REASON IS NULL OR LENGTH((DELIVERY_REASON)) = 0)" ) // IS NULL

         .addFilterBy( "notnullDeliveryReason", "DELIVERY_REASON IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByDeliveryReasonMatch", "DELIVERY_REASON LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullDeliveryReason",
      "((DELIVERY_REASON) = ? OR DELIVERY_REASON IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INDeliveryReason", "DELIVERY_REASON IN ( ? )" ) // IN

         .addFilterBy( "NOTINDeliveryReason", "DELIVERY_REASON NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "DeliveryReasonasc", "DELIVERY_REASON ASC" ) // ORDER ASCENDING

         .addOrderBy( "DeliveryReasondesc", "DELIVERY_REASON DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalShipperCode1", "(SHIPPER_CODE1) = ?" ) // EQUAL

         .addFilterBy( "notequalShipperCode1", "(SHIPPER_CODE1) != ?" ) // NOTEQUAL

         .addFilterBy( "nullShipperCode1",
      "(SHIPPER_CODE1 IS NULL OR LENGTH((SHIPPER_CODE1)) = 0)" ) // IS NULL

         .addFilterBy( "notnullShipperCode1", "SHIPPER_CODE1 IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByShipperCode1Match", "SHIPPER_CODE1 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullShipperCode1",
      "((SHIPPER_CODE1) = ? OR SHIPPER_CODE1 IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INShipperCode1", "SHIPPER_CODE1 IN ( ? )" ) // IN

         .addFilterBy( "NOTINShipperCode1", "SHIPPER_CODE1 NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "ShipperCode1asc", "SHIPPER_CODE1 ASC" ) // ORDER ASCENDING

         .addOrderBy( "ShipperCode1desc", "SHIPPER_CODE1 DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalShipperCode2", "(SHIPPER_CODE2) = ?" ) // EQUAL

         .addFilterBy( "notequalShipperCode2", "(SHIPPER_CODE2) != ?" ) // NOTEQUAL

         .addFilterBy( "nullShipperCode2",
      "(SHIPPER_CODE2 IS NULL OR LENGTH((SHIPPER_CODE2)) = 0)" ) // IS NULL

         .addFilterBy( "notnullShipperCode2", "SHIPPER_CODE2 IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByShipperCode2Match", "SHIPPER_CODE2 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullShipperCode2",
      "((SHIPPER_CODE2) = ? OR SHIPPER_CODE2 IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INShipperCode2", "SHIPPER_CODE2 IN ( ? )" ) // IN

         .addFilterBy( "NOTINShipperCode2", "SHIPPER_CODE2 NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "ShipperCode2asc", "SHIPPER_CODE2 ASC" ) // ORDER ASCENDING

         .addOrderBy( "ShipperCode2desc", "SHIPPER_CODE2 DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalShipperCode3", "(SHIPPER_CODE3) = ?" ) // EQUAL

         .addFilterBy( "notequalShipperCode3", "(SHIPPER_CODE3) != ?" ) // NOTEQUAL

         .addFilterBy( "nullShipperCode3",
      "(SHIPPER_CODE3 IS NULL OR LENGTH((SHIPPER_CODE3)) = 0)" ) // IS NULL

         .addFilterBy( "notnullShipperCode3", "SHIPPER_CODE3 IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByShipperCode3Match", "SHIPPER_CODE3 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullShipperCode3",
      "((SHIPPER_CODE3) = ? OR SHIPPER_CODE3 IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INShipperCode3", "SHIPPER_CODE3 IN ( ? )" ) // IN

         .addFilterBy( "NOTINShipperCode3", "SHIPPER_CODE3 NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "ShipperCode3asc", "SHIPPER_CODE3 ASC" ) // ORDER ASCENDING

         .addOrderBy( "ShipperCode3desc", "SHIPPER_CODE3 DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalShippingNoteInd", "(SHIPPING_NOTE_IND) = ?" ) // EQUAL

         .addFilterBy( "notequalShippingNoteInd",
      "(SHIPPING_NOTE_IND) != ?" ) // NOTEQUAL

         .addFilterBy( "nullShippingNoteInd",
      "(SHIPPING_NOTE_IND IS NULL OR LENGTH((SHIPPING_NOTE_IND)) = 0)" ) // IS NULL

         .addFilterBy( "notnullShippingNoteInd",
      "SHIPPING_NOTE_IND IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByShippingNoteIndMatch",
      "SHIPPING_NOTE_IND LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullShippingNoteInd",
      "((SHIPPING_NOTE_IND) = ? OR SHIPPING_NOTE_IND IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INShippingNoteInd", "SHIPPING_NOTE_IND IN ( ? )" ) // IN

         .addFilterBy( "NOTINShippingNoteInd",
      "SHIPPING_NOTE_IND NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "ShippingNoteIndasc", "SHIPPING_NOTE_IND ASC" ) // ORDER ASCENDING

         .addOrderBy( "ShippingNoteInddesc", "SHIPPING_NOTE_IND DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalAccountType", "(ACCOUNT_TYPE) = ?" ) // EQUAL

         .addFilterBy( "notequalAccountType", "(ACCOUNT_TYPE) != ?" ) // NOTEQUAL

         .addFilterBy( "nullAccountType",
      "(ACCOUNT_TYPE IS NULL OR LENGTH((ACCOUNT_TYPE)) = 0)" ) // IS NULL

         .addFilterBy( "notnullAccountType", "ACCOUNT_TYPE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByAccountTypeMatch", "ACCOUNT_TYPE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullAccountType",
      "((ACCOUNT_TYPE) = ? OR ACCOUNT_TYPE IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INAccountType", "ACCOUNT_TYPE IN ( ? )" ) // IN

         .addFilterBy( "NOTINAccountType", "ACCOUNT_TYPE NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "AccountTypeasc", "ACCOUNT_TYPE ASC" ) // ORDER ASCENDING

         .addOrderBy( "AccountTypedesc", "ACCOUNT_TYPE DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalAdminFee", "(ADMIN_FEE) = ?" ) // EQUAL

         .addFilterBy( "notequalAdminFee", "(ADMIN_FEE) != ?" ) // NOTEQUAL

         .addFilterBy( "nullAdminFee",
      "(ADMIN_FEE IS NULL OR LENGTH((ADMIN_FEE)) = 0)" ) // IS NULL

         .addFilterBy( "notnullAdminFee", "ADMIN_FEE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByAdminFeeMatch", "ADMIN_FEE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullAdminFee",
      "((ADMIN_FEE) = ? OR ADMIN_FEE IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INAdminFee", "ADMIN_FEE IN ( ? )" ) // IN

         .addFilterBy( "NOTINAdminFee", "ADMIN_FEE NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "AdminFeeasc", "ADMIN_FEE ASC" ) // ORDER ASCENDING

         .addOrderBy( "AdminFeedesc", "ADMIN_FEE DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalIntrestRate", "(INTREST_RATE) = ?" ) // EQUAL

         .addFilterBy( "notequalIntrestRate", "(INTREST_RATE) != ?" ) // NOTEQUAL

         .addFilterBy( "nullIntrestRate",
      "(INTREST_RATE IS NULL OR LENGTH((INTREST_RATE)) = 0)" ) // IS NULL

         .addFilterBy( "notnullIntrestRate", "INTREST_RATE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByIntrestRateMatch", "INTREST_RATE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullIntrestRate",
      "((INTREST_RATE) = ? OR INTREST_RATE IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INIntrestRate", "INTREST_RATE IN ( ? )" ) // IN

         .addFilterBy( "NOTINIntrestRate", "INTREST_RATE NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "IntrestRateasc", "INTREST_RATE ASC" ) // ORDER ASCENDING

         .addOrderBy( "IntrestRatedesc", "INTREST_RATE DESC" ) // ORDER DESCENDING
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
      dml = new SlcustmAbstractDMLFactory(  );
    }

    return dml;
  }
}
