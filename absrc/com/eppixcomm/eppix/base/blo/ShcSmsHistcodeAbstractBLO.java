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

public class ShcSmsHistcodeAbstractBLO extends BaseBLO implements
		DTOActionTypes, BaseMessages {

	static Thrower thrower = Thrower
			.getThrower(ShcSmsHistcodeAbstractBLO.class);

	protected static final String ENTITY_ID = "FS";

	/** Data Access Controller. */
	protected ShcSmsHistcodeDAC shcSmsHistcodeDAC;
	/** DOCUMENT ME! */
	protected Logger logger = thrower.getLogger();

	/** Invoked by the BLOBinder to provide this BLO with its DAC. */
	protected void setDAC(DAC dac) {
		this.shcSmsHistcodeDAC = (ShcSmsHistcodeDAC) dac;
	}

	protected Class getDACClass() {
		return ShcSmsHistcodeDAC.class;
	}

	public ShcSmsHistcodeDMO get(ShcSmsHistcodeDMO shcSmsHistcodeDMO)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("get(shcSmsHistcodeDMO)");

		//
		// Check mandatory parameters.
		//
		thrower.ifParameterMissing("shcSmsHistcodeDMO", shcSmsHistcodeDMO);

		//
		// Each attribute that is part of the primary key is mandatory
		//
		thrower.ifParameterMissing("shcSmsHistcodeDMO.actAccId",
				shcSmsHistcodeDMO.getShcHistCode());

		QueryFilter filter = new QueryFilter();
		filter.add(FilterOp.EQUAL, ShcSmsHistcodeDMO.ShcHistCodeFilter,
				shcSmsHistcodeDMO.getShcHistCode());

		//
		// Attempt to get the ShcSmsHistcodeDMO
		//
		ShcSmsHistcodeDMO returnShcSmsHistcodeDMO = shcSmsHistcodeDAC
				.get(filter);

		//
		// Could not find the ShcSmsHistcodeDMO
		//
		if (returnShcSmsHistcodeDMO == null) {
			thrower.business(Base_SHCSMSHISTCODElOOKUP_000,
					new Object[] { shcSmsHistcodeDMO.getShcHistCode() });
		}

		//
		// Now, based on the values of the flags on this method signature, which
		// in turn,
		// are based on this objects associations, get all associated, embedded
		// objects
		//
		return returnShcSmsHistcodeDMO;
	}

	// ==================================================================================================

	public DTOList getList(DTOListState state,
			ShcSmsHistcodeDMO shcSmsHistcodeDMO) throws EPPIXBusinessException,
			EPPIXUnexpectedException, EPPIXFatalException {
		logger.debug("getList( state, shcSmsHistcodeDMO )");

		return shcSmsHistcodeDAC.getList(state, shcSmsHistcodeDMO);
	}

	public ShcSmsHistcodeDMO create(ShcSmsHistcodeDMO shcSmsHistcodeDMO)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("create( shcSmsHistcodeDMO )");

		thrower.ifParameterMissing("shcSmsHistcodeDMO", shcSmsHistcodeDMO);
		thrower.ifParameterMissing("shcSmsHistcodeDMO.shcHistCode",
				shcSmsHistcodeDMO.getShcHistCode());

		//
		// Check that this object does not already exist
		//
		if (exists(shcSmsHistcodeDMO)) {
			thrower.business(Base_SHCSMSHISTCODElOOKUP_001,
					new Object[] { shcSmsHistcodeDMO.getShcHistCode() });
		}

		//
		// Now create the record
		//
		shcSmsHistcodeDAC.create(shcSmsHistcodeDMO);

		return shcSmsHistcodeDMO;
	}

	public ShcSmsHistcodeDMO modify(ShcSmsHistcodeDMO shcSmsHistcodeDMO)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("modify( ashcSmsHistcodeDMO )");

		//
		// Check mandatory parameters (
		//
		// Note: attributes stereotyped <NotModifiable> are ignored
		//
		thrower.ifParameterMissing("shcSmsHistcodeDMO", shcSmsHistcodeDMO);
		thrower.ifParameterMissing("shcSmsHistcodeDMO.shcHistCode",
				shcSmsHistcodeDMO.getShcHistCode());

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
		filter.add(FilterOp.SET, ShcSmsHistcodeDMO.ShcMesgIdFilter,
				shcSmsHistcodeDMO.getShcMesgId());
		filter.add(FilterOp.EQUAL, ShcSmsHistcodeDMO.ShcHistCodeFilter,
				shcSmsHistcodeDMO.getShcHistCode());

		//
		// Modify the shcSmsHistcodeDMO
		//
		shcSmsHistcodeDAC.modify(filter);

		// Create a new ShcSmsHistcodeDMO, set keys, and fetch from the
		// database...
		ShcSmsHistcodeDMO returnShcSmsHistcodeDMO = new ShcSmsHistcodeDMO();

		returnShcSmsHistcodeDMO.setShcHistCode(shcSmsHistcodeDMO
				.getShcHistCode());

		returnShcSmsHistcodeDMO = get(returnShcSmsHistcodeDMO);

		return returnShcSmsHistcodeDMO;
	}

	// ==================================================================================================

	public void modify(QueryFilter filter) throws EPPIXBusinessException,
			EPPIXUnexpectedException, EPPIXFatalException {
		logger.debug("modify( filter )");

		//
		// Modify the shcSmsHistcodeDMO
		//
		shcSmsHistcodeDAC.modify(filter);
	}

	// ==================================================================================================

	public void delete(ShcSmsHistcodeDMO shcSmsHistcodeDMO)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("delete( shcSmsHistcodeDMO )");

		thrower.ifParameterMissing("shcSmsHistcodeDMO", shcSmsHistcodeDMO);

		ShcSmsHistcodeDMO updateShcSmsHistcodeDMO = null;

		updateShcSmsHistcodeDMO = get(shcSmsHistcodeDMO);

		// delete self...
		shcSmsHistcodeDAC.delete(shcSmsHistcodeDMO);
	}

	// ==================================================================================================

	public void delete(QueryFilter filter) throws EPPIXBusinessException,
			EPPIXUnexpectedException, EPPIXFatalException {
		logger.debug("delete( filter )");

		thrower.ifParameterMissing("filter", filter);

		// delete...
		shcSmsHistcodeDAC.delete(filter);
	}

	// ==================================================================================================

	public boolean exists(ShcSmsHistcodeDMO shcSmsHistcodeDMO)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("exists(shcSmsHistcodeDMO)");

		thrower.ifParameterMissing("shcSmsHistcodeDMO", shcSmsHistcodeDMO);

		thrower.ifParameterMissing("shcSmsHistcodeDMO.actAccId",
				shcSmsHistcodeDMO.getShcHistCode());

		return shcSmsHistcodeDAC.exists(shcSmsHistcodeDMO);
	}

	// ==================================================================================================

	public boolean exists(QueryFilter filter) throws EPPIXBusinessException,
			EPPIXUnexpectedException, EPPIXFatalException {
		logger.debug("exists(filter)");

		return shcSmsHistcodeDAC.exists(filter);
	}

	// ==================================================================================================

	public DTOList getList(DTOListState state, QueryFilter filter)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("getList( state, filter )");

		return shcSmsHistcodeDAC.getList(state, filter);
	}

	// ==================================================================================================

	public DAOIterator iterate(QueryFilter filter)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("iterateWithLock( filter )");

		return shcSmsHistcodeDAC.iterate(filter);
	}

	// ==================================================================================================

	public DAOIterator iterateWithLock(QueryFilter filter)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("iterateWithLock( filter )");

		return shcSmsHistcodeDAC.iterateWithLock(filter);
	}

	// ==================================================================================================

	public ShcSmsHistcodeDMO get(QueryFilter filter)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("get( filter )");

		//
		// Check mandatory parameters.
		//
		thrower.ifParameterMissing("filter", filter);

		//
		// Attempt to get the ShcSmsHistcodeDMO
		//
		ShcSmsHistcodeDMO shcSmsHistcodeDMO = shcSmsHistcodeDAC.get(filter);

		return shcSmsHistcodeDMO;
	}

	// ==================================================================================================

	public Object max(QueryFilter filter) throws EPPIXBusinessException,
			EPPIXUnexpectedException, EPPIXFatalException {
		logger.debug("max( filter )");

		//
		// Check mandatory parameters.
		//
		thrower.ifParameterMissing("filter", filter);

		return shcSmsHistcodeDAC.max(filter);
	}

	// ==================================================================================================

	public Object min(QueryFilter filter) throws EPPIXBusinessException,
			EPPIXUnexpectedException, EPPIXFatalException {
		logger.debug("min( filter )");

		//
		// Check mandatory parameters.
		//
		thrower.ifParameterMissing("filter", filter);

		return shcSmsHistcodeDAC.min(filter);
	}

	// ==================================================================================================

	public Integer count(QueryFilter filter) throws EPPIXBusinessException,
			EPPIXUnexpectedException, EPPIXFatalException {
		logger.debug("count( filter )");

		//
		// Check mandatory parameters.
		//
		thrower.ifParameterMissing("filter", filter);

		return Integer.valueOf(shcSmsHistcodeDAC.count(filter));
	}
	// ==================================================================================================

}