/* ====================================================================== *
 * (c) Copyright Eppixcomm Tech Ltd.                                      *
 * All Rights Reserved                                                    *
 *                                                                        *
 * Legal Information                                                      *
 * ====================================================================== */
package com.eppixcomm.eppix.common.data;

public class IntegerDMO
  extends DMO {
  private static int[] fieldTypes = new int[] {
      FIELD_TYPE_INTEGER // intValue  
    };
  private Integer intValue;

  //Constructors ///////////////////////////////////////////////////////////////
  public IntegerDMO() {}
  
  public IntegerDMO( Integer intValue ) {
    this.intValue = intValue;
  }

  // DMO method implementations ////////////////////////////////////////////////
  protected DAOArgs primaryKey(  ) {
    return new DAOArgs( 1 ).arg( intValue );
  }

  protected int[] fieldTypes(  ) {
    return fieldTypes;
  }
  
  /**
  * TODO SJ Implement the array of field sizes
  *
  */
  private final int[] fieldSizes = new int[] {

  };


  public int[] fieldSizes() {
  return fieldSizes;
  }    


  protected Object[] get(  ) {
    return new Object[] {
      intValue
    };
  }

  protected void set( Object[] fields ) {
    intValue = (Integer) fields[0];
  }

  // get/set methods ///////////////////////////////////////////////////////////
  public Integer getIntValue(  ) {
    return intValue;
  }

  public void setIntValue( Integer intValue ) {
    this.intValue = intValue;
  }
}