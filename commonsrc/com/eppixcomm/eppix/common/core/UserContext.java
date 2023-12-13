/* ====================================================================== *
 * (c) Copyright Eppixcomm Tech Ltd.                                      *
 * All Rights Reserved                                                    *
 *                                                                        *
 * Legal Information                                                      *
 * ====================================================================== */
package com.eppixcomm.eppix.common.core;

import com.eppixcomm.eppix.common.util.EppixLocale;

/**
 * Provides a context for the user invoking a method in the current thread.
 * 
 * @author $Author$
 * @version $Revision: 1.1 $
 */
public class UserContext {

  private String loginName;
  private EppixLocale locale;
  private String moduleName;
  private String moduleClassName;
  private String moduleMethodName;

  private static ThreadLocal context = new ThreadLocal() {
    protected synchronized Object initialValue() {
      return new UserContext();
    }
  };

  /**
   * Sets the user's context.
   * 
   * @param loginName the user's login name.
   * @param moduleName name of the module the user is invoking.
   * @param moduleClassName name of the class the user is invoking.
   * @param moduleMethodName name of the method the user is invoking.
   * @param locale the user's locale object.
   * 
   * @return UserContext object.
   */
  protected static UserContext set(
    String loginName,
    String moduleName,
    String moduleClassName,
    String moduleMethodName,
    EppixLocale locale) {

    UserContext userContext = get();

    userContext.loginName = loginName;
    userContext.moduleName = moduleName;
    userContext.moduleClassName = moduleClassName;
    userContext.moduleMethodName = moduleMethodName;
    userContext.locale = locale;

    return userContext;
  }

  /**
   * Retrieves the user's context from thread local storage.
   * 
   * @return UserContext object.
   */
  public static UserContext get() {
    return (UserContext) context.get();
  }

  /**
   * Retrieves the user's login name.
   */
  public String getLoginName() {
    return loginName;
  }

  /**
   * Retrieves the name of the module the user is invoking.
   */
  public String getModuleName() {
    return moduleName;
  }

  /**
   * Retrieves the name of the class the user is invoking.
   */
  public String getModuleClassName() {
    return moduleClassName;
  }

  /**
   * Retrieves the name of the method the user is invoking.
   */
  public String getModuleMethodName() {
    return moduleMethodName;
  }

  /**
   * Retrieves the user's locale object.
   */
  public EppixLocale getLocale() {
	  if (locale == null) {
		  locale = new EppixLocale("en");
	  }
    return locale;
  }
}