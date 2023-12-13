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
 * The class <code>DateTime</code> represents a specific instant in time, with 
 * second precision.
 * 
 * @author $Author$
 */
public class DateTime extends java.util.Date {

  /** Number of milliseconds in one second. */
  private static final long ONE_SECOND = 1000;
  
  /** Number of milliseconds in one Hour. */
  private static final long ONE_HOUR = 3600000;
  
  /** Number of milliseconds in one Day. */
  private static final long ONE_DAY = 86400000;
  
  /** Enumerated SECOND */
  public static final int SECOND = 1;
  
  /** Enumerated HOUR */
  public static final int HOUR = 2;
  
  /** Enumerated DAY */
  public static final int DAY = 3;

  
  
  /**
   * Caches for the DateFormatters used by various toString methods.
   */
  private static SoftReference simpleFormatter = null;  
  /**
   * Formatter used for JUnit tests that use XML persistence.
   */
  private static SimpleDateFormat m_xmlFormat = new SimpleDateFormat("yyyyMMddHHmmss");
  private static SimpleDateFormat yyyymmddhhmmssFormat = new SimpleDateFormat("yyyyMMddHHmmssSS");
  private static SimpleDateFormat dd_mm_yyyyhhmmssFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

  /**
   * Are we in XML test mode?
   */
  private static boolean m_xmlTest = false;
 
  /**
   * Allocates a <code>DateTime</code> object and initializes it so that it 
   * represents the date and time, with second precision, at which it was 
   * allocated. 
   *
   * @see java.lang.System#currentTimeMillis()
   */
  public DateTime() {
    super(trunc(System.currentTimeMillis()));
  }
  
  /**
   * Allocates a <code>DateTime</code> object and initializes it to represent 
   * the date and time, with second precision, specified by the number of 
   * milliseconds since the standard base time known as "the epoch", namely 
   * January 1, 1970, 00:00:00 GMT. 
   *
   * @param   date   the milliseconds since January 1, 1970, 00:00:00 GMT.
   * @see     java.lang.System#currentTimeMillis()
   */
  public DateTime(long date) {
    super(trunc(date));
  }

  /**
   * Allocates a <code>DateTime</code> object and initializes it to 
   * represent the date and time, with second precision, specified by the date
   * object. 
   *
   * @param   date date object
   */
  public DateTime(java.util.Date date) {
    super(trunc(date.getTime()));
  }

  /**
   * Allocates a <code>DateTime</code> object and initializes it to 
   * represent the date and time, with second precision, specified by
   * the String in the format YYYYMMDD or YYYYMMDDHHMMSS. 
   *
   * @param stamp
   */
  public DateTime(String stamp) {
  		try {
  			// Normalise so we don't need to be given time as well as date
  			stamp = stamp + "00000000000000";
  			setTime(DateTime.m_xmlFormat.parse(stamp.substring(0, 14)).getTime());
  		}
  		catch(Exception e) {
  				setTime(0);	// Unable to parse, default to something invalid
  		}
  }

	/**
   * Sets or unsets XML test mode, which affects the toString() method.
   *
   * @param   xmlTest   true if XML test mode is to be enabled.
   */
  public static void setXmlTestMode(boolean xmlTest) {
  	m_xmlTest = xmlTest;
  }
  
	/**
   * Tests with second precision if this date is before the specified date.
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
   * Tests with second precision if this date is after the specified date.
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
   * Compares with second precision, two Dates for ordering.
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
   * Sets this <tt>Date</tt> object to represent a date and time, with second 
   * precision, that is <tt>time</tt> milliseconds after January 1, 1970 
   * 00:00:00 GMT. <tt>time</tt> is truncated to the second.
   *
   * @param   time   the number of milliseconds.
   */
  public void setTime(long time) {
    super.setTime(trunc(time));
  }
  
  /**
   * Formats a date in the date escape format yyyy-mm-dd hh:mm:ss.
   *   
   * @return a String in yyyy-MM-dd HH:mm:ss format
   */
  public String toString() {
    DateFormat formatter = null;
     if (simpleFormatter != null) {
      formatter = (DateFormat) simpleFormatter.get();
    }
    if (formatter == null) {
      /* No cache yet, or cached formatter GC'd */
      formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
      simpleFormatter = new SoftReference(formatter);
    }
    // Override formatter if in XML test mode
    if (m_xmlTest) formatter = m_xmlFormat;
    synchronized (formatter) {
      formatter.setTimeZone(TimeZone.getDefault());
      return formatter.format(this);
    }   
   }
  
  /**
   * Truncates time to the second.
   * 
   * @param time time in milliseconds.
   * 
   * @return truncated time.
   */
  private static long trunc(long time) {
    return time / ONE_SECOND * ONE_SECOND;
  }
  
  
  /**
   * Static method to add {n} Seconds, Hours or Days to the given DateTime
   *
   * @param   unitType  SECOND, HOUR, DAY "enumerated" static vars
   * @param   numUnits   an Integer amount of Seconds, Hours or Days to add
   * @param   when      a DateTime to begin the increment.
   * @return  DateTime containing incremented date.
   */
  public static DateTime add(int unitType, Integer numUnits, DateTime when) {
    return add(unitType, numUnits.intValue(), when);
  }
  
  /**
   * Static method to add {n} Seconds, Hours or Days to the given DateTime
   *
   * @param   unitType  SECOND, HOUR, DAY "enumerated" static vars
   * @param   numUnits   an int amount of Seconds, Hours or Days to add
   * @param   when      a DateTime to begin the increment.
   * @return  DateTime containing incremented date.
   */
  public static DateTime add(int unitType, int numUnits, DateTime when) {
    if (unitType == SECOND) {
      return new DateTime(when.getTime() + (ONE_SECOND * numUnits) );
    }
    if (unitType == HOUR) {
      return new DateTime(when.getTime() + (ONE_HOUR * numUnits) );
    }
    if (unitType == DAY) {
      return new DateTime(when.getTime() + (ONE_DAY * numUnits) );
    }
    return null;
  }
  
  /**
   * Static method to format a datetime to yyyymmddhhMMss style.
   * 
   * @param when
   * @return formatted {@link DateTime}
   */
  public static String formatYYYYMMDDHHMMSSSS(DateTime when) {
  	return yyyymmddhhmmssFormat.format(when);
  }

  /**
   * Static method to format a millisecond datetime to yyyymmddhhMMssSS style.
   * 
   * @param when
   * @return formatted {@link DateTime}
   */
//  public static String formatYYYYMMDDHHMMSSSS(long when) {
//    //return yyyymmddhhmmssFormat.format(when);
//  }

  /**
   * Static method to format a datetime to "dd/mm/yyyy hh:mm:ss" style.
   * 
   * @param when
   * @return formatted {@link DateTime}
   */
  public static String formatDDMMYYYYHHMMSS(DateTime when) {
    return dd_mm_yyyyhhmmssFormat.format(when);
  }

}
