package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.base.blo.SvrServRuleDMO;
import com.eppixcomm.eppix.base.blo.VasActiveServiceDMO;
import com.eppixcomm.eppix.base.blo.VsrServiceDMO;
import com.eppixcomm.eppix.base.blo.VstServiceTypesDMO;
import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;
import com.eppixcomm.eppix.common.util.Date;

public class VasvsrvstDQO extends DBO implements Serializable {

	private VasActiveServiceDMO vasDMO;
	private VsrServiceDMO vsrDMO;
	private VstServiceTypesDMO vstDMO;
	
	private Integer vasSubscriberId;
	private String vasServiceCode;
	private String vasInternTariff;
	private String vasServiceType;
	private Date vasActDate;
	private Date vasDeactDate;
	private String vasSubCharge1;
	private String vasSubCharge2;
	private String vasSubCharge3;
	private Short vasTwinbillNo;
	private String vasMultiCharge;
	private String vsrServiceCode;
	private String vsrServiceType;
	private String vsrServiceDesc;
	private String vsrOriginator;
	private String vsrServiceClass;
	private String vsrTempDeact;
	private String vsrProrata;
	private String vsrProviderId;
	private String vsrShortDesc;
	private String vsrSuspend;
	private String vstServiceType;
	private String vstServiceDesc;
	private String vstMultiCharge;
	private String vstServiceClass;
	private String vstAutoConnect;
	private String vstOriginator;
	private String vstTariffRelated;
	private String vstParameterised;
	private String vstParamsLevel;
	private Short vstArchiveMonths;
	private String vstFutureAct;
	private String vstNodeLevel;

	public static final int vasSubscriberIdFilter = 0;

	public static final int vasServiceCodeFilter = 1;
	private static final int vasServiceCodeSize = 4;

	public static final int vasInternTariffFilter = 2;
	private static final int vasInternTariffSize = 20;

	public static final int vasServiceTypeFilter = 3;
	private static final int vasServiceTypeSize = 5;

	public static final int vasActDateFilter = 4;

	public static final int vasDeactDateFilter = 5;

	public static final int vasSubCharge1Filter = 6;
	private static final int vasSubCharge1Size = 5;

	public static final int vasSubCharge2Filter = 7;
	private static final int vasSubCharge2Size = 5;

	public static final int vasSubCharge3Filter = 8;
	private static final int vasSubCharge3Size = 5;

	public static final int vasTwinbillNoFilter = 9;

	public static final int vasMultiChargeFilter = 10;
	private static final int vasMultiChargeSize = 1;

	public static final int vsrServiceCodeFilter = 11;
	private static final int vsrServiceCodeSize = 4;

	public static final int vsrServiceTypeFilter = 12;
	private static final int vsrServiceTypeSize = 5;

	public static final int vsrServiceDescFilter = 13;
	private static final int vsrServiceDescSize = 32;

	public static final int vsrOriginatorFilter = 14;
	private static final int vsrOriginatorSize = 1;

	public static final int vsrServiceClassFilter = 15;
	private static final int vsrServiceClassSize = 1;

	public static final int vsrTempDeactFilter = 16;
	private static final int vsrTempDeactSize = 1;

	public static final int vsrProrataFilter = 17;
	private static final int vsrProrataSize = 1;

	public static final int vsrProviderIdFilter = 18;
	private static final int vsrProviderIdSize = 5;

	public static final int vsrShortDescFilter = 19;
	private static final int vsrShortDescSize = 8;

	public static final int vsrSuspendFilter = 20;
	private static final int vsrSuspendSize = 1;

	public static final int vstServiceTypeFilter = 21;
	private static final int vstServiceTypeSize = 5;

	public static final int vstServiceDescFilter = 22;
	private static final int vstServiceDescSize = 32;

	public static final int vstMultiChargeFilter = 23;
	private static final int vstMultiChargeSize = 1;

	public static final int vstServiceClassFilter = 24;
	private static final int vstServiceClassSize = 1;

	public static final int vstAutoConnectFilter = 25;
	private static final int vstAutoConnectSize = 1;

