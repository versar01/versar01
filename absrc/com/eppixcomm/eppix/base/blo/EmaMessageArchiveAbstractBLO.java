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

public class EmaMessageArchiveAbstractBLO extends BaseBLO implements
		DTOActionTypes, BaseMessages {

	static Thrower thrower = Thrower
			.getThrower(EmaMessageArchiveAbstractBLO.class);

	protected static final String ENTITY_ID = "EMA";

	/** Data Access Controller. */
	protected EmaMessageArchiveDAC emaMessageArchiveDAC;
	/** DOCUMENT ME! */
	protected Logger logger = thrower.getLogger();

	/** Invoked by the BLOBinder to provide this BLO with its DAC. */
	protected void setDAC(DAC dac) {
		this.emaMessageArchiveDAC = (EmaMessageArchiveDAC) dac;
	}

	protected Class getDACClass() {
		return EmaMessageArchiveDAC.class;
	}

	public EmaMessageArchiveDMO get(EmaMessageArchiveDMO emaEmailArchiveDMO)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("get(emaEmailArchiveDMO)");

		//
		// Check mandatory parameters.
		//
		thrower.ifParameterMissing("emaEmailArchiveDMO", emaEmailArchiveDMO);

		//
		// Each attribute that is part of the primary key is mandatory
		//
		thrower.ifParameterMissing("emaEmailArchiveDMO.emaSerial",
				emaEmailArchiveDMO.getEmaSerial());

		//
		// Attempt to get the EmaEmailArchiveDMO
		//
		EmaMessageArchiveDMO returnEmaEmailArchiveDMO = null;

		QueryFilter filter = new QueryFilter();

		filter.add(FilterOp.EQUAL, EmaMessageArchiveDMO.emaSerialFilter,
				emaEmailArchiveDMO.getEmaSerial());

		returnEmaEmailArchiveDMO = this.get(filter);

		//
		// Could not find the EmaEmailArchiveDMO
		//
		if (returnEmaEmailArchiveDMO == null) {
			thrower.business(Base_EMAMESSAGEARCHIVE_000,
					new Object[] { emaEmailArchiveDMO.getEmaSerial() });
		}

		//
		// Now, based on the values of the flags on this method signature, which
		// in turn,
		// are based on this objects associations, get all associated, embedded
		// objects
		//
		return returnEmaEmailArchiveDMO;
	}

	// ==================================================================================================

	public DTOList getList(DTOListState state,
			EmaMessageArchiveDMO emaEmailArchiveDMO)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("getList( state, emaEmailArchiveDMO )");

		return emaMessageArchiveDAC.getList(state, emaEmailArchiveDMO);
	}

	public EmaMessageArchiveDMO create(EmaMessageArchiveDMO emaEmailArchiveDMO)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("create( emaEmailArchiveDMO )");

		thrower.ifParameterMissing("emaEmailArchiveDMO", emaEmailArchiveDMO);
		thrower.ifParameterMissing("emaEmailArchiveDMO.emaSerial",
				emaEmailArchiveDMO.getEmaSerial());

		//
		// Check that this object does not already exist
		//
		if (exists(emaEmailArchiveDMO)) {
			thrower.business(Base_EMAMESSAGEARCHIVE_001,
					new Object[] { emaEmailArchiveDMO.getEmaSerial() });
		}

		//
		// Now create the record
		//
		emaMessageArchiveDAC.create(emaEmailArchiveDMO);

		return emaEmailArchiveDMO;
	}

	public EmaMessageArchiveDMO modify(EmaMessageArchiveDMO emaEmailArchiveDMO)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("modify( aemaEmailArchiveDMO )");

		//
		// Check mandatory parameters (
		//
		// Note: attributes stereotyped <NotModifiable> are ignored
		//
		thrower.ifParameterMissing("emaEmailArchiveDMO", emaEmailArchiveDMO);
		thrower.ifParameterMissing("emaEmailArchiveDMO.emaSerial",
				emaEmailArchiveDMO.getEmaSerial());

		EmaMessageArchiveDMO updateEmaEmailArchiveDMO = new EmaMessageArchiveDMO();

		updateEmaEmailArchiveDMO
				.setEmaSerial(emaEmailArchiveDMO.getEmaSerial());

		// updateEmaEmailArchiveDMO = get( updateEmaEmailArchiveDMO );

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
		updateEmaEmailArchiveDMO
				.setEmaSerial(emaEmailArchiveDMO.getEmaSerial());

		//
		// Modify the emaEmailArchiveDMO
		//

		QueryFilter filter = new QueryFilter();

		filter.add(FilterOp.SET, EmaMessageArchiveDMO.emaMessageIdFilter,
				emaEmailArchiveDMO.getEmaMessageId());
		filter.add(FilterOp.SET, EmaMessageArchiveDMO.emaAccountNoFilter,
				emaEmailArchiveDMO.getEmaAccountNo());
		filter.add(FilterOp.SET, EmaMessageArchiveDMO.emaMsisdnNoFilter,
				emaEmailArchiveDMO.getEmaMsisdnNo());
		filter.add(FilterOp.SET, EmaMessageArchiveDMO.emaSimNoFilter,
				emaEmailArchiveDMO.getEmaSimNo());
		filter.add(FilterOp.SET, EmaMessageArchiveDMO.emaHistoryCodeFilter,
				emaEmailArchiveDMO.getEmaHistoryCode());
		filter.add(FilterOp.SET, EmaMessageArchiveDMO.emaDocLocFilter,
				emaEmailArchiveDMO.getEmaDocLoc());
		filter.add(FilterOp.SET, EmaMessageArchiveDMO.emaSenderFilter,
				emaEmailArchiveDMO.getEmaSender());
		filter.add(FilterOp.SET, EmaMessageArchiveDMO.emaReceiverFilter,
				emaEmailArchiveDMO.getEmaReceiver());
		filter.add(FilterOp.SET, EmaMessageArchiveDMO.emaSubjectFilter,
				emaEmailArchiveDMO.getEmaSubject());
		filter.add(FilterOp.SET, EmaMessageArchiveDMO.emaAttentionFilter,
				emaEmailArchiveDMO.getEmaAttention());
		filter.add(FilterOp.SET, EmaMessageArchiveDMO.emaOldValueFilter,
				emaEmailArchiveDMO.getEmaOldValue());
		filter.add(FilterOp.SET, EmaMessageArchiveDMO.emaNewValueFilter,
				emaEmailArchiveDMO.getEmaNewValue());
		filter.add(FilterOp.SET, EmaMessageArchiveDMO.emaStatusFilter,
				emaEmailArchiveDMO.getEmaStatus());
		filter.add(FilterOp.SET, EmaMessageArchiveDMO.emaCommentFilter,
				emaEmailArchiveDMO.getEmaComment());
		filter.add(FilterOp.SET, EmaMessageArchiveDMO.emaSubmittedDateFilter,
				emaEmailArchiveDMO.getEmaSubmittedDate());
		filter.add(FilterOp.SET, EmaMessageArchiveDMO.emaProcessedDateFilter,
				emaEmailArchiveDMO.getEmaProcessedDate());
		filter.add(FilterOp.SET, EmaMessageArchiveDMO.emaContentsFilter,
				emaEmailArchiveDMO.getEmaContents());
		filter.add(FilterOp.SET, EmaMessageArchiveDMO.emaSentIdFilter,
				emaEmailArchiveDMO.getEmaSentId());
		filter.add(FilterOp.EQUAL, EmaMessageArchiveDMO.emaSerialFilter,
				emaEmailArchiveDMO.getEmaSerial());

		emaMessageArchiveDAC.modify(filter);

		// Create a new EmaEmailArchiveDMO, set keys, and fetch from the
		// database...
		EmaMessageArchiveDMO returnEmaEmailArchiveDMO = new EmaMessageArchiveDMO();

		returnEmaEmailArchiveDMO.setEmaSerial(updateEmaEmailArchiveDMO
				.getEmaSerial());

		returnEmaEmailArchiveDMO = get(returnEmaEmailArchiveDMO);

		return returnEmaEmailArchiveDMO;
	}

	// ==================================================================================================

	public void modify(QueryFilter filter) throws EPPIXBusinessException,
			EPPIXUnexpectedException, EPPIXFatalException {
		logger.debug("modify( filter )");

		//
		// Modify the emaEmailArchiveDMO
		//
		emaMessageArchiveDAC.modify(filter);
	}

	// ==================================================================================================

	public void delete(EmaMessageArchiveDMO emaEmailArchiveDMO)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("delete( emaEmailArchiveDMO )");

		thrower.ifParameterMissing("emaEmailArchiveDMO", emaEmailArchiveDMO);

		EmaMessageArchiveDMO updateEmaEmailArchiveDMO = null;

		updateEmaEmailArchiveDMO = get(emaEmailArchiveDMO);

		// delete self...
		emaMessageArchiveDAC.delete(emaEmailArchiveDMO);
	}

	// ==================================================================================================

	public void delete(QueryFilter filter) throws EPPIXBusinessException,
			EPPIXUnexpectedException, EPPIXFatalException {
		logger.debug("delete( filter )");

		thrower.ifParameterMissing("filter", filter);

		// delete...
		emaMessageArchiveDAC.delete(filter);
	}

	// ==================================================================================================

	public boolean exists(EmaMessageArchiveDMO emaEmailArchiveDMO)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("exists(emaEmailArchiveDMO)");

		thrower.ifParameterMissing("emaEmailArchiveDMO", emaEmailArchiveDMO);

		thrower.ifParameterMissing("emaEmailArchiveDMO.emaSerial",
				emaEmailArchiveDMO.getEmaSerial());

		return emaMessageArchiveDAC.exists(emaEmailArchiveDMO);
	}

	// ==================================================================================================

	public boolean exists(QueryFilter filter) throws EPPIXBusinessException,
			EPPIXUnexpectedException, EPPIXFatalException {
		logger.debug("exists(filter)");

		return emaMessageArchiveDAC.exists(filter);
	}

	// ==================================================================================================

	public DTOList getList(DTOListState state, QueryFilter filter)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("getList( state, filter )");

		return emaMessageArchiveDAC.getList(state, filter);
	}

	// ==================================================================================================

	public DAOIterator iterate(QueryFilter filter)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("iterateWithLock( filter )");

		return emaMessageArchiveDAC.iterate(filter);
	}

	// ==================================================================================================

	public DAOIterator iterateWithLock(QueryFilter filter)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("iterateWithLock( filter )");

		return emaMessageArchiveDAC.iterateWithLock(filter);
	}

	// ==================================================================================================

	public EmaMessageArchiveDMO get(QueryFilter filter)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("get( filter )");

		//
		// Check mandatory parameters.
		//
		thrower.ifParameterMissing("filter", filter);

		//
		// Attempt to get the EmaEmailArchiveDMO
		//
		EmaMessageArchiveDMO emaEmailArchiveDMO = emaMessageArchiveDAC.get(filter);

		return emaEmailArchiveDMO;
	}

	// ==================================================================================================

	public Object max(QueryFilter filter) throws EPPIXBusinessException,
			EPPIXUnexpectedException, EPPIXFatalException {
		logger.debug("max( filter )");

		//
		// Check mandatory parameters.
		//
		thrower.ifParameterMissing("filter", filter);

		return emaMessageArchiveDAC.max(filter);
	}

	// ==================================================================================================

	public Object min(QueryFilter filter) throws EPPIXBusinessException,
			EPPIXUnexpectedException, EPPIXFatalException {
		logger.debug("min( filter )");

		//
		// Check mandatory parameters.
		//
		thrower.ifParameterMissing("filter", filter);

		return emaMessageArchiveDAC.min(filter);
	}

	// ==================================================================================================

	public Integer count(QueryFilter filter) throws EPPIXBusinessException,
			EPPIXUnexpectedException, EPPIXFatalException {
		logger.debug("count( filter )");

		//
		// Check mandatory parameters.
		//
		thrower.ifParameterMissing("filter", filter);

		return Integer.valueOf(emaMessageArchiveDAC.count(filter));
	}
	// ==================================================================================================

}