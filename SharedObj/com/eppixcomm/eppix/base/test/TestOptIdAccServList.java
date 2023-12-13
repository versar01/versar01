package com.eppixcomm.eppix.base.test;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.jws.WebParam;

import org.apache.log4j.Logger;

import com.eppixcomm.eppix.base.blo.AuxCustomersDMO;
import com.eppixcomm.eppix.base.blo.BaseBLO;
import com.eppixcomm.eppix.base.blo.BaseBLOBinder;
import com.eppixcomm.eppix.base.blo.BaseMessages;
import com.eppixcomm.eppix.base.blo.BlhBillLimitHdDMO;
import com.eppixcomm.eppix.base.blo.ChgChargesDMO;
import com.eppixcomm.eppix.base.blo.GetSULMaxUsageAllowed;
import com.eppixcomm.eppix.base.blo.GetServiceDiscount;
import com.eppixcomm.eppix.base.blo.GetSubscriberUpgradeEligibility;
import com.eppixcomm.eppix.base.blo.HeliosRpcServices;
import com.eppixcomm.eppix.base.blo.IDAccSubServListBLO;
import com.eppixcomm.eppix.base.blo.IDAccSubServListDAC;
import com.eppixcomm.eppix.base.blo.SbdSubDetsDMO;
import com.eppixcomm.eppix.base.blo.SbeSubEquipDMO;
import com.eppixcomm.eppix.base.blo.SksKeySettingDMO;
import com.eppixcomm.eppix.base.blo.SubscriberUpgradeMigrade;
import com.eppixcomm.eppix.base.blo.TsTariffServiceDMO;
import com.eppixcomm.eppix.base.blo.TtTypeTextDMO;
import com.eppixcomm.eppix.base.blo.VamActiveMsisdnDMO;
import com.eppixcomm.eppix.base.blo.VasActiveServiceDMO;
import com.eppixcomm.eppix.base.blo.VcfVrbleChrgFeeDMO;
import com.eppixcomm.eppix.base.blo.VsrServiceDMO;
import com.eppixcomm.eppix.base.blo.VstServiceTypesDMO;
import com.eppixcomm.eppix.base.error.EPPIXBusinessException;
import com.eppixcomm.eppix.base.error.EPPIXFatalException;
import com.eppixcomm.eppix.base.error.EPPIXObjectNotFoundException;
import com.eppixcomm.eppix.base.error.EPPIXSeriousException;
import com.eppixcomm.eppix.base.error.EPPIXUnexpectedException;
import com.eppixcomm.eppix.base.error.Thrower;
import com.eppixcomm.eppix.base.errors.ApplicationMessages;
import com.eppixcomm.eppix.base.resp.IDAccSubServListResp;
import com.eppixcomm.eppix.base.utils.AccSubServRecord;
import com.eppixcomm.eppix.base.utils.DynamicCreditLimit;
import com.eppixcomm.eppix.common.data.DAC;
import com.eppixcomm.eppix.common.data.DAOIterator;
import com.eppixcomm.eppix.common.data.DTOActionTypes;
import com.eppixcomm.eppix.common.util.Date;
import com.eppixcomm.eppix.common.util.FilterOp;
import com.eppixcomm.eppix.common.util.QueryFilter;
import com.eppixcomm.eppix.soa.sharedservices.blo.AsrSpcSpvDQO;
import com.eppixcomm.eppix.soa.sharedservices.blo.CpoCplanOpenDMO;
import com.eppixcomm.eppix.soa.sharedservices.blo.DldDynmcLmtDetDMO;
import com.eppixcomm.eppix.soa.sharedservices.blo.DlhDynmcLmtHdrDMO;
import com.eppixcomm.eppix.soa.sharedservices.blo.EhEppixHierarchyDMO;
import com.eppixcomm.eppix.soa.sharedservices.blo.EhHhDQO;
import com.eppixcomm.eppix.soa.sharedservices.blo.HhHierarchyHeadDMO;
import com.eppixcomm.eppix.soa.sharedservices.blo.IdAccSubServListDQO;
import com.eppixcomm.eppix.soa.sharedservices.blo.PsdSpcPshDQO;
import com.eppixcomm.eppix.soa.sharedservices.blo.ScSerialCustomerDMO;


public class TestOptIdAccServList  extends BaseBLO implements DTOActionTypes, BaseMessages, ApplicationMessages {
	private static Thrower thrower = Thrower.getThrower(IDAccSubServListBLO.class);
	private Logger logger = thrower.getLogger();
	public IDAccSubServListDAC iDAccSubServListDAC;
	private BaseBLOBinder base;
	private Connection connection;
	private ResultSet rs = null;
	private Statement st = null;
	private SubscriberUpgradeMigrade service;
	private HeliosRpcServices helRpcService;
	private GetServiceDiscount servDiscount;
	private GetSubscriberUpgradeEligibility subEligService;
	private GetSULMaxUsageAllowed maxUsageService;
	private String cpnPlan;
	private SimpleDateFormat dtFormatyyyymmddStandard = new SimpleDateFormat(
			"yyyy-MM-dd");
	private boolean hasScEhHH = false;
	private Object[] scEhHH = null;
	private String accountCheck = "";
	private Integer legalEntityId = null;
	
	@Override
	protected Class getDACClass() {
		return IDAccSubServListDAC.class;
	}

	@Override
	protected void setDAC(DAC dac) {
		this.iDAccSubServListDAC = (IDAccSubServListDAC) dac;

	}

