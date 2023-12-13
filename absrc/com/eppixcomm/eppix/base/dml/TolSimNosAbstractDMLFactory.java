package com.eppixcomm.eppix.base.dml;



public class TolSimNosAbstractDMLFactory extends BaseDMLFactory
{
	
	
	/** The DMLFactory singleton */
	private static DMLFactory dml = null;
	/*@throws DMLException DOCUMENT ME!*/
	protected TolSimNosAbstractDMLFactory() throws DMLException 
	{
		super();
		// TODO Auto-generated constructor stub
		
		 DMLTable table = defTable( "TolSimNos", // dmlName
				 "blo.TolSimNosDMO", // dmoName
				 "TOL_SIM_NOS", // tableName
				 21, // numColumns
				 "TOL_SIM_NO,TOL_NETWORK_ID,TOL_IMSI_NO,TOL_KI,TOL_ON_NETWORK,TOL_HLR,"
				 +"TOL_PUK_NO,TOL_STATUS,TOL_ACTIVE_DATE,TOL_AVAIL_DATE,TOL_EXPIRY_DATE,"
				 +"TOL_WAREHOUSE,TOL_PRODUCT_CODE,TOL_DEALER_ID,TOL_TRANSPORT_KEY,TOL_PIN_NO,"
				 +"TOL_PUK_NO_2,TOL_PIN_NO_2,TOL_ANALYSIS_1,TOL_ANALYSIS_2,TOL_ANALYSIS_3", // columnList
				 "(TOL_SIM_NO)", //primaryKey
				 "" ,// versionCol
				 false, // generatedKey
				 "TOL_SIM_NO,TOL_NETWORK_ID,TOL_IMSI_NO,TOL_KI,TOL_ON_NETWORK,TOL_HLR,"
				 +"TOL_PUK_NO,TOL_STATUS,TOL_ACTIVE_DATE,TOL_AVAIL_DATE,TOL_EXPIRY_DATE,"
				 +"TOL_WAREHOUSE,TOL_PRODUCT_CODE,TOL_DEALER_ID,TOL_TRANSPORT_KEY,TOL_PIN_NO,"
				 +"TOL_PUK_NO_2,TOL_PIN_NO_2,TOL_ANALYSIS_1,TOL_ANALYSIS_2,TOL_ANALYSIS_3", "", "",
				 new String[] {"TOL_SIM_NO","TOL_NETWORK_ID","TOL_IMSI_NO","TOL_KI","TOL_ON_NETWORK","TOL_HLR",
				 "TOL_PUK_NO","TOL_STATUS","TOL_ACTIVE_DATE","TOL_AVAIL_DATE","TOL_EXPIRY_DATE",
				 "TOL_WAREHOUSE","TOL_PRODUCT_CODE","TOL_DEALER_ID","TOL_TRANSPORT_KEY","TOL_PIN_NO",
				 "TOL_PUK_NO_2","TOL_PIN_NO_2","TOL_ANALYSIS_1","TOL_ANALYSIS_2","TOL_ANALYSIS_3"});
				 
		 table.addFilterBy( "equalTolSimNo","(TOL_SIM_NO) = ?" )  /* PK attribute */
		      .addFilterBy( "filterByTolSimNoMatch", "TOL_SIM_NO LIKE ?" )
		      .addFilterBy( "INTolSimNo", "(TOL_SIM_NO) IN ( ? )" ) // IN
		      .addFilterBy( "NOTINTolSimNo", "(TOL_SIM_NO) NOT IN ( ? )" ) // NOT IN
	          .addFilterBy( "notequalTolSimNo", "(TOL_SIM_NO) != ?" ) // NOTEQUAL
	          .addFilterBy( "nullTolSimNo","(TOL_SIM_NO IS NULL OR LENGTH((TOL_SIM_NO)) IS NULL OR LENGTH((TOL_SIM_NO)) = 0)" ) // IS NULL
	          .addFilterBy( "notnullTolSimNo", "TOL_SIM_NO IS NOT NULL" ) // IS NOT NULL
 	          .addFilterBy( "lessthanTolSimNo", "TOL_SIM_NO < ?" ) // LESS THAN
	          .addFilterBy( "greaterthanTolSimNo", "TOL_SIM_NO > ?" ) // GREATER THAN
	          .addFilterBy( "filterByTolSimNoMatch", "TOL_SIM_NO LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY
	          .addFilterBy( "equalornullTolSimNo","((TOL_SIM_NO) = ? OR TOL_SIM_NO IS NULL)" ) // EQUALORNULL
               											// TODO : we may need to wrap this with a () 
	          .addOrderBy( "TolSimNoasc", "TOL_SIM_NO ASC" ) // ORDER ASCENDING
	          .addOrderBy( "TolSimNodesc", "TOL_SIM_NO DESC" ) // ORDER DESCENDING
	          ;
		 
		 table.addFilterBy( "equalTolNetworkId", "(TOL_NETWORK_ID) = ?" ) // EQUAL
	          .addFilterBy( "notequalTolNetworkId", "(TOL_NETWORK_ID) != ?" ) // NOTEQUAL
	          .addFilterBy( "nullTolNetworkId", "(TOL_NETWORK_ID IS NULL OR LENGTH((TOL_NETWORK_ID)) = 0)" ) // IS NULL
	          .addFilterBy( "notnullTolNetworkId", "TOL_NETWORK_ID IS NOT NULL" ) // IS NOT NULL
	          .addFilterBy( "filterByTolNetworkIdMatch", "TOL_NETWORK_ID LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY
	          .addFilterBy( "equalornullTolNetworkId", "((TOL_NETWORK_ID) = ? OR TOL_NETWORK_ID IS NULL)" ) // EQUALORNULL
	          .addFilterBy( "INTolNetworkId", "TOL_NETWORK_ID IN ( ? )" ) // IN
	          .addFilterBy( "NOTINTolNetworkId", "TOL_NETWORK_ID NOT IN ( ? )" ) // NOT IN
	         
	          .addOrderBy( "TolNetworkIdasc", "TOL_NETWORK_ID ASC" ) // ORDER ASCENDING
	          .addOrderBy( "TolNetworkIddesc", "TOL_NETWORK_ID DESC" ) // ORDER DESCENDING
	          ;
		 	// TOL_IMSI_NO TolImsiNo
		 table.addFilterBy( "equalTolImsiNo", "(TOL_IMSI_NO) = ?" ) // EQUAL
         	  .addFilterBy( "notequalTolImsiNo", "(TOL_IMSI_NO) != ?" ) // NOTEQUAL
         	  .addFilterBy( "nullTolImsiNo", "(TOL_IMSI_NO IS NULL OR LENGTH((TOL_IMSI_NO)) = 0)" ) // IS NULL
         	  .addFilterBy( "notnullTolImsiNo", "TOL_IMSI_NO IS NOT NULL" ) // IS NOT NULL
         	  .addFilterBy( "filterByTolImsiNoMatch", "TOL_IMSI_NO LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY
         	  .addFilterBy( "equalornullTolImsiNo", "((TOL_IMSI_NO) = ? OR TOL_IMSI_NO IS NULL)" ) // EQUALORNULL
         	  .addFilterBy( "INTolImsiNo", "TOL_IMSI_NO IN ( ? )" ) // IN
         	  .addFilterBy( "NOTINTolImsiNo", "TOL_IMSI_NO NOT IN ( ? )" ) // NOT IN

         	  .addOrderBy( "TolImsiNoasc", "TOL_IMSI_NO ASC" ) // ORDER ASCENDING
         	  .addOrderBy( "TolImsiNodesc", "TOL_IMSI_NO DESC" ) // ORDER DESCENDING
         	  ;

		 //TOL_KI TolKi
		 table.addFilterBy( "equalTolKi", "(TOL_KI) = ?" ) // EQUAL
         	  .addFilterBy( "notequalTolKi", "(TOL_KI) != ?" ) // NOTEQUAL
         	  .addFilterBy( "nullTolKi", "(TOL_KI IS NULL OR LENGTH((TOL_KI)) = 0)" ) // IS NULL
         	  .addFilterBy( "notnullTolKi", "TOL_KI IS NOT NULL" ) // IS NOT NULL
         	  .addFilterBy( "filterByTolKiMatch", "TOL_KI LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY
         	  .addFilterBy( "equalornullTolKi", "((TOL_KI) = ? OR TOL_KI IS NULL)" ) // EQUALORNULL
         	  .addFilterBy( "INTolKi", "TOL_KI IN ( ? )" ) // IN
         	  .addFilterBy( "NOTINTolKi", "TOL_KI NOT IN ( ? )" ) // NOT IN

         	  .addOrderBy( "TolKiasc", "TOL_KI ASC" ) // ORDER ASCENDING
         	  .addOrderBy( "TolKidesc", "TOL_KI DESC" ) // ORDER DESCENDING
         	  ;

		 table.addFilterBy( "equalTolOnNetwork", "(TOL_ON_NETWORK) = ?" ) // EQUAL
         	  .addFilterBy( "notequalTolOnNetwork", "(TOL_ON_NETWORK) != ?" ) // NOTEQUAL
         	  .addFilterBy( "nullTolOnNetwork", "(TOL_ON_NETWORK IS NULL OR LENGTH((TOL_ON_NETWORK)) = 0)" ) // IS NULL
         	  .addFilterBy( "notnullTolOnNetwork", "TOL_ON_NETWORK IS NOT NULL" ) // IS NOT NULL
         	  .addFilterBy( "filterByTolOnNetworkMatch", "TOL_ON_NETWORK LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY
         	  .addFilterBy( "equalornullTolOnNetwork", "((TOL_ON_NETWORK) = ? OR TOL_ON_NETWORK IS NULL)" ) // EQUALORNULL
         	  .addFilterBy( "INTolOnNetwork", "TOL_ON_NETWORK IN ( ? )" ) // IN
         	  .addFilterBy( "NOTINTolOnNetwork", "TOL_ON_NETWORK NOT IN ( ? )" ) // NOT IN

         	  .addOrderBy( "TolOnNetworkasc", "TOL_ON_NETWORK ASC" ) // ORDER ASCENDING
         	  .addOrderBy( "TolOnNetworkdesc", "TOL_ON_NETWORK DESC" ) // ORDER DESCENDING
         	  ;
		 
		 table.addFilterBy( "equalTolHlr", "(TOL_HLR) = ?" ) // EQUAL
         .addFilterBy( "notequalTolHlr", "(TOL_HLR) != ?" ) // NOTEQUAL
         .addFilterBy( "nullTolHlr", "(TOL_HLR IS NULL OR LENGTH((TOL_HLR)) = 0)" ) // IS NULL
         .addFilterBy( "notnullTolHlr", "TOL_HLR IS NOT NULL" ) // IS NOT NULL
         .addFilterBy( "filterByTolHlrMatch", "TOL_HLR LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY
         .addFilterBy( "equalornullTolHlr", "((TOL_HLR) = ? OR TOL_HLR IS NULL)" ) // EQUALORNULL
         .addFilterBy( "INTolHlr", "TOL_HLR IN ( ? )" ) // IN
         .addFilterBy( "NOTINTolHlr", "TOL_HLR NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "TolHlrasc", "TOL_HLR ASC" ) // ORDER ASCENDING
         .addOrderBy( "TolHlrdesc", "TOL_HLR DESC" ) // ORDER DESCENDING
         ;

		 
		 
		 table.addFilterBy( "equalTolPukNo", "(TOL_PUK_NO) = ?" ) // EQUAL
         .addFilterBy( "notequalTolPukNo", "(TOL_PUK_NO) != ?" ) // NOTEQUAL
         .addFilterBy( "nullTolPukNo", "(TOL_PUK_NO IS NULL OR LENGTH((TOL_PUK_NO)) = 0)" ) // IS NULL
         .addFilterBy( "notnullTolPukNo", "TOL_PUK_NO IS NOT NULL" ) // IS NOT NULL
         .addFilterBy( "filterByTolPukNoMatch", "TOL_PUK_NO LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY
         .addFilterBy( "equalornullTolPukNo", "((TOL_PUK_NO) = ? OR TOL_PUK_NO IS NULL)" ) // EQUALORNULL
         .addFilterBy( "INTolPukNo", "TOL_PUK_NO IN ( ? )" ) // IN
         .addFilterBy( "NOTINTolPukNo", "TOL_PUK_NO NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "TolPukNoasc", "TOL_PUK_NO ASC" ) // ORDER ASCENDING
         .addOrderBy( "TolPukNodesc", "TOL_PUK_NO DESC" ) // ORDER DESCENDING
         ;

		 table.addFilterBy( "equalTolStatus", "(TOL_STATUS) = ?" ) // EQUAL
         .addFilterBy( "notequalTolStatus", "(TOL_STATUS) != ?" ) // NOTEQUAL
         .addFilterBy( "nullTolStatus", "(TOL_STATUS IS NULL OR LENGTH((TOL_STATUS)) = 0)" ) // IS NULL
         .addFilterBy( "notnullTolStatus", "TOL_STATUS IS NOT NULL" ) // IS NOT NULL
         .addFilterBy( "filterByTolStatusMatch", "TOL_STATUS LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY
         .addFilterBy( "equalornullTolStatus", "((TOL_STATUS) = ? OR TOL_STATUS IS NULL)" ) // EQUALORNULL
         .addFilterBy( "INTolStatus", "TOL_STATUS IN ( ? )" ) // IN
         .addFilterBy( "NOTINTolStatus", "TOL_STATUS NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "TolStatusasc", "TOL_STATUS ASC" ) // ORDER ASCENDING
         .addOrderBy( "TolStatusdesc", "TOL_STATUS DESC" ) // ORDER DESCENDING
         ;

		 
		    table.addFilterBy( "equalTolActiveDate", "TOL_ACTIVE_DATE = ?" ) // EQUAL
	         .addFilterBy( "notequalTolActiveDate", "TOL_ACTIVE_DATE != ?" ) // NOTEQUAL
	         .addFilterBy( "nullTolActiveDate", "TOL_ACTIVE_DATE IS NULL" ) // IS NULL
	         .addFilterBy( "notnullTolActiveDate", "TOL_ACTIVE_DATE IS NOT NULL" ) // IS NOT NULL
	         .addFilterBy( "lessthanTolActiveDate", "TOL_ACTIVE_DATE < ?" ) // LESS THAN
	         .addFilterBy( "greaterthanTolActiveDate", "TOL_ACTIVE_DATE > ?" ) // GREATER THAN
	         .addFilterBy( "lessthanorequalTolActiveDate", "TOL_ACTIVE_DATE <= ?" ) // LESS THAN OR EQUAL
	         .addFilterBy( "greaterthanorequalTolActiveDate", "TOL_ACTIVE_DATE >= ?" ) // GREATER THAN OR EQUAL
	         .addFilterBy( "filterByTolActiveDateMatch", "TOL_ACTIVE_DATE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY
	         .addFilterBy( "betweenTolActiveDate", "TOL_ACTIVE_DATE BETWEEN ? AND ?" ) // BETWEEN
	         .addFilterBy( "equalornullTolActiveDate", "(TOL_ACTIVE_DATE IS NULL OR TOL_ACTIVE_DATE = ?)" ) // EQUALORNULL
	         .addFilterBy( "lessthanornullTolActiveDate","(TOL_ACTIVE_DATE IS NULL OR TOL_ACTIVE_DATE < ?)" ) // LESSTHANORNULL
	         .addFilterBy( "greaterthanornullTolActiveDate","(TOL_ACTIVE_DATE IS NULL OR TOL_ACTIVE_DATE > ?)" ) // GREATERTHANORNULL
	         .addFilterBy( "INTolActiveDate", "TOL_ACTIVE_DATE IN ( ? )" ) // IN
	         .addFilterBy( "NOTINTolActiveDate", "TOL_ACTIVE_DATE NOT IN ( ? )" ) // NOT IN
	         .addOrderBy( "TolActiveDateasc", "TOL_ACTIVE_DATE ASC" ) // ORDER ASCENDING
	         .addOrderBy( "TolActiveDatedesc", "TOL_ACTIVE_DATE DESC" ) // ORDER DESCENDING
	    ;
		    
		    
		    table.addFilterBy( "equalTolAvailDate", "TOL_AVAIL_DATE = ?" ) // EQUAL
	         .addFilterBy( "notequalTolAvailDate", "TOL_AVAIL_DATE != ?" ) // NOTEQUAL
	         .addFilterBy( "nullTolAvailDate", "TOL_AVAIL_DATE IS NULL" ) // IS NULL
	         .addFilterBy( "notnullTolAvailDate", "TOL_AVAIL_DATE IS NOT NULL" ) // IS NOT NULL
	         .addFilterBy( "lessthanTolAvailDate", "TOL_AVAIL_DATE < ?" ) // LESS THAN
	         .addFilterBy( "greaterthanTolAvailDate", "TOL_AVAIL_DATE > ?" ) // GREATER THAN
	         .addFilterBy( "lessthanorequalTolAvailDate", "TOL_AVAIL_DATE <= ?" ) // LESS THAN OR EQUAL
	         .addFilterBy( "greaterthanorequalTolAvailDate", "TOL_AVAIL_DATE >= ?" ) // GREATER THAN OR EQUAL
	         .addFilterBy( "filterByTolAvailDateMatch", "TOL_AVAIL_DATE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY
	         .addFilterBy( "betweenTolAvailDate", "TOL_AVAIL_DATE BETWEEN ? AND ?" ) // BETWEEN
	         .addFilterBy( "equalornullTolAvailDate", "(TOL_AVAIL_DATE IS NULL OR TOL_AVAIL_DATE = ?)" ) // EQUALORNULL
	         .addFilterBy( "lessthanornullTolAvailDate","(TOL_AVAIL_DATE IS NULL OR TOL_AVAIL_DATE < ?)" ) // LESSTHANORNULL
	         .addFilterBy( "greaterthanornullTolAvailDate","(TOL_AVAIL_DATE IS NULL OR TOL_AVAIL_DATE > ?)" ) // GREATERTHANORNULL
	         .addFilterBy( "INTolAvailDate", "TOL_AVAIL_DATE IN ( ? )" ) // IN
	         .addFilterBy( "NOTINTolAvailDate", "TOL_AVAIL_DATE NOT IN ( ? )" ) // NOT IN
	         .addOrderBy( "TolAvailDateasc", "TOL_AVAIL_DATE ASC" ) // ORDER ASCENDING
	         .addOrderBy( "TolAvailDatedesc", "TOL_AVAIL_DATE DESC" ) // ORDER DESCENDING
	    ;
		 
		 
		    table.addFilterBy( "equalTolExpiryDate", "TOL_EXPIRY_DATE = ?" ) // EQUAL
	         .addFilterBy( "notequalTolExpiryDate", "TOL_EXPIRY_DATE != ?" ) // NOTEQUAL
	         .addFilterBy( "nullTolExpiryDate", "TOL_EXPIRY_DATE IS NULL" ) // IS NULL
	         .addFilterBy( "notnullTolExpiryDate", "TOL_EXPIRY_DATE IS NOT NULL" ) // IS NOT NULL
	         .addFilterBy( "lessthanTolExpiryDate", "TOL_EXPIRY_DATE < ?" ) // LESS THAN
	         .addFilterBy( "greaterthanTolExpiryDate", "TOL_EXPIRY_DATE > ?" ) // GREATER THAN
	         .addFilterBy( "lessthanorequalTolExpiryDate", "TOL_EXPIRY_DATE <= ?" ) // LESS THAN OR EQUAL
	         .addFilterBy( "greaterthanorequalTolExpiryDate", "TOL_EXPIRY_DATE >= ?" ) // GREATER THAN OR EQUAL
	         .addFilterBy( "filterByTolExpiryDateMatch", "TOL_EXPIRY_DATE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY
	         .addFilterBy( "betweenTolExpiryDate", "TOL_EXPIRY_DATE BETWEEN ? AND ?" ) // BETWEEN
	         .addFilterBy( "equalornullTolExpiryDate", "(TOL_EXPIRY_DATE IS NULL OR TOL_EXPIRY_DATE = ?)" ) // EQUALORNULL
	         .addFilterBy( "lessthanornullTolExpiryDate","(TOL_EXPIRY_DATE IS NULL OR TOL_EXPIRY_DATE < ?)" ) // LESSTHANORNULL
	         .addFilterBy( "greaterthanornullTolExpiryDate","(TOL_EXPIRY_DATE IS NULL OR TOL_EXPIRY_DATE > ?)" ) // GREATERTHANORNULL
	         .addFilterBy( "INTolExpiryDate", "TOL_EXPIRY_DATE IN ( ? )" ) // IN
	         .addFilterBy( "NOTINTolExpiryDate", "TOL_EXPIRY_DATE NOT IN ( ? )" ) // NOT IN
	         .addOrderBy( "TolExpiryDateasc", "TOL_EXPIRY_DATE ASC" ) // ORDER ASCENDING
	         .addOrderBy( "TolExpiryDatedesc", "TOL_EXPIRY_DATE DESC" ) // ORDER DESCENDING
	    ;
		 
		    table.addFilterBy( "equalTolWarehouse", "(TOL_WAREHOUSE) = ?" ) // EQUAL
	         .addFilterBy( "notequalTolWarehouse", "(TOL_WAREHOUSE) != ?" ) // NOTEQUAL
	         .addFilterBy( "nullTolWarehouse", "(TOL_WAREHOUSE IS NULL OR LENGTH((TOL_WAREHOUSE)) = 0)" ) // IS NULL
	         .addFilterBy( "notnullTolWarehouse", "TOL_WAREHOUSE IS NOT NULL" ) // IS NOT NULL
	         .addFilterBy( "filterByTolWarehouseMatch", "TOL_WAREHOUSE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY
	         .addFilterBy( "equalornullTolWarehouse", "((TOL_WAREHOUSE) = ? OR TOL_WAREHOUSE IS NULL)" ) // EQUALORNULL
	         .addFilterBy( "INTolWarehouse", "TOL_WAREHOUSE IN ( ? )" ) // IN
	         .addFilterBy( "NOTINTolWarehouse", "TOL_WAREHOUSE NOT IN ( ? )" ) // NOT IN

	         .addOrderBy( "TolWarehouseasc", "TOL_WAREHOUSE ASC" ) // ORDER ASCENDING
	         .addOrderBy( "TolWarehousedesc", "TOL_WAREHOUSE DESC" ) // ORDER DESCENDING
	         ;

		    
		    table.addFilterBy( "equalTolProductCode", "(TOL_PRODUCT_CODE) = ?" ) // EQUAL
	         .addFilterBy( "notequalTolProductCode", "(TOL_PRODUCT_CODE) != ?" ) // NOTEQUAL
	         .addFilterBy( "nullTolProductCode", "(TOL_PRODUCT_CODE IS NULL OR LENGTH((TOL_PRODUCT_CODE)) = 0)" ) // IS NULL
	         .addFilterBy( "notnullTolProductCode", "TOL_PRODUCT_CODE IS NOT NULL" ) // IS NOT NULL
	         .addFilterBy( "filterByTolProductCodeMatch", "TOL_PRODUCT_CODE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY
	         .addFilterBy( "equalornullTolProductCode", "((TOL_PRODUCT_CODE) = ? OR TOL_PRODUCT_CODE IS NULL)" ) // EQUALORNULL
	         .addFilterBy( "INTolProductCode", "TOL_PRODUCT_CODE IN ( ? )" ) // IN
	         .addFilterBy( "NOTINTolProductCode", "TOL_PRODUCT_CODE NOT IN ( ? )" ) // NOT IN

	         .addOrderBy( "TolProductCodeasc", "TOL_PRODUCT_CODE ASC" ) // ORDER ASCENDING
	         .addOrderBy( "TolProductCodedesc", "TOL_PRODUCT_CODE DESC" ) // ORDER DESCENDING
	         ;
		    
		    table.addFilterBy( "equalTolDealerId", "(TOL_DEALER_ID) = ?" ) // EQUAL
	         .addFilterBy( "notequalTolDealerId", "(TOL_DEALER_ID) != ?" ) // NOTEQUAL
	         .addFilterBy( "nullTolDealerId", "(TOL_DEALER_ID IS NULL OR LENGTH((TOL_DEALER_ID)) = 0)" ) // IS NULL
	         .addFilterBy( "notnullTolDealerId", "TOL_DEALER_ID IS NOT NULL" ) // IS NOT NULL
	         .addFilterBy( "filterByTolDealerIdMatch", "TOL_DEALER_ID LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY
	         .addFilterBy( "equalornullTolDealerId", "((TOL_DEALER_ID) = ? OR TOL_DEALER_ID IS NULL)" ) // EQUALORNULL
	         .addFilterBy( "INTolDealerId", "TOL_DEALER_ID IN ( ? )" ) // IN
	         .addFilterBy( "NOTINTolDealerId", "TOL_DEALER_ID NOT IN ( ? )" ) // NOT IN

	         .addOrderBy( "TolDealerIdasc", "TOL_DEALER_ID ASC" ) // ORDER ASCENDING
	         .addOrderBy( "TolDealerIddesc", "TOL_DEALER_ID DESC" ) // ORDER DESCENDING
	         ;
		    	
		    
		    table.addFilterBy( "equalTolTransportKey", "(TOL_TRANSPORT_KEY) = ?" ) // EQUAL
	         .addFilterBy( "notequalTolTransportKey", "(TOL_TRANSPORT_KEY) != ?" ) // NOTEQUAL
	         .addFilterBy( "nullTolTransportKey", "(TOL_TRANSPORT_KEY IS NULL OR LENGTH((TOL_TRANSPORT_KEY)) = 0)" ) // IS NULL
	         .addFilterBy( "notnullTolTransportKey", "TOL_TRANSPORT_KEY IS NOT NULL" ) // IS NOT NULL
	         .addFilterBy( "filterByTolTransportKeyMatch", "TOL_TRANSPORT_KEY LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY
	         .addFilterBy( "equalornullTolTransportKey", "((TOL_TRANSPORT_KEY) = ? OR TOL_TRANSPORT_KEY IS NULL)" ) // EQUALORNULL
	         .addFilterBy( "INTolTransportKey", "TOL_TRANSPORT_KEY IN ( ? )" ) // IN
	         .addFilterBy( "NOTINTolTransportKey", "TOL_TRANSPORT_KEY NOT IN ( ? )" ) // NOT IN

	         .addOrderBy( "TolTransportKeyasc", "TOL_TRANSPORT_KEY ASC" ) // ORDER ASCENDING
	         .addOrderBy( "TolTransportKeydesc", "TOL_TRANSPORT_KEY DESC" ) // ORDER DESCENDING
	         ;

		    table.addFilterBy( "equalTolPinNo", "(TOL_PIN_NO) = ?" ) // EQUAL
		             .addFilterBy( "notequalTolPinNo", "(TOL_PIN_NO) != ?" ) // NOTEQUAL
		             .addFilterBy( "nullTolPinNo", "(TOL_PIN_NO IS NULL OR LENGTH((TOL_PIN_NO)) = 0)" ) // IS NULL
		             .addFilterBy( "notnullTolPinNo", "TOL_PIN_NO IS NOT NULL" ) // IS NOT NULL
		             .addFilterBy( "filterByTolPinNoMatch", "TOL_PIN_NO LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY
		             .addFilterBy( "equalornullTolPinNo", "((TOL_PIN_NO) = ? OR TOL_PIN_NO IS NULL)" ) // EQUALORNULL
		             .addFilterBy( "INTolPinNo", "TOL_PIN_NO IN ( ? )" ) // IN
		             .addFilterBy( "NOTINTolPinNo", "TOL_PIN_NO NOT IN ( ? )" ) // NOT IN

		             .addOrderBy( "TolPinNoasc", "TOL_PIN_NO ASC" ) // ORDER ASCENDING
		             .addOrderBy( "TolPinNodesc", "TOL_PIN_NO DESC" ) // ORDER DESCENDING
		             ;

		    table.addFilterBy( "equalTolPukNo2", "(TOL_PUK_NO_2) = ?" ) // EQUAL
	         .addFilterBy( "notequalTolPukNo2", "(TOL_PUK_NO_2) != ?" ) // NOTEQUAL
	         .addFilterBy( "nullTolPukNo2", "(TOL_PUK_NO_2 IS NULL OR LENGTH((TOL_PUK_NO_2)) = 0)" ) // IS NULL
	         .addFilterBy( "notnullTolPukNo2", "TOL_PUK_NO_2 IS NOT NULL" ) // IS NOT NULL
	         .addFilterBy( "filterByTolPukNo2Match", "TOL_PUK_NO_2 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY
	         .addFilterBy( "equalornullTolPukNo2", "((TOL_PUK_NO_2) = ? OR TOL_PUK_NO_2 IS NULL)" ) // EQUALORNULL
	         .addFilterBy( "INTolPukNo2", "TOL_PUK_NO_2 IN ( ? )" ) // IN
	         .addFilterBy( "NOTINTolPukNo2", "TOL_PUK_NO_2 NOT IN ( ? )" ) // NOT IN

	         .addOrderBy( "TolPukNo2asc", "TOL_PUK_NO_2 ASC" ) // ORDER ASCENDING
	         .addOrderBy( "TolPukNo2desc", "TOL_PUK_NO_2 DESC" ) // ORDER DESCENDING
	         ;


		    table.addFilterBy( "equalTolPinNo2", "(TOL_PIN_NO_2) = ?" ) // EQUAL
	         .addFilterBy( "notequalTolPinNo2", "(TOL_PIN_NO_2) != ?" ) // NOTEQUAL
	         .addFilterBy( "nullTolPinNo2", "(TOL_PIN_NO_2 IS NULL OR LENGTH((TOL_PIN_NO_2)) = 0)" ) // IS NULL
	         .addFilterBy( "notnullTolPinNo2", "TOL_PIN_NO_2 IS NOT NULL" ) // IS NOT NULL
	         .addFilterBy( "filterByTolPinNo2Match", "TOL_PIN_NO_2 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY
	         .addFilterBy( "equalornullTolPinNo2", "((TOL_PIN_NO_2) = ? OR TOL_PIN_NO_2 IS NULL)" ) // EQUALORNULL
	         .addFilterBy( "INTolPinNo2", "TOL_PIN_NO_2 IN ( ? )" ) // IN
	         .addFilterBy( "NOTINTolPinNo2", "TOL_PIN_NO_2 NOT IN ( ? )" ) // NOT IN

	         .addOrderBy( "TolPinNo2asc", "TOL_PIN_NO_2 ASC" ) // ORDER ASCENDING
	         .addOrderBy( "TolPinNo2desc", "TOL_PIN_NO_2 DESC" ) // ORDER DESCENDING
	         ;
		    
		    
		    table.addFilterBy( "equalTolAnalysis1", "(TOL_ANALYSIS_1) = ?" ) // EQUAL
	         .addFilterBy( "notequalTolAnalysis1", "(TOL_ANALYSIS_1) != ?" ) // NOTEQUAL
	         .addFilterBy( "nullTolAnalysis1", "(TOL_ANALYSIS_1 IS NULL OR LENGTH((TOL_ANALYSIS_1)) = 0)" ) // IS NULL
	         .addFilterBy( "notnullTolAnalysis1", "TOL_ANALYSIS_1 IS NOT NULL" ) // IS NOT NULL
	         .addFilterBy( "filterByTolAnalysis1Match", "TOL_ANALYSIS_1 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY
	         .addFilterBy( "equalornullTolAnalysis1", "((TOL_ANALYSIS_1) = ? OR TOL_ANALYSIS_1 IS NULL)" ) // EQUALORNULL
	         .addFilterBy( "INTolAnalysis1", "TOL_ANALYSIS_1 IN ( ? )" ) // IN
	         .addFilterBy( "NOTINTolAnalysis1", "TOL_ANALYSIS_1 NOT IN ( ? )" ) // NOT IN

	         .addOrderBy( "TolAnalysis1asc", "TOL_ANALYSIS_1 ASC" ) // ORDER ASCENDING
	         .addOrderBy( "TolAnalysis1desc", "TOL_ANALYSIS_1 DESC" ) // ORDER DESCENDING
	         ;
		    
		    table.addFilterBy( "equalTolAnalysis2", "(TOL_ANALYSIS_2) = ?" ) // EQUAL
	         .addFilterBy( "notequalTolAnalysis2", "(TOL_ANALYSIS_2) != ?" ) // NOTEQUAL
	         .addFilterBy( "nullTolAnalysis2", "(TOL_ANALYSIS_2 IS NULL OR LENGTH((TOL_ANALYSIS_2)) = 0)" ) // IS NULL
	         .addFilterBy( "notnullTolAnalysis2", "TOL_ANALYSIS_2 IS NOT NULL" ) // IS NOT NULL
	         .addFilterBy( "filterByTolAnalysis2Match", "TOL_ANALYSIS_2 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY
	         .addFilterBy( "equalornullTolAnalysis2", "((TOL_ANALYSIS_2) = ? OR TOL_ANALYSIS_2 IS NULL)" ) // EQUALORNULL
	         .addFilterBy( "INTolAnalysis2", "TOL_ANALYSIS_2 IN ( ? )" ) // IN
	         .addFilterBy( "NOTINTolAnalysis2", "TOL_ANALYSIS_2 NOT IN ( ? )" ) // NOT IN

	         .addOrderBy( "TolAnalysis2asc", "TOL_ANALYSIS_2 ASC" ) // ORDER ASCENDING
	         .addOrderBy( "TolAnalysis2desc", "TOL_ANALYSIS_2 DESC" ) // ORDER DESCENDING
	         ;
		    
		    table.addFilterBy( "equalTolAnalysis3", "(TOL_ANALYSIS_3) = ?" ) // EQUAL
	         .addFilterBy( "notequalTolAnalysis3", "(TOL_ANALYSIS_3) != ?" ) // NOTEQUAL
	         .addFilterBy( "nullTolAnalysis3", "(TOL_ANALYSIS_3 IS NULL OR LENGTH((TOL_ANALYSIS_3)) = 0)" ) // IS NULL
	         .addFilterBy( "notnullTolAnalysis3", "TOL_ANALYSIS_3 IS NOT NULL" ) // IS NOT NULL
	         .addFilterBy( "filterByTolAnalysis3Match", "TOL_ANALYSIS_3 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY
	         .addFilterBy( "equalornullTolAnalysis3", "((TOL_ANALYSIS_3) = ? OR TOL_ANALYSIS_3 IS NULL)" ) // EQUALORNULL
	         .addFilterBy( "INTolAnalysis3", "TOL_ANALYSIS_3 IN ( ? )" ) // IN
	         .addFilterBy( "NOTINTolAnalysis3", "TOL_ANALYSIS_3 NOT IN ( ? )" ) // NOT IN

	         .addOrderBy( "TolAnalysis3asc", "TOL_ANALYSIS_3 ASC" ) // ORDER ASCENDING
	         .addOrderBy( "TolAnalysis3desc", "TOL_ANALYSIS_3 DESC" ) // ORDER DESCENDING
	         ;
		    
		    
		    
	}
	
	
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
	      dml = new TolSimNosDMLFactory();
	    }

	    return dml;
	  }

	


}
