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



public class RicaPersonVerificationAbstractDACImpl extends DAC implements RicaPersonVerificationAbstractDAC{
	
	static DAOThrower thrower = DAOThrower.getDAOThrower( RicaPersonVerificationAbstractDACImpl.class );
	Logger logger = thrower.getLogger(  );

	public RicaPersonVerificationAbstractDACImpl(DAO dao) {
		super(dao, thrower);
	}

	public RicaPersonVerificationAbstractDACImpl(DAO dao, DAOThrower thrower) {
		super(dao, thrower);
	}
	
	  public RicaPersonVerificationDMO get( RicaPersonVerificationDMO ricaPersonVerificationDMO )
	    throws EPPIXSeriousException {
	    logger.debug( "get( RicaPersonVerificationDMO )" );

	    thrower.ifParameterMissing( "aRicaPersonVerificationDMO", ricaPersonVerificationDMO );

	    return (RicaPersonVerificationDMO) dao.get( ricaPersonVerificationDMO );
	  }


	  public void create( RicaPersonVerificationDMO ricaPersonVerificationDMO )
	    throws EPPIXSeriousException {
	    logger.debug( "create( ricaPersonVerificationDMO )" );
	    thrower.ifParameterMissing( "RicaPersonVerificationDMO", ricaPersonVerificationDMO );

	    dao.insert( ricaPersonVerificationDMO );

	  }


	  public void modify( RicaPersonVerificationDMO ricaPersonVerificationDMO )
	    throws EPPIXSeriousException, EPPIXObjectExpiredException,
	      EPPIXObjectNotFoundException {
	    logger.debug( "modify(RicaPersonVerificationDMO)");

	    thrower.ifParameterMissing( "aRicaPersonVerificationDMO", ricaPersonVerificationDMO );

	    thrower.ifParameterMissing( "RicaPersonVerificationDMO.pshId",
	      ricaPersonVerificationDMO.getRpvSerial() );

	    dao.update( ricaPersonVerificationDMO );
	  }


	  public void modify( QueryFilter filter )
	    throws EPPIXSeriousException, EPPIXObjectExpiredException,
	      EPPIXObjectNotFoundException {
	    logger.debug( "modify( filter )" );

	    thrower.ifParameterMissing( "filter", filter );

	    dao.updateCustom( new RicaPersonVerificationDMO(  ),
	      filterQueryArgs( filter, null ) );
	  }


	  public void delete( RicaPersonVerificationDMO ricaPersonVerificationDMO )
	    throws EPPIXSeriousException, EPPIXObjectNotFoundException,
	      EPPIXObjectExpiredException {
	    logger.debug( "delete( RicaPersonVerificationDMO )" );

	    thrower.ifParameterMissing( "RicaPersonVerificationDMO", ricaPersonVerificationDMO );

	    thrower.ifParameterMissing( "RicaPersonVerificationDMO.pshId",
	      ricaPersonVerificationDMO.getRpvSerial());

	    dao.delete( ricaPersonVerificationDMO );
	  }


	  public void delete( QueryFilter filter )
	    throws EPPIXSeriousException, EPPIXObjectNotFoundException,
	      EPPIXObjectExpiredException {
	    logger.debug( "delete( filter )" );

	    thrower.ifParameterMissing( "filter", filter );

	    DAOParamQueryArgs args = filterQueryArgs( filter, null );

	    dao.delete( "PshParamServHdr", args.getFilterBy(  ), args );
	  }


	  public boolean exists( RicaPersonVerificationDMO RicaPersonVerificationDMO )
	    throws EPPIXSeriousException {
	    logger.debug( "exists( RicaPersonVerificationDMO)" );

	    return dao.exists( "PshParamServHdr", "filterByPrimaryKey",
	      new DAOArgs( 1 ).arg( RicaPersonVerificationDMO.getRpvSerial()));
	  }


