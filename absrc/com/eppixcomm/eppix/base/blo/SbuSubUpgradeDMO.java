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
import java.util.Arrays;
import java.util.List;

//---------------------
// class javadoc
//---------------------
/**
 * A value object to carry the data for a SbuSubUpgrade.
 *
 *
 * <H3> A SbuSubUpgrade is: </H3>
 *
 * <!-- indent text -->
 * <TABLE BORDER="0" CELLPADDING="0" CELLSPACING="0">
 * <TR>
 * <TD WIDTH="25">&nbsp;</TD>
 * <TD>
 *
 * Used for Subscriber Upgrade.
 * <p>
 *   Little used piece of functionality.
 * </p>
 *
 * <!-- end indent text -->
 * </TD>
 * </TR>
 * </TABLE>
 *
 *
 * <H3> SbuSubUpgrade Value Object: </H3>
 *
 * <!-- indent text -->
 * <TABLE BORDER="0" CELLPADDING="0" CELLSPACING="0">
 * <TR>
 * <TD WIDTH="25">&nbsp;</TD>
 * <TD>
 *
 * <P>
 *     This is a value object (called a Data Model Object or 'DMO').
 *     It is used to pass the data for a sbuSubUpgrade into and out of the BASE module.
 *     Because it's purpose is to carry data into and out of the module it is visible outside the module.
 * </P>
 * <P>
 *     This value object carries the data for one sbuSubUpgrade. A sbuSubUpgrade is:
 * Used for Subscriber Upgrade.
 * </P>
 * <P>
 *     It corresponds to the business logic object SbuSubUpgrade which
 *     contains all the business behaviour of a sbuSubUpgrade but is not visible outside the
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
 *    This value object contains fields for all the details of a sbuSubUpgrade, namely:
 * </P>
 *


 * <P>
 *    <U>Fields to carry the Attributes of a sbuSubUpgrade:</U>
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
 *   <TD ALIGN="left" VALIGN="top"><B>sbuSubupgradeId</B></TD>
 *   <TD ALIGN="left" VALIGN="top">Integer</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
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
 *       <A HREF="#getSbuSubupgradeId()">
 *           getSbuSubupgradeId
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setSbuSubupgradeId(java.lang.Integer)">
 *           setSbuSubupgradeId (Integer)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>sbuSubscriberId</B></TD>
 *   <TD ALIGN="left" VALIGN="top">Integer</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
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
 *       <A HREF="#getSbuSubscriberId()">
 *           getSbuSubscriberId
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setSbuSubscriberId(java.lang.Integer)">
 *           setSbuSubscriberId (Integer)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>sbuDealerId</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Dealer id
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
 *       <A HREF="#getSbuDealerId()">
 *           getSbuDealerId
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setSbuDealerId(java.lang.String)">
 *           setSbuDealerId (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>sbuSalesPerson</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Sales person
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
 *       <A HREF="#getSbuSalesPerson()">
 *           getSbuSalesPerson
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setSbuSalesPerson(java.lang.String)">
 *           setSbuSalesPerson (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>sbuUpgradeQual</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Upgrade Quality
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
 *       <A HREF="#getSbuUpgradeQual()">
 *           getSbuUpgradeQual
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setSbuUpgradeQual(java.lang.String)">
 *           setSbuUpgradeQual (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>sbuComment</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Comment
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
 *       <A HREF="#getSbuComment()">
 *           getSbuComment
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setSbuComment(java.lang.String)">
 *           setSbuComment (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>sbuUserId</B></TD>
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
 *       <A HREF="#getSbuUserId()">
 *           getSbuUserId
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setSbuUserId(java.lang.String)">
 *           setSbuUserId (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>sbuModelId</B></TD>
 *   <TD ALIGN="left" VALIGN="top">Integer</TD>
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
 *       <A HREF="#getSbuModelId()">
 *           getSbuModelId
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setSbuModelId(java.lang.Integer)">
 *           setSbuModelId (Integer)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>sbuContractLen</B></TD>
 *   <TD ALIGN="left" VALIGN="top">Integer</TD>
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
 *       <A HREF="#getSbuContractLen()">
 *           getSbuContractLen
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setSbuContractLen(java.lang.Integer)">
 *           setSbuContractLen (Integer)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>sbuCost</B></TD>
 *   <TD ALIGN="left" VALIGN="top">BigDecimal</TD>
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
 *       <A HREF="#getSbuCost()">
 *           getSbuCost
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setSbuCost(java.math.BigDecimal)">
 *           setSbuCost (BigDecimal)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>sbuImei</B></TD>
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
 *       <A HREF="#getSbuImei()">
 *           getSbuImei
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setSbuImei(java.lang.String)">
 *           setSbuImei (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>sbuRegionCode</B></TD>
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
 *       <A HREF="#getSbuRegionCode()">
 *           getSbuRegionCode
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setSbuRegionCode(java.lang.String)">
 *           setSbuRegionCode (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>sbuAccountStatus</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
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
 *       <A HREF="#getSbuAccountStatus()">
 *           getSbuAccountStatus
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setSbuAccountStatus(java.lang.String)">
 *           setSbuAccountStatus (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>sbuCollPlan</B></TD>
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
 *       <A HREF="#getSbuCollPlan()">
 *           getSbuCollPlan
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setSbuCollPlan(java.lang.String)">
 *           setSbuCollPlan (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>sbuMtnStatus</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
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
 *       <A HREF="#getSbuMtnStatus()">
 *           getSbuMtnStatus
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setSbuMtnStatus(java.lang.String)">
 *           setSbuMtnStatus (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>sbuActivateDate</B></TD>
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
 *       <A HREF="#getSbuActivateDate()">
 *           getSbuActivateDate
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setSbuActivateDate(com.cmgwds.eppix.util.Date)">
 *           setSbuActivateDate (Date)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>sbuDeactDate</B></TD>
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
 *       <A HREF="#getSbuDeactDate()">
 *           getSbuDeactDate
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setSbuDeactDate(com.cmgwds.eppix.util.Date)">
 *           setSbuDeactDate (Date)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>sbuContractAge</B></TD>
 *   <TD ALIGN="left" VALIGN="top">Integer</TD>
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
 *       <A HREF="#getSbuContractAge()">
 *           getSbuContractAge
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setSbuContractAge(java.lang.Integer)">
 *           setSbuContractAge (Integer)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>sbuCustomerType</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
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
 *       <A HREF="#getSbuCustomerType()">
 *           getSbuCustomerType
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setSbuCustomerType(java.lang.String)">
 *           setSbuCustomerType (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>sbuTariffCode</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
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
 *       <A HREF="#getSbuTariffCode()">
 *           getSbuTariffCode
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setSbuTariffCode(java.lang.String)">
 *           setSbuTariffCode (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>sbuPackageCode</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
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
 *       <A HREF="#getSbuPackageCode()">
 *           getSbuPackageCode
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setSbuPackageCode(java.lang.String)">
 *           setSbuPackageCode (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>sbuPaymentPlan</B></TD>
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
 *       <A HREF="#getSbuPaymentPlan()">
 *           getSbuPaymentPlan
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setSbuPaymentPlan(java.lang.String)">
 *           setSbuPaymentPlan (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>sbuTermDate</B></TD>
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
 *       <A HREF="#getSbuTermDate()">
 *           getSbuTermDate
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setSbuTermDate(com.cmgwds.eppix.util.Date)">
 *           setSbuTermDate (Date)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>sbuAgeingBucket</B></TD>
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
 *       <A HREF="#getSbuAgeingBucket()">
 *           getSbuAgeingBucket
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setSbuAgeingBucket(java.lang.String)">
 *           setSbuAgeingBucket (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>sbuAveragespend</B></TD>
 *   <TD ALIGN="left" VALIGN="top">BigDecimal</TD>
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
 *       <A HREF="#getSbuAveragespend()">
 *           getSbuAveragespend
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setSbuAveragespend(java.math.BigDecimal)">
 *           setSbuAveragespend (BigDecimal)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>sbuDateprocessed</B></TD>
 *   <TD ALIGN="left" VALIGN="top">DateTime</TD>
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
 *       <A HREF="#getSbuDateprocessed()">
 *           getSbuDateprocessed
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setSbuDateprocessed(com.cmgwds.eppix.util.DateTime)">
 *           setSbuDateprocessed (DateTime)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>sbuDateapproved</B></TD>
 *   <TD ALIGN="left" VALIGN="top">DateTime</TD>
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
 *       <A HREF="#getSbuDateapproved()">
 *           getSbuDateapproved
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setSbuDateapproved(com.cmgwds.eppix.util.DateTime)">
 *           setSbuDateapproved (DateTime)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>sbuUpgradeStatus</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
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
 *       <A HREF="#getSbuUpgradeStatus()">
 *           getSbuUpgradeStatus
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setSbuUpgradeStatus(java.lang.String)">
 *           setSbuUpgradeStatus (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>sbuChannel</B></TD>
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
 *       <A HREF="#getSbuChannel()">
 *           getSbuChannel
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setSbuChannel(java.lang.String)">
 *           setSbuChannel (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>sbuRecordStatus</B></TD>
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
 *       <A HREF="#getSbuRecordStatus()">
 *           getSbuRecordStatus
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setSbuRecordStatus(java.lang.String)">
 *           setSbuRecordStatus (String)
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


 * @see SbuSubUpgrade
 *
 * @author
 * @version $Revision: $
 *
 * @since $jdk$
 */
