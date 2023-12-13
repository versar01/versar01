package com.eppixcomm.eppix.base.blo;

import com.eppixcomm.eppix.base.error.EPPIXObjectBusyException;
import com.eppixcomm.eppix.base.error.EPPIXObjectExpiredException;
import com.eppixcomm.eppix.base.error.EPPIXObjectNotFoundException;
import com.eppixcomm.eppix.base.error.EPPIXSeriousException;
import com.eppixcomm.eppix.common.data.DAOIterator;
import com.eppixcomm.eppix.common.util.QueryFilter;

public interface SdrServDepoRuleAbstractDAC {

	  public SdrServDepoRuleDMO get( SdrServDepoRuleDMO sdrServDepoRuleDMO )
	    throws EPPIXSeriousException;

	  /**
	   * Creates the sdrServDepoRule object in the database.
	   *
	   * @param SdrServDepoRuleDMO sdrServDepoRuleDMO
	   *
	   * @throws EPPIXSeriousException
	   */
	  public void create( SdrServDepoRuleDMO sdrServDepoRuleDMO )
	    throws EPPIXSeriousException;

//	  /**
//	   * Locks and retrieves the sdrServDepoRule object from the database.
//	   *
//	   * @param asdrServDepoRule sdrServDepoRule object
//	   *
//	   * @return a populated sdrServDepoRule object or null if not found.
//	   *
//	   * @throws EPPIXSeriousException
//	   */
//	  public SdrServDepoRuleDMO lock( SdrServDepoRuleDMO aSdrServDepoRuleDMO )
//	    throws EPPIXSeriousException, EPPIXObjectBusyException;

	  /**
	   * Modifies the sdrServDepoRule object in the database.
	   *
	   * @param sdrServDepoRuleDMO sdrServDepoRule object
	   *
	   * @throws EPPIXSeriousException
	   * @throws EPPIXObjectExpiredException
	   * @throws EPPIXObjectNotFoundException
	   */
	  public void modify( SdrServDepoRuleDMO sdrServDepoRuleDMO )
	    throws EPPIXSeriousException, EPPIXObjectExpiredException,
	      EPPIXObjectNotFoundException;

	  /**
	   * Deletes the sdrServDepoRule object from the database.
	   *
	   * @param sdrServDepoRuleDMO sdrServDepoRule object
	   *
	   * @throws EPPIXSeriousException
	   * @throws EPPIXObjectNotFoundException
	   * @throws EPPIXObjectExpiredException
	   */
	  public void delete( SdrServDepoRuleDMO sdrServDepoRuleDMO )
	    throws EPPIXSeriousException, EPPIXObjectNotFoundException,
	      EPPIXObjectExpiredException;

	  /**
	   * Deletes the sdrServDepoRule object from the database.
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
	   * Modifies the sdrServDepoRule object using the specified filter in the database.
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
	  * Return true if a sdrServDepoRule object exists.
	  *
	  * @param SdrServDepoRuleDMO sdrServDepoRuleDMO
	  *
	  * @return true if the sdrServDepoRule object exists.
	  *
	  * @throws EPPIXSeriousException
	  */
	  public boolean exists( SdrServDepoRuleDMO sdrServDepoRuleDMO )
	    throws EPPIXSeriousException;

	  /**
	    * Return true if a sdrServDepoRule object exists.
	    *
	    * @param filter
	    *
	    * @return true if the sdrServDepoRule object exists.
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
	   * @param locationDMO sdrServDepoRule Data Model Object
	   *
	   * @return DTOList of sdrServDepoRule Data Model Objects.
	   *
	   * @throws EPPIXSeriousException
	   */
	//  public DTOList<SdrServDepoRuleDMO> getList( 
//	    DTOListState  state,
//	    SdrServDepoRuleDMO sdrServDepoRuleDMO )
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
	//  public DTOList<SdrServDepoRuleDMO> getList( 
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
	  public SdrServDepoRuleDMO get( QueryFilter filter )
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
