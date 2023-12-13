package com.eppixcomm.eppix.base.blo;

import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;

import com.eppixcomm.eppix.base.error.EPPIXObjectBusyException;
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
import com.eppixcomm.eppix.common.util.FilterOp;
import com.eppixcomm.eppix.common.util.FilterPart;
import com.eppixcomm.eppix.common.util.QueryFilter;

public class EcfEventCmdFileAbstractDACImpl extends DAC implements EcfEventCmdFileAbstractDAC{

	static DAOThrower thrower = DAOThrower.getDAOThrower( EcfEventCmdFileAbstractDACImpl.class );
	
	Logger logger = thrower.getLogger();
	
	protected EcfEventCmdFileAbstractDACImpl(DAO dao, DAOThrower thrower) {
		super(dao, thrower);
	}

	protected EcfEventCmdFileAbstractDACImpl(DAO dao) {
		super(dao, thrower);
	}
	
	public int count(QueryFilter filter) throws EPPIXSeriousException {
		logger.debug("count( filter )");

		DAOParamQueryArgs args = filterQueryArgs(filter, null);

		return dao.count(args.getDMLName(), args.getFilterBy(), args);
	}

	public void create(EcfEventCmdFileDMO ecfEventCmdFileDMO)
			throws EPPIXSeriousException {
		logger.debug("create( ecfEventCmdFileDMO )");
		thrower.ifParameterMissing("EcfEventCmdFileDMO", ecfEventCmdFileDMO);

		dao.insert(ecfEventCmdFileDMO);
	}

	public void delete(EcfEventCmdFileDMO ecfEventCmdFileDMO)
			throws EPPIXSeriousException, EPPIXObjectNotFoundException,
			EPPIXObjectExpiredException {
		logger.debug("delete( EcfEventCmdFileDMO )");

		thrower.ifParameterMissing("EcfEventCmdFileDMO", ecfEventCmdFileDMO);

		thrower.ifParameterMissing("EcfEventCmdFileDMO.ecfCommand",
				ecfEventCmdFileDMO.getEcfCommand());
		
		QueryFilter filter = new QueryFilter();
		filter.add(FilterOp.EQUAL, EcfEventCmdFileDMO.ecfCommandFilter, ecfEventCmdFileDMO.getEcfCommand());
		
	    DAOParamQueryArgs args = filterQueryArgs( filter, null );

	    dao.delete( "EcfEventCmdFile", args.getFilterBy(  ), args );
	}

	public void delete(QueryFilter filter) throws EPPIXSeriousException,
			EPPIXObjectNotFoundException, EPPIXObjectExpiredException {
	    logger.debug( "delete( filter )" );

	    thrower.ifParameterMissing( "filter", filter );

	    DAOParamQueryArgs args = filterQueryArgs( filter, null );

	    dao.delete( "EcfEventCmdFile", args.getFilterBy(  ), args );	
	}

	public boolean exists(EcfEventCmdFileDMO ecfEventCmdFileDMO)
			throws EPPIXSeriousException {
		logger.debug("exists( EcfEventCmdFileDMO )");

		thrower.ifParameterMissing("EcfEventCmdFileDMO", ecfEventCmdFileDMO);

		thrower.ifParameterMissing("EcfEventCmdFileDMO.ecfCommand",
				ecfEventCmdFileDMO.getEcfCommand());

		
		QueryFilter filter = new QueryFilter();
		filter.add(FilterOp.EQUAL, EcfEventCmdFileDMO.ecfCommandFilter, ecfEventCmdFileDMO.getEcfCommand());
		
	    return dao.exists( filterQueryArgs( filter, null ) );
	}

	public boolean exists(QueryFilter filter) throws EPPIXSeriousException {
	    logger.debug( "exists( filter )" );

	    return dao.exists( filterQueryArgs( filter, null ) );
	}

	public EcfEventCmdFileDMO get(EcfEventCmdFileDMO ecfEventCmdFileDMO)
			throws EPPIXSeriousException {
		logger.debug("get( EcfEventCmdFileDMO )");

		thrower.ifParameterMissing("EcfEventCmdFileDMO", ecfEventCmdFileDMO);

		thrower.ifParameterMissing("EcfEventCmdFileDMO.ecfCommand",
				ecfEventCmdFileDMO.getEcfCommand());
		
		QueryFilter filter = new QueryFilter();
		filter.add(FilterOp.EQUAL, EcfEventCmdFileDMO.ecfCommandFilter, ecfEventCmdFileDMO.getEcfCommand());

	    DAOParamQueryArgs args = filterQueryArgs( filter, null );

	    return (EcfEventCmdFileDMO) dao.get( args.getDMLName(  ),
	      args.getFilterBy(  ), args );
	}

	public EcfEventCmdFileDMO get(QueryFilter filter)
			throws EPPIXSeriousException {
	    logger.debug( "get( filter )" );

	    DAOParamQueryArgs args = filterQueryArgs( filter, null );

	    return (EcfEventCmdFileDMO) dao.get( args.getDMLName(  ),
	      args.getFilterBy(  ), args );
	}

	public Iterator iterate(QueryFilter filter) throws EPPIXSeriousException {
	    logger.debug( "iterate( filter )" );

	    return (Iterator)dao.iterator(filterQueryArgs( filter, null ), false);
	}

