package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;
import com.eppixcomm.eppix.common.util.Date;

public class BcyEiDQO extends DBO implements Serializable {

	private String bcyBillCycle;
	private String bcyDescription;
	private String bcyPeriod;
	private Short bcyFrequency;
	private Short bcyDayOfRun;
	private Date bcyNextRun;
	private String bcySuspended;
	private String bcyUseStatus;
	private Date bcyNextCallRun;
	private String bcyInAdvance;
	private String eiBillCycle;
	private Integer eiServProv;
	private Integer eiMaxSubs;
	private Integer eiSubsCount;

	public static final int bcyBillCycleFilter = 0;
	private static final int bcyBillCycleSize = 5;

	public static final int bcyDescriptionFilter = 1;
	private static final int bcyDescriptionSize = 30;

	public static final int bcyPeriodFilter = 2;
	private static final int bcyPeriodSize = 1;

	public static final int bcyFrequencyFilter = 3;

	public static final int bcyDayOfRunFilter = 4;

	public static final int bcyNextRunFilter = 5;

	public static final int bcySuspendedFilter = 6;
	private static final int bcySuspendedSize = 1;

	public static final int bcyUseStatusFilter = 7;
	private static final int bcyUseStatusSize = 1;

	public static final int bcyNextCallRunFilter = 8;

	public static final int bcyInAdvanceFilter = 9;
	private static final int bcyInAdvanceSize = 1;

	public static final int eiBillCycleFilter = 10;
	private static final int eiBillCycleSize = 5;

	public static final int eiServProvFilter = 11;

	public static final int eiMaxSubsFilter = 12;

	public static final int eiSubsCountFilter = 13;

	public BcyEiDQO() {
	};

	public BcyEiDQO(final String bcyBillCycle, final String bcyDescription,
			final String bcyPeriod, final Short bcyFrequency,
			final Short bcyDayOfRun, final Date bcyNextRun,
			final String bcySuspended, final String bcyUseStatus,
			final Date bcyNextCallRun, final String bcyInAdvance,
			final String eiBillCycle, final Integer eiServProv,
			final Integer eiMaxSubs, final Integer eiSubsCount) {

		this.bcyBillCycle = bcyBillCycle;
		this.bcyDescription = bcyDescription;
		this.bcyPeriod = bcyPeriod;
		this.bcyFrequency = bcyFrequency;
		this.bcyDayOfRun = bcyDayOfRun;
		this.bcyNextRun = bcyNextRun;
		this.bcySuspended = bcySuspended;
		this.bcyUseStatus = bcyUseStatus;
		this.bcyNextCallRun = bcyNextCallRun;
		this.bcyInAdvance = bcyInAdvance;
		this.eiBillCycle = eiBillCycle;
		this.eiServProv = eiServProv;
		this.eiMaxSubs = eiMaxSubs;
		this.eiSubsCount = eiSubsCount;
	};

