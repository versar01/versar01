package com.eppixcomm.eppix.common.cache;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;

import com.eppixcomm.eppix.base.blo.BaseBLOBinder;
import com.eppixcomm.eppix.base.blo.SksKeySettingDMO;
import com.eppixcomm.eppix.base.blo.SysdirmDMO;
import com.eppixcomm.eppix.common.core.Cache;
import com.eppixcomm.eppix.common.data.KeyTable;
import com.eppixcomm.eppix.base.error.EPPIXBusinessException;
import com.eppixcomm.eppix.base.error.EPPIXFatalException;
import com.eppixcomm.eppix.base.error.EPPIXUnexpectedException;
import com.eppixcomm.eppix.base.error.Thrower;

/**
 * A cache of system keys for both SYSDIRM and SKS_KEY_SETTING.
 * 
 *
 */
public class SystemKeyCache extends Cache {

  protected SystemKeyCache(BaseBLOBinder base) {
    super(base);
  }

  /** Error handler/logger. */
  private static Thrower thrower = Thrower.getThrower(SystemKeyCache.class);

  private Logger logger = thrower.getLogger();

  static protected SystemKeyCache keys = null;

  /**
   * The cache of system keys
   */
  Map cachedKeys = Collections
      .synchronizedMap(new HashMap());

  /**
   * Gets the current cache instance, or creates a new one if it doesn't exist.
   * 
   * @param base
   * @return the cache instance.
   */
  public static SystemKeyCache getInstance(BaseBLOBinder base) {
    if (keys == null) {
      synchronized (SystemKeyCache.class) {
        if (keys == null) {
          keys = new SystemKeyCache(base);
        }
      }
    }

    keys.setBase(base);

    return keys;
  }

  /**
   * Gets the specified system key, from the required table.
   * 
   * If not cached, tries to get it from the database.
   * 
   * @param key the system key
   * @param table one of {@link KeyTable#SYSDIRM} or {@link KeyTable#SKS_KEY_SETTING}
   * @return the system key value, or null if not found.
   * @throws EPPIXFatalException 
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public String getKeyValue(String key, KeyTable table)
      throws EPPIXUnexpectedException, EPPIXFatalException {

    logger.debug("getKeyValue( key, table )" + key + " " + table);

    String value = null;

    value = (String)cachedKeys.get(key);

    // return the cached key if one exists.
    if (value == null) {

      synchronized (this) {

        if (value == null) {

          // otherwise, we attempt to get the system key from the server.
          if (table == KeyTable.SYSDIRM) {
            SysdirmDMO dmo = new SysdirmDMO();
            dmo.setSystemKey(key);

            try {
              dmo = getBase().sysdirm().get(dmo);
            } catch (EPPIXBusinessException e) {
              // ignore missing keys
            }

            if (dmo != null) {
              value = dmo.getKeyValue();
              cachedKeys.put(key, value);
            }
          } else if (table == KeyTable.SKS_KEY_SETTING) {
            SksKeySettingDMO sysDMO = new SksKeySettingDMO();
            sysDMO.setSksKeyCode(key);

            try {
              sysDMO = getBase().sksKeySetting().get(sysDMO);
            } catch (EPPIXBusinessException e) {
              // ignore missing keys
            }

            if (sysDMO != null) {
              value = sysDMO.getSksValue();
              cachedKeys.put(key, value);
            }

          }
        }
      }
    }

    return value;
  }

  /**
   * Updates the value of a specified key.
   * 
   * @param key
   * @param value
   * @param table
   * @throws EPPIXFatalException 
   * @throws EPPIXUnexpectedException 
   * @throws EPPIXBusinessException 
   */
  public void updateKeyValue(String key, String value, KeyTable table)
      throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {

    logger.debug("updateKeyValue( key, value, table )");

    synchronized (this) {
      // this will force a "refresh" of the key
      cachedKeys.remove(key);

      if (table == KeyTable.SKS_KEY_SETTING) {

        getBase().sksKeySetting().modifyValue(key, value);

      } else if (table == KeyTable.SYSDIRM) {

        getBase().sysdirm().modifyValue(key, value);

      }
    }
  }

  /**
   * Clears the cache. Subsequent calls to getKeyValue will require a
   * database retrieval of the system key.
   * 
   */
  public void clear() {
    cachedKeys.clear();
  }
}
