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
 * A value object to carry the data for an Opcosm.
 *
 *
 * <H3> An Opcosm is: </H3>
 *
 * <!-- indent text -->
 * <TABLE BORDER="0" CELLPADDING="0" CELLSPACING="0">
 * <TR>
 * <TD WIDTH="25">&nbsp;</TD>
 * <TD>
 *
 * DOCUMENT ME! - by adding a description of this class via the class diagram.
 *
 * <!-- end indent text -->
 * </TD>
 * </TR>
 * </TABLE>
 *
 *
 * <H3> Opcosm Value Object: </H3>
 *
 * <!-- indent text -->
 * <TABLE BORDER="0" CELLPADDING="0" CELLSPACING="0">
 * <TR>
 * <TD WIDTH="25">&nbsp;</TD>
 * <TD>
 *
 * <P>
 *     This is a value object (called a Data Model Object or 'DMO').
 *     It is used to pass the data for an opcosm into and out of the BASE module.
 *     Because it's purpose is to carry data into and out of the module it is visible outside the module.
 * </P>
 * <P>
 *     This value object carries the data for one opcosm. An opcosm is:
 * DOCUMENT ME! - by adding a description of this class via the class diagram.
 * </P>
 * <P>
 *     It corresponds to the business logic object Opcosm which
 *     contains all the business behaviour of an opcosm but is not visible outside the
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
 *    This value object contains fields for all the details of an opcosm, namely:
 * </P>
 *


 * <P>
 *    <U>Fields to carry the Attributes of an opcosm:</U>
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
 *   <TD ALIGN="left" VALIGN="top"><B>costOfSales</B></TD>
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
 *       <A HREF="#getCostOfSales()">
 *           getCostOfSales
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setCostOfSales(java.lang.String)">
 *           setCostOfSales (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>description</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
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
 *       <A HREF="#getDescription()">
 *           getDescription
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setDescription(java.lang.String)">
 *           setDescription (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>salesAccount</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
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
 *       <A HREF="#getSalesAccount()">
 *           getSalesAccount
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setSalesAccount(java.lang.String)">
 *           setSalesAccount (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>stockAccount</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
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
 *       <A HREF="#getStockAccount()">
 *           getStockAccount
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setStockAccount(java.lang.String)">
 *           setStockAccount (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>costOfSalesAcc</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
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
 *       <A HREF="#getCostOfSalesAcc()">
 *           getCostOfSalesAcc
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setCostOfSalesAcc(java.lang.String)">
 *           setCostOfSalesAcc (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>upliftAccount</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
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
 *       <A HREF="#getUpliftAccount()">
 *           getUpliftAccount
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setUpliftAccount(java.lang.String)">
 *           setUpliftAccount (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>uplift</B></TD>
 *   <TD ALIGN="left" VALIGN="top">BigDecimal</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
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
 *       <A HREF="#getUplift()">
 *           getUplift
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setUplift(java.math.BigDecimal)">
 *           setUplift (BigDecimal)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>spare</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
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
 *       <A HREF="#getSpare()">
 *           getSpare
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setSpare(java.lang.String)">
 *           setSpare (String)
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


 * @see Opcosm
 *
 * @author
 * @version $Revision: $
 *
 * @since $jdk$
 */
public class OpcosmDMO
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
      FIELD_TYPE_STRING /* std public attribute: costOfSales  */,
      FIELD_TYPE_STRING /* std public attribute: description  */,
      FIELD_TYPE_STRING /* std public attribute: salesAccount  */,
      FIELD_TYPE_STRING /* std public attribute: stockAccount  */,
      FIELD_TYPE_STRING /* std public attribute: costOfSalesAcc  */,
      FIELD_TYPE_STRING /* std public attribute: upliftAccount  */,
      FIELD_TYPE_BIGDECIMAL /* std public attribute: uplift  */,
      FIELD_TYPE_STRING /* std public attribute: spare  */
    };
  

  private final int[] fieldSizes = new int[] {
		  costOfSalesSize,
		  descriptionSize,
		  salesAccountSize,
		  stockAccountSize,
		  costOfSalesAccSize,
		  upliftAccountSize,
		  0,
		  spareSize
  };
      

  public int[] fieldSizes() {
  	return fieldSizes;
  }  

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int costOfSalesFilter = 0; // filter index
  private static final int costOfSalesSize = 6; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int descriptionFilter = 1; // filter index
  private static final int descriptionSize = 30; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int salesAccountFilter = 2; // filter index
  private static final int salesAccountSize = 16; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int stockAccountFilter = 3; // filter index
  private static final int stockAccountSize = 16; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int costOfSalesAccFilter = 4; // filter index
  private static final int costOfSalesAccSize = 16; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int upliftAccountFilter = 5; // filter index
  private static final int upliftAccountSize = 16; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int upliftFilter = 6; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int spareFilter = 7; // filter index
  private static final int spareSize = 32; // field size

  //~ Instance variables /////////////////////////////////////////////////////

  private BigDecimal uplift; // Loaded from Schema

  //---------------------
  // Field declarations
  //---------------------
  // all attributes
  private String costOfSales; // Loaded from Schema
  private String costOfSalesAcc; // Loaded from Schema
  private String description; // Loaded from Schema
  private String salesAccount; // Loaded from Schema
  private String spare; // Loaded from Schema
  private String stockAccount; // Loaded from Schema
  private String upliftAccount; // Loaded from Schema

  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new OpcosmDMO object.
   */
  public OpcosmDMO(  ) {
  }

  // Constructor - taking public attributes
  /**
   * Creates a new OpcosmDMO object.
   *
   * @param costOfSales DOCUMENT ME!
   * @param description DOCUMENT ME!
   * @param salesAccount DOCUMENT ME!
   * @param stockAccount DOCUMENT ME!
   * @param costOfSalesAcc DOCUMENT ME!
   * @param upliftAccount DOCUMENT ME!
   * @param uplift DOCUMENT ME!
   * @param spare DOCUMENT ME!
   */
  public OpcosmDMO( 
    final String     costOfSales,
    final String     description,
    final String     salesAccount,
    final String     stockAccount,
    final String     costOfSalesAcc,
    final String     upliftAccount,
    final BigDecimal uplift,
    final String     spare ) {
    this.costOfSales = costOfSales;

    this.description = description;

    this.salesAccount = salesAccount;

    this.stockAccount = stockAccount;

    this.costOfSalesAcc = costOfSalesAcc;

    this.upliftAccount = upliftAccount;

    this.uplift = uplift;

    this.spare = spare;
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
    return new DAOArgs( 1 ).arg( ( this.costOfSales == null ) ? null
                                                              : this.costOfSales
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
      ( costOfSales == null ) ? null
                              : ( ( costOfSales.length(  ) <= costOfSalesSize )
      ? costOfSales
      : costOfSales.substring( 0, costOfSalesSize ) // auto trimmed to fit, if required.
       ),
      ( description == null ) ? null
                              : ( ( description.length(  ) <= descriptionSize )
      ? description
      : description.substring( 0, descriptionSize ) // auto trimmed to fit, if required.
       ),
      ( salesAccount == null ) ? null
                               : ( ( salesAccount.length(  ) <= salesAccountSize )
      ? salesAccount
      : salesAccount.substring( 0, salesAccountSize ) // auto trimmed to fit, if required.
       ),
      ( stockAccount == null ) ? null
                               : ( ( stockAccount.length(  ) <= stockAccountSize )
      ? stockAccount
      : stockAccount.substring( 0, stockAccountSize ) // auto trimmed to fit, if required.
       ),
      ( costOfSalesAcc == null ) ? null
                                 : ( ( costOfSalesAcc.length(  ) <= costOfSalesAccSize )
      ? costOfSalesAcc
      : costOfSalesAcc.substring( 0, costOfSalesAccSize ) // auto trimmed to fit, if required.
       ),
      ( upliftAccount == null ) ? null
                                : ( ( upliftAccount.length(  ) <= upliftAccountSize )
      ? upliftAccount
      : upliftAccount.substring( 0, upliftAccountSize ) // auto trimmed to fit, if required.
       ), uplift,
      ( spare == null ) ? null
                        : ( ( spare.length(  ) <= spareSize ) ? spare
                                                              : spare
      .substring( 0, spareSize ) // auto trimmed to fit, if required.
       )
    };
  }

  /**
   * DOCUMENT ME!
   *
   * @param fields DOCUMENT ME!
   */
  protected void set( final Object[] fields ) {
    costOfSales = rtrim( (String) fields[0] );
    description = rtrim( (String) fields[1] );
    salesAccount = rtrim( (String) fields[2] );
    stockAccount = rtrim( (String) fields[3] );
    costOfSalesAcc = rtrim( (String) fields[4] );
    upliftAccount = rtrim( (String) fields[5] );
    uplift = (BigDecimal) fields[6];
    spare = rtrim( (String) fields[7] );
  }

  // Get methods ///////////////////////////////////////////////////////////////
  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getCostOfSales(  ) {
    return costOfSales;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getDescription(  ) {
    return description;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getSalesAccount(  ) {
    return salesAccount;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getStockAccount(  ) {
    return stockAccount;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getCostOfSalesAcc(  ) {
    return costOfSalesAcc;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getUpliftAccount(  ) {
    return upliftAccount;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public BigDecimal getUplift(  ) {
    return uplift;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getSpare(  ) {
    return spare;
  }

  // Setter methods ///////////////////////////////////////////////////////////////

  //
  // Master setter follows...
  //

  /**
   * Setter that takes all attributes
   */
  public void set( 
    final String     costOfSales,
    final String     description,
    final String     salesAccount,
    final String     stockAccount,
    final String     costOfSalesAcc,
    final String     upliftAccount,
    final BigDecimal uplift,
    final String     spare ) {
    this.costOfSales = costOfSales;
    this.description = description;
    this.salesAccount = salesAccount;
    this.stockAccount = stockAccount;
    this.costOfSalesAcc = costOfSalesAcc;
    this.upliftAccount = upliftAccount;
    this.uplift = uplift;
    this.spare = spare;
  }

  //
  // Public access modifiers if any
  // (provided for attributes that are public in the analysis model)
  //    

  /**
  * Sets the CostOfSales field.
  *
  * @param costOfSales
  */
  public void setCostOfSales( final String costOfSales ) {
    this.costOfSales = getPadded(costOfSales, costOfSalesAccFilter);
  }

  /**
  * Sets the Description field.
  *
  * @param description
  */
  public void setDescription( final String description ) {
    this.description = getPadded(description, descriptionFilter);
  }

  /**
  * Sets the SalesAccount field.
  *
  * @param salesAccount
  */
  public void setSalesAccount( final String salesAccount ) {
    this.salesAccount = getPadded(salesAccount, salesAccountFilter);
  }

  /**
  * Sets the StockAccount field.
  *
  * @param stockAccount
  */
  public void setStockAccount( final String stockAccount ) {
    this.stockAccount = getPadded(stockAccount, stockAccountFilter);
  }

  /**
  * Sets the CostOfSalesAcc field.
  *
  * @param costOfSalesAcc
  */
  public void setCostOfSalesAcc( final String costOfSalesAcc ) {
    this.costOfSalesAcc = getPadded(costOfSalesAcc, costOfSalesAccFilter);
  }

  /**
  * Sets the UpliftAccount field.
  *
  * @param upliftAccount
  */
  public void setUpliftAccount( final String upliftAccount ) {
    this.upliftAccount = getPadded(upliftAccount, upliftAccountFilter);
  }

  /**
  * Sets the Uplift field.
  *
  * @param uplift
  */
  public void setUplift( final BigDecimal uplift ) {
    this.uplift = uplift;
  }

  /**
  * Sets the Uplift field.
  *
  * @param uplift
  */
  public void setUplift( final double uplift ) {
    this.uplift =  new BigDecimal( uplift );
  }

  /**
  * Sets the Spare field.
  *
  * @param spare
  */
  public void setSpare( final String spare ) {
    this.spare = getPadded(spare, spareFilter);
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
