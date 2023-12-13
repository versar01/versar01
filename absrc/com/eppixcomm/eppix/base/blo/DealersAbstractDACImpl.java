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

import com.eppixcomm.eppix.common.core.UserContext; // always required for this sort of class
import com.eppixcomm.eppix.common.data.DAC; // always required for this sort of class
import com.eppixcomm.eppix.common.data.DAO; // always required for this sort of class
import com.eppixcomm.eppix.common.data.DAOArgs; // always required for this sort of class
import com.eppixcomm.eppix.common.data.DAOIterator;
import com.eppixcomm.eppix.common.data.DAOParamQueryArgs; // always required for this sort of class
import com.eppixcomm.eppix.common.data.DAOThrower; // always required for this sort of class
import com.eppixcomm.eppix.common.data.DMO; // always required for this sort of class
import com.eppixcomm.eppix.common.util.FilterPart;
import com.eppixcomm.eppix.common.util.QueryFilter;
import com.eppixcomm.eppix.common.data.DTOList; // always required for this sort of class
import com.eppixcomm.eppix.common.data.DTOListState; // always required for this sort of class
import com.eppixcomm.eppix.base.error.EPPIXObjectBusyException; // always required for this sort of class
import com.eppixcomm.eppix.base.error.EPPIXObjectExpiredException; // always required for this sort of class
import com.eppixcomm.eppix.base.error.EPPIXObjectNotFoundException; // always required for this sort of class
import com.eppixcomm.eppix.base.error.EPPIXSeriousException; // always required for this sort of class
import com.eppixcomm.eppix.base.error.EPPIXUnexpectedException; // always required for this sort of class
import com.eppixcomm.eppix.common.util.Date; // always required for this sort of class
import com.eppixcomm.eppix.common.util.DateTime; // always required for this sort of class
import com.eppixcomm.eppix.common.util.Time;

import org.apache.log4j.Logger; // always required for this sort of class

import java.math.BigDecimal; // always required for this sort of class

import java.util.Iterator;
import java.util.List;

/**
 * This is the standard implementation of the Data Access Controller for the
 * Dealers Business Object.
 * 
 * @version $Revision: 1.2 $
 * @author $Author$
 * @since $jdk$
 */
public class DealersAbstractDACImpl extends DAC implements DealersAbstractDAC {
	// ~ Static variables/initializers
	// //////////////////////////////////////////

	/** Error handler/logger. */
	static DAOThrower thrower = DAOThrower
			.getDAOThrower(DealersAbstractDACImpl.class);

	// ~ Instance variables
	// /////////////////////////////////////////////////////

	/** DOCUMENT ME! */
	Logger logger = thrower.getLogger();

	// ~ Constructors
	// ///////////////////////////////////////////////////////////

	/**
	 * Creates a new DealersDACImpl object.
	 * 
	 * @param dao
	 *            Data Access Object.
	 * @param defaultLanguageCode
	 *            the working language of the user, dictates which language
	 *            specific descriptions are retrieved.
	 */
	public DealersAbstractDACImpl(UserContext userContext, DAO dao) {
		super(userContext, dao, thrower);
	}

	public DealersAbstractDACImpl(DAO dao) {
		super(dao, thrower);
	}

	// ~ Methods
	// ////////////////////////////////////////////////////////////////

	/**
	 * Retrieves a Dealers Data Model Object
	 * 
	 * @return a populated Dealers Data Model Object or null if not found.
	 * 
	 * @throws EPPIXSeriousException
	 */
	public DealersDMO get(DealersDMO dealersDMO) throws EPPIXSeriousException {
		logger.debug("get( DealersDMO )");

		thrower.ifParameterMissing("DealersDMO", dealersDMO);

		return (DealersDMO) dao.get(dealersDMO);
	}

	/**
	 * Creates the Dealers object in the database.
	 * 
	 * @param DealersDMO
	 *            dealersDMO
	 * 
	 * @throws EPPIXSeriousException
	 */
	public void create(DealersDMO dealersDMO) throws EPPIXSeriousException {
		logger.debug("create( dealersDMO )");
		thrower.ifParameterMissing("DealersDMO", dealersDMO);

		dao.insert(dealersDMO);
	}

