/* ====================================================================== *
 * (c) Copyright Eppixcomm Tech Ltd.                                      *
 * All Rights Reserved                                                    *
 *                                                                        *
 * Legal Information                                                      *
 * ====================================================================== */
package com.eppixcomm.eppix.common.data;

/**
 * @author $Author$
 * @version $Revision: 1.1 $
 * 
 * @since $jdk$
 */
public class TempIdDBO extends DBO {

  // Field types
  private static int[] fieldTypes = new int[] { FIELD_TYPE_STRING // tempId
  };

  private String tempId;

  // Constructors //////////////////////////////////////////////////////////////

  public TempIdDBO() {
  }

  public TempIdDBO(String tempId) {
    this.tempId = tempId;
  }

  // DMO method implementations ////////////////////////////////////////////////

  protected DAOArgs primaryKey() {
    return new DAOArgs(1).arg(tempId);
  }

  protected int[] fieldTypes() {
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


  protected void set(Object[] fields) {
    tempId = (String) fields[0];
  }

  // DBO method implementations ////////////////////////////////////////////////

  protected void generatedKey(Integer key) {
  }

  protected Integer versionNumber() {
    return null;
  }

  protected void versionNumber(Integer versionNumber) {
  }

  protected Object[] get() {
    return new Object[] { tempId };
  }

  // Get/Set methods ///////////////////////////////////////////////////////////

  public String getTempId() {
    return tempId;
  }

  public void setTempId(String tempId) {
    this.tempId = tempId;
  }
}