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
 * DisDiscount Business Object.
 * 
 * @version $Revision: 1.2 $
 * @author $Author$
 * @since $jdk$
 */
public class DisDiscountAbstractDACImpl extends DAC implements
		DisDiscountAbstractDAC {
	// ~ Static variables/initializers
	// //////////////////////////////////////////

	/** Error handler/logger. */
	static DAOThrower thrower = DAOThrower
			.getDAOThrower(DisDiscountAbstractDACImpl.class);

	// ~ Instance variables
	// /////////////////////////////////////////////////////

	/** DOCUMENT ME! */
	Logger logger = thrower.getLogger();

	// ~ Constructors
	// ///////////////////////////////////////////////////////////

	/**
	 * Creates a new DisDiscountDACImpl object.
	 * 
	 * @param dao
	 *            Data Access Object.
	 * @param defaultLanguageCode
	 *            the working language of the user, dictates which language
	 *            specific descriptions are retrieved.
	 */
	public DisDiscountAbstractDACImpl(UserContext userContext, DAO dao) {
		super(userContext, dao, thrower);
	}

	public DisDiscountAbstractDACImpl(DAO dao) {
		super(dao, thrower);
	}

	// ~ Methods
	// ////////////////////////////////////////////////////////////////

	/**
	 * Retrieves a DisDiscount Data Model Object
	 * 
	 * @return a populated DisDiscount Data Model Object or null if not found.
	 * 
	 * @throws EPPIXSeriousException
	 */
	public DisDiscountDMO get(DisDiscountDMO disDiscountDMO)
			throws EPPIXSeriousException {
		logger.debug("get( DisDiscountDMO )");

		thrower.ifParameterMissing("DisDiscountDMO", disDiscountDMO);

		return (DisDiscountDMO) dao.get(disDiscountDMO);
	}

	/**
	 * Creates the DisDiscount object in the database.
	 * 
	 * @param DisDiscountDMO
	 *            disDiscountDMO
	 * 
	 * @throws EPPIXSeriousException
	 */
	public DisDiscountDMO create(DisDiscountDMO disDiscountDMO)
			throws EPPIXSeriousException {
		logger.debug("create( disDiscountDMO )");
		thrower.ifParameterMissing("DisDiscountDMO", disDiscountDMO);

		dao.insert(disDiscountDMO);

		// return the data with key
		return disDiscountDMO;
	}

	/**
	 * Locks and retrieves the DisDiscount object from the database.
	 * 
	 * @param aDisDiscount
	 *            DisDiscount object
	 * 
	 * @return a populated DisDiscount object or null if not found.
	 * 
	 * @throws EPPIXSeriousException
	 */
	public DisDiscountDMO lock(DisDiscountDMO aDisDiscountDMO)
			throws EPPIXSeriousException, EPPIXObjectBusyException {
		logger.debug("lock( aDisDiscountDMO )");

		thrower.ifParameterMissing("aDisDiscountDMO", aDisDiscountDMO);

		DisDiscountDMO lockedDisDiscountDMO = null;

		//
		// Lock the base table on its primary key.
		//
		lockedDisDiscountDMO = (DisDiscountDMO) dao.lock("DisDiscount",
				"filterByPrimaryKey", new DAOArgs(1).arg(aDisDiscountDMO
						.getDisDiscountId()));

		return lockedDisDiscountDMO;
	}

	/**
	 * Modifies the DisDiscount object in the database.
	 * 
	 * @param DisDiscountDMO
	 *            DisDiscount object
	 * 
	 * @throws EPPIXSeriousException
	 * @throws EPPIXObjectExpiredException
	 * @throws EPPIXObjectNotFoundException
	 */
	public void modify(DisDiscountDMO disDiscountDMO)
			throws EPPIXSeriousException, EPPIXObjectExpiredException,
			EPPIXObjectNotFoundException {
		logger.debug("modify( aDisDiscountDMO )");

		thrower.ifParameterMissing("aDisDiscountDMO", disDiscountDMO);

		thrower.ifParameterMissing("DisDiscountDMO.disDiscountId",
				disDiscountDMO.getDisDiscountId());

		dao.update(disDiscountDMO);
	}

	/**
	 * Modifies the DisDiscount object using the specified filter in the
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

		dao.updateCustom(new DisDiscountDMO(), filterQueryArgs(filter, null));
	}

	/**
	 * Deletes the DisDiscount object from the database.
	 * 
	 * @param DisDiscountDMO
	 *            DisDiscount object
	 * 
	 * @throws EPPIXSeriousException
	 * @throws EPPIXObjectNotFoundException
	 * @throws EPPIXObjectExpiredException
	 */
	public void delete(DisDiscountDMO disDiscountDMO)
			throws EPPIXSeriousException, EPPIXObjectNotFoundException,
			EPPIXObjectExpiredException {
		logger.debug("delete( DisDiscountDMO )");

		thrower.ifParameterMissing("DisDiscountDMO", disDiscountDMO);

		thrower.ifParameterMissing("DisDiscountDMO.disDiscountId",
				disDiscountDMO.getDisDiscountId());

		dao.delete(disDiscountDMO);
	}

	/**
	 * Deletes the DisDiscount object from the database.
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

		dao.delete("DisDiscount", args.getFilterBy(), args);
	}

	/**
	 * Return true if a DisDiscount object exists.
	 * 
	 * @param DisDiscountDMO
	 *            DisDiscountDMO
	 * 
	 * @return true if the DisDiscount object exists.
	 * 
	 * @throws EPPIXSeriousException
	 */
	public boolean exists(DisDiscountDMO DisDiscountDMO)
			throws EPPIXSeriousException {
		logger.debug("exists( DisDiscountDMO)");

		return dao.exists("DisDiscount", "filterByPrimaryKey", new DAOArgs(1)
				.arg(DisDiscountDMO.getDisDiscountId()));
	}

	/**
	 * Return true if a DisDiscount object exists.
	 * 
	 * @param filter
	 * 
	 * @return true if the DisDiscount object exists.
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
	 *            DisDiscount Data Model Object
	 * 
	 * @return DTOList of DisDiscount Data Model Objects.
	 * 
	 * @throws EPPIXSeriousException
	 */
	public DTOList getList(DTOListState state, DisDiscountDMO disDiscountDMO)
			throws EPPIXSeriousException {
		logger.debug("getList( state, disDiscountDMO )");

		return dao.getListAbs(state, paramQueryArgs(disDiscountDMO));
	}

	/**
	 * Constructs parameterised query arguments.
	 * 
	 * @param $
	 *            (dataObjectNameLowerCamel} DisDiscountDMO object.
	 */
	protected DAOParamQueryArgs paramQueryArgs(DisDiscountDMO disDiscountDMO) {
		logger.debug("paramQueryArgs( disDiscountDMO)");

		DAOParamQueryArgs queryArgs = new DAOParamQueryArgs("DisDiscount",
				4 * 2);

		if (disDiscountDMO != null) {
			// primary key filters...
			Integer disDiscountId = disDiscountDMO.getDisDiscountId();

			if (!DMO.isNull(disDiscountId)) {
				queryArgs.andFilterBy("DisDiscountId").arg(disDiscountId);
			}

			// define more filters...
			String disDiscountRef = disDiscountDMO.getDisDiscountRef();

			if (!DMO.isNull(disDiscountRef)) {
				queryArgs.andFilterBy("DisDiscountRefMatch").arg(
						disDiscountRef + dao.wildcardForAnySequence());
			}

			String disDiscountDesc = disDiscountDMO.getDisDiscountDesc();

			if (!DMO.isNull(disDiscountDesc)) {
				queryArgs.andFilterBy("DisDiscountDescMatch").arg(
						disDiscountDesc + dao.wildcardForAnySequence());
			}
			
			Integer disDpriority = disDiscountDMO.getDisDpriority();

			if (!DMO.isNull(disDpriority)) {
				queryArgs.andFilterBy("disDpriorityMatch").arg(disDpriority);
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
				(dmlName == null) ? "DisDiscount" : dmlName, parts.size());

		Iterator it = parts.iterator();

		// for ( FilterPart part : parts ) {
		while (it.hasNext()) {
			FilterPart part = (FilterPart) it.next();

			switch (part.getIndex()) {
			case DisDiscountDMO.disDiscountIdFilter:
				part.andFilterBy(queryArgs, "DisDiscountId", dao
						.wildcardForAnySequence());

				break;

			case DisDiscountDMO.disDiscountRefFilter:
				part.andFilterBy(queryArgs, "DisDiscountRef", dao
						.wildcardForAnySequence());

				break;

			case DisDiscountDMO.disDiscountDescFilter:
				part.andFilterBy(queryArgs, "DisDiscountDesc", dao
						.wildcardForAnySequence());

				break;
			
			case DisDiscountDMO.disDpriorityFilter:
				part.andFilterBy(queryArgs, "DisDpriorityFilter", dao
					.wildcardForAnySequence());

				break;
			}
		}

		return queryArgs;
	}

	/**
	 * Provides a DAOIterator to iterate over the list of DisDiscount records
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
	 * DisDiscount records based on the passed in Filter.
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
	 * Retrieves the DisDiscount Data Model Object from a possible list.
	 * 
	 * @param filter
	 * @return
	 * @throws EPPIXSeriousException
	 */
	public DisDiscountDMO get(QueryFilter filter) throws EPPIXSeriousException {
		logger.debug("get( filter )");

		DAOParamQueryArgs args = filterQueryArgs(filter, null);

		return (DisDiscountDMO) dao.get(args.getDMLName(), args.getFilterBy(),
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
