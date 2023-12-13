package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;
import java.math.BigDecimal;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;
import com.eppixcomm.eppix.common.util.Date;

public class IdAccSubServListDQO extends DBO implements Serializable {

	private String account;
	private String id;
	private String accountType;
	private Integer subId;
	private String vamMsisdn;
	private String vamSim;
	private String asrMsisdn;
	private String asrSim;
	private String vsmService;
	private String asrService;
	private String packageCode;
	private String tariffPlan;
	private BigDecimal creditLimit;
	private String creditClass;
	private String accountStatus;
	private String mtnStatus;
	private String ladStatus1;
	private Date termDate;

	public static final int accountFilter = 0;
	private static final int accountSize = 8;

	public static final int idFilter = 1;
	private static final int idSize = 20;

	public static final int accountTypeFilter = 2;
	private static final int accountTypeSize = 5;

	public static final int subIdFilter = 3;

	public static final int vamMsisdnFilter = 4;
	private static final int vamMsisdnSize = 15;

	public static final int vamSimFilter = 5;
	private static final int vamSimSize = 14;

	public static final int asrMsisdnFilter = 6;
	private static final int asrMsisdnSize = 15;

	public static final int asrSimFilter = 7;
	private static final int asrSimSize = 14;

	public static final int vsmServiceFilter = 8;
	private static final int vsmServiceSize = 4;

	public static final int asrServiceFilter = 9;
	private static final int asrServiceSize = 4;

	public static final int packageCodeFilter = 10;
	private static final int packageCodeSize = 5;

	public static final int tariffPlanFilter = 11;
	private static final int tariffPlanSize = 20;

	public static final int creditLimitFilter = 12;

	public static final int creditClassFilter = 13;
	private static final int creditClassSize = 5;

	public static final int accountStatusFilter = 14;
	private static final int accountStatusSize = 15;

	public static final int mtnStatusFilter = 15;
	private static final int mtnStatusSize = 30;

	public static final int ladStatus1Filter = 16;
	private static final int ladStatus1Size = 10;

	public static final int termDateFilter = 17;

	public IdAccSubServListDQO() {
	};

	public IdAccSubServListDQO(final String account, final String id, final String accountType, final Integer subId,
			final String vamMsisdn, final String vamSim, final String asrMsisdn, final String asrSim,
			final String vsmService, final String asrService, final String packageCode, final String tariffPlan,
			final BigDecimal creditLimit, final String creditClass, final String accountStatus, final String mtnStatus,
			final String ladStatus1, final Date termDate) {

		this.account = account;
		this.id = id;
		this.accountType = accountType;
		this.subId = subId;
		this.vamMsisdn = vamMsisdn;
		this.vamSim = vamSim;
		this.asrMsisdn = asrMsisdn;
		this.asrSim = asrSim;
		this.vsmService = vsmService;
		this.asrService = asrService;
		this.packageCode = packageCode;
		this.tariffPlan = tariffPlan;
		this.creditLimit = creditLimit;
		this.creditClass = creditClass;
		this.accountStatus = accountStatus;
		this.mtnStatus = mtnStatus;
		this.ladStatus1 = ladStatus1;
		this.termDate = termDate;
	};

