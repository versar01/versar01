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
 * A value object to carry the data for a VsmServiceMsisdn.
 *
 *
 * <H3> A VsmServiceMsisdn is: </H3>
 *
 * <!-- indent text -->
 * <TABLE BORDER="0" CELLPADDING="0" CELLSPACING="0">
 * <TR>
 * <TD WIDTH="25">&nbsp;</TD>
 * <TD>
 *
 * The entries in this table show what msisdns are used for each service the subscriber has taken up.
 * <p>
 *   This is for ALL services, not just 'basic' ones.
 * </p>
 * <p>
 *   For each entry there is a service taken up by the subscriber (shown by an entry in VAS_ACTIVE_SERVICE) and an msisdn
 *   belonging to the subscriber (shown by an entry in vam_active_msisdn).
 * </p>
 *
 * <!-- end indent text -->
 * </TD>
 * </TR>
 * </TABLE>
 *
 *
 * <H3> VsmServiceMsisdn Value Object: </H3>
 *
 * <!-- indent text -->
 * <TABLE BORDER="0" CELLPADDING="0" CELLSPACING="0">
 * <TR>
 * <TD WIDTH="25">&nbsp;</TD>
 * <TD>
 *
 * <P>
 *     This is a value object (called a Data Model Object or 'DMO').
 *     It is used to pass the data for a vsmServiceMsisdn into and out of the BASE module.
 *     Because it's purpose is to carry data into and out of the module it is visible outside the module.
 * </P>
 * <P>
 *     This value object carries the data for one vsmServiceMsisdn. A vsmServiceMsisdn is:
 * The entries in this table show what msisdns are used for each service the subscriber has taken up.
 * </P>
 * <P>
 *     It corresponds to the business logic object VsmServiceMsisdn which
 *     contains all the business behaviour of a vsmServiceMsisdn but is not visible outside the
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
 *    This value object contains fields for all the details of a vsmServiceMsisdn, namely:
 * </P>
 *


 * <P>
 *    <U>Fields to carry the Attributes of a vsmServiceMsisdn:</U>
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
 *   <TD ALIGN="left" VALIGN="top"><B>vsmSubscriberId</B></TD>
 *   <TD ALIGN="left" VALIGN="top">Integer</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Unique identifier for subscription.
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
 *       <A HREF="#getVsmSubscriberId()">
 *           getVsmSubscriberId
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setVsmSubscriberId(java.lang.Integer)">
 *           setVsmSubscriberId (Integer)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>vsmServiceCode</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       The customer has taken up this service.
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
 *       <A HREF="#getVsmServiceCode()">
 *           getVsmServiceCode
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setVsmServiceCode(java.lang.String)">
 *           setVsmServiceCode (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>vsmMsisdnNo</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       One of the phone numbers associated with this service.
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
 *       <A HREF="#getVsmMsisdnNo()">
 *           getVsmMsisdnNo
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setVsmMsisdnNo(java.lang.String)">
 *           setVsmMsisdnNo (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>vsmActivateDate</B></TD>
 *   <TD ALIGN="left" VALIGN="top">Date</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       The date on which the service was connected on the MSISDN.
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
 *       <A HREF="#getVsmActivateDate()">
 *           getVsmActivateDate
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setVsmActivateDate(com.cmgwds.eppix.util.Date)">
 *           setVsmActivateDate (Date)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>vsmDeactDate</B></TD>
 *   <TD ALIGN="left" VALIGN="top">Date</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       The date on which the service was disconnected on the MSISDN.
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
 *       <A HREF="#getVsmDeactDate()">
 *           getVsmDeactDate
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setVsmDeactDate(com.cmgwds.eppix.util.Date)">
 *           setVsmDeactDate (Date)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>vsmBilledUpto</B></TD>
 *   <TD ALIGN="left" VALIGN="top">Date</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       The date up until which the service has been billed.
 *       <p>
 *         This field will be maintained by the pro rata function and the billing run.
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
 *       <A HREF="#getVsmBilledUpto()">
 *           getVsmBilledUpto
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setVsmBilledUpto(com.cmgwds.eppix.util.Date)">
 *           setVsmBilledUpto (Date)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>vsmNodeSent</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       A flag to indicate if the Node-to-Node message has been created for the SIM relating to this MSISDN and service.
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
 *       <A HREF="#getVsmNodeSent()">
 *           getVsmNodeSent
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setVsmNodeSent(java.lang.String)">
 *           setVsmNodeSent (String)
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


 * @see VsmServiceMsisdn
 *
 * @author
 * @version $Revision: $
 *
 * @since $jdk$
 */
public class VsmServiceMsisdnDMO
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
      FIELD_TYPE_INTEGER /* std public attribute: vsmSubscriberId  */,
      FIELD_TYPE_STRING /* std public attribute: vsmServiceCode  */,
      FIELD_TYPE_STRING /* std public attribute: vsmMsisdnNo  */,
      FIELD_TYPE_DATEONLY /* std public attribute: vsmActivateDate  */,
      FIELD_TYPE_DATEONLY /* std public attribute: vsmDeactDate  */,
      FIELD_TYPE_DATEONLY /* std public attribute: vsmBilledUpto  */,
      FIELD_TYPE_STRING /* std public attribute: vsmNodeSent  */
    };
  
  private final int[] fieldSizes = new int[] {
			0,
			vsmServiceCodeSize,
			vsmMsisdnNoSize,
			0,
			0,
			0,
			vsmNodeSentSize
  };
      

  public int[] fieldSizes() {
  	return fieldSizes;
  }  

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int vsmSubscriberIdFilter = 0; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int vsmServiceCodeFilter = 1; // filter index
  private static final int vsmServiceCodeSize = 4; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int vsmMsisdnNoFilter = 2; // filter index
  private static final int vsmMsisdnNoSize = 15; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int vsmActivateDateFilter = 3; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int vsmDeactDateFilter = 4; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int vsmBilledUptoFilter = 5; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int vsmNodeSentFilter = 6; // filter index
  private static final int vsmNodeSentSize = 1; // field size

  //~ Instance variables /////////////////////////////////////////////////////

  private Date vsmActivateDate; // Loaded from Schema
  private Date vsmBilledUpto; // Loaded from Schema
  private Date vsmDeactDate; // Loaded from Schema

  //---------------------
  // Field declarations
  //---------------------
  // all attributes
  private Integer vsmSubscriberId; // Loaded from Schema
  private String vsmMsisdnNo; // Loaded from Schema
  private String vsmNodeSent; // Loaded from Schema
  private String vsmServiceCode; // Loaded from Schema

  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new VsmServiceMsisdnDMO object.
   */
  public VsmServiceMsisdnDMO(  ) {
  }

  // Constructor - taking public attributes
  /**
   * Creates a new VsmServiceMsisdnDMO object.
   *
   * @param vsmSubscriberId DOCUMENT ME!
   * @param vsmServiceCode DOCUMENT ME!
   * @param vsmMsisdnNo DOCUMENT ME!
   * @param vsmActivateDate DOCUMENT ME!
   * @param vsmDeactDate DOCUMENT ME!
   * @param vsmBilledUpto DOCUMENT ME!
   * @param vsmNodeSent DOCUMENT ME!
   */
  public VsmServiceMsisdnDMO(
    final Integer vsmSubscriberId,
    final String  vsmServiceCode,
    final String  vsmMsisdnNo,
    final Date    vsmActivateDate,
    final Date    vsmDeactDate,
    final Date    vsmBilledUpto,
    final String  vsmNodeSent ) {
    this.vsmSubscriberId = vsmSubscriberId;

    this.vsmServiceCode = vsmServiceCode;

    this.vsmMsisdnNo = vsmMsisdnNo;

    this.vsmActivateDate = ( vsmActivateDate != null )
      ? new Date( vsmActivateDate ) : null;

    this.vsmDeactDate = ( vsmDeactDate != null ) ? new Date( vsmDeactDate )
                                                 : null;

    this.vsmBilledUpto = ( vsmBilledUpto != null )
      ? new Date( vsmBilledUpto ) : null;

    this.vsmNodeSent = vsmNodeSent;
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
    return new DAOArgs( 3 ).arg( this.vsmSubscriberId )
                           .arg( ( this.vsmServiceCode == null ) ? null
                                                                 : this.vsmServiceCode
      .trim(  ) )
                           .arg( ( this.vsmMsisdnNo == null ) ? null
                                                              : this.vsmMsisdnNo
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
      vsmSubscriberId,
      ( vsmServiceCode == null ) ? null
                                 : ( ( vsmServiceCode.length(  ) <= vsmServiceCodeSize )
      ? vsmServiceCode
      : vsmServiceCode.substring( 0, vsmServiceCodeSize ) // auto trimmed to fit, if required.
       ),
      ( vsmMsisdnNo == null ) ? null
                              : ( ( vsmMsisdnNo.length(  ) <= vsmMsisdnNoSize )
      ? vsmMsisdnNo
      : vsmMsisdnNo.substring( 0, vsmMsisdnNoSize ) // auto trimmed to fit, if required.
       ), vsmActivateDate, vsmDeactDate, vsmBilledUpto,
      ( vsmNodeSent == null ) ? null
                              : ( ( vsmNodeSent.length(  ) <= vsmNodeSentSize )
      ? vsmNodeSent
      : vsmNodeSent.substring( 0, vsmNodeSentSize ) // auto trimmed to fit, if required.
       )
    };
  }

  /**
   * DOCUMENT ME!
   *
   * @param fields DOCUMENT ME!
   */
  protected void set( final Object[] fields ) {
    vsmSubscriberId = (Integer) fields[0];
    vsmServiceCode = rtrim( (String) fields[1] );
    vsmMsisdnNo = rtrim( (String) fields[2] );
    vsmActivateDate = (Date) fields[3];
    vsmDeactDate = (Date) fields[4];
    vsmBilledUpto = (Date) fields[5];
    vsmNodeSent = rtrim( (String) fields[6] );
  }

  // Get methods ///////////////////////////////////////////////////////////////
  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public Integer getVsmSubscriberId(  ) {
    return vsmSubscriberId;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getVsmServiceCode(  ) {
    return vsmServiceCode;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getVsmMsisdnNo(  ) {
    return vsmMsisdnNo;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public Date getVsmActivateDate(  ) {
    return ( vsmActivateDate != null ) ? new Date( vsmActivateDate ) : null;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public Date getVsmDeactDate(  ) {
    return ( vsmDeactDate != null ) ? new Date( vsmDeactDate ) : null;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public Date getVsmBilledUpto(  ) {
    return ( vsmBilledUpto != null ) ? new Date( vsmBilledUpto ) : null;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getVsmNodeSent(  ) {
    return vsmNodeSent;
  }

  // Setter methods ///////////////////////////////////////////////////////////////

  //
  // Master setter follows...
  //

  /**
   * Setter that takes all attributes
   */
  public void set(
    final Integer vsmSubscriberId,
    final String  vsmServiceCode,
    final String  vsmMsisdnNo,
    final Date    vsmActivateDate,
    final Date    vsmDeactDate,
    final Date    vsmBilledUpto,
    final String  vsmNodeSent ) {
    this.vsmSubscriberId = vsmSubscriberId;
    this.vsmServiceCode = vsmServiceCode;
    this.vsmMsisdnNo = vsmMsisdnNo;
    this.vsmActivateDate = ( vsmActivateDate != null )
      ? new Date( vsmActivateDate ) : null;
    this.vsmDeactDate = ( vsmDeactDate != null ) ? new Date( vsmDeactDate )
                                                 : null;
    this.vsmBilledUpto = ( vsmBilledUpto != null )
      ? new Date( vsmBilledUpto ) : null;
    this.vsmNodeSent = vsmNodeSent;
  }

  //
  // Public access modifiers if any
  // (provided for attributes that are public in the analysis model)
  //

  /**
  * Sets the VsmSubscriberId field.
  *
  * @param vsmSubscriberId
  */
  public void setVsmSubscriberId( final Integer vsmSubscriberId ) {
    this.vsmSubscriberId = vsmSubscriberId;
  }

  /**
  * Sets the VsmServiceCode field.
  *
  * @param vsmServiceCode
  */
  public void setVsmServiceCode( final String vsmServiceCode ) {
    this.vsmServiceCode = getPadded(vsmServiceCode, vsmServiceCodeFilter);
  }

  /**
  * Sets the VsmMsisdnNo field.
  *
  * @param vsmMsisdnNo
  */
  public void setVsmMsisdnNo( final String vsmMsisdnNo ) {
    this.vsmMsisdnNo = getPadded(vsmMsisdnNo, vsmMsisdnNoFilter);
  }

  /**
  * Sets the VsmActivateDate field.
  *
  * @param vsmActivateDate
  */
  public void setVsmActivateDate( final Date vsmActivateDate ) {
    this.vsmActivateDate = ( vsmActivateDate != null )
      ? new Date( vsmActivateDate ) : null;
  }

  /**
  * Sets the VsmDeactDate field.
  *
  * @param vsmDeactDate
  */
  public void setVsmDeactDate( final Date vsmDeactDate ) {
    this.vsmDeactDate = ( vsmDeactDate != null ) ? new Date( vsmDeactDate )
                                                 : null;
  }

  /**
  * Sets the VsmBilledUpto field.
  *
  * @param vsmBilledUpto
  */
  public void setVsmBilledUpto( final Date vsmBilledUpto ) {
    this.vsmBilledUpto = ( vsmBilledUpto != null )
      ? new Date( vsmBilledUpto ) : null;
  }

  /**
  * Sets the VsmNodeSent field.
  *
  * @param vsmNodeSent
  */
  public void setVsmNodeSent( final String vsmNodeSent ) {
    this.vsmNodeSent = getPadded(vsmNodeSent, vsmNodeSentFilter);
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
