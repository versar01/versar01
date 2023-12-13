package com.eppixcomm.eppix.common.cli;

public class PerformComm {
	
	
	
//	################################################################################
//	# Copyright (C) 2005 EppixComm                                                 #
//	#                                                                              #
//	# Module Name: Perform Action                                     Version 1.00 #
//	#                                                                              #
//	# Description:                                                                 #
//	#                                                                              #
//	# Revision History:                                                            #
//	#                                                                              #
//	# == DATE == ========================== DETAILS ========================== =BY #
//	# 26/02/2007 Created                                                       PMM #
//	# 25/04/2007 Added p_source 'EPPIXEXPIRE'                                  PMM #
//	################################################################################
//
//	DATABASE eppix
//
//	GLOBALS "globals.4gl"
//
//	#------------------------------------------------------------------------------#
//	# Purpose : To perform  sending of email, creation of a action manager note    #
//	#           or creation of a USD via MW  for MNP                               #
//	# Accepts :                                                                    #
//	# Returns :                                                                    #
//	#------------------------------------------------------------------------------#
//	FUNCTION Perform_Comm(p_option, p_port_id, p_msisdn, p_desc, p_source)
//
//		DEFINE 
//			-- Parameter variable(s)
//			p_option		LIKE sks_key_setting.sks_value,
//			p_port_id		VARCHAR(50),
//			p_msisdn		VARCHAR(15),
//			p_desc			VARCHAR(250),
//			p_source		VARCHAR(30),
//
//			-- Function variable(s)
//			l_option		INTEGER ,
//			l_bitvalue		INTEGER,
//			l_return		INTEGER,
//			i   			INTEGER ,
//			x   			INTEGER ,
//			l_mnp_am		CHAR(1),
//			l_mnp_email		CHAR(1),
//			l_mnp_mw		CHAR(1),
//			l_error         CHAR(100),
//			l_function      CHAR(50),
//			l_cmd			CHAR(1024),
//			l_sql			CHAR(1024),
//			l_rptfile      	CHAR(100),
//			l_no_records	INTEGER,
//			l_eml_subject 	CHAR(32),
//			l_eml_addr 		CHAR(32),
//			l_source		LIKE nte_note.nte_source ,
//			l_deadline		LIKE nte_note.nte_deadline,
//			l_key			LIKE sks_key_setting.sks_value,
//			l_target_name   LIKE us_user_def.us_name,
//			l_act_type		LIKE acn_action.acn_action_type,
//			l_act_reas		LIKE acn_action.acn_action_rsn,
//			l_text_rec      RECORD
//				text_1      CHAR(100),
//				text_2      CHAR(100),
//				text_3      CHAR(100),
//				text_4      CHAR(100),
//				text_5      CHAR(100),
//				text_6      CHAR(100),
//				text_7      CHAR(100),
//				text_8      CHAR(100),
//				text_9      CHAR(100),
//				text_10     CHAR(100)
//			END RECORD ,
//			l_sks			RECORD LIKE sks_key_setting.*,
//			l_acn           RECORD LIKE acn_action.*,
//			l_sba			RECORD like sba_sub_aux.*,
//			l_cca			RECORD LIKE cca_crd_controller.*  
//
//		WHENEVER ANY ERROR CALL error_classify
//
//		LET l_function = ": Perform_Comm()"
//
//		WHILE TRUE
//
//			INITIALIZE l_sks.* TO NULL
//
//			IF p_source[1,10] != "EPPIXN2NPO"
//			AND p_source[1,10] != "EPPIXN2NPI"
//			AND p_source[1,12] != "EPPIXMASSACT" 
//			AND p_source[1,11] != "EPPIXEXPIRE" THEN
//				LET l_error = "'", p_source clipped, "' is not a vaild p_source"
//				CALL Error_BusinessError(116001, p_source, l_error, "")
//				EXIT WHILE
//			END IF
//
//			# Initialize function variable(s)
//			INITIALIZE l_error TO NULL
//			INITIALIZE l_sks.* TO NULL
//
//			CALL sks_get("OPTUSE")
//			RETURNING l_sks.*
//		
//			IF g_status_class != 0 THEN
//				CALL Error_BusinessError(148000, "OPTUSE", "System key 'OPTUSE' not found", "")
//				EXIT WHILE
//			ELSE
//				LET l_bitvalue = l_sks.sks_value
//			END IF
//
//			IF LENGTH(p_option) > 0 THEN
//				LET l_bitvalue = p_option
//			END IF
//		
//			FOR i = 1 TO l_bitvalue
//				CALL fgl_bitcompare(l_bitvalue, i)
//				RETURNING l_return
//		
//				LET l_mnp_email = FALSE 
//				LET l_mnp_mw = FALSE
//				LET l_mnp_am = FALSE
//
//				IF l_return > 0 THEN 
//		
//					CASE 
//		
//						WHEN l_return = 1
//							LET l_mnp_email = TRUE
//						WHEN l_return = 2
//							LET l_mnp_mw = TRUE
//						WHEN l_return = 3
//							LET l_mnp_email = TRUE
//							LET l_mnp_mw = TRUE
//						WHEN l_return = 4
//							LET l_mnp_am = TRUE
//						WHEN l_return = 5
//							LET l_mnp_email = TRUE
//							LET l_mnp_am = TRUE
//						WHEN l_return = 6
//							LET l_mnp_mw = TRUE
//							LET l_mnp_am = TRUE
//						WHEN l_return = 7
//							LET l_mnp_email = TRUE
//							LET l_mnp_mw = TRUE
//							LET l_mnp_am = TRUE
//					END CASE
//		
//				END IF
//		
//			END FOR
//
//			INITIALIZE l_sba.* TO NULL
//			CALL d_vam_sba_get(p_msisdn)
//			RETURNING l_sba.*
//		
//			IF g_status_class != 0 THEN
//				LET l_error = g_error_text
//				CALL Error_SeriousError(l_error, l_function)
//				CALL Error_Reset()
//				EXIT WHILE
//			END IF
//
//			INITIALIZE l_cca.* TO NULL
//			CALL CreditController_GetAccount(l_sba.sba_inv_account)
//			RETURNING   l_cca.cca_controller_id,
//						l_cca.cca_description,
//						l_cca.cca_telephone,
//						l_cca.cca_target_type,
//						l_cca.cca_target_group,
//						l_cca.cca_target_user,
//						l_target_name
//
//			IF g_status_class != 0 THEN
//
//				IF p_source != "EPPIXMASSACT" 
//				AND p_source != "EPPIXEXPIRE" THEN
//
//					CALL sks_get("MNPACTREP2")
//					RETURNING l_sks.*
//		
//					IF g_status_class != 0
//					OR l_sks.sks_value = "NA" THEN
//						CALL Error_Reset()
//						LET l_cca.cca_target_user = l_sks.sks_value
//						LET l_mnp_email = FALSE
//					END IF
//				END IF
//			END IF
//
//			IF l_mnp_email = TRUE THEN
//
//				CALL Perform_MNP_Email(p_port_id, p_msisdn, p_desc, p_source, l_cca.cca_target_user)
//
//				IF g_status_class != 0 THEN
//					LET l_error = "Error Creating MNP email for MSISDN : ", p_msisdn
//					CALL Error_SeriousError(l_error, l_function)
//					CALL error_reset()
//				END IF
//
//			END IF -- l_mnp_email --
//		
//			IF l_mnp_mw = TRUE THEN
//
//				CALL MW_MNPEvent(p_port_id, p_msisdn, p_desc, p_source)
//
//				IF g_status_class != 0 THEN
//					LET l_error = "Error Creating MW Event for MSISDN : ", p_msisdn
//					CALL Error_SeriousError(l_error, l_function)
//					CALL error_reset()
//				END IF
//		
//			END IF 
//
//			IF l_mnp_am = TRUE THEN
//
//				CALL Perform_MNP_AM(p_port_id, p_desc, p_source, l_sba.sba_inv_account, l_sba.sba_subscriber_id, 
//									l_cca.cca_target_type, l_cca.cca_target_group, l_cca.cca_target_user)
//
//				IF g_status_class != 0 THEN
//					LET l_error = "Error Creating Action Manager record for MSISDN : ", p_msisdn
//					CALL Error_SeriousError(l_error, l_function)
//					CALL error_reset()
//				END IF
//
//			END IF 
//		
//			EXIT WHILE
//		
//		END WHILE
//					
//	END FUNCTION -- Perform_Comm --
//
//	################################################################################
//	#------------------------------------------------------------------------------#
//	# Dummy function, never called, builds SCCS "what string" into the executable. #
//	#------------------------------------------------------------------------------#
//	FUNCTION sccs_dummy_Perform_Comm_4gl()
//
//	DEFINE
//		-- Function variable(s)
//		l_sccs_id					CHAR(01)
//
//		LET l_sccs_id = "@(#)|Perform_Comm|2007-03-06"
//
//	END FUNCTION

}
