/* ====================================================================== *
 * (c) Copyright Eppixcomm Tech Ltd.                                      *
 * All Rights Reserved                                                    *
 *                                                                        *
 * Legal Information                                                      *
 * ====================================================================== */
package com.eppixcomm.eppix.common.blo;

import com.eppixcomm.eppix.common.blo.DescriptionDMO;
import com.eppixcomm.eppix.common.data.DAC;
import com.eppixcomm.eppix.common.data.DMO;
import com.eppixcomm.eppix.common.data.DTOActionTypes;
import com.eppixcomm.eppix.common.data.DTOList;
import com.eppixcomm.eppix.common.data.DTOListState;
import com.eppixcomm.eppix.base.error.EPPIXBusinessException;
import com.eppixcomm.eppix.base.error.EPPIXFatalException;
import com.eppixcomm.eppix.base.error.EPPIXSeriousException;
import com.eppixcomm.eppix.base.error.EPPIXUnexpectedException;
import com.eppixcomm.eppix.base.error.Thrower;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;

/**
 * Provides the business logic for the Language object.
 * 
 * @author $Author: nhollingsworth $
 * @version $Revision: 1.5 $
 * 
 * @since $jdk$
 */
public abstract class Language extends CommonBLO implements CommonMessages,
  DTOActionTypes {

  /** Error handler/logger. */
  private static Thrower thrower = Thrower.getThrower(Language.class);
  private Logger logger = thrower.getLogger();

  /** Internal description entity identifier. */
  private static final String ENTITY_ID = "L";

  /** Data Access Controller. */
  private LanguageDAC dac;

  /** Invoked by the BLOBinder to provide this BLO with its DAC. */
  protected void setDAC(DAC dac) {
    this.dac = (LanguageDAC) dac;
  }

  /**
   * Creates the Language object with its language specific descriptions. Many
   * languages can be specified by populating the embedded list of description
   * objects. If a duplicate language is specified then the last description
   * object found in the list, for that language, becomes effective.
   * 
   * @param languageDMO Language object <br>
   *        The following embedded data items may be set: -<br>
   *        languageId - unique mandatory language identifier. <br>
   *        languageCode - optional code identifying the language of the
   *        description and explanation. If languageCode is not provided, the
   *        default working language is assumed. <br>
   *        description - optional language specific short description. <br>
   *        explanation - optional language specific long description. <br>
   *        nullDisplayCode - optional, the displayCode that will be retrieved
   *        for an entity when none has been specified for this language. <br>
   *        nullDescription - optional, the description that will be retrieved
   *        for an entity when none has been specified for this language. <br>
   *        nullExplanation - optional, the explanation that will be retrieved
   *        for an entity when none has been specified for this language. <br>
   *        isSystemDefault - mandatory boolean flag; when 'true' this language
   *        becomes the 'system language'. <br>
   *        descriptions - optional list of description objects. <br>
   *        <br>
   *        Each embedded description object may be populated with the following
   *        data items: -<br>
   *        languageCode - mandatory code identifying the language. <br>
   *        description - optional language specific short description. <br>
   *        explanation - optional language specific long description. <br>
   * 
   * @return populated Language object.
   * 
   * @throws EPPIXBusinessException <br>
   *         Message Code(s): -<br>
   *         {@link CommonMessages#CMN_LANGUAGE_001}if a language, identified
   *         by languageId, already exists. <br>
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public LanguageDMO create(LanguageDMO languageDMO)
    throws EPPIXBusinessException, EPPIXUnexpectedException,
    EPPIXFatalException {

    logger.debug("create( languageDMO )");

    /*
     * Check embedded parameters.
     */
    thrower.ifParameterMissing("languageDMO", languageDMO);
    thrower.ifParameterMissing("languageDMO.languageId", languageDMO
      .getLanguageId());
    thrower.ifParameterMissing("languageDMO.isSystemDefault", languageDMO
      .getIsSystemDefault());
    thrower.ifParameterExists("languageDMO.recordVersion", languageDMO
      .getRecordVersion());

    // Default languageCode if not provided.
    if (DMO.isNull(languageDMO.getLanguageCode())) {
      languageDMO.setLanguageCode(defaultLanguageCode);
    }

    if (dac.get(languageDMO) != null) {
      //  Language already exists: languageId=$0
      thrower.business(CMN_LANGUAGE_001, languageDMO.getLanguageId());
    }

    dac.create(languageDMO);
    common.description().createNoCode(languageDMO);
    saveDescriptions(languageDMO);

    return get(languageDMO, true, false);
  }

  /**
   * Check that a language object exists in the database for the specified
   * languageId.
   * 
   * @param languageId Language identifier.
   * 
   * @throws EPPIXBusinessException <br>
   *         Message Code(s): -<br>
   *         {@link CommonMessages#CMN_LANGUAGE_000}if the Language does not
   *         exist.
   * @throws EPPIXUnexpectedException
   */
  public void checkExistsLanguageId(String languageId)
    throws EPPIXBusinessException, EPPIXUnexpectedException {

    logger.debug("checkExistsLanguageId( languageId )");

    if (!dac.exists(languageId)) {
      // Language does not exist: languageId=$0
      thrower.business(CMN_LANGUAGE_000, languageId);
    }
  }
  
  /**
   * Indicates whether a given Language exists in the database
   * <p>
   * <B>Possible application exceptions:</B>
   * <dl><dd>
   *     <li>The normal general errors:
   *          {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>
   * </dd></dl>
   *
   *
   * @return true if the language exists in the database
   *
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
   public boolean exists( LanguageDMO languageDMO )
     throws EPPIXBusinessException, EPPIXUnexpectedException, 
       EPPIXFatalException {
     logger.debug( "exists(customer)" );

     thrower.ifParameterMissing( 
       "languageDMO",
       languageDMO );

     thrower.ifParameterMissing( 
       "languageDMO.languageId",
       languageDMO.getLanguageId(  ) );

     return dac.exists( languageDMO.getLanguageId());
   }

  /**
   * Deletes the Language object together with all associated language
   * translations. The Language object will only be deleted if it is not
   * referenced by other objects.
   * 
   * @param languageDMO Language object <br>
   *        The following embedded data items may be set: -<br>
   *        languageId - mandatory identifier used to retrieve the Language.
   *        <br>
   *        recordVersion - mandatory version number. <br>
   * 
   * @throws EPPIXBusinessException <br>
   *         Message Code(s): -<br>
   *         {@link CommonMessages#CMN_LANGUAGE_000}if the Language does not
   *         exist. <br>
   *         {@link CommonMessages#CMN_LANGUAGE_002}if the Language has been
   *         updated by another user. <br>
   *         {@link CommonMessages#CMN_LANGUAGE_003}if the Language is in use
   *         by another object. <br>
   *         {@link CommonMessages#CMN_LANGUAGE_004}if attempting to delete the
   *         system language. <br>
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public void delete(LanguageDMO languageDMO) throws EPPIXBusinessException,
    EPPIXUnexpectedException, EPPIXFatalException {

    logger.debug("delete( languageDMO )");

    thrower.ifParameterMissing("languageDMO", languageDMO);

    // Lock the Language object.
    LanguageDMO lockedLanguageDMO = lock(languageDMO);

    if (lockedLanguageDMO.getIsSystemDefault().booleanValue()) {

      // Any language that is currently set as 'system language' cannot be
      // deleted; set another language to be 'system language' before attempting
      // to delete this one: languageId=$0
      thrower.business(CMN_LANGUAGE_004, lockedLanguageDMO.getLanguageId());
    }

    // Is the Language being referenced by other objects?
    if (isUsed(lockedLanguageDMO)) {
      // Unable to delete Language because it is in use: languageId=$0
      thrower.business(CMN_LANGUAGE_003, lockedLanguageDMO.getLanguageId());
    }

    dac.delete(lockedLanguageDMO);
    common.description().deleteNoCode(lockedLanguageDMO);
    common.description().delete(ENTITY_ID, lockedLanguageDMO);
  }

  /**
   * Retrieves the basic Language object containing its language specific
   * description.
   * 
   * @param languageDMO Language object <br>
   *        The following embedded data items may be set: -<br>
   *        languageId - mandatory identifier used to retrieve the Language.
   *        <br>
   *        languageCode - optional code identifying the language. If
   *        languageCode is not provided, the default working language is
   *        assumed. <br>
   * 
   * @return populated Language object.
   * 
   * @throws EPPIXBusinessException <br>
   *         Message Code(s): -<br>
   *         {@link CommonMessages#CMN_LANGUAGE_000}if the Language does not
   *         exist. <br>
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public LanguageDMO get(LanguageDMO languageDMO)
    throws EPPIXBusinessException, EPPIXUnexpectedException,
    EPPIXFatalException {

    return get(languageDMO, false, false);
  }

  /**
   * Retrieves the Language object identified by the specified languageId from a
   * cache that is populated once for this BLO instance.
   * 
   * @param languageId language identifier.
   * 
   * @return populated Language object.
   * 
   * @throws EPPIXBusinessException <br>
   *         Message Code(s): -<br>
   *         {@link CommonMessages#CMN_LANGUAGE_000}if the Language does not
   *         exist. <br>
   * @throws EPPIXSeriousException
   */
  public LanguageDMO getCached(String languageId)
    throws EPPIXBusinessException, EPPIXSeriousException {

    LanguageDMO languageDMO = dac.getCached(languageId);

    if (languageDMO == null) {
      // Language does not exist: languageId=$0
      thrower.business(CMN_LANGUAGE_000, languageId);
    }
    return languageDMO;
  }

  /**
   * Retrieves the Language object containing its language specific description,
   * alternative descriptions and isUsed indicator.
   * 
   * @param languageDMO Language object <br>
   *        The following embedded data items may be set: -<br>
   *        languageId - mandatory record identifier used to retrieve the
   *        Language. <br>
   *        languageCode - optional code identifying the language of the
   *        description and explanation. If languageCode is not provided, the
   *        default working language is assumed. <br>
   * @param getDesc when true all language descriptions are retrieved for the
   *        Language object.
   * @param getIsUsed when true the isUsed field is populated to indicate
   *        whether the Language object is beging referenced by other objects
   *        and hence can not be deleted.
   * 
   * @return populated Language object.
   * 
   * @throws EPPIXBusinessException <br>
   *         Message Code(s): -<br>
   *         {@link CommonMessages#CMN_LANGUAGE_000}if the Language does not
   *         exist. <br>
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public LanguageDMO get(
    LanguageDMO languageDMO,
    boolean getDesc,
    boolean getIsUsed) throws EPPIXBusinessException, EPPIXUnexpectedException,
    EPPIXFatalException {

    logger.debug("get( languageDMO, getDesc, getIsUsed )");

    // Check mandatory parameters.
    thrower.ifParameterMissing("languageDMO", languageDMO);
    thrower.ifParameterMissing("languageDMO.languageId", languageDMO
      .getLanguageId());

    // Use the default language if it wasn't provided.
    if (DMO.isNull(languageDMO.getLanguageCode())) {
      languageDMO.setLanguageCode(defaultLanguageCode);
    }

    LanguageDMO returnLanguageDMO;

    if ((returnLanguageDMO = dac.get(languageDMO)) == null) {

      // Language does not exist: languageId=$0
      thrower.business(CMN_LANGUAGE_000, languageDMO.getLanguageId());
    }

    if (getDesc) {
      common.description().populate(ENTITY_ID, returnLanguageDMO);
    }

    if (getIsUsed) {
      returnLanguageDMO.setIsUsed(Boolean.valueOf(isUsed(returnLanguageDMO)));
    }

    return returnLanguageDMO;
  }

  /**
   * Retrieves a list of Language objects matching the passed in values. If no
   * values are provided then all Language objects are returned. If no
   * languageCode is provided then tasks are retrieved described in the language
   * provided by the user's locale. Partial matching is performed on
   * languageCode and description.
   * 
   * @param state previous state of the list.
   * @param languageDMO Language object
   * 
   * @return DTOList of Language objects
   * 
   * @throws EPPIXUnexpectedException
   */
  public DTOList getList(DTOListState state, LanguageDMO languageDMO)
    throws EPPIXUnexpectedException {

    logger.debug("getList( state, languageDMO )");

    return dac.getList(state, languageDMO);
  }

  /**
   * Get the current language object that is flagged as the 'System Language'.
   * 
   * @return populated System Language object.
   * 
   * @throws EPPIXBusinessException <br>
   *         Message Code(s): -<br>
   *         {@link CommonMessages#CMN_LANGUAGE_006}if a System Language does
   *         not exist. <br>
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public LanguageDMO getSystem() throws EPPIXBusinessException,
    EPPIXUnexpectedException, EPPIXFatalException {

    logger.debug("getSystem( )");

    return getSystem(false, false);
  }

  /**
   * Get the current language object that is flagged as the 'System Language'.
   * 
   * @param getDesc boolean flag; when 'true' the embedded list of multilingual
   *        Description objects is populated.
   * @param getIsUsed when true the isUsed field is populated to indicate
   *        whether the Language object is beging referenced by other objects
   *        and hence can not be deleted.
   * 
   * @return populated System Language object.
   * 
   * @throws EPPIXBusinessException <br>
   *         Message Code(s): -<br>
   *         {@link CommonMessages#CMN_LANGUAGE_006}if a System Language does
   *         not exist. <br>
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public LanguageDMO getSystem(boolean getDesc, boolean getIsUsed)
    throws EPPIXBusinessException, EPPIXUnexpectedException,
    EPPIXFatalException {

    logger.debug("getSystem( getDesc, getIsUsed )");

    LanguageDMO returnLanguageDMO = dac.getSystem();

    if (returnLanguageDMO == null) {
      // A language flagged as 'System Language' does not exist!
      thrower.business(CMN_LANGUAGE_006);
    }

    if (getDesc) {
      common.description().populate(ENTITY_ID, returnLanguageDMO);
    }

    if (getIsUsed) {
      returnLanguageDMO.setIsUsed(Boolean.valueOf(isUsed(returnLanguageDMO)));
    }

    return returnLanguageDMO;
  }

  /**
   * Returns true if the Language object is in use (being referenced by other
   * objects).
   * 
   * @param languageDMO Language object with embedded languageId.
   * 
   * @return true if the Language object is in use.
   * 
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  abstract protected boolean isUsed(LanguageDMO languageDMO)
    throws EPPIXBusinessException, EPPIXUnexpectedException,
    EPPIXFatalException;

  /**
   * Acquires a lock on the Language object.
   * 
   * @param languageDMO an Language object with the following embedded data
   *        items: -<br>
   *        languageId - mandatory internal record identifier. <br>
   *        recordVersion - mandatory record version number. <br>
   *        languageCode - optional language identifier which when not provided
   *        defaults to the user's locale. <br>
   * 
   * @return Language object.
   * 
   * @throws EPPIXBusinessException <br>
   *         Message Code(s): -<br>
   *         {@link CommonMessages#CMN_LANGUAGE_000}if the Language does not
   *         exist. <br>
   *         {@link CommonMessages#CMN_LANGUAGE_002}if the Language has been
   *         updated by another user. <br>
   * @throws EPPIXUnexpectedException
   */
  private LanguageDMO lock(LanguageDMO languageDMO)
    throws EPPIXBusinessException, EPPIXUnexpectedException,
    EPPIXFatalException {

    logger.debug("lock( languageDMO )");

    // Check mandatory parameters.
    thrower.ifParameterMissing("languageDMO", languageDMO);
    thrower.ifParameterMissing("languageDMO.languageId", languageDMO
      .getLanguageId());
    thrower.ifParameterMissing("languageDMO.recordVersion", languageDMO
      .getRecordVersion());

    // Default languageCode if not provided.
    if (DMO.isNull(languageDMO.getLanguageCode())) {
      languageDMO.setLanguageCode(defaultLanguageCode);
    }

    LanguageDMO lockedLanguageDMO = dac.lock(languageDMO);

    if (lockedLanguageDMO == null) {

      // Language does not exist: languageId=$0
      thrower.business(CMN_LANGUAGE_000, languageDMO.getLanguageId());
    }

    if (!lockedLanguageDMO.getRecordVersion().equals(
      languageDMO.getRecordVersion())) {
      // Language has been updated by another user: languageId=$0,
      // recordVersion=$1
      thrower.business(CMN_LANGUAGE_002, new Object[] {
        lockedLanguageDMO.getLanguageId(),
        lockedLanguageDMO.getRecordVersion() });
    }

    return lockedLanguageDMO;
  }

  /**
   * Maintains a list of Language objects by creating, modifying or deleteting
   * according to the action specified for each DMO.
   * 
   * @param languageDMOs list of Language objects
   * 
   * @return List of created or modified Language objects.
   * 
   * @throws EPPIXBusinessException <br>
   *         Message Code(s): -<br>
   *         {@link CommonMessages#CMN_LANGUAGE_000}if the Language does not
   *         exist. <br>
   *         {@link CommonMessages#CMN_LANGUAGE_001}if a language, identified
   *         by languageId, already exists. <br>
   *         {@link CommonMessages#CMN_LANGUAGE_002}if the Language has been
   *         updated by another user. <br>
   *         {@link CommonMessages#CMN_LANGUAGE_003}if the Language is in use
   *         by another object. <br>
   *         {@link CommonMessages#CMN_LANGUAGE_004}if attempting to delete the
   *         system language. <br>
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public List maintain(List languageDMOs) throws EPPIXBusinessException,
    EPPIXUnexpectedException, EPPIXFatalException {

    logger.debug("maintain( languageDMOs )");

    thrower.ifParameterMissing("languageDMOs", languageDMOs);

    List returnList = new ArrayList(languageDMOs.size());

    for (Iterator languageItr = languageDMOs.iterator(); languageItr.hasNext();) {
      LanguageDMO languageDMO = (LanguageDMO) languageItr.next();

      if (languageDMO != null) {
        switch (languageDMO.getAction()) {
        case ACTION_NONE:

          // do nothing
          break;

        case ACTION_INSERT:
          returnList.add(create(languageDMO));

          break;

        case ACTION_UPDATE:
          returnList.add(modify(languageDMO));

          break;

        case ACTION_DELETE:
          delete(languageDMO);

          break;

        default:

          // do nothing
          break;
        }
      }
    }

    return returnList;
  }

  /**
   * Modifies the Language object with its language specific descriptions. Many
   * languages can be specified by populating the embedded list of description
   * objects. If a duplicate language is specified then the last description
   * object found in the list, for that language, becomes effective. Description
   * objects defining new languages are created, existing ones are modified.
   * 
   * @param languageDMO Language object <br>
   *        The following embedded data items may be set: -<br>
   *        languageId - mandatory identifier used to retrieve the Language
   *        object. <br>
   *        recordVersion - mandatory version number. <br>
   *        languageCode - optional language identifier for the description and
   *        explanation, which when not provided defaults to the user's locale.
   *        <br>
   *        description - optional language specific short description. <br>
   *        explanation - optional language specific long description. <br>
   *        nullDisplayCode - optional, the displayCode that will be retrieved
   *        for an entity when none has been specified for this language. <br>
   *        nullDescription - optional, the description that will be retrieved
   *        for an entity when none has been specified for this language. <br>
   *        nullExplanation - optional, the explanation that will be retrieved
   *        for an entity when none has been specified for this language. <br>
   *        isSystemDefault - mandatory boolean flag; when 'true' this language
   *        becomes the 'system language'. A business exception will be thrown
   *        if this field is set to 'false' for the current 'system language'.
   *        <br>
   *        descriptions - optional list of description objects. <br>
   *        <br>
   *        Each embedded description object may be populated with the following
   *        data items: -<br>
   *        languageCode - mandatory code identifying the language. <br>
   *        description - optional language specific short description. <br>
   *        explanation - optional language specific long description. <br>
   * 
   * @return populated Language object.
   * 
   * @throws EPPIXBusinessException <br>
   *         Message Code(s): -<br>
   *         {@link CRMMessages#CMN_LANGUAGE_000}if the Language does not
   *         exist. <br>
   *         {@link CRMMessages#CMN_LANGUAGE_002}if the Language has been
   *         updated by another user. <br>
   *         {@link CRMMessages#CMN_LANGUAGE_005}if the isSystemDefault field
   *         of the 'system language' is set to 'false'. <br>
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public LanguageDMO modify(LanguageDMO languageDMO)
    throws EPPIXBusinessException, EPPIXUnexpectedException,
    EPPIXFatalException {

    logger.debug("modify( languageDMO )");

    LanguageDMO lockedLanguageDMO = lock(languageDMO);

    thrower.ifParameterMissing("languageDMO.isSystemDefault", languageDMO
      .getIsSystemDefault());

    if (lockedLanguageDMO.getIsSystemDefault().booleanValue()
      && !languageDMO.getIsSystemDefault().booleanValue()) {
      // The status of this language as 'system language' cannot be changed;
      // set another language to be 'system language': languageId=$0
      thrower.business(CMN_LANGUAGE_005, lockedLanguageDMO.getLanguageId());
    }

    // Copy the fields to be updated.
    lockedLanguageDMO.setDescription(languageDMO.getDescription());
    lockedLanguageDMO.setExplanation(languageDMO.getExplanation());
    lockedLanguageDMO.setDescriptions(languageDMO.getDescriptions());
    lockedLanguageDMO.setNullDisplayCode(languageDMO.getNullDisplayCode());
    lockedLanguageDMO.setNullDescription(languageDMO.getNullDescription());
    lockedLanguageDMO.setNullExplanation(languageDMO.getNullExplanation());
    lockedLanguageDMO.setIsSystemDefault(languageDMO.getIsSystemDefault());

    dac.modify(lockedLanguageDMO);
    common.description().modifyNoCode(lockedLanguageDMO);
    saveDescriptions(lockedLanguageDMO);

    return get(lockedLanguageDMO, true, false);
  }

  /**
   * Modify/create the language specific descriptions (translations) for the
   * Language. Sets the displayCode of each embedded Description to the
   * languageId of the Language object.
   * 
   * @param languageDMO Language object with optional embedded Description
   *        objects.
   */
  private void saveDescriptions(LanguageDMO languageDMO)
    throws EPPIXBusinessException, EPPIXUnexpectedException,
    EPPIXFatalException {

    List descriptions = languageDMO.getDescriptions();
    int numDescriptions = (descriptions == null) ? 0 : descriptions.size();
    for (int i = 0; i < numDescriptions; ++i) {
      DescriptionDMO descriptionDMO = (DescriptionDMO) descriptions.get(i);
      descriptionDMO.setDisplayCode(languageDMO.getLanguageId());
    }
    common.description().save(ENTITY_ID, languageDMO);
  }

  /**
   * Sets the system language to that specified.
   * 
   * @param languageDMO Language object <br>
   *        The following embedded data items may be set: -<br>
   *        languageId - mandatory Language identifier. <br>
   *        recordVersion - mandatory version number. <br>
   * 
   * @return populated Language object.
   * 
   * @throws EPPIXBusinessException <br>
   *         Message Code(s): -<br>
   *         {@link CRMMessages#CMN_LANGUAGE_000}if the Language does not
   *         exist. <br>
   *         {@link CRMMessages#CMN_LANGUAGE_002}if the Language has been
   *         updated by another user. <br>
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public LanguageDMO setSystem(LanguageDMO languageDMO)
    throws EPPIXBusinessException, EPPIXUnexpectedException,
    EPPIXFatalException {

    logger.debug("setSystem( languageDMO )");

    LanguageDMO lockedLanguageDMO = lock(languageDMO);

    if (!lockedLanguageDMO.getIsSystemDefault().booleanValue()) {
      lockedLanguageDMO.setIsSystemDefault(Boolean.TRUE);
      dac.modify(lockedLanguageDMO);
    }
    return get(lockedLanguageDMO, false, false);
  }
}