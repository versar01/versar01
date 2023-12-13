/* ====================================================================== *
 * (c) Copyright Eppixcomm Tech Ltd.                                      *
 * All Rights Reserved                                                    *
 *                                                                        *
 * Legal Information                                                      *
 * ====================================================================== */
package com.eppixcomm.eppix.base.error;

import java.util.List;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
/**
 * This class provides an integrated solution to exception logging and
 * throwing. A Thrower is a thin wrapper around a Log4j Logger. The methods
 * should be considered to represent the 'condition' that has arisen and not
 * the exception that is thrown. For instance, the missingParameter() method
 * does not throw a 'missing parameter' exception, it throws
 * EPPIXSeriousException with its messageCode set to indicate the specific
 * condition.<br>
 * 
 * @author $Author$
 * @version $Revision: 1.3 $
 * 
 * @since $jdk$
 */
public class Thrower implements GeneralMessages {
  /** The logger. */
  protected Logger logger;

  /**
   * Retrieve a thrower by name. <br>
   *
   * @param name thrower name.
   *
   * @return instance of a Thrower.
   */
  static public Thrower getThrower(String name) {
    return new Thrower(name);
  }

  /**
   * Same as calling getThrower(clazz.getName()).
   *
   * @param clazz Class with which to associate the thrower.
   *
   * @return Thrower object.
   */
  static public Thrower getThrower(Class clazz) {
    return new Thrower(clazz);
  }

  /**
   * Creates a new Thrower object.
   *
   * @param name thrower name.
   */
  protected Thrower(String name) {
    logger = Logger.getLogger(name);
  }

  /**
   * Creates a new Thrower object.
   *
   * @param clazz Class with which to associate the thrower.
   */
  protected Thrower(Class clazz) {
    logger = Logger.getLogger(clazz);
  }

  // business //////////////////////////////////////////////////////////////////

  /**
   * Throws an EPPIXBusniessException which is loggerged if info loggerging is
   * enabled.
   *
   * @param message message object.
   *
   * @throws EPPIXBusinessException
   */
  public void business(Message message) throws EPPIXBusinessException {

    EPPIXBusinessException businessException =
      new EPPIXBusinessException(message);

    if (logger.isInfoEnabled()) {
      logger.info(businessException);
    }

    throw businessException;
  }

  /**
   * Throws an EPPIXBusniessException which is loggerged if info loggerging is
   * enabled.
   *
   * @param message message object.
   * @param messageArg an argument that will be substituted for all
   *        occurrences of the $0 placeholder in the detail message.
   *
   * @throws EPPIXBusinessException
   */
  public void business(Message message, Object messageArg)
    throws EPPIXBusinessException {

    EPPIXBusinessException businessException =
      new EPPIXBusinessException(message, messageArg);

    if (logger.isInfoEnabled()) {
      logger.info(businessException);
    }

    throw businessException;
  }

  /**
   * Throws an EPPIXBusniessException which is loggerged if info loggerging is
   * enabled.
   *
   * @param message message object.
   * @param messageArg an argument that will be substituted for all
   *        occurrences of the $0 placeholder in the detail message.
   * @param cause the cause.
   *
   * @throws EPPIXBusinessException
   */
  public void business(Message message, Object messageArg, Throwable cause)
    throws EPPIXBusinessException {

    EPPIXBusinessException businessException =
      new EPPIXBusinessException(message, messageArg, cause);

    if (logger.isInfoEnabled()) {
      logger.info(businessException);
    }

    throw businessException;
  }

  /**
   * Throws an EPPIXBusniessException which is loggerged if info loggerging is
   * enabled.
   *
   * @param message message object.
   * @param messageArgs an array of arguments, each element is substituted
   *        for the corresponding place holder in the detail message.
   *
   * @throws EPPIXBusinessException
   */
  public void business(Message message, Object[] messageArgs)
    throws EPPIXBusinessException {

    EPPIXBusinessException businessException =
      new EPPIXBusinessException(message, messageArgs);

    if (logger.isInfoEnabled()) {
      logger.info(businessException);
    }

    throw businessException;
  }

