package com.eppixcomm.eppix.common.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import com.eppixcomm.eppix.base.error.EPPIXFatalException;

public class CreateLogProperties {
	// Globals
	private static String fileSep = System.getProperty("file.separator");
	private static final String RESOURCES_PATH = System.getProperty("user.dir")
			+ fileSep + "MTN-AppProperties" + fileSep + "eppix-soa-ss"
			+ fileSep;

	private static String debug = "false";
	private static String rootlogger = "debug";
	private static String threshold = "DEBUG";
	private static String appendar = "org.apache.log4j.RollingFileAppender";
	private static String fiLe = RESOURCES_PATH	;

	private static String maxSize = "100MB";

	// Keep one backup file
	private String macBackup = "3";
	private String pattern = "org.apache.log4j.PatternLayout";
	private String layout = "%-20d{yyyyMMdd: HHmmss} %5p%6.6r[%t]%x - %C.%M(%F:%L) - %m%n";
	private Properties props = null;
//	private InputStream in = null;
	private String propFileName = null;
	private String logFileName = null;
	private String appendarName = null;
	private String earFileName = null;
	
	

	public CreateLogProperties(String propFileName, String appendarName, String earFileName, String logFileName) {
		super();
		this.setPropFileName(propFileName);
		this.setAppendarName(appendarName);
		this.setEarFileName(earFileName);
		this.setLogFileName(logFileName);
		
//		System.out.println("CONSTRUCTOR:" + this.toString());
	}

	public void loadLogPropertiesFile()throws EPPIXFatalException {

		// First try loading from the current directory
		props = new Properties();
		FileInputStream in = null;
		try {
			in = new FileInputStream(RESOURCES_PATH + this.propFileName);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
//		System.out.println("LOADED FILE: " + in);
		
		if(in == null){
			
//			System.out.println("DID NOT LOAD FILE: " + in);
			this.savePropertyFile();
			
			try {
				in = new FileInputStream(RESOURCES_PATH + this.propFileName);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
				throw new EPPIXFatalException();
			}
		}
		
		try {
			props.load(in);
		} catch (IOException e) {
//			e.printStackTrace();
		} catch(NullPointerException e1){
//			e1.printStackTrace();
		}
		
		
		if(props == null){
			throw new EPPIXFatalException("Log4j Properties file could not be created. This is Fatal...");
		}
	}
	
	public void savePropertyFile() throws EPPIXFatalException{
	    try {
	        Properties props = new Properties();
	        props.setProperty("log4j.debug", this.debug);
	        props.setProperty("log4j.rootLogger", this.rootlogger + "," + this.appendarName);
	        props.setProperty("log4j.threshold", this.threshold);
	        props.setProperty("log4j.appender." + this.appendarName , this.appendar);
	        props.setProperty("log4j.appender."+ this.appendarName +".File", this.fiLe + this.logFileName);
	        props.setProperty("log4j.appender."+ this.appendarName +".MaxFileSize", this.maxSize);
	        props.setProperty("log4j.appender."+ this.appendarName +".MaxBackupIndex", this.macBackup);
	        props.setProperty("log4j.appender."+ this.appendarName +".layout", this.pattern);
	        props.setProperty("log4j.appender."+ this.appendarName +".layout.ConversionPattern", this.layout);
	        
	        File f = new File(RESOURCES_PATH + this.propFileName);
	        OutputStream out = new FileOutputStream(f);
	        props.store(out, "Properties file for ear file: " + this.earFileName);
	        
	    }
	    catch (Exception e ) {
	        e.printStackTrace();
	        throw new EPPIXFatalException(e);
	    }
	}

	@Override
	public String toString() {
		return "\nCreateLogProperties [props=" + props
				+ "\npropFileName=" + propFileName + "\nappendarName="
				+ appendarName + "\nearFileName=" + earFileName + "\nRESOURCES_PATH=" + RESOURCES_PATH + "]";
	}

	public Properties getProps() {
		return props;
	}

	public void setProps(Properties props) {
		this.props = props;
	}

	public String getPropFileName() {
		return propFileName;
	}

	public void setPropFileName(String propFileName) {
		this.propFileName = propFileName;
	}

	public String getAppendarName() {
		return appendarName;
	}

	public void setAppendarName(String appendarName) {
		this.appendarName = appendarName;
	}

	public String getEarFileName() {
		return earFileName;
	}

	public void setEarFileName(String earFileName) {
		this.earFileName = earFileName;
	}
	
//	public static void main(String[] args) {
//		CreateLogProperties properties = new CreateLogProperties("eppix-test.properties", "TST", "myEarFile", "debug-app.log4j.properties");
//		try {
//			properties.loadLogPropertiesFile();
//		} catch (EPPIXFatalException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

//		Properties tstProps = properties.getProps();
		
//		System.out.println(tstProps.toString());
//	}

	public String getLogFileName() {
		return logFileName;
	}

	public void setLogFileName(String logFileName) {
		this.logFileName = logFileName;
	}
}
