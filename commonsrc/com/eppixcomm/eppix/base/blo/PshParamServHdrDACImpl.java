package com.eppixcomm.eppix.base.blo;


import com.eppixcomm.eppix.common.core.UserContext;
import com.eppixcomm.eppix.common.data.DAO;

/**
 * DOCUMENT ME!
 *
 * @version $Revision: 1.3 $
 * @author 
  */
public class PshParamServHdrDACImpl
  extends PshParamServHdrAbstractDACImpl
  implements PshParamServHdrDAC {
  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new PshParamServHdrDACImpl object.
   *
   * @param userContext DOCUMENT ME!
   * @param dao DOCUMENT ME!
   */
  public PshParamServHdrDACImpl( 
    DAO         dao ) {
    super( dao );
  }
}
