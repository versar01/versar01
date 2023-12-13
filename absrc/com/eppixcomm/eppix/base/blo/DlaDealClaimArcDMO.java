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
import java.math.BigDecimal;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;
import com.eppixcomm.eppix.common.util.Date;

// ---------------------
// class javadoc
// ---------------------
/**
 * A value object to carry the data for a DlaDealClaimArc.
 * 
 * 
 * <H3> A DlaDealClaimArc is: </H3>
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
 * <H3> DlaDealClaimArc Value Object: </H3>
 * 
 * <!-- indent text --> <TABLE BORDER="0" CELLPADDING="0" CELLSPACING="0">
 * <TR>
 * <TD WIDTH="25">&nbsp;</TD>
 * <TD>
 * 
 * <P>
 * This is a value object (called a Data Model Object or 'DMO'). It is used to
 * pass the data for a dlaDealClaimArc into and out of the BASE module. Because
 * it's purpose is to carry data into and out of the module it is visible
 * outside the module.
 * </P>
 * <P>
 * This value object carries the data for one dlaDealClaimArc. A dlaDealClaimArc
 * is: DOCUMENT ME! - by adding a description of this class via the class
 * diagram.
 * </P>
 * <P>
 * It corresponds to the business logic object DlaDealClaimArc which contains
 * all the business behaviour of a dlaDealClaimArc but is not visible outside
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
 * This value object contains fields for all the details of a dlaDealClaimArc,
 * namely:
 * </P>
 * 
 * 
 * 
 * <P>
 * <U>Fields to carry the Attributes of a dlaDealClaimArc:</U>
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
 * <TD ALIGN="left" VALIGN="top"><B>dlaClaimId</B></TD>
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
 * title="public method" align="center" /> <A HREF="#getDlaClaimId()">
 * getDlaClaimId </A> <BR>
 * <!-- link to the anchor of the attribute's setter method. It has the logical
 * visibility specified for the attribute --> <img
 * src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method"
 * title="public method" align="center" /> <A
 * HREF="#setDlaClaimId(java.lang.Integer)"> setDlaClaimId (Integer) </A>
 * </P>
 * </TD>
 * </TR>
 * <TR>
 * <TD ALIGN="left" VALIGN="top"> <!-- the attributes are private no matter what
 * their logical visibility --> <img
 * src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private
 * attribute" title="private attribute" align="center" /> </TD>
 * <TD ALIGN="left" VALIGN="top"><B>dlaActType</B></TD>
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
 * title="public method" align="center" /> <A HREF="#getDlaActType()">
 * getDlaActType </A> <BR>
 * <!-- link to the anchor of the attribute's setter method. It has the logical
 * visibility specified for the attribute --> <img
 * src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method"
 * title="public method" align="center" /> <A
 * HREF="#setDlaActType(java.lang.String)"> setDlaActType (String) </A>
 * </P>
 * </TD>
 * </TR>
 * <TR>
 * <TD ALIGN="left" VALIGN="top"> <!-- the attributes are private no matter what
 * their logical visibility --> <img
 * src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private
 * attribute" title="private attribute" align="center" /> </TD>
 * <TD ALIGN="left" VALIGN="top"><B>dlaClaimDate</B></TD>
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
 * title="public method" align="center" /> <A HREF="#getDlaClaimDate()">
 * getDlaClaimDate </A> <BR>
 * <!-- link to the anchor of the attribute's setter method. It has the logical
 * visibility specified for the attribute --> <img
 * src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method"
 * title="public method" align="center" /> <A
 * HREF="#setDlaClaimDate(com.cmgwds.eppix.util.Date)"> setDlaClaimDate (Date)
 * </A>
 * </P>
 * </TD>
 * </TR>
 * <TR>
 * <TD ALIGN="left" VALIGN="top"> <!-- the attributes are private no matter what
 * their logical visibility --> <img
 * src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private
 * attribute" title="private attribute" align="center" /> </TD>
 * <TD ALIGN="left" VALIGN="top"><B>dlaContractDate</B></TD>
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
 * title="public method" align="center" /> <A HREF="#getDlaContractDate()">
 * getDlaContractDate </A> <BR>
 * <!-- link to the anchor of the attribute's setter method. It has the logical
 * visibility specified for the attribute --> <img
 * src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method"
 * title="public method" align="center" /> <A
 * HREF="#setDlaContractDate(com.cmgwds.eppix.util.Date)"> setDlaContractDate
 * (Date) </A>
 * </P>
 * </TD>
 * </TR>
 * <TR>
 * <TD ALIGN="left" VALIGN="top"> <!-- the attributes are private no matter what
 * their logical visibility --> <img
 * src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private
 * attribute" title="private attribute" align="center" /> </TD>
 * <TD ALIGN="left" VALIGN="top"><B>dlaSubscriberId</B></TD>
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
 * title="public method" align="center" /> <A HREF="#getDlaSubscriberId()">
 * getDlaSubscriberId </A> <BR>
 * <!-- link to the anchor of the attribute's setter method. It has the logical
 * visibility specified for the attribute --> <img
 * src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method"
 * title="public method" align="center" /> <A
 * HREF="#setDlaSubscriberId(java.lang.String)"> setDlaSubscriberId (String)
 * </A>
 * </P>
 * </TD>
 * </TR>
 * <TR>
 * <TD ALIGN="left" VALIGN="top"> <!-- the attributes are private no matter what
 * their logical visibility --> <img
 * src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private
 * attribute" title="private attribute" align="center" /> </TD>
 * <TD ALIGN="left" VALIGN="top"><B>dlaImei1</B></TD>
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
 * title="public method" align="center" /> <A HREF="#getDlaImei1()"> getDlaImei1
 * </A> <BR>
 * <!-- link to the anchor of the attribute's setter method. It has the logical
 * visibility specified for the attribute --> <img
 * src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method"
 * title="public method" align="center" /> <A
 * HREF="#setDlaImei1(java.lang.String)"> setDlaImei1 (String) </A>
 * </P>
 * </TD>
 * </TR>
 * <TR>
 * <TD ALIGN="left" VALIGN="top"> <!-- the attributes are private no matter what
 * their logical visibility --> <img
 * src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private
 * attribute" title="private attribute" align="center" /> </TD>
 * <TD ALIGN="left" VALIGN="top"><B>dlaImei2</B></TD>
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
 * title="public method" align="center" /> <A HREF="#getDlaImei2()"> getDlaImei2
 * </A> <BR>
 * <!-- link to the anchor of the attribute's setter method. It has the logical
 * visibility specified for the attribute --> <img
 * src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method"
 * title="public method" align="center" /> <A
 * HREF="#setDlaImei2(java.lang.String)"> setDlaImei2 (String) </A>
 * </P>
 * </TD>
 * </TR>
 * <TR>
 * <TD ALIGN="left" VALIGN="top"> <!-- the attributes are private no matter what
 * their logical visibility --> <img
 * src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private
 * attribute" title="private attribute" align="center" /> </TD>
 * <TD ALIGN="left" VALIGN="top"><B>dlaSerial1</B></TD>
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
 * title="public method" align="center" /> <A HREF="#getDlaSerial1()">
 * getDlaSerial1 </A> <BR>
 * <!-- link to the anchor of the attribute's setter method. It has the logical
 * visibility specified for the attribute --> <img
 * src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method"
 * title="public method" align="center" /> <A
 * HREF="#setDlaSerial1(java.lang.String)"> setDlaSerial1 (String) </A>
 * </P>
 * </TD>
 * </TR>
 * <TR>
 * <TD ALIGN="left" VALIGN="top"> <!-- the attributes are private no matter what
 * their logical visibility --> <img
 * src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private
 * attribute" title="private attribute" align="center" /> </TD>
 * <TD ALIGN="left" VALIGN="top"><B>dlaSerial2</B></TD>
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
 * title="public method" align="center" /> <A HREF="#getDlaSerial2()">
 * getDlaSerial2 </A> <BR>
 * <!-- link to the anchor of the attribute's setter method. It has the logical
 * visibility specified for the attribute --> <img
 * src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method"
 * title="public method" align="center" /> <A
 * HREF="#setDlaSerial2(java.lang.String)"> setDlaSerial2 (String) </A>
 * </P>
 * </TD>
 * </TR>
 * <TR>
 * <TD ALIGN="left" VALIGN="top"> <!-- the attributes are private no matter what
 * their logical visibility --> <img
 * src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private
 * attribute" title="private attribute" align="center" /> </TD>
 * <TD ALIGN="left" VALIGN="top"><B>dlaSerial3</B></TD>
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
 * title="public method" align="center" /> <A HREF="#getDlaSerial3()">
 * getDlaSerial3 </A> <BR>
 * <!-- link to the anchor of the attribute's setter method. It has the logical
 * visibility specified for the attribute --> <img
 * src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method"
 * title="public method" align="center" /> <A
 * HREF="#setDlaSerial3(java.lang.String)"> setDlaSerial3 (String) </A>
 * </P>
 * </TD>
 * </TR>
 * <TR>
 * <TD ALIGN="left" VALIGN="top"> <!-- the attributes are private no matter what
 * their logical visibility --> <img
 * src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private
 * attribute" title="private attribute" align="center" /> </TD>
 * <TD ALIGN="left" VALIGN="top"><B>dlaSimNo1</B></TD>
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
 * title="public method" align="center" /> <A HREF="#getDlaSimNo1()">
 * getDlaSimNo1 </A> <BR>
 * <!-- link to the anchor of the attribute's setter method. It has the logical
 * visibility specified for the attribute --> <img
 * src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method"
 * title="public method" align="center" /> <A
 * HREF="#setDlaSimNo1(java.lang.String)"> setDlaSimNo1 (String) </A>
 * </P>
 * </TD>
 * </TR>
 * <TR>
 * <TD ALIGN="left" VALIGN="top"> <!-- the attributes are private no matter what
 * their logical visibility --> <img
 * src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private
 * attribute" title="private attribute" align="center" /> </TD>
 * <TD ALIGN="left" VALIGN="top"><B>dlaSimNo2</B></TD>
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
 * title="public method" align="center" /> <A HREF="#getDlaSimNo2()">
 * getDlaSimNo2 </A> <BR>
 * <!-- link to the anchor of the attribute's setter method. It has the logical
 * visibility specified for the attribute --> <img
 * src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method"
 * title="public method" align="center" /> <A
 * HREF="#setDlaSimNo2(java.lang.String)"> setDlaSimNo2 (String) </A>
 * </P>
 * </TD>
 * </TR>
 * <TR>
 * <TD ALIGN="left" VALIGN="top"> <!-- the attributes are private no matter what
 * their logical visibility --> <img
 * src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private
 * attribute" title="private attribute" align="center" /> </TD>
 * <TD ALIGN="left" VALIGN="top"><B>dlaSimProd1</B></TD>
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
 * title="public method" align="center" /> <A HREF="#getDlaSimProd1()">
 * getDlaSimProd1 </A> <BR>
 * <!-- link to the anchor of the attribute's setter method. It has the logical
 * visibility specified for the attribute --> <img
 * src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method"
 * title="public method" align="center" /> <A
 * HREF="#setDlaSimProd1(java.lang.String)"> setDlaSimProd1 (String) </A>
 * </P>
 * </TD>
 * </TR>
 * <TR>
 * <TD ALIGN="left" VALIGN="top"> <!-- the attributes are private no matter what
 * their logical visibility --> <img
 * src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private
 * attribute" title="private attribute" align="center" /> </TD>
 * <TD ALIGN="left" VALIGN="top"><B>dlaSimProd2</B></TD>
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
 * title="public method" align="center" /> <A HREF="#getDlaSimProd2()">
 * getDlaSimProd2 </A> <BR>
 * <!-- link to the anchor of the attribute's setter method. It has the logical
 * visibility specified for the attribute --> <img
 * src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method"
 * title="public method" align="center" /> <A
 * HREF="#setDlaSimProd2(java.lang.String)"> setDlaSimProd2 (String) </A>
 * </P>
 * </TD>
 * </TR>
 * <TR>
 * <TD ALIGN="left" VALIGN="top"> <!-- the attributes are private no matter what
 * their logical visibility --> <img
 * src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private
 * attribute" title="private attribute" align="center" /> </TD>
 * <TD ALIGN="left" VALIGN="top"><B>dlaDealerId</B></TD>
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
 * title="public method" align="center" /> <A HREF="#getDlaDealerId()">
 * getDlaDealerId </A> <BR>
 * <!-- link to the anchor of the attribute's setter method. It has the logical
 * visibility specified for the attribute --> <img
 * src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method"
 * title="public method" align="center" /> <A
 * HREF="#setDlaDealerId(java.lang.String)"> setDlaDealerId (String) </A>
 * </P>
 * </TD>
 * </TR>
 * <TR>
 * <TD ALIGN="left" VALIGN="top"> <!-- the attributes are private no matter what
 * their logical visibility --> <img
 * src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private
 * attribute" title="private attribute" align="center" /> </TD>
 * <TD ALIGN="left" VALIGN="top"><B>dlaPackageCode</B></TD>
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
 * title="public method" align="center" /> <A HREF="#getDlaPackageCode()">
 * getDlaPackageCode </A> <BR>
 * <!-- link to the anchor of the attribute's setter method. It has the logical
 * visibility specified for the attribute --> <img
 * src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method"
 * title="public method" align="center" /> <A
 * HREF="#setDlaPackageCode(java.lang.String)"> setDlaPackageCode (String) </A>
 * </P>
 * </TD>
 * </TR>
 * <TR>
 * <TD ALIGN="left" VALIGN="top"> <!-- the attributes are private no matter what
 * their logical visibility --> <img
 * src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private
 * attribute" title="private attribute" align="center" /> </TD>
 * <TD ALIGN="left" VALIGN="top"><B>dlaImei1Amt</B></TD>
 * <TD ALIGN="left" VALIGN="top">BigDecimal</TD>
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
 * title="public method" align="center" /> <A HREF="#getDlaImei1Amt()">
 * getDlaImei1Amt </A> <BR>
 * <!-- link to the anchor of the attribute's setter method. It has the logical
 * visibility specified for the attribute --> <img
 * src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method"
 * title="public method" align="center" /> <A
 * HREF="#setDlaImei1Amt(java.math.BigDecimal)"> setDlaImei1Amt (BigDecimal)
 * </A>
 * </P>
 * </TD>
 * </TR>
 * <TR>
 * <TD ALIGN="left" VALIGN="top"> <!-- the attributes are private no matter what
 * their logical visibility --> <img
 * src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private
 * attribute" title="private attribute" align="center" /> </TD>
 * <TD ALIGN="left" VALIGN="top"><B>dlaImei2Amt</B></TD>
 * <TD ALIGN="left" VALIGN="top">BigDecimal</TD>
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
 * title="public method" align="center" /> <A HREF="#getDlaImei2Amt()">
 * getDlaImei2Amt </A> <BR>
 * <!-- link to the anchor of the attribute's setter method. It has the logical
 * visibility specified for the attribute --> <img
 * src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method"
 * title="public method" align="center" /> <A
 * HREF="#setDlaImei2Amt(java.math.BigDecimal)"> setDlaImei2Amt (BigDecimal)
 * </A>
 * </P>
 * </TD>
 * </TR>
 * <TR>
 * <TD ALIGN="left" VALIGN="top"> <!-- the attributes are private no matter what
 * their logical visibility --> <img
 * src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private
 * attribute" title="private attribute" align="center" /> </TD>
 * <TD ALIGN="left" VALIGN="top"><B>dlaSerial1Amt</B></TD>
 * <TD ALIGN="left" VALIGN="top">BigDecimal</TD>
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
 * title="public method" align="center" /> <A HREF="#getDlaSerial1Amt()">
 * getDlaSerial1Amt </A> <BR>
 * <!-- link to the anchor of the attribute's setter method. It has the logical
 * visibility specified for the attribute --> <img
 * src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method"
 * title="public method" align="center" /> <A
 * HREF="#setDlaSerial1Amt(java.math.BigDecimal)"> setDlaSerial1Amt (BigDecimal)
 * </A>
 * </P>
 * </TD>
 * </TR>
 * <TR>
 * <TD ALIGN="left" VALIGN="top"> <!-- the attributes are private no matter what
 * their logical visibility --> <img
 * src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private
 * attribute" title="private attribute" align="center" /> </TD>
 * <TD ALIGN="left" VALIGN="top"><B>dlaSerial2Amt</B></TD>
 * <TD ALIGN="left" VALIGN="top">BigDecimal</TD>
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
 * title="public method" align="center" /> <A HREF="#getDlaSerial2Amt()">
 * getDlaSerial2Amt </A> <BR>
 * <!-- link to the anchor of the attribute's setter method. It has the logical
 * visibility specified for the attribute --> <img
 * src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method"
 * title="public method" align="center" /> <A
 * HREF="#setDlaSerial2Amt(java.math.BigDecimal)"> setDlaSerial2Amt (BigDecimal)
 * </A>
 * </P>
 * </TD>
 * </TR>
 * <TR>
 * <TD ALIGN="left" VALIGN="top"> <!-- the attributes are private no matter what
 * their logical visibility --> <img
 * src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private
 * attribute" title="private attribute" align="center" /> </TD>
 * <TD ALIGN="left" VALIGN="top"><B>dlaSerial3Amt</B></TD>
 * <TD ALIGN="left" VALIGN="top">BigDecimal</TD>
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
 * title="public method" align="center" /> <A HREF="#getDlaSerial3Amt()">
 * getDlaSerial3Amt </A> <BR>
 * <!-- link to the anchor of the attribute's setter method. It has the logical
 * visibility specified for the attribute --> <img
 * src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method"
 * title="public method" align="center" /> <A
 * HREF="#setDlaSerial3Amt(java.math.BigDecimal)"> setDlaSerial3Amt (BigDecimal)
 * </A>
 * </P>
 * </TD>
 * </TR>
 * <TR>
 * <TD ALIGN="left" VALIGN="top"> <!-- the attributes are private no matter what
 * their logical visibility --> <img
 * src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private
 * attribute" title="private attribute" align="center" /> </TD>
 * <TD ALIGN="left" VALIGN="top"><B>dlaSimAmt1</B></TD>
 * <TD ALIGN="left" VALIGN="top">BigDecimal</TD>
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
 * title="public method" align="center" /> <A HREF="#getDlaSimAmt1()">
 * getDlaSimAmt1 </A> <BR>
 * <!-- link to the anchor of the attribute's setter method. It has the logical
 * visibility specified for the attribute --> <img
 * src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method"
 * title="public method" align="center" /> <A
 * HREF="#setDlaSimAmt1(java.math.BigDecimal)"> setDlaSimAmt1 (BigDecimal) </A>
 * </P>
 * </TD>
 * </TR>
 * <TR>
 * <TD ALIGN="left" VALIGN="top"> <!-- the attributes are private no matter what
 * their logical visibility --> <img
 * src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private
 * attribute" title="private attribute" align="center" /> </TD>
 * <TD ALIGN="left" VALIGN="top"><B>dlaSimAmt2</B></TD>
 * <TD ALIGN="left" VALIGN="top">BigDecimal</TD>
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
 * title="public method" align="center" /> <A HREF="#getDlaSimAmt2()">
 * getDlaSimAmt2 </A> <BR>
 * <!-- link to the anchor of the attribute's setter method. It has the logical
 * visibility specified for the attribute --> <img
 * src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method"
 * title="public method" align="center" /> <A
 * HREF="#setDlaSimAmt2(java.math.BigDecimal)"> setDlaSimAmt2 (BigDecimal) </A>
 * </P>
 * </TD>
 * </TR>
 * <TR>
 * <TD ALIGN="left" VALIGN="top"> <!-- the attributes are private no matter what
 * their logical visibility --> <img
 * src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private
 * attribute" title="private attribute" align="center" /> </TD>
 * <TD ALIGN="left" VALIGN="top"><B>dlaClmAmt</B></TD>
 * <TD ALIGN="left" VALIGN="top">BigDecimal</TD>
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
 * title="public method" align="center" /> <A HREF="#getDlaClmAmt()">
 * getDlaClmAmt </A> <BR>
 * <!-- link to the anchor of the attribute's setter method. It has the logical
 * visibility specified for the attribute --> <img
 * src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method"
 * title="public method" align="center" /> <A
 * HREF="#setDlaClmAmt(java.math.BigDecimal)"> setDlaClmAmt (BigDecimal) </A>
 * </P>
 * </TD>
 * </TR>
 * <TR>
 * <TD ALIGN="left" VALIGN="top"> <!-- the attributes are private no matter what
 * their logical visibility --> <img
 * src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private
 * attribute" title="private attribute" align="center" /> </TD>
 * <TD ALIGN="left" VALIGN="top"><B>dlaSaveDate</B></TD>
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
 * title="public method" align="center" /> <A HREF="#getDlaSaveDate()">
 * getDlaSaveDate </A> <BR>
 * <!-- link to the anchor of the attribute's setter method. It has the logical
 * visibility specified for the attribute --> <img
 * src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method"
 * title="public method" align="center" /> <A
 * HREF="#setDlaSaveDate(com.cmgwds.eppix.util.Date)"> setDlaSaveDate (Date)
 * </A>
 * </P>
 * </TD>
 * </TR>
 * <TR>
 * <TD ALIGN="left" VALIGN="top"> <!-- the attributes are private no matter what
 * their logical visibility --> <img
 * src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private
 * attribute" title="private attribute" align="center" /> </TD>
 * <TD ALIGN="left" VALIGN="top"><B>dlaUserId</B></TD>
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
 * title="public method" align="center" /> <A HREF="#getDlaUserId()">
 * getDlaUserId </A> <BR>
 * <!-- link to the anchor of the attribute's setter method. It has the logical
 * visibility specified for the attribute --> <img
 * src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method"
 * title="public method" align="center" /> <A
 * HREF="#setDlaUserId(java.lang.String)"> setDlaUserId (String) </A>
 * </P>
 * </TD>
 * </TR>
 * <TR>
 * <TD ALIGN="left" VALIGN="top"> <!-- the attributes are private no matter what
 * their logical visibility --> <img
 * src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private
 * attribute" title="private attribute" align="center" /> </TD>
 * <TD ALIGN="left" VALIGN="top"><B>dlaErrWarn</B></TD>
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
 * title="public method" align="center" /> <A HREF="#getDlaErrWarn()">
 * getDlaErrWarn </A> <BR>
 * <!-- link to the anchor of the attribute's setter method. It has the logical
 * visibility specified for the attribute --> <img
 * src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method"
 * title="public method" align="center" /> <A
 * HREF="#setDlaErrWarn(java.lang.String)"> setDlaErrWarn (String) </A>
 * </P>
 * </TD>
 * </TR>
 * <TR>
 * <TD ALIGN="left" VALIGN="top"> <!-- the attributes are private no matter what
 * their logical visibility --> <img
 * src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private
 * attribute" title="private attribute" align="center" /> </TD>
 * <TD ALIGN="left" VALIGN="top"><B>dlaSubmitDate</B></TD>
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
 * title="public method" align="center" /> <A HREF="#getDlaSubmitDate()">
 * getDlaSubmitDate </A> <BR>
 * <!-- link to the anchor of the attribute's setter method. It has the logical
 * visibility specified for the attribute --> <img
 * src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method"
 * title="public method" align="center" /> <A
 * HREF="#setDlaSubmitDate(com.cmgwds.eppix.util.Date)"> setDlaSubmitDate (Date)
 * </A>
 * </P>
 * </TD>
 * </TR>
 * <TR>
 * <TD ALIGN="left" VALIGN="top"> <!-- the attributes are private no matter what
 * their logical visibility --> <img
 * src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private
 * attribute" title="private attribute" align="center" /> </TD>
 * <TD ALIGN="left" VALIGN="top"><B>dlaErrorFlag</B></TD>
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
 * title="public method" align="center" /> <A HREF="#getDlaErrorFlag()">
 * getDlaErrorFlag </A> <BR>
 * <!-- link to the anchor of the attribute's setter method. It has the logical
 * visibility specified for the attribute --> <img
 * src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method"
 * title="public method" align="center" /> <A
 * HREF="#setDlaErrorFlag(java.lang.String)"> setDlaErrorFlag (String) </A>
 * </P>
 * </TD>
 * </TR>
 * <TR>
 * <TD ALIGN="left" VALIGN="top"> <!-- the attributes are private no matter what
 * their logical visibility --> <img
 * src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private
 * attribute" title="private attribute" align="center" /> </TD>
 * <TD ALIGN="left" VALIGN="top"><B>dlaErrRetryCnt</B></TD>
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
 * title="public method" align="center" /> <A HREF="#getDlaErrRetryCnt()">
 * getDlaErrRetryCnt </A> <BR>
 * <!-- link to the anchor of the attribute's setter method. It has the logical
 * visibility specified for the attribute --> <img
 * src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method"
 * title="public method" align="center" /> <A
 * HREF="#setDlaErrRetryCnt(java.lang.Integer)"> setDlaErrRetryCnt (Integer)
 * </P>
 * </TD>
 * </TR>
 * <TR>
 * <TD ALIGN="left" VALIGN="top"> <!-- the attributes are private no matter what
 * their logical visibility --> <img
 * src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private
 * attribute" title="private attribute" align="center" /> </TD>
 * <TD ALIGN="left" VALIGN="top"><B>dlaSourceSystem</B></TD>
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
 * title="public method" align="center" /> <A HREF="#getDlaSourceSystem()">
 * getDlaSourceSystem </A> <BR>
 * <!-- link to the anchor of the attribute's setter method. It has the logical
 * visibility specified for the attribute --> <img
 * src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method"
 * title="public method" align="center" /> <A
 * HREF="#setDlaSourceSystem(java.lang.String)"> setDlaSourceSystem (String)
 * </P>
 * </TD>
 * </TR>
 * <TR>
 * <TD ALIGN="left" VALIGN="top"> <!-- the attributes are private no matter what
 * their logical visibility --> <img
 * src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private
 * attribute" title="private attribute" align="center" /> </TD>
 * <TD ALIGN="left" VALIGN="top"><B>dlaOfferId</B></TD>
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
 * title="public method" align="center" /> <A HREF="#getDlaOfferId()">
 * getDlaOfferId </A> <BR>
 * <!-- link to the anchor of the attribute's setter method. It has the logical
 * visibility specified for the attribute --> <img
 * src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method"
 * title="public method" align="center" /> <A
 * HREF="#setDlaOfferId(java.lang.Integer)"> setDlaOfferId (Integer)
 * </P>
 * </TD>
 * </TR>
 * <TR>
 * <TD ALIGN="left" VALIGN="top"> <!-- the attributes are private no matter what
 * their logical visibility --> <img
 * src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private
 * attribute" title="private attribute" align="center" /> </TD>
 * <TD ALIGN="left" VALIGN="top"><B>dlaGroupIndex</B></TD>
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
 * title="public method" align="center" /> <A HREF="#getDlaGroupIndex()">
 * getDlaGroupIndex </A> <BR>
 * <!-- link to the anchor of the attribute's setter method. It has the logical
 * visibility specified for the attribute --> <img
 * src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method"
 * title="public method" align="center" /> <A
 * HREF="#setDlaGroupIndex(java.lang.Integer)"> setDlaGroupIndex (Integer)
 * </P>
 * </TD>
 * </TR>
 * <TR>
 * <TD ALIGN="left" VALIGN="top"> <!-- the attributes are private no matter what
 * their logical visibility --> <img
 * src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private
 * attribute" title="private attribute" align="center" /> </TD>
 * <TD ALIGN="left" VALIGN="top"><B>dlaCreateDate</B></TD>
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
 * title="public method" align="center" /> <A HREF="#getDlaCreateDate()">
 * getDlaCreateDate </A> <BR>
 * <!-- link to the anchor of the attribute's setter method. It has the logical
 * visibility specified for the attribute --> <img
 * src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method"
 * title="public method" align="center" /> <A
 * HREF="#setDlaCreateDate(java.lang.Date)"> setDlaCreateDate (Date) </A> </A>
 * </P>
 * </TD>
 * </TR>
 * <TR>
 * <TD ALIGN="left" VALIGN="top"> <!-- the attributes are private no matter what
 * their logical visibility --> <img
 * src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private
 * attribute" title="private attribute" align="center" /> </TD>
 * <TD ALIGN="left" VALIGN="top"><B>dlaClaimPostId</B></TD>
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
 * title="public method" align="center" /> <A HREF="#getDlaClaimPostId()">
 * getDlaClaimPostId </A> <BR>
 * <!-- link to the anchor of the attribute's setter method. It has the logical
 * visibility specified for the attribute --> <img
 * src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method"
 * title="public method" align="center" /> <A
 * HREF="#setDlaClaimPostId(java.lang.Integer)"> setDlaClaimPostId (Integer) </A> </A>
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
 * @see DlaDealClaimArc
 * 
 * @author
 * @version $Revision: $
 * 
 * @since $jdk$
 */
