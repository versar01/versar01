/*============================================================================================= *
 *
 * (c) 2006 Copyright Eppixcomm.
 * All Rights Reserved
 * Legal Information goes here.
 *
 *============================================================================================= */

/**----------------------------------------------------------------------------------------------
 *
 * Version control details:
 *    @version $Revision: $
 *    @author  $Author: $
 *----------------------------------------------------------------------------------------------*/
package com.eppixcomm.eppix.base.util;

//import com.eppixcomm.eppix.base.ejb.Base;
//import com.eppixcomm.eppix.base.ejb.BaseHome;
import com.eppixcomm.eppix.base.error.EPPIXFatalException;
import com.eppixcomm.eppix.common.util.ServiceLocator;
import com.eppixcomm.eppix.common.util.ServiceLocatorException;

import javax.ejb.CreateException;

import java.rmi.RemoteException;

/**
 * TODO SJ Don't need the ejb classes
 * in this library at this stage
 */

/**
 * This module's locator utility class uses the ServiceLocator to cache
 * the JNDI lookup of the home interface, thus reducing the work necessary in
 * creating a remote interface.
 *
 * @version $Revision: 1.1 $
 * @author Rob Cross
 * @since $jdk$
 */
public class BaseLocator {
  //~ Methods ////////////////////////////////////////////////////////////////

//  /**
//   * Retrieves the home interface from the service locator cache.
//   *
//   * @return home interface.
//   *
//   * @throws EPPIXFatalException
//   */
//  public static BaseHome getHome(  )
//    throws EPPIXFatalException {
//    try {
//      return (BaseHome) ServiceLocator.getInstance(  )
//                                      .getEJBHome( 
//        BaseHome.class,
//        BaseHome.JNDI_NAME );
//    } catch ( ServiceLocatorException e ) {
//      throw new EPPIXFatalException( e );
//    }
//  }
//
//  /**
//   * Creates a remote interface.
//   *
//   * @return remote interface.
//   *
//   * @throws EPPIXFatalException
//   */
//  public static Base createRemote(  )
//    throws EPPIXFatalException {
//    try {
//      return (Base) getHome(  )
//                      .create(  );
//    } catch ( CreateException e ) {
//      throw new EPPIXFatalException( e );
//    } catch ( RemoteException e ) {
//      throw new EPPIXFatalException( e );
//    }
//  }
//
//  /**
//   * Removes the EJB object.
//   *
//   * @param crmRemote CRM EJB Object.
//   *
//   * @throws EPPIXFatalException
//   */
//  public static void removeRemote( Base baseRemote )/*throws EPPIXFatalException*/  {
//    // THIS CODE CAUSES A PROBLEM WITH TRANSACTIONS
//    /*try {
//      if ( crmRemote != null ) {
//        crmRemote.remove();
//      }
//    } catch ( RemoveException e ) {
//      throw new EPPIXFatalException( e );
//    } catch ( RemoteException e ) {
//      throw new EPPIXFatalException( e );
//    }*/
//  }
}
