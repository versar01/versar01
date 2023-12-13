/*============================================================================================= *
 *
 * (c) 2007 Copyright Eppixcomm.
 * All Rights Reserved
 * Legal Information goes here.
 *
 *============================================================================================= */

/**----------------------------------------------------------------------------------------------
 *
 * Version control details:
 *    @version $Revision: $
 *    @author  $Author: $
 *----------------------------------------------------------------------------------------------*/
package com.eppixcomm.eppix.base.blo;

import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;

import com.eppixcomm.eppix.common.core.UserContext;
import com.eppixcomm.eppix.common.data.DAC;
import com.eppixcomm.eppix.common.data.DAO;
import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DAOIterator;
import com.eppixcomm.eppix.common.data.DAOParamQueryArgs;
import com.eppixcomm.eppix.common.data.DAOThrower;
import com.eppixcomm.eppix.common.data.DMO;
import com.eppixcomm.eppix.common.util.FilterPart;
import com.eppixcomm.eppix.common.util.QueryFilter;
import com.eppixcomm.eppix.base.error.EPPIXObjectBusyException;
import com.eppixcomm.eppix.base.error.EPPIXObjectExpiredException;
import com.eppixcomm.eppix.base.error.EPPIXObjectNotFoundException;
import com.eppixcomm.eppix.base.error.EPPIXSeriousException;

/**
 * This is the standard implementation of the Data Access Controller for the
 * TpTariffPlan Business Object.
 * 
 * @version $Revision: 1.2 $
 * @author $Author$
 * @since $jdk$
 */
