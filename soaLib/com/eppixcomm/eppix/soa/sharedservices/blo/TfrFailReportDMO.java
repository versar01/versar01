package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;

public class TfrFailReportDMO extends DBO implements Serializable {

	private String tfrSimNo;
	private String tfrSimMessage;

	public static final int tfrSimNoFilter = 0;
	private static final int tfrSimNoSize = 14;

	public static final int tfrSimMessageFilter = 1;
	private static final int tfrSimMessageSize = 80;

	public TfrFailReportDMO() {
	};

	public TfrFailReportDMO(final String tfrSimNo, final String tfrSimMessage) {

		this.tfrSimNo = tfrSimNo;
		this.tfrSimMessage = tfrSimMessage;
	};

	private static final int[] fieldSizes = new int[] { tfrSimNoSize,
			tfrSimMessageSize };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_STRING,
			FIELD_TYPE_STRING };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] {
				((this.tfrSimNo == null) ? null
						: (this.tfrSimNo.length() <= tfrSimNoSize) ? this.tfrSimNo
								: this.tfrSimNo.substring(0, this.tfrSimNoSize)),
				((this.tfrSimMessage == null) ? null : (this.tfrSimMessage
						.length() <= tfrSimMessageSize) ? this.tfrSimMessage
						: this.tfrSimMessage.substring(0,
								this.tfrSimMessageSize)) };
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
		return new DAOArgs(1).arg(this.tfrSimNo);
	}

	protected void set(Object[] fields) {
		this.tfrSimNo = rtrim((String) fields[0]);
		this.tfrSimMessage = rtrim((String) fields[1]);
	}

	public void set(final String tfrSimNo, final String tfrSimMessage) {

		this.tfrSimNo = tfrSimNo;
		this.tfrSimMessage = tfrSimMessage;
	}

	public String getTfrSimNo() {
		return tfrSimNo;
	}

	public void setTfrSimNo(String tfrSimNo) {
		this.tfrSimNo = tfrSimNo;
	}

	public String getTfrSimMessage() {
		return tfrSimMessage;
	}

	public void setTfrSimMessage(String tfrSimMessage) {
		this.tfrSimMessage = tfrSimMessage;
	}

}