  /**
   * Throws an EPPIXBusniessException which is loggerged if info loggerging is
   * enabled.
   *
   * @param message message object.
   * @param messageArgs an array of arguments, each element is substituted
   *        for the corresponding place holder in the detail message.
   * @param cause the cause.
   *
   * @throws EPPIXBusinessException
   */
  public void business(Message message, Object[] messageArgs, Throwable cause)
    throws EPPIXBusinessException {

    EPPIXBusinessException businessException =
      new EPPIXBusinessException(message, messageArgs, cause);

    if (logger.isInfoEnabled()) {
      logger.info(businessException);
    }

    throw businessException;
  }

  /**
   * Throws an EPPIXBusniessException which is loggerged if info loggerging is
   * enabled.
   *
   * @param message message object.
   * @param cause the cause.
   *
   * @throws EPPIXBusinessException
   */
  public void business(Message message, Throwable cause)
    throws EPPIXBusinessException {

    EPPIXBusinessException businessException =
      new EPPIXBusinessException(message, cause);

    if (logger.isInfoEnabled()) {
      logger.info(businessException);
    }

    throw businessException;
  }

  /**
   * Throws an EPPIXBusniessException which is loggerged if info loggerging is
   * enabled.
   *
   * @param messageCode a code that identifies a specific error condition.
   * @param message detail message.
   *
   * @throws EPPIXBusinessException
   */
  public void business(String messageCode, String message)
    throws EPPIXBusinessException {

    EPPIXBusinessException businessException =
      new EPPIXBusinessException(messageCode, message);

    if (logger.isInfoEnabled()) {
      logger.info(businessException);
    }

    throw businessException;
  }

  /**
   * Throws an EPPIXBusniessException which is loggerged if info loggerging is
   * enabled.
   *
   * @param messageCode a code that identifies a specific error condition.
   * @param message the detail message with $0 placeholder(s).
   * @param messageArg an argument that will be substituted for all
   *        occurrences of the $0 placeholder in the detail message.
   *
   * @throws EPPIXBusinessException
   */
  public void business(String messageCode, String message, Object messageArg)
    throws EPPIXBusinessException {

    EPPIXBusinessException businessException =
      new EPPIXBusinessException(messageCode, message, messageArg);

    if (logger.isInfoEnabled()) {
      logger.info(businessException);
    }

    throw businessException;
  }

  /**
   * Throws an EPPIXBusniessException which is loggerged if info loggerging is
   * enabled.
   *
   * @param messageCode a code that identifies a specific error condition.
   * @param message the detail message with $0 placeholder(s).
   * @param messageArg an argument that will be substituted for all
   *        occurrences of the $0 placeholder in the detail message.
   * @param cause the cause.
   *
   * @throws EPPIXBusinessException
   * @deprecated
   */
  public void business(
    String messageCode,
    String message,
    Object messageArg,
    Throwable cause)
    throws EPPIXBusinessException {

    EPPIXBusinessException businessException =
      new EPPIXBusinessException(messageCode, message, messageArg, cause);

    if (logger.isInfoEnabled()) {
      logger.info(businessException);
    }

    throw businessException;
  }

  /**
   * Throws an EPPIXBusniessException which is loggerged if info loggerging is
   * enabled.
   *
   * @param messageCode a code that identifies a specific error condition.
   * @param message the detail message with placeholders ($0, $1, etc.).
   * @param messageArgs an array of arguments, each element is substituted
   *        for the corresponding place holder in the detail message.
   *
   * @throws EPPIXBusinessException
   * @deprecated
   */
  public void business(
    String messageCode,
    String message,
    Object[] messageArgs)
    throws EPPIXBusinessException {

    EPPIXBusinessException businessException =
      new EPPIXBusinessException(messageCode, message, messageArgs);

    if (logger.isInfoEnabled()) {
      logger.info(businessException);
    }

    throw businessException;
  }

