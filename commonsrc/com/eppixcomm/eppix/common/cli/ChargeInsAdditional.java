package com.eppixcomm.eppix.common.cli;

import java.math.BigDecimal;
import java.math.RoundingMode;

import org.apache.log4j.Logger;

import com.eppixcomm.eppix.base.blo.BaseBLOBinder;
import com.eppixcomm.eppix.base.blo.BcyBillingCycleDMO;
import com.eppixcomm.eppix.base.blo.BillCccccyyyymmddDMO;
import com.eppixcomm.eppix.base.blo.BlhBillLimitHdDAC;
import com.eppixcomm.eppix.base.blo.BlhBillLimitHdDMO;
import com.eppixcomm.eppix.base.blo.ChgChargesDMO;
import com.eppixcomm.eppix.base.blo.CpcCallPrechargeDMO;
import com.eppixcomm.eppix.base.blo.CrbCustRiskBalDMO;
import com.eppixcomm.eppix.base.blo.MshMsisdnHistoryDMO;
import com.eppixcomm.eppix.base.blo.OpservmDMO;
import com.eppixcomm.eppix.base.blo.SbdSubDets;
import com.eppixcomm.eppix.base.blo.SbdSubDetsDMO;
import com.eppixcomm.eppix.base.blo.SbhSubHistoryDMO;
import com.eppixcomm.eppix.base.blo.SmnSimNosDMO;
import com.eppixcomm.eppix.base.blo.TtTypeTextDMO;
import com.eppixcomm.eppix.base.blo.VamActiveMsisdnDMO;
import com.eppixcomm.eppix.base.blo.VpnProviderNetwkDMO;
import com.eppixcomm.eppix.base.blo.Vsr2ServiceAuxDMO;
import com.eppixcomm.eppix.base.blo.VsrServiceDMO;
import com.eppixcomm.eppix.base.error.EPPIXBusinessException;
import com.eppixcomm.eppix.base.error.EPPIXFatalException;
import com.eppixcomm.eppix.base.error.EPPIXSeriousException;
import com.eppixcomm.eppix.base.error.EPPIXUnexpectedException;
import com.eppixcomm.eppix.base.error.Thrower;
import com.eppixcomm.eppix.common.cache.SystemKeyCache;
import com.eppixcomm.eppix.common.data.KeyTable;
import com.eppixcomm.eppix.common.util.Date;
import com.eppixcomm.eppix.common.util.DateTime;
import com.eppixcomm.eppix.common.util.FilterOp;
import com.eppixcomm.eppix.common.util.QueryFilter;

/**
 * 
 * @author vermeu_s ChargeInsAdditional replace Charge_InsAdditional.4gl
 * 
 *         Construct the class with the BaseBLOBinder from where it is called.
 * 
 *         Set all the mandatory fields.
 * 
 *         Call insertCharge() to process the charges.
 * 
 */
public class ChargeInsAdditional {

	private BaseBLOBinder base;
	private Thrower thrower = Thrower.getThrower(ChargeInsAdditional.class);
	private Logger logger = thrower.getLogger();
	private SystemKeyCache systemkeys;

	private Integer subscriberId; // Subscriber ID
	private String msisdn; // MSISDN Number the charge relates to
	private String histCode; // hs_history code to use when INSERTING
	private Short twinBill; // Twin bill number to apply charge to
	private String servCode; // Service charge relates to - can be NULL
	private String nominalCode; // Details of charge to be applied
	private BigDecimal cost; // Cost details from opservm
	private BigDecimal listPrice; // Charge details from opservm
	private Date chargeDate; // Date to apply charges
	private Integer classId; // Class ID associated with bill record
	private String typeoFChg; // Type of charge being added
	private Integer billRecordId; // Unique ID of new billing record
	private BigDecimal vatAmount;

	private SbdSubDetsDMO sbdSubDetsDMO;
	private SmnSimNosDMO smnSimNosDMO;
	private TtTypeTextDMO ttTypeTextDMO;
	private Vsr2ServiceAuxDMO vsr2ServiceAuxDMO;
	private BcyBillingCycleDMO bcyBillingCycleDMO;

	// l_chg_code LIKE chg_charges.chg_code,
	private String chgCode;
	// l_effective_date LIKE chg_charges.chg_effective_date,
	private DateTime effectiveDate;
	// l_hval LIKE msh_msisdn_history.msh_comment,
	private char[] hVal;
	// l_network_id LIKE vpn_provider_netwk.vpn_provider_id,
	private String networkId;
	// l_network_prefix LIKE vpn_provider_netwk.vpn_network_prefix,
	private String networkPrefix;
	// l_sparech LIKE bill_cccccyyyymmdd.sparech,
	private String sparech;
	// l_technology LIKE vsr2_service_aux.vsr2_technology,
	private String technology;
	// l_error_text CHAR(500),
	private String errorText;
	// l_function CHAR(50),

	// l_bill_record_id INTEGER,

	// l_bill_to DATE,
	private Date billTo;
	// l_precharge SMALLINT,
	private boolean preCharge;
	// l_status SMALLINT,
	private Short Status;
	// l_account CHAR(8)
	private String account;

	/**
	 * Constructor for ChargeInsAdditional The class must be constructed with
	 * BaseBLOBinder passed in as a mandatory parameter.
	 * 
	 * @throws EPPIXSeriousException
	 */
	public ChargeInsAdditional(BaseBLOBinder base) throws EPPIXFatalException,
			EPPIXSeriousException {

		thrower.ifParameterMissing("BaseBLOBinder", base);
		this.base = base;
	}

	public void set(Integer subscriberid, String msisdn, String histcode,
			Short twinbill, String servcode, String nominalcode,
			BigDecimal cost, BigDecimal listprice, Date chargedate,
			Integer classid, String typeofchg) throws EPPIXBusinessException,
			EPPIXUnexpectedException, EPPIXFatalException {

		this.setSubscriberId(subscriberid);
		this.setMsisdn(msisdn);
		this.setHistCode(histcode);
		this.setTwinBill(twinbill);
		this.setServCode(servcode);
		this.setNominalCode(nominalcode);
		this.setCost(cost);
		this.setListPrice(listprice);
		this.setChargeDate(chargedate);
		this.setClassId(classid);
		this.setTypeoFChg(typeofchg);
	}

