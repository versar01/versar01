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
 * A value object to carry the data for an AudAddress.
 *
 *
 * <H3> An AudAddress is: </H3>
 *
 * <!-- indent text -->
 * <TABLE BORDER="0" CELLPADDING="0" CELLSPACING="0">
 * <TR>
 * <TD WIDTH="25">&nbsp;</TD>
 * <TD>
 *
 * Used to hold all types of addresses.
 * <p>
 *   Currently holds addresses for the customer and the subscriber.
 
 The addresses held can be defined by the
 *   administrator. The types of address are defined in tt_text with a group of \"ADDRESSTYP\" and the behaviour of these
 *   addresses is defined in auc_address_config. There are several hardcoded address types. These are defined in the normal
 *   way but have a special meaning to the system.
 
 Each customer points to one of his addresses through the
 *   aux_invoice_addrid on aux_customers. For this reason care must be taken when deleting entries from this table. 
 
 See
 *   diagram \"Address Book - All Tables\" earlier in this document.
 * </p>
 *
 * <!-- end indent text -->
 * </TD>
 * </TR>
 * </TABLE>
 *
 *
 * <H3> AudAddress Value Object: </H3>
 *
 * <!-- indent text -->
 * <TABLE BORDER="0" CELLPADDING="0" CELLSPACING="0">
 * <TR>
 * <TD WIDTH="25">&nbsp;</TD>
 * <TD>
 *
 * <P>
 *     This is a value object (called a Data Model Object or 'DMO').
 *     It is used to pass the data for an audAddress into and out of the BASE module.
 *     Because it's purpose is to carry data into and out of the module it is visible outside the module.
 * </P>
 * <P>
 *     This value object carries the data for one audAddress. An audAddress is:
 * Used to hold all types of addresses.
 * </P>
 * <P>
 *     It corresponds to the business logic object AudAddress which
 *     contains all the business behaviour of an audAddress but is not visible outside the
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
 *    This value object contains fields for all the details of an audAddress, namely:
 * </P>
 *


 * <P>
 *    <U>Fields to carry the Attributes of an audAddress:</U>
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
 *   <TD ALIGN="left" VALIGN="top"><B>audAddrid</B></TD>
 *   <TD ALIGN="left" VALIGN="top">Integer</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       This is our unique internal id for an address.
 *       <p>
 *         We use it to allow a customer and a subscribers details to point to a specific entry in this table for fast retrieval
 *         by the invoicing and debit programs without having to wade through the other index and sort fields by date. Do Not
 *         confuse with aud_unique_id.
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
 *       <A HREF="#getAudAddrid()">
 *           getAudAddrid
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setAudAddrid(java.lang.Integer)">
 *           setAudAddrid (Integer)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>audAccountNo</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Unique Account number.
 *       <p>
 *         Links to main account no
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
 *       <A HREF="#getAudAccountNo()">
 *           getAudAccountNo
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setAudAccountNo(java.lang.String)">
 *           setAudAccountNo (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>audSubscriberId</B></TD>
 *   <TD ALIGN="left" VALIGN="top">Integer</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Subscriber ID
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
 *       <A HREF="#getAudSubscriberId()">
 *           getAudSubscriberId
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setAudSubscriberId(java.lang.Integer)">
 *           setAudSubscriberId (Integer)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>audAddressType</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       A list of address types is defined in tt_text_type with group "ADDRESSTYP".
 *       <p>
 *         This list can be extended as required. Certain types have a hardcoded meaning.
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
 *       <A HREF="#getAudAddressType()">
 *           getAudAddressType
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setAudAddressType(java.lang.String)">
 *           setAudAddressType (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>audInDate</B></TD>
 *   <TD ALIGN="left" VALIGN="top">Date</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       The date at which this address came into effect.
 *       <p>
 *         Normally the date at which the person moved into this address. If this is left null it sorts as the oldest date of the
 *         set.
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
 *       <A HREF="#getAudInDate()">
 *           getAudInDate
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setAudInDate(com.cmgwds.eppix.util.Date)">
 *           setAudInDate (Date)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>audInvEffDate</B></TD>
 *   <TD ALIGN="left" VALIGN="top">DateTime</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       The date on which this address became the invoice address.
 *       <p>
 *         This will allow the retrieval of an invoice address on a particular date.
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
 *       <A HREF="#getAudInvEffDate()">
 *           getAudInvEffDate
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setAudInvEffDate(com.cmgwds.eppix.util.DateTime)">
 *           setAudInvEffDate (DateTime)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>audClassification</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       This general purpose field is included to allow users to enter a classification that can be used to configure the display of the rest of the address fields.
 *       <p>
 *         
 See tt_type_text with group \"ADDCLSSALL\" for details.
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
 *       <A HREF="#getAudClassification()">
 *           getAudClassification
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setAudClassification(java.lang.String)">
 *           setAudClassification (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>audUniqueId</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       A country specific ID or Password.
 *       <p>
 *         For example in Bulgaria each building has a state registration code.
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
 *       <A HREF="#getAudUniqueId()">
 *           getAudUniqueId
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setAudUniqueId(java.lang.String)">
 *           setAudUniqueId (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>audName</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       The name as it is to appear on addresses.
 *       <p>
 *         Including title, etc.
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
 *       <A HREF="#getAudName()">
 *           getAudName
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setAudName(java.lang.String)">
 *           setAudName (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>audAddress1</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       1st line of address
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
 *       <A HREF="#getAudAddress1()">
 *           getAudAddress1
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setAudAddress1(java.lang.String)">
 *           setAudAddress1 (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>audAddress2</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       2nd line of address
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
 *       <A HREF="#getAudAddress2()">
 *           getAudAddress2
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setAudAddress2(java.lang.String)">
 *           setAudAddress2 (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>audAddress3</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       3rd line of address
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
 *       <A HREF="#getAudAddress3()">
 *           getAudAddress3
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setAudAddress3(java.lang.String)">
 *           setAudAddress3 (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>audAddress4</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       4th line of address
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
 *       <A HREF="#getAudAddress4()">
 *           getAudAddress4
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setAudAddress4(java.lang.String)">
 *           setAudAddress4 (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>audAddress5</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       5th line of address
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
 *       <A HREF="#getAudAddress5()">
 *           getAudAddress5
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setAudAddress5(java.lang.String)">
 *           setAudAddress5 (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>audAddress6</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       6th line of address
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
 *       <A HREF="#getAudAddress6()">
 *           getAudAddress6
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setAudAddress6(java.lang.String)">
 *           setAudAddress6 (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>audPostcode</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       The postal code for the address X refs?
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
 *       <A HREF="#getAudPostcode()">
 *           getAudPostcode
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setAudPostcode(java.lang.String)">
 *           setAudPostcode (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>audTelephoneNo</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Telephone number for account
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
 *       <A HREF="#getAudTelephoneNo()">
 *           getAudTelephoneNo
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setAudTelephoneNo(java.lang.String)">
 *           setAudTelephoneNo (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>audTelephoneNo2</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Alternate telephone number for account.
 *       <p>
 *         This field is named because one day it may be connected to an autodialler
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
 *       <A HREF="#getAudTelephoneNo2()">
 *           getAudTelephoneNo2
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setAudTelephoneNo2(java.lang.String)">
 *           setAudTelephoneNo2 (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>audFaxNo</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Telephone number for account
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
 *       <A HREF="#getAudFaxNo()">
 *           getAudFaxNo
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setAudFaxNo(java.lang.String)">
 *           setAudFaxNo (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>audContact</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Contact name
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
 *       <A HREF="#getAudContact()">
 *           getAudContact
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setAudContact(java.lang.String)">
 *           setAudContact (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>audEMail</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Email Address
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
 *       <A HREF="#getAudEMail()">
 *           getAudEMail
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setAudEMail(java.lang.String)">
 *           setAudEMail (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>audNotes</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
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
 *       <A HREF="#getAudNotes()">
 *           getAudNotes
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setAudNotes(java.lang.String)">
 *           setAudNotes (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>audGeneral1</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       eg grandfathers name,
expected to be a configurable dropdown in the future
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
 *       <A HREF="#getAudGeneral1()">
 *           getAudGeneral1
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setAudGeneral1(java.lang.String)">
 *           setAudGeneral1 (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>audGeneral2</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       ditto
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
 *       <A HREF="#getAudGeneral2()">
 *           getAudGeneral2
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setAudGeneral2(java.lang.String)">
 *           setAudGeneral2 (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>audGeneral3</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       ditto
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
 *       <A HREF="#getAudGeneral3()">
 *           getAudGeneral3
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setAudGeneral3(java.lang.String)">
 *           setAudGeneral3 (String)
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


 * @see AudAddress
 *
 * @author
 * @version $Revision: $
 *
 * @since $jdk$
 */
public class AudAddressDMO
  extends DBO
  implements Serializable {
  //~ Static variables/initializers //////////////////////////////////////////

  //---------------------
  // Field type declarations
  //---------------------
  /**
   * Defines the internal behaviour of the fields so the internal layers can manipulate them without
   * needing to introspect them.
   * The order of the fields in the definition must match the actual order in this DMO.
   */
  private static final int[] fieldTypes = new int[] {
      FIELD_TYPE_INTEGER /* std public attribute: audAddrid  */,
      FIELD_TYPE_STRING /* std public attribute: audAccountNo  */,
      FIELD_TYPE_INTEGER /* std public attribute: audSubscriberId  */,
      FIELD_TYPE_STRING /* std public attribute: audAddressType  */,
      FIELD_TYPE_DATEONLY /* std public attribute: audInDate  */,
      FIELD_TYPE_DATETIME /* std public attribute: audInvEffDate  */,
      FIELD_TYPE_STRING /* std public attribute: audClassification  */,
      FIELD_TYPE_STRING /* std public attribute: audUniqueId  */,
      FIELD_TYPE_STRING /* std public attribute: audName  */,
      FIELD_TYPE_STRING /* std public attribute: audAddress1  */,
      FIELD_TYPE_STRING /* std public attribute: audAddress2  */,
      FIELD_TYPE_STRING /* std public attribute: audAddress3  */,
      FIELD_TYPE_STRING /* std public attribute: audAddress4  */,
      FIELD_TYPE_STRING /* std public attribute: audAddress5  */,
      FIELD_TYPE_STRING /* std public attribute: audAddress6  */,
      FIELD_TYPE_STRING /* std public attribute: audPostcode  */,
      FIELD_TYPE_STRING /* std public attribute: audTelephoneNo  */,
      FIELD_TYPE_STRING /* std public attribute: audTelephoneNo2  */,
      FIELD_TYPE_STRING /* std public attribute: audFaxNo  */,
      FIELD_TYPE_STRING /* std public attribute: audContact  */,
      FIELD_TYPE_STRING /* std public attribute: audEMail  */,
      FIELD_TYPE_STRING /* std public attribute: audNotes  */,
      FIELD_TYPE_STRING /* std public attribute: audGeneral1  */,
      FIELD_TYPE_STRING /* std public attribute: audGeneral2  */,
      FIELD_TYPE_STRING /* std public attribute: audGeneral3  */
    };
  
  /**
  * TODO SJ Implement the array of field sizes
  *
  */
  private final int[] fieldSizes = new int[] {
		  0,
		  audAccountNoSize,
		  0,
		  audAddressTypeSize,
		  0,
		  0,
		  audClassificationSize,
		  audUniqueIdSize,
		  audNameSize,
		  audAddress1Size ,
		  audAddress2Size,
		  audAddress3Size,
		  audAddress4Size,
		  audAddress5Size,
		  audAddress6Size,
		  0,
		  audPostcodeSize,
		  audTelephoneNoSize,
		  audTelephoneNo2Size,
		  audFaxNoSize,
		  audContactSize,
		   audEMailSize,
		  audNotesSize,
		  audGeneral1Size,
		  audGeneral2Size,
		  audGeneral3Size
  };
      

  public int[] fieldSizes() {
  	return fieldSizes;
  }  

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int audAddridFilter = 0; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int audAccountNoFilter = 1; // filter index
  private static final int audAccountNoSize = 8; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int audSubscriberIdFilter = 2; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int audAddressTypeFilter = 3; // filter index
  private static final int audAddressTypeSize = 4; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int audInDateFilter = 4; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int audInvEffDateFilter = 5; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int audClassificationFilter = 6; // filter index
  private static final int audClassificationSize = 4; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int audUniqueIdFilter = 7; // filter index
  private static final int audUniqueIdSize = 20; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int audNameFilter = 8; // filter index
  private static final int audNameSize = 40; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int audAddress1Filter = 9; // filter index
  private static final int audAddress1Size = 40; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int audAddress2Filter = 10; // filter index
  private static final int audAddress2Size = 40; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int audAddress3Filter = 11; // filter index
  private static final int audAddress3Size = 40; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int audAddress4Filter = 12; // filter index
  private static final int audAddress4Size = 40; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int audAddress5Filter = 13; // filter index
  private static final int audAddress5Size = 40; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int audAddress6Filter = 14; // filter index
  private static final int audAddress6Size = 40; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int audPostcodeFilter = 15; // filter index
  private static final int audPostcodeSize = 15; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int audTelephoneNoFilter = 16; // filter index
  private static final int audTelephoneNoSize = 20; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int audTelephoneNo2Filter = 17; // filter index
  private static final int audTelephoneNo2Size = 20; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int audFaxNoFilter = 18; // filter index
  private static final int audFaxNoSize = 20; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int audContactFilter = 19; // filter index
  private static final int audContactSize = 40; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int audEMailFilter = 20; // filter index
  private static final int audEMailSize = 100; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int audNotesFilter = 21; // filter index
  private static final int audNotesSize = 100; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int audGeneral1Filter = 22; // filter index
  private static final int audGeneral1Size = 30; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int audGeneral2Filter = 23; // filter index
  private static final int audGeneral2Size = 30; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int audGeneral3Filter = 24; // filter index
  private static final int audGeneral3Size = 30; // field size

  //~ Instance variables /////////////////////////////////////////////////////

  private Date audInDate; // Loaded from Schema
  private DateTime audInvEffDate; // Loaded from Schema

  //---------------------
  // Field declarations
  //---------------------
  // all attributes
  private Integer audAddrid; // Loaded from Schema
  private Integer audSubscriberId; // Loaded from Schema
  private String audAccountNo; // Loaded from Schema
  private String audAddress1; // Loaded from Schema
  private String audAddress2; // Loaded from Schema
  private String audAddress3; // Loaded from Schema
  private String audAddress4; // Loaded from Schema
  private String audAddress5; // Loaded from Schema
  private String audAddress6; // Loaded from Schema
  private String audAddressType; // Loaded from Schema
  private String audClassification; // Loaded from Schema
  private String audContact; // Loaded from Schema
  private String audEMail; // Loaded from Schema
  private String audFaxNo; // Loaded from Schema
  private String audGeneral1; // Loaded from Schema
  private String audGeneral2; // Loaded from Schema
  private String audGeneral3; // Loaded from Schema
  private String audName; // Loaded from Schema
  private String audNotes; // Loaded from Schema
  private String audPostcode; // Loaded from Schema
  private String audTelephoneNo; // Loaded from Schema
  private String audTelephoneNo2; // Loaded from Schema
  private String audUniqueId; // Loaded from Schema

  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new AudAddressDMO object.
   */
  public AudAddressDMO(  ) {
  }

  // Constructor - taking public attributes
  /**
   * Creates a new AudAddressDMO object.
   *
   * @param audAddrid DOCUMENT ME!
   * @param audAccountNo DOCUMENT ME!
   * @param audSubscriberId DOCUMENT ME!
   * @param audAddressType DOCUMENT ME!
   * @param audInDate DOCUMENT ME!
   * @param audInvEffDate DOCUMENT ME!
   * @param audClassification DOCUMENT ME!
   * @param audUniqueId DOCUMENT ME!
   * @param audName DOCUMENT ME!
   * @param audAddress1 DOCUMENT ME!
   * @param audAddress2 DOCUMENT ME!
   * @param audAddress3 DOCUMENT ME!
   * @param audAddress4 DOCUMENT ME!
   * @param audAddress5 DOCUMENT ME!
   * @param audAddress6 DOCUMENT ME!
   * @param audPostcode DOCUMENT ME!
   * @param audTelephoneNo DOCUMENT ME!
   * @param audTelephoneNo2 DOCUMENT ME!
   * @param audFaxNo DOCUMENT ME!
   * @param audContact DOCUMENT ME!
   * @param audEMail DOCUMENT ME!
   * @param audNotes DOCUMENT ME!
   * @param audGeneral1 DOCUMENT ME!
   * @param audGeneral2 DOCUMENT ME!
   * @param audGeneral3 DOCUMENT ME!
   */
  public AudAddressDMO( 
    final Integer  audAddrid,
    final String   audAccountNo,
    final Integer  audSubscriberId,
    final String   audAddressType,
    final Date     audInDate,
    final DateTime audInvEffDate,
    final String   audClassification,
    final String   audUniqueId,
    final String   audName,
    final String   audAddress1,
    final String   audAddress2,
    final String   audAddress3,
    final String   audAddress4,
    final String   audAddress5,
    final String   audAddress6,
    final String   audPostcode,
    final String   audTelephoneNo,
    final String   audTelephoneNo2,
    final String   audFaxNo,
    final String   audContact,
    final String   audEMail,
    final String   audNotes,
    final String   audGeneral1,
    final String   audGeneral2,
    final String   audGeneral3 ) {
    this.audAddrid = audAddrid;

    this.audAccountNo = audAccountNo;

    this.audSubscriberId = audSubscriberId;

    this.audAddressType = audAddressType;

    this.audInDate = ( audInDate != null ) ? new Date( audInDate ) : null;

    this.audInvEffDate = ( audInvEffDate != null )
      ? new DateTime( audInvEffDate ) : null;

    this.audClassification = audClassification;

    this.audUniqueId = audUniqueId;

    this.audName = audName;

    this.audAddress1 = audAddress1;

    this.audAddress2 = audAddress2;

    this.audAddress3 = audAddress3;

    this.audAddress4 = audAddress4;

    this.audAddress5 = audAddress5;

    this.audAddress6 = audAddress6;

    this.audPostcode = audPostcode;

    this.audTelephoneNo = audTelephoneNo;

    this.audTelephoneNo2 = audTelephoneNo2;

    this.audFaxNo = audFaxNo;

    this.audContact = audContact;

    this.audEMail = audEMail;

    this.audNotes = audNotes;

    this.audGeneral1 = audGeneral1;

    this.audGeneral2 = audGeneral2;

    this.audGeneral3 = audGeneral3;
  }

  //~ Methods ////////////////////////////////////////////////////////////////

  // DBO method implementations ////////////////////////////////////////////////

  /**
   * Sets the generated key ( audAddrid ) value.
   *
   * @param key The generated key value.
   */
  protected void generatedKey( final Integer key ) {
    this.audAddrid = key;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  protected Integer versionNumber(  ) {
    return null;
  }

  /**
   * DOCUMENT ME!
   *
   * @param recordVersion DOCUMENT ME!
   */
  protected void versionNumber( final Integer recordVersion ) {
  }

  // DMO method implementations ////////////////////////////////////////////////
  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  protected DAOArgs primaryKey(  ) {
    return new DAOArgs( 1 ).arg( this.audAddrid );
  }

  // methods for concrete classes follow...
  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  protected int[] fieldTypes(  ) {
    return fieldTypes;
  }
  
  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  protected Object[] get(  ) {
    return new Object[] {
      audAddrid,
      ( audAccountNo == null ) ? null
                               : ( ( audAccountNo.length(  ) <= audAccountNoSize )
      ? audAccountNo
      : audAccountNo.substring( 0, audAccountNoSize ) // auto trimmed to fit, if required.
       ), audSubscriberId,
      ( audAddressType == null ) ? null
                                 : ( ( audAddressType.length(  ) <= audAddressTypeSize )
      ? audAddressType
      : audAddressType.substring( 0, audAddressTypeSize ) // auto trimmed to fit, if required.
       ), audInDate, audInvEffDate,
      ( audClassification == null ) ? null
                                    : ( ( audClassification.length(  ) <= audClassificationSize )
      ? audClassification
      : audClassification.substring( 0, audClassificationSize ) // auto trimmed to fit, if required.
       ),
      ( audUniqueId == null ) ? null
                              : ( ( audUniqueId.length(  ) <= audUniqueIdSize )
      ? audUniqueId
      : audUniqueId.substring( 0, audUniqueIdSize ) // auto trimmed to fit, if required.
       ),
      ( audName == null ) ? null
                          : ( ( audName.length(  ) <= audNameSize ) ? audName
                                                                    : audName
      .substring( 0, audNameSize ) // auto trimmed to fit, if required.
       ),
      ( audAddress1 == null ) ? null
                              : ( ( audAddress1.length(  ) <= audAddress1Size )
      ? audAddress1
      : audAddress1.substring( 0, audAddress1Size ) // auto trimmed to fit, if required.
       ),
      ( audAddress2 == null ) ? null
                              : ( ( audAddress2.length(  ) <= audAddress2Size )
      ? audAddress2
      : audAddress2.substring( 0, audAddress2Size ) // auto trimmed to fit, if required.
       ),
      ( audAddress3 == null ) ? null
                              : ( ( audAddress3.length(  ) <= audAddress3Size )
      ? audAddress3
      : audAddress3.substring( 0, audAddress3Size ) // auto trimmed to fit, if required.
       ),
      ( audAddress4 == null ) ? null
                              : ( ( audAddress4.length(  ) <= audAddress4Size )
      ? audAddress4
      : audAddress4.substring( 0, audAddress4Size ) // auto trimmed to fit, if required.
       ),
      ( audAddress5 == null ) ? null
                              : ( ( audAddress5.length(  ) <= audAddress5Size )
      ? audAddress5
      : audAddress5.substring( 0, audAddress5Size ) // auto trimmed to fit, if required.
       ),
      ( audAddress6 == null ) ? null
                              : ( ( audAddress6.length(  ) <= audAddress6Size )
      ? audAddress6
      : audAddress6.substring( 0, audAddress6Size ) // auto trimmed to fit, if required.
       ),
      ( audPostcode == null ) ? null
                              : ( ( audPostcode.length(  ) <= audPostcodeSize )
      ? audPostcode
      : audPostcode.substring( 0, audPostcodeSize ) // auto trimmed to fit, if required.
       ),
      ( audTelephoneNo == null ) ? null
                                 : ( ( audTelephoneNo.length(  ) <= audTelephoneNoSize )
      ? audTelephoneNo
      : audTelephoneNo.substring( 0, audTelephoneNoSize ) // auto trimmed to fit, if required.
       ),
      ( audTelephoneNo2 == null ) ? null
                                  : ( ( audTelephoneNo2.length(  ) <= audTelephoneNo2Size )
      ? audTelephoneNo2
      : audTelephoneNo2.substring( 0, audTelephoneNo2Size ) // auto trimmed to fit, if required.
       ),
      ( audFaxNo == null ) ? null
                           : ( ( audFaxNo.length(  ) <= audFaxNoSize )
      ? audFaxNo
      : audFaxNo.substring( 0, audFaxNoSize ) // auto trimmed to fit, if required.
       ),
      ( audContact == null ) ? null
                             : ( ( audContact.length(  ) <= audContactSize )
      ? audContact
      : audContact.substring( 0, audContactSize ) // auto trimmed to fit, if required.
       ),
      ( audEMail == null ) ? null
                           : ( ( audEMail.length(  ) <= audEMailSize )
      ? audEMail
      : audEMail.substring( 0, audEMailSize ) // auto trimmed to fit, if required.
       ),
      ( audNotes == null ) ? null
                           : ( ( audNotes.length(  ) <= audNotesSize )
      ? audNotes
      : audNotes.substring( 0, audNotesSize ) // auto trimmed to fit, if required.
       ),
      ( audGeneral1 == null ) ? null
                              : ( ( audGeneral1.length(  ) <= audGeneral1Size )
      ? audGeneral1
      : audGeneral1.substring( 0, audGeneral1Size ) // auto trimmed to fit, if required.
       ),
      ( audGeneral2 == null ) ? null
                              : ( ( audGeneral2.length(  ) <= audGeneral2Size )
      ? audGeneral2
      : audGeneral2.substring( 0, audGeneral2Size ) // auto trimmed to fit, if required.
       ),
      ( audGeneral3 == null ) ? null
                              : ( ( audGeneral3.length(  ) <= audGeneral3Size )
      ? audGeneral3
      : audGeneral3.substring( 0, audGeneral3Size ) // auto trimmed to fit, if required.
       )
    };
  }

  /**
   * DOCUMENT ME!
   *
   * @param fields DOCUMENT ME!
   */
  protected void set( final Object[] fields ) {
    audAddrid = (Integer) fields[0];
    audAccountNo = rtrim( (String) fields[1] );
    audSubscriberId = (Integer) fields[2];
    audAddressType = rtrim( (String) fields[3] );
    audInDate = (Date) fields[4];
    audInvEffDate = (DateTime) fields[5];
    audClassification = rtrim( (String) fields[6] );
    audUniqueId = rtrim( (String) fields[7] );
    audName = rtrim( (String) fields[8] );
    audAddress1 = rtrim( (String) fields[9] );
    audAddress2 = rtrim( (String) fields[10] );
    audAddress3 = rtrim( (String) fields[11] );
    audAddress4 = rtrim( (String) fields[12] );
    audAddress5 = rtrim( (String) fields[13] );
    audAddress6 = rtrim( (String) fields[14] );
    audPostcode = rtrim( (String) fields[15] );
    audTelephoneNo = rtrim( (String) fields[16] );
    audTelephoneNo2 = rtrim( (String) fields[17] );
    audFaxNo = rtrim( (String) fields[18] );
    audContact = rtrim( (String) fields[19] );
    audEMail = rtrim( (String) fields[20] );
    audNotes = rtrim( (String) fields[21] );
    audGeneral1 = rtrim( (String) fields[22] );
    audGeneral2 = rtrim( (String) fields[23] );
    audGeneral3 = rtrim( (String) fields[24] );
  }

  // Get methods ///////////////////////////////////////////////////////////////
  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public Integer getAudAddrid(  ) {
    return (this.audAddrid == null) ? new Integer(0) : this.audAddrid;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getAudAccountNo(  ) {
    return (this.audAccountNo == null) ? "" : this.audAccountNo;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public Integer getAudSubscriberId(  ) {
    return (this.audSubscriberId == null) ? new Integer(0) : this.audSubscriberId;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getAudAddressType(  ) {
    return (this.audAddressType == null) ? "" : this.audAddressType;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public Date getAudInDate(  ) {
    return (this.audInDate != null ) ? new Date( this.audInDate ) : null;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public DateTime getAudInvEffDate(  ) {
    return ( this.audInvEffDate != null ) ? new DateTime( this.audInvEffDate ) : null;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getAudClassification(  ) {
    return (this.audClassification == null) ? "" : this.audClassification;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getAudUniqueId(  ) {
    return (this.audUniqueId == null) ? "" : this.audUniqueId;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getAudName(  ) {
    return (this.audName == null) ? "" : this.audName;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getAudAddress1(  ) {
    return (this.audAddress1 == null) ? "" : this.audAddress1;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getAudAddress2(  ) {
    return (this.audAddress2 == null) ? "" : this.audAddress2;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getAudAddress3(  ) {
    return (this.audAddress3 == null) ? "" : this.audAddress3;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getAudAddress4(  ) {
    return (this.audAddress4 == null) ? "" : this.audAddress4;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getAudAddress5(  ) {
    return (this.audAddress5 == null) ? "" : this.audAddress5;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getAudAddress6(  ) {
    return (this.audAddress6 == null) ? "" : this.audAddress6;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getAudPostcode(  ) {
    return (this.audPostcode == null) ? "" : this.audPostcode;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getAudTelephoneNo(  ) {
    return (this.audTelephoneNo == null) ? "" : this.audTelephoneNo;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getAudTelephoneNo2(  ) {
    return (this.audTelephoneNo2 == null) ? "" : this.audTelephoneNo2;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getAudFaxNo(  ) {
    return (this.audFaxNo == null) ? "" : this.audFaxNo;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getAudContact(  ) {
    return (this.audContact == null) ? "" : this.audContact;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getAudEMail(  ) {
    return (this.audEMail == null) ? "" : this.audEMail;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getAudNotes(  ) {
    return (this.audNotes == null) ? "" : this.audNotes;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getAudGeneral1(  ) {
    return (this.audGeneral1 == null) ? "" : this.audGeneral1;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getAudGeneral2(  ) {
    return (this.audGeneral2 == null) ? "" : this.audGeneral2;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getAudGeneral3(  ) {
    return (this.audGeneral3 == null) ? "" : this.audGeneral3;
  }

  // Setter methods ///////////////////////////////////////////////////////////////

  //
  // Master setter follows...
  //

  /**
   * Setter that takes all attributes
   */
  public void set( 
    final Integer  audAddrid,
    final String   audAccountNo,
    final Integer  audSubscriberId,
    final String   audAddressType,
    final Date     audInDate,
    final DateTime audInvEffDate,
    final String   audClassification,
    final String   audUniqueId,
    final String   audName,
    final String   audAddress1,
    final String   audAddress2,
    final String   audAddress3,
    final String   audAddress4,
    final String   audAddress5,
    final String   audAddress6,
    final String   audPostcode,
    final String   audTelephoneNo,
    final String   audTelephoneNo2,
    final String   audFaxNo,
    final String   audContact,
    final String   audEMail,
    final String   audNotes,
    final String   audGeneral1,
    final String   audGeneral2,
    final String   audGeneral3 ) {
    this.audAddrid = audAddrid;
    this.audAccountNo = audAccountNo;
    this.audSubscriberId = audSubscriberId;
    this.audAddressType = audAddressType;
    this.audInDate = ( audInDate != null ) ? new Date( audInDate ) : null;
    this.audInvEffDate = ( audInvEffDate != null )
      ? new DateTime( audInvEffDate ) : null;
    this.audClassification = audClassification;
    this.audUniqueId = audUniqueId;
    this.audName = audName;
    this.audAddress1 = audAddress1;
    this.audAddress2 = audAddress2;
    this.audAddress3 = audAddress3;
    this.audAddress4 = audAddress4;
    this.audAddress5 = audAddress5;
    this.audAddress6 = audAddress6;
    this.audPostcode = audPostcode;
    this.audTelephoneNo = audTelephoneNo;
    this.audTelephoneNo2 = audTelephoneNo2;
    this.audFaxNo = audFaxNo;
    this.audContact = audContact;
    this.audEMail = audEMail;
    this.audNotes = audNotes;
    this.audGeneral1 = audGeneral1;
    this.audGeneral2 = audGeneral2;
    this.audGeneral3 = audGeneral3;
  }

  /**
  * Sets the AudAddrid field.
  *
  * @param audAddrid
  */
  public void setAudAddrid( final Integer audAddrid ) {
    this.audAddrid = audAddrid;
  }

  /**
  * Sets the AudAccountNo field.
  *
  * @param audAccountNo
  */
  public void setAudAccountNo( final String audAccountNo ) {
    this.audAccountNo = getPadded(audAccountNo, audAccountNoFilter);
  }

  /**
  * Sets the AudSubscriberId field.
  *
  * @param audSubscriberId
  */
  public void setAudSubscriberId( final Integer audSubscriberId ) {
    this.audSubscriberId = audSubscriberId;
  }

  /**
  * Sets the AudAddressType field.
  *
  * @param audAddressType
  */
  public void setAudAddressType( final String audAddressType ) {
    this.audAddressType = getPadded(audAddressType, audAddressTypeFilter);
  }

  /**
  * Sets the AudInDate field.
  *
  * @param audInDate
  */
  public void setAudInDate( final Date audInDate ) {
    this.audInDate = ( audInDate != null ) ? new Date( audInDate ) : null;
  }

  /**
  * Sets the AudInvEffDate field.
  *
  * @param audInvEffDate
  */
  public void setAudInvEffDate( final DateTime audInvEffDate ) {
    this.audInvEffDate = ( audInvEffDate != null )
      ? new DateTime( audInvEffDate ) : null;
  }

  /**
  * Sets the AudClassification field.
  *
  * @param audClassification
  */
  public void setAudClassification( final String audClassification ) {
    this.audClassification = getPadded(audClassification, audClassificationFilter);
  }

  /**
  * Sets the AudUniqueId field.
  *
  * @param audUniqueId
  */
  public void setAudUniqueId( final String audUniqueId ) {
    this.audUniqueId = getPadded(audUniqueId, audUniqueIdFilter);
  }

  /**
  * Sets the AudName field.
  *
  * @param audName
  */
  public void setAudName( final String audName ) {
    this.audName = getPadded(audName, audNameFilter);
  }

  /**
  * Sets the AudAddress1 field.
  *
  * @param audAddress1
  */
  public void setAudAddress1( final String audAddress1 ) {
    this.audAddress1 = getPadded(audAddress1, audAddress1Filter);
  }

  /**
  * Sets the AudAddress2 field.
  *
  * @param audAddress2
  */
  public void setAudAddress2( final String audAddress2 ) {
    this.audAddress2 = getPadded(audAddress2, audAddress2Filter);
  }

  /**
  * Sets the AudAddress3 field.
  *
  * @param audAddress3
  */
  public void setAudAddress3( final String audAddress3 ) {
    this.audAddress3 = getPadded(audAddress3, audAddress3Filter);
  }

  /**
  * Sets the AudAddress4 field.
  *
  * @param audAddress4
  */
  public void setAudAddress4( final String audAddress4 ) {
    this.audAddress4 = getPadded(audAddress4, audAddress4Filter);
  }

  /**
  * Sets the AudAddress5 field.
  *
  * @param audAddress5
  */
  public void setAudAddress5( final String audAddress5 ) {
    this.audAddress5 = getPadded(audAddress5, audAddress5Filter);
  }

  /**
  * Sets the AudAddress6 field.
  *
  * @param audAddress6
  */
  public void setAudAddress6( final String audAddress6 ) {
    this.audAddress6 = getPadded(audAddress6, audAddress6Filter);
  }

  /**
  * Sets the AudPostcode field.
  *
  * @param audPostcode
  */
  public void setAudPostcode( final String audPostcode ) {
    this.audPostcode = getPadded(audPostcode, audPostcodeFilter);
  }

  /**
  * Sets the AudTelephoneNo field.
  *
  * @param audTelephoneNo
  */
  public void setAudTelephoneNo( final String audTelephoneNo ) {
    this.audTelephoneNo = getPadded(audTelephoneNo, audTelephoneNo2Filter);
  }

  /**
  * Sets the AudTelephoneNo2 field.
  *
  * @param audTelephoneNo2
  */
  public void setAudTelephoneNo2( final String audTelephoneNo2 ) {
    this.audTelephoneNo2 = getPadded(audTelephoneNo2, audTelephoneNo2Filter);
  }

  /**
  * Sets the AudFaxNo field.
  *
  * @param audFaxNo
  */
  public void setAudFaxNo( final String audFaxNo ) {
    this.audFaxNo = getPadded(audFaxNo, audFaxNoFilter) ;
  }

  /**
  * Sets the AudContact field.
  *
  * @param audContact
  */
  public void setAudContact( final String audContact ) {
    this.audContact = getPadded(audContact, audContactFilter);
  }

  /**
  * Sets the AudEMail field.
  *
  * @param audEMail
  */
  public void setAudEMail( final String audEMail ) {
    this.audEMail = getPadded(audEMail, audEMailFilter);
  }

  /**
  * Sets the AudNotes field.
  *
  * @param audNotes
  */
  public void setAudNotes( final String audNotes ) {
    this.audNotes = getPadded(audNotes, audNotesFilter);
  }

  /**
  * Sets the AudGeneral1 field.
  *
  * @param audGeneral1
  */
  public void setAudGeneral1( final String audGeneral1 ) {
    this.audGeneral1 = getPadded(audGeneral1, audGeneral1Filter);
  }

  /**
  * Sets the AudGeneral2 field.
  *
  * @param audGeneral2
  */
  public void setAudGeneral2( final String audGeneral2 ) {
    this.audGeneral2 = getPadded(audGeneral2, audGeneral2Filter);
  }

  /**
  * Sets the AudGeneral3 field.
  *
  * @param audGeneral3
  */
  public void setAudGeneral3( final String audGeneral3 ) {
    this.audGeneral3 = getPadded(audGeneral3, audGeneral3Filter);
  }

@Override
public String toString() {
	return "\nAudAddressDMO [\naudInDate=" + audInDate + "\naudInvEffDate=" + audInvEffDate + "\naudAddrid=" + audAddrid
			+ "\naudSubscriberId=" + audSubscriberId + "\naudAccountNo=" + audAccountNo + "\naudAddress1=" + audAddress1
			+ "\naudAddress2=" + audAddress2 + "\naudAddress3=" + audAddress3 + "\naudAddress4=" + audAddress4
			+ "\naudAddress5=" + audAddress5 + "\naudAddress6=" + audAddress6 + "\naudAddressType=" + audAddressType
			+ "\naudClassification=" + audClassification + "\naudContact=" + audContact + "\naudEMail=" + audEMail
			+ "\naudFaxNo=" + audFaxNo + "\naudGeneral1=" + audGeneral1 + "\naudGeneral2=" + audGeneral2
			+ "\naudGeneral3=" + audGeneral3 + "\naudName=" + audName + "\naudNotes=" + audNotes + "\naudPostcode="
			+ audPostcode + "\naudTelephoneNo=" + audTelephoneNo + "\naudTelephoneNo2=" + audTelephoneNo2
			+ "\naudUniqueId=" + audUniqueId + "]";
}


}
