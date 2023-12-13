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
import com.eppixcomm.eppix.common.util.QueryFilter;

public class SulSubUseLimitAbstractBLO extends BaseBLO implements
		DTOActionTypes, BaseMessages {

	static Thrower thrower = Thrower
			.getThrower(SulSubUseLimitAbstractBLO.class);

	protected static final String ENTITY_ID = "FS";

	/** Data Access Controller. */
	protected SulSubUseLimitDAC SulSubUseLimitDAC;
	/** DOCUMENT ME! */
	protected Logger logger = thrower.getLogger();

	/** Invoked by the BLOBinder to provide this BLO with its DAC. */
	protected void setDAC(DAC dac) {
		this.SulSubUseLimitDAC = (SulSubUseLimitDAC) dac;
	}

	protected Class getDACClass() {
		return SulSubUseLimitDAC.class;
	}

//	public SulSubUseLimitDMO get(SulSubUseLimitDMO SulSubUseLimitDMO)
//			throws EPPIXBusinessException, EPPIXUnexpectedException,
//			EPPIXFatalException {
//		logger.debug("get(SulSubUseLimitDMO)");
//
//		//
//		// Check mandatory parameters.
//		//
//		thrower.ifParameterMissing("SulSubUseLimitDMO", SulSubUseLimitDMO);
//
//		//
//		// Each attribute that is part of the primary key is mandatory
//		//
//		thrower.ifParameterMissing("SulSubUseLimitDMO.actAccId",
//				SulSubUseLimitDMO.getDpfFolderId());
//
//		//
//		// Attempt to get the SulSubUseLimitDMO
//		//
//		SulSubUseLimitDMO returnSulSubUseLimitDMO = SulSubUseLimitDAC
//				.get(SulSubUseLimitDMO);
//
//		//
//		// Could not find the SulSubUseLimitDMO
//		//
//		if (returnSulSubUseLimitDMO == null) {
//			thrower.business(Base_ACTACCTYPES_000,
//					new Object[] { SulSubUseLimitDMO.getDpfFolderId() });
//		}
//
//		//
//		// Now, based on the values of the flags on this method signature, which
//		// in turn,
//		// are based on this objects associations, get all associated, embedded
//		// objects
//		//
//		return returnSulSubUseLimitDMO;
//	}

	// ==================================================================================================

//	public DTOList getList(DTOListState state,
//			SulSubUseLimitDMO SulSubUseLimitDMO) throws EPPIXBusinessException,
//			EPPIXUnexpectedException, EPPIXFatalException {
//		logger.debug("getList( state, SulSubUseLimitDMO )");
//
//		return SulSubUseLimitDAC.getList(state, SulSubUseLimitDMO);
//	}

//	public SulSubUseLimitDMO create(SulSubUseLimitDMO SulSubUseLimitDMO)
//			throws EPPIXBusinessException, EPPIXUnexpectedException,
//			EPPIXFatalException {
//		logger.debug("create( SulSubUseLimitDMO )");
//
//		thrower.ifParameterMissing("SulSubUseLimitDMO", SulSubUseLimitDMO);
//		thrower.ifParameterMissing("SulSubUseLimitDMO.dpfFolderId",
//				SulSubUseLimitDMO.getDpfFolderId());

		//
		// Check that this object does not already exist
		//
//		if (exists(SulSubUseLimitDMO)) {
//			thrower.business(Base_ACTACCTYPES_001,
//					new Object[] { SulSubUseLimitDMO.getDpfFolderId() });
//		}

		//
		// Now create the record
		//
//		SulSubUseLimitDAC.create(SulSubUseLimitDMO);

//		return SulSubUseLimitDMO;
//	}

//	public SulSubUseLimitDMO modify(SulSubUseLimitDMO SulSubUseLimitDMO)
//			throws EPPIXBusinessException, EPPIXUnexpectedException,
//			EPPIXFatalException {
//		logger.debug("modify( aSulSubUseLimitDMO )");
//
//		//
//		// Check mandatory parameters (
//		//
//		// Note: attributes stereotyped <NotModifiable> are ignored
//		//
//		thrower.ifParameterMissing("SulSubUseLimitDMO", SulSubUseLimitDMO);
//		thrower.ifParameterMissing("SulSubUseLimitDMO.dpfFolderId",
//				SulSubUseLimitDMO.getDpfFolderId());
//
//		SulSubUseLimitDMO updateSulSubUseLimitDMO = new SulSubUseLimitDMO();
//
//		updateSulSubUseLimitDMO.setDpfFolderId(SulSubUseLimitDMO
//				.getDpfFolderId());
//
//		updateSulSubUseLimitDMO = get(updateSulSubUseLimitDMO);
//
//		//
//		// For each relationship to single objects (does not matter if they are
//		// Embedded or Flattened)
//		// either associate to a pre-existing object, or create an object then
//		// associate to it
//		//
//
//		//
//		// Copy the fields to be updated. We do not want to overwrite primary
//		// keys etc.
//		// All attributes stereotyped as being <NotModifiable> are skipped
//		//
//		updateSulSubUseLimitDMO.setDpfFolderId(SulSubUseLimitDMO
//				.getDpfFolderId());
//
//		//
//		// Modify the SulSubUseLimitDMO
//		//
//		SulSubUseLimitDAC.modify(updateSulSubUseLimitDMO);
//
//		// Create a new SulSubUseLimitDMO, set keys, and fetch from the
//		// database...
//		SulSubUseLimitDMO returnSulSubUseLimitDMO = new SulSubUseLimitDMO();
//
//		returnSulSubUseLimitDMO.setDpfFolderId(updateSulSubUseLimitDMO
//				.getDpfFolderId());
//
//		returnSulSubUseLimitDMO = get(returnSulSubUseLimitDMO);
//
//		return returnSulSubUseLimitDMO;
//	}

	// ==================================================================================================

	public void modify(QueryFilter filter) throws EPPIXBusinessException,
			EPPIXUnexpectedException, EPPIXFatalException {
		logger.debug("modify( filter )");

		//
		// Modify the SulSubUseLimitDMO
		//
		SulSubUseLimitDAC.modify(filter);
	}

	// ==================================================================================================

//	public void delete(SulSubUseLimitDMO SulSubUseLimitDMO)
//			throws EPPIXBusinessException, EPPIXUnexpectedException,
//			EPPIXFatalException {
//		logger.debug("delete( SulSubUseLimitDMO )");
//
//		thrower.ifParameterMissing("SulSubUseLimitDMO", SulSubUseLimitDMO);
//
//		SulSubUseLimitDMO updateSulSubUseLimitDMO = null;
//
//		updateSulSubUseLimitDMO = get(SulSubUseLimitDMO);
//
//		// delete self...
//		SulSubUseLimitDAC.delete(SulSubUseLimitDMO);
//	}

	// ==================================================================================================

	public void delete(QueryFilter filter) throws EPPIXBusinessException,
			EPPIXUnexpectedException, EPPIXFatalException {
		logger.debug("delete( filter )");

		thrower.ifParameterMissing("filter", filter);

		// delete...
		SulSubUseLimitDAC.delete(filter);
	}

	// ==================================================================================================

//	public boolean exists(SulSubUseLimitDMO SulSubUseLimitDMO)
//			throws EPPIXBusinessException, EPPIXUnexpectedException,
//			EPPIXFatalException {
//		logger.debug("exists(SulSubUseLimitDMO)");
//
//		thrower.ifParameterMissing("SulSubUseLimitDMO", SulSubUseLimitDMO);
//
//		thrower.ifParameterMissing("SulSubUseLimitDMO.actAccId",
//				SulSubUseLimitDMO.getDpfFolderId());
//
//		return SulSubUseLimitDAC.exists(SulSubUseLimitDMO);
//	}

	// ==================================================================================================

	public boolean exists(QueryFilter filter) throws EPPIXBusinessException,
			EPPIXUnexpectedException, EPPIXFatalException {
		logger.debug("exists(filter)");

		return SulSubUseLimitDAC.exists(filter);
	}

	// ==================================================================================================

//	public DTOList getList(DTOListState state, QueryFilter filter)
//			throws EPPIXBusinessException, EPPIXUnexpectedException,
//			EPPIXFatalException {
//		logger.debug("getList( state, filter )");
//
//		return SulSubUseLimitDAC.getList(state, filter);
//	}

	// ==================================================================================================

	public DAOIterator iterate(QueryFilter filter)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("iterateWithLock( filter )");

		return SulSubUseLimitDAC.iterate(filter);
	}

	// ==================================================================================================

