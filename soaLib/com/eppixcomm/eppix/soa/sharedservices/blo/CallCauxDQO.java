package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;
import com.eppixcomm.eppix.common.util.Date;

public class CallCauxDQO extends DBO implements Serializable {

	private Integer caSerial;
	private Integer caSubscriptionId;
	private String caDiallingNo;
	private Date caCallDate;
	private Date caCallTime;
	private Integer caCallDuration;
	private String caNoDialled;
	private Double caCallCharge;
	private Double caNetworkCharge;
	private String caNetChargeType;
	private String caUsageTypeRef;
	private String caUsageRegnRef;
	private String caChargeRef;
	private String caInvoiceNo;
	private String caDisputeCode;
	private Integer caClassId;
	private Integer caBillDuration;
	private Double caOrigCharge;
	private String caDiscountId;
	private String caSubscriberLoc;
	private String caOrigLocText;
	private String caServiceId;
	private String caTariff;
	private String caPrefixType;
	private String caPrefix;
	private String caRoaming;
	private String caRoamingNetwkid;
	private Integer caFileId;
	private Integer caProcRunNum;
	private Integer cauxCallSerial;
	private String cauxImei;
	private Integer cauxCallSeq;
	private String cauxOnNetFlg;
	private String cauxPeakOffpeak;
	private String cauxIncomeOutgo;
	private String cauxTypePrcpln;
	private Double cauxDataVolume;
	private String cauxCharAnal1;
	private String cauxCharAnal2;
	private String cauxCharAnal3;
	private String cauxCharAnal4;
	private String cauxCharAnal5;
	private Double cauxFloatAnal1;
	private Double cauxFloatAnal2;
	private Double cauxFloatAnal3;
	private Integer cauxIntAnal1;
	private Integer cauxIntAnal2;
	private Integer cauxIntAnal3;

	public static final int caSerialFilter = 0;

	public static final int caSubscriptionIdFilter = 1;

	public static final int caDiallingNoFilter = 2;
	private static final int caDiallingNoSize = 20;

	public static final int caCallDateFilter = 3;

	public static final int caCallTimeFilter = 4;

	public static final int caCallDurationFilter = 5;

	public static final int caNoDialledFilter = 6;
	private static final int caNoDialledSize = 40;

	public static final int caCallChargeFilter = 7;

	public static final int caNetworkChargeFilter = 8;

	public static final int caNetChargeTypeFilter = 9;
	private static final int caNetChargeTypeSize = 1;

	public static final int caUsageTypeRefFilter = 10;
	private static final int caUsageTypeRefSize = 3;

	public static final int caUsageRegnRefFilter = 11;
	private static final int caUsageRegnRefSize = 3;

	public static final int caChargeRefFilter = 12;
	private static final int caChargeRefSize = 3;

	public static final int caInvoiceNoFilter = 13;
	private static final int caInvoiceNoSize = 10;

	public static final int caDisputeCodeFilter = 14;
	private static final int caDisputeCodeSize = 4;

	public static final int caClassIdFilter = 15;

	public static final int caBillDurationFilter = 16;

	public static final int caOrigChargeFilter = 17;

	public static final int caDiscountIdFilter = 18;
	private static final int caDiscountIdSize = 10;

	public static final int caSubscriberLocFilter = 19;
	private static final int caSubscriberLocSize = 18;

	public static final int caOrigLocTextFilter = 20;
	private static final int caOrigLocTextSize = 35;

	public static final int caServiceIdFilter = 21;
	private static final int caServiceIdSize = 3;

	public static final int caTariffFilter = 22;
	private static final int caTariffSize = 3;

	public static final int caPrefixTypeFilter = 23;
	private static final int caPrefixTypeSize = 1;

	public static final int caPrefixFilter = 24;
	private static final int caPrefixSize = 20;

	public static final int caRoamingFilter = 25;
	private static final int caRoamingSize = 1;

	public static final int caRoamingNetwkidFilter = 26;
	private static final int caRoamingNetwkidSize = 5;

	public static final int caFileIdFilter = 27;

	public static final int caProcRunNumFilter = 28;

	public static final int cauxCallSerialFilter = 29;

	public static final int cauxImeiFilter = 30;
	private static final int cauxImeiSize = 20;

	public static final int cauxCallSeqFilter = 31;

	public static final int cauxOnNetFlgFilter = 32;
	private static final int cauxOnNetFlgSize = 30;

