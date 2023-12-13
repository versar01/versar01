package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;

public class HlrHomeLocRegDMO extends DBO implements Serializable {

	private String hlrNetworkId;
	private String hlrRegisterNo;
	private String hlrDescription;

	public static final int hlrNetworkIdFilter = 0;
	private static final int hlrNetworkIdSize = 5;

	public static final int hlrRegisterNoFilter = 1;
	private static final int hlrRegisterNoSize = 2;

	public static final int hlrDescriptionFilter = 2;
	private static final int hlrDescriptionSize = 30;

	public HlrHomeLocRegDMO() {
	};

	public HlrHomeLocRegDMO(final String hlrNetworkId,
			final String hlrRegisterNo, final String hlrDescription) {

		this.hlrNetworkId = hlrNetworkId;
		this.hlrRegisterNo = hlrRegisterNo;
		this.hlrDescription = hlrDescription;
	};

	private static final int[] fieldSizes = new int[] { hlrNetworkIdSize,
			hlrRegisterNoSize, hlrDescriptionSize };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] {
				((this.hlrNetworkId == null) ? null : (this.hlrNetworkId
						.length() <= hlrNetworkIdSize) ? this.hlrNetworkId
						: this.hlrNetworkId.substring(0, this.hlrNetworkIdSize)),
				((this.hlrRegisterNo == null) ? null : (this.hlrRegisterNo
						.length() <= hlrRegisterNoSize) ? this.hlrRegisterNo
						: this.hlrRegisterNo.substring(0,
								this.hlrRegisterNoSize)),
				((this.hlrDescription == null) ? null : (this.hlrDescription
						.length() <= hlrDescriptionSize) ? this.hlrDescription
						: this.hlrDescription.substring(0,
								this.hlrDescriptionSize)) };
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
		return new DAOArgs(2).arg(this.hlrNetworkId).arg(this.hlrRegisterNo);
	}

	protected void set(Object[] fields) {
		this.hlrNetworkId = rtrim((String) fields[0]);
		this.hlrRegisterNo = rtrim((String) fields[1]);
		this.hlrDescription = rtrim((String) fields[2]);
	}

	public void set(final String hlrNetworkId, final String hlrRegisterNo,
			final String hlrDescription) {

		this.hlrNetworkId = hlrNetworkId;
		this.hlrRegisterNo = hlrRegisterNo;
		this.hlrDescription = hlrDescription;
	}

	public String getHlrNetworkId() {
		return hlrNetworkId;
	}

	public void setHlrNetworkId(String hlrNetworkId) {
		this.hlrNetworkId = hlrNetworkId;
	}

	public String getHlrRegisterNo() {
		return hlrRegisterNo;
	}

	public void setHlrRegisterNo(String hlrRegisterNo) {
		this.hlrRegisterNo = hlrRegisterNo;
	}

	public String getHlrDescription() {
		return hlrDescription;
	}

	public void setHlrDescription(String hlrDescription) {
		this.hlrDescription = hlrDescription;
	}

}
