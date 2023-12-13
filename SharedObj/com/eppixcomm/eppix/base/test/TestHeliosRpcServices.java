package com.eppixcomm.eppix.base.test;

import java.io.FileInputStream;
import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.eppixcomm.eppix.base.blo.BaseBLOBinder;
import com.eppixcomm.eppix.base.blo.GetCustomer;
import com.eppixcomm.eppix.base.blo.HeliosRpcServices;
import com.eppixcomm.eppix.base.blo.SimAPNServices;
import com.eppixcomm.eppix.base.error.EPPIXFatalException;
import com.eppixcomm.eppix.base.error.EPPIXSeriousException;
import com.eppixcomm.eppix.base.error.Thrower;
import com.eppixcomm.eppix.base.resp.CustomerGetRsp;
import com.eppixcomm.eppix.common.data.ConnectionManager;
import com.eppixcomm.eppix.common.util.DateTime;

public class TestHeliosRpcServices {
	// Globals
		private static Thrower thrower = Thrower.getThrower(TestSelfServiceProv.class);
		private static Logger logger = thrower.getLogger();
		private BaseBLOBinder base;
		HeliosRpcServices services = null;
		GetCustomer custService = null;
		private static String fileSep = System.getProperty("file.separator");
		private static final String RESOURCES_PATH = System.getProperty("user.dir")
				+ fileSep;
		public SimpleDateFormat dtFormat = new SimpleDateFormat("dd MMM yyyy");
		protected SimpleDateFormat dtFormat1ddMMyyyy = new SimpleDateFormat(
				"ddmmyyyy");
		private Properties properties;
		private Connection connection;
		
		public TestHeliosRpcServices() {
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
			
//			this.testWriteHelDbLog();
			this.testGetCustomerExpiryDt();
		}
		
		private void testWriteHelDbLog(){
			
			String operation = "getCustomerSubFraudList";
			DateTime startDt = new DateTime();
			DateTime endDt = null;
			String request = "billAccount=|msisdn=|rsaId=5303055808086|passport=|size=100|";
			String response = "eppixStatus=0|errorCode=0|errorType=0|isamError=SUCCESS|";
			
			Thread t = new Thread();
			try {
				t.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			endDt = new DateTime();
			services.writehelDbLog(operation, startDt, endDt, request, response);
			
		}
		
		private void testGetCustomerExpiryDt() {
			
			CustomerGetRsp response = null;
			response = custService.getCustomer("A4476581", "CHPY", "CPOS", null, null, null, null, null, null, null, null);	
			
			logger.debug(response.toString());
		}
		

		public static void main(String[] args) {
			TestHeliosRpcServices t = new TestHeliosRpcServices();
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
							services = base.getHeliosRpcServices();
							services.setBase(base);
							services.setConnection(connection);
						} catch (EPPIXFatalException e) {
							e.printStackTrace();
						}
						
						
						try {
							custService = base.getGetCustomer();
							custService.setBase(base);
							custService.setConnection(connection);
						} catch (Exception e) {
							// TODO Auto-generated catch block
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
