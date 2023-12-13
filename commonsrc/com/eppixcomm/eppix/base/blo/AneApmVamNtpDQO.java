package com.eppixcomm.eppix.base.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;
import com.eppixcomm.eppix.common.util.Date;
import com.eppixcomm.eppix.common.util.DateTime;

public class AneApmVamNtpDQO  extends DBO implements Serializable{
	protected AneApnNonEppixDMO ane;
	protected ApmApnPopMainDMO apm;
	protected VamActiveMsisdnDMO vam;
	protected NtpNetTransPendDMO ntp;
	
	  private String aneApnId; 
	  private String aneMsisdn; 
	  private Date aneActDate;
	  private Date aneDeactDate;
	  private String apmType; 
	  private String apmId;
	  private String apmName; 
	  private String apmBillMethod;
	  private String apmMsisdn; 
	  private String apmAssigned;
	  private Date apmActDate;
	  private Date apmDeactDate;	
	  private String apmActive; 
	  private String apmWdp;
	  private Date vamAbarDate; // Loaded from Schema
	  private Date vamConnectDate; // Loaded from Schema
	  private Date vamContrTerminat; // Loaded from Schema
	  private Date vamDconnectDate; // Loaded from Schema
	  private Date vamTariffChg; // Loaded from Schema
	  private Date vamTerminatNotif; // Loaded from Schema
	  private Integer vamSubscriberId; // Loaded from Schema
	  private Short vamContrPeriod; // Loaded from Schema
	  private Short vamTwinbillNo; // Loaded from Schema
	  private String vamAirtimeNet; // Loaded from Schema
	  private String vamDealerId; // Loaded from Schema
	  private String vamDepartment; // Loaded from Schema
	  private String vamDirEntry; // Loaded from Schema
	  private String vamHierarchy; // Loaded from Schema
	  private String vamInternTariff; // Loaded from Schema
	  private String vamItemised; // Loaded from Schema
	  private String vamMessComment; // Loaded from Schema
	  private String vamMsisdnKnown; // Loaded from Schema
	  private String vamMsisdnNo; // Loaded from Schema
	  private String vamPrFlag; // Loaded from Schema
	  private String vamSalesman; // Loaded from Schema
	  private String vamSimNo; // Loaded from Schema
	  private String vamStatCode; // Loaded from Schema
	  private String vamSubsSuffix; // Loaded from Schema
	  
	  private String vamOrigProvId;
	  private String vamImpProvId;
	  private String vamOrigServProv;
	  private String vamImpServProv;
	  private String vamMsisdnType;
	  private String vamDummy;
	  private Date vamMsisdnExprtd;
	  private String vamExportedTo;
	  private String vamAnalysis1;
	  private String vamAnalysis2;
	  private String vamAnalysis3;
	  private String vamAnalysis4;
	  private String vamAnalysis5;
	  
	  private Integer ntpSerialId;
	  private String ntpCommand;
	  private Integer ntpSendSeq;
	  private String ntpTranType;
	  private Integer ntpSubscriberId;
	  private String ntpOldValue;
	  private String ntpNewValue;
	  private String ntpServiceCode;
	  private String ntpStatus;
	  private DateTime ntpTimestamp;

	  
	  private static final int[] fieldTypes = new int[] {
	      FIELD_TYPE_STRING, 
	      FIELD_TYPE_STRING,
	      FIELD_TYPE_DATEONLY,
	      FIELD_TYPE_DATEONLY,
		  FIELD_TYPE_STRING, 
	      FIELD_TYPE_STRING,
	      FIELD_TYPE_STRING, 
	      FIELD_TYPE_STRING,
	      FIELD_TYPE_STRING, 
	      FIELD_TYPE_STRING,
	      FIELD_TYPE_DATEONLY,
	      FIELD_TYPE_DATEONLY,
	      FIELD_TYPE_STRING, 
	      FIELD_TYPE_STRING,
	      FIELD_TYPE_INTEGER /* std public attribute: vamSubscriberId */,
	      FIELD_TYPE_STRING /* std public attribute: vamSimNo */,
	      FIELD_TYPE_STRING /* std public attribute: vamMsisdnNo */,
	      FIELD_TYPE_SHORT /* std public attribute: vamTwinbillNo */,
	      FIELD_TYPE_STRING /* std public attribute: vamStatCode */,
	      FIELD_TYPE_DATEONLY /* std public attribute: vamConnectDate */,
	      FIELD_TYPE_DATEONLY /* std public attribute: vamDconnectDate */,
	      FIELD_TYPE_STRING /* std public attribute: vamInternTariff */,
	      FIELD_TYPE_DATEONLY /* std public attribute: vamContrTerminat */,
	      FIELD_TYPE_SHORT /* std public attribute: vamContrPeriod */,
	      FIELD_TYPE_DATEONLY /* std public attribute: vamTerminatNotif */,
	      FIELD_TYPE_STRING /* std public attribute: vamDirEntry */,
	      FIELD_TYPE_STRING /* std public attribute: vamItemised */,
	      FIELD_TYPE_STRING /* std public attribute: vamDepartment */,
	      FIELD_TYPE_STRING /* std public attribute: vamSalesman */,
	      FIELD_TYPE_STRING /* std public attribute: vamDealerId */,
	      FIELD_TYPE_DATEONLY /* std public attribute: vamAbarDate */,
	      FIELD_TYPE_STRING /* std public attribute: vamSubsSuffix */,
	      FIELD_TYPE_STRING /* std public attribute: vamMessComment */,
	      FIELD_TYPE_STRING /* std public attribute: vamAirtimeNet */,
	      FIELD_TYPE_STRING /* std public attribute: vamPrFlag */,
	      FIELD_TYPE_STRING /* std public attribute: vamHierarchy */,
	      FIELD_TYPE_STRING /* std public attribute: vamMsisdnKnown */,
	      FIELD_TYPE_DATEONLY /* std public attribute: vamTariffChg */,
	      
	      FIELD_TYPE_STRING,
	      FIELD_TYPE_STRING,
	      FIELD_TYPE_STRING,
	      FIELD_TYPE_STRING,
	      FIELD_TYPE_STRING,
	      FIELD_TYPE_STRING,
	      FIELD_TYPE_DATEONLY,
	      FIELD_TYPE_STRING,
	      FIELD_TYPE_STRING,
	      FIELD_TYPE_STRING,
	      FIELD_TYPE_STRING,
	      FIELD_TYPE_STRING,
	      FIELD_TYPE_STRING,
	      
		  FIELD_TYPE_INTEGER,
		  FIELD_TYPE_STRING,
		  FIELD_TYPE_INTEGER,
		  FIELD_TYPE_STRING,
		  FIELD_TYPE_INTEGER,
		  FIELD_TYPE_STRING,
		  FIELD_TYPE_STRING,
		  FIELD_TYPE_STRING,
		  FIELD_TYPE_STRING,
		  FIELD_TYPE_DATETIME
	      
	  };
	  
	  /**
	  * TODO SJ Implement the array of field sizes
	  *
	  */
	  private final int[] fieldSizes = new int[] {
	        
	  };
	      

	  public int[] fieldSizes() {
	  	return fieldSizes;
	  }  
	
