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

import com.eppixcomm.eppix.common.core.UserContext;
import com.eppixcomm.eppix.common.data.DAC;
import com.eppixcomm.eppix.common.data.DAO;
import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DAOParamQueryArgs;
import com.eppixcomm.eppix.common.data.DAOThrower;
import com.eppixcomm.eppix.common.data.DMO;
import com.eppixcomm.eppix.common.data.DTOList;
import com.eppixcomm.eppix.common.data.DTOListState;
import com.eppixcomm.eppix.base.error.EPPIXObjectBusyException;
import com.eppixcomm.eppix.base.error.EPPIXObjectExpiredException;
import com.eppixcomm.eppix.base.error.EPPIXObjectNotFoundException;
import com.eppixcomm.eppix.base.error.EPPIXSeriousException;

import org.apache.log4j.Logger;

/**
 * This is the standard implementation of the Data Access Controller for the
 * Language Business Object.
 * 
 * @author $Author$
 * @version $Revision: 1.5 $
 */
public class LanguageDACImpl extends DAC implements LanguageDAC {

  /** Error handler/logger. */
  private static DAOThrower thrower = DAOThrower
    .getDAOThrower(LanguageDACImpl.class);
  private Logger logger = thrower.getLogger();

  /** Map used to cache language objects by languageId. */
  private Map cacheMap = null;

  /**
   * Creates a new LanguageDACImpl object.
   * 
   * @param userContext the user's context.
   * @param dao Data Access Object.
   */
  public LanguageDACImpl(UserContext userContext, DAO dao) {
    super(userContext, dao, thrower);
  }

  /**
   * Creates the Language object in the database.
   * 
   * @param languageDMO Language object.
   * 
   * @throws EPPIXSeriousException
   */
  public void create(LanguageDMO languageDMO) throws EPPIXSeriousException {

    logger.debug("create( languageDMO )");

    thrower.ifParameterMissing("languageDMO", languageDMO);

    dao.insert(languageDMO);
    resetSystemLanguage(languageDMO);
  }

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
    EPPIXObjectNotFoundException, EPPIXObjectExpiredException {

    logger.debug("delete( languageDMO )");

    thrower.ifParameterMissing("languageDMO", languageDMO);

    dao.delete(languageDMO);
  }

  /**
   * Returns true if the Language exists.
   * 
   * @param languageId language identifier.
   * 
   * @return true if the Language exists.
   * 
   * @throws EPPIXSeriousException
   */
  public boolean exists(String languageId) throws EPPIXSeriousException {

    logger.debug("exists( languageId )");

    return dao.exists("Language", "filterByPrimaryKey", new DAOArgs(1)
      .arg(languageId));
  }

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
  public LanguageDMO get(LanguageDMO languageDMO) throws EPPIXSeriousException {

    logger.debug("get( languageDMO )");

    thrower.ifParameterMissing("languageDMO", languageDMO);

    String languageCode = languageDMO.getLanguageCode();

    return (LanguageDMO) dao.get(
      "LanguageOuterDescByLang",
      "filterByPrimaryKey",
      new DAOArgs(3).arg(languageCode).arg(languageCode).arg(
        languageDMO.getLanguageId()));
  }

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
  public LanguageDMO getCached(String languageId) throws EPPIXSeriousException {

    logger.debug("getCached( languageId )");

    return (LanguageDMO) getCacheMap().get(languageId);
  }

  /**
   * Populates the cache with language objects retrieved from the database.
   * 
   * @return Map object; keys are languageIds, values are Language objects.
   * 
   * @throws EPPIXSeriousException
   */
  private Map getCacheMap() throws EPPIXSeriousException {

    if (cacheMap == null) {
      List languages = dao.getList(
        "LanguageOuterDescByLang",
        "",
        new DAOArgs(2).arg(defaultLanguageCode).arg(defaultLanguageCode),
        "");
      int numLanguages = (languages == null) ? 0 : languages.size();
      cacheMap = new HashMap(numLanguages);
      for (int i = 0; i < numLanguages; ++i) {
        LanguageDMO languageDMO = (LanguageDMO) languages.get(i);
        cacheMap.put(languageDMO.getLanguageId(), languageDMO);
      }
    }
    return cacheMap;
  }

