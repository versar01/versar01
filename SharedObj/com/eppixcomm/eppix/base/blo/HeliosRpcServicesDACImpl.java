package com.eppixcomm.eppix.base.blo;

import org.apache.log4j.Logger;

import com.eppixcomm.eppix.base.error.EPPIXSeriousException;
import com.eppixcomm.eppix.common.data.DAC;
import com.eppixcomm.eppix.common.data.DAO;
import com.eppixcomm.eppix.common.data.DAOIterator;
import com.eppixcomm.eppix.common.data.DAOParamQueryArgs;
import com.eppixcomm.eppix.common.data.DAOThrower;
import com.eppixcomm.eppix.common.data.IntegerDMO;
import com.eppixcomm.eppix.common.data.StringDMO;
import com.eppixcomm.eppix.common.util.Date;
import com.eppixcomm.eppix.soa.sharedservices.blo.AuxEncryptedDMO;
import com.eppixcomm.eppix.soa.sharedservices.blo.DldDynmcLmtDetDMO;
import com.eppixcomm.eppix.soa.sharedservices.blo.DlhDynmcLmtHdrDMO;


public class HeliosRpcServicesDACImpl extends DAC implements HeliosRpcServicesDAC{
	// Globals
	private static DAOThrower thrower = DAOThrower
			.getDAOThrower(GetServiceDiscountDACImpl.class);
	private Logger logger = thrower.getLogger();

	public HeliosRpcServicesDACImpl(DAOThrower thrower, DAO dao) {
		super(dao, thrower);
	}
	
	public HeliosRpcServicesDACImpl(DAO dao) {
		super(dao, thrower);
	}

	public SbdSubDetsDMO getSbdMsisdn(String msisdn)
			throws EPPIXSeriousException {
		DAOParamQueryArgs args = new DAOParamQueryArgs(
				"getSbdMsisdn", 1);
		args.andFilterBy("getSbdMsisdn").arg(msisdn);
		return (SbdSubDetsDMO) dao.get("getSbdMsisdn", args);
	}
	
	public DAOIterator cutomerListT(String accountNo)
			throws EPPIXSeriousException {
		DAOParamQueryArgs args = new DAOParamQueryArgs(
				"cutomerListT", 1);
		args.andFilterBy("cutomerListT").arg(accountNo);
		return (DAOIterator) dao.iterator("cutomerListT", args);
	}

	public DAOIterator cutomerListTMatchTT(String accountNo, String matchString)
			throws EPPIXSeriousException {
		DAOParamQueryArgs args = new DAOParamQueryArgs(
				"cutomerListTMatchTT", 2);
		args.andFilterBy("cutomerListTMatchTT").arg(accountNo).arg(matchString);
		return (DAOIterator) dao.iterator("cutomerListTMatchTT", args);
	}

	public DAOIterator cutomerListADealerId(String accountNo, String dealerId,
			String matchString) throws EPPIXSeriousException {
		DAOParamQueryArgs args = new DAOParamQueryArgs(
				"cutomerListADealerId", 3);
		args.andFilterBy("cutomerListADealerId").arg(accountNo).arg(dealerId).arg(matchString);
		return (DAOIterator) dao.iterator("cutomerListADealerId", args);
	}

	public DAOIterator cutomerListA(String accountNo, String matchString)
			throws EPPIXSeriousException {
		DAOParamQueryArgs args = new DAOParamQueryArgs(
				"cutomerListA", 2);
		args.andFilterBy("cutomerListA").arg(accountNo).arg(matchString);
		return (DAOIterator) dao.iterator("cutomerListA", args);
	}

	public DAOIterator cutomerListBDealerId(String matchString, String dealerId)
			throws EPPIXSeriousException {
		DAOParamQueryArgs args = new DAOParamQueryArgs(
				"cutomerListBDealerId", 2);
		args.andFilterBy("cutomerListBDealerId").arg(matchString).arg(dealerId);
		return (DAOIterator) dao.iterator("cutomerListBDealerId", args);
	}

	public DAOIterator cutomerListB(String matchString)
			throws EPPIXSeriousException {
		DAOParamQueryArgs args = new DAOParamQueryArgs(
				"cutomerListB", 1);
		args.andFilterBy("cutomerListB").arg(matchString);
		return (DAOIterator) dao.iterator("cutomerListB", args);
	}

