/* ====================================================================== *
 * (c) Copyright Eppixcomm Tech Ltd.                                      *
 * All Rights Reserved                                                    *
 *                                                                        *
 * Legal Information                                                      *
 * ====================================================================== */
package com.eppixcomm.eppix.common.data;

//import com.eppixcomm.eppix.common.ejb.DMOKeyHighElementGeneratorException;
//import com.eppixcomm.eppix.common.ejb.DMOKeyHighElementGeneratorHome;
//import com.eppixcomm.eppix.common.ejb.DMOKeyHighElementGeneratorRemote;
import com.eppixcomm.eppix.common.util.ServiceLocator;
import com.eppixcomm.eppix.common.util.ServiceLocatorException;

/**
 * DOCUMENT ME!
 *
 * @version $Revision: 1.1 $
 * @author $Author$
 * @since $jdk$
 */
public class DMOKey {
  /** Name of the EPPIX module (e.g., CRM). */
  private String moduleCode;
  /** Name of the key (e.g., tableName). */
  private String keyName;
  /** High key element. */
  private DMOKeyHighElement highElement = null;
  /** Low key element. */
  private DMOKeyElement lowElement = null;
  /** A service locator for JNDI resources. */
  private ServiceLocator serviceLocator = null;
  /** Indicates whether the last key value was used. */
  private boolean used;

  /**
   * Creates a new DMOKey object.
   *
   * @param moduleCode 3 character EPPIX module code. (CRM, FIN, PAP, etc.)
   * @param keyName name of the key (e.g., module.tableName)
   */
  protected DMOKey( String moduleCode,
                    String keyName ) {
    this.moduleCode = moduleCode;
    this.keyName = keyName;
  }

  /**
   * Returns the next key value to be used. Subsequent calls to this method
   * will always yield a new value.
   *
   * @return the key value
   *
   * @throws DMOKeyDispenserException
   */
  protected String useNext()
                    throws DMOKeyDispenserException {
    return next( true );
  }

  /**
   * Returns the next key value to be used without incrementing (using) the
   * key value. Subsequent calls to this method will yield the same value
   * until the useNext() method is called.
   *
   * @return the key value
   *
   * @throws DMOKeyDispenserException
   */
  protected String getNext()
                    throws DMOKeyDispenserException {
    return next( false );
  }

  /**
   * Returns the next key value string. The value is only incremented when
   * the current value  has been used.
   *
   * @param use true if the key value is going to be used. A new value will
   *        be generated on the next call.
   *
   * @return the key value
   *
   * @throws DMOKeyDispenserException
   */
  private synchronized String next( boolean use )
                            throws DMOKeyDispenserException {
    if ( highElement == null ) {
      try {
        serviceLocator = ServiceLocator.getInstance();
      } catch ( ServiceLocatorException e ) {
        throw new DMOKeyDispenserException( e );
      }

//      highElement = newHighElement();
      lowElement = highElement.getLowElement();
    } else if ( this.used ) {
      try {
        lowElement.increment();
      } catch ( DMOKeyElementOverflowException e ) {
//        highElement = newHighElement();
        lowElement.reset();
      }
    }

    this.used = use;

    return new StringBuffer( highElement.getKeyLen() ).append(
                 highElement.toString() )
                                                      .append(
                 lowElement.toString() )
                                                      .toString();
  }

  /**
   * Provides a new high key element object by calling the high key element
   * generator EJB.
   *
   * @return high key element
   *
   * @throws DMOKeyDispenserException
   */
//  private DMOKeyHighElement newHighElement()
//                                    throws DMOKeyDispenserException {
//    try {
//      DMOKeyHighElementGeneratorHome genHome = (DMOKeyHighElementGeneratorHome) serviceLocator.getEJBHome(
//                                                     DMOKeyHighElementGeneratorHome.class,
//                                                     DMOKeyHighElementGeneratorHome.JNDI_NAME );
//
//      DMOKeyHighElementGeneratorRemote genRemote = genHome.create();
//
//      return genRemote.nextHighElement( moduleCode, keyName );
//    } catch ( ServiceLocatorException e ) {
//      throw new DMOKeyDispenserException(
//            "Failed to locate high key element generator session bean: "
//            + DMOKeyHighElementGeneratorHome.JNDI_NAME, e );
//    } catch ( RemoteException e ) {
//      throw new DMOKeyDispenserException(
//            "Failed to generate next high key element.", e );
//    } catch ( CreateException e ) {
//      throw new DMOKeyDispenserException(
//            "Failed to create high key element generator session bean.", e );
//    } catch ( DMOKeyHighElementGeneratorException e ) {
//      throw new DMOKeyDispenserException(
//            "Failed to generate next high key element.", e );
//    }
//  }
}
