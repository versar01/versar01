/* ====================================================================== *
 * (c) Copyright Eppixcomm Tech Ltd.                                      *
 * All Rights Reserved                                                    *
 *                                                                        *
 * Legal Information                                                      *
 * ====================================================================== */
package com.eppixcomm.eppix.common.util;

import java.lang.ref.SoftReference;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;


/**
 * The class <code>Date</code> represents a specific instant in time, with 
 * day precision.
 * 
 * @author $Author$
 */
public class Date extends java.util.Date {

  /** Caches for the DateFormatters used by various toString methods. */
  private static SoftReference simpleFormatter = null;

  /** Number of milliseconds in one Day. */
  private static final long ONE_DAY = 86400000;

  private static final DateFormat yyyymmddFormat = new SimpleDateFormat(
      "yyyyMMdd");

  private static ThreadLocal calendar = new ThreadLocal() {
    protected synchronized Object initialValue() {
      return Calendar.getInstance();
    }
  };

  /**
   * Allocates a <code>Date</code> object and initializes it so that it 
   * represents the date, with day precision, at which it was allocated.
   *
   * @see java.lang.System#currentTimeMillis()
   */
  public Date() {
    super(trunc(System.currentTimeMillis()));
  }

  /**
   * Allocates a <code>Date</code> object and initializes it to represent the 
   * date, with day precision, specified by the number of milliseconds since the 
   * standard base time known as "the epoch", namely January 1, 1970, 
   * 00:00:00 GMT. 
   *
   * @param   date the milliseconds since January 1, 1970, 00:00:00 GMT.
   * @see     java.lang.System#currentTimeMillis()
   */
  public Date(long date) {
    super(trunc(date));
  }
  
  public Date(int day, int month, int year) {
    Calendar c = Calendar.getInstance();

    c.set(Calendar.DATE, day);
    c.set(Calendar.MONTH, month - 1);
    c.set(Calendar.YEAR, year);

    setTime(c.getTimeInMillis());
  }
  
  /**
   * Allocates a <code>Date</code> object and initializes it to 
   * represent the date, with day precision, specified by the date object.
   *
   * @param   date date object.
   */
  public Date(java.util.Date date) {
    super(trunc(date.getTime()));
  }
  
  /**
   * Allocates a <code>Date</code> object and initializes it to 
   * represent the date, with day precision, specified by the date object.
   *
   * @param   Object date object.
   */
  public Date(Object date) {
    super(trunc(((java.util.Date)date).getTime()));
  }

  /**
   * Tests with day precision if this date is before the specified date.
   *
   * @param   when   a date.
   * @return  <code>true</code> if and only if the instant of time 
   *            represented by this <tt>Date</tt> object is strictly 
   *            earlier than the instant represented by <tt>when</tt>;
   *          <code>false</code> otherwise.
   */
  public boolean before(java.util.Date when) {
    return getTime() < trunc(when.getTime());
  }

  /**
   * Tests with day precision if this date is after the specified date.
   *
   * @param   when   a date.
   * @return  <code>true</code> if and only if the instant represented 
   *          by this <tt>Date</tt> object is strictly later than the 
   *          instant represented by <tt>when</tt>; 
   *          <code>false</code> otherwise.
   */
  public boolean after(java.util.Date when) {
    return getTime() > trunc(when.getTime());
  }

  /**
   * Compares with day precision, two Dates for ordering.
   *
   * @param   anotherDate   the <code>Date</code> to be compared.
   * @return  the value <code>0</code> if the argument Date is equal to
   *          this Date; a value less than <code>0</code> if this Date
   *          is before the Date argument; and a value greater than
   *      <code>0</code> if this Date is after the Date argument.
   */
  public int compareTo(java.util.Date anotherDate) {
    long thisTime = this.getTime();
    long anotherTime = trunc(anotherDate.getTime());
    return (thisTime < anotherTime ? -1 : (thisTime == anotherTime ? 0 : 1));
  }