	/**
	 * Call this function only after instantiating the class and setting the
	 * mandatory parameters with the set method
	 * 
	 * @throws EPPIXBusinessException
	 * @throws EPPIXUnexpectedException
	 * @throws EPPIXFatalException
	 */
	public void insertCharge() throws EPPIXBusinessException, EPPIXUnexpectedException, EPPIXFatalException{

		/*
		#------------------------------------------------------------------------------#
		# Purpose : To apply the passed additional charge to the passed MSISDN number. #
		# Accepts : p_subscriber_id     - Subscriber ID                                #
		#         : p_msisdn            - MSISDN Number the charge relates to          #
		#         : p_histcode          - hs_history code to use when INSERTING        #
		#         : p_twinbill          - Twin bill number to apply charge to          #
		#         : p_serv_code         - Service charge relates to - can be NULL      #
		#         : p_nominal_code      - Details of charge to be applied              #
		#         : p_cost              - Cost details from opservm                    #
		#         : p_list_price        - Charge details from opservm                  #
		#         : p_charge_date       - Date to apply charges                        #
		#         : p_class_id          - Class ID associated with bill record         #
		#         : p_type_of_chg       - Type of charge being added                   #
		# Returns : l_bill_record_id    - Unique ID of new billing record              #
		#------------------------------------------------------------------------------#
		*/
		
		/*
		FUNCTION Charge_InsAdditional(p_subscriber_id, p_msisdn, p_histcode, p_twinbill,
			p_serv_code, p_nominal_code, p_cost, p_list_price, p_charge_date,
			p_class_id, p_type_of_chg)

			DEFINE
				-- Parameter variable(s)
				p_class_id					LIKE chg_charges.chg_class_id,
				p_cost						LIKE opservm.cost,
				p_histcode					LIKE msh_msisdn_history.msh_hist_code,
				p_list_price				LIKE opservm.list_price,
				p_nominal_code				LIKE chg_charges.chg_ncode,
				p_msisdn					CHAR(15),
				p_serv_code					CHAR(4),
				p_twinbill					CHAR(1),
				p_type_of_chg				CHAR(3),
				p_charge_date				DATE,
				p_subscriber_id				INTEGER,

				-- Function variable(s)
				l_sbd						RECORD LIKE sbd_sub_dets.*,
				l_smn						RECORD LIKE smn_sim_nos.*,
				l_tt						RECORD LIKE tt_type_text.*,
				l_vsr2						RECORD LIKE vsr2_service_aux.*,
				l_bcy						RECORD LIKE bcy_billing_cycle.*,

				l_chg_code					LIKE chg_charges.chg_code,
				l_effective_date			LIKE chg_charges.chg_effective_date,
				l_hval						LIKE msh_msisdn_history.msh_comment,
				l_network_id				LIKE vpn_provider_netwk.vpn_provider_id,
				l_network_prefix			LIKE vpn_provider_netwk.vpn_network_prefix,
				l_sparech					LIKE bill_cccccyyyymmdd.sparech,
				l_technology				LIKE vsr2_service_aux.vsr2_technology,

				l_error_text				CHAR(500),
				l_function					CHAR(50),

				l_bill_record_id			INTEGER,
				l_bill_to					DATE,

				l_precharge					SMALLINT,
				l_status					SMALLINT,
				l_account					CHAR(8)

			WHENEVER ANY ERROR CALL error_classify

			CALL BeginTransaction ("Charge_InsAdditional")

			LET l_function = ": Charge_InsAdditional()"

			LET l_bil_lrecord_id = NULL

			CASE
				WHEN p_subscriber_id IS NULL
					CALL Error_SeriousError(
						" Mandatory parameter p_subscriber_id is NULL ", l_function)

				WHEN LENGTH(p_msisdn) = 0
					CALL Error_SeriousError(" Mandatory parameter p_msisdn is NULL ",
						l_function)

				WHEN LENGTH(p_histcode) = 0
					CALL Error_SeriousError(" Mandatory parameter p_histcode is NULL ",
						l_function)

				WHEN LENGTH(p_twinbill) = 0
					CALL Error_SeriousError( " Mandatory parameter p_twinbill is NULL ",
						l_function)

				WHEN LENGTH(p_nominal_code) = 0
					CALL Error_SeriousError(
						" Mandatory parameter p_nominal_code is NULL ", l_function)

				WHEN p_cost IS NULL
					CALL Error_SeriousError(" Mandatory parameter p_cost is NULL ",
						l_function)

				WHEN p_list_price IS NULL
					CALL Error_SeriousError(
						" Mandatory parameter p_price_list is NULL ", l_function)

				WHEN p_class_id IS NULL

					-- Blank class ID
					CALL Error_SeriousError(" Mandatory parameter p_class_id is NULL ",
						l_function)

				WHEN LENGTH(p_type_of_chg) = 0

					-- Blank class ID
					CALL Error_SeriousError(
						" Mandatory parameter p_type_of_chg is NULL ", l_function)
			END CASE

			-- This while is set up so easy exit can be achieved when an error is
			-- detected i.e. g_status_class != 0, and is NOT a recurring loop

			-- All mandatory parameters present
			WHILE g_status_class = 0

				IF p_charge_date IS NULL THEN
					LET p_charge_date = TODAY
				END IF
 ===================== DONE to here
		*/
		
//				-- Retrieve chg_charges record
//				CALL Network_GetMsisdn(p_msisdn) RETURNING      l_network_id,
//					l_network_prefix
		
		VpnProviderNetwkDMO vpnDMO = null;
		QueryFilter filter = new QueryFilter();
		filter.add(FilterOp.EQUAL, VpnProviderNetwkDMO.vpnNetworkPrefixFilter, msisdn.substring(0, 2));

			vpnDMO = base.vpnProviderNetwk().get(filter);
		
//
//				IF g_status_class != 0 THEN
//					CALL Error_Append("", l_function)
//					EXIT WHILE
//				END IF
//
//				CALL d_chg_ncode_get(p_nominal_code) RETURNING l_chg_code
			
			ChgChargesDMO  chgDMO = null;
			filter = new QueryFilter();
			filter.add(FilterOp.EQUAL, ChgChargesDMO.chgNcodeFilter, this
				.getNominalCode());
			
			chgDMO = base.chgCharges().get(filter);
//
//				IF g_status_class != 0 THEN
//					CALL Error_Append("", l_function)
//					EXIT WHILE
//				END IF
//
//				-- Check if chg_code exists as a pre-charge code
//				LET l_precharge = FALSE
//
//				CALL TypeText_Get("CALLPRECHG", l_chg_code) RETURNING l_tt.*
			
				filter = new QueryFilter();
				filter.add(FilterOp.EQUAL, TtTypeTextDMO.ttGroupFilter, "CALLPRECHG");
				filter.add(FilterOp.EQUAL, TtTypeTextDMO.ttTypeFilter, chgDMO.getChgCode());
				
				ttTypeTextDMO = base.ttTypeText().get(filter);
				
				systemkeys = SystemKeyCache.getInstance(base);
				String keyValue = systemkeys.getKeyValue("ASDEFCLANG", KeyTable.SYSDIRM);
				
				System.out.println(chgDMO.getChgCode());
//				if(ttTypeTextDMO != null){
//					System.out.println(ttTypeTextDMO.getTtLang());
//				}else{
//					System.out.println("ttTypeTextDMO IS NULL");
//				}
				
				
				if(ttTypeTextDMO.getTtLang().equals(keyValue)){
					preCharge = true;
				}else{
					throw new EPPIXFatalException("The CALLPRECHG in tt_type_text does not match system key values and is rejected");
				}
			
//				CASE
//					WHEN g_status_class = 0
//						LET l_precharge = TRUE
//
//					WHEN g_status_class = 100
//						CALL error_reset()
//
//					WHEN g_status_class != 0 AND g_status_class != 100
//						CALL Error_Append("", l_function)
//						EXIT WHILE
//
//				END CASE
//
//				-- Retrieve SIM
//				IF l_precharge = TRUE THEN
//					CALL Sim_GetForMsisdn(p_msisdn) RETURNING l_smn.*, l_account
//
//					IF g_status_class != 0 THEN
//						CALL Error_Append("", l_function)
//						EXIT WHILE
//					END IF
//
//				END IF

				/*
					-- Get the SIM record for the MSISDN
					SELECT smn_sim_nos.*
					INTO l_sim.*
					FROM vam_active_msisdn, smn_sim_nos
					WHERE vam_msisdn_no = p_msisdn_no
					AND smn_sim_no = vam_sim_no
				 */
				
				VamActiveMsisdnDMO vamDMO = null;
				filter= new QueryFilter();
				filter.add(FilterOp.EQUAL, VamActiveMsisdnDMO.vamMsisdnNoFilter, this.getMsisdn());
				
				vamDMO = base.vamActiveMsisdn().get(filter);

				if(preCharge){
					if(vamDMO != null){
						filter = new QueryFilter();
						filter.add(FilterOp.EQUAL, SmnSimNosDMO.smnSimNoFilter, vamDMO.getVamSimNo());
						smnSimNosDMO = base.smnSimNos().get(filter);
					}else{
						thrower.fatal("Could not retrieve Active MSISDN from VAM table");
					}
				}
//
//				#--------------------------------------------------------------------#
//				# If a service code is passed then attempt to get the technology.    #
//				# For the time being this will probably be GSM. If a record is       #
//				# not found then the technology is still being set to GSM. This      #
//				# may  have to change when multi technologies is fully implemented   #
//				# as sometimes the service code is not known for charges which       #
//				# would be grouped as GSM.                                           #
//				#--------------------------------------------------------------------#
//				IF LENGTH(p_serv_code) > 0 THEN
//					CALL ServiceAux_Get(p_serv_code) RETURNING l_vsr2.*
				
//					CASE g_status_class
//						WHEN 0
//							LET l_technology = l_vsr2.vsr2_technology
//
//						WHEN 100
//							LET l_technology = "GSM"
//							CALL error_reset()
//
//						OTHERWISE
//							CALL Error_Append("", l_function)
//							EXIT WHILE
//					END CASE
//				ELSE
//					LET l_technology = "GSM"
//				END IF
				
				if(this.getServCode().length() > 0){
					filter = new QueryFilter();
					filter.add(FilterOp.EQUAL, Vsr2ServiceAuxDMO.vsr2ServiceCodeFilter, this.getServCode());
					
					vsr2ServiceAuxDMO =  base.vsr2ServiceAux().get(filter);
					
					if(vsr2ServiceAuxDMO != null){
						this.technology = vsr2ServiceAuxDMO.getVsr2Technology();
					}else{
						this.technology = "GSM";
					}
				}else{
					this.technology = "GSM";
				}

				String sparec2 = "";
				if(this.getTypeoFChg().equals("ADD")){
//				CASE p_type_of_chg
//					WHEN "ADD"
//						LET l_sparech = NULL
//						LET l_sparech[1,3] = "CFA"
//						LET l_sparech[17,23] = p_histcode
//						LET l_sparech[27,30] = p_serv_code
					
					sparec2 = "CFA" + this.sparech.substring(3, 16);
					sparec2 = sparec2 + this.histCode + this.sparech.substring(22, 25);
					sparec2 = sparec2 + this.servCode;
					this.sparech = sparec2;					
				}else if(this.getTypeoFChg().equals("VR+")){
//					WHEN "VR+"
//						LET l_sparech = NULL
//						LET l_sparech[1,3] = "CFF"
//						LET l_sparech[17,23] = p_histcode
//						LET l_sparech[27,30] = p_serv_code
					sparec2 = "CFA" + this.sparech.substring(3, 16);
					sparec2 = sparec2 + this.histCode + this.sparech.substring(22, 25);
					sparec2 = sparec2 + this.servCode;
					this.sparech = sparec2;
				}else if(this.getTypeoFChg().equals("VR-")){
//					WHEN "VR-"
//						LET l_sparech = NULL
//						LET l_sparech[1,3] = "CFF"
//						LET l_sparech[17,23] = p_histcode
//						LET l_sparech[27,30] = p_serv_code
					sparec2 = "CFA" + this.sparech.substring(3, 16);
					sparec2 = sparec2 + this.histCode + this.sparech.substring(22, 25);
					sparec2 = sparec2 + this.servCode;
					this.sparech = sparec2;
				}else{
//					OTHERWISE
//						LET l_sparech = p_type_of_chg
					this.sparech = this.typeoFChg;
					
				}
//				END CASE
//
//				SELECT *
//				INTO l_sbd.*, l_bcy.*
//				FROM sbd_sub_dets, bcy_billing_cycle
//				WHERE sbd_subscriber_id = p_subscriber_id
//				AND sbd_bill_cycle =  bcy_bill_cycle
				
//				sbdSubDetsDMO
//				bcyBillingCycleDMO
				
				filter = new QueryFilter();
				filter.add(FilterOp.EQUAL, SbdSubDetsDMO.sbdSubscriberIdFilter, this.getSubscriberId());
				
				sbdSubDetsDMO = base.sbdSubDets().get(filter);
				
				if(sbdSubDetsDMO != null){
					filter = new QueryFilter();
					filter.add(FilterOp.EQUAL, BcyBillingCycleDMO.bcyBillCycleFilter, sbdSubDetsDMO.getSbdBillCycle());
					bcyBillingCycleDMO = base.bcyBillingCycle().get(filter);
					
					if(bcyBillingCycleDMO == null){
						thrower.fatal("No Bill Cycle details found for subscriber " + this.getSubscriberId());
					}
				}else{
					thrower.fatal("No Subscriber details found for subscriber " + this.getSubscriberId());
				}
//
//				LET l_status = SQLCA.SQLCODE
//
//				IF l_status != 0 THEN
//					IF l_status = 100 THEN
//						-- No record found
//						LET l_error_text = "No Bill Cycle details found ",
//							"for Subscriber '", p_subscriber_id CLIPPED, "'"
//						CALL Error_SeriousError(l_error_text, l_function)
//					ELSE
//						-- Problem with SQL
//						CALL Error_SeriousError("", l_function)
//						EXIT WHILE
//					END IF
//				END IF
//
//				let l_bill_to = l_bcy.bcy_next_run
				this.billTo = bcyBillingCycleDMO.getBcyNextRun();
				
//				CALL BillTable_Ins(p_subscriber_id, p_msisdn, p_nominal_code, "n",
//					p_charge_date, p_cost, p_list_price, l_sparech, "0", p_twinbill,
//					"", "", l_sbd.sbd_bill_cycle, "", today, l_bill_to, "", "", "", "",
//					p_class_id, l_technology, l_sbd.sbd_package_code)
//				RETURNING l_bill_record_id
				
				/**
				 * Change done on 20-11-2009 by SJ:
				 * 
				 * This is a quick fix to be replace with full query to cevatm
				 * table for percentage
				 */
				
				if(chgDMO.getChgCode().equalsIgnoreCase("SMC") || chgDMO.getChgCode().equalsIgnoreCase("SMR")){
					
					BigDecimal perc = new BigDecimal(1.14);
					BigDecimal amt = this.getListPrice().divide(perc, BigDecimal.ROUND_HALF_UP);
					
					this.setVatAmount(this.getListPrice().subtract(amt));
					this.setListPrice(this.getListPrice().subtract(this.getVatAmount()));
					
				}

				this.billTableIns();

				/**
				 * TODO SJ: Resume from here to complete the method
				 */
				
//				IF g_status_class != 0 THEN
//
//					CALL Error_Append("", l_function)
//					EXIT WHILE
//				END IF
//
//				-- Create the calls pre-charge credit balance
//				IF l_precharge = TRUE THEN
//					CALL d_cpc_ins(0, p_subscriber_id, p_msisdn, l_smn.smn_sim_no,
//						l_network_id, l_chg_code, p_charge_date, p_list_price,
//						p_list_price, TODAY, "", "", 0)
//				cpc_ins this function only insert a record into cpc
			
		if(preCharge){	
			CpcCallPrechargeDMO cpcDMO = new CpcCallPrechargeDMO();
			cpcDMO.setCpcSubscriber(this.getSubscriberId());
			cpcDMO.setCpcMsisdn(this.getMsisdn());
			cpcDMO.setCpcSimNo(smnSimNosDMO.getSmnSimNo());
			cpcDMO.setCpcNetworkId(vpnDMO.getVpnProviderId());
			cpcDMO.setCpcChargeCode(chgDMO.getChgCode());
			cpcDMO.setCpcPrechargeDate(this.getChargeDate());
			cpcDMO.setCpcAmount(this.getListPrice());
			cpcDMO.setCpcRemaining(this.getListPrice());
			cpcDMO.setCpcCreatedDate(new Date());
			cpcDMO.setCpcLastBilldate(null);
			cpcDMO.setCpcLastInvoice(null);
			cpcDMO.setCpcLastCredit(0.00);

			
			
			cpcDMO = base.cpcCallPrecharge().create(cpcDMO);
		}
			
//
			
//					IF g_status_class != 0 THEN
//						CALL Error_Append("", l_function)
//						EXIT WHILE
//					END IF
//				END IF
//
//				-- Create the History String
//				LET l_hval = NULL
			/**
			 * We need to create a fix lenth string of 50 char empty spaces. 
			 * Then replace char at given index positions.
			 */
			
			this.hVal = new char[50];

			for(int i = 0; i < 50; i++){
				this.hVal[i] = ' ';
			}
			
			if(this.typeoFChg.equals("ADD")){
//				CASE p_type_of_chg
//					WHEN "ADD"
//						IF l_precharge = TRUE THEN
//							LET p_histcode = "BCUA"
//						END IF
				this.histCode = "BCUA";
//						LET l_hval[1,3] = "CFA"
				this.hVal = this.replaceString(this.hVal, "CFA", 0);
			}else if(this.typeoFChg.equals("VR+")){
//					WHEN "VR+"
//						LET l_hval[1,3] = "CFF"
				this.hVal = this.replaceString(this.hVal, "CFF", 0);
			}else if(this.typeoFChg.equals("VR-")){
//					WHEN "VR-"
//						LET l_hval[1,3] = "CFF"
				this.hVal = this.replaceString(this.hVal, "CFF", 0);
			}else{
//					OTHERWISE
//						LET l_hval[1,3] = p_type_of_chg CLIPPED
				this.hVal = this.replaceString(this.hVal, this.getTypeoFChg().substring(0, 3), 0);
//				END CASE
			}
//				LET l_hval[5,24] = p_nominal_code
			this.hVal = this.replaceString(this.hVal, this.getNominalCode(), 5);
//				LET l_hval[25,45] = epx_format_decimal(p_list_price,"","<",0)
			this.listPrice.toString();
			this.hVal = this.replaceString(this.hVal, this.listPrice.toString(), 25);
			
			if(this.getServCode().length() > 0){
//				IF LENGTH(p_serv_code) > 0 THEN
//					LET l_hval[47,50] = p_serv_code
//				END IF
				this.hVal = this.replaceString(this.hVal, this.getServCode(), 47);
			}
//
//				CALL history_insertmsisdn(p_subscriber_id,p_msisdn,p_histcode,l_hval)
				MshMsisdnHistoryDMO mshDMO = new MshMsisdnHistoryDMO();
				mshDMO.setMshSubscriberId(this.getSubscriberId());
				mshDMO.setMshMsisdnNo(this.getMsisdn());
				mshDMO.setMshHistCode(this.histCode);
				mshDMO.setMshComment(this.hVal.toString());
				mshDMO.setMshUserId("");
				mshDMO.setMshTerminalId(null);
				mshDMO.setMshTimestamp(new DateTime());
				
				base.mshMsisdnHistory().create(mshDMO);
				
				/**
				 * TODO SJ:
				 * The original 4gl code that doest the insert into msh
				 * will also send a SMS to the subscriber notifying of the change
				 * 
				 * Will need todo this in java 
				 */
			
//				CASE
//					WHEN g_status_class = 100
//
//						CALL Error_SeriousError("", l_function)
//						EXIT WHILE
//
//					WHEN g_status_class != 0
//
//						CALL Error_Append("", l_function)
//						EXIT WHILE
//				END CASE
//
//				CALL History_InsSubscriber(p_subscriber_id, 0, p_histcode, l_hval, "")
				SbhSubHistoryDMO sbhDMO = new SbhSubHistoryDMO();
				sbhDMO.setSbhSubscriberId(this.getSubscriberId());
				sbhDMO.setSbhHistCode(this.histCode);
				sbhDMO.setSbhOldValue(this.hVal.toString());
				sbhDMO.setSbhNewValue("");
				sbhDMO.setSbhUserId("");
				sbhDMO.setSbhTerminalId(null);
				sbhDMO.setSbhTimestamp(new DateTime());
				
				base.sbhSubHistory().create(sbhDMO);
				
				
//				CASE
//					WHEN g_status_class = 100
//						CALL Error_SeriousError("", l_function)
//						EXIT WHILE
//					WHEN g_status_class != 0
//						CALL Error_Append("", l_function)
//						EXIT WHILE
//				END CASE
//
//				-- Make sure only once round loop
//				EXIT WHILE
//			END WHILE
//
//			IF g_status_class != 0 THEN
//				CALL RollbackTransaction ("Charge_InsAdditional")
//			ELSE
//				CALL CommitTransaction ("Charge_InsAdditional")
//			END IF
//
//			RETURN l_bill_record_id
//
//		END FUNCTION				
	}

