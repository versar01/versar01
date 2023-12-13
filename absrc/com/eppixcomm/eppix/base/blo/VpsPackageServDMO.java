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
 * A value object to carry the data for a VpsPackageServ.
 *
 *
 * <H3> A VpsPackageServ is: </H3>
 *
 * <!-- indent text -->
 * <TABLE BORDER="0" CELLPADDING="0" CELLSPACING="0">
 * <TR>
 * <TD WIDTH="25">&nbsp;</TD>
 * <TD>
 *
 * Lists the services that are available on a the packages the user has defined.
 * <p>
 *   One entry for each service on each package.
 * </p>
 *
 * <!-- end indent text -->
 * </TD>
 * </TR>
 * </TABLE>
 *
 *
 * <H3> VpsPackageServ Value Object: </H3>
 *
 * <!-- indent text -->
 * <TABLE BORDER="0" CELLPADDING="0" CELLSPACING="0">
 * <TR>
 * <TD WIDTH="25">&nbsp;</TD>
 * <TD>
 *
 * <P>
 *     This is a value object (called a Data Model Object or 'DMO').
 *     It is used to pass the data for a vpsPackageServ into and out of the BASE module.
 *     Because it's purpose is to carry data into and out of the module it is visible outside the module.
 * </P>
 * <P>
 *     This value object carries the data for one vpsPackageServ. A vpsPackageServ is:
 * Lists the services that are available on a the packages the user has defined.
 * </P>
 * <P>
 *     It corresponds to the business logic object VpsPackageServ which
 *     contains all the business behaviour of a vpsPackageServ but is not visible outside the
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
 *    This value object contains fields for all the details of a vpsPackageServ, namely:
 * </P>
 *


 * <P>
 *    <U>Fields to carry the Attributes of a vpsPackageServ:</U>
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
 *   <TD ALIGN="left" VALIGN="top"><B>vpsPackageCode</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       A package of services (see PACKAGE table)
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
 *       <A HREF="#getVpsPackageCode()">
 *           getVpsPackageCode
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setVpsPackageCode(java.lang.String)">
 *           setVpsPackageCode (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>vpsServiceCode</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       A service available under the package (see SERVICE table)
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
 *       <A HREF="#getVpsServiceCode()">
 *           getVpsServiceCode
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setVpsServiceCode(java.lang.String)">
 *           setVpsServiceCode (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>vpsAlterCharge</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Y = the f_charge codes below can be substituted with others or left blank when the service is activated.
 *       <p>
 *         N = the f_charge codes must be used as defined.
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
 *       <A HREF="#getVpsAlterCharge()">
 *           getVpsAlterCharge
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setVpsAlterCharge(java.lang.String)">
 *           setVpsAlterCharge (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>vpsMultiCharge</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Should the charge for this service be multipled by the number of msisdns involved.
 *       <p>
 *         This is only the default used to populate vas_multi_charge which is the one that drives the billing. Values: Y or N (or
 *         local equiv). (see also vps_change_multi and vst_multi_charge)
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
 *       <A HREF="#getVpsMultiCharge()">
 *           getVpsMultiCharge
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setVpsMultiCharge(java.lang.String)">
 *           setVpsMultiCharge (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>vpsChangeMulti</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Can the user alter the above default when performing an activation (thus populating vas_multi_charge).
 *       <p>
 *         Values: Y or N (or local equiv).
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
 *       <A HREF="#getVpsChangeMulti()">
 *           getVpsChangeMulti
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setVpsChangeMulti(java.lang.String)">
 *           setVpsChangeMulti (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>vpsPriceByTarif</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
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
 *       <A HREF="#getVpsPriceByTarif()">
 *           getVpsPriceByTarif
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setVpsPriceByTarif(java.lang.String)">
 *           setVpsPriceByTarif (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>vpsAutoConnect</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Determines whether service will be automatically connected on activation or prompted for.
 *       <p>
 *         An example of a service which would be automatically connected is international bar.
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
 *       <A HREF="#getVpsAutoConnect()">
 *           getVpsAutoConnect
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setVpsAutoConnect(java.lang.String)">
 *           setVpsAutoConnect (String)
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


 * @see VpsPackageServ
 *
 * @author
 * @version $Revision: $
 *
 * @since $jdk$
 */
public class VpsPackageServDMO
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
      FIELD_TYPE_STRING /* std public attribute: vpsPackageCode  */,
      FIELD_TYPE_STRING /* std public attribute: vpsServiceCode  */,
      FIELD_TYPE_STRING /* std public attribute: vpsAlterCharge  */,
      FIELD_TYPE_STRING /* std public attribute: vpsMultiCharge  */,
      FIELD_TYPE_STRING /* std public attribute: vpsChangeMulti  */,
      FIELD_TYPE_STRING /* std public attribute: vpsPriceByTarif  */,
      FIELD_TYPE_STRING /* std public attribute: vpsAutoConnect  */
    };
  
  private final int[] fieldSizes = new int[] {
				vpsPackageCodeSize,
				vpsServiceCodeSize,
				vpsAlterChargeSize,
				vpsMultiChargeSize,
				vpsChangeMultiSize,
				vpsPriceByTarifSize,
				vpsAutoConnectSize
  };
      

  public int[] fieldSizes() {
  	return fieldSizes;
  }  

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int vpsPackageCodeFilter = 0; // filter index
  private static final int vpsPackageCodeSize = 5; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int vpsServiceCodeFilter = 1; // filter index
  private static final int vpsServiceCodeSize = 4; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int vpsAlterChargeFilter = 2; // filter index
  private static final int vpsAlterChargeSize = 1; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int vpsMultiChargeFilter = 3; // filter index
  private static final int vpsMultiChargeSize = 1; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int vpsChangeMultiFilter = 4; // filter index
  private static final int vpsChangeMultiSize = 1; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int vpsPriceByTarifFilter = 5; // filter index
  private static final int vpsPriceByTarifSize = 1; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int vpsAutoConnectFilter = 6; // filter index
  private static final int vpsAutoConnectSize = 1; // field size

  //~ Instance variables /////////////////////////////////////////////////////

  private String vpsAlterCharge; // Loaded from Schema
  private String vpsAutoConnect; // Loaded from Schema
  private String vpsChangeMulti; // Loaded from Schema
  private String vpsMultiCharge; // Loaded from Schema

  //---------------------
  // Field declarations
  //---------------------
  // all attributes
  private String vpsPackageCode; // Loaded from Schema
  private String vpsPriceByTarif; // Loaded from Schema
  private String vpsServiceCode; // Loaded from Schema

  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new VpsPackageServDMO object.
   */
  public VpsPackageServDMO(  ) {
  }

  // Constructor - taking public attributes
  /**
   * Creates a new VpsPackageServDMO object.
   *
   * @param vpsPackageCode DOCUMENT ME!
   * @param vpsServiceCode DOCUMENT ME!
   * @param vpsAlterCharge DOCUMENT ME!
   * @param vpsMultiCharge DOCUMENT ME!
   * @param vpsChangeMulti DOCUMENT ME!
   * @param vpsPriceByTarif DOCUMENT ME!
   * @param vpsAutoConnect DOCUMENT ME!
   */
  public VpsPackageServDMO( 
    final String vpsPackageCode,
    final String vpsServiceCode,
    final String vpsAlterCharge,
    final String vpsMultiCharge,
    final String vpsChangeMulti,
    final String vpsPriceByTarif,
    final String vpsAutoConnect ) {
    this.vpsPackageCode = vpsPackageCode;

    this.vpsServiceCode = vpsServiceCode;

    this.vpsAlterCharge = vpsAlterCharge;

    this.vpsMultiCharge = vpsMultiCharge;

    this.vpsChangeMulti = vpsChangeMulti;

    this.vpsPriceByTarif = vpsPriceByTarif;

    this.vpsAutoConnect = vpsAutoConnect;
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
    return new DAOArgs( 2 ).arg( ( this.vpsPackageCode == null ) ? null
                                                                 : this.vpsPackageCode
      .trim(  ) )
                           .arg( ( this.vpsServiceCode == null ) ? null
                                                                 : this.vpsServiceCode
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
      ( vpsPackageCode == null ) ? null
                                 : ( ( vpsPackageCode.length(  ) <= vpsPackageCodeSize )
      ? vpsPackageCode
      : vpsPackageCode.substring( 0, vpsPackageCodeSize ) // auto trimmed to fit, if required.
       ),
      ( vpsServiceCode == null ) ? null
                                 : ( ( vpsServiceCode.length(  ) <= vpsServiceCodeSize )
      ? vpsServiceCode
      : vpsServiceCode.substring( 0, vpsServiceCodeSize ) // auto trimmed to fit, if required.
       ),
      ( vpsAlterCharge == null ) ? null
                                 : ( ( vpsAlterCharge.length(  ) <= vpsAlterChargeSize )
      ? vpsAlterCharge
      : vpsAlterCharge.substring( 0, vpsAlterChargeSize ) // auto trimmed to fit, if required.
       ),
      ( vpsMultiCharge == null ) ? null
                                 : ( ( vpsMultiCharge.length(  ) <= vpsMultiChargeSize )
      ? vpsMultiCharge
      : vpsMultiCharge.substring( 0, vpsMultiChargeSize ) // auto trimmed to fit, if required.
       ),
      ( vpsChangeMulti == null ) ? null
                                 : ( ( vpsChangeMulti.length(  ) <= vpsChangeMultiSize )
      ? vpsChangeMulti
      : vpsChangeMulti.substring( 0, vpsChangeMultiSize ) // auto trimmed to fit, if required.
       ),
      ( vpsPriceByTarif == null ) ? null
                                  : ( ( vpsPriceByTarif.length(  ) <= vpsPriceByTarifSize )
      ? vpsPriceByTarif
      : vpsPriceByTarif.substring( 0, vpsPriceByTarifSize ) // auto trimmed to fit, if required.
       ),
      ( vpsAutoConnect == null ) ? null
                                 : ( ( vpsAutoConnect.length(  ) <= vpsAutoConnectSize )
      ? vpsAutoConnect
      : vpsAutoConnect.substring( 0, vpsAutoConnectSize ) // auto trimmed to fit, if required.
       )
    };
  }

  /**
   * DOCUMENT ME!
   *
   * @param fields DOCUMENT ME!
   */
  protected void set( final Object[] fields ) {
    vpsPackageCode = rtrim( (String) fields[0] );
    vpsServiceCode = rtrim( (String) fields[1] );
    vpsAlterCharge = rtrim( (String) fields[2] );
    vpsMultiCharge = rtrim( (String) fields[3] );
    vpsChangeMulti = rtrim( (String) fields[4] );
    vpsPriceByTarif = rtrim( (String) fields[5] );
    vpsAutoConnect = rtrim( (String) fields[6] );
  }

  // Get methods ///////////////////////////////////////////////////////////////
  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getVpsPackageCode(  ) {
    return vpsPackageCode;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getVpsServiceCode(  ) {
    return vpsServiceCode;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getVpsAlterCharge(  ) {
    return vpsAlterCharge;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getVpsMultiCharge(  ) {
    return vpsMultiCharge;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getVpsChangeMulti(  ) {
    return vpsChangeMulti;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getVpsPriceByTarif(  ) {
    return vpsPriceByTarif;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getVpsAutoConnect(  ) {
    return vpsAutoConnect;
  }

  // Setter methods ///////////////////////////////////////////////////////////////

  //
  // Master setter follows...
  //

  /**
   * Setter that takes all attributes
   */
  public void set( 
    final String vpsPackageCode,
    final String vpsServiceCode,
    final String vpsAlterCharge,
    final String vpsMultiCharge,
    final String vpsChangeMulti,
    final String vpsPriceByTarif,
    final String vpsAutoConnect ) {
    this.vpsPackageCode = vpsPackageCode;
    this.vpsServiceCode = vpsServiceCode;
    this.vpsAlterCharge = vpsAlterCharge;
    this.vpsMultiCharge = vpsMultiCharge;
    this.vpsChangeMulti = vpsChangeMulti;
    this.vpsPriceByTarif = vpsPriceByTarif;
    this.vpsAutoConnect = vpsAutoConnect;
  }

  //
  // Public access modifiers if any
  // (provided for attributes that are public in the analysis model)
  //    

  /**
  * Sets the VpsPackageCode field.
  *
  * @param vpsPackageCode
  */
  public void setVpsPackageCode( final String vpsPackageCode ) {
    this.vpsPackageCode = getPadded(vpsPackageCode, vpsPackageCodeFilter);
  }

  /**
  * Sets the VpsServiceCode field.
  *
  * @param vpsServiceCode
  */
  public void setVpsServiceCode( final String vpsServiceCode ) {
    this.vpsServiceCode = getPadded(vpsServiceCode, vpsServiceCodeFilter);
  }

  /**
  * Sets the VpsAlterCharge field.
  *
  * @param vpsAlterCharge
  */
  public void setVpsAlterCharge( final String vpsAlterCharge ) {
    this.vpsAlterCharge = getPadded(vpsAlterCharge, vpsAlterChargeFilter);
  }

  /**
  * Sets the VpsMultiCharge field.
  *
  * @param vpsMultiCharge
  */
  public void setVpsMultiCharge( final String vpsMultiCharge ) {
    this.vpsMultiCharge = getPadded(vpsMultiCharge, vpsMultiChargeFilter);
  }

  /**
  * Sets the VpsChangeMulti field.
  *
  * @param vpsChangeMulti
  */
  public void setVpsChangeMulti( final String vpsChangeMulti ) {
    this.vpsChangeMulti = getPadded(vpsChangeMulti, vpsChangeMultiFilter);
  }

  /**
  * Sets the VpsPriceByTarif field.
  *
  * @param vpsPriceByTarif
  */
  public void setVpsPriceByTarif( final String vpsPriceByTarif ) {
    this.vpsPriceByTarif = getPadded(vpsPriceByTarif, vpsPriceByTarifFilter);
  }

  /**
  * Sets the VpsAutoConnect field.
  *
  * @param vpsAutoConnect
  */
  public void setVpsAutoConnect( final String vpsAutoConnect ) {
    this.vpsAutoConnect = getPadded(vpsAutoConnect, vpsAutoConnectFilter);
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
