package com.eppixcomm.eppix.base.blo;

import com.eppixcomm.eppix.common.data.DAO;
import com.eppixcomm.eppix.common.data.DAOThrower;

public class RicaActionReqDACImpl extends RicaActionReqAbstractDACImpl implements RicaActionReqDAC{

	public RicaActionReqDACImpl(DAO dao) {
		super(dao, thrower);
	}
	public RicaActionReqDACImpl(DAO dao, DAOThrower thrower) {
		super(dao, thrower);
		// TODO Auto-generated constructor stub
	}
	
}