	public Integer getSubscriberId() {
		return subscriberId;
	}

	public void setSubscriberId(Integer subscriberId)
			throws EPPIXSeriousException {
		thrower.ifParameterMissing("subscriberId", subscriberId);
		this.subscriberId = subscriberId;
	}

	public String getMsisdn() {
		return msisdn;
	}

	public void setMsisdn(String msisdn) throws EPPIXSeriousException {
		thrower.ifParameterMissing("msisdn", msisdn);
		this.msisdn = msisdn;
	}

	public String getHistCode() {
		return histCode;
	}

	public void setHistCode(String histCode) throws EPPIXSeriousException {
		thrower.ifParameterMissing("histCode", histCode);
		this.histCode = histCode;
	}

	public Short getTwinBill() {
		return twinBill;
	}

	public void setTwinBill(Short twinBill) {
		this.twinBill = twinBill;
	}

	public String getServCode() {
		return servCode;
	}

	public void setServCode(String servCode) throws EPPIXSeriousException {
//		thrower.ifParameterMissing("servCode", servCode);
		this.servCode = servCode;
	}

	public String getNominalCode() {
		return nominalCode;
	}

	public void setNominalCode(String nominalCode) throws EPPIXSeriousException {
		thrower.ifParameterMissing("nominalCode", nominalCode);
		this.nominalCode = nominalCode;
	}

	public BigDecimal getCost() {
		return cost;
	}

	public void setCost(BigDecimal cost) throws EPPIXSeriousException {
		thrower.ifParameterMissing("cost", cost);
		this.cost = cost;
	}

	public BigDecimal getListPrice() {
		return listPrice;
	}

	public void setListPrice(BigDecimal listPrice) throws EPPIXSeriousException {
		thrower.ifParameterMissing("listPrice", listPrice);
		this.listPrice = listPrice;
	}

	public Date getChargeDate() {
		return chargeDate;
	}

