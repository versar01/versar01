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

public class PfuPocUsageAbstractBLO extends BaseBLO implements DTOActionTypes,
		BaseMessages {

	static Thrower thrower = Thrower.getThrower(PfuPocUsageAbstractBLO.class);

	protected static final String ENTITY_ID = "FS";

	/** Data Access Controller. */
	protected PfuPocUsageDAC pfuPocUsageDAC;
	/** DOCUMENT ME! */
	protected Logger logger = thrower.getLogger();

	/** Invoked by the BLOBinder to provide this BLO with its DAC. */
	protected void setDAC(DAC dac) {
		this.pfuPocUsageDAC = (PfuPocUsageDAC) dac;
	}

	protected Class getDACClass() {
		return PfuPocUsageDAC.class;
	}

	public PfuPocUsageDMO get(PfuPocUsageDMO pfuPocUsageDMO)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("get(pfuPocUsageDMO)");

		//
		// Check mandatory parameters.
		//
		thrower.ifParameterMissing("pfuPocUsageDMO", pfuPocUsageDMO);

		//
		// Each attribute that is part of the primary key is mandatory
		//
		thrower.ifParameterMissing("pfuPocUsageDMO.actAccId",
				pfuPocUsageDMO.getPfuSerialId());

		//
		// Attempt to get the PfuPocUsageDMO
		//
		PfuPocUsageDMO returnPfuPocUsageDMO = pfuPocUsageDAC.get(pfuPocUsageDMO);

		//
		// Could not find the PfuPocUsageDMO
		//
		if (returnPfuPocUsageDMO == null) {
			thrower.business(Base_PFUPOCUSAGElOOKUP_000,
					new Object[] { pfuPocUsageDMO.getPfuSerialId() });
		}

		//
		// Now, based on the values of the flags on this method signature, which
		// in turn,
		// are based on this objects associations, get all associated, embedded
		// objects
		//
		return returnPfuPocUsageDMO;
	}

//	// ==================================================================================================
//
//	public DTOList getList(DTOListState state, PfuPocUsageDMO pfuPocUsageDMO)
//			throws EPPIXBusinessException, EPPIXUnexpectedException,
//			EPPIXFatalException {
//		logger.debug("getList( state, pfuPocUsageDMO )");
//
//		return pfuPocUsageDAC.getList(state, pfuPocUsageDMO);
//	}

	public PfuPocUsageDMO create(PfuPocUsageDMO pfuPocUsageDMO)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("create( pfuPocUsageDMO )");

		thrower.ifParameterMissing("pfuPocUsageDMO", pfuPocUsageDMO);

		//
		// Now create the record
		//
		pfuPocUsageDAC.create(pfuPocUsageDMO);

		return pfuPocUsageDMO;
	}

//	public PfuPocUsageDMO modify(PfuPocUsageDMO pfuPocUsageDMO)
//			throws EPPIXBusinessException, EPPIXUnexpectedException,
//			EPPIXFatalException {
//		logger.debug("modify( apfuPocUsageDMO )");
//
//		//
//		// Check mandatory parameters (
//		//
//		// Note: attributes stereotyped <NotModifiable> are ignored
//		//
//		thrower.ifParameterMissing("pfuPocUsageDMO", pfuPocUsageDMO);
//		thrower.ifParameterMissing("pfuPocUsageDMO.dpfFolderId",
//				pfuPocUsageDMO.getDpfFolderId());
//
//		PfuPocUsageDMO updatePfuPocUsageDMO = new PfuPocUsageDMO();
//
//		updatePfuPocUsageDMO.setDpfFolderId(pfuPocUsageDMO.getDpfFolderId());
//
//		updatePfuPocUsageDMO = get(updatePfuPocUsageDMO);
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
//		updatePfuPocUsageDMO.setDpfFolderId(pfuPocUsageDMO.getDpfFolderId());
//
//		//
//		// Modify the pfuPocUsageDMO
//		//
//		pfuPocUsageDAC.modify(updatePfuPocUsageDMO);
//
//		// Create a new PfuPocUsageDMO, set keys, and fetch from the database...
//		PfuPocUsageDMO returnPfuPocUsageDMO = new PfuPocUsageDMO();
//
//		returnPfuPocUsageDMO.setDpfFolderId(updatePfuPocUsageDMO
//				.getDpfFolderId());
//
//		returnPfuPocUsageDMO = get(returnPfuPocUsageDMO);
//
//		return returnPfuPocUsageDMO;
//	}

	// ==================================================================================================

	public void modify(QueryFilter filter) throws EPPIXBusinessException,
			EPPIXUnexpectedException, EPPIXFatalException {
		logger.debug("modify( filter )");

		//
		// Modify the pfuPocUsageDMO
		//
		pfuPocUsageDAC.modify(filter);
	}

	// ==================================================================================================

