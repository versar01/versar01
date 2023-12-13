package com.eppixcomm.eppix.base.blo;

import com.eppixcomm.eppix.base.error.EPPIXObjectExpiredException;
import com.eppixcomm.eppix.base.error.EPPIXObjectNotFoundException;
import com.eppixcomm.eppix.base.error.EPPIXSeriousException;
import com.eppixcomm.eppix.common.data.DAOIterator;
import com.eppixcomm.eppix.common.util.QueryFilter;



public interface EarEpxactionArchAbstractDAC{

//	  public EarEpxactionArchDMO get( EarEpxactionArchDMO earEpxactionArchDMO )
//	    throws EPPIXSeriousException;

	  /**
	   * Creates the EarEpxactionArchAbstract object in the database.
	   *
	   * @param EarEpxactionArchDMO EarEpxactionArchDMO
	   *
	   * @throws EPPIXSeriousException
	   */
	  public void create( EarEpxactionArchDMO earEpxactionArchDMO )
	    throws EPPIXSeriousException;


	  /**
	   * Modifies the EarEpxactionArchAbstract object in the database.
	   *
	   * @param EarEpxactionArchDMO EarEpxactionArchAbstract object
	   *
	   * @throws EPPIXSeriousException
	   * @throws EPPIXObjectExpiredException
	   * @throws EPPIXObjectNotFoundException
	   */
//	  public void modify( EarEpxactionArchDMO earEpxactionArchDMO )
//	    throws EPPIXSeriousException, EPPIXObjectExpiredException,
//	      EPPIXObjectNotFoundException;

	  /**
	   * Deletes the EarEpxactionArchAbstract object from the database.
	   *
	   * @param EarEpxactionArchDMO EarEpxactionArchAbstract object
	   *
	   * @throws EPPIXSeriousException
	   * @throws EPPIXObjectNotFoundException
	   * @throws EPPIXObjectExpiredException
	   */
//	  public void delete( EarEpxactionArchDMO earEpxactionArchDMO )
//	    throws EPPIXSeriousException, EPPIXObjectNotFoundException,
//	      EPPIXObjectExpiredException;

	  /**
	   * Deletes the EarEpxactionArchAbstract object from the database.
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
	   * Modifies the EarEpxactionArchAbstract object using the specified filter in the database.
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
	  * Return true if a EarEpxactionArchAbstract object exists.
	  *
	  * @param EarEpxactionArchDMO EarEpxactionArchDMO
	  *
	  * @return true if the EarEpxactionArchAbstract object exists.
	  *
	  * @throws EPPIXSeriousException
	  */
//	  public boolean exists( EarEpxactionArchDMO earEpxactionArchDMO )
//	    throws EPPIXSeriousException;

	  /**
	    * Return true if a EarEpxactionArchAbstract object exists.
	    *
	    * @param filter
	    *
	    * @return true if the EarEpxactionArchAbstract object exists.
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
	   * @param locationDMO EarEpxactionArchAbstract Data Model Object
	   *
	   * @return DTOList of EarEpxactionArchAbstract Data Model Objects.
	   *
	   * @throws EPPIXSeriousException
	   */
	//  public DTOList<EarEpxactionArchDMO> getList( 
//	    DTOListState  state,
//	    EarEpxactionArchDMO EarEpxactionArchDMO )
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
	//  public DTOList<EarEpxactionArchDMO> getList( 
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
	  public EarEpxactionArchDMO get( QueryFilter filter )
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
