package com.eppixcomm.eppix.base.blo;

import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;

import com.eppixcomm.eppix.common.data.DAC;
import com.eppixcomm.eppix.common.data.DAO;
import com.eppixcomm.eppix.common.data.DAOParamQueryArgs;
import com.eppixcomm.eppix.common.data.DAOThrower;
import com.eppixcomm.eppix.common.data.IntegerDMO;
import com.eppixcomm.eppix.common.util.FilterPart;
import com.eppixcomm.eppix.common.util.QueryFilter;
import com.eppixcomm.eppix.common.data.DTOList;
import com.eppixcomm.eppix.common.data.DTOListState;
import com.eppixcomm.eppix.base.error.EPPIXSeriousException;

public class EiEppixIsisAbstractDACImpl extends DAC implements EiEppixIsisAbstractDAC{

	 static DAOThrower thrower = DAOThrower.getDAOThrower( EqEventQueueAbstractDACImpl.class );
	 Logger logger = thrower.getLogger();	
	 
	protected EiEppixIsisAbstractDACImpl(DAOThrower thrower, DAO dao, String defaultLanguageCode) {
		super(thrower, dao, defaultLanguageCode);
	}
	
	public EiEppixIsisAbstractDACImpl(DAO dao) {
		super(dao, thrower);
	}
	
	protected DAOParamQueryArgs filterQueryArgs( 
		    QueryFilter filter,
		    String      dmlName ) {
	  		logger.debug( "filterQueryArgs(QueryFilter filter,String dmlName )");
	  
		    List parts = filter.getParts(  );
		    DAOParamQueryArgs queryArgs = new DAOParamQueryArgs((dmlName == null )
		        ? "EiEppixIsis" : dmlName, parts.size());

		    Iterator it = parts.iterator();
		    while(it.hasNext()){
		    	FilterPart part = (FilterPart)it.next();
		      switch ( part.getIndex(  ) ) {
		        case EiEppixIsisDMO.eiBillCycleFilter:
		          part.andFilterBy( queryArgs, "EiBillCycle",
		            dao.wildcardForAnySequence(  ) );

		          break;

		        case EiEppixIsisDMO.eiServProvFilter:
		          part.andFilterBy( queryArgs, "EiServProv",
		            dao.wildcardForAnySequence(  ) );
		          break;
		      }
		    } 
		    return queryArgs;
		  }	
		  
	protected DAOParamQueryArgs paramQueryArgs(EiEppixIsisDMO eiDMO) {
		    logger.debug( "paramQueryArgs(EiEppixIsisDMO eiDMO)" );

		    DAOParamQueryArgs queryArgs = new DAOParamQueryArgs( "EiEppixIsis", 4);

		    if ( eiDMO != null ) {
		      // primary key filters...
		      // define more filters...
		      String eiBillCycle = eiDMO.getEiBillCycle();

		      if ( !eiDMO.isNull( eiBillCycle ) ) {
		        queryArgs.andFilterBy( "equalEiBillCycle" )
		                 .arg( eiBillCycle);
		      }

		      Integer eiProvId = eiDMO.getEiServProv();

		      if ( !eiDMO.isNull(eiProvId)) {
		        queryArgs.andFilterBy( "equalEiServProv" )
		                 .arg( eiProvId);
		      }

		    } else {
		      // include all default languageCode filters where appropriate...
		    }

		    return queryArgs;
		  }	
  
	public DTOList getList(DTOListState state, EiEppixIsisDMO eiDMO) throws EPPIXSeriousException{
		logger.debug( "getList(DTOListState state,  EiEppixIsisDMO eiDMO)");
        return new DTOList(dao.getList( paramQueryArgs( eiDMO )));
	}

	public DTOList getEiEppixIsisbySpid(DTOListState state,
			EiEppixIsisDMO eiDMO) throws EPPIXSeriousException {
		logger.debug( "getList(DTOListState state,  EiEppixIsisDMO eiDMO)");
        return new DTOList(dao.getList("getEiEppixIsisBySpid", paramQueryArgs( eiDMO )));
	}
	
	

}
