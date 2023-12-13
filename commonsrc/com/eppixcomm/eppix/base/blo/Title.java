/* ====================================================================== *
 * (c) Copyright Eppixcomm Tech Ltd.                                      *
 * All Rights Reserved                                                    *
 *                                                                        *
 * Legal Information                                                      *
 * ====================================================================== */
package com.eppixcomm.eppix.base.blo;

import com.eppixcomm.eppix.common.blo.CommonBLO;
import com.eppixcomm.eppix.common.blo.CommonMessages;
import com.eppixcomm.eppix.common.data.DAC;
import com.eppixcomm.eppix.common.data.DMO;
import com.eppixcomm.eppix.common.data.DTOActionTypes;
import com.eppixcomm.eppix.common.data.DTOList;
import com.eppixcomm.eppix.common.data.DTOListState;
import com.eppixcomm.eppix.base.error.EPPIXBusinessException;
import com.eppixcomm.eppix.base.error.EPPIXFatalException;
import com.eppixcomm.eppix.base.error.EPPIXUnexpectedException;
import com.eppixcomm.eppix.base.error.Thrower;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;

/**
 * Provides the business logic for the Title object.
 * 
 * @author $Author$
 * @version $Revision: 1.1 $
 * 
 * @since $jdk$
 */
public abstract class Title extends CommonBLO
  implements
    CommonMessages,
    DTOActionTypes {

  /** Error handler/logger. */
  private static Thrower thrower = Thrower.getThrower(Title.class);
  private Logger logger = thrower.getLogger();

  /** Internal description entity identifier. */
  private static final String ENTITY_ID = "T";

  /** Data Access Controller. */
  private TitleDAC dac;

  /** Invoked by the BLOBinder to provide this BLO with its DAC. */
  protected void setDAC(DAC dac) {
    this.dac = (TitleDAC) dac;
  }

  /**
   * Creates the Title object with its language specific display codes and
   * descriptions. Many languages can be specified by populating the embedded
   * list of description objects. If a duplicate language is specified then the
   * last description object found in the list, for that language, becomes
   * effective. At least one valid display code (not including the special
   * 'NOCODE' value) must be provided, either via the embedded display code data
   * item or via one of the embedded description objects. The combination of
   * language and displayCode is enforced as being unique across all Title
   * objects.
   * 
   * @param titleDMO Title object <br>
   *        The following embedded data items may be set: -<br>
   *        languageCode - optional code identifying the language. If
   *        languageCode is not provided, the default working language is
   *        assumed. <br>
   *        displayCode - optional language specific short code. <br>
   *        description - optional language specific short description. <br>
   *        explanation - optional language specific long description. <br>
   *        descriptions - optional list of description objects. <br>
   *        <br>
   *        Each embedded description object may be populated with the following
   *        data items: -<br>
   *        languageCode - mandatory code identifying the language. <br>
   *        displayCode - optional language specific short code. <br>
   *        description - optional language specific short description. <br>
   *        explanation - optional language specific long description. <br>
   * 
   * @return populated Title object.
   * 
   * @throws EPPIXBusinessException <br>
   *         Message Code(s): -<br>
   *         {@link CommonMessages#CMN_DESCRIPTION_001}if a displayCode already
   *         exists <br>
   *         {@link CommonMessages#CMN_DESCRIPTION_002}if a displayCode is not
   *         defined <br>
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public TitleDMO create(TitleDMO titleDMO) throws EPPIXBusinessException,
    EPPIXUnexpectedException, EPPIXFatalException {

    logger.debug("create( titleDMO )");

    /*
     * Check embedded parameters.
     */
    thrower.ifParameterMissing("titleDMO", titleDMO);

    // Ensure titleId and recordVersion have not been provided.
    thrower.ifParameterExists("titleDMO.titleId", titleDMO.getTitleId());
    thrower.ifParameterExists("titleDMO.recordVersion", titleDMO
      .getRecordVersion());

    // Default languageCode if not provided.
    if (DMO.isNull(titleDMO.getLanguageCode())) {
      titleDMO.setLanguageCode(defaultLanguageCode);
    }

    dac.create(titleDMO);
    // Save the language specific descriptions.
    common.description().save(ENTITY_ID, titleDMO);

    return get(titleDMO, true, false);
  }

  /**
   * Deletes the Title object together with all associated language
   * translations. The Title object will only be deleted if it is not referenced
   * by other objects.
   * 
   * @param titleDMO Title object <br>
   *        The following embedded data items may be set: -<br>
   *        titleId - mandatory record identifier used to retrieve the Title.
   *        <br>
   *        recordVersion - mandatory version number. <br>
   * 
   * @throws EPPIXBusinessException <br>
   *         Message Code(s): -<br>
   *         {@link CommonMessages#CMN_TITLE_000}if the Title does not exist.
   *         <br>
   *         {@link CommonMessages#CMN_TITLE_002}if the Title has been updated
   *         by another user. <br>
   *         {@link CommonMessages#CMN_TITLE_003}if the Title is in use by
   *         another object. <br>
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public void delete(TitleDMO titleDMO) throws EPPIXBusinessException,
    EPPIXUnexpectedException, EPPIXFatalException {

    logger.debug("delete( titleDMO )");

    thrower.ifParameterMissing("titleDMO", titleDMO);

    // Lock the Title object.
    TitleDMO lockedTitleDMO = lock(titleDMO);

    // Is the Title being referenced by other objects?
    if (isUsed(lockedTitleDMO)) {
      // Unable to delete Title because it is in use: titleId=$0,
      // displayCode=$1, languageCode=$2
      thrower.business(CMN_TITLE_003, new Object[]{lockedTitleDMO.getTitleId(),
        lockedTitleDMO.getDisplayCode(), lockedTitleDMO.getLanguageCode()});
    }

    dac.delete(lockedTitleDMO);
    common.description().delete(ENTITY_ID, lockedTitleDMO);
  }

  /**
   * Retrieves the basic Title object containing its language specific
   * description.
   * 
   * @param titleDMO Title object <br>
   *        The following embedded data items may be set: -<br>
   *        titleId - optional record identifier used to retrieve the Title. If
   *        titleId is not provided, retrieval is attempted using displayCode
   *        and languageCode. <br>
   *        languageCode - optional code identifying the language. If
   *        languageCode is not provided, the default working language is
   *        assumed. <br>
   *        displayCode - optional (mandatory when titleId not provided)
   *        language specific short code. <br>
   * 
   * @return populated Title object.
   * 
   * @throws EPPIXBusinessException <br>
   *         Message Code(s): -<br>
   *         {@link CommonMessages#CMN_TITLE_000}if the Title does not exist.
   *         <br>
   *         {@link CommonMessages#CMN_LANGUAGE_000}if the languageCode is
   *         invalid. <br>
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public TitleDMO get(TitleDMO titleDMO) throws EPPIXBusinessException,
    EPPIXUnexpectedException, EPPIXFatalException {
    return get(titleDMO, false, false);
  }

  /**
   * Retrieves the Title object containing its language specific description,
   * alternative descriptions and isUsed indicator.
   * 
   * @param titleDMO Title object <br>
   *        The following embedded data items may be set: -<br>
   *        titleId - optional record identifier used to retrieve the Title. If
   *        titleId is not provided, retrieval is attempted using displayCode
   *        and languageCode. <br>
   *        languageCode - optional code identifying the language. If
   *        languageCode is not provided, the default working language is
   *        assumed. <br>
   *        displayCode - optional (mandatory when titleId not provided)
   *        language specific short code. <br>
   * @param getDesc when true all language descriptions are retrieved for the
   *        Title object.
   * @param getIsUsed when true the isUsed field is populated to indicate
   *        whether the Title object is beging referenced by other objects and
   *        hence can not be deleted.
   * 
   * @return populated Title object.
   * 
   * @throws EPPIXBusinessException <br>
   *         Message Code(s): -<br>
   *         {@link CommonMessages#CMN_TITLE_000}if the Title does not exist.
   *         <br>
   *         {@link CommonMessages#CMN_LANGUAGE_000}if the languageCode is
   *         invalid. <br>
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public TitleDMO get(TitleDMO titleDMO, boolean getDesc, boolean getIsUsed)
    throws EPPIXBusinessException, EPPIXUnexpectedException,
    EPPIXFatalException {

    logger.debug("get( titleDMO, getDesc, getIsUsed )");

    // Check mandatory parameters.
    thrower.ifParameterMissing("titleDMO", titleDMO);

    // Use the default language if it wasn't provided.
    if (DMO.isNull(titleDMO.getLanguageCode())) {
      titleDMO.setLanguageCode(defaultLanguageCode);
    }

    if (DMO.isNull(titleDMO.getTitleId())) {
      thrower.ifParameterMissing("titleDMO.displayCode", titleDMO
        .getDisplayCode());
    }

    TitleDMO returnTitleDMO;

    if ((returnTitleDMO = dac.get(titleDMO)) == null) {

      // Couldn't find the Title object; ensure that the languageCode is
      // valid.
      common.language().checkExistsLanguageId(titleDMO.getLanguageCode());

      // Title does not exist: titleId=$0, displayCode=$1,
      // languageCode=$2
      thrower.business(CMN_TITLE_000, new Object[]{titleDMO.getTitleId(),
        titleDMO.getDisplayCode(), titleDMO.getLanguageCode()});
    }

    if (getDesc) {
      common.description().populate(ENTITY_ID, returnTitleDMO);
    }

    if (getIsUsed) {
      returnTitleDMO.setIsUsed(Boolean.valueOf(isUsed(returnTitleDMO)));
    }

    return returnTitleDMO;
  }

  /**
   * Retrieves a list of Title objects matching the passed in values. If no
   * values are provided then all Title objects are returned. If no languageCode
   * is provided then tasks are retrieved described in the language provided by
   * the user's locale. Partial matching is performed on displayCode and
   * description.
   * 
   * @param state previous state of the list.
   * @param titleDMO Title object
   * 
   * @return DTOList of Title objects
   * 
   * @throws EPPIXUnexpectedException
   */
  public DTOList getList(DTOListState state, TitleDMO titleDMO)
    throws EPPIXUnexpectedException {

    logger.debug("getList( state, titleDMO )");

    return dac.getList(state, titleDMO);
  }

  /**
   * Returns true if the Title object is in use (being referenced by other
   * objects).
   * 
   * @param titleDMO Title object with embedded titleId.
   * 
   * @return true if the Title object is in use.
   * 
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  abstract protected boolean isUsed(TitleDMO titleDMO)
    throws EPPIXBusinessException, EPPIXUnexpectedException,
    EPPIXFatalException;

  /**
   * Acquires a lock on the Title object.
   * 
   * @param titleDMO an Title object with the following embedded data items: -
   *        <br>
   *        titleId - mandatory internal record identifier. <br>
   *        recordVersion - mandatory record version number. <br>
   *        languageCode - optional language identifier which when not provided
   *        defaults to the user's locale. <br>
   * 
   * @return Title object.
   * 
   * @throws EPPIXBusinessException <br>
   *         Message Code(s): -<br>
   *         {@link CommonMessages#CMN_TITLE_000}if the Title does not exist.
   *         <br>
   *         {@link CommonMessages#CMN_TITLE_002}if the Title has been updated
   *         by another user. <br>
   * @throws EPPIXUnexpectedException
   */
  private TitleDMO lock(TitleDMO titleDMO) throws EPPIXBusinessException,
    EPPIXUnexpectedException, EPPIXFatalException {

    logger.debug("lock( titleDMO )");

    // Check mandatory parameters.
    thrower.ifParameterMissing("titleDMO", titleDMO);
    thrower.ifParameterMissing("titleDMO.titleId", titleDMO.getTitleId());
    thrower.ifParameterMissing("titleDMO.recordVersion", titleDMO
      .getRecordVersion());

    // Default languageCode if not provided.
    if (DMO.isNull(titleDMO.getLanguageCode())) {
      titleDMO.setLanguageCode(defaultLanguageCode);
    }

    TitleDMO lockedTitleDMO = dac.lock(titleDMO);

    if (lockedTitleDMO == null) {

      // Title does not exist: titleId=$0, displayCode=$1,
      // languageCode=$2
      thrower.business(CMN_TITLE_000, new Object[]{titleDMO.getTitleId(),
        titleDMO.getDisplayCode(), titleDMO.getLanguageCode()});
    }

    if (!lockedTitleDMO.getRecordVersion().equals(titleDMO.getRecordVersion())) {
      // Title has been updated by another user: titleId=$0,
      // displayCode=$1, recordVersion=$2
      thrower.business(CMN_TITLE_002, new Object[]{lockedTitleDMO.getTitleId(),
        lockedTitleDMO.getDisplayCode(), lockedTitleDMO.getRecordVersion()});
    }

    return lockedTitleDMO;
  }

  /**
   * Maintains a list of Title objects by creating, modifying or deleteting
   * according to the action specified for each DMO.
   * 
   * @param titleDMOs list of Title objects
   * 
   * @return List of created or modified Title objects.
   * 
   * @throws EPPIXBusinessException <br>
   *         Message Code(s): -<br>
   *         {@link CommonMessages#CMN_TITLE_000}if the Title does not exist.
   *         <br>
   *         {@link CommonMessages#CMN_TITLE_002}if the Title has been updated
   *         by another user. <br>
   *         {@link CommonMessages#CMN_TITLE_003}if the Title is in use by
   *         another object. <br>
   *         {@link CommonMessages#CMN_DESCRIPTION_001}if a displayCode already
   *         exists. <br>
   *         {@link CommonMessages#CMN_DESCRIPTION_002}if a displayCode is not
   *         defined. <br>
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public List maintain(List titleDMOs) throws EPPIXBusinessException,
    EPPIXUnexpectedException, EPPIXFatalException {

    logger.debug("maintain( titleDMOs )");

    thrower.ifParameterMissing("titleDMOs", titleDMOs);

    List returnList = new ArrayList(titleDMOs.size());

    for (Iterator titleItr = titleDMOs.iterator(); titleItr.hasNext();) {
      TitleDMO titleDMO = (TitleDMO) titleItr.next();

      if (titleDMO != null) {
        switch (titleDMO.getAction()) {
        case ACTION_NONE :

          // do nothing
          break;

        case ACTION_INSERT :
          returnList.add(create(titleDMO));

          break;

        case ACTION_UPDATE :
          returnList.add(modify(titleDMO));

          break;

        case ACTION_DELETE :
          delete(titleDMO);

          break;

        default :

          // do nothing
          break;
        }
      }
    }

    return returnList;
  }

  /**
   * Modifies the Title object with its language specific displayCodes and
   * descriptions. Many languages can be specified by populating the embedded
   * list of description objects. If a duplicate language is specified then the
   * last description object found in the list, for that language, becomes
   * effective. Description objects defining new languages are created, existing
   * ones are modified. At least one valid displayCode (not including the
   * special 'NOCODE' value) must remain defined after the descriptions have
   * been modified. The combination of language and displayCode is enforced as
   * being unique across all Title objects.
   * 
   * @param titleDMO Title object <br>
   *        The following embedded data items may be set: -<br>
   *        titleId - mandatory record identifier used to retrieve the Title
   *        object. <br>
   *        recordVersion - mandatory version number. <br>
   *        languageCode - optional language identifier which when not provided
   *        defaults to the user's locale. <br>
   *        displayCode - optional language specific short code. <br>
   *        description - optional language specific short description. <br>
   *        explanation - optional language specific long description. <br>
   *        descriptions - optional list of description objects. <br>
   *        <br>
   *        Each embedded description object may be populated with the following
   *        data items: -<br>
   *        languageCode - mandatory code identifying the language. <br>
   *        displayCode - optional language specific short code. <br>
   *        description - optional language specific short description. <br>
   *        explanation - optional language specific long description. <br>
   * 
   * @return populated Title object.
   * 
   * @throws EPPIXBusinessException <br>
   *         Message Code(s): -<br>
   *         {@link CommonMessages#CMN_TITLE_000}if the Title does not exist.
   *         <br>
   *         {@link CommonMessages#CMN_TITLE_002}if the Title has been updated
   *         by another user. <br>
   *         {@link CommonMessages#CMN_DESCRIPTION_001}if a displayCode already
   *         exists. <br>
   *         {@link CommonMessages#CMN_DESCRIPTION_002}if a displayCode is not
   *         defined. <br>
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public TitleDMO modify(TitleDMO titleDMO) throws EPPIXBusinessException,
    EPPIXUnexpectedException, EPPIXFatalException {

    logger.debug("modify( titleDMO )");

    TitleDMO updateTitleDMO = lock(titleDMO);

    // Copy the fields to be updated.
    updateTitleDMO.setDisplayCode(titleDMO.getDisplayCode());
    updateTitleDMO.setDescription(titleDMO.getDescription());
    updateTitleDMO.setExplanation(titleDMO.getExplanation());
    updateTitleDMO.setDescriptions(titleDMO.getDescriptions());

    /*
     * Increment the recordVersion field.
     */
    dac.modify(updateTitleDMO);

    /*
     * Modify/create the language specific descriptions (translations) for the
     * Title.
     */
    common.description().save(ENTITY_ID, updateTitleDMO);

    return get(updateTitleDMO, true, false);
  }
}