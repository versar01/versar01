package com.eppixcomm.eppix.base.test;

import java.io.FileInputStream;
import java.math.BigDecimal;
import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.eppixcomm.eppix.base.blo.BaseBLOBinder;
import com.eppixcomm.eppix.base.blo.EppixDeviceInsPlatform;
import com.eppixcomm.eppix.base.blo.SelfServBundleProv;
import com.eppixcomm.eppix.base.error.EPPIXFatalException;
import com.eppixcomm.eppix.base.error.EPPIXSeriousException;
import com.eppixcomm.eppix.base.error.Thrower;
import com.eppixcomm.eppix.base.resp.SelfServExistsResponse;
import com.eppixcomm.eppix.base.resp.SelfServProvResponse;
import com.eppixcomm.eppix.common.data.ConnectionManager;
import com.eppixcomm.eppix.common.util.Date;
import com.eppixcomm.eppix.common.util.DateTime;

public class TestSelfServiceProv {
	// Globals
	private static Thrower thrower = Thrower.getThrower(TestSelfServiceProv.class);
	private static Logger logger = thrower.getLogger();
	private BaseBLOBinder base;
	SelfServBundleProv services = null;
	private static String fileSep = System.getProperty("file.separator");
	private static final String RESOURCES_PATH = System.getProperty("user.dir")
			+ fileSep;
	public SimpleDateFormat dtFormat = new SimpleDateFormat("dd MMM yyyy");
	protected SimpleDateFormat dtFormat1ddMMyyyy = new SimpleDateFormat(
			"ddmmyyyy");
	private Properties properties;
	private Connection connection;
	
	public TestSelfServiceProv() {
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
		
//		this.testDoSelfServBundleProvAdd();
//		this.testDoSelfServBundleProvRemove();
		this.testProductExists();
	}
	
	
	private void testDoSelfServBundleProvAdd(){
		
		SelfServProvResponse response = null;
		response = services.doSelfServBundleProv("vermeu_s", "eppix", "ENG", "739199886", new Date(), "123456789-3", "", "MTN 300MB", "0", new Integer("10000"), new BigDecimal("74.56"), new BigDecimal("10.00"), "ADD");
		System.out.println(response);
	}
	
	private void testDoSelfServBundleProvRemove(){
		
		SelfServProvResponse response = null;
		response = services.doSelfServBundleProv("vermeu_s", "eppix", "ENG", "739199886", new Date(), "123456789-0-3", "", "Test self service", "1", new Integer("0.00"), new BigDecimal("100.00"), new BigDecimal("0.00"), "REMOVE");
		System.out.println(response);
	}
	
	private void testProductExists(){
		
		SelfServExistsResponse response = null;
		response = services.productExists("vermeu_s", "eppix", "ENG", "604847163", "test", "123456789-0-3");
		System.out.println(response);
	}
	
	public static void main(String[] args) {
		TestSelfServiceProv t = new TestSelfServiceProv();
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
						services = base.getSelfServBundleProv();
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
	
}
