package com.eppixcomm.eppix.common.util;


/**
 * DOCUMENT ME!
 *
 * @version $Revision: 1.1 $
 * @author $Author$
 * @since $jdk$
 */
public class ServiceLocatorException
  extends Exception {
  /**
   * Creates a new ServiceLocatorException object.
   */
  public ServiceLocatorException() {
  }

  /**
   * Creates a new ServiceLocatorException object.
   *
   * @param message DOCUMENT ME!
   */
  public ServiceLocatorException( String message ) {
    super( message );
  }

  /**
   * Creates a new ServiceLocatorException object.
   *
   * @param message DOCUMENT ME!
   * @param cause DOCUMENT ME!
   */
  public ServiceLocatorException( String message, Throwable cause ) {
    super( message, cause );
  }

  /**
   * Creates a new ServiceLocatorException object.
   *
   * @param cause DOCUMENT ME!
   */
  public ServiceLocatorException( Throwable cause ) {
    super( cause );
  }
} /* class ServiceLocatorException */
