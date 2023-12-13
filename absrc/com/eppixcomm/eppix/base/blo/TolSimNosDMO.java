package com.eppixcomm.eppix.base.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;
import com.eppixcomm.eppix.common.util.Date;

public class TolSimNosDMO extends DBO
implements Serializable
{
	
	  //~ Static variables/initializers //////////////////////////////////////////

	  //---------------------
	  // Field type declarations
	  //---------------------
	  /**
	   * Defines the internal behaviour of the fields so the internal layers can manipulate them without
	   * needing to introspect them.
	   * The order of the fields in the definition must match the actual order in this DMO.
	   */
	  private static final int[] fieldTypes = new int[] {
	      FIELD_TYPE_STRING /* std public attribute: simNo  */,
	      FIELD_TYPE_STRING /* std public attribute: networkId  */,
	      FIELD_TYPE_STRING /* std public attribute: imsiNo  */,
	      FIELD_TYPE_STRING /* std public attribute: ki  */,
	      FIELD_TYPE_STRING /* std public attribute: onNetwork  */,
	      FIELD_TYPE_STRING /* std public attribute: hlr  */,
	      FIELD_TYPE_STRING /* std public attribute: pukNo  */,
	      FIELD_TYPE_STRING /* std public attribute: status  */,
	      FIELD_TYPE_DATEONLY /* std public attribute: activeDate  */,
	      FIELD_TYPE_DATEONLY /* std public attribute: availDate  */,
	      FIELD_TYPE_DATEONLY /* std public attribute: expiryDate  */,
	      FIELD_TYPE_STRING /* std public attribute: warehouse  */,
	      FIELD_TYPE_STRING /* std public attribute: productCode  */,
	      FIELD_TYPE_STRING /* std public attribute: dealerId  */,
	      FIELD_TYPE_STRING /* std public attribute: transportKey  */,
	      FIELD_TYPE_STRING /* std public attribute: pinNo  */,
	      FIELD_TYPE_STRING /* std public attribute: pukNo2  */,
	      FIELD_TYPE_STRING /* std public attribute: pinNo2  */,
	      FIELD_TYPE_STRING /* std public attribute: analysis1  */,
	      FIELD_TYPE_STRING /* std public attribute: analysis2  */,
	      FIELD_TYPE_STRING /* std public attribute: analysis3  */
	      
	    };
	  
	  private final int[] fieldSizes = new int[] {
			  tolSimNoSize,
			  tolNetworkIdSize,
			  tolImsiNoSize,
			  tolKiSize,
			  tolOnNetworkSize,
			  tolHlrSize,
			  tolPukNoSize,
			  tolStatusSize,
			  0,
			  0,
			  0,
			  tolWarehouseSize,
			  tolProductCodeSize,
			  tolDealerIdSize,
			  tolTransportKeySize,
			  tolPinNoSize,
			  tolPukNo2Size,
			  tolPinNo2Size,
			  tolAnalysis1Size,
			  tolAnalysis2Size,
			  tolAnalysis3Size
	  };
	      

	  public int[] fieldSizes() {
	  	return fieldSizes;
	  }  

		public static final int tolSimNoFilter		= 0; // filter index
		private static final int tolSimNoSize		= 14;// field size
		
		public static final int tolNetworkIdFilter	= 1; // filter index
		private static final int tolNetworkIdSize	= 5;  // field size
		
		public static final int tolImsiNoFilter		= 2; // filter index
		private static final int tolImsiNoSize		= 15; // field size
		
		public static final int tolKiFilter		= 3; // filter index
		private static final int tolKiSize		=	32; // field size
		
		public static final int tolOnNetworkFilter	= 4; // filter index
		private static final int tolOnNetworkSize	=	1; // field size
		
		public static final int tolHlrFilter		= 5; // filter index
		private static final int tolHlrSize		    = 2 ;// field size
		
		public static final int tolPukNoFilter		= 6; // filter index
		private static final int tolPukNoSize		=	8; // field size
		
		public static final int tolStatusFilter		= 7; // filter index
		private static final int tolStatusSize		=	1; // field size
		
		public static final int tolActiveDateFilter 	= 8; // filter index
		public static final int tolAvailDateFilter 	= 9; // filter index
		public static final int tolExpiryDateFilter	= 10; // filter index
		
		public static final int tolWarehouseFilter	= 11; // filter index
		private static final int tolWarehouseSize	=	2 ;// field size
		
		public static final int tolProductCodeFilter	= 12; // filter index
		private static final int tolProductCodeSize	=	20 ;// field size
		
		public static final int tolDealerIdFilter	= 13; // filter index
		private static final int tolDealerIdSize	=	8 ;// field size
		
		public static final int tolTransportKeyFilter	= 14; // filter index
		private static final int tolTransportKeySize	=	15; // field size
		
		public static final int tolPinNoFilter		= 15; // filter index
		private static final int tolPinNoSize		=	8 ;// field size
		
		
		public static final int tolPukNo2Filter		= 16; // filter index
		private static final int tolPukNo2Size		=	8; // field size
				
		public static final int tolPinNo2Filter		= 17; // filter index
		private static final int tolPinNo2Size		=	8 ;// field size
		
		public static final int tolAnalysis1Filter	= 18; // filter index
		private static final int tolAnalysis1Size	=	30 ;// field size
		
		
		public static final int tolAnalysis2Filter	= 19; // filter index
		private static final int tolAnalysis2Size	=	30 ;// field size
		
		public static final int tolAnalysis3Filter	= 20; // filter index
		private static final int tolAnalysis3Size	=	30; // field size
		
		
		private String		  tolSimNo 	;
		private String		  tolNetworkId 	;
		private String		  tolImsiNo 	;
		private String		  tolKi 	;
		private String		  tolOnNetwork 	;
		private String		  tolHlr 	;
		private String		  tolPukNo 	;
		private String		  tolStatus 	;
		private Date		  tolActiveDate 	;
		private Date		  tolAvailDate 	;
		private Date		  tolExpiryDate 	;
		private String		  tolWarehouse 	;
		private String		  tolProductCode 	;
		private String		  tolDealerId 	;
		private String		  tolTransportKey 	;
		private String		  tolPinNo 	;
		private String		  tolPukNo2 	;
		private String		  tolPinNo2 	;
		private String		  tolAnalysis1 	;
		private String		  tolAnalysis2 	;
		private String		  tolAnalysis3 	;

		 public TolSimNosDMO( String tolSimNo,String tolNetworkId, String tolImsiNo,String tolKi, String tolOnNetwork,
String tolHlr,String tolPukNo,String tolStatus,Date tolActiveDate,Date tolAvailDate,
Date tolExpiryDate, String tolWarehouse,String tolProductCode,String tolDealerId, 
String tolTransportKey,String tolPinNo, String tolPukNo2,String tolPinNo2,
 String tolAnalysis1,String tolAnalysis2, String tolAnalysis3) {
			 
			super();
			this.tolActiveDate = tolActiveDate;
			this.tolAnalysis1 = tolAnalysis1;
			this.tolAnalysis2 = tolAnalysis2;
			this.tolAnalysis3 = tolAnalysis3;
			this.tolAvailDate = tolAvailDate;
			this.tolDealerId = tolDealerId;
			this.tolExpiryDate = tolExpiryDate;
			this.tolHlr = tolHlr;
			this.tolImsiNo = tolImsiNo;
			this.tolKi = tolKi;
			this.tolNetworkId = tolNetworkId;
			this.tolOnNetwork = tolOnNetwork;
			this.tolPinNo = tolPinNo;
			this.tolPinNo2 = tolPinNo2;
			this.tolProductCode = tolProductCode;
			this.tolPukNo = tolPukNo;
			this.tolPukNo2 = tolPukNo2;
			this.tolSimNo = tolSimNo;
			this.tolStatus = tolStatus;
			this.tolTransportKey = tolTransportKey;
			this.tolWarehouse = tolWarehouse;
		}

		
	public TolSimNosDMO() {
			// TODO Auto-generated constructor stub
		}


	protected void generatedKey(Integer key) {
		// TODO Auto-generated method stub
		
	}

	protected Object[] get() {
		// TODO Auto-generated method stub
		
		// return null;
		return new Object[] {
				( tolSimNo == null ) ? null
                        : ( ( tolSimNo.length(  ) <= tolSimNoSize )? tolSimNo
                        : tolSimNo.substring( 0, tolSimNoSize ) // auto trimmed to fit, if required.
                ),
                ( tolNetworkId == null ) ? null
                        : ( ( tolNetworkId.length(  ) <= tolNetworkIdSize )? tolNetworkId
                        : tolNetworkId.substring( 0, tolNetworkIdSize ) // auto trimmed to fit, if required.
                ),

		 ( tolImsiNo == null ) ? null
                        : ( ( tolImsiNo.length(  ) <= tolImsiNoSize )? tolImsiNo
                        : tolImsiNo.substring( 0, tolImsiNoSize ) // auto trimmed to fit, if required.
                ),
		
                ( tolKi == null ) ? null
                        : ( ( tolKi.length(  ) <= tolKiSize )? tolKi
                        : tolKi.substring( 0, tolKiSize ) // auto trimmed to fit, if required.
                ),

                ( tolOnNetwork == null ) ? null
                        : ( ( tolOnNetwork.length(  ) <= tolOnNetworkSize )? tolOnNetwork
                        : tolOnNetwork.substring( 0, tolOnNetworkSize ) // auto trimmed to fit, if required.
                ),
                ( tolHlr == null ) ? null
                        : ( ( tolHlr.length(  ) <= tolHlrSize )? tolHlr
                        : tolHlr.substring( 0, tolHlrSize ) // auto trimmed to fit, if required.
                ),
                ( tolPukNo == null ) ? null
                        : ( ( tolPukNo.length(  ) <= tolPukNoSize )? tolPukNo
                        : tolPukNo.substring( 0, tolPukNoSize ) // auto trimmed to fit, if required.
                ),
                ( tolStatus == null ) ? null
                        : ( ( tolStatus.length(  ) <= tolStatusSize )? tolStatus
                        : tolStatus.substring( 0, tolStatusSize ) // auto trimmed to fit, if required.
                ),
		tolActiveDate,
		tolAvailDate,
                tolExpiryDate,

		 ( tolWarehouse == null ) ? null
                        : ( ( tolWarehouse.length(  ) <= tolWarehouseSize )? tolWarehouse
                        : tolWarehouse.substring( 0, tolWarehouseSize ) // auto trimmed to fit, if required.
                ),
                ( tolProductCode == null ) ? null
                        : ( ( tolProductCode.length(  ) <= tolProductCodeSize )? tolProductCode
                        : tolProductCode.substring( 0, tolProductCodeSize ) // auto trimmed to fit, if required.
                ),
                ( tolDealerId == null ) ? null
                        : ( ( tolDealerId.length(  ) <= tolDealerIdSize )? tolDealerId
                        : tolDealerId.substring( 0, tolDealerIdSize ) // auto trimmed to fit, if required.
                ),
		( tolTransportKey == null ) ? null
                        : ( ( tolTransportKey.length(  ) <= tolTransportKeySize )? tolTransportKey
                        : tolTransportKey.substring( 0, tolTransportKeySize ) // auto trimmed to fit, if required.
                ),
                ( tolPinNo == null ) ? null
                        : ( ( tolPinNo.length(  ) <= tolPinNoSize )? tolPinNo
                        : tolPinNo.substring( 0, tolPinNoSize ) // auto trimmed to fit, if required.
                ),
		 ( tolPukNo2 == null ) ? null
                        : ( ( tolPukNo2.length(  ) <= tolPukNo2Size )? tolPukNo2
                        : tolPukNo2.substring( 0, tolPukNo2Size ) // auto trimmed to fit, if required.
                ),
                ( tolPinNo2 == null ) ? null
                        : ( ( tolPinNo2.length(  ) <= tolPinNo2Size )? tolPinNo2
                        : tolPinNo2.substring( 0, tolPinNo2Size ) // auto trimmed to fit, if required.
                ),

		( tolAnalysis1 == null ) ? null
               : ( ( tolAnalysis1.length(  ) <= tolAnalysis1Size )? tolAnalysis1
               : tolAnalysis1.substring( 0, tolAnalysis1Size ) // auto trimmed to fit, if required.
               ),
               ( tolAnalysis2 == null ) ? null
                       : ( ( tolAnalysis2.length(  ) <= tolAnalysis2Size )? tolAnalysis2
                       : tolAnalysis2.substring( 0, tolAnalysis2Size ) // auto trimmed to fit, if required.
                ),
                ( tolAnalysis3 == null ) ? null
                        : ( ( tolAnalysis3.length(  ) <= tolAnalysis3Size )? tolAnalysis3
                        : tolAnalysis3.substring( 0, tolAnalysis3Size ) // auto trimmed to fit, if required.
                )
                 
				
		};
	}

	protected Integer versionNumber() {
		// TODO Auto-generated method stub
		return null;
	}

	protected void versionNumber(Integer versionNumber) {
		// TODO Auto-generated method stub
		
	}

	protected int[] fieldTypes() {
		// TODO Auto-generated method stub
		return fieldTypes;
	}

	protected DAOArgs primaryKey() {
		// TODO Auto-generated method stub
		return new DAOArgs( 1 ).arg( ( this.tolSimNo == null ) ? null
                : this.tolSimNo
                .trim(  ) );
	}

	protected void set(Object[] fields) {
		  tolSimNo 		=	rtrim( (String) fields[0] );
		  tolNetworkId 	=	rtrim( (String) fields[1] );
		  tolImsiNo 	=	rtrim( (String) fields[2] );
		  tolKi 		=	rtrim( (String) fields[3] );
		  tolOnNetwork 	=	rtrim( (String) fields[4] );
		  tolHlr 		=	rtrim( (String) fields[5] );
		  tolPukNo 		=	rtrim( (String) fields[6] );
		  tolStatus 	=	rtrim( (String) fields[7] );
		  tolActiveDate 	=	(Date) fields[8] ;
		  tolAvailDate 	    =	(Date) fields[9] ;
		  tolExpiryDate 	=	(Date) fields[10];
		  tolWarehouse 		=	rtrim( (String) fields[11] );
		  tolProductCode 	=	rtrim( (String) fields[12] );
		  tolDealerId 		=	rtrim( (String) fields[13] );
		  tolTransportKey 	=	rtrim( (String) fields[14] );
		  tolPinNo 		=	rtrim( (String) fields[15] );
		  tolPukNo2 	=	rtrim( (String) fields[16] );
		  tolPinNo2 	=	rtrim( (String) fields[17] );
		  tolAnalysis1 	=	rtrim( (String) fields[18] );
		  tolAnalysis2 	=	rtrim( (String) fields[19] );
		  tolAnalysis3 	=	rtrim( (String) fields[20] );

		
	}


	public String getTolSimNo() {
		return tolSimNo;
	}


	public void setTolSimNo(String tolSimNo) {
		this.tolSimNo = getPadded(tolSimNo, tolSimNoFilter);
	}


	public String getTolNetworkId() {
		return tolNetworkId;
	}


	public void setTolNetworkId(String tolNetworkId) {
		this.tolNetworkId = getPadded(tolNetworkId, tolNetworkIdFilter);
	}


	public String getTolImsiNo() {
		return tolImsiNo;
	}


	public void setTolImsiNo(String tolImsiNo) {
		this.tolImsiNo = getPadded(tolImsiNo, tolImsiNoFilter);
	}


	public String getTolKi() {
		return tolKi;
	}


	public void setTolKi(String tolKi) {
		this.tolKi = getPadded(tolKi, tolKiFilter);
	}


	public String getTolOnNetwork() {
		return tolOnNetwork;
	}


	public void setTolOnNetwork(String tolOnNetwork) {
		this.tolOnNetwork = getPadded(tolOnNetwork, tolOnNetworkFilter);
	}


	public String getTolHlr() {
		return tolHlr;
	}


	public void setTolHlr(String tolHlr) {
		this.tolHlr = getPadded(tolHlr, tolHlrFilter);
	}


	public String getTolPukNo() {
		return tolPukNo;
	}


	public void setTolPukNo(String tolPukNo) {
		this.tolPukNo = getPadded(tolPukNo, tolPukNo2Filter);
	}


	public String getTolStatus() {
		return tolStatus;
	}


	public void setTolStatus(String tolStatus) {
		this.tolStatus = getPadded(tolStatus, tolStatusFilter);
	}


	public Date getTolActiveDate() {
		return tolActiveDate;
	}


	public void setTolActiveDate(Date tolActiveDate) {
		this.tolActiveDate = tolActiveDate;
	}


	public Date getTolAvailDate() {
		return tolAvailDate;
	}


	public void setTolAvailDate(Date tolAvailDate) {
		this.tolAvailDate = tolAvailDate;
	}


	public Date getTolExpiryDate() {
		return tolExpiryDate;
	}


	public void setTolExpiryDate(Date tolExpiryDate) {
		this.tolExpiryDate = tolExpiryDate;
	}


	public String getTolWarehouse() {
		return tolWarehouse;
	}


	public void setTolWarehouse(String tolWarehouse) {
		this.tolWarehouse = getPadded(tolWarehouse, tolWarehouseFilter);
	}


	public String getTolProductCode() {
		return tolProductCode;
	}


	public void setTolProductCode(String tolProductCode) {
		this.tolProductCode = getPadded(tolProductCode, tolProductCodeFilter);
	}


	public String getTolDealerId() {
		return tolDealerId;
	}


	public void setTolDealerId(String tolDealerId) {
		this.tolDealerId = getPadded(tolDealerId, tolDealerIdFilter);
	}


	public String getTolTransportKey() {
		return tolTransportKey;
	}


	public void setTolTransportKey(String tolTransportKey) {
		this.tolTransportKey = getPadded(tolTransportKey, tolTransportKeyFilter);
	}


	public String getTolPinNo() {
		return tolPinNo;
	}


	public void setTolPinNo(String tolPinNo) {
		this.tolPinNo = getPadded(tolPinNo, tolPinNo2Filter);
	}


	public String getTolPukNo2() {
		return tolPukNo2;
	}


	public void setTolPukNo2(String tolPukNo2) {
		this.tolPukNo2 = getPadded(tolPukNo2, tolPukNo2Filter);
	}


	public String getTolPinNo2() {
		return tolPinNo2;
	}


	public void setTolPinNo2(String tolPinNo2) {
		this.tolPinNo2 = getPadded(tolPinNo2, tolPinNo2Filter);
	}


	public String getTolAnalysis1() {
		return tolAnalysis1;
	}


	public void setTolAnalysis1(String tolAnalysis1) {
		this.tolAnalysis1 = getPadded(tolAnalysis1, tolAnalysis1Filter);
	}


	public String getTolAnalysis2() {
		return tolAnalysis2;
	}


	public void setTolAnalysis2(String tolAnalysis2) {
		this.tolAnalysis2 = getPadded(tolAnalysis2, tolAnalysis2Filter);
	}


	public String getTolAnalysis3() {
		return tolAnalysis3;
	}


	public void setTolAnalysis3(String tolAnalysis3) {
		this.tolAnalysis3 = getPadded(tolAnalysis3, tolAnalysis3Filter);
	}


	 
	
	
}
