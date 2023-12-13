package com.eppixcomm.eppix.soa.sharedservices.blo;

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
	private String sbeAnalysis1;
	private String sbeAnalysis2;
	private String sbeAnalysis3;
	private Date sbeActiveDate;

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

	public static final int sbeAnalysis1Filter = 8;
	private static final int sbeAnalysis1Size = 30;

	public static final int sbeAnalysis2Filter = 9;
	private static final int sbeAnalysis2Size = 30;

	public static final int sbeAnalysis3Filter = 10;
	private static final int sbeAnalysis3Size = 30;

	public static final int sbeActiveDateFilter = 11;

	public SbeSubEquipDMO() {
	};

	public SbeSubEquipDMO(final Integer sbeSubEquipId,
			final Integer sbeSubscriberId, final String sbeImeiNo,
			final String sbeSerialNo, final String sbeWarehouse,
			final String sbeProductCode, final String sbeAntenna,
			final String sbeMsisdn, final String sbeAnalysis1,
			final String sbeAnalysis2, final String sbeAnalysis3,
			final Date sbeActiveDate) {

		this.sbeSubEquipId = sbeSubEquipId;
		this.sbeSubscriberId = sbeSubscriberId;
		this.sbeImeiNo = sbeImeiNo;
		this.sbeSerialNo = sbeSerialNo;
		this.sbeWarehouse = sbeWarehouse;
		this.sbeProductCode = sbeProductCode;
		this.sbeAntenna = sbeAntenna;
		this.sbeMsisdn = sbeMsisdn;
		this.sbeAnalysis1 = sbeAnalysis1;
		this.sbeAnalysis2 = sbeAnalysis2;
		this.sbeAnalysis3 = sbeAnalysis3;
		this.sbeActiveDate = sbeActiveDate;
	};

	private static final int[] fieldSizes = new int[] { 0, 0, sbeImeiNoSize,
			sbeSerialNoSize, sbeWarehouseSize, sbeProductCodeSize,
			sbeAntennaSize, sbeMsisdnSize, sbeAnalysis1Size, sbeAnalysis2Size,
			sbeAnalysis3Size, 0 };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_INTEGER,
			FIELD_TYPE_INTEGER, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_DATE };

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
				((this.sbeAnalysis1 == null) ? null : (this.sbeAnalysis1
						.length() <= sbeAnalysis1Size) ? this.sbeAnalysis1
						: this.sbeAnalysis1.substring(0, this.sbeAnalysis1Size)),
				((this.sbeAnalysis2 == null) ? null : (this.sbeAnalysis2
						.length() <= sbeAnalysis2Size) ? this.sbeAnalysis2
						: this.sbeAnalysis2.substring(0, this.sbeAnalysis2Size)),
				((this.sbeAnalysis3 == null) ? null : (this.sbeAnalysis3
						.length() <= sbeAnalysis3Size) ? this.sbeAnalysis3
						: this.sbeAnalysis3.substring(0, this.sbeAnalysis3Size)),
				this.sbeActiveDate };
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
		this.sbeSubEquipId = ((Integer) fields[0]);
		this.sbeSubscriberId = ((Integer) fields[1]);
		this.sbeImeiNo = rtrim((String) fields[2]);
		this.sbeSerialNo = rtrim((String) fields[3]);
		this.sbeWarehouse = rtrim((String) fields[4]);
		this.sbeProductCode = rtrim((String) fields[5]);
		this.sbeAntenna = rtrim((String) fields[6]);
		this.sbeMsisdn = rtrim((String) fields[7]);
		this.sbeAnalysis1 = rtrim((String) fields[8]);
		this.sbeAnalysis2 = rtrim((String) fields[9]);
		this.sbeAnalysis3 = rtrim((String) fields[10]);
		this.sbeActiveDate = ((fields[11] == null) ? null : new Date(
				 fields[11]));
	}

	public void set(final Integer sbeSubEquipId, final Integer sbeSubscriberId,
			final String sbeImeiNo, final String sbeSerialNo,
			final String sbeWarehouse, final String sbeProductCode,
			final String sbeAntenna, final String sbeMsisdn,
			final String sbeAnalysis1, final String sbeAnalysis2,
			final String sbeAnalysis3, final Date sbeActiveDate) {

		this.sbeSubEquipId = sbeSubEquipId;
		this.sbeSubscriberId = sbeSubscriberId;
		this.sbeImeiNo = sbeImeiNo;
		this.sbeSerialNo = sbeSerialNo;
		this.sbeWarehouse = sbeWarehouse;
		this.sbeProductCode = sbeProductCode;
		this.sbeAntenna = sbeAntenna;
		this.sbeMsisdn = sbeMsisdn;
		this.sbeAnalysis1 = sbeAnalysis1;
		this.sbeAnalysis2 = sbeAnalysis2;
		this.sbeAnalysis3 = sbeAnalysis3;
		this.sbeActiveDate = sbeActiveDate;
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

	public String getSbeAnalysis1() {
		return sbeAnalysis1;
	}

	public void setSbeAnalysis1(String sbeAnalysis1) {
		this.sbeAnalysis1 = sbeAnalysis1;
	}

	public String getSbeAnalysis2() {
		return sbeAnalysis2;
	}

	public void setSbeAnalysis2(String sbeAnalysis2) {
		this.sbeAnalysis2 = sbeAnalysis2;
	}

	public String getSbeAnalysis3() {
		return sbeAnalysis3;
	}

	public void setSbeAnalysis3(String sbeAnalysis3) {
		this.sbeAnalysis3 = sbeAnalysis3;
	}

	public Date getSbeActiveDate() {
		return sbeActiveDate;
	}

	public void setSbeActiveDate(Date sbeActiveDate) {
		this.sbeActiveDate = sbeActiveDate;
	}

}
