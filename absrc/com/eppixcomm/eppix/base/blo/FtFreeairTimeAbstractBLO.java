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

public class FtFreeairTimeAbstractBLO extends BaseBLO implements
		DTOActionTypes, BaseMessages {

	static Thrower thrower = Thrower.getThrower(FtFreeairTimeAbstractBLO.class);

	protected static final String ENTITY_ID = "SBHS";

	/** Data Access Controller. */
	protected FtFreeairTimeDAC ftFreeairTimeDAC;
	/** DOCUMENT ME! */
	protected Logger logger = thrower.getLogger();

	/** Invoked by the BLOBinder to provide this BLO with its DAC. */
	protected void setDAC(DAC dac) {
		this.ftFreeairTimeDAC = (FtFreeairTimeDAC) dac;
	}

	protected Class getDACClass() {
		return FtFreeairTimeDAC.class;
	}

	public FtFreeairTimeDMO get(FtFreeairTimeDMO ftFreeairTimeDMO)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("get(ftFreeairTimeDMO)");

		//
		// Check mandatory parameters.
		//
		thrower.ifParameterMissing("ftFreeairTimeDMO", ftFreeairTimeDMO);

		//
		// Each attribute that is part of the primary key is mandatory
		//
		thrower.ifParameterMissing("ftFreeairTimeDMO.ftSubscriberId",
				ftFreeairTimeDMO.getFtSubscriberId());

		thrower.ifParameterMissing("ftFreeairTimeDMO.ftMsisdnNo",
				ftFreeairTimeDMO.getFtMsisdnNo());

		thrower.ifParameterMissing("ftFreeairTimeDMO.ftServiceCode",
				ftFreeairTimeDMO.getFtServiceCode());

		QueryFilter filter = new QueryFilter();
		filter.add(FilterOp.EQUAL, FtFreeairTimeDMO.FtSubscriberIdFilter,
				ftFreeairTimeDMO.getFtSubscriberId());
		filter.add(FilterOp.EQUAL, FtFreeairTimeDMO.FtMsisdnNoFilter,
				ftFreeairTimeDMO.getFtMsisdnNo());
		filter.add(FilterOp.EQUAL, FtFreeairTimeDMO.FtServiceCodeFilter,
				ftFreeairTimeDMO.getFtServiceCode());

		//
		// Attempt to get the FtFreeairTimeDMO
		//
		FtFreeairTimeDMO returnFtFreeairTimeDMO = ftFreeairTimeDAC.get(filter);

		//
		// Could not find the FtFreeairTimeDMO
		//
		if (returnFtFreeairTimeDMO == null) {
			thrower.business(Base_FTFREEAIRTIMElOOKUP_000,
					new Object[] { ftFreeairTimeDMO.getFtSubscriberId() });
		}

		//
		// Now, based on the values of the flags on this method signature, which
		// in turn,
		// are based on this objects associations, get all associated, embedded
		// objects
		//
		return returnFtFreeairTimeDMO;
	}

	// ==================================================================================================

	public DTOList getList(DTOListState state, FtFreeairTimeDMO ftFreeairTimeDMO)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("getList( state, ftFreeairTimeDMO )");

		return ftFreeairTimeDAC.getList(state, ftFreeairTimeDMO);
	}

	public FtFreeairTimeDMO create(FtFreeairTimeDMO ftFreeairTimeDMO)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("create( ftFreeairTimeDMO )");

		thrower.ifParameterMissing("ftFreeairTimeDMO", ftFreeairTimeDMO);
		
		thrower.ifParameterMissing("ftFreeairTimeDMO.ftSubscriberId",
				ftFreeairTimeDMO.getFtSubscriberId());

		thrower.ifParameterMissing("ftFreeairTimeDMO.ftMsisdnNo",
				ftFreeairTimeDMO.getFtMsisdnNo());

		thrower.ifParameterMissing("ftFreeairTimeDMO.ftServiceCode",
				ftFreeairTimeDMO.getFtServiceCode());

		//
		// Check that this object does not already exist
		//
		if (exists(ftFreeairTimeDMO)) {
			thrower.business(Base_FTFREEAIRTIMElOOKUP_001,
					new Object[] { ftFreeairTimeDMO.getFtSubscriberId()});
		}

		//
		// Now create the record
		//
		ftFreeairTimeDAC.create(ftFreeairTimeDMO);

		return ftFreeairTimeDMO;
	}

	public FtFreeairTimeDMO modify(FtFreeairTimeDMO ftFreeairTimeDMO)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("modify( aftFreeairTimeDMO )");

		//
		// Check mandatory parameters (
		//
		// Note: attributes stereotyped <NotModifiable> are ignored
		//
		thrower.ifParameterMissing("ftFreeairTimeDMO", ftFreeairTimeDMO);

		thrower.ifParameterMissing("ftFreeairTimeDMO.ftSubscriberId",
				ftFreeairTimeDMO.getFtSubscriberId());

		thrower.ifParameterMissing("ftFreeairTimeDMO.ftMsisdnNo",
				ftFreeairTimeDMO.getFtMsisdnNo());

		thrower.ifParameterMissing("ftFreeairTimeDMO.ftServiceCode",
				ftFreeairTimeDMO.getFtServiceCode());

		QueryFilter filter = new QueryFilter();
		
		filter.add(FilterOp.SET, FtFreeairTimeDMO.FtBillCycleFilter,
				ftFreeairTimeDMO.getFtBillCycle());
		
		if(ftFreeairTimeDMO.getFtContEnd() != null){
			filter.add(FilterOp.SET, FtFreeairTimeDMO.FtContEndFilter,
				ftFreeairTimeDMO.getFtContEnd());
		}
		
		filter.add(FilterOp.SET, FtFreeairTimeDMO.FtContStartFilter,
				ftFreeairTimeDMO.getFtContStart());
		
		if(ftFreeairTimeDMO.getFtDeactDate() != null){
			filter.add(FilterOp.SET, FtFreeairTimeDMO.FtDeactDateFilter,
				ftFreeairTimeDMO.getFtDeactDate());
		}
		
		filter.add(FilterOp.SET, FtFreeairTimeDMO.FtOrigSecsFilter,
				ftFreeairTimeDMO.getFtOrigSecs());
		filter.add(FilterOp.SET, FtFreeairTimeDMO.FtPrdEndFilter,
				ftFreeairTimeDMO.getFtPrdEnd());
		filter.add(FilterOp.SET, FtFreeairTimeDMO.FtPrdStartFilter,
				ftFreeairTimeDMO.getFtPrdStart());
		filter.add(FilterOp.SET, FtFreeairTimeDMO.FtSecsRemainingFilter,
				ftFreeairTimeDMO.getFtSecsRemaining());
		filter.add(FilterOp.SET, FtFreeairTimeDMO.FtSimNoFilter,
				ftFreeairTimeDMO.getFtSimNo());
		
		if(ftFreeairTimeDMO.getFtTarplanRef() != null){
			filter.add(FilterOp.SET, FtFreeairTimeDMO.FtTarplanRefFilter,
				ftFreeairTimeDMO.getFtTarplanRef());
		}
		
		
		filter.add(FilterOp.SET, FtFreeairTimeDMO.FtValueUsedFilter,
				ftFreeairTimeDMO.getFtValueUsed());

		filter.add(FilterOp.EQUAL, FtFreeairTimeDMO.FtSubscriberIdFilter,
				ftFreeairTimeDMO.getFtSubscriberId());
		filter.add(FilterOp.EQUAL, FtFreeairTimeDMO.FtMsisdnNoFilter,
				ftFreeairTimeDMO.getFtMsisdnNo());
		filter.add(FilterOp.EQUAL, FtFreeairTimeDMO.FtServiceCodeFilter,
				ftFreeairTimeDMO.getFtServiceCode());


		//
		// Modify the ftFreeairTimeDMO
		//
		ftFreeairTimeDAC.modify(filter);

		// Create a new FtFreeairTimeDMO, set keys, and fetch from the
		// database...
		FtFreeairTimeDMO returnFtFreeairTimeDMO = null;
		
		filter = new QueryFilter();

		filter.add(FilterOp.EQUAL, FtFreeairTimeDMO.FtSubscriberIdFilter,
				ftFreeairTimeDMO.getFtSubscriberId());
		filter.add(FilterOp.EQUAL, FtFreeairTimeDMO.FtMsisdnNoFilter,
				ftFreeairTimeDMO.getFtMsisdnNo());
		filter.add(FilterOp.EQUAL, FtFreeairTimeDMO.FtServiceCodeFilter,
				ftFreeairTimeDMO.getFtServiceCode());

		returnFtFreeairTimeDMO = get(filter);

		return returnFtFreeairTimeDMO;
	}

	// ==================================================================================================

	public void modify(QueryFilter filter) throws EPPIXBusinessException,
			EPPIXUnexpectedException, EPPIXFatalException {
		logger.debug("modify( filter )");

		//
		// Modify the ftFreeairTimeDMO
		//
		ftFreeairTimeDAC.modify(filter);
	}

	// ==================================================================================================

	public void delete(FtFreeairTimeDMO ftFreeairTimeDMO)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("delete( ftFreeairTimeDMO )");

		thrower.ifParameterMissing("ftFreeairTimeDMO", ftFreeairTimeDMO);
		
		thrower.ifParameterMissing("ftFreeairTimeDMO.ftSubscriberId",
				ftFreeairTimeDMO.getFtSubscriberId());

		thrower.ifParameterMissing("ftFreeairTimeDMO.ftMsisdnNo",
				ftFreeairTimeDMO.getFtMsisdnNo());

		thrower.ifParameterMissing("ftFreeairTimeDMO.ftServiceCode",
				ftFreeairTimeDMO.getFtServiceCode());

		FtFreeairTimeDMO updateFtFreeairTimeDMO = null;

		updateFtFreeairTimeDMO = get(ftFreeairTimeDMO);

		// delete self...
		ftFreeairTimeDAC.delete(ftFreeairTimeDMO);
	}

	// ==================================================================================================

	public void delete(QueryFilter filter) throws EPPIXBusinessException,
			EPPIXUnexpectedException, EPPIXFatalException {
		logger.debug("delete( filter )");

		thrower.ifParameterMissing("filter", filter);

		// delete...
		ftFreeairTimeDAC.delete(filter);
	}

	// ==================================================================================================

	public boolean exists(FtFreeairTimeDMO ftFreeairTimeDMO)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("exists(ftFreeairTimeDMO)");

		thrower.ifParameterMissing("ftFreeairTimeDMO", ftFreeairTimeDMO);

		thrower.ifParameterMissing("ftFreeairTimeDMO.ftSubscriberId",
				ftFreeairTimeDMO.getFtSubscriberId());

		thrower.ifParameterMissing("ftFreeairTimeDMO.ftMsisdnNo",
				ftFreeairTimeDMO.getFtMsisdnNo());

		thrower.ifParameterMissing("ftFreeairTimeDMO.ftServiceCode",
				ftFreeairTimeDMO.getFtServiceCode());

		return ftFreeairTimeDAC.exists(ftFreeairTimeDMO);
	}

	// ==================================================================================================

	public boolean exists(QueryFilter filter) throws EPPIXBusinessException,
			EPPIXUnexpectedException, EPPIXFatalException {
		logger.debug("exists(filter)");

		return ftFreeairTimeDAC.exists(filter);
	}

	// ==================================================================================================

	public DTOList getList(DTOListState state, QueryFilter filter)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("getList( state, filter )");

		return ftFreeairTimeDAC.getList(state, filter);
	}

	// ==================================================================================================

	public DAOIterator iterate(QueryFilter filter)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("iterateWithLock( filter )");

		return ftFreeairTimeDAC.iterate(filter);
	}

	// ==================================================================================================

	public DAOIterator iterateWithLock(QueryFilter filter)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("iterateWithLock( filter )");

		return ftFreeairTimeDAC.iterateWithLock(filter);
	}

	// ==================================================================================================

	public FtFreeairTimeDMO get(QueryFilter filter)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("get( filter )");

		//
		// Check mandatory parameters.
		//
		thrower.ifParameterMissing("filter", filter);

		//
		// Attempt to get the FtFreeairTimeDMO
		//
		FtFreeairTimeDMO ftFreeairTimeDMO = ftFreeairTimeDAC.get(filter);

		return ftFreeairTimeDMO;
	}

	// ==================================================================================================

	public Object max(QueryFilter filter) throws EPPIXBusinessException,
			EPPIXUnexpectedException, EPPIXFatalException {
		logger.debug("max( filter )");

		//
		// Check mandatory parameters.
		//
		thrower.ifParameterMissing("filter", filter);

		return ftFreeairTimeDAC.max(filter);
	}

	// ==================================================================================================

	public Object min(QueryFilter filter) throws EPPIXBusinessException,
			EPPIXUnexpectedException, EPPIXFatalException {
		logger.debug("min( filter )");

		//
		// Check mandatory parameters.
		//
		thrower.ifParameterMissing("filter", filter);

		return ftFreeairTimeDAC.min(filter);
	}

	// ==================================================================================================

	public Integer count(QueryFilter filter) throws EPPIXBusinessException,
			EPPIXUnexpectedException, EPPIXFatalException {
		logger.debug("count( filter )");

		//
		// Check mandatory parameters.
		//
		thrower.ifParameterMissing("filter", filter);

		return Integer.valueOf(ftFreeairTimeDAC.count(filter));
	}
	// ==================================================================================================

}