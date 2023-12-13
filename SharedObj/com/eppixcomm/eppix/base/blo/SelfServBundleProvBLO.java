package com.eppixcomm.eppix.base.blo;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.log4j.Logger;

import com.eppixcomm.eppix.base.error.EPPIXBusinessException;
import com.eppixcomm.eppix.base.error.EPPIXFatalException;
import com.eppixcomm.eppix.base.error.EPPIXSeriousException;
import com.eppixcomm.eppix.base.error.EPPIXUnexpectedException;
import com.eppixcomm.eppix.base.error.Thrower;
import com.eppixcomm.eppix.base.errors.ApplicationMessages;
import com.eppixcomm.eppix.base.resp.SelfServExistsResponse;
import com.eppixcomm.eppix.base.resp.SelfServProvResponse;
import com.eppixcomm.eppix.common.data.DAC;
import com.eppixcomm.eppix.common.data.DAOIterator;
import com.eppixcomm.eppix.common.data.DTOActionTypes;
import com.eppixcomm.eppix.common.data.IntegerDMO;
import com.eppixcomm.eppix.common.util.Date;
import com.eppixcomm.eppix.common.util.DateTime;
import com.eppixcomm.eppix.common.util.FilterOp;
import com.eppixcomm.eppix.common.util.QueryFilter;
import com.eppixcomm.eppix.soa.sharedservices.blo.PshPsdDQO;
import com.eppixcomm.eppix.soa.sharedservices.blo.TsSpcSpvDQO;
import com.eppixcomm.eppix.soa.sharedservices.blo.TsVsrVstDQO;
import com.eppixcomm.eppix.soa.sharedservices.blo.VamSbdDQO;

