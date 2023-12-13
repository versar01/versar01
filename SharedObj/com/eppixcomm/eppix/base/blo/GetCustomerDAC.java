package com.eppixcomm.eppix.base.blo;

import java.math.BigDecimal;

import com.eppixcomm.eppix.base.error.EPPIXSeriousException;
import com.eppixcomm.eppix.common.data.StringDMO;
import com.eppixcomm.eppix.soa.sharedservices.blo.AulAccUpLowlmtDMO;
import com.eppixcomm.eppix.soa.sharedservices.blo.CviCrmValueIndDMO;
import com.eppixcomm.eppix.soa.sharedservices.blo.DccCreditClassesDMO;
import com.eppixcomm.eppix.soa.sharedservices.blo.ErbEpxRskBndDMO;
import com.eppixcomm.eppix.soa.sharedservices.blo.UdvUserdocDelivTtDqo;

public interface GetCustomerDAC{

public AulAccUpLowlmtDMO getAul(String accountNo)throws EPPIXSeriousException;

public BigDecimal getAccountBalance(String accountNo)throws EPPIXSeriousException;

public DccCreditClassesDMO getDccCreditClass(String classId)throws EPPIXSeriousException;

public BigDecimal getCdeTotalSum(String account)throws EPPIXSeriousException;

public BigDecimal getPendingSum(String account)throws EPPIXSeriousException;

public CviCrmValueIndDMO getCviAcv(String account)throws EPPIXSeriousException;

public ErbEpxRskBndDMO getRiskBandById(Integer riskId)throws EPPIXSeriousException;

public ErbEpxRskBndDMO getRiskBandByText(String text)throws EPPIXSeriousException;

public UdvUserdocDelivTtDqo getUdvTT(String docType, String accountNo)throws EPPIXSeriousException;

public void insertUserHistory(String login, String hCode, String comment, String terminal)throws EPPIXSeriousException;

public StringDMO getCdeLastStatus(String accountNo)throws EPPIXSeriousException;

}