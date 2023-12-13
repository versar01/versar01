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

public class SdcDualCallAbstractBLO extends BaseBLO implements DTOActionTypes,
		BaseMessages {

	static Thrower thrower = Thrower.getThrower(SdcDualCallAbstractBLO.class);

	protected static final String ENTITY_ID = "SDC";

	/** Data Access Controller. */
	protected SdcDualCallDAC sdcDualCallDAC;
	/** DOCUMENT ME! */
	protected Logger logger = thrower.getLogger();

	/** Invoked by the BLOBinder to provide this BLO with its DAC. */
	protected void setDAC(DAC dac) {
		this.sdcDualCallDAC = (SdcDualCallDAC) dac;
	}

	protected Class getDACClass() {
		return SdcDualCallDAC.class;
	}

	public SdcDualCallDMO get(SdcDualCallDMO sdcDualCallDMO)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("get(sdcDualCallDMO)");

		//
		// Check mandatory parameters.
		//
		thrower.ifParameterMissing("sdcDualCallDMO", sdcDualCallDMO);

		//
		// Each attribute that is part of the primary key is mandatory
		//
		thrower.ifParameterMissing("sdcDualCallDMO.sdcSecondMsisdn",
				sdcDualCallDMO.getSdcSecondMsisdn());

		thrower.ifParameterMissing("sdcDualCallDMO.sdcFirstMsisdn",
				sdcDualCallDMO.getSdcFirstMsisdn());

		thrower.ifParameterMissing("sdcDualCallDMO.sdcLinkDate",
				sdcDualCallDMO.getSdcLinkDate());

		QueryFilter filter = new QueryFilter();
		filter.add(FilterOp.EQUAL, SdcDualCallDMO.SdcSecondMsisdnFilter,
				sdcDualCallDMO.getSdcSecondMsisdn());
		filter.add(FilterOp.EQUAL, SdcDualCallDMO.SdcFirstMsisdnFilter,
				sdcDualCallDMO.getSdcFirstMsisdn());
		filter.add(FilterOp.EQUAL, SdcDualCallDMO.SdcLinkDateFilter,
				sdcDualCallDMO.getSdcLinkDate());

		//
		// Attempt to get the SdcDualCallDMO
		//
		SdcDualCallDMO returnSdcDualCallDMO = sdcDualCallDAC.get(filter);

		//
		// Could not find the SdcDualCallDMO
		//
		if (returnSdcDualCallDMO == null) {
			thrower.business(Base_ACTACCTYPES_000,
					new Object[] { sdcDualCallDMO.getSdcFirstMsisdn() });
		}

		//
		// Now, based on the values of the flags on this method signature, which
		// in turn,
		// are based on this objects associations, get all associated, embedded
		// objects
		//
		return returnSdcDualCallDMO;
	}

	// ==================================================================================================

	public DTOList getList(DTOListState state, SdcDualCallDMO sdcDualCallDMO)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("getList( state, sdcDualCallDMO )");

		return sdcDualCallDAC.getList(state, sdcDualCallDMO);
	}

	public SdcDualCallDMO create(SdcDualCallDMO sdcDualCallDMO)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("create( sdcDualCallDMO )");

		thrower.ifParameterMissing("sdcDualCallDMO", sdcDualCallDMO);

		thrower.ifParameterMissing("sdcDualCallDMO.sdcSecondMsisdn",
				sdcDualCallDMO.getSdcSecondMsisdn());

		thrower.ifParameterMissing("sdcDualCallDMO.sdcFirstMsisdn",
				sdcDualCallDMO.getSdcFirstMsisdn());

		thrower.ifParameterMissing("sdcDualCallDMO.sdcLinkDate",
				sdcDualCallDMO.getSdcLinkDate());

		//
		// Check that this object does not already exist
		//
		if (exists(sdcDualCallDMO)) {
			thrower.business(Base_ACTACCTYPES_001,
					new Object[] { sdcDualCallDMO.getSdcFirstMsisdn() });
		}

		//
		// Now create the record
		//
		sdcDualCallDAC.create(sdcDualCallDMO);

		return sdcDualCallDMO;
	}

	public SdcDualCallDMO modify(SdcDualCallDMO sdcDualCallDMO)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("modify( asdcDualCallDMO )");

		//
		// Check mandatory parameters (
		//
		// Note: attributes stereotyped <NotModifiable> are ignored
		//
		thrower.ifParameterMissing("sdcDualCallDMO", sdcDualCallDMO);

		thrower.ifParameterMissing("sdcDualCallDMO.sdcSecondMsisdn",
				sdcDualCallDMO.getSdcSecondMsisdn());

		thrower.ifParameterMissing("sdcDualCallDMO.sdcFirstMsisdn",
				sdcDualCallDMO.getSdcFirstMsisdn());

		thrower.ifParameterMissing("sdcDualCallDMO.sdcLinkDate",
				sdcDualCallDMO.getSdcLinkDate());

		QueryFilter filter = new QueryFilter();
		filter.add(FilterOp.SET, SdcDualCallDMO.SdcExpiryDateFilter,
				sdcDualCallDMO.getSdcExpiryDate());
		filter.add(FilterOp.SET, SdcDualCallDMO.SdcServiceCodeFilter,
				sdcDualCallDMO.getSdcServiceCode());
		filter.add(FilterOp.SET, SdcDualCallDMO.SdcSubscriberIdFilter,
				sdcDualCallDMO.getSdcSubscriberId());

		filter.add(FilterOp.EQUAL, SdcDualCallDMO.SdcSecondMsisdnFilter,
				sdcDualCallDMO.getSdcSecondMsisdn());
		filter.add(FilterOp.EQUAL, SdcDualCallDMO.SdcFirstMsisdnFilter,
				sdcDualCallDMO.getSdcFirstMsisdn());
		filter.add(FilterOp.EQUAL, SdcDualCallDMO.SdcLinkDateFilter,
				sdcDualCallDMO.getSdcLinkDate());

		//
		// Modify the sdcDualCallDMO
		//
		sdcDualCallDAC.modify(filter);

		// Create a new SdcDualCallDMO, set keys, and fetch from the database...
		SdcDualCallDMO returnSdcDualCallDMO = new SdcDualCallDMO();

		returnSdcDualCallDMO.setSdcSecondMsisdn(sdcDualCallDMO
				.getSdcSecondMsisdn());
		returnSdcDualCallDMO.setSdcFirstMsisdn(sdcDualCallDMO
				.getSdcFirstMsisdn());
		returnSdcDualCallDMO.setSdcLinkDate(sdcDualCallDMO.getSdcLinkDate());

		returnSdcDualCallDMO = get(returnSdcDualCallDMO);

		return returnSdcDualCallDMO;
	}

	// ==================================================================================================

	public void modify(QueryFilter filter) throws EPPIXBusinessException,
			EPPIXUnexpectedException, EPPIXFatalException {
		logger.debug("modify( filter )");

		//
		// Modify the sdcDualCallDMO
		//
		sdcDualCallDAC.modify(filter);
	}

	// ==================================================================================================

	public void delete(SdcDualCallDMO sdcDualCallDMO)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("delete( sdcDualCallDMO )");

		thrower.ifParameterMissing("sdcDualCallDMO", sdcDualCallDMO);

		thrower.ifParameterMissing("sdcDualCallDMO.sdcSecondMsisdn",
				sdcDualCallDMO.getSdcSecondMsisdn());

		thrower.ifParameterMissing("sdcDualCallDMO.sdcFirstMsisdn",
				sdcDualCallDMO.getSdcFirstMsisdn());

		thrower.ifParameterMissing("sdcDualCallDMO.sdcLinkDate",
				sdcDualCallDMO.getSdcLinkDate());

		SdcDualCallDMO updateSdcDualCallDMO = null;

		updateSdcDualCallDMO = get(sdcDualCallDMO);

		// delete self...
		sdcDualCallDAC.delete(sdcDualCallDMO);
	}

	// ==================================================================================================

	public void delete(QueryFilter filter) throws EPPIXBusinessException,
			EPPIXUnexpectedException, EPPIXFatalException {
		logger.debug("delete( filter )");

		thrower.ifParameterMissing("filter", filter);

		// delete...
		sdcDualCallDAC.delete(filter);
	}

	// ==================================================================================================

	public boolean exists(SdcDualCallDMO sdcDualCallDMO)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("exists(sdcDualCallDMO)");

		thrower.ifParameterMissing("sdcDualCallDMO", sdcDualCallDMO);

		thrower.ifParameterMissing("sdcDualCallDMO.sdcSecondMsisdn",
				sdcDualCallDMO.getSdcSecondMsisdn());

		thrower.ifParameterMissing("sdcDualCallDMO.sdcFirstMsisdn",
				sdcDualCallDMO.getSdcFirstMsisdn());

		thrower.ifParameterMissing("sdcDualCallDMO.sdcLinkDate",
				sdcDualCallDMO.getSdcLinkDate());

		return sdcDualCallDAC.exists(sdcDualCallDMO);
	}

	// ==================================================================================================

	public boolean exists(QueryFilter filter) throws EPPIXBusinessException,
			EPPIXUnexpectedException, EPPIXFatalException {
		logger.debug("exists(filter)");

		return sdcDualCallDAC.exists(filter);
	}

	// ==================================================================================================

	public DTOList getList(DTOListState state, QueryFilter filter)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("getList( state, filter )");

		return sdcDualCallDAC.getList(state, filter);
	}

	// ==================================================================================================

	public DAOIterator iterate(QueryFilter filter)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("iterateWithLock( filter )");

		return sdcDualCallDAC.iterate(filter);
	}

	// ==================================================================================================

	public DAOIterator iterateWithLock(QueryFilter filter)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("iterateWithLock( filter )");

		return sdcDualCallDAC.iterateWithLock(filter);
	}

	// ==================================================================================================

	public SdcDualCallDMO get(QueryFilter filter)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("get( filter )");

		//
		// Check mandatory parameters.
		//
		thrower.ifParameterMissing("filter", filter);

		//
		// Attempt to get the SdcDualCallDMO
		//
		SdcDualCallDMO sdcDualCallDMO = sdcDualCallDAC.get(filter);

		return sdcDualCallDMO;
	}

	// ==================================================================================================

	public Object max(QueryFilter filter) throws EPPIXBusinessException,
			EPPIXUnexpectedException, EPPIXFatalException {
		logger.debug("max( filter )");

		//
		// Check mandatory parameters.
		//
		thrower.ifParameterMissing("filter", filter);

		return sdcDualCallDAC.max(filter);
	}

	// ==================================================================================================

	public Object min(QueryFilter filter) throws EPPIXBusinessException,
			EPPIXUnexpectedException, EPPIXFatalException {
		logger.debug("min( filter )");

		//
		// Check mandatory parameters.
		//
		thrower.ifParameterMissing("filter", filter);

		return sdcDualCallDAC.min(filter);
	}

	// ==================================================================================================

	public Integer count(QueryFilter filter) throws EPPIXBusinessException,
			EPPIXUnexpectedException, EPPIXFatalException {
		logger.debug("count( filter )");

		//
		// Check mandatory parameters.
		//
		thrower.ifParameterMissing("filter", filter);

		return Integer.valueOf(sdcDualCallDAC.count(filter));
	}
	// ==================================================================================================

}