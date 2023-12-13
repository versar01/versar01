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
 * A value object to carry the data for a CnyCurrency.
 *
 *
 * <H3> A CnyCurrency is: </H3>
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
 * <H3> CnyCurrency Value Object: </H3>
 *
 * <!-- indent text -->
 * <TABLE BORDER="0" CELLPADDING="0" CELLSPACING="0">
 * <TR>
 * <TD WIDTH="25">&nbsp;</TD>
 * <TD>
 *
 * <P>
 *     This is a value object (called a Data Model Object or 'DMO').
 *     It is used to pass the data for a cnyCurrency into and out of the BASE module.
 *     Because it's purpose is to carry data into and out of the module it is visible outside the module.
 * </P>
 * <P>
 *     This value object carries the data for one cnyCurrency. A cnyCurrency is:
 * null
 * </P>
 * <P>
 *     It corresponds to the business logic object CnyCurrency which
 *     contains all the business behaviour of a cnyCurrency but is not visible outside the
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
 *    This value object contains fields for all the details of a cnyCurrency, namely:
 * </P>
 *


 * <P>
 *    <U>Fields to carry the Attributes of a cnyCurrency:</U>
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
 *   <TD ALIGN="left" VALIGN="top"><B>cnyCurrencyRef</B></TD>
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
 *       <A HREF="#getCnyCurrencyRef()">
 *           getCnyCurrencyRef
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setCnyCurrencyRef(java.lang.String)">
 *           setCnyCurrencyRef (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>cnyCurrencyText</B></TD>
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
 *       <A HREF="#getCnyCurrencyText()">
 *           getCnyCurrencyText
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setCnyCurrencyText(java.lang.String)">
 *           setCnyCurrencyText (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>cnyExchangeRate</B></TD>
 *   <TD ALIGN="left" VALIGN="top">BigDecimal</TD>
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
 *       <A HREF="#getCnyExchangeRate()">
 *           getCnyExchangeRate
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setCnyExchangeRate(java.math.BigDecimal)">
 *           setCnyExchangeRate (BigDecimal)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>cnyNoDecs</B></TD>
 *   <TD ALIGN="left" VALIGN="top">Short</TD>
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
 *       <A HREF="#getCnyNoDecs()">
 *           getCnyNoDecs
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setCnyNoDecs(java.lang.Short)">
 *           setCnyNoDecs (Short)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>cnyOperator</B></TD>
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
 *       <A HREF="#getCnyOperator()">
 *           getCnyOperator
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setCnyOperator(java.lang.String)">
 *           setCnyOperator (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>cnyCurSymbol</B></TD>
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
 *       <A HREF="#getCnyCurSymbol()">
 *           getCnyCurSymbol
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setCnyCurSymbol(java.lang.String)">
 *           setCnyCurSymbol (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>cnyGrpSymbol</B></TD>
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
 *       <A HREF="#getCnyGrpSymbol()">
 *           getCnyGrpSymbol
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setCnyGrpSymbol(java.lang.String)">
 *           setCnyGrpSymbol (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>cnyDecSymbol</B></TD>
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
 *       <A HREF="#getCnyDecSymbol()">
 *           getCnyDecSymbol
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setCnyDecSymbol(java.lang.String)">
 *           setCnyDecSymbol (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>cnyRoundFrom</B></TD>
 *   <TD ALIGN="left" VALIGN="top">Short</TD>
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
 *       <A HREF="#getCnyRoundFrom()">
 *           getCnyRoundFrom
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setCnyRoundFrom(java.lang.Short)">
 *           setCnyRoundFrom (Short)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>cnyTimestamp</B></TD>
 *   <TD ALIGN="left" VALIGN="top">DateTime</TD>
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
 *       <A HREF="#getCnyTimestamp()">
 *           getCnyTimestamp
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setCnyTimestamp(com.cmgwds.eppix.util.DateTime)">
 *           setCnyTimestamp (DateTime)
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


 * @see CnyCurrency
 *
 * @author
 * @version $Revision: $
 *
 * @since $jdk$
 */
public class CnyCurrencyDMO
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
      FIELD_TYPE_STRING /* std public attribute: cnyCurrencyRef  */,
      FIELD_TYPE_STRING /* std public attribute: cnyCurrencyText  */,
      FIELD_TYPE_BIGDECIMAL /* std public attribute: cnyExchangeRate  */,
      FIELD_TYPE_SHORT /* std public attribute: cnyNoDecs  */,
      FIELD_TYPE_STRING /* std public attribute: cnyOperator  */,
      FIELD_TYPE_STRING /* std public attribute: cnyCurSymbol  */,
      FIELD_TYPE_STRING /* std public attribute: cnyGrpSymbol  */,
      FIELD_TYPE_STRING /* std public attribute: cnyDecSymbol  */,
      FIELD_TYPE_SHORT /* std public attribute: cnyRoundFrom  */,
      FIELD_TYPE_DATETIME /* std public attribute: cnyTimestamp  */
    };
  
  private final int[] fieldSizes = new int[] {
		  cnyCurrencyRefSize,
		  cnyCurrencyTextSize,
		  0,
		  0,
		  cnyOperatorSize,
		  cnyCurSymbolSize,
		  cnyGrpSymbolSize,
		  cnyDecSymbolSize,
		  0,
		  0
};
      

  public int[] fieldSizes() {
  	return fieldSizes;
  }  

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int cnyCurrencyRefFilter = 0; // filter index
  private static final int cnyCurrencyRefSize = 3; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int cnyCurrencyTextFilter = 1; // filter index
  private static final int cnyCurrencyTextSize = 30; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int cnyExchangeRateFilter = 2; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int cnyNoDecsFilter = 3; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int cnyOperatorFilter = 4; // filter index
  private static final int cnyOperatorSize = 1; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int cnyCurSymbolFilter = 5; // filter index
  private static final int cnyCurSymbolSize = 10; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int cnyGrpSymbolFilter = 6; // filter index
  private static final int cnyGrpSymbolSize = 1; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int cnyDecSymbolFilter = 7; // filter index
  private static final int cnyDecSymbolSize = 1; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int cnyRoundFromFilter = 8; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int cnyTimestampFilter = 9; // filter index

  //~ Instance variables /////////////////////////////////////////////////////

  private BigDecimal cnyExchangeRate; // Loaded from Schema
  private DateTime cnyTimestamp; // Loaded from Schema
  private Short cnyNoDecs; // Loaded from Schema
  private Short cnyRoundFrom; // Loaded from Schema
  private String cnyCurSymbol; // Loaded from Schema

  //---------------------
  // Field declarations
  //---------------------
  // all attributes
  private String cnyCurrencyRef; // Loaded from Schema
  private String cnyCurrencyText; // Loaded from Schema
  private String cnyDecSymbol; // Loaded from Schema
  private String cnyGrpSymbol; // Loaded from Schema
  private String cnyOperator; // Loaded from Schema

  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new CnyCurrencyDMO object.
   */
  public CnyCurrencyDMO(  ) {
  }

  // Constructor - taking public attributes
  /**
   * Creates a new CnyCurrencyDMO object.
   *
   * @param cnyCurrencyRef DOCUMENT ME!
   * @param cnyCurrencyText DOCUMENT ME!
   * @param cnyExchangeRate DOCUMENT ME!
   * @param cnyNoDecs DOCUMENT ME!
   * @param cnyOperator DOCUMENT ME!
   * @param cnyCurSymbol DOCUMENT ME!
   * @param cnyGrpSymbol DOCUMENT ME!
   * @param cnyDecSymbol DOCUMENT ME!
   * @param cnyRoundFrom DOCUMENT ME!
   * @param cnyTimestamp DOCUMENT ME!
   */
  public CnyCurrencyDMO( 
    final String     cnyCurrencyRef,
    final String     cnyCurrencyText,
    final BigDecimal cnyExchangeRate,
    final Short      cnyNoDecs,
    final String     cnyOperator,
    final String     cnyCurSymbol,
    final String     cnyGrpSymbol,
    final String     cnyDecSymbol,
    final Short      cnyRoundFrom,
    final DateTime   cnyTimestamp ) {
    this.cnyCurrencyRef = cnyCurrencyRef;

    this.cnyCurrencyText = cnyCurrencyText;

    this.cnyExchangeRate = cnyExchangeRate;

    this.cnyNoDecs = cnyNoDecs;

    this.cnyOperator = cnyOperator;

    this.cnyCurSymbol = cnyCurSymbol;

    this.cnyGrpSymbol = cnyGrpSymbol;

    this.cnyDecSymbol = cnyDecSymbol;

    this.cnyRoundFrom = cnyRoundFrom;

    this.cnyTimestamp = ( cnyTimestamp != null )
      ? new DateTime( cnyTimestamp ) : null;
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
    return new DAOArgs( 1 ).arg( ( this.cnyCurrencyRef == null ) ? null
                                                                 : this.cnyCurrencyRef
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
      ( cnyCurrencyRef == null ) ? null
                                 : ( ( cnyCurrencyRef.length(  ) <= cnyCurrencyRefSize )
      ? cnyCurrencyRef
      : cnyCurrencyRef.substring( 0, cnyCurrencyRefSize ) // auto trimmed to fit, if required.
       ),
      ( cnyCurrencyText == null ) ? null
                                  : ( ( cnyCurrencyText.length(  ) <= cnyCurrencyTextSize )
      ? cnyCurrencyText
      : cnyCurrencyText.substring( 0, cnyCurrencyTextSize ) // auto trimmed to fit, if required.
       ), cnyExchangeRate, cnyNoDecs,
      ( cnyOperator == null ) ? null
                              : ( ( cnyOperator.length(  ) <= cnyOperatorSize )
      ? cnyOperator
      : cnyOperator.substring( 0, cnyOperatorSize ) // auto trimmed to fit, if required.
       ),
      ( cnyCurSymbol == null ) ? null
                               : ( ( cnyCurSymbol.length(  ) <= cnyCurSymbolSize )
      ? cnyCurSymbol
      : cnyCurSymbol.substring( 0, cnyCurSymbolSize ) // auto trimmed to fit, if required.
       ),
      ( cnyGrpSymbol == null ) ? null
                               : ( ( cnyGrpSymbol.length(  ) <= cnyGrpSymbolSize )
      ? cnyGrpSymbol
      : cnyGrpSymbol.substring( 0, cnyGrpSymbolSize ) // auto trimmed to fit, if required.
       ),
      ( cnyDecSymbol == null ) ? null
                               : ( ( cnyDecSymbol.length(  ) <= cnyDecSymbolSize )
      ? cnyDecSymbol
      : cnyDecSymbol.substring( 0, cnyDecSymbolSize ) // auto trimmed to fit, if required.
       ), cnyRoundFrom, cnyTimestamp
    };
  }

  /**
   * DOCUMENT ME!
   *
   * @param fields DOCUMENT ME!
   */
  protected void set( final Object[] fields ) {
    cnyCurrencyRef = rtrim( (String) fields[0] );
    cnyCurrencyText = rtrim( (String) fields[1] );
    cnyExchangeRate = (BigDecimal) fields[2];
    cnyNoDecs = (Short) fields[3];
    cnyOperator = rtrim( (String) fields[4] );
    cnyCurSymbol = rtrim( (String) fields[5] );
    cnyGrpSymbol = rtrim( (String) fields[6] );
    cnyDecSymbol = rtrim( (String) fields[7] );
    cnyRoundFrom = (Short) fields[8];
    cnyTimestamp = (DateTime) fields[9];
  }

  // Get methods ///////////////////////////////////////////////////////////////
  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getCnyCurrencyRef(  ) {
    return cnyCurrencyRef;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getCnyCurrencyText(  ) {
    return cnyCurrencyText;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public BigDecimal getCnyExchangeRate(  ) {
    return cnyExchangeRate;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public Short getCnyNoDecs(  ) {
    return cnyNoDecs;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getCnyOperator(  ) {
    return cnyOperator;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getCnyCurSymbol(  ) {
    return cnyCurSymbol;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getCnyGrpSymbol(  ) {
    return cnyGrpSymbol;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getCnyDecSymbol(  ) {
    return cnyDecSymbol;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public Short getCnyRoundFrom(  ) {
    return cnyRoundFrom;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public DateTime getCnyTimestamp(  ) {
    return ( cnyTimestamp != null ) ? new DateTime( cnyTimestamp ) : null;
  }

  // Setter methods ///////////////////////////////////////////////////////////////

  //
  // Master setter follows...
  //

  /**
   * Setter that takes all attributes
   */
  public void set( 
    final String     cnyCurrencyRef,
    final String     cnyCurrencyText,
    final BigDecimal cnyExchangeRate,
    final Short      cnyNoDecs,
    final String     cnyOperator,
    final String     cnyCurSymbol,
    final String     cnyGrpSymbol,
    final String     cnyDecSymbol,
    final Short      cnyRoundFrom,
    final DateTime   cnyTimestamp ) {
    this.cnyCurrencyRef = cnyCurrencyRef;
    this.cnyCurrencyText = cnyCurrencyText;
    this.cnyExchangeRate = cnyExchangeRate;
    this.cnyNoDecs = cnyNoDecs;
    this.cnyOperator = cnyOperator;
    this.cnyCurSymbol = cnyCurSymbol;
    this.cnyGrpSymbol = cnyGrpSymbol;
    this.cnyDecSymbol = cnyDecSymbol;
    this.cnyRoundFrom = cnyRoundFrom;
    this.cnyTimestamp = ( cnyTimestamp != null )
      ? new DateTime( cnyTimestamp ) : null;
  }

  //
  // Public access modifiers if any
  // (provided for attributes that are public in the analysis model)
  //    

  /**
  * Sets the CnyCurrencyRef field.
  *
  * @param cnyCurrencyRef
  */
  public void setCnyCurrencyRef( final String cnyCurrencyRef ) {
    this.cnyCurrencyRef = getPadded(cnyCurrencyRef, cnyCurrencyRefFilter);
  }

  /**
  * Sets the CnyCurrencyText field.
  *
  * @param cnyCurrencyText
  */
  public void setCnyCurrencyText( final String cnyCurrencyText ) {
    this.cnyCurrencyText = getPadded(cnyCurrencyText, cnyCurrencyTextFilter);
  }

  /**
  * Sets the CnyExchangeRate field.
  *
  * @param cnyExchangeRate
  */
  public void setCnyExchangeRate( final BigDecimal cnyExchangeRate ) {
    this.cnyExchangeRate = cnyExchangeRate;
  }

  /**
  * Sets the CnyExchangeRate field.
  *
  * @param cnyExchangeRate
  */
  public void setCnyExchangeRate( final double cnyExchangeRate ) {
    this.cnyExchangeRate = new BigDecimal( cnyExchangeRate );
  }

  /**
  * Sets the CnyNoDecs field.
  *
  * @param cnyNoDecs
  */
  public void setCnyNoDecs( final Short cnyNoDecs ) {
    this.cnyNoDecs = cnyNoDecs;
  }

  /**
  * Sets the CnyNoDecs field.
  *
  * @param cnyNoDecs
  */
  public void setCnyNoDecs( final int cnyNoDecs ) {
    this.cnyNoDecs = Short.valueOf( (short) cnyNoDecs );
  }

  /**
  * Sets the CnyOperator field.
  *
  * @param cnyOperator
  */
  public void setCnyOperator( final String cnyOperator ) {
    this.cnyOperator = getPadded(cnyOperator, cnyOperatorFilter);
  }

  /**
  * Sets the CnyCurSymbol field.
  *
  * @param cnyCurSymbol
  */
  public void setCnyCurSymbol( final String cnyCurSymbol ) {
    this.cnyCurSymbol = getPadded(cnyCurSymbol, cnyCurSymbolFilter);
  }

  /**
  * Sets the CnyGrpSymbol field.
  *
  * @param cnyGrpSymbol
  */
  public void setCnyGrpSymbol( final String cnyGrpSymbol ) {
    this.cnyGrpSymbol = getPadded(cnyGrpSymbol, cnyGrpSymbolFilter);
  }

  /**
  * Sets the CnyDecSymbol field.
  *
  * @param cnyDecSymbol
  */
  public void setCnyDecSymbol( final String cnyDecSymbol ) {
    this.cnyDecSymbol = getPadded(cnyDecSymbol, cnyDecSymbolFilter);
  }

  /**
  * Sets the CnyRoundFrom field.
  *
  * @param cnyRoundFrom
  */
  public void setCnyRoundFrom( final Short cnyRoundFrom ) {
    this.cnyRoundFrom = cnyRoundFrom;
  }

  /**
  * Sets the CnyRoundFrom field.
  *
  * @param cnyRoundFrom
  */
  public void setCnyRoundFrom( final int cnyRoundFrom ) {
    this.cnyRoundFrom = Short.valueOf( (short) cnyRoundFrom );
  }

  /**
  * Sets the CnyTimestamp field.
  *
  * @param cnyTimestamp
  */
  public void setCnyTimestamp( final DateTime cnyTimestamp ) {
    this.cnyTimestamp = ( cnyTimestamp != null )
      ? new DateTime( cnyTimestamp ) : null;
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
