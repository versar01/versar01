package com.eppixcomm.eppix.base.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;
import com.eppixcomm.eppix.common.util.Date;

public class SbeSubEquipDMO extends DBO implements Serializable {
	private Integer sbeSubEquipId;
	private Integer sbeSubscriberId;
	private String sbeImeiNo;
	private String sbeSerialNo;
	private String sbeWarehouse;
	private String sbeProductCode;
	private String sbeAntenna;
	private String sbeMsisdn;
	private String sbeImeiSimPair;
	private String sbeDealId;
	private String sbeGroupIdx;
	private Date sbeActiveDate;
	private Integer sbeUpgradeId;
	private String sbeMake;
	private String sbeModel;
	private String sbeDescription;
	private Double sbeHandsetVal;
	private Double sbeEarlytermChg;
	private Double sbeAddCharge1;
	private Double sbeAddCharge2;
	private String sbeDevicePriority;
	private Date sbeCaptureDate;
	private Date sbeDate1;
	private Date sbeDate2;
	private Date sbeDate3;
	private Integer sbeInt1;
	private Integer sbeInt2;
	private Integer sbeInt3;
	private Double sbeFloat1;
	private Double sbeFloat2;
	private Double sbeFloat3;
	private String sbeChar1;
	private String sbeChar2;
	private String sbeChar3;

	public static final int sbeSubEquipIdFilter = 0;

	public static final int sbeSubscriberIdFilter = 1;

	public static final int sbeImeiNoFilter = 2;
	private static final int sbeImeiNoSize = 15;

	public static final int sbeSerialNoFilter = 3;
	private static final int sbeSerialNoSize = 16;

	public static final int sbeWarehouseFilter = 4;
	private static final int sbeWarehouseSize = 2;

	public static final int sbeProductCodeFilter = 5;
	private static final int sbeProductCodeSize = 20;

	public static final int sbeAntennaFilter = 6;
	private static final int sbeAntennaSize = 15;

	public static final int sbeMsisdnFilter = 7;
	private static final int sbeMsisdnSize = 15;

	public static final int sbeImeiSimPairFilter = 8;

	public static final int sbeDealIdFilter = 9;

	public static final int sbeGroupIdxFilter = 10;

	public static final int sbeActiveDateFilter = 11;

	public static final int sbeUpgradeIdFilter = 12;

	public static final int sbeMakeFilter = 13;

	public static final int sbeModelFilter = 14;

	public static final int sbeDescriptionFilter = 15;

	public static final int sbeHandsetValFilter = 16;

	public static final int sbeEarlytermChgFilter = 17;

	public static final int sbeAddCharge1Filter = 18;

	public static final int sbeAddCharge2Filter = 19;

	public static final int sbeDevicePriorityFilter = 20;
	private static final int sbeDevicePrioritySize = 1;

	public static final int sbeCaptureDateFilter = 21;

	public static final int sbeDate1Filter = 22;

	public static final int sbeDate2Filter = 23;

	public static final int sbeDate3Filter = 24;

	public static final int sbeInt1Filter = 25;

	public static final int sbeInt2Filter = 26;

	public static final int sbeInt3Filter = 27;

	public static final int sbeFloat1Filter = 28;

	public static final int sbeFloat2Filter = 29;

	public static final int sbeFloat3Filter = 30;

	public static final int sbeChar1Filter = 31;

	public static final int sbeChar2Filter = 32;

	public static final int sbeChar3Filter = 33;

	public SbeSubEquipDMO() {
	};

