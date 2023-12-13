/*============================================================================================= *
 *
 * (c) 2007 Copyright Eppixcomm.
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
package com.eppixcomm.eppix.base.dml;

import com.eppixcomm.eppix.base.dml.NmNetmatAbstractDMLFactory;

/**
 * DOCUMENT ME!
 *
 * @version $Revision: 1.3 $
 * @author 
  */
public class NmNetmatDMLFactory
  extends NmNetmatAbstractDMLFactory {
  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new NmNetmatDMLFactory object.
   *
   * @throws DMLException DOCUMENT ME!
   */
  protected NmNetmatDMLFactory(  )
    throws DMLException {
    super(  );
    
	defStaticQuery("getUniqueNmNetType", // dmlName
			".common.data.StringDMO", // dmoName,
			"SELECT UNIQUE(NM_NET_TYPE) " +
			"FROM NM_NETMAT " +
			"WHERE NM_NETWORK_TARIFF = ? ", false);
  	}
  
  
}