	/**
	 * #------------------------------------------------------------------------------#
	 * # Purpose: Retrieves multiple rows from the 'bnk_epp_recon' table. # #
	 * Accepts: p_type, p_account, p_msisdn, p_id, p_passport # # Returns: (Uses the
	 * 'C' function Push_IDAccSubServ_List) # # l_accsubserv.* - Complete Account
	 * Sub serv tables record #
	 * #------------------------------------------------------------------------------#
	 * //	FUNCTION IDAccSubServ_List(p_type, p_account, p_msisdn,
		//	p_id, p_passport, p_reg_no, p_no_of_recs)
	 */
	public IDAccSubServListResp getListIDAccServ(String type, String accountNo, String msisdn, String id,
			String passport, String regNo, Integer noOfRecs) {
							
		int count = 0;

		IDAccSubServListResp response = new IDAccSubServListResp();
		try {
			service = base.subscriberUpgradeMigrade();
			service.setBase(this.base);
			service.setConnection(this.connection);
		} catch (EPPIXFatalException e1) {
			StringWriter stack = new StringWriter();
			e1.printStackTrace(new PrintWriter(stack));
			logger.debug("\nEXCEPTION TRACE: \n" + stack.toString());
			logger.error("Failed to initialize services: Exception: " + e1.getMessage());
			response.setEppixStatus("0");
			response.setErrorCode("3");
			response.setErrorType("3");
			response.setIsamError("Failed to initialize services, fatal condition, admin to investigate");
			return response;
		}

		try {
			helRpcService = base.getHeliosRpcServices();
			helRpcService.setBase(base);
			helRpcService.setConnection(connection);
		} catch (EPPIXFatalException e1) {
			StringWriter stack = new StringWriter();
			e1.printStackTrace(new PrintWriter(stack));
			logger.debug("\nEXCEPTION TRACE: \n" + stack.toString());
			logger.error("Failed to initialize HEL RPC services: Exception: " + e1.getMessage());
			response.setEppixStatus("0");
			response.setErrorCode("3");
			response.setErrorType("3");
			response.setIsamError("Failed to initialize HEL RPC services, fatal condition, admin to investigate");
			return response;
		}

		try {
			servDiscount = base.getServiceDiscount();
			servDiscount.setBase(base);
			servDiscount.setConnection(connection);
		} catch (EPPIXFatalException e1) {
			StringWriter stack = new StringWriter();
			e1.printStackTrace(new PrintWriter(stack));
			logger.debug("\nEXCEPTION TRACE: \n" + stack.toString());
			logger.error("Failed to initialize discount services: Exception: " + e1.getMessage());
			response.setEppixStatus("0");
			response.setErrorCode("3");
			response.setErrorType("3");
			response.setIsamError("Failed to initialize discount services, fatal condition, admin to investigate");
			return response;
		}

		try {
			subEligService = base.getGetSubscriberUpgradeEligibility();
			subEligService.setBase(base);
			subEligService.setConnection(connection);
		} catch (EPPIXFatalException e1) {
			StringWriter stack = new StringWriter();
			e1.printStackTrace(new PrintWriter(stack));
			logger.debug("\nEXCEPTION TRACE: \n" + stack.toString());
			logger.error("Failed to initialize sub services: Exception: " + e1.getMessage());
			response.setEppixStatus("0");
			response.setErrorCode("3");
			response.setErrorType("3");
			response.setIsamError("Failed to initialize sub services, fatal condition, admin to investigate");
			return response;
		}

		try {
			maxUsageService = base.getGetSULMaxUsageAllowed();
			maxUsageService.setBase(base);
			maxUsageService.setConnection(connection);
			maxUsageService.initiatedServices();
		} catch (EPPIXFatalException e1) {
			StringWriter stack = new StringWriter();
			e1.printStackTrace(new PrintWriter(stack));
			logger.debug("\nEXCEPTION TRACE: \n" + stack.toString());
			logger.error("Failed to initialize max usage services: Exception: " + e1.getMessage());
			response.setEppixStatus("0");
			response.setErrorCode("3");
			response.setErrorType("3");
			response.setIsamError("Failed to initialize max usage services, fatal condition, admin to investigate");
			return response;
		} catch (EPPIXSeriousException e) {
			logger.error("Failed to initialize max usage services: Exception: " + e.getMessage());
			response.setEppixStatus("0");
			response.setErrorCode("3");
			response.setErrorType("3");
			response.setIsamError("Failed to initialize max usage services, fatal condition, admin to investigate");
			return response;
		}

		
		VamActiveMsisdnDMO vamDmo = null;
		VasActiveServiceDMO vasDmo = null;
		VsrServiceDMO vsrDmo = null;
		SksKeySettingDMO sksDmo = null;
		AccSubServRecord accSubServRecord = null;

		AuxCustomersDMO auxDmo = null;
		DlhDynmcLmtHdrDMO dlhDmo = null;
		DldDynmcLmtDetDMO dldDMo = null;
		VstServiceTypesDMO vstDmo = null;
		TsTariffServiceDMO tsDmo = null;
		DynamicCreditLimit dclObj = null;

		String subId = null;
		String msisdnNo = null;
		String simNo = null;
		String vamMsisdn = null;
		String vamSim = null;
		String asrMsisdn = null;
		String asrSim = null;
		String vasService = null;
		String asrService = null;
		String serviceCode = null;
		String packageCode = null;
		String tariffPlan = null;
		String pshServType = null;
		String psdChgValue = null;
		String msisdnKnown = null;
		boolean vamCheck = false;
		boolean paramFlag = false;
		boolean pshFlag = false;
		Integer noPeriod = new Integer("0");
		Integer noAdd = new Integer("0");
		BigDecimal aveSpend = new BigDecimal("0.00");
		BigDecimal vatPercentage = null;
		BigDecimal creditLimit = null;
		DAOIterator dldIt = null;
		List<IdAccSubServListDQO> listId = null;
		DAOIterator psdSpcPshIt = null;
		TtTypeTextDMO ttDmo = null;
		String advPayments = "N";
		BigDecimal totalPayment = null;

		boolean isCheck = false;

		if ((accountNo == null || accountNo.length() <= 0) && (msisdn == null || msisdn.length() <= 0)
				&& (id == null || id.length() <= 0) && (passport == null || passport.length() <= 0)
				&& (regNo == null || regNo.length() <= 0)) {

			logger.error("Mandatory parameter p_account / p_msisdn / p_id / p_passport / p_reg is NULL");
			response.setEppixStatus("0");
			response.setErrorCode("1");
			response.setErrorType("1");
			response.setIsamError("Mandatory parameter p_account / p_msisdn / p_id / p_passport / p_reg is NULL");
			return response;
		}

		if (noOfRecs == null) {
			logger.error("Mandatory parameter NoRecs is NULL");
			response.setEppixStatus("0");
			response.setErrorCode("1");
			response.setErrorType("1");
			response.setIsamError("Mandatory parameter NoRecs is NULL");
			return response;
		}

		if (id != null && id.length() > 0) {
			isCheck = true;
		}

		if ((passport != null && passport.length() > 0) && isCheck) {
			logger.error("Only one of (id / passport / NoRecs) to be provided");
			response.setEppixStatus("0");
			response.setErrorCode("1");
			response.setErrorType("1");
			response.setIsamError("Only one of (id / passport / NoRecs) to be provided");
			return response;
		}


//	        ## populate average spend

		try {
			vatPercentage = this.service.getVatPercentage();
		} catch (EPPIXSeriousException e) {
			logger.error("\nFailed to get the VAT percentage: " + e.getMessage());
		}

		if (vatPercentage == null) {
			logger.error("\nFailed to get the VAT percentage");
			vatPercentage = new BigDecimal("00.00");
		} else {
			vatPercentage = vatPercentage.divide(new BigDecimal("100"), 2, RoundingMode.HALF_UP);
			vatPercentage = vatPercentage.add(new BigDecimal("1.00"));
			logger.debug("\nvatPercentage: " + vatPercentage);
		}

		try {
			sksDmo = this.getSks("ADVPAYMNT");
		} catch (EPPIXSeriousException e) {
			logger.error(e.getMessage());
		}

		if (sksDmo == null) {
			advPayments = "N";
		} else {
			advPayments = sksDmo.getSksValue();
		}


		if ((passport == null || passport.length() <= 0) && (id == null || id.length() <= 0)) {
			if (accountNo != null && accountNo.length() > 0) {
				try {
					auxDmo = this.helRpcService.getAuxCustomer(accountNo);
				} catch (EPPIXFatalException e) {
					logger.error(e.getMessage());
				}

				if (auxDmo == null) {
					logger.error("FAILED TO GET AUX RECORD FOR ACCOUNT: " + accountNo);
					response.setEppixStatus("0");
					response.setErrorCode("1");
					response.setErrorType("1");
					response.setIsamError("FAILED TO GET AUX RECORD FOR ACCOUNT: " + accountNo);
					return response;
				} else {
					id = auxDmo.getIdNumber();
					passport = auxDmo.getAuxAnalysis13();
				}
			}
		}

		if ((passport != null && passport.length() > 0) || (id != null && id.length() > 0)) {

			try {
				dlhDmo = this.helRpcService.getDlhDynamicLmtHdr(id, passport);
			} catch (EPPIXSeriousException e) {
				logger.error(e.getMessage());
			}

			if (dlhDmo != null) {
				dclObj = new DynamicCreditLimit();
				dclObj.setTotalSubscription(dlhDmo.getDlhAvailCredit());
				dclObj.setTotalDCL(dlhDmo.getDlhDclValue());
				dclObj.setAvailableDCL(dlhDmo.getDlhAvailCredit());
//
				if (accountNo == null || accountNo.length() <= 0) {

					try {
						dldIt = this.helRpcService.getDldDynamicLmtDetById(dlhDmo.getDlhId());
					} catch (EPPIXSeriousException e) {
						logger.error(e.getMessage());
					}

					if (dldIt != null) {
						while (dldIt.hasNext()) {
							dldDMo = (DldDynmcLmtDetDMO) dldIt.next();

							dclObj.setDclId(dldDMo.getDldId());
							if (dclObj.getAllocatedDCL() == null) {
								dclObj.setAllocatedDCL(dldDMo.getDldAllocatedDcl());
							} else {
								dclObj.setAllocatedDCL(dclObj.getAllocatedDCL().add(dldDMo.getDldAllocatedDcl()));
							}
						}
					}
				} else {

					try {
						dldDMo = this.helRpcService.getDldDynamicLmtDetByAccAndId(accountNo, dlhDmo.getDlhId());
					} catch (EPPIXSeriousException e) {
						logger.error(e.getMessage());
					}

					if (dldDMo != null) {
						dclObj.setDclId(dldDMo.getDldId());
						dclObj.setAllocatedDCL(dldDMo.getDldAllocatedDcl());
					}
				}
			}

			if ("Y".equals(advPayments)) {
				try {
					totalPayment = this.getVcfAdvPayments(id, passport, "AP");
				} catch (EPPIXSeriousException e) {
					logger.error(e.getMessage());
				}

				if (totalPayment == null) {

					dclObj.setAdvPayments(new BigDecimal("0.00"));

				} else {
					dclObj.setAdvPayments(totalPayment);
				}
			} else {
				dclObj.setAdvPayments(new BigDecimal("0.00"));
			}
		}

//			-- Validations complete - Open Cursor  IdAccSubServListDQO
		try {
			listId = this.getIdAccSubServList(accountNo, msisdn, id, passport, regNo);
		} catch (EPPIXSeriousException e) {
			logger.error(e.getMessage());
		}
		
		AccSubServRecord accsubserv = new AccSubServRecord();
		
		

		/**
	if (listId != null) {
//		while(count < noOfRecs.intValue()) {
			for (IdAccSubServListDQO dqo : listId) {
				logger.debug(dqo.toString());

				vamCheck = true;
				
				logger.debug("\nSUBSCRIBER TO PROCCESS: " + dqo.getSubId());

				try {
					vamDmo = this.iDAccSubServListDAC.getVamActiveMsisdn(dqo.getSubId());
				} catch (EPPIXSeriousException e) {
					logger.error(e.getMessage());
				}

				if (vamDmo == null) {

					vamCheck = false;
					msisdnKnown = "1";
					msisdnNo = dqo.getAsrMsisdn();
					simNo = dqo.getAsrSim();

				} else {
					msisdnKnown = vamDmo.getVamMsisdnKnown();
					msisdnNo = vamDmo.getVamMsisdnNo();
					simNo = vamDmo.getVamSimNo();
				}

				logger.debug("\ndqo.getVsmService(): " + dqo.getVsmService() + "\ndqo.getAsrService(): "
						+ dqo.getAsrService());

//
				if (!"0".equals(dqo.getVsmService().trim())) {
					if (!"0".equals(dqo.getAsrService().trim())) {
						if (!dqo.getVsmService().trim().equals(dqo.getAsrService().trim())) {
							continue;
						}
					}

					serviceCode = dqo.getVsmService();
				} else {
					if (!"0".equals(dqo.getAsrService().trim())) {
						serviceCode = dqo.getAsrService();
					} else {
						serviceCode = "NONE";
					}
				}

				paramFlag = false;

				try {
					accSubServRecord = this.IdPopulateAccSubServ(type, dqo.getAccount(), dqo.getId(), dqo.getAccountType(),
							dqo.getCreditLimit(), dqo.getCreditClass(), dqo.getAccountStatus(), dqo.getMtnStatus(),
							dqo.getLadStatus1(), dqo.getSubId(), msisdnNo, simNo, serviceCode, dqo.getPackageCode(),
							dqo.getTariffPlan().trim(), msisdnKnown, dqo.getTermDate(), vatPercentage);
				} catch (EPPIXSeriousException e) {
					logger.error(e.getMessage());
				}


				if ("Y".equals(accSubServRecord.getParam())) {

					try {
						vsrDmo = this.service.getVsr(serviceCode);

						if (vsrDmo == null) {
							logger.error("Failed to get Vsr record for service code: " + serviceCode);
						}
					} catch (EPPIXSeriousException e) {
						logger.error(
								"Failed to get Vsr record for service code: " + serviceCode + ": " + e.getMessage());
					}

					if (vsrDmo != null) {
						try {
							vstDmo = this.service.getVst(vsrDmo.getVsrServiceType());

							if (vstDmo == null) {
								logger.error(
										"Failed to get Vst record for service type: " + vsrDmo.getVsrServiceType());
//								throw new EPPIXSeriousException("Failed to get Vst record for service type: " + vsrDmo.getVsrServiceType());
							}
						} catch (EPPIXSeriousException e) {
							logger.error("Failed to get Vst record for service type: " + vsrDmo.getVsrServiceType()
									+ ": " + e.getMessage());
						}
					}
//
//					CALL d_ts_get(l_package_code, l_service_code, l_tariff_plan) RETURNING l_ts.*
					try {
						tsDmo = this.service.subscriberUpgradeMigradeDAC.getTsTariffService(packageCode, serviceCode,
								tariffPlan);
					} catch (EPPIXObjectNotFoundException e) {
						logger.error("Exception getting TS record for packageCode: " + packageCode + " service: "
								+ service + " tariff: " + tariffPlan + " EXCEPTION: " + e);
//						throw new EPPIXSeriousException("1",
//								"Exception getting TS record for packageCode: "
//										+ packageCode + " service: " + service
//										+ " tariff: " + tariffPlan + " EXCEPTION: " + e);
					} catch (EPPIXSeriousException e) {
						logger.error("Exception getting TS record for packageCode: " + packageCode + " service: "
								+ service + " tariff: " + tariffPlan + " EXCEPTION: " + e);
					}

					pshFlag = false;

					try {
						psdSpcPshIt = this.iDAccSubServListDAC.getPsdPshSpc(dqo.getSubId(), simNo, serviceCode);
					} catch (EPPIXSeriousException e) {
						logger.error("Exception getting PsdPshSpc record for subscriber: " + dqo.getSubId()
								+ " packageCode: " + packageCode + " service: " + serviceCode + " EXCEPTION: " + e);
					}
					PsdSpcPshDQO psdSpcPshDqo = null;
//						#TUTD
					while (psdSpcPshIt.hasNext()) {
						psdSpcPshDqo = (PsdSpcPshDQO) psdSpcPshIt.next();

						accSubServRecord.setParamId(psdSpcPshDqo.getPsdParamId().toString());
						accSubServRecord.setParamName(psdSpcPshDqo.getSpcParamName());
						accSubServRecord.setParamValue(psdSpcPshDqo.getPsdParamValue());
						accSubServRecord.setParamCharge(psdSpcPshDqo.getPsdSubCharge());

//						##SELF SERVICE RECURRING
						ttDmo = this.getTT("CHGVARPARM", psdSpcPshDqo.getPshServiceType());

						if (ttDmo == null) {
							ttDmo = new TtTypeTextDMO();
							ttDmo.setTtType("");

						}
//
//						##SELF SERVICE RECURRING
//						##TUTD
						if (psdSpcPshDqo.getPshServiceType().equals(ttDmo.getTtType())) {
//							##add vat to value
							accSubServRecord.setParamChargeValue(psdSpcPshDqo.getPsdChgValue().add(psdSpcPshDqo
									.getPsdChgValue().multiply(vatPercentage).divide(new BigDecimal("100"))));
						} else {
//							##add vat to value
							
							if (tsDmo != null) {
								accSubServRecord.setParamChargeValue(this.getIdSubChg(psdSpcPshDqo.getPsdSubCharge(),
										serviceCode, tsDmo.getTsChargePeriod(), tsDmo.getTsChargeFreq()));
								accSubServRecord.setParamChargeValue(accSubServRecord.getParamChargeValue()
										.add(accSubServRecord.getParamChargeValue().multiply(vatPercentage)
												.divide(new BigDecimal("100"))));
							}
						}
//						##TUTD

						if (accSubServRecord.getHandsetCost() == null) {
							accSubServRecord.setHandsetCost(new BigDecimal("0.00"));
						}

						response.addDetails(accSubServRecord);

						if (!pshFlag) {
							DAOIterator asrIt = null;

							try {
								asrIt = this.iDAccSubServListDAC.getAsrSpcSpv(dqo.getSubId(), serviceCode);
							} catch (EPPIXSeriousException e) {
								logger.error(e.getMessage());
							}

							while (asrIt.hasNext()) {
								AsrSpcSpvDQO asrDqo = (AsrSpcSpvDQO) asrIt.next();

								accSubServRecord.setParamId(asrDqo.getAsrParamId().toString());
								accSubServRecord.setParamName(asrDqo.getSpcParamName());
								accSubServRecord.setParamValue(asrDqo.getAsrParamValue());
								accSubServRecord.setParamCharge(asrDqo.getSpvChargeCode());
								accSubServRecord.setParamChargeValue(this.getIdSubChg(asrDqo.getSpvChargeCode(),
										serviceCode, tsDmo.getTsChargePeriod(), tsDmo.getTsChargeFreq()));

								accSubServRecord.setParamChargeValue(accSubServRecord.getParamChargeValue()
										.add(accSubServRecord.getParamChargeValue().multiply(vatPercentage)
												.divide(new BigDecimal("100"))));
//							##add vat to charge value
								if (accSubServRecord.getHandsetCost() == null) {
									accSubServRecord.setHandsetCost(new BigDecimal("0.00"));
								}

								response.addDetails(accSubServRecord);

							}
						}
					}
					paramFlag = true;
			}

				if (!paramFlag) {

					if (accSubServRecord.getHandsetCost() == null) {
						accSubServRecord.setHandsetCost(new BigDecimal("0.00"));
					}

					response.addDetails(accSubServRecord);
				}
			}
//			count++;
//		}
	}*/

		if (response.getDetails() == null) {
			response.setEppixStatus("0");
			response.setErrorCode("1");
			response.setErrorType("1");
			response.setIsamError("NO ROWS RETURNED");
		} else {
			response.setEppixStatus("0");
			response.setErrorCode("0");
			response.setErrorType("0");
			response.setIsamError("SUCCESS");
		}

		return response;
	}

