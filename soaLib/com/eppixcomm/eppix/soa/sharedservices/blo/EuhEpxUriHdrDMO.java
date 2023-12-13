package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;

public class EuhEpxUriHdrDMO extends DBO implements Serializable {

	private Integer euhId;
	private String euhKey;
	private String euhProtocol;
	private String euhAuthName;
	private String euhAuthPass;
	private String euhAuthHost;
	private String euhAuthPort;
	private String euhDescription;

	public static final int euhIdFilter = 0;

	public static final int euhKeyFilter = 1;
	private static final int euhKeySize = 10;

	public static final int euhProtocolFilter = 2;
	private static final int euhProtocolSize = 20;

	public static final int euhAuthNameFilter = 3;
	private static final int euhAuthNameSize = 50;

	public static final int euhAuthPassFilter = 4;
	private static final int euhAuthPassSize = 50;

	public static final int euhAuthHostFilter = 5;
	private static final int euhAuthHostSize = 50;

	public static final int euhAuthPortFilter = 6;
	private static final int euhAuthPortSize = 50;

	public static final int euhDescriptionFilter = 7;
	private static final int euhDescriptionSize = 50;

	public EuhEpxUriHdrDMO() {
	};

	public EuhEpxUriHdrDMO(final Integer euhId, final String euhKey,
			final String euhProtocol, final String euhAuthName,
			final String euhAuthPass, final String euhAuthHost,
			final String euhAuthPort, final String euhDescription) {

		this.euhId = euhId;
		this.euhKey = euhKey;
		this.euhProtocol = euhProtocol;
		this.euhAuthName = euhAuthName;
		this.euhAuthPass = euhAuthPass;
		this.euhAuthHost = euhAuthHost;
		this.euhAuthPort = euhAuthPort;
		this.euhDescription = euhDescription;
	};

	private static final int[] fieldSizes = new int[] { 0, euhKeySize,
			euhProtocolSize, euhAuthNameSize, euhAuthPassSize, euhAuthHostSize,
			euhAuthPortSize, euhDescriptionSize };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_INTEGER,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] {
				this.euhId,
				((this.euhKey == null) ? null
						: (this.euhKey.length() <= euhKeySize) ? this.euhKey
								: this.euhKey.substring(0, this.euhKeySize)),
				((this.euhProtocol == null) ? null
						: (this.euhProtocol.length() <= euhProtocolSize) ? this.euhProtocol
								: this.euhProtocol.substring(0,
										this.euhProtocolSize)),
				((this.euhAuthName == null) ? null
						: (this.euhAuthName.length() <= euhAuthNameSize) ? this.euhAuthName
								: this.euhAuthName.substring(0,
										this.euhAuthNameSize)),
				((this.euhAuthPass == null) ? null
						: (this.euhAuthPass.length() <= euhAuthPassSize) ? this.euhAuthPass
								: this.euhAuthPass.substring(0,
										this.euhAuthPassSize)),
				((this.euhAuthHost == null) ? null
						: (this.euhAuthHost.length() <= euhAuthHostSize) ? this.euhAuthHost
								: this.euhAuthHost.substring(0,
										this.euhAuthHostSize)),
				((this.euhAuthPort == null) ? null
						: (this.euhAuthPort.length() <= euhAuthPortSize) ? this.euhAuthPort
								: this.euhAuthPort.substring(0,
										this.euhAuthPortSize)),
				((this.euhDescription == null) ? null : (this.euhDescription
						.length() <= euhDescriptionSize) ? this.euhDescription
						: this.euhDescription.substring(0,
								this.euhDescriptionSize)) };
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
		this.euhId = ((Integer) fields[0]);
		this.euhKey = rtrim((String) fields[1]);
		this.euhProtocol = rtrim((String) fields[2]);
		this.euhAuthName = rtrim((String) fields[3]);
		this.euhAuthPass = rtrim((String) fields[4]);
		this.euhAuthHost = rtrim((String) fields[5]);
		this.euhAuthPort = rtrim((String) fields[6]);
		this.euhDescription = rtrim((String) fields[7]);
	}

	public void set(final Integer euhId, final String euhKey,
			final String euhProtocol, final String euhAuthName,
			final String euhAuthPass, final String euhAuthHost,
			final String euhAuthPort, final String euhDescription) {

		this.euhId = euhId;
		this.euhKey = euhKey;
		this.euhProtocol = euhProtocol;
		this.euhAuthName = euhAuthName;
		this.euhAuthPass = euhAuthPass;
		this.euhAuthHost = euhAuthHost;
		this.euhAuthPort = euhAuthPort;
		this.euhDescription = euhDescription;
	}

	public Integer getEuhId() {
		return euhId;
	}

	public void setEuhId(Integer euhId) {
		this.euhId = euhId;
	}

	public String getEuhKey() {
		return euhKey;
	}

	public void setEuhKey(String euhKey) {
		this.euhKey = euhKey;
	}

	public String getEuhProtocol() {
		return euhProtocol;
	}

	public void setEuhProtocol(String euhProtocol) {
		this.euhProtocol = euhProtocol;
	}

	public String getEuhAuthName() {
		return euhAuthName;
	}

	public void setEuhAuthName(String euhAuthName) {
		this.euhAuthName = euhAuthName;
	}

	public String getEuhAuthPass() {
		return euhAuthPass;
	}

	public void setEuhAuthPass(String euhAuthPass) {
		this.euhAuthPass = euhAuthPass;
	}

	public String getEuhAuthHost() {
		return euhAuthHost;
	}

	public void setEuhAuthHost(String euhAuthHost) {
		this.euhAuthHost = euhAuthHost;
	}

	public String getEuhAuthPort() {
		return euhAuthPort;
	}

	public void setEuhAuthPort(String euhAuthPort) {
		this.euhAuthPort = euhAuthPort;
	}

	public String getEuhDescription() {
		return euhDescription;
	}

	public void setEuhDescription(String euhDescription) {
		this.euhDescription = euhDescription;
	}

}
