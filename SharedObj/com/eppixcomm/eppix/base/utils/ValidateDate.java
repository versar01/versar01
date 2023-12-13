package com.eppixcomm.eppix.base.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.StringTokenizer;

import org.apache.log4j.Logger;

import com.eppixcomm.eppix.base.error.EPPIXSeriousException;
import com.eppixcomm.eppix.base.error.Thrower;
import com.eppixcomm.eppix.common.util.Date;

/**
 * 
 * @author vermeu_s This class is used to validate dates from string input and
 *         expect a date string in following format 2013-05-01T00:00:00
 */
public class ValidateDate {

	// Globals
	private static Thrower thrower = Thrower
	.getThrower(ValidateDate.class);
	private Logger logger = thrower.getLogger();
	private String sDate;
	private String sDateTime = "";
	private String sMonth;
	private String sMonthAbbreviated;
	private int iYear;
	private String iYearShort;
	private int iMonth;
	private int iDay;
	private int iHour;
	private int iMin;
	private int iSec;
	private SimpleDateFormat df = null;
	private int[] MonthMax = new int[13];
	private String[] MonthShortName = new String[13];
	private String month[] = { "Placeholder", "January", "February", "March",
			"April", "May", "June", "July", "August", "September", "October",
			"November", "December" };

	private String monthA[] = { "Placeholder", "Jan", "Feb", "Mar", "Apr",
			"May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
	private String strDayName = "";
	private int iDayOfWeek;

	/** Creates a new instance of DateTime */
	public ValidateDate() {
		monthShortName(); // Initialise the Array
	}

	// ------------------------------------------------------------------------------
	// Constructor 2
	public ValidateDate(SimpleDateFormat sd) {
		// need to initialize accorind to the constructors requirements
	}

	// ------------------------------------------------------------------------------
	// Constructor 3
	public ValidateDate(Date d) {
		// need to initialize accorind to the constructors requirements
	}

	// ------------------------------------------------------------------------------
	public String getDateShort() {
		return sDate;
	}

	// ------------------------------------------------------------------------------
	public String getDateLong() {
		return sDateTime;
	}

	// ------------------------------------------------------------------------------
	public int getCurYear() {
		return iYear;
	}

	// ------------------------------------------------------------------------------
	public String getCurYearShort() {

		iYearShort = Integer.toString(iYear);
		iYearShort = iYearShort.substring(2, 4);
		return iYearShort;
	}

	// ------------------------------------------------------------------------------
	public int getCurMonth() {
		return iMonth;
	}

	// ------------------------------------------------------------------------------
	public String getCurMonthName() {
		return sMonth;
	}

	// ------------------------------------------------------------------------------
	public String getCurMonthNameShort() {
		return sMonthAbbreviated;
	}

	// ------------------------------------------------------------------------------
	public int getCurDay() {
		return iDay;
	}

	// ------------------------------------------------------------------------------
	public String getCurDayOfWeekName() {
		return strDayName;
	}

	// ------------------------------------------------------------------------------
	public int getHour() {
		return iHour;
	}

	// ------------------------------------------------------------------------------
	public int getMinute() {
		return iMin;
	}

	// ------------------------------------------------------------------------------
	public int getSecond() {
		return iSec;
	}

	// ------------------------------------------------------------------------------
	public void setDate(String DT) {

		// this takes the following date and parse it from 2002-05-12T00:00:000,
		// 2002/05/12 or 2002 05 12
		// to year, month and day only.

		iYear = Integer.parseInt(DT.substring(0, 4));
		iMonth = Integer.parseInt(DT.substring(5, 7));
		sMonth = month[iMonth];
		sMonthAbbreviated = monthA[iMonth];
		iDay = Integer.parseInt(DT.substring(8, 10));

		sDate = iYear + " " + sMonth + " " + iDay;

	}

	// ------------------------------------------------------------------------------
	public void validateDateFromString(String DT)throws EPPIXSeriousException {
		// this takes the following date and parse it from 2002-05-12 00:00:000,
		// 2002/05/12 or 2002 05 12
		// to year, month and day only.
		try {
			iYear = Integer.parseInt(DT.substring(0, 4));
			iMonth = Integer.parseInt(DT.substring(5, 7));
			iDay = Integer.parseInt(DT.substring(8, 10));

			setDate(iYear, iMonth, iDay);
		} catch (Exception e) {
			logger.error("Exception parsing date from input string: Exception: " + e);
			throw new EPPIXSeriousException(e.getMessage());
		}
	}

	// ------------------------------------------------------------------------------
	public void setDate(int yy, int mm, int dd) throws Exception {

		int txtYear = yy;
		int txtMonth = mm;
		int txtDay = dd;
		int top = 0;

		// 1) Test that all variables has been recieved
		if (txtYear == 0 || txtMonth == 0 || txtDay == 0) {
			
			logger.error("Exception parsing date from input string: Year: " + txtYear + " Month: " + txtMonth + " Day: " + txtDay);
			
			throw new EPPIXSeriousException(
					"Exception parsing date from input string: Year: " + txtYear + " Month: " + txtMonth + " Day: " + txtDay);
		}

		// 2) set MonthMax(array)
//		try{
		monthMax(yy);
//		}catch(ArrayIndexOutOfBoundsException e){
//			throw new Exception(
//			"The month value entered is invalid: " + txtMonth);
//		}

		// 3) Check that the day is in range of days for the required month and
		// year
		try{
			
			top = MonthMax[txtMonth];
		}catch(ArrayIndexOutOfBoundsException e){
			throw new EPPIXSeriousException(
			"The month value entered is invalid: " + txtMonth);
		}
		
		if (!inRange(txtDay, 1, top)) {
			// need to throw an exception
			throw new EPPIXSeriousException("Enter a day between 1 and " + top);
		} else {
			String strmonth = MonthShortName[txtMonth];
			sDate = txtYear + " " + strmonth + " " + txtDay;
			iMonth = txtMonth;
			iYear = txtYear;
			iDay = txtDay;
		}
	}

	// ------------------------------------------------------------------------------
	public String getJDateFromJFormat(String sFormat) {
		// Skryf validasie vir datum sFormat en "RETURN"
		return sFormat;
	}

	// ------------------------------------------------------------------------------
	public void setCurDate() {
		/*
		 * Variable sDate returne "Year MonthName Day" "2002 February 10"
		 * Variable sDateTime =
		 * "Year MonthName Day Hour Minute Second Millisecond"
		 * "2002 February 10 12:23:40:123 " Variable iYear = "year int value"
		 * 
		 * Variable iMonth = "Month int value"
		 * 
		 * Variable sMonth = "Month Name String"
		 * 
		 * Variable iDay = "Day int value"
		 */
		Calendar Cal = Calendar.getInstance();
		String DayName[] = { "Placeholder", "Sunday", "Monday", "Tuesday",
				"Wednesday", "Thursday", "Friday", "Saturday" };

		iYear = Cal.get(Cal.YEAR);
		iMonth = Cal.get(Cal.MONTH) + 1;
		sMonth = month[iMonth];
		sMonthAbbreviated = monthA[iMonth];
		iDay = Cal.get(Cal.DATE);
		iDayOfWeek = Cal.get(Cal.DAY_OF_WEEK);
		strDayName = DayName[iDayOfWeek];

		sDate = iDay + " " + sMonth + " " + iYear;

		sDateTime = sDate + " " + Cal.get(Cal.HOUR);
		sDateTime = sDateTime + ":" + Cal.get(Cal.MINUTE);
		sDateTime = sDateTime + ":" + Cal.get(Cal.SECOND);
		sDateTime = sDateTime + ":" + Cal.get(Cal.MILLISECOND);
	}

	// ------------------------------------------------------------------------------
	public void setDateBack(String datepart, int i) {

		Calendar Cal = Calendar.getInstance();
		Cal.clear();
		Cal.set(iYear, iMonth - 1, iDay);
		// String month[] = {
		// "Placeholder","January","February","March","April","May","June","July","August","September","October","November","December"
		// };
		//
		// String monthA[] = {
		// "Placeholder","Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"
		// };

		if (datepart.equals("MONTH")) {
			Cal.add(Cal.MONTH, i);
		}

		else if (datepart.equals("YEAR")) {
			Cal.add(Cal.YEAR, i);
		}

		else if (datepart.equals("DAY")) {
			Cal.add(Cal.DATE, i);
		}

		iYear = Cal.get(Cal.YEAR);
		iMonth = Cal.get(Cal.MONTH) + 1;
		sMonth = month[iMonth];
		sMonthAbbreviated = monthA[iMonth];
		iDay = Cal.get(Cal.DATE);

		// System.out.println("Day in Back dated object: " + iDay);

		sDate = iYear + " " + sMonth + " " + iDay;

		sDateTime = sDate + " " + Cal.get(Cal.HOUR);
		sDateTime = sDateTime + ":" + Cal.get(Cal.MINUTE);
		sDateTime = sDateTime + ":" + Cal.get(Cal.SECOND);
		sDateTime = sDateTime + ":" + Cal.get(Cal.MILLISECOND);
	}

	// ------------------------------------------------------------------------------
	private void monthShortName() {

		MonthShortName[0] = "Placeholder";
		MonthShortName[1] = "Jan";
		MonthShortName[2] = "Feb";
		MonthShortName[3] = "Mar";
		MonthShortName[4] = "Apr";
		MonthShortName[5] = "May";
		MonthShortName[6] = "Jun";
		MonthShortName[7] = "Jul";
		MonthShortName[8] = "Aug";
		MonthShortName[9] = "Sep";
		MonthShortName[10] = "Oct";
		MonthShortName[11] = "Nov";
		MonthShortName[12] = "Dec";
	}

	// ------------------------------------------------------------------------------
	private void monthMax(int txtYear) {

		if (txtYear % 4 > 0) {
			MonthMax[0] = 31;
			MonthMax[1] = 31;
			MonthMax[2] = 28;
			MonthMax[3] = 31;
			MonthMax[4] = 30;
			MonthMax[5] = 31;
			MonthMax[6] = 30;
			MonthMax[7] = 31;
			MonthMax[8] = 31;
			MonthMax[9] = 30;
			MonthMax[10] = 31;
			MonthMax[11] = 30;
			MonthMax[12] = 31;
		} else {
			MonthMax[0] = 31;
			MonthMax[1] = 31;
			MonthMax[2] = 29;
			MonthMax[3] = 31;
			MonthMax[4] = 30;
			MonthMax[5] = 31;
			MonthMax[6] = 30;
			MonthMax[7] = 31;
			MonthMax[8] = 31;
			MonthMax[9] = 30;
			MonthMax[10] = 31;
			MonthMax[11] = 30;
			MonthMax[12] = 31;
		}

	}

	// ------------------------------------------------------------------------------

	public String getDateCCYYMMDD() {
		String mnth;
		String day;
		int y = getCurYear();
		int m = getCurMonth();
		int d = getCurDay();

		if (m <= 9)
			mnth = "0" + m;
		else
			mnth = m + "";

		if (d <= 9)
			day = "0" + d;
		else
			day = d + "";

		return y + mnth + day;
	}

	// ------------------------------------------------------------------------------
	public String getTimeHHMMSS() {
		String hr;
		String mn;
		String sc;

		int h = getHour();
		int m = getMinute();
		int s = getSecond();

		if (h <= 9)
			hr = "0" + h;
		else
			hr = "" + h;

		if (m <= 9)
			mn = "0" + m;
		else
			mn = "" + m;

		if (s <= 9)
			sc = "0" + s;
		else
			sc = "" + s;

		return hr + mn + sc;
	}

	// ------------------------------------------------------------------------------
	public String convertFormat(String s) {
		/*
		 * Converts date Format YY-MM-DD to CCYYMMDD
		 */

		String y = "";
		String m = "";
		String d = "";

		StringTokenizer t = new StringTokenizer(s, "-");

		while (t.hasMoreElements()) {
			y = t.nextToken();
			m = t.nextToken();
			d = t.nextToken();

		}
		d = d.substring(0, 3);
		return y + m + d;
	}

	// ------------------------------------------------------------------------------
	private boolean inRange(int iDay, int ilo, int ihi) {

		if (iDay < ilo || iDay > ihi) {
			return false;
		} else {
			return true;
		}
	}

	// ------------------------------------------------------------------------------
	// Sets date in required format eg. oldFormat = "yyyy-MM-dd", newFormat =
	// "d MMMM yyyy"
	public String FormatDate(String oldFormat, String newFormat, String date) {

		String formattedDate = "";
		SimpleDateFormat sdfInput = new SimpleDateFormat(oldFormat);
		SimpleDateFormat sdfOutput = new SimpleDateFormat(newFormat);

		try {
			formattedDate = (sdfOutput.format(sdfInput.parse(date)));
		} catch (Exception e) {
			System.out.println("error in parse date in FormatDate in DateTime"
					+ e);
		}

		return formattedDate;
	}

	// ------------------------------------------------------------------------------

	public static void main(String[] args) {
		ValidateDate dt = new ValidateDate();
		try{
			dt.validateDateFromString("2013-02-32T00:00:00");
		}catch(EPPIXSeriousException e){
			e.printStackTrace();
		}

	}

}
