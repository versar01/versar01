package com.eppixcomm.eppix.base.blo;

import java.util.Iterator;

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

public class EcfEventCmdFileAbstractBLO  extends BaseBLO
implements DTOActionTypes, BaseMessages{

	   static Thrower thrower = Thrower.getThrower( EcEventCommand.class );
	  protected static final String ENTITY_ID = "ECEC";

	  protected EcfEventCmdFileDAC ecfEventCmdFileDAC;
	  protected Logger logger = thrower.getLogger(  );

	  protected Class getDACClass(  ) {
	    return EcfEventCmdFileDAC.class;
	  }

	  protected void setDAC( DAC dac ) {
	    this.ecfEventCmdFileDAC = (EcfEventCmdFileDAC) dac;
	  }

	  public EcfEventCmdFileDMO get( EcfEventCmdFileDMO ecfEventCmdFileDMO )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "get(ecfEventCmdFileDMO)" );

	    thrower.ifParameterMissing( "ecfEventCmdFileDMO", ecfEventCmdFileDMO );

	    thrower.ifParameterMissing( "ecfEventCmdFileDMO.ecfCommand",
	      ecfEventCmdFileDMO.getEcfCommand());

	    EcfEventCmdFileDMO returnEcfEventCmdFileDMO = ecfEventCmdFileDAC.get( ecfEventCmdFileDMO );


	    if ( returnEcfEventCmdFileDMO == null ) {
	      thrower.business( Base_ECFEVENTCMDFILE_000,
	        new Object[] { ecfEventCmdFileDMO.getEcfCommand()} );
	    }

	    return returnEcfEventCmdFileDMO;
	  }

//	  public DTOList getList( 
//	    DTOListState      state,
//	    EcfEventCmdFileDMO ecfEventCmdFileDMO )
//	    throws EPPIXBusinessException, EPPIXUnexpectedException,
//	      EPPIXFatalException {
//	    logger.debug( "getList( state, ecfEventCmdFileDMO )" );
//
//	    return ecfEventCmdFileDAC.getList( state, ecfEventCmdFileDMO );
//	  }

	  public EcfEventCmdFileDMO create( EcfEventCmdFileDMO ecfEventCmdFileDMO )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "create( ecfEventCmdFileDMO )" );

	    thrower.ifParameterMissing( "ecfEventCmdFileDMO", ecfEventCmdFileDMO );

	    thrower.ifParameterMissing( "ecfEventCmdFileDMO.ecfCommand",
	      ecfEventCmdFileDMO.getEcfCommand());

//	    if ( exists( ecfEventCmdFileDMO ) ) {
//	      thrower.business( Base_ECFEVENTCMDFILE_001,
//	        new Object[] { ecfEventCmdFileDMO.getEcfCommand() } );
//	    }

	    ecfEventCmdFileDAC.create( ecfEventCmdFileDMO );
	    return ecfEventCmdFileDMO;
	  }