	public static final int cauxPeakOffpeakFilter = 33;
	private static final int cauxPeakOffpeakSize = 30;

	public static final int cauxIncomeOutgoFilter = 34;
	private static final int cauxIncomeOutgoSize = 1;

	public static final int cauxTypePrcplnFilter = 35;
	private static final int cauxTypePrcplnSize = 30;

	public static final int cauxDataVolumeFilter = 36;

	public static final int cauxCharAnal1Filter = 37;
	private static final int cauxCharAnal1Size = 30;

	public static final int cauxCharAnal2Filter = 38;
	private static final int cauxCharAnal2Size = 30;

	public static final int cauxCharAnal3Filter = 39;
	private static final int cauxCharAnal3Size = 30;

	public static final int cauxCharAnal4Filter = 40;
	private static final int cauxCharAnal4Size = 30;

	public static final int cauxCharAnal5Filter = 41;
	private static final int cauxCharAnal5Size = 30;

	public static final int cauxFloatAnal1Filter = 42;

	public static final int cauxFloatAnal2Filter = 43;

	public static final int cauxFloatAnal3Filter = 44;

	public static final int cauxIntAnal1Filter = 45;

	public static final int cauxIntAnal2Filter = 46;

	public static final int cauxIntAnal3Filter = 47;

	public CallCauxDQO() {
	};

	public CallCauxDQO(final Integer caSerial, final Integer caSubscriptionId,
			final String caDiallingNo, final Date caCallDate,
			final Date caCallTime, final Integer caCallDuration,
			final String caNoDialled, final Double caCallCharge,
			final Double caNetworkCharge, final String caNetChargeType,
			final String caUsageTypeRef, final String caUsageRegnRef,
			final String caChargeRef, final String caInvoiceNo,
			final String caDisputeCode, final Integer caClassId,
			final Integer caBillDuration, final Double caOrigCharge,
			final String caDiscountId, final String caSubscriberLoc,
			final String caOrigLocText, final String caServiceId,
			final String caTariff, final String caPrefixType,
			final String caPrefix, final String caRoaming,
			final String caRoamingNetwkid, final Integer caFileId,
			final Integer caProcRunNum, final Integer cauxCallSerial,
			final String cauxImei, final Integer cauxCallSeq,
			final String cauxOnNetFlg, final String cauxPeakOffpeak,
			final String cauxIncomeOutgo, final String cauxTypePrcpln,
			final Double cauxDataVolume, final String cauxCharAnal1,
			final String cauxCharAnal2, final String cauxCharAnal3,
			final String cauxCharAnal4, final String cauxCharAnal5,
			final Double cauxFloatAnal1, final Double cauxFloatAnal2,
			final Double cauxFloatAnal3, final Integer cauxIntAnal1,
			final Integer cauxIntAnal2, final Integer cauxIntAnal3) {

		this.caSerial = caSerial;
		this.caSubscriptionId = caSubscriptionId;
		this.caDiallingNo = caDiallingNo;
		this.caCallDate = caCallDate;
		this.caCallTime = caCallTime;
		this.caCallDuration = caCallDuration;
		this.caNoDialled = caNoDialled;
		this.caCallCharge = caCallCharge;
		this.caNetworkCharge = caNetworkCharge;
		this.caNetChargeType = caNetChargeType;
		this.caUsageTypeRef = caUsageTypeRef;
		this.caUsageRegnRef = caUsageRegnRef;
		this.caChargeRef = caChargeRef;
		this.caInvoiceNo = caInvoiceNo;
		this.caDisputeCode = caDisputeCode;
		this.caClassId = caClassId;
		this.caBillDuration = caBillDuration;
		this.caOrigCharge = caOrigCharge;
		this.caDiscountId = caDiscountId;
		this.caSubscriberLoc = caSubscriberLoc;
		this.caOrigLocText = caOrigLocText;
		this.caServiceId = caServiceId;
		this.caTariff = caTariff;
		this.caPrefixType = caPrefixType;
		this.caPrefix = caPrefix;
		this.caRoaming = caRoaming;
		this.caRoamingNetwkid = caRoamingNetwkid;
		this.caFileId = caFileId;
		this.caProcRunNum = caProcRunNum;
		this.cauxCallSerial = cauxCallSerial;
		this.cauxImei = cauxImei;
		this.cauxCallSeq = cauxCallSeq;
		this.cauxOnNetFlg = cauxOnNetFlg;
		this.cauxPeakOffpeak = cauxPeakOffpeak;
		this.cauxIncomeOutgo = cauxIncomeOutgo;
		this.cauxTypePrcpln = cauxTypePrcpln;
		this.cauxDataVolume = cauxDataVolume;
		this.cauxCharAnal1 = cauxCharAnal1;
		this.cauxCharAnal2 = cauxCharAnal2;
		this.cauxCharAnal3 = cauxCharAnal3;
		this.cauxCharAnal4 = cauxCharAnal4;
		this.cauxCharAnal5 = cauxCharAnal5;
		this.cauxFloatAnal1 = cauxFloatAnal1;
		this.cauxFloatAnal2 = cauxFloatAnal2;
		this.cauxFloatAnal3 = cauxFloatAnal3;
		this.cauxIntAnal1 = cauxIntAnal1;
		this.cauxIntAnal2 = cauxIntAnal2;
		this.cauxIntAnal3 = cauxIntAnal3;
	};

