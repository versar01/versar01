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
import com.eppixcomm.eppix.base.error.EPPIXObjectExpiredException;
import com.eppixcomm.eppix.base.error.EPPIXObjectNotFoundException;
import com.eppixcomm.eppix.base.error.EPPIXUnexpectedException;
import com.eppixcomm.eppix.base.error.Thrower;

import java.util.List;

import org.apache.log4j.Logger;

/**
 * Provides the business logic for the Enumerated Type object. <br>
 * 
 * @author $Author$
 * @version $Revision: 1.3 $
 * 
 * @since $jdk$
 */
public class EnumeratedType extends CommonBLO implements CommonMessages,
  DTOActionTypes {

  /** Error handler/logger. */
  private static Thrower thrower = Thrower.getThrower(EnumeratedType.class);
  private Logger logger = thrower.getLogger();

  /** Data Access Controller. */
  private EnumeratedTypeDAC dac;

  /** Invoked by the BLOBinder to provide this BLO with its DAC. */
  protected void setDAC(DAC dac) {
    this.dac = (EnumeratedTypeDAC) dac;
  }

  /**
   * Retrieves an EnumeratedType object.
   * 
   * @param enumerated Enumerated object.
   * 
   * @return EnumeratedType object.
   * 
   * @throws EPPIXUnexpectedException
   */
  public EnumeratedTypeDMO get(Enumerated enumerated)
    throws EPPIXUnexpectedException {

    logger.debug("get( enumerated )");

    thrower.ifParameterMissing("enumerated", enumerated);
    thrower.ifParameterMissing("enumerated.recordId", enumerated.getRecordId());
    thrower.ifParameterMissing("enumerated.entityId", enumerated.getEntityId());

    if (DMO.isNull(enumerated.getLanguageCode())) {
      enumerated.setLanguageCode(defaultLanguageCode);
    }

    EnumeratedTypeDMO enumeratedTypeDMO = dac.get(enumerated);

    if (enumeratedTypeDMO == null) {
      thrower.unexpected("Enumerated Type does not exist: recordId="
        + enumerated.getRecordId() + ", entityId=" + enumerated.getEntityId());
    }

    return enumeratedTypeDMO;
  }

  /**
   * Retrieves an EnumeratedType object.
   * 
   * @param enumerated Enumerated object.
   * @param getDesc boolean flag; when true, descriptions for all languages are
   *        retrieved.
   * 
   * @return EnumeratedType object.
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public EnumeratedTypeDMO get(Enumerated enumerated, boolean getDesc)
    throws EPPIXUnexpectedException, EPPIXFatalException {

    logger.debug("get( enumerated, getDesc )");

    EnumeratedTypeDMO enumeratedTypeDMO = get(enumerated);

    if (getDesc) {
      common.description().populate(
        enumeratedTypeDMO.getEntityId(),
        enumeratedTypeDMO);
    }

    return enumeratedTypeDMO;
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
  public List getList(Enumerated enumerated) throws EPPIXUnexpectedException {

    logger.debug("getList( enumerated )");

    thrower.ifParameterMissing("enumerated", enumerated);

    if (DMO.isNull(enumerated.getLanguageCode())) {
      enumerated.setLanguageCode(defaultLanguageCode);
    }

    return dac.getList(enumerated);
  }

  /**
   * Modifies the language descriptions of the Enumerated object.
   * 
   * @param enumerated Enumerated object with embedded recordId, entityId,
   *        recordVersion and language descriptions.
   * 
   * @return EnumeratedType object.
   * 
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public EnumeratedTypeDMO modify(Enumerated enumerated)
    throws EPPIXBusinessException, EPPIXUnexpectedException,
    EPPIXFatalException {

    thrower.ifParameterMissing("enumerated", enumerated);

    thrower.ifParameterMissing("enumerated.recordId", enumerated.getRecordId());
    thrower.ifParameterMissing("enumerated.entityId", enumerated.getEntityId());
    thrower.ifParameterMissing("enumerated.recordVersion", enumerated
      .getRecordVersion());
    
    // mandatory field checks for EnumAuditTypeDMO

    try {

      dac.modify(enumerated);

    } catch (EPPIXObjectNotFoundException e) {

      thrower.unexpected(
        "Enumerated Type does not exist: recordId=" + enumerated.getRecordId()
          + ", entityId=" + enumerated.getEntityId(),
        e);

    } catch (EPPIXObjectExpiredException e) {

      // Enumerated Type has been updated by another user: recordId=$0,
      // entityId=$1, recordVersion=$2
      thrower.business(CMN_ENUMERATEDTYPE_002, new Object[] {
        enumerated.getRecordId(),
        enumerated.getEntityId(),
        enumerated.getRecordVersion() });
    }

    if (DMO.isNull(enumerated.getLanguageCode())) {
      enumerated.setLanguageCode(defaultLanguageCode);
    }

    common.description().save(enumerated.getEntityId(), enumerated);

    return get(enumerated, true);
  }
}