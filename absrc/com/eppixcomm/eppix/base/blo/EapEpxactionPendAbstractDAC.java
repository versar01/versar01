package com.eppixcomm.eppix.base.blo;

import com.eppixcomm.eppix.base.dml.EapEpxactionPendAbstractDMLFactory;
import com.eppixcomm.eppix.base.error.EPPIXObjectBusyException;
import com.eppixcomm.eppix.base.error.EPPIXObjectExpiredException;
import com.eppixcomm.eppix.base.error.EPPIXObjectNotFoundException;
import com.eppixcomm.eppix.base.error.EPPIXSeriousException;
import com.eppixcomm.eppix.common.data.DAOIterator;
import com.eppixcomm.eppix.common.util.QueryFilter;

public interface EapEpxactionPendAbstractDAC {

	  public EapEpxactionPendDMO get( EapEpxactionPendDMO eapEpxactionPendDMO )
	    throws EPPIXSeriousException;

	  /**
	   * Creates the EapEpxactionPendAbstract object in the database.
	   *
	   * @param EapEpxactionPendDMO EapEpxactionPendDMO
	   *
	   * @throws EPPIXSeriousException
	   */
	  public void create( EapEpxactionPendDMO eapEpxactionPendDMO )
	    throws EPPIXSeriousException;


	  /**
	   * Modifies the EapEpxactionPendAbstract object in the database.
	   *
	   * @param EapEpxactionPendDMO EapEpxactionPendAbstract object
	   *
	   * @throws EPPIXSeriousException
	   * @throws EPPIXObjectExpiredException
	   * @throws EPPIXObjectNotFoundException
	   */
	  public void modify( EapEpxactionPendDMO eapEpxactionPendDMO )
	    throws EPPIXSeriousException, EPPIXObjectExpiredException,
	      EPPIXObjectNotFoundException;

	  /**
	   * Deletes the EapEpxactionPendAbstract object from the database.
	   *
	   * @param EapEpxactionPendDMO EapEpxactionPendAbstract object
	   *
	   * @throws EPPIXSeriousException
	   * @throws EPPIXObjectNotFoundException
	   * @throws EPPIXObjectExpiredException
	   */
	  public void delete( EapEpxactionPendDMO eapEpxactionPendDMO )
	    throws EPPIXSeriousException, EPPIXObjectNotFoundException,
	      EPPIXObjectExpiredException;

	  /**
	   * Deletes the EapEpxactionPendAbstract object from the database.
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
	   * Modifies the EapEpxactionPendAbstract object using the specified filter in the database.
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
	  * Return true if a EapEpxactionPendAbstract object exists.
	  *
	  * @param EapEpxactionPendDMO EapEpxactionPendDMO
	  *
	  * @return true if the EapEpxactionPendAbstract object exists.
	  *
	  * @throws EPPIXSeriousException
	  */
	  public boolean exists( EapEpxactionPendDMO eapEpxactionPendDMO )
	    throws EPPIXSeriousException;

	  /**
	    * Return true if a EapEpxactionPendAbstract object exists.
	    *
	    * @param filter
	    *
	    * @return true if the EapEpxactionPendAbstract object exists.
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
	   * @param locationDMO EapEpxactionPendAbstract Data Model Object
	   *
	   * @return DTOList of EapEpxactionPendAbstract Data Model Objects.
	   *
	   * @throws EPPIXSeriousException
	   */
	//  public DTOList<EapEpxactionPendDMO> getList( 
//	    DTOListState  state,
//	    EapEpxactionPendDMO EapEpxactionPendDMO )
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
	//  public DTOList<EapEpxactionPendDMO> getList( 
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
	  public EapEpxactionPendDMO get( QueryFilter filter )
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
