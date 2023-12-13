/* ====================================================================== *
 * (c) Copyright Eppixcomm Tech Ltd.                                      *
 * All Rights Reserved                                                    *
 *                                                                        *
 * Legal Information                                                      *
 * ====================================================================== */
package com.eppixcomm.eppix.common.blo;

import java.util.List;

import com.eppixcomm.eppix.base.error.EPPIXObjectExpiredException;
import com.eppixcomm.eppix.base.error.EPPIXObjectNotFoundException;
import com.eppixcomm.eppix.base.error.EPPIXSeriousException;

/**
 * This is the Data Access Controller interface for the EnumeratedType Business
 * Object.
 * 
 * @author $Author$
 * @version $Revision: 1.2 $
 * 
 * @since $jdk$
 */
public interface EnumeratedTypeDAC {

  /**
   * Retrieves an EnumeratedType object from the database.
   * 
   * @param enumerated Enumerated object with embedded recordId, entityId and
   *        languageCode.
   * 
   * @returns EnumeratedType object.
   * 
   * @throws EPPIXSeriousException
   */
  public EnumeratedTypeDMO get(Enumerated enumerated)
    throws EPPIXSeriousException;

  /**
   * Retrieves a list of EnumeratedType objects from the database.
   * 
   * @param enumeratedT Enumerated object with embedded entityId and
   *        languageCode.
   * 
   * @return list of EnumeratedType objects.
   * 
   * @throws EPPIXSeriousException
   */
  public List getList(Enumerated enumerated) throws EPPIXSeriousException;

  /**
   * Modifies the Enumerated object in the database.
   * 
   * @param enumerated Enumerated object with embedded recordId, entityId and
   *        recordVersion.
   * 
   * @throws EPPIXSeriousException
   * @throws EPPIXObjectExpiredException
   * @throws EPPIXObjectNotFoundException
   */
  public void modify(Enumerated enumerated) throws EPPIXSeriousException,
    EPPIXObjectExpiredException, EPPIXObjectNotFoundException;
}