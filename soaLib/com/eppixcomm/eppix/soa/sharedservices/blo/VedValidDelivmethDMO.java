package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;
import com.eppixcomm.eppix.common.util.DateTime;

public class VedValidDelivmethDMO extends DBO implements Serializable {

	private String vedBillAcNo;
	private Integer vedSubscriberId;
	private String vedOldEmailAdd;
	private String vedNewEmailAdd;
	private String vedDocType;
	private String vedDelivCurrent;
	private String vedDelivNew;
	private Integer vedRetryCnt;
	private DateTime vedRetryDatetime;
	private String vedComment;
	private String vedStatus;
	private DateTime vedStatusDate;

	public static final int vedBillAcNoFilter = 0;
	private static final int vedBillAcNoSize = 8;

	public static final int vedSubscriberIdFilter = 1;

	public static final int vedOldEmailAddFilter = 2;
	private static final int vedOldEmailAddSize = 50;

	public static final int vedNewEmailAddFilter = 3;
	private static final int vedNewEmailAddSize = 50;

	public static final int vedDocTypeFilter = 4;
	private static final int vedDocTypeSize = 10;

	public static final int vedDelivCurrentFilter = 5;
	private static final int vedDelivCurrentSize = 5;

	public static final int vedDelivNewFilter = 6;
	private static final int vedDelivNewSize = 5;

	public static final int vedRetryCntFilter = 7;

	public static final int vedRetryDatetimeFilter = 8;

	public static final int vedCommentFilter = 9;
	private static final int vedCommentSize = 500;

	public static final int vedStatusFilter = 10;
	private static final int vedStatusSize = 2;

	public static final int vedStatusDateFilter = 11;

	public VedValidDelivmethDMO() {
	};

	public VedValidDelivmethDMO(final String vedBillAcNo, final Integer vedSubscriberId, final String vedOldEmailAdd,
			final String vedNewEmailAdd, final String vedDocType, final String vedDelivCurrent,
			final String vedDelivNew, final Integer vedRetryCnt, final DateTime vedRetryDatetime,
			final String vedComment, final String vedStatus, final DateTime vedStatusDate) {

		this.vedBillAcNo = vedBillAcNo;
		this.vedSubscriberId = vedSubscriberId;
		this.vedOldEmailAdd = vedOldEmailAdd;
		this.vedNewEmailAdd = vedNewEmailAdd;
		this.vedDocType = vedDocType;
		this.vedDelivCurrent = vedDelivCurrent;
		this.vedDelivNew = vedDelivNew;
		this.vedRetryCnt = vedRetryCnt;
		this.vedRetryDatetime = vedRetryDatetime;
		this.vedComment = vedComment;
		this.vedStatus = vedStatus;
		this.vedStatusDate = vedStatusDate;
	};