  /**
   * Throws an EPPIXBusniessException which is loggerged if info loggerging is
   * enabled.
   *
   * @param messageCode a code that identifies a specific error condition.
   * @param message the detail message with placeholders ($0, $1, etc.).
   * @param messageArgs an array of arguments, each element is substituted
   *        for the corresponding place holder in the detail message.
   * @param cause the cause.
   *
   * @throws EPPIXBusinessException
   * @deprecated
   */
  public void business(
    String messageCode,
    String message,
    Object[] messageArgs,
    Throwable cause)
    throws EPPIXBusinessException {

    EPPIXBusinessException businessException =
      new EPPIXBusinessException(messageCode, message, messageArgs, cause);

    if (logger.isInfoEnabled()) {
      logger.info(businessException);
    }

    throw businessException;
  }

  /**
   * Throws an EPPIXBusniessException which is loggerged if info loggerging is
   * enabled.
   *
   * @param messageCode a code that identifies a specific error condition.
   * @param message detail message.
   * @param cause the cause.
   *
   * @throws EPPIXBusinessException
   * @deprecated
   */
  public void business(String messageCode, String message, Throwable cause)
    throws EPPIXBusinessException {

    EPPIXBusinessException businessException =
      new EPPIXBusinessException(messageCode, message, cause);

    if (logger.isInfoEnabled()) {
      logger.info(businessException);
    }

    throw businessException;
  }

  // fatal /////////////////////////////////////////////////////////////////////

  /**
   * Logs and throws an EPPIXUnexpectedException.
   *
   * @param message detail message.
   *
   * @throws EPPIXFatalException
   */
  public void fatal(String message) throws EPPIXFatalException {

    EPPIXFatalException fatalException =
      new EPPIXFatalException(GEN_000, message);

    logger.fatal(fatalException);
    throw fatalException;
  }
 
  /**
   * Logs and throws an EPPIXUnexpectedException.
   * @errorCode is the code
   * @param message detail message.
   *
   * @throws EPPIXFatalException
   */
  
  public void fatal(Message errorCode,String otherInfo) throws EPPIXFatalException {

	    EPPIXFatalException fatalException = new EPPIXFatalException(errorCode,otherInfo);

	    //logger.fatal(fatalException);
	    logger.fatal(errorCode.getMessageCode()+":"+errorCode.getMessage()+":"+otherInfo,fatalException);
	    throw fatalException;
	  }
  

  
  public void error(Message errorCode,String otherInfo)  {
	  
	  EPPIXSeriousException  nonfatalException = new EPPIXSeriousException(errorCode,otherInfo);
	  logger.error(errorCode.getMessageCode()+":"+errorCode.getMessage()+":"+otherInfo, nonfatalException);
	  
  }
  
  /**
   * Logs and throws an EPPIXUnexpectedException.
   *
   * @param message detail message.
   * @param cause the cause.
   *
   * @throws EPPIXFatalException
   */
  public void fatal(String message, Throwable cause)
    throws EPPIXFatalException {

    EPPIXFatalException fatalException =
      new EPPIXFatalException(GEN_000, message, cause);

    logger.fatal(fatalException);
    throw fatalException;
  }

  /**
   * Logs and throws an EPPIXUnexpectedException.
   *
   * @param cause the cause.
   *
   * @throws EPPIXFatalException
   */
  public void fatal(Throwable cause) throws EPPIXFatalException {
    
    String message = cause.getMessage();
    if (message == null) {
      message = cause.toString();
    }

    EPPIXFatalException fatalException =
      new EPPIXFatalException(GEN_000, message, cause);

    logger.fatal(fatalException);
    throw fatalException;
  }

  // security //////////////////////////////////////////////////////////////////  

