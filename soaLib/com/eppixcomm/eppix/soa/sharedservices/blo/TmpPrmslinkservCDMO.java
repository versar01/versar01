package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;
import com.eppixcomm.eppix.common.util.Date;

public class TmpPrmslinkservCDMO extends DBO implements Serializable {

	private Integer tmpSubId;
	private Integer pshId;
	private String serviceType;
	private String archived;
	private Integer paramId;
	private Date actDate;
	private Date termDate;
	private String paramValue;
	private String n2nString;
	private String paramActive;
	private Date deacDate;
	private String subCharge;
	private Double chgValue;
	private String actType;
	private Date actionDate;

	public static final int tmpSubIdFilter = 0;

	public static final int pshIdFilter = 1;

	public static final int serviceTypeFilter = 2;
	private static final int serviceTypeSize = 5;

	public static final int archivedFilter = 3;
	private static final int archivedSize = 1;

	public static final int paramIdFilter = 4;

	public static final int actDateFilter = 5;

	public static final int termDateFilter = 6;

	public static final int paramValueFilter = 7;
	private static final int paramValueSize = 20;

	public static final int n2nStringFilter = 8;
	private static final int n2nStringSize = 1;

	public static final int paramActiveFilter = 9;
	private static final int paramActiveSize = 1;

	public static final int deacDateFilter = 10;

	public static final int subChargeFilter = 11;
	private static final int subChargeSize = 5;

	public static final int chgValueFilter = 12;

	public static final int actTypeFilter = 13;
	private static final int actTypeSize = 2;

	public static final int actionDateFilter = 14;

	public TmpPrmslinkservCDMO() {
	};

	public TmpPrmslinkservCDMO(final Integer tmpSubId, final Integer pshId,
			final String serviceType, final String archived,
			final Integer paramId, final Date actDate, final Date termDate,
			final String paramValue, final String n2nString,
			final String paramActive, final Date deacDate,
			final String subCharge, final Double chgValue,
			final String actType, final Date actionDate) {

		this.tmpSubId = tmpSubId;
		this.pshId = pshId;
		this.serviceType = serviceType;
		this.archived = archived;
		this.paramId = paramId;
		this.actDate = actDate;
		this.termDate = termDate;
		this.paramValue = paramValue;
		this.n2nString = n2nString;
		this.paramActive = paramActive;
		this.deacDate = deacDate;
		this.subCharge = subCharge;
		this.chgValue = chgValue;
		this.actType = actType;
		this.actionDate = actionDate;
	};