	private SksKeySettingDMO getSks(String sksCode) throws EPPIXSeriousException {

		QueryFilter filter = new QueryFilter();
		filter.add(FilterOp.EQUAL, SksKeySettingDMO.sksKeyCodeFilter, sksCode);
		SksKeySettingDMO sksDmo = null;

		try {
			sksDmo = base.sksKeySetting().get(filter);
		} catch (EPPIXBusinessException e2) {
			logger.error("Exception getting System key SSRSPULUPD" + e2);
			throw new EPPIXSeriousException("", "Exception getting System key SSRSPULUPD" + e2);

		} catch (EPPIXUnexpectedException e2) {
			logger.error("Exception getting System key SSRSPULUPD" + e2);
			throw new EPPIXSeriousException("", "Exception getting System key SSRSPULUPD" + e2);
		} catch (EPPIXFatalException e2) {
			logger.error("Exception getting System key SSRSPULUPD" + e2);
			throw new EPPIXSeriousException("", "Exception getting System key SSRSPULUPD" + e2);
		}

		if (sksDmo == null) {
			logger.error("Failed getting System key SSRSPULUPD");
			throw new EPPIXSeriousException("", "Exception getting System key SSRSPULUPD");
		}

		return sksDmo;
	}

	public BigDecimal getVcfAdvPayments(String rsaId, String passport, String variableType)
			throws EPPIXSeriousException {
		// FUNCTION d_vcf_get_adv_payments (p_id_no, p_passport_no, p_variable_type)

		BigDecimal amount = null;
		Statement st = null;
		ResultSet rs = null;

		String sql = "SELECT NVL(SUM(vcf_month_amt), '0.00') FROM vcf_vrble_chrg_fee, aux_customers WHERE vcf_customer = bill_ac_no AND vcf_status IN ('A', 'P') ";

		if (variableType != null && variableType.length() > 0) {
			sql = sql + " AND vcf_variable_type = '" + variableType + "'";
		}

		if (rsaId != null && rsaId.length() > 0) {
			sql = sql + " AND id_number = '" + rsaId + "'";
		}

		if (passport != null && passport.length() > 0) {
			sql = sql + " AND aux_analysis_13 = '" + passport + "'";
		}

		logger.debug("\nSQL: " + sql);

		try {
			st = this.getConnection().createStatement();
			rs = st.executeQuery(sql);

			while (rs.next()) {
				amount = rs.getBigDecimal(1);
			}
		} catch (SQLException e) {

			logger.error("Exception getting variable charges for RSAID: " + rsaId + " PASSPORT:" + passport
					+ " EXCEPTION: " + e);
			throw new EPPIXSeriousException("Exception getting variable charges for RSAID: " + rsaId + " PASSPORT:"
					+ passport + " EXCEPTION: " + e);
		}

		if (amount == null) {
			logger.error("Exception getting variable charges for RSAID: " + rsaId + " PASSPORT:" + passport);
			throw new EPPIXSeriousException(
					"Exception getting variable charges for RSAID: " + rsaId + " PASSPORT:" + passport);
		}

		return amount;

	}