  /**
   * Compares with day precision, two dates for equality. The result is 
   * <code>true</code> if and only if the argument is not <code>null</code> 
   * and is a <code>Date</code> object that represents the same point in time, 
   * truncated to the day, as this object.
   * <p>
   *
   * @param   obj   the object to compare with.
   * @return  <code>true</code> if the objects are the same;
   *          <code>false</code> otherwise.
   * @see     java.util.Date#getTime()
   */
  public boolean equals(Object obj) {
    return obj instanceof java.util.Date
        && getTime() == trunc(((java.util.Date) obj).getTime());
  }

  /**
   * Sets this <tt>Date</tt> object to represent a date, with day precision, 
   * that is <tt>time</tt> milliseconds after January 1, 1970 00:00:00 GMT. 
   * <tt>time</tt> is truncated to the day.
   *
   * @param   time   the number of milliseconds.
   */
  public void setTime(long time) {
    super.setTime(trunc(time));
  }

  /**
   * Formats a date in the date escape format yyyy-mm-dd.
   *   
   * @return a String in yyyy-mm-dd format
   */
  public String toString() {

    DateFormat formatter = null;
    if (simpleFormatter != null) {
      formatter = (DateFormat) simpleFormatter.get();
    }
    if (formatter == null) {
      /* No cache yet, or cached formatter GC'd */
      formatter = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
      simpleFormatter = new SoftReference(formatter);
    }
    synchronized (formatter) {
      formatter.setTimeZone(TimeZone.getDefault());
      return formatter.format(this);
    }
  }

  // Override all the time operations inherited from java.util.Date;

  /**
   * This method is deprecated and should not be used because Date values do not
   * have a time component.
   *
   * @deprecated
   * @exception java.lang.IllegalArgumentException if this method is invoked
   * @see #setHours
   */
  public int getHours() {
    throw new java.lang.IllegalArgumentException();
  }

  /**
   * This method is deprecated and should not be used because Date values do not
   * have a time component.
   *
   * @deprecated
   * @exception java.lang.IllegalArgumentException if this method is invoked
   * @see #setMinutes
   */
  public int getMinutes() {
    throw new java.lang.IllegalArgumentException();
  }

  /**
   * This method is deprecated and should not be used because Date values do not
   * have a time component.
   *
   * @deprecated
   * @exception java.lang.IllegalArgumentException if this method is invoked
   * @see #setSeconds
   */
  public int getSeconds() {
    throw new java.lang.IllegalArgumentException();
  }

  /**
   * This method is deprecated and should not be used because Date values do not
   * have a time component.
   *
   * @deprecated
   * @exception java.lang.IllegalArgumentException if this method is invoked
   * @see #getHours
   */
  public void setHours(int i) {
    throw new java.lang.IllegalArgumentException();
  }

  /**
   * This method is deprecated and should not be used because Date values do not
   * have a time component.
   *
   * @deprecated
   * @exception java.lang.IllegalArgumentException if this method is invoked
   * @see #getMinutes
   */
  public void setMinutes(int i) {
    throw new java.lang.IllegalArgumentException();
  }

  /**
   * This method is deprecated and should not be used because Date values do not
   * have a time component.
   *
   * @deprecated
   * @exception java.lang.IllegalArgumentException if this method is invoked
   * @see #getSeconds
   */
  public void setSeconds(int i) {
    throw new java.lang.IllegalArgumentException();
  }

  /**
   * Truncates time to the start of the day.
   * 
   * @param time time in milliseconds.
   * 
   * @return truncated time.
   */
  private static long trunc(long time) {

    Calendar cal = (Calendar) calendar.get();

    cal.setTimeZone(TimeZone.getDefault());
    cal.setTimeInMillis(time);
    cal.set(Calendar.HOUR_OF_DAY, 0);
    cal.set(Calendar.MINUTE, 0);
    cal.set(Calendar.SECOND, 0);
    cal.set(Calendar.MILLISECOND, 0);

    return cal.getTimeInMillis();
  }

