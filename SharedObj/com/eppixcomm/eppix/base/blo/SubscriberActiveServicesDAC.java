package com.eppixcomm.eppix.base.blo;

import com.eppixcomm.eppix.base.error.EPPIXSeriousException;
import com.eppixcomm.eppix.common.data.IntegerDMO;
import com.eppixcomm.eppix.common.data.StringDMO;

public interface SubscriberActiveServicesDAC {
	
	public StringDMO getLastInvoiceDate(String accountNo)throws EPPIXSeriousException;
	
	public boolean isConverged(Integer subscriberId)throws EPPIXSeriousException;
	
	public IntegerDMO getCountDepositRule(String packagecode, String serviceCode)throws EPPIXSeriousException;
}
