package com.eppixcomm.eppix.base.errors;

import com.eppixcomm.eppix.base.error.Message;

public interface ApplicationMessages {
	
//===========================================================================================================================	
	/**
	 * SIM APN ERROR HANDLING
	 */
	/**
	 * Business rule error
	 */
	public final Message SIM_000101 = new Message( "SIM/000101","No active record was found for sim ($0)" );
	public final Message SIM_000102 = new Message( "SIM/000102", "The sim ($0) is not active in Eppix");
	public final Message SIM_000103 = new Message( "SIM/000103", "No active record was found for msisdn ($0)");
	public final Message SIM_000104 = new Message( "SIM/000104", "The sim for msisdn ($0) is not active in Eppix");
	public final Message SIM_000105 = new Message( "SIM/000105", "No active record was found for the subscriber");
	public final Message SIM_000106 = new Message( "SIM/000106", "No active account was found for sim($0)");
	public final Message SIM_000107 = new Message( "SIM/000107", "No active account was found for msisdn($0)");
	public final Message SIM_000108 = new Message( "SIM/000108", "The new sim ($0) is not available in Eppix for allocation");
	public final Message SIM_000109 = new Message( "SIM/000109", "The reason code (reasonCode provided) does not exists");
	public final Message SIM_000110 = new Message( "SIM/000110", "SIM Number is already assigned $0");
	public final Message SIM_000111 = new Message( "SIM/000111", "SIM number ($0) is already used and cannot be assigned");
	public final Message SIM_000112 = new Message( "SIM/000112", "Reason code ($0) provided is invalid for action $1");
	public final Message SIM_000113 = new Message( "SIM/000113", "Sim($0) not active, suspend failed");	
	public final Message SIM_000114 = new Message( "SIM/000114", "Sim($0) is not suspended, unsuspend failed");
	public final Message SIM_000115 = new Message( "SIM/000115", "Unsuspend action cannot be performed as there is no previous suspend action done");
	public final Message SIM_000116 = new Message( "SIM/000116", "There is no APN service allocated to the SIM");
	public final Message SIM_000117 = new Message( "SIM/000117", "The sim does not belong to this partner id ($0).");
	public final Message SIM_000118 = new Message( "SIM/000118", "The MSISDN provided ($0) does not match the SIM provided ($1).");
	public final Message SIM_000119 = new Message( "SIM/000119", "The New Sim provided ($0) is allocated to a different subscriber ($1).");
	
	public final Message INSU_000101 = new Message( "INSU/000101","Subscriber is not active" );
	public final Message INSU_000102 = new Message( "INSU/000102", "Subscriber does not exists");
	public final Message INSU_000103 = new Message( "INSU/000103", "The account: $0 does not exists in slcustm");
	public final Message INSU_000104 = new Message( "INSU/000104", "Subscriber has reached maximum instances of Insurance");
	public final Message INSU_000105 = new Message( "INSU/000105", "Subscriber has existing Insurance on device");
	public final Message INSU_000106 = new Message( "INSU/000106", "Monthly Premium exceeds configured System amount");
	public final Message INSU_000107 = new Message( "INSU/000107", "Could not get BCY for billing cycle: $0");	
	public final Message INSU_000108 = new Message( "INSU/000108", "Failed to create the VCF record: Exception: $0");
	public final Message INSU_000109 = new Message( "INSU/000109", "Either the subsiber or msisdn must be provided");
	public final Message INSU_000110 = new Message( "INSU/000110", "Either the Device unique reference or the IMEI must be provided");
	public final Message INSU_000111 = new Message( "INSU/000111", "Subscriber has no Active Insurance Product");
	public final Message INSU_000112 = new Message( "INSU/000112", "Insurance cancellation failed because $0");
	public final Message INSU_000113 = new Message( "INSU/000113", "Policy Number ($0) Already In Use/");
	public final Message INSU_000114 = new Message( "INSU/000114", "Variable Charge details not found");
	public final Message INSU_000115 = new Message( "INSU/000115", "Variable Charge Code is Null");
	public final Message INSU_000116 = new Message( "INSU/000116", "Failed to get the OPSERM record, cannot procceed with prorate charges.");
	public final Message INSU_000117 = new Message( "INSU/000117", "Invalid Prorata Type");
	public final Message INSU_000118 = new Message( "INSU/000118", "Subscriber Invoice Account Not Found");
	public final Message INSU_000119 = new Message( "INSU/000119", "Invalid Charge Code: $0");
	
