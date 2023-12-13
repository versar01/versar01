package com.eppixcomm.eppix.base.test;

import java.io.FileInputStream;
import java.math.BigDecimal;
import java.sql.Connection;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.eppixcomm.eppix.base.blo.BaseBLOBinder;
import com.eppixcomm.eppix.base.blo.SelfServBundleProv;
import com.eppixcomm.eppix.base.blo.SimAPNServices;
import com.eppixcomm.eppix.base.blo.SmhSimHistoryDMO;
import com.eppixcomm.eppix.base.error.EPPIXFatalException;
import com.eppixcomm.eppix.base.error.EPPIXSeriousException;
import com.eppixcomm.eppix.base.error.Thrower;
import com.eppixcomm.eppix.base.errors.ApplicationMessages;
import com.eppixcomm.eppix.base.resp.SelfServProvResponse;
import com.eppixcomm.eppix.common.data.ConnectionManager;
import com.eppixcomm.eppix.common.data.StringDMO;
import com.eppixcomm.eppix.common.util.Date;
import com.eppixcomm.eppix.common.util.DateTime;

public class TestSimRetail {
	// Globals
	private static Thrower thrower = Thrower.getThrower(TestSelfServiceProv.class);
	private static Logger logger = thrower.getLogger();
	private BaseBLOBinder base;
	SimAPNServices services = null;
	private static String fileSep = System.getProperty("file.separator");
	private static final String RESOURCES_PATH = System.getProperty("user.dir")
			+ fileSep;
	public SimpleDateFormat dtFormat = new SimpleDateFormat("dd MMM yyyy");
	protected SimpleDateFormat dtFormat1ddMMyyyy = new SimpleDateFormat(
			"ddmmyyyy");
	private Properties properties;
	private Connection connection;
	
	public TestSimRetail() {
		PropertyConfigurator.configure(RESOURCES_PATH
				+ "/MTN-AppProperties/eppix-soa-ss/eppix-sslprov-debuglog4j.properties");
		
		try {
			this.loadproperties();
		} catch (EPPIXSeriousException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try {
			this.dbConnectionInit();
		} catch (EPPIXFatalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		this.testSimRetailSimSuspend();
//		this.testSimRetailUnSuspend();
//		this.testSMHSubstring();
//		this.testGetFutureEvent();
//		this.testSimList();
		this.testFRAU();
	}
	
	
	private void testSimRetailSimSuspend(){

		System.out.println(services.simSuspend("vermeu_s", "Eppix", "ENG", "0005189637239", "123456", "csr_user", "SSSS", new Date()).toString());
	}
	
	private void testSimRetailUnSuspend(){
		
		String val = "987654321234579";
		
	System.out.println(services.unsuspend("vermeu_s", "Eppix", "ENG", "0005744839452", "123456", "csr_user", "REAS", new Date()).toString());
	}
	
	private void testGetFutureEvent(){

		System.out.println(services.simGetFutureEvent("vermeu_s", "Eppix", "ENG", "0005744839452", "", "").toString());
	}
	
	private void testSimList(){

		System.out.println(services.simList("vermeu_s", "Eppix", "ENG", "0004929283966", "", "", "A").toString());
	}
	
	private void testSMHSubstring(){
		
		StringDMO smhDMO = null;
		
		try {
			smhDMO = services.simAPNServicesDAC.getSmhHistory(
					12148160, "0004251719868");
		} catch (EPPIXSeriousException e) {
			logger.error(e.getMessage());
		}

		if (smhDMO != null) {
			
			System.out.println("smhDMO.getSmhComment(): " + smhDMO.getString());
			System.out.println("smhDMO.getSmhComment()Substring: " + smhDMO.getString().substring(5, 9));
			
			if (smhDMO.getString().contains("FRTD")
					|| smhDMO.getString().contains("FRAU")) {
				System.out.println("\nThe channel is not valid for the unsuspend action");
			}
		}
	}
	
	public static void main(String[] args) {
//		TestSimRetail t = new TestSimRetail();

		String DT = "2022-08-31 00:00:00";
		
//	    public static boolean isValidDate(String inDate) {
	        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	        dateFormat.setLenient(false);
	        try {
	            dateFormat.parse(DT.trim());
	        } catch (ParseException pe) {
	            pe.printStackTrace();
	        }
	        
	        System.out.println("success...");
	}
	
	private void loadproperties() throws EPPIXSeriousException {
		properties = new Properties();

		try {
			if (logger.isDebugEnabled()) {
				logger.debug("loading appProperties");
			}

			FileInputStream in = new FileInputStream(RESOURCES_PATH + fileSep + "eppix.base.properties");
			properties.load(in);

			if (logger.isDebugEnabled()) {
				logger.debug("appProperties loaded : " + properties);
			}
		} catch (java.io.IOException e) {
			logger.error("Exception Message", e);
			throw new EPPIXSeriousException(e);
		}
	}
	
	private void dbConnectionInit() throws EPPIXFatalException {
		int count = 1;
		while (count < 4) {
			try {
				if (logger.isDebugEnabled()) {
					logger.debug("DB Connection start");
				}

				logger.debug(properties.toString());
				System.out.println(properties.toString());


					connection = ConnectionManager
							.newConnectionFromProperties();

					try {
						base = new BaseBLOBinder("", null, connection);
						services = base.getSimAPNServices();
						services.setBase(base);
						services.setConnection(connection);
					} catch (EPPIXFatalException e) {
						e.printStackTrace();
					}

					System.out.println("DB Connection successfull");
					
					if (logger.isDebugEnabled()) {
						logger.debug("DB Connection successfull");
					}


				break;
			} catch (Exception e1) {

				count++; // we can retry connection

				logger.error(e1);

				logger.debug("DB Connection FAILED to DATASOURCE :"
						+ properties.getProperty("DATASOURCE") + " RETRIED: "
						+ count);

				if (count > 3) {
					throw new EPPIXFatalException(
							"Error while trying to connect to database through  DATASOURCE :"
									+ properties.getProperty("DATASOURCE")
									+ ", WL-SERVER:"
									+ properties.getProperty("WL-SERVER")
									+ e1.getMessage(), e1.getCause()
									+ " RETRIED: " + count);
				}
			}
		}
	}
	
	private void testFRAU() {
		StringDMO sDMO = new StringDMO();
		sDMO.setString("Reas:FRAU");
		String simNo = "11111111";
		
		if(sDMO != null) {
			System.out.println("\nsDMO.getSmhComment(): " + sDMO.getString());
			if(sDMO.getString().length() < 9){
				System.out.println("\n1-sDMO.getSmhComment()Substring: " + sDMO.getString().substring(5, sDMO.getString().length()));
				
				if (sDMO.getString().substring(5, sDMO.getString().length()).equals("FRTD")
						|| sDMO.getString().substring(5, sDMO.getString().length()).equals("FRAU")) {
					System.out.println("\nSim(" + simNo + ") cannot be  unsuspended by this channel");
				}
			}else{
				System.out.println("\n2-DMO.getSmhComment()Substring: " + sDMO.getString().substring(5, 9));
				
				if (!sDMO.getString().substring(5, 9).equals("FRTD")
						&& !sDMO.getString().substring(5, 9).equals("FRAU")) {
					System.out.println("\nSim(" + simNo + ") cannot be  unsuspended by this channel");
				}
			}
	}
	
		
		
	}
	
}

