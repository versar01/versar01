package com.eppixcomm.eppix.base.blo;

import com.eppixcomm.eppix.common.core.UserContext;
import com.eppixcomm.eppix.common.data.DAO;



public class NpsN2nPerformSendsmsDACImpl extends NpsN2nPerformSendsmsAbstractDACImpl
implements NpsN2nPerformSendsmsDAC {

	public NpsN2nPerformSendsmsDACImpl(UserContext userContext, DAO dao) {
		super(userContext, dao);
	}

	public NpsN2nPerformSendsmsDACImpl(DAO dao) {
		super(dao);
	}
}