package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;

public class PgPartnerGroupDMO extends DBO implements Serializable {

	private Integer pgGroupId;
	private Integer pgConfigId;
	private String pgGroupType;
	private Short pgGroupQuantity;

	public static final int pgGroupIdFilter = 0;
	private static final int pgGroupIdSize = 1;

	public static final int pgConfigIdFilter = 1;

	public static final int pgGroupTypeFilter = 2;
	private static final int pgGroupTypeSize = 1;

	public static final int pgGroupQuantityFilter = 3;

	public PgPartnerGroupDMO() {
	};

	public PgPartnerGroupDMO(final Integer pgGroupId, final Integer pgConfigId,
			final String pgGroupType, final Short pgGroupQuantity) {

		this.pgGroupId = pgGroupId;
		this.pgConfigId = pgConfigId;
		this.pgGroupType = pgGroupType;
		this.pgGroupQuantity = pgGroupQuantity;
	};

	private static final int[] fieldSizes = new int[] { pgGroupIdSize, 0,
			pgGroupTypeSize, 0 };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_INTEGER,
			FIELD_TYPE_INTEGER, FIELD_TYPE_STRING, FIELD_TYPE_SHORT };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] {
				this.pgGroupId,
				this.pgConfigId,
				((this.pgGroupType == null) ? null
						: (this.pgGroupType.length() <= pgGroupTypeSize) ? this.pgGroupType
								: this.pgGroupType.substring(0,
										this.pgGroupTypeSize)),
				this.pgGroupQuantity };
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
		return new DAOArgs(1).arg(this.pgGroupId);
	}

	protected void set(Object[] fields) {
		this.pgGroupId = ((Integer) fields[0]);
		this.pgConfigId = ((Integer) fields[1]);
		this.pgGroupType = rtrim((String) fields[2]);
		this.pgGroupQuantity = ((Short) fields[3]);
	}

	public void set(final Integer pgGroupId, final Integer pgConfigId,
			final String pgGroupType, final Short pgGroupQuantity) {

		this.pgGroupId = pgGroupId;
		this.pgConfigId = pgConfigId;
		this.pgGroupType = pgGroupType;
		this.pgGroupQuantity = pgGroupQuantity;
	}

	public Integer getPgGroupId() {
		return pgGroupId;
	}

	public void setPgGroupId(Integer pgGroupId) {
		this.pgGroupId = pgGroupId;
	}

	public Integer getPgConfigId() {
		return pgConfigId;
	}

	public void setPgConfigId(Integer pgConfigId) {
		this.pgConfigId = pgConfigId;
	}

	public String getPgGroupType() {
		return pgGroupType;
	}

	public void setPgGroupType(String pgGroupType) {
		this.pgGroupType = pgGroupType;
	}

	public Short getPgGroupQuantity() {
		return pgGroupQuantity;
	}

	public void setPgGroupQuantity(Short pgGroupQuantity) {
		this.pgGroupQuantity = pgGroupQuantity;
	}

}
