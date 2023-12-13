package com.eppixcomm.eppix.base.blo;

import java.util.Iterator;

import org.apache.log4j.Logger;

import com.eppixcomm.eppix.base.dml.AsrAddServReqAbstractDMLFactory;
import com.eppixcomm.eppix.base.error.EPPIXBusinessException;
import com.eppixcomm.eppix.base.error.EPPIXFatalException;
import com.eppixcomm.eppix.base.error.EPPIXUnexpectedException;
import com.eppixcomm.eppix.base.error.Thrower;
import com.eppixcomm.eppix.common.data.DAC;
import com.eppixcomm.eppix.common.data.DAOIterator;
import com.eppixcomm.eppix.common.data.DTOActionTypes;
import com.eppixcomm.eppix.common.util.QueryFilter;

public class AsrAddServReqAbstractBLO extends BaseBLO implements
		DTOActionTypes, BaseMessages {

	/** DOCUMENT ME! */
	static Thrower thrower = Thrower.getThrower(AuxCustomers.class);
	/** DOCUMENT ME! */
	protected static final String ENTITY_ID = "ASR";

	// ~ Instance variables
	// /////////////////////////////////////////////////////

	/** Data Access Controller. */
	protected AsrAddServReqDAC dac;
	/** DOCUMENT ME! */
	protected Logger logger = thrower.getLogger();

	// ==================================================================================================
	
	public void create( AsrAddServReqDMO asrAddServReqDMO ) throws EPPIXBusinessException,
			EPPIXUnexpectedException, EPPIXFatalException {
		logger.debug("create( AsrAddServReqDMO asrAddServReqDMO )");
		
		dac.create(asrAddServReqDMO);

	}
	// ==================================================================================================

	public void modify(QueryFilter filter) throws EPPIXBusinessException,
			EPPIXUnexpectedException, EPPIXFatalException {
		logger.debug("modify( filter )");

		//
		// Modify the asrAddServReqDMO
		//
		dac.modify(filter);
	}

	// ==================================================================================================

	public void delete(QueryFilter filter) throws EPPIXBusinessException,
			EPPIXUnexpectedException, EPPIXFatalException {
		logger.debug("delete( filter )");

		thrower.ifParameterMissing("filter", filter);

		// delete...
		dac.delete(filter);
	}

	// ==================================================================================================

	public boolean exists(QueryFilter filter) throws EPPIXBusinessException,
			EPPIXUnexpectedException, EPPIXFatalException {
		logger.debug("exists(filter)");

		return dac.exists(filter);
	}

	// ==================================================================================================

//	public DAOIterator iterate(QueryFilter filter)
//			throws EPPIXBusinessException, EPPIXUnexpectedException,
//			EPPIXFatalException {
//		logger.debug("iterate( filter )");
//
//		return dac.iterate(filter);
//	}

	public Iterator iterate(QueryFilter filter) throws EPPIXBusinessException,
			EPPIXUnexpectedException, EPPIXFatalException {
		logger.debug("iterate( filter )");

		return (Iterator)dac.iterate(filter);
	}

	// ==================================================================================================

	public DAOIterator iterateWithLock(QueryFilter filter)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("iterateWithLock( filter )");

		return dac.iterateWithLock(filter);
	}

	// ==================================================================================================

	public AsrAddServReqDMO get(QueryFilter filter)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("get( filter )");

		//
		// Check mandatory parameters.
		//
		thrower.ifParameterMissing("filter", filter);

		//
		// Attempt to get the AsrAddServReqDMO
		//
		AsrAddServReqDMO asrAddServReqDMO = dac.get(filter);

		return asrAddServReqDMO;
	}

	// ==================================================================================================

	public Object max(QueryFilter filter) throws EPPIXBusinessException,
			EPPIXUnexpectedException, EPPIXFatalException {
		logger.debug("max( filter )");

		//
		// Check mandatory parameters.
		//
		thrower.ifParameterMissing("filter", filter);

		return dac.max(filter);
	}

	// ==================================================================================================

	public Object min(QueryFilter filter) throws EPPIXBusinessException,
			EPPIXUnexpectedException, EPPIXFatalException {
		logger.debug("min( filter )");

		//
		// Check mandatory parameters.
		//
		thrower.ifParameterMissing("filter", filter);

		return dac.min(filter);
	}

	// ==================================================================================================

	public Integer count(QueryFilter filter) throws EPPIXBusinessException,
			EPPIXUnexpectedException, EPPIXFatalException {
		logger.debug("count( filter )");

		//
		// Check mandatory parameters.
		//
		thrower.ifParameterMissing("filter", filter);

		return Integer.valueOf(dac.count(filter));
	}

	// ==================================================================================================

	protected Class getDACClass() {
		return AsrAddServReqDAC.class;
	}

	protected void setDAC(DAC dac) {
		this.dac = (AsrAddServReqDAC) dac;
	}

}