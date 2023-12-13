package com.eppixcomm.eppix.base.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;
import com.eppixcomm.eppix.common.util.DateTime;

public class RicaVerificationAuditDMO extends DBO implements Serializable {
	// Globals
	private Integer rvaSerial;
	private Integer rvaRpvSerial;
	private String rvaRicaStatus;
	private String rvaAction;
	private DateTime rvaDatetimeActioned;
	private String rvaRicaOfficer;
	private String rvaProcessAgent;

	public RicaVerificationAuditDMO() {

	}

	public RicaVerificationAuditDMO(final Integer rvaSerial,
			final Integer rvaRpvSerial, final String rvaRicaStatus,
			final String rvaAction, final DateTime rvaDatetimeActioned,
			final String rvaRicaOfficer, final String rvaProcessAgent) {
		this.rvaSerial = rvaSerial;
		this.rvaRpvSerial = rvaRpvSerial;
		this.rvaRicaStatus = rvaRicaStatus;
		this.rvaAction = rvaAction;
		this.rvaDatetimeActioned = rvaDatetimeActioned;
		this.rvaRicaOfficer = rvaRicaOfficer;
		this.rvaProcessAgent = rvaProcessAgent;
	}

	private static int[] fieldTypes = new int[] { FIELD_TYPE_INTEGER,
			FIELD_TYPE_INTEGER, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_DATETIME, FIELD_TYPE_STRING, FIELD_TYPE_STRING };

	public static final int rvaSerialFilter = 0;

	public static final int rvaRpvSerialFilter = 1;

	public static final int rvaRicaStatusFilter = 2;
	public static final int rvaRicaStatusSize = 1;

	public static final int rvaActionFilter = 3;
	public static final int rvaActionSize = 10;

	public static final int rvaDatetimeActionedFilter = 4;

	public static final int rvaRicaOfficerFilter = 5;
	public static final int rvaRicaOfficerSize = 50;

	public static final int rvaProcessAgentFilter = 6;
	public static final int rvaProcessAgentSize = 50;

	protected void generatedKey(final Integer key) {
	    this.rvaSerial = key;
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
		return new DAOArgs(1).arg(this.rvaSerial);
	}

	protected Object[] get() {
		return new Object[] {
				rvaSerial,
				rvaRpvSerial,

				(rvaRicaStatus == null) ? null
						: ((rvaRicaStatus.length() <= rvaRicaStatusSize) ? rvaRicaStatus
								: rvaRicaStatus.substring(0, rvaRicaStatusSize)),

				(rvaAction == null) ? null
						: ((rvaAction.length() <= rvaActionSize) ? rvaAction
								: rvaAction.substring(0, rvaActionSize)),

				rvaDatetimeActioned,

				(rvaRicaOfficer == null) ? null
						: ((rvaRicaOfficer.length() <= rvaRicaOfficerSize) ? rvaRicaOfficer
								: rvaRicaOfficer.substring(0,
										rvaRicaOfficerSize)),

				(rvaProcessAgent == null) ? null
						: ((rvaProcessAgent.length() <= rvaProcessAgentSize) ? rvaProcessAgent
								: rvaProcessAgent.substring(0,
										rvaProcessAgentSize))

		};
	}

	private static int[] fieldSizes = new int[] { 0, 0, rvaRicaStatusSize,
			rvaActionSize, 0, rvaRicaOfficerSize, rvaProcessAgentSize };

	public Integer getRvaSerial() {
		return rvaSerial;
	}

	public void setRvaSerial(Integer rvaSerial) {
		this.rvaSerial = rvaSerial;
	}

	public Integer getRvaRpvSerial() {
		return rvaRpvSerial;
	}

	public void setRvaRpvSerial(Integer rvaRpvSerial) {
		this.rvaRpvSerial = rvaRpvSerial;
	}

	public String getRvaRicaStatus() {
		return rvaRicaStatus;
	}

	public void setRvaRicaStatus(String rvaRicaStatus) {
		this.rvaRicaStatus = this.getPadded(rvaRicaStatus, rvaRicaStatusSize);
	}

	public String getRvaAction() {
		return rvaAction;
	}

	public void setRvaAction(String rvaAction) {
		this.rvaAction = this.getPadded(rvaAction, rvaActionSize);
	}

	public DateTime getRvaDatetimeActioned() {
		return rvaDatetimeActioned;
	}

	public void setRvaDatetimeActioned(DateTime rvaDatetimeActioned) {
		this.rvaDatetimeActioned = rvaDatetimeActioned;
	}

	public String getRvaRicaOfficer() {
		return rvaRicaOfficer;
	}

	public void setRvaRicaOfficer(String rvaRicaOfficer) {
		this.rvaRicaOfficer = this
				.getPadded(rvaRicaOfficer, rvaRicaOfficerSize);
	}

	public String getRvaProcessAgent() {
		return rvaProcessAgent;
	}

	public void setRvaProcessAgent(String rvaProcessAgent) {
		this.rvaProcessAgent = this.getPadded(rvaProcessAgent,
				rvaProcessAgentSize);
	}

	protected void set(Object[] fields) {
		this.rvaSerial = (Integer) fields[0];
		this.rvaRpvSerial = (Integer) fields[1];
		this.rvaRicaStatus = rtrim((String) fields[2]);
		this.rvaAction = rtrim((String) fields[3]);
		this.rvaDatetimeActioned = (DateTime) fields[4];
		this.rvaRicaOfficer = rtrim((String) fields[5]);
		this.rvaProcessAgent = rtrim((String) fields[6]);		
	}
}