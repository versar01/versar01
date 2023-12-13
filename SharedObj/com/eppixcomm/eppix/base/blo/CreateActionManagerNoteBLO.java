package com.eppixcomm.eppix.base.blo;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Properties;

import org.apache.log4j.Logger;

import com.eppixcomm.eppix.base.blo.BaseBLO;
import com.eppixcomm.eppix.base.blo.BaseMessages;
import com.eppixcomm.eppix.base.error.EPPIXBusinessException;
import com.eppixcomm.eppix.base.error.EPPIXFatalException;
import com.eppixcomm.eppix.base.error.EPPIXSeriousException;
import com.eppixcomm.eppix.base.error.EPPIXUnexpectedException;
import com.eppixcomm.eppix.base.error.Thrower;
import com.eppixcomm.eppix.common.data.DAC;
import com.eppixcomm.eppix.common.data.DTOActionTypes;
import com.eppixcomm.eppix.common.data.IntegerDMO;
import com.eppixcomm.eppix.common.util.Date;
import com.eppixcomm.eppix.common.util.DateTime;
import com.eppixcomm.eppix.common.util.FilterOp;
import com.eppixcomm.eppix.common.util.QueryFilter;
import com.eppixcomm.eppix.soa.sharedservices.blo.AcnActionDMO;
import com.eppixcomm.eppix.soa.sharedservices.blo.InxInvoiceXrefDMO;
import com.eppixcomm.eppix.soa.sharedservices.blo.TpdTextPadDMO;
import com.eppixcomm.eppix.soa.sharedservices.blo.UsUserDefDMO;

public class CreateActionManagerNoteBLO extends BaseBLO implements DTOActionTypes, BaseMessages {
	// Globals
	private static Thrower thrower = Thrower.getThrower(CreateActionManagerNoteBLO.class);
	private Logger logger = thrower.getLogger();
	public CreateActionManagerNoteDAC createActionManagerNoteDAC;
	private static String fileSep = System.getProperty("file.separator");
	private static final String RESOURCES_PATH = System.getProperty("user.dir") + fileSep + "MTN-AppProperties"
			+ fileSep + "eppix-soa-ss" + fileSep;
	private BaseBLOBinder base;
	private Connection connection;
	private Properties properties;
	private Calendar cal;
	protected SimpleDateFormat dtFormatyyyymmdd = new SimpleDateFormat(
			"yyyy-MM-dd");
	protected SimpleDateFormat dtFormat1ddMMyyyy = new SimpleDateFormat(
			"dd/MMM/yyyy");
	protected SimpleDateFormat timeHHSSFormat = new SimpleDateFormat("HHmmss");
	
	@Override
	protected Class getDACClass() {
		return CreateActionManagerNoteDAC.class;
	}

