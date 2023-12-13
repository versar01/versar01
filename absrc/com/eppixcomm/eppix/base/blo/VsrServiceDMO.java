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
 * A value object to carry the data for a VsrService.
 *
 *
 * <H3> A VsrService is: </H3>
 *
 * <!-- indent text -->
 * <TABLE BORDER="0" CELLPADDING="0" CELLSPACING="0">
 * <TR>
 * <TD WIDTH="25">&nbsp;</TD>
 * <TD>
 *
 * Each entry defines a service (like voice mail or itemised invoice).
 * <p>
 *   These are grouped under packages (see PACKAGE_SERVICE). Note that there is a mandatory 1 to 1 relationship with
 *   vsr2_service_aux. These tables are to be merged in a later phase.
 * </p>
 * <p>
 *   See the vst_service_type section for details of how to set up the data.
 * </p>
 *
 * <!-- end indent text -->
 * </TD>
 * </TR>
 * </TABLE>
 *
 *
 * <H3> VsrService Value Object: </H3>
 *
 * <!-- indent text -->
 * <TABLE BORDER="0" CELLPADDING="0" CELLSPACING="0">
 * <TR>
 * <TD WIDTH="25">&nbsp;</TD>
 * <TD>
 *
 * <P>
 *     This is a value object (called a Data Model Object or 'DMO').
 *     It is used to pass the data for a vsrService into and out of the BASE module.
 *     Because it's purpose is to carry data into and out of the module it is visible outside the module.
 * </P>
 * <P>
 *     This value object carries the data for one vsrService. A vsrService is:
 * Each entry defines a service (like voice mail or itemised invoice).
 * </P>
 * <P>
 *     It corresponds to the business logic object VsrService which
 *     contains all the business behaviour of a vsrService but is not visible outside the
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
 *    This value object contains fields for all the details of a vsrService, namely:
 * </P>
 *


 * <P>
 *    <U>Fields to carry the Attributes of a vsrService:</U>
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
 *   <TD ALIGN="left" VALIGN="top"><B>vsrServiceCode</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       User defined code to identify this service.
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
 *       <A HREF="#getVsrServiceCode()">
 *           getVsrServiceCode
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setVsrServiceCode(java.lang.String)">
 *           setVsrServiceCode (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>vsrServiceType</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       A hardcode that tells us which of the special services it is, if any.
 *       <p>
 *         Eg: "II" is itemised invoice. Permitted values, defined by CAIL, are listed in VST_SERVICE_TYPE table The service type
 *         is also used to limit the sort of sim that can be selected for the service. For example the 'twin card fax' service can
 *         only be connected to a twin card type of sim. CAUTION: this is copied onto vas_active_service. The types on these
 *         children records must be kept in line with this parent.
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
 *       <A HREF="#getVsrServiceType()">
 *           getVsrServiceType
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setVsrServiceType(java.lang.String)">
 *           setVsrServiceType (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>vsrServiceDesc</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       meaningful name for the service
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
 *       <A HREF="#getVsrServiceDesc()">
 *           getVsrServiceDesc
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setVsrServiceDesc(java.lang.String)">
 *           setVsrServiceDesc (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>vsrOriginator</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       N = Charge (and service) originates with the network
S = Charge (and service) originates with the Service Provider
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
 *       <A HREF="#getVsrOriginator()">
 *           getVsrOriginator
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setVsrOriginator(java.lang.String)">
 *           setVsrOriginator (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>vsrServiceClass</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       B = Basic service (eg: voice line, fax, data.
 *       <p>
 *         ..) V = Value added service (eg: voice mail or itemised invoice) In a future phase this will used to stop some
 *         network's basic services from sharing msisdns. NOTE: This is to be dropped in favour of vsr2_entry_type when the two
 *         tables merge.
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
 *       <A HREF="#getVsrServiceClass()">
 *           getVsrServiceClass
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setVsrServiceClass(java.lang.String)">
 *           setVsrServiceClass (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>vsrTempDeact</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Y = this service can be temporarily deactivated N = it cant This field is not used at the moment.
 *       <p>
 *         Currently services can only be activated or deactivated.
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
 *       <A HREF="#getVsrTempDeact()">
 *           getVsrTempDeact
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setVsrTempDeact(java.lang.String)">
 *           setVsrTempDeact (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>vsrProrata</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Y = the subscription charge for this service should be prorated in proportion to the period it covers.
 *       <p>
 *         N = It should be charged in full.
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
 *       <A HREF="#getVsrProrata()">
 *           getVsrProrata
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setVsrProrata(java.lang.String)">
 *           setVsrProrata (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>vsrProviderId</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Who provides this service.
 *       <p>
 *         If the service is a basic service (vsr_service_class = "B") then this is a net_id and any msisdns chosen for this
 *         service must be restricted to those that are suitable for this network. Regardless, the code xrefs vpr_provider_id
 *         which holds a description of the provider of the service.
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
 *       <A HREF="#getVsrProviderId()">
 *           getVsrProviderId
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setVsrProviderId(java.lang.String)">
 *           setVsrProviderId (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>vsrShortDesc</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Short description for the service.
 *       <p>
 *         Introduced so that it can be used on the title for the tabs on VB screens.
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
 *       <A HREF="#getVsrShortDesc()">
 *           getVsrShortDesc
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setVsrShortDesc(java.lang.String)">
 *           setVsrShortDesc (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>vsrSuspend</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Determines if the service is suspended or not.
 *       <p>
 *         Valid values are Y= Yes N=No
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
 *       <A HREF="#getVsrSuspend()">
 *           getVsrSuspend
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setVsrSuspend(java.lang.String)">
 *           setVsrSuspend (String)
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


 * @see VsrService
 *
 * @author
 * @version $Revision: $
 *
 * @since $jdk$
 */
public class VsrServiceDMO
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
      FIELD_TYPE_STRING /* std public attribute: vsrServiceCode  */,
      FIELD_TYPE_STRING /* std public attribute: vsrServiceType  */,
      FIELD_TYPE_STRING /* std public attribute: vsrServiceDesc  */,
      FIELD_TYPE_STRING /* std public attribute: vsrOriginator  */,
      FIELD_TYPE_STRING /* std public attribute: vsrServiceClass  */,
      FIELD_TYPE_STRING /* std public attribute: vsrTempDeact  */,
      FIELD_TYPE_STRING /* std public attribute: vsrProrata  */,
      FIELD_TYPE_STRING /* std public attribute: vsrProviderId  */,
      FIELD_TYPE_STRING /* std public attribute: vsrShortDesc  */,
      FIELD_TYPE_STRING /* std public attribute: vsrSuspend  */
    };
  

  private final int[] fieldSizes = new int[] { 
		  vsrServiceCodeSize,
		  vsrServiceTypeSize,
		  vsrServiceDescSize,
		  vsrOriginatorSize,
		  vsrServiceClassSize,
		  vsrTempDeactSize,
		  vsrProrataSize,
		  vsrProviderIdSize,
		  vsrShortDescSize,
		  vsrSuspendSize
  };

  public int[] fieldSizes() {
  	return fieldSizes;
  }  

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int vsrServiceCodeFilter = 0; // filter index
  private static final int vsrServiceCodeSize = 4; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int vsrServiceTypeFilter = 1; // filter index
  private static final int vsrServiceTypeSize = 5; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int vsrServiceDescFilter = 2; // filter index
  private static final int vsrServiceDescSize = 32; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int vsrOriginatorFilter = 3; // filter index
  private static final int vsrOriginatorSize = 1; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int vsrServiceClassFilter = 4; // filter index
  private static final int vsrServiceClassSize = 1; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int vsrTempDeactFilter = 5; // filter index
  private static final int vsrTempDeactSize = 1; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int vsrProrataFilter = 6; // filter index
  private static final int vsrProrataSize = 1; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int vsrProviderIdFilter = 7; // filter index
  private static final int vsrProviderIdSize = 5; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int vsrShortDescFilter = 8; // filter index
  private static final int vsrShortDescSize = 8; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int vsrSuspendFilter = 9; // filter index
  private static final int vsrSuspendSize = 1; // field size

  //~ Instance variables /////////////////////////////////////////////////////

  private String vsrOriginator; // Loaded from Schema
  private String vsrProrata; // Loaded from Schema
  private String vsrProviderId; // Loaded from Schema
  private String vsrServiceClass; // Loaded from Schema

  //---------------------
  // Field declarations
  //---------------------
  // all attributes
  private String vsrServiceCode; // Loaded from Schema
  private String vsrServiceDesc; // Loaded from Schema
  private String vsrServiceType; // Loaded from Schema
  private String vsrShortDesc; // Loaded from Schema
  private String vsrSuspend; // Loaded from Schema
  private String vsrTempDeact; // Loaded from Schema

  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new VsrServiceDMO object.
   */
  public VsrServiceDMO(  ) {
  }

  // Constructor - taking public attributes
  /**
   * Creates a new VsrServiceDMO object.
   *
   * @param vsrServiceCode DOCUMENT ME!
   * @param vsrServiceType DOCUMENT ME!
   * @param vsrServiceDesc DOCUMENT ME!
   * @param vsrOriginator DOCUMENT ME!
   * @param vsrServiceClass DOCUMENT ME!
   * @param vsrTempDeact DOCUMENT ME!
   * @param vsrProrata DOCUMENT ME!
   * @param vsrProviderId DOCUMENT ME!
   * @param vsrShortDesc DOCUMENT ME!
   * @param vsrSuspend DOCUMENT ME!
   */
  public VsrServiceDMO( 
    final String vsrServiceCode,
    final String vsrServiceType,
    final String vsrServiceDesc,
    final String vsrOriginator,
    final String vsrServiceClass,
    final String vsrTempDeact,
    final String vsrProrata,
    final String vsrProviderId,
    final String vsrShortDesc,
    final String vsrSuspend ) {
    this.vsrServiceCode = vsrServiceCode;

    this.vsrServiceType = vsrServiceType;

    this.vsrServiceDesc = vsrServiceDesc;

    this.vsrOriginator = vsrOriginator;

    this.vsrServiceClass = vsrServiceClass;

    this.vsrTempDeact = vsrTempDeact;

    this.vsrProrata = vsrProrata;

    this.vsrProviderId = vsrProviderId;

    this.vsrShortDesc = vsrShortDesc;

    this.vsrSuspend = vsrSuspend;
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
    return new DAOArgs( 1 ).arg( ( this.vsrServiceCode == null ) ? null
                                                                 : this.vsrServiceCode
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
      ( vsrServiceCode == null ) ? null
                                 : ( ( vsrServiceCode.length(  ) <= vsrServiceCodeSize )
      ? vsrServiceCode
      : vsrServiceCode.substring( 0, vsrServiceCodeSize ) // auto trimmed to fit, if required.
       ),
      ( vsrServiceType == null ) ? null
                                 : ( ( vsrServiceType.length(  ) <= vsrServiceTypeSize )
      ? vsrServiceType
      : vsrServiceType.substring( 0, vsrServiceTypeSize ) // auto trimmed to fit, if required.
       ),
      ( vsrServiceDesc == null ) ? null
                                 : ( ( vsrServiceDesc.length(  ) <= vsrServiceDescSize )
      ? vsrServiceDesc
      : vsrServiceDesc.substring( 0, vsrServiceDescSize ) // auto trimmed to fit, if required.
       ),
      ( vsrOriginator == null ) ? null
                                : ( ( vsrOriginator.length(  ) <= vsrOriginatorSize )
      ? vsrOriginator
      : vsrOriginator.substring( 0, vsrOriginatorSize ) // auto trimmed to fit, if required.
       ),
      ( vsrServiceClass == null ) ? null
                                  : ( ( vsrServiceClass.length(  ) <= vsrServiceClassSize )
      ? vsrServiceClass
      : vsrServiceClass.substring( 0, vsrServiceClassSize ) // auto trimmed to fit, if required.
       ),
      ( vsrTempDeact == null ) ? null
                               : ( ( vsrTempDeact.length(  ) <= vsrTempDeactSize )
      ? vsrTempDeact
      : vsrTempDeact.substring( 0, vsrTempDeactSize ) // auto trimmed to fit, if required.
       ),
      ( vsrProrata == null ) ? null
                             : ( ( vsrProrata.length(  ) <= vsrProrataSize )
      ? vsrProrata
      : vsrProrata.substring( 0, vsrProrataSize ) // auto trimmed to fit, if required.
       ),
      ( vsrProviderId == null ) ? null
                                : ( ( vsrProviderId.length(  ) <= vsrProviderIdSize )
      ? vsrProviderId
      : vsrProviderId.substring( 0, vsrProviderIdSize ) // auto trimmed to fit, if required.
       ),
      ( vsrShortDesc == null ) ? null
                               : ( ( vsrShortDesc.length(  ) <= vsrShortDescSize )
      ? vsrShortDesc
      : vsrShortDesc.substring( 0, vsrShortDescSize ) // auto trimmed to fit, if required.
       ),
      ( vsrSuspend == null ) ? null
                             : ( ( vsrSuspend.length(  ) <= vsrSuspendSize )
      ? vsrSuspend
      : vsrSuspend.substring( 0, vsrSuspendSize ) // auto trimmed to fit, if required.
       )
    };
  }

  /**
   * DOCUMENT ME!
   *
   * @param fields DOCUMENT ME!
   */
  protected void set( final Object[] fields ) {
    vsrServiceCode = rtrim( (String) fields[0] );
    vsrServiceType = rtrim( (String) fields[1] );
    vsrServiceDesc = rtrim( (String) fields[2] );
    vsrOriginator = rtrim( (String) fields[3] );
    vsrServiceClass = rtrim( (String) fields[4] );
    vsrTempDeact = rtrim( (String) fields[5] );
    vsrProrata = rtrim( (String) fields[6] );
    vsrProviderId = rtrim( (String) fields[7] );
    vsrShortDesc = rtrim( (String) fields[8] );
    vsrSuspend = rtrim( (String) fields[9] );
  }

  // Get methods ///////////////////////////////////////////////////////////////
  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getVsrServiceCode(  ) {
    return vsrServiceCode;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getVsrServiceType(  ) {
    return vsrServiceType;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getVsrServiceDesc(  ) {
    return vsrServiceDesc;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getVsrOriginator(  ) {
    return vsrOriginator;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getVsrServiceClass(  ) {
    return vsrServiceClass;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getVsrTempDeact(  ) {
    return vsrTempDeact;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getVsrProrata(  ) {
    return vsrProrata;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getVsrProviderId(  ) {
    return vsrProviderId;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getVsrShortDesc(  ) {
    return vsrShortDesc;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getVsrSuspend(  ) {
    return vsrSuspend;
  }

  // Setter methods ///////////////////////////////////////////////////////////////

  //
  // Master setter follows...
  //

  /**
   * Setter that takes all attributes
   */
  public void set( 
    final String vsrServiceCode,
    final String vsrServiceType,
    final String vsrServiceDesc,
    final String vsrOriginator,
    final String vsrServiceClass,
    final String vsrTempDeact,
    final String vsrProrata,
    final String vsrProviderId,
    final String vsrShortDesc,
    final String vsrSuspend ) {
    this.vsrServiceCode = vsrServiceCode;
    this.vsrServiceType = vsrServiceType;
    this.vsrServiceDesc = vsrServiceDesc;
    this.vsrOriginator = vsrOriginator;
    this.vsrServiceClass = vsrServiceClass;
    this.vsrTempDeact = vsrTempDeact;
    this.vsrProrata = vsrProrata;
    this.vsrProviderId = vsrProviderId;
    this.vsrShortDesc = vsrShortDesc;
    this.vsrSuspend = vsrSuspend;
  }

  //
  // Public access modifiers if any
  // (provided for attributes that are public in the analysis model)
  //    

  /**
  * Sets the VsrServiceCode field.
  *
  * @param vsrServiceCode
  */
  public void setVsrServiceCode( final String vsrServiceCode ) {
    this.vsrServiceCode = getPadded(vsrServiceCode, vsrServiceCodeFilter);
  }

  /**
  * Sets the VsrServiceType field.
  *
  * @param vsrServiceType
  */
  public void setVsrServiceType( final String vsrServiceType ) {
    this.vsrServiceType = getPadded(vsrServiceType, vsrServiceTypeFilter);
  }

  /**
  * Sets the VsrServiceDesc field.
  *
  * @param vsrServiceDesc
  */
  public void setVsrServiceDesc( final String vsrServiceDesc ) {
    this.vsrServiceDesc = getPadded(vsrServiceDesc, vsrServiceDescFilter);
  }

  /**
  * Sets the VsrOriginator field.
  *
  * @param vsrOriginator
  */
  public void setVsrOriginator( final String vsrOriginator ) {
    this.vsrOriginator = getPadded(vsrOriginator, vsrOriginatorFilter);
  }

  /**
  * Sets the VsrServiceClass field.
  *
  * @param vsrServiceClass
  */
  public void setVsrServiceClass( final String vsrServiceClass ) {
    this.vsrServiceClass = getPadded(vsrServiceClass, vsrServiceClassFilter);
  }

  /**
  * Sets the VsrTempDeact field.
  *
  * @param vsrTempDeact
  */
  public void setVsrTempDeact( final String vsrTempDeact ) {
    this.vsrTempDeact = getPadded(vsrTempDeact, vsrTempDeactFilter);
  }

  /**
  * Sets the VsrProrata field.
  *
  * @param vsrProrata
  */
  public void setVsrProrata( final String vsrProrata ) {
    this.vsrProrata = getPadded(vsrProrata, vsrProrataFilter);
  }

  /**
  * Sets the VsrProviderId field.
  *
  * @param vsrProviderId
  */
  public void setVsrProviderId( final String vsrProviderId ) {
    this.vsrProviderId = getPadded(vsrProviderId, vsrProviderIdFilter);
  }

  /**
  * Sets the VsrShortDesc field.
  *
  * @param vsrShortDesc
  */
  public void setVsrShortDesc( final String vsrShortDesc ) {
    this.vsrShortDesc = getPadded(vsrShortDesc, vsrShortDescFilter);
  }

  /**
  * Sets the VsrSuspend field.
  *
  * @param vsrSuspend
  */
  public void setVsrSuspend( final String vsrSuspend ) {
    this.vsrSuspend = getPadded(vsrSuspend, vsrSuspendFilter);
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
