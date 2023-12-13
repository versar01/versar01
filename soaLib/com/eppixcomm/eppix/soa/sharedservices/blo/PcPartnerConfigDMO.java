package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;

public class PcPartnerConfigDMO extends DBO implements Serializable {

	private Integer pcConfigId;
	private Integer pcPartnerId;
	private String pcMemberStatus;
	private String pcPackageCode;
	private String pcTarplanRef;
	private String pcAltPackage;
	private String pcAltTariff;
	private String pcBenefitName;
	private String pcN2nStatus;

	public static final int pcConfigIdFilter = 0;
	private static final int pcConfigIdSize = 1;

	public static final int pcPartnerIdFilter = 1;

	public static final int pcMemberStatusFilter = 2;
	private static final int pcMemberStatusSize = 16;

	public static final int pcPackageCodeFilter = 3;
	private static final int pcPackageCodeSize = 5;

	public static final int pcTarplanRefFilter = 4;
	private static final int pcTarplanRefSize = 20;

	public static final int pcAltPackageFilter = 5;
	private static final int pcAltPackageSize = 5;

	public static final int pcAltTariffFilter = 6;
	private static final int pcAltTariffSize = 20;

	public static final int pcBenefitNameFilter = 7;
	private static final int pcBenefitNameSize = 16;

	public static final int pcN2nStatusFilter = 8;
	private static final int pcN2nStatusSize = 7;

	public PcPartnerConfigDMO() {
	};

	public PcPartnerConfigDMO(final Integer pcConfigId,
			final Integer pcPartnerId, final String pcMemberStatus,
			final String pcPackageCode, final String pcTarplanRef,
			final String pcAltPackage, final String pcAltTariff,
			final String pcBenefitName, final String pcN2nStatus) {

		this.pcConfigId = pcConfigId;
		this.pcPartnerId = pcPartnerId;
		this.pcMemberStatus = pcMemberStatus;
		this.pcPackageCode = pcPackageCode;
		this.pcTarplanRef = pcTarplanRef;
		this.pcAltPackage = pcAltPackage;
		this.pcAltTariff = pcAltTariff;
		this.pcBenefitName = pcBenefitName;
		this.pcN2nStatus = pcN2nStatus;
	};

	private static final int[] fieldSizes = new int[] { pcConfigIdSize, 0,
			pcMemberStatusSize, pcPackageCodeSize, pcTarplanRefSize,
			pcAltPackageSize, pcAltTariffSize, pcBenefitNameSize,
			pcN2nStatusSize };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_INTEGER,
			FIELD_TYPE_INTEGER, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING };

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
										this.pcN2nStatusSize)) };
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
		return new DAOArgs(1).arg(this.pcConfigId);
	}

	protected void set(Object[] fields) {
		this.pcConfigId = ((Integer) fields[0]);
		this.pcPartnerId = ((Integer) fields[1]);
		this.pcMemberStatus = rtrim((String) fields[2]);
		this.pcPackageCode = rtrim((String) fields[3]);
		this.pcTarplanRef = rtrim((String) fields[4]);
		this.pcAltPackage = rtrim((String) fields[5]);
		this.pcAltTariff = rtrim((String) fields[6]);
		this.pcBenefitName = rtrim((String) fields[7]);
		this.pcN2nStatus = rtrim((String) fields[8]);
	}

	public void set(final Integer pcConfigId, final Integer pcPartnerId,
			final String pcMemberStatus, final String pcPackageCode,
			final String pcTarplanRef, final String pcAltPackage,
			final String pcAltTariff, final String pcBenefitName,
			final String pcN2nStatus) {

		this.pcConfigId = pcConfigId;
		this.pcPartnerId = pcPartnerId;
		this.pcMemberStatus = pcMemberStatus;
		this.pcPackageCode = pcPackageCode;
		this.pcTarplanRef = pcTarplanRef;
		this.pcAltPackage = pcAltPackage;
		this.pcAltTariff = pcAltTariff;
		this.pcBenefitName = pcBenefitName;
		this.pcN2nStatus = pcN2nStatus;
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

}
