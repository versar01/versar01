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
import com.eppixcomm.eppix.common.util.DateTime;
import com.eppixcomm.eppix.common.util.FilterPart;
import com.eppixcomm.eppix.common.util.QueryFilter;

public class MahMassActionHdAbstractDACImpl extends DAC implements MahMassActionHdAbstractDAC{
	
	static DAOThrower thrower = DAOThrower.getDAOThrower( MahMassActionHdAbstractDACImpl.class );
	Logger logger = thrower.getLogger(  );

	public MahMassActionHdAbstractDACImpl(DAO dao) {
		super(dao, thrower);
	}
	public MahMassActionHdAbstractDACImpl(DAO dao, DAOThrower thrower) {
		super(dao, thrower);
		// TODO Auto-generated constructor stub
	}
	
	public MahMassActionHdDMO get( MahMassActionHdDMO mahMassActionHdDMO )
    throws EPPIXSeriousException {
    logger.debug( "get( MahMassActionHdDMO )" );

    thrower.ifParameterMissing( "MahMassActionHdDMO", mahMassActionHdDMO );

    return (MahMassActionHdDMO) dao.get( mahMassActionHdDMO );
  }


  public void create( MahMassActionHdDMO mahMassActionHdDMO )
    throws EPPIXSeriousException {
    logger.debug( "create( mahMassActionHdDMO )" );
    thrower.ifParameterMissing( "MahMassActionHdDMO", mahMassActionHdDMO );

    dao.insert( mahMassActionHdDMO );

  }


  public void modify( MahMassActionHdDMO mahMassActionHdDMO )
    throws EPPIXSeriousException, EPPIXObjectExpiredException,
      EPPIXObjectNotFoundException {
    logger.debug( "modify(MahMassActionHdDMO)");

    thrower.ifParameterMissing( "MahMassActionHdDMO", mahMassActionHdDMO );

    thrower.ifParameterMissing( "MahMassActionHdDMO.mahFileId",
      mahMassActionHdDMO.getMahFileId());
    thrower.ifParameterMissing( "MahMassActionHdDMO.mahActType",
    	      mahMassActionHdDMO.getMahActType());

    dao.update( mahMassActionHdDMO );
  }


  public void modify( QueryFilter filter )
    throws EPPIXSeriousException, EPPIXObjectExpiredException,
      EPPIXObjectNotFoundException {
    logger.debug( "modify( filter )" );

    thrower.ifParameterMissing( "filter", filter );

    dao.updateCustom( new MahMassActionHdDMO(  ),
      filterQueryArgs( filter, null ) );
  }


  public void delete( MahMassActionHdDMO mahMassActionHdDMO )
    throws EPPIXSeriousException, EPPIXObjectNotFoundException,
      EPPIXObjectExpiredException {
    logger.debug( "delete( MahMassActionHdDMO )" );

    thrower.ifParameterMissing( "MahMassActionHdDMO", mahMassActionHdDMO );

    thrower.ifParameterMissing( "MahMassActionHdDMO.mahFileId",
      mahMassActionHdDMO.getMahFileId());
    thrower.ifParameterMissing( "MahMassActionHdDMO.mahActType",
    	      mahMassActionHdDMO.getMahActType());

    dao.delete( mahMassActionHdDMO );
  }


  public void delete( QueryFilter filter )
    throws EPPIXSeriousException, EPPIXObjectNotFoundException,
      EPPIXObjectExpiredException {
    logger.debug( "delete( filter )" );

    thrower.ifParameterMissing( "filter", filter );

    DAOParamQueryArgs args = filterQueryArgs( filter, null );

    dao.delete( "MahMassActionHd", args.getFilterBy(  ), args );
  }


  public boolean exists( MahMassActionHdDMO MahMassActionHdDMO )
    throws EPPIXSeriousException {
    logger.debug( "exists( MahMassActionHdDMO)" );

    return dao.exists( "MahMassActionHd", "filterByPrimaryKey",
      new DAOArgs( 2 ).arg(MahMassActionHdDMO.getMahFileId()).arg(MahMassActionHdDMO.getMahActType()));
  }