  /**
   * Retrieves a list of Language objects matching the passed in values. If no
   * values are provided then all Language objects are returned. If no
   * languageCode is provided then tasks are retrieved described in the language
   * provided by the user's locale. Partial matching is performed on languageId
   * and description.
   * 
   * @param state previous state of the list.
   * @param languageDMO Language Data Model Object
   * 
   * @return DTOList of Language Data Model Objects.
   * 
   * @throws EPPIXSeriousException
   */
  public DTOList getList(DTOListState state, LanguageDMO languageDMO)
    throws EPPIXSeriousException {

    logger.debug("getList( state, languageDMO )");

    return dao.getListAbs(state, paramQueryArgs(languageDMO));
  }

  /**
   * Retrieves the Language object that is defined as the 'system language'.
   * 
   * @return the populated 'System' Language object or null if not found.
   * 
   * @throws EPPIXSeriousException
   */
  public LanguageDMO getSystem() throws EPPIXSeriousException {

    logger.debug("getSystem( )");

    return (LanguageDMO) dao.get(
      "LanguageOuterDescByLang",
      "filterByIsSystemDefault",
      new DAOArgs(3).arg(defaultLanguageCode).arg(defaultLanguageCode)
        .arg(true));
  }

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
    throws EPPIXSeriousException, EPPIXObjectBusyException {

    logger.debug("lock( languageDMO )");

    thrower.ifParameterMissing("languageDMO", languageDMO);

    LanguageDMO lockedlanguageDMO;

    // Lock row without joined columns.
    lockedlanguageDMO = (LanguageDMO) dao.lock(
      "Language",
      "filterByPrimaryKey",
      new DAOArgs(1).arg(languageDMO.getLanguageId()));

    //  Populate the object's joined columns.
    if (lockedlanguageDMO != null) {
      lockedlanguageDMO = get(languageDMO);
    }

    return lockedlanguageDMO;
  }

  /**
   * Modifies the Language object in the database.
   * 
   * @param languageDMO Language object with embedded languageCode and
   *        recordVersion.
   * 
   * @throws EPPIXSeriousException
   * @throws EPPIXObjectExpiredException
   * @throws EPPIXObjectNotFoundException
   */
  public void modify(LanguageDMO languageDMO) throws EPPIXSeriousException,
    EPPIXObjectExpiredException, EPPIXObjectNotFoundException {

    logger.debug("modify( languageDMO )");

    thrower.ifParameterMissing("languageDMO", languageDMO);

    dao.update(languageDMO);
    resetSystemLanguage(languageDMO);
  }

  /**
   * Constructs parameterised query arguments.
   * 
   * @param languageDMO Language object.
   */
  private DAOParamQueryArgs paramQueryArgs(LanguageDMO languageDMO) {

    logger.debug("paramQueryArgs( languageDMO )");

    DAOParamQueryArgs queryArgs = new DAOParamQueryArgs(
      "LanguageOuterDescByLang", 4).setOrderBy("orderByPrimaryKey");

    if (languageDMO != null) {

      String languageCode = languageDMO.getLanguageCode();
      if (DMO.isNull(languageCode)) {
        languageCode = defaultLanguageCode;
      }
      queryArgs.arg(languageCode).arg(languageCode);

      String languageId = languageDMO.getLanguageId();

      if (!DMO.isNull(languageId)) {

        queryArgs.andFilterBy("LanguageIdMatch").arg(
          languageId + dao.wildcardForAnySequence());
      }

      String description = languageDMO.getDescription();

      if (!DMO.isNull(description)) {

        queryArgs.setDMLName("LanguageWithDescByLang").andFilterBy(
          "DescriptionMatch").arg(description + dao.wildcardForAnySequence());
      }

    } else {

      queryArgs.arg(defaultLanguageCode).arg(defaultLanguageCode);
    }

    return queryArgs;
  }

  /**
   * If the specified Language object is the 'system language' then the value of
   * the isSystemDefault field of the previous 'system language' is reset to
   * 'false' in the database.
   * 
   * @throws EPPIXSeriousException
   */
  private void resetSystemLanguage(LanguageDMO languageDMO)
    throws EPPIXSeriousException {

    if (languageDMO.getIsSystemDefault().booleanValue()) {
      dao.execute("ResetSystemLanguage", new DAOArgs(1).arg(languageDMO
        .getLanguageId()));
    }
  }
}