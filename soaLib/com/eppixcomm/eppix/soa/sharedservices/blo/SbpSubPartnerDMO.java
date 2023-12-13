package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;
import com.eppixcomm.eppix.common.util.Date;

public class SbpSubPartnerDMO extends DBO implements Serializable {

	private Integer sbpSubPartnerId;
	private Integer sbpSubscriberId;
	private Integer sbpPartnerId;
	private String sbpBenefitStatus;
	private String sbpPriMemberNo;
	private String sbpAltMemberNo;
	private String sbpMemberStatus;
	private String sbpLastAuthCode;
	private Date sbpLastStatChge;
	private String sbpHandset;
	private Integer sbpConfigId;
	private String sbpAnalysis1;
	private String sbpAnalysis2;
	private String sbpAnalysis3;
	private String sbpAnalysis4;
	private String sbpAnalysis5;

	public static final int sbpSubPartnerIdFilter = 0;
	private static final int sbpSubPartnerIdSize = 1;

	public static final int sbpSubscriberIdFilter = 1;

	public static final int sbpPartnerIdFilter = 2;

	public static final int sbpBenefitStatusFilter = 3;
	private static final int sbpBenefitStatusSize = 1;

	public static final int sbpPriMemberNoFilter = 4;
	private static final int sbpPriMemberNoSize = 16;

	public static final int sbpAltMemberNoFilter = 5;
	private static final int sbpAltMemberNoSize = 16;

	public static final int sbpMemberStatusFilter = 6;
	private static final int sbpMemberStatusSize = 16;

	public static final int sbpLastAuthCodeFilter = 7;
	private static final int sbpLastAuthCodeSize = 32;

	public static final int sbpLastStatChgeFilter = 8;

	public static final int sbpHandsetFilter = 9;
	private static final int sbpHandsetSize = 1;

	public static final int sbpConfigIdFilter = 10;

	public static final int sbpAnalysis1Filter = 11;
	private static final int sbpAnalysis1Size = 32;

	public static final int sbpAnalysis2Filter = 12;
	private static final int sbpAnalysis2Size = 32;

	public static final int sbpAnalysis3Filter = 13;
	private static final int sbpAnalysis3Size = 32;

	public static final int sbpAnalysis4Filter = 14;
	private static final int sbpAnalysis4Size = 32;

	public static final int sbpAnalysis5Filter = 15;
	private static final int sbpAnalysis5Size = 32;

	public SbpSubPartnerDMO() {
	};

	public SbpSubPartnerDMO(final Integer sbpSubPartnerId,
			final Integer sbpSubscriberId, final Integer sbpPartnerId,
			final String sbpBenefitStatus, final String sbpPriMemberNo,
			final String sbpAltMemberNo, final String sbpMemberStatus,
			final String sbpLastAuthCode, final Date sbpLastStatChge,
			final String sbpHandset, final Integer sbpConfigId,
			final String sbpAnalysis1, final String sbpAnalysis2,
			final String sbpAnalysis3, final String sbpAnalysis4,
			final String sbpAnalysis5) {

		this.sbpSubPartnerId = sbpSubPartnerId;
		this.sbpSubscriberId = sbpSubscriberId;
		this.sbpPartnerId = sbpPartnerId;
		this.sbpBenefitStatus = sbpBenefitStatus;
		this.sbpPriMemberNo = sbpPriMemberNo;
		this.sbpAltMemberNo = sbpAltMemberNo;
		this.sbpMemberStatus = sbpMemberStatus;
		this.sbpLastAuthCode = sbpLastAuthCode;
		this.sbpLastStatChge = sbpLastStatChge;
		this.sbpHandset = sbpHandset;
		this.sbpConfigId = sbpConfigId;
		this.sbpAnalysis1 = sbpAnalysis1;
		this.sbpAnalysis2 = sbpAnalysis2;
		this.sbpAnalysis3 = sbpAnalysis3;
		this.sbpAnalysis4 = sbpAnalysis4;
		this.sbpAnalysis5 = sbpAnalysis5;
	};

