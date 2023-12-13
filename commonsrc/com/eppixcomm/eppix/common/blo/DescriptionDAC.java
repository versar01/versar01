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
 * This is the Data Access Controller interface for the Description Business
 * Object.
 * 
 * @author $Author$
 * @version $Revision: 1.4 $
 * 
 * @since $jdk$
 */
public interface DescriptionDAC {

  /**
   * Creates a NOCODE/NODESC object for a specific language.
   * 
   * @param descriptionDMO description object for the NOCODE/NODESC object of a
   *        language
   * 
   * @throws EPPIXSeriousException
   */
  public void create(DescriptionDMO descriptionDMO)
    throws EPPIXSeriousException;

  /**
   * Creates a language specific description object in the database.
   * 
   * @param descriptionDMO description object must contain a validated
   *        languageCode.
   * 
   * @throws EPPIXSeriousException
   */
  public void createNullNoCode(DescriptionDMO descriptionDMO)
    throws EPPIXSeriousException;

  /**
   * Deletes all language specific descriptions for the object implementing the
   * HasDescription interface.
   * 
   * @param entityId a mandatory internal value used to identify the object type
   *        within a module.
   * @param hasDescription object having language specific descriptions.
   * 
   * @throws EPPIXSeriousException
   */
  public void delete(String entityId, HasDescriptions hasDescription)
    throws EPPIXSeriousException;

  /**
   * Deleted a NOCODE/NODESC object for a specific language.
   * 
   * @param languageCode languageCode of the NOCODE/NODESC object of a language
   * 
   * @throws EPPIXSeriousException
   */
  public void deleteNoCode(String languageCode) throws EPPIXSeriousException;

  /**
   * Tests whether a Description object exists for the specified displayCode,
   * entityId and languageCode.
   * 
   * @param descriptionDMO Description object with embedded displayCode,
   *        entityId and languageCode.
   * 
   * @return true if a Description object exists.
   * 
   * @throws EPPIXSeriousException
   */
  public boolean existsDisplayCode(DescriptionDMO descriptionDMO)
    throws EPPIXSeriousException;

  /**
   * Tests whether the displayCode arg already exists for an entityId &
   * languageCode and a recordId differing to the arg passed in, in order to
   * stop duplicates
   * 
   * @param descriptionDMO Description object with embedded displayCode,
   *        recordId, entityId and languageCode.
   * 
   * @return true if a Description object exists.
   * 
   * @throws EPPIXSeriousException
   */
  public boolean isDuplicate(DescriptionDMO descriptionDMO)
    throws EPPIXSeriousException;

  /**
   * Tests whether a Description object exists for the specified recordId,
   * entityId and languageCode.
   * 
   * @param descriptionDMO Description object with embedded recordId, entityId
   *        and languageCode.
   * 
   * @return true if a Description object exists.
   * 
   * @throws EPPIXSeriousException
   */
  public boolean existsRecordId(DescriptionDMO descriptionDMO)
    throws EPPIXSeriousException;

  /**
   * Retrieves a list of Description objects for the specified entity.
   * 
   * @param entityId - entity identifier.
   * @param recordId - record identifier of the entity.
   * 
   * @return list of Description objects.
   * 
   * @throws EPPIXSeriousException
   */
  public List getList(String entityId, String recordId)
    throws EPPIXSeriousException;

  //  /**
  //   * Retrieves the special 'NOCODE' Description object for the specified
  //   * languageCode.
  //   *
  //   * @param languageCode language code.
  //   *
  //   * @return Description object.
  //   *
  //   * @throws EPPIXSeriousException if the description object does not exist.
  //   */
  //  public DescriptionDMO getNoCode(String languageCode)
  //    throws EPPIXSeriousException;

  /**
   * Tests whether a displayCode has been defined for the specified entityId and
   * recordId.
   * 
   * @param entityId entity identifier
   * @param recordId record identifier
   * 
   * @return true if a displayCode has been defined.
   * 
   * @throws EPPIXSeriousException
   */
  public boolean isDisplayCodeDefined(String entityId, String recordId)
    throws EPPIXSeriousException;

  public boolean isNullDisplayCode(DescriptionDMO descriptionDMO)
    throws EPPIXSeriousException;

  /**
   * Modifies a NOCODE/NODESC object for a specific language.
   * 
   * @param descriptionDMO description object for the NOCODE/NODESC object of a
   *        language
   * 
   * @throws EPPIXSeriousException
   */
  public void modify(DescriptionDMO descriptionDMO)
    throws EPPIXSeriousException, EPPIXObjectNotFoundException,
    EPPIXObjectExpiredException;

  /**
   * Modifies the language specific description object in the database.
   * 
   * @param descriptionDMO description object must contain a validated
   *        languageCode.
   * 
   * @throws EPPIXSeriousException
   * @throws EPPIXObjectNotFoundException
   * @throws EPPIXObjectExpiredException
   */
  public void modifyNullNoCode(DescriptionDMO descriptionDMO)
    throws EPPIXSeriousException, EPPIXObjectNotFoundException,
    EPPIXObjectExpiredException;

  /**
   * Populates the value object implementing the HasDescriptions interface with
   * its list of multilingual Description objects.
   * 
   * @param entityId a mandatory internal value used to identify the object type
   *        within a module. e.g., in the ActionManager module; "AT" =
   *        ActionType.
   * @param hasDescription a mandatory object having language specific
   *        descriptions. The following interface methods provide: -<br>
   *        getRecordId() - mandatory record identifier. <br>
   *        setDescriptions() - used to populate the embeded list. <br>
   * 
   * @throws EPPIXSeriousException
   */
  public void populate(String entityId, HasDescriptions hasDescriptions)
    throws EPPIXSeriousException;
}