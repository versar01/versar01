package com.eppixcomm.eppix.base.blo;

import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;

import com.eppixcomm.eppix.base.error.EPPIXObjectExpiredException;
import com.eppixcomm.eppix.base.error.EPPIXObjectNotFoundException;
import com.eppixcomm.eppix.base.error.EPPIXSeriousException;
import com.eppixcomm.eppix.common.data.DAC;
import com.eppixcomm.eppix.common.data.DAO;
import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DAOIterator;
import com.eppixcomm.eppix.common.data.DAOParamQueryArgs;
import com.eppixcomm.eppix.common.data.DAOThrower;
import com.eppixcomm.eppix.common.data.DMO;
import com.eppixcomm.eppix.common.data.DTOList;
import com.eppixcomm.eppix.common.util.DateTime;
import com.eppixcomm.eppix.common.util.FilterPart;
import com.eppixcomm.eppix.common.util.QueryFilter;

public class BlhBillLimitHdAbstractDACImpl extends DAC implements BlhBillLimitHdAbstractDAC {
	 static DAOThrower thrower = DAOThrower.getDAOThrower( BlhBillLimitHdAbstractDACImpl.class );
	  Logger logger = thrower.getLogger();
	  
	public BlhBillLimitHdAbstractDACImpl(DAO dao, DAOThrower thrower) {
		super(dao, thrower);
	}
	
	public BlhBillLimitHdAbstractDACImpl(DAO dao) {
		super(dao, thrower);
	}
	
	public int count(QueryFilter filter) throws EPPIXSeriousException {
	    logger.debug( "count( filter )" );
	    DAOParamQueryArgs args = filterQueryArgs( filter, null );
	    return dao.count( args.getDMLName(  ), args.getFilterBy(  ), args );
	}

	public BlhBillLimitHdDMO create(BlhBillLimitHdDMO blhBillLimitHdDMO)
			throws EPPIXSeriousException {
	    thrower.ifParameterMissing( "BlhBillLimitHdDMO", blhBillLimitHdDMO );
	    dao.insert( blhBillLimitHdDMO );
	    return blhBillLimitHdDMO;
	}

	public void delete(BlhBillLimitHdDMO blhBillLimitHdDMO)
			throws EPPIXSeriousException, EPPIXObjectNotFoundException,
			EPPIXObjectExpiredException {
	    thrower.ifParameterMissing( "BlhBillLimitHdDMO", blhBillLimitHdDMO );

	    thrower.ifParameterMissing( "PshParamServHdrDMO.blhSubscriberId",
	    		blhBillLimitHdDMO.getBlhSubscriberId());

	    thrower.ifParameterMissing( "PshParamServHdrDMO.blhServiceCode",
	    		blhBillLimitHdDMO.getBlhServiceCode());
	    
	    dao.delete( blhBillLimitHdDMO );
		
	}

	public void delete(QueryFilter filter) throws EPPIXSeriousException,
			EPPIXObjectNotFoundException, EPPIXObjectExpiredException {
	    logger.debug( "delete( filter )" );
	    thrower.ifParameterMissing( "filter", filter );

	    DAOParamQueryArgs args = filterQueryArgs( filter, null );

	    dao.delete( "BlhBillLimitHd", args.getFilterBy(  ), args );
	}

	public boolean exists(BlhBillLimitHdDMO blhBillLimitHdDMO)
			throws EPPIXSeriousException {
	    logger.debug( "exists( blhBillLimitHdDMO)" );
	    
	    thrower.ifParameterMissing( "BlhBillLimitHdDMO", blhBillLimitHdDMO );

	    thrower.ifParameterMissing( "PshParamServHdrDMO.blhSubscriberId",
	    		blhBillLimitHdDMO.getBlhSubscriberId());

	    thrower.ifParameterMissing( "PshParamServHdrDMO.blhServiceCode",
	    		blhBillLimitHdDMO.getBlhServiceCode());

	    return dao.exists( "BlhBillLimitHd", "filterByPrimaryKey",
	      new DAOArgs(2).arg( blhBillLimitHdDMO.getBlhSubscriberId()).arg(blhBillLimitHdDMO.getBlhServiceCode()));
	}

	public boolean exists(QueryFilter filter) throws EPPIXSeriousException {
	    logger.debug( "exists( filter )" );

	    return dao.exists( filterQueryArgs( filter, null ) );
	}