	public SbeSubEquipDMO(final Integer sbeSubEquipId,
			final Integer sbeSubscriberId, final String sbeImeiNo,
			final String sbeSerialNo, final String sbeWarehouse,
			final String sbeProductCode, final String sbeAntenna,
			final String sbeMsisdn, final String sbeImeiSimPair,
			final String sbeDealId, final String sbeGroupIdx,
			final Date sbeActiveDate, final Integer sbeUpgradeId,
			final String sbeMake, final String sbeModel,
			final String sbeDescription, final Double sbeHandsetVal,
			final Double sbeEarlytermChg, final Double sbeAddCharge1,
			final Double sbeAddCharge2, final String sbeDevicePriority,
			final Date sbeCaptureDate, final Date sbeDate1,
			final Date sbeDate2, final Date sbeDate3, final Integer sbeInt1,
			final Integer sbeInt2, final Integer sbeInt3,
			final Double sbeFloat1, final Double sbeFloat2,
			final Double sbeFloat3, final String sbeChar1,
			final String sbeChar2, final String sbeChar3) {

		this.sbeSubEquipId = sbeSubEquipId;
		this.sbeSubscriberId = sbeSubscriberId;
		this.sbeImeiNo = sbeImeiNo;
		this.sbeSerialNo = sbeSerialNo;
		this.sbeWarehouse = sbeWarehouse;
		this.sbeProductCode = sbeProductCode;
		this.sbeAntenna = sbeAntenna;
		this.sbeMsisdn = sbeMsisdn;
		this.sbeImeiSimPair = sbeImeiSimPair;
		this.sbeDealId = sbeDealId;
		this.sbeGroupIdx = sbeGroupIdx;
		this.sbeActiveDate = sbeActiveDate;
		this.sbeUpgradeId = sbeUpgradeId;
		this.sbeMake = sbeMake;
		this.sbeModel = sbeModel;
		this.sbeDescription = sbeDescription;
		this.sbeHandsetVal = sbeHandsetVal;
		this.sbeEarlytermChg = sbeEarlytermChg;
		this.sbeAddCharge1 = sbeAddCharge1;
		this.sbeAddCharge2 = sbeAddCharge2;
		this.sbeDevicePriority = sbeDevicePriority;
		this.sbeCaptureDate = sbeCaptureDate;
		this.sbeDate1 = sbeDate1;
		this.sbeDate2 = sbeDate2;
		this.sbeDate3 = sbeDate3;
		this.sbeInt1 = sbeInt1;
		this.sbeInt2 = sbeInt2;
		this.sbeInt3 = sbeInt3;
		this.sbeFloat1 = sbeFloat1;
		this.sbeFloat2 = sbeFloat2;
		this.sbeFloat3 = sbeFloat3;
		this.sbeChar1 = sbeChar1;
		this.sbeChar2 = sbeChar2;
		this.sbeChar3 = sbeChar3;
	};

