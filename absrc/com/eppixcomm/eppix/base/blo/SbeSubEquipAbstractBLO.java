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

public class SbeSubEquipAbstractBLO extends BaseBLO implements DTOActionTypes,
		BaseMessages {

	static Thrower thrower = Thrower.getThrower(SbeSubEquipAbstractBLO.class);

	protected static final String ENTITY_ID = "FS";

	/** Data Access Controller. */
	protected SbeSubEquipDAC sbeSubEquipDAC;
	/** DOCUMENT ME! */
	protected Logger logger = thrower.getLogger();

	/** Invoked by the BLOBinder to provide this BLO with its DAC. */
	public void setDAC(DAC dac) {
		this.sbeSubEquipDAC = (SbeSubEquipDAC) dac;
	}

	public Class getDACClass() {
		return SbeSubEquipDAC.class;
	}

	// public SbeSubEquipDMO get( SbeSubEquipDMO sbeSubEquipDMO )
	// throws EPPIXBusinessException, EPPIXUnexpectedException,
	// EPPIXFatalException {
	// logger.debug( "get(sbeSubEquipDMO)" );
	//
	// //
	// // Check mandatory parameters.
	// //
	// thrower.ifParameterMissing( "sbeSubEquipDMO", sbeSubEquipDMO );
	//
	// //
	// // Each attribute that is part of the primary key is mandatory
	// //
	// thrower.ifParameterMissing( "sbeSubEquipDMO.sbeSubEquipId",
	// sbeSubEquipDMO.getSbeSubEquipId() );
	//
	// //
	// // Attempt to get the SbeSubEquipDMO
	// //
	// SbeSubEquipDMO returnSbeSubEquipDMO = sbeSubEquipDAC.get( sbeSubEquipDMO
	// );
	//
	// //
	// // Could not find the SbeSubEquipDMO
	// //
	// if ( returnSbeSubEquipDMO == null ) {
	// thrower.business( Base_ACTACCTYPES_000,
	// new Object[] { sbeSubEquipDMO.getSbeSubEquipId() } );
	// }
	//
	// //
	// // Now, based on the values of the flags on this method signature, which
	// in turn,
	// // are based on this objects associations, get all associated, embedded
	// objects
	// //
	// return returnSbeSubEquipDMO;
	// }
	// ==================================================================================================

	// public DTOList getList(
	// DTOListState state,
	// SbeSubEquipDMO sbeSubEquipDMO )
	// throws EPPIXBusinessException, EPPIXUnexpectedException,
	// EPPIXFatalException {
	// logger.debug( "getList( state, sbeSubEquipDMO )" );
	//
	// return sbeSubEquipDAC.getList( state, sbeSubEquipDMO );
	// }

	public SbeSubEquipDMO create(SbeSubEquipDMO sbeSubEquipDMO)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("create( sbeSubEquipDMO )");

		thrower.ifParameterMissing("sbeSubEquipDMO", sbeSubEquipDMO);
		thrower.ifParameterMissing("sbeSubEquipDMO.sbeSubEquipId",
				sbeSubEquipDMO.getSbeSubEquipId());

		//
		// Check that this object does not already exist
		//
		if (exists(sbeSubEquipDMO)) {
			thrower.business(Base_SBESUBEQUIP_001,
					new Object[] { sbeSubEquipDMO.getSbeSubEquipId() });
		}

		//
		// Now create the record
		//
		sbeSubEquipDAC.create(sbeSubEquipDMO);

		return sbeSubEquipDMO;
	}

	// public SbeSubEquipDMO modify( SbeSubEquipDMO sbeSubEquipDMO )
	// throws EPPIXBusinessException, EPPIXUnexpectedException,
	// EPPIXFatalException {
	// logger.debug( "modify( asbeSubEquipDMO )" );
	//
	// //
	// // Check mandatory parameters (
	// //
	// // Note: attributes stereotyped <NotModifiable> are ignored
	// //
	// thrower.ifParameterMissing( "sbeSubEquipDMO", sbeSubEquipDMO );
	// thrower.ifParameterMissing( "sbeSubEquipDMO.sbeSubEquipId",
	// sbeSubEquipDMO.getSbeSubEquipId() );
	//
	//
	//
	// SbeSubEquipDMO updateSbeSubEquipDMO = new SbeSubEquipDMO( );
	//
	// updateSbeSubEquipDMO.setSbeSubEquipId(sbeSubEquipDMO.getSbeSubEquipId()
	// );
	//
	// updateSbeSubEquipDMO = get( updateSbeSubEquipDMO );
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
	// updateSbeSubEquipDMO.setSbeSubEquipId(sbeSubEquipDMO.getSbeSubEquipId()
	// );
	//
	//
	// //
	// // Modify the sbeSubEquipDMO
	// //
	// sbeSubEquipDAC.modify( updateSbeSubEquipDMO );
	//
	// // Create a new SbeSubEquipDMO, set keys, and fetch from the database...
	// SbeSubEquipDMO returnSbeSubEquipDMO = new SbeSubEquipDMO( );
	//
	// returnSbeSubEquipDMO.setDpfFolderId(updateSbeSubEquipDMO.getSbeSubEquipId()
	// );
	//
	// returnSbeSubEquipDMO = get( returnSbeSubEquipDMO );
	//
	// return returnSbeSubEquipDMO;
	// }
	// ==================================================================================================

	public void modify(QueryFilter filter) throws EPPIXBusinessException,
			EPPIXUnexpectedException, EPPIXFatalException {
		logger.debug("modify( filter )");

		//
		// Modify the sbeSubEquipDMO
		//
		sbeSubEquipDAC.modify(filter);
	}

	// ==================================================================================================

	// public void delete( SbeSubEquipDMO sbeSubEquipDMO )
	// throws EPPIXBusinessException, EPPIXUnexpectedException,
	// EPPIXFatalException {
	// logger.debug( "delete( sbeSubEquipDMO )" );
	//
	// thrower.ifParameterMissing( "sbeSubEquipDMO", sbeSubEquipDMO );
	//
	// SbeSubEquipDMO updateSbeSubEquipDMO = null;
	//
	// updateSbeSubEquipDMO = get( sbeSubEquipDMO );
	//
	// // delete self...
	// sbeSubEquipDAC.delete( sbeSubEquipDMO );
	// }
	// ==================================================================================================

	public void delete(QueryFilter filter) throws EPPIXBusinessException,
			EPPIXUnexpectedException, EPPIXFatalException {
		logger.debug("delete( filter )");

		thrower.ifParameterMissing("filter", filter);

		// delete...
		sbeSubEquipDAC.delete(filter);
	}

	// ==================================================================================================

	public boolean exists(SbeSubEquipDMO sbeSubEquipDMO)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("exists(sbeSubEquipDMO)");

		thrower.ifParameterMissing("sbeSubEquipDMO", sbeSubEquipDMO);

		thrower.ifParameterMissing("sbeSubEquipDMO.sbeSubEquipId",
				sbeSubEquipDMO.getSbeSubEquipId());

		return sbeSubEquipDAC.exists(sbeSubEquipDMO);
	}

	// ==================================================================================================

	public boolean exists(QueryFilter filter) throws EPPIXBusinessException,
			EPPIXUnexpectedException, EPPIXFatalException {
		logger.debug("exists(filter)");

		return sbeSubEquipDAC.exists(filter);
	}

	// ==================================================================================================

	// public DTOList getList(
	// DTOListState state,
	// QueryFilter filter )
	// throws EPPIXBusinessException, EPPIXUnexpectedException,
	// EPPIXFatalException {
	// logger.debug( "getList( state, filter )" );
	//
	// return sbeSubEquipDAC.getList( state, filter );
	// }

	// ==================================================================================================

	public DAOIterator iterate(QueryFilter filter)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("iterateWithLock( filter )");

		return sbeSubEquipDAC.iterate(filter);
	}

	// ==================================================================================================

	// public DAOIterator iterateWithLock( QueryFilter filter )
	// throws EPPIXBusinessException, EPPIXUnexpectedException,
	// EPPIXFatalException {
	// logger.debug( "iterateWithLock( filter )" );
	//
	// return sbeSubEquipDAC.iterateWithLock( filter );
	// }
	// ==================================================================================================

	public SbeSubEquipDMO get(QueryFilter filter)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("get( filter )");

		//
		// Check mandatory parameters.
		//
		thrower.ifParameterMissing("filter", filter);

		//
		// Attempt to get the SbeSubEquipDMO
		//
		SbeSubEquipDMO sbeSubEquipDMO = sbeSubEquipDAC.get(filter);

		return sbeSubEquipDMO;
	}

	// ==================================================================================================

	public Object max(QueryFilter filter) throws EPPIXBusinessException,
			EPPIXUnexpectedException, EPPIXFatalException {
		logger.debug("max( filter )");

		//
		// Check mandatory parameters.
		//
		thrower.ifParameterMissing("filter", filter);

		return sbeSubEquipDAC.max(filter);
	}

	// ==================================================================================================

	public Object min(QueryFilter filter) throws EPPIXBusinessException,
			EPPIXUnexpectedException, EPPIXFatalException {
		logger.debug("min( filter )");

		//
		// Check mandatory parameters.
		//
		thrower.ifParameterMissing("filter", filter);

		return sbeSubEquipDAC.min(filter);
	}

	// ==================================================================================================

	public Integer count(QueryFilter filter) throws EPPIXBusinessException,
			EPPIXUnexpectedException, EPPIXFatalException {
		logger.debug("count( filter )");

		//
		// Check mandatory parameters.
		//
		thrower.ifParameterMissing("filter", filter);

		return Integer.valueOf(sbeSubEquipDAC.count(filter));
	}
	// ==================================================================================================

}