	private static final int[] fieldSizes = new int[] { vedBillAcNoSize, 0, vedOldEmailAddSize, vedNewEmailAddSize,
			vedDocTypeSize, vedDelivCurrentSize, vedDelivNewSize, 0, 0, vedCommentSize, vedStatusSize, 0 };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_STRING, FIELD_TYPE_INTEGER, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_INTEGER,
			FIELD_TYPE_DATETIME, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_DATETIME };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] {
				((this.vedBillAcNo == null) ? null
						: (this.vedBillAcNo.length() <= vedBillAcNoSize) ? this.vedBillAcNo
								: this.vedBillAcNo.substring(0, this.vedBillAcNoSize)),
				this.vedSubscriberId,
				((this.vedOldEmailAdd == null) ? null
						: (this.vedOldEmailAdd.length() <= vedOldEmailAddSize) ? this.vedOldEmailAdd
								: this.vedOldEmailAdd.substring(0, this.vedOldEmailAddSize)),
				((this.vedNewEmailAdd == null) ? null
						: (this.vedNewEmailAdd.length() <= vedNewEmailAddSize) ? this.vedNewEmailAdd
								: this.vedNewEmailAdd.substring(0, this.vedNewEmailAddSize)),
				((this.vedDocType == null) ? null
						: (this.vedDocType.length() <= vedDocTypeSize) ? this.vedDocType
								: this.vedDocType.substring(0, this.vedDocTypeSize)),
				((this.vedDelivCurrent == null) ? null
						: (this.vedDelivCurrent.length() <= vedDelivCurrentSize) ? this.vedDelivCurrent
								: this.vedDelivCurrent.substring(0, this.vedDelivCurrentSize)),
				((this.vedDelivNew == null) ? null
						: (this.vedDelivNew.length() <= vedDelivNewSize) ? this.vedDelivNew
								: this.vedDelivNew.substring(0, this.vedDelivNewSize)),
				this.vedRetryCnt, this.vedRetryDatetime,
				((this.vedComment == null) ? null
						: (this.vedComment.length() <= vedCommentSize) ? this.vedComment
								: this.vedComment.substring(0, this.vedCommentSize)),
				((this.vedStatus == null) ? null
						: (this.vedStatus.length() <= vedStatusSize) ? this.vedStatus
								: this.vedStatus.substring(0, this.vedStatusSize)),
				this.vedStatusDate };
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
		return new DAOArgs(5).arg(this.vedBillAcNo).arg(this.vedSubscriberId).arg(this.vedDocType).arg(this.vedDelivCurrent).arg(this.vedDelivNew);
	}

	protected void set(Object[] fields) {
		this.vedBillAcNo = rtrim((String) fields[0]);
		this.vedSubscriberId = ((Integer) fields[1]);
		this.vedOldEmailAdd = rtrim((String) fields[2]);
		this.vedNewEmailAdd = rtrim((String) fields[3]);
		this.vedDocType = rtrim((String) fields[4]);
		this.vedDelivCurrent = rtrim((String) fields[5]);
		this.vedDelivNew = rtrim((String) fields[6]);
		this.vedRetryCnt = ((Integer) fields[7]);
		this.vedRetryDatetime = ((DateTime) fields[8]);
		this.vedComment = rtrim((String) fields[9]);
		this.vedStatus = rtrim((String) fields[10]);
		this.vedStatusDate = ((DateTime) fields[11]);
	}

	public void set(final String vedBillAcNo, final Integer vedSubscriberId, final String vedOldEmailAdd,
			final String vedNewEmailAdd, final String vedDocType, final String vedDelivCurrent,
			final String vedDelivNew, final Integer vedRetryCnt, final DateTime vedRetryDatetime,
			final String vedComment, final String vedStatus, final DateTime vedStatusDate) {

		this.vedBillAcNo = vedBillAcNo;
		this.vedSubscriberId = vedSubscriberId;
		this.vedOldEmailAdd = vedOldEmailAdd;
		this.vedNewEmailAdd = vedNewEmailAdd;
		this.vedDocType = vedDocType;
		this.vedDelivCurrent = vedDelivCurrent;
		this.vedDelivNew = vedDelivNew;
		this.vedRetryCnt = vedRetryCnt;
		this.vedRetryDatetime = vedRetryDatetime;
		this.vedComment = vedComment;
		this.vedStatus = vedStatus;
		this.vedStatusDate = vedStatusDate;
	}

	public String getVedBillAcNo() {
		return vedBillAcNo;
	}

	public void setVedBillAcNo(String vedBillAcNo) {
		this.vedBillAcNo = vedBillAcNo;
	}

	public Integer getVedSubscriberId() {
		return vedSubscriberId;
	}

	public void setVedSubscriberId(Integer vedSubscriberId) {
		this.vedSubscriberId = vedSubscriberId;
	}

	public String getVedOldEmailAdd() {
		return vedOldEmailAdd;
	}

	public void setVedOldEmailAdd(String vedOldEmailAdd) {
		this.vedOldEmailAdd = vedOldEmailAdd;
	}

	public String getVedNewEmailAdd() {
		return vedNewEmailAdd;
	}

	public void setVedNewEmailAdd(String vedNewEmailAdd) {
		this.vedNewEmailAdd = vedNewEmailAdd;
	}

	public String getVedDocType() {
		return vedDocType;
	}

	public void setVedDocType(String vedDocType) {
		this.vedDocType = vedDocType;
	}

	public String getVedDelivCurrent() {
		return vedDelivCurrent;
	}

	public void setVedDelivCurrent(String vedDelivCurrent) {
		this.vedDelivCurrent = vedDelivCurrent;
	}

	public String getVedDelivNew() {
		return vedDelivNew;
	}

	public void setVedDelivNew(String vedDelivNew) {
		this.vedDelivNew = vedDelivNew;
	}

	public Integer getVedRetryCnt() {
		return vedRetryCnt;
	}

	public void setVedRetryCnt(Integer vedRetryCnt) {
		this.vedRetryCnt = vedRetryCnt;
	}

	public DateTime getVedRetryDatetime() {
		return vedRetryDatetime;
	}

	public void setVedRetryDatetime(DateTime vedRetryDatetime) {
		this.vedRetryDatetime = vedRetryDatetime;
	}

	public String getVedComment() {
		return vedComment;
	}

	public void setVedComment(String vedComment) {
		this.vedComment = vedComment;
	}

	public String getVedStatus() {
		return vedStatus;
	}

	public void setVedStatus(String vedStatus) {
		this.vedStatus = vedStatus;
	}

	public DateTime getVedStatusDate() {
		return vedStatusDate;
	}

	public void setVedStatusDate(DateTime vedStatusDate) {
		this.vedStatusDate = vedStatusDate;
	}

	@Override
	public String toString() {
		return "\nVedValidDelivmethDMO [\nvedBillAcNo=" + vedBillAcNo + "\nvedSubscriberId=" + vedSubscriberId
				+ "\nvedOldEmailAdd=" + vedOldEmailAdd + "\nvedNewEmailAdd=" + vedNewEmailAdd + "\nvedDocType="
				+ vedDocType + "\nvedDelivCurrent=" + vedDelivCurrent + "\nvedDelivNew=" + vedDelivNew
				+ "\nvedRetryCnt=" + vedRetryCnt + "\nvedRetryDatetime=" + vedRetryDatetime + "\nvedComment="
				+ vedComment + "\nvedStatus=" + vedStatus + "\nvedStatusDate=" + vedStatusDate + "]";
	}

}
