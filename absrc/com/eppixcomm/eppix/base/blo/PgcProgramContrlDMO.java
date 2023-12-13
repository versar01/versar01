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
 * A value object to carry the data for a PgcProgramContrl.
 *
 *
 * <H3> A PgcProgramContrl is: </H3>
 *
 * <!-- indent text -->
 * <TABLE BORDER="0" CELLPADDING="0" CELLSPACING="0">
 * <TR>
 * <TD WIDTH="25">&nbsp;</TD>
 * <TD>
 *
 * This table allows links to be set up between programs and other programs which it is dependent on.
 * <p>
 *   A program, such as the billing run, can then interrogate this table to retrieve a list of programs whose status it will
 *   need to check.
 * </p>
 *
 * <!-- end indent text -->
 * </TD>
 * </TR>
 * </TABLE>
 *
 *
 * <H3> PgcProgramContrl Value Object: </H3>
 *
 * <!-- indent text -->
 * <TABLE BORDER="0" CELLPADDING="0" CELLSPACING="0">
 * <TR>
 * <TD WIDTH="25">&nbsp;</TD>
 * <TD>
 *
 * <P>
 *     This is a value object (called a Data Model Object or 'DMO').
 *     It is used to pass the data for a pgcProgramContrl into and out of the BASE module.
 *     Because it's purpose is to carry data into and out of the module it is visible outside the module.
 * </P>
 * <P>
 *     This value object carries the data for one pgcProgramContrl. A pgcProgramContrl is:
 * This table allows links to be set up between programs and other programs which it is dependent on.
 * </P>
 * <P>
 *     It corresponds to the business logic object PgcProgramContrl which
 *     contains all the business behaviour of a pgcProgramContrl but is not visible outside the
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
 *    This value object contains fields for all the details of a pgcProgramContrl, namely:
 * </P>
 *


 * <P>
 *    <U>Fields to carry the Attributes of a pgcProgramContrl:</U>
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
 *   <TD ALIGN="left" VALIGN="top"><B>pgcProgramId</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Program identifier, eg.
 *       <p>
 *         "BILLING_RUN"
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
 *       <A HREF="#getPgcProgramId()">
 *           getPgcProgramId
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setPgcProgramId(java.lang.String)">
 *           setPgcProgramId (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>pgcDependencyId</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Identifier for program/batch affecting the ability to run program identified in pgc_program_id.
 *       <p>
 *         eg, "FAFF_BATCH"
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
 *       <A HREF="#getPgcDependencyId()">
 *           getPgcDependencyId
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setPgcDependencyId(java.lang.String)">
 *           setPgcDependencyId (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>pgcCycle</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       The cycle identifier for the dependency.
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
 *       <A HREF="#getPgcCycle()">
 *           getPgcCycle
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setPgcCycle(java.lang.String)">
 *           setPgcCycle (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>pgcResetFlag</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       C - Check status and reset, eg.
 *       <p>
 *         it may be that if the program failed and some action must occur before the status is reset R - Reset status regardless
 *         of status N - Do not update the status of the dependency.
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
 *       <A HREF="#getPgcResetFlag()">
 *           getPgcResetFlag
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setPgcResetFlag(java.lang.String)">
 *           setPgcResetFlag (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>pgcPriority</B></TD>
 *   <TD ALIGN="left" VALIGN="top">Short</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Identifies the priority of the dependency.
 *       <p>
 *         For the billing run it is suggested that these are: 1 - Check immediately. 2 - Check after the cycle details are
 *         entered (or after all system keys etc. are checked for background billing run).
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
 *       <A HREF="#getPgcPriority()">
 *           getPgcPriority
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setPgcPriority(java.lang.Short)">
 *           setPgcPriority (Short)
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


 * @see PgcProgramContrl
 *
 * @author
 * @version $Revision: $
 *
 * @since $jdk$
 */
public class PgcProgramContrlDMO
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
      FIELD_TYPE_STRING /* std public attribute: pgcProgramId  */,
      FIELD_TYPE_STRING /* std public attribute: pgcDependencyId  */,
      FIELD_TYPE_STRING /* std public attribute: pgcCycle  */,
      FIELD_TYPE_STRING /* std public attribute: pgcResetFlag  */,
      FIELD_TYPE_SHORT /* std public attribute: pgcPriority  */
    };

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int pgcProgramIdFilter = 0; // filter index
  private static final int pgcProgramIdSize = 15; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int pgcDependencyIdFilter = 1; // filter index
  private static final int pgcDependencyIdSize = 15; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int pgcCycleFilter = 2; // filter index
  private static final int pgcCycleSize = 5; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int pgcResetFlagFilter = 3; // filter index
  private static final int pgcResetFlagSize = 1; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int pgcPriorityFilter = 4; // filter index

  //~ Instance variables /////////////////////////////////////////////////////

  private Short pgcPriority; // Loaded from Schema
  private String pgcCycle; // Loaded from Schema
  private String pgcDependencyId; // Loaded from Schema

  //---------------------
  // Field declarations
  //---------------------
  // all attributes
  private String pgcProgramId; // Loaded from Schema
  private String pgcResetFlag; // Loaded from Schema

  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new PgcProgramContrlDMO object.
   */
  public PgcProgramContrlDMO(  ) {
  }

  // Constructor - taking public attributes
  /**
   * Creates a new PgcProgramContrlDMO object.
   *
   * @param pgcProgramId DOCUMENT ME!
   * @param pgcDependencyId DOCUMENT ME!
   * @param pgcCycle DOCUMENT ME!
   * @param pgcResetFlag DOCUMENT ME!
   * @param pgcPriority DOCUMENT ME!
   */
  public PgcProgramContrlDMO( 
    final String pgcProgramId,
    final String pgcDependencyId,
    final String pgcCycle,
    final String pgcResetFlag,
    final Short  pgcPriority ) {
    this.pgcProgramId = pgcProgramId;

    this.pgcDependencyId = pgcDependencyId;

    this.pgcCycle = pgcCycle;

    this.pgcResetFlag = pgcResetFlag;

    this.pgcPriority = pgcPriority;
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
    return new DAOArgs( 3 ).arg( ( this.pgcProgramId == null ) ? null
                                                               : this.pgcProgramId
      .trim(  ) )
                           .arg( ( this.pgcDependencyId == null ) ? null
                                                                  : this.pgcDependencyId
      .trim(  ) )
                           .arg( ( this.pgcCycle == null ) ? null
                                                           : this.pgcCycle
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
      ( pgcProgramId == null ) ? null
                               : ( ( pgcProgramId.length(  ) <= pgcProgramIdSize )
      ? pgcProgramId
      : pgcProgramId.substring( 0, pgcProgramIdSize ) // auto trimmed to fit, if required.
       ),
      ( pgcDependencyId == null ) ? null
                                  : ( ( pgcDependencyId.length(  ) <= pgcDependencyIdSize )
      ? pgcDependencyId
      : pgcDependencyId.substring( 0, pgcDependencyIdSize ) // auto trimmed to fit, if required.
       ),
      ( pgcCycle == null ) ? null
                           : ( ( pgcCycle.length(  ) <= pgcCycleSize )
      ? pgcCycle
      : pgcCycle.substring( 0, pgcCycleSize ) // auto trimmed to fit, if required.
       ),
      ( pgcResetFlag == null ) ? null
                               : ( ( pgcResetFlag.length(  ) <= pgcResetFlagSize )
      ? pgcResetFlag
      : pgcResetFlag.substring( 0, pgcResetFlagSize ) // auto trimmed to fit, if required.
       ), pgcPriority
    };
  }

  /**
   * DOCUMENT ME!
   *
   * @param fields DOCUMENT ME!
   */
  protected void set( final Object[] fields ) {
    pgcProgramId = rtrim( (String) fields[0] );
    pgcDependencyId = rtrim( (String) fields[1] );
    pgcCycle = rtrim( (String) fields[2] );
    pgcResetFlag = rtrim( (String) fields[3] );
    pgcPriority = (Short) fields[4];
  }

  // Get methods ///////////////////////////////////////////////////////////////
  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getPgcProgramId(  ) {
    return pgcProgramId;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getPgcDependencyId(  ) {
    return pgcDependencyId;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getPgcCycle(  ) {
    return pgcCycle;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getPgcResetFlag(  ) {
    return pgcResetFlag;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public Short getPgcPriority(  ) {
    return pgcPriority;
  }

  // Setter methods ///////////////////////////////////////////////////////////////

  //
  // Master setter follows...
  //

  /**
   * Setter that takes all attributes
   */
  public void set( 
    final String pgcProgramId,
    final String pgcDependencyId,
    final String pgcCycle,
    final String pgcResetFlag,
    final Short  pgcPriority ) {
    this.pgcProgramId = pgcProgramId;
    this.pgcDependencyId = pgcDependencyId;
    this.pgcCycle = pgcCycle;
    this.pgcResetFlag = pgcResetFlag;
    this.pgcPriority = pgcPriority;
  }

  //
  // Public access modifiers if any
  // (provided for attributes that are public in the analysis model)
  //    

  /**
  * Sets the PgcProgramId field.
  *
  * @param pgcProgramId
  */
  public void setPgcProgramId( final String pgcProgramId ) {
    this.pgcProgramId = pgcProgramId;
  }

  /**
  * Sets the PgcDependencyId field.
  *
  * @param pgcDependencyId
  */
  public void setPgcDependencyId( final String pgcDependencyId ) {
    this.pgcDependencyId = pgcDependencyId;
  }

  /**
  * Sets the PgcCycle field.
  *
  * @param pgcCycle
  */
  public void setPgcCycle( final String pgcCycle ) {
    this.pgcCycle = pgcCycle;
  }

  /**
  * Sets the PgcResetFlag field.
  *
  * @param pgcResetFlag
  */
  public void setPgcResetFlag( final String pgcResetFlag ) {
    this.pgcResetFlag = pgcResetFlag;
  }

  /**
  * Sets the PgcPriority field.
  *
  * @param pgcPriority
  */
  public void setPgcPriority( final Short pgcPriority ) {
    this.pgcPriority = pgcPriority;
  }

  /**
  * Sets the PgcPriority field.
  *
  * @param pgcPriority
  */
  public void setPgcPriority( final int pgcPriority ) {
    this.pgcPriority = Short.valueOf( (short) pgcPriority );
  }

  protected static final int[] fieldSizes = new int[]{
	  pgcProgramIdSize,
	  pgcDependencyIdSize,
	  pgcCycleSize,
	  pgcResetFlagSize,
	  0
  };
  
  
	protected int[] fieldSizes() {
		return fieldSizes;
	}
   
}