//	  public EcfEventCmdFileDMO modify( EcfEventCmdFileDMO aEcfEventCmdFileDMO )
//	    throws EPPIXBusinessException, EPPIXUnexpectedException,
//	      EPPIXFatalException {
//	    logger.debug( "modify( aecfEventCmdFileDMO )" );
//
//	    thrower.ifParameterMissing( "aecfEventCmdFileDMO", aEcfEventCmdFileDMO );
//
//	    thrower.ifParameterMissing( "aEcfEventCmdFileDMO.ecfCommand",
//	      aEcfEventCmdFileDMO.getEcfCommand()); // attribute
//
//	    EcfEventCmdFileDMO updateEcfEventCmdFileDMO = new EcfEventCmdFileDMO(  );
//
//	    updateEcfEventCmdFileDMO.setEcfCommand(aEcfEventCmdFileDMO.getEcfCommand());
//
//	    updateEcfEventCmdFileDMO = get( updateEcfEventCmdFileDMO );
//
//	    updateEcfEventCmdFileDMO.setEcfCommand(aEcfEventCmdFileDMO.getEcfCommand());
//
//	    updateEcfEventCmdFileDMO.setEcfFile(aEcfEventCmdFileDMO.getEcfFile());
//
//	    updateEcfEventCmdFileDMO.setEcfTimestamp(aEcfEventCmdFileDMO.getEcfTimestamp());
//
//	    ecfEventCmdFileDAC.modify( updateEcfEventCmdFileDMO );
//
//	    EcfEventCmdFileDMO returnEcfEventCmdFileDMO = new EcfEventCmdFileDMO(  );
//
//	    returnEcfEventCmdFileDMO.setEcfCommand(updateEcfEventCmdFileDMO.getEcfCommand());
//
//	    returnEcfEventCmdFileDMO = get( returnEcfEventCmdFileDMO );
//
//	    return returnEcfEventCmdFileDMO;
//	  }

	  public void modify( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "modify( filter )" );

	    ecfEventCmdFileDAC.modify( filter );
	  }

	  public void delete( EcfEventCmdFileDMO ecfEventCmdFileDMO )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "delete( ecfEventCmdFileDMO )" );

	    thrower.ifParameterMissing( "ecfEventCmdFileDMO", ecfEventCmdFileDMO );

	    EcfEventCmdFileDMO updateEcfEventCmdFileDMO = null;

	    updateEcfEventCmdFileDMO = get( ecfEventCmdFileDMO );

	    ecfEventCmdFileDAC.delete( ecfEventCmdFileDMO );
	  }

	  public void delete( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "delete( filter )" );

	    thrower.ifParameterMissing( "filter", filter );

	    ecfEventCmdFileDAC.delete( filter );
	  }

//	  public boolean exists( EcfEventCmdFileDMO ecfEventCmdFileDMO )
//	    throws EPPIXBusinessException, EPPIXUnexpectedException,
//	      EPPIXFatalException {
//	    logger.debug( "exists(ecEventCommand)" );
//
//	    thrower.ifParameterMissing( "ecfEventCmdFileDMO", ecfEventCmdFileDMO );
//
//	    thrower.ifParameterMissing( "ecfEventCmdFileDMO.ecfCommand",
//	      ecfEventCmdFileDMO.getEcfCommand());
//
//	    return ecfEventCmdFileDAC.exists( ecfEventCmdFileDMO );
//	  }

	  public boolean exists( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "exists(filter)" );

	    return ecfEventCmdFileDAC.exists( filter );
	  }

//	  public DTOList getList( 
//	    DTOListState state,
//	    QueryFilter  filter )
//	    throws EPPIXBusinessException, EPPIXUnexpectedException,
//	      EPPIXFatalException {
//	    logger.debug( "getList( state, filter )" );
//
//	    return ecfEventCmdFileDAC.getList( state, filter );
//	  }

	  public Iterator iterate( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "iterate( filter )" );

	    return ecfEventCmdFileDAC.iterate( filter );
	  }

	  public DAOIterator iterateWithLock( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "iterateWithLock( filter )" );

	    return ecfEventCmdFileDAC.iterateWithLock( filter );
	  }

	  public EcfEventCmdFileDMO get( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "get( filter )" );

	    thrower.ifParameterMissing( "filter", filter );

	    EcfEventCmdFileDMO ecfEventCmdFileDMO = ecfEventCmdFileDAC.get( filter );

	    return ecfEventCmdFileDMO;
	  }

	  public Object max( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "max( filter )" );

	    thrower.ifParameterMissing( "filter", filter );

	    return ecfEventCmdFileDAC.max( filter );
	  }

	  public Object min( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "min( filter )" );

	    thrower.ifParameterMissing( "filter", filter );

	    return ecfEventCmdFileDAC.min( filter );
	  }

	  public Integer count( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "count( filter )" );

	    thrower.ifParameterMissing( "filter", filter );
  
	    return new Integer(ecfEventCmdFileDAC.count(filter));
	  }

}
