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
 * A value object to carry the data for a TpTariffPlan.
 *
 *
 * <H3> A TpTariffPlan is: </H3>
 *
 * <!-- indent text -->
 * <TABLE BORDER="0" CELLPADDING="0" CELLSPACING="0">
 * <TR>
 * <TD WIDTH="25">&nbsp;</TD>
 * <TD>
 *
 * This table is used in common by the GSM and TDMA calls processing and for version 6.
 * <p>
 *   00 will include an additional technology indicator field and a field that points to the applicable toll tariff plan
 *   (referring to table ttp_toll_tar_plan):
 * </p>
 *
 * <!-- end indent text -->
 * </TD>
 * </TR>
 * </TABLE>
 *
 *
 * <H3> TpTariffPlan Value Object: </H3>
 *
 * <!-- indent text -->
 * <TABLE BORDER="0" CELLPADDING="0" CELLSPACING="0">
 * <TR>
 * <TD WIDTH="25">&nbsp;</TD>
 * <TD>
 *
 * <P>
 *     This is a value object (called a Data Model Object or 'DMO').
 *     It is used to pass the data for a tpTariffPlan into and out of the BASE module.
 *     Because it's purpose is to carry data into and out of the module it is visible outside the module.
 * </P>
 * <P>
 *     This value object carries the data for one tpTariffPlan. A tpTariffPlan is:
 * This table is used in common by the GSM and TDMA calls processing and for version 6.
 * </P>
 * <P>
 *     It corresponds to the business logic object TpTariffPlan which
 *     contains all the business behaviour of a tpTariffPlan but is not visible outside the
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
 *    This value object contains fields for all the details of a tpTariffPlan, namely:
 * </P>
 *


 * <P>
 *    <U>Fields to carry the Attributes of a tpTariffPlan:</U>
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
 *   <TD ALIGN="left" VALIGN="top"><B>tpTarplanRef</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Tariff Plan Reference Code
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
 *       <A HREF="#getTpTarplanRef()">
 *           getTpTarplanRef
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setTpTarplanRef(java.lang.String)">
 *           setTpTarplanRef (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>tpTarplanText</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Description of the Tariff Plan
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
 *       <A HREF="#getTpTarplanText()">
 *           getTpTarplanText
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setTpTarplanText(java.lang.String)">
 *           setTpTarplanText (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>tpCurrncyRef</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Tariff plan's currency code
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
 *       <A HREF="#getTpCurrncyRef()">
 *           getTpCurrncyRef
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setTpCurrncyRef(java.lang.String)">
 *           setTpCurrncyRef (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>tpTechnology</B></TD>
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
 *       <A HREF="#getTpTechnology()">
 *           getTpTechnology
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setTpTechnology(java.lang.String)">
 *           setTpTechnology (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>tpTollplanRef</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       The applicable toll tariff plan - links to ttp_toll_tar_plan (Added for version 6.
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
 *       <A HREF="#getTpTollplanRef()">
 *           getTpTollplanRef
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setTpTollplanRef(java.lang.String)">
 *           setTpTollplanRef (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>tpSuspendInd</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Suspended tariff indicator
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
 *       <A HREF="#getTpSuspendInd()">
 *           getTpSuspendInd
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setTpSuspendInd(java.lang.String)">
 *           setTpSuspendInd (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>tpIncomming</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Incoming charges indicator
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
 *       <A HREF="#getTpIncomming()">
 *           getTpIncomming
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setTpIncomming(java.lang.String)">
 *           setTpIncomming (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>tpInternational</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       International charges indicator
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
 *       <A HREF="#getTpInternational()">
 *           getTpInternational
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setTpInternational(java.lang.String)">
 *           setTpInternational (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>tpLocal</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Local charges indicator
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
 *       <A HREF="#getTpLocal()">
 *           getTpLocal
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setTpLocal(java.lang.String)">
 *           setTpLocal (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>tpOffPeak</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Off-peak charges indicator
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
 *       <A HREF="#getTpOffPeak()">
 *           getTpOffPeak
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setTpOffPeak(java.lang.String)">
 *           setTpOffPeak (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>tpHighSpend</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       High-spend indicator
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
 *       <A HREF="#getTpHighSpend()">
 *           getTpHighSpend
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setTpHighSpend(java.lang.String)">
 *           setTpHighSpend (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>tpTimestamp</B></TD>
 *   <TD ALIGN="left" VALIGN="top">DateTime</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Record Creation Timestamp
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
 *       <A HREF="#getTpTimestamp()">
 *           getTpTimestamp
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setTpTimestamp(com.cmgwds.eppix.util.DateTime)">
 *           setTpTimestamp (DateTime)
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


 * @see TpTariffPlan
 *
 * @author
 * @version $Revision: $
 *
 * @since $jdk$
 */
public class TpTariffPlanDMO
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
      FIELD_TYPE_STRING /* std public attribute: tpTarplanRef  */,
      FIELD_TYPE_STRING /* std public attribute: tpTarplanText  */,
      FIELD_TYPE_STRING /* std public attribute: tpCurrncyRef  */,
     /* FIELD_TYPE_STRING  std public attribute: tpTechnology  
      FIELD_TYPE_STRING    std public attribute: tpTollplanRef  */
      FIELD_TYPE_STRING /* std public attribute: tpSuspendInd  */,
      FIELD_TYPE_STRING /* std public attribute: tpIncomming  */,
      FIELD_TYPE_STRING /* std public attribute: tpInternational  */,
      FIELD_TYPE_STRING /* std public attribute: tpLocal  */,
      FIELD_TYPE_STRING /* std public attribute: tpOffPeak  */,
      FIELD_TYPE_STRING /* std public attribute: tpHighSpend  */,
      FIELD_TYPE_DATETIME /* std public attribute: tpTimestamp  */
    };
  
  private final int[] fieldSizes = new int[] {
			tpTarplanRefSize,
			tpTarplanTextSize,
			tpCurrncyRefSize
  };
      

  public int[] fieldSizes() {
  	return fieldSizes;
  }  

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int tpTarplanRefFilter = 0; // filter index
  private static final int tpTarplanRefSize = 20; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int tpTarplanTextFilter = 1; // filter index
  private static final int tpTarplanTextSize = 30; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int tpCurrncyRefFilter = 2; // filter index
  private static final int tpCurrncyRefSize = 3; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  /*
  public static final int tpTechnologyFilter = 3; // filter index
  private static final int tpTechnologySize = 6; // field size 
  */
  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  
  /*
  public static final int tpTollplanRefFilter = 4; // filter index
  private static final int tpTollplanRefSize = 3; // field size
  */

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int tpSuspendIndFilter = 3; // filter index
  private static final int tpSuspendIndSize = 1; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int tpIncommingFilter = 4; // filter index
  private static final int tpIncommingSize = 1; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int tpInternationalFilter = 5; // filter index
  private static final int tpInternationalSize = 1; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int tpLocalFilter = 6; // filter index
  private static final int tpLocalSize = 1; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int tpOffPeakFilter = 7; // filter index
  private static final int tpOffPeakSize = 1; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int tpHighSpendFilter = 8; // filter index
  private static final int tpHighSpendSize = 1; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int tpTimestampFilter = 9; // filter index

  //~ Instance variables /////////////////////////////////////////////////////

  private DateTime tpTimestamp; // Loaded from Schema
  private String tpCurrncyRef; // Loaded from Schema
  private String tpHighSpend; // Loaded from Schema
  private String tpIncomming; // Loaded from Schema
  private String tpInternational; // Loaded from Schema
  private String tpLocal; // Loaded from Schema
  private String tpOffPeak; // Loaded from Schema
  private String tpSuspendInd; // Loaded from Schema

  //---------------------
  // Field declarations
  //---------------------
  // all attributes
  private String tpTarplanRef; // Loaded from Schema
  private String tpTarplanText; // Loaded from Schema

  // private String tpTechnology; // Loaded from Schema
  // private String tpTollplanRef; // Loaded from Schema

  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new TpTariffPlanDMO object.
   */
  public TpTariffPlanDMO(  ) {
  }

  // Constructor - taking public attributes
  /**
   * Creates a new TpTariffPlanDMO object.
   *
   * @param tpTarplanRef DOCUMENT ME!
   * @param tpTarplanText DOCUMENT ME!
   * @param tpCurrncyRef DOCUMENT ME!
   * @param tpTechnology DOCUMENT ME!
   * @param tpTollplanRef DOCUMENT ME!
   * @param tpSuspendInd DOCUMENT ME!
   * @param tpIncomming DOCUMENT ME!
   * @param tpInternational DOCUMENT ME!
   * @param tpLocal DOCUMENT ME!
   * @param tpOffPeak DOCUMENT ME!
   * @param tpHighSpend DOCUMENT ME!
   * @param tpTimestamp DOCUMENT ME!
   */
  public TpTariffPlanDMO( 
    final String   tpTarplanRef,
    final String   tpTarplanText,
    final String   tpCurrncyRef,
    //    final String   tpTechnology,
    //    final String   tpTollplanRef,
    final String   tpSuspendInd,
    final String   tpIncomming,
    final String   tpInternational,
    final String   tpLocal,
    final String   tpOffPeak,
    final String   tpHighSpend,
    final DateTime tpTimestamp ) {
    this.tpTarplanRef = tpTarplanRef;

    this.tpTarplanText = tpTarplanText;

    this.tpCurrncyRef = tpCurrncyRef;

   //    this.tpTechnology = tpTechnology;

   //    this.tpTollplanRef = tpTollplanRef;

    this.tpSuspendInd = tpSuspendInd;

    this.tpIncomming = tpIncomming;

    this.tpInternational = tpInternational;

    this.tpLocal = tpLocal;

    this.tpOffPeak = tpOffPeak;

    this.tpHighSpend = tpHighSpend;

    this.tpTimestamp = ( tpTimestamp != null ) ? new DateTime( tpTimestamp )
                                               : null;
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
    return new DAOArgs( 1 ).arg( ( this.tpTarplanRef == null ) ? null
                                                               : this.tpTarplanRef
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
      ( tpTarplanRef == null ) ? null
                               : ( ( tpTarplanRef.length(  ) <= tpTarplanRefSize )
      ? tpTarplanRef
      : tpTarplanRef.substring( 0, tpTarplanRefSize ) // auto trimmed to fit, if required.
       ),
      ( tpTarplanText == null ) ? null
                                : ( ( tpTarplanText.length(  ) <= tpTarplanTextSize )
      ? tpTarplanText
      : tpTarplanText.substring( 0, tpTarplanTextSize ) // auto trimmed to fit, if required.
       ),
      ( tpCurrncyRef == null ) ? null
                               : ( ( tpCurrncyRef.length(  ) <= tpCurrncyRefSize )
      ? tpCurrncyRef
      : tpCurrncyRef.substring( 0, tpCurrncyRefSize ) // auto trimmed to fit, if required.
       ),
      /*
      ( tpTechnology == null ) ? null
                               : ( ( tpTechnology.length(  ) <= tpTechnologySize )
      ? tpTechnology
      : tpTechnology.substring( 0, tpTechnologySize ) // auto trimmed to fit, if required.
       ),
      ( tpTollplanRef == null ) ? null
                                : ( ( tpTollplanRef.length(  ) <= tpTollplanRefSize )
      ? tpTollplanRef
      : tpTollplanRef.substring( 0, tpTollplanRefSize ) // auto trimmed to fit, if required.
       ),*/

      ( tpSuspendInd == null ) ? null
                               : ( ( tpSuspendInd.length(  ) <= tpSuspendIndSize )
      ? tpSuspendInd
      : tpSuspendInd.substring( 0, tpSuspendIndSize ) // auto trimmed to fit, if required.
       ),
      ( tpIncomming == null ) ? null
                              : ( ( tpIncomming.length(  ) <= tpIncommingSize )
      ? tpIncomming
      : tpIncomming.substring( 0, tpIncommingSize ) // auto trimmed to fit, if required.
       ),
      ( tpInternational == null ) ? null
                                  : ( ( tpInternational.length(  ) <= tpInternationalSize )
      ? tpInternational
      : tpInternational.substring( 0, tpInternationalSize ) // auto trimmed to fit, if required.
       ),
      ( tpLocal == null ) ? null
                          : ( ( tpLocal.length(  ) <= tpLocalSize ) ? tpLocal
                                                                    : tpLocal
      .substring( 0, tpLocalSize ) // auto trimmed to fit, if required.
       ),
      ( tpOffPeak == null ) ? null
                            : ( ( tpOffPeak.length(  ) <= tpOffPeakSize )
      ? tpOffPeak
      : tpOffPeak.substring( 0, tpOffPeakSize ) // auto trimmed to fit, if required.
       ),
      ( tpHighSpend == null ) ? null
                              : ( ( tpHighSpend.length(  ) <= tpHighSpendSize )
      ? tpHighSpend
      : tpHighSpend.substring( 0, tpHighSpendSize ) // auto trimmed to fit, if required.
       ), tpTimestamp
    };
  }

  /**
   * DOCUMENT ME!
   *
   * @param fields DOCUMENT ME!
   */
  protected void set( final Object[] fields ) {
    tpTarplanRef = rtrim( (String) fields[0] );
    tpTarplanText = rtrim( (String) fields[1] );
    tpCurrncyRef = rtrim( (String) fields[2] );
   // tpTechnology = rtrim( (String) fields[3] );
    // tpTollplanRef = rtrim( (String) fields[4] );
    tpSuspendInd = rtrim( (String) fields[3] );
    tpIncomming = rtrim( (String) fields[4] );
    tpInternational = rtrim( (String) fields[5] );
    tpLocal = rtrim( (String) fields[6] );
    tpOffPeak = rtrim( (String) fields[7] );
    tpHighSpend = rtrim( (String) fields[8] );
    tpTimestamp = (DateTime) fields[9];
  }

  // Get methods ///////////////////////////////////////////////////////////////
  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getTpTarplanRef(  ) {
    return tpTarplanRef;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getTpTarplanText(  ) {
    return tpTarplanText;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getTpCurrncyRef(  ) {
    return tpCurrncyRef;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  /*
  public String getTpTechnology(  ) {
    return tpTechnology;
  }
  */
  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  /*
  public String getTpTollplanRef(  ) {
    return tpTollplanRef;
  }
  */
  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getTpSuspendInd(  ) {
    return tpSuspendInd;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getTpIncomming(  ) {
    return tpIncomming;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getTpInternational(  ) {
    return tpInternational;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getTpLocal(  ) {
    return tpLocal;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getTpOffPeak(  ) {
    return tpOffPeak;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getTpHighSpend(  ) {
    return tpHighSpend;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public DateTime getTpTimestamp(  ) {
    return ( tpTimestamp != null ) ? new DateTime( tpTimestamp ) : null;
  }

  // Setter methods ///////////////////////////////////////////////////////////////

  //
  // Master setter follows...
  //

  /**
   * Setter that takes all attributes
   */
  public void set( 
    final String   tpTarplanRef,
    final String   tpTarplanText,
    final String   tpCurrncyRef,
  /*  final String   tpTechnology,
    final String   tpTollplanRef, */
    final String   tpSuspendInd,
    final String   tpIncomming,
    final String   tpInternational,
    final String   tpLocal,
    final String   tpOffPeak,
    final String   tpHighSpend,
    final DateTime tpTimestamp ) {
    this.tpTarplanRef = tpTarplanRef;
    this.tpTarplanText = tpTarplanText;
    this.tpCurrncyRef = tpCurrncyRef;
    /*
    this.tpTechnology = tpTechnology;
    this.tpTollplanRef = tpTollplanRef;
    */
    this.tpSuspendInd = tpSuspendInd;
    this.tpIncomming = tpIncomming;
    this.tpInternational = tpInternational;
    this.tpLocal = tpLocal;
    this.tpOffPeak = tpOffPeak;
    this.tpHighSpend = tpHighSpend;
    this.tpTimestamp = ( tpTimestamp != null ) ? new DateTime( tpTimestamp )
                                               : null;
  }

  //
  // Public access modifiers if any
  // (provided for attributes that are public in the analysis model)
  //    

  /**
  * Sets the TpTarplanRef field.
  *
  * @param tpTarplanRef
  */
  public void setTpTarplanRef( final String tpTarplanRef ) {
    this.tpTarplanRef = tpTarplanRef;
  }

  /**
  * Sets the TpTarplanText field.
  *
  * @param tpTarplanText
  */
  public void setTpTarplanText( final String tpTarplanText ) {
    this.tpTarplanText = tpTarplanText;
  }

  /**
  * Sets the TpCurrncyRef field.
  *
  * @param tpCurrncyRef
  */
  public void setTpCurrncyRef( final String tpCurrncyRef ) {
    this.tpCurrncyRef = tpCurrncyRef;
  }

  /**
  * Sets the TpTechnology field.
  *
  * @param tpTechnology
  */
  /*
  public void setTpTechnology( final String tpTechnology ) {
    this.tpTechnology = tpTechnology;
  }
  */

  /**
  * Sets the TpTollplanRef field.
  *
  * @param tpTollplanRef
  */
  /*
  public void setTpTollplanRef( final String tpTollplanRef ) {
    this.tpTollplanRef = tpTollplanRef;
  }*/


  /**
  * Sets the TpSuspendInd field.
  *
  * @param tpSuspendInd
  */
  public void setTpSuspendInd( final String tpSuspendInd ) {
    this.tpSuspendInd = getPadded(tpSuspendInd, tpSuspendIndFilter);
  }

  /**
  * Sets the TpIncomming field.
  *
  * @param tpIncomming
  */
  public void setTpIncomming( final String tpIncomming ) {
    this.tpIncomming = getPadded(tpIncomming, tpIncommingFilter);
  }

  /**
  * Sets the TpInternational field.
  *
  * @param tpInternational
  */
  public void setTpInternational( final String tpInternational ) {
    this.tpInternational = getPadded(tpInternational, tpInternationalFilter);
  }

  /**
  * Sets the TpLocal field.
  *
  * @param tpLocal
  */
  public void setTpLocal( final String tpLocal ) {
    this.tpLocal = getPadded(tpLocal, tpLocalFilter);
  }

  /**
  * Sets the TpOffPeak field.
  *
  * @param tpOffPeak
  */
  public void setTpOffPeak( final String tpOffPeak ) {
    this.tpOffPeak = getPadded(tpOffPeak, tpOffPeakFilter);
  }

  /**
  * Sets the TpHighSpend field.
  *
  * @param tpHighSpend
  */
  public void setTpHighSpend( final String tpHighSpend ) {
    this.tpHighSpend = getPadded(tpHighSpend, tpHighSpendFilter);
  }

  /**
  * Sets the TpTimestamp field.
  *
  * @param tpTimestamp
  */
  public void setTpTimestamp( final DateTime tpTimestamp ) {
    this.tpTimestamp = ( tpTimestamp != null ) ? new DateTime( tpTimestamp )
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
}
