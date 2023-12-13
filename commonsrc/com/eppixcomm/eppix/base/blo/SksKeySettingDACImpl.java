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
import com.eppixcomm.eppix.common.util.QueryFilter;
import com.eppixcomm.eppix.common.data.DTOList;
import com.eppixcomm.eppix.common.data.DTOListState;

/**
 * DOCUMENT ME!
 *
 * @version $Revision: 1.3 $
 * @author 
  */
public class SksKeySettingDACImpl
  extends SksKeySettingAbstractDACImpl
  implements SksKeySettingDAC {
  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new SksKeySettingDACImpl object.
   *
   * @param userContext DOCUMENT ME!
   * @param dao DOCUMENT ME!
   */
  public SksKeySettingDACImpl( 

    DAO         dao ) {
    super(  dao );
  }

public DTOList getList(DTOListState state, QueryFilter filter) {
	// TODO Auto-generated method stub
	return null;
}

public DTOList getList(DTOListState state, SksKeySettingDMO sksKeySettingDMO) {
	// TODO Auto-generated method stub
	return null;
}
}
