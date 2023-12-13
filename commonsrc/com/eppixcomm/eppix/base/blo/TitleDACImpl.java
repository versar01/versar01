/* ====================================================================== *
 * (c) Copyright Eppixcomm Tech Ltd.                                      *
 * All Rights Reserved                                                    *
 *                                                                        *
 * Legal Information                                                      *
 * ====================================================================== */
package com.eppixcomm.eppix.base.blo;

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
 * Title Business Object.
 *
 * @author $Author$
 * @version $Revision: 1.1 $
 */
public class TitleDACImpl extends DAC implements TitleDAC {
  /** Error handler/logger. */
  private static DAOThrower thrower =
    DAOThrower.getDAOThrower(TitleDACImpl.class);
  private Logger logger = thrower.getLogger();

  /**
   * Creates a new TitleDACImpl object.
   * 
   * @param userContext the user's context.
   * @param dao Data Access Object.
   */
  public TitleDACImpl(UserContext userContext, DAO dao) {
    super(userContext, dao, thrower);
  }

  /**
   * Creates the Title object in the database. titleId is assigned
   * a generated key value.
   *
   * @param titleDMO Title object.
   *
   * @throws EPPIXSeriousException
   */
  public void create(TitleDMO titleDMO)
    throws EPPIXSeriousException {

    logger.debug("create( titleDMO )");

    thrower.ifParameterMissing("titleDMO", titleDMO);

    dao.insert(titleDMO);
  }

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
      EPPIXObjectExpiredException {

    logger.debug("delete( titleDMO )");

    thrower.ifParameterMissing("titleDMO", titleDMO);

    dao.delete(titleDMO);
  }

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
  public TitleDMO get(TitleDMO titleDMO)
    throws EPPIXSeriousException {

    logger.debug("get( titleDMO )");

    thrower.ifParameterMissing("titleDMO", titleDMO);

    String languageCode = titleDMO.getLanguageCode();

    if (!DMO.isNull(titleDMO.getTitleId())) {
      return (TitleDMO) dao.get(
        "TitleOuterDescByLang",
        "filterByTitleId",
        new DAOArgs(3).arg(languageCode).arg(languageCode).arg(
          titleDMO.getTitleId()));
    }

    return (TitleDMO) dao.get(
      "TitleWithDescByLang",
      "filterByDisplayCode",
      new DAOArgs(3).arg(languageCode).arg(languageCode).arg(
        titleDMO.getDisplayCode()));
  }

  /**
   * Retrieves a list of Title objects matching the passed in values. If 
   * no values are provided then all Title objects are returned. If no 
   * languageCode is provided then tasks are retrieved described in the language 
   * provided by the user's locale. Partial matching is performed on displayCode 
   * and description.
   *
   * @param state previous state of the list.
   * @param titleDMO Title Data Model Object
   *
   * @return DTOList of Title Data Model Objects.
   *
   * @throws EPPIXSeriousException
   */
  public DTOList getList(DTOListState state, TitleDMO titleDMO)
    throws EPPIXSeriousException {

    logger.debug("getList( state, titleDMO )");

    return dao.getListAbs(state, paramQueryArgs(titleDMO));
  }

  /**
   * Locks and retrieves the Title object from the database.
   *
   * @param titleDMO Title object with embedded titleId.
   *
   * @return a populated Title object or null if not found.
   *
   * @throws EPPIXSeriousException
   */
  public TitleDMO lock(TitleDMO titleDMO)
    throws EPPIXSeriousException, EPPIXObjectBusyException {

    logger.debug("lock( titleDMO )");

    thrower.ifParameterMissing("titleDMO", titleDMO);

    TitleDMO lockedtitleDMO;

    // Lock row without joined columns.
    lockedtitleDMO =
      (TitleDMO) dao.lock(
        "Title",
        "filterByPrimaryKey",
        new DAOArgs(1).arg(titleDMO.getTitleId()));

    //  Populate the object's joined columns.
    if (lockedtitleDMO != null) {
      lockedtitleDMO = get(titleDMO);
    }

    return lockedtitleDMO;
  }

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
      EPPIXObjectNotFoundException {

    logger.debug("modify( titleDMO )");

    dao.update(titleDMO);
  }

  /**
   * Constructs parameterised query arguments.
   *
   * @param titleDMO Title object.
   */
  private DAOParamQueryArgs paramQueryArgs(TitleDMO titleDMO) {

    logger.debug("paramQueryArgs( titleDMO )");

    DAOParamQueryArgs queryArgs =
      new DAOParamQueryArgs("TitleOuterDescByLang", 4).setOrderBy(
        "orderByDisplayCode");

    if (titleDMO != null) {

      String languageCode = titleDMO.getLanguageCode();
      if (DMO.isNull(languageCode)) {
        languageCode = defaultLanguageCode;
      }
      queryArgs.arg(languageCode).arg(languageCode);

      String displayCode = titleDMO.getDisplayCode();

      if (!DMO.isNull(displayCode)) {

        queryArgs
          .setDMLName("TitleWithDescByLang")
          .andFilterBy("DisplayCodeMatch")
          .arg(displayCode + dao.wildcardForAnySequence());
      }

      String description = titleDMO.getDescription();

      if (!DMO.isNull(description)) {

        queryArgs
          .setDMLName("TitleWithDescByLang")
          .andFilterBy("DescriptionMatch")
          .arg(description + dao.wildcardForAnySequence());
      }

    } else {

      queryArgs.arg(defaultLanguageCode).arg(defaultLanguageCode);
    }

    return queryArgs;
  }
}