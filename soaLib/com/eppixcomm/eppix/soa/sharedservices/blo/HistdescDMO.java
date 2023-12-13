package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;

public class HistdescDMO extends DBO implements Serializable {

	private String dcode;
	private String ddesc;
	private String dflag;

	public static final int dcodeFilter = 0;
	private static final int dcodeSize = 10;

	public static final int ddescFilter = 1;
	private static final int ddescSize = 32;

	public static final int dflagFilter = 2;
	private static final int dflagSize = 1;

	public HistdescDMO() {
	};

	public HistdescDMO(final String dcode, final String ddesc,
			final String dflag) {

		this.dcode = dcode;
		this.ddesc = ddesc;
		this.dflag = dflag;
	};

	private static final int[] fieldSizes = new int[] { dcodeSize, ddescSize,
			dflagSize };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] {
				((this.dcode == null) ? null
						: (this.dcode.length() <= dcodeSize) ? this.dcode
								: this.dcode.substring(0, this.dcodeSize)),
				((this.ddesc == null) ? null
						: (this.ddesc.length() <= ddescSize) ? this.ddesc
								: this.ddesc.substring(0, this.ddescSize)),
				((this.dflag == null) ? null
						: (this.dflag.length() <= dflagSize) ? this.dflag
								: this.dflag.substring(0, this.dflagSize)) };
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
		return new DAOArgs(2).arg(this.dcode).arg(this.dflag);
	}

	protected void set(Object[] fields) {
		this.dcode = rtrim((String) fields[0]);
		this.ddesc = rtrim((String) fields[1]);
		this.dflag = rtrim((String) fields[2]);
	}

	public void set(final String dcode, final String ddesc, final String dflag) {

		this.dcode = dcode;
		this.ddesc = ddesc;
		this.dflag = dflag;
	}

	public String getDcode() {
		return dcode;
	}

	public void setDcode(String dcode) {
		this.dcode = dcode;
	}

	public String getDdesc() {
		return ddesc;
	}

	public void setDdesc(String ddesc) {
		this.ddesc = ddesc;
	}

	public String getDflag() {
		return dflag;
	}

	public void setDflag(String dflag) {
		this.dflag = dflag;
	}

}
