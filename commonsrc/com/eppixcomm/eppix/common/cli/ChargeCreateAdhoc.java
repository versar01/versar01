//		#------------------------------------------------------------------------------#
//		# Purpose : Inserts ad-hoc charges, credits and special service charges to be  #
//		#           passed onto the subscriber.                                        #
//		# Accepts : p_subscriber_id  - Subscriber ID                                   #
//		#         : p_msisdn         - MSISDN Number                                   #
//		#         : p_fscode         - Financial Service Code                          #
//		#         : p_service_cost   - Service Cost                                    #
//		#         : p_price          - Price                                           #
//		#         : p_charge_type    - Type of Charge                                  #
//		#         : p_billdat        - Date charge to be applied                       #
//		#         : p_class_id       - Charge class ID                                 #
//		# Returns : l_bill_record_id - Unique ID of new billing record                 #
//		#------------------------------------------------------------------------------#
package com.eppixcomm.eppix.common.cli;

import java.math.BigDecimal;

import org.apache.log4j.Logger;

import com.eppixcomm.eppix.base.blo.BaseBLOBinder;
import com.eppixcomm.eppix.base.blo.SbdSubDetsDMO;
import com.eppixcomm.eppix.base.error.EPPIXBusinessException;
import com.eppixcomm.eppix.base.error.EPPIXFatalException;
import com.eppixcomm.eppix.base.error.EPPIXSeriousException;
import com.eppixcomm.eppix.base.error.EPPIXUnexpectedException;
import com.eppixcomm.eppix.base.error.Thrower;
import com.eppixcomm.eppix.common.util.Date;
import com.eppixcomm.eppix.common.util.FilterOp;
import com.eppixcomm.eppix.common.util.QueryFilter;

public class ChargeCreateAdhoc {
	private Thrower thrower = Thrower.getThrower(ChargeInsAdditional.class);
	private Logger logger = thrower.getLogger();
	protected ChargeInsAdditional chargeAdditional;

	protected BaseBLOBinder base;
	private Integer subscriberId;
	private String msisdn;
	private String fscode;
	private BigDecimal serviceCost;
	private BigDecimal price;
	private String chargeType;
	private Date billdate;
	private Integer classId;
	private String histCode;
	private Integer billRecordId;

	boolean param = false; // Parameter check for set method. Once all
							// parameters has been set change to true

	public ChargeCreateAdhoc(BaseBLOBinder base) {
		this.base = base;
	}

	public void set(Integer subscriberId, String msisdn, String fscode,
			BigDecimal serviceCost, BigDecimal price, String chargeType,
			Date billdate, Integer classId) throws EPPIXSeriousException, EPPIXFatalException {

		if (logger.isDebugEnabled()) {
			logger
					.debug("set(Integer subscriberId, String msisdn, String fscode, BigDecimal serviceCost,"
							+ "BigDecimal price, String chargeType, Date billdate, Integer classId)");
		}

		thrower.ifParameterMissing("subscriberId", subscriberId);
		thrower.ifParameterMissing("msisdn", msisdn);
		thrower.ifParameterMissing("fscode", fscode);
		thrower.ifParameterMissing("serviceCost", serviceCost);
		thrower.ifParameterMissing("price", price);
		thrower.ifParameterMissing("chargeType", chargeType);
		thrower.ifParameterMissing("billdate", billdate);
		thrower.ifParameterMissing("classId", classId);
		
		// IF p_charge_type != "ADH" AND p_charge_type != "CRD" AND
		// p_charge_type != "SPC" THEN
		//
		// LET l_error_text = "Type of Charge '", p_charge_type CLIPPED,
		// "' is Invalid - Must be 'ADH', 'CRD', or 'SPC'"
		// CALL Error_SeriousError(l_error_text, l_function)
		// EXIT WHILE
		// END IF
		
		if(!(chargeType.equals("ADH") || chargeType.equals("CRD") || chargeType.equals("SPC"))){
			thrower.fatal("Type of Charge: " + chargeType + " is Invalid - Must be 'ADH', 'CRD', or 'SPC'");
		}

		this.setSubscriberId(subscriberId);
		this.setMsisdn(msisdn);
		this.setFscode(fscode);
		this.setServiceCost(serviceCost);
		this.setPrice(price);
		this.setChargeType(chargeType);
		this.setBilldate(billdate);
		this.setClassId(classId);

		param = true;
	}

