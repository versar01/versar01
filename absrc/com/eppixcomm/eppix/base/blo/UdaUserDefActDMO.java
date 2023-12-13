package com.eppixcomm.eppix.base.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;

public class UdaUserDefActDMO extends DBO
implements Serializable {

	private String udaActionId;
	private String udaActionDesc;
	private String udaActionPath;
	
	public static final int udaActionIdFilter = 0;
	private static final int udaActionIdSize = 3;

	public static final int udaActionDescFilter = 1;
	private static final int udaActionDescSize = 32;

	public static final int udaActionPathFilter = 2;
	private static final int udaActionPathSize = 80;
	
	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[]{
			( udaActionId == null ) ? null : ( ( udaActionId.length(  ) <= udaActionIdSize ) ? udaActionId : udaActionId.substring( 0, udaActionIdSize )),
			( udaActionDesc == null ) ? null : ( ( udaActionDesc.length(  ) <= udaActionDescSize ) ? udaActionDesc : udaActionDesc.substring( 0, udaActionDescSize )),
			( udaActionPath == null ) ? null : ( ( udaActionPath.length(  ) <= udaActionPathSize ) ? udaActionPath : udaActionPath.substring( 0, udaActionPathSize ))
		};
	}

	protected Integer versionNumber() {
		return null;
	}

	protected void versionNumber(Integer versionNumber) {
	}

	private static final int[] fieldSizes = new int[]{
		udaActionIdSize,
		udaActionDescSize,
		udaActionPathSize		
	};
	
	protected int[] fieldSizes() {
		return fieldSizes;
	}

	private static final int[] fieldTypes = new int[]{
		FIELD_TYPE_STRING,
		FIELD_TYPE_STRING,
		FIELD_TYPE_STRING
	};
	
	protected int[] fieldTypes() {
		return fieldTypes;
	}

	protected DAOArgs primaryKey() {
		return new DAOArgs(1).arg((this.udaActionId == null) ? null : this.udaActionId.trim());
	}

	protected void set(Object[] fields) {
		this.udaActionId = rtrim((String)fields[0]);
		this.udaActionDesc = rtrim((String)fields[1]);
		this.udaActionPath = rtrim((String)fields[2]);
	}
	
	public String getUdaActionId() {
		return udaActionId;
	}

	public void setUdaActionId(String udaActionId) {
		this.udaActionId = udaActionId;
	}

	public String getUdaActionDesc() {
		return udaActionDesc;
	}

	public void setUdaActionDesc(String udaActionDesc) {
		this.udaActionDesc = udaActionDesc;
	}

	public String getUdaActionPath() {
		return udaActionPath;
	}

	public void setUdaActionPath(String udaActionPath) {
		this.udaActionPath = udaActionPath;
	}
}
