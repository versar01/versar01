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

public class SsrServiceReqAbstractBLO extends BaseBLO implements
		DTOActionTypes, BaseMessages {

	static Thrower thrower = Thrower
			.getThrower(SsrServiceReqAbstractBLO.class);

	protected static final String ENTITY_ID = "FS";

	/** Data Access Controller. */
	protected SsrServiceReqDAC ssrSelfServRecurrDAC;
	/** DOCUMENT ME! */
	protected Logger logger = thrower.getLogger();

	/** Invoked by the BLOBinder to provide this BLO with its DAC. */
	protected void setDAC(DAC dac) {
		this.ssrSelfServRecurrDAC = (SsrServiceReqDAC) dac;
	}

	protected Class getDACClass() {
		return SsrServiceReqDAC.class;
	}

	public SsrServiceReqDMO get(SsrServiceReqDMO ssrSelfServRecurrDMO)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("get(ssrSelfServRecurrDMO)");

		//
		// Check mandatory parameters.
		//
		thrower.ifParameterMissing("ssrSelfServRecurrDMO", ssrSelfServRecurrDMO);

		//
		// Each attribute that is part of the primary key is mandatory
		//
		thrower.ifParameterMissing("ssrSelfServRecurrDMO.ssrMsisdnNo",
				ssrSelfServRecurrDMO.getSsrMsisdnNo());
		
		thrower.ifParameterMissing("ssrSelfServRecurrDMO.ssrReferenceNo",
				ssrSelfServRecurrDMO.getSsrReferenceNo());
		
		thrower.ifParameterMissing("ssrSelfServRecurrDMO.ssrActionReq",
				ssrSelfServRecurrDMO.getSsrActionReq());

		//
		// Attempt to get the SsrSelfServRecurrDMO
		//
		
		QueryFilter filter = new QueryFilter();
		filter.add(FilterOp.EQUAL, SsrServiceReqDMO.ssrMsisdnNoFilter, ssrSelfServRecurrDMO.getSsrMsisdnNo());
		filter.add(FilterOp.EQUAL, SsrServiceReqDMO.ssrReferenceNoFilter, ssrSelfServRecurrDMO.getSsrReferenceNo());
		filter.add(FilterOp.EQUAL, SsrServiceReqDMO.ssrActionReqFilter, ssrSelfServRecurrDMO.getSsrActionReq());
		
		
		
		SsrServiceReqDMO returnSsrSelfServRecurrDMO = ssrSelfServRecurrDAC
				.get(filter);

		//
		// Could not find the SsrSelfServRecurrDMO
		//
		if (returnSsrSelfServRecurrDMO == null) {
			thrower.business(Base_SSRSELFSERVRECURRlOOKUP_000,
					new Object[] { ssrSelfServRecurrDMO.getSsrMsisdnNo() });
		}

		//
		// Now, based on the values of the flags on this method signature, which
		// in turn,
		// are based on this objects associations, get all associated, embedded
		// objects
		//
		return returnSsrSelfServRecurrDMO;
	}

	// ==================================================================================================

	public DTOList getList(DTOListState state,
			SsrServiceReqDMO ssrSelfServRecurrDMO)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("getList( state, ssrSelfServRecurrDMO )");

		return ssrSelfServRecurrDAC.getList(state, ssrSelfServRecurrDMO);
	}

	public SsrServiceReqDMO create(SsrServiceReqDMO ssrSelfServRecurrDMO)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("create( ssrSelfServRecurrDMO )");

		thrower.ifParameterMissing("ssrSelfServRecurrDMO", ssrSelfServRecurrDMO);
		thrower.ifParameterMissing("ssrSelfServRecurrDMO.ssrMsisdnNo",
				ssrSelfServRecurrDMO.getSsrMsisdnNo());

//		//
//		// Check that this object does not already exist
//		//
//		if (exists(ssrSelfServRecurrDMO)) {
//			thrower.business(Base_ACTACCTYPES_001,
//					new Object[] { ssrSelfServRecurrDMO.getSsrMsisdnNo() });
//		}

		//
		// Now create the record
		//
		ssrSelfServRecurrDAC.create(ssrSelfServRecurrDMO);

		return ssrSelfServRecurrDMO;
	}