	public void setChargeDate(Date chargeDate) {
		this.chargeDate = (chargeDate == null) ? new Date() : chargeDate;
	}

	public Integer getClassId() {
		return classId;
	}

	public void setClassId(Integer classId) throws EPPIXSeriousException {
		thrower.ifParameterMissing("classId", classId);
		this.classId = classId;
	}

	public String getTypeoFChg() {
		return typeoFChg;
	}

	public void setTypeoFChg(String typeoFChg) throws EPPIXSeriousException {
		thrower.ifParameterMissing("typeoFChg", typeoFChg);
		this.typeoFChg = typeoFChg;
	}

	public Integer getBillRecordId() {
		return billRecordId;
	}

	public void setBillRecordId(Integer billRecordId) {
		this.billRecordId = billRecordId;
	}
	
	public BigDecimal getVatAmount() {
		return vatAmount;
	}

	public void setVatAmount(BigDecimal vatAmount) {
		this.vatAmount = vatAmount;
	}	
	

	/**
	 * Replace 4gl function BillTable_Ins(p_subscriber, p_msisdn, p_fserv_code,
	 * p_bill_ind, p_bill_date, p_cost, p_charge, p_charge_type, p_invoice_no,
	 * p_twinbill_no, p_vat_amount, p_vat_rate, p_bill_cycle, p_vat_code,
	 * p_start_period, p_end_period, p_batch_run_num, p_currency_charge,
	 * p_exchange_rate, p_exch_operator, p_class_id, p_technology, p_package)
	 * 
	 * @throws EPPIXBusinessException
	 * @throws EPPIXUnexpectedException
	 * @throws EPPIXFatalException
	 */
	private void billTableIns() throws EPPIXBusinessException,
			EPPIXUnexpectedException, EPPIXFatalException {
		// FUNCTION BillTable_Ins(p_subscriber, p_msisdn, p_fserv_code,
		// p_bill_ind,
		// p_bill_date, p_cost, p_charge, p_charge_type, p_invoice_no,
		// p_twinbill_no,
		// p_vat_amount, p_vat_rate, p_bill_cycle, p_vat_code, p_start_period,
		// p_end_period, p_batch_run_num, p_currency_charge, p_exchange_rate,
		// p_exch_operator, p_class_id, p_technology, p_package)

		BillCccccyyyymmddDMO billDMO = new BillCccccyyyymmddDMO();
		billDMO.setSubscriberId(this.getSubscriberId());
		billDMO.setHandset(this.getMsisdn());
		billDMO.setChaserv(this.getNominalCode());
		billDMO.setBillind("n");
		billDMO.setBilldat(this.getChargeDate());
		billDMO.setCost(this.getCost());
		billDMO.setCharge(this.getListPrice());
		billDMO.setSparech(this.sparech);
		billDMO.setInvoiceNo("0");
		billDMO.setTwinbillNo(this.getTwinBill());
		billDMO.setVatamt(this.getVatAmount());
		billDMO.setVatrate(null);
		billDMO.setCycleNo(sbdSubDetsDMO.getSbdBillCycle());
		billDMO.setVatcode("");
		billDMO.setStartPeriod(new Date());
		billDMO.setEndPeriod(this.billTo);
		billDMO.setBatchRunNum(null);
		billDMO.setCurrencyCharge(null);
		billDMO.setExchangeRate(null);
		billDMO.setExchOperator("");
		billDMO.setChargeClassId(this.getClassId());
		billDMO.setTechnology(this.technology);
		billDMO.setPackge(sbdSubDetsDMO.getSbdPackageCode());

		// DEFINE
		// -- Parameter variable(s)
		// p_batch_run_num LIKE bill_cccccyyyymmdd.batch_run_num,
		// p_bill_cycle LIKE bill_cccccyyyymmdd.cycle_no,
		// p_bill_date LIKE bill_cccccyyyymmdd.billdat,
		// p_bill_ind LIKE bill_cccccyyyymmdd.billind,
		// p_charge LIKE bill_cccccyyyymmdd.charge,
		// p_charge_type LIKE bill_cccccyyyymmdd.sparech,
		// p_class_id LIKE chg_charges.chg_class_id,
		// p_cost LIKE bill_cccccyyyymmdd.cost,
		// p_currency_charge LIKE bill_cccccyyyymmdd.currency_charge,
		// p_end_period LIKE bill_cccccyyyymmdd.end_period,
		// p_exch_operator LIKE bill_cccccyyyymmdd.exch_operator,
		// p_exchange_rate LIKE bill_cccccyyyymmdd.exchange_rate,
		// p_fserv_code LIKE bill_cccccyyyymmdd.chaserv,
		// p_invoice_no LIKE bill_cccccyyyymmdd.invoice_no,
		// p_msisdn LIKE bill_cccccyyyymmdd.handset,
		// p_package LIKE bill_cccccyyyymmdd.package,
		// p_start_period LIKE bill_cccccyyyymmdd.start_period,
		// p_subscriber LIKE bill_cccccyyyymmdd.subscriber_id,
		// p_technology LIKE bill_cccccyyyymmdd.technology,
		// p_twinbill_no LIKE bill_cccccyyyymmdd.twinbill_no,
		// p_vat_amount LIKE bill_cccccyyyymmdd.vatamt,
		// p_vat_code LIKE bill_cccccyyyymmdd.vatcode,
		// p_vat_rate LIKE bill_cccccyyyymmdd.vatrate,
		//
		// -- Function variable(s)
		// l_billing RECORD LIKE bcy_billing_cycle.*,
		//
		// l_bill_ac_no LIKE sbd_sub_dets.sbd_bill_ac_no,
		// l_timestamp LIKE bill_cccccyyyymmdd.timestamp,
		//
		// l_error_text CHAR(500),
		// l_function CHAR(50),
		// l_string CHAR(500),
		// l_table CHAR(18),
		//
		// l_bill_record_id INTEGER,
		// l_max_subs INTEGER,
		// l_retval INTEGER,
		// l_serv_prov INTEGER
		//
		// WHENEVER ANY ERROR CALL error_classify
		//
		// CALL BeginTransaction ("BillTable_Ins")
		//
		// LET l_function = ": BillTable_Ins()"
		//
		// LET l_bill_record_id = NULL

		this.setBillRecordId(null);
		//
		// CASE
		// WHEN p_subscriber IS NULL
		// CALL Error_SeriousError(
		// " Mandatory parameter p_subscriber is NULL ", l_function)
		//
		// WHEN LENGTH(p_msisdn) = 0
		// CALL Error_SeriousError(" Mandatory parameter p_msisdn is NULL ",
		// l_function)
		//
		// WHEN LENGTH(p_fserv_code) = 0
		// CALL Error_SeriousError(
		// " Mandatory parameter p_fserv_code is NULL ", l_function)
		//
		// WHEN LENGTH(p_bill_ind) = 0
		// CALL Error_SeriousError(" Mandatory parameter p_bill_ind is NULL ",
		// l_function)
		//
		// WHEN p_bill_date IS NULL
		// CALL Error_SeriousError(" Mandatory parameter p_bill_date is NULL ",
		// l_function)
		//
		// WHEN p_cost IS NULL
		// CALL Error_SeriousError(" Mandatory parameter p_cost is NULL ",
		// l_function)
		//
		// WHEN p_charge IS NULL
		// CALL Error_SeriousError(" Mandatory parameter p_charge is NULL ",
		// l_function)
		//
		// WHEN LENGTH(p_charge_type) = 0
		// CALL Error_SeriousError(
		// " Mandatory parameter p_charge_type is NULL ", l_function)
		//
		// WHEN LENGTH(p_invoice_no) = 0
		// CALL Error_SeriousError(
		// " Mandatory parameter p_invoice_no is NULL ", l_function)
		//
		// WHEN p_twinbill_no IS NULL
		// CALL Error_SeriousError(
		// " Mandatory parameter p_twinbill_no is NULL ", l_function)
		//
		// WHEN LENGTH(p_bill_cycle) = 0
		// CALL Error_SeriousError(
		// " Mandatory parameter p_bill_cycle is NULL ", l_function)
		// END CASE
		//
		// WHILE g_status_class = 0
		//
		// LET l_timestamp = CURRENT

		// CALL BillingCycle_Get(p_bill_cycle)
		// RETURNING l_billing.*, l_serv_prov, l_max_subs
		billDMO.setTimestamp(new DateTime());

		// IF g_status_class != 0 THEN
		//
		// CALL Error_Append("", l_function)
		// EXIT WHILE
		// END IF
		//
		// -- Use new format table name
		// LET l_table = "bill_", p_bill_cycle CLIPPED,
		// l_billing.bcy_next_run USING "yyyymmdd"

		String tableName = "bill_"
				+ this.bcyBillingCycleDMO.getBcyBillCycle().trim()
				+ new Date().formatYYYYMMDD(bcyBillingCycleDMO.getBcyNextRun());
		
		if(logger.isDebugEnabled()){
			logger.debug("Bill table to insert into: " + tableName);
		}
		//
		// LET l_string =
		// "INSERT INTO ", l_table CLIPPED,
		// " VALUES (0, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ",
		// "?, ?, ?, ?, ?, ?, ?, ?)"
		//
		// PREPARE m_insert_charge FROM l_string
		//
		// IF g_status_class != 0 THEN
		// CALL Error_Append("", l_function)
		// EXIT WHILE
		// END IF
		//
		// EXECUTE m_insert_charge
		// USING p_subscriber, p_msisdn, p_fserv_code, p_bill_ind, p_bill_date,
		// p_cost, p_charge, p_charge_type, p_invoice_no, p_twinbill_no,
		// p_vat_amount, p_vat_rate, p_bill_cycle, p_vat_code,
		// p_start_period, p_end_period, p_batch_run_num, l_timestamp,
		// p_currency_charge, p_exchange_rate, p_exch_operator, p_class_id,
		// p_technology, p_package

		BillCccccyyyymmddDMO returnDMO = null;
		returnDMO = base.billCccccyyyymmdd().create(billDMO, tableName);

		// CASE
		// WHEN g_status_class != 0
		//
		// CALL Error_SeriousError("", l_function)
		// EXIT WHILE
		//
		// WHEN SQLCA.SQLERRD[3] != 1
		//
		// LET l_error_text = "Error Inserting into table '",
		// l_table CLIPPED, "'"
		// CALL Error_SeriousError(l_error_text, l_function)
		// EXIT WHILE
		//
		// OTHERWISE
		//
		// LET l_bill_record_id = SQLCA.SQLERRD[2]
		// END CASE

		if (returnDMO != null) {
			this.setBillRecordId(returnDMO.getBillId());
		} else {
			thrower.fatal("Bill record for subscriber: "
					+ this.getSubscriberId()
					+ " could not be created into table: " + tableName);
		}
		//
		// # Get the account number for this subscriber...
		//
		// CALL d_sbd_cust_get (p_subscriber)
		// RETURNING l_bill_ac_no

		// IF g_status_class <> 0 THEN
		//
		// CALL Error_Append ("", l_function)
		// EXIT WHILE
		//
		// END IF
		//
		// # Update the crb table...
		//
		// CALL d_crb_charge_upd (l_bill_ac_no, p_fserv_code,
		// p_charge)

		this.crbChargeUpdate(sbdSubDetsDMO.getSbdBillAcNo(),
				this.getServCode(), billDMO.getCharge());
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

		this.updateLimitDiff("C", sbdSubDetsDMO.getSbdBillAcNo(),
				new Integer(0));

		// CASE l_retval
		// WHEN -1
		// LET l_error_text = "Insufficient arguments passed to c function"
		// CALL Error_SeriousError(l_error_text,l_function)
		// EXIT WHILE
		//
		// WHEN -2
		// LET l_error_text = "Invalid Type passed.  Only 'C' and 'S' accepted"
		// CALL Error_SeriousError(l_error_text,l_function)
		// EXIT WHILE
		//
		// WHEN -6
		// LET l_error_text = "BillTable_Ins1: Customer, ", l_bill_ac_no,
		// ", not found in the CRB table"
		// CALL Error_SeriousError(l_error_text,l_function)
		// EXIT WHILE
		//
		// WHEN -7
		// LET l_error_text = "Failed to update the CRB table"
		// CALL Error_SeriousError(l_error_text,l_function)
		// EXIT WHILE
		// END CASE
		//
		// # Update the blh_bill_limit_header table...
		//
		// CALL d_blh_charge_upd (p_subscriber, p_charge)
		this.blhChargeUpdate(sbdSubDetsDMO.getSbdSubscriberId(), billDMO
				.getCharge());
		//
		// IF g_status_class <> 0 THEN
		//
		// CALL Error_Append ("", l_function)
		// EXIT WHILE
		//
		// END IF
		//
		// # LET l_retval = nupdatelimitdiffs_fgl ("S", l_bill_ac_no,
		// p_subscriber)
		// CALL d_upd_limit_diff("S", l_bill_ac_no, p_subscriber) RETURNING
		// l_retval

		this.updateLimitDiff("S", sbdSubDetsDMO.getSbdBillAcNo(), this
				.getSubscriberId());
		//
		// CASE l_retval
		// WHEN -1
		// LET l_error_text = "Insufficient arguments passed to c function"
		// CALL Error_SeriousError(l_error_text,l_function)
		// EXIT WHILE
		//
		// WHEN -2
		// LET l_error_text = "Invalid Type passed.  Only 'C' and 'S' accepted"
		// CALL Error_SeriousError(l_error_text,l_function)
		// EXIT WHILE
		//
		// WHEN -6
		// LET l_error_text = "BillTable_Ins2: Customer, ", l_bill_ac_no,
		// ", not found in the CRB table"
		// CALL Error_SeriousError(l_error_text,l_function)
		// EXIT WHILE
		//
		// WHEN -7
		// LET l_error_text = "Failed to update the CRB table"
		// CALL Error_SeriousError(l_error_text,l_function)
		// EXIT WHILE
		// END CASE
		//
		// # Only 1 lap of this loop...
		//
		// EXIT WHILE
		//
		// END WHILE
		//
		// IF g_status_class != 0 THEN
		// CALL RollbackTransaction ("BillTable_Ins")
		// ELSE
		// CALL CommitTransaction ("BillTable_Ins")
		// END IF
		//
		// RETURN l_bill_record_id
		//
		// END FUNCTION
	}

