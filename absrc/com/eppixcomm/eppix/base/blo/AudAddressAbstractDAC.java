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

import com.eppixcomm.eppix.common.data.DAOIterator;
import com.eppixcomm.eppix.common.util.QueryFilter;
import com.eppixcomm.eppix.base.error.EPPIXObjectBusyException;
import com.eppixcomm.eppix.base.error.EPPIXObjectExpiredException;
import com.eppixcomm.eppix.base.error.EPPIXObjectNotFoundException;
import com.eppixcomm.eppix.base.error.EPPIXSeriousException;

/**
 * This is the standard implementation of the Data Access Controller for the
 * AudAddress Business Object.
 * 
 * @version $Revision: 1.2 $
 * @author $Author$
 * @since $jdk$
 */
public interface AudAddressAbstractDAC {
	// ~ Methods
	// ////////////////////////////////////////////////////////////////

	/**
	 * Retrieves a AudAddress Data Model Object
	 * 
	 * @return a populated AudAddress Data Model Object or null if not found.
	 * 
	 * @throws EPPIXSeriousException
	 */
	public AudAddressDMO get(AudAddressDMO audAddressDMO)
			throws EPPIXSeriousException;

	/**
	 * Creates the AudAddress object in the database.
	 * 
	 * @param AudAddressDMO
	 *            audAddressDMO
	 * 
	 * @throws EPPIXSeriousException
	 */
	public AudAddressDMO create(AudAddressDMO audAddressDMO)
			throws EPPIXSeriousException;

	/**
	 * Locks and retrieves the AudAddress object from the database.
	 * 
	 * @param aAudAddress
	 *            AudAddress object
	 * 
	 * @return a populated AudAddress object or null if not found.
	 * 
	 * @throws EPPIXSeriousException
	 */
	public AudAddressDMO lock(AudAddressDMO aAudAddressDMO)
			throws EPPIXSeriousException, EPPIXObjectBusyException;

	/**
	 * Modifies the AudAddress object in the database.
	 * 
	 * @param audAddressDMO
	 *            AudAddress object
	 * 
	 * @throws EPPIXSeriousException
	 * @throws EPPIXObjectExpiredException
	 * @throws EPPIXObjectNotFoundException
	 */
	public void modify(AudAddressDMO audAddressDMO)
			throws EPPIXSeriousException, EPPIXObjectExpiredException,
			EPPIXObjectNotFoundException;

	/**
	 * Deletes the AudAddress object from the database.
	 * 
	 * @param audAddressDMO
	 *            AudAddress object
	 * 
	 * @throws EPPIXSeriousException
	 * @throws EPPIXObjectNotFoundException
	 * @throws EPPIXObjectExpiredException
	 */
	public void delete(AudAddressDMO audAddressDMO)
			throws EPPIXSeriousException, EPPIXObjectNotFoundException,
			EPPIXObjectExpiredException;

	/**
	 * Deletes the AudAddress object from the database.
	 * 
	 * @param QueryFilter
	 *            filter object
	 * 
	 * @throws EPPIXSeriousException
	 * @throws EPPIXObjectNotFoundException
	 * @throws EPPIXObjectExpiredException
	 */
	public void delete(QueryFilter filter) throws EPPIXSeriousException,
			EPPIXObjectNotFoundException, EPPIXObjectExpiredException;

	/**
	 * Modifies the AudAddress object using the specified filter in the
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
			EPPIXObjectExpiredException, EPPIXObjectNotFoundException;

	/**
	 * Return true if a AudAddress object exists.
	 * 
	 * @param AudAddressDMO
	 *            audAddressDMO
	 * 
	 * @return true if the AudAddress object exists.
	 * 
	 * @throws EPPIXSeriousException
	 */
	public boolean exists(AudAddressDMO audAddressDMO)
			throws EPPIXSeriousException;

	/**
	 * Return true if a AudAddress object exists.
	 * 
	 * @param filter
	 * 
	 * @return true if the AudAddress object exists.
	 * 
	 * @throws EPPIXSeriousException
	 */
	public boolean exists(QueryFilter filter) throws EPPIXSeriousException;

	/**
	 * Return a list of location objects matching the passed in values. A
	 * partial match is performed on the description argument. If no language
	 * Code is passed inside the locationDMO then the language passed in the
	 * EppixLocale object is used.
	 * 
	 * @param state
	 *            previous state of the list.
	 * @param locationDMO
	 *            AudAddress Data Model Object
	 * 
	 * @return DTOList of AudAddress Data Model Objects.
	 * 
	 * @throws EPPIXSeriousException
	 */
	// public DTOList<AudAddressDMO> getList(
	// DTOListState state,
	// AudAddressDMO audAddressDMO )
	// throws EPPIXSeriousException;

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
	// public DTOList<AudAddressDMO> getList(
	// DTOListState state,
	// QueryFilter filter )
	// throws EPPIXSeriousException;

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
	public DAOIterator iterate(QueryFilter filter) throws EPPIXSeriousException;

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
	public DAOIterator iterateWithLock(QueryFilter filter)
			throws EPPIXSeriousException;

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
	public AudAddressDMO get(QueryFilter filter) throws EPPIXSeriousException;

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
	public Object max(QueryFilter filter) throws EPPIXSeriousException;

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
	public Object min(QueryFilter filter) throws EPPIXSeriousException;

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
	public int count(QueryFilter filter) throws EPPIXSeriousException;

	public AudAddressDMO getUniqueAudByMaxId(String accountNumber, String addressType)
			throws EPPIXSeriousException;
}
