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
import com.eppixcomm.eppix.common.data.DTOList;
import com.eppixcomm.eppix.common.data.DTOListState;
import com.eppixcomm.eppix.base.error.EPPIXObjectBusyException;
import com.eppixcomm.eppix.base.error.EPPIXObjectExpiredException;
import com.eppixcomm.eppix.base.error.EPPIXObjectNotFoundException;
import com.eppixcomm.eppix.base.error.EPPIXSeriousException;

/**
 * This is the standard implementation of the Data Access Controller for the
 * NgsNetGroupServ Business Object.
 *
 * @version $Revision: 1.2 $
 * @author $Author$
 * @since $jdk$
 */
public interface NgsNetGroupServAbstractDAC {
  //~ Methods ////////////////////////////////////////////////////////////////

  /**
   * Retrieves a NgsNetGroupServ Data Model Object
   *
   * @return a populated NgsNetGroupServ Data Model Object or null if not found.
   *
   * @throws EPPIXSeriousException
   */
  public NgsNetGroupServDMO get( NgsNetGroupServDMO ngsNetGroupServDMO )
    throws EPPIXSeriousException;

  /**
   * Creates the NgsNetGroupServ object in the database.
   *
   * @param NgsNetGroupServDMO ngsNetGroupServDMO
   *
   * @throws EPPIXSeriousException
   */
  public void create( NgsNetGroupServDMO ngsNetGroupServDMO )
    throws EPPIXSeriousException;

  /**
   * Locks and retrieves the NgsNetGroupServ object from the database.
   *
   * @param aNgsNetGroupServ NgsNetGroupServ object
   *
   * @return a populated NgsNetGroupServ object or null if not found.
   *
   * @throws EPPIXSeriousException
   */
  public NgsNetGroupServDMO lock( NgsNetGroupServDMO aNgsNetGroupServDMO )
    throws EPPIXSeriousException, EPPIXObjectBusyException;

  /**
   * Modifies the NgsNetGroupServ object in the database.
   *
   * @param ngsNetGroupServDMO NgsNetGroupServ object
   *
   * @throws EPPIXSeriousException
   * @throws EPPIXObjectExpiredException
   * @throws EPPIXObjectNotFoundException
   */
  public void modify( NgsNetGroupServDMO ngsNetGroupServDMO )
    throws EPPIXSeriousException, EPPIXObjectExpiredException,
      EPPIXObjectNotFoundException;

  /**
   * Deletes the NgsNetGroupServ object from the database.
   *
   * @param ngsNetGroupServDMO NgsNetGroupServ object
   *
   * @throws EPPIXSeriousException
   * @throws EPPIXObjectNotFoundException
   * @throws EPPIXObjectExpiredException
   */
  public void delete( NgsNetGroupServDMO ngsNetGroupServDMO )
    throws EPPIXSeriousException, EPPIXObjectNotFoundException,
      EPPIXObjectExpiredException;

  /**
   * Deletes the NgsNetGroupServ object from the database.
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
   * Modifies the NgsNetGroupServ object using the specified filter in the database.
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
  * Return true if a NgsNetGroupServ object exists.
  *
  * @param NgsNetGroupServDMO ngsNetGroupServDMO
  *
  * @return true if the NgsNetGroupServ object exists.
  *
  * @throws EPPIXSeriousException
  */
  public boolean exists( NgsNetGroupServDMO ngsNetGroupServDMO )
    throws EPPIXSeriousException;

  /**
    * Return true if a NgsNetGroupServ object exists.
    *
    * @param filter
    *
    * @return true if the NgsNetGroupServ object exists.
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
   * @param locationDMO NgsNetGroupServ Data Model Object
   *
   * @return DTOList of NgsNetGroupServ Data Model Objects.
   *
   * @throws EPPIXSeriousException
   */
  public DTOList getList( 
    DTOListState       state,
    NgsNetGroupServDMO ngsNetGroupServDMO )
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
  public NgsNetGroupServDMO get( QueryFilter filter )
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
