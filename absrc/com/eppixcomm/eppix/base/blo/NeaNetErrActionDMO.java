package com.eppixcomm.eppix.base.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;



public class NeaNetErrActionDMO  extends DBO implements Serializable {
	private String neaAction;
	private String neaError;
	
	public static final int neaActionFilter = 0; // filter index
	private static final int neaActionSize = 2; // field size

	public static final int neaErrorFilter = 1; // filter index
	private static final int neaErrorSize = 10; // field size
	
	
	public NeaNetErrActionDMO(){
		
	}

	public NeaNetErrActionDMO(final String neaAction, final String neaError){
		this.neaAction = neaAction;
		this.neaError = neaError;
	}
	
	protected void set(final String neaAction, final String neaError){
		this.neaAction = neaAction;
		this.neaError = neaError;
	}

	protected void generatedKey(Integer key) {
		// TODO Auto-generated method stub		
	}

	protected Object[] get() {
		// TODO Auto-generated method stub
		return new Object[]{
				(neaAction == null) ? null
						: ((neaAction.length() <= neaActionSize) ? neaAction
								: neaAction.substring(0, neaActionSize)),
				(neaError == null) ? null
						: ((neaError.length() <= neaErrorSize) ? neaError
								: neaError.substring(0, neaErrorSize))							
		};
	}

	protected Integer versionNumber() {
		// TODO Auto-generated method stub
		return null;
	}

	protected void versionNumber(Integer versionNumber) {
		// TODO Auto-generated method stub		
	}
	
	private final int[] fieldSizes = new int[] {
			neaActionSize,
			neaErrorSize
	};

	protected int[] fieldSizes() {
		return fieldSizes;
	}

	private static final int[] fieldTypes = new int[] { 
		FIELD_TYPE_STRING /* std public  attribute ncrCompressCode*/,
		FIELD_TYPE_STRING /* std public attribute: ncrCode */
	};
	
	protected int[] fieldTypes() {
		return fieldTypes;
	}

	protected DAOArgs primaryKey() {
		return new DAOArgs( 2 ).arg(neaAction).arg(neaError);
	}

	protected void set(final Object[] fields) {
		this.neaAction = rtrim((String)fields[0]);
		this.neaError = rtrim((String)fields[1]);
	}

	public String getNeaAction() {
		return neaAction;
	}

	public void setNeaAction(String neaAction) {
		this.neaAction = neaAction;
	}

	public String getNeaError() {
		return neaError;
	}

	public void setNeaError(String neaError) {
		this.neaError = neaError;
	}


}