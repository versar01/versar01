/*============================================================================================= *
 *
 * (c) 2006 Copyright Eppixcomm.
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
package com.eppixcomm.eppix.common.blo;

import com.eppixcomm.eppix.common.util.QueryFilter;
import com.eppixcomm.eppix.common.data.DTOList;
import com.eppixcomm.eppix.common.data.DTOListState;
import com.eppixcomm.eppix.base.error.EPPIXObjectBusyException;
import com.eppixcomm.eppix.base.error.EPPIXObjectExpiredException;
import com.eppixcomm.eppix.base.error.EPPIXObjectNotFoundException;
import com.eppixcomm.eppix.base.error.EPPIXSeriousException;

/**
 * This is the standard implementation of the Data Access Controller for the
 * NextPrn Business Object.
 *
 * @version $Revision: 1.2 $
 * @author Alan Fleming
 * @since $jdk$
 */
public interface NextPrnDAC {
  //~ Methods ////////////////////////////////////////////////////////////////

  /**
   * Retrieves a NextPrn Data Model Object
   *
   * @return a populated NextPrn Data Model Object or null if not found.
   *
   * @throws EPPIXSeriousException
   */
  public NextPrnDMO get( NextPrnDMO nextPrnDMO )
    throws EPPIXSeriousException;

  /**
   * Creates the NextPrn object in the database.
   *
   * @param NextPrnDMO nextPrnDMO
   *
   * @throws EPPIXSeriousException
   */
  public void create( NextPrnDMO nextPrnDMO )
    throws EPPIXSeriousException;

  /**
   * Locks and retrieves the NextPrn object from the database.
   *
   * @param aNextPrn NextPrn object
   *
   * @return a populated NextPrn object or null if not found.
   *
   * @throws EPPIXSeriousException
   */
  public NextPrnDMO lock( NextPrnDMO aNextPrnDMO )
    throws EPPIXSeriousException, EPPIXObjectBusyException;

  /**
   * Modifies the ActionType object in the database.
   *
   * @param actionTypeDMO ActionType object with embedded mandatory actionTypeId
   *        and recordVersion.
   *
   * @throws EPPIXSeriousException
   * @throws EPPIXObjectExpiredException
   * @throws EPPIXObjectNotFoundException
   */
  public void modify( NextPrnDMO aNextPrnDMO )
    throws EPPIXSeriousException, EPPIXObjectExpiredException,
      EPPIXObjectNotFoundException;

  /**
   * Deletes the NextPrn object from the database.
   *
   * @param nextPrnDMO NextPrn object
   *
   * @throws EPPIXSeriousException
   * @throws EPPIXObjectNotFoundException
   * @throws EPPIXObjectExpiredException
   */
  public void delete( NextPrnDMO nextPrnDMO )
    throws EPPIXSeriousException, EPPIXObjectNotFoundException,
      EPPIXObjectExpiredException;

  /**
  * Return true if a NextPrn object exists.
  *
  * @param NextPrnDMO nextPrnDMO
  *
  * @return true if the NextPrn object exists.
  *
  * @throws EPPIXSeriousException
  */
  public boolean exists( NextPrnDMO nextPrnDMO )
    throws EPPIXSeriousException;

  /**
   * Return a list of location objects matching the passed in values. A
   * partial match is performed on the description argument. If no language
   * Code is passed inside the locationDMO then the language passed in the
   * EppixLocale object is used.
   *
   * @param state previous state of the list.
   * @param locationDMO NextPrn Data Model Object
   *
   * @return DTOList of NextPrn Data Model Objects.
   *
   * @throws EPPIXSeriousException
   */
  public DTOList getList( 
    DTOListState state,
    NextPrnDMO   nextPrnDMO )
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
    QueryFilter       filter )
    throws EPPIXSeriousException;
}
