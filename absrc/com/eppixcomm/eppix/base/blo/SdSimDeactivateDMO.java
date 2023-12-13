package com.eppixcomm.eppix.base.blo;

import java.io.Serializable;

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

public class SdSimDeactivateDMO extends DBO implements Serializable {

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
	private static final int[] fieldTypes = new int[] {
			FIELD_TYPE_INTEGER /* std public attribute: sd_subscriber_id */,
			FIELD_TYPE_STRING /* std public attribute: sd_handset_no */,
			FIELD_TYPE_STRING /* std public attribute: sd_sim_no */,
			FIELD_TYPE_STRING /* std public attribute: sd_trans_status */,
			FIELD_TYPE_STRING /* std public attribute: sd_stat_code */,
			FIELD_TYPE_DATE /* std public attribute: sd_dconnect_date */,
			FIELD_TYPE_DATE /* std public attribute: sd_prorata_to_date */,
			FIELD_TYPE_STRING /* std public attribute: sd_reason */,
			FIELD_TYPE_STRING /* std public attribute: sd_letter_type */,
			FIELD_TYPE_STRING /* std public attribute: sd_discon_charge1 */,
			FIELD_TYPE_STRING /* std public attribute: sd_discon_charge2 */,
			FIELD_TYPE_STRING /* std public attribute: sd_discon_charge3 */,
			FIELD_TYPE_STRING /* std public attribute: sd_discon_charge4 */,
			FIELD_TYPE_STRING /* std public attribute: sd_discon_charge5 */,
			FIELD_TYPE_STRING /* std public attribute: sd_el_command */,
			FIELD_TYPE_DATETIME /* std public attribute: sd_eppix_stamp */,
			FIELD_TYPE_DATETIME /* std public attribute: sd_n2n_stamp */,
			FIELD_TYPE_STRING /* std public attribute: sd_error_comment */
	};

	/**
	 * TODO SJ Implement the array of field sizes Not implemented as it is not a
	 * MTN table
	 */
	private final int[] fieldSizes = new int[] { 0, sdHandsetNoSize,
			sdSimNoSize, sdTransStatusSize, sdStatCodeSize, 0, 0, sdReasonSize,
			sdLetterTypeSize, sdDisconCharge1Size, sdDisconCharge2Size,
			sdDisconCharge3Size, sdDisconCharge4Size, sdDisconCharge5Size,
			sdElCommandSize, 0, 0, sdErrorCommentSize };

	public int[] fieldSizes() {
		return fieldSizes;
	}

