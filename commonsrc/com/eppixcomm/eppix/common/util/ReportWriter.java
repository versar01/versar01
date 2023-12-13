package com.eppixcomm.eppix.common.util;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;

import com.eppixcomm.eppix.base.error.EPPIXFatalException;

public class ReportWriter {
	
	private FileWriter out;
	private Calendar cal;	
	
	public void writeToFile(StringBuffer contents, String fileName)throws EPPIXFatalException{

	      try{
	         out = new FileWriter(fileName, true);
	         out.write(contents.toString());
	         out.flush();
	         out.close();
	      }
	      catch(IOException oe){
	         throw new EPPIXFatalException(String.valueOf(oe.getMessage()));
	      }
   }
}
