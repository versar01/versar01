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

public class SvcSubVrCcardAbstractBLO extends BaseBLO implements
		DTOActionTypes, BaseMessages {

	static Thrower thrower = Thrower.getThrower(SvcSubVrCcardAbstractBLO.class);

	protected static final String ENTITY_ID = "SVC";

	/** Data Access Controller. */
	protected SvcSubVrCcardDAC svcSubVrCcardDAC;
	/** DOCUMENT ME! */
	protected Logger logger = thrower.getLogger();

	/** Invoked by the BLOBinder to provide this BLO with its DAC. */
	protected void setDAC(DAC dac) {
		this.svcSubVrCcardDAC = (SvcSubVrCcardDAC) dac;
	}

	protected Class getDACClass() {
		return SvcSubVrCcardDAC.class;
	}

	public SvcSubVrCcardDMO get(SvcSubVrCcardDMO svcSubVrCcardDMO)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("get(svcSubVrCcardDMO)");

		//
		// Check mandatory parameters.
		//
		thrower.ifParameterMissing("svcSubVrCcardDMO", svcSubVrCcardDMO);

		//
		// Each attribute that is part of the primary key is mandatory
		//
		thrower.ifParameterMissing("svcSubVrCcardDMO.svcMsisdnNo",
				svcSubVrCcardDMO.getSvcMsisdnNo());

		QueryFilter filter = new QueryFilter();
		filter.add(FilterOp.EQUAL, SvcSubVrCcardDMO.SvcMsisdnNoFilter,
				svcSubVrCcardDMO.getSvcMsisdnNo());
		//
		// Attempt to get the SvcSubVrCcardDMO
		//
		SvcSubVrCcardDMO returnSvcSubVrCcardDMO = svcSubVrCcardDAC.get(filter);

		//
		// Could not find the SvcSubVrCcardDMO
		//
		if (returnSvcSubVrCcardDMO == null) {
			thrower.business(Base_SVCSUBVRCCARDlOOKUP_001,
					new Object[] { svcSubVrCcardDMO.getSvcMsisdnNo() });
		}

		//
		// Now, based on the values of the flags on this method signature, which
		// in turn,
		// are based on this objects associations, get all associated, embedded
		// objects
		//
		return returnSvcSubVrCcardDMO;
	}

	// ==================================================================================================

	public DTOList getList(DTOListState state, SvcSubVrCcardDMO svcSubVrCcardDMO)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("getList( state, svcSubVrCcardDMO )");

		return svcSubVrCcardDAC.getList(state, svcSubVrCcardDMO);
	}

	public SvcSubVrCcardDMO create(SvcSubVrCcardDMO svcSubVrCcardDMO)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("create( svcSubVrCcardDMO )");

		thrower.ifParameterMissing("svcSubVrCcardDMO", svcSubVrCcardDMO);
		thrower.ifParameterMissing("svcSubVrCcardDMO.dpfFolderId",
				svcSubVrCcardDMO.getSvcMsisdnNo());

		//
		// Check that this object does not already exist
		//
		if (exists(svcSubVrCcardDMO)) {
			thrower.business(Base_SVCSUBVRCCARDlOOKUP_001,
					new Object[] { svcSubVrCcardDMO.getSvcMsisdnNo() });
		}

		//
		// Now create the record
		//
		svcSubVrCcardDAC.create(svcSubVrCcardDMO);

		return svcSubVrCcardDMO;
	}

	public SvcSubVrCcardDMO modify(SvcSubVrCcardDMO svcSubVrCcardDMO)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("modify( asvcSubVrCcardDMO )");

		//
		// Check mandatory parameters (
		//
		// Note: attributes stereotyped <NotModifiable> are ignored
		//
		thrower.ifParameterMissing("svcSubVrCcardDMO", svcSubVrCcardDMO);
		thrower.ifParameterMissing("svcSubVrCcardDMO.svcMsisdnNo",
				svcSubVrCcardDMO.getSvcMsisdnNo());

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
		filter.add(FilterOp.SET, SvcSubVrCcardDMO.SvcCcardNoFilter,
				svcSubVrCcardDMO.getSvcCcardNo());
		filter.add(FilterOp.SET, SvcSubVrCcardDMO.SvcCcardTypeFilter,
				svcSubVrCcardDMO.getSvcCcardType());
		filter.add(FilterOp.SET, SvcSubVrCcardDMO.SvcCvvNumberFilter,
				svcSubVrCcardDMO.getSvcCvvNumber());
		filter.add(FilterOp.SET, SvcSubVrCcardDMO.SvcCcardExpiryFilter,
				svcSubVrCcardDMO.getSvcCcardExpiry());

		filter.add(FilterOp.EQUAL, SvcSubVrCcardDMO.SvcMsisdnNoFilter,
				svcSubVrCcardDMO.getSvcMsisdnNo());

		//
		// Modify the svcSubVrCcardDMO
		//
		svcSubVrCcardDAC.modify(filter);

		// Create a new SvcSubVrCcardDMO, set keys, and fetch from the
		// database...
		SvcSubVrCcardDMO returnSvcSubVrCcardDMO = new SvcSubVrCcardDMO();

		returnSvcSubVrCcardDMO
				.setSvcMsisdnNo(svcSubVrCcardDMO.getSvcMsisdnNo());

		returnSvcSubVrCcardDMO = get(returnSvcSubVrCcardDMO);

		return returnSvcSubVrCcardDMO;
	}

	// ==================================================================================================

	public void modify(QueryFilter filter) throws EPPIXBusinessException,
			EPPIXUnexpectedException, EPPIXFatalException {
		logger.debug("modify( filter )");

		//
		// Modify the svcSubVrCcardDMO
		//
		svcSubVrCcardDAC.modify(filter);
	}

	// ==================================================================================================

	public void delete(SvcSubVrCcardDMO svcSubVrCcardDMO)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("delete( svcSubVrCcardDMO )");

		thrower.ifParameterMissing("svcSubVrCcardDMO", svcSubVrCcardDMO);

		SvcSubVrCcardDMO updateSvcSubVrCcardDMO = null;

		updateSvcSubVrCcardDMO = get(svcSubVrCcardDMO);

		// delete self...
		svcSubVrCcardDAC.delete(svcSubVrCcardDMO);
	}

	// ==================================================================================================

	public void delete(QueryFilter filter) throws EPPIXBusinessException,
			EPPIXUnexpectedException, EPPIXFatalException {
		logger.debug("delete( filter )");

		thrower.ifParameterMissing("filter", filter);

		// delete...
		svcSubVrCcardDAC.delete(filter);
	}

	// ==================================================================================================

	public boolean exists(SvcSubVrCcardDMO svcSubVrCcardDMO)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("exists(svcSubVrCcardDMO)");

		thrower.ifParameterMissing("svcSubVrCcardDMO", svcSubVrCcardDMO);

		thrower.ifParameterMissing("svcSubVrCcardDMO.actAccId",
				svcSubVrCcardDMO.getSvcMsisdnNo());

		return svcSubVrCcardDAC.exists(svcSubVrCcardDMO);
	}

	// ==================================================================================================

	public boolean exists(QueryFilter filter) throws EPPIXBusinessException,
			EPPIXUnexpectedException, EPPIXFatalException {
		logger.debug("exists(filter)");

		return svcSubVrCcardDAC.exists(filter);
	}

	// ==================================================================================================

	public DTOList getList(DTOListState state, QueryFilter filter)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("getList( state, filter )");

		return svcSubVrCcardDAC.getList(state, filter);
	}

	// ==================================================================================================

	public DAOIterator iterate(QueryFilter filter)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("iterateWithLock( filter )");

		return svcSubVrCcardDAC.iterate(filter);
	}

	// ==================================================================================================

	public DAOIterator iterateWithLock(QueryFilter filter)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("iterateWithLock( filter )");

		return svcSubVrCcardDAC.iterateWithLock(filter);
	}

	// ==================================================================================================

	public SvcSubVrCcardDMO get(QueryFilter filter)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("get( filter )");

		//
		// Check mandatory parameters.
		//
		thrower.ifParameterMissing("filter", filter);

		//
		// Attempt to get the SvcSubVrCcardDMO
		//
		SvcSubVrCcardDMO svcSubVrCcardDMO = svcSubVrCcardDAC.get(filter);

		return svcSubVrCcardDMO;
	}

	// ==================================================================================================

	public Object max(QueryFilter filter) throws EPPIXBusinessException,
			EPPIXUnexpectedException, EPPIXFatalException {
		logger.debug("max( filter )");

		//
		// Check mandatory parameters.
		//
		thrower.ifParameterMissing("filter", filter);

		return svcSubVrCcardDAC.max(filter);
	}

	// ==================================================================================================

	public Object min(QueryFilter filter) throws EPPIXBusinessException,
			EPPIXUnexpectedException, EPPIXFatalException {
		logger.debug("min( filter )");

		//
		// Check mandatory parameters.
		//
		thrower.ifParameterMissing("filter", filter);

		return svcSubVrCcardDAC.min(filter);
	}

	// ==================================================================================================

	public Integer count(QueryFilter filter) throws EPPIXBusinessException,
			EPPIXUnexpectedException, EPPIXFatalException {
		logger.debug("count( filter )");

		//
		// Check mandatory parameters.
		//
		thrower.ifParameterMissing("filter", filter);

		return Integer.valueOf(svcSubVrCcardDAC.count(filter));
	}
	// ==================================================================================================

}