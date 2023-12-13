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
 * Vsr2ServiceAux Business Object.
 *
 * @version $Revision: 1.2 $
 * @author $Author$
 * @since $jdk$
 */
public interface Vsr2ServiceAuxAbstractDAC {
  //~ Methods ////////////////////////////////////////////////////////////////

  /**
   * Retrieves a Vsr2ServiceAux Data Model Object
   *
   * @return a populated Vsr2ServiceAux Data Model Object or null if not found.
   *
   * @throws EPPIXSeriousException
   */
  public Vsr2ServiceAuxDMO get( Vsr2ServiceAuxDMO vsr2ServiceAuxDMO )
    throws EPPIXSeriousException;

  /**
   * Creates the Vsr2ServiceAux object in the database.
   *
   * @param Vsr2ServiceAuxDMO vsr2ServiceAuxDMO
   *
   * @throws EPPIXSeriousException
   */
  public void create( Vsr2ServiceAuxDMO vsr2ServiceAuxDMO )
    throws EPPIXSeriousException;

  /**
   * Locks and retrieves the Vsr2ServiceAux object from the database.
   *
   * @param aVsr2ServiceAux Vsr2ServiceAux object
   *
   * @return a populated Vsr2ServiceAux object or null if not found.
   *
   * @throws EPPIXSeriousException
   */
  public Vsr2ServiceAuxDMO lock( Vsr2ServiceAuxDMO aVsr2ServiceAuxDMO )
    throws EPPIXSeriousException, EPPIXObjectBusyException;

  /**
   * Modifies the Vsr2ServiceAux object in the database.
   *
   * @param vsr2ServiceAuxDMO Vsr2ServiceAux object
   *
   * @throws EPPIXSeriousException
   * @throws EPPIXObjectExpiredException
   * @throws EPPIXObjectNotFoundException
   */
  public void modify( Vsr2ServiceAuxDMO vsr2ServiceAuxDMO )
    throws EPPIXSeriousException, EPPIXObjectExpiredException,
      EPPIXObjectNotFoundException;

  /**
   * Deletes the Vsr2ServiceAux object from the database.
   *
   * @param vsr2ServiceAuxDMO Vsr2ServiceAux object
   *
   * @throws EPPIXSeriousException
   * @throws EPPIXObjectNotFoundException
   * @throws EPPIXObjectExpiredException
   */
  public void delete( Vsr2ServiceAuxDMO vsr2ServiceAuxDMO )
    throws EPPIXSeriousException, EPPIXObjectNotFoundException,
      EPPIXObjectExpiredException;

  /**
   * Deletes the Vsr2ServiceAux object from the database.
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
   * Modifies the Vsr2ServiceAux object using the specified filter in the database.
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
  * Return true if a Vsr2ServiceAux object exists.
  *
  * @param Vsr2ServiceAuxDMO vsr2ServiceAuxDMO
  *
  * @return true if the Vsr2ServiceAux object exists.
  *
  * @throws EPPIXSeriousException
  */
  public boolean exists( Vsr2ServiceAuxDMO vsr2ServiceAuxDMO )
    throws EPPIXSeriousException;

  /**
    * Return true if a Vsr2ServiceAux object exists.
    *
    * @param filter
    *
    * @return true if the Vsr2ServiceAux object exists.
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
   * @param locationDMO Vsr2ServiceAux Data Model Object
   *
   * @return DTOList of Vsr2ServiceAux Data Model Objects.
   *
   * @throws EPPIXSeriousException
   */
  public DTOList getList( 
    DTOListState      state,
    Vsr2ServiceAuxDMO vsr2ServiceAuxDMO )
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
  public Vsr2ServiceAuxDMO get( QueryFilter filter )
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
