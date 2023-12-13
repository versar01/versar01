package com.eppixcomm.eppix.base.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;
import com.eppixcomm.eppix.common.util.Date;
import com.eppixcomm.eppix.common.util.DateTime;

public class AchActionHistoryDMO extends DBO implements Serializable {

	private Integer achSubscriberId;
	private String achSimNo;
	private String achMsisdnNo;
	private String achOperation;
	private String achValue;
	private String achAnalysis1;
	private String achAnalysis2;
	private String achAnalysis3;
	private DateTime achStdatetime;
	private DateTime achEndatetime;

	public static final int achSubscriberIdFilter = 0;

	public static final int achSimNoFilter = 1;
	private static final int achSimNoSize = 14;

	public static final int achMsisdnNoFilter = 2;
	private static final int achMsisdnNoSize = 15;

	public static final int achOperationFilter = 3;
	private static final int achOperationSize = 10;

	public static final int achValueFilter = 4;
	private static final int achValueSize = 20;

	public static final int achAnalysis1Filter = 5;
	private static final int achAnalysis1Size = 30;

	public static final int achAnalysis2Filter = 6;
	private static final int achAnalysis2Size = 30;

	public static final int achAnalysis3Filter = 7;
	private static final int achAnalysis3Size = 30;

	public static final int achStdatetimeFilter = 8;

	public static final int achEndatetimeFilter = 9;

	public AchActionHistoryDMO() {
	};

	public AchActionHistoryDMO(final Integer achSubscriberId,
			final String achSimNo, final String achMsisdnNo,
			final String achOperation, final String achValue,
			final String achAnalysis1, final String achAnalysis2,
			final String achAnalysis3, final DateTime achStdatetime,
			final DateTime achEndatetime) {

		this.achSubscriberId = achSubscriberId;
		this.achSimNo = achSimNo;
		this.achMsisdnNo = achMsisdnNo;
		this.achOperation = achOperation;
		this.achValue = achValue;
		this.achAnalysis1 = achAnalysis1;
		this.achAnalysis2 = achAnalysis2;
		this.achAnalysis3 = achAnalysis3;
		this.achStdatetime = achStdatetime;
		this.achEndatetime = achEndatetime;
	};

	private static final int[] fieldSizes = new int[] { 0, achSimNoSize,
			achMsisdnNoSize, achOperationSize, achValueSize, achAnalysis1Size,
			achAnalysis2Size, achAnalysis3Size, 0, 0 };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_INTEGER,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_DATETIME, FIELD_TYPE_DATETIME };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] {
				this.achSubscriberId,
				((this.achSimNo == null) ? null
						: (this.achSimNo.length() <= achSimNoSize) ? this.achSimNo
								: this.achSimNo.substring(0, this.achSimNoSize)),
				((this.achMsisdnNo == null) ? null
						: (this.achMsisdnNo.length() <= achMsisdnNoSize) ? this.achMsisdnNo
								: this.achMsisdnNo.substring(0,
										this.achMsisdnNoSize)),
				((this.achOperation == null) ? null : (this.achOperation
						.length() <= achOperationSize) ? this.achOperation
						: this.achOperation.substring(0, this.achOperationSize)),
				((this.achValue == null) ? null
						: (this.achValue.length() <= achValueSize) ? this.achValue
								: this.achValue.substring(0, this.achValueSize)),
				((this.achAnalysis1 == null) ? null : (this.achAnalysis1
						.length() <= achAnalysis1Size) ? this.achAnalysis1
						: this.achAnalysis1.substring(0, this.achAnalysis1Size)),
				((this.achAnalysis2 == null) ? null : (this.achAnalysis2
						.length() <= achAnalysis2Size) ? this.achAnalysis2
						: this.achAnalysis2.substring(0, this.achAnalysis2Size)),
				((this.achAnalysis3 == null) ? null : (this.achAnalysis3
						.length() <= achAnalysis3Size) ? this.achAnalysis3
						: this.achAnalysis3.substring(0, this.achAnalysis3Size)),
				this.achStdatetime, this.achEndatetime };
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
		this.achSubscriberId = ((Integer) fields[0]);
		this.achSimNo = rtrim((String) fields[1]);
		this.achMsisdnNo = rtrim((String) fields[2]);
		this.achOperation = rtrim((String) fields[3]);
		this.achValue = rtrim((String) fields[4]);
		this.achAnalysis1 = rtrim((String) fields[5]);
		this.achAnalysis2 = rtrim((String) fields[6]);
		this.achAnalysis3 = rtrim((String) fields[7]);
		this.achStdatetime = ((fields[8] == null) ? null : (DateTime)fields[8]);
		this.achEndatetime = ((fields[9] == null) ? null : (DateTime)fields[9]);
	}

	public void set(final Integer achSubscriberId, final String achSimNo,
			final String achMsisdnNo, final String achOperation,
			final String achValue, final String achAnalysis1,
			final String achAnalysis2, final String achAnalysis3,
			final DateTime achStdatetime, final DateTime achEndatetime) {

		this.achSubscriberId = achSubscriberId;
		this.achSimNo = achSimNo;
		this.achMsisdnNo = achMsisdnNo;
		this.achOperation = achOperation;
		this.achValue = achValue;
		this.achAnalysis1 = achAnalysis1;
		this.achAnalysis2 = achAnalysis2;
		this.achAnalysis3 = achAnalysis3;
		this.achStdatetime = achStdatetime;
		this.achEndatetime = achEndatetime;
	}

	public Integer getAchSubscriberId() {
		return achSubscriberId;
	}

	public void setAchSubscriberId(Integer achSubscriberId) {
		this.achSubscriberId = achSubscriberId;
	}

	public String getAchSimNo() {
		return achSimNo;
	}

	public void setAchSimNo(String achSimNo) {
		this.achSimNo = achSimNo;
	}

	public String getAchMsisdnNo() {
		return achMsisdnNo;
	}

	public void setAchMsisdnNo(String achMsisdnNo) {
		this.achMsisdnNo = achMsisdnNo;
	}

	public String getAchOperation() {
		return achOperation;
	}

	public void setAchOperation(String achOperation) {
		this.achOperation = achOperation;
	}

	public String getAchValue() {
		return achValue;
	}

	public void setAchValue(String achValue) {
		this.achValue = achValue;
	}

	public String getAchAnalysis1() {
		return achAnalysis1;
	}

	public void setAchAnalysis1(String achAnalysis1) {
		this.achAnalysis1 = achAnalysis1;
	}

	public String getAchAnalysis2() {
		return achAnalysis2;
	}

	public void setAchAnalysis2(String achAnalysis2) {
		this.achAnalysis2 = achAnalysis2;
	}

	public String getAchAnalysis3() {
		return achAnalysis3;
	}

	public void setAchAnalysis3(String achAnalysis3) {
		this.achAnalysis3 = achAnalysis3;
	}

	public DateTime getAchStdatetime() {
		return achStdatetime;
	}

	public void setAchStdatetime(DateTime achStdatetime) {
		this.achStdatetime = achStdatetime;
	}

	public DateTime getAchEndatetime() {
		return achEndatetime;
	}

	public void setAchEndatetime(DateTime achEndatetime) {
		this.achEndatetime = achEndatetime;
	}

}
