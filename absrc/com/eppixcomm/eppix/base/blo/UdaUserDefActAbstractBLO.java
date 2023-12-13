package com.eppixcomm.eppix.base.blo;

import org.apache.log4j.Logger;

import com.eppixcomm.eppix.base.error.EPPIXBusinessException;
import com.eppixcomm.eppix.base.error.EPPIXFatalException;
import com.eppixcomm.eppix.base.error.EPPIXUnexpectedException;
import com.eppixcomm.eppix.base.error.Thrower;
import com.eppixcomm.eppix.common.data.DAC;
import com.eppixcomm.eppix.common.data.DAOIterator;
import com.eppixcomm.eppix.common.data.DTOActionTypes;
import com.eppixcomm.eppix.common.util.QueryFilter;

public class UdaUserDefActAbstractBLO extends BaseBLO
implements DTOActionTypes, BaseMessages{

	  static Thrower thrower = Thrower.getThrower( UdaUserDefActAbstractBLO.class );

	  protected static final String ENTITY_ID = "UDA";
	  protected UdaUserDefActDAC udaUserDefActDAC;
	  protected Logger logger = thrower.getLogger(  );

	  protected Class getDACClass(  ) {
	    return EaaEpxactionAllwDAC.class;
	  }

	  protected void setDAC( DAC dac ) {
	    this.udaUserDefActDAC = (UdaUserDefActDAC) dac;
	  }

	  public UdaUserDefActDMO get( UdaUserDefActDMO udaUserDefActDMO )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "get(udaUserDefActDMO)" );

	    thrower.ifParameterMissing( "UdaUserDefActDMO", udaUserDefActDMO );

	    thrower.ifParameterMissing( "UdaUserDefActDMO.udaActionId", udaUserDefActDMO.getUdaActionId());
	    
	    UdaUserDefActDMO returnUdaUserDefActDMO = udaUserDefActDAC.get( udaUserDefActDMO );

	    if ( returnUdaUserDefActDMO == null ) {
	      thrower.business( Base_UDAUSERDEFACT_000,
	        new Object[] { udaUserDefActDMO } );
	    }

	    return returnUdaUserDefActDMO;
	  }