	/**
	 * #------------------------------------------------------------------------------#
	 * # Purpose : Opens a cursor # # Accepts : p_id The account ID number # #
	 * Returns : Nothing #
	 * #------------------------------------------------------------------------------#
	 * FUNCTION d_idaccsubserv_list_open(p_account, p_msisdn, p_id, p_passport,
	 * p_reg_no)
	 * 
	 * @throws EPPIXSeriousException
	 *
	 */
	public List<IdAccSubServListDQO> getIdAccSubServList(String accountNo, String msisdn, String rsaId, String passport,
			String regNo) throws EPPIXSeriousException {

		IdAccSubServListDQO dqo = null;
		List<IdAccSubServListDQO> list = null;

		String sql = "SELECT {+FIRST_ROWS} UNIQUE bill_ac_no, id_number, aux_account_type, credit_limit, aux_credit_class, "
				+ "acc_status, aux_analysis_24, analysis_codes1, sbd_subscriber_id, sbd_package_code, sbd_tariff_plan, "
				+ "nvl(vsm_msisdn_no,'0') vsm_msisdn_no, '0' vam_sim_no, '0' asr_msisdn_no, "
				+ "'0' asr_sim_no, nvl(vsm_service_code,'0') vsm_service_code, '0' asr_service_code, sbd_term_date ";

		if (msisdn == null || msisdn.length() <= 0) {
			sql = sql
					+ " FROM aux_customers, slcustm, sbd_sub_dets, vsm_service_msisdn, tt_type_text, vam_active_msisdn "
					+ " WHERE 1=1 ";
		} else {
			sql = sql + " FROM aux_customers, slcustm, sbd_sub_dets, vsm_service_msisdn, vam_active_msisdn "
					+ " WHERE 1=1 ";
		}
		if (accountNo != null && accountNo.length() > 0) {
			sql = sql + " AND bill_ac_no = '" + accountNo + "'";
		}

		if (msisdn == null || msisdn.length() <= 0) {
			sql = sql + " and tt_group = 'ACCTYPE' " + " and tt_text in ('S', 'C') "
					+ " and tt_type = aux_account_type ";
		} else {
			sql = sql + " AND sbd_dialling_no = '" + msisdn + "'";
		}

		if (rsaId != null && rsaId.length() > 0) {
			sql = sql + " AND id_number matches '" + rsaId + "'";
		}

		if (passport != null && passport.length() > 0) {
			sql = sql + " AND aux_analysis_13 = '" + passport + "'";
		}

		if (regNo != null && regNo.length() > 0) {
			sql = sql + " AND comp_reg_no = '" + regNo + "'";
		}

		sql = sql + " AND bill_ac_no = customer " + " AND bill_ac_no = sbd_bill_ac_no "
				+ " AND sbd_subscriber_id = vsm_subscriber_id " + " and acc_status != 'CLO' "
				+ " and vam_subscriber_id = vsm_subscriber_id " + " and vam_msisdn_no = vsm_msisdn_no "
				+ " and vam_hierarchy = '0' " + " AND vam_msisdn_known in ('1','2') "
				+ " AND vam_stat_code not in ('6','7') " + "UNION "
				+ "SELECT {+FIRST_ROWS} UNIQUE bill_ac_no, id_number, aux_account_type, credit_limit, aux_credit_class, "
				+ "acc_status, aux_analysis_24, analysis_codes1, sbd_subscriber_id, sbd_package_code, sbd_tariff_plan, "
				+ " '0' vsm_msisdn_no, '0' vam_sim_no, nvl(asr_msisdn_no,'0') asr_msisdn_no, "
				+ " nvl(asr_sim_no,'0') asr_sim_no, '0' vsm_service_code, nvl(asr_service_code,'0') asr_service_code, sbd_term_date ";

		if (msisdn == null || msisdn.length() <= 0) {
			sql = sql + " FROM aux_customers, slcustm, sbd_sub_dets, asr_add_serv_req, tt_type_text " + " WHERE 1=1 ";
		} else {
			sql = sql + " FROM aux_customers, slcustm, sbd_sub_dets, asr_add_serv_req " + " WHERE 1=1 ";
		}

		if (accountNo != null && accountNo.length() > 0) {
			sql = sql + " AND bill_ac_no = '" + accountNo + "'";
		}

		if (msisdn == null || msisdn.length() <= 0) {
			sql = sql + " and tt_group = 'ACCTYPE' " + " and tt_text in ('S', 'C') "
					+ " and tt_type = aux_account_type ";
		} else {
			sql = sql + " AND asr_msisdn_no = '" + msisdn + "'";
		}

		if (rsaId != null && rsaId.length() > 0) {
			sql = sql + " AND id_number matches '" + rsaId + "'";
		}

		if (passport != null && passport.length() > 0) {
			sql = sql + " AND aux_analysis_13 = '" + passport + "'";
		}

		if (regNo != null && regNo.length() > 0) {
			sql = sql + " AND comp_reg_no = '" + regNo + "'";
		}

		sql = sql + " AND bill_ac_no = customer " + "AND bill_ac_no = sbd_bill_ac_no "
				+ "AND sbd_subscriber_id = asr_subscriber_id " + "AND asr_active_flag = 'N' "
				+ "AND NOT EXISTS (select 1 from vam_active_msisdn where vam_subscriber_id = sbd_subscriber_id) "
				+ " AND asr_action_type in ('SBACT', 'IVRTP', 'NRACT', 'PEACT') " + " and acc_status != 'CLO' "
				+ "ORDER BY 1, 9, 8, 15 DESC ";

		logger.debug("\n" + sql);

		try {
			st = this.getConnection().createStatement();
			rs = st.executeQuery(sql);

//			CALL d_idaccsubserv_list_fetch (l_loop) RETURNING l_account, l_id, l_account_type, l_credit_limit,
//			l_credit_class, l_account_status, l_mtn_status,
//			l_lad_status1, l_sub_id, l_package_code, l_tariff_plan,
//			l_vam_msisdn, l_vam_sim, l_asr_msisdn, l_asr_sim,
//			l_vas_service, l_asr_service, l_term_date
//

			while (rs.next()) {
				dqo = new IdAccSubServListDQO();

				dqo.setAccount(rs.getString("bill_ac_no"));
				dqo.setId(rs.getString("id_number"));
				dqo.setAccountType(rs.getString("aux_account_type"));
				dqo.setSubId(rs.getInt("sbd_subscriber_id"));
				dqo.setVamMsisdn(rs.getString("vsm_msisdn_no"));
				dqo.setVamSim(rs.getString("vam_sim_no"));
				dqo.setAsrMsisdn(rs.getString("asr_msisdn_no"));
				dqo.setAsrSim(rs.getString("asr_sim_no"));
				dqo.setVsmService(rs.getString("vsm_service_code"));
				dqo.setAsrService(rs.getString("asr_service_code"));
				dqo.setPackageCode(rs.getString("sbd_package_code"));
				dqo.setTariffPlan(rs.getString("sbd_tariff_plan"));
				dqo.setCreditLimit(rs.getBigDecimal("credit_limit"));
				dqo.setCreditClass(rs.getString("aux_credit_class"));
				dqo.setAccountStatus(rs.getString("acc_status"));
				dqo.setMtnStatus(rs.getString("aux_analysis_24"));
				dqo.setLadStatus1(rs.getString("analysis_codes1"));
				dqo.setTermDate((rs.getDate(18) == null) ? null : new Date(rs.getDate("sbd_term_date")));

				if (list == null) {
					list = new ArrayList<IdAccSubServListDQO>();
					list.add(dqo);
				} else {
					list.add(dqo);
				}

			}
		} catch (SQLException e) {

			logger.error("Exception getting variable charges for RSAID: " + rsaId + " PASSPORT:" + passport
					+ " EXCEPTION: " + e);
			throw new EPPIXSeriousException("Exception getting variable charges for RSAID: " + rsaId + " PASSPORT:"
					+ passport + " EXCEPTION: " + e);
		}

		return list;

	}

