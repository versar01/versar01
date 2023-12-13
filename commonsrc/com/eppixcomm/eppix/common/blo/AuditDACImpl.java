/* ====================================================================== *
 * (c) Copyright Eppixcomm Tech Ltd.                                      *
 * All Rights Reserved                                                    *
 *                                                                        *
 * Legal Information                                                      *
 * ====================================================================== */
package com.eppixcomm.eppix.common.blo;

import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.eppixcomm.eppix.common.core.UserContext;
import com.eppixcomm.eppix.common.data.DAC;
import com.eppixcomm.eppix.common.data.DAO;
import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DAOThrower;
import com.eppixcomm.eppix.common.data.DMO;
import com.eppixcomm.eppix.common.data.DTOList;
import com.eppixcomm.eppix.common.data.DTOListState;
import com.eppixcomm.eppix.base.error.EPPIXSeriousException;

import org.apache.log4j.Logger;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;

/**
 * This is the standard implementation of the Data Access Controller for the
 * Audit Business Object.
 * 
 * @author $Author$
 * @version $Revision: 1.4 $
 */
public class AuditDACImpl extends DAC implements AuditDAC {

  /** Error handler/logger. */
  private static DAOThrower thrower = DAOThrower
    .getDAOThrower(AuditDACImpl.class);
  private Logger logger = thrower.getLogger();

  private static Map fieldMapCache = new Hashtable();
  private Map fieldIdMap;
  private Map fieldNameMap;

  /**
   * Creates a new AuditDACImpl object.
   * 
   * @param userContext the user's context.
   * @param dao Data Access Object.
   */
  public AuditDACImpl(UserContext userContext, DAO dao) {
    super(userContext, dao, thrower);
  }

  /**
   * 
   * @param state
   * @param auditDMO
   * @return
   * @throws EPPIXSeriousException
   */
  public DTOList auditFieldGetList(DTOListState state, AuditDMO auditDMO)
    throws EPPIXSeriousException {

    logger.debug("auditFieldGetList( state, auditDMO )");

    thrower.ifParameterMissing("auditDMO", auditDMO);

    DTOList auditFields = dao.getListAbs(
      state,
      "AuditField",
      "filterByAuditId",
      new DAOArgs(1).arg(auditDMO.getAuditId()),
      "orderByFieldId");

    populateFieldNames(auditFields);

    return auditFields;
  }

  /**
   * 
   * @param auditDMO
   * @throws EPPIXSeriousException
   */
  public void create(AuditDMO auditDMO) throws EPPIXSeriousException {
    
    logger.debug("create( auditDMO )");

    thrower.ifParameterMissing("auditDMO", auditDMO);

    dao.insert(auditDMO);

    List auditFields = auditDMO.getAuditFields();
    if (auditFields != null) {
      String auditId = auditDMO.getAuditId();
      Iterator itr = auditFields.iterator();
      while (itr.hasNext()) {
        AuditFieldDMO auditFieldDMO = (AuditFieldDMO) itr.next();
        auditFieldDMO.setAuditId(auditId);
        auditFieldDMO.setFieldId(toFieldId(auditFieldDMO.getFieldName()));
      }
      dao.insert(auditFields);
    }
  }

  /**
   * 
   * @param entityId
   * @param dmo
   * @throws EPPIXSeriousException
   */
  public void delete(String entityId, DMO dmo) throws EPPIXSeriousException {

    logger.debug("delete( entityId, dmo )");

    thrower.ifParameterMissing("entityId", entityId);
    thrower.ifParameterMissing("dmo", dmo);

    String recordId = dmo.primaryKeyToString();
    DAOArgs filterArgs = new DAOArgs(4).arg(entityId).arg(recordId).arg(
      entityId).arg(recordId);

    dao.delete("AuditField", "filterByOwnerOrInner", filterArgs);

    dao.delete("Audit", "filterByOwnerOrInner", filterArgs);
  }

