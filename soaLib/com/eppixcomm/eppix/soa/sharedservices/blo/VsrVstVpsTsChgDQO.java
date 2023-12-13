package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;
import java.math.BigDecimal;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;

public class VsrVstVpsTsChgDQO extends DBO implements Serializable {

	private String serviceCode;
	private String serviceDesc;
	private String shortDesc;
	private String originator;
	private String prorata;
	private String providerId;
	private String vstServiceType;
	private String vstServiceDesc;
	private String vstServiceClass;
	private String vpsAlterCharge;
	private String vpsMultiCharge;
	private String vpsChangeMulti;
	private String vpsPriceByTarif;
	private String vpsAutoConnect;
	private String tsPdeactCharge;
	private String tsPdeactChgDescription;
	private BigDecimal tsPdeactChgValue;
	private String tsActCharge;
	private String tsActChgDescription;
	private BigDecimal tsActChgValue;
	private String subCharge1;
	private String subCharge1Desc;
	private BigDecimal subCharge1Price;
	private String subCharge2;
	private String subCharge2Desc;
	private BigDecimal subCharge2Price;
	private String subCharge3;
	private String subCharge3Desc;
	private BigDecimal subCharge3Price;
	
//	l_ts.ts_charge_period, l_ts.ts_charge_freq,
//	l_ts.ts_discount_ref,l_ts.ts_act_inclusive
	
	private String tsChargePeriod;
	private Short tsChargeFreq;
	private String tsDiscountRef;
	private String tsActInclusive;

	public static final int serviceCodeFilter = 0;
	private static final int serviceCodeSize = 4;

	public static final int serviceDescFilter = 1;
	private static final int serviceDescSize = 32;

	public static final int shortDescFilter = 2;
	private static final int shortDescSize = 8;

	public static final int originatorFilter = 3;
	private static final int originatorSize = 1;

	public static final int prorataFilter = 4;
	private static final int prorataSize = 1;

	public static final int providerIdFilter = 5;
	private static final int providerIdSize = 5;

	public static final int vstServiceTypeFilter = 6;
	private static final int vstServiceTypeSize = 5;

	public static final int vstServiceDescFilter = 7;
	private static final int vstServiceDescSize = 32;

	public static final int vstServiceClassFilter = 8;
	private static final int vstServiceClassSize = 1;

	public static final int vpsAlterChargeFilter = 9;
	private static final int vpsAlterChargeSize = 1;

	public static final int vpsMultiChargeFilter = 10;
	private static final int vpsMultiChargeSize = 1;

	public static final int vpsChangeMultiFilter = 11;
	private static final int vpsChangeMultiSize = 1;

	public static final int vpsPriceByTarifFilter = 12;
	private static final int vpsPriceByTarifSize = 1;

	public static final int vpsAutoConnectFilter = 13;
	private static final int vpsAutoConnectSize = 1;

	public static final int tsPdeactChargeFilter = 14;
	private static final int tsPdeactChargeSize = 5;

	public static final int chgDescriptionFilter = 15;
	private static final int chgDescriptionSize = 32;

	public static final int chgValueFilter = 16;

	public VsrVstVpsTsChgDQO() {
	};

	public VsrVstVpsTsChgDQO(final String serviceCode,
			final String serviceDesc, final String shortDesc,
			final String originator, final String prorata,
			final String providerId, final String vstServiceType,
			final String vstServiceDesc, final String vstServiceClass,
			final String vpsAlterCharge, final String vpsMultiCharge,
			final String vpsChangeMulti, final String vpsPriceByTarif,
			final String vpsAutoConnect, final String tsPdeactCharge,
			final String chgDescription, final BigDecimal chgValue) {

		this.serviceCode = serviceCode;
		this.serviceDesc = serviceDesc;
		this.shortDesc = shortDesc;
		this.originator = originator;
		this.prorata = prorata;
		this.providerId = providerId;
		this.vstServiceType = vstServiceType;
		this.vstServiceDesc = vstServiceDesc;
		this.vstServiceClass = vstServiceClass;
		this.vpsAlterCharge = vpsAlterCharge;
		this.vpsMultiCharge = vpsMultiCharge;
		this.vpsChangeMulti = vpsChangeMulti;
		this.vpsPriceByTarif = vpsPriceByTarif;
		this.vpsAutoConnect = vpsAutoConnect;
		this.tsPdeactCharge = tsPdeactCharge;
		this.tsPdeactChgDescription = chgDescription;
		this.tsPdeactChgValue = chgValue;
	};

