package com.eppixcomm.eppix.base.blo;

import com.eppixcomm.eppix.common.data.DAO;
import com.eppixcomm.eppix.common.data.DAOThrower;

public class MahMassActionHdDACImpl extends MahMassActionHdAbstractDACImpl implements MahMassActionHdDAC{

	public MahMassActionHdDACImpl(DAO dao) {
		super(dao, thrower);
	}
	public MahMassActionHdDACImpl(DAO dao, DAOThrower thrower) {
		super(dao, thrower);
		// TODO Auto-generated constructor stub
	}
	
}
