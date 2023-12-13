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



public class AsrAddServReqAbstractDACImpl extends DAC implements AsrAddServReqAbstractDAC {

	  static DAOThrower thrower = DAOThrower.getDAOThrower( AsrAddServReqAbstractDACImpl.class );

	  Logger logger = thrower.getLogger(  );

	  public AsrAddServReqAbstractDACImpl(DAO dao ) {
	    super( dao, thrower );
	  }

	  public AsrAddServReqDMO get( AsrAddServReqDMO asrAddServReqDMO )
	    throws EPPIXSeriousException {
	    logger.debug( "get( AsrAddServReqDMO )" );

	    thrower.ifParameterMissing("AsrAddServReqDMO", asrAddServReqDMO);
	    
	    return (AsrAddServReqDMO) dao.get( asrAddServReqDMO );
	  }


	  public void create( AsrAddServReqDMO asrAddServReqDMO )
	    throws EPPIXSeriousException {
	    logger.debug( "create( asrAddServReqDMO )" );
	    thrower.ifParameterMissing( "AsrAddServReqDMO", asrAddServReqDMO );

	    dao.insert( asrAddServReqDMO );

	  }


	  public void modify( AsrAddServReqDMO asrAddServReqDMO )
	    throws EPPIXSeriousException, EPPIXObjectExpiredException,
	      EPPIXObjectNotFoundException {
	    logger.debug( "modify( aAsrAddServReqDMO )" );

	    thrower.ifParameterMissing( "aAsrAddServReqDMO", asrAddServReqDMO );

	    dao.update( asrAddServReqDMO );
	  }


	  public void modify( QueryFilter filter )
	    throws EPPIXSeriousException, EPPIXObjectExpiredException,
	      EPPIXObjectNotFoundException {
	    logger.debug( "modify( filter )" );

	    thrower.ifParameterMissing( "filter", filter );

	    dao.updateCustom( new AsrAddServReqDMO(  ),
	      filterQueryArgs( filter, null ) );
	  }


	  public void delete( AsrAddServReqDMO asrAddServReqDMO )
	    throws EPPIXSeriousException, EPPIXObjectNotFoundException,
	      EPPIXObjectExpiredException {
	    logger.debug( "delete( AsrAddServReqDMO )" );

	    thrower.ifParameterMissing( "AsrAddServReqDMO", asrAddServReqDMO );

	    dao.delete( asrAddServReqDMO );
	  }


	  public void delete( QueryFilter filter )
	    throws EPPIXSeriousException, EPPIXObjectNotFoundException,
	      EPPIXObjectExpiredException {
	    logger.debug( "delete( filter )" );

	    thrower.ifParameterMissing( "filter", filter );

	    DAOParamQueryArgs args = filterQueryArgs( filter, null );

	    dao.delete( "PshParamServHdr", args.getFilterBy(  ), args );
	  }


	  public boolean exists( AsrAddServReqDMO AsrAddServReqDMO )
	    throws EPPIXSeriousException {
	    logger.debug( "exists( AsrAddServReqDMO)" );

	    return dao.exists( "PshParamServHdr", "filterByPrimaryKey",
	      new DAOArgs( 1 ).arg( AsrAddServReqDMO.get(  ) ) );
	  }


	  public boolean exists( QueryFilter filter )
	    throws EPPIXSeriousException {
	    logger.debug( "exists( filter )" );

	    return dao.exists( filterQueryArgs( filter, null ) );
	  }

