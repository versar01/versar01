package com.eppixcomm.eppix.base.test;

import java.io.FileInputStream;
import java.math.BigDecimal;
import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.eppixcomm.eppix.base.blo.BaseBLOBinder;
import com.eppixcomm.eppix.base.blo.EppixDeviceInsPlatform;
import com.eppixcomm.eppix.base.blo.GetSULMaxUsageAllowed;
import com.eppixcomm.eppix.base.blo.SbdSubDetsDMO;
import com.eppixcomm.eppix.base.blo.SubscriberActiveServicesBLO;
import com.eppixcomm.eppix.base.blo.SubscriberUpgradeMigrade;
import com.eppixcomm.eppix.base.blo.SubscriberUpgradeMigradeBLO;
import com.eppixcomm.eppix.base.blo.TsVsrVstDQO;
import com.eppixcomm.eppix.base.blo.VasVsrVamTsVstVsmDQO;
import com.eppixcomm.eppix.base.error.EPPIXBusinessException;
import com.eppixcomm.eppix.base.error.EPPIXFatalException;
import com.eppixcomm.eppix.base.error.EPPIXSeriousException;
import com.eppixcomm.eppix.base.error.EPPIXUnexpectedException;
import com.eppixcomm.eppix.base.error.Thrower;
import com.eppixcomm.eppix.base.resp.EppixResponse;
import com.eppixcomm.eppix.base.resp.ServicesOffered;
import com.eppixcomm.eppix.common.data.ConnectionManager;
import com.eppixcomm.eppix.common.util.Date;
import com.eppixcomm.eppix.common.util.DateTime;
import com.eppixcomm.eppix.common.util.FilterOp;
import com.eppixcomm.eppix.common.util.QueryFilter;

public class TestSubscriberServices {
	// Globals
	private static Thrower thrower = Thrower.getThrower(TestDeviceExposure.class);
	private static Logger logger = thrower.getLogger();
	private BaseBLOBinder base;
	SubscriberActiveServicesBLO services = null;
	GetSULMaxUsageAllowed serviceMaxSul = null;
	SubscriberUpgradeMigrade service2 = null;
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
	
	public TestSubscriberServices() {
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

//		this.getSubscriberActiveServicesList();
		this.testGetMaxSulAllowed();
//		this.getSubscriberOfferedList();  
//		this.testActivateSubscriberService();
//		this.testDeactivateSubscriberService();
//		this.testSubscriberDeactivateParameter();
//		this.getTsTariffServiceByServiceCode();
//		this.subscriberDeactivateParameter();
//		this.testChargeProrataDeactivation();
//		this.testChargeProrataFixedDisc();
//		this.getManyAudAddress();
	}
	
	private void getTsTariffServiceByServiceCode(){
		
		try {
			services.getTsTariffServiceByServiceCode("MNIS", "ZZ000", "A_0");
		} catch (EPPIXSeriousException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	private void getManyAudAddress(){
		
		Object[] manyAudAddressResults = new Object[10];
		int count = 0;
		try {
			manyAudAddressResults = service2.getManyAudAddress("A0728244", null, "CHPY", "CPOS", "", "", "", "", "", "", "", "");
			
			for(Object obj :manyAudAddressResults) {
				count++;
				System.out.println((obj == null) ? null + ": " + count : obj.toString() + ": " + count);
			}
			
		} catch (EPPIXSeriousException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	private void subscriberDeactivateParameter(){
		
		try {
			service2.subscriberDeactivateParameter(70, 1000087683, "0000000002119", "605644484", "BDRT", "SRVD", 214929573);
		} catch (EPPIXSeriousException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	private void testChargeProrataFixedDisc(){
		
		try {
			service2.chargeProrataFixedDisc(9355409, 344477834, new Date(31, 05, 2019), "D");
		} catch (EPPIXSeriousException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	private void getSubscriberActiveServicesList(){

		List<VasVsrVamTsVstVsmDQO> serviceList = null;
		
		try {
			serviceList = services.getSubscriberActiveServicesList(7733628, null, null);
		} catch (EPPIXSeriousException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(VasVsrVamTsVstVsmDQO dmo : serviceList){
			System.out.println(dmo.toString());
			System.out.println("============================================================");
			
		}
	}
	
	private void getSubscriberOfferedList(){
		
		List<ServicesOffered> resp = null;
		
		Calendar cal = Calendar.getInstance();
		System.out.println("START: " + cal.getTime().toString());

		try {
//			resp = services.getOfferedServices(null, null, "0002809043914", "J70YC", "C_6", null);
//			resp = services.getOfferedServices(new Integer(7733628), null, null, "J70YC", "C_6", null);
//			resp = services.getOfferedServices(null, "839759479", null, "J70YC", "C_6", null);
			resp = services.getOfferedServices(new Integer(7733628), "839759479", "0002809043914", "J70YC", "C_6", null);
		} catch (EPPIXSeriousException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		cal = Calendar.getInstance();
		System.out.println("END: " + cal.getTime().toString());
		
		if(resp != null){
			for(ServicesOffered dqo : resp){
				System.out.println(dqo.toString());
			}
		}
	}
	
	private void testActivateSubscriberService(){
		
		EppixResponse response;
		
		response = services.doActivateSubscriberService(7836450, null, "BDRT", null , null);
		
		System.out.println(response.toString());
		
	}
	
	private void testDeactivateSubscriberService(){
		
		EppixResponse response;
		
		response = services.doDeactivateSubscriberService(9355409, "840830394", "SM1T", null);
		
		System.out.println(response.toString());
		
	}
	
	private void testGetMaxSulAllowed(){
		
		boolean isAllowed = false;
		BigDecimal aspulLimit = null;
		SbdSubDetsDMO sbdDMO = null;
		
		/**
		 * A5085810
		 * 605210778 - 1003411985
		 * 605673633 - 1003400288
		 * 605217089 - 1003400281
		 */
		
		QueryFilter filter = new QueryFilter();
		filter.add(FilterOp.EQUAL, SbdSubDetsDMO.sbdSubscriberIdFilter, new Integer("1003411985"));
		
		
		
		try {
//			isAllowed = serviceMaxSul.getMaxSulAllowed(212700, "SPUL", new BigDecimal("0.00"));
			sbdDMO = base.sbdSubDets().get(filter);
		} catch (EPPIXSeriousException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (EPPIXBusinessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (EPPIXUnexpectedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (EPPIXFatalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			aspulLimit = serviceMaxSul.getSULMaxUsageOnAccountAllowed(sbdDMO, "M1");
		} catch (EPPIXSeriousException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(aspulLimit.toString());
	}
	
	private void testSubscriberDeactivateParameter(){
		
		
		try {
			service2.subscriberDeactivateParameter(new Integer(70), new Integer(1000087658), "0000000001772 ", "605644262", "BDRT", "SRVD", new Integer(214929556));
		} catch (EPPIXSeriousException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void testChargeProrataDeactivation(){
		
		try {
			service2.chargeProrataDeactivation(9355409, "840830394", "SM1T", "AM24M", new Date());
		} catch (EPPIXSeriousException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		TestSubscriberServices test = new TestSubscriberServices();
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
						services = base.subscriberActiveServices();
						services.setBase(base);
						services.setConnection(connection);
						services.initiateServices();
						
						serviceMaxSul = base.getGetSULMaxUsageAllowed();
						serviceMaxSul.setBase(base);
						serviceMaxSul.setConnection(connection);
						serviceMaxSul.initiatedServices();
						
						service2 = base.subscriberUpgradeMigrade();
						service2.setBase(base);
						service2.setConnection(connection);
//						service2.initiateServices();
						
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
}