	@Override
	protected void setDAC(DAC dac) {
		this.createActionManagerNoteDAC = (CreateActionManagerNoteDAC) dac;
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
	
	public NteNoteDMO createAMNote(Integer actionSerial, String source,
			String openedById, String statusType, DateTime deadLINE,
			String targetType, String targetGroup, String targetUser,
			String billAcNo, Integer invoiceNo, Integer subscriber,
			String simNo, String msisdnNo, String referenceNo,
			Integer noRecords, String[] text, String priority)
			throws EPPIXSeriousException {
		// #------------------------------------------------------------------------------#
		// # Purpose : Creates an Action Manager Note #
		// # Accepts : p_action_serial - Unique action identifier #
		// # p_source - Source that opened the note #
		// # p_opened_by_id - Login ID of user that opened the note#
		// # p_status_type - Internal status of the note #
		// # p_deadline - Date which note should be closed #
		// # p_target_type - The target type of the note #
		// # p_target_group - Identifier of the target group #
		// # p_target_user - Identifier of the target user #
		// # p_bill_ac_no - Customer identifier #
		// # p_invoice_no - Invoice number #
		// # p_subscriber - Subscriber identifier #
		// # p_sim_no - Sim number #
		// # p_msisdn_no - Msisdn number #
		// # p_reference_no - Reference number #
		// # p_no_records - No. of note text records to be Popped#
		// # p_note_text - Note text records array #
		// # Returns : l_note_serial - Unique note identifier #
		// # l_opened_date - Date and time note was created #
		// # l_closed_date - Date and time note was closed #
		// # l_timestamp - Date and time note was last udated #
		// #------------------------------------------------------------------------------#
		// FUNCTION AMNote_Create( p_action_serial, p_source, p_opened_by_id,
		// p_status_type, p_deadline, p_target_type, p_target_group,
		// p_target_user,
		// p_bill_ac_no, p_invoice_no, p_subscriber, p_sim_no, p_msisdn_no,
		// p_reference_no, p_no_records, p_text, p_priority )


		SbdSubDetsDMO sbdDmo = null;
		String targetName = null;
		AcnActionDMO acnDmo = null;
		InxInvoiceXrefDMO inxDmo = null;
		SlcustmDMO slDmo = null;
		VamActiveMsisdnDMO vamDmo = null;
		NteNoteDMO nteDmo = null;
		DateTime deadline = null;

		boolean toGroup = false;
		boolean toUser = false;

		thrower.ifParameterMissing("noRecords", noRecords);

		if (noRecords.intValue() < 0 || noRecords.intValue() > 100) {
			logger.error("Parameter noRecords must be between 0 and 100");
			throw new EPPIXSeriousException(
					"Parameter noRecords must be between 0 and 100");
		}

		thrower.ifParameterMissing("actionSerial", actionSerial);
		thrower.ifParameterMissing("source", source);

		if (!source.equalsIgnoreCase("U") && !source.equalsIgnoreCase("B")) {
			logger.error("Parameter source must 'U' or 'B'");
			throw new EPPIXSeriousException("Parameter source must 'U' or 'B'");
		}

		thrower.ifParameterMissing("openedById", openedById);
		thrower.ifParameterMissing("statusType", statusType);

		if (!statusType.equalsIgnoreCase("O")
				&& !statusType.equalsIgnoreCase("L")
				&& !statusType.equalsIgnoreCase("C")) {
			logger.error("Parameter statusType must be 'O', 'L' or 'C'");
			throw new EPPIXSeriousException(
					"Parameter statusType must be 'O', 'L' or 'C'");
		}

		thrower.ifParameterMissing("targetType", targetType);

		if (!targetType.equalsIgnoreCase("G")
				&& !targetType.equalsIgnoreCase("U")) {
			logger.error("Parameter targetType must be 'G' or 'U'");
			throw new EPPIXSeriousException(
					"Parameter targetType must be 'G' or 'U'");
		}

		if (targetType.equalsIgnoreCase("G") && targetGroup == null) {
			logger.error("Mandatory parameter targetGroup is NULL");
			throw new EPPIXSeriousException(
					"Mandatory parameter targetGroup is NULL");
		}

		if (targetType.equalsIgnoreCase("U") && targetUser == null) {
			logger.error("Mandatory parameter targetUser is NULL");
			throw new EPPIXSeriousException(
					"Mandatory parameter targetUser is NULL");
		}

		UsUserDefDMO usDmo = null;

		if (source.equalsIgnoreCase("U")) {
			// # Validate user source
			// # Check user exists
			usDmo = this.createActionManagerNoteDAC.getUsUserDef(openedById);
			if (usDmo == null) {
				logger.error("User not in US_USER_DEF table for login: "
						+ openedById + ": CANNOT CRETAE AM NOTE");
				throw new EPPIXSeriousException(
						"User not in US_USER_DEF table for login: "
								+ openedById + ": CANNOT CREATE AM NOTE");
			} else {
				targetName = usDmo.getUsName();
			}
		}

		// # Check for reallocation and validate target
		logger.debug("divert start: FALSE" + "\nTarget Type:" + targetType
				+ "\nTarget User: " + targetUser + "\nOpened By: " + openedById);

		if (source.equalsIgnoreCase("B")
				|| targetType.equalsIgnoreCase("G")
				|| (targetType.equalsIgnoreCase("U") && !targetUser
						.equals(openedById))) {

			// # The Note is being reallocated
			// # Ensure the Note status is 'Open' if created by a User
			if (source.equalsIgnoreCase("U")
					&& statusType.equalsIgnoreCase("C")) {

				logger.error("Unable to reallocate a Closed Note");
				throw new EPPIXSeriousException("197021",
						"Unable to reallocate a Closed Note");
			}

			// # Validate the target
			/**
			 * TODO: SJ: divert will always be false so next if statement of no
			 * meaning.
			 */
			// # Check if the Note is being diverted back to its creator
			// # Set the reallocation flags
			if (targetType.equalsIgnoreCase("G")) {
				toGroup = true;
			}
			// LET l_to_user = (l_target_type = "U")
			if (targetType.equalsIgnoreCase("U")) {
				toUser = true;
			}
		}

		SksKeySettingDMO sksDmo = null;
		QueryFilter filter = null;

		if (usDmo.getUsDiarySuspended().equals("Y")) {

			sksDmo = null;
			filter = new QueryFilter();
			filter.add(FilterOp.EQUAL, SksKeySettingDMO.sksKeyCodeFilter,
					"AMSSPUSRAN");

			try {
				sksDmo = base.sksKeySetting().get(filter);

				if (sksDmo == null) {
					logger.error("Failed getting SKS for code: AMSSPUSRAN");
				}

			} catch (EPPIXBusinessException e) {
				logger.error("Exception getting SKS key AMSSPUSRAN: EXCEPTION: "
						+ e);
				throw new EPPIXSeriousException(
						"Exception getting SKS key AMSSPUSRAN: EXCEPTION: " + e);
			} catch (EPPIXUnexpectedException e) {
				logger.error("Exception getting SKS key AMSSPUSRAN: EXCEPTION: "
						+ e);
				throw new EPPIXSeriousException(
						"Exception getting SKS key AMSSPUSRAN: EXCEPTION: " + e);
			} catch (EPPIXFatalException e) {
				logger.error("Exception getting SKS key AMSSPUSRAN: EXCEPTION: "
						+ e);
				throw new EPPIXSeriousException(
						"Exception getting SKS key AMSSPUSRAN: EXCEPTION: " + e);
			}

			// # System key not found - apply default value
			if (sksDmo.getSksValue().equalsIgnoreCase("N")) {

				logger.error("The personal diary for user " + targetName
						+ " is suspended");
				throw new EPPIXSeriousException("197003",
						"The personal diary for user " + targetName
								+ " is suspended");
			}
		}

		acnDmo = this.createActionManagerNoteDAC.getAcnSerial(actionSerial);
		// # Check action exists
		if (acnDmo == null) {
			logger.error("Failed to get Action Serial for "
					+ actionSerial.toString());
			throw new EPPIXSeriousException("Failed to get Action Serial for "
					+ actionSerial.toString());
		}

		cal = Calendar.getInstance();
		cal.add(cal.MINUTE, acnDmo.getAcnMaxDeadline().intValue());
		deadline = new DateTime(cal.getTime());

		// # Valdiate deadline
		if (deadLINE == null && acnDmo.getAcnEscInd().equalsIgnoreCase("Y")) {

			logger.error("Deadline date must be specified as escalation can occur");
			throw new EPPIXSeriousException("197022",
					"Deadline date must be specified as escalation can occur");

		}

		// ##PMM 06062001
		if (acnDmo.getAcnMaxDeadline().intValue() > 0) {

			if (deadLINE.before(new DateTime()) || deadLINE.after(deadline)) {

				logger.error("Deadline date is out of range: DEAD LINE: "
						+ deadLINE.toString());
				throw new EPPIXSeriousException("197023",
						"Deadline date is out of range: DEAD LINE: "
								+ deadLINE.toString());
			}
		}

		// # Validate subscriber
		if (subscriber != null) {
			sbdDmo = this.getSbd(subscriber);

			if (sbdDmo == null) {
				logger.error("Failed to get SBD for subscriber: " + subscriber);
				throw new EPPIXSeriousException(
						"Failed to get SBD for subscriber: " + subscriber);
			}

			// # Validate account number against subscriber
			if (billAcNo != null && billAcNo.length() > 0) {

				if (!billAcNo.equalsIgnoreCase(sbdDmo.getSbdBillAcNo())) {
					logger.error("Subscriber: " + subscriber
							+ " is not for Customer " + billAcNo);
					throw new EPPIXSeriousException("Subscriber: " + subscriber
							+ " is not for Customer " + billAcNo);
				}
			}
		}

		if (invoiceNo != null && invoiceNo.intValue() > 0) {
			// # Validate the invoice number
			inxDmo = this.createActionManagerNoteDAC.getInxInvoiceXREF(invoiceNo
					.toString());

			if (inxDmo == null) {
				logger.error("Failed getting the Invoice XRef details for invoice: "
						+ invoiceNo);
				throw new EPPIXSeriousException(
						"Failed getting the Invoice XRef details for invoice: "
								+ invoiceNo);
			}

			if (!subscriber.equals(inxDmo.getInxSubscriberId())) {
				// # Validate subscriber against invoice number
				logger.error("Invoice: " + invoiceNo
						+ " is not for Subscriber: " + subscriber);
				throw new EPPIXSeriousException("Invoice: " + invoiceNo
						+ " is not for Subscriber: " + subscriber);
			}

			if (billAcNo != null && billAcNo.length() > 0) {
				// # Validate account number against invoice number
				if (!billAcNo.equalsIgnoreCase(inxDmo.getInxCustomer())) {
					logger.error("Invoice: " + invoiceNo
							+ " is not for Customer: " + billAcNo);
					throw new EPPIXSeriousException("Invoice: " + invoiceNo
							+ " is not for Customer: " + billAcNo);
				}
			}

			if (msisdnNo != null && msisdnNo.length() > 0) {
				// # Validate msisdn number against invoice number
				if (!msisdnNo.equalsIgnoreCase(inxDmo.getInxMsisdnNo())) {

					logger.error("Invoice: " + invoiceNo
							+ "  is not for MSISDN " + msisdnNo);
					throw new EPPIXSeriousException("Invoice: " + invoiceNo
							+ "  is not for MSISDN " + msisdnNo);
				}
			}
		}

		if (billAcNo != null && billAcNo.length() > 0) {
			// # Validate customer
			filter = new QueryFilter();
			filter.add(FilterOp.EQUAL, SlcustmDMO.customerFilter, billAcNo);

			try {
				slDmo = base.slcustm().get(filter);
			} catch (EPPIXBusinessException e) {
				logger.error("Exception getting SLCUSTM for Customer: "
						+ billAcNo + " EXCEPTION: " + e);
				throw new EPPIXSeriousException(
						"Exception getting SLCUSTM for Customer: " + billAcNo
								+ " EXCEPTION: " + e);
			} catch (EPPIXUnexpectedException e) {
				logger.error("Exception getting SLCUSTM for Customer: "
						+ billAcNo + " EXCEPTION: " + e);
				throw new EPPIXSeriousException(
						"Exception getting SLCUSTM for Customer: " + billAcNo
								+ " EXCEPTION: " + e);
			} catch (EPPIXFatalException e) {
				logger.error("Exception getting SLCUSTM for Customer: "
						+ billAcNo + " EXCEPTION: " + e);
				throw new EPPIXSeriousException(
						"Exception getting SLCUSTM for Customer: " + billAcNo
								+ " EXCEPTION: " + e);
			}

			if (slDmo == null) {
				logger.error("Failed getting SLCUSTM for Customer: " + billAcNo);
				throw new EPPIXSeriousException(
						"Failed getting SLCUSTM for Customer: " + billAcNo);
			}
		}

		if (msisdnNo != null && msisdnNo.length() > 0) {
			// # Validate the MSISDN number
			filter = new QueryFilter();
			filter.add(FilterOp.EQUAL, VamActiveMsisdnDMO.vamMsisdnNoFilter,
					msisdnNo);

			try {
				vamDmo = base.vamActiveMsisdn().get(filter);

				if (vamDmo == null) {
					logger.error("Failed to get VAM record by msisdn number: "
							+ msisdnNo);
					throw new EPPIXSeriousException(
							"Failed to get VAM record by msisdn number: "
									+ msisdnNo);
				}

			} catch (EPPIXBusinessException e) {
				logger.error("Exception getting VAM record by msisdn number: "
						+ msisdnNo + " EXCEPTION: " + e);
				throw new EPPIXSeriousException(
						"Exception getting VAM record by msisdn number: "
								+ msisdnNo + " EXCEPTION: " + e);
			} catch (EPPIXUnexpectedException e) {
				logger.error("Exception getting VAM record by msisdn number: "
						+ msisdnNo + " EXCEPTION: " + e);
				throw new EPPIXSeriousException(
						"Exception getting VAM record by msisdn number: "
								+ msisdnNo + " EXCEPTION: " + e);
			} catch (EPPIXFatalException e) {
				logger.error("Exception getting VAM record by msisdn number: "
						+ msisdnNo + " EXCEPTION: " + e);
				throw new EPPIXSeriousException(
						"Exception getting VAM record by msisdn number: "
								+ msisdnNo + " EXCEPTION: " + e);
			}

			if (subscriber != null) {
				// # Validate subscriber against MSISDN number
				if (!subscriber.equals(vamDmo.getVamSubscriberId())) {
					logger.error("MSISDN " + msisdnNo
							+ " is not for Subscriber ID " + subscriber);
					throw new EPPIXSeriousException("MSISDN " + msisdnNo
							+ " is not for Subscriber ID " + subscriber);
				}
			}

			if (simNo != null && simNo.length() > 0) {
				// # Validate SIM number against MSISDN number
				if (!simNo.equalsIgnoreCase(vamDmo.getVamSimNo())) {
					logger.error("MSISDN " + msisdnNo + " is not for SIM "
							+ simNo);
					throw new EPPIXSeriousException("MSISDN " + msisdnNo
							+ " is not for SIM " + simNo);
				}
			}
		}

		//
		SmnSimNosDMO smnDmo = null;
		// # Validate the SIM number
		if (simNo != null && simNo.length() > 0) {

			filter = new QueryFilter();
			filter.add(FilterOp.EQUAL, SmnSimNosDMO.smnSimNoFilter, simNo);

			try {
				smnDmo = base.smnSimNos().get(filter);

				if (smnDmo == null) {
					logger.error("Failed to get SMN for simNo " + simNo);
					throw new EPPIXSeriousException(
							"Failed to get SMN for simNo " + simNo);
				}
			} catch (EPPIXBusinessException e) {
				logger.error("Exception getting SMN for simNo " + simNo
						+ " EXCEPTION: " + e);
				throw new EPPIXSeriousException(
						"Exception getting SMN for simNo " + simNo
								+ " EXCEPTION: " + e);
			} catch (EPPIXUnexpectedException e) {
				logger.error("Exception getting SMN for simNo " + simNo
						+ " EXCEPTION: " + e);
				throw new EPPIXSeriousException(
						"Exception getting SMN for simNo " + simNo
								+ " EXCEPTION: " + e);
			} catch (EPPIXFatalException e) {
				logger.error("Exception getting SMN for simNo " + simNo
						+ " EXCEPTION: " + e);
				throw new EPPIXSeriousException(
						"Exception getting SMN for simNo " + simNo
								+ " EXCEPTION: " + e);
			}
		}

		// # Set up values for insert
		if (nteDmo == null) {
			nteDmo = new NteNoteDMO();
		}

		nteDmo.setNteNote(new Integer(0));
		nteDmo.setNteActionSerial(actionSerial);
		nteDmo.setNteSource(source);
		nteDmo.setNteOpenedDate(new DateTime());
		nteDmo.setNteOpenedBy(openedById);

		if (statusType.equalsIgnoreCase("C")) {
			nteDmo.setNteClosedDate(new DateTime());
		}

		nteDmo.setNteTimestamp(new DateTime());
		nteDmo.setNteStatus(statusType);
		nteDmo.setNteDeadline(deadLINE);
		nteDmo.setNteTargetType(targetType);
		nteDmo.setNteTargetGroup(new Integer(targetGroup));
		nteDmo.setNteTargetUser(targetUser);
		nteDmo.setNteReallocBy(openedById);
		nteDmo.setNteReallocDate(new DateTime());
		nteDmo.setNteSuspendedUser("");
		nteDmo.setNteBillAcNo(billAcNo);
		nteDmo.setNteInvoiceNo((invoiceNo == null) ? "" : invoiceNo.toString());
		nteDmo.setNteSubscriberId(subscriber);
		nteDmo.setNteSimNo(simNo);
		nteDmo.setNteMsisdnNo(msisdnNo);
		nteDmo.setNteReferenceNo(referenceNo);
		nteDmo.setNteLastPage(1);
		nteDmo.setNtePriorityType(acnDmo.getAcnDefPriority());

		if (toUser) {
			nteDmo.setNteLastPage(2);
		}

		// # Insert nte record
		try {
			nteDmo = base.nteNote().create(nteDmo);
		} catch (EPPIXBusinessException e) {

			logger.error("Exception inserting new NTE record for subscriber: "
					+ subscriber + " MSISDN: " + msisdnNo + " EXCEPTION: " + e);
			throw new EPPIXSeriousException(
					"Exception inserting new NTE record for subscriber: "
							+ subscriber + " MSISDN: " + msisdnNo
							+ " EXCEPTION: " + e);
		} catch (EPPIXUnexpectedException e) {
			logger.error("Exception inserting new NTE record for subscriber: "
					+ subscriber + " MSISDN: " + msisdnNo + " EXCEPTION: " + e);
			throw new EPPIXSeriousException(
					"Exception inserting new NTE record for subscriber: "
							+ subscriber + " MSISDN: " + msisdnNo
							+ " EXCEPTION: " + e);
		} catch (EPPIXFatalException e) {
			logger.error("Exception inserting new NTE record for subscriber: "
					+ subscriber + " MSISDN: " + msisdnNo + " EXCEPTION: " + e);
			throw new EPPIXSeriousException(
					"Exception inserting new NTE record for subscriber: "
							+ subscriber + " MSISDN: " + msisdnNo
							+ " EXCEPTION: " + e);
		}

		// # Set up constant part of text pad record

		IntegerDMO nteSerial = null;
		try {
			nteSerial = this.createActionManagerNoteDAC.getMaxNteNote();
		} catch (EPPIXUnexpectedException e) {
			logger.error("Exception getting max serial for new NTE record for subscriber: "
					+ subscriber + " MSISDN: " + msisdnNo + " EXCEPTION: " + e);
			throw new EPPIXSeriousException(
					"Exception getting max serial for new NTE record for subscriber: "
							+ subscriber + " MSISDN: " + msisdnNo
							+ " EXCEPTION: " + e);
		}

		TpdTextPadDMO tpdDmo = new TpdTextPadDMO();

		short val = 1;
		short no = 0;

		logger.debug("1 NEW OWNER SERIAL FOR TPD: " + nteSerial.getIntValue());

		/**
		 * SJ: Added code to ensure we get the inserted serials number
		 * This nteSerial should not be null though.
		 */
		if (nteSerial == null) {
			nteSerial = new IntegerDMO(0);
		}

		logger.debug("2 NEW OWNER SERIAL FOR TPD: " + nteSerial.getIntValue());

		tpdDmo.setTpdOwnerSerial(nteSerial.getIntValue());
		tpdDmo.setTpdType("N");
		tpdDmo.setTpdPageNo(val);
		tpdDmo.setTpdBlockAttr(no);

		if (text[0] != null && text[0].length() > 0) {
			tpdDmo.setTpdBlockNo(val);
			tpdDmo.setTpdBlockText(text[0]);
			this.createActionManagerNoteDAC.insertTpdTextPad(tpdDmo);
		}

		if (text[1] != null && text[1].length() > 0) {

			val = 2;
			tpdDmo.setTpdBlockNo(val);
			tpdDmo.setTpdBlockText(text[1]);
			this.createActionManagerNoteDAC.insertTpdTextPad(tpdDmo);
		}

		if (text[2] != null && text[2].length() > 0) {
			val = 3;
			tpdDmo.setTpdBlockNo(val);
			tpdDmo.setTpdBlockText(text[2]);
			this.createActionManagerNoteDAC.insertTpdTextPad(tpdDmo);
		}

		if (text[3] != null && text[3].length() > 0) {
			val = 4;
			tpdDmo.setTpdBlockNo(val);
			tpdDmo.setTpdBlockText(text[3]);
			this.createActionManagerNoteDAC.insertTpdTextPad(tpdDmo);
		}

		if (text[4] != null && text[4].length() > 0) {
			val = 5;
			tpdDmo.setTpdBlockNo(val);
			tpdDmo.setTpdBlockText(text[4]);
			this.createActionManagerNoteDAC.insertTpdTextPad(tpdDmo);

		}

		if (text[5] != null && text[5].length() > 0) {
			val = 6;
			tpdDmo.setTpdBlockNo(val);
			tpdDmo.setTpdBlockText(text[5]);
			this.createActionManagerNoteDAC.insertTpdTextPad(tpdDmo);
		}

		if (text[6] != null && text[6].length() > 0) {
			val = 7;
			tpdDmo.setTpdBlockNo(val);
			tpdDmo.setTpdBlockText(text[6]);
			this.createActionManagerNoteDAC.insertTpdTextPad(tpdDmo);
		}

		if (text[7] != null && text[7].length() > 0) {
			val = 8;
			tpdDmo.setTpdBlockNo(val);
			tpdDmo.setTpdBlockText(text[7]);
			this.createActionManagerNoteDAC.insertTpdTextPad(tpdDmo);
		}

		if (text[8] != null && text[8].length() > 0) {
			val = 9;
			tpdDmo.setTpdBlockNo(val);
			tpdDmo.setTpdBlockText(text[8]);
			this.createActionManagerNoteDAC.insertTpdTextPad(tpdDmo);

		}

		if (text[9] != null && text[9].length() > 0) {
			val = 10;
			tpdDmo.setTpdBlockNo(val);
			tpdDmo.setTpdBlockText(text[9]);
			this.createActionManagerNoteDAC.insertTpdTextPad(tpdDmo);
		}

		// -- Append messages to the Note
		if (toUser || toGroup) {

			this.appendAcnMgrNoteReallocMsg(nteSerial.getIntValue(),
					noRecords.intValue(), 1, false, targetType, "", targetType,
					targetGroup, targetUser, targetName);
		}

		if (statusType.equalsIgnoreCase("C")) {

			this.appendClosedMsgAcnMigrate(nteSerial.getIntValue(), 1,
					noRecords, targetName, nteDmo.getNteOpenedDate(),
					nteDmo.getNteClosedDate());
		}

		/**
		 * SJ: Only logs a warning if divert true. As divert will always be
		 * false due to commented code this function will not do anything.
		 * 
		 * // FUNCTION acn_mgr_note_divert_warning( p_divert, p_target_type,
		 * p_target_name ) // DEFINE // -- Parameter variable(s) //
		 */

		// # Ensure only once round this loop
		return nteDmo;

	}

	public void appendAcnMgrNoteReallocMsg(Integer noteSerial, int pageNo,
			int blockNo, boolean divert, String originalType,
			String originalName, String targetType, String targetGroup,
			String targetUser, String targetName) throws EPPIXSeriousException {
		// #------------------------------------------------------------------------------#
		// # Purpose : Appends a 'Reallocated' message to the text of the
		// specified #
		// # Action Manager Note. #
		// # Accepts : p_note_serial - Action Manager Note serial number
		// identifier.#
		// # p_page_no - Page number of text. #
		// # p_block_no - Block number of text. #
		// # p_divert - Flag (TRUE, FALSE) to indicate whether the #
		// # Note has been diverted. #
		// # p_original_type - Original target type #
		// # ("G" = Group, "U" = User). #
		// # p_original_name - Original target group or user name. #
		// # p_target_type - Actual target type. #
		// # p_target_group - Actual target group serial number identifier.#
		// # Valid when p_target_type is "G". #
		// # p_target_user - Login identifier of actual target user. #
		// # Valid when p_target_type is "U". #
		// # p_target_name - Name of actual target group or user. #
		// # Returns : Nothing. #
		// #------------------------------------------------------------------------------#
		// FUNCTION acn_mgr_note_append_realloc_msg( p_note_serial, p_page_no,
		// p_block_no,

		String message = null;
		String defaultMessage = null;
		String msgNo = null;

		if (divert) {

			if (originalType.equalsIgnoreCase("G")) {
				msgNo = "197006";
				defaultMessage = "Target Group %1$s is suspended";
			} else if (originalType.equalsIgnoreCase("U")) {
				msgNo = "197003";
				defaultMessage = "The personal diary for user %1$s is suspended";
			}
			//
			try {
				message = this.getAsMessage(msgNo);
			} catch (EPPIXSeriousException e) {
				logger.error("Failed to get AS MESSAGE for message number: "
						+ msgNo);
				throw new EPPIXSeriousException(
						"Failed to get AS MESSAGE for message number: " + msgNo);
			}

			if (message == null) {
				message = defaultMessage;
			}
			// -- Substitute values into the place holders
			message = String.format(message, originalName);
		}

		// -- Retrieve the 'reallocated' message
		if (targetType.equalsIgnoreCase("G")) {
			msgNo = "197048";
			defaultMessage = "Reallocated to group %1$s on %2$s at %3$s";
		} else if (targetType.equalsIgnoreCase("U")) {
			if (!divert) {
				msgNo = "197049";
				defaultMessage = "Picked-up by user %1$s on %2$s at %3$s";

			} else {
				msgNo = "197047";
				defaultMessage = "Reallocated to user %1$s on %2$s at %3$s";
			}
		}

		try {
			message = this.getAsMessage(msgNo);
		} catch (EPPIXSeriousException e) {
			e.printStackTrace();
		}

		if (message == null) {
			message = defaultMessage;
		}

		Calendar openedCal = Calendar.getInstance();

		int hours = openedCal.get(Calendar.HOUR_OF_DAY);
		int min = openedCal.get(Calendar.MINUTE);

		message = String.format(defaultMessage, targetName,
				dtFormatyyyymmdd.format(openedCal.getTime()),
				timeHHSSFormat.format(openedCal.getTime()));

		// -- Append the message to the 'tpd_text_pad' table
		this.appendAcnMigrateTpd(noteSerial, "N", pageNo, blockNo, message);
	}

	public void appendClosedMsgAcnMigrate(Integer noteSerial, int pageNo,
			int blockNo, String targetName, DateTime openedDate,
			DateTime closedDate) throws EPPIXSeriousException {
		// #------------------------------------------------------------------------------#
		// # Purpose : Appends a 'Closed' message to the text of the specified
		// Action #
		// # Manager Note. #
		// # Accepts : p_note_serial - Note serial number identifier. #
		// # p_page_no - Page number of text to append message. #
		// # p_block_no - Block number of text to append message. #
		// # p_target_name - Name of user that closed the Note. #
		// # p_opened_date - Date and time the Note was opened. #
		// # p_closed_date - Date and time the Note was closed. #
		// # Returns : Nothing. #
		// #------------------------------------------------------------------------------#
		// FUNCTION acn_mgr_note_append_closed_msg( p_note_serial, p_page_no,
		// p_block_no,
		// p_target_name, p_opened_date, p_closed_date )

		String message;
		String msg1;
		String msg2;
		int elapsed;
		int elapsedDays;
		int elapsedHours;
		int elapsedMin;

		Calendar cal = Calendar.getInstance();
		msg1 = null;
		if (msg1 == null) {

			msg1 = "Closed by user %1$s on %2$s at %3$s.";
		}

		msg1 = String.format(msg1, targetName,
				dtFormat1ddMMyyyy.format(new Date()),
				timeHHSSFormat.format(new DateTime()));

		msg1 = msg1 + "\r\n";

		// -- Retrieve the 'elapsed' message
		msg2 = null;
		if (msg2 == null) {
			msg2 = "Elapsed time to completion: %1$d day(s), %2$d hour(s) and %3$d minute(s)";
		}

		Calendar closedCal = Calendar.getInstance();
		closedCal.setTime(closedDate);

		Calendar openedCal = Calendar.getInstance();
		openedCal.setTime(openedDate);

		elapsedDays = closedCal.get(Calendar.DATE)
				- openedCal.get(Calendar.DATE);
		elapsedHours = closedCal.get(Calendar.HOUR_OF_DAY)
				- openedCal.get(Calendar.HOUR_OF_DAY);
		elapsedMin = closedCal.get(Calendar.MINUTE)
				- openedCal.get(Calendar.MINUTE);

		logger.debug("elapsedDays: " + elapsedDays + " elapsedHours: "
				+ elapsedHours + " elapsedMin: " + elapsedMin);

		msg2 = String.format(msg2, elapsedDays, elapsedHours, elapsedMin);
		msg2 = msg2 + "\r\n";

		// -- Substitute values into the place holders
		message = msg1 + msg2;

		logger.debug("Message: " + message);
		// -- Append the message to the 'tpd_text_pad' table
		this.appendAcnMigrateTpd(noteSerial, "N", pageNo, blockNo, message);

	}
	
	public void appendAcnMigrateTpd(Integer ownerSerial, String type,
			int pageNo, int blockNo, String message)
			throws EPPIXSeriousException {

		TpdTextPadDMO tpdDmo = null;
		IntegerDMO tpdBlockNo = null;
		boolean update = false;

		thrower.ifParameterMissing("ownerSerial", ownerSerial);
		thrower.ifParameterMissing("type", type);
		thrower.ifParameterMissing("pageNo", pageNo);

		if (blockNo <= 0) {

			// -- Retrieve the last block number
			tpdBlockNo = this.createActionManagerNoteDAC.getMaxTpdBlock(ownerSerial,
					type, pageNo);

			if (tpdBlockNo == null) {

				logger.error("Block No cannot be found for OWNER SERIAL: "
						+ ownerSerial);
				throw new EPPIXSeriousException(
						"Block No cannot be found for OWNER SERIAL: "
								+ ownerSerial);
			} else {
				blockNo = tpdBlockNo.getIntValue();
			}
		}

		if (blockNo > 0) {
			update = true;
		} else {
			update = false;
		}

		if (update) {

			// -- Get the block to update
			tpdDmo = this.createActionManagerNoteDAC.getTpdTextPad(ownerSerial, type,
					pageNo, blockNo);

			// -- Check for errors
			if (tpdDmo != null) {

				if (tpdDmo.getTpdBlockText() != null
						&& tpdDmo.getTpdBlockText().length() > 0) {

					if (tpdDmo.getTpdBlockText().endsWith("\n")) {
						tpdDmo.setTpdBlockText(tpdDmo.getTpdBlockText().trim()
								+ message.trim());

					} else {
						tpdDmo.setTpdBlockText(tpdDmo.getTpdBlockText().trim()
								+ "\r\n" + message.trim());

					}
				} else {
				}
			} // tpdDmo = null. This is serious error as we did get the block

			else {
				logger.error("Failed to get TPD for owner serial: "
						+ ownerSerial + " Type: " + type + " page no: "
						+ pageNo + " block no: " + blockNo);
				throw new EPPIXSeriousException("1",
						"Failed to get TPD for owner serial: " + ownerSerial
								+ " Type: " + type + " page no: " + pageNo
								+ " block no: " + blockNo);
			}
		} else {
			// -- Create a new block
			tpdDmo = new TpdTextPadDMO();
			tpdDmo.setTpdOwnerSerial(ownerSerial);
			tpdDmo.setTpdType("");
			tpdDmo.setTpdPageNo((short) pageNo);
			tpdDmo.setTpdBlockNo((short) 1);
			tpdDmo.setTpdBlockAttr((short) 0);

		}

		int i = 0;
		int msgLen = message.length();

		while (i <= msgLen) {

			int j = i + 99;
			if (j > msgLen) {
				j = msgLen;
			}

			tpdDmo.setTpdBlockText(message.substring(i, j));

			logger.debug("\nTpdBlockAttr: " + tpdDmo.getTpdBlockAttr()
					+ "\nTpdBlockText: " + tpdDmo.getTpdBlockText()
					+ "\nTpdOwnerSerial: " + tpdDmo.getTpdOwnerSerial()
					+ "\nTpdType: " + tpdDmo.getTpdType() + "\nTpdPageNo: "
					+ tpdDmo.getTpdPageNo() + "\nTpdBlockNo: "
					+ tpdDmo.getTpdBlockNo());

			if (update) {
				this.createActionManagerNoteDAC.updateTpdTextPad(
						tpdDmo.getTpdBlockAttr(), tpdDmo.getTpdBlockText(),
						tpdDmo.getTpdOwnerSerial(), tpdDmo.getTpdType(),
						tpdDmo.getTpdPageNo(), tpdDmo.getTpdBlockNo());
				update = false;
			} else {
				this.createActionManagerNoteDAC.insertTpdTextPad(tpdDmo);
			}

			tpdDmo.setTpdBlockNo((short) (tpdDmo.getTpdBlockNo() + new Short(
					"1")));
			i = i + 100;
		}
	}
	
	public String getAsMessage(String messNumber) throws EPPIXSeriousException {

		thrower.ifParameterMissing("messNumber", messNumber);
	
		QueryFilter filter = new QueryFilter();
		filter.add(FilterOp.EQUAL, AsMessageDMO.mcodeFilter, messNumber);
		AsMessageDMO asDMO = null;

		try {
			asDMO = base.asMessage().get(filter);
		} catch (EPPIXBusinessException e) {

			logger.error("Exception getting ASMESSAGE RECORD FOR MESS: "
					+ messNumber + " EXCEPTION: " + e);
			throw new EPPIXSeriousException(
					"Exception getting ASMESSAGE RECORD FOR MESS: "
							+ messNumber + " EXCEPTION: " + e);
		} catch (EPPIXUnexpectedException e) {
			logger.error("Exception getting ASMESSAGE RECORD FOR MESS: "
					+ messNumber + " EXCEPTION: " + e);
			throw new EPPIXSeriousException(
					"Exception getting ASMESSAGE RECORD FOR MESS: "
							+ messNumber + " EXCEPTION: " + e);
		} catch (EPPIXFatalException e) {

			logger.error("Exception getting ASMESSAGE RECORD FOR MESS: "
					+ messNumber + " EXCEPTION: " + e);
			throw new EPPIXSeriousException(
					"Exception getting ASMESSAGE RECORD FOR MESS: "
							+ messNumber + " EXCEPTION: " + e);
		}

		if (asDMO == null) {
			logger.error("ASMESSAGE RECORD FOR MESS: " + messNumber
					+ " NOT FOUNND");
			throw new EPPIXSeriousException("ASMESSAGE RECORD FOR MESS: "
					+ messNumber + " NOT FOUNND");
		}

		return asDMO.getMmess();
	}

	public SbdSubDetsDMO getSbd(Integer subscriberId)
			throws EPPIXSeriousException {

		thrower.ifParameterMissing("subscriberId", subscriberId);

		QueryFilter filter = new QueryFilter();
		filter.add(FilterOp.EQUAL, SbdSubDetsDMO.sbdSubscriberIdFilter,
				subscriberId);
		SbdSubDetsDMO sbdDmo = null;
		try {
			sbdDmo = base.sbdSubDets().get(filter);

			if (sbdDmo == null) {
				logger.error("Unable to find details for subscriber Id "
						+ subscriberId);
				throw new EPPIXSeriousException(
						"Unable to find details for subscriber Id "
								+ subscriberId);
			}

		} catch (EPPIXBusinessException e) {
			logger.error("Exception in getting details for subscriber Id "
					+ subscriberId + " EXCEPTION: " + e);
			throw new EPPIXSeriousException(
					"Exception in getting details for subscriber Id "
							+ subscriberId + " EXCEPTION: " + e);
		} catch (EPPIXUnexpectedException e) {
			logger.error("Exception in getting details for subscriber Id "
					+ subscriberId + " EXCEPTION: " + e);
			throw new EPPIXSeriousException(
					"Exception in getting details for subscriber Id "
							+ subscriberId + " EXCEPTION: " + e);
		} catch (EPPIXFatalException e) {
			logger.error("Exception in getting details for subscriber Id "
					+ subscriberId + " EXCEPTION: " + e);
			throw new EPPIXSeriousException(
					"Exception in getting details for subscriber Id "
							+ subscriberId + " EXCEPTION: " + e);
		}

		return sbdDmo;
	}
	
	
	/**
	 * 	#------------------------------------------------------------------------------#
		# Purpose : Set up values defining the format of an MSISDN from passed mask    #
		#           NOTE: It is assumed that elements of the mask will be contiguous   #
		#               : ie all "N"s will be together, All "H"s will be together etc  #
		# Accepts : p_mask          - The Msisdn mask                                  #
		# Returns : l_MsisdnLength  - Length of the complete MSISDN number             #
		#           l_ContainPrefix - Does MSISDN mask contain a prefix (Y/N)          #
		#           l_PositionPrefix- Start position of Prefix within MSISDN mask      #
		#           l_LengthPrefix  - Length of the Prefix                             #
		#           l_ContainHlr    - Does MSISDN mask includes a HLR (Y/N)            #
		#           l_PositionHlr   - Start position of HLR within MSISDN mask         #
		#           l_LengthHlr     - Length of the HLR.                               #
		#           l_PositionNumber- Start pos. of actual Number within MSISDN mask   #
		#           l_LengthNumber  - Length of the actual Number                      #
		#           l_ContainZeros  - Does MSISDN mask includes trailing zeros         #
		#           l_LengthZeros   - Length (or number) of trailing zeros             #
		#           l_Positionzeros - Start position of the trailing zeros             #
		#------------------------------------------------------------------------------#
	 * 
	 * @param mask
	 * @throws EPPIXSeriousException
	 */
	public Object[] msisdnFormat(String mask)throws EPPIXSeriousException {
		// Function variable(s)
		String containhlr = "";
		String containprefix = "";
		String containzeros = "";
		String function = "";
		String message = "";

		int counter = 0;
		int lengthhlr = 0;
		int lengthnumber = 0;
		int lengthprefix = 0;
		int lengthzeros = 0;
		int msisdnlength = 0;
		int positionhlr = 0;
		int positionnumber = 0;
		int positionprefix = 0;
		int positionzeros = 0;

//			## Check for NULL MSISDN mask
//			IF LENGTH(p_mask) = 0 THEN
//				CALL Error_SeriousError("Mandatory parameter p_mask is NULL",l_function)
//			END IF
		thrower.ifParameterMissing("mask", mask);
		logger.debug("\nMASK: " + mask);

//			## Set initial values for all return parameters
//			LET l_msisdnlength      = 0
//			LET l_containprefix     = "N"
//			LET l_positionprefix    = 0
//			LET l_lengthprefix      = 0
//			LET l_containhlr        = "N"
//			LET l_positionhlr       = 0
//			LET l_lengthhlr         = 0
//			LET l_positionnumber    = 0
//			LET l_lengthnumber      = 0
//			LET l_containzeros      = "N"
//			LET l_lengthzeros       = 0
//			LET l_positionzeros     = 0

//			## Loop through the mask setting necessary return parameters
		logger.debug("\nLoop through the mask setting necessary return parameters");
		while (counter < mask.length()) {
//			FOR l_counter = 1 TO LENGTH(p_mask)
//				## Increment Length of MSISDN
//				LET l_msisdnlength = l_msisdnlength + 1
			msisdnlength++;
			logger.debug("\nCOUNTER: " + counter);
			switch (mask.substring(counter, counter + 1)) {
//				CASE p_mask[l_counter, l_counter]

				case "N":
//					WHEN "N"        ## Set 'Network Prefix' details
//						LET l_lengthprefix = l_lengthprefix + 1
					lengthprefix++;
					if(lengthprefix == 1) {
//						IF l_lengthprefix = 1 THEN
//							LET l_containprefix  = "Y"
						containprefix = "Y";
//							LET l_positionprefix = l_counter
						positionprefix = counter;
//						END IF		
					}
					break;


				case "H":
//					WHEN "H"        ## Set 'HLR' details
//						LET l_lengthhlr = l_lengthhlr + 1
					lengthhlr++;
					if(lengthhlr== 1) {
//						IF l_lengthhlr = 1 THEN
//							LET l_containhlr  = "Y"
						containhlr = "Y";
//							LET l_positionhlr = l_counter
						positionhlr = counter;
//						END IF	
					}
					break;

				case "9":
//					WHEN "9"        ## Set 'Number' details
//						LET l_lengthnumber = l_lengthnumber + 1
					lengthnumber++;
					if(lengthnumber == 1) {
//						IF l_lengthnumber = 1 THEN
//							LET l_positionnumber = l_counter
						positionnumber = counter;
//						END IF	
					}
					break;

				case "Z":
//					WHEN "Z"        ## Set 'Zeros' details
//					LET l_lengthzeros = l_lengthzeros + 1
					lengthzeros++;
					if(lengthzeros == 1) {
//					IF l_lengthzeros = 1 THEN
//						LET l_containzeros  = "Y"
						containzeros = "Y";
//						LET l_positionzeros = l_counter
						positionzeros = counter;
//					END IF
					}
					break;

				default:
//					OTHERWISE       ## Invalid character in MASK
//					LET l_message = "MSISDN mask ", p_mask CLIPPED, " ","contains invalid characters"
					logger.error("\nMSISDN mask " + mask + " ,contains invalid characters");
					throw new EPPIXSeriousException("MSISDN mask " + mask + " ,contains invalid characters");
//					CALL Error_BusinessError(122043, "", l_message, l_function)
//					EXIT FOR
			}
//				END CASE
//			END FOR
			counter++;
		}

//			IF g_status_class != 0 THEN
//				CALL RollbackTransaction ("Msisdn_Format")
//			ELSE
//				CALL CommitTransaction ("Msisdn_Format")
//			END IF

//			RETURN  l_msisdnlength, l_containprefix, l_positionprefix, l_lengthprefix,
//					l_containhlr, l_positionhlr, l_lengthhlr, l_positionnumber,
//					l_lengthnumber, l_containzeros, l_lengthzeros, l_positionzeros
		Object[] values = new Object[] {msisdnlength, containprefix, positionprefix, lengthprefix, containhlr, positionhlr, lengthhlr, positionnumber, lengthnumber, containzeros, lengthzeros, positionzeros};
		return values;

//		END FUNCTION
		
	}

}