package com.eppixcomm.eppix.base.blo;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;
import com.eppixcomm.eppix.common.util.FilterOp;
import com.eppixcomm.eppix.common.util.FilterPart;

//---------------------
// imports
//---------------------
import com.eppixcomm.eppix.common.util.QueryFilter;
import com.eppixcomm.eppix.common.util.Date;
import com.eppixcomm.eppix.common.util.DateTime;
import com.eppixcomm.eppix.common.util.Time;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

//---------------------
// class javadoc
//---------------------
/**
 * A value object to carry the data for a PsdParamServDet.
 * 
 * 
 * <H3>A PsdParamServDet is:</H3>
 * 
 * <!-- indent text -->
 * <TABLE BORDER="0" CELLPADDING="0" CELLSPACING="0">
 * <TR>
 * <TD WIDTH="25">&nbsp;</TD>
 * <TD>
 * 
 * This table stores the captured values for a Parameterised service.
 * <p>
 * For each service created for a subscriber, a record on this table will be
 * created per record on spa_service_params.
 * </p>
 * 
 * <!-- end indent text --></TD>
 * </TR>
 * </TABLE>
 * 
 * 
 * <H3>PsdParamServDet Value Object:</H3>
 * 
 * <!-- indent text -->
 * <TABLE BORDER="0" CELLPADDING="0" CELLSPACING="0">
 * <TR>
 * <TD WIDTH="25">&nbsp;</TD>
 * <TD>
 * 
 * <P>
 * This is a value object (called a Data Model Object or 'DMO'). It is used to
 * pass the data for a psdParamServDet into and out of the BASE module. Because
 * it's purpose is to carry data into and out of the module it is visible
 * outside the module.
 * </P>
 * <P>
 * This value object carries the data for one psdParamServDet. A psdParamServDet
 * is: This table stores the captured values for a Parameterised service.
 * </P>
 * <P>
 * It corresponds to the business logic object PsdParamServDet which contains
 * all the business behaviour of a psdParamServDet but is not visible outside
 * the BASE module.
 * </P>
 * <P>
 * As a value object it has few methods. The methods it does have are not
 * business logic, they are just methods to make constructing and manipulating
 * it easier.
 * </P>
 * 
 * <!-- end indent text --></TD>
 * </TR>
 * </TABLE>
 * 
 * 
 * 
 * <H3>These Value Objects Contain:</H3>
 * 
 * <!-- indent text -->
 * <TABLE BORDER="0" CELLPADDING="0" CELLSPACING="0">
 * <TR>
 * <TD WIDTH="25">&nbsp;</TD>
 * <TD>
 * 
 * <P>
 * This value object contains fields for all the details of a psdParamServDet,
 * namely:
 * </P>
 * 
 * 
 * 
 * <P>
 * <U>Fields to carry the Attributes of a psdParamServDet:</U>
 * </P>
 * 
 * <!-- indent text -->
 * <TABLE BORDER="0" CELLPADDING="0" CELLSPACING="0">
 * <TR>
 * <TD WIDTH="25">&nbsp;</TD>
 * <TD>
 * 
 * <TABLE BORDER="0" CELLPADDING="5" CELLSPACING="3">
 * <TR>
 * <TD ALIGN="left" VALIGN="top"></TD>
 * <TD ALIGN="left" VALIGN="top"><U>Name</U></TD>
 * <TD ALIGN="left" VALIGN="top"><U>Datatype</U></TD>
 * <TD ALIGN="left" VALIGN="top"><U>Nullable</U></TD>
 * <TD ALIGN="left" VALIGN="top"><U>Description</U></TD>
 * </TR>
 * <TR>
 * <TD ALIGN="left" VALIGN="top">
 * <!-- the attributes are private no matter what their logical visibility -->
 * <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif"
 * alt="private attribute" title="private attribute" align="center" /></TD>
 * <TD ALIGN="left" VALIGN="top"><B>psdPshId</B></TD>
 * <TD ALIGN="left" VALIGN="top">Integer</TD>
 * <TD ALIGN="left" VALIGN="top">false</TD>
 * <TD ALIGN="left" VALIGN="top">
 * Refers to psh_param_serv_hdr.
 * <p>
 * psh_id
 * </p>
 * 
 * <P>
 * This attribute forms part of the primary key.
 * </P>
 * 
 * 
 * 
 * 
 * 
 * <P>
 * See: <BR>
 * <!-- link to the anchor of the attribute's getter method. It has the logical
 * visibility specified for the attribute --> <img
 * src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method"
 * title="public method" align="center" /> <A HREF="#getPsdPshId()"> getPsdPshId
 * </A> <BR>
 * <!-- link to the anchor of the attribute's setter method. It has the logical
 * visibility specified for the attribute --> <img
 * src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method"
 * title="public method" align="center" /> <A
 * HREF="#setPsdPshId(java.lang.Integer)"> setPsdPshId (Integer) </A>
 * </P>
 * </TD>
 * </TR>
 * <TR>
 * <TD ALIGN="left" VALIGN="top">
 * <!-- the attributes are private no matter what their logical visibility -->
 * <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif"
 * alt="private attribute" title="private attribute" align="center" /></TD>
 * <TD ALIGN="left" VALIGN="top"><B>psdParamId</B></TD>
 * <TD ALIGN="left" VALIGN="top">Short</TD>
 * <TD ALIGN="left" VALIGN="top">false</TD>
 * <TD ALIGN="left" VALIGN="top">
 * Refers to spa_vsr_service.
 * <p>
 * vsr_service_code
 * </p>
 * 
 * <P>
 * This attribute forms part of the primary key.
 * </P>
 * 
 * 
 * 
 * 
 * 
 * <P>
 * See: <BR>
 * <!-- link to the anchor of the attribute's getter method. It has the logical
 * visibility specified for the attribute --> <img
 * src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method"
 * title="public method" align="center" /> <A HREF="#getPsdParamId()">
 * getPsdParamId </A> <BR>
 * <!-- link to the anchor of the attribute's setter method. It has the logical
 * visibility specified for the attribute --> <img
 * src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method"
 * title="public method" align="center" /> <A
 * HREF="#setPsdParamId(java.lang.Short)"> setPsdParamId (Short) </A>
 * </P>
 * </TD>
 * </TR>
 * <TR>
 * <TD ALIGN="left" VALIGN="top">
 * <!-- the attributes are private no matter what their logical visibility -->
 * <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif"
 * alt="private attribute" title="private attribute" align="center" /></TD>
 * <TD ALIGN="left" VALIGN="top"><B>psdParamValue</B></TD>
 * <TD ALIGN="left" VALIGN="top">String</TD>
 * <TD ALIGN="left" VALIGN="top">true</TD>
 * <TD ALIGN="left" VALIGN="top">
 * The value captured from user input.
 * <p>
 * If this parameter is not mandatory within spa_service_params, then the value
 * may be blank. It is possible that this value will be taken from the default
 * value provided on spa_service_params without user input for some parameters.
 * The value will be validated against the types available in the tt_type_text
 * group for this parameter.
 * </p>
 * 
 * 
 * 
 * 
 * 
 * 
 * <P>
 * See: <BR>
 * <!-- link to the anchor of the attribute's getter method. It has the logical
 * visibility specified for the attribute --> <img
 * src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method"
 * title="public method" align="center" /> <A HREF="#getPsdParamValue()">
 * getPsdParamValue </A> <BR>
 * <!-- link to the anchor of the attribute's setter method. It has the logical
 * visibility specified for the attribute --> <img
 * src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method"
 * title="public method" align="center" /> <A
 * HREF="#setPsdParamValue(java.lang.String)"> setPsdParamValue (String) </A>
 * </P>
 * </TD>
 * </TR>
 * </TABLE>
 * 
 * <!-- end indent text --></TD>
 * </TR>
 * </TABLE>
 * 
 * 
 * 
 * <P>
 * <U>Fields that carry attributes from other value objects (known as 'flattened
 * in' attributes):</U>
 * </P>
 * 
 * <!-- indent text -->
 * <TABLE BORDER="0" CELLPADDING="0" CELLSPACING="0">
 * <TR>
 * <TD WIDTH="25">&nbsp;</TD>
 * <TD>
 * 
 * <P>
 * This value object has no attributes 'flattened in' from other value objects.
 * </P>
 * 
 * <!-- end indent text --></TD>
 * </TR>
 * </TABLE>
 * 
 * 
 * 
 * 
 * <P>
 * <U>Fields that can carry one or more associated value objects (known as
 * 'embedded' value objects).</U>
 * </P>
 * 
 * <!-- indent text -->
 * <TABLE BORDER="0" CELLPADDING="0" CELLSPACING="0">
 * <TR>
 * <TD WIDTH="25">&nbsp;</TD>
 * <TD>
 * 
 * <P>
 * This value object never contains any embedded value objects.
 * </P>
 * 
 * <!-- end indent text --></TD>
 * </TR>
 * </TABLE>
 * 
 * <!-- end indent text --></TD>
 * </TR>
 * </TABLE>
 * 
 * <H3>These Value Objects Are Contained by:</H3>
 * 
 * 
 * <P>
 * <U>Selected Fields Flattened into:</U>
 * </P>
 * 
 * <!-- indent text -->
 * <TABLE BORDER="0" CELLPADDING="0" CELLSPACING="0">
 * <TR>
 * <TD WIDTH="25">&nbsp;</TD>
 * <TD>
 * 
 * <P>
 * No attributes from this value object get 'flattened in' to other value
 * objects.
 * </P>
 * 
 * <!-- end indent text --></TD>
 * </TR>
 * </TABLE>
 * 
 * 
 * 
 * <P>
 * <U>Whole Value Object Embedded in:</U>
 * </P>
 * <!-- indent text -->
 * <TABLE BORDER="0" CELLPADDING="0" CELLSPACING="0">
 * <TR>
 * <TD WIDTH="25">&nbsp;</TD>
 * <TD>
 * 
 * <P>
 * This value object is never embedded in other value objects.
 * </P>
 * 
 * <!-- end indent text --></TD>
 * </TR>
 * </TABLE>
 * 
 * 
 * 
 * @see PsdParamServDet
 * 
 * @author
 * @version $Revision: $
 * 
 * @since $jdk$
 */
