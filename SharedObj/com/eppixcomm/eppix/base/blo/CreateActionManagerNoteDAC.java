package com.eppixcomm.eppix.base.blo;

import com.eppixcomm.eppix.base.error.EPPIXSeriousException;
import com.eppixcomm.eppix.common.data.DAOIterator;
import com.eppixcomm.eppix.common.data.IntegerDMO;
import com.eppixcomm.eppix.soa.sharedservices.blo.AcnActionDMO;
import com.eppixcomm.eppix.soa.sharedservices.blo.InxInvoiceXrefDMO;
import com.eppixcomm.eppix.soa.sharedservices.blo.TpdTextPadDMO;
import com.eppixcomm.eppix.soa.sharedservices.blo.UsUserDefDMO;

public interface CreateActionManagerNoteDAC {

	public void insertTpdTextPad(TpdTextPadDMO tpdDMO) throws EPPIXSeriousException;

	public UsUserDefDMO getUsUserDef(String login) throws EPPIXSeriousException;

	public AcnActionDMO getAcnSerial(Integer actionSerial) throws EPPIXSeriousException;

	public InxInvoiceXrefDMO getInxInvoiceXREF(String invoiceNo) throws EPPIXSeriousException;

	public IntegerDMO getMaxNteNote() throws EPPIXSeriousException;
	
	public IntegerDMO getMaxTpdBlock(Integer tpdSerial, String tpdType, int tpdPageNo) throws EPPIXSeriousException;
	
	public TpdTextPadDMO getTpdTextPad(Integer tpdSerial, String tpdType, int tpdPageNo, int tpdBlockNo) throws EPPIXSeriousException;
	
	public void updateTpdTextPad(short blockAttr,String blockText,Integer ownerSerial,String type, short pageNo,short blockNo)throws EPPIXSeriousException;


}