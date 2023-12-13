package com.eppixcomm.eppix.base.blo;

import java.io.Serializable;
import java.util.Arrays;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;
import com.eppixcomm.eppix.common.util.Date;
import com.eppixcomm.eppix.common.util.DateTime;

/*============================================================================================= *
 *
 * (c) 2007 Copyright Eppixcomm.
 * All Rights Reserved
 * Legal Information goes here.
 *
 *============================================================================================= */

/**
 * ----------------------------------------------------------------------------
 * ------------------
 * 
 * Version control details:
 * 
 * @version $Revision: $
 * @author $Author: $
 *         ------------------------------------------------------------
 *         ----------------------------------
 */

public class SfeSimFutEventDMO extends DBO implements Serializable {

	// ~ Static variables/initializers
	// //////////////////////////////////////////

	// ---------------------
	// Field type declarations
	// ---------------------
	/**
	 * Defines the internal behaviour of the fields so the internal layers can
	 * manipulate them without needing to introspect them. The order of the
	 * fields in the definition must match the actual order in this DMO.
	 */
	private static final int[] fieldTypes = new int[] { FIELD_TYPE_STRING /*
																		 * std
																		 * public
																		 * attribute
																		 * :
																		 * sfe_command
																		 */,
			FIELD_TYPE_STRING /* std public attribute: sfe_fut_event_id */,
			FIELD_TYPE_INTEGER /* std public attribute: sfe_subscriber_id */,
			FIELD_TYPE_STRING /* std public attribute: sfe_sim_no */,
			FIELD_TYPE_STRING /* std public attribute: sfe_msisdn_no */,
			FIELD_TYPE_STRING /* std public attribute: sfe_service_code */,
			FIELD_TYPE_DATE /* std public attribute: sfe_event_date */,
			FIELD_TYPE_DATETIME /* std public attribute: sfe_timestamp */,
			FIELD_TYPE_STRING /* std public attribute: sfe_error_comment */,
			FIELD_TYPE_SHORT /* std public attribute: sfe_orig_status */
	};

	/**
	 * TODO SJ Implement the array of field sizes Not implemented as it is not a
	 * MTN table
	 */
	private final int[] fieldSizes = new int[] { sfeCommandSize,
			sfeFutEventIdSize, 0, sfeSimNoSize, sfeMsisdnNoSize,
			sfeServiceCodeSize, 0, 0, sfeErrorCommentSize, 0 };

	public int[] fieldSizes() {
		return fieldSizes;
	}

