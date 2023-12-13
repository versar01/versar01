package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;
import com.eppixcomm.eppix.common.util.Date;

public class PbaProofBankAccDMO extends DBO implements Serializable {

	private Integer pbaSerialId;
	private String pbaBillAcNo;
	private String pbaIdNo;
	private String pbaIdType;
	private String pbaBankAccName;
	private String pbaBankAccNo;
	private String pbaBankName;
	private String pbaBankAccType;
	private String pbaSortCode;
	private String pbaStatus;
	private String pbaStatusUser;
	private Date pbaStatusDate;
	private String pbaComments;
	private Date pbaReqDate;
	private String pbaReqUserId;
	private String pbaAnalysis1;
	private String pbaAnalysis2;
	private String pbaAnalysis3;

	public static final int pbaSerialIdFilter = 0;
	private static final int pbaSerialIdSize = 2;

	public static final int pbaBillAcNoFilter = 1;
	private static final int pbaBillAcNoSize = 8;

	public static final int pbaIdNoFilter = 2;
	private static final int pbaIdNoSize = 20;

	public static final int pbaIdTypeFilter = 3;
	private static final int pbaIdTypeSize = 20;

	public static final int pbaBankAccNameFilter = 4;
	private static final int pbaBankAccNameSize = 32;

	public static final int pbaBankAccNoFilter = 5;
	private static final int pbaBankAccNoSize = 128;

	public static final int pbaBankNameFilter = 6;
	private static final int pbaBankNameSize = 50;

	public static final int pbaBankAccTypeFilter = 7;
	private static final int pbaBankAccTypeSize = 15;

	public static final int pbaSortCodeFilter = 8;
	private static final int pbaSortCodeSize = 10;

	public static final int pbaStatusFilter = 9;
	private static final int pbaStatusSize = 1;

	public static final int pbaStatusUserFilter = 10;
	private static final int pbaStatusUserSize = 10;

	public static final int pbaStatusDateFilter = 11;

	public static final int pbaCommentsFilter = 12;
	private static final int pbaCommentsSize = 250;

	public static final int pbaReqDateFilter = 13;

	public static final int pbaReqUserIdFilter = 14;
	private static final int pbaReqUserIdSize = 10;

	public static final int pbaAnalysis1Filter = 15;
	private static final int pbaAnalysis1Size = 50;

	public static final int pbaAnalysis2Filter = 16;
	private static final int pbaAnalysis2Size = 50;

	public static final int pbaAnalysis3Filter = 17;
	private static final int pbaAnalysis3Size = 50;

	public PbaProofBankAccDMO() {
	};

	public PbaProofBankAccDMO(final Integer pbaSerialId, final String pbaBillAcNo, final String pbaIdNo,
			final String pbaIdType, final String pbaBankAccName, final String pbaBankAccNo, final String pbaBankName,
			final String pbaBankAccType, final String pbaSortCode, final String pbaStatus, final String pbaStatusUser,
			final Date pbaStatusDate, final String pbaComments, final Date pbaReqDate, final String pbaReqUserId,
			final String pbaAnalysis1, final String pbaAnalysis2, final String pbaAnalysis3) {

		this.pbaSerialId = pbaSerialId;
		this.pbaBillAcNo = pbaBillAcNo;
		this.pbaIdNo = pbaIdNo;
		this.pbaIdType = pbaIdType;
		this.pbaBankAccName = pbaBankAccName;
		this.pbaBankAccNo = pbaBankAccNo;
		this.pbaBankName = pbaBankName;
		this.pbaBankAccType = pbaBankAccType;
		this.pbaSortCode = pbaSortCode;
		this.pbaStatus = pbaStatus;
		this.pbaStatusUser = pbaStatusUser;
		this.pbaStatusDate = pbaStatusDate;
		this.pbaComments = pbaComments;
		this.pbaReqDate = pbaReqDate;
		this.pbaReqUserId = pbaReqUserId;
		this.pbaAnalysis1 = pbaAnalysis1;
		this.pbaAnalysis2 = pbaAnalysis2;
		this.pbaAnalysis3 = pbaAnalysis3;
	};