	//
	/**
	 * Replace 4gl function d_crb_charge_upd
	 * 
	 * @throws EPPIXFatalException
	 * @throws EPPIXUnexpectedException
	 * @throws EPPIXBusinessException
	 */

	public void crbChargeUpdate(String billAcNo, String billType,
			BigDecimal charge) throws EPPIXFatalException,
			EPPIXBusinessException, EPPIXUnexpectedException {

		if (logger.isDebugEnabled()) {
			logger.debug("crbChargeUpdate(String billAcNo: " + billAcNo
					+ ", String billType: " + billType
					+ ", BigDecimal charge: " + charge + ")");
		}

		thrower.ifParameterMissing("billAcNo", billAcNo);
//		thrower.ifParameterMissing("billType", billType);
		thrower.ifParameterMissing("charge", charge);

		// IF p_bill_type[1, 3] = "CCC" THEN

		// if(billType.substring(0, 3).equals("CCC")){
		// UPDATE crb_cust_risk_bal
		// SET crb_unbill_calls = crb_unbill_calls + p_charge
		// WHERE crb_bill_ac_no = p_bill_ac_no

		CrbCustRiskBalDMO crbDMO = new CrbCustRiskBalDMO();
		crbDMO.setCrbBillAcNo(billAcNo);

		crbDMO = base.crbCustRiskBal().get(crbDMO);

		if (crbDMO == null) {
			thrower.fatal("Could not retrieve the CRB Bill account: "
					+ billAcNo);
		} else {
			charge.add(crbDMO.getCrbUnbillCalls());
			crbDMO.setCrbUnbillCalls(charge);
			base.crbCustRiskBal().modify(crbDMO);
		}

		// }else{
		// ELSE

		// UPDATE crb_cust_risk_bal
		// SET crb_unbill_charges = crb_unbill_charges + p_charge
		// WHERE crb_bill_ac_no = p_bill_ac_no
		//
		// END IF
		// }
	}

	/**
	 * Replace 4gl function d_upd_limit_diff (p_type, p_bill_ac_no,
	 * p_subscriber_id)
	 * 
	 * @param type
	 * @param billAcNo
	 * @param subscriberId
	 * @throws EPPIXFatalException
	 * @throws EPPIXBusinessException
	 * @throws EPPIXUnexpectedException
	 */
	public void updateLimitDiff(String type, String billAcNo,
			Integer subscriberId) throws EPPIXFatalException,
			EPPIXBusinessException, EPPIXUnexpectedException {
		// FUNCTION d_upd_limit_diff (p_type, p_bill_ac_no, p_subscriber_id)

		thrower.ifParameterMissing("type", type);
		
		if (type.equalsIgnoreCase("C")) {
			thrower.ifParameterMissing("billAcNo", billAcNo);
		} else if (type.equalsIgnoreCase("S")) {
			thrower.ifParameterMissing("subscriberId", subscriberId);
		}

		// DEFINE
		// -- Parameter variable(s)
		// p_type CHAR(1),
		// p_bill_ac_no LIKE crb_cust_risk_bal.crb_bill_ac_no,
		// p_subscriber_id LIKE blh_bill_limit_hd.blh_subscriber_id,
		//
		// -- Function variable(s)
		// l_error_text CHAR (200),
		// l_function CHAR (50),
		// l_sql CHAR (500),
		//
		// l_retval INTEGER
		//
		// WHENEVER ANY ERROR CALL error_classify
		//
		// LET l_function = ": d_upd_limit_diff ()"

		//
		// -- This while is set up so easy exit can be achieved when an error is
		// -- detected i.e. g_status_class != 0, and is NOT a recurring loop
		// WHILE g_status_class = 0
		//
		// # Validate parameters
		// CASE
		//	        
		// WHEN LENGTH(p_type) = 0
		// -- Blank Type
		// LET l_error_text = "Invalid Type passed.  Only 'C' and 'S' accepted"
		// LET l_retval = -2
		// EXIT WHILE
		//		
		// -- cater for lower case typs
		// WHEN p_type = "c"
		// LET p_type = "C"
		// WHEN p_type = "s"
		// LET p_type = "S"
		//
		// -- check for dependancy parameters
		// WHEN p_type = "C"
		// -- Blank Bill Account Number
		// IF LENGTH(p_bill_ac_no) = 0 THEN
		// LET l_error_text = " Mandatory parameter p_bill_ac_no is NULL "
		// LET l_retval = -2
		// EXIT WHILE
		// END IF
		//		
		// WHEN p_type = "S"
		// -- Blank Subscriber ID
		// IF p_subscriber_id = 0
		// OR p_subscriber_id IS NULL THEN
		// LET l_error_text = " Mandatory parameter p_subscriber_id is NULL/0 "
		// LET l_retval = -2
		// EXIT WHILE
		// END IF
		//		
		// END CASE
		//		
		// -- All mandatory parameters present
		//
		// # Call necessary function
		//

		if (type.equalsIgnoreCase("C")) {
			// We check bill acount number, then submit to
			// CALL d_upd_credlim_diff(p_bill_ac_no) RETURNING l_retval
			this.updateCreditlimitDiff(billAcNo);
		} else if (type.equalsIgnoreCase("S")) {
			// We check subscriber id, then submit to
			// CALL d_upd_billlim_diff(p_subscriber_id) RETURNING l_retval
			this.updateBillLimDiff(subscriberId);
		} else {
			thrower.fatal("Type is invalid: " + type);
		}
		// CASE p_type
		// WHEN "C"
		// CALL d_upd_credlim_diff(p_bill_ac_no) RETURNING l_retval
		// WHEN "S"
		// CALL d_upd_billlim_diff(p_subscriber_id) RETURNING l_retval
		// OTHERWISE
		// LET l_retval = -2
		// END CASE
		//
		// # Only one lap around this loop...
		//
		// EXIT WHILE
		//
		// END WHILE
		//
		// CASE l_retval
		// WHEN -1
		// LET l_error_text = "Insufficient arguments passed to c function"
		// CALL Error_SeriousError(l_error_text,l_function)
		//
		// WHEN -2
		// CALL Error_SeriousError(l_error_text,l_function)
		//
		// WHEN -3
		// LET l_error_text =
		// "Subscriber ",p_subscriber_id," not found in the BLH table"
		// CALL Error_SeriousError(l_error_text,l_function)
		//
		// WHEN -4
		// LET l_error_text =
		// "Update of blh_bill_limit_hd for Subscriber ",p_subscriber_id," Failed"
		// CALL Error_SeriousError(l_error_text,l_function)
		//
		// WHEN -5
		// LET l_error_text = "Failed to update the CRB table for Subscriber ",
		// p_subscriber_id CLIPPED
		// CALL Error_SeriousError(l_error_text,l_function)
		//
		// WHEN -6
		// LET l_error_text = "Customer ", p_bill_ac_no CLIPPED,
		// ", not found in the CRB table"
		// CALL Error_SeriousError(l_error_text,l_function)
		//
		// WHEN -7
		// LET l_error_text = "Failed to update the CRB table for Customer ",
		// p_bill_ac_no CLIPPED
		// CALL Error_SeriousError(l_error_text,l_function)
		//
		// OTHERWISE
		// LET l_retval = 0
		// END CASE
		//
		// RETURN l_retval
		//
		// END FUNCTION

	}