	/**
	 * Unique field index used for Filtering.
	 * 
	 * @see com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int sdSubscriberIdFilter = 0; // filter index

	/**
	 * Unique field index used for Filtering.
	 * 
	 * @see com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int sdHandsetNoFilter = 1; // filter index
	private static final int sdHandsetNoSize = 15; // field size

	/**
	 * Unique field index used for Filtering.
	 * 
	 * @see com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int sdSimNoFilter = 2; // filter index
	private static final int sdSimNoSize = 14; // field size

	/**
	 * Unique field index used for Filtering.
	 * 
	 * @see com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int sdTransStatusFilter = 3; // filter index
	private static final int sdTransStatusSize = 1; // field size

	/**
	 * Unique field index used for Filtering.
	 * 
	 * @see com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int sdStatCodeFilter = 4; // filter index
	private static final int sdStatCodeSize = 1; // field size

	/**
	 * Unique field index used for Filtering.
	 * 
	 * @see com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int sdDconnectDateFilter = 5; // filter index

	/**
	 * Unique field index used for Filtering.
	 * 
	 * @see com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int sdProrataToDateFilter = 6; // filter index

	/**
	 * Unique field index used for Filtering.
	 * 
	 * @see com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int sdReasonFilter = 7; // filter index
	private static final int sdReasonSize = 4; // field size

	/**
	 * Unique field index used for Filtering.
	 * 
	 * @see com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int sdLetterTypeFilter = 8; // filter index
	private static final int sdLetterTypeSize = 5; // field size

	/**
	 * Unique field index used for Filtering.
	 * 
	 * @see com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int sdDisconCharge1Filter = 9; // filter index
	private static final int sdDisconCharge1Size = 5; // field size

	/**
	 * Unique field index used for Filtering.
	 * 
	 * @see com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int sdDisconCharge2Filter = 10; // filter index
	private static final int sdDisconCharge2Size = 5; // field size

	/**
	 * Unique field index used for Filtering.
	 * 
	 * @see com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int sdDisconCharge3Filter = 11; // filter index
	private static final int sdDisconCharge3Size = 5; // field size

	/**
	 * Unique field index used for Filtering.
	 * 
	 * @see com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int sdDisconCharge4Filter = 12; // filter index
	private static final int sdDisconCharge4Size = 5; // field size

	/**
	 * Unique field index used for Filtering.
	 * 
	 * @see com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int sdDisconCharge5Filter = 13; // filter index
	private static final int sdDisconCharge5Size = 5; // field size

	/**
	 * Unique field index used for Filtering.
	 * 
	 * @see com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int sdElCommandFilter = 14; // filter index
	private static final int sdElCommandSize = 5; // field size

	/**
	 * Unique field index used for Filtering.
	 * 
	 * @see com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int sdEppixStampFilter = 15; // filter index

	/**
	 * Unique field index used for Filtering.
	 * 
	 * @see com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int sdN2nStampFilter = 16; // filter index

	/**
	 * Unique field index used for Filtering.
	 * 
	 * @see com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int sdErrorCommentFilter = 17; // filter index
	private static final int sdErrorCommentSize = 5; // field size

	// ---------------------
	// Field declarations
	// ---------------------
	// all attributes
	private Integer sdSubscriberId;
	private String sdHandsetNo;
	private String sdSimNo;
	private String sdTransStatus;
	private String sdStatCode;
	private Date sdDconnectDate;
	private Date sdProrataToDate;
	private String sdReason;
	private String sdLetterType;
	private String sdDisconCharge1;
	private String sdDisconCharge2;
	private String sdDisconCharge3;
	private String sdDisconCharge4;
	private String sdDisconCharge5;
	private String sdElCommand;
	private DateTime sdEppixStamp;
	private DateTime sdN2nStamp;
	private String sdErrorComment;

	// ~ Constructors
	// ///////////////////////////////////////////////////////////

	public SdSimDeactivateDMO() {
	}

	// Constructor - taking public attributes
	/**
	 * Creates a new SdSimDeactivateDMO object.
	 */
	public SdSimDeactivateDMO(final Integer sdSubscriberId,
			final String sdHandsetNo, final String sdSimNo,
			final String sdTransStatus, final String sdStatCode,
			final Date sdDconnectDate, final Date sdProrataToDate,
			final String sdReason, final String sdLetterType,
			final String sdDisconCharge1, final String sdDisconCharge2,
			final String sdDisconCharge3, final String sdDisconCharge4,
			final String sdDisconCharge5, final String sdElCommand,
			final DateTime sdEppixStamp, final DateTime sdN2nStamp,
			final String sdErrorComment) {

		this.sdSubscriberId = sdSubscriberId;
		this.sdHandsetNo = sdHandsetNo;
		this.sdSimNo = sdSimNo;
		this.sdTransStatus = sdTransStatus;
		this.sdStatCode = sdStatCode;
		this.sdDconnectDate = (sdDconnectDate != null) ? new Date(
				sdDconnectDate) : null;
		this.sdProrataToDate = (sdProrataToDate != null) ? new Date(
				sdProrataToDate) : null;
		this.sdReason = sdReason;
		this.sdLetterType = sdLetterType;
		this.sdDisconCharge1 = sdDisconCharge1;
		this.sdDisconCharge2 = sdDisconCharge2;
		this.sdDisconCharge3 = sdDisconCharge3;
		this.sdDisconCharge4 = sdDisconCharge4;
		this.sdDisconCharge5 = sdDisconCharge5;
		this.sdElCommand = sdElCommand;
		this.sdEppixStamp = (sdEppixStamp != null) ? new DateTime(sdEppixStamp)
				: null;
		this.sdN2nStamp = (sdN2nStamp != null) ? new DateTime(sdN2nStamp)
				: null;
		this.sdErrorComment = sdErrorComment;

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
		return null;//new DAOArgs(0);
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
				sdSubscriberId, // trimmed to fit, if required.
				(sdHandsetNo == null) ? null
						: ((sdHandsetNo.length() <= sdHandsetNoSize) ? sdHandsetNo
								: sdHandsetNo.substring(0, sdHandsetNoSize)),
				// trimmed to fit, if required.
				(sdSimNo == null) ? null
						: ((sdSimNo.length() <= sdSimNoSize) ? sdSimNo
								: sdSimNo.substring(0, sdSimNoSize)),
				// trimmed to fit, if required.
				(sdTransStatus == null) ? null
						: ((sdTransStatus.length() <= sdTransStatusSize) ? sdTransStatus
								: sdTransStatus.substring(0, sdTransStatusSize)),
				(sdStatCode == null) ? null
						: ((sdStatCode.length() <= sdStatCodeSize) ? sdStatCode
								: sdStatCode.substring(0, sdStatCodeSize)),
				// trimmed to fit, if required.
				sdDconnectDate,
				sdProrataToDate,
				(sdReason == null) ? null
						: ((sdReason.length() <= sdReasonSize) ? sdReason
								: sdReason.substring(0, sdReasonSize)),
				(sdLetterType == null) ? null
						: ((sdLetterType.length() <= sdLetterTypeSize) ? sdLetterType
								: sdLetterType.substring(0, sdLetterTypeSize)),
				(sdDisconCharge1 == null) ? null
						: ((sdDisconCharge1.length() <= sdDisconCharge1Size) ? sdDisconCharge1
								: sdDisconCharge1.substring(0,
										sdDisconCharge1Size)),
				(sdDisconCharge2 == null) ? null
						: ((sdDisconCharge2.length() <= sdDisconCharge2Size) ? sdDisconCharge2
								: sdDisconCharge2.substring(0,
										sdDisconCharge2Size)),
				(sdDisconCharge3 == null) ? null
						: ((sdDisconCharge3.length() <= sdDisconCharge3Size) ? sdDisconCharge3
								: sdDisconCharge3.substring(0,
										sdDisconCharge3Size)),
				(sdDisconCharge4 == null) ? null
						: ((sdDisconCharge4.length() <= sdDisconCharge4Size) ? sdDisconCharge4
								: sdDisconCharge4.substring(0,
										sdDisconCharge4Size)),
				(sdDisconCharge5 == null) ? null
						: ((sdDisconCharge5.length() <= sdDisconCharge5Size) ? sdDisconCharge5
								: sdDisconCharge5.substring(0,
										sdDisconCharge5Size)),
				(sdElCommand == null) ? null
						: ((sdElCommand.length() <= sdElCommandSize) ? sdElCommand
								: sdElCommand.substring(0, sdElCommandSize)),
				sdEppixStamp,
				sdN2nStamp,
				(sdErrorComment == null) ? null
						: ((sdErrorComment.length() <= sdErrorCommentSize) ? sdErrorComment
								: sdErrorComment.substring(0,
										sdErrorCommentSize)),

		};
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @param fields
	 *            DOCUMENT ME!
	 */
	protected void set(final Object[] fields) {
		sdSubscriberId = (Integer) fields[0];
		sdHandsetNo = rtrim((String) fields[1]);
		sdSimNo = rtrim((String) fields[2]);
		sdTransStatus = rtrim((String) fields[3]);
		sdStatCode = rtrim((String) fields[4]);
		sdDconnectDate = (new Date(fields[5]));
		sdProrataToDate = (new Date(fields[6]));
		sdReason = rtrim((String) fields[7]);
		sdLetterType = rtrim((String) fields[8]);
		sdDisconCharge1 = rtrim((String) fields[9]);
		sdDisconCharge2 = rtrim((String) fields[10]);
		sdDisconCharge3 = rtrim((String) fields[11]);
		sdDisconCharge4 = rtrim((String) fields[12]);
		sdDisconCharge5 = rtrim((String) fields[13]);
		sdElCommand = rtrim((String) fields[14]);
		sdEppixStamp = (DateTime) fields[15];
		sdN2nStamp = (DateTime) fields[16];
		sdErrorComment = rtrim((String) fields[17]);

	}

