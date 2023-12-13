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
import com.eppixcomm.eppix.common.util.DateTime;
import com.eppixcomm.eppix.common.util.FilterPart;
import com.eppixcomm.eppix.common.util.QueryFilter;



public class VcfVrbleChrgFeeAbstractDACImpl extends DAC implements VcfVrbleChrgFeeAbstractDAC{
	  static DAOThrower thrower = DAOThrower.getDAOThrower( VcfVrbleChrgFeeAbstractDACImpl.class );
	  Logger logger = thrower.getLogger(  );

	public VcfVrbleChrgFeeAbstractDACImpl(DAO dao, DAOThrower thrower) {
		super(dao, thrower);
	}

	public VcfVrbleChrgFeeAbstractDACImpl(DAO dao) {
		super(dao, thrower);
	}

	  public VcfVrbleChrgFeeDMO get( VcfVrbleChrgFeeDMO vcfVrbleChrgFeeDMO )
	    throws EPPIXSeriousException {
	    logger.debug( "get( VcfVrbleChrgFeeDMO )" );

	    thrower.ifParameterMissing("VcfVrbleChrgFeeDMO", vcfVrbleChrgFeeDMO);

	    return (VcfVrbleChrgFeeDMO) dao.get( vcfVrbleChrgFeeDMO );
	  }


	  public void create( VcfVrbleChrgFeeDMO vcfVrbleChrgFeeDMO )
	    throws EPPIXSeriousException {
	    logger.debug( "create( vcfVrbleChrgFeeDMO )" );
	    thrower.ifParameterMissing( "VcfVrbleChrgFeeDMO", vcfVrbleChrgFeeDMO );

	    dao.insert( vcfVrbleChrgFeeDMO );

	  }

	  public void modify( QueryFilter filter )
	    throws EPPIXSeriousException, EPPIXObjectExpiredException,
	      EPPIXObjectNotFoundException {
	    logger.debug( "modify( filter )" );

	    thrower.ifParameterMissing( "filter", filter );

	    dao.updateCustom( new VcfVrbleChrgFeeDMO(  ),
	      filterQueryArgs( filter, "VcfVrbleChrgFee" ) );
	  }


	  public void delete( VcfVrbleChrgFeeDMO vcfVrbleChrgFeeDMO )
	    throws EPPIXSeriousException, EPPIXObjectNotFoundException,
	      EPPIXObjectExpiredException {
	    logger.debug( "delete( VcfVrbleChrgFeeDMO )" );

	    thrower.ifParameterMissing( "VcfVrbleChrgFeeDMO", vcfVrbleChrgFeeDMO );


	    dao.delete(vcfVrbleChrgFeeDMO);
	  }


	  public void delete( QueryFilter filter )
	    throws EPPIXSeriousException, EPPIXObjectNotFoundException,
	      EPPIXObjectExpiredException {
	    logger.debug( "delete( filter )" );

	    thrower.ifParameterMissing( "filter", filter );

	    DAOParamQueryArgs args = filterQueryArgs( filter, "VcfVrbleChrgFee" );

	    dao.delete( "VcfVrbleChrgFee", args.getFilterBy(  ), args );
	  }


	  public boolean exists( VcfVrbleChrgFeeDMO vcfVrbleChrgFeeDMO )
	    throws EPPIXSeriousException {
	    logger.debug( "exists( VcfVrbleChrgFeeDMO)" );

//	    QueryFilter filter = new QueryFilter();
//	    filter.add(FilterOp.EQUAL, VcfVrbleChrgFeeDMO.hmManuIdFilter, vcfVrbleChrgFeeDMO.getHmManuId());
//
//	    return this.exists(filter);
	    return dao.exists(vcfVrbleChrgFeeDMO);
	  }


	  public boolean exists( QueryFilter filter )
	    throws EPPIXSeriousException {
	    logger.debug( "exists( filter )" );

	    return dao.exists( filterQueryArgs( filter, null ) );
	  }


	  public DTOList getList(DTOListState state, VcfVrbleChrgFeeDMO vcfVrbleChrgFeeDMO )
	    throws EPPIXSeriousException {
	    logger.debug( "getList( state, vcfVrbleChrgFeeDMO )" );

	    return new DTOList(dao.getList(paramQueryArgs( vcfVrbleChrgFeeDMO)));
	  }


