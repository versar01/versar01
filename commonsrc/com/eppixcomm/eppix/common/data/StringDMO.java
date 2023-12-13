/* ====================================================================== *
 * (c) Copyright Eppixcomm Tech Ltd.                                      *
 * All Rights Reserved                                                    *
 *                                                                        *
 * Legal Information                                                      *
 * ====================================================================== */
package com.eppixcomm.eppix.common.data;

public class StringDMO
  extends DBO {
    
  private static int[] fieldTypes = new int[] {
      FIELD_TYPE_STRING // strValue  
    };
    
  private String string;

  //Constructors ///////////////////////////////////////////////////////////////
  public StringDMO() {}
  
  public StringDMO( String string ) {
    this.string = string;
  }

  // DMO method implementations ////////////////////////////////////////////////
  protected DAOArgs primaryKey(  ) {
    return new DAOArgs( 1 ).arg( string );
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
      string
    };
  }

  protected void set( Object[] fields ) {
    string = (String) fields[0];
  }
  
  // DBO method implementations ////////////////////////////////////////////////
  
  protected void generatedKey(Integer key) {
  }

  protected Integer versionNumber() {
    return null;
  }

  protected void versionNumber(Integer versionNumber) {
  }

  // get/set methods ///////////////////////////////////////////////////////////
  public String getString(  ) {
    return string;
  }

  public void setString( String string ) {
    this.string = string;
  }
}