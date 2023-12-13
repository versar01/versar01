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
 * A value object to carry the data for a VamActiveMsisdn.
 *
 *
 * <H3> A VamActiveMsisdn is: </H3>
 *
 * <!-- indent text -->
 * <TABLE BORDER="0" CELLPADDING="0" CELLSPACING="0">
 * <TR>
 * <TD WIDTH="25">&nbsp;</TD>
 * <TD>
 *
 * One entry for each msisdn taken by the subscriber.
 * <p>
 *   Shows the sim that the number applies to.
 
 Many of the fields are the same as on ACTIVE. On active they relate to the
 *   subscription or the primary msisdn. Here they relate to the particular msisdn in question.
 
 As with active table
 *   these records are retained once they reach \\\'permanent deactivation\\\' status. They are then deleted once a certain
 *   amount of time has passed. The amount of time is defined by system key ASWAIT&lt;network&gt; where network is D1, D2,
 *   etc.
 * </p>
 *
 * <!-- end indent text -->
 * </TD>
 * </TR>
 * </TABLE>
 *
 *
 * <H3> VamActiveMsisdn Value Object: </H3>
 *
 * <!-- indent text -->
 * <TABLE BORDER="0" CELLPADDING="0" CELLSPACING="0">
 * <TR>
 * <TD WIDTH="25">&nbsp;</TD>
 * <TD>
 *
 * <P>
 *     This is a value object (called a Data Model Object or 'DMO').
 *     It is used to pass the data for a vamActiveMsisdn into and out of the BASE module.
 *     Because it's purpose is to carry data into and out of the module it is visible outside the module.
 * </P>
 * <P>
 *     This value object carries the data for one vamActiveMsisdn. A vamActiveMsisdn is:
 * One entry for each msisdn taken by the subscriber.
 * </P>
 * <P>
 *     It corresponds to the business logic object VamActiveMsisdn which
 *     contains all the business behaviour of a vamActiveMsisdn but is not visible outside the
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
 *    This value object contains fields for all the details of a vamActiveMsisdn, namely:
 * </P>
 *


 * <P>
 *    <U>Fields to carry the Attributes of a vamActiveMsisdn:</U>
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
 *   <TD ALIGN="left" VALIGN="top"><B>vamSubscriberId</B></TD>
 *   <TD ALIGN="left" VALIGN="top">Integer</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Unique identifier for subscription.
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
 *       <A HREF="#getVamSubscriberId()">
 *           getVamSubscriberId
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setVamSubscriberId(java.lang.Integer)">
 *           setVamSubscriberId (Integer)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>vamSimNo</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       The msisdn is connected with this sim.
 *       <p>
 *         (Although it appears that an msisdn can apply to several sims this is not actually the case - in fact the network
 *         simply looks up the imsis of all a subscribers cards if he uses the msisdn of one of them).
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
 *       <A HREF="#getVamSimNo()">
 *           getVamSimNo
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setVamSimNo(java.lang.String)">
 *           setVamSimNo (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>vamMsisdnNo</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       The msisdn these details all apply to.
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
 *       <A HREF="#getVamMsisdnNo()">
 *           getVamMsisdnNo
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setVamMsisdnNo(java.lang.String)">
 *           setVamMsisdnNo (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>vamTwinbillNo</B></TD>
 *   <TD ALIGN="left" VALIGN="top">Short</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Which of the subscribers bills call charges for this msisdn go on.
 *       <p>
 *         When 0 the normal billing details hold. If not 0 it identifies the VAB_ALT_BILLING entry that holds the alternate
 *         billing details for this msisdn. Can only be set to a value that exists in VAB for this handset_no, or 0.
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
 *       <A HREF="#getVamTwinbillNo()">
 *           getVamTwinbillNo
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setVamTwinbillNo(java.lang.Short)">
 *           setVamTwinbillNo (Short)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>vamStatCode</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       The status of this msisdn.
 *       <p>
 *         [0 = though never stored this is used inside the programs to indicate a 'new' msisdn/service that has not been commited
 *         yet] 1 = active (all the other codes imply inactive) 4 = temporarily disconnected 6 = permanantly disconnected 7 =
 *         sim/msisdn swapped, remains unusable for ASWAITDn months 9 = activation requested but pending. (locks a new number
 *         while being worked on - eg: only has temporary existance).
 *       </p>
 *       <p>
 *         A table of relative occurrences can be found in a later section of this document.
 *       </p>
 *       <p>
 *         (used to be MSISDN_NOS.stat_code but that table has been superseded by this one and hence dropped). (the old field had some
 *         documents refer to other codes - but no other codes were actually used). [/0 = though never stored this is used inside
 *         the programs to indicate a 'new' msisdn/service that has not been commited yet]
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
 *       <A HREF="#getVamStatCode()">
 *           getVamStatCode
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setVamStatCode(java.lang.String)">
 *           setVamStatCode (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>vamConnectDate</B></TD>
 *   <TD ALIGN="left" VALIGN="top">Date</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       When this msisdn was last (re)activated for this sim.
 *       <p>
 *         See vam_abar_date for original activate date.
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
 *       <A HREF="#getVamConnectDate()">
 *           getVamConnectDate
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setVamConnectDate(com.cmgwds.eppix.util.Date)">
 *           setVamConnectDate (Date)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>vamDconnectDate</B></TD>
 *   <TD ALIGN="left" VALIGN="top">Date</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       When this msisdn was last deactivated from this sim whether temporary or permanent.
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
 *       <A HREF="#getVamDconnectDate()">
 *           getVamDconnectDate
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setVamDconnectDate(com.cmgwds.eppix.util.Date)">
 *           setVamDconnectDate (Date)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>vamInternTariff</B></TD>
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
 *       <A HREF="#getVamInternTariff()">
 *           getVamInternTariff
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setVamInternTariff(java.lang.String)">
 *           setVamInternTariff (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>vamContrTerminat</B></TD>
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
 *       <A HREF="#getVamContrTerminat()">
 *           getVamContrTerminat
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setVamContrTerminat(com.cmgwds.eppix.util.Date)">
 *           setVamContrTerminat (Date)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>vamContrPeriod</B></TD>
 *   <TD ALIGN="left" VALIGN="top">Short</TD>
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
 *       <A HREF="#getVamContrPeriod()">
 *           getVamContrPeriod
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setVamContrPeriod(java.lang.Short)">
 *           setVamContrPeriod (Short)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>vamTerminatNotif</B></TD>
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
 *       <A HREF="#getVamTerminatNotif()">
 *           getVamTerminatNotif
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setVamTerminatNotif(com.cmgwds.eppix.util.Date)">
 *           setVamTerminatNotif (Date)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>vamDirEntry</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Y = this msisdn is to appear in the service providers 'phone book' and directory enquiries information.
 *       <p>
 *         N = it isn't.
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
 *       <A HREF="#getVamDirEntry()">
 *           getVamDirEntry
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setVamDirEntry(java.lang.String)">
 *           setVamDirEntry (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>vamItemised</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Y = Produce an itemised invoice that includes this phone number.
 *       <p>
 *         N = Dont produce itemised invoicing for this number. Only setable if an itemised invoice service is taken up (ie: if
 *         there is no VAS_ACTIVE_SERVICE with a type of "II" then this field must be "N").
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
 *       <A HREF="#getVamItemised()">
 *           getVamItemised
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setVamItemised(java.lang.String)">
 *           setVamItemised (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>vamDepartment</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Used for assigning internal commission.
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
 *       <A HREF="#getVamDepartment()">
 *           getVamDepartment
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setVamDepartment(java.lang.String)">
 *           setVamDepartment (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>vamSalesman</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Used for assigning internal commission.
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
 *       <A HREF="#getVamSalesman()">
 *           getVamSalesman
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setVamSalesman(java.lang.String)">
 *           setVamSalesman (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>vamDealerId</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Which external dealer should get commission (if any).
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
 *       <A HREF="#getVamDealerId()">
 *           getVamDealerId
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setVamDealerId(java.lang.String)">
 *           setVamDealerId (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>vamAbarDate</B></TD>
 *   <TD ALIGN="left" VALIGN="top">Date</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Original activate date when this msisdn was activated on this sim.
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
 *       <A HREF="#getVamAbarDate()">
 *           getVamAbarDate
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setVamAbarDate(com.cmgwds.eppix.util.Date)">
 *           setVamAbarDate (Date)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>vamSubsSuffix</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Flags the status of the connection.
 *       <p>
 *         P = permanently deactivated. Null until then.
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
 *       <A HREF="#getVamSubsSuffix()">
 *           getVamSubsSuffix
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setVamSubsSuffix(java.lang.String)">
 *           setVamSubsSuffix (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>vamMessComment</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       On deconnection gets the (predefined) text description that goes with the deconnect reason.
 *       <p>
 *         Also gets 'reason descriptions' for some other events. Can be used to hold free text too at any time, but this is
 *         overwritten by above.
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
 *       <A HREF="#getVamMessComment()">
 *           getVamMessComment
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setVamMessComment(java.lang.String)">
 *           setVamMessComment (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>vamAirtimeNet</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Indicates the type of dealer commission in effect.
 *       <p>
 *         Only used by Motorola. 0 = 1 = 2 = 3 =
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
 *       <A HREF="#getVamAirtimeNet()">
 *           getVamAirtimeNet
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setVamAirtimeNet(java.lang.String)">
 *           setVamAirtimeNet (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>vamPrFlag</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Data protection code.
 *       <p>
 *         0 = Archive and store all call date. 1 = Strip last 3 digits of number diallled. 2 No archive of call data.
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
 *       <A HREF="#getVamPrFlag()">
 *           getVamPrFlag
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setVamPrFlag(java.lang.String)">
 *           setVamPrFlag (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>vamHierarchy</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Identifies primary SIM for twin cards.
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
 *       <A HREF="#getVamHierarchy()">
 *           getVamHierarchy
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setVamHierarchy(java.lang.String)">
 *           setVamHierarchy (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>vamMsisdnKnown</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       0 - unassigned
1 - assigned
2 - dual call - primary msisdn
3 - dual call - secondary msisdn
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
 *       <A HREF="#getVamMsisdnKnown()">
 *           getVamMsisdnKnown
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setVamMsisdnKnown(java.lang.String)">
 *           setVamMsisdnKnown (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>vamTariffChg</B></TD>
 *   <TD ALIGN="left" VALIGN="top">Date</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Date changed
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
 *       <A HREF="#getVamTariffChg()">
 *           getVamTariffChg
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setVamTariffChg(com.cmgwds.eppix.util.Date)">
 *           setVamTariffChg (Date)
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


 * @see VamActiveMsisdn
 *
 * @author
 * @version $Revision: $
 *
 * @since $jdk$
 */
public class VamActiveMsisdnDMO
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
      FIELD_TYPE_INTEGER /* std public attribute: vamSubscriberId  */,
      FIELD_TYPE_STRING /* std public attribute: vamSimNo  */,
      FIELD_TYPE_STRING /* std public attribute: vamMsisdnNo  */,
      FIELD_TYPE_SHORT /* std public attribute: vamTwinbillNo  */,
      FIELD_TYPE_STRING /* std public attribute: vamStatCode  */,
      FIELD_TYPE_DATEONLY /* std public attribute: vamConnectDate  */,
      FIELD_TYPE_DATEONLY /* std public attribute: vamDconnectDate  */,
      FIELD_TYPE_STRING /* std public attribute: vamInternTariff  */,
      FIELD_TYPE_DATEONLY /* std public attribute: vamContrTerminat  */,
      FIELD_TYPE_SHORT /* std public attribute: vamContrPeriod  */,
      FIELD_TYPE_DATEONLY /* std public attribute: vamTerminatNotif  */,
      FIELD_TYPE_STRING /* std public attribute: vamDirEntry  */,
      FIELD_TYPE_STRING /* std public attribute: vamItemised  */,
      FIELD_TYPE_STRING /* std public attribute: vamDepartment  */,
      FIELD_TYPE_STRING /* std public attribute: vamSalesman  */,
      FIELD_TYPE_STRING /* std public attribute: vamDealerId  */,
      FIELD_TYPE_DATEONLY /* std public attribute: vamAbarDate  */,
      FIELD_TYPE_STRING /* std public attribute: vamSubsSuffix  */,
      FIELD_TYPE_STRING /* std public attribute: vamMessComment  */,
      FIELD_TYPE_STRING /* std public attribute: vamAirtimeNet  */,
      FIELD_TYPE_STRING /* std public attribute: vamPrFlag  */,
      FIELD_TYPE_STRING /* std public attribute: vamHierarchy  */,
      FIELD_TYPE_STRING /* std public attribute: vamMsisdnKnown  */,
      FIELD_TYPE_DATEONLY /* std public attribute: vamTariffChg  */,
      FIELD_TYPE_STRING,
      FIELD_TYPE_STRING,
      FIELD_TYPE_STRING,
      FIELD_TYPE_STRING,
      FIELD_TYPE_STRING,
      FIELD_TYPE_STRING,
      FIELD_TYPE_DATEONLY,
      FIELD_TYPE_STRING,
      FIELD_TYPE_STRING,
      FIELD_TYPE_STRING,
      FIELD_TYPE_STRING,
      FIELD_TYPE_STRING,
      FIELD_TYPE_STRING
      
    };
  
  private final int[] fieldSizes = new int[] {
		  0,
		  vamSimNoSize,
		  vamMsisdnNoSize,
		  0,
		  vamStatCodeSize,
		  0,
		  0,
		  vamInternTariffSize,
		  0,
		  0,
		  0,
		  vamDirEntrySize,
		  vamItemisedSize,
		  vamDepartmentSize,
		  vamSalesmanSize,
		  vamDealerIdSize,
		  0,
		  vamSubsSuffixSize,
		  vamMessCommentSize,
		  vamAirtimeNetSize,
		  vamPrFlagSize,
		  vamHierarchySize,
		  vamMsisdnKnownSize,
		  0,
		  vamOrigProvIdSize,
		  vamImpProvIdSize,
		  vamOrigServProvSize,
		  vamImpServProvSize,
		  vamMsisdnTypeSize,
		  vamDummySize,
		  0,
		  vamExportedToSize,
		  vamAnalysis1Size,
		  vamAnalysis2Size,
		  vamAnalysis3Size,
		  vamAnalysis4Size,
		  vamAnalysis5Size
  };
      

  public int[] fieldSizes() {
  	return fieldSizes;
  }  

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int vamSubscriberIdFilter = 0; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int vamSimNoFilter = 1; // filter index
  private static final int vamSimNoSize = 14; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int vamMsisdnNoFilter = 2; // filter index
  private static final int vamMsisdnNoSize = 15; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int vamTwinbillNoFilter = 3; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int vamStatCodeFilter = 4; // filter index
  private static final int vamStatCodeSize = 1; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int vamConnectDateFilter = 5; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int vamDconnectDateFilter = 6; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int vamInternTariffFilter = 7; // filter index
  private static final int vamInternTariffSize = 20; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int vamContrTerminatFilter = 8; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int vamContrPeriodFilter = 9; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int vamTerminatNotifFilter = 10; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int vamDirEntryFilter = 11; // filter index
  private static final int vamDirEntrySize = 1; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int vamItemisedFilter = 12; // filter index
  private static final int vamItemisedSize = 1; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int vamDepartmentFilter = 13; // filter index
  private static final int vamDepartmentSize = 3; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int vamSalesmanFilter = 14; // filter index
  private static final int vamSalesmanSize = 10; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int vamDealerIdFilter = 15; // filter index
  private static final int vamDealerIdSize = 8; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int vamAbarDateFilter = 16; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int vamSubsSuffixFilter = 17; // filter index
  private static final int vamSubsSuffixSize = 1; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int vamMessCommentFilter = 18; // filter index
  private static final int vamMessCommentSize = 20; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int vamAirtimeNetFilter = 19; // filter index
  private static final int vamAirtimeNetSize = 1; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int vamPrFlagFilter = 20; // filter index
  private static final int vamPrFlagSize = 1; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int vamHierarchyFilter = 21; // filter index
  private static final int vamHierarchySize = 1; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int vamMsisdnKnownFilter = 22; // filter index
  private static final int vamMsisdnKnownSize = 1; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int vamTariffChgFilter = 23; // filter index
  
  /**
   * Added by SJ: 4/03/2009
   */
  public static final int vamOrigProvIdFilter = 24; // filter index
  private static final int vamOrigProvIdSize = 5; // field size
  
  public static final int vamImpProvIdFilter = 25; // filter index
  private static final int vamImpProvIdSize = 5; // field size
  
  public static final int vamOrigServProvFilter = 26; // filter index
  private static final int vamOrigServProvSize = 5; // field size
  
  public static final int vamImpServProvFilter = 27; // filter index
  private static final int vamImpServProvSize = 5; // field size
  
  public static final int vamMsisdnTypeFilter = 28; // filter index
  private static final int vamMsisdnTypeSize = 50; // field size
  
  public static final int vamDummyFilter = 29; // filter index
  private static final int vamDummySize = 1; // field size
  
  public static final int vamMsisdnExprtdFilter = 30; // filter index

  
  public static final int vamExportedToFilter = 31; // filter index
  private static final int vamExportedToSize = 5; // field size
  
  public static final int vamAnalysis1Filter = 32; // filter index
  private static final int vamAnalysis1Size = 30; // field size
  
  public static final int vamAnalysis2Filter = 33; // filter index
  private static final int vamAnalysis2Size = 30; // field size
  
  public static final int vamAnalysis3Filter = 34; // filter index
  private static final int vamAnalysis3Size = 30; // field size
  
  public static final int vamAnalysis4Filter = 35; // filter index
  private static final int vamAnalysis4Size = 30; // field size
  
  public static final int vamAnalysis5Filter = 36; // filter index
  private static final int vamAnalysis5Size = 30; // field size

  //~ Instance variables /////////////////////////////////////////////////////

  private Date vamAbarDate; // Loaded from Schema
  private Date vamConnectDate; // Loaded from Schema
  private Date vamContrTerminat; // Loaded from Schema
  private Date vamDconnectDate; // Loaded from Schema
  private Date vamTariffChg; // Loaded from Schema
  private Date vamTerminatNotif; // Loaded from Schema

  //---------------------
  // Field declarations
  //---------------------
  // all attributes
  private Integer vamSubscriberId; // Loaded from Schema
  private Short vamContrPeriod; // Loaded from Schema
  private Short vamTwinbillNo; // Loaded from Schema
  private String vamAirtimeNet; // Loaded from Schema
  private String vamDealerId; // Loaded from Schema
  private String vamDepartment; // Loaded from Schema
  private String vamDirEntry; // Loaded from Schema
  private String vamHierarchy; // Loaded from Schema
  private String vamInternTariff; // Loaded from Schema
  private String vamItemised; // Loaded from Schema
  private String vamMessComment; // Loaded from Schema
  private String vamMsisdnKnown; // Loaded from Schema
  private String vamMsisdnNo; // Loaded from Schema
  private String vamPrFlag; // Loaded from Schema
  private String vamSalesman; // Loaded from Schema
  private String vamSimNo; // Loaded from Schema
  private String vamStatCode; // Loaded from Schema
  private String vamSubsSuffix; // Loaded from Schema
  /*
   * Fields Added to DMO by SJ: 4 March 2009
  vam_orig_prov_id char(5) default 'M1' not null
  vam_imp_prov_id char(5) default 'M1' not null
  vam_orig_serv_prov char(5) default 'M-TEL' not null
  vam_imp_serv_prov char(5) default 'M-TEL' not null
  vam_msisdn_type char(50) default 'Normal' not null
  vam_dummy char(1) default 'N' not null
  vam_msisdn_exprtd date
  vam_exported_to char(5)
  vam_analysis_1 char(30)
  vam_analysis_2 char(30)
  vam_analysis_3 char(30)
  vam_analysis_4 char(30)
  vam_analysis_5 char(30)
  */
  
  private String vamOrigProvId;
  private String vamImpProvId;
  private String vamOrigServProv;
  private String vamImpServProv;
  private String vamMsisdnType;
  private String vamDummy;
  private Date vamMsisdnExprtd;
  private String vamExportedTo;
  private String vamAnalysis1;
  private String vamAnalysis2;
  private String vamAnalysis3;
  private String vamAnalysis4;
  private String vamAnalysis5;
   
    //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new VamActiveMsisdnDMO object.
   */
  public VamActiveMsisdnDMO(  ) {
  }

  // Constructor - taking public attributes
  /**
   * Creates a new VamActiveMsisdnDMO object.
   *
   * @param vamSubscriberId DOCUMENT ME!
   * @param vamSimNo DOCUMENT ME!
   * @param vamMsisdnNo DOCUMENT ME!
   * @param vamTwinbillNo DOCUMENT ME!
   * @param vamStatCode DOCUMENT ME!
   * @param vamConnectDate DOCUMENT ME!
   * @param vamDconnectDate DOCUMENT ME!
   * @param vamInternTariff DOCUMENT ME!
   * @param vamContrTerminat DOCUMENT ME!
   * @param vamContrPeriod DOCUMENT ME!
   * @param vamTerminatNotif DOCUMENT ME!
   * @param vamDirEntry DOCUMENT ME!
   * @param vamItemised DOCUMENT ME!
   * @param vamDepartment DOCUMENT ME!
   * @param vamSalesman DOCUMENT ME!
   * @param vamDealerId DOCUMENT ME!
   * @param vamAbarDate DOCUMENT ME!
   * @param vamSubsSuffix DOCUMENT ME!
   * @param vamMessComment DOCUMENT ME!
   * @param vamAirtimeNet DOCUMENT ME!
   * @param vamPrFlag DOCUMENT ME!
   * @param vamHierarchy DOCUMENT ME!
   * @param vamMsisdnKnown DOCUMENT ME!
   * @param vamTariffChg DOCUMENT ME!
   */
  public VamActiveMsisdnDMO( 
    final Integer vamSubscriberId,
    final String  vamSimNo,
    final String  vamMsisdnNo,
    final Short   vamTwinbillNo,
    final String  vamStatCode,
    final Date    vamConnectDate,
    final Date    vamDconnectDate,
    final String  vamInternTariff,
    final Date    vamContrTerminat,
    final Short   vamContrPeriod,
    final Date    vamTerminatNotif,
    final String  vamDirEntry,
    final String  vamItemised,
    final String  vamDepartment,
    final String  vamSalesman,
    final String  vamDealerId,
    final Date    vamAbarDate,
    final String  vamSubsSuffix,
    final String  vamMessComment,
    final String  vamAirtimeNet,
    final String  vamPrFlag,
    final String  vamHierarchy,
    final String  vamMsisdnKnown,
    final Date    vamTariffChg, 
    final String vamOrigProvId,
    final String vamImpProvId,
    final String vamOrigServProv,
    final String vamImpServProv,
    final String vamMsisdnType,
    final String vamDummy,
    final Date vamMsisdnExprtd,
    final String vamExportedTo,
    final String vamAnalysis1,
    final String vamAnalysis2,
    final String vamAnalysis3,
    final String vamAnalysis4,
    final String vamAnalysis5
  ) {
    this.vamSubscriberId = vamSubscriberId;

    this.vamSimNo = vamSimNo;

    this.vamMsisdnNo = vamMsisdnNo;

    this.vamTwinbillNo = vamTwinbillNo;

    this.vamStatCode = vamStatCode;

    this.vamConnectDate = ( vamConnectDate != null )
      ? new Date( vamConnectDate ) : null;

    this.vamDconnectDate = ( vamDconnectDate != null )
      ? new Date( vamDconnectDate ) : null;

    this.vamInternTariff = vamInternTariff;

    this.vamContrTerminat = ( vamContrTerminat != null )
      ? new Date( vamContrTerminat ) : null;

    this.vamContrPeriod = vamContrPeriod;

    this.vamTerminatNotif = ( vamTerminatNotif != null )
      ? new Date( vamTerminatNotif ) : null;

    this.vamDirEntry = vamDirEntry;

    this.vamItemised = vamItemised;

    this.vamDepartment = vamDepartment;

    this.vamSalesman = vamSalesman;

    this.vamDealerId = vamDealerId;

    this.vamAbarDate = ( vamAbarDate != null ) ? new Date( vamAbarDate ) : null;

    this.vamSubsSuffix = vamSubsSuffix;

    this.vamMessComment = vamMessComment;

    this.vamAirtimeNet = vamAirtimeNet;

    this.vamPrFlag = vamPrFlag;

    this.vamHierarchy = vamHierarchy;

    this.vamMsisdnKnown = vamMsisdnKnown;

    this.vamTariffChg = ( vamTariffChg != null ) ? new Date( vamTariffChg )
                                                 : null;
    
    this.vamOrigProvId = vamOrigProvId;
    this.vamImpProvId = vamImpProvId;
    this.vamOrigServProv = vamOrigServProv;
    this.vamImpServProv = vamImpServProv;
    this.vamMsisdnType = vamMsisdnType;
    this.vamDummy = vamDummy;
    this.vamMsisdnExprtd = ( vamMsisdnExprtd != null ) ? new Date( vamMsisdnExprtd ): null;
    this.vamExportedTo = vamExportedTo;
    this.vamAnalysis1 = vamAnalysis1;
    this.vamAnalysis2 = vamAnalysis2;
    this.vamAnalysis3 = vamAnalysis3;
    this.vamAnalysis4 = vamAnalysis4;
    this.vamAnalysis5 = vamAnalysis5;
  }

  //~ Methods ////////////////////////////////////////////////////////////////

  // DBO method implementations ////////////////////////////////////////////////

  /**
   * Not used by this class.
   *
   */
  protected void generatedKey( final Integer key ) {
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
    return new DAOArgs( 1 ).arg( ( this.vamMsisdnNo == null ) ? null
                                                              : this.vamMsisdnNo
      .trim(  ) );
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
      vamSubscriberId,
      ( vamSimNo == null ) ? null
                           : ( ( vamSimNo.length(  ) <= vamSimNoSize )
      ? vamSimNo
      : vamSimNo.substring( 0, vamSimNoSize ) // auto trimmed to fit, if required.
       ),
      ( vamMsisdnNo == null ) ? null
                              : ( ( vamMsisdnNo.length(  ) <= vamMsisdnNoSize )
      ? vamMsisdnNo
      : vamMsisdnNo.substring( 0, vamMsisdnNoSize ) // auto trimmed to fit, if required.
       ), vamTwinbillNo,
      ( vamStatCode == null ) ? null
                              : ( ( vamStatCode.length(  ) <= vamStatCodeSize )
      ? vamStatCode
      : vamStatCode.substring( 0, vamStatCodeSize ) // auto trimmed to fit, if required.
       ), vamConnectDate, vamDconnectDate,
      ( vamInternTariff == null ) ? null
                                  : ( ( vamInternTariff.length(  ) <= vamInternTariffSize )
      ? vamInternTariff
      : vamInternTariff.substring( 0, vamInternTariffSize ) // auto trimmed to fit, if required.
       ), vamContrTerminat, vamContrPeriod, vamTerminatNotif,
      ( vamDirEntry == null ) ? null
                              : ( ( vamDirEntry.length(  ) <= vamDirEntrySize )
      ? vamDirEntry
      : vamDirEntry.substring( 0, vamDirEntrySize ) // auto trimmed to fit, if required.
       ),
      ( vamItemised == null ) ? null
                              : ( ( vamItemised.length(  ) <= vamItemisedSize )
      ? vamItemised
      : vamItemised.substring( 0, vamItemisedSize ) // auto trimmed to fit, if required.
       ),
      ( vamDepartment == null ) ? null
                                : ( ( vamDepartment.length(  ) <= vamDepartmentSize )
      ? vamDepartment
      : vamDepartment.substring( 0, vamDepartmentSize ) // auto trimmed to fit, if required.
       ),
      ( vamSalesman == null ) ? null
                              : ( ( vamSalesman.length(  ) <= vamSalesmanSize )
      ? vamSalesman
      : vamSalesman.substring( 0, vamSalesmanSize ) // auto trimmed to fit, if required.
       ),
      ( vamDealerId == null ) ? null
                              : ( ( vamDealerId.length(  ) <= vamDealerIdSize )
      ? vamDealerId
      : vamDealerId.substring( 0, vamDealerIdSize ) // auto trimmed to fit, if required.
       ), vamAbarDate,
      ( vamSubsSuffix == null ) ? null
                                : ( ( vamSubsSuffix.length(  ) <= vamSubsSuffixSize )
      ? vamSubsSuffix
      : vamSubsSuffix.substring( 0, vamSubsSuffixSize ) // auto trimmed to fit, if required.
       ),
      ( vamMessComment == null ) ? null
                                 : ( ( vamMessComment.length(  ) <= vamMessCommentSize )
      ? vamMessComment
      : vamMessComment.substring( 0, vamMessCommentSize ) // auto trimmed to fit, if required.
       ),
      ( vamAirtimeNet == null ) ? null
                                : ( ( vamAirtimeNet.length(  ) <= vamAirtimeNetSize )
      ? vamAirtimeNet
      : vamAirtimeNet.substring( 0, vamAirtimeNetSize ) // auto trimmed to fit, if required.
       ),
      ( vamPrFlag == null ) ? null
                            : ( ( vamPrFlag.length(  ) <= vamPrFlagSize )
      ? vamPrFlag
      : vamPrFlag.substring( 0, vamPrFlagSize ) // auto trimmed to fit, if required.
       ),
      ( vamHierarchy == null ) ? null
                               : ( ( vamHierarchy.length(  ) <= vamHierarchySize )
      ? vamHierarchy
      : vamHierarchy.substring( 0, vamHierarchySize ) // auto trimmed to fit, if required.
       ),
      ( vamMsisdnKnown == null ) ? null
                                 : ( ( vamMsisdnKnown.length(  ) <= vamMsisdnKnownSize )
      ? vamMsisdnKnown
      : vamMsisdnKnown.substring( 0, vamMsisdnKnownSize ) // auto trimmed to fit, if required.
       ), vamTariffChg,
       
       // Added by SJ
       
      (vamOrigProvId == null ) ? null
              : ( ( vamOrigProvId.length(  ) <= vamOrigProvIdSize )
            	      ? vamOrigProvId
            	      : vamOrigProvId.substring( 0, vamOrigProvIdSize )),
      (vamImpProvId == null ) ? null
              : ( ( vamImpProvId.length(  ) <= vamImpProvIdSize )
            	      ? vamImpProvId
            	      : vamImpProvId.substring( 0, vamImpProvIdSize )),
      (vamOrigServProv == null ) ? null
              : ( ( vamOrigServProv.length(  ) <= vamOrigServProvSize )
            	      ? vamOrigServProv
            	      : vamOrigServProv.substring( 0, vamOrigServProvSize )),
      (vamImpServProv == null ) ? null
              : ( ( vamImpServProv.length(  ) <= vamImpServProvSize )
            	      ? vamImpServProv
            	      : vamImpServProv.substring( 0, vamImpServProvSize )),
      (vamMsisdnType == null ) ? null
              : ( ( vamMsisdnType.length(  ) <= vamMsisdnTypeSize )
            	      ? vamMsisdnType
            	      : vamMsisdnType.substring( 0, vamMsisdnTypeSize )),
      (vamDummy == null ) ? null
              : ( ( vamDummy.length(  ) <= vamDummySize )
            	      ? vamDummy
            	      : vamDummy.substring( 0, vamDummySize )),
      vamMsisdnExprtd,
      (vamExportedTo == null ) ? null
              : ( ( vamExportedTo.length(  ) <= vamExportedToSize )
            	      ? vamExportedTo
            	      : vamExportedTo.substring( 0, vamExportedToSize )),
      (vamAnalysis1 == null ) ? null
              : ( ( vamAnalysis1.length(  ) <= vamAnalysis1Size )
            	      ? vamAnalysis1
            	      : vamAnalysis1.substring( 0, vamAnalysis1Size )),
      (vamAnalysis2 == null ) ? null
              : ( ( vamAnalysis2.length(  ) <= vamAnalysis2Size )
            	      ? vamAnalysis2
            	      : vamAnalysis2.substring( 0, vamAnalysis2Size )),
      (vamAnalysis3 == null ) ? null
              : ( ( vamAnalysis3.length(  ) <= vamAnalysis3Size )
            	      ? vamAnalysis3
            	      : vamAnalysis3.substring( 0, vamAnalysis3Size )),
      (vamAnalysis4 == null ) ? null
              : ( ( vamAnalysis4.length(  ) <= vamAnalysis4Size )
            	      ? vamAnalysis4
            	      : vamAnalysis4.substring( 0, vamAnalysis4Size )),
      (vamAnalysis5 == null ) ? null
              : ( ( vamAnalysis5.length(  ) <= vamAnalysis5Size )
            	      ? vamAnalysis5
            	      : vamAnalysis5.substring( 0, vamAnalysis5Size ))
       
    };
  }

  /**
   * DOCUMENT ME!
   *
   * @param fields DOCUMENT ME!
   */
  protected void set( final Object[] fields ) {
    vamSubscriberId = (Integer) fields[0];
    vamSimNo = rtrim( (String) fields[1] );
    vamMsisdnNo = rtrim( (String) fields[2] );
    vamTwinbillNo = (Short) fields[3];
    vamStatCode = rtrim( (String) fields[4] );
    vamConnectDate = (Date) fields[5];
    vamDconnectDate = (Date) fields[6];
    vamInternTariff = rtrim( (String) fields[7] );
    vamContrTerminat = (Date) fields[8];
    vamContrPeriod = (Short) fields[9];
    vamTerminatNotif = (Date) fields[10];
    vamDirEntry = rtrim( (String) fields[11] );
    vamItemised = rtrim( (String) fields[12] );
    vamDepartment = rtrim( (String) fields[13] );
    vamSalesman = rtrim( (String) fields[14] );
    vamDealerId = rtrim( (String) fields[15] );
    vamAbarDate = (Date) fields[16];
    vamSubsSuffix = rtrim( (String) fields[17] );
    vamMessComment = rtrim( (String) fields[18] );
    vamAirtimeNet = rtrim( (String) fields[19] );
    vamPrFlag = rtrim( (String) fields[20] );
    vamHierarchy = rtrim( (String) fields[21] );
    vamMsisdnKnown = rtrim( (String) fields[22] );
    vamTariffChg = (Date) fields[23];
    
    vamOrigProvId = rtrim( (String) fields[24] );
    vamImpProvId = rtrim( (String) fields[25] );
    vamOrigServProv = rtrim( (String) fields[26] );
    vamImpServProv = rtrim( (String) fields[27] );
    vamMsisdnType = rtrim( (String) fields[28] );
    vamDummy = rtrim( (String) fields[29] );
    vamMsisdnExprtd = (Date) fields[30];
    vamExportedTo = rtrim( (String) fields[31] );
    vamAnalysis1 = rtrim( (String) fields[32] );
    vamAnalysis2 = rtrim( (String) fields[33] );
    vamAnalysis3 = rtrim( (String) fields[34] );
    vamAnalysis4 = rtrim( (String) fields[35] );
    vamAnalysis5 = rtrim( (String) fields[36] );
  }

  // Get methods ///////////////////////////////////////////////////////////////
  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public Integer getVamSubscriberId(  ) {
    return vamSubscriberId;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getVamSimNo(  ) {
    return vamSimNo;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getVamMsisdnNo(  ) {
    return vamMsisdnNo;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public Short getVamTwinbillNo(  ) {
    return vamTwinbillNo;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getVamStatCode(  ) {
    return vamStatCode;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public Date getVamConnectDate(  ) {
    return ( vamConnectDate != null ) ? new Date( vamConnectDate ) : null;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public Date getVamDconnectDate(  ) {
    return ( vamDconnectDate != null ) ? new Date( vamDconnectDate ) : null;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getVamInternTariff(  ) {
    return vamInternTariff;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public Date getVamContrTerminat(  ) {
    return ( vamContrTerminat != null ) ? new Date( vamContrTerminat ) : null;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public Short getVamContrPeriod(  ) {
    return vamContrPeriod;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public Date getVamTerminatNotif(  ) {
    return ( vamTerminatNotif != null ) ? new Date( vamTerminatNotif ) : null;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getVamDirEntry(  ) {
    return vamDirEntry;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getVamItemised(  ) {
    return vamItemised;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getVamDepartment(  ) {
    return vamDepartment;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getVamSalesman(  ) {
    return vamSalesman;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getVamDealerId(  ) {
    return vamDealerId;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public Date getVamAbarDate(  ) {
    return ( vamAbarDate != null ) ? new Date( vamAbarDate ) : null;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getVamSubsSuffix(  ) {
    return vamSubsSuffix;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getVamMessComment(  ) {
    return vamMessComment;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getVamAirtimeNet(  ) {
    return vamAirtimeNet;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getVamPrFlag(  ) {
    return vamPrFlag;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getVamHierarchy(  ) {
    return vamHierarchy;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getVamMsisdnKnown(  ) {
    return vamMsisdnKnown;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public Date getVamTariffChg(  ) {
    return ( vamTariffChg != null ) ? new Date( vamTariffChg ) : null;
  }

  // Setter methods ///////////////////////////////////////////////////////////////

  //
  // Master setter follows...
  //

  /**
   * Setter that takes all attributes
   */
  public void set( 
    final Integer vamSubscriberId,
    final String  vamSimNo,
    final String  vamMsisdnNo,
    final Short   vamTwinbillNo,
    final String  vamStatCode,
    final Date    vamConnectDate,
    final Date    vamDconnectDate,
    final String  vamInternTariff,
    final Date    vamContrTerminat,
    final Short   vamContrPeriod,
    final Date    vamTerminatNotif,
    final String  vamDirEntry,
    final String  vamItemised,
    final String  vamDepartment,
    final String  vamSalesman,
    final String  vamDealerId,
    final Date    vamAbarDate,
    final String  vamSubsSuffix,
    final String  vamMessComment,
    final String  vamAirtimeNet,
    final String  vamPrFlag,
    final String  vamHierarchy,
    final String  vamMsisdnKnown,
    final Date    vamTariffChg, 
    final String vamOrigProvId,
    final String vamImpProvId,
    final String vamOrigServProv,
    final String vamImpServProv,
    final String vamMsisdnType,
    final String vamDummy,
    final Date vamMsisdnExprtd,
    final String vamExportedTo,
    final String vamAnalysis1,
    final String vamAnalysis2,
    final String vamAnalysis3,
    final String vamAnalysis4,
    final String vamAnalysis5
  
  ) {
    this.vamSubscriberId = vamSubscriberId;
    this.vamSimNo = vamSimNo;
    this.vamMsisdnNo = vamMsisdnNo;
    this.vamTwinbillNo = vamTwinbillNo;
    this.vamStatCode = vamStatCode;
    this.vamConnectDate = ( vamConnectDate != null )
      ? new Date( vamConnectDate ) : null;
    this.vamDconnectDate = ( vamDconnectDate != null )
      ? new Date( vamDconnectDate ) : null;
    this.vamInternTariff = vamInternTariff;
    this.vamContrTerminat = ( vamContrTerminat != null )
      ? new Date( vamContrTerminat ) : null;
    this.vamContrPeriod = vamContrPeriod;
    this.vamTerminatNotif = ( vamTerminatNotif != null )
      ? new Date( vamTerminatNotif ) : null;
    this.vamDirEntry = vamDirEntry;
    this.vamItemised = vamItemised;
    this.vamDepartment = vamDepartment;
    this.vamSalesman = vamSalesman;
    this.vamDealerId = vamDealerId;
    this.vamAbarDate = ( vamAbarDate != null ) ? new Date( vamAbarDate ) : null;
    this.vamSubsSuffix = vamSubsSuffix;
    this.vamMessComment = vamMessComment;
    this.vamAirtimeNet = vamAirtimeNet;
    this.vamPrFlag = vamPrFlag;
    this.vamHierarchy = vamHierarchy;
    this.vamMsisdnKnown = vamMsisdnKnown;
    this.vamTariffChg = ( vamTariffChg != null ) ? new Date( vamTariffChg )
                                                 : null;
    this.vamOrigProvId = vamOrigProvId;
    this.vamImpProvId = vamImpProvId;
    this.vamOrigServProv = vamOrigServProv;
    this.vamImpServProv = vamImpServProv;
    this.vamMsisdnType = vamMsisdnType;
    this.vamDummy = vamDummy;
    this.vamMsisdnExprtd = ( vamMsisdnExprtd != null ) ? new Date( vamMsisdnExprtd ): null;
    this.vamExportedTo = vamExportedTo;
    this.vamAnalysis1 = vamAnalysis1;
    this.vamAnalysis2 = vamAnalysis2;
    this.vamAnalysis3 = vamAnalysis3;
    this.vamAnalysis4 = vamAnalysis4;
    this.vamAnalysis5 = vamAnalysis5;
  }

  //
  // Public access modifiers if any
  // (provided for attributes that are public in the analysis model)
  //    

  /**
  * Sets the VamSubscriberId field.
  *
  * @param vamSubscriberId
  */
  public void setVamSubscriberId( final Integer vamSubscriberId ) {
    this.vamSubscriberId = vamSubscriberId;
  }

  /**
  * Sets the VamSimNo field.
  *
  * @param vamSimNo
  */
  public void setVamSimNo( final String vamSimNo ) {
    this.vamSimNo = getPadded(vamSimNo, vamSimNoFilter);
  }

  /**
  * Sets the VamMsisdnNo field.
  *
  * @param vamMsisdnNo
  */
  public void setVamMsisdnNo( final String vamMsisdnNo ) {
    this.vamMsisdnNo = getPadded(vamMsisdnNo, vamMsisdnNoFilter);
  }

  /**
  * Sets the VamTwinbillNo field.
  *
  * @param vamTwinbillNo
  */
  public void setVamTwinbillNo( final Short vamTwinbillNo ) {
    this.vamTwinbillNo = vamTwinbillNo;
  }

  /**
  * Sets the VamTwinbillNo field.
  *
  * @param vamTwinbillNo
  */
  public void setVamTwinbillNo( final int vamTwinbillNo ) {
    this.vamTwinbillNo = Short.valueOf(String.valueOf(vamTwinbillNo));
  }

  /**
  * Sets the VamStatCode field.
  *
  * @param vamStatCode
  */
  public void setVamStatCode( final String vamStatCode ) {
    this.vamStatCode = getPadded(vamStatCode, vamStatCodeFilter);
  }

  /**
  * Sets the VamConnectDate field.
  *
  * @param vamConnectDate
  */
  public void setVamConnectDate( final Date vamConnectDate ) {
    this.vamConnectDate = ( vamConnectDate != null )
      ? new Date( vamConnectDate ) : null;
  }

  /**
  * Sets the VamDconnectDate field.
  *
  * @param vamDconnectDate
  */
  public void setVamDconnectDate( final Date vamDconnectDate ) {
    this.vamDconnectDate = ( vamDconnectDate != null )
      ? new Date( vamDconnectDate ) : null;
  }

  /**
  * Sets the VamInternTariff field.
  *
  * @param vamInternTariff
  */
  public void setVamInternTariff( final String vamInternTariff ) {
    this.vamInternTariff = getPadded(vamInternTariff, vamInternTariffFilter);
  }

  /**
  * Sets the VamContrTerminat field.
  *
  * @param vamContrTerminat
  */
  public void setVamContrTerminat( final Date vamContrTerminat ) {
    this.vamContrTerminat = ( vamContrTerminat != null )
      ? new Date( vamContrTerminat ) : null;
  }

  /**
  * Sets the VamContrPeriod field.
  *
  * @param vamContrPeriod
  */
  public void setVamContrPeriod( final Short vamContrPeriod ) {
    this.vamContrPeriod = vamContrPeriod;
  }

  /**
  * Sets the VamContrPeriod field.
  *
  * @param vamContrPeriod
  */
  public void setVamContrPeriod( final int vamContrPeriod ) {
    this.vamContrPeriod = Short.valueOf(String.valueOf(vamContrPeriod));
  }

  /**
  * Sets the VamTerminatNotif field.
  *
  * @param vamTerminatNotif
  */
  public void setVamTerminatNotif( final Date vamTerminatNotif ) {
    this.vamTerminatNotif = ( vamTerminatNotif != null )
      ? new Date( vamTerminatNotif ) : null;
  }

  /**
  * Sets the VamDirEntry field.
  *
  * @param vamDirEntry
  */
  public void setVamDirEntry( final String vamDirEntry ) {
    this.vamDirEntry = getPadded(vamDirEntry, vamDirEntryFilter);
  }

  /**
  * Sets the VamItemised field.
  *
  * @param vamItemised
  */
  public void setVamItemised( final String vamItemised ) {
    this.vamItemised = getPadded(vamItemised, vamItemisedFilter);
  }

  /**
  * Sets the VamDepartment field.
  *
  * @param vamDepartment
  */
  public void setVamDepartment( final String vamDepartment ) {
    this.vamDepartment = getPadded(vamDepartment, vamDepartmentFilter);
  }

  /**
  * Sets the VamSalesman field.
  *
  * @param vamSalesman
  */
  public void setVamSalesman( final String vamSalesman ) {
    this.vamSalesman = getPadded(vamSalesman, vamSalesmanFilter);
  }

  /**
  * Sets the VamDealerId field.
  *
  * @param vamDealerId
  */
  public void setVamDealerId( final String vamDealerId ) {
    this.vamDealerId = getPadded(vamDealerId, vamDealerIdFilter);
  }

  /**
  * Sets the VamAbarDate field.
  *
  * @param vamAbarDate
  */
  public void setVamAbarDate( final Date vamAbarDate ) {
    this.vamAbarDate = ( vamAbarDate != null ) ? new Date( vamAbarDate ) : null;
  }

  /**
  * Sets the VamSubsSuffix field.
  *
  * @param vamSubsSuffix
  */
  public void setVamSubsSuffix( final String vamSubsSuffix ) {
    this.vamSubsSuffix = getPadded(vamSubsSuffix, vamSubsSuffixFilter);
  }

  /**
  * Sets the VamMessComment field.
  *
  * @param vamMessComment
  */
  public void setVamMessComment( final String vamMessComment ) {
    this.vamMessComment = getPadded(vamMessComment, vamMessCommentFilter);
  }

  /**
  * Sets the VamAirtimeNet field.
  *
  * @param vamAirtimeNet
  */
  public void setVamAirtimeNet( final String vamAirtimeNet ) {
    this.vamAirtimeNet = getPadded(vamAirtimeNet, vamAirtimeNetFilter);
  }

  /**
  * Sets the VamPrFlag field.
  *
  * @param vamPrFlag
  */
  public void setVamPrFlag( final String vamPrFlag ) {
    this.vamPrFlag = getPadded(vamPrFlag, vamPrFlagFilter);
  }

  /**
  * Sets the VamHierarchy field.
  *
  * @param vamHierarchy
  */
  public void setVamHierarchy( final String vamHierarchy ) {
    this.vamHierarchy = getPadded(vamHierarchy, vamHierarchyFilter);
  }

  /**
  * Sets the VamMsisdnKnown field.
  *
  * @param vamMsisdnKnown
  */
  public void setVamMsisdnKnown( final String vamMsisdnKnown ) {
    this.vamMsisdnKnown = getPadded(vamMsisdnKnown, vamMsisdnKnownFilter);
  }

  /**
  * Sets the VamTariffChg field.
  *
  * @param vamTariffChg
  */
  public void setVamTariffChg( final Date vamTariffChg ) {
    this.vamTariffChg = ( vamTariffChg != null ) ? new Date( vamTariffChg )
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
  
  public String getVamOrigProvId() {
		return vamOrigProvId;
	}

	public void setVamOrigProvId(String vamOrigProvId) {
		this.vamOrigProvId = getPadded(vamOrigProvId, vamOrigProvIdFilter);
	}

	public String getVamImpProvId() {
		return vamImpProvId;
	}

	public void setVamImpProvId(String vamImpProvId) {
		this.vamImpProvId = getPadded(vamImpProvId, vamImpProvIdFilter);
	}

	public String getVamOrigServProv() {
		return vamOrigServProv;
	}

	public void setVamOrigServProv(String vamOrigServProv) {
		this.vamOrigServProv = getPadded(vamOrigServProv, vamOrigServProvFilter);
	}

	public String getVamImpServProv() {
		return vamImpServProv;
	}

	public void setVamImpServProv(String vamImpServProv) {
		this.vamImpServProv = getPadded(vamImpServProv, vamImpServProvFilter);
	}

	public String getVamMsisdnType() {
		return vamMsisdnType;
	}

	public void setVamMsisdnType(String vamMsisdnType) {
		this.vamMsisdnType = getPadded(vamMsisdnType, vamMsisdnTypeFilter);
	}

	public String getVamDummy() {
		return vamDummy;
	}

	public void setVamDummy(String vamDummy) {
		this.vamDummy = getPadded(vamDummy, vamDummyFilter);
	}

	public Date getVamMsisdnExprtd() {
		return vamMsisdnExprtd;
	}

	public void setVamMsisdnExprtd(Date vamMsisdnExprtd) {
		this.vamMsisdnExprtd = ( vamMsisdnExprtd != null ) ? new Date( vamMsisdnExprtd )
        : null;
	}

	public String getVamExportedTo() {
		return vamExportedTo;
	}

	public void setVamExportedTo(String vamExportedTo) {
		this.vamExportedTo = getPadded(vamExportedTo, vamExportedToFilter);
	}

	public String getVamAnalysis1() {
		return vamAnalysis1;
	}

	public void setVamAnalysis1(String vamAnalysis1) {
		this.vamAnalysis1 = getPadded(vamAnalysis1, vamAnalysis1Filter);
	}

	public String getVamAnalysis2() {
		return vamAnalysis2;
	}

	public void setVamAnalysis2(String vamAnalysis2) {
		this.vamAnalysis2 = getPadded(vamAnalysis2, vamAnalysis2Filter);
	}

	public String getVamAnalysis3() {
		return vamAnalysis3;
	}

	public void setVamAnalysis3(String vamAnalysis3) {
		this.vamAnalysis3 = getPadded(vamAnalysis3, vamAnalysis3Filter);
	}

	public String getVamAnalysis4() {
		return vamAnalysis4;
	}

	public void setVamAnalysis4(String vamAnalysis4) {
		this.vamAnalysis4 = getPadded(vamAnalysis4, vamAnalysis4Filter);
	}

	public String getVamAnalysis5() {
		return vamAnalysis5;
	}

	public void setVamAnalysis5(String vamAnalysis5) {
		this.vamAnalysis5 = getPadded(vamAnalysis5, vamAnalysis5Filter);
	}

}