	  public static final int aneApnIdFilter = 0; // filter index
	  private static final int aneApnIdSize = 15; // field size
	  
	  /**
		 * Unique field index used for Filtering.
		 * 
		 * @see com.eppixcomm.eppix.common.util.QueryFilter
		 */
	  public static final int aneMsisdnFilter = 1; // filter index
	  private static final int aneMsisdnSize = 15; // field size
	  
	  /**
		 * Unique field index used for Filtering.
		 * 
		 * @see com.eppixcomm.eppix.common.util.QueryFilter
		 */
	  public static final int aneActDateFilter = 2; // filter index

	  /**
		 * Unique field index used for Filtering.
		 * 
		 * @see com.eppixcomm.eppix.common.util.QueryFilter
		 */
	  public static final int aneDeactDateFilter = 3; // filter index
	  
	  public static final int apmTypeFilter = 4; // filter index
	  private static final int apmTypeSize = 1; // field size
	  
	  public static final int apmIdFilter = 5; // filter index
	  private static final int apmIdSize = 15; // field size
	  
	  public static final int apmNameFilter = 6; // filter index
	  private static final int apmNameSize = 41; // field size
	  
	  public static final int apmBillMethodFilter = 7; // filter index
	  private static final int apmBillMethodSize = 1; // field size
	  
	  public static final int apmMsisdnFilter = 8; // filter index
	  private static final int apmMsisdnSize = 15; // field size
	  
	  public static final int apmAssignedFilter = 9; // filter index
	  private static final int apmAssignedSize = 1; // field size
	  
	  public static final int apmActDateFilter = 10; // filter index
	  
	  public static final int apmDeactDateFilter = 11; // filter index
	  	  
	  public static final int apmActiveFilter = 12; // filter index
	  private static final int apmActiveSize = 1; // field size
	  
	  public static final int apmWdpFilter = 13; // filter index
	  private static final int apmWdpSize = 8; // field size
	  
	  public static final int vamSubscriberIdFilter = 14; // filter index

	  /**
		 * Unique field index used for Filtering.
		 * 
		 * @see com.eppixcomm.eppix.common.util.QueryFilter
		 */
	  public static final int vamSimNoFilter = 15; // filter index
	  private static final int vamSimNoSize = 14; // field size

	  /**
		 * Unique field index used for Filtering.
		 * 
		 * @see com.eppixcomm.eppix.common.util.QueryFilter
		 */
	  public static final int vamMsisdnNoFilter = 16; // filter index
	  private static final int vamMsisdnNoSize = 15; // field size

	  /**
		 * Unique field index used for Filtering.
		 * 
		 * @see com.eppixcomm.eppix.common.util.QueryFilter
		 */
	  public static final int vamTwinbillNoFilter = 17; // filter index

	  /**
		 * Unique field index used for Filtering.
		 * 
		 * @see com.eppixcomm.eppix.common.util.QueryFilter
		 */
	  public static final int vamStatCodeFilter = 18; // filter index
	  private static final int vamStatCodeSize = 1; // field size

	  /**
		 * Unique field index used for Filtering.
		 * 
		 * @see com.eppixcomm.eppix.common.util.QueryFilter
		 */
	  public static final int vamConnectDateFilter = 19; // filter index

	  /**
		 * Unique field index used for Filtering.
		 * 
		 * @see com.eppixcomm.eppix.common.util.QueryFilter
		 */
	  public static final int vamDconnectDateFilter = 20; // filter index

	  /**
		 * Unique field index used for Filtering.
		 * 
		 * @see com.eppixcomm.eppix.common.util.QueryFilter
		 */
	  public static final int vamInternTariffFilter = 21; // filter index
	  private static final int vamInternTariffSize = 3; // field size

	  /**
		 * Unique field index used for Filtering.
		 * 
		 * @see com.eppixcomm.eppix.common.util.QueryFilter
		 */
	  public static final int vamContrTerminatFilter = 22; // filter index

	  /**
		 * Unique field index used for Filtering.
		 * 
		 * @see com.eppixcomm.eppix.common.util.QueryFilter
		 */
	  public static final int vamContrPeriodFilter = 23; // filter index

	  /**
		 * Unique field index used for Filtering.
		 * 
		 * @see com.eppixcomm.eppix.common.util.QueryFilter
		 */
	  public static final int vamTerminatNotifFilter = 24; // filter index

	  /**
		 * Unique field index used for Filtering.
		 * 
		 * @see com.eppixcomm.eppix.common.util.QueryFilter
		 */
	  public static final int vamDirEntryFilter = 25; // filter index
	  private static final int vamDirEntrySize = 1; // field size

	  /**
		 * Unique field index used for Filtering.
		 * 
		 * @see com.eppixcomm.eppix.common.util.QueryFilter
		 */
	  public static final int vamItemisedFilter = 26; // filter index
	  private static final int vamItemisedSize = 1; // field size

	  /**
		 * Unique field index used for Filtering.
		 * 
		 * @see com.eppixcomm.eppix.common.util.QueryFilter
		 */
	  public static final int vamDepartmentFilter = 27; // filter index
	  private static final int vamDepartmentSize = 3; // field size

	  /**
		 * Unique field index used for Filtering.
		 * 
		 * @see com.eppixcomm.eppix.common.util.QueryFilter
		 */
	  public static final int vamSalesmanFilter = 28; // filter index
	  private static final int vamSalesmanSize = 10; // field size

	  /**
		 * Unique field index used for Filtering.
		 * 
		 * @see com.eppixcomm.eppix.common.util.QueryFilter
		 */
	  public static final int vamDealerIdFilter = 29; // filter index
	  private static final int vamDealerIdSize = 8; // field size

	  /**
		 * Unique field index used for Filtering.
		 * 
		 * @see com.eppixcomm.eppix.common.util.QueryFilter
		 */
	  public static final int vamAbarDateFilter = 30; // filter index

	  /**
		 * Unique field index used for Filtering.
		 * 
		 * @see com.eppixcomm.eppix.common.util.QueryFilter
		 */
	  public static final int vamSubsSuffixFilter = 31; // filter index
	  private static final int vamSubsSuffixSize = 1; // field size

	  /**
		 * Unique field index used for Filtering.
		 * 
		 * @see com.eppixcomm.eppix.common.util.QueryFilter
		 */
	  public static final int vamMessCommentFilter = 32; // filter index
	  private static final int vamMessCommentSize = 20; // field size

	  /**
		 * Unique field index used for Filtering.
		 * 
		 * @see com.eppixcomm.eppix.common.util.QueryFilter
		 */
	  public static final int vamAirtimeNetFilter = 33; // filter index
	  private static final int vamAirtimeNetSize = 1; // field size

	  /**
		 * Unique field index used for Filtering.
		 * 
		 * @see com.eppixcomm.eppix.common.util.QueryFilter
		 */
	  public static final int vamPrFlagFilter = 34; // filter index
	  private static final int vamPrFlagSize = 1; // field size

	  /**
		 * Unique field index used for Filtering.
		 * 
		 * @see com.eppixcomm.eppix.common.util.QueryFilter
		 */
	  public static final int vamHierarchyFilter = 35; // filter index
	  private static final int vamHierarchySize = 1; // field size

