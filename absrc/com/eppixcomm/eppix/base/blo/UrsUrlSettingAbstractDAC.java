package com.eppixcomm.eppix.base.blo;


import com.eppixcomm.eppix.common.data.DAOIterator;

import com.eppixcomm.eppix.common.util.QueryFilter;

//import com.eppixcomm.eppix.common.data.DTOList;

//import com.eppixcomm.eppix.common.data.DTOListState;

import com.eppixcomm.eppix.base.error.EPPIXObjectBusyException;

import com.eppixcomm.eppix.base.error.EPPIXObjectExpiredException;

import com.eppixcomm.eppix.base.error.EPPIXObjectNotFoundException;

import com.eppixcomm.eppix.base.error.EPPIXSeriousException;


public interface UrsUrlSettingAbstractDAC {

  //~ Methods ////////////////////////////////////////////////////////////////


  /**

   * Retrieves a UrsUrlSetting Data Model Object

   *

   * @return a populated UrsUrlSetting Data Model Object or null if not found.

   *

   * @throws EPPIXSeriousException

   */

  public UrsUrlSettingDMO get( UrsUrlSettingDMO ursKeySettingDMO )

    throws EPPIXSeriousException;


  /**

   * Creates the UrsUrlSetting object in the database.

   *

   * @param UrsUrlSettingDMO ursKeySettingDMO

   *

   * @throws EPPIXSeriousException

   */

  public void create( UrsUrlSettingDMO ursKeySettingDMO )

    throws EPPIXSeriousException;


  /**

   * Locks and retrieves the UrsUrlSetting object from the database.

   *

   * @param aUrsUrlSetting UrsUrlSetting object

   *

   * @return a populated UrsUrlSetting object or null if not found.

   *

   * @throws EPPIXSeriousException

   */

  public UrsUrlSettingDMO lock( UrsUrlSettingDMO aUrsUrlSettingDMO )

    throws EPPIXSeriousException, EPPIXObjectBusyException;


  /**

   * Modifies the UrsUrlSetting object in the database.

   *

   * @param ursKeySettingDMO UrsUrlSetting object

   *

   * @throws EPPIXSeriousException

   * @throws EPPIXObjectExpiredException

   * @throws EPPIXObjectNotFoundException

   */

  public void modify( UrsUrlSettingDMO ursKeySettingDMO )

    throws EPPIXSeriousException, EPPIXObjectExpiredException,

      EPPIXObjectNotFoundException;


  /**

   * Deletes the UrsUrlSetting object from the database.

   *

   * @param ursKeySettingDMO UrsUrlSetting object

   *

   * @throws EPPIXSeriousException

   * @throws EPPIXObjectNotFoundException

   * @throws EPPIXObjectExpiredException

   */

  public void delete( UrsUrlSettingDMO ursKeySettingDMO )

    throws EPPIXSeriousException, EPPIXObjectNotFoundException,

      EPPIXObjectExpiredException;


  /**

   * Deletes the UrsUrlSetting object from the database.

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

   * Modifies the UrsUrlSetting object using the specified filter in the database.

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

  * Return true if a UrsUrlSetting object exists.

  *

  * @param UrsUrlSettingDMO ursKeySettingDMO

  *

  * @return true if the UrsUrlSetting object exists.

  *

  * @throws EPPIXSeriousException

  */

  public boolean exists( UrsUrlSettingDMO ursKeySettingDMO )

    throws EPPIXSeriousException;


  /**

    * Return true if a UrsUrlSetting object exists.

    *

    * @param filter

    *

    * @return true if the UrsUrlSetting object exists.

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

   * @param locationDMO UrsUrlSetting Data Model Object

   *

   * @return DTOList of UrsUrlSetting Data Model Objects.

   *

   * @throws EPPIXSeriousException

   */

//  public DTOList<UrsUrlSettingDMO> getList(

//    DTOListState     state,

//    UrsUrlSettingDMO ursKeySettingDMO )

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

//  public DTOList<UrsUrlSettingDMO> getList(

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

  public UrsUrlSettingDMO get( QueryFilter filter )

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
