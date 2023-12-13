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



public class SbaSubAuxAbstractDACImpl   extends DAC
implements SbaSubAuxAbstractDAC {
	
	
	static DAOThrower thrower = DAOThrower.getDAOThrower( SbaSubAuxAbstractDACImpl.class );
	Logger logger = thrower.getLogger(  );

	public SbaSubAuxAbstractDACImpl( 
	    DAO         dao ) {
	    super(  dao, thrower );
	}


	public int count(QueryFilter filter) throws EPPIXSeriousException {
	    logger.debug( "count( filter )" );

	    DAOParamQueryArgs args = filterQueryArgs( filter, null );

	    return dao.count( args.getDMLName(  ), args.getFilterBy(  ), args );
	}

	public void create(SbaSubAuxDMO sbaSubAuxDMO)
			throws EPPIXSeriousException {
	    logger.debug( "create( sbaSubAuxDMO )" );
	    thrower.ifParameterMissing( "SbaSubAuxDMO", sbaSubAuxDMO );

	    dao.insert( sbaSubAuxDMO );
	}

	public void delete(SbaSubAuxDMO sbaSubAuxDMO) throws EPPIXSeriousException,
			EPPIXObjectNotFoundException, EPPIXObjectExpiredException {
		logger.debug( "delete( SbaSubAuxDMO )" );

	    thrower.ifParameterMissing( "SbaSubAuxDMO", sbaSubAuxDMO );

	    thrower.ifParameterMissing( "SbaSubAuxDMO.sbaSubscriberId",
	      sbaSubAuxDMO.getSbaSubscriberId());

	    dao.delete( sbaSubAuxDMO );
	}

	public void delete(QueryFilter filter) throws EPPIXSeriousException,
			EPPIXObjectNotFoundException, EPPIXObjectExpiredException {
	    logger.debug( "delete( filter )" );

	    thrower.ifParameterMissing( "filter", filter );

	    DAOParamQueryArgs args = filterQueryArgs( filter, null );

	    dao.delete( "SbaSubAux", args.getFilterBy(  ), args );
	}

	public boolean exists(SbaSubAuxDMO sbaSubAuxDMO)
			throws EPPIXSeriousException {
	    logger.debug( "exists( SbaSubAuxDMO)" );

	    return dao.exists( "SbaSubAux", "filterByPrimaryKey",
	      new DAOArgs( 1 ).arg( sbaSubAuxDMO.getSbaSubscriberId()));
	}

	public boolean exists(QueryFilter filter) throws EPPIXSeriousException {
	    logger.debug( "exists( filter )" );

	    return dao.exists( filterQueryArgs( filter, null ) );
	}

	public SbaSubAuxDMO get(SbaSubAuxDMO sbaSubAuxDMO)
			throws EPPIXSeriousException {
	    logger.debug( "get( SbaSubAuxDMO )" );

	    thrower.ifParameterMissing( "SbaSubAuxDMO", sbaSubAuxDMO );

	    return (SbaSubAuxDMO) dao.get( sbaSubAuxDMO );
	}

	public SbaSubAuxDMO get(QueryFilter filter) throws EPPIXSeriousException {
	    logger.debug( "get( filter )" );

	    DAOParamQueryArgs args = filterQueryArgs( filter, null );

	    return (SbaSubAuxDMO) dao.get( args.getDMLName(  ),
	      args.getFilterBy(  ), args );
	}

//	public DTOList getList(DTOListState state, SbaSubAuxDMO sbaSubAuxDMO)
//			throws EPPIXSeriousException {
//		// TODO Auto-generated method stub
//		return null;
//	}

//	public DTOList getList(DTOListState state, QueryFilter filter)
//			throws EPPIXSeriousException {
//		// TODO Auto-generated method stub
//		return null;
//	}

	public DAOIterator iterate(QueryFilter filter) throws EPPIXSeriousException {
	    logger.debug( "iterate( filter )" );

	    return dao.iterator( 
	      filterQueryArgs( filter, null ) );
	}

	public DAOIterator iterateWithLock(QueryFilter filter)
			throws EPPIXSeriousException {
	    logger.debug( "iterateWithLock( filter )" );

	    return dao.iterator( 
	      filterQueryArgs( filter, null ) );
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

	public void modify(SbaSubAuxDMO sbaSubAuxDMO) throws EPPIXSeriousException,
			EPPIXObjectExpiredException, EPPIXObjectNotFoundException {
	    logger.debug( "modify( sbaSubAuxDMO )" );

	    thrower.ifParameterMissing( "SbaSubAuxDMO", sbaSubAuxDMO );

	    thrower.ifParameterMissing( "SbaSubAuxDMO.getSbaSubscriberId",
	    		sbaSubAuxDMO.getSbaSubscriberId());

	    dao.update( sbaSubAuxDMO );
	}

	public void modify(QueryFilter filter) throws EPPIXSeriousException,
			EPPIXObjectExpiredException, EPPIXObjectNotFoundException {
	    logger.debug( "modify( filter )" );

	    thrower.ifParameterMissing( "filter", filter );

	    dao.updateCustom( new SbaSubAuxDMO(  ),
	      filterQueryArgs( filter, null ) );
	}

	  protected DAOParamQueryArgs filterQueryArgs( 
			    QueryFilter filter,
			    String      dmlName ) {
			    
		  List parts = filter.getParts(  );
		  DAOParamQueryArgs queryArgs = new DAOParamQueryArgs( ( dmlName == null )
			        ? "SbaSubAux" : dmlName, parts.size(  ) );

			    for ( Iterator i =  parts.iterator(); i.hasNext();  ) {
			      FilterPart part = (FilterPart) i.next();
			      
			      switch ( part.getIndex(  ) ) {
			      
			      case  SbaSubAuxDMO.sbaSubscriberIdFilter:
			          part.andFilterBy( queryArgs, "SbaSubscriberId",
			            dao.wildcardForAnySequence(  ) );

			          break;
			          
			      case  SbaSubAuxDMO.sbaIdNumberFilter:
			          part.andFilterBy( queryArgs, "SbaIdNumber",
			            dao.wildcardForAnySequence(  ) );

			          break;

			case  SbaSubAuxDMO.sbaMatchcodeFilter:
			          part.andFilterBy( queryArgs, "SbaMatchcode",
			            dao.wildcardForAnySequence(  ) );

			          break;

			case  SbaSubAuxDMO.sbaMarketingFilter:
			          part.andFilterBy( queryArgs, "SbaMarketing",
			            dao.wildcardForAnySequence(  ) );

			          break;

			case  SbaSubAuxDMO.sbaThirdPartyFilter:
			          part.andFilterBy( queryArgs, "SbaThirdParty",
			            dao.wildcardForAnySequence(  ) );

			          break;

			case  SbaSubAuxDMO.sbaCustdeptFilter:
			          part.andFilterBy( queryArgs, "SbaCustdept",
			            dao.wildcardForAnySequence(  ) );

			          break;

			case  SbaSubAuxDMO.sbaDealerIdFilter:
			          part.andFilterBy( queryArgs, "SbaDealerId",
			            dao.wildcardForAnySequence(  ) );

			          break;

			case  SbaSubAuxDMO.sbaDepartmentFilter:
			          part.andFilterBy( queryArgs, "SbaDepartment",
			            dao.wildcardForAnySequence(  ) );

			          break;

			case  SbaSubAuxDMO.sbaSalesmanFilter:
			          part.andFilterBy( queryArgs, "SbaSalesman",
			            dao.wildcardForAnySequence(  ) );

			          break;

			case  SbaSubAuxDMO.sbaRegionFilter:
			          part.andFilterBy( queryArgs, "SbaRegion",
			            dao.wildcardForAnySequence(  ) );

			          break;

			case  SbaSubAuxDMO.sbaInvoiceAddridFilter:
			          part.andFilterBy( queryArgs, "SbaInvoiceAddrid");

			          break;

			case  SbaSubAuxDMO.sbaInvAccountFilter:
			          part.andFilterBy( queryArgs, "SbaInvAccount",
			            dao.wildcardForAnySequence(  ) );

			          break;

			case  SbaSubAuxDMO.sbaPrepaidStatFilter:
			          part.andFilterBy( queryArgs, "SbaPrepaidStat",
			            dao.wildcardForAnySequence(  ) );

			          break;

			case  SbaSubAuxDMO.sbaAnalysis1Filter:
			          part.andFilterBy( queryArgs, "SbaAnalysis1",
			            dao.wildcardForAnySequence(  ) );

			          break;

			case  SbaSubAuxDMO.sbaAnalysis2Filter:
			          part.andFilterBy( queryArgs, "SbaAnalysis2",
			            dao.wildcardForAnySequence(  ) );

			          break;

			case  SbaSubAuxDMO.sbaAnalysis3Filter:
			          part.andFilterBy( queryArgs, "SbaAnalysis3",
			            dao.wildcardForAnySequence(  ) );

			          break;

			case  SbaSubAuxDMO.sbaAnalysis4Filter:
			          part.andFilterBy( queryArgs, "SbaAnalysis4",
			            dao.wildcardForAnySequence(  ) );

			          break;

			case  SbaSubAuxDMO.sbaAnalysis5Filter:
			          part.andFilterBy( queryArgs, "SbaAnalysis5",
			            dao.wildcardForAnySequence(  ) );

			          break;

			case  SbaSubAuxDMO.sbaAnalysis6Filter:
			          part.andFilterBy( queryArgs, "SbaAnalysis6",
			            dao.wildcardForAnySequence(  ) );

			          break;

			case  SbaSubAuxDMO.sbaAnalysis7Filter:
			          part.andFilterBy( queryArgs, "SbaAnalysis7",
			            dao.wildcardForAnySequence(  ) );

			          break;

			case  SbaSubAuxDMO.sbaAnalysis8Filter:
			          part.andFilterBy( queryArgs, "SbaAnalysis8",
			            dao.wildcardForAnySequence(  ) );

			          break;

			case  SbaSubAuxDMO.sbaAnalysis9Filter:
			          part.andFilterBy( queryArgs, "SbaAnalysis9",
			            dao.wildcardForAnySequence(  ) );

			          break;

			case  SbaSubAuxDMO.sbaAnalysis10Filter:
			          part.andFilterBy( queryArgs, "SbaAnalysis10",
			            dao.wildcardForAnySequence(  ) );

			          break;

			case  SbaSubAuxDMO.sbaAnalysis11Filter:
			          part.andFilterBy( queryArgs, "SbaAnalysis11",
			            dao.wildcardForAnySequence(  ) );

			          break;

			case  SbaSubAuxDMO.sbaAnalysis12Filter:
			          part.andFilterBy( queryArgs, "SbaAnalysis12",
			            dao.wildcardForAnySequence(  ) );

			          break;

			case  SbaSubAuxDMO.sbaAnalysis13Filter:
			          part.andFilterBy( queryArgs, "SbaAnalysis13",
			            dao.wildcardForAnySequence(  ) );

			          break;

			case  SbaSubAuxDMO.sbaAnalysis14Filter:
			          part.andFilterBy( queryArgs, "SbaAnalysis14",
			            dao.wildcardForAnySequence(  ) );

			          break;

			case  SbaSubAuxDMO.sbaAnalysis15Filter:
			          part.andFilterBy( queryArgs, "SbaAnalysis15",
			            dao.wildcardForAnySequence(  ) );

			          break;

			case  SbaSubAuxDMO.sbaAnalysis16Filter:
			          part.andFilterBy( queryArgs, "SbaAnalysis16",
			            dao.wildcardForAnySequence(  ) );

			          break;

			case  SbaSubAuxDMO.sbaAnalysis17Filter:
			          part.andFilterBy( queryArgs, "SbaAnalysis17",
			            dao.wildcardForAnySequence(  ) );

			          break;

			case  SbaSubAuxDMO.sbaAnalysis18Filter:
			          part.andFilterBy( queryArgs, "SbaAnalysis18",
			            dao.wildcardForAnySequence(  ) );

			          break;

			case  SbaSubAuxDMO.sbaAnalysis19Filter:
			          part.andFilterBy( queryArgs, "SbaAnalysis19",
			            dao.wildcardForAnySequence(  ) );

			          break;

			case  SbaSubAuxDMO.sbaAnalysis20Filter:
			          part.andFilterBy( queryArgs, "SbaAnalysis20",
			            dao.wildcardForAnySequence(  ) );

			          break;

			case  SbaSubAuxDMO.sbaAnalysis21Filter:
			          part.andFilterBy( queryArgs, "SbaAnalysis21",
			            dao.wildcardForAnySequence(  ) );

			          break;

			case  SbaSubAuxDMO.sbaAnalysis22Filter:
			          part.andFilterBy( queryArgs, "SbaAnalysis22",
			            dao.wildcardForAnySequence(  ) );

			          break;

			case  SbaSubAuxDMO.sbaAnalysis23Filter:
			          part.andFilterBy( queryArgs, "SbaAnalysis23",
			            dao.wildcardForAnySequence(  ) );

			          break;

			case  SbaSubAuxDMO.sbaAnalysis24Filter:
			          part.andFilterBy( queryArgs, "SbaAnalysis24",
			            dao.wildcardForAnySequence(  ) );

			          break;

			case  SbaSubAuxDMO.sbaAnalysis25Filter:
			          part.andFilterBy( queryArgs, "SbaAnalysis25",
			            dao.wildcardForAnySequence(  ) );

			          break;

			case  SbaSubAuxDMO.sbaAnalysis26Filter:
			          part.andFilterBy( queryArgs, "SbaAnalysis26",
			            dao.wildcardForAnySequence(  ) );

			          break;

			case  SbaSubAuxDMO.sbaAnalysis27Filter:
			          part.andFilterBy( queryArgs, "SbaAnalysis27",
			            dao.wildcardForAnySequence(  ) );

			          break;

			case  SbaSubAuxDMO.sbaAnalysis28Filter:
			          part.andFilterBy( queryArgs, "SbaAnalysis28",
			            dao.wildcardForAnySequence(  ) );

			          break;

			case  SbaSubAuxDMO.sbaAnalysis29Filter:
			          part.andFilterBy( queryArgs, "SbaAnalysis29",
			            dao.wildcardForAnySequence(  ) );

			          break;

			case  SbaSubAuxDMO.sbaAnalysis30Filter:
			          part.andFilterBy( queryArgs, "SbaAnalysis30",
			            dao.wildcardForAnySequence(  ) );

			          break;

			case  SbaSubAuxDMO.sbaCommentsFilter:
			          part.andFilterBy( queryArgs, "SbaComments",
			            dao.wildcardForAnySequence(  ) );

			          break;
			      }
			      
			    }
			    
		return queryArgs;    
	  }

	  protected DAOParamQueryArgs paramQueryArgs( 
			    SbaSubAuxDMO sbaSubAuxDMO ) {
			    logger.debug( "paramQueryArgs( sbaSubAuxDMO)" );

			    DAOParamQueryArgs queryArgs = new DAOParamQueryArgs( "SbaSubAux",
			        44 * 2 );
			    
			    if ( sbaSubAuxDMO != null ) {
			        // primary key filters...
			        Integer sbaSubscriberId = sbaSubAuxDMO.getSbaSubscriberId();

			        if ( !DMO.isNull( sbaSubscriberId ) ) {
			          queryArgs.andFilterBy( "SbaSubscriberIdMatch" );
			        }
			        
			        String sbaIdNumber = sbaSubAuxDMO.getSbaIdNumber();
			        if ( !DMO.isNull( sbaIdNumber ) ) {
			            queryArgs.andFilterBy( "SbaIdNumberMatch" )
			                     .arg( sbaIdNumber + dao.wildcardForAnySequence(  ) );
			          }
			        
			        String sbaMatchcode = sbaSubAuxDMO.getSbaMatchcode();
			        if ( !DMO.isNull( sbaMatchcode ) ) {
			            queryArgs.andFilterBy( "SbaMatchcodeMatch" )
			                     .arg( sbaMatchcode + dao.wildcardForAnySequence(  ) );
			          }
			        
			        String sbaMarketing = sbaSubAuxDMO.getSbaMarketing();
			        if ( !DMO.isNull( sbaMarketing ) ) {
			            queryArgs.andFilterBy( "SbaMarketingMatch" )
			                     .arg( sbaMarketing + dao.wildcardForAnySequence(  ) );
			          }
			        
			        String sbaThirdParty = sbaSubAuxDMO.getSbaThirdParty();
			        if ( !DMO.isNull( sbaThirdParty ) ) {
			            queryArgs.andFilterBy( "SbaThirdPartyMatch" )
			                     .arg( sbaThirdParty + dao.wildcardForAnySequence(  ) );
			          }
			        
			        String sbaCustdept = sbaSubAuxDMO.getSbaCustdept();
			        if ( !DMO.isNull( sbaCustdept ) ) {
			            queryArgs.andFilterBy( "SbaCustdeptMatch" )
			                     .arg( sbaCustdept + dao.wildcardForAnySequence(  ) );
			          }
			        
			        String sbaDealerId = sbaSubAuxDMO.getSbaDealerId();
			        if ( !DMO.isNull( sbaDealerId ) ) {
			            queryArgs.andFilterBy( "SsbaDealerIdMatch" )
			                     .arg( sbaDealerId + dao.wildcardForAnySequence(  ) );
			          }
			        
			        String sbaDepartment = sbaSubAuxDMO.getSbaDepartment();
			        if ( !DMO.isNull( sbaDepartment ) ) {
			            queryArgs.andFilterBy( "SbaDepartmentMatch" )
			                     .arg( sbaDepartment + dao.wildcardForAnySequence(  ) );
			          }
			        
			        String sbaSalesman = sbaSubAuxDMO.getSbaSalesman();
			        if ( !DMO.isNull( sbaSalesman ) ) {
			            queryArgs.andFilterBy( "SbaSalesmanMatch" )
			                     .arg( sbaSalesman + dao.wildcardForAnySequence(  ) );
			          }
			        
			        String sbaRegion = sbaSubAuxDMO.getSbaRegion();
			        if ( !DMO.isNull( sbaRegion ) ) {
			            queryArgs.andFilterBy( "SbaRegionMatch" )
			                     .arg( sbaRegion + dao.wildcardForAnySequence(  ) );
			          }
			        
			        Integer sbaInvoiceAddrid = sbaSubAuxDMO.getSbaInvoiceAddrid();
			        if ( !DMO.isNull( sbaInvoiceAddrid ) ) {
			            queryArgs.andFilterBy( "SbaInvoiceAddridMatch" )
			                     .arg( sbaInvoiceAddrid + dao.wildcardForAnySequence(  ) );
			          }
			        
			        String sbaInvAccount = sbaSubAuxDMO.getSbaInvAccount();
			        if ( !DMO.isNull( sbaInvAccount ) ) {
			            queryArgs.andFilterBy( "SbaInvAccountMatch" )
			                     .arg( sbaInvAccount + dao.wildcardForAnySequence(  ) );
			          }
			        
			        String sbaPrepaidStat = sbaSubAuxDMO.getSbaPrepaidStat();
			        if ( !DMO.isNull( sbaPrepaidStat ) ) {
			            queryArgs.andFilterBy( "SbaPrepaidStatMatch" )
			                     .arg( sbaPrepaidStat + dao.wildcardForAnySequence(  ) );
			          }
			        
			        String sbaAnalysis1 = sbaSubAuxDMO.getSbaAnalysis1();
			        if ( !DMO.isNull( sbaAnalysis1 ) ) {
			            queryArgs.andFilterBy( "SbaAnalysis1Match" )
			                     .arg( sbaAnalysis1 + dao.wildcardForAnySequence(  ) );
			          }
			        
			        String sbaAnalysis2 = sbaSubAuxDMO.getSbaAnalysis2();
			        if ( !DMO.isNull( sbaAnalysis2 ) ) {
			            queryArgs.andFilterBy( "SbaAnalysis2Match" )
			                     .arg( sbaAnalysis2 + dao.wildcardForAnySequence(  ) );
			          }
			        
			        String sbaAnalysis3 = sbaSubAuxDMO.getSbaAnalysis3();
			        if ( !DMO.isNull( sbaAnalysis3 ) ) {
			            queryArgs.andFilterBy( "SbaAnalysis3Match" )
			                     .arg( sbaAnalysis3 + dao.wildcardForAnySequence(  ) );
			          }
			        
			        String sbaAnalysis4 = sbaSubAuxDMO.getSbaAnalysis4();
			        if ( !DMO.isNull( sbaAnalysis4 ) ) {
			            queryArgs.andFilterBy( "SbaAnalysis4Match" )
			                     .arg( sbaAnalysis4 + dao.wildcardForAnySequence(  ) );
			          }
			        
			        String sbaAnalysis5 = sbaSubAuxDMO.getSbaAnalysis5();
			        if ( !DMO.isNull( sbaAnalysis5 ) ) {
			            queryArgs.andFilterBy( "SbaAnalysis5Match" )
			                     .arg( sbaAnalysis5 + dao.wildcardForAnySequence(  ) );
			          }
			        
			        String sbaAnalysis6 = sbaSubAuxDMO.getSbaAnalysis6();
			        if ( !DMO.isNull( sbaAnalysis6 ) ) {
			            queryArgs.andFilterBy( "SbaAnalysis6Match" )
			                     .arg( sbaAnalysis6 + dao.wildcardForAnySequence(  ) );
			          }
			        
			        String sbaAnalysis7 = sbaSubAuxDMO.getSbaAnalysis7();
			        if ( !DMO.isNull( sbaAnalysis7 ) ) {
			            queryArgs.andFilterBy( "SbaAnalysis7Match" )
			                     .arg( sbaAnalysis7 + dao.wildcardForAnySequence(  ) );
			          }
			        
			        String sbaAnalysis8 = sbaSubAuxDMO.getSbaAnalysis8();
			        if ( !DMO.isNull( sbaAnalysis8 ) ) {
			            queryArgs.andFilterBy( "SbaAnalysis8Match" )
			                     .arg( sbaAnalysis8 + dao.wildcardForAnySequence(  ) );
			          }
			        
			        String sbaAnalysis9 = sbaSubAuxDMO.getSbaAnalysis9();
			        if ( !DMO.isNull( sbaAnalysis9 ) ) {
			            queryArgs.andFilterBy( "SbaAnalysis9Match" )
			                     .arg( sbaAnalysis9 + dao.wildcardForAnySequence(  ) );
			          }
			        
			        String sbaAnalysis10 = sbaSubAuxDMO.getSbaAnalysis10();
			        if ( !DMO.isNull( sbaAnalysis10 ) ) {
			            queryArgs.andFilterBy( "SbaAnalysis10Match" )
			                     .arg( sbaAnalysis10 + dao.wildcardForAnySequence(  ) );
			          }
			        
			        String sbaAnalysis11 = sbaSubAuxDMO.getSbaAnalysis11();
			        if ( !DMO.isNull( sbaAnalysis11 ) ) {
			            queryArgs.andFilterBy( "SbaAnalysis11Match" )
			                     .arg( sbaAnalysis11 + dao.wildcardForAnySequence(  ) );
			          }
			        
			        String sbaAnalysis12 = sbaSubAuxDMO.getSbaAnalysis12();
			        if ( !DMO.isNull( sbaAnalysis12 ) ) {
			            queryArgs.andFilterBy( "SbaAnalysis12Match" )
			                     .arg( sbaAnalysis12 + dao.wildcardForAnySequence(  ) );
			          }
			        
			        String sbaAnalysis13 = sbaSubAuxDMO.getSbaAnalysis13();
			        if ( !DMO.isNull( sbaAnalysis13 ) ) {
			            queryArgs.andFilterBy( "SbaAnalysis13Match" )
			                     .arg( sbaAnalysis13 + dao.wildcardForAnySequence(  ) );
			          }
			        
			        String sbaAnalysis14 = sbaSubAuxDMO.getSbaAnalysis14();
			        if ( !DMO.isNull( sbaAnalysis14 ) ) {
			            queryArgs.andFilterBy( "SbaAnalysis14Match" )
			                     .arg( sbaAnalysis14 + dao.wildcardForAnySequence(  ) );
			          }
			        
			        String sbaAnalysis15 = sbaSubAuxDMO.getSbaAnalysis15();
			        if ( !DMO.isNull( sbaAnalysis15 ) ) {
			            queryArgs.andFilterBy( "SbaAnalysis15Match" )
			                     .arg( sbaAnalysis15 + dao.wildcardForAnySequence(  ) );
			          }
			        
			        String sbaAnalysis16 = sbaSubAuxDMO.getSbaAnalysis16();
			        if ( !DMO.isNull( sbaAnalysis16 ) ) {
			            queryArgs.andFilterBy( "SbaAnalysis16Match" )
			                     .arg( sbaAnalysis16 + dao.wildcardForAnySequence(  ) );
			          }
			        
			        String sbaAnalysis17 = sbaSubAuxDMO.getSbaAnalysis17();
			        if ( !DMO.isNull( sbaAnalysis17 ) ) {
			            queryArgs.andFilterBy( "SbaAnalysis17Match" )
			                     .arg( sbaAnalysis17 + dao.wildcardForAnySequence(  ) );
			          }
			        
			        String sbaAnalysis18 = sbaSubAuxDMO.getSbaAnalysis18();
			        if ( !DMO.isNull( sbaAnalysis18 ) ) {
			            queryArgs.andFilterBy( "SbaAnalysis18Match" )
			                     .arg( sbaAnalysis18 + dao.wildcardForAnySequence(  ) );
			          }
			        
			        String sbaAnalysis19 = sbaSubAuxDMO.getSbaAnalysis19();
			        if ( !DMO.isNull( sbaAnalysis19 ) ) {
			            queryArgs.andFilterBy( "SbaAnalysis19Match" )
			                     .arg( sbaAnalysis19 + dao.wildcardForAnySequence(  ) );
			          }
			        
			        String sbaAnalysis20 = sbaSubAuxDMO.getSbaAnalysis20();
			        if ( !DMO.isNull( sbaAnalysis20 ) ) {
			            queryArgs.andFilterBy( "SbaAnalysis20Match" )
			                     .arg( sbaAnalysis20 + dao.wildcardForAnySequence(  ) );
			          }
			        
			        String sbaAnalysis21 = sbaSubAuxDMO.getSbaAnalysis21();
			        if ( !DMO.isNull( sbaAnalysis21 ) ) {
			            queryArgs.andFilterBy( "SbaAnalysis21Match" )
			                     .arg( sbaAnalysis21 + dao.wildcardForAnySequence(  ) );
			          }
			        
			        String sbaAnalysis22 = sbaSubAuxDMO.getSbaAnalysis22();
			        if ( !DMO.isNull( sbaAnalysis22 ) ) {
			            queryArgs.andFilterBy( "SbaAnalysis22Match" )
			                     .arg( sbaAnalysis22 + dao.wildcardForAnySequence(  ) );
			          }
			        
			        String sbaAnalysis23 = sbaSubAuxDMO.getSbaAnalysis23();
			        if ( !DMO.isNull( sbaAnalysis23 ) ) {
			            queryArgs.andFilterBy( "SbaAnalysis23Match" )
			                     .arg( sbaAnalysis23 + dao.wildcardForAnySequence(  ) );
			          }
			        
			        String sbaAnalysis24 = sbaSubAuxDMO.getSbaAnalysis24();
			        if ( !DMO.isNull( sbaAnalysis24 ) ) {
			            queryArgs.andFilterBy( "SbaAnalysis24Match" )
			                     .arg( sbaAnalysis24 + dao.wildcardForAnySequence(  ) );
			          }
			        
			        String sbaAnalysis25 = sbaSubAuxDMO.getSbaAnalysis25();
			        if ( !DMO.isNull( sbaAnalysis25 ) ) {
			            queryArgs.andFilterBy( "SbaAnalysis25Match" )
			                     .arg( sbaAnalysis25 + dao.wildcardForAnySequence(  ) );
			          }
			        
			        String sbaAnalysis26 = sbaSubAuxDMO.getSbaAnalysis26();
			        if ( !DMO.isNull( sbaAnalysis26 ) ) {
			            queryArgs.andFilterBy( "SbaAnalysis26Match" )
			                     .arg( sbaAnalysis26 + dao.wildcardForAnySequence(  ) );
			          }
			        
			        String sbaAnalysis27 = sbaSubAuxDMO.getSbaAnalysis27();
			        if ( !DMO.isNull( sbaAnalysis27 ) ) {
			            queryArgs.andFilterBy( "SbaAnalysis27Match" )
			                     .arg( sbaAnalysis27 + dao.wildcardForAnySequence(  ) );
			          }
			        
			        String sbaAnalysis28 = sbaSubAuxDMO.getSbaAnalysis28();
			        if ( !DMO.isNull( sbaAnalysis28 ) ) {
			            queryArgs.andFilterBy( "SbaAnalysis28Match" )
			                     .arg( sbaAnalysis28 + dao.wildcardForAnySequence(  ) );
			          }
			        
			        String sbaAnalysis29 = sbaSubAuxDMO.getSbaAnalysis29();
			        if ( !DMO.isNull( sbaAnalysis29 ) ) {
			            queryArgs.andFilterBy( "SbaAnalysis29Match" )
			                     .arg( sbaAnalysis29 + dao.wildcardForAnySequence(  ) );
			          }
			        
			        String sbaAnalysis30 = sbaSubAuxDMO.getSbaAnalysis30();
			        if ( !DMO.isNull( sbaAnalysis30 ) ) {
			            queryArgs.andFilterBy( "SbaAnalysis30Match" )
			                     .arg( sbaAnalysis30 + dao.wildcardForAnySequence(  ) );
			          }
			        
			        String sbaComments = sbaSubAuxDMO.getSbaComments();	
			        if ( !DMO.isNull( sbaComments ) ) {
			            queryArgs.andFilterBy( "SbaCommentsMatch" )
			                     .arg( sbaComments + dao.wildcardForAnySequence(  ) );
			          }
			        
			    } else {
			        // include all default languageCode filters where appropriate...
			    }
			    
		 return queryArgs;
	  }

}