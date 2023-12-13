package com.eppixcomm.eppix.common.data;

import com.eppixcomm.eppix.base.error.EPPIXBusinessException;

public class Period {

  private String name;

  private int index;

  /**
   * "W"
   */
  public static final Period WEEK = new Period("WEEK", 0);

  /**
   * "M"
   */
  public static final Period MONTH = new Period("MONTH", 1);

  /**
   * "D"
   */
  public static final Period DAY = new Period("DAY", 2);

  /**
   * "Q"
   */
  public static final Period QUARTER = new Period("QUARTER", 3);

  private Period(String string, int i) {
    name = string;
    index = i;
  }

  public static Period map(final String p) throws EPPIXBusinessException {
    if ("W".equalsIgnoreCase(p)) {
      return WEEK;
    } else if ("M".equalsIgnoreCase(p)) {
      return MONTH;
    } else if ("Q".equalsIgnoreCase(p)) {
      return QUARTER;
    } else if ("D".equalsIgnoreCase(p)) {
      return DAY;
    } else {
      throw new EPPIXBusinessException("Invalid Period - '" + p + "'");
    }
  }

  public static String map(Period p) throws EPPIXBusinessException {
    if (p == WEEK) {
      return "W";
    } else if (p == MONTH) {
      return "M";
    } else if (p == QUARTER) {
      return "Q";
    } else if (p == DAY) {
      return "D";
    } else {
      throw new EPPIXBusinessException("Invalid Period - '" + p + "'");
    }
  }
}