	  /**
		 * Unique field index used for Filtering.
		 * 
		 * @see com.eppixcomm.eppix.common.util.QueryFilter
		 */
	  public static final int vamMsisdnKnownFilter = 36; // filter index
	  private static final int vamMsisdnKnownSize = 1; // field size

	  /**
		 * Unique field index used for Filtering.
		 * 
		 * @see com.eppixcomm.eppix.common.util.QueryFilter
		 */
	  public static final int vamTariffChgFilter = 37; // filter index
	  
	  
	  public static final int vamOrigProvIdFilter = 38;
	  public static final int vamOrigProvIdSize = 5;
	  
	  public static final int vamImpProvIdFilter = 39;
	  public static final int vamImpProvIdSize = 5;
	  
	  public static final int vamOrigServProvFilter = 40;
	  public static final int vamOrigServProvSize = 5;
	  
	  public static final int vamImpServProvFilter = 41;
	  public static final int vamImpServProvSize = 5;
	  
	  public static final int vamMsisdnTypeFilter = 42;
	  public static final int vamMsisdnTypeSize = 50;
	  
	  public static final int vamDummyFilter = 43;
	  public static final int vamDummySize = 1;
	  
	  public static final int vamMsisdnExprtdFilter = 44;
	  
	  public static final int vamExportedToFilter = 45;
	  public static final int vamExportedToSize = 5;
	  
	  public static final int vamAnalysis1Filter = 46;
	  public static final int vamAnalysis1Size = 30;
	  
	  public static final int vamAnalysis2Filter = 47;
	  public static final int vamAnalysis2Size = 30;
	  
	  public static final int vamAnalysis3Filter = 48;
	  public static final int vamAnalysis3Size = 30;
	  
	  public static final int vamAnalysis4Filter = 49;
	  public static final int vamAnalysis4Size = 30;
	  
	  public static final int vamAnalysis5Filter = 50;
	  public static final int vamAnalysis5Size = 30;
	  
	  
	  public static final int ntpSerialIdFilter = 51; // filter index
	  
	  public static final int ntpCommandFilter = 52; // filter index
	  private static final int ntpCommandSize = 16; // field size
	  
	  public static final int ntpSendSeqFilter = 53; // filter index
	  
	  public static final int ntpTranTypeFilter = 54; // filter index
	  private static final int ntpTranTypeSize = 2; // field size
	  
	  public static final int ntpSubscriberIdFilter = 55; // filter index
	  
	  public static final int ntpOldValueFilter = 56; // filter index
	  private static final int ntpOldValueSize = 20; // field size
	  
	  public static final int ntpNewValueFilter = 57; // filter index
	  private static final int ntpNewValueSize = 20; // field size
	  
	  public static final int ntpServiceCodeFilter = 58; // filter index
	  private static final int ntpServiceCodeSize = 4; // field size
	  
	  public static final int ntpStatusFilter = 59; // filter index
	  private static final int ntpStatusSize = 1; // field size
	  
	  public static final int ntpTimestampFilter = 60; // filter index
	
	  public AneApmVamNtpDQO() {
	  }
	
	  /**
		 * Creates a new AuxCustomersDMO object. Constructor with all fields as
		 * paramaters
		 */
	  public AneApmVamNtpDQO(
		final String aneApnId,
		final String   aneMsisdn,
		final Date  aneActDate,
		final Date aneDeactDate,
		final String apmType, 
		final String apmId,
		final String apmName,
		final String apmBillMethod,
		final String apmMsisdn,
		final String apmAssigned,
		final Date apmActDate,
		final Date apmDeactDate,
		final String apmActive,
		final String apmWdp,
		final Integer vamSubscriberId,
		final String  vamSimNo,
		final String  vamMsisdnNo,
		final Short   vamTwinbillNo,
		final String  vamStatCode,
		final Date    vamConnectDate,
		final Date    vamDconnectDate,
		final String  vamInternTariff,
		final Date    vamContrTerminat,
		final Short   vamContrPeriod,
		final Date    vamTerminatNotif,
		final String  vamDirEntry,
		final String  vamItemised,
		final String  vamDepartment,
		final String  vamSalesman,
		final String  vamDealerId,
		final Date    vamAbarDate,
		final String  vamSubsSuffix,
		final String  vamMessComment,
		final String  vamAirtimeNet,
		final String  vamPrFlag,
		final String  vamHierarchy,
		final String  vamMsisdnKnown,
		final Date    vamTariffChg,
		
		  final String vamOrigProvId,
		  final String vamImpProvId,
		  final String vamOrigServProv,
		  final String vamImpServProv,
		  final String vamMsisdnType,
		  final String vamDummy,
		  final Date vamMsisdnExprtd,
		  final String vamExportedTo,
		  final String vamAnalysis1,
		  final String vamAnalysis2,
		  final String vamAnalysis3,
		  final String vamAnalysis4,
		  final String vamAnalysis5,		
		
		final Integer ntpSerialId,
		final String ntpCommand,
		final Integer ntpSendSeq,
		final String ntpTranType,
		final Integer ntpSubscriberId,
		final String ntpOldValue,
		final String ntpNewValue,
		final String ntpServiceCode,
		final String ntpStatus,
		final DateTime ntpTimestamp) {
		  

		  	this.aneApnId = aneApnId;
		  	this.aneMsisdn = aneMsisdn;
		  	this.aneActDate = (aneActDate != null)? new Date(aneActDate): null;
		  	this.aneDeactDate = (aneDeactDate != null)? new Date(aneDeactDate): null;
			this.apmType = apmType; 
			this.apmId = apmId;
			this.apmName = apmName; 
			this.apmBillMethod = apmBillMethod;
			this.apmMsisdn = apmMsisdn; 
			this.apmAssigned = apmAssigned;
			this.apmActDate = apmActDate;
			this.apmDeactDate = apmDeactDate;	
			this.apmActive = apmActive; 
			this.apmWdp = apmWdp;
		    this.vamSubscriberId = vamSubscriberId;
		    this.vamSimNo = vamSimNo;
		    this.vamMsisdnNo = vamMsisdnNo;
		    this.vamTwinbillNo = vamTwinbillNo;
		    this.vamStatCode = vamStatCode;
		    this.vamConnectDate = ( vamConnectDate != null )
		      ? new Date( vamConnectDate ) : null;
		    this.vamDconnectDate = ( vamDconnectDate != null )
		      ? new Date( vamDconnectDate ) : null;
		    this.vamInternTariff = vamInternTariff;
		    this.vamContrTerminat = ( vamContrTerminat != null )
		      ? new Date( vamContrTerminat ) : null;
		    this.vamContrPeriod = vamContrPeriod;
		    this.vamTerminatNotif = ( vamTerminatNotif != null )
		      ? new Date( vamTerminatNotif ) : null;
		    this.vamDirEntry = vamDirEntry;
		    this.vamItemised = vamItemised;
		    this.vamDepartment = vamDepartment;
		    this.vamSalesman = vamSalesman;
		    this.vamDealerId = vamDealerId;
		    this.vamAbarDate = ( vamAbarDate != null ) ? new Date( vamAbarDate ) : null;
		    this.vamSubsSuffix = vamSubsSuffix;
		    this.vamMessComment = vamMessComment;
		    this.vamAirtimeNet = vamAirtimeNet;
		    this.vamPrFlag = vamPrFlag;
		    this.vamHierarchy = vamHierarchy;
		    this.vamMsisdnKnown = vamMsisdnKnown;
		    this.vamTariffChg = ( vamTariffChg != null ) ? new Date( vamTariffChg )
                                          : null;
		    
			 this.vamOrigProvId = vamOrigProvId;
			 this.vamImpProvId = vamImpProvId;
			 this.vamOrigServProv = vamOrigServProv;
			 this.vamImpServProv = vamImpServProv;
			 this.vamMsisdnType = vamMsisdnType;
			 this.vamDummy =  vamDummy;
			 this.vamMsisdnExprtd = vamMsisdnExprtd;
			 this.vamExportedTo = vamExportedTo;
			 this.vamAnalysis1 = vamAnalysis1;
			 this.vamAnalysis2 = vamAnalysis2;
			 this.vamAnalysis3 = vamAnalysis3;
			 this.vamAnalysis4 = vamAnalysis4;
			 this.vamAnalysis5 = vamAnalysis5;
			 
			this.ntpSerialId = ntpSerialId;
			this.ntpCommand = ntpCommand;
			this.ntpSendSeq = ntpSendSeq;
			this.ntpTranType = ntpTranType;
			this.ntpSubscriberId = ntpSubscriberId;
			this.ntpOldValue = ntpOldValue;
			this.ntpNewValue = ntpNewValue;
			this.ntpServiceCode = ntpServiceCode;
			this.ntpStatus = ntpStatus;
			this.ntpTimestamp = (ntpTimestamp != null)? new DateTime(ntpTimestamp): null;
	  }