	/**
	 * Replace 4gl function d_upd_credlim_diff (p_bill_ac_no)
	 * 
	 * @param billAcNo
	 * @throws EPPIXBusinessException
	 * @throws EPPIXUnexpectedException
	 * @throws EPPIXFatalException
	 */
	public void updateCreditlimitDiff(String billAcNo)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		// FUNCTION d_upd_credlim_diff (p_bill_ac_no)
		//
		// DEFINE
		// -- Parameter variable(s)
		// p_bill_ac_no LIKE crb_cust_risk_bal.crb_bill_ac_no,
		//
		// -- Function variable(s)
		// l_crb RECORD LIKE crb_cust_risk_bal.*,
		// p_crb RECORD LIKE crb_cust_risk_bal.*,
		// l_crb_diff LIKE crb_cust_risk_bal.crb_diff,
		// l_crb_bl_diff LIKE crb_cust_risk_bal.crb_bl_diff,
		// l_error_text CHAR (200),
		// l_function CHAR (50),
		// l_sql CHAR (500),
		//
		// l_retval INTEGER
		//
		// WHENEVER ANY ERROR CALL error_classify
		//
		// LET l_function = ": d_upd_credlim_diff ()"
		//
		// -- initialize variables
		// INITIALIZE l_crb.*,p_crb.* TO NULL
		// LET l_retval = 0
		//
		// -- This while is set up so easy exit can be achieved when an error is
		// -- detected i.e. g_status_class != 0, and is NOT a recurring loop
		//
		// WHILE g_status_class = 0

		CrbCustRiskBalDMO returnCrbDMO = null;
		CrbCustRiskBalDMO crbDMO = null;
		QueryFilter filter = new QueryFilter();
		filter.add(FilterOp.EQUAL, CrbCustRiskBalDMO.crbBillAcNoFilter,
				billAcNo);

		returnCrbDMO = base.crbCustRiskBal().get(filter);

		// CALL d_crb_get(p_bill_ac_no) RETURNING l_crb.*
		// IF g_status_class != 0 THEN
		// CALL Error_Append("", l_function)
		// LET l_retval = -6
		// EXIT WHILE
		// END IF

		crbDMO = this.calculateCreditlimitDiffs(returnCrbDMO);

		// CALL d_calc_credlim_diffs(l_crb.*) RETURNING p_crb.*
		// IF g_status_class != 0 THEN
		// CALL Error_Append("", l_function)
		// LET l_retval = -6
		// EXIT WHILE
		// END IF

		filter = new QueryFilter();

		if (crbDMO.getCrbDiff().shortValue() != returnCrbDMO.getCrbDiff().shortValue()) {
			// IF l_crb.crb_diff != p_crb.crb_diff THEN
			//
			// UPDATE crb_cust_risk_bal set crb_diff = p_crb.crb_diff
			// WHERE crb_bill_ac_no = p_bill_ac_no
			filter.add(FilterOp.SET, CrbCustRiskBalDMO.crbDiffFilter, crbDMO
					.getCrbDiff());
			//
			// IF g_status_class != 0 THEN
			// CALL Error_Append ("", l_function)
			// LET l_retval = -7
			// EXIT WHILE
			// END IF
			// END IF
		}
		//
		if (crbDMO.getCrbBlDiff().shortValue() != returnCrbDMO.getCrbBlDiff().shortValue()) {
			// IF l_crb.crb_bl_diff != p_crb.crb_bl_diff THEN
			//
			// UPDATE crb_cust_risk_bal set crb_bl_diff = p_crb.crb_bl_diff
			// WHERE crb_bill_ac_no = p_bill_ac_no
			filter.add(FilterOp.SET, CrbCustRiskBalDMO.crbDiffFilter, crbDMO
					.getCrbDiff());
			// IF g_status_class != 0 THEN
			// CALL Error_Append ("", l_function)
			// LET l_retval = -7
			// EXIT WHILE
			// END IF
			//
			// END IF
		}