	  protected DAOParamQueryArgs paramQueryArgs(
			    AsrAddServReqDMO asrAddServReqDMO ) {
			    logger.debug( "paramQueryArgs( asrAddServReqDMO)" );

			    DAOParamQueryArgs queryArgs = new DAOParamQueryArgs( "AsrAddServReq",
			        30 * 2 );

			    if ( asrAddServReqDMO != null ) {
			    

			      // define filters...

							String asrTransactId = asrAddServReqDMO.getAsrTransactId(  );
							  if ( !DMO.isNull( asrTransactId ) ) {
							        queryArgs.andFilterBy( "asrTransactIdMatch" )
							            .arg( asrTransactId + dao.wildcardForAnySequence(  ) );
			      		}
							
							Integer asrSubscriberId = asrAddServReqDMO.getAsrSubscriberId(  );
							  if ( !DMO.isNull( asrSubscriberId ) ) {
							        queryArgs.andFilterBy( "asrSubscriberIdMatch" )
							            .arg( asrSubscriberId);
			      		}					
							
							String asrServiceCode = asrAddServReqDMO.getAsrServiceCode(  );
							  if ( !DMO.isNull( asrServiceCode ) ) {
							        queryArgs.andFilterBy( "asrServiceCodeMatch" )
							            .arg( asrServiceCode + dao.wildcardForAnySequence(  ) );
			      		}					
							
							String asrActiveFlag = asrAddServReqDMO.getAsrActiveFlag(  );
							  if ( !DMO.isNull( asrActiveFlag ) ) {
							        queryArgs.andFilterBy( "asrActiveFlagMatch" )
							            .arg( asrActiveFlag + dao.wildcardForAnySequence(  ) );
			      		}					
							
							Integer asrParamId = asrAddServReqDMO.getAsrParamId(  );
							  if ( !DMO.isNull( asrParamId ) ) {
							        queryArgs.andFilterBy( "asrParamIdMatch" )
							            .arg( asrParamId);
			      		}					
							
							String asrParamValue = asrAddServReqDMO.getAsrParamValue(  );
							  if ( !DMO.isNull( asrParamValue ) ) {
							        queryArgs.andFilterBy( "asrParamValueMatch" )
							            .arg( asrParamValue + dao.wildcardForAnySequence(  ) );
			      		}					
							
							String asrMsisdnNo = asrAddServReqDMO.getAsrMsisdnNo(  );
							  if ( !DMO.isNull( asrMsisdnNo ) ) {
							        queryArgs.andFilterBy( "asrMsisdnNoMatch" )
							            .arg( asrMsisdnNo + dao.wildcardForAnySequence(  ) );
			      		}					
							
							String asrToMsisdn = asrAddServReqDMO.getAsrToMsisdn(  );
							  if ( !DMO.isNull( asrToMsisdn ) ) {
							        queryArgs.andFilterBy( "asrToMsisdnMatch" )
							            .arg( asrToMsisdn + dao.wildcardForAnySequence(  ) );
			      		}					
							
							String asrSimNo = asrAddServReqDMO.getAsrSimNo(  );
							  if ( !DMO.isNull( asrSimNo ) ) {
							        queryArgs.andFilterBy( "asrSimNoMatch" )
							            .arg( asrSimNo + dao.wildcardForAnySequence(  ) );
			      		}					
							
							String asrToSim = asrAddServReqDMO.getAsrToSim(  );
							  if ( !DMO.isNull( asrToSim ) ) {
							        queryArgs.andFilterBy( "asrToSimMatch" )
							            .arg( asrToSim + dao.wildcardForAnySequence(  ) );
			      		}					
							
							String asrPortId = asrAddServReqDMO.getAsrPortId(  );
							  if ( !DMO.isNull( asrPortId ) ) {
							        queryArgs.andFilterBy( "asrPortIdMatch" )
							            .arg( asrPortId + dao.wildcardForAnySequence(  ) );
			      		}					
							
							String asrFileId = asrAddServReqDMO.getAsrFileId(  );
							  if ( !DMO.isNull( asrFileId ) ) {
							        queryArgs.andFilterBy( "asrFileIdMatch" )
							            .arg( asrFileId + dao.wildcardForAnySequence(  ) );
			      		}					
							
							String asrBillAcNo = asrAddServReqDMO.getAsrBillAcNo(  );
							  if ( !DMO.isNull( asrBillAcNo ) ) {
							        queryArgs.andFilterBy( "asrBillAcNoMatch" )
							            .arg( asrBillAcNo + dao.wildcardForAnySequence(  ) );
			      		}					
							
							String asrPackageCode = asrAddServReqDMO.getAsrPackageCode(  );
							  if ( !DMO.isNull( asrPackageCode ) ) {
							        queryArgs.andFilterBy( "asrPackageCodeMatch" )
							            .arg( asrPackageCode + dao.wildcardForAnySequence(  ) );
			      		}					
							
							String asrToPackage = asrAddServReqDMO.getAsrToPackage(  );
							  if ( !DMO.isNull( asrToPackage ) ) {
							        queryArgs.andFilterBy( "asrToPackageMatch" )
							            .arg( asrToPackage + dao.wildcardForAnySequence(  ) );
			      		}					
							
							String asrTariffCode = asrAddServReqDMO.getAsrTariffCode(  );
							  if ( !DMO.isNull( asrTariffCode ) ) {
							        queryArgs.andFilterBy( "asrTariffCodeMatch" )
							            .arg( asrTariffCode + dao.wildcardForAnySequence(  ) );
			      		}					
							
							String asrToTarCode = asrAddServReqDMO.getAsrToTarCode(  );
							  if ( !DMO.isNull( asrToTarCode ) ) {
							        queryArgs.andFilterBy( "asrToTarCodeMatch" )
							            .arg( asrToTarCode + dao.wildcardForAnySequence(  ) );
			      		}					
							
							DateTime asrSubmitDate = asrAddServReqDMO.getAsrSubmitDate(  );
							
							  if ( !DMO.isNull( asrSubmitDate ) ) {
							        queryArgs.andFilterBy( "asrSubmitDateMatch" )
							            .arg( asrSubmitDate);
			      		}					
							
							DateTime asrProcessedDate = asrAddServReqDMO.getAsrProcessedDate(  );
							  if ( !DMO.isNull( asrProcessedDate ) ) {
							        queryArgs.andFilterBy( "asrProcessedDateMatch" )
							            .arg( asrProcessedDate );
			      		}					
							
							String asrProcessedStat = asrAddServReqDMO.getAsrProcessedStat(  );
							  if ( !DMO.isNull( asrProcessedStat ) ) {
							        queryArgs.andFilterBy( "asrProcessedStatMatch" )
							            .arg( asrProcessedStat + dao.wildcardForAnySequence(  ) );
			      		}					
							
							String asrActionType = asrAddServReqDMO.getAsrActionType(  );
							  if ( !DMO.isNull( asrActionType ) ) {
							        queryArgs.andFilterBy( "asrActionTypeMatch" )
							            .arg( asrActionType + dao.wildcardForAnySequence(  ) );
			      		}					
							
							String asrComments = asrAddServReqDMO.getAsrComments(  );
							  if ( !DMO.isNull( asrComments ) ) {
							        queryArgs.andFilterBy( "asrCommentsMatch" )
							            .arg( asrComments + dao.wildcardForAnySequence(  ) );
			      		}					
							
							String asrSystemReq = asrAddServReqDMO.getAsrSystemReq(  );
							  if ( !DMO.isNull( asrSystemReq ) ) {
							        queryArgs.andFilterBy( "asrSystemReqMatch" )
							            .arg( asrSystemReq + dao.wildcardForAnySequence(  ) );
			      		}					
							
							String asrActReasCode = asrAddServReqDMO.getAsrActReasCode(  );
							  if ( !DMO.isNull( asrActReasCode ) ) {
							        queryArgs.andFilterBy( "asrActReasCodeMatch" )
							            .arg( asrActReasCode + dao.wildcardForAnySequence(  ) );
			      		}					
							
							String asrDeactType = asrAddServReqDMO.getAsrDeactType(  );
							  if ( !DMO.isNull( asrDeactType ) ) {
							        queryArgs.andFilterBy( "asrDeactTypeMatch" )
							            .arg( asrDeactType + dao.wildcardForAnySequence(  ) );
			      		}					
							
							Integer asrCntrPeriod = asrAddServReqDMO.getAsrCntrPeriod(  );
							  if ( !DMO.isNull( asrCntrPeriod ) ) {
							        queryArgs.andFilterBy( "asrCntrPeriodMatch" )
							            .arg( asrCntrPeriod);
			      		}					
							
							String asrHandsetMake = asrAddServReqDMO.getAsrHandsetMake(  );
							  if ( !DMO.isNull( asrHandsetMake ) ) {
							        queryArgs.andFilterBy( "asrHandsetMakeMatch" )
							            .arg( asrHandsetMake + dao.wildcardForAnySequence(  ) );
			      		}					
							
							String asrHandsetModel = asrAddServReqDMO.getAsrHandsetModel(  );
							  if ( !DMO.isNull( asrHandsetModel ) ) {
							        queryArgs.andFilterBy( "asrHandsetModelMatch" )
							            .arg( asrHandsetModel + dao.wildcardForAnySequence(  ) );
			      		}					
							
							String asrImei = asrAddServReqDMO.getAsrImei(  );
							  if ( !DMO.isNull( asrImei ) ) {
							        queryArgs.andFilterBy( "asrImeiMatch" )
							            .arg( asrImei + dao.wildcardForAnySequence(  ) );
			      		}					
							
							Double asrHandsetSubval = asrAddServReqDMO.getAsrHandsetSubval(  );
							  if ( !DMO.isNull( asrHandsetSubval ) ) {
							        queryArgs.andFilterBy( "asrHandsetSubvalMatch" )
							            .arg( asrHandsetSubval);
			      		}	

			    } else {
			      // include all default languageCode filters where appropriate...
			    }

			    return queryArgs;
			  }



