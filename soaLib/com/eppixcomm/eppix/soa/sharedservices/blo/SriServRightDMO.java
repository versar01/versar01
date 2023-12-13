package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;
import com.eppixcomm.eppix.common.util.DateTime;

public class SriServRightDMO extends DBO implements Serializable {

	private String sriServiceCode;
	private String sriServiceType;
	private Integer sriParameterId;
	private String sriParamValue;
	private String sriServiceAction;
	private String sriRight;
	private DateTime sriDatetime;

	public static final int sriServiceCodeFilter = 0;
	private static final int sriServiceCodeSize = 4;

	public static final int sriServiceTypeFilter = 1;
	private static final int sriServiceTypeSize = 5;

	public static final int sriParameterIdFilter = 2;

	public static final int sriParamValueFilter = 3;
	private static final int sriParamValueSize = 20;

	public static final int sriServiceActionFilter = 4;
	private static final int sriServiceActionSize = 15;

	public static final int sriRightFilter = 5;
	private static final int sriRightSize = 20;

	public static final int sriDatetimeFilter = 6;

	public SriServRightDMO() {
	};

	public SriServRightDMO(final String sriServiceCode,
			final String sriServiceType, final Integer sriParameterId,
			final String sriParamValue, final String sriServiceAction,
			final String sriRight, final DateTime sriDatetime) {

		this.sriServiceCode = sriServiceCode;
		this.sriServiceType = sriServiceType;
		this.sriParameterId = sriParameterId;
		this.sriParamValue = sriParamValue;
		this.sriServiceAction = sriServiceAction;
		this.sriRight = sriRight;
		this.sriDatetime = sriDatetime;
	};

	private static final int[] fieldSizes = new int[] { sriServiceCodeSize,
			sriServiceTypeSize, 0, sriParamValueSize, sriServiceActionSize,
			sriRightSize, 0 };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_INTEGER, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_DATETIME };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] {
				((this.sriServiceCode == null) ? null : (this.sriServiceCode
						.length() <= sriServiceCodeSize) ? this.sriServiceCode
						: this.sriServiceCode.substring(0,
								this.sriServiceCodeSize)),
				((this.sriServiceType == null) ? null : (this.sriServiceType
						.length() <= sriServiceTypeSize) ? this.sriServiceType
						: this.sriServiceType.substring(0,
								this.sriServiceTypeSize)),
				this.sriParameterId,
				((this.sriParamValue == null) ? null : (this.sriParamValue
						.length() <= sriParamValueSize) ? this.sriParamValue
						: this.sriParamValue.substring(0,
								this.sriParamValueSize)),
				((this.sriServiceAction == null) ? null
						: (this.sriServiceAction.length() <= sriServiceActionSize) ? this.sriServiceAction
								: this.sriServiceAction.substring(0,
										this.sriServiceActionSize)),
				((this.sriRight == null) ? null
						: (this.sriRight.length() <= sriRightSize) ? this.sriRight
								: this.sriRight.substring(0, this.sriRightSize)),
				this.sriDatetime };
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
		return new DAOArgs(4).arg(this.sriServiceCode).arg(this.sriParameterId)
				.arg(this.sriParamValue).arg(this.sriServiceAction);
	}

	protected void set(Object[] fields) {
		this.sriServiceCode = rtrim((String) fields[0]);
		this.sriServiceType = rtrim((String) fields[1]);
		this.sriParameterId = ((Integer) fields[2]);
		this.sriParamValue = rtrim((String) fields[3]);
		this.sriServiceAction = rtrim((String) fields[4]);
		this.sriRight = rtrim((String) fields[5]);
		this.sriDatetime = ((DateTime) fields[6]);
	}

	public void set(final String sriServiceCode, final String sriServiceType,
			final Integer sriParameterId, final String sriParamValue,
			final String sriServiceAction, final String sriRight,
			final DateTime sriDatetime) {

		this.sriServiceCode = sriServiceCode;
		this.sriServiceType = sriServiceType;
		this.sriParameterId = sriParameterId;
		this.sriParamValue = sriParamValue;
		this.sriServiceAction = sriServiceAction;
		this.sriRight = sriRight;
		this.sriDatetime = sriDatetime;
	}

	public String getSriServiceCode() {
		return sriServiceCode;
	}

	public void setSriServiceCode(String sriServiceCode) {
		this.sriServiceCode = sriServiceCode;
	}

	public String getSriServiceType() {
		return sriServiceType;
	}

	public void setSriServiceType(String sriServiceType) {
		this.sriServiceType = sriServiceType;
	}

	public Integer getSriParameterId() {
		return sriParameterId;
	}

	public void setSriParameterId(Integer sriParameterId) {
		this.sriParameterId = sriParameterId;
	}

	public String getSriParamValue() {
		return sriParamValue;
	}

	public void setSriParamValue(String sriParamValue) {
		this.sriParamValue = sriParamValue;
	}

	public String getSriServiceAction() {
		return sriServiceAction;
	}

	public void setSriServiceAction(String sriServiceAction) {
		this.sriServiceAction = sriServiceAction;
	}

	public String getSriRight() {
		return sriRight;
	}

	public void setSriRight(String sriRight) {
		this.sriRight = sriRight;
	}

	public DateTime getSriDatetime() {
		return sriDatetime;
	}

	public void setSriDatetime(DateTime sriDatetime) {
		this.sriDatetime = sriDatetime;
	}

}
