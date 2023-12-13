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
 * A value object to carry the data for a BcyBillingCycle.
 *
 *
 * <H3> A BcyBillingCycle is: </H3>
 *
 * <!-- indent text -->
 * <TABLE BORDER="0" CELLPADDING="0" CELLSPACING="0">
 * <TR>
 * <TD WIDTH="25">&nbsp;</TD>
 * <TD>
 *
 * Holds the details of the current state of the cycle.
 * <p>
 *   This table is the definition of a cycle. It's the place that shows that a given cycle exists.
 * </p>
 * <p>
 *   There is one entry in here for a cycle. It shows details of the last run, gives the dates for the next and shows which
 *   call_pcccccmmddyy and bill_cccccddmmyy tables to use.
 * </p>
 * <p>
 *   Once a cycle is in use it can't be removed from this table, it has to be retained so old runs can be located by the enquiry
 *   GUIs.
 * </p>
 *
 * <!-- end indent text -->
 * </TD>
 * </TR>
 * </TABLE>
 *
 *
 * <H3> BcyBillingCycle Value Object: </H3>
 *
 * <!-- indent text -->
 * <TABLE BORDER="0" CELLPADDING="0" CELLSPACING="0">
 * <TR>
 * <TD WIDTH="25">&nbsp;</TD>
 * <TD>
 *
 * <P>
 *     This is a value object (called a Data Model Object or 'DMO').
 *     It is used to pass the data for a bcyBillingCycle into and out of the BASE module.
 *     Because it's purpose is to carry data into and out of the module it is visible outside the module.
 * </P>
 * <P>
 *     This value object carries the data for one bcyBillingCycle. A bcyBillingCycle is:
 * Holds the details of the current state of the cycle.
 * </P>
 * <P>
 *     It corresponds to the business logic object BcyBillingCycle which
 *     contains all the business behaviour of a bcyBillingCycle but is not visible outside the
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
 *    This value object contains fields for all the details of a bcyBillingCycle, namely:
 * </P>
 *


 * <P>
 *    <U>Fields to carry the Attributes of a bcyBillingCycle:</U>
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
 *   <TD ALIGN="left" VALIGN="top"><B>bcyBillCycle</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       The billing cycle being defined.
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
 *       <A HREF="#getBcyBillCycle()">
 *           getBcyBillCycle
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setBcyBillCycle(java.lang.String)">
 *           setBcyBillCycle (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>bcyDescription</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       User friendly name for the cycle.
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
 *       <A HREF="#getBcyDescription()">
 *           getBcyDescription
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setBcyDescription(java.lang.String)">
 *           setBcyDescription (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>bcyPeriod</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Determines the period of the billing run .
 *       <p>
 *         W= Weekly based M= Month based The hardcodes are defined in TT_TYPE_TEXT table under the group 'BILLING'.
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
 *       <A HREF="#getBcyPeriod()">
 *           getBcyPeriod
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setBcyPeriod(java.lang.String)">
 *           setBcyPeriod (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>bcyFrequency</B></TD>
 *   <TD ALIGN="left" VALIGN="top">Short</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Number of weeks or months in the period
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
 *       <A HREF="#getBcyFrequency()">
 *           getBcyFrequency
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setBcyFrequency(java.lang.Short)">
 *           setBcyFrequency (Short)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>bcyDayOfRun</B></TD>
 *   <TD ALIGN="left" VALIGN="top">Short</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Day number of the week, month, etc.
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
 *       <A HREF="#getBcyDayOfRun()">
 *           getBcyDayOfRun
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setBcyDayOfRun(java.lang.Short)">
 *           setBcyDayOfRun (Short)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>bcyNextRun</B></TD>
 *   <TD ALIGN="left" VALIGN="top">Date</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       The invoice date of the next scheduled billing run.
 *       <p>
 *         This will be maintained by the Billing Run.
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
 *       <A HREF="#getBcyNextRun()">
 *           getBcyNextRun
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setBcyNextRun(com.cmgwds.eppix.util.Date)">
 *           setBcyNextRun (Date)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>bcySuspended</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Not Currently used  "Y" - this cycle is suspended, subscribers may no longer be put on it.
 *       <p>
 *         "N" - this cycle is no longer in use
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
 *       <A HREF="#getBcySuspended()">
 *           getBcySuspended
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setBcySuspended(java.lang.String)">
 *           setBcySuspended (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>bcyUseStatus</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Whether the usage discount has been performed or not
0 = not yet started
1 = In Progress
2 = incomplete
3 = finished
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
 *       <A HREF="#getBcyUseStatus()">
 *           getBcyUseStatus
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setBcyUseStatus(java.lang.String)">
 *           setBcyUseStatus (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>bcyNextCallRun</B></TD>
 *   <TD ALIGN="left" VALIGN="top">Date</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       The invoice date of the next scheduled usage discount run.
 *       <p>
 *         This is maintained by the Usage Discount Run.
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
 *       <A HREF="#getBcyNextCallRun()">
 *           getBcyNextCallRun
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setBcyNextCallRun(com.cmgwds.eppix.util.Date)">
 *           setBcyNextCallRun (Date)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>bcyInAdvance</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       This field defines whether the cycle is to be run in advance or not.
 *       <p>
 *         Y - Indicates that it will be run in advance N - Indicates that it will be run in arrears
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
 *       <A HREF="#getBcyInAdvance()">
 *           getBcyInAdvance
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setBcyInAdvance(java.lang.String)">
 *           setBcyInAdvance (String)
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


 * @see BcyBillingCycle
 *
 * @author
 * @version $Revision: $
 *
 * @since $jdk$
 */
public class BcyBillingCycleDMO
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
      FIELD_TYPE_STRING /* std public attribute: bcyBillCycle  */,
      FIELD_TYPE_STRING /* std public attribute: bcyDescription  */,
      FIELD_TYPE_STRING /* std public attribute: bcyPeriod  */,
      FIELD_TYPE_SHORT /* std public attribute: bcyFrequency  */,
      FIELD_TYPE_SHORT /* std public attribute: bcyDayOfRun  */,
      FIELD_TYPE_DATEONLY /* std public attribute: bcyNextRun  */,
      FIELD_TYPE_STRING /* std public attribute: bcySuspended  */,
      FIELD_TYPE_STRING /* std public attribute: bcyUseStatus  */,
      FIELD_TYPE_DATEONLY /* std public attribute: bcyNextCallRun  */,
      FIELD_TYPE_STRING /* std public attribute: bcyInAdvance  */
    };

  private final int[] fieldSizes = new int[] {
		  bcyBillCycleSize,
		  bcyDescriptionSize,
		  bcyPeriodSize,
		  0,
		  0,
		  0,
		  bcySuspendedSize,
		  bcyUseStatusSize,
		  0,
		  bcyInAdvanceSize
  };
      

  public int[] fieldSizes() {
  	return fieldSizes;
  }  
  
  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int bcyBillCycleFilter = 0; // filter index
  private static final int bcyBillCycleSize = 5; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int bcyDescriptionFilter = 1; // filter index
  private static final int bcyDescriptionSize = 30; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int bcyPeriodFilter = 2; // filter index
  private static final int bcyPeriodSize = 1; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int bcyFrequencyFilter = 3; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int bcyDayOfRunFilter = 4; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int bcyNextRunFilter = 5; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int bcySuspendedFilter = 6; // filter index
  private static final int bcySuspendedSize = 1; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int bcyUseStatusFilter = 7; // filter index
  private static final int bcyUseStatusSize = 1; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int bcyNextCallRunFilter = 8; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int bcyInAdvanceFilter = 9; // filter index
  private static final int bcyInAdvanceSize = 1; // field size

  //~ Instance variables /////////////////////////////////////////////////////

  private Date bcyNextCallRun; // Loaded from Schema
  private Date bcyNextRun; // Loaded from Schema
  private Short bcyDayOfRun; // Loaded from Schema
  private Short bcyFrequency; // Loaded from Schema

  //---------------------
  // Field declarations
  //---------------------
  // all attributes
  private String bcyBillCycle; // Loaded from Schema
  private String bcyDescription; // Loaded from Schema
  private String bcyInAdvance; // Loaded from Schema
  private String bcyPeriod; // Loaded from Schema
  private String bcySuspended; // Loaded from Schema
  private String bcyUseStatus; // Loaded from Schema

  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new BcyBillingCycleDMO object.
   */
  public BcyBillingCycleDMO(  ) {
  }

  // Constructor - taking public attributes
  /**
   * Creates a new BcyBillingCycleDMO object.
   *
   * @param bcyBillCycle DOCUMENT ME!
   * @param bcyDescription DOCUMENT ME!
   * @param bcyPeriod DOCUMENT ME!
   * @param bcyFrequency DOCUMENT ME!
   * @param bcyDayOfRun DOCUMENT ME!
   * @param bcyNextRun DOCUMENT ME!
   * @param bcySuspended DOCUMENT ME!
   * @param bcyUseStatus DOCUMENT ME!
   * @param bcyNextCallRun DOCUMENT ME!
   * @param bcyInAdvance DOCUMENT ME!
   */
  public BcyBillingCycleDMO( 
    final String bcyBillCycle,
    final String bcyDescription,
    final String bcyPeriod,
    final Short  bcyFrequency,
    final Short  bcyDayOfRun,
    final Date   bcyNextRun,
    final String bcySuspended,
    final String bcyUseStatus,
    final Date   bcyNextCallRun,
    final String bcyInAdvance ) {
    this.bcyBillCycle = bcyBillCycle;

    this.bcyDescription = bcyDescription;

    this.bcyPeriod = bcyPeriod;

    this.bcyFrequency = bcyFrequency;

    this.bcyDayOfRun = bcyDayOfRun;

    this.bcyNextRun = ( bcyNextRun != null ) ? new Date( bcyNextRun ) : null;

    this.bcySuspended = bcySuspended;

    this.bcyUseStatus = bcyUseStatus;

    this.bcyNextCallRun = ( bcyNextCallRun != null )
      ? new Date( bcyNextCallRun ) : null;

    this.bcyInAdvance = bcyInAdvance;
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
    return new DAOArgs( 1 ).arg( ( this.bcyBillCycle == null ) ? null
                                                               : this.bcyBillCycle
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
      ( bcyBillCycle == null ) ? null
                               : ( ( bcyBillCycle.length(  ) <= bcyBillCycleSize )
      ? bcyBillCycle
      : bcyBillCycle.substring( 0, bcyBillCycleSize ) // auto trimmed to fit, if required.
       ),
      ( bcyDescription == null ) ? null
                                 : ( ( bcyDescription.length(  ) <= bcyDescriptionSize )
      ? bcyDescription
      : bcyDescription.substring( 0, bcyDescriptionSize ) // auto trimmed to fit, if required.
       ),
      ( bcyPeriod == null ) ? null
                            : ( ( bcyPeriod.length(  ) <= bcyPeriodSize )
      ? bcyPeriod
      : bcyPeriod.substring( 0, bcyPeriodSize ) // auto trimmed to fit, if required.
       ), bcyFrequency, bcyDayOfRun, bcyNextRun,
      ( bcySuspended == null ) ? null
                               : ( ( bcySuspended.length(  ) <= bcySuspendedSize )
      ? bcySuspended
      : bcySuspended.substring( 0, bcySuspendedSize ) // auto trimmed to fit, if required.
       ),
      ( bcyUseStatus == null ) ? null
                               : ( ( bcyUseStatus.length(  ) <= bcyUseStatusSize )
      ? bcyUseStatus
      : bcyUseStatus.substring( 0, bcyUseStatusSize ) // auto trimmed to fit, if required.
       ), bcyNextCallRun,
      ( bcyInAdvance == null ) ? null
                               : ( ( bcyInAdvance.length(  ) <= bcyInAdvanceSize )
      ? bcyInAdvance
      : bcyInAdvance.substring( 0, bcyInAdvanceSize ) // auto trimmed to fit, if required.
       )
    };
  }

  /**
   * DOCUMENT ME!
   *
   * @param fields DOCUMENT ME!
   */
  protected void set( final Object[] fields ) {
    bcyBillCycle = rtrim( (String) fields[0] );
    bcyDescription = rtrim( (String) fields[1] );
    bcyPeriod = rtrim( (String) fields[2] );
    bcyFrequency = (Short) fields[3];
    bcyDayOfRun = (Short) fields[4];
    bcyNextRun = (Date) fields[5];
    bcySuspended = rtrim( (String) fields[6] );
    bcyUseStatus = rtrim( (String) fields[7] );
    bcyNextCallRun = (Date) fields[8];
    bcyInAdvance = rtrim( (String) fields[9] );
  }

  // Get methods ///////////////////////////////////////////////////////////////
  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getBcyBillCycle(  ) {
    return bcyBillCycle;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getBcyDescription(  ) {
    return bcyDescription;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getBcyPeriod(  ) {
    return bcyPeriod;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public Short getBcyFrequency(  ) {
    return bcyFrequency;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public Short getBcyDayOfRun(  ) {
    return bcyDayOfRun;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public Date getBcyNextRun(  ) {
    return ( bcyNextRun != null ) ? new Date( bcyNextRun ) : null;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getBcySuspended(  ) {
    return bcySuspended;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getBcyUseStatus(  ) {
    return bcyUseStatus;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public Date getBcyNextCallRun(  ) {
    return ( bcyNextCallRun != null ) ? new Date( bcyNextCallRun ) : null;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getBcyInAdvance(  ) {
    return bcyInAdvance;
  }

  // Setter methods ///////////////////////////////////////////////////////////////

  //
  // Master setter follows...
  //

  /**
   * Setter that takes all attributes
   */
  public void set( 
    final String bcyBillCycle,
    final String bcyDescription,
    final String bcyPeriod,
    final Short  bcyFrequency,
    final Short  bcyDayOfRun,
    final Date   bcyNextRun,
    final String bcySuspended,
    final String bcyUseStatus,
    final Date   bcyNextCallRun,
    final String bcyInAdvance ) {
    this.bcyBillCycle = bcyBillCycle;
    this.bcyDescription = bcyDescription;
    this.bcyPeriod = bcyPeriod;
    this.bcyFrequency = bcyFrequency;
    this.bcyDayOfRun = bcyDayOfRun;
    this.bcyNextRun = ( bcyNextRun != null ) ? new Date( bcyNextRun ) : null;
    this.bcySuspended = bcySuspended;
    this.bcyUseStatus = bcyUseStatus;
    this.bcyNextCallRun = ( bcyNextCallRun != null )
      ? new Date( bcyNextCallRun ) : null;
    this.bcyInAdvance = bcyInAdvance;
  }

  //
  // Public access modifiers if any
  // (provided for attributes that are public in the analysis model)
  //    

  /**
  * Sets the BcyBillCycle field.
  *
  * @param bcyBillCycle
  */
  public void setBcyBillCycle( final String bcyBillCycle ) {
    this.bcyBillCycle = getPadded(bcyBillCycle, bcyBillCycleFilter);
  }

  /**
  * Sets the BcyDescription field.
  *
  * @param bcyDescription
  */
  public void setBcyDescription( final String bcyDescription ) {
    this.bcyDescription = getPadded(bcyDescription, bcyDescriptionFilter);
  }

  /**
  * Sets the BcyPeriod field.
  *
  * @param bcyPeriod
  */
  public void setBcyPeriod( final String bcyPeriod ) {
    this.bcyPeriod = getPadded(bcyPeriod, bcyPeriodFilter);
  }

  /**
  * Sets the BcyFrequency field.
  *
  * @param bcyFrequency
  */
  public void setBcyFrequency( final Short bcyFrequency ) {
    this.bcyFrequency = bcyFrequency;
  }

  /**
  * Sets the BcyFrequency field.
  *
  * @param bcyFrequency
  */
  public void setBcyFrequency( final int bcyFrequency ) {
    this.bcyFrequency = Short.valueOf( (short) bcyFrequency );
  }

  /**
  * Sets the BcyDayOfRun field.
  *
  * @param bcyDayOfRun
  */
  public void setBcyDayOfRun( final Short bcyDayOfRun ) {
    this.bcyDayOfRun = bcyDayOfRun;
  }

  /**
  * Sets the BcyDayOfRun field.
  *
  * @param bcyDayOfRun
  */
  public void setBcyDayOfRun( final int bcyDayOfRun ) {
    this.bcyDayOfRun = Short.valueOf( (short) bcyDayOfRun );
  }

  /**
  * Sets the BcyNextRun field.
  *
  * @param bcyNextRun
  */
  public void setBcyNextRun( final Date bcyNextRun ) {
    this.bcyNextRun = ( bcyNextRun != null ) ? new Date( bcyNextRun ) : null;
  }

  /**
  * Sets the BcySuspended field.
  *
  * @param bcySuspended
  */
  public void setBcySuspended( final String bcySuspended ) {
    this.bcySuspended = getPadded(bcySuspended, bcySuspendedFilter);
  }

  /**
  * Sets the BcyUseStatus field.
  *
  * @param bcyUseStatus
  */
  public void setBcyUseStatus( final String bcyUseStatus ) {
    this.bcyUseStatus = getPadded(bcyUseStatus, bcyUseStatusFilter);
  }

  /**
  * Sets the BcyNextCallRun field.
  *
  * @param bcyNextCallRun
  */
  public void setBcyNextCallRun( final Date bcyNextCallRun ) {
    this.bcyNextCallRun = ( bcyNextCallRun != null )
      ? new Date( bcyNextCallRun ) : null;
  }

  /**
  * Sets the BcyInAdvance field.
  *
  * @param bcyInAdvance
  */
  public void setBcyInAdvance( final String bcyInAdvance ) {
    this.bcyInAdvance = getPadded(bcyInAdvance, bcyInAdvanceFilter);
  }

}
