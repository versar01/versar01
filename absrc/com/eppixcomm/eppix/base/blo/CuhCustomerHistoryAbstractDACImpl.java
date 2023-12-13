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

import com.eppixcomm.eppix.common.core.UserContext; // always required for this
import com.eppixcomm.eppix.common.data.DAC; // always required for this sort of
import com.eppixcomm.eppix.common.data.DAO; // always required for this sort of
import com.eppixcomm.eppix.common.data.DAOArgs; // always required for this sort
import com.eppixcomm.eppix.common.data.DAOIterator;
import com.eppixcomm.eppix.common.data.DAOParamQueryArgs; // always required
import com.eppixcomm.eppix.common.data.DAOThrower; // always required for this
import com.eppixcomm.eppix.common.data.DMO; // always required for this sort of
import com.eppixcomm.eppix.common.util.FilterPart;
import com.eppixcomm.eppix.common.util.QueryFilter;
import com.eppixcomm.eppix.common.data.DTOList; // always required for this sort of
import com.eppixcomm.eppix.common.data.DTOListState; // always required for this sort
import com.eppixcomm.eppix.base.error.EPPIXObjectBusyException; // always required
import com.eppixcomm.eppix.base.error.EPPIXObjectExpiredException; // always
import com.eppixcomm.eppix.base.error.EPPIXObjectNotFoundException; // always
import com.eppixcomm.eppix.base.error.EPPIXSeriousException; // always required for
import com.eppixcomm.eppix.base.error.EPPIXUnexpectedException; // always required
import com.eppixcomm.eppix.common.util.Date; // always required for this sort of
import com.eppixcomm.eppix.common.util.DateTime; // always required for this sort of
import com.eppixcomm.eppix.common.util.Time;

import org.apache.log4j.Logger; // always required for this sort of class

import java.math.BigDecimal; // always required for this sort of class

import java.util.Iterator;
import java.util.List;

/**
 * This is the standard implementation of the Data Access Controller for the
 * CuhCustomerHistory Business Object.
 * 
 * @version $Revision: 1.2 $
 * @author $Author$
 * @since $jdk$
 */
