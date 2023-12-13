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
import com.eppixcomm.eppix.base.blo.SubscriberUpgradeMigrade;
import com.eppixcomm.eppix.base.blo.VcfVrbleChrgFeeDMO;
import com.eppixcomm.eppix.base.error.EPPIXFatalException;
import com.eppixcomm.eppix.base.error.EPPIXSeriousException;
import com.eppixcomm.eppix.base.error.Thrower;
import com.eppixcomm.eppix.common.data.ConnectionManager;
import com.eppixcomm.eppix.common.util.Date;
import com.eppixcomm.eppix.common.util.DateTime;

public class TestDeviceExposure {
	// Globals
	private static Thrower thrower = Thrower.getThrower(TestDeviceExposure.class);
	private static Logger logger = thrower.getLogger();
	private BaseBLOBinder base;
	EppixDeviceInsPlatform services = null;
	SubscriberUpgradeMigrade subServices = null;
//	private ConnectionContext context;
//	private Connection connection;
	private static String fileSep = System.getProperty("file.separator");
	private static final String RESOURCES_PATH = System.getProperty("user.dir")
			+ fileSep;
	public SimpleDateFormat dtFormat = new SimpleDateFormat("dd MMM yyyy");
	protected SimpleDateFormat dtFormat1ddMMyyyy = new SimpleDateFormat(
			"ddmmyyyy");
	private Properties properties;
	private Connection connection;
	
	public TestDeviceExposure() {
		// TODO Auto-generated constructor stub
		PropertyConfigurator.configure(RESOURCES_PATH
				+ "/MTN-AppProperties/eppix-soa-ss/eppix_insu_platform_log4j.properties");
		
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
		
		
//		this.testCustExposure();
		this.testDoINSUProductVariableCharge();
//		this.testCancelDeviceInsurance();
//		this.testDeleteSubInsBilling();
//		this.testCuhHistory();
//		this.testGetVcfRecrodForCancel();
//		this.testAddingProrataToInsActivtion();
//		this.testCreateProrataCharges();
	}
	
	private void testCustExposure(){
		
		
		try {
			services.checkAccountExposure(9880284, "844082004", new BigDecimal("400.00"));
		} catch (EPPIXSeriousException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	private void testCreateProrataCharges(){
		
		this.services.userName = "vermeu_s";
		this.services.hostName = "EppixTest";
		
		this.services.setSubService(this.subServices);
		
		
		
		try {
			this.services.generateVariableProrataFee(new Integer(0), new Date(), "A");
		} catch (EPPIXSeriousException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void testDoINSUProductVariableCharge(){
		
		Calendar cal = Calendar.getInstance();
		Integer serial = null;
		
		try {
			serial = services.doINSUProductVariableCharge("vermeu_s", "ENG", "Eppix", "123456", 1000087651, null, 
					"869906031776511", "0987654321", "Nokia", "2000", new BigDecimal("5000.00"), new BigDecimal("400.00"), new DateTime());
		} catch (EPPIXSeriousException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
		private void testCancelDeviceInsurance(){
		
		Calendar cal = Calendar.getInstance();
		boolean success = false;
		
		try {
			success = services.cancelInsurance("vermeu_s", "ENG", "Eppix", "123456", 9880284, "844082004", "0987654321", "0987654321", "Nokia", "2000", new BigDecimal("5000.00"), new BigDecimal("5000.00"));
		} catch (EPPIXSeriousException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(success);
	}
		
	private void testDeleteSubInsBilling(){
			
			try {
				services.deleteSubInsBilling("CYC15", new Date(26,5,2019), 9880284, "INSR", new BigDecimal("400.00"), false, null);
			} catch (EPPIXSeriousException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	private void testCuhHistory(){
		
		try {
			services.createCuhCustHistory("A3832377", "CRDLMTMD", "100", "200", "vermeu_s", "Eppix");
		} catch (EPPIXSeriousException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void testGetVcfRecrodForCancel(){
		
		VcfVrbleChrgFeeDMO vcfDMO = null;
		try {
			vcfDMO = services.eppixDeviceInsPlatformDAC.getVcfSubscriberInsDeviceOld(9682356, "341706");
		} catch (EPPIXSeriousException e) {
			// TODO Auto-generated catch block

		}
		
		System.out.println("VCF FOUND: " + vcfDMO);
		
	}
	
	private void testAddingProrataToInsActivtion(){
		
		
		try {
			subServices.chargeProrataDeactivation(9880284, "844082004", "INSR", "AMT24M", new Date());
		} catch (EPPIXSeriousException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		TestDeviceExposure test = new TestDeviceExposure();
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
						services = base.getEppixDeviceInsPlatform();
						services.setBase(base);
						services.setConnection(connection);
						
						subServices = base.subscriberUpgradeMigrade();
						subServices.setBase(base);
						subServices.setConnection(connection);
					
						
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
