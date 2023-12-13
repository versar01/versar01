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

import com.eppixcomm.eppix.common.data.DAO;

/**
 * DOCUMENT ME!
 *
 * @version $Revision: 1.3 $
 * @author 
  */
public class VamActiveMsisdnDACImpl
  extends VamActiveMsisdnAbstractDACImpl
  implements VamActiveMsisdnDAC {
  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new VamActiveMsisdnDACImpl object.
   *
   * @param userContext DOCUMENT ME!
   * @param dao DOCUMENT ME!
   */
  public VamActiveMsisdnDACImpl( 
    DAO         dao ) {
    super( dao );
  }
}
