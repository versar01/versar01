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

import com.eppixcomm.eppix.common.core.UserContext;
import com.eppixcomm.eppix.common.data.DAO;

/**
 * DOCUMENT ME!
 *
 * @version $Revision: 1.3 $
 * @author 
  */
public class TsTariffServiceDACImpl
  extends TsTariffServiceAbstractDACImpl
  implements TsTariffServiceDAC {
  //~ Constructors ///////////////////////////////////////////////////////////

	public TsTariffServiceDACImpl( DAO dao ) {
		    super(null,dao);
		  }
  /**
   * Creates a new TsTariffServiceDACImpl object.
   *
   * @param userContext DOCUMENT ME!
   * @param dao DOCUMENT ME!
   */
  public TsTariffServiceDACImpl( 
    UserContext userContext,
    DAO         dao ) {
    super( userContext, dao );
  }
  
}
