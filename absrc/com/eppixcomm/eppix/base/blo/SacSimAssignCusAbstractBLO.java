package com.eppixcomm.eppix.base.blo;

import org.apache.log4j.Logger;

import com.eppixcomm.eppix.base.error.EPPIXBusinessException;
import com.eppixcomm.eppix.base.error.EPPIXFatalException;
import com.eppixcomm.eppix.base.error.EPPIXUnexpectedException;
import com.eppixcomm.eppix.base.error.Thrower;
import com.eppixcomm.eppix.common.data.DAC;
import com.eppixcomm.eppix.common.data.DAOIterator;
import com.eppixcomm.eppix.common.data.DTOActionTypes;
//import com.eppixcomm.eppix.common.data.DTOList;
//import com.eppixcomm.eppix.common.data.DTOListState;
import com.eppixcomm.eppix.common.util.FilterOp;
import com.eppixcomm.eppix.common.util.QueryFilter;

public class SacSimAssignCusAbstractBLO extends BaseBLO implements
		DTOActionTypes, BaseMessages {

	static Thrower thrower = Thrower
			.getThrower(SacSimAssignCusAbstractBLO.class);

	protected static final String ENTITY_ID = "SAC";

	/** Data Access Controller. */
	protected SacSimAssignCusDAC sacSimAssignCusDAC;
	/** DOCUMENT ME! */
	protected Logger logger = thrower.getLogger();

	/** Invoked by the BLOBinder to provide this BLO with its DAC. */
	protected void setDAC(DAC dac) {
		this.sacSimAssignCusDAC = (SacSimAssignCusDAC) dac;
	}

	protected Class getDACClass() {
		return SacSimAssignCusDAC.class;
	}

	public SacSimAssignCusDMO get(SacSimAssignCusDMO sacSimAssignCusDMO)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("get(sacSimAssignCusDMO)");

		//
		// Check mandatory parameters.
		//
		thrower.ifParameterMissing("sacSimAssignCusDMO", sacSimAssignCusDMO);

		//
		// Each attribute that is part of the primary key is mandatory
		//
		thrower.ifParameterMissing("sacSimAssignCusDMO.sacBillAcNo",
				sacSimAssignCusDMO.getSacBillAcNo());

		thrower.ifParameterMissing("sacSimAssignCusDMO.sacSimNo",
				sacSimAssignCusDMO.getSacSimNo());

		QueryFilter filter = new QueryFilter();
		filter.add(FilterOp.EQUAL, SacSimAssignCusDMO.sacBillAcNoFilter,
				sacSimAssignCusDMO.getSacBillAcNo());
		filter.add(FilterOp.EQUAL, SacSimAssignCusDMO.sacSimNoFilter,
				sacSimAssignCusDMO.getSacSimNo());

		//
		// Attempt to get the SacSimAssignCusDMO
		//
		SacSimAssignCusDMO returnSacSimAssignCusDMO = sacSimAssignCusDAC
				.get(filter);

		//
		// Could not find the SacSimAssignCusDMO
		//
		if (returnSacSimAssignCusDMO == null) {
			thrower.business(Base_ACTACCTYPES_000,
					new Object[] { sacSimAssignCusDMO.getSacBillAcNo() });
		}

		//
		// Now, based on the values of the flags on this method signature, which
		// in turn,
		// are based on this objects associations, get all associated, embedded
		// objects
		//
		return returnSacSimAssignCusDMO;
	}

	// ==================================================================================================

	// public DTOList getList(
	// DTOListState state,
	// SacSimAssignCusDMO sacSimAssignCusDMO )
	// throws EPPIXBusinessException, EPPIXUnexpectedException,
	// EPPIXFatalException {
	// logger.debug( "getList( state, sacSimAssignCusDMO )" );
	//
	// return sacSimAssignCusDAC.getList( state, sacSimAssignCusDMO );
	// }

	public SacSimAssignCusDMO create(SacSimAssignCusDMO sacSimAssignCusDMO)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("create( sacSimAssignCusDMO )");

		thrower.ifParameterMissing("sacSimAssignCusDMO", sacSimAssignCusDMO);
		thrower.ifParameterMissing("sacSimAssignCusDMO.sacBillAcNo",
				sacSimAssignCusDMO.getSacBillAcNo());
		thrower.ifParameterMissing("sacSimAssignCusDMO.sacSimNo",
				sacSimAssignCusDMO.getSacSimNo());
		//
		// Check that this object does not already exist
		//
		if (exists(sacSimAssignCusDMO)) {
			thrower.business(Base_ACTACCTYPES_001,
					new Object[] { sacSimAssignCusDMO.getSacBillAcNo() });
		}

		//
		// Now create the record
		//
		sacSimAssignCusDAC.create(sacSimAssignCusDMO);

		return sacSimAssignCusDMO;
	}

	// public SacSimAssignCusDMO modify( SacSimAssignCusDMO sacSimAssignCusDMO )
	// throws EPPIXBusinessException, EPPIXUnexpectedException,
	// EPPIXFatalException {
	// logger.debug( "modify( asacSimAssignCusDMO )" );
	//
	// //
	// // Check mandatory parameters (
	// //
	// // Note: attributes stereotyped <NotModifiable> are ignored
	// //
	// thrower.ifParameterMissing( "sacSimAssignCusDMO", sacSimAssignCusDMO );
	// thrower.ifParameterMissing( "sacSimAssignCusDMO.sacBillAcNo",
	// sacSimAssignCusDMO.getSacBillAcNo());
	//
	// thrower.ifParameterMissing( "sacSimAssignCusDMO.sacSimNo",
	// sacSimAssignCusDMO.getSacSimNo());
	//
	//
	//
	// SacSimAssignCusDMO updateSacSimAssignCusDMO = new SacSimAssignCusDMO( );
	//
	// updateSacSimAssignCusDMO.setSacBillAcNo(sacSimAssignCusDMO.getSacBillAcNo()
	// );
	//
	// updateSacSimAssignCusDMO = get( updateSacSimAssignCusDMO );
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
	// updateSacSimAssignCusDMO.setSacBillAcNo(sacSimAssignCusDMO.getSacBillAcNo());
	//
	//
	// //
	// // Modify the sacSimAssignCusDMO
	// //
	// sacSimAssignCusDAC.modify( updateSacSimAssignCusDMO );
	//
	// // Create a new SacSimAssignCusDMO, set keys, and fetch from the
	// database...
	// SacSimAssignCusDMO returnSacSimAssignCusDMO = new SacSimAssignCusDMO( );
	//
	// returnSacSimAssignCusDMO.setDpfFolderId(updateSacSimAssignCusDMO.getDpfFolderId()
	// );
	//
	// returnSacSimAssignCusDMO = get( returnSacSimAssignCusDMO );
	//
	// return returnSacSimAssignCusDMO;
	// }
	// ==================================================================================================

	// public void modify( QueryFilter filter )
	// throws EPPIXBusinessException, EPPIXUnexpectedException,
	// EPPIXFatalException {
	// logger.debug( "modify( filter )" );
	//
	// //
	// // Modify the sacSimAssignCusDMO
	// //
	// sacSimAssignCusDAC.modify( filter );
	// }
	// ==================================================================================================

	public void delete(SacSimAssignCusDMO sacSimAssignCusDMO)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("delete( sacSimAssignCusDMO )");

		thrower.ifParameterMissing("sacSimAssignCusDMO", sacSimAssignCusDMO);

		SacSimAssignCusDMO updateSacSimAssignCusDMO = null;

		updateSacSimAssignCusDMO = get(sacSimAssignCusDMO);

		// delete self...
		sacSimAssignCusDAC.delete(sacSimAssignCusDMO);
	}

	// ==================================================================================================

	public void delete(QueryFilter filter) throws EPPIXBusinessException,
			EPPIXUnexpectedException, EPPIXFatalException {
		logger.debug("delete( filter )");

		thrower.ifParameterMissing("filter", filter);

		// delete...
		sacSimAssignCusDAC.delete(filter);
	}

	// ==================================================================================================

	public boolean exists(SacSimAssignCusDMO sacSimAssignCusDMO)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("exists(sacSimAssignCusDMO)");

		thrower.ifParameterMissing("sacSimAssignCusDMO", sacSimAssignCusDMO);

		thrower.ifParameterMissing("sacSimAssignCusDMO.sacBillAcNo",
				sacSimAssignCusDMO.getSacBillAcNo());

		thrower.ifParameterMissing("sacSimAssignCusDMO.sacSimNo",
				sacSimAssignCusDMO.getSacSimNo());

		return sacSimAssignCusDAC.exists(sacSimAssignCusDMO);
	}

	// ==================================================================================================

	public boolean exists(QueryFilter filter) throws EPPIXBusinessException,
			EPPIXUnexpectedException, EPPIXFatalException {
		logger.debug("exists(filter)");

		return sacSimAssignCusDAC.exists(filter);
	}

	// ==================================================================================================

	// public DTOList getList(
	// DTOListState state,
	// QueryFilter filter )
	// throws EPPIXBusinessException, EPPIXUnexpectedException,
	// EPPIXFatalException {
	// logger.debug( "getList( state, filter )" );
	//
	// return sacSimAssignCusDAC.getList( state, filter );
	// }

	// ==================================================================================================

	public DAOIterator iterate(QueryFilter filter)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("iterateWithLock( filter )");

		return sacSimAssignCusDAC.iterate(filter);
	}

	// ==================================================================================================

	public DAOIterator iterateWithLock(QueryFilter filter)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("iterateWithLock( filter )");

		return sacSimAssignCusDAC.iterateWithLock(filter);
	}

	// ==================================================================================================

	public SacSimAssignCusDMO get(QueryFilter filter)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("get( filter )");

		//
		// Check mandatory parameters.
		//
		thrower.ifParameterMissing("filter", filter);

		//
		// Attempt to get the SacSimAssignCusDMO
		//
		SacSimAssignCusDMO sacSimAssignCusDMO = sacSimAssignCusDAC.get(filter);

		return sacSimAssignCusDMO;
	}

	// ==================================================================================================

	// public Object max( QueryFilter filter )
	// throws EPPIXBusinessException, EPPIXUnexpectedException,
	// EPPIXFatalException {
	// logger.debug( "max( filter )" );
	//
	// //
	// // Check mandatory parameters.
	// //
	// thrower.ifParameterMissing( "filter", filter );
	//
	// return sacSimAssignCusDAC.max( filter );
	// }
	// ==================================================================================================

	// public Object min( QueryFilter filter )
	// throws EPPIXBusinessException, EPPIXUnexpectedException,
	// EPPIXFatalException {
	// logger.debug( "min( filter )" );
	//
	// //
	// // Check mandatory parameters.
	// //
	// thrower.ifParameterMissing( "filter", filter );
	//
	// return sacSimAssignCusDAC.min( filter );
	// }
	// ==================================================================================================

	public Integer count(QueryFilter filter) throws EPPIXBusinessException,
			EPPIXUnexpectedException, EPPIXFatalException {
		logger.debug("count( filter )");

		//
		// Check mandatory parameters.
		//
		thrower.ifParameterMissing("filter", filter);

		return Integer.valueOf(sacSimAssignCusDAC.count(filter));
	}
	// ==================================================================================================

}