	protected void generatedKey(Integer key) {
		// TODO Auto-generated method stub
		
	}

	protected Object[] get() {
		return new Object[]{
				(aneApnId == null)?null : (aneApnId.length() <= aneApnIdSize)? aneApnId: 
			    	  aneApnId.substring(0, aneApnIdSize), 
			      (aneMsisdn == null)?null : (aneMsisdn.length() <= aneMsisdnSize)? aneMsisdn: 
			    	  aneMsisdn.substring(0, aneMsisdnSize), 
			      
			      (aneActDate == null ) ? null : new Date(aneActDate),
			      (aneDeactDate == null ) ? null : new Date(aneDeactDate),
			    		
	    		  (apmType == null)? null:(apmType.length() <= apmTypeSize)? apmType:apmType.substring(0, apmTypeSize),
					(apmId == null)? null:(apmId.length() <= apmIdSize)? apmId:apmId.substring(0, apmIdSize),
					(apmName == null)? null:(apmName.length() <= apmNameSize)? apmName:apmName.substring(0, apmNameSize),
					(apmBillMethod == null)? null:(apmBillMethod.length() <= apmBillMethodSize)? apmBillMethod:apmType.substring(0, apmBillMethodSize),
					(apmMsisdn == null)? null:(apmMsisdn.length() <= apmMsisdnSize)? apmMsisdn:apmMsisdn.substring(0, apmMsisdnSize),
					(apmAssigned == null)? null:(apmAssigned.length() <= apmAssignedSize)? apmAssigned:apmAssigned.substring(0, apmAssignedSize),
					(apmActDate == null)? null: new Date(apmActDate),
					(apmDeactDate == null)? null : new Date(apmDeactDate),
					apmActive,
					(apmActive == null)? null:(apmActive.length() <= apmActiveSize)? apmActive:apmActive.substring(0, apmActiveSize),
					(apmWdp == null)? null:(apmWdp.length() <= apmWdpSize)? apmWdp:apmWdp.substring(0, apmWdpSize),
		    		  vamSubscriberId,
		    	      ( vamSimNo == null ) ? null
		    	                           : ( ( vamSimNo.length(  ) <= vamSimNoSize )
		    	      ? vamSimNo
		    	      : vamSimNo.substring( 0, vamSimNoSize ) // auto trimmed
																// to fit, if
																// required.
		    	       ),
		    	      ( vamMsisdnNo == null ) ? null
		    	                              : ( ( vamMsisdnNo.length(  ) <= vamMsisdnNoSize )
		    	      ? vamMsisdnNo
		    	      : vamMsisdnNo.substring( 0, vamMsisdnNoSize ) // auto
																	// trimmed
																	// to fit,
																	// if
																	// required.
		    	       ), vamTwinbillNo,
		    	      ( vamStatCode == null ) ? null
		    	                              : ( ( vamStatCode.length(  ) <= vamStatCodeSize )
		    	      ? vamStatCode
		    	      : vamStatCode.substring( 0, vamStatCodeSize ) // auto
																	// trimmed
																	// to fit,
																	// if
																	// required.
		    	       ), vamConnectDate, vamDconnectDate,
		    	      ( vamInternTariff == null ) ? null
		    	                                  : ( ( vamInternTariff.length(  ) <= vamInternTariffSize )
		    	      ? vamInternTariff
		    	      : vamInternTariff.substring( 0, vamInternTariffSize ) // auto
																			// trimmed
																			// to
																			// fit,
																			// if
																			// required.
		    	       ), vamContrTerminat, vamContrPeriod, vamTerminatNotif,
		    	      ( vamDirEntry == null ) ? null
		    	                              : ( ( vamDirEntry.length(  ) <= vamDirEntrySize )
		    	      ? vamDirEntry
		    	      : vamDirEntry.substring( 0, vamDirEntrySize ) // auto
																	// trimmed
																	// to fit,
																	// if
																	// required.
		    	       ),
		    	      ( vamItemised == null ) ? null
		    	                              : ( ( vamItemised.length(  ) <= vamItemisedSize )
		    	      ? vamItemised
		    	      : vamItemised.substring( 0, vamItemisedSize ) // auto
																	// trimmed
																	// to fit,
																	// if
																	// required.
		    	       ),
		    	      ( vamDepartment == null ) ? null
		    	                                : ( ( vamDepartment.length(  ) <= vamDepartmentSize )
		    	      ? vamDepartment
		    	      : vamDepartment.substring( 0, vamDepartmentSize ) // auto
																		// trimmed
																		// to
																		// fit,
																		// if
																		// required.
		    	       ),
		    	      ( vamSalesman == null ) ? null
		    	                              : ( ( vamSalesman.length(  ) <= vamSalesmanSize )
		    	      ? vamSalesman
		    	      : vamSalesman.substring( 0, vamSalesmanSize ) // auto
																	// trimmed
																	// to fit,
																	// if
																	// required.
		    	       ),
		    	      ( vamDealerId == null ) ? null
		    	                              : ( ( vamDealerId.length(  ) <= vamDealerIdSize )
		    	      ? vamDealerId
		    	      : vamDealerId.substring( 0, vamDealerIdSize ) // auto
																	// trimmed
																	// to fit,
																	// if
																	// required.
		    	       ), vamAbarDate,
		    	      ( vamSubsSuffix == null ) ? null
		    	                                : ( ( vamSubsSuffix.length(  ) <= vamSubsSuffixSize )
		    	      ? vamSubsSuffix
		    	      : vamSubsSuffix.substring( 0, vamSubsSuffixSize ) // auto
																		// trimmed
																		// to
																		// fit,
																		// if
																		// required.
		    	       ),
		    	      ( vamMessComment == null ) ? null
		    	                                 : ( ( vamMessComment.length(  ) <= vamMessCommentSize )
		    	      ? vamMessComment
		    	      : vamMessComment.substring( 0, vamMessCommentSize ) // auto
																			// trimmed
																			// to
																			// fit,
																			// if
																			// required.
		    	       ),
		    	      ( vamAirtimeNet == null ) ? null
		    	                                : ( ( vamAirtimeNet.length(  ) <= vamAirtimeNetSize )
		    	      ? vamAirtimeNet
		    	      : vamAirtimeNet.substring( 0, vamAirtimeNetSize ) // auto
																		// trimmed
																		// to
																		// fit,
																		// if
																		// required.
		    	       ),
		    	      ( vamPrFlag == null ) ? null
		    	                            : ( ( vamPrFlag.length(  ) <= vamPrFlagSize )
		    	      ? vamPrFlag
		    	      : vamPrFlag.substring( 0, vamPrFlagSize ) // auto trimmed
																// to fit, if
																// required.
		    	       ),
		    	      ( vamHierarchy == null ) ? null
		    	                               : ( ( vamHierarchy.length(  ) <= vamHierarchySize )
		    	      ? vamHierarchy
		    	      : vamHierarchy.substring( 0, vamHierarchySize ) // auto
																		// trimmed
																		// to
																		// fit,
																		// if
																		// required.
		    	       ),
		    	      ( vamMsisdnKnown == null ) ? null
		    	                                 : ( ( vamMsisdnKnown.length(  ) <= vamMsisdnKnownSize )
		    	      ? vamMsisdnKnown
		    	      : vamMsisdnKnown.substring( 0, vamMsisdnKnownSize )
		    	       ), vamTariffChg,
		    	       
		    	       (vamOrigProvId == null ) ? null
		    	               : ( ( vamOrigProvId.length(  ) <= vamOrigProvIdSize )
		    	             	      ? vamOrigProvId
		    	             	      : vamOrigProvId.substring( 0, vamOrigProvIdSize )),
		    	       (vamImpProvId == null ) ? null
		    	               : ( ( vamImpProvId.length(  ) <= vamImpProvIdSize )
		    	             	      ? vamImpProvId
		    	             	      : vamImpProvId.substring( 0, vamImpProvIdSize )),
		    	       (vamOrigServProv == null ) ? null
		    	               : ( ( vamOrigServProv.length(  ) <= vamOrigServProvSize )
		    	             	      ? vamOrigServProv
		    	             	      : vamOrigServProv.substring( 0, vamOrigServProvSize )),
		    	       (vamImpServProv == null ) ? null
		    	               : ( ( vamImpServProv.length(  ) <= vamImpServProvSize )
		    	             	      ? vamImpServProv
		    	             	      : vamImpServProv.substring( 0, vamImpServProvSize )),
		    	       (vamMsisdnType == null ) ? null
		    	               : ( ( vamMsisdnType.length(  ) <= vamMsisdnTypeSize )
		    	             	      ? vamMsisdnType
		    	             	      : vamMsisdnType.substring( 0, vamMsisdnTypeSize )),
		    	       (vamDummy == null ) ? null
		    	               : ( ( vamDummy.length(  ) <= vamDummySize )
		    	             	      ? vamDummy
		    	             	      : vamDummy.substring( 0, vamDummySize )),
		    	       vamMsisdnExprtd,
		    	       (vamExportedTo == null ) ? null
		    	               : ( ( vamExportedTo.length(  ) <= vamExportedToSize )
		    	             	      ? vamExportedTo
		    	             	      : vamExportedTo.substring( 0, vamExportedToSize )),
		    	       (vamAnalysis1 == null ) ? null
		    	               : ( ( vamAnalysis1.length(  ) <= vamAnalysis1Size )
		    	             	      ? vamAnalysis1
		    	             	      : vamAnalysis1.substring( 0, vamAnalysis1Size )),
		    	       (vamAnalysis2 == null ) ? null
		    	               : ( ( vamAnalysis2.length(  ) <= vamAnalysis2Size )
		    	             	      ? vamAnalysis2
		    	             	      : vamAnalysis2.substring( 0, vamAnalysis2Size )),
		    	       (vamAnalysis3 == null ) ? null
		    	               : ( ( vamAnalysis3.length(  ) <= vamAnalysis3Size )
		    	             	      ? vamAnalysis3
		    	             	      : vamAnalysis3.substring( 0, vamAnalysis3Size )),
		    	       (vamAnalysis4 == null ) ? null
		    	               : ( ( vamAnalysis4.length(  ) <= vamAnalysis4Size )
		    	             	      ? vamAnalysis4
		    	             	      : vamAnalysis4.substring( 0, vamAnalysis4Size )),
		    	       (vamAnalysis5 == null ) ? null
		    	               : ( ( vamAnalysis5.length(  ) <= vamAnalysis5Size )
		    	             	      ? vamAnalysis5
		    	             	      : vamAnalysis5.substring( 0, vamAnalysis5Size )),
		    	       
		    	       ntpSerialId,
						(ntpCommand == null) ? null : ((ntpCommand.length() <= ntpCommandSize)
						? ntpCommand : ntpCommand.substring( 0, ntpCommandSize) 
				        ),ntpSendSeq,				        
				        (ntpTranType == null)? null :((ntpTranType.length()  <= ntpTranTypeSize) ? ntpTranType :
				        		ntpTranType.substring(0, ntpTranTypeSize))
				        		
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
		return null;
	}
	
	public void deConstruct(){
		
		
		ane = new AneApnNonEppixDMO(aneApnId,aneMsisdn,aneActDate,aneDeactDate);
		
		apm = new ApmApnPopMainDMO(apmType, apmId,apmName,
				  apmBillMethod,apmMsisdn,apmAssigned,
				  apmActDate,apmDeactDate,apmActive,apmWdp);
		
		vam = new VamActiveMsisdnDMO(vamSubscriberId,vamSimNo,vamMsisdnNo,vamTwinbillNo,vamStatCode,
				vamConnectDate,vamDconnectDate,vamInternTariff,vamContrTerminat,
				vamContrPeriod,vamTerminatNotif,vamDirEntry,vamItemised,vamDepartment,
				vamSalesman,vamDealerId,vamAbarDate,vamSubsSuffix,vamMessComment,
				vamAirtimeNet,vamPrFlag,vamHierarchy,vamMsisdnKnown,vamTariffChg, 
				vamOrigProvId,vamImpProvId,vamOrigServProv,vamImpServProv,vamMsisdnType,
				vamDummy,vamMsisdnExprtd,vamExportedTo,vamAnalysis1,vamAnalysis2,
				vamAnalysis3,vamAnalysis4,vamAnalysis5);
		

		
		ntp = new NtpNetTransPendDMO(ntpSerialId,ntpCommand,ntpSendSeq,ntpTranType,
				ntpSubscriberId,ntpOldValue,ntpNewValue,
				ntpServiceCode,ntpStatus,ntpTimestamp);		
	}

	protected void set(Object[] fields) {
	
		  this.aneApnId = rtrim((String)fields[0]);
		  this.aneMsisdn = rtrim((String)fields[1]);
		  this.aneActDate = (Date)fields[2];
		  this.aneDeactDate = (Date)fields[3];
		  
		  this.apmType = rtrim((String)fields[4]);
		  this.apmId = rtrim((String)fields[5]);
		  this.apmName = rtrim((String)fields[6]);
		  this.apmBillMethod = rtrim((String)fields[7]);
		  this.apmMsisdn = rtrim((String)fields[8]);
		  this.apmAssigned = rtrim((String)fields[9]);
		  this.apmActDate = (Date)fields[10];
		  this.apmDeactDate = (Date)fields[11];
		  this.apmActive = rtrim((String)fields[12]);
		  this.apmWdp = rtrim((String)fields[13]);
		  
		  this.vamSubscriberId = (Integer) fields[14];
		  this.vamSimNo = rtrim( (String) fields[15] );
		  this.vamMsisdnNo = rtrim( (String) fields[16] );
		  this.vamTwinbillNo = (Short) fields[17];
		  this.vamStatCode = rtrim( (String) fields[18] );
		  this.vamConnectDate = (Date) fields[19];
		  this.vamDconnectDate = (Date) fields[20];
		  this.vamInternTariff = rtrim( (String) fields[21] );
		  this.vamContrTerminat = (Date) fields[22];
		  this.vamContrPeriod = (Short) fields[23];
		  this.vamTerminatNotif = (Date) fields[24];
		  this.vamDirEntry = rtrim( (String) fields[25] );
		  this.vamItemised = rtrim( (String) fields[26] );
		  this.vamDepartment = rtrim( (String) fields[27] );
		  this.vamSalesman = rtrim( (String) fields[28] );
		  this.vamDealerId = rtrim( (String) fields[29] );
		  this.vamAbarDate = (Date) fields[30];
		  this.vamSubsSuffix = rtrim( (String) fields[31] );
		  this.vamMessComment = rtrim( (String) fields[32] );
		  this.vamAirtimeNet = rtrim( (String) fields[33] );
		  this.vamPrFlag = rtrim( (String) fields[34] );
		  this.vamHierarchy = rtrim( (String) fields[35] );
		  this.vamMsisdnKnown = rtrim( (String) fields[36] );
		  this.vamTariffChg = (Date) fields[37];
		  
		 this.vamOrigProvId = rtrim( (String) fields[38] );
		 this.vamImpProvId = rtrim( (String) fields[39] );
		 this.vamOrigServProv = rtrim( (String) fields[40] );
		 this.vamImpServProv = rtrim( (String) fields[41] );
		 this.vamMsisdnType = rtrim( (String) fields[42] );
		 this.vamDummy = rtrim( (String) fields[43] );
		 this.vamMsisdnExprtd = (Date) fields[44];
		 this.vamExportedTo = rtrim( (String) fields[45] );
		 this.vamAnalysis1 = rtrim( (String) fields[46] );
		 this.vamAnalysis2 = rtrim( (String) fields[47] );
		 this.vamAnalysis3 = rtrim( (String) fields[48] );
		 this.vamAnalysis4 = rtrim( (String) fields[49] );
		 this.vamAnalysis5 = rtrim( (String) fields[50] );
		  
		  this.ntpSerialId = (Integer)fields[51];
		  this.ntpCommand = rtrim((String)fields[52]);
		  this.ntpSendSeq = (Integer)fields[53];
		  this.ntpTranType = rtrim((String)fields[54]);
		  this.ntpSubscriberId = (Integer)fields[55];
		  this.ntpOldValue = rtrim((String)fields[56]);
		  this.ntpNewValue = rtrim((String)fields[57]);
		  this.ntpServiceCode = rtrim((String)fields[58]);
		  this.ntpStatus = rtrim((String)fields[59]);
		  this.ntpTimestamp = (DateTime)fields[60];
	}
	
	  public void set( 
			  final String aneApnId,
			  final String   aneMsisdn,
			  final Date  aneActDate,
			  final Date aneDeactDate,
			  final String apmType, 
			  final String apmId,
			  final String apmName,
			  final String apmBillMethod,
			  final String apmMsisdn,
			  final String apmAssigned,
			  final Date apmActDate,
			  final Date apmDeactDate,
			  final String apmActive,
			  final String apmWdp,
			  final Integer vamSubscriberId,
			  final String  vamSimNo,
			  final String  vamMsisdnNo,
			  final Short   vamTwinbillNo,
			  final String  vamStatCode,
			  final Date    vamConnectDate,
			  final Date    vamDconnectDate,
			  final String  vamInternTariff,
			  final Date    vamContrTerminat,
			  final Short   vamContrPeriod,
			  final Date    vamTerminatNotif,
			  final String  vamDirEntry,
			  final String  vamItemised,
			  final String  vamDepartment,
			  final String  vamSalesman,
			  final String  vamDealerId,
			  final Date    vamAbarDate,
			  final String  vamSubsSuffix,
			  final String  vamMessComment,
			  final String  vamAirtimeNet,
			  final String  vamPrFlag,
			  final String  vamHierarchy,
			  final String  vamMsisdnKnown,
			  final Date    vamTariffChg,
			  
			  final String vamOrigProvId,
			  final String vamImpProvId,
			  final String vamOrigServProv,
			  final String vamImpServProv,
			  final String vamMsisdnType,
			  final String vamDummy,
			  final Date vamMsisdnExprtd,
			  final String vamExportedTo,
			  final String vamAnalysis1,
			  final String vamAnalysis2,
			  final String vamAnalysis3,
			  final String vamAnalysis4,
			  final String vamAnalysis5,
			  
			  final Integer ntpSerialId,
			  final String ntpCommand,
			  final Integer ntpSendSeq,
			  final String ntpTranType,
			  final Integer ntpSubscriberId,
			  final String ntpOldValue,
			  final String ntpNewValue,
			  final String ntpServiceCode,
			  final String ntpStatus,
			  final DateTime ntpTimestamp) {
		  

				  this.aneApnId = aneApnId;
				  this.aneMsisdn = aneMsisdn;
				  this.aneActDate = aneActDate;
				  this.aneDeactDate = aneDeactDate;				  
				  this.apmType = apmType; 
				  this.apmId = apmId;
				  this.apmName = apmName; 
				  this.apmBillMethod = apmBillMethod;
				  this.apmMsisdn = apmMsisdn; 
				  this.apmAssigned = apmAssigned;
				  this.apmActDate = apmActDate;
				  this.apmDeactDate = apmDeactDate;	
				  this.apmActive = apmActive; 
	    		  this.apmWdp = apmWdp;				  
				  this.vamSubscriberId = vamSubscriberId;
				  this.vamSimNo = vamSimNo;
				  this.vamMsisdnNo = vamMsisdnNo;
				  this.vamTwinbillNo = vamTwinbillNo;
				  this.vamStatCode = vamStatCode;
				  this.vamConnectDate = ( vamConnectDate != null )
				      ? new Date( vamConnectDate ) : null;
				  this.vamDconnectDate = ( vamDconnectDate != null )
				     ? new Date( vamDconnectDate ) : null;
				  this.vamInternTariff = vamInternTariff;
				  this.vamContrTerminat = ( vamContrTerminat != null )
				      ? new Date( vamContrTerminat ) : null;
				  this.vamContrPeriod = vamContrPeriod;
				  this.vamTerminatNotif = ( vamTerminatNotif != null )
				      ? new Date( vamTerminatNotif ) : null;
				  this.vamDirEntry = vamDirEntry;
				  this.vamItemised = vamItemised;
				  this.vamDepartment = vamDepartment;
				  this.vamSalesman = vamSalesman;
				  this.vamDealerId = vamDealerId;
				  this.vamAbarDate = ( vamAbarDate != null ) ? new Date( vamAbarDate ) : null;
				  this.vamSubsSuffix = vamSubsSuffix;
				  this.vamMessComment = vamMessComment;
				  this.vamAirtimeNet = vamAirtimeNet;
				  this.vamPrFlag = vamPrFlag;
				  this.vamHierarchy = vamHierarchy;
				  this.vamMsisdnKnown = vamMsisdnKnown;
				  this.vamTariffChg = ( vamTariffChg != null ) ? new Date( vamTariffChg )
				                                                 : null;				  
				  
				                                                
    			 this.vamOrigProvId = vamOrigProvId;
    			 this.vamImpProvId = vamImpProvId;
    			 this.vamOrigServProv = vamOrigServProv;
    			 this.vamImpServProv = vamImpServProv;
    			 this.vamMsisdnType = vamMsisdnType;
    			 this.vamDummy =  vamDummy;
    			 this.vamMsisdnExprtd = ( vamMsisdnExprtd != null ) ? new Date( vamMsisdnExprtd )
                 												: null;
    			 this.vamExportedTo = vamExportedTo;
    			 this.vamAnalysis1 = vamAnalysis1;
    			 this.vamAnalysis2 = vamAnalysis2;
    			 this.vamAnalysis3 = vamAnalysis3;
    			 this.vamAnalysis4 = vamAnalysis4;
    			 this.vamAnalysis5 = vamAnalysis5;
    			 
    			 this.ntpSerialId = ntpSerialId;
				  this.ntpCommand = ntpCommand;
				  this.ntpSendSeq = ntpSendSeq;
				  this.ntpTranType = ntpTranType;
				  this.ntpSubscriberId = ntpSubscriberId;
				  this.ntpOldValue = ntpOldValue;
				  this.ntpNewValue = ntpNewValue;
				  this.ntpServiceCode = ntpServiceCode;
				  this.ntpStatus = ntpStatus;
				  this.ntpTimestamp = (ntpTimestamp != null)? new DateTime(ntpTimestamp): null;				  
			  }

	public Date getAneActDate() {
		return aneActDate;
	}

	public void setAneActDate(Date aneActDate) {
		this.aneActDate = aneActDate;
	}

	public String getAneApnId() {
		return aneApnId;
	}

	public void setAneApnId(String aneApnId) {
		this.aneApnId = aneApnId;
	}

	public Date getAneDeactDate() {
		return aneDeactDate;
	}

	public void setAneDeactDate(Date aneDeactDate) {
		this.aneDeactDate = aneDeactDate;
	}

	public String getAneMsisdn() {
		return aneMsisdn;
	}

	public void setAneMsisdn(String aneMsisdn) {
		this.aneMsisdn = aneMsisdn;
	}

	public String getNtpCommand() {
		return ntpCommand;
	}

	public void setNtpCommand(String ntpCommand) {
		this.ntpCommand = ntpCommand;
	}

	public String getNtpNewValue() {
		return ntpNewValue;
	}

	public void setNtpNewValue(String ntpNewValue) {
		this.ntpNewValue = ntpNewValue;
	}

	public String getNtpOldValue() {
		return ntpOldValue;
	}

	public void setNtpOldValue(String ntpOldValue) {
		this.ntpOldValue = ntpOldValue;
	}

	public Integer getNtpSendSeq() {
		return ntpSendSeq;
	}

	public void setNtpSendSeq(Integer ntpSendSeq) {
		this.ntpSendSeq = ntpSendSeq;
	}

	public Integer getNtpSerialId() {
		return ntpSerialId;
	}

	public void setNtpSerialId(Integer ntpSerialId) {
		this.ntpSerialId = ntpSerialId;
	}

	public String getNtpServiceCode() {
		return ntpServiceCode;
	}

	public void setNtpServiceCode(String ntpServiceCode) {
		this.ntpServiceCode = ntpServiceCode;
	}

	public String getNtpStatus() {
		return ntpStatus;
	}

	public void setNtpStatus(String ntpStatus) {
		this.ntpStatus = ntpStatus;
	}

	public Integer getNtpSubscriberId() {
		return ntpSubscriberId;
	}

	public void setNtpSubscriberId(Integer ntpSubscriberId) {
		this.ntpSubscriberId = ntpSubscriberId;
	}

	public DateTime getNtpTimestamp() {
		return ntpTimestamp;
	}

	public void setNtpTimestamp(DateTime ntpTimestamp) {
		this.ntpTimestamp = ntpTimestamp;
	}

	public String getNtpTranType() {
		return ntpTranType;
	}

	public void setNtpTranType(String ntpTranType) {
		this.ntpTranType = ntpTranType;
	}

	public Date getVamAbarDate() {
		return vamAbarDate;
	}

	public void setVamAbarDate(Date vamAbarDate) {
		this.vamAbarDate = vamAbarDate;
	}

	public String getVamAirtimeNet() {
		return vamAirtimeNet;
	}

	public void setVamAirtimeNet(String vamAirtimeNet) {
		this.vamAirtimeNet = vamAirtimeNet;
	}

	public Date getVamConnectDate() {
		return vamConnectDate;
	}

	public void setVamConnectDate(Date vamConnectDate) {
		this.vamConnectDate = vamConnectDate;
	}

	public Short getVamContrPeriod() {
		return vamContrPeriod;
	}

	public void setVamContrPeriod(Short vamContrPeriod) {
		this.vamContrPeriod = vamContrPeriod;
	}

	public Date getVamContrTerminat() {
		return vamContrTerminat;
	}

	public void setVamContrTerminat(Date vamContrTerminat) {
		this.vamContrTerminat = vamContrTerminat;
	}

	public Date getVamDconnectDate() {
		return vamDconnectDate;
	}

	public void setVamDconnectDate(Date vamDconnectDate) {
		this.vamDconnectDate = vamDconnectDate;
	}

	public String getVamDealerId() {
		return vamDealerId;
	}

	public void setVamDealerId(String vamDealerId) {
		this.vamDealerId = vamDealerId;
	}

	public String getVamDepartment() {
		return vamDepartment;
	}

	public void setVamDepartment(String vamDepartment) {
		this.vamDepartment = vamDepartment;
	}

	public String getVamDirEntry() {
		return vamDirEntry;
	}

	public void setVamDirEntry(String vamDirEntry) {
		this.vamDirEntry = vamDirEntry;
	}

	public String getVamHierarchy() {
		return vamHierarchy;
	}

	public void setVamHierarchy(String vamHierarchy) {
		this.vamHierarchy = vamHierarchy;
	}

	public String getVamInternTariff() {
		return vamInternTariff;
	}

	public void setVamInternTariff(String vamInternTariff) {
		this.vamInternTariff = vamInternTariff;
	}

	public String getVamItemised() {
		return vamItemised;
	}

	public void setVamItemised(String vamItemised) {
		this.vamItemised = vamItemised;
	}

	public String getVamMessComment() {
		return vamMessComment;
	}

	public void setVamMessComment(String vamMessComment) {
		this.vamMessComment = vamMessComment;
	}

	public String getVamMsisdnKnown() {
		return vamMsisdnKnown;
	}

	public void setVamMsisdnKnown(String vamMsisdnKnown) {
		this.vamMsisdnKnown = vamMsisdnKnown;
	}

	public String getVamMsisdnNo() {
		return vamMsisdnNo;
	}

	public void setVamMsisdnNo(String vamMsisdnNo) {
		this.vamMsisdnNo = vamMsisdnNo;
	}

	public String getVamPrFlag() {
		return vamPrFlag;
	}

	public void setVamPrFlag(String vamPrFlag) {
		this.vamPrFlag = vamPrFlag;
	}

	public String getVamSalesman() {
		return vamSalesman;
	}

	public void setVamSalesman(String vamSalesman) {
		this.vamSalesman = vamSalesman;
	}

	public String getVamSimNo() {
		return vamSimNo;
	}

	public void setVamSimNo(String vamSimNo) {
		this.vamSimNo = vamSimNo;
	}

	public String getVamStatCode() {
		return vamStatCode;
	}

	public void setVamStatCode(String vamStatCode) {
		this.vamStatCode = vamStatCode;
	}

	public Integer getVamSubscriberId() {
		return vamSubscriberId;
	}

	public void setVamSubscriberId(Integer vamSubscriberId) {
		this.vamSubscriberId = vamSubscriberId;
	}

	public String getVamSubsSuffix() {
		return vamSubsSuffix;
	}

	public void setVamSubsSuffix(String vamSubsSuffix) {
		this.vamSubsSuffix = vamSubsSuffix;
	}

	public Date getVamTariffChg() {
		return vamTariffChg;
	}

	public void setVamTariffChg(Date vamTariffChg) {
		this.vamTariffChg = vamTariffChg;
	}

	public Date getVamTerminatNotif() {
		return vamTerminatNotif;
	}

	public void setVamTerminatNotif(Date vamTerminatNotif) {
		this.vamTerminatNotif = vamTerminatNotif;
	}

	public Short getVamTwinbillNo() {
		return vamTwinbillNo;
	}

	public void setVamTwinbillNo(Short vamTwinbillNo) {
		this.vamTwinbillNo = vamTwinbillNo;
	}

	public ApmApnPopMainDMO getApm() {
		return apm;
	}

	public void setApm(ApmApnPopMainDMO apm) {
		this.apm = apm;
	}

	public Date getApmActDate() {
		return apmActDate;
	}

	public void setApmActDate(Date apmActDate) {
		this.apmActDate = apmActDate;
	}

	public String getApmActive() {
		return apmActive;
	}

	public void setApmActive(String apmActive) {
		this.apmActive = apmActive;
	}

	public String getApmAssigned() {
		return apmAssigned;
	}

	public void setApmAssigned(String apmAssigned) {
		this.apmAssigned = apmAssigned;
	}

	public String getApmBillMethod() {
		return apmBillMethod;
	}

	public void setApmBillMethod(String apmBillMethod) {
		this.apmBillMethod = apmBillMethod;
	}

	public Date getApmDeactDate() {
		return apmDeactDate;
	}

	public void setApmDeactDate(Date apmDeactDate) {
		this.apmDeactDate = apmDeactDate;
	}

	public String getApmId() {
		return apmId;
	}

	public void setApmId(String apmId) {
		this.apmId = apmId;
	}

	public String getApmMsisdn() {
		return apmMsisdn;
	}

	public void setApmMsisdn(String apmMsisdn) {
		this.apmMsisdn = apmMsisdn;
	}

	public String getApmName() {
		return apmName;
	}

	public void setApmName(String apmName) {
		this.apmName = apmName;
	}

	public String getApmType() {
		return apmType;
	}

	public void setApmType(String apmType) {
		this.apmType = apmType;
	}

	public String getApmWdp() {
		return apmWdp;
	}

	public void setApmWdp(String apmWdp) {
		this.apmWdp = apmWdp;
	}	

	  public String getVamOrigProvId() {
			return vamOrigProvId;
		}

		public void setVamOrigProvId(String vamOrigProvId) {
			this.vamOrigProvId = vamOrigProvId;
		}

		public String getVamImpProvId() {
			return vamImpProvId;
		}

		public void setVamImpProvId(String vamImpProvId) {
			this.vamImpProvId = vamImpProvId;
		}

		public String getVamOrigServProv() {
			return vamOrigServProv;
		}

		public void setVamOrigServProv(String vamOrigServProv) {
			this.vamOrigServProv = vamOrigServProv;
		}

		public String getVamImpServProv() {
			return vamImpServProv;
		}

		public void setVamImpServProv(String vamImpServProv) {
			this.vamImpServProv = vamImpServProv;
		}

		public String getVamMsisdnType() {
			return vamMsisdnType;
		}

		public void setVamMsisdnType(String vamMsisdnType) {
			this.vamMsisdnType = vamMsisdnType;
		}

		public String getVamDummy() {
			return vamDummy;
		}

		public void setVamDummy(String vamDummy) {
			this.vamDummy = vamDummy;
		}

		public Date getVamMsisdnExprtd() {
			return vamMsisdnExprtd;
		}

		public void setVamMsisdnExprtd(Date vamMsisdnExprtd) {
			this.vamMsisdnExprtd = ( vamMsisdnExprtd != null ) ? new Date( vamMsisdnExprtd )
	        : null;
		}

		public String getVamExportedTo() {
			return vamExportedTo;
		}

		public void setVamExportedTo(String vamExportedTo) {
			this.vamExportedTo = vamExportedTo;
		}

		public String getVamAnalysis1() {
			return vamAnalysis1;
		}

		public void setVamAnalysis1(String vamAnalysis1) {
			this.vamAnalysis1 = vamAnalysis1;
		}

		public String getVamAnalysis2() {
			return vamAnalysis2;
		}

		public void setVamAnalysis2(String vamAnalysis2) {
			this.vamAnalysis2 = vamAnalysis2;
		}

		public String getVamAnalysis3() {
			return vamAnalysis3;
		}

		public void setVamAnalysis3(String vamAnalysis3) {
			this.vamAnalysis3 = vamAnalysis3;
		}

		public String getVamAnalysis4() {
			return vamAnalysis4;
		}

		public void setVamAnalysis4(String vamAnalysis4) {
			this.vamAnalysis4 = vamAnalysis4;
		}

		public String getVamAnalysis5() {
			return vamAnalysis5;
		}

		public void setVamAnalysis5(String vamAnalysis5) {
			this.vamAnalysis5 = vamAnalysis5;
		}
}