	private static final int[] fieldSizes = new int[] { 0, 0, serviceTypeSize,
			archivedSize, 0, 0, 0, paramValueSize, n2nStringSize,
			paramActiveSize, 0, subChargeSize, 0, actTypeSize, 0 };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_INTEGER,
			FIELD_TYPE_INTEGER, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_INTEGER, FIELD_TYPE_DATE, FIELD_TYPE_DATE,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_DATE, FIELD_TYPE_STRING, FIELD_TYPE_DOUBLE,
			FIELD_TYPE_STRING, FIELD_TYPE_DATE };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] {
				this.tmpSubId,
				this.pshId,
				((this.serviceType == null) ? null
						: (this.serviceType.length() <= serviceTypeSize) ? this.serviceType
								: this.serviceType.substring(0,
										this.serviceTypeSize)),
				((this.archived == null) ? null
						: (this.archived.length() <= archivedSize) ? this.archived
								: this.archived.substring(0, this.archivedSize)),
				this.paramId,
				this.actDate,
				this.termDate,
				((this.paramValue == null) ? null
						: (this.paramValue.length() <= paramValueSize) ? this.paramValue
								: this.paramValue.substring(0,
										this.paramValueSize)),
				((this.n2nString == null) ? null
						: (this.n2nString.length() <= n2nStringSize) ? this.n2nString
								: this.n2nString.substring(0,
										this.n2nStringSize)),
				((this.paramActive == null) ? null
						: (this.paramActive.length() <= paramActiveSize) ? this.paramActive
								: this.paramActive.substring(0,
										this.paramActiveSize)),
				this.deacDate,
				((this.subCharge == null) ? null
						: (this.subCharge.length() <= subChargeSize) ? this.subCharge
								: this.subCharge.substring(0,
										this.subChargeSize)),
				this.chgValue,
				((this.actType == null) ? null
						: (this.actType.length() <= actTypeSize) ? this.actType
								: this.actType.substring(0, this.actTypeSize)),
				this.actionDate };
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
		this.tmpSubId = ((Integer) fields[0]);
		this.pshId = ((Integer) fields[1]);
		this.serviceType = rtrim((String) fields[2]);
		this.archived = rtrim((String) fields[3]);
		this.paramId = ((Integer) fields[4]);
		this.actDate = ((fields[5] == null) ? null : new Date(fields[5]));
		this.termDate = ((fields[6] == null) ? null : new Date(fields[6]));
		this.paramValue = rtrim((String) fields[7]);
		this.n2nString = rtrim((String) fields[8]);
		this.paramActive = rtrim((String) fields[9]);
		this.deacDate = ((fields[10] == null) ? null : new Date(fields[10]));
		this.subCharge = rtrim((String) fields[11]);
		this.chgValue = ((Double) fields[12]);
		this.actType = rtrim((String) fields[13]);
		this.actionDate = ((fields[14] == null) ? null : new Date(fields[14]));
	}

	public void set(final Integer tmpSubId, final Integer pshId,
			final String serviceType, final String archived,
			final Integer paramId, final Date actDate, final Date termDate,
			final String paramValue, final String n2nString,
			final String paramActive, final Date deacDate,
			final String subCharge, final Double chgValue,
			final String actType, final Date actionDate) {

		this.tmpSubId = tmpSubId;
		this.pshId = pshId;
		this.serviceType = serviceType;
		this.archived = archived;
		this.paramId = paramId;
		this.actDate = actDate;
		this.termDate = termDate;
		this.paramValue = paramValue;
		this.n2nString = n2nString;
		this.paramActive = paramActive;
		this.deacDate = deacDate;
		this.subCharge = subCharge;
		this.chgValue = chgValue;
		this.actType = actType;
		this.actionDate = actionDate;
	}

	public Integer getTmpSubId() {
		return tmpSubId;
	}

	public void setTmpSubId(Integer tmpSubId) {
		this.tmpSubId = tmpSubId;
	}

	public Integer getPshId() {
		return pshId;
	}

	public void setPshId(Integer pshId) {
		this.pshId = pshId;
	}

	public String getServiceType() {
		return serviceType;
	}

	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	public String getArchived() {
		return archived;
	}

	public void setArchived(String archived) {
		this.archived = archived;
	}

	public Integer getParamId() {
		return paramId;
	}

	public void setParamId(Integer paramId) {
		this.paramId = paramId;
	}

	public Date getActDate() {
		return actDate;
	}

	public void setActDate(Date actDate) {
		this.actDate = actDate;
	}

	public Date getTermDate() {
		return termDate;
	}

	public void setTermDate(Date termDate) {
		this.termDate = termDate;
	}

	public String getParamValue() {
		return paramValue;
	}

	public void setParamValue(String paramValue) {
		this.paramValue = paramValue;
	}

	public String getN2nString() {
		return n2nString;
	}

	public void setN2nString(String n2nString) {
		this.n2nString = n2nString;
	}

	public String getParamActive() {
		return paramActive;
	}

	public void setParamActive(String paramActive) {
		this.paramActive = paramActive;
	}

	public Date getDeacDate() {
		return deacDate;
	}

	public void setDeacDate(Date deacDate) {
		this.deacDate = deacDate;
	}

	public String getSubCharge() {
		return subCharge;
	}

	public void setSubCharge(String subCharge) {
		this.subCharge = subCharge;
	}

	public Double getChgValue() {
		return chgValue;
	}

	public void setChgValue(Double chgValue) {
		this.chgValue = chgValue;
	}

	public String getActType() {
		return actType;
	}

	public void setActType(String actType) {
		this.actType = actType;
	}

	public Date getActionDate() {
		return actionDate;
	}

	public void setActionDate(Date actionDate) {
		this.actionDate = actionDate;
	}

	@Override
	public String toString() {
		return "\nTmpPrmslinkservCDMO [\ntmpSubId=" + tmpSubId + "\npshId=" + pshId
				+"\nserviceType=" + serviceType + "\narchived=" + archived
				+ "\nparamId=" + paramId + "\nactDate=" + actDate
				+ "\ntermDate=" + termDate + "\nparamValue=" + paramValue
				+ "\nn2nString=" + n2nString + "\nparamActive=" + paramActive
				+ "\ndeacDate=" + deacDate + "\nsubCharge=" + subCharge
				+ "\nchgValue=" + chgValue + "\nactType=" + actType
				+ "\nactionDate=" + actionDate + "]";
	}

}
