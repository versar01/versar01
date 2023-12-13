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

public class SbhdSplitBillHdAbstractBLO extends BaseBLO implements
		DTOActionTypes, BaseMessages {

	static Thrower thrower = Thrower
			.getThrower(SbhdSplitBillHdAbstractBLO.class);

	protected static final String ENTITY_ID = "SBHD";

	/** Data Access Controller. */
	protected SbhdSplitBillHdDAC sbhdSplitBillHdDAC;
	/** DOCUMENT ME! */
	protected Logger logger = thrower.getLogger();

	/** Invoked by the BLOBinder to provide this BLO with its DAC. */
	protected void setDAC(DAC dac) {
		this.sbhdSplitBillHdDAC = (SbhdSplitBillHdDAC) dac;
	}

	protected Class getDACClass() {
		return SbhdSplitBillHdDAC.class;
	}

	public SbhdSplitBillHdDMO get(SbhdSplitBillHdDMO sbhdSplitBillHdDMO)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("get(sbhdSplitBillHdDMO)");

		//
		// Check mandatory parameters.
		//
		thrower.ifParameterMissing("sbhdSplitBillHdDMO", sbhdSplitBillHdDMO);

		//
		// Each attribute that is part of the primary key is mandatory
		//
		thrower.ifParameterMissing("sbhdSplitBillHdDMO.sbhdSubscriberId",
				sbhdSplitBillHdDMO.getSbhdSubscriberId());
		thrower.ifParameterMissing("sbhdSplitBillHdDMO.sbhdChildAcNo",
				sbhdSplitBillHdDMO.getSbhdChildAcNo());
		thrower.ifParameterMissing("sbhdSplitBillHdDMO.sbhdChildMsisdn",
				sbhdSplitBillHdDMO.getSbhdChildMsisdn());
		thrower.ifParameterMissing("sbhdSplitBillHdDMO.sbhdParentAcNo",
				sbhdSplitBillHdDMO.getSbhdParentAcNo());
		thrower.ifParameterMissing("sbhdSplitBillHdDMO.sbhdParentMsisdn",
				sbhdSplitBillHdDMO.getSbhdParentMsisdn());

		QueryFilter filter = new QueryFilter();
		filter.add(FilterOp.EQUAL, SbhdSplitBillHdDMO.SbhdSubscriberIdFilter,sbhdSplitBillHdDMO.getSbhdSubscriberId());
		filter.add(FilterOp.EQUAL, SbhdSplitBillHdDMO.SbhdChildAcNoFilter,sbhdSplitBillHdDMO.getSbhdChildAcNo());
		filter.add(FilterOp.EQUAL, SbhdSplitBillHdDMO.SbhdChildMsisdnFilter,sbhdSplitBillHdDMO.getSbhdChildMsisdn());
		filter.add(FilterOp.EQUAL, SbhdSplitBillHdDMO.SbhdParentAcNoFilter,sbhdSplitBillHdDMO.getSbhdParentAcNo());
		filter.add(FilterOp.EQUAL, SbhdSplitBillHdDMO.SbhdParentMsisdnFilter,sbhdSplitBillHdDMO.getSbhdParentMsisdn());

		//
		// Attempt to get the SbhdSplitBillHdDMO
		//
		SbhdSplitBillHdDMO returnSbhdSplitBillHdDMO = sbhdSplitBillHdDAC
				.get(filter);

		//
		// Could not find the SbhdSplitBillHdDMO
		//
		if (returnSbhdSplitBillHdDMO == null) {
			thrower.business(Base_SBHDSPLITBILLHDlOOKUP_001,
					new Object[] { sbhdSplitBillHdDMO.getSbhdSubscriberId() });
		}

		//
		// Now, based on the values of the flags on this method signature, which
		// in turn,
		// are based on this objects associations, get all associated, embedded
		// objects
		//
		return returnSbhdSplitBillHdDMO;
	}

	// ==================================================================================================

	public DTOList getList(DTOListState state,
			SbhdSplitBillHdDMO sbhdSplitBillHdDMO)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("getList( state, sbhdSplitBillHdDMO )");

		return sbhdSplitBillHdDAC.getList(state, sbhdSplitBillHdDMO);
	}

	public SbhdSplitBillHdDMO create(SbhdSplitBillHdDMO sbhdSplitBillHdDMO)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("create( sbhdSplitBillHdDMO )");

		thrower.ifParameterMissing("sbhdSplitBillHdDMO", sbhdSplitBillHdDMO);
		thrower.ifParameterMissing("sbhdSplitBillHdDMO.dpfFolderId",
				sbhdSplitBillHdDMO.getSbhdSbId());

		//
		// Check that this object does not already exist
		//
		if (exists(sbhdSplitBillHdDMO)) {
			thrower.business(Base_SBHDSPLITBILLHDlOOKUP_001,
					new Object[] { sbhdSplitBillHdDMO.getSbhdSbId() });
		}

		//
		// Now create the record
		//
		sbhdSplitBillHdDAC.create(sbhdSplitBillHdDMO);

		return sbhdSplitBillHdDMO;
	}

	public SbhdSplitBillHdDMO modify(SbhdSplitBillHdDMO sbhdSplitBillHdDMO)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("modify( asbhdSplitBillHdDMO )");

		//
		// Check mandatory parameters (
		//
		// Note: attributes stereotyped <NotModifiable> are ignored
		//
		thrower.ifParameterMissing("sbhdSplitBillHdDMO", sbhdSplitBillHdDMO);
		thrower.ifParameterMissing( "sbhdSplitBillHdDMO.sbhdSubscriberId",sbhdSplitBillHdDMO.getSbhdSubscriberId());
		thrower.ifParameterMissing( "sbhdSplitBillHdDMO.sbhdChildAcNo",sbhdSplitBillHdDMO.getSbhdChildAcNo());
		thrower.ifParameterMissing( "sbhdSplitBillHdDMO.sbhdChildMsisdn",sbhdSplitBillHdDMO.getSbhdChildMsisdn());
		thrower.ifParameterMissing( "sbhdSplitBillHdDMO.sbhdParentAcNo",sbhdSplitBillHdDMO.getSbhdParentAcNo());
		thrower.ifParameterMissing( "sbhdSplitBillHdDMO.sbhdParentMsisdn",sbhdSplitBillHdDMO.getSbhdParentMsisdn());

		SbhdSplitBillHdDMO updateSbhdSplitBillHdDMO = new SbhdSplitBillHdDMO();

		updateSbhdSplitBillHdDMO.setSbhdSubscriberId(sbhdSplitBillHdDMO.getSbhdSubscriberId());
		updateSbhdSplitBillHdDMO.setSbhdChildAcNo(sbhdSplitBillHdDMO.getSbhdChildAcNo());
		updateSbhdSplitBillHdDMO.setSbhdChildMsisdn(sbhdSplitBillHdDMO.getSbhdChildMsisdn());
		updateSbhdSplitBillHdDMO.setSbhdParentAcNo(sbhdSplitBillHdDMO.getSbhdParentAcNo());
		updateSbhdSplitBillHdDMO.setSbhdParentMsisdn(sbhdSplitBillHdDMO.getSbhdParentMsisdn());
		
		updateSbhdSplitBillHdDMO.setSbhdActDate(sbhdSplitBillHdDMO.getSbhdActDate());
		updateSbhdSplitBillHdDMO.setSbhdBilledUpto(sbhdSplitBillHdDMO.getSbhdBilledUpto());
		updateSbhdSplitBillHdDMO.setSbhdCreditAccum(sbhdSplitBillHdDMO.getSbhdCreditAccum());
		updateSbhdSplitBillHdDMO.setSbhdDdRd(sbhdSplitBillHdDMO.getSbhdDdRd());
		updateSbhdSplitBillHdDMO.setSbhdDeactDate(sbhdSplitBillHdDMO.getSbhdDeactDate());
		updateSbhdSplitBillHdDMO.setSbhdMigrated(sbhdSplitBillHdDMO.getSbhdMigrated());
		updateSbhdSplitBillHdDMO.setSbhdStatus(sbhdSplitBillHdDMO.getSbhdStatus());
		updateSbhdSplitBillHdDMO.setSbhdTotBillAmt(sbhdSplitBillHdDMO.getSbhdTotBillAmt());

		updateSbhdSplitBillHdDMO = get(updateSbhdSplitBillHdDMO);

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
		updateSbhdSplitBillHdDMO.setSbhdSbId(sbhdSplitBillHdDMO.getSbhdSbId());

		QueryFilter filter = new QueryFilter();

		filter.add(FilterOp.SET, SbhdSplitBillHdDMO.SbhdActDateFilter,
				sbhdSplitBillHdDMO.getSbhdActDate());
		filter.add(FilterOp.SET, SbhdSplitBillHdDMO.SbhdBilledUptoFilter,
				sbhdSplitBillHdDMO.getSbhdBilledUpto());