	private static final int[] fieldSizes = new int[] { 0, 0, caDiallingNoSize,
			0, 0, 0, caNoDialledSize, 0, 0, caNetChargeTypeSize,
			caUsageTypeRefSize, caUsageRegnRefSize, caChargeRefSize,
			caInvoiceNoSize, caDisputeCodeSize, 0, 0, 0, caDiscountIdSize,
			caSubscriberLocSize, caOrigLocTextSize, caServiceIdSize,
			caTariffSize, caPrefixTypeSize, caPrefixSize, caRoamingSize,
			caRoamingNetwkidSize, 0, 0, 0, cauxImeiSize, 0, cauxOnNetFlgSize,
			cauxPeakOffpeakSize, cauxIncomeOutgoSize, cauxTypePrcplnSize, 0,
			cauxCharAnal1Size, cauxCharAnal2Size, cauxCharAnal3Size,
			cauxCharAnal4Size, cauxCharAnal5Size, 0, 0, 0, 0, 0, 0 };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_INTEGER,
			FIELD_TYPE_INTEGER, FIELD_TYPE_STRING, FIELD_TYPE_DATE,
			FIELD_TYPE_DATE, FIELD_TYPE_INTEGER, FIELD_TYPE_STRING,
			FIELD_TYPE_FLOAT, FIELD_TYPE_FLOAT, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_INTEGER,
			FIELD_TYPE_INTEGER, FIELD_TYPE_FLOAT, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_INTEGER,
			FIELD_TYPE_INTEGER, FIELD_TYPE_INTEGER, FIELD_TYPE_STRING,
			FIELD_TYPE_INTEGER, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_DOUBLE,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_FLOAT,
			FIELD_TYPE_FLOAT, FIELD_TYPE_FLOAT, FIELD_TYPE_INTEGER,
			FIELD_TYPE_INTEGER, FIELD_TYPE_INTEGER };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] {
				this.caSerial,
				this.caSubscriptionId,
				((this.caDiallingNo == null) ? null : (this.caDiallingNo
						.length() <= caDiallingNoSize) ? this.caDiallingNo
						: this.caDiallingNo.substring(0, this.caDiallingNoSize)),
				this.caCallDate,
				this.caCallTime,
				this.caCallDuration,
				((this.caNoDialled == null) ? null
						: (this.caNoDialled.length() <= caNoDialledSize) ? this.caNoDialled
								: this.caNoDialled.substring(0,
										this.caNoDialledSize)),
				this.caCallCharge,
				this.caNetworkCharge,
				((this.caNetChargeType == null) ? null
						: (this.caNetChargeType.length() <= caNetChargeTypeSize) ? this.caNetChargeType
								: this.caNetChargeType.substring(0,
										this.caNetChargeTypeSize)),
				((this.caUsageTypeRef == null) ? null : (this.caUsageTypeRef
						.length() <= caUsageTypeRefSize) ? this.caUsageTypeRef
						: this.caUsageTypeRef.substring(0,
								this.caUsageTypeRefSize)),
				((this.caUsageRegnRef == null) ? null : (this.caUsageRegnRef
						.length() <= caUsageRegnRefSize) ? this.caUsageRegnRef
						: this.caUsageRegnRef.substring(0,
								this.caUsageRegnRefSize)),
				((this.caChargeRef == null) ? null
						: (this.caChargeRef.length() <= caChargeRefSize) ? this.caChargeRef
								: this.caChargeRef.substring(0,
										this.caChargeRefSize)),
				((this.caInvoiceNo == null) ? null
						: (this.caInvoiceNo.length() <= caInvoiceNoSize) ? this.caInvoiceNo
								: this.caInvoiceNo.substring(0,
										this.caInvoiceNoSize)),
				((this.caDisputeCode == null) ? null : (this.caDisputeCode
						.length() <= caDisputeCodeSize) ? this.caDisputeCode
						: this.caDisputeCode.substring(0,
								this.caDisputeCodeSize)),
				this.caClassId,
				this.caBillDuration,
				this.caOrigCharge,
				((this.caDiscountId == null) ? null : (this.caDiscountId
						.length() <= caDiscountIdSize) ? this.caDiscountId
						: this.caDiscountId.substring(0, this.caDiscountIdSize)),
				((this.caSubscriberLoc == null) ? null
						: (this.caSubscriberLoc.length() <= caSubscriberLocSize) ? this.caSubscriberLoc
								: this.caSubscriberLoc.substring(0,
										this.caSubscriberLocSize)),
				((this.caOrigLocText == null) ? null : (this.caOrigLocText
						.length() <= caOrigLocTextSize) ? this.caOrigLocText
						: this.caOrigLocText.substring(0,
								this.caOrigLocTextSize)),
				((this.caServiceId == null) ? null
						: (this.caServiceId.length() <= caServiceIdSize) ? this.caServiceId
								: this.caServiceId.substring(0,
										this.caServiceIdSize)),
				((this.caTariff == null) ? null
						: (this.caTariff.length() <= caTariffSize) ? this.caTariff
								: this.caTariff.substring(0, this.caTariffSize)),
				((this.caPrefixType == null) ? null : (this.caPrefixType
						.length() <= caPrefixTypeSize) ? this.caPrefixType
						: this.caPrefixType.substring(0, this.caPrefixTypeSize)),
				((this.caPrefix == null) ? null
						: (this.caPrefix.length() <= caPrefixSize) ? this.caPrefix
								: this.caPrefix.substring(0, this.caPrefixSize)),
				((this.caRoaming == null) ? null
						: (this.caRoaming.length() <= caRoamingSize) ? this.caRoaming
								: this.caRoaming.substring(0,
										this.caRoamingSize)),
				((this.caRoamingNetwkid == null) ? null
						: (this.caRoamingNetwkid.length() <= caRoamingNetwkidSize) ? this.caRoamingNetwkid
								: this.caRoamingNetwkid.substring(0,
										this.caRoamingNetwkidSize)),
				this.caFileId,
				this.caProcRunNum,
				this.cauxCallSerial,
				((this.cauxImei == null) ? null
						: (this.cauxImei.length() <= cauxImeiSize) ? this.cauxImei
								: this.cauxImei.substring(0, this.cauxImeiSize)),
				this.cauxCallSeq,
				((this.cauxOnNetFlg == null) ? null : (this.cauxOnNetFlg
						.length() <= cauxOnNetFlgSize) ? this.cauxOnNetFlg
						: this.cauxOnNetFlg.substring(0, this.cauxOnNetFlgSize)),
				((this.cauxPeakOffpeak == null) ? null
						: (this.cauxPeakOffpeak.length() <= cauxPeakOffpeakSize) ? this.cauxPeakOffpeak
								: this.cauxPeakOffpeak.substring(0,
										this.cauxPeakOffpeakSize)),
				((this.cauxIncomeOutgo == null) ? null
						: (this.cauxIncomeOutgo.length() <= cauxIncomeOutgoSize) ? this.cauxIncomeOutgo
								: this.cauxIncomeOutgo.substring(0,
										this.cauxIncomeOutgoSize)),
				((this.cauxTypePrcpln == null) ? null : (this.cauxTypePrcpln
						.length() <= cauxTypePrcplnSize) ? this.cauxTypePrcpln
						: this.cauxTypePrcpln.substring(0,
								this.cauxTypePrcplnSize)),
				this.cauxDataVolume,
				((this.cauxCharAnal1 == null) ? null : (this.cauxCharAnal1
						.length() <= cauxCharAnal1Size) ? this.cauxCharAnal1
						: this.cauxCharAnal1.substring(0,
								this.cauxCharAnal1Size)),
				((this.cauxCharAnal2 == null) ? null : (this.cauxCharAnal2
						.length() <= cauxCharAnal2Size) ? this.cauxCharAnal2
						: this.cauxCharAnal2.substring(0,
								this.cauxCharAnal2Size)),
				((this.cauxCharAnal3 == null) ? null : (this.cauxCharAnal3
						.length() <= cauxCharAnal3Size) ? this.cauxCharAnal3
						: this.cauxCharAnal3.substring(0,
								this.cauxCharAnal3Size)),
				((this.cauxCharAnal4 == null) ? null : (this.cauxCharAnal4
						.length() <= cauxCharAnal4Size) ? this.cauxCharAnal4
						: this.cauxCharAnal4.substring(0,
								this.cauxCharAnal4Size)),
				((this.cauxCharAnal5 == null) ? null : (this.cauxCharAnal5
						.length() <= cauxCharAnal5Size) ? this.cauxCharAnal5
						: this.cauxCharAnal5.substring(0,
								this.cauxCharAnal5Size)), this.cauxFloatAnal1,
				this.cauxFloatAnal2, this.cauxFloatAnal3, this.cauxIntAnal1,
				this.cauxIntAnal2, this.cauxIntAnal3 };
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
		this.caSerial = ((Integer) fields[0]);
		this.caSubscriptionId = ((Integer) fields[1]);
		this.caDiallingNo = rtrim((String) fields[2]);
		this.caCallDate = ((fields[3] == null) ? null : new Date(
				 fields[3]));
		this.caCallTime = ((fields[4] == null) ? null : new Date(
				 fields[4]));
		this.caCallDuration = ((Integer) fields[5]);
		this.caNoDialled = rtrim((String) fields[6]);
		this.caCallCharge = ((Double) fields[7]);
		this.caNetworkCharge = ((Double) fields[8]);
		this.caNetChargeType = rtrim((String) fields[9]);
		this.caUsageTypeRef = rtrim((String) fields[10]);
		this.caUsageRegnRef = rtrim((String) fields[11]);
		this.caChargeRef = rtrim((String) fields[12]);
		this.caInvoiceNo = rtrim((String) fields[13]);
		this.caDisputeCode = rtrim((String) fields[14]);
		this.caClassId = ((Integer) fields[15]);
		this.caBillDuration = ((Integer) fields[16]);
		this.caOrigCharge = ((Double) fields[17]);
		this.caDiscountId = rtrim((String) fields[18]);
		this.caSubscriberLoc = rtrim((String) fields[19]);
		this.caOrigLocText = rtrim((String) fields[20]);
		this.caServiceId = rtrim((String) fields[21]);
		this.caTariff = rtrim((String) fields[22]);
		this.caPrefixType = rtrim((String) fields[23]);
		this.caPrefix = rtrim((String) fields[24]);
		this.caRoaming = rtrim((String) fields[25]);
		this.caRoamingNetwkid = rtrim((String) fields[26]);
		this.caFileId = ((Integer) fields[27]);
		this.caProcRunNum = ((Integer) fields[28]);
		this.cauxCallSerial = ((Integer) fields[29]);
		this.cauxImei = rtrim((String) fields[30]);
		this.cauxCallSeq = ((Integer) fields[31]);
		this.cauxOnNetFlg = rtrim((String) fields[32]);
		this.cauxPeakOffpeak = rtrim((String) fields[33]);
		this.cauxIncomeOutgo = rtrim((String) fields[34]);
		this.cauxTypePrcpln = rtrim((String) fields[35]);
		this.cauxDataVolume = ((Double) fields[36]);
		this.cauxCharAnal1 = rtrim((String) fields[37]);
		this.cauxCharAnal2 = rtrim((String) fields[38]);
		this.cauxCharAnal3 = rtrim((String) fields[39]);
		this.cauxCharAnal4 = rtrim((String) fields[40]);
		this.cauxCharAnal5 = rtrim((String) fields[41]);
		this.cauxFloatAnal1 = ((Double) fields[42]);
		this.cauxFloatAnal2 = ((Double) fields[43]);
		this.cauxFloatAnal3 = ((Double) fields[44]);
		this.cauxIntAnal1 = ((Integer) fields[45]);
		this.cauxIntAnal2 = ((Integer) fields[46]);
		this.cauxIntAnal3 = ((Integer) fields[47]);
	}

	public void set(final Integer caSerial, final Integer caSubscriptionId,
			final String caDiallingNo, final Date caCallDate,
			final Date caCallTime, final Integer caCallDuration,
			final String caNoDialled, final Double caCallCharge,
			final Double caNetworkCharge, final String caNetChargeType,
			final String caUsageTypeRef, final String caUsageRegnRef,
			final String caChargeRef, final String caInvoiceNo,
			final String caDisputeCode, final Integer caClassId,
			final Integer caBillDuration, final Double caOrigCharge,
			final String caDiscountId, final String caSubscriberLoc,
			final String caOrigLocText, final String caServiceId,
			final String caTariff, final String caPrefixType,
			final String caPrefix, final String caRoaming,
			final String caRoamingNetwkid, final Integer caFileId,
			final Integer caProcRunNum, final Integer cauxCallSerial,
			final String cauxImei, final Integer cauxCallSeq,
			final String cauxOnNetFlg, final String cauxPeakOffpeak,
			final String cauxIncomeOutgo, final String cauxTypePrcpln,
			final Double cauxDataVolume, final String cauxCharAnal1,
			final String cauxCharAnal2, final String cauxCharAnal3,
			final String cauxCharAnal4, final String cauxCharAnal5,
			final Double cauxFloatAnal1, final Double cauxFloatAnal2,
			final Double cauxFloatAnal3, final Integer cauxIntAnal1,
			final Integer cauxIntAnal2, final Integer cauxIntAnal3) {

		this.caSerial = caSerial;
		this.caSubscriptionId = caSubscriptionId;
		this.caDiallingNo = caDiallingNo;
		this.caCallDate = caCallDate;
		this.caCallTime = caCallTime;
		this.caCallDuration = caCallDuration;
		this.caNoDialled = caNoDialled;
		this.caCallCharge = caCallCharge;
		this.caNetworkCharge = caNetworkCharge;
		this.caNetChargeType = caNetChargeType;
		this.caUsageTypeRef = caUsageTypeRef;
		this.caUsageRegnRef = caUsageRegnRef;
		this.caChargeRef = caChargeRef;
		this.caInvoiceNo = caInvoiceNo;
		this.caDisputeCode = caDisputeCode;
		this.caClassId = caClassId;
		this.caBillDuration = caBillDuration;
		this.caOrigCharge = caOrigCharge;
		this.caDiscountId = caDiscountId;
		this.caSubscriberLoc = caSubscriberLoc;
		this.caOrigLocText = caOrigLocText;
		this.caServiceId = caServiceId;
		this.caTariff = caTariff;
		this.caPrefixType = caPrefixType;
		this.caPrefix = caPrefix;
		this.caRoaming = caRoaming;
		this.caRoamingNetwkid = caRoamingNetwkid;
		this.caFileId = caFileId;
		this.caProcRunNum = caProcRunNum;
		this.cauxCallSerial = cauxCallSerial;
		this.cauxImei = cauxImei;
		this.cauxCallSeq = cauxCallSeq;
		this.cauxOnNetFlg = cauxOnNetFlg;
		this.cauxPeakOffpeak = cauxPeakOffpeak;
		this.cauxIncomeOutgo = cauxIncomeOutgo;
		this.cauxTypePrcpln = cauxTypePrcpln;
		this.cauxDataVolume = cauxDataVolume;
		this.cauxCharAnal1 = cauxCharAnal1;
		this.cauxCharAnal2 = cauxCharAnal2;
		this.cauxCharAnal3 = cauxCharAnal3;
		this.cauxCharAnal4 = cauxCharAnal4;
		this.cauxCharAnal5 = cauxCharAnal5;
		this.cauxFloatAnal1 = cauxFloatAnal1;
		this.cauxFloatAnal2 = cauxFloatAnal2;
		this.cauxFloatAnal3 = cauxFloatAnal3;
		this.cauxIntAnal1 = cauxIntAnal1;
		this.cauxIntAnal2 = cauxIntAnal2;
		this.cauxIntAnal3 = cauxIntAnal3;
	}

	public Integer getCaSerial() {
		return caSerial;
	}

	public void setCaSerial(Integer caSerial) {
		this.caSerial = caSerial;
	}

	public Integer getCaSubscriptionId() {
		return caSubscriptionId;
	}

	public void setCaSubscriptionId(Integer caSubscriptionId) {
		this.caSubscriptionId = caSubscriptionId;
	}

	public String getCaDiallingNo() {
		return caDiallingNo;
	}

	public void setCaDiallingNo(String caDiallingNo) {
		this.caDiallingNo = caDiallingNo;
	}

	public Date getCaCallDate() {
		return caCallDate;
	}

	public void setCaCallDate(Date caCallDate) {
		this.caCallDate = caCallDate;
	}

	public Date getCaCallTime() {
		return caCallTime;
	}

	public void setCaCallTime(Date caCallTime) {
		this.caCallTime = caCallTime;
	}

	public Integer getCaCallDuration() {
		return caCallDuration;
	}

	public void setCaCallDuration(Integer caCallDuration) {
		this.caCallDuration = caCallDuration;
	}

	public String getCaNoDialled() {
		return caNoDialled;
	}

	public void setCaNoDialled(String caNoDialled) {
		this.caNoDialled = caNoDialled;
	}

	public Double getCaCallCharge() {
		return caCallCharge;
	}

	public void setCaCallCharge(Double caCallCharge) {
		this.caCallCharge = caCallCharge;
	}

	public Double getCaNetworkCharge() {
		return caNetworkCharge;
	}

	public void setCaNetworkCharge(Double caNetworkCharge) {
		this.caNetworkCharge = caNetworkCharge;
	}

	public String getCaNetChargeType() {
		return caNetChargeType;
	}

	public void setCaNetChargeType(String caNetChargeType) {
		this.caNetChargeType = caNetChargeType;
	}

	public String getCaUsageTypeRef() {
		return caUsageTypeRef;
	}

	public void setCaUsageTypeRef(String caUsageTypeRef) {
		this.caUsageTypeRef = caUsageTypeRef;
	}

	public String getCaUsageRegnRef() {
		return caUsageRegnRef;
	}

	public void setCaUsageRegnRef(String caUsageRegnRef) {
		this.caUsageRegnRef = caUsageRegnRef;
	}

	public String getCaChargeRef() {
		return caChargeRef;
	}

	public void setCaChargeRef(String caChargeRef) {
		this.caChargeRef = caChargeRef;
	}

	public String getCaInvoiceNo() {
		return caInvoiceNo;
	}

	public void setCaInvoiceNo(String caInvoiceNo) {
		this.caInvoiceNo = caInvoiceNo;
	}

	public String getCaDisputeCode() {
		return caDisputeCode;
	}

	public void setCaDisputeCode(String caDisputeCode) {
		this.caDisputeCode = caDisputeCode;
	}

	public Integer getCaClassId() {
		return caClassId;
	}

	public void setCaClassId(Integer caClassId) {
		this.caClassId = caClassId;
	}

	public Integer getCaBillDuration() {
		return caBillDuration;
	}

	public void setCaBillDuration(Integer caBillDuration) {
		this.caBillDuration = caBillDuration;
	}

	public Double getCaOrigCharge() {
		return caOrigCharge;
	}

	public void setCaOrigCharge(Double caOrigCharge) {
		this.caOrigCharge = caOrigCharge;
	}

	public String getCaDiscountId() {
		return caDiscountId;
	}

	public void setCaDiscountId(String caDiscountId) {
		this.caDiscountId = caDiscountId;
	}

	public String getCaSubscriberLoc() {
		return caSubscriberLoc;
	}

	public void setCaSubscriberLoc(String caSubscriberLoc) {
		this.caSubscriberLoc = caSubscriberLoc;
	}

	public String getCaOrigLocText() {
		return caOrigLocText;
	}

	public void setCaOrigLocText(String caOrigLocText) {
		this.caOrigLocText = caOrigLocText;
	}

	public String getCaServiceId() {
		return caServiceId;
	}

	public void setCaServiceId(String caServiceId) {
		this.caServiceId = caServiceId;
	}

	public String getCaTariff() {
		return caTariff;
	}

	public void setCaTariff(String caTariff) {
		this.caTariff = caTariff;
	}

	public String getCaPrefixType() {
		return caPrefixType;
	}

	public void setCaPrefixType(String caPrefixType) {
		this.caPrefixType = caPrefixType;
	}

	public String getCaPrefix() {
		return caPrefix;
	}

	public void setCaPrefix(String caPrefix) {
		this.caPrefix = caPrefix;
	}

	public String getCaRoaming() {
		return caRoaming;
	}

	public void setCaRoaming(String caRoaming) {
		this.caRoaming = caRoaming;
	}

	public String getCaRoamingNetwkid() {
		return caRoamingNetwkid;
	}

	public void setCaRoamingNetwkid(String caRoamingNetwkid) {
		this.caRoamingNetwkid = caRoamingNetwkid;
	}

	public Integer getCaFileId() {
		return caFileId;
	}

	public void setCaFileId(Integer caFileId) {
		this.caFileId = caFileId;
	}

	public Integer getCaProcRunNum() {
		return caProcRunNum;
	}

	public void setCaProcRunNum(Integer caProcRunNum) {
		this.caProcRunNum = caProcRunNum;
	}

	public Integer getCauxCallSerial() {
		return cauxCallSerial;
	}

	public void setCauxCallSerial(Integer cauxCallSerial) {
		this.cauxCallSerial = cauxCallSerial;
	}

	public String getCauxImei() {
		return cauxImei;
	}

	public void setCauxImei(String cauxImei) {
		this.cauxImei = cauxImei;
	}

	public Integer getCauxCallSeq() {
		return cauxCallSeq;
	}

	public void setCauxCallSeq(Integer cauxCallSeq) {
		this.cauxCallSeq = cauxCallSeq;
	}

	public String getCauxOnNetFlg() {
		return cauxOnNetFlg;
	}

	public void setCauxOnNetFlg(String cauxOnNetFlg) {
		this.cauxOnNetFlg = cauxOnNetFlg;
	}

	public String getCauxPeakOffpeak() {
		return cauxPeakOffpeak;
	}

	public void setCauxPeakOffpeak(String cauxPeakOffpeak) {
		this.cauxPeakOffpeak = cauxPeakOffpeak;
	}

	public String getCauxIncomeOutgo() {
		return cauxIncomeOutgo;
	}

	public void setCauxIncomeOutgo(String cauxIncomeOutgo) {
		this.cauxIncomeOutgo = cauxIncomeOutgo;
	}

	public String getCauxTypePrcpln() {
		return cauxTypePrcpln;
	}

	public void setCauxTypePrcpln(String cauxTypePrcpln) {
		this.cauxTypePrcpln = cauxTypePrcpln;
	}

	public Double getCauxDataVolume() {
		return cauxDataVolume;
	}

	public void setCauxDataVolume(Double cauxDataVolume) {
		this.cauxDataVolume = cauxDataVolume;
	}

	public String getCauxCharAnal1() {
		return cauxCharAnal1;
	}

	public void setCauxCharAnal1(String cauxCharAnal1) {
		this.cauxCharAnal1 = cauxCharAnal1;
	}

	public String getCauxCharAnal2() {
		return cauxCharAnal2;
	}

	public void setCauxCharAnal2(String cauxCharAnal2) {
		this.cauxCharAnal2 = cauxCharAnal2;
	}

	public String getCauxCharAnal3() {
		return cauxCharAnal3;
	}

	public void setCauxCharAnal3(String cauxCharAnal3) {
		this.cauxCharAnal3 = cauxCharAnal3;
	}

	public String getCauxCharAnal4() {
		return cauxCharAnal4;
	}

	public void setCauxCharAnal4(String cauxCharAnal4) {
		this.cauxCharAnal4 = cauxCharAnal4;
	}

	public String getCauxCharAnal5() {
		return cauxCharAnal5;
	}

	public void setCauxCharAnal5(String cauxCharAnal5) {
		this.cauxCharAnal5 = cauxCharAnal5;
	}

	public Double getCauxFloatAnal1() {
		return cauxFloatAnal1;
	}

	public void setCauxFloatAnal1(Double cauxFloatAnal1) {
		this.cauxFloatAnal1 = cauxFloatAnal1;
	}

	public Double getCauxFloatAnal2() {
		return cauxFloatAnal2;
	}

	public void setCauxFloatAnal2(Double cauxFloatAnal2) {
		this.cauxFloatAnal2 = cauxFloatAnal2;
	}

	public Double getCauxFloatAnal3() {
		return cauxFloatAnal3;
	}

	public void setCauxFloatAnal3(Double cauxFloatAnal3) {
		this.cauxFloatAnal3 = cauxFloatAnal3;
	}

	public Integer getCauxIntAnal1() {
		return cauxIntAnal1;
	}

	public void setCauxIntAnal1(Integer cauxIntAnal1) {
		this.cauxIntAnal1 = cauxIntAnal1;
	}

	public Integer getCauxIntAnal2() {
		return cauxIntAnal2;
	}

	public void setCauxIntAnal2(Integer cauxIntAnal2) {
		this.cauxIntAnal2 = cauxIntAnal2;
	}

	public Integer getCauxIntAnal3() {
		return cauxIntAnal3;
	}

	public void setCauxIntAnal3(Integer cauxIntAnal3) {
		this.cauxIntAnal3 = cauxIntAnal3;
	}

}