public abstract class CuhCustomerHistoryAbstractDACImpl extends DAC implements
		CuhCustomerHistoryAbstractDAC {
	// ~ Static variables/initializers
	// //////////////////////////////////////////

	/** Error handler/logger. */
	static DAOThrower thrower = DAOThrower
			.getDAOThrower(CuhCustomerHistoryAbstractDACImpl.class);

	// ~ Instance variables
	// /////////////////////////////////////////////////////

	/** DOCUMENT ME! */
	Logger logger = thrower.getLogger();

	// ~ Constructors
	// ///////////////////////////////////////////////////////////

	/**
	 * Creates a new CuhCustomerHistoryDACImpl object.
	 * 
	 * @param dao
	 *            Data Access Object.
	 * @param defaultLanguageCode
	 *            the working language of the user, dictates which language
	 *            specific descriptions are retrieved.
	 */
	public CuhCustomerHistoryAbstractDACImpl(UserContext userContext, DAO dao) {
		super(userContext, dao, thrower);
	}
	
	/**
	 * Added by Sarel constructor
	 * @param dao
	 */
	public CuhCustomerHistoryAbstractDACImpl(DAO dao) {
		super(dao, thrower);
	}

	// ~ Methods
	// ////////////////////////////////////////////////////////////////

	/**
	 * Creates the CuhCustomerHistory object in the database.
	 * 
	 * @param CuhCustomerHistoryDMO
	 *            CuhCustomerHistoryDMO
	 * 
	 * @throws EPPIXSeriousException
	 */
	public void create(CuhCustomerHistoryDMO CuhCustomerHistoryDMO)
			throws EPPIXSeriousException {
		logger.debug("create( CuhCustomerHistoryDMO )");
		thrower.ifParameterMissing("CuhCustomerHistoryDMO", CuhCustomerHistoryDMO);

		dao.insert(CuhCustomerHistoryDMO);
	}

	/**
	 * Locks and retrieves the CuhCustomerHistory object from the database.
	 * 
	 * @param aCuhCustomerHistory
	 *            CuhCustomerHistory object
	 * 
	 * @return a populated CuhCustomerHistory object or null if not found.
	 * 
	 * @throws EPPIXSeriousException
	 */
	public CuhCustomerHistoryDMO lock(CuhCustomerHistoryDMO aCuhCustomerHistoryDMO)
			throws EPPIXSeriousException, EPPIXObjectBusyException {
		logger.debug("lock( aCuhCustomerHistoryDMO )");

		thrower.ifParameterMissing("aCuhCustomerHistoryDMO", aCuhCustomerHistoryDMO);

		CuhCustomerHistoryDMO lockedCuhCustomerHistoryDMO = null;

		//
		// Lock the base table on its primary key.
		//
		lockedCuhCustomerHistoryDMO = (CuhCustomerHistoryDMO) dao.lock("CuhCustomerHistory",
				"filterByPrimaryKey", new DAOArgs(0));

		return lockedCuhCustomerHistoryDMO;
	}

	/**
	 * Modifies the CuhCustomerHistory object using the specified filter in the
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

		dao.updateCustom(new CuhCustomerHistoryDMO(), filterQueryArgs(filter, null));
	}

	/**
	 * Deletes the CuhCustomerHistory object from the database.
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

		dao.delete("CuhCustomerHistory", args.getFilterBy(), args);
	}

	/**
	 * Return true if a CuhCustomerHistory object exists.
	 * 
	 * @param filter
	 * 
	 * @return true if the CuhCustomerHistory object exists.
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
	 *            CuhCustomerHistory Data Model Object
	 * 
	 * @return DTOList of CuhCustomerHistory Data Model Objects.
	 * 
	 * @throws EPPIXSeriousException
	 */
	// public DTOList getList(
	// DTOListState state,
	// CuhCustomerHistoryDMO CuhCustomerHistoryDMO )
	// throws EPPIXSeriousException {
	// logger.debug( "getList( state, CuhCustomerHistoryDMO )" );
	//
	// return dao.getListAbs( state, paramQueryArgs( CuhCustomerHistoryDMO ) );
	// }
	/**
	 * Constructs parameterised query arguments.
	 * 
	 * @param $(dataObjectNameLowerCamel}
	 *            CuhCustomerHistoryDMO object.
	 */
	protected DAOParamQueryArgs paramQueryArgs(CuhCustomerHistoryDMO CuhCustomerHistoryDMO) {
		logger.debug("paramQueryArgs( CuhCustomerHistoryDMO)");

		DAOParamQueryArgs queryArgs = new DAOParamQueryArgs("CuhCustomerHistory",
				8 * 2);

		if (CuhCustomerHistoryDMO != null) {
			// primary key filters...
			// define more filters...
			String cuhHistCode = CuhCustomerHistoryDMO.getCuhHistCode();

			if (!DMO.isNull(cuhHistCode)) {
				queryArgs.andFilterBy("CuhHistCodeMatch").arg(
						cuhHistCode + dao.wildcardForAnySequence());
			}

			String cuhOldValue = CuhCustomerHistoryDMO.getCuhOldValue();

			if (!DMO.isNull(cuhOldValue)) {
				queryArgs.andFilterBy("CuhOldValueMatch").arg(
						cuhOldValue + dao.wildcardForAnySequence());
			}

			String cuhNewValue = CuhCustomerHistoryDMO.getCuhNewValue();

			if (!DMO.isNull(cuhNewValue)) {
				queryArgs.andFilterBy("CuhNewValueMatch").arg(
						cuhNewValue + dao.wildcardForAnySequence());
			}

			String cuhUserId = CuhCustomerHistoryDMO.getCuhUserId();

			if (!DMO.isNull(cuhUserId)) {
				queryArgs.andFilterBy("CuhUserIdMatch").arg(
						cuhUserId + dao.wildcardForAnySequence());
			}

			String cuhTerminalId = CuhCustomerHistoryDMO.getCuhTerminalId();

			if (!DMO.isNull(cuhTerminalId)) {
				queryArgs.andFilterBy("CuhTerminalIdMatch").arg(
						cuhTerminalId + dao.wildcardForAnySequence());
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
	// public DTOList getList(DTOListState state, QueryFilter filter)
	// throws EPPIXSeriousException {
	// logger.debug("getList( state, filter )");
	//
	// return dao.getListAbs(state, filterQueryArgs(filter, null));
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
				(dmlName == null) ? "CuhCustomerHistory" : dmlName, parts.size());

		for (Iterator i = parts.iterator(); i.hasNext();) {
			FilterPart part = (FilterPart) i.next();

			switch (part.getIndex()) {
			case CuhCustomerHistoryDMO.cuhBillAcNoFilter:
				part.andFilterBy(queryArgs, "CuhBillAcNo", dao
						.wildcardForAnySequence());

				break;

			case CuhCustomerHistoryDMO.cuhFieldIdFilter:
				part.andFilterBy(queryArgs, "CuhFieldId", dao
						.wildcardForAnySequence());

				break;

			case CuhCustomerHistoryDMO.cuhHistCodeFilter:
				part.andFilterBy(queryArgs, "CuhHistCode", dao
						.wildcardForAnySequence());

				break;

			case CuhCustomerHistoryDMO.cuhOldValueFilter:
				part.andFilterBy(queryArgs, "CuhOldValue", dao
						.wildcardForAnySequence());

				break;

			case CuhCustomerHistoryDMO.cuhNewValueFilter:
				part.andFilterBy(queryArgs, "CuhNewValue", dao
						.wildcardForAnySequence());

				break;

			case CuhCustomerHistoryDMO.cuhUserIdFilter:
				part.andFilterBy(queryArgs, "CuhUserId", dao
						.wildcardForAnySequence());

				break;

			case CuhCustomerHistoryDMO.cuhTerminalIdFilter:
				part.andFilterBy(queryArgs, "CuhTerminalId", dao
						.wildcardForAnySequence());

				break;

			case CuhCustomerHistoryDMO.cuhTimestampFilter:
				part.andFilterBy(queryArgs, "CuhTimestamp", dao
						.wildcardForAnySequence());

				break;
			}
		}

		return queryArgs;
	}

	/**
	 * Provides a DAOIterator to iterate over the list of CuhCustomerHistory records
	 * based on the passed in Filter.
	 * 
	 * @param filter
	 * @return
	 * @throws EPPIXSeriousException
	 */
	public DAOIterator iterate(QueryFilter filter) throws EPPIXSeriousException {
		logger.debug("iterate( filter )");

		return dao.iterator(filterQueryArgs(filter, null), true);

	}

	/**
	 * Provides a DAOIterator to iterate using a "FOR UPDATE", over the list of
	 * CuhCustomerHistory records based on the passed in Filter.
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
	 * Retrieves the CuhCustomerHistory Data Model Object from a possible list.
	 * 
	 * @param filter
	 * @return
	 * @throws EPPIXSeriousException
	 */
	public CuhCustomerHistoryDMO get(QueryFilter filter)
			throws EPPIXSeriousException {
		logger.debug("get( filter )");

		DAOParamQueryArgs args = filterQueryArgs(filter, null);

		return (CuhCustomerHistoryDMO) dao.get(args.getDMLName(),
				args.getFilterBy(), args);
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