	  protected DAOParamQueryArgs filterQueryArgs(
			    QueryFilter filter,
			    String      dmlName ) {
			    List parts = filter.getParts(  );
			    DAOParamQueryArgs queryArgs = new DAOParamQueryArgs( ( dmlName == null )
			        ? "AsrAddServReq" : dmlName, parts.size(  ) );

			    Iterator it = parts.iterator();
			    	while(it.hasNext()){
			    		FilterPart part = (FilterPart)it.next();

			      switch ( part.getIndex(  ) ) {
			      
			        case AsrAddServReqDMO.asrTransactIdFilter:
			          part.andFilterBy( queryArgs, "AsrTransactId", dao.wildcardForAnySequence(  ) );
			          break;

			        case AsrAddServReqDMO.asrSubscriberIdFilter:
			          part.andFilterBy( queryArgs, "AsrSubscriberId");
			          break;


			        case AsrAddServReqDMO.asrServiceCodeFilter:
			          part.andFilterBy( queryArgs, "AsrServiceCode", dao.wildcardForAnySequence(  ) );
			          break;


			        case AsrAddServReqDMO.asrActiveFlagFilter:
			          part.andFilterBy( queryArgs, "AsrActiveFlag", dao.wildcardForAnySequence(  ) );
			          break;


			        case AsrAddServReqDMO.asrParamIdFilter:
			          part.andFilterBy( queryArgs, "asrParamId");
			          break;


			        case AsrAddServReqDMO.asrParamValueFilter:
			          part.andFilterBy( queryArgs, "AsrParamValue", dao.wildcardForAnySequence(  ) );
			          break;


			        case AsrAddServReqDMO.asrMsisdnNoFilter:
			          part.andFilterBy( queryArgs, "AsrMsisdnNo", dao.wildcardForAnySequence(  ) );
			          break;


			        case AsrAddServReqDMO.asrToMsisdnFilter:
			          part.andFilterBy( queryArgs, "AsrToMsisdn", dao.wildcardForAnySequence(  ) );
			          break;


			        case AsrAddServReqDMO.asrSimNoFilter:
			          part.andFilterBy( queryArgs, "AsrSimNo", dao.wildcardForAnySequence(  ) );
			          break;


			        case AsrAddServReqDMO.asrToSimFilter:
			          part.andFilterBy( queryArgs, "AsrToSim", dao.wildcardForAnySequence(  ) );
			          break;


			        case AsrAddServReqDMO.asrPortIdFilter:
			          part.andFilterBy( queryArgs, "AsrPortId", dao.wildcardForAnySequence(  ) );
			          break;


			        case AsrAddServReqDMO.asrFileIdFilter:
			          part.andFilterBy( queryArgs, "AsrFileId", dao.wildcardForAnySequence(  ) );
			          break;


			        case AsrAddServReqDMO.asrBillAcNoFilter:
			          part.andFilterBy( queryArgs, "AsrBillAcNo", dao.wildcardForAnySequence(  ) );
			          break;


			        case AsrAddServReqDMO.asrPackageCodeFilter:
			          part.andFilterBy( queryArgs, "AsrPackageCode", dao.wildcardForAnySequence(  ) );
			          break;


			        case AsrAddServReqDMO.asrToPackageFilter:
			          part.andFilterBy( queryArgs, "AsrToPackage", dao.wildcardForAnySequence(  ) );
			          break;


			        case AsrAddServReqDMO.asrTariffCodeFilter:
			          part.andFilterBy( queryArgs, "AsrTariffCode", dao.wildcardForAnySequence(  ) );
			          break;


			        case AsrAddServReqDMO.asrToTarCodeFilter:
			          part.andFilterBy( queryArgs, "AsrToTarCode", dao.wildcardForAnySequence(  ) );
			          break;


			        case AsrAddServReqDMO.asrSubmitDateFilter:
			          part.andFilterBy( queryArgs, "AsrSubmitDate" );
			          break;


			        case AsrAddServReqDMO.asrProcessedDateFilter:
			          part.andFilterBy( queryArgs, "AsrProcessedDate" );
			          break;


			        case AsrAddServReqDMO.asrProcessedStatFilter:
			          part.andFilterBy( queryArgs, "AsrProcessedStat", dao.wildcardForAnySequence(  ) );
			          break;


			        case AsrAddServReqDMO.asrActionTypeFilter:
			          part.andFilterBy( queryArgs, "AsrActionType", dao.wildcardForAnySequence(  ) );
			          break;


			        case AsrAddServReqDMO.asrCommentsFilter:
			          part.andFilterBy( queryArgs, "AsrComments", dao.wildcardForAnySequence(  ) );
			          break;


			        case AsrAddServReqDMO.asrSystemReqFilter:
			          part.andFilterBy( queryArgs, "AsrSystemReq", dao.wildcardForAnySequence(  ) );
			          break;


			        case AsrAddServReqDMO.asrActReasCodeFilter:
			          part.andFilterBy( queryArgs, "AsrActReasCode", dao.wildcardForAnySequence(  ) );
			          break;


			        case AsrAddServReqDMO.asrDeactTypeFilter:
			          part.andFilterBy( queryArgs, "AsrDeactType", dao.wildcardForAnySequence(  ) );
			          break;


			        case AsrAddServReqDMO.asrCntrPeriodFilter:
			          part.andFilterBy( queryArgs, "AsrCntrPeriod", dao.wildcardForAnySequence(  ) );
			          break;


			        case AsrAddServReqDMO.asrHandsetMakeFilter:
			          part.andFilterBy( queryArgs, "AsrHandsetMake", dao.wildcardForAnySequence(  ) );
			          break;


			        case AsrAddServReqDMO.asrHandsetModelFilter:
			          part.andFilterBy( queryArgs, "AsrHandsetModel", dao.wildcardForAnySequence(  ) );
			          break;


			        case AsrAddServReqDMO.asrImeiFilter:
			          part.andFilterBy( queryArgs, "AsrImei", dao.wildcardForAnySequence(  ) );
			          break;


			        case AsrAddServReqDMO.asrHandsetSubvalFilter:
			          part.andFilterBy( queryArgs, "AsrHandsetSubval");
			          break;

			      }
			    }

			    return queryArgs;
			  }


