package com.eppixcomm.eppix.base.pay.ws;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Authenticator;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//import com.sun.xml.ws.transport.http.client.HttpTransportPipe.dump;
import com.sun.xml.internal.ws.transport.http.client.*;
//import com.sun.xml.ws.transport.http.HttpAdapter.dump;
//import com.sun.xml.internal.ws.transport.http.HttpAdapter.dump;


import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.eppixcomm.eppix.base.blo.AuxEncDetailsDMO;
import com.eppixcomm.eppix.base.error.Thrower;

public class WsPayGateController {
	// Globals
	private URL payURL;
	private String payID;
	private String payPWD;
	private static Thrower thrower = Thrower.getThrower(WsPayGateController.class);
	private Logger logger = Logger.getLogger(WsPayGateController.class);
	private static String fileSep = System.getProperty("file.separator");
	private static final String RESOURCES_PATH = System.getProperty("user.dir");
	private String statusName;
	private String statusDetail;
	private String vaultId;
	private String error;
	private String keyStore;
	private String keyPwd;

	public WsPayGateController() {
		// TODO Auto-generated constructor stub
		PropertyConfigurator.configure(RESOURCES_PATH + fileSep
				+ "log4j.properties");
		logger.debug("RESOURCES_PATH=" + RESOURCES_PATH + fileSep
				+ "log4j.properties");		
	}
	
	
	public StringBuffer createRequest(String creditCrd, String expDate) {
		
		StringBuffer sb = new StringBuffer();

		sb.append("<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:pay=\"http://www.paygate.co.za/PayHOST\">");
		sb.append("<soapenv:Header/>");
		sb.append("<soapenv:Body>");
		sb.append("<pay:SingleVaultRequest>");
		sb.append("<pay:CardVaultRequest>");
		sb.append("<pay:Account>");
		sb.append("<pay:PayGateId>" + this.getPayID() + "</pay:PayGateId>");
		sb.append("<pay:Password>" + this.getPayPWD() + "</pay:Password>");
		sb.append("</pay:Account>");
		sb.append("<pay:CardNumber>" + creditCrd + "</pay:CardNumber>");
		sb.append("<pay:CardExpiryDate>" + expDate + "</pay:CardExpiryDate>");
		sb.append("</pay:CardVaultRequest>");
		sb.append("</pay:SingleVaultRequest>");
		sb.append("</soapenv:Body>");
		sb.append("</soapenv:Envelope>");
		
//		System.out.println(sb.toString());
		
		return sb;

	}

