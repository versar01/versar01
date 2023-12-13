/* ====================================================================== *
 * (c) Copyright Eppixcomm Tech Ltd.                                      *
 * All Rights Reserved                                                    *
 *                                                                        *
 * Legal Information                                                      *
 * ====================================================================== */
package com.eppixcomm.eppix.base.error;

/**
 * DOCUMENT ME!
 *
 * @version $Revision: 1.1 $
 * @author $Author$
 * @since $jdk$
 */
public class EPPIXSecurityException
  extends EPPIXUnexpectedException { 

  /**
   * @param message
   * @param messageArg
   * @param cause
   */
  public EPPIXSecurityException(
    Message message,
    Object messageArg,
    Throwable cause) {
    super(message, messageArg, cause);
  }

  /**
   * @param message
   * @param messageArgs
   * @param cause
   */
  public EPPIXSecurityException(
    Message message,
    Object[] messageArgs,
    Throwable cause) {
    super(message, messageArgs, cause);
  }

  /**
   * @param message
   * @param cause
   */
  public EPPIXSecurityException(Message message, Throwable cause) {
    super(message, cause);
  }
}
