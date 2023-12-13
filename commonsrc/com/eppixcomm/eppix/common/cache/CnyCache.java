package com.eppixcomm.eppix.common.cache;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

import com.eppixcomm.eppix.base.blo.BaseBLOBinder;
import com.eppixcomm.eppix.base.blo.CnyCurrencyDMO;
import com.eppixcomm.eppix.base.blo.SysdirmDMO;
import com.eppixcomm.eppix.common.core.Cache;
import com.eppixcomm.eppix.common.data.DAOIterator;
import com.eppixcomm.eppix.common.data.DMO;
import com.eppixcomm.eppix.common.util.FilterOp;
import com.eppixcomm.eppix.common.util.QueryFilter;
import com.eppixcomm.eppix.base.error.EPPIXBusinessException;
import com.eppixcomm.eppix.base.error.EPPIXFatalException;
import com.eppixcomm.eppix.base.error.EPPIXUnexpectedException;
import com.eppixcomm.eppix.base.error.Thrower;
import com.eppixcomm.eppix.common.util.DateTime;
import com.eppixcomm.eppix.common.util.Format;

/**
 * 
 *
 */
public class CnyCache extends Cache {

  protected CnyCache(BaseBLOBinder base) {
    super(base);
  }

  /** Error handler/logger. */
  private static Thrower thrower = Thrower.getThrower(CnyCache.class);

  private Logger logger = thrower.getLogger();

  static protected CnyCache currencyCache = null;

  private String baseCurrency = null;

  /**
   * The cache of {@link CnyCurrencyDMO} 
   */
  Map cachedCurrencies = Collections
      .synchronizedMap(new HashMap());

  /**
   * Gets the current cache instance, or creates a new one if it doesn't exist.
   * 
   * @param base
   * @return the cache instance.
   */
  public static CnyCache getInstance(BaseBLOBinder base) {
    if (currencyCache == null) {
      synchronized (CnyCache.class) {
        if (currencyCache == null) {
          currencyCache = new CnyCache(base);
        }
      }
    }
    
    currencyCache.setBase(base);
    
    return currencyCache;
  }

  /**
   * Returns a {@link CnyCurrencyDMO}.
   * 
   * @param currency the currency to fetch, or null for the base currency.
   * @return a {@link CnyCurrencyDMO}
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   * 
   * TOTEST
   */
  protected CnyCurrencyDMO locateCurrency(String currency)
      throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {

    logger.debug("locateCurrency( currency )");

    return locateCurrency(currency, new DateTime());
  }

  /**
   * 
   * @param currency
   * @param effectiveDate
   * @return a {@link CnyCurrencyDMO}
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   * 
   * TOTEST
   */
  public CnyCurrencyDMO locateCurrency(String currency, DateTime effectiveDate)
      throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {

    CnyCurrencyDMO cur = null;

    logger.debug("locateCurrency( currency, effectiveDate )");

    synchronized (this) {
      // Determine BASE currency
      if (DMO.isNull(currency)) {
        if (baseCurrency == null) {
          SysdirmDMO sys = new SysdirmDMO();
          sys.setSystemKey("ASBASECURR");
          sys = getBase().sysdirm().get(sys);

          baseCurrency = sys.getKeyValue();
        }
        // Use BASE currency
        currency = baseCurrency;
      }

      // find currencies from cache
      List currencyList = (List)cachedCurrencies.get(currency);

      // If currency not found, get the details
      if (currencyList == null) {
        //			cur.setCnyCurrencyRef(currency);

        QueryFilter filter = new QueryFilter();
        filter.add(FilterOp.EQUAL, CnyCurrencyDMO.cnyCurrencyRefFilter,
            currency);
        filter.add(FilterOp.ORDERBYDESC, CnyCurrencyDMO.cnyTimestampFilter);

        DAOIterator i = getBase().cnyCurrency().iterate(filter);

        if (i != null) {
          currencyList = new ArrayList();
          while (i.hasNext()) {
            cur = (CnyCurrencyDMO) i.next();
            currencyList.add(cur);
          }
          
          i.close();
          
        }
        // add to cache
        cachedCurrencies.put(currency, currencyList);
      }

      // Extract latest from Currency based on effectiveDate
//      for (CnyCurrencyDMO curDMO : currencyList) {
//        if (curDMO.getCnyTimestamp().before(effectiveDate)) {
//          cur = curDMO;
//          break;
//        }
//      }
      
      for(Iterator i = currencyList.iterator(); i.hasNext();){
    	  CnyCurrencyDMO curDMO = (CnyCurrencyDMO)i.next();
          if (curDMO.getCnyTimestamp().before(effectiveDate)) {
              cur = curDMO;
              break;
            }
      }
    }

    return cur;
  }

