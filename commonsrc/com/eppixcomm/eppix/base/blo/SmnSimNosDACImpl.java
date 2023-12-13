package com.eppixcomm.eppix.base.blo;


import com.eppixcomm.eppix.common.core.UserContext;
import com.eppixcomm.eppix.common.data.DAO;
import com.eppixcomm.eppix.common.data.DAOParamQueryArgs;
import com.eppixcomm.eppix.common.util.QueryFilter;
import com.eppixcomm.eppix.common.data.DTOList;
import com.eppixcomm.eppix.common.data.DTOListState;
import com.eppixcomm.eppix.base.error.EPPIXSeriousException;
import com.eppixcomm.eppix.base.blo.SmnSimNosAbstractDACImpl;
/**
 * DOCUMENT ME!
 *
 * @version $Revision: 1.3 $
 * @author 
 */
public class SmnSimNosDACImpl extends SmnSimNosAbstractDACImpl implements
    SmnSimNosDAC {
  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new SmnSimNosDACImpl object.
   *
   * @param userContext DOCUMENT ME!
   * @param dao DOCUMENT ME!
   */
  public SmnSimNosDACImpl(UserContext userContext, DAO dao) {
    super(userContext ,dao);
  }

  public SmnSimNosDACImpl(DAO dao) {
	    super(dao);
	  }  
  
  public DTOList getListAvailable(DTOListState state, QueryFilter filter)
      throws EPPIXSeriousException {

    logger.debug("getListAvailable( filter )");

    thrower.ifParameterMissing("filter", filter);

    DAOParamQueryArgs args = filterQueryArgs(filter, "AvailableSims");

    return (DTOList) dao.getListAbs(state, args);

  }
}
