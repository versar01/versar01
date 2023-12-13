package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;
import java.math.BigDecimal;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;
import com.eppixcomm.eppix.common.util.Date;

public class SbdPshPsdSpcDQO extends DBO implements Serializable {


private Integer sbdSubscriberId;
private String sbdDiallingNo;
private String sbdBillAcNo;
private Date sbdConnectDate;
private Date sbdDconnectDate;
private Date sbdTermDate;
private String sbdTitle;
private String sbdSurname;
private String sbdFirstname;
private String sbdGender;
private Date sbdDob;
private String sbdPassword;
private String sbdLocationCode;
private String sbdBillCycle;
private String sbdPackageCode;
private Date sbdBilledUpto;
private String sbdTariffPlan;
private Integer pshId;
private String pshServiceCode;
private String pshServiceType;
private Integer pshSubscriberId;
private String pshSimNo;
private String pshMsisdnNo;
private String pshArchived;
private Integer psdSerialId;
private Integer psdPshId;
private Integer psdParamId;
private Date psdActDate;
private Date psdTermDate;
private String psdParamValue;
private String psdN2nString;
private String psdParamActive;
private Date psdDeacDate;
private String psdSubCharge;
private BigDecimal psdChgValue;
private String psdActType;
private Date psdActionDate;
private Integer spcParamId;
private String spcParamName;
private String spcServiceCode;
private String spcServiceType;
private String spcLockToTariff;
private String spcLockToPack;
private String spcValueType;
private String spcExclusionRule;
private String spcLegalEntity;
private Integer spcContrPeriod;
private String spcCanTerm;
private String spcTaxInv;
private String spcParamProrata;
private String spcNodeString;



public static final int sbdSubscriberIdFilter = 0;

public static final int sbdDiallingNoFilter = 1;
private static final int sbdDiallingNoSize = 15;


public static final int sbdBillAcNoFilter = 2;
private static final int sbdBillAcNoSize = 8;


public static final int sbdConnectDateFilter = 3;

public static final int sbdDconnectDateFilter = 4;

public static final int sbdTermDateFilter = 5;

public static final int sbdTitleFilter = 6;
private static final int sbdTitleSize = 10;


public static final int sbdSurnameFilter = 7;
private static final int sbdSurnameSize = 50;


public static final int sbdFirstnameFilter = 8;
private static final int sbdFirstnameSize = 50;


public static final int sbdGenderFilter = 9;
private static final int sbdGenderSize = 1;


public static final int sbdDobFilter = 10;

public static final int sbdPasswordFilter = 11;
private static final int sbdPasswordSize = 20;


public static final int sbdLocationCodeFilter = 12;
private static final int sbdLocationCodeSize = 15;


public static final int sbdBillCycleFilter = 13;
private static final int sbdBillCycleSize = 5;


public static final int sbdPackageCodeFilter = 14;
private static final int sbdPackageCodeSize = 5;


public static final int sbdBilledUptoFilter = 15;

public static final int sbdTariffPlanFilter = 16;
private static final int sbdTariffPlanSize = 20;


public static final int pshIdFilter = 17;

public static final int pshServiceCodeFilter = 18;
private static final int pshServiceCodeSize = 4;


public static final int pshServiceTypeFilter = 19;
private static final int pshServiceTypeSize = 5;


public static final int pshSubscriberIdFilter = 20;

public static final int pshSimNoFilter = 21;
private static final int pshSimNoSize = 14;


public static final int pshMsisdnNoFilter = 22;
private static final int pshMsisdnNoSize = 15;


public static final int pshArchivedFilter = 23;
private static final int pshArchivedSize = 1;


public static final int psdSerialIdFilter = 24;


public static final int psdPshIdFilter = 25;

public static final int psdParamIdFilter = 26;

public static final int psdActDateFilter = 27;

public static final int psdTermDateFilter = 28;

public static final int psdParamValueFilter = 29;
private static final int psdParamValueSize = 20;


public static final int psdN2nStringFilter = 30;
private static final int psdN2nStringSize = 1;


public static final int psdParamActiveFilter = 31;
private static final int psdParamActiveSize = 1;


public static final int psdDeacDateFilter = 32;

public static final int psdSubChargeFilter = 33;
private static final int psdSubChargeSize = 5;


public static final int psdChgValueFilter = 34;

public static final int psdActTypeFilter = 35;
private static final int psdActTypeSize = 2;


public static final int psdActionDateFilter = 36;

public static final int spcParamIdFilter = 37;
private static final int spcParamIdSize = 258;


public static final int spcParamNameFilter = 38;
private static final int spcParamNameSize = 20;


public static final int spcServiceCodeFilter = 39;
private static final int spcServiceCodeSize = 4;


public static final int spcServiceTypeFilter = 40;
private static final int spcServiceTypeSize = 5;


public static final int spcLockToTariffFilter = 41;
private static final int spcLockToTariffSize = 1;


public static final int spcLockToPackFilter = 42;
private static final int spcLockToPackSize = 1;


public static final int spcValueTypeFilter = 43;
private static final int spcValueTypeSize = 1;


public static final int spcExclusionRuleFilter = 44;
private static final int spcExclusionRuleSize = 1;


public static final int spcLegalEntityFilter = 45;
private static final int spcLegalEntitySize = 1;


public static final int spcContrPeriodFilter = 46;

public static final int spcCanTermFilter = 47;
private static final int spcCanTermSize = 1;


public static final int spcTaxInvFilter = 48;
private static final int spcTaxInvSize = 1;


public static final int spcParamProrataFilter = 49;
private static final int spcParamProrataSize = 1;


public static final int spcNodeStringFilter = 50;
private static final int spcNodeStringSize = 1;





public SbdPshPsdSpcDQO(){};

public SbdPshPsdSpcDQO(final Integer sbdSubscriberId,
final String sbdDiallingNo,
final String sbdBillAcNo,
final Date sbdConnectDate,
final Date sbdDconnectDate,
final Date sbdTermDate,
final String sbdTitle,
final String sbdSurname,
final String sbdFirstname,
final String sbdGender,
final Date sbdDob,
final String sbdPassword,
final String sbdLocationCode,
final String sbdBillCycle,
final String sbdPackageCode,
final Date sbdBilledUpto,
final String sbdTariffPlan,
final Integer pshId,
final String pshServiceCode,
final String pshServiceType,
final Integer pshSubscriberId,
final String pshSimNo,
final String pshMsisdnNo,
final String pshArchived,
final Integer psdSerialId,
final Integer psdPshId,
final Integer psdParamId,
final Date psdActDate,
final Date psdTermDate,
final String psdParamValue,
final String psdN2nString,
final String psdParamActive,
final Date psdDeacDate,
final String psdSubCharge,
final BigDecimal psdChgValue,
final String psdActType,
final Date psdActionDate,
final Integer spcParamId,
final String spcParamName,
final String spcServiceCode,
final String spcServiceType,
final String spcLockToTariff,
final String spcLockToPack,
final String spcValueType,
final String spcExclusionRule,
final String spcLegalEntity,
final Integer spcContrPeriod,
final String spcCanTerm,
final String spcTaxInv,
final String spcParamProrata,
final String spcNodeString
){

this.sbdSubscriberId = sbdSubscriberId;
this.sbdDiallingNo = sbdDiallingNo;
this.sbdBillAcNo = sbdBillAcNo;
this.sbdConnectDate = sbdConnectDate;
this.sbdDconnectDate = sbdDconnectDate;
this.sbdTermDate = sbdTermDate;
this.sbdTitle = sbdTitle;
this.sbdSurname = sbdSurname;
this.sbdFirstname = sbdFirstname;
this.sbdGender = sbdGender;
this.sbdDob = sbdDob;
this.sbdPassword = sbdPassword;
this.sbdLocationCode = sbdLocationCode;
this.sbdBillCycle = sbdBillCycle;
this.sbdPackageCode = sbdPackageCode;
this.sbdBilledUpto = sbdBilledUpto;
this.sbdTariffPlan = sbdTariffPlan;
this.pshId = pshId;
this.pshServiceCode = pshServiceCode;
this.pshServiceType = pshServiceType;
this.pshSubscriberId = pshSubscriberId;
this.pshSimNo = pshSimNo;
this.pshMsisdnNo = pshMsisdnNo;
this.pshArchived = pshArchived;
this.psdSerialId = psdSerialId;
this.psdPshId = psdPshId;
this.psdParamId = psdParamId;
this.psdActDate = psdActDate;
this.psdTermDate = psdTermDate;
this.psdParamValue = psdParamValue;
this.psdN2nString = psdN2nString;
this.psdParamActive = psdParamActive;
this.psdDeacDate = psdDeacDate;
this.psdSubCharge = psdSubCharge;
this.psdChgValue = psdChgValue;
this.psdActType = psdActType;
this.psdActionDate = psdActionDate;
this.spcParamId = spcParamId;
this.spcParamName = spcParamName;
this.spcServiceCode = spcServiceCode;
this.spcServiceType = spcServiceType;
this.spcLockToTariff = spcLockToTariff;
this.spcLockToPack = spcLockToPack;
this.spcValueType = spcValueType;
this.spcExclusionRule = spcExclusionRule;
this.spcLegalEntity = spcLegalEntity;
this.spcContrPeriod = spcContrPeriod;
this.spcCanTerm = spcCanTerm;
this.spcTaxInv = spcTaxInv;
this.spcParamProrata = spcParamProrata;
this.spcNodeString = spcNodeString;
};


private static final int[] fieldSizes = new int[]{
0,
sbdDiallingNoSize,
sbdBillAcNoSize,
0,
0,
0,
sbdTitleSize,
sbdSurnameSize,
sbdFirstnameSize,
sbdGenderSize,
0,
sbdPasswordSize,
sbdLocationCodeSize,
sbdBillCycleSize,
sbdPackageCodeSize,
0,
sbdTariffPlanSize,
0,
pshServiceCodeSize,
pshServiceTypeSize,
0,
pshSimNoSize,
pshMsisdnNoSize,
pshArchivedSize,
0,
0,
0,
0,
0,
psdParamValueSize,
psdN2nStringSize,
psdParamActiveSize,
0,
psdSubChargeSize,
0,
psdActTypeSize,
0,
spcParamIdSize,
spcParamNameSize,
spcServiceCodeSize,
spcServiceTypeSize,
spcLockToTariffSize,
spcLockToPackSize,
spcValueTypeSize,
spcExclusionRuleSize,
spcLegalEntitySize,
0,
spcCanTermSize,
spcTaxInvSize,
spcParamProrataSize,
spcNodeStringSize
};


private static final int[] fieldTypes = new int[]{
FIELD_TYPE_INTEGER,
FIELD_TYPE_STRING,
FIELD_TYPE_STRING,
FIELD_TYPE_DATE,
FIELD_TYPE_DATE,
FIELD_TYPE_DATE,
FIELD_TYPE_STRING,
FIELD_TYPE_STRING,
FIELD_TYPE_STRING,
FIELD_TYPE_STRING,
FIELD_TYPE_DATE,
FIELD_TYPE_STRING,
FIELD_TYPE_STRING,
FIELD_TYPE_STRING,
FIELD_TYPE_STRING,
FIELD_TYPE_DATE,
FIELD_TYPE_STRING,
FIELD_TYPE_INTEGER,
FIELD_TYPE_STRING,
FIELD_TYPE_STRING,
FIELD_TYPE_INTEGER,
FIELD_TYPE_STRING,
FIELD_TYPE_STRING,
FIELD_TYPE_STRING,
FIELD_TYPE_INTEGER,
FIELD_TYPE_INTEGER,
FIELD_TYPE_INTEGER,
FIELD_TYPE_DATE,
FIELD_TYPE_DATE,
FIELD_TYPE_STRING,
FIELD_TYPE_STRING,
FIELD_TYPE_STRING,
FIELD_TYPE_DATE,
FIELD_TYPE_STRING,
FIELD_TYPE_BIGDECIMAL,
FIELD_TYPE_STRING,
FIELD_TYPE_DATE,
FIELD_TYPE_INTEGER,
FIELD_TYPE_STRING,
FIELD_TYPE_STRING,
FIELD_TYPE_STRING,
FIELD_TYPE_STRING,
FIELD_TYPE_STRING,
FIELD_TYPE_STRING,
FIELD_TYPE_STRING,
FIELD_TYPE_STRING,
FIELD_TYPE_INTEGER,
FIELD_TYPE_STRING,
FIELD_TYPE_STRING,
FIELD_TYPE_STRING,
FIELD_TYPE_STRING
};

protected void generatedKey(Integer key){}


protected Object[] get() {
		return new Object[]{this.sbdSubscriberId,
			((this.sbdDiallingNo == null) ? null : (this.sbdDiallingNo.length() <= sbdDiallingNoSize) ? this.sbdDiallingNo : this.sbdDiallingNo.substring(0, this.sbdDiallingNoSize)),
			((this.sbdBillAcNo == null) ? null : (this.sbdBillAcNo.length() <= sbdBillAcNoSize) ? this.sbdBillAcNo : this.sbdBillAcNo.substring(0, this.sbdBillAcNoSize)),
			this.sbdConnectDate,
			this.sbdDconnectDate,
			this.sbdTermDate,
			((this.sbdTitle == null) ? null : (this.sbdTitle.length() <= sbdTitleSize) ? this.sbdTitle : this.sbdTitle.substring(0, this.sbdTitleSize)),
			((this.sbdSurname == null) ? null : (this.sbdSurname.length() <= sbdSurnameSize) ? this.sbdSurname : this.sbdSurname.substring(0, this.sbdSurnameSize)),
			((this.sbdFirstname == null) ? null : (this.sbdFirstname.length() <= sbdFirstnameSize) ? this.sbdFirstname : this.sbdFirstname.substring(0, this.sbdFirstnameSize)),
			((this.sbdGender == null) ? null : (this.sbdGender.length() <= sbdGenderSize) ? this.sbdGender : this.sbdGender.substring(0, this.sbdGenderSize)),
			this.sbdDob,
			((this.sbdPassword == null) ? null : (this.sbdPassword.length() <= sbdPasswordSize) ? this.sbdPassword : this.sbdPassword.substring(0, this.sbdPasswordSize)),
			((this.sbdLocationCode == null) ? null : (this.sbdLocationCode.length() <= sbdLocationCodeSize) ? this.sbdLocationCode : this.sbdLocationCode.substring(0, this.sbdLocationCodeSize)),
			((this.sbdBillCycle == null) ? null : (this.sbdBillCycle.length() <= sbdBillCycleSize) ? this.sbdBillCycle : this.sbdBillCycle.substring(0, this.sbdBillCycleSize)),
			((this.sbdPackageCode == null) ? null : (this.sbdPackageCode.length() <= sbdPackageCodeSize) ? this.sbdPackageCode : this.sbdPackageCode.substring(0, this.sbdPackageCodeSize)),
			this.sbdBilledUpto,
			((this.sbdTariffPlan == null) ? null : (this.sbdTariffPlan.length() <= sbdTariffPlanSize) ? this.sbdTariffPlan : this.sbdTariffPlan.substring(0, this.sbdTariffPlanSize)),
			this.pshId,
			((this.pshServiceCode == null) ? null : (this.pshServiceCode.length() <= pshServiceCodeSize) ? this.pshServiceCode : this.pshServiceCode.substring(0, this.pshServiceCodeSize)),
			((this.pshServiceType == null) ? null : (this.pshServiceType.length() <= pshServiceTypeSize) ? this.pshServiceType : this.pshServiceType.substring(0, this.pshServiceTypeSize)),
			this.pshSubscriberId,
			((this.pshSimNo == null) ? null : (this.pshSimNo.length() <= pshSimNoSize) ? this.pshSimNo : this.pshSimNo.substring(0, this.pshSimNoSize)),
			((this.pshMsisdnNo == null) ? null : (this.pshMsisdnNo.length() <= pshMsisdnNoSize) ? this.pshMsisdnNo : this.pshMsisdnNo.substring(0, this.pshMsisdnNoSize)),
			((this.pshArchived == null) ? null : (this.pshArchived.length() <= pshArchivedSize) ? this.pshArchived : this.pshArchived.substring(0, this.pshArchivedSize)),
			this.psdSerialId,
			this.psdPshId,
			this.psdParamId,
			this.psdActDate,
			this.psdTermDate,
			((this.psdParamValue == null) ? null : (this.psdParamValue.length() <= psdParamValueSize) ? this.psdParamValue : this.psdParamValue.substring(0, this.psdParamValueSize)),
			((this.psdN2nString == null) ? null : (this.psdN2nString.length() <= psdN2nStringSize) ? this.psdN2nString : this.psdN2nString.substring(0, this.psdN2nStringSize)),
			((this.psdParamActive == null) ? null : (this.psdParamActive.length() <= psdParamActiveSize) ? this.psdParamActive : this.psdParamActive.substring(0, this.psdParamActiveSize)),
			this.psdDeacDate,
			((this.psdSubCharge == null) ? null : (this.psdSubCharge.length() <= psdSubChargeSize) ? this.psdSubCharge : this.psdSubCharge.substring(0, this.psdSubChargeSize)),
			this.psdChgValue,
			((this.psdActType == null) ? null : (this.psdActType.length() <= psdActTypeSize) ? this.psdActType : this.psdActType.substring(0, this.psdActTypeSize)),
			this.psdActionDate,
			this.spcParamId,
			((this.spcParamName == null) ? null : (this.spcParamName.length() <= spcParamNameSize) ? this.spcParamName : this.spcParamName.substring(0, this.spcParamNameSize)),
			((this.spcServiceCode == null) ? null : (this.spcServiceCode.length() <= spcServiceCodeSize) ? this.spcServiceCode : this.spcServiceCode.substring(0, this.spcServiceCodeSize)),
			((this.spcServiceType == null) ? null : (this.spcServiceType.length() <= spcServiceTypeSize) ? this.spcServiceType : this.spcServiceType.substring(0, this.spcServiceTypeSize)),
			((this.spcLockToTariff == null) ? null : (this.spcLockToTariff.length() <= spcLockToTariffSize) ? this.spcLockToTariff : this.spcLockToTariff.substring(0, this.spcLockToTariffSize)),
			((this.spcLockToPack == null) ? null : (this.spcLockToPack.length() <= spcLockToPackSize) ? this.spcLockToPack : this.spcLockToPack.substring(0, this.spcLockToPackSize)),
			((this.spcValueType == null) ? null : (this.spcValueType.length() <= spcValueTypeSize) ? this.spcValueType : this.spcValueType.substring(0, this.spcValueTypeSize)),
			((this.spcExclusionRule == null) ? null : (this.spcExclusionRule.length() <= spcExclusionRuleSize) ? this.spcExclusionRule : this.spcExclusionRule.substring(0, this.spcExclusionRuleSize)),
			((this.spcLegalEntity == null) ? null : (this.spcLegalEntity.length() <= spcLegalEntitySize) ? this.spcLegalEntity : this.spcLegalEntity.substring(0, this.spcLegalEntitySize)),
			this.spcContrPeriod,
			((this.spcCanTerm == null) ? null : (this.spcCanTerm.length() <= spcCanTermSize) ? this.spcCanTerm : this.spcCanTerm.substring(0, this.spcCanTermSize)),
			((this.spcTaxInv == null) ? null : (this.spcTaxInv.length() <= spcTaxInvSize) ? this.spcTaxInv : this.spcTaxInv.substring(0, this.spcTaxInvSize)),
			((this.spcParamProrata == null) ? null : (this.spcParamProrata.length() <= spcParamProrataSize) ? this.spcParamProrata : this.spcParamProrata.substring(0, this.spcParamProrataSize)),
			((this.spcNodeString == null) ? null : (this.spcNodeString.length() <= spcNodeStringSize) ? this.spcNodeString : this.spcNodeString.substring(0, this.spcNodeStringSize))
		};
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
this.sbdSubscriberId = (Integer)fields[0];
this.sbdDiallingNo = rtrim((String)fields[1]);
this.sbdBillAcNo = rtrim((String)fields[2]);
this.sbdConnectDate = ((fields[3] == null)? null : new Date(fields[3]));
this.sbdDconnectDate = ((fields[4] == null)? null : new Date(fields[4]));
this.sbdTermDate = ((fields[5] == null)? null : new Date(fields[5]));
this.sbdTitle = rtrim((String)fields[6]);
this.sbdSurname = rtrim((String)fields[7]);
this.sbdFirstname = rtrim((String)fields[8]);
this.sbdGender = rtrim((String)fields[9]);
this.sbdDob = ((fields[10] == null)? null : new Date(fields[10]));
this.sbdPassword = rtrim((String)fields[11]);
this.sbdLocationCode = rtrim((String)fields[12]);
this.sbdBillCycle = rtrim((String)fields[13]);
this.sbdPackageCode = rtrim((String)fields[14]);
this.sbdBilledUpto = ((fields[15] == null)? null : new Date(fields[15]));
this.sbdTariffPlan = rtrim((String)fields[16]);
this.pshId = (Integer)fields[17];
this.pshServiceCode = rtrim((String)fields[18]);
this.pshServiceType = rtrim((String)fields[19]);
this.pshSubscriberId = ((Integer)fields[20]);
this.pshSimNo = rtrim((String)fields[21]);
this.pshMsisdnNo = rtrim((String)fields[22]);
this.pshArchived = rtrim((String)fields[23]);
this.psdSerialId = (Integer)fields[24];
this.psdPshId = ((Integer)fields[25]);
this.psdParamId = ((Integer)fields[26]);
this.psdActDate = ((fields[27] == null)? null : new Date(fields[27]));
this.psdTermDate = ((fields[28] == null)? null : new Date(fields[28]));
this.psdParamValue = rtrim((String)fields[29]);
this.psdN2nString = rtrim((String)fields[30]);
this.psdParamActive = rtrim((String)fields[31]);
this.psdDeacDate = ((fields[32] == null)? null : new Date(fields[32]));
this.psdSubCharge = rtrim((String)fields[33]);
this.psdChgValue = ((BigDecimal)fields[34]);
this.psdActType = rtrim((String)fields[35]);
this.psdActionDate = ((fields[36] == null)? null : new Date(fields[36]));
this.spcParamId = (Integer)fields[37];
this.spcParamName = rtrim((String)fields[38]);
this.spcServiceCode = rtrim((String)fields[39]);
this.spcServiceType = rtrim((String)fields[40]);
this.spcLockToTariff = rtrim((String)fields[41]);
this.spcLockToPack = rtrim((String)fields[42]);
this.spcValueType = rtrim((String)fields[43]);
this.spcExclusionRule = rtrim((String)fields[44]);
this.spcLegalEntity = rtrim((String)fields[45]);
this.spcContrPeriod = ((Integer)fields[46]);
this.spcCanTerm = rtrim((String)fields[47]);
this.spcTaxInv = rtrim((String)fields[48]);
this.spcParamProrata = rtrim((String)fields[49]);
this.spcNodeString = rtrim((String)fields[50]);
}


public void set(
final Integer sbdSubscriberId,
final String sbdDiallingNo,
final String sbdBillAcNo,
final Date sbdConnectDate,
final Date sbdDconnectDate,
final Date sbdTermDate,
final String sbdTitle,
final String sbdSurname,
final String sbdFirstname,
final String sbdGender,
final Date sbdDob,
final String sbdPassword,
final String sbdLocationCode,
final String sbdBillCycle,
final String sbdPackageCode,
final Date sbdBilledUpto,
final String sbdTariffPlan,
final Integer pshId,
final String pshServiceCode,
final String pshServiceType,
final Integer pshSubscriberId,
final String pshSimNo,
final String pshMsisdnNo,
final String pshArchived,
final Integer psdSerialId,
final Integer psdPshId,
final Integer psdParamId,
final Date psdActDate,
final Date psdTermDate,
final String psdParamValue,
final String psdN2nString,
final String psdParamActive,
final Date psdDeacDate,
final String psdSubCharge,
final BigDecimal psdChgValue,
final String psdActType,
final Date psdActionDate,
final Integer spcParamId,
final String spcParamName,
final String spcServiceCode,
final String spcServiceType,
final String spcLockToTariff,
final String spcLockToPack,
final String spcValueType,
final String spcExclusionRule,
final String spcLegalEntity,
final Integer spcContrPeriod,
final String spcCanTerm,
final String spcTaxInv,
final String spcParamProrata,
final String spcNodeString
)
{

this.sbdSubscriberId = sbdSubscriberId;
this.sbdDiallingNo = sbdDiallingNo;
this.sbdBillAcNo = sbdBillAcNo;
this.sbdConnectDate = sbdConnectDate;
this.sbdDconnectDate = sbdDconnectDate;
this.sbdTermDate = sbdTermDate;
this.sbdTitle = sbdTitle;
this.sbdSurname = sbdSurname;
this.sbdFirstname = sbdFirstname;
this.sbdGender = sbdGender;
this.sbdDob = sbdDob;
this.sbdPassword = sbdPassword;
this.sbdLocationCode = sbdLocationCode;
this.sbdBillCycle = sbdBillCycle;
this.sbdPackageCode = sbdPackageCode;
this.sbdBilledUpto = sbdBilledUpto;
this.sbdTariffPlan = sbdTariffPlan;
this.pshId = pshId;
this.pshServiceCode = pshServiceCode;
this.pshServiceType = pshServiceType;
this.pshSubscriberId = pshSubscriberId;
this.pshSimNo = pshSimNo;
this.pshMsisdnNo = pshMsisdnNo;
this.pshArchived = pshArchived;
this.psdSerialId = psdSerialId;
this.psdPshId = psdPshId;
this.psdParamId = psdParamId;
this.psdActDate = psdActDate;
this.psdTermDate = psdTermDate;
this.psdParamValue = psdParamValue;
this.psdN2nString = psdN2nString;
this.psdParamActive = psdParamActive;
this.psdDeacDate = psdDeacDate;
this.psdSubCharge = psdSubCharge;
this.psdChgValue = psdChgValue;
this.psdActType = psdActType;
this.psdActionDate = psdActionDate;
this.spcParamId = spcParamId;
this.spcParamName = spcParamName;
this.spcServiceCode = spcServiceCode;
this.spcServiceType = spcServiceType;
this.spcLockToTariff = spcLockToTariff;
this.spcLockToPack = spcLockToPack;
this.spcValueType = spcValueType;
this.spcExclusionRule = spcExclusionRule;
this.spcLegalEntity = spcLegalEntity;
this.spcContrPeriod = spcContrPeriod;
this.spcCanTerm = spcCanTerm;
this.spcTaxInv = spcTaxInv;
this.spcParamProrata = spcParamProrata;
this.spcNodeString = spcNodeString;
}

public Integer getSbdSubscriberId() {
	return sbdSubscriberId;
}

public void setSbdSubscriberId(Integer sbdSubscriberId) {
	this.sbdSubscriberId = sbdSubscriberId;
}

public String getSbdDiallingNo() {
	return sbdDiallingNo;
}

public void setSbdDiallingNo(String sbdDiallingNo) {
	this.sbdDiallingNo = sbdDiallingNo;
}

public String getSbdBillAcNo() {
	return sbdBillAcNo;
}

public void setSbdBillAcNo(String sbdBillAcNo) {
	this.sbdBillAcNo = sbdBillAcNo;
}

public Date getSbdConnectDate() {
	return sbdConnectDate;
}

public void setSbdConnectDate(Date sbdConnectDate) {
	this.sbdConnectDate = sbdConnectDate;
}

public Date getSbdDconnectDate() {
	return sbdDconnectDate;
}

public void setSbdDconnectDate(Date sbdDconnectDate) {
	this.sbdDconnectDate = sbdDconnectDate;
}

public Date getSbdTermDate() {
	return sbdTermDate;
}

public void setSbdTermDate(Date sbdTermDate) {
	this.sbdTermDate = sbdTermDate;
}

public String getSbdTitle() {
	return sbdTitle;
}

public void setSbdTitle(String sbdTitle) {
	this.sbdTitle = sbdTitle;
}

public String getSbdSurname() {
	return sbdSurname;
}

public void setSbdSurname(String sbdSurname) {
	this.sbdSurname = sbdSurname;
}

public String getSbdFirstname() {
	return sbdFirstname;
}

public void setSbdFirstname(String sbdFirstname) {
	this.sbdFirstname = sbdFirstname;
}

public String getSbdGender() {
	return sbdGender;
}

public void setSbdGender(String sbdGender) {
	this.sbdGender = sbdGender;
}

public Date getSbdDob() {
	return sbdDob;
}

public void setSbdDob(Date sbdDob) {
	this.sbdDob = sbdDob;
}

public String getSbdPassword() {
	return sbdPassword;
}

public void setSbdPassword(String sbdPassword) {
	this.sbdPassword = sbdPassword;
}

public String getSbdLocationCode() {
	return sbdLocationCode;
}

public void setSbdLocationCode(String sbdLocationCode) {
	this.sbdLocationCode = sbdLocationCode;
}

public String getSbdBillCycle() {
	return sbdBillCycle;
}

public void setSbdBillCycle(String sbdBillCycle) {
	this.sbdBillCycle = sbdBillCycle;
}

public String getSbdPackageCode() {
	return sbdPackageCode;
}

public void setSbdPackageCode(String sbdPackageCode) {
	this.sbdPackageCode = sbdPackageCode;
}

public Date getSbdBilledUpto() {
	return sbdBilledUpto;
}

public void setSbdBilledUpto(Date sbdBilledUpto) {
	this.sbdBilledUpto = sbdBilledUpto;
}

public String getSbdTariffPlan() {
	return sbdTariffPlan;
}

public void setSbdTariffPlan(String sbdTariffPlan) {
	this.sbdTariffPlan = sbdTariffPlan;
}

public Integer getPshId() {
	return pshId;
}

public void setPshId(Integer pshId) {
	this.pshId = pshId;
}

public String getPshServiceCode() {
	return pshServiceCode;
}

public void setPshServiceCode(String pshServiceCode) {
	this.pshServiceCode = pshServiceCode;
}

public String getPshServiceType() {
	return pshServiceType;
}

public void setPshServiceType(String pshServiceType) {
	this.pshServiceType = pshServiceType;
}

public Integer getPshSubscriberId() {
	return pshSubscriberId;
}

public void setPshSubscriberId(Integer pshSubscriberId) {
	this.pshSubscriberId = pshSubscriberId;
}

public String getPshSimNo() {
	return pshSimNo;
}

public void setPshSimNo(String pshSimNo) {
	this.pshSimNo = pshSimNo;
}

public String getPshMsisdnNo() {
	return pshMsisdnNo;
}

public void setPshMsisdnNo(String pshMsisdnNo) {
	this.pshMsisdnNo = pshMsisdnNo;
}

public String getPshArchived() {
	return pshArchived;
}

public void setPshArchived(String pshArchived) {
	this.pshArchived = pshArchived;
}

public Integer getPsdSerialId() {
	return psdSerialId;
}

public void setPsdSerialId(Integer psdSerialId) {
	this.psdSerialId = psdSerialId;
}

public Integer getPsdPshId() {
	return psdPshId;
}

public void setPsdPshId(Integer psdPshId) {
	this.psdPshId = psdPshId;
}

public Integer getPsdParamId() {
	return psdParamId;
}

public void setPsdParamId(Integer psdParamId) {
	this.psdParamId = psdParamId;
}

public Date getPsdActDate() {
	return psdActDate;
}

public void setPsdActDate(Date psdActDate) {
	this.psdActDate = psdActDate;
}

public Date getPsdTermDate() {
	return psdTermDate;
}

public void setPsdTermDate(Date psdTermDate) {
	this.psdTermDate = psdTermDate;
}

public String getPsdParamValue() {
	return psdParamValue;
}

public void setPsdParamValue(String psdParamValue) {
	this.psdParamValue = psdParamValue;
}

public String getPsdN2nString() {
	return psdN2nString;
}

public void setPsdN2nString(String psdN2nString) {
	this.psdN2nString = psdN2nString;
}

public String getPsdParamActive() {
	return psdParamActive;
}

public void setPsdParamActive(String psdParamActive) {
	this.psdParamActive = psdParamActive;
}

public Date getPsdDeacDate() {
	return psdDeacDate;
}

public void setPsdDeacDate(Date psdDeacDate) {
	this.psdDeacDate = psdDeacDate;
}

public String getPsdSubCharge() {
	return psdSubCharge;
}

public void setPsdSubCharge(String psdSubCharge) {
	this.psdSubCharge = psdSubCharge;
}

public BigDecimal getPsdChgValue() {
	return psdChgValue;
}

public void setPsdChgValue(BigDecimal psdChgValue) {
	this.psdChgValue = psdChgValue;
}

public String getPsdActType() {
	return psdActType;
}

public void setPsdActType(String psdActType) {
	this.psdActType = psdActType;
}

public Date getPsdActionDate() {
	return psdActionDate;
}

public void setPsdActionDate(Date psdActionDate) {
	this.psdActionDate = psdActionDate;
}

public Integer getSpcParamId() {
	return spcParamId;
}

public void setSpcParamId(Integer spcParamId) {
	this.spcParamId = spcParamId;
}

public String getSpcParamName() {
	return spcParamName;
}

public void setSpcParamName(String spcParamName) {
	this.spcParamName = spcParamName;
}

public String getSpcServiceCode() {
	return spcServiceCode;
}

public void setSpcServiceCode(String spcServiceCode) {
	this.spcServiceCode = spcServiceCode;
}

public String getSpcServiceType() {
	return spcServiceType;
}

public void setSpcServiceType(String spcServiceType) {
	this.spcServiceType = spcServiceType;
}

public String getSpcLockToTariff() {
	return spcLockToTariff;
}

public void setSpcLockToTariff(String spcLockToTariff) {
	this.spcLockToTariff = spcLockToTariff;
}

public String getSpcLockToPack() {
	return spcLockToPack;
}

public void setSpcLockToPack(String spcLockToPack) {
	this.spcLockToPack = spcLockToPack;
}

public String getSpcValueType() {
	return spcValueType;
}

public void setSpcValueType(String spcValueType) {
	this.spcValueType = spcValueType;
}

public String getSpcExclusionRule() {
	return spcExclusionRule;
}

public void setSpcExclusionRule(String spcExclusionRule) {
	this.spcExclusionRule = spcExclusionRule;
}

public String getSpcLegalEntity() {
	return spcLegalEntity;
}

public void setSpcLegalEntity(String spcLegalEntity) {
	this.spcLegalEntity = spcLegalEntity;
}

public Integer getSpcContrPeriod() {
	return spcContrPeriod;
}

public void setSpcContrPeriod(Integer spcContrPeriod) {
	this.spcContrPeriod = spcContrPeriod;
}

public String getSpcCanTerm() {
	return spcCanTerm;
}

public void setSpcCanTerm(String spcCanTerm) {
	this.spcCanTerm = spcCanTerm;
}

public String getSpcTaxInv() {
	return spcTaxInv;
}

public void setSpcTaxInv(String spcTaxInv) {
	this.spcTaxInv = spcTaxInv;
}

public String getSpcParamProrata() {
	return spcParamProrata;
}

public void setSpcParamProrata(String spcParamProrata) {
	this.spcParamProrata = spcParamProrata;
}

public String getSpcNodeString() {
	return spcNodeString;
}

public void setSpcNodeString(String spcNodeString) {
	this.spcNodeString = spcNodeString;
}

}
