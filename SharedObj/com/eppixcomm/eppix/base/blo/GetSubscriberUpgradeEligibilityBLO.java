package com.eppixcomm.eppix.base.blo;

import java.io.PrintWriter;
import java.io.StringWriter;
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
import com.eppixcomm.eppix.base.utils.UpgradeEligibleResponse;
import com.eppixcomm.eppix.common.data.DAC;
import com.eppixcomm.eppix.common.data.DAOIterator;
import com.eppixcomm.eppix.common.data.DTOActionTypes;
import com.eppixcomm.eppix.common.util.Date;
import com.eppixcomm.eppix.common.util.DateTime;
import com.eppixcomm.eppix.common.util.FilterOp;
import com.eppixcomm.eppix.common.util.QueryFilter;
//import com.eppixcomm.eppix.soa.helios.Executor;
//import com.eppixcomm.eppix.soa.helios.HeliosServices;
import com.eppixcomm.eppix.soa.sharedservices.blo.CpoCplanOpenDMO;
import com.eppixcomm.eppix.soa.sharedservices.blo.CviCrmValueIndDMO;
import com.eppixcomm.eppix.soa.sharedservices.blo.PphPayPlanHdrDMO;
import com.eppixcomm.eppix.soa.sharedservices.blo.SbmSubMatrixDMO;
import com.eppixcomm.eppix.soa.sharedservices.blo.TdTelemtryDeviceDMO;

public class GetSubscriberUpgradeEligibilityBLO extends BaseBLO implements DTOActionTypes, BaseMessages {

	private static Thrower thrower = Thrower.getThrower(GetSubscriberUpgradeEligibilityBLO.class);
	private Logger logger = thrower.getLogger();
	public GetSubscriberUpgradeEligibilityDAC getSubscriberUpgradeEligibilityDAC;
	private BaseBLOBinder base;
	private Connection connection;
	private SubscriberUpgradeMigrade subUpgradeMigrService;
	private SimpleDateFormat dtFormatddmmyyyy = new SimpleDateFormat("ddMMyyyy");
	private SimpleDateFormat dtFormatyyyymmdd = new SimpleDateFormat("yyyy-MM-dd");
//	private HeliosServices helCustServices;
//	private Executor helExec = null;
	private String cpnDescription = null;
	private String cpnPlan = null;
	private ResultSet rs = null;
	private Statement st = null;
	private boolean isTest = false;

	protected String userId;
	private String userName;
	private String hostName;
	private VamActiveMsisdnDMO vamDMO = null;
	private SbdSubDetsDMO sbdDMO = null;
	private SbuSubUpgradeDMO sbuDMO = null;
	private SdSimDeactivateDMO sdDMO = null;
	private SfeSimFutEventDMO sfeDMO = null;
	private CviCrmValueIndDMO cviDMO = null;
	private AuxCustomersDMO auxDMO = null;
	private SbmSubMatrixDMO sbmDMO = null;
	private SbmSubMatrixDMO ageSbmDMO = null;
	private NmNetmatDMO nmDMO = null;
	private SbmSubMatrixDMO sbmMatDMO = null;
	private CpoCplanOpenDMO cpoDMO = null;
	private PphPayPlanHdrDMO pphDMO = null;
	private VpkPackageDMO vpkDMO = null;
	private TpTariffPlanDMO tpDMO = null;
	private VcfVrbleChrgFeeDMO vcfDMO = null;
	private TdTelemtryDeviceDMO tdDMO = null;
	protected String networkId;
	protected String networkPrefix;
	public String avgSpend = null;

	private BigDecimal balance;
	private BigDecimal current;
	private BigDecimal fgnBalance;
	private BigDecimal fgnCurrent;
	private BigDecimal fgnNinety;
	private BigDecimal fgnNinetyplus;
	private BigDecimal fgnSixty;
	private BigDecimal fgnThirty;
	private BigDecimal ninety;
	private BigDecimal ninetyplus;
	private BigDecimal sixty;
	private BigDecimal thirty;
	private int noOfItems;

	@Override
	protected Class getDACClass() {
		return GetSubscriberUpgradeEligibilityDAC.class;
	}

	@Override
	protected void setDAC(DAC dac) {
		this.getSubscriberUpgradeEligibilityDAC = (GetSubscriberUpgradeEligibilityDAC) dac;

	}

