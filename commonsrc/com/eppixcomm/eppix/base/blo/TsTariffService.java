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

import com.eppixcomm.eppix.common.util.FilterOp;
import com.eppixcomm.eppix.common.util.QueryFilter;
import com.eppixcomm.eppix.base.error.EPPIXBusinessException;
import com.eppixcomm.eppix.base.error.EPPIXFatalException;
import com.eppixcomm.eppix.base.error.EPPIXUnexpectedException;

/**
 * Associating packages, tariffs and services.
 * <p>
 *   The TS_TARIFF_SERVICE table holds the charges applicable to a service on a specific tariff.
 * </p>
 *
 * This class contains any additional logic for TsTariffService, if any.
 * It extends the TsTariffServiceAbstractBLO which holds all the default logic for this class.
 *
 * @author $Author$
 * @version $Revision: 1.2 $
 *
 * @since $jdk$
 */
public class TsTariffService extends TsTariffServiceAbstractBLO {

  /**
   * Retrieve default charges for passed service on passed package and internal tariff.
   * 
   * @param pkg
   * @param service
   * @param tariffPlan
   * @return the default {@link TsTariffServiceDMO}
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   * 
   */
  public TsTariffServiceDMO getDefault(String pkg, String service,
      String tariffPlan) throws EPPIXBusinessException,
      EPPIXUnexpectedException, EPPIXFatalException {

    logger.debug("getDefault( pkg, service, tariffPlan )");

    thrower.ifParameterMissing("pkg", pkg);
    thrower.ifParameterMissing("service", service);

    QueryFilter filter = new QueryFilter();
    filter.add(FilterOp.EQUAL, TsTariffServiceDMO.tsPackageCodeFilter, pkg);
    filter.add(FilterOp.EQUAL, TsTariffServiceDMO.tsServiceCodeFilter, service);

    if (tariffPlan == null || tariffPlan.trim().length() == 0) {

      filter.add(FilterOp.NULL, TsTariffServiceDMO.tsInternalTariffFilter);

    } else {

      filter.addOr(FilterOp.EQUAL, TsTariffServiceDMO.tsInternalTariffFilter,
          tariffPlan);
      filter.addOr(FilterOp.NULL, TsTariffServiceDMO.tsInternalTariffFilter);
    }

    return get(filter);
  }

  /*public TsTariffServiceDMO getServiceChargePeriodFrequency(
      BillRunDSO billRunDSO, VasChargesDQO vasChargesDQO)
      throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug("getServiceChargePeriodFrequency(billRunDSO, vasChargesDQO)");

    //    " SELECT * FROM ts_tariff_service",
    //    " WHERE ts_package_code    = ?",
    //    " AND   ts_service_code    = ?",
    //    " AND(ts_internal_tariff = ? OR",
    //    "       ts_internal_tariff IS NULL)"

    QueryFilter filter = new QueryFilter();
    filter.add(FilterOp.EQUAL, TsTariffServiceDMO.tsPackageCodeFilter,
        billRunDSO.getBillRunSubscriberDSO().getSubscriberDetailDQO().getSbd()
            .getSbdPackageCode());
    filter.add(FilterOp.EQUAL, TsTariffServiceDMO.tsServiceCodeFilter,
        vasChargesDQO.getServiceCode());
    filter.add(FilterOp.EQUALORNULL, TsTariffServiceDMO.tsInternalTariffFilter);

    return get(filter);
  }
*/
}