	public static final int vstOriginatorFilter = 26;
	private static final int vstOriginatorSize = 1;

	public static final int vstTariffRelatedFilter = 27;
	private static final int vstTariffRelatedSize = 1;

	public static final int vstParameterisedFilter = 28;
	private static final int vstParameterisedSize = 1;

	public static final int vstParamsLevelFilter = 29;
	private static final int vstParamsLevelSize = 1;

	public static final int vstArchiveMonthsFilter = 30;

	public static final int vstFutureActFilter = 31;
	private static final int vstFutureActSize = 1;

	public static final int vstNodeLevelFilter = 32;
	private static final int vstNodeLevelSize = 5;

	public VasvsrvstDQO() {
	};

	public VasvsrvstDQO(final Integer vasSubscriberId, final String vasServiceCode, final String vasInternTariff,
			final String vasServiceType, final Date vasActDate, final Date vasDeactDate, final String vasSubCharge1,
			final String vasSubCharge2, final String vasSubCharge3, final Short vasTwinbillNo,
			final String vasMultiCharge, final String vsrServiceCode, final String vsrServiceType,
			final String vsrServiceDesc, final String vsrOriginator, final String vsrServiceClass,
			final String vsrTempDeact, final String vsrProrata, final String vsrProviderId, final String vsrShortDesc,
			final String vsrSuspend, final String vstServiceType, final String vstServiceDesc,
			final String vstMultiCharge, final String vstServiceClass, final String vstAutoConnect,
			final String vstOriginator, final String vstTariffRelated, final String vstParameterised,
			final String vstParamsLevel, final Short vstArchiveMonths, final String vstFutureAct,
			final String vstNodeLevel) {

		this.vasSubscriberId = vasSubscriberId;
		this.vasServiceCode = vasServiceCode;
		this.vasInternTariff = vasInternTariff;
		this.vasServiceType = vasServiceType;
		this.vasActDate = vasActDate;
		this.vasDeactDate = vasDeactDate;
		this.vasSubCharge1 = vasSubCharge1;
		this.vasSubCharge2 = vasSubCharge2;
		this.vasSubCharge3 = vasSubCharge3;
		this.vasTwinbillNo = vasTwinbillNo;
		this.vasMultiCharge = vasMultiCharge;
		this.vsrServiceCode = vsrServiceCode;
		this.vsrServiceType = vsrServiceType;
		this.vsrServiceDesc = vsrServiceDesc;
		this.vsrOriginator = vsrOriginator;
		this.vsrServiceClass = vsrServiceClass;
		this.vsrTempDeact = vsrTempDeact;
		this.vsrProrata = vsrProrata;
		this.vsrProviderId = vsrProviderId;
		this.vsrShortDesc = vsrShortDesc;
		this.vsrSuspend = vsrSuspend;
		this.vstServiceType = vstServiceType;
		this.vstServiceDesc = vstServiceDesc;
		this.vstMultiCharge = vstMultiCharge;
		this.vstServiceClass = vstServiceClass;
		this.vstAutoConnect = vstAutoConnect;
		this.vstOriginator = vstOriginator;
		this.vstTariffRelated = vstTariffRelated;
		this.vstParameterised = vstParameterised;
		this.vstParamsLevel = vstParamsLevel;
		this.vstArchiveMonths = vstArchiveMonths;
		this.vstFutureAct = vstFutureAct;
		this.vstNodeLevel = vstNodeLevel;
	};
	
	public void deConstruct(){
		
		
		vasDMO = new VasActiveServiceDMO(vasSubscriberId, vasServiceCode, vasInternTariff, vasServiceType, vasActDate, vasDeactDate, vasSubCharge1, vasSubCharge2, vasSubCharge3, vasTwinbillNo, vasMultiCharge);
		
		vsrDMO = new VsrServiceDMO(vsrServiceCode, vsrServiceType, vsrServiceDesc, vsrOriginator, vsrServiceClass, vsrTempDeact, vsrProrata, vsrProviderId, vsrShortDesc, vsrSuspend);
		
		vstDMO = new VstServiceTypesDMO(vstServiceType, vstServiceDesc, vstMultiCharge, vstServiceClass, vstAutoConnect, vstOriginator, vstTariffRelated, vstParameterised, vstParamsLevel, vstArchiveMonths, vstFutureAct, vstNodeLevel);
	}

