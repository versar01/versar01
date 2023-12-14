package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;
import com.eppixcomm.eppix.common.util.Date;

public class EncExpiryNotConfDMO extends DBO implements Serializable {

	private String encConfType;
	private String encAccountType;
	private Integer encContLength;
	private Short encExpiryDays;
	private String encDelvMethod;
	private String encDelvTempSms;
	private String encDelvTempEml;
	private String encNotifyLevel;
	private String encAnalysis1;
	private String encAnalysis2;
	private String encAnalysis3;
	private Date encConfigDatetime;

	public static final int encConfTypeFilter = 0;
	private static final int encConfTypeSize = 1;

	public static final int encAccountTypeFilter = 1;
	private static final int encAccountTypeSize = 5;

	public static final int encContLengthFilter = 2;

	public static final int encExpiryDaysFilter = 3;

	public static final int encDelvMethodFilter = 4;
	private static final int encDelvMethodSize = 5;

	public static final int encDelvTempSmsFilter = 5;
	private static final int encDelvTempSmsSize = 50;

	public static final int encDelvTempEmlFilter = 6;
	private static final int encDelvTempEmlSize = 50;

	public static final int encNotifyLevelFilter = 7;
	private static final int encNotifyLevelSize = 1;

	public static final int encAnalysis1Filter = 8;
	private static final int encAnalysis1Size = 50;

	public static final int encAnalysis2Filter = 9;
	private static final int encAnalysis2Size = 50;

	public static final int encAnalysis3Filter = 10;
	private static final int encAnalysis3Size = 50;

	public static final int encConfigDatetimeFilter = 11;

	public EncExpiryNotConfDMO() {
	};

	public EncExpiryNotConfDMO(final String encConfType, final String encAccountType, final Integer encContLength,
			final Short encExpiryDays, final String encDelvMethod, final String encDelvTempSms,
			final String encDelvTempEml, final String encNotifyLevel, final String encAnalysis1,
			final String encAnalysis2, final String encAnalysis3, final Date encConfigDatetime) {

		this.encConfType = encConfType;
		this.encAccountType = encAccountType;
		this.encContLength = encContLength;
		this.encExpiryDays = encExpiryDays;
		this.encDelvMethod = encDelvMethod;
		this.encDelvTempSms = encDelvTempSms;
		this.encDelvTempEml = encDelvTempEml;
		this.encNotifyLevel = encNotifyLevel;
		this.encAnalysis1 = encAnalysis1;
		this.encAnalysis2 = encAnalysis2;
		this.encAnalysis3 = encAnalysis3;
		this.encConfigDatetime = encConfigDatetime;
	};

