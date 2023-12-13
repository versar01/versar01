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
public class OpservmDACImpl
  extends OpservmAbstractDACImpl
  implements OpservmDAC {
  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new OpservmDACImpl object.
   *
   * @param userContext DOCUMENT ME!
   * @param dao DOCUMENT ME!
   */
  public OpservmDACImpl( 
    UserContext userContext,
    DAO         dao ) {
    super( userContext, dao );
  }
  
  public OpservmDACImpl(DAO dao ) {
		    super( dao );
  }
}
