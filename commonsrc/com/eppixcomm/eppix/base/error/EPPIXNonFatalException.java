/* ====================================================================== *
 * (c) Copyright Eppixcomm Tech Ltd.                                      *
 * All Rights Reserved                                                    *
 *                                                                        *
 * Legal Information                                                      *
 * ====================================================================== */
package com.eppixcomm.eppix.base.error;

/**
 * This is the superclass for all non-fatal EPPIX exceptions.
 *
 * @version $Revision: 1.1 $
 * @author $Author$
 * @since $jdk$
 */
public abstract class EPPIXNonFatalException
  extends EPPIXException {
    
  /**
   * Constructs a new exception with null as its detail message.
   */
  public EPPIXNonFatalException() {
    super();
  }
  
  /**
   * @param message
   */
  public EPPIXNonFatalException(Message message) {
    super(message);
  }
  
  /**
   * @param message
   * @param messageArg
   */
  public EPPIXNonFatalException(Message message, Object messageArg) {
    super(message, messageArg);
  }

  /**
   * @param message
   * @param messageArg
   * @param cause
   */
  public EPPIXNonFatalException(
    Message message,
    Object messageArg,
    Throwable cause) {
    super(message, messageArg, cause);
  }
  
  /**
   * @param message
   * @param messageArgs
   */
  public EPPIXNonFatalException(Message message, Object[] messageArgs) {
    super(message, messageArgs);
  }
  
  /**
   * @param message
   * @param messageArgs
   * @param cause
   */
  public EPPIXNonFatalException(
    Message message,
    Object[] messageArgs,
    Throwable cause) {
    super(message, messageArgs, cause);
  }
  

  /**
   * @param message
   * @param cause
   */
  public EPPIXNonFatalException(Message message, Throwable cause) {
    super(message, cause);
  }

  /**
   * Constructs a new exception with the specified detail message.
   *
   * @param message the detail message.
   */
  public EPPIXNonFatalException( String message ) {
    super( message );
  }
  
  /**
   * Constructs a new exception with the specified errorCode and detail
   * message.
   *
   * @param errorCode a code that identifies a specific error condition.
   * @param message the detail message.
   */
  public EPPIXNonFatalException( String errorCode,
                                 String message ) {
    super( errorCode, message );
  }
  
  /**
   * Constructs a new exception with the specified errorCode, detail message
   * and placeholder substituition argument.
   *
   * @param errorCode a code that identifies a specific error condition.
   * @param message the detail message with $0 placeholder(s).
   * @param messageArg an argument that will be substituted for all
   *        occurrences of the $0 placeholder in the detail message.
   */
  public EPPIXNonFatalException( String errorCode,
                                 String message,
                                 Object messageArg ) {
    super( errorCode, message, messageArg );
  }
  
  /**
   * Constructs a new exception with the specified errorCode, detail message
   * and placeholder substituition argument and cause.
   *
   * @param errorCode a code that identifies a specific error condition.
   * @param message the detail message with $0 placeholder(s).
   * @param messageArg an argument that will be substituted for all
   *        occurrences of the $0 placeholder in the detail message.
   * @param cause the cause.
   */
  public EPPIXNonFatalException( String   errorCode,
                                 String   message,
                                 Object   messageArg,
                                 Throwable cause ) {
    super( errorCode, message, messageArg, cause );
  }
  
  /**
   * Constructs a new exception with the specified errorCode, detail message
   * and placeholder substituition arguments.
   *
   * @param errorCode a code that identifies a specific error condition.
   * @param message the detail message with placeholders ($0, $1, etc.).
   * @param messageArgs an array of arguments, each element is substituted
   *        for the corresponding place holder in the detail message.
   */
  public EPPIXNonFatalException( String  errorCode,
                                 String  message,
                                 Object[] messageArgs ) {
    super( errorCode, message, messageArgs );
  }
  
  /**
   * Constructs a new exception with the specified errorCode, detail message,
   * placeholder substituition arguments and cause.
   *
   * @param errorCode errorCode a code that identifies a specific error
   *        condition.
   * @param message the detail message with placeholders.
   * @param messageArgs an array of arguments, each element is substituted
   *        for the corresponding place holder in the detail message.
   * @param cause the cause.
   */
  public EPPIXNonFatalException( String   errorCode,
                                 String   message,
                                 Object[] messageArgs,
                                 Throwable cause ) {
    super( errorCode, message, messageArgs, cause );
  }
  
  /**
   * Constructs a new exception with the specified errorCode, detail message
   * and cause.
   *
   * @param errorCode a code that identifies a specific error condition.
   * @param message the detail message.
   * @param cause the cause.
   */
  public EPPIXNonFatalException( String   errorCode,
                                 String   message,
                                 Throwable cause ) {
    super( errorCode, message, cause );
  }
    
  /**
   * Constructs a new exception with the specified detail message and cause.
   *
   * @param message the detail message.
   * @param cause the cause.
   */
  public EPPIXNonFatalException( String   message,
                                 Throwable cause ) {
    super( message, cause );
  }

  /**
   * Constructs a new exception with the specified cause and a detail message
   * of (cause==null ? null : cause.toString()) (which typically contains
   * the class and detail message of cause). This constructor is useful for
   * exceptions that are little more than wrappers for other throwables
   *
   * @param cause the cause.
   */
  public EPPIXNonFatalException( Throwable cause ) {
    super( cause );
  }

}