  /**
   * Logs and throws an EPPIXSecurityException.
   *
   * @param message detail message.
   * @param cause the cause.
   *
   * @throws EPPIXSecurityException
   */
  public void security(String message, Throwable cause)
    throws EPPIXSecurityException {

    EPPIXSecurityException securityException =
      new EPPIXSecurityException(GEN_004, message, cause);

    logger.error(securityException);
    throw securityException;
  }

  /**
   * Logs and throws an EPPIXSecurityException.
   *
   * @param cause the cause.
   *
   * @throws EPPIXSecurityException
   */
  public void security(Throwable cause) throws EPPIXSecurityException {

    String message = cause.getMessage();
    if (message == null) {
      message = cause.toString();
    }

    EPPIXSecurityException securityException =
      new EPPIXSecurityException(GEN_004, message, cause);

    logger.error(securityException);
    throw securityException;
  }

  // unexpected ////////////////////////////////////////////////////////////////

  /**
   * Logs and throws an EPPIXUnexpectedException.
   *
   * @param message detail message.
   *
   * @throws EPPIXSeriousException
   */
  public void unexpected(String message) throws EPPIXSeriousException {

    EPPIXSeriousException unexpectedException =
      new EPPIXSeriousException(GEN_001, message);

    logger.error(unexpectedException);
    throw unexpectedException;
  }

  /**
   * Logs and throws an EPPIXUnexpectedException.
   *
   * @param message detail message.
   * @param cause the cause.
   *
   * @throws EPPIXSeriousException
   */
  public void unexpected(String message, Throwable cause)
    throws EPPIXSeriousException {

    EPPIXSeriousException unexpectedException =
      new EPPIXSeriousException(GEN_001, message, cause);

    logger.error(unexpectedException);
    throw unexpectedException;
  }

  /**
   * Logs and throws an EPPIXUnexpectedException.
   *
   * @param cause the cause.
   *
   * @throws EPPIXSeriousException
   */
  public void unexpected(Throwable cause) throws EPPIXSeriousException {
    
    String message = cause.getMessage();
    if (message == null) {
      message = cause.toString();
    }

    EPPIXSeriousException unexpectedException =
      new EPPIXSeriousException(GEN_001, message, cause);

    logger.error(unexpectedException);
    throw unexpectedException;
  }

  // parameterExists ///////////////////////////////////////////////////////////

  /**
   * Throws an EPPIXUnexpectedException for an 'parameter exists' condition.
   * The parameter must not have a value.
   *
   * @param parameterName name of the missing parameter.
   *
   * @throws EPPIXSeriousException
   */
  public void parameterExists(String parameterName)
    throws EPPIXSeriousException {

    EPPIXSeriousException unexpectedException =
      new EPPIXSeriousException(GEN_003, parameterName);

    logger.error(unexpectedException);
    throw unexpectedException;
  }

  /**
   * Throws an EPPIXUnexpectedException for a 'parameter exists' condition if
   * the Object's reference is not null.
   *
   * @param parameterName name of the parameter.
   * @param obj the Object to test.
   *
   * @throws EPPIXSeriousException
   */
  public void ifParameterExists(String parameterName, Object obj)
    throws EPPIXSeriousException {
    if (obj != null) {
      parameterExists(parameterName);
    }
  }

  /**
   * Throws an EPPIXUnexpectedException for a 'parameter exists' condition if
   * the String is not null and has a length greater than zero.
   *
   * @param parameterName  name of the parameter.
   * @param str the String to test.
   *
   * @throws EPPIXSeriousException
   */
  public void ifParameterExists(String parameterName, String str)
    throws EPPIXSeriousException {
    if ((str != null) && (str.length() > 0)) {
      parameterExists(parameterName);
    }
  }

  /**
   * Throws an EPPIXUnexpectedException for a 'parameter exists' condition if
   * the List is not null and is not empty.
   *
   * @param parameterName name of the parameter.
   * @param lst the List to test.
   *
   * @throws EPPIXSeriousException
   */
  public void ifParameterExists(String parameterName, List lst)
    throws EPPIXSeriousException {
    if ((lst != null) && !lst.isEmpty()) {
      parameterExists(parameterName);
    }
  }