	//
	// Master setter follows...
	//

	/**
	 * Setter that takes all attributes
	 */
	public void set(final Integer sdSubscriberId, final String sdHandsetNo,
			final String sdSimNo, final String sdTransStatus,
			final String sdStatCode, final Date sdDconnectDate,
			final Date sdProrataToDate, final String sdReason,
			final String sdLetterType, final String sdDisconCharge1,
			final String sdDisconCharge2, final String sdDisconCharge3,
			final String sdDisconCharge4, final String sdDisconCharge5,
			final String sdElCommand, final DateTime sdEppixStamp,
			final DateTime sdN2nStamp, final String sdErrorComment) {

		this.sdSubscriberId = sdSubscriberId;
		this.sdHandsetNo = sdHandsetNo;
		this.sdSimNo = sdSimNo;
		this.sdTransStatus = sdTransStatus;
		this.sdStatCode = sdStatCode;
		this.sdDconnectDate = (sdDconnectDate != null) ? new Date(
				sdDconnectDate) : null;
		this.sdProrataToDate = (sdProrataToDate != null) ? new Date(
				sdProrataToDate) : null;
		this.sdReason = sdReason;
		this.sdLetterType = sdLetterType;
		this.sdDisconCharge1 = sdDisconCharge1;
		this.sdDisconCharge2 = sdDisconCharge2;
		this.sdDisconCharge3 = sdDisconCharge3;
		this.sdDisconCharge4 = sdDisconCharge4;
		this.sdDisconCharge5 = sdDisconCharge5;
		this.sdElCommand = sdElCommand;
		this.sdEppixStamp = (sdEppixStamp != null) ? new DateTime(sdEppixStamp)
				: null;
		this.sdN2nStamp = (sdN2nStamp != null) ? new DateTime(sdN2nStamp)
				: null;
		this.sdErrorComment = sdErrorComment;
	}