	public final Message SUB_000001 = new Message("SUB/000001", "Either the subscriber id, msisdn must be provided");
	public final Message SUB_000002 = new Message("SUB/000002", "Invalid subscriber details: subscriber=$0 : MSISDN=$1");
	public final Message SUB_000003 = new Message("SUB/000003", "No services found for: subscriber: $0");
	public final Message SUB_000004 = new Message("SUB/000004", "The account does not belong to this partner id ($0).");
	public final Message SUB_000005 = new Message("SUB/000005", "Invalid subscriber details for: subscriber=$0: MSISDN=$1: SIM: $2");
	public final Message SUB_000006 = new Message("SUB/000006", "Either the subscriber id, msisdn or SIM must be provided");
	public final Message SUB_000007 = new Message("SUB/000007", "The packageCode is mandatory if the sim is supplied.");
	public final Message SUB_000008 = new Message("SUB/000008", "The tariffCode is mandatory if the sim is supplied.");
	public final Message SUB_000009 = new Message("SUB/000009", "Package / tariff details could not be retrieved for Subscriber: $0");
	public final Message SUB_000010 = new Message("SUB/000010", "Active record not found for subscriber=$0 : MSISDN=$1");
	public final Message SUB_000011 = new Message("SUB/000011", "Failed to activate service ($0) for subscriber=$1");
	public final Message SUB_000012 = new Message("SUB/000012", "Service ($0) is not in the list of services for this package/tariff ");
	public final Message SUB_000013 = new Message("SUB/000013", "subscriber=$0 is not active and service cannot be activated.");
	public final Message SUB_000014 = new Message("SUB/000014", "Service details not found for serviceCode: $0.");
	public final Message SUB_000015 = new Message("SUB/000015", "N2N creation failed: $0");	
	public final Message SUB_000016 = new Message("SUB/000016", "$0");
	public final Message SUB_000017 = new Message("SUB/000017", "Service ($0) is already active for subscriber=$1");
	public final Message SUB_000018 = new Message("SUB/000018", "Service ($0) is a basic service and cannot be deactivated for subscriber=$1");
	public final Message SUB_000019 = new Message("SUB/000019", "Failed to get SPV RECORD for PARAM VALUE: $0");
	public final Message SUB_000020 = new Message("SUB/000020", "Failed to get SPV RECORD for NET WORK SERVICE: $0");
	public final Message SUB_000021 = new Message("SUB/000021", "The packageCode is mandatory.");
	public final Message SUB_000022 = new Message("SUB/000022", "Service ($0) is not in the active list of services for the subscriber $1");
	
/**
 * Self service provising errors
 */
	public final Message SSP_000001 = new Message("SSP/000001", "Invalid date provided $0");
	public final Message SSP_000002 = new Message("SSP/000002", "Param recurring ($0) cannot be null and must be either 0 (false) or 1 (true) if action = 'ADD'");
	public final Message SSP_000003 = new Message("SSP/000003", "Param prorateChg ($0) cannot be null or less than 0 if action = 'ADD'");
	public final Message SSP_000004 = new Message("SSP/000004", "The MSISDN provided ($0) was not found in EPPIX");
	public final Message SSP_000005 = new Message("SSP/000005", "The subscriber details ($0) was not found in EPPIX");
	public final Message SSP_000006 = new Message("SSP/000006", "PREPAID Subscriber: $0. Cannot add self service bundles.");
	public final Message SSP_000007 = new Message("SSP/000007", "The param acton can only be 'ADD' or 'REMOVE', received $0");
	public final Message SSP_000008 = new Message("SSP/000008", "Internal Data error, Generic self service bundles ($0) not found.");
	public final Message SSP_000009 = new Message("SSP/000009", "Failed to update the subscriber SPUL with $0");
	public final Message SSP_000010 = new Message("SSP/000010", "The account: $0 does not exists in slcustm.");
	public final Message SSP_000011 = new Message("SSP/000011", "Could not get BCY for billing cycle: $0");
	public final Message SSP_000012 = new Message("SSP/000012", "The service already exists for referenceNo $0 and subCharge $1");
	public final Message SSP_000013 = new Message("SSP/000013", "An error occured creating the service: $0");
	public final Message SSP_000014 = new Message("SSP/000014", "An error occured removing the service: $0");
	public final Message SSP_000015 = new Message("SSP/000015", "The account: $0 does not exists in slcustm");	
	public final Message SSP_000016 = new Message("SSP/000016", "Failed to proccess prorate for subscriber $0");
	public final Message SSP_000017 = new Message("SSP/000017", "The reference number cannot exceed 14 char ($0).");
	public final Message SSP_000018 = new Message("SSP/000018", "The ICASA service $0 is not configured in Eppix");
	public final Message SSP_000019 = new Message("SSP/000019", "The ICASA service already exists for the subscriber: $0");
	public final Message SSP_000020 = new Message("SSP/000020", "");
	public final Message SSP_000021 = new Message("SSP/000021", "");
	public final Message SSP_000022 = new Message("SSP/000022", "");
	
