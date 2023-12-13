/* ====================================================================== *
 * (c) Copyright Eppixcomm Tech Ltd.                                      *
 * All Rights Reserved                                                    *
 *                                                                        *
 * Legal Information                                                      *
 * ====================================================================== */
package com.eppixcomm.eppix.common.data;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

//import com.eppixcomm.eppix.common.core.UserContext;
import com.eppixcomm.eppix.base.error.EPPIXSeriousException;

/**
 * Common data access methods that are implementation specific.
 * 
 * @author $Author$
 * @version $Revision: 1.2 $
 */
public class DACImpl extends DAC {
  
  /**
   * Creates a new Data Access Controller object.
   *
   * @param thrower Exception handler/logger.
   * @param dao Data Access Object.
   * @param defaultLanguageCode
   * @deprecated
   */
  protected DACImpl(DAOThrower thrower, DAO dao, String defaultLanguageCode) {
    super(thrower, dao, defaultLanguageCode);
  }
  
  /**
   * Creates a new DACImpl object.
   * 
   * @param userContext the user's context.
   * @param dao Data Access Object.
   * @param thrower Exception handler/logger.
   */
//  public DACImpl(UserContext userContext, DAO dao, DAOThrower thrower) {
//    super(userContext, dao, thrower);
//  }

  /**
   * Populates the List of DMOs by primary key. If a primary key is not found in 
   * the database, the corresponding entry in the return list is null. This 
   * implementation requires a temporary table definition, in the dml factory,
   * that can persist StringDMO. 
   * 
   * @param dmoList list of mandatory DMOs populated with mandatory primary keys.
   * @param dmlName name of the query.
   * @param filterBy name of the filter in the dml factory.
   * @param filterArgs filter arguments.
   * 
   * @return List of populated DMOs.
   * 
   * @throws EPPIXSeriousException
   */
  public List getList(
    List dmoList,
    String dmlName,
    String filterBy,
    DAOArgs filterArgs)
    throws EPPIXSeriousException {

    logger.debug("getList( dmoList, dmlName, filterBy, filterArgs )");

    int numDmos = (dmoList == null) ? 0 : dmoList.size();

    if (numDmos > 0) {

      // Build an array of primary keys and insert them into a temp table.
      StringDMO[] primaryKeys = new StringDMO[numDmos];
      for (int i = 0; i < numDmos; ++i) {
        DMO dmo = (DMO) dmoList.get(i);
        thrower.ifParameterMissing("dmoList.dmo", dmo);
        String primaryKey = dmo.primaryKeyToString();
        thrower.ifParameterMissing("dmoList.dmo.primaryKey", primaryKey);
        primaryKeys[i] = new StringDMO(primaryKey);
      }
      dao.insert(primaryKeys);

      DAOIterator itr = dao.iterator(dmlName, filterBy, filterArgs, null);

      // Build a map by primary key.
      Map map = new HashMap();
      while (itr.hasNext()) {
        DMO dmo = (DMO) itr.next();
        map.put(dmo.primaryKeyToString(), dmo);
      }
      itr.close();

      // Delete the contents of the temp table.
      dao.delete(dao.getTableDMLName(StringDMO.class), null, null);

      // Populate the return list from the map.
      for (int i = 0; i < numDmos; ++i) {
        dmoList.set(i, map.get(primaryKeys[i].getString()));
      }
    }

    return dmoList;
  }
}