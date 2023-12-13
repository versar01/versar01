package com.eppixcomm.eppix.base.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;
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

public class FntNetTransPendDMO extends DBO implements Serializable {

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
			FIELD_TYPE_INTEGER /* std public attribute: fnt_serial_id*/,
			FIELD_TYPE_STRING /* std public attribute: fnt_command */,
			FIELD_TYPE_INTEGER /* std public attribute: fnt_send_seq */,
			FIELD_TYPE_STRING /* std public attribute: fnt_tran_type */,
			FIELD_TYPE_INTEGER /* std public attribute: fnt_subscriber_id */,
			FIELD_TYPE_STRING /* std public attribute: fnt_old_value */,
			FIELD_TYPE_STRING /* std public attribute: fnt_new_value */,
			FIELD_TYPE_STRING /* std public attribute: fnt_service_code */,
			FIELD_TYPE_STRING /* std public attribute: fnt_status */,
			FIELD_TYPE_DATETIME /* std public attribute: fnt_timestamp */
	};

	/**
	 * TODO SJ Implement the array of field sizes Not implemented as it is not a
	 * MTN table
	 */
	private final int[] fieldSizes = new int[] {
			0,
			fntCommandSize,
			0,
			fntTranTypeSize,
			0,
			fntOldValueSize,
			fntNewValueSize,
			fntServiceCodeSize,
			fntStatusSize,
			0
	};

	public int[] fieldSizes() {
		return fieldSizes;
	}

	/**
	 * Unique field index used for Filtering.
	 * 
	 * @see com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int fntSerialIdFilter = 0; // filter index

	/**
	 * Unique field index used for Filtering.
	 * 
	 * @see com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int fntCommandFilter = 1; // filter index
	private static final int fntCommandSize = 16; // field size

	/**
	 * Unique field index used for Filtering.
	 * 
	 * @see com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int fntSendSeqFilter = 2; // filter index

	/**
	 * Unique field index used for Filtering.
	 * 
	 * @see com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int fntTranTypeFilter = 3; // filter index
	private static final int fntTranTypeSize = 2; // field size

	/**
	 * Unique field index used for Filtering.
	 * 
	 * @see com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int fntSubscriberIdFilter = 4; // filter index

	/**
	 * Unique field index used for Filtering.
	 * 
	 * @see com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int fntOldValueFilter = 5; // filter index
	private static final int fntOldValueSize = 20; // field size

	/**
	 * Unique field index used for Filtering.
	 * 
	 * @see com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int fntNewValueFilter = 6; // filter index
	private static final int fntNewValueSize = 20; // field size

	/**
	 * Unique field index used for Filtering.
	 * 
	 * @see com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int fntServiceCodeFilter = 7; // filter index
	private static final int fntServiceCodeSize = 4; // field size

	/**
	 * Unique field index used for Filtering.
	 * 
	 * @see com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int fntStatusFilter = 8; // filter index
	private static final int fntStatusSize = 1; // field size

	/**
	 * Unique field index used for Filtering.
	 * 
	 * @see com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int fntTimestampFilter = 9; // filter index

	// ---------------------
	// Field declarations
	// ---------------------
	// all attributes
	private Integer fntSerialId;
	private String fntCommand;
	private Integer fntSendSeq;
	private String fntTranType;
	private Integer fntSubscriberId;
	private String fntOldValue;
	private String fntNewValue; // Loaded from Schema
	private String fntServiceCode; // Loaded from Schema
	private String fntStatus; // Loaded from Schema
	private DateTime fntTimestamp; // Loaded from Schema

	// ~ Constructors
	// ///////////////////////////////////////////////////////////
	
	public FntNetTransPendDMO() {
	}

	// Constructor - taking public attributes
	/**
	 * Creates a new FntNetTransendDMO object.
	 * 
	 * @param fntSerialId
	 *            DOCUMENT ME!
	 * @param fntCommand
	 *            DOCUMENT ME!
	 * @param fntSendSeq
	 *            DOCUMENT ME!
	 * @param fntTranType
	 *            DOCUMENT ME!
	 * @param fntSubscriberId
	 *            DOCUMENT ME!
	 * @param fntOldValue
	 *            DOCUMENT ME!
	 * @param fntNewValue
	 *            DOCUMENT ME!
	 * @param fntServiceCode
	 *            DOCUMENT ME!
	 * @param fntStatus
	 *            DOCUMENT ME!
	 * @param fntTimestamp
	 *            DOCUMENT ME!
	 */
	public FntNetTransPendDMO(final Integer fntSerialId, final String fntCommand,
			final Integer fntSendSeq, final String fntTranType,
			final Integer fntSubscriberId, final String fntOldValue,
			final String fntNewValue, final String fntServiceCode,
			final String fntStatus, final DateTime fntTimestamp) {

		this.fntSerialId = fntSerialId;

		this.fntCommand = fntCommand;

		this.fntSendSeq = fntSendSeq;

		this.fntTranType = fntTranType;

		this.fntSubscriberId = fntSubscriberId;

		this.fntOldValue = fntOldValue;

		this.fntNewValue = fntNewValue;

		this.fntServiceCode = fntServiceCode;

		this.fntStatus = fntStatus;

		this.fntTimestamp = (fntTimestamp != null) ? new DateTime(
				fntTimestamp) : null;
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
		return new DAOArgs(1).arg(this.fntSerialId);
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
				fntSerialId,
						// trimmed to fit, if required.
				(fntCommand == null) ? null
						: ((fntCommand.length() <= fntCommandSize) ? fntCommand
								: fntCommand.substring(0, fntCommandSize)),
				fntSendSeq,
				(fntTranType == null) ? null
						: ((fntTranType.length() <= fntTranTypeSize) ? fntTranType
								: fntTranType.substring(0, fntTranTypeSize)),
				fntSubscriberId,
				(fntOldValue == null) ? null
						: ((fntOldValue.length() <= fntOldValueSize) ? fntOldValue
								: fntOldValue.substring(0, fntOldValueSize)),
				(fntNewValue == null) ? null
						: ((fntNewValue.length() <= fntNewValueSize) ? fntNewValue
								: fntNewValue.substring(0, fntNewValueSize)),
				(fntServiceCode == null) ? null
						: ((fntServiceCode.length() <= fntServiceCodeSize) ? fntServiceCode
								: fntServiceCode.substring(0,
										fntServiceCodeSize)),
				(fntStatus == null) ? null
						: ((fntStatus.length() <= fntStatusSize) ? fntStatus
								: fntStatus.substring(0, fntStatusSize)),
				fntTimestamp

		};
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @param fields
	 *            DOCUMENT ME!
	 */
	protected void set(final Object[] fields) {
		fntSerialId = (Integer) fields[0];
		fntCommand = rtrim((String) fields[1]);
		fntSendSeq = (Integer) fields[2];
		fntTranType = rtrim((String) fields[3]);
		fntSubscriberId = (Integer) fields[4];
		fntOldValue = rtrim((String) fields[5]);
		fntNewValue = rtrim((String) fields[6]);
		fntServiceCode = rtrim((String) fields[7]);
		fntStatus = rtrim((String) fields[8]);
		fntTimestamp = (DateTime) fields[9];
	}

	//
	// Master setter follows...
	//

	/**
	 * Setter that takes all attributes
	 */
	public void set(final Integer fntSerialId, final String fntCommand,
			final Integer fntSendSeq, final String fntTranType,
			final Integer fntSubscriberId, final String fntOldValue,
			final String fntNewValue, final String fntServiceCode,
			final String fntStatus, final DateTime fntTimestamp) {
		this.fntSerialId = fntSerialId;
		this.fntCommand = fntCommand;
		this.fntSendSeq = fntSendSeq;
		this.fntTranType = fntTranType;
		this.fntSubscriberId = fntSubscriberId;
		this.fntOldValue = fntOldValue;
		this.fntNewValue = fntNewValue;
		this.fntServiceCode = fntServiceCode;
		this.fntStatus = fntStatus;
		this.fntTimestamp = (fntTimestamp != null) ? new DateTime(
				fntTimestamp) : null;
	}

	public Integer getFntSerialId() {
		return fntSerialId;
	}

	public void setFntSerialId(Integer fntSerialId) {
		this.fntSerialId = fntSerialId;
	}

	public String getFntCommand() {
		return fntCommand;
	}

	public void setFntCommand(String fntCommand) {
		this.fntCommand = fntCommand;
	}

	public Integer getFntSendSeq() {
		return fntSendSeq;
	}

	public void setFntSendSeq(Integer fntSendSeq) {
		this.fntSendSeq = fntSendSeq;
	}

	public String getFntTranType() {
		return fntTranType;
	}

	public void setFntTranType(String fntTranType) {
		this.fntTranType = fntTranType;
	}

	public Integer getFntSubscriberId() {
		return fntSubscriberId;
	}

	public void setFntSubscriberId(Integer fntSubscriberId) {
		this.fntSubscriberId = fntSubscriberId;
	}

	public String getFntOldValue() {
		return fntOldValue;
	}

	public void setFntOldValue(String fntOldValue) {
		this.fntOldValue = fntOldValue;
	}

	public String getFntNewValue() {
		return fntNewValue;
	}

	public void setFntNewValue(String fntNewValue) {
		this.fntNewValue = fntNewValue;
	}

	public String getFntServiceCode() {
		return fntServiceCode;
	}

	public void setFntServiceCode(String fntServiceCode) {
		this.fntServiceCode = fntServiceCode;
	}

	public String getFntStatus() {
		return fntStatus;
	}

	public void setFntStatus(String fntStatus) {
		this.fntStatus = fntStatus;
	}

	public DateTime getFntTimestamp() {
		return fntTimestamp;
	}

	public void setFntTimestamp(DateTime fntTimestamp) {
		this.fntTimestamp = fntTimestamp;
	}
}