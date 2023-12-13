/* ====================================================================== *
 * (c) Copyright Eppixcomm Tech Ltd.                                      *
 * All Rights Reserved                                                    *
 *                                                                        *
 * Legal Information                                                      *
 * ====================================================================== */
package com.eppixcomm.eppix.base.error;

/**
 * This exception is thrown by an EPPIX module to provide information to the
 * caller. As it does not extent EPPIXRollbackException, changes to the
 * database should be committed.
 *
 * @version $Revision: 1.1 $
 * @author $Author$
 * @since $jdk$
 */
abstract public class EPPIXWarningException
  extends EPPIXNonFatalException {
  /**
   * Constructs a new exception with null as its detail message.
   */
  public EPPIXWarningException() {
    super();
  }

  /**
   * Constructs a new exception with the specified detail message.
   *
   * @param message the detail message.
   */
  public EPPIXWarningException( String message ) {
    super( message );
  }

  /**
   * Constructs a new exception with the specified detail message and cause.
   *
   * @param message the detail message.
   * @param cause the cause.
   */
  public EPPIXWarningException( String   message,
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
  public EPPIXWarningException( Throwable cause ) {
    super( cause );
  }

  /**
   * Constructs a new exception with the specified errorCode and detail
   * message.
   *
   * @param errorCode a code that identifies a specific error condition.
   * @param message the detail message.
   */
  public EPPIXWarningException( String errorCode,
                                String message ) {
    super( errorCode, message );
  }

  /**
   * Constructs a new exception with the specified errorCode, detail message
   * and cause.
   *
   * @param errorCode a code that identifies a specific error condition.
   * @param message the detail message.
   * @param cause the cause.
   */
  public EPPIXWarningException( String   errorCode,
                                String   message,
                                Throwable cause ) {
    super( errorCode, message, cause );
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
  public EPPIXWarningException( String errorCode,
                                String message,
                                Object messageArg ) {
    super( errorCode, message, messageArg );
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
  public EPPIXWarningException( String  errorCode,
                                String  message,
                                Object[] messageArgs ) {
    super( errorCode, message, messageArgs );
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
  public EPPIXWarningException( String   errorCode,
                                String   message,
                                Object   messageArg,
                                Throwable cause ) {
    super( errorCode, message, messageArg, cause );
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
  public EPPIXWarningException( String   errorCode,
                                String   message,
                                Object[] messageArgs,
                                Throwable cause ) {
    super( errorCode, message, messageArgs, cause );
  }

  /**
   * Indicates whether this class of exception should cause changes to the
   * database to be undone.
   *
   * @return false changes made to the database can be committed.
   */
  public boolean causesRollback() {
    return false;
  }
}
