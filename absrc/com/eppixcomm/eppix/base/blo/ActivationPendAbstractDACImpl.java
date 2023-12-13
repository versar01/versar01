package com.eppixcomm.eppix.base.blo;

import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;

//import com.eppixcomm.eppix.base.error.EPPIXObjectBusyException;
import com.eppixcomm.eppix.base.error.EPPIXObjectExpiredException;
import com.eppixcomm.eppix.base.error.EPPIXObjectNotFoundException;
import com.eppixcomm.eppix.base.error.EPPIXSeriousException;
import com.eppixcomm.eppix.common.data.DAC;
import com.eppixcomm.eppix.common.data.DAO;
//import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DAOIterator;
import com.eppixcomm.eppix.common.data.DAOParamQueryArgs;
import com.eppixcomm.eppix.common.data.DAOThrower;
import com.eppixcomm.eppix.common.data.DMO;
import com.eppixcomm.eppix.common.data.DTOList;
import com.eppixcomm.eppix.common.data.DTOListState;
import com.eppixcomm.eppix.common.util.FilterOp;
import com.eppixcomm.eppix.common.util.FilterPart;
import com.eppixcomm.eppix.common.util.QueryFilter;



public class ActivationPendAbstractDACImpl extends DAC implements ActivationPendAbstractDAC{
	  static DAOThrower thrower = DAOThrower.getDAOThrower( ActivationPendAbstractDACImpl.class );
	  Logger logger = thrower.getLogger(  );

	public ActivationPendAbstractDACImpl(DAO dao, DAOThrower thrower) {
		super(dao, thrower);
	}

	public ActivationPendAbstractDACImpl(DAO dao) {
		super(dao, thrower);
	}

	  public ActivationPendDMO get( ActivationPendDMO activationPendDMO )
	    throws EPPIXSeriousException {
	    logger.debug( "get( ActivationPendDMO )" );

	    thrower.ifParameterMissing("ActivationPendDMO", activationPendDMO);

	    return (ActivationPendDMO) dao.get( activationPendDMO );
	  }


	  public void create( ActivationPendDMO activationPendDMO )
	    throws EPPIXSeriousException {
	    logger.debug( "create( activationPendDMO )" );
	    thrower.ifParameterMissing( "ActivationPendDMO", activationPendDMO );

	    dao.insert( activationPendDMO );

	  }

	  public void modify( QueryFilter filter )
	    throws EPPIXSeriousException, EPPIXObjectExpiredException,
	      EPPIXObjectNotFoundException {
	    logger.debug( "modify( filter )" );

	    thrower.ifParameterMissing( "filter", filter );

	    dao.updateCustom( new ActivationPendDMO(  ),
	      filterQueryArgs( filter, "ActivationPend" ) );
	  }


	  public void delete( ActivationPendDMO activationPendDMO )
	    throws EPPIXSeriousException, EPPIXObjectNotFoundException,
	      EPPIXObjectExpiredException {
	    logger.debug( "delete( ActivationPendDMO )" );

	    thrower.ifParameterMissing( "ActivationPendDMO", activationPendDMO );
	    thrower.ifParameterMissing( "ActivationPendDMO.getMsisdnNo()", activationPendDMO.getMsisdnNo() );


	    dao.delete(activationPendDMO);
	  }


	  public void delete( QueryFilter filter )
	    throws EPPIXSeriousException, EPPIXObjectNotFoundException,
	      EPPIXObjectExpiredException {
	    logger.debug( "delete( filter )" );

	    thrower.ifParameterMissing( "filter", filter );

	    DAOParamQueryArgs args = filterQueryArgs( filter, "ActivationPend" );

	    dao.delete( "ActivationPend", args.getFilterBy(  ), args );
	  }


	  public boolean exists( ActivationPendDMO activationPendDMO )
	    throws EPPIXSeriousException {
	    logger.debug( "exists( ActivationPendDMO)" );

	    QueryFilter filter = new QueryFilter();
	    filter.add(FilterOp.EQUAL, ActivationPendDMO.MsisdnNoFilter, activationPendDMO.getMsisdnNo());

	    return this.exists(filter);

	  }


	  public boolean exists( QueryFilter filter )
	    throws EPPIXSeriousException {
	    logger.debug( "exists( filter )" );

	    return dao.exists( filterQueryArgs( filter, null ) );
	  }


	  public DTOList getList(DTOListState state, ActivationPendDMO activationPendDMO )
	    throws EPPIXSeriousException {
	    logger.debug( "getList( state, activationPendDMO )" );

	    return new DTOList(dao.getList(paramQueryArgs( activationPendDMO)));
	  }


	  protected DAOParamQueryArgs paramQueryArgs(
	    ActivationPendDMO activationPendDMO ) {
	    logger.debug( "paramQueryArgs( activationPendDMO)" );

	    DAOParamQueryArgs queryArgs = new DAOParamQueryArgs( "ActivationPend",
	        2 * 2 );

	    if ( activationPendDMO != null ) {

	      String MsisdnNo = activationPendDMO.getMsisdnNo();

	      if ( !DMO.isNull( MsisdnNo ) ) {
	        queryArgs.andFilterBy( "MsisdnNoMatch" )
	                 .arg( MsisdnNo );
	      }


	      String SimNo = activationPendDMO.getSimNo();

	      if ( !DMO.isNull( SimNo ) ) {
	        queryArgs.andFilterBy( "SimNoMatch" )
	                 .arg( SimNo );
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
	        ? "ActivationPend" : dmlName, parts.size(  ) );

	    Iterator it = parts.iterator();
	    	while(it.hasNext()){
	    		FilterPart part = (FilterPart)it.next();

	      switch (part.getIndex()) {
	        case ActivationPendDMO.MsisdnNoFilter:
	          part.andFilterBy( queryArgs, "MsisdnNo", dao.wildcardForAnySequence(  ) );
	          break;

	        case ActivationPendDMO.SimNoFilter:
	          part.andFilterBy( queryArgs, "SimNo", dao.wildcardForAnySequence(  ) );
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


	  public ActivationPendDMO get( QueryFilter filter )
	    throws EPPIXSeriousException {
	    logger.debug( "get( filter )" );
	    DAOParamQueryArgs args = filterQueryArgs( filter, "ActivationPend");

	    return (ActivationPendDMO) dao.get( args.getDMLName(  ),
	      args.getFilterBy(  ), args );
	  }


	  public Object max( QueryFilter filter )
	    throws EPPIXSeriousException {
	    logger.debug( "max( filter )" );

	    DAOParamQueryArgs args = filterQueryArgs( filter, "ActivationPend" );

	    return dao.max( args.getDMLName(  ), args.getFilterBy(  ), args,
	      args.getMaxField(  ) );
	  }


	  public Object min( QueryFilter filter )
	    throws EPPIXSeriousException {
	    logger.debug( "min( filter )" );

	    DAOParamQueryArgs args = filterQueryArgs( filter, "ActivationPend" );

	    return dao.min( args.getDMLName(  ), args.getFilterBy(  ), args,
	      args.getMaxField(  ) );
	  }


	  public int count( QueryFilter filter )
	    throws EPPIXSeriousException {
	    logger.debug( "count( filter )" );

	    DAOParamQueryArgs args = filterQueryArgs( filter, "ActivationPend" );

	    return dao.count( args.getDMLName(  ), args.getFilterBy(  ), args );
	  }
}