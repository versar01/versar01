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
//import com.eppixcomm.eppix.common.data.DTOList;
//import com.eppixcomm.eppix.common.data.DTOListState;
import com.eppixcomm.eppix.base.error.EPPIXObjectBusyException;
import com.eppixcomm.eppix.base.error.EPPIXObjectExpiredException;
import com.eppixcomm.eppix.base.error.EPPIXObjectNotFoundException;
import com.eppixcomm.eppix.base.error.EPPIXSeriousException;

/**
 * This is the standard implementation of the Data Access Controller for the
 * CdiDatabaseInt Business Object.
 *
 * @version $Revision: 1.2 $
 * @author $Author$
 * @since $jdk$
 */
public interface CdiDatabaseIntAbstractDAC {
  //~ Methods ////////////////////////////////////////////////////////////////

  /**
   * Retrieves a CdiDatabaseInt Data Model Object
   *
   * @return a populated CdiDatabaseInt Data Model Object or null if not found.
   *
   * @throws EPPIXSeriousException
   */
  public CdiDatabaseIntDMO get( CdiDatabaseIntDMO cdiDatabaseIntDMO )
    throws EPPIXSeriousException;

  /**
   * Creates the CdiDatabaseInt object in the database.
   *
   * @param CdiDatabaseIntDMO cdiDatabaseIntDMO
   *
   * @throws EPPIXSeriousException
   */
  public void create( CdiDatabaseIntDMO cdiDatabaseIntDMO )
    throws EPPIXSeriousException;
  
  
  public void creatCustomCdi( CdiDatabaseIntDMO cdiDatabaseIntDMO  )throws EPPIXSeriousException;

  /**
   * Locks and retrieves the CdiDatabaseInt object from the database.
   *
   * @param aCdiDatabaseInt CdiDatabaseInt object
   *
   * @return a populated CdiDatabaseInt object or null if not found.
   *
   * @throws EPPIXSeriousException
   */
  public CdiDatabaseIntDMO lock( CdiDatabaseIntDMO aCdiDatabaseIntDMO )
    throws EPPIXSeriousException, EPPIXObjectBusyException;

  /**
   * Modifies the CdiDatabaseInt object in the database.
   *
   * @param cdiDatabaseIntDMO CdiDatabaseInt object
   *
   * @throws EPPIXSeriousException
   * @throws EPPIXObjectExpiredException
   * @throws EPPIXObjectNotFoundException
   */
  public void modify( CdiDatabaseIntDMO cdiDatabaseIntDMO )
    throws EPPIXSeriousException, EPPIXObjectExpiredException,
      EPPIXObjectNotFoundException;

  /**
   * Deletes the CdiDatabaseInt object from the database.
   *
   * @param cdiDatabaseIntDMO CdiDatabaseInt object
   *
   * @throws EPPIXSeriousException
   * @throws EPPIXObjectNotFoundException
   * @throws EPPIXObjectExpiredException
   */
  public void delete( CdiDatabaseIntDMO cdiDatabaseIntDMO )
    throws EPPIXSeriousException, EPPIXObjectNotFoundException,
      EPPIXObjectExpiredException;

  /**
   * Deletes the CdiDatabaseInt object from the database.
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
   * Modifies the CdiDatabaseInt object using the specified filter in the database.
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
  * Return true if a CdiDatabaseInt object exists.
  *
  * @param CdiDatabaseIntDMO cdiDatabaseIntDMO
  *
  * @return true if the CdiDatabaseInt object exists.
  *
  * @throws EPPIXSeriousException
  */
  public boolean exists( CdiDatabaseIntDMO cdiDatabaseIntDMO )
    throws EPPIXSeriousException;

  /**
    * Return true if a CdiDatabaseInt object exists.
    *
    * @param filter
    *
    * @return true if the CdiDatabaseInt object exists.
    *
    * @throws EPPIXSeriousException
    */
  public boolean exists( QueryFilter filter )
    throws EPPIXSeriousException;
  
  public void updateCDIStatus(String status, String text, String date, Integer serial);

  /**
   * Return a list of location objects matching the passed in values. A
   * partial match is performed on the description argument. If no language
   * Code is passed inside the locationDMO then the language passed in the
   * EppixLocale object is used.
   *
   * @param state previous state of the list.
   * @param locationDMO CdiDatabaseInt Data Model Object
   *
   * @return DTOList of CdiDatabaseInt Data Model Objects.
   *
   * @throws EPPIXSeriousException
   */
//  public DTOList<CdiDatabaseIntDMO> getList( 
//    DTOListState      state,
//    CdiDatabaseIntDMO cdiDatabaseIntDMO )
//    throws EPPIXSeriousException;

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
//  public DTOList<CdiDatabaseIntDMO> getList( 
//    DTOListState state,
//    QueryFilter  filter )
//    throws EPPIXSeriousException;

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
  public CdiDatabaseIntDMO get( QueryFilter filter )
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
