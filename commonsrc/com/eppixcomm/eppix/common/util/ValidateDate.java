package com.eppixcomm.eppix.common.util;

import com.eppixcomm.eppix.base.error.EPPIXSeriousException;

public class ValidateDate {
	private int[] MonthMax = new int[13];
	private String[] MonthShortName;
	private String  sDate;
	private int  iMonth;
    private int  iYear;
    private int  iDay;
    boolean bDay = false;
    boolean bMonth = false;
    
    public boolean isValidDate(String sDate){
    	
    	    	
    	if(sDate.length() != 10) {
    		return false;
    	}
    	
    	try {
			iDay = new Integer(sDate.substring(
					8, 10)).intValue();

			iMonth = new Integer(
					sDate.substring(5, 7))
					.intValue();

			iYear = new Integer(
					sDate.substring(0, 4))
					.intValue();
		} catch (NumberFormatException e) {
			return false;
		}

		return this.isValidDate(iYear,
				iMonth, iDay);

    }
    
public boolean isValidDateddmmyyyy(String sDate){
    	
    	
    	if(sDate.length() != 10) {
    		return false;
    	}
    	
    	try {
			iDay = new Integer(sDate.substring(
					0, 2)).intValue();

			iMonth = new Integer(
					sDate.substring(3, 5))
					.intValue();

			iYear = new Integer(
					sDate.substring(6, 10))
					.intValue();
		} catch (NumberFormatException e) {
			return false;
		}

		return this.isValidDate(iYear,
				iMonth, iDay);

    }
	
	public boolean isValidDate(int yy, int mm, int dd){

	      int txtYear = yy;
	          int txtMonth = mm;
	          int txtDay = dd;
	          int top =0;


	// 1) Test that all variables has been recieved
	            if (txtYear < 0 || txtMonth == 0 || txtDay == 0){
	                   return false;
	            }

	// 2) set MonthMax(array)
	            monthMax(yy);

	// 3) Check that the day is in range of days for the required month and year
	          top = MonthMax[txtMonth];
	          if(inRangeDay(txtDay,1,top)){
	                        // need to throw an exception
	              bDay = true;
	          }else{
	        	  bDay = false;
	           }
	          
	          
	          if(inRangeMonth(mm)){
	        	  bMonth = true;
	          }else{
	        	  bMonth = false;
	          }
	          
	          
	          if(bDay && bMonth){
	        	  return true;
	          }else{
	        	  return false;
	          }
	          
	 }
	
	
	 private boolean inRangeDay(int iDay, int ilo, int ihi)
		{

		if (iDay < ilo || iDay > ihi)
			{
			return false;
			}
		else
			{
			return true;
			}
		}
	 
	 private boolean inRangeMonth(int iMonth)
		{

		if (iMonth < 1 || iMonth > 12)
			{
			return false;
			}
		else
			{
			return true;
			}
		}
	
	
	  private void monthMax(int txtYear){

	      if (txtYear% 4 > 0)
	              {
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
	              }
	          else
	              {
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
	  
	    public int getiMonth() {
			return iMonth;
		}

		public void setiMonth(int iMonth) {
			this.iMonth = iMonth;
		}

		public int getiYear() {
			return iYear;
		}

		public void setiYear(int iYear) {
			this.iYear = iYear;
		}

		public int getiDay() {
			return iDay;
		}

		public void setiDay(int iDay) {
			this.iDay = iDay;
		}

		
	  public static void main(String[] args){
		  ValidateDate val = new ValidateDate();

			boolean isDate = val.isValidDate("2019-06-20");
			
			System.out.println("IS DATE: " + isDate);
			System.out.println("IS DATE: " + val.getiDay() + "-" + val.getiMonth() + "-" + val.getiYear());
		
	  }
}
