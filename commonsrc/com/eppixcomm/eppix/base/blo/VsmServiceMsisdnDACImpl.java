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

import org.apache.log4j.Logger;

import com.eppixcomm.eppix.common.core.UserContext;
import com.eppixcomm.eppix.common.data.DAO;
import com.eppixcomm.eppix.common.data.DAOThrower;

/**
 * DOCUMENT ME!
 *
 * @version $Revision: 1.3 $
 * @author
  */
public class VsmServiceMsisdnDACImpl
  extends VsmServiceMsisdnAbstractDACImpl
  implements VsmServiceMsisdnDAC {


  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new VsmServiceMsisdnDACImpl object.
   *
   * @param userContext DOCUMENT ME!
   * @param dao DOCUMENT ME!
   */
  public VsmServiceMsisdnDACImpl(
    DAO dao ) {
    super( dao );
  }
}