public class SelfServBundleProvBLO extends BaseBLO implements DTOActionTypes,
		BaseMessages, ApplicationMessages {
	// Globals
	private static Thrower thrower = Thrower
			.getThrower(SelfServBundleProvBLO.class);
	private Logger logger = thrower.getLogger();
	public SelfServBundleProvDAC selfServBundleProvDAC;
	private BaseBLOBinder base;
	private GetSULMaxUsageAllowed serviceSUL;
	private SubscriberUpgradeMigrade service;
	private EppixDeviceInsPlatform deviceService;
	private VamActiveMsisdnDMO vamDMO = null;
	private SbdSubDetsDMO sbdDMO = null;
	private TsTariffServiceDMO tsDMO = null;   // net serv code
	private TsTariffServiceDMO tsSCDMO = null;  // service code
	private ChgChargesDMO chgDMO = null;
	private BigDecimal maxCustExposure = null;
	private BigDecimal creditLimit = null;
	private String providerNetId = null;
	private SlcustmDMO slDMO = null;
	private BcyBillingCycleDMO bcyDMO = null;
	private String bcyPeriodMonth = null;
	private String bcyPeriodyear = null;
	private VcfVrbleChrgFeeDMO vcfDMO = null;
	private BigDecimal prorateChg;
	private BigDecimal subChargeVatIncl = null;
	private BigDecimal subChargeVatEcl = null;
	private BigDecimal vatPercentage = null;
	private boolean isProrata = false;
	private String userName;
	private String hostName;
	private String billTable;
	protected SimpleDateFormat dtFormatyyyymmddStandard = new SimpleDateFormat(
			"yyyyMMdd");
	protected SimpleDateFormat dtFormatyyyymmdd = new SimpleDateFormat(
			"dd/MM/yyyy");
	
	// Change 14-10-2019
	private SpvParamValuesDMO spvDMO = null;
	private SpcParamConfigDMO spcDMO = null;
	private boolean isParameterized = false;
	private boolean isOldProccess = false;

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

	private Connection connection;

	@Override
	protected Class getDACClass() {
		return SelfServBundleProvDAC.class;
	}

	@Override
	protected void setDAC(DAC dac) {
		this.selfServBundleProvDAC = (SelfServBundleProvDAC) dac;
	}

	public SelfServProvResponse doSelfServBundleProv(String userName,
			String hostName, String language, String msisdnNo,
			Date effectiveDate, String referenceNo, String netwrkServ,
			String servDescription, String recurring, Integer prorateChg,
			BigDecimal subCharge, BigDecimal limitValue, String action) {

		logger.debug("\nuserName: " + userName + "\nhostName: " + hostName
				+ "\nlanguage: " + language + "\nmsisdnNo: " + msisdnNo
				+ "\neffectiveDate: " + effectiveDate + "\nreferenceNo: "
				+ referenceNo + "\nnetwrkServ: " + netwrkServ
				+ "\nservDescription: " + servDescription + "\nrecurring: "
				+ recurring + "\nprorateChg: " + prorateChg + "\nsubCharge: "
				+ subCharge + "\nlimitValue: " + limitValue + "\naction: " + action);
		
		
		
		this.userName = userName;
		this.hostName = hostName;
		this.setProrateChg(prorateChg);
		this.setSubChargeVatIncl(subCharge);
		String chargeCode = null;
		boolean isIcasa = false;
		
		SelfServProvResponse response = new SelfServProvResponse();
		String msg = "";

		try {
			service = base.subscriberUpgradeMigrade();
			service.setBase(base);
			service.setConnection(connection);

			serviceSUL = base.getGetSULMaxUsageAllowed();
			serviceSUL.setBase(base);
			serviceSUL.setConnection(connection);

			deviceService = base.getEppixDeviceInsPlatform();
			deviceService.setBase(base);
			deviceService.setConnection(connection);

		} catch (EPPIXFatalException e1) {
			logger.error(e1.getMessage());

			try {
				thrower.business(this.BASE_000301, e1);
			} catch (EPPIXBusinessException e) {
				response.setEppixStatus("0");
				response.setErrorCode(e.getErrorCode());
				response.setErrorType("1");
				response.setIsamError(e.getMessage());
				return response;
			}
		}

		try {
			thrower.ifParameterMissing("userName", userName);
			thrower.ifParameterMissing("hostName", hostName);
			thrower.ifParameterMissing("language", language);
			thrower.ifParameterMissing("msisdnNo", msisdnNo);
			thrower.ifParameterMissing("effectiveDate", effectiveDate);
			thrower.ifParameterMissing("referenceNo", referenceNo);
			thrower.ifParameterMissing("servDescription", servDescription);
//			thrower.ifParameterMissing("prorateChg", prorateChg);
			thrower.ifParameterMissing("subCharge", subCharge);
			thrower.ifParameterMissing("action", action);
		} catch (EPPIXSeriousException e) {
			response.setEppixStatus("0");
			response.setErrorCode(e.getErrorCode());
			response.setErrorType("1");
			response.setIsamError(e.getMessage());
			return response;
		}

		/**
		 * Create 2 charges in CHG - recurring find a ncode from existing
		 * records, use charge period = "M" and frequemcy = 1 for adhoc charge
		 * period = "A" and frequemcy = 1
		 */

		if (!"ADD".equals(action) && !"REMOVE".equals(action)) {
			try {
				thrower.business(SSP_000007, action);
			} catch (EPPIXBusinessException e) {
				logger.error("\n" + e.getErrorCode() + ": " + e.getMessage());
				response.setEppixStatus("0");
				response.setErrorCode(e.getErrorCode());
				response.setErrorType("1");
				response.setIsamError(e.getMessage());
				return response;
			}
		}

		try {
			thrower.ifParameterMissing("recurring", recurring);
		} catch (EPPIXSeriousException e) {
			logger.error("\n" + e.getErrorCode() + ": " + e.getMessage());
			response.setEppixStatus("0");
			response.setErrorCode(e.getErrorCode());
			response.setErrorType("1");
			response.setIsamError(e.getMessage());
			return response;
		}

		if (!"0".equals(recurring) && !"1".equals(recurring)) {
			try {
				thrower.business(SSP_000002, recurring);
			} catch (EPPIXBusinessException e) {
				logger.error("\n" + e.getErrorCode() + ": " + e.getMessage());
				response.setEppixStatus("0");
				response.setErrorCode(e.getErrorCode());
				response.setErrorType("1");
				response.setIsamError(e.getMessage());
				return response;
			}
		}

		if ("ADD".equals(action)) {
			try {
				thrower.ifParameterMissing("prorateChg", prorateChg);
			} catch (EPPIXSeriousException e) {
				logger.error("\n" + e.getErrorCode() + ": " + e.getMessage());
				response.setEppixStatus("0");
				response.setErrorCode(e.getErrorCode());
				response.setErrorType("1");
				response.setIsamError(e.getMessage());
				return response;
			}

			if (prorateChg.intValue() < 0) {
				try {
					thrower.business(SSP_000003, prorateChg);
				} catch (EPPIXBusinessException e) {
					logger.error("\n" + e.getErrorCode() + ": "
							+ e.getMessage());
					response.setEppixStatus("0");
					response.setErrorCode(e.getErrorCode());
					response.setErrorType("1");
					response.setIsamError(e.getMessage());
					return response;
				}
			}
		}

		try {
			vamDMO = service.getVam(msisdnNo);

			if (vamDMO == null) {
				try {
					thrower.business(SSP_000004, msisdnNo);
				} catch (EPPIXBusinessException e) {
					logger.error("\n" + e.getErrorCode() + ": "
							+ e.getMessage());
					response.setEppixStatus("0");
					response.setErrorCode(e.getErrorCode());
					response.setErrorType("1");
					response.setIsamError(e.getMessage());
					return response;
				}
			}
		} catch (EPPIXSeriousException e) {
			try {
				thrower.business(SSP_000004, msisdnNo);
			} catch (EPPIXBusinessException e1) {
				logger.error("\n" + e1.getErrorCode() + ": " + e1.getMessage());
				response.setEppixStatus("0");
				response.setErrorCode(e1.getErrorCode());
				response.setErrorType("1");
				response.setIsamError(e1.getMessage());
				return response;
			}
		}

		try {
			sbdDMO = service.getSbd(vamDMO.getVamSubscriberId());
			if (sbdDMO == null) {
				try {
					thrower.business(SSP_000005, vamDMO.getVamSubscriberId());
				} catch (EPPIXBusinessException e1) {
					logger.error("\n" + e1.getErrorCode() + ": "
							+ e1.getMessage());
					response.setEppixStatus("0");
					response.setErrorCode(e1.getErrorCode());
					response.setErrorType("1");
					response.setIsamError(e1.getMessage());
					return response;
				}
			}
		} catch (EPPIXSeriousException e) {
			try {
				thrower.business(SSP_000005, vamDMO.getVamSubscriberId());
			} catch (EPPIXBusinessException e1) {
				logger.error("\n" + e1.getErrorCode() + ": " + e1.getMessage());
				response.setEppixStatus("0");
				response.setErrorCode(e1.getErrorCode());
				response.setErrorType("1");
				response.setIsamError(e1.getMessage());
				return response;
			}
		}
		
		/**
		 * SV Add check if existing early term quote exists.
		 * If exists fail with message
		 * Transaction Restricted
		 * 05-12-2023
		 */
		
		if(this.checkEarlyTermQuoteExists(vamDMO.getVamSubscriberId(), msisdnNo)) {
			response.setEppixStatus("0");
			response.setErrorCode("1");
			response.setErrorType("1");
			response.setIsamError("Transaction Restricted for MSISDN (" + msisdnNo + ").");
			return response;
		}

		if (sbdDMO.getSbdBillCycle().equals("PREPA")
				|| sbdDMO.getSbdPackageCode().equals("QQQQQ")) {
			/**
			 * Prepaid. Should stop
			 */

			try {
				thrower.business(SSP_000006, vamDMO.getVamSubscriberId());
			} catch (EPPIXBusinessException e1) {
				logger.error("\n" + e1.getErrorCode() + ": " + e1.getMessage());
				response.setEppixStatus("0");
				response.setErrorCode(e1.getErrorCode());
				response.setErrorType("1");
				response.setIsamError(e1.getMessage());
				return response;
			}
		}
		
		

		// need to check ts for netservCode, else get generic code.
		if (netwrkServ != null && netwrkServ.length() > 0) {

			/**
			 * Change 10-08-2020 SV Add checks if netservcode = icasa services.
			 * Get the TS record, if not fount, then not ICASA so procceed as before
			 */

			try {
				this.getTsTariffServiceByNetServCode(netwrkServ, sbdDMO.getSbdPackageCode(), sbdDMO.getSbdTariffPlan());
			} catch (EPPIXSeriousException e) {
				logger.error(e.getMessage());
			}
			
			isIcasa = this.getTT("SSRACTROUT", netwrkServ);

			if (tsDMO != null) {	
				if (isIcasa) {
					boolean ssrSuccess = false;
					
					/**
					 * Fix VAS check 21-08-2020
					 */

					if ("ADD".equals(action)) {
						
						VasActiveServiceDMO vasDmo = this.getVas(this.sbdDMO.getSbdSubscriberId(), tsDMO.getTsServiceCode());
						
						if(vasDmo != null) {
							logger.error("\nSubscriber already has service");
							
							try {
								thrower.business(SSP_000019, this.sbdDMO.getSbdSubscriberId());
							} catch (EPPIXBusinessException e1) {
								logger.error("\n" + e1.getErrorCode() + ": " + e1.getMessage());
								response.setEppixStatus("0");
								response.setErrorCode(e1.getErrorCode());
								response.setErrorType("1");
								response.setIsamError(e1.getMessage());
								return response;
							}
						}

						try {
							ssrSuccess = this.createSSR(msisdnNo, effectiveDate, referenceNo, netwrkServ,
									servDescription, recurring, this.getProrateChg(), subCharge, limitValue, action, this.sbdDMO,
									this.vamDMO);
						} catch (EPPIXSeriousException e1) {
							logger.error("\n" + e1.getErrorCode() + ": " + e1.getMessage());

							msg = sbdDMO.getSbdBillAcNo() + " Ref " + referenceNo + " CHG " + netwrkServ;

							try {
								this.createMshMsisdnHistory(sbdDMO.getSbdSubscriberId(), msisdnNo, "ERROR", msg,
										userName, hostName);
								this.createSbdHistory(sbdDMO.getSbdSubscriberId(), "ERROR", "", msg, userName,
										hostName);
								this.createSimHistory(sbdDMO.getSbdSubscriberId(), vamDMO.getVamSimNo(), "ERROR", msg,
										userName, hostName);

							} catch (EPPIXSeriousException e2) {
								logger.error("\n" + e2.getErrorCode() + ": " + e2.getMessage());
								response.setEppixStatus("0");
							}

							response.setEppixStatus("0");
							response.setErrorCode(e1.getErrorCode());
							response.setErrorType("1");
							response.setIsamError(msg);
							return response;

						}

						msg = sbdDMO.getSbdBillAcNo() + " Ref " + referenceNo + " CHG " + netwrkServ;

						try {
							this.createMshMsisdnHistory(sbdDMO.getSbdSubscriberId(), msisdnNo, "EICSRA", msg, userName,
									hostName);
							this.createSbdHistory(sbdDMO.getSbdSubscriberId(), "EICSRA", "", msg, userName, hostName);
							this.createSimHistory(sbdDMO.getSbdSubscriberId(), vamDMO.getVamSimNo(), "EICSRA", msg,
									userName, hostName);

						} catch (EPPIXSeriousException e2) {
							logger.error("\n" + e2.getErrorCode() + ": " + e2.getMessage());
							response.setEppixStatus("0");
						}

//						response.setEppixStatus("0");
//						response.setErrorCode("0");
//						response.setErrorType("0");
//						response.setIsamError("SUCCESS");
//						return response;

					} else if ("REMOVE".equals(action)) {

						/**
						 * Check if service exists in VAS, if not then return success. (note – cannot
						 * remove if it does not exists. If not return error message from DB.
						 * 
						 * Insert the same Error message into SIM/MSISDN/SUB History Table History Code
						 * = “ERROR” Comment [1,9] = Account Number [10,23] = “Ref“, referenceNo [25,
						 * 50] = “CHG”, netServCode
						 * 
						 */

						VasActiveServiceDMO vasDmo = null;
						vasDmo = this.getVas(sbdDMO.getSbdSubscriberId(), tsDMO.getTsServiceCode());

						if (vasDmo == null) {
							/**
							 * Write history
							 */
							msg = sbdDMO.getSbdBillAcNo() + " Ref " + referenceNo + " CHG " + netwrkServ;

							try {
								this.createMshMsisdnHistory(sbdDMO.getSbdSubscriberId(), msisdnNo, "ERROR", msg,
										userName, hostName);
								this.createSbdHistory(sbdDMO.getSbdSubscriberId(), "ERROR", "", msg, userName,
										hostName);
								this.createSimHistory(sbdDMO.getSbdSubscriberId(), vamDMO.getVamSimNo(), "ERROR", msg,
										userName, hostName);

							} catch (EPPIXSeriousException e2) {
								logger.error("\n" + e2.getErrorCode() + ": " + e2.getMessage());
								response.setEppixStatus("0");
							}

							response.setEppixStatus("0");
							response.setErrorCode("2");
							response.setErrorType("2");
							response.setIsamError(msg);
							return response;

						} else {

							try {
								ssrSuccess = this.createSSR(msisdnNo, effectiveDate, referenceNo, netwrkServ,
										servDescription, recurring, this.getProrateChg(), subCharge, limitValue, action,
										this.sbdDMO, this.vamDMO);
							} catch (EPPIXSeriousException e) {
								logger.error("\n" + e.getErrorCode() + ": " + e.getMessage());

								msg = sbdDMO.getSbdBillAcNo() + " Ref " + referenceNo + " CHG " + netwrkServ;

								try {
									this.createMshMsisdnHistory(sbdDMO.getSbdSubscriberId(), msisdnNo, "ERROR", msg,
											userName, hostName);
									this.createSbdHistory(sbdDMO.getSbdSubscriberId(), "ERROR", "", msg, userName,
											hostName);
									this.createSimHistory(sbdDMO.getSbdSubscriberId(), vamDMO.getVamSimNo(), "ERROR",
											msg, userName, hostName);

								} catch (EPPIXSeriousException e2) {
									logger.error("\n" + e2.getErrorCode() + ": " + e2.getMessage());
									response.setEppixStatus("0");
								}

								response.setEppixStatus("0");
								response.setErrorCode(e.getErrorCode());
								response.setErrorType("1");
								response.setIsamError(msg);
								return response;
							}

							msg = sbdDMO.getSbdBillAcNo() + " Ref " + referenceNo + " CHG " + netwrkServ;
							try {
								this.createMshMsisdnHistory(sbdDMO.getSbdSubscriberId(), msisdnNo, "ESRIDBD", msg,
										userName, hostName);
								this.createSbdHistory(sbdDMO.getSbdSubscriberId(), "ESRIDBD", "", msg, userName,
										hostName);
								this.createSimHistory(sbdDMO.getSbdSubscriberId(), vamDMO.getVamSimNo(), "ESRIDBD", msg,
										userName, hostName);

							} catch (EPPIXSeriousException e2) {
								logger.error("\n" + e2.getErrorCode() + ": " + e2.getMessage());
								response.setEppixStatus("0");
							}

							response.setEppixStatus("0");
							response.setErrorCode("0");
							response.setErrorType("0");
							response.setIsamError("SUCCESS");
							return response;
						}
					}
				}
			}
		}
		
		if(isIcasa && tsDMO == null) {
			// If isAcase service but not is TS, then return an error
			
			logger.error("\nICASA service but not in TS");
			try {
				thrower.business(SSP_000018, netwrkServ);
			} catch (EPPIXBusinessException e1) {
				logger.error("\n" + e1.getErrorCode() + ": "
						+ e1.getMessage());
				response.setEppixStatus("0");
				response.setErrorCode(e1.getErrorCode());
				response.setErrorType("1");
				response.setIsamError(e1.getMessage());
				return response;
			}
			
		}
		
		if (tsDMO == null) {
			/**
			 * We did not get the provided netservCode, so get the generig
			 * details from CHG. Generic bundles INSERT INTO Chg_Charges
			 * (chg_code,chg_description,chg_value,chg_vat_code,
			 * chg_ncode,chg_netid
			 * ,chg_chargef,chg_period,chg_frequency,chg_effective_date,
			 * chg_class_id) VALUES ('OTGA','Adhoc generic SS
			 * Bundles',0.00,'V','OTGA','M1','A',null,1,TODAY ,141);
			 * 
			 * INSERT INTO Chg_Charges
			 * (chg_code,chg_description,chg_value,chg_vat_code,
			 * chg_ncode,chg_netid
			 * ,chg_chargef,chg_period,chg_frequency,chg_effective_date,
			 * chg_class_id) VALUES ('OTGR','Recurring generic SS
			 * Bundles',0.00,'V','OTGR','M1','F','M',1,TODAY ,141);
			 * 
			 * SV Change 16-08-2022
			 * INC000003458719
			 * Change to write the product code (netwrkServ) not to be overwritten.
			 * So orginal value passed in will be written to VCF and not the genric code.
			 * 
			 */

			if ("0".equals(recurring)) {
				// Adhoc once-off
				try {
					this.getChgGenericBundles("OTGA");
//					netwrkServ = "OTGA";
					chargeCode = "OTGA";
				} catch (EPPIXSeriousException e) {
					try {
						thrower.business(SSP_000008, "OTGA");
					} catch (EPPIXBusinessException e1) {
						logger.error("\n" + e1.getErrorCode() + ": "
								+ e1.getMessage());
						response.setEppixStatus("0");
						response.setErrorCode(e1.getErrorCode());
						response.setErrorType("1");
						response.setIsamError(e1.getMessage());
						return response;
					}
				}
			} else {
				// Recurring
				try {
					this.getChgGenericBundles("OTGR");
//					netwrkServ = "OTGR";
					chargeCode = "OTGR";
				} catch (EPPIXSeriousException e) {
					try {
						thrower.business(SSP_000008, "OTGR");
					} catch (EPPIXBusinessException e1) {
						logger.error("\n" + e1.getErrorCode() + ": "
								+ e1.getMessage());
						response.setEppixStatus("0");
						response.setErrorCode(e1.getErrorCode());
						response.setErrorType("1");
						response.setIsamError(e1.getMessage());
						return response;
					}
				}
			}

			if (chgDMO == null) {
				try {
					thrower.business(SSP_000008, "OTGA/OTGR");
				} catch (EPPIXBusinessException e1) {
					logger.error("\n" + e1.getErrorCode() + ": "
							+ e1.getMessage());
					response.setEppixStatus("0");
					response.setErrorCode(e1.getErrorCode());
					response.setErrorType("1");
					response.setIsamError(e1.getMessage());
					return response;
				}
			} else {
				providerNetId = chgDMO.getChgNetid();
			}
		} else {
			providerNetId = "M1";
			
			if ("0".equals(recurring)){
				chargeCode = "OTGA";
			}else{
				chargeCode = "OTGR";
			}
		}
		
		boolean success = false;
		msg = sbdDMO.getSbdBillAcNo() + " Ref " + referenceNo + " CHG " + chargeCode;

		if ("ADD".equals(action)) {
			if (!isIcasa) {
				try {
					this.getVcfInsuranceByReference(sbdDMO.getSbdSubscriberId(), referenceNo, netwrkServ, subCharge);

					if (vcfDMO != null) {

						try {
							thrower.business(this.SSP_000012, new Object[] { referenceNo, subCharge.toString() });
						} catch (EPPIXBusinessException e) {
							logger.error("\n" + e.getErrorCode() + ": " + e.getMessage());
							response.setEppixStatus("0");
							response.setErrorCode(e.getErrorCode());
							response.setErrorType("1");
							response.setIsamError(e.getMessage());
							return response;
						}
					}

				} catch (EPPIXSeriousException e1) {
					logger.error("\n" + e1.getErrorCode() + ": " + e1.getMessage());
				}
			}

			this.getSlcustm(sbdDMO.getSbdBillAcNo());

			if (slDMO == null) {
				// No credit limit for the customer
				logger.error("The account: " + sbdDMO.getSbdBillAcNo()
						+ " does not exists in slcustm");

				try {
					thrower.business(this.SSP_000015, sbdDMO.getSbdBillAcNo());
				} catch (EPPIXBusinessException e) {
					logger.error("\n" + e.getErrorCode() + ": "
							+ e.getMessage());
					response.setEppixStatus("0");
					response.setErrorCode(e.getErrorCode());
					response.setErrorType("1");
					response.setIsamError(e.getMessage());
					return response;
				}
			}

			try {
				deviceService.setSlDMO(this.slDMO);
				deviceService.setSbdDMO(this.sbdDMO);
				success = deviceService.checkAccountExposureSS(
						sbdDMO.getSbdSubscriberId(), sbdDMO.getSbdDiallingNo(),
						subCharge);
			} catch (EPPIXSeriousException e1) {
				logger.error(e1.getMessage());
			}

			try {
				bcyDMO = deviceService.getBcy(sbdDMO.getSbdBillCycle());
			} catch (EPPIXSeriousException e) {
				logger.error(e.getMessage());
			}

			if (bcyDMO == null) {
				logger.error("Could not get BCY for billing cycle: "
						+ sbdDMO.getSbdBillCycle());

				try {
					thrower.business(this.SSP_000011, sbdDMO.getSbdBillCycle());
				} catch (EPPIXBusinessException e) {
					logger.error("\n" + e.getErrorCode() + ": "
							+ e.getMessage());
					response.setEppixStatus("0");
					response.setErrorCode(e.getErrorCode());
					response.setErrorType("1");
					response.setIsamError(e.getMessage());
					return response;
				}

			} else {
				Calendar cal = Calendar.getInstance();
				cal.setTime((java.util.Date) bcyDMO.getBcyNextRun());
				logger.debug("\nBCY Next run check in future: " + dtFormatyyyymmdd.format(cal.getTime()));

				if (bcyDMO.getBcyNextRun().after(new Date())) {
//					cal.set(cal.MONTH, cal.get(cal.MONTH) + 1);
					cal.set(cal.MONTH, cal.get(cal.MONTH));
					logger.debug("\nBCY Next run check in future true:  add 1 month: " + dtFormatyyyymmdd.format(cal.getTime()));
					
					
					bcyPeriodMonth = new String().valueOf(cal
							.get(Calendar.MONTH) + 1);
					bcyPeriodyear = new String()
							.valueOf(cal.get(Calendar.YEAR));

					logger.info("\nbcyPeriodMonth: " + bcyPeriodMonth
							+ "\nbcyPeriodyear: " + bcyPeriodyear);

				} else {
					
					logger.debug("\nBCY Next run check in future false: " + dtFormatyyyymmdd.format(cal.getTime())); 
					bcyPeriodMonth = new String().valueOf(cal
							.get(Calendar.MONTH) + 1);
					bcyPeriodyear = new String()
							.valueOf(cal.get(Calendar.YEAR));

					logger.info("\nbcyPeriodMonth: " + bcyPeriodMonth
							+ "\nbcyPeriodyear: " + bcyPeriodyear);
				}
			}

			// need to get the vcf if exists

			
			if(limitValue != null && limitValue.intValue() > 0){
				try {
					this.updateBillLimitSpul(sbdDMO.getSbdSubscriberId(), limitValue.intValue(), msisdnNo);
				} catch (EPPIXSeriousException e) {
					logger.error("\nFailed to Update SPUL for subscriber: " + sbdDMO.getSbdSubscriberId() + ": "+ e.getErrorCode() + ": "+ e.getMessage());
							
//					response.setEppixStatus("0");
//					response.setErrorCode(e.getErrorCode());
//					response.setErrorType("1");
//					response.setIsamError(e.getMessage());
//					return response;
				}
			}
			
			if(isProrata){
				try {
					
//					Get the VAT rate
					/**
					 * 23-08-2019 SJ.
					 * Add change to use the generic network service code and charge  code.
					 * They are the same values.
					 * 
					 */
					
					this.ChargeProrataActivation(sbdDMO.getSbdSubscriberId(), msisdnNo, chargeCode, effectiveDate);
				} catch (EPPIXSeriousException e) {
					
					try {
						thrower.business(this.SSP_000016, sbdDMO.getSbdSubscriberId());
					} catch (EPPIXBusinessException e1) {
						logger.error("\n" + e.getErrorCode() + ": "
								+ e.getMessage());
						response.setEppixStatus("0");
						response.setErrorCode(e.getErrorCode());
						response.setErrorType("1");
						response.setIsamError(e.getMessage());
						return response;
					}
				}
			}
			
			/**
			 * Change recurring as follows
			 * 1 = recurring, so set contract lengnht to "0"
			 * 0 = adhoc, so set contract lenght to "1"
			 * 
			 * Keeping everything as is, this can work if we set the contract length to 1 for non-recurring bundles, 
			 * then it will be terminated by the routine after the initial run. 
			 * The recurring ones should still have 0 as contract length and they should be okay to run until terminated …
			 */
			Integer contractLength = null;
			
			if("0".equals(recurring)){
				contractLength = new Integer("1");
			}else{
				contractLength = new Integer("0");
			}

			if (!isIcasa) {
				try {
					this.createVcfVrbleChrgFee(sbdDMO.getSbdBillAcNo(), sbdDMO.getSbdSubscriberId(), netwrkServ,
							servDescription, referenceNo, subCharge, bcyPeriodMonth, bcyPeriodyear, chargeCode,
							contractLength);

					try {

						this.createMshMsisdnHistory(sbdDMO.getSbdSubscriberId(), msisdnNo, "EICSRA", msg, userName,
								hostName);
						this.createSbdHistory(sbdDMO.getSbdSubscriberId(), "EICSRA", "", msg, userName, hostName);
						this.createSimHistory(sbdDMO.getSbdSubscriberId(), vamDMO.getVamSimNo(), "EICSRA", msg,
								userName, hostName);

					} catch (EPPIXSeriousException e2) {
						logger.error("\n" + e2.getErrorCode() + ": " + e2.getMessage());
					}

				} catch (EPPIXSeriousException e1) {
					try {
						thrower.business(this.SSP_000013, e1.getMessage());
					} catch (EPPIXBusinessException e) {
						logger.error("\n" + e.getErrorCode() + ": " + e.getMessage());

						try {
							this.createMshMsisdnHistory(sbdDMO.getSbdSubscriberId(), msisdnNo, "ERROR", msg, userName,
									hostName);
							this.createSbdHistory(sbdDMO.getSbdSubscriberId(), "ERROR", "", msg, userName, hostName);
							this.createSimHistory(sbdDMO.getSbdSubscriberId(), vamDMO.getVamSimNo(), "ERROR", msg,
									userName, hostName);

						} catch (EPPIXSeriousException e2) {
							logger.error("\n" + e2.getErrorCode() + ": " + e2.getMessage());
							response.setEppixStatus("0");
						}

						response.setEppixStatus("0");
						response.setErrorCode(e.getErrorCode());
						response.setErrorType("1");
						response.setIsamError(e.getMessage());
						return response;
					}
				}
			}

		} else { // REMOVE
			/**
			 * need to get the vcf if exists if found do update only.
			 * 
			 * Change 14-10-2019
			 * If TS record exists for the network service
			 * Check if the service is exsting in PSH/PSD 
			 * if found follow old self service action proccess for the deactivstion
			 * else follow vcf proccess.
			 * 
			 * If not parameterised, then check for normal services as well.
			 * 
			 */
			boolean doNewproccess = false;
			
			doNewproccess = this.useOldProccess(userName, hostName, language, msisdnNo, effectiveDate, referenceNo, netwrkServ, servDescription, recurring, this.getProrateChg(), subCharge, limitValue, action);

			if(doNewproccess) {
				/**
				 * The old proccess was followed,
				 * nothing more to do.
				 * 
				 */
				response.setEppixStatus("0");
				response.setErrorCode("0");
				response.setErrorType("0");
				response.setIsamError("SUCCESS");
				return response;
			}
			
			try {
				this.getVcfInsuranceByServCode(sbdDMO.getSbdSubscriberId(),
						netwrkServ, subCharge);
			} catch (EPPIXSeriousException e1) {
				logger.error("\n" + e1.getErrorCode() + ": " + e1.getMessage());
			}

			if (vcfDMO != null) {

				try {
					this.updateVcfInsurance(sbdDMO.getSbdSubscriberId(),
							new Date(), vcfDMO.getVcfEquipId());

					try {
						this.createMshMsisdnHistory(
								sbdDMO.getSbdSubscriberId(), msisdnNo,
								"ESRIDBD", msg, userName, hostName);
						this.createSbdHistory(sbdDMO.getSbdSubscriberId(),
								"ESRIDBD", "", msg, userName, hostName);
						this.createSimHistory(sbdDMO.getSbdSubscriberId(),
								vamDMO.getVamSimNo(), "ESRIDBD", msg, userName,
								hostName);

					} catch (EPPIXSeriousException e2) {
						logger.error("\n" + e2.getErrorCode() + ": "
								+ e2.getMessage());
					}

				} catch (EPPIXSeriousException e1) {
					try {
						thrower.business(this.SSP_000014, e1.getMessage());
					} catch (EPPIXBusinessException e) {
						logger.error("\n" + e.getErrorCode() + ": "
								+ e.getMessage());

						try {
							this.createMshMsisdnHistory(
									sbdDMO.getSbdSubscriberId(), msisdnNo,
									"ERROR", msg, userName, hostName);
							this.createSbdHistory(sbdDMO.getSbdSubscriberId(),
									"ERROR", "", msg, userName, hostName);
							this.createSimHistory(sbdDMO.getSbdSubscriberId(),
									vamDMO.getVamSimNo(), "ERROR", msg,
									userName, hostName);

						} catch (EPPIXSeriousException e2) {
							logger.error("\n" + e2.getErrorCode() + ": "
									+ e2.getMessage());
						}

						response.setEppixStatus("0");
						response.setErrorCode(e.getErrorCode());
						response.setErrorType("1");
						response.setIsamError(e.getMessage());
						return response;
					}
				}
			} else {
				try {
					this.createMshMsisdnHistory(sbdDMO.getSbdSubscriberId(),
							msisdnNo, "ERROR", msg, userName, hostName);
					this.createSbdHistory(sbdDMO.getSbdSubscriberId(), "ERROR",
							"", msg, userName, hostName);
					this.createSimHistory(sbdDMO.getSbdSubscriberId(),
							vamDMO.getVamSimNo(), "ERROR", msg, userName,
							hostName);

				} catch (EPPIXSeriousException e2) {
					logger.error("\n" + e2.getErrorCode() + ": "
							+ e2.getMessage());
				}
			}
		}

		response.setEppixStatus("0");
		response.setErrorCode("0");
		response.setErrorType("0");
		response.setIsamError("SUCCESS");

		return response;
	}
	
	/**
	 * 23/06/2023 SV
	 * Add this as additional productExists
	 * @param subscriberId
	 * @param limitValue
	 * @param msisdnNo
	 * @throws EPPIXSeriousException
	 */
	public SelfServExistsResponse productExists(String userName, String hostName, String language, String msisdnNo, String networkCode,
			String sorbTransId) {
		
		SelfServExistsResponse response = new SelfServExistsResponse();
		boolean isParamterisedService = false;
		boolean isExist = false;
		boolean isActive = false;
		VamSbdDQO vamSbdDQO = null;
		TsSpcSpvDQO tsSpcSpvDQO = null;
		TsVsrVstDQO tsVsrVstDQO = null;
		PshPsdDQO pshPsdDQO = null;
		VasActiveServiceDMO vasDMO = null;
		
		try {
			vamSbdDQO = this.selfServBundleProvDAC.getVamSbd(msisdnNo);
			
			if(vamSbdDQO == null) {
				logger.error("\nMSISDNNO: " + msisdnNo + ": NOT FOUND");
				response.setEppixStatus("0");
				response.setErrorCode("1");
				response.setErrorType("1");
				response.setIsamError("Failed");
				response.setExists("False");
				response.setDescription("MSISDN (" + msisdnNo + ") not found ");
				return response;
			}
		} catch (EPPIXSeriousException e) {
			logger.error("\nMSISDNNO: " + msisdnNo + ": " + e.getMessage());
			response.setEppixStatus("0");
			response.setErrorCode("1");
			response.setErrorType("1");
			response.setIsamError("Failed");
			response.setExists("False");
			response.setDescription("MSISDN (" + msisdnNo + ") not found ");
			return response;
		}
		
		/**
		 * SV Add check if existing early term quote exists.
		 * If exists fail with message
		 * Transaction Restricted
		 * 05-12-2023
		 */
		if(this.checkEarlyTermQuoteExists(vamSbdDQO.getVamSubscriberId(), msisdnNo)) {
			response.setEppixStatus("0");
			response.setErrorCode("1");
			response.setErrorType("1");
			response.setIsamError("Failed");
			response.setExists("False");
			response.setDescription("Transaction Restricted for MSISDN (" + msisdnNo + ").");
			return response;
		}
		
		try {
			tsSpcSpvDQO = this.selfServBundleProvDAC.getTsSpcSpv(vamSbdDQO.getSbdPackageCode(), vamSbdDQO.getSbdTariffPlan(), networkCode);
			
			if(tsSpcSpvDQO == null) {
				isExist = false;
				isParamterisedService = false;

			}else {
				isExist = true;
				isParamterisedService = true;
			}
		} catch (EPPIXSeriousException e) {
			logger.error("\nPackage Code: " + vamSbdDQO.getSbdPackageCode() + " and Tariff plan not found for " + networkCode + ": "  + e.getMessage());
			isExist = false;
			isParamterisedService = false;
		}
		
		if (!isExist) {
			try {
				tsVsrVstDQO = this.selfServBundleProvDAC.getTsVsrVst(vamSbdDQO.getSbdPackageCode(),
						vamSbdDQO.getSbdTariffPlan(), networkCode);
				
				if(tsVsrVstDQO == null) {
					isExist = false;
					isParamterisedService = false;
				}else {
					isExist = true;
					isParamterisedService = false;
				}
			} catch (EPPIXSeriousException e) {
				logger.error("\nPackage Code: " + vamSbdDQO.getSbdPackageCode() + " and Tariff plan not found for "
						+ networkCode + ": " + e.getMessage());
				isExist = false;
				isParamterisedService = false;
			}
		}
		
		logger.debug("\nisExist: " + isExist + " - isParamterisedService: " + isParamterisedService + " - isActive: " + isActive);
		
		if(!isExist) {
			logger.error("\nProduct not found for net serv code: " + networkCode);
			response.setEppixStatus("0");
			response.setErrorCode("1");
			response.setErrorType("1");
			response.setIsamError("Failed");
			response.setExists("False");
			response.setDescription("Product does not exist on Eppix");
			return response;
		}
		
		if (isParamterisedService) {
			try {
				pshPsdDQO = this.selfServBundleProvDAC.getPshPsd(vamSbdDQO.getSbdSubscriberId(), tsSpcSpvDQO.getTsServiceCode(),
						tsSpcSpvDQO.getSpvParamValue());

				if (pshPsdDQO != null) {
					isActive = true;
				}
			} catch (EPPIXSeriousException e) {
				logger.error("\nPackage Code: " + vamSbdDQO.getSbdPackageCode() + " and Tariff plan not found for "
						+ networkCode + ": " + e.getMessage());
				isActive = false;
			}
		}
		
		if(!isParamterisedService) {
			// Normal service
			vasDMO = this.getVas(vamSbdDQO.getSbdSubscriberId(), tsVsrVstDQO.getTsServiceCode());
			
			if(vasDMO != null) {
				isActive = true;
			}
		}
		
		response.setEppixStatus("0");
		response.setErrorCode("1");
		response.setErrorType("1");
		response.setIsamError("Success");
		if (isExist) {
			response.setExists("true");
		}
		
		if(isActive) {
			response.setDescription("Product Added on  Eppix");
		}else {
			response.setDescription("Product not Added on  Eppix");
		}
		
		logger.debug(response.toString());
		
		return response;
	}

	public void updateBillLimitSpul(Integer subscriberId, Integer limitValue,
			String msisdnNo) throws EPPIXSeriousException {

		/**
		 * SJ: Added additional check for system key system key is in sks:
		 * key_code: SSRSPULUPD = (Y)es of (N)o MRB Phase 2 >>>PCR 2 >>>SPUL
		 * Impact on Credit limits
		 */
		QueryFilter filter = new QueryFilter();
		filter.add(FilterOp.EQUAL, SksKeySettingDMO.sksKeyCodeFilter,
				"SSRSPULUPD");
		SksKeySettingDMO sksDmo = null;

		try {
			sksDmo = base.sksKeySetting().get(filter);
		} catch (EPPIXBusinessException e2) {
			logger.error("Exception getting System key SSRSPULUPD" + e2);
			throw new EPPIXSeriousException("",
					"Exception getting System key SSRSPULUPD" + e2);

		} catch (EPPIXUnexpectedException e2) {
			logger.error("Exception getting System key SSRSPULUPD" + e2);
			throw new EPPIXSeriousException("",
					"Exception getting System key SSRSPULUPD" + e2);
		} catch (EPPIXFatalException e2) {
			logger.error("Exception getting System key SSRSPULUPD" + e2);
			throw new EPPIXSeriousException("",
					"Exception getting System key SSRSPULUPD" + e2);
		}

		if (sksDmo == null) {
			logger.error("Failed getting System key SSRSPULUPD");
			throw new EPPIXSeriousException("",
					"Exception getting System key SSRSPULUPD");
		}

		if (sksDmo.getSksValue().equals("Y")) {

			BlhBillLimitHdDMO blhDMO = null;

			try {
				blhDMO = service.getBillLimit(subscriberId, "SPUL");
			} catch (EPPIXSeriousException e1) {
				logger.error("Failed to get BLH for subscriber: "
						+ subscriberId + " with new billlimit value: "
						+ limitValue.toString() + " " + e1);

				return;
			}

			if (blhDMO == null) {
				/**
				 * No update required.
				 * 
				 */
				return;
			}

			logger.debug("BEFORE BILL LIMIT MODIFY");

			logger.debug("LIMIT TO MODIFY: " + limitValue);

			BigDecimal oldLimit = blhDMO.getBlhBillLimitVal();

			blhDMO.setBlhBillLimitVal(new BigDecimal(limitValue));

			logger.debug("AFTER BILL LIMIT MODIFY");

			try {
				base.blhBillLimitHd().modify(blhDMO);

				/**
				 * SJ: Add history event here 23-09-2016
				 * 
				 * Pedro requested: 1. Update BLH with the correct value, cents
				 * and not Rands 2. Generate a history event, We need to ensure
				 * that it's easily identified who did the update
				 * 
				 * I’ve created a new hist code for the SPUL update Code =
				 * SSSPUL Also, for the user id and terminal, please use
				 * ‘SelfServic’
				 * 
				 */

				// services.createSubscriberHistory(subscriberId, 0, "SSSPUL",
				// oldLimit.toString(), limitValue.toString());

				SbhSubHistoryDMO sbhDMO = new SbhSubHistoryDMO();
				sbhDMO.setSbhSubscriberId(subscriberId);
				sbhDMO.setSbhFieldId(0);
				sbhDMO.setSbhHistCode("SSSPUL");
				sbhDMO.setSbhOldValue(oldLimit.toString());
				sbhDMO.setSbhNewValue(limitValue.toString());
				sbhDMO.setSbhUserId("SelfServic");
				sbhDMO.setSbhTerminalId("SelfServic");
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

				MshMsisdnHistoryDMO mshMsisdnHistoryDMO = new MshMsisdnHistoryDMO();
				mshMsisdnHistoryDMO.setMshSubscriberId(subscriberId);
				mshMsisdnHistoryDMO.setMshMsisdnNo(msisdnNo);
				mshMsisdnHistoryDMO.setMshHistCode("SSSPUL");
				mshMsisdnHistoryDMO.setMshComment(limitValue.toString());
				mshMsisdnHistoryDMO.setMshUserId("SelfServic");
				mshMsisdnHistoryDMO.setMshTerminalId("SelfServic");
				mshMsisdnHistoryDMO.setMshTimestamp(new DateTime());

				try {
					base.mshMsisdnHistory().create(mshMsisdnHistoryDMO);
				} catch (EPPIXBusinessException e) {
					logger.error("Exception creating MSH for MSISDN: "
							+ msisdnNo + " EXCEPTION: " + e);
				} catch (EPPIXUnexpectedException e) {
					logger.error("Exception creating MSH for MSISDN: "
							+ msisdnNo + " EXCEPTION: " + e);
				} catch (EPPIXFatalException e) {
					logger.error("Exception creating MSH for MSISDN: "
							+ msisdnNo + " EXCEPTION: " + e);
				}

			} catch (EPPIXBusinessException e) {
				logger.error("Failed to update BLH for subscriber: "
						+ subscriberId + " with new billlimit value: "
						+ limitValue.toString() + " " + e);
				throw new EPPIXSeriousException("1",
						"Failed to update BLH for subscriber: " + subscriberId
								+ " with new billlimit value: "
								+ limitValue.toString());
			} catch (EPPIXUnexpectedException e) {
				logger.error("Failed to update BLH for subscriber: "
						+ subscriberId + " with new billlimit value: "
						+ limitValue.toString() + " " + e);
				throw new EPPIXSeriousException("1",
						"Failed to update BLH for subscriber: " + subscriberId
								+ " with new billlimit value: "
								+ limitValue.toString());
			} catch (EPPIXFatalException e) {
				logger.error("Failed to update BLH for subscriber: "
						+ subscriberId + " with new billlimit value: "
						+ limitValue.toString() + " " + e);
				throw new EPPIXSeriousException("1",
						"Failed to update BLH for subscriber: " + subscriberId
								+ " with new billlimit value: "
								+ limitValue.toString());
			}
		}

	}

	private Integer createVcfVrbleChrgFee(String accountNo,
			Integer subscriberId, String servCode, String servDesc,
			String referenceNo, BigDecimal subCharge, String nextBcyPeriod,
			String nextyearRun, String chargCode, Integer contractLength) throws EPPIXSeriousException {

		VcfVrbleChrgFeeDMO vcfVrbleChrgFeeDMO = new VcfVrbleChrgFeeDMO();
		VcfVrbleChrgFeeDMO returnedVcfVrbleChrgFeeDMO = null;
		
		vcfVrbleChrgFeeDMO.setVcfEquipId(0);
		vcfVrbleChrgFeeDMO.setVcfCustomer(accountNo);
		vcfVrbleChrgFeeDMO.setVcfSubscriberId(subscriberId);
		vcfVrbleChrgFeeDMO.setVcfVariableType("SR");
		vcfVrbleChrgFeeDMO.setVcfProductCode(servCode);
		vcfVrbleChrgFeeDMO.setVcfDescription(servDesc);
		vcfVrbleChrgFeeDMO.setVcfMake("");
		vcfVrbleChrgFeeDMO.setVcfModel(referenceNo);
		vcfVrbleChrgFeeDMO.setVcfInventryItemid("");
		vcfVrbleChrgFeeDMO.setVcfStartDate(new Date());
		vcfVrbleChrgFeeDMO.setVcfEndDate(null);
		vcfVrbleChrgFeeDMO.setVcfContrcLength(contractLength);
		vcfVrbleChrgFeeDMO.setVcfFullAmt(this.getChgMinVat().doubleValue());
		vcfVrbleChrgFeeDMO.setVcfMonthAmt(this.getChgMinVat().doubleValue());
		vcfVrbleChrgFeeDMO.setVcfNextPeriod(nextBcyPeriod);
		vcfVrbleChrgFeeDMO.setVcfNextYear(nextyearRun);
		vcfVrbleChrgFeeDMO.setVcfRemAmt(0.00);
		vcfVrbleChrgFeeDMO.setVcfRemPeriod(new Short("0"));
		vcfVrbleChrgFeeDMO.setVcfChargeCode(chargCode);
		vcfVrbleChrgFeeDMO.setVcfStatus("A");
		vcfVrbleChrgFeeDMO.setVcfTimestamp(new Date());

		try {
			returnedVcfVrbleChrgFeeDMO = base.vcfVrbleChrgFee().create(
					vcfVrbleChrgFeeDMO);

			if (returnedVcfVrbleChrgFeeDMO == null) {
				logger.error("Failed to create VCF record for insurance: Account: "
						+ accountNo);
				throw new EPPIXSeriousException("2",
						"Failed to create VCF record for insurance: Account: "
								+ accountNo);
			}
		} catch (Exception e) {
			e.printStackTrace();
			logger.error(e.getMessage());
			throw new EPPIXSeriousException("2", e.getMessage());
		}

		return returnedVcfVrbleChrgFeeDMO.getVcfEquipId();

	}

	public void updateVcfInsurance(Integer subscriberId, Date endDate,
			Integer equiptId) throws EPPIXSeriousException {

		QueryFilter filter = new QueryFilter();

		filter.add(FilterOp.SET, VcfVrbleChrgFeeDMO.vcfStatusFilter, "I");
		filter.add(FilterOp.SET, VcfVrbleChrgFeeDMO.vcfEndDateFilter, endDate);
		filter.add(FilterOp.EQUAL, VcfVrbleChrgFeeDMO.vcfEquipIdFilter, equiptId);
		filter.add(FilterOp.EQUAL, VcfVrbleChrgFeeDMO.vcfSubscriberIdFilter,
				subscriberId);

		try {
			base.vcfVrbleChrgFee().modify(filter);
		} catch (Exception e) {
			logger.error(e.getMessage());
			throw new EPPIXSeriousException("2", e.getMessage());
		}

	}

	public void getVcfInsuranceByReference(Integer subscriberId,
			String referenceNo, String servCode, BigDecimal subCharge)
			throws EPPIXSeriousException {

		QueryFilter filter = new QueryFilter();

		filter.add(FilterOp.EQUAL, VcfVrbleChrgFeeDMO.vcfSubscriberIdFilter,
				subscriberId);
		filter.add(FilterOp.EQUAL, VcfVrbleChrgFeeDMO.vcfModelFilter,
				referenceNo);
		filter.add(FilterOp.EQUAL, VcfVrbleChrgFeeDMO.vcfProductCodeFilter,
				servCode);
		filter.add(FilterOp.EQUAL, VcfVrbleChrgFeeDMO.vcfFullAmtFilter,
				this.getChgMinVat().doubleValue());

		try {
			vcfDMO = base.vcfVrbleChrgFee().get(filter);
		} catch (Exception e) {
			logger.error(e.getMessage());
			throw new EPPIXSeriousException("2", e.getMessage());
		}
	}

	public void getVcfInsuranceByServCode(Integer subscriberId,
			String servCode, BigDecimal subCharge) throws EPPIXSeriousException {

		/**
		 * This could possible return multiple records. Ensure that only oldest
		 * record are removed. Need to use the equipmentId for this purpose.
		 */

		QueryFilter filter = new QueryFilter();
		filter.add(FilterOp.EQUAL, VcfVrbleChrgFeeDMO.vcfSubscriberIdFilter,
				subscriberId);
		filter.add(FilterOp.EQUAL, VcfVrbleChrgFeeDMO.vcfProductCodeFilter,
				servCode);
		filter.add(FilterOp.EQUAL, VcfVrbleChrgFeeDMO.vcfMonthAmtFilter,
				this.getChgMinVat());
		filter.add(FilterOp.EQUAL, VcfVrbleChrgFeeDMO.vcfStatusFilter,
				"A");
		filter.add(FilterOp.ORDERBYASC,
				VcfVrbleChrgFeeDMO.vcfEquipIdFilter);
		DAOIterator it = null;

		try {
			it = base.vcfVrbleChrgFee().iterate(filter);
		} catch (Exception e) {
			logger.error(e.getMessage());
			throw new EPPIXSeriousException("2", e.getMessage());
		}

		while (it.hasNext()) {
			vcfDMO = (VcfVrbleChrgFeeDMO) it.next();
			break;
		}
	}

	public void getTsTariffServiceByNetServCode(String netServCode,
			String packageCode, String intTariff) throws EPPIXSeriousException {

		QueryFilter filter = new QueryFilter();
		filter.add(FilterOp.EQUAL, TsTariffServiceDMO.tsNetServCodeFilter,
				netServCode);
		filter.add(FilterOp.EQUAL, TsTariffServiceDMO.tsPackageCodeFilter,
				packageCode);
		filter.add(FilterOp.EQUAL, TsTariffServiceDMO.tsInternalTariffFilter,
				intTariff);

		try {
			tsDMO = this.base.tsTariffService().get(filter);
		} catch (EPPIXBusinessException e) {
			logger.error("Failed to get TS CHARGES for SERVICE CODE: "
					+ netServCode + " PACKAGE CODE: " + packageCode
					+ " INTERN TARIFF PLAN: " + intTariff + " EXCEPTION: " + e);
		} catch (EPPIXUnexpectedException e) {
			logger.error("Failed to get TS CHARGES for SERVICE CODE: "
					+ netServCode + " PACKAGE CODE: " + packageCode
					+ " INTERN TARIFF PLAN: " + intTariff + " EXCEPTION: " + e);
		} catch (EPPIXFatalException e) {
			logger.error("Failed to get TS CHARGES for SERVICE CODE: "
					+ netServCode + " PACKAGE CODE: " + packageCode
					+ " INTERN TARIFF PLAN: " + intTariff + " EXCEPTION: " + e);
		}

	}

	private void getChgGenericBundles(String chgCode)
			throws EPPIXSeriousException {

		QueryFilter filter = new QueryFilter();
		filter.add(FilterOp.EQUAL, ChgChargesDMO.chgCodeFilter, chgCode);

		try {
			chgDMO = this.base.chgCharges().get(filter);
		} catch (EPPIXBusinessException e) {
			logger.error("Failed to get CHG_CHARGES for SERVICE CODE: "
					+ chgCode + ": " + e);
		} catch (EPPIXUnexpectedException e) {
			logger.error("Failed to get CHG_CHARGES for SERVICE CODE: "
					+ chgCode + ": " + e);
		} catch (EPPIXFatalException e) {
			logger.error("Failed to get CHG_CHARGES for SERVICE CODE: "
					+ chgCode + ": " + e);
		}
	}

	private void getSlcustm(String accountNo) {

		QueryFilter filter = new QueryFilter();
		filter.add(FilterOp.EQUAL, SlcustmDMO.customerFilter, accountNo);

		try {
			slDMO = base.slcustm().get(filter);

		} catch (EPPIXBusinessException e) {
			logger.error("Exception getting SlcustM data for customer: "
					+ accountNo + " EXCEPTION: " + e);
			return;
		} catch (EPPIXUnexpectedException e) {
			logger.error("Exception getting SlcustM data for customer: "
					+ accountNo + " EXCEPTION: " + e);
			return;
		} catch (EPPIXFatalException e) {
			logger.error("Exception getting SlcustM data for customer: "
					+ accountNo + " EXCEPTION: " + e);
			return;
		}
	}


	public void updateCrbCustRiskBal(String accountNo, BigDecimal creditLimit)
			throws EPPIXSeriousException {

		QueryFilter filter = new QueryFilter();
		filter.add(FilterOp.SET, CrbCustRiskBalDMO.crbCreditLimitFilter,
				creditLimit);
		filter.add(FilterOp.EQUAL, CrbCustRiskBalDMO.crbBillAcNoFilter,
				accountNo);

		try {
			base.crbCustRiskBal().modify(filter);
		} catch (EPPIXBusinessException e) {
			logger.debug("Failed to update crb credit for account: "
					+ accountNo + " " + e.getMessage());
			throw new EPPIXSeriousException(
					"Failed to update crb credit for account: " + accountNo
							+ " " + e.getMessage());
		} catch (EPPIXUnexpectedException e) {
			logger.debug("Failed to update crb credit for account: "
					+ accountNo + " " + e.getMessage());
			throw new EPPIXSeriousException(
					"Failed to update crb credit for account: " + accountNo
							+ " " + e.getMessage());
		} catch (EPPIXFatalException e) {
			logger.debug("Failed to update crb credit for account: "
					+ accountNo + " " + e.getMessage());
			throw new EPPIXSeriousException(
					"Failed to update crb credit for account: " + accountNo
							+ " " + e.getMessage());
		}
	}

	private void createCuhCustHistory(String account, String histCode,
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
	

	public void ChargeProrataActivation(Integer subscriberId, String msisdnNo,
			String serviceCode, Date prorataDate)
			throws EPPIXSeriousException {

				logger.debug("\nSUBSCRIBER: " + subscriberId + "\nMSISDN: " + msisdnNo
						+ "\nSERVICE CODE: " + serviceCode + "\nPRORATA DATE: " + prorataDate
						+ "\nPRORATA (MIN VAT) VALUE: " + this.getProrateChgMinVat()

				);

				String chargeType;
				BillCccccyyyymmddDMO billDMO = null;
				VasActiveServiceDMO vasDMO = null;

				ChgChargesDMO chgDMO1 = null;
				Vsr2ServiceAuxDMO vsr2DMO = null;
				SlcustmDMO slcustmDMO = null;
				CnyCurrencyDMO cnyDMO = null;

				String histCode;
				String histText = "";

				Integer[] fullPeriods = new Integer[3];

				Date lastDayBill;
				Date bcyNextRun;

				BigDecimal prorataCost = null;
				BigDecimal prorataValue = null;

				Integer max_subs = null;
				Integer servProv = null;

				fullPeriods[0] = 0;
				fullPeriods[1] = 0;
				fullPeriods[2] = 0;

				thrower.ifParameterMissing("subscriberId", subscriberId);
				thrower.ifParameterMissing("msisdnNo", msisdnNo);
				thrower.ifParameterMissing("serviceCode", serviceCode);
				thrower.ifParameterMissing("prorataDate", prorataDate);

				bcyNextRun = bcyDMO.getBcyNextRun();

				// ## Check that the same charge period is used for the Billing cycle & Service
//				if (!bcyDMO.getBcyPeriod().equalsIgnoreCase(tsDMO.getTsChargePeriod())) {
//
//					logger.error("Billing Cycle and Service charge periods do not match");
//					throw new EPPIXSeriousException("1",
//							"Billing Cycle and Service charge periods do not match");
//
//				}

				// ## Check that the same charge frequency used for the Billing cycle &
				// Service
				// ## are compatible.
//				if ((bcyDMO.getBcyFrequency().intValue() % tsDMO.getTsChargeFreq()
//						.intValue()) != 0) {
//
//					logger.error("Billing Cycle and Service charge frequencies are not compatible");
//					throw new EPPIXSeriousException("1",
//							"Billing Cycle and Service charge frequencies are not compatible");
//
//				}

				// ## Fetch the Active Service record
				// CALL Subscriber_GetService(p_subscriber_id, p_service_code, p_tariff)
				// RETURNING l_vas.*

//				if (vasDMO == null) {
//					vasDMO = services.getSubscriberService(subscriberId, serviceCode,
//							tariff);
//
//					if (vasDMO == null) {
//
//						logger.error("Active Service details not found");
//						throw new EPPIXSeriousException("1",
//								"Active Service details not found");
//
//					}
//				}

//				this.getVsrDmo(serviceCode);

//				if (vsrDMO == null) {
//					logger.error("No service details found in table vsr_service for service code "
//							+ serviceCode);
//
//					throw new EPPIXSeriousException("1",
//							"No service details found in table vsr_service for service code "
//									+ serviceCode);
//				}

				// ## If all the fixed charges are NULL, then no processing is really
				// required
				// if ((vasDMO.getVasSubCharge1() == null ||
				// vasDMO.getVasSubCharge1().length() == 0)
				// && (vasDMO.getVasSubCharge2() == null ||
				// vasDMO.getVasSubCharge2().length() == 0)
				// && (vasDMO.getVasSubCharge3() == null ||
				// vasDMO.getVasSubCharge3().length() == 0)) {
				//
				// return;
				// }

//				if (isParameterized()) {
//					if (spvDMO.getSpvChargeCode() != null
//							&& spvDMO.getSpvChargeCode().length() > 0) {
//						//
//						chgDMO1 = services.getChg(spvDMO.getSpvChargeCode(),
//								vsrDMO.getVsrProviderId(), prorataDate, null, "");
//						//
//						//
//						if (chgDMO1 == null) {
//							logger.error("Fixed Charge param details not found");
//							throw new EPPIXSeriousException("1",
//									"Fixed Charge param details not found");
//
//						}
//					} else {
//						/**
//						 * J: Discussed with Hein, if TS has no sub sub charge, then the
//						 * prorata cannot be done. Proarata must done using this
//						 * subCharge
//						 * 
//						 * 13-08-2015
//						 * 
//						 */
//						logger.error("There is no subcharge for prorata param activation");
//
//						throw new EPPIXSeriousException("1",
//								"There is no subcharge for prorata param activation");
//					}
//				} else {
//
//					if (tsDMO.getTsSubCharge1() != null
//							&& tsDMO.getTsSubCharge1().length() > 0) {
//						//
//						chgDMO1 = services.getChg(tsDMO.getTsSubCharge1(),
//								vsrDMO.getVsrProviderId(), prorataDate, null, "");
//						//
//						//
//						if (chgDMO1 == null) {
//							logger.error("Fixed Charge narmal service details not found");
//							throw new EPPIXSeriousException("1",
//									"Fixed Charge normal services details not found");
//
//						}
//					} else {
//						/**
//						 * J: Discussed with Hein, if TS has no sub sub charge, then the
//						 * prorata cannot be done. Proarata must done using this
//						 * subCharge
//						 * 
//						 * 13-08-2015
//						 * 
//						 */
//						logger.error("There is no subcharge for normal service prorata activation");
//
//						throw new EPPIXSeriousException("1",
//								"There is no subchagre for normal services prorata activation");
//					}
//				}

				if (bcyDMO.getBcyNextRun().before(prorataDate)) {

					bcyDMO.setBcyNextRun(service.shiftPeriod(bcyDMO.getBcyNextRun(),
							bcyDMO.getBcyPeriod(), bcyDMO.getBcyFrequency(),
							bcyDMO.getBcyDayOfRun(), "F"));

					/*
					 * SJ: added changes to stop processing on error billing cycles has
					 * not been run for 2 concecutive periods. This error will be
					 * returned to the service
					 */

					if (bcyDMO.getBcyNextRun().before(prorataDate)) {

						if (prorataDate.before(new Date())
								|| prorataDate.equals(new Date())) {

							logger.error("Billing has not been run for TWO consecutive cycles");
							throw new EPPIXSeriousException("4",
									"Billing has not been run for TWO consecutive cycles");
						} else {

							int count = 0;
							while (bcyDMO.getBcyNextRun().before(prorataDate)) {

								logger.debug("IN WHILE LOOP BCY NEXT RUN" + count++);

								bcyDMO.setBcyNextRun(service.shiftPeriod(
										bcyDMO.getBcyNextRun(), bcyDMO.getBcyPeriod(),
										bcyDMO.getBcyFrequency(),
										bcyDMO.getBcyDayOfRun(), "F"));

								logger.debug("bcyDMO.getBcyNextRun: "
										+ bcyDMO.getBcyNextRun());

							}
						}
					}
				}
				// ## Set up the last day to bill
				if (bcyDMO.getBcyInAdvance().equalsIgnoreCase("Y")) {

					lastDayBill = Date.addDays(-1, bcyDMO.getBcyNextRun());

				} else {

					lastDayBill = bcyDMO.getBcyNextRun();

				}

				logger.debug("BEFORE BILL CREATE");

				billDMO = new BillCccccyyyymmddDMO();
				billDMO.setSubscriberId(subscriberId);
				billDMO.setHandset(msisdnNo);
				billDMO.setBillind("n");
				billDMO.setBilldat(prorataDate);
				billDMO.setInvoiceNo("0");
				billDMO.setVatamt(new BigDecimal("0.00"));
				billDMO.setVatrate(new BigDecimal("0.00"));
				billDMO.setCycleNo(bcyDMO.getBcyBillCycle());
				billDMO.setVatcode("");
				billDMO.setStartPeriod(prorataDate);
				billDMO.setEndPeriod(lastDayBill);
				billDMO.setBatchRunNum(null);

				/**
				 * Ngoni provided
				 * 
				 * LET l_bill.charge_type[ 1, 2] = "PS" LET l_bill.charge_type[ 4, 7] =
				 * p_service_code LET l_bill.charge_type[ 9,13] = p_service_type LET
				 * l_bill.charge_type[19,30] = p_psd_serial_id
				 */
				String servType = "SR";

				logger.debug("\n1 servType: " + servType);
				logger.debug("\n1 servType legth: " + servType.length());

				while (servType.length() < 5) {

					servType = servType + " ";

				}

				logger.debug("\n2 servType: " + servType);
				logger.debug("\n2 servType legth: " + servType.length());

//				if (isParameterized) {
//					chargeType = "PS " + serviceCode + " " + servType + "     "
//							+ psdDMO.getPsdSerialId();
//				} else {
//
					chargeType = "CFF" + serviceCode + " " + servType;
//
//				}

				billDMO.setTwinbillNo(0);

				billDMO.setCurrencyCharge(new BigDecimal("0.00"));
				billDMO.setExchangeRate(new BigDecimal("0.00"));
				billDMO.setExchOperator("");

				billDMO.setSparech(chargeType);
//				billDMO.setChargeClassId(chgDMO.getChgClassId());

				/**
				 * TODO SJ: Need to confirm correct values for setting below 2 fields.
				 * 
				 * See above discussion with Hein 13-08-2015
				 */

				billDMO.setChaserv(serviceCode);

				billDMO.setChargeClassId(new Integer(0));
				billDMO.setCost(new BigDecimal("0.00"));

				billDMO.setCost(this.getProrateChgMinVat());
				billDMO.setCharge(this.getProrateChgMinVat());
				logger.debug("\nPRORATA CHARGE MIN VAT: " + billDMO.getCharge());

				billDMO.setExchangeRate(new BigDecimal("1.00"));
				billDMO.setExchOperator("*");

				histCode = "BSRA";

//				if (sbaDMO == null) {
//
//					sbaDMO = services.getSba(subscriberId);
//
//					if (sbaDMO == null) {
//
//						logger.error("Failed to get SBA record for subscriber: "
//								+ subscriberId);
//						throw new EPPIXSeriousException("1",
//								"Failed to get SBA record for subscriber: "
//										+ subscriberId);
//					}
//				}
				//
				QueryFilter filter = new QueryFilter();
//				filter.add(FilterOp.EQUAL, SlcustmDMO.customerFilter,
//						sbaDMO.getSbaInvAccount());

//				try {
//					slDMO = base.slcustm().get(filter);
//
//					if (slDMO == null) {
//						logger.error("Failed to Slcustm for customer: "
//								+ sbaDMO.getSbaInvAccount());
//						throw new EPPIXSeriousException("1",
//								"Failed to Slcustm for customer: "
//										+ sbaDMO.getSbaInvAccount());
//					}
//
//				} catch (EPPIXBusinessException e) {
//					logger.error("Exception getting SlcustM data for customer: "
//							+ sbaDMO.getSbaInvAccount() + " EXCEPTION: " + e);
//					throw new EPPIXSeriousException("2",
//							"Failed to Slcustm for customer: "
//									+ sbaDMO.getSbaInvAccount());
//				} catch (EPPIXUnexpectedException e) {
//					logger.error("Exception getting SlcustM data for customer: "
//							+ sbaDMO.getSbaInvAccount() + " EXCEPTION: " + e);
//					throw new EPPIXSeriousException("2",
//							"Failed to Slcustm for customer: "
//									+ sbaDMO.getSbaInvAccount());
//				} catch (EPPIXFatalException e) {
//					logger.error("Exception getting SlcustM data for customer: "
//							+ sbaDMO.getSbaInvAccount() + " EXCEPTION: " + e);
//					throw new EPPIXSeriousException("2",
//							"Failed to Slcustm for customer: "
//									+ sbaDMO.getSbaInvAccount());
//				}

				if (slDMO.getCurrency() != null
						&& slDMO.getCurrency().length() > 0) {

					filter = new QueryFilter();
					filter.add(FilterOp.EQUAL, CnyCurrencyDMO.cnyCurrencyRefFilter,
							slDMO.getCurrency());

					try {
						cnyDMO = base.cnyCurrency().get(filter);

					} catch (EPPIXBusinessException e) {
						logger.error("Exception getting CNY record for currency: "
								+ slDMO.getCurrency() + " EXCEPTION: " + e);
						throw new EPPIXSeriousException(
								"Exception getting CNY record for currency: "
										+ slDMO.getCurrency() + " EXCEPTION: " + e);
					} catch (EPPIXUnexpectedException e) {
						logger.error("Exception getting CNY record for currency: "
								+ slDMO.getCurrency() + " EXCEPTION: " + e);
						throw new EPPIXSeriousException(
								"Exception getting CNY record for currency: "
										+ slDMO.getCurrency() + " EXCEPTION: " + e);
					} catch (EPPIXFatalException e) {
						logger.error("Exception getting CNY record for currency: "
								+ slDMO.getCurrency() + " EXCEPTION: " + e);
						throw new EPPIXSeriousException(
								"Exception getting CNY record for currency: "
										+ slDMO.getCurrency() + " EXCEPTION: " + e);
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

				} else {

					billDMO.setCurrencyCharge(billDMO.getCharge());

				}

				billDMO.setTechnology("GSM");
				billDMO.setPackge(sbdDMO.getSbdPackageCode());
				billDMO.setTimestamp(new DateTime());

				boolean noFailed = true;

				
				logger.debug("There is a failed record: " + noFailed);

				try {
					service.insertBillTable(billDMO, bcyNextRun, sbdDMO, noFailed);
				} catch (EPPIXFatalException e) {
					logger.error("Exception Inserting new Bill Table record: Exception: "
							+ e);
					throw new EPPIXSeriousException("4",
							"Exception Inserting new Bill Table record: Exception: "
									+ e);
				}

				histText = " CFF "
						+ serviceCode
						+ " "
						+ billDMO.getCharge()
								.round(new MathContext(4, RoundingMode.HALF_UP))
								.toString() + " " + serviceCode;

//				this.InsertMsisdnHistory(subscriberId, msisdnNo, histCode, histText);
				this.createMshMsisdnHistory(subscriberId, msisdnNo, histCode, histText, userName, hostName);

				// filter = new QueryFilter();
				// filter.add(FilterOp.SET, VsmServiceMsisdnDMO.vsmBilledUptoFilter,
				// lastDayBill);
				// filter.add(FilterOp.EQUAL, VsmServiceMsisdnDMO.vsmSubscriberIdFilter,
				// subscriberId);
				// filter.add(FilterOp.EQUAL, VsmServiceMsisdnDMO.vsmMsisdnNoFilter,
				// msisdnNo);
				// filter.add(FilterOp.EQUAL, VsmServiceMsisdnDMO.vsmServiceCodeFilter,
				// serviceCode);

				// try {
				// base.vsmServiceMsisdn().modify(filter);
				// } catch (EPPIXBusinessException e) {
				// logger.error("Exception modifing VSM for Subscriber: "
				// + subscriberId + " EXCEPTION: " + e);
				// throw new EPPIXSeriousException("2",
				// "Exception modifing VSM for Subscriber: " + subscriberId
				// + " EXCEPTION: " + e);
				// } catch (EPPIXUnexpectedException e) {
				// logger.error("Exception modifing VSM for Subscriber: "
				// + subscriberId + " EXCEPTION: " + e);
				// throw new EPPIXSeriousException("2",
				// "Exception modifing VSM for Subscriber: " + subscriberId
				// + " EXCEPTION: " + e);
				// } catch (EPPIXFatalException e) {
				// logger.error("Exception modifyinf VSM for Subscriber: "
				// + subscriberId + " EXCEPTION: " + e);
				// throw new EPPIXSeriousException("2",
				// "Exception modifing VSM for Subscriber: " + subscriberId
				// + " EXCEPTION: " + e);
				// }

			}

	
	public boolean isProrata() {
		return isProrata;
	}

	public void setProrata(boolean isProrata) {
		this.isProrata = isProrata;
	}
	
	public BigDecimal getProrateChgMinVat() {

//		BigDecimal prorata = this.getProrateChg().divide(new BigDecimal("100"),
//				2, RoundingMode.HALF_UP);
		BigDecimal prorata = this.getProrateChg();
		
		try {
			vatPercentage = service.getVatPercentage();
		} catch (EPPIXSeriousException e) {
			logger.error(e.getMessage());
		}

		if (vatPercentage == null) {
			logger.error("\nFailed to get the VAT percentage");
			vatPercentage = new BigDecimal("00.00");
		} else {
			vatPercentage = vatPercentage.divide(new BigDecimal("100"), 2,
					RoundingMode.HALF_UP);
			vatPercentage = vatPercentage.add(new BigDecimal("1.00"));
		}
		
		logger.debug("\nVat Percentage: " + vatPercentage.setScale(2, RoundingMode.HALF_UP));

		return prorata.divide(vatPercentage, 2, RoundingMode.HALF_UP);
	}
	
	public BigDecimal getChgMinVat() {

		BigDecimal prorata = this.getProrateChg();
		
		if (vatPercentage == null) {
			try {
				vatPercentage = service.getVatPercentage();
			} catch (EPPIXSeriousException e) {
				logger.error(e.getMessage());
			}

			if (vatPercentage == null) {
				logger.error("\nFailed to get the VAT percentage");
				vatPercentage = new BigDecimal("00.00");
			} else {
				vatPercentage = vatPercentage.divide(new BigDecimal("100"), 2,
						RoundingMode.HALF_UP);
				vatPercentage = vatPercentage.add(new BigDecimal("1.00"));
			}
		}
		
		logger.debug("\nVat Percentage for charge: " + vatPercentage.setScale(2, RoundingMode.HALF_UP));

		this.setSubChargeVatEcl(this.getSubChargeVatIncl().divide(vatPercentage, 2, RoundingMode.HALF_UP));
		logger.debug("\nCharge excl of VAT: " + this.getSubChargeVatEcl());
		return this.getSubChargeVatEcl();
	}


	public BigDecimal getProrateChg() {
		return prorateChg;
	}

	public void setProrateChg(Integer prorateChg) {
		
		BigDecimal prorateCharges = new BigDecimal(prorateChg.intValue()/100);
		
		this.prorateChg = prorateCharges;

		/**
		 * SJ: Change added as subCharge is received as null causing problems
		 * with writing to PSD table. If null set to 0.00 29-04-2016
		 * 
		 */

		if (prorateChg != null && prorateChg.intValue() > 1) {
			this.setProrata(true);
		} else {
			this.prorateChg = new BigDecimal("0.00");
		}
	}
	
	public Integer insertBillTable(BillCccccyyyymmddDMO billDMO,
			Date bcyNextRun, SbdSubDetsDMO sbdDMO, boolean insertSSR)
			throws EPPIXSeriousException, EPPIXFatalException{
		
		thrower.ifParameterMissing("bcyNextRun", bcyNextRun);

		BillCccccyyyymmddDMO billCccccyyyymmddDMO = null;

		billTable = "bill_" + billDMO.getCycleNo().trim()
				+ dtFormatyyyymmddStandard.format(bcyNextRun);

		logger.info("BILL TABLE TO INSERT INTO: " + billTable);


		/**
		 * SJ: test above string
		 * 
		 * Select * from bill_cyc3720140621 where subscriber_id = and chaserv =
		 * 'SMC'
		 * 
		 * If statement is not done. Added 06-07-2015.
		 * 
		 */

		if (billDMO.getChaserv() != null && billDMO.getChaserv().equals("SMR")) {

			QueryFilter filter = new QueryFilter();
			filter.add(FilterOp.EQUAL, BillCccccyyyymmddDMO.subscriberIdFilter,
					billDMO.getSubscriberId());
			filter.add(FilterOp.EQUAL, BillCccccyyyymmddDMO.chaservFilter,
					"SMC");

			try {
				billCccccyyyymmddDMO = base.billCccccyyyymmdd().get(filter,
						billTable);

				if (billCccccyyyymmddDMO == null) {
					logger.error("Failed to get billing details from table: "
							+ billTable + " for Subscriber: "
							+ billDMO.getSubscriberId());
				}
				return null;

			} catch (EPPIXBusinessException e) {
				logger.error("Exception getting billing details from table: "
						+ billTable + " for Subscriber: "
						+ billDMO.getSubscriberId() + " EXCEPTION: " + e);

				return null;
			} catch (EPPIXUnexpectedException e) {
				logger.error("Exception getting billing details from table: "
						+ billTable + " for Subscriber: "
						+ billDMO.getSubscriberId() + " EXCEPTION: " + e);
				return null;
			} catch (EPPIXFatalException e) {
				logger.error("Exception getting billing details from table: "
						+ billTable + " for Subscriber: "
						+ billDMO.getSubscriberId() + " EXCEPTION: " + e);
				return null;
			}

		}

		/**
		 * SJ: Added additional check for prorata activations and param charges.
		 * 
		 * If record exists, update values, else insert records.
		 */

		QueryFilter filter = new QueryFilter();
		filter.add(FilterOp.EQUAL, BillCccccyyyymmddDMO.subscriberIdFilter,
				billDMO.getSubscriberId());
		filter.add(FilterOp.EQUAL, BillCccccyyyymmddDMO.chaservFilter,
				billDMO.getChaserv());
		filter.add(FilterOp.EQUAL, BillCccccyyyymmddDMO.packgeFilter,
				billDMO.getPackge());
		boolean insert = false;

		try {
			billCccccyyyymmddDMO = base.billCccccyyyymmdd().get(filter,
					billTable);

			if (billCccccyyyymmddDMO == null) {
				logger.error("Failed to get billing details from table: "
						+ billTable + " for Subscriber: "
						+ billDMO.getSubscriberId());
				insert = true;
			}

		} catch (EPPIXBusinessException e) {
			logger.error("Exception getting billing details from table: "
					+ billTable + " for Subscriber: "
					+ billDMO.getSubscriberId() + " EXCEPTION: " + e);

			insert = true;
		} catch (EPPIXUnexpectedException e) {
			logger.error("Exception getting billing details from table: "
					+ billTable + " for Subscriber: "
					+ billDMO.getSubscriberId() + " EXCEPTION: " + e);
			insert = true;
		} catch (EPPIXFatalException e) {
			logger.error("Exception getting billing details from table: "
					+ billTable + " for Subscriber: "
					+ billDMO.getSubscriberId() + " EXCEPTION: " + e);
			insert = true;
		}



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

		} else {

			filter = new QueryFilter();
			// filter.add(FilterOp.SET, BillCccccyyyymmddDMO.batchRunNumFilter,
			// billDMO.getBatchRunNum());
			filter.add(FilterOp.SET, BillCccccyyyymmddDMO.billdatFilter,
					billDMO.getBilldat());
			filter.add(FilterOp.SET, BillCccccyyyymmddDMO.billindFilter,
					billDMO.getBillind());
			filter.add(FilterOp.SET, BillCccccyyyymmddDMO.chargeClassIdFilter,
					billDMO.getChargeClassId());
			filter.add(FilterOp.SET, BillCccccyyyymmddDMO.chargeFilter,
					billDMO.getCharge());
			filter.add(FilterOp.SET, BillCccccyyyymmddDMO.chaservFilter,
					billDMO.getChaserv());
			// filter.add(FilterOp.SET, BillCccccyyyymmddDMO.costFilter,
			// billDMO.getCost());
			filter.add(FilterOp.SET, BillCccccyyyymmddDMO.currencyChargeFilter,
					billDMO.getCurrencyCharge());
			filter.add(FilterOp.SET, BillCccccyyyymmddDMO.cycleNoFilter,
					billDMO.getCycleNo());
			filter.add(FilterOp.SET, BillCccccyyyymmddDMO.endPeriodFilter,
					billDMO.getEndPeriod());
			filter.add(FilterOp.SET, BillCccccyyyymmddDMO.exchangeRateFilter,
					billDMO.getExchangeRate());
			filter.add(FilterOp.SET, BillCccccyyyymmddDMO.exchOperatorFilter,
					billDMO.getExchOperator());
			filter.add(FilterOp.SET, BillCccccyyyymmddDMO.handsetFilter,
					billDMO.getHandset());
			filter.add(FilterOp.SET, BillCccccyyyymmddDMO.invoiceNoFilter,
					billDMO.getInvoiceNo());
			filter.add(FilterOp.SET, BillCccccyyyymmddDMO.packgeFilter,
					billDMO.getPackge());
			filter.add(FilterOp.SET, BillCccccyyyymmddDMO.sparechFilter,
					billDMO.getSparech());
			filter.add(FilterOp.SET, BillCccccyyyymmddDMO.startPeriodFilter,
					billDMO.getStartPeriod());
			filter.add(FilterOp.SET, BillCccccyyyymmddDMO.subscriberIdFilter,
					billDMO.getSubscriberId());
			filter.add(FilterOp.SET, BillCccccyyyymmddDMO.technologyFilter,
					billDMO.getTechnology());
			filter.add(FilterOp.SET, BillCccccyyyymmddDMO.timestampFilter,
					billDMO.getTimestamp());
			filter.add(FilterOp.SET, BillCccccyyyymmddDMO.twinbillNoFilter,
					billDMO.getTwinbillNo());
			filter.add(FilterOp.SET, BillCccccyyyymmddDMO.vatamtFilter,
					billDMO.getVatamt());
			filter.add(FilterOp.SET, BillCccccyyyymmddDMO.vatcodeFilter,
					billDMO.getVatcode());
			filter.add(FilterOp.SET, BillCccccyyyymmddDMO.vatrateFilter,
					billDMO.getVatrate());

			filter.add(FilterOp.EQUAL, BillCccccyyyymmddDMO.billIdFilter,
					billCccccyyyymmddDMO.getBillId());

			try {
				base.billCccccyyyymmdd().modify(filter, billTable);
			} catch (EPPIXBusinessException e) {
				logger.error("Exception updating billing details to table: "
						+ billTable + " for Subscriber: "
						+ billDMO.getSubscriberId() + " EXCEPTION: " + e);
				throw new EPPIXFatalException(
						"Exception updating billing details to table: "
								+ billTable + " for Subscriber: "
								+ billDMO.getSubscriberId() + " EXCEPTION: "
								+ e);
			} catch (EPPIXUnexpectedException e) {

				logger.error("Exception updating billing details to table: "
						+ billTable + " for Subscriber: "
						+ billDMO.getSubscriberId() + " EXCEPTION: " + e);
				throw new EPPIXFatalException(
						"Exception updating billing details to table: "
								+ billTable + " for Subscriber: "
								+ billDMO.getSubscriberId() + " EXCEPTION: "
								+ e);
			} catch (EPPIXFatalException e) {
				logger.error("Exception updating billing details to table: "
						+ billTable + " for Subscriber: "
						+ billDMO.getSubscriberId() + " EXCEPTION: " + e);
				throw new EPPIXFatalException(
						"Exception updating billing details to table: "
								+ billTable + " for Subscriber: "
								+ billDMO.getSubscriberId() + " EXCEPTION: "
								+ e);
			}
		}

		Integer billRecordId = billDMO.getBillId();


		/**
		 * SJ: We already have the SBD record, no need to call for it again.
		 */


		service.updateCrbCharges(sbdDMO.getSbdBillAcNo(), billDMO.getChaserv(),
				billDMO.getCharge());
		//
		// IF g_status_class <> 0 THEN
		//
		// CALL Error_Append ("", l_function)
		// EXIT WHILE
		//
		// END IF
		//
		// ## LET l_retval = nupdatelimitdiffs_fgl ("C", l_bill_ac_no, 0)
		// CALL d_upd_limit_diff("C", l_bill_ac_no, 0) RETURNING l_retval
		Integer returnVal = service.updateLimitDiff("C", sbdDMO.getSbdBillAcNo(), 0);

		switch (returnVal.intValue()) {
		// CASE l_retval
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

		/**
		 * SJ: No need to check for existance before update.
		 * 
		 * However, we can pass the BLH object to the next function call
		 * 
		 * Getting error on select as more than one record returned.
		 * 
		 * Done change: 03-06-2015
		 * 
		 */

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

		service.updateBlhCharge(billDMO.getCharge(), blhDMO);

		returnVal = service.updateLimitDiff("S", sbdDMO.getSbdBillAcNo(),
				blhDMO.getBlhSubscriberId());
		//
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
	
	private boolean useOldProccess(String userName,
			String hostName, String language, String msisdnNo,
			Date effectiveDate, String referenceNo, String netwrkServ,
			String servDescription, String recurring, BigDecimal prorateChg,
			BigDecimal subCharge, BigDecimal limitValue, String action) {
		
		try {
			this.getSpvParamValues(netwrkServ);
		} catch (EPPIXSeriousException e1) {
			logger.error(e1.getMessage());
		}

		if (spvDMO == null) {
			logger.error("Failed to get parameterized details for NET WORK SERVICE CODE: "
					+ netwrkServ);

			this.setParameterized(false);

			/**
			 * If fail get normal services.
			 */


			try {
				this.getTsTariffServiceByNetServCode(netwrkServ,
						sbdDMO.getSbdPackageCode(), sbdDMO.getSbdTariffPlan());
			} catch (EPPIXSeriousException e) {
				logger.error(e.getMessage());
			}

			if (tsDMO == null) {
				logger.error("Failed to get TS CHARGES for NETWORK SERVICE CODE: "
						+ netwrkServ
						+ " PACKAGE CODE: "
						+ sbdDMO.getSbdPackageCode()
						+ " INTERN TARIFF PLAN: "
						+ sbdDMO.getSbdTariffPlan());
				
				return false;

			}

		} else {

			try {
				this.getSpcParamConfig(spvDMO.getSpvParamId());
			} catch (EPPIXSeriousException e1) {
				logger.error(e1.getMessage());
			}
			
			if (spcDMO == null) {
				logger.error("Failed to get parameter config details for PARAM ID: "
						+ spvDMO.getSpvParamId());
				return false;
			}

			this.setParameterized(true);

			try {
				this.getTsTariffServiceByServiceCode(spcDMO.getSpcServiceCode(),
						sbdDMO.getSbdPackageCode(), sbdDMO.getSbdTariffPlan());
			} catch (EPPIXSeriousException e) {
				logger.error(e.getMessage());
			}

			if (tsSCDMO == null) {
				logger.error("Failed to get TS CHARGES for SERVICE CODE: "
						+ spcDMO.getSpcServiceCode() + " PACKAGE CODE: "
						+ sbdDMO.getSbdPackageCode() + " INTERN TARIFF PLAN: "
						+ sbdDMO.getSbdTariffPlan());

			}
		}
		
		/**
		 * Check if the service exists for the subscriber, 
		 * if found, follow the old proccess and writ to SSR
		 */
		
		DAOIterator paramIT = null;
		PsdParamServDetDMO psdDMO = null;
		
		if(isParameterized) {
			// Check if service exists in PSH/PSD
			
			try {
				paramIT = this.service.subscriberUpgradeMigradeDAC.getParameterizedValues(tsDMO.getTsServiceCode(), this.sbdDMO.getSbdSubscriberId());
			} catch (EPPIXSeriousException e) {
				logger.error(e.getMessage());
			}
			
			if (paramIT != null) {
				while (paramIT.hasNext()) {
					psdDMO = (PsdParamServDetDMO) paramIT.next();
					this.setOldProccess(true);
					break;
				}
			}
		}else {
			// Check if service exists in VAS
			VasActiveServiceDMO vasDmo = null;
			
			vasDmo = this.getVas(sbdDMO.getSbdSubscriberId(), tsDMO.getTsServiceCode());
			
			if(vasDmo != null) {			
				this.setOldProccess(true);
			}
		}
		
		if(isOldProccess()) {
			SsrServiceReqDMO ssrDMO = new SsrServiceReqDMO();
			ssrDMO.setSsrMsisdnNo(msisdnNo);
			ssrDMO.setSsrEffectiveDate((effectiveDate == null) ? new DateTime() : new DateTime(effectiveDate));
			ssrDMO.setSsrReferenceNo(referenceNo);
			ssrDMO.setSsrNetwrkServ(netwrkServ);
			ssrDMO.setSsrRecurring(recurring);
			ssrDMO.setSsrActionReq("REMOVE");
			ssrDMO.setSsrProrateChg((this.getProrateChg() == null) ? new BigDecimal("0.00")
					: this.getProrateChg());
			ssrDMO.setSsrSubCharge((subCharge == null) ? new BigDecimal("0.00")
					: subCharge);
			ssrDMO.setSsrUnits("");
			ssrDMO.setSsrUnitOfMeas("");
			ssrDMO.setSsrLimitValue((limitValue == null) ? 0 :limitValue.toBigInteger().intValue());
			ssrDMO.setSsrSystemReq(hostName);
			ssrDMO.setSsrStatus("P");
			ssrDMO.setSsrN2nReq("N");   // Change requested by Ntsasa to default "N" rather then "Y"
			
			try {
				this.insertServiceAction(ssrDMO);
			} catch (EPPIXSeriousException e) {
				logger.error(e.getMessage());
			}
		}
		
		return this.isOldProccess();
	}
	
	public void getSpvParamValues(String netWrkCode)
			throws EPPIXSeriousException {

		QueryFilter filter = new QueryFilter();
		filter.add(FilterOp.EQUAL, SpvParamValuesDMO.spvNetwrkCodeFilter,
				netWrkCode);

		try {
			spvDMO = this.base.spvParamValues().get(filter);

		} catch (EPPIXBusinessException e) {
			logger.error("Failed to get SPV for NETWRKCODE: " + netWrkCode);
		} catch (EPPIXUnexpectedException e) {
			logger.error("Failed to get SPV for NETWRKCODE: " + netWrkCode);
		} catch (EPPIXFatalException e) {
			logger.error("Failed to get SPV for NETWRKCODE: " + netWrkCode);
		}
	}
	
	private void getSpcParamConfig(Integer paramId)
			throws EPPIXSeriousException {

		QueryFilter filter = new QueryFilter();
		filter.add(FilterOp.EQUAL, SpcParamConfigDMO.spcParamIdFilter, paramId);

		try {
			spcDMO = this.base.spcParamConfig().get(filter);
		} catch (EPPIXBusinessException e) {
			logger.error("Failed to get SPC for paramId: " + paramId);
		} catch (EPPIXUnexpectedException e) {
			logger.error("Failed to get SPC for paramId: " + paramId);
		} catch (EPPIXFatalException e) {
			logger.error("Failed to get SPC for paramId: " + paramId);
		}

	}
	
	public void getTsTariffServiceByServiceCode(String servCode,
			String packageCode, String intTariff) throws EPPIXSeriousException {

		QueryFilter filter = new QueryFilter();
		filter.add(FilterOp.EQUAL, TsTariffServiceDMO.tsServiceCodeFilter,
				servCode);
		filter.add(FilterOp.EQUAL, TsTariffServiceDMO.tsPackageCodeFilter,
				packageCode);
		filter.add(FilterOp.EQUAL, TsTariffServiceDMO.tsInternalTariffFilter,
				intTariff);

		try {
			tsSCDMO = this.base.tsTariffService().get(filter);
		} catch (EPPIXBusinessException e) {
			logger.error("Failed to get TS CHARGES for SERVICE CODE: "
					+ servCode + " PACKAGE CODE: " + packageCode
					+ " INTERN TARIFF PLAN: " + intTariff + " EXCEPTION: " + e);
		} catch (EPPIXUnexpectedException e) {
			logger.error("Failed to get TS CHARGES for SERVICE CODE: "
					+ servCode + " PACKAGE CODE: " + packageCode
					+ " INTERN TARIFF PLAN: " + intTariff + " EXCEPTION: " + e);
		} catch (EPPIXFatalException e) {
			logger.error("Failed to get TS CHARGES for SERVICE CODE: "
					+ servCode + " PACKAGE CODE: " + packageCode
					+ " INTERN TARIFF PLAN: " + intTariff + " EXCEPTION: " + e);
		}

	}
	
	public void insertServiceAction(SsrServiceReqDMO ssrDMO) throws EPPIXSeriousException {
		logger.debug("insertSsrSelfServRecurr() throws EPPIXSeriousException");
		
		try {
			base.ssrServiceReq().create(ssrDMO);
		} catch (EPPIXBusinessException e) {
			logger.debug("Exception writing SSR table: " + ssrDMO.toString() + "" + e.getMessage());
			throw new EPPIXSeriousException("2", "Failed to write request to Service Action table");
		} catch (EPPIXUnexpectedException e) {
			logger.debug("Exception writing SSR table: " + ssrDMO.toString());
			throw new EPPIXSeriousException("2", "Failed to write request to Service Action table");
		} catch (EPPIXFatalException e) {
			logger.debug("Exception writing SSR table: " + ssrDMO.toString());
			throw new EPPIXSeriousException("2", "Failed to write request to Service Action table");
		}

	}
	
	private VasActiveServiceDMO getVas(Integer subscriberId, String serviceCode) {
		
		QueryFilter filter = new QueryFilter();
		filter.add(FilterOp.EQUAL, VasActiveServiceDMO.vasSubscriberIdFilter,
				subscriberId);
		filter.add(FilterOp.EQUAL, VasActiveServiceDMO.vasServiceCodeFilter, serviceCode);
		VasActiveServiceDMO vasDmo = null;

		try {
			vasDmo = this.base.vasActiveService().get(filter);
		} catch (EPPIXBusinessException e) {
			logger.error("Failed to get VAS for SUBSCRIBER: " + subscriberId + " SERVICE CODE: "
					+ serviceCode + " EXCEPTION: " + e);
		} catch (EPPIXUnexpectedException e) {
			logger.error("Failed to get VAS for SUBSCRIBER: " + subscriberId + " SERVICE CODE: "
					+ serviceCode + " EXCEPTION: " + e);
		} catch (EPPIXFatalException e) {
			logger.error("Failed to get VAS for SUBSCRIBER: " + subscriberId + " SERVICE CODE: "
					+ serviceCode + " EXCEPTION: " + e);
		}
		
		return vasDmo;
	}
	
	public void closeAll(){
		this.service = null;
		this.serviceSUL = null;
		this.deviceService = null;
	}

	public BigDecimal getSubChargeVatIncl() {
		return subChargeVatIncl;
	}

	public void setSubChargeVatIncl(BigDecimal subChargeVatIncl) {
		this.subChargeVatIncl = subChargeVatIncl;
	}

	public BigDecimal getSubChargeVatEcl() {
		return subChargeVatEcl;
	}

	public void setSubChargeVatEcl(BigDecimal subChargeVatEcl) {
		this.subChargeVatEcl = subChargeVatEcl;
	}

	public boolean isParameterized() {
		return isParameterized;
	}

	public void setParameterized(boolean isParameterized) {
		this.isParameterized = isParameterized;
	}

	public boolean isOldProccess() {
		return isOldProccess;
	}

	public void setOldProccess(boolean isOldProccess) {
		this.isOldProccess = isOldProccess;
	}
	
	private boolean getTT(String group, String type) {
		
		QueryFilter filter = new QueryFilter();
		filter.add(FilterOp.EQUAL, TtTypeTextDMO.ttGroupFilter, group);
		filter.add(FilterOp.EQUAL, TtTypeTextDMO.ttTypeFilter, type);
		TtTypeTextDMO ttDmo = null;
		
		try {
			ttDmo = base.ttTypeText().get(filter);
		} catch (EPPIXBusinessException | EPPIXUnexpectedException | EPPIXFatalException e) {
			logger.error(e.getMessage());
			return false;
		}
		
		if(ttDmo == null) {
			return false;
		}else {
			return true;
		}
	}
	
	public boolean createSSR(String msisdnNo,
			Date effectiveDate, String referenceNo, String netwrkServ,
		String servDescription, String recurring, BigDecimal prorateChg,
			BigDecimal subCharge, BigDecimal limitValue, String action, SbdSubDetsDMO sbdDmo, VamActiveMsisdnDMO vamDmo) throws EPPIXSeriousException {
		
		
		SsrServiceReqDMO ssrDMO = new SsrServiceReqDMO();
		ssrDMO.setSsrMsisdnNo(msisdnNo);
		ssrDMO.setSsrEffectiveDate((effectiveDate == null) ? new DateTime() : new DateTime(effectiveDate));
		ssrDMO.setSsrReferenceNo(referenceNo);
		ssrDMO.setSsrNetwrkServ(netwrkServ);
		ssrDMO.setSsrRecurring(recurring);
		ssrDMO.setSsrActionReq(action);
		ssrDMO.setSsrProrateChg((prorateChg == null) ? new BigDecimal("0.00")
				: prorateChg);
		ssrDMO.setSsrSubCharge((subCharge == null) ? new BigDecimal("0.00")
				: subCharge);
//		ssrDMO.setSsrUnits();
//		ssrDMO.setSsrUnitOfMeas(unitOfMeas);
		ssrDMO.setSsrLimitValue((limitValue == null) ? new Integer("0"): new Integer(limitValue.intValue()));
				
		ssrDMO.setSsrSystemReq("SELFSERVIC");
		ssrDMO.setSsrStatus("P");
		ssrDMO.setSsrN2nReq("N");
		ssrDMO.setSsrBillAcNo(sbdDmo.getSbdBillAcNo());
		ssrDMO.setSsrSubscriberId(sbdDmo.getSbdSubscriberId());
		ssrDMO.setSsrSimNo(vamDmo.getVamSimNo());
		ssrDMO.setSsrPackageCode(sbdDmo.getSbdPackageCode());
		
		try {
			base.ssrServiceReq().create(ssrDMO);
		} catch (EPPIXBusinessException e) {
			logger.debug("Exception writing SSR table: " + ssrDMO.toString() + "" + e.getMessage());
			throw new EPPIXSeriousException("2", "Failed to write request to Service Action table");
		} catch (EPPIXUnexpectedException e) {
			logger.debug("Exception writing SSR table: " + ssrDMO.toString());
			throw new EPPIXSeriousException("2", "Failed to write request to Service Action table");
		} catch (EPPIXFatalException e) {
			logger.debug("Exception writing SSR table: " + ssrDMO.toString());
			throw new EPPIXSeriousException("2", "Failed to write request to Service Action table");
		}
		
		return true;
	}
	
	/**
	 * SV Add check if existing early term quote exists.
	 * If exists fail with message
	 * Transaction Restricted
	 * 05-12-2023
	 */
	private boolean checkEarlyTermQuoteExists(Integer subscriberId, String msisdnNo) {
		
		IntegerDMO intDmo = null;
		
		try {
			intDmo = this.selfServBundleProvDAC.checkEarlyTermQuoteExists(subscriberId, msisdnNo);
		} catch (EPPIXSeriousException e) {
			logger.error(e.getMessage());
			return false;
		}
		
		if(intDmo != null && intDmo.getIntValue() > 0) {
			return true;
		}
		
		return false;
		
	}
	
}
