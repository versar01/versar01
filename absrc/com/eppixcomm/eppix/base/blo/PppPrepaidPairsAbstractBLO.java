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

public class PppPrepaidPairsAbstractBLO extends BaseBLO implements
		DTOActionTypes, BaseMessages {

	static Thrower thrower = Thrower
			.getThrower(PppPrepaidPairsAbstractBLO.class);

	protected static final String ENTITY_ID = "MSI";

	/** Data Access Controller. */
	protected PppPrepaidPairsDAC pppPrepaidPairsDAC;
	/** DOCUMENT ME! */
	protected Logger logger = thrower.getLogger();

	/** Invoked by the BLOBinder to provide this BLO with its DAC. */
	protected void setDAC(DAC dac) {
		this.pppPrepaidPairsDAC = (PppPrepaidPairsDAC) dac;
	}

	protected Class getDACClass() {
		return PppPrepaidPairsDAC.class;
	}

	public PppPrepaidPairsDMO get(PppPrepaidPairsDMO pppPrepaidPairsDMO)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("get(pppPrepaidPairsDMO)");

		//
		// Check mandatory parameters.
		//
		thrower.ifParameterMissing("pppPrepaidPairsDMO", pppPrepaidPairsDMO);

		//
		// Each attribute that is part of the primary key is mandatory
		//
		thrower.ifParameterMissing("pppPrepaidPairsDMO.pppSubscriberId",
				pppPrepaidPairsDMO.getPppSubscriberId());

		thrower.ifParameterMissing("pppPrepaidPairsDMO.pppSimNo",
				pppPrepaidPairsDMO.getPppSimNo());

		thrower.ifParameterMissing("pppPrepaidPairsDMO.pppImsiNod",
				pppPrepaidPairsDMO.getPppImsiNo());

		thrower.ifParameterMissing("pppPrepaidPairsDMO.pppMsisdnNo",
				pppPrepaidPairsDMO.getPppMsisdnNo());

		//
		// Attempt to get the PppPrepaidPairsDMO
		//

		QueryFilter filter = new QueryFilter();
		filter.add(FilterOp.EQUAL, PppPrepaidPairsDMO.PppSubscriberIdFilter,
				pppPrepaidPairsDMO.getPppSubscriberId());
		filter.add(FilterOp.EQUAL, PppPrepaidPairsDMO.PppSimNoFilter,
				pppPrepaidPairsDMO.getPppSimNo());
		filter.add(FilterOp.EQUAL, PppPrepaidPairsDMO.PppImsiNoFilter,
				pppPrepaidPairsDMO.getPppImsiNo());
		filter.add(FilterOp.EQUAL, PppPrepaidPairsDMO.PppMsisdnNoFilter,
				pppPrepaidPairsDMO.getPppMsisdnNo());

		PppPrepaidPairsDMO returnPppPrepaidPairsDMO = pppPrepaidPairsDAC
				.get(filter);

		//
		// Could not find the PppPrepaidPairsDMO
		//
		if (returnPppPrepaidPairsDMO == null) {
			thrower.business(Base_ACTACCTYPES_000,
					new Object[] { pppPrepaidPairsDMO.getPppSubscriberId(),
							pppPrepaidPairsDMO.getPppSimNo(),
							pppPrepaidPairsDMO.getPppImsiNo(),
							pppPrepaidPairsDMO.getPppMsisdnNo() });
		}

		//
		// Now, based on the values of the flags on this method signature, which
		// in turn,
		// are based on this objects associations, get all associated, embedded
		// objects
		//
		return returnPppPrepaidPairsDMO;
	}

	// ==================================================================================================

	public DTOList getList(DTOListState state,
			PppPrepaidPairsDMO pppPrepaidPairsDMO)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("getList( state, pppPrepaidPairsDMO )");

		return pppPrepaidPairsDAC.getList(state, pppPrepaidPairsDMO);
	}

	public PppPrepaidPairsDMO create(PppPrepaidPairsDMO pppPrepaidPairsDMO)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("create( pppPrepaidPairsDMO )");

		thrower.ifParameterMissing("pppPrepaidPairsDMO", pppPrepaidPairsDMO);

		thrower.ifParameterMissing("pppPrepaidPairsDMO.pppSubscriberId",
				pppPrepaidPairsDMO.getPppSubscriberId());

		thrower.ifParameterMissing("pppPrepaidPairsDMO.pppSimNo",
				pppPrepaidPairsDMO.getPppSimNo());

		thrower.ifParameterMissing("pppPrepaidPairsDMO.pppImsiNod",
				pppPrepaidPairsDMO.getPppImsiNo());

		thrower.ifParameterMissing("pppPrepaidPairsDMO.pppMsisdnNo",
				pppPrepaidPairsDMO.getPppMsisdnNo());

		//
		// Check that this object does not already exist
		//
		if (exists(pppPrepaidPairsDMO)) {
			thrower.business(Base_ACTACCTYPES_001,
					new Object[] { pppPrepaidPairsDMO.getPppSubscriberId(),
							pppPrepaidPairsDMO.getPppSimNo(),
							pppPrepaidPairsDMO.getPppImsiNo(),
							pppPrepaidPairsDMO.getPppMsisdnNo() });
		}

		//
		// Now create the record
		//
		pppPrepaidPairsDAC.create(pppPrepaidPairsDMO);

		return pppPrepaidPairsDMO;
	}

	// public PppPrepaidPairsDMO modify( PppPrepaidPairsDMO pppPrepaidPairsDMO )
	// throws EPPIXBusinessException, EPPIXUnexpectedException,
	// EPPIXFatalException {
	// logger.debug( "modify( apppPrepaidPairsDMO )" );
	//
	// //
	// // Check mandatory parameters (
	// //
	// // Note: attributes stereotyped <NotModifiable> are ignored
	// //
	// thrower.ifParameterMissing( "pppPrepaidPairsDMO", pppPrepaidPairsDMO );
	//
	// thrower.ifParameterMissing( "pppPrepaidPairsDMO.pppSubscriberId",
	// pppPrepaidPairsDMO.getPppSubscriberId());
	//
	// thrower.ifParameterMissing( "pppPrepaidPairsDMO.pppSimNo",
	// pppPrepaidPairsDMO.getPppSimNo());
	//
	// thrower.ifParameterMissing( "pppPrepaidPairsDMO.pppImsiNod",
	// pppPrepaidPairsDMO.getPppImsiNo());
	//
	// thrower.ifParameterMissing( "pppPrepaidPairsDMO.pppMsisdnNo",
	// pppPrepaidPairsDMO.getPppMsisdnNo());
	//
	//
	//
	// PppPrepaidPairsDMO updatePppPrepaidPairsDMO = new PppPrepaidPairsDMO( );
	//
	// QueryFilter filter = new QueryFilter();
	//
	//
	// filter.add(FilterOp.EQUAL, PppPrepaidPairsDMO.PppSubscriberIdFilter,
	// pppPrepaidPairsDMO.getPppSubscriberId());
	// filter.add(FilterOp.EQUAL, PppPrepaidPairsDMO.PppSimNoFilter,
	// pppPrepaidPairsDMO.getPppSimNo());
	// filter.add(FilterOp.EQUAL, PppPrepaidPairsDMO.PppImsiNoFilter,
	// pppPrepaidPairsDMO.getPppImsiNo());
	// filter.add(FilterOp.EQUAL, PppPrepaidPairsDMO.PppMsisdnNoFilter,
	// pppPrepaidPairsDMO.getPppMsisdnNo());
	//
	// updatePppPrepaidPairsDMO = get( filter );
	//
	// //
	// // For each relationship to single objects (does not matter if they are
	// Embedded or Flattened)
	// // either associate to a pre-existing object, or create an object then
	// associate to it
	// //
	//
	// //
	// // Copy the fields to be updated. We do not want to overwrite primary
	// keys etc.
	// // All attributes stereotyped as being <NotModifiable> are skipped
	// //
	// updatePppPrepaidPairsDMO.setPppActivateDate(pppActivateDate);
	//
	//
	// //
	// // Modify the pppPrepaidPairsDMO
	// //
	// pppPrepaidPairsDAC.modify( updatePppPrepaidPairsDMO );
	//
	// // Create a new PppPrepaidPairsDMO, set keys, and fetch from the
	// database...
	// PppPrepaidPairsDMO returnPppPrepaidPairsDMO = new PppPrepaidPairsDMO( );
	//
	// returnPppPrepaidPairsDMO.setDpfFolderId(updatePppPrepaidPairsDMO.getDpfFolderId()
	// );
	//
	// returnPppPrepaidPairsDMO = get( returnPppPrepaidPairsDMO );
	//
	// return returnPppPrepaidPairsDMO;
	// }
	// ==================================================================================================

	public void modify(QueryFilter filter) throws EPPIXBusinessException,
			EPPIXUnexpectedException, EPPIXFatalException {
		logger.debug("modify( filter )");

		//
		// Modify the pppPrepaidPairsDMO
		//
		pppPrepaidPairsDAC.modify(filter);
	}

	// ==================================================================================================

	public void delete(PppPrepaidPairsDMO pppPrepaidPairsDMO)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("delete( pppPrepaidPairsDMO )");

		thrower.ifParameterMissing("pppPrepaidPairsDMO", pppPrepaidPairsDMO);

		thrower.ifParameterMissing("pppPrepaidPairsDMO.pppSubscriberId",
				pppPrepaidPairsDMO.getPppSubscriberId());

		thrower.ifParameterMissing("pppPrepaidPairsDMO.pppSimNo",
				pppPrepaidPairsDMO.getPppSimNo());

		thrower.ifParameterMissing("pppPrepaidPairsDMO.pppImsiNod",
				pppPrepaidPairsDMO.getPppImsiNo());

		thrower.ifParameterMissing("pppPrepaidPairsDMO.pppMsisdnNo",
				pppPrepaidPairsDMO.getPppMsisdnNo());

		PppPrepaidPairsDMO updatePppPrepaidPairsDMO = null;

		updatePppPrepaidPairsDMO = get(pppPrepaidPairsDMO);

		// delete self...
		pppPrepaidPairsDAC.delete(pppPrepaidPairsDMO);
	}

	// ==================================================================================================

	public void delete(QueryFilter filter) throws EPPIXBusinessException,
			EPPIXUnexpectedException, EPPIXFatalException {
		logger.debug("delete( filter )");

		thrower.ifParameterMissing("filter", filter);

		// delete...
		pppPrepaidPairsDAC.delete(filter);
	}

	// ==================================================================================================

	public boolean exists(PppPrepaidPairsDMO pppPrepaidPairsDMO)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("exists(pppPrepaidPairsDMO)");

		thrower.ifParameterMissing("pppPrepaidPairsDMO", pppPrepaidPairsDMO);

		thrower.ifParameterMissing("pppPrepaidPairsDMO.pppSubscriberId",
				pppPrepaidPairsDMO.getPppSubscriberId());

		thrower.ifParameterMissing("pppPrepaidPairsDMO.pppSimNo",
				pppPrepaidPairsDMO.getPppSimNo());

		thrower.ifParameterMissing("pppPrepaidPairsDMO.pppImsiNod",
				pppPrepaidPairsDMO.getPppImsiNo());

		thrower.ifParameterMissing("pppPrepaidPairsDMO.pppMsisdnNo",
				pppPrepaidPairsDMO.getPppMsisdnNo());
		;

		return pppPrepaidPairsDAC.exists(pppPrepaidPairsDMO);
	}

	// ==================================================================================================

	public boolean exists(QueryFilter filter) throws EPPIXBusinessException,
			EPPIXUnexpectedException, EPPIXFatalException {
		logger.debug("exists(filter)");

		return pppPrepaidPairsDAC.exists(filter);
	}

	// ==================================================================================================

	public DTOList getList(DTOListState state, QueryFilter filter)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("getList( state, filter )");

		return pppPrepaidPairsDAC.getList(state, filter);
	}

	// ==================================================================================================

	public DAOIterator iterate(QueryFilter filter)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("iterateWithLock( filter )");

		return pppPrepaidPairsDAC.iterate(filter);
	}

	// ==================================================================================================

	public DAOIterator iterateWithLock(QueryFilter filter)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("iterateWithLock( filter )");

		return pppPrepaidPairsDAC.iterateWithLock(filter);
	}

	// ==================================================================================================

	public PppPrepaidPairsDMO get(QueryFilter filter)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("get( filter )");

		//
		// Check mandatory parameters.
		//
		thrower.ifParameterMissing("filter", filter);

		//
		// Attempt to get the PppPrepaidPairsDMO
		//
		PppPrepaidPairsDMO pppPrepaidPairsDMO = pppPrepaidPairsDAC.get(filter);

		return pppPrepaidPairsDMO;
	}

	// ==================================================================================================

	public Object max(QueryFilter filter) throws EPPIXBusinessException,
			EPPIXUnexpectedException, EPPIXFatalException {
		logger.debug("max( filter )");

		//
		// Check mandatory parameters.
		//
		thrower.ifParameterMissing("filter", filter);

		return pppPrepaidPairsDAC.max(filter);
	}

	// ==================================================================================================

	public Object min(QueryFilter filter) throws EPPIXBusinessException,
			EPPIXUnexpectedException, EPPIXFatalException {
		logger.debug("min( filter )");

		//
		// Check mandatory parameters.
		//
		thrower.ifParameterMissing("filter", filter);

		return pppPrepaidPairsDAC.min(filter);
	}

	// ==================================================================================================

	public Integer count(QueryFilter filter) throws EPPIXBusinessException,
			EPPIXUnexpectedException, EPPIXFatalException {
		logger.debug("count( filter )");

		//
		// Check mandatory parameters.
		//
		thrower.ifParameterMissing("filter", filter);

		return Integer.valueOf(pppPrepaidPairsDAC.count(filter));
	}
	// ==================================================================================================

}