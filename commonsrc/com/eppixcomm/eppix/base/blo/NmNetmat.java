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
package com.eppixcomm.eppix.base.blo;

import com.eppixcomm.eppix.common.data.StringDMO;
import com.eppixcomm.eppix.common.util.FilterOp;
import com.eppixcomm.eppix.common.util.QueryFilter;
import com.eppixcomm.eppix.base.error.EPPIXBusinessException;
import com.eppixcomm.eppix.base.error.EPPIXFatalException;
import com.eppixcomm.eppix.base.error.EPPIXSeriousException;
import com.eppixcomm.eppix.base.error.EPPIXUnexpectedException;

/**
 * null
 *
 * This class contains any additional logic for NmNetmat, if any.
 * It extends the NmNetmatAbstractBLO which holds all the default logic for this class.
 *
 * @author $Author$
 * @version $Revision: 1.2 $
 *
 * @since $jdk$
 */
public class NmNetmat extends NmNetmatAbstractBLO {

  /**
   * Gets an {@link NmNetmatDMO} for the specified internal tariff.
   * 
   * @param internTariff
   * @return an {@link NmNetmatDMO}
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   * 
   */
  public NmNetmatDMO getForInternalTariff(String internTariff)
      throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {

    QueryFilter filter = new QueryFilter();
    filter
        .add(FilterOp.EQUAL, NmNetmatDMO.nmInternalTariffFilter, internTariff);

    return get(filter);
  }
  
  public StringDMO getUniqueNmNetType(String nmNetTariff)throws EPPIXSeriousException {
	    logger.debug( "getUniqueNmNetType( filter )" );

	    QueryFilter filter = new QueryFilter();
	    filter.add(FilterOp.EQUAL, NmNetmatDMO.nmNetworkTariffFilter, nmNetTariff);
	    
	    return nmNetmatDAC.getUniqueNmNetType(filter);

}

protected Class getDACClass() {
	return NmNetmatDAC.class;
}
  
}