	private static final int[] fieldSizes = new int[] { serviceCodeSize,
			serviceDescSize, shortDescSize, originatorSize, prorataSize,
			providerIdSize, vstServiceTypeSize, vstServiceDescSize,
			vstServiceClassSize, vpsAlterChargeSize, vpsMultiChargeSize,
			vpsChangeMultiSize, vpsPriceByTarifSize, vpsAutoConnectSize,
			tsPdeactChargeSize, chgDescriptionSize, 0 };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_FLOAT };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] {
				((this.serviceCode == null) ? null
						: (this.serviceCode.length() <= serviceCodeSize) ? this.serviceCode
								: this.serviceCode.substring(0,
										this.serviceCodeSize)),
				((this.serviceDesc == null) ? null
						: (this.serviceDesc.length() <= serviceDescSize) ? this.serviceDesc
								: this.serviceDesc.substring(0,
										this.serviceDescSize)),
				((this.shortDesc == null) ? null
						: (this.shortDesc.length() <= shortDescSize) ? this.shortDesc
								: this.shortDesc.substring(0,
										this.shortDescSize)),
				((this.originator == null) ? null
						: (this.originator.length() <= originatorSize) ? this.originator
								: this.originator.substring(0,
										this.originatorSize)),
				((this.prorata == null) ? null
						: (this.prorata.length() <= prorataSize) ? this.prorata
								: this.prorata.substring(0, this.prorataSize)),
				((this.providerId == null) ? null
						: (this.providerId.length() <= providerIdSize) ? this.providerId
								: this.providerId.substring(0,
										this.providerIdSize)),
				((this.vstServiceType == null) ? null : (this.vstServiceType
						.length() <= vstServiceTypeSize) ? this.vstServiceType
						: this.vstServiceType.substring(0,
								this.vstServiceTypeSize)),
				((this.vstServiceDesc == null) ? null : (this.vstServiceDesc
						.length() <= vstServiceDescSize) ? this.vstServiceDesc
						: this.vstServiceDesc.substring(0,
								this.vstServiceDescSize)),
				((this.vstServiceClass == null) ? null
						: (this.vstServiceClass.length() <= vstServiceClassSize) ? this.vstServiceClass
								: this.vstServiceClass.substring(0,
										this.vstServiceClassSize)),
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
				((this.tsPdeactCharge == null) ? null : (this.tsPdeactCharge
						.length() <= tsPdeactChargeSize) ? this.tsPdeactCharge
						: this.tsPdeactCharge.substring(0,
								this.tsPdeactChargeSize)),
				((this.tsPdeactChgDescription == null) ? null
						: (this.tsPdeactChgDescription.length() <= chgDescriptionSize) ? this.tsPdeactChgDescription
								: this.tsPdeactChgDescription.substring(0,
										this.chgDescriptionSize)),
				this.tsPdeactChgValue };
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
		this.serviceCode = rtrim((String) fields[0]);
		this.serviceDesc = rtrim((String) fields[1]);
		this.shortDesc = rtrim((String) fields[2]);
		this.originator = rtrim((String) fields[3]);
		this.prorata = rtrim((String) fields[4]);
		this.providerId = rtrim((String) fields[5]);
		this.vstServiceType = rtrim((String) fields[6]);
		this.vstServiceDesc = rtrim((String) fields[7]);
		this.vstServiceClass = rtrim((String) fields[8]);
		this.vpsAlterCharge = rtrim((String) fields[9]);
		this.vpsMultiCharge = rtrim((String) fields[10]);
		this.vpsChangeMulti = rtrim((String) fields[11]);
		this.vpsPriceByTarif = rtrim((String) fields[12]);
		this.vpsAutoConnect = rtrim((String) fields[13]);
		this.tsPdeactCharge = rtrim((String) fields[14]);
		this.tsPdeactChgDescription = rtrim((String) fields[15]);
		this.tsPdeactChgValue = ((BigDecimal) fields[16]);
	}

	public void set(final String serviceCode, final String serviceDesc,
			final String shortDesc, final String originator,
			final String prorata, final String providerId,
			final String vstServiceType, final String vstServiceDesc,
			final String vstServiceClass, final String vpsAlterCharge,
			final String vpsMultiCharge, final String vpsChangeMulti,
			final String vpsPriceByTarif, final String vpsAutoConnect,
			final String tsPdeactCharge, final String chgDescription,
			final BigDecimal chgValue) {

		this.serviceCode = serviceCode;
		this.serviceDesc = serviceDesc;
		this.shortDesc = shortDesc;
		this.originator = originator;
		this.prorata = prorata;
		this.providerId = providerId;
		this.vstServiceType = vstServiceType;
		this.vstServiceDesc = vstServiceDesc;
		this.vstServiceClass = vstServiceClass;
		this.vpsAlterCharge = vpsAlterCharge;
		this.vpsMultiCharge = vpsMultiCharge;
		this.vpsChangeMulti = vpsChangeMulti;
		this.vpsPriceByTarif = vpsPriceByTarif;
		this.vpsAutoConnect = vpsAutoConnect;
		this.tsPdeactCharge = tsPdeactCharge;
		this.tsPdeactChgDescription = chgDescription;
		this.tsPdeactChgValue = chgValue;
	}

	public String getServiceCode() {
		return serviceCode;
	}

	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}

	public String getServiceDesc() {
		return serviceDesc;
	}

	public void setServiceDesc(String serviceDesc) {
		this.serviceDesc = serviceDesc;
	}

	public String getShortDesc() {
		return shortDesc;
	}

	public void setShortDesc(String shortDesc) {
		this.shortDesc = shortDesc;
	}

	public String getOriginator() {
		return originator;
	}

	public void setOriginator(String originator) {
		this.originator = originator;
	}

	public String getProrata() {
		return prorata;
	}

	public void setProrata(String prorata) {
		this.prorata = prorata;
	}

	public String getProviderId() {
		return providerId;
	}

	public void setProviderId(String providerId) {
		this.providerId = providerId;
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

	public String getVstServiceClass() {
		return vstServiceClass;
	}

	public void setVstServiceClass(String vstServiceClass) {
		this.vstServiceClass = vstServiceClass;
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

	public String getTsPdeactCharge() {
		return tsPdeactCharge;
	}

	public void setTsPdeactCharge(String tsPdeactCharge) {
		this.tsPdeactCharge = tsPdeactCharge;
	}

//	public String getChgDescription() {
//		return tsPdeactChgDescription;
//	}
//
//	public void setChgDescription(String chgDescription) {
//		this.tsPdeactChgDescription = chgDescription;
//	}

//	public BigDecimal getChgValue() {
//		return tsPdeactChgValue;
//	}
//
//	public void setChgValue(BigDecimal chgValue) {
//		this.tsPdeactChgValue = chgValue;
//	}

	public String getSubCharge1() {
		return subCharge1;
	}

	public void setSubCharge1(String subCharge1) {
		this.subCharge1 = subCharge1;
	}

	public String getSubCharge1Desc() {
		return subCharge1Desc;
	}

	public void setSubCharge1Desc(String subCharge1Desc) {
		this.subCharge1Desc = subCharge1Desc;
	}

	public BigDecimal getSubCharge1Price() {
		return subCharge1Price;
	}

	public void setSubCharge1Price(BigDecimal subCharge1Price) {
		this.subCharge1Price = subCharge1Price;
	}

	public String getSubCharge2() {
		return subCharge2;
	}

	public void setSubCharge2(String subCharge2) {
		this.subCharge2 = subCharge2;
	}

	public String getSubCharge2Desc() {
		return subCharge2Desc;
	}

	public void setSubCharge2Desc(String subCharge2Desc) {
		this.subCharge2Desc = subCharge2Desc;
	}

	public BigDecimal getSubCharge2Price() {
		return subCharge2Price;
	}

	public void setSubCharge2Price(BigDecimal subCharge2Price) {
		this.subCharge2Price = subCharge2Price;
	}

	public String getSubCharge3() {
		return subCharge3;
	}

	public void setSubCharge3(String subCharge3) {
		this.subCharge3 = subCharge3;
	}

	public String getSubCharge3Desc() {
		return subCharge3Desc;
	}

	public void setSubCharge3Desc(String subCharge3Desc) {
		this.subCharge3Desc = subCharge3Desc;
	}

	public BigDecimal getSubCharge3Price() {
		return subCharge3Price;
	}

	public void setSubCharge3Price(BigDecimal subCharge3Price) {
		this.subCharge3Price = subCharge3Price;
	}

	public String getTsPdeactChgDescription() {
		return tsPdeactChgDescription;
	}

	public void setTsPdeactChgDescription(String tsPdeactChgDescription) {
		this.tsPdeactChgDescription = tsPdeactChgDescription;
	}

	public BigDecimal getTsPdeactChgValue() {
		return tsPdeactChgValue;
	}

	public void setTsPdeactChgValue(BigDecimal tsPdeactChgValue) {
		this.tsPdeactChgValue = tsPdeactChgValue;
	}

	public String getTsActCharge() {
		return tsActCharge;
	}

	public void setTsActCharge(String tsActCharge) {
		this.tsActCharge = tsActCharge;
	}

	public String getTsActChgDescription() {
		return tsActChgDescription;
	}

	public void setTsActChgDescription(String tsActChgDescription) {
		this.tsActChgDescription = tsActChgDescription;
	}

	public BigDecimal getTsActChgValue() {
		return tsActChgValue;
	}

	public void setTsActChgValue(BigDecimal tsActChgValue) {
		this.tsActChgValue = tsActChgValue;
	}

	public String getTsChargePeriod() {
		return tsChargePeriod;
	}

	public void setTsChargePeriod(String tsChargePeriod) {
		this.tsChargePeriod = tsChargePeriod;
	}

	public Short getTsChargeFreq() {
		return tsChargeFreq;
	}

	public void setTsChargeFreq(Short tsChargeFreq) {
		this.tsChargeFreq = tsChargeFreq;
	}

	public String getTsDiscountRef() {
		return tsDiscountRef;
	}

	public void setTsDiscountRef(String tsDiscountRef) {
		this.tsDiscountRef = tsDiscountRef;
	}

	public String getTsActInclusive() {
		return tsActInclusive;
	}

	public void setTsActInclusive(String tsActInclusive) {
		this.tsActInclusive = tsActInclusive;
	}

	@Override
	public String toString() {
		return "\nVsrVstVpsTsChgDQO [\nserviceCode=" + serviceCode
				+ "\nserviceDesc=" + serviceDesc + "\nshortDesc=" + shortDesc
				+ "\noriginator=" + originator + "\nprorata=" + prorata
				+ "\nproviderId=" + providerId + "\nvstServiceType="
				+ vstServiceType + "\nvstServiceDesc=" + vstServiceDesc
				+ "\nvstServiceClass=" + vstServiceClass + "\nvpsAlterCharge="
				+ vpsAlterCharge + "\nvpsMultiCharge=" + vpsMultiCharge
				+ "\nvpsChangeMulti=" + vpsChangeMulti + "\nvpsPriceByTarif="
				+ vpsPriceByTarif + "\nvpsAutoConnect=" + vpsAutoConnect
				+ "\ntsPdeactCharge=" + tsPdeactCharge
				+ "\ntsPdeactChgDescription=" + tsPdeactChgDescription
				+ "\ntsPdeactChgValue=" + tsPdeactChgValue + "\ntsActCharge="
				+ tsActCharge + "\ntsActChgDescription=" + tsActChgDescription
				+ "\ntsActChgValue=" + tsActChgValue + "\nsubCharge1="
				+ subCharge1 + "\nsubCharge1Desc=" + subCharge1Desc
				+ "\nsubCharge1Price=" + subCharge1Price + "\nsubCharge2="
				+ subCharge2 + "\nsubCharge2Desc=" + subCharge2Desc
				+ "\nsubCharge2Price=" + subCharge2Price + "\nsubCharge3="
				+ subCharge3 + "\nsubCharge3Desc=" + subCharge3Desc
				+ "\nsubCharge3Price=" + subCharge3Price + "\ntsChargePeriod="
				+ tsChargePeriod + "\ntsChargeFreq=" + tsChargeFreq
				+ "\ntsDiscountRef=" + tsDiscountRef + "\ntsActInclusive="
				+ tsActInclusive + "]";
	}
}