  /**
   * 
   * @param state
   * @param entityId
   * @param hasAudits
   * @param getInnerLevels
   * @param getAuditFields
   * @return
   * @throws EPPIXSeriousException
   */
  public DTOList getList(
    DTOListState state,
    String entityId,
    HasAudits hasAudits,
    boolean getInnerLevels,
    boolean getAuditFields) throws EPPIXSeriousException {

    logger
      .debug("getList( state, entityId, hasAudits, getInnerLevels, getAuditFields )");

    thrower.ifParameterMissing("entityId", entityId);
    thrower.ifParameterMissing("hasAudits", hasAudits);

    String languageCode = hasAudits.getLanguageCode();
    if (DMO.isNull(languageCode)) {
      languageCode = defaultLanguageCode;
    }

    DTOList audits = null;

    if (getInnerLevels) {

      audits = dao.getListAbs(
        state,
        "AuditOuterDescByLang",
        "filterByOwnerOrInner",
        new DAOArgs(6).arg(languageCode).arg(languageCode).arg(entityId).arg(
          hasAudits.primaryKeyToString()).arg(entityId).arg(
          hasAudits.primaryKeyToString()),
        "orderByDescChangeDateTime,DescAuditId");

    } else {

      audits = dao.getListAbs(
        state,
        "AuditOuterDescByLang",
        "filterByOwner",
        new DAOArgs(4).arg(languageCode).arg(languageCode).arg(entityId).arg(
          hasAudits.primaryKeyToString()),
        "orderByDescChangeDateTime,DescAuditId");
    }

    if (getAuditFields) {
      populateAuditFields(audits);
    }

    return audits;
  }

  public void populate(AuditDMO auditDMO) throws EPPIXSeriousException {

    logger.debug("populate( auditDMO )");

    thrower.ifParameterMissing("auditDMO", auditDMO);

    List auditFields = dao.getList(
      "AuditField",
      "filterByAuditId",
      new DAOArgs(1).arg(auditDMO.getAuditId()),
      "orderByFieldId");

    populateFieldNames(auditFields);
    auditDMO.setAuditFields(auditFields);
  }

  /**
   * 
   * @param entityId
   * @param hasAudits
   * @param getInnerLevels
   * @param getAuditFields
   * @throws EPPIXSeriousException
   */
  public void populate(
    String entityId,
    HasAudits hasAudits,
    boolean getInnerLevels,
    boolean getAuditFields) throws EPPIXSeriousException {

    logger
      .debug("populate( entityId, hasAudits, getInnerLevels, getAuditFields )");

    thrower.ifParameterMissing("entityId", entityId);
    thrower.ifParameterMissing("hasAudits", hasAudits);

    String languageCode = hasAudits.getLanguageCode();
    if (DMO.isNull(languageCode)) {
      languageCode = defaultLanguageCode;
    }

    List audits = null;

    if (getInnerLevels) {

      audits = dao.getList(
        "AuditOuterDescByLang",
        "filterByOwnerOrInner",
        new DAOArgs(6).arg(languageCode).arg(languageCode).arg(entityId).arg(
          hasAudits.primaryKeyToString()).arg(entityId).arg(
          hasAudits.primaryKeyToString()),
        "orderByDescChangeDateTime,DescAuditId");

    } else {

      audits = dao.getList(
        "AuditOuterDescByLang",
        "filterByOwner",
        new DAOArgs(4).arg(languageCode).arg(languageCode).arg(entityId).arg(
          hasAudits.primaryKeyToString()),
        "orderByDescChangeDateTime,DescAuditId");
    }

    if (getAuditFields) {
      populateAuditFields(audits);
    }

    hasAudits.setAudits(audits);
  }

  private void populateAuditFields(List audits) throws EPPIXSeriousException {

    if (audits == null) {
      return;
    }

    Iterator itr = audits.iterator();
    while (itr.hasNext()) {
      populate((AuditDMO) itr.next());
    }
  }

  private void populateFieldNames(List auditFields)
    throws EPPIXSeriousException {

    if (auditFields == null) {
      return;
    }

    Iterator itr = auditFields.iterator();
    while (itr.hasNext()) {

      AuditFieldDMO auditFieldDMO = (AuditFieldDMO) itr.next();
      auditFieldDMO.setFieldName(toFieldName(auditFieldDMO.getFieldId()));
    }
  }

