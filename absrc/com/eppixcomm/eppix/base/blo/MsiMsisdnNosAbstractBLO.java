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

public class MsiMsisdnNosAbstractBLO extends BaseBLO implements DTOActionTypes,
		BaseMessages {

	static Thrower thrower = Thrower.getThrower(MsiMsisdnNosAbstractBLO.class);

	protected static final String ENTITY_ID = "MSI";

	/** Data Access Controller. */
	protected MsiMsisdnNosDAC msiMsisdnNosDAC;
	/** DOCUMENT ME! */
	protected Logger logger = thrower.getLogger();

	/** Invoked by the BLOBinder to provide this BLO with its DAC. */
	protected void setDAC(DAC dac) {
		this.msiMsisdnNosDAC = (MsiMsisdnNosDAC) dac;
	}

	protected Class getDACClass() {
		return MsiMsisdnNosDAC.class;
	}

//	public MsiMsisdnNosDMO get(MsiMsisdnNosDMO msiMsisdnNosDMO)
//			throws EPPIXBusinessException, EPPIXUnexpectedException,
//			EPPIXFatalException {
//		logger.debug("get(msiMsisdnNosDMO)");
//
//		//
//		// Check mandatory parameters.
//		//
//		thrower.ifParameterMissing("msiMsisdnNosDMO", msiMsisdnNosDMO);
//
//		//
//		// Each attribute that is part of the primary key is mandatory
//		//
//		thrower.ifParameterMissing("msiMsisdnNosDMO.msiMsisdnNo",
//				msiMsisdnNosDMO.getMsiMsisdnNo());
//
//		thrower.ifParameterMissing("msiMsisdnNosDMO.msiOrigProvId",
//				msiMsisdnNosDMO.getMsiOrigProvId());
//		
//		
//		QueryFilter filter = new QueryFilter();
//		filter.add(FilterOp.EQUAL, msiMsisdnNosDMO.MsiMsisdnNoFilter, msiMsisdnNosDMO.getMsiMsisdnNo() );
//		filter.add(FilterOp.EQUAL, msiMsisdnNosDMO.MsiOrigProvIdFilter, msiMsisdnNosDMO.getMsiOrigProvId());
//
//		//
//		// Attempt to get the MsiMsisdnNosDMO
//		//
//		MsiMsisdnNosDMO returnMsiMsisdnNosDMO = msiMsisdnNosDAC
//				.get(filter);
//
//		//
//		// Could not find the MsiMsisdnNosDMO
//		//
//		if (returnMsiMsisdnNosDMO == null) {
//			thrower.business(Base_ACTACCTYPES_000,
//					new Object[] { msiMsisdnNosDMO.getMsiMsisdnNo(),
//							msiMsisdnNosDMO.getMsiOrigProvId() });
//		}
//
//		//
//		// Now, based on the values of the flags on this method signature, which
//		// in turn,
//		// are based on this objects associations, get all associated, embedded
//		// objects
//		//
//		return returnMsiMsisdnNosDMO;
//	}

	// ==================================================================================================

	public DTOList getList(DTOListState state, MsiMsisdnNosDMO msiMsisdnNosDMO)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("getList( state, msiMsisdnNosDMO )");

		return msiMsisdnNosDAC.getList(state, msiMsisdnNosDMO);
	}

	public MsiMsisdnNosDMO create(MsiMsisdnNosDMO msiMsisdnNosDMO)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("create( msiMsisdnNosDMO )");

		thrower.ifParameterMissing("msiMsisdnNosDMO", msiMsisdnNosDMO);

		thrower.ifParameterMissing("msiMsisdnNosDMO.msiMsisdnNo",
				msiMsisdnNosDMO.getMsiMsisdnNo());

		thrower.ifParameterMissing("msiMsisdnNosDMO.msiOrigProvId",
				msiMsisdnNosDMO.getMsiOrigProvId());

		//
		// Check that this object does not already exist
		//
		if (exists(msiMsisdnNosDMO)) {
			thrower.business(Base_ACTACCTYPES_001,
					new Object[] { msiMsisdnNosDMO.getMsiMsisdnNo(),
							msiMsisdnNosDMO.getMsiOrigProvId() });
		}

		//
		// Now create the record
		//
		msiMsisdnNosDAC.create(msiMsisdnNosDMO);

		return msiMsisdnNosDMO;
	}

	// ==================================================================================================

	public void modify(QueryFilter filter) throws EPPIXBusinessException,
			EPPIXUnexpectedException, EPPIXFatalException {
		logger.debug("modify( filter )");

		//
		// Modify the msiMsisdnNosDMO
		//
		msiMsisdnNosDAC.modify(filter);
	}

	// ==================================================================================================

	public void delete(MsiMsisdnNosDMO msiMsisdnNosDMO)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("delete( msiMsisdnNosDMO )");

		thrower.ifParameterMissing("msiMsisdnNosDMO", msiMsisdnNosDMO);
		

		thrower.ifParameterMissing("msiMsisdnNosDMO.msiMsisdnNo",
				msiMsisdnNosDMO.getMsiMsisdnNo());

		thrower.ifParameterMissing("msiMsisdnNosDMO.msiOrigProvId",
				msiMsisdnNosDMO.getMsiOrigProvId());

		// delete self...
		msiMsisdnNosDAC.delete(msiMsisdnNosDMO);
	}

	// ==================================================================================================

	public void delete(QueryFilter filter) throws EPPIXBusinessException,
			EPPIXUnexpectedException, EPPIXFatalException {
		logger.debug("delete( filter )");

		thrower.ifParameterMissing("filter", filter);

		// delete...
		msiMsisdnNosDAC.delete(filter);
	}

	// ==================================================================================================

	public boolean exists(MsiMsisdnNosDMO msiMsisdnNosDMO)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("exists(msiMsisdnNosDMO)");

		thrower.ifParameterMissing("msiMsisdnNosDMO", msiMsisdnNosDMO);

		thrower.ifParameterMissing("msiMsisdnNosDMO.msiMsisdnNo",
				msiMsisdnNosDMO.getMsiMsisdnNo());

		thrower.ifParameterMissing("msiMsisdnNosDMO.msiOrigProvId",
				msiMsisdnNosDMO.getMsiOrigProvId());

		return msiMsisdnNosDAC.exists(msiMsisdnNosDMO);
	}

	// ==================================================================================================

	public boolean exists(QueryFilter filter) throws EPPIXBusinessException,
			EPPIXUnexpectedException, EPPIXFatalException {
		logger.debug("exists(filter)");

		return msiMsisdnNosDAC.exists(filter);
	}

	// ==================================================================================================

	public DTOList getList(DTOListState state, QueryFilter filter)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("getList( state, filter )");

		return msiMsisdnNosDAC.getList(state, filter);
	}

	// ==================================================================================================

	public DAOIterator iterate(QueryFilter filter)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("iterateWithLock( filter )");

		return msiMsisdnNosDAC.iterate(filter);
	}

	// ==================================================================================================

	public DAOIterator iterateWithLock(QueryFilter filter)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("iterateWithLock( filter )");

		return msiMsisdnNosDAC.iterateWithLock(filter);
	}

	// ==================================================================================================

	public MsiMsisdnNosDMO get(QueryFilter filter)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("get( filter )");

		//
		// Check mandatory parameters.
		//
		thrower.ifParameterMissing("filter", filter);

		//
		// Attempt to get the MsiMsisdnNosDMO
		//
		MsiMsisdnNosDMO msiMsisdnNosDMO = msiMsisdnNosDAC.get(filter);

		return msiMsisdnNosDMO;
	}

	// ==================================================================================================

	public Object max(QueryFilter filter) throws EPPIXBusinessException,
			EPPIXUnexpectedException, EPPIXFatalException {
		logger.debug("max( filter )");

		//
		// Check mandatory parameters.
		//
		thrower.ifParameterMissing("filter", filter);

		return msiMsisdnNosDAC.max(filter);
	}

	// ==================================================================================================

	public Object min(QueryFilter filter) throws EPPIXBusinessException,
			EPPIXUnexpectedException, EPPIXFatalException {
		logger.debug("min( filter )");

		//
		// Check mandatory parameters.
		//
		thrower.ifParameterMissing("filter", filter);

		return msiMsisdnNosDAC.min(filter);
	}

	// ==================================================================================================

	public Integer count(QueryFilter filter) throws EPPIXBusinessException,
			EPPIXUnexpectedException, EPPIXFatalException {
		logger.debug("count( filter )");

		//
		// Check mandatory parameters.
		//
		thrower.ifParameterMissing("filter", filter);

		return Integer.valueOf(msiMsisdnNosDAC.count(filter));
	}
	// ==================================================================================================

}