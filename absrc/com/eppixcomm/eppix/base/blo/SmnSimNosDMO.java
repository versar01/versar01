package com.eppixcomm.eppix.base.blo;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;
import com.eppixcomm.eppix.common.util.FilterOp;
import com.eppixcomm.eppix.common.util.FilterPart;

//---------------------
// imports
//---------------------
import com.eppixcomm.eppix.common.util.QueryFilter;
import com.eppixcomm.eppix.common.data.DBO;
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
 * A value object to carry the data for a SmnSimNos.
 *
 *
 * <H3> A SmnSimNos is: </H3>
 *
 * <!-- indent text -->
 * <TABLE BORDER="0" CELLPADDING="0" CELLSPACING="0">
 * <TR>
 * <TD WIDTH="25">&nbsp;</TD>
 * <TD>
 *
 * Holds information on all SIM cards available within EPPIX and their current status.
 *
 * <!-- end indent text -->
 * </TD>
 * </TR>
 * </TABLE>
 *
 *
 * <H3> SmnSimNos Value Object: </H3>
 *
 * <!-- indent text -->
 * <TABLE BORDER="0" CELLPADDING="0" CELLSPACING="0">
 * <TR>
 * <TD WIDTH="25">&nbsp;</TD>
 * <TD>
 *
 * <P>
 *     This is a value object (called a Data Model Object or 'DMO').
 *     It is used to pass the data for a smnSimNos into and out of the BASE module.
 *     Because it's purpose is to carry data into and out of the module it is visible outside the module.
 * </P>
 * <P>
 *     This value object carries the data for one smnSimNos. A smnSimNos is:
 * Holds information on all SIM cards available within EPPIX and their current status.
 * </P>
 * <P>
 *     It corresponds to the business logic object SmnSimNos which
 *     contains all the business behaviour of a smnSimNos but is not visible outside the
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
 *    This value object contains fields for all the details of a smnSimNos, namely:
 * </P>
 *


 * <P>
 *    <U>Fields to carry the Attributes of a smnSimNos:</U>
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
 *   <TD ALIGN="left" VALIGN="top"><B>smnSimNo</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Unique SIM card serial number.
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
 *       <A HREF="#getSmnSimNo()">
 *           getSmnSimNo
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setSmnSimNo(java.lang.String)">
 *           setSmnSimNo (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>smnNetworkId</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Network on which SIM may by connected.
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
 *       <A HREF="#getSmnNetworkId()">
 *           getSmnNetworkId
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setSmnNetworkId(java.lang.String)">
 *           setSmnNetworkId (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>smnImsiNo</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Unique IMSI number associated with SIM card.
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
 *       <A HREF="#getSmnImsiNo()">
 *           getSmnImsiNo
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setSmnImsiNo(java.lang.String)">
 *           setSmnImsiNo (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>smnKi</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Authentication code which must be passed to switch when a network event occurs.
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
 *       <A HREF="#getSmnKi()">
 *           getSmnKi
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setSmnKi(java.lang.String)">
 *           setSmnKi (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>smnOnNetwork</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Flag to indicate whether SIM is connected on network.
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
 *       <A HREF="#getSmnOnNetwork()">
 *           getSmnOnNetwork
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setSmnOnNetwork(java.lang.String)">
 *           setSmnOnNetwork (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>smnHlr</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       HLR to which SIM belongs.
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
 *       <A HREF="#getSmnHlr()">
 *           getSmnHlr
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setSmnHlr(java.lang.String)">
 *           setSmnHlr (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>smnPukNo</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Super pin number for card.
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
 *       <A HREF="#getSmnPukNo()">
 *           getSmnPukNo
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setSmnPukNo(java.lang.String)">
 *           setSmnPukNo (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>smnStatus</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Status of SIM card.
 *       <p>
 *         Valid status\' include:
 0 = available
 1 = active
 4 = temporaraly disconnected
 6 = permanently disconnected
 7 =
 *         swapped
 8 = assigned
 9 = pending activation
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
 *       <A HREF="#getSmnStatus()">
 *           getSmnStatus
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setSmnStatus(java.lang.String)">
 *           setSmnStatus (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>smnActiveDate</B></TD>
 *   <TD ALIGN="left" VALIGN="top">Date</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Date SIM card was connected.
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
 *       <A HREF="#getSmnActiveDate()">
 *           getSmnActiveDate
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setSmnActiveDate(com.cmgwds.eppix.util.Date)">
 *           setSmnActiveDate (Date)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>smnAvailDate</B></TD>
 *   <TD ALIGN="left" VALIGN="top">Date</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Date from which SIM is available.
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
 *       <A HREF="#getSmnAvailDate()">
 *           getSmnAvailDate
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setSmnAvailDate(com.cmgwds.eppix.util.Date)">
 *           setSmnAvailDate (Date)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>smnExpiryDate</B></TD>
 *   <TD ALIGN="left" VALIGN="top">Date</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Date on which SIM expires.
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
 *       <A HREF="#getSmnExpiryDate()">
 *           getSmnExpiryDate
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setSmnExpiryDate(com.cmgwds.eppix.util.Date)">
 *           setSmnExpiryDate (Date)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>smnWarehouse</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Warehouse identifying location of SIM in Chameleon.
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
 *       <A HREF="#getSmnWarehouse()">
 *           getSmnWarehouse
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setSmnWarehouse(java.lang.String)">
 *           setSmnWarehouse (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>smnProductCode</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Product code for SIM within Chameleon.
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
 *       <A HREF="#getSmnProductCode()">
 *           getSmnProductCode
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setSmnProductCode(java.lang.String)">
 *           setSmnProductCode (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>smnDealerId</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Identification of dealer to whom SIM has been assigned.
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
 *       <A HREF="#getSmnDealerId()">
 *           getSmnDealerId
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setSmnDealerId(java.lang.String)">
 *           setSmnDealerId (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>smnTransportKey</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       The key used to decrypt the Ki Number
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
 *       <A HREF="#getSmnTransportKey()">
 *           getSmnTransportKey
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setSmnTransportKey(java.lang.String)">
 *           setSmnTransportKey (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>smnPinNo</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       The personal PIN number
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
 *       <A HREF="#getSmnPinNo()">
 *           getSmnPinNo
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setSmnPinNo(java.lang.String)">
 *           setSmnPinNo (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>smnPukNo2</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Super Puk number
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
 *       <A HREF="#getSmnPukNo2()">
 *           getSmnPukNo2
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setSmnPukNo2(java.lang.String)">
 *           setSmnPukNo2 (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>smnPinNo2</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Super Pin Number
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
 *       <A HREF="#getSmnPinNo2()">
 *           getSmnPinNo2
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setSmnPinNo2(java.lang.String)">
 *           setSmnPinNo2 (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>smnAnalysis1</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Analysis field one.
 *       <p>
 *         To be used for specific SIM files which require extra data to be captured.
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
 *       <A HREF="#getSmnAnalysis1()">
 *           getSmnAnalysis1
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setSmnAnalysis1(java.lang.String)">
 *           setSmnAnalysis1 (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>smnAnalysis2</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Analysis field two.
 *       <p>
 *         To be used for specific SIM files which require extra data to be captured.
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
 *       <A HREF="#getSmnAnalysis2()">
 *           getSmnAnalysis2
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setSmnAnalysis2(java.lang.String)">
 *           setSmnAnalysis2 (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>smnAnalysis3</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Analysis field three.
 *       <p>
 *         To be used for specific SIM files which require extra data to be captured.
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
 *       <A HREF="#getSmnAnalysis3()">
 *           getSmnAnalysis3
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setSmnAnalysis3(java.lang.String)">
 *           setSmnAnalysis3 (String)
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


 * @see SmnSimNos
 *
 * @author
 * @version $Revision: $
 *
 * @since $jdk$
 */
public class SmnSimNosDMO
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
      FIELD_TYPE_STRING /* std public attribute: smnSimNo  */,
      FIELD_TYPE_STRING /* std public attribute: smnNetworkId  */,
      FIELD_TYPE_STRING /* std public attribute: smnImsiNo  */,
      FIELD_TYPE_STRING /* std public attribute: smnKi  */,
      FIELD_TYPE_STRING /* std public attribute: smnOnNetwork  */,
      FIELD_TYPE_STRING /* std public attribute: smnHlr  */,
      FIELD_TYPE_STRING /* std public attribute: smnPukNo  */,
      FIELD_TYPE_STRING /* std public attribute: smnStatus  */,
      FIELD_TYPE_DATEONLY /* std public attribute: smnActiveDate  */,
      FIELD_TYPE_DATEONLY /* std public attribute: smnAvailDate  */,
      FIELD_TYPE_DATEONLY /* std public attribute: smnExpiryDate  */,
      FIELD_TYPE_STRING /* std public attribute: smnWarehouse  */,
      FIELD_TYPE_STRING /* std public attribute: smnProductCode  */,
      FIELD_TYPE_STRING /* std public attribute: smnDealerId  */,
      FIELD_TYPE_STRING /* std public attribute: smnTransportKey  */,
      FIELD_TYPE_STRING /* std public attribute: smnPinNo  */,
      FIELD_TYPE_STRING /* std public attribute: smnPukNo2  */,
      FIELD_TYPE_STRING /* std public attribute: smnPinNo2  */,
      FIELD_TYPE_STRING /* std public attribute: smnAnalysis1  */,
      FIELD_TYPE_STRING /* std public attribute: smnAnalysis2  */,
      FIELD_TYPE_STRING /* std public attribute: smnAnalysis3  */
    };
  
  private final int[] fieldSizes = new int[] {
		  smnSimNoSize,
		  smnNetworkIdSize,
		  smnImsiNoSize,
		  smnKiSize,
		  smnOnNetworkSize,
		  smnHlrSize,
		  smnPukNoSize,
		  smnStatusSize,
		  0,
		  0,
		  0,
		  smnWarehouseSize,
		  smnProductCodeSize,
		  smnDealerIdSize,
		  smnTransportKeySize,
		  smnPinNoSize,
		  smnPukNo2Size,
		  smnPinNo2Size,
		  smnAnalysis1Size,
		  smnAnalysis2Size,
		  smnAnalysis3Size
  };
      

  public int[] fieldSizes() {
  	return fieldSizes;
  }  

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int smnSimNoFilter = 0; // filter index
  private static final int smnSimNoSize = 14; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int smnNetworkIdFilter = 1; // filter index
  private static final int smnNetworkIdSize = 5; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int smnImsiNoFilter = 2; // filter index
  private static final int smnImsiNoSize = 15; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int smnKiFilter = 3; // filter index
  private static final int smnKiSize = 32; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int smnOnNetworkFilter = 4; // filter index
  private static final int smnOnNetworkSize = 1; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int smnHlrFilter = 5; // filter index
  private static final int smnHlrSize = 2; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int smnPukNoFilter = 6; // filter index
  private static final int smnPukNoSize = 8; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int smnStatusFilter = 7; // filter index
  private static final int smnStatusSize = 1; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int smnActiveDateFilter = 8; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int smnAvailDateFilter = 9; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int smnExpiryDateFilter = 10; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int smnWarehouseFilter = 11; // filter index
  private static final int smnWarehouseSize = 2; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int smnProductCodeFilter = 12; // filter index
  private static final int smnProductCodeSize = 20; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int smnDealerIdFilter = 13; // filter index
  private static final int smnDealerIdSize = 8; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int smnTransportKeyFilter = 14; // filter index
  private static final int smnTransportKeySize = 15; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int smnPinNoFilter = 15; // filter index
  private static final int smnPinNoSize = 8; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int smnPukNo2Filter = 16; // filter index
  private static final int smnPukNo2Size = 8; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int smnPinNo2Filter = 17; // filter index
  private static final int smnPinNo2Size = 8; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int smnAnalysis1Filter = 18; // filter index
  private static final int smnAnalysis1Size = 30; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int smnAnalysis2Filter = 19; // filter index
  private static final int smnAnalysis2Size = 30; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int smnAnalysis3Filter = 20; // filter index
  private static final int smnAnalysis3Size = 30; // field size

  //~ Instance variables /////////////////////////////////////////////////////

  private Date smnActiveDate; // Loaded from Schema
  private Date smnAvailDate; // Loaded from Schema
  private Date smnExpiryDate; // Loaded from Schema
  private String smnAnalysis1; // Loaded from Schema
  private String smnAnalysis2; // Loaded from Schema
  private String smnAnalysis3; // Loaded from Schema
  private String smnDealerId; // Loaded from Schema
  private String smnHlr; // Loaded from Schema
  private String smnImsiNo; // Loaded from Schema
  private String smnKi; // Loaded from Schema
  private String smnNetworkId; // Loaded from Schema
  private String smnOnNetwork; // Loaded from Schema
  private String smnPinNo; // Loaded from Schema
  private String smnPinNo2; // Loaded from Schema
  private String smnProductCode; // Loaded from Schema
  private String smnPukNo; // Loaded from Schema
  private String smnPukNo2; // Loaded from Schema

  //---------------------
  // Field declarations
  //---------------------
  // all attributes
  private String smnSimNo; // Loaded from Schema
  private String smnStatus; // Loaded from Schema
  private String smnTransportKey; // Loaded from Schema
  private String smnWarehouse; // Loaded from Schema

  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new SmnSimNosDMO object.
   */
  public SmnSimNosDMO(  ) {
  }

  // Constructor - taking public attributes
  /**
   * Creates a new SmnSimNosDMO object.
   *
   * @param smnSimNo DOCUMENT ME!
   * @param smnNetworkId DOCUMENT ME!
   * @param smnImsiNo DOCUMENT ME!
   * @param smnKi DOCUMENT ME!
   * @param smnOnNetwork DOCUMENT ME!
   * @param smnHlr DOCUMENT ME!
   * @param smnPukNo DOCUMENT ME!
   * @param smnStatus DOCUMENT ME!
   * @param smnActiveDate DOCUMENT ME!
   * @param smnAvailDate DOCUMENT ME!
   * @param smnExpiryDate DOCUMENT ME!
   * @param smnWarehouse DOCUMENT ME!
   * @param smnProductCode DOCUMENT ME!
   * @param smnDealerId DOCUMENT ME!
   * @param smnTransportKey DOCUMENT ME!
   * @param smnPinNo DOCUMENT ME!
   * @param smnPukNo2 DOCUMENT ME!
   * @param smnPinNo2 DOCUMENT ME!
   * @param smnAnalysis1 DOCUMENT ME!
   * @param smnAnalysis2 DOCUMENT ME!
   * @param smnAnalysis3 DOCUMENT ME!
   */
  public SmnSimNosDMO( 
    final String smnSimNo,
    final String smnNetworkId,
    final String smnImsiNo,
    final String smnKi,
    final String smnOnNetwork,
    final String smnHlr,
    final String smnPukNo,
    final String smnStatus,
    final Date   smnActiveDate,
    final Date   smnAvailDate,
    final Date   smnExpiryDate,
    final String smnWarehouse,
    final String smnProductCode,
    final String smnDealerId,
    final String smnTransportKey,
    final String smnPinNo,
    final String smnPukNo2,
    final String smnPinNo2,
    final String smnAnalysis1,
    final String smnAnalysis2,
    final String smnAnalysis3 ) {
    this.smnSimNo = smnSimNo;

    this.smnNetworkId = smnNetworkId;

    this.smnImsiNo = smnImsiNo;

    this.smnKi = smnKi;

    this.smnOnNetwork = smnOnNetwork;

    this.smnHlr = smnHlr;

    this.smnPukNo = smnPukNo;

    this.smnStatus = smnStatus;

    this.smnActiveDate = ( smnActiveDate != null )
      ? new Date( smnActiveDate ) : null;

    this.smnAvailDate = ( smnAvailDate != null ) ? new Date( smnAvailDate )
                                                 : null;

    this.smnExpiryDate = ( smnExpiryDate != null )
      ? new Date( smnExpiryDate ) : null;

    this.smnWarehouse = smnWarehouse;

    this.smnProductCode = smnProductCode;

    this.smnDealerId = smnDealerId;

    this.smnTransportKey = smnTransportKey;

    this.smnPinNo = smnPinNo;

    this.smnPukNo2 = smnPukNo2;

    this.smnPinNo2 = smnPinNo2;

    this.smnAnalysis1 = smnAnalysis1;

    this.smnAnalysis2 = smnAnalysis2;

    this.smnAnalysis3 = smnAnalysis3;
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
    return new DAOArgs( 1 ).arg( ( this.smnSimNo == null ) ? null
                                                           : this.smnSimNo
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
      ( smnSimNo == null ) ? null
                           : ( ( smnSimNo.length(  ) <= smnSimNoSize )
      ? smnSimNo
      : smnSimNo.substring( 0, smnSimNoSize ) // auto trimmed to fit, if required.
       ),
      ( smnNetworkId == null ) ? null
                               : ( ( smnNetworkId.length(  ) <= smnNetworkIdSize )
      ? smnNetworkId
      : smnNetworkId.substring( 0, smnNetworkIdSize ) // auto trimmed to fit, if required.
       ),
      ( smnImsiNo == null ) ? null
                            : ( ( smnImsiNo.length(  ) <= smnImsiNoSize )
      ? smnImsiNo
      : smnImsiNo.substring( 0, smnImsiNoSize ) // auto trimmed to fit, if required.
       ),
      ( smnKi == null ) ? null
                        : ( ( smnKi.length(  ) <= smnKiSize ) ? smnKi
                                                              : smnKi
      .substring( 0, smnKiSize ) // auto trimmed to fit, if required.
       ),
      ( smnOnNetwork == null ) ? null
                               : ( ( smnOnNetwork.length(  ) <= smnOnNetworkSize )
      ? smnOnNetwork
      : smnOnNetwork.substring( 0, smnOnNetworkSize ) // auto trimmed to fit, if required.
       ),
      ( smnHlr == null ) ? null
                         : ( ( smnHlr.length(  ) <= smnHlrSize ) ? smnHlr
                                                                 : smnHlr
      .substring( 0, smnHlrSize ) // auto trimmed to fit, if required.
       ),
      ( smnPukNo == null ) ? null
                           : ( ( smnPukNo.length(  ) <= smnPukNoSize )
      ? smnPukNo
      : smnPukNo.substring( 0, smnPukNoSize ) // auto trimmed to fit, if required.
       ),
      ( smnStatus == null ) ? null
                            : ( ( smnStatus.length(  ) <= smnStatusSize )
      ? smnStatus
      : smnStatus.substring( 0, smnStatusSize ) // auto trimmed to fit, if required.
       ), smnActiveDate, smnAvailDate, smnExpiryDate,
      ( smnWarehouse == null ) ? null
                               : ( ( smnWarehouse.length(  ) <= smnWarehouseSize )
      ? smnWarehouse
      : smnWarehouse.substring( 0, smnWarehouseSize ) // auto trimmed to fit, if required.
       ),
      ( smnProductCode == null ) ? null
                                 : ( ( smnProductCode.length(  ) <= smnProductCodeSize )
      ? smnProductCode
      : smnProductCode.substring( 0, smnProductCodeSize ) // auto trimmed to fit, if required.
       ),
      ( smnDealerId == null ) ? null
                              : ( ( smnDealerId.length(  ) <= smnDealerIdSize )
      ? smnDealerId
      : smnDealerId.substring( 0, smnDealerIdSize ) // auto trimmed to fit, if required.
       ),
      ( smnTransportKey == null ) ? null
                                  : ( ( smnTransportKey.length(  ) <= smnTransportKeySize )
      ? smnTransportKey
      : smnTransportKey.substring( 0, smnTransportKeySize ) // auto trimmed to fit, if required.
       ),
      ( smnPinNo == null ) ? null
                           : ( ( smnPinNo.length(  ) <= smnPinNoSize )
      ? smnPinNo
      : smnPinNo.substring( 0, smnPinNoSize ) // auto trimmed to fit, if required.
       ),
      ( smnPukNo2 == null ) ? null
                            : ( ( smnPukNo2.length(  ) <= smnPukNo2Size )
      ? smnPukNo2
      : smnPukNo2.substring( 0, smnPukNo2Size ) // auto trimmed to fit, if required.
       ),
      ( smnPinNo2 == null ) ? null
                            : ( ( smnPinNo2.length(  ) <= smnPinNo2Size )
      ? smnPinNo2
      : smnPinNo2.substring( 0, smnPinNo2Size ) // auto trimmed to fit, if required.
       ),
      ( smnAnalysis1 == null ) ? null
                               : ( ( smnAnalysis1.length(  ) <= smnAnalysis1Size )
      ? smnAnalysis1
      : smnAnalysis1.substring( 0, smnAnalysis1Size ) // auto trimmed to fit, if required.
       ),
      ( smnAnalysis2 == null ) ? null
                               : ( ( smnAnalysis2.length(  ) <= smnAnalysis2Size )
      ? smnAnalysis2
      : smnAnalysis2.substring( 0, smnAnalysis2Size ) // auto trimmed to fit, if required.
       ),
      ( smnAnalysis3 == null ) ? null
                               : ( ( smnAnalysis3.length(  ) <= smnAnalysis3Size )
      ? smnAnalysis3
      : smnAnalysis3.substring( 0, smnAnalysis3Size ) // auto trimmed to fit, if required.
       )
    };
  }

  /**
   * DOCUMENT ME!
   *
   * @param fields DOCUMENT ME!
   */
  protected void set( final Object[] fields ) {
    smnSimNo = rtrim( (String) fields[0] );
    smnNetworkId = rtrim( (String) fields[1] );
    smnImsiNo = rtrim( (String) fields[2] );
    smnKi = rtrim( (String) fields[3] );
    smnOnNetwork = rtrim( (String) fields[4] );
    smnHlr = rtrim( (String) fields[5] );
    smnPukNo = rtrim( (String) fields[6] );
    smnStatus = rtrim( (String) fields[7] );
    smnActiveDate = (Date) fields[8];
    smnAvailDate = (Date) fields[9];
    smnExpiryDate = (Date) fields[10];
    smnWarehouse = rtrim( (String) fields[11] );
    smnProductCode = rtrim( (String) fields[12] );
    smnDealerId = rtrim( (String) fields[13] );
    smnTransportKey = rtrim( (String) fields[14] );
    smnPinNo = rtrim( (String) fields[15] );
    smnPukNo2 = rtrim( (String) fields[16] );
    smnPinNo2 = rtrim( (String) fields[17] );
    smnAnalysis1 = rtrim( (String) fields[18] );
    smnAnalysis2 = rtrim( (String) fields[19] );
    smnAnalysis3 = rtrim( (String) fields[20] );
  }

  // Get methods ///////////////////////////////////////////////////////////////
  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getSmnSimNo(  ) {
    return smnSimNo;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getSmnNetworkId(  ) {
    return smnNetworkId;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getSmnImsiNo(  ) {
    return smnImsiNo;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getSmnKi(  ) {
    return smnKi;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getSmnOnNetwork(  ) {
    return smnOnNetwork;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getSmnHlr(  ) {
    return smnHlr;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getSmnPukNo(  ) {
    return smnPukNo;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getSmnStatus(  ) {
    return smnStatus;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public Date getSmnActiveDate(  ) {
    return ( smnActiveDate != null ) ? new Date( smnActiveDate ) : null;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public Date getSmnAvailDate(  ) {
    return ( smnAvailDate != null ) ? new Date( smnAvailDate ) : null;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public Date getSmnExpiryDate(  ) {
    return ( smnExpiryDate != null ) ? new Date( smnExpiryDate ) : null;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getSmnWarehouse(  ) {
    return smnWarehouse;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getSmnProductCode(  ) {
    return smnProductCode;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getSmnDealerId(  ) {
    return smnDealerId;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getSmnTransportKey(  ) {
    return smnTransportKey;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getSmnPinNo(  ) {
    return smnPinNo;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getSmnPukNo2(  ) {
    return smnPukNo2;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getSmnPinNo2(  ) {
    return smnPinNo2;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getSmnAnalysis1(  ) {
    return smnAnalysis1;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getSmnAnalysis2(  ) {
    return smnAnalysis2;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getSmnAnalysis3(  ) {
    return smnAnalysis3;
  }

  // Setter methods ///////////////////////////////////////////////////////////////

  //
  // Master setter follows...
  //

  /**
   * Setter that takes all attributes
   */
  public void set( 
    final String smnSimNo,
    final String smnNetworkId,
    final String smnImsiNo,
    final String smnKi,
    final String smnOnNetwork,
    final String smnHlr,
    final String smnPukNo,
    final String smnStatus,
    final Date   smnActiveDate,
    final Date   smnAvailDate,
    final Date   smnExpiryDate,
    final String smnWarehouse,
    final String smnProductCode,
    final String smnDealerId,
    final String smnTransportKey,
    final String smnPinNo,
    final String smnPukNo2,
    final String smnPinNo2,
    final String smnAnalysis1,
    final String smnAnalysis2,
    final String smnAnalysis3 ) {
    this.smnSimNo = smnSimNo;
    this.smnNetworkId = smnNetworkId;
    this.smnImsiNo = smnImsiNo;
    this.smnKi = smnKi;
    this.smnOnNetwork = smnOnNetwork;
    this.smnHlr = smnHlr;
    this.smnPukNo = smnPukNo;
    this.smnStatus = smnStatus;
    this.smnActiveDate = ( smnActiveDate != null )
      ? new Date( smnActiveDate ) : null;
    this.smnAvailDate = ( smnAvailDate != null ) ? new Date( smnAvailDate )
                                                 : null;
    this.smnExpiryDate = ( smnExpiryDate != null )
      ? new Date( smnExpiryDate ) : null;
    this.smnWarehouse = smnWarehouse;
    this.smnProductCode = smnProductCode;
    this.smnDealerId = smnDealerId;
    this.smnTransportKey = smnTransportKey;
    this.smnPinNo = smnPinNo;
    this.smnPukNo2 = smnPukNo2;
    this.smnPinNo2 = smnPinNo2;
    this.smnAnalysis1 = smnAnalysis1;
    this.smnAnalysis2 = smnAnalysis2;
    this.smnAnalysis3 = smnAnalysis3;
  }

  //
  // Public access modifiers if any
  // (provided for attributes that are public in the analysis model)
  //    

  /**
  * Sets the SmnSimNo field.
  *
  * @param smnSimNo
  */
  public void setSmnSimNo( final String smnSimNo ) {
    this.smnSimNo = getPadded(smnSimNo, smnSimNoFilter);;
  }

  /**
  * Sets the SmnNetworkId field.
  *
  * @param smnNetworkId
  */
  public void setSmnNetworkId( final String smnNetworkId ) {
    this.smnNetworkId = getPadded(smnNetworkId, smnNetworkIdFilter);
  }

  /**
  * Sets the SmnImsiNo field.
  *
  * @param smnImsiNo
  */
  public void setSmnImsiNo( final String smnImsiNo ) {
    this.smnImsiNo = getPadded(smnImsiNo, smnImsiNoFilter);
  }

  /**
  * Sets the SmnKi field.
  *
  * @param smnKi
  */
  public void setSmnKi( final String smnKi ) {
    this.smnKi = getPadded(smnKi, smnKiFilter);
  }

  /**
  * Sets the SmnOnNetwork field.
  *
  * @param smnOnNetwork
  */
  public void setSmnOnNetwork( final String smnOnNetwork ) {
    this.smnOnNetwork = getPadded(smnOnNetwork, smnOnNetworkFilter);
  }

  /**
  * Sets the SmnHlr field.
  *
  * @param smnHlr
  */
  public void setSmnHlr( final String smnHlr ) {
    this.smnHlr = getPadded(smnHlr, smnHlrFilter);
  }

  /**
  * Sets the SmnPukNo field.
  *
  * @param smnPukNo
  */
  public void setSmnPukNo( final String smnPukNo ) {
    this.smnPukNo = getPadded(smnPukNo, smnPukNo2Filter);
  }

  /**
  * Sets the SmnStatus field.
  *
  * @param smnStatus
  */
  public void setSmnStatus( final String smnStatus ) {
    this.smnStatus = getPadded(smnStatus, smnStatusFilter);
  }

  /**
  * Sets the SmnActiveDate field.
  *
  * @param smnActiveDate
  */
  public void setSmnActiveDate( final Date smnActiveDate ) {
    this.smnActiveDate = ( smnActiveDate != null )
      ? new Date( smnActiveDate ) : null;
  }

  /**
  * Sets the SmnAvailDate field.
  *
  * @param smnAvailDate
  */
  public void setSmnAvailDate( final Date smnAvailDate ) {
    this.smnAvailDate = ( smnAvailDate != null ) ? new Date( smnAvailDate )
                                                 : null;
  }

  /**
  * Sets the SmnExpiryDate field.
  *
  * @param smnExpiryDate
  */
  public void setSmnExpiryDate( final Date smnExpiryDate ) {
    this.smnExpiryDate = ( smnExpiryDate != null )
      ? new Date( smnExpiryDate ) : null;
  }

  /**
  * Sets the SmnWarehouse field.
  *
  * @param smnWarehouse
  */
  public void setSmnWarehouse( final String smnWarehouse ) {
    this.smnWarehouse = getPadded(smnWarehouse, smnWarehouseFilter);
  }

  /**
  * Sets the SmnProductCode field.
  *
  * @param smnProductCode
  */
  public void setSmnProductCode( final String smnProductCode ) {
    this.smnProductCode = getPadded(smnProductCode, smnProductCodeFilter);
  }

  /**
  * Sets the SmnDealerId field.
  *
  * @param smnDealerId
  */
  public void setSmnDealerId( final String smnDealerId ) {
    this.smnDealerId = getPadded(smnDealerId, smnDealerIdFilter);
  }

  /**
  * Sets the SmnTransportKey field.
  *
  * @param smnTransportKey
  */
  public void setSmnTransportKey( final String smnTransportKey ) {
    this.smnTransportKey = getPadded(smnTransportKey, smnTransportKeyFilter);
  }

  /**
  * Sets the SmnPinNo field.
  *
  * @param smnPinNo
  */
  public void setSmnPinNo( final String smnPinNo ) {
    this.smnPinNo = getPadded(smnPinNo, smnPinNo2Filter);
  }

  /**
  * Sets the SmnPukNo2 field.
  *
  * @param smnPukNo2
  */
  public void setSmnPukNo2( final String smnPukNo2 ) {
    this.smnPukNo2 = getPadded(smnPukNo2, smnPukNo2Filter);
  }

  /**
  * Sets the SmnPinNo2 field.
  *
  * @param smnPinNo2
  */
  public void setSmnPinNo2( final String smnPinNo2 ) {
    this.smnPinNo2 = getPadded(smnPinNo2, smnPinNo2Filter);
  }

  /**
  * Sets the SmnAnalysis1 field.
  *
  * @param smnAnalysis1
  */
  public void setSmnAnalysis1( final String smnAnalysis1 ) {
    this.smnAnalysis1 = getPadded(smnAnalysis1, smnAnalysis1Filter);
  }

  /**
  * Sets the SmnAnalysis2 field.
  *
  * @param smnAnalysis2
  */
  public void setSmnAnalysis2( final String smnAnalysis2 ) {
    this.smnAnalysis2 = getPadded(smnAnalysis2, smnAnalysis2Filter);
  }

  /**
  * Sets the SmnAnalysis3 field.
  *
  * @param smnAnalysis3
  */
  public void setSmnAnalysis3( final String smnAnalysis3 ) {
    this.smnAnalysis3 = getPadded(smnAnalysis3, smnAnalysis3Filter);
  }

@Override
public String toString() {
	return "\nSmnSimNosDMO [smnActiveDate=" + smnActiveDate + "\nsmnAvailDate="
			+ smnAvailDate + "\nsmnExpiryDate=" + smnExpiryDate
			+ "\nsmnAnalysis1=" + smnAnalysis1 + "\nsmnAnalysis2="
			+ smnAnalysis2 + "\nsmnAnalysis3=" + smnAnalysis3
			+ "\nsmnDealerId=" + smnDealerId + "\nsmnHlr=" + smnHlr
			+ "\nsmnImsiNo=" + smnImsiNo + "\nsmnKi=" + smnKi
			+ "\nsmnNetworkId=" + smnNetworkId + "\nsmnOnNetwork="
			+ smnOnNetwork + "\nsmnPinNo=" + smnPinNo + "\nsmnPinNo2="
			+ smnPinNo2 + "\nsmnProductCode=" + smnProductCode + "\nsmnPukNo="
			+ smnPukNo + "\nsmnPukNo2=" + smnPukNo2 + "\nsmnSimNo=" + smnSimNo
			+ "\nsmnStatus=" + smnStatus + "\nsmnTransportKey="
			+ smnTransportKey + "\nsmnWarehouse=" + smnWarehouse + "]";
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
