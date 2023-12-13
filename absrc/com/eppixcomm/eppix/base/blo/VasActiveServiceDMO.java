package com.eppixcomm.eppix.base.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;
import com.eppixcomm.eppix.common.util.Date;

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

public class VasActiveServiceDMO extends DBO implements Serializable {

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
			FIELD_TYPE_INTEGER /* std public attribute: vas_subscriber_id */,
			FIELD_TYPE_STRING /* std public attribute: vas_service_code */,
			FIELD_TYPE_STRING /* std public attribute: vas_intern_tariff */,
			FIELD_TYPE_STRING /* std public attribute: vas_service_type */,
			FIELD_TYPE_DATE /* std public attribute: vas_act_date */,
			FIELD_TYPE_DATE /* std public attribute: vas_deact_date */,
			FIELD_TYPE_STRING /* std public attribute: vas_sub_charge1 */,
			FIELD_TYPE_STRING /* std public attribute: vas_sub_charge2 */,
			FIELD_TYPE_STRING /* std public attribute: vas_sub_charge3 */,
			FIELD_TYPE_SHORT /* std public attribute: vas_twinbill_no */,
			FIELD_TYPE_STRING /* std public attribute: vas_multi_charge */
	};

	/**
	 * TODO SJ Implement the array of field sizes Not implemented as it is not a
	 * MTN table
	 */
	private final int[] fieldSizes = new int[] { 0, vasServiceCodeSize,
			vasInternTariffSize, vasServiceTypeSize, 0, 0, vasSubCharge1Size,
			vasSubCharge2Size, vasSubCharge3Size, 0, vasMultiChargeSize };

	public int[] fieldSizes() {
		return fieldSizes;
	}

	/**
	 * Unique field index used for Filtering.
	 * 
	 * @see com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int vasSubscriberIdFilter = 0; // filter index

	/**
	 * Unique field index used for Filtering.
	 * 
	 * @see com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int vasServiceCodeFilter = 1; // filter index
	private static final int vasServiceCodeSize = 4; // field size

	/**
	 * Unique field index used for Filtering.
	 * 
	 * @see com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int vasInternTariffFilter = 2; // filter index
	private static final int vasInternTariffSize = 20; // field size

	/**
	 * Unique field index used for Filtering.
	 * 
	 * @see com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int vasServiceTypeFilter = 3; // filter index
	private static final int vasServiceTypeSize = 5; // field size

	/**
	 * Unique field index used for Filtering.
	 * 
	 * @see com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int vasActDateFilter = 4; // filter index

	/**
	 * Unique field index used for Filtering.
	 * 
	 * @see com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int vasDeactDateFilter = 5; // filter index

	/**
	 * Unique field index used for Filtering.
	 * 
	 * @see com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int vasSubCharge1Filter = 6; // filter index
	private static final int vasSubCharge1Size = 5; // field size

	/**
	 * Unique field index used for Filtering.
	 * 
	 * @see com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int vasSubCharge2Filter = 7; // filter index
	private static final int vasSubCharge2Size = 5; // field size

	/**
	 * Unique field index used for Filtering.
	 * 
	 * @see com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int vasSubCharge3Filter = 8; // filter index
	private static final int vasSubCharge3Size = 5; // field size

	/**
	 * Unique field index used for Filtering.
	 * 
	 * @see com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int vasTwinbillNoFilter = 9; // filter index

	/**
	 * Unique field index used for Filtering.
	 * 
	 * @see com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int vasMultiChargeFilter = 10; // filter index
	private static final int vasMultiChargeSize = 5; // field size

	// ---------------------
	// Field declarations
	// ---------------------
	// all attributes
	private Integer vasSubscriberId;
	private String vasServiceCode;
	private String vasInternTariff;
	private String vasServiceType;
	private Date vasActDate;
	private Date vasDeactDate;
	private String vasSubCharge1; // Loaded from Schema
	private String vasSubCharge2; // Loaded from Schema
	private String vasSubCharge3; // Loaded from Schema
	private Short vasTwinbillNo; // Loaded from Schema
	private String vasMultiCharge;

	// ~ Constructors
	// ///////////////////////////////////////////////////////////

	public VasActiveServiceDMO() {
	}

	// Constructor - taking public attributes
	/**
	 * Creates a new FntNetTransendDMO object.
	 */
	public VasActiveServiceDMO(final Integer vasSubscriberId,
			final String vasServiceCode, final String vasInternTariff,
			final String vasServiceType, final Date vasActDate,
			final Date vasDeactDate, final String vasSubCharge1,
			final String vasSubCharge2, final String vasSubCharge3,
			final Short vasTwinbillNo, final String vasMultiCharge) {

		this.vasSubscriberId = vasSubscriberId;
		this.vasServiceCode = vasServiceCode;
		this.vasInternTariff = vasInternTariff;
		this.vasServiceType = vasServiceType;
		this.vasActDate = (vasActDate != null) ? new Date(vasActDate) : null;
		this.vasDeactDate = (vasDeactDate != null) ? new Date(vasDeactDate)
				: null;
		this.vasSubCharge1 = vasSubCharge1;
		this.vasSubCharge2 = vasSubCharge2;
		this.vasSubCharge3 = vasSubCharge3;
		this.vasTwinbillNo = vasTwinbillNo;
		this.vasMultiCharge = vasMultiCharge;
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
		return new DAOArgs(3).arg(this.getVasSubscriberId()).arg(this.getVasServiceCode()).arg(this.getVasInternTariff());
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
				vasSubscriberId,
				(vasServiceCode == null) ? null
						: ((vasServiceCode.length() <= vasServiceCodeSize) ? vasServiceCode
								: vasServiceCode.substring(0,
										vasServiceCodeSize)),
				(vasInternTariff == null) ? null
						: ((vasInternTariff.length() <= vasInternTariffSize) ? vasInternTariff
								: vasInternTariff.substring(0,
										vasInternTariffSize)),
				(vasServiceType == null) ? null
						: ((vasServiceType.length() <= vasServiceTypeSize) ? vasServiceType
								: vasServiceType.substring(0,
										vasServiceTypeSize)),
				vasActDate,
				vasDeactDate,
				(vasSubCharge1 == null) ? null
						: ((vasSubCharge1.length() <= vasSubCharge1Size) ? vasSubCharge1
								: vasSubCharge1.substring(0, vasSubCharge1Size)),
				(vasSubCharge2 == null) ? null
						: ((vasSubCharge2.length() <= vasSubCharge2Size) ? vasSubCharge2
								: vasSubCharge2.substring(0, vasSubCharge2Size)),
				(vasSubCharge3 == null) ? null
						: ((vasSubCharge3.length() <= vasSubCharge3Size) ? vasSubCharge3
								: vasSubCharge3.substring(0, vasSubCharge3Size)),
				vasTwinbillNo,

				(vasMultiCharge == null) ? null
						: ((vasMultiCharge.length() <= vasMultiChargeSize) ? vasMultiCharge
								: vasMultiCharge.substring(0,
										vasMultiChargeSize))

		};
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @param fields
	 *            DOCUMENT ME!
	 */
	protected void set(final Object[] fields) {
		vasSubscriberId = (Integer) fields[0];
		vasServiceCode = rtrim((String) fields[1]);
		vasInternTariff = rtrim((String) fields[2]);
		vasServiceType = rtrim((String) fields[3]);
		vasActDate = (fields[4] == null)? null : new Date(fields[4]);
		vasDeactDate = (fields[5] == null)? null : new Date(fields[5]);
		vasSubCharge1 = rtrim((String) fields[6]);
		vasSubCharge2 = rtrim((String) fields[7]);
		vasSubCharge3 = rtrim((String) fields[8]);
		vasTwinbillNo = (Short) fields[9];
		vasMultiCharge = rtrim((String) fields[10]);
	}

	//
	// Master setter follows...
	//

	/**
	 * Setter that takes all attributes
	 */
	public void set(final Integer vasSubscriberId, final String vasServiceCode,
			final String vasInternTariff, final String vasServiceType,
			final Date vasActDate, final Date vasDeactDate,
			final String vasSubCharge1, final String vasSubCharge2,
			final String vasSubCharge3, final Short vasTwinbillNo,
			final String vasMultiCharge) {

		this.vasSubscriberId = vasSubscriberId;
		this.vasServiceCode = vasServiceCode;
		this.vasInternTariff = vasInternTariff;
		this.vasServiceType = vasServiceType;
		this.vasActDate = (vasActDate != null) ? new Date(vasActDate) : null;
		this.vasDeactDate = (vasDeactDate != null) ? new Date(vasDeactDate)
				: null;
		this.vasSubCharge1 = vasSubCharge1;
		this.vasSubCharge2 = vasSubCharge2;
		this.vasSubCharge3 = vasSubCharge3;
		this.vasTwinbillNo = vasTwinbillNo;
		this.vasMultiCharge = vasMultiCharge;
	}

	public Integer getVasSubscriberId() {
		return vasSubscriberId;
	}

	public void setVasSubscriberId(Integer vasSubscriberId) {
		this.vasSubscriberId = vasSubscriberId;
	}

	public String getVasServiceCode() {
		return vasServiceCode;
	}

	public void setVasServiceCode(String vasServiceCode) {
		this.vasServiceCode = vasServiceCode;
	}

	public String getVasInternTariff() {
		return vasInternTariff;
	}

	public void setVasInternTariff(String vasInternTariff) {
		this.vasInternTariff = vasInternTariff;
	}

	public String getVasServiceType() {
		return vasServiceType;
	}

	public void setVasServiceType(String vasServiceType) {
		this.vasServiceType = vasServiceType;
	}

	public Date getVasActDate() {
		return vasActDate;
	}

	public void setVasActDate(Date vasActDate) {
		this.vasActDate = vasActDate;
	}

	public Date getVasDeactDate() {
		return vasDeactDate;
	}

	public void setVasDeactDate(Date vasDeactDate) {
		this.vasDeactDate = vasDeactDate;
	}

	public String getVasSubCharge1() {
		return vasSubCharge1;
	}

	public void setVasSubCharge1(String vasSubCharge1) {
		this.vasSubCharge1 = vasSubCharge1;
	}

	public String getVasSubCharge2() {
		return vasSubCharge2;
	}

	public void setVasSubCharge2(String vasSubCharge2) {
		this.vasSubCharge2 = vasSubCharge2;
	}

	public String getVasSubCharge3() {
		return vasSubCharge3;
	}

	public void setVasSubCharge3(String vasSubCharge3) {
		this.vasSubCharge3 = vasSubCharge3;
	}

	public Short getVasTwinbillNo() {
		return vasTwinbillNo;
	}

	public void setVasTwinbillNo(Short vasTwinbillNo) {
		this.vasTwinbillNo = vasTwinbillNo;
	}

	public String getVasMultiCharge() {
		return vasMultiCharge;
	}

	public void setVasMultiCharge(String vasMultiCharge) {
		this.vasMultiCharge = vasMultiCharge;
	}
}