public class PsdParamServDetDMO extends DBO implements Serializable {

	@Override
	public String toString() {
		return "\nPsdParamServDetDMO [\npsdSerialId=" + psdSerialId + "\npsdPshId="
				+ psdPshId + "\npsdParamId=" + psdParamId + "\npsdActDate="
				+ psdActDate + "\npsdTermDate=" + psdTermDate
				+ "\npsdParamValue=" + psdParamValue + "\npsdN2nString="
				+ psdN2nString + "\npsdParamActive=" + psdParamActive
				+ "\npsdDeacDate=" + psdDeacDate + "\npsdSubCharge="
				+ psdSubCharge + "\npsdChgValue=" + psdChgValue
				+ "\npsdActType=" + psdActType + "\npsdActionDate="
				+ psdActionDate + "]";
	}

	private Integer psdSerialId;
	private Integer psdPshId;
	private Integer psdParamId;
	private Date psdActDate;
	private Date psdTermDate;
	private String psdParamValue;
	private String psdN2nString;
	private String psdParamActive;
	private Date psdDeacDate;
	private String psdSubCharge;
	private Double psdChgValue;
	private String psdActType;
	private Date psdActionDate;

	public static final int psdSerialIdFilter = 0;

	public static final int psdPshIdFilter = 1;