		filter.add(FilterOp.EQUAL, CrbCustRiskBalDMO.crbBillAcNoFilter,
				billAcNo);
		base.crbCustRiskBal().get(filter);
		//
		// # Only one lap around this loop...
		//
		// EXIT WHILE
		//
		// END WHILE
		//
		// RETURN l_retval
		//
		// END FUNCTION

	}

	/**
	 * Replace 4gl function d_calc_credlim_diffs(l_crb)
	 * 
	 * @param crbCustRiskBalDMO
	 * @return
	 * @throws EPPIXSeriousException
	 */
	public CrbCustRiskBalDMO calculateCreditlimitDiffs(
			CrbCustRiskBalDMO crbCustRiskBalDMO) throws EPPIXSeriousException {

		if (logger.isDebugEnabled()) {
			logger
					.debug("calculateCreditlimitDiffs(CrbCustRiskBalDMO crbCustRiskBalDMO)");
		}

		thrower.ifParameterMissing("crbCustRiskBalDMO", crbCustRiskBalDMO);
		CrbCustRiskBalDMO crbDMO = crbCustRiskBalDMO;

		// FUNCTION d_calc_credlim_diffs(l_crb)
		//
		// DEFINE
		// -- Parameter variable(s)
		// l_crb RECORD LIKE crb_cust_risk_bal.*,
		//
		// -- Function variable(s)
		// l_error_text CHAR (200),
		// l_function CHAR (50),
		// l_sql CHAR (500),
		// l_cr_value DECIMAL (16,2),
		// li_cr_perc DECIMAL (16,2),
		BigDecimal crPerc = new BigDecimal((double) 0.00);
		// ld_cr_value DECIMAL (16,2),
		BigDecimal crValue = new BigDecimal((double) 0.00);
		// ld_bl_value DECIMAL (16,2)
		BigDecimal blValue = new BigDecimal((double) 0.00);
		//
				
		if(crbDMO.getCrbAccBal() == null){
			crbDMO.setCrbCreditLimit(new BigDecimal((double)0.00));
		}
		
		if(crbDMO.getCrbUnbillCharges() == null){
			crbDMO.setCrbUnbillCharges(new BigDecimal((double)0.00));
		}
		
		if(crbDMO.getCrbUnbillCalls() == null){
			crbDMO.setCrbUnbillCalls(new BigDecimal((double)0.00));
		}
		
		if(crbDMO.getCrbCreditLimit() == null){
			crbDMO.setCrbCreditLimit(new BigDecimal((double)0.00));
		}
		// WHENEVER ANY ERROR CALL error_classify
		//
		// LET l_function = ": d_calc_credlim_diffs ()"
		//
		// -- initialize variables
		// LET l_cr_value = 0
		//
		// -- This while is set up so easy exit can be achieved when an error is
		// -- detected i.e. g_status_class != 0, and is NOT a recurring loop
		//
		// WHILE g_status_class = 0
		//
		if (crbDMO.getCrbCreditLimit().shortValue() == ((short) 0)) {
			// IF l_crb.crb_credit_limit = 0 THEN
			// LET li_cr_perc = 0
			crPerc = new BigDecimal((double) 0.00);
			// ELSE
		} else {
			// LET ld_cr_value = (l_crb.crb_acc_bal + l_crb.crb_unbill_charges +
			// l_crb.crb_unbill_calls)
			// / l_crb.crb_credit_limit * 100
			crValue = new BigDecimal((double) 0.00);
			crValue = crValue.add(crbDMO.getCrbAccBal());
			crValue = crValue.add(crbDMO.getCrbUnbillCharges());
			crValue = crValue.add(crbDMO.getCrbUnbillCalls());
		
//			System.out.println("BEFORE DIVIDE CR VALUE: " + crValue);
//			System.out.println("BEFORE DIVIDE CREDIT LIMIT: " + crbDMO.getCrbCreditLimit());

//			crValue = (crValue.divide(crbDMO.getCrbCreditLimit(), RoundingMode.HALF_UP)).multiply(new BigDecimal((short)100));
			crValue = (crValue.divide(crbDMO.getCrbCreditLimit(), BigDecimal.ROUND_HALF_UP)).multiply(new BigDecimal((double)100.0));
			crPerc = crValue;
			// LET li_cr_perc = ld_cr_value
//			System.out.println("AFTER DIVIDE CR VALUE: " + crValue);
			// END IF
		}
		//
		if (crbDMO.getCrbBlType() == null || crbDMO.getCrbBlType().equals("0")) {
			// IF l_crb.crb_bl_type = "0" THEN
			// LET ld_bl_value = l_crb.crb_unbill_calls
			blValue = crbDMO.getCrbUnbillCalls();

			// ELSE
		} else {
			// LET ld_bl_value = l_crb.crb_unbill_calls + l_crb.crb_unbill_calls
			// + l_crb.crb_acc_bal
			blValue = blValue.add(crbDMO.getCrbUnbillCalls());
			blValue = blValue.add(crbDMO.getCrbUnbillCalls());
			blValue = blValue.add(crbDMO.getCrbAccBal());
			// END IF
		}
		
//		System.out.println("CR PERCENT: " + crPerc);
		
		if(crbDMO.getCrbPrevThreshold() == null){
			crbDMO.setCrbPrevThreshold(new Short((short)0));
		}
		
		if(crbDMO.getCrbMinThreshold() == null){
			crbDMO.setCrbMinThreshold(new Short((short)0));
		}
		
		if (crbDMO.getCrbBlPrevThresh() == null){
			crbDMO.setCrbBlPrevThresh(new BigDecimal((double)0.00));
		}
		
		if(crbDMO.getCrbBlNextThresh() == null){
			crbDMO.setCrbBlNextThresh(new BigDecimal((double)0.00));
		}
		
		if (crbDMO.getCrbCollPlan() != null
				&& crbDMO.getCrbCollPlan().length() > 0) {
			// IF LENGTH(l_crb.crb_coll_plan CLIPPED) > 0
			// AND l_crb.crb_coll_plan IS NOT NULL THEN
			if ((crPerc.shortValue() < crbDMO.getCrbPrevThreshold().shortValue())
					|| (crPerc.shortValue() < crbDMO.getCrbMinThreshold().shortValue())) {
				// IF li_cr_perc < l_crb.crb_prev_threshold
				// OR li_cr_perc < l_crb.crb_min_threshold THEN
				// LET l_crb.crb_diff = -1
				crbDMO.setCrbDiff(new Short((short) -1));
				// ELSE
			} else {
				if ((crPerc.shortValue() >=  crbDMO.getCrbNextThreshold().shortValue())
						&& (crbDMO.getCrbMinThreshold().shortValue() > (short) 0)){
					// IF li_cr_perc >= l_crb.crb_next_threshold
					// AND l_crb.crb_next_threshold > 0 THEN
					// LET l_crb.crb_diff = 1
					crbDMO.setCrbDiff(new Short((short) 1));
					// ELSE
				} else {
					if (crbDMO.getCrbNextThreshold().shortValue() > ((short) 0)) {
						// IF l_crb.crb_next_threshold > 0 THEN
						// LET l_crb.crb_diff = 0
						crbDMO.setCrbDiff(new Short((short) 0));
						// END IF
					}
					// END IF
				}
				//					
				// END IF
			}
			// ELSE
		} else {
			
//			System.out.println("1: " + crbDMO.getCrbPrevThreshold() + " 2: " + crbDMO.getCrbMinThreshold());

				if ((crPerc.shortValue() >= crbDMO.getCrbPrevThreshold().shortValue())
						&& (crPerc.shortValue() >= crbDMO.getCrbMinThreshold().shortValue())) {
					// IF li_cr_perc >= l_crb.crb_prev_threshold
					// AND li_cr_perc >= l_crb.crb_min_threshold THEN
					// LET l_crb.crb_diff = 1
					crbDMO.setCrbDiff(new Short((short) 1));
					// END IF
				}
			// END IF
		}

		if (crbDMO.getCrbDiff() == null) {
			// IF l_crb.crb_diff IS NULL THEN
			// LET l_crb.crb_diff = 0
			crbDMO.setCrbDiff(new Short((short) 0));
			// END IF
		}

		if (crbDMO.getCrbBlStatus().equals("T")) {
			// IF l_crb.crb_bl_status = "T" THEN
			if (blValue.shortValue() < (crbDMO.getCrbBlPrevThresh().shortValue())					
					|| (crbDMO.getCrbBlPrevThresh().shortValue() == (short)0)					
							&& (crbDMO.getCrbBlNextThresh().shortValue() ==(short) 0)) {
				// IF ld_bl_value < l_crb.crb_bl_prev_thresh
				// OR (l_crb.crb_bl_prev_thresh = 0
				// AND l_crb.crb_bl_next_thresh = 0) THEN
				// LET l_crb.crb_bl_diff = -1
				crbDMO.setCrbBlDiff(new Short((short) -1));
				// END IF
			}
			// ELSE
		} else {
			if ((blValue.shortValue() >= crbDMO.getCrbBlPrevThresh().shortValue()) 
					&& (crbDMO.getCrbBlNextThresh().shortValue() != (short)0)) {
				// IF ld_bl_value >= l_crb.crb_bl_next_thresh
				// AND l_crb.crb_bl_next_thresh != 0 THEN
				// LET l_crb.crb_bl_diff = 1
				crbDMO.setCrbBlDiff(new Short((short) 1));
				// ELSE
			} else {
				// LET l_crb.crb_bl_diff = 0
				crbDMO.setCrbBlDiff(new Short((short) 0));
				// END IF
			}
			// END IF
		}

		if (crbDMO.getCrbBlDiff() == null) {
			// IF l_crb.crb_bl_diff IS NULL THEN
			// LET l_crb.crb_bl_diff = 0
			crbDMO.setCrbBlDiff(new Short((short) 0));
			// END IF
		}
		//			
		// END IF
		//
		// # Only one lap around this loop...
		//
		// EXIT WHILE
		//
		// END WHILE
		//
		// RETURN l_crb.*
		return crbDMO;
		// END FUNCTION
	}

	/**
	 * Replace 4gl function d_upd_billlim_diff (p_subscriber_id)
	 * 
	 * 
	 * @param subscriberId
	 * @throws EPPIXFatalException
	 * @throws EPPIXSeriousException
	 */
	public void updateBillLimDiff(Integer subscriberId)
			throws EPPIXFatalException, EPPIXSeriousException {
		// FUNCTION d_upd_billlim_diff (p_subscriber_id)
		//
		// DEFINE
		// -- Parameter variable(s)
		// p_subscriber_id LIKE blh_bill_limit_hd.blh_subscriber_id,
		//
		// -- Function variable(s)
		// l_blh RECORD LIKE blh_bill_limit_hd.*,
		// p_blh RECORD LIKE blh_bill_limit_hd.*,
		// l_error_text CHAR (200),
		// l_function CHAR (50),
		// l_sql CHAR (500),
		//
		// l_retval INTEGER

		// Integer returnValue = new Integer(0);

		//
		// WHENEVER ANY ERROR CALL error_classify
		//
		// LET l_function = ": d_upd_billlim_diff ()"
		//
		// -- initialize variables
		// INITIALIZE l_blh.*,p_blh.* TO NULL
		// LET l_retval = 0
		//
		// -- This while is set up so easy exit can be achieved when an error is
		// -- detected i.e. g_status_class != 0, and is NOT a recurring loop
		//
		// WHILE g_status_class = 0
		//
		// CALL d_blh_get(p_subscriber_id) RETURNING l_blh.*
		// IF g_status_class != 0 THEN
		// CALL Error_Append("", l_function)
		// LET l_retval = -3
		// EXIT WHILE
		// END IF

		QueryFilter filter = new QueryFilter();
		filter.add(FilterOp.EQUAL, BlhBillLimitHdDMO.blhSubscriberIdFilter,
				subscriberId);
		BlhBillLimitHdDMO blhDMO = null;

		try {
			blhDMO = base.blhBillLimitHd().get(filter);
		} catch (EPPIXBusinessException e) {
			logger.warn("Could not retrieve the subscriber bill limit detail from blh_bill_limit_hd: Subscriber: "
									+ subscriberId, e);
		} catch (EPPIXUnexpectedException e) {
			logger.warn("Could not retrieve the subscriber bill limit detail from blh_bill_limit_hd: Subscriber: "
									+ subscriberId, e);
		} catch (EPPIXFatalException e) {
			logger.warn("Could not retrieve the subscriber bill limit detail from blh_bill_limit_hd: Subscriber: "
									+ subscriberId, e);
		}

		if (blhDMO != null) {
			// IF g_status_class = 0
			if (blhDMO.getBlhLevel().equals("1")
					&& (blhDMO.getBlhUserStatus() != null && blhDMO.getBlhUserStatus().equals("T"))) {
				// AND l_blh.blh_level = "1"
				// AND l_blh.blh_user_status = "T" THEN
				// CALL d_calc_billlim_diffs(l_blh.*) RETURNING p_blh.*

				BlhBillLimitHdDMO returnBlhDMO = null;
				returnBlhDMO = this.calculateBillLimDiff(blhDMO);

				// IF g_status_class != 0 THEN
				// CALL Error_Append("", l_function)
				// LET l_retval = -3
				// EXIT WHILE
				// END IF
				//
				if (returnBlhDMO.getBlhDiff() != blhDMO.getBlhDiff()) {
					// IF l_blh.blh_diff != p_blh.blh_diff THEN
					// UPDATE blh_bill_limit_hd set blh_diff = p_blh.blh_diff
					// WHERE blh_subscriber_id = p_subscriber_id
					// AND blh_service_code = "BLMT"

					try {
						base.blhBillLimitHd().modify(returnBlhDMO);
					} catch (EPPIXBusinessException e) {
						thrower
								.fatal(
										"Could not update the subscriber bill limit details: blh_bill_limit_hd: Subscriber: "
												+ subscriberId, e);
					} catch (EPPIXUnexpectedException e) {
						thrower
								.fatal(
										"Could not update the subscriber bill limit details: blh_bill_limit_hd: Subscriber: "
												+ subscriberId, e);
					} catch (EPPIXFatalException e) {
						thrower
								.fatal(
										"Could not update the subscriber bill limit details: blh_bill_limit_hd: Subscriber: "
												+ subscriberId, e);
					}
					//
					// IF g_status_class != 0 THEN
					// CALL Error_Append ("", l_function)
					// LET l_retval = -4
					// EXIT WHILE
					// END IF
					// END IF
				}
			} else {

				logger
						.warn("Could not retrieve the subscriber bill limit detail from blh_bill_limit_hd: Subscriber: "
								+ subscriberId);
				// ELSE
				// IF g_status_class != 0 THEN
				// LET l_error_text =
				// "Sub ID: ",p_subscriber_id," SQLCODE: ",g_status_class
				// LET l_retval = -3
				// ELSE
				// LET l_error_text = "Level:"
				// IF l_blh.blh_level = "1" THEN
				// LET l_error_text = l_error_text CLIPPED, " Subscriber"
				// ELSE
				// LET l_error_text = l_error_text CLIPPED, " Customer"
				// END IF
				// LET l_error_text = l_error_text CLIPPED, " Active:"
				// IF l_blh.blh_user_status = "T" THEN
				// LET l_error_text = l_error_text CLIPPED, " Yes"
				// ELSE
				// LET l_error_text = l_error_text CLIPPED, " No"
				// END IF
				// CALL Error_Append (l_error_text, l_function)
				// END IF
				// END IF
			}
		}

		//
		// # Only one lap around this loop...
		//
		// EXIT WHILE
		//
		// END WHILE
		//
		// RETURN l_retval
		//
		// END FUNCTION
	}

	/**
	 * Replace 4gl function d_calc_billlim_diffs(p_blh)
	 * 
	 * @throws EPPIXSeriousException
	 */
	public BlhBillLimitHdDMO calculateBillLimDiff(BlhBillLimitHdDMO blhDMO)
			throws EPPIXSeriousException {

		thrower.ifParameterMissing("BlhBillLimitHdDMO", blhDMO);

		BlhBillLimitHdDMO dmo = blhDMO;
		
		if (dmo.getBlhPrevThreshold() == null){
			dmo.setBlhPrevThreshold(new BigDecimal((double)0.00));
		}
		
		if(dmo.getBlhNextThreshold() == null){
			dmo.setBlhNextThreshold(new BigDecimal((double)0.00));
		}
				

		// FUNCTION d_calc_billlim_diffs(p_blh)
		//
		// DEFINE
		// -- Parameter variable(s)
		// p_blh RECORD LIKE blh_bill_limit_hd.*,
		//
		// -- Function variable(s)
		// l_error_text CHAR (200),
		// l_function CHAR (50),
		// l_sql CHAR (500),
		// ld_bl_value FLOAT
		//
		// WHENEVER ANY ERROR CALL error_classify
		//
		// LET l_function = ": d_calc_billlim_diffs ()"
		//
		// -- initialize variables
		// LET ld_bl_value = 0
		BigDecimal blhValue = null;
		//
		// -- This while is set up so easy exit can be achieved when an error is
		// -- detected i.e. g_status_class != 0, and is NOT a recurring loop
		//
		// WHILE g_status_class = 0
		//
		// IF p_blh.blh_type = 0
		if (dmo.getBlhType() != null || dmo.getBlhType().equals("0")) {

			// OR LENGTH(p_blh.blh_type CLIPPED) > 0 THEN
			// LET ld_bl_value = p_blh.blh_unbill_usage
			blhValue = dmo.getBlhUnbillUsage();
		} else {
			// ELSE
			// LET ld_bl_value = p_blh.blh_unbill_usage +
			// p_blh.blh_unbill_charges
			blhValue = dmo.getBlhUnbillUsage().add(dmo.getBlhUnbillCharges());
			// END IF
		}
		//
		if ((blhValue.shortValue() < (dmo.getBlhPrevThreshold().shortValue()))
				|| (dmo.getBlhPrevThreshold().shortValue() == ((short)0))
				&& (dmo.getBlhNextThreshold().shortValue() == ((short)0))) {

			// IF ld_bl_value < p_blh.blh_prev_threshold
			// OR (p_blh.blh_prev_threshold = 0
			// AND p_blh.blh_next_threshold = 0) THEN
			// LET p_blh.blh_diff = -1
			dmo.setBlhDiff(new Integer(-1));
		} else {
			// ELSE
			if ((blhValue.shortValue() >= (dmo.getBlhPrevThreshold().shortValue()))
					&& (dmo.getBlhNextThreshold().shortValue() != ((short)0))) {
				// IF ld_bl_value >= p_blh.blh_next_threshold
				// AND p_blh.blh_next_threshold != 0 THEN
				// LET p_blh.blh_diff = 1
				dmo.setBlhDiff(new Integer(1));
			} else {
				// ELSE
				// LET p_blh.blh_diff = 0
				dmo.setBlhDiff(new Integer(0));
				// END IF
			}
			// END IF
		}
		//

		if (dmo.getBlhDiff() == null) {
			dmo.setBlhDiff(new Integer(0));
		}
		// IF p_blh.blh_diff IS NULL THEN
		// LET p_blh.blh_diff = 0
		// END IF
		//
		// # Only one lap around this loop...
		//
		// EXIT WHILE
		//
		// END WHILE
		//
		// RETURN p_blh.*

		return dmo;
		//
		// END FUNCTION
	}

	/**
	 * Replace 4gl function d_blh_charge_upd(p_subscriber,p_charge)
	 * 
	 * @param subscriberId
	 * @param charge
	 * @throws EPPIXBusinessException
	 * @throws EPPIXUnexpectedException
	 * @throws EPPIXFatalException
	 */
	public void blhChargeUpdate(Integer subscriberId, BigDecimal charge)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		// FUNCTION d_blh_charge_upd(p_subscriber,p_charge)

		if (logger.isDebugEnabled()) {
			logger
					.debug("blhChargeUpdate(Integer subscriberId, BigDecimal charge)");
		}

		thrower.ifParameterMissing("subscriberId", subscriberId);
		thrower.ifParameterMissing("charge", charge);
		//
		// DEFINE
		// -- Parameter variable(s)
		// p_charge FLOAT,
		// p_subscriber INTEGER,
		//
		// -- Function variable(s)
		// l_error_text CHAR(200),
		// l_function CHAR(50),
		//
		// l_retval INTEGER
		//

		// WHENEVER ANY ERROR CALL error_classify
		//
		// LET l_function = "d_blh_charge_upd"
		//
		// #Error trapping while
		// WHILE g_status_class = 0
		//
		// UPDATE blh_bill_limit_hd
		// SET blh_unbill_charges = blh_unbill_charges + p_charge
		// WHERE blh_subscriber_id = p_subscriber

		BlhBillLimitHdDMO blhDMO = null;
		QueryFilter filter = new QueryFilter();
		filter.add(FilterOp.EQUAL, BlhBillLimitHdDMO.blhSubscriberIdFilter, this.getSubscriberId());
		
