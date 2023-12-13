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
 * A value object to carry the data for a SbhSubHistory.
 *
 *
 * <H3> A SbhSubHistory is: </H3>
 *
 * <!-- indent text -->
 * <TABLE BORDER="0" CELLPADDING="0" CELLSPACING="0">
 * <TR>
 * <TD WIDTH="25">&nbsp;</TD>
 * <TD>
 *
 * Holds details about events occurring at Subscriber Level.
 *
 * <!-- end indent text -->
 * </TD>
 * </TR>
 * </TABLE>
 *
 *
 * <H3> SbhSubHistory Value Object: </H3>
 *
 * <!-- indent text -->
 * <TABLE BORDER="0" CELLPADDING="0" CELLSPACING="0">
 * <TR>
 * <TD WIDTH="25">&nbsp;</TD>
 * <TD>
 *
 * <P>
 *     This is a value object (called a Data Model Object or 'DMO').
 *     It is used to pass the data for a sbhSubHistory into and out of the BASE module.
 *     Because it's purpose is to carry data into and out of the module it is visible outside the module.
 * </P>
 * <P>
 *     This value object carries the data for one sbhSubHistory. A sbhSubHistory is:
 * Holds details about events occurring at Subscriber Level.
 * </P>
 * <P>
 *     It corresponds to the business logic object SbhSubHistory which
 *     contains all the business behaviour of a sbhSubHistory but is not visible outside the
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
 *    This value object contains fields for all the details of a sbhSubHistory, namely:
 * </P>
 *


 * <P>
 *    <U>Fields to carry the Attributes of a sbhSubHistory:</U>
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
 *   <TD ALIGN="left" VALIGN="top"><B>sbhSubscriberId</B></TD>
 *   <TD ALIGN="left" VALIGN="top">Integer</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Subscriber Id
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
 *       <A HREF="#getSbhSubscriberId()">
 *           getSbhSubscriberId
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setSbhSubscriberId(java.lang.Integer)">
 *           setSbhSubscriberId (Integer)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>sbhFieldId</B></TD>
 *   <TD ALIGN="left" VALIGN="top">Integer</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Identifier of field modified
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
 *       <A HREF="#getSbhFieldId()">
 *           getSbhFieldId
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setSbhFieldId(java.lang.Integer)">
 *           setSbhFieldId (Integer)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>sbhHistCode</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       History code detailing event
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
 *       <A HREF="#getSbhHistCode()">
 *           getSbhHistCode
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setSbhHistCode(java.lang.String)">
 *           setSbhHistCode (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>sbhOldValue</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Old value of field
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
 *       <A HREF="#getSbhOldValue()">
 *           getSbhOldValue
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setSbhOldValue(java.lang.String)">
 *           setSbhOldValue (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>sbhNewValue</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       New value of field
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
 *       <A HREF="#getSbhNewValue()">
 *           getSbhNewValue
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setSbhNewValue(java.lang.String)">
 *           setSbhNewValue (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>sbhUserId</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       User who performed the event
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
 *       <A HREF="#getSbhUserId()">
 *           getSbhUserId
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setSbhUserId(java.lang.String)">
 *           setSbhUserId (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>sbhTerminalId</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Terminal event performed at
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
 *       <A HREF="#getSbhTerminalId()">
 *           getSbhTerminalId
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setSbhTerminalId(java.lang.String)">
 *           setSbhTerminalId (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>sbhTimestamp</B></TD>
 *   <TD ALIGN="left" VALIGN="top">DateTime</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Event time (Year to Second format)
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
 *       <A HREF="#getSbhTimestamp()">
 *           getSbhTimestamp
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setSbhTimestamp(com.cmgwds.eppix.util.DateTime)">
 *           setSbhTimestamp (DateTime)
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


 * @see SbhSubHistory
 *
 * @author
 * @version $Revision: $
 *
 * @since $jdk$
 */
public class SbhSubHistoryDMO
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
      FIELD_TYPE_INTEGER /* std public attribute: sbhSubscriberId  */,
      FIELD_TYPE_INTEGER /* std public attribute: sbhFieldId  */,
      FIELD_TYPE_STRING /* std public attribute: sbhHistCode  */,
      FIELD_TYPE_STRING /* std public attribute: sbhOldValue  */,
      FIELD_TYPE_STRING /* std public attribute: sbhNewValue  */,
      FIELD_TYPE_STRING /* std public attribute: sbhUserId  */,
      FIELD_TYPE_STRING /* std public attribute: sbhTerminalId  */,
      FIELD_TYPE_DATETIME /* std public attribute: sbhTimestamp  */
    };
  
  private final int[] fieldSizes = new int[] {
		  0,
		  0,
		  sbhHistCodeSize,
		  sbhOldValueSize,
		  sbhNewValueSize,
		  sbhUserIdSize,
		  sbhTerminalIdSize,
		  0
  };
      

  public int[] fieldSizes() {
  	return fieldSizes;
  }  

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int sbhSubscriberIdFilter = 0; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int sbhFieldIdFilter = 1; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int sbhHistCodeFilter = 2; // filter index
  private static final int sbhHistCodeSize = 10; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int sbhOldValueFilter = 3; // filter index
  private static final int sbhOldValueSize = 50; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int sbhNewValueFilter = 4; // filter index
  private static final int sbhNewValueSize = 50; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int sbhUserIdFilter = 5; // filter index
  private static final int sbhUserIdSize = 10; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int sbhTerminalIdFilter = 6; // filter index
  private static final int sbhTerminalIdSize = 20; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int sbhTimestampFilter = 7; // filter index

  //~ Instance variables /////////////////////////////////////////////////////

  private DateTime sbhTimestamp; // Loaded from Schema
  private Integer sbhFieldId; // Loaded from Schema

  //---------------------
  // Field declarations
  //---------------------
  // all attributes
  private Integer sbhSubscriberId; // Loaded from Schema
  private String sbhHistCode; // Loaded from Schema
  private String sbhNewValue; // Loaded from Schema
  private String sbhOldValue; // Loaded from Schema
  private String sbhTerminalId; // Loaded from Schema
  private String sbhUserId; // Loaded from Schema

  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new SbhSubHistoryDMO object.
   */
  public SbhSubHistoryDMO(  ) {
  }

  // Constructor - taking public attributes
  /**
   * Creates a new SbhSubHistoryDMO object.
   *
   * @param sbhSubscriberId DOCUMENT ME!
   * @param sbhFieldId DOCUMENT ME!
   * @param sbhHistCode DOCUMENT ME!
   * @param sbhOldValue DOCUMENT ME!
   * @param sbhNewValue DOCUMENT ME!
   * @param sbhUserId DOCUMENT ME!
   * @param sbhTerminalId DOCUMENT ME!
   * @param sbhTimestamp DOCUMENT ME!
   */
  public SbhSubHistoryDMO( 
    final Integer  sbhSubscriberId,
    final Integer  sbhFieldId,
    final String   sbhHistCode,
    final String   sbhOldValue,
    final String   sbhNewValue,
    final String   sbhUserId,
    final String   sbhTerminalId,
    final DateTime sbhTimestamp ) {
    this.sbhSubscriberId = sbhSubscriberId;

    this.sbhFieldId = sbhFieldId;

    this.sbhHistCode = sbhHistCode;

    this.sbhOldValue = sbhOldValue;

    this.sbhNewValue = sbhNewValue;

    this.sbhUserId = sbhUserId;

    this.sbhTerminalId = sbhTerminalId;

    this.sbhTimestamp = ( sbhTimestamp != null )
      ? new DateTime( sbhTimestamp ) : null;
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
    return new DAOArgs( 0 );
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
      sbhSubscriberId, sbhFieldId,
      ( sbhHistCode == null ) ? null
                              : ( ( sbhHistCode.length(  ) <= sbhHistCodeSize )
      ? sbhHistCode
      : sbhHistCode.substring( 0, sbhHistCodeSize ) // auto trimmed to fit, if required.
       ),
      ( sbhOldValue == null ) ? null
                              : ( ( sbhOldValue.length(  ) <= sbhOldValueSize )
      ? sbhOldValue
      : sbhOldValue.substring( 0, sbhOldValueSize ) // auto trimmed to fit, if required.
       ),
      ( sbhNewValue == null ) ? null
                              : ( ( sbhNewValue.length(  ) <= sbhNewValueSize )
      ? sbhNewValue
      : sbhNewValue.substring( 0, sbhNewValueSize ) // auto trimmed to fit, if required.
       ),
      ( sbhUserId == null ) ? null
                            : ( ( sbhUserId.length(  ) <= sbhUserIdSize )
      ? sbhUserId
      : sbhUserId.substring( 0, sbhUserIdSize ) // auto trimmed to fit, if required.
       ),
      ( sbhTerminalId == null ) ? null
                                : ( ( sbhTerminalId.length(  ) <= sbhTerminalIdSize )
      ? sbhTerminalId
      : sbhTerminalId.substring( 0, sbhTerminalIdSize ) // auto trimmed to fit, if required.
       ), sbhTimestamp
    };
  }

  /**
   * DOCUMENT ME!
   *
   * @param fields DOCUMENT ME!
   */
  protected void set( final Object[] fields ) {
    sbhSubscriberId = (Integer) fields[0];
    sbhFieldId = (Integer) fields[1];
    sbhHistCode = rtrim( (String) fields[2] );
    sbhOldValue = rtrim( (String) fields[3] );
    sbhNewValue = rtrim( (String) fields[4] );
    sbhUserId = rtrim( (String) fields[5] );
    sbhTerminalId = rtrim( (String) fields[6] );
    sbhTimestamp = (DateTime) fields[7];
  }

  // Get methods ///////////////////////////////////////////////////////////////
  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public Integer getSbhSubscriberId(  ) {
    return sbhSubscriberId;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public Integer getSbhFieldId(  ) {
    return sbhFieldId;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getSbhHistCode(  ) {
    return sbhHistCode;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getSbhOldValue(  ) {
    return sbhOldValue;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getSbhNewValue(  ) {
    return sbhNewValue;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getSbhUserId(  ) {
    return sbhUserId;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getSbhTerminalId(  ) {
    return sbhTerminalId;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public DateTime getSbhTimestamp(  ) {
    return ( sbhTimestamp != null ) ? new DateTime( sbhTimestamp ) : null;
  }

  // Setter methods ///////////////////////////////////////////////////////////////

  //
  // Master setter follows...
  //

  /**
   * Setter that takes all attributes
   */
  public void set( 
    final Integer  sbhSubscriberId,
    final Integer  sbhFieldId,
    final String   sbhHistCode,
    final String   sbhOldValue,
    final String   sbhNewValue,
    final String   sbhUserId,
    final String   sbhTerminalId,
    final DateTime sbhTimestamp ) {
    this.sbhSubscriberId = sbhSubscriberId;
    this.sbhFieldId = sbhFieldId;
    this.sbhHistCode = sbhHistCode;
    this.sbhOldValue = sbhOldValue;
    this.sbhNewValue = sbhNewValue;
    this.sbhUserId = sbhUserId;
    this.sbhTerminalId = sbhTerminalId;
    this.sbhTimestamp = ( sbhTimestamp != null )
      ? new DateTime( sbhTimestamp ) : null;
  }

  //
  // Public access modifiers if any
  // (provided for attributes that are public in the analysis model)
  //    

  /**
  * Sets the SbhSubscriberId field.
  *
  * @param sbhSubscriberId
  */
  public void setSbhSubscriberId( final Integer sbhSubscriberId ) {
    this.sbhSubscriberId = sbhSubscriberId;
  }

  /**
  * Sets the SbhFieldId field.
  *
  * @param sbhFieldId
  */
  public void setSbhFieldId( final Integer sbhFieldId ) {
    this.sbhFieldId = sbhFieldId;
  }

  /**
  * Sets the SbhHistCode field.
  *
  * @param sbhHistCode
  */
  public void setSbhHistCode( final String sbhHistCode ) {
    this.sbhHistCode = getPadded(sbhHistCode, sbhHistCodeFilter);
  }

  /**
  * Sets the SbhOldValue field.
  *
  * @param sbhOldValue
  */
  public void setSbhOldValue( final String sbhOldValue ) {
    this.sbhOldValue = getPadded(sbhOldValue, sbhOldValueFilter);
  }

  /**
  * Sets the SbhNewValue field.
  *
  * @param sbhNewValue
  */
  public void setSbhNewValue( final String sbhNewValue ) {
    this.sbhNewValue = getPadded(sbhNewValue, sbhNewValueFilter);
  }

  /**
  * Sets the SbhUserId field.
  *
  * @param sbhUserId
  */
  public void setSbhUserId( final String sbhUserId ) {
    this.sbhUserId = getPadded(sbhUserId, sbhUserIdFilter);
  }

  /**
  * Sets the SbhTerminalId field.
  *
  * @param sbhTerminalId
  */
  public void setSbhTerminalId( final String sbhTerminalId ) {
    this.sbhTerminalId = getPadded(sbhTerminalId, sbhTerminalIdFilter);
  }

  /**
  * Sets the SbhTimestamp field.
  *
  * @param sbhTimestamp
  */
  public void setSbhTimestamp( final DateTime sbhTimestamp ) {
    this.sbhTimestamp = ( sbhTimestamp != null )
      ? new DateTime( sbhTimestamp ) : null;
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
