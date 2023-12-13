package com.eppixcomm.eppix.base.blo;

import com.eppixcomm.eppix.base.error.EPPIXSeriousException;
import com.eppixcomm.eppix.common.data.StringDMO;
import com.eppixcomm.eppix.soa.sharedservices.blo.AuxEncryptedDMO;

public interface AuxCustEncryptedDAC {

	public AuxEncryptedDMO getAuxCustEncrypted(String encrpKey1,
			String encrpKey2, String encrpKey3, String encrpKey4,
			String encrpKey5, String billAcNo) throws EPPIXSeriousException;
	
	public StringDMO getAuxEncryptKey(String billAcNo)
			throws EPPIXSeriousException;
	
}

