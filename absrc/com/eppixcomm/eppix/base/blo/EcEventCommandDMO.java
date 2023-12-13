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
 * A value object to carry the data for an EcEventCommand.
 *
 *
 * <H3> An EcEventCommand is: </H3>
 *
 * <!-- indent text -->
 * <TABLE BORDER="0" CELLPADDING="0" CELLSPACING="0">
 * <TR>
 * <TD WIDTH="25">&nbsp;</TD>
 * <TD>
 *
 * This table contains list of all events, which need to be communicated from EPPIX to Network Elements as well as events that have been communicated, but were not successfully processed by MaP or the Network Elements.
 * <p>
 *   
 
 Related tables:
 @ECD_EVENT_CMD_DET
 @EA_EVENT_AUDIT
 @EAD_EVENT_AUD_DET
 * </p>
 *
 * <!-- end indent text -->
 * </TD>
 * </TR>
 * </TABLE>
 *
 *
 * <H3> EcEventCommand Value Object: </H3>
 *
 * <!-- indent text -->
 * <TABLE BORDER="0" CELLPADDING="0" CELLSPACING="0">
 * <TR>
 * <TD WIDTH="25">&nbsp;</TD>
 * <TD>
 *
 * <P>
 *     This is a value object (called a Data Model Object or 'DMO').
 *     It is used to pass the data for an ecEventCommand into and out of the BASE module.
 *     Because it's purpose is to carry data into and out of the module it is visible outside the module.
 * </P>
 * <P>
 *     This value object carries the data for one ecEventCommand. An ecEventCommand is:
 * This table contains list of all events, which need to be communicated from EPPIX to Network Elements as well as events that have been communicated, but were not successfully processed by MaP or the Network Elements.
 * </P>
 * <P>
 *     It corresponds to the business logic object EcEventCommand which
 *     contains all the business behaviour of an ecEventCommand but is not visible outside the
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
 *    This value object contains fields for all the details of an ecEventCommand, namely:
 * </P>
 *


 * <P>
 *    <U>Fields to carry the Attributes of an ecEventCommand:</U>
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
 *   <TD ALIGN="left" VALIGN="top"><B>ecCommand</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Unique Id for message
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
 *       <A HREF="#getEcCommand()">
 *           getEcCommand
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setEcCommand(java.lang.String)">
 *           setEcCommand (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>ecStatus</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Status of event
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
 *       <A HREF="#getEcStatus()">
 *           getEcStatus
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setEcStatus(java.lang.String)">
 *           setEcStatus (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>ecDate</B></TD>
 *   <TD ALIGN="left" VALIGN="top">Date</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Date of event
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
 *       <A HREF="#getEcDate()">
 *           getEcDate
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setEcDate(com.cmgwds.eppix.util.Date)">
 *           setEcDate (Date)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>ecTime</B></TD>
 *   <TD ALIGN="left" VALIGN="top">Short</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Time of event
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
 *       <A HREF="#getEcTime()">
 *           getEcTime
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setEcTime(java.lang.Short)">
 *           setEcTime (Short)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>ecMessage</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Message text
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
 *       <A HREF="#getEcMessage()">
 *           getEcMessage
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setEcMessage(java.lang.String)">
 *           setEcMessage (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>ecNetwork</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Network provider Id
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
 *       <A HREF="#getEcNetwork()">
 *           getEcNetwork
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setEcNetwork(java.lang.String)">
 *           setEcNetwork (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>ecType</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Event type
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
 *       <A HREF="#getEcType()">
 *           getEcType
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setEcType(java.lang.String)">
 *           setEcType (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>ecPriority</B></TD>
 *   <TD ALIGN="left" VALIGN="top">Short</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Event priority
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
 *       <A HREF="#getEcPriority()">
 *           getEcPriority
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setEcPriority(java.lang.Short)">
 *           setEcPriority (Short)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>ecSendSeq</B></TD>
 *   <TD ALIGN="left" VALIGN="top">Integer</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Sequence
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
 *       <A HREF="#getEcSendSeq()">
 *           getEcSendSeq
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setEcSendSeq(java.lang.Integer)">
 *           setEcSendSeq (Integer)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>ecSubscriberId</B></TD>
 *   <TD ALIGN="left" VALIGN="top">Integer</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Subscriber Id
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
 *       <A HREF="#getEcSubscriberId()">
 *           getEcSubscriberId
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setEcSubscriberId(java.lang.Integer)">
 *           setEcSubscriberId (Integer)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>ecMsisdn</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       MSISDN or MIN number  (renamed from ec_msisdn for version 6.
 *       <p>
 *         00)
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
 *       <A HREF="#getecMsisdn()">
 *           getecMsisdn
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setecMsisdn(java.lang.String)">
 *           setecMsisdn (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>ecSim</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       SIM or ESN number (renamed from ec_sim for version 6.
 *       <p>
 *         00)
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
 *       <A HREF="#getecSim()">
 *           getecSim
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setecSim(java.lang.String)">
 *           setecSim (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>ecOperator</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Generated by operator
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
 *       <A HREF="#getEcOperator()">
 *           getEcOperator
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setEcOperator(java.lang.String)">
 *           setEcOperator (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>ecTty</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Generated on terminal
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
 *       <A HREF="#getEcTty()">
 *           getEcTty
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setEcTty(java.lang.String)">
 *           setEcTty (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>ecTechnologyInd</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Holds the technology indicator  (Added for version 6.
 *       <p>
 *         00)
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
 *       <A HREF="#getEcTechnologyInd()">
 *           getEcTechnologyInd
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setEcTechnologyInd(java.lang.String)">
 *           setEcTechnologyInd (String)
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


 * @see EcEventCommand
 *
 * @author
 * @version $Revision: $
 *
 * @since $jdk$
 */
public class EcEventCommandDMO
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
      FIELD_TYPE_STRING /* std public attribute: ecCommand  */,
      FIELD_TYPE_STRING /* std public attribute: ecStatus  */,
      FIELD_TYPE_DATEONLY /* std public attribute: ecDate  */,
      FIELD_TYPE_SHORT /* std public attribute: ecTime  */,
      FIELD_TYPE_STRING /* std public attribute: ecMessage  */,
      FIELD_TYPE_STRING /* std public attribute: ecNetwork  */,
      FIELD_TYPE_STRING /* std public attribute: ecType  */,
      FIELD_TYPE_SHORT /* std public attribute: ecPriority  */,
      FIELD_TYPE_INTEGER /* std public attribute: ecSendSeq  */,
      FIELD_TYPE_INTEGER /* std public attribute: ecSubscriberId  */,
      FIELD_TYPE_STRING /* std public attribute: ecMsisdn  */,
      FIELD_TYPE_STRING /* std public attribute: ecSim  */,
      FIELD_TYPE_STRING /* std public attribute: ecOperator  */,
      FIELD_TYPE_STRING /* std public attribute: ecTty  */
//      ,FIELD_TYPE_STRING /* std public attribute: ecTechnologyInd  */
    };
  
  /**
  * TODO SJ Implement the array of field sizes
  *
  */
  private final int[] fieldSizes = new int[] {
		  ecCommandSize,
		  ecStatusSize,
		  0,
		  0,
		  ecMessageSize,
		  ecNetworkSize,
		  ecTypeSize,
		  0,
		  0,
		  0,
		  ecMsisdnSize,
		  ecSimSize,
		  ecOperatorSize,
		  ecTtySize
  };
      

  public int[] fieldSizes() {
  	return fieldSizes;
  }  

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int ecCommandFilter = 0; // filter index
  private static final int ecCommandSize = 16; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int ecStatusFilter = 1; // filter index
  private static final int ecStatusSize = 1; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int ecDateFilter = 2; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int ecTimeFilter = 3; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int ecMessageFilter = 4; // filter index
  private static final int ecMessageSize = 30; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int ecNetworkFilter = 5; // filter index
  private static final int ecNetworkSize = 5; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int ecTypeFilter = 6; // filter index
  private static final int ecTypeSize = 1; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int ecPriorityFilter = 7; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int ecSendSeqFilter = 8; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int ecSubscriberIdFilter = 9; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int ecMsisdnFilter = 10; // filter index
  private static final int ecMsisdnSize = 20; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int ecSimFilter = 11; // filter index
  private static final int ecSimSize = 25; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int ecOperatorFilter = 12; // filter index
  private static final int ecOperatorSize = 10; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int ecTtyFilter = 13; // filter index
  private static final int ecTtySize = 14; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
//  public static final int ecTechnologyIndFilter = 14; // filter index
//  private static final int ecTechnologyIndSize = 6; // field size

  //~ Instance variables /////////////////////////////////////////////////////

  private Date ecDate; // Loaded from Schema
  private Integer ecSendSeq; // Loaded from Schema
  private Integer ecSubscriberId; // Loaded from Schema
  private Short ecPriority; // Loaded from Schema
  private Short ecTime; // Loaded from Schema

  //---------------------
  // Field declarations
  //---------------------
  // all attributes
  private String ecCommand; // Loaded from Schema
  private String ecMsisdn; // Loaded from Schema
  private String ecMessage; // Loaded from Schema
  private String ecNetwork; // Loaded from Schema
  private String ecOperator; // Loaded from Schema
  private String ecSim; // Loaded from Schema
  private String ecStatus; // Loaded from Schema
//  private String ecTechnologyInd; // Loaded from Schema
  private String ecTty; // Loaded from Schema
  private String ecType; // Loaded from Schema

  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new EcEventCommandDMO object.
   */
  public EcEventCommandDMO(  ) {
  }

  // Constructor - taking public attributes
  /**
   * Creates a new EcEventCommandDMO object.
   *
   * @param ecCommand DOCUMENT ME!
   * @param ecStatus DOCUMENT ME!
   * @param ecDate DOCUMENT ME!
   * @param ecTime DOCUMENT ME!
   * @param ecMessage DOCUMENT ME!
   * @param ecNetwork DOCUMENT ME!
   * @param ecType DOCUMENT ME!
   * @param ecPriority DOCUMENT ME!
   * @param ecSendSeq DOCUMENT ME!
   * @param ecSubscriberId DOCUMENT ME!
   * @param ecMsisdn DOCUMENT ME!
   * @param ecSim DOCUMENT ME!
   * @param ecOperator DOCUMENT ME!
   * @param ecTty DOCUMENT ME!
   * @param ecTechnologyInd NOT IN USE!
   */
  public EcEventCommandDMO( 
    final String  ecCommand,
    final String  ecStatus,
    final Date    ecDate,
    final Short   ecTime,
    final String  ecMessage,
    final String  ecNetwork,
    final String  ecType,
    final Short   ecPriority,
    final Integer ecSendSeq,
    final Integer ecSubscriberId,
    final String  ecMsisdn,
    final String  ecSim,
    final String  ecOperator,
    final String  ecTty
//    ,final String  ecTechnologyInd 
    ) {
    this.ecCommand = ecCommand;

    this.ecStatus = ecStatus;

    this.ecDate = ( ecDate != null ) ? new Date( ecDate ) : null;

    this.ecTime = ecTime;

    this.ecMessage = ecMessage;

    this.ecNetwork = ecNetwork;

    this.ecType = ecType;

    this.ecPriority = ecPriority;

    this.ecSendSeq = ecSendSeq;

    this.ecSubscriberId = ecSubscriberId;

    this.ecMsisdn = ecMsisdn;

    this.ecSim = ecSim;

    this.ecOperator = ecOperator;

    this.ecTty = ecTty;

//    this.ecTechnologyInd = ecTechnologyInd;
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
    return new DAOArgs( 1 ).arg( ( this.ecCommand == null ) ? null
                                                            : this.ecCommand
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
      ( ecCommand == null ) ? null
                            : ( ( ecCommand.length(  ) <= ecCommandSize )
      ? ecCommand
      : ecCommand.substring( 0, ecCommandSize ) // auto trimmed to fit, if required.
       ),
      ( ecStatus == null ) ? null
                           : ( ( ecStatus.length(  ) <= ecStatusSize )
      ? ecStatus
      : ecStatus.substring( 0, ecStatusSize ) // auto trimmed to fit, if required.
       ), ecDate, ecTime,
      ( ecMessage == null ) ? null
                            : ( ( ecMessage.length(  ) <= ecMessageSize )
      ? ecMessage
      : ecMessage.substring( 0, ecMessageSize ) // auto trimmed to fit, if required.
       ),
      ( ecNetwork == null ) ? null
                            : ( ( ecNetwork.length(  ) <= ecNetworkSize )
      ? ecNetwork
      : ecNetwork.substring( 0, ecNetworkSize ) // auto trimmed to fit, if required.
       ),
      ( ecType == null ) ? null
                         : ( ( ecType.length(  ) <= ecTypeSize ) ? ecType
                                                                 : ecType
      .substring( 0, ecTypeSize ) // auto trimmed to fit, if required.
       ), ecPriority, ecSendSeq, ecSubscriberId,
      ( ecMsisdn == null ) ? null
                               : ( ( ecMsisdn.length(  ) <= ecMsisdnSize )
      ? ecMsisdn
      : ecMsisdn.substring( 0, ecMsisdnSize ) // auto trimmed to fit, if required.
       ),
      ( ecSim == null ) ? null
                             : ( ( ecSim.length(  ) <= ecSimSize )
      ? ecSim
      : ecSim.substring( 0, ecSimSize ) // auto trimmed to fit, if required.
       ),
      ( ecOperator == null ) ? null
                             : ( ( ecOperator.length(  ) <= ecOperatorSize )
      ? ecOperator
      : ecOperator.substring( 0, ecOperatorSize ) // auto trimmed to fit, if required.
       ),
      ( ecTty == null ) ? null
                        : ( ( ecTty.length(  ) <= ecTtySize ) ? ecTty
                                                              : ecTty
      .substring( 0, ecTtySize ) // auto trimmed to fit, if required.
       )
//      ,( ecTechnologyInd == null ) ? null
//                                  : ( ( ecTechnologyInd.length(  ) <= ecTechnologyIndSize )
//      ? ecTechnologyInd
//      : ecTechnologyInd.substring( 0, ecTechnologyIndSize ) // auto trimmed to fit, if required.
//       )
    };
  }

  /**
   * DOCUMENT ME!
   *
   * @param fields DOCUMENT ME!
   */
  protected void set( final Object[] fields ) {
    ecCommand = rtrim( (String) fields[0] );
    ecStatus = rtrim( (String) fields[1] );
    ecDate = (Date) fields[2];
    ecTime = (Short) fields[3];
    ecMessage = rtrim( (String) fields[4] );
    ecNetwork = rtrim( (String) fields[5] );
    ecType = rtrim( (String) fields[6] );
    ecPriority = (Short) fields[7];
    ecSendSeq = (Integer) fields[8];
    ecSubscriberId = (Integer) fields[9];
    ecMsisdn = rtrim( (String) fields[10] );
    ecSim = rtrim( (String) fields[11] );
    ecOperator = rtrim( (String) fields[12] );
    ecTty = rtrim( (String) fields[13] );
//    ecTechnologyInd = rtrim( (String) fields[14] );
  }

  // Get methods ///////////////////////////////////////////////////////////////
  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getEcCommand(  ) {
    return ecCommand;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getEcStatus(  ) {
    return ecStatus;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public Date getEcDate(  ) {
    return ( ecDate != null ) ? new Date( ecDate ) : null;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public Short getEcTime(  ) {
    return ecTime;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getEcMessage(  ) {
    return ecMessage;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getEcNetwork(  ) {
    return ecNetwork;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getEcType(  ) {
    return ecType;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public Short getEcPriority(  ) {
    return ecPriority;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public Integer getEcSendSeq(  ) {
    return ecSendSeq;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public Integer getEcSubscriberId(  ) {
    return ecSubscriberId;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getEcMsisdn(  ) {
    return ecMsisdn;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getEcSim(  ) {
    return ecSim;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getEcOperator(  ) {
    return ecOperator;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getEcTty(  ) {
    return ecTty;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
//  public String getEcTechnologyInd(  ) {
//    return ecTechnologyInd;
//  }

  // Setter methods ///////////////////////////////////////////////////////////////

  //
  // Master setter follows...
  //

  /**
   * Setter that takes all attributes
   */
  public void set( 
    final String  ecCommand,
    final String  ecStatus,
    final Date    ecDate,
    final Short   ecTime,
    final String  ecMessage,
    final String  ecNetwork,
    final String  ecType,
    final Short   ecPriority,
    final Integer ecSendSeq,
    final Integer ecSubscriberId,
    final String  ecMsisdn,
    final String  ecSim,
    final String  ecOperator,
    final String  ecTty
//    ,
//    final String  ecTechnologyInd 
    ) {
    this.ecCommand = ecCommand;
    this.ecStatus = ecStatus;
    this.ecDate = ( ecDate != null ) ? new Date( ecDate ) : null;
    this.ecTime = ecTime;
    this.ecMessage = ecMessage;
    this.ecNetwork = ecNetwork;
    this.ecType = ecType;
    this.ecPriority = ecPriority;
    this.ecSendSeq = ecSendSeq;
    this.ecSubscriberId = ecSubscriberId;
    this.ecMsisdn = ecMsisdn;
    this.ecSim = ecSim;
    this.ecOperator = ecOperator;
    this.ecTty = ecTty;
//    this.ecTechnologyInd = ecTechnologyInd;
  }

  //
  // Public access modifiers if any
  // (provided for attributes that are public in the analysis model)
  //    

  /**
  * Sets the EcCommand field.
  *
  * @param ecCommand
  */
  public void setEcCommand( final String ecCommand ) {
    this.ecCommand = getPadded(ecCommand, ecCommandFilter);
  }

  /**
  * Sets the EcStatus field.
  *
  * @param ecStatus
  */
  public void setEcStatus( final String ecStatus ) {
    this.ecStatus = getPadded(ecStatus, ecStatusFilter);
  }

  /**
  * Sets the EcDate field.
  *
  * @param ecDate
  */
  public void setEcDate( final Date ecDate ) {
    this.ecDate = ( ecDate != null ) ? new Date( ecDate ) : null;
  }

  /**
  * Sets the EcTime field.
  *
  * @param ecTime
  */
  public void setEcTime( final Short ecTime ) {
    this.ecTime = ecTime;
  }

  /**
  * Sets the EcTime field.
  *
  * @param ecTime
  */
  public void setEcTime( final int ecTime ) {
    // this.ecTime = Short.valueOf( (short) ecTime );
    // Narayana Sai - 25/07/2008 - Code should Compatible with 1.4 as per MTN Standards
	  this.ecTime = new Short( (short) ecTime );
  }

  /**
  * Sets the EcMessage field.
  *
  * @param ecMessage
  */
  public void setEcMessage( final String ecMessage ) {
    this.ecMessage = getPadded(ecMessage, ecMessageFilter);
  }

  /**
  * Sets the EcNetwork field.
  *
  * @param ecNetwork
  */
  public void setEcNetwork( final String ecNetwork ) {
    this.ecNetwork = getPadded(ecNetwork, ecNetworkFilter);
  }

  /**
  * Sets the EcType field.
  *
  * @param ecType
  */
  public void setEcType( final String ecType ) {
    this.ecType = getPadded(ecType, ecTypeFilter);
  }

  /**
  * Sets the EcPriority field.
  *
  * @param ecPriority
  */
  public void setEcPriority( final Short ecPriority ) {
    this.ecPriority = ecPriority;
  }

  /**
  * Sets the EcPriority field.
  *
  * @param ecPriority
  */
  public void setEcPriority( final int ecPriority ) {
    
	  //  this.ecPriority = Short.valueOf( (short) ecPriority );
	  //  Narayana Sai - 25/07/2008 - Code should Compatible with 1.4 as per MTN Standards
	  this.ecPriority = new Short( (short) ecPriority );
  }

  /**
  * Sets the EcSendSeq field.
  *
  * @param ecSendSeq
  */
  public void setEcSendSeq( final Integer ecSendSeq ) {
    this.ecSendSeq = ecSendSeq;
  }

  /**
  * Sets the EcSubscriberId field.
  *
  * @param ecSubscriberId
  */
  public void setEcSubscriberId( final Integer ecSubscriberId ) {
    this.ecSubscriberId = ecSubscriberId;
  }

  /**
  * Sets the ecMsisdn field.
  *
  * @param ecMsisdn
  */
  public void setEcMsisdn( final String ecMsisdn ) {
    this.ecMsisdn = getPadded(ecMsisdn, ecMsisdnFilter);
  }

  /**
  * Sets the ecSim field.
  *
  * @param ecSim
  */
  public void setEcSim( final String ecSim ) {
    this.ecSim = getPadded(ecSim, ecSimFilter);
  }

  /**
  * Sets the EcOperator field.
  *
  * @param ecOperator
  */
  public void setEcOperator( final String ecOperator ) {
    this.ecOperator = getPadded(ecOperator, ecOperatorFilter);
  }

  /**
  * Sets the EcTty field.
  *
  * @param ecTty
  */
  public void setEcTty( final String ecTty ) {
    this.ecTty = getPadded(ecTty, ecTtyFilter);
  }

  /**
  * Sets the EcTechnologyInd field.
  *
  * @param ecTechnologyInd
  */
//  public void setEcTechnologyInd( final String ecTechnologyInd ) {
//    this.ecTechnologyInd = ecTechnologyInd;
//  }

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
