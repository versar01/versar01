package com.eppixcomm.eppix.base.dml;


import com.eppixcomm.eppix.base.dml.EcEventCommandAbstractDMLFactory;

/**
 * DOCUMENT ME!
 *
 * @version $Revision: 1.3 $
 * @author 
  */
public class EcEventCommandDMLFactory
  extends EcEventCommandAbstractDMLFactory {
	private static DMLFactory dml = null;
  //~ Constructors ///////////////////////////////////////////////////////////
	
	public static DMLFactory getDMLFactory() throws DMLException {
		if (dml == null) {
			dml = new EcEventCommandDMLFactory();
		}
		return dml;
	}
	
  /**
   * Creates a new EcEventCommandDMLFactory object.
   *
   * @throws DMLException DOCUMENT ME!
   */
  protected EcEventCommandDMLFactory(  )
    throws DMLException {
    super(  );
  }
}