	public BlhBillLimitHdDMO get(QueryFilter filter)
			throws EPPIXSeriousException {
	    logger.debug( "get( filter )" );

	    DAOParamQueryArgs args = filterQueryArgs( filter, null );

	    return (BlhBillLimitHdDMO) dao.get( args.getDMLName(  ),
	      args.getFilterBy(  ), args );
	}

	public DTOList getList(BlhBillLimitHdDMO blhBillLimitHdDMO)
			throws EPPIXSeriousException {
	    logger.debug( "getList( state, blhBillLimitHdDMO )" );

	    return new DTOList(dao.getList(paramQueryArgs( blhBillLimitHdDMO)));
	}

	public DTOList getList(QueryFilter filter) throws EPPIXSeriousException {
	    logger.debug( "getList( state, filter )" );

	    return new DTOList(dao.getList( filterQueryArgs( filter, null )));
	}

	public DAOIterator iterate(QueryFilter filter) throws EPPIXSeriousException {
	    logger.debug( "iterate( filter )" );

	    return dao.iterator(filterQueryArgs( filter, null));
	}

	public DAOIterator iterateWithLock(QueryFilter filter)
			throws EPPIXSeriousException {
	    logger.debug( "iterateWithLock( filter )" );

	    return dao.iterator(filterQueryArgs( filter, null ), true );
	}

	public Object max(QueryFilter filter) throws EPPIXSeriousException {
	    logger.debug( "max( filter )" );

	    DAOParamQueryArgs args = filterQueryArgs( filter, null );

	    return dao.max( args.getDMLName(  ), args.getFilterBy(  ), args,
	      args.getMaxField(  ) );
	}

	public Object min(QueryFilter filter) throws EPPIXSeriousException {
	    logger.debug( "min( filter )" );

	    DAOParamQueryArgs args = filterQueryArgs( filter, null );

	    return dao.min( args.getDMLName(  ), args.getFilterBy(  ), args,
	      args.getMaxField());
	}

	public void modify(BlhBillLimitHdDMO blhBillLimitHdDMO)
			throws EPPIXSeriousException, EPPIXObjectExpiredException,
			EPPIXObjectNotFoundException {
	    logger.debug( "modify( blhBillLimitHdDMO )" );
	    thrower.ifParameterMissing( "blhBillLimitHdDMO", blhBillLimitHdDMO );
	    thrower.ifParameterMissing( "blhBillLimitHdDMO.getBlhSubscriberId()",
	    		blhBillLimitHdDMO.getBlhSubscriberId());
	    thrower.ifParameterMissing( "blhBillLimitHdDMO.getBlhServiceCode()",
	    		blhBillLimitHdDMO.getBlhServiceCode());
	    
	    dao.update( blhBillLimitHdDMO );
	}

	public void modify(QueryFilter filter) throws EPPIXSeriousException,
			EPPIXObjectExpiredException, EPPIXObjectNotFoundException {
	    logger.debug( "modify( filter )" );
	    thrower.ifParameterMissing( "filter", filter );
	    dao.updateCustom( new BlhBillLimitHdDMO(  ),
	      filterQueryArgs( filter, null ) );
		
	}
	
