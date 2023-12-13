package com.eppixcomm.eppix.base.blo;

import com.eppixcomm.eppix.common.data.DAO;
import com.eppixcomm.eppix.common.data.DAOThrower;



public class RicaVerificationAuditDACImpl extends RicaVerificationAuditAbstractDACImpl implements RicaVerificationAuditDAC{

	public RicaVerificationAuditDACImpl(DAO dao, DAOThrower thrower) {
		super(dao, thrower);
	}

	public RicaVerificationAuditDACImpl(DAO dao) {
		super(dao);
	}

}