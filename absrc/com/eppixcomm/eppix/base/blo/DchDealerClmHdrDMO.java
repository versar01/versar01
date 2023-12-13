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
 * A value object to carry the data for a DchDealerClmHdr.
 * 
 * 
 * <H3> A DchDealerClmHdr is: </H3>
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
 * <H3> DchDealerClmHdr Value Object: </H3>
 * 
 * <!-- indent text --> <TABLE BORDER="0" CELLPADDING="0" CELLSPACING="0">
 * <TR>
 * <TD WIDTH="25">&nbsp;</TD>
 * <TD>
 * 
 * <P>
 * This is a value object (called a Data Model Object or 'DMO'). It is used to
 * pass the data for a dchDealerClmHdr into and out of the BASE module. Because
 * it's purpose is to carry data into and out of the module it is visible
 * outside the module.
 * </P>
 * <P>
 * This value object carries the data for one dchDealerClmHdr. A dchDealerClmHdr
 * is: DOCUMENT ME! - by adding a description of this class via the class
 * diagram.
 * </P>
 * <P>
 * It corresponds to the business logic object DchDealerClmHdr which contains
 * all the business behaviour of a dchDealerClmHdr but is not visible outside
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
 * This value object contains fields for all the details of a dchDealerClmHdr,
 * namely:
 * </P>
 * 
 * 
 * 
 * <P>
 * <U>Fields to carry the Attributes of a dchDealerClmHdr:</U>
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
 * <TD ALIGN="left" VALIGN="top"><B>dchClaimId</B></TD>
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
 * title="public method" align="center" /> <A HREF="#getDchClaimId()">
 * getDchClaimId </A> <BR>
 * <!-- link to the anchor of the attribute's setter method. It has the logical
 * visibility specified for the attribute --> <img
 * src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method"
 * title="public method" align="center" /> <A
 * HREF="#setDchClaimId(java.lang.Integer)"> setDchClaimId (Integer) </A>
 * </P>
 * </TD>
 * </TR>
 * <TR>
 * <TD ALIGN="left" VALIGN="top"> <!-- the attributes are private no matter what
 * their logical visibility --> <img
 * src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private
 * attribute" title="private attribute" align="center" /> </TD>
 * <TD ALIGN="left" VALIGN="top"><B>dchActType</B></TD>
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
 * title="public method" align="center" /> <A HREF="#getDchActType()">
 * getDchActType </A> <BR>
 * <!-- link to the anchor of the attribute's setter method. It has the logical
 * visibility specified for the attribute --> <img
 * src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method"
 * title="public method" align="center" /> <A
 * HREF="#setDchActType(java.lang.String)"> setDchActType (String) </A>
 * </P>
 * </TD>
 * </TR>
 * <TR>
 * <TD ALIGN="left" VALIGN="top"> <!-- the attributes are private no matter what
 * their logical visibility --> <img
 * src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private
 * attribute" title="private attribute" align="center" /> </TD>
 * <TD ALIGN="left" VALIGN="top"><B>dchClaimDate</B></TD>
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
 * title="public method" align="center" /> <A HREF="#getDchClaimDate()">
 * getDchClaimDate </A> <BR>
 * <!-- link to the anchor of the attribute's setter method. It has the logical
 * visibility specified for the attribute --> <img
 * src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method"
 * title="public method" align="center" /> <A
 * HREF="#setDchClaimDate(com.cmgwds.eppix.util.Date)"> setDchClaimDate (Date)
 * </A>
 * </P>
 * </TD>
 * </TR>
 * <TR>
 * <TD ALIGN="left" VALIGN="top"> <!-- the attributes are private no matter what
 * their logical visibility --> <img
 * src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private
 * attribute" title="private attribute" align="center" /> </TD>
 * <TD ALIGN="left" VALIGN="top"><B>dchContractDate</B></TD>
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
 * title="public method" align="center" /> <A HREF="#getDchContractDate()">
 * getDchContractDate </A> <BR>
 * <!-- link to the anchor of the attribute's setter method. It has the logical
 * visibility specified for the attribute --> <img
 * src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method"
 * title="public method" align="center" /> <A
 * HREF="#setDchContractDate(com.cmgwds.eppix.util.Date)"> setDchContractDate
 * (Date) </A>
 * </P>
 * </TD>
 * </TR>
 * <TR>
 * <TD ALIGN="left" VALIGN="top"> <!-- the attributes are private no matter what
 * their logical visibility --> <img
 * src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private
 * attribute" title="private attribute" align="center" /> </TD>
 * <TD ALIGN="left" VALIGN="top"><B>dchSubscriberId</B></TD>
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
 * title="public method" align="center" /> <A HREF="#getDchSubscriberId()">
 * getDchSubscriberId </A> <BR>
 * <!-- link to the anchor of the attribute's setter method. It has the logical
 * visibility specified for the attribute --> <img
 * src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method"
 * title="public method" align="center" /> <A
 * HREF="#setDchSubscriberId(java.lang.String)"> setDchSubscriberId (String)
 * </A>
 * </P>
 * </TD>
 * </TR>
 * <TR>
 * <TD ALIGN="left" VALIGN="top"> <!-- the attributes are private no matter what
 * their logical visibility --> <img
 * src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private
 * attribute" title="private attribute" align="center" /> </TD>
 * <TD ALIGN="left" VALIGN="top"><B>dchImei1</B></TD>
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
 * title="public method" align="center" /> <A HREF="#getDchImei1()"> getDchImei1
 * </A> <BR>
 * <!-- link to the anchor of the attribute's setter method. It has the logical
 * visibility specified for the attribute --> <img
 * src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method"
 * title="public method" align="center" /> <A
 * HREF="#setDchImei1(java.lang.String)"> setDchImei1 (String) </A>
 * </P>
 * </TD>
 * </TR>
 * <TR>
 * <TD ALIGN="left" VALIGN="top"> <!-- the attributes are private no matter what
 * their logical visibility --> <img
 * src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private
 * attribute" title="private attribute" align="center" /> </TD>
 * <TD ALIGN="left" VALIGN="top"><B>dchImei2</B></TD>
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
 * title="public method" align="center" /> <A HREF="#getDchImei2()"> getDchImei2
 * </A> <BR>
 * <!-- link to the anchor of the attribute's setter method. It has the logical
 * visibility specified for the attribute --> <img
 * src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method"
 * title="public method" align="center" /> <A
 * HREF="#setDchImei2(java.lang.String)"> setDchImei2 (String) </A>
 * </P>
 * </TD>
 * </TR>
 * <TR>
 * <TD ALIGN="left" VALIGN="top"> <!-- the attributes are private no matter what
 * their logical visibility --> <img
 * src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private
 * attribute" title="private attribute" align="center" /> </TD>
 * <TD ALIGN="left" VALIGN="top"><B>dchSerial1</B></TD>
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
 * title="public method" align="center" /> <A HREF="#getDchSerial1()">
 * getDchSerial1 </A> <BR>
 * <!-- link to the anchor of the attribute's setter method. It has the logical
 * visibility specified for the attribute --> <img
 * src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method"
 * title="public method" align="center" /> <A
 * HREF="#setDchSerial1(java.lang.String)"> setDchSerial1 (String) </A>
 * </P>
 * </TD>
 * </TR>
 * <TR>
 * <TD ALIGN="left" VALIGN="top"> <!-- the attributes are private no matter what
 * their logical visibility --> <img
 * src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private
 * attribute" title="private attribute" align="center" /> </TD>
 * <TD ALIGN="left" VALIGN="top"><B>dchSerial2</B></TD>
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
 * title="public method" align="center" /> <A HREF="#getDchSerial2()">
 * getDchSerial2 </A> <BR>
 * <!-- link to the anchor of the attribute's setter method. It has the logical
 * visibility specified for the attribute --> <img
 * src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method"
 * title="public method" align="center" /> <A
 * HREF="#setDchSerial2(java.lang.String)"> setDchSerial2 (String) </A>
 * </P>
 * </TD>
 * </TR>
 * <TR>
 * <TD ALIGN="left" VALIGN="top"> <!-- the attributes are private no matter what
 * their logical visibility --> <img
 * src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private
 * attribute" title="private attribute" align="center" /> </TD>
 * <TD ALIGN="left" VALIGN="top"><B>dchSerial3</B></TD>
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
 * title="public method" align="center" /> <A HREF="#getDchSerial3()">
 * getDchSerial3 </A> <BR>
 * <!-- link to the anchor of the attribute's setter method. It has the logical
 * visibility specified for the attribute --> <img
 * src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method"
 * title="public method" align="center" /> <A
 * HREF="#setDchSerial3(java.lang.String)"> setDchSerial3 (String) </A>
 * </P>
 * </TD>
 * </TR>
 * <TR>
 * <TD ALIGN="left" VALIGN="top"> <!-- the attributes are private no matter what
 * their logical visibility --> <img
 * src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private
 * attribute" title="private attribute" align="center" /> </TD>
 * <TD ALIGN="left" VALIGN="top"><B>dchSimNo1</B></TD>
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
 * title="public method" align="center" /> <A HREF="#getDchSimNo1()">
 * getDchSimNo1 </A> <BR>
 * <!-- link to the anchor of the attribute's setter method. It has the logical
 * visibility specified for the attribute --> <img
 * src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method"
 * title="public method" align="center" /> <A
 * HREF="#setDchSimNo1(java.lang.String)"> setDchSimNo1 (String) </A>
 * </P>
 * </TD>
 * </TR>
 * <TR>
 * <TD ALIGN="left" VALIGN="top"> <!-- the attributes are private no matter what
 * their logical visibility --> <img
 * src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private
 * attribute" title="private attribute" align="center" /> </TD>
 * <TD ALIGN="left" VALIGN="top"><B>dchSimNo2</B></TD>
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
 * title="public method" align="center" /> <A HREF="#getDchSimNo2()">
 * getDchSimNo2 </A> <BR>
 * <!-- link to the anchor of the attribute's setter method. It has the logical
 * visibility specified for the attribute --> <img
 * src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method"
 * title="public method" align="center" /> <A
 * HREF="#setDchSimNo2(java.lang.String)"> setDchSimNo2 (String) </A>
 * </P>
 * </TD>
 * </TR>
 * <TR>
 * <TD ALIGN="left" VALIGN="top"> <!-- the attributes are private no matter what
 * their logical visibility --> <img
 * src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private
 * attribute" title="private attribute" align="center" /> </TD>
 * <TD ALIGN="left" VALIGN="top"><B>dchSimProd1</B></TD>
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
 * title="public method" align="center" /> <A HREF="#getDchSimProd1()">
 * getDchSimProd1 </A> <BR>
 * <!-- link to the anchor of the attribute's setter method. It has the logical
 * visibility specified for the attribute --> <img
 * src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method"
 * title="public method" align="center" /> <A
 * HREF="#setDchSimProd1(java.lang.String)"> setDchSimProd1 (String) </A>
 * </P>
 * </TD>
 * </TR>
 * <TR>
 * <TD ALIGN="left" VALIGN="top"> <!-- the attributes are private no matter what
 * their logical visibility --> <img
 * src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private
 * attribute" title="private attribute" align="center" /> </TD>
 * <TD ALIGN="left" VALIGN="top"><B>dchSimProd2</B></TD>
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
 * title="public method" align="center" /> <A HREF="#getDchSimProd2()">
 * getDchSimProd2 </A> <BR>
 * <!-- link to the anchor of the attribute's setter method. It has the logical
 * visibility specified for the attribute --> <img
 * src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method"
 * title="public method" align="center" /> <A
 * HREF="#setDchSimProd2(java.lang.String)"> setDchSimProd2 (String) </A>
 * </P>
 * </TD>
 * </TR>
 * <TR>
 * <TD ALIGN="left" VALIGN="top"> <!-- the attributes are private no matter what
 * their logical visibility --> <img
 * src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private
 * attribute" title="private attribute" align="center" /> </TD>
 * <TD ALIGN="left" VALIGN="top"><B>dchDealerId</B></TD>
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
 * title="public method" align="center" /> <A HREF="#getDchDealerId()">
 * getDchDealerId </A> <BR>
 * <!-- link to the anchor of the attribute's setter method. It has the logical
 * visibility specified for the attribute --> <img
 * src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method"
 * title="public method" align="center" /> <A
 * HREF="#setDchDealerId(java.lang.String)"> setDchDealerId (String) </A>
 * </P>
 * </TD>
 * </TR>
 * <TR>
 * <TD ALIGN="left" VALIGN="top"> <!-- the attributes are private no matter what
 * their logical visibility --> <img
 * src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private
 * attribute" title="private attribute" align="center" /> </TD>
 * <TD ALIGN="left" VALIGN="top"><B>dchPackageCode</B></TD>
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
 * title="public method" align="center" /> <A HREF="#getDchPackageCode()">
 * getDchPackageCode </A> <BR>
 * <!-- link to the anchor of the attribute's setter method. It has the logical
 * visibility specified for the attribute --> <img
 * src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method"
 * title="public method" align="center" /> <A
 * HREF="#setDchPackageCode(java.lang.String)"> setDchPackageCode (String) </A>
 * </P>
 * </TD>
 * </TR>
 * <TR>
 * <TD ALIGN="left" VALIGN="top"> <!-- the attributes are private no matter what
 * their logical visibility --> <img
 * src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private
 * attribute" title="private attribute" align="center" /> </TD>
 * <TD ALIGN="left" VALIGN="top"><B>dchImei1Amt</B></TD>
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
 * title="public method" align="center" /> <A HREF="#getDchImei1Amt()">
 * getDchImei1Amt </A> <BR>
 * <!-- link to the anchor of the attribute's setter method. It has the logical
 * visibility specified for the attribute --> <img
 * src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method"
 * title="public method" align="center" /> <A
 * HREF="#setDchImei1Amt(java.math.BigDecimal)"> setDchImei1Amt (BigDecimal)
 * </A>
 * </P>
 * </TD>
 * </TR>
 * <TR>
 * <TD ALIGN="left" VALIGN="top"> <!-- the attributes are private no matter what
 * their logical visibility --> <img
 * src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private
 * attribute" title="private attribute" align="center" /> </TD>
 * <TD ALIGN="left" VALIGN="top"><B>dchImei2Amt</B></TD>
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
 * title="public method" align="center" /> <A HREF="#getDchImei2Amt()">
 * getDchImei2Amt </A> <BR>
 * <!-- link to the anchor of the attribute's setter method. It has the logical
 * visibility specified for the attribute --> <img
 * src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method"
 * title="public method" align="center" /> <A
 * HREF="#setDchImei2Amt(java.math.BigDecimal)"> setDchImei2Amt (BigDecimal)
 * </A>
 * </P>
 * </TD>
 * </TR>
 * <TR>
 * <TD ALIGN="left" VALIGN="top"> <!-- the attributes are private no matter what
 * their logical visibility --> <img
 * src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private
 * attribute" title="private attribute" align="center" /> </TD>
 * <TD ALIGN="left" VALIGN="top"><B>dchSerial1Amt</B></TD>
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
 * title="public method" align="center" /> <A HREF="#getDchSerial1Amt()">
 * getDchSerial1Amt </A> <BR>
 * <!-- link to the anchor of the attribute's setter method. It has the logical
 * visibility specified for the attribute --> <img
 * src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method"
 * title="public method" align="center" /> <A
 * HREF="#setDchSerial1Amt(java.math.BigDecimal)"> setDchSerial1Amt (BigDecimal)
 * </A>
 * </P>
 * </TD>
 * </TR>
 * <TR>
 * <TD ALIGN="left" VALIGN="top"> <!-- the attributes are private no matter what
 * their logical visibility --> <img
 * src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private
 * attribute" title="private attribute" align="center" /> </TD>
 * <TD ALIGN="left" VALIGN="top"><B>dchSerial2Amt</B></TD>
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
 * title="public method" align="center" /> <A HREF="#getDchSerial2Amt()">
 * getDchSerial2Amt </A> <BR>
 * <!-- link to the anchor of the attribute's setter method. It has the logical
 * visibility specified for the attribute --> <img
 * src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method"
 * title="public method" align="center" /> <A
 * HREF="#setDchSerial2Amt(java.math.BigDecimal)"> setDchSerial2Amt (BigDecimal)
 * </A>
 * </P>
 * </TD>
 * </TR>
 * <TR>
 * <TD ALIGN="left" VALIGN="top"> <!-- the attributes are private no matter what
 * their logical visibility --> <img
 * src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private
 * attribute" title="private attribute" align="center" /> </TD>
 * <TD ALIGN="left" VALIGN="top"><B>dchSerial3Amt</B></TD>
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
 * title="public method" align="center" /> <A HREF="#getDchSerial3Amt()">
 * getDchSerial3Amt </A> <BR>
 * <!-- link to the anchor of the attribute's setter method. It has the logical
 * visibility specified for the attribute --> <img
 * src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method"
 * title="public method" align="center" /> <A
 * HREF="#setDchSerial3Amt(java.math.BigDecimal)"> setDchSerial3Amt (BigDecimal)
 * </A>
 * </P>
 * </TD>
 * </TR>
 * <TR>
 * <TD ALIGN="left" VALIGN="top"> <!-- the attributes are private no matter what
 * their logical visibility --> <img
 * src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private
 * attribute" title="private attribute" align="center" /> </TD>
 * <TD ALIGN="left" VALIGN="top"><B>dchSimAmt1</B></TD>
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
 * title="public method" align="center" /> <A HREF="#getDchSimAmt1()">
 * getDchSimAmt1 </A> <BR>
 * <!-- link to the anchor of the attribute's setter method. It has the logical
 * visibility specified for the attribute --> <img
 * src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method"
 * title="public method" align="center" /> <A
 * HREF="#setDchSimAmt1(java.math.BigDecimal)"> setDchSimAmt1 (BigDecimal) </A>
 * </P>
 * </TD>
 * </TR>
 * <TR>
 * <TD ALIGN="left" VALIGN="top"> <!-- the attributes are private no matter what
 * their logical visibility --> <img
 * src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private
 * attribute" title="private attribute" align="center" /> </TD>
 * <TD ALIGN="left" VALIGN="top"><B>dchSimAmt2</B></TD>
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
 * title="public method" align="center" /> <A HREF="#getDchSimAmt2()">
 * getDchSimAmt2 </A> <BR>
 * <!-- link to the anchor of the attribute's setter method. It has the logical
 * visibility specified for the attribute --> <img
 * src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method"
 * title="public method" align="center" /> <A
 * HREF="#setDchSimAmt2(java.math.BigDecimal)"> setDchSimAmt2 (BigDecimal) </A>
 * </P>
 * </TD>
 * </TR>
 * <TR>
 * <TD ALIGN="left" VALIGN="top"> <!-- the attributes are private no matter what
 * their logical visibility --> <img
 * src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private
 * attribute" title="private attribute" align="center" /> </TD>
 * <TD ALIGN="left" VALIGN="top"><B>dchClmAmt</B></TD>
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
 * title="public method" align="center" /> <A HREF="#getDchClmAmt()">
 * getDchClmAmt </A> <BR>
 * <!-- link to the anchor of the attribute's setter method. It has the logical
 * visibility specified for the attribute --> <img
 * src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method"
 * title="public method" align="center" /> <A
 * HREF="#setDchClmAmt(java.math.BigDecimal)"> setDchClmAmt (BigDecimal) </A>
 * </P>
 * </TD>
 * </TR>
 * <TR>
 * <TD ALIGN="left" VALIGN="top"> <!-- the attributes are private no matter what
 * their logical visibility --> <img
 * src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private
 * attribute" title="private attribute" align="center" /> </TD>
 * <TD ALIGN="left" VALIGN="top"><B>dchSaveDate</B></TD>
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
 * title="public method" align="center" /> <A HREF="#getDchSaveDate()">
 * getDchSaveDate </A> <BR>
 * <!-- link to the anchor of the attribute's setter method. It has the logical
 * visibility specified for the attribute --> <img
 * src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method"
 * title="public method" align="center" /> <A
 * HREF="#setDchSaveDate(com.cmgwds.eppix.util.Date)"> setDchSaveDate (Date)
 * </A>
 * </P>
 * </TD>
 * </TR>
 * <TR>
 * <TD ALIGN="left" VALIGN="top"> <!-- the attributes are private no matter what
 * their logical visibility --> <img
 * src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private
 * attribute" title="private attribute" align="center" /> </TD>
 * <TD ALIGN="left" VALIGN="top"><B>dchUserId</B></TD>
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
 * title="public method" align="center" /> <A HREF="#getDchUserId()">
 * getDchUserId </A> <BR>
 * <!-- link to the anchor of the attribute's setter method. It has the logical
 * visibility specified for the attribute --> <img
 * src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method"
 * title="public method" align="center" /> <A
 * HREF="#setDchUserId(java.lang.String)"> setDchUserId (String) </A>
 * </P>
 * </TD>
 * </TR>
 * <TR>
 * <TD ALIGN="left" VALIGN="top"> <!-- the attributes are private no matter what
 * their logical visibility --> <img
 * src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private
 * attribute" title="private attribute" align="center" /> </TD>
 * <TD ALIGN="left" VALIGN="top"><B>dchErrWarn</B></TD>
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
 * title="public method" align="center" /> <A HREF="#getDchErrWarn()">
 * getDchErrWarn </A> <BR>
 * <!-- link to the anchor of the attribute's setter method. It has the logical
 * visibility specified for the attribute --> <img
 * src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method"
 * title="public method" align="center" /> <A
 * HREF="#setDchErrWarn(java.lang.String)"> setDchErrWarn (String) </A>
 * </P>
 * </TD>
 * </TR>
 * <TR>
 * <TD ALIGN="left" VALIGN="top"> <!-- the attributes are private no matter what
 * their logical visibility --> <img
 * src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private
 * attribute" title="private attribute" align="center" /> </TD>
 * <TD ALIGN="left" VALIGN="top"><B>dchSubmitDate</B></TD>
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
 * title="public method" align="center" /> <A HREF="#getDchSubmitDate()">
 * getDchSubmitDate </A> <BR>
 * <!-- link to the anchor of the attribute's setter method. It has the logical
 * visibility specified for the attribute --> <img
 * src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method"
 * title="public method" align="center" /> <A
 * HREF="#setDchSubmitDate(com.cmgwds.eppix.util.Date)"> setDchSubmitDate (Date)
 * </A>
 * </P>
 * </TD>
 * </TR>
 * <TR>
 * <TD ALIGN="left" VALIGN="top"> <!-- the attributes are private no matter what
 * their logical visibility --> <img
 * src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private
 * attribute" title="private attribute" align="center" /> </TD>
 * <TD ALIGN="left" VALIGN="top"><B>dchErrorFlag</B></TD>
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
 * title="public method" align="center" /> <A HREF="#getDchErrorFlag()">
 * getDchErrorFlag </A> <BR>
 * <!-- link to the anchor of the attribute's setter method. It has the logical
 * visibility specified for the attribute --> <img
 * src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method"
 * title="public method" align="center" /> <A
 * HREF="#setDchErrorFlag(java.lang.String)"> setDchErrorFlag (String) </A>
 * </P>
 * </TD>
 * </TR>
 * <TR>
 * <TD ALIGN="left" VALIGN="top"> <!-- the attributes are private no matter what
 * their logical visibility --> <img
 * src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private
 * attribute" title="private attribute" align="center" /> </TD>
 * <TD ALIGN="left" VALIGN="top"><B>dchErrRetryCnt</B></TD>
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
 * title="public method" align="center" /> <A HREF="#getDchErrRetryCnt()">
 * getDchErrRetryCnt </A> <BR>
 * <!-- link to the anchor of the attribute's setter method. It has the logical
 * visibility specified for the attribute --> <img
 * src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method"
 * title="public method" align="center" /> <A
 * HREF="#setDchErrRetryCnt(java.lang.Integer)"> setDchErrRetryCnt (Integer)
 * </P>
 * </TD>
 * </TR>
 * <TR>
 * <TD ALIGN="left" VALIGN="top"> <!-- the attributes are private no matter what
 * their logical visibility --> <img
 * src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private
 * attribute" title="private attribute" align="center" /> </TD>
 * <TD ALIGN="left" VALIGN="top"><B>dchSourceSystem</B></TD>
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
 * title="public method" align="center" /> <A HREF="#getDchSourceSystem()">
 * getDchSourceSystem </A> <BR>
 * <!-- link to the anchor of the attribute's setter method. It has the logical
 * visibility specified for the attribute --> <img
 * src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method"
 * title="public method" align="center" /> <A
 * HREF="#setDchSourceSystem(java.lang.String)"> setDchSourceSystem (String)
 * </P>
 * </TD>
 * </TR>
 * <TR>
 * <TD ALIGN="left" VALIGN="top"> <!-- the attributes are private no matter what
 * their logical visibility --> <img
 * src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private
 * attribute" title="private attribute" align="center" /> </TD>
 * <TD ALIGN="left" VALIGN="top"><B>dchOfferId</B></TD>
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
 * title="public method" align="center" /> <A HREF="#getDchOfferId()">
 * getDchOfferId </A> <BR>
 * <!-- link to the anchor of the attribute's setter method. It has the logical
 * visibility specified for the attribute --> <img
 * src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method"
 * title="public method" align="center" /> <A
 * HREF="#setDchOfferId(java.lang.Integer)"> setDchOfferId (Integer)
 * </P>
 * </TD>
 * </TR>
 * <TR>
 * <TD ALIGN="left" VALIGN="top"> <!-- the attributes are private no matter what
 * their logical visibility --> <img
 * src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private
 * attribute" title="private attribute" align="center" /> </TD>
 * <TD ALIGN="left" VALIGN="top"><B>dchGroupIndex</B></TD>
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
 * title="public method" align="center" /> <A HREF="#getDchGroupIndex()">
 * getDchGroupIndex </A> <BR>
 * <!-- link to the anchor of the attribute's setter method. It has the logical
 * visibility specified for the attribute --> <img
 * src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method"
 * title="public method" align="center" /> <A
 * HREF="#setDchGroupIndex(java.lang.Integer)"> setDchGroupIndex (Integer)
 * </P>
 * </TD>
 * </TR>
 * <TR>
 * <TD ALIGN="left" VALIGN="top"> <!-- the attributes are private no matter what
 * their logical visibility --> <img
 * src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private
 * attribute" title="private attribute" align="center" /> </TD>
 * <TD ALIGN="left" VALIGN="top"><B>dchCreateDate</B></TD>
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
 * title="public method" align="center" /> <A HREF="#getDchCreateDate()">
 * getDchCreateDate </A> <BR>
 * <!-- link to the anchor of the attribute's setter method. It has the logical
 * visibility specified for the attribute --> <img
 * src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method"
 * title="public method" align="center" /> <A
 * HREF="#setDchCreateDate(java.lang.Date)"> setDchCreateDate (Date) </A>
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
 * @see DchDealerClmHdr
 * 
 * @author
 * @version $Revision: $
 * 
 * @since $jdk$
 */
