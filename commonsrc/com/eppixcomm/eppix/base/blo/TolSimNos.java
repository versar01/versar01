package com.eppixcomm.eppix.base.blo;

import com.eppixcomm.eppix.common.data.StringDMO;
import com.eppixcomm.eppix.common.util.QueryFilter;
import com.eppixcomm.eppix.base.error.EPPIXFatalException;
import com.eppixcomm.eppix.base.error.EPPIXSeriousException;

public class TolSimNos extends TolSimNosAbstractBLO {
	
	public StringDMO getUniqueTolSimByMsisdn(QueryFilter filter) throws EPPIXFatalException, EPPIXSeriousException{
		
		return this.tolSimNosDAC.getUniqueTolSimByMsisdn(filter);
		
	}

}
