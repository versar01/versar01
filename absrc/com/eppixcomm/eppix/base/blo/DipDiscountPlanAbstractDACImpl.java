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
 * DipDiscountPlan Business Object.
 * 
 * @version $Revision: 1.2 $
 * @author $Author$
 * @since $jdk$
 */
public class DipDiscountPlanAbstractDACImpl extends DAC implements
		DipDiscountPlanAbstractDAC {
	// ~ Static variables/initializers
	// //////////////////////////////////////////

	/** Error handler/logger. */
	static DAOThrower thrower = DAOThrower
			.getDAOThrower(DipDiscountPlanAbstractDACImpl.class);

	// ~ Instance variables
	// /////////////////////////////////////////////////////

	/** DOCUMENT ME! */
	Logger logger = thrower.getLogger();

	// ~ Constructors
	// ///////////////////////////////////////////////////////////

	/**
	 * Creates a new DipDiscountPlanDACImpl object.
	 * 
	 * @param dao
	 *            Data Access Object.
	 * @param defaultLanguageCode
	 *            the working language of the user, dictates which language
	 *            specific descriptions are retrieved.
	 */
	public DipDiscountPlanAbstractDACImpl(UserContext userContext, DAO dao) {
		super(userContext, dao, thrower);
	}

	public DipDiscountPlanAbstractDACImpl(DAO dao) {
		super(dao, thrower);
	}

	// ~ Methods
	// ////////////////////////////////////////////////////////////////

	/**
	 * Retrieves a DipDiscountPlan Data Model Object
	 * 
	 * @return a populated DipDiscountPlan Data Model Object or null if not
	 *         found.
	 * 
	 * @throws EPPIXSeriousException
	 */
	public DipDiscountPlanDMO get(DipDiscountPlanDMO dipDiscountPlanDMO)
			throws EPPIXSeriousException {
		logger.debug("get( DipDiscountPlanDMO )");

		thrower.ifParameterMissing("DipDiscountPlanDMO", dipDiscountPlanDMO);

		return (DipDiscountPlanDMO) dao.get(dipDiscountPlanDMO);
	}

	/**
	 * Creates the DipDiscountPlan object in the database.
	 * 
	 * @param DipDiscountPlanDMO
	 *            dipDiscountPlanDMO
	 * 
	 * @throws EPPIXSeriousException
	 */
	public void create(DipDiscountPlanDMO dipDiscountPlanDMO)
			throws EPPIXSeriousException {
		logger.debug("create( dipDiscountPlanDMO )");
		thrower.ifParameterMissing("DipDiscountPlanDMO", dipDiscountPlanDMO);

		dao.insert(dipDiscountPlanDMO);
	}

	/**
	 * Locks and retrieves the DipDiscountPlan object from the database.
	 * 
	 * @param aDipDiscountPlan
	 *            DipDiscountPlan object
	 * 
	 * @return a populated DipDiscountPlan object or null if not found.
	 * 
	 * @throws EPPIXSeriousException
	 */
	public DipDiscountPlanDMO lock(DipDiscountPlanDMO aDipDiscountPlanDMO)
			throws EPPIXSeriousException, EPPIXObjectBusyException {
		logger.debug("lock( aDipDiscountPlanDMO )");

		thrower.ifParameterMissing("aDipDiscountPlanDMO", aDipDiscountPlanDMO);

		DipDiscountPlanDMO lockedDipDiscountPlanDMO = null;

		//
		// Lock the base table on its primary key.
		//
		lockedDipDiscountPlanDMO = (DipDiscountPlanDMO) dao.lock(
				"DipDiscountPlan", "filterByPrimaryKey", new DAOArgs(2).arg(
						aDipDiscountPlanDMO.getDipDiscountId()).arg(
						aDipDiscountPlanDMO.getDipSequence()));

		return lockedDipDiscountPlanDMO;
	}

	/**
	 * Modifies the DipDiscountPlan object in the database.
	 * 
	 * @param DipDiscountPlanDMO
	 *            DipDiscountPlan object
	 * 
	 * @throws EPPIXSeriousException
	 * @throws EPPIXObjectExpiredException
	 * @throws EPPIXObjectNotFoundException
	 */
	public void modify(DipDiscountPlanDMO dipDiscountPlanDMO)
			throws EPPIXSeriousException, EPPIXObjectExpiredException,
			EPPIXObjectNotFoundException {
		logger.debug("modify( aDipDiscountPlanDMO )");

		thrower.ifParameterMissing("aDipDiscountPlanDMO", dipDiscountPlanDMO);

		thrower.ifParameterMissing("DipDiscountPlanDMO.dipDiscountId",
				dipDiscountPlanDMO.getDipDiscountId());

		thrower.ifParameterMissing("DipDiscountPlanDMO.dipSequence",
				dipDiscountPlanDMO.getDipSequence());

		dao.update(dipDiscountPlanDMO);
	}

	/**
	 * Modifies the DipDiscountPlan object using the specified filter in the
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

		dao.updateCustom(new DipDiscountPlanDMO(),
				filterQueryArgs(filter, null));
	}

	/**
	 * Deletes the DipDiscountPlan object from the database.
	 * 
	 * @param DipDiscountPlanDMO
	 *            DipDiscountPlan object
	 * 
	 * @throws EPPIXSeriousException
	 * @throws EPPIXObjectNotFoundException
	 * @throws EPPIXObjectExpiredException
	 */
	public void delete(DipDiscountPlanDMO dipDiscountPlanDMO)
			throws EPPIXSeriousException, EPPIXObjectNotFoundException,
			EPPIXObjectExpiredException {
		logger.debug("delete( DipDiscountPlanDMO )");

		thrower.ifParameterMissing("DipDiscountPlanDMO", dipDiscountPlanDMO);

		thrower.ifParameterMissing("DipDiscountPlanDMO.dipDiscountId",
				dipDiscountPlanDMO.getDipDiscountId());

		thrower.ifParameterMissing("DipDiscountPlanDMO.dipSequence",
				dipDiscountPlanDMO.getDipSequence());

		dao.delete(dipDiscountPlanDMO);
	}

	/**
	 * Deletes the DipDiscountPlan object from the database.
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

		dao.delete("DipDiscountPlan", args.getFilterBy(), args);
	}

	/**
	 * Return true if a DipDiscountPlan object exists.
	 * 
	 * @param DipDiscountPlanDMO
	 *            DipDiscountPlanDMO
	 * 
	 * @return true if the DipDiscountPlan object exists.
	 * 
	 * @throws EPPIXSeriousException
	 */
	public boolean exists(DipDiscountPlanDMO DipDiscountPlanDMO)
			throws EPPIXSeriousException {
		logger.debug("exists( DipDiscountPlanDMO)");

		return dao.exists("DipDiscountPlan", "filterByPrimaryKey", new DAOArgs(
				2).arg(DipDiscountPlanDMO.getDipDiscountId()).arg(
				DipDiscountPlanDMO.getDipSequence()));
	}

	/**
	 * Return true if a DipDiscountPlan object exists.
	 * 
	 * @param filter
	 * 
	 * @return true if the DipDiscountPlan object exists.
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
	 *            DipDiscountPlan Data Model Object
	 * 
	 * @return DTOList of DipDiscountPlan Data Model Objects.
	 * 
	 * @throws EPPIXSeriousException
	 */
	public DTOList getList(DTOListState state,
			DipDiscountPlanDMO dipDiscountPlanDMO) throws EPPIXSeriousException {
		logger.debug("getList( state, dipDiscountPlanDMO )");

		return dao.getListAbs(state, paramQueryArgs(dipDiscountPlanDMO));
	}

	/**
	 * Constructs parameterised query arguments.
	 * 
	 * @param $
	 *            (dataObjectNameLowerCamel} DipDiscountPlanDMO object.
	 */
	protected DAOParamQueryArgs paramQueryArgs(
			DipDiscountPlanDMO dipDiscountPlanDMO) {
		logger.debug("paramQueryArgs( dipDiscountPlanDMO)");

		DAOParamQueryArgs queryArgs = new DAOParamQueryArgs("DipDiscountPlan",
				3 * 2);

		if (dipDiscountPlanDMO != null) {
			// primary key filters...
			Integer dipDiscountId = dipDiscountPlanDMO.getDipDiscountId();

			if (!DMO.isNull(dipDiscountId)) {
				queryArgs.andFilterBy("DipDiscountId").arg(dipDiscountId);
			}

			Short dipSequence = dipDiscountPlanDMO.getDipSequence();

			if (!DMO.isNull(dipSequence)) {
				queryArgs.andFilterBy("DipSequence").arg(dipSequence);
			}

			// define more filters...
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
				(dmlName == null) ? "DipDiscountPlan" : dmlName, parts.size());

		Iterator it = parts.iterator();

		// for ( FilterPart part : parts ) {
		while (it.hasNext()) {
			FilterPart part = (FilterPart) it.next();

			switch (part.getIndex()) {
			case DipDiscountPlanDMO.dipDiscountIdFilter:
				part.andFilterBy(queryArgs, "DipDiscountId", dao
						.wildcardForAnySequence());

				break;

			case DipDiscountPlanDMO.dipSequenceFilter:
				part.andFilterBy(queryArgs, "DipSequence", dao
						.wildcardForAnySequence());

				break;

			case DipDiscountPlanDMO.dipRuleRefFilter:
				part.andFilterBy(queryArgs, "DipRuleRef", dao
						.wildcardForAnySequence());

				break;
			}
		}

		return queryArgs;
	}

	/**
	 * Provides a DAOIterator to iterate over the list of DipDiscountPlan
	 * records based on the passed in Filter.
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
	 * DipDiscountPlan records based on the passed in Filter.
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
	 * Retrieves the DipDiscountPlan Data Model Object from a possible list.
	 * 
	 * @param filter
	 * @return
	 * @throws EPPIXSeriousException
	 */
	public DipDiscountPlanDMO get(QueryFilter filter)
			throws EPPIXSeriousException {
		logger.debug("get( filter )");

		DAOParamQueryArgs args = filterQueryArgs(filter, null);

		return (DipDiscountPlanDMO) dao.get(args.getDMLName(), args
				.getFilterBy(), args);
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
