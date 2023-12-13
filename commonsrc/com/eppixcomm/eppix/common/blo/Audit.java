/* ====================================================================== *
 * (c) Copyright Eppixcomm Tech Ltd.                                      *
 * All Rights Reserved                                                    *
 *                                                                        *
 * Legal Information                                                      *
 * ====================================================================== */
package com.eppixcomm.eppix.common.blo;

import java.lang.ref.SoftReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.Logger;

import com.eppixcomm.eppix.common.data.DAC;
import com.eppixcomm.eppix.common.data.DMO;
import com.eppixcomm.eppix.common.data.DTOList;
import com.eppixcomm.eppix.common.data.DTOListState;
import com.eppixcomm.eppix.base.error.EPPIXFatalException;
import com.eppixcomm.eppix.base.error.EPPIXUnexpectedException;
import com.eppixcomm.eppix.base.error.Thrower;
import com.eppixcomm.eppix.common.util.DateTime;

/**
 * Provides the business logic for Auditing.
 * 
 * @author $Author$
 * @version $Revision: 1.4 $
 * 
 * @since $jdk$
 */
public class Audit extends CommonBLO {

  /** Error handler/logger. */
  private static Thrower thrower = Thrower.getThrower(Audit.class);
  private Logger logger = thrower.getLogger();

  /**
   * Caches soft references to the sets of fields that are being audited. The
   * map is indexed by moduleName and audit type.
   */
  private static Map auditFieldSetCache = new Hashtable();

  /** Data Access Controller. */
  private AuditDAC dac;

  /** Invoked by the BLOBinder to provide this BLO with its DAC. */
  protected void setDAC(DAC dac) {
    this.dac = (AuditDAC) dac;
  }

  /**
   * 
   * @param auditDMO
   * @param pathName
   * @param beforeDMO
   * @param afterDMO
   * @param auditFieldSet
   * @throws EPPIXUnexpectedException
   */
  private void addAuditField(
    AuditDMO auditDMO,
    String pathName,
    DMO beforeDMO,
    DMO afterDMO,
    Set auditFieldSet) throws EPPIXUnexpectedException {
    
    Class beforeDmoClass = (beforeDMO != null) ? beforeDMO.getClass() : null;
    Class dmoClass = (afterDMO != null) ? afterDMO.getClass() : beforeDmoClass;
    if (!dmoClass.equals(beforeDmoClass)) {
      beforeDMO = null;
    }
    
    Method[] methods = dmoClass.getMethods();

    for (int i = 0; i < methods.length; ++i) {

      Method method = methods[i];

      String methodName = method.getName();
      if (!methodName.startsWith("get") || methodName.equals("getClass")
        || methodName.equals("getAction") || methodName.equals("getScope")
        || method.getParameterTypes().length != 0) {
        continue;
      }

      Class returnType = method.getReturnType();
      if (returnType == null) {
        continue;
      }

      String fieldName = pathName + ((pathName.length() > 0) ? "." : "")
        + methodName.substring(3);

      String filter = fieldName.replaceAll("\\[\\d*\\]", "");
      logger.debug("filter:" + filter);
      
      if (auditFieldSet != null && !auditFieldSet.isEmpty()
        && !auditFieldSet.contains(filter)) {
        continue;
      }

      Object beforeField = null;
      Object afterField = null;

      try {
        beforeField = (beforeDMO == null) ? null : method.invoke(
          beforeDMO,
          (Object[])null);
        afterField = (afterDMO == null) ? null : method.invoke(afterDMO, (Object[])null);

      } catch (IllegalArgumentException e) {
        thrower.unexpected(e);
      } catch (IllegalAccessException e) {
        thrower.unexpected(e);
      } catch (InvocationTargetException e) {
        thrower.unexpected(e);
      }

      if (afterField == null) {

        if (beforeField != null) {
          auditDMO.addAuditField(new AuditFieldDMO(null, fieldName, ""));
        }

      } else if (DMO.class.isAssignableFrom(returnType)) {

        addAuditField(
          auditDMO,
          fieldName,
          (DMO) beforeField,
          (DMO) afterField,
          auditFieldSet);

      } else if (List.class.isAssignableFrom(returnType)) {

        List beforeList = (List) beforeField;
        int beforeSize = (beforeList == null) ? 0 : beforeList.size();
        List afterList = (List) afterField;
        int afterSize = (afterList == null) ? 0 : afterList.size();
        int n = (afterSize > beforeSize) ? afterSize : beforeSize;

        for (int j = 0; j < n; ++j) {

          Object beforeEntry = (j < beforeSize) ? beforeList.get(j) : null;
          Object afterEntry = (j < afterSize) ? afterList.get(j) : null;

          if (afterEntry != null
            && DMO.class.isAssignableFrom(afterEntry.getClass())) {

            addAuditField(
              auditDMO,
              fieldName + "[" + j + "]",
              (DMO) beforeEntry,
              (DMO) afterEntry,
              auditFieldSet);

          } else if (beforeEntry != null
            && DMO.class.isAssignableFrom(beforeEntry.getClass())) {

            addAuditField(
              auditDMO,
              fieldName + "[" + j + "]",
              (DMO) beforeEntry,
              (DMO) afterEntry,
              auditFieldSet);

          } else {

            String beforeFieldStr = (beforeEntry == null) ? "" : beforeEntry
              .toString();
            String afterFieldStr = (afterEntry == null) ? "" : afterEntry
              .toString();

            if (!afterFieldStr.equals(beforeFieldStr)) {
              String entryName = fieldName + "[" + j + "]";
              auditDMO.addAuditField(new AuditFieldDMO(null, entryName,
                afterFieldStr));
            }
          }
        }

      } else {

        String beforeFieldStr = (beforeField == null) ? "" : beforeField
          .toString();
        String afterFieldStr = (afterField == null) ? "" : afterField
          .toString();

        if (!afterFieldStr.equals(beforeFieldStr)) {
          auditDMO.addAuditField(new AuditFieldDMO(null, fieldName,
            afterFieldStr));
        }
      }
    }
  }

