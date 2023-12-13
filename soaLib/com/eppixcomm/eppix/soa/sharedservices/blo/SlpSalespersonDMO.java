package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;
import com.eppixcomm.eppix.common.util.Date;

public class SlpSalespersonDMO extends DBO implements Serializable {

	private String slpSalespersonId;
	private String slpName;
	private String slpDealerId;
	private Date slpActiveDate;
	private Date slpInactiveDate;
	private Integer slpMtnNo;
	private String slpRegion;
	private String slpDepartment;
	private String slpIndManager;

	public static final int slpSalespersonIdFilter = 0;
	private static final int slpSalespersonIdSize = 10;

	public static final int slpNameFilter = 1;
	private static final int slpNameSize = 40;

	public static final int slpDealerIdFilter = 2;
	private static final int slpDealerIdSize = 8;

	public static final int slpActiveDateFilter = 3;

	public static final int slpInactiveDateFilter = 4;

	public static final int slpMtnNoFilter = 5;

	public static final int slpRegionFilter = 6;
	private static final int slpRegionSize = 5;

	public static final int slpDepartmentFilter = 7;
	private static final int slpDepartmentSize = 5;

	public static final int slpIndManagerFilter = 8;
	private static final int slpIndManagerSize = 40;

	public SlpSalespersonDMO() {
	};

	public SlpSalespersonDMO(final String slpSalespersonId,
			final String slpName, final String slpDealerId,
			final Date slpActiveDate, final Date slpInactiveDate,
			final Integer slpMtnNo, final String slpRegion,
			final String slpDepartment, final String slpIndManager) {

		this.slpSalespersonId = slpSalespersonId;
		this.slpName = slpName;
		this.slpDealerId = slpDealerId;
		this.slpActiveDate = slpActiveDate;
		this.slpInactiveDate = slpInactiveDate;
		this.slpMtnNo = slpMtnNo;
		this.slpRegion = slpRegion;
		this.slpDepartment = slpDepartment;
		this.slpIndManager = slpIndManager;
	};

	private static final int[] fieldSizes = new int[] { slpSalespersonIdSize,
			slpNameSize, slpDealerIdSize, 0, 0, 0, slpRegionSize,
			slpDepartmentSize, slpIndManagerSize };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_DATE,
			FIELD_TYPE_DATE, FIELD_TYPE_INTEGER, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] {
				((this.slpSalespersonId == null) ? null
						: (this.slpSalespersonId.length() <= slpSalespersonIdSize) ? this.slpSalespersonId
								: this.slpSalespersonId.substring(0,
										this.slpSalespersonIdSize)),
				((this.slpName == null) ? null
						: (this.slpName.length() <= slpNameSize) ? this.slpName
								: this.slpName.substring(0, this.slpNameSize)),
				((this.slpDealerId == null) ? null
						: (this.slpDealerId.length() <= slpDealerIdSize) ? this.slpDealerId
								: this.slpDealerId.substring(0,
										this.slpDealerIdSize)),
				this.slpActiveDate,
				this.slpInactiveDate,
				this.slpMtnNo,
				((this.slpRegion == null) ? null
						: (this.slpRegion.length() <= slpRegionSize) ? this.slpRegion
								: this.slpRegion.substring(0,
										this.slpRegionSize)),
				((this.slpDepartment == null) ? null : (this.slpDepartment
						.length() <= slpDepartmentSize) ? this.slpDepartment
						: this.slpDepartment.substring(0,
								this.slpDepartmentSize)),
				((this.slpIndManager == null) ? null : (this.slpIndManager
						.length() <= slpIndManagerSize) ? this.slpIndManager
						: this.slpIndManager.substring(0,
								this.slpIndManagerSize)) };
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
		return new DAOArgs(2).arg(this.slpSalespersonId).arg(this.slpDealerId);
	}

	protected void set(Object[] fields) {
		this.slpSalespersonId = rtrim((String) fields[0]);
		this.slpName = rtrim((String) fields[1]);
		this.slpDealerId = rtrim((String) fields[2]);
		this.slpActiveDate = ((fields[3] == null) ? null : new Date(
				 fields[3]));
		this.slpInactiveDate = ((fields[4] == null) ? null : new Date(
				 fields[4]));
		this.slpMtnNo = ((Integer) fields[5]);
		this.slpRegion = rtrim((String) fields[6]);
		this.slpDepartment = rtrim((String) fields[7]);
		this.slpIndManager = rtrim((String) fields[8]);
	}

	public void set(final String slpSalespersonId, final String slpName,
			final String slpDealerId, final Date slpActiveDate,
			final Date slpInactiveDate, final Integer slpMtnNo,
			final String slpRegion, final String slpDepartment,
			final String slpIndManager) {

		this.slpSalespersonId = slpSalespersonId;
		this.slpName = slpName;
		this.slpDealerId = slpDealerId;
		this.slpActiveDate = slpActiveDate;
		this.slpInactiveDate = slpInactiveDate;
		this.slpMtnNo = slpMtnNo;
		this.slpRegion = slpRegion;
		this.slpDepartment = slpDepartment;
		this.slpIndManager = slpIndManager;
	}

	public String getSlpSalespersonId() {
		return slpSalespersonId;
	}

	public void setSlpSalespersonId(String slpSalespersonId) {
		this.slpSalespersonId = slpSalespersonId;
	}

	public String getSlpName() {
		return slpName;
	}

	public void setSlpName(String slpName) {
		this.slpName = slpName;
	}

	public String getSlpDealerId() {
		return slpDealerId;
	}

	public void setSlpDealerId(String slpDealerId) {
		this.slpDealerId = slpDealerId;
	}

	public Date getSlpActiveDate() {
		return slpActiveDate;
	}

	public void setSlpActiveDate(Date slpActiveDate) {
		this.slpActiveDate = slpActiveDate;
	}

	public Date getSlpInactiveDate() {
		return slpInactiveDate;
	}

	public void setSlpInactiveDate(Date slpInactiveDate) {
		this.slpInactiveDate = slpInactiveDate;
	}

	public Integer getSlpMtnNo() {
		return slpMtnNo;
	}

	public void setSlpMtnNo(Integer slpMtnNo) {
		this.slpMtnNo = slpMtnNo;
	}

	public String getSlpRegion() {
		return slpRegion;
	}

	public void setSlpRegion(String slpRegion) {
		this.slpRegion = slpRegion;
	}

	public String getSlpDepartment() {
		return slpDepartment;
	}

	public void setSlpDepartment(String slpDepartment) {
		this.slpDepartment = slpDepartment;
	}

	public String getSlpIndManager() {
		return slpIndManager;
	}

	public void setSlpIndManager(String slpIndManager) {
		this.slpIndManager = slpIndManager;
	}

}