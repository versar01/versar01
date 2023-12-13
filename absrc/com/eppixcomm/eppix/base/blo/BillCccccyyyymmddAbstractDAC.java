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
 * BillCccccyyyymmdd Business Object.
 *
 * @version $Revision: 1.2 $
 * @author $Author$
 * @since $jdk$
 */
public interface BillCccccyyyymmddAbstractDAC {
  //~ Methods ////////////////////////////////////////////////////////////////

  /**
   * Retrieves a BillCccccyyyymmdd Data Model Object
   *
   * @return a populated BillCccccyyyymmdd Data Model Object or null if not found.
   *
   * @throws EPPIXSeriousException
   */
  public BillCccccyyyymmddDMO get( 
    BillCccccyyyymmddDMO billCccccyyyymmddDMO,
    String               tableName )
    throws EPPIXSeriousException;

  /**
   * Creates the BillCccccyyyymmdd object in the database.
   *
   * @param BillCccccyyyymmddDMO billCccccyyyymmddDMO
   * @param String tableName
   *
   * @throws EPPIXSeriousException
   */
  public BillCccccyyyymmddDMO create( 
    BillCccccyyyymmddDMO billCccccyyyymmddDMO,
    String               tableName )
    throws EPPIXSeriousException;

  /**
   * Locks and retrieves the BillCccccyyyymmdd object from the database.
   *
   * @param aBillCccccyyyymmdd BillCccccyyyymmdd object
   *
   * @return a populated BillCccccyyyymmdd object or null if not found.
   *
   * @throws EPPIXSeriousException
   */
  public BillCccccyyyymmddDMO lock( 
    BillCccccyyyymmddDMO aBillCccccyyyymmddDMO,
    String               tableName )
    throws EPPIXSeriousException, EPPIXObjectBusyException;

  /**
   * Modifies the BillCccccyyyymmdd object in the database.
   *
   * @param billCccccyyyymmddDMO BillCccccyyyymmdd object
   *
   * @throws EPPIXSeriousException
   * @throws EPPIXObjectExpiredException
   * @throws EPPIXObjectNotFoundException
   */
  public void modify( 
    BillCccccyyyymmddDMO billCccccyyyymmddDMO,
    String               tableName )
    throws EPPIXSeriousException, EPPIXObjectExpiredException,
      EPPIXObjectNotFoundException;

  /**
   * Deletes the BillCccccyyyymmdd object from the database.
   *
   * @param billCccccyyyymmddDMO BillCccccyyyymmdd object
   *
   * @throws EPPIXSeriousException
   * @throws EPPIXObjectNotFoundException
   * @throws EPPIXObjectExpiredException
   */
  public void delete( 
    BillCccccyyyymmddDMO billCccccyyyymmddDMO,
    String               tableName )
    throws EPPIXSeriousException, EPPIXObjectNotFoundException,
      EPPIXObjectExpiredException;

  /**
   * Deletes the BillCccccyyyymmdd object from the database.
   *
   * @param QueryFilter filter object
   *
   * @throws EPPIXSeriousException
   * @throws EPPIXObjectNotFoundException
   * @throws EPPIXObjectExpiredException
   */
  public void delete( 
    QueryFilter filter,
    String      tableName )
    throws EPPIXSeriousException, EPPIXObjectNotFoundException,
      EPPIXObjectExpiredException;

  /**
   * Modifies the BillCccccyyyymmdd object using the specified filter in the database.
   *
   * @param filter object
   *
   * @throws EPPIXSeriousException
   * @throws EPPIXObjectExpiredException
   * @throws EPPIXObjectNotFoundException
   */
  public void modify( 
    QueryFilter filter,
    String      tableName )
    throws EPPIXSeriousException, EPPIXObjectExpiredException,
      EPPIXObjectNotFoundException;

  /**
  * Return true if a BillCccccyyyymmdd object exists.
  *
  * @param BillCccccyyyymmddDMO billCccccyyyymmddDMO
  * @param String tableName
  *
  * @return true if the BillCccccyyyymmdd object exists.
  *
  * @throws EPPIXSeriousException
  */
  public boolean exists( 
    BillCccccyyyymmddDMO billCccccyyyymmddDMO,
    String               tableName )
    throws EPPIXSeriousException;

  /**
    * Return true if a BillCccccyyyymmdd object exists.
    *
    * @param filter
    *
    * @return true if the BillCccccyyyymmdd object exists.
    *
    * @throws EPPIXSeriousException
    */
  public boolean exists( 
    QueryFilter filter,
    String      tableName )
    throws EPPIXSeriousException;

  /**
   * Return a list of location objects matching the passed in values. A
   * partial match is performed on the description argument. If no language
   * Code is passed inside the locationDMO then the language passed in the
   * EppixLocale object is used.
   *
   * @param state previous state of the list.
   * @param locationDMO BillCccccyyyymmdd Data Model Object
   *
   * @return DTOList of BillCccccyyyymmdd Data Model Objects.
   *
   * @throws EPPIXSeriousException
   */
  public DTOList getList( 
    DTOListState         state,
    BillCccccyyyymmddDMO billCccccyyyymmddDMO,
    String               tableName )
    throws EPPIXSeriousException;

  /**
   * DOCUMENT ME!
   *
   * @param state DOCUMENT ME!
   * @param filter DOCUMENT ME!
   * @param tableName DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   *
   * @throws EPPIXSeriousException DOCUMENT ME!
   */
  public DTOList getList( 
    DTOListState state,
    QueryFilter  filter,
    String       tableName )
    throws EPPIXSeriousException;

  /**
   * DOCUMENT ME!
   *
   * @param filter DOCUMENT ME!
   * @param tableName DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   *
   * @throws EPPIXSeriousException DOCUMENT ME!
   */
  public DAOIterator iterate( 
    QueryFilter filter,
    String      tableName )
    throws EPPIXSeriousException;

  /**
   * DOCUMENT ME!
   *
   * @param filter DOCUMENT ME!
   * @param tableName DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   *
   * @throws EPPIXSeriousException DOCUMENT ME!
   */
  public DAOIterator iterateWithLock( 
    QueryFilter filter,
    String      tableName )
    throws EPPIXSeriousException;

  /**
   * DOCUMENT ME!
   *
   * @param filter DOCUMENT ME!
   * @param tableName DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   *
   * @throws EPPIXSeriousException DOCUMENT ME!
   */
  public BillCccccyyyymmddDMO get( 
    QueryFilter filter,
    String      tableName )
    throws EPPIXSeriousException;

  /**
   * DOCUMENT ME!
   *
   * @param filter DOCUMENT ME!
   * @param tableName DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   *
   * @throws EPPIXSeriousException DOCUMENT ME!
   */
  public Object max( 
    QueryFilter filter,
    String      tableName )
    throws EPPIXSeriousException;

  /**
   * DOCUMENT ME!
   *
   * @param filter DOCUMENT ME!
   * @param tableName DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   *
   * @throws EPPIXSeriousException DOCUMENT ME!
   */
  public Object min( 
    QueryFilter filter,
    String      tableName )
    throws EPPIXSeriousException;

  /**
   * DOCUMENT ME!
   *
   * @param filter DOCUMENT ME!
   * @param tableName DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   *
   * @throws EPPIXSeriousException DOCUMENT ME!
   */
  public int count( 
    QueryFilter filter,
    String      tableName )
    throws EPPIXSeriousException;
}
