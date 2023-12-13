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
 * NeaNetErrAction Business Object.
 *
 * @version $Revision: 1.2 $
 * @author $Author$
 * @since $jdk$
 */
public interface NeaNetErrActionAbstractDAC {
  //~ Methods ////////////////////////////////////////////////////////////////

  /**
   * Retrieves a NeaNetErrAction Data Model Object
   *
   * @return a populated NeaNetErrAction Data Model Object or null if not found.
   *
   * @throws EPPIXSeriousException
   */
  public NeaNetErrActionDMO get( NeaNetErrActionDMO neaNetErrActionDMO )
    throws EPPIXSeriousException;

  /**
   * Creates the NeaNetErrAction object in the database.
   *
   * @param NeaNetErrActionDMO neaNetErrActionDMO
   *
   * @throws EPPIXSeriousException
   */
  public void create( NeaNetErrActionDMO neaNetErrActionDMO )
    throws EPPIXSeriousException;

  /**
   * Locks and retrieves the NeaNetErrAction object from the database.
   *
   * @param aNeaNetErrAction NeaNetErrAction object
   *
   * @return a populated NeaNetErrAction object or null if not found.
   *
   * @throws EPPIXSeriousException
   */
  public NeaNetErrActionDMO lock( NeaNetErrActionDMO aNeaNetErrActionDMO )
    throws EPPIXSeriousException, EPPIXObjectBusyException;

  /**
   * Modifies the NeaNetErrAction object in the database.
   *
   * @param neaNetErrActionDMO NeaNetErrAction object
   *
   * @throws EPPIXSeriousException
   * @throws EPPIXObjectExpiredException
   * @throws EPPIXObjectNotFoundException
   */
  public void modify( NeaNetErrActionDMO neaNetErrActionDMO )
    throws EPPIXSeriousException, EPPIXObjectExpiredException,
      EPPIXObjectNotFoundException;

  /**
   * Deletes the NeaNetErrAction object from the database.
   *
   * @param neaNetErrActionDMO NeaNetErrAction object
   *
   * @throws EPPIXSeriousException
   * @throws EPPIXObjectNotFoundException
   * @throws EPPIXObjectExpiredException
   */
  public void delete( NeaNetErrActionDMO neaNetErrActionDMO )
    throws EPPIXSeriousException, EPPIXObjectNotFoundException,
      EPPIXObjectExpiredException;

  /**
   * Deletes the NeaNetErrAction object from the database.
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
   * Modifies the NeaNetErrAction object using the specified filter in the database.
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
  * Return true if a NeaNetErrAction object exists.
  *
  * @param NeaNetErrActionDMO neaNetErrActionDMO
  *
  * @return true if the NeaNetErrAction object exists.
  *
  * @throws EPPIXSeriousException
  */
  public boolean exists( NeaNetErrActionDMO neaNetErrActionDMO )
    throws EPPIXSeriousException;

  /**
    * Return true if a NeaNetErrAction object exists.
    *
    * @param filter
    *
    * @return true if the NeaNetErrAction object exists.
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
   * @param locationDMO NeaNetErrAction Data Model Object
   *
   * @return DTOList of NeaNetErrAction Data Model Objects.
   *
   * @throws EPPIXSeriousException
   */
//  public DTOList<NeaNetErrActionDMO> getList( 
//    DTOListState state,
//    NeaNetErrActionDMO  neaNetErrActionDMO )
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
//  public DTOList<NeaNetErrActionDMO> getList( 
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
  public NeaNetErrActionDMO get( QueryFilter filter )
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

  /**   * DOCUMENT ME!
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
