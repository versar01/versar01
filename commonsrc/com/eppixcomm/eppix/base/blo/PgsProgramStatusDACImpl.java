package com.eppixcomm.eppix.base.blo;

import com.eppixcomm.eppix.common.core.UserContext;
import com.eppixcomm.eppix.common.data.DAO;

public class PgsProgramStatusDACImpl extends PgsProgramStatusAbstractDACImpl implements PgsProgramStatusDAC{

	public PgsProgramStatusDACImpl(UserContext userContext, DAO dao) {
		super(userContext, dao);
	}
	
	public PgsProgramStatusDACImpl(DAO dao) {
		super(dao);
	}

}
