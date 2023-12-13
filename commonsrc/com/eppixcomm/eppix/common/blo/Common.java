/* ====================================================================== *
 * (c) Copyright Eppixcomm Tech Ltd.                                      *
 * All Rights Reserved                                                    *
 *                                                                        *
 * Legal Information                                                      *
 * ====================================================================== */
package com.eppixcomm.eppix.common.blo;

import com.eppixcomm.eppix.base.error.Thrower;
import com.eppixcomm.eppix.base.error.EPPIXFatalException;
import com.eppixcomm.eppix.base.error.EPPIXUnexpectedException;

/**
 * This is the Business Logic Object Binder (BLOB) for the EPPIX Common module.
 * Its purpose is to provide a single instance of each Business Logic Object
 * (BLO) that it binds. The BLOB passes itself into each BLO to allow it to
 * access methods in another BLOs that the BLOB provides.
 *
 * @version $Revision: 1.1 $
 * @author $Author$
 * @since $jdk$
 * @deprecated use CommonBLOBinder
 */
public abstract class Common {
  /** Error handler. */
  private static Thrower thrower = Thrower.getThrower( Common.class );
  /**
   * The code provided to each Data Access Controller to allow the retrieval
   * of language specific descriptions.
   */
  protected String defaultLanguageCode;
  /** BLO variables. */
  protected Description description = null;
  protected Language language = null;
  
  /**
   * Closes the Business Logic Object Binder freeing database resources.
   *
   * @throws EPPIXUnexpectedException
   */
  abstract protected void close()
                throws EPPIXUnexpectedException;

  /**
   * Only attempts to close the Business Logic Object Binder if its object
   * reference is not null.
   *
   * @param crm Business Logic Object Binder.
   */
  public static void close( Common common ) {
    try {
      if ( common != null ) {
				common.close();
      }
    } catch ( EPPIXUnexpectedException e ) {
      // We do not want to mask any other exception that may have been thrown,
      // so do nothing. It should have already been logged by the thrower.
    }
  }

	/**
	 * Provides the Description Business Logic Object.
	 *
	 * @return Description Business Logic Object.
	 *
	 * @throws EPPIXFatalException if the Business Logic Object fails to
	 *         instantiate.
	 */
	abstract public Description description()
															throws EPPIXFatalException;
	
	/**
	 * Provides an Language Business Logic Object.
	 *
	 * @return Language Business Logic Object.
	 *
	 * @throws EPPIXFatalException if the Business Logic Object fails to
	 *         instantiate.
	 */
	abstract public Language language()
															throws EPPIXFatalException;
}  