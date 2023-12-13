package com.eppixcomm.eppix.base.blo;

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
import com.eppixcomm.eppix.common.data.DTOListState;
import com.eppixcomm.eppix.common.util.FilterPart;
import com.eppixcomm.eppix.common.util.QueryFilter;

public class SpvParamValuesAbstractDACImpl extends DAC implements SpvParamValuesAbstractDAC{
	  static DAOThrower thrower = DAOThrower.getDAOThrower( SpvParamValuesAbstractDACImpl.class );
	  Logger logger = thrower.getLogger(  );

	public SpvParamValuesAbstractDACImpl(DAO dao, DAOThrower thrower) {
		super(dao, thrower);
	}

	public SpvParamValuesAbstractDACImpl(DAO dao) {
		super(dao, thrower);
	}

	  public SpvParamValuesDMO get( SpvParamValuesDMO spvParamValuesDMO )
	    throws EPPIXSeriousException {
	    logger.debug( "get( SpvParamValuesDMO )" );

	    thrower.ifParameterMissing("SpvParamValuesDMO", spvParamValuesDMO);

	    return (SpvParamValuesDMO) dao.get( spvParamValuesDMO );
	  }


	  public void create( SpvParamValuesDMO spvParamValuesDMO )
	    throws EPPIXSeriousException {
	    logger.debug( "create( spvParamValuesDMO )" );
	    thrower.ifParameterMissing( "SpvParamValuesDMO", spvParamValuesDMO );

	    dao.insert( spvParamValuesDMO );

	  }

	  public void modify( QueryFilter filter )
	    throws EPPIXSeriousException, EPPIXObjectExpiredException,
	      EPPIXObjectNotFoundException {
	    logger.debug( "modify( filter )" );

	    thrower.ifParameterMissing( "filter", filter );

	    dao.updateCustom( new SpvParamValuesDMO(  ),
	      filterQueryArgs( filter, "SpvParamValues" ) );
	  }


	  public void delete( SpvParamValuesDMO spvParamValuesDMO )
	    throws EPPIXSeriousException, EPPIXObjectNotFoundException,
	      EPPIXObjectExpiredException {
	    logger.debug( "delete( SpvParamValuesDMO )" );

	    thrower.ifParameterMissing( "SpvParamValuesDMO", spvParamValuesDMO );


	    dao.delete(spvParamValuesDMO);
	  }


	  public void delete( QueryFilter filter )
	    throws EPPIXSeriousException, EPPIXObjectNotFoundException,
	      EPPIXObjectExpiredException {
	    logger.debug( "delete( filter )" );

	    thrower.ifParameterMissing( "filter", filter );

	    DAOParamQueryArgs args = filterQueryArgs( filter, "SpvParamValues" );

	    dao.delete( "SpvParamValues", args.getFilterBy(  ), args );
	  }


	  public boolean exists( SpvParamValuesDMO spvParamValuesDMO )
	    throws EPPIXSeriousException {
	    logger.debug( "exists( SpvParamValuesDMO)" );

//	    QueryFilter filter = new QueryFilter();
//	    filter.add(FilterOp.EQUAL, SpvParamValuesDMO.hmManuIdFilter, spvParamValuesDMO.getHmManuId());
//
//	    return this.exists(filter);
	    return dao.exists(spvParamValuesDMO);
	  }


	  public boolean exists( QueryFilter filter )
	    throws EPPIXSeriousException {
	    logger.debug( "exists( filter )" );

	    return dao.exists( filterQueryArgs( filter, null ) );
	  }


	  public DTOList getList(DTOListState state, SpvParamValuesDMO spvParamValuesDMO )
	    throws EPPIXSeriousException {
	    logger.debug( "getList( state, spvParamValuesDMO )" );

	    return new DTOList(dao.getList(paramQueryArgs( spvParamValuesDMO)));
	  }


	  protected DAOParamQueryArgs paramQueryArgs(
	    SpvParamValuesDMO spvParamValuesDMO ) {
	    logger.debug( "paramQueryArgs( spvParamValuesDMO)" );

	    DAOParamQueryArgs queryArgs = new DAOParamQueryArgs( "SpvParamValues",
	        2 * 2 );

	    if ( spvParamValuesDMO != null ) {

	      Integer SpvParamId = spvParamValuesDMO.getSpvParamId();

	      if ( !DMO.isNull( SpvParamId ) ) {
	        queryArgs.andFilterBy( "SpvParamIdMatch" )
	                 .arg( SpvParamId );
	      }


	      String SpvParamValue = spvParamValuesDMO.getSpvParamValue();

	      if ( !DMO.isNull( SpvParamValue ) ) {
	        queryArgs.andFilterBy( "SpvParamValueMatch" )
	                 .arg( SpvParamValue );
	      }


	      String SpvActCharge = spvParamValuesDMO.getSpvActCharge();

	      if ( !DMO.isNull( SpvActCharge ) ) {
	        queryArgs.andFilterBy( "SpvActChargeMatch" )
	                 .arg( SpvActCharge );
	      }


	      String SpvChargeCode = spvParamValuesDMO.getSpvChargeCode();

	      if ( !DMO.isNull( SpvChargeCode ) ) {
	        queryArgs.andFilterBy( "SpvChargeCodeMatch" )
	                 .arg( SpvChargeCode );
	      }


	      String SpvDefaultValue = spvParamValuesDMO.getSpvDefaultValue();

	      if ( !DMO.isNull( SpvDefaultValue ) ) {
	        queryArgs.andFilterBy( "SpvDefaultValueMatch" )
	                 .arg( SpvDefaultValue );
	      }


	      String SpvNetwrkCode = spvParamValuesDMO.getSpvNetwrkCode();

	      if ( !DMO.isNull( SpvNetwrkCode ) ) {
	        queryArgs.andFilterBy( "SpvNetwrkCodeMatch" )
	                 .arg( SpvNetwrkCode );
	      }

	    } else {
	      // include all default languageCode filters where appropriate...
	    }

	    return queryArgs;
	  }


