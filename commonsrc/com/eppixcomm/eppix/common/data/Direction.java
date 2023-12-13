package com.eppixcomm.eppix.common.data;

import com.eppixcomm.eppix.base.error.EPPIXBusinessException;

public class Direction {

  private String name;

  private int index;

  public static final Direction BACKWARD = new Direction("BACKWARD", 0);

  public static final Direction FORWARD = new Direction("FORWARD", 1);

  private Direction(String string, int i) {
    name = string;
    index = i;
  }

  public static Direction map(String inAdvance) throws EPPIXBusinessException {
    if ("Y".equals(inAdvance)) {
      return FORWARD;
    } else if ("N".equals(inAdvance)) {
      return BACKWARD;
    }

    throw new EPPIXBusinessException("Invalid option '" + inAdvance
        + "'. Should be Y or N.");
  }
}
