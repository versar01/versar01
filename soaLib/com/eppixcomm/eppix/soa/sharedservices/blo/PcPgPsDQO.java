package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;

public class PcPgPsDQO extends DBO implements Serializable {

	private Integer pcConfigId;
	private Integer pcPartnerId;
	private String pcMemberStatus;
	private String pcPackageCode;
	private String pcTarplanRef;
	private String pcAltPackage;
	private String pcAltTariff;
	private String pcBenefitName;
	private String pcN2nStatus;
	private Integer pgGroupId;
	private Integer pgConfigId;
	private String pgGroupType;
	private Short pgGroupQuantity;
	private Integer psBenefitId;
	private Integer psGroupId;
	private String psBenefitType;
	private String psBenefitCode;
	private String psNnSuperproduct;
	private String psNnProduct;

	public static final int pcConfigIdFilter = 0;
	private static final int pcConfigIdSize = 1;

	public static final int pcPartnerIdFilter = 1;

	public static final int pcMemberStatusFilter = 2;
	private static final int pcMemberStatusSize = 16;

	public static final int pcPackageCodeFilter = 3;
	private static final int pcPackageCodeSize = 5;

	public static final int pcTarplanRefFilter = 4;
	private static final int pcTarplanRefSize = 3;

	public static final int pcAltPackageFilter = 5;
	private static final int pcAltPackageSize = 5;

	public static final int pcAltTariffFilter = 6;
	private static final int pcAltTariffSize = 3;

	public static final int pcBenefitNameFilter = 7;
	private static final int pcBenefitNameSize = 16;

	public static final int pcN2nStatusFilter = 8;
	private static final int pcN2nStatusSize = 7;

	public static final int pgGroupIdFilter = 9;
	private static final int pgGroupIdSize = 1;

	public static final int pgConfigIdFilter = 10;

	public static final int pgGroupTypeFilter = 11;
	private static final int pgGroupTypeSize = 1;

	public static final int pgGroupQuantityFilter = 12;

	public static final int psBenefitIdFilter = 13;
	private static final int psBenefitIdSize = 1;

	public static final int psGroupIdFilter = 14;

	public static final int psBenefitTypeFilter = 15;
	private static final int psBenefitTypeSize = 1;

	public static final int psBenefitCodeFilter = 16;
	private static final int psBenefitCodeSize = 5;

	public static final int psNnSuperproductFilter = 17;
	private static final int psNnSuperproductSize = 7;

	public static final int psNnProductFilter = 18;
	private static final int psNnProductSize = 7;

	public PcPgPsDQO() {
	};

	public PcPgPsDQO(final Integer pcConfigId, final Integer pcPartnerId,
			final String pcMemberStatus, final String pcPackageCode,
			final String pcTarplanRef, final String pcAltPackage,
			final String pcAltTariff, final String pcBenefitName,
			final String pcN2nStatus, final Integer pgGroupId,
			final Integer pgConfigId, final String pgGroupType,
			final Short pgGroupQuantity, final Integer psBenefitId,
			final Integer psGroupId, final String psBenefitType,
			final String psBenefitCode, final String psNnSuperproduct,
			final String psNnProduct) {

		this.pcConfigId = pcConfigId;
		this.pcPartnerId = pcPartnerId;
		this.pcMemberStatus = pcMemberStatus;
		this.pcPackageCode = pcPackageCode;
		this.pcTarplanRef = pcTarplanRef;
		this.pcAltPackage = pcAltPackage;
		this.pcAltTariff = pcAltTariff;
		this.pcBenefitName = pcBenefitName;
		this.pcN2nStatus = pcN2nStatus;
		this.pgGroupId = pgGroupId;
		this.pgConfigId = pgConfigId;
		this.pgGroupType = pgGroupType;
		this.pgGroupQuantity = pgGroupQuantity;
		this.psBenefitId = psBenefitId;
		this.psGroupId = psGroupId;
		this.psBenefitType = psBenefitType;
		this.psBenefitCode = psBenefitCode;
		this.psNnSuperproduct = psNnSuperproduct;
		this.psNnProduct = psNnProduct;
	};

