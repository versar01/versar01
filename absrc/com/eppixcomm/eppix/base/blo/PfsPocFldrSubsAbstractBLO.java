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

public class PfsPocFldrSubsAbstractBLO extends BaseBLO implements
		DTOActionTypes, BaseMessages {

	/** DOCUMENT ME! */
	static Thrower thrower = Thrower
			.getThrower(PfsPocFldrSubsAbstractBLO.class);
	/** DOCUMENT ME! */
	protected static final String ENTITY_ID = "DOTT";

	/** Data Access Controller. */
	protected PfsPocFldrSubsDAC pfsPocFldrSubsDAC;
	/** DOCUMENT ME! */
	protected Logger logger = thrower.getLogger();

	/** Invoked by the BLOBinder to provide this BLO with its DAC. */
	protected void setDAC(DAC dac) {
		this.pfsPocFldrSubsDAC = (PfsPocFldrSubsDAC) dac;
	}

	protected Class getDACClass() {
		return PfsPocFldrSubsDAC.class;
	}

	public PfsPocFldrSubsDMO get(PfsPocFldrSubsDMO pfsPocFldrSubsDMO)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("get(pfsPocFldrSubsDMO)");

		//
		// Check mandatory parameters.
		//
		thrower.ifParameterMissing("pfsPocFldrSubsDMO", pfsPocFldrSubsDMO);

		//
		// Each attribute that is part of the primary key is mandatory
		//
		thrower.ifParameterMissing("pfsPocFldrSubsDMO.pfsSubscriberId",
				pfsPocFldrSubsDMO.getPfsSubscriberId());

		thrower.ifParameterMissing("pfsPocFldrSubsDMO.pfsFolderId",
				pfsPocFldrSubsDMO.getPfsFolderId());

		thrower.ifParameterMissing("pfsPocFldrSubsDMO.pfsStatus",
				pfsPocFldrSubsDMO.getPfsStatus());

		//
		// Attempt to get the PfsPocFldrSubsDMO
		//
		PfsPocFldrSubsDMO returnPfsPocFldrSubsDMO = pfsPocFldrSubsDAC
				.get(pfsPocFldrSubsDMO);

		//
		// Could not find the PfsPocFldrSubsDMO
		//
		if (returnPfsPocFldrSubsDMO == null) {
			thrower.business(Base_PFSPOCFLDRSUBS_000,
					new Object[] { pfsPocFldrSubsDMO.getPfsSubscriberId() });
		}

		//
		// Now, based on the values of the flags on this method signature, which
		// in turn,
		// are based on this objects associations, get all associated, embedded
		// objects
		//
		return returnPfsPocFldrSubsDMO;
	}

	// ==================================================================================================

	public DTOList getList(DTOListState state,
			PfsPocFldrSubsDMO pfsPocFldrSubsDMO) throws EPPIXBusinessException,
			EPPIXUnexpectedException, EPPIXFatalException {
		logger.debug("getList( state, pfsPocFldrSubsDMO )");

		return pfsPocFldrSubsDAC.getList(state, pfsPocFldrSubsDMO);
	}

	public PfsPocFldrSubsDMO create(PfsPocFldrSubsDMO pfsPocFldrSubsDMO)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("create( pfsPocFldrSubsDMO )");

		thrower.ifParameterMissing("pfsPocFldrSubsDMO", pfsPocFldrSubsDMO);

		thrower.ifParameterMissing("pfsPocFldrSubsDMO.pfsSubscriberId",
				pfsPocFldrSubsDMO.getPfsSubscriberId());

		thrower.ifParameterMissing("pfsPocFldrSubsDMO.pfsFolderId",
				pfsPocFldrSubsDMO.getPfsFolderId());

		thrower.ifParameterMissing("pfsPocFldrSubsDMO.pfsStatus",
				pfsPocFldrSubsDMO.getPfsStatus());

		//
		// Check that this object does not already exist
		//
		if (exists(pfsPocFldrSubsDMO)) {
			thrower.business(Base_PFSPOCFLDRSUBS_001,
					new Object[] { pfsPocFldrSubsDMO.getPfsSubscriberId() });
		}

		//
		// Now create the record
		//
		pfsPocFldrSubsDAC.create(pfsPocFldrSubsDMO);

		return pfsPocFldrSubsDMO;
	}

	public PfsPocFldrSubsDMO modify(PfsPocFldrSubsDMO pfsPocFldrSubsDMO)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("modify( apfsPocFldrSubsDMO )");

		//
		// Check mandatory parameters (
		//
		// Note: attributes stereotyped <NotModifiable> are ignored
		//
		thrower.ifParameterMissing("pfsPocFldrSubsDMO", pfsPocFldrSubsDMO);

		thrower.ifParameterMissing("pfsPocFldrSubsDMO.pfsSubscriberId",
				pfsPocFldrSubsDMO.getPfsSubscriberId());

		thrower.ifParameterMissing("pfsPocFldrSubsDMO.pfsFolderId",
				pfsPocFldrSubsDMO.getPfsFolderId());

		thrower.ifParameterMissing("pfsPocFldrSubsDMO.pfsStatus",
				pfsPocFldrSubsDMO.getPfsStatus());

		PfsPocFldrSubsDMO updatePfsPocFldrSubsDMO = new PfsPocFldrSubsDMO();

		updatePfsPocFldrSubsDMO.setPfsSubscriberId(pfsPocFldrSubsDMO
				.getPfsSubscriberId());
		updatePfsPocFldrSubsDMO.setPfsFolderId(pfsPocFldrSubsDMO
				.getPfsFolderId());
		updatePfsPocFldrSubsDMO.setPfsStatus(pfsPocFldrSubsDMO.getPfsStatus());

		updatePfsPocFldrSubsDMO = get(updatePfsPocFldrSubsDMO);

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
		updatePfsPocFldrSubsDMO.setPfsSubscriberId(pfsPocFldrSubsDMO
				.getPfsSubscriberId());

		updatePfsPocFldrSubsDMO.setPfsFolderId(pfsPocFldrSubsDMO
				.getPfsFolderId());

		updatePfsPocFldrSubsDMO.setPfsStatus(pfsPocFldrSubsDMO.getPfsStatus());

		//
		// Modify the pfsPocFldrSubsDMO
		//
		pfsPocFldrSubsDAC.modify(updatePfsPocFldrSubsDMO);

		// Create a new PfsPocFldrSubsDMO, set keys, and fetch from the
		// database...
		PfsPocFldrSubsDMO returnPfsPocFldrSubsDMO = new PfsPocFldrSubsDMO();

		returnPfsPocFldrSubsDMO.setPfsSubscriberId(updatePfsPocFldrSubsDMO
				.getPfsSubscriberId());
		returnPfsPocFldrSubsDMO.setPfsFolderId(updatePfsPocFldrSubsDMO
				.getPfsFolderId());
		returnPfsPocFldrSubsDMO.setPfsStatus(updatePfsPocFldrSubsDMO
				.getPfsStatus());

		returnPfsPocFldrSubsDMO = get(returnPfsPocFldrSubsDMO);

		return returnPfsPocFldrSubsDMO;
	}

	// ==================================================================================================

	public void modify(QueryFilter filter) throws EPPIXBusinessException,
			EPPIXUnexpectedException, EPPIXFatalException {
		logger.debug("modify( filter )");

		//
		// Modify the pfsPocFldrSubsDMO
		//
		pfsPocFldrSubsDAC.modify(filter);
	}

	// ==================================================================================================

	public void delete(PfsPocFldrSubsDMO pfsPocFldrSubsDMO)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("delete( pfsPocFldrSubsDMO )");

		thrower.ifParameterMissing("pfsPocFldrSubsDMO", pfsPocFldrSubsDMO);
		thrower.ifParameterMissing("pfsPocFldrSubsDMO.pfsFolderId",
				pfsPocFldrSubsDMO.getPfsFolderId());

		thrower.ifParameterMissing("pfsPocFldrSubsDMO.pfsStatus",
				pfsPocFldrSubsDMO.getPfsStatus());

		PfsPocFldrSubsDMO updatePfsPocFldrSubsDMO = null;

		updatePfsPocFldrSubsDMO = get(pfsPocFldrSubsDMO);

		// delete self...
		pfsPocFldrSubsDAC.delete(pfsPocFldrSubsDMO);
	}

	// ==================================================================================================

	public void delete(QueryFilter filter) throws EPPIXBusinessException,
			EPPIXUnexpectedException, EPPIXFatalException {
		logger.debug("delete( filter )");

		thrower.ifParameterMissing("filter", filter);

		// delete...
		pfsPocFldrSubsDAC.delete(filter);
	}

	// ==================================================================================================

	public boolean exists(PfsPocFldrSubsDMO pfsPocFldrSubsDMO)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("exists(pfsPocFldrSubsDMO)");

		thrower.ifParameterMissing("pfsPocFldrSubsDMO", pfsPocFldrSubsDMO);

		thrower.ifParameterMissing("pfsPocFldrSubsDMO.pfsSubscriberId",
				pfsPocFldrSubsDMO.getPfsSubscriberId());

		thrower.ifParameterMissing("pfsPocFldrSubsDMO.pfsFolderId",
				pfsPocFldrSubsDMO.getPfsFolderId());

		thrower.ifParameterMissing("pfsPocFldrSubsDMO.pfsStatus",
				pfsPocFldrSubsDMO.getPfsStatus());

		return pfsPocFldrSubsDAC.exists(pfsPocFldrSubsDMO);
	}

	// ==================================================================================================

	public boolean exists(QueryFilter filter) throws EPPIXBusinessException,
			EPPIXUnexpectedException, EPPIXFatalException {
		logger.debug("exists(filter)");

		return pfsPocFldrSubsDAC.exists(filter);
	}

	// ==================================================================================================

	public DTOList getList(DTOListState state, QueryFilter filter)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("getList( state, filter )");

		return pfsPocFldrSubsDAC.getList(state, filter);
	}

	// ==================================================================================================

	public DAOIterator iterate(QueryFilter filter)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("iterateWithLock( filter )");

		return pfsPocFldrSubsDAC.iterate(filter);
	}

	// ==================================================================================================

	public DAOIterator iterateWithLock(QueryFilter filter)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("iterateWithLock( filter )");

		return pfsPocFldrSubsDAC.iterateWithLock(filter);
	}

	// ==================================================================================================

	public PfsPocFldrSubsDMO get(QueryFilter filter)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("get( filter )");

		//
		// Check mandatory parameters.
		//
		thrower.ifParameterMissing("filter", filter);

		//
		// Attempt to get the PfsPocFldrSubsDMO
		//
		PfsPocFldrSubsDMO pfsPocFldrSubsDMO = pfsPocFldrSubsDAC.get(filter);

		return pfsPocFldrSubsDMO;
	}

	// ==================================================================================================

	public Object max(QueryFilter filter) throws EPPIXBusinessException,
			EPPIXUnexpectedException, EPPIXFatalException {
		logger.debug("max( filter )");

		//
		// Check mandatory parameters.
		//
		thrower.ifParameterMissing("filter", filter);

		return pfsPocFldrSubsDAC.max(filter);
	}

	// ==================================================================================================

	public Object min(QueryFilter filter) throws EPPIXBusinessException,
			EPPIXUnexpectedException, EPPIXFatalException {
		logger.debug("min( filter )");

		//
		// Check mandatory parameters.
		//
		thrower.ifParameterMissing("filter", filter);

		return pfsPocFldrSubsDAC.min(filter);
	}

	// ==================================================================================================

	public Integer count(QueryFilter filter) throws EPPIXBusinessException,
			EPPIXUnexpectedException, EPPIXFatalException {
		logger.debug("count( filter )");

		//
		// Check mandatory parameters.
		//
		thrower.ifParameterMissing("filter", filter);

		return Integer.valueOf(pfsPocFldrSubsDAC.count(filter));
	}
	// ==================================================================================================

}