	private static final int[] fieldSizes = new int[] { 0, vasServiceCodeSize, vasInternTariffSize, vasServiceTypeSize,
			0, 0, vasSubCharge1Size, vasSubCharge2Size, vasSubCharge3Size, 0, vasMultiChargeSize, vsrServiceCodeSize,
			vsrServiceTypeSize, vsrServiceDescSize, vsrOriginatorSize, vsrServiceClassSize, vsrTempDeactSize,
			vsrProrataSize, vsrProviderIdSize, vsrShortDescSize, vsrSuspendSize, vstServiceTypeSize, vstServiceDescSize,
			vstMultiChargeSize, vstServiceClassSize, vstAutoConnectSize, vstOriginatorSize, vstTariffRelatedSize,
			vstParameterisedSize, vstParamsLevelSize, 0, vstFutureActSize, vstNodeLevelSize };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_INTEGER, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_DATE, FIELD_TYPE_DATE, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_SHORT, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_SHORT, FIELD_TYPE_STRING, FIELD_TYPE_STRING };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] { this.vasSubscriberId,
				((this.vasServiceCode == null) ? null
						: (this.vasServiceCode.length() <= vasServiceCodeSize) ? this.vasServiceCode
								: this.vasServiceCode.substring(0, this.vasServiceCodeSize)),
				((this.vasInternTariff == null) ? null
						: (this.vasInternTariff.length() <= vasInternTariffSize) ? this.vasInternTariff
								: this.vasInternTariff.substring(0, this.vasInternTariffSize)),
				((this.vasServiceType == null) ? null
						: (this.vasServiceType.length() <= vasServiceTypeSize) ? this.vasServiceType
								: this.vasServiceType.substring(0, this.vasServiceTypeSize)),
				this.vasActDate, this.vasDeactDate,
				((this.vasSubCharge1 == null) ? null
						: (this.vasSubCharge1.length() <= vasSubCharge1Size) ? this.vasSubCharge1
								: this.vasSubCharge1.substring(0, this.vasSubCharge1Size)),
				((this.vasSubCharge2 == null) ? null
						: (this.vasSubCharge2.length() <= vasSubCharge2Size) ? this.vasSubCharge2
								: this.vasSubCharge2.substring(0, this.vasSubCharge2Size)),
				((this.vasSubCharge3 == null) ? null
						: (this.vasSubCharge3.length() <= vasSubCharge3Size) ? this.vasSubCharge3
								: this.vasSubCharge3.substring(0, this.vasSubCharge3Size)),
				this.vasTwinbillNo,
				((this.vasMultiCharge == null) ? null
						: (this.vasMultiCharge.length() <= vasMultiChargeSize) ? this.vasMultiCharge
								: this.vasMultiCharge.substring(0, this.vasMultiChargeSize)),
				((this.vsrServiceCode == null) ? null
						: (this.vsrServiceCode.length() <= vsrServiceCodeSize) ? this.vsrServiceCode
								: this.vsrServiceCode.substring(0, this.vsrServiceCodeSize)),
				((this.vsrServiceType == null) ? null
						: (this.vsrServiceType.length() <= vsrServiceTypeSize) ? this.vsrServiceType
								: this.vsrServiceType.substring(0, this.vsrServiceTypeSize)),
				((this.vsrServiceDesc == null) ? null
						: (this.vsrServiceDesc.length() <= vsrServiceDescSize) ? this.vsrServiceDesc
								: this.vsrServiceDesc.substring(0, this.vsrServiceDescSize)),
				((this.vsrOriginator == null) ? null
						: (this.vsrOriginator.length() <= vsrOriginatorSize) ? this.vsrOriginator
								: this.vsrOriginator.substring(0, this.vsrOriginatorSize)),
				((this.vsrServiceClass == null) ? null
						: (this.vsrServiceClass.length() <= vsrServiceClassSize) ? this.vsrServiceClass
								: this.vsrServiceClass.substring(0, this.vsrServiceClassSize)),
				((this.vsrTempDeact == null) ? null
						: (this.vsrTempDeact.length() <= vsrTempDeactSize) ? this.vsrTempDeact
								: this.vsrTempDeact.substring(0, this.vsrTempDeactSize)),
				((this.vsrProrata == null) ? null
						: (this.vsrProrata.length() <= vsrProrataSize) ? this.vsrProrata
								: this.vsrProrata.substring(0, this.vsrProrataSize)),
				((this.vsrProviderId == null) ? null
						: (this.vsrProviderId.length() <= vsrProviderIdSize) ? this.vsrProviderId
								: this.vsrProviderId.substring(0, this.vsrProviderIdSize)),
				((this.vsrShortDesc == null) ? null
						: (this.vsrShortDesc.length() <= vsrShortDescSize) ? this.vsrShortDesc
								: this.vsrShortDesc.substring(0, this.vsrShortDescSize)),
				((this.vsrSuspend == null) ? null
						: (this.vsrSuspend.length() <= vsrSuspendSize) ? this.vsrSuspend
								: this.vsrSuspend.substring(0, this.vsrSuspendSize)),
				((this.vstServiceType == null) ? null
						: (this.vstServiceType.length() <= vstServiceTypeSize) ? this.vstServiceType
								: this.vstServiceType.substring(0, this.vstServiceTypeSize)),
				((this.vstServiceDesc == null) ? null
						: (this.vstServiceDesc.length() <= vstServiceDescSize) ? this.vstServiceDesc
								: this.vstServiceDesc.substring(0, this.vstServiceDescSize)),
				((this.vstMultiCharge == null) ? null
						: (this.vstMultiCharge.length() <= vstMultiChargeSize) ? this.vstMultiCharge
								: this.vstMultiCharge.substring(0, this.vstMultiChargeSize)),
				((this.vstServiceClass == null) ? null
						: (this.vstServiceClass.length() <= vstServiceClassSize) ? this.vstServiceClass
								: this.vstServiceClass.substring(0, this.vstServiceClassSize)),
				((this.vstAutoConnect == null) ? null
						: (this.vstAutoConnect.length() <= vstAutoConnectSize) ? this.vstAutoConnect
								: this.vstAutoConnect.substring(0, this.vstAutoConnectSize)),
				((this.vstOriginator == null) ? null
						: (this.vstOriginator.length() <= vstOriginatorSize) ? this.vstOriginator
								: this.vstOriginator.substring(0, this.vstOriginatorSize)),
				((this.vstTariffRelated == null) ? null
						: (this.vstTariffRelated.length() <= vstTariffRelatedSize) ? this.vstTariffRelated
								: this.vstTariffRelated.substring(0, this.vstTariffRelatedSize)),
				((this.vstParameterised == null) ? null
						: (this.vstParameterised.length() <= vstParameterisedSize) ? this.vstParameterised
								: this.vstParameterised.substring(0, this.vstParameterisedSize)),
				((this.vstParamsLevel == null) ? null
						: (this.vstParamsLevel.length() <= vstParamsLevelSize) ? this.vstParamsLevel
								: this.vstParamsLevel.substring(0, this.vstParamsLevelSize)),
				this.vstArchiveMonths,
				((this.vstFutureAct == null) ? null
						: (this.vstFutureAct.length() <= vstFutureActSize) ? this.vstFutureAct
								: this.vstFutureAct.substring(0, this.vstFutureActSize)),
				((this.vstNodeLevel == null) ? null
						: (this.vstNodeLevel.length() <= vstNodeLevelSize) ? this.vstNodeLevel
								: this.vstNodeLevel.substring(0, this.vstNodeLevelSize)) };
	}

	protected Integer versionNumber() {
		return null;
	}

	protected void versionNumber(Integer versionNumber) {
	}

	protected int[] fieldSizes() {
		return fieldSizes;
	}

	protected int[] fieldTypes() {
		return fieldTypes;
	}

	protected DAOArgs primaryKey() {
		return null;
	}

	protected void set(Object[] fields) {
		this.vasSubscriberId = ((Integer) fields[0]);
		this.vasServiceCode = rtrim((String) fields[1]);
		this.vasInternTariff = rtrim((String) fields[2]);
		this.vasServiceType = rtrim((String) fields[3]);
		this.vasActDate = ((fields[4] == null) ? null : new Date(fields[4]));
		this.vasDeactDate = ((fields[5] == null) ? null : new Date(fields[5]));
		this.vasSubCharge1 = rtrim((String) fields[6]);
		this.vasSubCharge2 = rtrim((String) fields[7]);
		this.vasSubCharge3 = rtrim((String) fields[8]);
		this.vasTwinbillNo = ((Short) fields[9]);
		this.vasMultiCharge = rtrim((String) fields[10]);
		this.vsrServiceCode = rtrim((String) fields[11]);
		this.vsrServiceType = rtrim((String) fields[12]);
		this.vsrServiceDesc = rtrim((String) fields[13]);
		this.vsrOriginator = rtrim((String) fields[14]);
		this.vsrServiceClass = rtrim((String) fields[15]);
		this.vsrTempDeact = rtrim((String) fields[16]);
		this.vsrProrata = rtrim((String) fields[17]);
		this.vsrProviderId = rtrim((String) fields[18]);
		this.vsrShortDesc = rtrim((String) fields[19]);
		this.vsrSuspend = rtrim((String) fields[20]);
		this.vstServiceType = rtrim((String) fields[21]);
		this.vstServiceDesc = rtrim((String) fields[22]);
		this.vstMultiCharge = rtrim((String) fields[23]);
		this.vstServiceClass = rtrim((String) fields[24]);
		this.vstAutoConnect = rtrim((String) fields[25]);
		this.vstOriginator = rtrim((String) fields[26]);
		this.vstTariffRelated = rtrim((String) fields[27]);
		this.vstParameterised = rtrim((String) fields[28]);
		this.vstParamsLevel = rtrim((String) fields[29]);
		this.vstArchiveMonths = ((Short) fields[30]);
		this.vstFutureAct = rtrim((String) fields[31]);
		this.vstNodeLevel = rtrim((String) fields[32]);
	}

	public void set(final Integer vasSubscriberId, final String vasServiceCode, final String vasInternTariff,
			final String vasServiceType, final Date vasActDate, final Date vasDeactDate, final String vasSubCharge1,
			final String vasSubCharge2, final String vasSubCharge3, final Short vasTwinbillNo,
			final String vasMultiCharge, final String vsrServiceCode, final String vsrServiceType,
			final String vsrServiceDesc, final String vsrOriginator, final String vsrServiceClass,
			final String vsrTempDeact, final String vsrProrata, final String vsrProviderId, final String vsrShortDesc,
			final String vsrSuspend, final String vstServiceType, final String vstServiceDesc,
			final String vstMultiCharge, final String vstServiceClass, final String vstAutoConnect,
			final String vstOriginator, final String vstTariffRelated, final String vstParameterised,
			final String vstParamsLevel, final Short vstArchiveMonths, final String vstFutureAct,
			final String vstNodeLevel) {

		this.vasSubscriberId = vasSubscriberId;
		this.vasServiceCode = vasServiceCode;
		this.vasInternTariff = vasInternTariff;
		this.vasServiceType = vasServiceType;
		this.vasActDate = vasActDate;
		this.vasDeactDate = vasDeactDate;
		this.vasSubCharge1 = vasSubCharge1;
		this.vasSubCharge2 = vasSubCharge2;
		this.vasSubCharge3 = vasSubCharge3;
		this.vasTwinbillNo = vasTwinbillNo;
		this.vasMultiCharge = vasMultiCharge;
		this.vsrServiceCode = vsrServiceCode;
		this.vsrServiceType = vsrServiceType;
		this.vsrServiceDesc = vsrServiceDesc;
		this.vsrOriginator = vsrOriginator;
		this.vsrServiceClass = vsrServiceClass;
		this.vsrTempDeact = vsrTempDeact;
		this.vsrProrata = vsrProrata;
		this.vsrProviderId = vsrProviderId;
		this.vsrShortDesc = vsrShortDesc;
		this.vsrSuspend = vsrSuspend;
		this.vstServiceType = vstServiceType;
		this.vstServiceDesc = vstServiceDesc;
		this.vstMultiCharge = vstMultiCharge;
		this.vstServiceClass = vstServiceClass;
		this.vstAutoConnect = vstAutoConnect;
		this.vstOriginator = vstOriginator;
		this.vstTariffRelated = vstTariffRelated;
		this.vstParameterised = vstParameterised;
		this.vstParamsLevel = vstParamsLevel;
		this.vstArchiveMonths = vstArchiveMonths;
		this.vstFutureAct = vstFutureAct;
		this.vstNodeLevel = vstNodeLevel;
	}

	public VasActiveServiceDMO getVasDMO() {
		return vasDMO;
	}

	public void setVasDMO(VasActiveServiceDMO vasDMO) {
		this.vasDMO = vasDMO;
	}

	public VsrServiceDMO getVsrDMO() {
		return vsrDMO;
	}

	public void setVsrDMO(VsrServiceDMO vsrDMO) {
		this.vsrDMO = vsrDMO;
	}

	public VstServiceTypesDMO getVstDMO() {
		return vstDMO;
	}

	public void setVstDMO(VstServiceTypesDMO vstDMO) {
		this.vstDMO = vstDMO;
	}

	public Integer getVasSubscriberId() {
		return vasSubscriberId;
	}

	public void setVasSubscriberId(Integer vasSubscriberId) {
		this.vasSubscriberId = vasSubscriberId;
	}

	public String getVasServiceCode() {
		return vasServiceCode;
	}

	public void setVasServiceCode(String vasServiceCode) {
		this.vasServiceCode = vasServiceCode;
	}

	public String getVasInternTariff() {
		return vasInternTariff;
	}

	public void setVasInternTariff(String vasInternTariff) {
		this.vasInternTariff = vasInternTariff;
	}

	public String getVasServiceType() {
		return vasServiceType;
	}

	public void setVasServiceType(String vasServiceType) {
		this.vasServiceType = vasServiceType;
	}

	public Date getVasActDate() {
		return vasActDate;
	}

	public void setVasActDate(Date vasActDate) {
		this.vasActDate = vasActDate;
	}

	public Date getVasDeactDate() {
		return vasDeactDate;
	}

	public void setVasDeactDate(Date vasDeactDate) {
		this.vasDeactDate = vasDeactDate;
	}

	public String getVasSubCharge1() {
		return vasSubCharge1;
	}

	public void setVasSubCharge1(String vasSubCharge1) {
		this.vasSubCharge1 = vasSubCharge1;
	}

	public String getVasSubCharge2() {
		return vasSubCharge2;
	}

	public void setVasSubCharge2(String vasSubCharge2) {
		this.vasSubCharge2 = vasSubCharge2;
	}

	public String getVasSubCharge3() {
		return vasSubCharge3;
	}

	public void setVasSubCharge3(String vasSubCharge3) {
		this.vasSubCharge3 = vasSubCharge3;
	}

	public Short getVasTwinbillNo() {
		return vasTwinbillNo;
	}

	public void setVasTwinbillNo(Short vasTwinbillNo) {
		this.vasTwinbillNo = vasTwinbillNo;
	}

	public String getVasMultiCharge() {
		return vasMultiCharge;
	}

	public void setVasMultiCharge(String vasMultiCharge) {
		this.vasMultiCharge = vasMultiCharge;
	}

	public String getVsrServiceCode() {
		return vsrServiceCode;
	}

	public void setVsrServiceCode(String vsrServiceCode) {
		this.vsrServiceCode = vsrServiceCode;
	}

	public String getVsrServiceType() {
		return vsrServiceType;
	}

	public void setVsrServiceType(String vsrServiceType) {
		this.vsrServiceType = vsrServiceType;
	}

	public String getVsrServiceDesc() {
		return vsrServiceDesc;
	}

	public void setVsrServiceDesc(String vsrServiceDesc) {
		this.vsrServiceDesc = vsrServiceDesc;
	}

	public String getVsrOriginator() {
		return vsrOriginator;
	}

	public void setVsrOriginator(String vsrOriginator) {
		this.vsrOriginator = vsrOriginator;
	}

	public String getVsrServiceClass() {
		return vsrServiceClass;
	}

	public void setVsrServiceClass(String vsrServiceClass) {
		this.vsrServiceClass = vsrServiceClass;
	}

	public String getVsrTempDeact() {
		return vsrTempDeact;
	}

	public void setVsrTempDeact(String vsrTempDeact) {
		this.vsrTempDeact = vsrTempDeact;
	}

	public String getVsrProrata() {
		return vsrProrata;
	}

	public void setVsrProrata(String vsrProrata) {
		this.vsrProrata = vsrProrata;
	}

	public String getVsrProviderId() {
		return vsrProviderId;
	}

	public void setVsrProviderId(String vsrProviderId) {
		this.vsrProviderId = vsrProviderId;
	}

	public String getVsrShortDesc() {
		return vsrShortDesc;
	}

	public void setVsrShortDesc(String vsrShortDesc) {
		this.vsrShortDesc = vsrShortDesc;
	}

	public String getVsrSuspend() {
		return vsrSuspend;
	}

	public void setVsrSuspend(String vsrSuspend) {
		this.vsrSuspend = vsrSuspend;
	}

	public String getVstServiceType() {
		return vstServiceType;
	}

	public void setVstServiceType(String vstServiceType) {
		this.vstServiceType = vstServiceType;
	}

	public String getVstServiceDesc() {
		return vstServiceDesc;
	}

	public void setVstServiceDesc(String vstServiceDesc) {
		this.vstServiceDesc = vstServiceDesc;
	}

	public String getVstMultiCharge() {
		return vstMultiCharge;
	}

	public void setVstMultiCharge(String vstMultiCharge) {
		this.vstMultiCharge = vstMultiCharge;
	}

	public String getVstServiceClass() {
		return vstServiceClass;
	}

	public void setVstServiceClass(String vstServiceClass) {
		this.vstServiceClass = vstServiceClass;
	}

	public String getVstAutoConnect() {
		return vstAutoConnect;
	}

	public void setVstAutoConnect(String vstAutoConnect) {
		this.vstAutoConnect = vstAutoConnect;
	}

	public String getVstOriginator() {
		return vstOriginator;
	}

	public void setVstOriginator(String vstOriginator) {
		this.vstOriginator = vstOriginator;
	}

	public String getVstTariffRelated() {
		return vstTariffRelated;
	}

	public void setVstTariffRelated(String vstTariffRelated) {
		this.vstTariffRelated = vstTariffRelated;
	}

	public String getVstParameterised() {
		return vstParameterised;
	}

	public void setVstParameterised(String vstParameterised) {
		this.vstParameterised = vstParameterised;
	}

	public String getVstParamsLevel() {
		return vstParamsLevel;
	}

	public void setVstParamsLevel(String vstParamsLevel) {
		this.vstParamsLevel = vstParamsLevel;
	}

	public Short getVstArchiveMonths() {
		return vstArchiveMonths;
	}

	public void setVstArchiveMonths(Short vstArchiveMonths) {
		this.vstArchiveMonths = vstArchiveMonths;
	}

	public String getVstFutureAct() {
		return vstFutureAct;
	}

	public void setVstFutureAct(String vstFutureAct) {
		this.vstFutureAct = vstFutureAct;
	}

	public String getVstNodeLevel() {
		return vstNodeLevel;
	}

	public void setVstNodeLevel(String vstNodeLevel) {
		this.vstNodeLevel = vstNodeLevel;
	}

}
