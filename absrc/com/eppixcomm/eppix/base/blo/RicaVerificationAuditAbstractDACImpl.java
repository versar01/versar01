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
import com.eppixcomm.eppix.common.util.DateTime;
import com.eppixcomm.eppix.common.util.FilterPart;
import com.eppixcomm.eppix.common.util.QueryFilter;



public class RicaVerificationAuditAbstractDACImpl extends DAC implements RicaVerificationAuditAbstractDAC{
	  static DAOThrower thrower = DAOThrower.getDAOThrower( RicaVerificationAuditAbstractDACImpl.class );

	  Logger logger = thrower.getLogger(  );	

	public RicaVerificationAuditAbstractDACImpl(DAO dao, DAOThrower thrower) {
		super(dao, thrower);
	}

	public RicaVerificationAuditAbstractDACImpl(DAO dao) {
		super(dao, thrower);
	}
	
	public int count(QueryFilter filter) throws EPPIXSeriousException {
	    logger.debug( "count( filter )" );

	    DAOParamQueryArgs args = filterQueryArgs( filter, null );

	    return dao.count( args.getDMLName(  ), args.getFilterBy(  ), args );
	}

	public void create(RicaVerificationAuditDMO ricaVerificationAuditDMO)
			throws EPPIXSeriousException {
		// TODO Auto-generated method stub    logger.debug( "create( varDMO )" );
	    thrower.ifParameterMissing( "RicaVerificationAuditDMO", ricaVerificationAuditDMO );

	    dao.insert( ricaVerificationAuditDMO );		
	}

	public void delete(RicaVerificationAuditDMO ricaVerificationAuditDMO)
			throws EPPIXSeriousException, EPPIXObjectNotFoundException,
			EPPIXObjectExpiredException {
	    logger.debug( "delete( RicaVerificationAuditDMO )" );

	    thrower.ifParameterMissing( "RicaVerificationAuditDMO", ricaVerificationAuditDMO );

	    thrower.ifParameterMissing( "RicaVerificationAuditDMO.pshId",
	    		ricaVerificationAuditDMO.getRvaSerial());

	    dao.delete( ricaVerificationAuditDMO );
		
	}

	public void delete(QueryFilter filter) throws EPPIXSeriousException,
			EPPIXObjectNotFoundException, EPPIXObjectExpiredException {
	    logger.debug( "delete( filter )" );

	    thrower.ifParameterMissing( "filter", filter );

	    DAOParamQueryArgs args = filterQueryArgs( filter, null );

	    dao.delete( "RicaVerificationAudit", args.getFilterBy(  ), args );
		
	}

	public boolean exists(RicaVerificationAuditDMO ricaVerificationAuditDMO)
			throws EPPIXSeriousException {
	    logger.debug( "exists( RicaVerificationAuditDMO)" );

	    return dao.exists( "RicaVerificationAudit", "filterByPrimaryKey",
	      new DAOArgs( 1 ).arg( ricaVerificationAuditDMO.getRvaRpvSerial()));
	}

	public boolean exists(QueryFilter filter) throws EPPIXSeriousException {
	    logger.debug( "exists( filter )" );

	    return dao.exists( filterQueryArgs( filter, null ) );
	}

	public RicaVerificationAuditDMO get(QueryFilter filter)
			throws EPPIXSeriousException {
	    logger.debug( "get( filter )" );

	    DAOParamQueryArgs args = filterQueryArgs( filter, null );

	    return (RicaVerificationAuditDMO) dao.get( args.getDMLName(  ),
	      args.getFilterBy(  ), args );
	}