	/**
	 * Locks and retrieves the Dealers object from the database.
	 * 
	 * @param aDealers
	 *            Dealers object
	 * 
	 * @return a populated Dealers object or null if not found.
	 * 
	 * @throws EPPIXSeriousException
	 */
	public DealersDMO lock(DealersDMO aDealersDMO)
			throws EPPIXSeriousException, EPPIXObjectBusyException {
		logger.debug("lock( aDealersDMO )");

		thrower.ifParameterMissing("aDealersDMO", aDealersDMO);

		DealersDMO lockedDealersDMO = null;

		//
		// Lock the base table on its primary key.
		//
		lockedDealersDMO = (DealersDMO) dao.lock("Dealers",
				"filterByPrimaryKey", new DAOArgs(1).arg(aDealersDMO
						.getDealerId()));

		return lockedDealersDMO;
	}

	/**
	 * Modifies the Dealers object in the database.
	 * 
	 * @param DealersDMO
	 *            Dealers object
	 * 
	 * @throws EPPIXSeriousException
	 * @throws EPPIXObjectExpiredException
	 * @throws EPPIXObjectNotFoundException
	 */
	public void modify(DealersDMO dealersDMO) throws EPPIXSeriousException,
			EPPIXObjectExpiredException, EPPIXObjectNotFoundException {
		logger.debug("modify( aDealersDMO )");

		thrower.ifParameterMissing("aDealersDMO", dealersDMO);

		thrower.ifParameterMissing("DealersDMO.dealerId", dealersDMO
				.getDealerId());

		dao.update(dealersDMO);
	}

	/**
	 * Modifies the Dealers object using the specified filter in the database.
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

		dao.updateCustom(new DealersDMO(), filterQueryArgs(filter, null));
	}

	/**
	 * Deletes the Dealers object from the database.
	 * 
	 * @param DealersDMO
	 *            Dealers object
	 * 
	 * @throws EPPIXSeriousException
	 * @throws EPPIXObjectNotFoundException
	 * @throws EPPIXObjectExpiredException
	 */
	public void delete(DealersDMO dealersDMO) throws EPPIXSeriousException,
			EPPIXObjectNotFoundException, EPPIXObjectExpiredException {
		logger.debug("delete( DealersDMO )");

		thrower.ifParameterMissing("DealersDMO", dealersDMO);

		thrower.ifParameterMissing("DealersDMO.dealerId", dealersDMO
				.getDealerId());

		dao.delete(dealersDMO);
	}

	/**
	 * Deletes the Dealers object from the database.
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

		dao.delete("Dealers", args.getFilterBy(), args);
	}

	/**
	 * Return true if a Dealers object exists.
	 * 
	 * @param DealersDMO
	 *            DealersDMO
	 * 
	 * @return true if the Dealers object exists.
	 * 
	 * @throws EPPIXSeriousException
	 */
	public boolean exists(DealersDMO DealersDMO) throws EPPIXSeriousException {
		logger.debug("exists( DealersDMO)");

		return dao.exists("Dealers", "filterByPrimaryKey", new DAOArgs(1)
				.arg(DealersDMO.getDealerId()));
	}

	/**
	 * Return true if a Dealers object exists.
	 * 
	 * @param filter
	 * 
	 * @return true if the Dealers object exists.
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
	 *            Dealers Data Model Object
	 * 
	 * @return DTOList of Dealers Data Model Objects.
	 * 
	 * @throws EPPIXSeriousException
	 */
	public DTOList getList(DTOListState state, DealersDMO dealersDMO)
			throws EPPIXSeriousException {
		logger.debug("getList( state, dealersDMO )");

		return dao.getListAbs(state, paramQueryArgs(dealersDMO));
	}

