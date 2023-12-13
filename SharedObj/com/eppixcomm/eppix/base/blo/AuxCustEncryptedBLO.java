package com.eppixcomm.eppix.base.blo;

import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.log4j.Logger;

import com.eppixcomm.eppix.base.error.EPPIXBusinessException;
import com.eppixcomm.eppix.base.error.EPPIXFatalException;
import com.eppixcomm.eppix.base.error.EPPIXSeriousException;
import com.eppixcomm.eppix.base.error.EPPIXUnexpectedException;
import com.eppixcomm.eppix.base.error.Thrower;
import com.eppixcomm.eppix.base.pay.ws.WsPayGateController;
import com.eppixcomm.eppix.common.data.DAC;
import com.eppixcomm.eppix.common.data.DAOIterator;
import com.eppixcomm.eppix.common.data.DTOActionTypes;
import com.eppixcomm.eppix.common.data.StringDMO;
import com.eppixcomm.eppix.common.util.Date;
import com.eppixcomm.eppix.common.util.FilterOp;
import com.eppixcomm.eppix.common.util.QueryFilter;
import com.eppixcomm.eppix.soa.sharedservices.blo.AuxEncryptedDMO;
import com.eppixcomm.eppix.soa.sharedservices.blo.EudEpxUriDetDMO;
import com.eppixcomm.eppix.soa.sharedservices.blo.EuhEpxUriHdrDMO;