	/**
	 * 
	 * #------------------------------------------------------------------------------#
	 * # Purpose : Retrieves a list of services per msisdn details. # # Accepts :
	 * p_msisdn_no - Msisdn number # # : p_sim_no - Sim number # # :
	 * p_subscriber_id- Subscriber ID # # : zsize - Used for Array in Tux # #
	 * Returns : l_massmsisdnval - setup record (Check def) #
	 * #------------------------------------------------------------------------------#
	 */
	public UpgradeEligibleResponse getSubscriberUpgradeEligibility(String msisdn, String simNo, Integer subscriberId)
			throws EPPIXSeriousException {
//	FUNCTION SubscriberUpgradeEligibility_Get(p_msisdn_no, p_sim_no, p_subscriber_id, zsize)

		String description = null;
		String ttTriggerDescription = null;
		Integer age = null;
		BigDecimal aveSpend = null;
		Integer ruleNo = null;
		Integer elig = null;

		try {
			subUpgradeMigrService = this.base.subscriberUpgradeMigrade();
			subUpgradeMigrService.setBase(this.base);
			subUpgradeMigrService.setConnection(this.connection);
		} catch (EPPIXFatalException e1) {
			StringWriter stack = new StringWriter();
			e1.printStackTrace(new PrintWriter(stack));
			logger.debug("\nEXCEPTION TRACE: \n" + stack.toString());
		}

//		this.initHeliosCustServices();

		String crmValue = "";
		Date eligDate = null;
		int contAge;
		Date dueDt = null;
		Date today = new Date();
		int daysDifferencce = 0;
		String vpkPackageDesc = null;
		String tariffDescr = null;

		UpgradeEligibleResponse upgval = new UpgradeEligibleResponse();

		upgval.setUpgPackcode("NONE");
		upgval.setUpgTariffcode("NON");
		upgval.setUpgAgingbucket("CURRENT");
		upgval.setUpgDormantperiod(new Integer(0));
		upgval.setUpgPendingsimact(0);
		upgval.setUpgAvespend(new BigDecimal("0.00"));
		upgval.setUpgEligdate(dtFormatyyyymmdd.format(new Date()));
		upgval.setUpgEligFlag("T");
		upgval.setUpgOverwrite("T");
		eligDate = new Date();

		this.subUpgradeMigrService.msisdnIsUsed(msisdn, "ALL");
		this.vamDMO = this.subUpgradeMigrService.getVamDMO();

		if (this.vamDMO == null) {
			logger.error("\nMSISDN Not Found: " + msisdn);
			upgval.setUpgEligFlag("F");
			upgval.setUpgReason("MSISDN Not Found");
			upgval.setUpgOverwrite("F");

			return upgval;
		}

		if (subscriberId != null && subscriberId.intValue() > 0) {

			if (!this.vamDMO.getVamSubscriberId().equals(subscriberId)) {

				upgval.setUpgEligFlag("F");
				upgval.setUpgReason("Subscriber on Sim not Same as subscriber Passed.");
				upgval.setUpgOverwrite("F");

				return upgval;

			}
		}

		this.sbdDMO = this.subUpgradeMigrService.getSbd(this.vamDMO.getVamSubscriberId());

		if (this.sbdDMO == null) {
			upgval.setUpgEligFlag("F");
			upgval.setUpgReason("Subscriber details not found: " + this.vamDMO.getVamSubscriberId());
			upgval.setUpgOverwrite("F");

			return upgval;
		} else {

//				# Subscriber was found. 
			this.sbuDMO = this.subUpgradeMigrService.getSbu(this.vamDMO.getVamSubscriberId(), new Integer("0"));

			if (this.sbuDMO == null) {

				upgval.setUpgEligFlag("F");
				upgval.setUpgReason("Subscriber upgrade details not found: " + this.vamDMO.getVamSubscriberId());
				upgval.setUpgOverwrite("F");
				return upgval;
			}
		}
//			# FTTH Project Start
		this.tdDMO = this.subUpgradeMigrService.getTdc(this.vamDMO.getVamSubscriberId());

		/**
		 * Change to check for td_usage_type being empty or null added
		 * SV: 28-05-2020
		 */
		if (this.tdDMO != null && (this.tdDMO.getTdUsageType() != null || this.tdDMO.getTdUsageType().length() >= 3) ) {
			if (("FTT").equals(this.tdDMO.getTdUsageType().substring(0, 3))) {
				upgval.setUpgEligFlag("F");
				upgval.setUpgReason("Fiber to the Home Subscriber: Not Eligible.");
				upgval.setUpgOverwrite("F");
				return upgval;
			}
		}

		this.nmDMO = this.subUpgradeMigrService.getNm(this.sbdDMO.getSbdTariffPlan());

		if (this.nmDMO == null) {

			upgval.setUpgEligFlag("F");
			upgval.setUpgReason(
					"Failed to get the net work tariff details for tariff plan: " + this.sbdDMO.getSbdTariffPlan());
			upgval.setUpgOverwrite("F");
			return upgval;
		} else {

			if (("PREPD").equals(this.nmDMO.getNmNetType())) {
				upgval.setUpgEligFlag("F");
				upgval.setUpgReason("User is not eligible: Prepaid Subscriber.");
				upgval.setUpgOverwrite("F");
				return upgval;
			}
		}

//			#NNT - Get MTN Status from aux_customers
		try {
			this.auxDMO = this.subUpgradeMigrService.getAuxCustomer(this.sbdDMO.getSbdBillAcNo());
		} catch (EPPIXFatalException e1) {
			logger.error(e1.getMessage());
		}

		if (this.auxDMO == null) {
			upgval.setUpgEligFlag("F");
			upgval.setUpgReason("Customer details not found for customer: " + this.sbdDMO.getSbdBillAcNo());
			upgval.setUpgOverwrite("F");
			return upgval;

		} else {
//				#Override l_sbu.sbu_mtn_status and l_sbu.sbu_account_status
			this.sbuDMO.setSbuMtnStatus(this.auxDMO.getAuxAnalysis24());
			this.sbuDMO.setSbuAccountStatus(this.auxDMO.getAccStatus());
			this.sbuDMO.setSbuCustomerType(this.auxDMO.getAuxAccountType());
		}

		// #HV 139559 Eppix Errors do check for future deact.
		this.sdDMO = this.subUpgradeMigrService.getSimFutureDeactivate(this.vamDMO.getVamSimNo());

		if (sdDMO != null) {
			upgval.setUpgEligFlag("F");
			upgval.setUpgReason(
					"There is a pending Future Deactivation for the subscriber. Please remove it before upgrade will be allowed.");
			upgval.setUpgOverwrite("F");
			return upgval;
		} else {

		}

//			#KA - Check if sim is pending migration
		boolean isMigrPending = this.isMigrationPending(this.vamDMO.getVamSimNo());

		if (isMigrPending) {
			upgval.setUpgEligFlag("F");
			upgval.setUpgReason("Migration is pending on sim(" + this.vamDMO.getVamSimNo() + ")");
			upgval.setUpgOverwrite("F");
			return upgval;
		} else {
		}

//	        ## populate collection plan

		this.getCollectionPlanOpenRiskPlan(this.sbdDMO.getSbdBillAcNo());

//	        ## if collection plan not found reset the eror
		if (this.getCpnPlan() != null) {
			upgval.setUpgCollplan(this.getCpnPlan());
			this.sbuDMO.setSbuCollPlan(this.getCpnPlan());
		} else {
			upgval.setUpgCollplan("N/A");
			this.sbuDMO.setSbuCollPlan("N/A");
		}

		logger.debug("\nCOLL PLAN AFTER SETTING: " + this.sbuDMO.getSbuCollPlan());

//	        ## populate payment plan
		PphPayPlanHdrDMO pphDMO = null;

		try {
			pphDMO = this.getSubscriberUpgradeEligibilityDAC.getPph(sbdDMO.getSbdBillAcNo());

			if (pphDMO == null) {
				this.sbuDMO.setSbuPaymentPlan("N/A");
			} else {
				this.sbuDMO.setSbuPaymentPlan(pphDMO.getPphPayPlanRef());
			}

		} catch (EPPIXSeriousException e1) {
			logger.error(e1.getMessage());
			this.sbuDMO.setSbuPaymentPlan("N/A");
		}

		/**
		 * no need to get the vam record again.
		 * 
		 */

		if (simNo != null && simNo.length() > 0) {

			if (!this.vamDMO.getVamSimNo().equals(simNo)) {
				upgval.setUpgEligFlag("F");
				upgval.setUpgReason("Sim on Record not Same as subscriber Passed.");
				upgval.setUpgOverwrite("F");
				return upgval;
			}
		}

		if (this.vamDMO.getVamStatCode().equals("4") || this.vamDMO.getVamStatCode().equals("6")) {
			upgval.setUpgEligFlag("F");
			upgval.setUpgReason("SIM is Deactivated");
			upgval.setUpgOverwrite("F");
			return upgval;
		}

		this.sfeDMO = this.subUpgradeMigrService.getSimFutureEvent(this.vamDMO.getVamSimNo(), "");

		if (this.sfeDMO != null && "SIM_ACTIVATE".equals(this.sfeDMO.getSfeFutEventId())) {

			upgval.setUpgEligFlag("F");
			upgval.setUpgReason("SIM is Pending Activation.");
			upgval.setUpgOverwrite("F");
			return upgval;
		}

		Integer countFutEvent = 0;

		countFutEvent = this.subUpgradeMigrService.checkFutureServiceExistsOnSim(this.vamDMO.getVamSimNo(),
				"SERV_ACTIVATE");

		if (countFutEvent != null && countFutEvent.intValue() > 0) {
			upgval.setUpgEligFlag("F");
			upgval.setUpgReason("Service(s) found on SIM which are Pending Activation.");
			upgval.setUpgOverwrite("F");
			return upgval;
		}

//	        ## Average spend
		this.getAvgSpendSub(this.sbdDMO.getSbdSubscriberId());

		if (this.avgSpend == null || this.avgSpend.length() <= 0) {
			upgval.setUpgAvespend(new BigDecimal("0.00"));
		} else {
			try {
				upgval.setUpgAvespend(new BigDecimal(this.avgSpend));
			} catch (NumberFormatException e) {
				upgval.setUpgAvespend(new BigDecimal("0.00"));
			}
		}
		
		this.getCviScv(this.vamDMO.getVamSubscriberId());

		if (this.cviDMO == null) {
			crmValue = "UNB";
		} else {
			/*
			 * CR177159
			CALL TypeText_Get("M2MCRMTYPS", l_aux.aux_analysis_25) RETURNING l_tt.*
			i.	IF Record Found – is M2M Customers Subscriber
				1.	LET l_crm_value = l_aux.aux_analysis_25
			ii.	ELSE (IF Record Not Found – Not M2M Customers Subscriber)
				1.	Error Reset 
				2.	LET l_crm_value = l_cvi.cvi_crm_value
			*/

			if (this.getTyptText("M2MCRMTYPS", this.auxDMO.getAuxAnalysis25(), "")) {
				crmValue = this.auxDMO.getAuxAnalysis25();
			} else {
				crmValue = this.cviDMO.getCviCrmValue();
			}
			
		}

		if (this.sbuDMO.getSbuTermDate() == null) {
			this.sbuDMO.setSbuTermDate(this.vamDMO.getVamContrTerminat());
		}
//
		logger.debug("\nTERM DATE: " + this.sbuDMO.getSbuTermDate());

		if (this.sbuDMO.getSbuTermDate().after(new Date())) {
			
			this.sbuDMO.setSbuContractAge((this.sbuDMO.getSbuContractLen().intValue() - new Integer(
					this.sbuDMO.getSbuTermDate().differenceInMonths(new Date(), this.sbuDMO.getSbuTermDate()))
							.intValue()));
			
			
			logger.debug("\n1 CONTRACT AGE: " + this.sbuDMO.getSbuContractAge());
		} else {
//				--Contract has expired
			this.sbuDMO.setSbuContractAge((this.sbuDMO.getSbuContractLen().intValue()
					+ new Integer(new Date().differenceInMonths(this.sbuDMO.getSbuTermDate(), new Date())).intValue()));
			logger.debug("\n2 CONTRACT AGE: " + this.sbuDMO.getSbuContractAge());
			
			if (this.sbuDMO.getSbuContractAge().intValue() < 0) {
				this.sbuDMO.setSbuContractAge(this.sbuDMO.getSbuContractLen());
			}
		}

		if ("LOC".equals(this.sbuDMO.getSbuAccountStatus())) {

			upgval.setUpgEligFlag("F");
			upgval.setUpgReason("Customer " + this.sbdDMO.getSbdBillAcNo() + " Is Locked. Cannot Migrate !");
			upgval.setUpgOverwrite("F");
			return upgval;
		} else {
			if ("A".equals(this.sbuDMO.getSbuUpgradeStatus())) {

				upgval.setUpgEligFlag("W");
				upgval.setUpgReason("Customer " + this.sbdDMO.getSbdBillAcNo()
						+ " Cannot be Migrate ! Upgrade Status (A/C) OR Identical Package/Tariff Code");
				upgval.setUpgOverwrite("F");
				return upgval;
			}
		}

		dueDt = this.getAgingDueDate(this.sbdDMO.getSbdBillAcNo());

		logger.debug("\nDUE DATE: " + dueDt + " CURRENT DATE: " + today);

//			LET l_date_chk = (l_today - l_due_date)
		daysDifferencce = Date.differenceInDays(dueDt, today);
		logger.debug("\nDUE DATE: " + dueDt + " CURRENT DATE: " + today + " = daysDifferencce: " + daysDifferencce);

		if (daysDifferencce < 1) {
			this.sbuDMO.setSbuAgeingBucket("CURRENT");
		} else if (daysDifferencce < 30) {
			this.sbuDMO.setSbuAgeingBucket("30");
		} else if (daysDifferencce < 60) {
			this.sbuDMO.setSbuAgeingBucket("60");
		} else if (daysDifferencce < 90) {
			this.sbuDMO.setSbuAgeingBucket("90");
		} else if (daysDifferencce >= 90) {
			this.sbuDMO.setSbuAgeingBucket("90+");
		}

		this.sbmDMO = this.getSbmListAll(this.sbdDMO.getSbdPackageCode(), this.sbdDMO.getSbdTariffPlan(),
				this.sbuDMO.getSbuAccountStatus(), this.sbuDMO.getSbuCollPlan(), this.sbuDMO.getSbuPaymentPlan(),
				this.sbuDMO.getSbuMtnStatus(), this.sbuDMO.getSbuCustomerType(), new Integer(0),
				this.sbuDMO.getSbuContractLen(), this.sbuDMO.getSbuAgeingBucket(), this.sbuDMO.getSbuContractAge(),
				null, new Date(), this.sbuDMO.getSbuUserId(), "N", null, "N", null, crmValue);

		if (this.sbmDMO == null) {
			/**
			 * Changed 28-10-2019. Take this out, if no rule is found, then just proceed.
			 */
			
//			upgval.setUpgEligFlag("W");
//			upgval.setUpgReason("Failed to get SBM for subscriber: " + this.sbdDMO.getSbdSubscriberId());
//			upgval.setUpgOverwrite("F");
//			return upgval;
		} else {

			logger.debug("Migration Rule: " + this.sbmDMO.getSbmRuleDesc());

			/*
			 * SM: CR177159
			 */

			if (this.getTyptText("M2MCRMTYPS", this.auxDMO.getAuxAnalysis25(), "")) {

				daysDifferencce = 0;
				if (this.getTyptText("M2MTRNSRST", this.auxDMO.getAuxAnalysis25(), "UPG")) {
					if (this.auxDMO.getConfDate() != null) {
						daysDifferencce = Date.differenceInDays(today, this.auxDMO.getConfDate());
						logger.debug("\nAUX Conf DATE: " + this.auxDMO.getConfDate() + " CURRENT DATE: " + today);
						if (daysDifferencce >= 1) {
							upgval.setUpgEligFlag("F");
							upgval.setUpgReason("Subscriber, " + this.sbdDMO.getSbdSubscriberId()
									+ " Is within the Month To Month Upgrade Restriction Date - "
									+ this.auxDMO.getConfDate());
							upgval.setUpgOverwrite("F");
						} else {

							upgval.setUpgEligFlag("T");
							upgval.setUpgReason("Subscriber, " + this.sbdDMO.getSbdSubscriberId()
									+ " Is outside the Month To Month Upgrade Restriction Date - "
									+ this.auxDMO.getConfDate());
							upgval.setUpgOverwrite("T");
						}
					}

				} else {
					upgval.setUpgEligFlag("F");
					upgval.setUpgReason("Migration Rule: " + this.sbmDMO.getSbmRuleDesc());
					if (this.sbmDMO.getSbmRightId() != null && this.sbmDMO.getSbmRightId().length() > 0) {
						upgval.setUpgOverwrite("T");
					} else {
						upgval.setUpgOverwrite("F");
					}
				}

			} else {
				upgval.setUpgEligFlag("F");
				upgval.setUpgReason("Migration Rule: " + this.sbmDMO.getSbmRuleDesc());
				if (this.sbmDMO.getSbmRightId() != null && this.sbmDMO.getSbmRightId().length() > 0) {
					upgval.setUpgOverwrite("T");
				} else {
					upgval.setUpgOverwrite("F");
				}
			}

		}

		if (!"PREPD".equals(this.nmDMO.getNmNetType())) {
			age = this.getSbuContract(this.sbuDMO.getSbuActivateDate(), new Integer(0));

//			#GNCS - Get the Package and Tariff Codes
			this.getVpk(this.sbdDMO.getSbdPackageCode());

			if (this.vpkDMO == null) {
				vpkPackageDesc = "Package Does not Exist";
			} else {
				vpkPackageDesc = this.vpkDMO.getVpkPackageDesc();
			}

			this.getTpTariffPlan(this.sbdDMO.getSbdTariffPlan());

			if (this.tpDMO == null) {
				tariffDescr = "Tariff Does not Exist";
			} else {
				tariffDescr = this.tpDMO.getTpTarplanText();
			}

			if (this.sbuDMO.getSbuContractLen().intValue() == 0) {
				this.nmDMO = this.subUpgradeMigrService.getNm(this.sbdDMO.getSbdTariffPlan());

				if (this.nmDMO == null) {
					this.sbuDMO.setSbuContractLen(new Integer("1"));
				}
				try {
					this.sbuDMO.setSbuContractLen(new Integer(this.nmDMO.getNmContractPeriod()));
				} catch (NumberFormatException e) {
					this.sbuDMO.setSbuContractLen(new Integer("1"));
				}
			}

			ruleNo = this.getSbmRuleId(this.sbdDMO.getSbdPackageCode(), this.sbdDMO.getSbdTariffPlan(),
					this.sbuDMO.getSbuAccountStatus(), this.sbuDMO.getSbuCollPlan(), this.sbuDMO.getSbuPaymentPlan(),
					this.sbuDMO.getSbuMtnStatus(), this.sbuDMO.getSbuCustomerType(), this.sbuDMO.getSbuContractLen(),
					crmValue);

			if (ruleNo != null) {
				if (ruleNo.intValue() == 0) {
					contAge = this.sbuDMO.getSbuContractLen().intValue();
				} else {

					this.sbmDMO = this.getSbm(ruleNo);
					if (this.sbmDMO != null) {
						contAge = this.sbmDMO.getSbmContractAge().intValue();
					} else {
						contAge = this.sbuDMO.getSbuContractLen().intValue();
					}
				}
			} else {
				contAge = this.sbuDMO.getSbuContractLen().intValue();
			}

			if (contAge == 0) {
				contAge = new Integer(this.nmDMO.getNmContractPeriod()).intValue();
			}

//			## To cater for CPA (post and pre conditions)-KA
			elig = this.sbuDMO.getSbuContractLen().intValue() - contAge;

			if (this.sbuDMO.getSbuTermDate() == null) {
				this.sbuDMO.setSbuTermDate(this.vamDMO.getVamContrTerminat());
			}

			logger.debug("\nELIG: " + elig);

			if (elig <= 0) {
				eligDate = new Date(this.sbuDMO.getSbuTermDate());
			} else {
				eligDate = new Date(this.subUpgradeMigrService.calcMonthDate(this.sbuDMO.getSbuTermDate(), elig, "P"));
			}
		}

		upgval.setUpgPackcode(this.sbdDMO.getSbdPackageCode());
		upgval.setUpgPackname(vpkPackageDesc);
		upgval.setUpgTariffcode(this.sbdDMO.getSbdTariffPlan());
		upgval.setUpgTariffname(tariffDescr);
		upgval.setUpgCollplan((this.sbuDMO.getSbuCollPlan() == null) ? "N/A" : this.sbuDMO.getSbuCollPlan());
		upgval.setUpgPayplan(this.sbuDMO.getSbuPaymentPlan());
		upgval.setUpgCustomertype(this.sbuDMO.getSbuCustomerType());
		upgval.setUpgAccountstatus(this.sbuDMO.getSbuAccountStatus());
		upgval.setUpgMtnstatus(this.sbuDMO.getSbuMtnStatus());
		upgval.setUpgCrmvalue("");
		upgval.setUpgAgingbucket(this.sbuDMO.getSbuAgeingBucket());

		if (this.sbuDMO.getSbuContractLen() != null) {
			upgval.setUpgContractlen(this.sbuDMO.getSbuContractLen());
		}

		if (age == null || age.intValue() == 0) {
			upgval.setUpgPerserved(new Integer(0));
		} else {
			upgval.setUpgPerserved(new Integer(age));
		}

		upgval.setUpgEligdate(dtFormatyyyymmdd.format(eligDate));

//		try {
//			helExec.close();
//		} catch (EPPIXSeriousException e) {
//
//		}
//
//		helExec = null;

		return upgval;

	}