public class TpTariffPlanAbstractDACImpl extends DAC implements
		TpTariffPlanAbstractDAC {
	// ~ Static variables/initializers
	// //////////////////////////////////////////

	/** Error handler/logger. */
	static DAOThrower thrower = DAOThrower
			.getDAOThrower(TpTariffPlanAbstractDACImpl.class);

	// ~ Instance variables
	// /////////////////////////////////////////////////////

	/** DOCUMENT ME! */
	Logger logger = thrower.getLogger();

	// ~ Constructors
	// ///////////////////////////////////////////////////////////

	/**
	 * Creates a new TpTariffPlanDACImpl object.
	 * 
	 * @param dao
	 *            Data Access Object.
	 * @param defaultLanguageCode
	 *            the working language of the user, dictates which language
	 *            specific descriptions are retrieved.
	 */
	public TpTariffPlanAbstractDACImpl(UserContext userContext, DAO dao) {
		super(dao, thrower);
	}

	// ~ Methods
	// ////////////////////////////////////////////////////////////////

	public TpTariffPlanAbstractDACImpl(DAO dao) {
		super(dao, thrower);
	}

	/**
	 * Retrieves a TpTariffPlan Data Model Object
	 * 
	 * @return a populated TpTariffPlan Data Model Object or null if not found.
	 * 
	 * @throws EPPIXSeriousException
	 */
	public TpTariffPlanDMO get(TpTariffPlanDMO tpTariffPlanDMO)
			throws EPPIXSeriousException {
		logger.debug("get( TpTariffPlanDMO )");

		thrower.ifParameterMissing("TpTariffPlanDMO", tpTariffPlanDMO);

		return (TpTariffPlanDMO) dao.get(tpTariffPlanDMO);
	}

	/**
	 * Creates the TpTariffPlan object in the database.
	 * 
	 * @param TpTariffPlanDMO
	 *            tpTariffPlanDMO
	 * 
	 * @throws EPPIXSeriousException
	 */
	public void create(TpTariffPlanDMO tpTariffPlanDMO)
			throws EPPIXSeriousException {
		logger.debug("create( tpTariffPlanDMO )");
		thrower.ifParameterMissing("TpTariffPlanDMO", tpTariffPlanDMO);

		dao.insert(tpTariffPlanDMO);
	}

	/**
	 * Locks and retrieves the TpTariffPlan object from the database.
	 * 
	 * @param aTpTariffPlan
	 *            TpTariffPlan object
	 * 
	 * @return a populated TpTariffPlan object or null if not found.
	 * 
	 * @throws EPPIXSeriousException
	 */
	public TpTariffPlanDMO lock(TpTariffPlanDMO aTpTariffPlanDMO)
			throws EPPIXSeriousException, EPPIXObjectBusyException {
		logger.debug("lock( aTpTariffPlanDMO )");

		thrower.ifParameterMissing("aTpTariffPlanDMO", aTpTariffPlanDMO);

		TpTariffPlanDMO lockedTpTariffPlanDMO = null;

		//
		// Lock the base table on its primary key.
		//
		lockedTpTariffPlanDMO = (TpTariffPlanDMO) dao.lock("TpTariffPlan",
				"filterByPrimaryKey", new DAOArgs(1).arg(aTpTariffPlanDMO
						.getTpTarplanRef()));

		return lockedTpTariffPlanDMO;
	}

	/**
	 * Modifies the TpTariffPlan object in the database.
	 * 
	 * @param TpTariffPlanDMO
	 *            TpTariffPlan object
	 * 
	 * @throws EPPIXSeriousException
	 * @throws EPPIXObjectExpiredException
	 * @throws EPPIXObjectNotFoundException
	 */
	public void modify(TpTariffPlanDMO tpTariffPlanDMO)
			throws EPPIXSeriousException, EPPIXObjectExpiredException,
			EPPIXObjectNotFoundException {
		logger.debug("modify( aTpTariffPlanDMO )");

		thrower.ifParameterMissing("aTpTariffPlanDMO", tpTariffPlanDMO);

		thrower.ifParameterMissing("TpTariffPlanDMO.tpTarplanRef",
				tpTariffPlanDMO.getTpTarplanRef());

		dao.update(tpTariffPlanDMO);
	}

	/**
	 * Modifies the TpTariffPlan object using the specified filter in the
	 * database.
	 * 
	 * @param filter
	 *            object
	 * 
	 * @throws EPPIXSeriousException
	 * @throws EPPIXObjectExpiredException
	 * @throws EPPIXObjectNotFoundException
	 */
	public void modify(QueryFilter filter) throws EPPIXSeriousException,
			EPPIXObjectExpiredException, EPPIXObjectNotFoundException {
		logger.debug("modify( filter )");

		thrower.ifParameterMissing("filter", filter);

		dao.updateCustom(new TpTariffPlanDMO(), filterQueryArgs(filter, null));
	}

	/**
	 * Deletes the TpTariffPlan object from the database.
	 * 
	 * @param TpTariffPlanDMO
	 *            TpTariffPlan object
	 * 
	 * @throws EPPIXSeriousException
	 * @throws EPPIXObjectNotFoundException
	 * @throws EPPIXObjectExpiredException
	 */
	public void delete(TpTariffPlanDMO tpTariffPlanDMO)
			throws EPPIXSeriousException, EPPIXObjectNotFoundException,
			EPPIXObjectExpiredException {
		logger.debug("delete( TpTariffPlanDMO )");

		thrower.ifParameterMissing("TpTariffPlanDMO", tpTariffPlanDMO);

		thrower.ifParameterMissing("TpTariffPlanDMO.tpTarplanRef",
				tpTariffPlanDMO.getTpTarplanRef());

		dao.delete(tpTariffPlanDMO);
	}

	/**
	 * Deletes the TpTariffPlan object from the database.
	 * 
	 * @param QueryFilterfilter
	 *            object
	 * 
	 * @throws EPPIXSeriousException
	 * @throws EPPIXObjectNotFoundException
	 * @throws EPPIXObjectExpiredException
	 */
	public void delete(QueryFilter filter) throws EPPIXSeriousException,
			EPPIXObjectNotFoundException, EPPIXObjectExpiredException {
		logger.debug("delete( filter )");

		thrower.ifParameterMissing("filter", filter);

		DAOParamQueryArgs args = filterQueryArgs(filter, null);

		dao.delete("TpTariffPlan", args.getFilterBy(), args);
	}

	/**
	 * Return true if a TpTariffPlan object exists.
	 * 
	 * @param TpTariffPlanDMO
	 *            TpTariffPlanDMO
	 * 
	 * @return true if the TpTariffPlan object exists.
	 * 
	 * @throws EPPIXSeriousException
	 */
	public boolean exists(TpTariffPlanDMO TpTariffPlanDMO)
			throws EPPIXSeriousException {
		logger.debug("exists( TpTariffPlanDMO)");

		return dao.exists("TpTariffPlan", "filterByPrimaryKey", new DAOArgs(1)
				.arg(TpTariffPlanDMO.getTpTarplanRef()));
	}

	/**
	 * Return true if a TpTariffPlan object exists.
	 * 
	 * @param filter
	 * 
	 * @return true if the TpTariffPlan object exists.
	 * 
	 * @throws EPPIXSeriousException
	 */
	public boolean exists(QueryFilter filter) throws EPPIXSeriousException {
		logger.debug("exists( filter )");

		return dao.exists(filterQueryArgs(filter, null));
	}

	/**
	 * Return a list of location objects matching the passed in values. A
	 * partial match is performed on the description argument. If no language
	 * Code is passed inside the locationDMO then the language passed in the
	 * EppixLocale object is used.
	 * 
	 * @param state
	 *            previous state of the list.
	 * @param locationDMO
	 *            TpTariffPlan Data Model Object
	 * 
	 * @return DTOList of TpTariffPlan Data Model Objects.
	 * 
	 * @throws EPPIXSeriousException
	 */
	// public DTOList getList(
	// DTOListState state,
	// TpTariffPlanDMO tpTariffPlanDMO )
	// throws EPPIXSeriousException {
	// logger.debug( "getList( state, tpTariffPlanDMO )" );
	//
	// return dao.getListAbs( state, paramQueryArgs( tpTariffPlanDMO ) );
	// }
	/**
	 * Constructs parameterised query arguments.
	 * 
	 * @param $(dataObjectNameLowerCamel}
	 *            TpTariffPlanDMO object.
	 */
	protected DAOParamQueryArgs paramQueryArgs(TpTariffPlanDMO tpTariffPlanDMO) {
		logger.debug("paramQueryArgs( tpTariffPlanDMO)");

		DAOParamQueryArgs queryArgs = new DAOParamQueryArgs("TpTariffPlan",
				12 * 2);

		if (tpTariffPlanDMO != null) {
			// primary key filters...
			String tpTarplanRef = tpTariffPlanDMO.getTpTarplanRef();

			if (!DMO.isNull(tpTarplanRef)) {
				queryArgs.andFilterBy("TpTarplanRefMatch").arg(
						tpTarplanRef + dao.wildcardForAnySequence());
			}

			// define more filters...
			String tpTarplanText = tpTariffPlanDMO.getTpTarplanText();

			if (!DMO.isNull(tpTarplanText)) {
				queryArgs.andFilterBy("TpTarplanTextMatch").arg(
						tpTarplanText + dao.wildcardForAnySequence());
			}

			String tpCurrncyRef = tpTariffPlanDMO.getTpCurrncyRef();

			if (!DMO.isNull(tpCurrncyRef)) {
				queryArgs.andFilterBy("TpCurrncyRefMatch").arg(
						tpCurrncyRef + dao.wildcardForAnySequence());
			}

			String tpSuspendInd = tpTariffPlanDMO.getTpSuspendInd();

			if (!DMO.isNull(tpSuspendInd)) {
				queryArgs.andFilterBy("TpSuspendIndMatch").arg(
						tpSuspendInd + dao.wildcardForAnySequence());
			}

			String tpIncomming = tpTariffPlanDMO.getTpIncomming();

			if (!DMO.isNull(tpIncomming)) {
				queryArgs.andFilterBy("TpIncommingMatch").arg(
						tpIncomming + dao.wildcardForAnySequence());
			}

			String tpInternational = tpTariffPlanDMO.getTpInternational();

			if (!DMO.isNull(tpInternational)) {
				queryArgs.andFilterBy("TpInternationalMatch").arg(
						tpInternational + dao.wildcardForAnySequence());
			}

			String tpLocal = tpTariffPlanDMO.getTpLocal();

			if (!DMO.isNull(tpLocal)) {
				queryArgs.andFilterBy("TpLocalMatch").arg(
						tpLocal + dao.wildcardForAnySequence());
			}

			String tpOffPeak = tpTariffPlanDMO.getTpOffPeak();

			if (!DMO.isNull(tpOffPeak)) {
				queryArgs.andFilterBy("TpOffPeakMatch").arg(
						tpOffPeak + dao.wildcardForAnySequence());
			}

			String tpHighSpend = tpTariffPlanDMO.getTpHighSpend();

			if (!DMO.isNull(tpHighSpend)) {
				queryArgs.andFilterBy("TpHighSpendMatch").arg(
						tpHighSpend + dao.wildcardForAnySequence());
			}
		} else {
			// include all default languageCode filters where appropriate...
		}

		return queryArgs;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @param state
	 *            DOCUMENT ME!
	 * @param filter
	 *            DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 * 
	 * @throws EPPIXSeriousException
	 *             DOCUMENT ME!
	 */
	// public DTOList getList(
	// DTOListState state,
	// QueryFilter filter )
	// throws EPPIXSeriousException {
	// logger.debug( "getList( state, filter )" );
	//
	// return dao.getListAbs( state, filterQueryArgs( filter, null ) );
	// }
	/**
	 * DOCUMENT ME!
	 * 
	 * @param filter
	 *            DOCUMENT ME!
	 * @param dmlName
	 *            DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	protected DAOParamQueryArgs filterQueryArgs(QueryFilter filter,
			String dmlName) {
		List parts = filter.getParts();
		DAOParamQueryArgs queryArgs = new DAOParamQueryArgs(
				(dmlName == null) ? "TpTariffPlan" : dmlName, parts.size());

		for (Iterator i = parts.iterator(); i.hasNext();) {
			FilterPart part = (FilterPart) i.next();

			switch (part.getIndex()) {
			case TpTariffPlanDMO.tpTarplanRefFilter:
				part.andFilterBy(queryArgs, "TpTarplanRef", dao
						.wildcardForAnySequence());

				break;

			case TpTariffPlanDMO.tpTarplanTextFilter:
				part.andFilterBy(queryArgs, "TpTarplanText", dao
						.wildcardForAnySequence());

				break;

			case TpTariffPlanDMO.tpCurrncyRefFilter:
				part.andFilterBy(queryArgs, "TpCurrncyRef", dao
						.wildcardForAnySequence());

				break;

			case TpTariffPlanDMO.tpSuspendIndFilter:
				part.andFilterBy(queryArgs, "TpSuspendInd", dao
						.wildcardForAnySequence());

				break;

			case TpTariffPlanDMO.tpIncommingFilter:
				part.andFilterBy(queryArgs, "TpIncomming", dao
						.wildcardForAnySequence());

				break;

			case TpTariffPlanDMO.tpInternationalFilter:
				part.andFilterBy(queryArgs, "TpInternational", dao
						.wildcardForAnySequence());

				break;

			case TpTariffPlanDMO.tpLocalFilter:
				part.andFilterBy(queryArgs, "TpLocal", dao
						.wildcardForAnySequence());

				break;

			case TpTariffPlanDMO.tpOffPeakFilter:
				part.andFilterBy(queryArgs, "TpOffPeak", dao
						.wildcardForAnySequence());

				break;

			case TpTariffPlanDMO.tpHighSpendFilter:
				part.andFilterBy(queryArgs, "TpHighSpend", dao
						.wildcardForAnySequence());

				break;

			case TpTariffPlanDMO.tpTimestampFilter:
				part.andFilterBy(queryArgs, "TpTimestamp", dao
						.wildcardForAnySequence());

				break;
			}
		}

		return queryArgs;
	}

	/**
	 * Provides a DAOIterator to iterate over the list of TpTariffPlan records
	 * based on the passed in Filter.
	 * 
	 * @param filter
	 * @return
	 * @throws EPPIXSeriousException
	 */
	public DAOIterator iterate(QueryFilter filter) throws EPPIXSeriousException {
		logger.debug("iterate( filter )");

		return dao.iterator(filterQueryArgs(filter, null));
	}

	/**
	 * Provides a DAOIterator to iterate using a "FOR UPDATE", over the list of
	 * TpTariffPlan records based on the passed in Filter.
	 * 
	 * @param filter
	 * @return
	 * @throws EPPIXSeriousException
	 */
	public DAOIterator iterateWithLock(QueryFilter filter)
			throws EPPIXSeriousException {
		logger.debug("iterateWithLock( filter )");

		return dao.iterator(filterQueryArgs(filter, null));
	}

	/**
	 * Retrieves the TpTariffPlan Data Model Object from a possible list.
	 * 
	 * @param filter
	 * @return
	 * @throws EPPIXSeriousException
	 */
	public TpTariffPlanDMO get(QueryFilter filter) throws EPPIXSeriousException {
		logger.debug("get( filter )");

		DAOParamQueryArgs args = filterQueryArgs(filter, null);

		return (TpTariffPlanDMO) dao.get(args.getDMLName(), args.getFilterBy(),
				args);
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @param filter
	 *            DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 * 
	 * @throws EPPIXSeriousException
	 *             DOCUMENT ME!
	 */
	public Object max(QueryFilter filter) throws EPPIXSeriousException {
		logger.debug("max( filter )");

		DAOParamQueryArgs args = filterQueryArgs(filter, null);

		return dao.max(args.getDMLName(), args.getFilterBy(), args, args
				.getMaxField());
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @param filter
	 *            DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 * 
	 * @throws EPPIXSeriousException
	 *             DOCUMENT ME!
	 */
	public Object min(QueryFilter filter) throws EPPIXSeriousException {
		logger.debug("min( filter )");

		DAOParamQueryArgs args = filterQueryArgs(filter, null);

		return dao.min(args.getDMLName(), args.getFilterBy(), args, args
				.getMaxField());
	}

	/**
	 * Counts (COUNT(*)) the number of rows for the specified filter.
	 * 
	 * @param filter
	 * @return the count of rows.
	 * 
	 * @throws EPPIXSeriousException
	 */
	public int count(QueryFilter filter) throws EPPIXSeriousException {
		logger.debug("count( filter )");

		DAOParamQueryArgs args = filterQueryArgs(filter, null);

		return dao.count(args.getDMLName(), args.getFilterBy(), args);
	}
}
