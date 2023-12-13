/*============================================================================================= *
 *
 * (c) 2007 Copyright Eppixcomm.
 * All Rights Reserved
 * Legal Information goes here.
 *
 *============================================================================================= */

/**----------------------------------------------------------------------------------------------
 *
 * Version control details:
 *    @version $Revision: $
 *    @author  $Author: $
 *----------------------------------------------------------------------------------------------*/
package com.eppixcomm.eppix.base.dml;

import com.eppixcomm.eppix.base.dml.VamActiveMsisdnAbstractDMLFactory;

/**
 * DOCUMENT ME!
 *
 * @version $Revision: 1.3 $
 * @author 
  */
public class VamActiveMsisdnDMLFactory
  extends VamActiveMsisdnAbstractDMLFactory {
	/** The DMLFactory singleton */
	private static DMLFactory dml = null;
	
	//~ Constructors ///////////////////////////////////////////////////////////

  
	public static DMLFactory getDMLFactory() throws DMLException {
		if (dml == null) {
			dml = new VamActiveMsisdnDMLFactory();
		}
		return dml;
	}  
	
	  /**
	   * Creates a new VamActiveMsisdnDMLFactory object.
	   *
	   * @throws DMLException DOCUMENT ME!
	   */
	  protected VamActiveMsisdnDMLFactory(  )
	    throws DMLException {
		  super();
	  }
}
