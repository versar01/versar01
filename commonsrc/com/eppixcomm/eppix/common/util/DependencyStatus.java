package com.eppixcomm.eppix.common.util;

import com.eppixcomm.eppix.base.error.EPPIXSeriousException;

public class DependencyStatus {

  private String name;

  private int index;

  /** Status of dependency: 
   * "IDLE" - Not yet run
   */
  public static final DependencyStatus IDLE = new DependencyStatus("IDLE", 0);

  /** Status of dependency: 
   * "RUNNING" - identifies that the program is in progress.
   */
  public static final DependencyStatus RUNNING = new DependencyStatus(
      "RUNNING", 1);

  /** Status of dependency: 
   * "SUCCESSFUL" - program/batch finished successfully
   */
  public static final DependencyStatus SUCCESS = new DependencyStatus(
      "SUCCESS", 2);

  /** Status of dependency: 
   * "ERROR" - program/batch finished with an error 
   */
  public static final DependencyStatus ERROR = new DependencyStatus("ERROR", 3);

  private DependencyStatus(String string, int i) {
    name = string;
    index = i;
  }

  public static DependencyStatus map(String status)
      throws EPPIXSeriousException {

    if ("IDLE".equals(status)) {
      return IDLE;
    }
    if ("RUNNING".equals(status)) {
      return RUNNING;
    }
    if ("SUCCESSFUL".equals(status)) {
      return SUCCESS;
    }
    if ("ERROR".equals(status)) {
      return ERROR;
    }

    throw new EPPIXSeriousException("Status '" + status + "' invalid.");
  }

  public static String map(DependencyStatus status) {

    if (status == IDLE) {
      return "IDLE";
    } else if (status == RUNNING) {
      return "RUNNING";
    } else if (status == SUCCESS) {
      return "SUCCESSFUL";
    } else if (status == ERROR) {
      return "ERROR";
    }

    return null;

  }
}
