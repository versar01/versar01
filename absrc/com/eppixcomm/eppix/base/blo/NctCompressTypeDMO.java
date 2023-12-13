package com.eppixcomm.eppix.base.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;

public class NctCompressTypeDMO extends DBO implements Serializable {
	
//	 nct_compress_code
//	 nct_compress_type
	
	private static final int[] fieldTypes = new int[] {
	      FIELD_TYPE_STRING /* std public attribute: nct_compress_code  */,
	      FIELD_TYPE_STRING /* std public attribute: nct_compress_type  */
	    };
	
	  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
	  public static final int nctCompressCodeFilter = 0; // filter index
	  private static final int nctCompressCodeSize = 15; // field size

	  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
	  public static final int nctCompressTypeFilter = 1; // filter index
	  private static final int nctCompressTypeSize = 5; // field size
	  
	  private String nctCompressCode;
	  private String nctCompressType;
	  
	 public NctCompressTypeDMO(){
		 
	 }
	 
	 public NctCompressTypeDMO(final String nctCompressCode, final String nctCompressType){
		this.setNctCompressCode(nctCompressCode);
		this.setNctCompressType(nctCompressType);
	 }

	protected void generatedKey(Integer key) {
		// TODO Auto-generated method stub		
	}

	private final int[] fieldSizes = new int[] {
			 nctCompressCodeSize,
			 nctCompressTypeSize
	};
	    

	public int[] fieldSizes() {
		return fieldSizes;
	}  
	
	protected Object[] get() {
		 return new Object[] {
			      ( nctCompressCode == null ) ? null
			                            : ( ( nctCompressCode.length(  ) <= nctCompressCodeSize )
			      ? nctCompressCode
			      : nctCompressCode.substring( 0, nctCompressCodeSize ) // auto trimmed to fit, if required.
			       ),
			      ( nctCompressType == null ) ? null
			                           : ( ( nctCompressType.length(  ) <= nctCompressTypeSize )
			      ? nctCompressType
			      : nctCompressType.substring( 0, nctCompressTypeSize ) // auto trimmed to fit, if required.
			       )
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
		// TODO Auto-generated method stub
		return null;
	}
	
	protected void set(){

	}

	protected void set(final Object[] fields) {
		nctCompressCode = rtrim( (String) fields[0] );
		nctCompressType = rtrim( (String) fields[1] );		
	}

	  public String getNctCompressCode() {
			return nctCompressCode;
		}

		public void setNctCompressCode(String nctCompressCode) {
			this.nctCompressCode = getPadded(nctCompressCode, nctCompressCodeFilter);
		}

		public String getNctCompressType() {
			return nctCompressType;
		}

		public void setNctCompressType(String nctCompressType) {
			this.nctCompressType = getPadded(nctCompressType, nctCompressTypeFilter);
		}
	
}
