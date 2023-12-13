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

import com.eppixcomm.eppix.common.core.UserContext;
import com.eppixcomm.eppix.common.data.DAO;

/**
 * DOCUMENT ME!
 * 
 * @version $Revision: 1.3 $
 * @author
 */
public class DirDiscountRuleDACImpl extends DirDiscountRuleAbstractDACImpl
		implements DirDiscountRuleDAC {
	// ~ Constructors
	// ///////////////////////////////////////////////////////////

	/**
	 * Creates a new DirDiscountRuleDACImpl object.
	 * 
	 * @param userContext
	 *            DOCUMENT ME!
	 * @param dao
	 *            DOCUMENT ME!
	 */
	public DirDiscountRuleDACImpl(UserContext userContext, DAO dao) {
		super(userContext, dao);
	}

	public DirDiscountRuleDACImpl(DAO dao) {
		super(dao);
	}
}
