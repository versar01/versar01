package com.eppixcomm.eppix.base.soacb.ws;

import java.io.EOFException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Scanner;

import javax.annotation.PostConstruct;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.eppixcomm.eppix.base.error.Thrower;
import com.eppixcomm.eppix.base.resp.EPxSoaIbbNotificationCallbackResponseV1;
import com.eppixcomm.eppix.base.resp.SoaCallBackResponse;
import com.eppixcomm.eppix.base.utils.Authenticator;
import com.eppixcomm.eppix.base.utils.SSRSoaValues;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * This class is used for callback when product is added / removed
 * and SPUL changed.
 * 31-07-2023
 * @author Sarel.Vermeulenk
 *
 */
public class SelfServSoaCallBack {
	// Global
		private static Thrower thrower = Thrower.getThrower(SelfServSoaCallBack.class);
		private Logger logger = thrower.getLogger();
		private Client client;
		private WebTarget target;
		private String endpoint;
		private String authUserName;
		private String authPassword;
		private static String fileSep = System.getProperty("file.separator");
		private static final String RESOURCES_PATH = System.getProperty("user.dir")
				+ fileSep;
		
		public SelfServSoaCallBack() {
			// TODO Auto-generated constructor stub'
			PropertyConfigurator.configure(RESOURCES_PATH
					+ "/MTN-AppProperties/eppix-soa-ss/eppix_sub_serv_log4j.properties");
		}
		