public class DchDealerClmHdrDMO extends DBO implements Serializable {
	// ~ Static variables/initializers
	// //////////////////////////////////////////

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// ---------------------
	// Field type declarations
	// ---------------------
	/**
	 * Defines the internal behaviour of the fields so the internal layers can
	 * manipulate them without needing to introspect them. The order of the
	 * fields in the definition must match the actual order in this DMO.
	 */
	private static final int[] fieldTypes = new int[] {
			FIELD_TYPE_INTEGER /* std public attribute: dchClaimId */,
			FIELD_TYPE_STRING /* std public attribute: dchActType */,
			FIELD_TYPE_DATEONLY /* std public attribute: dchClaimDate */,
			FIELD_TYPE_DATEONLY /* std public attribute: dchContractDate */,
			FIELD_TYPE_STRING /* std public attribute: dchSubscriberId */,
			FIELD_TYPE_STRING /* std public attribute: dchImei1 */,
			FIELD_TYPE_STRING /* std public attribute: dchImei2 */,
			FIELD_TYPE_STRING /* std public attribute: dchSerial1 */,
			FIELD_TYPE_STRING /* std public attribute: dchSerial2 */,
			FIELD_TYPE_STRING /* std public attribute: dchSerial3 */,
			FIELD_TYPE_STRING /* std public attribute: dchSimNo1 */,
			FIELD_TYPE_STRING /* std public attribute: dchSimNo2 */,
			FIELD_TYPE_STRING /* std public attribute: dchSimProd1 */,
			FIELD_TYPE_STRING /* std public attribute: dchSimProd2 */,
			FIELD_TYPE_STRING /* std public attribute: dchDealerId */,
			FIELD_TYPE_STRING /* std public attribute: dchPackageCode */,
			FIELD_TYPE_BIGDECIMAL /* std public attribute: dchImei1Amt */,
			FIELD_TYPE_BIGDECIMAL /* std public attribute: dchImei2Amt */,
			FIELD_TYPE_BIGDECIMAL /* std public attribute: dchSerial1Amt */,
			FIELD_TYPE_BIGDECIMAL /* std public attribute: dchSerial2Amt */,
			FIELD_TYPE_BIGDECIMAL /* std public attribute: dchSerial3Amt */,
			FIELD_TYPE_BIGDECIMAL /* std public attribute: dchSimAmt1 */,
			FIELD_TYPE_BIGDECIMAL /* std public attribute: dchSimAmt2 */,
			FIELD_TYPE_BIGDECIMAL /* std public attribute: dchClmAmt */,
			FIELD_TYPE_DATEONLY /* std public attribute: dchSaveDate */,
			FIELD_TYPE_STRING /* std public attribute: dchUserId */,
			FIELD_TYPE_STRING /* std public attribute: dchErrWarn */,
			FIELD_TYPE_DATEONLY /* std public attribute: dchSubmitDate */,
			FIELD_TYPE_STRING /* std public attribute: dchErrorFlag */,
			FIELD_TYPE_INTEGER /* std public attribute: dchErrRetryCnt */,
			FIELD_TYPE_STRING /* std public attribute: dchSourceSystem */,
			FIELD_TYPE_INTEGER /* std public attribute: dchOfferId */,
			FIELD_TYPE_INTEGER /* std public attribute: dchGroupIndex */,
			FIELD_TYPE_DATEONLY /* std public attribute: dchCreateDate */
	};
	