	public static final int psdParamIdFilter = 2;

	public static final int psdActDateFilter = 3;

	public static final int psdTermDateFilter = 4;

	public static final int psdParamValueFilter = 5;
	private static final int psdParamValueSize = 20;

	public static final int psdN2nStringFilter = 6;
	private static final int psdN2nStringSize = 1;

	public static final int psdParamActiveFilter = 7;
	private static final int psdParamActiveSize = 1;

	public static final int psdDeacDateFilter = 8;

	public static final int psdSubChargeFilter = 9;
	private static final int psdSubChargeSize = 5;

	public static final int psdChgValueFilter = 10;

	public static final int psdActTypeFilter = 11;
	private static final int psdActTypeSize = 2;

	public static final int psdActionDateFilter = 12;

	public PsdParamServDetDMO() {
	};

	public PsdParamServDetDMO(final Integer psdSerialId,
			final Integer psdPshId, final Integer psdParamId,
			final Date psdActDate, final Date psdTermDate,
			final String psdParamValue, final String psdN2nString,
			final String psdParamActive, final Date psdDeacDate,
			final String psdSubCharge, final Double psdChgValue,
			final String psdActType, final Date psdActionDate) {

		this.psdSerialId = psdSerialId;
		this.psdPshId = psdPshId;
		this.psdParamId = psdParamId;
		this.psdActDate = psdActDate;
		this.psdTermDate = psdTermDate;
		this.psdParamValue = psdParamValue;
		this.psdN2nString = psdN2nString;
		this.psdParamActive = psdParamActive;
		this.psdDeacDate = psdDeacDate;
		this.psdSubCharge = psdSubCharge;
		this.psdChgValue = psdChgValue;
		this.psdActType = psdActType;
		this.psdActionDate = psdActionDate;
	};

