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
 * MshMsisdnHistory Business Object.
 * 
 * @version $Revision: 1.2 $
 * @author $Author$
 * @since $jdk$
 */
public class MshMsisdnHistoryAbstractDACImpl extends DAC implements
		MshMsisdnHistoryAbstractDAC {
	// ~ Static variables/initializers
	// //////////////////////////////////////////

	/** Error handler/logger. */
	static DAOThrower thrower = DAOThrower
			.getDAOThrower(MshMsisdnHistoryAbstractDACImpl.class);

	// ~ Instance variables
	// /////////////////////////////////////////////////////

	/** DOCUMENT ME! */
	Logger logger = thrower.getLogger();

	// ~ Constructors
	// ///////////////////////////////////////////////////////////

	/**
	 * Creates a new MshMsisdnHistoryDACImpl object.
	 * 
	 * @param dao
	 *            Data Access Object.
	 * @param defaultLanguageCode
	 *            the working language of the user, dictates which language
	 *            specific descriptions are retrieved.
	 */
	public MshMsisdnHistoryAbstractDACImpl(UserContext userContext, DAO dao) {
		super(userContext, dao, thrower);
	}

	public MshMsisdnHistoryAbstractDACImpl(DAO dao) {
		super(dao, thrower);
	}
	
	// ~ Methods
	// ////////////////////////////////////////////////////////////////

	/**
	 * Creates the MshMsisdnHistory object in the database.
	 * 
	 * @param MshMsisdnHistoryDMO
	 *            mshMsisdnHistoryDMO
	 * 
	 * @throws EPPIXSeriousException
	 */
	public void create(MshMsisdnHistoryDMO mshMsisdnHistoryDMO)
			throws EPPIXSeriousException {
		logger.debug("create( mshMsisdnHistoryDMO )");
		thrower.ifParameterMissing("MshMsisdnHistoryDMO", mshMsisdnHistoryDMO);

		dao.insert(mshMsisdnHistoryDMO);
	}

	/**
	 * Locks and retrieves the MshMsisdnHistory object from the database.
	 * 
	 * @param aMshMsisdnHistory
	 *            MshMsisdnHistory object
	 * 
	 * @return a populated MshMsisdnHistory object or null if not found.
	 * 
	 * @throws EPPIXSeriousException
	 */
	public MshMsisdnHistoryDMO lock(MshMsisdnHistoryDMO aMshMsisdnHistoryDMO)
			throws EPPIXSeriousException, EPPIXObjectBusyException {
		logger.debug("lock( aMshMsisdnHistoryDMO )");

		thrower
				.ifParameterMissing("aMshMsisdnHistoryDMO",
						aMshMsisdnHistoryDMO);

		MshMsisdnHistoryDMO lockedMshMsisdnHistoryDMO = null;

		//
		// Lock the base table on its primary key.
		//
		lockedMshMsisdnHistoryDMO = (MshMsisdnHistoryDMO) dao.lock(
				"MshMsisdnHistory", "filterByPrimaryKey", new DAOArgs(0));

		return lockedMshMsisdnHistoryDMO;
	}

	/**
	 * Modifies the MshMsisdnHistory object using the specified filter in the
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

		dao.updateCustom(new MshMsisdnHistoryDMO(), filterQueryArgs(filter,
				null));
	}

	/**
	 * Deletes the MshMsisdnHistory object from the database.
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

		dao.delete("MshMsisdnHistory", args.getFilterBy(), args);
	}

	/**
	 * Return true if a MshMsisdnHistory object exists.
	 * 
	 * @param filter
	 * 
	 * @return true if the MshMsisdnHistory object exists.
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
	 *            MshMsisdnHistory Data Model Object
	 * 
	 * @return DTOList of MshMsisdnHistory Data Model Objects.
	 * 
	 * @throws EPPIXSeriousException
	 */
	// public DTOList getList(
	// DTOListState state,
	// MshMsisdnHistoryDMO mshMsisdnHistoryDMO )
	// throws EPPIXSeriousException {
	// logger.debug( "getList( state, mshMsisdnHistoryDMO )" );
	//
	// return dao.getListAbs( state, paramQueryArgs( mshMsisdnHistoryDMO ) );
	// }
	/**
	 * Constructs parameterised query arguments.
	 * 
	 * @param $(dataObjectNameLowerCamel}
	 *            MshMsisdnHistoryDMO object.
	 */
	protected DAOParamQueryArgs paramQueryArgs(
			MshMsisdnHistoryDMO mshMsisdnHistoryDMO) {
		logger.debug("paramQueryArgs( mshMsisdnHistoryDMO)");

		DAOParamQueryArgs queryArgs = new DAOParamQueryArgs("MshMsisdnHistory",
				7 * 2);

		if (mshMsisdnHistoryDMO != null) {
			// primary key filters...
			// define more filters...
			String mshMsisdnNo = mshMsisdnHistoryDMO.getMshMsisdnNo();

			if (!DMO.isNull(mshMsisdnNo)) {
				queryArgs.andFilterBy("MshMsisdnNoMatch").arg(
						mshMsisdnNo + dao.wildcardForAnySequence());
			}

			String mshHistCode = mshMsisdnHistoryDMO.getMshHistCode();

			if (!DMO.isNull(mshHistCode)) {
				queryArgs.andFilterBy("MshHistCodeMatch").arg(
						mshHistCode + dao.wildcardForAnySequence());
			}

			String mshComment = mshMsisdnHistoryDMO.getMshComment();

			if (!DMO.isNull(mshComment)) {
				queryArgs.andFilterBy("MshCommentMatch").arg(
						mshComment + dao.wildcardForAnySequence());
			}

			String mshUserId = mshMsisdnHistoryDMO.getMshUserId();

			if (!DMO.isNull(mshUserId)) {
				queryArgs.andFilterBy("MshUserIdMatch").arg(
						mshUserId + dao.wildcardForAnySequence());
			}

			String mshTerminalId = mshMsisdnHistoryDMO.getMshTerminalId();

			if (!DMO.isNull(mshTerminalId)) {
				queryArgs.andFilterBy("MshTerminalIdMatch").arg(
						mshTerminalId + dao.wildcardForAnySequence());
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
//	public DTOList getList(DTOListState state, QueryFilter filter)
//			throws EPPIXSeriousException {
//		logger.debug("getList( state, filter )");
//
//		return dao.getListAbs(state, filterQueryArgs(filter, null));
//	}

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
				(dmlName == null) ? "MshMsisdnHistory" : dmlName, parts.size());

		for (Iterator i = parts.iterator(); i.hasNext();) {
			FilterPart part = (FilterPart) i.next();
			switch (part.getIndex()) {
			case MshMsisdnHistoryDMO.mshSubscriberIdFilter:
				part.andFilterBy(queryArgs, "MshSubscriberId", dao
						.wildcardForAnySequence());

				break;

			case MshMsisdnHistoryDMO.mshMsisdnNoFilter:
				part.andFilterBy(queryArgs, "MshMsisdnNo", dao
						.wildcardForAnySequence());

				break;

			case MshMsisdnHistoryDMO.mshHistCodeFilter:
				part.andFilterBy(queryArgs, "MshHistCode", dao
						.wildcardForAnySequence());

				break;

			case MshMsisdnHistoryDMO.mshCommentFilter:
				part.andFilterBy(queryArgs, "MshComment", dao
						.wildcardForAnySequence());

				break;

			case MshMsisdnHistoryDMO.mshUserIdFilter:
				part.andFilterBy(queryArgs, "MshUserId", dao
						.wildcardForAnySequence());

				break;

			case MshMsisdnHistoryDMO.mshTerminalIdFilter:
				part.andFilterBy(queryArgs, "MshTerminalId", dao
						.wildcardForAnySequence());

				break;

			case MshMsisdnHistoryDMO.mshTimestampFilter:
				part.andFilterBy(queryArgs, "MshTimestamp", dao
						.wildcardForAnySequence());

				break;
			}
		}

		return queryArgs;
	}

	/**
	 * Provides a DAOIterator to iterate over the list of MshMsisdnHistory
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
	 * MshMsisdnHistory records based on the passed in Filter.
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
	 * Retrieves the MshMsisdnHistory Data Model Object from a possible list.
	 * 
	 * @param filter
	 * @return
	 * @throws EPPIXSeriousException
	 */
	public MshMsisdnHistoryDMO get(QueryFilter filter)
			throws EPPIXSeriousException {
		logger.debug("get( filter )");

		DAOParamQueryArgs args = filterQueryArgs(filter, null);

		return (MshMsisdnHistoryDMO) dao.get(args.getDMLName(), args
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