	public final Message MSIM_000100 = new Message("MSIM/0000100",	"The sim ($0) is not active in Eppix");
	public final Message MSIM_000101 = new Message("MSIM/0000101",	"The sim for msisdn ($0) is not active in Eppix");
	public final Message MSIM_000102 = new Message("MSIM/0000102",	"No active record was found for the subscriber");
	public final Message MSIM_000103 = new Message("MSIM/0000103",	"No active account was found for sim($0)");
	public final Message MSIM_000104 = new Message("MSIM/0000104",	"No record was found for sim ($0)");
	public final Message MSIM_000105 = new Message("MSIM/0000105",	"No record was found for msisdn ($0)");
	public final Message MSIM_000106 = new Message("MSIM/0000106",	"No active account was found for Account($0)");
	public final Message MSIM_000107 = new Message("MSIM/0000107",	"Reason for suspension does not allow unsuspend");
	public final Message MSIM_000108 = new Message("MSIM/0000108",	"Sim($0) cannot be  unsuspended by this channel");
	public final Message MSIM_000109 = new Message("MSIM/0000109",	"Sim($0) cannot be  unsuspended by this user");
	public final Message MSIM_000110 = new Message("MSIM/0000110",	"The dealer id ($0) is not valid for the unsuspend action");
	public final Message MSIM_000111 = new Message("MSIM/0000111",	"A future dated action ($0) already exists for this sim ($1)");
	public final Message MSIM_000112 = new Message("MSIM/0000112", "The user type ($0) is invalid");
	public final Message MSIM_000113 = new Message("MSIM/0000113", "The reason code($0) is invalid for this channel, suspend failed");
	public final Message MSIM_000114 = new Message("MSIM/0000114", "Sim($0) is not suspended, unsuspend failed");
	public final Message MSIM_000115 = new Message( "MSIM/0000115", "Date($0) is in the past, suspend failed");
	public final Message MSIM_000116 = new Message( "MSIM/0000116", "The reason code ($0) is invalid");
	public final Message MSIM_000117 = new Message( "MSIM/0000117", "Date($0) is in the past, unsuspend failed");
	public final Message MSIM_000118 = new Message( "MSIM/0000118", "The suspension may not be lifted by this user");
	public final Message MSIM_000119 = new Message( "MSIM/0000119", "The user id ($0) is not valid for the unsuspend action");
	public final Message MSIM_000120 = new Message( "MSIM/0000120", "At least one of the search parameters must be provided.");
	public final Message MSIM_000121 = new Message( "MSIM/0000121", "No future record was found for subscriber ($0)");
	public final Message MSIM_000122 = new Message( "MSIM/0000122", "No future record was found for simNo ($0)");
	public final Message MSIM_000123 = new Message( "MSIM/0000123", "No future record was found for msisdn ($0)");
	public final Message MSIM_000124 = new Message( "MSIM/0000124", "StatCode provided ($0) is invalid");
	public final Message MSIM_000125 = new Message( "MSIM/0000125", "No record was found for ($0)");
//	public final Message MSIM_000126 = new Message( "MSIM/000126", "The reason code($0) is invalid, unsuspend failed");
	public final Message MSIM_000127 = new Message( "MSIM/0000127", "The reason code($0) is invalid for this channel, unsuspend failed");
	public final Message MSIM_000128 = new Message( "MSIM/0000128", "");
	
	/**
	 * Data Failures
	 */
	public final Message SIM_000201 = new Message( "SIM/000201","Failed to create transaction in Eppix");
	public final Message SIM_000202 = new Message( "SIM/000202","");
	public final Message SIM_000203 = new Message( "SIM/000203","");
	public final Message SIM_000204 = new Message( "SIM/000204","");
	public final Message SIM_000205 = new Message( "SIM/000205","");
	public final Message SIM_000206 = new Message( "SIM/000206","");
	public final Message SIM_000207 = new Message( "SIM/000207","");
	public final Message SIM_000208 = new Message( "SIM/000208","");
	public final Message SIM_000209 = new Message( "SIM/000209","");
	public final Message SIM_000210 = new Message( "SIM/000210","");
	public final Message SIM_000211 = new Message( "SIM/000211","");
	
