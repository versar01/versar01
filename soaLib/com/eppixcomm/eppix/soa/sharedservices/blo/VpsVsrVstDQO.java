package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.base.blo.VpsPackageServDMO;
import com.eppixcomm.eppix.base.blo.VsrServiceDMO;
import com.eppixcomm.eppix.base.blo.VstServiceTypesDMO;
import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;

public class VpsVsrVstDQO extends DBO implements Serializable {

	private VpsPackageServDMO vpsDMO;
	private VsrServiceDMO vsrDMO;
	private VstServiceTypesDMO vstDMO;

	private String vpsPackageCode;
	private String vpsServiceCode;
	private String vpsAlterCharge;
	private String vpsMultiCharge;
	private String vpsChangeMulti;
	private String vpsPriceByTarif;
	private String vpsAutoConnect;
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

	public static final int vpsPackageCodeFilter = 0;
	private static final int vpsPackageCodeSize = 5;

	public static final int vpsServiceCodeFilter = 1;
	private static final int vpsServiceCodeSize = 4;

	public static final int vpsAlterChargeFilter = 2;
	private static final int vpsAlterChargeSize = 1;

	public static final int vpsMultiChargeFilter = 3;
	private static final int vpsMultiChargeSize = 1;

	public static final int vpsChangeMultiFilter = 4;
	private static final int vpsChangeMultiSize = 1;

	public static final int vpsPriceByTarifFilter = 5;
	private static final int vpsPriceByTarifSize = 1;

	public static final int vpsAutoConnectFilter = 6;
	private static final int vpsAutoConnectSize = 1;

	public static final int vsrServiceCodeFilter = 7;
	private static final int vsrServiceCodeSize = 4;

	public static final int vsrServiceTypeFilter = 8;
	private static final int vsrServiceTypeSize = 5;

	public static final int vsrServiceDescFilter = 9;
	private static final int vsrServiceDescSize = 32;

	public static final int vsrOriginatorFilter = 10;
	private static final int vsrOriginatorSize = 1;

	public static final int vsrServiceClassFilter = 11;
	private static final int vsrServiceClassSize = 1;

	public static final int vsrTempDeactFilter = 12;
	private static final int vsrTempDeactSize = 1;

	public static final int vsrProrataFilter = 13;
	private static final int vsrProrataSize = 1;

	public static final int vsrProviderIdFilter = 14;
	private static final int vsrProviderIdSize = 5;

	public static final int vsrShortDescFilter = 15;
	private static final int vsrShortDescSize = 8;

	public static final int vsrSuspendFilter = 16;
	private static final int vsrSuspendSize = 1;

	public static final int vstServiceTypeFilter = 17;
	private static final int vstServiceTypeSize = 5;

	public static final int vstServiceDescFilter = 18;
	private static final int vstServiceDescSize = 32;

	public static final int vstMultiChargeFilter = 19;
	private static final int vstMultiChargeSize = 1;

	public static final int vstServiceClassFilter = 20;
	private static final int vstServiceClassSize = 1;

	public static final int vstAutoConnectFilter = 21;
	private static final int vstAutoConnectSize = 1;

	public static final int vstOriginatorFilter = 22;
	private static final int vstOriginatorSize = 1;

	public static final int vstTariffRelatedFilter = 23;
	private static final int vstTariffRelatedSize = 1;

	public static final int vstParameterisedFilter = 24;
	private static final int vstParameterisedSize = 1;

	public static final int vstParamsLevelFilter = 25;
	private static final int vstParamsLevelSize = 1;

	public static final int vstArchiveMonthsFilter = 26;

	public static final int vstFutureActFilter = 27;
	private static final int vstFutureActSize = 1;

	public static final int vstNodeLevelFilter = 28;
	private static final int vstNodeLevelSize = 5;

	public VpsVsrVstDQO() {
	};

