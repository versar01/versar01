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

import com.eppixcomm.eppix.common.data.DAC;
import com.eppixcomm.eppix.common.data.DAO;
import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DAOIterator;
import com.eppixcomm.eppix.common.data.DAOParamQueryArgs;
import com.eppixcomm.eppix.common.data.DAOThrower;
import com.eppixcomm.eppix.common.data.DMO;
import com.eppixcomm.eppix.common.util.DateTime;
import com.eppixcomm.eppix.common.util.FilterPart;
import com.eppixcomm.eppix.common.util.QueryFilter;
import com.eppixcomm.eppix.base.error.EPPIXObjectBusyException;
import com.eppixcomm.eppix.base.error.EPPIXObjectExpiredException;
import com.eppixcomm.eppix.base.error.EPPIXObjectNotFoundException;
import com.eppixcomm.eppix.base.error.EPPIXSeriousException;

/**
 * This is the standard implementation of the Data Access Controller for the
 * CdiDatabaseInt Business Object.
 * 
 * @version $Revision: 1.2 $
 * @author $Author$
 * @since $jdk$
 */
public class CdiDatabaseIntAbstractDACImpl extends DAC implements
		CdiDatabaseIntDAC {
	// ~ Static variables/initializers
	// //////////////////////////////////////////

	/** Error handler/logger. */
	static DAOThrower thrower = DAOThrower
			.getDAOThrower(CdiDatabaseIntDACImpl.class);

	// ~ Instance variables
	// /////////////////////////////////////////////////////

	/** DOCUMENT ME! */
	Logger logger = thrower.getLogger();

	// ~ Constructors
	// ///////////////////////////////////////////////////////////

	/**
	 * Creates a new CdiDatabaseIntDACImpl object.
	 * 
	 * @param dao
	 *            Data Access Object.
	 * @param defaultLanguageCode
	 *            the working language of the user, dictates which language
	 *            specific descriptions are retrieved.
	 */
	public CdiDatabaseIntAbstractDACImpl(

	DAO dao) {
		super(dao, thrower);
	}

	// ~ Methods
	// ////////////////////////////////////////////////////////////////

	/**
	 * Retrieves a CdiDatabaseInt Data Model Object
	 * 
	 * @return a populated CdiDatabaseInt Data Model Object or null if not
	 *         found.
	 * 
	 * @throws EPPIXSeriousException
	 */
	public CdiDatabaseIntDMO get(CdiDatabaseIntDMO cdiDatabaseIntDMO)
			throws EPPIXSeriousException {
		logger.debug("get( CdiDatabaseIntDMO )");

		thrower.ifParameterMissing("CdiDatabaseIntDMO", cdiDatabaseIntDMO);

		return (CdiDatabaseIntDMO) dao.get(cdiDatabaseIntDMO);
	}

	/**
	 * Creates the CdiDatabaseInt object in the database.
	 * 
	 * @param CdiDatabaseIntDMO
	 *            cdiDatabaseIntDMO
	 * 
	 * @throws EPPIXSeriousException
	 */
	public void create(CdiDatabaseIntDMO cdiDatabaseIntDMO)
			throws EPPIXSeriousException {
		logger.debug("create( cdiDatabaseIntDMO )");
		thrower.ifParameterMissing("CdiDatabaseIntDMO", cdiDatabaseIntDMO);

		dao.insert(cdiDatabaseIntDMO);
	}

	public void creatCustomCdi(CdiDatabaseIntDMO cdiDatabaseIntDMO)
			throws EPPIXSeriousException {
		logger.debug("create( cdiDatabaseIntDMO )");

		thrower.ifParameterMissing("CdiDatabaseIntDMO", cdiDatabaseIntDMO);

		DAOArgs args = new DAOArgs(6).arg(cdiDatabaseIntDMO.getCdiBillAcNo())
		.arg(cdiDatabaseIntDMO.getCdiSubscriberId())
		.arg(cdiDatabaseIntDMO.getCdiAccType())
		.arg(cdiDatabaseIntDMO.getCdiStatus())
		.arg(cdiDatabaseIntDMO.getCdiText())
		.arg(cdiDatabaseIntDMO.getCdiTimestamp().toString());

		dao.execute("creatCustomCdi", args);
	}

	/**
	 * Locks and retrieves the CdiDatabaseInt object from the database.
	 * 
	 * @param aCdiDatabaseInt
	 *            CdiDatabaseInt object
	 * 
	 * @return a populated CdiDatabaseInt object or null if not found.
	 * 
	 * @throws EPPIXSeriousException
	 */
	public CdiDatabaseIntDMO lock(CdiDatabaseIntDMO aCdiDatabaseIntDMO)
			throws EPPIXSeriousException, EPPIXObjectBusyException {
		logger.debug("lock( aCdiDatabaseIntDMO )");

		thrower.ifParameterMissing("aCdiDatabaseIntDMO", aCdiDatabaseIntDMO);

		CdiDatabaseIntDMO lockedCdiDatabaseIntDMO = null;

		//
		// Lock the base table on its primary key.
		//
		lockedCdiDatabaseIntDMO = (CdiDatabaseIntDMO) dao.lock(
				"CdiDatabaseInt", "filterByPrimaryKey",
				new DAOArgs(1).arg(aCdiDatabaseIntDMO.getCdiSerial()));

		return lockedCdiDatabaseIntDMO;
	}

	/**
	 * Modifies the CdiDatabaseInt object in the database.
	 * 
	 * @param CdiDatabaseIntDMO
	 *            CdiDatabaseInt object
	 * 
	 * @throws EPPIXSeriousException
	 * @throws EPPIXObjectExpiredException
	 * @throws EPPIXObjectNotFoundException
	 */
	public void modify(CdiDatabaseIntDMO cdiDatabaseIntDMO)
			throws EPPIXSeriousException, EPPIXObjectExpiredException,
			EPPIXObjectNotFoundException {
		logger.debug("modify( aCdiDatabaseIntDMO )");

		thrower.ifParameterMissing("aCdiDatabaseIntDMO", cdiDatabaseIntDMO);

		thrower.ifParameterMissing("CdiDatabaseIntDMO.cdiSerial",
				cdiDatabaseIntDMO.getCdiSerial());

		dao.update(cdiDatabaseIntDMO);
	}

	/**
	 * Modifies the CdiDatabaseInt object using the specified filter in the
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

		dao.updateCustom(new CdiDatabaseIntDMO(), filterQueryArgs(filter, null));
	}

	/**
	 * Deletes the CdiDatabaseInt object from the database.
	 * 
	 * @param CdiDatabaseIntDMO
	 *            CdiDatabaseInt object
	 * 
	 * @throws EPPIXSeriousException
	 * @throws EPPIXObjectNotFoundException
	 * @throws EPPIXObjectExpiredException
	 */
	public void delete(CdiDatabaseIntDMO cdiDatabaseIntDMO)
			throws EPPIXSeriousException, EPPIXObjectNotFoundException,
			EPPIXObjectExpiredException {
		logger.debug("delete( CdiDatabaseIntDMO )");

		thrower.ifParameterMissing("CdiDatabaseIntDMO", cdiDatabaseIntDMO);

		thrower.ifParameterMissing("CdiDatabaseIntDMO.cdiSerial",
				cdiDatabaseIntDMO.getCdiSerial());

		dao.delete(cdiDatabaseIntDMO);
	}

	/**
	 * Deletes the CdiDatabaseInt object from the database.
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

		dao.delete("CdiDatabaseInt", args.getFilterBy(), args);
	}

	/**
	 * Return true if a CdiDatabaseInt object exists.
	 * 
	 * @param CdiDatabaseIntDMO
	 *            CdiDatabaseIntDMO
	 * 
	 * @return true if the CdiDatabaseInt object exists.
	 * 
	 * @throws EPPIXSeriousException
	 */
	public boolean exists(CdiDatabaseIntDMO CdiDatabaseIntDMO)
			throws EPPIXSeriousException {
		logger.debug("exists( CdiDatabaseIntDMO)");

		return dao.exists("CdiDatabaseInt", "filterByPrimaryKey",
				new DAOArgs(1).arg(CdiDatabaseIntDMO.getCdiSerial()));
	}

	/**
	 * Return true if a CdiDatabaseInt object exists.
	 * 
	 * @param filter
	 * 
	 * @return true if the CdiDatabaseInt object exists.
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
	 *            CdiDatabaseInt Data Model Object
	 * 
	 * @return DTOList of CdiDatabaseInt Data Model Objects.
	 * 
	 * @throws EPPIXSeriousException
	 */
	// public DTOList<CdiDatabaseIntDMO> getList(
	// DTOListState state,
	// CdiDatabaseIntDMO cdiDatabaseIntDMO )
	// throws EPPIXSeriousException {
	// logger.debug( "getList( state, cdiDatabaseIntDMO )" );
	//
	// return dao.getListAbs( state, paramQueryArgs( cdiDatabaseIntDMO ) );
	// }

	/**
	 * Constructs parameterised query arguments.
	 * 
	 * @param $
	 *            (dataObjectNameLowerCamel} CdiDatabaseIntDMO object.
	 */
	protected DAOParamQueryArgs paramQueryArgs(
			CdiDatabaseIntDMO cdiDatabaseIntDMO) {
		logger.debug("paramQueryArgs( cdiDatabaseIntDMO)");

		DAOParamQueryArgs queryArgs = new DAOParamQueryArgs("CdiDatabaseInt",
				7 * 2);

		if (cdiDatabaseIntDMO != null) {
			// primary key filters...
			Integer cdiSerial = cdiDatabaseIntDMO.getCdiSerial();

			if (!DMO.isNull(cdiSerial)) {
				queryArgs.andFilterBy("CdiSerial").arg(cdiSerial);
			}

			// define more filters...
			String cdiBillAcNo = cdiDatabaseIntDMO.getCdiBillAcNo();

			if (!DMO.isNull(cdiBillAcNo)) {
				queryArgs.andFilterBy("CdiBillAcNoMatch").arg(
						cdiBillAcNo + dao.wildcardForAnySequence());
			}

			String cdiAccType = cdiDatabaseIntDMO.getCdiAccType();

			if (!DMO.isNull(cdiAccType)) {
				queryArgs.andFilterBy("CdiAccTypeMatch").arg(
						cdiAccType + dao.wildcardForAnySequence());
			}

			String cdiStatus = cdiDatabaseIntDMO.getCdiStatus();

			if (!DMO.isNull(cdiStatus)) {
				queryArgs.andFilterBy("CdiStatusMatch").arg(
						cdiStatus + dao.wildcardForAnySequence());
			}

			String cdiText = cdiDatabaseIntDMO.getCdiText();

			if (!DMO.isNull(cdiText)) {
				queryArgs.andFilterBy("CdiTextMatch").arg(
						cdiText + dao.wildcardForAnySequence());
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
	// public DTOList<CdiDatabaseIntDMO> getList(
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
				(dmlName == null) ? "CdiDatabaseInt" : dmlName, parts.size());

		for (Iterator i = parts.iterator(); i.hasNext();) {
			FilterPart part = (FilterPart) i.next();

			switch (part.getIndex()) {
			case CdiDatabaseIntDMO.cdiSerialFilter:
				part.andFilterBy(queryArgs, "CdiSerial");

				break;

			case CdiDatabaseIntDMO.cdiBillAcNoFilter:
				part.andFilterBy(queryArgs, "CdiBillAcNo",
						dao.wildcardForAnySequence());

				break;

			case CdiDatabaseIntDMO.cdiSubscriberIdFilter:
				part.andFilterBy(queryArgs, "CdiSubscriberId");

				break;

			case CdiDatabaseIntDMO.cdiAccTypeFilter:
				part.andFilterBy(queryArgs, "CdiAccType",
						dao.wildcardForAnySequence());

				break;

			case CdiDatabaseIntDMO.cdiStatusFilter:
				part.andFilterBy(queryArgs, "CdiStatus",
						dao.wildcardForAnySequence());

				break;

			case CdiDatabaseIntDMO.cdiTimestampFilter:
				part.andFilterBy(queryArgs, "CdiTimestamp");

				break;

			case CdiDatabaseIntDMO.cdiTextFilter:
				part.andFilterBy(queryArgs, "CdiText",
						dao.wildcardForAnySequence());

				break;
			}
		}

		return queryArgs;
	}

	/**
	 * Provides a DAOIterator to iterate over the list of CdiDatabaseInt records
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
	 * CdiDatabaseInt records based on the passed in Filter.
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
	 * Retrieves the CdiDatabaseInt Data Model Object from a possible list.
	 * 
	 * @param filter
	 * @return
	 * @throws EPPIXSeriousException
	 */
	public CdiDatabaseIntDMO get(QueryFilter filter)
			throws EPPIXSeriousException {
		logger.debug("get( filter )");

		DAOParamQueryArgs args = filterQueryArgs(filter, null);

		return (CdiDatabaseIntDMO) dao.get(args.getDMLName(),
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

		return dao.max(args.getDMLName(), args.getFilterBy(), args,
				args.getMaxField());
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

		return dao.min(args.getDMLName(), args.getFilterBy(), args,
				args.getMaxField());
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

	public void updateCDIStatus(String status, String text, String date,
			Integer serial) {
		logger.debug("updateCDIStatus(String status, String text, String date,	Integer serial )");

		try {
			thrower.ifParameterMissing("status", status);
			thrower.ifParameterMissing("text", text);
			thrower.ifParameterMissing("date", date);
			thrower.ifParameterMissing("serial", serial);
		} catch (EPPIXSeriousException e) {
			logger.fatal("Failed paramter test for updateCDIStatus");
		}

		DAOParamQueryArgs queryArgs = (DAOParamQueryArgs) new DAOParamQueryArgs(
				"updateCDIStatus", 4).arg(status).arg(text).arg(date)
				.arg(serial);

		CdiDatabaseIntDMO cdiDMO = new CdiDatabaseIntDMO();
		cdiDMO.setCdiSerial(serial);
		cdiDMO.setCdiStatus(status);
		cdiDMO.setCdiText(text);
		cdiDMO.setCdiTimestamp(new DateTime());

		try {
			dao.update(cdiDMO, "CDI_DATABASE_INT");
		} catch (EPPIXSeriousException e) {
			logger.fatal("Failed updateCDIStatus: Exception: " + e.getMessage());
		} catch (EPPIXObjectExpiredException e) {
			logger.fatal("Failed updateCDIStatus: Exception: " + e.getMessage());
		} catch (EPPIXObjectNotFoundException e) {
			logger.fatal("Failed updateCDIStatus: Exception: " + e.getMessage());
		}
	}

}
