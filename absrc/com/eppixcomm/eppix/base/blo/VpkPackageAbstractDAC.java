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
 * VpkPackage Business Object.
 *
 * @version $Revision: 1.2 $
 * @author $Author$
 * @since $jdk$
 */
public interface VpkPackageAbstractDAC {
  //~ Methods ////////////////////////////////////////////////////////////////

  /**
   * Retrieves a VpkPackage Data Model Object
   *
   * @return a populated VpkPackage Data Model Object or null if not found.
   *
   * @throws EPPIXSeriousException
   */
  public VpkPackageDMO get( VpkPackageDMO vpkPackageDMO )
    throws EPPIXSeriousException;

  /**
   * Creates the VpkPackage object in the database.
   *
   * @param VpkPackageDMO vpkPackageDMO
   *
   * @throws EPPIXSeriousException
   */
  public void create( VpkPackageDMO vpkPackageDMO )
    throws EPPIXSeriousException;

  /**
   * Locks and retrieves the VpkPackage object from the database.
   *
   * @param aVpkPackage VpkPackage object
   *
   * @return a populated VpkPackage object or null if not found.
   *
   * @throws EPPIXSeriousException
   */
  public VpkPackageDMO lock( VpkPackageDMO aVpkPackageDMO )
    throws EPPIXSeriousException, EPPIXObjectBusyException;

  /**
   * Modifies the VpkPackage object in the database.
   *
   * @param vpkPackageDMO VpkPackage object
   *
   * @throws EPPIXSeriousException
   * @throws EPPIXObjectExpiredException
   * @throws EPPIXObjectNotFoundException
   */
  public void modify( VpkPackageDMO vpkPackageDMO )
    throws EPPIXSeriousException, EPPIXObjectExpiredException,
      EPPIXObjectNotFoundException;

  /**
   * Deletes the VpkPackage object from the database.
   *
   * @param vpkPackageDMO VpkPackage object
   *
   * @throws EPPIXSeriousException
   * @throws EPPIXObjectNotFoundException
   * @throws EPPIXObjectExpiredException
   */
  public void delete( VpkPackageDMO vpkPackageDMO )
    throws EPPIXSeriousException, EPPIXObjectNotFoundException,
      EPPIXObjectExpiredException;

  /**
   * Deletes the VpkPackage object from the database.
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
   * Modifies the VpkPackage object using the specified filter in the database.
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
  * Return true if a VpkPackage object exists.
  *
  * @param VpkPackageDMO vpkPackageDMO
  *
  * @return true if the VpkPackage object exists.
  *
  * @throws EPPIXSeriousException
  */
  public boolean exists( VpkPackageDMO vpkPackageDMO )
    throws EPPIXSeriousException;

  /**
    * Return true if a VpkPackage object exists.
    *
    * @param filter
    *
    * @return true if the VpkPackage object exists.
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
   * @param locationDMO VpkPackage Data Model Object
   *
   * @return DTOList of VpkPackage Data Model Objects.
   *
   * @throws EPPIXSeriousException
   */
  public DTOList getList( 
    DTOListState  state,
    VpkPackageDMO vpkPackageDMO )
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
  public VpkPackageDMO get( QueryFilter filter )
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