	// ======================================================================================
	public String sendSecureMessage(String SOAPUrl,
			String xmlDataToSend, String SOAPAction, String userid,
			String password) {
		
		boolean stop = false;
		StringBuffer sb = new StringBuffer();
		Proxy proxy;

		 
		try {
			// Create the connection where we are going to send the xml data.
			URL url = new URL(SOAPUrl);
//			proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("nlawsprvq01.mtn.co.za", 8080));
//			
//			Authenticator authenticator = new Authenticator() {
//
//		        public PasswordAuthentication getPasswordAuthentication() {
//		        return (new PasswordAuthentication("vermeu_s", "*neeltje000".toCharArray()));
//		        }
//		    };
//		    Authenticator.setDefault(authenticator);
			
			URLConnection connection = url.openConnection();
			
//			String basicAuth = userid + ":" + password;
//			basicAuth = "Basic "
//					+ new sun.misc.BASE64Encoder().encode(basicAuth.getBytes());
//			connection.setRequestProperty("Authorization", basicAuth);
			
			System.out.println(RESOURCES_PATH + fileSep + keyStore + ": PWD: " + keyPwd);
			
			
			System.setProperty("javax.net.ssl.trustStore", RESOURCES_PATH + fileSep
					+ keyStore);
			System.setProperty("javax.net.ssl.trustStorePassword", keyPwd);
			System.setProperty("https.protocols", "SSLv3");
			
			System.out.println("TRUST STORE: " + System.getProperty("javax.net.ssl.trustStore"));
			System.out.println("TRUST PWD: " + System.getProperty("javax.net.ssl.trustStorePassword"));

			HttpURLConnection httpConn = (HttpURLConnection) connection;

			byte[] b = xmlDataToSend.getBytes();

			// Set the appropriate HTTP parameters.
			httpConn.setRequestProperty("Content-Length",
					String.valueOf(b.length));
			httpConn.setRequestProperty("Accept-Encoding",
					"gzip,deflate");
			httpConn.setRequestProperty("Content-Type",
					"text/xml; charset=utf-8");
			httpConn.setRequestProperty("SOAPAction", "");
			httpConn.setRequestMethod("POST");

			httpConn.setDoOutput(true);
			httpConn.setDoInput(true);

			System.setProperty("com.sun.xml.ws.transport.http.client.HttpTransportPipe.dump", "true");
			System.setProperty("com.sun.xml.internal.ws.transport.http.client.HttpTransportPipe.dump", "true");
			System.setProperty("com.sun.xml.ws.transport.http.HttpAdapter.dump", "true");
			System.setProperty("com.sun.xml.internal.ws.transport.http.HttpAdapter.dump", "true");
			

			
			// Everything is set up; send the XML that was read in to b.
			try {
				OutputStream out = httpConn.getOutputStream();
				out.write(b);
				out.close();
			} catch (IOException ioe) {
				
				logger.error(ioe.getMessage());
				
				ioe.printStackTrace();
				
				sb.append("<Error>" + ioe.getMessage() + "</Error>");
				// Stop further proccessing
				stop = true;
			}

			if(!stop){
			// Read the success response and return it
			try {
				InputStreamReader isr = new InputStreamReader(
						httpConn.getInputStream());
				BufferedReader in = new BufferedReader(isr);
				String inputLine;
				while ((inputLine = in.readLine()) != null)
					sb.append(inputLine);
			} catch (IOException ioe) {
				// Read the error response and return it
				ioe.printStackTrace();
				try {
					InputStreamReader errorStream = new InputStreamReader(
							httpConn.getErrorStream());
					BufferedReader in = new BufferedReader(errorStream);
					String inputLine;
					while ((inputLine = in.readLine()) != null)
						sb.append(inputLine);
				} catch (Exception e) {
					logger.error(e.getMessage());
					e.printStackTrace();
					sb.append("<Error>" + e.getMessage() + "</Error>");
					e.printStackTrace();

				}
			}
			}
		} catch (Exception ex) {
			ex.printStackTrace();
			logger.error(ex.getMessage());
			sb.append("<Error>" + ex.getMessage() + "</Error>");
		}
		System.out.println("BEFORE PARSING: " + sb.toString() + "\n");
		this.writeResponseValues(sb.toString());
		return sb.toString();
	}

// ======================================================================================
	private void writeResponseValues(String response) {

		if (response != null) {

			String statusName = "";
			String statusDetails = "";
			String vaulId = "";
			String error;

			Pattern pattern = Pattern.compile("<StatusName>");
			Matcher matcher = pattern.matcher(response);
			int start = 0;
			int end = 0;

			while (matcher.find()) {

				// logger.debug("MATCH FOUND START SOA SOURCE ID");

				start = matcher.end();
				pattern = Pattern.compile("</StatusName>");
				matcher = pattern.matcher(response);

				if (matcher.find()) {
					// logger.debug("MATCH FOUND SORB REFERENCE END");
					end = matcher.start();
				}
			}

			if (end > start) {
				statusName = response.substring(start, end);
				statusName = statusName.trim();
				logger.debug("\nSTATUS NAME: " + statusName);
				this.setStatusName(statusName);
			}

			pattern = Pattern.compile("<StatusDetail>");
			matcher = pattern.matcher(response);
			start = 0;
			end = 0;

			while (matcher.find()) {

				// logger.debug("MATCH FOUND START SORB REFERENCE");

				start = matcher.end();
				pattern = Pattern.compile("</StatusDetail>");
				matcher = pattern.matcher(response);

				if (matcher.find()) {
					// logger.debug("MATCH FOUND SORB REFERENCE END");
					end = matcher.start();
				}
			}

			if (end > start) {
				statusDetail = response.substring(start, end);
				statusDetail = statusDetail.trim();
				logger.debug("\nSTATUS DETAIL: " + statusDetail);
				this.setStatusDetail(statusDetail);
			}
			
			pattern = Pattern.compile("<VaultId>");
			matcher = pattern.matcher(response);
			start = 0;
			end = 0;

			while (matcher.find()) {

				// logger.debug("MATCH FOUND START SORB REFERENCE");

				start = matcher.end();
				pattern = Pattern.compile("</VaultId>");
				matcher = pattern.matcher(response);

				if (matcher.find()) {
					// logger.debug("MATCH FOUND SORB REFERENCE END");
					end = matcher.start();
				}
			}

			if (end > start) {
				vaulId = response.substring(start, end);
				vaulId = vaulId.trim();
				logger.debug("\nVAULD ID: " + vaulId);
				this.setVaultId(vaulId);
			}

			pattern = Pattern.compile("<Error>");
			matcher = pattern.matcher(response);
			start = 0;
			end = 0;

			while (matcher.find()) {

				// logger.debug("MATCH FOUND START SORB REFERENCE");

				start = matcher.end();
				pattern = Pattern.compile("</Error>");
				matcher = pattern.matcher(response);

				if (matcher.find()) {
					// logger.debug("MATCH FOUND SORB REFERENCE END");
					end = matcher.start();
				}
			}

			if (end > start) {
				error = response.substring(start, end);
				error = error.trim();
				logger.debug("\nERROR: " + error);
				this.setError(error);
			}

			
		}
	}
// ======================================================================================	

