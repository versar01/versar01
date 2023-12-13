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
import com.eppixcomm.eppix.common.util.Date;

//---------------------
// class javadoc
//---------------------
/**
 * A value object to carry the data for a SbdSubDets.
 *
 *
 * <H3> A SbdSubDets is: </H3>
 *
 * <!-- indent text -->
 * <TABLE BORDER="0" CELLPADDING="0" CELLSPACING="0">
 * <TR>
 * <TD WIDTH="25">&nbsp;</TD>
 * <TD>
 *
 * This table is used to store the generic subscriber details.
 * <p>
 *   The subscriber (or client) specific details are stored in the table sba_sub_aux table.
 * </p>
 * <p>
 *   The subscribers physical address is no longer stored on this table. It has moved to the aud_address table which also holds
 *   any other addresses for the subscriber. The physical address is stored on there with an address_type of "SPHY".
 * </p>
 *
 * <!-- end indent text -->
 * </TD>
 * </TR>
 * </TABLE>
 *
 *
 * <H3> SbdSubDets Value Object: </H3>
 *
 * <!-- indent text -->
 * <TABLE BORDER="0" CELLPADDING="0" CELLSPACING="0">
 * <TR>
 * <TD WIDTH="25">&nbsp;</TD>
 * <TD>
 *
 * <P>
 *     This is a value object (called a Data Model Object or 'DMO').
 *     It is used to pass the data for a sbdSubDets into and out of the BASE module.
 *     Because it's purpose is to carry data into and out of the module it is visible outside the module.
 * </P>
 * <P>
 *     This value object carries the data for one sbdSubDets. A sbdSubDets is:
 * This table is used to store the generic subscriber details.
 * </P>
 * <P>
 *     It corresponds to the business logic object SbdSubDets which
 *     contains all the business behaviour of a sbdSubDets but is not visible outside the
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
 *    This value object contains fields for all the details of a sbdSubDets, namely:
 * </P>
 *


 * <P>
 *    <U>Fields to carry the Attributes of a sbdSubDets:</U>
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
 *   <TD ALIGN="left" VALIGN="top"><B>sbdSubscriberId</B></TD>
 *   <TD ALIGN="left" VALIGN="top">Integer</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Unique identifier for the subscriber.
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
 *       <A HREF="#getSbdSubscriberId()">
 *           getSbdSubscriberId
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setSbdSubscriberId(java.lang.Integer)">
 *           setSbdSubscriberId (Integer)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>sbdDiallingNo</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Holds the Primary MSISDN for billing purposes.
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
 *       <A HREF="#getSbdDiallingNo()">
 *           getSbdDiallingNo
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setSbdDiallingNo(java.lang.String)">
 *           setSbdDiallingNo (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>sbdBillAcNo</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       The Customers account number.
 *       <p>
 *         Cross references with CUSTOMER.bill_ac_no.
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
 *       <A HREF="#getSbdBillAcNo()">
 *           getSbdBillAcNo
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setSbdBillAcNo(java.lang.String)">
 *           setSbdBillAcNo (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>sbdConnectDate</B></TD>
 *   <TD ALIGN="left" VALIGN="top">Date</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Initial connection date of the subscriber.
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
 *       <A HREF="#getSbdConnectDate()">
 *           getSbdConnectDate
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setSbdConnectDate(com.cmgwds.eppix.util.Date)">
 *           setSbdConnectDate (Date)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>sbdDconnectDate</B></TD>
 *   <TD ALIGN="left" VALIGN="top">Date</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Disconnection date of the whole subscription.
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
 *       <A HREF="#getSbdDconnectDate()">
 *           getSbdDconnectDate
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setSbdDconnectDate(com.cmgwds.eppix.util.Date)">
 *           setSbdDconnectDate (Date)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>sbdTermDate</B></TD>
 *   <TD ALIGN="left" VALIGN="top">Date</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Contract termination date.
 *       <p>
 *         See the vam_active_msisdn for the termination of a specific SIM.
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
 *       <A HREF="#getSbdTermDate()">
 *           getSbdTermDate
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setSbdTermDate(com.cmgwds.eppix.util.Date)">
 *           setSbdTermDate (Date)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>sbdTitle</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       The title of the Subscriber i.
 *       <p>
 *         e Mr, Miss etc. This is a freeform text not restricted by any lookup.
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
 *       <A HREF="#getSbdTitle()">
 *           getSbdTitle
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setSbdTitle(java.lang.String)">
 *           setSbdTitle (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>sbdSurname</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       The subscribers surname.
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
 *       <A HREF="#getSbdSurname()">
 *           getSbdSurname
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setSbdSurname(java.lang.String)">
 *           setSbdSurname (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>sbdFirstname</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       The subscribers firstname.
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
 *       <A HREF="#getSbdFirstname()">
 *           getSbdFirstname
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setSbdFirstname(java.lang.String)">
 *           setSbdFirstname (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>sbdGender</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       M - Male
F  - Female
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
 *       <A HREF="#getSbdGender()">
 *           getSbdGender
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setSbdGender(java.lang.String)">
 *           setSbdGender (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>sbdDob</B></TD>
 *   <TD ALIGN="left" VALIGN="top">Date</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       The subscribers date of birth
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
 *       <A HREF="#getSbdDob()">
 *           getSbdDob
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setSbdDob(com.cmgwds.eppix.util.Date)">
 *           setSbdDob (Date)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>sbdPassword</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       The subscribers password currenlty used for the verification of Subscriber on PUK enquiry.
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
 *       <A HREF="#getSbdPassword()">
 *           getSbdPassword
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setSbdPassword(java.lang.String)">
 *           setSbdPassword (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>sbdLocationCode</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Could be a link to a number of tables such as Home Location Registers table, Postcode Table, etc.
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
 *       <A HREF="#getSbdLocationCode()">
 *           getSbdLocationCode
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setSbdLocationCode(java.lang.String)">
 *           setSbdLocationCode (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>sbdBillCycle</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       The billing cycle on which the subscriber is to be billed.
 *       <p>
 *         Defaults from aux_customers.aux_bill_cycle.
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
 *       <A HREF="#getSbdBillCycle()">
 *           getSbdBillCycle
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setSbdBillCycle(java.lang.String)">
 *           setSbdBillCycle (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>sbdPackageCode</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       The package code for the subscriber.
 *       <p>
 *         Defaults from aux_customers. Package_code.
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
 *       <A HREF="#getSbdPackageCode()">
 *           getSbdPackageCode
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setSbdPackageCode(java.lang.String)">
 *           setSbdPackageCode (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>sbdBilledUpto</B></TD>
 *   <TD ALIGN="left" VALIGN="top">Date</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       The last date the subscriber was billed up to.
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
 *       <A HREF="#getSbdBilledUpto()">
 *           getSbdBilledUpto
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setSbdBilledUpto(com.cmgwds.eppix.util.Date)">
 *           setSbdBilledUpto (Date)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>sbdTariffPlan</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       3.
 *       <p>
 *         1 - the tariff plan.
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
 *       <A HREF="#getSbdTariffPlan()">
 *           getSbdTariffPlan
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setSbdTariffPlan(java.lang.String)">
 *           setSbdTariffPlan (String)
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


 * @see SbdSubDets
 *
 * @author
 * @version $Revision: $
 *
 * @since $jdk$
 */
