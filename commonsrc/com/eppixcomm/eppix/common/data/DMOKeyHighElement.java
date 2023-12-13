/* ====================================================================== *
 * (c) Copyright Eppixcomm Tech Ltd.                                      *
 * All Rights Reserved                                                    *
 *                                                                        *
 * Legal Information                                                      *
 * ====================================================================== */
package com.eppixcomm.eppix.common.data;

/**
 * DOCUMENT ME!
 *
 * @version $Revision: 1.1 $
 * @author $Author$
 * @since $jdk$
 */
public class DMOKeyHighElement
  extends DMOKeyElement {
  /** DOCUMENT ME! */
  private int lowLen;

  /**
   * Creates a new DMOKeyHighElement object.
   *
   * @param radix number base of the string representation
   * @param highLen the length of the string representation of the high
   *        element provided by the toString method
   * @param lowLen the length of the string representation of the low element
   *        provided by the toString method
   * @param str the string representation of the high element
   */
  public DMOKeyHighElement( int   radix,
                            int   highLen,
                            int   lowLen,
                            String str ) {
    super( radix, highLen, str );
    this.lowLen = lowLen;
  }

  /**
   * Provides a DMKKeyElement for the low element of the key.
   *
   * @return DOCUMENT ME!
   */
  public DMOKeyElement getLowElement() {
    return new DMOKeyElement( radix, lowLen );
  }

  /**
   * Returns the length of the string representation of the whole key
   * including both high and low elements.
   *
   * @return length of the key.
   */
  public int getKeyLen() {
    return length + lowLen;
  }
}