	private static final int[] fieldSizes = new int[] { pcConfigIdSize, 0,
			pcMemberStatusSize, pcPackageCodeSize, pcTarplanRefSize,
			pcAltPackageSize, pcAltTariffSize, pcBenefitNameSize,
			pcN2nStatusSize, pgGroupIdSize, 0, pgGroupTypeSize, 0,
			psBenefitIdSize, 0, psBenefitTypeSize, psBenefitCodeSize,
			psNnSuperproductSize, psNnProductSize };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_INTEGER,
			FIELD_TYPE_INTEGER, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_INTEGER,
			FIELD_TYPE_INTEGER, FIELD_TYPE_STRING, FIELD_TYPE_SHORT,
			FIELD_TYPE_INTEGER, FIELD_TYPE_INTEGER, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] {
				this.pcConfigId,
				this.pcPartnerId,
				((this.pcMemberStatus == null) ? null : (this.pcMemberStatus
						.length() <= pcMemberStatusSize) ? this.pcMemberStatus
						: this.pcMemberStatus.substring(0,
								this.pcMemberStatusSize)),
				((this.pcPackageCode == null) ? null : (this.pcPackageCode
						.length() <= pcPackageCodeSize) ? this.pcPackageCode
						: this.pcPackageCode.substring(0,
								this.pcPackageCodeSize)),
				((this.pcTarplanRef == null) ? null : (this.pcTarplanRef
						.length() <= pcTarplanRefSize) ? this.pcTarplanRef
						: this.pcTarplanRef.substring(0, this.pcTarplanRefSize)),
				((this.pcAltPackage == null) ? null : (this.pcAltPackage
						.length() <= pcAltPackageSize) ? this.pcAltPackage
						: this.pcAltPackage.substring(0, this.pcAltPackageSize)),
				((this.pcAltTariff == null) ? null
						: (this.pcAltTariff.length() <= pcAltTariffSize) ? this.pcAltTariff
								: this.pcAltTariff.substring(0,
										this.pcAltTariffSize)),
				((this.pcBenefitName == null) ? null : (this.pcBenefitName
						.length() <= pcBenefitNameSize) ? this.pcBenefitName
						: this.pcBenefitName.substring(0,
								this.pcBenefitNameSize)),
				((this.pcN2nStatus == null) ? null
						: (this.pcN2nStatus.length() <= pcN2nStatusSize) ? this.pcN2nStatus
								: this.pcN2nStatus.substring(0,
										this.pcN2nStatusSize)),
				this.pgGroupId,
				this.pgConfigId,
				((this.pgGroupType == null) ? null
						: (this.pgGroupType.length() <= pgGroupTypeSize) ? this.pgGroupType
								: this.pgGroupType.substring(0,
										this.pgGroupTypeSize)),
				this.pgGroupQuantity,
				this.psBenefitId,
				this.psGroupId,
				((this.psBenefitType == null) ? null : (this.psBenefitType
						.length() <= psBenefitTypeSize) ? this.psBenefitType
						: this.psBenefitType.substring(0,
								this.psBenefitTypeSize)),
				((this.psBenefitCode == null) ? null : (this.psBenefitCode
						.length() <= psBenefitCodeSize) ? this.psBenefitCode
						: this.psBenefitCode.substring(0,
								this.psBenefitCodeSize)),
				((this.psNnSuperproduct == null) ? null
						: (this.psNnSuperproduct.length() <= psNnSuperproductSize) ? this.psNnSuperproduct
								: this.psNnSuperproduct.substring(0,
										this.psNnSuperproductSize)),
				((this.psNnProduct == null) ? null
						: (this.psNnProduct.length() <= psNnProductSize) ? this.psNnProduct
								: this.psNnProduct.substring(0,
										this.psNnProductSize)) };
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
		this.pcConfigId = (Integer) fields[0];
		this.pcPartnerId = (Integer) fields[1];
		this.pcMemberStatus = rtrim((String) fields[2]);
		this.pcPackageCode = rtrim((String) fields[3]);
		this.pcTarplanRef = rtrim((String) fields[4]);
		this.pcAltPackage = rtrim((String) fields[5]);
		this.pcAltTariff = rtrim((String) fields[6]);
		this.pcBenefitName = rtrim((String) fields[7]);
		this.pcN2nStatus = rtrim((String) fields[8]);
		this.pgGroupId = (Integer) fields[9];
		this.pgConfigId = ((Integer) fields[10]);
		this.pgGroupType = rtrim((String) fields[11]);
		this.pgGroupQuantity = ((Short) fields[12]);
		this.psBenefitId = (Integer) fields[13];
		this.psGroupId = ((Integer) fields[14]);
		this.psBenefitType = rtrim((String) fields[15]);
		this.psBenefitCode = rtrim((String) fields[16]);
		this.psNnSuperproduct = rtrim((String) fields[17]);
		this.psNnProduct = rtrim((String) fields[18]);
	}

	public void set(final Integer pcConfigId, final Integer pcPartnerId,
			final String pcMemberStatus, final String pcPackageCode,
			final String pcTarplanRef, final String pcAltPackage,
			final String pcAltTariff, final String pcBenefitName,
			final String pcN2nStatus, final Integer pgGroupId,
			final Integer pgConfigId, final String pgGroupType,
			final Short pgGroupQuantity, final Integer psBenefitId,
			final Integer psGroupId, final String psBenefitType,
			final String psBenefitCode, final String psNnSuperproduct,
			final String psNnProduct) {

		this.pcConfigId = pcConfigId;
		this.pcPartnerId = pcPartnerId;
		this.pcMemberStatus = pcMemberStatus;
		this.pcPackageCode = pcPackageCode;
		this.pcTarplanRef = pcTarplanRef;
		this.pcAltPackage = pcAltPackage;
		this.pcAltTariff = pcAltTariff;
		this.pcBenefitName = pcBenefitName;
		this.pcN2nStatus = pcN2nStatus;
		this.pgGroupId = pgGroupId;
		this.pgConfigId = pgConfigId;
		this.pgGroupType = pgGroupType;
		this.pgGroupQuantity = pgGroupQuantity;
		this.psBenefitId = psBenefitId;
		this.psGroupId = psGroupId;
		this.psBenefitType = psBenefitType;
		this.psBenefitCode = psBenefitCode;
		this.psNnSuperproduct = psNnSuperproduct;
		this.psNnProduct = psNnProduct;
	}

	public Integer getPcConfigId() {
		return pcConfigId;
	}

	public void setPcConfigId(Integer pcConfigId) {
		this.pcConfigId = pcConfigId;
	}

	public Integer getPcPartnerId() {
		return pcPartnerId;
	}

	public void setPcPartnerId(Integer pcPartnerId) {
		this.pcPartnerId = pcPartnerId;
	}

	public String getPcMemberStatus() {
		return pcMemberStatus;
	}

	public void setPcMemberStatus(String pcMemberStatus) {
		this.pcMemberStatus = pcMemberStatus;
	}

	public String getPcPackageCode() {
		return pcPackageCode;
	}

	public void setPcPackageCode(String pcPackageCode) {
		this.pcPackageCode = pcPackageCode;
	}

	public String getPcTarplanRef() {
		return pcTarplanRef;
	}

	public void setPcTarplanRef(String pcTarplanRef) {
		this.pcTarplanRef = pcTarplanRef;
	}

	public String getPcAltPackage() {
		return pcAltPackage;
	}

	public void setPcAltPackage(String pcAltPackage) {
		this.pcAltPackage = pcAltPackage;
	}

	public String getPcAltTariff() {
		return pcAltTariff;
	}

	public void setPcAltTariff(String pcAltTariff) {
		this.pcAltTariff = pcAltTariff;
	}

	public String getPcBenefitName() {
		return pcBenefitName;
	}

	public void setPcBenefitName(String pcBenefitName) {
		this.pcBenefitName = pcBenefitName;
	}

	public String getPcN2nStatus() {
		return pcN2nStatus;
	}

	public void setPcN2nStatus(String pcN2nStatus) {
		this.pcN2nStatus = pcN2nStatus;
	}

	public Integer getPgGroupId() {
		return pgGroupId;
	}

	public void setPgGroupId(Integer pgGroupId) {
		this.pgGroupId = pgGroupId;
	}

	public Integer getPgConfigId() {
		return pgConfigId;
	}

	public void setPgConfigId(Integer pgConfigId) {
		this.pgConfigId = pgConfigId;
	}

	public String getPgGroupType() {
		return pgGroupType;
	}

	public void setPgGroupType(String pgGroupType) {
		this.pgGroupType = pgGroupType;
	}

	public Short getPgGroupQuantity() {
		return pgGroupQuantity;
	}

	public void setPgGroupQuantity(Short pgGroupQuantity) {
		this.pgGroupQuantity = pgGroupQuantity;
	}

	public Integer getPsBenefitId() {
		return psBenefitId;
	}

	public void setPsBenefitId(Integer psBenefitId) {
		this.psBenefitId = psBenefitId;
	}

	public Integer getPsGroupId() {
		return psGroupId;
	}

	public void setPsGroupId(Integer psGroupId) {
		this.psGroupId = psGroupId;
	}

	public String getPsBenefitType() {
		return psBenefitType;
	}

	public void setPsBenefitType(String psBenefitType) {
		this.psBenefitType = psBenefitType;
	}

	public String getPsBenefitCode() {
		return psBenefitCode;
	}

	public void setPsBenefitCode(String psBenefitCode) {
		this.psBenefitCode = psBenefitCode;
	}

	public String getPsNnSuperproduct() {
		return psNnSuperproduct;
	}

	public void setPsNnSuperproduct(String psNnSuperproduct) {
		this.psNnSuperproduct = psNnSuperproduct;
	}

	public String getPsNnProduct() {
		return psNnProduct;
	}

	public void setPsNnProduct(String psNnProduct) {
		this.psNnProduct = psNnProduct;
	}

}
