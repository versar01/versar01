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
import com.eppixcomm.eppix.base.blo.SubscriberUpgradeMigradeBLO;
import com.eppixcomm.eppix.base.error.EPPIXFatalException;
import com.eppixcomm.eppix.base.error.EPPIXSeriousException;
import com.eppixcomm.eppix.base.error.Thrower;
import com.eppixcomm.eppix.common.data.ConnectionManager;
import com.eppixcomm.eppix.common.util.Date;

public class TestDeactivateSimN2N {
	// Globals
		private static Thrower thrower = Thrower.getThrower(TestDeviceExposure.class);
		private static Logger logger = thrower.getLogger();
		private BaseBLOBinder base;
		private SubscriberUpgradeMigrade service2 = null;

		private static String fileSep = System.getProperty("file.separator");
		private static final String RESOURCES_PATH = System.getProperty("user.dir")
				+ fileSep;
		public SimpleDateFormat dtFormat = new SimpleDateFormat("dd MMM yyyy");
		protected SimpleDateFormat dtFormat1ddMMyyyy = new SimpleDateFormat(
				"ddmmyyyy");
		private Properties properties;
		private Connection connection;
		
		
		public TestDeactivateSimN2N() {
			
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
			
			this.testDeactivateSimN2N();
		}
		
		private void testDeactivateSimN2N() {
			service2.networkId = "M1";
			
			try {
				service2.deactivateSimN2N("TEMPORARY", 1003715120, "0006417202044", "783290561", false, new Date(), "SSSS");
			} catch (EPPIXSeriousException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
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
							service2 = base.subscriberUpgradeMigrade();
							service2.setBase(base);
							service2.setConnection(connection);
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
		
		public static void main(String[] args) {
			TestDeactivateSimN2N t = new TestDeactivateSimN2N();
		}
		
}
