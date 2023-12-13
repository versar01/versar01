package com.eppixcomm.eppix.chatbot.pay.ws;

import java.io.PrintWriter;
import java.io.StringWriter;

import javax.jws.*;
import javax.jws.WebParam.Mode;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.eppixcomm.eppix.base.error.EPPIXFatalException;
import com.eppixcomm.eppix.base.error.EPPIXSeriousException;
import com.eppixcomm.eppix.base.error.Thrower;
import com.eppixcomm.eppix.base.resp.EppixResponse;
import com.eppixcomm.eppix.common.util.CreateLogProperties;
import com.eppixcomm.eppix.common.util.Date;
import com.eppixcomm.eppix.common.util.ValidateDate;
import com.eppixcomm.eppix.chatbot.pay.Executor;
import com.eppixcomm.eppix.chatbot.pay.resp.ApplyPayResponse;
import com.eppixcomm.eppix.chatbot.pay.resp.VaidatePayResponse;


@WebService
public class EpxChatbotPmntArr {
	// Globals
	private static Thrower thrower = Thrower
			.getThrower(EpxChatbotPmntArr.class);
	private Logger logger = thrower.getLogger();
	private static String fileSep = System.getProperty("file.separator");
	private static final String RESOURCES_PATH = System.getProperty("user.dir")
			+ fileSep;
	
	@WebMethod
	public VaidatePayResponse validatePaymentArrangement(
			@WebParam(header = true, mode = Mode.IN, name = "userName") String userName,
			@WebParam(header = true, mode = Mode.IN, name = "language") String language,
			@WebParam(header = true, mode = Mode.IN, name = "hostname") String hostName,
			@WebParam(name = "clientID") String clientID,
			@WebParam(name = "transactionID") String transactionID,
			@WebParam(name = "accHolderMSISDN") String accHolderMSISDN,
			@WebParam(name = "accountNo") String accountNo,
			@WebParam(name = "activeMSISDN") String activeMSISDN) {
			
		VaidatePayResponse response = new VaidatePayResponse();
		CreateLogProperties createLogProperties = new CreateLogProperties("eppix-chat-log4j.properties", "epxchat", "EPX-CHAT", "EPPIX-CHATBOT-Debug.log");
		try {
			createLogProperties.loadLogPropertiesFile();
		} catch (EPPIXFatalException e) {
			System.out.println("\n" + e.getErrorCode() + ": " + e.getMessage());
			response.setErrorCode(e.getErrorCode());
			response.setErrorDescription(e.getMessage());
			return response;
		}
		
		
		PropertyConfigurator.configure(RESOURCES_PATH + "MTN-AppProperties" + fileSep + "eppix-soa-ss" + fileSep + "eppix-chat-log4j.properties");
		
		logger.debug("WS: RESOURCES_PATH=" + RESOURCES_PATH + "MTN-AppProperties" + fileSep + "eppix-soa-ss" + fileSep + "eppix-chat-log4j.properties");
		System.out.println("WS: RESOURCES_PATH=" + RESOURCES_PATH + "MTN-AppProperties" + fileSep + "eppix-soa-ss" + fileSep + "eppix-chat-log4j.properties");
		
		logger.debug("\nuserName: " + userName
				+ "\nlanguage: " + language
				+ "\nhostname: " + hostName
				+ "\nclientID: " + clientID
				+ "\ntransactionID: " + transactionID
				+ "\naccountNo: " + accountNo
				+ "\naccHolderMSISDN: " + accHolderMSISDN
				+ "\nactiveMSISDN: " + activeMSISDN);		
		
		try {
			thrower.ifParameterMissing("userName", userName);
			thrower.ifParameterMissing("language", language);
			thrower.ifParameterMissing("hostName", hostName);
			thrower.ifParameterMissing("clientID", clientID);			
			thrower.ifParameterMissing("transactionID", transactionID);
			thrower.ifParameterMissing("accHolderMSISDN", accHolderMSISDN);
	
		} catch (EPPIXSeriousException e) {
			response.setErrorCode(e.getErrorCode());
			response.setErrorType("1");
			response.setErrorDescription((e.getMessage() == null) ? "Mandatory parameter not provided" : e.getMessage());
			return response;
		}
		
		try {
			thrower.ifParameterMissing("accountNo", accountNo);
		} catch (EPPIXSeriousException e2) {
			try {
				thrower.ifParameterMissing("activeMSISDN", activeMSISDN);
			} catch (EPPIXSeriousException e1) {
					response.setErrorCode(e1.getErrorCode());
					response.setErrorType("1");
					response.setErrorDescription("Either one of accountNo or activeMSISDN parameters must be provided");
					return response;
				}
			}
		

		Executor exec = new Executor(false);
		
		if (exec.getErrorCode() != null) {
			response.setErrorCode(exec.getErrorCode());
			response.setErrorType("1");
			response.setErrorDescription(exec.getErrorMessage());
			

			try {
				exec.close();
			} catch (EPPIXSeriousException e) {
				StringWriter stack = new StringWriter();
				e.printStackTrace(new PrintWriter(stack));
				logger.debug("\nEXCEPTION TRACE: \n" + stack.toString());
			}
			
			return response;
		}

		try {
			
			response = exec.validatePaymentArrangement(userName, language, hostName, clientID, transactionID, accountNo, accHolderMSISDN, activeMSISDN);
			logger.debug(response.toString());
						
			try {
				exec.close();
			} catch (EPPIXSeriousException e) {
				StringWriter stack = new StringWriter();
				e.printStackTrace(new PrintWriter(stack));
				logger.debug("\nEXCEPTION TRACE: \n" + stack.toString());
			} 

		} catch (NullPointerException e1) {

			StringWriter stack = new StringWriter();
			e1.printStackTrace(new PrintWriter(stack));
			logger.debug("\nEXCEPTION TRACE: \n" + stack.toString());
			
			response.setErrorCode("3");
			response.setErrorType("3");
			response.setErrorDescription((exec.getErrorMessage() == null) ? e1.getMessage() : exec.getErrorMessage());

		}		

		return response;
	}
	
