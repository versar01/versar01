package com.eppixcomm.eppix.base.blo;

import com.eppixcomm.eppix.common.data.DAOIterator;
import com.eppixcomm.eppix.common.util.QueryFilter;
import com.eppixcomm.eppix.common.data.DTOList;
import com.eppixcomm.eppix.common.data.DTOListState;
import com.eppixcomm.eppix.base.error.EPPIXObjectBusyException;
import com.eppixcomm.eppix.base.error.EPPIXObjectExpiredException;
import com.eppixcomm.eppix.base.error.EPPIXObjectNotFoundException;
import com.eppixcomm.eppix.base.error.EPPIXSeriousException;

public interface AneApnNonEppixAbstractDAC{
	
	  public AneApnNonEppixDMO get( AneApnNonEppixDMO aneApnNonEppixDMO )
	    throws EPPIXSeriousException;

	  /**
	   * Creates the AuxCustomers object in the database.
	   *
	   * @param AneApnNonEppixDMO auxCustomersDMO
	   *
	   * @throws EPPIXSeriousException
	   */
	  
	  public DTOList getList( 
	    DTOListState        state,
	    AneApnNonEppixDMO aneApnNonEppixDMO )
	    throws EPPIXSeriousException;
	
	  public DTOList getList( 
	    DTOListState state,
	    QueryFilter  filter )
	    throws EPPIXSeriousException;
	  
	  public void create( AneApnNonEppixDMO auxCustomersDMO )
	    throws EPPIXSeriousException;

	  /**
	   * Locks and retrieves the AneApnNonEppix object from the database.
	   *
	   * @param aAneApnNonEppix AneApnNonEppix object
	   *
	   * @return a populated AneApnNonEppix object or null if not found.
	   *
	   * @throws EPPIXSeriousException
	   */
	  public AneApnNonEppixDMO lock( AneApnNonEppixDMO aAneApnNonEppixDMO )
	    throws EPPIXSeriousException, EPPIXObjectBusyException;

	  /**
	   * Modifies the AneApnNonEppix object in the database.
	   *
	   * @param auxCustomersDMO AneApnNonEppix object
	   *
	   * @throws EPPIXSeriousException
	   * @throws EPPIXObjectExpiredException
	   * @throws EPPIXObjectNotFoundException
	   */
	  public void modify( AneApnNonEppixDMO auxCustomersDMO )
	    throws EPPIXSeriousException, EPPIXObjectExpiredException,
	      EPPIXObjectNotFoundException;

	  /**
	   * Deletes the AneApnNonEppix object from the database.
	   *
	   * @param auxCustomersDMO AneApnNonEppix object
	   *
	   * @throws EPPIXSeriousException
	   * @throws EPPIXObjectNotFoundException
	   * @throws EPPIXObjectExpiredException
	   */
	  public void delete( AneApnNonEppixDMO auxCustomersDMO )
	    throws EPPIXSeriousException, EPPIXObjectNotFoundException,
	      EPPIXObjectExpiredException;

	  /**
	   * Deletes the AneApnNonEppix object from the database.
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
	   * Modifies the AneApnNonEppix object using the specified filter in the database.
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
	  * Return true if a AneApnNonEppix object exists.
	  *
	  * @param AneApnNonEppixDMO auxCustomersDMO
	  *
	  * @return true if the AneApnNonEppix object exists.
	  *
	  * @throws EPPIXSeriousException
	  */
	  public boolean exists( AneApnNonEppixDMO auxCustomersDMO )
	    throws EPPIXSeriousException;

	  /**
	    * Return true if a AneApnNonEppix object exists.
	    *
	    * @param filter
	    *
	    * @return true if the AneApnNonEppix object exists.
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
	   * @param locationDMO AneApnNonEppix Data Model Object
	   *
	   * @return DTOList of AneApnNonEppix Data Model Objects.
	   *
	   * @throws EPPIXSeriousException
	   */
//	  public DTOList<AneApnNonEppixDMO> getList( 
//	    DTOListState    state,
//	    AneApnNonEppixDMO auxCustomersDMO )
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
//	  public DTOList<AneApnNonEppixDMO> getList( 
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
	  public AneApnNonEppixDMO get( QueryFilter filter )
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