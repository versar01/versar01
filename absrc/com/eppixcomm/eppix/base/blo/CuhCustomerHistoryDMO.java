/*============================================================================================= *
 *
 * (c) 2007 Copyright Eppixcomm.
 * All Rights Reserved
 * Legal Information goes here.
 *
 *============================================================================================= */

/**----------------------------------------------------------------------------------------------
 *
 * Version control details:
 *    @version $Revision: $
 *    @author  $Author: $
 *----------------------------------------------------------------------------------------------*/
package com.eppixcomm.eppix.base.blo;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;
import com.eppixcomm.eppix.common.util.FilterOp;
import com.eppixcomm.eppix.common.util.FilterPart;

// ---------------------
// imports
// ---------------------
import com.eppixcomm.eppix.common.util.QueryFilter;
import com.eppixcomm.eppix.common.util.Date;
import com.eppixcomm.eppix.common.util.DateTime;
import com.eppixcomm.eppix.common.util.Time;

import java.io.Serializable;

import java.math.BigDecimal;

import java.util.ArrayList;
import java.util.List;

// ---------------------
// class javadoc
// ---------------------
/**
 * A value object to carry the data for a CuhCustomerHistory.
 * 
 * 
 * <H3> A CuhCustomerHistory is: </H3>
 * 
 * <!-- indent text --> <TABLE BORDER="0" CELLPADDING="0" CELLSPACING="0">
 * <TR>
 * <TD WIDTH="25">&nbsp;</TD>
 * <TD>
 * 
 * Holds details about events occurring at Subscriber Level.
 * 
 * <!-- end indent text --> </TD>
 * </TR>
 * </TABLE>
 * 
 * 
 * <H3> CuhCustomerHistory Value Object: </H3>
 * 
 * <!-- indent text --> <TABLE BORDER="0" CELLPADDING="0" CELLSPACING="0">
 * <TR>
 * <TD WIDTH="25">&nbsp;</TD>
 * <TD>
 * 
 * <P>
 * This is a value object (called a Data Model Object or 'DMO'). It is used to
 * pass the data for a CuhCustomerHistory into and out of the BASE module.
 * Because it's purpose is to carry data into and out of the module it is
 * visible outside the module.
 * </P>
 * <P>
 * This value object carries the data for one CuhCustomerHistory. A
 * CuhCustomerHistory is: Holds details about events occurring at Subscriber
 * Level.
 * </P>
 * <P>
 * It corresponds to the business logic object CuhCustomerHistory which contains
 * all the business behaviour of a CuhCustomerHistory but is not visible outside
 * the BASE module.
 * </P>
 * <P>
 * As a value object it has few methods. The methods it does have are not
 * business logic, they are just methods to make constructing and manipulating
 * it easier.
 * </P>
 * 
 * <!-- end indent text --> </TD>
 * </TR>
 * </TABLE>
 * 
 * 
 * 
 * <H3> These Value Objects Contain: </H3>
 * 
 * <!-- indent text --> <TABLE BORDER="0" CELLPADDING="0" CELLSPACING="0">
 * <TR>
 * <TD WIDTH="25">&nbsp;</TD>
 * <TD>
 * 
 * <P>
 * This value object contains fields for all the details of a
 * CuhCustomerHistory, namely:
 * </P>
 * 
 * 
 * 
 * <P>
 * <U>Fields to carry the Attributes of a CuhCustomerHistory:</U>
 * </P>
 * 
 * <!-- indent text --> <TABLE BORDER="0" CELLPADDING="0" CELLSPACING="0">
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
 * <TD ALIGN="left" VALIGN="top"> <!-- the attributes are private no matter what
 * their logical visibility --> <img
 * src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private
 * attribute" title="private attribute" align="center" /> </TD>
 * <TD ALIGN="left" VALIGN="top"><B>cuhBillAcNo</B></TD>
 * <TD ALIGN="left" VALIGN="top">String</TD>
 * <TD ALIGN="left" VALIGN="top">false</TD>
 * <TD ALIGN="left" VALIGN="top"> Subscriber Id
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
 * title="public method" align="center" /> <A HREF="#getCuhBillAcNo()">
 * getCuhBillAcNo </A> <BR>
 * <!-- link to the anchor of the attribute's setter method. It has the logical
 * visibility specified for the attribute --> <img
 * src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method"
 * title="public method" align="center" /> <A
 * HREF="#setCuhBillAcNo(java.lang.String)"> setCuhBillAcNo (String) </A>
 * </P>
 * </TD>
 * </TR>
 * <TR>
 * <TD ALIGN="left" VALIGN="top"> <!-- the attributes are private no matter what
 * their logical visibility --> <img
 * src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private
 * attribute" title="private attribute" align="center" /> </TD>
 * <TD ALIGN="left" VALIGN="top"><B>cuhFieldId</B></TD>
 * <TD ALIGN="left" VALIGN="top">Integer</TD>
 * <TD ALIGN="left" VALIGN="top">true</TD>
 * <TD ALIGN="left" VALIGN="top"> Identifier of field modified
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
 * title="public method" align="center" /> <A HREF="#getCuhFieldId()">
 * getCuhFieldId </A> <BR>
 * <!-- link to the anchor of the attribute's setter method. It has the logical
 * visibility specified for the attribute --> <img
 * src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method"
 * title="public method" align="center" /> <A
 * HREF="#setCuhFieldId(java.lang.Integer)"> setCuhFieldId (Integer) </A>
 * </P>
 * </TD>
 * </TR>
 * <TR>
 * <TD ALIGN="left" VALIGN="top"> <!-- the attributes are private no matter what
 * their logical visibility --> <img
 * src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private
 * attribute" title="private attribute" align="center" /> </TD>
 * <TD ALIGN="left" VALIGN="top"><B>cuhHistCode</B></TD>
 * <TD ALIGN="left" VALIGN="top">String</TD>
 * <TD ALIGN="left" VALIGN="top">true</TD>
 * <TD ALIGN="left" VALIGN="top"> History code detailing event
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
 * title="public method" align="center" /> <A HREF="#getCuhHistCode()">
 * getCuhHistCode </A> <BR>
 * <!-- link to the anchor of the attribute's setter method. It has the logical
 * visibility specified for the attribute --> <img
 * src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method"
 * title="public method" align="center" /> <A
 * HREF="#setCuhHistCode(java.lang.String)"> setCuhHistCode (String) </A>
 * </P>
 * </TD>
 * </TR>
 * <TR>
 * <TD ALIGN="left" VALIGN="top"> <!-- the attributes are private no matter what
 * their logical visibility --> <img
 * src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private
 * attribute" title="private attribute" align="center" /> </TD>
 * <TD ALIGN="left" VALIGN="top"><B>cuhOldValue</B></TD>
 * <TD ALIGN="left" VALIGN="top">String</TD>
 * <TD ALIGN="left" VALIGN="top">true</TD>
 * <TD ALIGN="left" VALIGN="top"> Old value of field
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
 * title="public method" align="center" /> <A HREF="#getCuhOldValue()">
 * getCuhOldValue </A> <BR>
 * <!-- link to the anchor of the attribute's setter method. It has the logical
 * visibility specified for the attribute --> <img
 * src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method"
 * title="public method" align="center" /> <A
 * HREF="#setCuhOldValue(java.lang.String)"> setCuhOldValue (String) </A>
 * </P>
 * </TD>
 * </TR>
 * <TR>
 * <TD ALIGN="left" VALIGN="top"> <!-- the attributes are private no matter what
 * their logical visibility --> <img
 * src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private
 * attribute" title="private attribute" align="center" /> </TD>
 * <TD ALIGN="left" VALIGN="top"><B>cuhNewValue</B></TD>
 * <TD ALIGN="left" VALIGN="top">String</TD>
 * <TD ALIGN="left" VALIGN="top">true</TD>
 * <TD ALIGN="left" VALIGN="top"> New value of field
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
 * title="public method" align="center" /> <A HREF="#getCuhNewValue()">
 * getCuhNewValue </A> <BR>
 * <!-- link to the anchor of the attribute's setter method. It has the logical
 * visibility specified for the attribute --> <img
 * src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method"
 * title="public method" align="center" /> <A
 * HREF="#setCuhNewValue(java.lang.String)"> setCuhNewValue (String) </A>
 * </P>
 * </TD>
 * </TR>
 * <TR>
 * <TD ALIGN="left" VALIGN="top"> <!-- the attributes are private no matter what
 * their logical visibility --> <img
 * src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private
 * attribute" title="private attribute" align="center" /> </TD>
 * <TD ALIGN="left" VALIGN="top"><B>cuhUserId</B></TD>
 * <TD ALIGN="left" VALIGN="top">String</TD>
 * <TD ALIGN="left" VALIGN="top">true</TD>
 * <TD ALIGN="left" VALIGN="top"> User who performed the event
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
 * title="public method" align="center" /> <A HREF="#getCuhUserId()">
 * getCuhUserId </A> <BR>
 * <!-- link to the anchor of the attribute's setter method. It has the logical
 * visibility specified for the attribute --> <img
 * src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method"
 * title="public method" align="center" /> <A
 * HREF="#setCuhUserId(java.lang.String)"> setCuhUserId (String) </A>
 * </P>
 * </TD>
 * </TR>
 * <TR>
 * <TD ALIGN="left" VALIGN="top"> <!-- the attributes are private no matter what
 * their logical visibility --> <img
 * src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private
 * attribute" title="private attribute" align="center" /> </TD>
 * <TD ALIGN="left" VALIGN="top"><B>cuhTerminalId</B></TD>
 * <TD ALIGN="left" VALIGN="top">String</TD>
 * <TD ALIGN="left" VALIGN="top">true</TD>
 * <TD ALIGN="left" VALIGN="top"> Terminal event performed at
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
 * title="public method" align="center" /> <A HREF="#getCuhTerminalId()">
 * getCuhTerminalId </A> <BR>
 * <!-- link to the anchor of the attribute's setter method. It has the logical
 * visibility specified for the attribute --> <img
 * src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method"
 * title="public method" align="center" /> <A
 * HREF="#setCuhTerminalId(java.lang.String)"> setCuhTerminalId (String) </A>
 * </P>
 * </TD>
 * </TR>
 * <TR>
 * <TD ALIGN="left" VALIGN="top"> <!-- the attributes are private no matter what
 * their logical visibility --> <img
 * src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private
 * attribute" title="private attribute" align="center" /> </TD>
 * <TD ALIGN="left" VALIGN="top"><B>cuhTimestamp</B></TD>
 * <TD ALIGN="left" VALIGN="top">DateTime</TD>
 * <TD ALIGN="left" VALIGN="top">false</TD>
 * <TD ALIGN="left" VALIGN="top"> Event time (Year to Second format)
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
 * title="public method" align="center" /> <A HREF="#getCuhTimestamp()">
 * getCuhTimestamp </A> <BR>
 * <!-- link to the anchor of the attribute's setter method. It has the logical
 * visibility specified for the attribute --> <img
 * src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method"
 * title="public method" align="center" /> <A
 * HREF="#setCuhTimestamp(com.cmgwds.eppix.util.DateTime)"> setCuhTimestamp
 * (DateTime) </A>
 * </P>
 * </TD>
 * </TR>
 * </TABLE>
 * 
 * <!-- end indent text --> </TD>
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
 * <!-- indent text --> <TABLE BORDER="0" CELLPADDING="0" CELLSPACING="0">
 * <TR>
 * <TD WIDTH="25">&nbsp;</TD>
 * <TD>
 * 
 * <P>
 * This value object has no attributes 'flattened in' from other value objects.
 * </P>
 * 
 * <!-- end indent text --> </TD>
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
 * <!-- indent text --> <TABLE BORDER="0" CELLPADDING="0" CELLSPACING="0">
 * <TR>
 * <TD WIDTH="25">&nbsp;</TD>
 * <TD>
 * 
 * <P>
 * This value object never contains any embedded value objects.
 * </P>
 * 
 * <!-- end indent text --> </TD>
 * </TR>
 * </TABLE>
 * 
 * <!-- end indent text --> </TD>
 * </TR>
 * </TABLE>
 * 
 * <H3> These Value Objects Are Contained by: </H3>
 * 
 * 
 * <P>
 * <U>Selected Fields Flattened into:</U>
 * </P>
 * 
 * <!-- indent text --> <TABLE BORDER="0" CELLPADDING="0" CELLSPACING="0">
 * <TR>
 * <TD WIDTH="25">&nbsp;</TD>
 * <TD>
 * 
 * <P>
 * No attributes from this value object get 'flattened in' to other value
 * objects.
 * </P>
 * 
 * <!-- end indent text --> </TD>
 * </TR>
 * </TABLE>
 * 
 * 
 * 
 * <P>
 * <U>Whole Value Object Embedded in:</U>
 * </P>
 * <!-- indent text --> <TABLE BORDER="0" CELLPADDING="0" CELLSPACING="0">
 * <TR>
 * <TD WIDTH="25">&nbsp;</TD>
 * <TD>
 * 
 * <P>
 * This value object is never embedded in other value objects.
 * </P>
 * 
 * <!-- end indent text --> </TD>
 * </TR>
 * </TABLE>
 * 
 * 
 * 
 * @see CuhCustomerHistory
 * 
 * @author
 * @version $Revision: $
 * 
 * @since $jdk$
 */
