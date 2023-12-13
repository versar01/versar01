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
 * DotDocType Business Object.
 * 
 * @version $Revision: 1.2 $
 * @author $Author$
 * @since $jdk$
 */
public class DotDocTypeAbstractDACImpl extends DAC implements
		DotDocTypeAbstractDAC {
	// ~ Static variables/initializers
	// //////////////////////////////////////////

	/** Error handler/logger. */
	static DAOThrower thrower = DAOThrower
			.getDAOThrower(DotDocTypeAbstractDACImpl.class);

	// ~ Instance variables
	// /////////////////////////////////////////////////////

	/** DOCUMENT ME! */
	Logger logger = thrower.getLogger();

	// ~ Constructors
	// ///////////////////////////////////////////////////////////

	/**
	 * Creates a new DotDocTypeDACImpl object.
	 * 
	 * @param dao
	 *            Data Access Object.
	 * @param defaultLanguageCode
	 *            the working language of the user, dictates which language
	 *            specific descriptions are retrieved.
	 */
	public DotDocTypeAbstractDACImpl(UserContext userContext, DAO dao) {
		super(userContext, dao, thrower);
	}

	public DotDocTypeAbstractDACImpl(DAO dao) {
		super(dao, thrower);
	}

	// ~ Methods
	// ////////////////////////////////////////////////////////////////

	/**
	 * Retrieves a DotDocType Data Model Object
	 * 
	 * @return a populated DotDocType Data Model Object or null if not found.
	 * 
	 * @throws EPPIXSeriousException
	 */
	public DotDocTypeDMO get(DotDocTypeDMO dotDocTypeDMO)
			throws EPPIXSeriousException {
		logger.debug("get( DotDocTypeDMO )");

		thrower.ifParameterMissing("DotDocTypeDMO", dotDocTypeDMO);

		return (DotDocTypeDMO) dao.get(dotDocTypeDMO);
	}

	/**
	 * Creates the DotDocType object in the database.
	 * 
	 * @param DotDocTypeDMO
	 *            dotDocTypeDMO
	 * 
	 * @throws EPPIXSeriousException
	 */
	public void create(DotDocTypeDMO dotDocTypeDMO)
			throws EPPIXSeriousException {
		logger.debug("create( dotDocTypeDMO )");
		thrower.ifParameterMissing("DotDocTypeDMO", dotDocTypeDMO);

		dao.insert(dotDocTypeDMO);
	}

	/**
	 * Locks and retrieves the DotDocType object from the database.
	 * 
	 * @param aDotDocType
	 *            DotDocType object
	 * 
	 * @return a populated DotDocType object or null if not found.
	 * 
	 * @throws EPPIXSeriousException
	 */
	public DotDocTypeDMO lock(DotDocTypeDMO aDotDocTypeDMO)
			throws EPPIXSeriousException, EPPIXObjectBusyException {
		logger.debug("lock( aDotDocTypeDMO )");

		thrower.ifParameterMissing("aDotDocTypeDMO", aDotDocTypeDMO);

		DotDocTypeDMO lockedDotDocTypeDMO = null;

		//
		// Lock the base table on its primary key.
		//
		lockedDotDocTypeDMO = (DotDocTypeDMO) dao.lock("DotDocType",
				"filterByPrimaryKey", new DAOArgs(1).arg(aDotDocTypeDMO
						.getDotTypeCode()));

		return lockedDotDocTypeDMO;
	}

	/**
	 * Modifies the DotDocType object in the database.
	 * 
	 * @param DotDocTypeDMO
	 *            DotDocType object
	 * 
	 * @throws EPPIXSeriousException
	 * @throws EPPIXObjectExpiredException
	 * @throws EPPIXObjectNotFoundException
	 */
	public void modify(DotDocTypeDMO dotDocTypeDMO)
			throws EPPIXSeriousException, EPPIXObjectExpiredException,
			EPPIXObjectNotFoundException {
		logger.debug("modify( aDotDocTypeDMO )");

		thrower.ifParameterMissing("aDotDocTypeDMO", dotDocTypeDMO);

		thrower.ifParameterMissing("DotDocTypeDMO.dotTypeCode", dotDocTypeDMO
				.getDotTypeCode());

		dao.update(dotDocTypeDMO);
	}

	/**
	 * Modifies the DotDocType object using the specified filter in the
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

		dao.updateCustom(new DotDocTypeDMO(), filterQueryArgs(filter, null));
	}

	/**
	 * Deletes the DotDocType object from the database.
	 * 
	 * @param DotDocTypeDMO
	 *            DotDocType object
	 * 
	 * @throws EPPIXSeriousException
	 * @throws EPPIXObjectNotFoundException
	 * @throws EPPIXObjectExpiredException
	 */
	public void delete(DotDocTypeDMO dotDocTypeDMO)
			throws EPPIXSeriousException, EPPIXObjectNotFoundException,
			EPPIXObjectExpiredException {
		logger.debug("delete( DotDocTypeDMO )");

		thrower.ifParameterMissing("DotDocTypeDMO", dotDocTypeDMO);

		thrower.ifParameterMissing("DotDocTypeDMO.dotTypeCode", dotDocTypeDMO
				.getDotTypeCode());

		dao.delete(dotDocTypeDMO);
	}

	/**
	 * Deletes the DotDocType object from the database.
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

		dao.delete("DotDocType", args.getFilterBy(), args);
	}

	/**
	 * Return true if a DotDocType object exists.
	 * 
	 * @param DotDocTypeDMO
	 *            DotDocTypeDMO
	 * 
	 * @return true if the DotDocType object exists.
	 * 
	 * @throws EPPIXSeriousException
	 */
	public boolean exists(DotDocTypeDMO DotDocTypeDMO)
			throws EPPIXSeriousException {
		logger.debug("exists( DotDocTypeDMO)");

		return dao.exists("DotDocType", "filterByPrimaryKey", new DAOArgs(1)
				.arg(DotDocTypeDMO.getDotTypeCode()));
	}

	/**
	 * Return true if a DotDocType object exists.
	 * 
	 * @param filter
	 * 
	 * @return true if the DotDocType object exists.
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
	 *            DotDocType Data Model Object
	 * 
	 * @return DTOList of DotDocType Data Model Objects.
	 * 
	 * @throws EPPIXSeriousException
	 */
	public DTOList getList(DTOListState state, DotDocTypeDMO dotDocTypeDMO)
			throws EPPIXSeriousException {
		logger.debug("getList( state, dotDocTypeDMO )");

		return dao.getListAbs(state, paramQueryArgs(dotDocTypeDMO));
	}

	/**
	 * Constructs parameterised query arguments.
	 * 
	 * @param $
	 *            (dataObjectNameLowerCamel} DotDocTypeDMO object.
	 */
	protected DAOParamQueryArgs paramQueryArgs(DotDocTypeDMO dotDocTypeDMO) {
		logger.debug("paramQueryArgs( dotDocTypeDMO)");

		DAOParamQueryArgs queryArgs = new DAOParamQueryArgs("DotDocType",
				14 * 2);

		if (dotDocTypeDMO != null) {
			// primary key filters...
			String dotTypeCode = dotDocTypeDMO.getDotTypeCode();

			if (!DMO.isNull(dotTypeCode)) {
				queryArgs.andFilterBy("DotTypeCodeMatch").arg(
						dotTypeCode + dao.wildcardForAnySequence());
			}

			// define more filters...
			String dotRelation = dotDocTypeDMO.getDotRelation();

			if (!DMO.isNull(dotRelation)) {
				queryArgs.andFilterBy("DotRelationMatch").arg(
						dotRelation + dao.wildcardForAnySequence());
			}

			String dotSubsystem = dotDocTypeDMO.getDotSubsystem();

			if (!DMO.isNull(dotSubsystem)) {
				queryArgs.andFilterBy("DotSubsystemMatch").arg(
						dotSubsystem + dao.wildcardForAnySequence());
			}

			String dotEngine = dotDocTypeDMO.getDotEngine();

			if (!DMO.isNull(dotEngine)) {
				queryArgs.andFilterBy("DotEngineMatch").arg(
						dotEngine + dao.wildcardForAnySequence());
			}

			String dotTypeFolder = dotDocTypeDMO.getDotTypeFolder();

			if (!DMO.isNull(dotTypeFolder)) {
				queryArgs.andFilterBy("DotTypeFolderMatch").arg(
						dotTypeFolder + dao.wildcardForAnySequence());
			}

			String dotFilenameStart = dotDocTypeDMO.getDotFilenameStart();

			if (!DMO.isNull(dotFilenameStart)) {
				queryArgs.andFilterBy("DotFilenameStartMatch").arg(
						dotFilenameStart + dao.wildcardForAnySequence());
			}

			String dotDefDelivery = dotDocTypeDMO.getDotDefDelivery();

			if (!DMO.isNull(dotDefDelivery)) {
				queryArgs.andFilterBy("DotDefDeliveryMatch").arg(
						dotDefDelivery + dao.wildcardForAnySequence());
			}

			String dotDefFormat = dotDocTypeDMO.getDotDefFormat();

			if (!DMO.isNull(dotDefFormat)) {
				queryArgs.andFilterBy("DotDefFormatMatch").arg(
						dotDefFormat + dao.wildcardForAnySequence());
			}

			String dotAccReqd = dotDocTypeDMO.getDotAccReqd();

			if (!DMO.isNull(dotAccReqd)) {
				queryArgs.andFilterBy("DotAccReqdMatch").arg(
						dotAccReqd + dao.wildcardForAnySequence());
			}

			String dotSubReqd = dotDocTypeDMO.getDotSubReqd();

			if (!DMO.isNull(dotSubReqd)) {
				queryArgs.andFilterBy("DotSubReqdMatch").arg(
						dotSubReqd + dao.wildcardForAnySequence());
			}

			String dotInvReqd = dotDocTypeDMO.getDotInvReqd();

			if (!DMO.isNull(dotInvReqd)) {
				queryArgs.andFilterBy("DotInvReqdMatch").arg(
						dotInvReqd + dao.wildcardForAnySequence());
			}

			String dotReasonType = dotDocTypeDMO.getDotReasonType();

			if (!DMO.isNull(dotReasonType)) {
				queryArgs.andFilterBy("DotReasonTypeMatch").arg(
						dotReasonType + dao.wildcardForAnySequence());
			}

			String dotReasonCode = dotDocTypeDMO.getDotReasonCode();

			if (!DMO.isNull(dotReasonCode)) {
				queryArgs.andFilterBy("DotReasonCodeMatch").arg(
						dotReasonCode + dao.wildcardForAnySequence());
			}

			String dotManipulate = dotDocTypeDMO.getDotManipulate();

			if (!DMO.isNull(dotManipulate)) {
				queryArgs.andFilterBy("DotManipulateMatch").arg(
						dotManipulate + dao.wildcardForAnySequence());
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
				(dmlName == null) ? "DotDocType" : dmlName, parts.size());

		Iterator it = parts.iterator();

		// for ( FilterPart part : parts ) {
		while (it.hasNext()) {
			FilterPart part = (FilterPart) it.next();

			switch (part.getIndex()) {
			case DotDocTypeDMO.dotTypeCodeFilter:
				part.andFilterBy(queryArgs, "DotTypeCode", dao
						.wildcardForAnySequence());

				break;

			case DotDocTypeDMO.dotRelationFilter:
				part.andFilterBy(queryArgs, "DotRelation", dao
						.wildcardForAnySequence());

				break;

			case DotDocTypeDMO.dotSubsystemFilter:
				part.andFilterBy(queryArgs, "DotSubsystem", dao
						.wildcardForAnySequence());

				break;

			case DotDocTypeDMO.dotEngineFilter:
				part.andFilterBy(queryArgs, "DotEngine", dao
						.wildcardForAnySequence());

				break;

			case DotDocTypeDMO.dotTypeFolderFilter:
				part.andFilterBy(queryArgs, "DotTypeFolder", dao
						.wildcardForAnySequence());

				break;

			case DotDocTypeDMO.dotFilenameStartFilter:
				part.andFilterBy(queryArgs, "DotFilenameStart", dao
						.wildcardForAnySequence());

				break;

			case DotDocTypeDMO.dotDefDeliveryFilter:
				part.andFilterBy(queryArgs, "DotDefDelivery", dao
						.wildcardForAnySequence());

				break;

			case DotDocTypeDMO.dotDefFormatFilter:
				part.andFilterBy(queryArgs, "DotDefFormat", dao
						.wildcardForAnySequence());

				break;

			case DotDocTypeDMO.dotAccReqdFilter:
				part.andFilterBy(queryArgs, "DotAccReqd", dao
						.wildcardForAnySequence());

				break;

			case DotDocTypeDMO.dotSubReqdFilter:
				part.andFilterBy(queryArgs, "DotSubReqd", dao
						.wildcardForAnySequence());

				break;

			case DotDocTypeDMO.dotInvReqdFilter:
				part.andFilterBy(queryArgs, "DotInvReqd", dao
						.wildcardForAnySequence());

				break;

			case DotDocTypeDMO.dotReasonTypeFilter:
				part.andFilterBy(queryArgs, "DotReasonType", dao
						.wildcardForAnySequence());

				break;

			case DotDocTypeDMO.dotReasonCodeFilter:
				part.andFilterBy(queryArgs, "DotReasonCode", dao
						.wildcardForAnySequence());

				break;

			case DotDocTypeDMO.dotManipulateFilter:
				part.andFilterBy(queryArgs, "DotManipulate", dao
						.wildcardForAnySequence());

				break;
			}
		}

		return queryArgs;
	}

	/**
	 * Provides a DAOIterator to iterate over the list of DotDocType records
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
	 * DotDocType records based on the passed in Filter.
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
	 * Retrieves the DotDocType Data Model Object from a possible list.
	 * 
	 * @param filter
	 * @return
	 * @throws EPPIXSeriousException
	 */
	public DotDocTypeDMO get(QueryFilter filter) throws EPPIXSeriousException {
		logger.debug("get( filter )");

		DAOParamQueryArgs args = filterQueryArgs(filter, null);

		return (DotDocTypeDMO) dao.get(args.getDMLName(), args.getFilterBy(),
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
