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
 * A value object to carry the data for a PptPrepaidTypes.
 *
 *
 * <H3> A PptPrepaidTypes is: </H3>
 *
 * <!-- indent text -->
 * <TABLE BORDER="0" CELLPADDING="0" CELLSPACING="0">
 * <TR>
 * <TD WIDTH="25">&nbsp;</TD>
 * <TD>
 *
 * Holds details of Types of PrePaid SIMs
 *
 * <!-- end indent text -->
 * </TD>
 * </TR>
 * </TABLE>
 *
 *
 * <H3> PptPrepaidTypes Value Object: </H3>
 *
 * <!-- indent text -->
 * <TABLE BORDER="0" CELLPADDING="0" CELLSPACING="0">
 * <TR>
 * <TD WIDTH="25">&nbsp;</TD>
 * <TD>
 *
 * <P>
 *     This is a value object (called a Data Model Object or 'DMO').
 *     It is used to pass the data for a pptPrepaidTypes into and out of the BASE module.
 *     Because it's purpose is to carry data into and out of the module it is visible outside the module.
 * </P>
 * <P>
 *     This value object carries the data for one pptPrepaidTypes. A pptPrepaidTypes is:
 * Holds details of Types of PrePaid SIMs
 * </P>
 * <P>
 *     It corresponds to the business logic object PptPrepaidTypes which
 *     contains all the business behaviour of a pptPrepaidTypes but is not visible outside the
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
 *    This value object contains fields for all the details of a pptPrepaidTypes, namely:
 * </P>
 *


 * <P>
 *    <U>Fields to carry the Attributes of a pptPrepaidTypes:</U>
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
 *   <TD ALIGN="left" VALIGN="top"><B>pptType</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       PrePaid Type Code
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
 *       <A HREF="#getPptType()">
 *           getPptType
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setPptType(java.lang.String)">
 *           setPptType (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>pptDescription</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Description
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
 *       <A HREF="#getPptDescription()">
 *           getPptDescription
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setPptDescription(java.lang.String)">
 *           setPptDescription (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>pptCredit</B></TD>
 *   <TD ALIGN="left" VALIGN="top">BigDecimal</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Initial Credit Value
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
 *       <A HREF="#getPptCredit()">
 *           getPptCredit
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setPptCredit(java.math.BigDecimal)">
 *           setPptCredit (BigDecimal)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>pptValidity</B></TD>
 *   <TD ALIGN="left" VALIGN="top">Short</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Time allowed for Activation
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
 *       <A HREF="#getPptValidity()">
 *           getPptValidity
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setPptValidity(java.lang.Short)">
 *           setPptValidity (Short)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>pptValidityUnit</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Unit ("D"/"M"/"Y")
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
 *       <A HREF="#getPptValidityUnit()">
 *           getPptValidityUnit
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setPptValidityUnit(java.lang.String)">
 *           setPptValidityUnit (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>pptActivity</B></TD>
 *   <TD ALIGN="left" VALIGN="top">Short</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Time allowed for use of Credit Credit
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
 *       <A HREF="#getPptActivity()">
 *           getPptActivity
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setPptActivity(java.lang.Short)">
 *           setPptActivity (Short)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>pptActivityUnit</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Unit ("D"/"M"/"Y")
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
 *       <A HREF="#getPptActivityUnit()">
 *           getPptActivityUnit
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setPptActivityUnit(java.lang.String)">
 *           setPptActivityUnit (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>pptRecharge</B></TD>
 *   <TD ALIGN="left" VALIGN="top">Short</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Time allowed for Recharge
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
 *       <A HREF="#getPptRecharge()">
 *           getPptRecharge
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setPptRecharge(java.lang.Short)">
 *           setPptRecharge (Short)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>pptRechargeUnit</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Unit ("D"/"M"/"Y")
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
 *       <A HREF="#getPptRechargeUnit()">
 *           getPptRechargeUnit
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setPptRechargeUnit(java.lang.String)">
 *           setPptRechargeUnit (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>pptCreditWarn</B></TD>
 *   <TD ALIGN="left" VALIGN="top">BigDecimal</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Credit Value Warning
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
 *       <A HREF="#getPptCreditWarn()">
 *           getPptCreditWarn
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setPptCreditWarn(java.math.BigDecimal)">
 *           setPptCreditWarn (BigDecimal)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>pptValidityWarn</B></TD>
 *   <TD ALIGN="left" VALIGN="top">Short</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Time allowed for Activation Warning
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
 *       <A HREF="#getPptValidityWarn()">
 *           getPptValidityWarn
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setPptValidityWarn(java.lang.Short)">
 *           setPptValidityWarn (Short)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>pptValwarnUnit</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Unit ("D"/"M"/"Y")
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
 *       <A HREF="#getPptValwarnUnit()">
 *           getPptValwarnUnit
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setPptValwarnUnit(java.lang.String)">
 *           setPptValwarnUnit (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>pptActivityWarn</B></TD>
 *   <TD ALIGN="left" VALIGN="top">Short</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Time allowed for use of Credit Credit Warning
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
 *       <A HREF="#getPptActivityWarn()">
 *           getPptActivityWarn
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setPptActivityWarn(java.lang.Short)">
 *           setPptActivityWarn (Short)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>pptActwarnUnit</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Unit ("D"/"M"/"Y")
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
 *       <A HREF="#getPptActwarnUnit()">
 *           getPptActwarnUnit
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setPptActwarnUnit(java.lang.String)">
 *           setPptActwarnUnit (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>pptRechargeWarn</B></TD>
 *   <TD ALIGN="left" VALIGN="top">Short</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Time allowed for Recharge Warning
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
 *       <A HREF="#getPptRechargeWarn()">
 *           getPptRechargeWarn
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setPptRechargeWarn(java.lang.Short)">
 *           setPptRechargeWarn (Short)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>pptRechwarnUnit</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Unit ("D"/"M"/"Y")
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
 *       <A HREF="#getPptRechwarnUnit()">
 *           getPptRechwarnUnit
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setPptRechwarnUnit(java.lang.String)">
 *           setPptRechwarnUnit (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>pptDefPackage</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Default Package for SIM Type
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
 *       <A HREF="#getPptDefPackage()">
 *           getPptDefPackage
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setPptDefPackage(java.lang.String)">
 *           setPptDefPackage (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>pptDefTariff</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Default Tariff for SIM Type
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
 *       <A HREF="#getPptDefTariff()">
 *           getPptDefTariff
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setPptDefTariff(java.lang.String)">
 *           setPptDefTariff (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>pptChangeDef</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Change Default Package / Tariff at Activation
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
 *       <A HREF="#getPptChangeDef()">
 *           getPptChangeDef
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setPptChangeDef(java.lang.String)">
 *           setPptChangeDef (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>pptProfile</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       V6.
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
 *       <A HREF="#getPptProfile()">
 *           getPptProfile
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setPptProfile(java.lang.String)">
 *           setPptProfile (String)
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


 * @see PptPrepaidTypes
 *
 * @author
 * @version $Revision: $
 *
 * @since $jdk$
 */
public class PptPrepaidTypesDMO
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
      FIELD_TYPE_STRING /* std public attribute: pptType  */,
      FIELD_TYPE_STRING /* std public attribute: pptDescription  */,
      FIELD_TYPE_BIGDECIMAL /* std public attribute: pptCredit  */,
      FIELD_TYPE_SHORT /* std public attribute: pptValidity  */,
      FIELD_TYPE_STRING /* std public attribute: pptValidityUnit  */,
      FIELD_TYPE_SHORT /* std public attribute: pptActivity  */,
      FIELD_TYPE_STRING /* std public attribute: pptActivityUnit  */,
      FIELD_TYPE_SHORT /* std public attribute: pptRecharge  */,
      FIELD_TYPE_STRING /* std public attribute: pptRechargeUnit  */,
      FIELD_TYPE_BIGDECIMAL /* std public attribute: pptCreditWarn  */,
      FIELD_TYPE_SHORT /* std public attribute: pptValidityWarn  */,
      FIELD_TYPE_STRING /* std public attribute: pptValwarnUnit  */,
      FIELD_TYPE_SHORT /* std public attribute: pptActivityWarn  */,
      FIELD_TYPE_STRING /* std public attribute: pptActwarnUnit  */,
      FIELD_TYPE_SHORT /* std public attribute: pptRechargeWarn  */,
      FIELD_TYPE_STRING /* std public attribute: pptRechwarnUnit  */,
      FIELD_TYPE_STRING /* std public attribute: pptDefPackage  */,
      FIELD_TYPE_STRING /* std public attribute: pptDefTariff  */,
      FIELD_TYPE_STRING /* std public attribute: pptChangeDef  */
      /* The field ppt_profile_size does not exist in MTN Table
       FIELD_TYPE_STRING   std public attribute: pptProfile  */
    };
  
  /**
  * TODO SJ Implement the array of field sizes
  *
  */
  private final int[] fieldSizes = new int[] {
		  pptTypeSize,
		  pptDescriptionSize,
		  0,
		  0,
		  pptValidityUnitSize,
		  0,
		  pptActivityUnitSize,
		  0,
		  pptRechargeUnitSize,
		  0,
		  0,
		  pptValwarnUnitSize,
		  0,
		  pptActwarnUnitSize,
		  0,
		  pptRechwarnUnitSize,
		  pptDefPackageSize,
		  pptDefTariffSize,
		  pptChangeDefSize
  };
      

  public int[] fieldSizes() {
  	return fieldSizes;
  }  

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int pptTypeFilter = 0; // filter index
  private static final int pptTypeSize = 5; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int pptDescriptionFilter = 1; // filter index
  private static final int pptDescriptionSize = 50; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int pptCreditFilter = 2; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int pptValidityFilter = 3; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int pptValidityUnitFilter = 4; // filter index
  private static final int pptValidityUnitSize = 1; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int pptActivityFilter = 5; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int pptActivityUnitFilter = 6; // filter index
  private static final int pptActivityUnitSize = 1; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int pptRechargeFilter = 7; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int pptRechargeUnitFilter = 8; // filter index
  private static final int pptRechargeUnitSize = 1; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int pptCreditWarnFilter = 9; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int pptValidityWarnFilter = 10; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int pptValwarnUnitFilter = 11; // filter index
  private static final int pptValwarnUnitSize = 1; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int pptActivityWarnFilter = 12; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int pptActwarnUnitFilter = 13; // filter index
  private static final int pptActwarnUnitSize = 1; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int pptRechargeWarnFilter = 14; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int pptRechwarnUnitFilter = 15; // filter index
  private static final int pptRechwarnUnitSize = 1; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int pptDefPackageFilter = 16; // filter index
  private static final int pptDefPackageSize = 5; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int pptDefTariffFilter = 17; // filter index
  private static final int pptDefTariffSize = 20; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int pptChangeDefFilter = 18; // filter index
  private static final int pptChangeDefSize = 1; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  //The field ppt_profile_size does not exist in MTN Table
  /*
  public static final int pptProfileFilter = 19; // filter index
  private static final int pptProfileSize = 10; // field size
  */
  //~ Instance variables /////////////////////////////////////////////////////

  private BigDecimal pptCredit; // Loaded from Schema
  private BigDecimal pptCreditWarn; // Loaded from Schema
  private Short pptActivity; // Loaded from Schema
  private Short pptActivityWarn; // Loaded from Schema
  private Short pptRecharge; // Loaded from Schema
  private Short pptRechargeWarn; // Loaded from Schema
  private Short pptValidity; // Loaded from Schema
  private Short pptValidityWarn; // Loaded from Schema
  private String pptActivityUnit; // Loaded from Schema
  private String pptActwarnUnit; // Loaded from Schema
  private String pptChangeDef; // Loaded from Schema
  private String pptDefPackage; // Loaded from Schema
  private String pptDefTariff; // Loaded from Schema
  private String pptDescription; // Loaded from Schema
  // The field ppt_profile_size does not exist in MTN Table
  //  private String pptProfile; // Loaded from Schema
  private String pptRechargeUnit; // Loaded from Schema
  private String pptRechwarnUnit; // Loaded from Schema

  //---------------------
  // Field declarations
  //---------------------
  // all attributes
  private String pptType; // Loaded from Schema
  private String pptValidityUnit; // Loaded from Schema
  private String pptValwarnUnit; // Loaded from Schema

  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new PptPrepaidTypesDMO object.
   */
  public PptPrepaidTypesDMO(  ) {
  }

  // Constructor - taking public attributes
  /**
   * Creates a new PptPrepaidTypesDMO object.
   *
   * @param pptType DOCUMENT ME!
   * @param pptDescription DOCUMENT ME!
   * @param pptCredit DOCUMENT ME!
   * @param pptValidity DOCUMENT ME!
   * @param pptValidityUnit DOCUMENT ME!
   * @param pptActivity DOCUMENT ME!
   * @param pptActivityUnit DOCUMENT ME!
   * @param pptRecharge DOCUMENT ME!
   * @param pptRechargeUnit DOCUMENT ME!
   * @param pptCreditWarn DOCUMENT ME!
   * @param pptValidityWarn DOCUMENT ME!
   * @param pptValwarnUnit DOCUMENT ME!
   * @param pptActivityWarn DOCUMENT ME!
   * @param pptActwarnUnit DOCUMENT ME!
   * @param pptRechargeWarn DOCUMENT ME!
   * @param pptRechwarnUnit DOCUMENT ME!
   * @param pptDefPackage DOCUMENT ME!
   * @param pptDefTariff DOCUMENT ME!
   * @param pptChangeDef DOCUMENT ME!
   * @param pptProfile DOCUMENT ME!
   */
  public PptPrepaidTypesDMO( 
    final String     pptType,
    final String     pptDescription,
    final BigDecimal pptCredit,
    final Short      pptValidity,
    final String     pptValidityUnit,
    final Short      pptActivity,
    final String     pptActivityUnit,
    final Short      pptRecharge,
    final String     pptRechargeUnit,
    final BigDecimal pptCreditWarn,
    final Short      pptValidityWarn,
    final String     pptValwarnUnit,
    final Short      pptActivityWarn,
    final String     pptActwarnUnit,
    final Short      pptRechargeWarn,
    final String     pptRechwarnUnit,
    final String     pptDefPackage,
    final String     pptDefTariff,
    final String     pptChangeDef ) {
    // The field ppt_profile_size does not exist in MTN Table
    // final String     pptProfile ) {
    this.pptType = pptType;

    this.pptDescription = pptDescription;

    this.pptCredit = pptCredit;

    this.pptValidity = pptValidity;

    this.pptValidityUnit = pptValidityUnit;

    this.pptActivity = pptActivity;

    this.pptActivityUnit = pptActivityUnit;

    this.pptRecharge = pptRecharge;

    this.pptRechargeUnit = pptRechargeUnit;

    this.pptCreditWarn = pptCreditWarn;

    this.pptValidityWarn = pptValidityWarn;

    this.pptValwarnUnit = pptValwarnUnit;

    this.pptActivityWarn = pptActivityWarn;

    this.pptActwarnUnit = pptActwarnUnit;

    this.pptRechargeWarn = pptRechargeWarn;

    this.pptRechwarnUnit = pptRechwarnUnit;

    this.pptDefPackage = pptDefPackage;

    this.pptDefTariff = pptDefTariff;

    this.pptChangeDef = pptChangeDef;
    //    The field ppt_profile_size does not exist in MTN Table
    //    this.pptProfile = pptProfile;
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
    return new DAOArgs( 1 ).arg( ( this.pptType == null ) ? null
                                                          : this.pptType.trim(  ) );
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
      ( pptType == null ) ? null
                          : ( ( pptType.length(  ) <= pptTypeSize ) ? pptType
                                                                    : pptType
      .substring( 0, pptTypeSize ) // auto trimmed to fit, if required.
       ),
      ( pptDescription == null ) ? null
                                 : ( ( pptDescription.length(  ) <= pptDescriptionSize )
      ? pptDescription
      : pptDescription.substring( 0, pptDescriptionSize ) // auto trimmed to fit, if required.
       ), pptCredit, pptValidity,
      ( pptValidityUnit == null ) ? null
                                  : ( ( pptValidityUnit.length(  ) <= pptValidityUnitSize )
      ? pptValidityUnit
      : pptValidityUnit.substring( 0, pptValidityUnitSize ) // auto trimmed to fit, if required.
       ), pptActivity,
      ( pptActivityUnit == null ) ? null
                                  : ( ( pptActivityUnit.length(  ) <= pptActivityUnitSize )
      ? pptActivityUnit
      : pptActivityUnit.substring( 0, pptActivityUnitSize ) // auto trimmed to fit, if required.
       ), pptRecharge,
      ( pptRechargeUnit == null ) ? null
                                  : ( ( pptRechargeUnit.length(  ) <= pptRechargeUnitSize )
      ? pptRechargeUnit
      : pptRechargeUnit.substring( 0, pptRechargeUnitSize ) // auto trimmed to fit, if required.
       ), pptCreditWarn, pptValidityWarn,
      ( pptValwarnUnit == null ) ? null
                                 : ( ( pptValwarnUnit.length(  ) <= pptValwarnUnitSize )
      ? pptValwarnUnit
      : pptValwarnUnit.substring( 0, pptValwarnUnitSize ) // auto trimmed to fit, if required.
       ), pptActivityWarn,
      ( pptActwarnUnit == null ) ? null
                                 : ( ( pptActwarnUnit.length(  ) <= pptActwarnUnitSize )
      ? pptActwarnUnit
      : pptActwarnUnit.substring( 0, pptActwarnUnitSize ) // auto trimmed to fit, if required.
       ), pptRechargeWarn,
      ( pptRechwarnUnit == null ) ? null
                                  : ( ( pptRechwarnUnit.length(  ) <= pptRechwarnUnitSize )
      ? pptRechwarnUnit
      : pptRechwarnUnit.substring( 0, pptRechwarnUnitSize ) // auto trimmed to fit, if required.
       ),
      ( pptDefPackage == null ) ? null
                                : ( ( pptDefPackage.length(  ) <= pptDefPackageSize )
      ? pptDefPackage
      : pptDefPackage.substring( 0, pptDefPackageSize ) // auto trimmed to fit, if required.
       ),
      ( pptDefTariff == null ) ? null
                               : ( ( pptDefTariff.length(  ) <= pptDefTariffSize )
      ? pptDefTariff
      : pptDefTariff.substring( 0, pptDefTariffSize ) // auto trimmed to fit, if required.
       ),
      ( pptChangeDef == null ) ? null
                               : ( ( pptChangeDef.length(  ) <= pptChangeDefSize )
      ? pptChangeDef
      : pptChangeDef.substring( 0, pptChangeDefSize ) // auto trimmed to fit, if required.
       )
      // The field ppt_profile_size does not exist in MTN Table
      /*
      ,

      ( pptProfile == null ) ? null
                             : ( ( pptProfile.length(  ) <= pptProfileSize )
      ? pptProfile
      : pptProfile.substring( 0, pptProfileSize ) // auto trimmed to fit, if required.
       )
       */
    };
  }

  /**
   * DOCUMENT ME!
   *
   * @param fields DOCUMENT ME!
   */
  protected void set( final Object[] fields ) {
    pptType = rtrim( (String) fields[0] );
    pptDescription = rtrim( (String) fields[1] );
    pptCredit = (BigDecimal) fields[2];
    pptValidity = (Short) fields[3];
    pptValidityUnit = rtrim( (String) fields[4] );
    pptActivity = (Short) fields[5];
    pptActivityUnit = rtrim( (String) fields[6] );
    pptRecharge = (Short) fields[7];
    pptRechargeUnit = rtrim( (String) fields[8] );
    pptCreditWarn = (BigDecimal) fields[9];
    pptValidityWarn = (Short) fields[10];
    pptValwarnUnit = rtrim( (String) fields[11] );
    pptActivityWarn = (Short) fields[12];
    pptActwarnUnit = rtrim( (String) fields[13] );
    pptRechargeWarn = (Short) fields[14];
    pptRechwarnUnit = rtrim( (String) fields[15] );
    pptDefPackage = rtrim( (String) fields[16] );
    pptDefTariff = rtrim( (String) fields[17] );
    pptChangeDef = rtrim( (String) fields[18] );
   // The field ppt_profile_size does not exist in MTN Table
    // pptProfile = rtrim( (String) fields[19] );
  }

  // Get methods ///////////////////////////////////////////////////////////////
  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getPptType(  ) {
    return pptType;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getPptDescription(  ) {
    return pptDescription;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public BigDecimal getPptCredit(  ) {
    return pptCredit;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public Short getPptValidity(  ) {
    return pptValidity;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getPptValidityUnit(  ) {
    return pptValidityUnit;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public Short getPptActivity(  ) {
    return pptActivity;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getPptActivityUnit(  ) {
    return pptActivityUnit;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public Short getPptRecharge(  ) {
    return pptRecharge;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getPptRechargeUnit(  ) {
    return pptRechargeUnit;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public BigDecimal getPptCreditWarn(  ) {
    return pptCreditWarn;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public Short getPptValidityWarn(  ) {
    return pptValidityWarn;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getPptValwarnUnit(  ) {
    return pptValwarnUnit;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public Short getPptActivityWarn(  ) {
    return pptActivityWarn;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getPptActwarnUnit(  ) {
    return pptActwarnUnit;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public Short getPptRechargeWarn(  ) {
    return pptRechargeWarn;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getPptRechwarnUnit(  ) {
    return pptRechwarnUnit;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getPptDefPackage(  ) {
    return pptDefPackage;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getPptDefTariff(  ) {
    return pptDefTariff;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getPptChangeDef(  ) {
    return pptChangeDef;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
      // The field ppt_profile_size does not exist in MTN Table
  /*
  public String getPptProfile(  ) {
    return pptProfile;
  }
  */
  // Setter methods ///////////////////////////////////////////////////////////////

  //
  // Master setter follows...
  //

  /**
   * Setter that takes all attributes
   */
  public void set( 
    final String     pptType,
    final String     pptDescription,
    final BigDecimal pptCredit,
    final Short      pptValidity,
    final String     pptValidityUnit,
    final Short      pptActivity,
    final String     pptActivityUnit,
    final Short      pptRecharge,
    final String     pptRechargeUnit,
    final BigDecimal pptCreditWarn,
    final Short      pptValidityWarn,
    final String     pptValwarnUnit,
    final Short      pptActivityWarn,
    final String     pptActwarnUnit,
    final Short      pptRechargeWarn,
    final String     pptRechwarnUnit,
    final String     pptDefPackage,
    final String     pptDefTariff,
    final String     pptChangeDef
    // The field ppt_profile_size does not exist in MTN Table
    /*	    ,
    final String     pptProfile */
	) {
    this.pptType = pptType;
    this.pptDescription = pptDescription;
    this.pptCredit = pptCredit;
    this.pptValidity = pptValidity;
    this.pptValidityUnit = pptValidityUnit;
    this.pptActivity = pptActivity;
    this.pptActivityUnit = pptActivityUnit;
    this.pptRecharge = pptRecharge;
    this.pptRechargeUnit = pptRechargeUnit;
    this.pptCreditWarn = pptCreditWarn;
    this.pptValidityWarn = pptValidityWarn;
    this.pptValwarnUnit = pptValwarnUnit;
    this.pptActivityWarn = pptActivityWarn;
    this.pptActwarnUnit = pptActwarnUnit;
    this.pptRechargeWarn = pptRechargeWarn;
    this.pptRechwarnUnit = pptRechwarnUnit;
    this.pptDefPackage = pptDefPackage;
    this.pptDefTariff = pptDefTariff;
    this.pptChangeDef = pptChangeDef;
    // The field ppt_profile_size does not exist in MTN Table
    // this.pptProfile = pptProfile;
  }

  //
  // Public access modifiers if any
  // (provided for attributes that are public in the analysis model)
  //    

  /**
  * Sets the PptType field.
  *
  * @param pptType
  */
  public void setPptType( final String pptType ) {
    this.pptType = getPadded(pptType, pptTypeFilter);
  }

  /**
  * Sets the PptDescription field.
  *
  * @param pptDescription
  */
  public void setPptDescription( final String pptDescription ) {
    this.pptDescription = getPadded(pptDescription, pptDescriptionFilter);
  }

  /**
  * Sets the PptCredit field.
  *
  * @param pptCredit
  */
  public void setPptCredit( final BigDecimal pptCredit ) {
    this.pptCredit = pptCredit;
  }

  /**
  * Sets the PptCredit field.
  *
  * @param pptCredit
  */
  public void setPptCredit( final double pptCredit ) {
    this.pptCredit = new BigDecimal( pptCredit );
  }

  /**
  * Sets the PptValidity field.
  *
  * @param pptValidity
  */
  public void setPptValidity( final Short pptValidity ) {
    this.pptValidity = pptValidity;
  }

  /**
  * Sets the PptValidity field.
  *
  * @param pptValidity
  */
  public void setPptValidity( final int pptValidity ) {
    this.pptValidity = Short.valueOf( (short) pptValidity );
  }

  /**
  * Sets the PptValidityUnit field.
  *
  * @param pptValidityUnit
  */
  public void setPptValidityUnit( final String pptValidityUnit ) {
    this.pptValidityUnit = getPadded(pptValidityUnit, pptValidityUnitFilter);
  }

  /**
  * Sets the PptActivity field.
  *
  * @param pptActivity
  */
  public void setPptActivity( final Short pptActivity ) {
    this.pptActivity = pptActivity;
  }

  /**
  * Sets the PptActivity field.
  *
  * @param pptActivity
  */
  public void setPptActivity( final int pptActivity ) {
    this.pptActivity = Short.valueOf( (short) pptActivity );
  }

  /**
  * Sets the PptActivityUnit field.
  *
  * @param pptActivityUnit
  */
  public void setPptActivityUnit( final String pptActivityUnit ) {
    this.pptActivityUnit = getPadded(pptActivityUnit, pptActivityUnitFilter);
  }

  /**
  * Sets the PptRecharge field.
  *
  * @param pptRecharge
  */
  public void setPptRecharge( final Short pptRecharge ) {
    this.pptRecharge = pptRecharge;
  }

  /**
  * Sets the PptRecharge field.
  *
  * @param pptRecharge
  */
  public void setPptRecharge( final int pptRecharge ) {
    this.pptRecharge = Short.valueOf( (short) pptRecharge );
  }

  /**
  * Sets the PptRechargeUnit field.
  *
  * @param pptRechargeUnit
  */
  public void setPptRechargeUnit( final String pptRechargeUnit ) {
    this.pptRechargeUnit = getPadded(pptRechargeUnit, pptRechargeUnitFilter);
  }

  /**
  * Sets the PptCreditWarn field.
  *
  * @param pptCreditWarn
  */
  public void setPptCreditWarn( final BigDecimal pptCreditWarn ) {
    this.pptCreditWarn = pptCreditWarn;
  }

  /**
  * Sets the PptCreditWarn field.
  *
  * @param pptCreditWarn
  */
  public void setPptCreditWarn( final double pptCreditWarn ) {
    this.pptCreditWarn = new BigDecimal( pptCreditWarn );
  }

  /**
  * Sets the PptValidityWarn field.
  *
  * @param pptValidityWarn
  */
  public void setPptValidityWarn( final Short pptValidityWarn ) {
    this.pptValidityWarn = pptValidityWarn;
  }

  /**
  * Sets the PptValidityWarn field.
  *
  * @param pptValidityWarn
  */
  public void setPptValidityWarn( final int pptValidityWarn ) {
    this.pptValidityWarn = Short.valueOf( (short) pptValidityWarn );
  }

  /**
  * Sets the PptValwarnUnit field.
  *
  * @param pptValwarnUnit
  */
  public void setPptValwarnUnit( final String pptValwarnUnit ) {
    this.pptValwarnUnit = getPadded(pptValwarnUnit, pptValwarnUnitFilter);
  }

  /**
  * Sets the PptActivityWarn field.
  *
  * @param pptActivityWarn
  */
  public void setPptActivityWarn( final Short pptActivityWarn ) {
    this.pptActivityWarn = pptActivityWarn;
  }

  /**
  * Sets the PptActivityWarn field.
  *
  * @param pptActivityWarn
  */
  public void setPptActivityWarn( final int pptActivityWarn ) {
    this.pptActivityWarn = Short.valueOf( (short) pptActivityWarn );
  }

  /**
  * Sets the PptActwarnUnit field.
  *
  * @param pptActwarnUnit
  */
  public void setPptActwarnUnit( final String pptActwarnUnit ) {
    this.pptActwarnUnit = getPadded(pptActwarnUnit, pptActwarnUnitFilter);
  }

  /**
  * Sets the PptRechargeWarn field.
  *
  * @param pptRechargeWarn
  */
  public void setPptRechargeWarn( final Short pptRechargeWarn ) {
    this.pptRechargeWarn = pptRechargeWarn;
  }

  /**
  * Sets the PptRechargeWarn field.
  *
  * @param pptRechargeWarn
  */
  public void setPptRechargeWarn( final int pptRechargeWarn ) {
    this.pptRechargeWarn = Short.valueOf( (short) pptRechargeWarn );
  }

  /**
  * Sets the PptRechwarnUnit field.
  *
  * @param pptRechwarnUnit
  */
  public void setPptRechwarnUnit( final String pptRechwarnUnit ) {
    this.pptRechwarnUnit = getPadded(pptRechwarnUnit, pptRechwarnUnitFilter);
  }

  /**
  * Sets the PptDefPackage field.
  *
  * @param pptDefPackage
  */
  public void setPptDefPackage( final String pptDefPackage ) {
    this.pptDefPackage = getPadded(pptDefPackage, pptDefPackageFilter);
  }

  /**
  * Sets the PptDefTariff field.
  *
  * @param pptDefTariff
  */
  public void setPptDefTariff( final String pptDefTariff ) {
    this.pptDefTariff = getPadded(pptDefTariff, pptDefTariffFilter);
  }

  /**
  * Sets the PptChangeDef field.
  *
  * @param pptChangeDef
  */
  public void setPptChangeDef( final String pptChangeDef ) {
    this.pptChangeDef = getPadded(pptChangeDef, pptChangeDefFilter);
  }

  /**
  * Sets the PptProfile field.
  *
  * @param pptProfile
  */
  // The field ppt_profile_size does not exist in MTN Table
  /*
  public void setPptProfile( final String pptProfile ) {
    this.pptProfile = pptProfile;
  }
  */

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
