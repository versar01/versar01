/* ====================================================================== *
 * (c) Copyright Eppixcomm Tech Ltd.                                      *
 * All Rights Reserved                                                    *
 *                                                                        *
 * Legal Information                                                      *
 * ====================================================================== */
package com.eppixcomm.eppix.common.data;

import java.math.BigInteger;

/**
 * DOCUMENT ME!
 *
 * @version $Revision: 1.2 $
 * @author $Author$
 * @since $jdk$
 */
public class DMOKeyElement
  implements java.io.Serializable {
  /** Radix of the string representation. */
  protected int radix;
  /** Length of the string representation */
  protected int length;
  /** The value of the key element. */
  private BigInteger value = null;
  /** Maximum value of the key element. */
  private BigInteger maxValue = null;
  private boolean isZeroPadded = true;
  /** DOCUMENT ME! */
  private StringBuffer zeros;

  /**
   * Contructs a key element such that its string representation will be of
   * length characters.
   *
   * @param radix number base of the string representation
   * @param length the length of the string representation provided by the
   *        toString method
   */
  public DMOKeyElement( int radix,
                        int length ) {
    this.radix = radix;
    this.length = ( length < 0 ) ? 0 : length;

    this.maxValue = ( length <= 0 )
                    ? BigInteger.ZERO
                    : BigInteger.valueOf( (long) radix )
                                .pow( length )
                                .subtract( BigInteger.ONE );
    this.zeros = new StringBuffer( this.length * 2 );

    for ( int i = 0; i < this.length; ++i ) {
      zeros.append( "0" );
    }

    this.reset();
  }

  /**
   * Contructs a key element from its string representation.
   *
   * @param radix number base of the string representation
   * @param length the length of the string representation provided by the
   *        toString method
   * @param str the string representation of the key element
   */
  public DMOKeyElement( int   radix,
                        int   length,
                        String str ) {
    this( radix, length );
    isZeroPadded = (str.length() == length);
    this.reset( str );
  }

  /**
   * Increments the key element value by one.
   *
   * @throws DMOKeyElementOverflowException if the maximum value of the key
   *         element is exceeded.
   */
  public void increment()
                 throws DMOKeyElementOverflowException {
    value = increment( value );
  }

  /**
   * Increments the key element value by one.
   *
   * @param value the value of the key element.
   *
   * @return the next key element value.
   *
   * @throws DMOKeyElementOverflowException if the maximum value of the key
   *         element is exceeded.
   */
  private BigInteger increment( BigInteger value )
                        throws DMOKeyElementOverflowException {
    if ( value.equals( maxValue ) ) {
      throw new DMOKeyElementOverflowException();
    }

    return value.add( BigInteger.ONE );
  }

  /**
   * Resets the key to its minimum value.
   */
  public void reset() {
    this.value = BigInteger.ZERO;
  }

  /**
   * Resets the key element to the value represented by a string.
   *
   * @param str string representation of the key.
   */
  public void reset( String str ) {
    this.value = new BigInteger( str, radix );
  }

  /**
   * Returns the string representation of the key element.
   *
   * @return the string representation of the key element.
   */
  public String toString() {
    return toString( this.value );
  }

  /**
   * Returns the String representation of the key element.
   *
   * @param value the key element value.
   *
   * @return the String representation of the key element.
   */
  private String toString( BigInteger value ) {
    if ( length <= 0 ) {
      return "";
    } else {
      String element = value.toString( radix )
                            .toUpperCase();
      if (!isZeroPadded) {
        return element;
      }
      int elementLen = element.length();
      zeros.replace( length, length + elementLen, element );

      return zeros.substring( elementLen, length + elementLen );
    }
  }

  /**
   * Returns the string representation of the next increment of the key
   * element without changing its internal value.
   *
   * @return the String representation of the next key element value.
   *
   * @throws DMOKeyElementOverflowException if the maximum value of the key
   *         element is exceeded.
   */
  public String getNextAsString()
                         throws DMOKeyElementOverflowException {
    return toString( increment( this.value ) );
  }
}