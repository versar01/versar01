/* ====================================================================== *
 * (c) Copyright Eppixcomm Tech Ltd.                                      *
 * All Rights Reserved                                                    *
 *                                                                        *
 * Legal Information                                                      *
 * ====================================================================== */
package com.eppixcomm.eppix.common.blo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

import com.eppixcomm.eppix.common.core.UserContext;
import com.eppixcomm.eppix.common.data.DAC;
import com.eppixcomm.eppix.common.data.DAO;
import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DAOThrower;
import com.eppixcomm.eppix.common.data.DMO;
import com.eppixcomm.eppix.base.error.EPPIXObjectExpiredException;
import com.eppixcomm.eppix.base.error.EPPIXObjectNotFoundException;
import com.eppixcomm.eppix.base.error.EPPIXSeriousException;

/**
 * This is the standard implementation of the Data Access Controller for the
 * Description Business Object.
 * 
 * @author $Author$
 * @version $Revision: 1.5 $
 * 
 * @since $jdk$
 */
public class DescriptionDACImpl extends DAC implements DescriptionDAC {

  /** Error handler/logger. */
  private static DAOThrower thrower = DAOThrower
    .getDAOThrower(DescriptionDACImpl.class);
  private Logger logger = thrower.getLogger();

  private Map noCodeMap = null;

  /**
   * ... remove deprecated method Creates a new ClassificationDACImpl object.
   * 
   * @param dao Data Access Object.
   * @param defaultLanguageCode the working language of the user, dictates which
   *        language specific descriptions are retrieved.
   * 
   * @deprecated
   */
  public DescriptionDACImpl(DAO dao, String defaultLanguageCode) {
    super(thrower, dao, defaultLanguageCode);
  }

  /**
   * ... remove deprecated method Creates a new DescriptionDACImpl object.
   * 
   * @param thrower error handler.
   * @param dao Data Access Object.
   * @param defaultLanguageCode the working language of the user, dictates which
   *        language specific descriptions are retrieved.
   * 
   * @deprecated
   */
  public DescriptionDACImpl(
    DAOThrower thrower,
    DAO dao,
    String defaultLanguageCode) {
    super(thrower, dao, defaultLanguageCode);
  }

  /**
   * Creates a new DescriptionDACImpl object.
   * 
   * @param userContext the user's context.
   * @param dao Data Access Object.
   */
  public DescriptionDACImpl(UserContext userContext, DAO dao) {
    super(userContext, dao, thrower);
  }

  /**
   * Creates a language specific description object in the database.
   * 
   * @param descriptionDMO Description object.
   * 
   * @throws EPPIXSeriousException
   */
  public void create(DescriptionDMO descriptionDMO)
    throws EPPIXSeriousException {

    logger.debug("create( descriptionDMO )");

    thrower.ifParameterMissing("descriptionDMO", descriptionDMO);

    dao.insert(descriptionDMO);
  }

  /**
   * Creates a language specific description object in the database.
   * 
   * @param descriptionDMO Description object.
   * 
   * @throws EPPIXSeriousException
   */
  public void createNullNoCode(DescriptionDMO descriptionDMO)
    throws EPPIXSeriousException {

    logger.debug("createNullNoCode( descriptionDMO )");

    dao.insert(nullNoCode(descriptionDMO));
  }

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
    throws EPPIXSeriousException {

    logger.debug("delete( entityId, hasDescription )");

    thrower.ifParameterMissing("hasDescription", hasDescription);
    dao.delete("Description", "filterByEntityId+RecordId", new DAOArgs(2).arg(
      entityId).arg(hasDescription.getRecordId()));
  }

  /**
   * Deleted a NOCODE/NODESC object for a specific language.
   * 
   * @param languageCode languageCode of the NOCODE/NODESC object of a language
   * 
   * @throws EPPIXSeriousException
   */
  public void deleteNoCode(String languageCode) throws EPPIXSeriousException {

    logger.debug("deleteNoCode( languageCode )");

    thrower.ifParameterMissing("languageCode", languageCode);

    dao.delete(
      "Description",
      "filterByRecordId+EntityId+LanguageCode",
      new DAOArgs(3).arg("X").arg("X").arg(languageCode));
  }

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
    throws EPPIXSeriousException {

    logger.debug("existsDisplayCode( descriptionDMO )");

    thrower.ifParameterMissing("descriptionDMO", descriptionDMO);

    return dao.exists(
      "Description",
      "filterByDisplayCode+EntityId+LanguageCode",
      new DAOArgs(3).arg(descriptionDMO.getDisplayCode()).arg(
        descriptionDMO.getEntityId()).arg(descriptionDMO.getLanguageCode()));
  }

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
    throws EPPIXSeriousException {

    logger.debug("isDuplicate( descriptionDMO )");

    thrower.ifParameterMissing("descriptionDMO", descriptionDMO);

    return dao.exists(
      "Description",
      "filterByDisplayCode+EntityId+IsNotRecordId+LanguageCode",
      new DAOArgs(4).arg(descriptionDMO.getDisplayCode()).arg(
        descriptionDMO.getEntityId()).arg(descriptionDMO.getRecordId()).arg(
        descriptionDMO.getLanguageCode()));
  }

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
    throws EPPIXSeriousException {

    logger.debug("existsRecordId( descriptionDMO )");

    thrower.ifParameterMissing("descriptionDMO", descriptionDMO);

    return dao.exists(descriptionDMO);
  }

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
    throws EPPIXSeriousException {

    logger.debug("getList( entityId, recordId )");

    return dao.getList("Description", "filterByEntityId+RecordId", new DAOArgs(
      2).arg(entityId).arg(recordId), null);
  }