	public DAOIterator cutomerListEDelaerId(String accountNo, String dealerId,
			String matchString) throws EPPIXSeriousException {
		DAOParamQueryArgs args = new DAOParamQueryArgs(
				"cutomerListEDelaerId", 3);
		args.andFilterBy("cutomerListEDelaerId").arg(accountNo).arg(dealerId).arg(matchString);
		return (DAOIterator) dao.iterator("cutomerListEDelaerId", args);
	}

	public DAOIterator cutomerListE(String accountNo, String matchString)
			throws EPPIXSeriousException {
		DAOParamQueryArgs args = new DAOParamQueryArgs(
				"cutomerListE", 2);
		args.andFilterBy("cutomerListE").arg(accountNo).arg(matchString);
		return (DAOIterator) dao.iterator("cutomerListE", args);
	}

	public DAOIterator cutomerListRValid(String nteNoteSerial)
			throws EPPIXSeriousException {
		DAOParamQueryArgs args = new DAOParamQueryArgs(
				"cutomerListRValid", 1);
		args.andFilterBy("cutomerListRValid").arg(nteNoteSerial);
		return (DAOIterator) dao.iterator("cutomerListRValid", args);
	}

	public DAOIterator cutomerListR(String nteNoteRefeence)
			throws EPPIXSeriousException {
		DAOParamQueryArgs args = new DAOParamQueryArgs(
				"cutomerListR", 1);
		args.andFilterBy("cutomerListR").arg(nteNoteRefeence);
		return (DAOIterator) dao.iterator("cutomerListR", args);
	}

	public DAOIterator cutomerListNDealId(String accountNo, String dealerId,
			String matchString) throws EPPIXSeriousException {
		DAOParamQueryArgs args = new DAOParamQueryArgs(
				"cutomerListNDealId", 3);
		args.andFilterBy("cutomerListNDealId").arg(accountNo).arg(dealerId).arg(matchString);
		return (DAOIterator) dao.iterator("cutomerListNDealId", args);
	}

	public DAOIterator cutomerListN(String accountNo, String matchString)
			throws EPPIXSeriousException {
		DAOParamQueryArgs args = new DAOParamQueryArgs(
				"cutomerListN", 2);
		args.andFilterBy("cutomerListN").arg(accountNo).arg(matchString);
		return (DAOIterator) dao.iterator("cutomerListN", args);
	}

	public DAOIterator cutomerListDDealId(String accountNo, String dealerId,
			String surname, String firstName) throws EPPIXSeriousException {
		DAOParamQueryArgs args = new DAOParamQueryArgs(
				"cutomerListDDealId", 4);
		args.andFilterBy("cutomerListDDealId").arg(accountNo).arg(dealerId).arg(surname).arg(firstName);
		return (DAOIterator) dao.iterator("cutomerListDDealId", args);
	}

	public DAOIterator cutomerListD(String accountNo, String surname,
			String firstName) throws EPPIXSeriousException {
		DAOParamQueryArgs args = new DAOParamQueryArgs(
				"cutomerListD", 3);
		args.andFilterBy("cutomerListD").arg(accountNo).arg(surname).arg(firstName);
		return (DAOIterator) dao.iterator("cutomerListD", args);
	}

	public DAOIterator cutomerListPDealerId(String accountNo, String dealerId,
			String matchString) throws EPPIXSeriousException {
		DAOParamQueryArgs args = new DAOParamQueryArgs(
				"cutomerListPDealerId", 3);
		args.andFilterBy("cutomerListPDealerId").arg(accountNo).arg(dealerId).arg(matchString);
		return (DAOIterator) dao.iterator("cutomerListPDealerId", args);
	}

	public DAOIterator cutomerListP(String accountNo, String matchString)
			throws EPPIXSeriousException {
		DAOParamQueryArgs args = new DAOParamQueryArgs(
				"cutomerListP", 2);
		args.andFilterBy("cutomerListP").arg(accountNo).arg(matchString);
		return (DAOIterator) dao.iterator("cutomerListP", args);
	}

	public DAOIterator cutomerListCDealerId(String accountNo, String dealerId,
			String matchString) throws EPPIXSeriousException {
		DAOParamQueryArgs args = new DAOParamQueryArgs(
				"cutomerListCDealerId", 3);
		args.andFilterBy("cutomerListCDealerId").arg(accountNo).arg(dealerId).arg(matchString);
		return (DAOIterator) dao.iterator("cutomerListCDealerId", args);
	}

