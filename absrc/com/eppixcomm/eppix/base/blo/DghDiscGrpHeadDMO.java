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
 * A value object to carry the data for a DghDiscGrpHead.
 *
 *
 * <H3> A DghDiscGrpHead is: </H3>
 *
 * <!-- indent text -->
 * <TABLE BORDER="0" CELLPADDING="0" CELLSPACING="0">
 * <TR>
 * <TD WIDTH="25">&nbsp;</TD>
 * <TD>
 *
 * Used to hold the details of different groups against which discount is applied.
 *
 * <!-- end indent text -->
 * </TD>
 * </TR>
 * </TABLE>
 *
 *
 * <H3> DghDiscGrpHead Value Object: </H3>
 *
 * <!-- indent text -->
 * <TABLE BORDER="0" CELLPADDING="0" CELLSPACING="0">
 * <TR>
 * <TD WIDTH="25">&nbsp;</TD>
 * <TD>
 *
 * <P>
 *     This is a value object (called a Data Model Object or 'DMO').
 *     It is used to pass the data for a dghDiscGrpHead into and out of the BASE module.
 *     Because it's purpose is to carry data into and out of the module it is visible outside the module.
 * </P>
 * <P>
 *     This value object carries the data for one dghDiscGrpHead. A dghDiscGrpHead is:
 * Used to hold the details of different groups against which discount is applied.
 * </P>
 * <P>
 *     It corresponds to the business logic object DghDiscGrpHead which
 *     contains all the business behaviour of a dghDiscGrpHead but is not visible outside the
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
 *    This value object contains fields for all the details of a dghDiscGrpHead, namely:
 * </P>
 *


 * <P>
 *    <U>Fields to carry the Attributes of a dghDiscGrpHead:</U>
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
 *   <TD ALIGN="left" VALIGN="top"><B>dghGroupId</B></TD>
 *   <TD ALIGN="left" VALIGN="top">Integer</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Unique internal identifier
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
 *       <A HREF="#getDghGroupId()">
 *           getDghGroupId
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setDghGroupId(java.lang.Integer)">
 *           setDghGroupId (Integer)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>dghGroupDesc</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Long description of discount group
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
 *       <A HREF="#getDghGroupDesc()">
 *           getDghGroupDesc
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setDghGroupDesc(java.lang.String)">
 *           setDghGroupDesc (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>dghGroupType</B></TD>
 *   <TD ALIGN="left" VALIGN="top">Short</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Type of discount group.
 *       <p>
 *         Records will exist within this table for different discount groups used within EPPIX. The known discount groups to date
 *         are as follows:- 1 - Usage type class groups 2 - Charge class groups
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
 *       <A HREF="#getDghGroupType()">
 *           getDghGroupType
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setDghGroupType(java.lang.Short)">
 *           setDghGroupType (Short)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>dghInclusionFrom</B></TD>
 *   <TD ALIGN="left" VALIGN="top">DateTime</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Inclusion from date
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
 *       <A HREF="#getDghInclusionFrom()">
 *           getDghInclusionFrom
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setDghInclusionFrom(com.cmgwds.eppix.util.DateTime)">
 *           setDghInclusionFrom (DateTime)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>dghInclusionTo</B></TD>
 *   <TD ALIGN="left" VALIGN="top">DateTime</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Inclusion to date
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
 *       <A HREF="#getDghInclusionTo()">
 *           getDghInclusionTo
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setDghInclusionTo(com.cmgwds.eppix.util.DateTime)">
 *           setDghInclusionTo (DateTime)
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


 * @see DghDiscGrpHead
 *
 * @author
 * @version $Revision: $
 *
 * @since $jdk$
 */
public class DghDiscGrpHeadDMO
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
      FIELD_TYPE_INTEGER /* std public attribute: dghGroupId  */,
      FIELD_TYPE_STRING /* std public attribute: dghGroupDesc  */,
      FIELD_TYPE_SHORT /* std public attribute: dghGroupType  */,
      FIELD_TYPE_DATETIME /* std public attribute: dghInclusionFrom  */,
      FIELD_TYPE_DATETIME /* std public attribute: dghInclusionTo  */
    };
  
  /**
  * TODO SJ Implement the array of field sizes
  *
  */
  private final int[] fieldSizes = new int[] {
		  0,
		  dghGroupDescSize,
		  0,
		  0,
		  0
  };
      

  public int[] fieldSizes() {
  	return fieldSizes;
  }  

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int dghGroupIdFilter = 0; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int dghGroupDescFilter = 1; // filter index
  private static final int dghGroupDescSize = 50; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int dghGroupTypeFilter = 2; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int dghInclusionFromFilter = 3; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int dghInclusionToFilter = 4; // filter index

  //~ Instance variables /////////////////////////////////////////////////////

  private DateTime dghInclusionFrom; // Loaded from Schema
  private DateTime dghInclusionTo; // Loaded from Schema

  //---------------------
  // Field declarations
  //---------------------
  // all attributes
  private Integer dghGroupId; // Loaded from Schema
  private Short dghGroupType; // Loaded from Schema
  private String dghGroupDesc; // Loaded from Schema

  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new DghDiscGrpHeadDMO object.
   */
  public DghDiscGrpHeadDMO(  ) {
  }

  // Constructor - taking public attributes
  /**
   * Creates a new DghDiscGrpHeadDMO object.
   *
   * @param dghGroupId DOCUMENT ME!
   * @param dghGroupDesc DOCUMENT ME!
   * @param dghGroupType DOCUMENT ME!
   * @param dghInclusionFrom DOCUMENT ME!
   * @param dghInclusionTo DOCUMENT ME!
   */
  public DghDiscGrpHeadDMO( 
    final Integer  dghGroupId,
    final String   dghGroupDesc,
    final Short    dghGroupType,
    final DateTime dghInclusionFrom,
    final DateTime dghInclusionTo ) {
    this.dghGroupId = dghGroupId;

    this.dghGroupDesc = dghGroupDesc;

    this.dghGroupType = dghGroupType;

    this.dghInclusionFrom = ( dghInclusionFrom != null )
      ? new DateTime( dghInclusionFrom ) : null;

    this.dghInclusionTo = ( dghInclusionTo != null )
      ? new DateTime( dghInclusionTo ) : null;
  }

  //~ Methods ////////////////////////////////////////////////////////////////

  // DBO method implementations ////////////////////////////////////////////////

  /**
   * Sets the generated key ( dghGroupId ) value.
   *
   * @param key The generated key value.
   */
  protected void generatedKey( final Integer key ) {
    this.dghGroupId = key;
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
    return new DAOArgs( 1 ).arg( this.dghGroupId );
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
      dghGroupId,
      ( dghGroupDesc == null ) ? null
                               : ( ( dghGroupDesc.length(  ) <= dghGroupDescSize )
      ? dghGroupDesc
      : dghGroupDesc.substring( 0, dghGroupDescSize ) // auto trimmed to fit, if required.
       ), dghGroupType, dghInclusionFrom, dghInclusionTo
    };
  }

  /**
   * DOCUMENT ME!
   *
   * @param fields DOCUMENT ME!
   */
  protected void set( final Object[] fields ) {
    dghGroupId = (Integer) fields[0];
    dghGroupDesc = rtrim( (String) fields[1] );
    dghGroupType = (Short) fields[2];
    dghInclusionFrom = (DateTime) fields[3];
    dghInclusionTo = (DateTime) fields[4];
  }

  // Get methods ///////////////////////////////////////////////////////////////
  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public Integer getDghGroupId(  ) {
    return dghGroupId;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getDghGroupDesc(  ) {
    return dghGroupDesc;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public Short getDghGroupType(  ) {
    return dghGroupType;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public DateTime getDghInclusionFrom(  ) {
    return ( dghInclusionFrom != null ) ? new DateTime( dghInclusionFrom )
                                        : null;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public DateTime getDghInclusionTo(  ) {
    return ( dghInclusionTo != null ) ? new DateTime( dghInclusionTo ) : null;
  }

  // Setter methods ///////////////////////////////////////////////////////////////

  //
  // Master setter follows...
  //

  /**
   * Setter that takes all attributes
   */
  public void set( 
    final Integer  dghGroupId,
    final String   dghGroupDesc,
    final Short    dghGroupType,
    final DateTime dghInclusionFrom,
    final DateTime dghInclusionTo ) {
    this.dghGroupId = dghGroupId;
    this.dghGroupDesc = dghGroupDesc;
    this.dghGroupType = dghGroupType;
    this.dghInclusionFrom = ( dghInclusionFrom != null )
      ? new DateTime( dghInclusionFrom ) : null;
    this.dghInclusionTo = ( dghInclusionTo != null )
      ? new DateTime( dghInclusionTo ) : null;
  }

  //
  // Public access modifiers if any
  // (provided for attributes that are public in the analysis model)
  //    

  /**
  * Sets the DghGroupId field.
  *
  * @param dghGroupId
  */
  public void setDghGroupId( final Integer dghGroupId ) {
    this.dghGroupId = dghGroupId;
  }

  /**
  * Sets the DghGroupDesc field.
  *
  * @param dghGroupDesc
  */
  public void setDghGroupDesc( final String dghGroupDesc ) {
    this.dghGroupDesc = getPadded(dghGroupDesc, dghGroupDescFilter);
  }

  /**
  * Sets the DghGroupType field.
  *
  * @param dghGroupType
  */
  public void setDghGroupType( final Short dghGroupType ) {
    this.dghGroupType = dghGroupType;
  }

  /**
  * Sets the DghGroupType field.
  *
  * @param dghGroupType
  */
  public void setDghGroupType( final int dghGroupType ) {
    this.dghGroupType = Short.valueOf( (short) dghGroupType );
  }

  /**
  * Sets the DghInclusionFrom field.
  *
  * @param dghInclusionFrom
  */
  public void setDghInclusionFrom( final DateTime dghInclusionFrom ) {
    this.dghInclusionFrom = ( dghInclusionFrom != null )
      ? new DateTime( dghInclusionFrom ) : null;
  }

  /**
  * Sets the DghInclusionTo field.
  *
  * @param dghInclusionTo
  */
  public void setDghInclusionTo( final DateTime dghInclusionTo ) {
    this.dghInclusionTo = ( dghInclusionTo != null )
      ? new DateTime( dghInclusionTo ) : null;
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
