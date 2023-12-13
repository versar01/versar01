package com.eppixcomm.eppix.base.blo;

import com.eppixcomm.eppix.common.core.UserContext;
import com.eppixcomm.eppix.common.data.DAO;

/**
 * DOCUMENT ME!
 *
 * @version $Revision: 1.3 $
 * @author 
  */
public class CpcCallPrechargeDACImpl
  extends CpcCallPrechargeAbstractDACImpl
  implements CpcCallPrechargeDAC {
  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new CpcCallPrechargeDACImpl object.
   *
   * @param userContext DOCUMENT ME!
   * @param dao DOCUMENT ME!
   */
  public CpcCallPrechargeDACImpl( 
    UserContext userContext,
    DAO         dao ) {
    super( userContext, dao );
  }
  
  public CpcCallPrechargeDACImpl( DAO dao ) {
		    super( dao );
		  }
}