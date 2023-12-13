/* ====================================================================== *
 * (c) Copyright Eppixcomm Tech Ltd.                                      *
 * All Rights Reserved                                                    *
 *                                                                        *
 * Legal Information                                                      *
 * ====================================================================== */
package com.eppixcomm.eppix.base.error;

import java.text.DateFormat;

/**
 * The superclass of all exceptions thrown by EPPIX modules.
 *
 * @version $Revision: 1.1 $
 * @since $jdk$
 */
public class EPPIXException
  extends Exception {
  /** A code that identifies a specific error condition. */
  private String messageCode;
  /**
   * An array of objects that are converted to strings when substituted for
   * placeholders in the detail message.
   */
  private Object[] messageArgs;

  /**
   * Constructs a new exception with null as its detail message.
   */
  public EPPIXException() {
    super();
  }
  
  /**
   * Constructs a new EPPIXException using the given message.
   * 
   * @param message
   */
  public EPPIXException( Message message ) {
    super( message.getMessage() );
    this.messageCode = message.getMessageCode();
  }
  
  /**
   * Constructs a new EPPIXException using the given message and argument.
   * 
   * @param message
   * @param messageArg
   */
  public EPPIXException( Message message,
                         Object messageArg ) {
    super( message.getMessage() );
    this.messageCode = message.getMessageCode();
    this.messageArgs = new Object[] {
      messageArg
    };
  }

  /**
   * Constructs a new EPPIXException using the given message and argument, based on
   * cause.
   * 
   * @param message
   * @param messageArg
   * @param cause
   */
  public EPPIXException( Message   message,
                         Object    messageArg,
                         Throwable cause ) {
    super( message.getMessage(), cause );
    this.messageCode = message.getMessageCode();
    this.messageArgs = new Object[] {
      messageArg
    };
  }
  
  /**
   * Constructs a new EPPIXException using the given message and arguments.
   * 
   * @param message
   * @param messageArgs
   */
  public EPPIXException( Message  message,
                         Object[] messageArgs ) {
    super( message.getMessage() );
    this.messageCode = message.getMessageCode();
    this.messageArgs = messageArgs;
  }

  /**
   * Constructs a new EPPIXException using the given message and arguments, based on
   * cause.
   * 
   * @param message
   * @param messageArgs
   * @param cause
   */
  public EPPIXException( Message  message,
                         Object[] messageArgs,
                         Throwable cause ) {
    super( message.getMessage(), cause );
    this.messageCode = message.getMessageCode();
    this.messageArgs = messageArgs;
  }
  
  /**
   * Constructs a new EPPIXException using the given message based on cause.
   *   
   * @param message
   * @param cause
   */  
  public EPPIXException( Message   message,
                         Throwable cause ) {
    super( message.getMessage(), cause );
    this.messageCode = message.getMessageCode();
  }
  
  /**
   * Constructs a new exception with the specified detail message.
   *
   * @param message the detail message.
   */
  public EPPIXException( String message ) {
    super( message );
  }

  /**
   * Constructs a new exception with the specified detail message and cause.
   *
   * @param message the detail message.
   * @param cause the cause.
   */
  public EPPIXException( String   message,
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
  public EPPIXException( Throwable cause ) {
    super( cause );
  }

  /**
   * Constructs a new exception with the specified messageCode and detail
   * message.
   *
   * @param messageCode a code that identifies a specific error condition.
   * @param message the detail message.
   */
  public EPPIXException( String messageCode,
                         String message ) {
    super( message );
    this.messageCode = messageCode;
  }
  
  /**
   * Constructs a new exception with the specified messageCode, detail message
   * and cause.
   *
   * @param messageCode a code that identifies a specific error condition.
   * @param message the detail message.
   * @param cause the cause.
   */
  public EPPIXException( String   messageCode,
                         String   message,
                         Throwable cause ) {
    super( message, cause );
    this.messageCode = messageCode;
  }

  /**
   * Constructs a new exception with the specified messageCode, detail message
   * and placeholder substituition argument.
   *
   * @param messageCode a code that identifies a specific error condition.
   * @param message the detail message with $0 placeholder(s).
   * @param messageArg an argument that will be substituted for all
   *        occurrences of the $0 placeholder in the detail message.
   */
  public EPPIXException( String messageCode,
                         String message,
                         Object messageArg ) {
    super( message );
    this.messageCode = messageCode;
    this.messageArgs = new Object[] {
      messageArg
    };
  }
  
  /**
   * Constructs a new exception with the specified messageCode, detail message
   * and placeholder substituition arguments.
   *
   * @param messageCode a code that identifies a specific error condition.
   * @param message the detail message with placeholders ($0, $1, etc.).
   * @param messageArgs an array of arguments, each element is substituted
   *        for the corresponding place holder in the detail message.
   */
  public EPPIXException( String  messageCode,
                         String  message,
                         Object[] messageArgs ) {
    super( message );
    this.messageCode = messageCode;
    this.messageArgs = messageArgs;
  }
  
  /**
   * Constructs a new exception with the specified messageCode, detail message
   * and placeholder substituition argument and cause.
   *
   * @param messageCode a code that identifies a specific error condition.
   * @param message the detail message with $0 placeholder(s).
   * @param messageArg an argument that will be substituted for all
   *        occurrences of the $0 placeholder in the detail message.
   * @param cause the cause.
   */
  public EPPIXException( String   messageCode,
                         String   message,
                         Object   messageArg,
                         Throwable cause ) {
    super( message, cause );
    this.messageCode = messageCode;
    this.messageArgs = new Object[] {
      messageArg
    };
  }

  /**
   * Constructs a new exception with the specified messageCode, detail message,
   * placeholder substituition arguments and cause.
   *
   * @param messageCode a code that identifies a specific error
   *        condition.
   * @param message the detail message with placeholders.
   * @param messageArgs an array of arguments, each element is substituted
   *        for the corresponding place holder in the detail message.
   * @param cause the cause.
   */
  public EPPIXException( String   messageCode,
                         String   message,
                         Object[] messageArgs,
                         Throwable cause ) {
    super( message, cause );
    this.messageCode = messageCode;
    this.messageArgs = messageArgs;
  }

	/**
	 * Returns the message code.
	 *
	 * @return message code or the empty string.
	 */
	public String getMessageCode() {
		return (messageCode == null) ? "" : messageCode;
	}
	
  /**
   * Returns the message code.
   *
	 * @return message code or the empty string.
   */
  public String getErrorCode() {
		return (messageCode == null) ? "" : messageCode;
  }

  /**
   * Returns the exception's detail message with its placeholders replaced
   * with corresponding elements from the array of message arguments.
   *
   * @return detail message.
   */
  public String getMessage() {
    return replaceholders( super.getMessage() );
  }

  /**
   * Returns the exception's message arguments.
   *
   * @return message arguments.
   */
  public Object[] getMessageArgs() {
    return messageArgs;
  }

  /**
   * Replaces the placeholders ($0, $1, etc.) in the message with
   * corresponding elements from the array of message arguments.  e.g., The
   * argument at index 0 is substituted for all occurrences of $0 in the
   * message. A language specific detail message, corresponding to the
   * messageCode can be passed into this method to have its placeholders
   * substituted. <br>
   * Date message arguments are formatted according to the default locale
   * and the following placeholder modifiers :- <br>
   * $dn - date. <br>
   * $dtn - date and time. <br>
   * $tn - time. <br>
   * $n - string. <br>
   * where n is the placeholder message argument subscript.
   *
   * @param message detail message with optional place holders.
   *
   * @return detail message with its placeholders substituted.
   */
  public String replaceholders( String message ) {
    if ( message == null ) {
      return "";
    }

    if ( messageArgs == null ) {
      return message;
    }

    try {
      String messageWithArgs = message;
      
      // check for message type - may start with $0 or $1...
      // then we can work from there.
      int offset = 0;
      
      if (messageWithArgs.indexOf("$0") >= 0) {
        offset = 0;
      } else {
        offset = 1;
      }

      for ( int i = 0; i < messageArgs.length; ++i ) {
        String iString = Integer.toString( i + offset );

        if ( messageArgs[i] instanceof java.util.Date ) {
          messageWithArgs = messageWithArgs.replaceAll(
                                  "\\$d" + iString,
                                  DateFormat.getDateInstance().format( messageArgs[i] ) );
          messageWithArgs = messageWithArgs.replaceAll(
                                  "\\$dt" + iString,
                                  DateFormat.getDateTimeInstance().format( messageArgs[i] ) );
          messageWithArgs = messageWithArgs.replaceAll(
                                  "\\$t" + iString,
                                  DateFormat.getTimeInstance().format( messageArgs[i] ) );
        }

        if ( messageArgs[i] != null ) {
          messageWithArgs = messageWithArgs.replaceAll(
                                  "\\$" + iString,
                                  messageArgs[i].toString() );
        }
      }

      return messageWithArgs;
    } catch ( RuntimeException e ) {
      // It isn't important if the substitution has failed in some way so we'll
      // just return the original message.
      return message;
    }
  }

  /**
   * Indicates whether this class of exception should cause changes to the
   * database to be undone.
   *
   * @return true should cause a rollback of any changes made to the
   *         database.
   */
  public boolean causesRollback() {
    return true;
  }
  
  /**
   * Returns true if the message codes are equal.
   *  
   * @param message
   * @return true if the message codes are the same.
   */
  public boolean messageCodeEquals( Message message ) {
    
    return ( messageCode == null ) ? false
      : ( message == null ) ? false
      : ( messageCode.equals( message.getMessageCode() ));
  }
}
