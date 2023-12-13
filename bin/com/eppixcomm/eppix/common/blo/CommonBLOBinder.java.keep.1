/* ====================================================================== *
 * (c) Copyright Eppixcomm Tech Ltd.                                      *
 * All Rights Reserved                                                    *
 *                                                                        *
 * Legal Information                                                      *
 * ====================================================================== */
package com.eppixcomm.eppix.common.blo;

import java.sql.Connection;

import javax.ejb.EJBContext;

import com.eppixcomm.eppix.common.core.BLOBinder;
import com.eppixcomm.eppix.base.error.EPPIXBusinessException;
import com.eppixcomm.eppix.base.error.EPPIXFatalException;
import com.eppixcomm.eppix.base.error.EPPIXUnexpectedException;
import com.eppixcomm.eppix.base.error.Thrower;
import com.eppixcomm.eppix.common.util.EppixLocale;

/**
 * This is the binder for common business logic objects.
 * 
 * @author $Author$
 * @version $Revision: 1.5 $
 */
public abstract class CommonBLOBinder extends BLOBinder {

  protected String systemLanguageCode;

  /**
   * Creates a new CommonBLOBinder object.
   * 
   * @param ctx
   * @param locale
   * @param dacFactoryClass
   * @param thrower
   * @throws EPPIXFatalException
   */
//  protected CommonBLOBinder(
//    EJBContext ctx,
//    EppixLocale locale,
//    Class dacFactoryClass,
//    Thrower thrower) throws EPPIXFatalException {
//    super(ctx, locale, dacFactoryClass, thrower);
//  }

  /**
   * Creates a new CommonBLOBinder object.
   * 
   * @param loginName
   * @param locale
   * @param dacFactoryClass
   * @param connection
   * @param thrower
   * @throws EPPIXFatalException
   */
  public CommonBLOBinder(
    String loginName,
    EppixLocale locale,
    Class dacFactoryClass,
    Connection connection,
    Thrower thrower) throws EPPIXFatalException {

    super(loginName, locale, dacFactoryClass, connection, thrower);
  }

  /**
   * Creates a new CommonBLOBinder object.
   * 
   * @param ctx
   * @param locale
   * @param thrower
   * @throws EPPIXFatalException
   */
  protected CommonBLOBinder(EJBContext ctx, EppixLocale locale, Thrower thrower)
    throws EPPIXFatalException {
    super(ctx, locale, null, thrower);
  }

  public Description description() throws EPPIXFatalException {
    return (Description) getBLO(Description.class);
  }

  public EnumeratedType enumeratedType() throws EPPIXFatalException {
    return (EnumeratedType) getBLO(EnumeratedType.class);
  }

  abstract public Language language() throws EPPIXFatalException;

  /**
   * Provides the system language code to the business logic.
   * 
   * @return system language code
   * @throws EPPIXFatalException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXBusinessException
   */
  protected String systemLanguageCode() throws EPPIXBusinessException,
    EPPIXUnexpectedException, EPPIXFatalException {

    if (systemLanguageCode == null) {
      systemLanguageCode = language().getSystem().getLanguageId();
    }
    return systemLanguageCode;
  }
}