//		filter.add(FilterOp.SET, SbhdSplitBillHdDMO.SbhdChildAcNoFilter,
//				sbhdSplitBillHdDMO.getSbhdChildAcNo());
//		filter.add(FilterOp.SET, SbhdSplitBillHdDMO.SbhdParentMsisdnFilter,
//				sbhdSplitBillHdDMO.getSbhdParentMsisdn());
//		filter.add(FilterOp.SET, SbhdSplitBillHdDMO.SbhdChildMsisdnFilter,
//				sbhdSplitBillHdDMO.getSbhdChildMsisdn());
		filter.add(FilterOp.SET, SbhdSplitBillHdDMO.SbhdCreditAccumFilter,
				sbhdSplitBillHdDMO.getSbhdCreditAccum());
		filter.add(FilterOp.SET, SbhdSplitBillHdDMO.SbhdDdRdFilter,
				sbhdSplitBillHdDMO.getSbhdDdRd());
		filter.add(FilterOp.SET, SbhdSplitBillHdDMO.SbhdDeactDateFilter,
				sbhdSplitBillHdDMO.getSbhdDeactDate());
		filter.add(FilterOp.SET, SbhdSplitBillHdDMO.SbhdMigratedFilter,
				sbhdSplitBillHdDMO.getSbhdMigrated());