	private static final int[] fieldSizes = new int[] { sbpSubPartnerIdSize, 0,
			0, sbpBenefitStatusSize, sbpPriMemberNoSize, sbpAltMemberNoSize,
			sbpMemberStatusSize, sbpLastAuthCodeSize, 0, sbpHandsetSize, 0,
			sbpAnalysis1Size, sbpAnalysis2Size, sbpAnalysis3Size,
			sbpAnalysis4Size, sbpAnalysis5Size };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_INTEGER,
			FIELD_TYPE_INTEGER, FIELD_TYPE_INTEGER, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_DATE, FIELD_TYPE_STRING,
			FIELD_TYPE_INTEGER, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] {
				this.sbpSubPartnerId,
				this.sbpSubscriberId,
				this.sbpPartnerId,
				((this.sbpBenefitStatus == null) ? null
						: (this.sbpBenefitStatus.length() <= sbpBenefitStatusSize) ? this.sbpBenefitStatus
								: this.sbpBenefitStatus.substring(0,
										this.sbpBenefitStatusSize)),
				((this.sbpPriMemberNo == null) ? null : (this.sbpPriMemberNo
						.length() <= sbpPriMemberNoSize) ? this.sbpPriMemberNo
						: this.sbpPriMemberNo.substring(0,
								this.sbpPriMemberNoSize)),
				((this.sbpAltMemberNo == null) ? null : (this.sbpAltMemberNo
						.length() <= sbpAltMemberNoSize) ? this.sbpAltMemberNo
						: this.sbpAltMemberNo.substring(0,
								this.sbpAltMemberNoSize)),
				((this.sbpMemberStatus == null) ? null
						: (this.sbpMemberStatus.length() <= sbpMemberStatusSize) ? this.sbpMemberStatus
								: this.sbpMemberStatus.substring(0,
										this.sbpMemberStatusSize)),
				((this.sbpLastAuthCode == null) ? null
						: (this.sbpLastAuthCode.length() <= sbpLastAuthCodeSize) ? this.sbpLastAuthCode
								: this.sbpLastAuthCode.substring(0,
										this.sbpLastAuthCodeSize)),
				this.sbpLastStatChge,
				((this.sbpHandset == null) ? null
						: (this.sbpHandset.length() <= sbpHandsetSize) ? this.sbpHandset
								: this.sbpHandset.substring(0,
										this.sbpHandsetSize)),
				this.sbpConfigId,
				((this.sbpAnalysis1 == null) ? null : (this.sbpAnalysis1
						.length() <= sbpAnalysis1Size) ? this.sbpAnalysis1
						: this.sbpAnalysis1.substring(0, this.sbpAnalysis1Size)),
				((this.sbpAnalysis2 == null) ? null : (this.sbpAnalysis2
						.length() <= sbpAnalysis2Size) ? this.sbpAnalysis2
						: this.sbpAnalysis2.substring(0, this.sbpAnalysis2Size)),
				((this.sbpAnalysis3 == null) ? null : (this.sbpAnalysis3
						.length() <= sbpAnalysis3Size) ? this.sbpAnalysis3
						: this.sbpAnalysis3.substring(0, this.sbpAnalysis3Size)),
				((this.sbpAnalysis4 == null) ? null : (this.sbpAnalysis4
						.length() <= sbpAnalysis4Size) ? this.sbpAnalysis4
						: this.sbpAnalysis4.substring(0, this.sbpAnalysis4Size)),
				((this.sbpAnalysis5 == null) ? null : (this.sbpAnalysis5
						.length() <= sbpAnalysis5Size) ? this.sbpAnalysis5
						: this.sbpAnalysis5.substring(0, this.sbpAnalysis5Size)) };
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
		return new DAOArgs(2).arg(this.sbpSubscriberId).arg(sbpSubPartnerId);
	}

	protected void set(Object[] fields) {
		this.sbpSubPartnerId = ((Integer) fields[0]);
		this.sbpSubscriberId = ((Integer) fields[1]);
		this.sbpPartnerId = ((Integer) fields[2]);
		this.sbpBenefitStatus = rtrim((String) fields[3]);
		this.sbpPriMemberNo = rtrim((String) fields[4]);
		this.sbpAltMemberNo = rtrim((String) fields[5]);
		this.sbpMemberStatus = rtrim((String) fields[6]);
		this.sbpLastAuthCode = rtrim((String) fields[7]);
		this.sbpLastStatChge = ((fields[8] == null) ? null
				: new Date(fields[8]));
		this.sbpHandset = rtrim((String) fields[9]);
		this.sbpConfigId = ((Integer) fields[10]);
		this.sbpAnalysis1 = rtrim((String) fields[11]);
		this.sbpAnalysis2 = rtrim((String) fields[12]);
		this.sbpAnalysis3 = rtrim((String) fields[13]);
		this.sbpAnalysis4 = rtrim((String) fields[14]);
		this.sbpAnalysis5 = rtrim((String) fields[15]);
	}

	public void set(final Integer sbpSubPartnerId,
			final Integer sbpSubscriberId, final Integer sbpPartnerId,
			final String sbpBenefitStatus, final String sbpPriMemberNo,
			final String sbpAltMemberNo, final String sbpMemberStatus,
			final String sbpLastAuthCode, final Date sbpLastStatChge,
			final String sbpHandset, final Integer sbpConfigId,
			final String sbpAnalysis1, final String sbpAnalysis2,
			final String sbpAnalysis3, final String sbpAnalysis4,
			final String sbpAnalysis5) {

		this.sbpSubPartnerId = sbpSubPartnerId;
		this.sbpSubscriberId = sbpSubscriberId;
		this.sbpPartnerId = sbpPartnerId;
		this.sbpBenefitStatus = sbpBenefitStatus;
		this.sbpPriMemberNo = sbpPriMemberNo;
		this.sbpAltMemberNo = sbpAltMemberNo;
		this.sbpMemberStatus = sbpMemberStatus;
		this.sbpLastAuthCode = sbpLastAuthCode;
		this.sbpLastStatChge = sbpLastStatChge;
		this.sbpHandset = sbpHandset;
		this.sbpConfigId = sbpConfigId;
		this.sbpAnalysis1 = sbpAnalysis1;
		this.sbpAnalysis2 = sbpAnalysis2;
		this.sbpAnalysis3 = sbpAnalysis3;
		this.sbpAnalysis4 = sbpAnalysis4;
		this.sbpAnalysis5 = sbpAnalysis5;
	}

	public Integer getSbpSubPartnerId() {
		return sbpSubPartnerId;
	}

	public void setSbpSubPartnerId(Integer sbpSubPartnerId) {
		this.sbpSubPartnerId = sbpSubPartnerId;
	}

	public Integer getSbpSubscriberId() {
		return sbpSubscriberId;
	}

	public void setSbpSubscriberId(Integer sbpSubscriberId) {
		this.sbpSubscriberId = sbpSubscriberId;
	}

	public Integer getSbpPartnerId() {
		return sbpPartnerId;
	}

	public void setSbpPartnerId(Integer sbpPartnerId) {
		this.sbpPartnerId = sbpPartnerId;
	}

	public String getSbpBenefitStatus() {
		return sbpBenefitStatus;
	}

	public void setSbpBenefitStatus(String sbpBenefitStatus) {
		this.sbpBenefitStatus = sbpBenefitStatus;
	}

	public String getSbpPriMemberNo() {
		return sbpPriMemberNo;
	}

	public void setSbpPriMemberNo(String sbpPriMemberNo) {
		this.sbpPriMemberNo = sbpPriMemberNo;
	}

	public String getSbpAltMemberNo() {
		return sbpAltMemberNo;
	}

	public void setSbpAltMemberNo(String sbpAltMemberNo) {
		this.sbpAltMemberNo = sbpAltMemberNo;
	}

	public String getSbpMemberStatus() {
		return sbpMemberStatus;
	}

	public void setSbpMemberStatus(String sbpMemberStatus) {
		this.sbpMemberStatus = sbpMemberStatus;
	}

	public String getSbpLastAuthCode() {
		return sbpLastAuthCode;
	}

	public void setSbpLastAuthCode(String sbpLastAuthCode) {
		this.sbpLastAuthCode = sbpLastAuthCode;
	}

	public Date getSbpLastStatChge() {
		return sbpLastStatChge;
	}

	public void setSbpLastStatChge(Date sbpLastStatChge) {
		this.sbpLastStatChge = sbpLastStatChge;
	}

	public String getSbpHandset() {
		return sbpHandset;
	}

	public void setSbpHandset(String sbpHandset) {
		this.sbpHandset = sbpHandset;
	}

	public Integer getSbpConfigId() {
		return sbpConfigId;
	}

	public void setSbpConfigId(Integer sbpConfigId) {
		this.sbpConfigId = sbpConfigId;
	}

	public String getSbpAnalysis1() {
		return sbpAnalysis1;
	}

	public void setSbpAnalysis1(String sbpAnalysis1) {
		this.sbpAnalysis1 = sbpAnalysis1;
	}

	public String getSbpAnalysis2() {
		return sbpAnalysis2;
	}

	public void setSbpAnalysis2(String sbpAnalysis2) {
		this.sbpAnalysis2 = sbpAnalysis2;
	}

	public String getSbpAnalysis3() {
		return sbpAnalysis3;
	}

	public void setSbpAnalysis3(String sbpAnalysis3) {
		this.sbpAnalysis3 = sbpAnalysis3;
	}

	public String getSbpAnalysis4() {
		return sbpAnalysis4;
	}

	public void setSbpAnalysis4(String sbpAnalysis4) {
		this.sbpAnalysis4 = sbpAnalysis4;
	}

	public String getSbpAnalysis5() {
		return sbpAnalysis5;
	}

	public void setSbpAnalysis5(String sbpAnalysis5) {
		this.sbpAnalysis5 = sbpAnalysis5;
	}

}
