package com.eppixcomm.eppix.base.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;

public class ShcSmsHistcodeDMO extends DBO implements Serializable {

	private Integer ShcMesgId;
	private String ShcHistCode;

	public static final int ShcMesgIdFilter = 0;

	public static final int ShcHistCodeFilter = 1;
	private static final int ShcHistCodeSize = 10;

	public ShcSmsHistcodeDMO() {
	};

	public ShcSmsHistcodeDMO(final Integer ShcMesgId, final String ShcHistCode) {

		this.ShcMesgId = ShcMesgId;
		this.ShcHistCode = ShcHistCode;
	};

	private static final int[] fieldSizes = new int[] { 0, ShcHistCodeSize };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_INTEGER,
			FIELD_TYPE_STRING };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] {
				this.ShcMesgId,
				((this.ShcHistCode == null) ? null
						: (this.ShcHistCode.length() <= ShcHistCodeSize) ? this.ShcHistCode
								: this.ShcHistCode.substring(0,
										this.ShcHistCodeSize)) };
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
		return new DAOArgs().arg(this.ShcHistCode);
	}

	protected void set(Object[] fields) {
		this.ShcMesgId = ((Integer) fields[0]);
		this.ShcHistCode = rtrim((String) fields[1]);
	}

	public void set(final Integer ShcMesgId, final String ShcHistCode) {

		this.ShcMesgId = ShcMesgId;
		this.ShcHistCode = ShcHistCode;
	}

	public Integer getShcMesgId() {
		return ShcMesgId;
	}

	public void setShcMesgId(Integer shcMesgId) {
		ShcMesgId = shcMesgId;
	}

	public String getShcHistCode() {
		return ShcHistCode;
	}

	public void setShcHistCode(String shcHistCode) {
		ShcHistCode = shcHistCode;
	}

}