  // parameterMissing //////////////////////////////////////////////////////////

  /**
   * Throws an EPPIXUnexpectedException for a 'missing parameter' condition.
   *
   * @param parameterName name of the missing parameter.
   *
   * @throws EPPIXSeriousException
   */
  public void parameterMissing(String parameterName)
    throws EPPIXSeriousException {

    EPPIXSeriousException unexpectedException =
      new EPPIXSeriousException(GEN_002, parameterName);

    logger.error(unexpectedException);
    throw unexpectedException;
  }

  /**
   * Throws an EPPIXUnexpectedException for a 'missing parameter' condition
   * if the Object's reference is null.
   *
   * @param parameterName name of the parameter.
   * @param obj the Object to test.
   *
   * @throws EPPIXSeriousException
   */
  public void ifParameterMissing(String parameterName, Object obj)
    throws EPPIXSeriousException {
    if (obj == null) {
      parameterMissing(parameterName);
    }
  }

  /**
   * Throws an EPPIXUnexpectedException for a 'missing parameter' condition
   * if the String is null or has a length of zero.
   *
   * @param parameterName  name of the parameter.
   * @param str the String to test.
   *
   * @throws EPPIXSeriousException
   */
  public void ifParameterMissing(String parameterName, String str)
    throws EPPIXSeriousException {
    if ((str == null) || (str.length() == 0)) {
      parameterMissing(parameterName);
    }
  }

  /**
   * Throws an EPPIXUnexpectedException for a 'missing parameter' condition
   * if the List is null or empty.
   *
   * @param parameterName name of the parameter.
   * @param lst the List to test.
   *
   * @throws EPPIXSeriousException
   */
  public void ifParameterMissing(String parameterName, List lst)
    throws EPPIXSeriousException {
    if ((lst == null) || lst.isEmpty()) {
      parameterMissing(parameterName);
    }
  }

//  /**
//   * Marks the current transaction for rollback and re-throws the exception.
//   *
//   * @param ctx the EJB session context.
//   * @param cause the exception that is causing the rollback.
//   *
//   * @throws EPPIXException
//   */
//  private void setRollbackOnly(SessionContext ctx, EPPIXException cause)
//    throws EPPIXException {
//    try {
//
//      if (ctx != null && cause.causesRollback()) {
//
//        ctx.setRollbackOnly();
//      }
//
//    } catch (IllegalStateException e) {
//
//      logger.error(e);
//    }
//
//    throw cause;
//  }

//  /**
//   * 
//   *  
//   * @param e
//   * @throws EPPIXException
//   */
//  public void checkException(Exception e) throws EPPIXException {
//
//    checkException(e, (SessionContext) null);
//  }

//  /**
//   * 
//   *  
//   * @param e
//   * @param ctx
//   * @throws EPPIXException
//   */
//  public void checkException(Exception e, SessionContext ctx)
//    throws EPPIXException {
//
//    if (EPPIXException.class.isAssignableFrom(e.getClass())) {
//
//      setRollbackOnly(ctx, (EPPIXException)e);
//    }
//
//    try {
//
//      if (e instanceof ServerException) {
//
//        Throwable e1 = ((ServerException)e).detail;
//
//        while (e1 != null && e1 instanceof ServerException) {
//
//          e1 = ((ServerException)e1).detail;
//        }
//
//        if (e1 != null && e1 instanceof EJBException) {
//
//          Exception e2 = ((EJBException)e1).getCausedByException();
//
//          if (e2 instanceof SecurityException) {
//
//            security(((SecurityException)e2).getMessage(), e);
//          }
//        }
//      }
//
//      fatal(e);
//
//    } catch (EPPIXException cause) {
//
//      setRollbackOnly(ctx, cause);
//    }
//  }

  /**
   * Gets the logger.
   * 
   * @return logger.
   */
  public Logger getLogger() {

    return this.logger;
  }

 }