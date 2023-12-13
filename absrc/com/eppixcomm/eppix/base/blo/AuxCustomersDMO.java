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
import java.util.Arrays;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;
import com.eppixcomm.eppix.common.util.Date;

//---------------------
// class javadoc
//---------------------
/**
 * A value object to carry the data for an AuxCustomers.
 *
 *
 * <H3> An AuxCustomers is: </H3>
 *
 * <!-- indent text -->
 * <TABLE BORDER="0" CELLPADDING="0" CELLSPACING="0">
 * <TR>
 * <TD WIDTH="25">&nbsp;</TD>
 * <TD>
 *
 * Any customer details held in addition to those on CUSTOMER (which is a shadow of the chameleon table and hence can not itself be extended).
 * <p>
 *   
 
 The customers\\\\\\\\\\\\\\\' physical address is no longer stored on this table. It has moved to the aud_address
 *   table, which also holds any other addresses for the customer. The physical address is stored on there with an
 *   address_type of \\\\\\\\\\\\\\\"CPHY\\\\\\\\\\\\\\\".
 * </p>
 *
 * <!-- end indent text -->
 * </TD>
 * </TR>
 * </TABLE>
 *
 *
 * <H3> AuxCustomers Value Object: </H3>
 *
 * <!-- indent text -->
 * <TABLE BORDER="0" CELLPADDING="0" CELLSPACING="0">
 * <TR>
 * <TD WIDTH="25">&nbsp;</TD>
 * <TD>
 *
 * <P>
 *     This is a value object (called a Data Model Object or 'DMO').
 *     It is used to pass the data for an auxCustomers into and out of the BASE module.
 *     Because it's purpose is to carry data into and out of the module it is visible outside the module.
 * </P>
 * <P>
 *     This value object carries the data for one auxCustomers. An auxCustomers is:
 * Any customer details held in addition to those on CUSTOMER (which is a shadow of the chameleon table and hence can not itself be extended).
 * </P>
 * <P>
 *     It corresponds to the business logic object AuxCustomers which
 *     contains all the business behaviour of an auxCustomers but is not visible outside the
 *     BASE module.
 * </P>
 * <P>
 *     As a value object it has few methods.
 *     The methods it does have are not business logic, they are just methods to make constructing and manipulating it easier.
 * </P>
 *
 * <!-- end indent text -->
 * </TD>
 * </TR>
 * </TABLE>
 *
 *
 *
 * <H3> These Value Objects Contain: </H3>
 *
 * <!-- indent text -->
 * <TABLE BORDER="0" CELLPADDING="0" CELLSPACING="0">
 * <TR>
 * <TD WIDTH="25">&nbsp;</TD>
 * <TD>
 *
 * <P>
 *    This value object contains fields for all the details of an auxCustomers, namely:
 * </P>
 *


 * <P>
 *    <U>Fields to carry the Attributes of an auxCustomers:</U>
 * </P>
 *
 * <!-- indent text -->
 * <TABLE BORDER="0" CELLPADDING="0" CELLSPACING="0">
 * <TR>
 * <TD WIDTH="25">&nbsp;</TD>
 * <TD>
 *
 * <TABLE BORDER="0" CELLPADDING="5" CELLSPACING="3">
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top"></TD>
 *   <TD ALIGN="left" VALIGN="top"><U>Name</U></TD>
 *   <TD ALIGN="left" VALIGN="top"><U>Datatype</U></TD>
 *   <TD ALIGN="left" VALIGN="top"><U>Nullable</U></TD>
 *   <TD ALIGN="left" VALIGN="top"><U>Description</U></TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>auxTitle</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       eg: Mr, Mrs, Major Freeform text, not limited by any lookup.
 *
 *
 *
 *
 *
 *
 *     <P>
 *       See:
 *       <BR>
 *       <!-- link to the anchor of the attribute's getter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#getAuxTitle()">
 *           getAuxTitle
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setAuxTitle(java.lang.String)">
 *           setAuxTitle (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>auxFirstname</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       eg: Nick
Can contain several firstnames
 *
 *
 *
 *
 *
 *
 *     <P>
 *       See:
 *       <BR>
 *       <!-- link to the anchor of the attribute's getter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#getAuxFirstname()">
 *           getAuxFirstname
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setAuxFirstname(java.lang.String)">
 *           setAuxFirstname (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>auxInvoiceAddrid</B></TD>
 *   <TD ALIGN="left" VALIGN="top">Integer</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Points to the invoice address in aud_address via aud_addrid.
 *       <p>
 *         By default this is the same as aux_mailing_id but can be set to any other aud_address entry for this customer, a
 *         related customer, or a related subscriber.
 *       </p>
 *
 *
 *
 *
 *
 *
 *     <P>
 *       See:
 *       <BR>
 *       <!-- link to the anchor of the attribute's getter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#getAuxInvoiceAddrid()">
 *           getAuxInvoiceAddrid
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setAuxInvoiceAddrid(java.lang.Integer)">
 *           setAuxInvoiceAddrid (Integer)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>bankName</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Customers bank name.
 *
 *
 *
 *
 *
 *
 *     <P>
 *       See:
 *       <BR>
 *       <!-- link to the anchor of the attribute's getter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#getBankName()">
 *           getBankName
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setBankName(java.lang.String)">
 *           setBankName (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>bankAddr1</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       First line of bank addres.
 *
 *
 *
 *
 *
 *
 *     <P>
 *       See:
 *       <BR>
 *       <!-- link to the anchor of the attribute's getter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#getBankAddr1()">
 *           getBankAddr1
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setBankAddr1(java.lang.String)">
 *           setBankAddr1 (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>bankAddr2</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Second line of bank address.
 *
 *
 *
 *
 *
 *
 *     <P>
 *       See:
 *       <BR>
 *       <!-- link to the anchor of the attribute's getter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#getBankAddr2()">
 *           getBankAddr2
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setBankAddr2(java.lang.String)">
 *           setBankAddr2 (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>bankAcName</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Bank account name.
 *
 *
 *
 *
 *
 *
 *     <P>
 *       See:
 *       <BR>
 *       <!-- link to the anchor of the attribute's getter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#getBankAcName()">
 *           getBankAcName
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setBankAcName(java.lang.String)">
 *           setBankAcName (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>ref</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Not used.
 *
 *
 *
 *
 *
 *
 *     <P>
 *       See:
 *       <BR>
 *       <!-- link to the anchor of the attribute's getter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#getRef()">
 *           getRef
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setRef(java.lang.String)">
 *           setRef (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>bankScode</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Bank sort code.
 *
 *
 *
 *
 *
 *
 *     <P>
 *       See:
 *       <BR>
 *       <!-- link to the anchor of the attribute's getter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#getBankScode()">
 *           getBankScode
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setBankScode(java.lang.String)">
 *           setBankScode (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>bankAcNo</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Bank account number.
 *
 *
 *
 *
 *
 *
 *     <P>
 *       See:
 *       <BR>
 *       <!-- link to the anchor of the attribute's getter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#getBankAcNo()">
 *           getBankAcNo
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setBankAcNo(java.lang.String)">
 *           setBankAcNo (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>bankAcType</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Bank account type.
 *       <p>
 *         (Required for OD1, not currently used by Eppix front end)
 *       </p>
 *
 *
 *
 *
 *
 *
 *     <P>
 *       See:
 *       <BR>
 *       <!-- link to the anchor of the attribute's getter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#getBankAcType()">
 *           getBankAcType
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setBankAcType(java.lang.String)">
 *           setBankAcType (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>bankPayType</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Chosen payment method.
 *       <p>
 *         
 \'D\' - DIRECT_DEBIT
 *       </p>
 *
 *
 *
 *
 *
 *
 *     <P>
 *       See:
 *       <BR>
 *       <!-- link to the anchor of the attribute's getter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#getBankPayType()">
 *           getBankPayType
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setBankPayType(java.lang.String)">
 *           setBankPayType (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>auxPrefDebitDay</B></TD>
 *   <TD ALIGN="left" VALIGN="top">Short</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       The customers preferred debit date.
 *       <p>
 *         Must be filled for Debit Order customers
 *       </p>
 *
 *
 *
 *
 *
 *
 *     <P>
 *       See:
 *       <BR>
 *       <!-- link to the anchor of the attribute's getter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#getAuxPrefDebitDay()">
 *           getAuxPrefDebitDay
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setAuxPrefDebitDay(java.lang.Short)">
 *           setAuxPrefDebitDay (Short)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>billAcNo</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Customer account number.
 *       <p>
 *         Provides unique link back to customers.
 *       </p>
 *
 *     <P>
 *       This attribute forms part of the primary key.
 *     </P>
 *
 *
 *
 *
 *
 *     <P>
 *       See:
 *       <BR>
 *       <!-- link to the anchor of the attribute's getter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#getBillAcNo()">
 *           getBillAcNo
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setBillAcNo(java.lang.String)">
 *           setBillAcNo (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>protectCode</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Not used.
 *
 *
 *
 *
 *
 *
 *     <P>
 *       See:
 *       <BR>
 *       <!-- link to the anchor of the attribute's getter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#getProtectCode()">
 *           getProtectCode
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setProtectCode(java.lang.String)">
 *           setProtectCode (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>handsetCt</B></TD>
 *   <TD ALIGN="left" VALIGN="top">Integer</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Number subscribers connected against the bill account.
 *
 *
 *
 *
 *
 *
 *     <P>
 *       See:
 *       <BR>
 *       <!-- link to the anchor of the attribute's getter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#getHandsetCt()">
 *           getHandsetCt
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setHandsetCt(java.lang.Integer)">
 *           setHandsetCt (Integer)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>bankDate</B></TD>
 *   <TD ALIGN="left" VALIGN="top">Date</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Date on which mandate for Direct Debit was sent to the bank.
 *
 *
 *
 *
 *
 *
 *     <P>
 *       See:
 *       <BR>
 *       <!-- link to the anchor of the attribute's getter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#getBankDate()">
 *           getBankDate
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setBankDate(com.cmgwds.eppix.util.Date)">
 *           setBankDate (Date)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>confDate</B></TD>
 *   <TD ALIGN="left" VALIGN="top">Date</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Date on which bank confirmed receipt of  Direct Debit mandate.
 *
 *
 *
 *
 *
 *
 *     <P>
 *       See:
 *       <BR>
 *       <!-- link to the anchor of the attribute's getter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#getConfDate()">
 *           getConfDate
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setConfDate(com.cmgwds.eppix.util.Date)">
 *           setConfDate (Date)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>auxComment</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Not used.
 *
 *
 *
 *
 *
 *
 *     <P>
 *       See:
 *       <BR>
 *       <!-- link to the anchor of the attribute's getter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#getAuxComment()">
 *           getAuxComment
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setAuxComment(java.lang.String)">
 *           setAuxComment (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>dateOfBirth</B></TD>
 *   <TD ALIGN="left" VALIGN="top">Date</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       3.
 *       <p>
 *         1 This field holds the DATE OF BIRTH (was ins_can_date)
 *       </p>
 *
 *
 *
 *
 *
 *
 *     <P>
 *       See:
 *       <BR>
 *       <!-- link to the anchor of the attribute's getter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#getDateOfBirth()">
 *           getDateOfBirth
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setDateOfBirth(com.cmgwds.eppix.util.Date)">
 *           setDateOfBirth (Date)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>refPayDate</B></TD>
 *   <TD ALIGN="left" VALIGN="top">Date</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Not uesd.
 *
 *
 *
 *
 *
 *
 *     <P>
 *       See:
 *       <BR>
 *       <!-- link to the anchor of the attribute's getter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#getRefPayDate()">
 *           getRefPayDate
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setRefPayDate(com.cmgwds.eppix.util.Date)">
 *           setRefPayDate (Date)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>acClosDate</B></TD>
 *   <TD ALIGN="left" VALIGN="top">Date</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Not used.
 *
 *
 *
 *
 *
 *
 *     <P>
 *       See:
 *       <BR>
 *       <!-- link to the anchor of the attribute's getter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#getAcClosDate()">
 *           getAcClosDate
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setAcClosDate(com.cmgwds.eppix.util.Date)">
 *           setAcClosDate (Date)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>noReasDate</B></TD>
 *   <TD ALIGN="left" VALIGN="top">Date</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Not used.
 *
 *
 *
 *
 *
 *
 *     <P>
 *       See:
 *       <BR>
 *       <!-- link to the anchor of the attribute's getter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#getNoReasDate()">
 *           getNoReasDate
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setNoReasDate(com.cmgwds.eppix.util.Date)">
 *           setNoReasDate (Date)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>remLetDate</B></TD>
 *   <TD ALIGN="left" VALIGN="top">Date</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Not used.
 *
 *
 *
 *
 *
 *
 *     <P>
 *       See:
 *       <BR>
 *       <!-- link to the anchor of the attribute's getter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#getRemLetDate()">
 *           getRemLetDate
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setRemLetDate(com.cmgwds.eppix.util.Date)">
 *           setRemLetDate (Date)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>acTranDate</B></TD>
 *   <TD ALIGN="left" VALIGN="top">Date</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Not used.
 *
 *
 *
 *
 *
 *
 *     <P>
 *       See:
 *       <BR>
 *       <!-- link to the anchor of the attribute's getter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#getAcTranDate()">
 *           getAcTranDate
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setAcTranDate(com.cmgwds.eppix.util.Date)">
 *           setAcTranDate (Date)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>noAcDate</B></TD>
 *   <TD ALIGN="left" VALIGN="top">Date</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *
 *
 *
 *
 *
 *
 *
 *     <P>
 *       See:
 *       <BR>
 *       <!-- link to the anchor of the attribute's getter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#getNoAcDate()">
 *           getNoAcDate
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setNoAcDate(com.cmgwds.eppix.util.Date)">
 *           setNoAcDate (Date)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>srFlag</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Indicator which determines whether customer requires a collective invoice.
 *       <p>
 *         <ul>
 *         <p>
 *           C = collective invoices N= SIM level invoices May differ per client site
 *         </p>
 *         </ul>
 *       </p>
 *
 *
 *
 *
 *
 *
 *     <P>
 *       See:
 *       <BR>
 *       <!-- link to the anchor of the attribute's getter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#getSrFlag()">
 *           getSrFlag
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setSrFlag(java.lang.String)">
 *           setSrFlag (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>processed</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Used for identifying the account details which had been downloaded to the MEGA accounting suite.
 *       <p>
 *         This field is spare in the new system.
 *       </p>
 *
 *
 *
 *
 *
 *
 *     <P>
 *       See:
 *       <BR>
 *       <!-- link to the anchor of the attribute's getter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#getProcessed()">
 *           getProcessed
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setProcessed(java.lang.String)">
 *           setProcessed (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>packageCode</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       The package this customer has been placed on.
 *       <p>
 *         This becomes the default package for all his subscribers, though they can be assigned to other packages if desired.
 *         (There is no flag to make this default enforced). NULL = no default package set for this customer.
 *       </p>
 *
 *
 *
 *
 *
 *
 *     <P>
 *       See:
 *       <BR>
 *       <!-- link to the anchor of the attribute's getter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#getPackageCode()">
 *           getPackageCode
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setPackageCode(java.lang.String)">
 *           setPackageCode (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>auxAccountType</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Type of account.
 *       <p>
 *         "P" = private, "B" = Business Extended to be a user definable 5 character code.
 *       </p>
 *
 *
 *
 *
 *
 *
 *     <P>
 *       See:
 *       <BR>
 *       <!-- link to the anchor of the attribute's getter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#getAuxAccountType()">
 *           getAuxAccountType
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setAuxAccountType(java.lang.String)">
 *           setAuxAccountType (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>auxBillCycle</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       The billing cycle for the customer.
 *
 *
 *
 *
 *
 *
 *     <P>
 *       See:
 *       <BR>
 *       <!-- link to the anchor of the attribute's getter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#getAuxBillCycle()">
 *           getAuxBillCycle
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setAuxBillCycle(java.lang.String)">
 *           setAuxBillCycle (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>creditCardNo</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       credit card number
 *
 *
 *
 *
 *
 *
 *     <P>
 *       See:
 *       <BR>
 *       <!-- link to the anchor of the attribute's getter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#getCreditCardNo()">
 *           getCreditCardNo
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setCreditCardNo(java.lang.String)">
 *           setCreditCardNo (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>creditCardName</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       credit card name
 *
 *
 *
 *
 *
 *
 *     <P>
 *       See:
 *       <BR>
 *       <!-- link to the anchor of the attribute's getter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#getCreditCardName()">
 *           getCreditCardName
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setCreditCardName(java.lang.String)">
 *           setCreditCardName (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>expiryDate</B></TD>
 *   <TD ALIGN="left" VALIGN="top">Date</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       credit card expiry date
 *
 *
 *
 *
 *
 *
 *     <P>
 *       See:
 *       <BR>
 *       <!-- link to the anchor of the attribute's getter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#getExpiryDate()">
 *           getExpiryDate
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setExpiryDate(com.cmgwds.eppix.util.Date)">
 *           setExpiryDate (Date)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>auxCardCvvNo</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       3 digit credit card CVV2 number.
 *
 *
 *
 *
 *
 *
 *     <P>
 *       See:
 *       <BR>
 *       <!-- link to the anchor of the attribute's getter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#getAuxCardCvvNo()">
 *           getAuxCardCvvNo
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setAuxCardCvvNo(java.lang.String)">
 *           setAuxCardCvvNo (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>creditScore</B></TD>
 *   <TD ALIGN="left" VALIGN="top">Integer</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       the credit score awarded to this customer
 *
 *
 *
 *
 *
 *
 *     <P>
 *       See:
 *       <BR>
 *       <!-- link to the anchor of the attribute's getter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#getCreditScore()">
 *           getCreditScore
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setCreditScore(java.lang.Integer)">
 *           setCreditScore (Integer)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>servProvId</B></TD>
 *   <TD ALIGN="left" VALIGN="top">Integer</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Service Provider Code.
 *       <p>
 *         (Required for OD1, not currently used by Eppix front end)
 *       </p>
 *
 *
 *
 *
 *
 *
 *     <P>
 *       See:
 *       <BR>
 *       <!-- link to the anchor of the attribute's getter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#getServProvId()">
 *           getServProvId
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setServProvId(java.lang.Integer)">
 *           setServProvId (Integer)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>dealerId</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Dealer Code.
 *       <p>
 *         (Required for OD1, not currently used by Eppix front end)
 *       </p>
 *
 *
 *
 *
 *
 *
 *     <P>
 *       See:
 *       <BR>
 *       <!-- link to the anchor of the attribute's getter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#getDealerId()">
 *           getDealerId
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setDealerId(java.lang.String)">
 *           setDealerId (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>salesman</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Salesman Code.
 *       <p>
 *         (Required for OD1, not currently used by Eppix front end)
 *       </p>
 *
 *
 *
 *
 *
 *
 *     <P>
 *       See:
 *       <BR>
 *       <!-- link to the anchor of the attribute's getter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#getSalesman()">
 *           getSalesman
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setSalesman(java.lang.String)">
 *           setSalesman (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>idNumber</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       ID Number.
 *       <p>
 *         (Required for OD1, not currently used by Eppix front end)
 *       </p>
 *
 *
 *
 *
 *
 *
 *     <P>
 *       See:
 *       <BR>
 *       <!-- link to the anchor of the attribute's getter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#getIdNumber()">
 *           getIdNumber
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setIdNumber(java.lang.String)">
 *           setIdNumber (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>accStatus</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Account Status.
 *       <p>
 *         (Required for OD1, not currently used by Eppix front end)
 *       </p>
 *
 *
 *
 *
 *
 *
 *     <P>
 *       See:
 *       <BR>
 *       <!-- link to the anchor of the attribute's getter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#getAccStatus()">
 *           getAccStatus
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setAccStatus(java.lang.String)">
 *           setAccStatus (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>compRegNo</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Company Reg.
 *       <p>
 *         No. (Required for OD1, not currently used by Eppix front end)
 *       </p>
 *
 *
 *
 *
 *
 *
 *     <P>
 *       See:
 *       <BR>
 *       <!-- link to the anchor of the attribute's getter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#getCompRegNo()">
 *           getCompRegNo
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setCompRegNo(java.lang.String)">
 *           setCompRegNo (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>stationaryType</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Stationary type.
 *       <p>
 *         (Required for OD1, not currently used by Eppix front end)
 *       </p>
 *
 *
 *
 *
 *
 *
 *     <P>
 *       See:
 *       <BR>
 *       <!-- link to the anchor of the attribute's getter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#getStationaryType()">
 *           getStationaryType
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setStationaryType(java.lang.String)">
 *           setStationaryType (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>maxNoSubs</B></TD>
 *   <TD ALIGN="left" VALIGN="top">Integer</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Maximum number of subscribers allowed on the account.
 *       <p>
 *         0 means unlimited.
 *       </p>
 *
 *
 *
 *
 *
 *
 *     <P>
 *       See:
 *       <BR>
 *       <!-- link to the anchor of the attribute's getter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#getMaxNoSubs()">
 *           getMaxNoSubs
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setMaxNoSubs(java.lang.Integer)">
 *           setMaxNoSubs (Integer)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>auxCurrency</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Alternate Currency for Customer (mainly for EURO)
 *
 *
 *
 *
 *
 *
 *     <P>
 *       See:
 *       <BR>
 *       <!-- link to the anchor of the attribute's getter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#getAuxCurrency()">
 *           getAuxCurrency
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setAuxCurrency(java.lang.String)">
 *           setAuxCurrency (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>auxCountryCode</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Identifies the Customer's country.
 *
 *
 *
 *
 *
 *
 *     <P>
 *       See:
 *       <BR>
 *       <!-- link to the anchor of the attribute's getter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#getAuxCountryCode()">
 *           getAuxCountryCode
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setAuxCountryCode(java.lang.String)">
 *           setAuxCountryCode (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>auxGender</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Gender of customer
 *
 *
 *
 *
 *
 *
 *     <P>
 *       See:
 *       <BR>
 *       <!-- link to the anchor of the attribute's getter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#getAuxGender()">
 *           getAuxGender
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setAuxGender(java.lang.String)">
 *           setAuxGender (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>auxSubGrpAccNo</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Customers Sub Group Account No.
 *
 *
 *
 *
 *
 *
 *     <P>
 *       See:
 *       <BR>
 *       <!-- link to the anchor of the attribute's getter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#getAuxSubGrpAccNo()">
 *           getAuxSubGrpAccNo
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setAuxSubGrpAccNo(java.lang.String)">
 *           setAuxSubGrpAccNo (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>auxPrepaidStat</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       PrePaid Status of Customer
"CC" - Contract Customer
"PC" - PrePaid Customer Captured
"PN" - PrePaid Customer Not Captured
 *
 *
 *
 *
 *
 *
 *     <P>
 *       See:
 *       <BR>
 *       <!-- link to the anchor of the attribute's getter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#getAuxPrepaidStat()">
 *           getAuxPrepaidStat
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setAuxPrepaidStat(java.lang.String)">
 *           setAuxPrepaidStat (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>auxCreditClass</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       The credit class is mechanism that allows a measure of the credit worth of a customer
 *
 *
 *
 *
 *
 *
 *     <P>
 *       See:
 *       <BR>
 *       <!-- link to the anchor of the attribute's getter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#getAuxCreditClass()">
 *           getAuxCreditClass
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setAuxCreditClass(java.lang.String)">
 *           setAuxCreditClass (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>auxAutoLimitInd</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       The field determines whether a customer's credit limit is affected by the dynamic credit mechanism
 *
 *
 *
 *
 *
 *
 *     <P>
 *       See:
 *       <BR>
 *       <!-- link to the anchor of the attribute's getter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#getAuxAutoLimitInd()">
 *           getAuxAutoLimitInd
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setAuxAutoLimitInd(java.lang.String)">
 *           setAuxAutoLimitInd (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>auxLmtUpVal</B></TD>
 *   <TD ALIGN="left" VALIGN="top">Short</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       The field holds the upgrade value for the credit limit
 *
 *
 *
 *
 *
 *
 *     <P>
 *       See:
 *       <BR>
 *       <!-- link to the anchor of the attribute's getter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#getAuxLmtUpVal()">
 *           getAuxLmtUpVal
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setAuxLmtUpVal(java.lang.Short)">
 *           setAuxLmtUpVal (Short)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>auxLmtDnVal</B></TD>
 *   <TD ALIGN="left" VALIGN="top">Short</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       The field holds the downgrade value for the credit limit
 *
 *
 *
 *
 *
 *
 *     <P>
 *       See:
 *       <BR>
 *       <!-- link to the anchor of the attribute's getter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#getAuxLmtDnVal()">
 *           getAuxLmtDnVal
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setAuxLmtDnVal(java.lang.Short)">
 *           setAuxLmtDnVal (Short)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>auxAnalysis1</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Type of Business - linked to TT Group BUSINESS
 *
 *
 *
 *
 *
 *
 *     <P>
 *       See:
 *       <BR>
 *       <!-- link to the anchor of the attribute's getter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#getAuxAnalysis1()">
 *           getAuxAnalysis1
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setAuxAnalysis1(java.lang.String)">
 *           setAuxAnalysis1 (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>auxAnalysis2</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Nature of Business - free text field
 *
 *
 *
 *
 *
 *
 *     <P>
 *       See:
 *       <BR>
 *       <!-- link to the anchor of the attribute's getter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#getAuxAnalysis2()">
 *           getAuxAnalysis2
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setAuxAnalysis2(java.lang.String)">
 *           setAuxAnalysis2 (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>auxAnalysis3</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Trading As Name - free text field
 *
 *
 *
 *
 *
 *
 *     <P>
 *       See:
 *       <BR>
 *       <!-- link to the anchor of the attribute's getter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#getAuxAnalysis3()">
 *           getAuxAnalysis3
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setAuxAnalysis3(java.lang.String)">
 *           setAuxAnalysis3 (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>auxAnalysis4</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Employer - free text field
 *
 *
 *
 *
 *
 *
 *     <P>
 *       See:
 *       <BR>
 *       <!-- link to the anchor of the attribute's getter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#getAuxAnalysis4()">
 *           getAuxAnalysis4
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setAuxAnalysis4(java.lang.String)">
 *           setAuxAnalysis4 (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>auxAnalysis5</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Nationality - Linked to TT Group NATION
 *
 *
 *
 *
 *
 *
 *     <P>
 *       See:
 *       <BR>
 *       <!-- link to the anchor of the attribute's getter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#getAuxAnalysis5()">
 *           getAuxAnalysis5
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setAuxAnalysis5(java.lang.String)">
 *           setAuxAnalysis5 (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>auxAnalysis6</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Marital Status - Linked to TT Group MARITAL
 *
 *
 *
 *
 *
 *
 *     <P>
 *       See:
 *       <BR>
 *       <!-- link to the anchor of the attribute's getter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#getAuxAnalysis6()">
 *           getAuxAnalysis6
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setAuxAnalysis6(java.lang.String)">
 *           setAuxAnalysis6 (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>auxAnalysis7</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Maiden Name - free text field
 *
 *
 *
 *
 *
 *
 *     <P>
 *       See:
 *       <BR>
 *       <!-- link to the anchor of the attribute's getter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#getAuxAnalysis7()">
 *           getAuxAnalysis7
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setAuxAnalysis7(java.lang.String)">
 *           setAuxAnalysis7 (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>auxAnalysis8</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Number of Dependents - Free text field
 *
 *
 *
 *
 *
 *
 *     <P>
 *       See:
 *       <BR>
 *       <!-- link to the anchor of the attribute's getter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#getAuxAnalysis8()">
 *           getAuxAnalysis8
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setAuxAnalysis8(java.lang.String)">
 *           setAuxAnalysis8 (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>auxAnalysis9</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Car Registration Number - Free text Field
 *
 *
 *
 *
 *
 *
 *     <P>
 *       See:
 *       <BR>
 *       <!-- link to the anchor of the attribute's getter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#getAuxAnalysis9()">
 *           getAuxAnalysis9
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setAuxAnalysis9(java.lang.String)">
 *           setAuxAnalysis9 (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>auxAnalysis10</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Voyager Number - Free text field (to do with AIRMILES)
 *
 *
 *
 *
 *
 *
 *     <P>
 *       See:
 *       <BR>
 *       <!-- link to the anchor of the attribute's getter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#getAuxAnalysis10()">
 *           getAuxAnalysis10
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setAuxAnalysis10(java.lang.String)">
 *           setAuxAnalysis10 (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>auxAnalysis11</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Middle Name - Free text field
 *
 *
 *
 *
 *
 *
 *     <P>
 *       See:
 *       <BR>
 *       <!-- link to the anchor of the attribute's getter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#getAuxAnalysis11()">
 *           getAuxAnalysis11
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setAuxAnalysis11(java.lang.String)">
 *           setAuxAnalysis11 (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>auxAnalysis12</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Gender of Applicant  - Linked to TT Group GENDER
 *
 *
 *
 *
 *
 *
 *     <P>
 *       See:
 *       <BR>
 *       <!-- link to the anchor of the attribute's getter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#getAuxAnalysis12()">
 *           getAuxAnalysis12
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setAuxAnalysis12(java.lang.String)">
 *           setAuxAnalysis12 (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>auxAnalysis13</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Passport  - Free Text Field
 *
 *
 *
 *
 *
 *
 *     <P>
 *       See:
 *       <BR>
 *       <!-- link to the anchor of the attribute's getter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#getAuxAnalysis13()">
 *           getAuxAnalysis13
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setAuxAnalysis13(java.lang.String)">
 *           setAuxAnalysis13 (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>auxAnalysis14</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       One Key Question - this field holds the question asked of the subscriber
 *
 *
 *
 *
 *
 *
 *     <P>
 *       See:
 *       <BR>
 *       <!-- link to the anchor of the attribute's getter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#getAuxAnalysis14()">
 *           getAuxAnalysis14
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setAuxAnalysis14(java.lang.String)">
 *           setAuxAnalysis14 (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>auxAnalysis15</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       One Key Answer - this field holds the expected answer that the subscriber should give in reply to the question above
 *
 *
 *
 *
 *
 *
 *     <P>
 *       See:
 *       <BR>
 *       <!-- link to the anchor of the attribute's getter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#getAuxAnalysis15()">
 *           getAuxAnalysis15
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setAuxAnalysis15(java.lang.String)">
 *           setAuxAnalysis15 (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>auxAnalysis16</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       CVE Deposit - Free Text Field
 *
 *
 *
 *
 *
 *
 *     <P>
 *       See:
 *       <BR>
 *       <!-- link to the anchor of the attribute's getter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#getAuxAnalysis16()">
 *           getAuxAnalysis16
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setAuxAnalysis16(java.lang.String)">
 *           setAuxAnalysis16 (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>auxAnalysis17</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Credit Controller Extension - Free Text Field
 *
 *
 *
 *
 *
 *
 *     <P>
 *       See:
 *       <BR>
 *       <!-- link to the anchor of the attribute's getter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#getAuxAnalysis17()">
 *           getAuxAnalysis17
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setAuxAnalysis17(java.lang.String)">
 *           setAuxAnalysis17 (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>auxAnalysis18</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Home Phone Number Prefix - Free Text Field
 *
 *
 *
 *
 *
 *
 *     <P>
 *       See:
 *       <BR>
 *       <!-- link to the anchor of the attribute's getter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#getAuxAnalysis18()">
 *           getAuxAnalysis18
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setAuxAnalysis18(java.lang.String)">
 *           setAuxAnalysis18 (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>auxAnalysis19</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Work Phone Number Prefix - Free Text Field
 *
 *
 *
 *
 *
 *
 *     <P>
 *       See:
 *       <BR>
 *       <!-- link to the anchor of the attribute's getter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#getAuxAnalysis19()">
 *           getAuxAnalysis19
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setAuxAnalysis19(java.lang.String)">
 *           setAuxAnalysis19 (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>auxAnalysis20</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Fax Number Prefix - Free Text Field
 *
 *
 *
 *
 *
 *
 *     <P>
 *       See:
 *       <BR>
 *       <!-- link to the anchor of the attribute's getter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#getAuxAnalysis20()">
 *           getAuxAnalysis20
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setAuxAnalysis20(java.lang.String)">
 *           setAuxAnalysis20 (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>auxAnalysis21</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Work Phone Number Extension - Free Text Field
 *
 *
 *
 *
 *
 *
 *     <P>
 *       See:
 *       <BR>
 *       <!-- link to the anchor of the attribute's getter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#getAuxAnalysis21()">
 *           getAuxAnalysis21
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setAuxAnalysis21(java.lang.String)">
 *           setAuxAnalysis21 (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>auxAnalysis22</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Spare analysis field
 *
 *
 *
 *
 *
 *
 *     <P>
 *       See:
 *       <BR>
 *       <!-- link to the anchor of the attribute's getter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#getAuxAnalysis22()">
 *           getAuxAnalysis22
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setAuxAnalysis22(java.lang.String)">
 *           setAuxAnalysis22 (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>auxAnalysis23</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Spare analysis field
 *
 *
 *
 *
 *
 *
 *     <P>
 *       See:
 *       <BR>
 *       <!-- link to the anchor of the attribute's getter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#getAuxAnalysis23()">
 *           getAuxAnalysis23
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setAuxAnalysis23(java.lang.String)">
 *           setAuxAnalysis23 (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>auxAnalysis24</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Spare analysis field
 *
 *
 *
 *
 *
 *
 *     <P>
 *       See:
 *       <BR>
 *       <!-- link to the anchor of the attribute's getter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#getAuxAnalysis24()">
 *           getAuxAnalysis24
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setAuxAnalysis24(java.lang.String)">
 *           setAuxAnalysis24 (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>auxAnalysis25</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Spare analysis field
 *
 *
 *
 *
 *
 *
 *     <P>
 *       See:
 *       <BR>
 *       <!-- link to the anchor of the attribute's getter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#getAuxAnalysis25()">
 *           getAuxAnalysis25
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setAuxAnalysis25(java.lang.String)">
 *           setAuxAnalysis25 (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>auxAnalysis26</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Spare analysis field
 *
 *
 *
 *
 *
 *
 *     <P>
 *       See:
 *       <BR>
 *       <!-- link to the anchor of the attribute's getter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#getAuxAnalysis26()">
 *           getAuxAnalysis26
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setAuxAnalysis26(java.lang.String)">
 *           setAuxAnalysis26 (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>auxAnalysis27</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Spare analysis field
 *
 *
 *
 *
 *
 *
 *     <P>
 *       See:
 *       <BR>
 *       <!-- link to the anchor of the attribute's getter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#getAuxAnalysis27()">
 *           getAuxAnalysis27
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setAuxAnalysis27(java.lang.String)">
 *           setAuxAnalysis27 (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>auxAnalysis28</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Spare analysis field
 *
 *
 *
 *
 *
 *
 *     <P>
 *       See:
 *       <BR>
 *       <!-- link to the anchor of the attribute's getter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#getAuxAnalysis28()">
 *           getAuxAnalysis28
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setAuxAnalysis28(java.lang.String)">
 *           setAuxAnalysis28 (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>auxAnalysis29</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Spare analysis field
 *
 *
 *
 *
 *
 *
 *     <P>
 *       See:
 *       <BR>
 *       <!-- link to the anchor of the attribute's getter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#getAuxAnalysis29()">
 *           getAuxAnalysis29
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setAuxAnalysis29(java.lang.String)">
 *           setAuxAnalysis29 (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>auxAnalysis30</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Spare analysis field
 *
 *
 *
 *
 *
 *
 *     <P>
 *       See:
 *       <BR>
 *       <!-- link to the anchor of the attribute's getter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#getAuxAnalysis30()">
 *           getAuxAnalysis30
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setAuxAnalysis30(java.lang.String)">
 *           setAuxAnalysis30 (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 * </TABLE>
 *
 * <!-- end indent text -->
 * </TD>
 * </TR>
 * </TABLE>
 *


 * <P>
 *   <U>Fields that carry attributes from other value objects (known as 'flattened in' attributes):</U>
 * </P>
 *
 * <!-- indent text -->
 * <TABLE BORDER="0" CELLPADDING="0" CELLSPACING="0">
 * <TR>
 * <TD WIDTH="25">&nbsp;</TD>
 * <TD>
 *
 *   <P>
 *     This value object has no attributes 'flattened in' from other value objects.
 *   </P>
 *
 * <!-- end indent text -->
 * </TD>
 * </TR>
 * </TABLE>
 *


 *
 * <P>
 *   <U>Fields that can carry one or more associated value objects (known as 'embedded' value objects).</U>
 * </P>
 *
 * <!-- indent text -->
 * <TABLE BORDER="0" CELLPADDING="0" CELLSPACING="0">
 * <TR>
 * <TD WIDTH="25">&nbsp;</TD>
 * <TD>
 *
 *   <P>
 *     This value object never contains any embedded value objects.
 *   </P>
 *
 * <!-- end indent text -->
 * </TD>
 * </TR>
 * </TABLE>
 *
 * <!-- end indent text -->
 * </TD>
 * </TR>
 * </TABLE>
 *
 * <H3> These Value Objects Are Contained by: </H3>


 * <P>
 *   <U>Selected Fields Flattened into:</U>
 * </P>
 *
 * <!-- indent text -->
 * <TABLE BORDER="0" CELLPADDING="0" CELLSPACING="0">
 * <TR>
 * <TD WIDTH="25">&nbsp;</TD>
 * <TD>
 *
 *   <P>
 *     No attributes from this value object get 'flattened in' to other value objects.
 *   </P>
 *
 * <!-- end indent text -->
 * </TD>
 * </TR>
 * </TABLE>
 *


 * <P>
 *   <U>Whole Value Object Embedded in:</U>
 * </P>
 * <!-- indent text -->
 * <TABLE BORDER="0" CELLPADDING="0" CELLSPACING="0">
 * <TR>
 * <TD WIDTH="25">&nbsp;</TD>
 * <TD>
 *
 *   <P>
 *     This value object is never embedded in other value objects.
 *   </P>
 *
 * <!-- end indent text -->
 * </TD>
 * </TR>
 * </TABLE>
 *


 * @see AuxCustomers
 *
 * @author
 * @version $Revision: $
 *
 * @since $jdk$
 */