	public DAOIterator cutomerListC(String accountNo, String matchString)
			throws EPPIXSeriousException {
		DAOParamQueryArgs args = new DAOParamQueryArgs(
				"cutomerListC", 2);
		args.andFilterBy("cutomerListC").arg(accountNo).arg(matchString);
		return (DAOIterator) dao.iterator("cutomerListC", args);
	}

	public DAOIterator cutomerListMDealerId(String msisdn, String accountNo,
			String dealerId) throws EPPIXSeriousException {
		DAOParamQueryArgs args = new DAOParamQueryArgs(
				"cutomerListMDealerId", 3);
		args.andFilterBy("cutomerListMDealerId").arg(msisdn).arg(accountNo).arg(dealerId);
		return (DAOIterator) dao.iterator("cutomerListMDealerId", args);
	}

	public DAOIterator cutomerListM(String msisdn, String accountNo)
			throws EPPIXSeriousException {
		DAOParamQueryArgs args = new DAOParamQueryArgs(
				"cutomerListM", 2);
		args.andFilterBy("cutomerListM").arg(msisdn).arg(accountNo);
		return (DAOIterator) dao.iterator("cutomerListM", args);
	}

	public DAOIterator cutomerListSDealerId(String simNo, String accountNo,
			String dealerId) throws EPPIXSeriousException {
		DAOParamQueryArgs args = new DAOParamQueryArgs(
				"cutomerListSDealerId", 3);
		args.andFilterBy("cutomerListSDealerId").arg(simNo).arg(accountNo).arg(dealerId);
		return (DAOIterator) dao.iterator("cutomerListSDealerId", args);
	}

	public DAOIterator cutomerListS(String simNo, String accountNo)
			throws EPPIXSeriousException {
		DAOParamQueryArgs args = new DAOParamQueryArgs(
				"cutomerListS", 2);
		args.andFilterBy("cutomerListS").arg(simNo).arg(accountNo);
		return (DAOIterator) dao.iterator("cutomerListS", args);
	}

	public DAOIterator cutomerListIDealerId(String matchString1,
			String matchString2, String accountNo, String dealerId)
			throws EPPIXSeriousException {
		DAOParamQueryArgs args = new DAOParamQueryArgs(
				"cutomerListIDealerId", 4);
		args.andFilterBy("cutomerListIDealerId").arg(matchString1).arg(matchString2).arg(accountNo).arg(dealerId);
		return (DAOIterator) dao.iterator("cutomerListIDealerId", args);
	}

	public DAOIterator cutomerListI(String matchString1, String matchString2,
			String accountNo) throws EPPIXSeriousException {
		DAOParamQueryArgs args = new DAOParamQueryArgs(
				"cutomerListI", 3);
		args.andFilterBy("cutomerListI").arg(matchString1).arg(matchString2).arg(accountNo);
		return (DAOIterator) dao.iterator("cutomerListI", args);
	}

	public DAOIterator cutomerListVDealerIdMatch(int len, String matchString,
			String accountNo, String dealerId) throws EPPIXSeriousException {
		DAOParamQueryArgs args = new DAOParamQueryArgs(
				"cutomerListVDealerIdMatch", 4);
		args.andFilterBy("cutomerListVDealerIdMatch").arg(len).arg(matchString).arg(accountNo).arg(dealerId);
		return (DAOIterator) dao.iterator("cutomerListVDealerIdMatch", args);
	}

	public DAOIterator cutomerListVMatch(int len, String matchString,
			String accountNo) throws EPPIXSeriousException {
		DAOParamQueryArgs args = new DAOParamQueryArgs(
				"cutomerListVMatch", 3);
		args.andFilterBy("cutomerListVMatch").arg(len).arg(matchString).arg(accountNo);
		return (DAOIterator) dao.iterator("cutomerListVMatch", args);
	}

	public DAOIterator cutomerListVDealerId(String accountNo, String dealerId)
			throws EPPIXSeriousException {
		DAOParamQueryArgs args = new DAOParamQueryArgs(
				"cutomerListVDealerId", 2);
		args.andFilterBy("cutomerListVDealerId").arg(accountNo).arg(dealerId);
		return (DAOIterator) dao.iterator("cutomerListVDealerId", args);
	}