	private void msisdnIsUsed(String msisdn, String type) throws EPPIXSeriousException {

		int status = 0;
		boolean flag = false;

		this.networkId = null;
		this.networkPrefix = null;

		if (type.equals("ACTIVE")) {
			status = 1;
		} else if (type.equals("TDEACT")) {
			status = 4;
		} else if (type.equals("PDEACT")) {
			status = 6;
		} else if (type.equals("SWAPPED")) {
			status = 7;
		} else if (type.equals("ALL")) {
			flag = true;
		} else {
			/**
			 * \ TODO SJ: Handle the error
			 */
		}

		QueryFilter filter = new QueryFilter();
		filter.add(FilterOp.EQUAL, VamActiveMsisdnDMO.vamMsisdnNoFilter, msisdn);

		if (flag) {

			try {
				vamDMO = base.vamActiveMsisdn().get(filter);

				if (vamDMO == null) {
					logger.error("VAM details not found for MSISDN no " + msisdn);
					throw new EPPIXSeriousException("122000", "VAM details not found for MSISDN no " + msisdn);
				} else {
					this.getNetworkMsisdn(msisdn);
				}

			} catch (EPPIXBusinessException e) {
				logger.error("Exception getting VAM details for MSISDN no " + msisdn + " EXCEPTION: " + e);
				throw new EPPIXSeriousException("2",
						"Exception getting VAM details for MSISDN no " + msisdn + " EXCEPTION: " + e);
			} catch (EPPIXUnexpectedException e) {
				logger.error("Exception getting VAM details for MSISDN no " + msisdn + " EXCEPTION: " + e);
				throw new EPPIXSeriousException("2",
						"Exception getting VAM details for MSISDN no " + msisdn + " EXCEPTION: " + e);
			} catch (EPPIXFatalException e) {
				logger.error("Exception getting VAM details for MSISDN no " + msisdn + " EXCEPTION: " + e);
				throw new EPPIXSeriousException("2",
						"Exception getting VAM details for MSISDN no " + msisdn + " EXCEPTION: " + e);
			}

		} else {

			filter.add(FilterOp.EQUAL, VamActiveMsisdnDMO.vamStatCodeFilter, status);

			try {
				vamDMO = base.vamActiveMsisdn().get(filter);

			} catch (EPPIXBusinessException e) {
				logger.error("Exception getting VAM details for MSISDN no " + msisdn + " EXCEPTION: " + e);
				throw new EPPIXSeriousException("122000",
						"Exception getting VAM details for MSISDN no " + msisdn + " EXCEPTION: " + e);
			} catch (EPPIXUnexpectedException e) {
				logger.error("Exception getting VAM details for MSISDN no " + msisdn + " EXCEPTION: " + e);
				throw new EPPIXSeriousException("122000",
						"Exception getting VAM details for MSISDN no " + msisdn + " EXCEPTION: " + e);
			} catch (EPPIXFatalException e) {
				logger.error("Exception getting VAM details for MSISDN no " + msisdn + " EXCEPTION: " + e);
				throw new EPPIXSeriousException("122000",
						"Exception getting VAM details for MSISDN no " + msisdn + " EXCEPTION: " + e);
			}

			if (vamDMO == null) {

				logger.error("VAM details not found for MSISDN no " + msisdn + " WITH VAM STAT CODE: " + status);
				throw new EPPIXSeriousException("122000",
						"VAM details not found for MSISDN no " + msisdn + " WITH VAM STAT CODE: " + status);
			} else {
				this.getNetworkMsisdn(msisdn);
			}
		}
	}