public class AuxCustomersDMO extends DBO implements Serializable {
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
	private static final int[] fieldTypes = new int[] { FIELD_TYPE_STRING /*
																		 * std
																		 * public
																		 * attribute
																		 * :
																		 * auxTitle
																		 */,
			FIELD_TYPE_STRING /* std public attribute: auxFirstname */,
			FIELD_TYPE_INTEGER /* std public attribute: auxInvoiceAddrid */,
			FIELD_TYPE_STRING /* std public attribute: bankName */,
			FIELD_TYPE_STRING /* std public attribute: bankAddr1 */,
			FIELD_TYPE_STRING /* std public attribute: bankAddr2 */,
			FIELD_TYPE_STRING /* std public attribute: bankAcName */,
			FIELD_TYPE_STRING /* std public attribute: ref */,
			FIELD_TYPE_STRING /* std public attribute: bankScode */,
			FIELD_TYPE_STRING /* std public attribute: bankAcNo */,
			FIELD_TYPE_STRING /* std public attribute: bankAcType */,
			FIELD_TYPE_STRING /* std public attribute: bankPayType */,
			FIELD_TYPE_SHORT /* std public attribute: auxPrefDebitDay */,
			FIELD_TYPE_STRING /* std public attribute: billAcNo */,
			FIELD_TYPE_STRING /* std public attribute: protectCode */,
			FIELD_TYPE_INTEGER /* std public attribute: handsetCt */,
			FIELD_TYPE_DATEONLY /* std public attribute: bankDate */,
			FIELD_TYPE_DATEONLY /* std public attribute: confDate */,
			FIELD_TYPE_STRING /* std public attribute: auxComment */,
			FIELD_TYPE_DATEONLY /* std public attribute: dateOfBirth */,
			FIELD_TYPE_DATEONLY /* std public attribute: refPayDate */,
			FIELD_TYPE_DATEONLY /* std public attribute: acClosDate */,
			FIELD_TYPE_DATEONLY /* std public attribute: noReasDate */,
			FIELD_TYPE_DATEONLY /* std public attribute: remLetDate */,
			FIELD_TYPE_DATEONLY /* std public attribute: acTranDate */,
			FIELD_TYPE_DATEONLY /* std public attribute: noAcDate */,
			FIELD_TYPE_STRING /* std public attribute: srFlag */,
			FIELD_TYPE_STRING /* std public attribute: processed */,
			FIELD_TYPE_STRING /* std public attribute: packageCode */,
			FIELD_TYPE_STRING /* std public attribute: auxAccountType */,
			FIELD_TYPE_STRING /* std public attribute: auxBillCycle */,
			FIELD_TYPE_STRING /* std public attribute: creditCardNo */,
			FIELD_TYPE_STRING /* std public attribute: creditCardName */,
			FIELD_TYPE_DATEONLY /* std public attribute: expiryDate */,
			FIELD_TYPE_STRING /* std public attribute: auxCardCvvNo */,
			FIELD_TYPE_INTEGER /* std public attribute: creditScore */,
			FIELD_TYPE_INTEGER /* std public attribute: servProvId */,
			FIELD_TYPE_STRING /* std public attribute: dealerId */,
			FIELD_TYPE_STRING /* std public attribute: salesman */,
			FIELD_TYPE_STRING /* std public attribute: idNumber */,
			FIELD_TYPE_STRING /* std public attribute: accStatus */,
			FIELD_TYPE_STRING /* std public attribute: compRegNo */,
			FIELD_TYPE_STRING /* std public attribute: stationaryType */,
			FIELD_TYPE_INTEGER /* std public attribute: maxNoSubs */,
			FIELD_TYPE_STRING /* std public attribute: auxCurrency */,
			FIELD_TYPE_STRING /* std public attribute: auxCountryCode */,
			FIELD_TYPE_STRING /* std public attribute: auxGender */,
			FIELD_TYPE_STRING /* std public attribute: auxSubGrpAccNo */,
			FIELD_TYPE_STRING /* std public attribute: auxPrepaidStat */,
			FIELD_TYPE_STRING /* std public attribute: auxCreditClass */,
			FIELD_TYPE_STRING /* std public attribute: auxAutoLimitInd */,
			FIELD_TYPE_SHORT /* std public attribute: auxLmtUpVal */,
			FIELD_TYPE_SHORT /* std public attribute: auxLmtDnVal */,
			FIELD_TYPE_STRING /* std public attribute: auxAnalysis1 */,
			FIELD_TYPE_STRING /* std public attribute: auxAnalysis2 */,
			FIELD_TYPE_STRING /* std public attribute: auxAnalysis3 */,
			FIELD_TYPE_STRING /* std public attribute: auxAnalysis4 */,
			FIELD_TYPE_STRING /* std public attribute: auxAnalysis5 */,
			FIELD_TYPE_STRING /* std public attribute: auxAnalysis6 */,
			FIELD_TYPE_STRING /* std public attribute: auxAnalysis7 */,
			FIELD_TYPE_STRING /* std public attribute: auxAnalysis8 */,
			FIELD_TYPE_STRING /* std public attribute: auxAnalysis9 */,
			FIELD_TYPE_STRING /* std public attribute: auxAnalysis10 */,
			FIELD_TYPE_STRING /* std public attribute: auxAnalysis11 */,
			FIELD_TYPE_STRING /* std public attribute: auxAnalysis12 */,
			FIELD_TYPE_STRING /* std public attribute: auxAnalysis13 */,
			FIELD_TYPE_STRING /* std public attribute: auxAnalysis14 */,
			FIELD_TYPE_STRING /* std public attribute: auxAnalysis15 */,
			FIELD_TYPE_STRING /* std public attribute: auxAnalysis16 */,
			FIELD_TYPE_STRING /* std public attribute: auxAnalysis17 */,
			FIELD_TYPE_STRING /* std public attribute: auxAnalysis18 */,
			FIELD_TYPE_STRING /* std public attribute: auxAnalysis19 */,
			FIELD_TYPE_STRING /* std public attribute: auxAnalysis20 */,
			FIELD_TYPE_STRING /* std public attribute: auxAnalysis21 */,
			FIELD_TYPE_STRING /* std public attribute: auxAnalysis22 */,
			FIELD_TYPE_STRING /* std public attribute: auxAnalysis23 */,
			FIELD_TYPE_STRING /* std public attribute: auxAnalysis24 */,
			FIELD_TYPE_STRING /* std public attribute: auxAnalysis25 */,
			FIELD_TYPE_STRING /* std public attribute: auxAnalysis26 */,
			FIELD_TYPE_STRING /* std public attribute: auxAnalysis27 */,
			FIELD_TYPE_STRING /* std public attribute: auxAnalysis28 */,
			FIELD_TYPE_STRING /* std public attribute: auxAnalysis29 */,
			FIELD_TYPE_STRING /* std public attribute: auxAnalysis30 */
	};

