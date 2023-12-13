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
import java.util.Locale;
import java.util.TimeZone;

/**
 * The class <code>Time</code> represents a specific time on any date, with 
 * second precision.
 * 
 * @author $Author$
 */
public class Time extends java.util.Date {

  /** Number of milliseconds in one day. */
  private static final long ONE_DAY = 24 * 60 * 60 * 1000;

  /** Number of milliseconds in one second. */
  private static final long ONE_SECOND = 1000;

  /**
   * Caches for the DateFormatters used by various toString methods.
   */
  private static SoftReference simpleFormatter = null;

  private static SimpleDateFormat hhmmssFormat = new SimpleDateFormat("HHmmss");

  protected static Time timeInstance;

  /**
   * Allocates a <code>Time</code> object and initializes it so that it 
   * represents the time, with second precision, at which it was allocated. 
   *
   * @see java.lang.System#currentTimeMillis()
   */
  public Time() {
    super(trunc(System.currentTimeMillis()));
  }

  /**
   * Allocates a <code>Time</code> object and initializes it to represent the 
   * time, with second precision, specified by the number of milliseconds since 
   * the standard base time known as "the epoch", namely January 1, 1970, 
   * 00:00:00 GMT. 
   *
   * @param   time the milliseconds since January 1, 1970, 00:00:00 GMT.
   * @see     java.lang.System#currentTimeMillis()
   */
  public Time(long time) {
    super(trunc(time));
  }

  /**
   * Allocates a <code>Time</code> object and initializes it to represent the 
   * time, with second precision, specified by the date object. 
   *
   * @param   date date object
   */
  public Time(java.util.Date date) {
    super(trunc(date.getTime()));
  }

  /**
   * Tests with second precision if this time is before the specified date.
   *
   * @param   when   a date.
   * @return  <code>true</code> if and only if the instant of time 
   *            represented by this <tt>Time</tt> object is strictly 
   *            earlier than the instant represented by <tt>when</tt>;
   *          <code>false</code> otherwise.
   */
  public boolean before(java.util.Date when) {
    return getTime() < trunc(when.getTime());
  }

  /**
   * Tests with second precision if this time is after the specified date.
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

  public int compareTo(java.util.Date anotherDate) {
    long thisTime = this.getTime();
    long anotherTime = trunc(anotherDate.getTime());
    return (thisTime < anotherTime ? -1 : (thisTime == anotherTime ? 0 : 1));
  }

  public void setTime(long time) {
    super.setTime(trunc(time));
  }

  /**
   * Formats a time in the date escape format hh:mm:ss.
   *   
   * @return a String in HH:mm:ss format
   */
  public String toString() {

    DateFormat formatter = null;
    if (simpleFormatter != null) {
      formatter = (DateFormat) simpleFormatter.get();
    }
    if (formatter == null) {
      /* No cache yet, or cached formatter GC'd */
      formatter = new SimpleDateFormat("HH:mm:ss", Locale.US);
      simpleFormatter = new SoftReference(formatter);
    }
    synchronized (formatter) {
      formatter.setTimeZone(TimeZone.getDefault());
      return formatter.format(this);
    }
  }

  // Override all the date operations inherited from java.util.Date;

  /**
   * This method is deprecated and should not be used because <code>Time</code> 
   * values do not have a year component.
   *
   * @deprecated
   * @exception java.lang.IllegalArgumentException if this
   *           method is invoked
   * @see #setYear
   */
  public int getYear() {
    throw new java.lang.IllegalArgumentException();
  }

  /**
   * This method is deprecated and should not be used because <code>Time</code> 
   * values do not have a month component.
   *
   * @deprecated
   * @exception java.lang.IllegalArgumentException if this
   *           method is invoked
   * @see #setMonth
   */
  public int getMonth() {
    throw new java.lang.IllegalArgumentException();
  }

  /**
   * This method is deprecated and should not be used because <code>Time</code> 
   * values do not have a day component.
   *
   * @deprecated
   * @exception java.lang.IllegalArgumentException if this
   *           method is invoked
   */
  public int getDay() {
    throw new java.lang.IllegalArgumentException();
  }

  /**
   * This method is deprecated and should not be used because <code>Time</code> 
   * values do not have a date component.
   *
   * @deprecated
   * @exception java.lang.IllegalArgumentException if this
   *           method is invoked
   * @see #setDate
   */
  public int getDate() {
    throw new java.lang.IllegalArgumentException();
  }

  /**
   * This method is deprecated and should not be used because <code>Time</code> 
   * values do not have a year component.
   *
   * @deprecated
   * @exception java.lang.IllegalArgumentException if this
   *           method is invoked
   * @see #getYear
   */
  public void setYear(int i) {
    throw new java.lang.IllegalArgumentException();
  }

  /**
   * This method is deprecated and should not be used because <code>Time</code> 
   * values do not have a month component.
   *
   * @deprecated
   * @exception java.lang.IllegalArgumentException if this
   *           method is invoked
   * @see #getMonth
   */
  public void setMonth(int i) {
    throw new java.lang.IllegalArgumentException();
  }

  /**
   * This method is deprecated and should not be used because <code>Time</code> 
   * values do not have a date component.
   *
   * @deprecated
   * @exception java.lang.IllegalArgumentException if this
   *           method is invoked
   * @see #getDate
   */
  public void setDate(int i) {
    throw new java.lang.IllegalArgumentException();
  }

  /**
   * Removes the date component from <code>time</code> and truncates the
   * milliseconds.
   * 
   * @param time time in milliseconds.
   * 
   * @return truncated time.
   */
  private static long trunc(long time) {
    return (long) (Math.floor(time % ONE_DAY / (double) ONE_SECOND) * ONE_SECOND);
  }

  /**
   * Static method to format a time to "hhmmss" style.
   * 
   * @param when
   * @return formatted {@link DateTime}
   */
  public static String formatHHMMSS(Time when) {
    return hhmmssFormat.format(when);
  }

  /**
   * Returns the time in seconds.
   * 
   * @param when
   * @return the time in seconds.
   */
  public static int toSeconds(Time when) {
    return (int) (when.getTime() / 1000);
  }

  /**
   * Converts seconds to Time
   * 
   * @param seconds
   * @return Time
   */
  public static Time fromSeconds(int seconds) {
    Time time = new Time();
    time.setTime(seconds * 1000);
    return time;
  }

  /**
   * Singleton created to assist testing
   * @return
   */
  public static Time getCurrentTime() {
    Time time = getInstance();
    return time.now();
  }

  public Time now() {
    return new Time();
  }

  private static Time getInstance() {
    if (timeInstance == null) {
      timeInstance = new Time();
    }
    return timeInstance;
  }
  
  public String getHHMM(){
	    DateFormat formatter = null;
	    if (simpleFormatter != null) {
	      formatter = (DateFormat) simpleFormatter.get();
	    }
	    if (formatter == null) {
	      /* No cache yet, or cached formatter GC'd */
	      formatter = new SimpleDateFormat("HHmm", Locale.US);
	      simpleFormatter = new SoftReference(formatter);
	    }
	    synchronized (formatter) {
	      formatter.setTimeZone(TimeZone.getDefault());
	      return formatter.format(this);
	    }	  
  }
}
