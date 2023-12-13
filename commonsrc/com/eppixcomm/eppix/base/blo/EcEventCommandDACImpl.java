package com.eppixcomm.eppix.base.blo;

import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;

//import com.eppixcomm.eppix.common.core.UserContext;
//import com.eppixcomm.eppix.common.data.DAC;
import com.eppixcomm.eppix.common.data.DAO;
//import com.eppixcomm.eppix.common.data.DAOIterator;
//import com.eppixcomm.eppix.common.data.DAOParamQueryArgs;
//import com.eppixcomm.eppix.common.data.DAOThrower;
//import com.eppixcomm.eppix.common.data.DTOList;
//import com.eppixcomm.eppix.common.data.DTOListState;
//import com.eppixcomm.eppix.base.error.EPPIXObjectBusyException;
//import com.eppixcomm.eppix.base.error.EPPIXObjectExpiredException;
//import com.eppixcomm.eppix.base.error.EPPIXObjectNotFoundException;
//import com.eppixcomm.eppix.base.error.EPPIXSeriousException;
//import com.eppixcomm.eppix.common.util.FilterPart;
//import com.eppixcomm.eppix.common.util.QueryFilter;

public class EcEventCommandDACImpl extends EcEventCommandAbstractDACImpl implements EcEventCommandDAC{

