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
 * A value object to carry the data for a PgsProgramStatus.
 *
 *
 * <H3> A PgsProgramStatus is: </H3>
 *
 * <!-- indent text -->
 * <TABLE BORDER="0" CELLPADDING="0" CELLSPACING="0">
 * <TR>
 * <TD WIDTH="25">&nbsp;</TD>
 * <TD>
 *
 * This is used in conjunction with the pgc_program_contrl table to determine the current status of a program.
 *
 * <!-- end indent text -->
 * </TD>
 * </TR>
 * </TABLE>
 *
 *
 * <H3> PgsProgramStatus Value Object: </H3>
 *
 * <!-- indent text -->
 * <TABLE BORDER="0" CELLPADDING="0" CELLSPACING="0">
 * <TR>
 * <TD WIDTH="25">&nbsp;</TD>
 * <TD>
 *
 * <P>
 *     This is a value object (called a Data Model Object or 'DMO').
 *     It is used to pass the data for a pgsProgramStatus into and out of the BASE module.
 *     Because it's purpose is to carry data into and out of the module it is visible outside the module.
 * </P>
 * <P>
 *     This value object carries the data for one pgsProgramStatus. A pgsProgramStatus is:
 * This is used in conjunction with the pgc_program_contrl table to determine the current status of a program.
 * </P>
 * <P>
 *     It corresponds to the business logic object PgsProgramStatus which
 *     contains all the business behaviour of a pgsProgramStatus but is not visible outside the
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
 *    This value object contains fields for all the details of a pgsProgramStatus, namely:
 * </P>
 *


 * <P>
 *    <U>Fields to carry the Attributes of a pgsProgramStatus:</U>
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
 *   <TD ALIGN="left" VALIGN="top"><B>pgsProgramId</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Program/batch routine identifier, eg.
 *       <p>
 *         "FAFF_BATCH". Links pgc_dependency_id on the pgc_program_control table.
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
 *       <A HREF="#getPgsProgramId()">
 *           getPgsProgramId
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setPgsProgramId(java.lang.String)">
 *           setPgsProgramId (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>pgsCycle</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       The cycle identifier for the program/batch routine.
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
 *       <A HREF="#getPgsCycle()">
 *           getPgsCycle
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setPgsCycle(java.lang.String)">
 *           setPgsCycle (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>pgsDescription</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Description of dependency, eg "Free airtime/Friends & Family batch run for cycle BCYC1"
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
 *       <A HREF="#getPgsDescription()">
 *           getPgsDescription
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setPgsDescription(java.lang.String)">
 *           setPgsDescription (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>pgsStatus</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Status of dependency: IDLE - Not yet run RUNNING - identifies that the program is in progress.
 *       <p>
 *         SUCCESS - program/batch finished successfully ERROR - program/batch finished with an error
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
 *       <A HREF="#getPgsStatus()">
 *           getPgsStatus
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setPgsStatus(java.lang.String)">
 *           setPgsStatus (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>pgsStatusValue</B></TD>
 *   <TD ALIGN="left" VALIGN="top">Short</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Informix status value - the number assigned by Informix for an error.
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
 *       <A HREF="#getPgsStatusValue()">
 *           getPgsStatusValue
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setPgsStatusValue(java.lang.Short)">
 *           setPgsStatusValue (Short)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>pgsStatusClass</B></TD>
 *   <TD ALIGN="left" VALIGN="top">Short</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Identifies the severity of the error: 0 - Success -ve - Failed (-30 is an error trapped by informix; -40 is an error trapped by E4W etc.
 *       <p>
 *         ) 100 - Record not found.
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
 *       <A HREF="#getPgsStatusClass()">
 *           getPgsStatusClass
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setPgsStatusClass(java.lang.Short)">
 *           setPgsStatusClass (Short)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>pgsIsamValue</B></TD>
 *   <TD ALIGN="left" VALIGN="top">Short</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       ISAM value assigned by Informix.
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
 *       <A HREF="#getPgsIsamValue()">
 *           getPgsIsamValue
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setPgsIsamValue(java.lang.Short)">
 *           setPgsIsamValue (Short)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>pgsErrorMess</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Error description and function tree.
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
 *       <A HREF="#getPgsErrorMess()">
 *           getPgsErrorMess
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setPgsErrorMess(java.lang.String)">
 *           setPgsErrorMess (String)
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


 * @see PgsProgramStatus
 *
 * @author
 * @version $Revision: $
 *
 * @since $jdk$
 */
public class PgsProgramStatusDMO
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
      FIELD_TYPE_STRING /* std public attribute: pgsProgramId  */,
      FIELD_TYPE_STRING /* std public attribute: pgsCycle  */,
      FIELD_TYPE_STRING /* std public attribute: pgsDescription  */,
      FIELD_TYPE_STRING /* std public attribute: pgsStatus  */,
      FIELD_TYPE_SHORT /* std public attribute: pgsStatusValue  */,
      FIELD_TYPE_SHORT /* std public attribute: pgsStatusClass  */,
      FIELD_TYPE_SHORT /* std public attribute: pgsIsamValue  */,
      FIELD_TYPE_STRING /* std public attribute: pgsErrorMess  */
    };

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int pgsProgramIdFilter = 0; // filter index
  private static final int pgsProgramIdSize = 15; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int pgsCycleFilter = 1; // filter index
  private static final int pgsCycleSize = 5; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int pgsDescriptionFilter = 2; // filter index
  private static final int pgsDescriptionSize = 60; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int pgsStatusFilter = 3; // filter index
  private static final int pgsStatusSize = 15; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int pgsStatusValueFilter = 4; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int pgsStatusClassFilter = 5; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int pgsIsamValueFilter = 6; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int pgsErrorMessFilter = 7; // filter index
  private static final int pgsErrorMessSize = 120; // field size

  //~ Instance variables /////////////////////////////////////////////////////

  private Short pgsIsamValue; // Loaded from Schema
  private Short pgsStatusClass; // Loaded from Schema
  private Short pgsStatusValue; // Loaded from Schema
  private String pgsCycle; // Loaded from Schema
  private String pgsDescription; // Loaded from Schema
  private String pgsErrorMess; // Loaded from Schema

  //---------------------
  // Field declarations
  //---------------------
  // all attributes
  private String pgsProgramId; // Loaded from Schema
  private String pgsStatus; // Loaded from Schema

  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new PgsProgramStatusDMO object.
   */
  public PgsProgramStatusDMO(  ) {
  }

  // Constructor - taking public attributes
  /**
   * Creates a new PgsProgramStatusDMO object.
   *
   * @param pgsProgramId DOCUMENT ME!
   * @param pgsCycle DOCUMENT ME!
   * @param pgsDescription DOCUMENT ME!
   * @param pgsStatus DOCUMENT ME!
   * @param pgsStatusValue DOCUMENT ME!
   * @param pgsStatusClass DOCUMENT ME!
   * @param pgsIsamValue DOCUMENT ME!
   * @param pgsErrorMess DOCUMENT ME!
   */
  public PgsProgramStatusDMO( 
    final String pgsProgramId,
    final String pgsCycle,
    final String pgsDescription,
    final String pgsStatus,
    final Short  pgsStatusValue,
    final Short  pgsStatusClass,
    final Short  pgsIsamValue,
    final String pgsErrorMess ) {
    this.pgsProgramId = pgsProgramId;

    this.pgsCycle = pgsCycle;

    this.pgsDescription = pgsDescription;

    this.pgsStatus = pgsStatus;

    this.pgsStatusValue = pgsStatusValue;

    this.pgsStatusClass = pgsStatusClass;

    this.pgsIsamValue = pgsIsamValue;

    this.pgsErrorMess = pgsErrorMess;
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
    return new DAOArgs( 2 ).arg( ( this.pgsProgramId == null ) ? null
                                                               : this.pgsProgramId
      .trim(  ) )
                           .arg( ( this.pgsCycle == null ) ? null
                                                           : this.pgsCycle
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
      ( pgsProgramId == null ) ? null
                               : ( ( pgsProgramId.length(  ) <= pgsProgramIdSize )
      ? pgsProgramId
      : pgsProgramId.substring( 0, pgsProgramIdSize ) // auto trimmed to fit, if required.
       ),
      ( pgsCycle == null ) ? null
                           : ( ( pgsCycle.length(  ) <= pgsCycleSize )
      ? pgsCycle
      : pgsCycle.substring( 0, pgsCycleSize ) // auto trimmed to fit, if required.
       ),
      ( pgsDescription == null ) ? null
                                 : ( ( pgsDescription.length(  ) <= pgsDescriptionSize )
      ? pgsDescription
      : pgsDescription.substring( 0, pgsDescriptionSize ) // auto trimmed to fit, if required.
       ),
      ( pgsStatus == null ) ? null
                            : ( ( pgsStatus.length(  ) <= pgsStatusSize )
      ? pgsStatus
      : pgsStatus.substring( 0, pgsStatusSize ) // auto trimmed to fit, if required.
       ), pgsStatusValue, pgsStatusClass, pgsIsamValue,
      ( pgsErrorMess == null ) ? null
                               : ( ( pgsErrorMess.length(  ) <= pgsErrorMessSize )
      ? pgsErrorMess
      : pgsErrorMess.substring( 0, pgsErrorMessSize ) // auto trimmed to fit, if required.
       )
    };
  }

  /**
   * DOCUMENT ME!
   *
   * @param fields DOCUMENT ME!
   */
  protected void set( final Object[] fields ) {
    pgsProgramId = rtrim( (String) fields[0] );
    pgsCycle = rtrim( (String) fields[1] );
    pgsDescription = rtrim( (String) fields[2] );
    pgsStatus = rtrim( (String) fields[3] );
    pgsStatusValue = (Short) fields[4];
    pgsStatusClass = (Short) fields[5];
    pgsIsamValue = (Short) fields[6];
    pgsErrorMess = rtrim( (String) fields[7] );
  }

  // Get methods ///////////////////////////////////////////////////////////////
  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getPgsProgramId(  ) {
    return pgsProgramId;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getPgsCycle(  ) {
    return pgsCycle;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getPgsDescription(  ) {
    return pgsDescription;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getPgsStatus(  ) {
    return pgsStatus;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public Short getPgsStatusValue(  ) {
    return pgsStatusValue;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public Short getPgsStatusClass(  ) {
    return pgsStatusClass;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public Short getPgsIsamValue(  ) {
    return pgsIsamValue;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getPgsErrorMess(  ) {
    return pgsErrorMess;
  }

  /**
   * Setter that takes all attributes
   */
  public void set( 
    final String pgsProgramId,
    final String pgsCycle,
    final String pgsDescription,
    final String pgsStatus,
    final Short  pgsStatusValue,
    final Short  pgsStatusClass,
    final Short  pgsIsamValue,
    final String pgsErrorMess ) {
    this.pgsProgramId = pgsProgramId;
    this.pgsCycle = pgsCycle;
    this.pgsDescription = pgsDescription;
    this.pgsStatus = pgsStatus;
    this.pgsStatusValue = pgsStatusValue;
    this.pgsStatusClass = pgsStatusClass;
    this.pgsIsamValue = pgsIsamValue;
    this.pgsErrorMess = pgsErrorMess;
  }

  /**
  * Sets the PgsProgramId field.
  *
  * @param pgsProgramId
  */
  public void setPgsProgramId( final String pgsProgramId ) {
    this.pgsProgramId = pgsProgramId;
  }

  /**
  * Sets the PgsCycle field.
  *
  * @param pgsCycle
  */
  public void setPgsCycle( final String pgsCycle ) {
    this.pgsCycle = pgsCycle;
  }

  /**
  * Sets the PgsDescription field.
  *
  * @param pgsDescription
  */
  public void setPgsDescription( final String pgsDescription ) {
    this.pgsDescription = pgsDescription;
  }

  /**
  * Sets the PgsStatus field.
  *
  * @param pgsStatus
  */
  public void setPgsStatus( final String pgsStatus ) {
    this.pgsStatus = pgsStatus;
  }

  /**
  * Sets the PgsStatusValue field.
  *
  * @param pgsStatusValue
  */
  public void setPgsStatusValue( final Short pgsStatusValue ) {
    this.pgsStatusValue = pgsStatusValue;
  }

  /**
  * Sets the PgsStatusValue field.
  *
  * @param pgsStatusValue
  */
  public void setPgsStatusValue( final int pgsStatusValue ) {
    this.pgsStatusValue = Short.valueOf( (short) pgsStatusValue );
  }

  /**
  * Sets the PgsStatusClass field.
  *
  * @param pgsStatusClass
  */
  public void setPgsStatusClass( final Short pgsStatusClass ) {
    this.pgsStatusClass = pgsStatusClass;
  }

  /**
  * Sets the PgsStatusClass field.
  *
  * @param pgsStatusClass
  */
  public void setPgsStatusClass( final int pgsStatusClass ) {
    this.pgsStatusClass = Short.valueOf( (short) pgsStatusClass );
  }

  /**
  * Sets the PgsIsamValue field.
  *
  * @param pgsIsamValue
  */
  public void setPgsIsamValue( final Short pgsIsamValue ) {
    this.pgsIsamValue = pgsIsamValue;
  }

  /**
  * Sets the PgsIsamValue field.
  *
  * @param pgsIsamValue
  */
  public void setPgsIsamValue( final int pgsIsamValue ) {
    this.pgsIsamValue = Short.valueOf( (short) pgsIsamValue );
  }

  /**
  * Sets the PgsErrorMess field.
  *
  * @param pgsErrorMess
  */
  public void setPgsErrorMess( final String pgsErrorMess ) {
    this.pgsErrorMess = pgsErrorMess;
  }

  static int[] fieldSizes = new int[]{
	  pgsProgramIdSize,
	  pgsCycleSize,
	  pgsDescriptionSize,
	  pgsStatusSize,
	  0,
	  0,
	  0,
	  pgsErrorMessSize
	  };
  
protected int[] fieldSizes() {
	// TODO Auto-generated method stub
	return fieldSizes;
}
}
