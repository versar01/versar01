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
package com.eppixcomm.eppix.base.blo;

import com.eppixcomm.eppix.common.util.FilterOp;
import com.eppixcomm.eppix.common.util.QueryFilter;
import com.eppixcomm.eppix.base.error.EPPIXBusinessException;
import com.eppixcomm.eppix.base.error.EPPIXFatalException;
import com.eppixcomm.eppix.base.error.EPPIXUnexpectedException;

/**
 * Each entry defines a calculation of discount giving the method of calculation, the charges that it discounts and the method of posting to ledgers.
 * <p>
 *   These individual calculation definitions are grouped together under dip_discount_plan and it is these groupings that
 *   are offered to the subscriber. The individual rules are not offered in their own right.
 * </p>
 *
 * This class contains any additional logic for DirDiscountRule, if any.
 * It extends the DirDiscountRuleAbstractBLO which holds all the default logic for this class.
 *
 * @author $Author$
 * @version $Revision: 1.2 $
 *
 * @since $jdk$
 */
public class DirDiscountRule extends DirDiscountRuleAbstractBLO {

  /**
   * 
   * @param ruleId
   * @param amount
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public void updateRuleUsed(Integer ruleId, Integer amount)
      throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {

    logger.debug("updateRuleUsed( ruleId, amount");

    // UPDATE dir_discount_rule 
    // SET dir_rule_used = dir_rule_used + ? 
    // WHERE dir_rule_id =  ? 

    QueryFilter filter = new QueryFilter();
    filter
        .add(FilterOp.SET_ADDTO, DirDiscountRuleDMO.dirRuleUsedFilter, amount);
    filter.add(FilterOp.EQUAL, DirDiscountRuleDMO.dirRuleIdFilter, ruleId);

    modify(filter);
  }

}