  /**
   * Packs the fieldNamePath into a fieldIdPath.
   * 
   * @param fieldNamePath fieldNames separated by '.'
   * 
   * @return fieldIds separated by '.'
   * 
   * @throws EPPIXSeriousException
   */
  private String toFieldId(String fieldNamePath) throws EPPIXSeriousException {

    if (fieldNameMap == null) {
      fieldNameMap = getFieldMap(true);
    }

    String[] fieldNames = fieldNamePath.split("[\\.\\[\\]]");

    StringBuffer fieldIdPath = new StringBuffer();
    for (int i = 0; i < fieldNames.length; ++i) {

      String fieldName = fieldNames[i];

      if (fieldName.matches("\\p{Digit}*")) {

        fieldIdPath.append(fieldName);

      } else {

        if (fieldIdPath.length() > 0) {
          fieldIdPath.append(".");
        }

        String fieldId = (String) fieldNameMap.get(fieldName);
        if (fieldId != null) {
          fieldIdPath.append(fieldId);
        } else {
          fieldIdPath.append(fieldName);
        }
      }
    }

    return fieldIdPath.toString();
  }

  /**
   * Unpacks the fieldIdPath into a fieldNamePath.
   * 
   * @param fieldIdPath fieldIds separated by '.'
   * 
   * @return fieldNames separated by '.'
   * 
   * @throws EPPIXSeriousException
   */
  private String toFieldName(String fieldIdPath) throws EPPIXSeriousException {

    if (fieldIdMap == null) {
      fieldIdMap = getFieldMap(false);
    }

    String[] fieldIds = fieldIdPath.split("\\.");
    StringBuffer fieldNamePath = new StringBuffer();

    for (int i = 0; i < fieldIds.length; ++i) {

      if (fieldNamePath.length() > 0) {
        fieldNamePath.append(".");
      }

      String fieldId = fieldIds[i];

      if (fieldId.matches("\\p{Alpha}+\\p{Digit}+")) {

        String fieldName = (String) fieldIdMap.get(fieldId.replaceAll(
          "\\p{Digit}",
          ""));
        if (fieldName != null) {
          fieldNamePath.append(fieldName);
        } else {
          fieldNamePath.append(fieldId);
        }

        fieldNamePath.append("[").append(fieldId.replaceAll("\\p{Alpha}", ""))
          .append("]");

      } else {

        String fieldName = (String) fieldIdMap.get(fieldId);
        if (fieldName != null) {
          fieldNamePath.append(fieldName);
        } else {
          fieldNamePath.append(fieldId);
        }
      }
    }
    return fieldNamePath.toString();
  }

  private Map getFieldMap(boolean inverted) throws EPPIXSeriousException {

    logger.debug("getFieldMap( inverted )");

    String moduleName = userContext.getModuleName();
    String key = moduleName + ((inverted) ? "1" : "0");

    SoftReference fieldMapRef = (SoftReference) fieldMapCache.get(key);
    Map fieldMap = (fieldMapRef != null) ? (Map) fieldMapRef.get() : null;
    if (fieldMap == null) {
      fieldMap = loadFieldMap(moduleName, inverted);
      fieldMapCache.put(key, new SoftReference(fieldMap));
    }
    return fieldMap;
  }

  private Map loadFieldMap(String moduleName, boolean inverted)
    throws EPPIXSeriousException {

    logger.debug("loadFieldMap( moduleName, inverted )");

    String resourceName = "/com/cmgwds/eppix/" + moduleName + "/blo/"
      + moduleName + "AuditFieldMap.xml";
    InputStream inputStream = Audit.class.getResourceAsStream(resourceName);

    if (inputStream == null) {
      thrower.unexpected("Resource not found: " + resourceName);
    }

    SAXBuilder builder = new SAXBuilder();

    Document doc = null;
    try {

      doc = builder.build(inputStream);

    } catch (JDOMException e) {
      thrower.unexpected(e);
    } catch (IOException e) {
      thrower.unexpected(e);
    }

    Element root = doc.getRootElement();
    int size = Integer.parseInt(root.getAttributeValue("size"));
    Map map = new HashMap(size);

    List fields = root.getChildren("field");
    Iterator fieldItr = fields.iterator();
    while (fieldItr.hasNext()) {
      Element field = (Element) fieldItr.next();

      if (inverted) {
        map.put(field.getAttributeValue("name"), field
          .getAttributeValue("id"));
      } else {
        map.put(field.getAttributeValue("id"), field
          .getAttributeValue("name"));
      }
    }

    return map;
  }
}