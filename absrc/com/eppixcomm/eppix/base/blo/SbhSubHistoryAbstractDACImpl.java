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
 * SbhSubHistory Business Object.
 * 
 * @version $Revision: 1.2 $
 * @author $Author$
 * @since $jdk$
 */
public abstract class SbhSubHistoryAbstractDACImpl extends DAC implements
		SbhSubHistoryAbstractDAC {
	// ~ Static variables/initializers
	// //////////////////////////////////////////

	/** Error handler/logger. */
	static DAOThrower thrower = DAOThrower
			.getDAOThrower(SbhSubHistoryAbstractDACImpl.class);

	// ~ Instance variables
	// /////////////////////////////////////////////////////

	/** DOCUMENT ME! */
	Logger logger = thrower.getLogger();

	// ~ Constructors
	// ///////////////////////////////////////////////////////////

	/**
	 * Creates a new SbhSubHistoryDACImpl object.
	 * 
	 * @param dao
	 *            Data Access Object.
	 * @param defaultLanguageCode
	 *            the working language of the user, dictates which language
	 *            specific descriptions are retrieved.
	 */
	public SbhSubHistoryAbstractDACImpl(UserContext userContext, DAO dao) {
		super(userContext, dao, thrower);
	}
	
	/**
	 * Constructor aded by Sarel
	 * @param userContext
	 * @param dao
	 */
	public SbhSubHistoryAbstractDACImpl(DAO dao) {
		super(dao, thrower);
	}

	// ~ Methods
	// ////////////////////////////////////////////////////////////////

	/**
	 * Creates the SbhSubHistory object in the database.
	 * 
	 * @param SbhSubHistoryDMO
	 *            sbhSubHistoryDMO
	 * 
	 * @throws EPPIXSeriousException
	 */
	public void create(SbhSubHistoryDMO sbhSubHistoryDMO)
			throws EPPIXSeriousException {
		logger.debug("create( sbhSubHistoryDMO )");
		thrower.ifParameterMissing("SbhSubHistoryDMO", sbhSubHistoryDMO);

		dao.insert(sbhSubHistoryDMO);
	}

	/**
	 * Locks and retrieves the SbhSubHistory object from the database.
	 * 
	 * @param aSbhSubHistory
	 *            SbhSubHistory object
	 * 
	 * @return a populated SbhSubHistory object or null if not found.
	 * 
	 * @throws EPPIXSeriousException
	 */
	public SbhSubHistoryDMO lock(SbhSubHistoryDMO aSbhSubHistoryDMO)
			throws EPPIXSeriousException, EPPIXObjectBusyException {
		logger.debug("lock( aSbhSubHistoryDMO )");

		thrower.ifParameterMissing("aSbhSubHistoryDMO", aSbhSubHistoryDMO);

		SbhSubHistoryDMO lockedSbhSubHistoryDMO = null;

		//
		// Lock the base table on its primary key.
		//
		lockedSbhSubHistoryDMO = (SbhSubHistoryDMO) dao.lock("SbhSubHistory",
				"filterByPrimaryKey", new DAOArgs(0));

		return lockedSbhSubHistoryDMO;
	}

	public void modify(SbhSubHistoryDMO sbhSubHistoryDMO) throws EPPIXSeriousException,
	EPPIXObjectExpiredException, EPPIXObjectNotFoundException {
		logger.debug("modify( sbhSubHistoryDMO )");
	    
		thrower.ifParameterMissing( "SbhSubHistoryDMO", sbhSubHistoryDMO );

	    thrower.ifParameterMissing( "sbhSubHistoryDMO.getSbhSubscriberId",
	    		sbhSubHistoryDMO.getSbhSubscriberId());

	    dao.update( sbhSubHistoryDMO );
}
	
	/**
	 * Modifies the SbhSubHistory object using the specified filter in the
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

		dao.updateCustom(new SbhSubHistoryDMO(), filterQueryArgs(filter, null));
	}

	/**
	 * Deletes the SbhSubHistory object from the database.
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

		dao.delete("SbhSubHistory", args.getFilterBy(), args);
	}

	/**
	 * Return true if a SbhSubHistory object exists.
	 * 
	 * @param filter
	 * 
	 * @return true if the SbhSubHistory object exists.
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
	 *            SbhSubHistory Data Model Object
	 * 
	 * @return DTOList of SbhSubHistory Data Model Objects.
	 * 
	 * @throws EPPIXSeriousException
	 */
	 public DTOList getList(
	 DTOListState state,
	 SbhSubHistoryDMO sbhSubHistoryDMO )
	 throws EPPIXSeriousException {
	 logger.debug( "getList( state, sbhSubHistoryDMO )" );
	
	 return dao.getListAbs( state, paramQueryArgs( sbhSubHistoryDMO ) );
	 }
	/**
	 * Constructs parameterised query arguments.
	 * 
	 * @param $(dataObjectNameLowerCamel}
	 *            SbhSubHistoryDMO object.
	 */
	protected DAOParamQueryArgs paramQueryArgs(SbhSubHistoryDMO sbhSubHistoryDMO) {
		logger.debug("paramQueryArgs( sbhSubHistoryDMO)");

		DAOParamQueryArgs queryArgs = new DAOParamQueryArgs("SbhSubHistory",
				8 * 2);

		if (sbhSubHistoryDMO != null) {
			// primary key filters...
			// define more filters...
			String sbhHistCode = sbhSubHistoryDMO.getSbhHistCode();

			if (!DMO.isNull(sbhHistCode)) {
				queryArgs.andFilterBy("SbhHistCodeMatch").arg(
						sbhHistCode + dao.wildcardForAnySequence());
			}

			String sbhOldValue = sbhSubHistoryDMO.getSbhOldValue();

			if (!DMO.isNull(sbhOldValue)) {
				queryArgs.andFilterBy("SbhOldValueMatch").arg(
						sbhOldValue + dao.wildcardForAnySequence());
			}

			String sbhNewValue = sbhSubHistoryDMO.getSbhNewValue();

			if (!DMO.isNull(sbhNewValue)) {
				queryArgs.andFilterBy("SbhNewValueMatch").arg(
						sbhNewValue + dao.wildcardForAnySequence());
			}

			String sbhUserId = sbhSubHistoryDMO.getSbhUserId();

			if (!DMO.isNull(sbhUserId)) {
				queryArgs.andFilterBy("SbhUserIdMatch").arg(
						sbhUserId + dao.wildcardForAnySequence());
			}

			String sbhTerminalId = sbhSubHistoryDMO.getSbhTerminalId();

			if (!DMO.isNull(sbhTerminalId)) {
				queryArgs.andFilterBy("SbhTerminalIdMatch").arg(
						sbhTerminalId + dao.wildcardForAnySequence());
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
				(dmlName == null) ? "SbhSubHistory" : dmlName, parts.size());

		for (Iterator i = parts.iterator(); i.hasNext();) {
			FilterPart part = (FilterPart) i.next();

			switch (part.getIndex()) {
			case SbhSubHistoryDMO.sbhSubscriberIdFilter:
				part.andFilterBy(queryArgs, "SbhSubscriberId", dao
						.wildcardForAnySequence());

				break;

			case SbhSubHistoryDMO.sbhFieldIdFilter:
				part.andFilterBy(queryArgs, "SbhFieldId", dao
						.wildcardForAnySequence());

				break;

			case SbhSubHistoryDMO.sbhHistCodeFilter:
				part.andFilterBy(queryArgs, "SbhHistCode", dao
						.wildcardForAnySequence());

				break;

			case SbhSubHistoryDMO.sbhOldValueFilter:
				part.andFilterBy(queryArgs, "SbhOldValue", dao
						.wildcardForAnySequence());

				break;

			case SbhSubHistoryDMO.sbhNewValueFilter:
				part.andFilterBy(queryArgs, "SbhNewValue", dao
						.wildcardForAnySequence());

				break;

			case SbhSubHistoryDMO.sbhUserIdFilter:
				part.andFilterBy(queryArgs, "SbhUserId", dao
						.wildcardForAnySequence());

				break;

			case SbhSubHistoryDMO.sbhTerminalIdFilter:
				part.andFilterBy(queryArgs, "SbhTerminalId", dao
						.wildcardForAnySequence());

				break;

			case SbhSubHistoryDMO.sbhTimestampFilter:
				part.andFilterBy(queryArgs, "SbhTimestamp", dao
						.wildcardForAnySequence());

				break;
			}
		}

		return queryArgs;
	}

	/**
	 * Provides a DAOIterator to iterate over the list of SbhSubHistory records
	 * based on the passed in Filter.
	 * 
	 * @param filter
	 * @return
	 * @throws EPPIXSeriousException
	 */
	public DAOIterator iterate(QueryFilter filter) throws EPPIXSeriousException {
		logger.debug("iterate( filter )");

		return dao.iterator(filterQueryArgs(filter, null), false);

	}

	/**
	 * Provides a DAOIterator to iterate using a "FOR UPDATE", over the list of
	 * SbhSubHistory records based on the passed in Filter.
	 * 
	 * @param filter
	 * @return
	 * @throws EPPIXSeriousException
	 */
	public DAOIterator iterateWithLock(QueryFilter filter)
			throws EPPIXSeriousException {
		logger.debug("iterateWithLock( filter )");

		return dao.iterator(filterQueryArgs(filter, null), false);
	}

	
	public SbhSubHistoryDMO get(SbhSubHistoryDMO sbhSubHistoryDMO)
	throws EPPIXSeriousException {
			logger.debug("get( sbhSubHistoryDMO )");
			
		    thrower.ifParameterMissing( "SbhSubHistoryDMO", sbhSubHistoryDMO );

		    return (SbhSubHistoryDMO) dao.get( sbhSubHistoryDMO );		

	}
	

	/**
	 * Retrieves the SbhSubHistory Data Model Object from a possible list.
	 * 
	 * @param filter
	 * @return
	 * @throws EPPIXSeriousException
	 */
	public SbhSubHistoryDMO get(QueryFilter filter)
			throws EPPIXSeriousException {
		logger.debug("get( filter )");

		DAOParamQueryArgs args = filterQueryArgs(filter, null);

		return (SbhSubHistoryDMO) dao.get(args.getDMLName(),
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
