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

public abstract class RicaActionReqAbstractBLO extends BaseBLO implements DTOActionTypes, BaseMessages{

	static Thrower thrower = Thrower.getThrower( RicaActionReqAbstractBLO.class );
	  /** DOCUMENT ME! */
	  protected static final String ENTITY_ID = "RICA";

	  //~ Instance variables /////////////////////////////////////////////////////

	  /** DOCUMENT ME! */
	  protected Logger logger = thrower.getLogger(  );

	  /** Data Access Controller. */
	  public RicaActionReqDAC ricaActionReqDac;

	  //~ Methods ////////////////////////////////////////////////////////////////

	  /** Invoked by the BLOBinder to provide this BLO with its DAC. */
	  public void setDAC( DAC dac ) {
	    this.ricaActionReqDac = (RicaActionReqDAC) dac;
	  }

//	protected Class getDACClass() {
//		return RicaActionReqDAC.class;
//	}

	  public RicaActionReqDMO get( QueryFilter filter )
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
	    RicaActionReqDMO ricaActionReqDMO = ricaActionReqDac.get( filter );

	    return ricaActionReqDMO;
	  }

	  public void delete( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "delete( filter )" );

	    thrower.ifParameterMissing( "filter", filter );

	    // delete...
	    ricaActionReqDac.delete( filter );
	  }
	  
	  public void modify( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "modify( filter )" );

	    //
	    // Modify the RicaActionReq
	    //
	    ricaActionReqDac.modify( filter );
	    
	  }
	  
	  public DAOIterator iterate( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "iterate( filter )" );

	    return ricaActionReqDac.iterate( filter );
	  }
	  
	  public DAOIterator iterateTrickleDescrarStatusInnerSelect(QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "iterate( filter )" );
	    
	    return ricaActionReqDac.iterateTrickleDescrarStatusInnerSelect( filter );
		  
	  }

	
}