		@PostConstruct
	protected void init(boolean isAuthenticator) {
		logger.debug("\nINIT");

		if (this.getEndpoint().startsWith("HTTPS") || this.getEndpoint().startsWith("https")) {
			if (this.getAuthUserName() == null || this.getAuthUserName().length() <= 0) {
				isAuthenticator = false;
			} else {
				isAuthenticator = true;
			}
		} else {
			isAuthenticator = false;
		}

		logger.debug("\nisAuthenticator: " + isAuthenticator);

		try {
			if (isAuthenticator) {
				logger.debug("\nStep 1");
				try {
					logger.debug("\nStep 2");
					client = ClientBuilder.newClient()
							.register(new Authenticator(this.getAuthUserName(), this.getAuthPassword()));
				} catch (Exception e) {
					StringWriter stack = new StringWriter();
					e.printStackTrace(new PrintWriter(stack));
					logger.debug("\nEXCEPTION TRACE: \n" + stack.toString());
				}
			} else {
				logger.debug("\nStep 3");
				client = ClientBuilder.newClient();
			}

			target = client.target(this.getEndpoint());

		} catch (Exception e) {
			StringWriter stack = new StringWriter();
			e.printStackTrace(new PrintWriter(stack));
			logger.debug("\nEXCEPTION TRACE: \n" + stack.toString());
		}

		logger.debug("\nINIT COMPLETE");

	}
		
		
		public EPxSoaIbbNotificationCallbackResponseV1 callbackSoaIbf(SSRSoaValues values) {
			this.init(true);
			SoaCallBackResponse response = null;
			
			logger.debug(values.toString());	
			
			WebTarget resource = target.path("");
			Builder request = resource.request();
			request.accept(MediaType.APPLICATION_JSON);
			
			logger.debug("\nStep into calling request post \n" + request.toString());
			
			try {
				logger.debug("\nStep 1");
				response = request.post(Entity.entity(values, MediaType.APPLICATION_JSON), SoaCallBackResponse.class);
				logger.debug(response.toString());
				
				EPxSoaIbbNotificationCallbackResponseV1 responseV1 = new EPxSoaIbbNotificationCallbackResponseV1();
				responseV1.setMsisdn(response.getMsisdn());
				responseV1.setStatusCode(response.getStatusCode());
				responseV1.setStatusMessage(response.getStatusMessage());
				responseV1.setSupportMessage(response.getSupportMessage());
				responseV1.setTransactionId(response.getTransactionId());
				responseV1.setTransId(response.getTransSeq());
				logger.debug(responseV1.toString());
				
				logger.debug(responseV1.toString());				
				return responseV1;
			} catch (WebApplicationException e) {
				logger.debug("\n\n" + e.getResponse().hasEntity());				
				String resp = e.getResponse().readEntity(String.class);
				logger.error("\nRESPONSE ERROR: " + resp);
				logger.debug("\n" + e.getMessage());
				
				 ObjectMapper mapper = new ObjectMapper();
				 try {
					JsonNode actualObj = mapper.readTree(resp);
					JsonNode jsonNode1 = actualObj.get("statusCode");
					JsonNode jsonNode2 = actualObj.get("statusMessage");
					JsonNode jsonNode3 = actualObj.get("supportMessage");
					JsonNode jsonNode4 = actualObj.get("transactionId");
					JsonNode jsonNode5 = actualObj.get("transSeq");
					JsonNode jsonNode6 = actualObj.get("msisdn");
					
					logger.debug(jsonNode1.textValue());
					logger.debug(jsonNode2.textValue()); 
					logger.debug(jsonNode3.textValue());
					logger.debug(jsonNode4.textValue());
					if(jsonNode5 != null) {
						logger.debug((jsonNode5.textValue() == null) ? "null" : jsonNode5.textValue());
					}
					
					if(jsonNode6 != null) {
						logger.debug((jsonNode6.textValue() == null) ? "null" :  jsonNode6.textValue());
					}
					
					
					EPxSoaIbbNotificationCallbackResponseV1 responseV1 = new EPxSoaIbbNotificationCallbackResponseV1();
					if(jsonNode6 != null) {
						responseV1.setMsisdn(jsonNode6.textValue());
					}
					responseV1.setStatusCode(jsonNode1.textValue());
					responseV1.setStatusMessage(jsonNode2.textValue());
					responseV1.setSupportMessage(jsonNode3.textValue());
					responseV1.setTransactionId(jsonNode4.textValue());
					if(jsonNode5 != null) {
						responseV1.setTransId(jsonNode5.textValue());
					}
					
					logger.debug(responseV1.toString());
					return responseV1;
					
					
				} catch (JsonProcessingException e1) {
					StringWriter stack = new StringWriter();
					e1.printStackTrace(new PrintWriter(stack));
					logger.debug("\nEXCEPTION TRACE: \n" + stack.toString());
				
				} catch (IOException e2) {
					StringWriter stack = new StringWriter();
					e2.printStackTrace(new PrintWriter(stack));
					logger.debug("\nEXCEPTION TRACE: \n" + stack.toString());
				}
				 
			}
			
			return null;
		}
//		
//		public EPxSoaIbbNotificationCallbackResponseV1 callbackSoaIbf(SSRSoaValues values) {
//			
//			URL url = null;
//			try {
////				url = new URL("http://flaoamrvd01:7007/components/schemas/ibbNotificationCallbackRequestV1?" +
//				url = new URL(this.getEndpoint() + "?" +
//				
//				"sourceIdentifier=" + values.getSourceIdentifier() +
//				"&transactionId=" + values.getTransactionId() + 
//				"&accessId=" + values.getAccessId() +
//				"&action=" + values.getAction() +
//				"&msisdn=" + values.getMsisdn() +
//				"&productCode=" + values.getProductCode() +
//				"&transSeq=" + values.getTransSeq() +
//				"&effectiveDate=" + values.getEffectiveDate() +
//				"&productFee=" + values.getProductFee() +
//				"&newSpul=" + values.getNewSpul() +
//				"&spulAdjusted=" + values.isSpulAdjusted() + 				
//				"&productAdded=" + values.isProductAdded() +				
//				"&errorCode=" + values.getErrorCode() +
//				"&errorStr=" + values.getErrorStr());
//				
//				logger.debug("\nURL: " + url.toString());
//
//			} catch (MalformedURLException e) {
//				StringWriter stack = new StringWriter();
//				e.printStackTrace(new PrintWriter(stack));
//				logger.debug("\nEXCEPTION TRACE: \n" + stack.toString());
//			} 
//			
//			HttpURLConnection conn = null;
//			int responsecode = 0;
//			
//			try {
//				conn = (HttpURLConnection)url.openConnection();
//				conn.setRequestMethod("POST");
//				conn.connect();
//				responsecode = conn.getResponseCode(); 
//			} catch (ProtocolException e) {
//				StringWriter stack = new StringWriter();
//				e.printStackTrace(new PrintWriter(stack));
//				logger.debug("\nEXCEPTION TRACE: \n" + stack.toString());
//			} catch (IOException e1) {
//				StringWriter stack = new StringWriter();
//				e1.printStackTrace(new PrintWriter(stack));
//				logger.debug("\nEXCEPTION TRACE: \n" + stack.toString());
//			} 
//
//			if(responsecode != 200)
//				throw new RuntimeException("HttpResponseCode: " +responsecode);
//			else {
////			    Next part of the functionality
//			}
//			
//			Scanner sc = null;
//			try {
//				sc = new Scanner(url.openStream());
//			} catch (IOException e) {
//				StringWriter stack = new StringWriter();
//				e.printStackTrace(new PrintWriter(stack));
//				logger.debug("\nEXCEPTION TRACE: \n" + stack.toString());
//			}
//			
//			String inline = "";
//			while(sc.hasNext()){
//				 inline+=sc.nextLine();
//			}
//
//			logger.debug("\nJSON data in string format");
//			logger.debug(inline);
//			sc.close();
//			//The parsed data will something like this:
//
//			EPxSoaIbbNotificationCallbackResponseV1 response = null;
//			
//			ObjectMapper mapper = new ObjectMapper();
//			 try {
//				JsonNode actualObj = mapper.readTree(inline);
//				JsonNode jsonNode1 = actualObj.get("statusCode");
//				JsonNode jsonNode2 = actualObj.get("statusMessage");
//				JsonNode jsonNode3 = actualObj.get("supportMessage");
//				
//				JsonNode jsonNode4 = actualObj.get("transactionId");
//				JsonNode jsonNode5 = actualObj.get("transSeq");
//				JsonNode jsonNode6 = actualObj.get("msisdn");
////				JsonNode jsonNode7 = actualObj.get("svcResult");
////				JsonNode jsonNode8 = actualObj.get("svc_err_nr");
//				
//				logger.debug(jsonNode1.textValue());
//				logger.debug(jsonNode2.textValue()); 
//				logger.debug(jsonNode3.textValue());
//				logger.debug(jsonNode4.textValue());
//				logger.debug(jsonNode5.textValue());
//				logger.debug(jsonNode6.textValue());
////				logger.debug(jsonNode7.textValue());
////				logger.debug(jsonNode8.textValue());
//				
//				response = new EPxSoaIbbNotificationCallbackResponseV1();
//				response.setStatusCode(jsonNode1.textValue());
//				response.setStatusMessage(jsonNode2.textValue());
//				response.setSupportMessage(jsonNode3.textValue());
//				response.setTransactionId(jsonNode4.textValue());
//				response.setTransId(jsonNode5.textValue());
//				response.setMsisdn(jsonNode6.textValue());
////				response.setSvcResult(jsonNode7.textValue());
////				response.setSvc_err_nr(jsonNode8.textValue());
//				
//				
//			} catch (JsonProcessingException e1) {
//				StringWriter stack = new StringWriter();
//				e1.printStackTrace(new PrintWriter(stack));
//				logger.debug("\nEXCEPTION TRACE: \n" + stack.toString());
//			} catch (IOException e1) {
//				StringWriter stack = new StringWriter();
//				e1.printStackTrace(new PrintWriter(stack));
//				logger.debug("\nEXCEPTION TRACE: \n" + stack.toString());
//			}
//			 
//			 return response;
//		}