	/**
	 * Unique field index used for Filtering.
	 * 
	 * @see com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int sfeCommandFilter = 0; // filter index
	private static final int sfeCommandSize = 16;

	/**
	 * Unique field index used for Filtering.
	 * 
	 * @see com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int sfeFutEventIdFilter = 1; // filter index
	private static final int sfeFutEventIdSize = 15; // field size

	/**
	 * Unique field index used for Filtering.
	 * 
	 * @see com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int sfeSubscriberIdFilter = 2; // filter index

	/**
	 * Unique field index used for Filtering.
	 * 
	 * @see com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int sfeSimNoFilter = 3; // filter index
	private static final int sfeSimNoSize = 14; // field size

	/**
	 * Unique field index used for Filtering.
	 * 
	 * @see com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int sfeMsisdnNoFilter = 4; // filter index
	private static final int sfeMsisdnNoSize = 15;

	/**
	 * Unique field index used for Filtering.
	 * 
	 * @see com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int sfeServiceCodeFilter = 5; // filter index
	private static final int sfeServiceCodeSize = 4; // field size

	/**
	 * Unique field index used for Filtering.
	 * 
	 * @see com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int sfeDventDateFilter = 6; // filter index

	/**
	 * Unique field index used for Filtering.
	 * 
	 * @see com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int sfeTimestampFilter = 7; // filter index

	/**
	 * Unique field index used for Filtering.
	 * 
	 * @see com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int sfeErrorCommentFilter = 8; // filter index
	private static final int sfeErrorCommentSize = 40; // field size

	/**
	 * Unique field index used for Filtering.
	 * 
	 * @see com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int sfeOrigStatusFilter = 9; // filter index

	// ---------------------
	// Field declarations
	// ---------------------
	// all attributes
	private String sfeCommand;
	private String sfeFutEventId;
	private Integer sfeSubscriberId;
	private String sfeSimNo;
	private String sfeMsisdnNo;
	private String sfeServiceCode;
	private Date sfeDventDate; // Loaded from Schema
	private DateTime sfeTimestamp; // Loaded from Schema
	private String sfeErrorComment; // Loaded from Schema
	private Short sfeOrigStatus; // Loaded from Schema

	// ~ Constructors
	// ///////////////////////////////////////////////////////////

	public SfeSimFutEventDMO() {
	}

	// Constructor - taking public attributes
	/**
	 * Creates a new FntNetTransendDMO object.
	 * 
	 * @param sfeCommand
	 *            DOCUMENT ME!
	 * @param sfeFutEventId
	 *            DOCUMENT ME!
	 * @param sfeSubscriberId
	 *            DOCUMENT ME!
	 * @param sfeSimNo
	 *            DOCUMENT ME!
	 * @param sfeMsisdnNo
	 *            DOCUMENT ME!
	 * @param sfeServiceCode
	 *            DOCUMENT ME!
	 * @param sfeDventDate
	 *            DOCUMENT ME!
	 * @param sfeTimestamp
	 *            DOCUMENT ME!
	 * @param sfeErrorComment
	 *            DOCUMENT ME!
	 * @param sfeOrigStatus
	 *            DOCUMENT ME!
	 */
	public SfeSimFutEventDMO(final String sfeCommand,
			final String sfeFutEventId, final Integer sfeSubscriberId,
			final String sfeSimNo, final String sfeMsisdnNo,
			final String sfeServiceCode, final Date sfeDventDate,
			final DateTime sfeTimestamp, final String sfeErrorComment,
			final Short sfeOrigStatus) {

		this.sfeCommand = sfeCommand;
		this.sfeFutEventId = sfeFutEventId;
		this.sfeSubscriberId = sfeSubscriberId;
		this.sfeSimNo = sfeSimNo;
		this.sfeMsisdnNo = sfeMsisdnNo;
		this.sfeServiceCode = sfeServiceCode;
		this.sfeDventDate = (sfeDventDate != null) ? new Date(sfeDventDate)
				: null;
		this.sfeTimestamp = (sfeTimestamp != null) ? new DateTime(sfeTimestamp)
				: null;
		this.sfeErrorComment = sfeErrorComment;
		this.sfeOrigStatus = sfeOrigStatus;
	}

	// ~ Methods
	// ////////////////////////////////////////////////////////////////

	// DBO method implementations
	// ////////////////////////////////////////////////