	  public DTOList getList(
	    DTOListState state,
	    QueryFilter  filter )
	    throws EPPIXSeriousException {
	    logger.debug( "getList( state, filter )" );

	    return new DTOList(dao.getList( filterQueryArgs( filter, null )));
	  }


	  protected DAOParamQueryArgs filterQueryArgs(QueryFilter filter, String dmlName ) {
	    List parts = filter.getParts(  );
	    DAOParamQueryArgs queryArgs = new DAOParamQueryArgs( ( dmlName == null )
	        ? "SpvParamValues" : dmlName, parts.size(  ) );

	    Iterator it = parts.iterator();
	    	while(it.hasNext()){
	    		FilterPart part = (FilterPart)it.next();

	      switch (part.getIndex()) {
	        case SpvParamValuesDMO.spvParamIdFilter:
	          part.andFilterBy( queryArgs, "spvParamId", dao.wildcardForAnySequence(  ) );
	          break;

	        case SpvParamValuesDMO.spvParamValueFilter:
	          part.andFilterBy( queryArgs, "spvParamValue", dao.wildcardForAnySequence(  ) );
	          break;

	        case SpvParamValuesDMO.spvActChargeFilter:
	          part.andFilterBy( queryArgs, "spvActCharge", dao.wildcardForAnySequence(  ) );
	          break;

	        case SpvParamValuesDMO.spvChargeCodeFilter:
	          part.andFilterBy( queryArgs, "spvChargeCode", dao.wildcardForAnySequence(  ) );
	          break;

	        case SpvParamValuesDMO.spvDefaultValueFilter:
	          part.andFilterBy( queryArgs, "spvDefaultValue", dao.wildcardForAnySequence(  ) );
	          break;

	        case SpvParamValuesDMO.spvNetwrkCodeFilter:
	          part.andFilterBy( queryArgs, "spvNetwrkCode", dao.wildcardForAnySequence(  ) );
	          break;

	      }
	    }

	    return queryArgs;
	  }


	  public DAOIterator iterate( QueryFilter filter )
	    throws EPPIXSeriousException {
	    logger.debug( "iterate( filter )" );

	    return dao.iterator(filterQueryArgs( filter, null ) );

	  }

	  public DAOIterator iterateWithLock( QueryFilter filter )
	    throws EPPIXSeriousException {
	    logger.debug( "iterateWithLock( filter )" );

	    return dao.iterator(filterQueryArgs( filter, null ), true );

	  }


	  public SpvParamValuesDMO get( QueryFilter filter )
	    throws EPPIXSeriousException {
	    logger.debug( "get( filter )" );

	    DAOParamQueryArgs args = filterQueryArgs( filter, "SpvParamValues");

	    return (SpvParamValuesDMO) dao.get( args.getDMLName(  ),
	      args.getFilterBy(  ), args );
	  }


	  public Object max( QueryFilter filter )
	    throws EPPIXSeriousException {
	    logger.debug( "max( filter )" );

	    DAOParamQueryArgs args = filterQueryArgs( filter, "SpvParamValues" );

	    return dao.max( args.getDMLName(  ), args.getFilterBy(  ), args,
	      args.getMaxField(  ) );
	  }


	  public Object min( QueryFilter filter )
	    throws EPPIXSeriousException {
	    logger.debug( "min( filter )" );

	    DAOParamQueryArgs args = filterQueryArgs( filter, "SpvParamValues" );

	    return dao.min( args.getDMLName(  ), args.getFilterBy(  ), args,
	      args.getMaxField(  ) );
	  }


	  public int count( QueryFilter filter )
	    throws EPPIXSeriousException {
	    logger.debug( "count( filter )" );

	    DAOParamQueryArgs args = filterQueryArgs( filter, "SpvParamValues" );

	    return dao.count( args.getDMLName(  ), args.getFilterBy(  ), args );
	  }

	public void modify(SpvParamValuesDMO spvParamValuesDMO)
			throws EPPIXSeriousException, EPPIXObjectExpiredException,
			EPPIXObjectNotFoundException {
		// TODO Auto-generated method stub
		
	}
}