	public VpsVsrVstDQO(final String vpsPackageCode,
			final String vpsServiceCode, final String vpsAlterCharge,
			final String vpsMultiCharge, final String vpsChangeMulti,
			final String vpsPriceByTarif, final String vpsAutoConnect,
			final String vsrServiceCode, final String vsrServiceType,
			final String vsrServiceDesc, final String vsrOriginator,
			final String vsrServiceClass, final String vsrTempDeact,
			final String vsrProrata, final String vsrProviderId,
			final String vsrShortDesc, final String vsrSuspend,
			final String vstServiceType, final String vstServiceDesc,
			final String vstMultiCharge, final String vstServiceClass,
			final String vstAutoConnect, final String vstOriginator,
			final String vstTariffRelated, final String vstParameterised,
			final String vstParamsLevel, final Short vstArchiveMonths,
			final String vstFutureAct, final String vstNodeLevel) {

		this.vpsPackageCode = vpsPackageCode;
		this.vpsServiceCode = vpsServiceCode;
		this.vpsAlterCharge = vpsAlterCharge;
		this.vpsMultiCharge = vpsMultiCharge;
		this.vpsChangeMulti = vpsChangeMulti;
		this.vpsPriceByTarif = vpsPriceByTarif;
		this.vpsAutoConnect = vpsAutoConnect;
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

	private static final int[] fieldSizes = new int[] { vpsPackageCodeSize,
			vpsServiceCodeSize, vpsAlterChargeSize, vpsMultiChargeSize,
			vpsChangeMultiSize, vpsPriceByTarifSize, vpsAutoConnectSize,
			vsrServiceCodeSize, vsrServiceTypeSize, vsrServiceDescSize,
			vsrOriginatorSize, vsrServiceClassSize, vsrTempDeactSize,
			vsrProrataSize, vsrProviderIdSize, vsrShortDescSize,
			vsrSuspendSize, vstServiceTypeSize, vstServiceDescSize,
			vstMultiChargeSize, vstServiceClassSize, vstAutoConnectSize,
			vstOriginatorSize, vstTariffRelatedSize, vstParameterisedSize,
			vstParamsLevelSize, 0, vstFutureActSize, vstNodeLevelSize };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_SHORT, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] {
				((this.vpsPackageCode == null) ? null : (this.vpsPackageCode
						.length() <= vpsPackageCodeSize) ? this.vpsPackageCode
						: this.vpsPackageCode.substring(0,
								this.vpsPackageCodeSize)),
				((this.vpsServiceCode == null) ? null : (this.vpsServiceCode
						.length() <= vpsServiceCodeSize) ? this.vpsServiceCode
						: this.vpsServiceCode.substring(0,
								this.vpsServiceCodeSize)),
				((this.vpsAlterCharge == null) ? null : (this.vpsAlterCharge
						.length() <= vpsAlterChargeSize) ? this.vpsAlterCharge
						: this.vpsAlterCharge.substring(0,
								this.vpsAlterChargeSize)),
				((this.vpsMultiCharge == null) ? null : (this.vpsMultiCharge
						.length() <= vpsMultiChargeSize) ? this.vpsMultiCharge
						: this.vpsMultiCharge.substring(0,
								this.vpsMultiChargeSize)),
				((this.vpsChangeMulti == null) ? null : (this.vpsChangeMulti
						.length() <= vpsChangeMultiSize) ? this.vpsChangeMulti
						: this.vpsChangeMulti.substring(0,
								this.vpsChangeMultiSize)),
				((this.vpsPriceByTarif == null) ? null
						: (this.vpsPriceByTarif.length() <= vpsPriceByTarifSize) ? this.vpsPriceByTarif
								: this.vpsPriceByTarif.substring(0,
										this.vpsPriceByTarifSize)),
				((this.vpsAutoConnect == null) ? null : (this.vpsAutoConnect
						.length() <= vpsAutoConnectSize) ? this.vpsAutoConnect
						: this.vpsAutoConnect.substring(0,
								this.vpsAutoConnectSize)),
				((this.vsrServiceCode == null) ? null : (this.vsrServiceCode
						.length() <= vsrServiceCodeSize) ? this.vsrServiceCode
						: this.vsrServiceCode.substring(0,
								this.vsrServiceCodeSize)),
				((this.vsrServiceType == null) ? null : (this.vsrServiceType
						.length() <= vsrServiceTypeSize) ? this.vsrServiceType
						: this.vsrServiceType.substring(0,
								this.vsrServiceTypeSize)),
				((this.vsrServiceDesc == null) ? null : (this.vsrServiceDesc
						.length() <= vsrServiceDescSize) ? this.vsrServiceDesc
						: this.vsrServiceDesc.substring(0,
								this.vsrServiceDescSize)),
				((this.vsrOriginator == null) ? null : (this.vsrOriginator
						.length() <= vsrOriginatorSize) ? this.vsrOriginator
						: this.vsrOriginator.substring(0,
								this.vsrOriginatorSize)),
				((this.vsrServiceClass == null) ? null
						: (this.vsrServiceClass.length() <= vsrServiceClassSize) ? this.vsrServiceClass
								: this.vsrServiceClass.substring(0,
										this.vsrServiceClassSize)),
				((this.vsrTempDeact == null) ? null : (this.vsrTempDeact
						.length() <= vsrTempDeactSize) ? this.vsrTempDeact
						: this.vsrTempDeact.substring(0, this.vsrTempDeactSize)),
				((this.vsrProrata == null) ? null
						: (this.vsrProrata.length() <= vsrProrataSize) ? this.vsrProrata
								: this.vsrProrata.substring(0,
										this.vsrProrataSize)),
				((this.vsrProviderId == null) ? null : (this.vsrProviderId
						.length() <= vsrProviderIdSize) ? this.vsrProviderId
						: this.vsrProviderId.substring(0,
								this.vsrProviderIdSize)),
				((this.vsrShortDesc == null) ? null : (this.vsrShortDesc
						.length() <= vsrShortDescSize) ? this.vsrShortDesc
						: this.vsrShortDesc.substring(0, this.vsrShortDescSize)),
				((this.vsrSuspend == null) ? null
						: (this.vsrSuspend.length() <= vsrSuspendSize) ? this.vsrSuspend
								: this.vsrSuspend.substring(0,
										this.vsrSuspendSize)),
				((this.vstServiceType == null) ? null : (this.vstServiceType
						.length() <= vstServiceTypeSize) ? this.vstServiceType
						: this.vstServiceType.substring(0,
								this.vstServiceTypeSize)),
				((this.vstServiceDesc == null) ? null : (this.vstServiceDesc
						.length() <= vstServiceDescSize) ? this.vstServiceDesc
						: this.vstServiceDesc.substring(0,
								this.vstServiceDescSize)),
				((this.vstMultiCharge == null) ? null : (this.vstMultiCharge
						.length() <= vstMultiChargeSize) ? this.vstMultiCharge
						: this.vstMultiCharge.substring(0,
								this.vstMultiChargeSize)),
				((this.vstServiceClass == null) ? null
						: (this.vstServiceClass.length() <= vstServiceClassSize) ? this.vstServiceClass
								: this.vstServiceClass.substring(0,
										this.vstServiceClassSize)),
				((this.vstAutoConnect == null) ? null : (this.vstAutoConnect
						.length() <= vstAutoConnectSize) ? this.vstAutoConnect
						: this.vstAutoConnect.substring(0,
								this.vstAutoConnectSize)),
				((this.vstOriginator == null) ? null : (this.vstOriginator
						.length() <= vstOriginatorSize) ? this.vstOriginator
						: this.vstOriginator.substring(0,
								this.vstOriginatorSize)),
				((this.vstTariffRelated == null) ? null
						: (this.vstTariffRelated.length() <= vstTariffRelatedSize) ? this.vstTariffRelated
								: this.vstTariffRelated.substring(0,
										this.vstTariffRelatedSize)),
				((this.vstParameterised == null) ? null
						: (this.vstParameterised.length() <= vstParameterisedSize) ? this.vstParameterised
								: this.vstParameterised.substring(0,
										this.vstParameterisedSize)),
				((this.vstParamsLevel == null) ? null : (this.vstParamsLevel
						.length() <= vstParamsLevelSize) ? this.vstParamsLevel
						: this.vstParamsLevel.substring(0,
								this.vstParamsLevelSize)),
				this.vstArchiveMonths,
				((this.vstFutureAct == null) ? null : (this.vstFutureAct
						.length() <= vstFutureActSize) ? this.vstFutureAct
						: this.vstFutureAct.substring(0, this.vstFutureActSize)),
				((this.vstNodeLevel == null) ? null : (this.vstNodeLevel
						.length() <= vstNodeLevelSize) ? this.vstNodeLevel
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
		this.vpsPackageCode = rtrim((String) fields[0]);
		this.vpsServiceCode = rtrim((String) fields[1]);
		this.vpsAlterCharge = rtrim((String) fields[2]);
		this.vpsMultiCharge = rtrim((String) fields[3]);
		this.vpsChangeMulti = rtrim((String) fields[4]);
		this.vpsPriceByTarif = rtrim((String) fields[5]);
		this.vpsAutoConnect = rtrim((String) fields[6]);
		this.vsrServiceCode = rtrim((String) fields[7]);
		this.vsrServiceType = rtrim((String) fields[8]);
		this.vsrServiceDesc = rtrim((String) fields[9]);
		this.vsrOriginator = rtrim((String) fields[10]);
		this.vsrServiceClass = rtrim((String) fields[11]);
		this.vsrTempDeact = rtrim((String) fields[12]);
		this.vsrProrata = rtrim((String) fields[13]);
		this.vsrProviderId = rtrim((String) fields[14]);
		this.vsrShortDesc = rtrim((String) fields[15]);
		this.vsrSuspend = rtrim((String) fields[16]);
		this.vstServiceType = rtrim((String) fields[17]);
		this.vstServiceDesc = rtrim((String) fields[18]);
		this.vstMultiCharge = rtrim((String) fields[19]);
		this.vstServiceClass = rtrim((String) fields[20]);
		this.vstAutoConnect = rtrim((String) fields[21]);
		this.vstOriginator = rtrim((String) fields[22]);
		this.vstTariffRelated = rtrim((String) fields[23]);
		this.vstParameterised = rtrim((String) fields[24]);
		this.vstParamsLevel = rtrim((String) fields[25]);
		this.vstArchiveMonths = ((Short) fields[26]);
		this.vstFutureAct = rtrim((String) fields[27]);
		this.vstNodeLevel = rtrim((String) fields[28]);
	}

	public void set(final String vpsPackageCode, final String vpsServiceCode,
			final String vpsAlterCharge, final String vpsMultiCharge,
			final String vpsChangeMulti, final String vpsPriceByTarif,
			final String vpsAutoConnect, final String vsrServiceCode,
			final String vsrServiceType, final String vsrServiceDesc,
			final String vsrOriginator, final String vsrServiceClass,
			final String vsrTempDeact, final String vsrProrata,
			final String vsrProviderId, final String vsrShortDesc,
			final String vsrSuspend, final String vstServiceType,
			final String vstServiceDesc, final String vstMultiCharge,
			final String vstServiceClass, final String vstAutoConnect,
			final String vstOriginator, final String vstTariffRelated,
			final String vstParameterised, final String vstParamsLevel,
			final Short vstArchiveMonths, final String vstFutureAct,
			final String vstNodeLevel) {

		this.vpsPackageCode = vpsPackageCode;
		this.vpsServiceCode = vpsServiceCode;
		this.vpsAlterCharge = vpsAlterCharge;
		this.vpsMultiCharge = vpsMultiCharge;
		this.vpsChangeMulti = vpsChangeMulti;
		this.vpsPriceByTarif = vpsPriceByTarif;
		this.vpsAutoConnect = vpsAutoConnect;
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

	public void deConstruct() {
		vpsDMO = new VpsPackageServDMO(vpsPackageCode, vpsServiceCode,
				vpsAlterCharge, vpsMultiCharge, vpsChangeMulti,
				vpsPriceByTarif, vpsAutoConnect);
		vsrDMO = new VsrServiceDMO(vsrServiceCode, vsrServiceType,
				vsrServiceDesc, vsrOriginator, vsrServiceClass, vsrTempDeact,
				vsrProrata, vsrProviderId, vsrShortDesc, vsrSuspend);
		vstDMO = new VstServiceTypesDMO(vstServiceType, vstServiceDesc,
				vstMultiCharge, vstServiceClass, vstAutoConnect, vstOriginator,
				vstTariffRelated, vstParameterised, vstParamsLevel,
				vstArchiveMonths, vstFutureAct, vstNodeLevel);
	}

	public String getVpsPackageCode() {
		return vpsPackageCode;
	}

	public void setVpsPackageCode(String vpsPackageCode) {
		this.vpsPackageCode = vpsPackageCode;
	}

	public String getVpsServiceCode() {
		return vpsServiceCode;
	}

	public void setVpsServiceCode(String vpsServiceCode) {
		this.vpsServiceCode = vpsServiceCode;
	}

	public String getVpsAlterCharge() {
		return vpsAlterCharge;
	}

	public void setVpsAlterCharge(String vpsAlterCharge) {
		this.vpsAlterCharge = vpsAlterCharge;
	}

	public String getVpsMultiCharge() {
		return vpsMultiCharge;
	}

	public void setVpsMultiCharge(String vpsMultiCharge) {
		this.vpsMultiCharge = vpsMultiCharge;
	}

	public String getVpsChangeMulti() {
		return vpsChangeMulti;
	}

	public void setVpsChangeMulti(String vpsChangeMulti) {
		this.vpsChangeMulti = vpsChangeMulti;
	}

	public String getVpsPriceByTarif() {
		return vpsPriceByTarif;
	}

	public void setVpsPriceByTarif(String vpsPriceByTarif) {
		this.vpsPriceByTarif = vpsPriceByTarif;
	}

	public String getVpsAutoConnect() {
		return vpsAutoConnect;
	}

	public void setVpsAutoConnect(String vpsAutoConnect) {
		this.vpsAutoConnect = vpsAutoConnect;
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

	public VpsPackageServDMO getVpsDMO() {
		return vpsDMO;
	}

	public void setVpsDMO(VpsPackageServDMO vpsDMO) {
		this.vpsDMO = vpsDMO;
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

	@Override
	public String toString() {
		return "\nVpsVsrVstDQO [\nvpsDMO=" + vpsDMO + ", vsrDMO=" + vsrDMO
				+ ", vstDMO=" + vstDMO + ", vpsPackageCode=" + vpsPackageCode
				+ ", vpsServiceCode=" + vpsServiceCode + ", vpsAlterCharge="
				+ vpsAlterCharge + ", vpsMultiCharge=" + vpsMultiCharge
				+ ", vpsChangeMulti=" + vpsChangeMulti + ", vpsPriceByTarif="
				+ vpsPriceByTarif + ", vpsAutoConnect=" + vpsAutoConnect
				+ ", vsrServiceCode=" + vsrServiceCode + ", vsrServiceType="
				+ vsrServiceType + ", vsrServiceDesc=" + vsrServiceDesc
				+ ", vsrOriginator=" + vsrOriginator + ", vsrServiceClass="
				+ vsrServiceClass + ", vsrTempDeact=" + vsrTempDeact
				+ ", vsrProrata=" + vsrProrata + ", vsrProviderId="
				+ vsrProviderId + ", vsrShortDesc=" + vsrShortDesc
				+ ", vsrSuspend=" + vsrSuspend + ", vstServiceType="
				+ vstServiceType + ", vstServiceDesc=" + vstServiceDesc
				+ ", vstMultiCharge=" + vstMultiCharge + ", vstServiceClass="
				+ vstServiceClass + ", vstAutoConnect=" + vstAutoConnect
				+ ", vstOriginator=" + vstOriginator + ", vstTariffRelated="
				+ vstTariffRelated + ", vstParameterised=" + vstParameterised
				+ ", vstParamsLevel=" + vstParamsLevel + ", vstArchiveMonths="
				+ vstArchiveMonths + ", vstFutureAct=" + vstFutureAct
				+ ", vstNodeLevel=" + vstNodeLevel + "]";
	}

}