	/**
	 * Not used by this class.
	 * 
	 */
	protected void generatedKey(final Integer key) {
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	protected Integer versionNumber() {
		return null;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @param recordVersion
	 *            DOCUMENT ME!
	 */
	protected void versionNumber(final Integer recordVersion) {
	}

	// DMO method implementations
	// ////////////////////////////////////////////////
	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	protected DAOArgs primaryKey() {
		return new DAOArgs(3).arg(this.getSfeSimNo()).arg(this.getSfeMsisdnNo()).arg(this.getSfeServiceCode());
//		sfe_sim_no,sfe_msisdn_no,sfe_service_code
	}

	// methods for concrete classes follow...
	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	protected int[] fieldTypes() {
		return fieldTypes;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	protected Object[] get() {
		return new Object[] {
				(sfeCommand == null) ? null
						: ((sfeCommand.length() <= sfeCommandSize) ? sfeCommand
								: sfeCommand.substring(0, sfeCommandSize)),
				(sfeFutEventId == null) ? null
						: ((sfeFutEventId.length() <= sfeFutEventIdSize) ? sfeFutEventId
								: sfeFutEventId.substring(0, sfeFutEventIdSize)),
				sfeSubscriberId,
				(sfeSimNo == null) ? null
						: ((sfeSimNo.length() <= sfeSimNoSize) ? sfeSimNo
								: sfeSimNo.substring(0, sfeSimNoSize)),
				(sfeMsisdnNo == null) ? null
						: ((sfeMsisdnNo.length() <= sfeMsisdnNoSize) ? sfeMsisdnNo
								: sfeMsisdnNo.substring(0, sfeMsisdnNoSize)),
				(sfeServiceCode == null) ? null
						: ((sfeServiceCode.length() <= sfeServiceCodeSize) ? sfeServiceCode
								: sfeServiceCode.substring(0,
										sfeServiceCodeSize)),
				sfeDventDate,
				sfeTimestamp,
				(sfeErrorComment == null) ? null
						: ((sfeErrorComment.length() <= sfeErrorCommentSize) ? sfeErrorComment
								: sfeErrorComment.substring(0,
										sfeErrorCommentSize)), sfeOrigStatus

		};
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @param fields
	 *            DOCUMENT ME!
	 */
	protected void set(final Object[] fields) {
		sfeFutEventId = rtrim((String) fields[1]);
		sfeSubscriberId = (Integer) fields[2];
		sfeSimNo = rtrim((String) fields[3]);
		sfeMsisdnNo = rtrim((String) fields[4]);
		sfeServiceCode = rtrim((String) fields[5]);
		sfeDventDate = (new Date(fields[6]));
		sfeTimestamp = (DateTime)fields[7];
		sfeErrorComment = rtrim((String) fields[8]);
		sfeOrigStatus = (Short) fields[9];
	}

	//
	// Master setter follows...
	//

	/**
	 * Setter that takes all attributes
	 */
	public void set(final String sfeCommand, final String sfeFutEventId,
			final Integer sfeSubscriberId, final String sfeSimNo,
			final String sfeMsisdnNo, final String sfeServiceCode,
			final Date sfeDventDate, final DateTime sfeTimestamp,
			final String sfeErrorComment, final Short sfeOrigStatus) {

		this.sfeCommand = sfeCommand;
		this.sfeFutEventId = sfeFutEventId;
		this.sfeSubscriberId = sfeSubscriberId;
		this.sfeSimNo = sfeSimNo;
		this.sfeMsisdnNo = sfeMsisdnNo;
		this.sfeServiceCode = sfeServiceCode;
		this.sfeDventDate = (sfeDventDate != null) ? new Date(sfeDventDate)
				: null;
		this.sfeTimestamp = (sfeTimestamp != null) ? new DateTime(sfeTimestamp)
				: null;
		this.sfeErrorComment = sfeErrorComment;
		this.sfeOrigStatus = sfeOrigStatus;
	}

	public String getSfeCommand() {
		return sfeCommand;
	}

	public void setSfeCommand(String sfeCommand) {
		this.sfeCommand = sfeCommand;
	}

	public String getSfeFutEventId() {
		return sfeFutEventId;
	}

	public void setSfeFutEventId(String sfeFutEventId) {
		this.sfeFutEventId = sfeFutEventId;
	}

	public Integer getSfeSubscriberId() {
		return sfeSubscriberId;
	}

	public void setSfeSubscriberId(Integer sfeSubscriberId) {
		this.sfeSubscriberId = sfeSubscriberId;
	}

	public String getSfeSimNo() {
		return sfeSimNo;
	}

	public void setSfeSimNo(String sfeSimNo) {
		this.sfeSimNo = sfeSimNo;
	}

	public String getSfeMsisdnNo() {
		return sfeMsisdnNo;
	}

	public void setSfeMsisdnNo(String sfeMsisdnNo) {
		this.sfeMsisdnNo = sfeMsisdnNo;
	}

	public String getSfeServiceCode() {
		return sfeServiceCode;
	}

	public void setSfeServiceCode(String sfeServiceCode) {
		this.sfeServiceCode = sfeServiceCode;
	}

	public Date getSfeDventDate() {
		return sfeDventDate;
	}

	public void setSfeDventDate(Date sfeDventDate) {
		this.sfeDventDate = sfeDventDate;
	}

	public DateTime getSfeTimestamp() {
		return sfeTimestamp;
	}

	public void setSfeTimestamp(DateTime sfeTimestamp) {
		this.sfeTimestamp = sfeTimestamp;
	}

	public String getSfeErrorComment() {
		return sfeErrorComment;
	}

	public void setSfeErrorComment(String sfeErrorComment) {
		this.sfeErrorComment = sfeErrorComment;
	}

	public Short getSfeOrigStatus() {
		return sfeOrigStatus;
	}

	public void setSfeOrigStatus(Short sfeOrigStatus) {
		this.sfeOrigStatus = sfeOrigStatus;
	}

	@Override
	public String toString() {
		return "\nSfeSimFutEventDMO [\nsfeCommand=" + sfeCommand + "\nsfeFutEventId="
				+ sfeFutEventId + "\nsfeSubscriberId=" + sfeSubscriberId
				+ "\nsfeSimNo=" + sfeSimNo + "\nsfeMsisdnNo=" + sfeMsisdnNo
				+ "\nsfeServiceCode=" + sfeServiceCode + "\nsfeDventDate="
				+ sfeDventDate + "\nsfeTimestamp=" + sfeTimestamp
				+ "\nsfeErrorComment=" + sfeErrorComment + "\nsfeOrigStatus="
				+ sfeOrigStatus + "]";
	}
}