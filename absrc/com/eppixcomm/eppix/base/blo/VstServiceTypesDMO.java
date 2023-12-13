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
 * A value object to carry the data for a VstServiceTypes.
 *
 *
 * <H3> A VstServiceTypes is: </H3>
 *
 * <!-- indent text -->
 * <TABLE BORDER="0" CELLPADDING="0" CELLSPACING="0">
 * <TR>
 * <TD WIDTH="25">&nbsp;</TD>
 * <TD>
 *
 * There are some (many) services that require EPPIX to perform special activities.
 * <p>
 *   A service_type is used to identify which sorts of actions are required. This table lists these hardcodes and gives them
 *   a meaning that the users can understand. A list of hardcodes follows the table layout.
 * </p>
 *
 * <!-- end indent text -->
 * </TD>
 * </TR>
 * </TABLE>
 *
 *
 * <H3> VstServiceTypes Value Object: </H3>
 *
 * <!-- indent text -->
 * <TABLE BORDER="0" CELLPADDING="0" CELLSPACING="0">
 * <TR>
 * <TD WIDTH="25">&nbsp;</TD>
 * <TD>
 *
 * <P>
 *     This is a value object (called a Data Model Object or 'DMO').
 *     It is used to pass the data for a vstServiceTypes into and out of the BASE module.
 *     Because it's purpose is to carry data into and out of the module it is visible outside the module.
 * </P>
 * <P>
 *     This value object carries the data for one vstServiceTypes. A vstServiceTypes is:
 * There are some (many) services that require EPPIX to perform special activities.
 * </P>
 * <P>
 *     It corresponds to the business logic object VstServiceTypes which
 *     contains all the business behaviour of a vstServiceTypes but is not visible outside the
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
 *    This value object contains fields for all the details of a vstServiceTypes, namely:
 * </P>
 *


 * <P>
 *    <U>Fields to carry the Attributes of a vstServiceTypes:</U>
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
 *   <TD ALIGN="left" VALIGN="top"><B>vstServiceType</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Hardcoded Service Types defined by CAIL for services that Eppix needs to process in a special way: (see list below)  Hardcode for all services that do not need special processing within the system: VA= all other services.
 *       <p>
 *         ("MB" has been reinstated and MS and ME dropped)
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
 *       <A HREF="#getVstServiceType()">
 *           getVstServiceType
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setVstServiceType(java.lang.String)">
 *           setVstServiceType (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>vstServiceDesc</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Meaningful name for the type of service.
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
 *       <A HREF="#getVstServiceDesc()">
 *           getVstServiceDesc
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setVstServiceDesc(java.lang.String)">
 *           setVstServiceDesc (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>vstMultiCharge</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Should the charge for this service be multipled by the number of msisdns involved.
 *       <p>
 *         This is only the system default used to populate vps_multi_charge which is itself a default for vas_multi_charge.
 *         Values: Y or N (or local equiv).
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
 *       <A HREF="#getVstMultiCharge()">
 *           getVstMultiCharge
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setVstMultiCharge(java.lang.String)">
 *           setVstMultiCharge (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>vstServiceClass</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       B = Basic Service - one that requires one or more NEW msisdns to be assined for it (eg: voice/basic telephony, fax or data).
 *       <p>
 *         V = Additional Service - one that acts on already assigned msisdns or doesnt require them. (eg: voice mail, itemised
 *         invoice, insurance). In the future this will be use to stop some networks basic services from sharing msisdns.
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
 *       <A HREF="#getVstServiceClass()">
 *           getVstServiceClass
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setVstServiceClass(java.lang.String)">
 *           setVstServiceClass (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>vstAutoConnect</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Default on activation.
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
 *       <A HREF="#getVstAutoConnect()">
 *           getVstAutoConnect
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setVstAutoConnect(java.lang.String)">
 *           setVstAutoConnect (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>vstOriginator</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       "N" - Network originated service type
"S" - Service Provider originated service type
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
 *       <A HREF="#getVstOriginator()">
 *           getVstOriginator
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setVstOriginator(java.lang.String)">
 *           setVstOriginator (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>vstTariffRelated</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Indicates is a service type is tariff related.
 *       <p>
 *         "Y" or "N".
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
 *       <A HREF="#getVstTariffRelated()">
 *           getVstTariffRelated
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setVstTariffRelated(java.lang.String)">
 *           setVstTariffRelated (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>vstParameterised</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
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
 *       <A HREF="#getVstParameterised()">
 *           getVstParameterised
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setVstParameterised(java.lang.String)">
 *           setVstParameterised (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>vstParamsLevel</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
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
 *       <A HREF="#getVstParamsLevel()">
 *           getVstParamsLevel
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setVstParamsLevel(java.lang.String)">
 *           setVstParamsLevel (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>vstArchiveMonths</B></TD>
 *   <TD ALIGN="left" VALIGN="top">Short</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Number of months to keep parameterised details following deactivation.
 *       <p>
 *         0 (zero) means no archiving.
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
 *       <A HREF="#getVstArchiveMonths()">
 *           getVstArchiveMonths
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setVstArchiveMonths(java.lang.Short)">
 *           setVstArchiveMonths (Short)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>vstFutureAct</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Whether the service can be future activated or not.
 *       <p>
 *         N.B. For Phase 3.05 this field will only be set to "Y" for "BO" service types - it will be set to "N" for all other
 *         service types.
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
 *       <A HREF="#getVstFutureAct()">
 *           getVstFutureAct
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setVstFutureAct(java.lang.String)">
 *           setVstFutureAct (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>vstNodeLevel</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       The node level will indicate at what level a service can be invoked from a navigator.
 *       <p>
 *         SUBS - Indicates the service is invoked from the Subscriber SERV - Indicates the service is invoked from the Service
 *         Module
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
 *       <A HREF="#getVstNodeLevel()">
 *           getVstNodeLevel
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setVstNodeLevel(java.lang.String)">
 *           setVstNodeLevel (String)
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


 * @see VstServiceTypes
 *
 * @author
 * @version $Revision: $
 *
 * @since $jdk$
 */
public class VstServiceTypesDMO
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
      FIELD_TYPE_STRING /* std public attribute: vstServiceType  */,
      FIELD_TYPE_STRING /* std public attribute: vstServiceDesc  */,
      FIELD_TYPE_STRING /* std public attribute: vstMultiCharge  */,
      FIELD_TYPE_STRING /* std public attribute: vstServiceClass  */,
      FIELD_TYPE_STRING /* std public attribute: vstAutoConnect  */,
      FIELD_TYPE_STRING /* std public attribute: vstOriginator  */,
      FIELD_TYPE_STRING /* std public attribute: vstTariffRelated  */,
      FIELD_TYPE_STRING /* std public attribute: vstParameterised  */,
      FIELD_TYPE_STRING /* std public attribute: vstParamsLevel  */,
      FIELD_TYPE_SHORT /* std public attribute: vstArchiveMonths  */,
      FIELD_TYPE_STRING /* std public attribute: vstFutureAct  */,
      FIELD_TYPE_STRING /* std public attribute: vstNodeLevel  */
    };
  
  private final int[] fieldSizes = new int[] {
		  vstServiceTypeSize,
		  vstServiceDescSize,
		  vstMultiChargeSize,
		  vstServiceClassSize,
		  vstAutoConnectSize,
		  vstOriginatorSize,
		  vstTariffRelatedSize,
		  vstParameterisedSize,
		  vstParamsLevelSize,
		  0,
		  vstFutureActSize,
		  vstNodeLevelSize
  };
      

  public int[] fieldSizes() {
  	return fieldSizes;
  }  

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int vstServiceTypeFilter = 0; // filter index
  private static final int vstServiceTypeSize = 5; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int vstServiceDescFilter = 1; // filter index
  private static final int vstServiceDescSize = 32; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int vstMultiChargeFilter = 2; // filter index
  private static final int vstMultiChargeSize = 1; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int vstServiceClassFilter = 3; // filter index
  private static final int vstServiceClassSize = 1; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int vstAutoConnectFilter = 4; // filter index
  private static final int vstAutoConnectSize = 1; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int vstOriginatorFilter = 5; // filter index
  private static final int vstOriginatorSize = 1; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int vstTariffRelatedFilter = 6; // filter index
  private static final int vstTariffRelatedSize = 1; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int vstParameterisedFilter = 7; // filter index
  private static final int vstParameterisedSize = 1; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int vstParamsLevelFilter = 8; // filter index
  private static final int vstParamsLevelSize = 1; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int vstArchiveMonthsFilter = 9; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int vstFutureActFilter = 10; // filter index
  private static final int vstFutureActSize = 1; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int vstNodeLevelFilter = 11; // filter index
  private static final int vstNodeLevelSize = 5; // field size

  //~ Instance variables /////////////////////////////////////////////////////

  private Short vstArchiveMonths; // Loaded from Schema
  private String vstAutoConnect; // Loaded from Schema
  private String vstFutureAct; // Loaded from Schema
  private String vstMultiCharge; // Loaded from Schema
  private String vstNodeLevel; // Loaded from Schema
  private String vstOriginator; // Loaded from Schema
  private String vstParameterised; // Loaded from Schema
  private String vstParamsLevel; // Loaded from Schema
  private String vstServiceClass; // Loaded from Schema
  private String vstServiceDesc; // Loaded from Schema

  //---------------------
  // Field declarations
  //---------------------
  // all attributes
  private String vstServiceType; // Loaded from Schema
  private String vstTariffRelated; // Loaded from Schema

  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new VstServiceTypesDMO object.
   */
  public VstServiceTypesDMO(  ) {
  }

  // Constructor - taking public attributes
  /**
   * Creates a new VstServiceTypesDMO object.
   *
   * @param vstServiceType DOCUMENT ME!
   * @param vstServiceDesc DOCUMENT ME!
   * @param vstMultiCharge DOCUMENT ME!
   * @param vstServiceClass DOCUMENT ME!
   * @param vstAutoConnect DOCUMENT ME!
   * @param vstOriginator DOCUMENT ME!
   * @param vstTariffRelated DOCUMENT ME!
   * @param vstParameterised DOCUMENT ME!
   * @param vstParamsLevel DOCUMENT ME!
   * @param vstArchiveMonths DOCUMENT ME!
   * @param vstFutureAct DOCUMENT ME!
   * @param vstNodeLevel DOCUMENT ME!
   */
  public VstServiceTypesDMO( 
    final String vstServiceType,
    final String vstServiceDesc,
    final String vstMultiCharge,
    final String vstServiceClass,
    final String vstAutoConnect,
    final String vstOriginator,
    final String vstTariffRelated,
    final String vstParameterised,
    final String vstParamsLevel,
    final Short  vstArchiveMonths,
    final String vstFutureAct,
    final String vstNodeLevel ) {
    this.vstServiceType = vstServiceType;

    this.vstServiceDesc = vstServiceDesc;

    this.vstMultiCharge = vstMultiCharge;

    this.vstServiceClass = vstServiceClass;

    this.vstAutoConnect = vstAutoConnect;

    this.vstOriginator = vstOriginator;

    this.vstTariffRelated = vstTariffRelated;

    this.vstParameterised = vstParameterised;

    this.vstParamsLevel = vstParamsLevel;

    this.vstArchiveMonths = vstArchiveMonths;

    this.vstFutureAct = vstFutureAct;

    this.vstNodeLevel = vstNodeLevel;
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
    return new DAOArgs( 1 ).arg( ( this.vstServiceType == null ) ? null
                                                                 : this.vstServiceType
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
      ( vstServiceType == null ) ? null
                                 : ( ( vstServiceType.length(  ) <= vstServiceTypeSize )
      ? vstServiceType
      : vstServiceType.substring( 0, vstServiceTypeSize ) // auto trimmed to fit, if required.
       ),
      ( vstServiceDesc == null ) ? null
                                 : ( ( vstServiceDesc.length(  ) <= vstServiceDescSize )
      ? vstServiceDesc
      : vstServiceDesc.substring( 0, vstServiceDescSize ) // auto trimmed to fit, if required.
       ),
      ( vstMultiCharge == null ) ? null
                                 : ( ( vstMultiCharge.length(  ) <= vstMultiChargeSize )
      ? vstMultiCharge
      : vstMultiCharge.substring( 0, vstMultiChargeSize ) // auto trimmed to fit, if required.
       ),
      ( vstServiceClass == null ) ? null
                                  : ( ( vstServiceClass.length(  ) <= vstServiceClassSize )
      ? vstServiceClass
      : vstServiceClass.substring( 0, vstServiceClassSize ) // auto trimmed to fit, if required.
       ),
      ( vstAutoConnect == null ) ? null
                                 : ( ( vstAutoConnect.length(  ) <= vstAutoConnectSize )
      ? vstAutoConnect
      : vstAutoConnect.substring( 0, vstAutoConnectSize ) // auto trimmed to fit, if required.
       ),
      ( vstOriginator == null ) ? null
                                : ( ( vstOriginator.length(  ) <= vstOriginatorSize )
      ? vstOriginator
      : vstOriginator.substring( 0, vstOriginatorSize ) // auto trimmed to fit, if required.
       ),
      ( vstTariffRelated == null ) ? null
                                   : ( ( vstTariffRelated.length(  ) <= vstTariffRelatedSize )
      ? vstTariffRelated
      : vstTariffRelated.substring( 0, vstTariffRelatedSize ) // auto trimmed to fit, if required.
       ),
      ( vstParameterised == null ) ? null
                                   : ( ( vstParameterised.length(  ) <= vstParameterisedSize )
      ? vstParameterised
      : vstParameterised.substring( 0, vstParameterisedSize ) // auto trimmed to fit, if required.
       ),
      ( vstParamsLevel == null ) ? null
                                 : ( ( vstParamsLevel.length(  ) <= vstParamsLevelSize )
      ? vstParamsLevel
      : vstParamsLevel.substring( 0, vstParamsLevelSize ) // auto trimmed to fit, if required.
       ), vstArchiveMonths,
      ( vstFutureAct == null ) ? null
                               : ( ( vstFutureAct.length(  ) <= vstFutureActSize )
      ? vstFutureAct
      : vstFutureAct.substring( 0, vstFutureActSize ) // auto trimmed to fit, if required.
       ),
      ( vstNodeLevel == null ) ? null
                               : ( ( vstNodeLevel.length(  ) <= vstNodeLevelSize )
      ? vstNodeLevel
      : vstNodeLevel.substring( 0, vstNodeLevelSize ) // auto trimmed to fit, if required.
       )
    };
  }

  /**
   * DOCUMENT ME!
   *
   * @param fields DOCUMENT ME!
   */
  protected void set( final Object[] fields ) {
    vstServiceType = rtrim( (String) fields[0] );
    vstServiceDesc = rtrim( (String) fields[1] );
    vstMultiCharge = rtrim( (String) fields[2] );
    vstServiceClass = rtrim( (String) fields[3] );
    vstAutoConnect = rtrim( (String) fields[4] );
    vstOriginator = rtrim( (String) fields[5] );
    vstTariffRelated = rtrim( (String) fields[6] );
    vstParameterised = rtrim( (String) fields[7] );
    vstParamsLevel = rtrim( (String) fields[8] );
    vstArchiveMonths = (Short) fields[9];
    vstFutureAct = rtrim( (String) fields[10] );
    vstNodeLevel = rtrim( (String) fields[11] );
  }

  // Get methods ///////////////////////////////////////////////////////////////
  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getVstServiceType(  ) {
    return vstServiceType;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getVstServiceDesc(  ) {
    return vstServiceDesc;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getVstMultiCharge(  ) {
    return vstMultiCharge;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getVstServiceClass(  ) {
    return vstServiceClass;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getVstAutoConnect(  ) {
    return vstAutoConnect;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getVstOriginator(  ) {
    return vstOriginator;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getVstTariffRelated(  ) {
    return vstTariffRelated;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getVstParameterised(  ) {
    return vstParameterised;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getVstParamsLevel(  ) {
    return vstParamsLevel;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public Short getVstArchiveMonths(  ) {
    return vstArchiveMonths;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getVstFutureAct(  ) {
    return vstFutureAct;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getVstNodeLevel(  ) {
    return vstNodeLevel;
  }

  // Setter methods ///////////////////////////////////////////////////////////////

  //
  // Master setter follows...
  //

  /**
   * Setter that takes all attributes
   */
  public void set( 
    final String vstServiceType,
    final String vstServiceDesc,
    final String vstMultiCharge,
    final String vstServiceClass,
    final String vstAutoConnect,
    final String vstOriginator,
    final String vstTariffRelated,
    final String vstParameterised,
    final String vstParamsLevel,
    final Short  vstArchiveMonths,
    final String vstFutureAct,
    final String vstNodeLevel ) {
    this.vstServiceType = vstServiceType;
    this.vstServiceDesc = vstServiceDesc;
    this.vstMultiCharge = vstMultiCharge;
    this.vstServiceClass = vstServiceClass;
    this.vstAutoConnect = vstAutoConnect;
    this.vstOriginator = vstOriginator;
    this.vstTariffRelated = vstTariffRelated;
    this.vstParameterised = vstParameterised;
    this.vstParamsLevel = vstParamsLevel;
    this.vstArchiveMonths = vstArchiveMonths;
    this.vstFutureAct = vstFutureAct;
    this.vstNodeLevel = vstNodeLevel;
  }

  //
  // Public access modifiers if any
  // (provided for attributes that are public in the analysis model)
  //    

  /**
  * Sets the VstServiceType field.
  *
  * @param vstServiceType
  */
  public void setVstServiceType( final String vstServiceType ) {
    this.vstServiceType = getPadded(vstServiceType, vstServiceTypeFilter);
  }

  /**
  * Sets the VstServiceDesc field.
  *
  * @param vstServiceDesc
  */
  public void setVstServiceDesc( final String vstServiceDesc ) {
    this.vstServiceDesc = getPadded(vstServiceDesc, vstServiceDescFilter);
  }

  /**
  * Sets the VstMultiCharge field.
  *
  * @param vstMultiCharge
  */
  public void setVstMultiCharge( final String vstMultiCharge ) {
    this.vstMultiCharge = getPadded(vstMultiCharge, vstMultiChargeFilter);
  }

  /**
  * Sets the VstServiceClass field.
  *
  * @param vstServiceClass
  */
  public void setVstServiceClass( final String vstServiceClass ) {
    this.vstServiceClass = getPadded(vstServiceClass, vstServiceClassFilter);
  }

  /**
  * Sets the VstAutoConnect field.
  *
  * @param vstAutoConnect
  */
  public void setVstAutoConnect( final String vstAutoConnect ) {
    this.vstAutoConnect = getPadded(vstAutoConnect, vstAutoConnectFilter);
  }

  /**
  * Sets the VstOriginator field.
  *
  * @param vstOriginator
  */
  public void setVstOriginator( final String vstOriginator ) {
    this.vstOriginator = getPadded(vstOriginator, vstOriginatorFilter);
  }

  /**
  * Sets the VstTariffRelated field.
  *
  * @param vstTariffRelated
  */
  public void setVstTariffRelated( final String vstTariffRelated ) {
    this.vstTariffRelated = getPadded(vstTariffRelated, vstTariffRelatedFilter);
  }

  /**
  * Sets the VstParameterised field.
  *
  * @param vstParameterised
  */
  public void setVstParameterised( final String vstParameterised ) {
    this.vstParameterised = getPadded(vstParameterised, vstParameterisedFilter);
  }

  /**
  * Sets the VstParamsLevel field.
  *
  * @param vstParamsLevel
  */
  public void setVstParamsLevel( final String vstParamsLevel ) {
    this.vstParamsLevel = getPadded(vstParamsLevel, vstParamsLevelFilter);
  }

  /**
  * Sets the VstArchiveMonths field.
  *
  * @param vstArchiveMonths
  */
  public void setVstArchiveMonths( final Short vstArchiveMonths ) {
    this.vstArchiveMonths = vstArchiveMonths;
  }

  /**
  * Sets the VstArchiveMonths field.
  *
  * @param vstArchiveMonths
  */
  public void setVstArchiveMonths( final int vstArchiveMonths ) {
    this.vstArchiveMonths = Short.valueOf( (short) vstArchiveMonths );
  }

  /**
  * Sets the VstFutureAct field.
  *
  * @param vstFutureAct
  */
  public void setVstFutureAct( final String vstFutureAct ) {
    this.vstFutureAct = getPadded(vstFutureAct, vstFutureActFilter);
  }

  /**
  * Sets the VstNodeLevel field.
  *
  * @param vstNodeLevel
  */
  public void setVstNodeLevel( final String vstNodeLevel ) {
    this.vstNodeLevel = getPadded(vstNodeLevel, vstNodeLevelFilter);
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