	private static final int[] fieldSizes = new int[] { pbaSerialIdSize, pbaBillAcNoSize, pbaIdNoSize, pbaIdTypeSize,
			pbaBankAccNameSize, pbaBankAccNoSize, pbaBankNameSize, pbaBankAccTypeSize, pbaSortCodeSize, pbaStatusSize,
			pbaStatusUserSize, 0, pbaCommentsSize, 0, pbaReqUserIdSize, pbaAnalysis1Size, pbaAnalysis2Size,
			pbaAnalysis3Size };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_INTEGER, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_DATE, FIELD_TYPE_STRING,
			FIELD_TYPE_DATE, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] { this.pbaSerialId,
				((this.pbaBillAcNo == null) ? null
						: (this.pbaBillAcNo.length() <= pbaBillAcNoSize) ? this.pbaBillAcNo
								: this.pbaBillAcNo.substring(0, this.pbaBillAcNoSize)),
				((this.pbaIdNo == null) ? null
						: (this.pbaIdNo.length() <= pbaIdNoSize) ? this.pbaIdNo
								: this.pbaIdNo.substring(0, this.pbaIdNoSize)),
				((this.pbaIdType == null) ? null
						: (this.pbaIdType.length() <= pbaIdTypeSize) ? this.pbaIdType
								: this.pbaIdType.substring(0, this.pbaIdTypeSize)),
				((this.pbaBankAccName == null) ? null
						: (this.pbaBankAccName.length() <= pbaBankAccNameSize) ? this.pbaBankAccName
								: this.pbaBankAccName.substring(0, this.pbaBankAccNameSize)),
				((this.pbaBankAccNo == null) ? null
						: (this.pbaBankAccNo.length() <= pbaBankAccNoSize) ? this.pbaBankAccNo
								: this.pbaBankAccNo.substring(0, this.pbaBankAccNoSize)),
				((this.pbaBankName == null) ? null
						: (this.pbaBankName.length() <= pbaBankNameSize) ? this.pbaBankName
								: this.pbaBankName.substring(0, this.pbaBankNameSize)),
				((this.pbaBankAccType == null) ? null
						: (this.pbaBankAccType.length() <= pbaBankAccTypeSize) ? this.pbaBankAccType
								: this.pbaBankAccType.substring(0, this.pbaBankAccTypeSize)),
				((this.pbaSortCode == null) ? null
						: (this.pbaSortCode.length() <= pbaSortCodeSize) ? this.pbaSortCode
								: this.pbaSortCode.substring(0, this.pbaSortCodeSize)),
				((this.pbaStatus == null) ? null
						: (this.pbaStatus.length() <= pbaStatusSize) ? this.pbaStatus
								: this.pbaStatus.substring(0, this.pbaStatusSize)),
				((this.pbaStatusUser == null) ? null
						: (this.pbaStatusUser.length() <= pbaStatusUserSize) ? this.pbaStatusUser
								: this.pbaStatusUser.substring(0, this.pbaStatusUserSize)),
				this.pbaStatusDate,
				((this.pbaComments == null) ? null
						: (this.pbaComments.length() <= pbaCommentsSize) ? this.pbaComments
								: this.pbaComments.substring(0, this.pbaCommentsSize)),
				this.pbaReqDate,
				((this.pbaReqUserId == null) ? null
						: (this.pbaReqUserId.length() <= pbaReqUserIdSize) ? this.pbaReqUserId
								: this.pbaReqUserId.substring(0, this.pbaReqUserIdSize)),
				((this.pbaAnalysis1 == null) ? null
						: (this.pbaAnalysis1.length() <= pbaAnalysis1Size) ? this.pbaAnalysis1
								: this.pbaAnalysis1.substring(0, this.pbaAnalysis1Size)),
				((this.pbaAnalysis2 == null) ? null
						: (this.pbaAnalysis2.length() <= pbaAnalysis2Size) ? this.pbaAnalysis2
								: this.pbaAnalysis2.substring(0, this.pbaAnalysis2Size)),
				((this.pbaAnalysis3 == null) ? null
						: (this.pbaAnalysis3.length() <= pbaAnalysis3Size) ? this.pbaAnalysis3
								: this.pbaAnalysis3.substring(0, this.pbaAnalysis3Size)) };
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
		this.pbaSerialId = ((Integer) fields[0]);

		this.pbaBillAcNo = rtrim((String) fields[1]);

		this.pbaIdNo = rtrim((String) fields[2]);

		this.pbaIdType = rtrim((String) fields[3]);

		this.pbaBankAccName = rtrim((String) fields[4]);

		this.pbaBankAccNo = rtrim((String) fields[5]);

		this.pbaBankName = rtrim((String) fields[6]);

		this.pbaBankAccType = rtrim((String) fields[7]);

		this.pbaSortCode = rtrim((String) fields[8]);

		this.pbaStatus = rtrim((String) fields[9]);

		this.pbaStatusUser = rtrim((String) fields[10]);

		this.pbaStatusDate = ((fields[11] == null) ? null : new Date(fields[11]));
		this.pbaComments = rtrim((String) fields[12]);

		this.pbaReqDate = ((fields[13] == null) ? null : new Date(fields[13]));
		this.pbaReqUserId = rtrim((String) fields[14]);

		this.pbaAnalysis1 = rtrim((String) fields[15]);

		this.pbaAnalysis2 = rtrim((String) fields[16]);

		this.pbaAnalysis3 = rtrim((String) fields[17]);

	}

	public void set(final Integer pbaSerialId, final String pbaBillAcNo, final String pbaIdNo, final String pbaIdType,
			final String pbaBankAccName, final String pbaBankAccNo, final String pbaBankName,
			final String pbaBankAccType, final String pbaSortCode, final String pbaStatus, final String pbaStatusUser,
			final Date pbaStatusDate, final String pbaComments, final Date pbaReqDate, final String pbaReqUserId,
			final String pbaAnalysis1, final String pbaAnalysis2, final String pbaAnalysis3) {

		this.pbaSerialId = pbaSerialId;
		this.pbaBillAcNo = pbaBillAcNo;
		this.pbaIdNo = pbaIdNo;
		this.pbaIdType = pbaIdType;
		this.pbaBankAccName = pbaBankAccName;
		this.pbaBankAccNo = pbaBankAccNo;
		this.pbaBankName = pbaBankName;
		this.pbaBankAccType = pbaBankAccType;
		this.pbaSortCode = pbaSortCode;
		this.pbaStatus = pbaStatus;
		this.pbaStatusUser = pbaStatusUser;
		this.pbaStatusDate = pbaStatusDate;
		this.pbaComments = pbaComments;
		this.pbaReqDate = pbaReqDate;
		this.pbaReqUserId = pbaReqUserId;
		this.pbaAnalysis1 = pbaAnalysis1;
		this.pbaAnalysis2 = pbaAnalysis2;
		this.pbaAnalysis3 = pbaAnalysis3;
	}

	public Integer getPbaSerialId() {
		return pbaSerialId;
	}

	public void setPbaSerialId(Integer pbaSerialId) {
		this.pbaSerialId = pbaSerialId;
	}

	public String getPbaBillAcNo() {
		return pbaBillAcNo;
	}

	public void setPbaBillAcNo(String pbaBillAcNo) {
		this.pbaBillAcNo = pbaBillAcNo;
	}

	public String getPbaIdNo() {
		return pbaIdNo;
	}

	public void setPbaIdNo(String pbaIdNo) {
		this.pbaIdNo = pbaIdNo;
	}

	public String getPbaIdType() {
		return pbaIdType;
	}

	public void setPbaIdType(String pbaIdType) {
		this.pbaIdType = pbaIdType;
	}

	public String getPbaBankAccName() {
		return pbaBankAccName;
	}

	public void setPbaBankAccName(String pbaBankAccName) {
		this.pbaBankAccName = pbaBankAccName;
	}

	public String getPbaBankAccNo() {
		return pbaBankAccNo;
	}

	public void setPbaBankAccNo(String pbaBankAccNo) {
		this.pbaBankAccNo = pbaBankAccNo;
	}

	public String getPbaBankName() {
		return pbaBankName;
	}

	public void setPbaBankName(String pbaBankName) {
		this.pbaBankName = pbaBankName;
	}

	public String getPbaBankAccType() {
		return pbaBankAccType;
	}

	public void setPbaBankAccType(String pbaBankAccType) {
		this.pbaBankAccType = pbaBankAccType;
	}

	public String getPbaSortCode() {
		return pbaSortCode;
	}

	public void setPbaSortCode(String pbaSortCode) {
		this.pbaSortCode = pbaSortCode;
	}

	public String getPbaStatus() {
		return pbaStatus;
	}

	public void setPbaStatus(String pbaStatus) {
		this.pbaStatus = pbaStatus;
	}

	public String getPbaStatusUser() {
		return pbaStatusUser;
	}

	public void setPbaStatusUser(String pbaStatusUser) {
		this.pbaStatusUser = pbaStatusUser;
	}

	public Date getPbaStatusDate() {
		return pbaStatusDate;
	}

	public void setPbaStatusDate(Date pbaStatusDate) {
		this.pbaStatusDate = pbaStatusDate;
	}

	public String getPbaComments() {
		return pbaComments;
	}

	public void setPbaComments(String pbaComments) {
		this.pbaComments = pbaComments;
	}

	public Date getPbaReqDate() {
		return pbaReqDate;
	}

	public void setPbaReqDate(Date pbaReqDate) {
		this.pbaReqDate = pbaReqDate;
	}

	public String getPbaReqUserId() {
		return pbaReqUserId;
	}

	public void setPbaReqUserId(String pbaReqUserId) {
		this.pbaReqUserId = pbaReqUserId;
	}

	public String getPbaAnalysis1() {
		return pbaAnalysis1;
	}

	public void setPbaAnalysis1(String pbaAnalysis1) {
		this.pbaAnalysis1 = pbaAnalysis1;
	}

	public String getPbaAnalysis2() {
		return pbaAnalysis2;
	}

	public void setPbaAnalysis2(String pbaAnalysis2) {
		this.pbaAnalysis2 = pbaAnalysis2;
	}

	public String getPbaAnalysis3() {
		return pbaAnalysis3;
	}

	public void setPbaAnalysis3(String pbaAnalysis3) {
		this.pbaAnalysis3 = pbaAnalysis3;
	}

}