//		blhDMO.setBlhSubscriberId(subscriberId);
		
//		System.out.println("SERVICE CODE: " + this.getServCode());
		
//		blhDMO.setBlhServiceCode(this.getServCode());

		blhDMO = base.blhBillLimitHd().get(filter);

		if (blhDMO == null) {
			thrower.fatal("Could not retrieve the BLH Subscriber: "
					+ subscriberId);
		} else {
			charge.add(blhDMO.getBlhUnbillCharges());
			blhDMO.setBlhUnbillCharges(charge);
			blhDMO = base.blhBillLimitHd().modify(blhDMO);
		}

		//
		// CASE
		// WHEN (g_status_class != 0)
		// CALL Error_Append("",l_function)
		// EXIT WHILE
		//
		// WHEN SQLCA.SQLERRD[3] = 0
		// LET l_error_text = "Unable to update charge details on the ",
		// "blh_bill_limit_hd table for Subscriber ", p_subscriber
		// CALL Error_SeriousError(l_error_text,l_function)
		// EXIT WHILE
		// END CASE
		//
		// # LET l_retval = nupdatelimitdiffs_fgl ("S", "", p_subscriber)
		// CALL d_upd_limit_diff("S", "", p_subscriber) RETURNING l_retval
		this.updateLimitDiff("S", "", subscriberId);

		// CASE l_retval
		// WHEN -1
		// LET l_error_text = "Insufficient arguments passed to c function"
		// CALL Error_SeriousError(l_error_text,l_function)
		// EXIT WHILE
		//
		// WHEN -2
		// LET l_error_text = "Invalid Type passed.  Only 'C' and 'S' accepted"
		// CALL Error_SeriousError(l_error_text,l_function)
		// EXIT WHILE
		//
		// WHEN -3
		// LET l_error_text = "Subscriber not found in the BLH table"
		// CALL Error_SeriousError(l_error_text,l_function)
		// EXIT WHILE
		//
		// WHEN -4
		// LET l_error_text = "Failed to update the BLH table"
		// CALL Error_SeriousError(l_error_text,l_function)
		// EXIT WHILE
		//
		// WHEN -5
		// LET l_error_text = "Failed to update the CRB table"
		// CALL Error_SeriousError(l_error_text,l_function)
		// EXIT WHILE
		// END CASE
		//
		// EXIT WHILE
		//
		// END WHILE
		//
		// END FUNCTION
	}

	private char[] replaceString(char[] val, String newString, int start) {

		for (int i = 0; i < val.length; i++) {
			if (i >= start) {
				if ((i - start) <= newString.length() - 1) {
					val[i] = newString.charAt(i - start);
				} else {
					break;
				}
			}
		}
		return val;
	}
}