	public DAOIterator cutomerListV(String accountNo)
			throws EPPIXSeriousException {
		DAOParamQueryArgs args = new DAOParamQueryArgs(
				"cutomerListV", 1);
		args.andFilterBy("cutomerListV").arg(accountNo);
		return (DAOIterator) dao.iterator("cutomerListV", args);
	}

	public DAOIterator cutomerListUDealerId(Integer subscriberId,
			String accountNo, String dealerId) throws EPPIXSeriousException {
		DAOParamQueryArgs args = new DAOParamQueryArgs(
				"cutomerListUDealerId", 3);
		args.andFilterBy("cutomerListUDealerId").arg(subscriberId).arg(accountNo).arg(dealerId);
		return (DAOIterator) dao.iterator("cutomerListUDealerId", args);
	}

	public DAOIterator cutomerListU(Integer subscriberId)
			throws EPPIXSeriousException {
		DAOParamQueryArgs args = new DAOParamQueryArgs(
				"cutomerListU", 1);
		args.andFilterBy("cutomerListU").arg(subscriberId);
		return (DAOIterator) dao.iterator("cutomerListU", args);
	}

	public TsTariffServiceDMO getTsTariffService(String packageCode, String serviceCode, String interTariff) throws EPPIXSeriousException {
		DAOParamQueryArgs args = new DAOParamQueryArgs(
				"getTsTariffService", 3);
		args.andFilterBy("getTsTariffService").arg(packageCode).arg(serviceCode).arg(interTariff);
		return (TsTariffServiceDMO) dao.get("getTsTariffService", args);
	}
	
	public IntegerDMO cutomerListTCount(String accountNo)
			throws EPPIXSeriousException {
		DAOParamQueryArgs args = new DAOParamQueryArgs(
				"cutomerListTCount", 1);
		args.andFilterBy("cutomerListTCount").arg(accountNo);
		return (IntegerDMO) dao.get("cutomerListTCount", args);
	}

	public IntegerDMO cutomerListTMatchTTCount(String accountNo,
			String matchString) throws EPPIXSeriousException {
		DAOParamQueryArgs args = new DAOParamQueryArgs(
				"cutomerListTMatchTTCount", 2);
		args.andFilterBy("cutomerListTMatchTTCount").arg(accountNo).arg(matchString);
		return (IntegerDMO) dao.get("cutomerListTMatchTTCount", args);
	}

	public IntegerDMO cutomerListACount(String accountNo, String matchString)
			throws EPPIXSeriousException {
		DAOParamQueryArgs args = new DAOParamQueryArgs(
				"cutomerListACount", 2);
		args.andFilterBy("cutomerListACount").arg(accountNo).arg(matchString);
		return (IntegerDMO) dao.get("cutomerListACount", args);
	}

	public IntegerDMO cutomerListBCount(String matchString)
			throws EPPIXSeriousException {
		DAOParamQueryArgs args = new DAOParamQueryArgs(
				"cutomerListBCount", 1);
		args.andFilterBy("cutomerListBCount").arg(matchString);
		return (IntegerDMO) dao.get("cutomerListBCount", args);
	}

	public IntegerDMO cutomerListECount(String accountNo, String matchString)
			throws EPPIXSeriousException {
		DAOParamQueryArgs args = new DAOParamQueryArgs(
				"cutomerListECount", 2);
		args.andFilterBy("cutomerListECount").arg(accountNo).arg(matchString);
		return (IntegerDMO) dao.get("cutomerListECount", args);
	}

	public IntegerDMO cutomerListRValidCount(String nteNoteSerial)
			throws EPPIXSeriousException {
		DAOParamQueryArgs args = new DAOParamQueryArgs(
				"cutomerListRValidCount", 1);
		args.andFilterBy("cutomerListRValidCount").arg(nteNoteSerial);
		return (IntegerDMO) dao.get("cutomerListRValidCount", args);
	}

	public IntegerDMO cutomerListRCount(String nteNoteRefeence)
			throws EPPIXSeriousException {
		DAOParamQueryArgs args = new DAOParamQueryArgs(
				"cutomerListRCount", 1);
		args.andFilterBy("cutomerListRCount").arg(nteNoteRefeence);
		return (IntegerDMO) dao.get("cutomerListRCount", args);
	}

