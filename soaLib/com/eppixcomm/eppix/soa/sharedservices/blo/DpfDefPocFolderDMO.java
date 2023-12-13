package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;
import java.math.BigDecimal;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;
import com.eppixcomm.eppix.common.util.Date;

public class DpfDefPocFolderDMO extends DBO implements Serializable {

	private String dpfBillAcNo;
	private String dpfBillCycle;
	private Integer dpfEnterpriseId;
	private String dpfEnterpriseName;
	private String dpfEnterpriseDomain;
	private Integer dpfGroupId;
	private String dpfGroupExt;
	private String dpfGroupContact;
	private String dpfGroupEmail;
	private String dpfGroupContactNo;
	private String dpfSbillCharges;
	private String dpfSbillUsage;
	private String dpfSupportProduct;
	private String dpfEhId;
	private String dpfName;
	private Integer dpfFolderId;
	private String dpfStatus;
	private Date dpfCreationDate;
	private Date dpfConnectDate;
	private String dpfN2nFolder;
	private String dpfMsisdnNo;
	private String dpfSimNo;
	private String dpfProduct;
	private String dpfReverseBill;
	private BigDecimal dpfThresholdPerc;
	private BigDecimal dpfThresholdVal;
	private BigDecimal dpfBundleVal;

	public static final int dpfBillAcNoFilter = 0;
	private static final int dpfBillAcNoSize = 8;

	public static final int dpfBillCycleFilter = 1;
	private static final int dpfBillCycleSize = 5;

	public static final int dpfEnterpriseIdFilter = 2;

	public static final int dpfEnterpriseNameFilter = 3;
	private static final int dpfEnterpriseNameSize = 20;

	public static final int dpfEnterpriseDomainFilter = 4;
	private static final int dpfEnterpriseDomainSize = 255;

	public static final int dpfGroupIdFilter = 5;

	public static final int dpfGroupExtFilter = 6;
	private static final int dpfGroupExtSize = 10;

	public static final int dpfGroupContactFilter = 7;
	private static final int dpfGroupContactSize = 100;

	public static final int dpfGroupEmailFilter = 8;
	private static final int dpfGroupEmailSize = 50;

	public static final int dpfGroupContactNoFilter = 9;
	private static final int dpfGroupContactNoSize = 15;

	public static final int dpfSbillChargesFilter = 10;
	private static final int dpfSbillChargesSize = 10;

	public static final int dpfSbillUsageFilter = 11;
	private static final int dpfSbillUsageSize = 10;

	public static final int dpfSupportProductFilter = 12;
	private static final int dpfSupportProductSize = 4;

	public static final int dpfEhIdFilter = 13;
	private static final int dpfEhIdSize = 2;

	public static final int dpfNameFilter = 14;
	private static final int dpfNameSize = 20;

	public static final int dpfFolderIdFilter = 15;

	public static final int dpfStatusFilter = 16;
	private static final int dpfStatusSize = 1;

	public static final int dpfCreationDateFilter = 17;

	public static final int dpfConnectDateFilter = 18;

	public static final int dpfN2nFolderFilter = 19;
	private static final int dpfN2nFolderSize = 20;

	public static final int dpfMsisdnNoFilter = 20;
	private static final int dpfMsisdnNoSize = 15;

	public static final int dpfSimNoFilter = 21;
	private static final int dpfSimNoSize = 14;

	public static final int dpfProductFilter = 22;
	private static final int dpfProductSize = 7;

	public static final int dpfReverseBillFilter = 23;
	private static final int dpfReverseBillSize = 1;

	public static final int dpfThresholdPercFilter = 24;

	public static final int dpfThresholdValFilter = 25;

	public static final int dpfBundleValFilter = 26;

	public DpfDefPocFolderDMO() {
	};

