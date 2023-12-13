package com.eppixcomm.eppix.base.blo;

import com.eppixcomm.eppix.common.data.DAO;
import com.eppixcomm.eppix.common.data.DAOParamQueryArgs;
import com.eppixcomm.eppix.common.data.DAOThrower;
import com.eppixcomm.eppix.common.data.StringDMO;
import com.eppixcomm.eppix.common.util.QueryFilter;
import com.eppixcomm.eppix.base.error.EPPIXFatalException;
import com.eppixcomm.eppix.base.error.EPPIXSeriousException;

public class TolSimNosDACImpl extends TolSimNosAbstractDACImpl
implements TolSimNosDAC {

	/** Error handler/logger. */
	  static DAOThrower thrower = DAOThrower.getDAOThrower( TolSimNosDACImpl.class );

	public TolSimNosDACImpl(DAO dao, DAOThrower thrower) {
		super(dao, thrower);
		// TODO Auto-generated constructor stub
	}
	
	public TolSimNosDACImpl(DAO dao) {
		super(dao, thrower);
	}

	public StringDMO getUniqueTolSimByMsisdn(QueryFilter filter) throws EPPIXFatalException, EPPIXSeriousException {
		if(logger.isDebugEnabled()){
			logger.debug("getUniqueTolSimByMsisdn(String msisdn)");

		}
				
		thrower.ifParameterMissing("filter", filter);		
	    DAOParamQueryArgs args = this.filterQueryArgs( filter, null );
	    
	    return (StringDMO) dao.get("getUniqueTolSimByMsisdn", args );
	}
}
