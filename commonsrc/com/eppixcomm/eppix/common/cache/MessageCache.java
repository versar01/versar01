package com.eppixcomm.eppix.common.cache;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;

import com.eppixcomm.eppix.base.blo.AsMessageDMO;
import com.eppixcomm.eppix.base.blo.BaseBLOBinder;
import com.eppixcomm.eppix.common.core.Cache;
import com.eppixcomm.eppix.base.error.EPPIXBusinessException;
import com.eppixcomm.eppix.base.error.EPPIXFatalException;
import com.eppixcomm.eppix.base.error.EPPIXUnexpectedException;
import com.eppixcomm.eppix.base.error.Thrower;

/**
 * Use for message retrieval from the as_message table. Implements message
 * caching to reduce database access.
 * 
 */
public class MessageCache extends Cache {

  protected MessageCache(BaseBLOBinder base) {
    super(base);
  }

  /** Error handler/logger. */
  private static Thrower thrower = Thrower.getThrower(MessageCache.class);

  private Logger logger = thrower.getLogger();

  static protected MessageCache messages = null;

  /**
   * The cache of {@link AsMessageDMO}
   */
  Map cachedMessages = Collections
      .synchronizedMap(new HashMap());

  /**
   * Gets the current cache instance, or creates a new one if it doesn't exist.
   * 
   * @param base
   * @return the cache instance.
   */
  public static MessageCache getInstance(BaseBLOBinder base) {
    if (messages == null) {
      synchronized (MessageCache.class) {
        if (messages == null) {
          messages = new MessageCache(base);
        }
      }
    }

    messages.setBase(base);

    return messages;
  }

  /**
   * Returns message from as_message based on code.
   * 
   * @param code
   * @return the message text, or null if not found.
   * @throws EPPIXFatalException 
   * @throws EPPIXUnexpectedException 
   * @throws EPPIXBusinessException 
   */
  public String getMessage(int code) throws EPPIXBusinessException,
      EPPIXUnexpectedException, EPPIXFatalException {

    logger.debug("getMessage( code )");

    String mess = null;

    mess = (String)cachedMessages.get(String.valueOf(code));

    // return the cached message if one exists.
    if (mess == null) {
      synchronized (this) {
        if (mess == null) {

          // otherwise, we attempt to get the message from the server.

          AsMessageDMO message = new AsMessageDMO();
          message.setMcode(new Integer(code));
          mess = "";

          message = getBase().asMessage().get(message);

          if (message != null) {
            cachedMessages.put(String.valueOf(code), message.getMmess());
          }
          mess = message.getMmess();
        }
      }
    }
    return mess;
  }

  /**
   * Clears the cache. Subsequent calls to getMessage will require a
   * database retrieval of the message.
   * 
   */
  public void clear() {
    cachedMessages.clear();
  }
}