	public final Message SUB_000201 = new Message( "SUB/000201","A serious error occured: Exception: $0");
	
	public final Message SSP_000201 = new Message( "SSP/000201","A serious error occured: Exception: $0");
	
	/**
	 * System errors
	 */
	public final Message BASE_000301 = new Message( "BASE/000301","Internal errors in Eppix. System admin/developer to investigate: $0");
	public final Message BASE_000302 = new Message( "BASE/000302","Middleware failure. System admin to investigate:   $0" );
	public final Message BASE_000303 = new Message( "BASE/000303","Middleware failure. Missing properties file($0). System Admin to investigate" );
	public final Message BASE_000304 = new Message( "BASE/000304","Middleware failure. Failed to get Database connection from Data source($0). System Admin to investigate.");

	
	public final Message SIM_000301 = new Message( "SIM/000301","Internal errors in Eppix. System admin/developer to investigate:   $0" );
	public final Message SIM_000302 = new Message( "SIM/000302","Middleware failure. System admin to investigate:   $0" );
	public final Message SIM_000303 = new Message( "SIM/000303","Middleware failure. Missing properties file($0). System Admin to investigate" );
	public final Message SIM_000304 = new Message( "SIM/000304","Middleware failure. Failed to get Database connection from Data source($0). System Admin to investigate.");

	public final Message INSU_000301 = new Message( "INSU/000301","Internal errors in Eppix. System admin/developer to investigate:   $0" );
	public final Message INSU_000302 = new Message( "INSU/000302","Middleware failure. System admin to investigate:   $0" );
	public final Message INSU_000303 = new Message( "INSU/000303","Middleware failure. Missing properties file($0). System Admin to investigate" );
	public final Message INSU_000304 = new Message( "INSU/000304","Middleware failure. Failed to get Database connection from Data source($0). System Admin to investigate.");
	
	public final Message SUB_000301 = new Message( "SUB/000301","Internal errors in Eppix. System admin/developer to investigate:   $0" );
	public final Message SUB_000302 = new Message( "SUB/000302","Middleware failure. System admin to investigate:   $0" );
	public final Message SUB_000303 = new Message( "SUB/000303","Middleware failure. Missing properties file($0). System Admin to investigate" );
	public final Message SUB_000304 = new Message( "SUB/000304","Middleware failure. Failed to get Database connection from Data source($0). System Admin to investigate.");
//===========================================================================================================================
	// Eaerlot Term acceptance errors.
	
	public final Message ETA_000100 = new Message("ETA/0000100", "Failed to get the quote details. Cannot complete acceptance.");
	public final Message ETA_000101 = new Message("ETA/0000101", "");
	public final Message ETA_000102 = new Message("ETA/0000102", "");
	public final Message ETA_000103 = new Message("ETA/0000103", ")");
	public final Message ETA_000104 = new Message("ETA/0000104", "");
	public final Message ETA_000105 = new Message("ETA/0000105", "");
	public final Message ETA_000106 = new Message("ETA/0000106", "");
	public final Message ETA_000107 = new Message("ETA/0000107", "");
	public final Message ETA_000108 = new Message("ETA/0000108", "");
	public final Message ETA_000109 = new Message("ETA/0000109", "");
	public final Message ETA_000110 = new Message("ETA/0000110", "");
	public final Message ETA_000111 = new Message("ETA/0000111", "");
	public final Message ETA_000112 = new Message("ETA/0000112", "");
	public final Message ETA_000113 = new Message("ETA/0000113", "");
	public final Message ETA_000114 = new Message("ETA/0000114", "");
	public final Message ETA_000115 = new Message("ETA/0000115", "");
	public final Message ETA_000116 = new Message("ETA/0000116", "");
	public final Message ETA_000117 = new Message("ETA/0000117", "");
	public final Message ETA_000118 = new Message("ETA/0000118", "");
	public final Message ETA_000119 = new Message("ETA/0000119", "");
	public final Message ETA_000120 = new Message("ETA/0000120", "");

	
	public final Message ETA_000301 = new Message( "ETA/000301","Internal errors in Eppix. System admin/developer to investigate:   $0" );
	public final Message ETA_000302 = new Message( "ETA/000302","Middleware failure. System admin to investigate:   $0" );
	public final Message ETA_000303 = new Message( "ETA/000303","Middleware failure. Missing properties file($0). System Admin to investigate" );
	public final Message ETA_000304 = new Message( "ETA/000304","Middleware failure. Failed to get Database connection from Data source($0). System Admin to investigate.");

//===========================================================================================================================
}

