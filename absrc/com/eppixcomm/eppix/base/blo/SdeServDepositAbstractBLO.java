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

public class SdeServDepositAbstractBLO extends BaseBLO implements
		DTOActionTypes, BaseMessages {

	static Thrower thrower = Thrower
			.getThrower(SdeServDepositAbstractBLO.class);

	protected static final String ENTITY_ID = "SDE";

	/** Data Access Controller. */
	protected SdeServDepositDAC sdeServDepositDAC;
	/** DOCUMENT ME! */
	protected Logger logger = thrower.getLogger();

	/** Invoked by the BLOBinder to provide this BLO with its DAC. */
	protected void setDAC(DAC dac) {
		this.sdeServDepositDAC = (SdeServDepositDAC) dac;
	}

	protected Class getDACClass() {
		return SdeServDepositDAC.class;
	}

	public SdeServDepositDMO get(SdeServDepositDMO sdeServDepositDMO)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("get(sdeServDepositDMO)");

		//
		// Check mandatory parameters.
		//
		thrower.ifParameterMissing("sdeServDepositDMO", sdeServDepositDMO);

		//
		// Each attribute that is part of the primary key is mandatory
		//
		thrower.ifParameterMissing("sdeServDepositDMO.sdeDepositId",
				sdeServDepositDMO.getSdeDepositId());

		thrower.ifParameterMissing("sdeServDepositDMO.sdeServiceCode",
				sdeServDepositDMO.getSdeServiceCode());

		thrower.ifParameterMissing("sdeServDepositDMO.sdePackageCode",
				sdeServDepositDMO.getSdePackageCode());

		thrower.ifParameterMissing("sdeServDepositDMO.sdeVerRuleNumd",
				sdeServDepositDMO.getSdeVerRuleNum());

		QueryFilter filter = new QueryFilter();
		filter.add(FilterOp.EQUAL, SdeServDepositDMO.SdeDepositIdFilter,
				sdeServDepositDMO.getSdeDepositId());
		filter.add(FilterOp.EQUAL, SdeServDepositDMO.SdeServiceCodeFilter,
				sdeServDepositDMO.getSdeServiceCode());
		filter.add(FilterOp.EQUAL, SdeServDepositDMO.SdePackageCodeFilter,
				sdeServDepositDMO.getSdePackageCode());
		filter.add(FilterOp.EQUAL, SdeServDepositDMO.SdeVerRuleNumFilter,
				sdeServDepositDMO.getSdeVerRuleNum());

		//
		// Attempt to get the SdeServDepositDMO
		//
		SdeServDepositDMO returnSdeServDepositDMO = sdeServDepositDAC
				.get(filter);

		//
		// Could not find the SdeServDepositDMO
		//
		if (returnSdeServDepositDMO == null) {
			thrower.business(Base_ACTACCTYPES_000,
					new Object[] { sdeServDepositDMO.getSdeDepositId() });
		}

		//
		// Now, based on the values of the flags on this method signature, which
		// in turn,
		// are based on this objects associations, get all associated, embedded
		// objects
		//
		return returnSdeServDepositDMO;
	}

	// ==================================================================================================

	public DTOList getList(DTOListState state,
			SdeServDepositDMO sdeServDepositDMO) throws EPPIXBusinessException,
			EPPIXUnexpectedException, EPPIXFatalException {
		logger.debug("getList( state, sdeServDepositDMO )");

		return sdeServDepositDAC.getList(state, sdeServDepositDMO);
	}

	public SdeServDepositDMO create(SdeServDepositDMO sdeServDepositDMO)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("create( sdeServDepositDMO )");

		thrower.ifParameterMissing("sdeServDepositDMO", sdeServDepositDMO);

		thrower.ifParameterMissing("sdeServDepositDMO.sdeDepositId",
				sdeServDepositDMO.getSdeDepositId());

		thrower.ifParameterMissing("sdeServDepositDMO.sdeServiceCode",
				sdeServDepositDMO.getSdeServiceCode());

		thrower.ifParameterMissing("sdeServDepositDMO.sdePackageCode",
				sdeServDepositDMO.getSdePackageCode());

		thrower.ifParameterMissing("sdeServDepositDMO.sdeVerRuleNumd",
				sdeServDepositDMO.getSdeVerRuleNum());

		//
		// Check that this object does not already exist
		//
		if (exists(sdeServDepositDMO)) {
			thrower.business(Base_ACTACCTYPES_001,
					new Object[] { sdeServDepositDMO.getSdeDepositId() });
		}

		//
		// Now create the record
		//
		sdeServDepositDAC.create(sdeServDepositDMO);

		return sdeServDepositDMO;
	}

	public SdeServDepositDMO modify(SdeServDepositDMO sdeServDepositDMO)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("modify( asdeServDepositDMO )");

		//
		// Check mandatory parameters (
		//
		// Note: attributes stereotyped <NotModifiable> are ignored
		//
		thrower.ifParameterMissing("sdeServDepositDMO", sdeServDepositDMO);

		thrower.ifParameterMissing("sdeServDepositDMO.sdeDepositId",
				sdeServDepositDMO.getSdeDepositId());

		thrower.ifParameterMissing("sdeServDepositDMO.sdeServiceCode",
				sdeServDepositDMO.getSdeServiceCode());

		thrower.ifParameterMissing("sdeServDepositDMO.sdePackageCode",
				sdeServDepositDMO.getSdePackageCode());

		thrower.ifParameterMissing("sdeServDepositDMO.sdeVerRuleNumd",
				sdeServDepositDMO.getSdeVerRuleNum());

		QueryFilter filter = new QueryFilter();
		filter.add(FilterOp.SET, SdeServDepositDMO.SdeCustomerIdFilter, sdeServDepositDMO.getSdeCustomerId());
		filter.add(FilterOp.SET, SdeServDepositDMO.SdeSubscriberIdFilter, sdeServDepositDMO.getSdeSubscriberId());
		filter.add(FilterOp.SET, SdeServDepositDMO.SdeLatesPayDateFilter, sdeServDepositDMO.getSdeLatesPayDate());
		filter.add(FilterOp.SET, SdeServDepositDMO.SdePayDateFilter, sdeServDepositDMO.getSdePayDate());
		filter.add(FilterOp.SET, SdeServDepositDMO.SdeDepositStatusFilter, sdeServDepositDMO.getSdeDepositStatus());
		filter.add(FilterOp.SET, SdeServDepositDMO.SdeDeactDateFilter, sdeServDepositDMO.getSdeDeactDate());
		filter.add(FilterOp.SET, SdeServDepositDMO.SdeReleaseDateFilter, sdeServDepositDMO.getSdeReleaseDate());
		filter.add(FilterOp.SET, SdeServDepositDMO.SdeAmountDueFilter, sdeServDepositDMO.getSdeAmountDue());
		filter.add(FilterOp.SET, SdeServDepositDMO.SdeAmountPaidFilter, sdeServDepositDMO.getSdeAmountPaid());
		filter.add(FilterOp.SET, SdeServDepositDMO.SdeServiceStatusFilter, sdeServDepositDMO.getSdeServiceStatus());
		filter.add(FilterOp.SET, SdeServDepositDMO.SdeBatchRunNumFilter, sdeServDepositDMO.getSdeBatchRunNum());
		filter.add(FilterOp.SET, SdeServDepositDMO.SdeSimNoFilter, sdeServDepositDMO.getSdeSimNo());
		filter.add(FilterOp.SET, SdeServDepositDMO.SdeMsisdnNoFilter, sdeServDepositDMO.getSdeMsisdnNo());
		filter.add(FilterOp.SET, SdeServDepositDMO.SdePendLetterIdFilter, sdeServDepositDMO.getSdePendLetterId());
		filter.add(FilterOp.SET, SdeServDepositDMO.SdeCurrencyFilter, sdeServDepositDMO.getSdeCurrency());
		filter.add(FilterOp.SET, SdeServDepositDMO.SdeExchangeRateFilter, sdeServDepositDMO.getSdeExchangeRate());
		
		filter.add(FilterOp.EQUAL, SdeServDepositDMO.SdeDepositIdFilter,
				sdeServDepositDMO.getSdeDepositId());
		filter.add(FilterOp.EQUAL, SdeServDepositDMO.SdeServiceCodeFilter,
				sdeServDepositDMO.getSdeServiceCode());
		filter.add(FilterOp.EQUAL, SdeServDepositDMO.SdePackageCodeFilter,
				sdeServDepositDMO.getSdePackageCode());
		filter.add(FilterOp.EQUAL, SdeServDepositDMO.SdeVerRuleNumFilter,
				sdeServDepositDMO.getSdeVerRuleNum());

		//
		// Modify the sdeServDepositDMO
		//
		sdeServDepositDAC.modify(filter);
		
		

		// Create a new SdeServDepositDMO, set keys, and fetch from the
		// database...
		
		filter = new QueryFilter();
		filter.add(FilterOp.EQUAL, SdeServDepositDMO.SdeDepositIdFilter,
				sdeServDepositDMO.getSdeDepositId());
		filter.add(FilterOp.EQUAL, SdeServDepositDMO.SdeServiceCodeFilter,
				sdeServDepositDMO.getSdeServiceCode());
		filter.add(FilterOp.EQUAL, SdeServDepositDMO.SdePackageCodeFilter,
				sdeServDepositDMO.getSdePackageCode());
		filter.add(FilterOp.EQUAL, SdeServDepositDMO.SdeVerRuleNumFilter,
				sdeServDepositDMO.getSdeVerRuleNum());
		
		SdeServDepositDMO returnSdeServDepositDMO = null;

		returnSdeServDepositDMO = get(filter);

		return returnSdeServDepositDMO;
	}

	// ==================================================================================================

	public void modify(QueryFilter filter) throws EPPIXBusinessException,
			EPPIXUnexpectedException, EPPIXFatalException {
		logger.debug("modify( filter )");

		//
		// Modify the sdeServDepositDMO
		//
		sdeServDepositDAC.modify(filter);
	}

	// ==================================================================================================

	public void delete(SdeServDepositDMO sdeServDepositDMO)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("delete( sdeServDepositDMO )");

		thrower.ifParameterMissing("sdeServDepositDMO", sdeServDepositDMO);

		thrower.ifParameterMissing("sdeServDepositDMO.sdeDepositId",
				sdeServDepositDMO.getSdeDepositId());

		thrower.ifParameterMissing("sdeServDepositDMO.sdeServiceCode",
				sdeServDepositDMO.getSdeServiceCode());

		thrower.ifParameterMissing("sdeServDepositDMO.sdePackageCode",
				sdeServDepositDMO.getSdePackageCode());

		thrower.ifParameterMissing("sdeServDepositDMO.sdeVerRuleNumd",
				sdeServDepositDMO.getSdeVerRuleNum());

		SdeServDepositDMO updateSdeServDepositDMO = null;

		updateSdeServDepositDMO = get(sdeServDepositDMO);

		// delete self...
		sdeServDepositDAC.delete(sdeServDepositDMO);
	}

	// ==================================================================================================

	public void delete(QueryFilter filter) throws EPPIXBusinessException,
			EPPIXUnexpectedException, EPPIXFatalException {
		logger.debug("delete( filter )");

		thrower.ifParameterMissing("filter", filter);

		// delete...
		sdeServDepositDAC.delete(filter);
	}

	// ==================================================================================================

	public boolean exists(SdeServDepositDMO sdeServDepositDMO)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("exists(sdeServDepositDMO)");

		thrower.ifParameterMissing("sdeServDepositDMO", sdeServDepositDMO);

		thrower.ifParameterMissing("sdeServDepositDMO.sdeDepositId",
				sdeServDepositDMO.getSdeDepositId());

		thrower.ifParameterMissing("sdeServDepositDMO.sdeServiceCode",
				sdeServDepositDMO.getSdeServiceCode());

		thrower.ifParameterMissing("sdeServDepositDMO.sdePackageCode",
				sdeServDepositDMO.getSdePackageCode());

		thrower.ifParameterMissing("sdeServDepositDMO.sdeVerRuleNumd",
				sdeServDepositDMO.getSdeVerRuleNum());

		return sdeServDepositDAC.exists(sdeServDepositDMO);
	}

	// ==================================================================================================

	public boolean exists(QueryFilter filter) throws EPPIXBusinessException,
			EPPIXUnexpectedException, EPPIXFatalException {
		logger.debug("exists(filter)");

		return sdeServDepositDAC.exists(filter);
	}

	// ==================================================================================================

	public DTOList getList(DTOListState state, QueryFilter filter)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("getList( state, filter )");

		return sdeServDepositDAC.getList(state, filter);
	}

	// ==================================================================================================

	public DAOIterator iterate(QueryFilter filter)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("iterateWithLock( filter )");

		return sdeServDepositDAC.iterate(filter);
	}

	// ==================================================================================================

	public DAOIterator iterateWithLock(QueryFilter filter)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("iterateWithLock( filter )");

		return sdeServDepositDAC.iterateWithLock(filter);
	}

	// ==================================================================================================

	public SdeServDepositDMO get(QueryFilter filter)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("get( filter )");

		//
		// Check mandatory parameters.
		//
		thrower.ifParameterMissing("filter", filter);

		//
		// Attempt to get the SdeServDepositDMO
		//
		SdeServDepositDMO sdeServDepositDMO = sdeServDepositDAC.get(filter);

		return sdeServDepositDMO;
	}

	// ==================================================================================================

	public Object max(QueryFilter filter) throws EPPIXBusinessException,
			EPPIXUnexpectedException, EPPIXFatalException {
		logger.debug("max( filter )");

		//
		// Check mandatory parameters.
		//
		thrower.ifParameterMissing("filter", filter);

		return sdeServDepositDAC.max(filter);
	}

	// ==================================================================================================

	public Object min(QueryFilter filter) throws EPPIXBusinessException,
			EPPIXUnexpectedException, EPPIXFatalException {
		logger.debug("min( filter )");

		//
		// Check mandatory parameters.
		//
		thrower.ifParameterMissing("filter", filter);

		return sdeServDepositDAC.min(filter);
	}

	// ==================================================================================================

	public Integer count(QueryFilter filter) throws EPPIXBusinessException,
			EPPIXUnexpectedException, EPPIXFatalException {
		logger.debug("count( filter )");

		//
		// Check mandatory parameters.
		//
		thrower.ifParameterMissing("filter", filter);

		return Integer.valueOf(sdeServDepositDAC.count(filter));
	}
	// ==================================================================================================

}