//		filter.add(FilterOp.SET, SbhdSplitBillHdDMO.SbhdParentAcNoFilter,
//				sbhdSplitBillHdDMO.getSbhdParentAcNo());
		filter.add(FilterOp.SET, SbhdSplitBillHdDMO.SbhdStatusFilter,
				sbhdSplitBillHdDMO.getSbhdStatus());
//		filter.add(FilterOp.SET, SbhdSplitBillHdDMO.SbhdSubscriberIdFilter,
//				sbhdSplitBillHdDMO.getSbhdSubscriberId());
		filter.add(FilterOp.SET, SbhdSplitBillHdDMO.SbhdTotBillAmtFilter,
				sbhdSplitBillHdDMO.getSbhdTotBillAmt());

		filter.add(FilterOp.EQUAL, SbhdSplitBillHdDMO.SbhdSubscriberIdFilter,sbhdSplitBillHdDMO.getSbhdSubscriberId());
		filter.add(FilterOp.EQUAL, SbhdSplitBillHdDMO.SbhdChildAcNoFilter,sbhdSplitBillHdDMO.getSbhdChildAcNo());
		filter.add(FilterOp.EQUAL, SbhdSplitBillHdDMO.SbhdChildMsisdnFilter,sbhdSplitBillHdDMO.getSbhdChildMsisdn());
		filter.add(FilterOp.EQUAL, SbhdSplitBillHdDMO.SbhdParentAcNoFilter,sbhdSplitBillHdDMO.getSbhdParentAcNo());
		filter.add(FilterOp.EQUAL, SbhdSplitBillHdDMO.SbhdParentMsisdnFilter,sbhdSplitBillHdDMO.getSbhdParentMsisdn());
		//
		// Modify the sbhdSplitBillHdDMO
		//
		sbhdSplitBillHdDAC.modify(filter);

		// Create a new SbhdSplitBillHdDMO, set keys, and fetch from the
		// database...
		SbhdSplitBillHdDMO returnSbhdSplitBillHdDMO = new SbhdSplitBillHdDMO();

		returnSbhdSplitBillHdDMO.setSbhdSubscriberId(sbhdSplitBillHdDMO.getSbhdSubscriberId());
		returnSbhdSplitBillHdDMO.setSbhdChildAcNo(sbhdSplitBillHdDMO.getSbhdChildAcNo());
		returnSbhdSplitBillHdDMO.setSbhdChildMsisdn(sbhdSplitBillHdDMO.getSbhdChildMsisdn());
		returnSbhdSplitBillHdDMO.setSbhdParentAcNo(sbhdSplitBillHdDMO.getSbhdParentAcNo());
		returnSbhdSplitBillHdDMO.setSbhdParentMsisdn(sbhdSplitBillHdDMO.getSbhdParentMsisdn());

		returnSbhdSplitBillHdDMO = get(returnSbhdSplitBillHdDMO);

		return returnSbhdSplitBillHdDMO;
	}

	// ==================================================================================================

	public void modify(QueryFilter filter) throws EPPIXBusinessException,
			EPPIXUnexpectedException, EPPIXFatalException {
		logger.debug("modify( filter )");

		//
		// Modify the sbhdSplitBillHdDMO
		//
		sbhdSplitBillHdDAC.modify(filter);
	}

	// ==================================================================================================

	public void delete(SbhdSplitBillHdDMO sbhdSplitBillHdDMO)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("delete( sbhdSplitBillHdDMO )");

		thrower.ifParameterMissing("sbhdSplitBillHdDMO", sbhdSplitBillHdDMO);
		thrower.ifParameterMissing( "sbhdSplitBillHdDMO.sbhdSubscriberId",sbhdSplitBillHdDMO.getSbhdSubscriberId());
		thrower.ifParameterMissing( "sbhdSplitBillHdDMO.sbhdChildAcNo",sbhdSplitBillHdDMO.getSbhdChildAcNo());
		thrower.ifParameterMissing( "sbhdSplitBillHdDMO.sbhdChildMsisdn",sbhdSplitBillHdDMO.getSbhdChildMsisdn());
		thrower.ifParameterMissing( "sbhdSplitBillHdDMO.sbhdParentAcNo",sbhdSplitBillHdDMO.getSbhdParentAcNo());
		thrower.ifParameterMissing( "sbhdSplitBillHdDMO.sbhdParentMsisdn",sbhdSplitBillHdDMO.getSbhdParentMsisdn());

		SbhdSplitBillHdDMO updateSbhdSplitBillHdDMO = null;

		updateSbhdSplitBillHdDMO = get(sbhdSplitBillHdDMO);

		// delete self...
		sbhdSplitBillHdDAC.delete(sbhdSplitBillHdDMO);
	}

	// ==================================================================================================

	public void delete(QueryFilter filter) throws EPPIXBusinessException,
			EPPIXUnexpectedException, EPPIXFatalException {
		logger.debug("delete( filter )");

		thrower.ifParameterMissing("filter", filter);

		// delete...
		sbhdSplitBillHdDAC.delete(filter);
	}

	// ==================================================================================================

	public boolean exists(SbhdSplitBillHdDMO sbhdSplitBillHdDMO)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("exists(sbhdSplitBillHdDMO)");

		thrower.ifParameterMissing("sbhdSplitBillHdDMO", sbhdSplitBillHdDMO);

		thrower.ifParameterMissing( "sbhdSplitBillHdDMO.sbhdSubscriberId",sbhdSplitBillHdDMO.getSbhdSubscriberId());
		thrower.ifParameterMissing( "sbhdSplitBillHdDMO.sbhdChildAcNo",sbhdSplitBillHdDMO.getSbhdChildAcNo());
		thrower.ifParameterMissing( "sbhdSplitBillHdDMO.sbhdChildMsisdn",sbhdSplitBillHdDMO.getSbhdChildMsisdn());
		thrower.ifParameterMissing( "sbhdSplitBillHdDMO.sbhdParentAcNo",sbhdSplitBillHdDMO.getSbhdParentAcNo());
		thrower.ifParameterMissing( "sbhdSplitBillHdDMO.sbhdParentMsisdn",sbhdSplitBillHdDMO.getSbhdParentMsisdn());

		return sbhdSplitBillHdDAC.exists(sbhdSplitBillHdDMO);
	}

	// ==================================================================================================

	public boolean exists(QueryFilter filter) throws EPPIXBusinessException,
			EPPIXUnexpectedException, EPPIXFatalException {
		logger.debug("exists(filter)");

		return sbhdSplitBillHdDAC.exists(filter);
	}

	// ==================================================================================================

	public DTOList getList(DTOListState state, QueryFilter filter)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("getList( state, filter )");

		return sbhdSplitBillHdDAC.getList(state, filter);
	}

	// ==================================================================================================

	public DAOIterator iterate(QueryFilter filter)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("iterateWithLock( filter )");

		return sbhdSplitBillHdDAC.iterate(filter);
	}

	// ==================================================================================================

	public DAOIterator iterateWithLock(QueryFilter filter)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("iterateWithLock( filter )");

		return sbhdSplitBillHdDAC.iterateWithLock(filter);
	}

	// ==================================================================================================

	public SbhdSplitBillHdDMO get(QueryFilter filter)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("get( filter )");

		//
		// Check mandatory parameters.
		//
		thrower.ifParameterMissing("filter", filter);

		//
		// Attempt to get the SbhdSplitBillHdDMO
		//
		SbhdSplitBillHdDMO sbhdSplitBillHdDMO = sbhdSplitBillHdDAC.get(filter);

		return sbhdSplitBillHdDMO;
	}

	// ==================================================================================================

	public Object max(QueryFilter filter) throws EPPIXBusinessException,
			EPPIXUnexpectedException, EPPIXFatalException {
		logger.debug("max( filter )");

		//
		// Check mandatory parameters.
		//
		thrower.ifParameterMissing("filter", filter);

		return sbhdSplitBillHdDAC.max(filter);
	}

	// ==================================================================================================

	public Object min(QueryFilter filter) throws EPPIXBusinessException,
			EPPIXUnexpectedException, EPPIXFatalException {
		logger.debug("min( filter )");

		//
		// Check mandatory parameters.
		//
		thrower.ifParameterMissing("filter", filter);

		return sbhdSplitBillHdDAC.min(filter);
	}

	// ==================================================================================================

	public Integer count(QueryFilter filter) throws EPPIXBusinessException,
			EPPIXUnexpectedException, EPPIXFatalException {
		logger.debug("count( filter )");

		//
		// Check mandatory parameters.
		//
		thrower.ifParameterMissing("filter", filter);

		return Integer.valueOf(sbhdSplitBillHdDAC.count(filter));
	}
	// ==================================================================================================

}