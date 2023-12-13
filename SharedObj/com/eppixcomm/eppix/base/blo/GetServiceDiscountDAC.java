package com.eppixcomm.eppix.base.blo;

import java.math.BigDecimal;

import com.eppixcomm.eppix.base.error.EPPIXSeriousException;
import com.eppixcomm.eppix.common.data.DAOIterator;
import com.eppixcomm.eppix.common.data.StringDMO;
import com.eppixcomm.eppix.common.util.Date;
import com.eppixcomm.eppix.common.util.DateTime;

public interface GetServiceDiscountDAC {
	
	//Percentage Based Discounts
	//=======================================================================================================================
	
	public BigDecimal percDiscount1E(Date endDate, String packageCode, Integer SubscriberId, String interTariff, String serviceCode)throws EPPIXSeriousException;
	
	public BigDecimal percDiscount1(Date endDate, String packageCode, String interTariff, String serviceCode)throws EPPIXSeriousException;
	
	public BigDecimal percDiscount2E(Date endDate, String packageCode, Integer SubscriberId, String interTariff, String serviceCode)throws EPPIXSeriousException;
	
	public BigDecimal percDiscount2(Date endDate, String packageCode, String interTariff, String serviceCode)throws EPPIXSeriousException;
	
	public BigDecimal percDiscount3E(Date endDate, String packageCode, Integer SubscriberId, String interTariff, String serviceCode)throws EPPIXSeriousException;
	
	public BigDecimal percDiscount3(Date endDate, String packageCode, String interTariff, String serviceCode)throws EPPIXSeriousException;
	//End Percentage Based Discounts
	//=======================================================================================================================
	
	//Fixed Charge Based Discount
	//=======================================================================================================================
	
	public BigDecimal fixedDiscount1E(DateTime endDate, String packageCode, Integer SubscriberId, String interTariff, String serviceCode)throws EPPIXSeriousException;
	
	public BigDecimal fixedDiscount1(DateTime endDate, String packageCode, String interTariff, String serviceCode)throws EPPIXSeriousException;
	
	public BigDecimal fixedDiscount2E(DateTime endDate, String packageCode, Integer SubscriberId, String interTariff, String serviceCode)throws EPPIXSeriousException;
	
	public BigDecimal fixedDiscount2(DateTime endDate, String packageCode, String interTariff, String serviceCode)throws EPPIXSeriousException;
	
	public BigDecimal fixedDiscount3E(DateTime endDate, String packageCode, Integer SubscriberId, String interTariff, String serviceCode)throws EPPIXSeriousException;
	
	public BigDecimal fixedDiscount3(DateTime endDate, String packageCode, String interTariff, String serviceCode)throws EPPIXSeriousException;
	//End Fixed Charge Based DiscountBigDecimal
	//=======================================================================================================================
	
	public StringDMO getVatPercentageByCode(String vatCode)throws EPPIXSeriousException;
	
	public boolean getActiveSubCount(String accountNo)throws EPPIXSeriousException;
	
	public DAOIterator getAuxSbdVamByRsaId(String rsaId, Date fromDate)throws EPPIXSeriousException;
	
	public DAOIterator getAuxSbdVamByPassPort(String passport, Date fromDate)throws EPPIXSeriousException;
	
	public TsTariffServiceDMO getTsTariffService(String packageCode, String serviceCode, String interTariff)throws EPPIXSeriousException;
	

}
