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

public class VasActiveServiceAbstractBLO extends BaseBLO implements
		DTOActionTypes, BaseMessages {

	/** DOCUMENT ME! */
	static Thrower thrower = Thrower
			.getThrower(VasActiveServiceAbstractBLO.class);
	/** DOCUMENT ME! */
	protected static final String ENTITY_ID = "DOTT";

	/** Data Access Controller. */
	protected VasActiveServiceDAC vasActiveServiceDAC;
	/** DOCUMENT ME! */
	protected Logger logger = thrower.getLogger();

	/** Invoked by the BLOBinder to provide this BLO with its DAC. */
	protected void setDAC(DAC dac) {
		this.vasActiveServiceDAC = (VasActiveServiceDAC) dac;
	}

	protected Class getDACClass() {
		return VasActiveServiceDAC.class;
	}

	public VasActiveServiceDMO get(VasActiveServiceDMO vasActiveServiceDMO)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("get(vasActiveServiceDMO)");

		//
		// Check mandatory parameters.
		//
		thrower.ifParameterMissing("vasActiveServiceDMO", vasActiveServiceDMO);

		//
		// Each attribute that is part of the primary key is mandatory
		//
		thrower.ifParameterMissing("vasActiveServiceDMO.vasSubscriberId",
				vasActiveServiceDMO.getVasSubscriberId());

		thrower.ifParameterMissing("vasActiveServiceDMO.vasServiceCode",
				vasActiveServiceDMO.getVasServiceCode());

		thrower.ifParameterMissing("vasActiveServiceDMO.vasInternTariff",
				vasActiveServiceDMO.getVasInternTariff());

		//
		// Attempt to get the VasActiveServiceDMO
		//
		VasActiveServiceDMO returnVasActiveServiceDMO = vasActiveServiceDAC
				.get(vasActiveServiceDMO);

		//
		// Could not find the VasActiveServiceDMO
		//
		if (returnVasActiveServiceDMO == null) {
			thrower.business(Base_VASACTIVESERVICE_000,
					new Object[] { vasActiveServiceDMO.getVasSubscriberId() });
		}

		//
		// Now, based on the values of the flags on this method signature, which
		// in turn,
		// are based on this objects associations, get all associated, embedded
		// objects
		//
		return returnVasActiveServiceDMO;
	}

	// ==================================================================================================

	public DTOList getList(DTOListState state,
			VasActiveServiceDMO vasActiveServiceDMO)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("getList( state, vasActiveServiceDMO )");

		return vasActiveServiceDAC.getList(state, vasActiveServiceDMO);
	}

	public VasActiveServiceDMO create(VasActiveServiceDMO vasActiveServiceDMO)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("create( vasActiveServiceDMO )");

		thrower.ifParameterMissing("vasActiveServiceDMO", vasActiveServiceDMO);

		thrower.ifParameterMissing("vasActiveServiceDMO.vasSubscriberId",
				vasActiveServiceDMO.getVasSubscriberId());

		thrower.ifParameterMissing("vasActiveServiceDMO.vasServiceCode",
				vasActiveServiceDMO.getVasServiceCode());

		thrower.ifParameterMissing("vasActiveServiceDMO.vasInternTariff",
				vasActiveServiceDMO.getVasInternTariff());

		//
		// Check that this object does not already exist
		//
		if (exists(vasActiveServiceDMO)) {
			thrower.business(Base_VASACTIVESERVICE_001,
					new Object[] { vasActiveServiceDMO.getVasSubscriberId() });
		}

		//
		// Now create the record
		//
		vasActiveServiceDAC.create(vasActiveServiceDMO);

		return vasActiveServiceDMO;
	}

	public VasActiveServiceDMO modify(VasActiveServiceDMO vasActiveServiceDMO)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("modify( avasActiveServiceDMO )");

		//
		// Check mandatory parameters (
		//
		// Note: attributes stereotyped <NotModifiable> are ignored
		//
		thrower.ifParameterMissing("vasActiveServiceDMO.vasSubscriberId",
				vasActiveServiceDMO.getVasSubscriberId());

		thrower.ifParameterMissing("vasActiveServiceDMO.vasServiceCode",
				vasActiveServiceDMO.getVasServiceCode());

		thrower.ifParameterMissing("vasActiveServiceDMO.vasInternTariff",
				vasActiveServiceDMO.getVasInternTariff());



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

		VasActiveServiceDMO updateVasActiveServiceDMO = new VasActiveServiceDMO();

		updateVasActiveServiceDMO.setVasSubscriberId(vasActiveServiceDMO
				.getVasSubscriberId());

		updateVasActiveServiceDMO.setVasActDate(vasActiveServiceDMO
				.getVasActDate());

		updateVasActiveServiceDMO.setVasDeactDate(vasActiveServiceDMO
				.getVasDeactDate());

		updateVasActiveServiceDMO.setVasInternTariff(vasActiveServiceDMO
				.getVasInternTariff());

		updateVasActiveServiceDMO.setVasInternTariff(vasActiveServiceDMO
				.getVasInternTariff());

		updateVasActiveServiceDMO.setVasMultiCharge(vasActiveServiceDMO
				.getVasMultiCharge());

		updateVasActiveServiceDMO.setVasServiceCode(vasActiveServiceDMO
				.getVasServiceCode());

		updateVasActiveServiceDMO.setVasServiceType(vasActiveServiceDMO
				.getVasServiceType());

		updateVasActiveServiceDMO.setVasSubCharge1(vasActiveServiceDMO
				.getVasSubCharge1());

		updateVasActiveServiceDMO.setVasSubCharge2(vasActiveServiceDMO
				.getVasSubCharge2());

		updateVasActiveServiceDMO.setVasSubCharge3(vasActiveServiceDMO
				.getVasSubCharge3());

		updateVasActiveServiceDMO.setVasTwinbillNo(vasActiveServiceDMO
				.getVasTwinbillNo());
		
		updateVasActiveServiceDMO = get(updateVasActiveServiceDMO);
		
		//
		// Modify the vasActiveServiceDMO
		//
		vasActiveServiceDAC.modify(updateVasActiveServiceDMO);

		// Create a new VasActiveServiceDMO, set keys, and fetch from the
		// database...
		VasActiveServiceDMO returnVasActiveServiceDMO = new VasActiveServiceDMO();

		returnVasActiveServiceDMO.setVasSubscriberId(updateVasActiveServiceDMO
				.getVasSubscriberId());

		returnVasActiveServiceDMO = get(returnVasActiveServiceDMO);

		return returnVasActiveServiceDMO;
	}

	// ==================================================================================================

	public void modify(QueryFilter filter) throws EPPIXBusinessException,
			EPPIXUnexpectedException, EPPIXFatalException {
		logger.debug("modify( filter )");

		//
		// Modify the vasActiveServiceDMO
		//
		vasActiveServiceDAC.modify(filter);
	}

	// ==================================================================================================

	public void delete(VasActiveServiceDMO vasActiveServiceDMO)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("delete( vasActiveServiceDMO )");

		thrower.ifParameterMissing("vasActiveServiceDMO", vasActiveServiceDMO);

		VasActiveServiceDMO updateVasActiveServiceDMO = null;

		updateVasActiveServiceDMO = get(vasActiveServiceDMO);

		// delete self...
		vasActiveServiceDAC.delete(vasActiveServiceDMO);
	}

	// ==================================================================================================

	public void delete(QueryFilter filter) throws EPPIXBusinessException,
			EPPIXUnexpectedException, EPPIXFatalException {
		logger.debug("delete( filter )");

		thrower.ifParameterMissing("filter", filter);

		// delete...
		vasActiveServiceDAC.delete(filter);
	}

	// ==================================================================================================

	public boolean exists(VasActiveServiceDMO vasActiveServiceDMO)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("exists(vasActiveServiceDMO)");

		thrower.ifParameterMissing("vasActiveServiceDMO", vasActiveServiceDMO);

		thrower.ifParameterMissing("vasActiveServiceDMO.vasSubscriberId",
				vasActiveServiceDMO.getVasSubscriberId());

		return vasActiveServiceDAC.exists(vasActiveServiceDMO);
	}

	// ==================================================================================================

	public boolean exists(QueryFilter filter) throws EPPIXBusinessException,
			EPPIXUnexpectedException, EPPIXFatalException {
		logger.debug("exists(filter)");

		return vasActiveServiceDAC.exists(filter);
	}

	// ==================================================================================================

	public DTOList getList(DTOListState state, QueryFilter filter)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("getList( state, filter )");

		return vasActiveServiceDAC.getList(state, filter);
	}

	// ==================================================================================================

	public DAOIterator iterate(QueryFilter filter)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("iterateWithLock( filter )");

		return vasActiveServiceDAC.iterate(filter);
	}

	// ==================================================================================================

	public DAOIterator iterateWithLock(QueryFilter filter)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("iterateWithLock( filter )");

		return vasActiveServiceDAC.iterateWithLock(filter);
	}

	// ==================================================================================================

	public VasActiveServiceDMO get(QueryFilter filter)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("get( filter )");

		//
		// Check mandatory parameters.
		//
		thrower.ifParameterMissing("filter", filter);

		//
		// Attempt to get the VasActiveServiceDMO
		//
		VasActiveServiceDMO vasActiveServiceDMO = vasActiveServiceDAC
				.get(filter);

		return vasActiveServiceDMO;
	}

	// ==================================================================================================

	public Object max(QueryFilter filter) throws EPPIXBusinessException,
			EPPIXUnexpectedException, EPPIXFatalException {
		logger.debug("max( filter )");

		//
		// Check mandatory parameters.
		//
		thrower.ifParameterMissing("filter", filter);

		return vasActiveServiceDAC.max(filter);
	}

	// ==================================================================================================

	public Object min(QueryFilter filter) throws EPPIXBusinessException,
			EPPIXUnexpectedException, EPPIXFatalException {
		logger.debug("min( filter )");

		//
		// Check mandatory parameters.
		//
		thrower.ifParameterMissing("filter", filter);

		return vasActiveServiceDAC.min(filter);
	}

	// ==================================================================================================

	public Integer count(QueryFilter filter) throws EPPIXBusinessException,
			EPPIXUnexpectedException, EPPIXFatalException {
		logger.debug("count( filter )");

		//
		// Check mandatory parameters.
		//
		thrower.ifParameterMissing("filter", filter);

		return Integer.valueOf(vasActiveServiceDAC.count(filter));
	}
	// ==================================================================================================

}