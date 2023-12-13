package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;

public class TdTelemtryDeviceDMO extends DBO implements Serializable {

	private Integer tdSubscriberId;
	private String tdDeviceDesc;
	private String tdAddress;
	private String tdSuburb;
	private String tdTowncity;
	private String tdCode;
	private String tdRefRegno;
	private String tdUsageType;
	private String tdCostCode;

	public static final int tdSubscriberIdFilter = 0;

	public static final int tdDeviceDescFilter = 1;
	private static final int tdDeviceDescSize = 64;

	public static final int tdAddressFilter = 2;
	private static final int tdAddressSize = 32;

	public static final int tdSuburbFilter = 3;
	private static final int tdSuburbSize = 40;

	public static final int tdTowncityFilter = 4;
	private static final int tdTowncitySize = 40;

	public static final int tdCodeFilter = 5;
	private static final int tdCodeSize = 40;

	public static final int tdRefRegnoFilter = 6;
	private static final int tdRefRegnoSize = 40;

	public static final int tdUsageTypeFilter = 7;
	private static final int tdUsageTypeSize = 20;

	public static final int tdCostCodeFilter = 8;
	private static final int tdCostCodeSize = 128;

	public TdTelemtryDeviceDMO() {
	};

	public TdTelemtryDeviceDMO(final Integer tdSubscriberId,
			final String tdDeviceDesc, final String tdAddress,
			final String tdSuburb, final String tdTowncity,
			final String tdCode, final String tdRefRegno,
			final String tdUsageType, final String tdCostCode) {

		this.tdSubscriberId = tdSubscriberId;
		this.tdDeviceDesc = tdDeviceDesc;
		this.tdAddress = tdAddress;
		this.tdSuburb = tdSuburb;
		this.tdTowncity = tdTowncity;
		this.tdCode = tdCode;
		this.tdRefRegno = tdRefRegno;
		this.tdUsageType = tdUsageType;
		this.tdCostCode = tdCostCode;
	};

	private static final int[] fieldSizes = new int[] { 0, tdDeviceDescSize,
			tdAddressSize, tdSuburbSize, tdTowncitySize, tdCodeSize,
			tdRefRegnoSize, tdUsageTypeSize, tdCostCodeSize };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_INTEGER,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] {
				this.tdSubscriberId,
				((this.tdDeviceDesc == null) ? null : (this.tdDeviceDesc
						.length() <= tdDeviceDescSize) ? this.tdDeviceDesc
						: this.tdDeviceDesc.substring(0, this.tdDeviceDescSize)),
				((this.tdAddress == null) ? null
						: (this.tdAddress.length() <= tdAddressSize) ? this.tdAddress
								: this.tdAddress.substring(0,
										this.tdAddressSize)),
				((this.tdSuburb == null) ? null
						: (this.tdSuburb.length() <= tdSuburbSize) ? this.tdSuburb
								: this.tdSuburb.substring(0, this.tdSuburbSize)),
				((this.tdTowncity == null) ? null
						: (this.tdTowncity.length() <= tdTowncitySize) ? this.tdTowncity
								: this.tdTowncity.substring(0,
										this.tdTowncitySize)),
				((this.tdCode == null) ? null
						: (this.tdCode.length() <= tdCodeSize) ? this.tdCode
								: this.tdCode.substring(0, this.tdCodeSize)),
				((this.tdRefRegno == null) ? null
						: (this.tdRefRegno.length() <= tdRefRegnoSize) ? this.tdRefRegno
								: this.tdRefRegno.substring(0,
										this.tdRefRegnoSize)),
				((this.tdUsageType == null) ? null
						: (this.tdUsageType.length() <= tdUsageTypeSize) ? this.tdUsageType
								: this.tdUsageType.substring(0,
										this.tdUsageTypeSize)),
				((this.tdCostCode == null) ? null
						: (this.tdCostCode.length() <= tdCostCodeSize) ? this.tdCostCode
								: this.tdCostCode.substring(0,
										this.tdCostCodeSize)) };
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
		this.tdSubscriberId = ((Integer) fields[0]);
		this.tdDeviceDesc = rtrim((String) fields[1]);
		this.tdAddress = rtrim((String) fields[2]);
		this.tdSuburb = rtrim((String) fields[3]);
		this.tdTowncity = rtrim((String) fields[4]);
		this.tdCode = rtrim((String) fields[5]);
		this.tdRefRegno = rtrim((String) fields[6]);
		this.tdUsageType = rtrim((String) fields[7]);
		this.tdCostCode = rtrim((String) fields[8]);
	}

	public void set(final Integer tdSubscriberId, final String tdDeviceDesc,
			final String tdAddress, final String tdSuburb,
			final String tdTowncity, final String tdCode,
			final String tdRefRegno, final String tdUsageType,
			final String tdCostCode) {

		this.tdSubscriberId = tdSubscriberId;
		this.tdDeviceDesc = tdDeviceDesc;
		this.tdAddress = tdAddress;
		this.tdSuburb = tdSuburb;
		this.tdTowncity = tdTowncity;
		this.tdCode = tdCode;
		this.tdRefRegno = tdRefRegno;
		this.tdUsageType = tdUsageType;
		this.tdCostCode = tdCostCode;
	}

	public Integer getTdSubscriberId() {
		return tdSubscriberId;
	}

	public void setTdSubscriberId(Integer tdSubscriberId) {
		this.tdSubscriberId = tdSubscriberId;
	}

	public String getTdDeviceDesc() {
		return tdDeviceDesc;
	}

	public void setTdDeviceDesc(String tdDeviceDesc) {
		this.tdDeviceDesc = tdDeviceDesc;
	}

	public String getTdAddress() {
		return tdAddress;
	}

	public void setTdAddress(String tdAddress) {
		this.tdAddress = tdAddress;
	}

	public String getTdSuburb() {
		return tdSuburb;
	}

	public void setTdSuburb(String tdSuburb) {
		this.tdSuburb = tdSuburb;
	}

	public String getTdTowncity() {
		return tdTowncity;
	}

	public void setTdTowncity(String tdTowncity) {
		this.tdTowncity = tdTowncity;
	}

	public String getTdCode() {
		return tdCode;
	}

	public void setTdCode(String tdCode) {
		this.tdCode = tdCode;
	}

	public String getTdRefRegno() {
		return tdRefRegno;
	}

	public void setTdRefRegno(String tdRefRegno) {
		this.tdRefRegno = tdRefRegno;
	}

	public String getTdUsageType() {
		return tdUsageType;
	}

	public void setTdUsageType(String tdUsageType) {
		this.tdUsageType = tdUsageType;
	}

	public String getTdCostCode() {
		return tdCostCode;
	}

	public void setTdCostCode(String tdCostCode) {
		this.tdCostCode = tdCostCode;
	}

}
