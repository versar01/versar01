package com.eppixcomm.eppix.base.blo;

import org.apache.log4j.Logger;

import com.eppixcomm.eppix.base.error.EPPIXBusinessException;
import com.eppixcomm.eppix.base.error.EPPIXFatalException;
import com.eppixcomm.eppix.base.error.EPPIXUnexpectedException;
import com.eppixcomm.eppix.base.error.Thrower;
import com.eppixcomm.eppix.common.data.DAC;
import com.eppixcomm.eppix.common.data.DAOIterator;
import com.eppixcomm.eppix.common.data.DTOActionTypes;
import com.eppixcomm.eppix.common.data.DTOList;
import com.eppixcomm.eppix.common.data.DTOListState;
import com.eppixcomm.eppix.common.util.QueryFilter;

public class EaaEpxactionAllwAbstractBLO extends BaseBLO
implements DTOActionTypes, BaseMessages{
	
	  static Thrower thrower = Thrower.getThrower( EaaEpxactionAllw.class );

	  protected static final String ENTITY_ID = "EAA";
	  protected EaaEpxactionAllwDAC eaaEpxactionAllwDAC;
	  protected Logger logger = thrower.getLogger(  );

	  protected Class getDACClass(  ) {
	    return EaaEpxactionAllwDAC.class;
	  }

	  protected void setDAC( DAC dac ) {
	    this.eaaEpxactionAllwDAC = (EaaEpxactionAllwDAC) dac;
	  }

	  public EaaEpxactionAllwDMO get( EaaEpxactionAllwDMO eaaEpxactionAllwDMO )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "get(EaaEpxactionAllwDMO)" );

	    thrower.ifParameterMissing( "EaaEpxactionAllwDMO", eaaEpxactionAllwDMO );

	    thrower.ifParameterMissing( "EaaEpxactionAllwDMO.eaaSubsystem", eaaEpxactionAllwDMO.getEaaSubsystem());
	    thrower.ifParameterMissing( "EaaEpxactionAllwDMO.eaaActionType", eaaEpxactionAllwDMO.getEaaActionType());

	    EaaEpxactionAllwDMO returnEaaEpxactionAllwDMO = eaaEpxactionAllwDAC.get( eaaEpxactionAllwDMO );

	    if ( returnEaaEpxactionAllwDMO == null ) {
	      thrower.business( Base_EAAEPXACTIONALLW_000,
	        new Object[] { eaaEpxactionAllwDMO } );
	    }

	    return returnEaaEpxactionAllwDMO;
	  }