	/**
	 * @param userName
	 * @param language
	 * @param hostName
	 * @param clientID
	 * @param transactionID
	 * @param sourceSystem
	 * @param accountNo
	 * @param accHolderMSISDN
	 * @param MSISDN
	 * @param initialPaymentAmt
	 * @param initialPaymentType
	 * @param instalmentStartDate
	 * @param instalmentType
	 * @param noOfInstalments
	 * @return
	 * 
		clientID, 
		transactionID,
		sourceSystem,
		accHolderMSISDN,
		accountNo,
		activeMSISDN,
		initialPaymentAmt,
		initialPaymentType,
		instalmentStartDate,
		instalmentType.
		noOfInstalments
	 */
	
	@WebMethod
	public ApplyPayResponse applyPaymentArrangement(
			@WebParam(header = true, mode = Mode.IN, name = "userName") String userName,
			@WebParam(header = true, mode = Mode.IN, name = "language") String language,
			@WebParam(header = true, mode = Mode.IN, name = "hostname") String hostName,
			@WebParam(name = "clientID") String clientID,
			@WebParam(name = "transactionID") String transactionID,
			@WebParam(name = "sourceSystem") String sourceSystem,
			@WebParam(name = "accHolderMSISDN") String accHolderMSISDN,
			@WebParam(name = "accountNo") String accountNo,
			@WebParam(name = "activeMSISDN") String activeMSISDN,
			@WebParam(name = "initialPaymentAmt") String initialPaymentAmt,
			@WebParam(name = "initialPaymentType") String initialPaymentType,
			@WebParam(name = "instalmentStartDate") String instalmentStartDate,
			@WebParam(name = "instalmentType") String instalmentType,
			@WebParam(name = "noOfInstalments") String noOfInstalments) {
			
		ApplyPayResponse response = new ApplyPayResponse();
		CreateLogProperties createLogProperties = new CreateLogProperties("eppix-chat-log4j.properties", "epxchat", "EPX-CHAT", "EPPIX-CHATBOT-Debug.log");
		try {
			createLogProperties.loadLogPropertiesFile();
		} catch (EPPIXFatalException e) {
			System.out.println("\n" + e.getErrorCode() + ": " + e.getMessage());
			response.setErrorCode(e.getErrorCode());
			response.setErrorDescription(e.getMessage());
			return response;
		}
		
		
		PropertyConfigurator.configure(RESOURCES_PATH + "MTN-AppProperties" + fileSep + "eppix-soa-ss" + fileSep + "eppix-chat-log4j.properties");
		
		logger.debug("WS: RESOURCES_PATH=" + RESOURCES_PATH + "MTN-AppProperties" + fileSep + "eppix-soa-ss" + fileSep + "eppix-chat-log4j.properties");
		System.out.println("WS: RESOURCES_PATH=" + RESOURCES_PATH + "MTN-AppProperties" + fileSep + "eppix-soa-ss" + fileSep + "eppix-chat-log4j.properties");
		
		logger.debug("\nuserName: " + userName
				+ "\nlanguage: " + language
				+ "\nhostname: " + hostName
				+ "\nclientID: " + clientID
				+ "\ntransactionID: " + transactionID
				+ "\nsourceSystem: " + sourceSystem
				+ "\naccountNo: " + accountNo
				+ "\naccHolderMSISDN: " + accHolderMSISDN
				+ "\nactiveMSISDN: " + activeMSISDN
				+ "\ninitialPaymentAmt: " + initialPaymentAmt
				+ "\ninitialPaymentType: " + initialPaymentType
				+ "\ninstalmentStartDate: " + instalmentStartDate
				+ "\ninstalmentType: " + instalmentType
				+ "\nnoOfInstalments: " + noOfInstalments);	
		
		try {
			thrower.ifParameterMissing("userName", userName);
			thrower.ifParameterMissing("language", language);
			thrower.ifParameterMissing("hostName", hostName);
			thrower.ifParameterMissing("clientID", clientID);
			
			thrower.ifParameterMissing("transactionID", transactionID);
			thrower.ifParameterMissing("sourceSystem", sourceSystem);
			thrower.ifParameterMissing("accHolderMSISDN", accHolderMSISDN);
			thrower.ifParameterMissing("initialPaymentAmt", initialPaymentAmt);
			thrower.ifParameterMissing("initialPaymentType", initialPaymentType);
			thrower.ifParameterMissing("instalmentStartDate", instalmentStartDate);
			thrower.ifParameterMissing("instalmentType", instalmentType);
			thrower.ifParameterMissing("noOfInstalments", noOfInstalments);
	
		} catch (EPPIXSeriousException e) {
			response.setErrorCode(e.getErrorCode());
			response.setErrorType("1");
			response.setErrorDescription((e.getMessage() == null) ? "Mandatory parameter not provided" : e.getMessage());
			return response;
		}
		
		try {
			thrower.ifParameterMissing("accountNo", accountNo);
		} catch (EPPIXSeriousException e2) {
			try {
					thrower.ifParameterMissing("activeMSISDN", activeMSISDN);
				} catch (EPPIXSeriousException e1) {
					response.setErrorCode(e1.getErrorCode());
					response.setErrorType("1");
					response.setErrorDescription("Either one of accountNo or activeMSISDN parameters must be provided");
					return response;
				}
			}
		
		Date startDt = null;
		boolean isDate = false;
		ValidateDate validDate = new ValidateDate();
		isDate = validDate.isValidDateddmmyyyy(instalmentStartDate);
		
		if(isDate) {
			startDt = new Date(validDate.getiDay(), validDate.getiMonth(), validDate.getiYear());
		}else {
			isDate = validDate.isValidDate(instalmentStartDate);
			
			if(isDate) {
				startDt = new Date(validDate.getiDay(), validDate.getiMonth(), validDate.getiYear());
			}else {							
				logger.error("Invalid activationDate: " + instalmentStartDate);
				response.setErrorCode("1");
				response.setErrorType("1");
				response.setErrorDescription("Invalid instalmentStartDate(" + instalmentStartDate + ") – request failed");
				return response;
			}
		}
		

		Executor exec = new Executor(false);
		
		if (exec.getErrorCode() != null) {
			response.setErrorCode(exec.getErrorCode());
			response.setErrorType("1");
			response.setErrorDescription(exec.getErrorMessage());
			

			try {
				exec.close();
			} catch (EPPIXSeriousException e) {
				StringWriter stack = new StringWriter();
				e.printStackTrace(new PrintWriter(stack));
				logger.debug("\nEXCEPTION TRACE: \n" + stack.toString());
			}
			
			return response;
		}

		try {
			
			response = exec.applyPaymentArrangement(userName, language, hostName, clientID, transactionID, sourceSystem,
					accHolderMSISDN, accountNo , activeMSISDN, initialPaymentAmt, initialPaymentType, startDt, instalmentType,
					noOfInstalments);
			logger.debug(response.toString());
						
			try {
				exec.close();
			} catch (EPPIXSeriousException e) {
				StringWriter stack = new StringWriter();
				e.printStackTrace(new PrintWriter(stack));
				logger.debug("\nEXCEPTION TRACE: \n" + stack.toString());
			} 

		} catch (NullPointerException e1) {

			StringWriter stack = new StringWriter();
			e1.printStackTrace(new PrintWriter(stack));
			logger.debug("\nEXCEPTION TRACE: \n" + stack.toString());
			
			response.setErrorCode("3");
			response.setErrorType("3");
			response.setErrorDescription((exec.getErrorMessage() == null) ? e1.getMessage() : exec.getErrorMessage());

		}		

		return response;
	}
}
