package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;
import com.eppixcomm.eppix.common.util.Date;
import com.eppixcomm.eppix.common.util.DateTime;

public class SbeSubEquipHistDMO extends DBO implements Serializable {

	private Integer sbeHistEquipId;
	private Integer sbeHistSubId;
	private String sbeHistComment;
	private String sbeHistAction;
	private String sbeHistUserId;
	private DateTime sbeHistTimestamp;

	public static final int sbeHistEquipIdFilter = 0;

	public static final int sbeHistSubIdFilter = 1;

	public static final int sbeHistCommentFilter = 2;
	private static final int sbeHistCommentSize = 50;

	public static final int sbeHistActionFilter = 3;
	private static final int sbeHistActionSize = 1;

	public static final int sbeHistUserIdFilter = 4;
	private static final int sbeHistUserIdSize = 10;

	public static final int sbeHistTimestampFilter = 5;

	public SbeSubEquipHistDMO() {
	};

	public SbeSubEquipHistDMO(final Integer sbeHistEquipId,
			final Integer sbeHistSubId, final String sbeHistComment,
			final String sbeHistAction, final String sbeHistUserId,
			final DateTime sbeHistTimestamp) {

		this.sbeHistEquipId = sbeHistEquipId;
		this.sbeHistSubId = sbeHistSubId;
		this.sbeHistComment = sbeHistComment;
		this.sbeHistAction = sbeHistAction;
		this.sbeHistUserId = sbeHistUserId;
		this.sbeHistTimestamp = sbeHistTimestamp;
	};

	private static final int[] fieldSizes = new int[] { 0, 0,
			sbeHistCommentSize, sbeHistActionSize, sbeHistUserIdSize, 0 };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_INTEGER,
			FIELD_TYPE_INTEGER, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_DATE };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] {
				this.sbeHistEquipId,
				this.sbeHistSubId,
				((this.sbeHistComment == null) ? null : (this.sbeHistComment
						.length() <= sbeHistCommentSize) ? this.sbeHistComment
						: this.sbeHistComment.substring(0,
								this.sbeHistCommentSize)),
				((this.sbeHistAction == null) ? null : (this.sbeHistAction
						.length() <= sbeHistActionSize) ? this.sbeHistAction
						: this.sbeHistAction.substring(0,
								this.sbeHistActionSize)),
				((this.sbeHistUserId == null) ? null : (this.sbeHistUserId
						.length() <= sbeHistUserIdSize) ? this.sbeHistUserId
						: this.sbeHistUserId.substring(0,
								this.sbeHistUserIdSize)), this.sbeHistTimestamp };
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
		this.sbeHistEquipId = ((Integer) fields[0]);
		this.sbeHistSubId = ((Integer) fields[1]);
		this.sbeHistComment = rtrim((String) fields[2]);
		this.sbeHistAction = rtrim((String) fields[3]);
		this.sbeHistUserId = rtrim((String) fields[4]);
		this.sbeHistTimestamp = ((fields[5] == null) ? null : new DateTime(
				(DateTime) fields[5]));
	}

	public void set(final Integer sbeHistEquipId, final Integer sbeHistSubId,
			final String sbeHistComment, final String sbeHistAction,
			final String sbeHistUserId, final DateTime sbeHistTimestamp) {

		this.sbeHistEquipId = sbeHistEquipId;
		this.sbeHistSubId = sbeHistSubId;
		this.sbeHistComment = sbeHistComment;
		this.sbeHistAction = sbeHistAction;
		this.sbeHistUserId = sbeHistUserId;
		this.sbeHistTimestamp = sbeHistTimestamp;
	}

	public Integer getSbeHistEquipId() {
		return sbeHistEquipId;
	}

	public void setSbeHistEquipId(Integer sbeHistEquipId) {
		this.sbeHistEquipId = sbeHistEquipId;
	}

	public Integer getSbeHistSubId() {
		return sbeHistSubId;
	}

	public void setSbeHistSubId(Integer sbeHistSubId) {
		this.sbeHistSubId = sbeHistSubId;
	}

	public String getSbeHistComment() {
		return sbeHistComment;
	}

	public void setSbeHistComment(String sbeHistComment) {
		this.sbeHistComment = sbeHistComment;
	}

	public String getSbeHistAction() {
		return sbeHistAction;
	}

	public void setSbeHistAction(String sbeHistAction) {
		this.sbeHistAction = sbeHistAction;
	}

	public String getSbeHistUserId() {
		return sbeHistUserId;
	}

	public void setSbeHistUserId(String sbeHistUserId) {
		this.sbeHistUserId = sbeHistUserId;
	}

	public DateTime getSbeHistTimestamp() {
		return sbeHistTimestamp;
	}

	public void setSbeHistTimestamp(DateTime sbeHistTimestamp) {
		this.sbeHistTimestamp = sbeHistTimestamp;
	}

}