	private static final int[] fieldSizes = new int[] { 0, 0, sbeImeiNoSize,
			sbeSerialNoSize, sbeWarehouseSize, sbeProductCodeSize,
			sbeAntennaSize, sbeMsisdnSize, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
			sbeDevicePrioritySize, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_INTEGER,
			FIELD_TYPE_INTEGER, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_DATE, FIELD_TYPE_INTEGER,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_DOUBLE, FIELD_TYPE_DOUBLE, FIELD_TYPE_DOUBLE,
			FIELD_TYPE_DOUBLE, FIELD_TYPE_STRING, FIELD_TYPE_DATE,
			FIELD_TYPE_DATE, FIELD_TYPE_DATE, FIELD_TYPE_DATE,
			FIELD_TYPE_INTEGER, FIELD_TYPE_INTEGER, FIELD_TYPE_INTEGER,
			FIELD_TYPE_DOUBLE, FIELD_TYPE_DOUBLE, FIELD_TYPE_DOUBLE,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] {
				this.sbeSubEquipId,
				this.sbeSubscriberId,
				((this.sbeImeiNo == null) ? null
						: (this.sbeImeiNo.length() <= sbeImeiNoSize) ? this.sbeImeiNo
								: this.sbeImeiNo.substring(0,
										this.sbeImeiNoSize)),
				((this.sbeSerialNo == null) ? null
						: (this.sbeSerialNo.length() <= sbeSerialNoSize) ? this.sbeSerialNo
								: this.sbeSerialNo.substring(0,
										this.sbeSerialNoSize)),
				((this.sbeWarehouse == null) ? null : (this.sbeWarehouse
						.length() <= sbeWarehouseSize) ? this.sbeWarehouse
						: this.sbeWarehouse.substring(0, this.sbeWarehouseSize)),
				((this.sbeProductCode == null) ? null : (this.sbeProductCode
						.length() <= sbeProductCodeSize) ? this.sbeProductCode
						: this.sbeProductCode.substring(0,
								this.sbeProductCodeSize)),
				((this.sbeAntenna == null) ? null
						: (this.sbeAntenna.length() <= sbeAntennaSize) ? this.sbeAntenna
								: this.sbeAntenna.substring(0,
										this.sbeAntennaSize)),
				((this.sbeMsisdn == null) ? null
						: (this.sbeMsisdn.length() <= sbeMsisdnSize) ? this.sbeMsisdn
								: this.sbeMsisdn.substring(0,
										this.sbeMsisdnSize)),
				this.sbeImeiSimPair,
				this.sbeDealId,
				this.sbeGroupIdx,
				this.sbeActiveDate,
				this.sbeUpgradeId,
				this.sbeMake,
				this.sbeModel,
				this.sbeDescription,
				this.sbeHandsetVal,
				this.sbeEarlytermChg,
				this.sbeAddCharge1,
				this.sbeAddCharge2,
				((this.sbeDevicePriority == null) ? null
						: (this.sbeDevicePriority.length() <= sbeDevicePrioritySize) ? this.sbeDevicePriority
								: this.sbeDevicePriority.substring(0,
										this.sbeDevicePrioritySize)),
				this.sbeCaptureDate, this.sbeDate1, this.sbeDate2,
				this.sbeDate3, this.sbeInt1, this.sbeInt2, this.sbeInt3,
				this.sbeFloat1, this.sbeFloat2, this.sbeFloat3, this.sbeChar1,
				this.sbeChar2, this.sbeChar3 };
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
		return new DAOArgs(1).arg(this.sbeSubEquipId);
	}

	protected void set(Object[] fields) {
		this.sbeSubEquipId = ((Integer) fields[0]);
		this.sbeSubscriberId = ((Integer) fields[1]);
		this.sbeImeiNo = rtrim((String) fields[2]);
		this.sbeSerialNo = rtrim((String) fields[3]);
		this.sbeWarehouse = rtrim((String) fields[4]);
		this.sbeProductCode = rtrim((String) fields[5]);
		this.sbeAntenna = rtrim((String) fields[6]);
		this.sbeMsisdn = rtrim((String) fields[7]);
		this.sbeImeiSimPair = ((String) fields[8]);
		this.sbeDealId = ((String) fields[9]);
		this.sbeGroupIdx = ((String) fields[10]);
		this.sbeActiveDate = ((fields[11] == null) ? null : new Date( fields[11]));
		this.sbeUpgradeId = ((Integer) fields[12]);
		this.sbeMake = ((String) fields[13]);
		this.sbeModel = ((String) fields[14]);
		this.sbeDescription = ((String) fields[15]);
		this.sbeHandsetVal = ((Double) fields[16]);
		this.sbeEarlytermChg = ((Double) fields[17]);
		this.sbeAddCharge1 = ((Double) fields[18]);
		this.sbeAddCharge2 = ((Double) fields[19]);
		this.sbeDevicePriority = rtrim((String) fields[20]);
		this.sbeCaptureDate = ((fields[21] == null) ? null : new Date(fields[21]));
		this.sbeDate1 = ((fields[22] == null) ? null : new Date(fields[22]));
		this.sbeDate2 = ((fields[23] == null) ? null : new Date(fields[23]));
		this.sbeDate3 = ((fields[24] == null) ? null : new Date(fields[24]));
		this.sbeInt1 = ((Integer) fields[25]);
		this.sbeInt2 = ((Integer) fields[26]);
		this.sbeInt3 = ((Integer) fields[27]);
		this.sbeFloat1 = ((Double) fields[28]);
		this.sbeFloat2 = ((Double) fields[29]);
		this.sbeFloat3 = ((Double) fields[30]);
		this.sbeChar1 = ((String) fields[31]);
		this.sbeChar2 = ((String) fields[32]);
		this.sbeChar3 = ((String) fields[33]);
	}

	public void set(final Integer sbeSubEquipId, final Integer sbeSubscriberId,
			final String sbeImeiNo, final String sbeSerialNo,
			final String sbeWarehouse, final String sbeProductCode,
			final String sbeAntenna, final String sbeMsisdn,
			final String sbeImeiSimPair, final String sbeDealId,
			final String sbeGroupIdx, final Date sbeActiveDate,
			final Integer sbeUpgradeId, final String sbeMake,
			final String sbeModel, final String sbeDescription,
			final Double sbeHandsetVal, final Double sbeEarlytermChg,
			final Double sbeAddCharge1, final Double sbeAddCharge2,
			final String sbeDevicePriority, final Date sbeCaptureDate,
			final Date sbeDate1, final Date sbeDate2, final Date sbeDate3,
			final Integer sbeInt1, final Integer sbeInt2,
			final Integer sbeInt3, final Double sbeFloat1,
			final Double sbeFloat2, final Double sbeFloat3,
			final String sbeChar1, final String sbeChar2, final String sbeChar3) {

		this.sbeSubEquipId = sbeSubEquipId;
		this.sbeSubscriberId = sbeSubscriberId;
		this.sbeImeiNo = sbeImeiNo;
		this.sbeSerialNo = sbeSerialNo;
		this.sbeWarehouse = sbeWarehouse;
		this.sbeProductCode = sbeProductCode;
		this.sbeAntenna = sbeAntenna;
		this.sbeMsisdn = sbeMsisdn;
		this.sbeImeiSimPair = sbeImeiSimPair;
		this.sbeDealId = sbeDealId;
		this.sbeGroupIdx = sbeGroupIdx;
		this.sbeActiveDate = sbeActiveDate;
		this.sbeUpgradeId = sbeUpgradeId;
		this.sbeMake = sbeMake;
		this.sbeModel = sbeModel;
		this.sbeDescription = sbeDescription;
		this.sbeHandsetVal = sbeHandsetVal;
		this.sbeEarlytermChg = sbeEarlytermChg;
		this.sbeAddCharge1 = sbeAddCharge1;
		this.sbeAddCharge2 = sbeAddCharge2;
		this.sbeDevicePriority = sbeDevicePriority;
		this.sbeCaptureDate = sbeCaptureDate;
		this.sbeDate1 = sbeDate1;
		this.sbeDate2 = sbeDate2;
		this.sbeDate3 = sbeDate3;
		this.sbeInt1 = sbeInt1;
		this.sbeInt2 = sbeInt2;
		this.sbeInt3 = sbeInt3;
		this.sbeFloat1 = sbeFloat1;
		this.sbeFloat2 = sbeFloat2;
		this.sbeFloat3 = sbeFloat3;
		this.sbeChar1 = sbeChar1;
		this.sbeChar2 = sbeChar2;
		this.sbeChar3 = sbeChar3;
	}

	public Integer getSbeSubEquipId() {
		return sbeSubEquipId;
	}

	public void setSbeSubEquipId(Integer sbeSubEquipId) {
		this.sbeSubEquipId = sbeSubEquipId;
	}

	public Integer getSbeSubscriberId() {
		return sbeSubscriberId;
	}

	public void setSbeSubscriberId(Integer sbeSubscriberId) {
		this.sbeSubscriberId = sbeSubscriberId;
	}

	public String getSbeImeiNo() {
		return sbeImeiNo;
	}

	public void setSbeImeiNo(String sbeImeiNo) {
		this.sbeImeiNo = sbeImeiNo;
	}

	public String getSbeSerialNo() {
		return sbeSerialNo;
	}

	public void setSbeSerialNo(String sbeSerialNo) {
		this.sbeSerialNo = sbeSerialNo;
	}

	public String getSbeWarehouse() {
		return sbeWarehouse;
	}

	public void setSbeWarehouse(String sbeWarehouse) {
		this.sbeWarehouse = sbeWarehouse;
	}

	public String getSbeProductCode() {
		return sbeProductCode;
	}

	public void setSbeProductCode(String sbeProductCode) {
		this.sbeProductCode = sbeProductCode;
	}

	public String getSbeAntenna() {
		return sbeAntenna;
	}

	public void setSbeAntenna(String sbeAntenna) {
		this.sbeAntenna = sbeAntenna;
	}

	public String getSbeMsisdn() {
		return sbeMsisdn;
	}

	public void setSbeMsisdn(String sbeMsisdn) {
		this.sbeMsisdn = sbeMsisdn;
	}

	public String getSbeImeiSimPair() {
		return sbeImeiSimPair;
	}

	public void setSbeImeiSimPair(String sbeImeiSimPair) {
		this.sbeImeiSimPair = sbeImeiSimPair;
	}

	public String getSbeDealId() {
		return sbeDealId;
	}

	public void setSbeDealId(String sbeDealId) {
		this.sbeDealId = sbeDealId;
	}

	public String getSbeGroupIdx() {
		return sbeGroupIdx;
	}

	public void setSbeGroupIdx(String sbeGroupIdx) {
		this.sbeGroupIdx = sbeGroupIdx;
	}

	public Date getSbeActiveDate() {
		return sbeActiveDate;
	}

	public void setSbeActiveDate(Date sbeActiveDate) {
		this.sbeActiveDate = sbeActiveDate;
	}

	public Integer getSbeUpgradeId() {
		return sbeUpgradeId;
	}

	public void setSbeUpgradeId(Integer sbeUpgradeId) {
		this.sbeUpgradeId = sbeUpgradeId;
	}

	public String getSbeMake() {
		return sbeMake;
	}

	public void setSbeMake(String sbeMake) {
		this.sbeMake = sbeMake;
	}

	public String getSbeModel() {
		return sbeModel;
	}

	public void setSbeModel(String sbeModel) {
		this.sbeModel = sbeModel;
	}

	public String getSbeDescription() {
		return sbeDescription;
	}

	public void setSbeDescription(String sbeDescription) {
		this.sbeDescription = sbeDescription;
	}

	public Double getSbeHandsetVal() {
		return sbeHandsetVal;
	}

	public void setSbeHandsetVal(Double sbeHandsetVal) {
		this.sbeHandsetVal = sbeHandsetVal;
	}

	public Double getSbeEarlytermChg() {
		return sbeEarlytermChg;
	}

	public void setSbeEarlytermChg(Double sbeEarlytermChg) {
		this.sbeEarlytermChg = sbeEarlytermChg;
	}

	public Double getSbeAddCharge1() {
		return sbeAddCharge1;
	}

	public void setSbeAddCharge1(Double sbeAddCharge1) {
		this.sbeAddCharge1 = sbeAddCharge1;
	}

	public Double getSbeAddCharge2() {
		return sbeAddCharge2;
	}

	public void setSbeAddCharge2(Double sbeAddCharge2) {
		this.sbeAddCharge2 = sbeAddCharge2;
	}

	public String getSbeDevicePriority() {
		return sbeDevicePriority;
	}

	public void setSbeDevicePriority(String sbeDevicePriority) {
		this.sbeDevicePriority = sbeDevicePriority;
	}

	public Date getSbeCaptureDate() {
		return sbeCaptureDate;
	}

	public void setSbeCaptureDate(Date sbeCaptureDate) {
		this.sbeCaptureDate = sbeCaptureDate;
	}

	public Date getSbeDate1() {
		return sbeDate1;
	}

	public void setSbeDate1(Date sbeDate1) {
		this.sbeDate1 = sbeDate1;
	}

	public Date getSbeDate2() {
		return sbeDate2;
	}

	public void setSbeDate2(Date sbeDate2) {
		this.sbeDate2 = sbeDate2;
	}

	public Date getSbeDate3() {
		return sbeDate3;
	}

	public void setSbeDate3(Date sbeDate3) {
		this.sbeDate3 = sbeDate3;
	}

	public Integer getSbeInt1() {
		return sbeInt1;
	}

	public void setSbeInt1(Integer sbeInt1) {
		this.sbeInt1 = sbeInt1;
	}

	public Integer getSbeInt2() {
		return sbeInt2;
	}

	public void setSbeInt2(Integer sbeInt2) {
		this.sbeInt2 = sbeInt2;
	}

	public Integer getSbeInt3() {
		return sbeInt3;
	}

	public void setSbeInt3(Integer sbeInt3) {
		this.sbeInt3 = sbeInt3;
	}

	public Double getSbeFloat1() {
		return sbeFloat1;
	}

	public void setSbeFloat1(Double sbeFloat1) {
		this.sbeFloat1 = sbeFloat1;
	}

	public Double getSbeFloat2() {
		return sbeFloat2;
	}

	public void setSbeFloat2(Double sbeFloat2) {
		this.sbeFloat2 = sbeFloat2;
	}

	public Double getSbeFloat3() {
		return sbeFloat3;
	}

	public void setSbeFloat3(Double sbeFloat3) {
		this.sbeFloat3 = sbeFloat3;
	}

	public String getSbeChar1() {
		return sbeChar1;
	}

	public void setSbeChar1(String sbeChar1) {
		this.sbeChar1 = sbeChar1;
	}

	public String getSbeChar2() {
		return sbeChar2;
	}

	public void setSbeChar2(String sbeChar2) {
		this.sbeChar2 = sbeChar2;
	}

	public String getSbeChar3() {
		return sbeChar3;
	}

	public void setSbeChar3(String sbeChar3) {
		this.sbeChar3 = sbeChar3;
	}

	@Override
	public String toString() {
		return "\nSbeSubEquipDMO [\nsbeSubEquipId=" + sbeSubEquipId
				+ "\nsbeSubscriberId=" + sbeSubscriberId + "\nsbeImeiNo="
				+ sbeImeiNo + "\nsbeSerialNo=" + sbeSerialNo
				+ "\nsbeWarehouse=" + sbeWarehouse + "\nsbeProductCode="
				+ sbeProductCode + "\nsbeAntenna=" + sbeAntenna
				+ "\nsbeMsisdn=" + sbeMsisdn + "\nsbeImeiSimPair="
				+ sbeImeiSimPair + "\nsbeDealId=" + sbeDealId
				+ "\nsbeGroupIdx=" + sbeGroupIdx + "\nsbeActiveDate="
				+ sbeActiveDate + "\nsbeUpgradeId=" + sbeUpgradeId
				+ "\nsbeMake=" + sbeMake + "\nsbeModel=" + sbeModel
				+ "\nsbeDescription=" + sbeDescription + "\nsbeHandsetVal="
				+ sbeHandsetVal + "\nsbeEarlytermChg=" + sbeEarlytermChg
				+ "\nsbeAddCharge1=" + sbeAddCharge1 + "\nsbeAddCharge2="
				+ sbeAddCharge2 + "\nsbeDevicePriority=" + sbeDevicePriority
				+ "\nsbeCaptureDate=" + sbeCaptureDate + "\nsbeDate1="
				+ sbeDate1 + "\nsbeDate2=" + sbeDate2 + "\nsbeDate3="
				+ sbeDate3 + "\nsbeInt1=" + sbeInt1 + "\nsbeInt2=" + sbeInt2
				+ "\nsbeInt3=" + sbeInt3 + "\nsbeFloat1=" + sbeFloat1
				+ "\nsbeFloat2=" + sbeFloat2 + "\nsbeFloat3=" + sbeFloat3
				+ "\nsbeChar1=" + sbeChar1 + "\nsbeChar2=" + sbeChar2
				+ "\nsbeChar3=" + sbeChar3 + "]";
	}

}