	protected DAOParamQueryArgs filterQueryArgs(QueryFilter filter, String dmlName ) {
		    List parts = filter.getParts(  );
		    DAOParamQueryArgs queryArgs = new DAOParamQueryArgs( ( dmlName == null )
		        ? "BlhBillLimitHd" : dmlName, parts.size(  ) );

		    Iterator it = parts.iterator();
		    	while(it.hasNext()){
		    		FilterPart part = (FilterPart)it.next();

		    	switch ( part.getIndex(  ) ) {
		        
		    	case BlhBillLimitHdDMO.blhSubscriberIdFilter:
		          part.andFilterBy( queryArgs, "BlhSubscriberId", dao.wildcardForAnySequence(  ) );
		        break;

		        case BlhBillLimitHdDMO.blhServiceCodeFilter:
		          part.andFilterBy( queryArgs, "BlhServiceCode",
		            dao.wildcardForAnySequence());
		        break;

		        case BlhBillLimitHdDMO.blhBillLimitValFilter:
		          part.andFilterBy( queryArgs, "BlhBillLimitVal",
		            dao.wildcardForAnySequence(  ) );
                break;

		        case BlhBillLimitHdDMO.blhLevelFilter:
		          part.andFilterBy( queryArgs, "BlhLevel",
		            dao.wildcardForAnySequence(  ) );
		        break;

		        case BlhBillLimitHdDMO.blhTypeFilter:
		          part.andFilterBy( queryArgs, "BlhType",
		            dao.wildcardForAnySequence(  ) );
    	        break;

		        case BlhBillLimitHdDMO.blhVatIndFilter:
		          part.andFilterBy( queryArgs, "BlhVatInd",
		            dao.wildcardForAnySequence(  ) );
    	        break;
		          
		        case BlhBillLimitHdDMO.blhUnbillUsageFilter:
			          part.andFilterBy( queryArgs, "blhUnbillUsage");
   	            break;
			          
		        case BlhBillLimitHdDMO.blhUnbillChargesFilter:
			          part.andFilterBy( queryArgs, "blhUnbillCharges");
                break;
			          
		        case BlhBillLimitHdDMO.blhDiffFilter:
			          part.andFilterBy( queryArgs, "blhDiff");
		        break;
			          
		        case BlhBillLimitHdDMO.blhUserStatusFilter:
			          part.andFilterBy( queryArgs, "blhUserStatus",
			            dao.wildcardForAnySequence());
			    break;

		        case BlhBillLimitHdDMO.blhNextThresholdFilter:
			          part.andFilterBy( queryArgs, "BlhNextThreshold");
		        break;
			          
		        case BlhBillLimitHdDMO.blhPrevThresholdFilter:
			          part.andFilterBy( queryArgs, "BlhPrevThreshold");
			    break;
			          
		        case BlhBillLimitHdDMO.blhNextacnIdFilter:
			          part.andFilterBy( queryArgs, "BlhNextacnId");
			    break;
			          
		        case BlhBillLimitHdDMO.blhPrevacnIdFilter:
			          part.andFilterBy( queryArgs, "BlhPrevacnId");
	            break;
			          
		        case BlhBillLimitHdDMO.blhNetworkAcnFilter:
			          part.andFilterBy( queryArgs, "BlhNetworkAcn",
			            dao.wildcardForAnySequence(  ) );
			    break;
			          
		        case BlhBillLimitHdDMO.blhTrigFlagFilter:
			          part.andFilterBy( queryArgs, "BlhTrigFlag",
			            dao.wildcardForAnySequence(  ) );
			    break;
			          
		        case BlhBillLimitHdDMO.blhLastUpdateFilter:
			          part.andFilterBy( queryArgs, "|BlhLastUpdate");
     	        break;
		      }
		    }

		    return queryArgs;
		  }
	