public class SbuSubUpgradeDMO
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
      FIELD_TYPE_INTEGER /* std public attribute: sbuSubupgradeId  */,
      FIELD_TYPE_INTEGER /* std public attribute: sbuSubscriberId  */,
      FIELD_TYPE_STRING /* std public attribute: sbuDealerId  */,
      FIELD_TYPE_STRING /* std public attribute: sbuSalesPerson  */,
      FIELD_TYPE_STRING /* std public attribute: sbuUpgradeQual  */,
      FIELD_TYPE_STRING /* std public attribute: sbuComment  */,
      FIELD_TYPE_STRING /* std public attribute: sbuUserId  */,
      FIELD_TYPE_INTEGER /* std public attribute: sbuModelId  */,
      FIELD_TYPE_INTEGER /* std public attribute: sbuContractLen  */,
      FIELD_TYPE_BIGDECIMAL /* std public attribute: sbuCost  */,
      FIELD_TYPE_STRING /* std public attribute: sbuImei  */,
      FIELD_TYPE_STRING /* std public attribute: sbuRegionCode  */,
      FIELD_TYPE_STRING /* std public attribute: sbuAccountStatus  */,
      FIELD_TYPE_STRING /* std public attribute: sbuCollPlan  */,
      FIELD_TYPE_STRING /* std public attribute: sbuMtnStatus  */,
      FIELD_TYPE_DATEONLY /* std public attribute: sbuActivateDate  */,
      FIELD_TYPE_DATEONLY /* std public attribute: sbuDeactDate  */,
      FIELD_TYPE_INTEGER /* std public attribute: sbuContractAge  */,
      FIELD_TYPE_STRING /* std public attribute: sbuCustomerType  */,
      FIELD_TYPE_STRING /* std public attribute: sbuTariffCode  */,
      FIELD_TYPE_STRING /* std public attribute: sbuPackageCode  */,
      FIELD_TYPE_STRING /* std public attribute: sbuPaymentPlan  */,
      FIELD_TYPE_DATEONLY /* std public attribute: sbuTermDate  */,
      FIELD_TYPE_STRING /* std public attribute: sbuAgeingBucket  */,
      FIELD_TYPE_BIGDECIMAL /* std public attribute: sbuAveragespend  */,
      FIELD_TYPE_DATETIME /* std public attribute: sbuDateprocessed  */,
      FIELD_TYPE_DATETIME /* std public attribute: sbuDateapproved  */,
      FIELD_TYPE_STRING /* std public attribute: sbuUpgradeStatus  */,
      FIELD_TYPE_STRING /* std public attribute: sbuChannel  */,
      FIELD_TYPE_STRING /* std public attribute: sbuRecordStatus  */
    };
  
  private final int[] fieldSizes = new int[] {
		  0,
		  0,
		  sbuDealerIdSize,
		  sbuSalesPersonSize,
		  sbuUpgradeQualSize,
		  sbuCommentSize,
		  sbuUserIdSize,
		  0,
		  0,
		  0,
		  sbuImeiSize,
		  sbuRegionCodeSize,
		  sbuAccountStatusSize,
		  sbuCollPlanSize,
		  sbuMtnStatusSize,
		  0,
		  0,
		  0,
		  sbuCustomerTypeSize,
		  sbuTariffCodeSize,
		  sbuPackageCodeSize,
		  sbuPaymentPlanSize,
		  0,
		  sbuAgeingBucketSize,
		  0,
		  0,
		  0,
		  sbuUpgradeStatusSize,
		  sbuChannelSize,
		  sbuRecordStatusSize
  };
      

  public int[] fieldSizes() {
  	return fieldSizes;
  }  

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int sbuSubupgradeIdFilter = 0; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int sbuSubscriberIdFilter = 1; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int sbuDealerIdFilter = 2; // filter index
  private static final int sbuDealerIdSize = 8; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int sbuSalesPersonFilter = 3; // filter index
  private static final int sbuSalesPersonSize = 10; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int sbuUpgradeQualFilter = 4; // filter index
  private static final int sbuUpgradeQualSize = 1; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int sbuCommentFilter = 5; // filter index
  private static final int sbuCommentSize = 64; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int sbuUserIdFilter = 6; // filter index
  private static final int sbuUserIdSize = 10; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int sbuModelIdFilter = 7; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int sbuContractLenFilter = 8; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int sbuCostFilter = 9; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int sbuImeiFilter = 10; // filter index
  private static final int sbuImeiSize = 15; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int sbuRegionCodeFilter = 11; // filter index
  private static final int sbuRegionCodeSize = 6; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int sbuAccountStatusFilter = 12; // filter index
  private static final int sbuAccountStatusSize = 15; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int sbuCollPlanFilter = 13; // filter index
  private static final int sbuCollPlanSize = 15; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int sbuMtnStatusFilter = 14; // filter index
  private static final int sbuMtnStatusSize = 15; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int sbuActivateDateFilter = 15; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int sbuDeactDateFilter = 16; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int sbuContractAgeFilter = 17; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int sbuCustomerTypeFilter = 18; // filter index
  private static final int sbuCustomerTypeSize = 5; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int sbuTariffCodeFilter = 19; // filter index
  private static final int sbuTariffCodeSize = 20; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int sbuPackageCodeFilter = 20; // filter index
  private static final int sbuPackageCodeSize = 5; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int sbuPaymentPlanFilter = 21; // filter index
  private static final int sbuPaymentPlanSize = 10; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int sbuTermDateFilter = 22; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int sbuAgeingBucketFilter = 23; // filter index
  private static final int sbuAgeingBucketSize = 10; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int sbuAveragespendFilter = 24; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int sbuDateprocessedFilter = 25; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int sbuDateapprovedFilter = 26; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int sbuUpgradeStatusFilter = 27; // filter index
  private static final int sbuUpgradeStatusSize = 1; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int sbuChannelFilter = 28; // filter index
  private static final int sbuChannelSize = 1; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int sbuRecordStatusFilter = 29; // filter index
  private static final int sbuRecordStatusSize = 1; // field size

  //~ Instance variables /////////////////////////////////////////////////////

  private BigDecimal sbuAveragespend; // Loaded from Schema
  private BigDecimal sbuCost; // Loaded from Schema
  private Date sbuActivateDate; // Loaded from Schema
  private Date sbuDeactDate; // Loaded from Schema
  private Date sbuTermDate; // Loaded from Schema
  private DateTime sbuDateapproved; // Loaded from Schema
  private DateTime sbuDateprocessed; // Loaded from Schema
  private Integer sbuContractAge; // Loaded from Schema
  private Integer sbuContractLen; // Loaded from Schema
  private Integer sbuModelId; // Loaded from Schema
  private Integer sbuSubscriberId; // Loaded from Schema

  //---------------------
  // Field declarations
  //---------------------
  // all attributes
  private Integer sbuSubupgradeId; // Loaded from Schema
  private String sbuAccountStatus; // Loaded from Schema
  private String sbuAgeingBucket; // Loaded from Schema
  private String sbuChannel; // Loaded from Schema
  private String sbuCollPlan; // Loaded from Schema
  private String sbuComment; // Loaded from Schema
  private String sbuCustomerType; // Loaded from Schema
  private String sbuDealerId; // Loaded from Schema
  private String sbuImei; // Loaded from Schema
  private String sbuMtnStatus; // Loaded from Schema
  private String sbuPackageCode; // Loaded from Schema
  private String sbuPaymentPlan; // Loaded from Schema
  private String sbuRecordStatus; // Loaded from Schema
  private String sbuRegionCode; // Loaded from Schema
  private String sbuSalesPerson; // Loaded from Schema
  private String sbuTariffCode; // Loaded from Schema
  private String sbuUpgradeQual; // Loaded from Schema
  private String sbuUpgradeStatus; // Loaded from Schema
  private String sbuUserId; // Loaded from Schema

  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new SbuSubUpgradeDMO object.
   */
  public SbuSubUpgradeDMO(  ) {
  }

  // Constructor - taking public attributes
  /**
   * Creates a new SbuSubUpgradeDMO object.
   *
   * @param sbuSubupgradeId DOCUMENT ME!
   * @param sbuSubscriberId DOCUMENT ME!
   * @param sbuDealerId DOCUMENT ME!
   * @param sbuSalesPerson DOCUMENT ME!
   * @param sbuUpgradeQual DOCUMENT ME!
   * @param sbuComment DOCUMENT ME!
   * @param sbuUserId DOCUMENT ME!
   * @param sbuModelId DOCUMENT ME!
   * @param sbuContractLen DOCUMENT ME!
   * @param sbuCost DOCUMENT ME!
   * @param sbuImei DOCUMENT ME!
   * @param sbuRegionCode DOCUMENT ME!
   * @param sbuAccountStatus DOCUMENT ME!
   * @param sbuCollPlan DOCUMENT ME!
   * @param sbuMtnStatus DOCUMENT ME!
   * @param sbuActivateDate DOCUMENT ME!
   * @param sbuDeactDate DOCUMENT ME!
   * @param sbuContractAge DOCUMENT ME!
   * @param sbuCustomerType DOCUMENT ME!
   * @param sbuTariffCode DOCUMENT ME!
   * @param sbuPackageCode DOCUMENT ME!
   * @param sbuPaymentPlan DOCUMENT ME!
   * @param sbuTermDate DOCUMENT ME!
   * @param sbuAgeingBucket DOCUMENT ME!
   * @param sbuAveragespend DOCUMENT ME!
   * @param sbuDateprocessed DOCUMENT ME!
   * @param sbuDateapproved DOCUMENT ME!
   * @param sbuUpgradeStatus DOCUMENT ME!
   * @param sbuChannel DOCUMENT ME!
   * @param sbuRecordStatus DOCUMENT ME!
   */
  public SbuSubUpgradeDMO( 
    final Integer    sbuSubupgradeId,
    final Integer    sbuSubscriberId,
    final String     sbuDealerId,
    final String     sbuSalesPerson,
    final String     sbuUpgradeQual,
    final String     sbuComment,
    final String     sbuUserId,
    final Integer    sbuModelId,
    final Integer    sbuContractLen,
    final BigDecimal sbuCost,
    final String     sbuImei,
    final String     sbuRegionCode,
    final String     sbuAccountStatus,
    final String     sbuCollPlan,
    final String     sbuMtnStatus,
    final Date       sbuActivateDate,
    final Date       sbuDeactDate,
    final Integer    sbuContractAge,
    final String     sbuCustomerType,
    final String     sbuTariffCode,
    final String     sbuPackageCode,
    final String     sbuPaymentPlan,
    final Date       sbuTermDate,
    final String     sbuAgeingBucket,
    final BigDecimal sbuAveragespend,
    final DateTime   sbuDateprocessed,
    final DateTime   sbuDateapproved,
    final String     sbuUpgradeStatus,
    final String     sbuChannel,
    final String     sbuRecordStatus ) {
    this.sbuSubupgradeId = sbuSubupgradeId;

    this.sbuSubscriberId = sbuSubscriberId;

    this.sbuDealerId = sbuDealerId;

    this.sbuSalesPerson = sbuSalesPerson;

    this.sbuUpgradeQual = sbuUpgradeQual;

    this.sbuComment = sbuComment;

    this.sbuUserId = sbuUserId;

    this.sbuModelId = sbuModelId;

    this.sbuContractLen = sbuContractLen;

    this.sbuCost = sbuCost;

    this.sbuImei = sbuImei;

    this.sbuRegionCode = sbuRegionCode;

    this.sbuAccountStatus = sbuAccountStatus;

    this.sbuCollPlan = sbuCollPlan;

    this.sbuMtnStatus = sbuMtnStatus;

    this.sbuActivateDate = ( sbuActivateDate != null )
      ? new Date( sbuActivateDate ) : null;

    this.sbuDeactDate = ( sbuDeactDate != null ) ? new Date( sbuDeactDate )
                                                 : null;

    this.sbuContractAge = sbuContractAge;

    this.sbuCustomerType = sbuCustomerType;

    this.sbuTariffCode = sbuTariffCode;

    this.sbuPackageCode = sbuPackageCode;

    this.sbuPaymentPlan = sbuPaymentPlan;

    this.sbuTermDate = ( sbuTermDate != null ) ? new Date( sbuTermDate ) : null;

    this.sbuAgeingBucket = sbuAgeingBucket;

    this.sbuAveragespend = sbuAveragespend;

    this.sbuDateprocessed = ( sbuDateprocessed != null )
      ? new DateTime( sbuDateprocessed ) : null;

    this.sbuDateapproved = ( sbuDateapproved != null )
      ? new DateTime( sbuDateapproved ) : null;

    this.sbuUpgradeStatus = sbuUpgradeStatus;

    this.sbuChannel = sbuChannel;

    this.sbuRecordStatus = sbuRecordStatus;
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
    return new DAOArgs( 0 );
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
      sbuSubupgradeId, sbuSubscriberId,
      ( sbuDealerId == null ) ? null
                              : ( ( sbuDealerId.length(  ) <= sbuDealerIdSize )
      ? sbuDealerId
      : sbuDealerId.substring( 0, sbuDealerIdSize ) // auto trimmed to fit, if required.
       ),
      ( sbuSalesPerson == null ) ? null
                                 : ( ( sbuSalesPerson.length(  ) <= sbuSalesPersonSize )
      ? sbuSalesPerson
      : sbuSalesPerson.substring( 0, sbuSalesPersonSize ) // auto trimmed to fit, if required.
       ),
      ( sbuUpgradeQual == null ) ? null
                                 : ( ( sbuUpgradeQual.length(  ) <= sbuUpgradeQualSize )
      ? sbuUpgradeQual
      : sbuUpgradeQual.substring( 0, sbuUpgradeQualSize ) // auto trimmed to fit, if required.
       ),
      ( sbuComment == null ) ? null
                             : ( ( sbuComment.length(  ) <= sbuCommentSize )
      ? sbuComment
      : sbuComment.substring( 0, sbuCommentSize ) // auto trimmed to fit, if required.
       ),
      ( sbuUserId == null ) ? null
                            : ( ( sbuUserId.length(  ) <= sbuUserIdSize )
      ? sbuUserId
      : sbuUserId.substring( 0, sbuUserIdSize ) // auto trimmed to fit, if required.
       ), sbuModelId, sbuContractLen, sbuCost,
      ( sbuImei == null ) ? null
                          : ( ( sbuImei.length(  ) <= sbuImeiSize ) ? sbuImei
                                                                    : sbuImei
      .substring( 0, sbuImeiSize ) // auto trimmed to fit, if required.
       ),
      ( sbuRegionCode == null ) ? null
                                : ( ( sbuRegionCode.length(  ) <= sbuRegionCodeSize )
      ? sbuRegionCode
      : sbuRegionCode.substring( 0, sbuRegionCodeSize ) // auto trimmed to fit, if required.
       ),
      ( sbuAccountStatus == null ) ? null
                                   : ( ( sbuAccountStatus.length(  ) <= sbuAccountStatusSize )
      ? sbuAccountStatus
      : sbuAccountStatus.substring( 0, sbuAccountStatusSize ) // auto trimmed to fit, if required.
       ),
      ( sbuCollPlan == null ) ? null
                              : ( ( sbuCollPlan.length(  ) <= sbuCollPlanSize )
      ? sbuCollPlan
      : sbuCollPlan.substring( 0, sbuCollPlanSize ) // auto trimmed to fit, if required.
       ),
      ( sbuMtnStatus == null ) ? null
                               : ( ( sbuMtnStatus.length(  ) <= sbuMtnStatusSize )
      ? sbuMtnStatus
      : sbuMtnStatus.substring( 0, sbuMtnStatusSize ) // auto trimmed to fit, if required.
       ), sbuActivateDate, sbuDeactDate, sbuContractAge,
      ( sbuCustomerType == null ) ? null
                                  : ( ( sbuCustomerType.length(  ) <= sbuCustomerTypeSize )
      ? sbuCustomerType
      : sbuCustomerType.substring( 0, sbuCustomerTypeSize ) // auto trimmed to fit, if required.
       ),
      ( sbuTariffCode == null ) ? null
                                : ( ( sbuTariffCode.length(  ) <= sbuTariffCodeSize )
      ? sbuTariffCode
      : sbuTariffCode.substring( 0, sbuTariffCodeSize ) // auto trimmed to fit, if required.
       ),
      ( sbuPackageCode == null ) ? null
                                 : ( ( sbuPackageCode.length(  ) <= sbuPackageCodeSize )
      ? sbuPackageCode
      : sbuPackageCode.substring( 0, sbuPackageCodeSize ) // auto trimmed to fit, if required.
       ),
      ( sbuPaymentPlan == null ) ? null
                                 : ( ( sbuPaymentPlan.length(  ) <= sbuPaymentPlanSize )
      ? sbuPaymentPlan
      : sbuPaymentPlan.substring( 0, sbuPaymentPlanSize ) // auto trimmed to fit, if required.
       ), sbuTermDate,
      ( sbuAgeingBucket == null ) ? null
                                  : ( ( sbuAgeingBucket.length(  ) <= sbuAgeingBucketSize )
      ? sbuAgeingBucket
      : sbuAgeingBucket.substring( 0, sbuAgeingBucketSize ) // auto trimmed to fit, if required.
       ), sbuAveragespend, sbuDateprocessed, sbuDateapproved,
      ( sbuUpgradeStatus == null ) ? null
                                   : ( ( sbuUpgradeStatus.length(  ) <= sbuUpgradeStatusSize )
      ? sbuUpgradeStatus
      : sbuUpgradeStatus.substring( 0, sbuUpgradeStatusSize ) // auto trimmed to fit, if required.
       ),
      ( sbuChannel == null ) ? null
                             : ( ( sbuChannel.length(  ) <= sbuChannelSize )
      ? sbuChannel
      : sbuChannel.substring( 0, sbuChannelSize ) // auto trimmed to fit, if required.
       ),
      ( sbuRecordStatus == null ) ? null
                                  : ( ( sbuRecordStatus.length(  ) <= sbuRecordStatusSize )
      ? sbuRecordStatus
      : sbuRecordStatus.substring( 0, sbuRecordStatusSize ) // auto trimmed to fit, if required.
       )
    };
  }

  /**
   * DOCUMENT ME!
   *
   * @param fields DOCUMENT ME!
   */
  protected void set( final Object[] fields ) {
    sbuSubupgradeId = (Integer) fields[0];
    sbuSubscriberId = (Integer) fields[1];
    sbuDealerId = rtrim( (String) fields[2] );
    sbuSalesPerson = rtrim( (String) fields[3] );
    sbuUpgradeQual = rtrim( (String) fields[4] );
    sbuComment = rtrim( (String) fields[5] );
    sbuUserId = rtrim( (String) fields[6] );
    sbuModelId = (Integer) fields[7];
    sbuContractLen = (Integer) fields[8];
    sbuCost = (BigDecimal) fields[9];
    sbuImei = rtrim( (String) fields[10] );
    sbuRegionCode = rtrim( (String) fields[11] );
    sbuAccountStatus = rtrim( (String) fields[12] );
    sbuCollPlan = rtrim( (String) fields[13] );
    sbuMtnStatus = rtrim( (String) fields[14] );
    sbuActivateDate = (Date) fields[15];
    sbuDeactDate = (Date) fields[16];
    sbuContractAge = (Integer) fields[17];
    sbuCustomerType = rtrim( (String) fields[18] );
    sbuTariffCode = rtrim( (String) fields[19] );
    sbuPackageCode = rtrim( (String) fields[20] );
    sbuPaymentPlan = rtrim( (String) fields[21] );
    sbuTermDate = (Date) fields[22];
    sbuAgeingBucket = rtrim( (String) fields[23] );
    sbuAveragespend = (BigDecimal) fields[24];
    sbuDateprocessed = (DateTime) fields[25];
    sbuDateapproved = (DateTime) fields[26];
    sbuUpgradeStatus = rtrim( (String) fields[27] );
    sbuChannel = rtrim( (String) fields[28] );
    sbuRecordStatus = rtrim( (String) fields[29] );
  }

  // Get methods ///////////////////////////////////////////////////////////////
  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public Integer getSbuSubupgradeId(  ) {
    return sbuSubupgradeId;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public Integer getSbuSubscriberId(  ) {
    return sbuSubscriberId;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getSbuDealerId(  ) {
    return sbuDealerId;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getSbuSalesPerson(  ) {
    return sbuSalesPerson;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getSbuUpgradeQual(  ) {
    return sbuUpgradeQual;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getSbuComment(  ) {
    return sbuComment;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getSbuUserId(  ) {
    return sbuUserId;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public Integer getSbuModelId(  ) {
    return sbuModelId;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public Integer getSbuContractLen(  ) {
    return sbuContractLen;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public BigDecimal getSbuCost(  ) {
    return sbuCost;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getSbuImei(  ) {
    return sbuImei;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getSbuRegionCode(  ) {
    return sbuRegionCode;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getSbuAccountStatus(  ) {
    return sbuAccountStatus;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getSbuCollPlan(  ) {
    return sbuCollPlan;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getSbuMtnStatus(  ) {
    return sbuMtnStatus;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public Date getSbuActivateDate(  ) {
    return ( sbuActivateDate != null ) ? new Date( sbuActivateDate ) : null;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public Date getSbuDeactDate(  ) {
    return ( sbuDeactDate != null ) ? new Date( sbuDeactDate ) : null;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public Integer getSbuContractAge(  ) {
    return sbuContractAge;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getSbuCustomerType(  ) {
    return sbuCustomerType;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getSbuTariffCode(  ) {
    return sbuTariffCode;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getSbuPackageCode(  ) {
    return sbuPackageCode;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getSbuPaymentPlan(  ) {
    return sbuPaymentPlan;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public Date getSbuTermDate(  ) {
    return ( sbuTermDate != null ) ? new Date( sbuTermDate ) : null;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getSbuAgeingBucket(  ) {
    return sbuAgeingBucket;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public BigDecimal getSbuAveragespend(  ) {
    return sbuAveragespend;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public DateTime getSbuDateprocessed(  ) {
    return ( sbuDateprocessed != null ) ? new DateTime( sbuDateprocessed )
                                        : null;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public DateTime getSbuDateapproved(  ) {
    return ( sbuDateapproved != null ) ? new DateTime( sbuDateapproved ) : null;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getSbuUpgradeStatus(  ) {
    return sbuUpgradeStatus;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getSbuChannel(  ) {
    return sbuChannel;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getSbuRecordStatus(  ) {
    return sbuRecordStatus;
  }

  // Setter methods ///////////////////////////////////////////////////////////////

  //
  // Master setter follows...
  //

  /**
   * Setter that takes all attributes
   */
  public void set( 
    final Integer    sbuSubupgradeId,
    final Integer    sbuSubscriberId,
    final String     sbuDealerId,
    final String     sbuSalesPerson,
    final String     sbuUpgradeQual,
    final String     sbuComment,
    final String     sbuUserId,
    final Integer    sbuModelId,
    final Integer    sbuContractLen,
    final BigDecimal sbuCost,
    final String     sbuImei,
    final String     sbuRegionCode,
    final String     sbuAccountStatus,
    final String     sbuCollPlan,
    final String     sbuMtnStatus,
    final Date       sbuActivateDate,
    final Date       sbuDeactDate,
    final Integer    sbuContractAge,
    final String     sbuCustomerType,
    final String     sbuTariffCode,
    final String     sbuPackageCode,
    final String     sbuPaymentPlan,
    final Date       sbuTermDate,
    final String     sbuAgeingBucket,
    final BigDecimal sbuAveragespend,
    final DateTime   sbuDateprocessed,
    final DateTime   sbuDateapproved,
    final String     sbuUpgradeStatus,
    final String     sbuChannel,
    final String     sbuRecordStatus ) {
    this.sbuSubupgradeId = sbuSubupgradeId;
    this.sbuSubscriberId = sbuSubscriberId;
    this.sbuDealerId = sbuDealerId;
    this.sbuSalesPerson = sbuSalesPerson;
    this.sbuUpgradeQual = sbuUpgradeQual;
    this.sbuComment = sbuComment;
    this.sbuUserId = sbuUserId;
    this.sbuModelId = sbuModelId;
    this.sbuContractLen = sbuContractLen;
    this.sbuCost = sbuCost;
    this.sbuImei = sbuImei;
    this.sbuRegionCode = sbuRegionCode;
    this.sbuAccountStatus = sbuAccountStatus;
    this.sbuCollPlan = sbuCollPlan;
    this.sbuMtnStatus = sbuMtnStatus;
    this.sbuActivateDate = ( sbuActivateDate != null )
      ? new Date( sbuActivateDate ) : null;
    this.sbuDeactDate = ( sbuDeactDate != null ) ? new Date( sbuDeactDate )
                                                 : null;
    this.sbuContractAge = sbuContractAge;
    this.sbuCustomerType = sbuCustomerType;
    this.sbuTariffCode = sbuTariffCode;
    this.sbuPackageCode = sbuPackageCode;
    this.sbuPaymentPlan = sbuPaymentPlan;
    this.sbuTermDate = ( sbuTermDate != null ) ? new Date( sbuTermDate ) : null;
    this.sbuAgeingBucket = sbuAgeingBucket;
    this.sbuAveragespend = sbuAveragespend;
    this.sbuDateprocessed = ( sbuDateprocessed != null )
      ? new DateTime( sbuDateprocessed ) : null;
    this.sbuDateapproved = ( sbuDateapproved != null )
      ? new DateTime( sbuDateapproved ) : null;
    this.sbuUpgradeStatus = sbuUpgradeStatus;
    this.sbuChannel = sbuChannel;
    this.sbuRecordStatus = sbuRecordStatus;
  }

  //
  // Public access modifiers if any
  // (provided for attributes that are public in the analysis model)
  //    

  /**
  * Sets the SbuSubupgradeId field.
  *
  * @param sbuSubupgradeId
  */
  public void setSbuSubupgradeId( final Integer sbuSubupgradeId ) {
    this.sbuSubupgradeId = sbuSubupgradeId;
  }

  /**
  * Sets the SbuSubscriberId field.
  *
  * @param sbuSubscriberId
  */
  public void setSbuSubscriberId( final Integer sbuSubscriberId ) {
    this.sbuSubscriberId = sbuSubscriberId;
  }

  /**
  * Sets the SbuDealerId field.
  *
  * @param sbuDealerId
  */
  public void setSbuDealerId( final String sbuDealerId ) {
    this.sbuDealerId = getPadded(sbuDealerId, sbuDealerIdFilter);
  }

  /**
  * Sets the SbuSalesPerson field.
  *
  * @param sbuSalesPerson
  */
  public void setSbuSalesPerson( final String sbuSalesPerson ) {
    this.sbuSalesPerson = getPadded(sbuSalesPerson, sbuSalesPersonFilter);
  }

  /**
  * Sets the SbuUpgradeQual field.
  *
  * @param sbuUpgradeQual
  */
  public void setSbuUpgradeQual( final String sbuUpgradeQual ) {
    this.sbuUpgradeQual = getPadded(sbuUpgradeQual, sbuUpgradeQualFilter);
  }

  /**
  * Sets the SbuComment field.
  *
  * @param sbuComment
  */
  public void setSbuComment( final String sbuComment ) {
    this.sbuComment = getPadded(sbuComment, sbuCommentFilter);
  }

  /**
  * Sets the SbuUserId field.
  *
  * @param sbuUserId
  */
  public void setSbuUserId( final String sbuUserId ) {
    this.sbuUserId = getPadded(sbuUserId, sbuUserIdFilter);
  }

  /**
  * Sets the SbuModelId field.
  *
  * @param sbuModelId
  */
  public void setSbuModelId( final Integer sbuModelId ) {
    this.sbuModelId = sbuModelId;
  }

  /**
  * Sets the SbuContractLen field.
  *
  * @param sbuContractLen
  */
  public void setSbuContractLen( final Integer sbuContractLen ) {
    this.sbuContractLen = sbuContractLen;
  }

  /**
  * Sets the SbuCost field.
  *
  * @param sbuCost
  */
  public void setSbuCost( final BigDecimal sbuCost ) {
    this.sbuCost = sbuCost;
  }

  /**
  * Sets the SbuCost field.
  *
  * @param sbuCost
  */
  public void setSbuCost( final double sbuCost ) {
    this.sbuCost = new BigDecimal( sbuCost );
  }

  /**
  * Sets the SbuImei field.
  *
  * @param sbuImei
  */
  public void setSbuImei( final String sbuImei ) {
    this.sbuImei = getPadded(sbuImei, sbuImeiFilter);
  }

  /**
  * Sets the SbuRegionCode field.
  *
  * @param sbuRegionCode
  */
  public void setSbuRegionCode( final String sbuRegionCode ) {
    this.sbuRegionCode = getPadded(sbuRegionCode, sbuRegionCodeFilter);
  }

  /**
  * Sets the SbuAccountStatus field.
  *
  * @param sbuAccountStatus
  */
  public void setSbuAccountStatus( final String sbuAccountStatus ) {
    this.sbuAccountStatus = getPadded(sbuAccountStatus, sbuAccountStatusFilter);
  }

  /**
  * Sets the SbuCollPlan field.
  *
  * @param sbuCollPlan
  */
  public void setSbuCollPlan( final String sbuCollPlan ) {
    this.sbuCollPlan = getPadded(sbuCollPlan, sbuCollPlanFilter);
  }

  /**
  * Sets the SbuMtnStatus field.
  *
  * @param sbuMtnStatus
  */
  public void setSbuMtnStatus( final String sbuMtnStatus ) {
    this.sbuMtnStatus = getPadded(sbuMtnStatus, sbuMtnStatusFilter);
  }

  /**
  * Sets the SbuActivateDate field.
  *
  * @param sbuActivateDate
  */
  public void setSbuActivateDate( final Date sbuActivateDate ) {
    this.sbuActivateDate = ( sbuActivateDate != null )
      ? new Date( sbuActivateDate ) : null;
  }

  /**
  * Sets the SbuDeactDate field.
  *
  * @param sbuDeactDate
  */
  public void setSbuDeactDate( final Date sbuDeactDate ) {
    this.sbuDeactDate = ( sbuDeactDate != null ) ? new Date( sbuDeactDate )
                                                 : null;
  }

  /**
  * Sets the SbuContractAge field.
  *
  * @param sbuContractAge
  */
  public void setSbuContractAge( final Integer sbuContractAge ) {
    this.sbuContractAge = sbuContractAge;
  }

  /**
  * Sets the SbuCustomerType field.
  *
  * @param sbuCustomerType
  */
  public void setSbuCustomerType( final String sbuCustomerType ) {
    this.sbuCustomerType = getPadded(sbuCustomerType, sbuCustomerTypeFilter);
  }

  /**
  * Sets the SbuTariffCode field.
  *
  * @param sbuTariffCode
  */
  public void setSbuTariffCode( final String sbuTariffCode ) {
    this.sbuTariffCode = getPadded(sbuTariffCode, sbuTariffCodeFilter);
  }

  /**
  * Sets the SbuPackageCode field.
  *
  * @param sbuPackageCode
  */
  public void setSbuPackageCode( final String sbuPackageCode ) {
    this.sbuPackageCode = getPadded(sbuPackageCode, sbuPackageCodeFilter);
  }

  /**
  * Sets the SbuPaymentPlan field.
  *
  * @param sbuPaymentPlan
  */
  public void setSbuPaymentPlan( final String sbuPaymentPlan ) {
    this.sbuPaymentPlan = getPadded(sbuPaymentPlan, sbuPaymentPlanFilter);
  }

  /**
  * Sets the SbuTermDate field.
  *
  * @param sbuTermDate
  */
  public void setSbuTermDate( final Date sbuTermDate ) {
    this.sbuTermDate = ( sbuTermDate != null ) ? new Date( sbuTermDate ) : null;
  }

  /**
  * Sets the SbuAgeingBucket field.
  *
  * @param sbuAgeingBucket
  */
  public void setSbuAgeingBucket( final String sbuAgeingBucket ) {
    this.sbuAgeingBucket = getPadded(sbuAgeingBucket, sbuAgeingBucketFilter);
  }

  /**
  * Sets the SbuAveragespend field.
  *
  * @param sbuAveragespend
  */
  public void setSbuAveragespend( final BigDecimal sbuAveragespend ) {
    this.sbuAveragespend = sbuAveragespend;
  }

  /**
  * Sets the SbuAveragespend field.
  *
  * @param sbuAveragespend
  */
  public void setSbuAveragespend( final double sbuAveragespend ) {
    this.sbuAveragespend = new BigDecimal( sbuAveragespend );
  }

  /**
  * Sets the SbuDateprocessed field.
  *
  * @param sbuDateprocessed
  */
  public void setSbuDateprocessed( final DateTime sbuDateprocessed ) {
    this.sbuDateprocessed = ( sbuDateprocessed != null )
      ? new DateTime( sbuDateprocessed ) : null;
  }

  /**
  * Sets the SbuDateapproved field.
  *
  * @param sbuDateapproved
  */
  public void setSbuDateapproved( final DateTime sbuDateapproved ) {
    this.sbuDateapproved = ( sbuDateapproved != null )
      ? new DateTime( sbuDateapproved ) : null;
  }

  /**
  * Sets the SbuUpgradeStatus field.
  *
  * @param sbuUpgradeStatus
  */
  public void setSbuUpgradeStatus( final String sbuUpgradeStatus ) {
    this.sbuUpgradeStatus = getPadded(sbuUpgradeStatus, sbuUpgradeStatusFilter);
  }

  /**
  * Sets the SbuChannel field.
  *
  * @param sbuChannel
  */
  public void setSbuChannel( final String sbuChannel ) {
    this.sbuChannel = getPadded(sbuChannel, sbuChannelFilter);
  }

  /**
  * Sets the SbuRecordStatus field.
  *
  * @param sbuRecordStatus
  */
  public void setSbuRecordStatus( final String sbuRecordStatus ) {
    this.sbuRecordStatus = getPadded(sbuRecordStatus, sbuRecordStatusFilter);
  }

@Override
public String toString() {
	return "\nSbuSubUpgradeDMO [\nfieldSizes=" + Arrays.toString(fieldSizes)
			+ "\nsbuAveragespend=" + sbuAveragespend + "\nsbuCost=" + sbuCost
			+ "\nsbuActivateDate=" + sbuActivateDate + "\nsbuDeactDate="
			+ sbuDeactDate + "\nsbuTermDate=" + sbuTermDate
			+ "\nsbuDateapproved=" + sbuDateapproved + "\nsbuDateprocessed="
			+ sbuDateprocessed + "\nsbuContractAge=" + sbuContractAge
			+ "\nsbuContractLen=" + sbuContractLen + "\nsbuModelId="
			+ sbuModelId + "\nsbuSubscriberId=" + sbuSubscriberId
			+ "\nsbuSubupgradeId=" + sbuSubupgradeId + "\nsbuAccountStatus="
			+ sbuAccountStatus + "\nsbuAgeingBucket=" + sbuAgeingBucket
			+ "\nsbuChannel=" + sbuChannel + "\nsbuCollPlan=" + sbuCollPlan
			+ "\nsbuComment=" + sbuComment + "\nsbuCustomerType="
			+ sbuCustomerType + "\nsbuDealerId=" + sbuDealerId + "\nsbuImei="
			+ sbuImei + "\nsbuMtnStatus=" + sbuMtnStatus + "\nsbuPackageCode="
			+ sbuPackageCode + "\nsbuPaymentPlan=" + sbuPaymentPlan
			+ "\nsbuRecordStatus=" + sbuRecordStatus + "\nsbuRegionCode="
			+ sbuRegionCode + "\nsbuSalesPerson=" + sbuSalesPerson
			+ "\nsbuTariffCode=" + sbuTariffCode + "\nsbuUpgradeQual="
			+ sbuUpgradeQual + "\nsbuUpgradeStatus=" + sbuUpgradeStatus
			+ "\nsbuUserId=" + sbuUserId + "]";
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
