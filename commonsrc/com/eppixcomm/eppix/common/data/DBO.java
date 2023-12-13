/* ====================================================================== *
 * (c) Copyright Eppixcomm Tech Ltd.                                      *
 * All Rights Reserved                                                    *
 *                                                                        *
 * Legal Information                                                      *
 * ====================================================================== */
package com.eppixcomm.eppix.common.data;

/**
 * Data Base Object
 *
 * @author $Author$
 * @version $Revision: 1.2 $
 * 
 * @since $jdk$
 * 
 * @hidden 
 */
public abstract class DBO
  extends DMO {
   
  /**
   * Creates a new DBO object
   */
  public DBO() {
  }
  
  /**
   * Provides the fields of the DBO as an array of objects used to write values
   * to the database.
   *
   * @return array of field objects.
   */
  abstract protected Object[] get();

  /**
   * Sets the DBO's generated key field
   *
   * @param key generated key value.
   */
  abstract protected void generatedKey( Integer key );

  /**
   * Gets the DBO's version number.
   *
   * @return version number.
   */
  abstract protected Integer versionNumber();

  /**
   * Sets the DBO's version number.
   *
   * @param versionNumber the version number
   */
  abstract protected void versionNumber( Integer versionNumber );

  /**
   * Instantiates a {@link DAOArgs} object that contains the DMO's fields.
   * This is used by the DAO to bind the fields to the placeholders in the
   * DML statement.
   *
   * @return fields.
   */
  protected DAOArgs fields() {
    return new DAOArgs( fieldTypes(),
                        get() );
  }

  /**
   * Initialises the DMO's version number.
   */
  protected void initVersion() {
    versionNumber( new Integer( 1 ) );
  }

  /**
   * Instantiates a {@link DAOArgs} object that contains the DMO's current
   * version number, the DMO's version number is then incremented by one.
   *
   * @return version.
   */
  protected DAOArgs nextVersion() {
    DAOArgs version = null;
    Integer versionNumber = versionNumber();

    if ( versionNumber != null ) {
      version = new DAOArgs( 1 ).arg( versionNumber );
      versionNumber( new Integer( versionNumber.intValue() + 1 ) );
    }

    return version;
  }
}