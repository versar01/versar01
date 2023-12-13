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
 * A value object to carry the data for a SpdServParamDef.
 *
 *
 * <H3> A SpdServParamDef is: </H3>
 *
 * <!-- indent text -->
 * <TABLE BORDER="0" CELLPADDING="0" CELLSPACING="0">
 * <TR>
 * <TD WIDTH="25">&nbsp;</TD>
 * <TD>
 *
 * null
 *
 * <!-- end indent text -->
 * </TD>
 * </TR>
 * </TABLE>
 *
 *
 * <H3> SpdServParamDef Value Object: </H3>
 *
 * <!-- indent text -->
 * <TABLE BORDER="0" CELLPADDING="0" CELLSPACING="0">
 * <TR>
 * <TD WIDTH="25">&nbsp;</TD>
 * <TD>
 *
 * <P>
 *     This is a value object (called a Data Model Object or 'DMO').
 *     It is used to pass the data for a spdServParamDef into and out of the BASE module.
 *     Because it's purpose is to carry data into and out of the module it is visible outside the module.
 * </P>
 * <P>
 *     This value object carries the data for one spdServParamDef. A spdServParamDef is:
 * null
 * </P>
 * <P>
 *     It corresponds to the business logic object SpdServParamDef which
 *     contains all the business behaviour of a spdServParamDef but is not visible outside the
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
 *    This value object contains fields for all the details of a spdServParamDef, namely:
 * </P>
 *


 * <P>
 *    <U>Fields to carry the Attributes of a spdServParamDef:</U>
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
 *   <TD ALIGN="left" VALIGN="top"><B>spdServiceCode</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       null
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
 *       <A HREF="#getSpdServiceCode()">
 *           getSpdServiceCode
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setSpdServiceCode(java.lang.String)">
 *           setSpdServiceCode (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>spdParamId</B></TD>
 *   <TD ALIGN="left" VALIGN="top">Short</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       null
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
 *       <A HREF="#getSpdParamId()">
 *           getSpdParamId
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setSpdParamId(java.lang.Short)">
 *           setSpdParamId (Short)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>spdDefaultVal</B></TD>
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
 *       <A HREF="#getSpdDefaultVal()">
 *           getSpdDefaultVal
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setSpdDefaultVal(java.lang.String)">
 *           setSpdDefaultVal (String)
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


 * @see SpdServParamDef
 *
 * @author
 * @version $Revision: $
 *
 * @since $jdk$
 */
public class SpdServParamDefDMO
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
      FIELD_TYPE_STRING /* std public attribute: spdServiceCode  */,
      FIELD_TYPE_SHORT /* std public attribute: spdParamId  */,
      FIELD_TYPE_STRING /* std public attribute: spdDefaultVal  */
    };
  
  private final int[] fieldSizes = new int[] {
		 spdServiceCodeSize,
		 0,
		 spdDefaultValSize
  };
      

  public int[] fieldSizes() {
  	return fieldSizes;
  }  

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int spdServiceCodeFilter = 0; // filter index
  private static final int spdServiceCodeSize = 4; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int spdParamIdFilter = 1; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int spdDefaultValFilter = 2; // filter index
  private static final int spdDefaultValSize = 20; // field size

  //~ Instance variables /////////////////////////////////////////////////////

  private Short spdParamId; // Loaded from Schema
  private String spdDefaultVal; // Loaded from Schema

  //---------------------
  // Field declarations
  //---------------------
  // all attributes
  private String spdServiceCode; // Loaded from Schema

  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new SpdServParamDefDMO object.
   */
  public SpdServParamDefDMO(  ) {
  }

  // Constructor - taking public attributes
  /**
   * Creates a new SpdServParamDefDMO object.
   *
   * @param spdServiceCode DOCUMENT ME!
   * @param spdParamId DOCUMENT ME!
   * @param spdDefaultVal DOCUMENT ME!
   */
  public SpdServParamDefDMO( 
    final String spdServiceCode,
    final Short  spdParamId,
    final String spdDefaultVal ) {
    this.spdServiceCode = spdServiceCode;

    this.spdParamId = spdParamId;

    this.spdDefaultVal = spdDefaultVal;
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
    return new DAOArgs( 2 ).arg( ( this.spdServiceCode == null ) ? null
                                                                 : this.spdServiceCode
      .trim(  ) )
                           .arg( this.spdParamId );
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
      ( spdServiceCode == null ) ? null
                                 : ( ( spdServiceCode.length(  ) <= spdServiceCodeSize )
      ? spdServiceCode
      : spdServiceCode.substring( 0, spdServiceCodeSize ) // auto trimmed to fit, if required.
       ), spdParamId,
      ( spdDefaultVal == null ) ? null
                                : ( ( spdDefaultVal.length(  ) <= spdDefaultValSize )
      ? spdDefaultVal
      : spdDefaultVal.substring( 0, spdDefaultValSize ) // auto trimmed to fit, if required.
       )
    };
  }

  /**
   * DOCUMENT ME!
   *
   * @param fields DOCUMENT ME!
   */
  protected void set( final Object[] fields ) {
    spdServiceCode = rtrim( (String) fields[0] );
    spdParamId = (Short) fields[1];
    spdDefaultVal = rtrim( (String) fields[2] );
  }

  // Get methods ///////////////////////////////////////////////////////////////
  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getSpdServiceCode(  ) {
    return spdServiceCode;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public Short getSpdParamId(  ) {
    return spdParamId;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getSpdDefaultVal(  ) {
    return spdDefaultVal;
  }

  // Setter methods ///////////////////////////////////////////////////////////////

  //
  // Master setter follows...
  //

  /**
   * Setter that takes all attributes
   */
  public void set( 
    final String spdServiceCode,
    final Short  spdParamId,
    final String spdDefaultVal ) {
    this.spdServiceCode = spdServiceCode;
    this.spdParamId = spdParamId;
    this.spdDefaultVal = spdDefaultVal;
  }

  //
  // Public access modifiers if any
  // (provided for attributes that are public in the analysis model)
  //    

  /**
  * Sets the SpdServiceCode field.
  *
  * @param spdServiceCode
  */
  public void setSpdServiceCode( final String spdServiceCode ) {
    this.spdServiceCode = getPadded(spdServiceCode, spdServiceCodeFilter);
  }

  /**
  * Sets the SpdParamId field.
  *
  * @param spdParamId
  */
  public void setSpdParamId( final Short spdParamId ) {
    this.spdParamId = spdParamId;
  }

  /**
  * Sets the SpdParamId field.
  *
  * @param spdParamId
  */
  public void setSpdParamId( final int spdParamId ) {
    this.spdParamId = Short.valueOf( (short) spdParamId );
  }

  /**
  * Sets the SpdDefaultVal field.
  *
  * @param spdDefaultVal
  */
  public void setSpdDefaultVal( final String spdDefaultVal ) {
    this.spdDefaultVal = getPadded(spdDefaultVal, spdDefaultValFilter);
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
