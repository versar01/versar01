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
 * DirDiscountRule Business Object.
 * 
 * @version $Revision: 1.2 $
 * @author $Author$
 * @since $jdk$
 */
public class DirDiscountRuleAbstractDACImpl extends DAC implements
		DirDiscountRuleAbstractDAC {
	// ~ Static variables/initializers
	// //////////////////////////////////////////

	/** Error handler/logger. */
	static DAOThrower thrower = DAOThrower
			.getDAOThrower(DirDiscountRuleAbstractDACImpl.class);

	// ~ Instance variables
	// /////////////////////////////////////////////////////

	/** DOCUMENT ME! */
	Logger logger = thrower.getLogger();

	// ~ Constructors
	// ///////////////////////////////////////////////////////////

	/**
	 * Creates a new DirDiscountRuleDACImpl object.
	 * 
	 * @param dao
	 *            Data Access Object.
	 * @param defaultLanguageCode
	 *            the working language of the user, dictates which language
	 *            specific descriptions are retrieved.
	 */
	public DirDiscountRuleAbstractDACImpl(UserContext userContext, DAO dao) {
		super(userContext, dao, thrower);
	}

	public DirDiscountRuleAbstractDACImpl(DAO dao) {
		super(dao, thrower);
	}

	// ~ Methods
	// ////////////////////////////////////////////////////////////////

	/**
	 * Retrieves a DirDiscountRule Data Model Object
	 * 
	 * @return a populated DirDiscountRule Data Model Object or null if not
	 *         found.
	 * 
	 * @throws EPPIXSeriousException
	 */
	public DirDiscountRuleDMO get(DirDiscountRuleDMO dirDiscountRuleDMO)
			throws EPPIXSeriousException {
		logger.debug("get( DirDiscountRuleDMO )");

		thrower.ifParameterMissing("DirDiscountRuleDMO", dirDiscountRuleDMO);

		return (DirDiscountRuleDMO) dao.get(dirDiscountRuleDMO);
	}

	/**
	 * Creates the DirDiscountRule object in the database.
	 * 
	 * @param DirDiscountRuleDMO
	 *            dirDiscountRuleDMO
	 * 
	 * @throws EPPIXSeriousException
	 */
	public DirDiscountRuleDMO create(DirDiscountRuleDMO dirDiscountRuleDMO)
			throws EPPIXSeriousException {
		logger.debug("create( dirDiscountRuleDMO )");
		thrower.ifParameterMissing("DirDiscountRuleDMO", dirDiscountRuleDMO);

		dao.insert(dirDiscountRuleDMO);

		// return the data with key
		return dirDiscountRuleDMO;
	}

	/**
	 * Locks and retrieves the DirDiscountRule object from the database.
	 * 
	 * @param aDirDiscountRule
	 *            DirDiscountRule object
	 * 
	 * @return a populated DirDiscountRule object or null if not found.
	 * 
	 * @throws EPPIXSeriousException
	 */
	public DirDiscountRuleDMO lock(DirDiscountRuleDMO aDirDiscountRuleDMO)
			throws EPPIXSeriousException, EPPIXObjectBusyException {
		logger.debug("lock( aDirDiscountRuleDMO )");

		thrower.ifParameterMissing("aDirDiscountRuleDMO", aDirDiscountRuleDMO);

		DirDiscountRuleDMO lockedDirDiscountRuleDMO = null;

		//
		// Lock the base table on its primary key.
		//
		lockedDirDiscountRuleDMO = (DirDiscountRuleDMO) dao.lock(
				"DirDiscountRule", "filterByPrimaryKey", new DAOArgs(1)
						.arg(aDirDiscountRuleDMO.getDirRuleId()));

		return lockedDirDiscountRuleDMO;
	}

	/**
	 * Modifies the DirDiscountRule object in the database.
	 * 
	 * @param DirDiscountRuleDMO
	 *            DirDiscountRule object
	 * 
	 * @throws EPPIXSeriousException
	 * @throws EPPIXObjectExpiredException
	 * @throws EPPIXObjectNotFoundException
	 */
	public void modify(DirDiscountRuleDMO dirDiscountRuleDMO)
			throws EPPIXSeriousException, EPPIXObjectExpiredException,
			EPPIXObjectNotFoundException {
		logger.debug("modify( aDirDiscountRuleDMO )");

		thrower.ifParameterMissing("aDirDiscountRuleDMO", dirDiscountRuleDMO);

		thrower.ifParameterMissing("DirDiscountRuleDMO.dirRuleId",
				dirDiscountRuleDMO.getDirRuleId());

		dao.update(dirDiscountRuleDMO);
	}

	/**
	 * Modifies the DirDiscountRule object using the specified filter in the
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

		dao.updateCustom(new DirDiscountRuleDMO(),
				filterQueryArgs(filter, null));
	}

	/**
	 * Deletes the DirDiscountRule object from the database.
	 * 
	 * @param DirDiscountRuleDMO
	 *            DirDiscountRule object
	 * 
	 * @throws EPPIXSeriousException
	 * @throws EPPIXObjectNotFoundException
	 * @throws EPPIXObjectExpiredException
	 */
	public void delete(DirDiscountRuleDMO dirDiscountRuleDMO)
			throws EPPIXSeriousException, EPPIXObjectNotFoundException,
			EPPIXObjectExpiredException {
		logger.debug("delete( DirDiscountRuleDMO )");

		thrower.ifParameterMissing("DirDiscountRuleDMO", dirDiscountRuleDMO);

		thrower.ifParameterMissing("DirDiscountRuleDMO.dirRuleId",
				dirDiscountRuleDMO.getDirRuleId());

		dao.delete(dirDiscountRuleDMO);
	}

	/**
	 * Deletes the DirDiscountRule object from the database.
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

		dao.delete("DirDiscountRule", args.getFilterBy(), args);
	}

	/**
	 * Return true if a DirDiscountRule object exists.
	 * 
	 * @param DirDiscountRuleDMO
	 *            DirDiscountRuleDMO
	 * 
	 * @return true if the DirDiscountRule object exists.
	 * 
	 * @throws EPPIXSeriousException
	 */
	public boolean exists(DirDiscountRuleDMO DirDiscountRuleDMO)
			throws EPPIXSeriousException {
		logger.debug("exists( DirDiscountRuleDMO)");

		return dao.exists("DirDiscountRule", "filterByPrimaryKey", new DAOArgs(
				1).arg(DirDiscountRuleDMO.getDirRuleId()));
	}

	/**
	 * Return true if a DirDiscountRule object exists.
	 * 
	 * @param filter
	 * 
	 * @return true if the DirDiscountRule object exists.
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
	 *            DirDiscountRule Data Model Object
	 * 
	 * @return DTOList of DirDiscountRule Data Model Objects.
	 * 
	 * @throws EPPIXSeriousException
	 */
	public DTOList getList(DTOListState state,
			DirDiscountRuleDMO dirDiscountRuleDMO) throws EPPIXSeriousException {
		logger.debug("getList( state, dirDiscountRuleDMO )");

		return dao.getListAbs(state, paramQueryArgs(dirDiscountRuleDMO));
	}

	/**
	 * Constructs parameterised query arguments.
	 * 
	 * @param $
	 *            (dataObjectNameLowerCamel} DirDiscountRuleDMO object.
	 */
	protected DAOParamQueryArgs paramQueryArgs(
			DirDiscountRuleDMO dirDiscountRuleDMO) {
		logger.debug("paramQueryArgs( dirDiscountRuleDMO)");

		DAOParamQueryArgs queryArgs = new DAOParamQueryArgs("DirDiscountRule",
				14 * 2);

		if (dirDiscountRuleDMO != null) {
			// primary key filters...
			Integer dirRuleId = dirDiscountRuleDMO.getDirRuleId();

			if (!DMO.isNull(dirRuleId)) {
				queryArgs.andFilterBy("DirRuleId").arg(dirRuleId);
			}

			// define more filters...
			String dirRuleDesc = dirDiscountRuleDMO.getDirRuleDesc();

			if (!DMO.isNull(dirRuleDesc)) {
				queryArgs.andFilterBy("DirRuleDescMatch").arg(
						dirRuleDesc + dao.wildcardForAnySequence());
			}

			String dirRuleType = dirDiscountRuleDMO.getDirRuleType();

			if (!DMO.isNull(dirRuleType)) {
				queryArgs.andFilterBy("DirRuleTypeMatch").arg(
						dirRuleType + dao.wildcardForAnySequence());
			}

			String dirBandType = dirDiscountRuleDMO.getDirBandType();

			if (!DMO.isNull(dirBandType)) {
				queryArgs.andFilterBy("DirBandTypeMatch").arg(
						dirBandType + dao.wildcardForAnySequence());
			}

			String dirChargeRef = dirDiscountRuleDMO.getDirChargeRef();

			if (!DMO.isNull(dirChargeRef)) {
				queryArgs.andFilterBy("DirChargeRefMatch").arg(
						dirChargeRef + dao.wildcardForAnySequence());
			}

			String dirAppToVal = dirDiscountRuleDMO.getDirAppToVal();

			if (!DMO.isNull(dirAppToVal)) {
				queryArgs.andFilterBy("DirAppToValMatch").arg(
						dirAppToVal + dao.wildcardForAnySequence());
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
				(dmlName == null) ? "DirDiscountRule" : dmlName, parts.size());

		Iterator it = parts.iterator();

		// for ( FilterPart part : parts ) {
		while (it.hasNext()) {
			FilterPart part = (FilterPart) it.next();

			switch (part.getIndex()) {
			case DirDiscountRuleDMO.dirRuleIdFilter:
				part.andFilterBy(queryArgs, "DirRuleId", dao
						.wildcardForAnySequence());

				break;

			case DirDiscountRuleDMO.dirRuleRefFilter:
				part.andFilterBy(queryArgs, "DirRuleRef", dao
						.wildcardForAnySequence());

				break;

			case DirDiscountRuleDMO.dirStartDateFilter:
				part.andFilterBy(queryArgs, "DirStartDate", dao
						.wildcardForAnySequence());

				break;

			case DirDiscountRuleDMO.dirEndDateFilter:
				part.andFilterBy(queryArgs, "DirEndDate", dao
						.wildcardForAnySequence());

				break;

			case DirDiscountRuleDMO.dirRuleDescFilter:
				part.andFilterBy(queryArgs, "DirRuleDesc", dao
						.wildcardForAnySequence());

				break;

			case DirDiscountRuleDMO.dirRuleTypeFilter:
				part.andFilterBy(queryArgs, "DirRuleType", dao
						.wildcardForAnySequence());

				break;

			case DirDiscountRuleDMO.dirStartAfterFilter:
				part.andFilterBy(queryArgs, "DirStartAfter", dao
						.wildcardForAnySequence());

				break;

			case DirDiscountRuleDMO.dirApplyForFilter:
				part.andFilterBy(queryArgs, "DirApplyFor", dao
						.wildcardForAnySequence());

				break;

			case DirDiscountRuleDMO.dirBandTypeFilter:
				part.andFilterBy(queryArgs, "DirBandType", dao
						.wildcardForAnySequence());

				break;

			case DirDiscountRuleDMO.dirThresholdIdFilter:
				part.andFilterBy(queryArgs, "DirThresholdId", dao
						.wildcardForAnySequence());

				break;

			case DirDiscountRuleDMO.dirAppDiscIdFilter:
				part.andFilterBy(queryArgs, "DirAppDiscId", dao
						.wildcardForAnySequence());

				break;

			case DirDiscountRuleDMO.dirChargeRefFilter:
				part.andFilterBy(queryArgs, "DirChargeRef", dao
						.wildcardForAnySequence());

				break;

			case DirDiscountRuleDMO.dirRuleUsedFilter:
				part.andFilterBy(queryArgs, "DirRuleUsed", dao
						.wildcardForAnySequence());

				break;

			case DirDiscountRuleDMO.dirAppToValFilter:
				part.andFilterBy(queryArgs, "DirAppToVal", dao
						.wildcardForAnySequence());

				break;
			}
		}

		return queryArgs;
	}

	/**
	 * Provides a DAOIterator to iterate over the list of DirDiscountRule
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
	 * DirDiscountRule records based on the passed in Filter.
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
	 * Retrieves the DirDiscountRule Data Model Object from a possible list.
	 * 
	 * @param filter
	 * @return
	 * @throws EPPIXSeriousException
	 */
	public DirDiscountRuleDMO get(QueryFilter filter)
			throws EPPIXSeriousException {
		logger.debug("get( filter )");

		DAOParamQueryArgs args = filterQueryArgs(filter, null);

		return (DirDiscountRuleDMO) dao.get(args.getDMLName(), args
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
