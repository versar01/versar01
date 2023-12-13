package com.eppixcomm.eppix.base.blo;

import java.math.BigDecimal;

import com.eppixcomm.eppix.base.error.EPPIXSeriousException;
import com.eppixcomm.eppix.common.data.DAOIterator;
import com.eppixcomm.eppix.common.data.StringDMO;
import com.eppixcomm.eppix.soa.sharedservices.blo.PshPsdDQO;



public interface GetSULMaxUsageAllowedDAC{


	public BigDecimal getSumSulByAccount(String accountNo)throws EPPIXSeriousException;
	
	public BigDecimal getSumSulBySubscriber(Integer subscriberId)throws EPPIXSeriousException;
	
	public BigDecimal getSumSpulByAccount(String accountNo)throws EPPIXSeriousException;
	
	public BigDecimal getCrbUnbillCharges(String accountNo)throws EPPIXSeriousException;
	
	public BigDecimal getAccountCreditLimit(String accountNo)throws EPPIXSeriousException;
	
	public DAOIterator getSubscriberVasServices(Integer subscriberId)throws EPPIXSeriousException;
	
	public DAOIterator getPshPsdServices(Integer psdPshId)throws EPPIXSeriousException;
	
	public DAOIterator getChgNetId(String chgCode)throws EPPIXSeriousException;
	
	public StringDMO getVstParameterised(String vasServiceCode, Integer subscriberId)throws EPPIXSeriousException;
	
	public TsTariffServiceDMO getTsTariffService(String packageCode, String serviceCode, String interTariff)throws EPPIXSeriousException;

	public DAOIterator getTsServiceBySubscriber(String accountNo, String packageCode, String intTariff)throws EPPIXSeriousException;
	
}