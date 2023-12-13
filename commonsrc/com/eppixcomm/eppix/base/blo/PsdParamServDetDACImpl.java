package com.eppixcomm.eppix.base.blo;

import com.eppixcomm.eppix.common.core.UserContext;
import com.eppixcomm.eppix.common.data.DAO;

/**
 * DOCUMENT ME!
 *
 * @version $Revision: 1.3 $
 * @author 
  */
public class PsdParamServDetDACImpl
  extends PsdParamServDetAbstractDACImpl
  implements PsdParamServDetDAC {
  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new PsdParamServDetDACImpl object.
   *
   * @param userContext DOCUMENT ME!
   * @param dao DOCUMENT ME!
   */
  public PsdParamServDetDACImpl(DAO dao ) {
    super( dao );
  }
}