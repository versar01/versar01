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
 * A value object to carry the data for an EanEpxactionNote.
 * 
 * 
 * <H3>An EanEpxactionNote is:</H3>
 * 
 * <!-- indent text -->
 * <TABLE BORDER="0" CELLPADDING="0" CELLSPACING="0">
 * <TR>
 * <TD WIDTH="25">&nbsp;</TD>
 * <TD>
 * 
 * Holds User Action Notes and Short Messages for Pending EPPIX Actions
 * 
 * <!-- end indent text --></TD>
 * </TR>
 * </TABLE>
 * 
 * 
 * <H3>EanEpxactionNote Value Object:</H3>
 * 
 * <!-- indent text -->
 * <TABLE BORDER="0" CELLPADDING="0" CELLSPACING="0">
 * <TR>
 * <TD WIDTH="25">&nbsp;</TD>
 * <TD>
 * 
 * <P>
 * This is a value object (called a Data Model Object or 'DMO'). It is used to
 * pass the data for an eanEpxactionNote into and out of the BASE module.
 * Because it's purpose is to carry data into and out of the module it is
 * visible outside the module.
 * </P>
 * <P>
 * This value object carries the data for one eanEpxactionNote. An
 * eanEpxactionNote is: Holds User Action Notes and Short Messages for Pending
 * EPPIX Actions
 * </P>
 * <P>
 * It corresponds to the business logic object EanEpxactionNote which contains
 * all the business behaviour of an eanEpxactionNote but is not visible outside
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
 * This value object contains fields for all the details of an eanEpxactionNote,
 * namely:
 * </P>
 * 
 * 
 * 
 * <P>
 * <U>Fields to carry the Attributes of an eanEpxactionNote:</U>
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
 * <TD ALIGN="left" VALIGN="top"><B>eanActionSeq</B></TD>
 * <TD ALIGN="left" VALIGN="top">Integer</TD>
 * <TD ALIGN="left" VALIGN="top">false</TD>
 * <TD ALIGN="left" VALIGN="top">
 * The Sequence of the Action ( eap_action_seq)
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
 * title="public method" align="center" /> <A HREF="#getEanActionSeq()">
 * getEanActionSeq </A> <BR>
 * <!-- link to the anchor of the attribute's setter method. It has the logical
 * visibility specified for the attribute --> <img
 * src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method"
 * title="public method" align="center" /> <A
 * HREF="#setEanActionSeq(java.lang.Integer)"> setEanActionSeq (Integer) </A>
 * </P>
 * </TD>
 * </TR>
 * <TR>
 * <TD ALIGN="left" VALIGN="top">
 * <!-- the attributes are private no matter what their logical visibility -->
 * <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif"
 * alt="private attribute" title="private attribute" align="center" /></TD>
 * <TD ALIGN="left" VALIGN="top"><B>eanTextSeq</B></TD>
 * <TD ALIGN="left" VALIGN="top">Integer</TD>
 * <TD ALIGN="left" VALIGN="top">false</TD>
 * <TD ALIGN="left" VALIGN="top">
 * The Sequence of the Note or Short Mesage
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
 * title="public method" align="center" /> <A HREF="#getEanTextSeq()">
 * getEanTextSeq </A> <BR>
 * <!-- link to the anchor of the attribute's setter method. It has the logical
 * visibility specified for the attribute --> <img
 * src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method"
 * title="public method" align="center" /> <A
 * HREF="#setEanTextSeq(java.lang.Integer)"> setEanTextSeq (Integer) </A>
 * </P>
 * </TD>
 * </TR>
 * <TR>
 * <TD ALIGN="left" VALIGN="top">
 * <!-- the attributes are private no matter what their logical visibility -->
 * <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif"
 * alt="private attribute" title="private attribute" align="center" /></TD>
 * <TD ALIGN="left" VALIGN="top"><B>eanText</B></TD>
 * <TD ALIGN="left" VALIGN="top">String</TD>
 * <TD ALIGN="left" VALIGN="top">false</TD>
 * <TD ALIGN="left" VALIGN="top">
 * The Note or the Short Message Text
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
 * title="public method" align="center" /> <A HREF="#getEanText()"> getEanText
 * </A> <BR>
 * <!-- link to the anchor of the attribute's setter method. It has the logical
 * visibility specified for the attribute --> <img
 * src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method"
 * title="public method" align="center" /> <A
 * HREF="#setEanText(java.lang.String)"> setEanText (String) </A>
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
 * @see EanEpxactionNote
 * 
 * @author
 * @version $Revision: $
 * 
 * @since $jdk$
 */
