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
package com.eppixcomm.eppix.base.blo;

import com.eppixcomm.eppix.base.error.EPPIXSeriousException;
import com.eppixcomm.eppix.common.data.DAO;
import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DAOIterator;
import com.eppixcomm.eppix.common.data.DAOParamQueryArgs;
import com.eppixcomm.eppix.common.data.StringDMO;

/**
 * DOCUMENT ME!
 *
 * @version $Revision: 1.3 $
 * @author 
  */
public class SbdSubDetsDACImpl
  extends SbdSubDetsAbstractDACImpl
  implements SbdSubDetsDAC {
  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new SbdSubDetsDACImpl object.
   *
   * @param userContext DOCUMENT ME!
   * @param dao DOCUMENT ME!
   */
  public SbdSubDetsDACImpl( 
    DAO         dao ) {
    super(  dao );
  }
  
	  public DAOIterator iterateSbdBillAccNoBySbaInvAccount(String sbaInvAccount)
	  throws EPPIXSeriousException {
	  logger.debug( "iterate( args )" );

	  DAOArgs args = new DAOArgs(1).arg(sbaInvAccount);
	 
	  return dao.iterator("getSbdBillAccNoBySbaInvAcc", args);
	}
	  
}
