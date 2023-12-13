package com.eppixcomm.eppix.base.blo;

import com.eppixcomm.eppix.common.data.DAO;
import com.eppixcomm.eppix.common.data.DAOThrower;

public  class BlhBillLimitHdDACImpl extends BlhBillLimitHdAbstractDACImpl implements BlhBillLimitHdDAC{

	public BlhBillLimitHdDACImpl(DAO dao, DAOThrower thrower) {
		super(dao, thrower);
	}

	public BlhBillLimitHdDACImpl(DAO dao) {
		super(dao);
	}
}
