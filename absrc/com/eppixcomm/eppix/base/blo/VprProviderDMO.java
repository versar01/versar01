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
 * A value object to carry the data for a VprProvider.
 *
 *
 * <H3> A VprProvider is: </H3>
 *
 * <!-- indent text -->
 * <TABLE BORDER="0" CELLPADDING="0" CELLSPACING="0">
 * <TR>
 * <TD WIDTH="25">&nbsp;</TD>
 * <TD>
 *
 * Defines a company that provides one or more of the services offered to subscribers.
 * <p>
 *   This can be a network, the service provider themselves or a third party.
 * </p>
 *
 * <!-- end indent text -->
 * </TD>
 * </TR>
 * </TABLE>
 *
 *
 * <H3> VprProvider Value Object: </H3>
 *
 * <!-- indent text -->
 * <TABLE BORDER="0" CELLPADDING="0" CELLSPACING="0">
 * <TR>
 * <TD WIDTH="25">&nbsp;</TD>
 * <TD>
 *
 * <P>
 *     This is a value object (called a Data Model Object or 'DMO').
 *     It is used to pass the data for a vprProvider into and out of the BASE module.
 *     Because it's purpose is to carry data into and out of the module it is visible outside the module.
 * </P>
 * <P>
 *     This value object carries the data for one vprProvider. A vprProvider is:
 * Defines a company that provides one or more of the services offered to subscribers.
 * </P>
 * <P>
 *     It corresponds to the business logic object VprProvider which
 *     contains all the business behaviour of a vprProvider but is not visible outside the
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
 *    This value object contains fields for all the details of a vprProvider, namely:
 * </P>
 *


 * <P>
 *    <U>Fields to carry the Attributes of a vprProvider:</U>
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
 *   <TD ALIGN="left" VALIGN="top"><B>vprProviderId</B></TD>
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
 *       <A HREF="#getVprProviderId()">
 *           getVprProviderId
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setVprProviderId(java.lang.String)">
 *           setVprProviderId (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>vprProviderName</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Company name.
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
 *       <A HREF="#getVprProviderName()">
 *           getVprProviderName
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setVprProviderName(java.lang.String)">
 *           setVprProviderName (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>vprNetwork</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Y = this is a network operator and so vpr_provider_id MUST be the netid we use to identify this network.
 *       <p>
 *         N = it isn't. vpr_provider_id can be anything.
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
 *       <A HREF="#getVprNetwork()">
 *           getVprNetwork
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setVprNetwork(java.lang.String)">
 *           setVprNetwork (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>vprTechnology</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Technology for this provider id -
must match a tt_type_text entry where tt_group='TECHNOLOGY'
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
 *       <A HREF="#getVprTechnology()">
 *           getVprTechnology
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setVprTechnology(java.lang.String)">
 *           setVprTechnology (String)
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


 * @see VprProvider
 *
 * @author
 * @version $Revision: $
 *
 * @since $jdk$
 */
public class VprProviderDMO
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
      FIELD_TYPE_STRING /* std public attribute: vprProviderId  */,
      FIELD_TYPE_STRING /* std public attribute: vprProviderName  */,
      FIELD_TYPE_STRING /* std public attribute: vprNetwork  */,
      /* FIELD_TYPE_STRING /* std public attribute: vprTechnology  */
    };
  
  private final int[] fieldSizes = new int[] {
				vprProviderIdSize,
				vprProviderNameSize,
				vprNetworkSize
  };
      

  public int[] fieldSizes() {
  	return fieldSizes;
  }  

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int vprProviderIdFilter = 0; // filter index
  private static final int vprProviderIdSize = 5; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int vprProviderNameFilter = 1; // filter index
  private static final int vprProviderNameSize = 32; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int vprNetworkFilter = 2; // filter index
  private static final int vprNetworkSize = 1; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  /*
  public static final int vprTechnologyFilter = 3; // filter index
  private static final int vprTechnologySize = 6; // field size
  */


  //~ Instance variables /////////////////////////////////////////////////////

  private String vprNetwork; // Loaded from Schema

  //---------------------
  // Field declarations
  //---------------------
  // all attributes
  private String vprProviderId; // Loaded from Schema
  private String vprProviderName; // Loaded from Schema
//   private String vprTechnology; // Loaded from Schema

  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new VprProviderDMO object.
   */
  public VprProviderDMO(  ) {
  }

  // Constructor - taking public attributes
  /**
   * Creates a new VprProviderDMO object.
   *
   * @param vprProviderId DOCUMENT ME!
   * @param vprProviderName DOCUMENT ME!
   * @param vprNetwork DOCUMENT ME!
   * @param vprTechnology DOCUMENT ME!
   */
  public VprProviderDMO( 
    final String vprProviderId,
    final String vprProviderName,
    final String vprNetwork
    // final String vprTechnology 
    ) {
    this.vprProviderId = vprProviderId;

    this.vprProviderName = vprProviderName;

    this.vprNetwork = vprNetwork;

    //this.vprTechnology = vprTechnology;
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
    return new DAOArgs( 1 ).arg( ( this.vprProviderId == null ) ? null
                                                                : this.vprProviderId
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
      ( vprProviderId == null ) ? null
                                : ( ( vprProviderId.length(  ) <= vprProviderIdSize )
      ? vprProviderId
      : vprProviderId.substring( 0, vprProviderIdSize ) // auto trimmed to fit, if required.
       ),
      ( vprProviderName == null ) ? null
                                  : ( ( vprProviderName.length(  ) <= vprProviderNameSize )
      ? vprProviderName
      : vprProviderName.substring( 0, vprProviderNameSize ) // auto trimmed to fit, if required.
       ),
      ( vprNetwork == null ) ? null
                             : ( ( vprNetwork.length(  ) <= vprNetworkSize )
      ? vprNetwork
      : vprNetwork.substring( 0, vprNetworkSize ) // auto trimmed to fit, if required.
       )
       /*,
      ( vprTechnology == null ) ? null
                                : ( ( vprTechnology.length(  ) <= vprTechnologySize )
      ? vprTechnology
      : vprTechnology.substring( 0, vprTechnologySize ) // auto trimmed to fit, if required.
       )*/

    };
  }

  /**
   * DOCUMENT ME!
   *
   * @param fields DOCUMENT ME!
   */
  protected void set( final Object[] fields ) {
    vprProviderId = rtrim( (String) fields[0] );
    vprProviderName = rtrim( (String) fields[1] );
    vprNetwork = rtrim( (String) fields[2] );
    //  vprTechnology = rtrim( (String) fields[3] );
  }

  // Get methods ///////////////////////////////////////////////////////////////
  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getVprProviderId(  ) {
    return vprProviderId;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getVprProviderName(  ) {
    return vprProviderName;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getVprNetwork(  ) {
    return vprNetwork;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  /*
  public String getVprTechnology(  ) {
    return vprTechnology;
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
    final String vprProviderId,
    final String vprProviderName,
    final String vprNetwork
    // final String vprTechnology 
    ) {
    this.vprProviderId = vprProviderId;
    this.vprProviderName = vprProviderName;
    this.vprNetwork = vprNetwork;
    //this.vprTechnology = vprTechnology;
  }

  //
  // Public access modifiers if any
  // (provided for attributes that are public in the analysis model)
  //    

  /**
  * Sets the VprProviderId field.
  *
  * @param vprProviderId
  */
  public void setVprProviderId( final String vprProviderId ) {
    this.vprProviderId = getPadded(vprProviderId, vprProviderIdFilter);
  }

  /**
  * Sets the VprProviderName field.
  *
  * @param vprProviderName
  */
  public void setVprProviderName( final String vprProviderName ) {
    this.vprProviderName = getPadded(vprProviderName, vprProviderNameFilter);
  }

  /**
  * Sets the VprNetwork field.
  *
  * @param vprNetwork
  */
  public void setVprNetwork( final String vprNetwork ) {
    this.vprNetwork = getPadded(vprNetwork, vprNetworkFilter);
  }

  /**
  * Sets the VprTechnology field.
  *
  * @param vprTechnology
  */
  /*
  public void setVprTechnology( final String vprTechnology ) {
    this.vprTechnology = vprTechnology;
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
