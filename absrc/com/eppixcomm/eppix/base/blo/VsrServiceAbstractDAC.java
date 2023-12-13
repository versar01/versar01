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
 * VsrService Business Object.
 *
 * @version $Revision: 1.2 $
 * @author $Author$
 * @since $jdk$
 */
public interface VsrServiceAbstractDAC {
  //~ Methods ////////////////////////////////////////////////////////////////

  /**
   * Retrieves a VsrService Data Model Object
   *
   * @return a populated VsrService Data Model Object or null if not found.
   *
   * @throws EPPIXSeriousException
   */
  public VsrServiceDMO get( VsrServiceDMO vsrServiceDMO )
    throws EPPIXSeriousException;

  /**
   * Creates the VsrService object in the database.
   *
   * @param VsrServiceDMO vsrServiceDMO
   *
   * @throws EPPIXSeriousException
   */
  public void create( VsrServiceDMO vsrServiceDMO )
    throws EPPIXSeriousException;

  /**
   * Locks and retrieves the VsrService object from the database.
   *
   * @param aVsrService VsrService object
   *
   * @return a populated VsrService object or null if not found.
   *
   * @throws EPPIXSeriousException
   */
  public VsrServiceDMO lock( VsrServiceDMO aVsrServiceDMO )
    throws EPPIXSeriousException, EPPIXObjectBusyException;

  /**
   * Modifies the VsrService object in the database.
   *
   * @param vsrServiceDMO VsrService object
   *
   * @throws EPPIXSeriousException
   * @throws EPPIXObjectExpiredException
   * @throws EPPIXObjectNotFoundException
   */
  public void modify( VsrServiceDMO vsrServiceDMO )
    throws EPPIXSeriousException, EPPIXObjectExpiredException,
      EPPIXObjectNotFoundException;

  /**
   * Deletes the VsrService object from the database.
   *
   * @param vsrServiceDMO VsrService object
   *
   * @throws EPPIXSeriousException
   * @throws EPPIXObjectNotFoundException
   * @throws EPPIXObjectExpiredException
   */
  public void delete( VsrServiceDMO vsrServiceDMO )
    throws EPPIXSeriousException, EPPIXObjectNotFoundException,
      EPPIXObjectExpiredException;

  /**
   * Deletes the VsrService object from the database.
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
   * Modifies the VsrService object using the specified filter in the database.
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
  * Return true if a VsrService object exists.
  *
  * @param VsrServiceDMO vsrServiceDMO
  *
  * @return true if the VsrService object exists.
  *
  * @throws EPPIXSeriousException
  */
  public boolean exists( VsrServiceDMO vsrServiceDMO )
    throws EPPIXSeriousException;

  /**
    * Return true if a VsrService object exists.
    *
    * @param filter
    *
    * @return true if the VsrService object exists.
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
   * @param locationDMO VsrService Data Model Object
   *
   * @return DTOList of VsrService Data Model Objects.
   *
   * @throws EPPIXSeriousException
   */
  public DTOList getList( 
    DTOListState  state,
    VsrServiceDMO vsrServiceDMO )
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
  public VsrServiceDMO get( QueryFilter filter )
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