//	  public DTOList getList(
//	    DTOListState   state,
//	    EaaEpxactionAllwDMO EaaEpxactionAllwDMO )
//	    throws EPPIXBusinessException, EPPIXUnexpectedException,
//	      EPPIXFatalException {
//	    logger.debug( "getList( state, EaaEpxactionAllwDMO )" );
//
//	    return eaaEpxactionAllwDAC.getList( state, EaaEpxactionAllwDMO );
//	  }

	  public EaaEpxactionAllwDMO create( EaaEpxactionAllwDMO eaaEpxactionAllwDMO )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "create( EaaEpxactionAllwDMO )" );

	    thrower.ifParameterMissing( "EaaEpxactionAllwDMO", eaaEpxactionAllwDMO );

	    thrower.ifParameterMissing( "EaaEpxactionAllwDMO.eaaActionType",
	    		eaaEpxactionAllwDMO.getEaaActionType());

	    thrower.ifParameterMissing( "EaaEpxactionAllwDMO.eaaActProctype",
	    		eaaEpxactionAllwDMO.getEaaActProctype());

	    thrower.ifParameterMissing( "EaaEpxactionAllwDMO.eaaPendDirect",
	    		eaaEpxactionAllwDMO.getEaaPendDirect());

	    thrower.ifParameterMissing( "EaaEpxactionAllwDMO.eaaSubsystem",
	    		eaaEpxactionAllwDMO.getEaaSubsystem());

	    if ( exists( eaaEpxactionAllwDMO ) ) {
	      thrower.business( Base_EAAEPXACTIONALLW_001,
	        new Object[] { eaaEpxactionAllwDMO.getEaaSubsystem(), eaaEpxactionAllwDMO.getEaaActionType() } );
	    }

	    eaaEpxactionAllwDAC.create( eaaEpxactionAllwDMO );

	    return eaaEpxactionAllwDMO;
	  }

	  public EaaEpxactionAllwDMO modify( EaaEpxactionAllwDMO eaaEpxactionAllwDMO )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "modify( eaaEpxactionAllwDMO )" );

	    thrower.ifParameterMissing( "EaaEpxactionAllwDMO", eaaEpxactionAllwDMO );

	    thrower.ifParameterMissing( "EaaEpxactionAllwDMO.eaaActionType",
	    		eaaEpxactionAllwDMO.getEaaActionType());

	    thrower.ifParameterMissing( "EaaEpxactionAllwDMO.eaaActProctype",
	    		eaaEpxactionAllwDMO.getEaaActProctype());

	    thrower.ifParameterMissing( "EaaEpxactionAllwDMO.eaaPendDirect",
	    		eaaEpxactionAllwDMO.getEaaPendDirect());

	    thrower.ifParameterMissing( "EaaEpxactionAllwDMO.eaaSubsystem",
	    		eaaEpxactionAllwDMO.getEaaSubsystem());

	    EaaEpxactionAllwDMO updateEaaEpxactionAllwDMO = new EaaEpxactionAllwDMO(  );

	    updateEaaEpxactionAllwDMO.setEaaSubsystem(eaaEpxactionAllwDMO.getEaaSubsystem());
	    updateEaaEpxactionAllwDMO.setEaaActionType(eaaEpxactionAllwDMO.getEaaActionType());

	    updateEaaEpxactionAllwDMO = get( updateEaaEpxactionAllwDMO );

	   updateEaaEpxactionAllwDMO.setEaaActionType( eaaEpxactionAllwDMO.getEaaActionType());

	    updateEaaEpxactionAllwDMO.setEaaActProctype( eaaEpxactionAllwDMO.getEaaActProctype());

	    updateEaaEpxactionAllwDMO.setEaaPendDirect( eaaEpxactionAllwDMO.getEaaPendDirect() );

	    updateEaaEpxactionAllwDMO.setEaaSubsystem( eaaEpxactionAllwDMO.getEaaSubsystem() );

	    eaaEpxactionAllwDAC.modify( updateEaaEpxactionAllwDMO );

	    // Create a new DMO, set keys, and fetch from the database...
	    EaaEpxactionAllwDMO returnEaaEpxactionAllwDMO = new EaaEpxactionAllwDMO(  );

	    returnEaaEpxactionAllwDMO.setEaaSubsystem(updateEaaEpxactionAllwDMO.getEaaSubsystem());
	    returnEaaEpxactionAllwDMO.setEaaActionType(updateEaaEpxactionAllwDMO.getEaaActionType());
	   
	    returnEaaEpxactionAllwDMO = get( returnEaaEpxactionAllwDMO );

	    return returnEaaEpxactionAllwDMO;
	  }


	  public void modify( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "modify( filter )" );
	    
	    eaaEpxactionAllwDAC.modify( filter );
	  }


	  public void delete( EaaEpxactionAllwDMO eaaEpxactionAllwDMO )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "delete( EaaEpxactionAllwDMO )" );

	    thrower.ifParameterMissing( "EaaEpxactionAllwDMO", eaaEpxactionAllwDMO );
	    
	    thrower.ifParameterMissing( "EaaEpxactionAllwDMO.eaaSubsystem", eaaEpxactionAllwDMO.getEaaSubsystem());
	    thrower.ifParameterMissing( "EaaEpxactionAllwDMO.eaaActionType", eaaEpxactionAllwDMO.getEaaActionType());

	    EaaEpxactionAllwDMO updateEaaEpxactionAllwDMO = null;

	    updateEaaEpxactionAllwDMO = get( eaaEpxactionAllwDMO );

	    // delete self...
	    eaaEpxactionAllwDAC.delete( eaaEpxactionAllwDMO );
	  }


	  public void delete( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "delete( filter )" );

	    thrower.ifParameterMissing( "filter", filter );

	    // delete...
	    eaaEpxactionAllwDAC.delete( filter );
	  }


	  public boolean exists( EaaEpxactionAllwDMO eaaEpxactionAllwDMO )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "exists(eaaEpxactionAllw)" );

	    thrower.ifParameterMissing( "EaaEpxactionAllwDMO", eaaEpxactionAllwDMO );

	    thrower.ifParameterMissing( "EaaEpxactionAllwDMO.eaaSubsystem", eaaEpxactionAllwDMO.getEaaSubsystem());
	    thrower.ifParameterMissing( "EaaEpxactionAllwDMO.eaaActionType", eaaEpxactionAllwDMO.getEaaActionType());

	    return eaaEpxactionAllwDAC.exists( eaaEpxactionAllwDMO );
	  }


	  public boolean exists( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "exists(filter)" );

	    return eaaEpxactionAllwDAC.exists( filter );
	  }

//	  public DTOList getList(
//	    DTOListState state,
//	    QueryFilter  filter )
//	    throws EPPIXBusinessException, EPPIXUnexpectedException,
//	      EPPIXFatalException {
//	    logger.debug( "getList( state, filter )" );
//
//	    return eaaEpxactionAllwDAC.getList( state, filter );
//	  }

	  public DAOIterator iterate( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "iterate( filter )" );

	    return eaaEpxactionAllwDAC.iterate( filter );
	  }


	  public DAOIterator iterateWithLock( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "iterateWithLock( filter )" );

	    return eaaEpxactionAllwDAC.iterateWithLock( filter );
	  }


	  public EaaEpxactionAllwDMO get( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "get( filter )" );

	    thrower.ifParameterMissing( "filter", filter );

	    EaaEpxactionAllwDMO EaaEpxactionAllwDMO = eaaEpxactionAllwDAC.get( filter );

	    return EaaEpxactionAllwDMO;
	  }


	  public Object max( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "max( filter )" );

	    thrower.ifParameterMissing( "filter", filter );

	    return eaaEpxactionAllwDAC.max( filter );
	  }


	  public Object min( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "min( filter )" );

	    thrower.ifParameterMissing( "filter", filter );

	    return eaaEpxactionAllwDAC.min( filter );
	  }


	  public Integer count( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "count( filter )" );

	    thrower.ifParameterMissing( "filter", filter );

	    return new Integer(eaaEpxactionAllwDAC.count( filter ));
	  }
}
