package com.eppixcomm.eppix.base.test;

import java.io.FileInputStream;
import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.eppixcomm.eppix.base.blo.BaseBLOBinder;
import com.eppixcomm.eppix.base.blo.GetSULMaxUsageAllowed;
import com.eppixcomm.eppix.base.blo.SubscriberActiveServicesBLO;
import com.eppixcomm.eppix.base.blo.SubscriberUpgradeMigrade;
import com.eppixcomm.eppix.base.error.EPPIXFatalException;
import com.eppixcomm.eppix.base.error.EPPIXSeriousException;
import com.eppixcomm.eppix.base.error.Thrower;
import com.eppixcomm.eppix.common.data.ConnectionManager;
import com.eppixcomm.eppix.common.util.Date;

public class TestParameterisedServiceN2N {
	// Globals
		private static Thrower thrower = Thrower.getThrower(TestDeviceExposure.class);
		private static Logger logger = thrower.getLogger();
		private BaseBLOBinder base;
		SubscriberUpgradeMigrade service = null;
		private static String fileSep = System.getProperty("file.separator");
		private static final String RESOURCES_PATH = System.getProperty("user.dir")
				+ fileSep;
		public SimpleDateFormat dtFormat = new SimpleDateFormat("dd MMM yyyy");
		protected SimpleDateFormat dtFormat1ddMMyyyy = new SimpleDateFormat(
				"ddmmyyyy");
		private Properties properties;
		private Connection connection;
		
		public TestParameterisedServiceN2N() {
			// TODO Auto-generated constructor stub
			PropertyConfigurator.configure(RESOURCES_PATH
					+ "/MTN-AppProperties/eppix-soa-ss/eppix_sub_serv_log4j.properties");
			
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
			
			this.testParamterisedN2N();
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
							service = base.subscriberUpgradeMigrade();
							service.setBase(base);
							service.setConnection(connection);
//							service2.initiateServices();
							
						} catch (EPPIXFatalException e) {
							e.printStackTrace();
						} catch(NullPointerException e){
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
		
		private void testParamterisedN2N() {
			try {
				service.parameterisedServicesN2N(new Integer("2003662783"), "AMAH", "", "0007474848612", new Integer("220088595"), "AT", new Date());
			} catch (EPPIXSeriousException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		public static void main(String[] args) {
			TestParameterisedServiceN2N test = new TestParameterisedServiceN2N();
		}
}
