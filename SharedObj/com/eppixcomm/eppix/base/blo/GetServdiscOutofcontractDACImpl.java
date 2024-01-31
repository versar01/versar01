package com.eppixcomm.eppix.base.blo;

import java.math.BigDecimal;

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
import com.eppixcomm.eppix.common.util.DateTime;

public class GetServdiscOutofcontractDACImpl extends DAC implements GetServdiscOutofcontractDAC {
// Globals
	private static DAOThrower thrower = DAOThrower.getDAOThrower(GetServdiscOutofcontractDACImpl.class);
	private Logger logger = thrower.getLogger();

	public GetServdiscOutofcontractDACImpl(DAOThrower thrower, DAO dao) {
		super(dao, thrower);
	}

	public GetServdiscOutofcontractDACImpl(DAO dao) {
		super(dao, thrower);
	}

	@Override
	public BigDecimal percDiscount1(Date endDate, String packageCode,
			String interTariff, String serviceCode)
			throws EPPIXSeriousException {
		DAOParamQueryArgs args = new DAOParamQueryArgs(
				"percDiscount1", 4);
		args.andFilterBy("percDiscount1").arg(endDate).arg(packageCode).arg(interTariff).arg(serviceCode);
		StringDMO sumCharges = (StringDMO) dao.get("percDiscount1", args);
		
		BigDecimal charges = null;

		if(sumCharges != null && sumCharges.getString() != null){
			try {
				charges = new BigDecimal(sumCharges.getString());
			} catch (NumberFormatException e) {
				throw new EPPIXSeriousException(e.getMessage());
			}
		}else{
			charges = new BigDecimal("0.00");
		}

		return charges;
	}

	@Override
	public BigDecimal percDiscount2(Date endDate, String packageCode,
			String interTariff, String serviceCode)
			throws EPPIXSeriousException {
		DAOParamQueryArgs args = new DAOParamQueryArgs(
				"percDiscount2", 4);
		args.andFilterBy("percDiscount2").arg(endDate).arg(packageCode).arg(interTariff).arg(serviceCode);
		StringDMO sumCharges = (StringDMO) dao.get("percDiscount2", args);
		
		BigDecimal charges = null;

		if(sumCharges != null && sumCharges.getString() != null){
			try {
				charges = new BigDecimal(sumCharges.getString());
			} catch (NumberFormatException e) {
				throw new EPPIXSeriousException(e.getMessage());
			}
		}else{
			charges = new BigDecimal("0.00");
		}

		return charges;
	}

	@Override
	public BigDecimal percDiscount3(Date endDate, String packageCode,
			String interTariff, String serviceCode)
			throws EPPIXSeriousException {
		DAOParamQueryArgs args = new DAOParamQueryArgs(
				"percDiscount3", 4);
		args.andFilterBy("percDiscount3").arg(endDate).arg(packageCode).arg(interTariff).arg(serviceCode);
		StringDMO sumCharges = (StringDMO) dao.get("percDiscount3", args);
		
		BigDecimal charges = null;

		if(sumCharges != null && sumCharges.getString() != null){
			try {
				charges = new BigDecimal(sumCharges.getString());
			} catch (NumberFormatException e) {
				throw new EPPIXSeriousException(e.getMessage());
			}
		}else{
			charges = new BigDecimal("0.00");
		}

		return charges;
	}

	@Override
	public BigDecimal fixedDiscount1(Date endDate, String packageCode,
			String interTariff, String serviceCode)
			throws EPPIXSeriousException {
		DAOParamQueryArgs args = new DAOParamQueryArgs(
				"fixedDiscount1", 4);
		args.andFilterBy("fixedDiscount1").arg(endDate).arg(packageCode).arg(interTariff).arg(serviceCode);
		StringDMO sumCharges = (StringDMO) dao.get("fixedDiscount1", args);
		
		BigDecimal charges = null;

		if(sumCharges != null && sumCharges.getString() != null){
			try {
				charges = new BigDecimal(sumCharges.getString());
			} catch (NumberFormatException e) {
				throw new EPPIXSeriousException(e.getMessage());
			}
		}else{
			charges = new BigDecimal("0.00");
		}

		return charges;
	}

