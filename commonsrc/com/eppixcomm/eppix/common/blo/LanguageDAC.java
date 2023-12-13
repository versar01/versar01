/* ====================================================================== *
 * (c) Copyright Eppixcomm Tech Ltd.                                      *
 * All Rights Reserved                                                    *
 *                                                                        *
 * Legal Information                                                      *
 * ====================================================================== */
package com.eppixcomm.eppix.common.blo;

import com.eppixcomm.eppix.common.data.DTOList;
import com.eppixcomm.eppix.common.data.DTOListState;
import com.eppixcomm.eppix.base.error.EPPIXObjectBusyException;
import com.eppixcomm.eppix.base.error.EPPIXObjectExpiredException;
import com.eppixcomm.eppix.base.error.EPPIXObjectNotFoundException;
import com.eppixcomm.eppix.base.error.EPPIXSeriousException;

/**
 * This is the Data Access Controller interface for the Language Business
 * Object.
 * 
 * @author $Author$
 * @version $Revision: 1.5 $
 * 
 * @since $jdk$
 */
public interface LanguageDAC {

  /**
   * Creates the Language object in the database.
   * 
   * @param languageDMO Language object.
   * 
   * @throws EPPIXSeriousException
   */
  public void create(LanguageDMO languageDMO) throws EPPIXSeriousException;

  /**
   * Deletes the Language object from the database.
   * 
   * @param languageDMO Language object with embedded languageId and
   *        recordVersion.
   * 
   * @throws EPPIXSeriousException
   * @throws EPPIXObjectNotFoundException
   * @throws EPPIXObjectExpiredException
   */
  public void delete(LanguageDMO languageDMO) throws EPPIXSeriousException,
    EPPIXObjectNotFoundException, EPPIXObjectExpiredException;

  /**
   * Returns true if the Language exists.
   * 
   * @param languageId language identifier.
   * 
   * @return true if the Language exists.
   * 
   * @throws EPPIXSeriousException
   */
  public boolean exists(String languageId) throws EPPIXSeriousException;

  /**
   * Retrieves the Language object from the database.
   * 
   * @param languageDMO Language object with embedded languageId and
   *        languageCode.
   * 
   * @return a populated Language object or null if not found.
   * 
   * @throws EPPIXSeriousException
   */
  public LanguageDMO get(LanguageDMO languageDMO) throws EPPIXSeriousException;

  /**
   * Retrieves the Language object identified by the specified languageId from a
   * cache that is populated once for this DAC instance.
   * 
   * @param languageId language identifier.
   * 
   * @return populated Language object.
   * 
   * @throws EPPIXSeriousException
   */
  public LanguageDMO getCached(String languageId) throws EPPIXSeriousException;

  /**
   * Retrieves a list of Language objects matching the passed in values. If no
   * values are provided then all Language objects are returned. If no
   * languageCode is provided then tasks are retrieved described in the language
   * provided by the user's locale. Partial matching is performed on languageId
   * and description.
   * 
   * @param state previous state of the list.
   * @param languageDMO Language object.
   * 
   * @return DTOList of Language objects.
   * 
   * @throws EPPIXSeriousException
   */
  public DTOList getList(DTOListState state, LanguageDMO languageDMO)
    throws EPPIXSeriousException;

  /**
   * Retrieves the Language object that is defined as the 'system language'.
   * 
   * @return the populated 'System' Language object or null if not found.
   * 
   * @throws EPPIXSeriousException
   */
  public LanguageDMO getSystem() throws EPPIXSeriousException;

  /**
   * Locks and retrieves the Language object from the database.
   * 
   * @param languageDMO Language object with embedded languageId and
   *        languageCode.
   * 
   * @return a populated Language object or null if not found.
   * 
   * @throws EPPIXSeriousException
   */
  public LanguageDMO lock(LanguageDMO languageDMO)
    throws EPPIXSeriousException, EPPIXObjectBusyException;

  /**
   * Modifies the Language object in the database.
   * 
   * @param languageDMO Language object with embedded languageId and
   *        recordVersion.
   * 
   * @throws EPPIXSeriousException
   * @throws EPPIXObjectExpiredException
   * @throws EPPIXObjectNotFoundException
   */
  public void modify(LanguageDMO languageDMO) throws EPPIXSeriousException,
    EPPIXObjectExpiredException, EPPIXObjectNotFoundException;
}