	/**
	 * FUNCTION idpopulate_accsubserv(p_type, p_account, p_id, p_account_type,
	 * p_credit_limit, p_credit_class, p_account_status, p_mtn_status,
	 * p_lad_status1, p_subscriber_id, p_msisdn_no, p_sim_no, p_service_code,
	 * p_package_code, p_tariff_plan, p_msisdn_known, p_term_date, p_vatrate)
	 */
	public AccSubServRecord IdPopulateAccSubServ(String type, String account, String id, String accountType,
			BigDecimal creditLimit, String creditClass, String accountStatus, String mtnStatus, String ladStatus1,
			Integer subscriberId, String msisdnNo, String simNo, String serviceCode, String packageCode,
			String tariffPlan, String msisdnKnown, Date termDate, BigDecimal VatRate) throws EPPIXSeriousException {


		logger.debug("\nSTART: AccSubServRecord IdPopulateAccSubServ");
		
		String collPlan = "";

		VsrServiceDMO vsrDmo = null;
		VstServiceTypesDMO vstDmo = null;
		TsTariffServiceDMO tsDmo = null;
		SbeSubEquipDMO sbeDmo = null;
		VcfVrbleChrgFeeDMO vcfDmo = null;
		CpoCplanOpenDMO cpoDmo = null;
		BlhBillLimitHdDMO blhDmo = null;
		VasActiveServiceDMO vasDmo = null;
		EhEppixHierarchyDMO ehDmo = null;
		ScSerialCustomerDMO scDmo = null;
		HhHierarchyHeadDMO hhDmo = null;
		EhHhDQO ehhhDQO = null;
		SbdSubDetsDMO sbdDmo = null;

		BigDecimal chrgSub1 = null;
		BigDecimal chrgSub2 = null;
		BigDecimal chrgSub3 = null;
		BigDecimal servDisc = null;
		boolean pushStatus = false;
		String error = null;
		String function = null;
		String triggerDesc = null;
		String description = null;
		int noPeriods = 0;
		int noAdd = 0;
//		Integer legalEntityId = null;
		BigDecimal avSpend = null;
		BigDecimal maxAllowed = null;
		BigDecimal remAmt = null;
		BigDecimal totalSpuls = null;

		AccSubServRecord accsubserv = new AccSubServRecord();

		sbdDmo = this.service.getSbd(subscriberId);

		if (sbdDmo == null) {
			logger.error("Failed to get SBD for subscriber: " + subscriberId);
			throw new EPPIXSeriousException("Failed to get SBD for subscriber: " + subscriberId);
		}

		if ("C".equals(type)) {

			accsubserv.setAccount(account);
			accsubserv.setIdNum(id);
			accsubserv.setAccountType(accountType);
			accsubserv.setCreditLimit(creditLimit);
			accsubserv.setCreditClass(creditClass);
			accsubserv.setAccountStatus(accountStatus);
			accsubserv.setMtnStatus(mtnStatus);
			accsubserv.setLadStatus1(ladStatus1);
			accsubserv.setCollPlan(collPlan);
			accsubserv.setSubscriberId(subscriberId);
			accsubserv.setPackageCode(packageCode);
			accsubserv.setTariffPlan(tariffPlan);
			accsubserv.setMsisdnNo(msisdnNo);

		} else {
			if ("NONE".equals(serviceCode)) {

			} else {

				try {
					vsrDmo = this.service.getVsr(serviceCode);

					if (vsrDmo == null) {
						logger.error("Failed to get Vsr record for service code: " + serviceCode);
						throw new EPPIXSeriousException("Failed to get Vsr record for service code: " + serviceCode);
					}
				} catch (EPPIXSeriousException e) {
					logger.error("Failed to get Vsr record for service code: " + serviceCode + ": " + e.getMessage());
					throw new EPPIXSeriousException(
							"Failed to get Vsr record for service code: " + serviceCode + ": " + e.getMessage());
				}

				try {
					vstDmo = this.service.getVst(vsrDmo.getVsrServiceType());

					if (vstDmo == null) {
						logger.error("Failed to get Vst record for service type: " + vsrDmo.getVsrServiceType());
						throw new EPPIXSeriousException(
								"Failed to get Vst record for service type: " + vsrDmo.getVsrServiceType());
					}
				} catch (EPPIXSeriousException e) {
					logger.error("Failed to get Vst record for service type: " + vsrDmo.getVsrServiceType() + ": "
							+ e.getMessage());
					throw new EPPIXSeriousException("Failed to get Vst record for service type: "
							+ vsrDmo.getVsrServiceType() + ": " + e.getMessage());
				}

//CALL d_ts_get(p_package_code, p_service_code, p_tariff_plan) RETURNING l_ts.*
				try {
					tsDmo = this.service.subscriberUpgradeMigradeDAC.getTsTariffService(packageCode, serviceCode,
							tariffPlan);
				} catch (EPPIXObjectNotFoundException e) {
					logger.error("Exception getting TS record for packageCode: " + packageCode + " service: " + service
							+ " tariff: " + tariffPlan + " EXCEPTION: " + e);
					throw new EPPIXSeriousException("1", "Exception getting TS record for packageCode: " + packageCode
							+ " service: " + service + " tariff: " + tariffPlan + " EXCEPTION: " + e);
				}

				if (tsDmo == null) {

					logger.error("Failed to get TS record for packageCode: " + packageCode + " service: " + service
							+ " tariff: " + tariffPlan);

//	CALL d_vas_get(p_subscriber_id, p_tariff_plan, p_service_code) RETURNING l_vas.*
					vasDmo = this.getVas(subscriberId, serviceCode, tariffPlan);

					if (vasDmo == null) {
						logger.error("Failed to get VAS record for subscriber: " + subscriberId + ": service: "
								+ service + " tariff: " + tariffPlan);
						throw new EPPIXSeriousException("1", "Failed to get VAS record for subscriber: " + subscriberId
								+ ": service: " + service + " tariff: " + tariffPlan);
					}

					tsDmo = new TsTariffServiceDMO();
					tsDmo.setTsSubCharge1(vasDmo.getVasSubCharge1());
					tsDmo.setTsSubCharge2("");
					tsDmo.setTsSubCharge3("");
					tsDmo.setTsChargePeriod("M");
					tsDmo.setTsChargeFreq(1);

				} else {

					if (tsDmo.getTsSubCharge1() == null || tsDmo.getTsSubCharge1().length() == 0) {

						// CALL d_vas_get(p_subscriber_id, p_tariff_plan, p_service_code) RETURNING
						// l_vas.*
						vasDmo = this.getVas(subscriberId, serviceCode, tariffPlan);

						if (vasDmo == null) {
							logger.error("Failed to get VAS record for subscriber: " + subscriberId + ": service: "
									+ service + " tariff: " + tariffPlan);
							throw new EPPIXSeriousException("1", "Failed to get VAS record for subscriber: "
									+ subscriberId + ": service: " + service + " tariff: " + tariffPlan);
						}

						tsDmo = new TsTariffServiceDMO();
						tsDmo.setTsSubCharge1(vasDmo.getVasSubCharge1());
						tsDmo.setTsSubCharge2(vasDmo.getVasSubCharge2());
						tsDmo.setTsSubCharge3(vasDmo.getVasSubCharge3());
						tsDmo.setTsChargePeriod("M");
						tsDmo.setTsChargeFreq(1);
					}
				}

//LET l_chrg_sub1 = idsubchg_get (l_ts.ts_sub_charge1, p_service_code, l_ts.ts_charge_period, l_ts.ts_charge_freq)'
				if (tsDmo.getTsSubCharge1() != null && tsDmo.getTsSubCharge1().trim().length() > 0) {
					chrgSub1 = this.getIdSubChg(tsDmo.getTsSubCharge1().trim(), serviceCode, tsDmo.getTsChargePeriod(),
							tsDmo.getTsChargeFreq());
				}

				if (tsDmo.getTsSubCharge2() != null && tsDmo.getTsSubCharge2().trim().length() > 0) {
//	LET l_chrg_sub2 = idsubchg_get (l_ts.ts_sub_charge2, p_service_code, l_ts.ts_charge_period, l_ts.ts_charge_freq)
					chrgSub2 = this.getIdSubChg(tsDmo.getTsSubCharge2().trim(), serviceCode, tsDmo.getTsChargePeriod(),
							tsDmo.getTsChargeFreq());
				}

				if (tsDmo.getTsSubCharge3() != null && tsDmo.getTsSubCharge3().trim().length()> 0) {
//	LET l_chrg_sub3 = idsubchg_get (l_ts.ts_sub_charge3, p_service_code, l_ts.ts_charge_period, l_ts.ts_charge_freq)
					chrgSub3 = this.getIdSubChg(tsDmo.getTsSubCharge3(), serviceCode, tsDmo.getTsChargePeriod(),
							tsDmo.getTsChargeFreq());
				}
			}
		}

		if (chrgSub1 == null) {
			chrgSub1 = new BigDecimal("0.00");
		}

		if (chrgSub2 == null) {
			chrgSub2 = new BigDecimal("0.00");
		}

		if (chrgSub3 == null) {
			chrgSub3 = new BigDecimal("0.00");
		}

		accsubserv.setAccount(account);
		accsubserv.setIdNum(id);
		accsubserv.setAccountType(accountType);
		accsubserv.setCreditLimit(creditLimit);
		accsubserv.setCreditClass(creditClass);
		accsubserv.setAccountStatus(accountStatus);
		accsubserv.setMtnStatus(mtnStatus);
		accsubserv.setLadStatus1(ladStatus1);
		accsubserv.setCollPlan(collPlan);
		accsubserv.setSubscriberId(subscriberId);
		accsubserv.setPackageCode(packageCode);
		accsubserv.setTariffPlan(tariffPlan);
		accsubserv.setMsisdnNo(msisdnNo);
		accsubserv.setServiceCode(serviceCode);
		accsubserv.setChgCode1((tsDmo.getTsSubCharge1() == null) ? "" : tsDmo.getTsSubCharge1());

//##send value back with vat   
		accsubserv.setChgValue1((chrgSub1.multiply(VatRate)).setScale(2, RoundingMode.HALF_UP));
		accsubserv.setChgCode2(tsDmo.getTsSubCharge1());

		accsubserv.setChgValue2((chrgSub2.multiply(VatRate)).setScale(2, RoundingMode.HALF_UP));
		accsubserv.setChgCode2((tsDmo.getTsSubCharge2() == null) ? "" : tsDmo.getTsSubCharge2());

		accsubserv.setChgValue3((chrgSub3.multiply(VatRate)).setScale(2, RoundingMode.HALF_UP));
		accsubserv.setActInc((tsDmo.getTsActInclusive() == null) ? "" : tsDmo.getTsSubCharge3());

//#NNT - Upfront Discounts
//		Object[] scEhHH = null;
		
		if (!this.hasScEhHH && !this.getAccountCheck().equals(account)) {
			// We will do this check only once SJ: 06-11-2019
			this.setAccountCheck(account);
			hasScEhHH = true;
			
			try {
				this.setScEhHH(this.service.getScEhHH(null, account, "COMPANY", "ACCOUNT"));
			} catch (Exception e) {
				logger.error(e.getMessage());
			}
			

			if (this.scEhHH != null) {
				this.setScEhHH(scEhHH);
				scDmo = (ScSerialCustomerDMO) scEhHH[0];
				ehhhDQO = (EhHhDQO) scEhHH[1];

				ehhhDQO.deConstruct();
				ehDmo = ehhhDQO.getEhDMO();
				hhDmo = ehhhDQO.getHhDMO();

				this.setLegalEntityId(hhDmo.getHhSerial());
			} else {
				this.setLegalEntityId(new Integer("0"));
			}

		}

//CALL d_servicediscount_get (p_subscriber_id, l_legal_entity_id, p_package_code, p_tariff_plan, p_service_code, "E")

		try {
			this.servDiscount.createTempTable();
		} catch (EPPIXSeriousException e1) {
			logger.error("Failed to create the temp table: " + e1.getMessage());
			this.servDiscount.dropTempTable();
			throw new EPPIXSeriousException("Failed to create quality control keys temp table, please retry.");
		}

		try {
			// CALL generate_qual_key (3, p_new_package, l_from, l_to)
			this.servDiscount.generateQualKey(new Integer("3"), packageCode);
		} catch (NumberFormatException e1) {
			logger.error("Failed to generate quality keys: " + e1.getMessage());
			this.servDiscount.dropTempTable();
			throw new EPPIXSeriousException("Failed to create quality control keys temp table, please retry.");
		}

		try {
			// CALL generate_qual_key (6, p_service_code, l_from, l_to)
			this.servDiscount.generateQualKey(new Integer("6"), serviceCode);
		} catch (NumberFormatException e1) {
			logger.error("Failed to generate quality keys: " + e1.getMessage());
			this.servDiscount.dropTempTable();
			throw new EPPIXSeriousException("Failed to create quality control keys temp table, please retry.");
		}

		try {
			// CALL generate_qual_key (7, p_new_tariff, l_from, l_to)
			this.servDiscount.generateQualKey(new Integer("7"), tariffPlan);
		} catch (NumberFormatException e1) {
			logger.error("Failed to generate quality keys: " + e1.getMessage());
			this.servDiscount.dropTempTable();
			throw new EPPIXSeriousException("Failed to generate quality keys: " + e1.getMessage());
		}

		servDisc = this.servDiscount.getServiceDiscount(subscriberId, this.getLegalEntityId(), packageCode, tariffPlan,
				serviceCode, "E");
		this.servDiscount.dropTempTable();

		if (servDisc == null) {
			servDisc = new BigDecimal("0.00");
		}

//LET l_accsubserv.serv_discount = l_serv_disc + (l_serv_disc * p_vatrate/100)
		accsubserv.setServDiscount(servDisc.add(servDisc.multiply(VatRate).divide(new BigDecimal("100").setScale(2, RoundingMode.HALF_UP))));

		if ("2".equals(msisdnKnown)) {
			accsubserv.setDualCall("Y");
		} else {
			accsubserv.setDualCall("N");
		}

		accsubserv.setParam(vstDmo.getVstParameterised());
		accsubserv.setParamId("0");
		accsubserv.setParamName("");
		accsubserv.setParamValue("");
		accsubserv.setParamCharge("");
		accsubserv.setParamChargeValue(new BigDecimal("0.00"));
		accsubserv.setTermDate((termDate == null) ? "" : dtFormatyyyymmddStandard.format(termDate));
		accsubserv.setHandsetCost(new BigDecimal("0.00"));
		accsubserv.setAverageSpend(new BigDecimal("0.00"));
		accsubserv.setCollPlan("");

//
		if ("BSTL".equals(serviceCode)) {
			sbeDmo = this.getSbeBySubId(subscriberId);

			if (sbeDmo == null || sbeDmo.getSbeHandsetVal() == null) {
				accsubserv.setHandsetCost(new BigDecimal("0.00"));
			} else {
				accsubserv.setHandsetCost(new BigDecimal(sbeDmo.getSbeHandsetVal()));
			}
		}

//CALL CollectionPlan_GetOpenPlan(l_accsubserv.account)
		this.getCollectionPlanOpenPlan(account);

		if (this.getCpnPlan() == null || this.getCpnPlan().length() <= 0) {
			accsubserv.setCollPlan("N/A");
		} else {
			accsubserv.setCollPlan(this.getCpnPlan());
		}

//## Average spend
		subEligService.getAvgSpendSub(subscriberId);
		avSpend = (this.subEligService.avgSpend == null) ? new BigDecimal("0.00")
				: new BigDecimal(this.subEligService.avgSpend).setScale(2, RoundingMode.HALF_UP);
		accsubserv.setAverageSpend(avSpend);

//## TUTD HV
		remAmt = service.getVcfMonCalc(account, subscriberId, "", "");

		if (remAmt == null) {
			accsubserv.setChgCode3("");
			accsubserv.setChgValue3(new BigDecimal("0.00"));
		} else {
			accsubserv.setChgCode3("VARCH");
			accsubserv.setChgValue3(remAmt.add(remAmt.multiply(VatRate)).setScale(2, RoundingMode.HALF_UP));
		}

//## TUTD HV
		accsubserv.setMaxUsage(new BigDecimal("0.00"));

		if ("SPUL".equals(serviceCode)) {
			this.maxUsageService.getMaxUsageAllowed(sbdDmo);
			maxAllowed = this.maxUsageService.totalMaxAllowed;
			totalSpuls = this.maxUsageService.totalAccountSPUL;

			if (maxAllowed == null) {
				accsubserv.setMaxUsage(new BigDecimal("0.00"));
			} else {
				accsubserv.setMaxUsage(maxAllowed.setScale(2, RoundingMode.HALF_UP));
			}

			blhDmo = this.service.getBillLimit(subscriberId, "SPUL");
			
			

			if (blhDmo != null) {
				
				blhDmo.setBlhBillLimitVal(blhDmo.getBlhBillLimitVal().setScale(2, RoundingMode.HALF_UP));
				
				if (accsubserv.getChgValue1() != null) {
					accsubserv.setChgValue1(accsubserv.getChgValue1().add(blhDmo.getBlhBillLimitVal()).setScale(2, RoundingMode.HALF_UP));
				} else {
					accsubserv.setChgValue1(blhDmo.getBlhBillLimitVal().setScale(2, RoundingMode.HALF_UP));
				}

			}

		}

//IF p_service_code = "SUL" THEN
		if ("SUL".equals(serviceCode)) {
			blhDmo = this.service.getBillLimit(subscriberId, "SUL");

			if (blhDmo != null) {
				if (accsubserv.getChgValue1() != null) {
					accsubserv.setChgValue1(accsubserv.getChgValue1().add(blhDmo.getBlhBillLimitVal()).setScale(2, RoundingMode.HALF_UP));
				} else {
					accsubserv.setChgValue1(blhDmo.getBlhBillLimitVal().setScale(2, RoundingMode.HALF_UP));
				}

			}
		}
		
		logger.debug("\nEND: AccSubServRecord IdPopulateAccSubServ");
		
		return accsubserv;
	}

