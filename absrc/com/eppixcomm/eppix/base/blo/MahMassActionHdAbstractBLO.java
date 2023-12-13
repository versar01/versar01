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

public abstract class MahMassActionHdAbstractBLO extends BaseBLO implements DTOActionTypes, BaseMessages{

	static Thrower thrower = Thrower.getThrower( MahMassActionHdAbstractBLO.class );
	  /** DOCUMENT ME! */
	  protected static final String ENTITY_ID = "RICA";

	  //~ Instance variables /////////////////////////////////////////////////////

	  /** DOCUMENT ME! */
	  protected Logger logger = thrower.getLogger(  );

	  /** Data Access Controller. */
	  public MahMassActionHdDAC mahMassActionHdDac;

	  //~ Methods ////////////////////////////////////////////////////////////////

	  /** Invoked by the BLOBinder to provide this BLO with its DAC. */
	  public void setDAC( DAC dac ) {
	    this.mahMassActionHdDac = (MahMassActionHdDAC) dac;
	  }

//	protected Class getDACClass() {
//		return MahMassActionHdDAC.class;
//	}

	  public MahMassActionHdDMO get( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "get( filter )" );

	    //
	    // Check mandatory parameters.
	    //
	    thrower.ifParameterMissing( "filter", filter );

	    //
	    // Attempt to get the PtmPermToMarketDMO
	    //
	    MahMassActionHdDMO mahMassActionHdDMO = mahMassActionHdDac.get( filter );

	    return mahMassActionHdDMO;
	  }

	  public void delete( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "delete( filter )" );

	    thrower.ifParameterMissing( "filter", filter );

	    // delete...
	    mahMassActionHdDac.delete( filter );
	  }
	  
	  public void modify( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "modify( filter )" );

	    //
	    // Modify the MahMassActionHd
	    //
	    mahMassActionHdDac.modify( filter );
	    
	  }
	  
	  public DAOIterator iterate( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "iterate( filter )" );

	    return mahMassActionHdDac.iterate( filter );
	  }
	  
//	  public DAOIterator iterateTrickleDescrarStatusInnerSelect(QueryFilter filter )
//	    throws EPPIXBusinessException, EPPIXUnexpectedException,
//	      EPPIXFatalException {
//	    logger.debug( "iterate( filter )" );
//	    
//	    return mahMassActionHdDac.iterateTrickleDescrarStatusInnerSelect( filter );
//		  
//	  }

	
}
