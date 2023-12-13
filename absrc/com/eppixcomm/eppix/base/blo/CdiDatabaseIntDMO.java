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

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;
import com.eppixcomm.eppix.common.util.DateTime;

// ---------------------
// class javadoc
// ---------------------
/**
 * A value object to carry the data for a CdiDatabaseInt.
 * 
 * 
 * <H3> A CdiDatabaseInt is: </H3>
 * 
 * <!-- indent text --> <TABLE BORDER="0" CELLPADDING="0" CELLSPACING="0">
 * <TR>
 * <TD WIDTH="25">&nbsp;</TD>
 * <TD>
 * 
 * DOCUMENT ME! - by adding a description of this class via the class diagram.
 * 
 * <!-- end indent text --> </TD>
 * </TR>
 * </TABLE>
 * 
 * 
 * <H3> CdiDatabaseInt Value Object: </H3>
 * 
 * <!-- indent text --> <TABLE BORDER="0" CELLPADDING="0" CELLSPACING="0">
 * <TR>
 * <TD WIDTH="25">&nbsp;</TD>
 * <TD>
 * 
 * <P>
 * This is a value object (called a Data Model Object or 'DMO'). It is used to
 * pass the data for a cdiDatabaseInt into and out of the BASE module. Because
 * it's purpose is to carry data into and out of the module it is visible
 * outside the module.
 * </P>
 * <P>
 * This value object carries the data for one cdiDatabaseInt. A cdiDatabaseInt
 * is: DOCUMENT ME! - by adding a description of this class via the class
 * diagram.
 * </P>
 * <P>
 * It corresponds to the business logic object CdiDatabaseInt which contains all
 * the business behaviour of a cdiDatabaseInt but is not visible outside the
 * BASE module.
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
 * This value object contains fields for all the details of a cdiDatabaseInt,
 * namely:
 * </P>
 * 
 * 
 * 
 * <P>
 * <U>Fields to carry the Attributes of a cdiDatabaseInt:</U>
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
 * <TD ALIGN="left" VALIGN="top"><B>cdiSerial</B></TD>
 * <TD ALIGN="left" VALIGN="top">Integer</TD>
 * <TD ALIGN="left" VALIGN="top">false</TD>
 * <TD ALIGN="left" VALIGN="top">
 * 
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
 * title="public method" align="center" /> <A HREF="#getCdiSerial()">
 * getCdiSerial </A> <BR>
 * <!-- link to the anchor of the attribute's setter method. It has the logical
 * visibility specified for the attribute --> <img
 * src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method"
 * title="public method" align="center" /> <A
 * HREF="#setCdiSerial(java.lang.Integer)"> setCdiSerial (Integer) </A>
 * </P>
 * </TD>
 * </TR>
 * <TR>
 * <TD ALIGN="left" VALIGN="top"> <!-- the attributes are private no matter what
 * their logical visibility --> <img
 * src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private
 * attribute" title="private attribute" align="center" /> </TD>
 * <TD ALIGN="left" VALIGN="top"><B>cdiBillAcNo</B></TD>
 * <TD ALIGN="left" VALIGN="top">String</TD>
 * <TD ALIGN="left" VALIGN="top">true</TD>
 * <TD ALIGN="left" VALIGN="top">
 * 
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
 * title="public method" align="center" /> <A HREF="#getCdiBillAcNo()">
 * getCdiBillAcNo </A> <BR>
 * <!-- link to the anchor of the attribute's setter method. It has the logical
 * visibility specified for the attribute --> <img
 * src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method"
 * title="public method" align="center" /> <A
 * HREF="#setCdiBillAcNo(java.lang.String)"> setCdiBillAcNo (String) </A>
 * </P>
 * </TD>
 * </TR>
 * <TR>
 * <TD ALIGN="left" VALIGN="top"> <!-- the attributes are private no matter what
 * their logical visibility --> <img
 * src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private
 * attribute" title="private attribute" align="center" /> </TD>
 * <TD ALIGN="left" VALIGN="top"><B>cdiSubscriberId</B></TD>
 * <TD ALIGN="left" VALIGN="top">Integer</TD>
 * <TD ALIGN="left" VALIGN="top">true</TD>
 * <TD ALIGN="left" VALIGN="top">
 * 
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
 * title="public method" align="center" /> <A HREF="#getCdiSubscriberId()">
 * getCdiSubscriberId </A> <BR>
 * <!-- link to the anchor of the attribute's setter method. It has the logical
 * visibility specified for the attribute --> <img
 * src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method"
 * title="public method" align="center" /> <A
 * HREF="#setCdiSubscriberId(java.lang.Integer)"> setCdiSubscriberId (Integer)
 * </A>
 * </P>
 * </TD>
 * </TR>
 * <TR>
 * <TD ALIGN="left" VALIGN="top"> <!-- the attributes are private no matter what
 * their logical visibility --> <img
 * src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private
 * attribute" title="private attribute" align="center" /> </TD>
 * <TD ALIGN="left" VALIGN="top"><B>cdiAccType</B></TD>
 * <TD ALIGN="left" VALIGN="top">String</TD>
 * <TD ALIGN="left" VALIGN="top">false</TD>
 * <TD ALIGN="left" VALIGN="top">
 * 
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
 * title="public method" align="center" /> <A HREF="#getCdiAccType()">
 * getCdiAccType </A> <BR>
 * <!-- link to the anchor of the attribute's setter method. It has the logical
 * visibility specified for the attribute --> <img
 * src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method"
 * title="public method" align="center" /> <A
 * HREF="#setCdiAccType(java.lang.String)"> setCdiAccType (String) </A>
 * </P>
 * </TD>
 * </TR>
 * <TR>
 * <TD ALIGN="left" VALIGN="top"> <!-- the attributes are private no matter what
 * their logical visibility --> <img
 * src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private
 * attribute" title="private attribute" align="center" /> </TD>
 * <TD ALIGN="left" VALIGN="top"><B>cdiStatus</B></TD>
 * <TD ALIGN="left" VALIGN="top">String</TD>
 * <TD ALIGN="left" VALIGN="top">false</TD>
 * <TD ALIGN="left" VALIGN="top">
 * 
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
 * title="public method" align="center" /> <A HREF="#getCdiStatus()">
 * getCdiStatus </A> <BR>
 * <!-- link to the anchor of the attribute's setter method. It has the logical
 * visibility specified for the attribute --> <img
 * src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method"
 * title="public method" align="center" /> <A
 * HREF="#setCdiStatus(java.lang.String)"> setCdiStatus (String) </A>
 * </P>
 * </TD>
 * </TR>
 * 
 * <TR>
 * <TD ALIGN="left" VALIGN="top"> <!-- the attributes are private no matter what
 * their logical visibility --> <img
 * src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private
 * attribute" title="private attribute" align="center" /> </TD>
 * <TD ALIGN="left" VALIGN="top"><B>cdiText</B></TD>
 * <TD ALIGN="left" VALIGN="top">String</TD>
 * <TD ALIGN="left" VALIGN="top">true</TD>
 * <TD ALIGN="left" VALIGN="top">
 * 
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
 * title="public method" align="center" /> <A HREF="#getCdiText()"> getCdiText
 * </A> <BR>
 * <!-- link to the anchor of the attribute's setter method. It has the logical
 * visibility specified for the attribute --> <img
 * src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method"
 * title="public method" align="center" /> <A
 * HREF="#setCdiText(java.lang.String)"> setCdiText (String) </A>
 * </P>
 * </TD>
 * </TR>
 * <TR>
 * <TD ALIGN="left" VALIGN="top"> <!-- the attributes are private no matter what
 * their logical visibility --> <img
 * src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private
 * attribute" title="private attribute" align="center" /> </TD>
 * <TD ALIGN="left" VALIGN="top"><B>cdiTimestamp</B></TD>
 * <TD ALIGN="left" VALIGN="top">Date</TD>
 * <TD ALIGN="left" VALIGN="top">true</TD>
 * <TD ALIGN="left" VALIGN="top">
 * 
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
 * title="public method" align="center" /> <A HREF="#getCdiTimestamp()">
 * getCdiTimestamp </A> <BR>
 * <!-- link to the anchor of the attribute's setter method. It has the logical
 * visibility specified for the attribute --> <img
 * src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method"
 * title="public method" align="center" /> <A
 * HREF="#setCdiTimestamp(com.cmgwds.eppix.util.Date)"> setCdiTimestamp (Date)
 * </A>
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
 * @see CdiDatabaseInt
 * 
 * @author
 * @version $Revision: $
 * 
 * @since $jdk$
 */
