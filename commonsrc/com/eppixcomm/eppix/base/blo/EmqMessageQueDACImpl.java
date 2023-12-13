package com.eppixcomm.eppix.base.blo;

import com.eppixcomm.eppix.common.data.DAO;
import com.eppixcomm.eppix.common.data.DAOThrower;



public class EmqMessageQueDACImpl extends EmqMessageQueAbstractDACImpl implements EmqMessageQueDAC{

	public EmqMessageQueDACImpl(DAO dao, DAOThrower thrower) {
		super(dao, thrower);
		// TODO Auto-generated constructor stub
	}


	public EmqMessageQueDACImpl(DAO dao) {
		super(dao);
		// TODO Auto-generated constructor stub
	}


}