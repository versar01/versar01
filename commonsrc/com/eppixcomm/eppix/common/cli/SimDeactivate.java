package com.eppixcomm.eppix.common.cli;

//################################################################################
//# Copyright 1998 Computer Answers International Limited                        #
//#                                                                              #
//# Module Name : Sim_Deactivate.4gl                Created : 22/05/1998         #
//#                                                                              #
//# Description : Deactivate a SIM module           Version : 1.24               #
//#                                                                              #
//# Revision History:                                                            #
//#                                                                              #
//# == DATE == ========================== DETAILS ========================== =BY #
//# 22/05/1998 Removed from sm_deact.4gl and modified to version 1.09 of     ROY #
//#            Informix spec                                                     #
//# 27/05/1998 Modified to pass additional parameters to function            ARC #
//#            Charge_InsAdditional().                                           #
//# 02/06/1998 Add return parameter from Charge_InsAdditional()              ARC #
//# 13/11/1998 Changed the call to Sim_UpdDeactPerm & Subscriber_UpdPrimary  ROY #
//# 08/01/1999 Create temp table & move N2N creation before eppix updates     TM #
//# 14/01/1999 Also need to move SD insert to before N2N call                 TM #
//# 02/02/1999 Defined p_reason like rc_code instead of dcode has dcode has  ROY #
//#            been increased in size                                            #
//# 04/03/1999 Modified for dual call as pre v 1.13 of the spec.             DWL #
//#            PVCS 3.1 SCR 712                                                  #
//# 12/05/1999 Add call to letter production function (Merged from 3.0)       TM #
//# 13/05/1999 Corrected call to DocumentOriginal_Create                     DCM #
//# 29/06/1999 Call N2N fuctionality even on BATCH_RUN                        TM #
//# 29/07/1999 Prorata deactivate services on Temp deactivation if ASTEMPDBIL AJL#
//#            is set to g_no V1.18 SCR 48                                       #
//# 17/09/1999 Modified p_option parameter  options                            JK#
//# 17/09/1999 Added additional validations  for future activations   inline   JK#
//#            and a new function service_future_act_exist                     JK#
//# 01/10/1999 Changed the error handling after the call to                   JAG#
//#            service_future_act_exists()                                       #
//# 08/12/1999 Corrected call to DocumentOriginal_Create                      TL #
//# 17/04/2000 Modified call to DocumentOriginal_Create V 3.10  Scr 596       JM #
//# 17/04/2001 Allow TDC of SIM with Future Serv Activate if Deposit Related  JM #
//# 02/05/2002 Added update to sbu_sub_upgrade table                          MW #
//# 15/05/2002 Modified to update only the latest sbu record                  MW #
//# 06/02/2003 Do cycle migration if a partnership benefit subscriber         GLD#
//# 20/06/2003 Don't allow backdating of prorata date.                        MW #
//# 28/06/2004 Remove all Virtual Recharges if any                            KB #
//# 28/06/2004 Remove all Virtual Recharges if any                            KB #
//# 27/09/2004 Subscriber Details not populated for Temp Deact                SB #
//# 07/10/2005 Adding additional testing for Virtual recharge                 MAT#
//# 29/03/2006 change reason_type to 'N2N_DEACT_PERM' if reason code is MNPD  PMM# 
//#			 Cancel future deactivation if reason code is MNPD 			    PMM#
//# 13/03/2008 Added parameter to Sim_Get account no - Reseller  INC3621      EK #
//# 08/05/2009 Changed RETURNING value for CALL d_pc_config_partner_get       IR #
//################################################################################

//DATABASE eppix
//
//	GLOBALS "globals.4gl"
//
//	#------------------------------------------------------------------------------#
//	# Purpose : To validate and deactivate the given SIM and the related services  #
//	# Accepts : p_option          - Valid option, "PERMANENT" or "TEMPORARY" or    #
//	#                 :                   - "BATCH_PRM" or "BATCH_TMP"             #
//	#         : p_sim_no          - SIM on which deactivation is to be carried out #
//	#         : p_deact_charge01  - First charge connected with the deactivation   #
//	#         : p_deact_charge02  - Second charge connected with the deactivation  #
//	#         : p_deact_charge03  - Third charge connected with the deactivation   #
//	#         : p_deact_charge04  - Fourth charge connected with the deactivation  #
//	#         : p_deact_charge05  - Fifth charge connected with the deactivation   #
//	#         : p_reason_code     - Reason why the SIM is being deactivated        #
//	#         : p_letter_code     - Type of letter to be sent to the subscriber    #
//	#         : p_deact_date      - Date from which deactivation is to take effect #
//	#         : p_prorata_to_date - The date you want to prorata the services to   #
//	#------------------------------------------------------------------------------#

import com.eppixcomm.eppix.common.util.DateTime;

public class SimDeactivate {
	private String Option;
	private String SimNo;
	private String DeactCharge01;
	private String DeactCharge02;
	private String DeactCharge03;
	private String DeactCharge04;
	private String DeactCharge05;
	private String ReasonCode;
	private String LetterCode;
	private DateTime DeactDate;
	private DateTime ProrataToDate;
	
	public SimDeactivate(){
		
	}