public class CdiDatabaseIntDMO extends DBO implements Serializable {
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
			FIELD_TYPE_INTEGER /* std public attribute: cdiSerial */,
			FIELD_TYPE_STRING /* std public attribute: cdiBillAcNo */,
			FIELD_TYPE_INTEGER /* std public attribute: cdiSubscriberId */,
			FIELD_TYPE_STRING /* std public attribute: cdiAccType */,
			FIELD_TYPE_STRING /* std public attribute: cdiStatus */,
			FIELD_TYPE_STRING /* std public attribute: cdiText */,
			FIELD_TYPE_DATETIME /* std public attribute: cdiTimestamp */

	};
	

	private final int[] fieldSizes = new int[] {
			0,
			cdiBillAcNoSize,
			0,
			cdiAccTypeSize,
			cdiStatusSize,
			cdiTextSize,
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
	public static final int cdiSerialFilter = 0; // filter index

	/**
	 * Unique field index used for Filtering.
	 * 
	 * @see com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int cdiBillAcNoFilter = 1; // filter index
	private static final int cdiBillAcNoSize = 8; // field size

	/**
	 * Unique field index used for Filtering.
	 * 
	 * @see com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int cdiSubscriberIdFilter = 2; // filter index

	/**
	 * Unique field index used for Filtering.
	 * 
	 * @see com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int cdiAccTypeFilter = 3; // filter index
	private static final int cdiAccTypeSize = 1; // field size

	/**
	 * Unique field index used for Filtering.
	 * 
	 * @see com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int cdiStatusFilter = 4; // filter index
	private static final int cdiStatusSize = 1; // field size

	/**
	 * Unique field index used for Filtering.
	 * 
	 * @see com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int cdiTextFilter = 5; // filter index
	private static final int cdiTextSize = 255; // field size

	/**
	 * Unique field index used for Filtering.
	 * 
	 * @see com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int cdiTimestampFilter = 6; // filter index

	// ~ Instance variables
	// /////////////////////////////////////////////////////

//
	// ---------------------
	// Field declarations
	// ---------------------
	// all attributes
	private Integer cdiSerial; // Loaded from Schema
	private Integer cdiSubscriberId; // Loaded from Schema
	private String cdiAccType; // Loaded from Schema
	private String cdiBillAcNo; // Loaded from Schema
	private String cdiStatus; // Loaded from Schema
	private String cdiText; // Loaded from Schema
	private DateTime cdiTimestamp; // Loaded from Schema
	
	// ~ Constructors
	// ///////////////////////////////////////////////////////////

	/**
	 * Creates a new CdiDatabaseIntDMO object.
	 */
	public CdiDatabaseIntDMO() {
	}

	// Constructor - taking public attributes
	/**
	 * Creates a new CdiDatabaseIntDMO object.
	 * 
	 * @param cdiSerial
	 *            DOCUMENT ME!
	 * @param cdiBillAcNo
	 *            DOCUMENT ME!
	 * @param cdiSubscriberId
	 *            DOCUMENT ME!
	 * @param cdiAccType
	 *            DOCUMENT ME!
	 * @param cdiStatus
	 *            DOCUMENT ME!
	 * @param cdiText
	 *            DOCUMENT ME!
	 * @param cdiTimestamp
	 *            DOCUMENT ME!
	 */
	public CdiDatabaseIntDMO(final Integer cdiSerial, final String cdiBillAcNo,
			final Integer cdiSubscriberId, final String cdiAccType,
			final String cdiStatus, final String cdiText,
			final DateTime cdiTimestamp) {
		this.cdiSerial = cdiSerial;

		this.cdiBillAcNo = cdiBillAcNo;

		this.cdiSubscriberId = cdiSubscriberId;

		this.cdiAccType = cdiAccType;

		this.cdiStatus = cdiStatus;

		this.cdiText = cdiText;

		this.cdiTimestamp = (cdiTimestamp != null) ? new DateTime(cdiTimestamp)
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
		this.setCdiSerial(key);
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
		return new DAOArgs(1).arg(this.cdiSerial);
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
				cdiSerial,
				(cdiBillAcNo == null) ? null
						: ((cdiBillAcNo.length() <= cdiBillAcNoSize) ? cdiBillAcNo
								: cdiBillAcNo.substring(0, cdiBillAcNoSize) // auto
																			// trimmed
																			// to
																			// fit,
																			// if
																			// required.
						),
				cdiSubscriberId,
				(cdiAccType == null) ? null
						: ((cdiAccType.length() <= cdiAccTypeSize) ? cdiAccType
								: cdiAccType.substring(0, cdiAccTypeSize) // auto
																			// trimmed
																			// to
																			// fit,
																			// if
																			// required.
						),
				(cdiStatus == null) ? null
						: ((cdiStatus.length() <= cdiStatusSize) ? cdiStatus
								: cdiStatus.substring(0, cdiStatusSize) // auto
																		// trimmed
																		// to
																		// fit,
																		// if
																		// required.
						),
				(cdiText == null) ? null
						: ((cdiText.length() <= cdiTextSize) ? cdiText
								: cdiText.substring(0, cdiTextSize) // auto
																	// trimmed
																	// to fit,
																	// if
																	// required.
						), cdiTimestamp

		};
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @param fields
	 *            DOCUMENT ME!
	 */
	protected void set(final Object[] fields) {
		cdiSerial = (Integer) fields[0];
		cdiBillAcNo = rtrim((String) fields[1]);
		cdiSubscriberId = (Integer) fields[2];
		cdiAccType = rtrim((String) fields[3]);
		cdiStatus = rtrim((String) fields[4]);
		cdiText = rtrim((String) fields[5]);
		cdiTimestamp = (DateTime) fields[6];

	}

	// Get methods
	// ///////////////////////////////////////////////////////////////
	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public Integer getCdiSerial() {
		return cdiSerial;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public String getCdiBillAcNo() {
		return cdiBillAcNo;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public Integer getCdiSubscriberId() {
		return cdiSubscriberId;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public String getCdiAccType() {
		return cdiAccType;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public String getCdiStatus() {
		return cdiStatus;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public DateTime getCdiTimestamp() {
		return (cdiTimestamp != null) ? new DateTime(cdiTimestamp) : null;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public String getCdiText() {
		return cdiText;
	}

	// Setter methods
	// ///////////////////////////////////////////////////////////////

	//
	// Master setter follows...
	//

	/**
	 * Setter that takes all attributes
	 */
	public void set(final Integer cdiSerial, final String cdiBillAcNo,
			final Integer cdiSubscriberId, final String cdiAccType,
			final String cdiStatus, final String cdiText,
			final DateTime cdiTimestamp			) {
		this.cdiSerial = cdiSerial;
		this.cdiBillAcNo = cdiBillAcNo;
		this.cdiSubscriberId = cdiSubscriberId;
		this.cdiAccType = cdiAccType;
		this.cdiStatus = cdiStatus;
		this.cdiText = cdiText;
		this.cdiTimestamp = (cdiTimestamp != null) ? new DateTime(cdiTimestamp)
				: null;
	}

	//
	// Public access modifiers if any
	// (provided for attributes that are public in the analysis model)
	//    

	/**
	 * Sets the CdiSerial field.
	 * 
	 * @param cdiSerial
	 */
	public void setCdiSerial(final Integer cdiSerial) {
		this.cdiSerial = cdiSerial;
	}

	/**
	 * Sets the CdiBillAcNo field.
	 * 
	 * @param cdiBillAcNo
	 */
	public void setCdiBillAcNo(final String cdiBillAcNo) {
		this.cdiBillAcNo = getPadded(cdiBillAcNo, cdiBillAcNoFilter);
	}

	/**
	 * Sets the CdiSubscriberId field.
	 * 
	 * @param cdiSubscriberId
	 */
	public void setCdiSubscriberId(final Integer cdiSubscriberId) {
		this.cdiSubscriberId = cdiSubscriberId;
	}

	/**
	 * Sets the CdiAccType field.
	 * 
	 * @param cdiAccType
	 */
	public void setCdiAccType(final String cdiAccType) {
		this.cdiAccType = getPadded(cdiAccType, cdiAccTypeFilter);
	}

	/**
	 * Sets the CdiStatus field.
	 * 
	 * @param cdiStatus
	 */
	public void setCdiStatus(final String cdiStatus) {
		this.cdiStatus = getPadded(cdiStatus, cdiStatusFilter);
	}

	/**
	 * Sets the CdiTimestamp field.
	 * 
	 * @param cdiTimestamp
	 */
	public void setCdiTimestamp(final DateTime cdiTimestamp) {
		this.cdiTimestamp = (cdiTimestamp != null) ? new DateTime(cdiTimestamp)
				: null;
	}

	/**
	 * Sets the CdiText field.
	 * 
	 * @param cdiText
	 */
	public void setCdiText(final String cdiText) {
		this.cdiText = getPadded(cdiText, cdiTextFilter);
	}
}
