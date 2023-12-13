package com.eppixcomm.eppix.base.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;

public class EiEppixIsisDMO    extends DBO implements Serializable {
	
//	ei_bill_cycle
//	ei_serv_prov
//	ei_max_subs
//	ei_subs_count
	
	public EiEppixIsisDMO(){		
	}
	
	public EiEppixIsisDMO(
		final String eiBillCycle,
		final Integer eiServProv,
		final Integer eiMaxSubs,
		final Integer eiSubsCount		
	){
		this.eiBillCycle = eiBillCycle;
		this.eiServProv = eiServProv;
		this.eiMaxSubs = eiMaxSubs;
		this.eiSubsCount = eiSubsCount;
	}
	
	 private static final int[] fieldTypes = new int[] {
		 FIELD_TYPE_STRING /* std public attribute: ei_bill_cycle char(5)  */,
		 FIELD_TYPE_INTEGER /* std public attribute: ei_serv_prov integer  */,
		 FIELD_TYPE_INTEGER /* std public attribute: ei_max_subs integer  */,
		 FIELD_TYPE_INTEGER /* std public attribute: ei_subs_count integer  */
	 };
	 
	 private final int[] fieldSizes = new int[] {
				eiBillCycleSize,
				0,
				0,
				0
	 };
	     

	 public int[] fieldSizes() {
	 	return fieldSizes;
	 }  
	 
	 /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
	  public static final int eiBillCycleFilter = 0; // filter index
	  private static final int eiBillCycleSize = 5; // field size

	  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
	  public static final int eiServProvFilter = 1; // filter index
	  public static final int eiMaxSubsFilter = 2; // filter index
	  private static final int eiSubsCountFilter = 3; // filter index
	  
	  //---------------------
	  // Field declarations
	  //---------------------
	  // all attributes
		private String eiBillCycle;
		private Integer eiServProv;
		private Integer eiMaxSubs;
		private Integer eiSubsCount;
		
		protected void generatedKey(Integer key) {
			// TODO Auto-generated method stub
		}

		protected Object[] get() {
			return new Object[] {
			( eiBillCycle == null ) ? null : ( ( eiBillCycle.length(  ) <= eiBillCycleSize )
             ? eiBillCycle	: eiBillCycle.substring( 0, eiBillCycleSize ) // auto trimmed to fit, if required.
              ),
              eiServProv,
              eiMaxSubs,
              eiSubsCount
			};
		}

		protected Integer versionNumber() {
			// TODO Auto-generated method stub
			return null;
		}

		protected void versionNumber(Integer versionNumber) {
			// TODO Auto-generated method stub
		}

		protected int[] fieldTypes() {
			return fieldTypes;
		}

		protected DAOArgs primaryKey() {
			return null;
		}

		protected void set(final Object[] fields) {
			eiBillCycle = (String) fields[0];
			eiServProv = (Integer) fields[1];
			eiMaxSubs =  (Integer) fields[2];
			eiSubsCount = (Integer) fields[3];
		}
		
		public void set(
				final String eiBillCycle,
				final Integer eiServProv,
				final Integer eiMaxSubs,
				final Integer eiSubsCount		
			){
				this.eiBillCycle = eiBillCycle;
				this.eiServProv = eiServProv;
				this.eiMaxSubs = eiMaxSubs;
				this.eiSubsCount = eiSubsCount;
			}
		
		public String getEiBillCycle() {
			return eiBillCycle;
		}

		public void setEiBillCycle(String eiBillCycle) {
			this.eiBillCycle = getPadded(eiBillCycle, eiBillCycleFilter);
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
