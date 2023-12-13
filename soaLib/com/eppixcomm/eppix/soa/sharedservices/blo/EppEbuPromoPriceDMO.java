package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;

public class EppEbuPromoPriceDMO extends DBO implements Serializable {

	private Integer eppHierarchyId;
	private String eppShortname;
	private String eppDescription;
	private Integer eppVolume;
	private Double eppSubsExcl;
	private Double eppCiExclNohandset;
	private Double eppCiExclHandset;
	private String eppStatus;

	public static final int eppHierarchyIdFilter = 0;

	public static final int eppShortnameFilter = 1;
	private static final int eppShortnameSize = 65;

	public static final int eppDescriptionFilter = 2;
	private static final int eppDescriptionSize = 256;

	public static final int eppVolumeFilter = 3;

	public static final int eppSubsExclFilter = 4;

	public static final int eppCiExclNohandsetFilter = 5;

	public static final int eppCiExclHandsetFilter = 6;

	public static final int eppStatusFilter = 7;
	private static final int eppStatusSize = 1;

	public EppEbuPromoPriceDMO() {
	};

	public EppEbuPromoPriceDMO(final Integer eppHierarchyId,
			final String eppShortname, final String eppDescription,
			final Integer eppVolume, final Double eppSubsExcl,
			final Double eppCiExclNohandset, final Double eppCiExclHandset,
			final String eppStatus) {

		this.eppHierarchyId = eppHierarchyId;
		this.eppShortname = eppShortname;
		this.eppDescription = eppDescription;
		this.eppVolume = eppVolume;
		this.eppSubsExcl = eppSubsExcl;
		this.eppCiExclNohandset = eppCiExclNohandset;
		this.eppCiExclHandset = eppCiExclHandset;
		this.eppStatus = eppStatus;
	};

	private static final int[] fieldSizes = new int[] { 0, eppShortnameSize,
			eppDescriptionSize, 0, 0, 0, 0, eppStatusSize };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_INTEGER,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_INTEGER,
			FIELD_TYPE_DOUBLE, FIELD_TYPE_DOUBLE, FIELD_TYPE_DOUBLE,
			FIELD_TYPE_STRING };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] {
				this.eppHierarchyId,
				((this.eppShortname == null) ? null : (this.eppShortname
						.length() <= eppShortnameSize) ? this.eppShortname
						: this.eppShortname.substring(0, this.eppShortnameSize)),
				((this.eppDescription == null) ? null : (this.eppDescription
						.length() <= eppDescriptionSize) ? this.eppDescription
						: this.eppDescription.substring(0,
								this.eppDescriptionSize)),
				this.eppVolume,
				this.eppSubsExcl,
				this.eppCiExclNohandset,
				this.eppCiExclHandset,
				((this.eppStatus == null) ? null
						: (this.eppStatus.length() <= eppStatusSize) ? this.eppStatus
								: this.eppStatus.substring(0,
										this.eppStatusSize)) };
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
		return new DAOArgs(3).arg(this.eppHierarchyId).arg(this.eppShortname)
				.arg(this.eppStatus);
	}

	protected void set(Object[] fields) {
		this.eppHierarchyId = ((Integer) fields[0]);
		this.eppShortname = rtrim((String) fields[1]);
		this.eppDescription = rtrim((String) fields[2]);
		this.eppVolume = ((Integer) fields[3]);
		this.eppSubsExcl = ((Double) fields[4]);
		this.eppCiExclNohandset = ((Double) fields[5]);
		this.eppCiExclHandset = ((Double) fields[6]);
		this.eppStatus = rtrim((String) fields[7]);
	}

	public void set(final Integer eppHierarchyId, final String eppShortname,
			final String eppDescription, final Integer eppVolume,
			final Double eppSubsExcl, final Double eppCiExclNohandset,
			final Double eppCiExclHandset, final String eppStatus) {

		this.eppHierarchyId = eppHierarchyId;
		this.eppShortname = eppShortname;
		this.eppDescription = eppDescription;
		this.eppVolume = eppVolume;
		this.eppSubsExcl = eppSubsExcl;
		this.eppCiExclNohandset = eppCiExclNohandset;
		this.eppCiExclHandset = eppCiExclHandset;
		this.eppStatus = eppStatus;
	}

	public Integer getEppHierarchyId() {
		return eppHierarchyId;
	}

	public void setEppHierarchyId(Integer eppHierarchyId) {
		this.eppHierarchyId = eppHierarchyId;
	}

	public String getEppShortname() {
		return eppShortname;
	}

	public void setEppShortname(String eppShortname) {
		this.eppShortname = eppShortname;
	}

	public String getEppDescription() {
		return eppDescription;
	}

	public void setEppDescription(String eppDescription) {
		this.eppDescription = eppDescription;
	}

	public Integer getEppVolume() {
		return eppVolume;
	}

	public void setEppVolume(Integer eppVolume) {
		this.eppVolume = eppVolume;
	}

	public Double getEppSubsExcl() {
		return eppSubsExcl;
	}

	public void setEppSubsExcl(Double eppSubsExcl) {
		this.eppSubsExcl = eppSubsExcl;
	}

	public Double getEppCiExclNohandset() {
		return eppCiExclNohandset;
	}

	public void setEppCiExclNohandset(Double eppCiExclNohandset) {
		this.eppCiExclNohandset = eppCiExclNohandset;
	}

	public Double getEppCiExclHandset() {
		return eppCiExclHandset;
	}

	public void setEppCiExclHandset(Double eppCiExclHandset) {
		this.eppCiExclHandset = eppCiExclHandset;
	}

	public String getEppStatus() {
		return eppStatus;
	}

	public void setEppStatus(String eppStatus) {
		this.eppStatus = eppStatus;
	}

}
