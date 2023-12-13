/* ====================================================================== *
 * (c) Copyright Eppixcomm Tech Ltd.                                      *
 * All Rights Reserved                                                    *
 *                                                                        *
 * Legal Information                                                      *
 * ====================================================================== */
package com.eppixcomm.eppix.common.data;

import java.util.Hashtable;

/**
 * Dispenser for generated keys.
 *
 * @version $Revision: 1.1 $
 * @author $Author$
 * @since $jdk$
 */
public class DMOKeyDispenser {
  /** Singleton values of the DMOKey dispenser. One per module. */
  private static Hashtable dispenserTable = new Hashtable();
  /** 3 character EPPIX module code */
  private String moduleCode;
  /** DMOKey cache table */
  private Hashtable keys;

  /**
   * Creates a new DMOKeyDispenser object.
   *
   * @param moduleCode 3 character EPPIX module code. (CRM, FIN, PAP, etc.)
   */
  private DMOKeyDispenser( String moduleCode ) {
    this.moduleCode = moduleCode;
    keys = new Hashtable();
  }

  /**
   * Returns the DMOKeyDispenser singleton.
   *
   * @param moduleCode 3 character EPPIX module code. (CRM, FIN, PAP, etc.)
   *
   * @return key dispenser object
   */
  public static synchronized DMOKeyDispenser getDispenser( String moduleCode ) {
    DMOKeyDispenser dispenser = (DMOKeyDispenser) dispenserTable.get(
                                      moduleCode );

    if ( dispenser == null ) {
      dispenser = new DMOKeyDispenser( moduleCode );
      dispenserTable.put( moduleCode, dispenser );
    }

    return dispenser;
  }

  /**
   * Increments and returns the next DMOKey string to be used for the
   * specified keyName. Subsequent calls to this method will always yield a
   * new value.
   *
   * @param keyName name of the key to retrieve. This is normally the name of
   *        the database table for which the key is being generated.
   *
   * @return the key value
   *
   * @throws DMOKeyDispenserException
   */
  public String useNext( String keyName )
                 throws DMOKeyDispenserException {
    DMOKey key;
    synchronized ( keys ) {
      key = (DMOKey) keys.get( keyName );

      if ( key == null ) {
        key = new DMOKey( moduleCode, keyName );
        keys.put( keyName, key );
      }
    }

    return key.useNext();
  }

  /**
   * Returns the next DMOKey string to be used for the specified keyName
   * without incrementing the key value. Subsequent calls to this method
   * will yield the same value until the useNext() method is called.
   *
   * @param keyName name of the key to retrieve. This is normally the name of
   *        the database table for which the key is being generated.
   *
   * @return the key value
   *
   * @throws DMOKeyDispenserException
   */
  public String getNext( String keyName )
                 throws DMOKeyDispenserException {
    DMOKey key;
    synchronized ( keys ) {
      key = (DMOKey) keys.get( keyName );

      if ( key == null ) {
        key = new DMOKey( moduleCode, keyName );
        keys.put( keyName, key );
      }
    }

    return key.getNext();
  }
}