	  public Iterator iterate( QueryFilter filter )
	    throws EPPIXSeriousException {
	    logger.debug( "iterate( filter )" );

	    return (Iterator)dao.iterator(filterQueryArgs( filter, null ) );

	  }

	  public DAOIterator iterateWithLock( QueryFilter filter )
	    throws EPPIXSeriousException {
	    logger.debug( "iterateWithLock( filter )" );

	    return dao.iterator(filterQueryArgs( filter, null ), true );

	  }


	  public AsrAddServReqDMO get( QueryFilter filter )
	    throws EPPIXSeriousException {
	    logger.debug( "get( filter )" );

	    DAOParamQueryArgs args = filterQueryArgs( filter, null );

	    return (AsrAddServReqDMO) dao.get( args.getDMLName(  ),
	      args.getFilterBy(  ), args );
	  }


	  public Object max( QueryFilter filter )
	    throws EPPIXSeriousException {
	    logger.debug( "max( filter )" );

	    DAOParamQueryArgs args = filterQueryArgs( filter, null );

	    return dao.max( args.getDMLName(  ), args.getFilterBy(  ), args,
	      args.getMaxField(  ) );
	  }


	  public Object min( QueryFilter filter )
	    throws EPPIXSeriousException {
	    logger.debug( "min( filter )" );

	    DAOParamQueryArgs args = filterQueryArgs( filter, null );

	    return dao.min( args.getDMLName(  ), args.getFilterBy(  ), args,
	      args.getMaxField(  ) );
	  }


	  public int count( QueryFilter filter )
	    throws EPPIXSeriousException {
	    logger.debug( "count( filter )" );

	    DAOParamQueryArgs args = filterQueryArgs( filter, null );

	    return dao.count( args.getDMLName(  ), args.getFilterBy(  ), args );
	  }
	}