	public Integer getSdSubscriberId() {
		return sdSubscriberId;
	}

	public void setSdSubscriberId(Integer sdSubscriberId) {
		this.sdSubscriberId = sdSubscriberId;
	}

	public String getSdHandsetNo() {
		return sdHandsetNo;
	}

	public void setSdHandsetNo(String sdHandsetNo) {
		this.sdHandsetNo = sdHandsetNo;
	}

	public String getSdSimNo() {
		return sdSimNo;
	}

	public void setSdSimNo(String sdSimNo) {
		this.sdSimNo = sdSimNo;
	}

	public String getSdTransStatus() {
		return sdTransStatus;
	}

	public void setSdTransStatus(String sdTransStatus) {
		this.sdTransStatus = sdTransStatus;
	}

	public String getSdStatCode() {
		return sdStatCode;
	}

	public void setSdStatCode(String sdStatCode) {
		this.sdStatCode = sdStatCode;
	}

	public Date getSdDconnectDate() {
		return sdDconnectDate;
	}

	public void setSdDconnectDate(Date sdDconnectDate) {
		this.sdDconnectDate = sdDconnectDate;
	}

	public Date getSdProrataToDate() {
		return sdProrataToDate;
	}

	public void setSdProrataToDate(Date sdProrataToDate) {
		this.sdProrataToDate = sdProrataToDate;
	}

	public String getSdReason() {
		return sdReason;
	}

	public void setSdReason(String sdReason) {
		this.sdReason = sdReason;
	}

	public String getSdLetterType() {
		return sdLetterType;
	}

	public void setSdLetterType(String sdLetterType) {
		this.sdLetterType = sdLetterType;
	}

	public String getSdDisconCharge1() {
		return sdDisconCharge1;
	}

	public void setSdDisconCharge1(String sdDisconCharge1) {
		this.sdDisconCharge1 = sdDisconCharge1;
	}

	public String getSdDisconCharge2() {
		return sdDisconCharge2;
	}

	public void setSdDisconCharge2(String sdDisconCharge2) {
		this.sdDisconCharge2 = sdDisconCharge2;
	}

	public String getSdDisconCharge3() {
		return sdDisconCharge3;
	}

	public void setSdDisconCharge3(String sdDisconCharge3) {
		this.sdDisconCharge3 = sdDisconCharge3;
	}

	public String getSdDisconCharge4() {
		return sdDisconCharge4;
	}

	public void setSdDisconCharge4(String sdDisconCharge4) {
		this.sdDisconCharge4 = sdDisconCharge4;
	}

	public String getSdDisconCharge5() {
		return sdDisconCharge5;
	}

	public void setSdDisconCharge5(String sdDisconCharge5) {
		this.sdDisconCharge5 = sdDisconCharge5;
	}

	public String getSdElCommand() {
		return sdElCommand;
	}

	public void setSdElCommand(String sdElCommand) {
		this.sdElCommand = sdElCommand;
	}

	public DateTime getSdEppixStamp() {
		return sdEppixStamp;
	}

	public void setSdEppixStamp(DateTime sdEppixStamp) {
		this.sdEppixStamp = sdEppixStamp;
	}

	public DateTime getSdN2nStamp() {
		return sdN2nStamp;
	}

	public void setSdN2nStamp(DateTime sdN2nStamp) {
		this.sdN2nStamp = sdN2nStamp;
	}

	public String getSdErrorComment() {
		return sdErrorComment;
	}

	public void setSdErrorComment(String sdErrorComment) {
		this.sdErrorComment = sdErrorComment;
	}
}