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

import com.eppixcomm.eppix.common.data.DMO;
import com.eppixcomm.eppix.common.util.FilterOp;
import com.eppixcomm.eppix.common.util.QueryFilter;
import com.eppixcomm.eppix.base.error.EPPIXBusinessException;
import com.eppixcomm.eppix.base.error.EPPIXFatalException;
import com.eppixcomm.eppix.base.error.EPPIXUnexpectedException;
import com.eppixcomm.eppix.common.util.Date;

/**
 * Each entry defines a charge code giving it a price and a description.
 * <p>
 *   Whenever a charge is to be made the user can select from this list.
 * </p>
 * <p>
 *   There is only the slight minor change to this table in this version: the netid can take any id defined in vpr_provider_id on
 *   the vpr_provider table.
 * </p>
 *
 * This class contains any additional logic for ChgCharges, if any.
 * It extends the ChgChargesAbstractBLO which holds all the default logic for this class.
 *
 * @author $Author$
 * @version $Revision: 1.2 $
 *
 * @since $jdk$
 */
public class ChgCharges extends ChgChargesAbstractBLO {

  /**
	 * Retrieves a {@link ChgChargesDMO} for the specified paramaters.
   * 
   * SELECT MAX(chg_effective_date)
   * FROM chg_charges
   * WHERE chg_code = ?
   * AND chg_netid = ?
   * AND chg_effective_date <= ?
   * AND chg_chargef = ?
	 * 
	 * @param chargeCode
	 * @param netId
	 * @param chargeDate
	 * @param effectiveDate
	 * @param chargeType
	 * @return a {@link ChgChargesDMO}.
	 * @throws EPPIXBusinessException
	 * @throws EPPIXUnexpectedException
	 * @throws EPPIXFatalException
   * 
   * @param chargeCode
   * @param netId
   * @param chargeDate
   * @param effectiveDate
   * @param chargeType
   * @return a {@link ChgChargesDMO}.
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   * 
   */
  public ChgChargesDMO get(String chargeCode, String netId, Date chargeDate,
      Date effectiveDate, String chargeType) throws EPPIXBusinessException,
      EPPIXUnexpectedException, EPPIXFatalException {

    logger
        .debug("get( chargeCode, netId, chargeDate, effectiveDate, chargeType )");

    if (chargeDate == null) {
      chargeDate = new Date();
    }

    // Validate effectiveDate if passed, If not then set it up
    if (effectiveDate == null) {

      // Look for the effective date of a network specific charge
      QueryFilter filter = new QueryFilter();
      filter.add(FilterOp.MAX, ChgChargesDMO.chgEffectiveDateFilter);
      filter.add(FilterOp.EQUAL, ChgChargesDMO.chgCodeFilter, chargeCode);
      filter.add(FilterOp.EQUAL, ChgChargesDMO.chgNetidFilter, netId);
      filter.add(FilterOp.LESSTHANOREQUAL,
          ChgChargesDMO.chgEffectiveDateFilter, chargeDate);

      if (!DMO.isNull(chargeType)) {
        filter.add(FilterOp.EQUAL, ChgChargesDMO.chgChargefFilter, chargeType);
      }

      if(chgChargesDAC.max(filter) != null){
        effectiveDate = new Date((java.sql.Date) chgChargesDAC.max(filter));
      }
      

      if (effectiveDate == null) {
        // There is no network specific charge, use all networks chg

        filter = new QueryFilter();
        filter.add(FilterOp.MAX, ChgChargesDMO.chgEffectiveDateFilter);
        filter.add(FilterOp.EQUAL, ChgChargesDMO.chgCodeFilter, chargeCode);
        filter.add(FilterOp.NULL, ChgChargesDMO.chgNetidFilter);
        filter.add(FilterOp.LESSTHANOREQUAL,
            ChgChargesDMO.chgEffectiveDateFilter, chargeDate);

        if (!DMO.isNull(chargeType)) {
          filter
              .add(FilterOp.EQUAL, ChgChargesDMO.chgChargefFilter, chargeType);
        }

        if(chgChargesDAC.max(filter) != null){
          effectiveDate = new Date((java.sql.Date) chgChargesDAC.max(filter));
        }        

      }

      // If the date is not found at all then set to today
      if (effectiveDate == null) {
        effectiveDate = new Date();
      }
    }

    // Get the chg_charges record
    // First check if there is a chg set for the specific network
    QueryFilter filter = new QueryFilter();
    filter.add(FilterOp.EQUAL, ChgChargesDMO.chgCodeFilter, chargeCode);
    filter.add(FilterOp.EQUAL, ChgChargesDMO.chgNetidFilter, netId);
    filter.add(FilterOp.EQUAL, ChgChargesDMO.chgEffectiveDateFilter,
        effectiveDate);
    if (!DMO.isNull(chargeType)) {
      filter.add(FilterOp.EQUAL, ChgChargesDMO.chgChargefFilter, chargeType);
    }

    ChgChargesDMO chg = get(filter);

    // If there is no specific network chg then get general (null netid)
    if (chg == null) {
      filter = new QueryFilter();
      filter.add(FilterOp.EQUAL, ChgChargesDMO.chgCodeFilter, chargeCode);
      filter.add(FilterOp.NULL, ChgChargesDMO.chgNetidFilter);
      filter.add(FilterOp.EQUAL, ChgChargesDMO.chgEffectiveDateFilter,
          effectiveDate);
      if (!DMO.isNull(chargeType)) {
        filter.add(FilterOp.EQUAL, ChgChargesDMO.chgChargefFilter, chargeType);
      }

      chg = get(filter);
    }

    if (chg == null) {
      thrower.business(Base_CHGCHARGES_000, new Object[] { chargeCode, netId,
          effectiveDate });
    }

    return chg;
  }
}
