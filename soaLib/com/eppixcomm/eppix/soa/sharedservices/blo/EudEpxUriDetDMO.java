package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;

public class EudEpxUriDetDMO extends DBO implements Serializable {

	private Integer eudEuhId;
	private String eudEuhKey;
	private Integer eudSeq;
	private String eudAddress;

	public static final int eudEuhIdFilter = 0;

	public static final int eudEuhKeyFilter = 1;
	private static final int eudEuhKeySize = 10;

	public static final int eudSeqFilter = 2;

	public static final int eudAddressFilter = 3;
	private static final int eudAddressSize = 500;

	public EudEpxUriDetDMO() {
	};

	public EudEpxUriDetDMO(final Integer eudEuhId, final String eudEuhKey,
			final Integer eudSeq, final String eudAddress) {

		this.eudEuhId = eudEuhId;
		this.eudEuhKey = eudEuhKey;
		this.eudSeq = eudSeq;
		this.eudAddress = eudAddress;
	};

	private static final int[] fieldSizes = new int[] { 0, eudEuhKeySize, 0,
			eudAddressSize };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_INTEGER,
			FIELD_TYPE_STRING, FIELD_TYPE_INTEGER, FIELD_TYPE_STRING };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] {
				this.eudEuhId,
				((this.eudEuhKey == null) ? null
						: (this.eudEuhKey.length() <= eudEuhKeySize) ? this.eudEuhKey
								: this.eudEuhKey.substring(0,
										this.eudEuhKeySize)),
				this.eudSeq,
				((this.eudAddress == null) ? null
						: (this.eudAddress.length() <= eudAddressSize) ? this.eudAddress
								: this.eudAddress.substring(0,
										this.eudAddressSize)) };
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
		this.eudEuhId = ((Integer) fields[0]);
		this.eudEuhKey = rtrim((String) fields[1]);
		this.eudSeq = ((Integer) fields[2]);
		this.eudAddress = rtrim((String) fields[3]);
	}

	public void set(final Integer eudEuhId, final String eudEuhKey,
			final Integer eudSeq, final String eudAddress) {

		this.eudEuhId = eudEuhId;
		this.eudEuhKey = eudEuhKey;
		this.eudSeq = eudSeq;
		this.eudAddress = eudAddress;
	}

	public Integer getEudEuhId() {
		return eudEuhId;
	}

	public void setEudEuhId(Integer eudEuhId) {
		this.eudEuhId = eudEuhId;
	}

	public String getEudEuhKey() {
		return eudEuhKey;
	}

	public void setEudEuhKey(String eudEuhKey) {
		this.eudEuhKey = eudEuhKey;
	}

	public Integer getEudSeq() {
		return eudSeq;
	}

	public void setEudSeq(Integer eudSeq) {
		this.eudSeq = eudSeq;
	}

	public String getEudAddress() {
		return eudAddress;
	}

	public void setEudAddress(String eudAddress) {
		this.eudAddress = eudAddress;
	}
}
