package com.eppixcomm.eppix.base.blo;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.log4j.Logger;

import com.eppixcomm.eppix.base.error.EPPIXBusinessException;
import com.eppixcomm.eppix.base.error.EPPIXFatalException;
import com.eppixcomm.eppix.base.error.EPPIXSeriousException;
import com.eppixcomm.eppix.base.error.EPPIXUnexpectedException;
import com.eppixcomm.eppix.base.error.Thrower;
import com.eppixcomm.eppix.base.errors.ApplicationMessages;
import com.eppixcomm.eppix.base.pay.ws.WsPayGateController;
import com.eppixcomm.eppix.base.resp.ServiceDiscount;
import com.eppixcomm.eppix.base.utils.CustomerCharges;
import com.eppixcomm.eppix.common.data.DAC;
import com.eppixcomm.eppix.common.data.DAOIterator;
import com.eppixcomm.eppix.common.data.DTOActionTypes;
import com.eppixcomm.eppix.common.data.IntegerDMO;
import com.eppixcomm.eppix.common.data.StringDMO;
import com.eppixcomm.eppix.common.util.Date;
import com.eppixcomm.eppix.common.util.DateTime;
import com.eppixcomm.eppix.common.util.FilterOp;
import com.eppixcomm.eppix.common.util.QueryFilter;
import com.eppixcomm.eppix.soa.sharedservices.blo.AuxEncryptedDMO;