	@Override
	public BigDecimal fixedDiscount2(Date endDate, String packageCode,
			String interTariff, String serviceCode)
			throws EPPIXSeriousException {
		DAOParamQueryArgs args = new DAOParamQueryArgs(
				"fixedDiscount2", 4);
		args.andFilterBy("fixedDiscount2").arg(endDate).arg(packageCode).arg(interTariff).arg(serviceCode);
		StringDMO sumCharges = (StringDMO) dao.get("fixedDiscount2", args);
		
		BigDecimal charges = null;

		if(sumCharges != null && sumCharges.getString() != null){
			try {
				charges = new BigDecimal(sumCharges.getString());
			} catch (NumberFormatException e) {
				throw new EPPIXSeriousException(e.getMessage());
			}
		}else{
			charges = new BigDecimal("0.00");
		}

		return charges;
	}

	@Override
	public BigDecimal fixedDiscount3(Date endDate, String packageCode,
			String interTariff, String serviceCode)
			throws EPPIXSeriousException {
		DAOParamQueryArgs args = new DAOParamQueryArgs(
				"fixedDiscount3", 4);
		args.andFilterBy("fixedDiscount3").arg(endDate).arg(packageCode).arg(interTariff).arg(serviceCode);
		StringDMO sumCharges = (StringDMO) dao.get("fixedDiscount3", args);
		
		BigDecimal charges = null;

		if(sumCharges != null && sumCharges.getString() != null){
			try {
				charges = new BigDecimal(sumCharges.getString());
			} catch (NumberFormatException e) {
				throw new EPPIXSeriousException(e.getMessage());
			}
		}else{
			charges = new BigDecimal("0.00");
		}

		return charges;
	}
	
	@Override
	public StringDMO getVatPercentageByCode(String vatCode)
			throws EPPIXSeriousException {
		DAOParamQueryArgs args = new DAOParamQueryArgs(
				"getVatPercentageByCode", 1);
		args.andFilterBy("getVatPercentageByCode").arg(vatCode);
		return (StringDMO) dao.get("getVatPercentageByCode", args);
	}

//	public boolean getActiveSubCount(String accountNo)
//			throws EPPIXSeriousException {
//		DAOParamQueryArgs args = new DAOParamQueryArgs(
//				"getActiveSubCount", 1);
//		args.andFilterBy("getActiveSubCount").arg(accountNo);
//		
//		IntegerDMO count =  (IntegerDMO) dao.get("getActiveSubCount", args);
//		boolean hasActiveSubs = false;
//		logger.debug("\nCOUNT ACTIVE SUBSCRIBERS: " + count.getIntValue());
//		if(count != null && count.getIntValue() > 0){
//			hasActiveSubs = true;
//		}
//		
//		return hasActiveSubs;
//	}

//	public DAOIterator getAuxSbdVamByRsaId(String rsaId, Date fromDate)
//			throws EPPIXSeriousException {
//		DAOParamQueryArgs args = new DAOParamQueryArgs(
//				"getAuxSbdVamByRsaId", 2);
//		args.andFilterBy("getAuxSbdVamByRsaId").arg(rsaId).arg(fromDate);
//		return (DAOIterator) dao.iterator("getAuxSbdVamByRsaId", args);
//	}

//	public DAOIterator getAuxSbdVamByPassPort(String passport, Date fromDate)
//			throws EPPIXSeriousException {
//		DAOParamQueryArgs args = new DAOParamQueryArgs(
//				"getAuxSbdVamByPassPort", 2);
//		args.andFilterBy("getAuxSbdVamByPassPort").arg(passport).arg(fromDate);
//		return (DAOIterator) dao.iterator("getAuxSbdVamByPassPort", args);
//	}
	
	@Override
	public TsTariffServiceDMO getTsTariffService(String packageCode, String serviceCode, String interTariff) throws EPPIXSeriousException {
		DAOParamQueryArgs args = new DAOParamQueryArgs(
				"getTsTariffService", 3);
		args.andFilterBy("getTsTariffService").arg(packageCode).arg(serviceCode).arg(interTariff);
		return (TsTariffServiceDMO) dao.get("getTsTariffService", args);
	}
}