	 private final int[] fieldSizes = new int[] {
			 0,
			 dchActTypeSize,
			 0,
			 0,
			 dchSubscriberIdSize,
			 dchImei1Size,
			 dchImei2Size,
			 dchSerial1Size,
			 dchSerial2Size,
			 dchSerial3Size,
			 dchSimNo1Size,
			 dchSimNo2Size,
			 dchSimProd1Size,
			 dchSimProd2Size,
			 dchDealerIdSize,
			 dchPackageCodeSize,
			 0,
			 0,
			 0,
			 0,
			 0,
			 0,
			 0,
			 0,
			 0,
			 dchUserIdSize,
			 dchErrWarnSize,
			 0,
			 dchErrorFlagSize,
			 0,
			 dchSourceSystemSize,
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
	public final static int dchClaimIdFilter = 0; // filter index

	/**
	 * Unique field index used for Filtering.
	 * 
	 * @see com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int dchActTypeFilter = 1; // filter index

	private static final int dchActTypeSize = 30; // field size

	/**
	 * Unique field index used for Filtering.
	 * 
	 * @see com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int dchClaimDateFilter = 2; // filter index

	/**
	 * Unique field index used for Filtering.
	 * 
	 * @see com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int dchContractDateFilter = 3; // filter index

	/**
	 * Unique field index used for Filtering.
	 * 
	 * @see com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int dchSubscriberIdFilter = 4; // filter index

	private static final int dchSubscriberIdSize = 15; // field size

	/**
	 * Unique field index used for Filtering.
	 * 
	 * @see com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int dchImei1Filter = 5; // filter index

	private static final int dchImei1Size = 15; // field size

	/**
	 * Unique field index used for Filtering.
	 * 
	 * @see com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int dchImei2Filter = 6; // filter index

	private static final int dchImei2Size = 15; // field size

	/**
	 * Unique field index used for Filtering.
	 * 
	 * @see com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int dchSerial1Filter = 7; // filter index

	private static final int dchSerial1Size = 50; // field size

	/**
	 * Unique field index used for Filtering.
	 * 
	 * @see com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int dchSerial2Filter = 8; // filter index

	private static final int dchSerial2Size = 50; // field size

	/**
	 * Unique field index used for Filtering.
	 * 
	 * @see com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int dchSerial3Filter = 9; // filter index

	private static final int dchSerial3Size = 50; // field size

	/**
	 * Unique field index used for Filtering.
	 * 
	 * @see com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int dchSimNo1Filter = 10; // filter index

	private static final int dchSimNo1Size = 15; // field size

	/**
	 * Unique field index used for Filtering.
	 * 
	 * @see com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int dchSimNo2Filter = 11; // filter index

	private static final int dchSimNo2Size = 15; // field size

	/**
	 * Unique field index used for Filtering.
	 * 
	 * @see com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int dchSimProd1Filter = 12; // filter index

	private static final int dchSimProd1Size = 50; // field size

	/**
	 * Unique field index used for Filtering.
	 * 
	 * @see com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int dchSimProd2Filter = 13; // filter index

	private static final int dchSimProd2Size = 50; // field size

	/**
	 * Unique field index used for Filtering.
	 * 
	 * @see com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int dchDealerIdFilter = 14; // filter index

	private static final int dchDealerIdSize = 8; // field size

	/**
	 * Unique field index used for Filtering.
	 * 
	 * @see com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int dchPackageCodeFilter = 15; // filter index

	private static final int dchPackageCodeSize = 5; // field size

	/**
	 * Unique field index used for Filtering.
	 * 
	 * @see com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int dchImei1AmtFilter = 16; // filter index

	/**
	 * Unique field index used for Filtering.
	 * 
	 * @see com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int dchImei2AmtFilter = 17; // filter index

	/**
	 * Unique field index used for Filtering.
	 * 
	 * @see com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int dchSerial1AmtFilter = 18; // filter index

	/**
	 * Unique field index used for Filtering.
	 * 
	 * @see com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int dchSerial2AmtFilter = 19; // filter index

	/**
	 * Unique field index used for Filtering.
	 * 
	 * @see com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int dchSerial3AmtFilter = 20; // filter index

	/**
	 * Unique field index used for Filtering.
	 * 
	 * @see com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int dchSimAmt1Filter = 21; // filter index

	/**
	 * Unique field index used for Filtering.
	 * 
	 * @see com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int dchSimAmt2Filter = 22; // filter index

	/**
	 * Unique field index used for Filtering.
	 * 
	 * @see com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int dchClmAmtFilter = 23; // filter index

	/**
	 * Unique field index used for Filtering.
	 * 
	 * @see com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int dchSaveDateFilter = 24; // filter index

	/**
	 * Unique field index used for Filtering.
	 * 
	 * @see com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int dchUserIdFilter = 25; // filter index

	private static final int dchUserIdSize = 20; // field size

	/**
	 * Unique field index used for Filtering.
	 * 
	 * @see com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public final static int dchErrWarnFilter = 26; // filter index

	private static final int dchErrWarnSize = 255; // field size

	/**
	 * Unique field index used for Filtering.
	 * 
	 * @see com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int dchSubmitDateFilter = 27; // filter index

	/**
	 * Unique field index used for Filtering.
	 * 
	 * @see com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public final static int dchErrorFlagFilter = 28; // filter index

	private static final int dchErrorFlagSize = 1; // field size

	/**
	 * Unique field index used for Filtering.
	 * 
	 * @see com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public final static int dchErrRetryCntFilter = 29; // filter index

	/**
	 * Unique field index used for Filtering.
	 * 
	 * @see com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public final static int dchSourceSystemFilter = 30; // filter index

	private static final int dchSourceSystemSize = 11; // field size

	/**
	 * Unique field index used for Filtering.
	 * 
	 * @see com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public final static int dchOfferIdFilter = 31; // filter index

	/**
	 * Unique field index used for Filtering.
	 * 
	 * @see com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public final static int dchGroupIndexFilter = 32; // filter index

	/**
	 * Unique field index used for Filtering.
	 * 
	 * @see com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public final static int dchCreateDateFilter = 33; // filter index

	// ~ Instance variables
	// /////////////////////////////////////////////////////

	private BigDecimal dchClmAmt; // Loaded from Schema
	private BigDecimal dchImei1Amt; // Loaded from Schema
	private BigDecimal dchImei2Amt; // Loaded from Schema
	private BigDecimal dchSerial1Amt; // Loaded from Schema
	private BigDecimal dchSerial2Amt; // Loaded from Schema
	private BigDecimal dchSerial3Amt; // Loaded from Schema
	private BigDecimal dchSimAmt1; // Loaded from Schema
	private BigDecimal dchSimAmt2; // Loaded from Schema
	private Date dchClaimDate; // Loaded from Schema
	private Date dchContractDate; // Loaded from Schema
	private Date dchSaveDate; // Loaded from Schema
	private Date dchSubmitDate; // Loaded from Schema

	// ---------------------
	// Field declarations
	// ---------------------
	// all attributes
	private Integer dchClaimId; // Loaded from Schema
	private Integer dchErrRetryCnt; // Loaded from Schema
	private String dchActType; // Loaded from Schema
	private String dchDealerId; // Loaded from Schema
	private String dchErrWarn; // Loaded from Schema
	private String dchErrorFlag; // Loaded from Schema
	private String dchImei1; // Loaded from Schema
	private String dchImei2; // Loaded from Schema
	private String dchPackageCode; // Loaded from Schema
	private String dchSerial1; // Loaded from Schema
	private String dchSerial2; // Loaded from Schema
	private String dchSerial3; // Loaded from Schema
	private String dchSimNo1; // Loaded from Schema
	private String dchSimNo2; // Loaded from Schema
	private String dchSimProd1; // Loaded from Schema
	private String dchSimProd2; // Loaded from Schema
	private String dchSubscriberId; // Loaded from Schema
	private String dchUserId; // Loaded from Schema
	private String dchSourceSystem; // Loaded from Schema
	private Integer dchOfferId; // Loaded from Schema
	private Integer dchGroupIndex; // Loaded from Schema
	private Date dchCreateDate; // Loaded from Schema

	// ~ Constructors
	// ///////////////////////////////////////////////////////////

	/**
	 * Creates a new DchDealerClmHdrDMO object.
	 */
	public DchDealerClmHdrDMO() {
	}

	// Constructor - taking public attributes
	/**
	 * Creates a new DchDealerClmHdrDMO object.
	 * 
	 * @param dchClaimId
	 *            DOCUMENT ME!
	 * @param dchActType
	 *            DOCUMENT ME!
	 * @param dchClaimDate
	 *            DOCUMENT ME!
	 * @param dchContractDate
	 *            DOCUMENT ME!
	 * @param dchSubscriberId
	 *            DOCUMENT ME!
	 * @param dchImei1
	 *            DOCUMENT ME!
	 * @param dchImei2
	 *            DOCUMENT ME!
	 * @param dchSerial1
	 *            DOCUMENT ME!
	 * @param dchSerial2
	 *            DOCUMENT ME!
	 * @param dchSerial3
	 *            DOCUMENT ME!
	 * @param dchSimNo1
	 *            DOCUMENT ME!
	 * @param dchSimNo2
	 *            DOCUMENT ME!
	 * @param dchSimProd1
	 *            DOCUMENT ME!
	 * @param dchSimProd2
	 *            DOCUMENT ME!
	 * @param dchDealerId
	 *            DOCUMENT ME!
	 * @param dchPackageCode
	 *            DOCUMENT ME!
	 * @param dchImei1Amt
	 *            DOCUMENT ME!
	 * @param dchImei2Amt
	 *            DOCUMENT ME!
	 * @param dchSerial1Amt
	 *            DOCUMENT ME!
	 * @param dchSerial2Amt
	 *            DOCUMENT ME!
	 * @param dchSerial3Amt
	 *            DOCUMENT ME!
	 * @param dchSimAmt1
	 *            DOCUMENT ME!
	 * @param dchSimAmt2
	 *            DOCUMENT ME!
	 * @param dchClmAmt
	 *            DOCUMENT ME!
	 * @param dchSaveDate
	 *            DOCUMENT ME!
	 * @param dchUserId
	 *            DOCUMENT ME!
	 * @param dchErrWarn
	 *            DOCUMENT ME!
	 * @param dchSubmitDate
	 *            DOCUMENT ME!
	 * @param dchErrorFlag
	 *            DOCUMENT ME!
	 * @param dchErrRetryCnt
	 *            DOCUMENT ME!
	 * @param dchSourceSystem
	 *            DOCUMENT ME!
	 * @param dchOfferId
	 *            DOCUMENT ME!
	 * @param dchGroupIndex
	 *            DOCUMENT ME!
	 * @param dchCreateDate
	 *            DOCUMENT ME!
	 */
	public DchDealerClmHdrDMO(final Integer dchClaimId,
			final String dchActType, final Date dchClaimDate,
			final Date dchContractDate, final String dchSubscriberId,
			final String dchImei1, final String dchImei2,
			final String dchSerial1, final String dchSerial2,
			final String dchSerial3, final String dchSimNo1,
			final String dchSimNo2, final String dchSimProd1,
			final String dchSimProd2, final String dchDealerId,
			final String dchPackageCode, final BigDecimal dchImei1Amt,
			final BigDecimal dchImei2Amt, final BigDecimal dchSerial1Amt,
			final BigDecimal dchSerial2Amt, final BigDecimal dchSerial3Amt,
			final BigDecimal dchSimAmt1, final BigDecimal dchSimAmt2,
			final BigDecimal dchClmAmt, final Date dchSaveDate,
			final String dchUserId, final String dchErrWarn,
			final Date dchSubmitDate, final String dchErrorFlag,
			final Integer dchErrRetryCnt, final String dchSourceSystem,
			final Integer dchOfferId, final Integer dchGroupIndex,
			final Date dchCreateDate) {
		this.dchClaimId = dchClaimId;

		this.dchActType = dchActType;

		this.dchClaimDate = (dchClaimDate != null) ? new Date(dchClaimDate)
				: null;

		this.dchContractDate = (dchContractDate != null) ? new Date(
				dchContractDate) : null;

		this.dchSubscriberId = dchSubscriberId;

		this.dchImei1 = dchImei1;

		this.dchImei2 = dchImei2;

		this.dchSerial1 = dchSerial1;

		this.dchSerial2 = dchSerial2;

		this.dchSerial3 = dchSerial3;

		this.dchSimNo1 = dchSimNo1;

		this.dchSimNo2 = dchSimNo2;

		this.dchSimProd1 = dchSimProd1;

		this.dchSimProd2 = dchSimProd2;

		this.dchDealerId = dchDealerId;

		this.dchPackageCode = dchPackageCode;

		this.dchImei1Amt = dchImei1Amt;

		this.dchImei2Amt = dchImei2Amt;

		this.dchSerial1Amt = dchSerial1Amt;

		this.dchSerial2Amt = dchSerial2Amt;

		this.dchSerial3Amt = dchSerial3Amt;

		this.dchSimAmt1 = dchSimAmt1;

		this.dchSimAmt2 = dchSimAmt2;

		this.dchClmAmt = dchClmAmt;

		this.dchSaveDate = (dchSaveDate != null) ? new Date(dchSaveDate) : null;

		this.dchUserId = dchUserId;

		this.dchErrWarn = dchErrWarn;

		this.dchSubmitDate = (dchSubmitDate != null) ? new Date(dchSubmitDate)
				: null;

		this.dchErrorFlag = dchErrorFlag;

		this.dchErrRetryCnt = dchErrRetryCnt;

		this.dchSourceSystem = dchSourceSystem;

		this.dchOfferId = dchOfferId;

		this.dchGroupIndex = dchGroupIndex;

		this.dchCreateDate = dchCreateDate;
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
		return new DAOArgs(1).arg(this.dchClaimId);
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
				dchClaimId,
				(dchActType == null) ? null
						: ((dchActType.length() <= dchActTypeSize) ? dchActType
								: dchActType.substring(0, dchActTypeSize) // auto
						// trimmed
						// to
						// fit,
						// if
						// required.
						),
				dchClaimDate,
				dchContractDate,
				(dchSubscriberId == null) ? null
						: ((dchSubscriberId.length() <= dchSubscriberIdSize) ? dchSubscriberId
								: dchSubscriberId.substring(0,
										dchSubscriberIdSize) // auto trimmed
						// to fit, if
						// required.
						),
				(dchImei1 == null) ? null
						: ((dchImei1.length() <= dchImei1Size) ? dchImei1
								: dchImei1.substring(0, dchImei1Size) // auto
						// trimmed
						// to
						// fit,
						// if
						// required.
						),
				(dchImei2 == null) ? null
						: ((dchImei2.length() <= dchImei2Size) ? dchImei2
								: dchImei2.substring(0, dchImei2Size) // auto
						// trimmed
						// to
						// fit,
						// if
						// required.
						),
				(dchSerial1 == null) ? null
						: ((dchSerial1.length() <= dchSerial1Size) ? dchSerial1
								: dchSerial1.substring(0, dchSerial1Size) // auto
						// trimmed
						// to
						// fit,
						// if
						// required.
						),
				(dchSerial2 == null) ? null
						: ((dchSerial2.length() <= dchSerial2Size) ? dchSerial2
								: dchSerial2.substring(0, dchSerial2Size) // auto
						// trimmed
						// to
						// fit,
						// if
						// required.
						),
				(dchSerial3 == null) ? null
						: ((dchSerial3.length() <= dchSerial3Size) ? dchSerial3
								: dchSerial3.substring(0, dchSerial3Size) // auto
						// trimmed
						// to
						// fit,
						// if
						// required.
						),
				(dchSimNo1 == null) ? null
						: ((dchSimNo1.length() <= dchSimNo1Size) ? dchSimNo1
								: dchSimNo1.substring(0, dchSimNo1Size) // auto
						// trimmed
						// to
						// fit,
						// if
						// required.
						),
				(dchSimNo2 == null) ? null
						: ((dchSimNo2.length() <= dchSimNo2Size) ? dchSimNo2
								: dchSimNo2.substring(0, dchSimNo2Size) // auto
						// trimmed
						// to
						// fit,
						// if
						// required.
						),
				(dchSimProd1 == null) ? null
						: ((dchSimProd1.length() <= dchSimProd1Size) ? dchSimProd1
								: dchSimProd1.substring(0, dchSimProd1Size) // auto
						// trimmed
						// to
						// fit,
						// if
						// required.
						),
				(dchSimProd2 == null) ? null
						: ((dchSimProd2.length() <= dchSimProd2Size) ? dchSimProd2
								: dchSimProd2.substring(0, dchSimProd2Size) // auto
						// trimmed
						// to
						// fit,
						// if
						// required.
						),
				(dchDealerId == null) ? null
						: ((dchDealerId.length() <= dchDealerIdSize) ? dchDealerId
								: dchDealerId.substring(0, dchDealerIdSize) // auto
						// trimmed
						// to
						// fit,
						// if
						// required.
						),
				(dchPackageCode == null) ? null
						: ((dchPackageCode.length() <= dchPackageCodeSize) ? dchPackageCode
								: dchPackageCode.substring(0,
										dchPackageCodeSize) // auto trimmed to
						// fit, if required.
						),
				dchImei1Amt,
				dchImei2Amt,
				dchSerial1Amt,
				dchSerial2Amt,
				dchSerial3Amt,
				dchSimAmt1,
				dchSimAmt2,
				dchClmAmt,
				dchSaveDate,
				(dchUserId == null) ? null
						: ((dchUserId.length() <= dchUserIdSize) ? dchUserId
								: dchUserId.substring(0, dchUserIdSize) // auto
						// trimmed
						// to
						// fit,
						// if
						// required.
						),
				(dchErrWarn == null) ? null
						: ((dchErrWarn.length() <= dchErrWarnSize) ? dchErrWarn
								: dchErrWarn.substring(0, dchErrWarnSize) // auto
						// trimmed
						// to
						// fit,
						// if
						// required.
						),
				dchSubmitDate,
				(dchErrorFlag == null) ? null
						: ((dchErrorFlag.length() <= dchErrorFlagSize) ? dchErrorFlag
								: dchErrorFlag.substring(0, dchErrorFlagSize) // auto
						// trimmed
						// to
						// fit,
						// if
						// required.
						),
				dchErrRetryCnt,
				(dchSourceSystem == null) ? null
						: ((dchSourceSystem.length() <= dchSourceSystemSize) ? dchSourceSystem
								: dchSourceSystem.substring(0,
										dchSourceSystemSize) // auto
																// dchSourceSystem
						// trimmed
						// to
						// fit,
						// if
						// required.
						), dchOfferId, dchGroupIndex, dchCreateDate };
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @param fields
	 *            DOCUMENT ME!
	 */
	protected void set(final Object[] fields) {
		dchClaimId = (Integer) fields[0];
		dchActType = rtrim((String) fields[1]);
		dchClaimDate = (Date) fields[2];
		dchContractDate = (Date) fields[3];
		dchSubscriberId = rtrim((String) fields[4]);
		dchImei1 = rtrim((String) fields[5]);
		dchImei2 = rtrim((String) fields[6]);
		dchSerial1 = rtrim((String) fields[7]);
		dchSerial2 = rtrim((String) fields[8]);
		dchSerial3 = rtrim((String) fields[9]);
		dchSimNo1 = rtrim((String) fields[10]);
		dchSimNo2 = rtrim((String) fields[11]);
		dchSimProd1 = rtrim((String) fields[12]);
		dchSimProd2 = rtrim((String) fields[13]);
		dchDealerId = rtrim((String) fields[14]);
		dchPackageCode = rtrim((String) fields[15]);
		dchImei1Amt = (BigDecimal) fields[16];
		dchImei2Amt = (BigDecimal) fields[17];
		dchSerial1Amt = (BigDecimal) fields[18];
		dchSerial2Amt = (BigDecimal) fields[19];
		dchSerial3Amt = (BigDecimal) fields[20];
		dchSimAmt1 = (BigDecimal) fields[21];
		dchSimAmt2 = (BigDecimal) fields[22];
		dchClmAmt = (BigDecimal) fields[23];
		dchSaveDate = (Date) fields[24];
		dchUserId = rtrim((String) fields[25]);
		dchErrWarn = rtrim((String) fields[26]);
		dchSubmitDate = (Date) fields[27];
		dchErrorFlag = rtrim((String) fields[28]);
		dchErrRetryCnt = (Integer) fields[29];
		dchSourceSystem = rtrim((String) fields[30]);
		dchOfferId = (Integer) fields[31];
		dchGroupIndex = (Integer) fields[32];
		dchCreateDate = (Date) fields[33];
	}

	// Get methods
	// ///////////////////////////////////////////////////////////////
	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public Integer getDchClaimId() {
		return dchClaimId;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public String getDchActType() {
		return dchActType;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public Date getDchClaimDate() {
		return (dchClaimDate != null) ? new Date(dchClaimDate) : null;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public Date getDchContractDate() {
		return (dchContractDate != null) ? new Date(dchContractDate) : null;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public String getDchSubscriberId() {
		return dchSubscriberId;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public String getDchImei1() {
		return dchImei1;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public String getDchImei2() {
		return dchImei2;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public String getDchSerial1() {
		return dchSerial1;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public String getDchSerial2() {
		return dchSerial2;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public String getDchSerial3() {
		return dchSerial3;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public String getDchSimNo1() {
		return dchSimNo1;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public String getDchSimNo2() {
		return dchSimNo2;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public String getDchSimProd1() {
		return dchSimProd1;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public String getDchSimProd2() {
		return dchSimProd2;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public String getDchDealerId() {
		return dchDealerId;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public String getDchPackageCode() {
		return dchPackageCode;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public BigDecimal getDchImei1Amt() {
		return dchImei1Amt;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public BigDecimal getDchImei2Amt() {
		return dchImei2Amt;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public BigDecimal getDchSerial1Amt() {
		return dchSerial1Amt;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public BigDecimal getDchSerial2Amt() {
		return dchSerial2Amt;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public BigDecimal getDchSerial3Amt() {
		return dchSerial3Amt;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public BigDecimal getDchSimAmt1() {
		return dchSimAmt1;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public BigDecimal getDchSimAmt2() {
		return dchSimAmt2;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public BigDecimal getDchClmAmt() {
		return dchClmAmt;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public Date getDchSaveDate() {
		return (dchSaveDate != null) ? new Date(dchSaveDate) : null;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public String getDchUserId() {
		return dchUserId;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public String getDchErrWarn() {
		return dchErrWarn;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public Date getDchSubmitDate() {
		return (dchSubmitDate != null) ? new Date(dchSubmitDate) : null;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public String getDchErrorFlag() {
		return dchErrorFlag;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public Integer getDchErrRetryCnt() {
		return dchErrRetryCnt;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public String getDchSourceSystem() {
		return dchSourceSystem;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public Integer getDchOfferId() {
		return dchOfferId;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public Integer getDchGroupIndex() {
		return dchGroupIndex;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public Date getDchCreateDate() {
		return dchCreateDate;
	}

	// Setter methods
	// ///////////////////////////////////////////////////////////////

	//
	// Master setter follows...
	//

	/**
	 * Setter that takes all attributes
	 */
	public void set(final Integer dchClaimId, final String dchActType,
			final Date dchClaimDate, final Date dchContractDate,
			final String dchSubscriberId, final String dchImei1,
			final String dchImei2, final String dchSerial1,
			final String dchSerial2, final String dchSerial3,
			final String dchSimNo1, final String dchSimNo2,
			final String dchSimProd1, final String dchSimProd2,
			final String dchDealerId, final String dchPackageCode,
			final BigDecimal dchImei1Amt, final BigDecimal dchImei2Amt,
			final BigDecimal dchSerial1Amt, final BigDecimal dchSerial2Amt,
			final BigDecimal dchSerial3Amt, final BigDecimal dchSimAmt1,
			final BigDecimal dchSimAmt2, final BigDecimal dchClmAmt,
			final Date dchSaveDate, final String dchUserId,
			final String dchErrWarn, final Date dchSubmitDate,
			final String dchErrorFlag, final Integer dchErrRetryCnt,
			final String dchSourceSystem, final Integer dchOfferId,
			final Integer dchGroupIndex, final Date dchCreateDate) {
		this.dchClaimId = dchClaimId;
		this.dchActType = dchActType;
		this.dchClaimDate = (dchClaimDate != null) ? new Date(dchClaimDate)
				: null;
		this.dchContractDate = (dchContractDate != null) ? new Date(
				dchContractDate) : null;
		this.dchSubscriberId = dchSubscriberId;
		this.dchImei1 = dchImei1;
		this.dchImei2 = dchImei2;
		this.dchSerial1 = dchSerial1;
		this.dchSerial2 = dchSerial2;
		this.dchSerial3 = dchSerial3;
		this.dchSimNo1 = dchSimNo1;
		this.dchSimNo2 = dchSimNo2;
		this.dchSimProd1 = dchSimProd1;
		this.dchSimProd2 = dchSimProd2;
		this.dchDealerId = dchDealerId;
		this.dchPackageCode = dchPackageCode;
		this.dchImei1Amt = dchImei1Amt;
		this.dchImei2Amt = dchImei2Amt;
		this.dchSerial1Amt = dchSerial1Amt;
		this.dchSerial2Amt = dchSerial2Amt;
		this.dchSerial3Amt = dchSerial3Amt;
		this.dchSimAmt1 = dchSimAmt1;
		this.dchSimAmt2 = dchSimAmt2;
		this.dchClmAmt = dchClmAmt;
		this.dchSaveDate = (dchSaveDate != null) ? new Date(dchSaveDate) : null;
		this.dchUserId = dchUserId;
		this.dchErrWarn = dchErrWarn;
		this.dchSubmitDate = (dchSubmitDate != null) ? new Date(dchSubmitDate)
				: null;
		this.dchErrorFlag = dchErrorFlag;
		this.dchErrRetryCnt = dchErrRetryCnt;
		this.dchSourceSystem = dchSourceSystem;
		this.dchOfferId = dchOfferId;
		this.dchGroupIndex = dchGroupIndex;
		this.dchCreateDate = dchCreateDate;
	}

	//
	// Public access modifiers if any
	// (provided for attributes that are public in the analysis model)
	//    

	/**
	 * Sets the DchClaimId field.
	 * 
	 * @param dchClaimId
	 */
	public void setDchClaimId(final Integer dchClaimId) {
		this.dchClaimId = dchClaimId;
	}

	/**
	 * Sets the DchActType field.
	 * 
	 * @param dchActType
	 */
	public void setDchActType(final String dchActType) {
		this.dchActType = dchActType;
	}

	/**
	 * Sets the DchClaimDate field.
	 * 
	 * @param dchClaimDate
	 */
	public void setDchClaimDate(final Date dchClaimDate) {
		this.dchClaimDate = (dchClaimDate != null) ? new Date(dchClaimDate)
				: null;
	}

	/**
	 * Sets the DchContractDate field.
	 * 
	 * @param dchContractDate
	 */
	public void setDchContractDate(final Date dchContractDate) {
		this.dchContractDate = (dchContractDate != null) ? new Date(
				dchContractDate) : null;
	}

	/**
	 * Sets the DchSubscriberId field.
	 * 
	 * @param dchSubscriberId
	 */
	public void setDchSubscriberId(final String dchSubscriberId) {
		this.dchSubscriberId = dchSubscriberId;
	}

	/**
	 * Sets the DchImei1 field.
	 * 
	 * @param dchImei1
	 */
	public void setDchImei1(final String dchImei1) {
		this.dchImei1 = dchImei1;
	}

	/**
	 * Sets the DchImei2 field.
	 * 
	 * @param dchImei2
	 */
	public void setDchImei2(final String dchImei2) {
		this.dchImei2 = dchImei2;
	}

	/**
	 * Sets the DchSerial1 field.
	 * 
	 * @param dchSerial1
	 */
	public void setDchSerial1(final String dchSerial1) {
		this.dchSerial1 = dchSerial1;
	}

	/**
	 * Sets the DchSerial2 field.
	 * 
	 * @param dchSerial2
	 */
	public void setDchSerial2(final String dchSerial2) {
		this.dchSerial2 = dchSerial2;
	}

	/**
	 * Sets the DchSerial3 field.
	 * 
	 * @param dchSerial3
	 */
	public void setDchSerial3(final String dchSerial3) {
		this.dchSerial3 = dchSerial3;
	}

	/**
	 * Sets the DchSimNo1 field.
	 * 
	 * @param dchSimNo1
	 */
	public void setDchSimNo1(final String dchSimNo1) {
		this.dchSimNo1 = dchSimNo1;
	}

	/**
	 * Sets the DchSimNo2 field.
	 * 
	 * @param dchSimNo2
	 */
	public void setDchSimNo2(final String dchSimNo2) {
		this.dchSimNo2 = dchSimNo2;
	}

	/**
	 * Sets the DchSimProd1 field.
	 * 
	 * @param dchSimProd1
	 */
	public void setDchSimProd1(final String dchSimProd1) {
		this.dchSimProd1 = dchSimProd1;
	}

	/**
	 * Sets the DchSimProd2 field.
	 * 
	 * @param dchSimProd2
	 */
	public void setDchSimProd2(final String dchSimProd2) {
		this.dchSimProd2 = dchSimProd2;
	}

	/**
	 * Sets the DchDealerId field.
	 * 
	 * @param dchDealerId
	 */
	public void setDchDealerId(final String dchDealerId) {
		this.dchDealerId = dchDealerId;
	}

	/**
	 * Sets the DchPackageCode field.
	 * 
	 * @param dchPackageCode
	 */
	public void setDchPackageCode(final String dchPackageCode) {
		this.dchPackageCode = dchPackageCode;
	}

	/**
	 * Sets the DchImei1Amt field.
	 * 
	 * @param dchImei1Amt
	 */
	public void setDchImei1Amt(final BigDecimal dchImei1Amt) {
		this.dchImei1Amt = dchImei1Amt;
	}

	/**
	 * Sets the DchImei1Amt field.
	 * 
	 * @param dchImei1Amt
	 */
	public void setDchImei1Amt(final double dchImei1Amt) {
		this.dchImei1Amt = new BigDecimal(dchImei1Amt);
	}

	/**
	 * Sets the DchImei2Amt field.
	 * 
	 * @param dchImei2Amt
	 */
	public void setDchImei2Amt(final BigDecimal dchImei2Amt) {
		this.dchImei2Amt = dchImei2Amt;
	}

	/**
	 * Sets the DchImei2Amt field.
	 * 
	 * @param dchImei2Amt
	 */
	public void setDchImei2Amt(final double dchImei2Amt) {
		this.dchImei2Amt = new BigDecimal(dchImei2Amt);
	}

	/**
	 * Sets the DchSerial1Amt field.
	 * 
	 * @param dchSerial1Amt
	 */
	public void setDchSerial1Amt(final BigDecimal dchSerial1Amt) {
		this.dchSerial1Amt = dchSerial1Amt;
	}

	/**
	 * Sets the DchSerial1Amt field.
	 * 
	 * @param dchSerial1Amt
	 */
	public void setDchSerial1Amt(final double dchSerial1Amt) {
		this.dchSerial1Amt = new BigDecimal(dchSerial1Amt);
	}

	/**
	 * Sets the DchSerial2Amt field.
	 * 
	 * @param dchSerial2Amt
	 */
	public void setDchSerial2Amt(final BigDecimal dchSerial2Amt) {
		this.dchSerial2Amt = dchSerial2Amt;
	}

	/**
	 * Sets the DchSerial2Amt field.
	 * 
	 * @param dchSerial2Amt
	 */
	public void setDchSerial2Amt(final double dchSerial2Amt) {
		this.dchSerial2Amt = new BigDecimal(dchSerial2Amt);
	}

	/**
	 * Sets the DchSerial3Amt field.
	 * 
	 * @param dchSerial3Amt
	 */
	public void setDchSerial3Amt(final BigDecimal dchSerial3Amt) {
		this.dchSerial3Amt = dchSerial3Amt;
	}

	/**
	 * Sets the DchSerial3Amt field.
	 * 
	 * @param dchSerial3Amt
	 */
	public void setDchSerial3Amt(final double dchSerial3Amt) {
		this.dchSerial3Amt = new BigDecimal(dchSerial3Amt);
	}

	/**
	 * Sets the DchSimAmt1 field.
	 * 
	 * @param dchSimAmt1
	 */
	public void setDchSimAmt1(final BigDecimal dchSimAmt1) {
		this.dchSimAmt1 = dchSimAmt1;
	}

	/**
	 * Sets the DchSimAmt1 field.
	 * 
	 * @param dchSimAmt1
	 */
	public void setDchSimAmt1(final double dchSimAmt1) {
		this.dchSimAmt1 = new BigDecimal(dchSimAmt1);
	}

	/**
	 * Sets the DchSimAmt2 field.
	 * 
	 * @param dchSimAmt2
	 */
	public void setDchSimAmt2(final BigDecimal dchSimAmt2) {
		this.dchSimAmt2 = dchSimAmt2;
	}

	/**
	 * Sets the DchSimAmt2 field.
	 * 
	 * @param dchSimAmt2
	 */
	public void setDchSimAmt2(final double dchSimAmt2) {
		this.dchSimAmt2 = new BigDecimal(dchSimAmt2);
	}

	/**
	 * Sets the DchClmAmt field.
	 * 
	 * @param dchClmAmt
	 */
	public void setDchClmAmt(final BigDecimal dchClmAmt) {
		this.dchClmAmt = dchClmAmt;
	}

	/**
	 * Sets the DchClmAmt field.
	 * 
	 * @param dchClmAmt
	 */
	public void setDchClmAmt(final double dchClmAmt) {
		this.dchClmAmt = new BigDecimal(dchClmAmt);
	}

	/**
	 * Sets the DchSaveDate field.
	 * 
	 * @param dchSaveDate
	 */
	public void setDchSaveDate(final Date dchSaveDate) {
		this.dchSaveDate = (dchSaveDate != null) ? new Date(dchSaveDate) : null;
	}

	/**
	 * Sets the DchUserId field.
	 * 
	 * @param dchUserId
	 */
	public void setDchUserId(final String dchUserId) {
		this.dchUserId = dchUserId;
	}

	/**
	 * Sets the DchErrWarn field.
	 * 
	 * @param dchErrWarn
	 */
	public void setDchErrWarn(final String dchErrWarn) {
		this.dchErrWarn = dchErrWarn;
	}

	/**
	 * Sets the DchSubmitDate field.
	 * 
	 * @param dchSubmitDate
	 */
	public void setDchSubmitDate(final Date dchSubmitDate) {
		this.dchSubmitDate = (dchSubmitDate != null) ? new Date(dchSubmitDate)
				: null;
	}

	/**
	 * Sets the DchErrorFlag field.
	 * 
	 * @param dchErrorFlag
	 */
	public void setDchErrorFlag(final String dchErrorFlag) {
		this.dchErrorFlag = dchErrorFlag;
	}

	/**
	 * Sets the DchErrRetryCnt field.
	 * 
	 * @param dchErrRetryCnt
	 */
	public void setDchErrRetryCnt(final Integer dchErrRetryCnt) {
		this.dchErrRetryCnt = dchErrRetryCnt;
	}

	/**
	 * Sets the DchSourceSystem field.
	 * 
	 * @param dchSourceSystem
	 */
	public void setDchSourceSystem(final String dchSourceSystem) {
		this.dchSourceSystem = dchSourceSystem;
	}

	/**
	 * Sets the DchOfferId field.
	 * 
	 * @param dchOfferId
	 */
	public void setDchOfferId(final Integer dchOfferId) {
		this.dchOfferId = dchOfferId;
	}

	/**
	 * Sets the DchGroupIndex field.
	 * 
	 * @param dchGroupIndex
	 */
	public void setDchGroupIndex(final Integer dchGroupIndex) {
		this.dchGroupIndex = dchGroupIndex;
	}

	/**
	 * Sets the DchCreateDate field.
	 * 
	 * @param dchCreateDate
	 */
	public void setDchCreateDate(final Date dchCreateDate) {
		this.dchCreateDate = dchCreateDate;
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
