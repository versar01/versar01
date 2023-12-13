package com.eppixcomm.eppix.base.blo;

import com.eppixcomm.eppix.common.data.DAO;
import com.eppixcomm.eppix.common.data.DAOThrower;



public class RicaPersonVerificationDACImpl extends RicaPersonVerificationAbstractDACImpl implements RicaPersonVerificationDAC{

	public RicaPersonVerificationDACImpl(DAO dao, DAOThrower thrower) {
		super(dao, thrower);
	}

	public RicaPersonVerificationDACImpl(DAO dao ) {
	    super(dao);
	  }
}