package com.eppixcomm.eppix.base.blo;

import com.eppixcomm.eppix.base.error.EPPIXSeriousException;
import com.eppixcomm.eppix.common.data.DAOIterator;
import com.eppixcomm.eppix.common.data.IntegerDMO;
import com.eppixcomm.eppix.common.data.StringDMO;
import com.eppixcomm.eppix.common.util.Date;
import com.eppixcomm.eppix.soa.sharedservices.blo.AuxEncryptedDMO;
import com.eppixcomm.eppix.soa.sharedservices.blo.DldDynmcLmtDetDMO;
import com.eppixcomm.eppix.soa.sharedservices.blo.DlhDynmcLmtHdrDMO;

public interface HeliosRpcServicesDAC {

	public SbdSubDetsDMO getSbdMsisdn(String msisdn)
			throws EPPIXSeriousException;

	public DAOIterator cutomerListT(String accountNo)
			throws EPPIXSeriousException;

	public DAOIterator cutomerListTMatchTT(String accountNo, String matchString)
			throws EPPIXSeriousException;

	public DAOIterator cutomerListADealerId(String accountNo, String dealerId,
			String matchString) throws EPPIXSeriousException;

	public DAOIterator cutomerListA(String accountNo, String matchString)
			throws EPPIXSeriousException;

	public DAOIterator cutomerListBDealerId(String matchString, String dealerId)
			throws EPPIXSeriousException;

	public DAOIterator cutomerListB(String matchString)
			throws EPPIXSeriousException;

	public DAOIterator cutomerListEDelaerId(String accountNo, String dealerId,
			String matchString) throws EPPIXSeriousException;

	public DAOIterator cutomerListE(String accountNo, String matchString)
			throws EPPIXSeriousException;

	public DAOIterator cutomerListRValid(String nteNoteSerial)
			throws EPPIXSeriousException;

	public DAOIterator cutomerListR(String nteNoteRefeence)
			throws EPPIXSeriousException;

	public DAOIterator cutomerListNDealId(String accountNo, String dealerId,
			String matchString) throws EPPIXSeriousException;

	public DAOIterator cutomerListN(String accountNo, String matchString)
			throws EPPIXSeriousException;

	public DAOIterator cutomerListDDealId(String accountNo, String dealerId,
			String surname, String firstName) throws EPPIXSeriousException;

	public DAOIterator cutomerListD(String accountNo, String surname,
			String firstName) throws EPPIXSeriousException;

	public DAOIterator cutomerListPDealerId(String accountNo, String dealerId,
			String matchString) throws EPPIXSeriousException;

	public DAOIterator cutomerListP(String accountNo, String matchString)
			throws EPPIXSeriousException;

	public DAOIterator cutomerListCDealerId(String accountNo, String dealerId,
			String matchString) throws EPPIXSeriousException;

	public DAOIterator cutomerListC(String accountNo, String matchString)
			throws EPPIXSeriousException;

	public DAOIterator cutomerListMDealerId(String msisdn, String accountNo,
			String dealerId) throws EPPIXSeriousException;

	public DAOIterator cutomerListM(String msisdn, String accountNo)
			throws EPPIXSeriousException;

	public DAOIterator cutomerListSDealerId(String simNo, String accountNo,
			String dealerId) throws EPPIXSeriousException;

	public DAOIterator cutomerListS(String simNo, String accountNo)
			throws EPPIXSeriousException;

	public DAOIterator cutomerListIDealerId(String matchString1,
			String matchString2, String accountNo, String dealerId)
			throws EPPIXSeriousException;

	public DAOIterator cutomerListI(String matchString1, String matchString2,
			String accountNo) throws EPPIXSeriousException;

	public DAOIterator cutomerListVDealerIdMatch(int len, String matchString,
			String accountNo, String dealerId) throws EPPIXSeriousException;

	public DAOIterator cutomerListVMatch(int len, String matchString,
			String accountNo) throws EPPIXSeriousException;

	public DAOIterator cutomerListVDealerId(String accountNo, String dealerId)
			throws EPPIXSeriousException;

