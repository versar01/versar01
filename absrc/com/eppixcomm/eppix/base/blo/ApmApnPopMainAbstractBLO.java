package com.eppixcomm.eppix.base.blo;

import org.apache.log4j.Logger;

import com.eppixcomm.eppix.common.data.DAC;
import com.eppixcomm.eppix.common.data.DAOIterator;
import com.eppixcomm.eppix.common.util.QueryFilter;
import com.eppixcomm.eppix.common.data.DTOActionTypes;
import com.eppixcomm.eppix.common.data.DTOList;
import com.eppixcomm.eppix.common.data.DTOListState;
import com.eppixcomm.eppix.base.error.EPPIXBusinessException;
import com.eppixcomm.eppix.base.error.EPPIXFatalException;
import com.eppixcomm.eppix.base.error.EPPIXUnexpectedException;
import com.eppixcomm.eppix.base.error.Thrower;

public class ApmApnPopMainAbstractBLO extends BaseBLO implements DTOActionTypes,
		BaseMessages {

	protected ApmApnPopMainAbstractDAC apmApnPopMainDAC;

	static Thrower thrower = Thrower.getThrower(AneApnNonEppixAbstractBLO.class);

	protected Logger logger = thrower.getLogger();

	protected void setDAC(DAC dac) {
		// TODO Auto-generated method stub
		this.apmApnPopMainDAC = (ApmApnPopMainAbstractDAC) dac;
	}

	protected Class getDACClass() {
		return ApmApnPopMainAbstractDAC.class;
	}

	// ===========================================================================================
	public DTOList getList(DTOListState state, ApmApnPopMainDMO apmApnPopMainDMO)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("getList( state, apmApnPopMainDMO )");

		return apmApnPopMainDAC.getList(state, apmApnPopMainDMO);
	}

	/**
	 * Creates the EdEventDepends object. As a side effect, following creation
	 * of a EdEventDepends an audit object may be created.
	 * <p>
	 * <B>Possible application exceptions:</B>
	 * <dl>
	 * <dd>
	 * <li>The normal general errors:
	 * {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>
	 * </dd>
	 * </dl>
	 * <br>
	 * 
	 * @param ApmApnPopMainDMO
	 *            ApmApnPopMainDMO object<br>
	 *            <dl>
	 *            <dd> </dd>
	 *            </dl>
	 *            <br>
	 * 
	 * @return populated ApmApnPopMainDMO object.
	 * 
	 * @throws EPPIXBusinessException
	 * @throws EPPIXUnexpectedException
	 * @throws EPPIXFatalException
	 */
	public ApmApnPopMainDMO create(ApmApnPopMainDMO apmApnPopMainDMO)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("create( apmApnPopMainDMO )");

		thrower.ifParameterMissing("ApmApnPopMainDMO", apmApnPopMainDMO);

		thrower.ifParameterMissing("ApmApnPopMainDMO.apmType()",
				apmApnPopMainDMO.getApmType());

		thrower.ifParameterMissing("ApmApnPopMainDMO.apmId", apmApnPopMainDMO
				.getApmId());

		thrower.ifParameterMissing("ApmApnPopMainDMO.apmName", apmApnPopMainDMO
				.getApmName());

		thrower.ifParameterMissing("ApmApnPopMainDMO.apmBillMethod",
				apmApnPopMainDMO.getApmBillMethod());

		thrower.ifParameterMissing("ApmApnPopMainDMO.apmMsisdn",
				apmApnPopMainDMO.getApmMsisdn());

		thrower.ifParameterMissing("ApmApnPopMainDMO.apmAssigned",
				apmApnPopMainDMO.getApmAssigned());

		thrower.ifParameterMissing("ApmApnPopMainDMO.apmActive",
				apmApnPopMainDMO.getApmActive());

		thrower.ifParameterMissing("ApmApnPopMainDMO.apmWdp", apmApnPopMainDMO
				.getApmWdp());
		//
		// Now create ....
		//
		apmApnPopMainDAC.create(apmApnPopMainDMO);

		return apmApnPopMainDMO;
	}

	/**
	 * Modifies the EdEventDepends object.
	 * <p>
	 * <B>Possible application exceptions:</B>
	 * <dl>
	 * <dd>
	 * <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#ECEVENTCOMMAND_002}</li>
	 * <li>The normal general errors:
	 * {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>
	 * </dd>
	 * </dl>
	 * <br>
	 * 
	 * @param AneApnNonEppixDMO
	 *            object<br>
	 * @param filter
	 *            object<br>
	 *            <dl>
	 *            <dd> </dd>
	 *            </dl>
	 *            <br>
	 * 
	 * @return populated AneApnNonEppixDMO object.
	 * 
	 * @throws EPPIXBusinessException
	 * @throws EPPIXUnexpectedException
	 * @throws EPPIXFatalException
	 */
	public void modify(QueryFilter filter) throws EPPIXBusinessException,
			EPPIXUnexpectedException, EPPIXFatalException {
		logger.debug("modify( filter )");

		//
		// Modify the AneApnNonEppixDMO
		//
		apmApnPopMainDAC.modify(filter);
	}

	/**
	 * Deletes the EdEventDepends object.
	 * <p>
	 * <B>Possible application exceptions:</B>
	 * <dl>
	 * <dd>
	 * <li>The normal general errors:
	 * {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>
	 * </dd>
	 * </dl>
	 * 
	 * @param QueryFilter
	 *            filter.
	 * 
	 * @throws EPPIXBusinessException
	 * @throws EPPIXUnexpectedException
	 * @throws EPPIXFatalException
	 */
	public void delete(QueryFilter filter) throws EPPIXBusinessException,
			EPPIXUnexpectedException, EPPIXFatalException {
		logger.debug("delete( filter )");

		thrower.ifParameterMissing("filter", filter);

		// delete...
		apmApnPopMainDAC.delete(filter);
	}

	/**
	 * Indicates whether a EdEventDepends exists in the database
	 * <p>
	 * <B>Possible application exceptions:</B>
	 * <dl>
	 * <dd>
	 * <li>The normal general errors:
	 * {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>
	 * </dd>
	 * </dl>
	 * 
	 * 
	 * @return true if the EdEventDepends exists in the database
	 * 
	 * @throws EPPIXBusinessException
	 * @throws EPPIXUnexpectedException
	 * @throws EPPIXFatalException
	 */
	public boolean exists(QueryFilter filter) throws EPPIXBusinessException,
			EPPIXUnexpectedException, EPPIXFatalException {
		logger.debug("exists(filter)");

		return apmApnPopMainDAC.exists(filter);
	}

	// ---------------------------------------------------------------------------------------------------------
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
	 * @throws EPPIXBusinessException
	 *             DOCUMENT ME!
	 * @throws EPPIXUnexpectedException
	 *             DOCUMENT ME!
	 * @throws EPPIXFatalException
	 *             DOCUMENT ME!
	 */
	public DTOList getList(DTOListState state, QueryFilter filter)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("getList( state, filter )");

		return apmApnPopMainDAC.getList(state, filter);
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @param filter
	 *            DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 * 
	 * @throws EPPIXBusinessException
	 *             DOCUMENT ME!
	 * @throws EPPIXUnexpectedException
	 *             DOCUMENT ME!
	 * @throws EPPIXFatalException
	 *             DOCUMENT ME!
	 */
	public DAOIterator iterate(QueryFilter filter)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("iterate( filter )");

		return apmApnPopMainDAC.iterate(filter);
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @param filter
	 *            DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 * 
	 * @throws EPPIXBusinessException
	 *             DOCUMENT ME!
	 * @throws EPPIXUnexpectedException
	 *             DOCUMENT ME!
	 * @throws EPPIXFatalException
	 *             DOCUMENT ME!
	 */
	public DAOIterator iterateWithLock(QueryFilter filter)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("iterateWithLock( filter )");

		return apmApnPopMainDAC.iterateWithLock(filter);
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @param filter
	 *            DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 * 
	 * @throws EPPIXBusinessException
	 *             DOCUMENT ME!
	 * @throws EPPIXUnexpectedException
	 *             DOCUMENT ME!
	 * @throws EPPIXFatalException
	 *             DOCUMENT ME!
	 */
	public ApmApnPopMainDMO get(QueryFilter filter)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("get( filter )");

		//
		// Check mandatory parameters.
		//
		thrower.ifParameterMissing("filter", filter);

		//
		// Attempt to get the AneApnNonEppixDMO
		//
		ApmApnPopMainDMO apmApnPopMainDMO = apmApnPopMainDAC.get(filter);

		return apmApnPopMainDMO;
	}

	public ApmApnPopMainDMO get(ApmApnPopMainDMO apMainDMO)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("get( apMainDMO )");

		thrower.ifParameterMissing("ApmApnPopMainDMO", apMainDMO);

		ApmApnPopMainDMO apmApnPopMainDMO = apmApnPopMainDAC.get(apMainDMO);

		return apmApnPopMainDMO;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @param filter
	 *            DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 * 
	 * @throws EPPIXBusinessException
	 *             DOCUMENT ME!
	 * @throws EPPIXUnexpectedException
	 *             DOCUMENT ME!
	 * @throws EPPIXFatalException
	 *             DOCUMENT ME!
	 */
	public Object max(QueryFilter filter) throws EPPIXBusinessException,
			EPPIXUnexpectedException, EPPIXFatalException {
		logger.debug("max( filter )");

		//
		// Check mandatory parameters.
		//
		thrower.ifParameterMissing("filter", filter);

		return apmApnPopMainDAC.max(filter);
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @param filter
	 *            DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 * 
	 * @throws EPPIXBusinessException
	 *             DOCUMENT ME!
	 * @throws EPPIXUnexpectedException
	 *             DOCUMENT ME!
	 * @throws EPPIXFatalException
	 *             DOCUMENT ME!
	 */
	public Object min(QueryFilter filter) throws EPPIXBusinessException,
			EPPIXUnexpectedException, EPPIXFatalException {
		logger.debug("min( filter )");

		//
		// Check mandatory parameters.
		//
		thrower.ifParameterMissing("filter", filter);

		return apmApnPopMainDAC.min(filter);
	}

	/**
	 * Counts the number of rows for the specified filter.
	 * 
	 * @param filter
	 *            the query filter
	 * @return the count of rows.
	 * 
	 * @throws EPPIXBusinessException
	 * @throws EPPIXUnexpectedException
	 * @throws EPPIXFatalException
	 */
	public Integer count(QueryFilter filter) throws EPPIXBusinessException,
			EPPIXUnexpectedException, EPPIXFatalException {
		logger.debug("count( filter )");

		//
		// Check mandatory parameters.
		//
		thrower.ifParameterMissing("filter", filter);

		// return Integer.valueOf(apmApnPopMainDAC.count(filter));
		// Narayana Sai - 25/07/2008 - Code should Compatible with 1.4 as per MTN Standards
		return new Integer(apmApnPopMainDAC.count(filter));
	}

	// =============================================================================

}
