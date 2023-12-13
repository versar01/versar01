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
public class CdiDatabaseIntDACImpl
  extends CdiDatabaseIntAbstractDACImpl
  implements CdiDatabaseIntAbstractDAC {
  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new CdiDatabaseIntDACImpl object.
   *
   * @param userContext DOCUMENT ME!
   * @param dao DOCUMENT ME!
   */
  public CdiDatabaseIntDACImpl( 
  
    DAO         dao ) {
    super(  dao );
  }
}
