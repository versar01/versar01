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
public class VpkPackageDACImpl
  extends VpkPackageAbstractDACImpl
  implements VpkPackageDAC {
  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new VpkPackageDACImpl object.
   *
   * @param userContext DOCUMENT ME!
   * @param dao DOCUMENT ME!
   */
  public VpkPackageDACImpl( 
    UserContext userContext,
    DAO         dao ) {
    super( userContext, dao );
  }
  
  public VpkPackageDACImpl(DAO dao ) {
		    super( dao );
		  }
}
