/* ====================================================================== *
 * (c) Copyright Eppixcomm Tech Ltd.                                      *
 * All Rights Reserved                                                    *
 *                                                                        *
 * Legal Information                                                      *
 * ====================================================================== */
package com.eppixcomm.eppix.common.core;

import java.util.HashMap;

import com.eppixcomm.eppix.common.data.DAC;
import com.eppixcomm.eppix.common.util.EppixLocale;

/**
 * The super-class for all Business Logic objects. It enables each BLO to be 
 * bound by the BLOBinder class and provides the 'environment', including locale
 * and security information, to the business logic.
 *  
 * @author $Author$
 * @version $Revision: 1.4 $
 */
public abstract class BLO {

  /** The user's context. */
  private UserContext userContext;
  /** The user's (caller's) login name. */
  private String loginName;
  /** 
   * Extracted from the EppixLocale object as a shortcut, available to the 
   * business logic, to the user's default (working) language.
   */
  protected String defaultLanguageCode;
   
  /** The user's locale information. */
  private EppixLocale locale;
  
  private HashMap map;

  /**
   * Provides the user's (caller's) login name to the business logic.
   * 
   * @return login name.
   */
  protected String loginName() {
    return loginName;
  }

  /**
   * Provides the user's locale information to the business logic.
   * 
   * @return EppixLocale object.
   */
  protected EppixLocale locale() {
    return locale;
  }

//  /**
//   * Provides the system language code to the business logic.
//   * 
//   * @return system language code
//   */
//  protected String systemLanguageCode() {
//    return systemLanguageCode;
//  }
  
  /**
   * Invoked by the BLOBinder to provide itself to the BLO so that it may call
   * other BLOs that the binder provides.
   * 
   * @param bloBinder BLOBinder object.
   */
  abstract protected void setBinder(BLOBinder bloBinder);
  
  abstract protected Class getDACClass();

  /**
   * Invoked by the BLOBinder to provide the BLO with its data access controller.
   * 
   * @param dac data access controller (implementation) object.
   */
  abstract protected void setDAC(DAC dac);

  /**
   * Invoked by the BLOBinder to provide the BLO with the user's locale 
   * information.
   * 
   * @param locale EppixLocale object.
   */
  void setLocale(EppixLocale locale) {
    this.locale = locale;
    this.defaultLanguageCode = locale.getLanguageCode();
  }

  /**
   * Invoked by the BLOBinder to provide the BLO with the user's (caller's) 
   * login name. This method is not callable from the BLO subclasses in a 
   * module's blo package and hence the login name can not be changed 
   * accidentally or otherwise by the business logic. The login name should 
   * always be retrieved using the loginName() method.
   * 
   * @param loginName the user's login name.
   */
  void setLoginName(String loginName) {
    this.loginName = loginName;
  }

  void setUserContext(UserContext userContext) {
    this.userContext = userContext;
    this.loginName = userContext.getLoginName();
    this.locale = userContext.getLocale();
    this.defaultLanguageCode = locale.getLanguageCode();
  }

  public UserContext userContext() {
    return userContext;
  }
}