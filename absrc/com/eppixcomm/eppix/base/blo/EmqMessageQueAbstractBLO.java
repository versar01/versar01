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

public class EmqMessageQueAbstractBLO extends BaseBLO implements DTOActionTypes,
		BaseMessages {

	static Thrower thrower = Thrower.getThrower(EmqMessageQueAbstractBLO.class);

	protected static final String ENTITY_ID = "EM";

	/** Data Access Controller. */
	protected EmqMessageQueDAC emqMessageQueDAC;
	/** DOCUMENT ME! */
	protected Logger logger = thrower.getLogger();

	/** Invoked by the BLOBinder to provide this BLO with its DAC. */
	protected void setDAC(DAC dac) {
		this.emqMessageQueDAC = (EmqMessageQueDAC) dac;
	}

	protected Class getDACClass() {
		return EmqMessageQueDAC.class;
	}

	// public EmqMessageQueDMO get( EmqMessageQueDMO emqMessageQueDMO )
	// throws EPPIXBusinessException, EPPIXUnexpectedException,
	// EPPIXFatalException {
	// logger.debug( "get(emqMessageQueDMO)" );
	//
	// //
	// // Check mandatory parameters.
	// //
	// thrower.ifParameterMissing( "emqMessageQueDMO", emqMessageQueDMO );
	//
	// //
	// // Each attribute that is part of the primary key is mandatory
	// //
	// thrower.ifParameterMissing( "emqMessageQueDMO.emqSerial",
	// emqMessageQueDMO.getEmqSerial() );
	//
	// //
	// // Attempt to get the EmqMessageQueDMO
	// //
	// EmqMessageQueDMO returnEmqMessageQueDMO = emqMessageQueDAC.get( emqMessageQueDMO
	// );
	//
	// //
	// // Could not find the EmqMessageQueDMO
	// //
	// if ( returnEmqMessageQueDMO == null ) {
	// thrower.business( Base_EMQMessageQUE_000,
	// new Object[] { emqMessageQueDMO.getEmqSerial() } );
	// }
	//
	// //
	// // Now, based on the values of the flags on this method signature, which
	// in turn,
	// // are based on this objects associations, get all associated, embedded
	// objects
	// //
	// return returnEmqMessageQueDMO;
	// }
	// ==================================================================================================

	public DTOList getList(DTOListState state, EmqMessageQueDMO emqMessageQueDMO)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("getList( state, emqMessageQueDMO )");

		return emqMessageQueDAC.getList(state, emqMessageQueDMO);
	}

	public EmqMessageQueDMO create(EmqMessageQueDMO emqMessageQueDMO)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("create( emqMessageQueDMO )");

		thrower.ifParameterMissing("emqMessageQueDMO", emqMessageQueDMO);
		thrower.ifParameterMissing("emqMessageQueDMO.getEmqSerial", emqMessageQueDMO.getEmqSerial());

		//
		// Check that this object does not already exist
		//
		if (exists(emqMessageQueDMO)) {
			thrower.business(Base_EMQMESSAGEQUE_000,
					new Object[] { emqMessageQueDMO.getEmqSerial() });
		}

		//
		// Now create the record
		//
		emqMessageQueDAC.create(emqMessageQueDMO);

		return emqMessageQueDMO;
	}

	// public EmqMessageQueDMO modify( EmqMessageQueDMO emqMessageQueDMO )
	// throws EPPIXBusinessException, EPPIXUnexpectedException,
	// EPPIXFatalException {
	// logger.debug( "modify( aemqMessageQueDMO )" );
	//
	// //
	// // Check mandatory parameters (
	// //
	// // Note: attributes stereotyped <NotModifiable> are ignored
	// //
	// thrower.ifParameterMissing( "emqMessageQueDMO", emqMessageQueDMO );
	// thrower.business( Base_EMQMessageQUE_000,
	// new Object[] { emqMessageQueDMO.getEmqSerial() } );
	//
	//
	//
	// EmqMessageQueDMO updateEmqMessageQueDMO = new EmqMessageQueDMO( );
	//
	// updateEmqMessageQueDMO.setEmqSerial(emqMessageQueDMO.getEmqSerial());
	//
	// updateEmqMessageQueDMO = get( updateEmqMessageQueDMO );
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
	// updateEmqMessageQueDMO.setEmqSerial(emqMessageQueDMO.getEmqSerial() );
	//
	//
	// //
	// // Modify the emqMessageQueDMO
	// //
	// emqMessageQueDAC.modify( updateEmqMessageQueDMO );
	//
	// // Create a new EmqMessageQueDMO, set keys, and fetch from the database...
	// EmqMessageQueDMO returnEmqMessageQueDMO = new EmqMessageQueDMO( );
	//
	// returnEmqMessageQueDMO.setEmqSerial(updateEmqMessageQueDMO.getEmqSerial() );
	//
	// returnEmqMessageQueDMO = get( returnEmqMessageQueDMO );
	//
	// return returnEmqMessageQueDMO;
	// }
	// ==================================================================================================

	public void modify(QueryFilter filter) throws EPPIXBusinessException,
			EPPIXUnexpectedException, EPPIXFatalException {
		logger.debug("modify( filter )");

		//
		// Modify the emqMessageQueDMO
		//
		emqMessageQueDAC.modify(filter);
	}

	// ==================================================================================================

	public void delete(EmqMessageQueDMO emqMessageQueDMO)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("delete( emqMessageQueDMO )");

		thrower.ifParameterMissing("emqMessageQueDMO", emqMessageQueDMO);

		// EmqMessageQueDMO updateEmqMessageQueDMO = null;

		// updateEmqMessageQueDMO = get( emqMessageQueDMO );

		// delete self...
		emqMessageQueDAC.delete(emqMessageQueDMO);
	}

	// ==================================================================================================

	public void delete(QueryFilter filter) throws EPPIXBusinessException,
			EPPIXUnexpectedException, EPPIXFatalException {
		logger.debug("delete( filter )");

		thrower.ifParameterMissing("filter", filter);

		// delete...
		emqMessageQueDAC.delete(filter);
	}

	// ==================================================================================================

	public boolean exists(EmqMessageQueDMO emqMessageQueDMO)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("exists(emqMessageQueDMO)");

		thrower.ifParameterMissing("emqMessageQueDMO", emqMessageQueDMO);

		thrower.ifParameterMissing("emqMessageQueDMO.emqSerial",
				emqMessageQueDMO.getEmqSerial());

		return emqMessageQueDAC.exists(emqMessageQueDMO);
	}

	// ==================================================================================================

	public boolean exists(QueryFilter filter) throws EPPIXBusinessException,
			EPPIXUnexpectedException, EPPIXFatalException {
		logger.debug("exists(filter)");

		return emqMessageQueDAC.exists(filter);
	}

	// ==================================================================================================

	public DTOList getList(DTOListState state, QueryFilter filter)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("getList( state, filter )");

		return emqMessageQueDAC.getList(state, filter);
	}

	// ==================================================================================================

	public DAOIterator iterate(QueryFilter filter)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("iterateWithLock( filter )");

		return emqMessageQueDAC.iterate(filter);
	}

	// ==================================================================================================

	public DAOIterator iterateWithLock(QueryFilter filter)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("iterateWithLock( filter )");

		return emqMessageQueDAC.iterateWithLock(filter);
	}

	// ==================================================================================================

	public EmqMessageQueDMO get(QueryFilter filter)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("get( filter )");

		//
		// Check mandatory parameters.
		//
		thrower.ifParameterMissing("filter", filter);

		//
		// Attempt to get the EmqMessageQueDMO
		//
		EmqMessageQueDMO emqMessageQueDMO = emqMessageQueDAC.get(filter);

		return emqMessageQueDMO;
	}

	// ==================================================================================================

	public Object max(QueryFilter filter) throws EPPIXBusinessException,
			EPPIXUnexpectedException, EPPIXFatalException {
		logger.debug("max( filter )");

		//
		// Check mandatory parameters.
		//
		thrower.ifParameterMissing("filter", filter);

		return emqMessageQueDAC.max(filter);
	}

	// ==================================================================================================

	public Object min(QueryFilter filter) throws EPPIXBusinessException,
			EPPIXUnexpectedException, EPPIXFatalException {
		logger.debug("min( filter )");

		//
		// Check mandatory parameters.
		//
		thrower.ifParameterMissing("filter", filter);

		return emqMessageQueDAC.min(filter);
	}

	// ==================================================================================================

	public Integer count(QueryFilter filter) throws EPPIXBusinessException,
			EPPIXUnexpectedException, EPPIXFatalException {
		logger.debug("count( filter )");

		//
		// Check mandatory parameters.
		//
		thrower.ifParameterMissing("filter", filter);

		return Integer.valueOf(emqMessageQueDAC.count(filter));
	}
	// ==================================================================================================

}