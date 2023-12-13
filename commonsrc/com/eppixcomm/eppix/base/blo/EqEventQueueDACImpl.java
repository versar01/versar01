package com.eppixcomm.eppix.base.blo;

import com.eppixcomm.eppix.common.data.DAC;
import com.eppixcomm.eppix.common.data.DAO;
import com.eppixcomm.eppix.common.data.DAOIterator;
import com.eppixcomm.eppix.common.data.DAOThrower;
import com.eppixcomm.eppix.common.util.QueryFilter;
import com.eppixcomm.eppix.common.data.DTOList;
import com.eppixcomm.eppix.common.data.DTOListState;
import com.eppixcomm.eppix.base.error.EPPIXObjectBusyException;
import com.eppixcomm.eppix.base.error.EPPIXObjectExpiredException;
import com.eppixcomm.eppix.base.error.EPPIXObjectNotFoundException;
import com.eppixcomm.eppix.base.error.EPPIXSeriousException;

import com.eppixcomm.eppix.common.core.UserContext;
import com.eppixcomm.eppix.common.data.DAO;

/**
 * DOCUMENT ME!
 *
 * @version $Revision: 1.3 $
 * @author 
  */
public class EqEventQueueDACImpl extends EqEventQueueAbstractDACImpl
  implements EqEventQueueDAC {
  //~ Constructors ///////////////////////////////////////////////////////////

//  /**
//   * Creates a new EqEventQueueDACImpl object.
//   *
//   * @param userContext DOCUMENT ME!
//   * @param dao DOCUMENT ME!
//   */
//  public EqEventQueueDACImpl( 
//    UserContext userContext,
//    DAO         dao ) {
//    super( userContext, dao );
//  }
  
  public EqEventQueueDACImpl(DAO  dao) {
		    super( dao );
		  }  
}