	private final int[] fieldSizes = new int[] {
			auxTitleSize,
			auxFirstnameSize,
			0,
			bankNameSize,
			bankAddr1Size,
			bankAddr2Size,
			bankAcNameSize,
			refSize,
			bankScodeSize,
			bankAcNoSize,
			bankAcTypeSize,
			bankPayTypeSize,
			0,
			billAcNoSize,
			protectCodeSize,
			0,
			0,
			0,
			auxCommentSize,
			0,
			0,
			0,
			0,
			0,
			0,
			0,
			srFlagSize,
			processedSize,
			packageCodeSize,
			auxAccountTypeSize,
			auxBillCycleSize,
			creditCardNoSize,
			creditCardNameSize,
			0,
			auxCardCvvNoSize,
			0,
			0,
			dealerIdSize,
			salesmanSize,
			idNumberSize,
			accStatusSize,
			compRegNoSize,
			stationaryTypeSize,
			0,
			auxCurrencySize,
			auxCountryCodeSize,
			auxGenderSize,
			auxSubGrpAccNoSize,
			auxPrepaidStatSize,
			auxCreditClassSize,
			auxAutoLimitIndSize,
			0,
			0,
			auxAnalysis1Size,
			auxAnalysis2Size,
			auxAnalysis3Size,
			auxAnalysis4Size,
			auxAnalysis5Size,
			auxAnalysis6Size,
			auxAnalysis7Size,
			auxAnalysis8Size,
			auxAnalysis9Size,
			auxAnalysis10Size,
			auxAnalysis11Size,
			auxAnalysis12Size,
			auxAnalysis13Size,
			auxAnalysis14Size,
			auxAnalysis15Size,
			auxAnalysis16Size,
			auxAnalysis17Size,
			auxAnalysis18Size,
			auxAnalysis19Size,
			auxAnalysis20Size,
			auxAnalysis21Size,
			auxAnalysis22Size,
			auxAnalysis23Size,
			auxAnalysis24Size,
			auxAnalysis25Size,
			auxAnalysis26Size,
			auxAnalysis27Size,
			auxAnalysis28Size,
			auxAnalysis29Size,
			auxAnalysis30Size
	};
	    

	public int[] fieldSizes() {
		return fieldSizes;
	}  