  public DTOList auditFieldGetList(DTOListState state, AuditDMO auditDMO)
    throws EPPIXUnexpectedException {

    logger.debug("auditFieldGetList( state, auditDMO )");

    return dac.auditFieldGetList(state, auditDMO);
  }

  /**
   * 
   * @param enumAuditTypeDMO
   * @param beforeDMO
   * @param afterDMO
   * @return
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public void create(
    EnumAuditTypeDMO enumAuditTypeDMO,
    DMO beforeDMO,
    DMO afterDMO) throws EPPIXUnexpectedException, EPPIXFatalException {

    create(enumAuditTypeDMO, null, beforeDMO, afterDMO, null, null, null);
  }

  /**
   * 
   * @param enumAuditTypeDMO
   * @param beforeDMO
   * @param afterDMO
   * @param outerRecordId
   * @return
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public void create(
    EnumAuditTypeDMO enumAuditTypeDMO,
    DMO beforeDMO,
    DMO afterDMO,
    String outerRecordId) throws EPPIXUnexpectedException, EPPIXFatalException {

    create(enumAuditTypeDMO, null, beforeDMO, afterDMO, null, outerRecordId, null);
  }

  /**
   * 
   * @param enumAuditTypeDMO
   * @param beforeDMO
   * @param afterDMO
   * @param outerRecordId
   * @param messageArgs
   * 
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public void create(
    EnumAuditTypeDMO enumAuditTypeDMO,
    DMO beforeDMO,
    DMO afterDMO,
    String outerRecordId,
    Object[] messageArgs) throws EPPIXUnexpectedException, EPPIXFatalException {

    create(enumAuditTypeDMO, null, beforeDMO, afterDMO, null, outerRecordId, null);
  }

  /**
   * 
   * @param enumAuditTypeDMO
   * @param now
   * @param beforeDMO
   * @param afterDMO
   * @param outerRecordId
   * @param messageArgs
   * 
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public void create(
    EnumAuditTypeDMO enumAuditTypeDMO,
    DateTime now,
    DMO beforeDMO,
    DMO afterDMO,
    String ownerRecordId,
    String outerRecordId,
    Object[] messageArgs) throws EPPIXUnexpectedException, EPPIXFatalException {

    logger.debug("create( enumAuditTypeDMO, now, beforeDMO, afterDMO, "
      + "ownerRecordId, outerRecordId, messageArgs )");

    thrower.ifParameterMissing("enumAuditTypeDMO", enumAuditTypeDMO);
    thrower.ifParameterMissing("afterDMO", afterDMO);

    // ... We might want to cache the enumAuditTypeDMO in this BLO instance
    // to improve the performance of repeated calls to this method for the
    // duration of one EJB call.
    enumAuditTypeDMO = (EnumAuditTypeDMO) common.enumeratedType().get(
      enumAuditTypeDMO);

    // Is this audit type enabled?
    if (!enumAuditTypeDMO.getIsAuditEnabled().booleanValue()) {
      return;
    }

    if (DMO.isNull(ownerRecordId)) {
      ownerRecordId = afterDMO.primaryKeyToString();
    }

    if (now == null) {
      now = new DateTime();
    }

    String loginName = loginName();
    if (DMO.isNull(loginName)) {
      loginName = "unknown";
    }

    AuditDMO auditDMO = new AuditDMO((String) null, enumAuditTypeDMO
      .getRecordId(), enumAuditTypeDMO.getDescription(), enumAuditTypeDMO
      .getOwnerEntityId(), ownerRecordId, enumAuditTypeDMO.getOuterEntityId(),
      outerRecordId, now, loginName, messageArgs);

    // Is field level auditing enabled?
    if (enumAuditTypeDMO.getIsFieldAuditEnabled().booleanValue()) {

      // ... To improve performace of successive calls, we might want to hold a
      // local cache of auditFieldSets in this BLO instance to avoid repeated
      // calls to the synchronized get of the global auditFieldSetCache. This
      // would also provide a hard reference to the auditFieldSet for the
      // lifespan of this BLO.

      // Retrieve the set of fields to be audited from the cache.
      String auditFieldSetKey = userContext().getModuleName()
        + enumAuditTypeDMO.getRecordId();
      SoftReference auditFieldSetRef = ((SoftReference) auditFieldSetCache
        .get(auditFieldSetKey));
      Set auditFieldSet = (auditFieldSetRef != null) ? (Set) auditFieldSetRef
        .get() : null;

      if (auditFieldSet == null) {

        // The set was not found in the cache, either because it hasn't yet been
        // created or it was freed by the garbage collector.
        auditFieldSet = new HashSet();
        String auditFields = enumAuditTypeDMO.getAuditFields();

        if (auditFields != null && auditFields.length() > 0) {
          String[] auditFieldArr = auditFields.replaceAll(" ", "").split(",");
          auditFieldSet = new HashSet(auditFieldArr.length);
          // Add all levels of the field path to the set.
          for (int i = 0; i < auditFieldArr.length; ++i) {
            String auditField = auditFieldArr[i];
            int endIndex = auditField.indexOf('.');
            while (endIndex > 0) {
              auditFieldSet.add(auditField.substring(0, endIndex));
              endIndex = auditField.indexOf('.', endIndex + 1);
            }
            auditFieldSet.add(auditField);
          }
          auditFieldSetCache.put(auditFieldSetKey, new SoftReference(
            auditFieldSet));
        }
      }

      addAuditField(auditDMO, "", beforeDMO, afterDMO, auditFieldSet);
    }

    dac.create(auditDMO);
  }

  /**
   * 
   * @param enumAuditTypeDMO
   * @param ownerRecordId
   * @param messageArgs
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public void create(
    EnumAuditTypeDMO enumAuditTypeDMO,
    String ownerRecordId,
    Object[] messageArgs) throws EPPIXUnexpectedException, EPPIXFatalException {

    create(enumAuditTypeDMO, null, ownerRecordId, null, messageArgs);
  }

  public void create(
    EnumAuditTypeDMO enumAuditTypeDMO,
    String ownerRecordId,
    String outerRecordId,
    Object[] messageArgs) throws EPPIXUnexpectedException, EPPIXFatalException {

    create(enumAuditTypeDMO, null, ownerRecordId, outerRecordId, messageArgs);
  }

  /**
   * 
   * @param enumAuditTypeDMO
   * @param now
   * @param ownerRecordId
   * @param messageArgs
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public void create(
    EnumAuditTypeDMO enumAuditTypeDMO,
    DateTime now,
    String ownerRecordId,
    Object[] messageArgs) throws EPPIXUnexpectedException, EPPIXFatalException {

    create(enumAuditTypeDMO, now, ownerRecordId, null, messageArgs);
  }

  /**
   * 
   * @param enumAuditTypeDMO
   * @param now
   * @param ownerRecordId
   * @param outerRecordId
   * @param messageArgs
   * 
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public void create(
    EnumAuditTypeDMO enumAuditTypeDMO,
    DateTime now,
    String ownerRecordId,
    String outerRecordId,
    Object[] messageArgs) throws EPPIXUnexpectedException, EPPIXFatalException {

    logger
      .debug("create( enumAuditTypeDMO, now, ownerRecordId, outerRecordId, "
        + "messageArgs )");

    thrower.ifParameterMissing("enumAuditTypeDMO", enumAuditTypeDMO);
    thrower.ifParameterMissing("ownerRecordId", ownerRecordId);

    // ... We might want to cache the enumAuditTypeDMO in this BLO instance
    // to improve the performance of repeated calls to this method for the
    // duration of one EJB call.
    enumAuditTypeDMO = (EnumAuditTypeDMO) common.enumeratedType().get(
      enumAuditTypeDMO);

    // Is this audit type enabled?
    if (!enumAuditTypeDMO.getIsAuditEnabled().booleanValue()) {
      return;
    }
    
    if (now == null) {
      now = new DateTime();
    }

    String loginName = loginName();
    if (DMO.isNull(loginName)) {
      loginName = "unknown";
    }

    AuditDMO auditDMO = new AuditDMO((String) null, enumAuditTypeDMO
      .getRecordId(), enumAuditTypeDMO.getDescription(), enumAuditTypeDMO
      .getOwnerEntityId(), ownerRecordId, enumAuditTypeDMO.getOuterEntityId(),
      outerRecordId, now, loginName, messageArgs);

    dac.create(auditDMO);
  }

  /**
   * 
   * @param entityId
   * @param dmo
   * @throws EPPIXUnexpectedException
   */
  public void delete(String entityId, DMO dmo) throws EPPIXUnexpectedException {

    logger.debug("delete( entityId, dmo )");

    dac.delete(entityId, dmo);
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
    boolean getAuditFields) throws EPPIXUnexpectedException {

    logger.debug("getList( state, entityId, hasAudits, getInnerLevels, "
      + "getAuditFields )");

    return dac.getList(
      state,
      entityId,
      hasAudits,
      getInnerLevels,
      getAuditFields);
  }

  /**
   * 
   * @param entityId
   * @param hasAudits
   * @param getInnerLevels
   * @param getAuditFields
   * @throws EPPIXUnexpectedException
   */
  public void populate(
    String entityId,
    HasAudits hasAudits,
    boolean getInnerLevels,
    boolean getAuditFields) throws EPPIXUnexpectedException {

    logger.debug("populate( entityId, hasAudits, getInnerLevels, "
      + "getAuditFields )");

    dac.populate(entityId, hasAudits, getInnerLevels, getAuditFields);
  }
}