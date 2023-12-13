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


public class AneApnNonEppixDMO
  extends DBO
  implements Serializable {
  //~ Static variables/initializers //////////////////////////////////////////

  /**
   * Defines the internal behaviour of the fields so the internal layers can manipulate them without
   * needing to introspect them.
   * The order of the fields in the definition must match the actual order in this DMO.
   */
  private static final int[] fieldTypes = new int[] {
      FIELD_TYPE_STRING, 
      FIELD_TYPE_STRING,
      FIELD_TYPE_DATEONLY,
      FIELD_TYPE_DATEONLY
    };
  
  /**
  * TODO SJ Implement the array of field sizes
  *
  */
  private final int[] fieldSizes = new int[] {
		 aneApnIdSize,	aneMsisdnSize, 0, 0};
      

  public int[] fieldSizes() {
  	return fieldSizes;
  }  

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int aneApnIdFilter = 0; // filter index
  private static final int aneApnIdSize = 15; // field size
  
  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int aneMsisdnFilter = 1; // filter index
  private static final int aneMsisdnSize = 15; // field size
  
  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int aneActDateFilter = 2; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int aneDeactDateFilter = 3; // filter index

  //~ Instance variables /////////////////////////////////////////////////////

  //---------------------
  // Field declarations
  //---------------------
  // all attributes
  private String aneApnId; 
  private String aneMsisdn; 
  private Date aneActDate;
  private Date aneDeactDate;

  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new PsdParamServDetDMO object.
   */
  public AneApnNonEppixDMO(  ) {
  }

  // Constructor - taking public attributes

  public AneApnNonEppixDMO( 
    final String aneApnId,
    final String   aneMsisdn,
    final Date  aneActDate,
    final Date aneDeactDate) {
	  this.aneApnId = aneApnId;
	  this.aneMsisdn = aneMsisdn;
	  this.aneActDate = (aneActDate != null)? new Date(aneActDate): null;
	  this.aneDeactDate = (aneDeactDate != null)? new Date(aneDeactDate): null;
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
    //return new DAOArgs( 1 ).arg( this.aneApnId );
	  return null;
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
      (aneApnId == null)?null : (aneApnId.length() <= aneApnIdSize)? aneApnId: 
    	  aneApnId.substring(0, aneApnIdSize), 
      (aneMsisdn == null)?null : (aneMsisdn.length() <= aneMsisdnSize)? aneMsisdn: 
    	  aneMsisdn.substring(0, aneMsisdnSize), 
      
      (aneActDate == null ) ? null : new Date(aneActDate),
      (aneDeactDate == null ) ? null : new Date(aneDeactDate)
    };
  }

  /**
   * DOCUMENT ME!
   *
   * @param fields DOCUMENT ME!
   */
  protected void set( final Object[] fields ) {
	  aneApnId = rtrim((String)fields[0]);
	  aneMsisdn = rtrim((String)fields[1]);
	  aneActDate = (Date)fields[2];
	  aneDeactDate = (Date)fields[3];
  }


  /**
   * Setter that takes all attributes
   */
  public void set( 
    final String aneApnId,
    final String   aneMsisdn,
    final Date  aneActDate,
    final Date aneDeactDate) {
    this.aneApnId = aneApnId;
    this.aneMsisdn = aneMsisdn;
    this.aneActDate = aneActDate;
    this.aneDeactDate = aneDeactDate;
  }

public Date getAneActDate() {
	return aneActDate;
}

public void setAneActDate(Date aneActDate) {
	this.aneActDate = aneActDate;
}

public String getAneApnId() {
	return aneApnId;
}

public void setAneApnId(String aneApnId) {
	this.aneApnId = getPadded(aneApnId, aneApnIdFilter); 
}

public Date getAneDeactDate() {
	return aneDeactDate;
}

public void setAneDeactDate(Date aneDeactDate) {
	this.aneDeactDate = aneDeactDate;
}

public String getAneMsisdn() {
	return aneMsisdn;
}

public void setAneMsisdn(String aneMsisdn) {
	this.aneMsisdn = getPadded(aneMsisdn, aneMsisdnFilter);
}

}
