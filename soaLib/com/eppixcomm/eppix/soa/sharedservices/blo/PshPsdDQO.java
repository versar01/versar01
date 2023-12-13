package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.base.blo.PshParamServHdrDMO;
import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;
import com.eppixcomm.eppix.common.util.Date;

public class PshPsdDQO extends DBO implements Serializable {

	private PshParamServHdrDMO pshDMO;
	private PsdParamServDetDMO psdDMO;
	
	private Integer pshId;
	private String pshServiceCode;
	private String pshServiceType;
	private Integer pshSubscriberId;
	private String pshSimNo;
	private String pshMsisdnNo;
	private String pshArchived;
	private Integer psdSerialId;
	private Integer psdPshId;
	private Integer psdParamId;
	private Date psdActDate;
	private Date psdTermDate;
	private String psdParamValue;
	private String psdN2nString;
	private String psdParamActive;
	private Date psdDeacDate;
	private String psdSubCharge;
	private Double psdChgValue;
	private String psdActType;
	private Date psdActionDate;

	public static final int pshIdFilter = 0;

	public static final int pshServiceCodeFilter = 1;
	private static final int pshServiceCodeSize = 4;

	public static final int pshServiceTypeFilter = 2;
	private static final int pshServiceTypeSize = 5;

	public static final int pshSubscriberIdFilter = 3;

	public static final int pshSimNoFilter = 4;
	private static final int pshSimNoSize = 14;

	public static final int pshMsisdnNoFilter = 5;
	private static final int pshMsisdnNoSize = 15;

	public static final int pshArchivedFilter = 6;
	private static final int pshArchivedSize = 1;

	public static final int psdSerialIdFilter = 7;

	public static final int psdPshIdFilter = 8;

	public static final int psdParamIdFilter = 9;

	public static final int psdActDateFilter = 10;

	public static final int psdTermDateFilter = 11;

	public static final int psdParamValueFilter = 12;
	private static final int psdParamValueSize = 20;

	public static final int psdN2nStringFilter = 13;
	private static final int psdN2nStringSize = 1;

	public static final int psdParamActiveFilter = 14;
	private static final int psdParamActiveSize = 1;

	public static final int psdDeacDateFilter = 15;

	public static final int psdSubChargeFilter = 16;
	private static final int psdSubChargeSize = 5;

	public static final int psdChgValueFilter = 17;

	public static final int psdActTypeFilter = 18;
	private static final int psdActTypeSize = 2;

	public static final int psdActionDateFilter = 19;

	public PshPsdDQO() {
	};

	public PshPsdDQO(final Integer pshId, final String pshServiceCode,
			final String pshServiceType, final Integer pshSubscriberId,
			final String pshSimNo, final String pshMsisdnNo,
			final String pshArchived, final Integer psdSerialId,
			final Integer psdPshId, final Integer psdParamId,
			final Date psdActDate, final Date psdTermDate,
			final String psdParamValue, final String psdN2nString,
			final String psdParamActive, final Date psdDeacDate,
			final String psdSubCharge, final Double psdChgValue,
			final String psdActType, final Date psdActionDate) {

		this.pshId = pshId;
		this.pshServiceCode = pshServiceCode;
		this.pshServiceType = pshServiceType;
		this.pshSubscriberId = pshSubscriberId;
		this.pshSimNo = pshSimNo;
		this.pshMsisdnNo = pshMsisdnNo;
		this.pshArchived = pshArchived;
		this.psdSerialId = psdSerialId;
		this.psdPshId = psdPshId;
		this.psdParamId = psdParamId;
		this.psdActDate = psdActDate;
		this.psdTermDate = psdTermDate;
		this.psdParamValue = psdParamValue;
		this.psdN2nString = psdN2nString;
		this.psdParamActive = psdParamActive;
		this.psdDeacDate = psdDeacDate;
		this.psdSubCharge = psdSubCharge;
		this.psdChgValue = psdChgValue;
		this.psdActType = psdActType;
		this.psdActionDate = psdActionDate;
	};

