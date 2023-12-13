package com.eppixcomm.eppix.common.core;

import java.util.Map;

import javax.security.auth.Subject;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.login.LoginException;
import javax.security.auth.spi.LoginModule;

public class PasswordLoginModule implements LoginModule {

  public boolean abort() throws LoginException {
    return false;
  }

  public boolean commit() throws LoginException {
    return false;
  }

  public void initialize(Subject arg0, CallbackHandler arg1, Map arg2, Map arg3) {

  }

  public boolean login() throws LoginException {
    return false;
  }

  public boolean logout() throws LoginException {
    return false;
  }

}
