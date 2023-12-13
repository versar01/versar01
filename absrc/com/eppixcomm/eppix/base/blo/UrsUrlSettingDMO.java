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




public class UrsUrlSettingDMO extends DBO implements Serializable {

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

      FIELD_TYPE_STRING /* std public attribute: ursUrlCode  */,

      FIELD_TYPE_STRING /* std public attribute: ursValue  */,

      FIELD_TYPE_STRING /* std public attribute: ursComment  */,

      FIELD_TYPE_DATETIME /* std public attribute: ursTimestamp  */

    };


 private final int[] fieldSizes = new int[] {

		 ursUrlCodeSize,

		 ursValueSize,

		 ursCommentSize,

		 0

  };



  public int[] fieldSizes() {

  	return fieldSizes;

  }


  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */

  public static final int ursUrlCodeFilter = 0; // filter index

  private static final int ursUrlCodeSize = 10; // field size


  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */

  public static final int ursValueFilter = 1; // filter index

  private static final int ursValueSize = 200; // field size


  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */

  public static final int ursCommentFilter = 2; // filter index

  private static final int ursCommentSize = 240; // field size


  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */

  public static final int ursTimestampFilter = 3; // filter index


  //~ Instance variables /////////////////////////////////////////////////////


  private DateTime ursTimestamp; // Loaded from Schema

  private String ursComment; // Loaded from Schema


  //---------------------

  // Field declarations

  //---------------------

  // all attributes

  private String ursUrlCode; // Loaded from Schema

  private String ursValue; // Loaded from Schema


  //~ Constructors ///////////////////////////////////////////////////////////


  /**

   * Creates a new UrsKeySettingDMO object.

   */

  public UrsUrlSettingDMO(  ) {

  }


  // Constructor - taking public attributes

  /**

   * Creates a new UrsKeySettingDMO object.

   *

   * @param ursUrlCode DOCUMENT ME!

   * @param ursValue DOCUMENT ME!

   * @param ursComment DOCUMENT ME!

   * @param ursTimestamp DOCUMENT ME!

   */

  public UrsUrlSettingDMO(

    final String   ursUrlCode,

    final String   ursValue,

    final String   ursComment,

    final DateTime ursTimestamp ) {

    this.ursUrlCode = ursUrlCode;


    this.ursValue = ursValue;


    this.ursComment = ursComment;


    this.ursTimestamp = ( ursTimestamp != null )

      ? new DateTime( ursTimestamp ) : null;

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

    return new DAOArgs( 1 ).arg( ( this.ursUrlCode == null ) ? null

                                                             : this.ursUrlCode

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

      ( ursUrlCode == null ) ? null

                             : ( ( ursUrlCode.length(  ) <= ursUrlCodeSize )

      ? ursUrlCode

      : ursUrlCode.substring( 0, ursUrlCodeSize ) // auto trimmed to fit, if required.

       ),

      ( ursValue == null ) ? null

                           : ( ( ursValue.length(  ) <= ursValueSize )

      ? ursValue

      : ursValue.substring( 0, ursValueSize ) // auto trimmed to fit, if required.

       ),

      ( ursComment == null ) ? null

                             : ( ( ursComment.length(  ) <= ursCommentSize )

      ? ursComment

      : ursComment.substring( 0, ursCommentSize ) // auto trimmed to fit, if required.

       ), ursTimestamp

    };

  }


  /**

   * DOCUMENT ME!

   *

   * @param fields DOCUMENT ME!

   */

  protected void set( final Object[] fields ) {

    ursUrlCode = rtrim( (String) fields[0] );

    ursValue = rtrim( (String) fields[1] );

    ursComment = rtrim( (String) fields[2] );

    ursTimestamp = (DateTime) fields[3];

  }


  // Get methods ///////////////////////////////////////////////////////////////

  /**

   * DOCUMENT ME!

   *

   * @return DOCUMENT ME!

   */

  public String getUrsUrlCode(  ) {

    return ursUrlCode;

  }


  /**

   * DOCUMENT ME!

   *

   * @return DOCUMENT ME!

   */

  public String getUrsValue(  ) {

    return ursValue;

  }


  /**

   * DOCUMENT ME!

   *

   * @return DOCUMENT ME!

   */

  public String getUrsComment(  ) {

    return ursComment;

  }


  /**

   * DOCUMENT ME!

   *

   * @return DOCUMENT ME!

   */

  public DateTime getUrsTimestamp(  ) {

    return ( ursTimestamp != null ) ? new DateTime( ursTimestamp ) : null;

  }


  // Setter methods ///////////////////////////////////////////////////////////////


  //

  // Master setter follows...

  //


  /**

   * Setter that takes all attributes

   */

  public void set(

    final String   ursUrlCode,

    final String   ursValue,

    final String   ursComment,

    final DateTime ursTimestamp ) {

    this.ursUrlCode = ursUrlCode;

    this.ursValue = ursValue;

    this.ursComment = ursComment;

    this.ursTimestamp = ( ursTimestamp != null )

      ? new DateTime( ursTimestamp ) : null;

  }


  //

  // Public access modifiers if any

  // (provided for attributes that are public in the analysis model)

  //


  /**

  * Sets the UrsUrlCode field.

  *

  * @param ursUrlCode

  */

  public void setUrsUrlCode( final String ursUrlCode ) {

    this.ursUrlCode = getPadded(ursUrlCode, ursUrlCodeFilter);

  }


  /**

  * Sets the UrsValue field.

  *

  * @param ursValue

  */

  public void setUrsValue( final String ursValue ) {

    this.ursValue = getPadded(ursValue, ursValueFilter);

  }


  /**

  * Sets the UrsComment field.

  *

  * @param ursComment

  */

  public void setUrsComment( final String ursComment ) {

    this.ursComment = getPadded(ursComment, ursCommentFilter);

  }


  /**

  * Sets the UrsTimestamp field.

  *

  * @param ursTimestamp

  */

  public void setUrsTimestamp( final DateTime ursTimestamp ) {

    this.ursTimestamp = ( ursTimestamp != null )

      ? new DateTime( ursTimestamp ) : null;

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
