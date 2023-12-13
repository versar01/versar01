package com.eppixcomm.eppix.base.blo;

import java.math.BigDecimal;

import org.apache.log4j.Logger;

import com.eppixcomm.eppix.base.error.EPPIXSeriousException;
import com.eppixcomm.eppix.common.data.DAC;
import com.eppixcomm.eppix.common.data.DAO;
import com.eppixcomm.eppix.common.data.DAOIterator;
import com.eppixcomm.eppix.common.data.DAOParamQueryArgs;
import com.eppixcomm.eppix.common.data.DAOThrower;
import com.eppixcomm.eppix.common.data.StringDMO;
import com.eppixcomm.eppix.soa.sharedservices.blo.AulAccUpLowlmtDMO;
import com.eppixcomm.eppix.soa.sharedservices.blo.CviCrmValueIndDMO;
import com.eppixcomm.eppix.soa.sharedservices.blo.DccCreditClassesDMO;
import com.eppixcomm.eppix.soa.sharedservices.blo.ErbEpxRskBndDMO;
import com.eppixcomm.eppix.soa.sharedservices.blo.UdvUserdocDelivTtDqo;

public class GetCustomerDACImpl extends DAC implements GetCustomerDAC{
	// Globals
		private static DAOThrower thrower = DAOThrower
				.getDAOThrower(GetCustomerDACImpl.class);
		private Logger logger = thrower.getLogger();

		public GetCustomerDACImpl(DAOThrower thrower, DAO dao) {
			super(dao, thrower);
		}
		
		public GetCustomerDACImpl(DAO dao) {
			super(dao, thrower);
		}

		@Override
		public AulAccUpLowlmtDMO getAul(String accountNo) throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs(
					"getAul", 1);
			args.andFilterBy("getAul").arg(accountNo);
			return (AulAccUpLowlmtDMO) dao.get("getAul", args);
		}

	@Override
	public BigDecimal getAccountBalance(String accountNo) throws EPPIXSeriousException {
		DAOParamQueryArgs args = new DAOParamQueryArgs("getAccountBalance", 1);
		args.andFilterBy("getAccountBalance").arg(accountNo);

		StringDMO amt = null;
		BigDecimal balance = null;

		amt = (StringDMO) dao.get("getAccountBalance", args);

		if (amt == null || amt.getString() == null) {
			balance = new BigDecimal("0.00");
		} else {

			try {
				balance = new BigDecimal(amt.getString());

			} catch (NumberFormatException e) {
				logger.error(e.getMessage());
				balance = new BigDecimal("0.00");
			}

		}

		return balance;
	}

	@Override
	public DccCreditClassesDMO getDccCreditClass(String classId) throws EPPIXSeriousException {
		DAOParamQueryArgs args = new DAOParamQueryArgs(
				"getDccCreditClass", 1);
		args.andFilterBy("getDccCreditClass").arg(classId);
		return (DccCreditClassesDMO) dao.get("getDccCreditClass", args);
	}

	@Override
	public BigDecimal getCdeTotalSum(String account) throws EPPIXSeriousException {
		DAOParamQueryArgs args = new DAOParamQueryArgs("getCdeTotalSum", 1);
		args.andFilterBy("getCdeTotalSum").arg(account);

		StringDMO amt = null;
		BigDecimal totalAmt = null;

		amt = (StringDMO) dao.get("getCdeTotalSum", args);

		if (amt == null || amt.getString() == null) {
			totalAmt = new BigDecimal("0.00");
		} else {

			try {
				totalAmt = new BigDecimal(amt.getString());

			} catch (NumberFormatException e) {
				logger.error(e.getMessage());
				totalAmt = new BigDecimal("0.00");
			}

		}

		return totalAmt;
	}

	@Override
	public BigDecimal getPendingSum(String account) throws EPPIXSeriousException {
		DAOParamQueryArgs args = new DAOParamQueryArgs("getCdeTotalSum", 1);
		args.andFilterBy("getCdeTotalSum").arg(account);

		StringDMO amt = null;
		BigDecimal totalPendSum = null;

		amt = (StringDMO) dao.get("getCdeTotalSum", args);

		if (amt == null || amt.getString() == null) {
			totalPendSum = new BigDecimal("0.00");
		} else {

			try {
				totalPendSum = new BigDecimal(amt.getString());
			} catch (NumberFormatException e) {
				logger.error(e.getMessage());
				totalPendSum = new BigDecimal("0.00");
			}

		}

		return totalPendSum;
	}

	@Override
	public CviCrmValueIndDMO getCviAcv(String account) throws EPPIXSeriousException {
		DAOParamQueryArgs args = new DAOParamQueryArgs(
				"getCviAcv", 1);
		args.andFilterBy("getCviAcv").arg(account);
		return (CviCrmValueIndDMO) dao.get("getCviAcv", args);
	}

	@Override
	public ErbEpxRskBndDMO getRiskBandById(Integer riskId) throws EPPIXSeriousException {
		DAOParamQueryArgs args = new DAOParamQueryArgs(
				"getRiskBandById", 1);
		args.andFilterBy("getRiskBandById").arg(riskId);
		return (ErbEpxRskBndDMO) dao.get("getRiskBandById", args);
	}

	@Override
	public ErbEpxRskBndDMO getRiskBandByText(String text) throws EPPIXSeriousException {
		DAOParamQueryArgs args = new DAOParamQueryArgs(
				"getRiskBandByText", 1);
		args.andFilterBy("getRiskBandByText").arg(text);
		return (ErbEpxRskBndDMO) dao.get("getRiskBandByText", args);
	}

	@Override
	public UdvUserdocDelivTtDqo getUdvTT(String docType, String accountNo) throws EPPIXSeriousException {
		DAOParamQueryArgs args = new DAOParamQueryArgs(
				"getUdvTT", 2);
		args.andFilterBy("getUdvTT").arg(docType).arg(accountNo);
		return (UdvUserdocDelivTtDqo) dao.get("getUdvTT", args);
	}

	@Override
	public void insertUserHistory(String login, String hCode, String comment, String terminal)
			throws EPPIXSeriousException {
		DAOParamQueryArgs args = new DAOParamQueryArgs(
				"insertUserHistory", 4);
		args.andFilterBy("insertUserHistory").arg(login).arg(hCode).arg(comment).arg(terminal);
		dao.execute("insertUserHistory", args);
	}

	@Override
	public StringDMO getCdeLastStatus(String accountNo) throws EPPIXSeriousException {
		DAOParamQueryArgs args = new DAOParamQueryArgs(
				"getCdeLastStatus", 1);
		args.andFilterBy("getCdeLastStatus").arg(accountNo);
		return (StringDMO) dao.get("getCdeLastStatus", args);
	}

}