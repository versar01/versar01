package com.eppixcomm.eppix.base.blo;

import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;

import com.eppixcomm.eppix.base.error.EPPIXObjectExpiredException;
import com.eppixcomm.eppix.base.error.EPPIXObjectNotFoundException;
import com.eppixcomm.eppix.base.error.EPPIXSeriousException;
import com.eppixcomm.eppix.common.data.DAC;
import com.eppixcomm.eppix.common.data.DAO;
import com.eppixcomm.eppix.common.data.DAOIterator;
import com.eppixcomm.eppix.common.data.DAOParamQueryArgs;
import com.eppixcomm.eppix.common.data.DAOThrower;
import com.eppixcomm.eppix.common.data.DMO;
import com.eppixcomm.eppix.common.data.DTOList;
import com.eppixcomm.eppix.common.data.DTOListState;
import com.eppixcomm.eppix.common.util.Date;
import com.eppixcomm.eppix.common.util.FilterPart;
import com.eppixcomm.eppix.common.util.QueryFilter;

public class SbeSubEquipAbstractDACImpl extends DAC implements
		SbeSubEquipAbstractDAC {

	static DAOThrower thrower = DAOThrower
			.getDAOThrower(SbeSubEquipAbstractDACImpl.class);
	Logger logger = thrower.getLogger();

	public SbeSubEquipAbstractDACImpl(DAO dao, DAOThrower thrower) {
		super(dao, thrower);
	}

	public SbeSubEquipAbstractDACImpl(DAO dao) {
		super(dao, thrower);
	}

	  public SbeSubEquipDMO get( SbeSubEquipDMO sbeSubEquipDMO )
			    throws EPPIXSeriousException {
			    logger.debug( "get( SbeSubEquipDMO )" );

			    thrower.ifParameterMissing("SbeSubEquipDMO", sbeSubEquipDMO);

			    return (SbeSubEquipDMO) dao.get( sbeSubEquipDMO );
			  }


			  public void create( SbeSubEquipDMO sbeSubEquipDMO )
			    throws EPPIXSeriousException {
			    logger.debug( "create( sbeSubEquipDMO )" );
			    thrower.ifParameterMissing( "SbeSubEquipDMO", sbeSubEquipDMO );

			    dao.insert( sbeSubEquipDMO );

			  }

			  public void modify( QueryFilter filter )
			    throws EPPIXSeriousException, EPPIXObjectExpiredException,
			      EPPIXObjectNotFoundException {
			    logger.debug( "modify( filter )" );

			    thrower.ifParameterMissing( "filter", filter );

			    dao.updateCustom( new SbeSubEquipDMO(  ),
			      filterQueryArgs( filter, "SbeSubEquip" ) );
			  }


			  public void delete( SbeSubEquipDMO sbeSubEquipDMO )
			    throws EPPIXSeriousException, EPPIXObjectNotFoundException,
			      EPPIXObjectExpiredException {
			    logger.debug( "delete( SbeSubEquipDMO )" );

			    thrower.ifParameterMissing( "SbeSubEquipDMO", sbeSubEquipDMO );


			    dao.delete(sbeSubEquipDMO);
			  }


			  public void delete( QueryFilter filter )
			    throws EPPIXSeriousException, EPPIXObjectNotFoundException,
			      EPPIXObjectExpiredException {
			    logger.debug( "delete( filter )" );

			    thrower.ifParameterMissing( "filter", filter );

			    DAOParamQueryArgs args = filterQueryArgs( filter, "SbeSubEquip" );

			    dao.delete( "SbeSubEquip", args.getFilterBy(  ), args );
			  }


			  public boolean exists( SbeSubEquipDMO sbeSubEquipDMO )
			    throws EPPIXSeriousException {
			    logger.debug( "exists( SbeSubEquipDMO)" );

//			    QueryFilter filter = new QueryFilter();
//			    filter.add(FilterOp.EQUAL, SbeSubEquipDMO.hmManuIdFilter, sbeSubEquipDMO.getHmManuId());
		//
//			    return this.exists(filter);
			    return dao.exists(sbeSubEquipDMO);
			  }


			  public boolean exists( QueryFilter filter )
			    throws EPPIXSeriousException {
			    logger.debug( "exists( filter )" );

			    return dao.exists( filterQueryArgs( filter, null ) );
			  }


			  public DTOList getList(DTOListState state, SbeSubEquipDMO sbeSubEquipDMO )
			    throws EPPIXSeriousException {
			    logger.debug( "getList( state, sbeSubEquipDMO )" );

			    return new DTOList(dao.getList(paramQueryArgs( sbeSubEquipDMO)));
			  }


			  protected DAOParamQueryArgs paramQueryArgs(
			    SbeSubEquipDMO sbeSubEquipDMO ) {
			    logger.debug( "paramQueryArgs( sbeSubEquipDMO)" );

			    DAOParamQueryArgs queryArgs = new DAOParamQueryArgs( "SbeSubEquip",
			        34 * 34 );

			    if ( sbeSubEquipDMO != null ) {

			      Integer SbeSubEquipId = sbeSubEquipDMO.getSbeSubEquipId();

			      if ( !DMO.isNull( SbeSubEquipId ) ) {
			        queryArgs.andFilterBy( "SbeSubEquipIdMatch" )
			                 .arg( SbeSubEquipId );
			      }


			      Integer SbeSubscriberId = sbeSubEquipDMO.getSbeSubscriberId();

			      if ( !DMO.isNull( SbeSubscriberId ) ) {
			        queryArgs.andFilterBy( "SbeSubscriberIdMatch" )
			                 .arg( SbeSubscriberId );
			      }


			      String SbeImeiNo = sbeSubEquipDMO.getSbeImeiNo();

			      if ( !DMO.isNull( SbeImeiNo ) ) {
			        queryArgs.andFilterBy( "SbeImeiNoMatch" )
			                 .arg( SbeImeiNo );
			      }


			      String SbeSerialNo = sbeSubEquipDMO.getSbeSerialNo();

			      if ( !DMO.isNull( SbeSerialNo ) ) {
			        queryArgs.andFilterBy( "SbeSerialNoMatch" )
			                 .arg( SbeSerialNo );
			      }


			      String SbeWarehouse = sbeSubEquipDMO.getSbeWarehouse();

			      if ( !DMO.isNull( SbeWarehouse ) ) {
			        queryArgs.andFilterBy( "SbeWarehouseMatch" )
			                 .arg( SbeWarehouse );
			      }


			      String SbeProductCode = sbeSubEquipDMO.getSbeProductCode();

			      if ( !DMO.isNull( SbeProductCode ) ) {
			        queryArgs.andFilterBy( "SbeProductCodeMatch" )
			                 .arg( SbeProductCode );
			      }


			      String SbeAntenna = sbeSubEquipDMO.getSbeAntenna();

			      if ( !DMO.isNull( SbeAntenna ) ) {
			        queryArgs.andFilterBy( "SbeAntennaMatch" )
			                 .arg( SbeAntenna );
			      }


			      String SbeMsisdn = sbeSubEquipDMO.getSbeMsisdn();

			      if ( !DMO.isNull( SbeMsisdn ) ) {
			        queryArgs.andFilterBy( "SbeMsisdnMatch" )
			                 .arg( SbeMsisdn );
			      }


			      String SbeImeiSimPair = sbeSubEquipDMO.getSbeImeiSimPair();

			      if ( !DMO.isNull( SbeImeiSimPair ) ) {
			        queryArgs.andFilterBy( "SbeImeiSimPairMatch" )
			                 .arg( SbeImeiSimPair );
			      }


			      String SbeDealId = sbeSubEquipDMO.getSbeDealId();

			      if ( !DMO.isNull( SbeDealId ) ) {
			        queryArgs.andFilterBy( "SbeDealIdMatch" )
			                 .arg( SbeDealId );
			      }


			      String SbeGroupIdx = sbeSubEquipDMO.getSbeGroupIdx();

			      if ( !DMO.isNull( SbeGroupIdx ) ) {
			        queryArgs.andFilterBy( "SbeGroupIdxMatch" )
			                 .arg( SbeGroupIdx );
			      }


			      Date SbeActiveDate = sbeSubEquipDMO.getSbeActiveDate();

			      if ( !DMO.isNull( SbeActiveDate ) ) {
			        queryArgs.andFilterBy( "SbeActiveDateMatch" )
			                 .arg( SbeActiveDate );
			      }


			      Integer SbeUpgradeId = sbeSubEquipDMO.getSbeUpgradeId();

			      if ( !DMO.isNull( SbeUpgradeId ) ) {
			        queryArgs.andFilterBy( "SbeUpgradeIdMatch" )
			                 .arg( SbeUpgradeId );
			      }


			      String SbeMake = sbeSubEquipDMO.getSbeMake();

			      if ( !DMO.isNull( SbeMake ) ) {
			        queryArgs.andFilterBy( "SbeMakeMatch" )
			                 .arg( SbeMake );
			      }


			      String SbeModel = sbeSubEquipDMO.getSbeModel();

			      if ( !DMO.isNull( SbeModel ) ) {
			        queryArgs.andFilterBy( "SbeModelMatch" )
			                 .arg( SbeModel );
			      }


			      String SbeDescription = sbeSubEquipDMO.getSbeDescription();

			      if ( !DMO.isNull( SbeDescription ) ) {
			        queryArgs.andFilterBy( "SbeDescriptionMatch" )
			                 .arg( SbeDescription );
			      }


			      Double SbeHandsetVal = sbeSubEquipDMO.getSbeHandsetVal();

			      if ( !DMO.isNull( SbeHandsetVal ) ) {
			        queryArgs.andFilterBy( "SbeHandsetValMatch" )
			                 .arg( SbeHandsetVal );
			      }


			      Double SbeEarlytermChg = sbeSubEquipDMO.getSbeEarlytermChg();

			      if ( !DMO.isNull( SbeEarlytermChg ) ) {
			        queryArgs.andFilterBy( "SbeEarlytermChgMatch" )
			                 .arg( SbeEarlytermChg );
			      }


			      Double SbeAddCharge1 = sbeSubEquipDMO.getSbeAddCharge1();

			      if ( !DMO.isNull( SbeAddCharge1 ) ) {
			        queryArgs.andFilterBy( "SbeAddCharge1Match" )
			                 .arg( SbeAddCharge1 );
			      }


			      Double SbeAddCharge2 = sbeSubEquipDMO.getSbeAddCharge2();

			      if ( !DMO.isNull( SbeAddCharge2 ) ) {
			        queryArgs.andFilterBy( "SbeAddCharge2Match" )
			                 .arg( SbeAddCharge2 );
			      }


			      String SbeDevicePriority = sbeSubEquipDMO.getSbeDevicePriority();

			      if ( !DMO.isNull( SbeDevicePriority ) ) {
			        queryArgs.andFilterBy( "SbeDevicePriorityMatch" )
			                 .arg( SbeDevicePriority );
			      }


			      Date SbeCaptureDate = sbeSubEquipDMO.getSbeCaptureDate();

			      if ( !DMO.isNull( SbeCaptureDate ) ) {
			        queryArgs.andFilterBy( "SbeCaptureDateMatch" )
			                 .arg( SbeCaptureDate );
			      }


			      Date SbeDate1 = sbeSubEquipDMO.getSbeDate1();

			      if ( !DMO.isNull( SbeDate1 ) ) {
			        queryArgs.andFilterBy( "SbeDate1Match" )
			                 .arg( SbeDate1 );
			      }


			      Date SbeDate2 = sbeSubEquipDMO.getSbeDate2();

			      if ( !DMO.isNull( SbeDate2 ) ) {
			        queryArgs.andFilterBy( "SbeDate2Match" )
			                 .arg( SbeDate2 );
			      }


			      Date SbeDate3 = sbeSubEquipDMO.getSbeDate3();

			      if ( !DMO.isNull( SbeDate3 ) ) {
			        queryArgs.andFilterBy( "SbeDate3Match" )
			                 .arg( SbeDate3 );
			      }


			      Integer SbeInt1 = sbeSubEquipDMO.getSbeInt1();

			      if ( !DMO.isNull( SbeInt1 ) ) {
			        queryArgs.andFilterBy( "SbeInt1Match" )
			                 .arg( SbeInt1 );
			      }


			      Integer SbeInt2 = sbeSubEquipDMO.getSbeInt2();

			      if ( !DMO.isNull( SbeInt2 ) ) {
			        queryArgs.andFilterBy( "SbeInt2Match" )
			                 .arg( SbeInt2 );
			      }


			      Integer SbeInt3 = sbeSubEquipDMO.getSbeInt3();

			      if ( !DMO.isNull( SbeInt3 ) ) {
			        queryArgs.andFilterBy( "SbeInt3Match" )
			                 .arg( SbeInt3 );
			      }


			      Double SbeFloat1 = sbeSubEquipDMO.getSbeFloat1();

			      if ( !DMO.isNull( SbeFloat1 ) ) {
			        queryArgs.andFilterBy( "SbeFloat1Match" )
			                 .arg( SbeFloat1 );
			      }


			      Double SbeFloat2 = sbeSubEquipDMO.getSbeFloat2();

			      if ( !DMO.isNull( SbeFloat2 ) ) {
			        queryArgs.andFilterBy( "SbeFloat2Match" )
			                 .arg( SbeFloat2 );
			      }


			      Double SbeFloat3 = sbeSubEquipDMO.getSbeFloat3();

			      if ( !DMO.isNull( SbeFloat3 ) ) {
			        queryArgs.andFilterBy( "SbeFloat3Match" )
			                 .arg( SbeFloat3 );
			      }


			      String SbeChar1 = sbeSubEquipDMO.getSbeChar1();

			      if ( !DMO.isNull( SbeChar1 ) ) {
			        queryArgs.andFilterBy( "SbeChar1Match" )
			                 .arg( SbeChar1 );
			      }


			      String SbeChar2 = sbeSubEquipDMO.getSbeChar2();

			      if ( !DMO.isNull( SbeChar2 ) ) {
			        queryArgs.andFilterBy( "SbeChar2Match" )
			                 .arg( SbeChar2 );
			      }


			      String SbeChar3 = sbeSubEquipDMO.getSbeChar3();

			      if ( !DMO.isNull( SbeChar3 ) ) {
			        queryArgs.andFilterBy( "SbeChar3Match" )
			                 .arg( SbeChar3 );
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
			        ? "SbeSubEquip" : dmlName, parts.size(  ) );

			    Iterator it = parts.iterator();
			    	while(it.hasNext()){
			    		FilterPart part = (FilterPart)it.next();

			      switch (part.getIndex()) {
			        case SbeSubEquipDMO.sbeSubEquipIdFilter:
			          part.andFilterBy( queryArgs, "sbeSubEquipId", dao.wildcardForAnySequence(  ) );
			          break;

			        case SbeSubEquipDMO.sbeSubscriberIdFilter:
			          part.andFilterBy( queryArgs, "sbeSubscriberId", dao.wildcardForAnySequence(  ) );
			          break;

			        case SbeSubEquipDMO.sbeImeiNoFilter:
			          part.andFilterBy( queryArgs, "sbeImeiNo", dao.wildcardForAnySequence(  ) );
			          break;

			        case SbeSubEquipDMO.sbeSerialNoFilter:
			          part.andFilterBy( queryArgs, "sbeSerialNo", dao.wildcardForAnySequence(  ) );
			          break;

			        case SbeSubEquipDMO.sbeWarehouseFilter:
			          part.andFilterBy( queryArgs, "sbeWarehouse", dao.wildcardForAnySequence(  ) );
			          break;

			        case SbeSubEquipDMO.sbeProductCodeFilter:
			          part.andFilterBy( queryArgs, "sbeProductCode", dao.wildcardForAnySequence(  ) );
			          break;

			        case SbeSubEquipDMO.sbeAntennaFilter:
			          part.andFilterBy( queryArgs, "sbeAntenna", dao.wildcardForAnySequence(  ) );
			          break;

			        case SbeSubEquipDMO.sbeMsisdnFilter:
			          part.andFilterBy( queryArgs, "sbeMsisdn", dao.wildcardForAnySequence(  ) );
			          break;

			        case SbeSubEquipDMO.sbeImeiSimPairFilter:
			          part.andFilterBy( queryArgs, "sbeImeiSimPair", dao.wildcardForAnySequence(  ) );
			          break;

			        case SbeSubEquipDMO.sbeDealIdFilter:
			          part.andFilterBy( queryArgs, "sbeDealId", dao.wildcardForAnySequence(  ) );
			          break;

			        case SbeSubEquipDMO.sbeGroupIdxFilter:
			          part.andFilterBy( queryArgs, "sbeGroupIdx", dao.wildcardForAnySequence(  ) );
			          break;

			        case SbeSubEquipDMO.sbeActiveDateFilter:
			          part.andFilterBy( queryArgs, "sbeActiveDate", dao.wildcardForAnySequence(  ) );
			          break;

			        case SbeSubEquipDMO.sbeUpgradeIdFilter:
			          part.andFilterBy( queryArgs, "sbeUpgradeId", dao.wildcardForAnySequence(  ) );
			          break;

			        case SbeSubEquipDMO.sbeMakeFilter:
			          part.andFilterBy( queryArgs, "sbeMake", dao.wildcardForAnySequence(  ) );
			          break;

			        case SbeSubEquipDMO.sbeModelFilter:
			          part.andFilterBy( queryArgs, "sbeModel", dao.wildcardForAnySequence(  ) );
			          break;

			        case SbeSubEquipDMO.sbeDescriptionFilter:
			          part.andFilterBy( queryArgs, "sbeDescription", dao.wildcardForAnySequence(  ) );
			          break;

			        case SbeSubEquipDMO.sbeHandsetValFilter:
			          part.andFilterBy( queryArgs, "sbeHandsetVal", dao.wildcardForAnySequence(  ) );
			          break;

			        case SbeSubEquipDMO.sbeEarlytermChgFilter:
			          part.andFilterBy( queryArgs, "sbeEarlytermChg", dao.wildcardForAnySequence(  ) );
			          break;

			        case SbeSubEquipDMO.sbeAddCharge1Filter:
			          part.andFilterBy( queryArgs, "sbeAddCharge1", dao.wildcardForAnySequence(  ) );
			          break;

			        case SbeSubEquipDMO.sbeAddCharge2Filter:
			          part.andFilterBy( queryArgs, "sbeAddCharge2", dao.wildcardForAnySequence(  ) );
			          break;

			        case SbeSubEquipDMO.sbeDevicePriorityFilter:
			          part.andFilterBy( queryArgs, "sbeDevicePriority", dao.wildcardForAnySequence(  ) );
			          break;

			        case SbeSubEquipDMO.sbeCaptureDateFilter:
			          part.andFilterBy( queryArgs, "sbeCaptureDate", dao.wildcardForAnySequence(  ) );
			          break;

			        case SbeSubEquipDMO.sbeDate1Filter:
			          part.andFilterBy( queryArgs, "sbeDate1", dao.wildcardForAnySequence(  ) );
			          break;

			        case SbeSubEquipDMO.sbeDate2Filter:
			          part.andFilterBy( queryArgs, "sbeDate2", dao.wildcardForAnySequence(  ) );
			          break;

			        case SbeSubEquipDMO.sbeDate3Filter:
			          part.andFilterBy( queryArgs, "sbeDate3", dao.wildcardForAnySequence(  ) );
			          break;

			        case SbeSubEquipDMO.sbeInt1Filter:
			          part.andFilterBy( queryArgs, "sbeInt1", dao.wildcardForAnySequence(  ) );
			          break;

			        case SbeSubEquipDMO.sbeInt2Filter:
			          part.andFilterBy( queryArgs, "sbeInt2", dao.wildcardForAnySequence(  ) );
			          break;

			        case SbeSubEquipDMO.sbeInt3Filter:
			          part.andFilterBy( queryArgs, "sbeInt3", dao.wildcardForAnySequence(  ) );
			          break;

			        case SbeSubEquipDMO.sbeFloat1Filter:
			          part.andFilterBy( queryArgs, "sbeFloat1", dao.wildcardForAnySequence(  ) );
			          break;

			        case SbeSubEquipDMO.sbeFloat2Filter:
			          part.andFilterBy( queryArgs, "sbeFloat2", dao.wildcardForAnySequence(  ) );
			          break;

			        case SbeSubEquipDMO.sbeFloat3Filter:
			          part.andFilterBy( queryArgs, "sbeFloat3", dao.wildcardForAnySequence(  ) );
			          break;

			        case SbeSubEquipDMO.sbeChar1Filter:
			          part.andFilterBy( queryArgs, "sbeChar1", dao.wildcardForAnySequence(  ) );
			          break;

			        case SbeSubEquipDMO.sbeChar2Filter:
			          part.andFilterBy( queryArgs, "sbeChar2", dao.wildcardForAnySequence(  ) );
			          break;

			        case SbeSubEquipDMO.sbeChar3Filter:
			          part.andFilterBy( queryArgs, "sbeChar3", dao.wildcardForAnySequence(  ) );
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


			  public SbeSubEquipDMO get( QueryFilter filter )
			    throws EPPIXSeriousException {
			    logger.debug( "get( filter )" );

			    DAOParamQueryArgs args = filterQueryArgs( filter, "SbeSubEquip");

			    return (SbeSubEquipDMO) dao.get( args.getDMLName(  ),
			      args.getFilterBy(  ), args );
			  }


			  public Object max( QueryFilter filter )
			    throws EPPIXSeriousException {
			    logger.debug( "max( filter )" );

			    DAOParamQueryArgs args = filterQueryArgs( filter, "SbeSubEquip" );

			    return dao.max( args.getDMLName(  ), args.getFilterBy(  ), args,
			      args.getMaxField(  ) );
			  }


			  public Object min( QueryFilter filter )
			    throws EPPIXSeriousException {
			    logger.debug( "min( filter )" );

			    DAOParamQueryArgs args = filterQueryArgs( filter, "SbeSubEquip" );

			    return dao.min( args.getDMLName(  ), args.getFilterBy(  ), args,
			      args.getMaxField(  ) );
			  }


			  public int count( QueryFilter filter )
			    throws EPPIXSeriousException {
			    logger.debug( "count( filter )" );

			    DAOParamQueryArgs args = filterQueryArgs( filter, "SbeSubEquip" );

			    return dao.count( args.getDMLName(  ), args.getFilterBy(  ), args );
			  }
}