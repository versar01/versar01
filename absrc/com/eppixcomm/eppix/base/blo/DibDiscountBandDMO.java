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
 * A value object to carry the data for a DibDiscountBand.
 *
 *
 * <H3> A DibDiscountBand is: </H3>
 *
 * <!-- indent text -->
 * <TABLE BORDER="0" CELLPADDING="0" CELLSPACING="0">
 * <TR>
 * <TD WIDTH="25">&nbsp;</TD>
 * <TD>
 *
 * Defines the individual band (threshold) details for a given rule.
 *
 * <!-- end indent text -->
 * </TD>
 * </TR>
 * </TABLE>
 *
 *
 * <H3> DibDiscountBand Value Object: </H3>
 *
 * <!-- indent text -->
 * <TABLE BORDER="0" CELLPADDING="0" CELLSPACING="0">
 * <TR>
 * <TD WIDTH="25">&nbsp;</TD>
 * <TD>
 *
 * <P>
 *     This is a value object (called a Data Model Object or 'DMO').
 *     It is used to pass the data for a dibDiscountBand into and out of the BASE module.
 *     Because it's purpose is to carry data into and out of the module it is visible outside the module.
 * </P>
 * <P>
 *     This value object carries the data for one dibDiscountBand. A dibDiscountBand is:
 * Defines the individual band (threshold) details for a given rule.
 * </P>
 * <P>
 *     It corresponds to the business logic object DibDiscountBand which
 *     contains all the business behaviour of a dibDiscountBand but is not visible outside the
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
 *    This value object contains fields for all the details of a dibDiscountBand, namely:
 * </P>
 *


 * <P>
 *    <U>Fields to carry the Attributes of a dibDiscountBand:</U>
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
 *   <TD ALIGN="left" VALIGN="top"><B>dibBandId</B></TD>
 *   <TD ALIGN="left" VALIGN="top">Integer</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Unique internal Id
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
 *       <A HREF="#getDibBandId()">
 *           getDibBandId
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setDibBandId(java.lang.Integer)">
 *           setDibBandId (Integer)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>dibRuleId</B></TD>
 *   <TD ALIGN="left" VALIGN="top">Integer</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Internal Id for rule.
 *       <p>
 *         Links to dir_rule_id
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
 *       <A HREF="#getDibRuleId()">
 *           getDibRuleId
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setDibRuleId(java.lang.Integer)">
 *           setDibRuleId (Integer)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>dibBandEnd</B></TD>
 *   <TD ALIGN="left" VALIGN="top">BigDecimal</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       End of band (threshold) If no bands exist, only one record will exist within this table with a band end of 0 (zero).
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
 *       <A HREF="#getDibBandEnd()">
 *           getDibBandEnd
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setDibBandEnd(java.math.BigDecimal)">
 *           setDibBandEnd (BigDecimal)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>dibDiscType</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Type of discount P - Percentage F - Fixed Value M - Minimum Value  These values will be held within the TT_TYPE_TEXT group 'DISCVALTYP'.
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
 *       <A HREF="#getDibDiscType()">
 *           getDibDiscType
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setDibDiscType(java.lang.String)">
 *           setDibDiscType (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>dibDiscValue</B></TD>
 *   <TD ALIGN="left" VALIGN="top">BigDecimal</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Value of discount to give.
 *       <p>
 *         For a minimum value discount type, this value will be compared with the discountable value. Generating a negative
 *         discount makes up any shortfall.
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
 *       <A HREF="#getDibDiscValue()">
 *           getDibDiscValue
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setDibDiscValue(java.math.BigDecimal)">
 *           setDibDiscValue (BigDecimal)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>dibMaxDiscount</B></TD>
 *   <TD ALIGN="left" VALIGN="top">BigDecimal</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       For percentage discounts, a maximum may be defined.
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
 *       <A HREF="#getDibMaxDiscount()">
 *           getDibMaxDiscount
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setDibMaxDiscount(java.math.BigDecimal)">
 *           setDibMaxDiscount (BigDecimal)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>dibLimitDisc</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       For a fixed value discount, the User may define whether the fixed value can be greater than the discountable value.
 *       <p>
 *         N - No limit D - Limit to discountable value
 *       </p>
 *       <p>
 *         These values will be held within the TT_TYPE_TEXT group 'DISCLIMTYP'.
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
 *       <A HREF="#getDibLimitDisc()">
 *           getDibLimitDisc
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setDibLimitDisc(java.lang.String)">
 *           setDibLimitDisc (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>dibChargeRef</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Each discount band (threshold) can be associated to a different charge code.
 *       <p>
 *         Null indicates the use of the default charge code for the rule (from dir_charge_code).
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
 *       <A HREF="#getDibChargeRef()">
 *           getDibChargeRef
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setDibChargeRef(java.lang.String)">
 *           setDibChargeRef (String)
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


 * @see DibDiscountBand
 *
 * @author
 * @version $Revision: $
 *
 * @since $jdk$
 */
public class DibDiscountBandDMO
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
      FIELD_TYPE_INTEGER /* std public attribute: dibBandId  */,
      FIELD_TYPE_INTEGER /* std public attribute: dibRuleId  */,
      FIELD_TYPE_BIGDECIMAL /* std public attribute: dibBandEnd  */,
      FIELD_TYPE_STRING /* std public attribute: dibDiscType  */,
      FIELD_TYPE_BIGDECIMAL /* std public attribute: dibDiscValue  */,
      FIELD_TYPE_BIGDECIMAL /* std public attribute: dibMaxDiscount  */,
      FIELD_TYPE_STRING /* std public attribute: dibLimitDisc  */,
      FIELD_TYPE_STRING /* std public attribute: dibChargeRef  */
    };
  
  private final int[] fieldSizes = new int[] {
		  0,
		  0,
		  0,
		  dibDiscTypeSize,
		  0,
		  0,
		  dibLimitDiscSize,
		  dibChargeRefSize
  };
      

  public int[] fieldSizes() {
  	return fieldSizes;
  }  

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int dibBandIdFilter = 0; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int dibRuleIdFilter = 1; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int dibBandEndFilter = 2; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int dibDiscTypeFilter = 3; // filter index
  private static final int dibDiscTypeSize = 1; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int dibDiscValueFilter = 4; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int dibMaxDiscountFilter = 5; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int dibLimitDiscFilter = 6; // filter index
  private static final int dibLimitDiscSize = 1; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int dibChargeRefFilter = 7; // filter index
  private static final int dibChargeRefSize = 5; // field size

  //~ Instance variables /////////////////////////////////////////////////////

  private BigDecimal dibBandEnd; // Loaded from Schema
  private BigDecimal dibDiscValue; // Loaded from Schema
  private BigDecimal dibMaxDiscount; // Loaded from Schema

  //---------------------
  // Field declarations
  //---------------------
  // all attributes
  private Integer dibBandId; // Loaded from Schema
  private Integer dibRuleId; // Loaded from Schema
  private String dibChargeRef; // Loaded from Schema
  private String dibDiscType; // Loaded from Schema
  private String dibLimitDisc; // Loaded from Schema

  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new DibDiscountBandDMO object.
   */
  public DibDiscountBandDMO(  ) {
  }

  // Constructor - taking public attributes
  /**
   * Creates a new DibDiscountBandDMO object.
   *
   * @param dibBandId DOCUMENT ME!
   * @param dibRuleId DOCUMENT ME!
   * @param dibBandEnd DOCUMENT ME!
   * @param dibDiscType DOCUMENT ME!
   * @param dibDiscValue DOCUMENT ME!
   * @param dibMaxDiscount DOCUMENT ME!
   * @param dibLimitDisc DOCUMENT ME!
   * @param dibChargeRef DOCUMENT ME!
   */
  public DibDiscountBandDMO( 
    final Integer    dibBandId,
    final Integer    dibRuleId,
    final BigDecimal dibBandEnd,
    final String     dibDiscType,
    final BigDecimal dibDiscValue,
    final BigDecimal dibMaxDiscount,
    final String     dibLimitDisc,
    final String     dibChargeRef ) {
    this.dibBandId = dibBandId;

    this.dibRuleId = dibRuleId;

    this.dibBandEnd = dibBandEnd;

    this.dibDiscType = dibDiscType;

    this.dibDiscValue = dibDiscValue;

    this.dibMaxDiscount = dibMaxDiscount;

    this.dibLimitDisc = dibLimitDisc;

    this.dibChargeRef = dibChargeRef;
  }

  //~ Methods ////////////////////////////////////////////////////////////////

  // DBO method implementations ////////////////////////////////////////////////

  /**
   * Sets the generated key ( dibBandId ) value.
   *
   * @param key The generated key value.
   */
  protected void generatedKey( final Integer key ) {
    this.dibBandId = key;
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
    return new DAOArgs( 3 ).arg( this.dibBandId )
                           .arg( this.dibRuleId )
                           .arg( this.dibBandEnd );
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
      dibBandId, dibRuleId, dibBandEnd,
      ( dibDiscType == null ) ? null
                              : ( ( dibDiscType.length(  ) <= dibDiscTypeSize )
      ? dibDiscType
      : dibDiscType.substring( 0, dibDiscTypeSize ) // auto trimmed to fit, if required.
       ), dibDiscValue, dibMaxDiscount,
      ( dibLimitDisc == null ) ? null
                               : ( ( dibLimitDisc.length(  ) <= dibLimitDiscSize )
      ? dibLimitDisc
      : dibLimitDisc.substring( 0, dibLimitDiscSize ) // auto trimmed to fit, if required.
       ),
      ( dibChargeRef == null ) ? null
                               : ( ( dibChargeRef.length(  ) <= dibChargeRefSize )
      ? dibChargeRef
      : dibChargeRef.substring( 0, dibChargeRefSize ) // auto trimmed to fit, if required.
       )
    };
  }

  /**
   * DOCUMENT ME!
   *
   * @param fields DOCUMENT ME!
   */
  protected void set( final Object[] fields ) {
    dibBandId = (Integer) fields[0];
    dibRuleId = (Integer) fields[1];
    dibBandEnd = (BigDecimal) fields[2];
    dibDiscType = rtrim( (String) fields[3] );
    dibDiscValue = (BigDecimal) fields[4];
    dibMaxDiscount = (BigDecimal) fields[5];
    dibLimitDisc = rtrim( (String) fields[6] );
    dibChargeRef = rtrim( (String) fields[7] );
  }

  // Get methods ///////////////////////////////////////////////////////////////
  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public Integer getDibBandId(  ) {
    return dibBandId;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public Integer getDibRuleId(  ) {
    return dibRuleId;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public BigDecimal getDibBandEnd(  ) {
    return dibBandEnd;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getDibDiscType(  ) {
    return dibDiscType;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public BigDecimal getDibDiscValue(  ) {
    return dibDiscValue;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public BigDecimal getDibMaxDiscount(  ) {
    return dibMaxDiscount;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getDibLimitDisc(  ) {
    return dibLimitDisc;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getDibChargeRef(  ) {
    return dibChargeRef;
  }

  // Setter methods ///////////////////////////////////////////////////////////////

  //
  // Master setter follows...
  //

  /**
   * Setter that takes all attributes
   */
  public void set( 
    final Integer    dibBandId,
    final Integer    dibRuleId,
    final BigDecimal dibBandEnd,
    final String     dibDiscType,
    final BigDecimal dibDiscValue,
    final BigDecimal dibMaxDiscount,
    final String     dibLimitDisc,
    final String     dibChargeRef ) {
    this.dibBandId = dibBandId;
    this.dibRuleId = dibRuleId;
    this.dibBandEnd = dibBandEnd;
    this.dibDiscType = dibDiscType;
    this.dibDiscValue = dibDiscValue;
    this.dibMaxDiscount = dibMaxDiscount;
    this.dibLimitDisc = dibLimitDisc;
    this.dibChargeRef = dibChargeRef;
  }

  //
  // Public access modifiers if any
  // (provided for attributes that are public in the analysis model)
  //    

  /**
  * Sets the DibBandId field.
  *
  * @param dibBandId
  */
  public void setDibBandId( final Integer dibBandId ) {
    this.dibBandId = dibBandId;
  }

  /**
  * Sets the DibRuleId field.
  *
  * @param dibRuleId
  */
  public void setDibRuleId( final Integer dibRuleId ) {
    this.dibRuleId = dibRuleId;
  }

  /**
  * Sets the DibBandEnd field.
  *
  * @param dibBandEnd
  */
  public void setDibBandEnd( final BigDecimal dibBandEnd ) {
    this.dibBandEnd = dibBandEnd;
  }

  /**
  * Sets the DibBandEnd field.
  *
  * @param dibBandEnd
  */
  public void setDibBandEnd( final double dibBandEnd ) {
    this.dibBandEnd = new BigDecimal( dibBandEnd );
  }

  /**
  * Sets the DibDiscType field.
  *
  * @param dibDiscType
  */
  public void setDibDiscType( final String dibDiscType ) {
    this.dibDiscType = getPadded(dibDiscType, dibDiscTypeFilter);
  }

  /**
  * Sets the DibDiscValue field.
  *
  * @param dibDiscValue
  */
  public void setDibDiscValue( final BigDecimal dibDiscValue ) {
    this.dibDiscValue = dibDiscValue;
  }

  /**
  * Sets the DibDiscValue field.
  *
  * @param dibDiscValue
  */
  public void setDibDiscValue( final double dibDiscValue ) {
    this.dibDiscValue = new BigDecimal( dibDiscValue );
  }

  /**
  * Sets the DibMaxDiscount field.
  *
  * @param dibMaxDiscount
  */
  public void setDibMaxDiscount( final BigDecimal dibMaxDiscount ) {
    this.dibMaxDiscount = dibMaxDiscount;
  }

  /**
  * Sets the DibMaxDiscount field.
  *
  * @param dibMaxDiscount
  */
  public void setDibMaxDiscount( final double dibMaxDiscount ) {
    this.dibMaxDiscount = new BigDecimal( dibMaxDiscount );
  }

  /**
  * Sets the DibLimitDisc field.
  *
  * @param dibLimitDisc
  */
  public void setDibLimitDisc( final String dibLimitDisc ) {
    this.dibLimitDisc = getPadded(dibLimitDisc, dibLimitDiscFilter);
  }

  /**
  * Sets the DibChargeRef field.
  *
  * @param dibChargeRef
  */
  public void setDibChargeRef( final String dibChargeRef ) {
    this.dibChargeRef = getPadded(dibChargeRef, dibChargeRefFilter);
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
