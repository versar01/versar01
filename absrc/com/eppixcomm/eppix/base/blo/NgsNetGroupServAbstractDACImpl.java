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
 * NgsNetGroupServ Business Object.
 * 
 * @version $Revision: 1.2 $
 * @author $Author$
 * @since $jdk$
 */
public class NgsNetGroupServAbstractDACImpl extends DAC implements
		NgsNetGroupServAbstractDAC {
	// ~ Static variables/initializers
	// //////////////////////////////////////////

	/** Error handler/logger. */
	static DAOThrower thrower = DAOThrower
			.getDAOThrower(NgsNetGroupServAbstractDACImpl.class);

	// ~ Instance variables
	// /////////////////////////////////////////////////////

	/** DOCUMENT ME! */
	Logger logger = thrower.getLogger();

	// ~ Constructors
	// ///////////////////////////////////////////////////////////

	/**
	 * Creates a new NgsNetGroupServDACImpl object.
	 * 
	 * @param dao
	 *            Data Access Object.
	 * @param defaultLanguageCode
	 *            the working language of the user, dictates which language
	 *            specific descriptions are retrieved.
	 */
	public NgsNetGroupServAbstractDACImpl(UserContext userContext, DAO dao) {
		super(userContext, dao, thrower);
	}

	public NgsNetGroupServAbstractDACImpl(DAO dao) {
		super(dao, thrower);
	}

	// ~ Methods
	// ////////////////////////////////////////////////////////////////

	/**
	 * Retrieves a NgsNetGroupServ Data Model Object
	 * 
	 * @return a populated NgsNetGroupServ Data Model Object or null if not
	 *         found.
	 * 
	 * @throws EPPIXSeriousException
	 */
	public NgsNetGroupServDMO get(NgsNetGroupServDMO ngsNetGroupServDMO)
			throws EPPIXSeriousException {
		logger.debug("get( NgsNetGroupServDMO )");

		thrower.ifParameterMissing("NgsNetGroupServDMO", ngsNetGroupServDMO);

		return (NgsNetGroupServDMO) dao.get(ngsNetGroupServDMO);
	}

	/**
	 * Creates the NgsNetGroupServ object in the database.
	 * 
	 * @param NgsNetGroupServDMO
	 *            ngsNetGroupServDMO
	 * 
	 * @throws EPPIXSeriousException
	 */
	public void create(NgsNetGroupServDMO ngsNetGroupServDMO)
			throws EPPIXSeriousException {
		logger.debug("create( ngsNetGroupServDMO )");
		thrower.ifParameterMissing("NgsNetGroupServDMO", ngsNetGroupServDMO);

		dao.insert(ngsNetGroupServDMO);
	}

	/**
	 * Locks and retrieves the NgsNetGroupServ object from the database.
	 * 
	 * @param aNgsNetGroupServ
	 *            NgsNetGroupServ object
	 * 
	 * @return a populated NgsNetGroupServ object or null if not found.
	 * 
	 * @throws EPPIXSeriousException
	 */
	public NgsNetGroupServDMO lock(NgsNetGroupServDMO aNgsNetGroupServDMO)
			throws EPPIXSeriousException, EPPIXObjectBusyException {
		logger.debug("lock( aNgsNetGroupServDMO )");

		thrower.ifParameterMissing("aNgsNetGroupServDMO", aNgsNetGroupServDMO);

		NgsNetGroupServDMO lockedNgsNetGroupServDMO = null;

		//
		// Lock the base table on its primary key.
		//
		lockedNgsNetGroupServDMO = (NgsNetGroupServDMO) dao.lock(
				"NgsNetGroupServ", "filterByPrimaryKey", new DAOArgs(4).arg(
						aNgsNetGroupServDMO.getNgsCode()).arg(
						aNgsNetGroupServDMO.getNgsNetwork()).arg(
						aNgsNetGroupServDMO.getNgsNetServCode()).arg(
						aNgsNetGroupServDMO.getNgsSequence()));

		return lockedNgsNetGroupServDMO;
	}

	/**
	 * Modifies the NgsNetGroupServ object in the database.
	 * 
	 * @param NgsNetGroupServDMO
	 *            NgsNetGroupServ object
	 * 
	 * @throws EPPIXSeriousException
	 * @throws EPPIXObjectExpiredException
	 * @throws EPPIXObjectNotFoundException
	 */
	public void modify(NgsNetGroupServDMO ngsNetGroupServDMO)
			throws EPPIXSeriousException, EPPIXObjectExpiredException,
			EPPIXObjectNotFoundException {
		logger.debug("modify( aNgsNetGroupServDMO )");

		thrower.ifParameterMissing("aNgsNetGroupServDMO", ngsNetGroupServDMO);

		thrower.ifParameterMissing("NgsNetGroupServDMO.ngsCode",
				ngsNetGroupServDMO.getNgsCode());

		thrower.ifParameterMissing("NgsNetGroupServDMO.ngsNetwork",
				ngsNetGroupServDMO.getNgsNetwork());

		thrower.ifParameterMissing("NgsNetGroupServDMO.ngsNetServCode",
				ngsNetGroupServDMO.getNgsNetServCode());

		thrower.ifParameterMissing("NgsNetGroupServDMO.ngsSequence",
				ngsNetGroupServDMO.getNgsSequence());

		dao.update(ngsNetGroupServDMO);
	}

	/**
	 * Modifies the NgsNetGroupServ object using the specified filter in the
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

		dao.updateCustom(new NgsNetGroupServDMO(),
				filterQueryArgs(filter, null));
	}

	/**
	 * Deletes the NgsNetGroupServ object from the database.
	 * 
	 * @param NgsNetGroupServDMO
	 *            NgsNetGroupServ object
	 * 
	 * @throws EPPIXSeriousException
	 * @throws EPPIXObjectNotFoundException
	 * @throws EPPIXObjectExpiredException
	 */
	public void delete(NgsNetGroupServDMO ngsNetGroupServDMO)
			throws EPPIXSeriousException, EPPIXObjectNotFoundException,
			EPPIXObjectExpiredException {
		logger.debug("delete( NgsNetGroupServDMO )");

		thrower.ifParameterMissing("NgsNetGroupServDMO", ngsNetGroupServDMO);

		thrower.ifParameterMissing("NgsNetGroupServDMO.ngsCode",
				ngsNetGroupServDMO.getNgsCode());

		thrower.ifParameterMissing("NgsNetGroupServDMO.ngsNetwork",
				ngsNetGroupServDMO.getNgsNetwork());

		thrower.ifParameterMissing("NgsNetGroupServDMO.ngsNetServCode",
				ngsNetGroupServDMO.getNgsNetServCode());

		thrower.ifParameterMissing("NgsNetGroupServDMO.ngsSequence",
				ngsNetGroupServDMO.getNgsSequence());

		dao.delete(ngsNetGroupServDMO);
	}

	/**
	 * Deletes the NgsNetGroupServ object from the database.
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

		dao.delete("NgsNetGroupServ", args.getFilterBy(), args);
	}

	/**
	 * Return true if a NgsNetGroupServ object exists.
	 * 
	 * @param NgsNetGroupServDMO
	 *            NgsNetGroupServDMO
	 * 
	 * @return true if the NgsNetGroupServ object exists.
	 * 
	 * @throws EPPIXSeriousException
	 */
	public boolean exists(NgsNetGroupServDMO NgsNetGroupServDMO)
			throws EPPIXSeriousException {
		logger.debug("exists( NgsNetGroupServDMO)");

		return dao.exists("NgsNetGroupServ", "filterByPrimaryKey", new DAOArgs(
				4).arg(NgsNetGroupServDMO.getNgsCode()).arg(
				NgsNetGroupServDMO.getNgsNetwork()).arg(
				NgsNetGroupServDMO.getNgsNetServCode()).arg(
				NgsNetGroupServDMO.getNgsSequence()));
	}

	/**
	 * Return true if a NgsNetGroupServ object exists.
	 * 
	 * @param filter
	 * 
	 * @return true if the NgsNetGroupServ object exists.
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
	 *            NgsNetGroupServ Data Model Object
	 * 
	 * @return DTOList of NgsNetGroupServ Data Model Objects.
	 * 
	 * @throws EPPIXSeriousException
	 */
	public DTOList getList(DTOListState state,
			NgsNetGroupServDMO ngsNetGroupServDMO) throws EPPIXSeriousException {
		logger.debug("getList( state, ngsNetGroupServDMO )");

		return dao.getListAbs(state, paramQueryArgs(ngsNetGroupServDMO));
	}

	/**
	 * Constructs parameterised query arguments.
	 * 
	 * @param $
	 *            (dataObjectNameLowerCamel} NgsNetGroupServDMO object.
	 */
	protected DAOParamQueryArgs paramQueryArgs(
			NgsNetGroupServDMO ngsNetGroupServDMO) {
		logger.debug("paramQueryArgs( ngsNetGroupServDMO)");

		DAOParamQueryArgs queryArgs = new DAOParamQueryArgs("NgsNetGroupServ",
				17 * 2);

		if (ngsNetGroupServDMO != null) {
			// primary key filters...
			String ngsCode = ngsNetGroupServDMO.getNgsCode();

			if (!DMO.isNull(ngsCode)) {
				queryArgs.andFilterBy("NgsCodeMatch").arg(
						ngsCode + dao.wildcardForAnySequence());
			}

			String ngsNetwork = ngsNetGroupServDMO.getNgsNetwork();

			if (!DMO.isNull(ngsNetwork)) {
				queryArgs.andFilterBy("NgsNetworkMatch").arg(
						ngsNetwork + dao.wildcardForAnySequence());
			}

			String ngsNetServCode = ngsNetGroupServDMO.getNgsNetServCode();

			if (!DMO.isNull(ngsNetServCode)) {
				queryArgs.andFilterBy("NgsNetServCodeMatch").arg(
						ngsNetServCode + dao.wildcardForAnySequence());
			}

			Integer ngsSequence = ngsNetGroupServDMO.getNgsSequence();

			if (!DMO.isNull(ngsSequence)) {
				queryArgs.andFilterBy("NgsSequence").arg(ngsSequence);
			}

			// define more filters...
			String ngsApplyText = ngsNetGroupServDMO.getNgsApplyText();

			if (!DMO.isNull(ngsApplyText)) {
				queryArgs.andFilterBy("NgsApplyTextMatch").arg(
						ngsApplyText + dao.wildcardForAnySequence());
			}

			String ngsModifyText = ngsNetGroupServDMO.getNgsModifyText();

			if (!DMO.isNull(ngsModifyText)) {
				queryArgs.andFilterBy("NgsModifyTextMatch").arg(
						ngsModifyText + dao.wildcardForAnySequence());
			}

			String ngsRemoveText = ngsNetGroupServDMO.getNgsRemoveText();

			if (!DMO.isNull(ngsRemoveText)) {
				queryArgs.andFilterBy("NgsRemoveTextMatch").arg(
						ngsRemoveText + dao.wildcardForAnySequence());
			}

			String ngsParamName1 = ngsNetGroupServDMO.getNgsParamName1();

			if (!DMO.isNull(ngsParamName1)) {
				queryArgs.andFilterBy("NgsParamName1Match").arg(
						ngsParamName1 + dao.wildcardForAnySequence());
			}

			String ngsParamValue1 = ngsNetGroupServDMO.getNgsParamValue1();

			if (!DMO.isNull(ngsParamValue1)) {
				queryArgs.andFilterBy("NgsParamValue1Match").arg(
						ngsParamValue1 + dao.wildcardForAnySequence());
			}

			String ngsParamName2 = ngsNetGroupServDMO.getNgsParamName2();

			if (!DMO.isNull(ngsParamName2)) {
				queryArgs.andFilterBy("NgsParamName2Match").arg(
						ngsParamName2 + dao.wildcardForAnySequence());
			}

			String ngsParamValue2 = ngsNetGroupServDMO.getNgsParamValue2();

			if (!DMO.isNull(ngsParamValue2)) {
				queryArgs.andFilterBy("NgsParamValue2Match").arg(
						ngsParamValue2 + dao.wildcardForAnySequence());
			}

			String ngsParamName3 = ngsNetGroupServDMO.getNgsParamName3();

			if (!DMO.isNull(ngsParamName3)) {
				queryArgs.andFilterBy("NgsParamName3Match").arg(
						ngsParamName3 + dao.wildcardForAnySequence());
			}

			String ngsParamValue3 = ngsNetGroupServDMO.getNgsParamValue3();

			if (!DMO.isNull(ngsParamValue3)) {
				queryArgs.andFilterBy("NgsParamValue3Match").arg(
						ngsParamValue3 + dao.wildcardForAnySequence());
			}

			String ngsParamName4 = ngsNetGroupServDMO.getNgsParamName4();

			if (!DMO.isNull(ngsParamName4)) {
				queryArgs.andFilterBy("NgsParamName4Match").arg(
						ngsParamName4 + dao.wildcardForAnySequence());
			}

			String ngsParamValue4 = ngsNetGroupServDMO.getNgsParamValue4();

			if (!DMO.isNull(ngsParamValue4)) {
				queryArgs.andFilterBy("NgsParamValue4Match").arg(
						ngsParamValue4 + dao.wildcardForAnySequence());
			}

			String ngsParamName5 = ngsNetGroupServDMO.getNgsParamName5();

			if (!DMO.isNull(ngsParamName5)) {
				queryArgs.andFilterBy("NgsParamName5Match").arg(
						ngsParamName5 + dao.wildcardForAnySequence());
			}

			String ngsParamValue5 = ngsNetGroupServDMO.getNgsParamValue5();

			if (!DMO.isNull(ngsParamValue5)) {
				queryArgs.andFilterBy("NgsParamValue5Match").arg(
						ngsParamValue5 + dao.wildcardForAnySequence());
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
				(dmlName == null) ? "NgsNetGroupServ" : dmlName, parts.size());

		Iterator it = parts.iterator();

		// for ( FilterPart part : parts ) {
		while (it.hasNext()) {
			FilterPart part = (FilterPart) it.next();

			switch (part.getIndex()) {
			case NgsNetGroupServDMO.ngsCodeFilter:
				part.andFilterBy(queryArgs, "NgsCode", dao
						.wildcardForAnySequence());

				break;

			case NgsNetGroupServDMO.ngsNetworkFilter:
				part.andFilterBy(queryArgs, "NgsNetwork", dao
						.wildcardForAnySequence());

				break;

			case NgsNetGroupServDMO.ngsNetServCodeFilter:
				part.andFilterBy(queryArgs, "NgsNetServCode", dao
						.wildcardForAnySequence());

				break;

			case NgsNetGroupServDMO.ngsSequenceFilter:
				part.andFilterBy(queryArgs, "NgsSequence", dao
						.wildcardForAnySequence());

				break;

			case NgsNetGroupServDMO.ngsApplyTextFilter:
				part.andFilterBy(queryArgs, "NgsApplyText", dao
						.wildcardForAnySequence());

				break;

			case NgsNetGroupServDMO.ngsModifyTextFilter:
				part.andFilterBy(queryArgs, "NgsModifyText", dao
						.wildcardForAnySequence());

				break;

			case NgsNetGroupServDMO.ngsRemoveTextFilter:
				part.andFilterBy(queryArgs, "NgsRemoveText", dao
						.wildcardForAnySequence());

				break;

			case NgsNetGroupServDMO.ngsParamName1Filter:
				part.andFilterBy(queryArgs, "NgsParamName1", dao
						.wildcardForAnySequence());

				break;

			case NgsNetGroupServDMO.ngsParamValue1Filter:
				part.andFilterBy(queryArgs, "NgsParamValue1", dao
						.wildcardForAnySequence());

				break;

			case NgsNetGroupServDMO.ngsParamName2Filter:
				part.andFilterBy(queryArgs, "NgsParamName2", dao
						.wildcardForAnySequence());

				break;

			case NgsNetGroupServDMO.ngsParamValue2Filter:
				part.andFilterBy(queryArgs, "NgsParamValue2", dao
						.wildcardForAnySequence());

				break;

			case NgsNetGroupServDMO.ngsParamName3Filter:
				part.andFilterBy(queryArgs, "NgsParamName3", dao
						.wildcardForAnySequence());

				break;

			case NgsNetGroupServDMO.ngsParamValue3Filter:
				part.andFilterBy(queryArgs, "NgsParamValue3", dao
						.wildcardForAnySequence());

				break;

			case NgsNetGroupServDMO.ngsParamName4Filter:
				part.andFilterBy(queryArgs, "NgsParamName4", dao
						.wildcardForAnySequence());

				break;

			case NgsNetGroupServDMO.ngsParamValue4Filter:
				part.andFilterBy(queryArgs, "NgsParamValue4", dao
						.wildcardForAnySequence());

				break;

			case NgsNetGroupServDMO.ngsParamName5Filter:
				part.andFilterBy(queryArgs, "NgsParamName5", dao
						.wildcardForAnySequence());

				break;

			case NgsNetGroupServDMO.ngsParamValue5Filter:
				part.andFilterBy(queryArgs, "NgsParamValue5", dao
						.wildcardForAnySequence());

				break;
			}
		}

		return queryArgs;
	}

	/**
	 * Provides a DAOIterator to iterate over the list of NgsNetGroupServ
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
	 * NgsNetGroupServ records based on the passed in Filter.
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
	 * Retrieves the NgsNetGroupServ Data Model Object from a possible list.
	 * 
	 * @param filter
	 * @return
	 * @throws EPPIXSeriousException
	 */
	public NgsNetGroupServDMO get(QueryFilter filter)
			throws EPPIXSeriousException {
		logger.debug("get( filter )");

		DAOParamQueryArgs args = filterQueryArgs(filter, null);

		return (NgsNetGroupServDMO) dao.get(args.getDMLName(), args
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
