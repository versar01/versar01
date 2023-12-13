package com.eppixcomm.eppix.base.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;

public class ActivationPendDMO extends DBO implements Serializable {

	private String MsisdnNo;
	private String SimNo;

	public static final int MsisdnNoFilter = 0;
	private static final int MsisdnNoSize = 15;

	public static final int SimNoFilter = 1;
	private static final int SimNoSize = 14;

	public ActivationPendDMO() {
	};

	public ActivationPendDMO(final String MsisdnNo, final String SimNo) {

		this.MsisdnNo = MsisdnNo;
		this.SimNo = SimNo;
	};

	private static final int[] fieldSizes = new int[] { MsisdnNoSize, SimNoSize };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_STRING,
			FIELD_TYPE_STRING };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] {
				((this.MsisdnNo == null) ? null
						: (this.MsisdnNo.length() <= MsisdnNoSize) ? this.MsisdnNo
								: this.MsisdnNo.substring(0, this.MsisdnNoSize)),
				((this.SimNo == null) ? null
						: (this.SimNo.length() <= SimNoSize) ? this.SimNo
								: this.SimNo.substring(0, this.SimNoSize)) };
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
		return new DAOArgs().arg(this.MsisdnNo);
	}

	protected void set(Object[] fields) {
		this.MsisdnNo = rtrim((String) fields[0]);
		this.SimNo = rtrim((String) fields[1]);
	}

	public void set(final String MsisdnNo, final String SimNo) {

		this.MsisdnNo = MsisdnNo;
		this.SimNo = SimNo;
	}

	public String getMsisdnNo() {
		return MsisdnNo;
	}

	public void setMsisdnNo(String msisdnNo) {
		MsisdnNo = msisdnNo;
	}

	public String getSimNo() {
		return SimNo;
	}

	public void setSimNo(String simNo) {
		SimNo = simNo;
	}

}