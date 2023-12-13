package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;

public class PsPartnerServiceDMO extends DBO implements Serializable {

	private Integer psBenefitId;
	private Integer psGroupId;
	private String psBenefitType;
	private String psBenefitCode;
	private Integer psNotifyMonths;
	private Integer psInstrId;
	private String psPartnerMaster;
	private Integer psContrPeriod;

	public static final int psBenefitIdFilter = 0;

	public static final int psGroupIdFilter = 1;

	public static final int psBenefitTypeFilter = 2;
	private static final int psBenefitTypeSize = 1;

	public static final int psBenefitCodeFilter = 3;
	private static final int psBenefitCodeSize = 5;

	public static final int psNotifyMonthsFilter = 4;

	public static final int psInstrIdFilter = 5;

	public static final int psPartnerMasterFilter = 6;
	private static final int psPartnerMasterSize = 1;

	public static final int psContrPeriodFilter = 7;

	public PsPartnerServiceDMO() {
	};

	public PsPartnerServiceDMO(final Integer psBenefitId,
			final Integer psGroupId, final String psBenefitType,
			final String psBenefitCode, final Integer psNotifyMonths,
			final Integer psInstrId, final String psPartnerMaster,
			final Integer psContrPeriod) {

		this.psBenefitId = psBenefitId;
		this.psGroupId = psGroupId;
		this.psBenefitType = psBenefitType;
		this.psBenefitCode = psBenefitCode;
		this.psNotifyMonths = psNotifyMonths;
		this.psInstrId = psInstrId;
		this.psPartnerMaster = psPartnerMaster;
		this.psContrPeriod = psContrPeriod;
	};

	private static final int[] fieldSizes = new int[] { 0, 0,
			psBenefitTypeSize, psBenefitCodeSize, 0, 0, psPartnerMasterSize, 0 };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_INTEGER,
			FIELD_TYPE_INTEGER, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_INTEGER, FIELD_TYPE_INTEGER, FIELD_TYPE_STRING,
			FIELD_TYPE_INTEGER };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] {
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
				this.psNotifyMonths,
				this.psInstrId,
				((this.psPartnerMaster == null) ? null
						: (this.psPartnerMaster.length() <= psPartnerMasterSize) ? this.psPartnerMaster
								: this.psPartnerMaster.substring(0,
										this.psPartnerMasterSize)),
				this.psContrPeriod };
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
		return new DAOArgs().arg(this.psBenefitId);
	}

	protected void set(Object[] fields) {
		this.psBenefitId = ((Integer) fields[0]);
		this.psGroupId = ((Integer) fields[1]);
		this.psBenefitType = rtrim((String) fields[2]);
		this.psBenefitCode = rtrim((String) fields[3]);
		this.psNotifyMonths = ((Integer) fields[4]);
		this.psInstrId = ((Integer) fields[5]);
		this.psPartnerMaster = rtrim((String) fields[6]);
		this.psContrPeriod = ((Integer) fields[7]);
	}

	public void set(final Integer psBenefitId, final Integer psGroupId,
			final String psBenefitType, final String psBenefitCode,
			final Integer psNotifyMonths, final Integer psInstrId,
			final String psPartnerMaster, final Integer psContrPeriod) {

		this.psBenefitId = psBenefitId;
		this.psGroupId = psGroupId;
		this.psBenefitType = psBenefitType;
		this.psBenefitCode = psBenefitCode;
		this.psNotifyMonths = psNotifyMonths;
		this.psInstrId = psInstrId;
		this.psPartnerMaster = psPartnerMaster;
		this.psContrPeriod = psContrPeriod;
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

	public Integer getPsNotifyMonths() {
		return psNotifyMonths;
	}

	public void setPsNotifyMonths(Integer psNotifyMonths) {
		this.psNotifyMonths = psNotifyMonths;
	}

	public Integer getPsInstrId() {
		return psInstrId;
	}

	public void setPsInstrId(Integer psInstrId) {
		this.psInstrId = psInstrId;
	}

	public String getPsPartnerMaster() {
		return psPartnerMaster;
	}

	public void setPsPartnerMaster(String psPartnerMaster) {
		this.psPartnerMaster = psPartnerMaster;
	}

	public Integer getPsContrPeriod() {
		return psContrPeriod;
	}

	public void setPsContrPeriod(Integer psContrPeriod) {
		this.psContrPeriod = psContrPeriod;
	}
}
