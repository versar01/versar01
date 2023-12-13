/* ====================================================================== *
 * (c) Copyright Eppixcomm Tech Ltd.                                      *
 * All Rights Reserved                                                    *
 *                                                                        *
 * Legal Information                                                      *
 * ====================================================================== */
package com.eppixcomm.eppix.common.blo;

import java.util.List;

import org.apache.log4j.Logger;

import com.eppixcomm.eppix.common.core.UserContext;
import com.eppixcomm.eppix.common.data.DAC;
import com.eppixcomm.eppix.common.data.DAO;
import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DAOThrower;
import com.eppixcomm.eppix.base.error.EPPIXObjectExpiredException;
import com.eppixcomm.eppix.base.error.EPPIXObjectNotFoundException;
import com.eppixcomm.eppix.base.error.EPPIXSeriousException;

/**
 * This is the standard implementation of the Data Access Controller for the
 * EnumeratedType Business Object.
 * 
 * @author $Author$
 * @version $Revision: 1.5 $
 * 
 * @since $jdk$
 */
public class EnumeratedTypeDACImpl extends DAC implements EnumeratedTypeDAC {

  /** Error handler/logger. */
  private static DAOThrower thrower = DAOThrower
    .getDAOThrower(EnumeratedTypeDACImpl.class);
  private Logger logger = thrower.getLogger();

  /**
   * Creates a new EnumeratedTypeDACImpl object.
   * 
   * @param userContext the user's context.
   * @param dao Data Access Object.
   */
  public EnumeratedTypeDACImpl(UserContext userContext, DAO dao) {
    super(userContext, dao, thrower);
  }

  /**
   * Creates a new EnumeratedTypeDACImpl object.
   * 
   * @param userContext the user's context.
   * @param dao Data Access Object.
   * @param thrower exception handler/logger.
   */
  public EnumeratedTypeDACImpl(
    UserContext userContext,
    DAO dao,
    DAOThrower thrower) {
    super(userContext, dao, thrower);
  }

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
    throws EPPIXSeriousException {

    logger.debug("get( enumerated )");

    if (enumerated instanceof EnumAuditTypeDMO) {

      return (EnumeratedTypeDMO) dao.get(
        "EnumAuditTypeOuterDescByLang",
        "filterByPrimaryKey",
        new DAOArgs(3).arg(enumerated.getLanguageCode()).arg(
          enumerated.getLanguageCode()).arg(enumerated.getRecordId()));
    }

    return (EnumeratedTypeDMO) dao.get(
      "EnumeratedTypeOuterDescByLang",
      "filterByPrimaryKey",
      new DAOArgs(4).arg(enumerated.getLanguageCode()).arg(
        enumerated.getLanguageCode()).arg(enumerated.getRecordId()).arg(
        enumerated.getEntityId()));
  }

  /**
   * Retrieves a list of EnumeratedType objects from the database.
   * 
   * @param enumerated Enumerated object with embedded entityId and
   *        languageCode.
   * 
   * @return list of EnumeratedType objects.
   * 
   * @throws EPPIXSeriousException
   */
  public List getList(Enumerated enumerated) throws EPPIXSeriousException {

    logger.debug("getList( enumerated )");

    if (enumerated instanceof EnumAuditTypeDMO) {

      return dao.getList(
        "EnumAuditTypeOuterDescByLang",
        "",
        new DAOArgs(3).arg(enumerated.getLanguageCode()).arg(
          enumerated.getLanguageCode()),
        "orderByDescription");
    }

    return dao.getList(
      "EnumeratedTypeOuterDescByLang",
      "filterByEntityId",
      new DAOArgs(3).arg(enumerated.getLanguageCode()).arg(
        enumerated.getLanguageCode()).arg(enumerated.getEntityId()),
      "orderByDescription");
  }

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
    EPPIXObjectExpiredException, EPPIXObjectNotFoundException {

    logger.debug("modify( enumerated )");

    thrower.ifParameterMissing("enumerated", enumerated);

    if (enumerated instanceof EnumAuditTypeDMO) {

      dao.update(new EnumAuditTypeDBO((EnumAuditTypeDMO) enumerated));

    } else {

      dao.update(new EnumeratedTypeDBO(enumerated));
    }
  }
}