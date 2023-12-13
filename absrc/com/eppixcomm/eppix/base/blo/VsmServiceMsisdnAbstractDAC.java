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
 * VsmServiceMsisdn Business Object.
 *
 * @version $Revision: 1.2 $
 * @author $Author$
 * @since $jdk$
 */
public interface VsmServiceMsisdnAbstractDAC {
  //~ Methods ////////////////////////////////////////////////////////////////

  /**
   * Retrieves a VsmServiceMsisdn Data Model Object
   *
   * @return a populated VsmServiceMsisdn Data Model Object or null if not found.
   *
   * @throws EPPIXSeriousException
   */
  public VsmServiceMsisdnDMO get( VsmServiceMsisdnDMO vsmServiceMsisdnDMO )
    throws EPPIXSeriousException;

  /**
   * Creates the VsmServiceMsisdn object in the database.
   *
   * @param VsmServiceMsisdnDMO vsmServiceMsisdnDMO
   *
   * @throws EPPIXSeriousException
   */
  public void create( VsmServiceMsisdnDMO vsmServiceMsisdnDMO )
    throws EPPIXSeriousException;

  /**
   * Locks and retrieves the VsmServiceMsisdn object from the database.
   *
   * @param aVsmServiceMsisdn VsmServiceMsisdn object
   *
   * @return a populated VsmServiceMsisdn object or null if not found.
   *
   * @throws EPPIXSeriousException
   */
  public VsmServiceMsisdnDMO lock( VsmServiceMsisdnDMO aVsmServiceMsisdnDMO )
    throws EPPIXSeriousException, EPPIXObjectBusyException;

  /**
   * Modifies the VsmServiceMsisdn object in the database.
   *
   * @param vsmServiceMsisdnDMO VsmServiceMsisdn object
   *
   * @throws EPPIXSeriousException
   * @throws EPPIXObjectExpiredException
   * @throws EPPIXObjectNotFoundException
   */
  public void modify( VsmServiceMsisdnDMO vsmServiceMsisdnDMO )
    throws EPPIXSeriousException, EPPIXObjectExpiredException,
      EPPIXObjectNotFoundException;

  /**
   * Deletes the VsmServiceMsisdn object from the database.
   *
   * @param vsmServiceMsisdnDMO VsmServiceMsisdn object
   *
   * @throws EPPIXSeriousException
   * @throws EPPIXObjectNotFoundException
   * @throws EPPIXObjectExpiredException
   */
  public void delete( VsmServiceMsisdnDMO vsmServiceMsisdnDMO )
    throws EPPIXSeriousException, EPPIXObjectNotFoundException,
      EPPIXObjectExpiredException;

  /**
   * Deletes the VsmServiceMsisdn object from the database.
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
   * Modifies the VsmServiceMsisdn object using the specified filter in the database.
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
  * Return true if a VsmServiceMsisdn object exists.
  *
  * @param VsmServiceMsisdnDMO vsmServiceMsisdnDMO
  *
  * @return true if the VsmServiceMsisdn object exists.
  *
  * @throws EPPIXSeriousException
  */
  public boolean exists( VsmServiceMsisdnDMO vsmServiceMsisdnDMO )
    throws EPPIXSeriousException;

  /**
    * Return true if a VsmServiceMsisdn object exists.
    *
    * @param filter
    *
    * @return true if the VsmServiceMsisdn object exists.
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
   * @param locationDMO VsmServiceMsisdn Data Model Object
   *
   * @return DTOList of VsmServiceMsisdn Data Model Objects.
   *
   * @throws EPPIXSeriousException
   */
  public DTOList getList(
    DTOListState        state,
    VsmServiceMsisdnDMO vsmServiceMsisdnDMO )
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
  public VsmServiceMsisdnDMO get( QueryFilter filter )
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
