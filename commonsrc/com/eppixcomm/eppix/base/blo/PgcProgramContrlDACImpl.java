package com.eppixcomm.eppix.base.blo;

import com.eppixcomm.eppix.common.core.UserContext;
import com.eppixcomm.eppix.common.data.DAO;

/**
 * DOCUMENT ME!
 *
 * @version $Revision: 1.3 $
 * @author 
  */
public class PgcProgramContrlDACImpl
  extends PgcProgramContrlAbstractDACImpl
  implements PgcProgramContrlDAC {
  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new PgcProgramContrlDACImpl object.
   *
   * @param userContext DOCUMENT ME!
   * @param dao DOCUMENT ME!
   */
  public PgcProgramContrlDACImpl( 
    UserContext userContext,
    DAO         dao ) {
    super( userContext, dao );
  }
  
  public PgcProgramContrlDACImpl(DAO dao) {
		    super( dao );
		  }
}
