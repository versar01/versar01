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
import com.eppixcomm.eppix.common.data.DAOParamQueryArgs;
import com.eppixcomm.eppix.common.data.StringDMO;
import com.eppixcomm.eppix.common.util.QueryFilter;
import com.eppixcomm.eppix.base.error.EPPIXSeriousException;

/**
 * DOCUMENT ME!
 *
 * @version $Revision: 1.3 $
 * @author 
  */
public class NmNetmatDACImpl
  extends NmNetmatAbstractDACImpl
  implements NmNetmatDAC {
  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new NmNetmatDACImpl object.
   *
   * @param userContext DOCUMENT ME!
   * @param dao DOCUMENT ME!
   */
  public NmNetmatDACImpl( 
    DAO         dao ) {
    super(  dao );
  }
  
  public StringDMO getUniqueNmNetType(QueryFilter filter)throws EPPIXSeriousException {
	    logger.debug( "getUniqueNmNetType( filter )" );

	    DAOParamQueryArgs args = filterQueryArgs( filter, null );
	    return (StringDMO) dao.get("getUniqueNmNetType", args);
  }
}
