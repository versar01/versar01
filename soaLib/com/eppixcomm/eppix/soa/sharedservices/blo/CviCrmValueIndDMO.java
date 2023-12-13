package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;

public class CviCrmValueIndDMO extends DBO implements Serializable {

	private String cviCrmValue;
	private String cviKeyWord;
	private Integer cviCrmColour;

	public static final int cviCrmValueFilter = 0;
	private static final int cviCrmValueSize = 8;

	public static final int cviKeyWordFilter = 1;
	private static final int cviKeyWordSize = 16;

	public static final int cviCrmColourFilter = 2;

	public CviCrmValueIndDMO() {
	};

	public CviCrmValueIndDMO(final String cviCrmValue, final String cviKeyWord,
			final Integer cviCrmColour) {

		this.cviCrmValue = cviCrmValue;
		this.cviKeyWord = cviKeyWord;
		this.cviCrmColour = cviCrmColour;
	};

	private static final int[] fieldSizes = new int[] { cviCrmValueSize,
			cviKeyWordSize, 0 };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_INTEGER };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] {
				((this.cviCrmValue == null) ? null
						: (this.cviCrmValue.length() <= cviCrmValueSize) ? this.cviCrmValue
								: this.cviCrmValue.substring(0,
										this.cviCrmValueSize)),
				((this.cviKeyWord == null) ? null
						: (this.cviKeyWord.length() <= cviKeyWordSize) ? this.cviKeyWord
								: this.cviKeyWord.substring(0,
										this.cviKeyWordSize)),
				this.cviCrmColour };
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
		return new DAOArgs(1).arg(this.cviCrmValue);
	}

	protected void set(Object[] fields) {
		this.cviCrmValue = rtrim((String) fields[0]);
		this.cviKeyWord = rtrim((String) fields[1]);
		this.cviCrmColour = ((Integer) fields[2]);
	}

	public void set(final String cviCrmValue, final String cviKeyWord,
			final Integer cviCrmColour) {

		this.cviCrmValue = cviCrmValue;
		this.cviKeyWord = cviKeyWord;
		this.cviCrmColour = cviCrmColour;
	}

	public String getCviCrmValue() {
		return cviCrmValue;
	}

	public void setCviCrmValue(String cviCrmValue) {
		this.cviCrmValue = cviCrmValue;
	}

	public String getCviKeyWord() {
		return cviKeyWord;
	}

	public void setCviKeyWord(String cviKeyWord) {
		this.cviKeyWord = cviKeyWord;
	}

	public Integer getCviCrmColour() {
		return cviCrmColour;
	}

	public void setCviCrmColour(Integer cviCrmColour) {
		this.cviCrmColour = cviCrmColour;
	}

}