	private static final int[] fieldSizes = new int[] { 0, pshServiceCodeSize,
			pshServiceTypeSize, 0, pshSimNoSize, pshMsisdnNoSize,
			pshArchivedSize, 0, 0, 0, 0, 0, psdParamValueSize,
			psdN2nStringSize, psdParamActiveSize, 0, psdSubChargeSize, 0,
			psdActTypeSize, 0 };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_INTEGER,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_INTEGER,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_INTEGER, FIELD_TYPE_INTEGER, FIELD_TYPE_INTEGER,
			FIELD_TYPE_DATE, FIELD_TYPE_DATE, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_DATE,
			FIELD_TYPE_STRING, FIELD_TYPE_DOUBLE, FIELD_TYPE_STRING,
			FIELD_TYPE_DATE };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] {
				this.pshId,
				((this.pshServiceCode == null) ? null : (this.pshServiceCode
						.length() <= pshServiceCodeSize) ? this.pshServiceCode
						: this.pshServiceCode.substring(0,
								this.pshServiceCodeSize)),
				((this.pshServiceType == null) ? null : (this.pshServiceType
						.length() <= pshServiceTypeSize) ? this.pshServiceType
						: this.pshServiceType.substring(0,
								this.pshServiceTypeSize)),
				this.pshSubscriberId,
				((this.pshSimNo == null) ? null
						: (this.pshSimNo.length() <= pshSimNoSize) ? this.pshSimNo
								: this.pshSimNo.substring(0, this.pshSimNoSize)),
				((this.pshMsisdnNo == null) ? null
						: (this.pshMsisdnNo.length() <= pshMsisdnNoSize) ? this.pshMsisdnNo
								: this.pshMsisdnNo.substring(0,
										this.pshMsisdnNoSize)),
				((this.pshArchived == null) ? null
						: (this.pshArchived.length() <= pshArchivedSize) ? this.pshArchived
								: this.pshArchived.substring(0,
										this.pshArchivedSize)),
				this.psdSerialId,
				this.psdPshId,
				this.psdParamId,
				this.psdActDate,
				this.psdTermDate,
				((this.psdParamValue == null) ? null : (this.psdParamValue
						.length() <= psdParamValueSize) ? this.psdParamValue
						: this.psdParamValue.substring(0,
								this.psdParamValueSize)),
				((this.psdN2nString == null) ? null : (this.psdN2nString
						.length() <= psdN2nStringSize) ? this.psdN2nString
						: this.psdN2nString.substring(0, this.psdN2nStringSize)),
				((this.psdParamActive == null) ? null : (this.psdParamActive
						.length() <= psdParamActiveSize) ? this.psdParamActive
						: this.psdParamActive.substring(0,
								this.psdParamActiveSize)),
				this.psdDeacDate,
				((this.psdSubCharge == null) ? null : (this.psdSubCharge
						.length() <= psdSubChargeSize) ? this.psdSubCharge
						: this.psdSubCharge.substring(0, this.psdSubChargeSize)),
				this.psdChgValue,
				((this.psdActType == null) ? null
						: (this.psdActType.length() <= psdActTypeSize) ? this.psdActType
								: this.psdActType.substring(0,
										this.psdActTypeSize)),
				this.psdActionDate };
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
		this.pshId = (Integer) fields[0];
		this.pshServiceCode = rtrim((String) fields[1]);
		this.pshServiceType = rtrim((String) fields[2]);
		this.pshSubscriberId = ((Integer) fields[3]);
		this.pshSimNo = rtrim((String) fields[4]);
		this.pshMsisdnNo = rtrim((String) fields[5]);
		this.pshArchived = rtrim((String) fields[6]);
		this.psdSerialId = ((Integer) fields[7]);
		this.psdPshId = ((Integer) fields[8]);
		this.psdParamId = ((Integer) fields[9]);
		this.psdActDate = ((fields[10] == null) ? null : new Date(fields[10]));
		this.psdTermDate = ((fields[11] == null) ? null : new Date(fields[11]));
		this.psdParamValue = rtrim((String) fields[12]);
		this.psdN2nString = rtrim((String) fields[13]);
		this.psdParamActive = rtrim((String) fields[14]);
		this.psdDeacDate = ((fields[15] == null) ? null : new Date(fields[15]));
		this.psdSubCharge = rtrim((String) fields[16]);
		this.psdChgValue = ((Double) fields[17]);
		this.psdActType = rtrim((String) fields[18]);
		this.psdActionDate = ((fields[19] == null) ? null
				: new Date(fields[19]));
	}

	public void set(final Integer pshId, final String pshServiceCode,
			final String pshServiceType, final Integer pshSubscriberId,
			final String pshSimNo, final String pshMsisdnNo,
			final String pshArchived, final Integer psdSerialId,
			final Integer psdPshId, final Integer psdParamId,
			final Date psdActDate, final Date psdTermDate,
			final String psdParamValue, final String psdN2nString,
			final String psdParamActive, final Date psdDeacDate,
			final String psdSubCharge, final Double psdChgValue,
			final String psdActType, final Date psdActionDate) {

		this.pshId = pshId;
		this.pshServiceCode = pshServiceCode;
		this.pshServiceType = pshServiceType;
		this.pshSubscriberId = pshSubscriberId;
		this.pshSimNo = pshSimNo;
		this.pshMsisdnNo = pshMsisdnNo;
		this.pshArchived = pshArchived;
		this.psdSerialId = psdSerialId;
		this.psdPshId = psdPshId;
		this.psdParamId = psdParamId;
		this.psdActDate = psdActDate;
		this.psdTermDate = psdTermDate;
		this.psdParamValue = psdParamValue;
		this.psdN2nString = psdN2nString;
		this.psdParamActive = psdParamActive;
		this.psdDeacDate = psdDeacDate;
		this.psdSubCharge = psdSubCharge;
		this.psdChgValue = psdChgValue;
		this.psdActType = psdActType;
		this.psdActionDate = psdActionDate;
	}

	public void deConstruct() {
		pshDMO = new PshParamServHdrDMO(psdPshId, pshServiceCode, pshArchived, pshSubscriberId, pshSimNo, pshMsisdnNo);
		psdDMO = new PsdParamServDetDMO(psdSerialId, psdPshId, psdParamId, psdActDate, psdTermDate, psdParamValue, psdN2nString, psdParamActive, psdDeacDate, psdSubCharge, psdChgValue, psdActType, psdActionDate);
		
	}

	public Integer getPshId() {
		return pshId;
	}

	public void setPshId(Integer pshId) {
		this.pshId = pshId;
	}

	public String getPshServiceCode() {
		return pshServiceCode;
	}

	public void setPshServiceCode(String pshServiceCode) {
		this.pshServiceCode = pshServiceCode;
	}

	public String getPshServiceType() {
		return pshServiceType;
	}

	public void setPshServiceType(String pshServiceType) {
		this.pshServiceType = pshServiceType;
	}

	public Integer getPshSubscriberId() {
		return pshSubscriberId;
	}

	public void setPshSubscriberId(Integer pshSubscriberId) {
		this.pshSubscriberId = pshSubscriberId;
	}

	public String getPshSimNo() {
		return pshSimNo;
	}

	public void setPshSimNo(String pshSimNo) {
		this.pshSimNo = pshSimNo;
	}

	public String getPshMsisdnNo() {
		return pshMsisdnNo;
	}

	public void setPshMsisdnNo(String pshMsisdnNo) {
		this.pshMsisdnNo = pshMsisdnNo;
	}

	public String getPshArchived() {
		return pshArchived;
	}

	public void setPshArchived(String pshArchived) {
		this.pshArchived = pshArchived;
	}

	public Integer getPsdSerialId() {
		return psdSerialId;
	}

	public void setPsdSerialId(Integer psdSerialId) {
		this.psdSerialId = psdSerialId;
	}

	public Integer getPsdPshId() {
		return psdPshId;
	}

	public void setPsdPshId(Integer psdPshId) {
		this.psdPshId = psdPshId;
	}

	public Integer getPsdParamId() {
		return psdParamId;
	}

	public void setPsdParamId(Integer psdParamId) {
		this.psdParamId = psdParamId;
	}

	public Date getPsdActDate() {
		return psdActDate;
	}

	public void setPsdActDate(Date psdActDate) {
		this.psdActDate = psdActDate;
	}

	public Date getPsdTermDate() {
		return psdTermDate;
	}

	public void setPsdTermDate(Date psdTermDate) {
		this.psdTermDate = psdTermDate;
	}

	public String getPsdParamValue() {
		return psdParamValue;
	}

	public void setPsdParamValue(String psdParamValue) {
		this.psdParamValue = psdParamValue;
	}

	public String getPsdN2nString() {
		return psdN2nString;
	}

	public void setPsdN2nString(String psdN2nString) {
		this.psdN2nString = psdN2nString;
	}

	public String getPsdParamActive() {
		return psdParamActive;
	}

	public void setPsdParamActive(String psdParamActive) {
		this.psdParamActive = psdParamActive;
	}

	public Date getPsdDeacDate() {
		return psdDeacDate;
	}

	public void setPsdDeacDate(Date psdDeacDate) {
		this.psdDeacDate = psdDeacDate;
	}

	public String getPsdSubCharge() {
		return psdSubCharge;
	}

	public void setPsdSubCharge(String psdSubCharge) {
		this.psdSubCharge = psdSubCharge;
	}

	public Double getPsdChgValue() {
		return psdChgValue;
	}

	public void setPsdChgValue(Double psdChgValue) {
		this.psdChgValue = psdChgValue;
	}

	public String getPsdActType() {
		return psdActType;
	}

	public void setPsdActType(String psdActType) {
		this.psdActType = psdActType;
	}

	public Date getPsdActionDate() {
		return psdActionDate;
	}

	public void setPsdActionDate(Date psdActionDate) {
		this.psdActionDate = psdActionDate;
	}
}