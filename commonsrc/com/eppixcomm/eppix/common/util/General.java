package com.eppixcomm.eppix.common.util;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Calendar;

import com.eppixcomm.eppix.common.data.Direction;
import com.eppixcomm.eppix.common.data.Period;
import com.eppixcomm.eppix.base.error.EPPIXBusinessException;
import com.eppixcomm.eppix.base.error.EPPIXSeriousException;
import com.eppixcomm.eppix.base.error.EPPIXUnexpectedException;

public class General {

  /**
   * Shifts the period by the requested amount, returning a new Date.
   * 
   * @param initialDate
   * @param period
   * @param frequency
   * @param day
   * @param type
   * 
   * @return the shifted date.
   * 
   * @throws EPPIXBusinessException
   */
  public static Date shiftPeriod(Date initialDate, Period period,
      int frequency, int day, Direction type) throws EPPIXBusinessException {
    Calendar calcDate = Calendar.getInstance();

    // Frequency parameter must be +ve and non-zero..
    if (frequency <= 0) {
      throw new EPPIXBusinessException(
          "Parameter p_freq must be greater than zero");
    }

    // Day parameter must be +ve and non-zero..
    if (day < 0) {
      throw new EPPIXBusinessException("Parameter day must not be negative");
    }

    // convert date to calendar, for manipulation
    Calendar initialCal = Calendar.getInstance();
    initialCal.setTime(initialDate);

    // Multiply freq by -1 if going backwards
    if (type == Direction.BACKWARD) {
      frequency *= -1;
    }

    // Calculate the date depending on the period & frequency
    if (period == Period.WEEK) {
      // Add (frequency * 7) days to initialDate
      calcDate.setTime(initialCal.getTime());
      calcDate.add(Calendar.DAY_OF_MONTH, frequency * 7);

    } else {

      int desiredDay;

      // Set desired day
      if (day > 0) {

        desiredDay = day;

      } else {

        desiredDay = initialCal.get(Calendar.DAY_OF_MONTH);

      }

      // Set up start point
      int month = initialCal.get(Calendar.MONTH);
      int year = initialCal.get(Calendar.YEAR);
      calcDate.set(year, month, 1);

      // Add 1 to frequency
      frequency++;

      // Add frequency MONTHS to date & take off 1 day 
      calcDate.add(Calendar.MONTH, frequency);
      calcDate.add(Calendar.DAY_OF_MONTH, -1);

      // Adjust desired day
      if (calcDate.get(Calendar.DAY_OF_MONTH) > desiredDay) {

        calcDate.set(Calendar.DAY_OF_MONTH, desiredDay);
      }

    }
    return new Date(calcDate.getTimeInMillis());
  }

  public static String getMachineName() throws EPPIXSeriousException {
    try {
      return InetAddress.getLocalHost().getHostName();
    } catch (UnknownHostException e) {
      throw new EPPIXSeriousException(e);
    }
  }

  public static String getMachineIP() throws EPPIXSeriousException {
    try {
      return InetAddress.getLocalHost().getHostAddress();
    } catch (UnknownHostException e) {
      throw new EPPIXSeriousException(e);
    }
  }
}
