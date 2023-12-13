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

import com.eppixcomm.eppix.base.dml.DMLException;
import com.eppixcomm.eppix.base.dml.SmnSimNosAbstractDMLFactory;

/**
 * DOCUMENT ME!
 *
 * @version $Revision: 1.3 $
 * @author 
  */
public class SmnSimNosDMLFactory
  extends SmnSimNosAbstractDMLFactory {
  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new SmnSimNosDMLFactory object.
   *
   * @throws DMLException DOCUMENT ME!
   */
	protected SmnSimNosDMLFactory(  )
    throws DMLException {
    super(  );
    
    
    defParamQuery( 
        "AvailableSims", // dmlName
        "blo.SmnSimNosDMO", // dmoName
        "SMN_SIM_NO, SMN_NETWORK_ID, SMN_IMSI_NO, SMN_KI"
        + ", SMN_ON_NETWORK, SMN_HLR, SMN_PUK_NO, SMN_STATUS"
        + ", SMN_ACTIVE_DATE, SMN_AVAIL_DATE, SMN_EXPIRY_DATE"
        + ", SMN_WAREHOUSE, SMN_PRODUCT_CODE, SMN_DEALER_ID"
        + ", SMN_TRANSPORT_KEY, SMN_PIN_NO, SMN_PUK_NO_2"
        + ", SMN_PIN_NO_2, SMN_ANALYSIS_1, SMN_ANALYSIS_2"
        + ", SMN_ANALYSIS_3", // columnList
        "SMN_SIM_NO",
        "SMN_SIM_NOS",
        "smn_status = '0' AND NOT EXISTS(SELECT UNIQUE(0) " +
        "FROM activation_pend ap WHERE ap.serial_no = smn_sim_no)"
         )
        .addFilterBy("equalSmnSimNo", /* PK attribute */
      "trim(SMN_SIM_NO) = ?" )
      .addFilterBy( 
      "filterBySmnSimNoMatch",
      "SMN_SIM_NO LIKE ?" )
        
        .addFilterBy( 
            "equalSmnNetworkId",
        "trim(SMN_NETWORK_ID) = ?" ) // EQUAL
;
    
    
    
  }
  
}