//	public DAOIterator iterateWithLock(QueryFilter filter)
//			throws EPPIXBusinessException, EPPIXUnexpectedException,
//			EPPIXFatalException {
//		logger.debug("iterateWithLock( filter )");
//
//		return SulSubUseLimitDAC.iterateWithLock(filter);
//	}

	// ==================================================================================================

	public SulSubUseLimitDMO get(QueryFilter filter)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("get( filter )");

		//
		// Check mandatory parameters.
		//
		thrower.ifParameterMissing("filter", filter);

		//
		// Attempt to get the SulSubUseLimitDMO
		//
		SulSubUseLimitDMO SulSubUseLimitDMO = SulSubUseLimitDAC.get(filter);

		return SulSubUseLimitDMO;
	}

	// ==================================================================================================

	public Object max(QueryFilter filter) throws EPPIXBusinessException,
			EPPIXUnexpectedException, EPPIXFatalException {
		logger.debug("max( filter )");

		//
		// Check mandatory parameters.
		//
		thrower.ifParameterMissing("filter", filter);

		return SulSubUseLimitDAC.max(filter);
	}

	// ==================================================================================================

	public Object min(QueryFilter filter) throws EPPIXBusinessException,
			EPPIXUnexpectedException, EPPIXFatalException {
		logger.debug("min( filter )");

		//
		// Check mandatory parameters.
		//
		thrower.ifParameterMissing("filter", filter);

		return SulSubUseLimitDAC.min(filter);
	}

	// ==================================================================================================

	public Integer count(QueryFilter filter) throws EPPIXBusinessException,
			EPPIXUnexpectedException, EPPIXFatalException {
		logger.debug("count( filter )");

		//
		// Check mandatory parameters.
		//
		thrower.ifParameterMissing("filter", filter);

		return Integer.valueOf(SulSubUseLimitDAC.count(filter));
	}
	// ==================================================================================================

}