public class EanEpxactionNoteDMO extends DBO implements Serializable {
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
			FIELD_TYPE_INTEGER /* std public attribute: eanActionSeq */,
			FIELD_TYPE_INTEGER /* std public attribute: eanTextSeq */,
			FIELD_TYPE_STRING /* std public attribute: eanText */
	};
	
	  private final int[] fieldSizes = new int[] {
			  0,0,eanTextSize
	  };
	
	protected int[] fieldSizes() {
		return fieldSizes;
	}

	/**
	 * Unique field index used for Filtering. @see
	 * com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int eanActionSeqFilter = 0; // filter index

	/**
	 * Unique field index used for Filtering. @see
	 * com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int eanTextSeqFilter = 1; // filter index

	/**
	 * Unique field index used for Filtering. @see
	 * com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int eanTextFilter = 2; // filter index
	private static final int eanTextSize = 100; // field size

	// ~ Instance variables
	// /////////////////////////////////////////////////////

	// ---------------------
	// Field declarations
	// ---------------------
	// all attributes
	private Integer eanActionSeq; // Loaded from Schema
	private Integer eanTextSeq; // Loaded from Schema
	private String eanText; // Loaded from Schema

	// ~ Constructors
	// ///////////////////////////////////////////////////////////

	/**
	 * Creates a new EanEpxactionNoteDMO object.
	 */
	public EanEpxactionNoteDMO() {
	}

	// Constructor - taking public attributes
	/**
	 * Creates a new EanEpxactionNoteDMO object.
	 * 
	 * @param eanActionSeq
	 *            DOCUMENT ME!
	 * @param eanTextSeq
	 *            DOCUMENT ME!
	 * @param eanText
	 *            DOCUMENT ME!
	 */
	public EanEpxactionNoteDMO(final Integer eanActionSeq,
			final Integer eanTextSeq, final String eanText) {
		this.eanActionSeq = eanActionSeq;

		this.eanTextSeq = eanTextSeq;

		this.eanText = eanText;
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
				eanActionSeq,
				eanTextSeq,
				(eanText == null) ? null
						: ((eanText.length() <= eanTextSize) ? eanText
								: eanText.substring(0, eanTextSize) // auto
																	// trimmed
																	// to fit,
																	// if
																	// required.
						) };
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @param fields
	 *            DOCUMENT ME!
	 */
	protected void set(final Object[] fields) {
		eanActionSeq = (Integer) fields[0];
		eanTextSeq = (Integer) fields[1];
		eanText = rtrim((String) fields[2]);
	}

	// Get methods
	// ///////////////////////////////////////////////////////////////
	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public Integer getEanActionSeq() {
		return eanActionSeq;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public Integer getEanTextSeq() {
		return eanTextSeq;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public String getEanText() {
		return eanText;
	}

	// Setter methods
	// ///////////////////////////////////////////////////////////////

	//
	// Master setter follows...
	//

	/**
	 * Setter that takes all attributes
	 */
	public void set(final Integer eanActionSeq, final Integer eanTextSeq,
			final String eanText) {
		this.eanActionSeq = eanActionSeq;
		this.eanTextSeq = eanTextSeq;
		this.eanText = eanText;
	}

	//
	// Public access modifiers if any
	// (provided for attributes that are public in the analysis model)
	//    

	/**
	 * Sets the EanActionSeq field.
	 * 
	 * @param eanActionSeq
	 */
	public void setEanActionSeq(final Integer eanActionSeq) {
		this.eanActionSeq = eanActionSeq;
	}

	/**
	 * Sets the EanTextSeq field.
	 * 
	 * @param eanTextSeq
	 */
	public void setEanTextSeq(final Integer eanTextSeq) {
		this.eanTextSeq = eanTextSeq;
	}

	/**
	 * Sets the EanText field.
	 * 
	 * @param eanText
	 */
	public void setEanText(final String eanText) {
		this.eanText = eanText;
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
