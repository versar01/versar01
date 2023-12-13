/* ====================================================================== *
 * (c) Copyright Eppixcomm Tech Ltd.                                      *
 * All Rights Reserved                                                    *
 *                                                                        *
 * Legal Information                                                      *
 * ====================================================================== */
package com.eppixcomm.eppix.common.blo;

import com.eppixcomm.eppix.common.core.UserContext;
import com.eppixcomm.eppix.common.data.DAC;
import com.eppixcomm.eppix.common.data.DAO;
import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DAOThrower;
import com.eppixcomm.eppix.common.data.DMO;
import com.eppixcomm.eppix.common.data.DTOList;
import com.eppixcomm.eppix.common.data.DTOListState;
import com.eppixcomm.eppix.base.error.EPPIXObjectExpiredException;
import com.eppixcomm.eppix.base.error.EPPIXObjectNotFoundException;
import com.eppixcomm.eppix.base.error.EPPIXSeriousException;

import java.util.*;

import org.apache.log4j.Logger;

/**
 * This is the standard implementation of the Data Access Controller for the
 * History Business Object.
 *
 * @author $Author$
 * @version $Revision: 1.1 $
 */
public class HistoryDACImpl extends DAC implements HistoryDAC {
  //~ Static variables/initializers //////////////////////////////////////////

  private static DAOThrower thrower =
    DAOThrower.getDAOThrower(HistoryDACImpl.class);
  private Logger logger = thrower.getLogger();

  //~ Constructors ///////////////////////////////////////////////////////////
  /**
   * Creates a new HistoryDACImpl object.
   *
   * @param dao Data Access Object.
   * @param defaultLanguageCode the working language of the user, dictates
   *        which language specific descriptions are retrieved.
   * 
   * @deprecated
   */
  public HistoryDACImpl(DAO dao, String defaultLanguageCode) {
    super(thrower, dao, defaultLanguageCode);
  }

  /**
   * Creates a new HistoryDACImpl object.
   * 
   * @param userContext the user's context.
   * @param dao Data Access Object.
   */
  public HistoryDACImpl(UserContext userContext, DAO dao) {
    super(userContext, dao, thrower);
  }

  //~ Methods ////////////////////////////////////////////////////////////////
  /**
   * Creates an History Data Model Object.
   *
   * @param historyDMO History Data Model Object.
   *
   * @throws EPPIXSeriousException
   */
  public void create(HistoryDMO historyDMO) throws EPPIXSeriousException {

    logger.debug("create( historyDMO )");

    thrower.ifParameterMissing("historyDMO", historyDMO);

    dao.insert(historyDMO);
  }

  /**
   * Creates History Data Model Objects from a passed in list of History DMOs.
   *
   * @param historys a List of History Data Model Object.
   *
   * @throws EPPIXSeriousException
   */
  public void create(List historys) throws EPPIXSeriousException {

    logger.debug("create( historys )");

    thrower.ifParameterMissing("historys", historys);

    dao.insert((ArrayList) historys);
  }

  /**
   * Deletes an History Data Model Object.
   *
   * @param historyDMO The History Data Model Object to delete.
   *
   * @throws EPPIXSeriousException
   * @throws EPPIXObjectNotFoundException
   * @throws EPPIXObjectExpiredException
   */
  public void delete(HistoryDMO historyDMO)
    throws
      EPPIXSeriousException,
      EPPIXObjectNotFoundException,
      EPPIXObjectExpiredException {

    logger.debug("delete( historyDMO )");

    thrower.ifParameterMissing("historyDMO", historyDMO);

    StringBuffer filterBy = new StringBuffer(80);
    DAOArgs filterArgs = new DAOArgs(4);
    filter(historyDMO, filterBy, filterArgs);

    dao.delete("History", filterBy.toString(), filterArgs);
  }

  /**
   * Constructs the filter for listing history objects.
   *
   * @param historyDMO History Data Model Object.
   * @param filterBy filter name.
   * @param filterArgs filter arguments.
   */
  protected void filter(
    HistoryDMO historyDMO,
    StringBuffer filterBy,
    DAOArgs filterArgs) {

    logger.debug("filter( historyDMO, filterBy, filterArgs )");

    if (historyDMO != null) {
      Integer historyDefnId = historyDMO.getHistoryDefnId();

      if (!DMO.isNull(historyDefnId)) {
        filterBy.append("HistoryDefnId");
        filterArgs.arg(historyDefnId);
      }

      String languageCode = historyDMO.getLanguageId();

      if (!DMO.isNull(languageCode)) {
        if (filterBy.length() >= 0) {
          filterBy.append("+");
        }

        filterBy.append("LanguageCode");
        filterArgs.arg(languageCode);
      }

      String historyId = historyDMO.getHistoryId();

      if (!DMO.isNull(historyId)) {
        if (filterBy.length() >= 0) {
          filterBy.append("+");
        }

        filterBy.append("HistoryId");
        filterArgs.arg(historyId);
      }

      String entityId = historyDMO.getEntityId();

      if (!DMO.isNull(entityId)) {
        if (filterBy.length() >= 0) {
          filterBy.append("+");
        }

        filterBy.append("EntityId");
        filterArgs.arg(entityId);
      }

      String recordId = historyDMO.getRecordId();

      if (!DMO.isNull(recordId)) {
        if (filterBy.length() >= 0) {
          filterBy.append("+");
        }

        filterBy.append("RecordId");
        filterArgs.arg(recordId);
      }
    }
  }