	/**
	 * Unique field index used for Filtering. @see
	 * com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int auxTitleFilter = 0; // filter index
	private static final int auxTitleSize = 10; // field size

	/**
	 * Unique field index used for Filtering. @see
	 * com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int auxFirstnameFilter = 1; // filter index
	private static final int auxFirstnameSize = 40; // field size

	/**
	 * Unique field index used for Filtering. @see
	 * com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int auxInvoiceAddridFilter = 2; // filter index

	/**
	 * Unique field index used for Filtering. @see
	 * com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int bankNameFilter = 3; // filter index
	private static final int bankNameSize = 50; // field size

	/**
	 * Unique field index used for Filtering. @see
	 * com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int bankAddr1Filter = 4; // filter index
	private static final int bankAddr1Size = 50; // field size

	/**
	 * Unique field index used for Filtering. @see
	 * com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int bankAddr2Filter = 5; // filter index
	private static final int bankAddr2Size = 50; // field size

	/**
	 * Unique field index used for Filtering. @see
	 * com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int bankAcNameFilter = 6; // filter index
	private static final int bankAcNameSize = 32; // field size

	/**
	 * Unique field index used for Filtering. @see
	 * com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int refFilter = 7; // filter index
	private static final int refSize = 8; // field size

	/**
	 * Unique field index used for Filtering. @see
	 * com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int bankScodeFilter = 8; // filter index
	private static final int bankScodeSize = 10; // field size

	/**
	 * Unique field index used for Filtering. @see
	 * com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int bankAcNoFilter = 9; // filter index
	private static final int bankAcNoSize = 30; // field size

	/**
	 * Unique field index used for Filtering. @see
	 * com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int bankAcTypeFilter = 10; // filter index
	private static final int bankAcTypeSize = 15; // field size

	/**
	 * Unique field index used for Filtering. @see
	 * com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int bankPayTypeFilter = 11; // filter index
	private static final int bankPayTypeSize = 5; // field size

	/**
	 * Unique field index used for Filtering. @see
	 * com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int auxPrefDebitDayFilter = 12; // filter index

	/**
	 * Unique field index used for Filtering. @see
	 * com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int billAcNoFilter = 13; // filter index
	private static final int billAcNoSize = 8; // field size

	/**
	 * Unique field index used for Filtering. @see
	 * com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int protectCodeFilter = 14; // filter index
	private static final int protectCodeSize = 1; // field size

	/**
	 * Unique field index used for Filtering. @see
	 * com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int handsetCtFilter = 15; // filter index

	/**
	 * Unique field index used for Filtering. @see
	 * com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int bankDateFilter = 16; // filter index

	/**
	 * Unique field index used for Filtering. @see
	 * com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int confDateFilter = 17; // filter index

	/**
	 * Unique field index used for Filtering. @see
	 * com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int auxCommentFilter = 18; // filter index
	private static final int auxCommentSize = 30; // field size

	/**
	 * Unique field index used for Filtering. @see
	 * com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int dateOfBirthFilter = 19; // filter index

	/**
	 * Unique field index used for Filtering. @see
	 * com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int refPayDateFilter = 20; // filter index

	/**
	 * Unique field index used for Filtering. @see
	 * com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int acClosDateFilter = 21; // filter index

	/**
	 * Unique field index used for Filtering. @see
	 * com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int noReasDateFilter = 22; // filter index

	/**
	 * Unique field index used for Filtering. @see
	 * com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int remLetDateFilter = 23; // filter index

	/**
	 * Unique field index used for Filtering. @see
	 * com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int acTranDateFilter = 24; // filter index

	/**
	 * Unique field index used for Filtering. @see
	 * com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int noAcDateFilter = 25; // filter index

	/**
	 * Unique field index used for Filtering. @see
	 * com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int srFlagFilter = 26; // filter index
	private static final int srFlagSize = 1; // field size

	/**
	 * Unique field index used for Filtering. @see
	 * com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int processedFilter = 27; // filter index
	private static final int processedSize = 1; // field size

	/**
	 * Unique field index used for Filtering. @see
	 * com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int packageCodeFilter = 28; // filter index
	private static final int packageCodeSize = 5; // field size

	/**
	 * Unique field index used for Filtering. @see
	 * com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int auxAccountTypeFilter = 29; // filter index
	private static final int auxAccountTypeSize = 5; // field size

	/**
	 * Unique field index used for Filtering. @see
	 * com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int auxBillCycleFilter = 30; // filter index
	private static final int auxBillCycleSize = 5; // field size

	/**
	 * Unique field index used for Filtering. @see
	 * com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int creditCardNoFilter = 31; // filter index
	private static final int creditCardNoSize = 20; // field size

	/**
	 * Unique field index used for Filtering. @see
	 * com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int creditCardNameFilter = 32; // filter index
	private static final int creditCardNameSize = 30; // field size

	/**
	 * Unique field index used for Filtering. @see
	 * com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int expiryDateFilter = 33; // filter index

	/**
	 * Unique field index used for Filtering. @see
	 * com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int auxCardCvvNoFilter = 34; // filter index
	private static final int auxCardCvvNoSize = 3; // field size

	/**
	 * Unique field index used for Filtering. @see
	 * com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int creditScoreFilter = 35; // filter index

	/**
	 * Unique field index used for Filtering. @see
	 * com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int servProvIdFilter = 36; // filter index

	/**
	 * Unique field index used for Filtering. @see
	 * com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int dealerIdFilter = 37; // filter index
	private static final int dealerIdSize = 8; // field size

	/**
	 * Unique field index used for Filtering. @see
	 * com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int salesmanFilter = 38; // filter index
	private static final int salesmanSize = 10; // field size

	/**
	 * Unique field index used for Filtering. @see
	 * com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int idNumberFilter = 39; // filter index
	private static final int idNumberSize = 20; // field size

	/**
	 * Unique field index used for Filtering. @see
	 * com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int accStatusFilter = 40; // filter index
	private static final int accStatusSize = 15; // field size

	/**
	 * Unique field index used for Filtering. @see
	 * com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int compRegNoFilter = 41; // filter index
	private static final int compRegNoSize = 20; // field size

	/**
	 * Unique field index used for Filtering. @see
	 * com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int stationaryTypeFilter = 42; // filter index
	private static final int stationaryTypeSize = 15; // field size

	/**
	 * Unique field index used for Filtering. @see
	 * com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int maxNoSubsFilter = 43; // filter index

	/**
	 * Unique field index used for Filtering. @see
	 * com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int auxCurrencyFilter = 44; // filter index
	private static final int auxCurrencySize = 3; // field size

	/**
	 * Unique field index used for Filtering. @see
	 * com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int auxCountryCodeFilter = 45; // filter index
	private static final int auxCountryCodeSize = 3; // field size

	/**
	 * Unique field index used for Filtering. @see
	 * com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int auxGenderFilter = 46; // filter index
	private static final int auxGenderSize = 1; // field size

	/**
	 * Unique field index used for Filtering. @see
	 * com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int auxSubGrpAccNoFilter = 47; // filter index
	private static final int auxSubGrpAccNoSize = 8; // field size

	/**
	 * Unique field index used for Filtering. @see
	 * com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int auxPrepaidStatFilter = 48; // filter index
	private static final int auxPrepaidStatSize = 2; // field size

	/**
	 * Unique field index used for Filtering. @see
	 * com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int auxCreditClassFilter = 49; // filter index
	private static final int auxCreditClassSize = 5; // field size

	/**
	 * Unique field index used for Filtering. @see
	 * com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int auxAutoLimitIndFilter = 50; // filter index
	private static final int auxAutoLimitIndSize = 1; // field size

	/**
	 * Unique field index used for Filtering. @see
	 * com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int auxLmtUpValFilter = 51; // filter index

	/**
	 * Unique field index used for Filtering. @see
	 * com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int auxLmtDnValFilter = 52; // filter index

	/**
	 * Unique field index used for Filtering. @see
	 * com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int auxAnalysis1Filter = 53; // filter index
	private static final int auxAnalysis1Size = 30; // field size

	/**
	 * Unique field index used for Filtering. @see
	 * com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int auxAnalysis2Filter = 54; // filter index
	private static final int auxAnalysis2Size = 30; // field size

	/**
	 * Unique field index used for Filtering. @see
	 * com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int auxAnalysis3Filter = 55; // filter index
	private static final int auxAnalysis3Size = 30; // field size

	/**
	 * Unique field index used for Filtering. @see
	 * com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int auxAnalysis4Filter = 56; // filter index
	private static final int auxAnalysis4Size = 30; // field size

	/**
	 * Unique field index used for Filtering. @see
	 * com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int auxAnalysis5Filter = 57; // filter index
	private static final int auxAnalysis5Size = 30; // field size

	/**
	 * Unique field index used for Filtering. @see
	 * com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int auxAnalysis6Filter = 58; // filter index
	private static final int auxAnalysis6Size = 30; // field size

	/**
	 * Unique field index used for Filtering. @see
	 * com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int auxAnalysis7Filter = 59; // filter index
	private static final int auxAnalysis7Size = 30; // field size

	/**
	 * Unique field index used for Filtering. @see
	 * com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int auxAnalysis8Filter = 60; // filter index
	private static final int auxAnalysis8Size = 30; // field size

	/**
	 * Unique field index used for Filtering. @see
	 * com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int auxAnalysis9Filter = 61; // filter index
	private static final int auxAnalysis9Size = 30; // field size

	/**
	 * Unique field index used for Filtering. @see
	 * com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int auxAnalysis10Filter = 62; // filter index
	private static final int auxAnalysis10Size = 30; // field size

	/**
	 * Unique field index used for Filtering. @see
	 * com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int auxAnalysis11Filter = 63; // filter index
	private static final int auxAnalysis11Size = 30; // field size

	/**
	 * Unique field index used for Filtering. @see
	 * com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int auxAnalysis12Filter = 64; // filter index
	private static final int auxAnalysis12Size = 30; // field size

	/**
	 * Unique field index used for Filtering. @see
	 * com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int auxAnalysis13Filter = 65; // filter index
	private static final int auxAnalysis13Size = 30; // field size

	/**
	 * Unique field index used for Filtering. @see
	 * com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int auxAnalysis14Filter = 66; // filter index
	private static final int auxAnalysis14Size = 30; // field size

	/**
	 * Unique field index used for Filtering. @see
	 * com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int auxAnalysis15Filter = 67; // filter index
	private static final int auxAnalysis15Size = 30; // field size

	/**
	 * Unique field index used for Filtering. @see
	 * com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int auxAnalysis16Filter = 68; // filter index
	private static final int auxAnalysis16Size = 30; // field size

	/**
	 * Unique field index used for Filtering. @see
	 * com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int auxAnalysis17Filter = 69; // filter index
	private static final int auxAnalysis17Size = 30; // field size

	/**
	 * Unique field index used for Filtering. @see
	 * com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int auxAnalysis18Filter = 70; // filter index
	private static final int auxAnalysis18Size = 30; // field size

	/**
	 * Unique field index used for Filtering. @see
	 * com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int auxAnalysis19Filter = 71; // filter index
	private static final int auxAnalysis19Size = 30; // field size

	/**
	 * Unique field index used for Filtering. @see
	 * com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int auxAnalysis20Filter = 72; // filter index
	private static final int auxAnalysis20Size = 30; // field size

	/**
	 * Unique field index used for Filtering. @see
	 * com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int auxAnalysis21Filter = 73; // filter index
	private static final int auxAnalysis21Size = 30; // field size

	/**
	 * Unique field index used for Filtering. @see
	 * com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int auxAnalysis22Filter = 74; // filter index
	private static final int auxAnalysis22Size = 30; // field size

	/**
	 * Unique field index used for Filtering. @see
	 * com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int auxAnalysis23Filter = 75; // filter index
	private static final int auxAnalysis23Size = 30; // field size

	/**
	 * Unique field index used for Filtering. @see
	 * com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int auxAnalysis24Filter = 76; // filter index
	private static final int auxAnalysis24Size = 30; // field size

	/**
	 * Unique field index used for Filtering. @see
	 * com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int auxAnalysis25Filter = 77; // filter index
	private static final int auxAnalysis25Size = 30; // field size

	/**
	 * Unique field index used for Filtering. @see
	 * com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int auxAnalysis26Filter = 78; // filter index
	private static final int auxAnalysis26Size = 30; // field size

	/**
	 * Unique field index used for Filtering. @see
	 * com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int auxAnalysis27Filter = 79; // filter index
	private static final int auxAnalysis27Size = 30; // field size

	/**
	 * Unique field index used for Filtering. @see
	 * com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int auxAnalysis28Filter = 80; // filter index
	private static final int auxAnalysis28Size = 30; // field size

	/**
	 * Unique field index used for Filtering. @see
	 * com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int auxAnalysis29Filter = 81; // filter index
	private static final int auxAnalysis29Size = 30; // field size

	/**
	 * Unique field index used for Filtering. @see
	 * com.eppixcomm.eppix.common.util.QueryFilter
	 */
	public static final int auxAnalysis30Filter = 82; // filter index
	private static final int auxAnalysis30Size = 30; // field size

	// ~ Instance variables
	// /////////////////////////////////////////////////////

	private Date acClosDate; // Loaded from Schema
	private Date acTranDate; // Loaded from Schema
	private Date bankDate; // Loaded from Schema
	private Date confDate; // Loaded from Schema
	private Date dateOfBirth; // Loaded from Schema
	private Date expiryDate; // Loaded from Schema
	private Date noAcDate; // Loaded from Schema
	private Date noReasDate; // Loaded from Schema
	private Date refPayDate; // Loaded from Schema
	private Date remLetDate; // Loaded from Schema
	private Integer auxInvoiceAddrid; // Loaded from Schema
	private Integer creditScore; // Loaded from Schema
	private Integer handsetCt; // Loaded from Schema
	private Integer maxNoSubs; // Loaded from Schema
	private Integer servProvId; // Loaded from Schema
	private Short auxLmtDnVal; // Loaded from Schema
	private Short auxLmtUpVal; // Loaded from Schema
	private Short auxPrefDebitDay; // Loaded from Schema
	private String accStatus; // Loaded from Schema
	private String auxAccountType; // Loaded from Schema
	private String auxAnalysis1; // Loaded from Schema
	private String auxAnalysis10; // Loaded from Schema
	private String auxAnalysis11; // Loaded from Schema
	private String auxAnalysis12; // Loaded from Schema
	private String auxAnalysis13; // Loaded from Schema
	private String auxAnalysis14; // Loaded from Schema
	private String auxAnalysis15; // Loaded from Schema
	private String auxAnalysis16; // Loaded from Schema
	private String auxAnalysis17; // Loaded from Schema
	private String auxAnalysis18; // Loaded from Schema
	private String auxAnalysis19; // Loaded from Schema
	private String auxAnalysis2; // Loaded from Schema
	private String auxAnalysis20; // Loaded from Schema
	private String auxAnalysis21; // Loaded from Schema
	private String auxAnalysis22; // Loaded from Schema
	private String auxAnalysis23; // Loaded from Schema
	private String auxAnalysis24; // Loaded from Schema
	private String auxAnalysis25; // Loaded from Schema
	private String auxAnalysis26; // Loaded from Schema
	private String auxAnalysis27; // Loaded from Schema
	private String auxAnalysis28; // Loaded from Schema
	private String auxAnalysis29; // Loaded from Schema
	private String auxAnalysis3; // Loaded from Schema
	private String auxAnalysis30; // Loaded from Schema
	private String auxAnalysis4; // Loaded from Schema
	private String auxAnalysis5; // Loaded from Schema
	private String auxAnalysis6; // Loaded from Schema
	private String auxAnalysis7; // Loaded from Schema
	private String auxAnalysis8; // Loaded from Schema
	private String auxAnalysis9; // Loaded from Schema
	private String auxAutoLimitInd; // Loaded from Schema
	private String auxBillCycle; // Loaded from Schema
	private String auxCardCvvNo; // Loaded from Schema
	private String auxComment; // Loaded from Schema
	private String auxCountryCode; // Loaded from Schema
	private String auxCreditClass; // Loaded from Schema
	private String auxCurrency; // Loaded from Schema
	private String auxFirstname; // Loaded from Schema
	private String auxGender; // Loaded from Schema
	private String auxPrepaidStat; // Loaded from Schema
	private String auxSubGrpAccNo; // Loaded from Schema

	// ---------------------
	// Field declarations
	// ---------------------
	// all attributes
	private String auxTitle; // Loaded from Schema
	private String bankAcName; // Loaded from Schema
	private String bankAcNo; // Loaded from Schema
	private String bankAcType; // Loaded from Schema
	private String bankAddr1; // Loaded from Schema
	private String bankAddr2; // Loaded from Schema
	private String bankName; // Loaded from Schema
	private String bankPayType; // Loaded from Schema
	private String bankScode; // Loaded from Schema
	private String billAcNo; // Loaded from Schema
	private String compRegNo; // Loaded from Schema
	private String creditCardName; // Loaded from Schema
	private String creditCardNo; // Loaded from Schema
	private String dealerId; // Loaded from Schema
	private String idNumber; // Loaded from Schema
	private String packageCode; // Loaded from Schema
	private String processed; // Loaded from Schema
	private String protectCode; // Loaded from Schema
	private String ref; // Loaded from Schema
	private String salesman; // Loaded from Schema
	private String srFlag; // Loaded from Schema
	private String stationaryType; // Loaded from Schema

	// ~ Constructors
	// ///////////////////////////////////////////////////////////

	/**
	 * Creates a new AuxCustomersDMO object.
	 */
	public AuxCustomersDMO() {
	}

