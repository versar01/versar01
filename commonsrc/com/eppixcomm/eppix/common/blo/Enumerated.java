/* ====================================================================== *
 * (c) Copyright Eppixcomm Tech Ltd.                                      *
 * All Rights Reserved                                                    *
 *                                                                        *
 * Legal Information                                                      *
 * ====================================================================== */
package com.eppixcomm.eppix.common.blo;

/**
 * The super interface for all enumerated types.
 * 
 * @author $Author$
 * @version $Revision: 1.1 $
 * 
 * @since $jdk$
 */
public interface Enumerated extends HasDescriptions {

  public String getEntityId();

  public Boolean getIsValidCode();

  public Integer getRecordVersion();
  
  public EnumeratedTypeDMO newInstance();
}