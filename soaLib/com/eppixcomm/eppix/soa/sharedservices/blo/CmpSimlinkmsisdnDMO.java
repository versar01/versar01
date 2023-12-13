package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;
import com.eppixcomm.eppix.common.util.Date;

public class CmpSimlinkmsisdnDMO extends DBO implements Serializable, Comparable {

	private String simSimNo;
	private String simMsisdn;
	private String simNewTariff;
	private String simOldTariff;
	private Short simActualPeriod;
	private Date simTerminatNotif;
	private Date simContractTerm;
	private String simSimStatus;

	public static final int simSimNoFilter = 0;
	private static final int simSimNoSize = 14;

	public static final int simMsisdnFilter = 1;
	private static final int simMsisdnSize = 15;

	public static final int simNewTariffFilter = 2;
	private static final int simNewTariffSize = 20;

	public static final int simOldTariffFilter = 3;
	private static final int simOldTariffSize = 20;

	public static final int simActualPeriodFilter = 4;

	public static final int simTerminatNotifFilter = 5;

	public static final int simContractTermFilter = 6;

	public static final int simSimStatusFilter = 7;
	private static final int simSimStatusSize = 5;

	public CmpSimlinkmsisdnDMO() {
	};

	public CmpSimlinkmsisdnDMO(final String simSimNo, final String simMsisdn,
			final String simNewTariff, final String simOldTariff,
			final Short simActualPeriod, final Date simTerminatNotif,
			final Date simContractTerm, final String simSimStatus) {

		this.simSimNo = simSimNo;
		this.simMsisdn = simMsisdn;
		this.simNewTariff = simNewTariff;
		this.simOldTariff = simOldTariff;
		this.simActualPeriod = simActualPeriod;
		this.simTerminatNotif = simTerminatNotif;
		this.simContractTerm = simContractTerm;
		this.simSimStatus = simSimStatus;
	};

	private static final int[] fieldSizes = new int[] { simSimNoSize,
			simMsisdnSize, simNewTariffSize, simOldTariffSize, 0, 0, 0,
			simSimStatusSize };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_SHORT, FIELD_TYPE_DATE, FIELD_TYPE_DATE,
			FIELD_TYPE_STRING };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] {
				((this.simSimNo == null) ? null
						: (this.simSimNo.length() <= simSimNoSize) ? this.simSimNo
								: this.simSimNo.substring(0, this.simSimNoSize)),
				((this.simMsisdn == null) ? null
						: (this.simMsisdn.length() <= simMsisdnSize) ? this.simMsisdn
								: this.simMsisdn.substring(0,
										this.simMsisdnSize)),
				((this.simNewTariff == null) ? null : (this.simNewTariff
						.length() <= simNewTariffSize) ? this.simNewTariff
						: this.simNewTariff.substring(0, this.simNewTariffSize)),
				((this.simOldTariff == null) ? null : (this.simOldTariff
						.length() <= simOldTariffSize) ? this.simOldTariff
						: this.simOldTariff.substring(0, this.simOldTariffSize)),
				this.simActualPeriod,
				this.simTerminatNotif,
				this.simContractTerm,
				((this.simSimStatus == null) ? null : (this.simSimStatus
						.length() <= simSimStatusSize) ? this.simSimStatus
						: this.simSimStatus.substring(0, this.simSimStatusSize)) };
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
		this.simSimNo = rtrim((String) fields[0]);
		this.simMsisdn = rtrim((String) fields[1]);
		this.simNewTariff = rtrim((String) fields[2]);
		this.simOldTariff = rtrim((String) fields[3]);
		this.simActualPeriod = ((Short) fields[4]);
		this.simTerminatNotif = ((fields[5] == null) ? null : new Date(
				(Date) fields[5]));
		this.simContractTerm = ((fields[6] == null) ? null : new Date(
				(Date) fields[6]));
		this.simSimStatus = rtrim((String) fields[7]);
	}

	public void set(final String simSimNo, final String simMsisdn,
			final String simNewTariff, final String simOldTariff,
			final Short simActualPeriod, final Date simTerminatNotif,
			final Date simContractTerm, final String simSimStatus) {

		this.simSimNo = simSimNo;
		this.simMsisdn = simMsisdn;
		this.simNewTariff = simNewTariff;
		this.simOldTariff = simOldTariff;
		this.simActualPeriod = simActualPeriod;
		this.simTerminatNotif = simTerminatNotif;
		this.simContractTerm = simContractTerm;
		this.simSimStatus = simSimStatus;
	}

	public String getSimSimNo() {
		return simSimNo;
	}

	public void setSimSimNo(String simSimNo) {
		this.simSimNo = simSimNo;
	}

	public String getSimMsisdn() {
		return simMsisdn;
	}

	public void setSimMsisdn(String simMsisdn) {
		this.simMsisdn = simMsisdn;
	}

	public String getSimNewTariff() {
		return simNewTariff;
	}

	public void setSimNewTariff(String simNewTariff) {
		this.simNewTariff = simNewTariff;
	}

	public String getSimOldTariff() {
		return simOldTariff;
	}

	public void setSimOldTariff(String simOldTariff) {
		this.simOldTariff = simOldTariff;
	}

	public Short getSimActualPeriod() {
		return simActualPeriod;
	}

	public void setSimActualPeriod(Short simActualPeriod) {
		this.simActualPeriod = simActualPeriod;
	}

	public Date getSimTerminatNotif() {
		return simTerminatNotif;
	}

	public void setSimTerminatNotif(Date simTerminatNotif) {
		this.simTerminatNotif = simTerminatNotif;
	}

	public Date getSimContractTerm() {
		return simContractTerm;
	}

	public void setSimContractTerm(Date simContractTerm) {
		this.simContractTerm = simContractTerm;
	}

	public String getSimSimStatus() {
		return simSimStatus;
	}

	public void setSimSimStatus(String simSimStatus) {
		this.simSimStatus = simSimStatus;
	}

	public int compareTo(Object obj) {
		if (!(obj instanceof CmpSimlinkmsisdnDMO))
		      throw new ClassCastException("CmpSimlinkmsisdnDMO object Expected.");
		 
		int result = simMsisdn.compareTo(((CmpSimlinkmsisdnDMO)obj).simMsisdn);
		
		if(result != 0){
			return result;
		}else{
			result = simSimNo.compareTo(((CmpSimlinkmsisdnDMO)obj).simSimNo);
			
			if(result != 0){
				return result;
			}else{
				result = simOldTariff.compareTo(((CmpSimlinkmsisdnDMO)obj).simOldTariff);
			}
		}
		
		
		return result;
	}

	@Override
	public String toString() {
		return "\nCmpSimlinkmsisdnDMO [\nsimSimNo=" + simSimNo + "\nsimMsisdn="
				+ simMsisdn + "\nsimNewTariff=" + simNewTariff
				+ "\nsimOldTariff=" + simOldTariff + "\nsimActualPeriod="
				+ simActualPeriod + "\nsimTerminatNotif=" + simTerminatNotif
				+ "\nsimContractTerm=" + simContractTerm + "\nsimSimStatus="
				+ simSimStatus + "]";
	}

}
