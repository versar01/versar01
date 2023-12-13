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
import com.eppixcomm.eppix.base.blo.GetSULMaxUsageAllowed;
import com.eppixcomm.eppix.base.blo.GetSubscriberUpgradeEligibility;
import com.eppixcomm.eppix.base.blo.IDAccSubServList;
import com.eppixcomm.eppix.base.blo.SbdSubDetsDMO;
import com.eppixcomm.eppix.base.error.EPPIXFatalException;
import com.eppixcomm.eppix.base.error.EPPIXSeriousException;
import com.eppixcomm.eppix.base.error.Thrower;
//import com.eppixcomm.eppix.base.resp.IDAccSubServ;
import com.eppixcomm.eppix.base.resp.IDAccSubServListResp;
import com.eppixcomm.eppix.base.utils.AccSubServRecord;
import com.eppixcomm.eppix.base.utils.AccSubServRecordExt;
import com.eppixcomm.eppix.common.data.ConnectionManager;
import com.eppixcomm.eppix.common.util.DateTime;
import com.eppixcomm.eppix.soa.sharedservices.blo.IdAccSubServListDQO;

public class TestIdcAccSubServ {
	// Globals
	private static Thrower thrower = Thrower.getThrower(TestDeviceExposure.class);
	private static Logger logger = thrower.getLogger();
	private BaseBLOBinder base;
//	IDAccSubServ services = null;
	private IDAccSubServList IDservice;
	private	GetSULMaxUsageAllowed serviceMaxSul = null;
//			SubscriberUpgradeMigrade service2 = null;
//			private ConnectionContext context;
//			private Connection connection;
	private static String fileSep = System.getProperty("file.separator");
	private static final String RESOURCES_PATH = System.getProperty("user.dir") + fileSep;
	public SimpleDateFormat dtFormat = new SimpleDateFormat("dd MMM yyyy");
	protected SimpleDateFormat dtFormat1ddMMyyyy = new SimpleDateFormat("ddmmyyyy");
	private Properties properties;
	private Connection connection;

	public TestIdcAccSubServ() {

		// TODO Auto-generated constructor stub
		PropertyConfigurator
				.configure(RESOURCES_PATH + "/MTN-AppProperties/eppix-soa-ss/eppix_sub_serv_log4j.properties");
		
		System.out.println(RESOURCES_PATH + "/MTN-AppProperties/eppix-soa-ss/eppix_sub_serv_log4j.properties");
		

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

//		this.testGetIdAccSubServList();
//		this.testGetListIDAccServ();
		this.testGetMaxAllowed();
//		this.testGetVsrVstTsVasSubList();
	}
	
	private void testGetVsrVstTsVasSubList() {
		
		List<AccSubServRecordExt> subList = null;
		
		subList = IDservice.getVsrVstTsVasSubList("A0122643", null);
		int count = 0;
		if(subList == null) {
			System.out.println("NULL FAILED");
		}else {
			for(AccSubServRecord record : subList) {
				count++;
				System.out.println(record.toString());
			}
		}
		
		System.out.println("Records returned: " + count);
		
	}
	
	private void testGetIdAccSubServList() {
		
		List<IdAccSubServListDQO> list = null;
		try {
			list = IDservice.getIdAccSubServList("A0070586", null, null, null, null);
//			list = IDservice.getIdAccSubServList(null, null, "", null, null);
		} catch (EPPIXSeriousException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(list != null) {
			for(IdAccSubServListDQO dqo:list) {
				System.out.println("=========================================================================");
				System.out.println(dqo.toString());
			}
		}
	}
	
	private void testGetListIDAccServ() {
		
		DateTime startTime = null;
		DateTime endTime = null;
		BigDecimal startTimems = null;
		BigDecimal endTimems = null;
		
		startTime = new DateTime();
		startTimems = new BigDecimal(Calendar.getInstance().getTimeInMillis());

		
		IDAccSubServListResp response = null;

			response = IDservice.getListIDAccServ("A", "A0122643", null, null, null, null, new Integer(0));
//			response = IDservice.getListIDAccServ("", "A0070586", null, null, null, null, null);

			int count = 0;
//		if(response != null) {
//			System.out.println(response.toString());
//			if(response.getDetails() != null) {
//				for(AccSubServRecord rec: response.getDetails()) {
//					count++;
//					System.out.println("=========================================================================");
//					System.out.println(rec.toString());
//				}
//			}
//		}
		
		endTime = new DateTime();
		endTimems = new BigDecimal(Calendar.getInstance().getTimeInMillis());
		
		System.out.println("startTime=" + startTime + " endTime=" + endTime);
		System.out.println("time=" + endTimems.subtract(startTimems));
		System.out.println("count=" + count);
	}

	private void testGetMaxAllowed() {
		
		SbdSubDetsDMO sbdDMO = new SbdSubDetsDMO();
		sbdDMO.set(new Integer(140978), null, "A5085810", null, null, null, null, null, null, null, null, null, null, "CYC95", null, null, null);
		
		try {
			serviceMaxSul.getSULMaxUsageOnAccountAllowed(sbdDMO, "M1");
		} catch (EPPIXSeriousException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(serviceMaxSul.totalMaxAllowed);
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

				connection = ConnectionManager.newConnectionFromProperties();

				try {
					base = new BaseBLOBinder("", null, connection);
					IDservice = base.getIDAccSubServList();
					IDservice.setBase(base);
					IDservice.setConnection(connection);
					
					serviceMaxSul = base.getGetSULMaxUsageAllowed();
					serviceMaxSul.setBase(base);
					serviceMaxSul.setConnection(connection);
					serviceMaxSul.initiatedServices();
				} catch (EPPIXFatalException e) {
					e.printStackTrace();
				} catch (NullPointerException e) {
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

				logger.debug("DB Connection FAILED to DATASOURCE :" + properties.getProperty("DATASOURCE")
						+ " RETRIED: " + count);

				if (count > 3) {
					throw new EPPIXFatalException(
							"Error while trying to connect to database through  DATASOURCE :"
									+ properties.getProperty("DATASOURCE") + ", WL-SERVER:"
									+ properties.getProperty("WL-SERVER") + e1.getMessage(),
							e1.getCause() + " RETRIED: " + count);
				}
			}
		}
	}

	public static void main(String[] args) {
		TestIdcAccSubServ t = new TestIdcAccSubServ();
	}
}
