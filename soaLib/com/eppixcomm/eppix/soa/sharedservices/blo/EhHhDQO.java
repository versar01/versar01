package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;
import com.eppixcomm.eppix.common.util.Date;

public class EhHhDQO extends DBO implements Serializable {

	private EhEppixHierarchyDMO ehDMO;
	private HhHierarchyHeadDMO hhDMO;

	private Integer ehSerial;
	private Integer ehEntityId;
	private String ehType;
	private String ehValue;
	private Integer ehLink;
	private String ehHierType;
	private String hhType;
	private Integer hhSerial;
	private String hhName;
	private Date hhActiveDate;
	private Date hhDeactiveDate;

	public static final int ehSerialFilter = 0;

	public static final int ehEntityIdFilter = 1;

	public static final int ehTypeFilter = 2;
	private static final int ehTypeSize = 10;

	public static final int ehValueFilter = 3;
	private static final int ehValueSize = 32;

	public static final int ehLinkFilter = 4;

	public static final int ehHierTypeFilter = 5;
	private static final int ehHierTypeSize = 10;

	public static final int hhTypeFilter = 6;
	private static final int hhTypeSize = 10;

	public static final int hhSerialFilter = 7;

	public static final int hhNameFilter = 8;
	private static final int hhNameSize = 50;

	public static final int hhActiveDateFilter = 9;

	public static final int hhDeactiveDateFilter = 10;

	public EhHhDQO() {
	};
	
	public void deConstruct(){
		ehDMO = new EhEppixHierarchyDMO(ehSerial, ehEntityId, ehType, ehValue, ehLink, ehHierType);
		hhDMO = new HhHierarchyHeadDMO(hhType, hhSerial, hhName, hhActiveDate, hhDeactiveDate);
	}

	public EhHhDQO(final Integer ehSerial, final Integer ehEntityId,
			final String ehType, final String ehValue, final Integer ehLink,
			final String ehHierType, final String hhType,
			final Integer hhSerial, final String hhName,
			final Date hhActiveDate, final Date hhDeactiveDate) {

		this.ehSerial = ehSerial;
		this.ehEntityId = ehEntityId;
		this.ehType = ehType;
		this.ehValue = ehValue;
		this.ehLink = ehLink;
		this.ehHierType = ehHierType;
		this.hhType = hhType;
		this.hhSerial = hhSerial;
		this.hhName = hhName;
		this.hhActiveDate = hhActiveDate;
		this.hhDeactiveDate = hhDeactiveDate;
	};

	private static final int[] fieldSizes = new int[] { 0, 0, ehTypeSize,
			ehValueSize, 0, ehHierTypeSize, hhTypeSize, 0, hhNameSize, 0, 0 };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_INTEGER,
			FIELD_TYPE_INTEGER, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_INTEGER, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_INTEGER, FIELD_TYPE_STRING, FIELD_TYPE_DATE,
			FIELD_TYPE_DATE };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] {
				this.ehSerial,
				this.ehEntityId,
				((this.ehType == null) ? null
						: (this.ehType.length() <= ehTypeSize) ? this.ehType
								: this.ehType.substring(0, this.ehTypeSize)),
				((this.ehValue == null) ? null
						: (this.ehValue.length() <= ehValueSize) ? this.ehValue
								: this.ehValue.substring(0, this.ehValueSize)),
				this.ehLink,
				((this.ehHierType == null) ? null
						: (this.ehHierType.length() <= ehHierTypeSize) ? this.ehHierType
								: this.ehHierType.substring(0,
										this.ehHierTypeSize)),
				((this.hhType == null) ? null
						: (this.hhType.length() <= hhTypeSize) ? this.hhType
								: this.hhType.substring(0, this.hhTypeSize)),
				this.hhSerial,
				((this.hhName == null) ? null
						: (this.hhName.length() <= hhNameSize) ? this.hhName
								: this.hhName.substring(0, this.hhNameSize)),
				this.hhActiveDate, this.hhDeactiveDate };
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
		this.ehSerial = (Integer) fields[0];
		this.ehEntityId = ((Integer) fields[1]);
		this.ehType = rtrim((String) fields[2]);
		this.ehValue = rtrim((String) fields[3]);
		this.ehLink = ((Integer) fields[4]);
		this.ehHierType = rtrim((String) fields[5]);
		this.hhType = rtrim((String) fields[6]);
		this.hhSerial = (Integer) fields[7];
		this.hhName = rtrim((String) fields[8]);
		this.hhActiveDate = ((fields[9] == null) ? null : new Date(fields[9]));
		this.hhDeactiveDate = ((fields[10] == null) ? null : new Date(
				fields[10]));
	}

	public void set(final Integer ehSerial, final Integer ehEntityId,
			final String ehType, final String ehValue, final Integer ehLink,
			final String ehHierType, final String hhType,
			final Integer hhSerial, final String hhName,
			final Date hhActiveDate, final Date hhDeactiveDate) {

		this.ehSerial = ehSerial;
		this.ehEntityId = ehEntityId;
		this.ehType = ehType;
		this.ehValue = ehValue;
		this.ehLink = ehLink;
		this.ehHierType = ehHierType;
		this.hhType = hhType;
		this.hhSerial = hhSerial;
		this.hhName = hhName;
		this.hhActiveDate = hhActiveDate;
		this.hhDeactiveDate = hhDeactiveDate;
	}

	public EhEppixHierarchyDMO getEhDMO() {
		return ehDMO;
	}

	public void setEhDMO(EhEppixHierarchyDMO ehDMO) {
		this.ehDMO = ehDMO;
	}

	public HhHierarchyHeadDMO getHhDMO() {
		return hhDMO;
	}

	public void setHhDMO(HhHierarchyHeadDMO hhDMO) {
		this.hhDMO = hhDMO;
	}

	public Integer getEhSerial() {
		return ehSerial;
	}

	public void setEhSerial(Integer ehSerial) {
		this.ehSerial = ehSerial;
	}

	public Integer getEhEntityId() {
		return ehEntityId;
	}

	public void setEhEntityId(Integer ehEntityId) {
		this.ehEntityId = ehEntityId;
	}

	public String getEhType() {
		return ehType;
	}

	public void setEhType(String ehType) {
		this.ehType = ehType;
	}

	public String getEhValue() {
		return ehValue;
	}

	public void setEhValue(String ehValue) {
		this.ehValue = ehValue;
	}

	public Integer getEhLink() {
		return ehLink;
	}

	public void setEhLink(Integer ehLink) {
		this.ehLink = ehLink;
	}

	public String getEhHierType() {
		return ehHierType;
	}

	public void setEhHierType(String ehHierType) {
		this.ehHierType = ehHierType;
	}

	public String getHhType() {
		return hhType;
	}

	public void setHhType(String hhType) {
		this.hhType = hhType;
	}

	public Integer getHhSerial() {
		return hhSerial;
	}

	public void setHhSerial(Integer hhSerial) {
		this.hhSerial = hhSerial;
	}

	public String getHhName() {
		return hhName;
	}

	public void setHhName(String hhName) {
		this.hhName = hhName;
	}

	public Date getHhActiveDate() {
		return hhActiveDate;
	}

	public void setHhActiveDate(Date hhActiveDate) {
		this.hhActiveDate = hhActiveDate;
	}

	public Date getHhDeactiveDate() {
		return hhDeactiveDate;
	}

	public void setHhDeactiveDate(Date hhDeactiveDate) {
		this.hhDeactiveDate = hhDeactiveDate;
	}

}
