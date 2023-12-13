package com.eppixcomm.eppix.base.blo;

import com.eppixcomm.eppix.common.core.UserContext;
import com.eppixcomm.eppix.common.data.DAO;
import com.eppixcomm.eppix.common.util.QueryFilter;
import com.eppixcomm.eppix.common.data.DTOList;
import com.eppixcomm.eppix.common.data.DTOListState;
import com.eppixcomm.eppix.base.error.EPPIXSeriousException;

/**
 * 
 * @author sarel.vermeulen
 * Created 3 Dec 2008
 *
 */
public class CuhCustomerHistoryDACImpl 
	extends CuhCustomerHistoryAbstractDACImpl 
	implements CuhCustomerHistoryDAC{

	public CuhCustomerHistoryDACImpl(
	 UserContext userContext,
	    DAO         dao ) {
	    super( userContext, dao );
	}
	
	public CuhCustomerHistoryDACImpl(DAO dao ) {
			    super( dao );
			}

	public DTOList getList(DTOListState state,
			CuhCustomerHistoryDMO CuhCustomerHistoryDMO)
			throws EPPIXSeriousException {
		// TODO Auto-generated method stub
		return null;
	}

	public DTOList getList(DTOListState state, QueryFilter filter)
			throws EPPIXSeriousException {
		// TODO Auto-generated method stub
		return null;
	}
}