	public Integer doChargeCreateAdhoc() throws EPPIXFatalException,
			EPPIXBusinessException, EPPIXUnexpectedException {

		if (logger.isDebugEnabled()) {
			logger.debug("doChargeCreateAdhoc()");
		}

		if (!param) {
			thrower
					.fatal("Paramaters has not yet been set, please set all paramters using the set method");
		}

		// FUNCTION Charge_CreateAdhoc(p_subscriber_id, p_msisdn, p_fscode,
		// p_service_cost,
		// p_price, p_charge_type, p_billdat, p_class_id)
		//
		// DEFINE
		// -- Parameter variable(s)
		// p_billdat LIKE bill_cccccyyyymmdd.billdat,
		// p_charge_type LIKE bill_cccccyyyymmdd.sparech,
		// p_class_id LIKE chg_charges.chg_class_id,
		// p_fscode LIKE bill_cccccyyyymmdd.chaserv,
		// p_msisdn LIKE bill_cccccyyyymmdd.handset,
		// p_price LIKE bill_cccccyyyymmdd.charge,
		// p_service_cost LIKE bill_cccccyyyymmdd.cost,
		// p_subscriber_id LIKE bill_cccccyyyymmdd.subscriber_id,
		//
		// -- Function variable(s)
		// l_hist_code LIKE msh_msisdn_history.msh_hist_code,
		//
		// l_error_text CHAR(500),
		// l_function CHAR(50),
		//
		// l_bill_record_id INTEGER
		//
		// WHENEVER ANY ERROR CALL error_classify
		//
		// CALL BeginTransaction ("Charge_CreateAdhoc")
		//
		// LET l_function = ": Charge_CreateAdhoc()"
		//
		// CASE
		// WHEN p_subscriber_id IS NULL
		// CALL Error_SeriousError(
		// " Mandatory parameter p_subscriber_id is NULL ", l_function)
		//
		// WHEN LENGTH(p_msisdn) = 0
		// CALL Error_SeriousError(" Mandatory parameter p_msisdn is NULL ",
		// l_function)
		//
		// WHEN LENGTH(p_fscode) = 0
		// CALL Error_SeriousError(" Mandatory parameter p_fscode is NULL ",
		// l_function)
		//
		// WHEN p_price IS NULL
		// CALL Error_SeriousError(
		// " Mandatory parameter p_price is NULL ", l_function)
		//
		// WHEN LENGTH(p_charge_type) = 0
		// CALL Error_SeriousError(
		// "Mandatory parameter p_charge_type is NULL ", l_function)
		//
		// WHEN p_billdat IS NULL
		// CALL Error_SeriousError(
		// "Mandatory parameter p_billdat is NULL ", l_function)
		//
		// WHEN p_class_id IS NULL
		//
		// -- Blank class ID
		// CALL Error_SeriousError(
		// "Mandatory parameter p_class_id is NULL ", l_function)
		// END CASE
		//
		// WHILE g_status_class = 0
		//
		// IF p_service_cost IS NULL THEN
		// LET p_service_cost = 0.00
		// END IF
		//
		// IF p_charge_type != "ADH" AND p_charge_type != "CRD" AND
		// p_charge_type != "SPC" THEN
		//
		// LET l_error_text = "Type of Charge '", p_charge_type CLIPPED,
		// "' is Invalid - Must be 'ADH', 'CRD', or 'SPC'"
		// CALL Error_SeriousError(l_error_text, l_function)
		// EXIT WHILE
		// END IF
		//
		// -- Validate subscriber ID
		// SELECT UNIQUE(0)
		// FROM sbd_sub_dets
		// WHERE sbd_subscriber_id = p_subscriber_id

		QueryFilter filter = new QueryFilter();
		filter.add(FilterOp.EQUAL, SbdSubDetsDMO.sbdSubscriberIdFilter, this
				.getSubscriberId());
		Integer count = null;

		try {
			count = base.sbdSubDets().count(filter);
		} catch (EPPIXBusinessException e) {
			thrower.fatal("Could not retrieve unique subscriber for id: "
					+ this.getSubscriberId());
		} catch (EPPIXUnexpectedException e) {
			thrower.fatal("Could not retrieve unique subscriber for id: "
					+ this.getSubscriberId());
		}

		if (!count.equals(new Integer(1))) {
			thrower.fatal("Could not retrieve unique subscriber for id: "
					+ this.getSubscriberId());
		}

		// CASE
		// WHEN SQLCA.SQLCODE = 100
		//
		// LET l_error_text = "No Bill Cycle details found ",
		// "for Subscriber '", p_subscriber_id CLIPPED, "'"
		// CALL Error_SeriousError(l_error_text, l_function)
		// EXIT WHILE
		//
		// WHEN SQLCA.SQLCODE != 0
		//
		// CALL Error_SeriousError("", l_function)
		// EXIT WHILE
		// END CASE
		//
		// -- Set up history code depending on charge type
		// CASE
		// WHEN p_charge_type = "ADH"
		// LET l_hist_code = "BCHI"
		//
		// WHEN p_charge_type = "CRD"
		// LET l_hist_code = "BCRI"
		//
		// WHEN p_charge_type = "SPC"
		// LET l_hist_code = "BSPI"
		// END CASE

		if (chargeType.equals("ADH")) {
			this.histCode = "BCHI";
		} else if (chargeType.equals("CRD")) {
			this.histCode = "BCRI";
		} else if (chargeType.equals("SPC")) {
			this.histCode = "BSPI";
		}
		//
		// -- Create the charge details
		// CALL Charge_InsAdditional(p_subscriber_id, p_msisdn, l_hist_code, 0,
		// "",
		// p_fscode, p_service_cost, p_price, p_billdat, p_class_id,
		// p_charge_type)
		// RETURNING l_bill_record_id
		chargeAdditional = new ChargeInsAdditional(this.base);
		chargeAdditional.set(this.getSubscriberId(), this.getMsisdn(),
				this.histCode, new Short((short) 0), "", this.getFscode(), this
						.getServiceCost(), this.getPrice(), this.getBilldate(),
				this.getClassId(), this.getChargeType());

		chargeAdditional.insertCharge();
		billRecordId = chargeAdditional.getBillRecordId();
		//
		// CASE
		// WHEN g_status_class = 100
		//
		// -- Record not found
		// CALL Error_SeriousError("", l_function)
		// EXIT WHILE
		//
		// WHEN g_status_class != 0
		//
		// -- Problem in Charge_InsAdditional
		// CALL Error_Append("", l_function)
		// EXIT WHILE
		// END CASE
		//
		// EXIT WHILE
		// END WHILE
		//
		// IF g_status_class != 0 THEN
		// CALL RollbackTransaction ("Charge_CreateAdhoc")
		// ELSE
		// CALL CommitTransaction ("Charge_CreateAdhoc")
		// END IF
		//
		// RETURN l_bill_record_id
		//
		// END FUNCTION
		return this.billRecordId;
	}

	private Integer getSubscriberId() {
		return subscriberId;
	}

	private void setSubscriberId(Integer subscriberId) {
		this.subscriberId = subscriberId;
	}

	private String getMsisdn() {
		return msisdn;
	}

	private void setMsisdn(String msisdn) {
		this.msisdn = msisdn;
	}

	private String getFscode() {
		return fscode;
	}

	private void setFscode(String fscode) {
		this.fscode = fscode;
	}

	private BigDecimal getServiceCost() {
		return serviceCost;
	}

	private void setServiceCost(BigDecimal serviceCost) {
		this.serviceCost = serviceCost;
	}

	private BigDecimal getPrice() {
		return price;
	}

	private void setPrice(BigDecimal price) {
		this.price = price;
	}

	private String getChargeType() {
		return chargeType;
	}

	private void setChargeType(String chargeType) {
		this.chargeType = chargeType;
	}

	private Date getBilldate() {
		return billdate;
	}

	private void setBilldate(Date billdate) {
		this.billdate = billdate;
	}

	private Integer getClassId() {
		return classId;
	}

	private void setClassId(Integer classId) {
		this.classId = classId;
	}

}
