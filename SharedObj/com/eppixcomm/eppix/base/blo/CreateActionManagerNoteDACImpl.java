package com.eppixcomm.eppix.base.blo;

import org.apache.log4j.Logger;

import com.eppixcomm.eppix.base.error.EPPIXSeriousException;
import com.eppixcomm.eppix.common.data.DAC;
import com.eppixcomm.eppix.common.data.DAO;
import com.eppixcomm.eppix.common.data.DAOParamQueryArgs;
import com.eppixcomm.eppix.common.data.DAOThrower;
import com.eppixcomm.eppix.common.data.IntegerDMO;
import com.eppixcomm.eppix.soa.sharedservices.blo.AcnActionDMO;
import com.eppixcomm.eppix.soa.sharedservices.blo.InxInvoiceXrefDMO;
import com.eppixcomm.eppix.soa.sharedservices.blo.TpdTextPadDMO;
import com.eppixcomm.eppix.soa.sharedservices.blo.UsUserDefDMO;

public class CreateActionManagerNoteDACImpl extends DAC implements CreateActionManagerNoteDAC {
// Globals
	private static DAOThrower thrower = DAOThrower.getDAOThrower(CreateActionManagerNoteDACImpl.class);
	private Logger logger = thrower.getLogger();

	public CreateActionManagerNoteDACImpl(DAOThrower thrower, DAO dao) {
		super(dao, thrower);
	}

	public CreateActionManagerNoteDACImpl(DAO dao) {
		super(dao, thrower);
	}
	
	public UsUserDefDMO getUsUserDef(String login) throws EPPIXSeriousException {
		DAOParamQueryArgs args = new DAOParamQueryArgs("getUsUserDef", 1);
		args.andFilterBy("getUsUserDef").arg(login);
		return (UsUserDefDMO) dao.get("getUsUserDef", args);
	}
	
	public AcnActionDMO getAcnSerial(Integer actionSerial)
			throws EPPIXSeriousException {
		DAOParamQueryArgs args = new DAOParamQueryArgs("getAcnSerial", 1);
		args.andFilterBy("getAcnSerial").arg(actionSerial);
		return (AcnActionDMO) dao.get("getAcnSerial", args);
	}
	
	public InxInvoiceXrefDMO getInxInvoiceXREF(String invoiceNo)
			throws EPPIXSeriousException {
		DAOParamQueryArgs args = new DAOParamQueryArgs("getInxInvoiceXREF", 1);
		args.andFilterBy("getInxInvoiceXREF").arg(invoiceNo);
		return (InxInvoiceXrefDMO) dao.get("getInxInvoiceXREF", args);
	}
	public IntegerDMO getMaxNteNote() throws EPPIXSeriousException {
		DAOParamQueryArgs args = new DAOParamQueryArgs("getMaxNteNote", 0);
		return (IntegerDMO) dao.get("getMaxNteNote", args);
	}
	
	public void insertTpdTextPad(TpdTextPadDMO tpdDMO)
			throws EPPIXSeriousException {
		DAOParamQueryArgs args = new DAOParamQueryArgs("insertTpdTextPad", 6);

		args.arg(tpdDMO.getTpdOwnerSerial()).arg(tpdDMO.getTpdType())
				.arg(tpdDMO.getTpdPageNo()).arg(tpdDMO.getTpdBlockNo())
				.arg(tpdDMO.getTpdBlockAttr()).arg(tpdDMO.getTpdBlockText());

		dao.execute("insertTpdTextPad", args);
	}
	
	public IntegerDMO getMaxTpdBlock(Integer tpdSerial, String tpdType,
			int tpdPageNo) throws EPPIXSeriousException {
		DAOParamQueryArgs args = new DAOParamQueryArgs("getMaxTpdBlock", 3);
		args.andFilterBy("getMaxTpdBlock").arg(tpdSerial).arg(tpdType)
				.arg(tpdPageNo);
		return (IntegerDMO) dao.get("getMaxTpdBlock", args);
	}
	
	public TpdTextPadDMO getTpdTextPad(Integer tpdSerial, String tpdType,
			int tpdPageNo, int tpdBlockNo) throws EPPIXSeriousException {
		DAOParamQueryArgs args = new DAOParamQueryArgs("getTpdTextPad", 4);
		args.andFilterBy("getTpdTextPad").arg(tpdSerial).arg(tpdType)
				.arg(tpdPageNo).arg(tpdBlockNo);
		return (TpdTextPadDMO) dao.get("getTpdTextPad", args);
	}

	public void updateTpdTextPad(short blockAttr, String blockText,
			Integer ownerSerial, String type, short pageNo, short blockNo)
			throws EPPIXSeriousException {
		DAOParamQueryArgs args = new DAOParamQueryArgs("updateTpdTextPad", 6);

		args.arg(blockAttr).arg(blockText).arg(ownerSerial).arg(type)
				.arg(pageNo).arg(blockNo);

		dao.execute("updateTpdTextPad", args);
	}

}