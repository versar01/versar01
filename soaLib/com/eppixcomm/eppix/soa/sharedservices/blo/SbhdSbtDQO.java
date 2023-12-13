package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.base.blo.SbhdSplitBillHdDMO;
import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;
import com.eppixcomm.eppix.common.util.Date;

public class SbhdSbtDQO extends DBO implements Serializable {

	private SbhdSplitBillHdDMO sbhdDMO;
	private SbtSplitBillDetDMO sbtDMO;
	
	private Integer sbhdSbId;
	private Integer sbhdSubscriberId;
	private String sbhdChildAcNo;
	private String sbhdChildMsisdn;
	private String sbhdParentAcNo;
	private String sbhdParentMsisdn;
	private String sbhdCreditAccum;
	private String sbhdMigrated;
	private Float sbhdTotBillAmt;
	private Integer sbhdDdRd;
	private Date sbhdActDate;
	private Date sbhdDeactDate;
	private Date sbhdBilledUpto;
	private String sbhdStatus;
	private Integer sbtSbId;
	private Integer sbtDirRuleId;
	private String sbtDiscType;
	private Double sbtDiscFixed;
	private Double sbtDiscPerc;
	private String sbtServiceCode;
	private String sbtServiceType;
	private Date sbtStartDate;
	private Date sbtEndDate;
	private Integer sbtIndicator;

	public static final int sbhdSbIdFilter = 0;
	private static final int sbhdSbIdSize = 50376;

	public static final int sbhdSubscriberIdFilter = 1;

	public static final int sbhdChildAcNoFilter = 2;
	private static final int sbhdChildAcNoSize = 8;

	public static final int sbhdChildMsisdnFilter = 3;
	private static final int sbhdChildMsisdnSize = 15;

	public static final int sbhdParentAcNoFilter = 4;
	private static final int sbhdParentAcNoSize = 8;

	public static final int sbhdParentMsisdnFilter = 5;
	private static final int sbhdParentMsisdnSize = 15;

	public static final int sbhdCreditAccumFilter = 6;
	private static final int sbhdCreditAccumSize = 1;

	public static final int sbhdMigratedFilter = 7;
	private static final int sbhdMigratedSize = 1;

	public static final int sbhdTotBillAmtFilter = 8;

	public static final int sbhdDdRdFilter = 9;

	public static final int sbhdActDateFilter = 10;

	public static final int sbhdDeactDateFilter = 11;

	public static final int sbhdBilledUptoFilter = 12;

	public static final int sbhdStatusFilter = 13;
	private static final int sbhdStatusSize = 1;

	public static final int sbtSbIdFilter = 14;

	public static final int sbtDirRuleIdFilter = 15;

	public static final int sbtDiscTypeFilter = 16;
	private static final int sbtDiscTypeSize = 1;

	public static final int sbtDiscFixedFilter = 17;

	public static final int sbtDiscPercFilter = 18;

	public static final int sbtServiceCodeFilter = 19;
	private static final int sbtServiceCodeSize = 4;

	public static final int sbtServiceTypeFilter = 20;
	private static final int sbtServiceTypeSize = 5;

	public static final int sbtStartDateFilter = 21;

	public static final int sbtEndDateFilter = 22;

	public static final int sbtIndicatorFilter = 23;

	public SbhdSbtDQO() {
	};
	
	public void deConstruct(){
		sbhdDMO = new SbhdSplitBillHdDMO(sbhdSbId, 
				sbhdSubscriberId, 
				sbhdChildAcNo, 
				sbhdChildMsisdn, 
				sbhdParentAcNo, 
				sbhdParentMsisdn, 
				sbhdCreditAccum, 
				sbhdMigrated, 
				sbhdTotBillAmt, 
				sbhdDdRd,
				sbhdActDate, 
				sbhdDeactDate, 
				sbhdBilledUpto, 
				sbhdStatus);
		
		sbtDMO = new SbtSplitBillDetDMO(sbtSbId, 
				sbtDirRuleId, 
				sbtDiscType, 
				sbtDiscFixed, 
				sbtDiscPerc, 
				sbtServiceCode, 
				sbtServiceType, 
				sbtStartDate, 
				sbtEndDate, 
				sbtIndicator);
	}

