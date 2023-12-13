/* ====================================================================== *
 * (c) Copyright Eppixcomm Tech Ltd.                                      *
 * All Rights Reserved                                                    *
 *                                                                        *
 * Legal Information                                                      *
 * ====================================================================== */
package com.eppixcomm.eppix.common.blo;

/**
 * Enumerated Type database object.
 * 
 * @author $Author$
 * @version $Revision: 1.1 $
 * 
 * @since $jdk$
 */
class EnumAuditTypeDBO extends EnumAuditTypeDMO {

  EnumAuditTypeDBO(EnumAuditTypeDMO enumeratedTypeDMO) {
    super(enumeratedTypeDMO);
  }

  public EnumeratedTypeDMO newInstance() {
    return null;
  }
}