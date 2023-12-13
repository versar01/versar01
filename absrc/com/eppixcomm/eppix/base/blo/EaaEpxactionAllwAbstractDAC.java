package com.eppixcomm.eppix.base.blo;

import com.eppixcomm.eppix.base.error.EPPIXObjectBusyException;
import com.eppixcomm.eppix.base.error.EPPIXObjectExpiredException;
import com.eppixcomm.eppix.base.error.EPPIXObjectNotFoundException;
import com.eppixcomm.eppix.base.error.EPPIXSeriousException;
import com.eppixcomm.eppix.common.data.DAOIterator;
import com.eppixcomm.eppix.common.util.QueryFilter;

public interface EaaEpxactionAllwAbstractDAC {

	  public EaaEpxactionAllwDMO get( EaaEpxactionAllwDMO eaaEpxactionAllwDMO )
	    throws EPPIXSeriousException;

	  /**
	   * Creates the EaaEpxactionAllw object in the database.
	   *
	   * @param EaaEpxactionAllwDMO eaaEpxactionAllwDMO
	   *
	   * @throws EPPIXSeriousException
	   */
	  public void create( EaaEpxactionAllwDMO eaaEpxactionAllwDMO )
	    throws EPPIXSeriousException;

//	  /**
//	   * Locks and retrieves the EaaEpxactionAllw object from the database.
//	   *
//	   * @param aEaaEpxactionAllw EaaEpxactionAllw object
//	   *
//	   * @return a populated EaaEpxactionAllw object or null if not found.
//	   *
//	   * @throws EPPIXSeriousException
//	   */
//	  public EaaEpxactionAllwDMO lock( EaaEpxactionAllwDMO aEaaEpxactionAllwDMO )
//	    throws EPPIXSeriousException, EPPIXObjectBusyException;

	  /**
	   * Modifies the EaaEpxactionAllw object in the database.
	   *
	   * @param eaaEpxactionAllwDMO EaaEpxactionAllw object
	   *
	   * @throws EPPIXSeriousException
	   * @throws EPPIXObjectExpiredException
	   * @throws EPPIXObjectNotFoundException
	   */
	  public void modify( EaaEpxactionAllwDMO eaaEpxactionAllwDMO )
	    throws EPPIXSeriousException, EPPIXObjectExpiredException,
	      EPPIXObjectNotFoundException;

	  /**
	   * Deletes the EaaEpxactionAllw object from the database.
	   *
	   * @param eaaEpxactionAllwDMO EaaEpxactionAllw object
	   *
	   * @throws EPPIXSeriousException
	   * @throws EPPIXObjectNotFoundException
	   * @throws EPPIXObjectExpiredException
	   */
	  public void delete( EaaEpxactionAllwDMO eaaEpxactionAllwDMO )
	    throws EPPIXSeriousException, EPPIXObjectNotFoundException,
	      EPPIXObjectExpiredException;

	  /**
	   * Deletes the EaaEpxactionAllw object from the database.
	   *
	   * @param QueryFilter filter object
	   *
	   * @throws EPPIXSeriousException
	   * @throws EPPIXObjectNotFoundException
	   * @throws EPPIXObjectExpiredException
	   */
	  public void delete( QueryFilter filter )
	    throws EPPIXSeriousException, EPPIXObjectNotFoundException,
	      EPPIXObjectExpiredException;

	  /**
	   * Modifies the EaaEpxactionAllw object using the specified filter in the database.
	   *
	   * @param filter object
	   *
	   * @throws EPPIXSeriousException
	   * @throws EPPIXObjectExpiredException
	   * @throws EPPIXObjectNotFoundException
	   */
	  public void modify( QueryFilter filter )
	    throws EPPIXSeriousException, EPPIXObjectExpiredException,
	      EPPIXObjectNotFoundException;