	public DpfDefPocFolderDMO(final String dpfBillAcNo,
			final String dpfBillCycle, final Integer dpfEnterpriseId,
			final String dpfEnterpriseName, final String dpfEnterpriseDomain,
			final Integer dpfGroupId, final String dpfGroupExt,
			final String dpfGroupContact, final String dpfGroupEmail,
			final String dpfGroupContactNo, final String dpfSbillCharges,
			final String dpfSbillUsage, final String dpfSupportProduct,
			final String dpfEhId, final String dpfName,
			final Integer dpfFolderId, final String dpfStatus,
			final Date dpfCreationDate, final Date dpfConnectDate,
			final String dpfN2nFolder, final String dpfMsisdnNo,
			final String dpfSimNo, final String dpfProduct,
			final String dpfReverseBill, final BigDecimal dpfThresholdPerc,
			final BigDecimal dpfThresholdVal, final BigDecimal dpfBundleVal) {

		this.dpfBillAcNo = dpfBillAcNo;
		this.dpfBillCycle = dpfBillCycle;
		this.dpfEnterpriseId = dpfEnterpriseId;
		this.dpfEnterpriseName = dpfEnterpriseName;
		this.dpfEnterpriseDomain = dpfEnterpriseDomain;
		this.dpfGroupId = dpfGroupId;
		this.dpfGroupExt = dpfGroupExt;
		this.dpfGroupContact = dpfGroupContact;
		this.dpfGroupEmail = dpfGroupEmail;
		this.dpfGroupContactNo = dpfGroupContactNo;
		this.dpfSbillCharges = dpfSbillCharges;
		this.dpfSbillUsage = dpfSbillUsage;
		this.dpfSupportProduct = dpfSupportProduct;
		this.dpfEhId = dpfEhId;
		this.dpfName = dpfName;
		this.dpfFolderId = dpfFolderId;
		this.dpfStatus = dpfStatus;
		this.dpfCreationDate = dpfCreationDate;
		this.dpfConnectDate = dpfConnectDate;
		this.dpfN2nFolder = dpfN2nFolder;
		this.dpfMsisdnNo = dpfMsisdnNo;
		this.dpfSimNo = dpfSimNo;
		this.dpfProduct = dpfProduct;
		this.dpfReverseBill = dpfReverseBill;
		this.dpfThresholdPerc = dpfThresholdPerc;
		this.dpfThresholdVal = dpfThresholdVal;
		this.dpfBundleVal = dpfBundleVal;
	};

