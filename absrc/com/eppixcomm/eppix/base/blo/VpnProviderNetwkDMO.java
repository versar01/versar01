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
 * A value object to carry the data for a VpnProviderNetwk.
 *
 *
 * <H3> A VpnProviderNetwk is: </H3>
 *
 * <!-- indent text -->
 * <TABLE BORDER="0" CELLPADDING="0" CELLSPACING="0">
 * <TR>
 * <TD WIDTH="25">&nbsp;</TD>
 * <TD>
 *
 * Defines the network prefix, MSISDN mask and SIM mask for a given Network ID.
 * <p>
 *   A network ID may have many entries in this table.
 * </p>
 *
 * <!-- end indent text -->
 * </TD>
 * </TR>
 * </TABLE>
 *
 *
 * <H3> VpnProviderNetwk Value Object: </H3>
 *
 * <!-- indent text -->
 * <TABLE BORDER="0" CELLPADDING="0" CELLSPACING="0">
 * <TR>
 * <TD WIDTH="25">&nbsp;</TD>
 * <TD>
 *
 * <P>
 *     This is a value object (called a Data Model Object or 'DMO').
 *     It is used to pass the data for a vpnProviderNetwk into and out of the BASE module.
 *     Because it's purpose is to carry data into and out of the module it is visible outside the module.
 * </P>
 * <P>
 *     This value object carries the data for one vpnProviderNetwk. A vpnProviderNetwk is:
 * Defines the network prefix, MSISDN mask and SIM mask for a given Network ID.
 * </P>
 * <P>
 *     It corresponds to the business logic object VpnProviderNetwk which
 *     contains all the business behaviour of a vpnProviderNetwk but is not visible outside the
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
 *    This value object contains fields for all the details of a vpnProviderNetwk, namely:
 * </P>
 *


 * <P>
 *    <U>Fields to carry the Attributes of a vpnProviderNetwk:</U>
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
 *   <TD ALIGN="left" VALIGN="top"><B>vpnProviderId</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Unique code to identify a company that offers a service.
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
 *       <A HREF="#getVpnProviderId()">
 *           getVpnProviderId
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setVpnProviderId(java.lang.String)">
 *           setVpnProviderId (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>vpnNetworkPrefix</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       The prefix to which the MASKS relate
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
 *       <A HREF="#getVpnNetworkPrefix()">
 *           getVpnNetworkPrefix
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setVpnNetworkPrefix(java.lang.String)">
 *           setVpnNetworkPrefix (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>vpnMsisdnMask</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       The format of MSISDN numbers for this prefix (Renamed from vpn_msisdn_mask for version 6.
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
 *       <A HREF="#getvpnMsisdnMask()">
 *           getvpnMsisdnMask
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setvpnMsisdnMask(java.lang.String)">
 *           setvpnMsisdnMask (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>vpnSimMask</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       The format of SIM numbers for this prefix (Renamed from vpn_sim_mask for version 6.
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
 *       <A HREF="#getvpnSimMask()">
 *           getvpnSimMask
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setvpnSimMask(java.lang.String)">
 *           setvpnSimMask (String)
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


 * @see VpnProviderNetwk
 *
 * @author
 * @version $Revision: $
 *
 * @since $jdk$
 */
public class VpnProviderNetwkDMO
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
      FIELD_TYPE_STRING /* std public attribute: vpnProviderId  */,
      FIELD_TYPE_STRING /* std public attribute: vpnNetworkPrefix  */,
      FIELD_TYPE_STRING /* std public attribute: vpnMsisdnMask  */,
      FIELD_TYPE_STRING /* std public attribute: vpnSimMask  */
    };
  
  private final int[] fieldSizes = new int[] {
				vpnProviderIdSize,
				vpnNetworkPrefixSize,
				vpnMsisdnMaskSize,
				vpnSimMaskSize
  };
      

  public int[] fieldSizes() {
  	return fieldSizes;
  }  

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int vpnProviderIdFilter = 0; // filter index
  private static final int vpnProviderIdSize = 5; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int vpnNetworkPrefixFilter = 1; // filter index
  private static final int vpnNetworkPrefixSize = 5; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int vpnMsisdnMaskFilter = 2; // filter index
  private static final int vpnMsisdnMaskSize = 15; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int vpnSimMaskFilter = 3; // filter index
  private static final int vpnSimMaskSize = 14; // field size

  //~ Instance variables /////////////////////////////////////////////////////

  private String vpnMsisdnMask; // Loaded from Schema
  private String vpnNetworkPrefix; // Loaded from Schema

  //---------------------
  // Field declarations
  //---------------------
  // all attributes
  private String vpnProviderId; // Loaded from Schema
  private String vpnSimMask; // Loaded from Schema

  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new VpnProviderNetwkDMO object.
   */
  public VpnProviderNetwkDMO(  ) {
  }

  // Constructor - taking public attributes
  /**
   * Creates a new VpnProviderNetwkDMO object.
   *
   * @param vpnProviderId DOCUMENT ME!
   * @param vpnNetworkPrefix DOCUMENT ME!
   * @param vpnMsisdnMask DOCUMENT ME!
   * @param vpnSimMask DOCUMENT ME!
   */
  public VpnProviderNetwkDMO( 
    final String vpnProviderId,
    final String vpnNetworkPrefix,
    final String vpnMsisdnMask,
    final String vpnSimMask ) {
    this.vpnProviderId = vpnProviderId;

    this.vpnNetworkPrefix = vpnNetworkPrefix;

    this.vpnMsisdnMask = vpnMsisdnMask;

    this.vpnSimMask = vpnSimMask;
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
    return new DAOArgs( 2 ).arg( ( this.vpnProviderId == null ) ? null
                                                                : this.vpnProviderId
      .trim(  ) )
                           .arg( ( this.vpnNetworkPrefix == null ) ? null
                                                                   : this.vpnNetworkPrefix
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
      ( vpnProviderId == null ) ? null
                                : ( ( vpnProviderId.length(  ) <= vpnProviderIdSize )
      ? vpnProviderId
      : vpnProviderId.substring( 0, vpnProviderIdSize ) // auto trimmed to fit, if required.
       ),
      ( vpnNetworkPrefix == null ) ? null
                                   : ( ( vpnNetworkPrefix.length(  ) <= vpnNetworkPrefixSize )
      ? vpnNetworkPrefix
      : vpnNetworkPrefix.substring( 0, vpnNetworkPrefixSize ) // auto trimmed to fit, if required.
       ),
      ( vpnMsisdnMask == null ) ? null
                                  : ( ( vpnMsisdnMask.length(  ) <= vpnMsisdnMaskSize )
      ? vpnMsisdnMask
      : vpnMsisdnMask.substring( 0, vpnMsisdnMaskSize ) // auto trimmed to fit, if required.
       ),
      ( vpnSimMask == null ) ? null
                                : ( ( vpnSimMask.length(  ) <= vpnSimMaskSize )
      ? vpnSimMask
      : vpnSimMask.substring( 0, vpnSimMaskSize ) // auto trimmed to fit, if required.
       )
    };
  }

  /**
   * DOCUMENT ME!
   *
   * @param fields DOCUMENT ME!
   */
  protected void set( final Object[] fields ) {
    vpnProviderId = rtrim( (String) fields[0] );
    vpnNetworkPrefix = rtrim( (String) fields[1] );
    vpnMsisdnMask = rtrim( (String) fields[2] );
    vpnSimMask = rtrim( (String) fields[3] );
  }

  // Get methods ///////////////////////////////////////////////////////////////
  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getVpnProviderId(  ) {
    return vpnProviderId;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getVpnNetworkPrefix(  ) {
    return vpnNetworkPrefix;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getVpnMsisdnMask(  ) {
    return vpnMsisdnMask;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getVpnSimMask(  ) {
    return vpnSimMask;
  }

  // Setter methods ///////////////////////////////////////////////////////////////

  //
  // Master setter follows...
  //

  /**
   * Setter that takes all attributes
   */
  public void set( 
    final String vpnProviderId,
    final String vpnNetworkPrefix,
    final String vpnMsisdnMask,
    final String vpnSimMask ) {
    this.vpnProviderId = vpnProviderId;
    this.vpnNetworkPrefix = vpnNetworkPrefix;
    this.vpnMsisdnMask = vpnMsisdnMask;
    this.vpnSimMask = vpnSimMask;
  }

  //
  // Public access modifiers if any
  // (provided for attributes that are public in the analysis model)
  //    

  /**
  * Sets the VpnProviderId field.
  *
  * @param vpnProviderId
  */
  public void setVpnProviderId( final String vpnProviderId ) {
    this.vpnProviderId = getPadded(vpnProviderId, vpnProviderIdFilter);
  }

  /**
  * Sets the VpnNetworkPrefix field.
  *
  * @param vpnNetworkPrefix
  */
  public void setVpnNetworkPrefix( final String vpnNetworkPrefix ) {
    this.vpnNetworkPrefix = getPadded(vpnNetworkPrefix, vpnNetworkPrefixFilter);
  }

  /**
  * Sets the vpnMsisdnMask field.
  *
  * @param vpnMsisdnMask
  */
  public void setVpnMsisdnMask( final String vpnMsisdnMask ) {
    this.vpnMsisdnMask = getPadded(vpnMsisdnMask, vpnMsisdnMaskFilter);
  }

  /**
  * Sets the vpnSimMask field.
  *
  * @param vpnSimMask
  */
  public void setVpnSimMask( final String vpnSimMask ) {
    this.vpnSimMask = getPadded(vpnSimMask, vpnSimMaskFilter);
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