  /**
   * Rounds the decimal value for the specified currency.
   * 
   * @param value the value to round.
   * @param currency the currency, or null to use the base currency.
   * @return the rounded value.
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   * 
   * 
   */
  public double roundDecimal(double value, String currency)
      throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {

    logger.debug("roundDecimal( value, currency )");

    // for zero we do nothing
    if (value == 0) {
      return value;
    }

    // Determine currency details
    CnyCurrencyDMO cur = locateCurrency(currency);

    // sort out the format mask
    String format = "%." + cur.getCnyNoDecs() + "f";
    
    /**
     * TODO Changed formatting as below
     * Double.parseDouble(Format.format(format, value));
     * TO.
     * 
     * Requires testing
     * 
     */

    Object[] val = new Object[]{new Double(value)};
    return Double.parseDouble(Format.format(format, val));
  }

  /**
   * Formats the value for the given settings.
   * 
   * @param value
   * @param currency
   * @param format
   * @param length
   * @return the formatted value.
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   * 
   * 
   */
  public String formatDecimal(double value, String currency, String format,
      int length) throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {

    logger.debug("formatDecimal( value, currency, format, length )");

    // get the currency
    CnyCurrencyDMO cny = locateCurrency(currency);
    
    int noDecs = cny.getCnyNoDecs().intValue();
    
//    int noDecs
    
    // Format the decimal part of the number
    // we also pad the string to 20 chars...
    /**
     * TODO SJ The following code changed from below
     * Require testing to see if desired results has been achieved
     * String s = String
     * format("%-20s", Format.format("%." + noDecs + "f", val));
     */
    
    Object[] val = new Object[]{new Double(value)};
    Object[] newString = new Object[]{Format.format("%." + noDecs + "f", val)};
    
    
    String s = String
        .format("%-20s", newString);


    // Now determine which part of the number to return
    int remainder;
    int start = -1;
    int end = s.trim().length();
    char[] sChars = s.toCharArray();

    if ("<".equals(format)) {
      // If the number was formatted using the '<' character then
      // the actual LENGTH of the string will be the length of the number
      start = 0;

      // If the requested length of the returned number is greater than
      // the actual length of the number, increase it
      if (length > end) {
        end = length;
      }

    } else {
      // To obtain the length of the string, go from the start until a
      // character other than <space> or 0 <zero) is found. From this point
      // upto the end is the length of the number
      // Note: If the decimal point is found, include the previous '0'
      start = 0;

      for (remainder = 0; remainder < end; remainder++) {
        if (sChars[remainder] != ' ' || sChars[remainder] != '0') {
          if (sChars[remainder] == '.') {
            start = remainder - 1;
          } else {
            start = remainder;
          }
          break;
        }
      }

      // If the requested length is greater than the number of
      // digits we have, push back the start position
      remainder = end - start;
      // Push back if required
      if (length > remainder) {
        start = start - (length - remainder);
      }
    }

    // Now produce the required string
    String formatted = s.substring(start, end);

    // If the decimal separator required for the currency is
    // different from the default, replace it
    if (!".".equals(cny.getCnyDecSymbol())) {
      formatted.replace(".", cny.getCnyDecSymbol());
    }

    return formatted;
  }

}
