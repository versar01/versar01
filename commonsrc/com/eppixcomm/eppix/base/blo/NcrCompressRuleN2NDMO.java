package com.eppixcomm.eppix.base.blo;


import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;

public class NcrCompressRuleN2NDMO extends DBO implements Serializable {
			
			private static final int[] fieldTypes = new int[] {
			      FIELD_TYPE_STRING /* std public attribute: ncrCompressCode  */,
			      FIELD_TYPE_STRING /* std public attribute: ncrCode  */,
			      FIELD_TYPE_INTEGER /* std public attribute: ncrCode  */
			    };
			
			private final int[] fieldSizes = new int[] {
					  ncrCompressCodeSize,
					  ncrCodeSize
			};
			    

			public int[] fieldSizes() {
				return fieldSizes;
			}  
			
			  public static final int ncrCompressCodeFilter = 0; // filter index
			  private static final int ncrCompressCodeSize = 15; // field size

			  public static final int ncrCodeFilter = 1; // filter index
			  private static final int ncrCodeSize = 5; // field size
			  
			  private String ncrCompressCode;
			  private String ncrCode;
			  
			  private Integer ncrCompressCodeCount; 	  
			  /** 
			   * This field is not part of the table and added for a specific query
			   * executed from the initiatorDML Factory
			  */
			  
			  
			 public NcrCompressRuleN2NDMO(){
				 
			 }
			 
			 public NcrCompressRuleN2NDMO(final String ncrCompressCode, final String ncrCode){
				this.setNcrCompressCode(ncrCompressCode);
				this.setNcrCode(ncrCode);
			 }

			protected void generatedKey(Integer key) {

			}

			protected Object[] get() {
				 return new Object[] {
					      ( ncrCompressCode == null ) ? null
					                            : ( ( ncrCompressCode.length(  ) <= ncrCompressCodeSize )
					      ? ncrCompressCode
					      : ncrCompressCode.substring( 0, ncrCompressCodeSize ) // auto trimmed to fit, if required.
					       ),
					      ( ncrCode == null ) ? null
					                           : ( ( ncrCode.length(  ) <= ncrCodeSize )
					      ? ncrCode
					      : ncrCode.substring( 0, ncrCodeSize ) // auto trimmed to fit, if required.
					       ),
					       ncrCompressCodeCount
					    };
			}

			protected Integer versionNumber() {
				return null;
			}

			protected void versionNumber(Integer versionNumber) {
			
			}

			protected int[] fieldTypes() {
				return fieldTypes;
			}

			protected DAOArgs primaryKey() {
				return null;
			}
			
			protected void set(String ncrCompressCode, String ncrCode, Integer ncrCompressCodeCount){
				this.setNcrCompressCode(ncrCompressCode);
				this.setNcrCode(ncrCode);
			}

			protected void set(final Object[] fields) {
				ncrCompressCode = rtrim( (String) fields[0] );
				ncrCode = rtrim( (String) fields[1] );	
			}

			  public String getNcrCompressCode() {
					return ncrCompressCode;
				}

				public void setNcrCompressCode(String ncrCompressCode) {
					this.ncrCompressCode = getPadded(ncrCompressCode, ncrCompressCodeFilter);
				}

				public String getNcrCode() {
					return ncrCode;
				}

				public void setNcrCode(String ncrCode) {
					this.ncrCode = getPadded(ncrCode, ncrCodeFilter);
				}
				
				public Integer getNcrCompressCodeCount() {
					return ncrCompressCodeCount;
				}
		
				public void setNcrCompressCodeCount(Integer ncrCompressCodeCount) {
					this.ncrCompressCodeCount = ncrCompressCodeCount;
				}
}