	/**
	 * FUNCTION idsubchg_get (p_sub_charge, p_service_code, p_chg_period,
	 * p_chg_freq)
	 * 
	 * @throws EPPIXSeriousException
	 */
	public BigDecimal getIdSubChg(String subCharge, String serviceCode, String chgPeriod, Short chgFreq) {

		BigDecimal chgValue = null;
		Date chgDate = null;

		VsrServiceDMO vsrDmo = null;
		ChgChargesDMO chgDmo = null;

		try {
			vsrDmo = this.service.getVsr(serviceCode);
		} catch (EPPIXSeriousException e) {
			logger.error(e.getMessage());
		}

		if (vsrDmo != null && (subCharge != null && subCharge.trim().length() > 0)) {
//			# Validate the first subscription charge (Return value not required)

			chgDmo = this.service.getChg(subCharge, vsrDmo.getVsrProviderId(), chgDate, null, "F");

			if (chgDmo != null) {
				chgValue = chgDmo.getChgValue();

//				# Check that the charge periods/frequencies match..
				logger.debug("\nCHGDMO: " + chgDmo);

				try {
					this.service.validateChargeFrequency("SERVICE", chgDmo.getChgPeriod(),
							new Integer(chgDmo.getChgFrequency()), chgPeriod, new Integer(chgFreq));
				} catch (EPPIXSeriousException e) {
					logger.error(e.getMessage());
				}
			}
		}
		return chgValue;
	}

