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



public class GetSULMaxUsageAllowedDACImpl extends DAC implements GetSULMaxUsageAllowedDAC{
	// Globals
			private static DAOThrower thrower = DAOThrower
					.getDAOThrower(GetSULMaxUsageAllowedDACImpl.class);
			private Logger logger = thrower.getLogger();

			public GetSULMaxUsageAllowedDACImpl(DAO dao) {
				super(dao, thrower);
			}

			public GetSULMaxUsageAllowedDACImpl(DAO dao, DAOThrower thrower) {
				super(dao, thrower);
			}

	public BigDecimal getSumSulByAccount(String accountNo) throws EPPIXSeriousException {
		DAOParamQueryArgs args = new DAOParamQueryArgs("getSumSulByAccount", 1);
		args.andFilterBy("getSumSulByAccount").arg(accountNo);

		StringDMO sumDMO = (StringDMO) dao.get("getSumSulByAccount", args);

		BigDecimal sumSUL = null;

		if (sumDMO != null) {
			if (sumDMO.getString() != null && sumDMO.getString().length() > 0) {
				try {
					sumSUL = new BigDecimal(sumDMO.getString());
				} catch (NumberFormatException e) {
					throw new EPPIXSeriousException(e.getMessage());
				}
			} else {
				
			}
		}else {
			sumSUL = new BigDecimal("0.00");
		}
		return sumSUL;
	}

			public BigDecimal getSumSulBySubscriber(Integer subscriberId)
					throws EPPIXSeriousException {
				DAOParamQueryArgs args = new DAOParamQueryArgs("getSumSulBySubscriber", 1);
				args.andFilterBy("getSumSulBySubscriber").arg(subscriberId);

				StringDMO sumDMO = (StringDMO) dao.get("getSumSulBySubscriber", args);
				
				BigDecimal sumSUL = null;

				if(sumDMO != null && sumDMO.getString().length() > 0){
					try {
						sumSUL = new BigDecimal(sumDMO.getString());
					} catch (NumberFormatException e) {
						throw new EPPIXSeriousException(e.getMessage());
					}
				}else{
					sumSUL = new BigDecimal("0.00");
				}

				return sumSUL;
				
			}
			
			public BigDecimal getSumSpulByAccount(String accountNo)
					throws EPPIXSeriousException {
				DAOParamQueryArgs args = new DAOParamQueryArgs("getSumSpulByAccount", 1);
				args.andFilterBy("getSumSpulByAccount").arg(accountNo);

				StringDMO sumDMO = (StringDMO) dao.get("getSumSpulByAccount", args);
				
				BigDecimal sumSPUL = null;

				if(sumDMO != null && sumDMO.getString().length() > 0){
					try {
						sumSPUL = new BigDecimal(sumDMO.getString());
					} catch (NumberFormatException e) {
						throw new EPPIXSeriousException(e.getMessage());
					}
				}else{
					sumSPUL = new BigDecimal("0.00");
				}

				return sumSPUL;
				
			}

			public BigDecimal getCrbUnbillCharges(String accountNo)
					throws EPPIXSeriousException {
				
				DAOParamQueryArgs args = new DAOParamQueryArgs("getCrbUnbillCharges", 1);
				args.andFilterBy("getCrbUnbillCharges").arg(accountNo);

				
				StringDMO sumDMO = (StringDMO) dao.get("getCrbUnbillCharges", args);
				
				BigDecimal sumCharges = null;

				if(sumDMO != null && sumDMO.getString().length() > 0){
					try {
						sumCharges = new BigDecimal(sumDMO.getString());
					} catch (NumberFormatException e) {
						throw new EPPIXSeriousException(e.getMessage());
					}
				}else{
					sumCharges = new BigDecimal("0.00");
				}

				return sumCharges;
			}

			public BigDecimal getAccountCreditLimit(String accountNo)
					throws EPPIXSeriousException {
				DAOParamQueryArgs args = new DAOParamQueryArgs("getAccountCreditLimit", 1);
				args.andFilterBy("getAccountCreditLimit").arg(accountNo);

				
				StringDMO sumDMO = (StringDMO) dao.get("getAccountCreditLimit", args);
				
				BigDecimal creditLimit = null;

				if(sumDMO != null && sumDMO.getString().length() > 0){
					try {
						creditLimit = new BigDecimal(sumDMO.getString());
					} catch (NumberFormatException e) {
						throw new EPPIXSeriousException(e.getMessage());
					}
				}else{
					creditLimit = new BigDecimal("0.00");
				}

				return creditLimit;
			}

			public DAOIterator getSubscriberVasServices(Integer subscriberId)
					throws EPPIXSeriousException {
				DAOParamQueryArgs args = new DAOParamQueryArgs("getSubscriberVasServices", 1);
				args.andFilterBy("getSubscriberVasServices").arg(subscriberId);
				
				return (DAOIterator) dao.iterator("getSubscriberVasServices", args);
			}

			public DAOIterator getPshPsdServices(Integer psdPshId)
					throws EPPIXSeriousException {
				DAOParamQueryArgs args = new DAOParamQueryArgs("getPshPsdServices", 1);
				args.andFilterBy("getPshPsdServices").arg(psdPshId);

				return (DAOIterator) dao.iterator("getPshPsdServices", args);
			}

			public DAOIterator getChgNetId(String chgCode)
					throws EPPIXSeriousException {
				DAOParamQueryArgs args = new DAOParamQueryArgs("getChgNetId", 1);
				args.andFilterBy("getChgNetId").arg(chgCode);

				return (DAOIterator) dao.iterator("getChgNetId", args);
			}

			public StringDMO getVstParameterised(String vasServiceCode, Integer subscriberId)
					throws EPPIXSeriousException {
				DAOParamQueryArgs args = new DAOParamQueryArgs("getVstParameterised", 2);
				args.andFilterBy("getVstParameterised").arg(vasServiceCode).arg(subscriberId);

				return (StringDMO) dao.get("getVstParameterised", args);
			}

			public TsTariffServiceDMO getTsTariffService(String packageCode, String serviceCode, String interTariff) throws EPPIXSeriousException {
				DAOParamQueryArgs args = new DAOParamQueryArgs(
						"getTsTariffService", 3);
				args.andFilterBy("getTsTariffService").arg(packageCode).arg(serviceCode).arg(interTariff);
				return (TsTariffServiceDMO) dao.get("getTsTariffService", args);
			}

			public DAOIterator getTsServiceBySubscriber(String accountNo,
					String packageCode, String intTariff)
					throws EPPIXSeriousException {
				DAOParamQueryArgs args = new DAOParamQueryArgs("getTsServiceBySubscriber", 3);
				args.andFilterBy("getTsServiceBySubscriber").arg(accountNo).arg(packageCode).arg(intTariff);

				return (DAOIterator) dao.iterator("getTsServiceBySubscriber", args);
			}

}