	  protected DAOParamQueryArgs paramQueryArgs(
			  BlhBillLimitHdDMO blhBillLimitHdDMO ) {
			    logger.debug( "paramQueryArgs( blhBillLimitHdDMO)" );

			    DAOParamQueryArgs queryArgs = new DAOParamQueryArgs( "BlhBillLimitHdDMO",
			        17 * 2 );

			    if ( blhBillLimitHdDMO != null ) {
			      // primary key filters...
      
			  	Integer blhSubscriberId = blhBillLimitHdDMO.getBlhSubscriberId();

			      if ( !DMO.isNull( blhSubscriberId ) ) {
				        queryArgs.andFilterBy( "blhSubscriberId" )
				                 .arg( blhSubscriberId );
				      }
			      
			  	String blhServiceCode = blhBillLimitHdDMO.getBlhServiceCode();
				
			      if ( !DMO.isNull( blhServiceCode ) ) {
				        queryArgs.andFilterBy( "blhServiceCode" )
				                 .arg( blhServiceCode );
				      }
			      
			      BigDecimal blhBillLimitVal = blhBillLimitHdDMO.getBlhBillLimitVal();
			      
			      if ( !DMO.isNull( blhBillLimitVal ) ) {
				        queryArgs.andFilterBy( "blhBillLimitVal" )
				                 .arg( blhBillLimitVal );
				      }
			      
			    String blhLevel = blhBillLimitHdDMO.getBlhLevel();
			      if ( !DMO.isNull( blhLevel ) ) {
				        queryArgs.andFilterBy( "blhLevel" )
				                 .arg( blhLevel );
				      }
			    
			    String blhType = blhBillLimitHdDMO.getBlhType();
			      if ( !DMO.isNull( blhType ) ) {
				        queryArgs.andFilterBy( "blhType" )
				                 .arg( blhType );
				      }
			    
			    String blhVatInd = blhBillLimitHdDMO.getBlhVatInd();
			      if ( !DMO.isNull( blhVatInd ) ) {
				        queryArgs.andFilterBy( "blhVatInd" )
				                 .arg( blhVatInd );
				      }
			    
			    BigDecimal blhUnbillUsage = blhBillLimitHdDMO.getBlhUnbillUsage();
			      if ( !DMO.isNull( blhUnbillUsage ) ) {
				        queryArgs.andFilterBy( "blhUnbillUsage" )
				                 .arg( blhUnbillUsage );
				      }
			    
			    BigDecimal blhUnbillCharges = blhBillLimitHdDMO.getBlhUnbillCharges();
			      if ( !DMO.isNull( blhUnbillCharges ) ) {
				        queryArgs.andFilterBy( "blhUnbillCharges" )
				                 .arg( blhUnbillCharges );
				      }
			    
			    Integer blhDiff = blhBillLimitHdDMO.getBlhDiff();
			      if ( !DMO.isNull( blhDiff ) ) {
				        queryArgs.andFilterBy( "blhDiff" )
				                 .arg( blhDiff );
				      }
			    
			    String blhUserStatus = blhBillLimitHdDMO.getBlhUserStatus();
			      if ( !DMO.isNull( blhUserStatus ) ) {
				        queryArgs.andFilterBy( "blhUserStatus" )
				                 .arg( blhUserStatus );
				      }
			    
			    BigDecimal blhNextThreshold = blhBillLimitHdDMO.getBlhNextThreshold();
			      if ( !DMO.isNull( blhNextThreshold ) ) {
				        queryArgs.andFilterBy( "blhNextThreshold" )
				                 .arg( blhNextThreshold );
				      }
			    
			    BigDecimal blhPrevThreshold= blhBillLimitHdDMO.getBlhPrevThreshold();
			      if ( !DMO.isNull( blhPrevThreshold ) ) {
				        queryArgs.andFilterBy( "blhPrevThreshold" )
				                 .arg( blhPrevThreshold );
				      }
			    
			    Integer blhNextacnId= blhBillLimitHdDMO.getBlhNextacnId();
			      if ( !DMO.isNull( blhNextacnId ) ) {
				        queryArgs.andFilterBy( "blhNextacnId" )
				                 .arg( blhNextacnId );
				      }
			    
			    Integer blhPrevacnId= blhBillLimitHdDMO.getBlhPrevacnId();
			      if ( !DMO.isNull( blhPrevacnId ) ) {
				        queryArgs.andFilterBy( "blhPrevacnId" )
				                 .arg( blhPrevacnId );
				      }
			    
			    String blhNetworkAcn= blhBillLimitHdDMO.getBlhNetworkAcn();
			      if ( !DMO.isNull( blhNetworkAcn ) ) {
				        queryArgs.andFilterBy( "blhNetworkAcn" )
				                 .arg( blhNetworkAcn );
				      }
			    
			    String blhTrigFlag= blhBillLimitHdDMO.getBlhTrigFlag();
			      if ( !DMO.isNull( blhTrigFlag ) ) {
				        queryArgs.andFilterBy( "blhTrigFlag" )
				                 .arg( blhTrigFlag );
				      }
			    
			    DateTime blhLastUpdate= blhBillLimitHdDMO.getBlhLastUpdate();
			      if ( !DMO.isNull( blhLastUpdate ) ) {
			        queryArgs.andFilterBy( "blhLastUpdate" )
			                 .arg( blhLastUpdate );
			      }			      
			    }
			    return queryArgs;    
	  }

	public BlhBillLimitHdDMO get(BlhBillLimitHdDMO blhBillLimitHdDMO)
			throws EPPIXSeriousException {
	    logger.debug( "get( BlhBillLimitHdDMO )" );

	    thrower.ifParameterMissing( "BlhBillLimitHdDMO", blhBillLimitHdDMO );
	    thrower.ifParameterMissing( "BlhBillLimitHdDMO.getBlhSubscriberId()", blhBillLimitHdDMO.getBlhSubscriberId() );
//	    thrower.ifParameterMissing( "BlhBillLimitHdDMO.getBlhServiceCode()", blhBillLimitHdDMO.getBlhServiceCode() );

	    return (BlhBillLimitHdDMO) dao.get( blhBillLimitHdDMO );
	}

}
