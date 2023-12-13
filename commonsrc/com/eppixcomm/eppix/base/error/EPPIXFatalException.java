/* ====================================================================== *
 * (c) Copyright Eppixcomm Tech Ltd.                                      *
 * All Rights Reserved                                                    *
 *                                                                        *
 * Legal Information                                                      *
 * ====================================================================== */
package com.eppixcomm.eppix.base.error;

/**
 * This exception is thrown by an EPPIX module when an unexpected error
 * condition is detected that will prevent the system from functioning. The
 * application is unlikely to be able to process other method calls. An
 * error resulting from an application deployment problem, such as a JNDI
 * lookup failure, should throw this type of exception.
 *
 * @version $Revision: 1.1 $
 * @author $Author$
 * @since $jdk$
 */
public class EPPIXFatalException
  extends EPPIXException {
  /**
   * Constructs a new exception with null as its detail message.
   */
  public EPPIXFatalException() {
    super();
  }

  /**
   * Constructs a new exception with the specified detail message.
   *
   * @param message the detail message.
   */
  public EPPIXFatalException( String message ) {
    super( message );
  }

  /**
   * Constructs a new exception with the specified detail message and cause.
   *
   * @param message the detail message.
   * @param cause the cause.
   */
  public EPPIXFatalException( String   message,
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
  public EPPIXFatalException( Throwable cause ) {
    super( cause );
  }

  /**
   * Constructs a new exception with the specified errorCode and detail
   * message.
   *
   * @param errorCode a code that identifies a specific error condition.
   * @param message the detail message.
   */
  public EPPIXFatalException( String errorCode,
                              String message ) {
    super( errorCode, message );
  }
  
  /**
   * Constructs a new EPPIXFatalException using the given message.
   *  
   * @param message
   */
  public EPPIXFatalException( Message message ) {
    super( message );
  }

  /**
   * Constructs a new exception with the specified errorCode, detail message
   * and cause.
   *
   * @param errorCode a code that identifies a specific error condition.
   * @param message the detail message.
   * @param cause the cause.
   */
  public EPPIXFatalException( String   errorCode,
                              String   message,
                              Throwable cause ) {
    super( errorCode, message, cause );
  }

  /**
   * Constructs a new EPPIXFatalException using the given message based on cause.
   * 
   * @param message
   * @param cause
   */  
  public EPPIXFatalException( Message   message,
                              Throwable cause ) {
    super( message, cause );
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
  public EPPIXFatalException( String errorCode,
                              String message,
                              Object messageArg ) {
    super( errorCode, message, messageArg );
  }
  
  /**
   * Constructs a new EPPIXFatalException using the given message and argument.
   * 
   * @param message
   * @param messageArg
   */
  public EPPIXFatalException( Message message,
                              Object messageArg ) {
    super( message, messageArg );
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
  public EPPIXFatalException( String  errorCode,
                              String  message,
                              Object[] messageArgs ) {
    super( errorCode, message, messageArgs );
  }
  
  /**
   * Constructs a new EPPIXFatalException using the given message and arguments.
   *  
   * @param message
   * @param messageArgs
   */
  public EPPIXFatalException( Message  message,
                              Object[] messageArgs ) {
    super( message, messageArgs );
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
  public EPPIXFatalException( String   errorCode,
                              String   message,
                              Object   messageArg,
                              Throwable cause ) {
    super( errorCode, message, messageArg, cause );
  }
  
  /**
   * Constructs a new EPPIXFatalException using the given message and argument for cause.
   * 
   * @param message
   * @param messageArg
   * @param cause
   */
  public EPPIXFatalException( Message   message,
                              Object    messageArg,
                              Throwable cause ) {
    super( message, messageArg, cause );
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
  public EPPIXFatalException( String   errorCode,
                              String   message,
                              Object[] messageArgs,
                              Throwable cause ) {
    super( errorCode, message, messageArgs, cause );
  }
  
  /**
   * Constructs a new EPPIXFatalException using the given message and arguments for cause.
   *
   * @param message
   * @param messageArgs
   * @param cause
   */
  public EPPIXFatalException( Message   message,
                              Object[] messageArgs,
                              Throwable cause ) {
    super( message, messageArgs, cause );
  }
}
