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
 * A value object to carry the data for a VpkPackage.
 *
 *
 * <H3> A VpkPackage is: </H3>
 *
 * <!-- indent text -->
 * <TABLE BORDER="0" CELLPADDING="0" CELLSPACING="0">
 * <TR>
 * <TD WIDTH="25">&nbsp;</TD>
 * <TD>
 *
 * A package is simply a name for a group of services.
 * <p>
 *   When a customer takes out a subscription (see ACTIVE) its for one package. The services that are available under the
 *   package are listed in SERVICE. The services that the customer has chosen to take up for the service are in
 *   ACTIVE_SERVICE.
 * </p>
 *
 * <!-- end indent text -->
 * </TD>
 * </TR>
 * </TABLE>
 *
 *
 * <H3> VpkPackage Value Object: </H3>
 *
 * <!-- indent text -->
 * <TABLE BORDER="0" CELLPADDING="0" CELLSPACING="0">
 * <TR>
 * <TD WIDTH="25">&nbsp;</TD>
 * <TD>
 *
 * <P>
 *     This is a value object (called a Data Model Object or 'DMO').
 *     It is used to pass the data for a vpkPackage into and out of the BASE module.
 *     Because it's purpose is to carry data into and out of the module it is visible outside the module.
 * </P>
 * <P>
 *     This value object carries the data for one vpkPackage. A vpkPackage is:
 * A package is simply a name for a group of services.
 * </P>
 * <P>
 *     It corresponds to the business logic object VpkPackage which
 *     contains all the business behaviour of a vpkPackage but is not visible outside the
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
 *    This value object contains fields for all the details of a vpkPackage, namely:
 * </P>
 *


 * <P>
 *    <U>Fields to carry the Attributes of a vpkPackage:</U>
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
 *   <TD ALIGN="left" VALIGN="top"><B>vpkPackageCode</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       User defined code to uniquely identifies this package.
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
 *       <A HREF="#getVpkPackageCode()">
 *           getVpkPackageCode
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setVpkPackageCode(java.lang.String)">
 *           setVpkPackageCode (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>vpkPackageDesc</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Meaningfull name for the package.
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
 *       <A HREF="#getVpkPackageDesc()">
 *           getVpkPackageDesc
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setVpkPackageDesc(java.lang.String)">
 *           setVpkPackageDesc (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>vpkTarplanRef</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       This is the default tariff plan for any subscriber placed on this package.
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
 *       <A HREF="#getVpkTarplanRef()">
 *           getVpkTarplanRef
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setVpkTarplanRef(java.lang.String)">
 *           setVpkTarplanRef (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>vpkChangeTariff</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Y (local equiv) = the tariff plan above is only the default and can be changed for any alternate plan.
 *       <p>
 *         N (local equiv) = the tariff plan above is the only acceptable one for this package.
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
 *       <A HREF="#getVpkChangeTariff()">
 *           getVpkChangeTariff
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setVpkChangeTariff(java.lang.String)">
 *           setVpkChangeTariff (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>vpkSuspend</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Determine whether to suspend this package or not.
 *       <p>
 *         Valid values are Y = Yes N = No
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
 *       <A HREF="#getVpkSuspend()">
 *           getVpkSuspend
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setVpkSuspend(java.lang.String)">
 *           setVpkSuspend (String)
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


 * @see VpkPackage
 *
 * @author
 * @version $Revision: $
 *
 * @since $jdk$
 */
public class VpkPackageDMO
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
      FIELD_TYPE_STRING /* std public attribute: vpkPackageCode  */,
      FIELD_TYPE_STRING /* std public attribute: vpkPackageDesc  */,
      FIELD_TYPE_STRING /* std public attribute: vpkTarplanRef  */,
      FIELD_TYPE_STRING /* std public attribute: vpkChangeTariff  */,
      FIELD_TYPE_STRING /* std public attribute: vpkSuspend  */
    };
  
  /**
  * TODO SJ Implement the array of field sizes
  *
  */
  private final int[] fieldSizes = new int[] {
			vpkPackageCodeSize,
			vpkPackageDescSize,
			vpkTarplanRefSize,
			vpkChangeTariffSize,
			vpkSuspendSize
  };
      

  public int[] fieldSizes() {
  	return fieldSizes;
  }  

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int vpkPackageCodeFilter = 0; // filter index
  private static final int vpkPackageCodeSize = 5; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int vpkPackageDescFilter = 1; // filter index
  private static final int vpkPackageDescSize = 32; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int vpkTarplanRefFilter = 2; // filter index
  private static final int vpkTarplanRefSize = 20; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int vpkChangeTariffFilter = 3; // filter index
  private static final int vpkChangeTariffSize = 1; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int vpkSuspendFilter = 4; // filter index
  private static final int vpkSuspendSize = 1; // field size

  //~ Instance variables /////////////////////////////////////////////////////

  private String vpkChangeTariff; // Loaded from Schema

  //---------------------
  // Field declarations
  //---------------------
  // all attributes
  private String vpkPackageCode; // Loaded from Schema
  private String vpkPackageDesc; // Loaded from Schema
  private String vpkSuspend; // Loaded from Schema
  private String vpkTarplanRef; // Loaded from Schema

  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new VpkPackageDMO object.
   */
  public VpkPackageDMO(  ) {
  }

  // Constructor - taking public attributes
  /**
   * Creates a new VpkPackageDMO object.
   *
   * @param vpkPackageCode DOCUMENT ME!
   * @param vpkPackageDesc DOCUMENT ME!
   * @param vpkTarplanRef DOCUMENT ME!
   * @param vpkChangeTariff DOCUMENT ME!
   * @param vpkSuspend DOCUMENT ME!
   */
  public VpkPackageDMO( 
    final String vpkPackageCode,
    final String vpkPackageDesc,
    final String vpkTarplanRef,
    final String vpkChangeTariff,
    final String vpkSuspend ) {
    this.vpkPackageCode = vpkPackageCode;

    this.vpkPackageDesc = vpkPackageDesc;

    this.vpkTarplanRef = vpkTarplanRef;

    this.vpkChangeTariff = vpkChangeTariff;

    this.vpkSuspend = vpkSuspend;
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
    return new DAOArgs( 1 ).arg( ( this.vpkPackageCode == null ) ? null
                                                                 : this.vpkPackageCode
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
      ( vpkPackageCode == null ) ? null
                                 : ( ( vpkPackageCode.length(  ) <= vpkPackageCodeSize )
      ? vpkPackageCode
      : vpkPackageCode.substring( 0, vpkPackageCodeSize ) // auto trimmed to fit, if required.
       ),
      ( vpkPackageDesc == null ) ? null
                                 : ( ( vpkPackageDesc.length(  ) <= vpkPackageDescSize )
      ? vpkPackageDesc
      : vpkPackageDesc.substring( 0, vpkPackageDescSize ) // auto trimmed to fit, if required.
       ),
      ( vpkTarplanRef == null ) ? null
                                : ( ( vpkTarplanRef.length(  ) <= vpkTarplanRefSize )
      ? vpkTarplanRef
      : vpkTarplanRef.substring( 0, vpkTarplanRefSize ) // auto trimmed to fit, if required.
       ),
      ( vpkChangeTariff == null ) ? null
                                  : ( ( vpkChangeTariff.length(  ) <= vpkChangeTariffSize )
      ? vpkChangeTariff
      : vpkChangeTariff.substring( 0, vpkChangeTariffSize ) // auto trimmed to fit, if required.
       ),
      ( vpkSuspend == null ) ? null
                             : ( ( vpkSuspend.length(  ) <= vpkSuspendSize )
      ? vpkSuspend
      : vpkSuspend.substring( 0, vpkSuspendSize ) // auto trimmed to fit, if required.
       )
    };
  }

  /**
   * DOCUMENT ME!
   *
   * @param fields DOCUMENT ME!
   */
  protected void set( final Object[] fields ) {
    vpkPackageCode = rtrim( (String) fields[0] );
    vpkPackageDesc = rtrim( (String) fields[1] );
    vpkTarplanRef = rtrim( (String) fields[2] );
    vpkChangeTariff = rtrim( (String) fields[3] );
    vpkSuspend = rtrim( (String) fields[4] );
  }

  // Get methods ///////////////////////////////////////////////////////////////
  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getVpkPackageCode(  ) {
    return vpkPackageCode;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getVpkPackageDesc(  ) {
    return vpkPackageDesc;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getVpkTarplanRef(  ) {
    return vpkTarplanRef;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getVpkChangeTariff(  ) {
    return vpkChangeTariff;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getVpkSuspend(  ) {
    return vpkSuspend;
  }

  // Setter methods ///////////////////////////////////////////////////////////////

  //
  // Master setter follows...
  //

  /**
   * Setter that takes all attributes
   */
  public void set( 
    final String vpkPackageCode,
    final String vpkPackageDesc,
    final String vpkTarplanRef,
    final String vpkChangeTariff,
    final String vpkSuspend ) {
    this.vpkPackageCode = vpkPackageCode;
    this.vpkPackageDesc = vpkPackageDesc;
    this.vpkTarplanRef = vpkTarplanRef;
    this.vpkChangeTariff = vpkChangeTariff;
    this.vpkSuspend = vpkSuspend;
  }

  //
  // Public access modifiers if any
  // (provided for attributes that are public in the analysis model)
  //    

  /**
  * Sets the VpkPackageCode field.
  *
  * @param vpkPackageCode
  */
  public void setVpkPackageCode( final String vpkPackageCode ) {
    this.vpkPackageCode = getPadded(vpkPackageCode, vpkPackageCodeFilter);
  }

  /**
  * Sets the VpkPackageDesc field.
  *
  * @param vpkPackageDesc
  */
  public void setVpkPackageDesc( final String vpkPackageDesc ) {
    this.vpkPackageDesc = getPadded(vpkPackageDesc, vpkPackageDescFilter);
  }

  /**
  * Sets the VpkTarplanRef field.
  *
  * @param vpkTarplanRef
  */
  public void setVpkTarplanRef( final String vpkTarplanRef ) {
    this.vpkTarplanRef = getPadded(vpkTarplanRef, vpkTarplanRefFilter);
  }

  /**
  * Sets the VpkChangeTariff field.
  *
  * @param vpkChangeTariff
  */
  public void setVpkChangeTariff( final String vpkChangeTariff ) {
    this.vpkChangeTariff = getPadded(vpkChangeTariff, vpkChangeTariffFilter);
  }

  /**
  * Sets the VpkSuspend field.
  *
  * @param vpkSuspend
  */
  public void setVpkSuspend( final String vpkSuspend ) {
    this.vpkSuspend = getPadded(vpkSuspend, vpkSuspendFilter);
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
