package com.eppixcomm.eppix.base.blo;

import com.eppixcomm.eppix.common.data.StringDMO;
import com.eppixcomm.eppix.common.util.QueryFilter;
import com.eppixcomm.eppix.common.data.DTOList;
import com.eppixcomm.eppix.common.data.DTOListState;
import com.eppixcomm.eppix.base.error.EPPIXFatalException;
import com.eppixcomm.eppix.base.error.EPPIXSeriousException;

public interface TolSimNosDAC extends TolSimNosAbstractDAC{
	
	public StringDMO getUniqueTolSimByMsisdn(QueryFilter filter) throws EPPIXFatalException, EPPIXSeriousException ;

}
