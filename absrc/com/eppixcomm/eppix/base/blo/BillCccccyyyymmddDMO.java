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
 * A value object to carry the data for a BillCccccyyyymmdd.
 *
 *
 * <H3> A BillCccccyyyymmdd is: </H3>
 *
 * <!-- indent text -->
 * <TABLE BORDER="0" CELLPADDING="0" CELLSPACING="0">
 * <TR>
 * <TD WIDTH="25">&nbsp;</TD>
 * <TD>
 *
 * Lists the charges to be paid by a particular subscriber.
 * <p>
 *   There are a number of identical tables, one per cycle per period, named bill_cccccyyyymmdd where ccccc is the cycle
 *   code (see bcy_bill_cycle) yyyymmdd is the invoice date for the period of the cycle (see bcy_next_run)
 * </p>
 * <p>
 *   When a charge is raised it is placed in the bill table for the date it covers and for the billing cycle that the subscriber
 *   is on (see sbd_bill_cycle). However if the billing run has already been run for that period it is placed on the first
 *   unbilled period instead (shown by bcy_next_run). Trial billing creates tables called trl_cccccyyyymmdd using the same
 *   script as bill_cccccyyyymmdd.
 * </p>
 *
 * <!-- end indent text -->
 * </TD>
 * </TR>
 * </TABLE>
 *
 *
 * <H3> BillCccccyyyymmdd Value Object: </H3>
 *
 * <!-- indent text -->
 * <TABLE BORDER="0" CELLPADDING="0" CELLSPACING="0">
 * <TR>
 * <TD WIDTH="25">&nbsp;</TD>
 * <TD>
 *
 * <P>
 *     This is a value object (called a Data Model Object or 'DMO').
 *     It is used to pass the data for a billCccccyyyymmdd into and out of the BASE module.
 *     Because it's purpose is to carry data into and out of the module it is visible outside the module.
 * </P>
 * <P>
 *     This value object carries the data for one billCccccyyyymmdd. A billCccccyyyymmdd is:
 * Lists the charges to be paid by a particular subscriber.
 * </P>
 * <P>
 *     It corresponds to the business logic object BillCccccyyyymmdd which
 *     contains all the business behaviour of a billCccccyyyymmdd but is not visible outside the
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
 *    This value object contains fields for all the details of a billCccccyyyymmdd, namely:
 * </P>
 *


 * <P>
 *    <U>Fields to carry the Attributes of a billCccccyyyymmdd:</U>
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
 *   <TD ALIGN="left" VALIGN="top"><B>billId</B></TD>
 *   <TD ALIGN="left" VALIGN="top">Integer</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Unique Identifier for record
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
 *       <A HREF="#getBillId()">
 *           getBillId
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setBillId(java.lang.Integer)">
 *           setBillId (Integer)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>subscriberId</B></TD>
 *   <TD ALIGN="left" VALIGN="top">Integer</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Unique identifer to subscription.
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
 *       <A HREF="#getSubscriberId()">
 *           getSubscriberId
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setSubscriberId(java.lang.Integer)">
 *           setSubscriberId (Integer)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>handset</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       MSISDN number billed.
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
 *       <A HREF="#getHandset()">
 *           getHandset
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setHandset(java.lang.String)">
 *           setHandset (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>chaserv</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       The equivalent Chameleon service which dictates the ledger it will post to.
 *       <p>
 *         (See OPSERVM.svkey also xrefs CHG_CHARGES.ncode)
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
 *       <A HREF="#getChaserv()">
 *           getChaserv
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setChaserv(java.lang.String)">
 *           setChaserv (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>billind</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       whether this charge has been processed by the billing run and sent to an invoice.
 *       <p>
 *         Set to 'n' when creating charge. 'n' = not yet billed.
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
 *       <A HREF="#getBillind()">
 *           getBillind
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setBillind(java.lang.String)">
 *           setBillind (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>billdat</B></TD>
 *   <TD ALIGN="left" VALIGN="top">Date</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       The date on which the charge was raised.
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
 *       <A HREF="#getBilldat()">
 *           getBilldat
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setBilldat(com.cmgwds.eppix.util.Date)">
 *           setBilldat (Date)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>cost</B></TD>
 *   <TD ALIGN="left" VALIGN="top">BigDecimal</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       The cost to the Service provider or Network Operator.
 *       <p>
 *         Based on opservm.svcost (or opservm.cost?) but set at the time the charge is raised.
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
 *       <A HREF="#getCost()">
 *           getCost
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setCost(java.math.BigDecimal)">
 *           setCost (BigDecimal)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>charge</B></TD>
 *   <TD ALIGN="left" VALIGN="top">BigDecimal</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       The charge being incurred by the subscriber.
 *       <p>
 *         +ve values are charges. -ve values are discounts/rebates. Based on opservm.price or calculated/entered through eppix.
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
 *       <A HREF="#getCharge()">
 *           getCharge
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setCharge(java.math.BigDecimal)">
 *           setCharge (BigDecimal)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>sparech</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Determines what the charge is made for: call or service charges.
 *       <p>
 *         Also used in determining the sequence on the invoice.
 *       </p>
 *       <p>
 *         The data is composed of various hardcodes.
 *       </p>
 *       <p>
 *         CFADDITIONAL = additional charge record CFIXEDCHARGEDII = fixed charge
 *       </p>
 *       <p>
 *         equipment charge [1,30] 30 'E's)
 *       </p>
 *       <p>
 *         Call Charges [/1,30] [1,12] "CCCCCCCCCCCC" (ie 12 'C's) [/1,12] [13,?]start date for the group of calls [/13,?] [?,?]end
 *         date for the group of calls
 *       </p>
 *       <p>
 *         (Unknown originator): [/?,?] [1,3] "CFA" [/1,3] [5,12]Todays date [/5,12] [17,20]"B&lt;service type&gt;D" [/17,20]
 *         [27,30]&lt;service code&gt;
 *       </p>
 *       <p>
 *         Calls Fixed Charges: [/27,30] [1,3] "CFF" [/1,3] [5,12]Todays date [/5,12] [17,20]"B&lt;service type&gt;D" [/17,20]
 *         [27,30]&lt;service code&gt;
 *       </p>
 *       <p>
 *         Credit [/27,30] [1,6] "CREDIT"
 *       </p>
 *       <p>
 *         Fixed [/1,6] [1,6] "CFIXED"
 *       </p>
 *       <p>
 *         Additional Charge [/1,6] [1,6] "DADDED" Msisdn swap additional charges [/1,6] [1,16] "CFADDITIONAL" [/1,16] [17,20]&lt;event
 *         code&gt; [/17,20] [27,30]&lt;service code&gt;
 *       </p>
 *       <p>
 *         tariff migration [/27,30] [1,16] "CFADDITIONAL" [/1,16] [17,20]"BTN" [/17,20] [27,30]"TSSN"
 *       </p>
 *       <p>
 *         Usage Discount [/27,30] [1,3] "DIS" [/1,3] [5,12]Todays date [/5,12] [17]&lt;dir_discount_type&gt; [/17]
 *         [20-23]&lt;dir_discount_ref&gt; [/20-23] [26-30]&lt;dir_disc_rule_num&gt;
 *       </p>
 *       <p>
 *         Usage Surcharge (from the usage discount run) [1,3] "SUR" [5,12]Todays date [17]&lt;dir_discount_type&gt;
 *         [20-23]&lt;dir_discount_ref&gt; [26-30]&lt;dir_disc_rule_num&gt; [/26-30]
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
 *       <A HREF="#getSparech()">
 *           getSparech
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setSparech(java.lang.String)">
 *           setSparech (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>invoiceNo</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Holds the generated invoice number.
 *       <p>
 *         Null till billing runs.
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
 *       <A HREF="#getInvoiceNo()">
 *           getInvoiceNo
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setInvoiceNo(java.lang.String)">
 *           setInvoiceNo (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>twinbillNo</B></TD>
 *   <TD ALIGN="left" VALIGN="top">Short</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Which of the subscribers bills this goes on.
 *       <p>
 *         Introduced in vas phase 2 to cover twinbill (etc) which allow a subscriber to separate his charges onto several
 *         invoices. 0 is the original/default invoice that goes to the customer. Higher numbers are additional invoices produced
 *         by a twinbill value added service (see vas_active_service).
 *       </p>
 *       <p>
 *         Call charges: To the bill defined for the msisdn (see vam_twinbill_no). Service charges: (includes subscription, activation
 *         and deactivation charges) to the bill defined for the service (see vas_twinbill_no). Other charges: (additional charges
 *         that are not related to a particular service) always written to twinbill 0.
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
 *       <A HREF="#getTwinbillNo()">
 *           getTwinbillNo
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setTwinbillNo(java.lang.Short)">
 *           setTwinbillNo (Short)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>vatamt</B></TD>
 *   <TD ALIGN="left" VALIGN="top">BigDecimal</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       The VAT amount added to charge.
 *       <p>
 *         Null till billing run.
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
 *       <A HREF="#getVatamt()">
 *           getVatamt
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setVatamt(java.math.BigDecimal)">
 *           setVatamt (BigDecimal)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>vatrate</B></TD>
 *   <TD ALIGN="left" VALIGN="top">BigDecimal</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       The Vat rate applied to service.
 *       <p>
 *         Null till billing run.
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
 *       <A HREF="#getVatrate()">
 *           getVatrate
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setVatrate(java.math.BigDecimal)">
 *           setVatrate (BigDecimal)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>cycleNo</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       The cycle on which the service was billed.
 *       <p>
 *         Null till billing run.
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
 *       <A HREF="#getCycleNo()">
 *           getCycleNo
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setCycleNo(java.lang.String)">
 *           setCycleNo (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>vatcode</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       The VAT code applied to the service.
 *       <p>
 *         Null till billing run.
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
 *       <A HREF="#getVatcode()">
 *           getVatcode
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setVatcode(java.lang.String)">
 *           setVatcode (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>startPeriod</B></TD>
 *   <TD ALIGN="left" VALIGN="top">Date</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Null till billing run.
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
 *       <A HREF="#getStartPeriod()">
 *           getStartPeriod
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setStartPeriod(com.cmgwds.eppix.util.Date)">
 *           setStartPeriod (Date)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>endPeriod</B></TD>
 *   <TD ALIGN="left" VALIGN="top">Date</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Null till billing run.
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
 *       <A HREF="#getEndPeriod()">
 *           getEndPeriod
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setEndPeriod(com.cmgwds.eppix.util.Date)">
 *           setEndPeriod (Date)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>batchRunNum</B></TD>
 *   <TD ALIGN="left" VALIGN="top">Integer</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Only used for records that are written by a batch process.
 *       <p>
 *         Uniquely identifies the run that created it. Provided as a mechanism for 'rolling back' a batch process that has
 *         failed. As a secondary effect it provides an additional level of 'audit' information. When written by other processes
 *         this field is null.
 *       </p>
 *       <p>
 *         In GUI phase II only the usage discount run uses it.
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
 *       <A HREF="#getBatchRunNum()">
 *           getBatchRunNum
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setBatchRunNum(java.lang.Integer)">
 *           setBatchRunNum (Integer)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>timestamp</B></TD>
 *   <TD ALIGN="left" VALIGN="top">DateTime</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       null
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
 *       <A HREF="#getTimestamp()">
 *           getTimestamp
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setTimestamp(com.cmgwds.eppix.util.DateTime)">
 *           setTimestamp (DateTime)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>currencyCharge</B></TD>
 *   <TD ALIGN="left" VALIGN="top">BigDecimal</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Value of charge billed in customers currency
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
 *       <A HREF="#getCurrencyCharge()">
 *           getCurrencyCharge
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setCurrencyCharge(java.math.BigDecimal)">
 *           setCurrencyCharge (BigDecimal)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>exchangeRate</B></TD>
 *   <TD ALIGN="left" VALIGN="top">BigDecimal</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Exhange rate used to convert to customers currency
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
 *       <A HREF="#getExchangeRate()">
 *           getExchangeRate
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setExchangeRate(java.math.BigDecimal)">
 *           setExchangeRate (BigDecimal)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>exchOperator</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Mathematical operator used to calculate currency amount
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
 *       <A HREF="#getExchOperator()">
 *           getExchOperator
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setExchOperator(java.lang.String)">
 *           setExchOperator (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>chargeClassId</B></TD>
 *   <TD ALIGN="left" VALIGN="top">Integer</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Discount related charge class field
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
 *       <A HREF="#getChargeClassId()">
 *           getChargeClassId
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setChargeClassId(java.lang.Integer)">
 *           setChargeClassId (Integer)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>technology</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       The technology of the service - Mobile / Fixed Wire / etc.
 *       <p>
 *         Changed to char(6) not null for version 6.00
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
 *       <A HREF="#getTechnology()">
 *           getTechnology
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setTechnology(java.lang.String)">
 *           setTechnology (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>packge</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       The package that this charge relates to via the service
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
 *       <A HREF="#getPackge()">
 *           getPackge
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setPackge(java.lang.String)">
 *           setPackge (String)
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


 * @see BillCccccyyyymmdd
 *
 * @author
 * @version $Revision: $
 *
 * @since $jdk$
 */
public class BillCccccyyyymmddDMO
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
      FIELD_TYPE_INTEGER /* std public attribute: billId  */,
      FIELD_TYPE_INTEGER /* std public attribute: subscriberId  */,
      FIELD_TYPE_STRING /* std public attribute: handset  */,
      FIELD_TYPE_STRING /* std public attribute: chaserv  */,
      FIELD_TYPE_STRING /* std public attribute: billind  */,
      FIELD_TYPE_DATEONLY /* std public attribute: billdat  */,
      FIELD_TYPE_BIGDECIMAL /* std public attribute: cost  */,
      FIELD_TYPE_BIGDECIMAL /* std public attribute: charge  */,
      FIELD_TYPE_STRING /* std public attribute: sparech  */,
      FIELD_TYPE_STRING /* std public attribute: invoiceNo  */,
      FIELD_TYPE_SHORT /* std public attribute: twinbillNo  */,
      FIELD_TYPE_BIGDECIMAL /* std public attribute: vatamt  */,
      FIELD_TYPE_BIGDECIMAL /* std public attribute: vatrate  */,
      FIELD_TYPE_STRING /* std public attribute: cycleNo  */,
      FIELD_TYPE_STRING /* std public attribute: vatcode  */,
      FIELD_TYPE_DATEONLY /* std public attribute: startPeriod  */,
      FIELD_TYPE_DATEONLY /* std public attribute: endPeriod  */,
      FIELD_TYPE_INTEGER /* std public attribute: batchRunNum  */,
      FIELD_TYPE_DATETIME /* std public attribute: timestamp  */,
      FIELD_TYPE_BIGDECIMAL /* std public attribute: currencyCharge  */,
      FIELD_TYPE_BIGDECIMAL /* std public attribute: exchangeRate  */,
      FIELD_TYPE_STRING /* std public attribute: exchOperator  */,
      FIELD_TYPE_INTEGER /* std public attribute: chargeClassId  */,
      FIELD_TYPE_STRING /* std public attribute: technology  */,
      FIELD_TYPE_STRING /* std public attribute: packge  */
    };

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int billIdFilter = 0; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int subscriberIdFilter = 1; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int handsetFilter = 2; // filter index
  private static final int handsetSize = 15; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int chaservFilter = 3; // filter index
  private static final int chaservSize = 20; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int billindFilter = 4; // filter index
  private static final int billindSize = 1; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int billdatFilter = 5; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int costFilter = 6; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int chargeFilter = 7; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int sparechFilter = 8; // filter index
  private static final int sparechSize = 30; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int invoiceNoFilter = 9; // filter index
  private static final int invoiceNoSize = 10; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int twinbillNoFilter = 10; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int vatamtFilter = 11; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int vatrateFilter = 12; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int cycleNoFilter = 13; // filter index
  private static final int cycleNoSize = 5; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int vatcodeFilter = 14; // filter index
  private static final int vatcodeSize = 3; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int startPeriodFilter = 15; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int endPeriodFilter = 16; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int batchRunNumFilter = 17; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int timestampFilter = 18; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int currencyChargeFilter = 19; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int exchangeRateFilter = 20; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int exchOperatorFilter = 21; // filter index
  private static final int exchOperatorSize = 1; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int chargeClassIdFilter = 22; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int technologyFilter = 23; // filter index
  private static final int technologySize = 6; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int packgeFilter = 24; // filter index
  private static final int packgeSize = 5; // field size

  protected static final int[] fieldSizes = new int[]{
		0,
		0,
		handsetSize,
		chaservSize,
		billindSize,
		0,
		0,
		0,
		sparechSize,
		0,
		0,
		0,
		cycleNoSize,
		vatcodeSize,
		0,
		0,
		0,
		0,
		0,
		0,
		exchOperatorSize,
		0,
		technologySize,
		packgeSize
		};
  
  protected int[] fieldSizes() {
		// TODO Auto-generated method stub
		return fieldSizes;
	}
  
  //~ Instance variables /////////////////////////////////////////////////////

  private BigDecimal charge; // Loaded from Schema
  private BigDecimal cost; // Loaded from Schema
  private BigDecimal currencyCharge; // Loaded from Schema
  private BigDecimal exchangeRate; // Loaded from Schema
  private BigDecimal vatamt; // Loaded from Schema
  private BigDecimal vatrate; // Loaded from Schema
  private Date billdat; // Loaded from Schema
  private Date endPeriod; // Loaded from Schema
  private Date startPeriod; // Loaded from Schema
  private DateTime timestamp; // Loaded from Schema
  private Integer batchRunNum; // Loaded from Schema

  //---------------------
  // Field declarations
  //---------------------
  // all attributes
  private Integer billId; // Loaded from Schema
  private Integer chargeClassId; // Loaded from Schema
  private Integer subscriberId; // Loaded from Schema
  private Short twinbillNo; // Loaded from Schema
  private String billind; // Loaded from Schema
  private String chaserv; // Loaded from Schema
  private String cycleNo; // Loaded from Schema
  private String exchOperator; // Loaded from Schema
  private String handset; // Loaded from Schema
  private String invoiceNo; // Loaded from Schema
  private String packge; // Loaded from Schema
  private String sparech; // Loaded from Schema
  private String technology; // Loaded from Schema
  private String vatcode; // Loaded from Schema

  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new BillCccccyyyymmddDMO object.
   */
  public BillCccccyyyymmddDMO(  ) {
  }

  // Constructor - taking public attributes
  /**
   * Creates a new BillCccccyyyymmddDMO object.
   *
   * @param billId DOCUMENT ME!
   * @param subscriberId DOCUMENT ME!
   * @param handset DOCUMENT ME!
   * @param chaserv DOCUMENT ME!
   * @param billind DOCUMENT ME!
   * @param billdat DOCUMENT ME!
   * @param cost DOCUMENT ME!
   * @param charge DOCUMENT ME!
   * @param sparech DOCUMENT ME!
   * @param invoiceNo DOCUMENT ME!
   * @param twinbillNo DOCUMENT ME!
   * @param vatamt DOCUMENT ME!
   * @param vatrate DOCUMENT ME!
   * @param cycleNo DOCUMENT ME!
   * @param vatcode DOCUMENT ME!
   * @param startPeriod DOCUMENT ME!
   * @param endPeriod DOCUMENT ME!
   * @param batchRunNum DOCUMENT ME!
   * @param timestamp DOCUMENT ME!
   * @param currencyCharge DOCUMENT ME!
   * @param exchangeRate DOCUMENT ME!
   * @param exchOperator DOCUMENT ME!
   * @param chargeClassId DOCUMENT ME!
   * @param technology DOCUMENT ME!
   * @param packge DOCUMENT ME!
   */
  public BillCccccyyyymmddDMO( 
    final Integer    billId,
    final Integer    subscriberId,
    final String     handset,
    final String     chaserv,
    final String     billind,
    final Date       billdat,
    final BigDecimal cost,
    final BigDecimal charge,
    final String     sparech,
    final String     invoiceNo,
    final Short      twinbillNo,
    final BigDecimal vatamt,
    final BigDecimal vatrate,
    final String     cycleNo,
    final String     vatcode,
    final Date       startPeriod,
    final Date       endPeriod,
    final Integer    batchRunNum,
    final DateTime   timestamp,
    final BigDecimal currencyCharge,
    final BigDecimal exchangeRate,
    final String     exchOperator,
    final Integer    chargeClassId,
    final String     technology,
    final String     packge ) {
    this.billId = billId;

    this.subscriberId = subscriberId;

    this.handset = handset;

    this.chaserv = chaserv;

    this.billind = billind;

    this.billdat = ( billdat != null ) ? new Date( billdat ) : null;

    this.cost = cost;

    this.charge = charge;

    this.sparech = sparech;

    this.invoiceNo = invoiceNo;

    this.twinbillNo = twinbillNo;

    this.vatamt = vatamt;

    this.vatrate = vatrate;

    this.cycleNo = cycleNo;

    this.vatcode = vatcode;

    this.startPeriod = ( startPeriod != null ) ? new Date( startPeriod ) : null;

    this.endPeriod = ( endPeriod != null ) ? new Date( endPeriod ) : null;

    this.batchRunNum = batchRunNum;

    this.timestamp = ( timestamp != null ) ? new DateTime( timestamp ) : null;

    this.currencyCharge = currencyCharge;

    this.exchangeRate = exchangeRate;

    this.exchOperator = exchOperator;

    this.chargeClassId = chargeClassId;

    this.technology = technology;

    this.packge = packge;
  }

  //~ Methods ////////////////////////////////////////////////////////////////

  // DBO method implementations ////////////////////////////////////////////////

  /**
   * Sets the generated key ( billId ) value.
   *
   * @param key The generated key value.
   */
  protected void generatedKey( final Integer key ) {
    this.billId = key;
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
    return new DAOArgs( 1 ).arg( this.billId );
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
      billId, subscriberId,
      ( handset == null ) ? null
                          : ( ( handset.length(  ) <= handsetSize ) ? handset
                                                                    : handset
      .substring( 0, handsetSize ) // auto trimmed to fit, if required.
       ),
      ( chaserv == null ) ? null
                          : ( ( chaserv.length(  ) <= chaservSize ) ? chaserv
                                                                    : chaserv
      .substring( 0, chaservSize ) // auto trimmed to fit, if required.
       ),
      ( billind == null ) ? null
                          : ( ( billind.length(  ) <= billindSize ) ? billind
                                                                    : billind
      .substring( 0, billindSize ) // auto trimmed to fit, if required.
       ), billdat, cost, charge,
      ( sparech == null ) ? null
                          : ( ( sparech.length(  ) <= sparechSize ) ? sparech
                                                                    : sparech
      .substring( 0, sparechSize ) // auto trimmed to fit, if required.
       ),
      ( invoiceNo == null ) ? null
                            : ( ( invoiceNo.length(  ) <= invoiceNoSize )
      ? invoiceNo
      : invoiceNo.substring( 0, invoiceNoSize ) // auto trimmed to fit, if required.
       ), twinbillNo, vatamt, vatrate,
      ( cycleNo == null ) ? null
                          : ( ( cycleNo.length(  ) <= cycleNoSize ) ? cycleNo
                                                                    : cycleNo
      .substring( 0, cycleNoSize ) // auto trimmed to fit, if required.
       ),
      ( vatcode == null ) ? null
                          : ( ( vatcode.length(  ) <= vatcodeSize ) ? vatcode
                                                                    : vatcode
      .substring( 0, vatcodeSize ) // auto trimmed to fit, if required.
       ), startPeriod, endPeriod, batchRunNum, timestamp, currencyCharge,
      exchangeRate,
      ( exchOperator == null ) ? null
                               : ( ( exchOperator.length(  ) <= exchOperatorSize )
      ? exchOperator
      : exchOperator.substring( 0, exchOperatorSize ) // auto trimmed to fit, if required.
       ), chargeClassId,
      ( technology == null ) ? null
                             : ( ( technology.length(  ) <= technologySize )
      ? technology
      : technology.substring( 0, technologySize ) // auto trimmed to fit, if required.
       ),
      ( packge == null ) ? null
                         : ( ( packge.length(  ) <= packgeSize ) ? packge
                                                                 : packge
      .substring( 0, packgeSize ) // auto trimmed to fit, if required.
       )
    };
  }

  /**
   * DOCUMENT ME!
   *
   * @param fields DOCUMENT ME!
   */
  protected void set( final Object[] fields ) {
    billId = (Integer) fields[0];
    subscriberId = (Integer) fields[1];
    handset = rtrim( (String) fields[2] );
    chaserv = rtrim( (String) fields[3] );
    billind = rtrim( (String) fields[4] );
    billdat = (Date) fields[5];
    cost = (BigDecimal) fields[6];
    charge = (BigDecimal) fields[7];
    sparech = rtrim( (String) fields[8] );
    invoiceNo = rtrim( (String) fields[9] );
    twinbillNo = (Short) fields[10];
    vatamt = (BigDecimal) fields[11];
    vatrate = (BigDecimal) fields[12];
    cycleNo = rtrim( (String) fields[13] );
    vatcode = rtrim( (String) fields[14] );
    startPeriod = (Date) fields[15];
    endPeriod = (Date) fields[16];
    batchRunNum = (Integer) fields[17];
    timestamp = (DateTime) fields[18];
    currencyCharge = (BigDecimal) fields[19];
    exchangeRate = (BigDecimal) fields[20];
    exchOperator = rtrim( (String) fields[21] );
    chargeClassId = (Integer) fields[22];
    technology = rtrim( (String) fields[23] );
    packge = rtrim( (String) fields[24] );
  }

  // Get methods ///////////////////////////////////////////////////////////////
  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public Integer getBillId(  ) {
    return billId;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public Integer getSubscriberId(  ) {
    return subscriberId;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getHandset(  ) {
    return handset;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getChaserv(  ) {
    return chaserv;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getBillind(  ) {
    return billind;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public Date getBilldat(  ) {
    return ( billdat != null ) ? new Date( billdat ) : null;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public BigDecimal getCost(  ) {
    return cost;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public BigDecimal getCharge(  ) {
    return charge;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getSparech(  ) {
    return sparech;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getInvoiceNo(  ) {
    return invoiceNo;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public Short getTwinbillNo(  ) {
    return twinbillNo;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public BigDecimal getVatamt(  ) {
    return vatamt;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public BigDecimal getVatrate(  ) {
    return vatrate;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getCycleNo(  ) {
    return cycleNo;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getVatcode(  ) {
    return vatcode;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public Date getStartPeriod(  ) {
    return ( startPeriod != null ) ? new Date( startPeriod ) : null;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public Date getEndPeriod(  ) {
    return ( endPeriod != null ) ? new Date( endPeriod ) : null;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public Integer getBatchRunNum(  ) {
    return batchRunNum;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public DateTime getTimestamp(  ) {
    return ( timestamp != null ) ? new DateTime( timestamp ) : null;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public BigDecimal getCurrencyCharge(  ) {
    return currencyCharge;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public BigDecimal getExchangeRate(  ) {
    return exchangeRate;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getExchOperator(  ) {
    return exchOperator;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public Integer getChargeClassId(  ) {
    return chargeClassId;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getTechnology(  ) {
    return technology;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getPackge(  ) {
    return packge;
  }

  // Setter methods ///////////////////////////////////////////////////////////////

  //
  // Master setter follows...
  //

  /**
   * Setter that takes all attributes
   */
  public void set( 
    final Integer    billId,
    final Integer    subscriberId,
    final String     handset,
    final String     chaserv,
    final String     billind,
    final Date       billdat,
    final BigDecimal cost,
    final BigDecimal charge,
    final String     sparech,
    final String     invoiceNo,
    final Short      twinbillNo,
    final BigDecimal vatamt,
    final BigDecimal vatrate,
    final String     cycleNo,
    final String     vatcode,
    final Date       startPeriod,
    final Date       endPeriod,
    final Integer    batchRunNum,
    final DateTime   timestamp,
    final BigDecimal currencyCharge,
    final BigDecimal exchangeRate,
    final String     exchOperator,
    final Integer    chargeClassId,
    final String     technology,
    final String     packge ) {
    this.billId = billId;
    this.subscriberId = subscriberId;
    this.handset = handset;
    this.chaserv = chaserv;
    this.billind = billind;
    this.billdat = ( billdat != null ) ? new Date( billdat ) : null;
    this.cost = cost;
    this.charge = charge;
    this.sparech = sparech;
    this.invoiceNo = invoiceNo;
    this.twinbillNo = twinbillNo;
    this.vatamt = vatamt;
    this.vatrate = vatrate;
    this.cycleNo = cycleNo;
    this.vatcode = vatcode;
    this.startPeriod = ( startPeriod != null ) ? new Date( startPeriod ) : null;
    this.endPeriod = ( endPeriod != null ) ? new Date( endPeriod ) : null;
    this.batchRunNum = batchRunNum;
    this.timestamp = ( timestamp != null ) ? new DateTime( timestamp ) : null;
    this.currencyCharge = currencyCharge;
    this.exchangeRate = exchangeRate;
    this.exchOperator = exchOperator;
    this.chargeClassId = chargeClassId;
    this.technology = technology;
    this.packge = packge;
  }

  //
  // Public access modifiers if any
  // (provided for attributes that are public in the analysis model)
  //    

  /**
  * Sets the BillId field.
  *
  * @param billId
  */
  public void setBillId( final Integer billId ) {
    this.billId = billId;
  }

  /**
  * Sets the SubscriberId field.
  *
  * @param subscriberId
  */
  public void setSubscriberId( final Integer subscriberId ) {
    this.subscriberId = subscriberId;
  }

  /**
  * Sets the Handset field.
  *
  * @param handset
  */
  public void setHandset( final String handset ) {
    this.handset = handset;
  }

  /**
  * Sets the Chaserv field.
  *
  * @param chaserv
  */
  public void setChaserv( final String chaserv ) {
    this.chaserv = chaserv;
  }

  /**
  * Sets the Billind field.
  *
  * @param billind
  */
  public void setBillind( final String billind ) {
    this.billind = billind;
  }

  /**
  * Sets the Billdat field.
  *
  * @param billdat
  */
  public void setBilldat( final Date billdat ) {
    this.billdat = ( billdat != null ) ? new Date( billdat ) : null;
  }

  /**
  * Sets the Cost field.
  *
  * @param cost
  */
  public void setCost( final BigDecimal cost ) {
    this.cost = cost;
  }

  /**
  * Sets the Cost field.
  *
  * @param cost
  */
  public void setCost( final double cost ) {
    this.cost = new BigDecimal( cost );
  }

  /**
  * Sets the Charge field.
  *
  * @param charge
  */
  public void setCharge( final BigDecimal charge ) {
    this.charge = charge;
  }

  /**
  * Sets the Charge field.
  *
  * @param charge
  */
  public void setCharge( final double charge ) {
    this.charge = new BigDecimal( charge );
  }

  /**
  * Sets the Sparech field.
  *
  * @param sparech
  */
  public void setSparech( final String sparech ) {
    this.sparech = sparech;
  }

  /**
  * Sets the InvoiceNo field.
  *
  * @param invoiceNo
  */
  public void setInvoiceNo( final String invoiceNo ) {
    this.invoiceNo = invoiceNo;
  }

  /**
  * Sets the TwinbillNo field.
  *
  * @param twinbillNo
  */
  public void setTwinbillNo( final Short twinbillNo ) {
    this.twinbillNo = twinbillNo;
  }

  /**
  * Sets the TwinbillNo field.
  *
  * @param twinbillNo
  */
  public void setTwinbillNo( final int twinbillNo ) {
    this.twinbillNo = Short.valueOf( (short) twinbillNo );
  }

  /**
  * Sets the Vatamt field.
  *
  * @param vatamt
  */
  public void setVatamt( final BigDecimal vatamt ) {
    this.vatamt = vatamt;
  }

  /**
  * Sets the Vatamt field.
  *
  * @param vatamt
  */
  public void setVatamt( final double vatamt ) {
    this.vatamt = new BigDecimal( vatamt );
  }

  /**
  * Sets the Vatrate field.
  *
  * @param vatrate
  */
  public void setVatrate( final BigDecimal vatrate ) {
    this.vatrate = vatrate;
  }

  /**
  * Sets the Vatrate field.
  *
  * @param vatrate
  */
  public void setVatrate( final double vatrate ) {
    this.vatrate = new BigDecimal( vatrate );
  }

  /**
  * Sets the CycleNo field.
  *
  * @param cycleNo
  */
  public void setCycleNo( final String cycleNo ) {
    this.cycleNo = cycleNo;
  }

  /**
  * Sets the Vatcode field.
  *
  * @param vatcode
  */
  public void setVatcode( final String vatcode ) {
    this.vatcode = vatcode;
  }

  /**
  * Sets the StartPeriod field.
  *
  * @param startPeriod
  */
  public void setStartPeriod( final Date startPeriod ) {
    this.startPeriod = ( startPeriod != null ) ? new Date( startPeriod ) : null;
  }

  /**
  * Sets the EndPeriod field.
  *
  * @param endPeriod
  */
  public void setEndPeriod( final Date endPeriod ) {
    this.endPeriod = ( endPeriod != null ) ? new Date( endPeriod ) : null;
  }

  /**
  * Sets the BatchRunNum field.
  *
  * @param batchRunNum
  */
  public void setBatchRunNum( final Integer batchRunNum ) {
    this.batchRunNum = batchRunNum;
  }

  /**
  * Sets the Timestamp field.
  *
  * @param timestamp
  */
  public void setTimestamp( final DateTime timestamp ) {
    this.timestamp = ( timestamp != null ) ? new DateTime( timestamp ) : null;
  }

  /**
  * Sets the CurrencyCharge field.
  *
  * @param currencyCharge
  */
  public void setCurrencyCharge( final BigDecimal currencyCharge ) {
    this.currencyCharge = currencyCharge;
  }

  /**
  * Sets the CurrencyCharge field.
  *
  * @param currencyCharge
  */
  public void setCurrencyCharge( final double currencyCharge ) {
    this.currencyCharge = new BigDecimal( currencyCharge );
  }

  /**
  * Sets the ExchangeRate field.
  *
  * @param exchangeRate
  */
  public void setExchangeRate( final BigDecimal exchangeRate ) {
    this.exchangeRate = exchangeRate;
  }

  /**
  * Sets the ExchangeRate field.
  *
  * @param exchangeRate
  */
  public void setExchangeRate( final double exchangeRate ) {
    this.exchangeRate = new BigDecimal( exchangeRate );
  }

  /**
  * Sets the ExchOperator field.
  *
  * @param exchOperator
  */
  public void setExchOperator( final String exchOperator ) {
    this.exchOperator = exchOperator;
  }

  /**
  * Sets the ChargeClassId field.
  *
  * @param chargeClassId
  */
  public void setChargeClassId( final Integer chargeClassId ) {
    this.chargeClassId = chargeClassId;
  }

  /**
  * Sets the Technology field.
  *
  * @param technology
  */
  public void setTechnology( final String technology ) {
    this.technology = technology;
  }

  /**
  * Sets the Packge field.
  *
  * @param packge
  */
  public void setPackge( final String packge ) {
    this.packge = packge;
  }

@Override
public String toString() {
	return "\nBillCccccyyyymmddDMO [\ncharge=" + charge + "\ncost=" + cost + "\ncurrencyCharge=" + currencyCharge
			+ "\nexchangeRate=" + exchangeRate + "\nvatamt=" + vatamt + "\nvatrate=" + vatrate + "\nbilldat=" + billdat
			+ "\nendPeriod=" + endPeriod + "\nstartPeriod=" + startPeriod + "\ntimestamp=" + timestamp
			+ "\nbatchRunNum=" + batchRunNum + "\nbillId=" + billId + "\nchargeClassId=" + chargeClassId
			+ "\nsubscriberId=" + subscriberId + "\ntwinbillNo=" + twinbillNo + "\nbillind=" + billind + "\nchaserv="
			+ chaserv + "\ncycleNo=" + cycleNo + "\nexchOperator=" + exchOperator + "\nhandset=" + handset
			+ "\ninvoiceNo=" + invoiceNo + "\npackge=" + packge + "\nsparech=" + sparech + "\ntechnology=" + technology
			+ "\nvatcode=" + vatcode + "]";
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