	private static final int[] fieldSizes = new int[] { dpfBillAcNoSize,
			dpfBillCycleSize, 0, dpfEnterpriseNameSize,
			dpfEnterpriseDomainSize, 0, dpfGroupExtSize, dpfGroupContactSize,
			dpfGroupEmailSize, dpfGroupContactNoSize, dpfSbillChargesSize,
			dpfSbillUsageSize, dpfSupportProductSize, dpfEhIdSize, dpfNameSize,
			0, dpfStatusSize, 0, 0, dpfN2nFolderSize, dpfMsisdnNoSize,
			dpfSimNoSize, dpfProductSize, dpfReverseBillSize, 0, 0, 0 };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_INTEGER, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_INTEGER, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_INTEGER,
			FIELD_TYPE_STRING, FIELD_TYPE_DATE, FIELD_TYPE_DATE,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_BIGDECIMAL,
			FIELD_TYPE_BIGDECIMAL, FIELD_TYPE_BIGDECIMAL };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] {
				((this.dpfBillAcNo == null) ? null
						: (this.dpfBillAcNo.length() <= dpfBillAcNoSize) ? this.dpfBillAcNo
								: this.dpfBillAcNo.substring(0,
										this.dpfBillAcNoSize)),
				((this.dpfBillCycle == null) ? null : (this.dpfBillCycle
						.length() <= dpfBillCycleSize) ? this.dpfBillCycle
						: this.dpfBillCycle.substring(0, this.dpfBillCycleSize)),
				this.dpfEnterpriseId,
				((this.dpfEnterpriseName == null) ? null
						: (this.dpfEnterpriseName.length() <= dpfEnterpriseNameSize) ? this.dpfEnterpriseName
								: this.dpfEnterpriseName.substring(0,
										this.dpfEnterpriseNameSize)),
				((this.dpfEnterpriseDomain == null) ? null
						: (this.dpfEnterpriseDomain.length() <= dpfEnterpriseDomainSize) ? this.dpfEnterpriseDomain
								: this.dpfEnterpriseDomain.substring(0,
										this.dpfEnterpriseDomainSize)),
				this.dpfGroupId,
				((this.dpfGroupExt == null) ? null
						: (this.dpfGroupExt.length() <= dpfGroupExtSize) ? this.dpfGroupExt
								: this.dpfGroupExt.substring(0,
										this.dpfGroupExtSize)),
				((this.dpfGroupContact == null) ? null
						: (this.dpfGroupContact.length() <= dpfGroupContactSize) ? this.dpfGroupContact
								: this.dpfGroupContact.substring(0,
										this.dpfGroupContactSize)),
				((this.dpfGroupEmail == null) ? null : (this.dpfGroupEmail
						.length() <= dpfGroupEmailSize) ? this.dpfGroupEmail
						: this.dpfGroupEmail.substring(0,
								this.dpfGroupEmailSize)),
				((this.dpfGroupContactNo == null) ? null
						: (this.dpfGroupContactNo.length() <= dpfGroupContactNoSize) ? this.dpfGroupContactNo
								: this.dpfGroupContactNo.substring(0,
										this.dpfGroupContactNoSize)),
				((this.dpfSbillCharges == null) ? null
						: (this.dpfSbillCharges.length() <= dpfSbillChargesSize) ? this.dpfSbillCharges
								: this.dpfSbillCharges.substring(0,
										this.dpfSbillChargesSize)),
				((this.dpfSbillUsage == null) ? null : (this.dpfSbillUsage
						.length() <= dpfSbillUsageSize) ? this.dpfSbillUsage
						: this.dpfSbillUsage.substring(0,
								this.dpfSbillUsageSize)),
				((this.dpfSupportProduct == null) ? null
						: (this.dpfSupportProduct.length() <= dpfSupportProductSize) ? this.dpfSupportProduct
								: this.dpfSupportProduct.substring(0,
										this.dpfSupportProductSize)),
				((this.dpfEhId == null) ? null
						: (this.dpfEhId.length() <= dpfEhIdSize) ? this.dpfEhId
								: this.dpfEhId.substring(0, this.dpfEhIdSize)),
				((this.dpfName == null) ? null
						: (this.dpfName.length() <= dpfNameSize) ? this.dpfName
								: this.dpfName.substring(0, this.dpfNameSize)),
				this.dpfFolderId,
				((this.dpfStatus == null) ? null
						: (this.dpfStatus.length() <= dpfStatusSize) ? this.dpfStatus
								: this.dpfStatus.substring(0,
										this.dpfStatusSize)),
				this.dpfCreationDate,
				this.dpfConnectDate,
				((this.dpfN2nFolder == null) ? null : (this.dpfN2nFolder
						.length() <= dpfN2nFolderSize) ? this.dpfN2nFolder
						: this.dpfN2nFolder.substring(0, this.dpfN2nFolderSize)),
				((this.dpfMsisdnNo == null) ? null
						: (this.dpfMsisdnNo.length() <= dpfMsisdnNoSize) ? this.dpfMsisdnNo
								: this.dpfMsisdnNo.substring(0,
										this.dpfMsisdnNoSize)),
				((this.dpfSimNo == null) ? null
						: (this.dpfSimNo.length() <= dpfSimNoSize) ? this.dpfSimNo
								: this.dpfSimNo.substring(0, this.dpfSimNoSize)),
				((this.dpfProduct == null) ? null
						: (this.dpfProduct.length() <= dpfProductSize) ? this.dpfProduct
								: this.dpfProduct.substring(0,
										this.dpfProductSize)),
				((this.dpfReverseBill == null) ? null : (this.dpfReverseBill
						.length() <= dpfReverseBillSize) ? this.dpfReverseBill
						: this.dpfReverseBill.substring(0,
								this.dpfReverseBillSize)),
				this.dpfThresholdPerc, this.dpfThresholdVal, this.dpfBundleVal };
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
		this.dpfBillAcNo = rtrim((String) fields[0]);
		this.dpfBillCycle = rtrim((String) fields[1]);
		this.dpfEnterpriseId = ((Integer) fields[2]);
		this.dpfEnterpriseName = rtrim((String) fields[3]);
		this.dpfEnterpriseDomain = rtrim((String) fields[4]);
		this.dpfGroupId = ((Integer) fields[5]);
		this.dpfGroupExt = rtrim((String) fields[6]);
		this.dpfGroupContact = rtrim((String) fields[7]);
		this.dpfGroupEmail = rtrim((String) fields[8]);
		this.dpfGroupContactNo = rtrim((String) fields[9]);
		this.dpfSbillCharges = rtrim((String) fields[10]);
		this.dpfSbillUsage = rtrim((String) fields[11]);
		this.dpfSupportProduct = rtrim((String) fields[12]);
		this.dpfEhId = rtrim((String) fields[13]);
		this.dpfName = rtrim((String) fields[14]);
		this.dpfFolderId = (Integer) fields[15];
		this.dpfStatus = rtrim((String) fields[16]);
		this.dpfCreationDate = ((Date) fields[17]);
		this.dpfConnectDate = ((Date) fields[18]);
		this.dpfN2nFolder = rtrim((String) fields[19]);
		this.dpfMsisdnNo = rtrim((String) fields[20]);
		this.dpfSimNo = rtrim((String) fields[21]);
		this.dpfProduct = rtrim((String) fields[22]);
		this.dpfReverseBill = rtrim((String) fields[23]);
		this.dpfThresholdPerc = (BigDecimal) fields[24];
		this.dpfThresholdVal = (BigDecimal) fields[25];
		this.dpfBundleVal = (BigDecimal) fields[26];
	}

	public void set(final String dpfBillAcNo, final String dpfBillCycle,
			final Integer dpfEnterpriseId, final String dpfEnterpriseName,
			final String dpfEnterpriseDomain, final Integer dpfGroupId,
			final String dpfGroupExt, final String dpfGroupContact,
			final String dpfGroupEmail, final String dpfGroupContactNo,
			final String dpfSbillCharges, final String dpfSbillUsage,
			final String dpfSupportProduct, final String dpfEhId,
			final String dpfName, final Integer dpfFolderId,
			final String dpfStatus, final Date dpfCreationDate,
			final Date dpfConnectDate, final String dpfN2nFolder,
			final String dpfMsisdnNo, final String dpfSimNo,
			final String dpfProduct, final String dpfReverseBill,
			final BigDecimal dpfThresholdPerc,
			final BigDecimal dpfThresholdVal, final BigDecimal dpfBundleVal) {

		this.dpfBillAcNo = dpfBillAcNo;
		this.dpfBillCycle = dpfBillCycle;
		this.dpfEnterpriseId = dpfEnterpriseId;
		this.dpfEnterpriseName = dpfEnterpriseName;
		this.dpfEnterpriseDomain = dpfEnterpriseDomain;
		this.dpfGroupId = dpfGroupId;
		this.dpfGroupExt = dpfGroupExt;
		this.dpfGroupContact = dpfGroupContact;
		this.dpfGroupEmail = dpfGroupEmail;
		this.dpfGroupContactNo = dpfGroupContactNo;
		this.dpfSbillCharges = dpfSbillCharges;
		this.dpfSbillUsage = dpfSbillUsage;
		this.dpfSupportProduct = dpfSupportProduct;
		this.dpfEhId = dpfEhId;
		this.dpfName = dpfName;
		this.dpfFolderId = dpfFolderId;
		this.dpfStatus = dpfStatus;
		this.dpfCreationDate = dpfCreationDate;
		this.dpfConnectDate = dpfConnectDate;
		this.dpfN2nFolder = dpfN2nFolder;
		this.dpfMsisdnNo = dpfMsisdnNo;
		this.dpfSimNo = dpfSimNo;
		this.dpfProduct = dpfProduct;
		this.dpfReverseBill = dpfReverseBill;
		this.dpfThresholdPerc = dpfThresholdPerc;
		this.dpfThresholdVal = dpfThresholdVal;
		this.dpfBundleVal = dpfBundleVal;
	}

	public String getDpfBillAcNo() {
		return dpfBillAcNo;
	}

	public void setDpfBillAcNo(String dpfBillAcNo) {
		this.dpfBillAcNo = dpfBillAcNo;
	}

	public String getDpfBillCycle() {
		return dpfBillCycle;
	}

	public void setDpfBillCycle(String dpfBillCycle) {
		this.dpfBillCycle = dpfBillCycle;
	}

	public Integer getDpfEnterpriseId() {
		return dpfEnterpriseId;
	}

	public void setDpfEnterpriseId(Integer dpfEnterpriseId) {
		this.dpfEnterpriseId = dpfEnterpriseId;
	}

	public String getDpfEnterpriseName() {
		return dpfEnterpriseName;
	}

	public void setDpfEnterpriseName(String dpfEnterpriseName) {
		this.dpfEnterpriseName = dpfEnterpriseName;
	}

	public String getDpfEnterpriseDomain() {
		return dpfEnterpriseDomain;
	}

	public void setDpfEnterpriseDomain(String dpfEnterpriseDomain) {
		this.dpfEnterpriseDomain = dpfEnterpriseDomain;
	}

	public Integer getDpfGroupId() {
		return dpfGroupId;
	}

	public void setDpfGroupId(Integer dpfGroupId) {
		this.dpfGroupId = dpfGroupId;
	}

	public String getDpfGroupExt() {
		return dpfGroupExt;
	}

	public void setDpfGroupExt(String dpfGroupExt) {
		this.dpfGroupExt = dpfGroupExt;
	}

	public String getDpfGroupContact() {
		return dpfGroupContact;
	}

	public void setDpfGroupContact(String dpfGroupContact) {
		this.dpfGroupContact = dpfGroupContact;
	}

	public String getDpfGroupEmail() {
		return dpfGroupEmail;
	}

	public void setDpfGroupEmail(String dpfGroupEmail) {
		this.dpfGroupEmail = dpfGroupEmail;
	}

	public String getDpfGroupContactNo() {
		return dpfGroupContactNo;
	}

	public void setDpfGroupContactNo(String dpfGroupContactNo) {
		this.dpfGroupContactNo = dpfGroupContactNo;
	}

	public String getDpfSbillCharges() {
		return dpfSbillCharges;
	}

	public void setDpfSbillCharges(String dpfSbillCharges) {
		this.dpfSbillCharges = dpfSbillCharges;
	}

	public String getDpfSbillUsage() {
		return dpfSbillUsage;
	}

	public void setDpfSbillUsage(String dpfSbillUsage) {
		this.dpfSbillUsage = dpfSbillUsage;
	}

	public String getDpfSupportProduct() {
		return dpfSupportProduct;
	}

	public void setDpfSupportProduct(String dpfSupportProduct) {
		this.dpfSupportProduct = dpfSupportProduct;
	}

	public String getDpfEhId() {
		return dpfEhId;
	}

	public void setDpfEhId(String dpfEhId) {
		this.dpfEhId = dpfEhId;
	}

	public String getDpfName() {
		return dpfName;
	}

	public void setDpfName(String dpfName) {
		this.dpfName = dpfName;
	}

	public Integer getDpfFolderId() {
		return dpfFolderId;
	}

	public void setDpfFolderId(Integer dpfFolderId) {
		this.dpfFolderId = dpfFolderId;
	}

	public String getDpfStatus() {
		return dpfStatus;
	}

	public void setDpfStatus(String dpfStatus) {
		this.dpfStatus = dpfStatus;
	}

	public Date getDpfCreationDate() {
		return dpfCreationDate;
	}

	public void setDpfCreationDate(Date dpfCreationDate) {
		this.dpfCreationDate = dpfCreationDate;
	}

	public Date getDpfConnectDate() {
		return dpfConnectDate;
	}

	public void setDpfConnectDate(Date dpfConnectDate) {
		this.dpfConnectDate = dpfConnectDate;
	}

	public String getDpfN2nFolder() {
		return dpfN2nFolder;
	}

	public void setDpfN2nFolder(String dpfN2nFolder) {
		this.dpfN2nFolder = dpfN2nFolder;
	}

	public String getDpfMsisdnNo() {
		return dpfMsisdnNo;
	}

	public void setDpfMsisdnNo(String dpfMsisdnNo) {
		this.dpfMsisdnNo = dpfMsisdnNo;
	}

	public String getDpfSimNo() {
		return dpfSimNo;
	}

	public void setDpfSimNo(String dpfSimNo) {
		this.dpfSimNo = dpfSimNo;
	}

	public String getDpfProduct() {
		return dpfProduct;
	}

	public void setDpfProduct(String dpfProduct) {
		this.dpfProduct = dpfProduct;
	}

	public String getDpfReverseBill() {
		return dpfReverseBill;
	}

	public void setDpfReverseBill(String dpfReverseBill) {
		this.dpfReverseBill = dpfReverseBill;
	}

	public BigDecimal getDpfThresholdPerc() {
		return dpfThresholdPerc;
	}

	public void setDpfThresholdPerc(BigDecimal dpfThresholdPerc) {
		this.dpfThresholdPerc = dpfThresholdPerc;
	}

	public BigDecimal getDpfThresholdVal() {
		return dpfThresholdVal;
	}

	public void setDpfThresholdVal(BigDecimal dpfThresholdVal) {
		this.dpfThresholdVal = dpfThresholdVal;
	}

	public BigDecimal getDpfBundleVal() {
		return dpfBundleVal;
	}

	public void setDpfBundleVal(BigDecimal dpfBundleVal) {
		this.dpfBundleVal = dpfBundleVal;
	}

}
