/* ====================================================================== *
 * (c) Copyright Eppixcomm Tech Ltd.                                      *
 * All Rights Reserved                                                    *
 *                                                                        *
 * Legal Information                                                      *
 * ====================================================================== */
package com.eppixcomm.eppix.base.blo;

import com.eppixcomm.eppix.common.data.DTOList;
import com.eppixcomm.eppix.common.data.DTOListState;
import com.eppixcomm.eppix.base.error.EPPIXObjectBusyException;
import com.eppixcomm.eppix.base.error.EPPIXObjectExpiredException;
import com.eppixcomm.eppix.base.error.EPPIXObjectNotFoundException;
import com.eppixcomm.eppix.base.error.EPPIXSeriousException;

/**
 * This is the Data Access Controller interface for the Title Business
 * Object.
 *
 * @author $Author$
 * @version $Revision: 1.1 $
 *
 * @since $jdk$
 */
public interface TitleDAC {
  /**
   * Creates the Title object in the database. titleId is assigned
   * a generated key value.
   *
   * @param titleDMO Title object.
   *
   * @throws EPPIXSeriousException
   */
  public void create(TitleDMO titleDMO) throws EPPIXSeriousException;

  /**
   * Deletes the Title object from the database.
   *
   * @param titleDMO Title object with embedded titleId and
   *        recordVersion.
   *
   * @throws EPPIXSeriousException
   * @throws EPPIXObjectNotFoundException
   * @throws EPPIXObjectExpiredException
   */
  public void delete(TitleDMO titleDMO)
    throws
      EPPIXSeriousException,
      EPPIXObjectNotFoundException,
      EPPIXObjectExpiredException;

  /**
   * Retrieves the Title object from the database.
   *
   * @param titleDMO Title object with embedded languageCode and
   *        either titleId or displayCode. If the object contains both
   *        titleId and displayCode, the titleId is used.
   *
   * @return a populated Title object or null if not found.
   *
   * @throws EPPIXSeriousException
   */
  public TitleDMO get(TitleDMO titleDMO) throws EPPIXSeriousException;

  /**
   * Retrieves a list of Title objects matching the passed in values. If 
   * no values are provided then all Title objects are returned. If no 
   * languageCode is provided then tasks are retrieved described in the language 
   * provided by the user's locale. Partial matching is performed on displayCode 
   * and description.
   *
   * @param state previous state of the list.
   * @param titleDMO Title object.
   *
   * @return DTOList of Title objects.
   *
   * @throws EPPIXSeriousException
   */
  public DTOList getList(DTOListState state, TitleDMO titleDMO)
    throws EPPIXSeriousException;

  /**
   * Locks and retrieves the Title object from the database.
   *
   * @param titleDMO Title object with embedded languageCode and
   *        either titleId or displayCode. If the object contains both
   *        titleId and displayCode, the titleId is used.
   *
   * @return a populated Title object or null if not found.
   *
   * @throws EPPIXSeriousException
   */
  public TitleDMO lock(TitleDMO titleDMO)
    throws EPPIXSeriousException, EPPIXObjectBusyException;

  /**
   * Modifies the Title object in the database.
   *
   * @param titleDMO Title object with embedded titleId and
   *        recordVersion.
   *
   * @throws EPPIXSeriousException
   * @throws EPPIXObjectExpiredException
   * @throws EPPIXObjectNotFoundException
   */
  public void modify(TitleDMO titleDMO)
    throws
      EPPIXSeriousException,
      EPPIXObjectExpiredException,
      EPPIXObjectNotFoundException;
}