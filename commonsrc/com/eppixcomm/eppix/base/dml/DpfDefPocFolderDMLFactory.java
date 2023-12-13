package com.eppixcomm.eppix.base.dml;



public class DpfDefPocFolderDMLFactory extends DpfDefPocFolderAbstractDMLFactory{
	/** The DMLFactory singleton */
	private static DMLFactory dml = null;
	
	protected DpfDefPocFolderDMLFactory() throws DMLException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public static DMLFactory getDMLFactory() throws DMLException {
		if (dml == null) {
			dml = new DpfDefPocFolderDMLFactory();
		}
		return dml;
	} 

}