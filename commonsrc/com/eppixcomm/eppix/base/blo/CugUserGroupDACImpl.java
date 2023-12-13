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

import com.eppixcomm.eppix.base.blo.CugUserGroupAbstractDACImpl;
import com.eppixcomm.eppix.common.core.UserContext;
import com.eppixcomm.eppix.common.data.DAO;

/**
 * DOCUMENT ME!
 * 
 * @version $Revision: 1.3 $
 * @author
 */
public class CugUserGroupDACImpl extends CugUserGroupAbstractDACImpl implements
		CugUserGroupDAC {
	// ~ Constructors
	// ///////////////////////////////////////////////////////////

	/**
	 * Creates a new CugUserGroupDACImpl object.
	 * 
	 * @param userContext
	 *            DOCUMENT ME!
	 * @param dao
	 *            DOCUMENT ME!
	 */
	public CugUserGroupDACImpl(UserContext userContext, DAO dao) {
		super(userContext, dao);
	}

	public CugUserGroupDACImpl(DAO dao) {
		super(dao);
	}
}