public class CuhCustomerHistoryDMO extends DBO implements Serializable {
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
			FIELD_TYPE_STRING /* std public attribute: cuhBillAcNo */,
			FIELD_TYPE_INTEGER /* std public attribute: cuhFieldId */,
			FIELD_TYPE_STRING /* std public attribute: cuhHistCode */,
			FIELD_TYPE_STRING /* std public attribute: cuhOldValue */,
			FIELD_TYPE_STRING /* std public attribute: cuhNewValue */,
			FIELD_TYPE_STRING /* std public attribute: cuhUserId */,
			FIELD_TYPE_STRING /* std public attribute: cuhTerminalId */,
			FIELD_TYPE_DATETIME /* std public attribute: cuhTimestamp */
	};
	
	/**
	* TODO SJ Implement the array of field sizes
	* Not implimented as it is not a MTN table
	*/
	private final int[] fieldSizes = new int[] {
	      
	};
	    

	public int[] fieldSizes() {
		return fieldSizes;
	}  

	/**
	 * Unique field index used for Filtering.
	 * 
	 * @see com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int cuhBillAcNoFilter = 0; // filter index

	/**
	 * Unique field index used for Filtering.
	 * 
	 * @see com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int cuhFieldIdFilter = 1; // filter index

	/**
	 * Unique field index used for Filtering.
	 * 
	 * @see com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int cuhHistCodeFilter = 2; // filter index
	private static final int cuhHistCodeSize = 10; // field size

	/**
	 * Unique field index used for Filtering.
	 * 
	 * @see com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int cuhOldValueFilter = 3; // filter index
	private static final int cuhOldValueSize = 50; // field size

	/**
	 * Unique field index used for Filtering.
	 * 
	 * @see com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int cuhNewValueFilter = 4; // filter index
	private static final int cuhNewValueSize = 50; // field size

	/**
	 * Unique field index used for Filtering.
	 * 
	 * @see com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int cuhUserIdFilter = 5; // filter index
	private static final int cuhUserIdSize = 10; // field size

	/**
	 * Unique field index used for Filtering.
	 * 
	 * @see com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int cuhTerminalIdFilter = 6; // filter index
	private static final int cuhTerminalIdSize = 20; // field size

	/**
	 * Unique field index used for Filtering.
	 * 
	 * @see com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int cuhTimestampFilter = 7; // filter index

	// ~ Instance variables
	// /////////////////////////////////////////////////////

	private DateTime cuhTimestamp; // Loaded from Schema
	private Integer cuhFieldId; // Loaded from Schema

	// ---------------------
	// Field declarations
	// ---------------------
	// all attributes
	private String cuhBillAcNo; // Loaded from Schema
	private String cuhHistCode; // Loaded from Schema
	private String cuhNewValue; // Loaded from Schema
	private String cuhOldValue; // Loaded from Schema
	private String cuhTerminalId; // Loaded from Schema
	private String cuhUserId; // Loaded from Schema

	// ~ Constructors
	// ///////////////////////////////////////////////////////////

	/**
	 * Creates a new CuhCustomerHistoryDMO object.
	 */
	public CuhCustomerHistoryDMO() {
	}

	// Constructor - taking public attributes
	/**
	 * Creates a new CuhCustomerHistoryDMO object.
	 * 
	 * @param cuhBillAcNo
	 *            DOCUMENT ME!
	 * @param cuhFieldId
	 *            DOCUMENT ME!
	 * @param cuhHistCode
	 *            DOCUMENT ME!
	 * @param cuhOldValue
	 *            DOCUMENT ME!
	 * @param cuhNewValue
	 *            DOCUMENT ME!
	 * @param cuhUserId
	 *            DOCUMENT ME!
	 * @param cuhTerminalId
	 *            DOCUMENT ME!
	 * @param cuhTimestamp
	 *            DOCUMENT ME!
	 */
	public CuhCustomerHistoryDMO(final String cuhBillAcNo,
			final Integer cuhFieldId, final String cuhHistCode,
			final String cuhOldValue, final String cuhNewValue,
			final String cuhUserId, final String cuhTerminalId,
			final DateTime cuhTimestamp) {
		this.cuhBillAcNo = cuhBillAcNo;

		this.cuhFieldId = cuhFieldId;

		this.cuhHistCode = cuhHistCode;

		this.cuhOldValue = cuhOldValue;

		this.cuhNewValue = cuhNewValue;

		this.cuhUserId = cuhUserId;

		this.cuhTerminalId = cuhTerminalId;

		this.cuhTimestamp = (cuhTimestamp != null) ? new DateTime(cuhTimestamp)
				: null;
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
		return new DAOArgs(0);
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
				cuhBillAcNo,
				cuhFieldId,
				(cuhHistCode == null) ? null
						: ((cuhHistCode.length() <= cuhHistCodeSize) ? cuhHistCode
								: cuhHistCode.substring(0, cuhHistCodeSize) // auto
																			// trimmed
																			// to
																			// fit,
																			// if
																			// required.
						),
				(cuhOldValue == null) ? null
						: ((cuhOldValue.length() <= cuhOldValueSize) ? cuhOldValue
								: cuhOldValue.substring(0, cuhOldValueSize) // auto
																			// trimmed
																			// to
																			// fit,
																			// if
																			// required.
						),
				(cuhNewValue == null) ? null
						: ((cuhNewValue.length() <= cuhNewValueSize) ? cuhNewValue
								: cuhNewValue.substring(0, cuhNewValueSize) // auto
																			// trimmed
																			// to
																			// fit,
																			// if
																			// required.
						),
				(cuhUserId == null) ? null
						: ((cuhUserId.length() <= cuhUserIdSize) ? cuhUserId
								: cuhUserId.substring(0, cuhUserIdSize) // auto
																		// trimmed
																		// to
																		// fit,
																		// if
																		// required.
						),
				(cuhTerminalId == null) ? null
						: ((cuhTerminalId.length() <= cuhTerminalIdSize) ? cuhTerminalId
								: cuhTerminalId.substring(0, cuhTerminalIdSize) // auto
																				// trimmed
																				// to
																				// fit,
																				// if
																				// required.
						), cuhTimestamp };
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @param fields
	 *            DOCUMENT ME!
	 */
	protected void set(final Object[] fields) {
		cuhBillAcNo = rtrim((String) fields[0]);
		cuhFieldId = (Integer) fields[1];
		cuhHistCode = rtrim((String) fields[2]);
		cuhOldValue = rtrim((String) fields[3]);
		cuhNewValue = rtrim((String) fields[4]);
		cuhUserId = rtrim((String) fields[5]);
		cuhTerminalId = rtrim((String) fields[6]);
		cuhTimestamp = (DateTime) fields[7];
	}

	// Get methods
	// ///////////////////////////////////////////////////////////////
	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public String getCuhBillAcNo() {
		return cuhBillAcNo;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public Integer getCuhFieldId() {
		return cuhFieldId;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public String getCuhHistCode() {
		return cuhHistCode;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public String getCuhOldValue() {
		return cuhOldValue;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public String getCuhNewValue() {
		return cuhNewValue;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public String getCuhUserId() {
		return cuhUserId;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public String getCuhTerminalId() {
		return cuhTerminalId;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public DateTime getCuhTimestamp() {
		return (cuhTimestamp != null) ? new DateTime(cuhTimestamp) : null;
	}

	// Setter methods
	// ///////////////////////////////////////////////////////////////

	//
	// Master setter follows...
	//

	/**
	 * Setter that takes all attributes
	 */
	public void set(final String cuhBillAcNo, final Integer cuhFieldId,
			final String cuhHistCode, final String cuhOldValue,
			final String cuhNewValue, final String cuhUserId,
			final String cuhTerminalId, final DateTime cuhTimestamp) {
		this.cuhBillAcNo = cuhBillAcNo;
		this.cuhFieldId = cuhFieldId;
		this.cuhHistCode = cuhHistCode;
		this.cuhOldValue = cuhOldValue;
		this.cuhNewValue = cuhNewValue;
		this.cuhUserId = cuhUserId;
		this.cuhTerminalId = cuhTerminalId;
		this.cuhTimestamp = (cuhTimestamp != null) ? new DateTime(cuhTimestamp)
				: null;
	}

	//
	// Public access modifiers if any
	// (provided for attributes that are public in the analysis model)
	//    

	/**
	 * Sets the CuhBillAcNo field.
	 * 
	 * @param cuhBillAcNo
	 */
	public void setCuhBillAcNo(final String cuhBillAcNo) {
		this.cuhBillAcNo = cuhBillAcNo;
	}

	/**
	 * Sets the CuhFieldId field.
	 * 
	 * @param cuhFieldId
	 */
	public void setCuhFieldId(final Integer cuhFieldId) {
		this.cuhFieldId = cuhFieldId;
	}

	/**
	 * Sets the CuhHistCode field.
	 * 
	 * @param cuhHistCode
	 */
	public void setCuhHistCode(final String cuhHistCode) {
		this.cuhHistCode = cuhHistCode;
	}

	/**
	 * Sets the CuhOldValue field.
	 * 
	 * @param cuhOldValue
	 */
	public void setCuhOldValue(final String cuhOldValue) {
		this.cuhOldValue = cuhOldValue;
	}

	/**
	 * Sets the CuhNewValue field.
	 * 
	 * @param cuhNewValue
	 */
	public void setCuhNewValue(final String cuhNewValue) {
		this.cuhNewValue = cuhNewValue;
	}

	/**
	 * Sets the CuhUserId field.
	 * 
	 * @param cuhUserId
	 */
	public void setCuhUserId(final String cuhUserId) {
		this.cuhUserId = cuhUserId;
	}

	/**
	 * Sets the CuhTerminalId field.
	 * 
	 * @param cuhTerminalId
	 */
	public void setCuhTerminalId(final String cuhTerminalId) {
		this.cuhTerminalId = cuhTerminalId;
	}

	/**
	 * Sets the CuhTimestamp field.
	 * 
	 * @param cuhTimestamp
	 */
	public void setCuhTimestamp(final DateTime cuhTimestamp) {
		this.cuhTimestamp = (cuhTimestamp != null) ? new DateTime(cuhTimestamp)
				: null;
	}

	//
	// Protected access modifiers if any
	// (provided for attributes that are protected in the analysis model)
	//    

	//
	// Package/Default access modifiers if any
	// (provided for attributes that are package/default in the analysis model)
	//    

	//
	// Setters for embedded lists of DMOs if any...
	//      
}