	/**
	 * #------------------------------------------------------------------------------#
	 * # Purpose : Fetch the Network ID and the Network Prefix for the passed MSISDN
	 * # # Accepts : p_msisdn - The Msisdn number # # Returns : l_network_id -
	 * Length of the complete MSISDN number # # l_network_prefix - Does MSISDN mask
	 * contain a prefix (Y/N) #
	 * #------------------------------------------------------------------------------#
	 * FUNCTION Network_GetMsisdn(p_msisdn)
	 * 
	 * @param msisdn
	 * @return
	 * @throws EPPIXSeriousException
	 */
	public boolean getNetworkMsisdn(String msisdn) throws EPPIXSeriousException {

		thrower.ifParameterMissing("msisdn", msisdn);

		boolean success = false;

		QueryFilter filter = new QueryFilter();
		filter.add(FilterOp.LIKE, VpnProviderNetwkDMO.vpnNetworkPrefixFilter, msisdn.substring(0, 2));

		DAOIterator vpnIT = null;

		try {

			vpnIT = base.vpnProviderNetwk().iterate(filter);

			if (vpnIT == null) {
				logger.error("MSISDN " + msisdn + " cannot be matched to a Provider");
				throw new EPPIXSeriousException("1", "MSISDN " + msisdn + " cannot be matched to a Provider");
			} else {
				while (vpnIT.hasNext()) {
					VpnProviderNetwkDMO vpnDMO = (VpnProviderNetwkDMO) vpnIT.next();

					networkId = vpnDMO.getVpnProviderId();
					networkPrefix = vpnDMO.getVpnNetworkPrefix();
					success = true;
					break;
				}
			}

		} catch (EPPIXBusinessException e) {
			logger.error("Exception matching MSISDN " + msisdn + " to a Provider EXCEPTION: " + e);
			throw new EPPIXSeriousException("1",
					"Exception matching MSISDN " + msisdn + " to a Provider EXCEPTION: " + e);

		} catch (EPPIXUnexpectedException e) {
			logger.error("Exception matching MSISDN " + msisdn + " to a Provider EXCEPTION: " + e);
			throw new EPPIXSeriousException("2",
					"Exception matching MSISDN " + msisdn + " to a Provider EXCEPTION: " + e);
		} catch (EPPIXFatalException e) {
			logger.error("Exception matching MSISDN " + msisdn + " to a Provider EXCEPTION: " + e);
			throw new EPPIXSeriousException("2",
					"Exception matching MSISDN " + msisdn + " to a Provider EXCEPTION: " + e);
		}

		return success;

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

//	private void initHeliosCustServices() throws EPPIXSeriousException {
//
//		helExec = null;
//		try {
//
//			helExec = new Executor(this.isTest());
//
//			if (helExec.getErrorCode() != null) {
//				logger.error("Severe errors occured, could not initilaized all services: Helios executor failed"
//						+ helExec.getErrorMessage());
//				throw new EPPIXSeriousException(
//						"Severe errors occured, could not initilaized all services: Helios executor failed"
//								+ helExec.getErrorMessage());
//			}
//		} catch (EPPIXSeriousException e) {
//			StringWriter stack = new StringWriter();
//			e.printStackTrace(new PrintWriter(stack));
//			logger.debug("\nEXCEPTION TRACE: \n" + stack.toString());
//			throw new EPPIXSeriousException(
//					"Severe errors occured, could not initilaized all services: Helios executor failed"
//							+ e.getMessage());
//		} catch (NullPointerException e) {
//			StringWriter stack = new StringWriter();
//			e.printStackTrace(new PrintWriter(stack));
//			logger.debug("\nEXCEPTION TRACE: \n" + stack.toString());
//			throw new EPPIXSeriousException(
//					"Severe errors occured, could not initilaized all services: Helios executor failed"
//							+ e.getMessage());
//		}
//	}

	public void getCollectionPlanOpenRiskPlan(String accountNo) {

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

	private Date getAgingDueDate(String accountNo) {

		String sql = "select nvl(min(due_date), today) from slitemm where customer = '" + accountNo
				+ "' and open_indicator = 'O' ";

		logger.debug("\n" + sql);
		Date dueDate = null;

		try {
			st = this.getConnection().createStatement();
			rs = st.executeQuery(sql);

			if (rs.next()) {
				dueDate = new Date(rs.getDate(1));
			}

			rs.close();
			st.close();
		} catch (SQLException e) {
			logger.debug("Failed to collection plan details for account: " + accountNo + " " + e.getMessage());
		} catch (Exception e) {
			logger.debug("Failed to collection plan details for account: " + accountNo + " " + e.getMessage());
		}

		return dueDate;
	}

	private boolean isMigrationPending(String simNo) throws EPPIXSeriousException {
		boolean isPending = false;

		try {

			isPending = this.getSubscriberUpgradeEligibilityDAC.isMigrationPending(simNo);
		} catch (EPPIXUnexpectedException e) {
			throw new EPPIXSeriousException(e);
		}

		return isPending;
	}

	/**
	 * FUNCTION d_cvi_scv_get(p_subscriber_id)
	 * 
	 * @param subscriberId
	 * @return
	 * @throws EPPIXSeriousException
	 */
	public void getCviScv(Integer subscriberId) throws EPPIXSeriousException {

		this.cviDMO = null;

		this.cviDMO = this.getSubscriberUpgradeEligibilityDAC.getCviScv(subscriberId);

		if (cviDMO == null) {
			logger.error("A record for subscriber " + subscriberId
					+ " does not exist in table scv_sub_crm_value, error code 888680");
//			throw new EPPIXSeriousException("A record for subscriber " + subscriberId
//					+ " does not exist in table scv_sub_crm_value, error code 888680");
		}
	}

	private SbmSubMatrixDMO getSbmListAll(String packageCode, String tariffPlan, String sbuAccountStatus,
			String collPlan, String payPlan, String sbuMtnStatus, String sbuCustomerType, int daysSusp,
			Integer sbuContractLen, String sbuAgeingBucket, Integer sbuContractAge, String action, Date date,
			String userId, String ruleInd, String status, String parentAccount, String righId, String crmValue) {

		if (sbuAccountStatus != null) {
			sbuAccountStatus = sbuAccountStatus.trim();
		}

		if (sbuMtnStatus != null) {
			sbuMtnStatus = sbuMtnStatus.trim();
		}
		if (sbuCustomerType != null) {
			sbuCustomerType = sbuCustomerType.trim();
		}

		if (sbuAgeingBucket != null) {
			sbuAgeingBucket = sbuAgeingBucket.trim();
			if ("Current".equals(sbuAgeingBucket)) {
				sbuAgeingBucket = "0";
			}
		}

		if (crmValue != null) {
			crmValue = crmValue.trim();
		}

		if (collPlan != null) {
			collPlan = collPlan.trim();
		}

		if (payPlan != null) {
			payPlan = payPlan.trim();
		}

		logger.debug("\nString packageCode: " + packageCode + "\nString tariffPlan: " + tariffPlan
				+ "\nString sbuAccountStatus: " + sbuAccountStatus + "\nString collPlan: " + collPlan
				+ "\nString payPlan: " + payPlan + "\nString sbuMtnStatus: " + sbuMtnStatus
				+ "\nString sbuCustomerType: " + sbuCustomerType + "\nint daysSusp: " + daysSusp
				+ "\nInteger sbuContractLen: " + sbuContractLen + "\nString sbuAgeingBucket: " + sbuAgeingBucket
				+ "\nInteger sbuContractAge: " + sbuContractAge + "\nString action: " + action + "\nDate date: " + date
				+ "\nString userId: " + userId + "\nString ruleInd: " + ruleInd + "\nString status: " + status
				+ "\nString parentAccount: " + parentAccount + "\nString righId: " + righId + "\nString crmValue: "
				+ crmValue);

		SbmSubMatrixDMO sbmDmo = null;
		boolean union = false;

		String mainSql = "SELECT sbm_sub_matrix.* FROM sbm_sub_matrix " + "WHERE sbm_status = 'A' "
				+ "\nAND ((sbm_package_code = '" + packageCode
				+ "' ) OR (sbm_package_code MATCHES '' OR sbm_package_code IS NULL)) " + "\nAND ((sbm_tariff_code = '"
				+ tariffPlan + "'  ) OR (sbm_tariff_code MATCHES  '' OR sbm_tariff_code IS NULL)) "
				+ "\nAND ((sbm_crm_value = '" + crmValue
				+ "' ) OR (sbm_crm_value MATCHES  '' OR sbm_crm_value IS NULL)) " + "\nAND ((sbm_account_status = '"
				+ sbuAccountStatus + "' ) OR (sbm_account_status MATCHES '' OR sbm_account_status IS NULL)) "
				+ "\nAND ((sbm_contract_age > '" + sbuContractAge + "' ) OR (sbm_contract_age = 0)) "
				+ "\nAND ((sbm_mtn_status = '" + sbuMtnStatus
				+ "' ) OR (sbm_mtn_status MATCHES '' OR sbm_mtn_status IS NULL)) " + "\nAND ((sbm_customer_type = '"
				+ sbuCustomerType + "' ) OR (sbm_customer_type MATCHES '' OR sbm_customer_type IS NULL)) "
				+ "\nAND ((sbm_days_suspend = '" + daysSusp + "' ) OR (sbm_days_suspend = 0)) "
				+ "\nAND ((sbm_contract_len = '" + sbuContractLen + "' ) OR (sbm_contract_len = 0)) "
				+ "\nAND ((sbm_ageing= '" + sbuAgeingBucket + "' ) OR (sbm_ageing MATCHES '' OR sbm_ageing IS NULL))";

		String sql = mainSql;
		String andSql = "";

		logger.debug("\n" + mainSql);

		/**
		 * IF p_coll_plan != "N/A" THEN LET l_and_sql = " AND ((sbm_coll_plan =
		 * '",p_coll_plan CLIPPED,"')", " OR (sbm_coll_plan MATCHES '' OR sbm_coll_plan
		 * IS NULL))", " AND (sbm_payment_plan ='N/A')"
		 * 
		 * LET l_sql = l_sql CLIPPED, l_and_sql LET l_union = TRUE END IF
		 */

		if (!"N/A".equals(collPlan)) {
			logger.debug("\nSTEP 1");
			andSql = " AND ((sbm_coll_plan = '" + collPlan + "')"
					+ "\n OR (sbm_coll_plan MATCHES '' OR sbm_coll_plan IS NULL))" + "\n AND (sbm_payment_plan ='N/A')";

			sql = sql + andSql;
			union = true;
		}

		/**
		 * IF p_pay_plan != "N/A" THEN LET l_and_sql = " AND (sbm_coll_plan = 'N/A')", "
		 * AND ((sbm_payment_plan = '",p_pay_plan CLIPPED,"')", " OR (sbm_payment_plan
		 * MATCHES '' OR sbm_payment_plan IS NULL))" IF l_union = TRUE THEN LET l_sql =
		 * l_sql CLIPPED, " UNION ",l_main_sql CLIPPED END IF LET l_sql = l_sql CLIPPED,
		 * l_and_sql LET l_union = TRUE END IF
		 */

		if (!"N/A".equals(payPlan)) {
			logger.debug("\nSTEP 2");
			sql = sql + "\n AND (sbm_coll_plan = 'N/A')" + "\n AND ((sbm_payment_plan = '" + payPlan + "')"
					+ " OR (sbm_payment_plan MATCHES '' OR sbm_payment_plan IS NULL))";

			if (union) {
				sql = sql + "\n UNION " + mainSql;
			}
			sql = sql + andSql;
			union = true;
		}

		/**
		 * IF p_coll_plan != "N/A" AND p_pay_plan != "N/A" THEN LET l_and_sql = " AND
		 * ((sbm_coll_plan = '",p_coll_plan CLIPPED,"')", " OR (sbm_coll_plan MATCHES ''
		 * OR sbm_coll_plan IS NULL))", " AND ((sbm_payment_plan = '",p_pay_plan
		 * CLIPPED,"')", " OR (sbm_payment_plan MATCHES '' OR sbm_payment_plan IS
		 * NULL))" IF l_union = TRUE THEN LET l_sql = l_sql CLIPPED, " UNION ",
		 * l_main_sql CLIPPED END IF LET l_sql = l_sql CLIPPED, l_and_sql LET l_union =
		 * TRUE END IF
		 */

		if (!"N/A".equals(collPlan) && !"N/A".equals(payPlan)) {
			logger.debug("\nSTEP 3");
			andSql = " AND ((sbm_coll_plan = '" + collPlan + "')"
					+ "\n OR (sbm_coll_plan MATCHES '' OR sbm_coll_plan IS NULL))" + "\n AND ((sbm_payment_plan = '"
					+ payPlan + "')" + "\n OR (sbm_payment_plan MATCHES '' OR sbm_payment_plan IS NULL))";
			if (union) {
				sql = sql + "\n UNION " + mainSql;
			}
			sql = sql + andSql;
			union = true;
		}
		logger.debug("\nUNION: " + union);

		/**
		 * IF l_union = TRUE THEN LET l_sql = l_sql CLIPPED, " UNION ", l_main_sql
		 * CLIPPED END IF LET l_and_sql = " AND (sbm_payment_plan ='N/A')", " AND
		 * (sbm_coll_plan = 'N/A')" LET l_sql = l_sql CLIPPED, l_and_sql
		 */

		if (union) {
			logger.debug("\nSTEP 4");
			sql = sql + "\n UNION " + mainSql;
		}
		andSql = " AND (sbm_payment_plan ='N/A')" + "\n AND (sbm_coll_plan = 'N/A')";
		sql = sql + andSql;

		logger.debug("\n" + sql);

//			try {
//				sbmIt = this.getSubscriberUpgradeEligibilityDAC.getSbmListAll(packageCode, tariffPlan, 
//						crmValue, sbuAccountStatus, sbuContractAge, sbuMtnStatus, 
//						sbuCustomerType, daysSusp, sbuContractLen, sbuAgeingBucket);
//			} catch (EPPIXSeriousException e) {
//				logger.error(e.getMessage());
//			}
//			
//			if(sbmIt == null) {
//				return null;
//			}else {
//				while(sbmIt.hasNext()) {
//					sbmDmo = (SbmSubMatrixDMO)sbmIt.next();
//					break;
//				}
//			}

		try {
			st = this.getConnection().createStatement();
			rs = st.executeQuery(sql);
			while (rs.next()) {
				
				logger.debug("\nSTEP 5");
				sbmDMO = new SbmSubMatrixDMO();
				sbmDMO.setSbmRuleNo(rs.getInt(1));
				sbmDMO.setSbmRuleDesc(rs.getString(2));
				sbmDMO.setSbmPackageCode(rs.getString(3));
				sbmDMO.setSbmTariffCode(rs.getString(4));
				sbmDMO.setSbmAccountStatus(rs.getString(5));
				sbmDMO.setSbmCollPlan(rs.getString(6));
				sbmDMO.setSbmPaymentPlan(rs.getString(7));
				sbmDMO.setSbmMtnStatus(rs.getString(8));
				sbmDMO.setSbmCustomerType(rs.getString(9));
				sbmDMO.setSbmDaysSuspend(rs.getInt(10));
				sbmDMO.setSbmContractLen(rs.getInt(11));
				sbmDMO.setSbmAgeing(rs.getString(12));
				sbmDMO.setSbmContractAge(rs.getInt(13));
				sbmDMO.setSbmAction(rs.getString(14));
				sbmDMO.setSbmDate((rs.getDate(15) == null) ? null : new Date(rs.getDate(15)));
				sbmDMO.setSbmUserid(rs.getString(16));
				sbmDMO.setSbmRuleInd(rs.getString(17));
				sbmDMO.setSbmStatus(rs.getString(18));
				sbmDMO.setSbmParentAccount(rs.getString(19));
				sbmDMO.setSbmRightId(rs.getString(20));
				sbmDMO.setSbmCrmValue(rs.getString(21));
				
				logger.debug(sbmDMO.toString());
				
			}

			rs.close();
			st.close();
		} catch (SQLException e) {
			logger.debug("Failed to get sbm_sub_matrix: " + e.getMessage());
		} catch (Exception e) {
			logger.debug("Failed to get sbm_sub_matrix: " + e.getMessage());
		}

		return sbmDMO;
	}

	/**
	 * #------------------------------------------------------------------------------#
	 * # Purpose : Validates if the rule exist # # Accepts : p_rule_no # #
	 * p_description # # p_package_code # # p_tariff # # p_account_status # #
	 * p_coll_plan # # p_pay_plan # # p_mtn_status # # p_customer_type # #
	 * p_contract_len # # p_ageing_bucket # # p_cont_age # # p_action # # p_status #
	 * # p_parent_account # # p_crm_value # # p_right_id # # Returns : p_stat #
	 * #------------------------------------------------------------------------------#
	 */
	private Integer getSbmRuleId(String packageCode, String tariff, String accountStatus, String collPlan,
			String payPlan, String mtnStatus, String customerType, Integer contractLen, String crmValue) {

//		FUNCTION d_sbm_get_rule_id( p_package_code, 
//							p_tariff,
//							p_account_status, 
//							p_coll_plan, 
//							p_pay_plan, 
//							p_mtn_status,
//							p_customer_type, 
//							p_contract_len, 
//							p_crm_value)
//
//			DEFINE
//				-- Parameter variable(s)
//				p_account_status			LIKE sbm_sub_matrix.sbm_account_status,
//				p_action					LIKE sbm_sub_matrix.sbm_action,
//				p_ageing_bucket				LIKE sbm_sub_matrix.sbm_ageing,
//				p_coll_plan					LIKE sbm_sub_matrix.sbm_coll_plan,
//				p_cont_age					LIKE sbm_sub_matrix.sbm_contract_age,
//				p_contract_len				LIKE sbm_sub_matrix.sbm_contract_len,
//				p_crm_value    				LIKE sbm_sub_matrix.sbm_crm_value,
//				p_customer_type				LIKE sbm_sub_matrix.sbm_customer_type,
//				p_description				LIKE sbm_sub_matrix.sbm_rule_desc,
//				p_mtn_status				LIKE sbm_sub_matrix.sbm_mtn_status,
//				p_package_code				LIKE sbm_sub_matrix.sbm_package_code,
//				p_parent_account			LIKE sbm_sub_matrix.sbm_parent_account,
//				p_pay_plan					LIKE sbm_sub_matrix.sbm_payment_plan,
//				p_status					LIKE sbm_sub_matrix.sbm_status,
//				p_tariff					LIKE sbm_sub_matrix.sbm_tariff_code,
//				p_right_id					LIKE sbm_sub_matrix.sbm_right_id,
//
//				-- Function variable(s)
//				l_sbm						RECORD LIKE sbm_sub_matrix.*,
//
//				l_upd_rule					LIKE sbm_sub_matrix.sbm_rule_no,
//
//				l_error						CHAR(50),
//				l_function					CHAR(50),
//				l_sql						CHAR(2048),
//				l_sql2						CHAR(2048),
//				p_stat						CHAR(1)
//
//			WHENEVER ANY ERROR CALL error_classify
//
//			CALL DebugStart("d_sbm_get_rule_id")
//
//			LET l_function = ": d_sbm_get_rule_id()"
//
//			IF LENGTH(p_coll_plan) = 0 THEN
//				LET p_coll_plan = NULL
//			END IF
//
//			IF LENGTH(p_pay_plan) = 0 THEN
//				LET p_pay_plan = NULL
//			END IF
//
//			IF LENGTH(p_ageing_bucket) = 0 THEN
//				INITIALIZE p_ageing_bucket TO NULL
//			END IF
//
//			IF LENGTH(p_action) = 0 THEN
//				LET p_action = NULL
//			END IF
//
//			-- validate mandatory parameters
//
//			WHILE TRUE

		String sql = " SELECT *  FROM sbm_sub_matrix " + "\n WHERE sbm_status='A' ";
//
//				IF LENGTH(p_package_code) > 0 THEN
		if (packageCode != null && packageCode.length() > 0) {

			sql = sql + "\n AND (sbm_package_code = '" + packageCode.trim()
					+ "' OR (sbm_package_code IS NULL OR sbm_package_code = ' ')) ";
//				END IF
		}
//
//				IF LENGTH(p_tariff) > 0 THEN
		if (tariff != null && tariff.length() > 0) {
			sql = sql + " AND (sbm_tariff_code = '" + tariff.trim()
					+ "' OR (sbm_tariff_code IS NULL OR sbm_tariff_code = ' ')) ";
//				END IF
		}
//
//				IF LENGTH(p_account_status) > 0 THEN
		if (accountStatus != null && accountStatus.length() > 0) {
			sql = sql + " AND (sbm_account_status = '" + accountStatus.trim()
					+ "' OR (sbm_account_status IS NULL OR sbm_account_status = ' ')) ";
//				END IF
		}
//
//				IF LENGTH(p_coll_plan) > 0 THEN
		if (collPlan != null && collPlan.length() > 0) {
			sql = sql + " AND (sbm_coll_plan = '" + collPlan.trim()
					+ "' OR (sbm_coll_plan IS NULL OR sbm_coll_plan = ' ') OR sbm_coll_plan = 'N/A') ";
//				END IF
		}
//
//				IF LENGTH(p_pay_plan) > 0 THEN
		if (payPlan != null && payPlan.length() > 0) {
			sql = sql + " AND (sbm_payment_plan = '" + payPlan.trim()
					+ "' OR (sbm_payment_plan IS NULL OR sbm_payment_plan = ' ') OR sbm_payment_plan = 'N/A') ";
//				END IF
		}
//
//				IF LENGTH(p_mtn_status) > 0 THEN
		if (mtnStatus != null && mtnStatus.length() > 0) {
			sql = sql + " AND (sbm_mtn_status = '" + mtnStatus.trim()
					+ "' OR (sbm_mtn_status IS NULL OR sbm_mtn_status = ' ')) ";
//				END IF
		}
//
//				IF LENGTH(p_customer_type) > 0 THEN
		if (customerType != null && customerType.length() > 0) {
			sql = sql + " AND (sbm_customer_type = '" + customerType.trim()
					+ "' OR (sbm_customer_type IS NULL OR sbm_customer_type = ' ')) ";
//				END IF
		}
//
//				IF p_contract_len IS NOT NULL THEN
		if (contractLen != null && contractLen.intValue() > 0) {
			sql = sql + " AND (sbm_contract_len = '" + contractLen + "' AND sbm_contract_len != 0) ";
//				END IF
		}
//
//				IF LENGTH(p_crm_value) > 0 THEN
		if (crmValue != null && crmValue.length() > 0) {
			sql = sql + " AND (sbm_crm_value = '" + crmValue.trim()
					+ "' OR (sbm_crm_value IS NULL OR sbm_crm_value = ' ')) ";
//				END IF
		}
//
//				CALL DebugLog(l_sql[1,500])
//				CALL DebugLog(l_sql[501,1000])
//				CALL DebugLog(l_sql[1001,1500])
//				CALL DebugLog(l_sql[1501,2000])
//				PREPARE prep_exist FROM l_sql

		logger.debug("\n" + sql);
		SbmSubMatrixDMO sbmDMO = null;

		try {
			st = this.getConnection().createStatement();
			rs = st.executeQuery(sql);

			if (rs.next()) {
				sbmDMO = new SbmSubMatrixDMO();
				sbmDMO.setSbmRuleNo(rs.getInt(1));
				sbmDMO.setSbmRuleDesc(rs.getString(2));
				sbmDMO.setSbmPackageCode(rs.getString(3));
				sbmDMO.setSbmTariffCode(rs.getString(4));
				sbmDMO.setSbmAccountStatus(rs.getString(5));
				sbmDMO.setSbmCollPlan(rs.getString(6));
				sbmDMO.setSbmPaymentPlan(rs.getString(7));
				sbmDMO.setSbmMtnStatus(rs.getString(8));
				sbmDMO.setSbmCustomerType(rs.getString(9));
				sbmDMO.setSbmDaysSuspend(rs.getInt(10));
				sbmDMO.setSbmContractLen(rs.getInt(11));
				sbmDMO.setSbmAgeing(rs.getString(12));
				sbmDMO.setSbmContractAge(rs.getInt(13));
				sbmDMO.setSbmAction(rs.getString(14));
				sbmDMO.setSbmDate((rs.getDate(15) == null) ? null : new Date(rs.getDate(15)));
				sbmDMO.setSbmUserid(rs.getString(16));
				sbmDMO.setSbmRuleInd(rs.getString(17));
				sbmDMO.setSbmStatus(rs.getString(18));
				sbmDMO.setSbmParentAccount(rs.getString(19));
				sbmDMO.setSbmRightId(rs.getString(20));
				sbmDMO.setSbmCrmValue(rs.getString(21));

			}

			rs.close();
			st.close();
		} catch (SQLException e) {
			logger.debug("Failed to get sbm_sub_matrix: " + e.getMessage());
		} catch (Exception e) {
			logger.debug("Failed to get sbm_sub_matrix: " + e.getMessage());
		}
//
//				IF g_status_class != 0 THEN
//					# Problem with the SQL
//					CALL Error_Append("", l_function)
//					EXIT WHILE
//				END IF
//
//				## 07/05/2002 KB
//				DECLARE sel_cur CURSOR FOR prep_exist
//
//				LET p_stat = " "
//				LET l_upd_rule = 0
//
//				FOREACH sel_cur INTO l_sbm.*
//					LET l_upd_rule = l_sbm.sbm_rule_no
//					EXIT FOREACH
//				END FOREACH
//
//				EXIT WHILE
//
//			END WHILE
//
//			## If p_stat = " " then no update/insert should take place
//			## If p_stat = "I" then update/insert should take place
//			## If p_stat = "U" then update already took place and no further update/insert should take place
//			RETURN l_upd_rule
		if(sbmDMO != null && sbmDMO.getSbmRuleNo() != null) {
			return sbmDMO.getSbmRuleNo();
		}else {
			return null;
		}
		
//		END FUNCTION
	}

	private SbmSubMatrixDMO getSbm(Integer ruleNo) {

		String sql = "SELECT * FROM sbm_sub_matrix WHERE sbm_rule_no = " + ruleNo + " AND sbm_status = 'A'";
		logger.debug("\n" + sql);
		SbmSubMatrixDMO sbmDMO = null;

		try {
			st = this.getConnection().createStatement();
			rs = st.executeQuery(sql);

			if (rs.next()) {
				sbmDMO = new SbmSubMatrixDMO();
				sbmDMO.setSbmRuleNo(rs.getInt(1));
				sbmDMO.setSbmRuleDesc(rs.getString(2));
				sbmDMO.setSbmPackageCode(rs.getString(3));
				sbmDMO.setSbmTariffCode(rs.getString(4));
				sbmDMO.setSbmAccountStatus(rs.getString(5));
				sbmDMO.setSbmCollPlan(rs.getString(6));
				sbmDMO.setSbmPaymentPlan(rs.getString(7));
				sbmDMO.setSbmMtnStatus(rs.getString(8));
				sbmDMO.setSbmCustomerType(rs.getString(9));
				sbmDMO.setSbmDaysSuspend(rs.getInt(10));
				sbmDMO.setSbmContractLen(rs.getInt(11));
				sbmDMO.setSbmAgeing(rs.getString(12));
				sbmDMO.setSbmContractAge(rs.getInt(13));
				sbmDMO.setSbmAction(rs.getString(14));
				sbmDMO.setSbmDate((rs.getDate(15) == null) ? null : new Date(rs.getDate(15)));
				sbmDMO.setSbmUserid(rs.getString(16));
				sbmDMO.setSbmRuleInd(rs.getString(17));
				sbmDMO.setSbmStatus(rs.getString(18));
				sbmDMO.setSbmParentAccount(rs.getString(19));
				sbmDMO.setSbmRightId(rs.getString(20));
				sbmDMO.setSbmCrmValue(rs.getString(21));

				
				logger.debug(sbmDMO.toString());
			}

			rs.close();
			st.close();
		} catch (SQLException e) {
			logger.debug("Failed to get sbm_sub_matrix: " + e.getMessage());
		} catch (Exception e) {
			logger.debug("Failed to get sbm_sub_matrix: " + e.getMessage());
		}

		return sbmDMO;
	}

	private void getVpk(String packageCode) {

		QueryFilter filter = new QueryFilter();
		filter.add(FilterOp.EQUAL, VpkPackageDMO.vpkPackageCodeFilter, packageCode);
		filter.add(FilterOp.NOTEQUAL, VpkPackageDMO.vpkSuspendFilter, "Y");

		try {
			this.vpkDMO = base.vpkPackage().get(filter);
		} catch (EPPIXBusinessException e) {
			logger.error(e.getMessage());
		} catch (EPPIXUnexpectedException e) {
			logger.error(e.getMessage());
		} catch (EPPIXFatalException e) {
			logger.error(e.getMessage());
		}

	}

	private void getTpTariffPlan(String tariffPlan) {

		QueryFilter filter = new QueryFilter();
		filter.add(FilterOp.EQUAL, TpTariffPlanDMO.tpTarplanRefFilter, tariffPlan);

		try {
			this.tpDMO = base.TpTariffPlan().get(filter);
		} catch (EPPIXBusinessException e) {
			logger.error(e.getMessage());
		} catch (EPPIXUnexpectedException e) {
			logger.error(e.getMessage());
		} catch (EPPIXFatalException e) {
			logger.error(e.getMessage());
		}
	}

	/**
	 * #------------------------------------------------------------------------------#
	 * # Purpose : Calculate the current contract age # # Accepts : p_activate_date
	 * - The date activated # # : p_contract_age - The age if any when this was last
	 * performed # # Returns : l_contract_age #
	 * #------------------------------------------------------------------------------#
	 */
	public Integer getSbuContract(Date activateDate, Integer contractAge) throws EPPIXSeriousException {
		// FUNCTION d_sbu_contract_get(p_activate_date, p_contract_age)

		String rounding = null;
		Integer iRounding = null;

		String roundType;
		String today = null;

		Integer span = null;

		if (contractAge == null) {
			contractAge = new Integer(0);
		}

		QueryFilter filter = new QueryFilter();
		filter.add(FilterOp.EQUAL, SksKeySettingDMO.sksKeyCodeFilter, "RNDDAYSAFT");
		SksKeySettingDMO sksDmo = null;

		try {
			sksDmo = base.sksKeySetting().get(filter);
		} catch (EPPIXBusinessException e) {
			logger.error("Exception getting SKS for code: RNDDAYSAFT EXCEPTION: " + e);
			throw new EPPIXSeriousException("1", "Exception getting SKS for code: RNDDAYSAFT EXCEPTION: " + e);
		} catch (EPPIXUnexpectedException e) {
			logger.error("Exception getting SKS for code: RNDDAYSAFT EXCEPTION: " + e);
			throw new EPPIXSeriousException("2", "Exception getting SKS for code: RNDDAYSAFT EXCEPTION: " + e);
		} catch (EPPIXFatalException e) {
			logger.error("Exception getting SKS for code: RNDDAYSAFT EXCEPTION: " + e);
			throw new EPPIXSeriousException("2", "Exception getting SKS for code: RNDDAYSAFT EXCEPTION: " + e);
		}

		if (sksDmo == null) {
			logger.error("Failed to get SKS for code: RNDDAYSAFT");
//			throw new EPPIXSeriousException("1",
//					"Failed to get SKS for code: RNDDAYSAFT");

		} else {
			rounding = sksDmo.getSksValue();
		}

		if (rounding != null) {
			try {
				iRounding = new Integer(rounding);
			} catch (NumberFormatException e) {
				iRounding = new Integer(0);
			}
		}

		Calendar cal = Calendar.getInstance();
		today = dtFormatddmmyyyy.format(cal.getTime());

		logger.debug("\niRounding: " + iRounding + ": " + new Integer(today.substring(0, 2)).intValue());

		if (iRounding != null) {
			if (new Integer(today.substring(0, 2)).intValue() >= iRounding.intValue()) {
				roundType = "U";
			} else {
				roundType = "D";
			}
		} else {
			roundType = "D";
		}

		if (roundType.equals("U")) {
			cal.set(Calendar.DATE, 1);
			cal.add(Calendar.MONTH, 1);
		} else if (roundType.equals("D")) {
			cal.set(Calendar.DATE, 1);
			cal.add(Calendar.MONTH, 1);
			cal.add(Calendar.DATE, -1);
		}

		span = new Integer(Date.differenceInMonths(activateDate, new Date(cal.getTime())));

		logger.debug("\nSPAN: " + span.intValue());
		return new Integer(contractAge.intValue() + span.intValue());

	}

	public void getAvgSpendSub(Integer subscriberId) {
		int noOfPeriods = 6;
		double totalSpend = 0.0;
		BigDecimal averageSpend = null;
		Date date = null;
		int count = 0;

		String sqlGetAvgNoOfPeriods = "SELECT KEY_VALUE FROM SYSDIRM WHERE SYSTEM_KEY = 'AVERSPENT'";
		logger.debug("\n" + sqlGetAvgNoOfPeriods);

		try {
			st = this.getConnection().createStatement();
			rs = st.executeQuery(sqlGetAvgNoOfPeriods);

			if (rs.next()) {
				noOfPeriods = new Integer(rs.getString(1).trim()).intValue() + 1;
			}

			rs.close();

			logger.debug("\nNO PERIODS: " + noOfPeriods);

			date = this.subUpgradeMigrService.calcMonthDate(new Date(), noOfPeriods, "P");

			logger.debug("\nDATE: " + date.toString());

			String sqlAvgSpend = "SELECT ins_total " + "FROM ins_inv_summary, inx_invoice_xref, vam_active_msisdn "
					+ "WHERE ins_invoice_no = inx_invoice_no " + "AND vam_msisdn_no = inx_msisdn_no "
					+ "AND vam_msisdn_known <> 3 " + "AND ins_source = 'S' " + "AND inx_subscriber_id = " + subscriberId
					+ "and ins_invoice_date > '" + date + "'";

			logger.debug("\n" + sqlAvgSpend);

			rs = st.executeQuery(sqlAvgSpend);

			while (rs.next()) {
				totalSpend = totalSpend + rs.getDouble(1);
				logger.debug("\nTOTAL SPEND: " + totalSpend);
				count++;
			}

			logger.debug("\nTOTAL SPEND: " + totalSpend + ": NO RECORDS: " + count);

			double tmpAverage = totalSpend / count;
			
			if (tmpAverage > 0) {
				this.avgSpend = "" + tmpAverage;
			}

			rs.close();
			st.close();
		} catch (SQLException e) {
			logger.debug("Failed to average spend for subscriber: " + subscriberId + " " + e.getMessage());
		} catch (Exception e) {
			logger.debug("Failed to average spend for subscriber: " + subscriberId + " " + e.getMessage());
		}

		if (this.avgSpend != null && this.avgSpend.length() > 0) {
			averageSpend = new BigDecimal(this.avgSpend).setScale(2, RoundingMode.HALF_UP);
			this.avgSpend = averageSpend.toString();
		}

	}
	
	private boolean getTyptText(String ttGroup, String ttType, String ttText) throws EPPIXSeriousException {
		boolean isFound = false;

		/*
		 * CR177159
		CALL TypeText_Get("M2MCRMTYPS", l_aux.aux_analysis_25) RETURNING l_tt.*
		i.	IF Record Not Found – Not M2M Customers Subscriber
			1.	Error Reset 
			2.	LET l_crm_value = l_cvi.cvi_crm_value
		ii.	ELSE
			1.	LET l_crm_value = l_aux.aux_analysis_25
		*/
		TtTypeTextDMO ttDmo = null;
		QueryFilter filter = new QueryFilter();
		filter.add(FilterOp.EQUAL, TtTypeTextDMO.ttGroupFilter, ttGroup);
		filter.add(FilterOp.EQUAL, TtTypeTextDMO.ttTypeFilter, ttType);
		if (ttText.length() > 0) {
			filter.add(FilterOp.EQUAL, TtTypeTextDMO.ttTextFilter, ttText);
		}

		try {
			ttDmo = base.ttTypeText().get(filter);
		} catch (EPPIXBusinessException e) {
			logger.error("Exception getting TT for Group: M2MCRMTYPS EXCEPTION: " + e);
			throw new EPPIXSeriousException("1", "Exception getting TT for Group: M2MCRMTYPS EXCEPTION: " + e);
		} catch (EPPIXUnexpectedException e) {
			logger.error("Exception getting TT for Group: M2MCRMTYPS EXCEPTION: " + e);
			throw new EPPIXSeriousException("2", "Exception getting TT for Group: M2MCRMTYPS EXCEPTION: " + e);
		} catch (EPPIXFatalException e) {
			logger.error("Exception getting TT for Group: M2MCRMTYPS EXCEPTION: " + e);
			throw new EPPIXSeriousException("2", "Exception getting TT for Group: M2MCRMTYPS EXCEPTION: " + e);
		}

		if (ttDmo == null) {
			isFound = false;

		} else {
			isFound = true;
		}

		return isFound;
	}

	public String getCpnDescription() {
		return cpnDescription;
	}

	public void setCpnDescription(String cpnDescription) {
		this.cpnDescription = cpnDescription;
	}

	public String getCpnPlan() {
		return cpnPlan;
	}

	public void setCpnPlan(String cpnPlan) {
		this.cpnPlan = cpnPlan;
	}

	public boolean isTest() {
		return isTest;
	}

	public void setTest(boolean isTest) {
		this.isTest = isTest;
	}

}