public class AuxCustEncryptedBLO extends BaseBLO implements DTOActionTypes,
		BaseMessages {
	// Globals
	private static Thrower thrower = Thrower
			.getThrower(AuxCustEncryptedBLO.class);
	private Logger logger = thrower.getLogger();
	public AuxCustEncryptedDAC auxCustEncryptedDAC;
	private BaseBLOBinder base;
	private Connection connection;
	private AuxEncryptedDMO auxEncryptedDMO;
	private String hostName;
	private String payID;
	private String payPwd;
//	private String errorCode;
//	private String errorMessage;
	private String payHost;
	private String payOperation;
	private String payUrl;
	private WsPayGateController client;
	private ResultSet rs = null;
	private Statement st = null;
	private SimpleDateFormat dtFormattermmccjj = new SimpleDateFormat("MMyyyy");
	private String keyStore;
	private String keyPwd;
	private String reportPath;
	

	public String getReportPath() {
		return reportPath;
	}

	public void setReportPath(String reportPath) {
		this.reportPath = reportPath;
	}

	@Override
	protected Class getDACClass() {
		// TODO Auto-generated method stub
		return AuxCustEncryptedDAC.class;
	}

	@Override
	protected void setDAC(DAC dac) {
		this.auxCustEncryptedDAC = (AuxCustEncryptedDAC) dac;
	}

	public AuxCustomersDMO getAuxCustomer(String accountNo)
			throws EPPIXFatalException {

		QueryFilter filter = new QueryFilter();
		filter.add(FilterOp.EQUAL, AuxCustomersDMO.billAcNoFilter, accountNo);

		AuxCustomersDMO auxDMO = null;

		try {
			auxDMO = base.auxCustomers().get(filter);
		} catch (EPPIXBusinessException e) {
			throw new EPPIXFatalException(
					"Unable to SELECT aux_customers details for bill account "
							+ accountNo + " EXCEPTION: " + e);
		} catch (EPPIXUnexpectedException e) {
			throw new EPPIXFatalException(
					"Unable to SELECT aux_customers details for bill account "
							+ accountNo + " EXCEPTION: " + e);
		}

		return auxDMO;

	}

	public boolean encryptFound(AuxCustomersDMO auxDMO) {
		
		logger.debug("\nACCOUNT NO: " + auxDMO.getBillAcNo()
				+ "\nCREDIT CC: " + auxDMO.getCreditCardNo()
				+ "\nEXPIRY DATE: " + auxDMO.getExpiryDate());

		String regex = "[a-zA-Z[x]]";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = null;
		AuxEncryptedDMO encDMO = null;
		boolean encryptFound = false;

		if (auxDMO.getCreditCardNo() != null) {
			matcher = pattern.matcher(auxDMO.getCreditCardNo());
			if (matcher.find()) {
				encryptFound = true;
			}

		} else if (auxDMO.getAuxCardCvvNo() != null) {
			matcher = pattern.matcher(auxDMO.getAuxCardCvvNo());

			if (matcher.find()) {
				encryptFound = true;
			}
		}

		if (encryptFound) {
			try {
				encDMO = this.getAuxCustEncrypted(auxDMO.getBillAcNo());

				if (encDMO == null) {
					encryptFound = false;
				} else {
					this.auxEncryptedDMO = encDMO;
					encryptFound = true;
				}

			} catch (EPPIXFatalException e) {
				encryptFound = false;
			}
		}
		logger.debug("\nENCRYPT FOUND: " + encryptFound);

		return encryptFound;

	}

	/**
	 * #------------------------------------------------------------------------
	 * ------# # Purpose: Get and decrypt a record from the 'aux_encrypted'
	 * table # # Accepts: p_bill_ac_no - Customer account number # # Returns:
	 * l_cc_no - Customer Credit Card Number # # l_cc_cvv_no - Customer Credit
	 * Card CVV Number # # l_bank_ac_no - Customer Bank Account Number # #
	 * l_id_no - Customer ID Number # # l_passport_no - Customer Passport Number
	 * # #----------------------------------------------------------------------
	 * --------# FUNCTION aux_cust_encrypted_get (p_bill_ac_no)
	 * 
	 * @param billAcNo
	 * @return
	 * @throws EPPIXFatalException
	 */
	public AuxEncryptedDMO getAuxCustEncrypted(String billAcNo)
			throws EPPIXFatalException {

		StringDMO sysEnc_Key;
		String accEncKey;

		try {
			sysEnc_Key = this.auxCustEncryptedDAC.getAuxEncryptKey(billAcNo);

			if (sysEnc_Key == null) {
				throw new EPPIXFatalException(
						"Encryption key not found for account " + billAcNo);
			} else {
				accEncKey = billAcNo.substring(0, 4) + sysEnc_Key.getString()
						+ billAcNo.substring(4, 8);
			}
		} catch (EPPIXSeriousException e) {
			throw new EPPIXFatalException(
					"Encryption key not found for account " + billAcNo);
		}

		logger.debug("ENCRYPTION KEY: " + accEncKey);

		AuxEncryptedDMO auxEncryptedDMO = null;
		try {
			auxEncryptedDMO = this.auxCustEncryptedDAC.getAuxCustEncrypted(
					accEncKey, accEncKey, accEncKey, accEncKey, accEncKey,
					billAcNo);
		} catch (EPPIXSeriousException e) {
			logger.error("EXCEPTION retrieving record in table aux_encrypted for account number "
					+ billAcNo + " EXCEPTION: " + e);
			throw new EPPIXFatalException(
					"EXCEPTION retrieving record in table aux_encrypted for account number "
							+ billAcNo + " EXCEPTION: " + e);
		}

		if (auxEncryptedDMO == null) {

			logger.error("Failed retrieving record in table aux_encrypted for account number "
					+ billAcNo);

			throw new EPPIXFatalException(
					"Record not found in table aux_encrypted for account number "
							+ billAcNo);
		}

		return auxEncryptedDMO;
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

	public AuxEncryptedDMO getAuxEncryptedDMO() {
		return auxEncryptedDMO;
	}

	public void setAuxEncryptedDMO(AuxEncryptedDMO auxEncryptedDMO) {
		this.auxEncryptedDMO = auxEncryptedDMO;
	}

	public List<AuxEncDetailsDMO> getAllAccounts()throws EPPIXSeriousException{
		
		QueryFilter filter = new QueryFilter();
		filter.add(FilterOp.EQUAL, AuxCustomersDMO.bankPayTypeFilter, "CCDO");
		filter.add(FilterOp.GREATERTHANOREQUAL, AuxCustomersDMO.expiryDateFilter, new Date());
		DAOIterator it = null;
		List<AuxEncDetailsDMO> listAll = null;
		
		try {
			it = base.auxCustomers().iterate(filter);
		} catch (EPPIXBusinessException e) {
			logger.error(e.getMessage());
			throw new EPPIXSeriousException("", "Failed to get all accounts with bank pay method 'CCDO'");
		} catch (EPPIXUnexpectedException e) {
			logger.error(e.getMessage());
			throw new EPPIXSeriousException("", "Failed to get all accounts with bank pay method 'CCDO'");
		} catch (EPPIXFatalException e) {
			logger.error(e.getMessage());
			throw new EPPIXSeriousException("", "Failed to get all accounts with bank pay method 'CCDO'");
		}
		
		int counter = 1;	
		String errorMess = null;
		
		while(it.hasNext()){
			AuxCustomersDMO dmo = (AuxCustomersDMO)it.next();
			AuxEncDetailsDMO encDmo = new AuxEncDetailsDMO();
			errorMess = null;
			
			encDmo.setAccountNo(dmo.getBillAcNo());
			encDmo.setAccountStatus(dmo.getAccStatus());
			
			AuxEncryptedDMO auxEncDmo = null;
				
			if(listAll == null){
				listAll = new ArrayList<AuxEncDetailsDMO>();
			}
			
			try {
				auxEncDmo = this.getAuxCustEncrypted(dmo.getBillAcNo());
				
				if(auxEncDmo == null){
					/**
					 * TODO handle the error here, need to write it to the reports as well
					 */
					if(dmo.getCreditCardNo() != null && dmo.getCreditCardNo().length() > 0){
						auxEncDmo = new AuxEncryptedDMO();
						auxEncDmo.setCcNo(dmo.getCreditCardNo());
					}else{
						errorMess = "Encryption key not found for account " + dmo.getBillAcNo();
					logger.debug("\n" + errorMess);
					}

					
				}

			} catch (EPPIXFatalException e) {
				/**
				 * TODO handle the error here, need to write it to the reports as well
				 * Encryption key not found for an account typical error
				 */
				logger.debug("\n" + e.getMessage());
				
				if(dmo.getCreditCardNo() != null && dmo.getCreditCardNo().length() > 0){
					auxEncDmo = new AuxEncryptedDMO();
					auxEncDmo.setCcNo(dmo.getCreditCardNo());
				}else{
					errorMess = e.getMessage();
				}
			}
			
			if(errorMess != null){
				encDmo.setStatusDetail(errorMess);
				encDmo.setCreditExp(dtFormattermmccjj.format((dmo.getExpiryDate() == null) ? "" : dmo.getExpiryDate()));
			}else{
				encDmo.setCreditCrd(auxEncDmo.getCcNo());			
				encDmo.setCreditExp(dtFormattermmccjj.format((dmo.getExpiryDate() == null) ? "" : dmo.getExpiryDate()));
			}
			
			// TODO add the call to the paygate service here, then we have all the info to return and update the tables and reports
			
			listAll.add(encDmo);
			counter++;
			
		}
		
		logger.info("ALL ACCOUNTS RETURNED: " + counter);
		return listAll;
		
	}
	
	public AuxEncDetailsDMO getCustToken(AuxEncDetailsDMO detailDmo)throws EPPIXSeriousException{
		
		client = new WsPayGateController();
		URL url = null;
		try {
			this.getPaygateUrl();
		} catch (EPPIXSeriousException e) {
			/**
			 * This is serious issue. Will stop further processing
			 */
			logger.error("Failed to get the PAYGATE URL: " + e.getMessage());
			new EPPIXSeriousException("2", "Failed to get the PAYGATE URL: " + e.getMessage());
		}
		
		client.setPayID(this.getPayID());
		client.setPayPWD(this.getPayID());
		client.setKeyStore(this.getKeyStore());
		client.setKeyPwd(this.getKeyPwd());
		try {
			logger.info("\nPAYGATE URL: " + this.getPayUrl());
			url = new URL(this.getPayUrl());
		} catch (MalformedURLException e) {
			logger.error("INVALID PAYGATE URL: " + e.getMessage());
			new EPPIXSeriousException("2", "INVALID PAYGATE URL: " + e.getMessage());
		}
		
		StringBuffer xmlDataToSend = client.createRequest(detailDmo.getCreditCrd(), detailDmo.getCreditExp());
		
		client.sendSecureMessage(this.getPayUrl(), xmlDataToSend.toString(), null, null, null);
		
		detailDmo.setStatusName(client.getStatusName());
		detailDmo.setStatusDetail(client.getStatusDetail());
		detailDmo.setVauldId(client.getVaultId());
		
		if(client.getError() != null && client.getError().length() > 0){
			detailDmo.setStatusName("Failed");
			detailDmo.setStatusDetail(client.getError());
		}
		
		return detailDmo;
		
	}
	
	private void getPaygateUrl() throws EPPIXSeriousException {

		EuhEpxUriHdrDMO euhDMO = this.getEuhUneUrl();
		EudEpxUriDetDMO eudDMO = this.getEudUneUrl();

		if (euhDMO == null) {
			logger.debug("PAYGATE URL is not in the table EUH. This requires urgent attention");
			throw new EPPIXSeriousException("2",
					"PAYGATE URL is not in the table EUH. This requires urgent attention");
		} else {
			payHost = euhDMO.getEuhProtocol().trim() + "://"
					+ euhDMO.getEuhAuthHost().trim() + ":"
					+ euhDMO.getEuhAuthPort().trim();
			payID = euhDMO.getEuhAuthName().trim();
			payPwd = euhDMO.getEuhAuthPass().trim();
		}

		if (eudDMO == null) {
			logger.debug("PAYGATE URL details is not in the table EUD. This requires urgent attention");
			throw new EPPIXSeriousException("2",
					"PAYGATE URL details is not in the table EUD. This requires urgent attention");
		} else {
			payOperation = eudDMO.getEudAddress().trim();
		}

		payUrl = payHost.trim() + payOperation.trim();
		logger.debug("\nPAYGATE URL: " + payUrl);
	}

	public EuhEpxUriHdrDMO getEuhUneUrl() {

		EuhEpxUriHdrDMO euhDMO = null;

		String sql = "Select * from euh_epx_uri_hdr where euh_key = 'PAYGTURL'";

		logger.debug("\n" + sql);

		try {
			st = this.getConnection().createStatement();
			rs = st.executeQuery(sql);

			while (rs.next()) {
				euhDMO = new EuhEpxUriHdrDMO();
				euhDMO.setEuhId(rs.getInt(1));
				euhDMO.setEuhKey(rs.getString(2));
				euhDMO.setEuhProtocol(rs.getString(3));
				euhDMO.setEuhAuthName(rs.getString(4));
				euhDMO.setEuhAuthPass(rs.getString(5));
				euhDMO.setEuhAuthHost(rs.getString(6));
				euhDMO.setEuhAuthPort(rs.getString(7));
				euhDMO.setEuhDescription(rs.getString(8));
				break;
			}

			st.close();
			rs.close();
		} catch (SQLException e) {
			logger.error("Failed to get EUH for key: PAYGTURL " + " "
					+ e.getMessage());
		} catch (Exception e) {
			logger.error("Failed to get EUH for key: PAYGTURL " + " "
					+ e.getMessage());
		}

		return euhDMO;

	}

	public EudEpxUriDetDMO getEudUneUrl() {

		EudEpxUriDetDMO eudDMO = null;
		String sql = "Select * from eud_epx_uri_det where eud_euh_key = 'PAYGTURL'";
		logger.debug("\n" + sql);
		try {
			st = this.getConnection().createStatement();
			rs = st.executeQuery(sql);

			while (rs.next()) {
				eudDMO = new EudEpxUriDetDMO();
				eudDMO.setEudEuhId(rs.getInt(1));
				eudDMO.setEudEuhKey(rs.getString(2));
				eudDMO.setEudSeq(rs.getInt(3));
				eudDMO.setEudAddress(rs.getString(4));
				break;
			}

			st.close();
			rs.close();
		} catch (SQLException e) {
			logger.error("Failed to get EUD for key: PAYGTURL " + " "
					+ e.getMessage());
		} catch (Exception e) {
			logger.error("Failed to get EUD for key: PAYGTURL " + " "
					+ e.getMessage());
		}

		return eudDMO;

	}
	
	public void insertSkatCusttokenMig(AuxEncDetailsDMO detailDmo){
		
		String sql = "INSERT INTO skat_custtoken_mig(skat_epxtrans_id, skat_account_no, skat_token_id, skat_timestamp)" +
				"VALUES(0, '" + detailDmo.getAccountNo() + "', '" + detailDmo.getVauldId() + "', CURRENT);";
		
		logger.debug("\n" + sql);
		boolean success;
		
		try {
			st = this.getConnection().createStatement();
			success = st.execute(sql);

			st.close();
			rs.close();
		} catch (SQLException e) {
			logger.error("Failed to get insert record into skat_custtoken_mig for account: " + " "	+ detailDmo.getAccountNo());
		} catch (Exception e) {
			logger.error("Failed to get insert record into skat_custtoken_mig for account: " + " " + detailDmo.getAccountNo());
		}
	}
	
	public void getSksRptPath(){
		
		QueryFilter filter = new QueryFilter();
		filter.add(FilterOp.EQUAL, SksKeySettingDMO.sksKeyCodeFilter, "SKAMIGREPS");
		SksKeySettingDMO sksDmo = null;
		
		try {
			sksDmo = base.sksKeySetting().get(filter);
		} catch (EPPIXBusinessException e) {
			logger.error(e.getMessage());
			this.reportPath = "\\\\eppixdata\\eppixreports\\SKA-Migration-Files-Processed\\";
		} catch (EPPIXUnexpectedException e) {
			logger.error(e.getMessage());
			this.reportPath = "\\\\eppixdata\\eppixreports\\SKA-Migration-Files-Processed\\";
		} catch (EPPIXFatalException e) {
			logger.error(e.getMessage());
			this.reportPath = "\\\\eppixdata\\eppixreports\\SKA-Migration-Files-Processed\\";
		}
		
		this.reportPath = sksDmo.getSksValue();
	}

	public String getPayID() {
		return payID;
	}

	public void setPayID(String payID) {
		this.payID = payID;
	}

	public String getPayPwd() {
		return payPwd;
	}

	public void setPayPwd(String payPwd) {
		this.payPwd = payPwd;
	}

	public String getPayUrl() {
		return payUrl;
	}

	public void setPayUrl(String payUrl) {
		this.payUrl = payUrl;
	}

	public String getKeyStore() {
		return keyStore;
	}

	public void setKeyStore(String keyStore) {
		this.keyStore = keyStore;
	}

	public String getKeyPwd() {
		return keyPwd;
	}

	public void setKeyPwd(String keyPwd) {
		this.keyPwd = keyPwd;
	}
}
