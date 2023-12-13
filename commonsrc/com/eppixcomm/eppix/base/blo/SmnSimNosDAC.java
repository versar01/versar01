package com.eppixcomm.eppix.base.blo;


import com.eppixcomm.eppix.base.blo.SmnSimNosAbstractDAC;
import com.eppixcomm.eppix.common.core.UserContext;
import com.eppixcomm.eppix.common.data.DAO;
import com.eppixcomm.eppix.common.util.QueryFilter;
import com.eppixcomm.eppix.common.data.DTOList;
import com.eppixcomm.eppix.common.data.DTOListState;
import com.eppixcomm.eppix.base.error.EPPIXSeriousException;

/**
 * DOCUMENT ME!
 *
 * @version $Revision: 1.3 $
 * @author 
 */
public interface SmnSimNosDAC extends SmnSimNosAbstractDAC {

  DTOList getListAvailable(DTOListState state, QueryFilter filter) throws EPPIXSeriousException;
  
}

