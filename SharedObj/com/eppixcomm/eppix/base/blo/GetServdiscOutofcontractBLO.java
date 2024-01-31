package com.eppixcomm.eppix.base.blo;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import org.apache.log4j.Logger;

import com.eppixcomm.eppix.base.blo.BaseBLO;
import com.eppixcomm.eppix.base.blo.BaseMessages;
import com.eppixcomm.eppix.base.error.EPPIXBusinessException;
import com.eppixcomm.eppix.base.error.EPPIXFatalException;
import com.eppixcomm.eppix.base.error.EPPIXSeriousException;
import com.eppixcomm.eppix.base.error.EPPIXUnexpectedException;
import com.eppixcomm.eppix.base.error.Thrower;
import com.eppixcomm.eppix.common.data.DAC;
import com.eppixcomm.eppix.common.data.DTOActionTypes;
import com.eppixcomm.eppix.common.util.Date;
import com.eppixcomm.eppix.common.util.FilterOp;
import com.eppixcomm.eppix.common.util.QueryFilter;
import com.eppixcomm.eppix.soa.sharedservices.blo.EhEppixHierarchyDMO;
import com.eppixcomm.eppix.soa.sharedservices.blo.HhHierarchyHeadDMO;
import com.eppixcomm.eppix.soa.sharedservices.blo.ScSerialCustomerDMO;


public class GetServdiscOutofcontractBLO extends BaseBLO implements DTOActionTypes, BaseMessages {
//Globals
	private static Thrower thrower = Thrower.getThrower(GetServdiscOutofcontractBLO.class);
	private Logger logger = thrower.getLogger();
	public GetServdiscOutofcontractDAC getServdiscOutofcontractDAC;
	private static String fileSep = System.getProperty("file.separator");
	private static final String RESOURCES_PATH = System.getProperty("user.dir") + fileSep + "MTN-AppProperties"
			+ fileSep + "eppix-soa-ss" + fileSep;
	private BaseBLOBinder base;
	private Connection connection;
	private Properties properties;

	@Override
	protected Class getDACClass() {
		return GetServdiscOutofcontractDAC.class;
	}

	@Override
	protected void setDAC(DAC dac) {
		this.getServdiscOutofcontractDAC = (GetServdiscOutofcontractDAC) dac;
	}

	public BaseBLOBinder getBase() {
		return base;
	}

	public void setBase(BaseBLOBinder base) {
		this.base = base;
	}

	public Connection getConnection() {
		return connection;
	}

	public void setConnection(Connection connection) {
		this.connection = connection;
	}
	