//	  public DTOList getList(
//	    DTOListState   state,
//	    UdaUserDefActDMO UdaUserDefActDMO )
//	    throws EPPIXBusinessException, EPPIXUnexpectedException,
//	      EPPIXFatalException {
//	    logger.debug( "getList( state, UdaUserDefActDMO )" );
//
//	    return udaUserDefActDAC.getList( state, UdaUserDefActDMO );
//	  }

	  public UdaUserDefActDMO create( UdaUserDefActDMO udaUserDefActDMO )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "create( UdaUserDefActDMO )" );

	    thrower.ifParameterMissing( "UdaUserDefActDMO", udaUserDefActDMO );

	    thrower.ifParameterMissing( "UdaUserDefActDMO.udaActionId", udaUserDefActDMO.getUdaActionId());
	    thrower.ifParameterMissing( "UdaUserDefActDMO.udaActionDesc", udaUserDefActDMO.getUdaActionDesc());
	    thrower.ifParameterMissing( "UdaUserDefActDMO.udaActionPath", udaUserDefActDMO.getUdaActionPath());
	    
	    if ( exists( udaUserDefActDMO ) ) {
	      thrower.business( Base_UDAUSERDEFACT_001,
	        new Object[] { udaUserDefActDMO.getUdaActionId()} );
	    }

	    udaUserDefActDAC.create( udaUserDefActDMO );

	    return udaUserDefActDMO;
	  }

	  public UdaUserDefActDMO modify( UdaUserDefActDMO udaUserDefActDMO )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "modify( udaUserDefActDMO )" );

	    thrower.ifParameterMissing( "UdaUserDefActDMO", udaUserDefActDMO );

	    thrower.ifParameterMissing( "UdaUserDefActDMO.udaActionId", udaUserDefActDMO.getUdaActionId());
	    thrower.ifParameterMissing( "UdaUserDefActDMO.udaActionDesc", udaUserDefActDMO.getUdaActionDesc());
	    thrower.ifParameterMissing( "UdaUserDefActDMO.udaActionPath", udaUserDefActDMO.getUdaActionPath());


	    UdaUserDefActDMO updateUdaUserDefActDMO = new UdaUserDefActDMO(  );

	    updateUdaUserDefActDMO.setUdaActionId(udaUserDefActDMO.getUdaActionId());

	    updateUdaUserDefActDMO = get( updateUdaUserDefActDMO );

	    updateUdaUserDefActDMO.setUdaActionId(udaUserDefActDMO.getUdaActionId());

	    updateUdaUserDefActDMO.setUdaActionDesc(udaUserDefActDMO.getUdaActionDesc());

	    updateUdaUserDefActDMO.setUdaActionPath(udaUserDefActDMO.getUdaActionPath() );

	    udaUserDefActDAC.modify( updateUdaUserDefActDMO );

	    // Create a new DMO, set keys, and fetch from the database...
	    UdaUserDefActDMO returnUdaUserDefActDMO = new UdaUserDefActDMO(  );

	    returnUdaUserDefActDMO.setUdaActionId(updateUdaUserDefActDMO.getUdaActionId());
	   
	    returnUdaUserDefActDMO = get( returnUdaUserDefActDMO );

	    return returnUdaUserDefActDMO;
	  }


	  public void modify( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "modify( filter )" );
	    
	    udaUserDefActDAC.modify( filter );
	  }


	  public void delete( UdaUserDefActDMO udaUserDefActDMO )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "delete( UdaUserDefActDMO )" );

	    thrower.ifParameterMissing( "UdaUserDefActDMO", udaUserDefActDMO );
	    
	    thrower.ifParameterMissing( "UdaUserDefActDMO.udaActionId", udaUserDefActDMO.getUdaActionId());

	    UdaUserDefActDMO updateUdaUserDefActDMO = null;

	    updateUdaUserDefActDMO = get( udaUserDefActDMO );

	    // delete self...
	    udaUserDefActDAC.delete( udaUserDefActDMO );
	  }


	  public void delete( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "delete( filter )" );

	    thrower.ifParameterMissing( "filter", filter );

	    // delete...
	    udaUserDefActDAC.delete( filter );
	  }


	  public boolean exists( UdaUserDefActDMO udaUserDefActDMO )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "exists(eaaEpxactionAllw)" );

	    thrower.ifParameterMissing( "UdaUserDefActDMO", udaUserDefActDMO );

	    thrower.ifParameterMissing( "UdaUserDefActDMO.udaActionId", udaUserDefActDMO.getUdaActionId());


	    return udaUserDefActDAC.exists( udaUserDefActDMO );
	  }


	  public boolean exists( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "exists(filter)" );

	    return udaUserDefActDAC.exists( filter );
	  }

//	  public DTOList getList(
//	    DTOListState state,
//	    QueryFilter  filter )
//	    throws EPPIXBusinessException, EPPIXUnexpectedException,
//	      EPPIXFatalException {
//	    logger.debug( "getList( state, filter )" );
//
//	    return udaUserDefActDAC.getList( state, filter );
//	  }

	  public DAOIterator iterate( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "iterate( filter )" );

	    return udaUserDefActDAC.iterate( filter );
	  }


	  public DAOIterator iterateWithLock( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "iterateWithLock( filter )" );

	    return udaUserDefActDAC.iterateWithLock( filter );
	  }


	  public UdaUserDefActDMO get( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "get( filter )" );

	    thrower.ifParameterMissing( "filter", filter );

	    UdaUserDefActDMO udaUserDefActDMO = udaUserDefActDAC.get( filter );

	    return udaUserDefActDMO;
	  }


	  public Object max( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "max( filter )" );

	    thrower.ifParameterMissing( "filter", filter );

	    return udaUserDefActDAC.max( filter );
	  }


	  public Object min( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "min( filter )" );

	    thrower.ifParameterMissing( "filter", filter );

	    return udaUserDefActDAC.min( filter );
	  }


	  public Integer count( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "count( filter )" );

	    thrower.ifParameterMissing( "filter", filter );

	    return new Integer(udaUserDefActDAC.count( filter ));
	  }

}
