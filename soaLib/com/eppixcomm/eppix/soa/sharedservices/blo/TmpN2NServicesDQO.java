package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;
import java.util.Arrays;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;
import com.eppixcomm.eppix.common.util.Date;

public class TmpN2NServicesDQO extends DBO implements Serializable {

	private String msisdnKnown;
	private String simNo;
	private String location;
	private Date eventDate;
	private String serviceCode;
	private String serviceType;
	private String internTariff;
	private String msisdnNo;
	private Integer vsmRowid;
	private String originator;
	private String nodeSent;
	private Short depReqd;
	private Short serviceOrder;
	private Short activateOrder;

	public static final int msisdnKnownFilter = 0;
	private static final int msisdnKnownSize = 1;

	public static final int simNoFilter = 1;
	private static final int simNoSize = 14;

	public static final int locationFilter = 2;
	private static final int locationSize = 2;

	public static final int eventDateFilter = 3;

	public static final int serviceCodeFilter = 4;
	private static final int serviceCodeSize = 4;

	public static final int serviceTypeFilter = 5;
	private static final int serviceTypeSize = 5;

	public static final int internTariffFilter = 6;
	private static final int internTariffSize = 20;

	public static final int msisdnNoFilter = 7;
	private static final int msisdnNoSize = 15;

	public static final int vsmRowidFilter = 8;

	public static final int originatorFilter = 9;
	private static final int originatorSize = 1;

	public static final int nodeSentFilter = 10;
	private static final int nodeSentSize = 1;

	public static final int depReqdFilter = 11;

	public static final int serviceOrderFilter = 12;

	public static final int activateOrderFilter = 13;

	public TmpN2NServicesDQO() {
	};

	public TmpN2NServicesDQO(final String msisdnKnown, final String simNo,
			final String location, final Date eventDate,
			final String serviceCode, final String serviceType,
			final String internTariff, final String msisdnNo,
			final Integer vsmRowid, final String originator,
			final String nodeSent, final Short depReqd,
			final Short serviceOrder, final Short activateOrder) {

		this.msisdnKnown = msisdnKnown;
		this.simNo = simNo;
		this.location = location;
		this.eventDate = eventDate;
		this.serviceCode = serviceCode;
		this.serviceType = serviceType;
		this.internTariff = internTariff;
		this.msisdnNo = msisdnNo;
		this.vsmRowid = vsmRowid;
		this.originator = originator;
		this.nodeSent = nodeSent;
		this.depReqd = depReqd;
		this.serviceOrder = serviceOrder;
		this.activateOrder = activateOrder;
	};