	public DAOIterator cutomerListV(String accountNo)
			throws EPPIXSeriousException;

	public DAOIterator cutomerListUDealerId(Integer subscriberId,
			String accountNo, String dealerId) throws EPPIXSeriousException;

	public DAOIterator cutomerListU(Integer subscriberId)
			throws EPPIXSeriousException;

	public TsTariffServiceDMO getTsTariffService(String packageCode,
			String serviceCode, String interTariff)
			throws EPPIXSeriousException;

	public IntegerDMO cutomerListTCount(String accountNo)
			throws EPPIXSeriousException;

	public IntegerDMO cutomerListTMatchTTCount(String accountNo,
			String matchString) throws EPPIXSeriousException;

	public IntegerDMO cutomerListACount(String accountNo, String matchString)
			throws EPPIXSeriousException;

	public IntegerDMO cutomerListBCount(String matchString)
			throws EPPIXSeriousException;

	public IntegerDMO cutomerListECount(String accountNo, String matchString)
			throws EPPIXSeriousException;

	public IntegerDMO cutomerListRValidCount(String nteNoteSerial)
			throws EPPIXSeriousException;

	public IntegerDMO cutomerListRCount(String nteNoteRefeence)
			throws EPPIXSeriousException;

	public IntegerDMO cutomerListNCount(String accountNo, String matchString)
			throws EPPIXSeriousException;

	public IntegerDMO cutomerListDCount(String accountNo, String surname,
			String firstName) throws EPPIXSeriousException;

	public IntegerDMO cutomerListPCount(String accountNo, String matchString)
			throws EPPIXSeriousException;

	public IntegerDMO cutomerListCCount(String accountNo, String matchString)
			throws EPPIXSeriousException;

	public IntegerDMO cutomerListMCount(String msisdn, String accountNo)
			throws EPPIXSeriousException;

	public IntegerDMO cutomerListSCount(String simNo, String accountNo)
			throws EPPIXSeriousException;

	public IntegerDMO cutomerListICount(String matchString1,
			String matchString2, String accountNo) throws EPPIXSeriousException;

	public IntegerDMO cutomerListVMatchCount(int len, String matchString,
			String accountNo) throws EPPIXSeriousException;

	public IntegerDMO cutomerListVCount(String accountNo)
			throws EPPIXSeriousException;

	public IntegerDMO cutomerListUCount(Integer subscriberId)
			throws EPPIXSeriousException;
	
	public IntegerDMO getCountFraudSubs(String accountNo, String fraudStr, String statusCode)throws EPPIXSeriousException;
	
	public AuxEncryptedDMO getAuxCustEncrypted(String encrpKey1,
			String encrpKey2, String encrpKey3, String encrpKey4,
			String encrpKey5, String billAcNo) throws EPPIXSeriousException;

	public StringDMO getAuxEncryptKey(String billAcNo)
			throws EPPIXSeriousException;
	
	public TsTariffServiceDMO getTariffPackageStatus(String packageCode, String tariffCode)throws EPPIXSeriousException;
	
	public SbuSubUpgradeDMO getSubcriberSbu(Integer subscriberId, Date startDate)throws EPPIXSeriousException;
	
	public IntegerDMO countAuxByRsaId(Date fromDate, Date toDate, String rsaId)throws EPPIXSeriousException;
	
	public IntegerDMO countAuxByPassport(Date fromDate, Date toDate, String passport)throws EPPIXSeriousException;
	
	public DlhDynmcLmtHdrDMO getDlhDynamicLmtHdrById(String rsaId)throws EPPIXSeriousException;
	
	public DlhDynmcLmtHdrDMO getDlhDynamicLmtHdrByPass(String passport)throws EPPIXSeriousException;
	
	public DAOIterator getDldDynamicLmtDetById(Integer id)throws EPPIXSeriousException;
	
	public DldDynmcLmtDetDMO getDldDynamicLmtDetByAccAndId(String accountNo, Integer id)throws EPPIXSeriousException;
	
	public void InsertHeliosAsyncData(Integer prospectId, String searchNo, String searchType)throws EPPIXSeriousException;

}
