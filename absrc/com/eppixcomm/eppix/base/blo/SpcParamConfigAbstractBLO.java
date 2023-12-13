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

public class SpcParamConfigAbstractBLO extends BaseBLO implements
		DTOActionTypes, BaseMessages {

	static Thrower thrower = Thrower
			.getThrower(SpcParamConfigAbstractBLO.class);

	protected static final String ENTITY_ID = "FS";

	/** Data Access Controller. */
	protected SpcParamConfigDAC spcParamConfigDAC;
	/** DOCUMENT ME! */
	protected Logger logger = thrower.getLogger();

	/** Invoked by the BLOBinder to provide this BLO with its DAC. */
	protected void setDAC(DAC dac) {
		this.spcParamConfigDAC = (SpcParamConfigDAC) dac;
	}

	protected Class getDACClass() {
		return SpcParamConfigDAC.class;
	}

	public SpcParamConfigDMO get(SpcParamConfigDMO spcParamConfigDMO)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("get(spcParamConfigDMO)");

		//
		// Check mandatory parameters.
		//
		thrower.ifParameterMissing("spcParamConfigDMO", spcParamConfigDMO);

		//
		// Each attribute that is part of the primary key is mandatory
		//
		thrower.ifParameterMissing("spcParamConfigDMO.spcParamId",
				spcParamConfigDMO.getSpcParamId());

		thrower.ifParameterMissing("spcParamConfigDMO.spcParamName",
				spcParamConfigDMO.getSpcParamName());

		//
		// Attempt to get the SpcParamConfigDMO
		//
		// SpcParamConfigDMO returnSpcParamConfigDMO = spcParamConfigDAC.get(
		// spcParamConfigDMO );

		QueryFilter filter = new QueryFilter();
		filter.add(FilterOp.EQUAL, SpcParamConfigDMO.spcParamIdFilter,
				spcParamConfigDMO.getSpcParamId());
		filter.add(FilterOp.EQUAL, SpcParamConfigDMO.spcParamNameFilter,
				spcParamConfigDMO.getSpcParamName());

		SpcParamConfigDMO returnSpcParamConfigDMO = this.get(filter);

		//
		// Could not find the SpcParamConfigDMO
		//
		if (returnSpcParamConfigDMO == null) {
			thrower.business(Base_ACTACCTYPES_000,
					new Object[] { spcParamConfigDMO.getSpcParamId(),
							spcParamConfigDMO.getSpcParamName() });
		}

		//
		// Now, based on the values of the flags on this method signature, which
		// in turn,
		// are based on this objects associations, get all associated, embedded
		// objects
		//
		return returnSpcParamConfigDMO;
	}

	// ==================================================================================================

	public DTOList getList(DTOListState state,
			SpcParamConfigDMO spcParamConfigDMO) throws EPPIXBusinessException,
			EPPIXUnexpectedException, EPPIXFatalException {
		logger.debug("getList( state, spcParamConfigDMO )");

		return spcParamConfigDAC.getList(state, spcParamConfigDMO);
	}

	public SpcParamConfigDMO create(SpcParamConfigDMO spcParamConfigDMO)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("create( spcParamConfigDMO )");

		thrower.ifParameterMissing("spcParamConfigDMO", spcParamConfigDMO);

		thrower.ifParameterMissing("spcParamConfigDMO.spcParamId",
				spcParamConfigDMO.getSpcParamId());

		thrower.ifParameterMissing("spcParamConfigDMO.spcParamName",
				spcParamConfigDMO.getSpcParamName());

		//
		// Check that this object does not already exist
		//
		if (exists(spcParamConfigDMO)) {
			thrower.business(Base_ACTACCTYPES_001,
					new Object[] { spcParamConfigDMO.getSpcParamId() });
		}

		//
		// Now create the record
		//
		spcParamConfigDAC.create(spcParamConfigDMO);

		return spcParamConfigDMO;
	}

	public SpcParamConfigDMO modify(SpcParamConfigDMO spcParamConfigDMO)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("modify( aspcParamConfigDMO )");

		//
		// Check mandatory parameters (
		//
		// Note: attributes stereotyped <NotModifiable> are ignored
		//
		thrower.ifParameterMissing("spcParamConfigDMO", spcParamConfigDMO);

		thrower.ifParameterMissing("spcParamConfigDMO.spcParamId",
				spcParamConfigDMO.getSpcParamId());

		thrower.ifParameterMissing("spcParamConfigDMO.spcParamName",
				spcParamConfigDMO.getSpcParamName());

		QueryFilter filter = new QueryFilter();
		filter.add(FilterOp.SET, SpcParamConfigDMO.spcCanTermFilter,
				spcParamConfigDMO.getSpcCanTerm());
		filter.add(FilterOp.SET, SpcParamConfigDMO.spcContrPeriodFilter,
				spcParamConfigDMO.getSpcContrPeriod());
		filter.add(FilterOp.SET, SpcParamConfigDMO.spcExclusionRuleFilter,
				spcParamConfigDMO.getSpcExclusionRule());
		filter.add(FilterOp.SET, SpcParamConfigDMO.spcLegalEntityFilter,
				spcParamConfigDMO.getSpcLegalEntity());
		filter.add(FilterOp.SET, SpcParamConfigDMO.spcLockToPackFilter,
				spcParamConfigDMO.getSpcLockToPack());
		filter.add(FilterOp.SET, SpcParamConfigDMO.spcLockToTariffFilter,
				spcParamConfigDMO.getSpcLockToTariff());
		filter.add(FilterOp.SET, SpcParamConfigDMO.spcNodeStringFilter,
				spcParamConfigDMO.getSpcNodeString());
		filter.add(FilterOp.SET, SpcParamConfigDMO.spcParamProrataFilter,
				spcParamConfigDMO.getSpcParamProrata());
		filter.add(FilterOp.SET, SpcParamConfigDMO.spcServiceCodeFilter,
				spcParamConfigDMO.getSpcServiceCode());
		filter.add(FilterOp.SET, SpcParamConfigDMO.spcServiceTypeFilter,
				spcParamConfigDMO.getSpcServiceType());
		filter.add(FilterOp.SET, SpcParamConfigDMO.spcTaxInvFilter,
				spcParamConfigDMO.getSpcTaxInv());
		filter.add(FilterOp.SET, SpcParamConfigDMO.spcValueTypeFilter,
				spcParamConfigDMO.getSpcValueType());

		filter.add(FilterOp.EQUAL, SpcParamConfigDMO.spcParamIdFilter,
				spcParamConfigDMO.getSpcParamId());
		filter.add(FilterOp.EQUAL, SpcParamConfigDMO.spcParamNameFilter,
				spcParamConfigDMO.getSpcParamName());

		//
		// Modify the spcParamConfigDMO
		//
		spcParamConfigDAC.modify(filter);

		// Create a new SpcParamConfigDMO, set keys, and fetch from the
		// database...
		SpcParamConfigDMO returnSpcParamConfigDMO = new SpcParamConfigDMO();

		returnSpcParamConfigDMO
				.setSpcParamId(spcParamConfigDMO.getSpcParamId());
		returnSpcParamConfigDMO.setSpcParamName(spcParamConfigDMO
				.getSpcParamName());

		returnSpcParamConfigDMO = get(returnSpcParamConfigDMO);

		return returnSpcParamConfigDMO;
	}

	// ==================================================================================================

	public void modify(QueryFilter filter) throws EPPIXBusinessException,
			EPPIXUnexpectedException, EPPIXFatalException {
		logger.debug("modify( filter )");

		//
		// Modify the spcParamConfigDMO
		//
		spcParamConfigDAC.modify(filter);
	}

	// ==================================================================================================

	public void delete(SpcParamConfigDMO spcParamConfigDMO)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("delete( spcParamConfigDMO )");

		thrower.ifParameterMissing("spcParamConfigDMO", spcParamConfigDMO);

		thrower.ifParameterMissing("spcParamConfigDMO.spcParamId",
				spcParamConfigDMO.getSpcParamId());

		thrower.ifParameterMissing("spcParamConfigDMO.spcParamName",
				spcParamConfigDMO.getSpcParamName());

		SpcParamConfigDMO updateSpcParamConfigDMO = null;

		updateSpcParamConfigDMO = get(spcParamConfigDMO);

		// delete self...
		spcParamConfigDAC.delete(spcParamConfigDMO);
	}

	// ==================================================================================================

	public void delete(QueryFilter filter) throws EPPIXBusinessException,
			EPPIXUnexpectedException, EPPIXFatalException {
		logger.debug("delete( filter )");

		thrower.ifParameterMissing("filter", filter);

		// delete...
		spcParamConfigDAC.delete(filter);
	}

	// ==================================================================================================

	public boolean exists(SpcParamConfigDMO spcParamConfigDMO)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("exists(spcParamConfigDMO)");

		thrower.ifParameterMissing("spcParamConfigDMO", spcParamConfigDMO);

		thrower.ifParameterMissing("spcParamConfigDMO.spcParamId",
				spcParamConfigDMO.getSpcParamId());

		thrower.ifParameterMissing("spcParamConfigDMO.spcParamName",
				spcParamConfigDMO.getSpcParamName());

		return spcParamConfigDAC.exists(spcParamConfigDMO);
	}

	// ==================================================================================================

	public boolean exists(QueryFilter filter) throws EPPIXBusinessException,
			EPPIXUnexpectedException, EPPIXFatalException {
		logger.debug("exists(filter)");

		return spcParamConfigDAC.exists(filter);
	}

	// ==================================================================================================

	public DTOList getList(DTOListState state, QueryFilter filter)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("getList( state, filter )");

		return spcParamConfigDAC.getList(state, filter);
	}

	// ==================================================================================================

	public DAOIterator iterate(QueryFilter filter)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("iterateWithLock( filter )");

		return spcParamConfigDAC.iterate(filter);
	}

	// ==================================================================================================

	public DAOIterator iterateWithLock(QueryFilter filter)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("iterateWithLock( filter )");

		return spcParamConfigDAC.iterateWithLock(filter);
	}

	// ==================================================================================================

	public SpcParamConfigDMO get(QueryFilter filter)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("get( filter )");

		//
		// Check mandatory parameters.
		//
		thrower.ifParameterMissing("filter", filter);

		//
		// Attempt to get the SpcParamConfigDMO
		//
		SpcParamConfigDMO spcParamConfigDMO = spcParamConfigDAC.get(filter);

		return spcParamConfigDMO;
	}

	// ==================================================================================================

	public Object max(QueryFilter filter) throws EPPIXBusinessException,
			EPPIXUnexpectedException, EPPIXFatalException {
		logger.debug("max( filter )");

		//
		// Check mandatory parameters.
		//
		thrower.ifParameterMissing("filter", filter);

		return spcParamConfigDAC.max(filter);
	}

	// ==================================================================================================

	public Object min(QueryFilter filter) throws EPPIXBusinessException,
			EPPIXUnexpectedException, EPPIXFatalException {
		logger.debug("min( filter )");

		//
		// Check mandatory parameters.
		//
		thrower.ifParameterMissing("filter", filter);

		return spcParamConfigDAC.min(filter);
	}

	// ==================================================================================================

	public Integer count(QueryFilter filter) throws EPPIXBusinessException,
			EPPIXUnexpectedException, EPPIXFatalException {
		logger.debug("count( filter )");

		//
		// Check mandatory parameters.
		//
		thrower.ifParameterMissing("filter", filter);

		return Integer.valueOf(spcParamConfigDAC.count(filter));
	}
	// ==================================================================================================

}