	public IntegerDMO cutomerListNCount(String accountNo, String matchString)
			throws EPPIXSeriousException {
		DAOParamQueryArgs args = new DAOParamQueryArgs(
				"cutomerListNCount", 2);
		args.andFilterBy("cutomerListNCount").arg(accountNo).arg(matchString);
		return (IntegerDMO) dao.get("cutomerListNCount", args);
	}

	public IntegerDMO cutomerListDCount(String accountNo, String surname,
			String firstName) throws EPPIXSeriousException {
		DAOParamQueryArgs args = new DAOParamQueryArgs(
				"cutomerListDCount", 3);
		args.andFilterBy("cutomerListDCount").arg(accountNo).arg(surname).arg(firstName);
		return (IntegerDMO) dao.get("cutomerListDCount", args);
	}

	public IntegerDMO cutomerListPCount(String accountNo, String matchString)
			throws EPPIXSeriousException {
		DAOParamQueryArgs args = new DAOParamQueryArgs(
				"cutomerListPCount", 2);
		args.andFilterBy("cutomerListPCount").arg(accountNo).arg(matchString);
		return (IntegerDMO) dao.get("cutomerListPCount", args);
	}

	public IntegerDMO cutomerListCCount(String accountNo, String matchString)
			throws EPPIXSeriousException {
		DAOParamQueryArgs args = new DAOParamQueryArgs(
				"cutomerListCCount", 2);
		args.andFilterBy("cutomerListCCount").arg(accountNo).arg(matchString);
		return (IntegerDMO) dao.get("cutomerListCCount", args);
	}

	public IntegerDMO cutomerListMCount(String msisdn, String accountNo)
			throws EPPIXSeriousException {
		DAOParamQueryArgs args = new DAOParamQueryArgs(
				"cutomerListMCount", 2);
		args.andFilterBy("cutomerListMCount").arg(msisdn).arg(accountNo);
		return (IntegerDMO) dao.get("cutomerListMCount", args);
	}

	public IntegerDMO cutomerListSCount(String simNo, String accountNo)
			throws EPPIXSeriousException {
		DAOParamQueryArgs args = new DAOParamQueryArgs(
				"cutomerListSCount", 2);
		args.andFilterBy("cutomerListSCount").arg(simNo).arg(accountNo);
		return (IntegerDMO) dao.get("cutomerListSCount", args);
	}

	public IntegerDMO cutomerListICount(String matchString1,
			String matchString2, String accountNo) throws EPPIXSeriousException {
		DAOParamQueryArgs args = new DAOParamQueryArgs(
				"cutomerListICount", 3);
		args.andFilterBy("cutomerListICount").arg(matchString1).arg(matchString2).arg(accountNo);
		return (IntegerDMO) dao.get("cutomerListICount", args);
	}

	public IntegerDMO cutomerListVMatchCount(int len, String matchString,
			String accountNo) throws EPPIXSeriousException {
		DAOParamQueryArgs args = new DAOParamQueryArgs(
				"cutomerListVMatchCount", 3);
		args.andFilterBy("cutomerListVMatchCount").arg(len).arg(matchString).arg(accountNo);
		return (IntegerDMO) dao.get("cutomerListVMatchCount", args);
	}

	public IntegerDMO cutomerListVCount(String accountNo)
			throws EPPIXSeriousException {
		DAOParamQueryArgs args = new DAOParamQueryArgs(
				"cutomerListVCount", 1);
		args.andFilterBy("cutomerListVCount").arg(accountNo);
		return (IntegerDMO) dao.get("cutomerListVCount", args);
	}

	public IntegerDMO cutomerListUCount(Integer subscriberId)
			throws EPPIXSeriousException {
		DAOParamQueryArgs args = new DAOParamQueryArgs(
				"cutomerListUCount", 1);
		args.andFilterBy("cutomerListUCount").arg(subscriberId);
		return (IntegerDMO) dao.get("cutomerListUCount", args);
	}

