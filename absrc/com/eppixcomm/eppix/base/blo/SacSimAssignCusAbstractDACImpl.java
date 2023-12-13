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
//import com.eppixcomm.eppix.common.util.FilterOp;
import com.eppixcomm.eppix.common.util.FilterPart;
import com.eppixcomm.eppix.common.util.QueryFilter;



public class SacSimAssignCusAbstractDACImpl extends DAC implements SacSimAssignCusAbstractDAC{
	  static DAOThrower thrower = DAOThrower.getDAOThrower( SacSimAssignCusAbstractDACImpl.class );
	  Logger logger = thrower.getLogger(  );

	public SacSimAssignCusAbstractDACImpl(DAO dao, DAOThrower thrower) {
		super(dao, thrower);
	}

	public SacSimAssignCusAbstractDACImpl(DAO dao) {
		super(dao, thrower);
	}

	  public SacSimAssignCusDMO get( SacSimAssignCusDMO sacSimAssignCusDMO )
	    throws EPPIXSeriousException {
	    logger.debug( "get( SacSimAssignCusDMO )" );

	    thrower.ifParameterMissing("SacSimAssignCusDMO", sacSimAssignCusDMO);

	    return (SacSimAssignCusDMO) dao.get( sacSimAssignCusDMO );
	  }


	  public void create( SacSimAssignCusDMO sacSimAssignCusDMO )
	    throws EPPIXSeriousException {
	    logger.debug( "create( sacSimAssignCusDMO )" );
	    thrower.ifParameterMissing( "SacSimAssignCusDMO", sacSimAssignCusDMO );

	    dao.insert( sacSimAssignCusDMO );

	  }

	  public void modify( QueryFilter filter )
	    throws EPPIXSeriousException, EPPIXObjectExpiredException,
	      EPPIXObjectNotFoundException {
	    logger.debug( "modify( filter )" );

	    thrower.ifParameterMissing( "filter", filter );

	    dao.updateCustom( new SacSimAssignCusDMO(  ),
	      filterQueryArgs( filter, "SacSimAssignCus" ) );
	  }


	  public void delete( SacSimAssignCusDMO sacSimAssignCusDMO )
	    throws EPPIXSeriousException, EPPIXObjectNotFoundException,
	      EPPIXObjectExpiredException {
	    logger.debug( "delete( SacSimAssignCusDMO )" );

	    thrower.ifParameterMissing( "SacSimAssignCusDMO", sacSimAssignCusDMO );


	    dao.delete(sacSimAssignCusDMO);
	  }


	  public void delete( QueryFilter filter )
	    throws EPPIXSeriousException, EPPIXObjectNotFoundException,
	      EPPIXObjectExpiredException {
	    logger.debug( "delete( filter )" );

	    thrower.ifParameterMissing( "filter", filter );

	    DAOParamQueryArgs args = filterQueryArgs( filter, "SacSimAssignCus" );

	    dao.delete( "SacSimAssignCus", args.getFilterBy(  ), args );
	  }


	  public boolean exists( SacSimAssignCusDMO sacSimAssignCusDMO )
	    throws EPPIXSeriousException {
	    logger.debug( "exists( SacSimAssignCusDMO)" );

	    return dao.exists(sacSimAssignCusDMO);
	  }


	  public boolean exists( QueryFilter filter )
	    throws EPPIXSeriousException {
	    logger.debug( "exists( filter )" );

	    return dao.exists( filterQueryArgs( filter, null ) );
	  }


	  public DTOList getList(DTOListState state, SacSimAssignCusDMO sacSimAssignCusDMO )
	    throws EPPIXSeriousException {
	    logger.debug( "getList( state, sacSimAssignCusDMO )" );

	    return new DTOList(dao.getList(paramQueryArgs( sacSimAssignCusDMO)));
	  }


	  protected DAOParamQueryArgs paramQueryArgs(
	    SacSimAssignCusDMO sacSimAssignCusDMO ) {
	    logger.debug( "paramQueryArgs( sacSimAssignCusDMO)" );

	    DAOParamQueryArgs queryArgs = new DAOParamQueryArgs( "SacSimAssignCus",
	        2 * 2 );

	    if ( sacSimAssignCusDMO != null ) {

	      String SacBillAcNo = sacSimAssignCusDMO.getSacBillAcNo();

	      if ( !DMO.isNull( SacBillAcNo ) ) {
	        queryArgs.andFilterBy( "SacBillAcNoMatch" )
	                 .arg( SacBillAcNo );
	      }


	      String SacSimNo = sacSimAssignCusDMO.getSacSimNo();

	      if ( !DMO.isNull( SacSimNo ) ) {
	        queryArgs.andFilterBy( "SacSimNoMatch" )
	                 .arg( SacSimNo );
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
	        ? "SacSimAssignCus" : dmlName, parts.size(  ) );

	    Iterator it = parts.iterator();
	    	while(it.hasNext()){
	    		FilterPart part = (FilterPart)it.next();

	      switch (part.getIndex()) {
	        case SacSimAssignCusDMO.sacBillAcNoFilter:
	          part.andFilterBy( queryArgs, "SacBillAcNo", dao.wildcardForAnySequence(  ) );
	          break;

	        case SacSimAssignCusDMO.sacSimNoFilter:
	          part.andFilterBy( queryArgs, "SacSimNo", dao.wildcardForAnySequence(  ) );
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


	  public SacSimAssignCusDMO get( QueryFilter filter )
	    throws EPPIXSeriousException {
	    logger.debug( "get( filter )" );

	    DAOParamQueryArgs args = filterQueryArgs( filter, "SacSimAssignCus");

	    return (SacSimAssignCusDMO) dao.get( args.getDMLName(  ),
	      args.getFilterBy(  ), args );
	  }


	  public Object max( QueryFilter filter )
	    throws EPPIXSeriousException {
	    logger.debug( "max( filter )" );

	    DAOParamQueryArgs args = filterQueryArgs( filter, "SacSimAssignCus" );

	    return dao.max( args.getDMLName(  ), args.getFilterBy(  ), args,
	      args.getMaxField(  ) );
	  }


	  public Object min( QueryFilter filter )
	    throws EPPIXSeriousException {
	    logger.debug( "min( filter )" );

	    DAOParamQueryArgs args = filterQueryArgs( filter, "SacSimAssignCus" );

	    return dao.min( args.getDMLName(  ), args.getFilterBy(  ), args,
	      args.getMaxField(  ) );
	  }


	  public int count( QueryFilter filter )
	    throws EPPIXSeriousException {
	    logger.debug( "count( filter )" );

	    DAOParamQueryArgs args = filterQueryArgs( filter, "SacSimAssignCus" );

	    return dao.count( args.getDMLName(  ), args.getFilterBy(  ), args );
	  }

}