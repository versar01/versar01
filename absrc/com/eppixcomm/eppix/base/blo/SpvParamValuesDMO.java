package com.eppixcomm.eppix.base.blo;

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;

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

public class SpvParamValuesDMO extends DBO implements Serializable {

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
			FIELD_TYPE_INTEGER /* std public attribute: spv_param_id */,
			FIELD_TYPE_STRING /* std public attribute: spv_param_value */,
			FIELD_TYPE_STRING /* std public attribute: spv_act_charge */,
			FIELD_TYPE_STRING /* std public attribute: spv_charge_code */,
			FIELD_TYPE_STRING /* std public attribute: spv_default_value */,
			FIELD_TYPE_STRING /* std public attribute: spv_netwrk_code */
	};

	/**
	 * TODO SJ Implement the array of field sizes Not implemented as it is not a
	 * MTN table
	 */
	private final int[] fieldSizes = new int[] { 0, spvParamValueSize,spvActChargeSize,
			spvChargeCodeSize, spvDefaultValueSize, spvNetwrkCodeSize };

	public int[] fieldSizes() {
		return fieldSizes;
	}

	/**
	 * Unique field index used for Filtering.
	 *
	 * @see com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int spvParamIdFilter = 0; // filter index

	/**
	 * Unique field index used for Filtering.
	 *
	 * @see com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int spvParamValueFilter = 1; // filter index
	private static final int spvParamValueSize = 20; // field size


	/**
	 * Unique field index used for Filtering.
	 *
	 * @see com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int spvActChargeFilter = 2; // filter index
	private static final int spvActChargeSize = 5; // field size

	/**
	 * Unique field index used for Filtering.
	 *
	 * @see com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int spvChargeCodeFilter = 3; // filter index
	private static final int spvChargeCodeSize = 5; // field size

	/**
	 * Unique field index used for Filtering.
	 *
	 * @see com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int spvDefaultValueFilter = 4; // filter index
	private static final int spvDefaultValueSize = 1; // field size

	/**
	 * Unique field index used for Filtering.
	 *
	 * @see com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int spvNetwrkCodeFilter = 5; // filter index
	private static final int spvNetwrkCodeSize = 15; // field size

	// ---------------------
	// Field declarations
	// ---------------------
	// all attributes
	private Integer spvParamId;
	private String spvParamValue;
	private String spvActCharge;
	private String spvChargeCode;
	private String spvDefaultValue;
	private String spvNetwrkCode;

	// ~ Constructors
	// ///////////////////////////////////////////////////////////

	public SpvParamValuesDMO() {
	}

	// Constructor - taking public attributes
	/**
	 * Creates a new FntNetTransendDMO object.
	 */
	public SpvParamValuesDMO(final Integer spvParamId,
			final String spvParamValue, final String spvActCharge, final String spvChargeCode,
			final String spvDefaultValue, final String spvNetwrkCode) {

		this.spvParamId = spvParamId;
		this.spvParamValue = spvParamValue;
		this.spvActCharge = spvActCharge;
		this.spvChargeCode = spvChargeCode;
		this.spvDefaultValue = spvDefaultValue;
		this.spvNetwrkCode = spvNetwrkCode;
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
		return new DAOArgs(2).arg(this.getSpvParamId()).arg(this.getSpvParamValue());
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
				spvParamId,
				(spvParamValue == null) ? null
						: ((spvParamValue.length() <= spvParamValueSize) ? spvParamValue
								: spvParamValue.substring(0, spvParamValueSize)),
				(spvActCharge == null) ? null
						: ((spvActCharge.length() <= spvActChargeSize) ? spvActCharge
								: spvActCharge.substring(0, spvActChargeSize)),
				// trimmed to fit, if required.
				(spvChargeCode == null) ? null
						: ((spvChargeCode.length() <= spvChargeCodeSize) ? spvChargeCode
								: spvChargeCode.substring(0, spvChargeCodeSize)),
				(spvDefaultValue == null) ? null
						: ((spvDefaultValue.length() <= spvDefaultValueSize) ? spvDefaultValue
								: spvDefaultValue.substring(0,
										spvDefaultValueSize)),
				(spvNetwrkCode == null) ? null
						: ((spvNetwrkCode.length() <= spvNetwrkCodeSize) ? spvNetwrkCode
								: spvNetwrkCode.substring(0, spvNetwrkCodeSize)) };
	}

	/**
	 * DOCUMENT ME!
	 *
	 * @param fields
	 *            DOCUMENT ME!
	 */
	protected void set(final Object[] fields) {
		spvParamId = (Integer) fields[0];
		spvParamValue = rtrim((String) fields[1]);
		spvActCharge = rtrim((String) fields[2]);
		spvChargeCode = rtrim((String) fields[3]);
		spvDefaultValue = rtrim((String) fields[4]);
		spvNetwrkCode = rtrim((String) fields[5]);
	}

	//
	// Master setter follows...
	//

	/**
	 * Setter that takes all attributes
	 */
	public void set(final Integer spvParamId, final String spvParamValue, final String spvActCharge,
			final String spvChargeCode, final String spvDefaultValue,
			final String spvNetwrkCode) {

		this.spvParamId = spvParamId;
		this.spvParamValue = spvParamValue;
		this.spvActCharge = spvActCharge;
		this.spvChargeCode = spvChargeCode;
		this.spvDefaultValue = spvDefaultValue;
		this.spvNetwrkCode = spvNetwrkCode;
	}

	public Integer getSpvParamId() {
		return spvParamId;
	}

	public void setSpvParamId(Integer spvParamId) {
		this.spvParamId = spvParamId;
	}

	public String getSpvParamValue() {
		return spvParamValue;
	}

	public void setSpvParamValue(String spvParamValue) {
		this.spvParamValue = spvParamValue;
	}

	public String getSpvChargeCode() {
		return spvChargeCode;
	}

	public void setSpvChargeCode(String spvChargeCode) {
		this.spvChargeCode = spvChargeCode;
	}

	public String getSpvDefaultValue() {
		return spvDefaultValue;
	}

	public void setSpvDefaultValue(String spvDefaultValue) {
		this.spvDefaultValue = spvDefaultValue;
	}

	public String getSpvNetwrkCode() {
		return spvNetwrkCode;
	}

	public void setSpvNetwrkCode(String spvNetwrkCode) {
		this.spvNetwrkCode = spvNetwrkCode;
	}

	public String getSpvActCharge() {
		return spvActCharge;
	}

	public void setSpvActCharge(String spvActCharge) {
		this.spvActCharge = spvActCharge;
	}

}