	  protected DAOParamQueryArgs paramQueryArgs(
	    VcfVrbleChrgFeeDMO vcfVrbleChrgFeeDMO ) {
	    logger.debug( "paramQueryArgs( vcfVrbleChrgFeeDMO)" );

	    DAOParamQueryArgs queryArgs = new DAOParamQueryArgs( "VcfVrbleChrgFee",
	        21 * 2 );

	    if ( vcfVrbleChrgFeeDMO != null ) {

	      Integer VcfEquipId = vcfVrbleChrgFeeDMO.getVcfEquipId();

	      if ( !DMO.isNull( VcfEquipId ) ) {
	        queryArgs.andFilterBy( "VcfEquipIdMatch" )
	                 .arg( VcfEquipId );
	      }


	      String VcfCustomer = vcfVrbleChrgFeeDMO.getVcfCustomer();

	      if ( !DMO.isNull( VcfCustomer ) ) {
	        queryArgs.andFilterBy( "VcfCustomerMatch" )
	                 .arg( VcfCustomer );
	      }


	      Integer VcfSubscriberId = vcfVrbleChrgFeeDMO.getVcfSubscriberId();

	      if ( !DMO.isNull( VcfSubscriberId ) ) {
	        queryArgs.andFilterBy( "VcfSubscriberIdMatch" )
	                 .arg( VcfSubscriberId );
	      }


	      String VcfVariableType = vcfVrbleChrgFeeDMO.getVcfVariableType();

	      if ( !DMO.isNull( VcfVariableType ) ) {
	        queryArgs.andFilterBy( "VcfVariableTypeMatch" )
	                 .arg( VcfVariableType );
	      }


	      String VcfProductCode = vcfVrbleChrgFeeDMO.getVcfProductCode();

	      if ( !DMO.isNull( VcfProductCode ) ) {
	        queryArgs.andFilterBy( "VcfProductCodeMatch" )
	                 .arg( VcfProductCode );
	      }


	      String VcfDescription = vcfVrbleChrgFeeDMO.getVcfDescription();

	      if ( !DMO.isNull( VcfDescription ) ) {
	        queryArgs.andFilterBy( "VcfDescriptionMatch" )
	                 .arg( VcfDescription );
	      }


	      String VcfMake = vcfVrbleChrgFeeDMO.getVcfMake();

	      if ( !DMO.isNull( VcfMake ) ) {
	        queryArgs.andFilterBy( "VcfMakeMatch" )
	                 .arg( VcfMake );
	      }


	      String VcfModel = vcfVrbleChrgFeeDMO.getVcfModel();

	      if ( !DMO.isNull( VcfModel ) ) {
	        queryArgs.andFilterBy( "VcfModelMatch" )
	                 .arg( VcfModel );
	      }


	      String VcfInventryItemid = vcfVrbleChrgFeeDMO.getVcfInventryItemid();

	      if ( !DMO.isNull( VcfInventryItemid ) ) {
	        queryArgs.andFilterBy( "VcfInventryItemidMatch" )
	                 .arg( VcfInventryItemid );
	      }


	      Date VcfStartDate = vcfVrbleChrgFeeDMO.getVcfStartDate();

	      if ( !DMO.isNull( VcfStartDate ) ) {
	        queryArgs.andFilterBy( "VcfStartDateMatch" )
	                 .arg( VcfStartDate );
	      }


	      Date VcfEndDate = vcfVrbleChrgFeeDMO.getVcfEndDate();

	      if ( !DMO.isNull( VcfEndDate ) ) {
	        queryArgs.andFilterBy( "VcfEndDateMatch" )
	                 .arg( VcfEndDate );
	      }


	      Integer VcfContrcLength = vcfVrbleChrgFeeDMO.getVcfContrcLength();

	      if ( !DMO.isNull( VcfContrcLength ) ) {
	        queryArgs.andFilterBy( "VcfContrcLengthMatch" )
	                 .arg( VcfContrcLength );
	      }


	      Double VcfFullAmt = vcfVrbleChrgFeeDMO.getVcfFullAmt();

	      if ( !DMO.isNull( VcfFullAmt ) ) {
	        queryArgs.andFilterBy( "VcfFullAmtMatch" )
	                 .arg( VcfFullAmt );
	      }


	      Double VcfMonthAmt = vcfVrbleChrgFeeDMO.getVcfMonthAmt();

	      if ( !DMO.isNull( VcfMonthAmt ) ) {
	        queryArgs.andFilterBy( "VcfMonthAmtMatch" )
	                 .arg( VcfMonthAmt );
	      }


	      String VcfNextPeriod = vcfVrbleChrgFeeDMO.getVcfNextPeriod();

	      if ( !DMO.isNull( VcfNextPeriod ) ) {
	        queryArgs.andFilterBy( "VcfNextPeriodMatch" )
	                 .arg( VcfNextPeriod );
	      }


	      String VcfNextYear = vcfVrbleChrgFeeDMO.getVcfNextYear();

	      if ( !DMO.isNull( VcfNextYear ) ) {
	        queryArgs.andFilterBy( "VcfNextYearMatch" )
	                 .arg( VcfNextYear );
	      }


	      Double VcfRemAmt = vcfVrbleChrgFeeDMO.getVcfRemAmt();

	      if ( !DMO.isNull( VcfRemAmt ) ) {
	        queryArgs.andFilterBy( "VcfRemAmtMatch" )
	                 .arg( VcfRemAmt );
	      }


	      Short VcfRemPeriod = vcfVrbleChrgFeeDMO.getVcfRemPeriod();

	      if ( !DMO.isNull( VcfRemPeriod ) ) {
	        queryArgs.andFilterBy( "VcfRemPeriodMatch" )
	                 .arg( VcfRemPeriod );
	      }


	      String VcfChargeCode = vcfVrbleChrgFeeDMO.getVcfChargeCode();

	      if ( !DMO.isNull( VcfChargeCode ) ) {
	        queryArgs.andFilterBy( "VcfChargeCodeMatch" )
	                 .arg( VcfChargeCode );
	      }


	      String VcfStatus = vcfVrbleChrgFeeDMO.getVcfStatus();

	      if ( !DMO.isNull( VcfStatus ) ) {
	        queryArgs.andFilterBy( "VcfStatusMatch" )
	                 .arg( VcfStatus );
	      }


	      DateTime VcfTimestamp = vcfVrbleChrgFeeDMO.getVcfTimestamp();

	      if ( !DMO.isNull( VcfTimestamp ) ) {
	        queryArgs.andFilterBy( "VcfTimestampMatch" )
	                 .arg( VcfTimestamp );
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
	        ? "VcfVrbleChrgFee" : dmlName, parts.size(  ) );

	    Iterator it = parts.iterator();
	    	while(it.hasNext()){
	    		FilterPart part = (FilterPart)it.next();

	      switch (part.getIndex()) {
	        case VcfVrbleChrgFeeDMO.vcfEquipIdFilter:
	          part.andFilterBy( queryArgs, "VcfEquipId", dao.wildcardForAnySequence(  ) );
	          break;

	        case VcfVrbleChrgFeeDMO.vcfCustomerFilter:
	          part.andFilterBy( queryArgs, "VcfCustomer", dao.wildcardForAnySequence(  ) );
	          break;

	        case VcfVrbleChrgFeeDMO.vcfSubscriberIdFilter:
	          part.andFilterBy( queryArgs, "VcfSubscriberId", dao.wildcardForAnySequence(  ) );
	          break;

	        case VcfVrbleChrgFeeDMO.vcfVariableTypeFilter:
	          part.andFilterBy( queryArgs, "VcfVariableType", dao.wildcardForAnySequence(  ) );
	          break;

	        case VcfVrbleChrgFeeDMO.vcfProductCodeFilter:
	          part.andFilterBy( queryArgs, "VcfProductCode", dao.wildcardForAnySequence(  ) );
	          break;

	        case VcfVrbleChrgFeeDMO.vcfDescriptionFilter:
	          part.andFilterBy( queryArgs, "VcfDescription", dao.wildcardForAnySequence(  ) );
	          break;

	        case VcfVrbleChrgFeeDMO.vcfMakeFilter:
	          part.andFilterBy( queryArgs, "VcfMake", dao.wildcardForAnySequence(  ) );
	          break;

	        case VcfVrbleChrgFeeDMO.vcfModelFilter:
	          part.andFilterBy( queryArgs, "VcfModel", dao.wildcardForAnySequence(  ) );
	          break;

	        case VcfVrbleChrgFeeDMO.vcfInventryItemidFilter:
	          part.andFilterBy( queryArgs, "VcfInventryItemid", dao.wildcardForAnySequence(  ) );
	          break;

	        case VcfVrbleChrgFeeDMO.vcfStartDateFilter:
	          part.andFilterBy( queryArgs, "VcfStartDate", dao.wildcardForAnySequence(  ) );
	          break;

	        case VcfVrbleChrgFeeDMO.vcfEndDateFilter:
	          part.andFilterBy( queryArgs, "VcfEndDate", dao.wildcardForAnySequence(  ) );
	          break;

	        case VcfVrbleChrgFeeDMO.vcfContrcLengthFilter:
	          part.andFilterBy( queryArgs, "VcfContrcLength", dao.wildcardForAnySequence(  ) );
	          break;

	        case VcfVrbleChrgFeeDMO.vcfFullAmtFilter:
	          part.andFilterBy( queryArgs, "VcfFullAmt", dao.wildcardForAnySequence(  ) );
	          break;

	        case VcfVrbleChrgFeeDMO.vcfMonthAmtFilter:
	          part.andFilterBy( queryArgs, "VcfMonthAmt", dao.wildcardForAnySequence(  ) );
	          break;

	        case VcfVrbleChrgFeeDMO.vcfNextPeriodFilter:
	          part.andFilterBy( queryArgs, "VcfNextPeriod", dao.wildcardForAnySequence(  ) );
	          break;

	        case VcfVrbleChrgFeeDMO.vcfNextYearFilter:
	          part.andFilterBy( queryArgs, "VcfNextYear", dao.wildcardForAnySequence(  ) );
	          break;

	        case VcfVrbleChrgFeeDMO.vcfRemAmtFilter:
	          part.andFilterBy( queryArgs, "VcfRemAmt", dao.wildcardForAnySequence(  ) );
	          break;

	        case VcfVrbleChrgFeeDMO.vcfRemPeriodFilter:
	          part.andFilterBy( queryArgs, "VcfRemPeriod", dao.wildcardForAnySequence(  ) );
	          break;

	        case VcfVrbleChrgFeeDMO.vcfChargeCodeFilter:
	          part.andFilterBy( queryArgs, "VcfChargeCode", dao.wildcardForAnySequence(  ) );
	          break;

	        case VcfVrbleChrgFeeDMO.vcfStatusFilter:
	          part.andFilterBy( queryArgs, "VcfStatus", dao.wildcardForAnySequence(  ) );
	          break;

	        case VcfVrbleChrgFeeDMO.vcfTimestampFilter:
	          part.andFilterBy( queryArgs, "VcfTimestamp", dao.wildcardForAnySequence(  ) );
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


	  public VcfVrbleChrgFeeDMO get( QueryFilter filter )
	    throws EPPIXSeriousException {
	    logger.debug( "get( filter )" );

	    DAOParamQueryArgs args = filterQueryArgs( filter, "VcfVrbleChrgFee");

	    return (VcfVrbleChrgFeeDMO) dao.get( args.getDMLName(  ),
	      args.getFilterBy(  ), args );
	  }


	  public Object max( QueryFilter filter )
	    throws EPPIXSeriousException {
	    logger.debug( "max( filter )" );

	    DAOParamQueryArgs args = filterQueryArgs( filter, "VcfVrbleChrgFee" );

	    return dao.max( args.getDMLName(  ), args.getFilterBy(  ), args,
	      args.getMaxField(  ) );
	  }


	  public Object min( QueryFilter filter )
	    throws EPPIXSeriousException {
	    logger.debug( "min( filter )" );

	    DAOParamQueryArgs args = filterQueryArgs( filter, "VcfVrbleChrgFee" );

	    return dao.min( args.getDMLName(  ), args.getFilterBy(  ), args,
	      args.getMaxField(  ) );
	  }


	  public int count( QueryFilter filter )
	    throws EPPIXSeriousException {
	    logger.debug( "count( filter )" );

	    DAOParamQueryArgs args = filterQueryArgs( filter, "VcfVrbleChrgFee" );

	    return dao.count( args.getDMLName(  ), args.getFilterBy(  ), args );
	  }


}