	/**
	 * SV: Nerw function for project:  Contract Expiry notifications - 122222
	 * 
	 * New Function Should be Developed according to EPPIX Standards. 
	 * The Function will be used to Calculate a Subscribers Discounts 
	 * which will Continue when they are Out-Of-Contract Presuming an Upgrade is not Performed, 
	 * this is based on SubscriberID, Package Code, Tariff Code, Service Code and Termination Date
	 *  	
	 * @param subscriberId
	 * @param legalEntityId
	 * @param packageCode
	 * @param tariffCode
	 * @param serviceCode
	 * @param termDate
	 */
	public BigDecimal getServdiscOutofContract(Integer subscriberId, Integer legalEntityId, String packageCode, String tariffCode, String serviceCode, Date termDate) {
		

		TsTariffServiceDMO tsDMO = null;
		SbdSubDetsDMO sbdDMO = null;
		SksKeySettingDMO sksDMO = null;
		EhEppixHierarchyDMO ehDMO = null;
		ScSerialCustomerDMO scDMO = null;
		HhHierarchyHeadDMO hhDMO = null;
		String qualKey = "";
		BigDecimal percDisc1 = new BigDecimal("0.00");
		BigDecimal percDisc2 = new BigDecimal("0.00");
		BigDecimal percDisc3 = new BigDecimal("0.00");
		BigDecimal fixedDisc1 = new BigDecimal("0.00");
		BigDecimal fixedDisc2 = new BigDecimal("0.00");
		BigDecimal fixedDisc3 = new BigDecimal("0.00");
		BigDecimal serviceDisc = new BigDecimal("0.00");
		Date from = new Date();
		Date to = new Date();
		String serialChar = "";
		String sksValue = "";

//		#Validate Input Parameters
		try {
			thrower.ifParameterMissing("subscriberId", subscriberId);
			thrower.ifParameterMissing("packageCode", packageCode);
			thrower.ifParameterMissing("tariffCode", tariffCode);
			thrower.ifParameterMissing("serviceCode", serviceCode);
			
		} catch (EPPIXSeriousException e) {
			logger.error(e.getMessage());
			
		}

//		#Check if legal entity should be applied on upfront discounts
		sksDMO = this.getSks("LEDISCUSE");

		if (sksDMO == null) {
			sksValue = "Y";
		} else {
			sksValue = sksDMO.getSksValue();
		}

		try {
			this.createTempTable();
		} catch (EPPIXSeriousException e1) {
			logger.error("Failed to create the temp table: " + e1.getMessage());
			this.dropTempTable();
			return null;
		}
	
		if("Y".equals(sksValue)) {
			if(legalEntityId != null && legalEntityId.intValue() > 0) {
				try {
					// CALL generate_qual_key (3, p_new_package, l_from, l_to)
					this.generateQualKey(new Integer("2"), legalEntityId.toString());
				} catch (NumberFormatException | EPPIXSeriousException e1) {
					logger.error("Failed to generate quality keys: " + e1.getMessage());
					this.dropTempTable();
					return null;
				}
			}
		}


//		#Qualification Key 3		
		if("Y".equals(sksValue)) {
			if(legalEntityId != null && legalEntityId.intValue() > 0) {
				try {
					this.generateQualKey(new Integer("3"), packageCode);
				} catch (NumberFormatException | EPPIXSeriousException e1) {
					logger.error("Failed to generate quality keys: " + e1.getMessage());
					this.dropTempTable();
					return null;
				}
			}
		}

//		#Qualification Key 6	
		if("Y".equals(sksValue)) {
			if(legalEntityId != null && legalEntityId.intValue() > 0) {
				try {
					this.generateQualKey(new Integer("6"), serviceCode);
				} catch (NumberFormatException | EPPIXSeriousException e1) {
					logger.error("Failed to generate quality keys: " + e1.getMessage());
					this.dropTempTable();
					return null;
				}
			}
		}
		
//		#Qualification Key 7		
		if("Y".equals(sksValue)) {
			if(legalEntityId != null && legalEntityId.intValue() > 0) {
				try {
					this.generateQualKey(new Integer("7"), tariffCode);
				} catch (NumberFormatException | EPPIXSeriousException e1) {
					logger.error("Failed to generate quality keys: " + e1.getMessage());
					this.dropTempTable();
					return null;
				}
			}
		}

//		#Main Processing	
		try {
			tsDMO = this.getServdiscOutofcontractDAC.getTsTariffService(packageCode, serviceCode, tariffCode);
		} catch (EPPIXSeriousException e) {
			logger.error("\n\"ERROR with FETCH c_check_combo, Error Text : " + e.getMessage());
			return null;
		}
		
		try {
			percDisc1 = this.getServdiscOutofcontractDAC.percDiscount1(termDate, packageCode, tariffCode, serviceCode);
		} catch (EPPIXSeriousException e) {
			logger.error("\n\"ERROR with getting percentage discount 1: " + e.getMessage());
		}

		try {
			percDisc2 = this.getServdiscOutofcontractDAC.percDiscount2(termDate, packageCode, tariffCode, serviceCode);
		} catch (EPPIXSeriousException e) {
			logger.error("\n\"ERROR with getting percentage discount 2: " + e.getMessage());
		}
		
		try {
			percDisc3 = this.getServdiscOutofcontractDAC.percDiscount3(termDate, packageCode, tariffCode, serviceCode);
		} catch (EPPIXSeriousException e) {
			logger.error("\n\"ERROR with getting percentage discount 3: " + e.getMessage());
		}
	
		try {
			fixedDisc1 = this.getServdiscOutofcontractDAC.fixedDiscount1(termDate, packageCode, tariffCode, serviceCode);
		} catch (EPPIXSeriousException e) {
			logger.error("\n\"ERROR with getting fixed discount 1: " + e.getMessage());
		}

		try {
			fixedDisc2 = this.getServdiscOutofcontractDAC.fixedDiscount2(termDate, packageCode, tariffCode, serviceCode);
		} catch (EPPIXSeriousException e) {
			logger.error("\n\"ERROR with getting fixed discount 2: " + e.getMessage());
		}

		try {
			fixedDisc3 = this.getServdiscOutofcontractDAC.fixedDiscount3(termDate, packageCode, tariffCode, serviceCode);
		} catch (EPPIXSeriousException e) {
			logger.error("\n\"ERROR with getting fixed discount 3: " + e.getMessage());
		}

		logger.debug("\npercDisc1: " + percDisc1 + "\npercDisc2: " + percDisc2 + "\npercDisc3: " + percDisc3);
		logger.debug("\nfixedDisc1: " + fixedDisc1 + "\nfixedDisc2: " + fixedDisc2 + "\nfixedDisc3: " + fixedDisc3);
		serviceDisc = fixedDisc1.add(percDisc1).add(percDisc2).add(percDisc3);
		serviceDisc = fixedDisc1.add(fixedDisc1).add(fixedDisc2).add(fixedDisc3);
		logger.debug("\nserviceDisc: " + serviceDisc);
		
		this.dropTempTable();
			
		return serviceDisc;
	}
	