	private static final int[] fieldSizes = new int[] { 0, 0, 0, 0, 0,
			psdParamValueSize, psdN2nStringSize, psdParamActiveSize, 0,
			psdSubChargeSize, 0, psdActTypeSize, 0 };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_INTEGER,
			FIELD_TYPE_INTEGER, FIELD_TYPE_INTEGER, FIELD_TYPE_DATE,
			FIELD_TYPE_DATE, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_DATE, FIELD_TYPE_STRING,
			FIELD_TYPE_DOUBLE, FIELD_TYPE_STRING, FIELD_TYPE_DATE };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] {
				this.psdSerialId,
				this.psdPshId,
				this.psdParamId,
				this.psdActDate,
				this.psdTermDate,
				((this.psdParamValue == null) ? null : (this.psdParamValue
						.length() <= psdParamValueSize) ? this.psdParamValue
						: this.psdParamValue.substring(0,
								this.psdParamValueSize)),
				((this.psdN2nString == null) ? null : (this.psdN2nString
						.length() <= psdN2nStringSize) ? this.psdN2nString
						: this.psdN2nString.substring(0, this.psdN2nStringSize)),
				((this.psdParamActive == null) ? null : (this.psdParamActive
						.length() <= psdParamActiveSize) ? this.psdParamActive
						: this.psdParamActive.substring(0,
								this.psdParamActiveSize)),
				this.psdDeacDate,
				((this.psdSubCharge == null) ? null : (this.psdSubCharge
						.length() <= psdSubChargeSize) ? this.psdSubCharge
						: this.psdSubCharge.substring(0, this.psdSubChargeSize)),
				this.psdChgValue,
				((this.psdActType == null) ? null
						: (this.psdActType.length() <= psdActTypeSize) ? this.psdActType
								: this.psdActType.substring(0,
										this.psdActTypeSize)),
				this.psdActionDate };
	}

	protected Integer versionNumber() {
		return null;
	}

	protected void versionNumber(Integer versionNumber) {
	}

	protected int[] fieldSizes() {
		return fieldSizes;
	}

	protected int[] fieldTypes() {
		return fieldTypes;
	}

	protected DAOArgs primaryKey() {
		return new DAOArgs(3).arg(this.getPsdSerialId()).arg(this.getPsdPshId()).arg(this.getPsdParamId());
	}

	protected void set(Object[] fields) {
		this.psdSerialId = ((Integer) fields[0]);
		this.psdPshId = ((Integer) fields[1]);
		this.psdParamId = ((Integer) fields[2]);
		this.psdActDate = ((fields[3] == null) ? null : new Date(
				fields[3]));
		this.psdTermDate = ((fields[4] == null) ? null : new Date(
				fields[4]));
		this.psdParamValue = rtrim((String) fields[5]);
		this.psdN2nString = rtrim((String) fields[6]);
		this.psdParamActive = rtrim((String) fields[7]);
		this.psdDeacDate = ((fields[8] == null) ? null : new Date(
				fields[8]));
		this.psdSubCharge = rtrim((String) fields[9]);
		this.psdChgValue = ((Double) fields[10]);
		this.psdActType = rtrim((String) fields[11]);
		this.psdActionDate = ((fields[12] == null) ? null : new Date(
				fields[12]));
	}

	public void set(final Integer psdSerialId, final Integer psdPshId,
			final Integer psdParamId, final Date psdActDate,
			final Date psdTermDate, final String psdParamValue,
			final String psdN2nString, final String psdParamActive,
			final Date psdDeacDate, final String psdSubCharge,
			final Double psdChgValue, final String psdActType,
			final Date psdActionDate) {

		this.psdSerialId = psdSerialId;
		this.psdPshId = psdPshId;
		this.psdParamId = psdParamId;
		this.psdActDate = psdActDate;
		this.psdTermDate = psdTermDate;
		this.psdParamValue = psdParamValue;
		this.psdN2nString = psdN2nString;
		this.psdParamActive = psdParamActive;
		this.psdDeacDate = psdDeacDate;
		this.psdSubCharge = psdSubCharge;
		this.psdChgValue = psdChgValue;
		this.psdActType = psdActType;
		this.psdActionDate = psdActionDate;
	}

	public Integer getPsdSerialId() {
		return psdSerialId;
	}

	public void setPsdSerialId(Integer psdSerialId) {
		this.psdSerialId = psdSerialId;
	}

	public Integer getPsdPshId() {
		return psdPshId;
	}

	public void setPsdPshId(Integer psdPshId) {
		this.psdPshId = psdPshId;
	}

	public Integer getPsdParamId() {
		return psdParamId;
	}

	public void setPsdParamId(Integer psdParamId) {
		this.psdParamId = psdParamId;
	}

	public Date getPsdActDate() {
		return psdActDate;
	}

	public void setPsdActDate(Date psdActDate) {
		this.psdActDate = psdActDate;
	}

	public Date getPsdTermDate() {
		return psdTermDate;
	}

	public void setPsdTermDate(Date psdTermDate) {
		this.psdTermDate = psdTermDate;
	}

	public String getPsdParamValue() {
		return psdParamValue;
	}

	public void setPsdParamValue(String psdParamValue) {
		this.psdParamValue = psdParamValue;
	}

	public String getPsdN2nString() {
		return psdN2nString;
	}

	public void setPsdN2nString(String psdN2nString) {
		this.psdN2nString = psdN2nString;
	}

	public String getPsdParamActive() {
		return psdParamActive;
	}

	public void setPsdParamActive(String psdParamActive) {
		this.psdParamActive = psdParamActive;
	}

	public Date getPsdDeacDate() {
		return psdDeacDate;
	}

	public void setPsdDeacDate(Date psdDeacDate) {
		this.psdDeacDate = psdDeacDate;
	}

	public String getPsdSubCharge() {
		return psdSubCharge;
	}

	public void setPsdSubCharge(String psdSubCharge) {
		this.psdSubCharge = psdSubCharge;
	}

	public Double getPsdChgValue() {
		return psdChgValue;
	}

	public void setPsdChgValue(Double psdChgValue) {
		this.psdChgValue = psdChgValue;
	}

	public String getPsdActType() {
		return psdActType;
	}

	public void setPsdActType(String psdActType) {
		this.psdActType = psdActType;
	}

	public Date getPsdActionDate() {
		return psdActionDate;
	}

	public void setPsdActionDate(Date psdActionDate) {
		this.psdActionDate = psdActionDate;
	}
}