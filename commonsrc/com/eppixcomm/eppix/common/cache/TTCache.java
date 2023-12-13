package com.eppixcomm.eppix.common.cache;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;

import com.eppixcomm.eppix.base.blo.BaseBLOBinder;
import com.eppixcomm.eppix.base.blo.TtTypeTextDMO;
import com.eppixcomm.eppix.common.core.Cache;
import com.eppixcomm.eppix.base.error.EPPIXBusinessException;
import com.eppixcomm.eppix.base.error.EPPIXFatalException;
import com.eppixcomm.eppix.base.error.EPPIXUnexpectedException;
import com.eppixcomm.eppix.base.error.Thrower;

/**
 * 
 *
 */
public class TTCache extends Cache {
  
  protected TTCache(BaseBLOBinder base) {
    super(base);
  }

  /** Error handler/logger. */
  private static Thrower thrower = Thrower.getThrower(TTCache.class);

  private Logger logger = thrower.getLogger();

  static protected TTCache texts = null;

  /**
   * The cache of {@link TtTypeTextDMO}
   */
  Map cachedTexts = Collections
      .synchronizedMap(new HashMap());

  /**
   * Gets the current cache instance, or creates a new one if it doesn't exist.
   * 
   * @param base
   * @return the cache instance.
   */
  public static TTCache getInstance(BaseBLOBinder base) {
    if (texts == null) {
      synchronized (TTCache.class) {
        if (texts == null) {
          texts = new TTCache(base);
        }
      }
    }
    
    texts.setBase(base);
    
    return texts;
  }

  /**
   * Returns a {@link TtTypeTextDMO} based on group and type.
   * 
   * Note: currently hard-coded for language ENG.
   * 
   * @param group
   * @param type
   * @return a {@link TtTypeTextDMO}, or null if not found.
   * @throws EPPIXFatalException 
   * @throws EPPIXUnexpectedException 
   * @throws EPPIXBusinessException
   */
  public TtTypeTextDMO getText(String group, String type)
      throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {

    logger.debug("getText( group, type )");

    String key = group + ':' + type;
    TtTypeTextDMO typeText = null;
    typeText = (TtTypeTextDMO)cachedTexts.get(key);

    // return the cached message if one exists.
    if (typeText == null) {
      synchronized (this) {
        if (typeText == null) {

          // otherwise, we attempt to get the message from the server.

          typeText = new TtTypeTextDMO();
          typeText.setTtGroup(group);
          typeText.setTtType(type);
          typeText.setTtLang("ENG");

          typeText = getBase().ttTypeText().get(typeText);

          if (typeText != null) {
            cachedTexts.put(key, typeText);
          }
        }
      }
    }
    return typeText;
  }

  /**
   * Returns a {@link TtTypeTextDMO} based on group and type.
   * 
   * Note: currently hard-coded for language ENG.
   * 
   * @param group
   * @param type
   * @param language
   * @return a {@link TtTypeTextDMO}, or null if not found.
   * @throws EPPIXFatalException 
   * @throws EPPIXUnexpectedException 
   * @throws EPPIXBusinessException
   */
  public TtTypeTextDMO getText(String group, String type, String language)
      throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {

    logger.debug("getText( group, type, language )");

    String key = group + ':' + type;
    TtTypeTextDMO typeText = null;

    typeText = (TtTypeTextDMO)cachedTexts.get(key);

    // return the cached message if one exists.
    if (typeText == null) {
      synchronized (this) {
        if (typeText == null) {

          // otherwise, we attempt to get the message from the server.

          typeText = new TtTypeTextDMO();
          typeText.setTtGroup(group);
          typeText.setTtType(type);
          typeText.setTtLang(language);

          typeText = getBase().ttTypeText().get(typeText);

          if (typeText != null) {
            cachedTexts.put(key, typeText);
          }
        }
      }
    }
    return typeText;
  }

  /**
   * Returns true if a Type Text group/type exists.
   * 
   * @param group
   * @param type
   * @return true if the entry exists.
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public boolean exists(String group, String type)
      throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    return (getText(group, type) != null);
  }

  /**
   * Clears the cache. Subsequent calls to getMessage will require a
   * database retrieval of the message.
   * 
   */
  public void clear() {
    cachedTexts.clear();
  }
}