	public URL getPayURL() {
		return payURL;
	}

	public void setPayURL(URL payURL) {
		this.payURL = payURL;
	}

	public String getPayID() {
		return payID;
	}

	public void setPayID(String payID) {
		this.payID = payID;
	}

	public String getPayPWD() {
		return payPWD;
	}

	public void setPayPWD(String payPWD) {
		this.payPWD = payPWD;
	}

	public String getStatusName() {
		return statusName;
	}

	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}

	public String getStatusDetail() {
		return statusDetail;
	}

	public void setStatusDetail(String statusDetail) {
		this.statusDetail = statusDetail;
	}

	public String getVaultId() {
		return vaultId;
	}

	public void setVaultId(String vaultId) {
		this.vaultId = vaultId;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}
	
	public static void main(String[] args) {
		
		WsPayGateController ws = new WsPayGateController();
		
		
		AuxEncDetailsDMO detailDMO = new AuxEncDetailsDMO();
		detailDMO.setCreditCrd("5200000000000015");
		detailDMO.setAccountNo("A0002296");
		detailDMO.setAccountStatus("CLO");
		detailDMO.setCreditExp("062020");
		
		ws.setPayID("10011072130");
		ws.setPayPWD("test");
		ws.setKeyStore("paygate_keystore.db");
		ws.setKeyPwd("eppix_paygate_cert");
		
		StringBuffer xmlDataToSend = ws.createRequest("5200000000000015", "112030");
		
		ws.sendSecureMessage("https://secure.paygate.co.za/PayHost/process.trans", xmlDataToSend.toString(), null, null, null);
		
		detailDMO.setStatusName(ws.getStatusName());
		detailDMO.setStatusDetail(ws.getStatusDetail());
		detailDMO.setVauldId(ws.getVaultId());
		
		if(ws.getError() != null && ws.getError().length() > 0){
			detailDMO.setStatusName("Failed");
			detailDMO.setStatusDetail(ws.getError());
		}
		
		System.out.println(detailDMO.toString());
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