	public IntegerDMO getCountFraudSubs(String accountNo, String fraudStr,
			String statusCode) throws EPPIXSeriousException {
		DAOParamQueryArgs args = new DAOParamQueryArgs(
				"getCountFraudSubs", 3);
		args.andFilterBy("getCountFraudSubs").arg(accountNo).arg(fraudStr).arg(statusCode);
		return (IntegerDMO) dao.get("getCountFraudSubs", args);
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

	public TsTariffServiceDMO getTariffPackageStatus(String packageCode,
			String tariffCode) throws EPPIXSeriousException {
		DAOParamQueryArgs args = new DAOParamQueryArgs("getTariffPackageStatus", 4);
		args.andFilterBy("getTariffPackageStatus").arg(packageCode).arg(tariffCode).arg(packageCode).arg(tariffCode);
		return (TsTariffServiceDMO) dao.get("getTariffPackageStatus", args);
	}

	public SbuSubUpgradeDMO getSubcriberSbu(Integer subscriberId, Date startDate)
			throws EPPIXSeriousException {
		DAOParamQueryArgs args = new DAOParamQueryArgs("getSubcriberSbu", 2);
		args.andFilterBy("getSubcriberSbu").arg(subscriberId).arg(startDate);
		return (SbuSubUpgradeDMO) dao.get("getSubcriberSbu", args);
	}

	public IntegerDMO countAuxByRsaId(Date fromDate, Date toDate, String rsaId)
			throws EPPIXSeriousException {
		DAOParamQueryArgs args = new DAOParamQueryArgs(
				"countAuxByRsaId", 3);
		args.andFilterBy("countAuxByRsaId").arg(fromDate).arg(toDate).arg(rsaId);
		return (IntegerDMO) dao.get("countAuxByRsaId", args);
	}

	public IntegerDMO countAuxByPassport(Date fromDate, Date toDate, String passport)
			throws EPPIXSeriousException {
		DAOParamQueryArgs args = new DAOParamQueryArgs(
				"countAuxByPassport", 3);
		args.andFilterBy("countAuxByPassport").arg(fromDate).arg(toDate).arg(passport);
		return (IntegerDMO) dao.get("countAuxByPassport", args);
	}
	
	public DlhDynmcLmtHdrDMO getDlhDynamicLmtHdrById(String rsaId)
			throws EPPIXSeriousException {
		DAOParamQueryArgs args = new DAOParamQueryArgs(
				"getDlhDynamicLmtHdrById", 1);
		args.andFilterBy("getDlhDynamicLmtHdrById").arg(rsaId);
		return (DlhDynmcLmtHdrDMO) dao.get("getDlhDynamicLmtHdrById", args);
	}

	public DlhDynmcLmtHdrDMO getDlhDynamicLmtHdrByPass(String passport)
			throws EPPIXSeriousException {
		DAOParamQueryArgs args = new DAOParamQueryArgs(
				"getDlhDynamicLmtHdrByPass", 1);
		args.andFilterBy("getDlhDynamicLmtHdrByPass").arg(passport);
		return (DlhDynmcLmtHdrDMO) dao.get("getDlhDynamicLmtHdrByPass", args);
	}

	@Override
	public DAOIterator getDldDynamicLmtDetById(Integer id) throws EPPIXSeriousException {
		DAOParamQueryArgs args = new DAOParamQueryArgs(
				"getDldDynamicLmtDetById", 1);
		args.andFilterBy("getDldDynamicLmtDetById").arg(id);
		return (DAOIterator) dao.iterator("getDldDynamicLmtDetById", args);
	}

	@Override
	public DldDynmcLmtDetDMO getDldDynamicLmtDetByAccAndId(String accountNo, Integer id) throws EPPIXSeriousException {
		DAOParamQueryArgs args = new DAOParamQueryArgs(
				"getDldDynamicLmtDetByAccAndId", 2);
		args.andFilterBy("getDldDynamicLmtDetByAccAndId").arg(accountNo).arg(id);
		return (DldDynmcLmtDetDMO) dao.get("getDldDynamicLmtDetByAccAndId", args);
	}

	@Override
	public void InsertHeliosAsyncData(Integer prospectId, String searchNo, String searchType)
			throws EPPIXSeriousException {
		DAOParamQueryArgs args = new DAOParamQueryArgs(
				"InsertHeliosAsyncData", 3);
		args.andFilterBy("InsertHeliosAsyncData").arg(prospectId).arg(searchNo).arg(searchType);
		dao.execute("InsertHeliosAsyncData", args);
		
	}
}
