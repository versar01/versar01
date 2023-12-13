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
 * This is the DMLFactory for SmnSimNos.
 *
 * @version $Revision: 1.1 $
 * @author $Author$
 * @since $jdk$
 */
public class SmnSimNosAbstractDMLFactory
  extends BaseDMLFactory {
  //~ Static variables/initializers //////////////////////////////////////////

  /** The DMLFactory singleton */
  private static DMLFactory dml = null;

  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new SmnSimNosAbstractDMLFactory object.
   *
   * @throws DMLException DOCUMENT ME!
   */
  protected SmnSimNosAbstractDMLFactory(  )
    throws DMLException {
    ;

    DMLTable table = defTable( "SmnSimNos", // dmlName
        "blo.SmnSimNosDMO", // dmoName
        "SMN_SIM_NOS", // tableName
        21, // numColumns
        "SMN_SIM_NO, SMN_NETWORK_ID, SMN_IMSI_NO, SMN_KI, SMN_ON_NETWORK, SMN_HLR, SMN_PUK_NO, SMN_STATUS, SMN_ACTIVE_DATE"
        + ", SMN_AVAIL_DATE, SMN_EXPIRY_DATE, SMN_WAREHOUSE, SMN_PRODUCT_CODE, SMN_DEALER_ID, SMN_TRANSPORT_KEY, SMN_PIN_NO, SMN_PUK_NO_2, SMN_PIN_NO_2"
        + ", SMN_ANALYSIS_1, SMN_ANALYSIS_2, SMN_ANALYSIS_3", // columnList
        "SMN_SIM_NO", //primaryKey
        "" // versionCol     
      , false, // generatedKey
        "SMN_SIM_NO, SMN_NETWORK_ID, SMN_IMSI_NO, SMN_KI, SMN_ON_NETWORK, SMN_HLR, SMN_PUK_NO, SMN_STATUS, SMN_ACTIVE_DATE"
        + ", SMN_AVAIL_DATE, SMN_EXPIRY_DATE, SMN_WAREHOUSE, SMN_PRODUCT_CODE, SMN_DEALER_ID, SMN_TRANSPORT_KEY, SMN_PIN_NO, SMN_PUK_NO_2, SMN_PIN_NO_2"
        + ", SMN_ANALYSIS_1, SMN_ANALYSIS_2, SMN_ANALYSIS_3", "", "",
        new String[] {
          "SMN_SIM_NO", "SMN_NETWORK_ID", "SMN_IMSI_NO", "SMN_KI",
          "SMN_ON_NETWORK", "SMN_HLR", "SMN_PUK_NO", "SMN_STATUS",
          "SMN_ACTIVE_DATE", "SMN_AVAIL_DATE", "SMN_EXPIRY_DATE",
          "SMN_WAREHOUSE", "SMN_PRODUCT_CODE", "SMN_DEALER_ID",
          "SMN_TRANSPORT_KEY", "SMN_PIN_NO", "SMN_PUK_NO_2", "SMN_PIN_NO_2",
          "SMN_ANALYSIS_1", "SMN_ANALYSIS_2", "SMN_ANALYSIS_3"
        } );

    table.addFilterBy( "equalSmnSimNo", /* PK attribute */
      "SMN_SIM_NO = ?" )
         .addFilterBy( "filterBySmnSimNoMatch", "SMN_SIM_NO LIKE ?" )
         .addFilterBy( "INSmnSimNo", "SMN_SIM_NO IN ( ? )" ) // IN

         .addFilterBy( "NOTINSmnSimNo", "SMN_SIM_NO NOT IN ( ? )" ) // NOT IN

         .addFilterBy( "notequalSmnSimNo", "SMN_SIM_NO != ?" ) // NOTEQUAL

         .addFilterBy( "nullSmnSimNo",
      "(SMN_SIM_NO IS NULL OR LENGTH(SMN_SIM_NO) IS NULL OR LENGTH(SMN_SIM_NO) = 0)" ) // IS NULL

         .addFilterBy( "notnullSmnSimNo", "SMN_SIM_NO IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanSmnSimNo", "SMN_SIM_NO < ?" ) // LESS THAN

         .addFilterBy( "greaterthanSmnSimNo", "SMN_SIM_NO > ?" ) // GREATER THAN

         .addFilterBy( "filterBySmnSimNoMatch", "SMN_SIM_NO LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullSmnSimNo",
      "(SMN_SIM_NO = ? OR SMN_SIM_NO IS NULL)" ) // EQUALORNULL
                                                 // TODO : we may need to wrap this with a TRIM() 

         .addOrderBy( "SmnSimNoasc", "SMN_SIM_NO ASC" ) // ORDER ASCENDING

         .addOrderBy( "SmnSimNodesc", "SMN_SIM_NO DESC" ) // ORDER DESCENDING

         .addFilterBy( "equalSmnDealerId", /* PK attribute */
      "SMN_DEALER_ID = ?" )
         .addFilterBy( "filterBySmnDealerIdMatch", "SMN_DEALER_ID LIKE ?" )
         .addFilterBy( "INSmnDealerId", "SMN_DEALER_ID IN ( ? )" ) // IN

         .addFilterBy( "NOTINSmnDealerId", "SMN_DEALER_ID NOT IN ( ? )" ) // NOT IN

         .addFilterBy( "notequalSmnDealerId", "SMN_DEALER_ID != ?" ) // NOTEQUAL

         .addFilterBy( "nullSmnDealerId",
      "(SMN_DEALER_ID IS NULL OR LENGTH(SMN_DEALER_ID) IS NULL OR LENGTH(SMN_DEALER_ID) = 0)" ) // IS NULL

         .addFilterBy( "notnullSmnDealerId", "SMN_DEALER_ID IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanSmnDealerId", "SMN_DEALER_ID < ?" ) // LESS THAN

         .addFilterBy( "greaterthanSmnDealerId", "SMN_DEALER_ID > ?" ) // GREATER THAN

         .addFilterBy( "filterBySmnDealerIdMatch", "SMN_DEALER_ID LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullSmnDealerId",
      "(SMN_DEALER_ID = ? OR SMN_DEALER_ID IS NULL)" ) // EQUALORNULL
                                                       // TODO : we may need to wrap this with a TRIM() 

         .addOrderBy( "SmnDealerIdasc", "SMN_DEALER_ID ASC" ) // ORDER ASCENDING

         .addOrderBy( "SmnDealerIddesc", "SMN_DEALER_ID DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalSmnNetworkId", "SMN_NETWORK_ID = ?" ) // EQUAL

         .addFilterBy( "notequalSmnNetworkId", "SMN_NETWORK_ID != ?" ) // NOTEQUAL

         .addFilterBy( "nullSmnNetworkId",
      "(SMN_NETWORK_ID IS NULL OR LENGTH(SMN_NETWORK_ID) IS NULL OR LENGTH(SMN_NETWORK_ID) = 0)" ) // IS NULL

         .addFilterBy( "notnullSmnNetworkId", "SMN_NETWORK_ID IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanSmnNetworkId", "SMN_NETWORK_ID < ?" ) // LESS THAN

         .addFilterBy( "greaterthanSmnNetworkId", "SMN_NETWORK_ID > ?" ) // GREATER THAN

         .addFilterBy( "filterBySmnNetworkIdMatch", "SMN_NETWORK_ID LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullSmnNetworkId",
      "(SMN_NETWORK_ID = ? OR SMN_NETWORK_ID IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INSmnNetworkId", "SMN_NETWORK_ID IN ( ? )" ) // IN

         .addFilterBy( "NOTINSmnNetworkId", "SMN_NETWORK_ID NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "SmnNetworkIdasc", "SMN_NETWORK_ID ASC" ) // ORDER ASCENDING

         .addOrderBy( "SmnNetworkIddesc", "SMN_NETWORK_ID DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalSmnImsiNo", "SMN_IMSI_NO = ?" ) // EQUAL

         .addFilterBy( "notequalSmnImsiNo", "SMN_IMSI_NO != ?" ) // NOTEQUAL

         .addFilterBy( "nullSmnImsiNo",
      "(SMN_IMSI_NO IS NULL OR LENGTH(SMN_IMSI_NO) IS NULL OR LENGTH(SMN_IMSI_NO) = 0)" ) // IS NULL

         .addFilterBy( "notnullSmnImsiNo", "SMN_IMSI_NO IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanSmnImsiNo", "SMN_IMSI_NO < ?" ) // LESS THAN

         .addFilterBy( "greaterthanSmnImsiNo", "SMN_IMSI_NO > ?" ) // GREATER THAN

         .addFilterBy( "filterBySmnImsiNoMatch", "SMN_IMSI_NO LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullSmnImsiNo",
      "(SMN_IMSI_NO = ? OR SMN_IMSI_NO IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INSmnImsiNo", "SMN_IMSI_NO IN ( ? )" ) // IN

         .addFilterBy( "NOTINSmnImsiNo", "SMN_IMSI_NO NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "SmnImsiNoasc", "SMN_IMSI_NO ASC" ) // ORDER ASCENDING

         .addOrderBy( "SmnImsiNodesc", "SMN_IMSI_NO DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalSmnKi", "SMN_KI = ?" ) // EQUAL

         .addFilterBy( "notequalSmnKi", "SMN_KI != ?" ) // NOTEQUAL

         .addFilterBy( "nullSmnKi",
      "(SMN_KI IS NULL OR LENGTH(SMN_KI) IS NULL OR LENGTH(SMN_KI) = 0)" ) // IS NULL

         .addFilterBy( "notnullSmnKi", "SMN_KI IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanSmnKi", "SMN_KI < ?" ) // LESS THAN

         .addFilterBy( "greaterthanSmnKi", "SMN_KI > ?" ) // GREATER THAN

         .addFilterBy( "filterBySmnKiMatch", "SMN_KI LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullSmnKi", "(SMN_KI = ? OR SMN_KI IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INSmnKi", "SMN_KI IN ( ? )" ) // IN

         .addFilterBy( "NOTINSmnKi", "SMN_KI NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "SmnKiasc", "SMN_KI ASC" ) // ORDER ASCENDING

         .addOrderBy( "SmnKidesc", "SMN_KI DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalSmnOnNetwork", "SMN_ON_NETWORK = ?" ) // EQUAL

         .addFilterBy( "notequalSmnOnNetwork", "SMN_ON_NETWORK != ?" ) // NOTEQUAL

         .addFilterBy( "nullSmnOnNetwork",
      "(SMN_ON_NETWORK IS NULL OR LENGTH(SMN_ON_NETWORK) IS NULL OR LENGTH(SMN_ON_NETWORK) = 0)" ) // IS NULL

         .addFilterBy( "notnullSmnOnNetwork", "SMN_ON_NETWORK IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanSmnOnNetwork", "SMN_ON_NETWORK < ?" ) // LESS THAN

         .addFilterBy( "greaterthanSmnOnNetwork", "SMN_ON_NETWORK > ?" ) // GREATER THAN

         .addFilterBy( "filterBySmnOnNetworkMatch", "SMN_ON_NETWORK LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullSmnOnNetwork",
      "(SMN_ON_NETWORK = ? OR SMN_ON_NETWORK IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INSmnOnNetwork", "SMN_ON_NETWORK IN ( ? )" ) // IN

         .addFilterBy( "NOTINSmnOnNetwork", "SMN_ON_NETWORK NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "SmnOnNetworkasc", "SMN_ON_NETWORK ASC" ) // ORDER ASCENDING

         .addOrderBy( "SmnOnNetworkdesc", "SMN_ON_NETWORK DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalSmnHlr", "SMN_HLR = ?" ) // EQUAL

         .addFilterBy( "notequalSmnHlr", "SMN_HLR != ?" ) // NOTEQUAL

         .addFilterBy( "nullSmnHlr",
      "(SMN_HLR IS NULL OR LENGTH(SMN_HLR) IS NULL OR LENGTH(SMN_HLR) = 0)" ) // IS NULL

         .addFilterBy( "notnullSmnHlr", "SMN_HLR IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanSmnHlr", "SMN_HLR < ?" ) // LESS THAN

         .addFilterBy( "greaterthanSmnHlr", "SMN_HLR > ?" ) // GREATER THAN

         .addFilterBy( "filterBySmnHlrMatch", "SMN_HLR LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullSmnHlr", "(SMN_HLR = ? OR SMN_HLR IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INSmnHlr", "SMN_HLR IN ( ? )" ) // IN

         .addFilterBy( "NOTINSmnHlr", "SMN_HLR NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "SmnHlrasc", "SMN_HLR ASC" ) // ORDER ASCENDING

         .addOrderBy( "SmnHlrdesc", "SMN_HLR DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalSmnPukNo", "SMN_PUK_NO = ?" ) // EQUAL

         .addFilterBy( "notequalSmnPukNo", "SMN_PUK_NO != ?" ) // NOTEQUAL

         .addFilterBy( "nullSmnPukNo",
      "(SMN_PUK_NO IS NULL OR LENGTH(SMN_PUK_NO) IS NULL OR LENGTH(SMN_PUK_NO) = 0)" ) // IS NULL

         .addFilterBy( "notnullSmnPukNo", "SMN_PUK_NO IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanSmnPukNo", "SMN_PUK_NO < ?" ) // LESS THAN

         .addFilterBy( "greaterthanSmnPukNo", "SMN_PUK_NO > ?" ) // GREATER THAN

         .addFilterBy( "filterBySmnPukNoMatch", "SMN_PUK_NO LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullSmnPukNo",
      "(SMN_PUK_NO = ? OR SMN_PUK_NO IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INSmnPukNo", "SMN_PUK_NO IN ( ? )" ) // IN

         .addFilterBy( "NOTINSmnPukNo", "SMN_PUK_NO NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "SmnPukNoasc", "SMN_PUK_NO ASC" ) // ORDER ASCENDING

         .addOrderBy( "SmnPukNodesc", "SMN_PUK_NO DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalSmnStatus", "SMN_STATUS = ?" ) // EQUAL

         .addFilterBy( "notequalSmnStatus", "SMN_STATUS != ?" ) // NOTEQUAL

         .addFilterBy( "nullSmnStatus",
      "(SMN_STATUS IS NULL OR LENGTH(SMN_STATUS) IS NULL OR LENGTH(SMN_STATUS) = 0)" ) // IS NULL

         .addFilterBy( "notnullSmnStatus", "SMN_STATUS IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanSmnStatus", "SMN_STATUS < ?" ) // LESS THAN

         .addFilterBy( "greaterthanSmnStatus", "SMN_STATUS > ?" ) // GREATER THAN

         .addFilterBy( "filterBySmnStatusMatch", "SMN_STATUS LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullSmnStatus",
      "(SMN_STATUS = ? OR SMN_STATUS IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INSmnStatus", "SMN_STATUS IN ( ? )" ) // IN

         .addFilterBy( "NOTINSmnStatus", "SMN_STATUS NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "SmnStatusasc", "SMN_STATUS ASC" ) // ORDER ASCENDING

         .addOrderBy( "SmnStatusdesc", "SMN_STATUS DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalSmnActiveDate", "SMN_ACTIVE_DATE = ?" ) // EQUAL

         .addFilterBy( "notequalSmnActiveDate", "SMN_ACTIVE_DATE != ?" ) // NOTEQUAL

         .addFilterBy( "nullSmnActiveDate", "SMN_ACTIVE_DATE IS NULL" ) // IS NULL

         .addFilterBy( "notnullSmnActiveDate", "SMN_ACTIVE_DATE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanSmnActiveDate", "SMN_ACTIVE_DATE < ?" ) // LESS THAN

         .addFilterBy( "greaterthanSmnActiveDate", "SMN_ACTIVE_DATE > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalSmnActiveDate", "SMN_ACTIVE_DATE <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalSmnActiveDate",
      "SMN_ACTIVE_DATE >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "filterBySmnActiveDateMatch", "SMN_ACTIVE_DATE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "betweenSmnActiveDate",
      "SMN_ACTIVE_DATE BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullSmnActiveDate",
      "(SMN_ACTIVE_DATE IS NULL OR SMN_ACTIVE_DATE = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullSmnActiveDate",
      "(SMN_ACTIVE_DATE IS NULL OR SMN_ACTIVE_DATE < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullSmnActiveDate",
      "(SMN_ACTIVE_DATE IS NULL OR SMN_ACTIVE_DATE > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INSmnActiveDate", "SMN_ACTIVE_DATE IN ( ? )" ) // IN

         .addFilterBy( "NOTINSmnActiveDate", "SMN_ACTIVE_DATE NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "SmnActiveDateasc", "SMN_ACTIVE_DATE ASC" ) // ORDER ASCENDING

         .addOrderBy( "SmnActiveDatedesc", "SMN_ACTIVE_DATE DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalSmnAvailDate", "SMN_AVAIL_DATE = ?" ) // EQUAL

         .addFilterBy( "notequalSmnAvailDate", "SMN_AVAIL_DATE != ?" ) // NOTEQUAL

         .addFilterBy( "nullSmnAvailDate", "SMN_AVAIL_DATE IS NULL" ) // IS NULL

         .addFilterBy( "notnullSmnAvailDate", "SMN_AVAIL_DATE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanSmnAvailDate", "SMN_AVAIL_DATE < ?" ) // LESS THAN

         .addFilterBy( "greaterthanSmnAvailDate", "SMN_AVAIL_DATE > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalSmnAvailDate", "SMN_AVAIL_DATE <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalSmnAvailDate", "SMN_AVAIL_DATE >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "filterBySmnAvailDateMatch", "SMN_AVAIL_DATE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "betweenSmnAvailDate", "SMN_AVAIL_DATE BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullSmnAvailDate",
      "(SMN_AVAIL_DATE IS NULL OR SMN_AVAIL_DATE = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullSmnAvailDate",
      "(SMN_AVAIL_DATE IS NULL OR SMN_AVAIL_DATE < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullSmnAvailDate",
      "(SMN_AVAIL_DATE IS NULL OR SMN_AVAIL_DATE > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INSmnAvailDate", "SMN_AVAIL_DATE IN ( ? )" ) // IN

         .addFilterBy( "NOTINSmnAvailDate", "SMN_AVAIL_DATE NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "SmnAvailDateasc", "SMN_AVAIL_DATE ASC" ) // ORDER ASCENDING

         .addOrderBy( "SmnAvailDatedesc", "SMN_AVAIL_DATE DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalSmnExpiryDate", "SMN_EXPIRY_DATE = ?" ) // EQUAL

         .addFilterBy( "notequalSmnExpiryDate", "SMN_EXPIRY_DATE != ?" ) // NOTEQUAL

         .addFilterBy( "nullSmnExpiryDate", "SMN_EXPIRY_DATE IS NULL" ) // IS NULL

         .addFilterBy( "notnullSmnExpiryDate", "SMN_EXPIRY_DATE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanSmnExpiryDate", "SMN_EXPIRY_DATE < ?" ) // LESS THAN

         .addFilterBy( "greaterthanSmnExpiryDate", "SMN_EXPIRY_DATE > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalSmnExpiryDate", "SMN_EXPIRY_DATE <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalSmnExpiryDate",
      "SMN_EXPIRY_DATE >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "filterBySmnExpiryDateMatch", "SMN_EXPIRY_DATE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "betweenSmnExpiryDate",
      "SMN_EXPIRY_DATE BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullSmnExpiryDate",
      "(SMN_EXPIRY_DATE IS NULL OR SMN_EXPIRY_DATE = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullSmnExpiryDate",
      "(SMN_EXPIRY_DATE IS NULL OR SMN_EXPIRY_DATE < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullSmnExpiryDate",
      "(SMN_EXPIRY_DATE IS NULL OR SMN_EXPIRY_DATE > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INSmnExpiryDate", "SMN_EXPIRY_DATE IN ( ? )" ) // IN

         .addFilterBy( "NOTINSmnExpiryDate", "SMN_EXPIRY_DATE NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "SmnExpiryDateasc", "SMN_EXPIRY_DATE ASC" ) // ORDER ASCENDING

         .addOrderBy( "SmnExpiryDatedesc", "SMN_EXPIRY_DATE DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalSmnWarehouse", "SMN_WAREHOUSE = ?" ) // EQUAL

         .addFilterBy( "notequalSmnWarehouse", "SMN_WAREHOUSE != ?" ) // NOTEQUAL

         .addFilterBy( "nullSmnWarehouse",
      "(SMN_WAREHOUSE IS NULL OR LENGTH(SMN_WAREHOUSE) IS NULL OR LENGTH(SMN_WAREHOUSE) = 0)" ) // IS NULL

         .addFilterBy( "notnullSmnWarehouse", "SMN_WAREHOUSE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanSmnWarehouse", "SMN_WAREHOUSE < ?" ) // LESS THAN

         .addFilterBy( "greaterthanSmnWarehouse", "SMN_WAREHOUSE > ?" ) // GREATER THAN

         .addFilterBy( "filterBySmnWarehouseMatch", "SMN_WAREHOUSE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullSmnWarehouse",
      "(SMN_WAREHOUSE = ? OR SMN_WAREHOUSE IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INSmnWarehouse", "SMN_WAREHOUSE IN ( ? )" ) // IN

         .addFilterBy( "NOTINSmnWarehouse", "SMN_WAREHOUSE NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "SmnWarehouseasc", "SMN_WAREHOUSE ASC" ) // ORDER ASCENDING

         .addOrderBy( "SmnWarehousedesc", "SMN_WAREHOUSE DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalSmnProductCode", "SMN_PRODUCT_CODE = ?" ) // EQUAL

         .addFilterBy( "notequalSmnProductCode", "SMN_PRODUCT_CODE != ?" ) // NOTEQUAL

         .addFilterBy( "nullSmnProductCode",
      "(SMN_PRODUCT_CODE IS NULL OR LENGTH(SMN_PRODUCT_CODE) IS NULL OR LENGTH(SMN_PRODUCT_CODE) = 0)" ) // IS NULL

         .addFilterBy( "notnullSmnProductCode", "SMN_PRODUCT_CODE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanSmnProductCode", "SMN_PRODUCT_CODE < ?" ) // LESS THAN

         .addFilterBy( "greaterthanSmnProductCode", "SMN_PRODUCT_CODE > ?" ) // GREATER THAN

         .addFilterBy( "filterBySmnProductCodeMatch",
      "SMN_PRODUCT_CODE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullSmnProductCode",
      "(SMN_PRODUCT_CODE = ? OR SMN_PRODUCT_CODE IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INSmnProductCode", "SMN_PRODUCT_CODE IN ( ? )" ) // IN

         .addFilterBy( "NOTINSmnProductCode", "SMN_PRODUCT_CODE NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "SmnProductCodeasc", "SMN_PRODUCT_CODE ASC" ) // ORDER ASCENDING

         .addOrderBy( "SmnProductCodedesc", "SMN_PRODUCT_CODE DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalSmnTransportKey", "SMN_TRANSPORT_KEY = ?" ) // EQUAL

         .addFilterBy( "notequalSmnTransportKey", "SMN_TRANSPORT_KEY != ?" ) // NOTEQUAL

         .addFilterBy( "nullSmnTransportKey",
      "(SMN_TRANSPORT_KEY IS NULL OR LENGTH(SMN_TRANSPORT_KEY) IS NULL OR LENGTH(SMN_TRANSPORT_KEY) = 0)" ) // IS NULL

         .addFilterBy( "notnullSmnTransportKey",
      "SMN_TRANSPORT_KEY IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanSmnTransportKey", "SMN_TRANSPORT_KEY < ?" ) // LESS THAN

         .addFilterBy( "greaterthanSmnTransportKey", "SMN_TRANSPORT_KEY > ?" ) // GREATER THAN

         .addFilterBy( "filterBySmnTransportKeyMatch",
      "SMN_TRANSPORT_KEY LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullSmnTransportKey",
      "(SMN_TRANSPORT_KEY = ? OR SMN_TRANSPORT_KEY IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INSmnTransportKey", "SMN_TRANSPORT_KEY IN ( ? )" ) // IN

         .addFilterBy( "NOTINSmnTransportKey",
      "SMN_TRANSPORT_KEY NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "SmnTransportKeyasc", "SMN_TRANSPORT_KEY ASC" ) // ORDER ASCENDING

         .addOrderBy( "SmnTransportKeydesc", "SMN_TRANSPORT_KEY DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalSmnPinNo", "SMN_PIN_NO = ?" ) // EQUAL

         .addFilterBy( "notequalSmnPinNo", "SMN_PIN_NO != ?" ) // NOTEQUAL

         .addFilterBy( "nullSmnPinNo",
      "(SMN_PIN_NO IS NULL OR LENGTH(SMN_PIN_NO) IS NULL OR LENGTH(SMN_PIN_NO) = 0)" ) // IS NULL

         .addFilterBy( "notnullSmnPinNo", "SMN_PIN_NO IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanSmnPinNo", "SMN_PIN_NO < ?" ) // LESS THAN

         .addFilterBy( "greaterthanSmnPinNo", "SMN_PIN_NO > ?" ) // GREATER THAN

         .addFilterBy( "filterBySmnPinNoMatch", "SMN_PIN_NO LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullSmnPinNo",
      "(SMN_PIN_NO = ? OR SMN_PIN_NO IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INSmnPinNo", "SMN_PIN_NO IN ( ? )" ) // IN

         .addFilterBy( "NOTINSmnPinNo", "SMN_PIN_NO NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "SmnPinNoasc", "SMN_PIN_NO ASC" ) // ORDER ASCENDING

         .addOrderBy( "SmnPinNodesc", "SMN_PIN_NO DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalSmnPukNo2", "SMN_PUK_NO_2 = ?" ) // EQUAL

         .addFilterBy( "notequalSmnPukNo2", "SMN_PUK_NO_2 != ?" ) // NOTEQUAL

         .addFilterBy( "nullSmnPukNo2",
      "(SMN_PUK_NO_2 IS NULL OR LENGTH(SMN_PUK_NO_2) IS NULL OR LENGTH(SMN_PUK_NO_2) = 0)" ) // IS NULL

         .addFilterBy( "notnullSmnPukNo2", "SMN_PUK_NO_2 IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanSmnPukNo2", "SMN_PUK_NO_2 < ?" ) // LESS THAN

         .addFilterBy( "greaterthanSmnPukNo2", "SMN_PUK_NO_2 > ?" ) // GREATER THAN

         .addFilterBy( "filterBySmnPukNo2Match", "SMN_PUK_NO_2 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullSmnPukNo2",
      "(SMN_PUK_NO_2 = ? OR SMN_PUK_NO_2 IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INSmnPukNo2", "SMN_PUK_NO_2 IN ( ? )" ) // IN

         .addFilterBy( "NOTINSmnPukNo2", "SMN_PUK_NO_2 NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "SmnPukNo2asc", "SMN_PUK_NO_2 ASC" ) // ORDER ASCENDING

         .addOrderBy( "SmnPukNo2desc", "SMN_PUK_NO_2 DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalSmnPinNo2", "SMN_PIN_NO_2 = ?" ) // EQUAL

         .addFilterBy( "notequalSmnPinNo2", "SMN_PIN_NO_2 != ?" ) // NOTEQUAL

         .addFilterBy( "nullSmnPinNo2",
      "(SMN_PIN_NO_2 IS NULL OR LENGTH(SMN_PIN_NO_2) IS NULL OR LENGTH(SMN_PIN_NO_2) = 0)" ) // IS NULL

         .addFilterBy( "notnullSmnPinNo2", "SMN_PIN_NO_2 IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanSmnPinNo2", "SMN_PIN_NO_2 < ?" ) // LESS THAN

         .addFilterBy( "greaterthanSmnPinNo2", "SMN_PIN_NO_2 > ?" ) // GREATER THAN

         .addFilterBy( "filterBySmnPinNo2Match", "SMN_PIN_NO_2 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullSmnPinNo2",
      "(SMN_PIN_NO_2 = ? OR SMN_PIN_NO_2 IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INSmnPinNo2", "SMN_PIN_NO_2 IN ( ? )" ) // IN

         .addFilterBy( "NOTINSmnPinNo2", "SMN_PIN_NO_2 NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "SmnPinNo2asc", "SMN_PIN_NO_2 ASC" ) // ORDER ASCENDING

         .addOrderBy( "SmnPinNo2desc", "SMN_PIN_NO_2 DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalSmnAnalysis1", "SMN_ANALYSIS_1 = ?" ) // EQUAL

         .addFilterBy( "notequalSmnAnalysis1", "SMN_ANALYSIS_1 != ?" ) // NOTEQUAL

         .addFilterBy( "nullSmnAnalysis1",
      "(SMN_ANALYSIS_1 IS NULL OR LENGTH(SMN_ANALYSIS_1) IS NULL OR LENGTH(SMN_ANALYSIS_1) = 0)" ) // IS NULL

         .addFilterBy( "notnullSmnAnalysis1", "SMN_ANALYSIS_1 IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanSmnAnalysis1", "SMN_ANALYSIS_1 < ?" ) // LESS THAN

         .addFilterBy( "greaterthanSmnAnalysis1", "SMN_ANALYSIS_1 > ?" ) // GREATER THAN

         .addFilterBy( "filterBySmnAnalysis1Match", "SMN_ANALYSIS_1 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullSmnAnalysis1",
      "(SMN_ANALYSIS_1 = ? OR SMN_ANALYSIS_1 IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INSmnAnalysis1", "SMN_ANALYSIS_1 IN ( ? )" ) // IN

         .addFilterBy( "NOTINSmnAnalysis1", "SMN_ANALYSIS_1 NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "SmnAnalysis1asc", "SMN_ANALYSIS_1 ASC" ) // ORDER ASCENDING

         .addOrderBy( "SmnAnalysis1desc", "SMN_ANALYSIS_1 DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalSmnAnalysis2", "SMN_ANALYSIS_2 = ?" ) // EQUAL

         .addFilterBy( "notequalSmnAnalysis2", "SMN_ANALYSIS_2 != ?" ) // NOTEQUAL

         .addFilterBy( "nullSmnAnalysis2",
      "(SMN_ANALYSIS_2 IS NULL OR LENGTH(SMN_ANALYSIS_2) IS NULL OR LENGTH(SMN_ANALYSIS_2) = 0)" ) // IS NULL

         .addFilterBy( "notnullSmnAnalysis2", "SMN_ANALYSIS_2 IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanSmnAnalysis2", "SMN_ANALYSIS_2 < ?" ) // LESS THAN

         .addFilterBy( "greaterthanSmnAnalysis2", "SMN_ANALYSIS_2 > ?" ) // GREATER THAN

         .addFilterBy( "filterBySmnAnalysis2Match", "SMN_ANALYSIS_2 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullSmnAnalysis2",
      "(SMN_ANALYSIS_2 = ? OR SMN_ANALYSIS_2 IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INSmnAnalysis2", "SMN_ANALYSIS_2 IN ( ? )" ) // IN

         .addFilterBy( "NOTINSmnAnalysis2", "SMN_ANALYSIS_2 NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "SmnAnalysis2asc", "SMN_ANALYSIS_2 ASC" ) // ORDER ASCENDING

         .addOrderBy( "SmnAnalysis2desc", "SMN_ANALYSIS_2 DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalSmnAnalysis3", "SMN_ANALYSIS_3 = ?" ) // EQUAL

         .addFilterBy( "notequalSmnAnalysis3", "SMN_ANALYSIS_3 != ?" ) // NOTEQUAL

         .addFilterBy( "nullSmnAnalysis3",
      "(SMN_ANALYSIS_3 IS NULL OR LENGTH(SMN_ANALYSIS_3) IS NULL OR LENGTH(SMN_ANALYSIS_3) = 0)" ) // IS NULL

         .addFilterBy( "notnullSmnAnalysis3", "SMN_ANALYSIS_3 IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanSmnAnalysis3", "SMN_ANALYSIS_3 < ?" ) // LESS THAN

         .addFilterBy( "greaterthanSmnAnalysis3", "SMN_ANALYSIS_3 > ?" ) // GREATER THAN

         .addFilterBy( "filterBySmnAnalysis3Match", "SMN_ANALYSIS_3 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullSmnAnalysis3",
      "(SMN_ANALYSIS_3 = ? OR SMN_ANALYSIS_3 IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INSmnAnalysis3", "SMN_ANALYSIS_3 IN ( ? )" ) // IN

         .addFilterBy( "NOTINSmnAnalysis3", "SMN_ANALYSIS_3 NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "SmnAnalysis3asc", "SMN_ANALYSIS_3 ASC" ) // ORDER ASCENDING

         .addOrderBy( "SmnAnalysis3desc", "SMN_ANALYSIS_3 DESC" ) // ORDER DESCENDING
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
      dml = new SmnSimNosDMLFactory(  );
    }

    return dml;
  }
}