	public SbhdSbtDQO(final Integer sbhdSbId, final Integer sbhdSubscriberId,
			final String sbhdChildAcNo, final String sbhdChildMsisdn,
			final String sbhdParentAcNo, final String sbhdParentMsisdn,
			final String sbhdCreditAccum, final String sbhdMigrated,
			final Float sbhdTotBillAmt, final Integer sbhdDdRd,
			final Date sbhdActDate, final Date sbhdDeactDate,
			final Date sbhdBilledUpto, final String sbhdStatus,
			final Integer sbtSbId, final Integer sbtDirRuleId,
			final String sbtDiscType, final Double sbtDiscFixed,
			final Double sbtDiscPerc, final String sbtServiceCode,
			final String sbtServiceType, final Date sbtStartDate,
			final Date sbtEndDate, final Integer sbtIndicator) {

		this.sbhdSbId = sbhdSbId;
		this.sbhdSubscriberId = sbhdSubscriberId;
		this.sbhdChildAcNo = sbhdChildAcNo;
		this.sbhdChildMsisdn = sbhdChildMsisdn;
		this.sbhdParentAcNo = sbhdParentAcNo;
		this.sbhdParentMsisdn = sbhdParentMsisdn;
		this.sbhdCreditAccum = sbhdCreditAccum;
		this.sbhdMigrated = sbhdMigrated;
		this.sbhdTotBillAmt = sbhdTotBillAmt;
		this.sbhdDdRd = sbhdDdRd;
		this.sbhdActDate = sbhdActDate;
		this.sbhdDeactDate = sbhdDeactDate;
		this.sbhdBilledUpto = sbhdBilledUpto;
		this.sbhdStatus = sbhdStatus;
		this.sbtSbId = sbtSbId;
		this.sbtDirRuleId = sbtDirRuleId;
		this.sbtDiscType = sbtDiscType;
		this.sbtDiscFixed = sbtDiscFixed;
		this.sbtDiscPerc = sbtDiscPerc;
		this.sbtServiceCode = sbtServiceCode;
		this.sbtServiceType = sbtServiceType;
		this.sbtStartDate = sbtStartDate;
		this.sbtEndDate = sbtEndDate;
		this.sbtIndicator = sbtIndicator;
	};

