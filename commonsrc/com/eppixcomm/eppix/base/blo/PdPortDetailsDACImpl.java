package com.eppixcomm.eppix.base.blo;

import com.eppixcomm.eppix.common.data.DAC;
import com.eppixcomm.eppix.common.data.DAO;
import com.eppixcomm.eppix.common.data.DAOThrower;

public class PdPortDetailsDACImpl extends PdPortDetailsAbstractDACImpl implements PdPortDetailsDAC{

	public PdPortDetailsDACImpl(DAOThrower thrower, DAO dao, String defaultLanguageCode) {
		super(thrower, dao, defaultLanguageCode);
		// TODO Auto-generated constructor stub
	}
	
	public PdPortDetailsDACImpl(DAO dao){
		super(dao);
	}

}
