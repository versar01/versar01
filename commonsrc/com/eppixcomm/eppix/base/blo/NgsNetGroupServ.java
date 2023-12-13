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

import com.eppixcomm.eppix.common.cache.NgsCache;
import com.eppixcomm.eppix.common.cache.TsCache;
import com.eppixcomm.eppix.common.cache.VsrCache;
import com.eppixcomm.eppix.common.data.DTOList;
import com.eppixcomm.eppix.common.data.DTOListState;
import com.eppixcomm.eppix.base.error.EPPIXBusinessException;
import com.eppixcomm.eppix.base.error.EPPIXException;
import com.eppixcomm.eppix.base.error.EPPIXFatalException;
import com.eppixcomm.eppix.base.error.EPPIXUnexpectedException;
import com.eppixcomm.eppix.common.util.Date;
import com.eppixcomm.eppix.common.util.DateTime;

import java.math.BigDecimal;

import java.util.Collection;

/**
 * Holds the node 2 node text sequences required for activation/deactivation of services.
 * <p>
 *   Also allows grouping of non-basic network originated services.
 * </p>
 *
 * This class contains any additional logic for NgsNetGroupServ, if any.
 * It extends the NgsNetGroupServAbstractBLO which holds all the default logic for this class.
 *
 * @author $Author$
 * @version $Revision: 1.2 $
 *
 * @since $jdk$
 */
public class NgsNetGroupServ extends NgsNetGroupServAbstractBLO {

  /**
   * 
   * 
   * @param packageCode
   * @param internTariff
   * @param serviceCode
   * @return an {@link NgsNetGroupServDMO}, or null if not found.
   * @throws EPPIXFatalException 
   * @throws EPPIXUnexpectedException 
   * @throws EPPIXBusinessException 
   */
  public NgsNetGroupServDMO getForPackageServiceTariff(String packageCode,
      String internTariff, String serviceCode) throws EPPIXBusinessException,
      EPPIXUnexpectedException, EPPIXFatalException {

    logger
        .debug("getForPackageServiceTariff( packageCode, internTariff, serviceCode");

    NgsNetGroupServDMO ngs = null;

    TsCache tsCache = TsCache.getInstance(base);
    VsrCache vsrCache = VsrCache.getInstance(base);
    NgsCache ngsCache = NgsCache.getInstance(base);

    // get the tariff service
    TsTariffServiceDMO ts = tsCache.getTariffService(packageCode, internTariff,
        serviceCode);

    if (ts != null) {

      VsrServiceDMO vsr = vsrCache.getService(serviceCode);

      if (vsr != null) {

        ngs = ngsCache.getNetworkGroupServ(ts.getTsNetServCode(), vsr
            .getVsrProviderId(), serviceCode, (short) 1);

      }
    }

    return ngs;

  }
}
