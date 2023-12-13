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
 * A value object to carry the data for a DirDiscountRule.
 *
 *
 * <H3> A DirDiscountRule is: </H3>
 *
 * <!-- indent text -->
 * <TABLE BORDER="0" CELLPADDING="0" CELLSPACING="0">
 * <TR>
 * <TD WIDTH="25">&nbsp;</TD>
 * <TD>
 *
 * Each entry defines a calculation of discount giving the method of calculation, the charges that it discounts and the method of posting to ledgers.
 * <p>
 *   
 
 These individual calculation definitions are grouped together under dip_discount_plan and it is these groupings
 *   that are offered to the subscriber. The individual rules are not offered in their own right.
 * </p>
 *
 * <!-- end indent text -->
 * </TD>
 * </TR>
 * </TABLE>
 *
 *
 * <H3> DirDiscountRule Value Object: </H3>
 *
 * <!-- indent text -->
 * <TABLE BORDER="0" CELLPADDING="0" CELLSPACING="0">
 * <TR>
 * <TD WIDTH="25">&nbsp;</TD>
 * <TD>
 *
 * <P>
 *     This is a value object (called a Data Model Object or 'DMO').
 *     It is used to pass the data for a dirDiscountRule into and out of the BASE module.
 *     Because it's purpose is to carry data into and out of the module it is visible outside the module.
 * </P>
 * <P>
 *     This value object carries the data for one dirDiscountRule. A dirDiscountRule is:
 * Each entry defines a calculation of discount giving the method of calculation, the charges that it discounts and the method of posting to ledgers.
 * </P>
 * <P>
 *     It corresponds to the business logic object DirDiscountRule which
 *     contains all the business behaviour of a dirDiscountRule but is not visible outside the
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
 *    This value object contains fields for all the details of a dirDiscountRule, namely:
 * </P>
 *


 * <P>
 *    <U>Fields to carry the Attributes of a dirDiscountRule:</U>
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
 *   <TD ALIGN="left" VALIGN="top"><B>dirRuleId</B></TD>
 *   <TD ALIGN="left" VALIGN="top">Integer</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Unique internal Id for a discount rule.
 *       <p>
 *         The field will uniquely identify a record within this table.
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
 *       <A HREF="#getDirRuleId()">
 *           getDirRuleId
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setDirRuleId(java.lang.Integer)">
 *           setDirRuleId (Integer)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>dirRuleRef</B></TD>
 *   <TD ALIGN="left" VALIGN="top">Integer</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Rule reference.
 *       <p>
 *         This field will uniquely identify a rule. When there are multiple effective periods for a given rule, this field will
 *         be the same within each record. This field will be used along with the effective period to determine which calculations
 *         are in place at a given point in time.
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
 *       <A HREF="#getDirRuleRef()">
 *           getDirRuleRef
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setDirRuleRef(java.lang.Integer)">
 *           setDirRuleRef (Integer)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>dirStartDate</B></TD>
 *   <TD ALIGN="left" VALIGN="top">DateTime</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Effective start date for the rule
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
 *       <A HREF="#getDirStartDate()">
 *           getDirStartDate
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setDirStartDate(com.cmgwds.eppix.util.DateTime)">
 *           setDirStartDate (DateTime)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>dirEndDate</B></TD>
 *   <TD ALIGN="left" VALIGN="top">DateTime</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Effective end date for the rule
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
 *       <A HREF="#getDirEndDate()">
 *           getDirEndDate
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setDirEndDate(com.cmgwds.eppix.util.DateTime)">
 *           setDirEndDate (DateTime)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>dirRuleDesc</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       a name for the discount calculation.
 *       <p>
 *         eg: "10% off all national calls"
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
 *       <A HREF="#getDirRuleDesc()">
 *           getDirRuleDesc
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setDirRuleDesc(java.lang.String)">
 *           setDirRuleDesc (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>dirRuleType</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       U = Usage Duration Discount The duration of calls of a certain type are summed and compared with the threshold values.
 *       <p>
 *         The type of calls to consider being detailed by dir_threshold_id.
 *       </p>
 *       <p>
 *         S = Usage Spend Discount The cost of calls of a certain type are summed and compared with the threshold values. The type
 *         of calls to consider being explained by dir_threshold_id.
 *       </p>
 *       <p>
 *         C = Spend (Charged) Discount The total amount spent in certain categories is summed and compared with the threshold
 *         values. This is quite similar to the Usage Spend Discount except it works on charge codes not usage types. The type of
 *         charges to consider being explained by dir_threshold_id.
 *       </p>
 *       <p>
 *         B = Subscriber Base Discount The number of active subscribers belonging to the customer are summed and compared to the
 *         threshold values.
 *       </p>
 *       <p>
 *         M = Months Active Discount The number of months the subscriber has been active is compared to the threshold values.
 *       </p>
 *       <p>
 *         These values will be held within the TT_TYPE_TEXT group 'DISCRULTYP'.
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
 *       <A HREF="#getDirRuleType()">
 *           getDirRuleType
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setDirRuleType(java.lang.String)">
 *           setDirRuleType (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>dirStartAfter</B></TD>
 *   <TD ALIGN="left" VALIGN="top">Short</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Number of cycle periods after which the discount will be effective (from the discount earned date).
 *       <p>
 *         0 (zero) indicates start immediately.
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
 *       <A HREF="#getDirStartAfter()">
 *           getDirStartAfter
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setDirStartAfter(java.lang.Short)">
 *           setDirStartAfter (Short)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>dirApplyFor</B></TD>
 *   <TD ALIGN="left" VALIGN="top">Short</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Number of cycle periods to apply discount for.
 *       <p>
 *         0 (zero) indicates apply forever.
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
 *       <A HREF="#getDirApplyFor()">
 *           getDirApplyFor
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setDirApplyFor(java.lang.Short)">
 *           setDirApplyFor (Short)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>dirBandType</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Type of discount application to be used.
 *       <p>
 *         T - Tiered S - Stepped N - No bands (thresholds)
 *       </p>
 *       <p>
 *         These values will be held within the TT_TYPE_TEXT group 'DISCBANTYP'.
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
 *       <A HREF="#getDirBandType()">
 *           getDirBandType
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setDirBandType(java.lang.String)">
 *           setDirBandType (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>dirThresholdId</B></TD>
 *   <TD ALIGN="left" VALIGN="top">Integer</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Identifies which calls / charges are included when determining threshold values.
 *       <p>
 *         0 (zero) indicates whole bill (all calls and all charges).
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
 *       <A HREF="#getDirThresholdId()">
 *           getDirThresholdId
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setDirThresholdId(java.lang.Integer)">
 *           setDirThresholdId (Integer)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>dirAppDiscId</B></TD>
 *   <TD ALIGN="left" VALIGN="top">Integer</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Identifies which calls / charges are included when determining the discountable value.
 *       <p>
 *         0 (zero) indicates whole bill (all calls and all charges).
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
 *       <A HREF="#getDirAppDiscId()">
 *           getDirAppDiscId
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setDirAppDiscId(java.lang.Integer)">
 *           setDirAppDiscId (Integer)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>dirChargeRef</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       If a discount or a charge is created it uses this charge code.
 *       <p>
 *         Individual bands (thresholds) can be associated with different charge codes (dib_charge_ref). If the band defines a
 *         charge code, that will take precedence over the charge code defined at rule level. If neither charge code is specified,
 *         the discount will be posted to the same charge code as the charges being discounted (only allowed for dir_rule_type =
 *         C).
 *       </p>
 *       <p>
 *         This field will always be specified for usage discounts.
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
 *       <A HREF="#getDirChargeRef()">
 *           getDirChargeRef
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setDirChargeRef(java.lang.String)">
 *           setDirChargeRef (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>dirRuleUsed</B></TD>
 *   <TD ALIGN="left" VALIGN="top">Integer</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Number of times this rule has been used.
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
 *       <A HREF="#getDirRuleUsed()">
 *           getDirRuleUsed
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setDirRuleUsed(java.lang.Integer)">
 *           setDirRuleUsed (Integer)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>dirAppToVal</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Value that discount should be applied to.
 *       <p>
 *         
 \"O\" (letter O) means, original value.
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
 *       <A HREF="#getDirAppToVal()">
 *           getDirAppToVal
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setDirAppToVal(java.lang.String)">
 *           setDirAppToVal (String)
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


 * @see DirDiscountRule
 *
 * @author
 * @version $Revision: $
 *
 * @since $jdk$
 */
public class DirDiscountRuleDMO
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
      FIELD_TYPE_INTEGER  /* std public attribute: dirRuleId  */,
      FIELD_TYPE_INTEGER  /* std public attribute: dirRuleRef  */,
      FIELD_TYPE_DATETIME /* std public attribute: dirStartDate  */,
      FIELD_TYPE_DATETIME /* std public attribute: dirEndDate  */,
      FIELD_TYPE_STRING   /* std public attribute: dirRuleDesc  */,
      FIELD_TYPE_STRING   /* std public attribute: dirRuleType  */,
      FIELD_TYPE_SHORT    /* std public attribute: dirStartAfter  */,
      FIELD_TYPE_SHORT    /* std public attribute: dirApplyFor  */,
      FIELD_TYPE_STRING   /* std public attribute: dirTypeCode       (New)  */,
      FIELD_TYPE_INTEGER  /* std public attribute: dirUomId          (New)  */,
      FIELD_TYPE_SHORT    /* std public attribute: dirApplyEvery     (New)  */,
      FIELD_TYPE_SHORT    /* std public attribute: dirFilterAcc      (New)  */, 
      FIELD_TYPE_SHORT    /* std public attribute: dirFilterLegal    (New)  */,
      FIELD_TYPE_SHORT    /* std public attribute: dirFilterPackage  (New)  */,
      FIELD_TYPE_SHORT    /* std public attribute: dirFilterTariff   (New)  */,
      FIELD_TYPE_STRING   /* std public attribute: dirPercentCount   (New)  */,	
      FIELD_TYPE_STRING	  /* std public attribute: dirOnceOffFee     (New)  */,
      FIELD_TYPE_STRING   /* std public attribute: dirBandType  */,
      FIELD_TYPE_INTEGER  /* std public attribute: dirThresholdId  */,
      FIELD_TYPE_INTEGER  /* std public attribute: dirAppDiscId  */,
      FIELD_TYPE_STRING   /* std public attribute: dirChargeRef  */,
      FIELD_TYPE_INTEGER  /* std public attribute: dirRuleUsed  */,
      FIELD_TYPE_STRING   /* std public attribute: dirAppToVal  */,
      FIELD_TYPE_BIGDECIMAL/* std public attribute: dirPercentSplit  (New)  */,
      FIELD_TYPE_SHORT    /* std public attribute: dirInvDisplay     (New)  */
      
    };
  
  private final int[] fieldSizes = new int[] {
		  0,
		  0,
		  0,
		  0,
		  dirRuleDescSize,
		  dirRuleTypeSize,
		  0,
		  0,
		  dirTypeCodeSize,
		  0,
		  0,
		  0,
		  0,
		  0,
		  0,
		  dirPercentCountSize,
		  dirOnceOffFeeSize,
		  dirBandTypeSize,
		  0,
		  0,
		  dirChargeRefSize,
		  0,
		  dirAppToValSize,
		  0,
		  0
  };
      

  public int[] fieldSizes() {
  	return fieldSizes;
  }  

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int dirRuleIdFilter = 0; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int dirRuleRefFilter = 1; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int dirStartDateFilter = 2; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int dirEndDateFilter = 3; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int dirRuleDescFilter = 4; // filter index
  private static final int dirRuleDescSize = 50; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int dirRuleTypeFilter = 5; // filter index
  private static final int dirRuleTypeSize = 1; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int dirStartAfterFilter = 6; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int dirApplyForFilter = 7; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int dirTypeCodeFilter = 8; // filter index
  private static final int dirTypeCodeSize = 2; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int dirUomIdFilter = 9; // filter index

    /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int dirApplyEveryFilter = 10; // filter index

    /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int dirFilterAccFilter = 11; // filter index

    /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int dirFilterLegalFilter = 12; // filter index

    /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int dirFilterPackageFilter = 13; // filter index

    /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int dirFilterTariffFilter = 14; // filter index


  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int dirPercentCountFilter = 15; // filter index
  private static final int dirPercentCountSize = 1; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int dirOnceOffFeeFilter = 16; // filter index
  private static final int dirOnceOffFeeSize = 1; // field size


  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int dirBandTypeFilter = 17; // filter index
  private static final int dirBandTypeSize = 1; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int dirThresholdIdFilter = 18; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int dirAppDiscIdFilter = 19; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int dirChargeRefFilter = 20; // filter index
  private static final int dirChargeRefSize = 5; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int dirRuleUsedFilter = 21; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int dirAppToValFilter = 22; // filter index
  private static final int dirAppToValSize = 1; // field size


  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int dirPercentSplitFilter = 23; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int dirInvDisplayFilter = 24; // filter index


  //~ Instance variables /////////////////////////////////////////////////////

  private DateTime dirEndDate; // Loaded from Schema
  private DateTime dirStartDate; // Loaded from Schema
  private Integer dirAppDiscId; // Loaded from Schema

  //---------------------
  // Field declarations
  //---------------------
  // all attributes
  private Integer dirRuleId; // Loaded from Schema
  private Integer dirRuleRef; // Loaded from Schema
  private Integer dirRuleUsed; // Loaded from Schema
  private Integer dirThresholdId; // Loaded from Schema
  private Short dirApplyFor; // Loaded from Schema
  private Short dirStartAfter; // Loaded from Schema
  private String dirAppToVal; // Loaded from Schema
  private String dirBandType; // Loaded from Schema
  private String dirChargeRef; // Loaded from Schema
  private String dirRuleDesc; // Loaded from Schema
  private String dirRuleType; // Loaded from Schema

  private String dirTypeCode; // Loaded from Schema
  private Integer dirUomId ; // Loaded from Schema
  private Short dirApplyEvery; // Loaded from Schema
  private Short dirFilterAcc; // Loaded from Schema
  private Short dirFilterLegal; // Loaded from Schema
  private Short dirFilterPackage; // Loaded from Schema
  private Short dirFilterTariff; // Loaded from Schema
  private String dirPercentCount; // Loaded from Schema
  private String dirOnceOffFee ;// Loaded from Schema
  private BigDecimal dirPercentSplit; // Loaded from Schema
  private Short dirInvDisplay; // Loaded from Schema


  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new DirDiscountRuleDMO object.
   */
  public DirDiscountRuleDMO(  ) {
  }

  // Constructor - taking public attributes
  /**
   * Creates a new DirDiscountRuleDMO object.
   *
   * @param dirRuleId DOCUMENT ME!
   * @param dirRuleRef DOCUMENT ME!
   * @param dirStartDate DOCUMENT ME!
   * @param dirEndDate DOCUMENT ME!
   * @param dirRuleDesc DOCUMENT ME!
   * @param dirRuleType DOCUMENT ME!
   * @param dirStartAfter DOCUMENT ME!
   * @param dirApplyFor DOCUMENT ME!
   * @param dirBandType DOCUMENT ME!
   * @param dirThresholdId DOCUMENT ME!
   * @param dirAppDiscId DOCUMENT ME!
   * @param dirChargeRef DOCUMENT ME!
   * @param dirRuleUsed DOCUMENT ME!
   * @param dirAppToVal DOCUMENT ME!
   */
  public DirDiscountRuleDMO( 
    final Integer  dirRuleId,
    final Integer  dirRuleRef,
    final DateTime dirStartDate,
    final DateTime dirEndDate,
    final String   dirRuleDesc,
    final String   dirRuleType,
    final Short    dirStartAfter,
    final Short    dirApplyFor,
    final String   dirTypeCode,
    final Integer  dirUomId,
    final Short    dirApplyEvery,
    final Short    dirFilterAcc,
    final Short    dirFilterLegal,
    final Short    dirFilterPackage,
    final Short    dirFilterTariff,
    final String   dirPercentCount,
    final String   dirOnceOffFee,
    final String   dirBandType,
    final Integer  dirThresholdId,
    final Integer  dirAppDiscId,
    final String   dirChargeRef,
    final Integer  dirRuleUsed,
    final String   dirAppToVal ,
    final BigDecimal dirPercentSplit,
    final Short dirInvDisplay) {
    this.dirRuleId = dirRuleId;

    this.dirRuleRef = dirRuleRef;

    this.dirStartDate = ( dirStartDate != null )
      ? new DateTime( dirStartDate ) : null;

    this.dirEndDate = ( dirEndDate != null ) ? new DateTime( dirEndDate ) : null;

    this.dirRuleDesc = dirRuleDesc;

    this.dirRuleType = dirRuleType;

    this.dirStartAfter = dirStartAfter;

    this.dirApplyFor = dirApplyFor;

    this.dirBandType = dirBandType;

    this.dirThresholdId = dirThresholdId;

    this.dirAppDiscId = dirAppDiscId;

    this.dirChargeRef = dirChargeRef;

    this.dirRuleUsed = dirRuleUsed;

    this.dirAppToVal = dirAppToVal;

    this.dirTypeCode		=	dirTypeCode	;

    this.dirUomId		=	dirUomId	;

    this.dirApplyEvery		=	dirApplyEvery	;

    this.dirFilterAcc		=	dirFilterAcc	;

    this.dirFilterLegal		=	dirFilterLegal	;

    this.dirFilterPackage	=	dirFilterPackage;

    this.dirFilterTariff	=	dirFilterTariff	;
    
    this.dirPercentCount	=	dirPercentCount	;

    this.dirOnceOffFee		=	dirOnceOffFee	;

    this.dirPercentSplit	=	dirPercentSplit	;
    
    this.dirInvDisplay		=	dirInvDisplay	;
     

  }

  //~ Methods ////////////////////////////////////////////////////////////////

  // DBO method implementations ////////////////////////////////////////////////

  /**
   * Sets the generated key ( dirRuleId ) value.
   *
   * @param key The generated key value.
   */
  protected void generatedKey( final Integer key ) {
    this.dirRuleId = key;
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
    return new DAOArgs( 1 ).arg( this.dirRuleId );
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
      dirRuleId, dirRuleRef, dirStartDate, dirEndDate,
      ( dirRuleDesc == null ) ? null
                              : ( ( dirRuleDesc.length(  ) <= dirRuleDescSize )
      ? dirRuleDesc
      : dirRuleDesc.substring( 0, dirRuleDescSize ) // auto trimmed to fit, if required.
       ),
      ( dirRuleType == null ) ? null
                              : ( ( dirRuleType.length(  ) <= dirRuleTypeSize )
      ? dirRuleType
      : dirRuleType.substring( 0, dirRuleTypeSize ) // auto trimmed to fit, if required.
       ), dirStartAfter, dirApplyFor,

      ( dirTypeCode == null ) ? null
                              : ( ( dirTypeCode.length(  ) <= dirTypeCodeSize )
      ? dirTypeCode
      : dirTypeCode.substring( 0, dirTypeCodeSize ) // auto trimmed to fit, if required.
       ), dirUomId , dirApplyEvery , dirFilterAcc , dirFilterLegal , dirFilterPackage ,
        dirFilterTariff ,
       ( dirPercentCount == null ) ? null
                              : ( ( dirPercentCount.length(  ) <= dirPercentCountSize )
      ? dirPercentCount
      : dirPercentCount.substring( 0, dirPercentCountSize ) // auto trimmed to fit, if required.
       ),
       ( dirOnceOffFee == null ) ? null
                              : ( ( dirOnceOffFee.length(  ) <= dirOnceOffFeeSize )
      ? dirOnceOffFee
      : dirOnceOffFee.substring( 0, dirOnceOffFeeSize ) // auto trimmed to fit, if required.
       ),
      ( dirBandType == null ) ? null
                              : ( ( dirBandType.length(  ) <= dirBandTypeSize )
      ? dirBandType
      : dirBandType.substring( 0, dirBandTypeSize ) // auto trimmed to fit, if required.
       ), dirThresholdId, dirAppDiscId,
      ( dirChargeRef == null ) ? null
                               : ( ( dirChargeRef.length(  ) <= dirChargeRefSize )
      ? dirChargeRef
      : dirChargeRef.substring( 0, dirChargeRefSize ) // auto trimmed to fit, if required.
       ), dirRuleUsed,
      ( dirAppToVal == null ) ? null
                              : ( ( dirAppToVal.length(  ) <= dirAppToValSize )
      ? dirAppToVal
      : dirAppToVal.substring( 0, dirAppToValSize ) // auto trimmed to fit, if required.
      
       ), dirPercentSplit, dirInvDisplay
    };
  }

  /**
   * DOCUMENT ME!
   *
   * @param fields DOCUMENT ME!
   */
  protected void set( final Object[] fields ) {
    dirRuleId 		= (Integer) fields[0];
    dirRuleRef 		= (Integer) fields[1];
    dirStartDate 	= (DateTime) fields[2];
    dirEndDate 		= (DateTime) fields[3];
    dirRuleDesc 	= rtrim( (String) fields[4] );
    dirRuleType 	= rtrim( (String) fields[5] );
    dirStartAfter 	= (Short) fields[6];
    dirApplyFor 	= (Short) fields[7];
    dirTypeCode 	=  rtrim( (String) fields[8] );
    dirUomId 		= (Integer) fields[9];
    dirApplyEvery 	= (Short) fields[10];
    dirFilterAcc 	=  (Short) fields[11];
    dirFilterLegal 	= (Short) fields[12];
    dirFilterPackage 	= (Short) fields[13];
    dirFilterTariff 	= (Short) fields[14];
    dirPercentCount 	= rtrim( (String) fields[15] );
    dirOnceOffFee   	= rtrim( (String) fields[16] );
    dirBandType 	= rtrim( (String) fields[17] );
    dirThresholdId 	= (Integer) fields[18];
    dirAppDiscId 	= (Integer) fields[19];
    dirChargeRef 	= rtrim( (String) fields[20] );
    dirRuleUsed 	= (Integer) fields[21];
    dirAppToVal		= rtrim( (String) fields[22] );
    dirPercentSplit 	= (BigDecimal) fields[23];
    dirInvDisplay   	= (Short) fields[24];
    
  }

  // Get methods ///////////////////////////////////////////////////////////////
  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public Integer getDirRuleId(  ) {
    return dirRuleId;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public Integer getDirRuleRef(  ) {
    return dirRuleRef;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public DateTime getDirStartDate(  ) {
    return ( dirStartDate != null ) ? new DateTime( dirStartDate ) : null;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public DateTime getDirEndDate(  ) {
    return ( dirEndDate != null ) ? new DateTime( dirEndDate ) : null;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getDirRuleDesc(  ) {
    return dirRuleDesc;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getDirRuleType(  ) {
    return dirRuleType;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public Short getDirStartAfter(  ) {
    return dirStartAfter;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public Short getDirApplyFor(  ) {
    return dirApplyFor;
  }

   /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */

    public String getDirTypeCode(){
		return dirTypeCode;
	}
   /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */

    public Integer  getDirUomId (){
	    return dirUomId;
    }

   /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */

    public Short   getDirApplyEvery (){
	    return dirApplyEvery ;
    }

   /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */

    public Short   getDirFilterAcc (){
	    return dirFilterAcc;
    }

   /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */

    public Short   getDirFilterLegal (){
	    return dirFilterLegal;
    }

   /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */

    public Short   getDirFilterPackage(){
	    return dirFilterPackage;
    }

       /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */

    public Short   getDirFilterTariff (){
	    return this.dirFilterTariff;
    }


      /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getDirPercentCount(  ) {
    return dirPercentCount;
  }

    /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getDirOnceOffFee(  ) {
    return dirOnceOffFee;
  }


  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getDirBandType(  ) {
    return dirBandType;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public Integer getDirThresholdId(  ) {
    return dirThresholdId;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public Integer getDirAppDiscId(  ) {
    return dirAppDiscId;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getDirChargeRef(  ) {
    return dirChargeRef;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public Integer getDirRuleUsed(  ) {
    return dirRuleUsed;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getDirAppToVal(  ) {
    return dirAppToVal;
  }

/**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public BigDecimal  getDirPercentSplit(  ) {
    return dirPercentSplit;
  }


  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public Short  getDirInvDisplay(  ) {
    return dirInvDisplay;
  }





  // Setter methods ///////////////////////////////////////////////////////////////

  //
  // Master setter follows...
  //

  /**
   * Setter that takes all attributes
   */
  public void set( 
    final Integer  dirRuleId,
    final Integer  dirRuleRef,
    final DateTime dirStartDate,
    final DateTime dirEndDate,
    final String   dirRuleDesc,
    final String   dirRuleType,
    final Short    dirStartAfter,
    final Short    dirApplyFor,
    final String   dirTypeCode,
    final Integer  dirUomId,
    final Short    dirApplyEvery,
    final Short    dirFilterAcc,
    final Short    dirFilterLegal,
    final Short    dirFilterPackage,
    final Short    dirFilterTariff,
    final String   dirPercentCount,
    final String   dirOnceOffFee,
    final String   dirBandType,
    final Integer  dirThresholdId,
    final Integer  dirAppDiscId,
    final String   dirChargeRef,
    final Integer  dirRuleUsed,
    final String   dirAppToVal ,
    final BigDecimal dirPercentSplit,
    final Short dirInvDisplay) {
    this.dirRuleId 		= 	dirRuleId	;
    this.dirRuleRef 		= 	dirRuleRef	;
    this.dirStartDate 		= 	( dirStartDate != null ) ? new DateTime( dirStartDate ) : null;
    this.dirEndDate 		= 	( dirEndDate != null ) ? new DateTime( dirEndDate ) : null;
    this.dirRuleDesc 		= 	dirRuleDesc	;
    this.dirRuleType 		= 	dirRuleType	;
    this.dirStartAfter 		= 	dirStartAfter	;
    this.dirApplyFor 		=	dirApplyFor	;
    this.dirBandType 		= 	dirBandType	;
    this.dirThresholdId 	= 	dirThresholdId	;
    this.dirAppDiscId 		= 	dirAppDiscId	;
    this.dirChargeRef 		= 	dirChargeRef	;
    this.dirRuleUsed 		= 	dirRuleUsed	;
    this.dirAppToVal 		= 	dirAppToVal	;
    this.dirTypeCode		=	dirTypeCode	;
    this.dirUomId		=	dirUomId	;
    this.dirApplyEvery		=	dirApplyEvery	;
    this.dirFilterAcc		=	dirFilterAcc	;
    this.dirFilterLegal		=	dirFilterLegal	;
    this.dirFilterPackage	=	dirFilterPackage;
    this.dirFilterTariff	=	dirFilterTariff	;
    this.dirPercentCount	=	dirPercentCount	;
    this.dirOnceOffFee		=	dirOnceOffFee	;
    this.dirPercentSplit	=	dirPercentSplit	;
    this.dirInvDisplay		=	dirInvDisplay	;
  }

  //
  // Public access modifiers if any
  // (provided for attributes that are public in the analysis model)
  //    

  /**
  * Sets the DirRuleId field.
  *
  * @param dirRuleId
  */
  public void setDirRuleId( final Integer dirRuleId ) {
    this.dirRuleId = dirRuleId;
  }

  /**
  * Sets the DirRuleRef field.
  *
  * @param dirRuleRef
  */
  public void setDirRuleRef( final Integer dirRuleRef ) {
    this.dirRuleRef = dirRuleRef;
  }

  /**
  * Sets the DirStartDate field.
  *
  * @param dirStartDate
  */
  public void setDirStartDate( final DateTime dirStartDate ) {
    this.dirStartDate = ( dirStartDate != null )
      ? new DateTime( dirStartDate ) : null;
  }

  /**
  * Sets the DirEndDate field.
  *
  * @param dirEndDate
  */
  public void setDirEndDate( final DateTime dirEndDate ) {
    this.dirEndDate = ( dirEndDate != null ) ? new DateTime( dirEndDate ) : null;
  }

  /**
  * Sets the DirRuleDesc field.
  *
  * @param dirRuleDesc
  */
  public void setDirRuleDesc( final String dirRuleDesc ) {
    this.dirRuleDesc = getPadded(dirRuleDesc, dirRuleDescFilter);
  }

  /**
  * Sets the DirRuleType field.
  *
  * @param dirRuleType
  */
  public void setDirRuleType( final String dirRuleType ) {
    this.dirRuleType = getPadded(dirRuleType, dirRuleTypeFilter);
  }

  /**
  * Sets the DirStartAfter field.
  *
  * @param dirStartAfter
  */
  public void setDirStartAfter( final Short dirStartAfter ) {
    this.dirStartAfter = dirStartAfter;
  }

  /**
  * Sets the DirStartAfter field.
  *
  * @param dirStartAfter
  */
  public void setDirStartAfter( final int dirStartAfter ) {
    this.dirStartAfter = Short.valueOf( (short) dirStartAfter );
  }

  /**
  * Sets the DirApplyFor field.
  *
  * @param dirApplyFor
  */
  public void setDirApplyFor( final Short dirApplyFor ) {
    this.dirApplyFor = dirApplyFor;
  }

  /**
  * Sets the DirTypeCode field.
  *
  * @param dirTypeCode
  */
  public void setDirTypeCode( final String  dirTypeCode ) {
    this.dirTypeCode =  getPadded(dirTypeCode, dirTypeCodeFilter);
  }

/**
  * Sets the DirUomId field.
  *
  * @param dirUomId
  */
  public void setDirUomId( final Integer   dirUomId ) {
    this.dirUomId =  dirUomId;
  }


/**
  * Sets the DirApplyEvery field.
  *
  * @param dirApplyEvery
  */
  public void setDirApplyEvery( final Short  dirApplyEvery ) {
    this.dirApplyEvery =  dirApplyEvery;
  }


/**
  * Sets the dirFilterAcc field.
  *
  * @param dirFilterAcc
  */
  public void setDirFilterAcc( final Short  dirFilterAcc ) {
    this.dirFilterAcc =  dirFilterAcc;
  }


/**
  * Sets the dirFilterLegal field.
  *
  * @param dirFilterLegal
  */
  public void setDirFilterLegal( final Short  dirFilterLegal ) {
    this.dirFilterLegal =  dirFilterLegal;
  }


/**
  * Sets the dirFilterPackage field.
  *
  * @param dirFilterPackage
  */
  public void setDirFilterPackage( final Short  dirFilterPackage ) {
    this.dirFilterPackage =  dirFilterPackage;
  }



/**
  * Sets the dirFilterTariff field.
  *
  * @param dirFilterTariff
  */
  public void setDirFilterTariff( final Short  dirFilterTariff ) {
    this.dirFilterTariff =  dirFilterTariff;
  }



/**
  * Sets the dirPercentCount field.
  *
  * @param dirPercentCount
  */
  public void setDirPercentCount( final String  dirPercentCount ) {
    this.dirPercentCount =  getPadded(dirPercentCount, dirPercentCountFilter);
  }


  /**
  * Sets the dirOnceOffFee field.
  *
  * @param dirOnceOffFee
  */
  public void setDirOnceOffFee( final String  dirOnceOffFee ) {
    this.dirOnceOffFee =  getPadded(dirOnceOffFee, dirOnceOffFeeFilter);
  }



  /**
  * Sets the DirBandType field.
  *
  * @param dirBandType
  */
  public void setDirBandType( final String dirBandType ) {
    this.dirBandType = getPadded(dirBandType, dirBandTypeFilter);
  }

  /**
  * Sets the DirThresholdId field.
  *
  * @param dirThresholdId
  */
  public void setDirThresholdId( final Integer dirThresholdId ) {
    this.dirThresholdId = dirThresholdId;
  }

  /**
  * Sets the DirAppDiscId field.
  *
  * @param dirAppDiscId
  */
  public void setDirAppDiscId( final Integer dirAppDiscId ) {
    this.dirAppDiscId = dirAppDiscId;
  }

  /**
  * Sets the DirChargeRef field.
  *
  * @param dirChargeRef
  */
  public void setDirChargeRef( final String dirChargeRef ) {
    this.dirChargeRef = getPadded(dirChargeRef, dirChargeRefFilter);
  }

  /**
  * Sets the DirRuleUsed field.
  *
  * @param dirRuleUsed
  */
  public void setDirRuleUsed( final Integer dirRuleUsed ) {
    this.dirRuleUsed = dirRuleUsed;
  }

  /**
  * Sets the DirAppToVal field.
  *
  * @param dirAppToVal
  */
  public void setDirAppToVal( final String dirAppToVal ) {
    this.dirAppToVal = getPadded(dirAppToVal, dirAppToValFilter );
  }

  
  /**
  * Sets the dirPercentSplit field.
  *
  * @param dirPercentSplit
  */
  public void setDirPercentSplit( final BigDecimal  dirPercentSplit ) {
    this.dirPercentSplit = dirPercentSplit;
  }


  
  /**
  * Sets the dirInvDisplay field.
  *
  * @param dirInvDisplay
  */
  public void setDirInvDisplay( final Short  dirInvDisplay ) {
    this.dirInvDisplay = dirInvDisplay;
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
