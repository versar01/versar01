package com.eppixcomm.eppix.base.blo;

import org.apache.log4j.Logger;

import com.eppixcomm.eppix.base.error.EPPIXBusinessException;
import com.eppixcomm.eppix.base.error.EPPIXFatalException;
import com.eppixcomm.eppix.base.error.EPPIXUnexpectedException;
import com.eppixcomm.eppix.base.error.Thrower;
import com.eppixcomm.eppix.common.data.DAC;
import com.eppixcomm.eppix.common.data.DAOIterator;
import com.eppixcomm.eppix.common.data.DTOActionTypes;
import com.eppixcomm.eppix.common.data.DTOList;
import com.eppixcomm.eppix.common.data.DTOListState;
import com.eppixcomm.eppix.common.util.FilterOp;
import com.eppixcomm.eppix.common.util.QueryFilter;

public class SbhsSplitBillHsAbstractBLO extends BaseBLO implements
		DTOActionTypes, BaseMessages {

	static Thrower thrower = Thrower
			.getThrower(SbhsSplitBillHsAbstractBLO.class);

	protected static final String ENTITY_ID = "SBHS";

	/** Data Access Controller. */
	protected SbhsSplitBillHsDAC sbhsSplitBillHsDAC;
	/** DOCUMENT ME! */
	protected Logger logger = thrower.getLogger();

	/** Invoked by the BLOBinder to provide this BLO with its DAC. */
	protected void setDAC(DAC dac) {
		this.sbhsSplitBillHsDAC = (SbhsSplitBillHsDAC) dac;
	}

	protected Class getDACClass() {
		return SbhsSplitBillHsDAC.class;
	}

	public SbhsSplitBillHsDMO get(SbhsSplitBillHsDMO sbhsSplitBillHsDMO)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("get(sbhsSplitBillHsDMO)");

		//
		// Check mandatory parameters.
		//
		thrower.ifParameterMissing("sbhsSplitBillHsDMO", sbhsSplitBillHsDMO);

		//
		// Each attribute that is part of the primary key is mandatory
		//
		thrower.ifParameterMissing("sbhsSplitBillHsDMO.sbhsSbId",
				sbhsSplitBillHsDMO.getSbhsSbId());

		//
		// Attempt to get the SbhsSplitBillHsDMO
		//
		QueryFilter filter = new QueryFilter();
		filter.add(FilterOp.EQUAL, SbhsSplitBillHsDMO.SbhsSbIdFilter, sbhsSplitBillHsDMO.getSbhsSbId());
		
		SbhsSplitBillHsDMO returnSbhsSplitBillHsDMO = sbhsSplitBillHsDAC.get(filter);

		//
		// Could not find the SbhsSplitBillHsDMO
		//
		if (returnSbhsSplitBillHsDMO == null) {
			thrower.business(Base_SBHSSPLITBILLHSlOOKUP_000,
					new Object[] { sbhsSplitBillHsDMO.getSbhsSbId() });
		}

		//
		// Now, based on the values of the flags on this method signature, which
		// in turn,
		// are based on this objects associations, get all associated, embedded
		// objects
		//
		return returnSbhsSplitBillHsDMO;
	}

	// ==================================================================================================

	public DTOList getList(DTOListState state,
			SbhsSplitBillHsDMO sbhsSplitBillHsDMO)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("getList( state, sbhsSplitBillHsDMO )");

		return sbhsSplitBillHsDAC.getList(state, sbhsSplitBillHsDMO);
	}

	public SbhsSplitBillHsDMO create(SbhsSplitBillHsDMO sbhsSplitBillHsDMO)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("create( sbhsSplitBillHsDMO )");

		thrower.ifParameterMissing("sbhsSplitBillHsDMO", sbhsSplitBillHsDMO);
		thrower.ifParameterMissing("sbhsSplitBillHsDMO.sbhsSbId",
				sbhsSplitBillHsDMO.getSbhsSbId());

		//
		// Check that this object does not already exist
		//
		if (exists(sbhsSplitBillHsDMO)) {
			thrower.business(Base_SBHSSPLITBILLHSlOOKUP_001,
					new Object[] { sbhsSplitBillHsDMO.getSbhsSbId() });
		}

		//
		// Now create the record
		//
		sbhsSplitBillHsDAC.create(sbhsSplitBillHsDMO);

		return sbhsSplitBillHsDMO;
	}

	public SbhsSplitBillHsDMO modify(SbhsSplitBillHsDMO sbhsSplitBillHsDMO)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("modify( asbhsSplitBillHsDMO )");

		//
		// Check mandatory parameters (
		//
		// Note: attributes stereotyped <NotModifiable> are ignored
		//
		thrower.ifParameterMissing("sbhsSplitBillHsDMO", sbhsSplitBillHsDMO);
		thrower.ifParameterMissing("sbhsSplitBillHsDMO.sbhsSbId",
				sbhsSplitBillHsDMO.getSbhsSbId());

		//
		// For each relationship to single objects (does not matter if they are
		// Embedded or Flattened)
		// either associate to a pre-existing object, or create an object then
		// associate to it
		//

		//
		// Copy the fields to be updated. We do not want to overwrite primary
		// keys etc.
		// All attributes stereotyped as being <NotModifiable> are skipped
		//

		
		QueryFilter filter = new QueryFilter();
		filter.add(FilterOp.SET, SbhsSplitBillHsDMO.SbhsDateFilter, sbhsSplitBillHsDMO.getSbhsDate());
		filter.add(FilterOp.SET, SbhsSplitBillHsDMO.SbhsNewValFilter, sbhsSplitBillHsDMO.getSbhsNewVal());
		filter.add(FilterOp.SET, SbhsSplitBillHsDMO.SbhsOldValFilter, sbhsSplitBillHsDMO.getSbhsOldVal());
		filter.add(FilterOp.SET, SbhsSplitBillHsDMO.SbhsReasonFilter, sbhsSplitBillHsDMO.getSbhsReason());
		filter.add(FilterOp.SET, SbhsSplitBillHsDMO.SbhsUserIdFilter, sbhsSplitBillHsDMO.getSbhsUserId());
		filter.add(FilterOp.EQUAL, SbhsSplitBillHsDMO.SbhsSbIdFilter, sbhsSplitBillHsDMO.getSbhsSbId());

		//
		// Modify the sbhsSplitBillHsDMO
		//
		sbhsSplitBillHsDAC.modify(filter);

		// Create a new SbhsSplitBillHsDMO, set keys, and fetch from the
		// database...
		SbhsSplitBillHsDMO returnSbhsSplitBillHsDMO = new SbhsSplitBillHsDMO();

		returnSbhsSplitBillHsDMO = get(sbhsSplitBillHsDMO);

		return returnSbhsSplitBillHsDMO;
	}

	// ==================================================================================================

	public void modify(QueryFilter filter) throws EPPIXBusinessException,
			EPPIXUnexpectedException, EPPIXFatalException {
		logger.debug("modify( filter )");

		//
		// Modify the sbhsSplitBillHsDMO
		//
		sbhsSplitBillHsDAC.modify(filter);
	}

	// ==================================================================================================

	public void delete(SbhsSplitBillHsDMO sbhsSplitBillHsDMO)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("delete( sbhsSplitBillHsDMO )");

		thrower.ifParameterMissing("sbhsSplitBillHsDMO", sbhsSplitBillHsDMO);

		QueryFilter filter = new QueryFilter();
		filter.add(FilterOp.EQUAL, SbhsSplitBillHsDMO.SbhsSbIdFilter, sbhsSplitBillHsDMO.getSbhsSbId());

		// delete self...
		sbhsSplitBillHsDAC.delete(filter);
	}

	// ==================================================================================================

	public void delete(QueryFilter filter) throws EPPIXBusinessException,
			EPPIXUnexpectedException, EPPIXFatalException {
		logger.debug("delete( filter )");

		thrower.ifParameterMissing("filter", filter);

		// delete...
		sbhsSplitBillHsDAC.delete(filter);
	}

	// ==================================================================================================

	public boolean exists(SbhsSplitBillHsDMO sbhsSplitBillHsDMO)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("exists(sbhsSplitBillHsDMO)");

		thrower.ifParameterMissing("sbhsSplitBillHsDMO", sbhsSplitBillHsDMO);

		thrower.ifParameterMissing("sbhsSplitBillHsDMO.sbhsSbId",
				sbhsSplitBillHsDMO.getSbhsSbId());
		
		QueryFilter filter = new QueryFilter();
		filter.add(FilterOp.EQUAL, SbhsSplitBillHsDMO.SbhsSbIdFilter, sbhsSplitBillHsDMO.getSbhsSbId());

		return sbhsSplitBillHsDAC.exists(filter);
	}

	// ==================================================================================================

	public boolean exists(QueryFilter filter) throws EPPIXBusinessException,
			EPPIXUnexpectedException, EPPIXFatalException {
		logger.debug("exists(filter)");

		return sbhsSplitBillHsDAC.exists(filter);
	}

	// ==================================================================================================

	public DTOList getList(DTOListState state, QueryFilter filter)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("getList( state, filter )");

		return sbhsSplitBillHsDAC.getList(state, filter);
	}

	// ==================================================================================================

	public DAOIterator iterate(QueryFilter filter)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("iterateWithLock( filter )");

		return sbhsSplitBillHsDAC.iterate(filter);
	}

	// ==================================================================================================

	public DAOIterator iterateWithLock(QueryFilter filter)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("iterateWithLock( filter )");

		return sbhsSplitBillHsDAC.iterateWithLock(filter);
	}

	// ==================================================================================================

	public SbhsSplitBillHsDMO get(QueryFilter filter)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("get( filter )");

		//
		// Check mandatory parameters.
		//
		thrower.ifParameterMissing("filter", filter);

		//
		// Attempt to get the SbhsSplitBillHsDMO
		//
		SbhsSplitBillHsDMO sbhsSplitBillHsDMO = sbhsSplitBillHsDAC.get(filter);

		return sbhsSplitBillHsDMO;
	}

	// ==================================================================================================

	public Object max(QueryFilter filter) throws EPPIXBusinessException,
			EPPIXUnexpectedException, EPPIXFatalException {
		logger.debug("max( filter )");

		//
		// Check mandatory parameters.
		//
		thrower.ifParameterMissing("filter", filter);

		return sbhsSplitBillHsDAC.max(filter);
	}

	// ==================================================================================================

	public Object min(QueryFilter filter) throws EPPIXBusinessException,
			EPPIXUnexpectedException, EPPIXFatalException {
		logger.debug("min( filter )");

		//
		// Check mandatory parameters.
		//
		thrower.ifParameterMissing("filter", filter);

		return sbhsSplitBillHsDAC.min(filter);
	}

	// ==================================================================================================

	public Integer count(QueryFilter filter) throws EPPIXBusinessException,
			EPPIXUnexpectedException, EPPIXFatalException {
		logger.debug("count( filter )");

		//
		// Check mandatory parameters.
		//
		thrower.ifParameterMissing("filter", filter);

		return Integer.valueOf(sbhsSplitBillHsDAC.count(filter));
	}
	// ==================================================================================================

}