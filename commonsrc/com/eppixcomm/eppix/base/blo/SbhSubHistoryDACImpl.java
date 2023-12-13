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

import com.eppixcomm.eppix.base.blo.SbhSubHistoryAbstractDACImpl;
import com.eppixcomm.eppix.base.error.EPPIXSeriousException;
import com.eppixcomm.eppix.common.core.UserContext;
import com.eppixcomm.eppix.common.data.DAO;
import com.eppixcomm.eppix.common.data.DTOList;
import com.eppixcomm.eppix.common.data.DTOListState;
import com.eppixcomm.eppix.common.util.QueryFilter;

/**
 * DOCUMENT ME!
 *
 * @version $Revision: 1.3 $
 * @author 
  */
public class SbhSubHistoryDACImpl
  extends SbhSubHistoryAbstractDACImpl
  implements SbhSubHistoryDAC {
  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new SbhSubHistoryDACImpl object.
   *
   * @param userContext DOCUMENT ME!
   * @param dao DOCUMENT ME!
   */
  public SbhSubHistoryDACImpl( 
    UserContext userContext,
    DAO         dao ) {
    super( userContext, dao );
  }
  
  public SbhSubHistoryDACImpl( DAO dao ) {
		    super( dao );
  }
  
}
