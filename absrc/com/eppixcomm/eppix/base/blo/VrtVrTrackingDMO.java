package com.eppixcomm.eppix.base.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;
import com.eppixcomm.eppix.common.util.Date;

public class VrtVrTrackingDMO extends DBO implements Serializable {

	private String vrtRequestor;
	private String vrtReceiver;
	private String vrtProvider;
	private String vrtRechargeType;
	private Float vrtRechargeAmt;
	private Integer vrtRefId;
	private Integer vrtVrrId;
	private Integer vrtVriId;
	private Integer vrtReferenceNo;
	private Date vrtDate1;
	private Date vrtDate2;
	private Date vrtDate3;
	private String vrtMtwTransId;
	private String vrtMtwTermId;
	private String vrtMtwBatchNum;
	private Integer vrtMtwPrcreCd;
	private String vrtMtwRetRef;
	private Integer vrtMtwFundldCd;
	private Integer vrtMtwLdRspns;
	private String vrtStatus;

	public static final int VrtRequestorFilter = 0;
	private static final int VrtRequestorSize = 15;

	public static final int VrtReceiverFilter = 1;
	private static final int VrtReceiverSize = 15;

	public static final int VrtProviderFilter = 2;
	private static final int VrtProviderSize = 5;

	public static final int VrtRechargeTypeFilter = 3;
	private static final int VrtRechargeTypeSize = 1;

	public static final int VrtRechargeAmtFilter = 4;

	public static final int VrtRefIdFilter = 5;

	public static final int VrtVrrIdFilter = 6;

	public static final int VrtVriIdFilter = 7;

	public static final int VrtReferenceNoFilter = 8;

	public static final int VrtDate1Filter = 9;

	public static final int VrtDate2Filter = 10;

	public static final int VrtDate3Filter = 11;

	public static final int VrtMtwTransIdFilter = 12;
	private static final int VrtMtwTransIdSize = 26;

	public static final int VrtMtwTermIdFilter = 13;
	private static final int VrtMtwTermIdSize = 8;

	public static final int VrtMtwBatchNumFilter = 14;
	private static final int VrtMtwBatchNumSize = 6;

	public static final int VrtMtwPrcreCdFilter = 15;

	public static final int VrtMtwRetRefFilter = 16;
	private static final int VrtMtwRetRefSize = 12;

	public static final int VrtMtwFundldCdFilter = 17;

	public static final int VrtMtwLdRspnsFilter = 18;

	public static final int VrtStatusFilter = 19;
	private static final int VrtStatusSize = 1;

	public VrtVrTrackingDMO() {
	};

	public VrtVrTrackingDMO(final String VrtRequestor,
			final String VrtReceiver, final String VrtProvider,
			final String VrtRechargeType, final Float VrtRechargeAmt,
			final Integer VrtRefId, final Integer VrtVrrId,
			final Integer VrtVriId, final Integer VrtReferenceNo,
			final Date VrtDate1, final Date VrtDate2, final Date VrtDate3,
			final String VrtMtwTransId, final String VrtMtwTermId,
			final String VrtMtwBatchNum, final Integer VrtMtwPrcreCd,
			final String VrtMtwRetRef, final Integer VrtMtwFundldCd,
			final Integer VrtMtwLdRspns, final String VrtStatus) {

		this.vrtRequestor = VrtRequestor;
		this.vrtReceiver = VrtReceiver;
		this.vrtProvider = VrtProvider;
		this.vrtRechargeType = VrtRechargeType;
		this.vrtRechargeAmt = VrtRechargeAmt;
		this.vrtRefId = VrtRefId;
		this.vrtVrrId = VrtVrrId;
		this.vrtVriId = VrtVriId;
		this.vrtReferenceNo = VrtReferenceNo;
		this.vrtDate1 = VrtDate1;
		this.vrtDate2 = VrtDate2;
		this.vrtDate3 = VrtDate3;
		this.vrtMtwTransId = VrtMtwTransId;
		this.vrtMtwTermId = VrtMtwTermId;
		this.vrtMtwBatchNum = VrtMtwBatchNum;
		this.vrtMtwPrcreCd = VrtMtwPrcreCd;
		this.vrtMtwRetRef = VrtMtwRetRef;
		this.vrtMtwFundldCd = VrtMtwFundldCd;
		this.vrtMtwLdRspns = VrtMtwLdRspns;
		this.vrtStatus = VrtStatus;
	};

