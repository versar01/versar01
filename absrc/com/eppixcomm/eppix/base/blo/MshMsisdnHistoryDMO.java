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
 * A value object to carry the data for a MshMsisdnHistory.
 *
 *
 * <H3> A MshMsisdnHistory is: </H3>
 *
 * <!-- indent text -->
 * <TABLE BORDER="0" CELLPADDING="0" CELLSPACING="0">
 * <TR>
 * <TD WIDTH="25">&nbsp;</TD>
 * <TD>
 *
 * 'Handset History'.
 * <p>
 *   Holds a full list of all the actions in the system that have affected handsets.
 * </p>
 * <p>
 *   The code field is extended to allow for the new structure of vas history codes.
 * </p>
 *
 * <!-- end indent text -->
 * </TD>
 * </TR>
 * </TABLE>
 *
 *
 * <H3> MshMsisdnHistory Value Object: </H3>
 *
 * <!-- indent text -->
 * <TABLE BORDER="0" CELLPADDING="0" CELLSPACING="0">
 * <TR>
 * <TD WIDTH="25">&nbsp;</TD>
 * <TD>
 *
 * <P>
 *     This is a value object (called a Data Model Object or 'DMO').
 *     It is used to pass the data for a mshMsisdnHistory into and out of the BASE module.
 *     Because it's purpose is to carry data into and out of the module it is visible outside the module.
 * </P>
 * <P>
 *     This value object carries the data for one mshMsisdnHistory. A mshMsisdnHistory is:
 * 'Handset History'.
 * </P>
 * <P>
 *     It corresponds to the business logic object MshMsisdnHistory which
 *     contains all the business behaviour of a mshMsisdnHistory but is not visible outside the
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
 *    This value object contains fields for all the details of a mshMsisdnHistory, namely:
 * </P>
 *


 * <P>
 *    <U>Fields to carry the Attributes of a mshMsisdnHistory:</U>
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
 *   <TD ALIGN="left" VALIGN="top"><B>mshSubscriberId</B></TD>
 *   <TD ALIGN="left" VALIGN="top">Integer</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Unique identifier for subscription.
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
 *       <A HREF="#getMshSubscriberId()">
 *           getMshSubscriberId
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setMshSubscriberId(java.lang.Integer)">
 *           setMshSubscriberId (Integer)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>mshMsisdnNo</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Which handset this event happened to.
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
 *       <A HREF="#getMshMsisdnNo()">
 *           getMshMsisdnNo
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setMshMsisdnNo(java.lang.String)">
 *           setMshMsisdnNo (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>mshHistCode</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       A history code identifying which event happened to the handset.
 *       <p>
 *         A mixture of hardcoded codes and user defined ones. All are described in hist_desc.
 *       </p>
 *       <p>
 *         Valid codes are maintained in HISTDESC
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
 *       <A HREF="#getMshHistCode()">
 *           getMshHistCode
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setMshHistCode(java.lang.String)">
 *           setMshHistCode (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>mshComment</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Description of event which occurred.
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
 *       <A HREF="#getMshComment()">
 *           getMshComment
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setMshComment(java.lang.String)">
 *           setMshComment (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>mshUserId</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Identification of user who performed the event.
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
 *       <A HREF="#getMshUserId()">
 *           getMshUserId
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setMshUserId(java.lang.String)">
 *           setMshUserId (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>mshTerminalId</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Identification of terminal which performed event eg tty2a.
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
 *       <A HREF="#getMshTerminalId()">
 *           getMshTerminalId
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setMshTerminalId(java.lang.String)">
 *           setMshTerminalId (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>mshTimestamp</B></TD>
 *   <TD ALIGN="left" VALIGN="top">DateTime</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Date/time record was created.
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
 *       <A HREF="#getMshTimestamp()">
 *           getMshTimestamp
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setMshTimestamp(com.cmgwds.eppix.util.DateTime)">
 *           setMshTimestamp (DateTime)
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


 * @see MshMsisdnHistory
 *
 * @author
 * @version $Revision: $
 *
 * @since $jdk$
 */
public class MshMsisdnHistoryDMO
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
      FIELD_TYPE_INTEGER /* std public attribute: mshSubscriberId  */,
      FIELD_TYPE_STRING /* std public attribute: mshMsisdnNo  */,
      FIELD_TYPE_STRING /* std public attribute: mshHistCode  */,
      FIELD_TYPE_STRING /* std public attribute: mshComment  */,
      FIELD_TYPE_STRING /* std public attribute: mshUserId  */,
      FIELD_TYPE_STRING /* std public attribute: mshTerminalId  */,
      FIELD_TYPE_DATETIME /* std public attribute: mshTimestamp  */
    };
  
  private final int[] fieldSizes = new int[] {
		 0,
		 mshMsisdnNoSize,
		 mshHistCodeSize,
		 mshCommentSize,
		 mshUserIdSize,
		 mshTerminalIdSize,
		 0
  };
      

  public int[] fieldSizes() {
  	return fieldSizes;
  }  

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int mshSubscriberIdFilter = 0; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int mshMsisdnNoFilter = 1; // filter index
  private static final int mshMsisdnNoSize = 15; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int mshHistCodeFilter = 2; // filter index
  private static final int mshHistCodeSize = 10; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int mshCommentFilter = 3; // filter index
  private static final int mshCommentSize = 50; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int mshUserIdFilter = 4; // filter index
  private static final int mshUserIdSize = 10; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int mshTerminalIdFilter = 5; // filter index
  private static final int mshTerminalIdSize = 20; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int mshTimestampFilter = 6; // filter index

  //~ Instance variables /////////////////////////////////////////////////////

  private DateTime mshTimestamp; // Loaded from Schema

  //---------------------
  // Field declarations
  //---------------------
  // all attributes
  private Integer mshSubscriberId; // Loaded from Schema
  private String mshComment; // Loaded from Schema
  private String mshHistCode; // Loaded from Schema
  private String mshMsisdnNo; // Loaded from Schema
  private String mshTerminalId; // Loaded from Schema
  private String mshUserId; // Loaded from Schema

  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new MshMsisdnHistoryDMO object.
   */
  public MshMsisdnHistoryDMO(  ) {
  }

  // Constructor - taking public attributes
  /**
   * Creates a new MshMsisdnHistoryDMO object.
   *
   * @param mshSubscriberId DOCUMENT ME!
   * @param mshMsisdnNo DOCUMENT ME!
   * @param mshHistCode DOCUMENT ME!
   * @param mshComment DOCUMENT ME!
   * @param mshUserId DOCUMENT ME!
   * @param mshTerminalId DOCUMENT ME!
   * @param mshTimestamp DOCUMENT ME!
   */
  public MshMsisdnHistoryDMO( 
    final Integer  mshSubscriberId,
    final String   mshMsisdnNo,
    final String   mshHistCode,
    final String   mshComment,
    final String   mshUserId,
    final String   mshTerminalId,
    final DateTime mshTimestamp ) {
    this.mshSubscriberId = mshSubscriberId;

    this.mshMsisdnNo = mshMsisdnNo;

    this.mshHistCode = mshHistCode;

    this.mshComment = mshComment;

    this.mshUserId = mshUserId;

    this.mshTerminalId = mshTerminalId;

    this.mshTimestamp = ( mshTimestamp != null )
      ? new DateTime( mshTimestamp ) : null;
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
      mshSubscriberId,
      ( mshMsisdnNo == null ) ? null
                              : ( ( mshMsisdnNo.length(  ) <= mshMsisdnNoSize )
      ? mshMsisdnNo
      : mshMsisdnNo.substring( 0, mshMsisdnNoSize ) // auto trimmed to fit, if required.
       ),
      ( mshHistCode == null ) ? null
                              : ( ( mshHistCode.length(  ) <= mshHistCodeSize )
      ? mshHistCode
      : mshHistCode.substring( 0, mshHistCodeSize ) // auto trimmed to fit, if required.
       ),
      ( mshComment == null ) ? null
                             : ( ( mshComment.length(  ) <= mshCommentSize )
      ? mshComment
      : mshComment.substring( 0, mshCommentSize ) // auto trimmed to fit, if required.
       ),
      ( mshUserId == null ) ? null
                            : ( ( mshUserId.length(  ) <= mshUserIdSize )
      ? mshUserId
      : mshUserId.substring( 0, mshUserIdSize ) // auto trimmed to fit, if required.
       ),
      ( mshTerminalId == null ) ? null
                                : ( ( mshTerminalId.length(  ) <= mshTerminalIdSize )
      ? mshTerminalId
      : mshTerminalId.substring( 0, mshTerminalIdSize ) // auto trimmed to fit, if required.
       ), mshTimestamp
    };
  }

  /**
   * DOCUMENT ME!
   *
   * @param fields DOCUMENT ME!
   */
  protected void set( final Object[] fields ) {
    mshSubscriberId = (Integer) fields[0];
    mshMsisdnNo = rtrim( (String) fields[1] );
    mshHistCode = rtrim( (String) fields[2] );
    mshComment = rtrim( (String) fields[3] );
    mshUserId = rtrim( (String) fields[4] );
    mshTerminalId = rtrim( (String) fields[5] );
    mshTimestamp = (DateTime) fields[6];
  }

  // Get methods ///////////////////////////////////////////////////////////////
  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public Integer getMshSubscriberId(  ) {
    return mshSubscriberId;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getMshMsisdnNo(  ) {
    return mshMsisdnNo;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getMshHistCode(  ) {
    return mshHistCode;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getMshComment(  ) {
    return mshComment;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getMshUserId(  ) {
    return mshUserId;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getMshTerminalId(  ) {
    return mshTerminalId;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public DateTime getMshTimestamp(  ) {
    return ( mshTimestamp != null ) ? new DateTime( mshTimestamp ) : null;
  }

  // Setter methods ///////////////////////////////////////////////////////////////

  //
  // Master setter follows...
  //

  /**
   * Setter that takes all attributes
   */
  public void set( 
    final Integer  mshSubscriberId,
    final String   mshMsisdnNo,
    final String   mshHistCode,
    final String   mshComment,
    final String   mshUserId,
    final String   mshTerminalId,
    final DateTime mshTimestamp ) {
    this.mshSubscriberId = mshSubscriberId;
    this.mshMsisdnNo = mshMsisdnNo;
    this.mshHistCode = mshHistCode;
    this.mshComment = mshComment;
    this.mshUserId = mshUserId;
    this.mshTerminalId = mshTerminalId;
    this.mshTimestamp = ( mshTimestamp != null )
      ? new DateTime( mshTimestamp ) : null;
  }

  //
  // Public access modifiers if any
  // (provided for attributes that are public in the analysis model)
  //    

  /**
  * Sets the MshSubscriberId field.
  *
  * @param mshSubscriberId
  */
  public void setMshSubscriberId( final Integer mshSubscriberId ) {
    this.mshSubscriberId = mshSubscriberId;
  }

  /**
  * Sets the MshMsisdnNo field.
  *
  * @param mshMsisdnNo
  */
  public void setMshMsisdnNo( final String mshMsisdnNo ) {
    this.mshMsisdnNo = getPadded(mshMsisdnNo, mshMsisdnNoFilter);
  }

  /**
  * Sets the MshHistCode field.
  *
  * @param mshHistCode
  */
  public void setMshHistCode( final String mshHistCode ) {
    this.mshHistCode = getPadded(mshHistCode, mshHistCodeFilter);
  }

  /**
  * Sets the MshComment field.
  *
  * @param mshComment
  */
  public void setMshComment( final String mshComment ) {
    this.mshComment = getPadded(mshComment, mshCommentFilter);
  }

  /**
  * Sets the MshUserId field.
  *
  * @param mshUserId
  */
  public void setMshUserId( final String mshUserId ) {
    this.mshUserId = getPadded(mshUserId, mshUserIdFilter);
  }

  /**
  * Sets the MshTerminalId field.
  *
  * @param mshTerminalId
  */
  public void setMshTerminalId( final String mshTerminalId ) {
    this.mshTerminalId = getPadded(mshTerminalId, mshTerminalIdFilter);
  }

  /**
  * Sets the MshTimestamp field.
  *
  * @param mshTimestamp
  */
  public void setMshTimestamp( final DateTime mshTimestamp ) {
    this.mshTimestamp = ( mshTimestamp != null )
      ? new DateTime( mshTimestamp ) : null;
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