	// Constructor - taking public attributes
	/**
	 * Creates a new AuxCustomersDMO object.
	 * 
	 * @param auxTitle
	 *            DOCUMENT ME!
	 * @param auxFirstname
	 *            DOCUMENT ME!
	 * @param auxInvoiceAddrid
	 *            DOCUMENT ME!
	 * @param bankName
	 *            DOCUMENT ME!
	 * @param bankAddr1
	 *            DOCUMENT ME!
	 * @param bankAddr2
	 *            DOCUMENT ME!
	 * @param bankAcName
	 *            DOCUMENT ME!
	 * @param ref
	 *            DOCUMENT ME!
	 * @param bankScode
	 *            DOCUMENT ME!
	 * @param bankAcNo
	 *            DOCUMENT ME!
	 * @param bankAcType
	 *            DOCUMENT ME!
	 * @param bankPayType
	 *            DOCUMENT ME!
	 * @param auxPrefDebitDay
	 *            DOCUMENT ME!
	 * @param billAcNo
	 *            DOCUMENT ME!
	 * @param protectCode
	 *            DOCUMENT ME!
	 * @param handsetCt
	 *            DOCUMENT ME!
	 * @param bankDate
	 *            DOCUMENT ME!
	 * @param confDate
	 *            DOCUMENT ME!
	 * @param auxComment
	 *            DOCUMENT ME!
	 * @param dateOfBirth
	 *            DOCUMENT ME!
	 * @param refPayDate
	 *            DOCUMENT ME!
	 * @param acClosDate
	 *            DOCUMENT ME!
	 * @param noReasDate
	 *            DOCUMENT ME!
	 * @param remLetDate
	 *            DOCUMENT ME!
	 * @param acTranDate
	 *            DOCUMENT ME!
	 * @param noAcDate
	 *            DOCUMENT ME!
	 * @param srFlag
	 *            DOCUMENT ME!
	 * @param processed
	 *            DOCUMENT ME!
	 * @param packageCode
	 *            DOCUMENT ME!
	 * @param auxAccountType
	 *            DOCUMENT ME!
	 * @param auxBillCycle
	 *            DOCUMENT ME!
	 * @param creditCardNo
	 *            DOCUMENT ME!
	 * @param creditCardName
	 *            DOCUMENT ME!
	 * @param expiryDate
	 *            DOCUMENT ME!
	 * @param auxCardCvvNo
	 *            DOCUMENT ME!
	 * @param creditScore
	 *            DOCUMENT ME!
	 * @param servProvId
	 *            DOCUMENT ME!
	 * @param dealerId
	 *            DOCUMENT ME!
	 * @param salesman
	 *            DOCUMENT ME!
	 * @param idNumber
	 *            DOCUMENT ME!
	 * @param accStatus
	 *            DOCUMENT ME!
	 * @param compRegNo
	 *            DOCUMENT ME!
	 * @param stationaryType
	 *            DOCUMENT ME!
	 * @param maxNoSubs
	 *            DOCUMENT ME!
	 * @param auxCurrency
	 *            DOCUMENT ME!
	 * @param auxCountryCode
	 *            DOCUMENT ME!
	 * @param auxGender
	 *            DOCUMENT ME!
	 * @param auxSubGrpAccNo
	 *            DOCUMENT ME!
	 * @param auxPrepaidStat
	 *            DOCUMENT ME!
	 * @param auxCreditClass
	 *            DOCUMENT ME!
	 * @param auxAutoLimitInd
	 *            DOCUMENT ME!
	 * @param auxLmtUpVal
	 *            DOCUMENT ME!
	 * @param auxLmtDnVal
	 *            DOCUMENT ME!
	 * @param auxAnalysis1
	 *            DOCUMENT ME!
	 * @param auxAnalysis2
	 *            DOCUMENT ME!
	 * @param auxAnalysis3
	 *            DOCUMENT ME!
	 * @param auxAnalysis4
	 *            DOCUMENT ME!
	 * @param auxAnalysis5
	 *            DOCUMENT ME!
	 * @param auxAnalysis6
	 *            DOCUMENT ME!
	 * @param auxAnalysis7
	 *            DOCUMENT ME!
	 * @param auxAnalysis8
	 *            DOCUMENT ME!
	 * @param auxAnalysis9
	 *            DOCUMENT ME!
	 * @param auxAnalysis10
	 *            DOCUMENT ME!
	 * @param auxAnalysis11
	 *            DOCUMENT ME!
	 * @param auxAnalysis12
	 *            DOCUMENT ME!
	 * @param auxAnalysis13
	 *            DOCUMENT ME!
	 * @param auxAnalysis14
	 *            DOCUMENT ME!
	 * @param auxAnalysis15
	 *            DOCUMENT ME!
	 * @param auxAnalysis16
	 *            DOCUMENT ME!
	 * @param auxAnalysis17
	 *            DOCUMENT ME!
	 * @param auxAnalysis18
	 *            DOCUMENT ME!
	 * @param auxAnalysis19
	 *            DOCUMENT ME!
	 * @param auxAnalysis20
	 *            DOCUMENT ME!
	 * @param auxAnalysis21
	 *            DOCUMENT ME!
	 * @param auxAnalysis22
	 *            DOCUMENT ME!
	 * @param auxAnalysis23
	 *            DOCUMENT ME!
	 * @param auxAnalysis24
	 *            DOCUMENT ME!
	 * @param auxAnalysis25
	 *            DOCUMENT ME!
	 * @param auxAnalysis26
	 *            DOCUMENT ME!
	 * @param auxAnalysis27
	 *            DOCUMENT ME!
	 * @param auxAnalysis28
	 *            DOCUMENT ME!
	 * @param auxAnalysis29
	 *            DOCUMENT ME!
	 * @param auxAnalysis30
	 *            DOCUMENT ME!
	 */
	public AuxCustomersDMO(final String auxTitle, final String auxFirstname,
			final Integer auxInvoiceAddrid, final String bankName,
			final String bankAddr1, final String bankAddr2,
			final String bankAcName, final String ref, final String bankScode,
			final String bankAcNo, final String bankAcType,
			final String bankPayType, final Short auxPrefDebitDay,
			final String billAcNo, final String protectCode,
			final Integer handsetCt, final Date bankDate, final Date confDate,
			final String auxComment, final Date dateOfBirth,
			final Date refPayDate, final Date acClosDate,
			final Date noReasDate, final Date remLetDate,
			final Date acTranDate, final Date noAcDate, final String srFlag,
			final String processed, final String packageCode,
			final String auxAccountType, final String auxBillCycle,
			final String creditCardNo, final String creditCardName,
			final Date expiryDate, final String auxCardCvvNo,
			final Integer creditScore, final Integer servProvId,
			final String dealerId, final String salesman,
			final String idNumber, final String accStatus,
			final String compRegNo, final String stationaryType,
			final Integer maxNoSubs, final String auxCurrency,
			final String auxCountryCode, final String auxGender,
			final String auxSubGrpAccNo, final String auxPrepaidStat,
			final String auxCreditClass, final String auxAutoLimitInd,
			final Short auxLmtUpVal, final Short auxLmtDnVal,
			final String auxAnalysis1, final String auxAnalysis2,
			final String auxAnalysis3, final String auxAnalysis4,
			final String auxAnalysis5, final String auxAnalysis6,
			final String auxAnalysis7, final String auxAnalysis8,
			final String auxAnalysis9, final String auxAnalysis10,
			final String auxAnalysis11, final String auxAnalysis12,
			final String auxAnalysis13, final String auxAnalysis14,
			final String auxAnalysis15, final String auxAnalysis16,
			final String auxAnalysis17, final String auxAnalysis18,
			final String auxAnalysis19, final String auxAnalysis20,
			final String auxAnalysis21, final String auxAnalysis22,
			final String auxAnalysis23, final String auxAnalysis24,
			final String auxAnalysis25, final String auxAnalysis26,
			final String auxAnalysis27, final String auxAnalysis28,
			final String auxAnalysis29, final String auxAnalysis30) {

		this.auxTitle = auxTitle;

		this.auxFirstname = auxFirstname;

		this.auxInvoiceAddrid = auxInvoiceAddrid;

		this.bankName = bankName;

		this.bankAddr1 = bankAddr1;

		this.bankAddr2 = bankAddr2;

		this.bankAcName = bankAcName;

		this.ref = ref;

		this.bankScode = bankScode;

		this.bankAcNo = bankAcNo;

		this.bankAcType = bankAcType;

		this.bankPayType = bankPayType;

		this.auxPrefDebitDay = auxPrefDebitDay;

		this.billAcNo = billAcNo;

		this.protectCode = protectCode;

		this.handsetCt = handsetCt;

		this.bankDate = (bankDate != null) ? new Date(bankDate) : null;

		this.confDate = (confDate != null) ? new Date(confDate) : null;

		this.auxComment = auxComment;

		this.dateOfBirth = (dateOfBirth != null) ? new Date(dateOfBirth) : null;

		this.refPayDate = (refPayDate != null) ? new Date(refPayDate) : null;

		this.acClosDate = (acClosDate != null) ? new Date(acClosDate) : null;

		this.noReasDate = (noReasDate != null) ? new Date(noReasDate) : null;

		this.remLetDate = (remLetDate != null) ? new Date(remLetDate) : null;

		this.acTranDate = (acTranDate != null) ? new Date(acTranDate) : null;

		this.noAcDate = (noAcDate != null) ? new Date(noAcDate) : null;

		this.srFlag = srFlag;

		this.processed = processed;

		this.packageCode = packageCode;

		this.auxAccountType = auxAccountType;

		this.auxBillCycle = auxBillCycle;

		this.creditCardNo = creditCardNo;

		this.creditCardName = creditCardName;

		this.expiryDate = (expiryDate != null) ? new Date(expiryDate) : null;

		this.auxCardCvvNo = auxCardCvvNo;

		this.creditScore = creditScore;

		this.servProvId = servProvId;

		this.dealerId = dealerId;

		this.salesman = salesman;

		this.idNumber = idNumber;

		this.accStatus = accStatus;

		this.compRegNo = compRegNo;

		this.stationaryType = stationaryType;

		this.maxNoSubs = maxNoSubs;

		this.auxCurrency = auxCurrency;

		this.auxCountryCode = auxCountryCode;

		this.auxGender = auxGender;

		this.auxSubGrpAccNo = auxSubGrpAccNo;

		this.auxPrepaidStat = auxPrepaidStat;

		this.auxCreditClass = auxCreditClass;

		this.auxAutoLimitInd = auxAutoLimitInd;

		this.auxLmtUpVal = auxLmtUpVal;

		this.auxLmtDnVal = auxLmtDnVal;

		this.auxAnalysis1 = auxAnalysis1;

		this.auxAnalysis2 = auxAnalysis2;

		this.auxAnalysis3 = auxAnalysis3;

		this.auxAnalysis4 = auxAnalysis4;

		this.auxAnalysis5 = auxAnalysis5;

		this.auxAnalysis6 = auxAnalysis6;

		this.auxAnalysis7 = auxAnalysis7;

		this.auxAnalysis8 = auxAnalysis8;

		this.auxAnalysis9 = auxAnalysis9;

		this.auxAnalysis10 = auxAnalysis10;

		this.auxAnalysis11 = auxAnalysis11;

		this.auxAnalysis12 = auxAnalysis12;

		this.auxAnalysis13 = auxAnalysis13;

		this.auxAnalysis14 = auxAnalysis14;

		this.auxAnalysis15 = auxAnalysis15;

		this.auxAnalysis16 = auxAnalysis16;

		this.auxAnalysis17 = auxAnalysis17;

		this.auxAnalysis18 = auxAnalysis18;

		this.auxAnalysis19 = auxAnalysis19;

		this.auxAnalysis20 = auxAnalysis20;

		this.auxAnalysis21 = auxAnalysis21;

		this.auxAnalysis22 = auxAnalysis22;

		this.auxAnalysis23 = auxAnalysis23;

		this.auxAnalysis24 = auxAnalysis24;

		this.auxAnalysis25 = auxAnalysis25;

		this.auxAnalysis26 = auxAnalysis26;

		this.auxAnalysis27 = auxAnalysis27;

		this.auxAnalysis28 = auxAnalysis28;

		this.auxAnalysis29 = auxAnalysis29;

		this.auxAnalysis30 = auxAnalysis30;
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
		return new DAOArgs(1).arg((this.billAcNo == null) ? null
				: this.billAcNo.trim());
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
				(auxTitle == null) ? null
						: ((auxTitle.length() <= auxTitleSize) ? auxTitle
								: auxTitle.substring(0, auxTitleSize) // auto
																		// trimmed
																		// to
																		// fit,
																		// if
																		// required
																		// .
						),
				(auxFirstname == null) ? null
						: ((auxFirstname.length() <= auxFirstnameSize) ? auxFirstname
								: auxFirstname.substring(0, auxFirstnameSize) // auto
																				// trimmed
																				// to
																				// fit
																				// ,
																				// if
																				// required
																				// .
						),
				auxInvoiceAddrid,
				(bankName == null) ? null
						: ((bankName.length() <= bankNameSize) ? bankName
								: bankName.substring(0, bankNameSize) // auto
																		// trimmed
																		// to
																		// fit,
																		// if
																		// required
																		// .
						),
				(bankAddr1 == null) ? null
						: ((bankAddr1.length() <= bankAddr1Size) ? bankAddr1
								: bankAddr1.substring(0, bankAddr1Size) // auto
																		// trimmed
																		// to
																		// fit,
																		// if
																		// required
																		// .
						),
				(bankAddr2 == null) ? null
						: ((bankAddr2.length() <= bankAddr2Size) ? bankAddr2
								: bankAddr2.substring(0, bankAddr2Size) // auto
																		// trimmed
																		// to
																		// fit,
																		// if
																		// required
																		// .
						),
				(bankAcName == null) ? null
						: ((bankAcName.length() <= bankAcNameSize) ? bankAcName
								: bankAcName.substring(0, bankAcNameSize) // auto
																			// trimmed
																			// to
																			// fit
																			// ,
																			// if
																			// required
																			// .
						),
				(ref == null) ? null : ((ref.length() <= refSize) ? ref : ref
						.substring(0, refSize) // auto trimmed to fit, if
												// required.
						),
				(bankScode == null) ? null
						: ((bankScode.length() <= bankScodeSize) ? bankScode
								: bankScode.substring(0, bankScodeSize) // auto
																		// trimmed
																		// to
																		// fit,
																		// if
																		// required
																		// .
						),
				(bankAcNo == null) ? null
						: ((bankAcNo.length() <= bankAcNoSize) ? bankAcNo
								: bankAcNo.substring(0, bankAcNoSize) // auto
																		// trimmed
																		// to
																		// fit,
																		// if
																		// required
																		// .
						),
				(bankAcType == null) ? null
						: ((bankAcType.length() <= bankAcTypeSize) ? bankAcType
								: bankAcType.substring(0, bankAcTypeSize) // auto
																			// trimmed
																			// to
																			// fit
																			// ,
																			// if
																			// required
																			// .
						),
				(bankPayType == null) ? null
						: ((bankPayType.length() <= bankPayTypeSize) ? bankPayType
								: bankPayType.substring(0, bankPayTypeSize) // auto
																			// trimmed
																			// to
																			// fit
																			// ,
																			// if
																			// required
																			// .
						),
				auxPrefDebitDay,
				(billAcNo == null) ? null
						: ((billAcNo.length() <= billAcNoSize) ? billAcNo
								: billAcNo.substring(0, billAcNoSize) // auto
																		// trimmed
																		// to
																		// fit,
																		// if
																		// required
																		// .
						),
				(protectCode == null) ? null
						: ((protectCode.length() <= protectCodeSize) ? protectCode
								: protectCode.substring(0, protectCodeSize) // auto
																			// trimmed
																			// to
																			// fit
																			// ,
																			// if
																			// required
																			// .
						),
				handsetCt,
				bankDate,
				confDate,
				(auxComment == null) ? null
						: ((auxComment.length() <= auxCommentSize) ? auxComment
								: auxComment.substring(0, auxCommentSize) // auto
																			// trimmed
																			// to
																			// fit
																			// ,
																			// if
																			// required
																			// .
						),
				dateOfBirth,
				refPayDate,
				acClosDate,
				noReasDate,
				remLetDate,
				acTranDate,
				noAcDate,
				(srFlag == null) ? null
						: ((srFlag.length() <= srFlagSize) ? srFlag : srFlag
								.substring(0, srFlagSize) // auto trimmed to
															// fit, if required.
						),
				(processed == null) ? null
						: ((processed.length() <= processedSize) ? processed
								: processed.substring(0, processedSize) // auto
																		// trimmed
																		// to
																		// fit,
																		// if
																		// required
																		// .
						),
				(packageCode == null) ? null
						: ((packageCode.length() <= packageCodeSize) ? packageCode
								: packageCode.substring(0, packageCodeSize) // auto
																			// trimmed
																			// to
																			// fit
																			// ,
																			// if
																			// required
																			// .
						),
				(auxAccountType == null) ? null
						: ((auxAccountType.length() <= auxAccountTypeSize) ? auxAccountType
								: auxAccountType.substring(0,
										auxAccountTypeSize) // auto trimmed to
															// fit, if required.
						),
				(auxBillCycle == null) ? null
						: ((auxBillCycle.length() <= auxBillCycleSize) ? auxBillCycle
								: auxBillCycle.substring(0, auxBillCycleSize) // auto
																				// trimmed
																				// to
																				// fit
																				// ,
																				// if
																				// required
																				// .
						),
				(creditCardNo == null) ? null
						: ((creditCardNo.length() <= creditCardNoSize) ? creditCardNo
								: creditCardNo.substring(0, creditCardNoSize) // auto
																				// trimmed
																				// to
																				// fit
																				// ,
																				// if
																				// required
																				// .
						),
				(creditCardName == null) ? null
						: ((creditCardName.length() <= creditCardNameSize) ? creditCardName
								: creditCardName.substring(0,
										creditCardNameSize) // auto trimmed to
															// fit, if required.
						),
				expiryDate,
				(auxCardCvvNo == null) ? null
						: ((auxCardCvvNo.length() <= auxCardCvvNoSize) ? auxCardCvvNo
								: auxCardCvvNo.substring(0, auxCardCvvNoSize) // auto
																				// trimmed
																				// to
																				// fit
																				// ,
																				// if
																				// required
																				// .
						),
				creditScore,
				servProvId,
				(dealerId == null) ? null
						: ((dealerId.length() <= dealerIdSize) ? dealerId
								: dealerId.substring(0, dealerIdSize) // auto
																		// trimmed
																		// to
																		// fit,
																		// if
																		// required
																		// .
						),
				(salesman == null) ? null
						: ((salesman.length() <= salesmanSize) ? salesman
								: salesman.substring(0, salesmanSize) // auto
																		// trimmed
																		// to
																		// fit,
																		// if
																		// required
																		// .
						),
				(idNumber == null) ? null
						: ((idNumber.length() <= idNumberSize) ? idNumber
								: idNumber.substring(0, idNumberSize) // auto
																		// trimmed
																		// to
																		// fit,
																		// if
																		// required
																		// .
						),
				(accStatus == null) ? null
						: ((accStatus.length() <= accStatusSize) ? accStatus
								: accStatus.substring(0, accStatusSize) // auto
																		// trimmed
																		// to
																		// fit,
																		// if
																		// required
																		// .
						),
				(compRegNo == null) ? null
						: ((compRegNo.length() <= compRegNoSize) ? compRegNo
								: compRegNo.substring(0, compRegNoSize) // auto
																		// trimmed
																		// to
																		// fit,
																		// if
																		// required
																		// .
						),
				(stationaryType == null) ? null
						: ((stationaryType.length() <= stationaryTypeSize) ? stationaryType
								: stationaryType.substring(0,
										stationaryTypeSize) // auto trimmed to
															// fit, if required.
						),
				maxNoSubs,
				(auxCurrency == null) ? null
						: ((auxCurrency.length() <= auxCurrencySize) ? auxCurrency
								: auxCurrency.substring(0, auxCurrencySize) // auto
																			// trimmed
																			// to
																			// fit
																			// ,
																			// if
																			// required
																			// .
						),
				(auxCountryCode == null) ? null
						: ((auxCountryCode.length() <= auxCountryCodeSize) ? auxCountryCode
								: auxCountryCode.substring(0,
										auxCountryCodeSize) // auto trimmed to
															// fit, if required.
						),
				(auxGender == null) ? null
						: ((auxGender.length() <= auxGenderSize) ? auxGender
								: auxGender.substring(0, auxGenderSize) // auto
																		// trimmed
																		// to
																		// fit,
																		// if
																		// required
																		// .
						),
				(auxSubGrpAccNo == null) ? null
						: ((auxSubGrpAccNo.length() <= auxSubGrpAccNoSize) ? auxSubGrpAccNo
								: auxSubGrpAccNo.substring(0,
										auxSubGrpAccNoSize) // auto trimmed to
															// fit, if required.
						),
				(auxPrepaidStat == null) ? null
						: ((auxPrepaidStat.length() <= auxPrepaidStatSize) ? auxPrepaidStat
								: auxPrepaidStat.substring(0,
										auxPrepaidStatSize) // auto trimmed to
															// fit, if required.
						),
				(auxCreditClass == null) ? null
						: ((auxCreditClass.length() <= auxCreditClassSize) ? auxCreditClass
								: auxCreditClass.substring(0,
										auxCreditClassSize) // auto trimmed to
															// fit, if required.
						),
				(auxAutoLimitInd == null) ? null
						: ((auxAutoLimitInd.length() <= auxAutoLimitIndSize) ? auxAutoLimitInd
								: auxAutoLimitInd.substring(0,
										auxAutoLimitIndSize) // auto trimmed to
																// fit, if
																// required.
						),
				auxLmtUpVal,
				auxLmtDnVal,
				(auxAnalysis1 == null) ? null
						: ((auxAnalysis1.length() <= auxAnalysis1Size) ? auxAnalysis1
								: auxAnalysis1.substring(0, auxAnalysis1Size) // auto
																				// trimmed
																				// to
																				// fit
																				// ,
																				// if
																				// required
																				// .
						),
				(auxAnalysis2 == null) ? null
						: ((auxAnalysis2.length() <= auxAnalysis2Size) ? auxAnalysis2
								: auxAnalysis2.substring(0, auxAnalysis2Size) // auto
																				// trimmed
																				// to
																				// fit
																				// ,
																				// if
																				// required
																				// .
						),
				(auxAnalysis3 == null) ? null
						: ((auxAnalysis3.length() <= auxAnalysis3Size) ? auxAnalysis3
								: auxAnalysis3.substring(0, auxAnalysis3Size) // auto
																				// trimmed
																				// to
																				// fit
																				// ,
																				// if
																				// required
																				// .
						),
				(auxAnalysis4 == null) ? null
						: ((auxAnalysis4.length() <= auxAnalysis4Size) ? auxAnalysis4
								: auxAnalysis4.substring(0, auxAnalysis4Size) // auto
																				// trimmed
																				// to
																				// fit
																				// ,
																				// if
																				// required
																				// .
						),
				(auxAnalysis5 == null) ? null
						: ((auxAnalysis5.length() <= auxAnalysis5Size) ? auxAnalysis5
								: auxAnalysis5.substring(0, auxAnalysis5Size) // auto
																				// trimmed
																				// to
																				// fit
																				// ,
																				// if
																				// required
																				// .
						),
				(auxAnalysis6 == null) ? null
						: ((auxAnalysis6.length() <= auxAnalysis6Size) ? auxAnalysis6
								: auxAnalysis6.substring(0, auxAnalysis6Size) // auto
																				// trimmed
																				// to
																				// fit
																				// ,
																				// if
																				// required
																				// .
						),
				(auxAnalysis7 == null) ? null
						: ((auxAnalysis7.length() <= auxAnalysis7Size) ? auxAnalysis7
								: auxAnalysis7.substring(0, auxAnalysis7Size) // auto
																				// trimmed
																				// to
																				// fit
																				// ,
																				// if
																				// required
																				// .
						),
				(auxAnalysis8 == null) ? null
						: ((auxAnalysis8.length() <= auxAnalysis8Size) ? auxAnalysis8
								: auxAnalysis8.substring(0, auxAnalysis8Size) // auto
																				// trimmed
																				// to
																				// fit
																				// ,
																				// if
																				// required
																				// .
						),
				(auxAnalysis9 == null) ? null
						: ((auxAnalysis9.length() <= auxAnalysis9Size) ? auxAnalysis9
								: auxAnalysis9.substring(0, auxAnalysis9Size) // auto
																				// trimmed
																				// to
																				// fit
																				// ,
																				// if
																				// required
																				// .
						),
				(auxAnalysis10 == null) ? null
						: ((auxAnalysis10.length() <= auxAnalysis10Size) ? auxAnalysis10
								: auxAnalysis10.substring(0, auxAnalysis10Size) // auto
																				// trimmed
																				// to
																				// fit
																				// ,
																				// if
																				// required
																				// .
						),
				(auxAnalysis11 == null) ? null
						: ((auxAnalysis11.length() <= auxAnalysis11Size) ? auxAnalysis11
								: auxAnalysis11.substring(0, auxAnalysis11Size) // auto
																				// trimmed
																				// to
																				// fit
																				// ,
																				// if
																				// required
																				// .
						),
				(auxAnalysis12 == null) ? null
						: ((auxAnalysis12.length() <= auxAnalysis12Size) ? auxAnalysis12
								: auxAnalysis12.substring(0, auxAnalysis12Size) // auto
																				// trimmed
																				// to
																				// fit
																				// ,
																				// if
																				// required
																				// .
						),
				(auxAnalysis13 == null) ? null
						: ((auxAnalysis13.length() <= auxAnalysis13Size) ? auxAnalysis13
								: auxAnalysis13.substring(0, auxAnalysis13Size) // auto
																				// trimmed
																				// to
																				// fit
																				// ,
																				// if
																				// required
																				// .
						),
				(auxAnalysis14 == null) ? null
						: ((auxAnalysis14.length() <= auxAnalysis14Size) ? auxAnalysis14
								: auxAnalysis14.substring(0, auxAnalysis14Size) // auto
																				// trimmed
																				// to
																				// fit
																				// ,
																				// if
																				// required
																				// .
						),
				(auxAnalysis15 == null) ? null
						: ((auxAnalysis15.length() <= auxAnalysis15Size) ? auxAnalysis15
								: auxAnalysis15.substring(0, auxAnalysis15Size) // auto
																				// trimmed
																				// to
																				// fit
																				// ,
																				// if
																				// required
																				// .
						),
				(auxAnalysis16 == null) ? null
						: ((auxAnalysis16.length() <= auxAnalysis16Size) ? auxAnalysis16
								: auxAnalysis16.substring(0, auxAnalysis16Size) // auto
																				// trimmed
																				// to
																				// fit
																				// ,
																				// if
																				// required
																				// .
						),
				(auxAnalysis17 == null) ? null
						: ((auxAnalysis17.length() <= auxAnalysis17Size) ? auxAnalysis17
								: auxAnalysis17.substring(0, auxAnalysis17Size) // auto
																				// trimmed
																				// to
																				// fit
																				// ,
																				// if
																				// required
																				// .
						),
				(auxAnalysis18 == null) ? null
						: ((auxAnalysis18.length() <= auxAnalysis18Size) ? auxAnalysis18
								: auxAnalysis18.substring(0, auxAnalysis18Size) // auto
																				// trimmed
																				// to
																				// fit
																				// ,
																				// if
																				// required
																				// .
						),
				(auxAnalysis19 == null) ? null
						: ((auxAnalysis19.length() <= auxAnalysis19Size) ? auxAnalysis19
								: auxAnalysis19.substring(0, auxAnalysis19Size) // auto
																				// trimmed
																				// to
																				// fit
																				// ,
																				// if
																				// required
																				// .
						),
				(auxAnalysis20 == null) ? null
						: ((auxAnalysis20.length() <= auxAnalysis20Size) ? auxAnalysis20
								: auxAnalysis20.substring(0, auxAnalysis20Size) // auto
																				// trimmed
																				// to
																				// fit
																				// ,
																				// if
																				// required
																				// .
						),
				(auxAnalysis21 == null) ? null
						: ((auxAnalysis21.length() <= auxAnalysis21Size) ? auxAnalysis21
								: auxAnalysis21.substring(0, auxAnalysis21Size) // auto
																				// trimmed
																				// to
																				// fit
																				// ,
																				// if
																				// required
																				// .
						),
				(auxAnalysis22 == null) ? null
						: ((auxAnalysis22.length() <= auxAnalysis22Size) ? auxAnalysis22
								: auxAnalysis22.substring(0, auxAnalysis22Size) // auto
																				// trimmed
																				// to
																				// fit
																				// ,
																				// if
																				// required
																				// .
						),
				(auxAnalysis23 == null) ? null
						: ((auxAnalysis23.length() <= auxAnalysis23Size) ? auxAnalysis23
								: auxAnalysis23.substring(0, auxAnalysis23Size) // auto
																				// trimmed
																				// to
																				// fit
																				// ,
																				// if
																				// required
																				// .
						),
				(auxAnalysis24 == null) ? null
						: ((auxAnalysis24.length() <= auxAnalysis24Size) ? auxAnalysis24
								: auxAnalysis24.substring(0, auxAnalysis24Size) // auto
																				// trimmed
																				// to
																				// fit
																				// ,
																				// if
																				// required
																				// .
						),
				(auxAnalysis25 == null) ? null
						: ((auxAnalysis25.length() <= auxAnalysis25Size) ? auxAnalysis25
								: auxAnalysis25.substring(0, auxAnalysis25Size) // auto
																				// trimmed
																				// to
																				// fit
																				// ,
																				// if
																				// required
																				// .
						),
				(auxAnalysis26 == null) ? null
						: ((auxAnalysis26.length() <= auxAnalysis26Size) ? auxAnalysis26
								: auxAnalysis26.substring(0, auxAnalysis26Size) // auto
																				// trimmed
																				// to
																				// fit
																				// ,
																				// if
																				// required
																				// .
						),
				(auxAnalysis27 == null) ? null
						: ((auxAnalysis27.length() <= auxAnalysis27Size) ? auxAnalysis27
								: auxAnalysis27.substring(0, auxAnalysis27Size) // auto
																				// trimmed
																				// to
																				// fit
																				// ,
																				// if
																				// required
																				// .
						),
				(auxAnalysis28 == null) ? null
						: ((auxAnalysis28.length() <= auxAnalysis28Size) ? auxAnalysis28
								: auxAnalysis28.substring(0, auxAnalysis28Size) // auto
																				// trimmed
																				// to
																				// fit
																				// ,
																				// if
																				// required
																				// .
						),
				(auxAnalysis29 == null) ? null
						: ((auxAnalysis29.length() <= auxAnalysis29Size) ? auxAnalysis29
								: auxAnalysis29.substring(0, auxAnalysis29Size) // auto
																				// trimmed
																				// to
																				// fit
																				// ,
																				// if
																				// required
																				// .
						),
				(auxAnalysis30 == null) ? null
						: ((auxAnalysis30.length() <= auxAnalysis30Size) ? auxAnalysis30
								: auxAnalysis30.substring(0, auxAnalysis30Size) // auto
																				// trimmed
																				// to
																				// fit
																				// ,
																				// if
																				// required
																				// .
						) };
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @param fields
	 *            DOCUMENT ME!
	 */
	protected void set(final Object[] fields) {

		auxTitle = rtrim((String) fields[0]);
		auxFirstname = rtrim((String) fields[1]);
		auxInvoiceAddrid = (Integer) fields[2];
		bankName = rtrim((String) fields[3]);
		bankAddr1 = rtrim((String) fields[4]);
		bankAddr2 = rtrim((String) fields[5]);
		bankAcName = rtrim((String) fields[6]);
		ref = rtrim((String) fields[7]);
		bankScode = rtrim((String) fields[8]);
		bankAcNo = rtrim((String) fields[9]);
		bankAcType = rtrim((String) fields[10]);
		bankPayType = rtrim((String) fields[11]);
		auxPrefDebitDay = (Short) fields[12];
		billAcNo = rtrim((String) fields[13]);
		protectCode = rtrim((String) fields[14]);
		handsetCt = (Integer) fields[15];
		bankDate = (Date) fields[16];
		confDate = (Date) fields[17];
		auxComment = rtrim((String) fields[18]);
		dateOfBirth = (Date) fields[19];
		refPayDate = (Date) fields[20];
		acClosDate = (Date) fields[21];
		noReasDate = (Date) fields[22];
		remLetDate = (Date) fields[23];
		acTranDate = (Date) fields[24];
		noAcDate = (Date) fields[25];
		srFlag = rtrim((String) fields[26]);
		processed = rtrim((String) fields[27]);
		packageCode = rtrim((String) fields[28]);
		auxAccountType = rtrim((String) fields[29]);
		auxBillCycle = rtrim((String) fields[30]);
		creditCardNo = rtrim((String) fields[31]);
		creditCardName = rtrim((String) fields[32]);
		expiryDate = (Date) fields[33];
		auxCardCvvNo = rtrim((String) fields[34]);
		creditScore = (Integer) fields[35];
		servProvId = (Integer) fields[36];
		dealerId = rtrim((String) fields[37]);
		salesman = rtrim((String) fields[38]);
		idNumber = rtrim((String) fields[39]);
		accStatus = rtrim((String) fields[40]);
		compRegNo = rtrim((String) fields[41]);
		stationaryType = rtrim((String) fields[42]);
		maxNoSubs = (Integer) fields[43];
		auxCurrency = rtrim((String) fields[44]);
		auxCountryCode = rtrim((String) fields[45]);
		auxGender = rtrim((String) fields[46]);
		auxSubGrpAccNo = rtrim((String) fields[47]);
		auxPrepaidStat = rtrim((String) fields[48]);
		auxCreditClass = rtrim((String) fields[49]);
		auxAutoLimitInd = rtrim((String) fields[50]);
		auxLmtUpVal = (Short) fields[51];
		auxLmtDnVal = (Short) fields[52];
		auxAnalysis1 = rtrim((String) fields[53]);
		auxAnalysis2 = rtrim((String) fields[54]);
		auxAnalysis3 = rtrim((String) fields[55]);
		auxAnalysis4 = rtrim((String) fields[56]);
		auxAnalysis5 = rtrim((String) fields[57]);
		auxAnalysis6 = rtrim((String) fields[58]);
		auxAnalysis7 = rtrim((String) fields[59]);
		auxAnalysis8 = rtrim((String) fields[60]);
		auxAnalysis9 = rtrim((String) fields[61]);
		auxAnalysis10 = rtrim((String) fields[62]);
		auxAnalysis11 = rtrim((String) fields[63]);
		auxAnalysis12 = rtrim((String) fields[64]);
		auxAnalysis13 = rtrim((String) fields[65]);
		auxAnalysis14 = rtrim((String) fields[66]);
		auxAnalysis15 = rtrim((String) fields[67]);
		auxAnalysis16 = rtrim((String) fields[68]);
		auxAnalysis17 = rtrim((String) fields[69]);
		auxAnalysis18 = rtrim((String) fields[70]);
		auxAnalysis19 = rtrim((String) fields[71]);
		auxAnalysis20 = rtrim((String) fields[72]);
		auxAnalysis21 = rtrim((String) fields[73]);
		auxAnalysis22 = rtrim((String) fields[74]);
		auxAnalysis23 = rtrim((String) fields[75]);
		auxAnalysis24 = rtrim((String) fields[76]);
		auxAnalysis25 = rtrim((String) fields[77]);
		auxAnalysis26 = rtrim((String) fields[78]);
		auxAnalysis27 = rtrim((String) fields[79]);
		auxAnalysis28 = rtrim((String) fields[80]);
		auxAnalysis29 = rtrim((String) fields[81]);
		auxAnalysis30 = rtrim((String) fields[82]);
	}

