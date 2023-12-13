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
public class Vsr2ServiceAuxDACImpl
  extends Vsr2ServiceAuxAbstractDACImpl
  implements Vsr2ServiceAuxDAC {
  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new Vsr2ServiceAuxDACImpl object.
   *
   * @param userContext DOCUMENT ME!
   * @param dao DOCUMENT ME!
   */
  public Vsr2ServiceAuxDACImpl( 
    UserContext userContext,
    DAO         dao ) {
    super( userContext, dao );
  }
  
  public Vsr2ServiceAuxDACImpl(DAO dao ) {
		    super( dao );
		  }
}
