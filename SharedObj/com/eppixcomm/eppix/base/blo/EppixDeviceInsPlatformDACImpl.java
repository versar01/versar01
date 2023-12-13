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
import com.eppixcomm.eppix.soa.sharedservices.blo.HhHierarchyHeadDMO;

public class EppixDeviceInsPlatformDACImpl extends DAC implements EppixDeviceInsPlatformDAC{
	// Globals
	private static DAOThrower thrower = DAOThrower
			.getDAOThrower(EppixDeviceInsPlatformDACImpl.class);
	private Logger logger = thrower.getLogger();

	public EppixDeviceInsPlatformDACImpl(DAOThrower thrower, DAO dao) {
		super(dao, thrower);
	}
	
	public EppixDeviceInsPlatformDACImpl(DAO dao) {
		super(dao, thrower);
	}

	public StringDMO getSumSpulByAccount(String accountNo)
			throws EPPIXSeriousException {
		DAOParamQueryArgs args = new DAOParamQueryArgs("getSumSpulByAccount", 1);
		args.andFilterBy("getSumSpulByAccount").arg(accountNo);

		return (StringDMO) dao.get("getSumSpulByAccount", args);
	}

	public BigDecimal getSumAccountSubsciptionCharges(String accountNo)
			throws EPPIXSeriousException {
		DAOParamQueryArgs args = new DAOParamQueryArgs("getSumAccountSubsciptionCharges", 1);
		args.andFilterBy("getSumAccountSubsciptionCharges").arg(accountNo);
		StringDMO sumCharges = (StringDMO) dao.get("getSumAccountSubsciptionCharges", args);
		
		logger.debug("\nSUM CHARGES: " + sumCharges);

		BigDecimal charges = null;

		if(sumCharges != null && (sumCharges.getString() != null && sumCharges.getString().length() > 0)){
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

	public BigDecimal getSumAccountParamCharges(String accountNo)
			throws EPPIXSeriousException {
		DAOParamQueryArgs args = new DAOParamQueryArgs("getSumAccountParamCharges", 1);
		args.andFilterBy("getSumAccountParamCharges").arg(accountNo);
		StringDMO sumCharges = (StringDMO) dao.get("getSumAccountParamCharges", args);

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

	public BigDecimal getSumSpulBySubscriber(Integer subscriberID)
			throws EPPIXSeriousException {
		DAOParamQueryArgs args = new DAOParamQueryArgs("getSumSpulBySubscriber", 1);
		args.andFilterBy("getSumSpulBySubscriber").arg(subscriberID);

		StringDMO sumCharges = (StringDMO) dao.get("getSumSpulBySubscriber", args);

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

	public IntegerDMO getCountINSUFromVcf(Integer subscriberId)
			throws EPPIXSeriousException {
		
		DAOParamQueryArgs args = new DAOParamQueryArgs("getCountINSUFromVcf", 1);
		args.andFilterBy("getCountINSUFromVcf").arg(subscriberId);

		return (IntegerDMO) dao.get("getCountINSUFromVcf", args);
	}

	public VcfVrbleChrgFeeDMO getSubscriberVcfCharges(String imei)
			throws EPPIXSeriousException {
		DAOParamQueryArgs args = new DAOParamQueryArgs("getSubscriberVcfCharges", 1);
		args.andFilterBy("getSubscriberVcfCharges").arg(imei);

		return (VcfVrbleChrgFeeDMO) dao.get("getSubscriberVcfCharges", args);

	}

	public VcfVrbleChrgFeeDMO getVcfSubscriberInsDevice(Integer subscriberId,
			String policyRef, String uniqueDeviseId) throws EPPIXSeriousException {
		DAOParamQueryArgs args = new DAOParamQueryArgs("getVcfSubscriberInsDevice", 3);
		args.andFilterBy("getVcfSubscriberInsDevice").arg(subscriberId).arg(policyRef).arg(uniqueDeviseId);

		return (VcfVrbleChrgFeeDMO) dao.get("getVcfSubscriberInsDevice", args);
	}

	public BigDecimal getSumSubscriberVcfCharges(String accountNo)
			throws EPPIXSeriousException {
		DAOParamQueryArgs args = new DAOParamQueryArgs("getSumSubscriberVcfCharges", 1);
		args.andFilterBy("getSumSubscriberVcfCharges").arg(accountNo);
		StringDMO sumCharges = (StringDMO) dao.get("getSumSubscriberVcfCharges", args);

		BigDecimal charges = null;
		
		if(sumCharges == null || sumCharges.getString() == null){
			charges = new BigDecimal("0.00");
		}else{
			if(sumCharges != null && sumCharges.getString().length() > 0){
				try {
					charges = new BigDecimal(sumCharges.getString());
				} catch (NumberFormatException e) {
					throw new EPPIXSeriousException(e.getMessage());
				}
			}else{
				charges = new BigDecimal("0.00");
			}
		}

		return charges;
	}

	public VcfVrbleChrgFeeDMO getVcfSubscriberInsDeviceOld(Integer subscriberId,
			String uniqueEquiptId) throws EPPIXSeriousException {
		DAOParamQueryArgs args = new DAOParamQueryArgs("getVcfSubscriberInsDeviceOld", 3);
		args.andFilterBy("getVcfSubscriberInsDeviceOld").arg(subscriberId).arg(uniqueEquiptId).arg(uniqueEquiptId);

		return (VcfVrbleChrgFeeDMO) dao.get("getVcfSubscriberInsDeviceOld", args);
	}

	public DAOIterator getVcfUniqueInsurancePol(String policyRef)
			throws EPPIXSeriousException {
		DAOParamQueryArgs args = new DAOParamQueryArgs("getVcfUniqueInsurancePol", 1);
		args.andFilterBy("getVcfUniqueInsurancePol").arg(policyRef);

		return (DAOIterator) dao.iterator("getVcfUniqueInsurancePol", args);
	}
	
//	public DAOIterator getCustomerVasServiceAll(String accountNo)
//			throws EPPIXSeriousException {
//		DAOParamQueryArgs args = new DAOParamQueryArgs("getCustomerVasServiceAll", 1);
//		args.andFilterBy("getCustomerVasServiceAll").arg(accountNo);
//		return (DAOIterator) dao.iterator("getCustomerVasServiceAll", args);
//	}
}