	private static final int[] fieldSizes = new int[] { msisdnKnownSize,
			simNoSize, locationSize, 0, serviceCodeSize, serviceTypeSize,
			internTariffSize, msisdnNoSize, 0, originatorSize, nodeSentSize, 0,
			0, 0 };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_DATE,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_INTEGER, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_SHORT, FIELD_TYPE_SHORT,
			FIELD_TYPE_SHORT };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] {
				((this.msisdnKnown == null) ? null
						: (this.msisdnKnown.length() <= msisdnKnownSize) ? this.msisdnKnown
								: this.msisdnKnown.substring(0,
										this.msisdnKnownSize)),
				((this.simNo == null) ? null
						: (this.simNo.length() <= simNoSize) ? this.simNo
								: this.simNo.substring(0, this.simNoSize)),
				((this.location == null) ? null
						: (this.location.length() <= locationSize) ? this.location
								: this.location.substring(0, this.locationSize)),
				this.eventDate,
				((this.serviceCode == null) ? null
						: (this.serviceCode.length() <= serviceCodeSize) ? this.serviceCode
								: this.serviceCode.substring(0,
										this.serviceCodeSize)),
				((this.serviceType == null) ? null
						: (this.serviceType.length() <= serviceTypeSize) ? this.serviceType
								: this.serviceType.substring(0,
										this.serviceTypeSize)),
				((this.internTariff == null) ? null : (this.internTariff
						.length() <= internTariffSize) ? this.internTariff
						: this.internTariff.substring(0, this.internTariffSize)),
				((this.msisdnNo == null) ? null
						: (this.msisdnNo.length() <= msisdnNoSize) ? this.msisdnNo
								: this.msisdnNo.substring(0, this.msisdnNoSize)),
				this.vsmRowid,
				((this.originator == null) ? null
						: (this.originator.length() <= originatorSize) ? this.originator
								: this.originator.substring(0,
										this.originatorSize)),
				((this.nodeSent == null) ? null
						: (this.nodeSent.length() <= nodeSentSize) ? this.nodeSent
								: this.nodeSent.substring(0, this.nodeSentSize)),
				this.depReqd, this.serviceOrder, this.activateOrder };
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
		this.msisdnKnown = rtrim((String) fields[0]);
		this.simNo = rtrim((String) fields[1]);
		this.location = rtrim((String) fields[2]);
		this.eventDate = ((fields[3] == null) ? null : new Date(
				 fields[3]));
		this.serviceCode = rtrim((String) fields[4]);
		this.serviceType = rtrim((String) fields[5]);
		this.internTariff = rtrim((String) fields[6]);
		this.msisdnNo = rtrim((String) fields[7]);
		this.vsmRowid = ((Integer) fields[8]);
		this.originator = rtrim((String) fields[9]);
		this.nodeSent = rtrim((String) fields[10]);
		this.depReqd = ((Short) fields[11]);
		this.serviceOrder = ((Short) fields[12]);
		this.activateOrder = ((Short) fields[13]);
	}

	public void set(final String msisdnKnown, final String simNo,
			final String location, final Date eventDate,
			final String serviceCode, final String serviceType,
			final String internTariff, final String msisdnNo,
			final Integer vsmRowid, final String originator,
			final String nodeSent, final Short depReqd,
			final Short serviceOrder, final Short activateOrder) {

		this.msisdnKnown = msisdnKnown;
		this.simNo = simNo;
		this.location = location;
		this.eventDate = eventDate;
		this.serviceCode = serviceCode;
		this.serviceType = serviceType;
		this.internTariff = internTariff;
		this.msisdnNo = msisdnNo;
		this.vsmRowid = vsmRowid;
		this.originator = originator;
		this.nodeSent = nodeSent;
		this.depReqd = depReqd;
		this.serviceOrder = serviceOrder;
		this.activateOrder = activateOrder;
	}

	public String getMsisdnKnown() {
		return msisdnKnown;
	}

	public void setMsisdnKnown(String msisdnKnown) {
		this.msisdnKnown = msisdnKnown;
	}

	public String getSimNo() {
		return simNo;
	}

	public void setSimNo(String simNo) {
		this.simNo = simNo;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Date getEventDate() {
		return eventDate;
	}

	public void setEventDate(Date eventDate) {
		this.eventDate = eventDate;
	}

	public String getServiceCode() {
		return serviceCode;
	}

	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}

	public String getServiceType() {
		return serviceType;
	}

	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	public String getInternTariff() {
		return internTariff;
	}

	public void setInternTariff(String internTariff) {
		this.internTariff = internTariff;
	}

	public String getMsisdnNo() {
		return msisdnNo;
	}

	public void setMsisdnNo(String msisdnNo) {
		this.msisdnNo = msisdnNo;
	}

	public Integer getVsmRowid() {
		return vsmRowid;
	}

	public void setVsmRowid(Integer vsmRowid) {
		this.vsmRowid = vsmRowid;
	}

	public String getOriginator() {
		return originator;
	}

	public void setOriginator(String originator) {
		this.originator = originator;
	}

	public String getNodeSent() {
		return nodeSent;
	}

	public void setNodeSent(String nodeSent) {
		this.nodeSent = nodeSent;
	}

	public Short getDepReqd() {
		return depReqd;
	}

	public void setDepReqd(Short depReqd) {
		this.depReqd = depReqd;
	}

	public Short getServiceOrder() {
		return serviceOrder;
	}

	public void setServiceOrder(Short serviceOrder) {
		this.serviceOrder = serviceOrder;
	}

	public Short getActivateOrder() {
		return activateOrder;
	}

	public void setActivateOrder(Short activateOrder) {
		this.activateOrder = activateOrder;
	}

	@Override
	public String toString() {
		return "\nTmpN2NServicesDQO [\nmsisdnKnown=" + msisdnKnown + "\nsimNo="
				+ simNo + "\nlocation=" + location + "\neventDate=" + eventDate
				+ "\nserviceCode=" + serviceCode + "\nserviceType="
				+ serviceType + "\ninternTariff=" + internTariff
				+ "\nmsisdnNo=" + msisdnNo + "\nvsmRowid=" + vsmRowid
				+ "\noriginator=" + originator + "\nnodeSent=" + nodeSent
				+ "\ndepReqd=" + depReqd + "\nserviceOrder=" + serviceOrder
				+ "\nactivateOrder=" + activateOrder + "]";
	}

}