  /**
   * Retrieves the special 'NOCODE' Description object for the specified
   * languageCode.
   * 
   * @param languageCode language code.
   * 
   * @return Description object.
   * 
   * @throws EPPIXSeriousException if the description object does not exist.
   */
  private DescriptionDMO getNoCode(String languageCode)
    throws EPPIXSeriousException {

    logger.debug("getNoCode( languageCode )");

    thrower.ifParameterMissing("languageCode", languageCode);

    if (noCodeMap == null) {
      populateNoCodeMap();
    }

    DescriptionDMO descriptionDMO = (DescriptionDMO) noCodeMap
      .get(languageCode);

    if (descriptionDMO == null) {
      thrower.unexpected("Missing 'NOCODE' description for language: "
        + languageCode);
    }

    return descriptionDMO;
  }

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
    throws EPPIXSeriousException {
    return dao.exists(
      "Description",
      "filterByEntityId+RecordId+IsDisplayCodeDefined",
      new DAOArgs(2).arg(entityId).arg(recordId));
  }

  public boolean isNullDisplayCode(DescriptionDMO descriptionDMO)
    throws EPPIXSeriousException {

    thrower.ifParameterMissing("descriptionDMO", descriptionDMO);

    String displayCode = descriptionDMO.getDisplayCode();

    return DMO.isNull(displayCode)
      || displayCode.equals(getNoCode(descriptionDMO.getLanguageCode())
        .getDisplayCode());
  }

  /**
   * Modifies the language specific description object in the database.
   * 
   * @param descriptionDMO Description object.
   * 
   * @throws EPPIXSeriousException
   */
  public void modify(DescriptionDMO descriptionDMO)
    throws EPPIXSeriousException, EPPIXObjectNotFoundException,
    EPPIXObjectExpiredException {

    logger.debug("modify( descriptionDMO )");

    thrower.ifParameterMissing("descriptionDMO", descriptionDMO);

    dao.update(descriptionDMO);
  }

  /**
   * Modifies the language specific description object in the database.
   * 
   * @param descriptionDMO Description object.
   * 
   * @throws EPPIXSeriousException
   * @throws EPPIXObjectNotFoundException
   * @throws EPPIXObjectExpiredException
   */
  public void modifyNullNoCode(DescriptionDMO descriptionDMO)
    throws EPPIXSeriousException, EPPIXObjectNotFoundException,
    EPPIXObjectExpiredException {

    logger.debug("modifyNullNoCode( descriptionDMO )");

    dao.update(nullNoCode(descriptionDMO));
  }

  /**
   * Returns the description object with 'noCode' values for displayCode,
   * description and explanation, replaced with nulls.
   * 
   * @param descriptionDMO description object.
   * 
   * @return description object with 'noCode' values replaced with nulls.
   * 
   * @throws EPPIXSeriousException
   */
  private DescriptionDMO nullNoCode(DescriptionDMO descriptionDMO)
    throws EPPIXSeriousException {

    logger.debug("nullNoCode( descriptionDMO )");

    thrower.ifParameterMissing("descriptionDMO", descriptionDMO);

    descriptionDMO = (DescriptionDMO) descriptionDMO.clone();

    // Retrieve the special 'noCode' description object.
    DescriptionDMO noCodeDescDMO = getNoCode(descriptionDMO.getLanguageCode());

    if (!DMO.isNull(descriptionDMO.getDisplayCode())
      && descriptionDMO.getDisplayCode().equals(noCodeDescDMO.getDisplayCode())) {
      descriptionDMO.setDisplayCode(null);
    }

    if (!DMO.isNull(descriptionDMO.getDescription())
      && descriptionDMO.getDescription().equals(noCodeDescDMO.getDescription())) {
      descriptionDMO.setDescription(null);
    }

    if (!DMO.isNull(descriptionDMO.getExplanation())
      && descriptionDMO.getExplanation().equals(noCodeDescDMO.getExplanation())) {
      descriptionDMO.setExplanation(null);
    }

    return descriptionDMO;
  }

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
    throws EPPIXSeriousException {

    logger.debug("populate( entityId, hasDescriptions )");

    thrower.ifParameterMissing("entityId", entityId);
    thrower.ifParameterMissing("hasDescriptions", hasDescriptions);
    thrower.ifParameterMissing("hasDescriptions.recordId", hasDescriptions
      .getRecordId());

    hasDescriptions.setDescriptions(dao.getList(
      "DescriptionsAllLangsByEntity",
      "",
      new DAOArgs(2).arg(entityId).arg(hasDescriptions.getRecordId()),
      "orderByLanguageCode"));
  }

  private void populateNoCodeMap() throws EPPIXSeriousException {

    logger.debug("populateNoCodeMap()");

    List descriptions = getList("X", "X");

    int numDescriptions = (descriptions == null) ? 0 : descriptions.size();
    noCodeMap = new HashMap(numDescriptions);

    for (int i = 0; i < numDescriptions; ++i) {
      DescriptionDMO descriptionDMO = (DescriptionDMO) descriptions.get(i);
      noCodeMap.put(descriptionDMO.getLanguageCode(), descriptionDMO);
    }
  }
}