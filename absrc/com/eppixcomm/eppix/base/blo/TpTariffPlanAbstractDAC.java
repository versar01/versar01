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
import com.eppixcomm.eppix.base.error.EPPIXObjectBusyException;
import com.eppixcomm.eppix.base.error.EPPIXObjectExpiredException;
import com.eppixcomm.eppix.base.error.EPPIXObjectNotFoundException;
import com.eppixcomm.eppix.base.error.EPPIXSeriousException;

/**
 * This is the standard implementation of the Data Access Controller for the
 * TpTariffPlan Business Object.
 *
 * @version $Revision: 1.2 $
 * @author $Author$
 * @since $jdk$
 */
public interface TpTariffPlanAbstractDAC {
  //~ Methods ////////////////////////////////////////////////////////////////

  /**
   * Retrieves a TpTariffPlan Data Model Object
   *
   * @return a populated TpTariffPlan Data Model Object or null if not found.
   *
   * @throws EPPIXSeriousException
   */
  public TpTariffPlanDMO get( TpTariffPlanDMO tpTariffPlanDMO )
    throws EPPIXSeriousException;

  /**
   * Creates the TpTariffPlan object in the database.
   *
   * @param TpTariffPlanDMO tpTariffPlanDMO
   *
   * @throws EPPIXSeriousException
   */
  public void create( TpTariffPlanDMO tpTariffPlanDMO )
    throws EPPIXSeriousException;

  /**
   * Locks and retrieves the TpTariffPlan object from the database.
   *
   * @param aTpTariffPlan TpTariffPlan object
   *
   * @return a populated TpTariffPlan object or null if not found.
   *
   * @throws EPPIXSeriousException
   */
  public TpTariffPlanDMO lock( TpTariffPlanDMO aTpTariffPlanDMO )
    throws EPPIXSeriousException, EPPIXObjectBusyException;

  /**
   * Modifies the TpTariffPlan object in the database.
   *
   * @param tpTariffPlanDMO TpTariffPlan object
   *
   * @throws EPPIXSeriousException
   * @throws EPPIXObjectExpiredException
   * @throws EPPIXObjectNotFoundException
   */
  public void modify( TpTariffPlanDMO tpTariffPlanDMO )
    throws EPPIXSeriousException, EPPIXObjectExpiredException,
      EPPIXObjectNotFoundException;

  /**
   * Deletes the TpTariffPlan object from the database.
   *
   * @param tpTariffPlanDMO TpTariffPlan object
   *
   * @throws EPPIXSeriousException
   * @throws EPPIXObjectNotFoundException
   * @throws EPPIXObjectExpiredException
   */
  public void delete( TpTariffPlanDMO tpTariffPlanDMO )
    throws EPPIXSeriousException, EPPIXObjectNotFoundException,
      EPPIXObjectExpiredException;

  /**
   * Deletes the TpTariffPlan object from the database.
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
   * Modifies the TpTariffPlan object using the specified filter in the database.
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
  * Return true if a TpTariffPlan object exists.
  *
  * @param TpTariffPlanDMO tpTariffPlanDMO
  *
  * @return true if the TpTariffPlan object exists.
  *
  * @throws EPPIXSeriousException
  */
  public boolean exists( TpTariffPlanDMO tpTariffPlanDMO )
    throws EPPIXSeriousException;

  /**
    * Return true if a TpTariffPlan object exists.
    *
    * @param filter
    *
    * @return true if the TpTariffPlan object exists.
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
   * @param locationDMO TpTariffPlan Data Model Object
   *
   * @return DTOList of TpTariffPlan Data Model Objects.
   *
   * @throws EPPIXSeriousException
   */
//  public DTOList getList( 
//    DTOListState    state,
//    TpTariffPlanDMO tpTariffPlanDMO )
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
//  public DTOList getList( 
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
  public TpTariffPlanDMO get( QueryFilter filter )
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