	private static final int[] fieldSizes = new int[] { encConfTypeSize, encAccountTypeSize, 0, 0, encDelvMethodSize,
			encDelvTempSmsSize, encDelvTempEmlSize, encNotifyLevelSize, encAnalysis1Size, encAnalysis2Size,
			encAnalysis3Size, 0 };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_INTEGER,
			FIELD_TYPE_SHORT, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_DATE };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] {
				((this.encConfType == null) ? null
						: (this.encConfType.length() <= encConfTypeSize) ? this.encConfType
								: this.encConfType.substring(0, this.encConfTypeSize)),
				((this.encAccountType == null) ? null
						: (this.encAccountType.length() <= encAccountTypeSize) ? this.encAccountType
								: this.encAccountType.substring(0, this.encAccountTypeSize)),
				this.encContLength, this.encExpiryDays,
				((this.encDelvMethod == null) ? null
						: (this.encDelvMethod.length() <= encDelvMethodSize) ? this.encDelvMethod
								: this.encDelvMethod.substring(0, this.encDelvMethodSize)),
				((this.encDelvTempSms == null) ? null
						: (this.encDelvTempSms.length() <= encDelvTempSmsSize) ? this.encDelvTempSms
								: this.encDelvTempSms.substring(0, this.encDelvTempSmsSize)),
				((this.encDelvTempEml == null) ? null
						: (this.encDelvTempEml.length() <= encDelvTempEmlSize) ? this.encDelvTempEml
								: this.encDelvTempEml.substring(0, this.encDelvTempEmlSize)),
				((this.encNotifyLevel == null) ? null
						: (this.encNotifyLevel.length() <= encNotifyLevelSize) ? this.encNotifyLevel
								: this.encNotifyLevel.substring(0, this.encNotifyLevelSize)),
				((this.encAnalysis1 == null) ? null
						: (this.encAnalysis1.length() <= encAnalysis1Size) ? this.encAnalysis1
								: this.encAnalysis1.substring(0, this.encAnalysis1Size)),
				((this.encAnalysis2 == null) ? null
						: (this.encAnalysis2.length() <= encAnalysis2Size) ? this.encAnalysis2
								: this.encAnalysis2.substring(0, this.encAnalysis2Size)),
				((this.encAnalysis3 == null) ? null
						: (this.encAnalysis3.length() <= encAnalysis3Size) ? this.encAnalysis3
								: this.encAnalysis3.substring(0, this.encAnalysis3Size)),
				this.encConfigDatetime };
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
		this.encConfType = rtrim((String) fields[0]);

		this.encAccountType = rtrim((String) fields[1]);

		this.encContLength = ((Integer) fields[2]);
		this.encExpiryDays = ((Short) fields[3]);
		this.encDelvMethod = rtrim((String) fields[4]);

		this.encDelvTempSms = rtrim((String) fields[5]);

		this.encDelvTempEml = rtrim((String) fields[6]);

		this.encNotifyLevel = rtrim((String) fields[7]);

		this.encAnalysis1 = rtrim((String) fields[8]);

		this.encAnalysis2 = rtrim((String) fields[9]);

		this.encAnalysis3 = rtrim((String) fields[10]);

		this.encConfigDatetime = ((fields[11] == null) ? null : new Date(fields[11]));
	}

	public void set(final String encConfType, final String encAccountType, final Integer encContLength,
			final Short encExpiryDays, final String encDelvMethod, final String encDelvTempSms,
			final String encDelvTempEml, final String encNotifyLevel, final String encAnalysis1,
			final String encAnalysis2, final String encAnalysis3, final Date encConfigDatetime) {

		this.encConfType = encConfType;
		this.encAccountType = encAccountType;
		this.encContLength = encContLength;
		this.encExpiryDays = encExpiryDays;
		this.encDelvMethod = encDelvMethod;
		this.encDelvTempSms = encDelvTempSms;
		this.encDelvTempEml = encDelvTempEml;
		this.encNotifyLevel = encNotifyLevel;
		this.encAnalysis1 = encAnalysis1;
		this.encAnalysis2 = encAnalysis2;
		this.encAnalysis3 = encAnalysis3;
		this.encConfigDatetime = encConfigDatetime;
	}

	public String getEncConfType() {
		return encConfType;
	}

	public void setEncConfType(String encConfType) {
		this.encConfType = encConfType;
	}

	public String getEncAccountType() {
		return encAccountType;
	}

	public void setEncAccountType(String encAccountType) {
		this.encAccountType = encAccountType;
	}

	public Integer getEncContLength() {
		return encContLength;
	}

	public void setEncContLength(Integer encContLength) {
		this.encContLength = encContLength;
	}

	public Short getEncExpiryDays() {
		return encExpiryDays;
	}

	public void setEncExpiryDays(Short encExpiryDays) {
		this.encExpiryDays = encExpiryDays;
	}

	public String getEncDelvMethod() {
		return encDelvMethod;
	}

	public void setEncDelvMethod(String encDelvMethod) {
		this.encDelvMethod = encDelvMethod;
	}

	public String getEncDelvTempSms() {
		return encDelvTempSms;
	}

	public void setEncDelvTempSms(String encDelvTempSms) {
		this.encDelvTempSms = encDelvTempSms;
	}

	public String getEncDelvTempEml() {
		return encDelvTempEml;
	}

	public void setEncDelvTempEml(String encDelvTempEml) {
		this.encDelvTempEml = encDelvTempEml;
	}

	public String getEncNotifyLevel() {
		return encNotifyLevel;
	}

	public void setEncNotifyLevel(String encNotifyLevel) {
		this.encNotifyLevel = encNotifyLevel;
	}

	public String getEncAnalysis1() {
		return encAnalysis1;
	}

	public void setEncAnalysis1(String encAnalysis1) {
		this.encAnalysis1 = encAnalysis1;
	}

	public String getEncAnalysis2() {
		return encAnalysis2;
	}

	public void setEncAnalysis2(String encAnalysis2) {
		this.encAnalysis2 = encAnalysis2;
	}

	public String getEncAnalysis3() {
		return encAnalysis3;
	}

	public void setEncAnalysis3(String encAnalysis3) {
		this.encAnalysis3 = encAnalysis3;
	}

	public Date getEncConfigDatetime() {
		return encConfigDatetime;
	}

	public void setEncConfigDatetime(Date encConfigDatetime) {
		this.encConfigDatetime = encConfigDatetime;
	}

}