	public SimDeactivate(String Option, String SimNo, String DeactCharge01, String DeactCharge02,
			String DeactCharge03, String DeactCharge04, String DeactCharge05, String ReasonCode,
			String LetterCode, DateTime DeactDate, DateTime ProrataToDate){
		this.Option = Option;
		this.SimNo = SimNo;
		this.DeactCharge01 = DeactCharge01; 
		this.DeactCharge02 = DeactCharge02;
		this.DeactCharge03 = DeactCharge03;
		this.DeactCharge04 = DeactCharge04;
		this.DeactCharge05 = DeactCharge05;
		this.ReasonCode = ReasonCode;
		this.LetterCode = LetterCode; 
		this.DeactDate = DeactDate;
		this.ProrataToDate = ProrataToDate;
	}

	
	public void set (String Option, String SimNo, String DeactCharge01, String DeactCharge02,
			String DeactCharge03, String DeactCharge04, String DeactCharge05, String ReasonCode,
			String LetterCode, DateTime DeactDate, DateTime ProrataToDate){
		this.Option = Option;
		this.SimNo = SimNo;
		this.DeactCharge01 = DeactCharge01; 
		this.DeactCharge02 = DeactCharge02;
		this.DeactCharge03 = DeactCharge03;
		this.DeactCharge04 = DeactCharge04;
		this.DeactCharge05 = DeactCharge05;
		this.ReasonCode = ReasonCode;
		this.LetterCode = LetterCode; 
		this.DeactDate = DeactDate;
		this.ProrataToDate = ProrataToDate;
	}

//	FUNCTION Sim_Deactivate(p_option, p_sim_no, p_deact_charge01, p_deact_charge02,
//		p_deact_charge03, p_deact_charge04, p_deact_charge05, p_reason_code,
//		p_letter_code, p_deact_date, p_prorata_to_date)
//
//		DEFINE
//			-- Parameter variable(s)
//			p_deact_charge01			LIKE chg_charges.chg_code, == String
//			p_deact_charge02			LIKE chg_charges.chg_code,
//			p_deact_charge03			LIKE chg_charges.chg_code,
//			p_deact_charge04			LIKE chg_charges.chg_code,
//			p_deact_charge05			LIKE chg_charges.chg_code,
//			p_letter_code				LIKE lt_letter_types.lt_letter_type,  == String
//			p_reason_code				LIKE rc_reason_code.rc_code, == String
//			p_sim_no					LIKE smn_sim_nos.smn_sim_no, == String
//			p_option					CHAR(9),
//			p_deact_date				DATE,
//			p_prorata_to_date			DATE,
//
//			-- Function variable(s)
//			l_chg						ARRAY [5] OF RECORD LIKE chg_charges.*,
//			l_opservm					ARRAY [5] OF RECORD LIKE opservm.*,
//
//			l_sbd						RECORD LIKE sbd_sub_dets.*,
//			l_sbu						RECORD LIKE sbu_sub_upgrade.*,
//			l_sd						RECORD LIKE sd_sim_deactivate.*,
//			l_sfe						RECORD LIKE sfe_sim_fut_event.*,
//			l_sks						RECORD LIKE sks_key_setting.*,
//			l_smn						RECORD LIKE smn_sim_nos.*,
//			l_pc_partner_config         RECORD LIKE pc_partner_config.*,
//
//			l_allow_futsrvtdc			LIKE sks_key_setting.sks_value,
//			l_bill_id					LIKE bill_cccccyyyymmdd.bill_id,
//			l_connect_date				LIKE vam_active_msisdn.vam_connect_date,
//			l_document_id				LIKE doa_doc_action.doa_document_id,
//			l_hist_code					LIKE msh_msisdn_history.msh_hist_code,
//			l_intern_tariff				LIKE vam_active_msisdn.vam_intern_tariff,
//			l_letter_desc				LIKE lt_letter_types.lt_letter_desc,
//			l_message					LIKE as_message.mmess,
//			l_msisdn_no					LIKE vam_active_msisdn.vam_msisdn_no,
//			l_new_cycle					LIKE sbd_sub_dets.sbd_bill_cycle,
//			l_partner_id				LIKE pc_partner_config.pc_partner_id,
//			l_rc_code					LIKE rc_reason_code.rc_code,
//			l_rc_desc					LIKE rc_reason_code.rc_desc,
//			l_rc_type					LIKE rc_reason_code.rc_type,
//			l_reason					LIKE sysdirm.key_value,
//			l_subs_suffix				LIKE vam_active_msisdn.vam_subs_suffix,
//			l_subscriber_id				LIKE vam_active_msisdn.vam_subscriber_id,
//			l_twinbill_no				LIKE vam_active_msisdn.vam_twinbill_no,
//			l_type_code					LIKE sysdirm.key_value,
//
//			l_char_months				CHAR (20),
//			l_error_text				CHAR(500),
//			l_function					CHAR(50),
//			l_net_prefix				CHAR(5),
//			l_null_char					CHAR(1),
//			l_reason_type				CHAR(15),
//
//			l_charge_date				DATE,
//
//			l_int_months				INTEGER,
//			l_null_int					INTEGER,
//			l_months					INTERVAL MONTH(4) TO MONTH,
//
//			l_exists					SMALLINT,
//			l_found						SMALLINT,
//			l_future_deact				SMALLINT,
//			l_i							SMALLINT,
//			l_pending_event				SMALLINT,
//			l_pd_pend					SMALLINT,
//			l_pd						RECORD LIKE pd_port_detail.*,
//			l_sac_bill_ac_no            LIKE sac_sim_assign_cus.sac_bill_ac_no #INC3621
//
//		WHENEVER ANY ERROR CALL error_classify
//
//		CALL BeginTransaction ("Sim_Deactivate")
//	    call startlog("/usr/eppix310/errors/sim_deactiavte.log")
//		FOR l_i = 1 TO 5
//			INITIALIZE l_chg[l_i].* TO NULL
//			INITIALIZE l_opservm[l_i].* TO NULL
//		END FOR
//
//		INITIALIZE l_smn.* TO NULL
//		INITIALIZE l_sfe.* TO NULL
//		INITIALIZE l_sd.* TO NULL
//
//		LET l_hist_code        = g_null
//		LET l_subscriber_id    = g_null
//		LET l_msisdn_no        = g_null
//		LET l_connect_date     = g_null
//		LET l_intern_tariff    = g_null
//		LET l_subs_suffix      = g_null
//		LET l_twinbill_no      = g_null
//
//		INITIALIZE l_null_int,l_new_cycle,l_partner_id, l_exists TO NULL
//		LET l_null_char         = ""
//
//		## Initially assume that its not a future deactivation
//		LET l_future_deact = FALSE
//		LET l_pending_event = FALSE
//
//		LET l_function = ": Sim_Deactivate()"
//
//		CASE
//			WHEN LENGTH(p_option) = 0
//
//				-- Blank option
//				CALL Error_SeriousError(
//					" Mandatory parameter p_option is NULL ", l_function)
//
//			WHEN LENGTH(p_sim_no) = 0
//
//				-- Blank SIM number
//				CALL Error_SeriousError(
//					" Mandatory parameter p_sim_no is NULL ", l_function)
//
//			WHEN LENGTH(p_reason_code) = 0
//
//				-- Blank reason code
//				CALL Error_SeriousError(
//					" Mandatory parameter p_reason_code is NULL ", l_function)
//
//			WHEN p_option != "PERMANENT"
//				AND  p_option != "TEMPORARY"
//				AND  p_option != "BATCH_PRM"
//				AND  p_option != "BATCH_TMP"
//
//				-- Invalid option
//				LET l_error_text = " Function invoked with invalid option ",p_option
//				CALL Error_SeriousError(l_error_text, l_function)
//		END CASE
//
//		-- This while is set up so easy exit can be achieved when an error is
//		-- detected i.e. g_status_class != 0, and is NOT a recurring loop
//
//		-- All mandatory parameters present
//		WHILE g_status_class = 0
//
//			-- Validate the SIM number
//			#INC3621 - Added another paramater to cater for customer account number - reseller specs
//			CALL Sim_Get("CURRENT", p_sim_no, "", "", "", "") RETURNING l_smn.*, l_sac_bill_ac_no #INC3621
//			IF g_status_class != 0 THEN
//				-- Serious error in Sim_Get
//				IF g_status_class = 100 THEN
//					CALL Error_SeriousError("", l_function)
//				ELSE
//					CALL Error_Append("", l_function)
//				END IF
//
//				EXIT WHILE
//			END IF
//
//			-- Set up the reason type
//			CASE
//				WHEN p_option = "PERMANENT" OR p_option = "BATCH_PRM"
//					LET l_reason_type = "SIM_DEACT_PERM"
//
//				WHEN p_option = "TEMPORARY" OR p_option = "BATCH_TMP"
//					LET l_reason_type = "SIM_DEACT_TEMP"
//			END CASE
//
//			IF p_reason_code = "MNPD" 
//			OR p_reason_code = "MNPX" THEN
//				LET l_reason_type = "N2N_DEACT_PERM"
//			END IF
//
//			-- Validate reason code
//			CALL ReasonCode_Get(p_reason_code, l_reason_type)
//			RETURNING l_rc_code, l_rc_type, l_rc_desc
//
//			IF g_status_class != 0 THEN
//
//				-- Serious error in Reason_Get
//				IF g_status_class = 100 THEN
//					CALL Error_SeriousError("", l_function)
//					EXIT WHILE
//				ELSE
//					CALL Error_Append("", l_function)
//					EXIT WHILE
//				END IF
//			END IF
//
//			IF LENGTH(p_letter_code) != 0 THEN
//				-- Validate letter code
//				CALL Letter_Get(p_letter_code) RETURNING l_letter_desc
//
//				IF g_status_class != 0 THEN
//					-- Serious error in Letter_Get
//					IF g_status_class = 100 THEN
//						CALL Error_SeriousError("", l_function)
//					ELSE
//						CALL Error_Append("", l_function)
//					END IF
//
//					EXIT WHILE
//				END IF
//			END IF
//
//			IF LENGTH(p_deact_charge01) != 0 THEN
//				-- Validate deactivation charge 1
//				CALL chg_get(p_deact_charge01, l_smn.smn_network_id, "", "", "A")
//				RETURNING l_chg[1].*
//
//				IF g_status_class != 0 THEN
//
//					-- Serious error in chg_get
//					IF g_status_class = 100 THEN
//						CALL Error_SeriousError("", l_function)
//					ELSE
//						CALL Error_Append("", l_function)
//					END IF
//
//					EXIT WHILE
//				END IF
//
//				-- Get the cost from opservm
//				CALL opservm_get(l_chg[1].chg_ncode) RETURNING l_opservm[1].*
//
//				IF g_status_class != 0 THEN
//					CALL Error_Append("", l_function)
//					EXIT WHILE
//				END IF
//			END IF
//
//			IF LENGTH(p_deact_charge02) != 0 THEN
//
//				-- Validate deactivation charge 2
//				CALL chg_get(p_deact_charge02, l_smn.smn_network_id, "", "", "A")
//				RETURNING l_chg[2].*
//
//				IF g_status_class != 0 THEN
//
//					-- Serious error in chg_get
//					IF g_status_class = 100 THEN
//						CALL Error_SeriousError("", l_function)
//					ELSE
//						CALL Error_Append("", l_function)
//					END IF
//
//					EXIT WHILE
//				END IF
//
//				-- Get the cost from opservm
//				CALL opservm_get(l_chg[2].chg_ncode) RETURNING l_opservm[2].*
//
//				IF g_status_class != 0 THEN
//					CALL Error_Append("", l_function)
//					EXIT WHILE
//				END IF
//			END IF
//
//			IF LENGTH(p_deact_charge03) != 0 THEN
//
//				-- Validate deactivation charge 3
//				CALL chg_get(p_deact_charge03, l_smn.smn_network_id, "", "", "A")
//				RETURNING l_chg[3].*
//
//				IF g_status_class != 0 THEN
//
//					-- Serious error in chg_get
//					IF g_status_class = 100 THEN
//						CALL Error_SeriousError("", l_function)
//					ELSE
//						CALL Error_Append("", l_function)
//					END IF
//
//					EXIT WHILE
//				END IF
//
//				-- Get the cost from opservm
//				CALL opservm_get(l_chg[3].chg_ncode) RETURNING l_opservm[3].*
//
//				IF g_status_class != 0 THEN
//					CALL Error_Append("", l_function)
//					EXIT WHILE
//				END IF
//			END IF
//
//			IF LENGTH(p_deact_charge04) != 0 THEN
//
//				-- Validate deactivation charge 4
//				CALL chg_get(p_deact_charge04, l_smn.smn_network_id, "", "", "A")
//				RETURNING l_chg[4].*
//
//				IF g_status_class != 0 THEN
//
//					-- Serious error in chg_get
//					IF g_status_class = 100 THEN
//						CALL Error_SeriousError("", l_function)
//					ELSE
//						CALL Error_Append("", l_function)
//					END IF
//
//					EXIT WHILE
//				END IF
//
//				-- Get the cost from opservm
//				CALL opservm_get(l_chg[4].chg_ncode) RETURNING l_opservm[4].*
//
//				IF g_status_class != 0 THEN
//					CALL Error_Append("", l_function)
//					EXIT WHILE
//				END IF
//			END IF
//
//			IF LENGTH(p_deact_charge05) != 0 THEN
//
//				-- Validate deactivation charge 5
//				CALL chg_get(p_deact_charge05, l_smn.smn_network_id, "", "", "A")
//				RETURNING l_chg[5].*
//
//				IF g_status_class != 0 THEN
//
//					-- Serious error in chg_get
//					IF g_status_class = 100 THEN
//						CALL Error_SeriousError("", l_function)
//					ELSE
//						CALL Error_Append("", l_function)
//					END IF
//
//					EXIT WHILE
//				END IF
//
//				-- Get the cost from opservm
//				CALL opservm_get(l_chg[5].chg_ncode) RETURNING l_opservm[5].*
//
//				IF g_status_class != 0 THEN
//					CALL Error_Append("", l_function)
//					EXIT WHILE
//				END IF
//			END IF
//
//			CALL Msisdn_GetForSim (p_sim_no, l_smn.smn_status)
//			RETURNING l_subscriber_id,
//				l_msisdn_no,
//				l_connect_date,
//				l_intern_tariff,
//				l_subs_suffix
//
//			IF g_status_class != 0 THEN
//				CALL Error_Append ("", l_function)
//				EXIT WHILE
//			END IF
//
//			IF l_subscriber_id IS NULL THEN
//				CALL Error_SeriousError(
//					" subscriber id  returned by Msisdn_GetForSim is NULL ", 
//					l_function)
//				EXIT WHILE
//			END IF
//
//			CALL sbd_get(l_subscriber_id) RETURNING l_sbd.*
//
//			IF g_status_class != 0 THEN
//				Call Error_Append("", l_function)
//				EXIT WHILE
//			END IF
//
//			IF LENGTH(l_sbd.sbd_dialling_no) = 0 THEN
//				CALL Error_SeriousError(
//					" sbd_dialling_number is NULL ", l_function)
//				EXIT WHILE
//			END IF
//
//			IF p_option = "PERMANENT" OR p_option = "BATCH_PRM" THEN
//
//				IF p_deact_date IS NULL
//				OR p_deact_date = DATE(0) THEN
//					# Blank deactivation date
//					LET p_deact_date = TODAY
//				END IF
//
//				IF p_deact_date < l_connect_date THEN
//					# Deactivation date before connection date
//					LET l_error_text = " Deact date ", p_deact_date,
//						" is before connection Date"
//					CALL Error_BusinessError(114030, "", l_error_text, l_function)
//					EXIT WHILE
//				END IF
//
//				IF p_prorata_to_date IS NULL
//				OR p_prorata_to_date = DATE(0) THEN
//					-- Continue
//				ELSE
//					IF p_prorata_to_date < TODAY THEN
//
//						LET l_error_text = " Prorata to date ", p_prorata_to_date,
//							" cannot be backdated"
//						CALL Error_BusinessError(114030, "", l_error_text, l_function)
//						EXIT WHILE
//					END IF
//
//				END IF
//
//				IF p_deact_date <= TODAY THEN
//					# Deactivation date before or todays date
//					LET l_future_deact = FALSE
//				ELSE
//					# Decativation date after todays date
//					LET l_future_deact = TRUE
//				END IF
//
//			END IF
//
//			CALL Sim_GetFutureEvent(p_sim_no,"") RETURNING l_sfe.*
//
//			IF g_status_class != 0 THEN
//				IF g_status_class = 100 THEN
//					LET l_pending_event = FALSE
//					CALL error_reset()
//				ELSE
//					CALL Error_Append("", l_function)
//					EXIT WHILE
//				END IF
//			ELSE
//				---------------------------------------------------------------
//				-- validate if it is a MNP deactivation
//				---------------------------------------------------------------
//
//				IF p_option = "PERMANENT" THEN
//					IF p_reason_code = "MNPD"  
//					OR p_reason_code = "MNPX" THEN
//
//						CALL d_pd_get(l_msisdn_no, "R", "P")
//						RETURNING l_pd.*
//
//						IF g_status_class != 0 THEN
//							IF g_status_class != 100 THEN
//								CALL Error_Append("", l_function)
//								EXIT WHILE
//							ELSE
//								CALL error_reset()
//							END IF
//						ELSE
//							CALL error_reset()
//							
//							LET l_pd.pd_status = "S"
//							CALL d_pd_upd(l_pd.*)
//		
//						 	IF g_status_class != 0 THEN
//								CALL Error_Append("", l_function)
//								EXIT WHILE
//							END IF
//		
//						END IF
//		
//						CALL d_pd_get(l_msisdn_no, "P", "P")
//						RETURNING l_pd.*
//		
//						IF g_status_class != 0 THEN
//							IF g_status_class != 100 THEN
//								CALL Error_Append("", l_function)
//								EXIT WHILE
//							ELSE
//								CALL error_reset()
//							END IF
//						ELSE
//							CALL error_reset()
//							
//							LET l_pd.pd_status = "S"
//							CALL d_pd_upd(l_pd.*)
//		
//						 	IF g_status_class != 0 THEN
//								CALL Error_Append("", l_function)
//								EXIT WHILE
//							END IF
//		
//						END IF
//		
//						UPDATE vam_active_msisdn
//					   	SET vam_dconnect_date = NULL,
//						   	vam_subs_suffix = NULL
//					 	WHERE vam_sim_no = p_sim_no;
//		
//						IF g_status_class != 0 THEN
//							CALL Error_Append("", l_function)
//							EXIT WHILE
//						END IF
//		
//						CALL d_sfe_del(p_sim_no, "SIM_DEACT_PERM")
//		
//						CALL error_reset()
//		
//						DELETE FROM sd_sim_deactivate
//						WHERE sd_sim_no = p_sim_no
//						AND sd_trans_status = "A";
//		
//						CALL error_reset()
//		
//						LET l_pending_event = FALSE
//						INITIALIZE l_sfe.*, l_subs_suffix TO NULL
//					
//					END IF
//		
//				END IF
//		
//			END IF			
//
//			CASE WHEN  l_sfe.sfe_fut_event_id = "SIM_ACTIVATE"
//					LET l_pending_event  = FALSE
//					LET l_error_text =
//						" Sim is pending activation - cannot continue "
//					CALL Error_BusinessError(114261, "", l_error_text, l_function)
//					EXIT WHILE
//
//				WHEN l_sfe.sfe_fut_event_id = "SIM_DEACT_TEMP"
//					AND ( p_option = "PERMANENT"
//					OR    p_option = "TEMPORARY" )
//					LET l_pending_event  = TRUE
//					LET l_error_text =
//						" Sim already future temporary deactivated "
//					CALL Error_BusinessError(114298, "", l_error_text, l_function)
//					EXIT WHILE
//
//				WHEN l_sfe.sfe_fut_event_id = "SIM_DEACT_PERM"
//					LET l_pending_event  = TRUE
//					IF p_option = "PERMANENT" THEN
//						LET l_error_text =
//							" Sim already future deactivated "
//						CALL Error_BusinessError(114035, "", l_error_text, l_function)
//						EXIT WHILE
//					END IF
//					IF p_option = "TEMPORARY" AND l_future_deact = TRUE THEN
//						LET l_error_text =
//							" Sim already future deactivated "
//						CALL Error_BusinessError(114035, "", l_error_text, l_function)
//						EXIT WHILE
//					END IF
//				WHEN l_sfe.sfe_fut_event_id = "SIM_REACTIVATE"
//					LET l_pending_event  = FALSE
//					IF p_option = "PERMANENT" THEN
//						LET l_error_text =
//							" Sim already future reactivated "
//						CALL Error_BusinessError(114298, "", l_error_text, l_function)
//						EXIT WHILE
//					END IF
//			END CASE
//
//			IF l_sfe.sfe_fut_event_id != "SIM_ACTIVATE"
//			AND l_sfe.sfe_fut_event_id != "SIM_REACTIVATE" THEN
//				LET l_pending_event = TRUE
//			END IF
//
//			IF UPSHIFT(l_subs_suffix) = "F" THEN
//				CASE
//					WHEN  p_option = "PERMANENT"
//						CALL Sim_GetFutureDeact(p_sim_no) RETURNING l_sd.*
//						IF g_status_class != 0 THEN
//							CALL Error_Append ("", l_function)
//							EXIT WHILE
//						END IF
//						IF l_sd.sd_stat_code = 6 THEN
//							LET l_error_text = "SIM already future deactivated."
//							CALL Error_BusinessError(114035,
//								"", l_error_text, l_function)
//							EXIT WHILE
//						END IF
//						IF l_sd.sd_stat_code = 4 THEN
//							LET l_error_text =
//								"SIM already temporary future deactivated."
//							CALL Error_BusinessError(114035,
//								"", l_error_text, l_function)
//							EXIT WHILE
//						END IF
//						IF l_sd.sd_stat_code = 1 THEN
//							LET l_error_text =
//								"SIM already temporary future reactivated."
//							CALL Error_BusinessError(114035, "",
//								l_error_text, l_function)
//							EXIT WHILE
//						END IF
//					WHEN  p_option = "TEMPORARY"  AND l_future_deact
//						CALL Sim_GetFutureDeact(p_sim_no) RETURNING l_sd.*
//						IF g_status_class != 0 THEN
//							CALL Error_Append ("", l_function)
//							EXIT WHILE
//						END IF
//						IF l_sd.sd_stat_code = 6 THEN
//							LET l_error_text = "SIM already future deactivated."
//							CALL Error_BusinessError(114035,
//								"", l_error_text, l_function)
//							EXIT WHILE
//						END IF
//						IF l_sd.sd_stat_code = 4 THEN
//							LET l_error_text =
//								"SIM already temporary future deactivated."
//							CALL Error_BusinessError(114298,
//								"", l_error_text, l_function)
//							EXIT WHILE
//						END IF
//						IF l_sd.sd_stat_code = 1 THEN
//							LET l_error_text =
//								"SIM already temporary future reactivated."
//							CALL Error_BusinessError(114298,
//								"", l_error_text, l_function)
//							EXIT WHILE
//						END IF
//				END CASE
//			END IF
//
//			CALL service_future_act_exists(p_sim_no)
//			RETURNING l_sfe.sfe_fut_event_id,
//				l_sfe.sfe_service_code,
//				l_sfe.sfe_orig_status
//
//			IF g_status_class != 100 AND g_status_class != 0  THEN
//				CALL Error_Append("", l_function)
//				EXIT WHILE
//			END IF
//
//			# Future Service Activation Found
//			IF g_status_class = 0 THEN
//
//				# Check to see if Future Service TDCs are allowed
//				CALL sks_get("AFUTSRVTDC") RETURNING l_sks.*
//
//				IF g_status_class != 0 THEN
//					LET l_allow_futsrvtdc = "N"
//					CALL Error_Reset()
//				ELSE
//					LET l_allow_futsrvtdc = l_sks.sks_value
//				END IF
//
//				# Allow to continue if System Key Set and TDC
//				# and Future activated 'coz of Deposit
//				IF (l_allow_futsrvtdc[1,1] = "Y" OR
//				l_allow_futsrvtdc[1,1] = "y") AND
//				(p_option = "TEMPORARY" OR
//				p_option = "BATCH_TMP") AND
//				l_sfe.sfe_orig_status = 1 THEN
//					# Do nothing
//				ELSE
//					LET l_error_text = "Service ", l_sfe.sfe_service_code,
//						" is pending activation"
//					CALL Error_BusinessError(110123,l_sfe.sfe_service_code,
//						l_error_text, l_function)
//					EXIT WHILE
//				END IF
//			END IF
//
//			# Future Service Activation NOT Found
//			IF g_status_class = 100  THEN
//				CALL Error_Reset()
//			END IF
//
//			IF l_pending_event = TRUE  AND l_future_deact = TRUE THEN
//				LET l_error_text = "Deactivation date is invalid"
//				CALL Error_BusinessError(114305, "",l_error_text,l_function)
//				EXIT WHILE
//			END IF
//
//			## Separate Updates which were here, are now all done with in this func
//			let l_error_text = "calling sim deact with sim ", p_sim_no, " ", p_option
//			call errorlog(l_error_text)
//			CALL sim_deactupdates(  p_option,
//				p_sim_no,
//				p_deact_charge01,
//				p_deact_charge02,
//				p_deact_charge03,
//				p_deact_charge04,
//				p_deact_charge05,
//				p_reason_code,
//				l_rc_desc,
//				p_deact_date,
//				p_letter_code,
//				p_prorata_to_date,
//				"Y",
//				l_subscriber_id,
//				l_subs_suffix,
//				l_connect_date,
//				l_intern_tariff,
//				l_smn.smn_network_id)
//
//			IF g_status_class != 0 THEN
//				CALL Error_Append("", l_function)
//				EXIT WHILE
//			END IF
//
//			IF p_deact_date <= TODAY THEN
//
//				-- Get the twinbill number
//				CALL Twinbill_Get("S", l_msisdn_no, "", l_intern_tariff)
//				RETURNING l_twinbill_no
//
//				IF notfound_or_nonzero(l_function) THEN
//					EXIT WHILE
//				END IF
//
//				LET l_charge_date = TODAY
//
//				IF p_option = "PERMANENT" OR p_option = "BATCH_PRM" THEN
//					-- Set history code for permanent deactivation
//					LET l_hist_code = "BSD"
//				END IF
//
//				IF p_option = "TEMPORARY" OR p_option = "BATCH_TMP" THEN
//					-- Set history code for temporary deactivation
//					LET l_hist_code = "BTD"
//				END IF
//
//				IF LENGTH(p_deact_charge01) != 0 THEN
//
//					-- Apply additional charge 1
//					CALL Charge_InsAdditional(l_subscriber_id, l_msisdn_no,
//						l_hist_code, l_twinbill_no, "", l_chg[1].chg_ncode,
//						l_opservm[1].cost, l_chg[1].chg_value, l_charge_date,
//						l_chg[1].chg_class_id, "ADD") RETURNING l_bill_id
//
//					IF g_status_class != 0 THEN
//
//						-- Serious error in Charge_InsAdditional
//						IF g_status_class = 100 THEN
//							CALL Error_SeriousError("", l_function)
//						ELSE
//							CALL Error_Append("", l_function)
//						END IF
//
//						EXIT WHILE
//					END IF
//				END IF
//
//				IF LENGTH(p_deact_charge02) != 0 THEN
//
//					-- Apply additional charge 2
//					CALL Charge_InsAdditional(l_subscriber_id, l_msisdn_no,
//						l_hist_code, l_twinbill_no, "", l_chg[2].chg_ncode,
//						l_opservm[2].cost, l_chg[2].chg_value, l_charge_date,
//						l_chg[2].chg_class_id, "ADD") RETURNING l_bill_id
//
//					IF g_status_class != 0 THEN
//
//						-- Serious error in Charge_InsAdditional
//						IF g_status_class = 100 THEN
//							CALL Error_SeriousError("", l_function)
//						ELSE
//							CALL Error_Append("", l_function)
//						END IF
//
//						EXIT WHILE
//					END IF
//				END IF
//
//				IF LENGTH(p_deact_charge03) != 0 THEN
//
//					-- Apply additional charge 3
//					CALL Charge_InsAdditional(l_subscriber_id, l_msisdn_no,
//						l_hist_code, l_twinbill_no, "", l_chg[3].chg_ncode,
//						l_opservm[3].cost, l_chg[3].chg_value, l_charge_date,
//						l_chg[3].chg_class_id, "ADD") RETURNING l_bill_id
//
//					IF g_status_class != 0 THEN
//
//						-- Serious error in Charge_InsAdditional
//						IF g_status_class = 100 THEN
//							CALL Error_SeriousError("", l_function)
//						ELSE
//							CALL Error_Append("", l_function)
//						END IF
//
//						EXIT WHILE
//					END IF
//				END IF
//
//				IF LENGTH(p_deact_charge04) != 0 THEN
//
//					-- Apply additional charge 4
//					CALL Charge_InsAdditional(l_subscriber_id, l_msisdn_no,
//						l_hist_code, l_twinbill_no, "", l_chg[4].chg_ncode,
//						l_opservm[4].cost, l_chg[4].chg_value, l_charge_date,
//						l_chg[4].chg_class_id, "ADD") RETURNING l_bill_id
//
//					IF g_status_class != 0 THEN
//
//						-- Serious error in Charge_InsAdditional
//						IF g_status_class = 100 THEN
//							CALL Error_SeriousError("", l_function)
//						ELSE
//							CALL Error_Append("", l_function)
//						END IF
//
//						EXIT WHILE
//					END IF
//				END IF
//
//				IF LENGTH(p_deact_charge05) != 0 THEN
//
//					-- Apply additional charge 5
//					CALL Charge_InsAdditional(l_subscriber_id, l_msisdn_no,
//						l_hist_code, l_twinbill_no, "", l_chg[5].chg_ncode,
//						l_opservm[5].cost, l_chg[5].chg_value, l_charge_date,
//						l_chg[5].chg_class_id, "ADD") RETURNING l_bill_id
//
//					IF g_status_class != 0 THEN
//
//						-- Serious error in Charge_InsAdditional
//						IF g_status_class = 100 THEN
//							CALL Error_SeriousError("", l_function)
//						ELSE
//							CALL Error_Append("", l_function)
//						END IF
//
//						EXIT WHILE
//					END IF
//				END IF
//			END IF
//
//			IF p_option = "PERMANENT" OR p_option = "BATCH_PRM" THEN
//
//				# Update deactivation date on sbu_sub_upgrade and calculate
//				# contract age...
//
//				CALL d_sbu_sub_list_open (l_subscriber_id)
//
//				# Loop through sbu records...
//
//				WHILE TRUE
//
//					CALL d_sbu_sub_list_fetch()
//					RETURNING l_sbu.*
//
//					IF g_status_class <> 0 THEN
//
//						IF g_status_class = 100 THEN
//
//							CALL Error_Reset()
//							EXIT WHILE
//
//						ELSE
//
//							CALL Error_Append ("", l_function)
//							EXIT WHILE
//
//						END IF
//
//					END IF
//
//					# Calculate contract age...
//					LET l_months = EXTEND(DATE(p_deact_date), YEAR TO MONTH) -
//					DATE(l_sbu.sbu_activate_date)
//
//					LET l_char_months = l_months
//					LET l_int_months = l_char_months
//					LET l_int_months = l_int_months + l_sbu.sbu_contract_age
//
//					CALL d_sbu_date_upd (l_sbu.sbu_subscriber_id,
//						l_sbu.sbu_subupgrade_id, p_deact_date, l_int_months)
//
//					IF g_status_class <> 0 THEN
//
//						CALL Error_Append ("", l_function)
//
//					END IF
//
//					# Only need to update the latest record,
//					# so only 1 lap of this loop...
//
//					EXIT WHILE
//
//				END WHILE
//
//				CALL d_sbu_sub_list_close()
//
//				-- If deactivation is permanent, request a deactivation letter for
//				-- the subscriber
//
//				## Check to see whether deactivation letters are sent to subscribers
//				CALL SystemKey_Get("ASLTAUTSDC") RETURNING l_type_code
//
//				IF g_status_class != 0 THEN
//					CALL Error_Append("", l_function)
//					EXIT WHILE
//				END IF
//
//				IF l_type_code != "NO" THEN ## Deactivation letter required
//
//					## Check whether a reason code has been set
//					CALL SystemKey_Get("ASLTAUTSDR") RETURNING l_reason
//
//					IF g_status_class != 0 THEN
//						CALL Error_Append("", l_function)
//						EXIT WHILE
//					END IF
//
//					IF l_reason = "NONE" THEN
//						LET l_reason = NULL
//					END IF
//
//					## Create a document request for a deactivation letter
//
//					CALL DocumentOriginal_Create(
//						l_reason,                               #reason
//					l_null_char,                    #account
//					l_subscriber_id,                #subscriber
//					l_null_int,                             #invoice
//					"SIM_NO",                               #Generic Label 4
//					p_sim_no,                               #Generic Value 4
//					l_null_char,                    #Generic Label 5
//					l_null_char,                    #Generic Value 5
//					l_null_char,                    #Generic Label 6
//					l_null_char,                    #Generic Value 6
//					l_type_code,                    #letter type code
//					l_null_char,                    #sub type code
//					l_null_char,                    #version code
//					l_null_char,                    #type cover
//					l_null_char,                    #sub type cover
//					l_null_char,                    #version cover
//					"S" ,                   #no preview
//					TODAY,                  #Required date
//					"",                     #Printer Code
//					"N" ,                   #use passed in address
//					"",                     #address class
//					"",                     #unique ID
//					"",                     #Title
//					"",                     #FirstName
//					"",                     #Surname
//					"",                     #Name
//					"",                     #Address 1
//					"",                     #Address 2
//					"",                     #Address 3
//					"",                     #Address 4
//					"",                     #Address 5
//					"",                     #Address 6
//					"",                     #postcode
//					"",                     #e-mail
//					"",                     #fax no
//					"",                     #general 1
//					"",                     #general 2
//					"",                     #general 3
//					"",                     #adhoc text
//					""                      #Extra references on letter
//					)
//					RETURNING l_document_id
//
//					IF g_status_class != 0 THEN
//						CALL Error_Append("", l_function)
//						EXIT WHILE
//					END IF
//
//				END IF
//
//				-- =================================================================
//				-- Only perform cycle migration when the sim is actually deactivated
//				-- =================================================================
//
//				IF (p_option = "PERMANENT" AND l_future_deact = FALSE) OR p_option = "BATCH_PRM" THEN
//					-- ====================================================
//					-- cycle migration needed if partnerbenefit subscriber
//					-- ====================================================
//
//					CALL d_sbp_checkexist(l_subscriber_id)
//
//					IF g_status_class = 100 THEN
//						CALL Error_Reset ()
//						LET l_exists = 0
//					ELSE
//						IF g_status_class =0 THEN
//							LET l_exists = 1
//						END IF
//					END IF
//
//					IF g_status_class  != 0 AND g_status_class != 100 THEN
//
//						Call Error_Append("CALL to d_sbp_checkexist failed ", l_function)
//						EXIT WHILE
//					END IF
//
//					# Put this FUNCTION CALL outside 'IF l_exist = 1'
//					# because Virtual Recharge needs it whether or not
//					# a cycle migration exists 
//					IF l_subscriber_id IS NULL THEN
//						CALL Error_SeriousError("Subscriber ID is inconsistent", 
//								l_function)
//						EXIT WHILE
//					END IF
//
//					IF LENGTH(l_sbd.sbd_dialling_no) = 0 THEN
//						CALL sbd_get(l_subscriber_id) RETURNING l_sbd.*
//
//						IF g_status_class != 0 THEN
//							Call Error_Append("Call to sbd_get failed", l_function)
//							EXIT WHILE
//						END IF
//
//						IF LENGTH(l_sbd.sbd_dialling_no) = 0 THEN
//							CALL Error_SeriousError("Subscriber ID is inconsistent",
//								l_function)
//
//							EXIT WHILE
//						END IF
//
//					END IF
//
//					IF l_exists = 1 THEN
//
//						LET l_found = FALSE
//						LET l_new_cycle = g_null
//
//						-- ============================================
//						-- migrate the subscriber to the inactive cycle
//						-- ============================================
//
//						CALL d_sbd_pc_get(l_sbd.sbd_bill_ac_no, "I") 
//							RETURNING l_new_cycle
//
//						IF g_status_class != 0 AND g_status_class != 100 THEN
//							Call Error_Append("Call to d_sbd_pc_get failed", 
//								l_function)
//							EXIT WHILE
//						END IF
//
//						IF l_new_cycle IS NOT NULL THEN
//
//							LET l_found = TRUE
//
//						ELSE
//
//							CALL Error_Reset()
//
//	  						LET l_partner_id = g_null
//							INITIALIZE l_pc_partner_config.* TO NULL
//
//	## I.R. 08/05/2009 - THE FOLLOWING FUNCTIONS IS RETURNING DIFFERENT VALUES -   
//	## USD 27121         SEE NEXT CALL STATEMENT
//	##                      CALL d_pc_config_partner_get(l_sbd.sbd_package_code,l_sbd.sbd_tariff_plan) RETURNING l_partner_id
//
//							CALL d_pc_config_partner_get(l_sbd.sbd_package_code,l_sbd.sbd_tariff_plan) RETURNING l_pc_partner_config.*
//							IF g_status_class != 0 AND g_status_class != 100 THEN
//								Call Error_Append("Call to d_pc_config_partner_get failed", l_function)
//								EXIT WHILE
//							END IF
//							LET l_partner_id = l_pc_partner_config.pc_partner_id
//
//							If l_partner_id IS NOT NULL THEN
//								CALL d_pc_cycle_get(l_partner_id, "I", "C") 
//								       RETURNING l_new_cycle
//
//								IF g_status_class != 0 THEN
//									Call Error_Append("Call to d_pc_cycle_get failed", l_function)
//									EXIT WHILE
//								END IF
//
//								Let l_found = TRUE
//
//							ELSE
//
//								CALL Error_Reset()
//
//							END IF # g_status_class = 0
//						END IF # g_status_class = 0
//
//						IF l_found AND l_sbd.sbd_bill_cycle != l_new_cycle THEN
//							CALL CycleMigrate_Subscriber(l_sbd.sbd_bill_ac_no,l_subscriber_id, l_sbd.sbd_bill_cycle, l_new_cycle,
//								"N", "", "", "M")
//
//							IF g_status_class != 0 THEN
//								Call Error_Append("Call to CycleMigrate_Subscriber failed", l_function)
//								EXIT WHILE
//							END IF
//
//						END IF -- l_found
//					END IF -- l_exists
//				END IF
//			END IF
//
//			IF p_option = "PERMANENT" OR p_option = "BATCH_PRM" THEN
//				# Remove all Virtual Recharges if any..
//				IF LENGTH(l_sbd.sbd_dialling_no) = 0 THEN
//					CALL sbd_get(l_subscriber_id) RETURNING l_sbd.*
//					IF g_status_class != 0 THEN
//						CALL Error_SeriousError("MSISDN Number is not known",
//								l_function)
//
//							EXIT WHILE
//						EXIT WHILE
//					END IF
//				END IF
//
//				IF LENGTH(l_sbd.sbd_dialling_no) = 0 THEN
//				END IF
//
//				CALL VirtualRecharge_TerminateSubscriber(l_sbd.sbd_dialling_no, "D")
//
//				IF g_status_class != 0 THEN
//					Call Error_Append("Call to VirtualRecharge_TerminateSubscriber failed", l_function)
//					EXIT WHILE
//				END IF
//			ELSE
//				CALL sbd_get(l_subscriber_id) RETURNING l_sbd.*
//				IF g_status_class != 0 THEN
//					Call Error_Append("", l_function)
//					EXIT WHILE
//				END IF
//				# Remove all Virtual Recharges if any..
//				CALL VirtualRecharge_TerminateSubscriber(l_sbd.sbd_dialling_no, "B")
//
//				IF g_status_class != 0 THEN
//					Call Error_Append("Call to VirtualRecharge_TerminateSubscriber failed", l_function)
//					EXIT WHILE
//				END IF
//			END IF
//
//			-- Make sure only once round loop
//			EXIT WHILE
//
//		END WHILE
//
//		IF g_status_class != 0 THEN
//			CALL RollbackTransaction ("Sim_Deactivate")
//		ELSE
//			CALL CommitTransaction ("Sim_Deactivate")
//		END IF
//
//	END FUNCTION
//
//	#------------------------------------------------------------------------------#
//	# Dummy function, never called, builds SCCS "what string" into the executable. #
//	#------------------------------------------------------------------------------#
//	FUNCTION sccs_dummy_Sim_Deactivate_4gl()
//		DEFINE
//			-- Function variable(s)
//			l_sccs_id					CHAR(1)
//
//		LET l_sccs_id = "@(#)|%M%|%I%|%E% %U%|Sim_Deactivate.4gl"
//
//	END FUNCTION

}
