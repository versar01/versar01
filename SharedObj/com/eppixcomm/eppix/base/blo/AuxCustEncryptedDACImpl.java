package com.eppixcomm.eppix.base.blo;

import org.apache.log4j.Logger;

import com.eppixcomm.eppix.base.error.EPPIXSeriousException;
import com.eppixcomm.eppix.common.data.DAC;
import com.eppixcomm.eppix.common.data.DAO;
import com.eppixcomm.eppix.common.data.DAOParamQueryArgs;
import com.eppixcomm.eppix.common.data.DAOThrower;
import com.eppixcomm.eppix.common.data.StringDMO;
import com.eppixcomm.eppix.soa.sharedservices.blo.AuxEncryptedDMO;

public class AuxCustEncryptedDACImpl extends DAC implements AuxCustEncryptedDAC{
	// Globals
	private static DAOThrower thrower = DAOThrower
			.getDAOThrower(AuxCustEncryptedDACImpl.class);
	private Logger logger = thrower.getLogger();

	public AuxCustEncryptedDACImpl(DAOThrower thrower, DAO dao) {
		super(dao, thrower);
	}
	
	public AuxCustEncryptedDACImpl(DAO dao) {
		super(dao, thrower);
	}

	public AuxEncryptedDMO getAuxCustEncrypted(String encrpKey1,
			String encrpKey2, String encrpKey3, String encrpKey4,
			String encrpKey5, String billAcNo) throws EPPIXSeriousException {
		DAOParamQueryArgs args = new DAOParamQueryArgs("getAuxCustEncrypted", 6);
		args.andFilterBy("getAuxCustEncrypted").arg(encrpKey1).arg(encrpKey2)
				.arg(encrpKey3).arg(encrpKey4).arg(encrpKey5).arg(billAcNo);
		return (AuxEncryptedDMO) dao.get("getAuxCustEncrypted", args);
	}
	
	public StringDMO getAuxEncryptKey(String billAcNo)
			throws EPPIXSeriousException {
		DAOParamQueryArgs args = new DAOParamQueryArgs("getAuxEncryptKey", 1);
		args.andFilterBy("getAuxEncryptKey").arg(billAcNo);
		return (StringDMO) dao.get("getAuxEncryptKey", args);
	}
	


}
