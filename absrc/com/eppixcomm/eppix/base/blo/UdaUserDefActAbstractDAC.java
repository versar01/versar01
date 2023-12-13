package com.eppixcomm.eppix.base.blo;

import com.eppixcomm.eppix.base.error.EPPIXObjectBusyException;
import com.eppixcomm.eppix.base.error.EPPIXObjectExpiredException;
import com.eppixcomm.eppix.base.error.EPPIXObjectNotFoundException;
import com.eppixcomm.eppix.base.error.EPPIXSeriousException;
import com.eppixcomm.eppix.common.data.DAOIterator;
import com.eppixcomm.eppix.common.util.QueryFilter;

public interface UdaUserDefActAbstractDAC {

	  public UdaUserDefActDMO get( UdaUserDefActDMO udaUserDefActDMO )
	    throws EPPIXSeriousException;

	  /**
	   * Creates the udaUserDefAct object in the database.
	   *
	   * @param UdaUserDefActDMO udaUserDefActDMO
	   *
	   * @throws EPPIXSeriousException
	   */
	  public void create( UdaUserDefActDMO udaUserDefActDMO )
	    throws EPPIXSeriousException;

//	  /**
//	   * Locks and retrieves the udaUserDefAct object from the database.
//	   *
//	   * @param audaUserDefAct udaUserDefAct object
//	   *
//	   * @return a populated udaUserDefAct object or null if not found.
//	   *
//	   * @throws EPPIXSeriousException
//	   */
//	  public UdaUserDefActDMO lock( UdaUserDefActDMO aUdaUserDefActDMO )
//	    throws EPPIXSeriousException, EPPIXObjectBusyException;

	  /**
	   * Modifies the udaUserDefAct object in the database.
	   *
	   * @param udaUserDefActDMO udaUserDefAct object
	   *
	   * @throws EPPIXSeriousException
	   * @throws EPPIXObjectExpiredException
	   * @throws EPPIXObjectNotFoundException
	   */
	  public void modify( UdaUserDefActDMO udaUserDefActDMO )
	    throws EPPIXSeriousException, EPPIXObjectExpiredException,
	      EPPIXObjectNotFoundException;

	  /**
	   * Deletes the udaUserDefAct object from the database.
	   *
	   * @param udaUserDefActDMO udaUserDefAct object
	   *
	   * @throws EPPIXSeriousException
	   * @throws EPPIXObjectNotFoundException
	   * @throws EPPIXObjectExpiredException
	   */
	  public void delete( UdaUserDefActDMO udaUserDefActDMO )
	    throws EPPIXSeriousException, EPPIXObjectNotFoundException,
	      EPPIXObjectExpiredException;

	  /**
	   * Deletes the udaUserDefAct object from the database.
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
	   * Modifies the udaUserDefAct object using the specified filter in the database.
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
	  * Return true if a udaUserDefAct object exists.
	  *
	  * @param UdaUserDefActDMO udaUserDefActDMO
	  *
	  * @return true if the udaUserDefAct object exists.
	  *
	  * @throws EPPIXSeriousException
	  */
	  public boolean exists( UdaUserDefActDMO udaUserDefActDMO )
	    throws EPPIXSeriousException;

	  /**
	    * Return true if a udaUserDefAct object exists.
	    *
	    * @param filter
	    *
	    * @return true if the udaUserDefAct object exists.
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
	   * @param locationDMO udaUserDefAct Data Model Object
	   *
	   * @return DTOList of udaUserDefAct Data Model Objects.
	   *
	   * @throws EPPIXSeriousException
	   */
	//  public DTOList<UdaUserDefActDMO> getList( 
//	    DTOListState  state,
//	    UdaUserDefActDMO udaUserDefActDMO )
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
	//  public DTOList<UdaUserDefActDMO> getList( 
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
	  public UdaUserDefActDMO get( QueryFilter filter )
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
