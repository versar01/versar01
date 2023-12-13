/* ====================================================================== *
 * (c) Copyright Eppixcomm Tech Ltd.                                      *
 * All Rights Reserved                                                    *
 *                                                                        *
 * Legal Information                                                      *
 * ====================================================================== */
package com.eppixcomm.eppix.common.blo;

import com.eppixcomm.eppix.common.data.DAC;
import com.eppixcomm.eppix.common.data.DMO;
import com.eppixcomm.eppix.common.data.DTOActionTypes;
import com.eppixcomm.eppix.base.error.EPPIXBusinessException;
import com.eppixcomm.eppix.base.error.EPPIXFatalException;
import com.eppixcomm.eppix.base.error.EPPIXSeriousException;
import com.eppixcomm.eppix.base.error.EPPIXUnexpectedException;
import com.eppixcomm.eppix.base.error.Thrower;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

/**
 * Provides the business logic for the Description object. <br>
 * 
 * @author $Author$
 * @version $Revision: 1.4 $
 * 
 * @since $jdk$
 */
public class Description extends CommonBLO implements CommonMessages,
  DTOActionTypes {

  /** Error handler/logger. */
  private static Thrower thrower = Thrower.getThrower(Description.class);
  private Logger logger = thrower.getLogger();

  /** Data Access Controller. */
  private DescriptionDAC dac;

  /** Invoked by the BLOBinder to provide this BLO with its DAC. */
  protected void setDAC(DAC dac) {
    this.dac = (DescriptionDAC) dac;
  }

  /**
   * Creates the null description object for the specified language.
   * 
   * @param languageDMO mandatory Language object with mandatory languageId,
   *        nullDisplayCode, nullDescription and nullExplanation.
   * 
   * @throws EPPIXUnexpectedException
   */
  protected void createNoCode(LanguageDMO languageDMO)
    throws EPPIXUnexpectedException {

    logger.debug("createNoCode( languageDMO )");

    thrower.ifParameterMissing("languageDMO", languageDMO);
    thrower.ifParameterMissing("languageDMO.languageId", languageDMO
      .getLanguageId());

    dac.create(new DescriptionDMO("X", "X", languageDMO.getLanguageId(), null,
      languageDMO.getNullDisplayCode(), languageDMO.getNullDescription(),
      languageDMO.getNullExplanation()));
  }

  /**
   * Deletes all language specific descriptions (displayCode, description and
   * explanation) for the object implementing the HasDescription interface. This
   * method is invoked when the object itself is being deleted.
   * 
   * @param entityId a mandatory internal value used to identify the object type
   *        within a module. e.g., in the ActionManager module; "AT" =
   *        ActionType.
   * @param hasDescription object having language specific descriptions.
   * 
   * @throws EPPIXUnexpectedException
   */
  public void delete(String entityId, HasDescriptions hasDescription)
    throws EPPIXUnexpectedException {

    logger.debug("delete( entityId, hasDescription )");

    thrower.ifParameterMissing("entityId", entityId);
    thrower.ifParameterMissing("hasDescription", hasDescription);
    thrower.ifParameterMissing("hasDescription.recordId", hasDescription
      .getRecordId());
    dac.delete(entityId, hasDescription);
  }

  /**
   * Deletes the noCode/noDesc object for a language
   * 
   * @param descriptionDMO the noCode/noDesc description object.
   * 
   * @throws EPPIXUnexpectedException
   */
  protected void deleteNoCode(LanguageDMO languageDMO)
    throws EPPIXUnexpectedException {

    logger.debug("deleteNoCode( languageDMO )");

    thrower.ifParameterMissing("languageDMO", languageDMO);
    thrower.ifParameterMissing("languageDMO.languageId", languageDMO
      .getLanguageId());

    dac.deleteNoCode(languageDMO.getLanguageId());
  }

  /**
   * Determines whether or not the code object contains a language translation
   * in the system language. Returns a boolean to reflect this!
   * 
   * @param hasDescription a mandatory object having language specific
   *        descriptions. The following interface methods provide: -<br>
   *        getRecordId() - mandatory record identifier. <br>
   *        getLanguageCode() - mandatory code identifying the language. <br>
   *        getDisplayCode() - optional language specific short code. <br>
   *        getDescription() - optional language specific short description.
   *        <br>
   *        getExplanation() - optional language specific long description. <br>
   *        getDescriptions() - optional list of alternative language
   *        description objects. <br>
   *        <br>
   *        Each description object (DescriptionDMO) in the list may be
   *        populated with the following data items: -<br>
   *        languageCode - mandatory code identifying the language. <br>
   *        displayCode - optional language specific short code. <br>
   *        description - optional language specific short description. <br>
   *        explanation - optional language specific long description. <br>
   * @throws EPPIXFatalException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXBusinessException
   *  
   */
  private boolean includesSystemLanguage(HasDescriptions hd)
    throws EPPIXBusinessException, EPPIXUnexpectedException,
    EPPIXFatalException {

    logger.debug("includesSystemLanguage( )");

    if (!hd.getLanguageCode().equals(systemLanguageCode())
      || DMO.isNull(hd.getLanguageCode())) {

      //
      // We know the top level description didn't contain the system language
      // code, so we need to carry on looking through the embedded language
      // translations
      // 
      if (hd.getDescriptions() != null && hd.getDescriptions().size() > 0) {

        DescriptionDMO descriptionDMO = null;

        for (Iterator i = hd.getDescriptions().iterator(); i.hasNext();) {

          descriptionDMO = (DescriptionDMO) i.next();

          if (descriptionDMO.getLanguageCode().equals(systemLanguageCode())
            && !DMO.isNull(descriptionDMO.getDisplayCode())) {

            return true;
          }
        }
      }
    } else {

      return true;

    }

    return false;
  }

  /**
   * Modifies the Description object. If the object does not exist it is
   * created. The displayCode is enforced as being unique for the language and
   * type of object.
   * 
   * @param descriptionDMO Description object with mandatory embedded recordId,
   *        entityId and languageCode. Optionally, displayCode, description and
   *        explanation can be provided.
   * 
   * @throws EPPIXBusinessException <br>
   *         Error Code(s): -<br>
   *         {@link CommonMessages#CMN_DESCRIPTION_001}if the displayCode
   *         already exists. <br>
   * @throws EPPIXUnexpectedException
   */
  private void modify(DescriptionDMO descriptionDMO)
    throws EPPIXBusinessException, EPPIXUnexpectedException,
    EPPIXFatalException {

    logger.debug("modify( descriptionDMO )");

    /*
     * Check mandatory parameters
     */
    thrower.ifParameterMissing("descriptionDMO", descriptionDMO);
    thrower.ifParameterMissing("descriptionDMO.recordId", descriptionDMO
      .getRecordId());
    thrower.ifParameterMissing("descriptionDMO.entityId", descriptionDMO
      .getEntityId());
    thrower.ifParameterMissing("descriptionDMO.languageCode", descriptionDMO
      .getLanguageCode());

    /*
     * Ensure the languageCode is valid.
     */
    common.language().checkExistsLanguageId(descriptionDMO.getLanguageCode());

    /*
     * Modify the Description object if a language translation (languageCode)
     * already exists for the entity instance (recordId, entityId).
     */
    if (dac.existsRecordId(descriptionDMO)) {
      if (dac.isDuplicate(descriptionDMO)) {
        thrower.business(CMN_DESCRIPTION_001, new Object[] {
          descriptionDMO.getDisplayCode(),
          descriptionDMO.getLanguageCode() });
      }
      // There is is already a row for this displayCode but it definately
      // belongs to this
      // RecordId.
      dac.modifyNullNoCode(descriptionDMO);
    } else {
      /*
       * If a displayCode has been provided, ensure that is does not already
       * exist for this entity.
       */
      if (!DMO.isNull(descriptionDMO.getDisplayCode())
        && dac.existsDisplayCode(descriptionDMO)) {
        thrower.business(CMN_DESCRIPTION_001, new Object[] {
          descriptionDMO.getDisplayCode(),
          descriptionDMO.getLanguageCode() });
      }

      dac.createNullNoCode(descriptionDMO);
    }
  }

  /**
   * Modifies or creates language specific descriptions (comprising displayCode,
   * description and explanation) for an object implementing the HasDescription
   * interface. The initial description object is constructed from calls to the
   * getLanguageCode(), getDisplayCode(), getDescription() and getExplanation()
   * interface methods. Alternative languages can be specified by returning a
   * list of description objects (DescriptionDMOs) from the interface's
   * getDescriptions() method. If a duplicate language is specified then the
   * last description object found in the list, for that language, becomes
   * effective. Description objects defining new languages are created, existing
   * ones are modified. At least one valid displayCode (not including the
   * special 'NOCODE' value) must remain defined in the database after the
   * descriptions have been modified. The combination of language and
   * displayCode is enforced as being unique for the object type. i.e., there
   * can only be one displayCode of "MR" where languageCode is "en" (english)
   * and entityId = "T" (object type is Title).
   * 
   * @param entityId a mandatory internal value used to identify the object type
   *        within a module. e.g., in the ActionManager module; "AT" =
   *        ActionType.
   * @param hasDescription a mandatory object having language specific
   *        descriptions. The following interface methods provide: -<br>
   *        getRecordId() - mandatory record identifier. <br>
   *        getLanguageCode() - mandatory code identifying the language. <br>
   *        getDisplayCode() - optional language specific short code. <br>
   *        getDescription() - optional language specific short description.
   *        <br>
   *        getExplanation() - optional language specific long description. <br>
   *        getDescriptions() - optional list of alternative language
   *        description objects. <br>
   *        <br>
   *        Each description object (DescriptionDMO) in the list may be
   *        populated with the following data items: -<br>
   *        languageCode - mandatory code identifying the language. <br>
   *        displayCode - optional language specific short code. <br>
   *        description - optional language specific short description. <br>
   *        explanation - optional language specific long description. <br>
   * 
   * @throws EPPIXBusinessException <br>
   *         Error Code(s): -<br>
   *         {@link CommonMessages#CMN_DESCRIPTION_001}if the displayCode
   *         already exists. <br>
   *         {@link CommonMessages#CMN_DESCRIPTION_002}if no valid displayCodes
   *         are defined.
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   * @deprecated
   */
  public void modify(String entityId, HasDescriptions hasDescription)
    throws EPPIXBusinessException, EPPIXUnexpectedException,
    EPPIXFatalException {

    logger.debug("modify( entityId, hasDescription )");

    /*
     * Check mandatory parameters.
     */
    thrower.ifParameterMissing("entityId", entityId);
    thrower.ifParameterMissing("hasDescription", hasDescription);

    String recordId = hasDescription.getRecordId();
    thrower.ifParameterMissing("hasDescription.recordId", recordId);

    if (!includesSystemLanguage(hasDescription)) {

      thrower.business(CMN_DESCRIPTION_003, systemLanguageCode());
    }

    /*
     * Create/modify the base level description.
     */
    DescriptionDMO descriptionDMO = new DescriptionDMO(recordId, entityId,
      hasDescription.getLanguageCode(), null, hasDescription.getDisplayCode(),
      hasDescription.getDescription(), hasDescription.getExplanation());

    modify(descriptionDMO);

    /*
     * Create/modify additional language specific descriptions (translations).
     */
    List descriptions = hasDescription.getDescriptions();

    if (!DMO.isNull(descriptions)) {
      for (Iterator i = descriptions.iterator(); i.hasNext();) {
        descriptionDMO = (DescriptionDMO) i.next();

        if (descriptionDMO != null) {
          // Give the description its parent recordId and entityId.
          descriptionDMO.setRecordId(recordId);
          descriptionDMO.setEntityId(entityId);

          modify(descriptionDMO);
        }
      }
    }

    if (!dac.isDisplayCodeDefined(entityId, recordId)) {
      thrower.business(CMN_DESCRIPTION_002);
    }
  }

  /**
   * Modifies the null description object for the specified language.
   * 
   * @param languageDMO mandatory Language object with mandatory languageId,
   *        nullDisplayCode, nullDescription and nullExplanation.
   * 
   * @throws EPPIXUnexpectedException
   */
  protected void modifyNoCode(LanguageDMO languageDMO)
    throws EPPIXUnexpectedException {

    logger.debug("modifyNoCode( languageDMO )");

    thrower.ifParameterMissing("languageDMO", languageDMO);
    thrower.ifParameterMissing("languageDMO.languageId", languageDMO
      .getLanguageId());

    dac.modify(new DescriptionDMO("X", "X", languageDMO.getLanguageId(), null,
      languageDMO.getNullDisplayCode(), languageDMO.getNullDescription(),
      languageDMO.getNullExplanation()));
  }

  /**
   * Replaces the null value annotations of the displayCode, description and
   * explanation with null.
   * 
   * @param descriptionDMO mandatory Description object with mandatory
   *        languageCode and optional displayCode, description and explanation.
   * 
   * @return Description object.
   * 
   * @throws EPPIXFatalException
   * @throws EPPIXBusinessException
   * @throws EPPIXSeriousException
   */
  private DescriptionDMO nullNoCode(DescriptionDMO descriptionDMO)
    throws EPPIXBusinessException, EPPIXFatalException,
    EPPIXUnexpectedException {

    LanguageDMO languageDMO = common.language().getCached(
      descriptionDMO.getLanguageCode());

    boolean cloned = false;

    String displayCode = descriptionDMO.getDisplayCode();
    if (!DMO.isNull(displayCode)
      && displayCode.equals(languageDMO.getNullDisplayCode())) {
      if (!cloned) {
        descriptionDMO = (DescriptionDMO) descriptionDMO.clone();
        cloned = true;
      }
      descriptionDMO.setDisplayCode(null);
    }

    String description = descriptionDMO.getDescription();
    if (!DMO.isNull(description)
      && description.equals(languageDMO.getNullDescription())) {
      if (!cloned) {
        descriptionDMO = (DescriptionDMO) descriptionDMO.clone();
        cloned = true;
      }
      descriptionDMO.setDescription(null);
    }

    String explanation = descriptionDMO.getExplanation();
    if (!DMO.isNull(explanation)
      && explanation.equals(languageDMO.getNullExplanation())) {
      if (!cloned) {
        descriptionDMO = (DescriptionDMO) descriptionDMO.clone();
        cloned = true;
      }
      descriptionDMO.setExplanation(null);
    }

    return descriptionDMO;
  }

  /**
   * Populates the value object implementing the HasDescriptions interface with
   * its list of multilingual Description objects, one for each languange known
   * to the system. Where a Description object is not available for a language,
   * then the 'NOCODE' Description object is returned for that language.
   * 
   * @param entityId a mandatory internal value used to identify the object type
   *        within a module. e.g., in the ActionManager module; "AT" =
   *        ActionType.
   * @param hasDescription a mandatory object having language specific
   *        descriptions. The following interface methods provide: -<br>
   *        getRecordId() - mandatory record identifier. <br>
   *        setDescriptions() - used to populate the embeded list. <br>
   * 
   * @throws EPPIXUnexpectedException
   */
  public void populate(String entityId, HasDescriptions hasDescriptions)
    throws EPPIXUnexpectedException {

    logger.debug("populate( entityId, hasDescriptions )");

    dac.populate(entityId, hasDescriptions);
  }

  /**
   * Puts the specified Description into the map keyed by languageCode. New
   * Description objects are flagged as requiring insertion into the database,
   * whereas existing Description objects are flagged as requiring updating to
   * the database.
   * 
   * @param descLangMap Map object.
   * @param descriptionDMO Description object with embedded languageCode.
   * 
   * @throws EPPIXBusinessException <br>
   *         Error Code(s): -<br>
   *         {@link CommonMessages#CMN_LANGUAGE_000}if the Language does not
   *         exist.
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  private void save(Map descLangMap, DescriptionDMO descriptionDMO)
    throws EPPIXBusinessException, EPPIXUnexpectedException,
    EPPIXFatalException {

    String languageCode = descriptionDMO.getLanguageCode();
    thrower.ifParameterMissing("descriptionDMO.languageCode", languageCode);

    DescriptionDMO mapDescriptionDMO = (DescriptionDMO) descLangMap
      .get(languageCode);

    if (mapDescriptionDMO != null) {
      if (mapDescriptionDMO.getAction() == ACTION_INSERT) {
        descriptionDMO.actionInsert();
      } else {
        descriptionDMO.actionUpdate();
      }
    } else {
      descriptionDMO.actionInsert();
    }
    descLangMap.put(languageCode, descriptionDMO);
  }

  /**
   * Modifies or creates language specific descriptions (comprising displayCode,
   * description and explanation) for an object implementing the HasDescription
   * interface. The initial description object is constructed from calls to the
   * getLanguageCode(), getDisplayCode(), getDescription() and getExplanation()
   * interface methods. Alternative languages can be specified by returning a
   * list of description objects (DescriptionDMOs) from the interface's
   * getDescriptions() method. If a duplicate language is specified then the
   * last description object found in the list, for that language, becomes
   * effective. Description objects defining new languages are created, existing
   * ones are modified. At least one valid displayCode (not including the
   * special 'NOCODE' value) must remain defined in the database after the
   * descriptions have been modified. The combination of language and
   * displayCode is enforced as being unique for the object type. i.e., there
   * can only be one displayCode of "MR" where languageCode is "en" (english)
   * and entityId = "T" (object type is Title).
   * 
   * @param entityId a mandatory internal value used to identify the object type
   *        within a module. e.g., in the ActionManager module; "AT" =
   *        ActionType.
   * @param hasDescription a mandatory object having language specific
   *        descriptions. The following interface methods provide: -<br>
   *        getRecordId() - mandatory record identifier. <br>
   *        getLanguageCode() - mandatory code identifying the language. <br>
   *        getDisplayCode() - optional language specific short code. <br>
   *        getDescription() - optional language specific short description.
   *        <br>
   *        getExplanation() - optional language specific long description. <br>
   *        getDescriptions() - optional list of alternative language
   *        description objects. <br>
   *        <br>
   *        Each description object (DescriptionDMO) in the list may be
   *        populated with the following data items: -<br>
   *        languageCode - mandatory code identifying the language. <br>
   *        displayCode - optional language specific short code. <br>
   *        description - optional language specific short description. <br>
   *        explanation - optional language specific long description. <br>
   * 
   * @throws EPPIXBusinessException <br>
   *         Error Code(s): -<br>
   *         {@link CommonMessages#CMN_DESCRIPTION_001}if the displayCode
   *         already exists. <br>
   *         {@link CommonMessages#CMN_DESCRIPTION_002}if no valid displayCodes
   *         are defined. {@link CommonMessages#CMN_LANGUAGE_000}if the
   *         Language does not exist.
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public void save(String entityId, HasDescriptions hasDescriptions)
    throws EPPIXBusinessException, EPPIXUnexpectedException,
    EPPIXFatalException {

    save(entityId, hasDescriptions, true);
  }

  /**
   * Modifies or creates language specific descriptions (comprising displayCode,
   * description and explanation) for an object implementing the HasDescription
   * interface. The initial description object is constructed from calls to the
   * getLanguageCode(), getDisplayCode(), getDescription() and getExplanation()
   * interface methods. Alternative languages can be specified by returning a
   * list of description objects (DescriptionDMOs) from the interface's
   * getDescriptions() method. If a duplicate language is specified then the
   * last description object found in the list, for that language, becomes
   * effective. Description objects defining new languages are created, existing
   * ones are modified. At least one valid displayCode (not including the
   * special 'NOCODE' value) must remain defined in the database after the
   * descriptions have been modified.
   * 
   * @param entityId a mandatory internal value used to identify the object type
   *        within a module. e.g., in the ActionManager module; "AT" =
   *        ActionType.
   * @param hasDescription a mandatory object having language specific
   *        descriptions. The following interface methods provide: -<br>
   *        getRecordId() - mandatory record identifier. <br>
   *        getLanguageCode() - mandatory code identifying the language. <br>
   *        getDisplayCode() - optional language specific short code. <br>
   *        getDescription() - optional language specific short description.
   *        <br>
   *        getExplanation() - optional language specific long description. <br>
   *        getDescriptions() - optional list of alternative language
   *        description objects. <br>
   *        <br>
   *        Each description object (DescriptionDMO) in the list may be
   *        populated with the following data items: -<br>
   *        languageCode - mandatory code identifying the language. <br>
   *        displayCode - optional language specific short code. <br>
   *        description - optional language specific short description. <br>
   *        explanation - optional language specific long description. <br>
   * @param checkDuplicates boolean flag; when 'true' the combination of
   *        language and displayCode is enforced as being unique for the object
   *        type. i.e., there can only be one displayCode of "MR" where
   *        languageCode is "en" (english) and entityId = "T" (object type is
   *        Title).
   * 
   * @throws EPPIXBusinessException <br>
   *         Error Code(s): -<br>
   *         {@link CommonMessages#CMN_DESCRIPTION_001}if the displayCode
   *         already exists. <br>
   *         {@link CommonMessages#CMN_DESCRIPTION_002}if no valid displayCodes
   *         are defined. {@link CommonMessages#CMN_LANGUAGE_000}if the
   *         Language does not exist.
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public void save(
    String entityId,
    HasDescriptions hasDescriptions,
    boolean checkDuplicates) throws EPPIXBusinessException,
    EPPIXUnexpectedException, EPPIXFatalException {

    logger.debug("save( entityId, hasDescriptions, checkDuplicates )");

    /*
     * Check mandatory parameters.
     */
    thrower.ifParameterMissing("entityId", entityId);
    thrower.ifParameterMissing("hasDescriptions", hasDescriptions);
    String recordId = hasDescriptions.getRecordId();
    thrower.ifParameterMissing("hasDescription.recordId", recordId);

    // Retrieve the list of existing Description objects for the entity.
    List descriptions = dac.getList(entityId, recordId);
    // Map the existing descriptions keyed by languageCode.
    Map descLangMap = new HashMap(descriptions.size());
    DescriptionDMO descriptionDMO = null;
    for (Iterator i = descriptions.iterator(); i.hasNext();) {
      descriptionDMO = (DescriptionDMO) i.next();
      descLangMap.put(descriptionDMO.getLanguageCode(), descriptionDMO);
    }

    // Save the top-level description to the map.
    if (!DMO.isNull(hasDescriptions.getLanguageCode())) {
      save(descLangMap, new DescriptionDMO(entityId, hasDescriptions));
    }

    // Save all descriptions from the embedded list to the map.
    descriptions = hasDescriptions.getDescriptions();
    if (descriptions != null) {
      for (Iterator i = descriptions.iterator(); i.hasNext();) {
        descriptionDMO = (DescriptionDMO) i.next();
        if (descriptionDMO != null) {
          descriptionDMO.setEntityId(entityId);
          descriptionDMO.setRecordId(recordId);
          save(descLangMap, descriptionDMO);
        }
      }
    }

    // Validate the descriptions.
    boolean includesDisplayCode = false;
    boolean includesSystemLanguage = false;
    for (Iterator i = descLangMap.values().iterator(); i.hasNext();) {

      descriptionDMO = (DescriptionDMO) i.next();

      String languageCode = descriptionDMO.getLanguageCode();
      LanguageDMO languageDMO = common.language().getCached(languageCode);

      String displayCode = descriptionDMO.getDisplayCode();
      if (!DMO.isNull(displayCode)
        && !displayCode.equals(languageDMO.getNullDisplayCode())) {

        includesDisplayCode = true;

        // Ensure this is not a duplicate displayCode.
        if (checkDuplicates && dac.isDuplicate(descriptionDMO)) {
          // Display Code already exists: displayCode=$0, languageCode=$1
          thrower.business(CMN_DESCRIPTION_001, new Object[] {
            displayCode,
            languageCode });
        }
        if (languageCode.equals(systemLanguageCode())) {
          includesSystemLanguage = true;
        }
      }
    }
    if (!includesDisplayCode) {
      // At least one Display Code must be defined.
      thrower.business(CMN_DESCRIPTION_002);
    }
    if (!includesSystemLanguage) {
      // A displayCode must be defined for the system language:
      // systemLanguage=$0
      thrower.business(CMN_DESCRIPTION_003, systemLanguageCode());
    }

    // Save the descriptions to the database.
    for (Iterator i = descLangMap.values().iterator(); i.hasNext();) {

      descriptionDMO = (DescriptionDMO) i.next();

      if (descriptionDMO.getAction() == ACTION_INSERT) {
        dac.create(nullNoCode(descriptionDMO));
      } else if (descriptionDMO.getAction() == ACTION_UPDATE) {
        dac.modify(nullNoCode(descriptionDMO));
      }
      descriptionDMO.actionNone();
    }
  }
}