	  /**
	  * Return true if a EaaEpxactionAllw object exists.
	  *
	  * @param EaaEpxactionAllwDMO eaaEpxactionAllwDMO
	  *
	  * @return true if the EaaEpxactionAllw object exists.
	  *
	  * @throws EPPIXSeriousException
	  */
	  public boolean exists( EaaEpxactionAllwDMO eaaEpxactionAllwDMO )
	    throws EPPIXSeriousException;

	  /**
	    * Return true if a EaaEpxactionAllw object exists.
	    *
	    * @param filter
	    *
	    * @return true if the EaaEpxactionAllw object exists.
	    *
	    * @throws EPPIXSeriousException
	    */
	  public boolean exists( QueryFilter filter )
	    throws EPPIXSeriousException;

	  /**
	   * Return a list of location objects matching the passed in values. A
	   * partial match is performed on the description argument. If no language
	   * Code is passed inside the locationDMO then the language passed in the
	   * EppixLocale object is used.
	   *
	   * @param state previous state of the list.
	   * @param locationDMO EaaEpxactionAllw Data Model Object
	   *
	   * @return DTOList of EaaEpxactionAllw Data Model Objects.
	   *
	   * @throws EPPIXSeriousException
	   */
	//  public DTOList<EaaEpxactionAllwDMO> getList( 
//	    DTOListState  state,
//	    EaaEpxactionAllwDMO eaaEpxactionAllwDMO )
//	    throws EPPIXSeriousException;

	  /**
	   * DOCUMENT ME!
	   *
	   * @param state DOCUMENT ME!
	   * @param filter DOCUMENT ME!
	   *
	   * @return DOCUMENT ME!
	   *
	   * @throws EPPIXSeriousException DOCUMENT ME!
	   */
	//  public DTOList<EaaEpxactionAllwDMO> getList( 
//	    DTOListState state,
//	    QueryFilter  filter )
//	    throws EPPIXSeriousException;

	  /**
	   * DOCUMENT ME!
	   *
	   * @param filter DOCUMENT ME!
	   *
	   * @return DOCUMENT ME!
	   *
	   * @throws EPPIXSeriousException DOCUMENT ME!
	   */
	  public DAOIterator iterate( QueryFilter filter )
	    throws EPPIXSeriousException;

	  /**
	   * DOCUMENT ME!
	   *
	   * @param filter DOCUMENT ME!
	   *
	   * @return DOCUMENT ME!
	   *
	   * @throws EPPIXSeriousException DOCUMENT ME!
	   */
	  public DAOIterator iterateWithLock( QueryFilter filter )
	    throws EPPIXSeriousException;

	  /**
	   * DOCUMENT ME!
	   *
	   * @param filter DOCUMENT ME!
	   *
	   * @return DOCUMENT ME!
	   *
	   * @throws EPPIXSeriousException DOCUMENT ME!
	   */
	  public EaaEpxactionAllwDMO get( QueryFilter filter )
	    throws EPPIXSeriousException;

	  /**
	   * DOCUMENT ME!
	   *
	   * @param filter DOCUMENT ME!
	   *
	   * @return DOCUMENT ME!
	   *
	   * @throws EPPIXSeriousException DOCUMENT ME!
	   */
	  public Object max( QueryFilter filter )
	    throws EPPIXSeriousException;

	  /**
	   * DOCUMENT ME!
	   *
	   * @param filter DOCUMENT ME!
	   *
	   * @return DOCUMENT ME!
	   *
	   * @throws EPPIXSeriousException DOCUMENT ME!
	   */
	  public Object min( QueryFilter filter )
	    throws EPPIXSeriousException;

	  /**
	   * DOCUMENT ME!
	   *
	   * @param filter DOCUMENT ME!
	   *
	   * @return DOCUMENT ME!
	   *
	   * @throws EPPIXSeriousException DOCUMENT ME!
	   */
	  public int count( QueryFilter filter )
	    throws EPPIXSeriousException;
	}

