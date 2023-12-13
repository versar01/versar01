/* ====================================================================== *
 * (c) Copyright Eppixcomm Tech Ltd.                                      *
 * All Rights Reserved                                                    *
 *                                                                        *
 * Legal Information                                                      *
 * ====================================================================== */
package com.eppixcomm.eppix.common.blo;

import com.eppixcomm.eppix.common.data.DMO;
import com.eppixcomm.eppix.common.data.DTOList;
import com.eppixcomm.eppix.common.data.DTOListState;
import com.eppixcomm.eppix.base.error.EPPIXSeriousException;

/**
 * @author $Author$
 * @version $Revision: 1.1 $
 * 
 * @since $jdk$
 */
public interface AuditDAC {

  /**
   * 
   * @param state
   * @param auditDMO
   * @return
   * @throws EPPIXSeriousException
   */
  public DTOList auditFieldGetList(DTOListState state, AuditDMO auditDMO)
    throws EPPIXSeriousException;

  /**
   * 
   * @param auditDMO
   * @throws EPPIXSeriousException
   */
  public void create(AuditDMO auditDMO) throws EPPIXSeriousException;

  /**
   * 
   * @param entityId
   * @param dmo
   * @throws EPPIXSeriousException
   */
  public void delete(String entityId, DMO dmo) throws EPPIXSeriousException;  
 
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
    boolean getAuditFields) throws EPPIXSeriousException;

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
    boolean getAuditFields) throws EPPIXSeriousException;
}