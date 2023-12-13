package com.eppixcomm.eppix.base.blo;

import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;

import com.eppixcomm.eppix.common.data.DAC;
import com.eppixcomm.eppix.common.data.DAO;
import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DAOIterator;
import com.eppixcomm.eppix.common.data.DAOParamQueryArgs;
import com.eppixcomm.eppix.common.data.DAOThrower;
import com.eppixcomm.eppix.common.util.FilterPart;
import com.eppixcomm.eppix.common.util.QueryFilter;
import com.eppixcomm.eppix.common.data.DTOList;
import com.eppixcomm.eppix.common.data.DTOListState;
import com.eppixcomm.eppix.base.error.EPPIXObjectBusyException;
import com.eppixcomm.eppix.base.error.EPPIXObjectExpiredException;
import com.eppixcomm.eppix.base.error.EPPIXObjectNotFoundException;
import com.eppixcomm.eppix.base.error.EPPIXSeriousException;

public class TolSimNosAbstractDACImpl   extends DAC
implements TolSimNosAbstractDAC {
	
	
	/** Error handler/logger. */
	  static DAOThrower thrower = DAOThrower.getDAOThrower( TolSimNosAbstractDACImpl.class );

	  //~ Instance variables /////////////////////////////////////////////////////

	  /** DOCUMENT ME! */
	  Logger logger = thrower.getLogger(  );
   public TolSimNosAbstractDACImpl(DAO dao)
   {
	   super(dao, thrower);
   }

	protected TolSimNosAbstractDACImpl(DAO dao, DAOThrower thrower) {
		super(dao, thrower);
		// TODO Auto-generated constructor stub
	}

	public int count(QueryFilter filter) throws EPPIXSeriousException {
		// TODO Auto-generated method stub
		DAOParamQueryArgs args = filterQueryArgs( filter, null );
	    return dao.count( args.getDMLName(  ), args.getFilterBy(  ), args );

	}

	public void create(TolSimNosDMO tolSimNosDMO) throws EPPIXSeriousException {
		// TODO Auto-generated method stub
		thrower.ifParameterMissing( "TolSimNosDMO", tolSimNosDMO );
	    dao.insert( tolSimNosDMO );
		
	}

	public void delete(TolSimNosDMO tolSimNosDMO) throws EPPIXSeriousException,
			EPPIXObjectNotFoundException, EPPIXObjectExpiredException {
			
	    thrower.ifParameterMissing( "TolSimNosDMO", tolSimNosDMO );
	    dao.delete( tolSimNosDMO );
		
	}

	public void delete(QueryFilter filter) throws EPPIXSeriousException,
			EPPIXObjectNotFoundException, EPPIXObjectExpiredException {
		
		thrower.ifParameterMissing( "filter", filter );
		DAOParamQueryArgs args = filterQueryArgs( filter, null );
		dao.delete( "TolSimNosDMO", args.getFilterBy(  ), args );
		
	}

	public boolean exists(TolSimNosDMO tolSimNosDMO)
			throws EPPIXSeriousException {
		// TODO Auto-generated method stub
		return dao.exists( "TolSimNos", "filterByPrimaryKey",new DAOArgs( 1 ).arg( tolSimNosDMO.getTolSimNo()) );
		

	}

	public boolean exists(QueryFilter filter) throws EPPIXSeriousException {
		// TODO Auto-generated method stub
	    return dao.exists( filterQueryArgs( filter, null ) );
		
	}

	public TolSimNosDMO get(TolSimNosDMO tolSimNosDMO)
			throws EPPIXSeriousException {
		// TODO Auto-generated method stub
	    thrower.ifParameterMissing( "TolSimNosDMO", tolSimNosDMO );
	    return (TolSimNosDMO) dao.get( tolSimNosDMO );

	}

	public TolSimNosDMO get(QueryFilter filter) throws EPPIXSeriousException {
		// TODO Auto-generated method stub
		
 	     DAOParamQueryArgs args = filterQueryArgs( filter, null );
	     return (TolSimNosDMO) dao.get( args.getDMLName(  ), args.getFilterBy(  ), args );

		
	}

	public DAOIterator iterate(QueryFilter filter) throws EPPIXSeriousException {
		// TODO Auto-generated method stub
		return dao.iterator( filterQueryArgs( filter, null ) );
	}

	public DAOIterator iterateWithLock(QueryFilter filter)
			throws EPPIXSeriousException {
		// TODO Auto-generated method stub
		return dao.iterator( filterQueryArgs( filter, null ), true );

	}

	public TolSimNosDMO lock(TolSimNosDMO tolSimNosDMO)
			throws EPPIXSeriousException, EPPIXObjectBusyException {
		// TODO Auto-generated method stub
		
	    thrower.ifParameterMissing( "tolSimNosDMO", tolSimNosDMO );
	    TolSimNosDMO lockedTolSimNosDMO = null;
      // Lock the base table on its primary key.
        lockedTolSimNosDMO = (TolSimNosDMO) dao.lock( "TolSimNos", "filterByPrimaryKey",new DAOArgs(1).arg(tolSimNosDMO.getTolSimNo()));
	   return lockedTolSimNosDMO;

		
		
	}

	public Object max(QueryFilter filter) throws EPPIXSeriousException {
		// TODO Auto-generated method stub
		
		 DAOParamQueryArgs args = filterQueryArgs( filter, null );
	     return dao.max( args.getDMLName(  ), args.getFilterBy(  ), args, args.getMaxField(  ) );
		
	}

	public Object min(QueryFilter filter) throws EPPIXSeriousException {
		// TODO Auto-generated method stub

		DAOParamQueryArgs args = filterQueryArgs( filter, null );
	    return dao.min( args.getDMLName(  ), args.getFilterBy(  ), args, args.getMaxField(  ) );

	}

	public void modify(TolSimNosDMO tolSimNosDMO) throws EPPIXSeriousException,
			EPPIXObjectExpiredException, EPPIXObjectNotFoundException {
		// TODO Auto-generated method stub
		thrower.ifParameterMissing( "TolSimNosDMO", tolSimNosDMO );
	     dao.update( tolSimNosDMO );
		
	}

	public void modify(QueryFilter filter) throws EPPIXSeriousException,
			EPPIXObjectExpiredException, EPPIXObjectNotFoundException {
		// TODO Auto-generated method stub
		thrower.ifParameterMissing( "filter", filter );
	    dao.updateCustom( new TolSimNosDMO(), filterQueryArgs( filter, null ) );  

	}

	public DTOList getList(DTOListState state, TolSimNosDMO tolSimNosDMO) throws EPPIXSeriousException  
	{
		// TODO Auto-generated method stub
		return new DTOList(dao.getList(paramQueryArgs( tolSimNosDMO )));
	}

	public DTOList getList(DTOListState state, QueryFilter filter) throws EPPIXSeriousException {
		// TODO Auto-generated method stub
		 return new DTOList(dao.getList(filterQueryArgs( filter, null )));
	}
	
	/**
	   * DOCUMENT ME!
	   *
	   * @param filter DOCUMENT ME!
	   * @param dmlName DOCUMENT ME!
	   *
	   * @return DOCUMENT ME!
	   */
	  protected DAOParamQueryArgs filterQueryArgs( QueryFilter filter, String      dmlName ) {
	    List parts = filter.getParts(  );
	    DAOParamQueryArgs queryArgs = new DAOParamQueryArgs( ( dmlName == null )
	        ? "TolSimNos" : dmlName, parts.size(  ) );

	    for ( Iterator i = parts.iterator(); i.hasNext(); ) {
	      FilterPart part = (FilterPart) i.next();

	      switch ( part.getIndex(  ) ) 
	      {
	      
	      	case TolSimNosDMO.tolSimNoFilter:
	      		part.andFilterBy( queryArgs, "TolSimNo" );
	      		break;
	      	case TolSimNosDMO.tolNetworkIdFilter:
	      		part.andFilterBy( queryArgs, "TolNetworkId" );
	      		break;
	      	case TolSimNosDMO.tolImsiNoFilter:
	      		part.andFilterBy( queryArgs, "TolImsiNo" );
	      		break;
	      		
	      	case TolSimNosDMO.tolKiFilter:
	      		part.andFilterBy( queryArgs, "TolKi" );
	      		break;
	      		
	      	case TolSimNosDMO.tolOnNetworkFilter:
	      		part.andFilterBy( queryArgs, "TolOnNetwork" );
	      		break;
	      		
	      	case TolSimNosDMO.tolHlrFilter:
	      		part.andFilterBy( queryArgs, "TolHlr" );
	      		break;
	      	case TolSimNosDMO.tolPukNoFilter:
	      		part.andFilterBy( queryArgs, "TolPukNo" );
	      		break;

	      	case TolSimNosDMO.tolStatusFilter:
	      		part.andFilterBy( queryArgs, "TolStatus" );
	      		break;
	      		
	      	case TolSimNosDMO.tolActiveDateFilter:
	      		part.andFilterBy( queryArgs, "tolActiveDate" );
	      		break;
	      		
	      	case TolSimNosDMO.tolAvailDateFilter:
	      		part.andFilterBy( queryArgs, "TolAvailDate" );
	      		break;
	      		
	      	case TolSimNosDMO.tolExpiryDateFilter:
	      		part.andFilterBy( queryArgs, "TolExpiryDate" );
	      		break;
	      		
	      	case TolSimNosDMO.tolWarehouseFilter:
	      		part.andFilterBy( queryArgs, "tolWarehouse" );
	      		break;
	      		
	      	case TolSimNosDMO.tolProductCodeFilter:
	      		part.andFilterBy( queryArgs, "tolProductCode" );
	      		break;
	      	
	      	case TolSimNosDMO.tolDealerIdFilter:
	      		part.andFilterBy( queryArgs, "TolDealerId" );
	      		break;
	      		
	      	case TolSimNosDMO.tolTransportKeyFilter:
	      		part.andFilterBy( queryArgs, "TolTransportKey" );
	      		break;
	      		
	      			
	      	case TolSimNosDMO.tolPinNoFilter:
	      		part.andFilterBy( queryArgs, "TolPinNo" );
	      		break;
	      		
	      	case TolSimNosDMO.tolPukNo2Filter:
	      		part.andFilterBy( queryArgs, "TolPukNo2" );
	      		break;
	      		
	      	case TolSimNosDMO.tolPinNo2Filter:
	      		part.andFilterBy( queryArgs, "TolPinNo2" );
	      		break;
	      	
	      	case TolSimNosDMO.tolAnalysis1Filter:
	      		part.andFilterBy( queryArgs, "TolAnalysis1" );
	      		break;
	      	
	      	case TolSimNosDMO.tolAnalysis2Filter:
	      		part.andFilterBy( queryArgs, "TolAnalysis2" );
	      		break;
	      		
	      	case TolSimNosDMO.tolAnalysis3Filter:
	      		part.andFilterBy( queryArgs, "TolAnalysis3" );
	      		break;

	      }
	    }
	    return queryArgs;
	    
	  }
	  
	  
	  /**
	   * Constructs parameterised query arguments.
	   *
	   * @param $(dataObjectNameLowerCamel} TolSimNosDMO object.
	   */
	  protected DAOParamQueryArgs paramQueryArgs(TolSimNosDMO tolSimNosDMO ) {
	    
	    DAOParamQueryArgs queryArgs = new DAOParamQueryArgs( "TolSimNos", 5 * 2 );
	    	
	    return queryArgs;
	  }

}