	private static final int[] fieldSizes = new int[] { sbhdSbIdSize, 0,
			sbhdChildAcNoSize, sbhdChildMsisdnSize, sbhdParentAcNoSize,
			sbhdParentMsisdnSize, sbhdCreditAccumSize, sbhdMigratedSize, 0, 0,
			0, 0, 0, sbhdStatusSize, 0, 0, sbtDiscTypeSize, 0, 0,
			sbtServiceCodeSize, sbtServiceTypeSize, 0, 0, 0 };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_INTEGER,
			FIELD_TYPE_INTEGER, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_FLOAT, FIELD_TYPE_SHORT,
			FIELD_TYPE_DATE, FIELD_TYPE_DATE, FIELD_TYPE_DATE,
			FIELD_TYPE_STRING, FIELD_TYPE_INTEGER, FIELD_TYPE_INTEGER,
			FIELD_TYPE_STRING, FIELD_TYPE_FLOAT, FIELD_TYPE_FLOAT,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_DATE,
			FIELD_TYPE_DATE, FIELD_TYPE_SHORT };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] {
				this.sbhdSbId,
				this.sbhdSubscriberId,
				((this.sbhdChildAcNo == null) ? null : (this.sbhdChildAcNo
						.length() <= sbhdChildAcNoSize) ? this.sbhdChildAcNo
						: this.sbhdChildAcNo.substring(0,
								this.sbhdChildAcNoSize)),
				((this.sbhdChildMsisdn == null) ? null
						: (this.sbhdChildMsisdn.length() <= sbhdChildMsisdnSize) ? this.sbhdChildMsisdn
								: this.sbhdChildMsisdn.substring(0,
										this.sbhdChildMsisdnSize)),
				((this.sbhdParentAcNo == null) ? null : (this.sbhdParentAcNo
						.length() <= sbhdParentAcNoSize) ? this.sbhdParentAcNo
						: this.sbhdParentAcNo.substring(0,
								this.sbhdParentAcNoSize)),
				((this.sbhdParentMsisdn == null) ? null
						: (this.sbhdParentMsisdn.length() <= sbhdParentMsisdnSize) ? this.sbhdParentMsisdn
								: this.sbhdParentMsisdn.substring(0,
										this.sbhdParentMsisdnSize)),
				((this.sbhdCreditAccum == null) ? null
						: (this.sbhdCreditAccum.length() <= sbhdCreditAccumSize) ? this.sbhdCreditAccum
								: this.sbhdCreditAccum.substring(0,
										this.sbhdCreditAccumSize)),
				((this.sbhdMigrated == null) ? null : (this.sbhdMigrated
						.length() <= sbhdMigratedSize) ? this.sbhdMigrated
						: this.sbhdMigrated.substring(0, this.sbhdMigratedSize)),
				this.sbhdTotBillAmt,
				this.sbhdDdRd,
				this.sbhdActDate,
				this.sbhdDeactDate,
				this.sbhdBilledUpto,
				((this.sbhdStatus == null) ? null
						: (this.sbhdStatus.length() <= sbhdStatusSize) ? this.sbhdStatus
								: this.sbhdStatus.substring(0,
										this.sbhdStatusSize)),
				this.sbtSbId,
				this.sbtDirRuleId,
				((this.sbtDiscType == null) ? null
						: (this.sbtDiscType.length() <= sbtDiscTypeSize) ? this.sbtDiscType
								: this.sbtDiscType.substring(0,
										this.sbtDiscTypeSize)),
				this.sbtDiscFixed,
				this.sbtDiscPerc,
				((this.sbtServiceCode == null) ? null : (this.sbtServiceCode
						.length() <= sbtServiceCodeSize) ? this.sbtServiceCode
						: this.sbtServiceCode.substring(0,
								this.sbtServiceCodeSize)),
				((this.sbtServiceType == null) ? null : (this.sbtServiceType
						.length() <= sbtServiceTypeSize) ? this.sbtServiceType
						: this.sbtServiceType.substring(0,
								this.sbtServiceTypeSize)), this.sbtStartDate,
				this.sbtEndDate, this.sbtIndicator };
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
		this.sbhdSbId = (Integer) fields[0];
		this.sbhdSubscriberId = ((Integer) fields[1]);
		this.sbhdChildAcNo = rtrim((String) fields[2]);
		this.sbhdChildMsisdn = rtrim((String) fields[3]);
		this.sbhdParentAcNo = rtrim((String) fields[4]);
		this.sbhdParentMsisdn = rtrim((String) fields[5]);
		this.sbhdCreditAccum = rtrim((String) fields[6]);
		this.sbhdMigrated = rtrim((String) fields[7]);
		this.sbhdTotBillAmt = ((Float) fields[8]);
		this.sbhdDdRd = ((Integer) fields[9]);
		this.sbhdActDate = ((fields[10] == null) ? null : new Date(
				(Date) fields[10]));
		this.sbhdDeactDate = ((fields[11] == null) ? null : new Date(
				(Date) fields[11]));
		this.sbhdBilledUpto = ((fields[12] == null) ? null : new Date(
				(Date) fields[12]));
		this.sbhdStatus = rtrim((String) fields[13]);
		this.sbtSbId = ((Integer) fields[14]);
		this.sbtDirRuleId = ((Integer) fields[15]);
		this.sbtDiscType = rtrim((String) fields[16]);
		this.sbtDiscFixed = ((Double) fields[17]);
		this.sbtDiscPerc = ((Double) fields[18]);
		this.sbtServiceCode = rtrim((String) fields[19]);
		this.sbtServiceType = rtrim((String) fields[20]);
		this.sbtStartDate = ((fields[21] == null) ? null : new Date(
				(Date) fields[21]));
		this.sbtEndDate = ((fields[22] == null) ? null : new Date(
				(Date) fields[22]));
		this.sbtIndicator = ((Integer) fields[23]);
	}

	public void set(final Integer sbhdSbId, final Integer sbhdSubscriberId,
			final String sbhdChildAcNo, final String sbhdChildMsisdn,
			final String sbhdParentAcNo, final String sbhdParentMsisdn,
			final String sbhdCreditAccum, final String sbhdMigrated,
			final Float sbhdTotBillAmt, final Integer sbhdDdRd,
			final Date sbhdActDate, final Date sbhdDeactDate,
			final Date sbhdBilledUpto, final String sbhdStatus,
			final Integer sbtSbId, final Integer sbtDirRuleId,
			final String sbtDiscType, final Double sbtDiscFixed,
			final Double sbtDiscPerc, final String sbtServiceCode,
			final String sbtServiceType, final Date sbtStartDate,
			final Date sbtEndDate, final Integer sbtIndicator) {

		this.sbhdSbId = sbhdSbId;
		this.sbhdSubscriberId = sbhdSubscriberId;
		this.sbhdChildAcNo = sbhdChildAcNo;
		this.sbhdChildMsisdn = sbhdChildMsisdn;
		this.sbhdParentAcNo = sbhdParentAcNo;
		this.sbhdParentMsisdn = sbhdParentMsisdn;
		this.sbhdCreditAccum = sbhdCreditAccum;
		this.sbhdMigrated = sbhdMigrated;
		this.sbhdTotBillAmt = sbhdTotBillAmt;
		this.sbhdDdRd = sbhdDdRd;
		this.sbhdActDate = sbhdActDate;
		this.sbhdDeactDate = sbhdDeactDate;
		this.sbhdBilledUpto = sbhdBilledUpto;
		this.sbhdStatus = sbhdStatus;
		this.sbtSbId = sbtSbId;
		this.sbtDirRuleId = sbtDirRuleId;
		this.sbtDiscType = sbtDiscType;
		this.sbtDiscFixed = sbtDiscFixed;
		this.sbtDiscPerc = sbtDiscPerc;
		this.sbtServiceCode = sbtServiceCode;
		this.sbtServiceType = sbtServiceType;
		this.sbtStartDate = sbtStartDate;
		this.sbtEndDate = sbtEndDate;
		this.sbtIndicator = sbtIndicator;
	}

	public Integer getSbhdSbId() {
		return sbhdSbId;
	}

	public void setSbhdSbId(Integer sbhdSbId) {
		this.sbhdSbId = sbhdSbId;
	}

	public Integer getSbhdSubscriberId() {
		return sbhdSubscriberId;
	}

	public void setSbhdSubscriberId(Integer sbhdSubscriberId) {
		this.sbhdSubscriberId = sbhdSubscriberId;
	}

	public String getSbhdChildAcNo() {
		return sbhdChildAcNo;
	}

	public void setSbhdChildAcNo(String sbhdChildAcNo) {
		this.sbhdChildAcNo = sbhdChildAcNo;
	}

	public String getSbhdChildMsisdn() {
		return sbhdChildMsisdn;
	}

	public void setSbhdChildMsisdn(String sbhdChildMsisdn) {
		this.sbhdChildMsisdn = sbhdChildMsisdn;
	}

	public String getSbhdParentAcNo() {
		return sbhdParentAcNo;
	}

	public void setSbhdParentAcNo(String sbhdParentAcNo) {
		this.sbhdParentAcNo = sbhdParentAcNo;
	}

	public String getSbhdParentMsisdn() {
		return sbhdParentMsisdn;
	}

	public void setSbhdParentMsisdn(String sbhdParentMsisdn) {
		this.sbhdParentMsisdn = sbhdParentMsisdn;
	}

	public String getSbhdCreditAccum() {
		return sbhdCreditAccum;
	}

	public void setSbhdCreditAccum(String sbhdCreditAccum) {
		this.sbhdCreditAccum = sbhdCreditAccum;
	}

	public String getSbhdMigrated() {
		return sbhdMigrated;
	}

	public void setSbhdMigrated(String sbhdMigrated) {
		this.sbhdMigrated = sbhdMigrated;
	}

	public Float getSbhdTotBillAmt() {
		return sbhdTotBillAmt;
	}

	public void setSbhdTotBillAmt(Float sbhdTotBillAmt) {
		this.sbhdTotBillAmt = sbhdTotBillAmt;
	}

	public Integer getSbhdDdRd() {
		return sbhdDdRd;
	}

	public void setSbhdDdRd(Integer sbhdDdRd) {
		this.sbhdDdRd = sbhdDdRd;
	}

	public Date getSbhdActDate() {
		return sbhdActDate;
	}

	public void setSbhdActDate(Date sbhdActDate) {
		this.sbhdActDate = sbhdActDate;
	}

	public Date getSbhdDeactDate() {
		return sbhdDeactDate;
	}

	public void setSbhdDeactDate(Date sbhdDeactDate) {
		this.sbhdDeactDate = sbhdDeactDate;
	}

	public Date getSbhdBilledUpto() {
		return sbhdBilledUpto;
	}

	public void setSbhdBilledUpto(Date sbhdBilledUpto) {
		this.sbhdBilledUpto = sbhdBilledUpto;
	}

	public String getSbhdStatus() {
		return sbhdStatus;
	}

	public void setSbhdStatus(String sbhdStatus) {
		this.sbhdStatus = sbhdStatus;
	}

	public Integer getSbtSbId() {
		return sbtSbId;
	}

	public void setSbtSbId(Integer sbtSbId) {
		this.sbtSbId = sbtSbId;
	}

	public Integer getSbtDirRuleId() {
		return sbtDirRuleId;
	}

	public void setSbtDirRuleId(Integer sbtDirRuleId) {
		this.sbtDirRuleId = sbtDirRuleId;
	}

	public String getSbtDiscType() {
		return sbtDiscType;
	}

	public void setSbtDiscType(String sbtDiscType) {
		this.sbtDiscType = sbtDiscType;
	}

	public Double getSbtDiscFixed() {
		return sbtDiscFixed;
	}

	public void setSbtDiscFixed(Double sbtDiscFixed) {
		this.sbtDiscFixed = sbtDiscFixed;
	}

	public Double getSbtDiscPerc() {
		return sbtDiscPerc;
	}

	public void setSbtDiscPerc(Double sbtDiscPerc) {
		this.sbtDiscPerc = sbtDiscPerc;
	}

	public String getSbtServiceCode() {
		return sbtServiceCode;
	}

	public void setSbtServiceCode(String sbtServiceCode) {
		this.sbtServiceCode = sbtServiceCode;
	}

	public String getSbtServiceType() {
		return sbtServiceType;
	}

	public void setSbtServiceType(String sbtServiceType) {
		this.sbtServiceType = sbtServiceType;
	}

	public Date getSbtStartDate() {
		return sbtStartDate;
	}

	public void setSbtStartDate(Date sbtStartDate) {
		this.sbtStartDate = sbtStartDate;
	}

	public Date getSbtEndDate() {
		return sbtEndDate;
	}

	public void setSbtEndDate(Date sbtEndDate) {
		this.sbtEndDate = sbtEndDate;
	}

	public Integer getSbtIndicator() {
		return sbtIndicator;
	}

	public void setSbtIndicator(Integer sbtIndicator) {
		this.sbtIndicator = sbtIndicator;
	}

	public SbhdSplitBillHdDMO getSbhdDMO() {
		return sbhdDMO;
	}

	public void setSbhdDMO(SbhdSplitBillHdDMO sbhdDMO) {
		this.sbhdDMO = sbhdDMO;
	}

	public SbtSplitBillDetDMO getSbtDMO() {
		return sbtDMO;
	}

	public void setSbtDMO(SbtSplitBillDetDMO sbtDMO) {
		this.sbtDMO = sbtDMO;
	}

}
