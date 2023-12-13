package com.eppixcomm.eppix.base.blo;

import com.eppixcomm.eppix.common.core.UserContext;
import com.eppixcomm.eppix.common.data.DAO;



public class EdfEnhancedDataFaxDACImpl extends EdfEnhancedDataFaxAbstractDACImpl
implements EdfEnhancedDataFaxDAC {

	public EdfEnhancedDataFaxDACImpl(UserContext userContext, DAO dao) {
		super(userContext, dao);
	}

	public EdfEnhancedDataFaxDACImpl(DAO dao) {
		super(dao);
	}
}