/* ====================================================================== *
 * (c) Copyright Eppixcomm Tech Ltd.                                      *
 * All Rights Reserved                                                    *
 *                                                                        *
 * Legal Information                                                      *
 * ====================================================================== */
package com.eppixcomm.eppix.common.data;

import com.eppixcomm.eppix.base.error.EPPIXObjectBusyException;
import com.eppixcomm.eppix.base.error.EPPIXObjectExpiredException;
import com.eppixcomm.eppix.base.error.EPPIXObjectNotFoundException;
import com.eppixcomm.eppix.base.error.EPPIXSeriousException;
import com.eppixcomm.eppix.base.error.Thrower;

import java.sql.SQLException;

import org.apache.log4j.Logger;

/**
 * This class provides an integrated solution to exception logging and
 * throwing. A Thrower is a thin wrapper around a Log4j Logger. The methods
 * should be considered to represent the 'condition' that has arisen and not
 * the exception that is thrown. For instance, the missingParameter() method
 * does not throw a 'missing parameter' exception, it throws
 * EPPIXSeriousException with its errorCode set to indicate the specific
 * condition. <br>
 * DAO Error Code Summary: - <br>
 * GEN/DAO/000: Object busy: message=$0 <br>
 * GEN/DAO/001: Object expired: message=$0 <br>
 * GEN/DAO/002: Object not found: message=$0 <br>
 * GEN/DAO/003: A database error has occurred: message=$0 <br>
 *
 * @version $Revision: 1.1 $
 * @author $Author$
 * @since $jdk$
 */
public class DAOThrower
  extends Thrower {
  
  /** @deprecated */
  public Logger log;
  
  /**
   * Retrieve a thrower by name. <br>
   *
   * @param name thrower name.
   *
   * @return instance of a Thrower.
   */
  static public DAOThrower getDAOThrower( String name ) {
    return new DAOThrower( name );
  }

  /**
   * Same as calling getDAOThrower(clazz.getName()).
   *
   * @param clazz Class with which to associate the thrower.
   *
   * @return DOCUMENT ME!
   */
  static public DAOThrower getDAOThrower( Class clazz ) {
    return new DAOThrower( clazz );
  }

  /**
   * Creates a new Thrower object.
   *
   * @param name thrower name.
   */
  protected DAOThrower( String name ) {
    super( name );
    this.log = logger;
  }

  /**
   * Creates a new Thrower object.
   *
   * @param clazz Class with which to associate the thrower.
   */
  protected DAOThrower( Class clazz ) {
    super( clazz );
    this.log = logger;
  }

  /**
   * DOCUMENT ME!
   *
   * @param message detail message.
   *
   * @throws EPPIXObjectBusyException
   */
  protected void objectBusy( String message )
                     throws EPPIXObjectBusyException {
    EPPIXObjectBusyException unexpectedException = new EPPIXObjectBusyException(
                                                         "GEN/DAO/000",
                                                         "Object busy: $0",
                                                         message );
    logger.error( unexpectedException );
    throw unexpectedException;
  }

  /**
   * DOCUMENT ME!
   *
   * @param message detail message.
   *
   * @throws EPPIXObjectExpiredException
   */
  protected void objectExpired( String message )
                        throws EPPIXObjectExpiredException {
    EPPIXObjectExpiredException unexpectedException = new EPPIXObjectExpiredException(
                                                            "GEN/DAO/001",
                                                            "Object expired: $0",
                                                            message );
    logger.error( unexpectedException );
    throw unexpectedException;
  }

  /**
   * DOCUMENT ME!
   *
   * @param message detail message.
   *
   * @throws EPPIXObjectNotFoundException
   */
  protected void objectNotFound( String message )
                         throws EPPIXObjectNotFoundException {
    EPPIXObjectNotFoundException unexpectedException =
          new EPPIXObjectNotFoundException( "GEN/DAO/002",
                                            "Object not found: $0", message );
    logger.error( unexpectedException );
    throw unexpectedException;
  }

  /**
   * DOCUMENT ME!
   *
   * @param message detail message.
   * @param cause the cause.
   *
   * @throws EPPIXSeriousException
   */
  protected void unexpected( String      message,
                             SQLException cause )
                     throws EPPIXSeriousException {
    EPPIXSeriousException unexpectedException = new EPPIXSeriousException(
                                                      "GEN/DAO/003",
                                                      "A database error has occurred: $0",
                                                      message, cause );
    logger.error( unexpectedException );
    throw unexpectedException;
  }

  /**
   * DOCUMENT ME!
   *
   * @param cause the cause.
   *
   * @throws EPPIXSeriousException
   */
  protected void unexpected( SQLException cause )
                     throws EPPIXSeriousException {
    EPPIXSeriousException unexpectedException = new EPPIXSeriousException(
                                                      "GEN/DAO/003",
                                                      "A database error has occurred: $0",
                                                      cause.getMessage(),
                                                      cause );
    logger.error( unexpectedException );
    throw unexpectedException;
  }
}