public class SbdSubDetsDMO
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
      FIELD_TYPE_INTEGER /* std public attribute: sbdSubscriberId  */,
      FIELD_TYPE_STRING /* std public attribute: sbdDiallingNo  */,
      FIELD_TYPE_STRING /* std public attribute: sbdBillAcNo  */,
      FIELD_TYPE_DATEONLY /* std public attribute: sbdConnectDate  */,
      FIELD_TYPE_DATEONLY /* std public attribute: sbdDconnectDate  */,
      FIELD_TYPE_DATEONLY /* std public attribute: sbdTermDate  */,
      FIELD_TYPE_STRING /* std public attribute: sbdTitle  */,
      FIELD_TYPE_STRING /* std public attribute: sbdSurname  */,
      FIELD_TYPE_STRING /* std public attribute: sbdFirstname  */,
      FIELD_TYPE_STRING /* std public attribute: sbdGender  */,
      FIELD_TYPE_DATEONLY /* std public attribute: sbdDob  */,
      FIELD_TYPE_STRING /* std public attribute: sbdPassword  */,
      FIELD_TYPE_STRING /* std public attribute: sbdLocationCode  */,
      FIELD_TYPE_STRING /* std public attribute: sbdBillCycle  */,
      FIELD_TYPE_STRING /* std public attribute: sbdPackageCode  */,
      FIELD_TYPE_DATEONLY /* std public attribute: sbdBilledUpto  */,
      FIELD_TYPE_STRING /* std public attribute: sbdTariffPlan  */
    };
  
  private final int[] fieldSizes = new int[] {
		  0,
		  sbdDiallingNoSize,
		  sbdBillAcNoSize,
		  0,
		  0,
		  0,
		  sbdTitleSize,
		  sbdSurnameSize,
		  sbdFirstnameSize,
		  sbdGenderSize,
		  0,
		  sbdPasswordSize,
		  sbdLocationCodeSize,
		  sbdBillCycleSize,
		  sbdPackageCodeSize,
		  0,
		  sbdTariffPlanSize 
  };
      

  public int[] fieldSizes() {
  	return fieldSizes;
  }  

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int sbdSubscriberIdFilter = 0; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int sbdDiallingNoFilter = 1; // filter index
  private static final int sbdDiallingNoSize = 15; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int sbdBillAcNoFilter = 2; // filter index
  private static final int sbdBillAcNoSize = 8; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int sbdConnectDateFilter = 3; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int sbdDconnectDateFilter = 4; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int sbdTermDateFilter = 5; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int sbdTitleFilter = 6; // filter index
  private static final int sbdTitleSize = 10; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int sbdSurnameFilter = 7; // filter index
  private static final int sbdSurnameSize = 40; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int sbdFirstnameFilter = 8; // filter index
  private static final int sbdFirstnameSize = 40; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int sbdGenderFilter = 9; // filter index
  private static final int sbdGenderSize = 1; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int sbdDobFilter = 10; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int sbdPasswordFilter = 11; // filter index
  private static final int sbdPasswordSize = 20; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int sbdLocationCodeFilter = 12; // filter index
  private static final int sbdLocationCodeSize = 15; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int sbdBillCycleFilter = 13; // filter index
  private static final int sbdBillCycleSize = 5; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int sbdPackageCodeFilter = 14; // filter index
  private static final int sbdPackageCodeSize = 5; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int sbdBilledUptoFilter = 15; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int sbdTariffPlanFilter = 16; // filter index
  private static final int sbdTariffPlanSize = 20; // field size

  //~ Instance variables /////////////////////////////////////////////////////

  private Date sbdBilledUpto; // Loaded from Schema
  private Date sbdConnectDate; // Loaded from Schema
  private Date sbdDconnectDate; // Loaded from Schema
  private Date sbdDob; // Loaded from Schema
  private Date sbdTermDate; // Loaded from Schema

  //---------------------
  // Field declarations
  //---------------------
  // all attributes
  private Integer sbdSubscriberId; // Loaded from Schema
  private String sbdBillAcNo; // Loaded from Schema
  private String sbdBillCycle; // Loaded from Schema
  private String sbdDiallingNo; // Loaded from Schema
  private String sbdFirstname; // Loaded from Schema
  private String sbdGender; // Loaded from Schema
  private String sbdLocationCode; // Loaded from Schema
  private String sbdPackageCode; // Loaded from Schema
  private String sbdPassword; // Loaded from Schema
  private String sbdSurname; // Loaded from Schema
  private String sbdTariffPlan; // Loaded from Schema
  private String sbdTitle; // Loaded from Schema

  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new SbdSubDetsDMO object.
   */
  public SbdSubDetsDMO(  ) {
  }

  // Constructor - taking public attributes
  /**
   * Creates a new SbdSubDetsDMO object.
   *
   * @param sbdSubscriberId DOCUMENT ME!
   * @param sbdDiallingNo DOCUMENT ME!
   * @param sbdBillAcNo DOCUMENT ME!
   * @param sbdConnectDate DOCUMENT ME!
   * @param sbdDconnectDate DOCUMENT ME!
   * @param sbdTermDate DOCUMENT ME!
   * @param sbdTitle DOCUMENT ME!
   * @param sbdSurname DOCUMENT ME!
   * @param sbdFirstname DOCUMENT ME!
   * @param sbdGender DOCUMENT ME!
   * @param sbdDob DOCUMENT ME!
   * @param sbdPassword DOCUMENT ME!
   * @param sbdLocationCode DOCUMENT ME!
   * @param sbdBillCycle DOCUMENT ME!
   * @param sbdPackageCode DOCUMENT ME!
   * @param sbdBilledUpto DOCUMENT ME!
   * @param sbdTariffPlan DOCUMENT ME!
   */
  public SbdSubDetsDMO( 
    final Integer sbdSubscriberId,
    final String  sbdDiallingNo,
    final String  sbdBillAcNo,
    final Date    sbdConnectDate,
    final Date    sbdDconnectDate,
    final Date    sbdTermDate,
    final String  sbdTitle,
    final String  sbdSurname,
    final String  sbdFirstname,
    final String  sbdGender,
    final Date    sbdDob,
    final String  sbdPassword,
    final String  sbdLocationCode,
    final String  sbdBillCycle,
    final String  sbdPackageCode,
    final Date    sbdBilledUpto,
    final String  sbdTariffPlan ) {
    this.sbdSubscriberId = sbdSubscriberId;

    this.sbdDiallingNo = sbdDiallingNo;

    this.sbdBillAcNo = sbdBillAcNo;

    this.sbdConnectDate = ( sbdConnectDate != null )
      ? new Date( sbdConnectDate ) : null;

    this.sbdDconnectDate = ( sbdDconnectDate != null )
      ? new Date( sbdDconnectDate ) : null;

    this.sbdTermDate = ( sbdTermDate != null ) ? new Date( sbdTermDate ) : null;

    this.sbdTitle = sbdTitle;

    this.sbdSurname = sbdSurname;

    this.sbdFirstname = sbdFirstname;

    this.sbdGender = sbdGender;

    this.sbdDob = ( sbdDob != null ) ? new Date( sbdDob ) : null;

    this.sbdPassword = sbdPassword;

    this.sbdLocationCode = sbdLocationCode;

    this.sbdBillCycle = sbdBillCycle;

    this.sbdPackageCode = sbdPackageCode;

    this.sbdBilledUpto = ( sbdBilledUpto != null )
      ? new Date( sbdBilledUpto ) : null;

    this.sbdTariffPlan = sbdTariffPlan;
  }

  //~ Methods ////////////////////////////////////////////////////////////////

  // DBO method implementations ////////////////////////////////////////////////

  /**
   * Sets the generated key ( sbdSubscriberId ) value.
   *
   * @param key The generated key value.
   */
  protected void generatedKey( final Integer key ) {
    this.sbdSubscriberId = key;
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
    return new DAOArgs( 1 ).arg( this.sbdSubscriberId );
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
      sbdSubscriberId,
      ( sbdDiallingNo == null ) ? null
                                : ( ( sbdDiallingNo.length(  ) <= sbdDiallingNoSize )
      ? sbdDiallingNo
      : sbdDiallingNo.substring( 0, sbdDiallingNoSize ) // auto trimmed to fit, if required.
       ),
      ( sbdBillAcNo == null ) ? null
                              : ( ( sbdBillAcNo.length(  ) <= sbdBillAcNoSize )
      ? sbdBillAcNo
      : sbdBillAcNo.substring( 0, sbdBillAcNoSize ) // auto trimmed to fit, if required.
       ), sbdConnectDate, sbdDconnectDate, sbdTermDate,
      ( sbdTitle == null ) ? null
                           : ( ( sbdTitle.length(  ) <= sbdTitleSize )
      ? sbdTitle
      : sbdTitle.substring( 0, sbdTitleSize ) // auto trimmed to fit, if required.
       ),
      ( sbdSurname == null ) ? null
                             : ( ( sbdSurname.length(  ) <= sbdSurnameSize )
      ? sbdSurname
      : sbdSurname.substring( 0, sbdSurnameSize ) // auto trimmed to fit, if required.
       ),
      ( sbdFirstname == null ) ? null
                               : ( ( sbdFirstname.length(  ) <= sbdFirstnameSize )
      ? sbdFirstname
      : sbdFirstname.substring( 0, sbdFirstnameSize ) // auto trimmed to fit, if required.
       ),
      ( sbdGender == null ) ? null
                            : ( ( sbdGender.length(  ) <= sbdGenderSize )
      ? sbdGender
      : sbdGender.substring( 0, sbdGenderSize ) // auto trimmed to fit, if required.
       ), sbdDob,
      ( sbdPassword == null ) ? null
                              : ( ( sbdPassword.length(  ) <= sbdPasswordSize )
      ? sbdPassword
      : sbdPassword.substring( 0, sbdPasswordSize ) // auto trimmed to fit, if required.
       ),
      ( sbdLocationCode == null ) ? null
                                  : ( ( sbdLocationCode.length(  ) <= sbdLocationCodeSize )
      ? sbdLocationCode
      : sbdLocationCode.substring( 0, sbdLocationCodeSize ) // auto trimmed to fit, if required.
       ),
      ( sbdBillCycle == null ) ? null
                               : ( ( sbdBillCycle.length(  ) <= sbdBillCycleSize )
      ? sbdBillCycle
      : sbdBillCycle.substring( 0, sbdBillCycleSize ) // auto trimmed to fit, if required.
       ),
      ( sbdPackageCode == null ) ? null
                                 : ( ( sbdPackageCode.length(  ) <= sbdPackageCodeSize )
      ? sbdPackageCode
      : sbdPackageCode.substring( 0, sbdPackageCodeSize ) // auto trimmed to fit, if required.
       ), sbdBilledUpto,
      ( sbdTariffPlan == null ) ? null
                                : ( ( sbdTariffPlan.length(  ) <= sbdTariffPlanSize )
      ? sbdTariffPlan
      : sbdTariffPlan.substring( 0, sbdTariffPlanSize ) // auto trimmed to fit, if required.
       )
    };
  }

  /**
   * DOCUMENT ME!
   *
   * @param fields DOCUMENT ME!
   */
  protected void set( final Object[] fields ) {
    sbdSubscriberId = (Integer) fields[0];
    sbdDiallingNo = rtrim( (String) fields[1] );
    sbdBillAcNo = rtrim( (String) fields[2] );
    sbdConnectDate = (Date) fields[3];
    sbdDconnectDate = (Date) fields[4];
    sbdTermDate = (Date) fields[5];
    sbdTitle = rtrim( (String) fields[6] );
    sbdSurname = rtrim( (String) fields[7] );
    sbdFirstname = rtrim( (String) fields[8] );
    sbdGender = rtrim( (String) fields[9] );
    sbdDob = (Date) fields[10];
    sbdPassword = rtrim( (String) fields[11] );
    sbdLocationCode = rtrim( (String) fields[12] );
    sbdBillCycle = rtrim( (String) fields[13] );
    sbdPackageCode = rtrim( (String) fields[14] );
    sbdBilledUpto = (Date) fields[15];
    sbdTariffPlan = rtrim( (String) fields[16] );
  }

  // Get methods ///////////////////////////////////////////////////////////////
  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public Integer getSbdSubscriberId(  ) {
    return sbdSubscriberId;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getSbdDiallingNo(  ) {
    return sbdDiallingNo;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getSbdBillAcNo(  ) {
    return sbdBillAcNo;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public Date getSbdConnectDate(  ) {
    return ( sbdConnectDate != null ) ? new Date( sbdConnectDate ) : null;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public Date getSbdDconnectDate(  ) {
    return ( sbdDconnectDate != null ) ? new Date( sbdDconnectDate ) : null;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public Date getSbdTermDate(  ) {
    return ( sbdTermDate != null ) ? new Date( sbdTermDate ) : null;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getSbdTitle(  ) {
    return sbdTitle;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getSbdSurname(  ) {
    return sbdSurname;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getSbdFirstname(  ) {
    return sbdFirstname;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getSbdGender(  ) {
    return sbdGender;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public Date getSbdDob(  ) {
    return ( sbdDob != null ) ? new Date( sbdDob ) : null;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getSbdPassword(  ) {
    return sbdPassword;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getSbdLocationCode(  ) {
    return sbdLocationCode;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getSbdBillCycle(  ) {
    return sbdBillCycle;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getSbdPackageCode(  ) {
    return sbdPackageCode;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public Date getSbdBilledUpto(  ) {
    return ( sbdBilledUpto != null ) ? new Date( sbdBilledUpto ) : null;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getSbdTariffPlan(  ) {
    return sbdTariffPlan;
  }

  // Setter methods ///////////////////////////////////////////////////////////////

  //
  // Master setter follows...
  //

  /**
   * Setter that takes all attributes
   */
  public void set( 
    final Integer sbdSubscriberId,
    final String  sbdDiallingNo,
    final String  sbdBillAcNo,
    final Date    sbdConnectDate,
    final Date    sbdDconnectDate,
    final Date    sbdTermDate,
    final String  sbdTitle,
    final String  sbdSurname,
    final String  sbdFirstname,
    final String  sbdGender,
    final Date    sbdDob,
    final String  sbdPassword,
    final String  sbdLocationCode,
    final String  sbdBillCycle,
    final String  sbdPackageCode,
    final Date    sbdBilledUpto,
    final String  sbdTariffPlan ) {
    this.sbdSubscriberId = sbdSubscriberId;
    this.sbdDiallingNo = sbdDiallingNo;
    this.sbdBillAcNo = sbdBillAcNo;
    this.sbdConnectDate = ( sbdConnectDate != null )
      ? new Date( sbdConnectDate ) : null;
    this.sbdDconnectDate = ( sbdDconnectDate != null )
      ? new Date( sbdDconnectDate ) : null;
    this.sbdTermDate = ( sbdTermDate != null ) ? new Date( sbdTermDate ) : null;
    this.sbdTitle = sbdTitle;
    this.sbdSurname = sbdSurname;
    this.sbdFirstname = sbdFirstname;
    this.sbdGender = sbdGender;
    this.sbdDob = ( sbdDob != null ) ? new Date( sbdDob ) : null;
    this.sbdPassword = sbdPassword;
    this.sbdLocationCode = sbdLocationCode;
    this.sbdBillCycle = sbdBillCycle;
    this.sbdPackageCode = sbdPackageCode;
    this.sbdBilledUpto = ( sbdBilledUpto != null )
      ? new Date( sbdBilledUpto ) : null;
    this.sbdTariffPlan = sbdTariffPlan;
  }

  //
  // Public access modifiers if any
  // (provided for attributes that are public in the analysis model)
  //    

  /**
  * Sets the SbdSubscriberId field.
  *
  * @param sbdSubscriberId
  */
  public void setSbdSubscriberId( final Integer sbdSubscriberId ) {
    this.sbdSubscriberId = sbdSubscriberId;
  }

  /**
  * Sets the SbdDiallingNo field.
  *
  * @param sbdDiallingNo
  */
  public void setSbdDiallingNo( final String sbdDiallingNo ) {
    this.sbdDiallingNo = getPadded(sbdDiallingNo, sbdDiallingNoFilter);
  }

  /**
  * Sets the SbdBillAcNo field.
  *
  * @param sbdBillAcNo
  */
  public void setSbdBillAcNo( final String sbdBillAcNo ) {
    this.sbdBillAcNo = getPadded(sbdBillAcNo, sbdBillAcNoFilter);
  }

  /**
  * Sets the SbdConnectDate field.
  *
  * @param sbdConnectDate
  */
  public void setSbdConnectDate( final Date sbdConnectDate ) {
    this.sbdConnectDate = ( sbdConnectDate != null )
      ? new Date( sbdConnectDate ) : null;
  }

  /**
  * Sets the SbdDconnectDate field.
  *
  * @param sbdDconnectDate
  */
  public void setSbdDconnectDate( final Date sbdDconnectDate ) {
    this.sbdDconnectDate = ( sbdDconnectDate != null )
      ? new Date( sbdDconnectDate ) : null;
  }

  /**
  * Sets the SbdTermDate field.
  *
  * @param sbdTermDate
  */
  public void setSbdTermDate( final Date sbdTermDate ) {
    this.sbdTermDate = ( sbdTermDate != null ) ? new Date( sbdTermDate ) : null;
  }

  /**
  * Sets the SbdTitle field.
  *
  * @param sbdTitle
  */
  public void setSbdTitle( final String sbdTitle ) {
    this.sbdTitle = getPadded(sbdTitle, sbdTitleFilter);
  }

  /**
  * Sets the SbdSurname field.
  *
  * @param sbdSurname
  */
  public void setSbdSurname( final String sbdSurname ) {
    this.sbdSurname = getPadded(sbdSurname, sbdSurnameFilter);
  }

  /**
  * Sets the SbdFirstname field.
  *
  * @param sbdFirstname
  */
  public void setSbdFirstname( final String sbdFirstname ) {
    this.sbdFirstname = getPadded(sbdFirstname, sbdFirstnameFilter);
  }

  /**
  * Sets the SbdGender field.
  *
  * @param sbdGender
  */
  public void setSbdGender( final String sbdGender ) {
    this.sbdGender = getPadded(sbdGender, sbdGenderFilter);
  }

  /**
  * Sets the SbdDob field.
  *
  * @param sbdDob
  */
  public void setSbdDob( final Date sbdDob ) {
    this.sbdDob = ( sbdDob != null ) ? new Date( sbdDob ) : null;
  }

  /**
  * Sets the SbdPassword field.
  *
  * @param sbdPassword
  */
  public void setSbdPassword( final String sbdPassword ) {
    this.sbdPassword = getPadded(sbdPassword, sbdPasswordFilter);
  }

  /**
  * Sets the SbdLocationCode field.
  *
  * @param sbdLocationCode
  */
  public void setSbdLocationCode( final String sbdLocationCode ) {
    this.sbdLocationCode = getPadded(sbdLocationCode, sbdLocationCodeFilter);
  }

  /**
  * Sets the SbdBillCycle field.
  *
  * @param sbdBillCycle
  */
  public void setSbdBillCycle( final String sbdBillCycle ) {
    this.sbdBillCycle = getPadded(sbdBillCycle, sbdBillCycleFilter);
  }

  /**
  * Sets the SbdPackageCode field.
  *
  * @param sbdPackageCode
  */
  public void setSbdPackageCode( final String sbdPackageCode ) {
    this.sbdPackageCode = getPadded(sbdPackageCode, sbdPackageCodeFilter);
  }

  /**
  * Sets the SbdBilledUpto field.
  *
  * @param sbdBilledUpto
  */
  public void setSbdBilledUpto( final Date sbdBilledUpto ) {
    this.sbdBilledUpto = ( sbdBilledUpto != null )
      ? new Date( sbdBilledUpto ) : null;
  }

  /**
  * Sets the SbdTariffPlan field.
  *
  * @param sbdTariffPlan
  */
  public void setSbdTariffPlan( final String sbdTariffPlan ) {
    this.sbdTariffPlan = getPadded(sbdTariffPlan, sbdTariffPlanFilter);
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