		public String getEndpoint() {
			return endpoint;
		}

		public void setEndpoint(String endpoint) {
			this.endpoint = endpoint;
		}

		public String getAuthUserName() {
			return authUserName;
		}

		public void setAuthUserName(String authUserName) {
			this.authUserName = authUserName;
		}

		public String getAuthPassword() {
			return authPassword;
		}

		public void setAuthPassword(String authPassword) {
			this.authPassword = authPassword;
		}

	public static void main(String[] args) {
		SelfServSoaCallBack callback = new SelfServSoaCallBack();
		
		SSRSoaValues values = new SSRSoaValues();

		values.setAccessId("Eppix IP:10.211.178.73");
		values.setAction("ÄDD");
		values.setEffectiveDate("2023-08-17");
		values.setErrorCode("1");
		values.setErrorStr("Failed: Product does not exist on Eppix");
		values.setMsisdn("27604847163");
		values.setNewSpul("");
		values.setProductCode("Test");
		values.setProductFee("");
		values.setSourceIdentifier("");
		values.setTransactionId("Epx2023081656235008");
		values.setTransSeq("987654321-07-6");
		values.setSpulAdjusted(false);
		values.setProductAdded(false);
		
		
		callback.setEndpoint("HTTPS://osbqaesf.mtn.co.za:20260/subscription-management/enterprise/proxy/api/v1/eppix-ibbcallback-notif");
		callback.setAuthUserName("");
		callback.setAuthPassword("");
		
		callback.callbackSoaIbf(values);
		
		
	}
}