	public DAOIterator iterate(QueryFilter filter) throws EPPIXSeriousException {
	    logger.debug( "iterate( filter )" );

	    return dao.iterator(filterQueryArgs( filter, null ) );
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
	      args.getMaxField(  ) );
	}

	public void modify(RicaVerificationAuditDMO ricaVerificationAuditDMO)
			throws EPPIXSeriousException, EPPIXObjectExpiredException,
			EPPIXObjectNotFoundException {
	    logger.debug( "modify( RicaVerificationAuditDMO )" );

	    thrower.ifParameterMissing( "RicaVerificationAuditDMO", ricaVerificationAuditDMO );

	    thrower.ifParameterMissing( "RicaVerificationAuditDMO.pshId",
	    		ricaVerificationAuditDMO.getRvaSerial());

	    dao.update( ricaVerificationAuditDMO );
		
	}

	public void modify(QueryFilter filter) throws EPPIXSeriousException,
			EPPIXObjectExpiredException, EPPIXObjectNotFoundException {
	    logger.debug( "modify( filter )" );

	    thrower.ifParameterMissing( "filter", filter );

	    dao.updateCustom( new RicaVerificationAuditDMO( ),
	      filterQueryArgs( filter, null ) );
		
	}

	  protected DAOParamQueryArgs filterQueryArgs(
			    QueryFilter filter,
			    String      dmlName ) {
			    List parts = filter.getParts(  );
			    DAOParamQueryArgs queryArgs = new DAOParamQueryArgs( ( dmlName == null )
			        ? "RicaVerificationAudit" : dmlName, parts.size(  ) );

			    Iterator it = parts.iterator();
			    	while(it.hasNext()){
			    		FilterPart part = (FilterPart)it.next();

			      switch ( part.getIndex(  ) ) {
			        case RicaVerificationAuditDMO.rvaActionFilter:
			          part.andFilterBy( queryArgs, "rvaAction", dao.wildcardForAnySequence(  ) );
			          break;
			          
			        case RicaVerificationAuditDMO.rvaDatetimeActionedFilter:
			            part.andFilterBy( queryArgs, "rvaDatetimeActioned" );
			            break;
			            
			        case RicaVerificationAuditDMO.rvaProcessAgentFilter:
			            part.andFilterBy( queryArgs, "rvaProcessAgent", dao.wildcardForAnySequence(  ) );
			            break;
			            
			        case RicaVerificationAuditDMO.rvaRicaOfficerFilter:
			            part.andFilterBy( queryArgs, "rvaRicaOfficer", dao.wildcardForAnySequence(  ) );
			            break;
			            
			        case RicaVerificationAuditDMO.rvaRicaStatusFilter:
			            part.andFilterBy( queryArgs, "rvaRicaStatus", dao.wildcardForAnySequence(  ) );
			            break;
			            
			        case RicaVerificationAuditDMO.rvaRpvSerialFilter:
			            part.andFilterBy( queryArgs, "rvaRpvSerial");
			            break;
			            
			        case RicaVerificationAuditDMO.rvaSerialFilter:
			            part.andFilterBy( queryArgs, "rvaSerial" );
			            break;
			      }
			    }

			    return queryArgs;
			  }

	  protected DAOParamQueryArgs paramQueryArgs(
			    RicaVerificationAuditDMO varDMO ) {
			    logger.debug( "paramQueryArgs( varDMO)" );

			    DAOParamQueryArgs queryArgs = new DAOParamQueryArgs( "RicaVerificationAudit",
			        7 * 2 );

			    if ( varDMO != null ) {
			      // primary key filters...
			      Integer rvaSerial = varDMO.getRvaSerial();

			      if (!DMO.isNull( rvaSerial ) ) {
			        queryArgs.andFilterBy( "rvaSerial" )
			                 .arg( rvaSerial );
			      }

			      // define more filters...
			      Integer rvaRpvSerial = varDMO.getRvaRpvSerial();
			      if ( !DMO.isNull( rvaRpvSerial ) ) {
				        queryArgs.andFilterBy( "rvaRpvSerialMatch" )
				                 .arg( rvaRpvSerial + dao.wildcardForAnySequence(  ) );
				      }
			      
			      String rvaAction = varDMO.getRvaAction();
			      if ( !DMO.isNull( rvaAction ) ) {
				        queryArgs.andFilterBy( "rvaActionMatch" )
				                 .arg( rvaAction + dao.wildcardForAnySequence(  ) );
				      }
			      
			      DateTime rvaDatetimeActioned = varDMO.getRvaDatetimeActioned();
			      if ( !DMO.isNull( rvaDatetimeActioned ) ) {
				        queryArgs.andFilterBy( "rvaDatetimeActionedMatch" )
				                 .arg( rvaDatetimeActioned + dao.wildcardForAnySequence(  ) );
				      }
			      
			      String rvaProcessAgent = varDMO.getRvaProcessAgent();
			      if ( !DMO.isNull( rvaProcessAgent ) ) {
				        queryArgs.andFilterBy( "rvaProcessAgentMatch" )
				                 .arg( rvaProcessAgent + dao.wildcardForAnySequence(  ) );
				      }
			      
			      String rvaRicaOfficer = varDMO.getRvaRicaOfficer();
			      if ( !DMO.isNull( rvaRicaOfficer ) ) {
				        queryArgs.andFilterBy( "rvaRicaOfficerMatch" )
				                 .arg( rvaRicaOfficer + dao.wildcardForAnySequence(  ) );
				      }
			      
			      String rvaRicaStatus = varDMO.getRvaRicaStatus();
			      if ( !DMO.isNull( rvaRicaStatus ) ) {
			        queryArgs.andFilterBy( "rvaRicaStatusMatch" )
			                 .arg( rvaRicaStatus + dao.wildcardForAnySequence(  ) );
			      }


			    } else {
			      // include all default languageCode filters where appropriate...
			    }

			    return queryArgs;
			  }


}