	public DAOIterator iterateWithLock(QueryFilter filter)
			throws EPPIXSeriousException {
	    logger.debug( "iterateWithLock( filter )" );

	    return dao.iterator(filterQueryArgs(filter, null), false);
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

//	public void modify(EcfEventCmdFileDMO ecfEventCmdFileDMO)
//			throws EPPIXSeriousException, EPPIXObjectExpiredException,
//			EPPIXObjectNotFoundException {
//		logger.debug("modify( EcfEventCmdFileDMO )");
//
//		thrower.ifParameterMissing("EcfEventCmdFileDMO", ecfEventCmdFileDMO);
//
//		thrower.ifParameterMissing("EcfEventCmdFileDMO.ecfCommand",
//				ecfEventCmdFileDMO.getEcfCommand());
//
//	    dao.update( ecfEventCmdFileDMO );	
//	}

	public void modify(QueryFilter filter) throws EPPIXSeriousException,
			EPPIXObjectExpiredException, EPPIXObjectNotFoundException {
	    logger.debug( "modify( filter )" );

	    thrower.ifParameterMissing( "filter", filter );

	    dao.updateCustom( new EcfEventCmdFileDMO(  ),filterQueryArgs( filter, null ));	
	}

	protected DAOParamQueryArgs paramQueryArgs(EcfEventCmdFileDMO ecfEventCmdFileDMO) {
		logger.debug("paramQueryArgs( ecfEventCmdFileDMO)");
		
	    DAOParamQueryArgs queryArgs = new DAOParamQueryArgs( "EcfEventCmdFile", 3);

	    if ( ecfEventCmdFileDMO != null ) {

	      String ecfCommand = ecfEventCmdFileDMO.getEcfCommand();

	      if ( !DMO.isNull( ecfCommand ) ) {
	        queryArgs.andFilterBy( "EcfCommandMatch" )
	                 .arg( ecfCommand + dao.wildcardForAnySequence(  ) );
	      }
	      
	      String ecfSorbOrder = ecfEventCmdFileDMO.getEcfSorbOrder();

	      if ( !DMO.isNull( ecfSorbOrder ) ) {
	        queryArgs.andFilterBy( "EcfSorbOrderMatch" )
	                 .arg( ecfSorbOrder + dao.wildcardForAnySequence(  ) );
	      }
	      
	      String ecfStatus = ecfEventCmdFileDMO.getEcfStatus();

	      if ( !DMO.isNull( ecfStatus ) ) {
	        queryArgs.andFilterBy( "EcfStatusMatch" )
	                 .arg( ecfStatus + dao.wildcardForAnySequence(  ) );
	      }

	      String ecfFile = ecfEventCmdFileDMO.getEcfFile();

	      if ( !DMO.isNull( ecfFile ) ) {
	        queryArgs.andFilterBy( "EcfFileMatch" )
	                 .arg( ecfFile + dao.wildcardForAnySequence(  ) );
	      }
	      
	      DateTime ecfTimestamp = ecfEventCmdFileDMO.getEcfTimestamp();

	      if ( !DMO.isNull( ecfTimestamp ) ) {
	        queryArgs.andFilterBy( "EcfTimestampMatch" )
	                 .arg(ecfTimestamp);
	      }
	      
	      String ecfSpid = ecfEventCmdFileDMO.getEcfSpid();

	      if ( !DMO.isNull( ecfSpid ) ) {
	        queryArgs.andFilterBy( "EcfSpidMatch" )
	                 .arg( ecfSpid + dao.wildcardForAnySequence(  ) );
	      }
	}
	    return queryArgs;	    
}
	
	protected DAOParamQueryArgs filterQueryArgs(QueryFilter filter,
			String dmlName) {
		
		List parts = filter.getParts();
		DAOParamQueryArgs queryArgs = new DAOParamQueryArgs(
				(dmlName == null) ? "EcfEventCmdFile" : dmlName, parts.size());

		for (Iterator i = parts.iterator(); i.hasNext();) {
			FilterPart part = (FilterPart) i.next();

			switch (part.getIndex()) {
        		case EcfEventCmdFileDMO.ecfCommandFilter:
        			part.andFilterBy( queryArgs, "EcfCommand",
        				dao.wildcardForAnySequence(  ) );

        		break;
        		
        		case EcfEventCmdFileDMO.ecfSorbOrderFilter:
        			part.andFilterBy( queryArgs, "EcfSorbOrder",
        				dao.wildcardForAnySequence(  ) );

        		break;
        		
        		case EcfEventCmdFileDMO.ecfStatusFilter:
        			part.andFilterBy( queryArgs, "EcfStatus",
        				dao.wildcardForAnySequence(  ) );

        		break;

        		case EcfEventCmdFileDMO.ecfFileFilter:
        			part.andFilterBy( queryArgs, "EcfFile",
        				dao.wildcardForAnySequence(  ) );

        		break;
        		
        		case EcfEventCmdFileDMO.ecfTimestampFilter:
        			part.andFilterBy( queryArgs, "EcfTimestamp",
        				dao.wildcardForAnySequence(  ) );

        		break;
        		
        		case EcfEventCmdFileDMO.ecfSpidFilter:
        			part.andFilterBy( queryArgs, "EcfSpid",
        				dao.wildcardForAnySequence(  ) );

        		break;
			}
		}
		return queryArgs;
	}	
}