	private static final int[] fieldSizes = new int[] { accountSize, idSize, accountTypeSize, 0, vamMsisdnSize,
			vamSimSize, asrMsisdnSize, asrSimSize, vsmServiceSize, asrServiceSize, packageCodeSize, tariffPlanSize, 0,
			creditClassSize, accountStatusSize, mtnStatusSize, ladStatus1Size, 0 };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_INTEGER, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_BIGDECIMAL,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_DATE };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] {
				((this.account == null) ? null
						: (this.account.length() <= accountSize) ? this.account
								: this.account.substring(0, this.accountSize)),
				((this.id == null) ? null : (this.id.length() <= idSize) ? this.id : this.id.substring(0, this.idSize)),
				((this.accountType == null) ? null
						: (this.accountType.length() <= accountTypeSize) ? this.accountType
								: this.accountType.substring(0, this.accountTypeSize)),
				this.subId,
				((this.vamMsisdn == null) ? null
						: (this.vamMsisdn.length() <= vamMsisdnSize) ? this.vamMsisdn
								: this.vamMsisdn.substring(0, this.vamMsisdnSize)),
				((this.vamSim == null) ? null
						: (this.vamSim.length() <= vamSimSize) ? this.vamSim
								: this.vamSim.substring(0, this.vamSimSize)),
				((this.asrMsisdn == null) ? null
						: (this.asrMsisdn.length() <= asrMsisdnSize) ? this.asrMsisdn
								: this.asrMsisdn.substring(0, this.asrMsisdnSize)),
				((this.asrSim == null) ? null
						: (this.asrSim.length() <= asrSimSize) ? this.asrSim
								: this.asrSim.substring(0, this.asrSimSize)),
				((this.vsmService == null) ? null
						: (this.vsmService.length() <= vsmServiceSize) ? this.vsmService
								: this.vsmService.substring(0, this.vsmServiceSize)),
				((this.asrService == null) ? null
						: (this.asrService.length() <= asrServiceSize) ? this.asrService
								: this.asrService.substring(0, this.asrServiceSize)),
				((this.packageCode == null) ? null
						: (this.packageCode.length() <= packageCodeSize) ? this.packageCode
								: this.packageCode.substring(0, this.packageCodeSize)),
				((this.tariffPlan == null) ? null
						: (this.tariffPlan.length() <= tariffPlanSize) ? this.tariffPlan
								: this.tariffPlan.substring(0, this.tariffPlanSize)),
				this.creditLimit,
				((this.creditClass == null) ? null
						: (this.creditClass.length() <= creditClassSize) ? this.creditClass
								: this.creditClass.substring(0, this.creditClassSize)),
				((this.accountStatus == null) ? null
						: (this.accountStatus.length() <= accountStatusSize) ? this.accountStatus
								: this.accountStatus.substring(0, this.accountStatusSize)),
				((this.mtnStatus == null) ? null
						: (this.mtnStatus.length() <= mtnStatusSize) ? this.mtnStatus
								: this.mtnStatus.substring(0, this.mtnStatusSize)),
				((this.ladStatus1 == null) ? null
						: (this.ladStatus1.length() <= ladStatus1Size) ? this.ladStatus1
								: this.ladStatus1.substring(0, this.ladStatus1Size)),
				this.termDate };
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
		this.account = rtrim((String) fields[0]);
		this.id = rtrim((String) fields[1]);
		this.accountType = rtrim((String) fields[2]);
		this.subId = ((Integer) fields[3]);
		this.vamMsisdn = rtrim((String) fields[4]);
		this.vamSim = rtrim((String) fields[5]);
		this.asrMsisdn = rtrim((String) fields[6]);
		this.asrSim = rtrim((String) fields[7]);
		this.vsmService = rtrim((String) fields[8]);
		this.asrService = rtrim((String) fields[9]);
		this.packageCode = rtrim((String) fields[10]);
		this.tariffPlan = rtrim((String) fields[11]);
		this.creditLimit = ((BigDecimal) fields[12]);
		this.creditClass = rtrim((String) fields[13]);
		this.accountStatus = rtrim((String) fields[14]);
		this.mtnStatus = rtrim((String) fields[15]);
		this.ladStatus1 = rtrim((String) fields[16]);
		this.termDate = ((fields[17] == null) ? null : new Date(fields[17]));
	}

	public void set(final String account, final String id, final String accountType, final Integer subId,
			final String vamMsisdn, final String vamSim, final String asrMsisdn, final String asrSim,
			final String vsmService, final String asrService, final String packageCode, final String tariffPlan,
			final BigDecimal creditLimit, final String creditClass, final String accountStatus, final String mtnStatus,
			final String ladStatus1, final Date termDate) {

		this.account = account;
		this.id = id;
		this.accountType = accountType;
		this.subId = subId;
		this.vamMsisdn = vamMsisdn;
		this.vamSim = vamSim;
		this.asrMsisdn = asrMsisdn;
		this.asrSim = asrSim;
		this.vsmService = vsmService;
		this.asrService = asrService;
		this.packageCode = packageCode;
		this.tariffPlan = tariffPlan;
		this.creditLimit = creditLimit;
		this.creditClass = creditClass;
		this.accountStatus = accountStatus;
		this.mtnStatus = mtnStatus;
		this.ladStatus1 = ladStatus1;
		this.termDate = termDate;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public Integer getSubId() {
		return subId;
	}

	public void setSubId(Integer subId) {
		this.subId = subId;
	}

	public String getVamMsisdn() {
		return vamMsisdn;
	}

	public void setVamMsisdn(String vamMsisdn) {
		this.vamMsisdn = vamMsisdn;
	}

	public String getVamSim() {
		return vamSim;
	}

	public void setVamSim(String vamSim) {
		this.vamSim = vamSim;
	}

	public String getAsrMsisdn() {
		return asrMsisdn;
	}

	public void setAsrMsisdn(String asrMsisdn) {
		this.asrMsisdn = asrMsisdn;
	}

	public String getAsrSim() {
		return asrSim;
	}

	public void setAsrSim(String asrSim) {
		this.asrSim = asrSim;
	}

	public String getVsmService() {
		return vsmService;
	}

	public void setVsmService(String vsmService) {
		this.vsmService = vsmService;
	}

	public String getAsrService() {
		return asrService;
	}

	public void setAsrService(String asrService) {
		this.asrService = asrService;
	}

	public String getPackageCode() {
		return packageCode;
	}

	public void setPackageCode(String packageCode) {
		this.packageCode = packageCode;
	}

	public String getTariffPlan() {
		return tariffPlan;
	}

	public void setTariffPlan(String tariffPlan) {
		this.tariffPlan = tariffPlan;
	}

	public BigDecimal getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(BigDecimal creditLimit) {
		this.creditLimit = creditLimit;
	}

	public String getCreditClass() {
		return creditClass;
	}

	public void setCreditClass(String creditClass) {
		this.creditClass = creditClass;
	}

	public String getAccountStatus() {
		return accountStatus;
	}

	public void setAccountStatus(String accountStatus) {
		this.accountStatus = accountStatus;
	}

	public String getMtnStatus() {
		return mtnStatus;
	}

	public void setMtnStatus(String mtnStatus) {
		this.mtnStatus = mtnStatus;
	}

	public String getLadStatus1() {
		return ladStatus1;
	}

	public void setLadStatus1(String ladStatus1) {
		this.ladStatus1 = ladStatus1;
	}

	public Date getTermDate() {
		return termDate;
	}

	public void setTermDate(Date termDate) {
		this.termDate = termDate;
	}

	@Override
	public String toString() {
		return "\nIdAccSubServListDQO [account=" + account + "\nid=" + id + "\naccountType=" + accountType + "\nsubId="
				+ subId + "\nvamMsisdn=" + vamMsisdn + "\nvamSim=" + vamSim + "\nasrMsisdn=" + asrMsisdn + "\nasrSim="
				+ asrSim + "\nvsmService=" + vsmService + "\nasrService=" + asrService + "\npackageCode=" + packageCode
				+ "\ntariffPlan=" + tariffPlan + "\ncreditLimit=" + creditLimit + "\ncreditClass=" + creditClass
				+ "\naccountStatus=" + accountStatus + "\nmtnStatus=" + mtnStatus + "\nladStatus1=" + ladStatus1
				+ "\ntermDate=" + termDate + "]";
	}

}
