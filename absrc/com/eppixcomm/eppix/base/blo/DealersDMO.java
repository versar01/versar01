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
 * A value object to carry the data for a Dealers.
 *
 *
 * <H3> A Dealers is: </H3>
 *
 * <!-- indent text -->
 * <TABLE BORDER="0" CELLPADDING="0" CELLSPACING="0">
 * <TR>
 * <TD WIDTH="25">&nbsp;</TD>
 * <TD>
 *
 * Holds general and commission details for each dealer.
 *
 * <!-- end indent text -->
 * </TD>
 * </TR>
 * </TABLE>
 *
 *
 * <H3> Dealers Value Object: </H3>
 *
 * <!-- indent text -->
 * <TABLE BORDER="0" CELLPADDING="0" CELLSPACING="0">
 * <TR>
 * <TD WIDTH="25">&nbsp;</TD>
 * <TD>
 *
 * <P>
 *     This is a value object (called a Data Model Object or 'DMO').
 *     It is used to pass the data for a dealers into and out of the BASE module.
 *     Because it's purpose is to carry data into and out of the module it is visible outside the module.
 * </P>
 * <P>
 *     This value object carries the data for one dealers. A dealers is:
 * Holds general and commission details for each dealer.
 * </P>
 * <P>
 *     It corresponds to the business logic object Dealers which
 *     contains all the business behaviour of a dealers but is not visible outside the
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
 *    This value object contains fields for all the details of a dealers, namely:
 * </P>
 *


 * <P>
 *    <U>Fields to carry the Attributes of a dealers:</U>
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
 *   <TD ALIGN="left" VALIGN="top"><B>dealerId</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Dealer identification.
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
 *   <TD ALIGN="left" VALIGN="top"><B>plAccNo</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Dealer.
 *
 *
 *
 *
 *
 *
 *     <P>
 *       See:
 *       <BR>
 *       <!-- link to the anchor of the attribute's getter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#getPlAccNo()">
 *           getPlAccNo
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setPlAccNo(java.lang.String)">
 *           setPlAccNo (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>commPlan</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Commission plan.
 *       <p>
 *         Links to commplan.commplnl.
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
 *       <A HREF="#getCommPlan()">
 *           getCommPlan
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setCommPlan(java.lang.String)">
 *           setCommPlan (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>dealType</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Dealer type.
 *
 *
 *
 *
 *
 *
 *     <P>
 *       See:
 *       <BR>
 *       <!-- link to the anchor of the attribute's getter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#getDealType()">
 *           getDealType
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setDealType(java.lang.String)">
 *           setDealType (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>activMtd</B></TD>
 *   <TD ALIGN="left" VALIGN="top">Integer</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Activations month to date.
 *
 *
 *
 *
 *
 *
 *     <P>
 *       See:
 *       <BR>
 *       <!-- link to the anchor of the attribute's getter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#getActivMtd()">
 *           getActivMtd
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setActivMtd(java.lang.Integer)">
 *           setActivMtd (Integer)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>deactMtd</B></TD>
 *   <TD ALIGN="left" VALIGN="top">Integer</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Deactivations month to date.
 *
 *
 *
 *
 *
 *
 *     <P>
 *       See:
 *       <BR>
 *       <!-- link to the anchor of the attribute's getter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#getDeactMtd()">
 *           getDeactMtd
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setDeactMtd(java.lang.Integer)">
 *           setDeactMtd (Integer)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>revenMtd</B></TD>
 *   <TD ALIGN="left" VALIGN="top">BigDecimal</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Revenue month to date.
 *
 *
 *
 *
 *
 *
 *     <P>
 *       See:
 *       <BR>
 *       <!-- link to the anchor of the attribute's getter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#getRevenMtd()">
 *           getRevenMtd
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setRevenMtd(java.math.BigDecimal)">
 *           setRevenMtd (BigDecimal)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>activYtd</B></TD>
 *   <TD ALIGN="left" VALIGN="top">Integer</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Activations year to date.
 *
 *
 *
 *
 *
 *
 *     <P>
 *       See:
 *       <BR>
 *       <!-- link to the anchor of the attribute's getter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#getActivYtd()">
 *           getActivYtd
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setActivYtd(java.lang.Integer)">
 *           setActivYtd (Integer)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>deactYtd</B></TD>
 *   <TD ALIGN="left" VALIGN="top">Integer</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Deactivations tear to date.
 *
 *
 *
 *
 *
 *
 *     <P>
 *       See:
 *       <BR>
 *       <!-- link to the anchor of the attribute's getter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#getDeactYtd()">
 *           getDeactYtd
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setDeactYtd(java.lang.Integer)">
 *           setDeactYtd (Integer)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>itemiYtd</B></TD>
 *   <TD ALIGN="left" VALIGN="top">Integer</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Number of itemised invoices sold year to date.
 *
 *
 *
 *
 *
 *
 *     <P>
 *       See:
 *       <BR>
 *       <!-- link to the anchor of the attribute's getter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#getItemiYtd()">
 *           getItemiYtd
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setItemiYtd(java.lang.Integer)">
 *           setItemiYtd (Integer)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>revenYtd</B></TD>
 *   <TD ALIGN="left" VALIGN="top">BigDecimal</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Revenue year to date.
 *
 *
 *
 *
 *
 *
 *     <P>
 *       See:
 *       <BR>
 *       <!-- link to the anchor of the attribute's getter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#getRevenYtd()">
 *           getRevenYtd
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setRevenYtd(java.math.BigDecimal)">
 *           setRevenYtd (BigDecimal)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>commiYtd</B></TD>
 *   <TD ALIGN="left" VALIGN="top">BigDecimal</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Commission year to date.
 *
 *
 *
 *
 *
 *
 *     <P>
 *       See:
 *       <BR>
 *       <!-- link to the anchor of the attribute's getter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#getCommiYtd()">
 *           getCommiYtd
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setCommiYtd(java.math.BigDecimal)">
 *           setCommiYtd (BigDecimal)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>activCum</B></TD>
 *   <TD ALIGN="left" VALIGN="top">Integer</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Number of activations cumulative for dealer.
 *       <p>
 *         Updated by activations.
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
 *       <A HREF="#getActivCum()">
 *           getActivCum
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setActivCum(java.lang.Integer)">
 *           setActivCum (Integer)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>deactCum</B></TD>
 *   <TD ALIGN="left" VALIGN="top">Integer</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Number of deactivations cumulative for dealer.
 *       <p>
 *         Updated by deactivations.
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
 *       <A HREF="#getDeactCum()">
 *           getDeactCum
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setDeactCum(java.lang.Integer)">
 *           setDeactCum (Integer)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>itemiCum</B></TD>
 *   <TD ALIGN="left" VALIGN="top">Integer</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Number of itemised invoices cumulative for dealer.
 *       <p>
 *         Updated by activations.
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
 *       <A HREF="#getItemiCum()">
 *           getItemiCum
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setItemiCum(java.lang.Integer)">
 *           setItemiCum (Integer)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>revenCum</B></TD>
 *   <TD ALIGN="left" VALIGN="top">BigDecimal</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Total revenue cumulative for dealer.
 *
 *
 *
 *
 *
 *
 *     <P>
 *       See:
 *       <BR>
 *       <!-- link to the anchor of the attribute's getter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#getRevenCum()">
 *           getRevenCum
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setRevenCum(java.math.BigDecimal)">
 *           setRevenCum (BigDecimal)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>commiCum</B></TD>
 *   <TD ALIGN="left" VALIGN="top">BigDecimal</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Total commission paid to dealer.
 *       <p>
 *         Updated by commission run.
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
 *       <A HREF="#getCommiCum()">
 *           getCommiCum
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setCommiCum(java.math.BigDecimal)">
 *           setCommiCum (BigDecimal)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>lastComm</B></TD>
 *   <TD ALIGN="left" VALIGN="top">Date</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Date last commission paid.
 *       <p>
 *         Updated by commission run.
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
 *       <A HREF="#getLastComm()">
 *           getLastComm
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setLastComm(com.cmgwds.eppix.util.Date)">
 *           setLastComm (Date)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>barrIndi</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Indicator determining whether dealer is barred from commission payment run.
 *
 *
 *
 *
 *
 *
 *     <P>
 *       See:
 *       <BR>
 *       <!-- link to the anchor of the attribute's getter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#getBarrIndi()">
 *           getBarrIndi
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setBarrIndi(java.lang.String)">
 *           setBarrIndi (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>clawBac1</B></TD>
 *   <TD ALIGN="left" VALIGN="top">BigDecimal</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Total claw back value 1 to date.
 *       <p>
 *         Updated by deactivations.
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
 *       <A HREF="#getClawBac1()">
 *           getClawBac1
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setClawBac1(java.math.BigDecimal)">
 *           setClawBac1 (BigDecimal)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>clawBac2</B></TD>
 *   <TD ALIGN="left" VALIGN="top">BigDecimal</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Total claw back 2 value to date.
 *       <p>
 *         Updated by deactivations.
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
 *       <A HREF="#getClawBac2()">
 *           getClawBac2
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setClawBac2(java.math.BigDecimal)">
 *           setClawBac2 (BigDecimal)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>dealerNl</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Threee character code used to determine Nominal Ledger codes for commission postings to Chameleon Nominal Ledger combined with commplan.
 *       <p>
 *         commplnl to form unique key to DEALERNL table.
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
 *       <A HREF="#getDealerNl()">
 *           getDealerNl
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setDealerNl(java.lang.String)">
 *           setDealerNl (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>qualPeriod</B></TD>
 *   <TD ALIGN="left" VALIGN="top">Integer</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Dealer qualification period before dealer is eligible for commission.
 *
 *
 *
 *
 *
 *
 *     <P>
 *       See:
 *       <BR>
 *       <!-- link to the anchor of the attribute's getter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#getQualPeriod()">
 *           getQualPeriod
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setQualPeriod(java.lang.Integer)">
 *           setQualPeriod (Integer)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>qbonusytd</B></TD>
 *   <TD ALIGN="left" VALIGN="top">BigDecimal</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Quarterly bonus awarded year to date.
 *       <p>
 *         Not used.
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
 *       <A HREF="#getQbonusytd()">
 *           getQbonusytd
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setQbonusytd(java.math.BigDecimal)">
 *           setQbonusytd (BigDecimal)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>dateCreated</B></TD>
 *   <TD ALIGN="left" VALIGN="top">Date</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       date dealer record was created.
 *
 *
 *
 *
 *
 *
 *     <P>
 *       See:
 *       <BR>
 *       <!-- link to the anchor of the attribute's getter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#getDateCreated()">
 *           getDateCreated
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setDateCreated(com.cmgwds.eppix.util.Date)">
 *           setDateCreated (Date)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>clawInt1</B></TD>
 *   <TD ALIGN="left" VALIGN="top">Integer</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Number of days subscriber must be connected for adealer to retain the commission paid.
 *       <p>
 *         If subscriber terminates the subscription before number of days elapsed, a pecentage of the commission paid is clawed
 *         back as determined claw_val1. Two intervals are clawed. Example claw_int1 90 days claw_val1 100 - clawback total
 *         commission paid. Claw_int2 180 days claw_val2 50 - clawback ¬Ω commission paid.
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
 *       <A HREF="#getClawInt1()">
 *           getClawInt1
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setClawInt1(java.lang.Integer)">
 *           setClawInt1 (Integer)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>clawVal1</B></TD>
 *   <TD ALIGN="left" VALIGN="top">BigDecimal</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Percentage to be clawed back from dealer.
 *
 *
 *
 *
 *
 *
 *     <P>
 *       See:
 *       <BR>
 *       <!-- link to the anchor of the attribute's getter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#getClawVal1()">
 *           getClawVal1
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setClawVal1(java.math.BigDecimal)">
 *           setClawVal1 (BigDecimal)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>clawInt2</B></TD>
 *   <TD ALIGN="left" VALIGN="top">Integer</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Second interval for commission claw backs.
 *
 *
 *
 *
 *
 *
 *     <P>
 *       See:
 *       <BR>
 *       <!-- link to the anchor of the attribute's getter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#getClawInt2()">
 *           getClawInt2
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setClawInt2(java.lang.Integer)">
 *           setClawInt2 (Integer)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>clawVal2</B></TD>
 *   <TD ALIGN="left" VALIGN="top">BigDecimal</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Percentage to be clawed back.
 *
 *
 *
 *
 *
 *
 *     <P>
 *       See:
 *       <BR>
 *       <!-- link to the anchor of the attribute's getter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#getClawVal2()">
 *           getClawVal2
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setClawVal2(java.math.BigDecimal)">
 *           setClawVal2 (BigDecimal)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>eposFlag</B></TD>
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
 *       <A HREF="#getEposFlag()">
 *           getEposFlag
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setEposFlag(java.lang.String)">
 *           setEposFlag (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>accMinQty</B></TD>
 *   <TD ALIGN="left" VALIGN="top">Integer</TD>
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
 *       <A HREF="#getAccMinQty()">
 *           getAccMinQty
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setAccMinQty(java.lang.Integer)">
 *           setAccMinQty (Integer)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>accCurrQty</B></TD>
 *   <TD ALIGN="left" VALIGN="top">Integer</TD>
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
 *       <A HREF="#getAccCurrQty()">
 *           getAccCurrQty
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setAccCurrQty(java.lang.Integer)">
 *           setAccCurrQty (Integer)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>accShipQty</B></TD>
 *   <TD ALIGN="left" VALIGN="top">Integer</TD>
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
 *       <A HREF="#getAccShipQty()">
 *           getAccShipQty
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setAccShipQty(java.lang.Integer)">
 *           setAccShipQty (Integer)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>region</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Region associated with the dealer
 *
 *
 *
 *
 *
 *
 *     <P>
 *       See:
 *       <BR>
 *       <!-- link to the anchor of the attribute's getter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#getRegion()">
 *           getRegion
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setRegion(java.lang.String)">
 *           setRegion (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>dealerGroup</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Group Dealer Id
 *
 *
 *
 *
 *
 *
 *     <P>
 *       See:
 *       <BR>
 *       <!-- link to the anchor of the attribute's getter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#getDealerGroup()">
 *           getDealerGroup
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setDealerGroup(java.lang.String)">
 *           setDealerGroup (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>dealerDirect</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Whether the dealer is a direct franchise or not.
 *
 *
 *
 *
 *
 *
 *     <P>
 *       See:
 *       <BR>
 *       <!-- link to the anchor of the attribute's getter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#getDealerDirect()">
 *           getDealerDirect
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setDealerDirect(java.lang.String)">
 *           setDealerDirect (String)
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


 * @see Dealers
 *
 * @author
 * @version $Revision: $
 *
 * @since $jdk$
 */
public class DealersDMO
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
      FIELD_TYPE_STRING /* std public attribute: dealerId  */,
      FIELD_TYPE_STRING /* std public attribute: plAccNo  */,
      FIELD_TYPE_STRING /* std public attribute: commPlan  */,
      FIELD_TYPE_STRING /* std public attribute: dealType  */,
      FIELD_TYPE_INTEGER /* std public attribute: activMtd  */,
      FIELD_TYPE_INTEGER /* std public attribute: deactMtd  */,
      FIELD_TYPE_BIGDECIMAL /* std public attribute: revenMtd  */,
      FIELD_TYPE_INTEGER /* std public attribute: activYtd  */,
      FIELD_TYPE_INTEGER /* std public attribute: deactYtd  */,
      FIELD_TYPE_INTEGER /* std public attribute: itemiYtd  */,
      FIELD_TYPE_BIGDECIMAL /* std public attribute: revenYtd  */,
      FIELD_TYPE_BIGDECIMAL /* std public attribute: commiYtd  */,
      FIELD_TYPE_INTEGER /* std public attribute: activCum  */,
      FIELD_TYPE_INTEGER /* std public attribute: deactCum  */,
      FIELD_TYPE_INTEGER /* std public attribute: itemiCum  */,
      FIELD_TYPE_BIGDECIMAL /* std public attribute: revenCum  */,
      FIELD_TYPE_BIGDECIMAL /* std public attribute: commiCum  */,
      FIELD_TYPE_DATEONLY /* std public attribute: lastComm  */,
      FIELD_TYPE_STRING /* std public attribute: barrIndi  */,
      FIELD_TYPE_BIGDECIMAL /* std public attribute: clawBac1  */,
      FIELD_TYPE_BIGDECIMAL /* std public attribute: clawBac2  */,
      FIELD_TYPE_STRING /* std public attribute: dealerNl  */,
      FIELD_TYPE_INTEGER /* std public attribute: qualPeriod  */,
      FIELD_TYPE_BIGDECIMAL /* std public attribute: qbonusytd  */,
      FIELD_TYPE_DATEONLY /* std public attribute: dateCreated  */,
      FIELD_TYPE_INTEGER /* std public attribute: clawInt1  */,
      FIELD_TYPE_BIGDECIMAL /* std public attribute: clawVal1  */,
      FIELD_TYPE_INTEGER /* std public attribute: clawInt2  */,
      FIELD_TYPE_BIGDECIMAL /* std public attribute: clawVal2  */,
      FIELD_TYPE_STRING /* std public attribute: eposFlag  */,
      FIELD_TYPE_INTEGER /* std public attribute: accMinQty  */,
      FIELD_TYPE_INTEGER /* std public attribute: accCurrQty  */,
      FIELD_TYPE_INTEGER /* std public attribute: accShipQty  */,
      FIELD_TYPE_STRING /* std public attribute: region  */,
      FIELD_TYPE_STRING /* std public attribute: dealerGroup  */,
      FIELD_TYPE_STRING /* std public attribute: dealerDirect  */,
      FIELD_TYPE_DATEONLY /* std public attribute: dealerActive  */,
      FIELD_TYPE_DATEONLY /* std public attribute: dealerInactive  */
    };
  
  private final int[] fieldSizes = new int[] {
		  dealerIdSize,
		  plAccNoSize ,
		  commPlanSize,
		  dealTypeSize,
		  0,
		  0,
		  0,
		  0,
		  0,
		  0,
		  0,
		  0,
		  0,
		  0,
		  0,
		  0,
		  0,
		  0,
		  barrIndiSize,
		  0,
		  0,
		  dealerNlSize,
		  0,
		  0,
		  0,
		  0,
		  0,
		  0,
		  0,
		  eposFlagSize,
		  0,
		  0,
		  0,
		  regionSize,
		  dealerGroupSize,
		  dealerDirectSize
  };
      

  public int[] fieldSizes() {
  	return fieldSizes;
  }  

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int dealerIdFilter = 0; // filter index
  private static final int dealerIdSize = 8; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int plAccNoFilter = 1; // filter index
  private static final int plAccNoSize = 8; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int commPlanFilter = 2; // filter index
  private static final int commPlanSize = 3; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int dealTypeFilter = 3; // filter index
  private static final int dealTypeSize = 5; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int activMtdFilter = 4; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int deactMtdFilter = 5; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int revenMtdFilter = 6; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int activYtdFilter = 7; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int deactYtdFilter = 8; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int itemiYtdFilter = 9; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int revenYtdFilter = 10; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int commiYtdFilter = 11; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int activCumFilter = 12; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int deactCumFilter = 13; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int itemiCumFilter = 14; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int revenCumFilter = 15; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int commiCumFilter = 16; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int lastCommFilter = 17; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int barrIndiFilter = 18; // filter index
  private static final int barrIndiSize = 1; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int clawBac1Filter = 19; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int clawBac2Filter = 20; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int dealerNlFilter = 21; // filter index
  private static final int dealerNlSize = 3; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int qualPeriodFilter = 22; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int qbonusytdFilter = 23; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int dateCreatedFilter = 24; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int clawInt1Filter = 25; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int clawVal1Filter = 26; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int clawInt2Filter = 27; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int clawVal2Filter = 28; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int eposFlagFilter = 29; // filter index
  private static final int eposFlagSize = 1; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int accMinQtyFilter = 30; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int accCurrQtyFilter = 31; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int accShipQtyFilter = 32; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int regionFilter = 33; // filter index
  private static final int regionSize = 6; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int dealerGroupFilter = 34; // filter index
  private static final int dealerGroupSize = 8; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int dealerDirectFilter = 35; // filter index
  private static final int dealerDirectSize = 1; // field size

  //~ Instance variables /////////////////////////////////////////////////////

  private BigDecimal clawBac1; // Loaded from Schema
  private BigDecimal clawBac2; // Loaded from Schema
  private BigDecimal clawVal1; // Loaded from Schema
  private BigDecimal clawVal2; // Loaded from Schema
  private BigDecimal commiCum; // Loaded from Schema
  private BigDecimal commiYtd; // Loaded from Schema
  private BigDecimal qbonusytd; // Loaded from Schema
  private BigDecimal revenCum; // Loaded from Schema
  private BigDecimal revenMtd; // Loaded from Schema
  private BigDecimal revenYtd; // Loaded from Schema
  private Date dateCreated; // Loaded from Schema
  private Date lastComm; // Loaded from Schema
  private Integer accCurrQty; // Loaded from Schema
  private Integer accMinQty; // Loaded from Schema
  private Integer accShipQty; // Loaded from Schema
  private Integer activCum; // Loaded from Schema
  private Integer activMtd; // Loaded from Schema
  private Integer activYtd; // Loaded from Schema
  private Integer clawInt1; // Loaded from Schema
  private Integer clawInt2; // Loaded from Schema
  private Integer deactCum; // Loaded from Schema
  private Integer deactMtd; // Loaded from Schema
  private Integer deactYtd; // Loaded from Schema
  private Integer itemiCum; // Loaded from Schema
  private Integer itemiYtd; // Loaded from Schema
  private Integer qualPeriod; // Loaded from Schema
  private String barrIndi; // Loaded from Schema
  private String commPlan; // Loaded from Schema
  private String dealType; // Loaded from Schema
  private String dealerDirect; // Loaded from Schema
  private String dealerGroup; // Loaded from Schema
  private Date dealerActive; // Loaded from Schema
  private Date dealerInactive; // Loaded from Schema

  //---------------------
  // Field declarations
  //---------------------
  // all attributes
  private String dealerId; // Loaded from Schema
  private String dealerNl; // Loaded from Schema
  private String eposFlag; // Loaded from Schema
  private String plAccNo; // Loaded from Schema
  private String region; // Loaded from Schema

  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new DealersDMO object.
   */
  public DealersDMO(  ) {
  }

  // Constructor - taking public attributes
  /**
   * Creates a new DealersDMO object.
   *
   * @param dealerId DOCUMENT ME!
   * @param plAccNo DOCUMENT ME!
   * @param commPlan DOCUMENT ME!
   * @param dealType DOCUMENT ME!
   * @param activMtd DOCUMENT ME!
   * @param deactMtd DOCUMENT ME!
   * @param revenMtd DOCUMENT ME!
   * @param activYtd DOCUMENT ME!
   * @param deactYtd DOCUMENT ME!
   * @param itemiYtd DOCUMENT ME!
   * @param revenYtd DOCUMENT ME!
   * @param commiYtd DOCUMENT ME!
   * @param activCum DOCUMENT ME!
   * @param deactCum DOCUMENT ME!
   * @param itemiCum DOCUMENT ME!
   * @param revenCum DOCUMENT ME!
   * @param commiCum DOCUMENT ME!
   * @param lastComm DOCUMENT ME!
   * @param barrIndi DOCUMENT ME!
   * @param clawBac1 DOCUMENT ME!
   * @param clawBac2 DOCUMENT ME!
   * @param dealerNl DOCUMENT ME!
   * @param qualPeriod DOCUMENT ME!
   * @param qbonusytd DOCUMENT ME!
   * @param dateCreated DOCUMENT ME!
   * @param clawInt1 DOCUMENT ME!
   * @param clawVal1 DOCUMENT ME!
   * @param clawInt2 DOCUMENT ME!
   * @param clawVal2 DOCUMENT ME!
   * @param eposFlag DOCUMENT ME!
   * @param accMinQty DOCUMENT ME!
   * @param accCurrQty DOCUMENT ME!
   * @param accShipQty DOCUMENT ME!
   * @param region DOCUMENT ME!
   * @param dealerGroup DOCUMENT ME!
   * @param dealerDirect DOCUMENT ME!
   * @param dealerActive DOCUMENT ME!
   * @param dealerInactive DOCUMENT ME!
   */
  public DealersDMO( 
    final String     dealerId,
    final String     plAccNo,
    final String     commPlan,
    final String     dealType,
    final Integer    activMtd,
    final Integer    deactMtd,
    final BigDecimal revenMtd,
    final Integer    activYtd,
    final Integer    deactYtd,
    final Integer    itemiYtd,
    final BigDecimal revenYtd,
    final BigDecimal commiYtd,
    final Integer    activCum,
    final Integer    deactCum,
    final Integer    itemiCum,
    final BigDecimal revenCum,
    final BigDecimal commiCum,
    final Date       lastComm,
    final String     barrIndi,
    final BigDecimal clawBac1,
    final BigDecimal clawBac2,
    final String     dealerNl,
    final Integer    qualPeriod,
    final BigDecimal qbonusytd,
    final Date       dateCreated,
    final Integer    clawInt1,
    final BigDecimal clawVal1,
    final Integer    clawInt2,
    final BigDecimal clawVal2,
    final String     eposFlag,
    final Integer    accMinQty,
    final Integer    accCurrQty,
    final Integer    accShipQty,
    final String     region,
    final String     dealerGroup,
    final String     dealerDirect ,
    final Date       dealerActive,
    final Date       dealerInactive) {
    this.dealerId = dealerId;

    this.plAccNo = plAccNo;

    this.commPlan = commPlan;

    this.dealType = dealType;

    this.activMtd = activMtd;

    this.deactMtd = deactMtd;

    this.revenMtd = revenMtd;

    this.activYtd = activYtd;

    this.deactYtd = deactYtd;

    this.itemiYtd = itemiYtd;

    this.revenYtd = revenYtd;

    this.commiYtd = commiYtd;

    this.activCum = activCum;

    this.deactCum = deactCum;

    this.itemiCum = itemiCum;

    this.revenCum = revenCum;

    this.commiCum = commiCum;

    this.lastComm = ( lastComm != null ) ? new Date( lastComm ) : null;

    this.barrIndi = barrIndi;

    this.clawBac1 = clawBac1;

    this.clawBac2 = clawBac2;

    this.dealerNl = dealerNl;

    this.qualPeriod = qualPeriod;

    this.qbonusytd = qbonusytd;

    this.dateCreated = ( dateCreated != null ) ? new Date( dateCreated ) : null;

    this.clawInt1 = clawInt1;

    this.clawVal1 = clawVal1;

    this.clawInt2 = clawInt2;

    this.clawVal2 = clawVal2;

    this.eposFlag = eposFlag;

    this.accMinQty = accMinQty;

    this.accCurrQty = accCurrQty;

    this.accShipQty = accShipQty;

    this.region = region;

    this.dealerGroup = dealerGroup;

    this.dealerDirect = dealerDirect;

    this.dealerActive = ( dealerActive != null ) ? new Date( dealerActive ) : null;

    this.dealerInactive = ( dealerInactive != null ) ? new Date( dealerInactive ) : null;
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
    return new DAOArgs( 1 ).arg( ( this.dealerId == null ) ? null
                                                           : this.dealerId
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
      ( dealerId == null ) ? null
                           : ( ( dealerId.length(  ) <= dealerIdSize )
      ? dealerId
      : dealerId.substring( 0, dealerIdSize ) // auto trimmed to fit, if required.
       ),
      ( plAccNo == null ) ? null
                          : ( ( plAccNo.length(  ) <= plAccNoSize ) ? plAccNo
                                                                    : plAccNo
      .substring( 0, plAccNoSize ) // auto trimmed to fit, if required.
       ),
      ( commPlan == null ) ? null
                           : ( ( commPlan.length(  ) <= commPlanSize )
      ? commPlan
      : commPlan.substring( 0, commPlanSize ) // auto trimmed to fit, if required.
       ),
      ( dealType == null ) ? null
                           : ( ( dealType.length(  ) <= dealTypeSize )
      ? dealType
      : dealType.substring( 0, dealTypeSize ) // auto trimmed to fit, if required.
       ), activMtd, deactMtd, revenMtd, activYtd, deactYtd, itemiYtd, revenYtd,
      commiYtd, activCum, deactCum, itemiCum, revenCum, commiCum, lastComm,
      ( barrIndi == null ) ? null
                           : ( ( barrIndi.length(  ) <= barrIndiSize )
      ? barrIndi
      : barrIndi.substring( 0, barrIndiSize ) // auto trimmed to fit, if required.
       ), clawBac1, clawBac2,
      ( dealerNl == null ) ? null
                           : ( ( dealerNl.length(  ) <= dealerNlSize )
      ? dealerNl
      : dealerNl.substring( 0, dealerNlSize ) // auto trimmed to fit, if required.
       ), qualPeriod, qbonusytd, dateCreated, clawInt1, clawVal1, clawInt2,
      clawVal2,
      ( eposFlag == null ) ? null
                           : ( ( eposFlag.length(  ) <= eposFlagSize )
      ? eposFlag
      : eposFlag.substring( 0, eposFlagSize ) // auto trimmed to fit, if required.
       ), accMinQty, accCurrQty, accShipQty,
      ( region == null ) ? null
                         : ( ( region.length(  ) <= regionSize ) ? region
                                                                 : region
      .substring( 0, regionSize ) // auto trimmed to fit, if required.
       ),
      ( dealerGroup == null ) ? null
                              : ( ( dealerGroup.length(  ) <= dealerGroupSize )
      ? dealerGroup
      : dealerGroup.substring( 0, dealerGroupSize ) // auto trimmed to fit, if required.
       ),
      ( dealerDirect == null ) ? null
                               : ( ( dealerDirect.length(  ) <= dealerDirectSize )
      ? dealerDirect
      : dealerDirect.substring( 0, dealerDirectSize ) // auto trimmed to fit, if required.
       ),dealerActive,dealerInactive
    };
  }

  /**
   * DOCUMENT ME!
   *
   * @param fields DOCUMENT ME!
   */
  protected void set( final Object[] fields ) {
    dealerId = rtrim( (String) fields[0] );
    plAccNo = rtrim( (String) fields[1] );
    commPlan = rtrim( (String) fields[2] );
    dealType = rtrim( (String) fields[3] );
    activMtd = (Integer) fields[4];
    deactMtd = (Integer) fields[5];
    revenMtd = (BigDecimal) fields[6];
    activYtd = (Integer) fields[7];
    deactYtd = (Integer) fields[8];
    itemiYtd = (Integer) fields[9];
    revenYtd = (BigDecimal) fields[10];
    commiYtd = (BigDecimal) fields[11];
    activCum = (Integer) fields[12];
    deactCum = (Integer) fields[13];
    itemiCum = (Integer) fields[14];
    revenCum = (BigDecimal) fields[15];
    commiCum = (BigDecimal) fields[16];
    lastComm = (Date) fields[17];
    barrIndi = rtrim( (String) fields[18] );
    clawBac1 = (BigDecimal) fields[19];
    clawBac2 = (BigDecimal) fields[20];
    dealerNl = rtrim( (String) fields[21] );
    qualPeriod = (Integer) fields[22];
    qbonusytd = (BigDecimal) fields[23];
    dateCreated = (Date) fields[24];
    clawInt1 = (Integer) fields[25];
    clawVal1 = (BigDecimal) fields[26];
    clawInt2 = (Integer) fields[27];
    clawVal2 = (BigDecimal) fields[28];
    eposFlag = rtrim( (String) fields[29] );
    accMinQty = (Integer) fields[30];
    accCurrQty = (Integer) fields[31];
    accShipQty = (Integer) fields[32];
    region = rtrim( (String) fields[33] );
    dealerGroup = rtrim( (String) fields[34] );
    dealerDirect = rtrim( (String) fields[35] );
    dealerActive = (Date) fields[36];
    dealerInactive = (Date) fields[37];
  }

  // Get methods ///////////////////////////////////////////////////////////////
  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getDealerId(  ) {
    return dealerId;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getPlAccNo(  ) {
    return plAccNo;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getCommPlan(  ) {
    return commPlan;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getDealType(  ) {
    return dealType;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public Integer getActivMtd(  ) {
    return activMtd;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public Integer getDeactMtd(  ) {
    return deactMtd;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public BigDecimal getRevenMtd(  ) {
    return revenMtd;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public Integer getActivYtd(  ) {
    return activYtd;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public Integer getDeactYtd(  ) {
    return deactYtd;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public Integer getItemiYtd(  ) {
    return itemiYtd;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public BigDecimal getRevenYtd(  ) {
    return revenYtd;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public BigDecimal getCommiYtd(  ) {
    return commiYtd;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public Integer getActivCum(  ) {
    return activCum;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public Integer getDeactCum(  ) {
    return deactCum;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public Integer getItemiCum(  ) {
    return itemiCum;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public BigDecimal getRevenCum(  ) {
    return revenCum;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public BigDecimal getCommiCum(  ) {
    return commiCum;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public Date getLastComm(  ) {
    return ( lastComm != null ) ? new Date( lastComm ) : null;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getBarrIndi(  ) {
    return barrIndi;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public BigDecimal getClawBac1(  ) {
    return clawBac1;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public BigDecimal getClawBac2(  ) {
    return clawBac2;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getDealerNl(  ) {
    return dealerNl;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public Integer getQualPeriod(  ) {
    return qualPeriod;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public BigDecimal getQbonusytd(  ) {
    return qbonusytd;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public Date getDateCreated(  ) {
    return ( dateCreated != null ) ? new Date( dateCreated ) : null;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public Integer getClawInt1(  ) {
    return clawInt1;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public BigDecimal getClawVal1(  ) {
    return clawVal1;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public Integer getClawInt2(  ) {
    return clawInt2;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public BigDecimal getClawVal2(  ) {
    return clawVal2;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getEposFlag(  ) {
    return eposFlag;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public Integer getAccMinQty(  ) {
    return accMinQty;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public Integer getAccCurrQty(  ) {
    return accCurrQty;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public Integer getAccShipQty(  ) {
    return accShipQty;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getRegion(  ) {
    return region;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getDealerGroup(  ) {
    return dealerGroup;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getDealerDirect(  ) {
    return dealerDirect;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public Date getDealerActive(  ) {
    return ( dealerActive != null ) ? new Date( dealerActive ) : null;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public Date getDealerInactive(  ) {
    return ( dealerInactive != null ) ? new Date( dealerInactive ) : null;
  }


  // Setter methods ///////////////////////////////////////////////////////////////

  //
  // Master setter follows...
  //

  /**
   * Setter that takes all attributes
   */
  public void set( 
    final String     dealerId,
    final String     plAccNo,
    final String     commPlan,
    final String     dealType,
    final Integer    activMtd,
    final Integer    deactMtd,
    final BigDecimal revenMtd,
    final Integer    activYtd,
    final Integer    deactYtd,
    final Integer    itemiYtd,
    final BigDecimal revenYtd,
    final BigDecimal commiYtd,
    final Integer    activCum,
    final Integer    deactCum,
    final Integer    itemiCum,
    final BigDecimal revenCum,
    final BigDecimal commiCum,
    final Date       lastComm,
    final String     barrIndi,
    final BigDecimal clawBac1,
    final BigDecimal clawBac2,
    final String     dealerNl,
    final Integer    qualPeriod,
    final BigDecimal qbonusytd,
    final Date       dateCreated,
    final Integer    clawInt1,
    final BigDecimal clawVal1,
    final Integer    clawInt2,
    final BigDecimal clawVal2,
    final String     eposFlag,
    final Integer    accMinQty,
    final Integer    accCurrQty,
    final Integer    accShipQty,
    final String     region,
    final String     dealerGroup,
    final String     dealerDirect ,
    final Date       dealerActive,
    final Date       dealerInactive ) {
    this.dealerId = dealerId;
    this.plAccNo = plAccNo;
    this.commPlan = commPlan;
    this.dealType = dealType;
    this.activMtd = activMtd;
    this.deactMtd = deactMtd;
    this.revenMtd = revenMtd;
    this.activYtd = activYtd;
    this.deactYtd = deactYtd;
    this.itemiYtd = itemiYtd;
    this.revenYtd = revenYtd;
    this.commiYtd = commiYtd;
    this.activCum = activCum;
    this.deactCum = deactCum;
    this.itemiCum = itemiCum;
    this.revenCum = revenCum;
    this.commiCum = commiCum;
    this.lastComm = ( lastComm != null ) ? new Date( lastComm ) : null;
    this.barrIndi = barrIndi;
    this.clawBac1 = clawBac1;
    this.clawBac2 = clawBac2;
    this.dealerNl = dealerNl;
    this.qualPeriod = qualPeriod;
    this.qbonusytd = qbonusytd;
    this.dateCreated = ( dateCreated != null ) ? new Date( dateCreated ) : null;
    this.clawInt1 = clawInt1;
    this.clawVal1 = clawVal1;
    this.clawInt2 = clawInt2;
    this.clawVal2 = clawVal2;
    this.eposFlag = eposFlag;
    this.accMinQty = accMinQty;
    this.accCurrQty = accCurrQty;
    this.accShipQty = accShipQty;
    this.region = region;
    this.dealerGroup = dealerGroup;
    this.dealerDirect = dealerDirect;
    this.dealerActive   = ( dealerActive != null ) ? new Date( dealerActive ) : null;
    this.dealerInactive = ( dealerInactive != null ) ? new Date( dealerInactive ) : null;
  }

  //
  // Public access modifiers if any
  // (provided for attributes that are public in the analysis model)
  //    

  /**
  * Sets the DealerId field.
  *
  * @param dealerId
  */
  public void setDealerId( final String dealerId ) {
    this.dealerId = getPadded(dealerId, dealerIdFilter);
  }

  /**
  * Sets the PlAccNo field.
  *
  * @param plAccNo
  */
  public void setPlAccNo( final String plAccNo ) {
    this.plAccNo = getPadded(plAccNo, plAccNoFilter);
  }

  /**
  * Sets the CommPlan field.
  *
  * @param commPlan
  */
  public void setCommPlan( final String commPlan ) {
    this.commPlan = getPadded(commPlan, commPlanFilter);
  }

  /**
  * Sets the DealType field.
  *
  * @param dealType
  */
  public void setDealType( final String dealType ) {
    this.dealType = getPadded(dealType, dealTypeFilter);
  }

  /**
  * Sets the ActivMtd field.
  *
  * @param activMtd
  */
  public void setActivMtd( final Integer activMtd ) {
    this.activMtd = activMtd;
  }

  /**
  * Sets the DeactMtd field.
  *
  * @param deactMtd
  */
  public void setDeactMtd( final Integer deactMtd ) {
    this.deactMtd = deactMtd;
  }

  /**
  * Sets the RevenMtd field.
  *
  * @param revenMtd
  */
  public void setRevenMtd( final BigDecimal revenMtd ) {
    this.revenMtd = revenMtd;
  }

  /**
  * Sets the RevenMtd field.
  *
  * @param revenMtd
  */
  public void setRevenMtd( final double revenMtd ) {
    this.revenMtd = new BigDecimal( revenMtd );
  }

  /**
  * Sets the ActivYtd field.
  *
  * @param activYtd
  */
  public void setActivYtd( final Integer activYtd ) {
    this.activYtd = activYtd;
  }

  /**
  * Sets the DeactYtd field.
  *
  * @param deactYtd
  */
  public void setDeactYtd( final Integer deactYtd ) {
    this.deactYtd = deactYtd;
  }

  /**
  * Sets the ItemiYtd field.
  *
  * @param itemiYtd
  */
  public void setItemiYtd( final Integer itemiYtd ) {
    this.itemiYtd = itemiYtd;
  }

  /**
  * Sets the RevenYtd field.
  *
  * @param revenYtd
  */
  public void setRevenYtd( final BigDecimal revenYtd ) {
    this.revenYtd = revenYtd;
  }

  /**
  * Sets the RevenYtd field.
  *
  * @param revenYtd
  */
  public void setRevenYtd( final double revenYtd ) {
    this.revenYtd = new BigDecimal( revenYtd );
  }

  /**
  * Sets the CommiYtd field.
  *
  * @param commiYtd
  */
  public void setCommiYtd( final BigDecimal commiYtd ) {
    this.commiYtd = commiYtd;
  }

  /**
  * Sets the CommiYtd field.
  *
  * @param commiYtd
  */
  public void setCommiYtd( final double commiYtd ) {
    this.commiYtd = new BigDecimal( commiYtd );
  }

  /**
  * Sets the ActivCum field.
  *
  * @param activCum
  */
  public void setActivCum( final Integer activCum ) {
    this.activCum = activCum;
  }

  /**
  * Sets the DeactCum field.
  *
  * @param deactCum
  */
  public void setDeactCum( final Integer deactCum ) {
    this.deactCum = deactCum;
  }

  /**
  * Sets the ItemiCum field.
  *
  * @param itemiCum
  */
  public void setItemiCum( final Integer itemiCum ) {
    this.itemiCum = itemiCum;
  }

  /**
  * Sets the RevenCum field.
  *
  * @param revenCum
  */
  public void setRevenCum( final BigDecimal revenCum ) {
    this.revenCum = revenCum;
  }

  /**
  * Sets the RevenCum field.
  *
  * @param revenCum
  */
  public void setRevenCum( final double revenCum ) {
    this.revenCum = new BigDecimal( revenCum );
  }

  /**
  * Sets the CommiCum field.
  *
  * @param commiCum
  */
  public void setCommiCum( final BigDecimal commiCum ) {
    this.commiCum = commiCum;
  }

  /**
  * Sets the CommiCum field.
  *
  * @param commiCum
  */
  public void setCommiCum( final double commiCum ) {
    this.commiCum = new BigDecimal( commiCum );
  }

  /**
  * Sets the LastComm field.
  *
  * @param lastComm
  */
  public void setLastComm( final Date lastComm ) {
    this.lastComm = ( lastComm != null ) ? new Date( lastComm ) : null;
  }

  /**
  * Sets the BarrIndi field.
  *
  * @param barrIndi
  */
  public void setBarrIndi( final String barrIndi ) {
    this.barrIndi = getPadded(barrIndi, barrIndiFilter);
  }

  /**
  * Sets the ClawBac1 field.
  *
  * @param clawBac1
  */
  public void setClawBac1( final BigDecimal clawBac1 ) {
    this.clawBac1 = clawBac1;
  }

  /**
  * Sets the ClawBac1 field.
  *
  * @param clawBac1
  */
  public void setClawBac1( final double clawBac1 ) {
    this.clawBac1 = new BigDecimal( clawBac1 );
  }

  /**
  * Sets the ClawBac2 field.
  *
  * @param clawBac2
  */
  public void setClawBac2( final BigDecimal clawBac2 ) {
    this.clawBac2 = clawBac2;
  }

  /**
  * Sets the ClawBac2 field.
  *
  * @param clawBac2
  */
  public void setClawBac2( final double clawBac2 ) {
    this.clawBac2 = new BigDecimal( clawBac2 );
  }

  /**
  * Sets the DealerNl field.
  *
  * @param dealerNl
  */
  public void setDealerNl( final String dealerNl ) {
    this.dealerNl = getPadded(dealerNl, dealerNlFilter);
  }

  /**
  * Sets the QualPeriod field.
  *
  * @param qualPeriod
  */
  public void setQualPeriod( final Integer qualPeriod ) {
    this.qualPeriod = qualPeriod;
  }

  /**
  * Sets the Qbonusytd field.
  *
  * @param qbonusytd
  */
  public void setQbonusytd( final BigDecimal qbonusytd ) {
    this.qbonusytd = qbonusytd;
  }

  /**
  * Sets the Qbonusytd field.
  *
  * @param qbonusytd
  */
  public void setQbonusytd( final double qbonusytd ) {
    this.qbonusytd = new BigDecimal( qbonusytd );
  }

  /**
  * Sets the DateCreated field.
  *
  * @param dateCreated
  */
  public void setDateCreated( final Date dateCreated ) {
    this.dateCreated = ( dateCreated != null ) ? new Date( dateCreated ) : null;
  }

  /**
  * Sets the ClawInt1 field.
  *
  * @param clawInt1
  */
  public void setClawInt1( final Integer clawInt1 ) {
    this.clawInt1 = clawInt1;
  }

  /**
  * Sets the ClawVal1 field.
  *
  * @param clawVal1
  */
  public void setClawVal1( final BigDecimal clawVal1 ) {
    this.clawVal1 = clawVal1;
  }

  /**
  * Sets the ClawVal1 field.
  *
  * @param clawVal1
  */
  public void setClawVal1( final double clawVal1 ) {
    this.clawVal1 = new BigDecimal( clawVal1 );
  }

  /**
  * Sets the ClawInt2 field.
  *
  * @param clawInt2
  */
  public void setClawInt2( final Integer clawInt2 ) {
    this.clawInt2 = clawInt2;
  }

  /**
  * Sets the ClawVal2 field.
  *
  * @param clawVal2
  */
  public void setClawVal2( final BigDecimal clawVal2 ) {
    this.clawVal2 = clawVal2;
  }

  /**
  * Sets the ClawVal2 field.
  *
  * @param clawVal2
  */
  public void setClawVal2( final double clawVal2 ) {
    this.clawVal2 = new BigDecimal( clawVal2 );
  }

  /**
  * Sets the EposFlag field.
  *
  * @param eposFlag
  */
  public void setEposFlag( final String eposFlag ) {
    this.eposFlag = getPadded(eposFlag, eposFlagFilter);
  }

  /**
  * Sets the AccMinQty field.
  *
  * @param accMinQty
  */
  public void setAccMinQty( final Integer accMinQty ) {
    this.accMinQty = accMinQty;
  }

  /**
  * Sets the AccCurrQty field.
  *
  * @param accCurrQty
  */
  public void setAccCurrQty( final Integer accCurrQty ) {
    this.accCurrQty = accCurrQty;
  }

  /**
  * Sets the AccShipQty field.
  *
  * @param accShipQty
  */
  public void setAccShipQty( final Integer accShipQty ) {
    this.accShipQty = accShipQty;
  }

  /**
  * Sets the Region field.
  *
  * @param region
  */
  public void setRegion( final String region ) {
    this.region = getPadded(region, regionFilter);
  }

  /**
  * Sets the DealerGroup field.
  *
  * @param dealerGroup
  */
  public void setDealerGroup( final String dealerGroup ) {
    this.dealerGroup = getPadded(dealerGroup, dealerGroupFilter);
  }

  /**
  * Sets the DealerDirect field.
  *
  * @param dealerDirect
  */
  public void setDealerDirect( final String dealerDirect ) {
    this.dealerDirect = getPadded(dealerDirect, dealerDirectFilter);
  }

    /**
  * Sets the DealerActive field.
  *
  * @param dealerActive,
  */
  public void setDealerActive( final Date dealerActive ) {
    this.dealerActive = ( dealerActive != null ) ? new Date( dealerActive ) : null;
  }


    /**
  * Sets the DealerInactive field.
  *
  * @param dealerInactive
  */
  public void setDealerInactive( final Date dealerInactive ) {
    this.dealerInactive = ( dealerInactive != null ) ? new Date( dealerInactive ) : null;
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
