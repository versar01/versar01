package com.eppixcomm.eppix.base.blo;

import java.math.BigDecimal;

import com.eppixcomm.eppix.base.error.EPPIXSeriousException;
import com.eppixcomm.eppix.common.data.DAOIterator;
import com.eppixcomm.eppix.common.data.IntegerDMO;
import com.eppixcomm.eppix.common.data.StringDMO;

public interface EppixDeviceInsPlatformDAC {
	
	public StringDMO getSumSpulByAccount(String accountNo)throws EPPIXSeriousException;
	
	public BigDecimal getSumAccountSubsciptionCharges(String accountNo)throws EPPIXSeriousException;
	
	public BigDecimal getSumAccountParamCharges(String accountNo)throws EPPIXSeriousException;
	
	public BigDecimal getSumSpulBySubscriber(Integer subscriberID)throws EPPIXSeriousException;
	
	public IntegerDMO getCountINSUFromVcf(Integer subscriberId)throws EPPIXSeriousException;
	
	public VcfVrbleChrgFeeDMO getSubscriberVcfCharges(String imei)throws EPPIXSeriousException;
	
	public BigDecimal getSumSubscriberVcfCharges(String accountNo)throws EPPIXSeriousException;
	
	public VcfVrbleChrgFeeDMO getVcfSubscriberInsDevice(Integer subscriberId, String policyRef, String uniqueDeviseId)throws EPPIXSeriousException;
	
	public VcfVrbleChrgFeeDMO getVcfSubscriberInsDeviceOld(Integer subscriberId, String uniqueEquiptId)throws EPPIXSeriousException;
	
	public DAOIterator getVcfUniqueInsurancePol(String policyRef)throws EPPIXSeriousException;

}