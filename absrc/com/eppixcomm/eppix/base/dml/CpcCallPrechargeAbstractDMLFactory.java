package com.eppixcomm.eppix.base.dml;

import com.eppixcomm.eppix.base.dml.DMLException;
import com.eppixcomm.eppix.base.dml.DMLFactory;
import com.eppixcomm.eppix.base.dml.DMLTable;

/**
 * This is the DMLFactory for CpcCallPrecharge.
 *
 * @version $Revision: 1.1 $
 * @author $Author$
 * @since $jdk$
 */
public class CpcCallPrechargeAbstractDMLFactory
  extends BaseDMLFactory {
  //~ Static variables/initializers //////////////////////////////////////////

  /** The DMLFactory singleton */
  private static DMLFactory dml = null;

  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new CpcCallPrechargeAbstractDMLFactory object.
   *
   * @throws DMLException DOCUMENT ME!
   */
  protected CpcCallPrechargeAbstractDMLFactory(  )
    throws DMLException {
    ;

    DMLTable table = defTable( "CpcCallPrecharge", // dmlName
        "blo.CpcCallPrechargeDMO", // dmoName
        "CPC_CALL_PRECHARGE", // tableName
        13, // numColumns
        "CPC_ID, CPC_SUBSCRIBER, CPC_MSISDN, CPC_SIM_NO, CPC_NETWORK_ID, CPC_CHARGE_CODE, CPC_PRECHARGE_DATE, CPC_AMOUNT, CPC_REMAINING"
        + ", CPC_CREATED_DATE, CPC_LAST_BILLDATE, CPC_LAST_INVOICE, CPC_LAST_CREDIT", // columnList
        "CPC_ID", //primaryKey
        "" // versionCol     
      , true, // generatedKey
        "CPC_ID, CPC_SUBSCRIBER, CPC_MSISDN, CPC_SIM_NO, CPC_NETWORK_ID, CPC_CHARGE_CODE, CPC_PRECHARGE_DATE, CPC_AMOUNT, CPC_REMAINING"
        + ", CPC_CREATED_DATE, CPC_LAST_BILLDATE, CPC_LAST_INVOICE, CPC_LAST_CREDIT",
        "", "",
        new String[] {
          "CPC_ID", "CPC_SUBSCRIBER", "CPC_MSISDN", "CPC_SIM_NO",
          "CPC_NETWORK_ID", "CPC_CHARGE_CODE", "CPC_PRECHARGE_DATE",
          "CPC_AMOUNT", "CPC_REMAINING", "CPC_CREATED_DATE",
          "CPC_LAST_BILLDATE", "CPC_LAST_INVOICE", "CPC_LAST_CREDIT"
        } );

    table.addFilterBy( "equalCpcId", /* PK attribute */
      "CPC_ID = ?" )
         .addFilterBy( "filterByCpcIdMatch", "CPC_ID LIKE ?" )
         .addFilterBy( "INCpcId", "CPC_ID IN ( ? )" ) // IN

         .addFilterBy( "NOTINCpcId", "CPC_ID NOT IN ( ? )" ) // NOT IN

         .addFilterBy( "notequalCpcId", "CPC_ID != ?" ) // NOTEQUAL

         .addFilterBy( "nullCpcId", "CPC_ID IS NULL" ) // IS NULL

         .addFilterBy( "notnullCpcId", "CPC_ID IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanCpcId", "CPC_ID < ?" ) // LESS THAN

         .addFilterBy( "greaterthanCpcId", "CPC_ID > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalCpcId", "CPC_ID <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalCpcId", "CPC_ID >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "filterByCpcIdMatch", "CPC_ID LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "betweenCpcId", "CPC_ID BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullCpcId", "(CPC_ID IS NULL OR CPC_ID = ?)" ) // EQUALORNULL
                                                                              // TODO : we may need to wrap this with a TRIM() 

         .addFilterBy( "lessthanornullCpcId", "(CPC_ID IS NULL OR CPC_ID < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullCpcId",
      "(CPC_ID IS NULL OR CPC_ID > ?)" ) // GREATERTHANORNULL

         .addOrderBy( "CpcIdasc", "CPC_ID ASC" ) // ORDER ASCENDING

         .addOrderBy( "CpcIddesc", "CPC_ID DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalCpcSubscriber", "CPC_SUBSCRIBER = ?" ) // EQUAL

         .addFilterBy( "notequalCpcSubscriber", "CPC_SUBSCRIBER != ?" ) // NOTEQUAL

         .addFilterBy( "nullCpcSubscriber", "CPC_SUBSCRIBER IS NULL" ) // IS NULL

         .addFilterBy( "notnullCpcSubscriber", "CPC_SUBSCRIBER IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanCpcSubscriber", "CPC_SUBSCRIBER < ?" ) // LESS THAN

         .addFilterBy( "greaterthanCpcSubscriber", "CPC_SUBSCRIBER > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalCpcSubscriber", "CPC_SUBSCRIBER <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalCpcSubscriber",
      "CPC_SUBSCRIBER >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "filterByCpcSubscriberMatch", "CPC_SUBSCRIBER LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "betweenCpcSubscriber",
      "CPC_SUBSCRIBER BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullCpcSubscriber",
      "(CPC_SUBSCRIBER IS NULL OR CPC_SUBSCRIBER = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullCpcSubscriber",
      "(CPC_SUBSCRIBER IS NULL OR CPC_SUBSCRIBER < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullCpcSubscriber",
      "(CPC_SUBSCRIBER IS NULL OR CPC_SUBSCRIBER > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INCpcSubscriber", "CPC_SUBSCRIBER IN ( ? )" ) // IN

         .addFilterBy( "NOTINCpcSubscriber", "CPC_SUBSCRIBER NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "CpcSubscriberasc", "CPC_SUBSCRIBER ASC" ) // ORDER ASCENDING

         .addOrderBy( "CpcSubscriberdesc", "CPC_SUBSCRIBER DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalCpcMsisdn", "(CPC_MSISDN) = ?" ) // EQUAL

         .addFilterBy( "notequalCpcMsisdn", "(CPC_MSISDN) != ?" ) // NOTEQUAL

         .addFilterBy( "nullCpcMsisdn",
      "(CPC_MSISDN IS NULL OR LENGTH(TRIM(CPC_MSISDN)) IS NULL OR LENGTH(TRIM(CPC_MSISDN)) = 0)" ) // IS NULL

         .addFilterBy( "notnullCpcMsisdn", "CPC_MSISDN IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanCpcMsisdn", "CPC_MSISDN < ?" ) // LESS THAN

         .addFilterBy( "greaterthanCpcMsisdn", "CPC_MSISDN > ?" ) // GREATER THAN

         .addFilterBy( "filterByCpcMsisdnMatch", "CPC_MSISDN LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullCpcMsisdn",
      "((CPC_MSISDN) = ? OR CPC_MSISDN IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INCpcMsisdn", "(CPC_MSISDN) IN ( ? )" ) // IN

         .addFilterBy( "NOTINCpcMsisdn",
      "(CPC_MSISDN) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "CpcMsisdnasc", "CPC_MSISDN ASC" ) // ORDER ASCENDING

         .addOrderBy( "CpcMsisdndesc", "CPC_MSISDN DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalCpcSimNo", "(CPC_SIM_NO) = ?" ) // EQUAL

         .addFilterBy( "notequalCpcSimNo", "(CPC_SIM_NO) != ?" ) // NOTEQUAL

         .addFilterBy( "nullCpcSimNo",
      "(CPC_SIM_NO IS NULL OR LENGTH(TRIM(CPC_SIM_NO)) IS NULL OR LENGTH(TRIM(CPC_SIM_NO)) = 0)" ) // IS NULL

         .addFilterBy( "notnullCpcSimNo", "CPC_SIM_NO IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanCpcSimNo", "CPC_SIM_NO < ?" ) // LESS THAN

         .addFilterBy( "greaterthanCpcSimNo", "CPC_SIM_NO > ?" ) // GREATER THAN

         .addFilterBy( "filterByCpcSimNoMatch", "CPC_SIM_NO LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullCpcSimNo",
      "((CPC_SIM_NO) = ? OR CPC_SIM_NO IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INCpcSimNo", "(CPC_SIM_NO) IN ( ? )" ) // IN

         .addFilterBy( "NOTINCpcSimNo", "(CPC_SIM_NO) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "CpcSimNoasc", "CPC_SIM_NO ASC" ) // ORDER ASCENDING

         .addOrderBy( "CpcSimNodesc", "CPC_SIM_NO DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalCpcNetworkId", "(CPC_NETWORK_ID) = ?" ) // EQUAL

         .addFilterBy( "notequalCpcNetworkId", "(CPC_NETWORK_ID) != ?" ) // NOTEQUAL

         .addFilterBy( "nullCpcNetworkId",
      "(CPC_NETWORK_ID IS NULL OR LENGTH(TRIM(CPC_NETWORK_ID)) IS NULL OR LENGTH(TRIM(CPC_NETWORK_ID)) = 0)" ) // IS NULL

         .addFilterBy( "notnullCpcNetworkId", "CPC_NETWORK_ID IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanCpcNetworkId", "CPC_NETWORK_ID < ?" ) // LESS THAN

         .addFilterBy( "greaterthanCpcNetworkId", "CPC_NETWORK_ID > ?" ) // GREATER THAN

         .addFilterBy( "filterByCpcNetworkIdMatch", "CPC_NETWORK_ID LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullCpcNetworkId",
      "((CPC_NETWORK_ID) = ? OR CPC_NETWORK_ID IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INCpcNetworkId", "(CPC_NETWORK_ID) IN ( ? )" ) // IN

         .addFilterBy( "NOTINCpcNetworkId",
      "(CPC_NETWORK_ID) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "CpcNetworkIdasc", "CPC_NETWORK_ID ASC" ) // ORDER ASCENDING

         .addOrderBy( "CpcNetworkIddesc", "CPC_NETWORK_ID DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalCpcChargeCode", "(CPC_CHARGE_CODE) = ?" ) // EQUAL

         .addFilterBy( "notequalCpcChargeCode", "(CPC_CHARGE_CODE) != ?" ) // NOTEQUAL

         .addFilterBy( "nullCpcChargeCode",
      "(CPC_CHARGE_CODE IS NULL OR LENGTH(TRIM(CPC_CHARGE_CODE)) IS NULL OR LENGTH(TRIM(CPC_CHARGE_CODE)) = 0)" ) // IS NULL

         .addFilterBy( "notnullCpcChargeCode", "CPC_CHARGE_CODE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanCpcChargeCode", "CPC_CHARGE_CODE < ?" ) // LESS THAN

         .addFilterBy( "greaterthanCpcChargeCode", "CPC_CHARGE_CODE > ?" ) // GREATER THAN

         .addFilterBy( "filterByCpcChargeCodeMatch", "CPC_CHARGE_CODE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullCpcChargeCode",
      "((CPC_CHARGE_CODE) = ? OR CPC_CHARGE_CODE IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INCpcChargeCode", "(CPC_CHARGE_CODE) IN ( ? )" ) // IN

         .addFilterBy( "NOTINCpcChargeCode",
      "(CPC_CHARGE_CODE) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "CpcChargeCodeasc", "CPC_CHARGE_CODE ASC" ) // ORDER ASCENDING

         .addOrderBy( "CpcChargeCodedesc", "CPC_CHARGE_CODE DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalCpcPrechargeDate", "CPC_PRECHARGE_DATE = ?" ) // EQUAL

         .addFilterBy( "notequalCpcPrechargeDate", "CPC_PRECHARGE_DATE != ?" ) // NOTEQUAL

         .addFilterBy( "nullCpcPrechargeDate", "CPC_PRECHARGE_DATE IS NULL" ) // IS NULL

         .addFilterBy( "notnullCpcPrechargeDate",
      "CPC_PRECHARGE_DATE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanCpcPrechargeDate", "CPC_PRECHARGE_DATE < ?" ) // LESS THAN

         .addFilterBy( "greaterthanCpcPrechargeDate", "CPC_PRECHARGE_DATE > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalCpcPrechargeDate",
      "CPC_PRECHARGE_DATE <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalCpcPrechargeDate",
      "CPC_PRECHARGE_DATE >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "filterByCpcPrechargeDateMatch",
      "CPC_PRECHARGE_DATE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "betweenCpcPrechargeDate",
      "CPC_PRECHARGE_DATE BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullCpcPrechargeDate",
      "(CPC_PRECHARGE_DATE IS NULL OR CPC_PRECHARGE_DATE = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullCpcPrechargeDate",
      "(CPC_PRECHARGE_DATE IS NULL OR CPC_PRECHARGE_DATE < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullCpcPrechargeDate",
      "(CPC_PRECHARGE_DATE IS NULL OR CPC_PRECHARGE_DATE > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INCpcPrechargeDate", "CPC_PRECHARGE_DATE IN ( ? )" ) // IN

         .addFilterBy( "NOTINCpcPrechargeDate",
      "CPC_PRECHARGE_DATE NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "CpcPrechargeDateasc", "CPC_PRECHARGE_DATE ASC" ) // ORDER ASCENDING

         .addOrderBy( "CpcPrechargeDatedesc", "CPC_PRECHARGE_DATE DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalCpcAmount", "CPC_AMOUNT = ?" ) // EQUAL

         .addFilterBy( "notequalCpcAmount", "CPC_AMOUNT != ?" ) // NOTEQUAL

         .addFilterBy( "nullCpcAmount", "CPC_AMOUNT IS NULL" ) // IS NULL

         .addFilterBy( "notnullCpcAmount", "CPC_AMOUNT IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanCpcAmount", "CPC_AMOUNT < ?" ) // LESS THAN

         .addFilterBy( "greaterthanCpcAmount", "CPC_AMOUNT > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalCpcAmount", "CPC_AMOUNT <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalCpcAmount", "CPC_AMOUNT >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "filterByCpcAmountMatch", "CPC_AMOUNT LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "betweenCpcAmount", "CPC_AMOUNT BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullCpcAmount",
      "(CPC_AMOUNT IS NULL OR CPC_AMOUNT = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullCpcAmount",
      "(CPC_AMOUNT IS NULL OR CPC_AMOUNT < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullCpcAmount",
      "(CPC_AMOUNT IS NULL OR CPC_AMOUNT > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INCpcAmount", "CPC_AMOUNT IN ( ? )" ) // IN

         .addFilterBy( "NOTINCpcAmount", "CPC_AMOUNT NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "CpcAmountasc", "CPC_AMOUNT ASC" ) // ORDER ASCENDING

         .addOrderBy( "CpcAmountdesc", "CPC_AMOUNT DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalCpcRemaining", "CPC_REMAINING = ?" ) // EQUAL

         .addFilterBy( "notequalCpcRemaining", "CPC_REMAINING != ?" ) // NOTEQUAL

         .addFilterBy( "nullCpcRemaining", "CPC_REMAINING IS NULL" ) // IS NULL

         .addFilterBy( "notnullCpcRemaining", "CPC_REMAINING IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanCpcRemaining", "CPC_REMAINING < ?" ) // LESS THAN

         .addFilterBy( "greaterthanCpcRemaining", "CPC_REMAINING > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalCpcRemaining", "CPC_REMAINING <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalCpcRemaining", "CPC_REMAINING >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "filterByCpcRemainingMatch", "CPC_REMAINING LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "betweenCpcRemaining", "CPC_REMAINING BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullCpcRemaining",
      "(CPC_REMAINING IS NULL OR CPC_REMAINING = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullCpcRemaining",
      "(CPC_REMAINING IS NULL OR CPC_REMAINING < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullCpcRemaining",
      "(CPC_REMAINING IS NULL OR CPC_REMAINING > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INCpcRemaining", "CPC_REMAINING IN ( ? )" ) // IN

         .addFilterBy( "NOTINCpcRemaining", "CPC_REMAINING NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "CpcRemainingasc", "CPC_REMAINING ASC" ) // ORDER ASCENDING

         .addOrderBy( "CpcRemainingdesc", "CPC_REMAINING DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalCpcCreatedDate", "CPC_CREATED_DATE = ?" ) // EQUAL

         .addFilterBy( "notequalCpcCreatedDate", "CPC_CREATED_DATE != ?" ) // NOTEQUAL

         .addFilterBy( "nullCpcCreatedDate", "CPC_CREATED_DATE IS NULL" ) // IS NULL

         .addFilterBy( "notnullCpcCreatedDate", "CPC_CREATED_DATE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanCpcCreatedDate", "CPC_CREATED_DATE < ?" ) // LESS THAN

         .addFilterBy( "greaterthanCpcCreatedDate", "CPC_CREATED_DATE > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalCpcCreatedDate",
      "CPC_CREATED_DATE <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalCpcCreatedDate",
      "CPC_CREATED_DATE >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "filterByCpcCreatedDateMatch",
      "CPC_CREATED_DATE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "betweenCpcCreatedDate",
      "CPC_CREATED_DATE BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullCpcCreatedDate",
      "(CPC_CREATED_DATE IS NULL OR CPC_CREATED_DATE = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullCpcCreatedDate",
      "(CPC_CREATED_DATE IS NULL OR CPC_CREATED_DATE < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullCpcCreatedDate",
      "(CPC_CREATED_DATE IS NULL OR CPC_CREATED_DATE > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INCpcCreatedDate", "CPC_CREATED_DATE IN ( ? )" ) // IN

         .addFilterBy( "NOTINCpcCreatedDate", "CPC_CREATED_DATE NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "CpcCreatedDateasc", "CPC_CREATED_DATE ASC" ) // ORDER ASCENDING

         .addOrderBy( "CpcCreatedDatedesc", "CPC_CREATED_DATE DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalCpcLastBilldate", "CPC_LAST_BILLDATE = ?" ) // EQUAL

         .addFilterBy( "notequalCpcLastBilldate", "CPC_LAST_BILLDATE != ?" ) // NOTEQUAL

         .addFilterBy( "nullCpcLastBilldate", "CPC_LAST_BILLDATE IS NULL" ) // IS NULL

         .addFilterBy( "notnullCpcLastBilldate",
      "CPC_LAST_BILLDATE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanCpcLastBilldate", "CPC_LAST_BILLDATE < ?" ) // LESS THAN

         .addFilterBy( "greaterthanCpcLastBilldate", "CPC_LAST_BILLDATE > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalCpcLastBilldate",
      "CPC_LAST_BILLDATE <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalCpcLastBilldate",
      "CPC_LAST_BILLDATE >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "filterByCpcLastBilldateMatch",
      "CPC_LAST_BILLDATE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "betweenCpcLastBilldate",
      "CPC_LAST_BILLDATE BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullCpcLastBilldate",
      "(CPC_LAST_BILLDATE IS NULL OR CPC_LAST_BILLDATE = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullCpcLastBilldate",
      "(CPC_LAST_BILLDATE IS NULL OR CPC_LAST_BILLDATE < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullCpcLastBilldate",
      "(CPC_LAST_BILLDATE IS NULL OR CPC_LAST_BILLDATE > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INCpcLastBilldate", "CPC_LAST_BILLDATE IN ( ? )" ) // IN

         .addFilterBy( "NOTINCpcLastBilldate",
      "CPC_LAST_BILLDATE NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "CpcLastBilldateasc", "CPC_LAST_BILLDATE ASC" ) // ORDER ASCENDING

         .addOrderBy( "CpcLastBilldatedesc", "CPC_LAST_BILLDATE DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalCpcLastInvoice", "(CPC_LAST_INVOICE) = ?" ) // EQUAL

         .addFilterBy( "notequalCpcLastInvoice", "(CPC_LAST_INVOICE) != ?" ) // NOTEQUAL

         .addFilterBy( "nullCpcLastInvoice",
      "(CPC_LAST_INVOICE IS NULL OR LENGTH(TRIM(CPC_LAST_INVOICE)) IS NULL OR LENGTH(TRIM(CPC_LAST_INVOICE)) = 0)" ) // IS NULL

         .addFilterBy( "notnullCpcLastInvoice", "CPC_LAST_INVOICE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanCpcLastInvoice", "CPC_LAST_INVOICE < ?" ) // LESS THAN

         .addFilterBy( "greaterthanCpcLastInvoice", "CPC_LAST_INVOICE > ?" ) // GREATER THAN

         .addFilterBy( "filterByCpcLastInvoiceMatch",
      "CPC_LAST_INVOICE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullCpcLastInvoice",
      "((CPC_LAST_INVOICE) = ? OR CPC_LAST_INVOICE IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INCpcLastInvoice", "(CPC_LAST_INVOICE) IN ( ? )" ) // IN

         .addFilterBy( "NOTINCpcLastInvoice",
      "(CPC_LAST_INVOICE) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "CpcLastInvoiceasc", "CPC_LAST_INVOICE ASC" ) // ORDER ASCENDING

         .addOrderBy( "CpcLastInvoicedesc", "CPC_LAST_INVOICE DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalCpcLastCredit", "CPC_LAST_CREDIT = ?" ) // EQUAL

         .addFilterBy( "notequalCpcLastCredit", "CPC_LAST_CREDIT != ?" ) // NOTEQUAL

         .addFilterBy( "nullCpcLastCredit", "CPC_LAST_CREDIT IS NULL" ) // IS NULL

         .addFilterBy( "notnullCpcLastCredit", "CPC_LAST_CREDIT IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanCpcLastCredit", "CPC_LAST_CREDIT < ?" ) // LESS THAN

         .addFilterBy( "greaterthanCpcLastCredit", "CPC_LAST_CREDIT > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalCpcLastCredit", "CPC_LAST_CREDIT <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalCpcLastCredit",
      "CPC_LAST_CREDIT >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "filterByCpcLastCreditMatch", "CPC_LAST_CREDIT LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "betweenCpcLastCredit",
      "CPC_LAST_CREDIT BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullCpcLastCredit",
      "(CPC_LAST_CREDIT IS NULL OR CPC_LAST_CREDIT = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullCpcLastCredit",
      "(CPC_LAST_CREDIT IS NULL OR CPC_LAST_CREDIT < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullCpcLastCredit",
      "(CPC_LAST_CREDIT IS NULL OR CPC_LAST_CREDIT > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INCpcLastCredit", "CPC_LAST_CREDIT IN ( ? )" ) // IN

         .addFilterBy( "NOTINCpcLastCredit", "CPC_LAST_CREDIT NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "CpcLastCreditasc", "CPC_LAST_CREDIT ASC" ) // ORDER ASCENDING

         .addOrderBy( "CpcLastCreditdesc", "CPC_LAST_CREDIT DESC" ) // ORDER DESCENDING
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
      dml = new CpcCallPrechargeDMLFactory(  );
    }

    return dml;
  }
}