	public void getCollectionPlanOpenPlan(String accountNo) {

		String cpnDescription = null;
		String cpnPlan = null;

		String sql = "SELECT * FROM cpo_cplan_open " + "WHERE cpo_bill_ac_no = '" + accountNo + "' "
				+ "AND cpo_status = '0'";

		logger.debug("\n" + sql);

		try {
			st = this.getConnection().createStatement();
			rs = st.executeQuery(sql);

			if (rs.next()) {
				this.setCpnPlan(rs.getString(2).trim());
			}

			rs.close();
			st.close();
		} catch (SQLException e) {
			logger.debug("Failed to collection plan details for account: " + accountNo + " " + e.getMessage());
		} catch (Exception e) {
			logger.debug("Failed to collection plan details for account: " + accountNo + " " + e.getMessage());
		}
	}

	public VasActiveServiceDMO getVas(Integer subscriberId, String serviceCode, String tariffPlan) {

		VasActiveServiceDMO vasDmo = null;
		QueryFilter filter = new QueryFilter();
		filter.add(FilterOp.EQUAL, VasActiveServiceDMO.vasSubscriberIdFilter, subscriberId);
		filter.add(FilterOp.EQUAL, VasActiveServiceDMO.vasServiceCodeFilter, serviceCode);
		filter.add(FilterOp.EQUALORNULL, VasActiveServiceDMO.vasInternTariffFilter, tariffPlan);

		try {
			vasDmo = base.vasActiveService().get(filter);
		} catch (EPPIXBusinessException e) {
			logger.error("Exception getting VAS for Subscriber: " + subscriberId);
		} catch (EPPIXUnexpectedException e) {
			logger.error("Exception getting VAS for Subscriber: " + subscriberId);
		} catch (EPPIXFatalException e) {
			logger.error("Exception getting VAS for Subscriber: " + subscriberId);
		}
		return vasDmo;
	}

