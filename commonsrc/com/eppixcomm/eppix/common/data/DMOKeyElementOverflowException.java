/* ====================================================================== *
 * (c) Copyright Eppixcomm Tech Ltd.                                      *
 * All Rights Reserved                                                    *
 *                                                                        *
 * Legal Information                                                      *
 * ====================================================================== */
package com.eppixcomm.eppix.common.data;

/**
 * Thrown when a key element has exceeded its maximum value.
 *
 * @author $Author$
 */
public class DMOKeyElementOverflowException
  extends Exception {
  /**
   * Creates a new DMOKeyElementOverflowException object.
   */
  public DMOKeyElementOverflowException() {
    super();
  }

  /**
   * Creates a new DMOKeyElementOverflowException object.
   *
   * @param s message
   */
  public DMOKeyElementOverflowException( String s ) {
    super( s );
  }
} /* class DMOKeyElementOverflowException */