//	public SsrSelfServRecurrDMO modify(SsrSelfServRecurrDMO ssrSelfServRecurrDMO)
//			throws EPPIXBusinessException, EPPIXUnexpectedException,
//			EPPIXFatalException {
//		logger.debug("modify( assrSelfServRecurrDMO )");
//
//		//
//		// Check mandatory parameters (
//		//
//		// Note: attributes stereotyped <NotModifiable> are ignored
//		//
//		thrower.ifParameterMissing("ssrSelfServRecurrDMO", ssrSelfServRecurrDMO);
//		thrower.ifParameterMissing("ssrSelfServRecurrDMO.ssrMsisdnNo",
//				ssrSelfServRecurrDMO.getSsrMsisdnNo());
//
//		SsrSelfServRecurrDMO updateSsrSelfServRecurrDMO = new SsrSelfServRecurrDMO();
//
//		updateSsrSelfServRecurrDMO.setSsrMsisdnNo(ssrSelfServRecurrDMO
//				.getSsrMsisdnNo());
//
//		updateSsrSelfServRecurrDMO = get(updateSsrSelfServRecurrDMO);
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
//		updateSsrSelfServRecurrDMO.setSsrMsisdnNo(ssrSelfServRecurrDMO
//				.getSsrMsisdnNo());
//
//		//
//		// Modify the ssrSelfServRecurrDMO
//		//
//		ssrSelfServRecurrDAC.modify(updateSsrSelfServRecurrDMO);
//
//		// Create a new SsrSelfServRecurrDMO, set keys, and fetch from the
//		// database...
//		SsrSelfServRecurrDMO returnSsrSelfServRecurrDMO = new SsrSelfServRecurrDMO();
//
//		returnSsrSelfServRecurrDMO.setSsrMsisdnNo(updateSsrSelfServRecurrDMO
//				.getSsrMsisdnNo());
//
//		returnSsrSelfServRecurrDMO = get(returnSsrSelfServRecurrDMO);
//
//		return returnSsrSelfServRecurrDMO;
//	}

	// ==================================================================================================

	public void modify(QueryFilter filter) throws EPPIXBusinessException,
			EPPIXUnexpectedException, EPPIXFatalException {
		logger.debug("modify( filter )");
		
		thrower.ifParameterMissing("Filter", filter);

		//
		// Each attribute that is part of the primary key is mandatory
		//
		// Modify the ssrSelfServRecurrDMO
		//
		ssrSelfServRecurrDAC.modify(filter);
	}

	// ==================================================================================================

	public void delete(SsrServiceReqDMO ssrSelfServRecurrDMO)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("delete( ssrSelfServRecurrDMO )");

		thrower.ifParameterMissing("ssrSelfServRecurrDMO", ssrSelfServRecurrDMO);

		SsrServiceReqDMO updateSsrSelfServRecurrDMO = null;

		updateSsrSelfServRecurrDMO = get(ssrSelfServRecurrDMO);

		// delete self...
		ssrSelfServRecurrDAC.delete(ssrSelfServRecurrDMO);
	}

	// ==================================================================================================

	public void delete(QueryFilter filter) throws EPPIXBusinessException,
			EPPIXUnexpectedException, EPPIXFatalException {
		logger.debug("delete( filter )");

		thrower.ifParameterMissing("filter", filter);

		// delete...
		ssrSelfServRecurrDAC.delete(filter);
	}

	// ==================================================================================================

	public boolean exists(SsrServiceReqDMO ssrSelfServRecurrDMO)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("exists(ssrSelfServRecurrDMO)");

		thrower.ifParameterMissing("ssrSelfServRecurrDMO", ssrSelfServRecurrDMO);

		thrower.ifParameterMissing("ssrSelfServRecurrDMO.ssrMsisdnNo",
				ssrSelfServRecurrDMO.getSsrMsisdnNo());

		return ssrSelfServRecurrDAC.exists(ssrSelfServRecurrDMO);
	}

	// ==================================================================================================

	public boolean exists(QueryFilter filter) throws EPPIXBusinessException,
			EPPIXUnexpectedException, EPPIXFatalException {
		logger.debug("exists(filter)");

		return ssrSelfServRecurrDAC.exists(filter);
	}

	// ==================================================================================================

	public DTOList getList(DTOListState state, QueryFilter filter)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("getList( state, filter )");

		return ssrSelfServRecurrDAC.getList(state, filter);
	}

	// ==================================================================================================

	public DAOIterator iterate(QueryFilter filter)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("iterateWithLock( filter )");

		return ssrSelfServRecurrDAC.iterate(filter);
	}

	// ==================================================================================================

	public DAOIterator iterateWithLock(QueryFilter filter)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("iterateWithLock( filter )");

		return ssrSelfServRecurrDAC.iterateWithLock(filter);
	}

	// ==================================================================================================

	public SsrServiceReqDMO get(QueryFilter filter)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("get( filter )");

		//
		// Check mandatory parameters.
		//
		thrower.ifParameterMissing("filter", filter);

		//
		// Attempt to get the SsrSelfServRecurrDMO
		//
		SsrServiceReqDMO ssrSelfServRecurrDMO = ssrSelfServRecurrDAC
				.get(filter);

		return ssrSelfServRecurrDMO;
	}

	// ==================================================================================================

	public Object max(QueryFilter filter) throws EPPIXBusinessException,
			EPPIXUnexpectedException, EPPIXFatalException {
		logger.debug("max( filter )");

		//
		// Check mandatory parameters.
		//
		thrower.ifParameterMissing("filter", filter);

		return ssrSelfServRecurrDAC.max(filter);
	}

	// ==================================================================================================

	public Object min(QueryFilter filter) throws EPPIXBusinessException,
			EPPIXUnexpectedException, EPPIXFatalException {
		logger.debug("min( filter )");

		//
		// Check mandatory parameters.
		//
		thrower.ifParameterMissing("filter", filter);

		return ssrSelfServRecurrDAC.min(filter);
	}

	// ==================================================================================================

	public Integer count(QueryFilter filter) throws EPPIXBusinessException,
			EPPIXUnexpectedException, EPPIXFatalException {
		logger.debug("count( filter )");

		//
		// Check mandatory parameters.
		//
		thrower.ifParameterMissing("filter", filter);

		return Integer.valueOf(ssrSelfServRecurrDAC.count(filter));
	}
	// ==================================================================================================

}