	private static final int[] fieldSizes = new int[] { VrtRequestorSize,
			VrtReceiverSize, VrtProviderSize, VrtRechargeTypeSize, 0, 0, 0, 0,
			0, 0, 0, 0, VrtMtwTransIdSize, VrtMtwTermIdSize,
			VrtMtwBatchNumSize, 0, VrtMtwRetRefSize, 0, 0, VrtStatusSize };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_FLOAT, FIELD_TYPE_INTEGER, FIELD_TYPE_INTEGER,
			FIELD_TYPE_INTEGER, FIELD_TYPE_INTEGER, FIELD_TYPE_DATE,
			FIELD_TYPE_DATE, FIELD_TYPE_DATE, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_INTEGER,
			FIELD_TYPE_STRING, FIELD_TYPE_INTEGER, FIELD_TYPE_INTEGER,
			FIELD_TYPE_STRING };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] {
				((this.vrtRequestor == null) ? null : (this.vrtRequestor
						.length() <= VrtRequestorSize) ? this.vrtRequestor
						: this.vrtRequestor.substring(0, this.VrtRequestorSize)),
				((this.vrtReceiver == null) ? null
						: (this.vrtReceiver.length() <= VrtReceiverSize) ? this.vrtReceiver
								: this.vrtReceiver.substring(0,
										this.VrtReceiverSize)),
				((this.vrtProvider == null) ? null
						: (this.vrtProvider.length() <= VrtProviderSize) ? this.vrtProvider
								: this.vrtProvider.substring(0,
										this.VrtProviderSize)),
				((this.vrtRechargeType == null) ? null
						: (this.vrtRechargeType.length() <= VrtRechargeTypeSize) ? this.vrtRechargeType
								: this.vrtRechargeType.substring(0,
										this.VrtRechargeTypeSize)),
				this.vrtRechargeAmt,
				this.vrtRefId,
				this.vrtVrrId,
				this.vrtVriId,
				this.vrtReferenceNo,
				this.vrtDate1,
				this.vrtDate2,
				this.vrtDate3,
				((this.vrtMtwTransId == null) ? null : (this.vrtMtwTransId
						.length() <= VrtMtwTransIdSize) ? this.vrtMtwTransId
						: this.vrtMtwTransId.substring(0,
								this.VrtMtwTransIdSize)),
				((this.vrtMtwTermId == null) ? null : (this.vrtMtwTermId
						.length() <= VrtMtwTermIdSize) ? this.vrtMtwTermId
						: this.vrtMtwTermId.substring(0, this.VrtMtwTermIdSize)),
				((this.vrtMtwBatchNum == null) ? null : (this.vrtMtwBatchNum
						.length() <= VrtMtwBatchNumSize) ? this.vrtMtwBatchNum
						: this.vrtMtwBatchNum.substring(0,
								this.VrtMtwBatchNumSize)),
				this.vrtMtwPrcreCd,
				((this.vrtMtwRetRef == null) ? null : (this.vrtMtwRetRef
						.length() <= VrtMtwRetRefSize) ? this.vrtMtwRetRef
						: this.vrtMtwRetRef.substring(0, this.VrtMtwRetRefSize)),
				this.vrtMtwFundldCd,
				this.vrtMtwLdRspns,
				((this.vrtStatus == null) ? null
						: (this.vrtStatus.length() <= VrtStatusSize) ? this.vrtStatus
								: this.vrtStatus.substring(0,
										this.VrtStatusSize)) };
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
		return new DAOArgs(1).arg(this.vrtRefId);
	}

	protected void set(Object[] fields) {
		this.vrtRequestor = rtrim((String) fields[0]);
		this.vrtReceiver = rtrim((String) fields[1]);
		this.vrtProvider = rtrim((String) fields[2]);
		this.vrtRechargeType = rtrim((String) fields[3]);
		this.vrtRechargeAmt = ((Float) fields[4]);
		this.vrtRefId = ((Integer) fields[5]);
		this.vrtVrrId = ((Integer) fields[6]);
		this.vrtVriId = ((Integer) fields[7]);
		this.vrtReferenceNo = ((Integer) fields[8]);
		this.vrtDate1 = ((fields[9] == null) ? null	: new Date( fields[9]));
		this.vrtDate2 = ((fields[10] == null) ? null : new Date(fields[10]));
		this.vrtDate3 = ((fields[11] == null) ? null : new Date(fields[11]));
		this.vrtMtwTransId = rtrim((String) fields[12]);
		this.vrtMtwTermId = rtrim((String) fields[13]);
		this.vrtMtwBatchNum = rtrim((String) fields[14]);
		this.vrtMtwPrcreCd = ((Integer) fields[15]);
		this.vrtMtwRetRef = rtrim((String) fields[16]);
		this.vrtMtwFundldCd = ((Integer) fields[17]);
		this.vrtMtwLdRspns = ((Integer) fields[18]);
		this.vrtStatus = rtrim((String) fields[19]);
	}

	public void set(final String VrtRequestor, final String VrtReceiver,
			final String VrtProvider, final String VrtRechargeType,
			final Float VrtRechargeAmt, final Integer VrtRefId,
			final Integer VrtVrrId, final Integer VrtVriId,
			final Integer VrtReferenceNo, final Date VrtDate1,
			final Date VrtDate2, final Date VrtDate3,
			final String VrtMtwTransId, final String VrtMtwTermId,
			final String VrtMtwBatchNum, final Integer VrtMtwPrcreCd,
			final String VrtMtwRetRef, final Integer VrtMtwFundldCd,
			final Integer VrtMtwLdRspns, final String VrtStatus) {

		this.vrtRequestor = VrtRequestor;
		this.vrtReceiver = VrtReceiver;
		this.vrtProvider = VrtProvider;
		this.vrtRechargeType = VrtRechargeType;
		this.vrtRechargeAmt = VrtRechargeAmt;
		this.vrtRefId = VrtRefId;
		this.vrtVrrId = VrtVrrId;
		this.vrtVriId = VrtVriId;
		this.vrtReferenceNo = VrtReferenceNo;
		this.vrtDate1 = VrtDate1;
		this.vrtDate2 = VrtDate2;
		this.vrtDate3 = VrtDate3;
		this.vrtMtwTransId = VrtMtwTransId;
		this.vrtMtwTermId = VrtMtwTermId;
		this.vrtMtwBatchNum = VrtMtwBatchNum;
		this.vrtMtwPrcreCd = VrtMtwPrcreCd;
		this.vrtMtwRetRef = VrtMtwRetRef;
		this.vrtMtwFundldCd = VrtMtwFundldCd;
		this.vrtMtwLdRspns = VrtMtwLdRspns;
		this.vrtStatus = VrtStatus;
	}

	public String getVrtRequestor() {
		return vrtRequestor;
	}

	public void setVrtRequestor(String vrtRequestor) {
		this.vrtRequestor = vrtRequestor;
	}

	public String getVrtReceiver() {
		return vrtReceiver;
	}

	public void setVrtReceiver(String vrtReceiver) {
		this.vrtReceiver = vrtReceiver;
	}

	public String getVrtProvider() {
		return vrtProvider;
	}

	public void setVrtProvider(String vrtProvider) {
		this.vrtProvider = vrtProvider;
	}

	public String getVrtRechargeType() {
		return vrtRechargeType;
	}

	public void setVrtRechargeType(String vrtRechargeType) {
		this.vrtRechargeType = vrtRechargeType;
	}

	public Float getVrtRechargeAmt() {
		return vrtRechargeAmt;
	}

	public void setVrtRechargeAmt(Float vrtRechargeAmt) {
		this.vrtRechargeAmt = vrtRechargeAmt;
	}

	public Integer getVrtRefId() {
		return vrtRefId;
	}

	public void setVrtRefId(Integer vrtRefId) {
		this.vrtRefId = vrtRefId;
	}

	public Integer getVrtVrrId() {
		return vrtVrrId;
	}

	public void setVrtVrrId(Integer vrtVrrId) {
		this.vrtVrrId = vrtVrrId;
	}

	public Integer getVrtVriId() {
		return vrtVriId;
	}

	public void setVrtVriId(Integer vrtVriId) {
		this.vrtVriId = vrtVriId;
	}

	public Integer getVrtReferenceNo() {
		return vrtReferenceNo;
	}

	public void setVrtReferenceNo(Integer vrtReferenceNo) {
		this.vrtReferenceNo = vrtReferenceNo;
	}

	public Date getVrtDate1() {
		return vrtDate1;
	}

	public void setVrtDate1(Date vrtDate1) {
		this.vrtDate1 = vrtDate1;
	}

	public Date getVrtDate2() {
		return vrtDate2;
	}

	public void setVrtDate2(Date vrtDate2) {
		this.vrtDate2 = vrtDate2;
	}

	public Date getVrtDate3() {
		return vrtDate3;
	}

	public void setVrtDate3(Date vrtDate3) {
		this.vrtDate3 = vrtDate3;
	}

	public String getVrtMtwTransId() {
		return vrtMtwTransId;
	}

	public void setVrtMtwTransId(String vrtMtwTransId) {
		this.vrtMtwTransId = vrtMtwTransId;
	}

	public String getVrtMtwTermId() {
		return vrtMtwTermId;
	}

	public void setVrtMtwTermId(String vrtMtwTermId) {
		this.vrtMtwTermId = vrtMtwTermId;
	}

	public String getVrtMtwBatchNum() {
		return vrtMtwBatchNum;
	}

	public void setVrtMtwBatchNum(String vrtMtwBatchNum) {
		this.vrtMtwBatchNum = vrtMtwBatchNum;
	}

	public Integer getVrtMtwPrcreCd() {
		return vrtMtwPrcreCd;
	}

	public void setVrtMtwPrcreCd(Integer vrtMtwPrcreCd) {
		this.vrtMtwPrcreCd = vrtMtwPrcreCd;
	}

	public String getVrtMtwRetRef() {
		return vrtMtwRetRef;
	}

	public void setVrtMtwRetRef(String vrtMtwRetRef) {
		this.vrtMtwRetRef = vrtMtwRetRef;
	}

	public Integer getVrtMtwFundldCd() {
		return vrtMtwFundldCd;
	}

	public void setVrtMtwFundldCd(Integer vrtMtwFundldCd) {
		this.vrtMtwFundldCd = vrtMtwFundldCd;
	}

	public Integer getVrtMtwLdRspns() {
		return vrtMtwLdRspns;
	}

	public void setVrtMtwLdRspns(Integer vrtMtwLdRspns) {
		this.vrtMtwLdRspns = vrtMtwLdRspns;
	}

	public String getVrtStatus() {
		return vrtStatus;
	}

	public void setVrtStatus(String vrtStatus) {
		this.vrtStatus = vrtStatus;
	}

}