	  public boolean exists( QueryFilter filter )
	    throws EPPIXSeriousException {
	    logger.debug( "exists( filter )" );

	    return dao.exists( filterQueryArgs( filter, null ) );
	  }


	  public DTOList getList(DTOListState state,
	    RicaPersonVerificationDMO ricaPersonVerificationDMO )
	    throws EPPIXSeriousException {
	    logger.debug( "getList( state, ricaPersonVerificationDMO )" );

	    return new DTOList(dao.getList(paramQueryArgs( ricaPersonVerificationDMO)));
	  }


	  protected DAOParamQueryArgs paramQueryArgs(
	    RicaPersonVerificationDMO ricaPersonVerificationDMO ) {
	    logger.debug( "paramQueryArgs( ricaPersonVerificationDMO)" );

	    DAOParamQueryArgs queryArgs = new DAOParamQueryArgs( "RicaPersonVerification",
	        24 * 2 );

	    if ( ricaPersonVerificationDMO != null ) {
	      // primary key filters...
	      Integer rpvSerial = ricaPersonVerificationDMO.getRpvSerial();

	      if ( !DMO.isNull( rpvSerial ) ) {
	        queryArgs.andFilterBy( "RpvSerial" )
	                 .arg( rpvSerial );
	      }

	      // define more filters...
	      String rpvCustomerType = ricaPersonVerificationDMO.getRpvCustomerType();
	      if ( !DMO.isNull( rpvCustomerType ) ) {
		        queryArgs.andFilterBy( "RpvCustomerTypeMatch" )
		                 .arg( rpvCustomerType);
		      }
	      
	      String rpvIdPassportNo = ricaPersonVerificationDMO.getRpvIdPassportNo();
	      if ( !DMO.isNull( rpvIdPassportNo ) ) {
		        queryArgs.andFilterBy( "RpvIdPassportNoMatch" )
		                 .arg( rpvIdPassportNo);
		      }
	      
	      String rpvIdType = ricaPersonVerificationDMO.getRpvIdType();
	      if ( !DMO.isNull( rpvIdType ) ) {
		        queryArgs.andFilterBy( "RpvIdTypeMatch" )
		                 .arg( rpvIdType);
		      }
	      
	      String rpvCountryCode = ricaPersonVerificationDMO.getRpvCountryCode();
	      if ( !DMO.isNull( rpvCountryCode ) ) {
		        queryArgs.andFilterBy( "RpvCountryCodeMatch" )
		                 .arg( rpvCountryCode);
		      }
	      
	      String rpvAccNo = ricaPersonVerificationDMO.getRpvAccNo();
	      if ( !DMO.isNull( rpvAccNo ) ) {
		        queryArgs.andFilterBy( "RpvAccNoMatch" )
		                 .arg( rpvAccNo);
		      }
	      
	      String rpvRicaStatus = ricaPersonVerificationDMO.getRpvRicaStatus();
	      if ( !DMO.isNull( rpvRicaStatus ) ) {
		        queryArgs.andFilterBy( "RpvRicaStatusMatch" )
		                 .arg( rpvRicaStatus);
		      }
	      
	      String rpvFirstnames = ricaPersonVerificationDMO.getRpvFirstnames();
	      if ( !DMO.isNull( rpvFirstnames ) ) {
		        queryArgs.andFilterBy( "RpvFirstnamesMatch" )
		                 .arg( rpvFirstnames);
		      }
	      
	      String rpvSurname = ricaPersonVerificationDMO.getRpvSurname();
	      if ( !DMO.isNull( rpvSurname ) ) {
		        queryArgs.andFilterBy( "RpvSurnameMatch" )
		                 .arg( rpvSurname);
		      }
	      
	      String rpvRegistration = ricaPersonVerificationDMO.getRpvRegistration();
	      if ( !DMO.isNull( rpvRegistration ) ) {
		        queryArgs.andFilterBy( "RpvRegistrationMatch" )
		                 .arg( rpvRegistration);
		      }
	      
	      String rpvAddressLine1 = ricaPersonVerificationDMO.getRpvAddressLine1();
	      if ( !DMO.isNull( rpvAddressLine1 ) ) {
		        queryArgs.andFilterBy( "RpvAddressLine1Match" )
		                 .arg( rpvAddressLine1);
		      }
	      
	      String rpvAddressLine2 = ricaPersonVerificationDMO.getRpvAddressLine2();
	      if ( !DMO.isNull( rpvAddressLine2 ) ) {
		        queryArgs.andFilterBy( "RpvAddressLine2Match" )
		                 .arg( rpvAddressLine2);
		      }
	      
	      String rpvAddressLine3 = ricaPersonVerificationDMO.getRpvAddressLine3();
	      if ( !DMO.isNull( rpvAddressLine3 ) ) {
		        queryArgs.andFilterBy( "RpvAddressLine3Match" )
		                 .arg( rpvAddressLine3);
		      }
	      
	      String rpvPostalCode = ricaPersonVerificationDMO.getRpvPostalCode();
	      if ( !DMO.isNull( rpvPostalCode ) ) {
		        queryArgs.andFilterBy( "RpvPostalCodeMatch" )
		                 .arg( rpvPostalCode);
		      }
	      
	      String rpvSuburb = ricaPersonVerificationDMO.getRpvSuburb();
	      if ( !DMO.isNull( rpvSuburb ) ) {
		        queryArgs.andFilterBy( "RpvSuburbMatch" )
		                 .arg( rpvSuburb);
		      }
	      
	      String rpvCityTown = ricaPersonVerificationDMO.getRpvCityTown();
	      if ( !DMO.isNull( rpvCityTown ) ) {
		        queryArgs.andFilterBy( "RpvCityTownMatch" )
		                 .arg( rpvCityTown);
		      }
	      
	      String rpvBusinessName = ricaPersonVerificationDMO.getRpvBusinessName();
	      if ( !DMO.isNull( rpvBusinessName ) ) {
		        queryArgs.andFilterBy( "RpvBusinessNameMatch" )
		                 .arg( rpvBusinessName);
		      }
	      
	      String rpvBaddressLine1 = ricaPersonVerificationDMO.getRpvBaddressLine1();
	      if ( !DMO.isNull( rpvBaddressLine1 ) ) {
		        queryArgs.andFilterBy( "RpvBaddressLine1Match" )
		                 .arg( rpvBaddressLine1);
		      }
	      
	      String rpvBaddressLine2 = ricaPersonVerificationDMO.getRpvBaddressLine2();
	      if ( !DMO.isNull( rpvBaddressLine2 ) ) {
		        queryArgs.andFilterBy( "RpvBaddressLine2Match" )
		                 .arg( rpvBaddressLine2);
		      }
	      
	      String rpvBaddressLine3 = ricaPersonVerificationDMO.getRpvBaddressLine3();
	      if ( !DMO.isNull( rpvBaddressLine3 ) ) {
		        queryArgs.andFilterBy( "RpvBaddressLine3Match" )
		                 .arg( rpvBaddressLine3);
		      }
	      
	      String rpvBpostalCode = ricaPersonVerificationDMO.getRpvBpostalCode();
	      if ( !DMO.isNull( rpvBpostalCode ) ) {
		        queryArgs.andFilterBy( "RpvBpostalCodeMatch" )
		                 .arg( rpvBpostalCode);
		      }
	      
	      String rpvBsuburb = ricaPersonVerificationDMO.getRpvBsuburb();
	      if ( !DMO.isNull( rpvBsuburb ) ) {
		        queryArgs.andFilterBy( "RpvBsuburbMatch" )
		                 .arg( rpvBsuburb);
		      }
	      
	      String rpvBcityTown = ricaPersonVerificationDMO.getRpvBcityTown();
	      if ( !DMO.isNull( rpvBcityTown ) ) {
		        queryArgs.andFilterBy( "RpvBcityTownMatch" )
		                 .arg( rpvBcityTown);
		      }
	      String rpvMsisdnNo = ricaPersonVerificationDMO.getRpvMsisdnNo();
	      if ( !DMO.isNull( rpvMsisdnNo ) ) {
		        queryArgs.andFilterBy( "RpvMsisdnNoMatch" )
		                 .arg( rpvMsisdnNo);
		      }
	      
	      DateTime rpvDatetimeActioned = ricaPersonVerificationDMO.getRpvDatetimeActioned();
	      if ( !DMO.isNull( rpvDatetimeActioned ) ) {
		        queryArgs.andFilterBy( "RpvDatetimeActionedMatch" )
		                 .arg( rpvDatetimeActioned);
		      }
	      
	      String rpvTrickleDesc = ricaPersonVerificationDMO.getRpvTrickleDesc();

	      if ( !DMO.isNull( rpvTrickleDesc ) ) {
		        queryArgs.andFilterBy( "RpvTrickleDescMatch" )
		                 .arg( rpvDatetimeActioned);
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
	        ? "RicaPersonVerification" : dmlName, parts.size(  ) );

	    Iterator it = parts.iterator();
	    	while(it.hasNext()){
	    		FilterPart part = (FilterPart)it.next();

	      switch ( part.getIndex(  ) ) {
	        case RicaPersonVerificationDMO.rpvSerialFilter:
	          part.andFilterBy( queryArgs, "rpvSerial", dao.wildcardForAnySequence(  ) );
	          break;

        	case RicaPersonVerificationDMO.rpvCustomerTypeFilter:
        		part.andFilterBy( queryArgs, "rpvCustomerType", dao.wildcardForAnySequence(  ) );
        	break;

        	case RicaPersonVerificationDMO.rpvIdPassportNoFilter:
        		part.andFilterBy( queryArgs, "rpvIdPassportNo", dao.wildcardForAnySequence(  ) );
        	break;

        	case RicaPersonVerificationDMO.rpvIdTypeFilter:
        		part.andFilterBy( queryArgs, "rpvIdType", dao.wildcardForAnySequence(  ) );
        	break;

        	case RicaPersonVerificationDMO.rpvCountryCodeFilter:
        		part.andFilterBy( queryArgs, "rpvCountryCode", dao.wildcardForAnySequence(  ) );
        	break;

        	case RicaPersonVerificationDMO.rpvAccNoFilter:
        		part.andFilterBy( queryArgs, "rpvAccNo", dao.wildcardForAnySequence(  ) );
        	break;

        	case RicaPersonVerificationDMO.rpvRicaStatusFilter:
        		part.andFilterBy( queryArgs, "rpvRicaStatus", dao.wildcardForAnySequence(  ) );
        	break;

        	case RicaPersonVerificationDMO.rpvFirstnamesFilter:
        		part.andFilterBy( queryArgs, "rpvFirstnames", dao.wildcardForAnySequence(  ) );
        	break;

        	case RicaPersonVerificationDMO.rpvSurnameFilter:
        		part.andFilterBy( queryArgs, "rpvSurname", dao.wildcardForAnySequence(  ) );
        	break;

        	case RicaPersonVerificationDMO.rpvRegistrationFilter:
        		part.andFilterBy( queryArgs, "rpvRegistration", dao.wildcardForAnySequence(  ) );
        	break;

        	case RicaPersonVerificationDMO.rpvAddressLine1Filter:
        		part.andFilterBy( queryArgs, "rpvAddressLine1", dao.wildcardForAnySequence(  ) );
        	break;

        	case RicaPersonVerificationDMO.rpvAddressLine2Filter:
        		part.andFilterBy( queryArgs, "rpvAddressLine2", dao.wildcardForAnySequence(  ) );
        	break;

        	case RicaPersonVerificationDMO.rpvAddressLine3Filter:
        		part.andFilterBy( queryArgs, "rpvAddressLine3", dao.wildcardForAnySequence(  ) );
        	break;

        	case RicaPersonVerificationDMO.rpvPostalCodeFilter:
        		part.andFilterBy( queryArgs, "rpvPostalCode", dao.wildcardForAnySequence(  ) );
        	break;

        	case RicaPersonVerificationDMO.rpvSuburbFilter:
        		part.andFilterBy( queryArgs, "rpvSuburb", dao.wildcardForAnySequence(  ) );
        	break;

        	case RicaPersonVerificationDMO.rpvCityTownFilter:
        		part.andFilterBy( queryArgs, "rpvCityTown", dao.wildcardForAnySequence(  ) );
        	break;

        	case RicaPersonVerificationDMO.rpvBusinessNameFilter:
        		part.andFilterBy( queryArgs, "rpvBusinessName", dao.wildcardForAnySequence(  ) );
        	break;

        	case RicaPersonVerificationDMO.rpvBaddressLine1Filter:
        		part.andFilterBy( queryArgs, "rpvBaddressLine1", dao.wildcardForAnySequence(  ) );
        	break;

        	case RicaPersonVerificationDMO.rpvBaddressLine2Filter:
        		part.andFilterBy( queryArgs, "rpvBaddressLine2", dao.wildcardForAnySequence(  ) );
        	break;

        	case RicaPersonVerificationDMO.rpvBaddressLine3Filter:
        		part.andFilterBy( queryArgs, "rpvBaddressLine3", dao.wildcardForAnySequence(  ) );
        	break;

        	case RicaPersonVerificationDMO.rpvBpostalCodeFilter:
        		part.andFilterBy( queryArgs, "rpvBpostalCode", dao.wildcardForAnySequence(  ) );
        	break;

        	case RicaPersonVerificationDMO.rpvBsuburbFilter:
        		part.andFilterBy( queryArgs, "rpvBsuburb", dao.wildcardForAnySequence(  ) );
        	break;

        	case RicaPersonVerificationDMO.rpvBcityTownFilter:
        		part.andFilterBy( queryArgs, "rpvBcityTown", dao.wildcardForAnySequence(  ) );
        	break;

        	case RicaPersonVerificationDMO.rpvMsisdnNoFilter:
        		part.andFilterBy( queryArgs, "rpvMsisdnNo", dao.wildcardForAnySequence(  ) );
        	break;

        	case RicaPersonVerificationDMO.rpvDatetimeActionedFilter:
        		part.andFilterBy( queryArgs, "rpvDatetimeActioned", dao.wildcardForAnySequence(  ) );
        	break;	   
        	
        	case RicaPersonVerificationDMO.rpvTrickleDescFilter:
        		part.andFilterBy( queryArgs, "rpvTrickleDesc", dao.wildcardForAnySequence(  ) );
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
	  
	  public DAOIterator iterateTrickleDescrpvStatusInnerSelect( QueryFilter filter )
	    throws EPPIXSeriousException {
	    logger.debug( "iterate( filter )" );

	    DAOParamQueryArgs args = filterQueryArgs( filter, null );
	    return dao.iterator("rpvTrickleDescrpvStatusInnerSelect", args);

	  }	  

	  public DAOIterator iterateWithLock( QueryFilter filter )
	    throws EPPIXSeriousException {
	    logger.debug( "iterateWithLock( filter )" );

	    return dao.iterator(filterQueryArgs( filter, null ), true );

	  }


	  public RicaPersonVerificationDMO get( QueryFilter filter )
	    throws EPPIXSeriousException {
	    logger.debug( "get( filter )" );

	    DAOParamQueryArgs args = filterQueryArgs( filter, null );

	    return (RicaPersonVerificationDMO) dao.get( args.getDMLName(  ),
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