	/**
	 * Constructs parameterised query arguments.
	 * 
	 * @param $
	 *            (dataObjectNameLowerCamel} DealersDMO object.
	 */
	protected DAOParamQueryArgs paramQueryArgs(DealersDMO dealersDMO) {
		logger.debug("paramQueryArgs( dealersDMO)");

		DAOParamQueryArgs queryArgs = new DAOParamQueryArgs("Dealers", 36 * 2);

		if (dealersDMO != null) {
			// primary key filters...
			String dealerId = dealersDMO.getDealerId();

			if (!DMO.isNull(dealerId)) {
				queryArgs.andFilterBy("DealerIdMatch").arg(
						dealerId + dao.wildcardForAnySequence());
			}

			// define more filters...
			String plAccNo = dealersDMO.getPlAccNo();

			if (!DMO.isNull(plAccNo)) {
				queryArgs.andFilterBy("PlAccNoMatch").arg(
						plAccNo + dao.wildcardForAnySequence());
			}

			String commPlan = dealersDMO.getCommPlan();

			if (!DMO.isNull(commPlan)) {
				queryArgs.andFilterBy("CommPlanMatch").arg(
						commPlan + dao.wildcardForAnySequence());
			}

			String dealType = dealersDMO.getDealType();

			if (!DMO.isNull(dealType)) {
				queryArgs.andFilterBy("DealTypeMatch").arg(
						dealType + dao.wildcardForAnySequence());
			}

			String barrIndi = dealersDMO.getBarrIndi();

			if (!DMO.isNull(barrIndi)) {
				queryArgs.andFilterBy("BarrIndiMatch").arg(
						barrIndi + dao.wildcardForAnySequence());
			}

			String dealerNl = dealersDMO.getDealerNl();

			if (!DMO.isNull(dealerNl)) {
				queryArgs.andFilterBy("DealerNlMatch").arg(
						dealerNl + dao.wildcardForAnySequence());
			}

			String eposFlag = dealersDMO.getEposFlag();

			if (!DMO.isNull(eposFlag)) {
				queryArgs.andFilterBy("EposFlagMatch").arg(
						eposFlag + dao.wildcardForAnySequence());
			}

			String region = dealersDMO.getRegion();

			if (!DMO.isNull(region)) {
				queryArgs.andFilterBy("RegionMatch").arg(
						region + dao.wildcardForAnySequence());
			}

			String dealerGroup = dealersDMO.getDealerGroup();

			if (!DMO.isNull(dealerGroup)) {
				queryArgs.andFilterBy("DealerGroupMatch").arg(
						dealerGroup + dao.wildcardForAnySequence());
			}

			String dealerDirect = dealersDMO.getDealerDirect();

			if (!DMO.isNull(dealerDirect)) {
				queryArgs.andFilterBy("DealerDirectMatch").arg(
						dealerDirect + dao.wildcardForAnySequence());
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
	public DTOList getList(DTOListState state, QueryFilter filter)
			throws EPPIXSeriousException {
		logger.debug("getList( state, filter )");

		return dao.getListAbs(state, filterQueryArgs(filter, null));
	}

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
				(dmlName == null) ? "Dealers" : dmlName, parts.size());
		Iterator it = parts.iterator();
		// for ( FilterPart part : parts ) {
		while (it.hasNext()) {
			FilterPart part = (FilterPart) it.next();
			switch (part.getIndex()) {
			case DealersDMO.dealerIdFilter:
				part.andFilterBy(queryArgs, "DealerId", dao
						.wildcardForAnySequence());

				break;

			case DealersDMO.plAccNoFilter:
				part.andFilterBy(queryArgs, "PlAccNo", dao
						.wildcardForAnySequence());

				break;

			case DealersDMO.commPlanFilter:
				part.andFilterBy(queryArgs, "CommPlan", dao
						.wildcardForAnySequence());

				break;

			case DealersDMO.dealTypeFilter:
				part.andFilterBy(queryArgs, "DealType", dao
						.wildcardForAnySequence());

				break;

			case DealersDMO.activMtdFilter:
				part.andFilterBy(queryArgs, "ActivMtd", dao
						.wildcardForAnySequence());

				break;

			case DealersDMO.deactMtdFilter:
				part.andFilterBy(queryArgs, "DeactMtd", dao
						.wildcardForAnySequence());

				break;

			case DealersDMO.revenMtdFilter:
				part.andFilterBy(queryArgs, "RevenMtd", dao
						.wildcardForAnySequence());

				break;

			case DealersDMO.activYtdFilter:
				part.andFilterBy(queryArgs, "ActivYtd", dao
						.wildcardForAnySequence());

				break;

			case DealersDMO.deactYtdFilter:
				part.andFilterBy(queryArgs, "DeactYtd", dao
						.wildcardForAnySequence());

				break;

			case DealersDMO.itemiYtdFilter:
				part.andFilterBy(queryArgs, "ItemiYtd", dao
						.wildcardForAnySequence());

				break;

			case DealersDMO.revenYtdFilter:
				part.andFilterBy(queryArgs, "RevenYtd", dao
						.wildcardForAnySequence());

				break;

			case DealersDMO.commiYtdFilter:
				part.andFilterBy(queryArgs, "CommiYtd", dao
						.wildcardForAnySequence());

				break;

			case DealersDMO.activCumFilter:
				part.andFilterBy(queryArgs, "ActivCum", dao
						.wildcardForAnySequence());

				break;

			case DealersDMO.deactCumFilter:
				part.andFilterBy(queryArgs, "DeactCum", dao
						.wildcardForAnySequence());

				break;

			case DealersDMO.itemiCumFilter:
				part.andFilterBy(queryArgs, "ItemiCum", dao
						.wildcardForAnySequence());

				break;

			case DealersDMO.revenCumFilter:
				part.andFilterBy(queryArgs, "RevenCum", dao
						.wildcardForAnySequence());

				break;

			case DealersDMO.commiCumFilter:
				part.andFilterBy(queryArgs, "CommiCum", dao
						.wildcardForAnySequence());

				break;

			case DealersDMO.lastCommFilter:
				part.andFilterBy(queryArgs, "LastComm", dao
						.wildcardForAnySequence());

				break;

			case DealersDMO.barrIndiFilter:
				part.andFilterBy(queryArgs, "BarrIndi", dao
						.wildcardForAnySequence());

				break;

			case DealersDMO.clawBac1Filter:
				part.andFilterBy(queryArgs, "ClawBac1", dao
						.wildcardForAnySequence());

				break;

			case DealersDMO.clawBac2Filter:
				part.andFilterBy(queryArgs, "ClawBac2", dao
						.wildcardForAnySequence());

				break;

			case DealersDMO.dealerNlFilter:
				part.andFilterBy(queryArgs, "DealerNl", dao
						.wildcardForAnySequence());

				break;

			case DealersDMO.qualPeriodFilter:
				part.andFilterBy(queryArgs, "QualPeriod", dao
						.wildcardForAnySequence());

				break;

			case DealersDMO.qbonusytdFilter:
				part.andFilterBy(queryArgs, "Qbonusytd", dao
						.wildcardForAnySequence());

				break;

			case DealersDMO.dateCreatedFilter:
				part.andFilterBy(queryArgs, "DateCreated", dao
						.wildcardForAnySequence());

				break;

			case DealersDMO.clawInt1Filter:
				part.andFilterBy(queryArgs, "ClawInt1", dao
						.wildcardForAnySequence());

				break;

			case DealersDMO.clawVal1Filter:
				part.andFilterBy(queryArgs, "ClawVal1", dao
						.wildcardForAnySequence());

				break;

			case DealersDMO.clawInt2Filter:
				part.andFilterBy(queryArgs, "ClawInt2", dao
						.wildcardForAnySequence());

				break;

			case DealersDMO.clawVal2Filter:
				part.andFilterBy(queryArgs, "ClawVal2", dao
						.wildcardForAnySequence());

				break;

			case DealersDMO.eposFlagFilter:
				part.andFilterBy(queryArgs, "EposFlag", dao
						.wildcardForAnySequence());

				break;

			case DealersDMO.accMinQtyFilter:
				part.andFilterBy(queryArgs, "AccMinQty", dao
						.wildcardForAnySequence());

				break;

			case DealersDMO.accCurrQtyFilter:
				part.andFilterBy(queryArgs, "AccCurrQty", dao
						.wildcardForAnySequence());

				break;

			case DealersDMO.accShipQtyFilter:
				part.andFilterBy(queryArgs, "AccShipQty", dao
						.wildcardForAnySequence());

				break;

			case DealersDMO.regionFilter:
				part.andFilterBy(queryArgs, "Region", dao
						.wildcardForAnySequence());

				break;

			case DealersDMO.dealerGroupFilter:
				part.andFilterBy(queryArgs, "DealerGroup", dao
						.wildcardForAnySequence());

				break;

			case DealersDMO.dealerDirectFilter:
				part.andFilterBy(queryArgs, "DealerDirect", dao
						.wildcardForAnySequence());

				break;
			}
		}

		return queryArgs;
	}

	/**
	 * Provides a DAOIterator to iterate over the list of Dealers records based
	 * on the passed in Filter.
	 * 
	 * @param filter
	 * @return
	 * @throws EPPIXSeriousException
	 */
	public DAOIterator iterate(QueryFilter filter) throws EPPIXSeriousException {
		logger.debug("iterate( filter )");

		return (DAOIterator) dao.iterator(filterQueryArgs(filter, null));
	}

	/**
	 * Provides a DAOIterator to iterate using a "FOR UPDATE", over the list of
	 * Dealers records based on the passed in Filter.
	 * 
	 * @param filter
	 * @return
	 * @throws EPPIXSeriousException
	 */
	public DAOIterator iterateWithLock(QueryFilter filter)
			throws EPPIXSeriousException {
		logger.debug("iterateWithLock( filter )");

		return dao.iterator(filterQueryArgs(filter, null), true);
	}

	/**
	 * Retrieves the Dealers Data Model Object from a possible list.
	 * 
	 * @param filter
	 * @return
	 * @throws EPPIXSeriousException
	 */
	public DealersDMO get(QueryFilter filter) throws EPPIXSeriousException {
		logger.debug("get( filter )");

		DAOParamQueryArgs args = filterQueryArgs(filter, null);

		return (DealersDMO) dao
				.get(args.getDMLName(), args.getFilterBy(), args);
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
