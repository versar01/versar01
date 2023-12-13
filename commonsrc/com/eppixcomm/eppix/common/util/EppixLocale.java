/* ====================================================================== *
 * (c) Copyright Eppixcomm Tech Ltd.                                      *
 * All Rights Reserved                                                    *
 *                                                                        *
 * Legal Information                                                      *
 * ====================================================================== */
package com.eppixcomm.eppix.common.util;

import java.io.*;
import java.util.HashMap;

/**
 * @author $Author$
 * @version $Revision: 1.2 $
 */
public class EppixLocale implements Serializable {

  private String languageCode;
  private int databaseTraceLevel;
  //private HashMap<String, Object> details;
  private String loginName;
  private String loginAddr;
  private boolean autoClose = true;

  public EppixLocale() {
  }

  public EppixLocale(String languageCode) {
    this.languageCode = languageCode;
  }

  public String getLanguageCode() {
    return languageCode;
  }

  public void setLanguageCode(String languageCode) {
    this.languageCode = languageCode;
  }

  public int getDatabaseTraceLevel() {
    return databaseTraceLevel;
  }

  public void setDatabaseTraceLevel(int databaseTraceLevel) {
    this.databaseTraceLevel = databaseTraceLevel;
  }
  
//  public void addDetail(String key, Object value) {
//  	if (details == null) {
//  		details = new HashMap<String, Object>();
//  	}
//  	
//  	details.put(key, value);
//  }
//  
//  public Object getDetail(String key) {
//  	if (details != null) {
//  		return details.get(key);
//  	}
//  	
//  	return null;
//  }

  public boolean isAutoClose() {
    return autoClose;
  }

  public void setAutoClose(boolean autoClose) {
    this.autoClose = autoClose;
  }

  public String getLoginName() {
    return loginName;
  }

  public void setLoginName(String loginName) {
    this.loginName = loginName;
  }

  public String getLoginAddr() {
    return loginAddr;
  }

  public void setLoginAddr(String loginAddr) {
    this.loginAddr = loginAddr;
  }
}
