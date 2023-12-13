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
 * A value object to carry the data for a Vsr2ServiceAux.
 *
 *
 * <H3> A Vsr2ServiceAux is: </H3>
 *
 * <!-- indent text -->
 * <TABLE BORDER="0" CELLPADDING="0" CELLSPACING="0">
 * <TR>
 * <TD WIDTH="25">&nbsp;</TD>
 * <TD>
 *
 * Auxilliary to vsr_service The table tells the navigator_list how to order the service information that it returns to the client.
 * <p>
 *   This data is static but is not required by the client and is not being replicated in this phase. The table allow the
 *   navigator to work without a huge quantity of hardcoded data in the code and a long list of different selects. The
 *   fields may look duplicated. They are defined like this to try and provide the data for a fast select and sort, not for
 *   user convienience since they only have to set the data up once, but the select and sort runs very frequently.
 * </p>
 * <p>
 *   How to setup data See the vst_service_type section for information on how to set up service type data. Set the data up like
 *   this
 * </p>
 *
 * <!-- end indent text -->
 * </TD>
 * </TR>
 * </TABLE>
 *
 *
 * <H3> Vsr2ServiceAux Value Object: </H3>
 *
 * <!-- indent text -->
 * <TABLE BORDER="0" CELLPADDING="0" CELLSPACING="0">
 * <TR>
 * <TD WIDTH="25">&nbsp;</TD>
 * <TD>
 *
 * <P>
 *     This is a value object (called a Data Model Object or 'DMO').
 *     It is used to pass the data for a vsr2ServiceAux into and out of the BASE module.
 *     Because it's purpose is to carry data into and out of the module it is visible outside the module.
 * </P>
 * <P>
 *     This value object carries the data for one vsr2ServiceAux. A vsr2ServiceAux is:
 * Auxilliary to vsr_service The table tells the navigator_list how to order the service information that it returns to the client.
 * </P>
 * <P>
 *     It corresponds to the business logic object Vsr2ServiceAux which
 *     contains all the business behaviour of a vsr2ServiceAux but is not visible outside the
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
 *    This value object contains fields for all the details of a vsr2ServiceAux, namely:
 * </P>
 *


 * <P>
 *    <U>Fields to carry the Attributes of a vsr2ServiceAux:</U>
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
 *   <TD ALIGN="left" VALIGN="top"><B>vsr2ServiceCode</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *
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
 *       <A HREF="#getVsr2ServiceCode()">
 *           getVsr2ServiceCode
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setVsr2ServiceCode(java.lang.String)">
 *           setVsr2ServiceCode (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>vsr2ServiceOrder</B></TD>
 *   <TD ALIGN="left" VALIGN="top">Short</TD>
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
 *       <A HREF="#getVsr2ServiceOrder()">
 *           getVsr2ServiceOrder
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setVsr2ServiceOrder(java.lang.Short)">
 *           setVsr2ServiceOrder (Short)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>vsr2SimRelated</B></TD>
 *   <TD ALIGN="left" VALIGN="top">Short</TD>
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
 *       <A HREF="#getVsr2SimRelated()">
 *           getVsr2SimRelated
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setVsr2SimRelated(java.lang.Short)">
 *           setVsr2SimRelated (Short)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>vsr2EntryType</B></TD>
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
 *       <A HREF="#getVsr2EntryType()">
 *           getVsr2EntryType
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setVsr2EntryType(java.lang.String)">
 *           setVsr2EntryType (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>vsr2Technology</B></TD>
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
 *       <A HREF="#getVsr2Technology()">
 *           getVsr2Technology
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setVsr2Technology(java.lang.String)">
 *           setVsr2Technology (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>vsr2AuthReqd</B></TD>
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
 *       <A HREF="#getVsr2AuthReqd()">
 *           getVsr2AuthReqd
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setVsr2AuthReqd(java.lang.String)">
 *           setVsr2AuthReqd (String)
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


 * @see Vsr2ServiceAux
 *
 * @author
 * @version $Revision: $
 *
 * @since $jdk$
 */
public class Vsr2ServiceAuxDMO
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
      FIELD_TYPE_STRING /* std public attribute: vsr2ServiceCode  */,
      FIELD_TYPE_SHORT /* std public attribute: vsr2ServiceOrder  */,
      FIELD_TYPE_SHORT /* std public attribute: vsr2SimRelated  */,
      FIELD_TYPE_STRING /* std public attribute: vsr2EntryType  */,
      FIELD_TYPE_STRING /* std public attribute: vsr2Technology  */,
      //      FIELD_TYPE_STRING /* std public attribute: vsr2AuthReqd  */
    };
  
  private final int[] fieldSizes = new int[] {
				vsr2ServiceCodeSize,
				0,
				0,
				vsr2EntryTypeSize,
				 vsr2TechnologySize
  };
      

  public int[] fieldSizes() {
  	return fieldSizes;
  }  

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int vsr2ServiceCodeFilter = 0; // filter index
  private static final int vsr2ServiceCodeSize = 4; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int vsr2ServiceOrderFilter = 1; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int vsr2SimRelatedFilter = 2; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int vsr2EntryTypeFilter = 3; // filter index
  private static final int vsr2EntryTypeSize = 1; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int vsr2TechnologyFilter = 4; // filter index
  private static final int vsr2TechnologySize = 15; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
	/*
  public static final int vsr2AuthReqdFilter = 5; // filter index
  private static final int vsr2AuthReqdSize = 1; // field size
  */
  //~ Instance variables /////////////////////////////////////////////////////

  private Short vsr2ServiceOrder; // Loaded from Schema
  private Short vsr2SimRelated; // Loaded from Schema
  // private String vsr2AuthReqd; // Loaded from Schema
  private String vsr2EntryType; // Loaded from Schema

  //---------------------
  // Field declarations
  //---------------------
  // all attributes
  private String vsr2ServiceCode; // Loaded from Schema
  private String vsr2Technology; // Loaded from Schema

  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new Vsr2ServiceAuxDMO object.
   */
  public Vsr2ServiceAuxDMO(  ) {
  }

  // Constructor - taking public attributes
  /**
   * Creates a new Vsr2ServiceAuxDMO object.
   *
   * @param vsr2ServiceCode DOCUMENT ME!
   * @param vsr2ServiceOrder DOCUMENT ME!
   * @param vsr2SimRelated DOCUMENT ME!
   * @param vsr2EntryType DOCUMENT ME!
   * @param vsr2Technology DOCUMENT ME!
   * @param vsr2AuthReqd DOCUMENT ME!
   */
  public Vsr2ServiceAuxDMO( 
    final String vsr2ServiceCode,
    final Short  vsr2ServiceOrder,
    final Short  vsr2SimRelated,
    final String vsr2EntryType,
    final String vsr2Technology
    // ,final String vsr2AuthReqd 
    ) {
    this.vsr2ServiceCode = vsr2ServiceCode;

    this.vsr2ServiceOrder = vsr2ServiceOrder;

    this.vsr2SimRelated = vsr2SimRelated;

    this.vsr2EntryType = vsr2EntryType;

    this.vsr2Technology = vsr2Technology;

    //this.vsr2AuthReqd = vsr2AuthReqd;
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
    return new DAOArgs( 1 ).arg( ( this.vsr2ServiceCode == null ) ? null
                                                                  : this.vsr2ServiceCode
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
      ( vsr2ServiceCode == null ) ? null
                                  : ( ( vsr2ServiceCode.length(  ) <= vsr2ServiceCodeSize )
      ? vsr2ServiceCode
      : vsr2ServiceCode.substring( 0, vsr2ServiceCodeSize ) // auto trimmed to fit, if required.
       ), vsr2ServiceOrder, vsr2SimRelated,
      ( vsr2EntryType == null ) ? null
                                : ( ( vsr2EntryType.length(  ) <= vsr2EntryTypeSize )
      ? vsr2EntryType
      : vsr2EntryType.substring( 0, vsr2EntryTypeSize ) // auto trimmed to fit, if required.
       ),
      ( vsr2Technology == null ) ? null
                                 : ( ( vsr2Technology.length(  ) <= vsr2TechnologySize )
      ? vsr2Technology
      : vsr2Technology.substring( 0, vsr2TechnologySize ) // auto trimmed to fit, if required.
       )
        /* ,
      ( vsr2AuthReqd == null ) ? null
                               : ( ( vsr2AuthReqd.length(  ) <= vsr2AuthReqdSize )
      ? vsr2AuthReqd
      : vsr2AuthReqd.substring( 0, vsr2AuthReqdSize ) // auto trimmed to fit, if required.
       )
       */
    };
  }

  /**
   * DOCUMENT ME!
   *
   * @param fields DOCUMENT ME!
   */
  protected void set( final Object[] fields ) {
    vsr2ServiceCode = rtrim( (String) fields[0] );
    vsr2ServiceOrder = (Short) fields[1];
    vsr2SimRelated = (Short) fields[2];
    vsr2EntryType = rtrim( (String) fields[3] );
    vsr2Technology = rtrim( (String) fields[4] );
    //vsr2AuthReqd = rtrim( (String) fields[5] );
  }

  // Get methods ///////////////////////////////////////////////////////////////
  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getVsr2ServiceCode(  ) {
    return vsr2ServiceCode;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public Short getVsr2ServiceOrder(  ) {
    return vsr2ServiceOrder;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public Short getVsr2SimRelated(  ) {
    return vsr2SimRelated;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getVsr2EntryType(  ) {
    return vsr2EntryType;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getVsr2Technology(  ) {
    return vsr2Technology;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  /*
  public String getVsr2AuthReqd(  ) {
    return vsr2AuthReqd;
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
    final String vsr2ServiceCode,
    final Short  vsr2ServiceOrder,
    final Short  vsr2SimRelated,
    final String vsr2EntryType,
    final String vsr2Technology
    //,final String vsr2AuthReqd 
    ) {
    this.vsr2ServiceCode = vsr2ServiceCode;
    this.vsr2ServiceOrder = vsr2ServiceOrder;
    this.vsr2SimRelated = vsr2SimRelated;
    this.vsr2EntryType = vsr2EntryType;
    this.vsr2Technology = vsr2Technology;
    //this.vsr2AuthReqd = vsr2AuthReqd;
  }

  //
  // Public access modifiers if any
  // (provided for attributes that are public in the analysis model)
  //    

  /**
  * Sets the Vsr2ServiceCode field.
  *
  * @param vsr2ServiceCode
  */
  public void setVsr2ServiceCode( final String vsr2ServiceCode ) {
    this.vsr2ServiceCode = getPadded(vsr2ServiceCode, vsr2ServiceCodeFilter);
  }

  /**
  * Sets the Vsr2ServiceOrder field.
  *
  * @param vsr2ServiceOrder
  */
  public void setVsr2ServiceOrder( final Short vsr2ServiceOrder ) {
    this.vsr2ServiceOrder = vsr2ServiceOrder;
  }

  /**
  * Sets the Vsr2ServiceOrder field.
  *
  * @param vsr2ServiceOrder
  */
  public void setVsr2ServiceOrder( final int vsr2ServiceOrder ) {
    this.vsr2ServiceOrder = Short.valueOf( (short) vsr2ServiceOrder );
  }

  /**
  * Sets the Vsr2SimRelated field.
  *
  * @param vsr2SimRelated
  */
  public void setVsr2SimRelated( final Short vsr2SimRelated ) {
    this.vsr2SimRelated = vsr2SimRelated;
  }

  /**
  * Sets the Vsr2SimRelated field.
  *
  * @param vsr2SimRelated
  */
  public void setVsr2SimRelated( final int vsr2SimRelated ) {
    this.vsr2SimRelated = Short.valueOf( (short) vsr2SimRelated );
  }

  /**
  * Sets the Vsr2EntryType field.
  *
  * @param vsr2EntryType
  */
  public void setVsr2EntryType( final String vsr2EntryType ) {
    this.vsr2EntryType = getPadded(vsr2EntryType, vsr2EntryTypeFilter);
  }

  /**
  * Sets the Vsr2Technology field.
  *
  * @param vsr2Technology
  */
  public void setVsr2Technology( final String vsr2Technology ) {
    this.vsr2Technology = getPadded(vsr2Technology, vsr2TechnologyFilter);
  }

  /**
  * Sets the Vsr2AuthReqd field.
  *
  * @param vsr2AuthReqd
  */
  /*
  public void setVsr2AuthReqd( final String vsr2AuthReqd ) {
    this.vsr2AuthReqd = vsr2AuthReqd;
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