	public EcEventCommandDACImpl(DAO dao) {
		super( dao );
	}


//	/** Error handler/logger. */
//	static DAOThrower thrower = DAOThrower.getDAOThrower(EcEventCommandDACImpl.class );
//
//	//~ Instance variables /////////////////////////////////////////////////////
//
//	/** DOCUMENT ME! */
//	Logger logger = thrower.getLogger(  );
//	  
//	public int count(QueryFilter filter) throws EPPIXSeriousException {
//		// TODO Auto-generated method stub
//		logger.debug( "count( EcEventCommandDACImpl )" );
//		thrower.ifParameterMissing( "filter", filter );
//		return 0;
//	}
//
//	public void create(EcEventCommandDMO ecEventCommandDMO) throws EPPIXSeriousException {
//		// TODO Auto-generated method stub
//		logger.debug( "create(EcEventCommandDMO ecEventCommandDMO)" );
//		thrower.ifParameterMissing( "EcEventCommandDMO", ecEventCommandDMO );
//		
//		dao.insert(ecEventCommandDMO);
//	}
//
//	public void delete(EcEventCommandDMO ecEventCommandDMO) throws EPPIXSeriousException, EPPIXObjectNotFoundException, EPPIXObjectExpiredException {
//		// TODO Auto-generated method stub
//		logger.debug("delete(EcEventCommandDMO ecEventCommandDMO)");
//		thrower.ifParameterMissing( "EcEventCommandDMO", ecEventCommandDMO );
//		
//		dao.delete(ecEventCommandDMO);	
//		
//	}
//
//	public void delete(QueryFilter filter) throws EPPIXSeriousException, EPPIXObjectNotFoundException, EPPIXObjectExpiredException {
//		// TODO Auto-generated method stub
//		logger.debug("delete(QueryFilter filter)");
//		thrower.ifParameterMissing( "filter", filter );
//		
//		
//	}
//
//	public boolean exists(EcEventCommandDMO ecEventCommandDMO) throws EPPIXSeriousException {
//		// TODO Auto-generated method stub
//		logger.debug("exists(EcEventCommandDMO ecEventCommandDMO)");
//		thrower.ifParameterMissing( "EcEventCommandDMO", ecEventCommandDMO );
//		return false;
//	}
//
//	public boolean exists(QueryFilter filter) throws EPPIXSeriousException {
//		// TODO Auto-generated method stub
//		logger.debug("exists(QueryFilter filter)");
//		thrower.ifParameterMissing( "filter", filter );
//		return false;
//	}
//
//	public EcEventCommandDMO get(EcEventCommandDMO ecEventCommandDMO) throws EPPIXSeriousException {
//		// TODO Auto-generated method stub
//		logger.debug("get(EcEventCommandDMO ecEventCommandDMO)");
//		thrower.ifParameterMissing( "EcEventCommandDMO", ecEventCommandDMO );
//		
//		return (EcEventCommandDMO) dao.get(ecEventCommandDMO);
//	}
//
//	public EcEventCommandDMO get(QueryFilter filter) throws EPPIXSeriousException {
//		// TODO Auto-generated method stub
//		logger.debug("get(QueryFilter filter)");
//		thrower.ifParameterMissing( "filter", filter );
//		
//		return null;
//	}
//
//	public DTOList getList(DTOListState state, EcEventCommandDMO ecEventCommandDMO) throws EPPIXSeriousException {
//		// TODO Auto-generated method stub
//		logger.debug("getList(DTOListState state, EcEventCommandDMO ecEventCommandDMO)");
//		thrower.ifParameterMissing( "EcEventCommandDMO", ecEventCommandDMO );
//		return null;
//	}
//
//	public DTOList getList(DTOListState state, QueryFilter filter) throws EPPIXSeriousException {
//		// TODO Auto-generated method stub
//		logger.debug("getList(DTOListState state, QueryFilter filter)");
//		thrower.ifParameterMissing( "filter", filter );
//		return null;
//	}
//
//	public DAOIterator iterate(QueryFilter filter) throws EPPIXSeriousException {
//		// TODO Auto-generated method stub
//		logger.debug("iterate(QueryFilter filter)");
//		thrower.ifParameterMissing( "filter", filter );
//
//		return null;
//	}
//
//	public DAOIterator iterateWithLock(QueryFilter filter) throws EPPIXSeriousException {
//		// TODO Auto-generated method stub
//		logger.debug("iterateWithLock(QueryFilter filter)");
//		thrower.ifParameterMissing( "filter", filter );
//		return null;
//	}
//
//	public EcEventCommandDMO lock(EcEventCommandDMO ecEventCommandDMO) throws EPPIXSeriousException, EPPIXObjectBusyException {
//		// TODO Auto-generated method stub
//		logger.debug("lock(EcEventCommandDMO ecEventCommandDMO)");
//		thrower.ifParameterMissing( "EcEventCommandDMO", ecEventCommandDMO );
//		return null;
//	}
//
//	public Object max(QueryFilter filter) throws EPPIXSeriousException {
//		// TODO Auto-generated method stub
//		logger.debug("max(QueryFilter filter)");
//		thrower.ifParameterMissing( "filter", filter );
//		return null;
//	}
//
//	public Object min(QueryFilter filter) throws EPPIXSeriousException {
//		// TODO Auto-generated method stub
//		logger.debug("min(QueryFilter filter)");
//		thrower.ifParameterMissing( "filter", filter );
//		return null;
//	}
//
//	public void modify(EcEventCommandDMO ecEventCommandDMO) throws EPPIXSeriousException, EPPIXObjectExpiredException, EPPIXObjectNotFoundException {
//		// TODO Auto-generated method stub
//		logger.debug("modify(EcEventCommandDMO ecEventCommandDMO)");
//		thrower.ifParameterMissing( "EcEventCommandDMO", ecEventCommandDMO );
//		thrower.ifParameterMissing( "EcEventCommandDMO.getEcCommand()", ecEventCommandDMO.getEcCommand() );
//		
//		dao.update(ecEventCommandDMO);
//		
//	}
//
//	public void modify(QueryFilter filter) throws EPPIXSeriousException, EPPIXObjectExpiredException, EPPIXObjectNotFoundException {
//		// TODO Auto-generated method stub
//		logger.debug("modify(QueryFilter filter)");
//		thrower.ifParameterMissing( "filter", filter );
//		
//	    dao.updateCustom( new EcEventCommandDMO(  ),
//	    	      filterQueryArgs( filter, null ) );
//	}
//	
//	  protected DAOParamQueryArgs filterQueryArgs( 
//			    QueryFilter filter,
//			    String      dmlName ) {
//			    List parts = filter.getParts(  );
//			    DAOParamQueryArgs queryArgs = new DAOParamQueryArgs( ( dmlName == null )
//			        ? "EcEventCommand" : dmlName, parts.size(  ) );
//
//			    Iterator it = parts.iterator();
//			    
//			    while(it.hasNext()){
//			    	FilterPart part = (FilterPart)it.next();
//				      switch ( part.getIndex(  ) ) {
//				      	case EcEventCommandDMO.ecCommandFilter:
//				      		part.andFilterBy( queryArgs, "EcEventCommand",
//				      		dao.wildcardForAnySequence(  ) );
//			          break;
//			      }			    	
//			    }
//			    
////			    for ( FilterPart part : parts ) {
////			      switch ( part.getIndex(  ) ) {
////			        case EcEventCommandDMO.ecCommandFilter:
////			          part.andFilterBy( queryArgs, "EcEventCommand",
////			            dao.wildcardForAnySequence(  ) );
////
////			          break;
////			      }   
////			    }
//			    
//		return queryArgs;
//	}	
}