	// Get methods
	// ///////////////////////////////////////////////////////////////
	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public String getAuxTitle() {
		return auxTitle;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public String getAuxFirstname() {
		return auxFirstname;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public Integer getAuxInvoiceAddrid() {
		return auxInvoiceAddrid;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public String getBankName() {
		return bankName;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public String getBankAddr1() {
		return bankAddr1;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public String getBankAddr2() {
		return bankAddr2;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public String getBankAcName() {
		return bankAcName;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public String getRef() {
		return ref;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public String getBankScode() {
		return bankScode;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public String getBankAcNo() {
		return bankAcNo;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public String getBankAcType() {
		return bankAcType;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public String getBankPayType() {
		return bankPayType;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public Short getAuxPrefDebitDay() {
		return auxPrefDebitDay;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public String getBillAcNo() {
		return billAcNo;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public String getProtectCode() {
		return protectCode;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public Integer getHandsetCt() {
		return handsetCt;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public Date getBankDate() {
		return (bankDate != null) ? new Date(bankDate) : null;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public Date getConfDate() {
		return (confDate != null) ? new Date(confDate) : null;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public String getAuxComment() {
		return auxComment;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public Date getDateOfBirth() {
		return (dateOfBirth != null) ? new Date(dateOfBirth) : null;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public Date getRefPayDate() {
		return (refPayDate != null) ? new Date(refPayDate) : null;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public Date getAcClosDate() {
		return (acClosDate != null) ? new Date(acClosDate) : null;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public Date getNoReasDate() {
		return (noReasDate != null) ? new Date(noReasDate) : null;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public Date getRemLetDate() {
		return (remLetDate != null) ? new Date(remLetDate) : null;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public Date getAcTranDate() {
		return (acTranDate != null) ? new Date(acTranDate) : null;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public Date getNoAcDate() {
		return (noAcDate != null) ? new Date(noAcDate) : null;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public String getSrFlag() {
		return srFlag;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public String getProcessed() {
		return processed;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public String getPackageCode() {
		return packageCode;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public String getAuxAccountType() {
		return auxAccountType;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public String getAuxBillCycle() {
		return auxBillCycle;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public String getCreditCardNo() {
		return creditCardNo;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public String getCreditCardName() {
		return creditCardName;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public Date getExpiryDate() {
		return (expiryDate != null) ? new Date(expiryDate) : null;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public String getAuxCardCvvNo() {
		return auxCardCvvNo;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public Integer getCreditScore() {
		return creditScore;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public Integer getServProvId() {
		return servProvId;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public String getDealerId() {
		return dealerId;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public String getSalesman() {
		return salesman;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public String getIdNumber() {
		return idNumber;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public String getAccStatus() {
		return accStatus;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public String getCompRegNo() {
		return compRegNo;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public String getStationaryType() {
		return stationaryType;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public Integer getMaxNoSubs() {
		return maxNoSubs;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public String getAuxCurrency() {
		return auxCurrency;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public String getAuxCountryCode() {
		return auxCountryCode;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public String getAuxGender() {
		return auxGender;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public String getAuxSubGrpAccNo() {
		return auxSubGrpAccNo;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public String getAuxPrepaidStat() {
		return auxPrepaidStat;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public String getAuxCreditClass() {
		return auxCreditClass;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public String getAuxAutoLimitInd() {
		return auxAutoLimitInd;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public Short getAuxLmtUpVal() {
		return auxLmtUpVal;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public Short getAuxLmtDnVal() {
		return auxLmtDnVal;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public String getAuxAnalysis1() {
		return auxAnalysis1;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public String getAuxAnalysis2() {
		return auxAnalysis2;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public String getAuxAnalysis3() {
		return auxAnalysis3;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public String getAuxAnalysis4() {
		return auxAnalysis4;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public String getAuxAnalysis5() {
		return auxAnalysis5;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public String getAuxAnalysis6() {
		return auxAnalysis6;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public String getAuxAnalysis7() {
		return auxAnalysis7;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public String getAuxAnalysis8() {
		return auxAnalysis8;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public String getAuxAnalysis9() {
		return auxAnalysis9;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public String getAuxAnalysis10() {
		return auxAnalysis10;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public String getAuxAnalysis11() {
		return auxAnalysis11;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public String getAuxAnalysis12() {
		return auxAnalysis12;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public String getAuxAnalysis13() {
		return auxAnalysis13;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public String getAuxAnalysis14() {
		return auxAnalysis14;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public String getAuxAnalysis15() {
		return auxAnalysis15;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public String getAuxAnalysis16() {
		return auxAnalysis16;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public String getAuxAnalysis17() {
		return auxAnalysis17;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public String getAuxAnalysis18() {
		return auxAnalysis18;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public String getAuxAnalysis19() {
		return auxAnalysis19;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public String getAuxAnalysis20() {
		return auxAnalysis20;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public String getAuxAnalysis21() {
		return auxAnalysis21;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public String getAuxAnalysis22() {
		return auxAnalysis22;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public String getAuxAnalysis23() {
		return auxAnalysis23;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public String getAuxAnalysis24() {
		return auxAnalysis24;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public String getAuxAnalysis25() {
		return auxAnalysis25;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public String getAuxAnalysis26() {
		return auxAnalysis26;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public String getAuxAnalysis27() {
		return auxAnalysis27;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public String getAuxAnalysis28() {
		return auxAnalysis28;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public String getAuxAnalysis29() {
		return auxAnalysis29;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 */
	public String getAuxAnalysis30() {
		return auxAnalysis30;
	}

	// Setter methods
	// ///////////////////////////////////////////////////////////////

	//
	// Master setter follows...
	//

	/**
	 * Setter that takes all attributes
	 */
	public void set(final String auxTitle, final String auxFirstname,
			final Integer auxInvoiceAddrid, final String bankName,
			final String bankAddr1, final String bankAddr2,
			final String bankAcName, final String ref, final String bankScode,
			final String bankAcNo, final String bankAcType,
			final String bankPayType, final Short auxPrefDebitDay,
			final String billAcNo, final String protectCode,
			final Integer handsetCt, final Date bankDate, final Date confDate,
			final String auxComment, final Date dateOfBirth,
			final Date refPayDate, final Date acClosDate,
			final Date noReasDate, final Date remLetDate,
			final Date acTranDate, final Date noAcDate, final String srFlag,
			final String processed, final String packageCode,
			final String auxAccountType, final String auxBillCycle,
			final String creditCardNo, final String creditCardName,
			final Date expiryDate, final String auxCardCvvNo,
			final Integer creditScore, final Integer servProvId,
			final String dealerId, final String salesman,
			final String idNumber, final String accStatus,
			final String compRegNo, final String stationaryType,
			final Integer maxNoSubs, final String auxCurrency,
			final String auxCountryCode, final String auxGender,
			final String auxSubGrpAccNo, final String auxPrepaidStat,
			final String auxCreditClass, final String auxAutoLimitInd,
			final Short auxLmtUpVal, final Short auxLmtDnVal,
			final String auxAnalysis1, final String auxAnalysis2,
			final String auxAnalysis3, final String auxAnalysis4,
			final String auxAnalysis5, final String auxAnalysis6,
			final String auxAnalysis7, final String auxAnalysis8,
			final String auxAnalysis9, final String auxAnalysis10,
			final String auxAnalysis11, final String auxAnalysis12,
			final String auxAnalysis13, final String auxAnalysis14,
			final String auxAnalysis15, final String auxAnalysis16,
			final String auxAnalysis17, final String auxAnalysis18,
			final String auxAnalysis19, final String auxAnalysis20,
			final String auxAnalysis21, final String auxAnalysis22,
			final String auxAnalysis23, final String auxAnalysis24,
			final String auxAnalysis25, final String auxAnalysis26,
			final String auxAnalysis27, final String auxAnalysis28,
			final String auxAnalysis29, final String auxAnalysis30) {

		this.auxTitle = auxTitle;
		this.auxFirstname = auxFirstname;
		this.auxInvoiceAddrid = auxInvoiceAddrid;
		this.bankName = bankName;
		this.bankAddr1 = bankAddr1;
		this.bankAddr2 = bankAddr2;
		this.bankAcName = bankAcName;
		this.ref = ref;
		this.bankScode = bankScode;
		this.bankAcNo = bankAcNo;
		this.bankAcType = bankAcType;
		this.bankPayType = bankPayType;
		this.auxPrefDebitDay = auxPrefDebitDay;
		this.billAcNo = billAcNo;
		this.protectCode = protectCode;
		this.handsetCt = handsetCt;
		this.bankDate = (bankDate != null) ? new Date(bankDate) : null;
		this.confDate = (confDate != null) ? new Date(confDate) : null;
		this.auxComment = auxComment;
		this.dateOfBirth = (dateOfBirth != null) ? new Date(dateOfBirth) : null;
		this.refPayDate = (refPayDate != null) ? new Date(refPayDate) : null;
		this.acClosDate = (acClosDate != null) ? new Date(acClosDate) : null;
		this.noReasDate = (noReasDate != null) ? new Date(noReasDate) : null;
		this.remLetDate = (remLetDate != null) ? new Date(remLetDate) : null;
		this.acTranDate = (acTranDate != null) ? new Date(acTranDate) : null;
		this.noAcDate = (noAcDate != null) ? new Date(noAcDate) : null;
		this.srFlag = srFlag;
		this.processed = processed;
		this.packageCode = packageCode;
		this.auxAccountType = auxAccountType;
		this.auxBillCycle = auxBillCycle;
		this.creditCardNo = creditCardNo;
		this.creditCardName = creditCardName;
		this.expiryDate = (expiryDate != null) ? new Date(expiryDate) : null;
		this.auxCardCvvNo = auxCardCvvNo;
		this.creditScore = creditScore;
		this.servProvId = servProvId;
		this.dealerId = dealerId;
		this.salesman = salesman;
		this.idNumber = idNumber;
		this.accStatus = accStatus;
		this.compRegNo = compRegNo;
		this.stationaryType = stationaryType;
		this.maxNoSubs = maxNoSubs;
		this.auxCurrency = auxCurrency;
		this.auxCountryCode = auxCountryCode;
		this.auxGender = auxGender;
		this.auxSubGrpAccNo = auxSubGrpAccNo;
		this.auxPrepaidStat = auxPrepaidStat;
		this.auxCreditClass = auxCreditClass;
		this.auxAutoLimitInd = auxAutoLimitInd;
		this.auxLmtUpVal = auxLmtUpVal;
		this.auxLmtDnVal = auxLmtDnVal;
		this.auxAnalysis1 = auxAnalysis1;
		this.auxAnalysis2 = auxAnalysis2;
		this.auxAnalysis3 = auxAnalysis3;
		this.auxAnalysis4 = auxAnalysis4;
		this.auxAnalysis5 = auxAnalysis5;
		this.auxAnalysis6 = auxAnalysis6;
		this.auxAnalysis7 = auxAnalysis7;
		this.auxAnalysis8 = auxAnalysis8;
		this.auxAnalysis9 = auxAnalysis9;
		this.auxAnalysis10 = auxAnalysis10;
		this.auxAnalysis11 = auxAnalysis11;
		this.auxAnalysis12 = auxAnalysis12;
		this.auxAnalysis13 = auxAnalysis13;
		this.auxAnalysis14 = auxAnalysis14;
		this.auxAnalysis15 = auxAnalysis15;
		this.auxAnalysis16 = auxAnalysis16;
		this.auxAnalysis17 = auxAnalysis17;
		this.auxAnalysis18 = auxAnalysis18;
		this.auxAnalysis19 = auxAnalysis19;
		this.auxAnalysis20 = auxAnalysis20;
		this.auxAnalysis21 = auxAnalysis21;
		this.auxAnalysis22 = auxAnalysis22;
		this.auxAnalysis23 = auxAnalysis23;
		this.auxAnalysis24 = auxAnalysis24;
		this.auxAnalysis25 = auxAnalysis25;
		this.auxAnalysis26 = auxAnalysis26;
		this.auxAnalysis27 = auxAnalysis27;
		this.auxAnalysis28 = auxAnalysis28;
		this.auxAnalysis29 = auxAnalysis29;
		this.auxAnalysis30 = auxAnalysis30;
	}

	//
	// Public access modifiers if any
	// (provided for attributes that are public in the analysis model)
	//    

	/**
	 * Sets the AuxTitle field.
	 * 
	 * @param auxTitle
	 */
	public void setAuxTitle(final String auxTitle) {
		this.auxTitle = getPadded(auxTitle, auxTitleFilter);
	}

	/**
	 * Sets the AuxFirstname field.
	 * 
	 * @param auxFirstname
	 */
	public void setAuxFirstname(final String auxFirstname) {
		this.auxFirstname = getPadded(auxFirstname, auxFirstnameFilter);
	}

	/**
	 * Sets the AuxInvoiceAddrid field.
	 * 
	 * @param auxInvoiceAddrid
	 */
	public void setAuxInvoiceAddrid(final Integer auxInvoiceAddrid) {
		this.auxInvoiceAddrid = auxInvoiceAddrid;
	}

	/**
	 * Sets the BankName field.
	 * 
	 * @param bankName
	 */
	public void setBankName(final String bankName) {
		this.bankName = getPadded(bankName, bankNameFilter);
	}

	/**
	 * Sets the BankAddr1 field.
	 * 
	 * @param bankAddr1
	 */
	public void setBankAddr1(final String bankAddr1) {
		this.bankAddr1 = getPadded(bankAddr1, bankAddr1Filter);
	}

	/**
	 * Sets the BankAddr2 field.
	 * 
	 * @param bankAddr2
	 */
	public void setBankAddr2(final String bankAddr2) {
		this.bankAddr2 = getPadded(bankAddr2, bankAddr2Filter);
	}

	/**
	 * Sets the BankAcName field.
	 * 
	 * @param bankAcName
	 */
	public void setBankAcName(final String bankAcName) {
		this.bankAcName = getPadded(bankAcName, bankAcNameFilter) ;
	}

	/**
	 * Sets the Ref field.
	 * 
	 * @param ref
	 */
	public void setRef(final String ref) {
		this.ref = getPadded(ref, refFilter);
	}

	/**
	 * Sets the BankScode field.
	 * 
	 * @param bankScode
	 */
	public void setBankScode(final String bankScode) {
		this.bankScode = getPadded(bankScode, bankScodeFilter);
	}

	/**
	 * Sets the BankAcNo field.
	 * 
	 * @param bankAcNo
	 */
	public void setBankAcNo(final String bankAcNo) {
		this.bankAcNo = getPadded(bankAcNo, bankAcNoFilter);
	}

	/**
	 * Sets the BankAcType field.
	 * 
	 * @param bankAcType
	 */
	public void setBankAcType(final String bankAcType) {
		this.bankAcType = getPadded(bankAcType, bankAcTypeFilter);
	}

	/**
	 * Sets the BankPayType field.
	 * 
	 * @param bankPayType
	 */
	public void setBankPayType(final String bankPayType) {
		this.bankPayType = getPadded(bankPayType, bankPayTypeFilter);
	}

	/**
	 * Sets the AuxPrefDebitDay field.
	 * 
	 * @param auxPrefDebitDay
	 */
	public void setAuxPrefDebitDay(final Short auxPrefDebitDay) {
		this.auxPrefDebitDay = auxPrefDebitDay;
	}

	/**
	 * Sets the AuxPrefDebitDay field.
	 * 
	 * @param auxPrefDebitDay
	 */
	public void setAuxPrefDebitDay(final int auxPrefDebitDay) {
		this.auxPrefDebitDay = Short.valueOf(String.valueOf(auxPrefDebitDay));
	}

	/**
	 * Sets the BillAcNo field.
	 * 
	 * @param billAcNo
	 */
	public void setBillAcNo(final String billAcNo) {
		this.billAcNo = getPadded(billAcNo, billAcNoFilter);
	}

	/**
	 * Sets the ProtectCode field.
	 * 
	 * @param protectCode
	 */
	public void setProtectCode(final String protectCode) {
		this.protectCode = getPadded(protectCode, protectCodeFilter);
	}

	/**
	 * Sets the HandsetCt field.
	 * 
	 * @param handsetCt
	 */
	public void setHandsetCt(final Integer handsetCt) {
		this.handsetCt = handsetCt;
	}

	/**
	 * Sets the BankDate field.
	 * 
	 * @param bankDate
	 */
	public void setBankDate(final Date bankDate) {
		this.bankDate = (bankDate != null) ? new Date(bankDate) : null;
	}

	/**
	 * Sets the ConfDate field.
	 * 
	 * @param confDate
	 */
	public void setConfDate(final Date confDate) {
		this.confDate = (confDate != null) ? new Date(confDate) : null;
	}

	/**
	 * Sets the AuxComment field.
	 * 
	 * @param auxComment
	 */
	public void setAuxComment(final String auxComment) {
		this.auxComment = getPadded(auxComment, auxCommentFilter);
	}

	/**
	 * Sets the DateOfBirth field.
	 * 
	 * @param dateOfBirth
	 */
	public void setDateOfBirth(final Date dateOfBirth) {
		this.dateOfBirth = (dateOfBirth != null) ? new Date(dateOfBirth) : null;
	}

	/**
	 * Sets the RefPayDate field.
	 * 
	 * @param refPayDate
	 */
	public void setRefPayDate(final Date refPayDate) {
		this.refPayDate = (refPayDate != null) ? new Date(refPayDate) : null;
	}

	/**
	 * Sets the AcClosDate field.
	 * 
	 * @param acClosDate
	 */
	public void setAcClosDate(final Date acClosDate) {
		this.acClosDate = (acClosDate != null) ? new Date(acClosDate) : null;
	}

	/**
	 * Sets the NoReasDate field.
	 * 
	 * @param noReasDate
	 */
	public void setNoReasDate(final Date noReasDate) {
		this.noReasDate = (noReasDate != null) ? new Date(noReasDate) : null;
	}

	/**
	 * Sets the RemLetDate field.
	 * 
	 * @param remLetDate
	 */
	public void setRemLetDate(final Date remLetDate) {
		this.remLetDate = (remLetDate != null) ? new Date(remLetDate) : null;
	}

	/**
	 * Sets the AcTranDate field.
	 * 
	 * @param acTranDate
	 */
	public void setAcTranDate(final Date acTranDate) {
		this.acTranDate = (acTranDate != null) ? new Date(acTranDate) : null;
	}

	/**
	 * Sets the NoAcDate field.
	 * 
	 * @param noAcDate
	 */
	public void setNoAcDate(final Date noAcDate) {
		this.noAcDate = (noAcDate != null) ? new Date(noAcDate) : null;
	}

	/**
	 * Sets the SrFlag field.
	 * 
	 * @param srFlag
	 */
	public void setSrFlag(final String srFlag) {
		this.srFlag = getPadded(srFlag, srFlagFilter);
	}

	/**
	 * Sets the Processed field.
	 * 
	 * @param processed
	 */
	public void setProcessed(final String processed) {
		this.processed = getPadded(processed, processedFilter);
	}

	/**
	 * Sets the PackageCode field.
	 * 
	 * @param packageCode
	 */
	public void setPackageCode(final String packageCode) {
		this.packageCode = getPadded(packageCode, packageCodeFilter);
	}

	/**
	 * Sets the AuxAccountType field.
	 * 
	 * @param auxAccountType
	 */
	public void setAuxAccountType(final String auxAccountType) {
		this.auxAccountType = getPadded(auxAccountType, auxAccountTypeFilter);
	}

	/**
	 * Sets the AuxBillCycle field.
	 * 
	 * @param auxBillCycle
	 */
	public void setAuxBillCycle(final String auxBillCycle) {
		this.auxBillCycle = getPadded(auxBillCycle, auxBillCycleFilter);
	}

	/**
	 * Sets the CreditCardNo field.
	 * 
	 * @param creditCardNo
	 */
	public void setCreditCardNo(final String creditCardNo) {
		this.creditCardNo = getPadded(creditCardNo, creditCardNoFilter);
	}

	/**
	 * Sets the CreditCardName field.
	 * 
	 * @param creditCardName
	 */
	public void setCreditCardName(final String creditCardName) {
		this.creditCardName = getPadded(creditCardName, creditCardNameFilter);
	}

	/**
	 * Sets the ExpiryDate field.
	 * 
	 * @param expiryDate
	 */
	public void setExpiryDate(final Date expiryDate) {
		this.expiryDate = (expiryDate != null) ? new Date(expiryDate) : null;
	}

	/**
	 * Sets the AuxCardCvvNo field.
	 * 
	 * @param auxCardCvvNo
	 */
	public void setAuxCardCvvNo(final String auxCardCvvNo) {
		this.auxCardCvvNo = getPadded(auxCardCvvNo, auxCardCvvNoFilter);
	}

	/**
	 * Sets the CreditScore field.
	 * 
	 * @param creditScore
	 */
	public void setCreditScore(final Integer creditScore) {
		this.creditScore = creditScore;
	}

	/**
	 * Sets the ServProvId field.
	 * 
	 * @param servProvId
	 */
	public void setServProvId(final Integer servProvId) {
		this.servProvId = servProvId;
	}

	/**
	 * Sets the DealerId field.
	 * 
	 * @param dealerId
	 */
	public void setDealerId(final String dealerId) {
		this.dealerId = getPadded(dealerId, dealerIdFilter);
	}

	/**
	 * Sets the Salesman field.
	 * 
	 * @param salesman
	 */
	public void setSalesman(final String salesman) {
		this.salesman = getPadded(salesman, salesmanFilter);
	}

	/**
	 * Sets the IdNumber field.
	 * 
	 * @param idNumber
	 */
	public void setIdNumber(final String idNumber) {
		this.idNumber = getPadded(idNumber, idNumberFilter);
	}

	/**
	 * Sets the AccStatus field.
	 * 
	 * @param accStatus
	 */
	public void setAccStatus(final String accStatus) {
		this.accStatus = getPadded(accStatus, accStatusFilter);
	}

	/**
	 * Sets the CompRegNo field.
	 * 
	 * @param compRegNo
	 */
	public void setCompRegNo(final String compRegNo) {
		this.compRegNo = getPadded(compRegNo, compRegNoFilter);
	}

	/**
	 * Sets the StationaryType field.
	 * 
	 * @param stationaryType
	 */
	public void setStationaryType(final String stationaryType) {
		this.stationaryType = getPadded(stationaryType, stationaryTypeFilter);
	}

	/**
	 * Sets the MaxNoSubs field.
	 * 
	 * @param maxNoSubs
	 */
	public void setMaxNoSubs(final Integer maxNoSubs) {
		this.maxNoSubs = maxNoSubs;
	}

	/**
	 * Sets the AuxCurrency field.
	 * 
	 * @param auxCurrency
	 */
	public void setAuxCurrency(final String auxCurrency) {
		this.auxCurrency = getPadded(auxCurrency, auxCurrencyFilter);
	}

	/**
	 * Sets the AuxCountryCode field.
	 * 
	 * @param auxCountryCode
	 */
	public void setAuxCountryCode(final String auxCountryCode) {
		this.auxCountryCode = getPadded(auxCountryCode, auxCountryCodeFilter);
	}

	/**
	 * Sets the AuxGender field.
	 * 
	 * @param auxGender
	 */
	public void setAuxGender(final String auxGender) {
		this.auxGender = getPadded(auxGender, auxGenderFilter);
	}

	/**
	 * Sets the AuxSubGrpAccNo field.
	 * 
	 * @param auxSubGrpAccNo
	 */
	public void setAuxSubGrpAccNo(final String auxSubGrpAccNo) {
		this.auxSubGrpAccNo = getPadded(auxSubGrpAccNo, auxSubGrpAccNoFilter);
	}

	/**
	 * Sets the AuxPrepaidStat field.
	 * 
	 * @param auxPrepaidStat
	 */
	public void setAuxPrepaidStat(final String auxPrepaidStat) {
		this.auxPrepaidStat = getPadded(auxPrepaidStat, auxPrepaidStatFilter);
	}

	/**
	 * Sets the AuxCreditClass field.
	 * 
	 * @param auxCreditClass
	 */
	public void setAuxCreditClass(final String auxCreditClass) {
		this.auxCreditClass = getPadded(auxCreditClass, auxCreditClassFilter);
	}

	/**
	 * Sets the AuxAutoLimitInd field.
	 * 
	 * @param auxAutoLimitInd
	 */
	public void setAuxAutoLimitInd(final String auxAutoLimitInd) {
		this.auxAutoLimitInd = getPadded(auxAutoLimitInd, auxAutoLimitIndFilter);
	}

	/**
	 * Sets the AuxLmtUpVal field.
	 * 
	 * @param auxLmtUpVal
	 */
	public void setAuxLmtUpVal(final Short auxLmtUpVal) {
		this.auxLmtUpVal = auxLmtUpVal;
	}

	/**
	 * Sets the AuxLmtUpVal field.
	 * 
	 * @param auxLmtUpVal
	 */
	public void setAuxLmtUpVal(final int auxLmtUpVal) {
		this.auxLmtUpVal = Short.valueOf(String.valueOf(auxLmtUpVal));
	}

	/**
	 * Sets the AuxLmtDnVal field.
	 * 
	 * @param auxLmtDnVal
	 */
	public void setAuxLmtDnVal(final Short auxLmtDnVal) {
		this.auxLmtDnVal = auxLmtDnVal;
	}

	/**
	 * Sets the AuxLmtDnVal field.
	 * 
	 * @param auxLmtDnVal
	 */
	public void setAuxLmtDnVal(final int auxLmtDnVal) {
		this.auxLmtDnVal = Short.valueOf(String.valueOf(auxLmtDnVal));
	}

	/**
	 * Sets the AuxAnalysis1 field.
	 * 
	 * @param auxAnalysis1
	 */
	public void setAuxAnalysis1(final String auxAnalysis1) {
		this.auxAnalysis1 = getPadded(auxAnalysis1, auxAnalysis10Filter);
	}

	/**
	 * Sets the AuxAnalysis2 field.
	 * 
	 * @param auxAnalysis2
	 */
	public void setAuxAnalysis2(final String auxAnalysis2) {
		this.auxAnalysis2 = auxAnalysis2;
	}

	/**
	 * Sets the AuxAnalysis3 field.
	 * 
	 * @param auxAnalysis3
	 */
	public void setAuxAnalysis3(final String auxAnalysis3) {
		this.auxAnalysis3 = getPadded(auxAnalysis3, auxAnalysis30Filter);
	}

	/**
	 * Sets the AuxAnalysis4 field.
	 * 
	 * @param auxAnalysis4
	 */
	public void setAuxAnalysis4(final String auxAnalysis4) {
		this.auxAnalysis4 = getPadded(auxAnalysis4, auxAnalysis4Filter);
	}

	/**
	 * Sets the AuxAnalysis5 field.
	 * 
	 * @param auxAnalysis5
	 */
	public void setAuxAnalysis5(final String auxAnalysis5) {
		this.auxAnalysis5 = getPadded(auxAnalysis5, auxAnalysis5Filter );
	}

	/**
	 * Sets the AuxAnalysis6 field.
	 * 
	 * @param auxAnalysis6
	 */
	public void setAuxAnalysis6(final String auxAnalysis6) {
		this.auxAnalysis6 = getPadded(auxAnalysis6, auxAnalysis6Filter );
	}

	/**
	 * Sets the AuxAnalysis7 field.
	 * 
	 * @param auxAnalysis7
	 */
	public void setAuxAnalysis7(final String auxAnalysis7) {
		this.auxAnalysis7 = getPadded(auxAnalysis7, auxAnalysis7Filter);
	}

	/**
	 * Sets the AuxAnalysis8 field.
	 * 
	 * @param auxAnalysis8
	 */
	public void setAuxAnalysis8(final String auxAnalysis8) {
		this.auxAnalysis8 = getPadded(auxAnalysis8, auxAnalysis8Filter);
	}

	/**
	 * Sets the AuxAnalysis9 field.
	 * 
	 * @param auxAnalysis9
	 */
	public void setAuxAnalysis9(final String auxAnalysis9) {
		this.auxAnalysis9 = getPadded(auxAnalysis9, auxAnalysis9Filter);
	}

	/**
	 * Sets the AuxAnalysis10 field.
	 * 
	 * @param auxAnalysis10
	 */
	public void setAuxAnalysis10(final String auxAnalysis10) {
		this.auxAnalysis10 = getPadded(auxAnalysis10, auxAnalysis10Filter);
	}

	/**
	 * Sets the AuxAnalysis11 field.
	 * 
	 * @param auxAnalysis11
	 */
	public void setAuxAnalysis11(final String auxAnalysis11) {
		this.auxAnalysis11 = getPadded(auxAnalysis11, auxAnalysis11Filter);
	}

	/**
	 * Sets the AuxAnalysis12 field.
	 * 
	 * @param auxAnalysis12
	 */
	public void setAuxAnalysis12(final String auxAnalysis12) {
		this.auxAnalysis12 = getPadded(auxAnalysis12, auxAnalysis12Filter);
	}

	/**
	 * Sets the AuxAnalysis13 field.
	 * 
	 * @param auxAnalysis13
	 */
	public void setAuxAnalysis13(final String auxAnalysis13) {
		this.auxAnalysis13 = getPadded(auxAnalysis13, auxAnalysis13Filter);
	}

	/**
	 * Sets the AuxAnalysis14 field.
	 * 
	 * @param auxAnalysis14
	 */
	public void setAuxAnalysis14(final String auxAnalysis14) {
		this.auxAnalysis14 = getPadded(auxAnalysis14, auxAnalysis14Filter);
	}

	/**
	 * Sets the AuxAnalysis15 field.
	 * 
	 * @param auxAnalysis15
	 */
	public void setAuxAnalysis15(final String auxAnalysis15) {
		this.auxAnalysis15 = getPadded(auxAnalysis15, auxAnalysis15Filter);
	}

	/**
	 * Sets the AuxAnalysis16 field.
	 * 
	 * @param auxAnalysis16
	 */
	public void setAuxAnalysis16(final String auxAnalysis16) {
		this.auxAnalysis16 = getPadded(auxAnalysis16, auxAnalysis16Filter);
	}

	/**
	 * Sets the AuxAnalysis17 field.
	 * 
	 * @param auxAnalysis17
	 */
	public void setAuxAnalysis17(final String auxAnalysis17) {
		this.auxAnalysis17 = getPadded(auxAnalysis17, auxAnalysis17Filter);
	}

	/**
	 * Sets the AuxAnalysis18 field.
	 * 
	 * @param auxAnalysis18
	 */
	public void setAuxAnalysis18(final String auxAnalysis18) {
		this.auxAnalysis18 = getPadded(auxAnalysis18, auxAnalysis18Filter);
	}

	/**
	 * Sets the AuxAnalysis19 field.
	 * 
	 * @param auxAnalysis19
	 */
	public void setAuxAnalysis19(final String auxAnalysis19) {
		this.auxAnalysis19 = getPadded(auxAnalysis19, auxAnalysis19Filter);
	}

	/**
	 * Sets the AuxAnalysis20 field.
	 * 
	 * @param auxAnalysis20
	 */
	public void setAuxAnalysis20(final String auxAnalysis20) {
		this.auxAnalysis20 = getPadded(auxAnalysis20, auxAnalysis20Filter);
	}

	/**
	 * Sets the AuxAnalysis21 field.
	 * 
	 * @param auxAnalysis21
	 */
	public void setAuxAnalysis21(final String auxAnalysis21) {
		this.auxAnalysis21 = getPadded(auxAnalysis21, auxAnalysis21Filter);
	}

	/**
	 * Sets the AuxAnalysis22 field.
	 * 
	 * @param auxAnalysis22
	 */
	public void setAuxAnalysis22(final String auxAnalysis22) {
		this.auxAnalysis22 = getPadded(auxAnalysis22, auxAnalysis22Filter);
	}

	/**
	 * Sets the AuxAnalysis23 field.
	 * 
	 * @param auxAnalysis23
	 */
	public void setAuxAnalysis23(final String auxAnalysis23) {
		this.auxAnalysis23 = getPadded(auxAnalysis23, auxAnalysis23Filter);
	}

	/**
	 * Sets the AuxAnalysis24 field.
	 * 
	 * @param auxAnalysis24
	 */
	public void setAuxAnalysis24(final String auxAnalysis24) {
		this.auxAnalysis24 = getPadded(auxAnalysis24, auxAnalysis24Filter);
	}

	/**
	 * Sets the AuxAnalysis25 field.
	 * 
	 * @param auxAnalysis25
	 */
	public void setAuxAnalysis25(final String auxAnalysis25) {
		this.auxAnalysis25 = getPadded(auxAnalysis25, auxAnalysis25Filter);
	}

	/**
	 * Sets the AuxAnalysis26 field.
	 * 
	 * @param auxAnalysis26
	 */
	public void setAuxAnalysis26(final String auxAnalysis26) {

		this.auxAnalysis26 = getPadded(auxAnalysis26, auxAnalysis26Filter);
	}

	/**
	 * Sets the AuxAnalysis27 field.
	 * 
	 * @param auxAnalysis27
	 */
	public void setAuxAnalysis27(final String auxAnalysis27) {
		this.auxAnalysis27 = getPadded(auxAnalysis27, auxAnalysis27Filter);
	}

	/**
	 * Sets the AuxAnalysis28 field.
	 * 
	 * @param auxAnalysis28
	 */
	public void setAuxAnalysis28(final String auxAnalysis28) {
		this.auxAnalysis28 = getPadded(auxAnalysis28, auxAnalysis28Filter);
	}

	/**
	 * Sets the AuxAnalysis29 field.
	 * 
	 * @param auxAnalysis29
	 */
	public void setAuxAnalysis29(final String auxAnalysis29) {
		this.auxAnalysis29 = getPadded(auxAnalysis29, auxAnalysis29Filter);
	}

	/**
	 * Sets the AuxAnalysis30 field.
	 * 
	 * @param auxAnalysis30
	 */
	public void setAuxAnalysis30(final String auxAnalysis30) {
		this.auxAnalysis30 = getPadded(auxAnalysis30, auxAnalysis30Filter);
	}

	@Override
	public String toString() {
		return "\nAuxCustomersDMO [\nacClosDate=" + acClosDate + "\nacTranDate=" + acTranDate
				+ "\nbankDate=" + bankDate + "\nconfDate=" + confDate
				+ "\ndateOfBirth=" + dateOfBirth + "\nexpiryDate=" + expiryDate
				+ "\nnoAcDate=" + noAcDate + "\nnoReasDate=" + noReasDate
				+ "\nrefPayDate=" + refPayDate + "\nremLetDate=" + remLetDate
				+ "\nauxInvoiceAddrid=" + auxInvoiceAddrid + "\ncreditScore="
				+ creditScore + "\nhandsetCt=" + handsetCt + "\nmaxNoSubs="
				+ maxNoSubs + "\nservProvId=" + servProvId + "\nauxLmtDnVal="
				+ auxLmtDnVal + "\nauxLmtUpVal=" + auxLmtUpVal
				+ "\nauxPrefDebitDay=" + auxPrefDebitDay + "\naccStatus="
				+ accStatus + "\nauxAccountType=" + auxAccountType
				+ "\nauxAnalysis1=" + auxAnalysis1 + "\nauxAnalysis10="
				+ auxAnalysis10 + "\nauxAnalysis11=" + auxAnalysis11
				+ "\nauxAnalysis12=" + auxAnalysis12 + "\nauxAnalysis13="
				+ auxAnalysis13 + "\nauxAnalysis14=" + auxAnalysis14
				+ "\nauxAnalysis15=" + auxAnalysis15 + "\nauxAnalysis16="
				+ auxAnalysis16 + "\nauxAnalysis17=" + auxAnalysis17
				+ "\nauxAnalysis18=" + auxAnalysis18 + "\nauxAnalysis19="
				+ auxAnalysis19 + "\nauxAnalysis2=" + auxAnalysis2
				+ "\nauxAnalysis20=" + auxAnalysis20 + "\nauxAnalysis21="
				+ auxAnalysis21 + "\nauxAnalysis22=" + auxAnalysis22
				+ "\nauxAnalysis23=" + auxAnalysis23 + "\nauxAnalysis24="
				+ auxAnalysis24 + "\nauxAnalysis25=" + auxAnalysis25
				+ "\nauxAnalysis26=" + auxAnalysis26 + "\nauxAnalysis27="
				+ auxAnalysis27 + "\nauxAnalysis28=" + auxAnalysis28
				+ "\nauxAnalysis29=" + auxAnalysis29 + "\nauxAnalysis3="
				+ auxAnalysis3 + "\nauxAnalysis30=" + auxAnalysis30
				+ "\nauxAnalysis4=" + auxAnalysis4 + "\nauxAnalysis5="
				+ auxAnalysis5 + "\nauxAnalysis6=" + auxAnalysis6
				+ "\nauxAnalysis7=" + auxAnalysis7 + "\nauxAnalysis8="
				+ auxAnalysis8 + "\nauxAnalysis9=" + auxAnalysis9
				+ "\nauxAutoLimitInd=" + auxAutoLimitInd + "\nauxBillCycle="
				+ auxBillCycle + "\nauxCardCvvNo=" + auxCardCvvNo
				+ "\nauxComment=" + auxComment + "\nauxCountryCode="
				+ auxCountryCode + "\nauxCreditClass=" + auxCreditClass
				+ "\nauxCurrency=" + auxCurrency + "\nauxFirstname="
				+ auxFirstname + "\nauxGender=" + auxGender
				+ "\nauxPrepaidStat=" + auxPrepaidStat + "\nauxSubGrpAccNo="
				+ auxSubGrpAccNo + "\nauxTitle=" + auxTitle + "\nbankAcName="
				+ bankAcName + "\nbankAcNo=" + bankAcNo + "\nbankAcType="
				+ bankAcType + "\nbankAddr1=" + bankAddr1 + "\nbankAddr2="
				+ bankAddr2 + "\nbankName=" + bankName + "\nbankPayType="
				+ bankPayType + "\nbankScode=" + bankScode + "\nbillAcNo="
				+ billAcNo + "\ncompRegNo=" + compRegNo + "\ncreditCardName="
				+ creditCardName + "\ncreditCardNo=" + creditCardNo
				+ "\ndealerId=" + dealerId + "\nidNumber=" + idNumber
				+ "\npackageCode=" + packageCode + "\nprocessed=" + processed
				+ "\nprotectCode=" + protectCode + "\nref=" + ref
				+ "\nsalesman=" + salesman + "\nsrFlag=" + srFlag
				+ "\nstationaryType=" + stationaryType + "]";
	}
  
}