  public boolean exists( QueryFilter filter )
    throws EPPIXSeriousException {
    logger.debug( "exists( filter )" );

    return dao.exists( filterQueryArgs( filter, null ) );
  }


  public DTOList getList(DTOListState state,
    MahMassActionHdDMO mahMassActionHdDMO )
    throws EPPIXSeriousException {
    logger.debug( "getList( state, mahMassActionHdDMO )" );

    return new DTOList(dao.getList(paramQueryArgs( mahMassActionHdDMO)));
  }


  protected DAOParamQueryArgs paramQueryArgs(
    MahMassActionHdDMO mahMassActionHdDMO ) {
    logger.debug( "paramQueryArgs( mahMassActionHdDMO)" );

    DAOParamQueryArgs queryArgs = new DAOParamQueryArgs( "MahMassActionHd",
        22 * 2 );

    if ( mahMassActionHdDMO != null ) {
      // primary key filters...
    	String mahFileId = mahMassActionHdDMO.getMahFileId();
        if ( !DMO.isNull( mahFileId ) ) {
  	        queryArgs.andFilterBy( "MahFileId" )
  	                 .arg( mahFileId);
  	      }
        
        String mahActType = mahMassActionHdDMO.getMahActType();
        if ( !DMO.isNull( mahActType ) ) {
  	        queryArgs.andFilterBy( "MahActType" )
  	                 .arg( mahActType);
  	      }
        
      // define more filters...
        String mahCsvFileId = mahMassActionHdDMO.getMahCsvFileId();
        if ( !DMO.isNull( mahCsvFileId ) ) {
  	        queryArgs.andFilterBy( "MahCsvFileId" )
  	                 .arg( mahCsvFileId);
  	      }
        
        String mahServiceCode = mahMassActionHdDMO.getMahServiceCode();
        if ( !DMO.isNull( mahServiceCode ) ) {
  	        queryArgs.andFilterBy( "MahServiceCode" )
  	                 .arg( mahServiceCode);
  	      }
        
        Integer mahParamId = mahMassActionHdDMO.getMahParamId();
        if ( !DMO.isNull( mahParamId ) ) {
  	        queryArgs.andFilterBy( "MahParamId" )
  	                 .arg( mahParamId);
  	      }
        
        String mahParamValue = mahMassActionHdDMO.getMahParamValue();
        if ( !DMO.isNull( mahParamValue ) ) {
  	        queryArgs.andFilterBy( "MahParamValue" )
  	                 .arg( mahParamValue);
  	      }
        
        String mahPackageCode = mahMassActionHdDMO.getMahPackageCode();
        if ( !DMO.isNull( mahPackageCode ) ) {
  	        queryArgs.andFilterBy( "MahPackageCode" )
  	                 .arg( mahPackageCode);
  	      }
        
        String mahTariffCode = mahMassActionHdDMO.getMahTariffCode();
        if ( !DMO.isNull( mahTariffCode ) ) {
  	        queryArgs.andFilterBy( "MahTariffCode" )
  	                 .arg( mahTariffCode);
  	      }
        
        String mahReasonCd = mahMassActionHdDMO.getMahReasonCd();
        if ( !DMO.isNull( mahReasonCd ) ) {
  	        queryArgs.andFilterBy( "MahReasonCd" )
  	                 .arg( mahReasonCd);
  	      }
        
        String mahDeactType = mahMassActionHdDMO.getMahDeactType();
        if ( !DMO.isNull( mahDeactType ) ) {
  	        queryArgs.andFilterBy( "MahDeactType" )
  	                 .arg( mahDeactType);
  	      }
        
        DateTime mahSubmitDate = mahMassActionHdDMO.getMahSubmitDate();
        if ( !DMO.isNull( mahSubmitDate ) ) {
  	        queryArgs.andFilterBy( "MahSubmitDate" )
  	                 .arg( mahSubmitDate);
  	      }
        
        Integer mahRecsReq = mahMassActionHdDMO.getMahRecsReq();
        if ( !DMO.isNull( mahRecsReq ) ) {
  	        queryArgs.andFilterBy( "MahRecsReq" )
  	                 .arg( mahRecsReq);
  	      }
        
        DateTime mahProcessDate = mahMassActionHdDMO.getMahProcessDate();
        if ( !DMO.isNull( mahProcessDate ) ) {
  	        queryArgs.andFilterBy( "MahProcessDate" )
  	                 .arg( mahProcessDate);
  	      }
        
        String mahFileStatus = mahMassActionHdDMO.getMahFileStatus();
        if ( !DMO.isNull( mahFileStatus ) ) {
  	        queryArgs.andFilterBy( "MahFileStatus" )
  	                 .arg( mahFileStatus);
  	      }
        
        Integer mahRecsProc = mahMassActionHdDMO.getMahRecsProc();
        if ( !DMO.isNull( mahRecsProc ) ) {
  	        queryArgs.andFilterBy( "MahRecsProc" )
  	                 .arg( mahRecsProc);
  	      }
        
        String mahComments = mahMassActionHdDMO.getMahComments();
        if ( !DMO.isNull( mahComments ) ) {
  	        queryArgs.andFilterBy( "MahComments" )
  	                 .arg( mahComments);
  	      }
        
        String mahAnalysis1 = mahMassActionHdDMO.getMahAnalysis1();
        if ( !DMO.isNull( mahAnalysis1 ) ) {
  	        queryArgs.andFilterBy( "MahAnalysis1" )
  	                 .arg( mahAnalysis1);
  	      }
        
        String mahAnalysis2 = mahMassActionHdDMO.getMahAnalysis2();
        if ( !DMO.isNull( mahAnalysis2 ) ) {
  	        queryArgs.andFilterBy( "MahAnalysis2" )
  	                 .arg( mahAnalysis2);
  	      }
        
        String mahAnalysis3 = mahMassActionHdDMO.getMahAnalysis3();
        if ( !DMO.isNull( mahAnalysis3 ) ) {
  	        queryArgs.andFilterBy( "MahAnalysis3" )
  	                 .arg( mahAnalysis3);
  	      }
        
        String mahAnalysis4 = mahMassActionHdDMO.getMahAnalysis4();
        if ( !DMO.isNull( mahAnalysis4 ) ) {
  	        queryArgs.andFilterBy( "MahAnalysis4" )
  	                 .arg( mahAnalysis4);
  	      }
        
        String mahAnalysis5 = mahMassActionHdDMO.getMahAnalysis5();
        if ( !DMO.isNull( mahAnalysis5 ) ) {
  	        queryArgs.andFilterBy( "MahAnalysis5" )
  	                 .arg( mahAnalysis5);
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


  protected DAOParamQueryArgs filterQueryArgs(
    QueryFilter filter,
    String      dmlName ) {
    List parts = filter.getParts(  );
    DAOParamQueryArgs queryArgs = new DAOParamQueryArgs( ( dmlName == null )
        ? "MahMassActionHd" : dmlName, parts.size(  ) );

    Iterator it = parts.iterator();
    	while(it.hasNext()){
    		FilterPart part = (FilterPart)it.next();

      switch ( part.getIndex(  ) ) {
        case MahMassActionHdDMO.mahFileIdFilter:
          part.andFilterBy( queryArgs, "mahFileId", dao.wildcardForAnySequence(  ) );
          break;

    	case MahMassActionHdDMO.mahCsvFileIdFilter:
    		part.andFilterBy( queryArgs, "mahCsvFileId", dao.wildcardForAnySequence(  ) );
    	break;

    	case MahMassActionHdDMO.mahActTypeFilter:
    		part.andFilterBy( queryArgs, "mahActType", dao.wildcardForAnySequence(  ) );
    	break;

    	case MahMassActionHdDMO.mahServiceCodeFilter:
    		part.andFilterBy( queryArgs, "mahServiceCode", dao.wildcardForAnySequence(  ) );
    	break;

    	case MahMassActionHdDMO.mahParamIdFilter:
    		part.andFilterBy( queryArgs, "mahParamId", dao.wildcardForAnySequence(  ) );
    	break;

    	case MahMassActionHdDMO.mahParamValueFilter:
    		part.andFilterBy( queryArgs, "mahParamValue", dao.wildcardForAnySequence(  ) );
    	break;

    	case MahMassActionHdDMO.mahPackageCodeFilter:
    		part.andFilterBy( queryArgs, "mahPackageCode", dao.wildcardForAnySequence(  ) );
    	break;

    	case MahMassActionHdDMO.mahTariffCodeFilter:
    		part.andFilterBy( queryArgs, "mahTariffCode", dao.wildcardForAnySequence(  ) );
    	break;

    	case MahMassActionHdDMO.mahReasonCdFilter:
    		part.andFilterBy( queryArgs, "mahReasonCd", dao.wildcardForAnySequence(  ) );
    	break;

    	case MahMassActionHdDMO.mahDeactTypeFilter:
    		part.andFilterBy( queryArgs, "mahDeactType", dao.wildcardForAnySequence(  ) );
    	break;

    	case MahMassActionHdDMO.mahUserIdFilter:
    		part.andFilterBy( queryArgs, "mahUserId", dao.wildcardForAnySequence(  ) );
    	break;

    	case MahMassActionHdDMO.mahSubmitDateFilter:
    		part.andFilterBy( queryArgs, "mahSubmitDate", dao.wildcardForAnySequence(  ) );
    	break;
    	
    	case MahMassActionHdDMO.mahRecsReqFilter:
    		part.andFilterBy( queryArgs, "mahRecsReq", dao.wildcardForAnySequence(  ) );
    	break;

    	case MahMassActionHdDMO.mahProcessDateFilter:
    		part.andFilterBy( queryArgs, "mahProcessDate", dao.wildcardForAnySequence(  ) );
    	break;
    	
    	case MahMassActionHdDMO.mahFileStatusFilter:
    		part.andFilterBy( queryArgs, "mahFileStatus", dao.wildcardForAnySequence(  ) );
    	break;
    	
    	case MahMassActionHdDMO.mahRecsProcFilter:
    		part.andFilterBy( queryArgs, "mahRecsProc", dao.wildcardForAnySequence(  ) );
    	break;
    	
    	case MahMassActionHdDMO.mahCommentsFilter:
    		part.andFilterBy( queryArgs, "mahComments", dao.wildcardForAnySequence(  ) );
    	break;
    	
    	case MahMassActionHdDMO.mahAnalysis1Filter:
    		part.andFilterBy( queryArgs, "mahAnalysis1", dao.wildcardForAnySequence(  ) );
    	break;
    	
    	case MahMassActionHdDMO.mahAnalysis2Filter:
    		part.andFilterBy( queryArgs, "mahAnalysis2", dao.wildcardForAnySequence(  ) );
    	break;
    	
    	case MahMassActionHdDMO.mahAnalysis3Filter:
    		part.andFilterBy( queryArgs, "mahAnalysis3", dao.wildcardForAnySequence(  ) );
    	break;
    	
    	case MahMassActionHdDMO.mahAnalysis4Filter:
    		part.andFilterBy( queryArgs, "mahAnalysis4", dao.wildcardForAnySequence(  ) );
    	break;
    	
    	case MahMassActionHdDMO.mahAnalysis5Filter:
    		part.andFilterBy( queryArgs, "mahAnalysis5", dao.wildcardForAnySequence(  ) );
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
  
  public DAOIterator iterateTrickleDescrarStatusInnerSelect( QueryFilter filter )
    throws EPPIXSeriousException {
    logger.debug( "iterate( filter )" );

    DAOParamQueryArgs args = filterQueryArgs( filter, null );
    return dao.iterator("rarTrickleDescrarStatusInnerSelect", args);

  }	  

  public DAOIterator iterateWithLock( QueryFilter filter )
    throws EPPIXSeriousException {
    logger.debug( "iterateWithLock( filter )" );

    return dao.iterator(filterQueryArgs( filter, null ), true );

  }


  public MahMassActionHdDMO get( QueryFilter filter )
    throws EPPIXSeriousException {
    logger.debug( "get( filter )" );

    DAOParamQueryArgs args = filterQueryArgs( filter, null );

    return (MahMassActionHdDMO) dao.get( args.getDMLName(  ),
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
