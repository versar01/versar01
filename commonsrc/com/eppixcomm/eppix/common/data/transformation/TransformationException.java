/*
 * Created on May 13, 2004
 *
 */
package com.eppixcomm.eppix.common.data.transformation;



/**
 * Identifies a type that failed to be parsed.
 * @author $Author: rtweedie $
 * @version $Revision: 1.2 $
 */
public class TransformationException extends Exception {

  private String method;
  private String offendingValue;

  /**
   *
   */
  public TransformationException(  ) {
    super(  );
  }

  /**
   * @param message
   */
  public TransformationException( String message ) {
    super( message );
  }

  /**
   * @param cause
   */
  public TransformationException( Throwable cause ) {
    super( cause );
  }

  /**
   * @param message
   * @param cause
   */
  public TransformationException( String message, Throwable cause ) {
    super( message, cause );
  }

  /**
   * @return The method on the DTO that couldn't be set
   */
  public String getMethodName(  ) {

    return method;
  }

  /**
   * @param method
   */
  public void setMethodName( String method ) {

    this.method = method;
  }

  /**
   * @return The value that failed to be parsed
   */
  public String getOffendingValue(  ) {

    return offendingValue;
  }

  /**
   * @param string
   */
  public void setOffendingValue( String string ) {

    offendingValue = string;
  }
}
