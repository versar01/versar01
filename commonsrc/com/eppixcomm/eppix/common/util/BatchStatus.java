package com.eppixcomm.eppix.common.util;

import com.eppixcomm.eppix.base.error.EPPIXSeriousException;

public final class BatchStatus {
  /**
   * * "STARTING" - STARTING
   */
	public static final BatchStatus STARTING = new BatchStatus("STARTING", 0);

  /**
   * * "RUNNING" - RUNNING
   */
	public static final BatchStatus RUNNING = new BatchStatus("RUNNING", 1);

  /**
   * * "STOPPING" - STOPPING
   */
	public static final BatchStatus  STOPPING = new BatchStatus("STOPPING", 2);

  /**
   * * "STOPPED" - STOPPED
   */
	public static final BatchStatus STOPPED = new BatchStatus("STOPPED", 3);

  /**
   * * "ERROR" - ERROR
   */
	public static final BatchStatus ERROR = new BatchStatus("ERROR", 4);

  /**
   * * "SUCCESSFUL" - SUCCESSFUL
   */
	public static final BatchStatus SUCCESSFUL = new BatchStatus("SUCCESSFUL", 5);

  /**
   * * "FINISHED" - FINISHED
   */
	public static final BatchStatus FINISHED = new BatchStatus("FINISHED", 6);

  /**
   * * "IDLE" - IDLE
   */
	public static final BatchStatus IDLE = new BatchStatus("IDLE", 7);

  /**
   * * "STOPPINGAFTERFILE" - STOPPINGAFTERFILE
   */
	public static final BatchStatus STOPPINGAFTERFILE = new BatchStatus("STOPPINGAFTERFILE", 8);

	private static final BatchStatus[] $VALUES = { STARTING, RUNNING, STOPPING,
		STOPPED, ERROR, SUCCESSFUL, FINISHED, IDLE, STOPPINGAFTERFILE };
private static final long serialVersionUID = 0L;

private String name;
private int index;

public static BatchStatus[] values() {
	return (BatchStatus[]) $VALUES.clone();
}

private BatchStatus(String string, int i) {
	name = string;
	index = i;
}

public String getName() {
	return name;
}

public int getIndex() {
	return index;
}
  /**
   * valid statuses 
   *  "STARTING" 
   *  "RUNNING" 
   *  "STOPPING" 
   *  "STOPPED" 
   *  "ERROR" 
   *  "SUCCESSFUL" 
   *  "FINISHED" 
   *  "STOPPINGAFTERFILE"
   * @param status - String value of BatchStatus
   * @return BatchStatus
   * @throws EPPIXSeriousException
   */
  public static BatchStatus map(String status) throws EPPIXSeriousException {
    if ("IDLE".equals(status)) {
      return IDLE;
    }
    if ("STARTING".equals(status)) {
      return STARTING;
    }
    if ("RUNNING".equals(status)) {
      return RUNNING;
    }
    if ("STOPPING".equals(status)) {
      return STOPPING;
    }
    if ("STOPPED".equals(status)) {
      return STOPPED;
    }
    if ("ERROR".equals(status)) {
      return ERROR;
    }
    if ("SUCCESSFUL".equals(status)) {
      return SUCCESSFUL;
    }
    if ("FINISHED".equals(status)) {
      return FINISHED;
    }
    if ("STOPPINGAFTERFILE".equals(status)) {
      return STOPPINGAFTERFILE;
    }

    throw new EPPIXSeriousException("Status '" + status + "' invalid.");
  }

  /**
   * 
   * @param status
   * @return String
   */
  public static String map(BatchStatus status) {

    switch (status.getIndex()) {

        
    case 0:
      return "STARTING";
      
    case 1:
      return "RUNNING";

    case 2:
      return "STOPPING";

    case 3:
      return "STOPPED";

    case 4:
      return "ERROR";

    case 5:
      return "SUCCESSFUL";

    case 6:
      return "FINISHED";
      
    case 7:
        return "IDLE";

    case 8:
      return "STOPPINGAFTERFILE";
    }

    return null;

  }

}
