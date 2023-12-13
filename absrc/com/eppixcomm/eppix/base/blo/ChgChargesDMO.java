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
 * A value object to carry the data for a ChgCharges.
 *
 *
 * <H3> A ChgCharges is: </H3>
 *
 * <!-- indent text -->
 * <TABLE BORDER="0" CELLPADDING="0" CELLSPACING="0">
 * <TR>
 * <TD WIDTH="25">&nbsp;</TD>
 * <TD>
 *
 * Each entry defines a charge code giving it a price and a description.
 * <p>
 *   Whenever a charge is to be made the user can select from this list.
 * </p>
 * <p>
 *   There is only the slight minor change to this table in this version: the netid can take any id defined in vpr_provider_id on
 *   the vpr_provider table.
 * </p>
 *
 * <!-- end indent text -->
 * </TD>
 * </TR>
 * </TABLE>
 *
 *
 * <H3> ChgCharges Value Object: </H3>
 *
 * <!-- indent text -->
 * <TABLE BORDER="0" CELLPADDING="0" CELLSPACING="0">
 * <TR>
 * <TD WIDTH="25">&nbsp;</TD>
 * <TD>
 *
 * <P>
 *     This is a value object (called a Data Model Object or 'DMO').
 *     It is used to pass the data for a chgCharges into and out of the BASE module.
 *     Because it's purpose is to carry data into and out of the module it is visible outside the module.
 * </P>
 * <P>
 *     This value object carries the data for one chgCharges. A chgCharges is:
 * Each entry defines a charge code giving it a price and a description.
 * </P>
 * <P>
 *     It corresponds to the business logic object ChgCharges which
 *     contains all the business behaviour of a chgCharges but is not visible outside the
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
 *    This value object contains fields for all the details of a chgCharges, namely:
 * </P>
 *


 * <P>
 *    <U>Fields to carry the Attributes of a chgCharges:</U>
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
 *   <TD ALIGN="left" VALIGN="top"><B>chgCode</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       A code given to the charge by the user.
 *       <p>
 *         This code is generally called 'the f_charge'.
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
 *       <A HREF="#getChgCode()">
 *           getChgCode
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setChgCode(java.lang.String)">
 *           setChgCode (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>chgDescription</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Meaningful(!
 *       <p>
 *         ) description of the charge.
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
 *       <A HREF="#getChgDescription()">
 *           getChgDescription
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setChgDescription(java.lang.String)">
 *           setChgDescription (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>chgValue</B></TD>
 *   <TD ALIGN="left" VALIGN="top">BigDecimal</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       How much to charge.
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
 *       <A HREF="#getChgValue()">
 *           getChgValue
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setChgValue(java.math.BigDecimal)">
 *           setChgValue (BigDecimal)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>chgVatCode</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Links to Chameleon VAT.
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
 *       <A HREF="#getChgVatCode()">
 *           getChgVatCode
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setChgVatCode(java.lang.String)">
 *           setChgVatCode (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>chgNcode</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Effectively a chameleon ledger code.
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
 *       <A HREF="#getChgNcode()">
 *           getChgNcode
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setChgNcode(java.lang.String)">
 *           setChgNcode (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>chgNetid</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Which providers services the charge can be applied to.
 *       <p>
 *         Until this implementation this was a network id defined as a system key. Now it cross references the vpr_provider_id
 *         (which includes the network ids).
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
 *       <A HREF="#getChgNetid()">
 *           getChgNetid
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setChgNetid(java.lang.String)">
 *           setChgNetid (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>chgChargef</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       F = 'fixed' charge - a regular charge like a subscription.
 *       <p>
 *         A = 'additional' charge - a one off charge like the cost of a sim swap.
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
 *       <A HREF="#getChgChargef()">
 *           getChgChargef
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setChgChargef(java.lang.String)">
 *           setChgChargef (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>chgPeriod</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       The period which is covered by the charge record.
 *       <p>
 *         Valid periods are :- W = Weekly M = Monthly "W" and "M" are hard codes which will be held within the TT_TYPE_TEXT table
 *         under the group of "BILLING"
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
 *       <A HREF="#getChgPeriod()">
 *           getChgPeriod
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setChgPeriod(java.lang.String)">
 *           setChgPeriod (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>chgFrequency</B></TD>
 *   <TD ALIGN="left" VALIGN="top">Short</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       The number of periods covered by the charge value, e.
 *       <p>
 *         g. where '1', it will mean the value covers a 1 week or month period, where 2, a 2 week or month period, etc.
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
 *       <A HREF="#getChgFrequency()">
 *           getChgFrequency
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setChgFrequency(java.lang.Short)">
 *           setChgFrequency (Short)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>chgEffectiveDate</B></TD>
 *   <TD ALIGN="left" VALIGN="top">Date</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       The date from which the current charge is in effect.
 *       <p>
 *         Allows promotional charges to be defined in advance.
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
 *       <A HREF="#getChgEffectiveDate()">
 *           getChgEffectiveDate
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setChgEffectiveDate(com.cmgwds.eppix.util.Date)">
 *           setChgEffectiveDate (Date)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>chgClassId</B></TD>
 *   <TD ALIGN="left" VALIGN="top">Integer</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Class identifier
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
 *       <A HREF="#getChgClassId()">
 *           getChgClassId
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setChgClassId(java.lang.Integer)">
 *           setChgClassId (Integer)
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


 * @see ChgCharges
 *
 * @author
 * @version $Revision: $
 *
 * @since $jdk$
 */
public class ChgChargesDMO
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
      FIELD_TYPE_STRING /* std public attribute: chgCode  */,
      FIELD_TYPE_STRING /* std public attribute: chgDescription  */,
      FIELD_TYPE_BIGDECIMAL /* std public attribute: chgValue  */,
      FIELD_TYPE_STRING /* std public attribute: chgVatCode  */,
      FIELD_TYPE_STRING /* std public attribute: chgNcode  */,
      FIELD_TYPE_STRING /* std public attribute: chgNetid  */,
      FIELD_TYPE_STRING /* std public attribute: chgChargef  */,
      FIELD_TYPE_STRING /* std public attribute: chgPeriod  */,
      FIELD_TYPE_SHORT /* std public attribute: chgFrequency  */,
      FIELD_TYPE_DATEONLY /* std public attribute: chgEffectiveDate  */,
      FIELD_TYPE_INTEGER /* std public attribute: chgClassId  */
    };
  
  private final int[] fieldSizes = new int[] {
		  0,
		  chgCodeSize,
		  chgDescriptionSize,
		  0,
		  chgVatCodeSize,
		  chgNcodeSize,
		  chgNetidSize,
		  chgChargefSize,
		  chgPeriodSize,
		  0,
		  0,
		  0
  };
      

  public int[] fieldSizes() {
  	return fieldSizes;
  }  

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int chgCodeFilter = 0; // filter index
  private static final int chgCodeSize = 5; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int chgDescriptionFilter = 1; // filter index
  private static final int chgDescriptionSize = 32; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int chgValueFilter = 2; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int chgVatCodeFilter = 3; // filter index
  private static final int chgVatCodeSize = 1; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int chgNcodeFilter = 4; // filter index
  private static final int chgNcodeSize = 20; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int chgNetidFilter = 5; // filter index
  private static final int chgNetidSize = 5; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int chgChargefFilter = 6; // filter index
  private static final int chgChargefSize = 1; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int chgPeriodFilter = 7; // filter index
  private static final int chgPeriodSize = 1; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int chgFrequencyFilter = 8; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int chgEffectiveDateFilter = 9; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int chgClassIdFilter = 10; // filter index

  //~ Instance variables /////////////////////////////////////////////////////

  private BigDecimal chgValue; // Loaded from Schema
  private Date chgEffectiveDate; // Loaded from Schema
  private Integer chgClassId; // Loaded from Schema
  private Short chgFrequency; // Loaded from Schema
  private String chgChargef; // Loaded from Schema

  //---------------------
  // Field declarations
  //---------------------
  // all attributes
  private String chgCode; // Loaded from Schema
  private String chgDescription; // Loaded from Schema
  private String chgNcode; // Loaded from Schema
  private String chgNetid; // Loaded from Schema
  private String chgPeriod; // Loaded from Schema
  private String chgVatCode; // Loaded from Schema

  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new ChgChargesDMO object.
   */
  public ChgChargesDMO(  ) {
  }

  // Constructor - taking public attributes
  /**
   * Creates a new ChgChargesDMO object.
   *
   * @param chgCode DOCUMENT ME!
   * @param chgDescription DOCUMENT ME!
   * @param chgValue DOCUMENT ME!
   * @param chgVatCode DOCUMENT ME!
   * @param chgNcode DOCUMENT ME!
   * @param chgNetid DOCUMENT ME!
   * @param chgChargef DOCUMENT ME!
   * @param chgPeriod DOCUMENT ME!
   * @param chgFrequency DOCUMENT ME!
   * @param chgEffectiveDate DOCUMENT ME!
   * @param chgClassId DOCUMENT ME!
   */
  public ChgChargesDMO( 
    final String     chgCode,
    final String     chgDescription,
    final BigDecimal chgValue,
    final String     chgVatCode,
    final String     chgNcode,
    final String     chgNetid,
    final String     chgChargef,
    final String     chgPeriod,
    final Short      chgFrequency,
    final Date       chgEffectiveDate,
    final Integer    chgClassId ) {
    this.chgCode = chgCode;

    this.chgDescription = chgDescription;

    this.chgValue = chgValue;

    this.chgVatCode = chgVatCode;

    this.chgNcode = chgNcode;

    this.chgNetid = chgNetid;

    this.chgChargef = chgChargef;

    this.chgPeriod = chgPeriod;

    this.chgFrequency = chgFrequency;

    this.chgEffectiveDate = ( chgEffectiveDate != null )
      ? new Date( chgEffectiveDate ) : null;

    this.chgClassId = chgClassId;
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
    return new DAOArgs( 3 ).arg( ( this.chgCode == null ) ? null
                                                          : this.chgCode.trim(  ) )
                           .arg( ( this.chgNetid == null ) ? null
                                                           : this.chgNetid
      .trim(  ) )
                           .arg( this.chgEffectiveDate );
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
      ( chgCode == null ) ? null
                          : ( ( chgCode.length(  ) <= chgCodeSize ) ? chgCode
                                                                    : chgCode
      .substring( 0, chgCodeSize ) // auto trimmed to fit, if required.
       ),
      ( chgDescription == null ) ? null
                                 : ( ( chgDescription.length(  ) <= chgDescriptionSize )
      ? chgDescription
      : chgDescription.substring( 0, chgDescriptionSize ) // auto trimmed to fit, if required.
       ), chgValue,
      ( chgVatCode == null ) ? null
                             : ( ( chgVatCode.length(  ) <= chgVatCodeSize )
      ? chgVatCode
      : chgVatCode.substring( 0, chgVatCodeSize ) // auto trimmed to fit, if required.
       ),
      ( chgNcode == null ) ? null
                           : ( ( chgNcode.length(  ) <= chgNcodeSize )
      ? chgNcode
      : chgNcode.substring( 0, chgNcodeSize ) // auto trimmed to fit, if required.
       ),
      ( chgNetid == null ) ? null
                           : ( ( chgNetid.length(  ) <= chgNetidSize )
      ? chgNetid
      : chgNetid.substring( 0, chgNetidSize ) // auto trimmed to fit, if required.
       ),
      ( chgChargef == null ) ? null
                             : ( ( chgChargef.length(  ) <= chgChargefSize )
      ? chgChargef
      : chgChargef.substring( 0, chgChargefSize ) // auto trimmed to fit, if required.
       ),
      ( chgPeriod == null ) ? null
                            : ( ( chgPeriod.length(  ) <= chgPeriodSize )
      ? chgPeriod
      : chgPeriod.substring( 0, chgPeriodSize ) // auto trimmed to fit, if required.
       ), chgFrequency, chgEffectiveDate, chgClassId
    };
  }

  /**
   * DOCUMENT ME!
   *
   * @param fields DOCUMENT ME!
   */
  protected void set( final Object[] fields ) {
    chgCode = rtrim( (String) fields[0] );
    chgDescription = rtrim( (String) fields[1] );
    chgValue = (BigDecimal) fields[2];
    chgVatCode = rtrim( (String) fields[3] );
    chgNcode = rtrim( (String) fields[4] );
    chgNetid = rtrim( (String) fields[5] );
    chgChargef = rtrim( (String) fields[6] );
    chgPeriod = rtrim( (String) fields[7] );
    chgFrequency = (Short) fields[8];
    chgEffectiveDate = (Date) fields[9];
    chgClassId = (Integer) fields[10];
  }

  // Get methods ///////////////////////////////////////////////////////////////
  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getChgCode(  ) {
    return chgCode;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getChgDescription(  ) {
    return chgDescription;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public BigDecimal getChgValue(  ) {
    return chgValue;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getChgVatCode(  ) {
    return chgVatCode;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getChgNcode(  ) {
    return chgNcode;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getChgNetid(  ) {
    return chgNetid;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getChgChargef(  ) {
    return chgChargef;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getChgPeriod(  ) {
    return chgPeriod;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public Short getChgFrequency(  ) {
    return chgFrequency;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public Date getChgEffectiveDate(  ) {
    return ( chgEffectiveDate != null ) ? new Date( chgEffectiveDate ) : null;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public Integer getChgClassId(  ) {
    return chgClassId;
  }

  // Setter methods ///////////////////////////////////////////////////////////////

  //
  // Master setter follows...
  //

  /**
   * Setter that takes all attributes
   */
  public void set( 
    final String     chgCode,
    final String     chgDescription,
    final BigDecimal chgValue,
    final String     chgVatCode,
    final String     chgNcode,
    final String     chgNetid,
    final String     chgChargef,
    final String     chgPeriod,
    final Short      chgFrequency,
    final Date       chgEffectiveDate,
    final Integer    chgClassId ) {
    this.chgCode = chgCode;
    this.chgDescription = chgDescription;
    this.chgValue = chgValue;
    this.chgVatCode = chgVatCode;
    this.chgNcode = chgNcode;
    this.chgNetid = chgNetid;
    this.chgChargef = chgChargef;
    this.chgPeriod = chgPeriod;
    this.chgFrequency = chgFrequency;
    this.chgEffectiveDate = ( chgEffectiveDate != null )
      ? new Date( chgEffectiveDate ) : null;
    this.chgClassId = chgClassId;
  }

  //
  // Public access modifiers if any
  // (provided for attributes that are public in the analysis model)
  //    

  /**
  * Sets the ChgCode field.
  *
  * @param chgCode
  */
  public void setChgCode( final String chgCode ) {
    this.chgCode = getPadded(chgCode, chgCodeFilter);
  }

  /**
  * Sets the ChgDescription field.
  *
  * @param chgDescription
  */
  public void setChgDescription( final String chgDescription ) {
    this.chgDescription = getPadded(chgDescription, chgDescriptionFilter);
  }

  /**
  * Sets the ChgValue field.
  *
  * @param chgValue
  */
  public void setChgValue( final BigDecimal chgValue ) {
    this.chgValue = chgValue;
  }

  /**
  * Sets the ChgValue field.
  *
  * @param chgValue
  */
  public void setChgValue( final double chgValue ) {
    this.chgValue = new BigDecimal( chgValue );
  }

  /**
  * Sets the ChgVatCode field.
  *
  * @param chgVatCode
  */
  public void setChgVatCode( final String chgVatCode ) {
    this.chgVatCode = getPadded(chgVatCode, chgVatCodeFilter);
  }

  /**
  * Sets the ChgNcode field.
  *
  * @param chgNcode
  */
  public void setChgNcode( final String chgNcode ) {
    this.chgNcode = getPadded(chgNcode, chgNcodeFilter);
  }

  /**
  * Sets the ChgNetid field.
  *
  * @param chgNetid
  */
  public void setChgNetid( final String chgNetid ) {
    this.chgNetid = getPadded(chgNetid, chgNetidFilter);
  }

  /**
  * Sets the ChgChargef field.
  *
  * @param chgChargef
  */
  public void setChgChargef( final String chgChargef ) {
    this.chgChargef = getPadded(chgChargef, chgChargefFilter);
  }

  /**
  * Sets the ChgPeriod field.
  *
  * @param chgPeriod
  */
  public void setChgPeriod( final String chgPeriod ) {
    this.chgPeriod = getPadded(chgPeriod, chgPeriodFilter);
  }

  /**
  * Sets the ChgFrequency field.
  *
  * @param chgFrequency
  */
  public void setChgFrequency( final Short chgFrequency ) {
    this.chgFrequency = chgFrequency;
  }

  /**
  * Sets the ChgFrequency field.
  *
  * @param chgFrequency
  */
  public void setChgFrequency( final int chgFrequency ) {
    this.chgFrequency = Short.valueOf( (short) chgFrequency );
  }

  /**
  * Sets the ChgEffectiveDate field.
  *
  * @param chgEffectiveDate
  */
  public void setChgEffectiveDate( final Date chgEffectiveDate ) {
    this.chgEffectiveDate = ( chgEffectiveDate != null )
      ? new Date( chgEffectiveDate ) : null;
  }

  /**
  * Sets the ChgClassId field.
  *
  * @param chgClassId
  */
  public void setChgClassId( final Integer chgClassId ) {
    this.chgClassId = chgClassId;
  }

@Override
public String toString() {
	return "\nChgChargesDMO [\nchgValue=" + chgValue + "\nchgEffectiveDate=" + chgEffectiveDate + "\nchgClassId="
			+ chgClassId + "\nchgFrequency=" + chgFrequency + "\nchgChargef=" + chgChargef + "\nchgCode=" + chgCode
			+ "\nchgDescription=" + chgDescription + "\nchgNcode=" + chgNcode + "\nchgNetid=" + chgNetid
			+ "\nchgPeriod=" + chgPeriod + "\nchgVatCode=" + chgVatCode + "]";
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
