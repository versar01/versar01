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
 * A value object to carry the data for a PshParamServHdr.
 *
 *
 * <H3> A PshParamServHdr is: </H3>
 *
 * <!-- indent text -->
 * <TABLE BORDER="0" CELLPADDING="0" CELLSPACING="0">
 * <TR>
 * <TD WIDTH="25">&nbsp;</TD>
 * <TD>
 *
 * This table is used to group together the captured values for a Parameterised service.
 * <p>
 *   Via this table, the parameter values (psd_param_serv_det) will be linked at the appropriate level. Eg For a service
 *   relevant only at subscriber level, the SIM and MSISDN numbers will be blank.
 * </p>
 *
 * <!-- end indent text -->
 * </TD>
 * </TR>
 * </TABLE>
 *
 *
 * <H3> PshParamServHdr Value Object: </H3>
 *
 * <!-- indent text -->
 * <TABLE BORDER="0" CELLPADDING="0" CELLSPACING="0">
 * <TR>
 * <TD WIDTH="25">&nbsp;</TD>
 * <TD>
 *
 * <P>
 *     This is a value object (called a Data Model Object or 'DMO').
 *     It is used to pass the data for a pshParamServHdr into and out of the BASE module.
 *     Because it's purpose is to carry data into and out of the module it is visible outside the module.
 * </P>
 * <P>
 *     This value object carries the data for one pshParamServHdr. A pshParamServHdr is:
 * This table is used to group together the captured values for a Parameterised service.
 * </P>
 * <P>
 *     It corresponds to the business logic object PshParamServHdr which
 *     contains all the business behaviour of a pshParamServHdr but is not visible outside the
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
 *    This value object contains fields for all the details of a pshParamServHdr, namely:
 * </P>
 *


 * <P>
 *    <U>Fields to carry the Attributes of a pshParamServHdr:</U>
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
 *   <TD ALIGN="left" VALIGN="top"><B>pshId</B></TD>
 *   <TD ALIGN="left" VALIGN="top">Integer</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Unique identifier for this Parameterised Service Header
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
 *       <A HREF="#getPshId()">
 *           getPshId
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setPshId(java.lang.Integer)">
 *           setPshId (Integer)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>pshServiceCode</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Refers to vsr_service.
 *       <p>
 *         vsr_service_code
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
 *       <A HREF="#getPshServiceCode()">
 *           getPshServiceCode
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setPshServiceCode(java.lang.String)">
 *           setPshServiceCode (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>pshSubscriberId</B></TD>
 *   <TD ALIGN="left" VALIGN="top">Integer</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Refers to sbd_subscriber_dets.
 *       <p>
 *         sbd_subscriber_id
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
 *       <A HREF="#getPshSubscriberId()">
 *           getPshSubscriberId
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setPshSubscriberId(java.lang.Integer)">
 *           setPshSubscriberId (Integer)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>pshSimNo</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Refers to smn_sim_nos.
 *       <p>
 *         smn_sim_no
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
 *       <A HREF="#getPshSimNo()">
 *           getPshSimNo
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setPshSimNo(java.lang.String)">
 *           setPshSimNo (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>pshMsisdnNo</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Refers to vam_active_msisdn.
 *       <p>
 *         vam_msisdn_no
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
 *       <A HREF="#getPshMsisdnNo()">
 *           getPshMsisdnNo
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setPshMsisdnNo(java.lang.String)">
 *           setPshMsisdnNo (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>pshArchived</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Whether or not a parameter has been archived
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
 *       <A HREF="#getPshArchived()">
 *           getPshArchived
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setPshArchived(java.lang.String)">
 *           setPshArchived (String)
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


 * @see PshParamServHdr
 *
 * @author
 * @version $Revision: $
 *
 * @since $jdk$
 */
public class PshParamServHdrDMO
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
      FIELD_TYPE_INTEGER /* std public attribute: pshId  */,
      FIELD_TYPE_STRING /* std public attribute: pshServiceCode  */,
      FIELD_TYPE_STRING,
      FIELD_TYPE_INTEGER /* std public attribute: pshSubscriberId  */,
      FIELD_TYPE_STRING /* std public attribute: pshSimNo  */,
      FIELD_TYPE_STRING /* std public attribute: pshMsisdnNo  */,
      FIELD_TYPE_STRING /* std public attribute: pshArchived  */
      
    };
  
  /**
  * TODO SJ Implement the array of field sizes
  *
  */
  private final int[] fieldSizes = new int[] {
		  0,
		  pshServiceCodeSize,
		  pshServiceTypeSize,
		  0,
		  pshSimNoSize,
		  pshMsisdnNoSize,
		  pshArchivedSize   
  };
      

  public int[] fieldSizes() {
  	return fieldSizes;
  }  

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int pshIdFilter = 0; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int pshServiceCodeFilter = 1; // filter index
  private static final int pshServiceCodeSize = 4; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int pshServiceTypeFilter = 2; // filter index
  private static final int pshServiceTypeSize = 5; // field size
  
  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int pshSubscriberIdFilter = 3; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int pshSimNoFilter = 4; // filter index
  private static final int pshSimNoSize = 14; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int pshMsisdnNoFilter = 5; // filter index
  private static final int pshMsisdnNoSize = 15; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int pshArchivedFilter = 6; // filter index
  private static final int pshArchivedSize = 1; // field size


  
  //~ Instance variables /////////////////////////////////////////////////////

  //---------------------
  // Field declarations
  //---------------------
  /*psh_id
  psh_service_code
  psh_service_type
  psh_subscriber_id
  psh_sim_no
  psh_msisdn_no
  psh_archived*/
  
  // all attributes
  private Integer pshId; // Loaded from Schema
  private String pshServiceCode; // Loaded from Schema
  private String pshServiceType;  
  private Integer pshSubscriberId; // Loaded from Schema
  private String pshSimNo; // Loaded from Schema
  private String pshMsisdnNo; // Loaded from Schema
  private String pshArchived; // Loaded from Schema
  
  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new PshParamServHdrDMO object.
   */
  public PshParamServHdrDMO(  ) {
  }

  // Constructor - taking public attributes
  /**
   * Creates a new PshParamServHdrDMO object.
   *
   * @param pshId DOCUMENT ME!
   * @param pshServiceCode DOCUMENT ME!
   * @param pshSubscriberId DOCUMENT ME!
   * @param pshSimNo DOCUMENT ME!
   * @param pshMsisdnNo DOCUMENT ME!
   * @param pshArchived DOCUMENT ME!
   */
  public PshParamServHdrDMO( 
    final Integer pshId,
    final String  pshServiceCode,
    final String  pshArchived,
    final Integer pshSubscriberId,
    final String  pshSimNo,
    final String  pshMsisdnNo) {
	  
    this.pshId = pshId;
    this.pshServiceCode = pshServiceCode;
    this.pshSubscriberId = pshSubscriberId;
    this.pshSimNo = pshSimNo;
    this.pshMsisdnNo = pshMsisdnNo;
    this.pshArchived = pshArchived;
    this.pshServiceType = pshServiceType;
  }

  //~ Methods ////////////////////////////////////////////////////////////////

  // DBO method implementations ////////////////////////////////////////////////

  /**
   * Sets the generated key ( pshId ) value.
   *
   * @param key The generated key value.
   */
  protected void generatedKey( final Integer key ) {
    this.pshId = key;
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
    return new DAOArgs( 1 ).arg( this.pshId );
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
      pshId,
      ( pshServiceCode == null ) ? null
                                 : ( ( pshServiceCode.length(  ) <= pshServiceCodeSize )
      ? pshServiceCode
      : pshServiceCode.substring( 0, pshServiceCodeSize ) // auto trimmed to fit, if required.
       ),
       ( pshServiceType == null ) ? null
                                 : ( ( pshServiceType.length(  ) <= pshServiceTypeSize )
      ? pshServiceType
      : pshServiceType.substring( 0, pshServiceTypeSize ) // auto trimmed to fit, if required.
       ), pshSubscriberId,
      ( pshSimNo == null ) ? null
                           : ( ( pshSimNo.length(  ) <= pshSimNoSize )
      ? pshSimNo
      : pshSimNo.substring( 0, pshSimNoSize ) // auto trimmed to fit, if required.
       ),
      ( pshMsisdnNo == null ) ? null
                              : ( ( pshMsisdnNo.length(  ) <= pshMsisdnNoSize )
      ? pshMsisdnNo
      : pshMsisdnNo.substring( 0, pshMsisdnNoSize ) // auto trimmed to fit, if required.
       ),
      ( pshArchived == null ) ? null
                              : ( ( pshArchived.length(  ) <= pshArchivedSize )
      ? pshArchived
      : pshArchived.substring( 0, pshArchivedSize ) // auto trimmed to fit, if required.
       )
    };
  }

  /**
   * DOCUMENT ME!
   *
   * @param fields DOCUMENT ME!
   */
  protected void set( final Object[] fields ) {
    pshId = (Integer) fields[0];
    pshServiceCode = rtrim( (String) fields[1] );
    pshServiceType = rtrim( (String) fields[2] );
    pshSubscriberId = (Integer) fields[3];
    pshSimNo = rtrim( (String) fields[4] );
    pshMsisdnNo = rtrim( (String) fields[5] );
    pshArchived = rtrim( (String) fields[6] );
  }

  // Get methods ///////////////////////////////////////////////////////////////
  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public Integer getPshId(  ) {
    return pshId;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getPshServiceCode(  ) {
    return pshServiceCode;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public Integer getPshSubscriberId(  ) {
    return pshSubscriberId;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getPshSimNo(  ) {
    return pshSimNo;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getPshMsisdnNo(  ) {
    return pshMsisdnNo;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getPshArchived(  ) {
    return pshArchived;
  }

  // Setter methods ///////////////////////////////////////////////////////////////

  //
  // Master setter follows...
  //

  /**
   * Setter that takes all attributes
   */
  public void set( 
    final Integer pshId,
    final String  pshServiceCode,
    final String pshServiceType,
    final Integer pshSubscriberId,
    final String  pshSimNo,
    final String  pshMsisdnNo,
    final String  pshArchived ) {
    this.pshId = pshId;
    this.pshServiceCode = pshServiceCode;
    this.pshServiceType = pshServiceType;
    this.pshSubscriberId = pshSubscriberId;
    this.pshSimNo = pshSimNo;
    this.pshMsisdnNo = pshMsisdnNo;
    this.pshArchived = pshArchived;
  }

  //
  // Public access modifiers if any
  // (provided for attributes that are public in the analysis model)
  //    

  /**
  * Sets the PshId field.
  *
  * @param pshId
  */
  public void setPshId( final Integer pshId ) {
    this.pshId = pshId;
  }

  /**
  * Sets the PshServiceCode field.
  *
  * @param pshServiceCode
  */
  public void setPshServiceCode( final String pshServiceCode ) {
    this.pshServiceCode = getPadded(pshServiceCode, pshServiceCodeFilter);
  }

  /**
  * Sets the PshSubscriberId field.
  *
  * @param pshSubscriberId
  */
  public void setPshSubscriberId( final Integer pshSubscriberId ) {
    this.pshSubscriberId = pshSubscriberId;
  }

  /**
  * Sets the PshSimNo field.
  *
  * @param pshSimNo
  */
  public void setPshSimNo( final String pshSimNo ) {
    this.pshSimNo = getPadded(pshSimNo, pshSimNoFilter);
  }

  /**
  * Sets the PshMsisdnNo field.
  *
  * @param pshMsisdnNo
  */
  public void setPshMsisdnNo( final String pshMsisdnNo ) {
    this.pshMsisdnNo = getPadded(pshMsisdnNo, pshMsisdnNoFilter);
  }

  /**
  * Sets the PshArchived field.
  *
  * @param pshArchived
  */
  public void setPshArchived( final String pshArchived ) {
    this.pshArchived = getPadded(pshArchived, pshArchivedFilter);
  }

public String getPshServiceType() {
	return pshServiceType;
}

public void setPshServiceType(String pshServiceType) {
	this.pshServiceType = getPadded(pshServiceType, pshServiceTypeFilter);
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
