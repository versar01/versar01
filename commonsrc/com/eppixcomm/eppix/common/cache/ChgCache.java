package com.eppixcomm.eppix.common.cache;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

import com.eppixcomm.eppix.base.blo.BaseBLOBinder;
import com.eppixcomm.eppix.base.blo.ChgChargesDMO;
import com.eppixcomm.eppix.common.core.Cache;
import com.eppixcomm.eppix.common.data.DAOIterator;
import com.eppixcomm.eppix.common.data.DMO;
import com.eppixcomm.eppix.common.util.FilterOp;
import com.eppixcomm.eppix.common.util.QueryFilter;
import com.eppixcomm.eppix.base.error.EPPIXBusinessException;
import com.eppixcomm.eppix.base.error.EPPIXException;
import com.eppixcomm.eppix.base.error.EPPIXFatalException;
import com.eppixcomm.eppix.base.error.EPPIXSeriousException;
import com.eppixcomm.eppix.base.error.EPPIXUnexpectedException;
import com.eppixcomm.eppix.base.error.Thrower;
import com.eppixcomm.eppix.common.util.Date;

/**
 * 
 *
 */
public class ChgCache extends Cache {

  protected ChgCache(BaseBLOBinder base) {
    super(base);
  }

  /** Error handler/logger. */
  private static Thrower thrower = Thrower.getThrower(ChgCache.class);

  private Logger logger = thrower.getLogger();

  static protected ChgCache chgCache = null;

  /**
   * The cache of {@link ChgChargesDMO}
   */
  Map cachedChg = Collections
      .synchronizedMap(new HashMap());

  /**
   * Gets the current cache instance, or creates a new one if it doesn't exist.
   * 
   * @param base
   * @return the cache instance.
   */
  public static ChgCache getInstance(BaseBLOBinder base) {
    if (chgCache == null) {
      synchronized (ChgCache.class) {
        if (chgCache == null) {
          chgCache = new ChgCache(base);
        }
      }
    }
    
    chgCache.setBase(base);
    
    return chgCache;
  }

  void loadCache(String chargeCode) {

    QueryFilter filter = new QueryFilter();
    filter.add(FilterOp.EQUAL, ChgChargesDMO.chgCodeFilter, chargeCode);

    // order by descending so that the latest one is first
    filter.add(FilterOp.ORDERBYDESC, ChgChargesDMO.chgEffectiveDateFilter);

    DAOIterator i = null;
    try {
      i = getBase().chgCharges().iterate(filter);
    } catch (EPPIXException e) {

    }

    if (i != null) {

      while (i.hasNext()) {
        ChgChargesDMO chg = (ChgChargesDMO) i.next();

        HashMap netIds = (HashMap)cachedChg.get(chargeCode);

        if (netIds == null) {

          netIds = new HashMap();

          cachedChg.put(chargeCode, netIds);

        }

        String netId = null;

        if (DMO.isNull(chg.getChgNetid())) {
          netId = "n/a";
        } else {
          netId = chg.getChgNetid();
        }

        List charges = (List)netIds.get(netId);

        if (charges == null) {
          charges = new ArrayList();

          netIds.put(netId, charges);
        }

        charges.add(chg);

      }

      try {
        i.close();
      } catch (EPPIXSeriousException e) {
      }
      
    }
  }

  /**
   * Gets a {@link ChgChargesDMO} for the specified parameters.
   * 
   * @param chargeCode
   * @param netId
   * @param chargeDate (optional)
   * @param effectiveDate (optional)
   * @param chargeType
   * @return a {@link ChgChargesDMO}, or null if not found.
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public ChgChargesDMO getCharge(String chargeCode, String netId,
      Date chargeDate, Date effectiveDate, String chargeType)
      throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {

    logger
        .debug("getCharge( chargeCode, netId, chargeDate, effectiveDate, chargeType )");

    ChgChargesDMO chg = null;

    HashMap netIds = getNetIds(chargeCode);

    // do we have any charges yet ?
    if (netIds != null) {

      // Validate charge date if passed otherwise set it to TODAY
      if (chargeDate == null) {
        chargeDate = new Date();
      }

      // if effective date is null, we need to get it a valid date
      if (effectiveDate == null) {

        List charges = (List)netIds.get(netId);

        // First check if there is a chg set for the specific network

        if (charges != null) {

          for (Iterator i = charges.iterator(); i.hasNext();) {

            ChgChargesDMO charge = (ChgChargesDMO) i.next();

            if (chargeType == null
                || (chargeType != null && charge.getChgChargef().equals(
                    chargeType))) {

              if (chargeDate.after(charge.getChgEffectiveDate())) {

                chg = charge;
                break;

              }
            }
          }

        }

        // If there is no specific network chg then get general

        if (chg == null) {

          charges = (List)netIds.get("n/a");

          if (charges != null) {

            for (Iterator i = charges.iterator(); i.hasNext();) {

              ChgChargesDMO charge = (ChgChargesDMO) i.next();

              if (chargeType == null
                  || (chargeType != null && charge.getChgChargef().equals(
                      chargeType))) {

                if (chargeDate.after(charge.getChgEffectiveDate())) {

                  chg = charge;
                  break;

                }
              }
            }
          }
        }

      } else {

        // First check if there is a chg set for the specific network

        List charges = (List)netIds.get(netId);

        if (charges != null) {

          for (Iterator i = charges.iterator(); i.hasNext();) {

            ChgChargesDMO charge = (ChgChargesDMO) i.next();

            if (chargeType == null
                || (chargeType != null && charge.getChgChargef().equals(
                    chargeType))) {

              if (effectiveDate.equals(charge.getChgEffectiveDate())) {

                chg = charge;
                break;

              }
            }
          }
        }

        // If there is no specific network chg then get general
        if (chg == null) {

          charges = (List)netIds.get("n/a");

          if (charges != null) {

            for (Iterator i = charges.iterator(); i.hasNext();) {

              ChgChargesDMO charge = (ChgChargesDMO) i.next();

              if (chargeType == null
                  || (chargeType != null && charge.getChgChargef().equals(
                      chargeType))) {

                if (effectiveDate.equals(charge.getChgEffectiveDate())) {

                  chg = charge;
                  break;

                }
              }
            }
          }
        }
      }
    }

    return chg;
  }

  /**
   * @param chargeCode
   * @return a HashMap of network ids
   */
  private HashMap getNetIds(String chargeCode) {
    HashMap netIds = null;

    synchronized (this) {
      netIds = (HashMap)cachedChg.get(chargeCode);

      // doesn' exist yet?
      if (netIds == null) {

        // try to cache it
        loadCache(chargeCode);

        // get it again. if this returns null, there's no hope!
        netIds = (HashMap)cachedChg.get(chargeCode);

      }
    }

    return netIds;
  }

  /**
   * Returns the first {@link ChgChargesDMO} for the specified charge code and  effective
   * date.
   * 
   * @param chargeCode
   * @param limit
   * @return a list of {@link ChgChargesDMO}
   */
  public ChgChargesDMO getFirstCharge(String chargeCode, Date limit) {

    logger.debug("getCharges( chargeCode, limit )");

    HashMap netIds = getNetIds(chargeCode);

    // do we have any charges yet ?
    if (netIds != null) {

      List chgList = (List)netIds.get("n/a");
      
      for(Iterator i = chgList.iterator(); i.hasNext();){
    	  ChgChargesDMO charge = (ChgChargesDMO)i.next();
	        if (limit.after(charge.getChgEffectiveDate())) {
	        	return charge;
	        }    	  
      }

    }

    return null;
  }

}