  /**
   * Return a list of history objects matching the passed in values. A partial
   * match is performed on the description argument. If no values have been
   * passed in, all history objects are retrieved.
   *
   * @param historyDMO History object.
   *
   * @return List of History objects.
   *
   * @throws EPPIXSeriousException
   */
  public List getList(HistoryDMO historyDMO) throws EPPIXSeriousException {

    logger.debug("getList( historyDMO)");

    StringBuffer filterBy = new StringBuffer(80);
    DAOArgs filterArgs = new DAOArgs(4);
    filter(historyDMO, filterBy, filterArgs);

    List list =
      dao.getList(
        "HistoryQuery",
        filterBy.toString(),
        filterArgs,
        "orderByHistoryTimestamp");

    substituteParams(list);

    return list;
  }

  /**
   * Retrieves a paged list of history objects matching the passed in values. 
   * A partial match is performed on the description argument. If no values have 
   * been passed in, all history objects are retrieved.
   *
   * @param historyDMO History object.
   *
   * @return DTOList of History objects.
   *
   * @throws EPPIXSeriousException
   */
  public DTOList getList(DTOListState state, HistoryDMO historyDMO)
    throws EPPIXSeriousException {

    logger.debug("getList( state, historyDMO )");

    StringBuffer filterBy = new StringBuffer(80);
    DAOArgs filterArgs = new DAOArgs(4);
    filter(historyDMO, filterBy, filterArgs);

    DTOList list =
      dao.getListAbs(
        state,
        "HistoryQuery",
        filterBy.toString(),
        filterArgs,
        "orderByHistoryTimestamp");

    substituteParams(list);

    return list;
  }

  /**
   * 
   *
   * @param list DOCUMENT ME!
   *
   * @throws EPPIXSeriousException DOCUMENT ME!
   */
  public void substituteParams(List historyDMOs) throws EPPIXSeriousException {

    logger.debug("substituteParams( historyDMOs )");

    int numHistoryDMOs = (historyDMOs == null) ? 0 : historyDMOs.size();

    for (int i = 0; i < numHistoryDMOs; ++i) {
      HistoryDMO historyDMO = (HistoryDMO) historyDMOs.get(i);
      substituteParam(historyDMO);
    }
  }

  /**
   * 
   *
   * @param history DOCUMENT ME!
   *
   * @throws EPPIXSeriousException DOCUMENT ME!
   */
  public void substituteParam(HistoryDMO historyDMO) throws EPPIXSeriousException {

    logger.debug("substituteParam( historyDMO )");

    String message = historyDMO.getHistoryMessage();

    if (message != null) {
      if ((historyDMO.getDataName1() != null)
        && (historyDMO.getDataValue1() != null)) {
        message =
          replace(message, historyDMO.getDataName1(), historyDMO.getDataValue1());
      }

      if ((historyDMO.getDataName2() != null)
        && (historyDMO.getDataValue2() != null)) {
        message =
          replace(message, historyDMO.getDataName2(), historyDMO.getDataValue2());
      }

      if ((historyDMO.getDataName3() != null)
        && (historyDMO.getDataValue3() != null)) {
        message =
          replace(message, historyDMO.getDataName3(), historyDMO.getDataValue3());
      }

      if ((historyDMO.getDataName4() != null)
        && (historyDMO.getDataValue4() != null)) {
        message =
          replace(message, historyDMO.getDataName4(), historyDMO.getDataValue4());
      }

      if ((historyDMO.getDataName5() != null)
        && (historyDMO.getDataValue5() != null)) {
        message =
          replace(message, historyDMO.getDataName5(), historyDMO.getDataValue5());
      }

      if ((historyDMO.getDataName6() != null)
        && (historyDMO.getDataValue6() != null)) {
        message =
          replace(message, historyDMO.getDataName6(), historyDMO.getDataValue6());
      }

      if ((historyDMO.getDataName7() != null)
        && (historyDMO.getDataValue7() != null)) {
        message =
          replace(message, historyDMO.getDataName7(), historyDMO.getDataValue7());
      }

      if ((historyDMO.getDataName8() != null)
        && (historyDMO.getDataValue8() != null)) {
        message =
          replace(message, historyDMO.getDataName8(), historyDMO.getDataValue8());
      }

      if ((historyDMO.getDataName9() != null)
        && (historyDMO.getDataValue9() != null)) {
        message =
          replace(message, historyDMO.getDataName9(), historyDMO.getDataValue9());
      }

      if ((historyDMO.getDataName10() != null)
        && (historyDMO.getDataValue10() != null)) {
        message =
          replace(message, historyDMO.getDataName10(), historyDMO.getDataValue10());
      }

      // Put the History Message back in the DMO
      historyDMO.setHistoryMessage(message);
    }
  }

  private String replace(String theMessage, String name, String value) {
    return theMessage.replaceAll("~" + name + "~", value);
  }
}