	private static final int[] fieldSizes = new int[] { bcyBillCycleSize,
			bcyDescriptionSize, bcyPeriodSize, 0, 0, 0, bcySuspendedSize,
			bcyUseStatusSize, 0, bcyInAdvanceSize, eiBillCycleSize, 0, 0, 0 };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_SHORT,
			FIELD_TYPE_SHORT, FIELD_TYPE_DATE, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_DATE, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_INTEGER, FIELD_TYPE_INTEGER,
			FIELD_TYPE_INTEGER };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] {
				((this.bcyBillCycle == null) ? null : (this.bcyBillCycle
						.length() <= bcyBillCycleSize) ? this.bcyBillCycle
						: this.bcyBillCycle.substring(0, this.bcyBillCycleSize)),
				((this.bcyDescription == null) ? null : (this.bcyDescription
						.length() <= bcyDescriptionSize) ? this.bcyDescription
						: this.bcyDescription.substring(0,
								this.bcyDescriptionSize)),
				((this.bcyPeriod == null) ? null
						: (this.bcyPeriod.length() <= bcyPeriodSize) ? this.bcyPeriod
								: this.bcyPeriod.substring(0,
										this.bcyPeriodSize)),
				this.bcyFrequency,
				this.bcyDayOfRun,
				this.bcyNextRun,
				((this.bcySuspended == null) ? null : (this.bcySuspended
						.length() <= bcySuspendedSize) ? this.bcySuspended
						: this.bcySuspended.substring(0, this.bcySuspendedSize)),
				((this.bcyUseStatus == null) ? null : (this.bcyUseStatus
						.length() <= bcyUseStatusSize) ? this.bcyUseStatus
						: this.bcyUseStatus.substring(0, this.bcyUseStatusSize)),
				this.bcyNextCallRun,
				((this.bcyInAdvance == null) ? null : (this.bcyInAdvance
						.length() <= bcyInAdvanceSize) ? this.bcyInAdvance
						: this.bcyInAdvance.substring(0, this.bcyInAdvanceSize)),
				((this.eiBillCycle == null) ? null
						: (this.eiBillCycle.length() <= eiBillCycleSize) ? this.eiBillCycle
								: this.eiBillCycle.substring(0,
										this.eiBillCycleSize)),
				this.eiServProv, this.eiMaxSubs, this.eiSubsCount };
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
		this.bcyBillCycle = rtrim((String) fields[0]);
		this.bcyDescription = rtrim((String) fields[1]);
		this.bcyPeriod = rtrim((String) fields[2]);
		this.bcyFrequency = ((Short) fields[3]);
		this.bcyDayOfRun = ((Short) fields[4]);
		this.bcyNextRun = ((fields[5] == null) ? null : new Date(
				fields[5]));
		this.bcySuspended = rtrim((String) fields[6]);
		this.bcyUseStatus = rtrim((String) fields[7]);
		this.bcyNextCallRun = ((fields[8] == null) ? null : new Date(
				fields[8]));
		this.bcyInAdvance = rtrim((String) fields[9]);
		this.eiBillCycle = rtrim((String) fields[10]);
		this.eiServProv = ((Integer) fields[11]);
		this.eiMaxSubs = ((Integer) fields[12]);
		this.eiSubsCount = ((Integer) fields[13]);
	}

	public void set(final String bcyBillCycle, final String bcyDescription,
			final String bcyPeriod, final Short bcyFrequency,
			final Short bcyDayOfRun, final Date bcyNextRun,
			final String bcySuspended, final String bcyUseStatus,
			final Date bcyNextCallRun, final String bcyInAdvance,
			final String eiBillCycle, final Integer eiServProv,
			final Integer eiMaxSubs, final Integer eiSubsCount) {

		this.bcyBillCycle = bcyBillCycle;
		this.bcyDescription = bcyDescription;
		this.bcyPeriod = bcyPeriod;
		this.bcyFrequency = bcyFrequency;
		this.bcyDayOfRun = bcyDayOfRun;
		this.bcyNextRun = bcyNextRun;
		this.bcySuspended = bcySuspended;
		this.bcyUseStatus = bcyUseStatus;
		this.bcyNextCallRun = bcyNextCallRun;
		this.bcyInAdvance = bcyInAdvance;
		this.eiBillCycle = eiBillCycle;
		this.eiServProv = eiServProv;
		this.eiMaxSubs = eiMaxSubs;
		this.eiSubsCount = eiSubsCount;
	}

	public String getBcyBillCycle() {
		return bcyBillCycle;
	}

	public void setBcyBillCycle(String bcyBillCycle) {
		this.bcyBillCycle = bcyBillCycle;
	}

	public String getBcyDescription() {
		return bcyDescription;
	}

	public void setBcyDescription(String bcyDescription) {
		this.bcyDescription = bcyDescription;
	}

	public String getBcyPeriod() {
		return bcyPeriod;
	}

	public void setBcyPeriod(String bcyPeriod) {
		this.bcyPeriod = bcyPeriod;
	}

	public Short getBcyFrequency() {
		return bcyFrequency;
	}

	public void setBcyFrequency(Short bcyFrequency) {
		this.bcyFrequency = bcyFrequency;
	}

	public Short getBcyDayOfRun() {
		return bcyDayOfRun;
	}

	public void setBcyDayOfRun(Short bcyDayOfRun) {
		this.bcyDayOfRun = bcyDayOfRun;
	}

	public Date getBcyNextRun() {
		return bcyNextRun;
	}

	public void setBcyNextRun(Date bcyNextRun) {
		this.bcyNextRun = bcyNextRun;
	}

	public String getBcySuspended() {
		return bcySuspended;
	}

	public void setBcySuspended(String bcySuspended) {
		this.bcySuspended = bcySuspended;
	}

	public String getBcyUseStatus() {
		return bcyUseStatus;
	}

	public void setBcyUseStatus(String bcyUseStatus) {
		this.bcyUseStatus = bcyUseStatus;
	}

	public Date getBcyNextCallRun() {
		return bcyNextCallRun;
	}

	public void setBcyNextCallRun(Date bcyNextCallRun) {
		this.bcyNextCallRun = bcyNextCallRun;
	}

	public String getBcyInAdvance() {
		return bcyInAdvance;
	}

	public void setBcyInAdvance(String bcyInAdvance) {
		this.bcyInAdvance = bcyInAdvance;
	}

	public String getEiBillCycle() {
		return eiBillCycle;
	}

	public void setEiBillCycle(String eiBillCycle) {
		this.eiBillCycle = eiBillCycle;
	}

	public Integer getEiServProv() {
		return eiServProv;
	}

	public void setEiServProv(Integer eiServProv) {
		this.eiServProv = eiServProv;
	}

	public Integer getEiMaxSubs() {
		return eiMaxSubs;
	}

	public void setEiMaxSubs(Integer eiMaxSubs) {
		this.eiMaxSubs = eiMaxSubs;
	}

	public Integer getEiSubsCount() {
		return eiSubsCount;
	}

	public void setEiSubsCount(Integer eiSubsCount) {
		this.eiSubsCount = eiSubsCount;
	}

}
