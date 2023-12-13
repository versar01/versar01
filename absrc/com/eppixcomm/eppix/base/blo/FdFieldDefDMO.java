package com.eppixcomm.eppix.base.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;

public class FdFieldDefDMO extends DBO implements Serializable {

	private String fdFieldName;
	private Integer fdFieldId;
	private String fdHistDesc;
	private Short fdAuditReqd;
	private String fdFieldLocked;

	public static final int fdFieldNameFilter = 0;
	private static final int fdFieldNameSize = 18;

	public static final int fdFieldIdFilter = 1;

	public static final int fdHistDescFilter = 2;
	private static final int fdHistDescSize = 50;

	public static final int fdAuditReqdFilter = 3;

	public static final int fdFieldLockedFilter = 4;
	private static final int fdFieldLockedSize = 1;

	public FdFieldDefDMO() {
	};

	public FdFieldDefDMO(final String fdFieldName, final Integer fdFieldId,
			final String fdHistDesc, final Short fdAuditReqd,
			final String fdFieldLocked) {

		this.fdFieldName = fdFieldName;
		this.fdFieldId = fdFieldId;
		this.fdHistDesc = fdHistDesc;
		this.fdAuditReqd = fdAuditReqd;
		this.fdFieldLocked = fdFieldLocked;
	};

	private static final int[] fieldSizes = new int[] { fdFieldNameSize, 0,
			fdHistDescSize, 0, fdFieldLockedSize };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_STRING,
			FIELD_TYPE_INTEGER, FIELD_TYPE_STRING, FIELD_TYPE_SHORT,
			FIELD_TYPE_STRING };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] {
				((this.fdFieldName == null) ? null
						: (this.fdFieldName.length() <= fdFieldNameSize) ? this.fdFieldName
								: this.fdFieldName.substring(0,
										this.fdFieldNameSize)),
				this.fdFieldId,
				((this.fdHistDesc == null) ? null
						: (this.fdHistDesc.length() <= fdHistDescSize) ? this.fdHistDesc
								: this.fdHistDesc.substring(0,
										this.fdHistDescSize)),
				this.fdAuditReqd,
				((this.fdFieldLocked == null) ? null : (this.fdFieldLocked
						.length() <= fdFieldLockedSize) ? this.fdFieldLocked
						: this.fdFieldLocked.substring(0,
								this.fdFieldLockedSize)) };
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
		return new DAOArgs(1).arg(this.fdFieldId);
	}

	protected void set(Object[] fields) {
		this.fdFieldName = rtrim((String) fields[0]);
		this.fdFieldId = ((Integer) fields[1]);
		this.fdHistDesc = rtrim((String) fields[2]);
		this.fdAuditReqd = ((Short) fields[3]);
		this.fdFieldLocked = rtrim((String) fields[4]);
	}

	public void set(final String fdFieldName, final Integer fdFieldId,
			final String fdHistDesc, final Short fdAuditReqd,
			final String fdFieldLocked) {

		this.fdFieldName = fdFieldName;
		this.fdFieldId = fdFieldId;
		this.fdHistDesc = fdHistDesc;
		this.fdAuditReqd = fdAuditReqd;
		this.fdFieldLocked = fdFieldLocked;
	}

	public String getFdFieldName() {
		return fdFieldName;
	}

	public void setFdFieldName(String fdFieldName) {
		this.fdFieldName = fdFieldName;
	}

	public Integer getFdFieldId() {
		return fdFieldId;
	}

	public void setFdFieldId(Integer fdFieldId) {
		this.fdFieldId = fdFieldId;
	}

	public String getFdHistDesc() {
		return fdHistDesc;
	}

	public void setFdHistDesc(String fdHistDesc) {
		this.fdHistDesc = fdHistDesc;
	}

	public Short getFdAuditReqd() {
		return fdAuditReqd;
	}

	public void setFdAuditReqd(Short fdAuditReqd) {
		this.fdAuditReqd = fdAuditReqd;
	}

	public String getFdFieldLocked() {
		return fdFieldLocked;
	}

	public void setFdFieldLocked(String fdFieldLocked) {
		this.fdFieldLocked = fdFieldLocked;
	}

}
