package com.eppixcomm.eppix.base.blo;

import com.eppixcomm.eppix.common.data.DAOIterator;
import com.eppixcomm.eppix.common.util.QueryFilter;
import com.eppixcomm.eppix.common.data.DTOList;
import com.eppixcomm.eppix.common.data.DTOListState;
import com.eppixcomm.eppix.base.error.EPPIXObjectBusyException;
import com.eppixcomm.eppix.base.error.EPPIXObjectExpiredException;
import com.eppixcomm.eppix.base.error.EPPIXObjectNotFoundException;
import com.eppixcomm.eppix.base.error.EPPIXSeriousException;

/**
 * This is the standard implementation of the Data Access Controller for the
 * CpcCallPrecharge Business Object.
 *
 * @version $Revision: 1.2 $
 * @author $Author$
 * @since $jdk$
 */
public interface CpcCallPrechargeAbstractDAC {
  //~ Methods ////////////////////////////////////////////////////////////////

  /**
   * Retrieves a CpcCallPrecharge Data Model Object
   *
   * @return a populated CpcCallPrecharge Data Model Object or null if not found.
   *
   * @throws EPPIXSeriousException
   */
  public CpcCallPrechargeDMO get( CpcCallPrechargeDMO cpcCallPrechargeDMO )
    throws EPPIXSeriousException;

  /**
   * Creates the CpcCallPrecharge object in the database.
   *
   * @param CpcCallPrechargeDMO cpcCallPrechargeDMO
   *
   * @throws EPPIXSeriousException
   */
  public CpcCallPrechargeDMO create( CpcCallPrechargeDMO cpcCallPrechargeDMO )
    throws EPPIXSeriousException;

  /**
   * Locks and retrieves the CpcCallPrecharge object from the database.
   *
   * @param aCpcCallPrecharge CpcCallPrecharge object
   *
   * @return a populated CpcCallPrecharge object or null if not found.
   *
   * @throws EPPIXSeriousException
   */
  public CpcCallPrechargeDMO lock( CpcCallPrechargeDMO aCpcCallPrechargeDMO )
    throws EPPIXSeriousException, EPPIXObjectBusyException;

  /**
   * Modifies the CpcCallPrecharge object in the database.
   *
   * @param cpcCallPrechargeDMO CpcCallPrecharge object
   *
   * @throws EPPIXSeriousException
   * @throws EPPIXObjectExpiredException
   * @throws EPPIXObjectNotFoundException
   */
  public void modify( CpcCallPrechargeDMO cpcCallPrechargeDMO )
    throws EPPIXSeriousException, EPPIXObjectExpiredException,
      EPPIXObjectNotFoundException;

  /**
   * Deletes the CpcCallPrecharge object from the database.
   *
   * @param cpcCallPrechargeDMO CpcCallPrecharge object
   *
   * @throws EPPIXSeriousException
   * @throws EPPIXObjectNotFoundException
   * @throws EPPIXObjectExpiredException
   */
  public void delete( CpcCallPrechargeDMO cpcCallPrechargeDMO )
    throws EPPIXSeriousException, EPPIXObjectNotFoundException,
      EPPIXObjectExpiredException;

  /**
   * Deletes the CpcCallPrecharge object from the database.
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
   * Modifies the CpcCallPrecharge object using the specified filter in the database.
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
  * Return true if a CpcCallPrecharge object exists.
  *
  * @param CpcCallPrechargeDMO cpcCallPrechargeDMO
  *
  * @return true if the CpcCallPrecharge object exists.
  *
  * @throws EPPIXSeriousException
  */
  public boolean exists( CpcCallPrechargeDMO cpcCallPrechargeDMO )
    throws EPPIXSeriousException;

  /**
    * Return true if a CpcCallPrecharge object exists.
    *
    * @param filter
    *
    * @return true if the CpcCallPrecharge object exists.
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
   * @param locationDMO CpcCallPrecharge Data Model Object
   *
   * @return DTOList of CpcCallPrecharge Data Model Objects.
   *
   * @throws EPPIXSeriousException
   */
  public DTOList getList( 
    DTOListState        state,
    CpcCallPrechargeDMO cpcCallPrechargeDMO )
    throws EPPIXSeriousException;

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
  public DTOList getList( 
    DTOListState state,
    QueryFilter  filter )
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
  public DAOIterator iterateWithLock( 
    QueryFilter filter )
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
  public CpcCallPrechargeDMO get( QueryFilter filter )
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
