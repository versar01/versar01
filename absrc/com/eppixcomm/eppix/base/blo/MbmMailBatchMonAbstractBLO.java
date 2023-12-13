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
import com.eppixcomm.eppix.common.data.IntegerDMO;
import com.eppixcomm.eppix.common.util.FilterOp;
import com.eppixcomm.eppix.common.util.QueryFilter;

public class MbmMailBatchMonAbstractBLO extends BaseBLO implements
		DTOActionTypes, BaseMessages {

	static Thrower thrower = Thrower
			.getThrower(MbmMailBatchMonAbstractBLO.class);

	protected static final String ENTITY_ID = "EM";

	/** Data Access Controller. */
	protected MbmMailBatchMonDAC mbmMailBatchMonDAC;
	/** DOCUMENT ME! */
	protected Logger logger = thrower.getLogger();

	/** Invoked by the BLOBinder to provide this BLO with its DAC. */
	protected void setDAC(DAC dac) {
		this.mbmMailBatchMonDAC = (MbmMailBatchMonDAC) dac;
	}

	protected Class getDACClass() {
		return MbmMailBatchMonDAC.class;
	}

	public MbmMailBatchMonDMO get(MbmMailBatchMonDMO mbmMailBatchMonDMO)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("get(mbmMailBatchMonDMO)");

		//
		// Check mandatory parameters.
		//
		thrower.ifParameterMissing("mbmMailBatchMonDMO", mbmMailBatchMonDMO);

		//
		// Each attribute that is part of the primary key is mandatory
		//
		thrower.ifParameterMissing("mbmMailBatchMonDMO.mbmId",
				mbmMailBatchMonDMO.getMbmId());

		//
		// Attempt to get the MbmMailBatchMonDMO
		//
				
		QueryFilter filter = new QueryFilter();
		filter.add(FilterOp.EQUAL, MbmMailBatchMonDMO.mbmIdFilter, mbmMailBatchMonDMO.getMbmId());
		
		MbmMailBatchMonDMO returnMbmMailBatchMonDMO = mbmMailBatchMonDAC
				.get(filter);
		
		//
		// Could not find the MbmMailBatchMonDMO
		//
		if (returnMbmMailBatchMonDMO == null) {
			thrower.business(Base_MBMMAILBATCHMON_000,
					new Object[] { mbmMailBatchMonDMO.getMbmId() });
		}

		//
		// Now, based on the values of the flags on this method signature, which
		// in turn,
		// are based on this objects associations, get all associated, embedded
		// objects
		//
		return returnMbmMailBatchMonDMO;
	}

	// ==================================================================================================

	public DTOList getList(DTOListState state,
			MbmMailBatchMonDMO mbmMailBatchMonDMO)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("getList( state, mbmMailBatchMonDMO )");

		return mbmMailBatchMonDAC.getList(state, mbmMailBatchMonDMO);
	}

	public MbmMailBatchMonDMO create(MbmMailBatchMonDMO mbmMailBatchMonDMO)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("create( mbmMailBatchMonDMO )");

		thrower.ifParameterMissing("mbmMailBatchMonDMO", mbmMailBatchMonDMO);
		thrower.ifParameterMissing("mbmMailBatchMonDMO.mbmId",
				mbmMailBatchMonDMO.getMbmId());

		//
		// Check that this object does not already exist
		//
		if (exists(mbmMailBatchMonDMO)) {
			thrower.business(Base_MBMMAILBATCHMON_001,
					new Object[] { mbmMailBatchMonDMO.getMbmId() });
		}

		//
		// Now create the record
		//
		mbmMailBatchMonDAC.create(mbmMailBatchMonDMO);
		
		Integer serial = null;
		
		QueryFilter filter = new QueryFilter();
		filter.add(FilterOp.MAX, MbmMailBatchMonDMO.mbmIdFilter);
		
		serial = (Integer)this.max(filter);
		
		filter = new QueryFilter();
		filter.add(FilterOp.EQUAL, MbmMailBatchMonDMO.mbmIdFilter,serial);
		
		mbmMailBatchMonDMO = this.get(filter);

		return mbmMailBatchMonDMO;
	}

	public MbmMailBatchMonDMO modify(MbmMailBatchMonDMO mbmMailBatchMonDMO)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("modify( ambmMailBatchMonDMO )");

		//
		// Check mandatory parameters (
		//
		// Note: attributes stereotyped <NotModifiable> are ignored
		//
		thrower.ifParameterMissing("mbmMailBatchMonDMO", mbmMailBatchMonDMO);
		thrower.ifParameterMissing("mbmMailBatchMonDMO.mbmId",
				mbmMailBatchMonDMO.getMbmId());

		MbmMailBatchMonDMO updateMbmMailBatchMonDMO = new MbmMailBatchMonDMO();

		updateMbmMailBatchMonDMO.setMbmId(mbmMailBatchMonDMO
				.getMbmId());

		updateMbmMailBatchMonDMO = get(updateMbmMailBatchMonDMO);

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
		filter.add(FilterOp.SET, MbmMailBatchMonDMO.mbmProgramNameFilter, mbmMailBatchMonDMO.getMbmProgramName());
		filter.add(FilterOp.SET, MbmMailBatchMonDMO.mbmStartDateFilter, mbmMailBatchMonDMO.getMbmStartDate());
		filter.add(FilterOp.SET, MbmMailBatchMonDMO.mbmEndDateFilter, mbmMailBatchMonDMO.getMbmEndDate());
		filter.add(FilterOp.SET, MbmMailBatchMonDMO.mbmTimestampFilter, mbmMailBatchMonDMO.getMbmTimestamp());
		filter.add(FilterOp.EQUAL, MbmMailBatchMonDMO.mbmIdFilter, mbmMailBatchMonDMO.getMbmId());

		//
		// Modify the mbmMailBatchMonDMO
		//
		mbmMailBatchMonDAC.modify(filter);

		// Create a new MbmMailBatchMonDMO, set keys, and fetch from the
		// database...
		MbmMailBatchMonDMO returnMbmMailBatchMonDMO = new MbmMailBatchMonDMO();

		returnMbmMailBatchMonDMO.setMbmId(updateMbmMailBatchMonDMO
				.getMbmId());

		returnMbmMailBatchMonDMO = get(returnMbmMailBatchMonDMO);

		return returnMbmMailBatchMonDMO;
	}

	// ==================================================================================================

	public void modify(QueryFilter filter) throws EPPIXBusinessException,
			EPPIXUnexpectedException, EPPIXFatalException {
		logger.debug("modify( filter )");

		//
		// Modify the mbmMailBatchMonDMO
		//
		mbmMailBatchMonDAC.modify(filter);
	}

	// ==================================================================================================

	public void delete(MbmMailBatchMonDMO mbmMailBatchMonDMO)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("delete( mbmMailBatchMonDMO )");

		thrower.ifParameterMissing("mbmMailBatchMonDMO", mbmMailBatchMonDMO);

		MbmMailBatchMonDMO updateMbmMailBatchMonDMO = null;

		updateMbmMailBatchMonDMO = get(mbmMailBatchMonDMO);

		// delete self...
		mbmMailBatchMonDAC.delete(mbmMailBatchMonDMO);
	}

	// ==================================================================================================

	public void delete(QueryFilter filter) throws EPPIXBusinessException,
			EPPIXUnexpectedException, EPPIXFatalException {
		logger.debug("delete( filter )");

		thrower.ifParameterMissing("filter", filter);

		// delete...
		mbmMailBatchMonDAC.delete(filter);
	}

	// ==================================================================================================

	public boolean exists(MbmMailBatchMonDMO mbmMailBatchMonDMO)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("exists(mbmMailBatchMonDMO)");

		thrower.ifParameterMissing("mbmMailBatchMonDMO", mbmMailBatchMonDMO);

		thrower.ifParameterMissing("mbmMailBatchMonDMO.mbmId",
				mbmMailBatchMonDMO.getMbmId());

		return mbmMailBatchMonDAC.exists(mbmMailBatchMonDMO);
	}

	// ==================================================================================================

	public boolean exists(QueryFilter filter) throws EPPIXBusinessException,
			EPPIXUnexpectedException, EPPIXFatalException {
		logger.debug("exists(filter)");

		return mbmMailBatchMonDAC.exists(filter);
	}

	// ==================================================================================================

	public DTOList getList(DTOListState state, QueryFilter filter)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("getList( state, filter )");

		return mbmMailBatchMonDAC.getList(state, filter);
	}

	// ==================================================================================================

	public DAOIterator iterate(QueryFilter filter)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("iterateWithLock( filter )");

		return mbmMailBatchMonDAC.iterate(filter);
	}

	// ==================================================================================================

	public DAOIterator iterateWithLock(QueryFilter filter)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("iterateWithLock( filter )");

		return mbmMailBatchMonDAC.iterateWithLock(filter);
	}

	// ==================================================================================================

	public MbmMailBatchMonDMO get(QueryFilter filter)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("get( filter )");

		//
		// Check mandatory parameters.
		//
		thrower.ifParameterMissing("filter", filter);

		//
		// Attempt to get the MbmMailBatchMonDMO
		//
		MbmMailBatchMonDMO mbmMailBatchMonDMO = mbmMailBatchMonDAC.get(filter);

		return mbmMailBatchMonDMO;
	}

	// ==================================================================================================

	public Object max(QueryFilter filter) throws EPPIXBusinessException,
			EPPIXUnexpectedException, EPPIXFatalException {
		logger.debug("max( filter )");

		//
		// Check mandatory parameters.
		//
		thrower.ifParameterMissing("filter", filter);

		return mbmMailBatchMonDAC.max(filter);
	}

	// ==================================================================================================

	public Object min(QueryFilter filter) throws EPPIXBusinessException,
			EPPIXUnexpectedException, EPPIXFatalException {
		logger.debug("min( filter )");

		//
		// Check mandatory parameters.
		//
		thrower.ifParameterMissing("filter", filter);

		return mbmMailBatchMonDAC.min(filter);
	}

	// ==================================================================================================

	public Integer count(QueryFilter filter) throws EPPIXBusinessException,
			EPPIXUnexpectedException, EPPIXFatalException {
		logger.debug("count( filter )");

		//
		// Check mandatory parameters.
		//
		thrower.ifParameterMissing("filter", filter);

		return Integer.valueOf(mbmMailBatchMonDAC.count(filter));
	}
	// ==================================================================================================

}