	private void createTempTable() throws EPPIXSeriousException {

		Statement st = null;

		try {
			st = this.connection.createStatement();

			ResultSet rs = null;
			String sql = "CREATE TEMP TABLE IF NOT EXISTS temp_disc_qualification ( qual_val INTEGER, qual_key VARCHAR(255), qual_from INTEGER, qual_to INTEGER ) ";

			st.execute(sql);

		} catch (SQLException e) {
			logger.error("Failed to to create temp table: " + e.getMessage());
			throw new EPPIXSeriousException("2",
					"Failed to create temp table: " + e.getMessage());
		}
	}
	
	private void dropTempTable() {

		Statement st = null;

		try {
			st = this.connection.createStatement();

			ResultSet rs = null;
			String sql = "DROP TABLE IF EXISTS temp_disc_qualification";

			st.execute(sql);

		} catch (SQLException e) {
			logger.error("Failed to to drop temp table: " + e.getMessage());
//			throw new EPPIXSeriousException("2", "Failed to drop temp table: "
//					+ e.getMessage());
		}
	}
	
	private SksKeySettingDMO getSks(String keyCode) {

		QueryFilter sksFilter = new QueryFilter();
		sksFilter.add(FilterOp.EQUAL, SksKeySettingDMO.sksKeyCodeFilter,
				keyCode);
		SksKeySettingDMO sksDmo = null;

		try {
			sksDmo = base.sksKeySetting().get(sksFilter);
		} catch (EPPIXBusinessException | EPPIXUnexpectedException | EPPIXFatalException e) {
			logger.error("Exception getting SKS for KEY CODE" + keyCode + " "
			+ e);
		}
		
		return sksDmo;
	}
	

	public void generateQualKey(Integer qualVal, String qualKey)
			throws EPPIXSeriousException {

		Integer qValue = null;

		qValue = new Integer((int) Math.pow(new Double("2.00"), new Double(
				qualVal)));

		logger.debug("\nQUAL VAL: " + qValue);

		Statement st = null;
		Statement insertST = null;
		ResultSet rs = null;
		String sql = "INSERT INTO temp_qualification(qual_val, qual_key, qual_from, qual_to) values('"
				+ qValue + "', '" + qualKey + "', TODAY, TODAY)";
		Integer returnQualVal = null;
		String returnQualKey = null;

		logger.debug("\n" + sql);

		try {
			if (st == null) {
				st = this.connection.createStatement();
			}

			st.execute(sql);

		} catch (SQLException e) {
			logger.error("Failed to insert quality keys into temp table: "
					+ e.getMessage());
			throw new EPPIXSeriousException("2",
					"Failed to insert quality keys into temp table: "
							+ e.getMessage());
		}

		sql = "Select * from temp_qualification " + "where qual_val < "
				+ qValue;

		try {

			if (insertST == null) {
				insertST = this.connection.createStatement();
			}

			rs = insertST.executeQuery(sql);

			while (rs.next()) {
				returnQualVal = rs.getInt(1);
				returnQualKey = rs.getString(2);

				if (returnQualVal != null) {
					returnQualVal = returnQualVal.intValue()
							+ new Integer((int) Math.pow(new Double("2.00"),
									new Double(qualVal)));
				}

				returnQualKey = returnQualKey.trim() + qualKey;

				logger.debug("\nreturnQualVal: " + returnQualVal
						+ "\nreturnQualKey: " + returnQualKey);

				sql = "INSERT INTO temp_qualification(qual_val, qual_key, qual_from, qual_to) values('"
						+ returnQualVal
						+ "', '"
						+ returnQualKey
						+ "', TODAY, TODAY)";

				st.execute(sql);

			}

		} catch (SQLException e) {
			logger.error("Failed to insert quality keys into temp table: "
					+ e.getMessage());
			throw new EPPIXSeriousException("2",
					"Failed to insert quality keys into temp table: "
							+ e.getMessage());
		}

		try {
			st.close();
			insertST.close();
			rs.close();
		} catch (SQLException e) {
			logger.error(e.getMessage());
		}

		st = null;
		insertST = null;
		rs = null;

	}


}