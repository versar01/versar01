package com.eppixcomm.eppix.base.blo;

import com.eppixcomm.eppix.common.data.DAOIterator;
import com.eppixcomm.eppix.common.util.QueryFilter;
import com.eppixcomm.eppix.common.data.DTOList;
import com.eppixcomm.eppix.common.data.DTOListState;
import com.eppixcomm.eppix.base.error.EPPIXObjectBusyException;
import com.eppixcomm.eppix.base.error.EPPIXObjectExpiredException;
import com.eppixcomm.eppix.base.error.EPPIXObjectNotFoundException;
import com.eppixcomm.eppix.base.error.EPPIXSeriousException;

public interface  TolSimNosAbstractDAC {
	
	// TolSimNosDMO get(TolSimNosDMO tolSimNosDMO) throws EPPIXSeriousException;
	
	
	  //~ Methods ////////////////////////////////////////////////////////////////

	  /**
	   * Retrieves a TolSimNosDMO Data Model Object
	   *
	   * @return a populated TolSimNosDMO Data Model Object or null if not found.
	   *
	   * @throws EPPIXSeriousException
	   */
	  public TolSimNosDMO get( TolSimNosDMO tolSimNosDMO )
	    throws EPPIXSeriousException;

	  /**
	   * Creates the Slcustm object in the database.
	   *
	   * @param TolSimNosDMO tolSimNosDMO
	   *
	   * @throws EPPIXSeriousException
	   */
	  public void create( TolSimNosDMO tolSimNosDMO )
	    throws EPPIXSeriousException;

	  /**
	   * Locks and retrieves the Slcustm object from the database.
	   *
	   * @param tolSimNosDMO TolSimNosDMO object
	   *
	   * @return a populated TolSimNosDMO object or null if not found.
	   *
	   * @throws EPPIXSeriousException
	   */
	  public TolSimNosDMO lock( TolSimNosDMO tolSimNosDMO )
	    throws EPPIXSeriousException, EPPIXObjectBusyException;

	  /**
	   * Modifies the TolSimNosDMO object in the database.
	   *
	   * @param tolSimNosDMO TolSimNosDMO object
	   *
	   * @throws EPPIXSeriousException
	   * @throws EPPIXObjectExpiredException
	   * @throws EPPIXObjectNotFoundException
	   */
	  public void modify( TolSimNosDMO tolSimNosDMO )
	    throws EPPIXSeriousException, EPPIXObjectExpiredException,
	      EPPIXObjectNotFoundException;

	  /**
	   * Deletes the TolSimNosDMO object from the database.
	   *
	   * @param slcustmDMO TolSimNosDMO object
	   *
	   * @throws EPPIXSeriousException
	   * @throws EPPIXObjectNotFoundException
	   * @throws EPPIXObjectExpiredException
	   */
	  public void delete( TolSimNosDMO tolSimNosDMO )
	    throws EPPIXSeriousException, EPPIXObjectNotFoundException,
	      EPPIXObjectExpiredException;

	  /**
	   * Deletes the TolSimNos object from the database.
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
	   * Modifies the TolSimNos object using the specified filter in the database.
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
	  * Return true if a TolSimNos object exists.
	  *
	  * @param TolSimNosDMO tolSimNosDMO
	  *
	  * @return true if the TolSimNos object exists.
	  *
	  * @throws EPPIXSeriousException
	  */
	  public boolean exists( TolSimNosDMO tolSimNosDMO )
	    throws EPPIXSeriousException;

	  /**
	    * Return true if a TolSimNos object exists.
	    *
	    * @param filter
	    *
	    * @return true if the TolSimNos object exists.
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
	   * @param locationDMO Slcustm Data Model Object
	   *
	   * @return DTOList of Slcustm Data Model Objects.
	   *
	   * @throws EPPIXSeriousException
	   */
	//  public DTOList<SlcustmDMO> getList( 
//	    DTOListState state,
//	    SlcustmDMO   slcustmDMO )
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
	//  public DTOList<SlcustmDMO> getList( 
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
	  public TolSimNosDMO get( QueryFilter filter )
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
	  
	  DTOList getList(DTOListState state, TolSimNosDMO tolSimNosDMO) throws EPPIXSeriousException;
	  
	  
	  DTOList getList(DTOListState state, QueryFilter filter) throws EPPIXSeriousException;

}