  /**
   * Static method to add {n} Days to the given Date
   *
   * @param   numDays   an Integer amount of days to add
   * @param   when      a DateTime to begin the increment.
   * @return  Date      containing incremented date.
   */
  public static Date addDays(Integer numDays, Date when) {
    return addDays(numDays.intValue(), when);
  }

  /**
   * Static method to format a date to yyyymmdd style.
   * 
   * @param when
   * @return the formatted date.
   */
  public static String formatYYYYMMDD(Date when) {
    return yyyymmddFormat.format(when);
  }

  /**
   * Static method to add {n} days to the given Date
   *
   * @param   numDays   an int amount of days to add
   * @param   when      a Date to begin the increment.
   * 
   * @return  Date      containing incremented date.
   */
  public static Date addDays(int numDays, Date when) {

    return new Date(when.getTime() + (ONE_DAY * numDays));

  }

  /**
   * Static method to calculate the difference, in days, between two dates.
   * 
   * @param from
   * @param to
   * @return the difference, in days.
   */
  public static int differenceInDays(Date from, Date to) {
    return (int) ((to.getTime() - from.getTime()) / ONE_DAY);
  }

  /**
   * Static method to calculate the difference, in months, between two dates.
   * 
   * @param from
   * @param to
   * @return the difference, in months.
   */
  public static int differenceInMonths(Date from, Date to) {

    Calendar calendar = new GregorianCalendar();

    calendar.setTimeInMillis(from.getTime());
    int fromTot = calendar.get(Calendar.YEAR) * 12
        + calendar.get(Calendar.MONTH) + 1;

    calendar.setTimeInMillis(to.getTime());
    int toTot = calendar.get(Calendar.YEAR) * 12 + calendar.get(Calendar.MONTH)
        + 1;

    return toTot - fromTot;
  }

  /**
   * Static method to return the date as the first day of the previous
   * month to when.
   * 
   * @param when
   * @return the first day of month previous to when.
   */
  public static Date firstDayOfPreviousMonth(Date when) {
    Calendar cal = Calendar.getInstance();
    cal.setTimeInMillis(when.getTime());
    cal.set(Calendar.DAY_OF_MONTH, 1);
    cal.add(Calendar.MONTH, -1);
    return new Date(cal.getTimeInMillis());
  }

  /**
   * Static method to return the date as the first day of the next
   * month to when.
   * 
   * @param when
   * @return the first day of next month to when.
   */
  public static Date firstDayOfNextMonth(Date when) {
    Calendar cal = Calendar.getInstance();
    cal.setTimeInMillis(when.getTime());
    cal.set(Calendar.DAY_OF_MONTH, 1);
    cal.add(Calendar.MONTH, 1);
    return new Date(cal.getTimeInMillis());
  }

  /**
   * Static method to return the date as the last day of the current
   * month to when.
   * 
   * @param when
   * @return the last day of current month to when.
   */
  public static Date lastDayOfCurrentMonth(Date when) {
    Calendar cal = Calendar.getInstance();
    cal.setTimeInMillis(when.getTime());
    cal.set(Calendar.DAY_OF_MONTH, 1);
    cal.add(Calendar.MONTH, 1);
    cal.add(Calendar.DAY_OF_MONTH, -1);
    return new Date(cal.getTimeInMillis());
  }
  
  
  /**
   * Static method to add (n) months to the given Date.
   * 
   * @param months an int amount of months to add
   * @param when a Date to begin the increment.
   * @return Date containing incremented date.
   */
  public static Date addMonths(int months, Date when) {

    Calendar cal = Calendar.getInstance();
    cal.setTimeInMillis(when.getTime());
    cal.add(Calendar.MONTH, months);

    return new Date(cal.getTimeInMillis());
  }

  /**
   * Static method to add (n) years to the given Date.
   * 
   * @param years an int amount of months to add
   * @param when a Date to begin the increment.
   * @return Date containing incremented date.
   */
  public static Date addYears(int years, Date when) {

    Calendar cal = Calendar.getInstance();
    cal.setTimeInMillis(when.getTime());
    cal.add(Calendar.YEAR, years);

    return new Date(cal.getTimeInMillis());
  }
}