public class EppixDeviceInsPlatformBLO extends BaseBLO implements
		DTOActionTypes, BaseMessages, ApplicationMessages {
	// Globals
	private static Thrower thrower = Thrower
			.getThrower(EppixDeviceInsPlatformBLO.class);
	private Logger logger = thrower.getLogger();
	public EppixDeviceInsPlatformDAC eppixDeviceInsPlatformDAC;
	private BaseBLOBinder base;
	private Connection connection;
	private SubscriberUpgradeMigrade subService;
	private String errorCode;
	private String errorMessage;
	private ResultSet rs = null;
	private Statement st = null;
	private BlhBillLimitHdDMO blhDMO = null;
	private VamActiveMsisdnDMO vamDMO = null;
	private SbdSubDetsDMO sbdDMO = null;
	private SlcustmDMO slDMO = null;
	private AuxCustomersDMO auxDMO = null;
	private BcyBillingCycleDMO bcyDMO = null;
	private VcfVrbleChrgFeeDMO returnedVcfDMO = null;
	
	private BigDecimal FUSMAXVAL;
	private String INSMAXINST;
	private String INSCALCEXP;
	public String userName;
	public String hostName;
	protected SimpleDateFormat dtFormatyyyymmddStandard = new SimpleDateFormat(
			"yyyyMMdd");
	protected String chargeCode;
	protected boolean isInsModify;

	@Override
	protected Class getDACClass() {
		return EppixDeviceInsPlatformDAC.class;
	}

	@Override
	protected void setDAC(DAC dac) {
		this.eppixDeviceInsPlatformDAC = (EppixDeviceInsPlatformDAC) dac;
	}

	public EppixDeviceInsPlatformBLO() {
		super();
	}
	
	
	public Integer doINSUProductVariableCharge(String userName, String language,
			String hostname, String policyRef,
			Integer subscriberId,
			String msisdn,
			String deviceId,
			String deviceIMEI,
			String deviceMake,
			String deviceModel,
			BigDecimal deviceCoverBand,
			BigDecimal monthlyVarCharge,
			DateTime dateTime) throws EPPIXSeriousException{
		
		return this.doINSUProductVariableCharge(userName, language, hostname, policyRef, subscriberId, msisdn, deviceId, deviceIMEI, deviceMake, deviceModel, deviceCoverBand, monthlyVarCharge, null, dateTime);
	}

	public Integer doINSUProductVariableCharge(String userName, String language,
			String hostname, String policyRef,
			Integer subscriberId,
			String msisdn,
			String deviceId,
			String deviceIMEI,
			String deviceMake,
			String deviceModel,
			BigDecimal deviceCoverBand,
			BigDecimal monthlyVarCharge,
			String chargeCode,
			DateTime dateTime) throws EPPIXSeriousException{
		
		logger.info("\nString userName: " + userName
				+ "\nString language: " + language
				+ "\nString hostname: " + hostname
				+ "\nString policyRef: " + policyRef
				+ "\nInteger subscriberId: " + subscriberId
				+ "\nString msisdn: " + msisdn
				+ "\nString deviceId: " + deviceId
				+ "\nString deviceIMEI: " + deviceIMEI
				+ "\nString deviceMake: " + deviceMake
				+ "\nString deviceModel: " + deviceModel
				+ "\nBigDecimal deviceCoverBand: " + deviceCoverBand
				+ "\nBigDecimal monthlyVarCharge: " + monthlyVarCharge
				+ "\nDateTime dateTime: " + dateTime
				+ "\nString chargeCode: " + chargeCode);
		
		this.userName = userName;
		this.hostName = hostname;
			
		boolean success = false;
		String uniqueDeviseId = null;
		String bcyPeriodMonth = null;
		String bcyPeriodyear = null;
		Integer vcfSerial = null;
		ChgChargesDMO chgDmo = null;
		SksKeySettingDMO sksIsdfaultCCDmo;
		boolean isDefaultCC = false;
		boolean isStandAlone = false;
		VcfVrbleChrgFeeDMO vcfDMO = null;
		DAOIterator unPolRefIT = null;
		String ttStanedAlone = null;
		
		/**
		 * 30-07-2020 SV
		 * Check if the chargeCode provided is valid.
		 * 
		 */
		

		if(chargeCode != null && chargeCode.length() > 0){
			
			// Validate the charge code, if not found the default code will be used.
			chgDmo = this.getChg(chargeCode);
			
			if(chgDmo != null){				
				this.setChargeCode(chargeCode);
			}else{
				/**
				 * Need to check if we can use the default				 *  
				 */
				sksIsdfaultCCDmo = this.getSks("INSRDEFCHG");
				
				if(sksIsdfaultCCDmo != null){
					if(sksIsdfaultCCDmo.getSksValue().equals("N")){
						// Default not allowed.
						logger.error("Invalid Charge Code");

						try {
							thrower.business(this.INSU_000119,
									chargeCode);
						} catch (EPPIXBusinessException e) {
							throw new EPPIXSeriousException(
									e.getErrorCode(),
									e.getMessage());
						}
					}else{
						// set varible to ensure we right history
						isDefaultCC = true;
					}
				}
			}
		}else{
			// set varible to ensure we right history
			isDefaultCC = true;
		}
		
		/**
		 * todo SV: 31-07-2020 
		 *  
		 *  Need to check if the chargeCode is cyber sim product or likewise.
		 *  This is new input into TT
		 */
		
		if(chargeCode != null && chargeCode.length() > 0){
		ttStanedAlone = this.getTtTypeTextByGrTxt("INSRSACHRG", chargeCode);
		
		if("STANDALONE".equals(ttStanedAlone)){
			isStandAlone = true;
		}
		}else{
			isStandAlone = false;
		}
		
		if (!isStandAlone) {
			if (deviceId != null && deviceId.length() > 0) {
				uniqueDeviseId = deviceId.trim();
			} else if (deviceIMEI != null && deviceIMEI.length() > 0) {
				uniqueDeviseId = deviceIMEI.trim();
			} else {
				// Throw exception no valid value recieved.
				logger.error("Either the Device unique reference or the IMEI must be provided");

				try {
					thrower.business(this.INSU_000110);
				} catch (EPPIXBusinessException e) {
					throw new EPPIXSeriousException(e.getErrorCode(),
							e.getMessage());
				}
			}
		}
		
		try {
			vamDMO = this.getVam(subscriberId, msisdn);
		} catch (EPPIXSeriousException e) {
			logger.error(e.getMessage());
		}

		if (vamDMO != null) {

			if (!"1".equals(vamDMO.getVamStatCode())
					&& !"4".equals(vamDMO.getVamStatCode())) {
				logger.error("Subscriber is not active");
				
				try {
					thrower.business(this.INSU_000101);
				} catch (EPPIXBusinessException e) {
					throw new EPPIXSeriousException(e.getErrorCode(), e.getMessage());
				}

			}

			try {
				sbdDMO = this.getSbd(vamDMO.getVamSubscriberId());
			} catch (EPPIXSeriousException e1) {
				// No SBD record, cannot procceed
				logger.error("Subscriber does not exists");

				try {
					thrower.business(this.INSU_000102);
				} catch (EPPIXBusinessException e) {
					throw new EPPIXSeriousException(e.getErrorCode(), e.getMessage());
				}
			}
		} else {
			logger.error("Subscriber does not exists");
			try {
				thrower.business(this.INSU_000102);
			} catch (EPPIXBusinessException e) {
				throw new EPPIXSeriousException(e.getErrorCode(), e.getMessage());
			}
		}

		try {
			slDMO = this.getSlcustm(sbdDMO.getSbdBillAcNo());

			if (slDMO == null) {
				// No credit limit for the customer
				logger.error("The account: " + sbdDMO.getSbdBillAcNo()
						+ " does not exists in slcustm");

				try {
					thrower.business(this.INSU_000103);
				} catch (EPPIXBusinessException e) {
					throw new EPPIXSeriousException(e.getErrorCode(), e.getMessage());
				}
			}

		} catch (EPPIXSeriousException e1) {
			// No credit limit for the customer
			logger.error("The account: " + sbdDMO.getSbdBillAcNo()
					+ " does not exists in slcustm");
			
			try {
				thrower.business(this.INSU_000103);
			} catch (EPPIXBusinessException e) {
				throw new EPPIXSeriousException(e.getErrorCode(), e.getMessage());
			}
		}
		


		
		/** 
		 * Change made 03-02-2020
		 * Change Request: CR189197
		 * 
		 * 2.	Check If Insurance Policy Number is In Use – Status of VCF is Irrelevant
		 * 3.	When Policy Number Exists 
		 * a.	Return Error “Policy Number Already In Use”
		 * 
		 */

		
		if (uniqueDeviseId != null && uniqueDeviseId.length() > 0) {
			unPolRefIT = this.eppixDeviceInsPlatformDAC
					.getVcfUniqueInsurancePol(policyRef);
		}
		
		/**
		 * Change 30-07-2020 SV
		 * e.	If IMEI is provided 
		 * i.	Check if Subscribers Device Is Already Insured
		 * 		1.	If already insured, check if the policy id and charge code (if provided) 
		 * 			match the existing active record as it may be an add-on insurance product.
		 * 
		 * 		2.	If no match found continue
		 * 
		 * 		3.	If policy ids match, then return existing error that the device is already insured.	
		 */

		if (!isInsModify()) {
			if (unPolRefIT != null && unPolRefIT.hasNext()) {
				
				while (unPolRefIT.hasNext()) {
					VcfVrbleChrgFeeDMO vcfcheckDmo = (VcfVrbleChrgFeeDMO) unPolRefIT
							.next();

					if (uniqueDeviseId != null && uniqueDeviseId.length() > 0) {
						
						if (chargeCode != null && chargeCode.length() > 0) {
							if (vcfcheckDmo.getVcfProductCode() != null
									&& vcfcheckDmo.getVcfProductCode().length() > 0) {
								if (vcfcheckDmo.getVcfProductCode().equals(
										uniqueDeviseId)) {
									if (vcfcheckDmo.getVcfChargeCode().equals(
											chargeCode)) {
										logger.error("Policy Number Already In Use: "
												+ policyRef);

										try {
											thrower.business(this.INSU_000113,
													policyRef);
										} catch (EPPIXBusinessException e) {
											throw new EPPIXSeriousException(
													e.getErrorCode(),
													e.getMessage());
										}
									}
								}
							}
						}
					}else{
						/**
						 * todo SV: 31-07-2020 
						 *  
						 *  Need to check if the chargeCode is cyber sim product or likewise.
						 *  This is new input into TT
						 */
						ttStanedAlone = this.getTtTypeTextByGrTxt("INSRSACHRG", chargeCode);
						
						if(ttStanedAlone.equals("STANDALONE")){
							isStandAlone = true;
						}
					}
				}
			}
		}

		SksKeySettingDMO sksDmo = this.getSks("FUSMAXVAL");
		
		if(sksDmo == null){
			this.FUSMAXVAL = new BigDecimal("0.00");
		}else{
			this.FUSMAXVAL = new BigDecimal(sksDmo.getSksValue());
		}
		
		if(monthlyVarCharge.intValue() > this.FUSMAXVAL.intValue()){
			logger.error("Monthly Premium exceeds configured System amount: " + FUSMAXVAL.intValue() + ": " + monthlyVarCharge.intValue());
			
			try {
				thrower.business(this.INSU_000106);
			} catch (EPPIXBusinessException e) {
				throw new EPPIXSeriousException(e.getErrorCode(), e.getMessage());
			}
		}
		
		sksDmo = this.getSks("INSMAXINST");
		
		if(sksDmo == null){
			this.INSMAXINST = "0";
		}else{
			this.INSMAXINST = sksDmo.getSksValue();
		}		

		sksDmo = this.getSks("INSCALCEXP");
		
		if(sksDmo == null){
			this.INSCALCEXP = "N";
		}else{
			this.INSCALCEXP = sksDmo.getSksValue();
		}
		
		IntegerDMO countDmo = null;
		
		try {
			countDmo = this.eppixDeviceInsPlatformDAC.getCountINSUFromVcf(sbdDMO.getSbdSubscriberId());
		} catch (Exception e1) {
			logger.error(e1.getMessage());
		}
		
		if(countDmo != null){
			if(countDmo.getIntValue() >= new Integer(INSMAXINST).intValue()){
				try {
					thrower.business(this.INSU_000104);
				} catch (EPPIXBusinessException e) {
					throw new EPPIXSeriousException(e.getErrorCode(), e.getMessage());
				}
			}
		}
		
		vcfDMO = null;
		DAOIterator vcfIT = null;
		
		/** 
		 * Change made 03-02-2020
		 * Change Request: CR189197
		 * 
		 * •	Check If Subscribers Device is Currently Insured – VCF Status “A” 
		 * d.	When Subscribers Device Is Already Insured
		 *  i.	Return Error “Subscriber has existing Insurance on device”
		 *  
		 *  Change below select to comply to new select
		 * 
		 */
		
		if(!isStandAlone){
			try {
				vcfDMO = this.eppixDeviceInsPlatformDAC
						.getSubscriberVcfCharges(uniqueDeviseId);
			} catch (EPPIXSeriousException e) {
				logger.error(e.getMessage());
			}
		}
		
		if(vcfDMO != null){
//			while(vcfIT.hasNext()){
				logger.error("Subscriber has existing Insurance on device");
				try {
					thrower.business(this.INSU_000105);
				} catch (EPPIXBusinessException e) {
					throw new EPPIXSeriousException(e.getErrorCode(), e.getMessage());
				}
//			}
		}
			
		
		if(this.INSCALCEXP.equals("Y")){
			success = this.checkAccountExposure(sbdDMO.getSbdSubscriberId(), msisdn, monthlyVarCharge);
		}
		
		Calendar cal = null;
		
		if(success){
			/**
			 * proccedd further
			 */
			try {
				bcyDMO = this.getBcy(sbdDMO.getSbdBillCycle());
			} catch (EPPIXSeriousException e) {
				logger.error(e.getMessage());
			}
			
			if(bcyDMO  == null){
				logger.error("Could not get BCY for billing cycle: " + sbdDMO.getSbdBillCycle());
				
				try{
					thrower.business(this.INSU_000107, sbdDMO.getSbdBillCycle());
				} catch (EPPIXBusinessException e) {
					throw new EPPIXSeriousException(e.getErrorCode(), e.getMessage());
				}
				
			}else{
				cal = Calendar.getInstance();
				cal.setTime((java.util.Date)bcyDMO.getBcyNextRun());
				
				/**
				 * Change requested by Ngoni.
				 * 29-10-2019
				 * 
				 * The Insurance project is being currently tested. 
				 * Last night I found an issue when running the billing of the insurance product created in vcf.
				 * Can you modify the Next period Column value to  BCY next Bill Run Month – 1.
				 * I found that it will not bill the vcf record when the next period (vcf) = bcy_next_run(Month).
				 * I updated that manually to procced to bill it.
				 * 				 *  
				 */
				
//				bcyPeriodMonth = new String().valueOf(cal.get(Calendar.MONTH) + 1);
				bcyPeriodMonth = new String().valueOf(cal.get(Calendar.MONTH));
				bcyPeriodyear = new String().valueOf(cal.get(Calendar.YEAR));
				
				logger.info("\nbcyPeriodMonth: " + bcyPeriodMonth + "\nbcyPeriodyear: " + bcyPeriodyear);
			}
			
			try {
				vcfSerial = this.createVcfVrbleChrgFee(sbdDMO.getSbdBillAcNo(), sbdDMO.getSbdSubscriberId(), uniqueDeviseId, deviceMake, deviceModel, policyRef, deviceCoverBand, monthlyVarCharge, bcyPeriodMonth, bcyPeriodyear, chargeCode);
			
				try {
					returnedVcfDMO = this.eppixDeviceInsPlatformDAC.getVcfSubscriberInsDevice(vamDMO.getVamSubscriberId(), policyRef, uniqueDeviseId);
					
					if(returnedVcfDMO == null){
						
					}else{
						logger.error("1: Subscriber Active Insurance Product found: " + returnedVcfDMO.getVcfEquipId());
						vcfSerial = returnedVcfDMO.getVcfEquipId();
					}
					
				} catch (EPPIXSeriousException e) {
					logger.error("Subscriber has no Active Insurance Product");
				}
			
			} catch (EPPIXSeriousException e) {
				/**
				 *  Write error history.
				 *  
				 *  History Code = “ERROR”
				 *  
				 *  Comment 
				 * [1,9] = Account Number
				 * [10,23] = “Ref“, Policy Ref Number
				 * [25, 50]  = “IMEI.”, Device Imei Number or Device unique id
				 * 
				 */
				String histCode = "ERROR";
				String errMess = sbdDMO.getSbdBillAcNo() + " Ref " + policyRef + " IMEI. " + uniqueDeviseId;
				
				this.createSimHistory(sbdDMO.getSbdSubscriberId(), vamDMO.getVamSimNo(), histCode, errMess, userName, hostname);
				
				this.createMshMsisdnHistory(sbdDMO.getSbdSubscriberId(), vamDMO.getVamMsisdnNo(), histCode, errMess, userName, hostname);
				
				this.createSbdHistory(sbdDMO.getSbdSubscriberId(), histCode, "", errMess, userName, hostname);
				
				try{
					thrower.business(this.INSU_000108, e.getMessage());
				}catch (EPPIXBusinessException e1) {
					throw new EPPIXSeriousException(e1.getErrorCode(), e1.getMessage());
				}
			}
			
			/**
			 * •	Record provisioning events must be written to the various history tables SIM/MSISDN/SUB.
					History Code = “EISA” 
					Comment 
						[1,9] = Account Number
						[10,23] = “Ref“, Policy Ref Number
						[25, 50]  = “IMEI.”, Device Imei Number
			 */
			logger.debug("\nVCF SERIAL RETURNED: " + vcfSerial);
			
			
			String histCode = "EISA";
			String errMess = sbdDMO.getSbdBillAcNo() + " Ref " + policyRef + " IMEI. " + uniqueDeviseId;
			
			this.createSimHistory(sbdDMO.getSbdSubscriberId(), vamDMO.getVamSimNo(), histCode, errMess, userName, hostname);
			
			this.createMshMsisdnHistory(sbdDMO.getSbdSubscriberId(), vamDMO.getVamMsisdnNo(), histCode, errMess, userName, hostname);
			
			this.createSbdHistory(sbdDMO.getSbdSubscriberId(), histCode, "", errMess, userName, hostname);
			
			if(isDefaultCC){
				/**
				 * 30-07-2020 SV
				 * l.	Write history -As Per Current
						i.	If the default charge code was used and additional history record must be written recording the original charge code that was passed but not used
						ii.	Use History code “INSDEFCHG” as the subscriber history code along with the null value or code passed in as the “old value” and “INSR” as the “new value”

				 */
				this.createSbdHistory(sbdDMO.getSbdSubscriberId(), "INSDEFCHG", chargeCode, "INSR", userName, hostname);
			}
			
			SksKeySettingDMO insActSksdmo = this.getSks("INSACTPROR");
			
			if(insActSksdmo != null && "Y".equals(insActSksdmo.getSksValue())){
				this.generateVariableProrataFee(vcfSerial, new Date(), "A");
			}

			return vcfSerial;
		}
		return null;
	}
	
	public boolean cancelInsurance(String userName, String language,
			String hostname, String policyRef,
			Integer subscriberId,
			String msisdn,
			String deviceId,
			String deviceIMEI,
			String deviceMake,
			String deviceModel,
			BigDecimal deviceCoverBand,
			BigDecimal monthlyVarCharge) throws EPPIXSeriousException{
		
		logger.info("\nString userName: " + userName
				+ "\nString language: " + language
				+ "\nString hostname: " + hostname
				+ "\nString policyRef: " + policyRef
				+ "\nInteger subscriberId: " + subscriberId
				+ "\nString msisdn: " + msisdn
				+ "\nString deviceId: " + deviceId
				+ "\nString deviceIMEI: " + deviceIMEI
				+ "\nString deviceMake: " + deviceMake
				+ "\nString deviceModel: " + deviceModel
				+ "\nBigDecimal deviceCoverBand: " + deviceCoverBand
				+ "\nBigDecimal monthlyVarCharge: " + monthlyVarCharge	);
		
		this.userName = userName;
		this.hostName = hostname;
			
		boolean success = false;
		String uniqueDeviseId = null;
		String bcyPeriodMonth = null;
		String bcyPeriodyear = null;
		Integer vcfSerial = null;
		String billTable = null;
		boolean vcfFound = false;
		
		if(deviceId != null && deviceId.length() > 0){
			uniqueDeviseId = deviceId.trim();
		}else if (deviceIMEI != null && deviceIMEI.length() > 0){
			uniqueDeviseId = deviceIMEI.trim();
		}else{
			// Throw exception no valid value recieved.
			logger.error("Subscriber is not active");
			
			try {
				thrower.business(this.INSU_000110);
			} catch (EPPIXBusinessException e) {
				throw new EPPIXSeriousException(e.getErrorCode(), e.getMessage());
			}
			
		}
		
		try {
			if (subscriberId != null && subscriberId.intValue() > 0) {
				vamDMO = this.getVam(subscriberId, null);
			} else {
				vamDMO = this.getVam(null, msisdn);
			}

		} catch (EPPIXSeriousException e) {
			logger.error(e.getMessage());

		}

		if (vamDMO == null) {

			logger.error("Subscriber does not exists");
			try {
				thrower.business(this.INSU_000102);
			} catch (EPPIXBusinessException e) {
				throw new EPPIXSeriousException(e.getErrorCode(), e.getMessage());
			}
		}else{
			try {
				sbdDMO = this.getSbd(vamDMO.getVamSubscriberId());
			} catch (EPPIXSeriousException e1) {
				// No SBD record, cannot procceed
				logger.error("Subscriber does not exists");

				try {
					thrower.business(this.INSU_000102);
				} catch (EPPIXBusinessException e) {
					throw new EPPIXSeriousException(e.getErrorCode(), e.getMessage());
				}
			}
		}

		VcfVrbleChrgFeeDMO vcfDMO = null;
		
		try {
			vcfDMO = this.eppixDeviceInsPlatformDAC.getVcfSubscriberInsDevice(vamDMO.getVamSubscriberId(), policyRef, uniqueDeviseId);
			
			if(vcfDMO == null){
				vcfFound = false;
			}else{
				vcfFound = true;
				logger.error("1: Subscriber Active Insurance Product found: " + vcfDMO.getVcfEquipId());
				this.returnedVcfDMO = vcfDMO;
			}
			
		} catch (EPPIXSeriousException e) {
			logger.error("Subscriber has no Active Insurance Product");
			vcfFound = false;
//			try {
//				thrower.business(this.INSU_000111);
//			} catch (EPPIXBusinessException e1) {
//				throw new EPPIXSeriousException(e1.getErrorCode(), e1.getMessage());
//			}
		}
		
		/**
		 * Change 25-11-2019
		 * If the record is not found, then also check for older insurance products.
		 * 
		 */
		if(!vcfFound){

			/**
			 * Try different select
			 */
			if(policyRef != null && policyRef.length() > 0){
				if(policyRef.contains("P")){
					vcfDMO = this.eppixDeviceInsPlatformDAC.getVcfSubscriberInsDeviceOld(vamDMO.getVamSubscriberId(), deviceId);
				}else{
					vcfDMO = this.eppixDeviceInsPlatformDAC.getVcfSubscriberInsDeviceOld(vamDMO.getVamSubscriberId(), deviceId);
				}
			}
			
			if(vcfDMO == null){
				logger.error("Subscriber has no Active Insurance Product");
				try {
					thrower.business(this.INSU_000111);
				} catch (EPPIXBusinessException e1) {
					throw new EPPIXSeriousException(e1.getErrorCode(), e1.getMessage());
				}
			}else{
				logger.error("2: Subscriber Active Insurance Product found: " + vcfDMO.getVcfEquipId());
				this.returnedVcfDMO = vcfDMO;
			}
		}
		
		if(!"A".equals(vcfDMO.getVcfStatus())){
			logger.error("Subscriber Insurance Product is not active");
			try {
				thrower.business(this.INSU_000112, "The Insurance Product is not active");
			} catch (EPPIXBusinessException e1) {
				throw new EPPIXSeriousException(e1.getErrorCode(), e1.getMessage());
			}
		}
		
		try {
			bcyDMO = this.getBcy(sbdDMO.getSbdBillCycle());
		} catch (EPPIXSeriousException e1) {
			logger.error("Could not get BCY for billing cycle: " + sbdDMO.getSbdBillCycle() + " " + e1.getMessage());
		}
		
		Calendar cal = null;
		
		if(bcyDMO  == null){
			logger.error("Could not get BCY for billing cycle: " + sbdDMO.getSbdBillCycle());
			
			try{
				thrower.business(this.INSU_000107, sbdDMO.getSbdBillCycle());
			} catch (EPPIXBusinessException e) {
				throw new EPPIXSeriousException(e.getErrorCode(), e.getMessage());
			}
			
		}else{
			cal = Calendar.getInstance();
			cal.setTime((java.util.Date)bcyDMO.getBcyNextRun());
			cal.set(Calendar.DATE, -1);
			
			billTable = "bill_" + sbdDMO.getSbdBillCycle() + dtFormatyyyymmddStandard.format(bcyDMO.getBcyNextRun());
						
			logger.info("\nBCY NEXT RUN -1: " + cal.getTime().toString());
			logger.info("\nbillTable: " + billTable);
		}
		
		try {
//			this.updateVcfInsurance(sbdDMO.getSbdSubscriberId(), new Date(cal.getTime()), policyRef, uniqueDeviseId);
			this.updateVcfInsurance(sbdDMO.getSbdSubscriberId(), vcfDMO.getVcfEquipId(), new Date(cal.getTime()));
		} catch (EPPIXSeriousException e) {
			String histCode = "ERROR";
			String errMess = sbdDMO.getSbdBillAcNo() + " Ref " + policyRef + " IMEI. " + uniqueDeviseId;
			
			this.createSimHistory(sbdDMO.getSbdSubscriberId(), vamDMO.getVamSimNo(), histCode, errMess, userName, hostname);
			
			this.createMshMsisdnHistory(sbdDMO.getSbdSubscriberId(), vamDMO.getVamMsisdnNo(), histCode, errMess, userName, hostname);
			
			this.createSbdHistory(sbdDMO.getSbdSubscriberId(), histCode, "", errMess, userName, hostname);
			
			try{
				if(e.getMessage().contains("Object not found")){
					thrower.business(this.INSU_000112, "Object not found: No data found");
				}else{
					thrower.business(this.INSU_000112, e.getMessage());
				}
			}catch (EPPIXBusinessException e1) {
				throw new EPPIXSeriousException(e1.getErrorCode(), e1.getMessage());
			}
		}
		
		String histCode = "PINSUM";
		try {
						
			Date billUptolessOneMnth = sbdDMO.getSbdBilledUpto().addMonths(-1, sbdDMO.getSbdBilledUpto());
			
			logger.debug("\nvcfDMO.getVcfStartDate(): " + vcfDMO.getVcfStartDate()
					+ "\nbillUptolessOneMnth: " + billUptolessOneMnth
					+ "\nsbdDMO.getSbdBilledUpto(): " + sbdDMO.getSbdBilledUpto()
					+ "\nbcyDMO.getBcyNextRun(): " + bcyDMO.getBcyNextRun());
			
			if((vcfDMO.getVcfStartDate().after(billUptolessOneMnth)) && (vcfDMO.getVcfStartDate().before(sbdDMO.getSbdBilledUpto()))){
				histCode = "INSPRBRD";
				String oldValue = "Insurance Unbilled Records Deleted";
				this.deleteSubInsBilling(sbdDMO.getSbdBillCycle(), bcyDMO.getBcyNextRun(), sbdDMO.getSbdSubscriberId(), vcfDMO.getVcfChargeCode(), new BigDecimal(vcfDMO.getVcfMonthAmt()), true, vcfDMO.getVcfEquipId());
//				this.createSbdHistory(sbdDMO.getSbdSubscriberId(), histCode, oldValue, "0", this.userName, this.hostName);
				this.createMshMsisdnHistory(sbdDMO.getSbdSubscriberId(), vamDMO.getVamMsisdnNo(), histCode, oldValue, userName, hostname);
				
			}else{

				if(vcfDMO.getVcfStartDate().before(sbdDMO.getSbdBilledUpto())){
					histCode = "PINSUM";
					String oldValue = "INSURANCE: " + vcfDMO.getVcfMonthAmt();
					this.deleteSubInsBilling(sbdDMO.getSbdBillCycle(), bcyDMO.getBcyNextRun(), sbdDMO.getSbdSubscriberId(), vcfDMO.getVcfChargeCode(), new BigDecimal(vcfDMO.getVcfMonthAmt()), false, null);
	
					this.createSbdHistory(sbdDMO.getSbdSubscriberId(), histCode, oldValue, "0", this.userName, this.hostName);
					
					histCode = "EISC";
					String errMess = sbdDMO.getSbdBillAcNo() + " Ref " + policyRef + " IMEI. " + uniqueDeviseId;
					
//					this.createSimHistory(sbdDMO.getSbdSubscriberId(), vamDMO.getVamSimNo(), histCode, errMess, userName, hostname);
					
					this.createMshMsisdnHistory(sbdDMO.getSbdSubscriberId(), vamDMO.getVamMsisdnNo(), histCode, errMess, userName, hostname);
					
//					this.createSbdHistory(sbdDMO.getSbdSubscriberId(), histCode, "", errMess, userName, hostname);
					
					SksKeySettingDMO insActSksdmo = this.getSks("INSDEAPROR");
					
					if(insActSksdmo != null && "Y".equals(insActSksdmo.getSksValue())){
						this.generateVariableProrataFee(vcfDMO.getVcfEquipId(), new Date(), "D");
					}
				}
			}
		} catch (EPPIXSeriousException e) {
			logger.error(e.getMessage());
//			String histCode = "ERROR";
//			String errMess = sbdDMO.getSbdSubscriberId() + " Failed to Delete record from billtable";
			
			if(e.getMessage().contains("RECORD NOT FOUND")){
				// we regard as successfull 
//				String histCode = "PINSUM";
				String oldValue = "INSURANCE: " + vcfDMO.getVcfMonthAmt();
				this.createSbdHistory(sbdDMO.getSbdSubscriberId(), histCode, oldValue, "0", this.userName, this.hostName);
			}else{
				histCode = "ERROR";
				String errMess = sbdDMO.getSbdSubscriberId() + " Failed to Delete record from billtable";
				this.createSbdHistory(sbdDMO.getSbdSubscriberId(), histCode, "", errMess, userName, hostname);
			}
		}
		

		return true;
	}
	
	public void deleteSubInsBilling(String billCycle,
			Date bcyNextRun, Integer subscriberId, String vcfChargeCode, BigDecimal vcfMonthlyCharge, boolean isCurrentPeriod, Integer vcfEquipId)throws EPPIXSeriousException{
		
		String billTable;
		boolean success = false;

		billTable = "bill_" + billCycle.trim()
				+ dtFormatyyyymmddStandard.format(bcyNextRun);
		
		logger.info("BILL TABLE TO to get: " + billTable);
		String sql = "";
		
		if(isCurrentPeriod){
			sql = "DELETE FROM " + billTable 
					+ " WHERE SUBSCRIBER_ID = "	+ subscriberId	
					+ " AND chaserv = '" + vcfChargeCode 
					+ "' AND (BILLIND) = 'n' "
					+ " AND sparech[1,3] = 'CFA'"
					+ " AND sparech[5,11] = 'SVRCHG'"
					+ " AND sparech[20,30] = " +  vcfEquipId ;
		}else{
			sql = "DELETE FROM " + billTable 
				+ " WHERE SUBSCRIBER_ID = "	+ subscriberId	
				+ " AND chaserv = '" + vcfChargeCode 
				+ "' AND (BILLIND) = 'n' "
				+ " AND CHARGE = " + vcfMonthlyCharge.setScale(2, RoundingMode.HALF_UP);
		}
		
		
		st = null;

		logger.debug("\n" + sql);

		try {
			st = this.getConnection().createStatement();
		} catch (SQLException e) {
			logger.debug(e.getMessage());
			throw new EPPIXSeriousException(
					"FAILED TO GET A SQL STATEMENT FROM CONNECTION: "
							+ e.getMessage());
		}

		try {
			success = st.execute(sql);
		} catch (SQLException e) {
			logger.debug(e.getMessage());
			throw new EPPIXSeriousException(
					"FAILED TO EXECUTE A SQL STATEMENT: " + sql + ": "
							+ e.getMessage());
		}finally{
			try {
				st.close();
			} catch (SQLException e) {
				logger.debug(e.getMessage());
			}
			st = null;
		}

//		if(!success){
//			throw new EPPIXSeriousException(
//					"RECORD NOT FOUND: " + sql);
//		}
		
	}
	
	private SksKeySettingDMO getSks(String code){
		
		QueryFilter filter = new QueryFilter();
		filter.add(FilterOp.EQUAL, SksKeySettingDMO.sksKeyCodeFilter, code);

		SksKeySettingDMO sksDMO = null;
		try {
			sksDMO = base.sksKeySetting().get(filter);
		} catch (EPPIXBusinessException e) {
			logger.error("Failed to get SKS for code: " + code + " " + e.getErrorCode());
			return null;
		} catch (EPPIXUnexpectedException e) {
			logger.error("Failed to get SKS for code: " + code + " " + e.getErrorCode());
			return null;
		} catch (EPPIXFatalException e) {
			logger.error("Failed to get SKS for code: " + code + " " + e.getErrorCode());
			return null;
		}
		
		return sksDMO;
	}
	
//	public void getMaxUsageAllowed(SbdSubDetsDMO sbdDmo){
//		
//		GetCrbCharges crbCharges = null;
//		
//		try {
//			crbCharges = base.getGetCrbCharges();
//		} catch (EPPIXFatalException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		try {
//			CustomerCharges charges = crbCharges.getCrbCharges(sbdDmo);
//		} catch (EPPIXSeriousException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}

	public boolean checkAccountExposure(Integer subscriberID, String msisdn,
			BigDecimal monthlyVarCharge) throws EPPIXSeriousException {

		BigDecimal totalAccountSpul = new BigDecimal("0.00");
		BigDecimal aspul = new BigDecimal("0.00");
		BigDecimal crbaDscValue = null;
		BigDecimal creditLimit = null;
		BigDecimal subscriptionParamCharges = new BigDecimal("0.00");
		BigDecimal subscriptionCharges = new BigDecimal("0.00");
		BigDecimal vcfSubscriptionCharges = new BigDecimal("0.00");
		BigDecimal totalSubDiscount = new BigDecimal("0.00");
		
			
		creditLimit = slDMO.getCreditLimit();

		if (creditLimit == null) {
			creditLimit = new BigDecimal("0.00");
		}

		try {
			crbaDscValue = this.getCrbaDiscountRiskAux(sbdDMO.getSbdBillAcNo());
		} catch (EPPIXSeriousException e3) {
			logger.error("Failed to get the Discount value for account : "
					+ sbdDMO.getSbdBillAcNo());
		}

		if (crbaDscValue == null) {
			crbaDscValue = new BigDecimal("0.00");
		}
		
		totalSubDiscount = this.getSubscriberDiscountTotal(sbdDMO.getSbdBillAcNo());
		
		totalSubDiscount = totalSubDiscount.add(crbaDscValue);
		
		if(totalSubDiscount != null){
			System.out.println(totalSubDiscount);
			totalSubDiscount = totalSubDiscount.divide(new BigDecimal(1.15), BigDecimal.ROUND_HALF_UP);
		}

		try {
			subscriptionCharges = this.eppixDeviceInsPlatformDAC
					.getSumAccountSubsciptionCharges(sbdDMO.getSbdBillAcNo());
		} catch (EPPIXSeriousException e) {
			logger.error("Failed to get ACCOUNT: " + sbdDMO.getSbdBillAcNo()
					+ " subscription charges" + e.getMessage());
			subscriptionCharges = new BigDecimal("0.00");
		}

		if (subscriptionCharges == null) {
			subscriptionCharges = new BigDecimal("0.00");
		}

		try {
			subscriptionParamCharges = (this.eppixDeviceInsPlatformDAC
					.getSumAccountParamCharges(sbdDMO.getSbdBillAcNo()));
		} catch (EPPIXSeriousException e) {
			logger.error("Failed to get ACCOUNT: " + sbdDMO.getSbdBillAcNo()
					+ " subscription charges" + e.getMessage());
			 subscriptionCharges = new BigDecimal("0.00");
		}
		
		if (subscriptionParamCharges == null) {
			subscriptionParamCharges = new BigDecimal("0.00");
		}
		
		subscriptionCharges = subscriptionCharges.add(subscriptionParamCharges);
		
		try {
			vcfSubscriptionCharges = this.eppixDeviceInsPlatformDAC.getSumSubscriberVcfCharges(sbdDMO.getSbdBillAcNo());
		} catch (EPPIXSeriousException e) {
			logger.error("Failed to get ACCOUNT: " + sbdDMO.getSbdBillAcNo()
					+ " vcf subscription charges" + e.getMessage());
			vcfSubscriptionCharges = new BigDecimal("0.00");
		}
		
		subscriptionCharges = subscriptionCharges.add(vcfSubscriptionCharges);

		try {
			aspul = this.getBillLimitAHUL(sbdDMO.getSbdBillAcNo());
		} catch (EPPIXSeriousException e2) {
			logger.error("Failed to get account: " + sbdDMO.getSbdBillAcNo()
					+ " AHUL" + e2.getMessage());
			aspul = new BigDecimal("0.00");
		}

		aspul = aspul.add(subscriptionCharges.subtract(totalSubDiscount));
		totalAccountSpul = aspul.add(monthlyVarCharge);
		
//		System.out.println("\nDISCOUNT RETURNED: " + totalSubDiscount.setScale(2, RoundingMode.HALF_UP)	
//				+ "\nCREDIT LIMIT FROM SLCUSTM RETURNED: " + creditLimit.setScale(2, RoundingMode.HALF_UP)
//				+ "\nDEVICE Charges: " + monthlyVarCharge.setScale(2, RoundingMode.HALF_UP)
//				+ "\nsubscriptionCharges: " + subscriptionCharges.setScale(2, RoundingMode.HALF_UP)
//				+ "\nACCOUNT SPUL: " + aspul.setScale(2, RoundingMode.HALF_UP)
//				+ "\nTOTAL ACCOUNT SPUL: " + totalAccountSpul.setScale(2, RoundingMode.HALF_UP));
		
		
		logger.debug("\nDISCOUNT RETURNED: " + totalSubDiscount.setScale(2, RoundingMode.HALF_UP)	
				+ "\nCREDIT LIMIT FROM SLCUSTM RETURNED: " + creditLimit.setScale(2, RoundingMode.HALF_UP)
				+ "\nDEVICE Charges: " + monthlyVarCharge.setScale(2, RoundingMode.HALF_UP)
				+ "\nsubscriptionCharges: " + subscriptionCharges.setScale(2, RoundingMode.HALF_UP)
				+ "\nACCOUNT SPUL: " + aspul.setScale(2, RoundingMode.HALF_UP)
				+ "\nTOTAL ACCOUNT SPUL: " + totalAccountSpul.setScale(2, RoundingMode.HALF_UP));
		
		if(totalAccountSpul.floatValue() < creditLimit.floatValue()){
			
//			System.out.println("TOTAL ASPUL " + totalAccountSpul.setScale(2, RoundingMode.HALF_UP)
//					+ " is less then the credit limit:" + creditLimit.setScale(2, RoundingMode.HALF_UP));
			
			logger.info("TOTAL ASPUL " + totalAccountSpul.setScale(2, RoundingMode.HALF_UP)
					+ " is less then the credit limit:" + creditLimit.setScale(2, RoundingMode.HALF_UP));
			return true;
		}else{
		
			if (totalAccountSpul.floatValue() > creditLimit.floatValue()) {
				//Set credit_limit = (credit limit + Device monthly charge)
				System.out.println("NEED TO UPDATE CREDIT LIMIT ADD MONTLHY CHARGE: " + monthlyVarCharge);
				
				this.updateSlcustmCreditLimit(sbdDMO.getSbdBillAcNo(), creditLimit.add(monthlyVarCharge));
				this.updateCrbCustRiskBal(sbdDMO.getSbdBillAcNo(), creditLimit.add(monthlyVarCharge));
				
				this.createCuhCustHistory(sbdDMO.getSbdBillAcNo(), "CRDLMTMD", creditLimit.setScale(2, RoundingMode.HALF_UP).toString(), creditLimit.add(monthlyVarCharge).setScale(2, RoundingMode.HALF_UP).toString(), this.userName, this.hostName);
			} 
			
			return true;
		}
	}
	
	public boolean checkAccountExposureSS(Integer subscriberID, String msisdn,
			BigDecimal monthlyVarCharge) throws EPPIXSeriousException {


		BigDecimal totalAccountSpul = new BigDecimal("0.00");
		BigDecimal aspul = new BigDecimal("0.00");
		BigDecimal crbaDscValue = null;
		BigDecimal creditLimit = null;
		BigDecimal subscriptionParamCharges = new BigDecimal("0.00");
		BigDecimal subscriptionCharges = new BigDecimal("0.00");
		BigDecimal vcfSubscriptionCharges = new BigDecimal("0.00");
		BigDecimal totalSubDiscount = new BigDecimal("0.00");
		
			
		creditLimit = slDMO.getCreditLimit();

		if (creditLimit == null) {
			creditLimit = new BigDecimal("0.00");
		}

		try {
			crbaDscValue = this.getCrbaDiscountRiskAux(sbdDMO.getSbdBillAcNo());
		} catch (EPPIXSeriousException e3) {
			logger.error("Failed to get the Discount value for account : "
					+ sbdDMO.getSbdBillAcNo());
		}

		if (crbaDscValue == null) {
			crbaDscValue = new BigDecimal("0.00");
		}
		
//		totalSubDiscount = this.getSubscriberDiscountTotal(sbdDMO.getSbdBillAcNo());
		
		totalSubDiscount = totalSubDiscount.add(crbaDscValue);
		
		if(totalSubDiscount != null){
			System.out.println(totalSubDiscount);
			totalSubDiscount = totalSubDiscount.divide(new BigDecimal(1.15), BigDecimal.ROUND_HALF_UP);
		}

		try {
			subscriptionCharges = this.eppixDeviceInsPlatformDAC
					.getSumAccountSubsciptionCharges(sbdDMO.getSbdBillAcNo());
		} catch (EPPIXSeriousException e) {
			logger.error("Failed to get ACCOUNT: " + sbdDMO.getSbdBillAcNo()
					+ " subscription charges" + e.getMessage());
			subscriptionCharges = new BigDecimal("0.00");
		}

		if (subscriptionCharges == null) {
			subscriptionCharges = new BigDecimal("0.00");
		}

		try {
			subscriptionParamCharges = (this.eppixDeviceInsPlatformDAC
					.getSumAccountParamCharges(sbdDMO.getSbdBillAcNo()));
		} catch (EPPIXSeriousException e) {
			logger.error("Failed to get ACCOUNT: " + sbdDMO.getSbdBillAcNo()
					+ " subscription charges" + e.getMessage());
			 subscriptionCharges = new BigDecimal("0.00");
		}
		
		if (subscriptionParamCharges == null) {
			subscriptionParamCharges = new BigDecimal("0.00");
		}
		
		subscriptionCharges = subscriptionCharges.add(subscriptionParamCharges);
		
		try {
			vcfSubscriptionCharges = this.eppixDeviceInsPlatformDAC.getSumSubscriberVcfCharges(sbdDMO.getSbdBillAcNo());
		} catch (EPPIXSeriousException e) {
			logger.error("Failed to get ACCOUNT: " + sbdDMO.getSbdBillAcNo()
					+ " vcf subscription charges" + e.getMessage());
			vcfSubscriptionCharges = new BigDecimal("0.00");
		}
		
		subscriptionCharges = subscriptionCharges.add(vcfSubscriptionCharges);

		try {
			aspul = this.getBillLimitAHUL(sbdDMO.getSbdBillAcNo());
		} catch (EPPIXSeriousException e2) {
			logger.error("Failed to get account: " + sbdDMO.getSbdBillAcNo()
					+ " AHUL" + e2.getMessage());
			aspul = new BigDecimal("0.00");
		}

		aspul = aspul.add(subscriptionCharges.subtract(totalSubDiscount));
		totalAccountSpul = aspul.add(monthlyVarCharge);
		
//		System.out.println("\nDISCOUNT RETURNED: " + totalSubDiscount.setScale(2, RoundingMode.HALF_UP)	
//				+ "\nCREDIT LIMIT FROM SLCUSTM RETURNED: " + creditLimit.setScale(2, RoundingMode.HALF_UP)
//				+ "\nDEVICE Charges: " + monthlyVarCharge.setScale(2, RoundingMode.HALF_UP)
//				+ "\nsubscriptionCharges: " + subscriptionCharges.setScale(2, RoundingMode.HALF_UP)
//				+ "\nACCOUNT SPUL: " + aspul.setScale(2, RoundingMode.HALF_UP)
//				+ "\nTOTAL ACCOUNT SPUL: " + totalAccountSpul.setScale(2, RoundingMode.HALF_UP));
		
		
		logger.debug("\nDISCOUNT RETURNED: " + totalSubDiscount.setScale(2, RoundingMode.HALF_UP)	
				+ "\nCREDIT LIMIT FROM SLCUSTM RETURNED: " + creditLimit.setScale(2, RoundingMode.HALF_UP)
				+ "\nDEVICE Charges: " + monthlyVarCharge.setScale(2, RoundingMode.HALF_UP)
				+ "\nsubscriptionCharges: " + subscriptionCharges.setScale(2, RoundingMode.HALF_UP)
				+ "\nACCOUNT SPUL: " + aspul.setScale(2, RoundingMode.HALF_UP)
				+ "\nTOTAL ACCOUNT SPUL: " + totalAccountSpul.setScale(2, RoundingMode.HALF_UP));
		
		if(totalAccountSpul.floatValue() < creditLimit.floatValue()){
			
//			System.out.println("TOTAL ASPUL " + totalAccountSpul.setScale(2, RoundingMode.HALF_UP)
//					+ " is less then the credit limit:" + creditLimit.setScale(2, RoundingMode.HALF_UP));
			
			logger.info("TOTAL ASPUL " + totalAccountSpul.setScale(2, RoundingMode.HALF_UP)
					+ " is less then the credit limit:" + creditLimit.setScale(2, RoundingMode.HALF_UP));
			return true;
		}else{
		
			if (totalAccountSpul.floatValue() > creditLimit.floatValue()) {
				//Set credit_limit = (credit limit + Device monthly charge)
				System.out.println("NEED TO UPDATE CREDIT LIMIT ADD MONTLHY CHARGE: " + monthlyVarCharge);
				
				this.updateSlcustmCreditLimit(sbdDMO.getSbdBillAcNo(), creditLimit.add(monthlyVarCharge));
				this.updateCrbCustRiskBal(sbdDMO.getSbdBillAcNo(), creditLimit.add(monthlyVarCharge));
				
				this.createCuhCustHistory(sbdDMO.getSbdBillAcNo(), "CRDLMTMD", creditLimit.setScale(2, RoundingMode.HALF_UP).toString(), creditLimit.add(monthlyVarCharge).setScale(2, RoundingMode.HALF_UP).toString(), this.userName, this.hostName);
			} 
			
			return true;
		}
	
	}
	
	private void updateSlcustmCreditLimit(String accountNo,
			BigDecimal creditlimit) throws EPPIXSeriousException {

		QueryFilter filter = new QueryFilter();
		filter.add(FilterOp.SET, SlcustmDMO.creditLimitFilter, creditlimit);
		filter.add(FilterOp.EQUAL, SlcustmDMO.customerFilter, accountNo);

		try {
			base.slcustm().modify(filter);
		} catch (EPPIXBusinessException e) {
			logger.error(e.getMessage());
		} catch (EPPIXUnexpectedException e) {
			logger.error(e.getMessage());
		} catch (EPPIXFatalException e) {
			logger.error(e.getMessage());
		}
	}

	public BcyBillingCycleDMO getBcy(String bcyCycle)
			throws EPPIXSeriousException {

		QueryFilter filter = new QueryFilter();
		filter.add(FilterOp.EQUAL, BcyBillingCycleDMO.bcyBillCycleFilter,
				bcyCycle);

		BcyBillingCycleDMO bcyDMO = null;

		try {
			bcyDMO = base.bcyBillingCycle().get(filter);
		} catch (EPPIXBusinessException e) {
			logger.debug("Failed to get BCY for Billing Cycle: " + bcyCycle
					+ " " + e.getMessage());
			throw new EPPIXSeriousException(
					"Failed to get BCY for Billing Cycle: " + bcyCycle + " "
							+ e.getMessage());
		} catch (EPPIXUnexpectedException e) {
			logger.debug("Failed to get BCY for Billing Cycle: " + bcyCycle
					+ " " + e.getMessage());
			throw new EPPIXSeriousException(
					"Failed to get BCY for Billing Cycle: " + bcyCycle + " "
							+ e.getMessage());
		} catch (EPPIXFatalException e) {
			logger.debug("Failed to get BCY for Billing Cycle: " + bcyCycle
					+ " " + e.getMessage());
			throw new EPPIXSeriousException(
					"Failed to get BCY for Billing Cycle: " + bcyCycle + " "
							+ e.getMessage());
		}

		return bcyDMO;

	}

	private VamActiveMsisdnDMO getVam(Integer subscriberId, String msisdn)
			throws EPPIXSeriousException {

		VamActiveMsisdnDMO vamDMO = null;

		QueryFilter filter = new QueryFilter();

		if (subscriberId != null && subscriberId.intValue() > 0) {
			filter.add(FilterOp.EQUAL,
					VamActiveMsisdnDMO.vamSubscriberIdFilter, subscriberId);
		}

		if (msisdn != null && msisdn.length() > 0) {
			filter.add(FilterOp.EQUAL, VamActiveMsisdnDMO.vamMsisdnNoFilter,
					msisdn);
		}

		try {
			vamDMO = base.vamActiveMsisdn().get(filter);
		} catch (EPPIXBusinessException e) {
			logger.error(e.getMessage());
			throw new EPPIXSeriousException("2",
					"Failed to get VAM record for subscriber: " + subscriberId
							+ " MSISDN: " + msisdn);
		} catch (EPPIXUnexpectedException e) {
			logger.error(e.getMessage());
			throw new EPPIXSeriousException("2",
					"Failed to get VAM record for subscriber: " + subscriberId
							+ " MSISDN: " + msisdn);
		} catch (EPPIXFatalException e) {
			logger.error(e.getMessage());
			throw new EPPIXSeriousException("2",
					"Failed to get VAM record for subscriber: " + subscriberId
							+ " MSISDN: " + msisdn);
		}

		return vamDMO;
	}


	public BigDecimal getBillLimitAHUL(String accountNo)
			throws EPPIXSeriousException {

		StringDMO dmo = null;
		BigDecimal sumSpul = null;

		dmo = this.eppixDeviceInsPlatformDAC.getSumSpulByAccount(accountNo);

		if (dmo != null) {
			try {
				sumSpul = new BigDecimal(dmo.getString());
			} catch (NullPointerException e) {
				sumSpul = new BigDecimal("0.00");
			}
		} else {
			sumSpul = new BigDecimal("0.00");
		}

		return sumSpul;

	}

	private String getTtTypeText(String group, String type) {

		QueryFilter filter = new QueryFilter();
		TtTypeTextDMO ttDmo = null;
		filter.add(FilterOp.EQUAL, TtTypeTextDMO.ttGroupFilter, group);
		filter.add(FilterOp.EQUAL, TtTypeTextDMO.ttTypeFilter, type);

		try {
			ttDmo = base.ttTypeText().get(filter);

			if (ttDmo == null) {
				logger.error("Failed to get TT for group: " + group
						+ " and type: " + type);
				return "";
			}

		} catch (EPPIXBusinessException e) {
			logger.error("Failed to get TT for group: " + group + " and type: "
					+ type + "" + e.getMessage());
			return null;
		} catch (EPPIXUnexpectedException e) {
			logger.error("Failed to get TT for group: " + group + " and type: "
					+ type + "" + e.getMessage());
			return null;
		} catch (EPPIXFatalException e) {
			logger.error("Failed to get TT for group: " + group + " and type: "
					+ type + "" + e.getMessage());
			return null;
		}

		return ttDmo.getTtText();
	}

	private String getTtTypeTextByGrTxt(String group, String text) {

		QueryFilter filter = new QueryFilter();
		TtTypeTextDMO ttDmo = null;
		filter.add(FilterOp.EQUAL, TtTypeTextDMO.ttGroupFilter, group);
		filter.add(FilterOp.EQUAL, TtTypeTextDMO.ttTextFilter, text);

		try {
			ttDmo = base.ttTypeText().get(filter);

			if (ttDmo == null) {
				logger.error("Failed to get TT for group: " + group
						+ " and text: " + text);
				return "";
			}

		} catch (EPPIXBusinessException e) {
			logger.error("Failed to get TT for group: " + group + " and text: "
					+ text + "" + e.getMessage());
			return null;
		} catch (EPPIXUnexpectedException e) {
			logger.error("Failed to get TT for group: " + group + " and text: "
					+ text + "" + e.getMessage());
			return null;
		} catch (EPPIXFatalException e) {
			logger.error("Failed to get TT for group: " + group + " and text: "
					+ text + "" + e.getMessage());
			return null;
		}

		return ttDmo.getTtType();
	}
	
	private SbdSubDetsDMO getSbd(Integer subscriberId)
			throws EPPIXSeriousException {

		SbdSubDetsDMO sbdDmo = null;
		QueryFilter filter = new QueryFilter();
		filter.add(FilterOp.EQUAL, SbdSubDetsDMO.sbdSubscriberIdFilter,
				subscriberId);

		try {
			sbdDmo = this.base.sbdSubDets().get(filter);
		} catch (EPPIXBusinessException e) {
			logger.error("Falied to get SBD for subscriberId: " + subscriberId
					+ " " + e.getMessage());
			throw new EPPIXSeriousException("2", e.getMessage());
		} catch (EPPIXUnexpectedException e) {
			logger.error("Falied to get SBD for subscriberId: " + subscriberId
					+ " " + e.getMessage());
			throw new EPPIXSeriousException("2", e.getMessage());
		} catch (EPPIXFatalException e) {
			logger.error("Falied to get SBD for subscriberId: " + subscriberId
					+ " " + e.getMessage());
			throw new EPPIXSeriousException("2", e.getMessage());
		}

		return sbdDmo;
	}
	
	private SbaSubAuxDMO getSba(Integer subscriberId)throws EPPIXSeriousException{
		
		SbaSubAuxDMO sbaDmo = null;
		
		QueryFilter filter = new QueryFilter();
		filter.add(FilterOp.EQUAL, SbaSubAuxDMO.sbaSubscriberIdFilter,	subscriberId);

		try {
			sbaDmo = this.base.sbaSubAux().get(filter);
		} catch (EPPIXBusinessException e) {
			logger.error("Falied to get SBA for subscriberId: " + subscriberId
					+ " " + e.getMessage());
			throw new EPPIXSeriousException("2", e.getMessage());
		} catch (EPPIXUnexpectedException e) {
			logger.error("Falied to get SBA for subscriberId: " + subscriberId
					+ " " + e.getMessage());
			throw new EPPIXSeriousException("2", e.getMessage());
		} catch (EPPIXFatalException e) {
			logger.error("Falied to get SBA for subscriberId: " + subscriberId
					+ " " + e.getMessage());
			throw new EPPIXSeriousException("2", e.getMessage());
		}
		
		return sbaDmo;
	}

	private SlcustmDMO getSlcustm(String accountNo)
			throws EPPIXSeriousException {

		SlcustmDMO slDmo = null;
		QueryFilter filter = new QueryFilter();
		filter.add(FilterOp.EQUAL, SlcustmDMO.customerFilter, accountNo);

		try {
			slDmo = this.base.slcustm().get(filter);
		} catch (EPPIXBusinessException e) {
			logger.error("Falied to get SBD for account: " + accountNo + " "
					+ e.getMessage());
			throw new EPPIXSeriousException("2", e.getMessage());
		} catch (EPPIXUnexpectedException e) {
			logger.error("Falied to get SBD for account: " + accountNo + " "
					+ e.getMessage());
			throw new EPPIXSeriousException("2", e.getMessage());
		} catch (EPPIXFatalException e) {
			logger.error("Falied to get SBD for account: " + accountNo + " "
					+ e.getMessage());
			throw new EPPIXSeriousException("2", e.getMessage());
		}

		return slDmo;
	}


	private void createSbdHistory(Integer subscriberId, String histCode,
			String oldValue, String newValue, String userId, String host)
			throws EPPIXSeriousException {

		/**
		 * Update History for SPUL
		 * 
		 */
		SbhSubHistoryDMO sbhDMO = new SbhSubHistoryDMO();
		sbhDMO.setSbhSubscriberId(subscriberId);
		sbhDMO.setSbhFieldId(0);
		sbhDMO.setSbhHistCode(histCode);
		sbhDMO.setSbhOldValue(oldValue);
		sbhDMO.setSbhNewValue(newValue);
		sbhDMO.setSbhUserId(userId);
		sbhDMO.setSbhTerminalId(host);
		sbhDMO.setSbhTimestamp(new DateTime());

		try {
			base.sbhSubHistory().create(sbhDMO);
		} catch (EPPIXBusinessException e) {

			logger.error("Exception insert new subscriber history record for subscriber: "
					+ subscriberId + " Exception: " + e);
			throw new EPPIXSeriousException(
					"Exception insert new subscriber history record for subscriber: "
							+ subscriberId + " Exception: " + e);
		} catch (EPPIXUnexpectedException e) {

			logger.error("Exception insert new subscriber history record for subscriber: "
					+ subscriberId + " Exception: " + e);
			throw new EPPIXSeriousException(
					"Exception insert new subscriber history record for subscriber: "
							+ subscriberId + " Exception: " + e);
		} catch (EPPIXFatalException e) {

			logger.error("Exception insert new subscriber history record for subscriber: "
					+ subscriberId + " Exception: " + e);
			throw new EPPIXSeriousException(
					"Exception insert new subscriber history record for subscriber: "
							+ subscriberId + " Exception: " + e);
		}

	}

	private void createMshMsisdnHistory(Integer subscriberId, String msisdnNo,
			String histCode, String comment, String userId, String host)
			throws EPPIXSeriousException {

		MshMsisdnHistoryDMO mshMsisdnHistoryDMO = new MshMsisdnHistoryDMO();
		mshMsisdnHistoryDMO.setMshSubscriberId(subscriberId);
		mshMsisdnHistoryDMO.setMshMsisdnNo(msisdnNo);
		mshMsisdnHistoryDMO.setMshHistCode(histCode);
		mshMsisdnHistoryDMO.setMshComment(comment);
		mshMsisdnHistoryDMO.setMshUserId(userId);
		mshMsisdnHistoryDMO.setMshTerminalId(host);
		mshMsisdnHistoryDMO.setMshTimestamp(new DateTime());

		try {

			base.mshMsisdnHistory().create(mshMsisdnHistoryDMO);
		} catch (EPPIXBusinessException e) {
			logger.error("Exception creating MSH for MSISDN: " + msisdnNo
					+ " EXCEPTION: " + e);
		} catch (EPPIXUnexpectedException e) {
			logger.error("Exception creating MSH for MSISDN: " + msisdnNo
					+ " EXCEPTION: " + e);

		} catch (EPPIXFatalException e) {
			logger.error("Exception creating MSH for MSISDN: " + msisdnNo
					+ " EXCEPTION: " + e);

		}

	}

	private void createSimHistory(Integer subscriberId, String simNo,
			String scode, String sval, String userName, String hostName)
			throws EPPIXSeriousException {

		thrower.ifParameterMissing("subscriberId", subscriberId);
		thrower.ifParameterMissing("simNo", simNo);
		thrower.ifParameterMissing("scode", scode);
		thrower.ifParameterMissing("sval", sval);

		SmhSimHistoryDMO smhDMO = new SmhSimHistoryDMO();
		smhDMO.setSmhComment(sval);
		smhDMO.setSmhHistCode(scode);
		smhDMO.setSmhSubscriberId(subscriberId);
		smhDMO.setSmhSimNo(simNo);
		smhDMO.setSmhUserId(userName);
		smhDMO.setSmhTerminalId(hostName);
		smhDMO.setSmhTimestamp(new DateTime());

		try {

			base.smhSimHistory().create(smhDMO);
		} catch (EPPIXBusinessException e) {
			logger.fatal("Insert into smhSimHistory FAILED for SIM: " + simNo
					+ " EXCEPTION: " + e);
			throw new EPPIXSeriousException("2",
					"Insert into smhSimHistory FAILED for SIM: " + simNo
							+ " EXCEPTION: " + e);
		} catch (EPPIXUnexpectedException e) {
			logger.fatal("Insert into smhSimHistory FAILED for SIM: " + simNo
					+ " EXCEPTION: " + e);
			throw new EPPIXSeriousException("2",
					"Insert into smhSimHistory FAILED for SIM: " + simNo
							+ " EXCEPTION: " + e);
		} catch (EPPIXFatalException e) {
			logger.fatal("Insert into smhSimHistory FAILED for SIM: " + simNo
					+ " EXCEPTION: " + e);
			throw new EPPIXSeriousException("2",
					"Insert into smhSimHistory FAILED for SIM: " + simNo
							+ " EXCEPTION: " + e);
		}
	}

	public BigDecimal getCrbaDiscountRiskAux(String accountNo)
			throws EPPIXSeriousException {

		BigDecimal crbaValue = null;
		CrbaCustRiskAuxDMO crbaDMO = null;

		QueryFilter filter = new QueryFilter();
		filter.add(FilterOp.EQUAL, CrbaCustRiskAuxDMO.crbaBillAcNoFilter,
				accountNo);

		try {
			crbaDMO = base.crbaCustRiskAux().get(filter);
		} catch (EPPIXBusinessException e) {
			logger.debug("Failed to discount value for account: " + accountNo
					+ " " + e.getMessage());
			throw new EPPIXSeriousException(
					"Failed to discount value for account: " + accountNo + " "
							+ e.getMessage());
		} catch (EPPIXUnexpectedException e) {
			logger.debug("Failed to discount value for account: " + accountNo
					+ " " + e.getMessage());
			throw new EPPIXSeriousException(
					"Failed to discount value for account: " + accountNo + " "
							+ e.getMessage());
		} catch (EPPIXFatalException e) {
			logger.debug("Failed to discount value for account: " + accountNo
					+ " " + e.getMessage());
			throw new EPPIXSeriousException(
					"Failed to discount value for account: " + accountNo + " "
							+ e.getMessage());
		}

		if (crbaDMO != null) {
			if (crbaDMO.getCrbaAccDiscVal().intValue() < 0) {
				crbaValue = crbaDMO.getCrbaAccDiscVal().negate();
			} else {
				crbaValue = crbaDMO.getCrbaAccDiscVal();
			}

		}

		return crbaValue;
	}
	
	public void updateCrbCustRiskBal(String accountNo, BigDecimal creditLimit)
			throws EPPIXSeriousException {

		QueryFilter filter = new QueryFilter();
		filter.add(FilterOp.SET, CrbCustRiskBalDMO.crbCreditLimitFilter, creditLimit);
		filter.add(FilterOp.EQUAL, CrbCustRiskBalDMO.crbBillAcNoFilter,
				accountNo);

		try {
			base.crbCustRiskBal().modify(filter);
		} catch (EPPIXBusinessException e) {
			logger.debug("Failed to update crb credit for account: " + accountNo
					+ " " + e.getMessage());
			throw new EPPIXSeriousException(
					"Failed to update crb credit for account: " + accountNo + " "
							+ e.getMessage());
		} catch (EPPIXUnexpectedException e) {
			logger.debug("Failed to update crb credit for account: " + accountNo
					+ " " + e.getMessage());
			throw new EPPIXSeriousException(
					"Failed to update crb credit for account: " + accountNo + " "
							+ e.getMessage());
		} catch (EPPIXFatalException e) {
			logger.debug("Failed to update crb credit for account: " + accountNo
					+ " " + e.getMessage());
			throw new EPPIXSeriousException(
					"Failed to update crb credit for account: " + accountNo + " "
							+ e.getMessage());
		}

	}

	public void createCuhCustHistory(String account, String histCode,
			String oldValue, String newValue, String userId, String host)
			throws EPPIXSeriousException {

		CuhCustomerHistoryDMO cuhDMO = new CuhCustomerHistoryDMO();
		cuhDMO.set(account, 0, histCode, oldValue, newValue, userId, host,
				new DateTime());

		try {

			base.cuhCustomerHistory().create(cuhDMO);
		} catch (EPPIXBusinessException e) {
			logger.error("Exception creating CUK for Customer: " + account
					+ " EXCEPTION: " + e);
		} catch (EPPIXUnexpectedException e) {
			logger.error("Exception creating CUK for Customer: " + account
					+ " EXCEPTION: " + e);

		} catch (EPPIXFatalException e) {
			logger.error("Exception creating CUK for Customer: " + account
					+ " EXCEPTION: " + e);

		}
	}

	private Integer createVcfVrbleChrgFee(String accountNo, Integer subscriberId, String uniqueDeviseId, String deviceMake, String deviceModel,
			String policyRefNo, BigDecimal deviceCoverBand, BigDecimal monthlyCharge, String nextBcyPeriod, String nextyearRun, String chargeCode) throws EPPIXSeriousException{
	
	VcfVrbleChrgFeeDMO vcfVrbleChrgFeeDMO = new VcfVrbleChrgFeeDMO();
	VcfVrbleChrgFeeDMO returnedVcfVrbleChrgFeeDMO = null;
	
	vcfVrbleChrgFeeDMO.setVcfEquipId(0);
	vcfVrbleChrgFeeDMO.setVcfCustomer(accountNo);
	vcfVrbleChrgFeeDMO.setVcfSubscriberId(subscriberId);
	vcfVrbleChrgFeeDMO.setVcfVariableType("SR");
	vcfVrbleChrgFeeDMO.setVcfProductCode((uniqueDeviseId == null) ? "" : uniqueDeviseId);	
	vcfVrbleChrgFeeDMO.setVcfDescription("INSURANCE");
	vcfVrbleChrgFeeDMO.setVcfMake(deviceMake);
	vcfVrbleChrgFeeDMO.setVcfModel(deviceModel);
	vcfVrbleChrgFeeDMO.setVcfInventryItemid(policyRefNo);
	vcfVrbleChrgFeeDMO.setVcfStartDate(new Date());
	vcfVrbleChrgFeeDMO.setVcfEndDate(null);
	vcfVrbleChrgFeeDMO.setVcfContrcLength(0);
	vcfVrbleChrgFeeDMO.setVcfFullAmt(deviceCoverBand.doubleValue());
	vcfVrbleChrgFeeDMO.setVcfMonthAmt(monthlyCharge.doubleValue());
	vcfVrbleChrgFeeDMO.setVcfNextPeriod(nextBcyPeriod);
	vcfVrbleChrgFeeDMO.setVcfNextYear(nextyearRun);
	vcfVrbleChrgFeeDMO.setVcfRemAmt(0.00);
	vcfVrbleChrgFeeDMO.setVcfRemPeriod(new Short("0"));
	
	if(this.chargeCode != null && this.chargeCode.length() > 0){		
		vcfVrbleChrgFeeDMO.setVcfChargeCode(this.chargeCode);
	}else{
		vcfVrbleChrgFeeDMO.setVcfChargeCode("INSR");
	}
		
	
	vcfVrbleChrgFeeDMO.setVcfStatus("A");
	vcfVrbleChrgFeeDMO.setVcfTimestamp(new Date());


	try {
			returnedVcfVrbleChrgFeeDMO = base.vcfVrbleChrgFee().create(
					vcfVrbleChrgFeeDMO);
			
			if(returnedVcfVrbleChrgFeeDMO == null){
				logger.error("Failed to create VCF record for insurance: Account: " + accountNo);
				throw new EPPIXSeriousException("2", "Failed to create VCF record for insurance: Account: " + accountNo);
			}
		} catch (Exception e) {
			e.printStackTrace();
			logger.error(e.getMessage());
			throw new EPPIXSeriousException("2", e.getMessage());
		} 
	this.returnedVcfDMO = returnedVcfVrbleChrgFeeDMO;
	return returnedVcfVrbleChrgFeeDMO.getVcfEquipId();
	
	}

	/**
	 * Change 25-11-2019
	 * 
	 * @param subscriberId
	 * @param endDate
	 * @param policyRef
	 * @param uniqueDeviseId
	 * @throws EPPIXSeriousException
	 */
//	public void updateVcfInsurance(Integer subscriberId, Date endDate, String policyRef, String uniqueDeviseId)throws EPPIXSeriousException{
	public void updateVcfInsurance(Integer subscriberId, Integer vcfEquiptid,  Date endDate)throws EPPIXSeriousException{
		
		QueryFilter filter = new QueryFilter();

		filter.add(FilterOp.SET, VcfVrbleChrgFeeDMO.vcfStatusFilter, "I");
		filter.add(FilterOp.SET, VcfVrbleChrgFeeDMO.vcfEndDateFilter, endDate);
		filter.add(FilterOp.SET, VcfVrbleChrgFeeDMO.vcfTimestampFilter, new DateTime());
		filter.add(FilterOp.EQUAL, VcfVrbleChrgFeeDMO.vcfSubscriberIdFilter, subscriberId);
		filter.add(FilterOp.EQUAL, VcfVrbleChrgFeeDMO.vcfEquipIdFilter, vcfEquiptid);
//		filter.add(FilterOp.EQUAL, VcfVrbleChrgFeeDMO.vcfInventryItemidFilter, policyRef);
//		filter.add(FilterOp.EQUAL, VcfVrbleChrgFeeDMO.vcfProductCodeFilter, uniqueDeviseId);

		try {
			base.vcfVrbleChrgFee().modify(filter);
		} catch (Exception e) {
			logger.error(e.getMessage());
			throw new EPPIXSeriousException("2", e.getMessage());
		} 
		
	}
	
	public BigDecimal getSubscriberDiscountTotal(String accountNo){
		
		GetServiceDiscount service = null;
		String servicesAll = "";
		ServiceDiscount serviceDisc = null;
		
		try {
			service = base.getServiceDiscount();
			service.setBase(base);
			service.setConnection(this.getConnection());
		} catch (EPPIXFatalException e) {
			logger.error(e.getMessage());
		}
		
		// Get all the subscribers for the account.
		
		DAOIterator sbdIt = null;
		
		QueryFilter filter = new QueryFilter();
		filter.add(FilterOp.EQUAL, SbdSubDetsDMO.sbdBillAcNoFilter, accountNo);
		
		
		try {
			sbdIt = base.sbdSubDets().iterate(filter);
		} catch (EPPIXBusinessException e) {
			logger.error("Failed to get the subscribers for account: " + accountNo);	
			return null;
		} catch (EPPIXUnexpectedException e) {
			logger.error("Failed to get the subscribers for account: " + accountNo);
			return null;
		} catch (EPPIXFatalException e) {
			logger.error("Failed to get the subscribers for account: " + accountNo);
			return null;
		}
		
		BigDecimal totalDiscount  = new BigDecimal("0.00");
		DAOIterator vasIT = null;
		
		while(sbdIt.hasNext()){
			
			SbdSubDetsDMO sbdDmo = (SbdSubDetsDMO)sbdIt.next();
			servicesAll = "";
			
			vasIT = this.getSubscriberServices(sbdDmo.getSbdSubscriberId());
			BigDecimal discount = null;	
			while(vasIT != null && vasIT.hasNext()){
				VasActiveServiceDMO vasDmo = (VasActiveServiceDMO)vasIT.next();
				servicesAll = servicesAll + vasDmo.getVasServiceCode() + ",";
			}
			
			logger.debug("\nService all for subscriber: " + sbdDmo.getSbdSubscriberId() + ": "+ servicesAll);
			
			if (servicesAll != null && servicesAll.length() > 0) {

				try {
					serviceDisc = service.getCustomerServiceDiscount(
							sbdDmo.getSbdSubscriberId(), null,
							sbdDmo.getSbdPackageCode(),
							sbdDmo.getSbdTariffPlan(), servicesAll,
							new Integer("0"));
					discount = serviceDisc.getTotalDiscount();
				} catch (EPPIXSeriousException e) {
					logger.error("Failed to get discount for subscriber: "
							+ sbdDmo.getSbdSubscriberId());
					continue;
				}

				if (discount != null) {
					totalDiscount = totalDiscount.add(discount);
				}
			}
		}

		return totalDiscount;
	}
	
	private DAOIterator getSubscriberServices(Integer subscriberId){
		
		DAOIterator vasIt = null;
		
		QueryFilter filter = new QueryFilter();
		filter.add(FilterOp.EQUAL, VasActiveServiceDMO.vasSubscriberIdFilter, subscriberId);
		
		try {
			vasIt = base.vasActiveService().iterate(filter);
		} catch (EPPIXBusinessException e) {
			logger.error(e.getMessage());
		} catch (EPPIXUnexpectedException e) {
			logger.error(e.getMessage());
		} catch (EPPIXFatalException e) {
			logger.error(e.getMessage());
		}
		
		return vasIt;
	}
	
	/**
	 * 
	 * @param vcfEquipId
	 * @param prorataDate
	 * @param type
	 * @throws EPPIXSeriousException
	 */
	public void generateVariableProrataFee(Integer vcfEquipId, Date prorataDate, String type)throws EPPIXSeriousException{
		
		
		this.thrower.ifParameterMissing("vcfEquipId", vcfEquipId);
		this.thrower.ifParameterMissing("type", type);
		
		if(prorataDate == null){
			prorataDate = new Date();
		}
		
		if(!"A".equals(type) && !"D".equals(type)){
			try {
				thrower.business(INSU_000116);
			} catch (EPPIXBusinessException e) {
				throw new EPPIXSeriousException(e.getErrorCode(), e.getMessage());
			}
		}
	
//		BcyBillingCycleDMO bcyDmo = null;
//		VcfVrbleChrgFeeDMO vcfDmo = null;
		SbaSubAuxDMO sbaDmo = null;
		ChgChargesDMO chgDmo = null;
		SlcustmDMO slDmo = null;
		CnyCurrencyDMO cnyDMO = null;
		SksKeySettingDMO sksDmo = null;
		OpservmDMO opservmDmo = null;
		BillCccccyyyymmddDMO billDMO = null;

		String histCode = "";
		String histText = "";
		
		Date billFrom = null;
		Date billTo = null;
		Date chgEndPeriod = null;
		Date chgStartperiod = null;
		Date endDate = null;
		Date startDate = null;
		
		BigDecimal factor = null;
		BigDecimal factor2 = null;
		BigDecimal prorataCost = null;
		BigDecimal proratValue = null;

		BigDecimal daysActive = null;
		BigDecimal dayperiod = null;
		Integer fullperiods = null;
		Integer maxSubs = null;
		Integer servprov = null;

		int cnt = 0;
		String period = null;
		String year = null;
		

				endDate = this.bcyDMO.getBcyNextRun();
				
//				c.	Fetch chg_charges for Fixed Charges
				if(this.returnedVcfDMO.getVcfChargeCode().length() > 0){
					chgDmo = this.subService.getChg(this.returnedVcfDMO.getVcfChargeCode(), "M1", prorataDate, null, "F");
					
					if(chgDmo.getChgCode() == null || chgDmo.getChgCode().length() <= 0){
						try {
							thrower.business(INSU_000114);
						} catch (EPPIXBusinessException e) {
							throw new EPPIXSeriousException(e.getErrorCode(), e.getMessage());
						}
					}

					opservmDmo = this.subService.getOpservm(chgDmo.getChgNcode());

					if(opservmDmo == null){
						try {
							thrower.business(INSU_000116);
						} catch (EPPIXBusinessException e) {
							throw new EPPIXSeriousException(e.getErrorCode(), e.getMessage());
						}
					}
					
				}else{
					try {
						thrower.business(INSU_000115);
					} catch (EPPIXBusinessException e) {
						throw new EPPIXSeriousException(e.getErrorCode(), e.getMessage());
					}
				}

//				-- Set billing dates
				if(prorataDate.after(endDate)){
//					if("D".equals(type)){
//						billFrom = endDate;
//						billTo = prorataDate;
////							-- Move one period backwards
//						chgEndPeriod = this.subService.shiftPeriod(
//								this.bcyDMO.getBcyNextRun(), 
//								chgDmo.getChgPeriod(), 
//								chgDmo.getChgFrequency(), 
//								this.bcyDMO.getBcyDayOfRun(), "F");
//					}else{

						billFrom = prorataDate;
						billTo = endDate;
						billTo = billTo.addMonths(1, billTo);
						billTo = billTo.addDays(-1, billTo);
						prorataDate = billTo;
//							-- Move one period backwards
						chgEndPeriod = this.subService.shiftPeriod(
								this.bcyDMO.getBcyNextRun(), 
								chgDmo.getChgPeriod(), 
								chgDmo.getChgFrequency(), 
								this.bcyDMO.getBcyDayOfRun(), "F");
//					}
				}else if(prorataDate.before(endDate)){
					billFrom = prorataDate;
					billTo = endDate;
					billTo = billTo.addDays(-1, billTo);
					chgEndPeriod = this.bcyDMO.getBcyNextRun();
					
				}else if(prorataDate.equals(endDate)){
					/**
					 * When l_prorata_date = l_end_date – No Prorata Applicable
					 * i.    N.B. As a new vcf_vrble_chrg_fee Record is Inserted on Activation, 
					 * the Variable_ChargeCalculate Routines will Calculate 
					 * and Insert the Required Charge into the Bill Table
					 *
					 * ii.    Exit Prorata Generation i.e. No Prorata Applicable
					 * 
					 */
					return;
//					if("D".equals(type)){
//						billFrom = endDate;
//						billFrom = billFrom.addDays(-1, billFrom);
//						billTo = this.bcyDMO.getBcyNextRun();
//					}else{
//						
//						billFrom = prorataDate;
//						billTo = endDate;
//						billTo = billTo.addMonths(1, billTo);
//						billTo = billTo.addDays(-1, billTo);
//						prorataDate = billTo;
//						
//						chgEndPeriod = this.subService.shiftPeriod(
//								this.bcyDMO.getBcyNextRun(), 
//								chgDmo.getChgPeriod(), 
//								chgDmo.getChgFrequency(), 
//								this.bcyDMO.getBcyDayOfRun(), "F");
//					}
//							CALL DebugLog(l_chg_end_period)
//						END IF #INC000002610869 - END
//						#INC000002610869 EXIT WHILE
//				END CASE
				}
//
				/**
				 * Start Charge Period (For activation)
 					i.    Move one period backwards
 					ii.    LET  l_chg_start_period = shift_period(l_chg_end_period, l_chg.chg_period, l_chg.chg_frequency, l_bcy.bcy_day_of_run, "B")
				 */
				
//				if("A".equals(type)){
					chgStartperiod = this.subService.shiftPeriod(
					chgEndPeriod, 
					chgDmo.getChgPeriod(), 
					chgDmo.getChgFrequency(), 
					this.bcyDMO.getBcyDayOfRun(), "B");
//				}
				
				startDate = billFrom;

				chgDmo.setChgValue(this.returnedVcfDMO.getVcfMonthAmt());

//				-- Set up the common bill_cccccyyyymmdd table details for insertion
				
				billDMO = new BillCccccyyyymmddDMO();
				billDMO.setSubscriberId(this.sbdDMO.getSbdSubscriberId());
				billDMO.setHandset(this.sbdDMO.getSbdDiallingNo());
				billDMO.setBillind("n");
				billDMO.setBilldat(new Date());
				billDMO.setInvoiceNo("0");
				billDMO.setVatamt(new BigDecimal("0.00"));
				billDMO.setVatrate(new BigDecimal("0.00"));
				billDMO.setCycleNo(this.sbdDMO.getSbdBillCycle());
				billDMO.setVatcode("");
				billDMO.setStartPeriod(billFrom);
				billDMO.setEndPeriod(billTo);
				billDMO.setBatchRunNum(null);
				
				billDMO.setTwinbillNo(new Short("0"));
				billDMO.setCurrencyCharge(new BigDecimal("0.00"));
				billDMO.setExchangeRate(new BigDecimal("0.00"));
				billDMO.setExchOperator("");

				factor = new BigDecimal("0.00");
				factor2 = new BigDecimal("0.00");

				/**
				 * Did this when chg is called, no point to do all the work of we are not going to procceed.
//				-- Move onto next charge if current charge code is NULL
//				IF LENGTH(l_chg.chg_code) = 0 THEN
//					EXIT WHILE
//				END IF
				 * 
				 */
				

//				-- Set number of full periods to 0
				fullperiods = new Integer(0);
				

//				chgEndPeriod = this.subService.shiftPeriod(
//						chgEndPeriod, 
//						chgDmo.getChgPeriod(), 
//						chgDmo.getChgFrequency(), 
//						this.bcyDMO.getBcyDayOfRun(), "B");
				
//
//					-- Check if prorata date falls within range
				/**
				 * 6.	Check if Prorata Date Within Range
						a.	When p_prorata_date >= l_chg_start_period 
						i.	LET l_full_periods = 0
						b.	When p_prorata_date Not >= l_chg_start_period 
						i.	LET l_full_periods = l_full_periods + 1
				 */
				if((prorataDate.equals(chgStartperiod)) || (prorataDate.after(chgStartperiod))){
					fullperiods = new Integer(0);
				}
				
				if(prorataDate.before(chgStartperiod)){
					fullperiods = new Integer(fullperiods.intValue() + 1);
				}

				dayperiod = new BigDecimal(chgEndPeriod.differenceInDays(chgStartperiod, chgEndPeriod));
				daysActive = new BigDecimal(billTo.differenceInDays(billFrom, billTo) + 1);

				logger.debug("\nchgStartperiod: " + chgStartperiod.toString()
						+ "\nchgEndPeriod: " + chgEndPeriod.toString()
						+ "\nbillFrom: " + billFrom.toString()
						+ "\nbillTo: " + billTo.toString()
						+ "\ndaysActive: " + daysActive
						+ "\ndayperiod: " + dayperiod);

				if(dayperiod == null || dayperiod.intValue() == 0){
					factor = new BigDecimal("0.00");
					/**
					 * Exit Prorata Calculation - No Prorata Appplicable
					 */
					return;
				}else{
					factor = ((daysActive.divide(dayperiod, 6, RoundingMode.HALF_UP)).add(new BigDecimal(fullperiods.toString()))).setScale(4, RoundingMode.HALF_UP);
				}
				
				logger.debug("\nfactor: " + factor);

//				-- Calculate prorated charge & cost
				proratValue = new BigDecimal(this.returnedVcfDMO.getVcfMonthAmt()).multiply(new BigDecimal(factor.toString()));
				prorataCost = new BigDecimal("0.00");

				logger.debug("\nproratValue: " + proratValue.toString());

				if(proratValue.intValue() > 0 && "D".equals(type)){
					proratValue = proratValue.multiply(new BigDecimal("-1"));
				}

				logger.debug("\nproratValue: " + proratValue.toString());

//				-- Set details specific to this charge for bill_cccccyyyymmdd & insert
				billDMO.setChaserv(chgDmo.getChgNcode());

				billDMO.setCost(prorataCost.setScale(2, RoundingMode.HALF_UP));
				billDMO.setCharge(proratValue.setScale(2, RoundingMode.HALF_UP));
				billDMO.setChargeClassId(chgDmo.getChgClassId());

				billDMO.setExchangeRate(new BigDecimal("1.00"));
				billDMO.setExchOperator("*");
				
				try {
					sbaDmo = this.getSba(this.sbdDMO.getSbdSubscriberId());
				} catch (EPPIXSeriousException e1) {
					try {
						thrower.business(INSU_000102);
					} catch (EPPIXBusinessException e) {
						throw new EPPIXSeriousException(e.getErrorCode(), e.getMessage());
					}
				}
				
				if(sbaDmo == null){
					try {
						thrower.business(INSU_000102);
					} catch (EPPIXBusinessException e) {
						throw new EPPIXSeriousException(e.getErrorCode(), e.getMessage());
					}
				}
				
				try {
					slDmo = this.getSlcustm(sbaDmo.getSbaInvAccount());
				} catch (EPPIXSeriousException e1) {
					try {
						thrower.business(INSU_000103, sbaDmo.getSbaInvAccount());
					} catch (EPPIXBusinessException e) {
						throw new EPPIXSeriousException(e.getErrorCode(), e.getMessage());
					}
				}
				
				if(slDmo == null){
					try {
						thrower.business(INSU_000118);
					} catch (EPPIXBusinessException e) {
						throw new EPPIXSeriousException(e.getErrorCode(), e.getMessage());
					}
				}
				
				if(slDmo.getCurrency() != null
						&& slDmo.getCurrency().length() > 0){

					QueryFilter filter = new QueryFilter();
					filter = new QueryFilter();
					filter.add(FilterOp.EQUAL, CnyCurrencyDMO.cnyCurrencyRefFilter,
							this.slDMO.getCurrency());

					try {
						cnyDMO = base.cnyCurrency().get(filter);

					} catch (EPPIXBusinessException e) {
						logger.error("Exception getting CNY record for currency: "
								+ slDmo.getCurrency() + " EXCEPTION: " + e);
						throw new EPPIXSeriousException(
								"Exception getting CNY record for currency: "
										+ slDmo.getCurrency() + " EXCEPTION: " + e);
					} catch (EPPIXUnexpectedException e) {
						logger.error("Exception getting CNY record for currency: "
								+ slDmo.getCurrency() + " EXCEPTION: " + e);
						throw new EPPIXSeriousException(
								"Exception getting CNY record for currency: "
										+ slDmo.getCurrency() + " EXCEPTION: " + e);
					} catch (EPPIXFatalException e) {
						logger.error("Exception getting CNY record for currency: "
								+ slDmo.getCurrency() + " EXCEPTION: " + e);
						throw new EPPIXSeriousException(
								"Exception getting CNY record for currency: "
										+ slDmo.getCurrency() + " EXCEPTION: " + e);
					}

					if (cnyDMO == null) {
						billDMO.setCurrencyCharge(billDMO.getCharge());
					} else {

						if (cnyDMO.getCnyOperator().equals("/")) {
							billDMO.setCurrencyCharge(billDMO.getCharge().divide(
									cnyDMO.getCnyExchangeRate()));
							billDMO.setExchOperator("/");
						} else {
							billDMO.setCurrencyCharge(billDMO.getCharge().multiply(
									cnyDMO.getCnyExchangeRate()));
						}
						billDMO.setExchangeRate(cnyDMO.getCnyExchangeRate());
					}

				}else{
					billDMO.setCurrencyCharge(billDMO.getCharge());
				}

				billDMO.setTechnology("GSM");
				billDMO.setPackge(sbdDMO.getSbdPackageCode());
				histCode = "SVRCHG";
				billDMO.setSparech("CFA " + histCode + "         " + this.returnedVcfDMO.getVcfEquipId());

				Integer serialId;
				try {
					/*
					 * INC000002784664
					 */
					serialId = this.insertBillTable(billDMO, this.bcyDMO.getBcyNextRun(), this.sbdDMO, false);
				} catch (EPPIXFatalException e) {
					logger.error("Failed to insert prorata charges: " + e.getMessage());
					throw new EPPIXSeriousException("Failed to insert prorata charges: " + e.getMessage());
				}

				if("A".equals(type)){
					histCode = "INSAPR";
				}else{
					histCode = "INSDPR";
				}
				
				histText = "Prorated Insurance Charge Applied";
				
//				while(histText.length() < 26){
//					histText = histText + " ";
//				}
				
//				histText = histText + billDMO.getCharge().setScale(2, RoundingMode.HALF_UP);
				
				logger.debug("\nhistCode: " + histCode
						+ "\nhistText: " + histText);

				this.createMshMsisdnHistory(this.sbdDMO.getSbdSubscriberId(), this.sbdDMO.getSbdDiallingNo(), histCode, histText, this.userName, this.hostName);

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

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	
	public SlcustmDMO getSlDMO() {
		return slDMO;
	}

	public void setSlDMO(SlcustmDMO slDMO) {
		this.slDMO = slDMO;
	}

	public SbdSubDetsDMO getSbdDMO() {
		return sbdDMO;
	}

	public void setSbdDMO(SbdSubDetsDMO sbdDMO) {
		this.sbdDMO = sbdDMO;
	}

	public SubscriberUpgradeMigrade getSubService() {
		return subService;
	}

	public void setSubService(SubscriberUpgradeMigrade subService) {
		this.subService = subService;
	}

	/**
	 * 06-04-2020
	 * SJ Changed from using the generic insertBillTable used in service
	 * subscriberUpogradeMigrade to use direct function.
	 * 
	 * INC000002784664
	 * 
	 * @param billDMO
	 * @param bcyNextRun
	 * @param sbdDMO
	 * @param insertSSR
	 * @return
	 * @throws EPPIXSeriousException
	 * @throws EPPIXFatalException
	 */
	public Integer insertBillTable(BillCccccyyyymmddDMO billDMO,
			Date bcyNextRun, SbdSubDetsDMO sbdDMO, boolean insertSSR)
			throws EPPIXSeriousException, EPPIXFatalException {

		String billTable;
		Integer billRecordId;

		Integer returnVal = null;

		thrower.ifParameterMissing("BillCccccyyyymmddDMO", billDMO);

		thrower.ifParameterMissing("bcyNextRun", bcyNextRun);

		BillCccccyyyymmddDMO billCccccyyyymmddDMO = null;

		billTable = "bill_" + billDMO.getCycleNo().trim()
				+ dtFormatyyyymmddStandard.format(bcyNextRun);

		logger.info("BILL TABLE TO INSERT INTO: " + billTable);


		QueryFilter filter = new QueryFilter();
//		filter.add(FilterOp.EQUAL, BillCccccyyyymmddDMO.subscriberIdFilter,
//				billDMO.getSubscriberId());
//		filter.add(FilterOp.EQUAL, BillCccccyyyymmddDMO.chaservFilter,
//				billDMO.getChaserv());
//
//		filter.add(FilterOp.EQUAL, BillCccccyyyymmddDMO.packgeFilter,
//				billDMO.getPackge());
		boolean insert = true;

//		try {
//			billCccccyyyymmddDMO = base.billCccccyyyymmdd().get(filter,
//					billTable);

//			if (billCccccyyyymmddDMO == null) {
//				logger.error("Failed to get billing details from table: "
//						+ billTable + " for Subscriber: "
//						+ billDMO.getSubscriberId());
//				insert = true;


//		} catch (EPPIXBusinessException e) {
//			logger.error("Exception getting billing details from table: "
//					+ billTable + " for Subscriber: "
//					+ billDMO.getSubscriberId() + " EXCEPTION: " + e);
//
//			insert = true;
//		} catch (EPPIXUnexpectedException e) {
//			logger.error("Exception getting billing details from table: "
//					+ billTable + " for Subscriber: "
//					+ billDMO.getSubscriberId() + " EXCEPTION: " + e);
//			insert = true;
//		} catch (EPPIXFatalException e) {
//			logger.error("Exception getting billing details from table: "
//					+ billTable + " for Subscriber: "
//					+ billDMO.getSubscriberId() + " EXCEPTION: " + e);
//			insert = true;
//		}


//		if (insertBillSSR) {
//			/**
//			 * SJ: we have a failed SSR record and is exists is false (insert =
//			 * false), then we must simply do update
//			 * 
//			 * else if not exists, then it remains an insert.
//			 * 
//			 */
//			if (!insert) {
//				insert = true;
//			}
//		}

		if (insert) {
			try {
				billDMO = base.billCccccyyyymmdd().create(billDMO, billTable);

				logger.debug("\nRETURNED DMO FROM INSERT BILLID: "
						+ billDMO.getBillId());

			} catch (EPPIXSeriousException e) {
				logger.error("Exception inserting billing details to table: "
						+ billTable + " for Subscriber: "
						+ billDMO.getSubscriberId() + " EXCEPTION: " + e);
				throw new EPPIXFatalException(
						"Exception inserting new billing details to table: "
								+ billTable + " for Subscriber: "
								+ billDMO.getSubscriberId() + " EXCEPTION: "
								+ e);
			} catch (EPPIXBusinessException e) {
				logger.error("Exception inserting billing details to table: "
						+ billTable + " for Subscriber: "
						+ billDMO.getSubscriberId() + " EXCEPTION: " + e);
				throw new EPPIXFatalException(
						"Exception inserting new billing details to table: "
								+ billTable + " for Subscriber: "
								+ billDMO.getSubscriberId() + " EXCEPTION: "
								+ e);
			} catch (EPPIXUnexpectedException e) {

				logger.error("Exception inserting new billing details to table: "
						+ billTable
						+ " for Subscriber: "
						+ billDMO.getSubscriberId() + " EXCEPTION: " + e);
				throw new EPPIXFatalException(
						"Exception inserting new billing details to table: "
								+ billTable + " for Subscriber: "
								+ billDMO.getSubscriberId() + " EXCEPTION: "
								+ e);
			} catch (EPPIXFatalException e) {
				logger.error("Exception inserting new billing details to table: "
						+ billTable
						+ " for Subscriber: "
						+ billDMO.getSubscriberId() + " EXCEPTION: " + e);
				throw new EPPIXFatalException(
						"Exception inserting new billing details to table: "
								+ billTable + " for Subscriber: "
								+ billDMO.getSubscriberId() + " EXCEPTION: "
								+ e);
			}

		} 
//		else {
//
//			filter = new QueryFilter();
//
//			filter.add(FilterOp.SET, BillCccccyyyymmddDMO.billdatFilter,
//					billDMO.getBilldat());
//			filter.add(FilterOp.SET, BillCccccyyyymmddDMO.billindFilter,
//					billDMO.getBillind());
//			filter.add(FilterOp.SET, BillCccccyyyymmddDMO.chargeClassIdFilter,
//					billDMO.getChargeClassId());
//			filter.add(FilterOp.SET, BillCccccyyyymmddDMO.chargeFilter,
//					billDMO.getCharge());
//			filter.add(FilterOp.SET, BillCccccyyyymmddDMO.chaservFilter,
//					billDMO.getChaserv());
//
//			filter.add(FilterOp.SET, BillCccccyyyymmddDMO.currencyChargeFilter,
//					billDMO.getCurrencyCharge());
//			filter.add(FilterOp.SET, BillCccccyyyymmddDMO.cycleNoFilter,
//					billDMO.getCycleNo());
//			filter.add(FilterOp.SET, BillCccccyyyymmddDMO.endPeriodFilter,
//					billDMO.getEndPeriod());
//			filter.add(FilterOp.SET, BillCccccyyyymmddDMO.exchangeRateFilter,
//					billDMO.getExchangeRate());
//			filter.add(FilterOp.SET, BillCccccyyyymmddDMO.exchOperatorFilter,
//					billDMO.getExchOperator());
//			filter.add(FilterOp.SET, BillCccccyyyymmddDMO.handsetFilter,
//					billDMO.getHandset());
//			filter.add(FilterOp.SET, BillCccccyyyymmddDMO.invoiceNoFilter,
//					billDMO.getInvoiceNo());
//			filter.add(FilterOp.SET, BillCccccyyyymmddDMO.packgeFilter,
//					billDMO.getPackge());
//			filter.add(FilterOp.SET, BillCccccyyyymmddDMO.sparechFilter,
//					billDMO.getSparech());
//			filter.add(FilterOp.SET, BillCccccyyyymmddDMO.startPeriodFilter,
//					billDMO.getStartPeriod());
//			filter.add(FilterOp.SET, BillCccccyyyymmddDMO.subscriberIdFilter,
//					billDMO.getSubscriberId());
//			filter.add(FilterOp.SET, BillCccccyyyymmddDMO.technologyFilter,
//					billDMO.getTechnology());
//			filter.add(FilterOp.SET, BillCccccyyyymmddDMO.timestampFilter,
//					billDMO.getTimestamp());
//			filter.add(FilterOp.SET, BillCccccyyyymmddDMO.twinbillNoFilter,
//					billDMO.getTwinbillNo());
//			filter.add(FilterOp.SET, BillCccccyyyymmddDMO.vatamtFilter,
//					billDMO.getVatamt());
//			filter.add(FilterOp.SET, BillCccccyyyymmddDMO.vatcodeFilter,
//					billDMO.getVatcode());
//			filter.add(FilterOp.SET, BillCccccyyyymmddDMO.vatrateFilter,
//					billDMO.getVatrate());
//
////			filter.add(FilterOp.EQUAL, BillCccccyyyymmddDMO.billIdFilter,
////					billCccccyyyymmddDMO.getBillId());
//
//			try {
//				base.billCccccyyyymmdd().modify(filter, billTable);
//			} catch (EPPIXBusinessException e) {
//				logger.error("Exception updating billing details to table: "
//						+ billTable + " for Subscriber: "
//						+ billDMO.getSubscriberId() + " EXCEPTION: " + e);
//				throw new EPPIXFatalException(
//						"Exception updating billing details to table: "
//								+ billTable + " for Subscriber: "
//								+ billDMO.getSubscriberId() + " EXCEPTION: "
//								+ e);
//			} catch (EPPIXUnexpectedException e) {
//
//				logger.error("Exception updating billing details to table: "
//						+ billTable + " for Subscriber: "
//						+ billDMO.getSubscriberId() + " EXCEPTION: " + e);
//				throw new EPPIXFatalException(
//						"Exception updating billing details to table: "
//								+ billTable + " for Subscriber: "
//								+ billDMO.getSubscriberId() + " EXCEPTION: "
//								+ e);
//			} catch (EPPIXFatalException e) {
//				logger.error("Exception updating billing details to table: "
//						+ billTable + " for Subscriber: "
//						+ billDMO.getSubscriberId() + " EXCEPTION: " + e);
//				throw new EPPIXFatalException(
//						"Exception updating billing details to table: "
//								+ billTable + " for Subscriber: "
//								+ billDMO.getSubscriberId() + " EXCEPTION: "
//								+ e);
//			}
//		}

		billRecordId = billDMO.getBillId();


		this.subService.updateCrbCharges(sbdDMO.getSbdBillAcNo(), billDMO.getChaserv(),
				billDMO.getCharge());

		returnVal = this.subService.updateLimitDiff("C", sbdDMO.getSbdBillAcNo(), 0);

		switch (returnVal.intValue()) {

		case -1:

			logger.error("Insufficient arguments passed to c function");
			throw new EPPIXSeriousException(
					"Insufficient arguments passed to c function");
		case -2:

			logger.error("Invalid Type passed.  Only 'C' and 'S' accepted");
			throw new EPPIXSeriousException(
					"Invalid Type passed.  Only 'C' and 'S' accepted");
		case -6:

			logger.error("BillTable insert: Customer: "
					+ sbdDMO.getSbdBillAcNo() + " not found in the CRB table");
			throw new EPPIXSeriousException("BillTable insert: Cusotomer: "
					+ sbdDMO.getSbdBillAcNo() + " not found in the CRB table");
		case -7:

			logger.error("Failed to update the CRB table");
			throw new EPPIXSeriousException("Failed to update the CRB table");

		}


		BlhBillLimitHdDMO blhDMO = null;
		filter = new QueryFilter();
		filter.add(FilterOp.EQUAL, BlhBillLimitHdDMO.blhSubscriberIdFilter,
				sbdDMO.getSbdSubscriberId());

		DAOIterator blhIT = null;

		try {
			blhIT = base.blhBillLimitHd().iterate(filter);
		} catch (EPPIXBusinessException e) {
			logger.error("Exception getting BLH record for Subscriber: "
					+ sbdDMO.getSbdSubscriberId() + " " + e);
			throw new EPPIXSeriousException("1",
					"Exception getting BLH record for Subscriber: "
							+ sbdDMO.getSbdSubscriberId() + " " + e);
		} catch (EPPIXUnexpectedException e) {
			logger.error("Exception getting BLH record for Subscriber: "
					+ sbdDMO.getSbdSubscriberId() + " " + e);
			throw new EPPIXSeriousException("2",
					"Exception getting BLH record for Subscriber: "
							+ sbdDMO.getSbdSubscriberId() + " " + e);
		} catch (EPPIXFatalException e) {
			logger.error("Exception getting BLH record for Subscriber: "
					+ sbdDMO.getSbdSubscriberId() + " " + e);
			throw new EPPIXSeriousException("2",
					"Exception getting BLH record for Subscriber: "
							+ sbdDMO.getSbdSubscriberId() + " " + e);
		}

		if (blhIT == null) {
			logger.error("Failed to get BLH record for Subscriber: "
					+ sbdDMO.getSbdSubscriberId());
			throw new EPPIXSeriousException(
					"Failed to get BLH record for Subscriber: "
							+ sbdDMO.getSbdSubscriberId());
		} else {

			while (blhIT.hasNext()) {
				blhDMO = (BlhBillLimitHdDMO) blhIT.next();
				break;
			}

		}


		if(blhDMO == null) {
			logger.error("Failed to get BLH record for Subscriber: "
					+ sbdDMO.getSbdSubscriberId());
			return null;
		}

		this.subService.updateBlhCharge(billDMO.getCharge(), blhDMO);


		returnVal = this.subService.updateLimitDiff("S", sbdDMO.getSbdBillAcNo(),
				blhDMO.getBlhSubscriberId());

		switch (returnVal.intValue()) {
		case -1:

			logger.error("Insufficient arguments passed to c function");
			throw new EPPIXSeriousException(
					"Insufficient arguments passed to c function");
		case -2:

			logger.error("Invalid Type passed.  Only 'C' and 'S' accepted");
			throw new EPPIXSeriousException(
					"Invalid Type passed.  Only 'C' and 'S' accepted");
		case -6:

			logger.error("BillTable_Ins2: Customer, " + sbdDMO.getSbdBillAcNo()
					+ " not found in the CRB table");
			throw new EPPIXSeriousException("BillTable_Ins2: Customer, "
					+ sbdDMO.getSbdBillAcNo() + " not found in the CRB table");
		case -7:

			logger.error("Failed to update the CRB table");
			throw new EPPIXSeriousException("Failed to update the CRB table");
		}

		return billRecordId;
	}

	public Integer insuranceProductModify(
			 String userName,
			 String language,
			 String hostname,
			 String policyRef,
			 Integer subscriberId,
			 String msisdn,
			 String deviceId,
			 String deviceIMEI,
			 String deviceMake,
			 String deviceModel,
			 BigDecimal deviceCoverBand,
			 BigDecimal monthlyVarCharge,
			 String chargeCode,
			 DateTime instructionDateTime)  throws EPPIXSeriousException{
		
			boolean success = false;
			Integer serial = null;	
			ChgChargesDMO chgDmo = null;
			
			this.setInsModify(true);
			
			/**
			 * 30-07-2020 SV
			 * Mofe this check to doINSUProductVariableCharge
			 */
//			if(chargeCode != null && chargeCode.length() > 0){
//				
//				// Validate the charge code, if not found the default code will be used.
//				chgDmo = this.getChg(chargeCode);
//				
//				if(chgDmo != null){				
//					this.setChargeCode(chargeCode);
//				}
//			}
					
			try {
				success = this.cancelInsurance(userName, language, hostname, policyRef, subscriberId, msisdn, deviceId, deviceIMEI, deviceMake, deviceModel, deviceCoverBand, monthlyVarCharge);
			} catch (Exception e) {
				logger.error(e.getMessage());
				throw new EPPIXSeriousException(e);
			}
			
			/**
			 * if cancell were successful we can continiue with provising the upgrade / downgrade
			 */
			
			if(success){
				serial = this.doINSUProductVariableCharge(userName, language, hostname, policyRef, subscriberId, msisdn, deviceId, deviceIMEI, deviceMake, deviceModel, deviceCoverBand, monthlyVarCharge,chargeCode, instructionDateTime);
			}
		
		
		return serial;
		
	}

	public String getChargeCode() {
		return chargeCode;
	}

	public void setChargeCode(String chargeCode) {
		this.chargeCode = chargeCode;
	}

	public boolean isInsModify() {
		return isInsModify;
	}

	public void setInsModify(boolean isInsModify) {
		this.isInsModify = isInsModify;
	}
	
	private ChgChargesDMO getChg(String chargeCode){
		
		QueryFilter filter = new QueryFilter();
		filter.add(FilterOp.EQUAL, ChgChargesDMO.chgCodeFilter, chargeCode);
		
		/**
		 * 08-09-2020 added additin check for insurance product SV
		 */
		filter.add(FilterOp.EQUAL, ChgChargesDMO.chgDescriptionFilter, "INSURANCE");
		ChgChargesDMO dmo = null;
		
		
		try {
			dmo = base.chgCharges().get(filter);
		} catch (EPPIXBusinessException e) {
			logger.debug(e.getMessage());
		} catch (EPPIXUnexpectedException e) {
			logger.debug(e.getMessage());
		} catch (EPPIXFatalException e) {
			logger.debug(e.getMessage());
		}
		
		return dmo;
		
	}
}