//	public void delete(PfuPocUsageDMO pfuPocUsageDMO)
//			throws EPPIXBusinessException, EPPIXUnexpectedException,
//			EPPIXFatalException {
//		logger.debug("delete( pfuPocUsageDMO )");
//
//		thrower.ifParameterMissing("pfuPocUsageDMO", pfuPocUsageDMO);
//
//		PfuPocUsageDMO updatePfuPocUsageDMO = null;
//
//		updatePfuPocUsageDMO = get(pfuPocUsageDMO);
//
//		// delete self...
//		pfuPocUsageDAC.delete(pfuPocUsageDMO);
//	}

	// ==================================================================================================

	public void delete(QueryFilter filter) throws EPPIXBusinessException,
			EPPIXUnexpectedException, EPPIXFatalException {
		logger.debug("delete( filter )");

		thrower.ifParameterMissing("filter", filter);

		// delete...
		pfuPocUsageDAC.delete(filter);
	}

	// ==================================================================================================

//	public boolean exists(PfuPocUsageDMO pfuPocUsageDMO)
//			throws EPPIXBusinessException, EPPIXUnexpectedException,
//			EPPIXFatalException {
//		logger.debug("exists(pfuPocUsageDMO)");
//
//		thrower.ifParameterMissing("pfuPocUsageDMO", pfuPocUsageDMO);
//
//		thrower.ifParameterMissing("pfuPocUsageDMO.actAccId",
//				pfuPocUsageDMO.getDpfFolderId());
//
//		return pfuPocUsageDAC.exists(pfuPocUsageDMO);
//	}

	// ==================================================================================================

	public boolean exists(QueryFilter filter) throws EPPIXBusinessException,
			EPPIXUnexpectedException, EPPIXFatalException {
		logger.debug("exists(filter)");

		return pfuPocUsageDAC.exists(filter);
	}

	// ==================================================================================================

//	public DTOList getList(DTOListState state, QueryFilter filter)
//			throws EPPIXBusinessException, EPPIXUnexpectedException,
//			EPPIXFatalException {
//		logger.debug("getList( state, filter )");
//
//		return pfuPocUsageDAC.getList(state, filter);
//	}

	// ==================================================================================================

	public DAOIterator iterate(QueryFilter filter)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("iterateWithLock( filter )");

		return pfuPocUsageDAC.iterate(filter);
	}

	// ==================================================================================================

	// public DAOIterator iterateWithLock(QueryFilter filter)
	// throws EPPIXBusinessException, EPPIXUnexpectedException,
	// EPPIXFatalException {
	// logger.debug("iterateWithLock( filter )");
	//
	// return pfuPocUsageDAC.iterateWithLock(filter);
	// }

	// ==================================================================================================

	public PfuPocUsageDMO get(QueryFilter filter)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("get( filter )");

		//
		// Check mandatory parameters.
		//
		thrower.ifParameterMissing("filter", filter);

		//
		// Attempt to get the PfuPocUsageDMO
		//
		PfuPocUsageDMO pfuPocUsageDMO = pfuPocUsageDAC.get(filter);

		return pfuPocUsageDMO;
	}

	// ==================================================================================================

	public Object max(QueryFilter filter) throws EPPIXBusinessException,
			EPPIXUnexpectedException, EPPIXFatalException {
		logger.debug("max( filter )");

		//
		// Check mandatory parameters.
		//
		thrower.ifParameterMissing("filter", filter);

		return pfuPocUsageDAC.max(filter);
	}

	// ==================================================================================================

	public Object min(QueryFilter filter) throws EPPIXBusinessException,
			EPPIXUnexpectedException, EPPIXFatalException {
		logger.debug("min( filter )");

		//
		// Check mandatory parameters.
		//
		thrower.ifParameterMissing("filter", filter);

		return pfuPocUsageDAC.min(filter);
	}

	// ==================================================================================================

	public Integer count(QueryFilter filter) throws EPPIXBusinessException,
			EPPIXUnexpectedException, EPPIXFatalException {
		logger.debug("count( filter )");

		//
		// Check mandatory parameters.
		//
		thrower.ifParameterMissing("filter", filter);

		return Integer.valueOf(pfuPocUsageDAC.count(filter));
	}
	// ==================================================================================================

}