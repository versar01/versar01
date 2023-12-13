package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;

public class CmpServlinkmsisdnDMO extends DBO implements Serializable, Comparable {

	private String srmService;
	private String srmMsisdn;
	private String srmSim;

	public static final int srmServiceFilter = 0;
	private static final int srmServiceSize = 5;

	public static final int srmMsisdnFilter = 1;
	private static final int srmMsisdnSize = 15;
	
	public static final int srmSimFilter = 2;
	private static final int srmSimSize = 14;

	public CmpServlinkmsisdnDMO() {
	};

	public CmpServlinkmsisdnDMO(final String srmService, final String srmMsisdn, final String srmSim) {

		this.srmService = srmService;
		this.srmMsisdn = srmMsisdn;
		this.srmSim = srmSim;
	};

	private static final int[] fieldSizes = new int[] { srmServiceSize,
			srmMsisdnSize, srmSimSize };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING};

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] {
				((this.srmService == null) ? null
						: (this.srmService.length() <= srmServiceSize) ? this.srmService
								: this.srmService.substring(0,
										this.srmServiceSize)),
				((this.srmMsisdn == null) ? null
						: (this.srmMsisdn.length() <= srmMsisdnSize) ? this.srmMsisdn
								: this.srmMsisdn.substring(0,
										this.srmMsisdnSize)),
				((this.srmSim == null) ? null
						: (this.srmSim.length() <= srmSimSize) ? this.srmSim
								: this.srmSim.substring(0,
										this.srmSimSize))};
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
		this.srmService = rtrim((String) fields[0]);
		this.srmMsisdn = rtrim((String) fields[1]);
		this.srmSim = rtrim((String) fields[2]);
	}

	public void set(final String srmService, final String srmMsisdn, final String srmSim) {

		this.srmService = srmService;
		this.srmMsisdn = srmMsisdn;
		this.srmSim = srmSim;
	}

	public String getSrmService() {
		return srmService;
	}

	public void setSrmService(String srmService) {
		this.srmService = srmService;
	}

	public String getSrmMsisdn() {
		return srmMsisdn;
	}

	public void setSrmMsisdn(String srmMsisdn) {
		this.srmMsisdn = srmMsisdn;
	}

	public int compareTo(Object obj) {
		if (!(obj instanceof CmpServlinkmsisdnDMO))
		      throw new ClassCastException("CmpServlinkmsisdnDMO object Expected.");
		 
		int result = srmMsisdn.compareTo(((CmpServlinkmsisdnDMO)obj).srmMsisdn);
		
		if(result != 0){
			return result;
		}else{
			result = srmService.compareTo(((CmpServlinkmsisdnDMO)obj).srmService);

		}
		
		
		return result;
	}

	public String getSrmSim() {
		return srmSim;
	}

	public void setSrmSim(String srmSim) {
		this.srmSim = srmSim;
	}

	@Override
	public String toString() {
		return "\nCmpServlinkmsisdnDMO [\nsrmService=" + srmService
				+ "\nsrmMsisdn=" + srmMsisdn + "\nsrmSim=" + srmSim + "]";
	}

}
