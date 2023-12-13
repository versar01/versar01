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
 * This table is used in common by the GSM and TDMA calls processing and for version 6.
 * <p>
 *   00 will include an additional technology indicator field and a field that points to the applicable toll tariff plan
 *   (referring to table ttp_toll_tar_plan):
 * </p>
 *
 * This class contains any additional logic for TpTariffPlan, if any.
 * It extends the TpTariffPlanAbstractBLO which holds all the default logic for this class.
 *
 * @author $Author$
 * @version $Revision: 1.2 $
 *
 * @since $jdk$
 */
public class TpTariffPlan extends TpTariffPlanAbstractBLO {

  /**
   * 
   * 
   * @param tarplanRef
   * @return
   * @throws EPPIXFatalException 
   * @throws EPPIXUnexpectedException 
   * @throws EPPIXBusinessException 
   * 
   */
  public TpTariffPlanDMO get(String tarplanRef) throws EPPIXBusinessException,
      EPPIXUnexpectedException, EPPIXFatalException {

    QueryFilter filter = new QueryFilter();
    filter.add(FilterOp.EQUAL, TpTariffPlanDMO.tpTarplanRefFilter, tarplanRef);

    return get(filter);
  }
}