public class DlaDealClaimArcDMO extends DBO implements Serializable {
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
			FIELD_TYPE_INTEGER /* std public attribute: dlaClaimId */,
			FIELD_TYPE_STRING /* std public attribute: dlaActType */,
			FIELD_TYPE_DATEONLY /* std public attribute: dlaClaimDate */,
			FIELD_TYPE_DATEONLY /* std public attribute: dlaContractDate */,
			FIELD_TYPE_STRING /* std public attribute: dlaSubscriberId */,
			FIELD_TYPE_STRING /* std public attribute: dlaImei1 */,
			FIELD_TYPE_STRING /* std public attribute: dlaImei2 */,
			FIELD_TYPE_STRING /* std public attribute: dlaSerial1 */,
			FIELD_TYPE_STRING /* std public attribute: dlaSerial2 */,
			FIELD_TYPE_STRING /* std public attribute: dlaSerial3 */,
			FIELD_TYPE_STRING /* std public attribute: dlaSimNo1 */,
			FIELD_TYPE_STRING /* std public attribute: dlaSimNo2 */,
			FIELD_TYPE_STRING /* std public attribute: dlaSimProd1 */,
			FIELD_TYPE_STRING /* std public attribute: dlaSimProd2 */,
			FIELD_TYPE_STRING /* std public attribute: dlaDealerId */,
			FIELD_TYPE_STRING /* std public attribute: dlaPackageCode */,
			FIELD_TYPE_BIGDECIMAL /* std public attribute: dlaImei1Amt */,
			FIELD_TYPE_BIGDECIMAL /* std public attribute: dlaImei2Amt */,
			FIELD_TYPE_BIGDECIMAL /* std public attribute: dlaSerial1Amt */,
			FIELD_TYPE_BIGDECIMAL /* std public attribute: dlaSerial2Amt */,
			FIELD_TYPE_BIGDECIMAL /* std public attribute: dlaSerial3Amt */,
			FIELD_TYPE_BIGDECIMAL /* std public attribute: dlaSimAmt1 */,
			FIELD_TYPE_BIGDECIMAL /* std public attribute: dlaSimAmt2 */,
			FIELD_TYPE_BIGDECIMAL /* std public attribute: dlaClmAmt */,
			FIELD_TYPE_DATEONLY /* std public attribute: dlaSaveDate */,
			FIELD_TYPE_STRING /* std public attribute: dlaUserId */,
			FIELD_TYPE_STRING /* std public attribute: dlaErrWarn */,
			FIELD_TYPE_DATEONLY /* std public attribute: dlaSubmitDate */,
			FIELD_TYPE_STRING /* std public attribute: dlaErrorFlag */,
			FIELD_TYPE_INTEGER /* std public attribute: dlaErrRetryCnt */,
			FIELD_TYPE_STRING /* std public attribute: dlaSourceSystem */,
			FIELD_TYPE_INTEGER /* std public attribute: dlaOfferId */,
			FIELD_TYPE_INTEGER /* std public attribute: dlaGroupIndex */,
			FIELD_TYPE_DATEONLY /* std public attribute: dlaCreateDate */,
			FIELD_TYPE_INTEGER /* std public attribute: dlaClaimPostId */

	};
	
	  private final int[] fieldSizes = new int[] {
			  0,
			  dlaActTypeSize,
			  0,
			  0,
			  dlaSubscriberIdSize,
			  dlaImei1Size,
			  dlaImei2Size,
			  dlaSerial1Size,
			  dlaSerial2Size,
			  dlaSerial3Size,
			  dlaSimNo1Size,
			  dlaSimNo2Size,
			  dlaSimProd1Size,
			  dlaSimProd2Size,
			  dlaDealerIdSize,
			  dlaPackageCodeSize,
			  0,
			  0,
			  0,
			  0,
			  0,
			  0,
			  0,
			  0,
			  0,
			  dlaUserIdSize,
			  dlaErrWarnSize,
			  0,
			  dlaErrorFlagSize,
			  0,
			  dlaSourceSystemSize,
			  0,
			  0,
			  0,
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
	public static final int dlaClaimIdFilter = 0; // filter index

	/**
	 * Unique field index used for Filtering.
	 * 
	 * @see com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int dlaActTypeFilter = 1; // filter index
	private static final int dlaActTypeSize = 30; // field size

	/**
	 * Unique field index used for Filtering.
	 * 
	 * @see com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int dlaClaimDateFilter = 2; // filter index

	/**
	 * Unique field index used for Filtering.
	 * 
	 * @see com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int dlaContractDateFilter = 3; // filter index

	/**
	 * Unique field index used for Filtering.
	 * 
	 * @see com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int dlaSubscriberIdFilter = 4; // filter index
	private static final int dlaSubscriberIdSize = 15; // field size

	/**
	 * Unique field index used for Filtering.
	 * 
	 * @see com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int dlaImei1Filter = 5; // filter index
	private static final int dlaImei1Size = 15; // field size

	/**
	 * Unique field index used for Filtering.
	 * 
	 * @see com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int dlaImei2Filter = 6; // filter index
	private static final int dlaImei2Size = 15; // field size

	/**
	 * Unique field index used for Filtering.
	 * 
	 * @see com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int dlaSerial1Filter = 7; // filter index
	private static final int dlaSerial1Size = 50; // field size

	/**
	 * Unique field index used for Filtering.
	 * 
	 * @see com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int dlaSerial2Filter = 8; // filter index
	private static final int dlaSerial2Size = 50; // field size

	/**
	 * Unique field index used for Filtering.
	 * 
	 * @see com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int dlaSerial3Filter = 9; // filter index
	private static final int dlaSerial3Size = 50; // field size

	/**
	 * Unique field index used for Filtering.
	 * 
	 * @see com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int dlaSimNo1Filter = 10; // filter index
	private static final int dlaSimNo1Size = 15; // field size

	/**
	 * Unique field index used for Filtering.
	 * 
	 * @see com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int dlaSimNo2Filter = 11; // filter index
	private static final int dlaSimNo2Size = 15; // field size

	/**
	 * Unique field index used for Filtering.
	 * 
	 * @see com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int dlaSimProd1Filter = 12; // filter index
	private static final int dlaSimProd1Size = 50; // field size

	/**
	 * Unique field index used for Filtering.
	 * 
	 * @see com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int dlaSimProd2Filter = 13; // filter index
	private static final int dlaSimProd2Size = 50; // field size

	/**
	 * Unique field index used for Filtering.
	 * 
	 * @see com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int dlaDealerIdFilter = 14; // filter index
	private static final int dlaDealerIdSize = 8; // field size

	/**
	 * Unique field index used for Filtering.
	 * 
	 * @see com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int dlaPackageCodeFilter = 15; // filter index
	private static final int dlaPackageCodeSize = 5; // field size

	/**
	 * Unique field index used for Filtering.
	 * 
	 * @see com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int dlaImei1AmtFilter = 16; // filter index

	/**
	 * Unique field index used for Filtering.
	 * 
	 * @see com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int dlaImei2AmtFilter = 17; // filter index

	/**
	 * Unique field index used for Filtering.
	 * 
	 * @see com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int dlaSerial1AmtFilter = 18; // filter index

	/**
	 * Unique field index used for Filtering.
	 * 
	 * @see com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int dlaSerial2AmtFilter = 19; // filter index

	/**
	 * Unique field index used for Filtering.
	 * 
	 * @see com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int dlaSerial3AmtFilter = 20; // filter index

	/**
	 * Unique field index used for Filtering.
	 * 
	 * @see com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int dlaSimAmt1Filter = 21; // filter index

	/**
	 * Unique field index used for Filtering.
	 * 
	 * @see com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int dlaSimAmt2Filter = 22; // filter index

	/**
	 * Unique field index used for Filtering.
	 * 
	 * @see com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int dlaClmAmtFilter = 23; // filter index

	/**
	 * Unique field index used for Filtering.
	 * 
	 * @see com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int dlaSaveDateFilter = 24; // filter index

	/**
	 * Unique field index used for Filtering.
	 * 
	 * @see com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int dlaUserIdFilter = 25; // filter index
	private static final int dlaUserIdSize = 20; // field size

	/**
	 * Unique field index used for Filtering.
	 * 
	 * @see com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int dlaErrWarnFilter = 26; // filter index
	private static final int dlaErrWarnSize = 255; // field size

	/**
	 * Unique field index used for Filtering.
	 * 
	 * @see com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int dlaSubmitDateFilter = 27; // filter index

	/**
	 * Unique field index used for Filtering.
	 * 
	 * @see com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int dlaErrorFlagFilter = 28; // filter index
	private static final int dlaErrorFlagSize = 1; // field size

	/**
	 * Unique field index used for Filtering.
	 * 
	 * @see com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int dlaErrRetryCntFilter = 29; // filter index

	/**
	 * Unique field index used for Filtering.
	 * 
	 * @see com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int dlaSourceSystemFilter = 30; // filter index

	private static final int dlaSourceSystemSize = 11; // field size

	/**
	 * Unique field index used for Filtering.
	 * 
	 * @see com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int dlaOfferIdFilter = 31; // filter index

	/**
	 * Unique field index used for Filtering.
	 * 
	 * @see com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int dlaGroupIndexFilter = 32; // filter index

	/**
	 * Unique field index used for Filtering.
	 * 
	 * @see com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int dlaCreateDateFilter = 33; // filter index

	/**
	 * Unique field index used for Filtering.
	 * 
	 * @see com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int dlaClaimPostIdFilter = 34; // filter index

	// ~ Instance variables
	// /////////////////////////////////////////////////////

	private BigDecimal dlaClmAmt; // Loaded from Schema
	private BigDecimal dlaImei1Amt; // Loaded from Schema
	private BigDecimal dlaImei2Amt; // Loaded from Schema
	private BigDecimal dlaSerial1Amt; // Loaded from Schema
	private BigDecimal dlaSerial2Amt; // Loaded from Schema
	private BigDecimal dlaSerial3Amt; // Loaded from Schema
	private BigDecimal dlaSimAmt1; // Loaded from Schema
	private BigDecimal dlaSimAmt2; // Loaded from Schema
	private Date dlaClaimDate; // Loaded from Schema
	private Date dlaContractDate; // Loaded from Schema
	private Date dlaSaveDate; // Loaded from Schema
	private Date dlaSubmitDate; // Loaded from Schema

	// ---------------------
	// Field declarations
	// ---------------------
	// all attributes
	private Integer dlaClaimId; // Loaded from Schema
	private Integer dlaErrRetryCnt; // Loaded from Schema
	private String dlaActType; // Loaded from Schema
	private String dlaDealerId; // Loaded from Schema
	private String dlaErrWarn; // Loaded from Schema
	private String dlaErrorFlag; // Loaded from Schema
	private String dlaImei1; // Loaded from Schema
	private String dlaImei2; // Loaded from Schema
	private String dlaPackageCode; // Loaded from Schema
	private String dlaSerial1; // Loaded from Schema
	private String dlaSerial2; // Loaded from Schema
	private String dlaSerial3; // Loaded from Schema
	private String dlaSimNo1; // Loaded from Schema
	private String dlaSimNo2; // Loaded from Schema
	private String dlaSimProd1; // Loaded from Schema
	private String dlaSimProd2; // Loaded from Schema
	private String dlaSubscriberId; // Loaded from Schema
	private String dlaUserId; // Loaded from Schema
	private String dlaSourceSystem; // Loaded from Schema
	private Integer dlaOfferId; // Loaded from Schema
	private Integer dlaGroupIndex; // Loaded from Schema
	private Date dlaCreateDate; // Loaded from Schema
	private Integer dlaClaimPostId; // Loaded from Schema

	// ~ Constructors
	// ///////////////////////////////////////////////////////////

	/**
	 * Creates a new DlaDealClaimArcDMO object.
	 */
	public DlaDealClaimArcDMO() {
	}

	// Constructor - taking public attributes
	/**
	 * Creates a new DlaDealClaimArcDMO object.
	 * 
	 * @param dlaClaimId
	 *            DOCUMENT ME!
	 * @param dlaActType
	 *            DOCUMENT ME!
	 * @param dlaClaimDate
	 *            DOCUMENT ME!
	 * @param dlaContractDate
	 *            DOCUMENT ME!
	 * @param dlaSubscriberId
	 *            DOCUMENT ME!
	 * @param dlaImei1
	 *            DOCUMENT ME!
	 * @param dlaImei2
	 *            DOCUMENT ME!
	 * @param dlaSerial1
	 *            DOCUMENT ME!
	 * @param dlaSerial2
	 *            DOCUMENT ME!
	 * @param dlaSerial3
	 *            DOCUMENT ME!
	 * @param dlaSimNo1
	 *            DOCUMENT ME!
	 * @param dlaSimNo2
	 *            DOCUMENT ME!
	 * @param dlaSimProd1
	 *            DOCUMENT ME!
	 * @param dlaSimProd2
	 *            DOCUMENT ME!
	 * @param dlaDealerId
	 *            DOCUMENT ME!
	 * @param dlaPackageCode
	 *            DOCUMENT ME!
	 * @param dlaImei1Amt
	 *            DOCUMENT ME!
	 * @param dlaImei2Amt
	 *            DOCUMENT ME!
	 * @param dlaSerial1Amt
	 *            DOCUMENT ME!
	 * @param dlaSerial2Amt
	 *            DOCUMENT ME!
	 * @param dlaSerial3Amt
	 *            DOCUMENT ME!
	 * @param dlaSimAmt1
	 *            DOCUMENT ME!
	 * @param dlaSimAmt2
	 *            DOCUMENT ME!
	 * @param dlaClmAmt
	 *            DOCUMENT ME!
	 * @param dlaSaveDate
	 *            DOCUMENT ME!
	 * @param dlaUserId
	 *            DOCUMENT ME!
	 * @param dlaErrWarn
	 *            DOCUMENT ME!
	 * @param dlaSubmitDate
	 *            DOCUMENT ME!
	 * @param dlaErrorFlag
	 *            DOCUMENT ME!
	 * @param dlaErrRetryCnt
	 *            DOCUMENT ME!
	 * @param dlaSourceSystem
	 *            DOCUMENT ME!
	 * @param dlaOfferId
	 *            DOCUMENT ME!
	 * @param dlaGroupIndex
	 *            DOCUMENT ME!
	 * @param dlaCreateDate
	 *            DOCUMENT ME!
	 * @param dlaClaimPostId
	 *            DOCUMENT ME!
	 */

	public DlaDealClaimArcDMO(final Integer dlaClaimId,
			final String dlaActType, final Date dlaClaimDate,
			final Date dlaContractDate, final String dlaSubscriberId,
			final String dlaImei1, final String dlaImei2,
			final String dlaSerial1, final String dlaSerial2,
			final String dlaSerial3, final String dlaSimNo1,
			final String dlaSimNo2, final String dlaSimProd1,
			final String dlaSimProd2, final String dlaDealerId,
			final String dlaPackageCode, final BigDecimal dlaImei1Amt,
			final BigDecimal dlaImei2Amt, final BigDecimal dlaSerial1Amt,
			final BigDecimal dlaSerial2Amt, final BigDecimal dlaSerial3Amt,
			final BigDecimal dlaSimAmt1, final BigDecimal dlaSimAmt2,
			final BigDecimal dlaClmAmt, final Date dlaSaveDate,
			final String dlaUserId, final String dlaErrWarn,
			final Date dlaSubmitDate, final String dlaErrorFlag,
			final Integer dlaErrRetryCnt, final String dlaSourceSystem,
			final Integer dlaOfferId, final Integer dlaGroupIndex,
			final Date dlaCreateDate, final Integer dlaClaimPostId) {
		this.dlaClaimId = dlaClaimId;

		this.dlaActType = dlaActType;

		this.dlaClaimDate = (dlaClaimDate != null) ? new Date(dlaClaimDate)
				: null;

		this.dlaContractDate = (dlaContractDate != null) ? new Date(
				dlaContractDate) : null;

		this.dlaSubscriberId = dlaSubscriberId;

		this.dlaImei1 = dlaImei1;

		this.dlaImei2 = dlaImei2;

		this.dlaSerial1 = dlaSerial1;

		this.dlaSerial2 = dlaSerial2;

		this.dlaSerial3 = dlaSerial3;

		this.dlaSimNo1 = dlaSimNo1;

		this.dlaSimNo2 = dlaSimNo2;

		this.dlaSimProd1 = dlaSimProd1;

		this.dlaSimProd2 = dlaSimProd2;

		this.dlaDealerId = dlaDealerId;

		this.dlaPackageCode = dlaPackageCode;

		this.dlaImei1Amt = dlaImei1Amt;

		this.dlaImei2Amt = dlaImei2Amt;

		this.dlaSerial1Amt = dlaSerial1Amt;

		this.dlaSerial2Amt = dlaSerial2Amt;

		this.dlaSerial3Amt = dlaSerial3Amt;

		this.dlaSimAmt1 = dlaSimAmt1;

		this.dlaSimAmt2 = dlaSimAmt2;

		this.dlaClmAmt = dlaClmAmt;

		this.dlaSaveDate = (dlaSaveDate != null) ? new Date(dlaSaveDate) : null;

		this.dlaUserId = dlaUserId;

		this.dlaErrWarn = dlaErrWarn;

		this.dlaSubmitDate = (dlaSubmitDate != null) ? new Date(dlaSubmitDate)
				: null;

		this.dlaErrorFlag = dlaErrorFlag;

		this.dlaErrRetryCnt = dlaErrRetryCnt;

		this.dlaSourceSystem = dlaSourceSystem;

		this.dlaOfferId = dlaOfferId;

		this.dlaGroupIndex = dlaGroupIndex;

		this.dlaCreateDate = dlaCreateDate;

		this.dlaClaimPostId = dlaClaimPostId;
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
		return new DAOArgs(1).arg(this.dlaClaimId);
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
				dlaClaimId,
				(dlaActType == null) ? null
						: ((dlaActType.length() <= dlaActTypeSize) ? dlaActType
								: dlaActType.substring(0, dlaActTypeSize) // auto
						// trimmed
						// to
						// fit,
						// if
						// required.
						),
				dlaClaimDate,
				dlaContractDate,
				(dlaSubscriberId == null) ? null
						: ((dlaSubscriberId.length() <= dlaSubscriberIdSize) ? dlaSubscriberId
								: dlaSubscriberId.substring(0,
										dlaSubscriberIdSize) // auto trimmed
						// to fit, if
						// required.
						),
				(dlaImei1 == null) ? null
						: ((dlaImei1.length() <= dlaImei1Size) ? dlaImei1
								: dlaImei1.substring(0, dlaImei1Size) // auto
						// trimmed
						// to
						// fit,
						// if
						// required.
						),
				(dlaImei2 == null) ? null
						: ((dlaImei2.length() <= dlaImei2Size) ? dlaImei2
								: dlaImei2.substring(0, dlaImei2Size) // auto
						// trimmed
						// to
						// fit,
						// if
						// required.
						),
				(dlaSerial1 == null) ? null
						: ((dlaSerial1.length() <= dlaSerial1Size) ? dlaSerial1
								: dlaSerial1.substring(0, dlaSerial1Size) // auto
						// trimmed
						// to
						// fit,
						// if
						// required.
						),
				(dlaSerial2 == null) ? null
						: ((dlaSerial2.length() <= dlaSerial2Size) ? dlaSerial2
								: dlaSerial2.substring(0, dlaSerial2Size) // auto
						// trimmed
						// to
						// fit,
						// if
						// required.
						),
				(dlaSerial3 == null) ? null
						: ((dlaSerial3.length() <= dlaSerial3Size) ? dlaSerial3
								: dlaSerial3.substring(0, dlaSerial3Size) // auto
						// trimmed
						// to
						// fit,
						// if
						// required.
						),
				(dlaSimNo1 == null) ? null
						: ((dlaSimNo1.length() <= dlaSimNo1Size) ? dlaSimNo1
								: dlaSimNo1.substring(0, dlaSimNo1Size) // auto
						// trimmed
						// to
						// fit,
						// if
						// required.
						),
				(dlaSimNo2 == null) ? null
						: ((dlaSimNo2.length() <= dlaSimNo2Size) ? dlaSimNo2
								: dlaSimNo2.substring(0, dlaSimNo2Size) // auto
						// trimmed
						// to
						// fit,
						// if
						// required.
						),
				(dlaSimProd1 == null) ? null
						: ((dlaSimProd1.length() <= dlaSimProd1Size) ? dlaSimProd1
								: dlaSimProd1.substring(0, dlaSimProd1Size) // auto
						// trimmed
						// to
						// fit,
						// if
						// required.
						),
				(dlaSimProd2 == null) ? null
						: ((dlaSimProd2.length() <= dlaSimProd2Size) ? dlaSimProd2
								: dlaSimProd2.substring(0, dlaSimProd2Size) // auto
						// trimmed
						// to
						// fit,
						// if
						// required.
						),
				(dlaDealerId == null) ? null
						: ((dlaDealerId.length() <= dlaDealerIdSize) ? dlaDealerId
								: dlaDealerId.substring(0, dlaDealerIdSize) // auto
						// trimmed
						// to
						// fit,
						// if
						// required.
						),
				(dlaPackageCode == null) ? null
						: ((dlaPackageCode.length() <= dlaPackageCodeSize) ? dlaPackageCode
								: dlaPackageCode.substring(0,
										dlaPackageCodeSize) // auto trimmed to
						// fit, if required.
						),
				dlaImei1Amt,
				dlaImei2Amt,
				dlaSerial1Amt,
				dlaSerial2Amt,
				dlaSerial3Amt,
				dlaSimAmt1,
				dlaSimAmt2,
				dlaClmAmt,
				dlaSaveDate,
				(dlaUserId == null) ? null
						: ((dlaUserId.length() <= dlaUserIdSize) ? dlaUserId
								: dlaUserId.substring(0, dlaUserIdSize) // auto
						// trimmed
						// to
						// fit,
						// if
						// required.
						),
				(dlaErrWarn == null) ? null
						: ((dlaErrWarn.length() <= dlaErrWarnSize) ? dlaErrWarn
								: dlaErrWarn.substring(0, dlaErrWarnSize) // auto
						// trimmed
						// to
						// fit,
						// if
						// required.
						),
				dlaSubmitDate,
				(dlaErrorFlag == null) ? null
						: ((dlaErrorFlag.length() <= dlaErrorFlagSize) ? dlaErrorFlag
								: dlaErrorFlag.substring(0, dlaErrorFlagSize) // auto
						// trimmed
						// to
						// fit,
						// if
						// required.
						), dlaErrRetryCnt, dlaSourceSystem, dlaOfferId,
				dlaGroupIndex, dlaCreateDate, dlaClaimPostId };
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @param fields
	 *            DOCUMENT ME!
	 */
	protected void set(final Object[] fields) {
		dlaClaimId = (Integer) fields[0];
		dlaActType = rtrim((String) fields[1]);
		dlaClaimDate = (Date) fields[2];
		dlaContractDate = (Date) fields[3];
		dlaSubscriberId = rtrim((String) fields[4]);
		dlaImei1 = rtrim((String) fields[5]);
		dlaImei2 = rtrim((String) fields[6]);
		dlaSerial1 = rtrim((String) fields[7]);
		dlaSerial2 = rtrim((String) fields[8]);
		dlaSerial3 = rtrim((String) fields[9]);
		dlaSimNo1 = rtrim((String) fields[10]);
		dlaSimNo2 = rtrim((String) fields[11]);
		dlaSimProd1 = rtrim((String) fields[12]);
		dlaSimProd2 = rtrim((String) fields[13]);
		dlaDealerId = rtrim((String) fields[14]);
		dlaPackageCode = rtrim((String) fields[15]);
		dlaImei1Amt = (BigDecimal) fields[16];
		dlaImei2Amt = (BigDecimal) fields[17];
		dlaSerial1Amt = (BigDecimal) fields[18];
		dlaSerial2Amt = (BigDecimal) fields[19];
		dlaSerial3Amt = (BigDecimal) fields[20];
		dlaSimAmt1 = (BigDecimal) fields[21];
		dlaSimAmt2 = (BigDecimal) fields[22];
		dlaClmAmt = (BigDecimal) fields[23];
		dlaSaveDate = (Date) fields[24];
		dlaUserId = rtrim((String) fields[25]);
		dlaErrWarn = rtrim((String) fields[26]);
		dlaSubmitDate = (Date) fields[27];
		dlaErrorFlag = rtrim((String) fields[28]);
		dlaErrRetryCnt = (Integer) fields[29];
		dlaSourceSystem = rtrim((String) fields[30]);
		dlaOfferId = (Integer) fields[31];
		dlaGroupIndex = (Integer) fields[32];
		dlaCreateDate = (Date) fields[33];
		dlaClaimPostId = (Integer) fields[34];
	}

	// Get methods
	// ///////////////////////////////////////////////////////////////
	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public Integer getDlaClaimId() {
		return dlaClaimId;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public String getDlaActType() {
		return dlaActType;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public Date getDlaClaimDate() {
		return (dlaClaimDate != null) ? new Date(dlaClaimDate) : null;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public Date getDlaContractDate() {
		return (dlaContractDate != null) ? new Date(dlaContractDate) : null;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public String getDlaSubscriberId() {
		return dlaSubscriberId;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public String getDlaImei1() {
		return dlaImei1;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public String getDlaImei2() {
		return dlaImei2;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public String getDlaSerial1() {
		return dlaSerial1;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public String getDlaSerial2() {
		return dlaSerial2;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public String getDlaSerial3() {
		return dlaSerial3;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public String getDlaSimNo1() {
		return dlaSimNo1;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public String getDlaSimNo2() {
		return dlaSimNo2;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public String getDlaSimProd1() {
		return dlaSimProd1;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public String getDlaSimProd2() {
		return dlaSimProd2;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public String getDlaDealerId() {
		return dlaDealerId;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public String getDlaPackageCode() {
		return dlaPackageCode;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public BigDecimal getDlaImei1Amt() {
		return dlaImei1Amt;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public BigDecimal getDlaImei2Amt() {
		return dlaImei2Amt;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public BigDecimal getDlaSerial1Amt() {
		return dlaSerial1Amt;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public BigDecimal getDlaSerial2Amt() {
		return dlaSerial2Amt;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public BigDecimal getDlaSerial3Amt() {
		return dlaSerial3Amt;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public BigDecimal getDlaSimAmt1() {
		return dlaSimAmt1;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public BigDecimal getDlaSimAmt2() {
		return dlaSimAmt2;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public BigDecimal getDlaClmAmt() {
		return dlaClmAmt;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public Date getDlaSaveDate() {
		return (dlaSaveDate != null) ? new Date(dlaSaveDate) : null;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public String getDlaUserId() {
		return dlaUserId;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public String getDlaErrWarn() {
		return dlaErrWarn;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public Date getDlaSubmitDate() {
		return (dlaSubmitDate != null) ? new Date(dlaSubmitDate) : null;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public String getDlaErrorFlag() {
		return dlaErrorFlag;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public Integer getDlaErrRetryCnt() {
		return dlaErrRetryCnt;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public String getDlaSourceSystem() {
		return dlaSourceSystem;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public Integer getDlaOfferId() {
		return dlaOfferId;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public Integer getDlaGroupIndex() {
		return dlaGroupIndex;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public Date getDlaCreateDate() {
		return dlaCreateDate;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public Integer getDlaClaimPostId() {
		return dlaClaimPostId;
	}

	// Setter methods
	// ///////////////////////////////////////////////////////////////

	//
	// Master setter follows...
	//

	/**
	 * Setter that takes all attributes
	 */
	public void set(final Integer dlaClaimId, final String dlaActType,
			final Date dlaClaimDate, final Date dlaContractDate,
			final String dlaSubscriberId, final String dlaImei1,
			final String dlaImei2, final String dlaSerial1,
			final String dlaSerial2, final String dlaSerial3,
			final String dlaSimNo1, final String dlaSimNo2,
			final String dlaSimProd1, final String dlaSimProd2,
			final String dlaDealerId, final String dlaPackageCode,
			final BigDecimal dlaImei1Amt, final BigDecimal dlaImei2Amt,
			final BigDecimal dlaSerial1Amt, final BigDecimal dlaSerial2Amt,
			final BigDecimal dlaSerial3Amt, final BigDecimal dlaSimAmt1,
			final BigDecimal dlaSimAmt2, final BigDecimal dlaClmAmt,
			final Date dlaSaveDate, final String dlaUserId,
			final String dlaErrWarn, final Date dlaSubmitDate,
			final String dlaErrorFlag, final Integer dlaErrRetryCnt,
			final String dlaSourceSystem, final Integer dlaOfferId,
			final Integer dlaGroupIndex, final Date dlaCreateDate, final Integer dlaClaimPostId) {
		this.dlaClaimId = dlaClaimId;
		this.dlaActType = dlaActType;
		this.dlaClaimDate = (dlaClaimDate != null) ? new Date(dlaClaimDate)
				: null;
		this.dlaContractDate = (dlaContractDate != null) ? new Date(
				dlaContractDate) : null;
		this.dlaSubscriberId = dlaSubscriberId;
		this.dlaImei1 = dlaImei1;
		this.dlaImei2 = dlaImei2;
		this.dlaSerial1 = dlaSerial1;
		this.dlaSerial2 = dlaSerial2;
		this.dlaSerial3 = dlaSerial3;
		this.dlaSimNo1 = dlaSimNo1;
		this.dlaSimNo2 = dlaSimNo2;
		this.dlaSimProd1 = dlaSimProd1;
		this.dlaSimProd2 = dlaSimProd2;
		this.dlaDealerId = dlaDealerId;
		this.dlaPackageCode = dlaPackageCode;
		this.dlaImei1Amt = dlaImei1Amt;
		this.dlaImei2Amt = dlaImei2Amt;
		this.dlaSerial1Amt = dlaSerial1Amt;
		this.dlaSerial2Amt = dlaSerial2Amt;
		this.dlaSerial3Amt = dlaSerial3Amt;
		this.dlaSimAmt1 = dlaSimAmt1;
		this.dlaSimAmt2 = dlaSimAmt2;
		this.dlaClmAmt = dlaClmAmt;
		this.dlaSaveDate = (dlaSaveDate != null) ? new Date(dlaSaveDate) : null;
		this.dlaUserId = dlaUserId;
		this.dlaErrWarn = dlaErrWarn;
		this.dlaSubmitDate = (dlaSubmitDate != null) ? new Date(dlaSubmitDate)
				: null;
		this.dlaErrorFlag = dlaErrorFlag;
		this.dlaErrRetryCnt = dlaErrRetryCnt;
		this.dlaSourceSystem = dlaSourceSystem;
		this.dlaOfferId = dlaOfferId;
		this.dlaGroupIndex = dlaGroupIndex;
		this.dlaCreateDate = dlaCreateDate;
		this.dlaClaimPostId = dlaClaimPostId;
	}

	//
	// Public access modifiers if any
	// (provided for attributes that are public in the analysis model)
	//    

	/**
	 * Sets the DlaClaimId field.
	 * 
	 * @param dlaClaimId
	 */
	public void setDlaClaimId(final Integer dlaClaimId) {
		this.dlaClaimId = dlaClaimId;
	}

	/**
	 * Sets the DlaActType field.
	 * 
	 * @param dlaActType
	 */
	public void setDlaActType(final String dlaActType) {
		this.dlaActType = getPadded(dlaActType, dlaActTypeFilter);
	}

	/**
	 * Sets the DlaClaimDate field.
	 * 
	 * @param dlaClaimDate
	 */
	public void setDlaClaimDate(final Date dlaClaimDate) {
		this.dlaClaimDate = (dlaClaimDate != null) ? new Date(dlaClaimDate)
				: null;
	}

	/**
	 * Sets the DlaContractDate field.
	 * 
	 * @param dlaContractDate
	 */
	public void setDlaContractDate(final Date dlaContractDate) {
		this.dlaContractDate = (dlaContractDate != null) ? new Date(
				dlaContractDate) : null;
	}

	/**
	 * Sets the DlaSubscriberId field.
	 * 
	 * @param dlaSubscriberId
	 */
	public void setDlaSubscriberId(final String dlaSubscriberId) {
		this.dlaSubscriberId = getPadded(dlaSubscriberId, dlaSubscriberIdFilter);
	}

	/**
	 * Sets the DlaImei1 field.
	 * 
	 * @param dlaImei1
	 */
	public void setDlaImei1(final String dlaImei1) {
		this.dlaImei1 = getPadded(dlaImei1, dlaImei1Filter);
	}

	/**
	 * Sets the DlaImei2 field.
	 * 
	 * @param dlaImei2
	 */
	public void setDlaImei2(final String dlaImei2) {
		this.dlaImei2 = getPadded(dlaImei2, dlaImei2Filter);
	}

	/**
	 * Sets the DlaSerial1 field.
	 * 
	 * @param dlaSerial1
	 */
	public void setDlaSerial1(final String dlaSerial1) {
		this.dlaSerial1 = getPadded(dlaSerial1, dlaSerial1Filter);
	}

	/**
	 * Sets the DlaSerial2 field.
	 * 
	 * @param dlaSerial2
	 */
	public void setDlaSerial2(final String dlaSerial2) {
		this.dlaSerial2 = getPadded(dlaSerial2, dlaSerial2Filter);
	}

	/**
	 * Sets the DlaSerial3 field.
	 * 
	 * @param dlaSerial3
	 */
	public void setDlaSerial3(final String dlaSerial3) {
		this.dlaSerial3 = getPadded(dlaSerial3, dlaSerial3Filter);
	}

	/**
	 * Sets the DlaSimNo1 field.
	 * 
	 * @param dlaSimNo1
	 */
	public void setDlaSimNo1(final String dlaSimNo1) {
		this.dlaSimNo1 = getPadded(dlaSimNo1, dlaSimNo1Filter);
	}

	/**
	 * Sets the DlaSimNo2 field.
	 * 
	 * @param dlaSimNo2
	 */
	public void setDlaSimNo2(final String dlaSimNo2) {
		this.dlaSimNo2 = getPadded(dlaSimNo2, dlaSimNo2Filter);
	}

	/**
	 * Sets the DlaSimProd1 field.
	 * 
	 * @param dlaSimProd1
	 */
	public void setDlaSimProd1(final String dlaSimProd1) {
		this.dlaSimProd1 = getPadded(dlaSimProd1, dlaSimProd1Filter);
	}

	/**
	 * Sets the DlaSimProd2 field.
	 * 
	 * @param dlaSimProd2
	 */
	public void setDlaSimProd2(final String dlaSimProd2) {
		this.dlaSimProd2 = getPadded(dlaSimProd2, dlaSimProd2Filter);
	}

	/**
	 * Sets the DlaDealerId field.
	 * 
	 * @param dlaDealerId
	 */
	public void setDlaDealerId(final String dlaDealerId) {
		this.dlaDealerId = getPadded(dlaDealerId, dlaDealerIdFilter);
	}

	/**
	 * Sets the DlaPackageCode field.
	 * 
	 * @param dlaPackageCode
	 */
	public void setDlaPackageCode(final String dlaPackageCode) {
		this.dlaPackageCode = getPadded(dlaPackageCode, dlaPackageCodeFilter);
	}

	/**
	 * Sets the DlaImei1Amt field.
	 * 
	 * @param dlaImei1Amt
	 */
	public void setDlaImei1Amt(final BigDecimal dlaImei1Amt) {
		this.dlaImei1Amt = dlaImei1Amt;
	}

	/**
	 * Sets the DlaImei1Amt field.
	 * 
	 * @param dlaImei1Amt
	 */
	public void setDlaImei1Amt(final double dlaImei1Amt) {
		this.dlaImei1Amt = new BigDecimal(dlaImei1Amt);
	}

	/**
	 * Sets the DlaImei2Amt field.
	 * 
	 * @param dlaImei2Amt
	 */
	public void setDlaImei2Amt(final BigDecimal dlaImei2Amt) {
		this.dlaImei2Amt = dlaImei2Amt;
	}

	/**
	 * Sets the DlaImei2Amt field.
	 * 
	 * @param dlaImei2Amt
	 */
	public void setDlaImei2Amt(final double dlaImei2Amt) {
		this.dlaImei2Amt = new BigDecimal(dlaImei2Amt);
	}

	/**
	 * Sets the DlaSerial1Amt field.
	 * 
	 * @param dlaSerial1Amt
	 */
	public void setDlaSerial1Amt(final BigDecimal dlaSerial1Amt) {
		this.dlaSerial1Amt = dlaSerial1Amt;
	}

	/**
	 * Sets the DlaSerial1Amt field.
	 * 
	 * @param dlaSerial1Amt
	 */
	public void setDlaSerial1Amt(final double dlaSerial1Amt) {
		this.dlaSerial1Amt = new BigDecimal(dlaSerial1Amt);
	}

	/**
	 * Sets the DlaSerial2Amt field.
	 * 
	 * @param dlaSerial2Amt
	 */
	public void setDlaSerial2Amt(final BigDecimal dlaSerial2Amt) {
		this.dlaSerial2Amt = dlaSerial2Amt;
	}

	/**
	 * Sets the DlaSerial2Amt field.
	 * 
	 * @param dlaSerial2Amt
	 */
	public void setDlaSerial2Amt(final double dlaSerial2Amt) {
		this.dlaSerial2Amt = new BigDecimal(dlaSerial2Amt);
	}

	/**
	 * Sets the DlaSerial3Amt field.
	 * 
	 * @param dlaSerial3Amt
	 */
	public void setDlaSerial3Amt(final BigDecimal dlaSerial3Amt) {
		this.dlaSerial3Amt = dlaSerial3Amt;
	}

	/**
	 * Sets the DlaSerial3Amt field.
	 * 
	 * @param dlaSerial3Amt
	 */
	public void setDlaSerial3Amt(final double dlaSerial3Amt) {
		this.dlaSerial3Amt = new BigDecimal(dlaSerial3Amt);
	}

	/**
	 * Sets the DlaSimAmt1 field.
	 * 
	 * @param dlaSimAmt1
	 */
	public void setDlaSimAmt1(final BigDecimal dlaSimAmt1) {
		this.dlaSimAmt1 = dlaSimAmt1;
	}

	/**
	 * Sets the DlaSimAmt1 field.
	 * 
	 * @param dlaSimAmt1
	 */
	public void setDlaSimAmt1(final double dlaSimAmt1) {
		this.dlaSimAmt1 = new BigDecimal(dlaSimAmt1);
	}

	/**
	 * Sets the DlaSimAmt2 field.
	 * 
	 * @param dlaSimAmt2
	 */
	public void setDlaSimAmt2(final BigDecimal dlaSimAmt2) {
		this.dlaSimAmt2 = dlaSimAmt2;
	}

	/**
	 * Sets the DlaSimAmt2 field.
	 * 
	 * @param dlaSimAmt2
	 */
	public void setDlaSimAmt2(final double dlaSimAmt2) {
		this.dlaSimAmt2 = new BigDecimal(dlaSimAmt2);
	}

	/**
	 * Sets the DlaClmAmt field.
	 * 
	 * @param dlaClmAmt
	 */
	public void setDlaClmAmt(final BigDecimal dlaClmAmt) {
		this.dlaClmAmt = dlaClmAmt;
	}

	/**
	 * Sets the DlaClmAmt field.
	 * 
	 * @param dlaClmAmt
	 */
	public void setDlaClmAmt(final double dlaClmAmt) {
		this.dlaClmAmt = new BigDecimal(dlaClmAmt);
	}

	/**
	 * Sets the DlaSaveDate field.
	 * 
	 * @param dlaSaveDate
	 */
	public void setDlaSaveDate(final Date dlaSaveDate) {
		this.dlaSaveDate = (dlaSaveDate != null) ? new Date(dlaSaveDate) : null;
	}

	/**
	 * Sets the DlaUserId field.
	 * 
	 * @param dlaUserId
	 */
	public void setDlaUserId(final String dlaUserId) {
		this.dlaUserId = getPadded(dlaUserId, dlaUserIdFilter);
	}

	/**
	 * Sets the DlaErrWarn field.
	 * 
	 * @param dlaErrWarn
	 */
	public void setDlaErrWarn(final String dlaErrWarn) {
		this.dlaErrWarn = getPadded(dlaErrWarn, dlaErrWarnFilter);
	}

	/**
	 * Sets the DlaSubmitDate field.
	 * 
	 * @param dlaSubmitDate
	 */
	public void setDlaSubmitDate(final Date dlaSubmitDate) {
		this.dlaSubmitDate = (dlaSubmitDate != null) ? new Date(dlaSubmitDate)
				: null;
	}

	/**
	 * Sets the DlaErrorFlag field.
	 * 
	 * @param dlaErrorFlag
	 */
	public void setDlaErrorFlag(final String dlaErrorFlag) {
		this.dlaErrorFlag = getPadded(dlaErrorFlag, dlaErrorFlagFilter);
	}

	/**
	 * Sets the DlaErrRetryCnt field.
	 * 
	 * @param dlaErrRetryCnt
	 */
	public void setDlaErrRetryCnt(final Integer dlaErrRetryCnt) {
		this.dlaErrRetryCnt = dlaErrRetryCnt;
	}

	/**
	 * Sets the DlaSourceSystem field.
	 * 
	 * @param dlaSourceSystem
	 */
	public void setDlaSourceSystem(final String dlaSourceSystem) {
		this.dlaSourceSystem = getPadded(dlaSourceSystem, dlaSourceSystemFilter);
	}

	/**
	 * Sets the DlaOfferId field.
	 * 
	 * @param dlaOfferId
	 */
	public void setDlaOfferId(final Integer dlaOfferId) {
		this.dlaOfferId = dlaOfferId;
	}

	/**
	 * Sets the DlaGroupIndex field.
	 * 
	 * @param dlaGroupIndex
	 */
	public void setDlaGroupIndex(final Integer dlaGroupIndex) {
		this.dlaGroupIndex = dlaGroupIndex;
	}

	/**
	 * Sets the DlaCreateDate field.
	 * 
	 * @param dlaCreateDate
	 */
	public void setDlaCreateDate(final Date dlaCreateDate) {
		this.dlaCreateDate = dlaCreateDate;
	}

	/**
	 * Sets the DlaCreateDate field.
	 * 
	 * @param dlaCreateDate
	 */
	public void setDlaClaimPostId(final Integer dlaClaimPostId) {
		this.dlaClaimPostId = dlaClaimPostId;
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