	public TtTypeTextDMO getTT(String ttGroup, String ttType) {

		QueryFilter filter = new QueryFilter();
		filter.add(FilterOp.EQUAL, TtTypeTextDMO.ttGroupFilter, ttGroup);
		filter.add(FilterOp.EQUAL, TtTypeTextDMO.ttTypeFilter, ttType);
		filter.add(FilterOp.EQUAL, TtTypeTextDMO.ttLangFilter, "ENG");
		TtTypeTextDMO ttDmo = null;

		try {
			ttDmo = base.ttTypeText().get(filter);

		} catch (EPPIXBusinessException e) {
			logger.error(e.getMessage());
		} catch (EPPIXUnexpectedException e) {
			logger.error(e.getMessage());
		} catch (EPPIXFatalException e) {
			logger.error(e.getMessage());
		}

		return ttDmo;
	}

	private SbeSubEquipDMO getSbeBySubId(Integer subscriberId) {

		SbeSubEquipDMO sbeDmo = null;
		DAOIterator sbeIT = null;

		QueryFilter filter = new QueryFilter();
		filter.add(FilterOp.EQUAL, SbeSubEquipDMO.sbeSubscriberIdFilter, subscriberId);
		filter.add(FilterOp.ORDERBYDESC, SbeSubEquipDMO.sbeSerialNoFilter);

		try {
			sbeIT = base.sbeSubEquip().iterate(filter);
		} catch (EPPIXBusinessException e) {
			logger.error(e.getMessage());
		} catch (EPPIXUnexpectedException e) {
			logger.error(e.getMessage());
		} catch (EPPIXFatalException e) {
			logger.error(e.getMessage());
		}
		
		if(sbeIT != null && sbeIT.hasNext()) {
			sbeDmo = (SbeSubEquipDMO)sbeIT.next();
		}

		return sbeDmo;

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

	public String getCpnPlan() {
		return cpnPlan;
	}

	public void setCpnPlan(String cpnPlan) {
		this.cpnPlan = cpnPlan;
	}

	public Object[] getScEhHH() {
		return scEhHH;
	}

	public void setScEhHH(Object[] scEhHH) {
		this.scEhHH = scEhHH;
	}

	public String getAccountCheck() {
		return accountCheck;
	}

	public void setAccountCheck(String accountCheck) {
		this.accountCheck = accountCheck;
	}

	public Integer getLegalEntityId() {
		return legalEntityId;
	}

	public void setLegalEntityId(Integer legalEntityId) {
		this.legalEntityId = legalEntityId;
	}
}
