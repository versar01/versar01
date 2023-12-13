/* ====================================================================== *
 * (c) Copyright Eppixcomm Tech Ltd.                                      *
 * All Rights Reserved                                                    *
 *                                                                        *
 * Legal Information                                                      *
 * ====================================================================== */
package com.eppixcomm.eppix.common.blo;

import java.util.List;

/**
 * @author $Author$
 * @version $Revision: 1.1 $
 * 
 * @since $jdk$
 */
public interface HasAudits {

  public String getLanguageCode();
  
  public List getAudits();

  public void setAudits(List audits);

  public void addAudit(AuditDMO auditDMO);

  public String primaryKeyToString();
}