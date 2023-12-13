package com.eppixcomm.eppix.base.blo;

import org.apache.log4j.Logger;

import com.eppixcomm.eppix.base.error.EPPIXBusinessException;
import com.eppixcomm.eppix.base.error.EPPIXFatalException;
import com.eppixcomm.eppix.base.error.EPPIXUnexpectedException;
import com.eppixcomm.eppix.base.error.Thrower;
import com.eppixcomm.eppix.common.data.DAC;
import com.eppixcomm.eppix.common.data.DAOIterator;
import com.eppixcomm.eppix.common.data.DTOActionTypes;
import com.eppixcomm.eppix.common.util.FilterOp;
import com.eppixcomm.eppix.common.util.QueryFilter;



public abstract class RicaPersonVerificationAbstractBLO
	  extends BaseBLO
	  implements DTOActionTypes, BaseMessages {
	  //~ Static variables/initializers //////////////////////////////////////////

	  /** DOCUMENT ME! */
	  static Thrower thrower = Thrower.getThrower( RicaPersonVerificationAbstractBLO.class );
	  /** DOCUMENT ME! */
	  protected static final String ENTITY_ID = "RICA";

	  //~ Instance variables /////////////////////////////////////////////////////

	  /** DOCUMENT ME! */
	  protected Logger logger = thrower.getLogger(  );

	  /** Data Access Controller. */
	  public RicaPersonVerificationDAC ricaPersonVerificationDAC;

	  //~ Methods ////////////////////////////////////////////////////////////////

	  /** Invoked by the BLOBinder to provide this BLO with its DAC. */
	  public void setDAC( DAC dac ) {
	    this.ricaPersonVerificationDAC = (RicaPersonVerificationDAC) dac;
	  }

//	protected Class getDACClass() {
//		return RicaPersonVerificationDAC.class;
//	}

	  public RicaPersonVerificationDMO get( QueryFilter filter )
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
	    RicaPersonVerificationDMO ricaPersonVerificationDMO = ricaPersonVerificationDAC.get( filter );

	    return ricaPersonVerificationDMO;
	  }

	  public void delete( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "delete( filter )" );

	    thrower.ifParameterMissing( "filter", filter );

	    // delete...
	    ricaPersonVerificationDAC.delete( filter );
	  }
	  
	  public void modify( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "modify( filter )" );

	    //
	    // Modify the RicaPersonVerification
	    //
	    ricaPersonVerificationDAC.modify( filter );
	    
	  }
	  
	  public DAOIterator iterate( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "iterate( filter )" );

	    return ricaPersonVerificationDAC.iterate( filter );
	  }
	  
	  public DAOIterator iterateTrickleDescrpvStatusInnerSelect(QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "iterate( filter )" );
	    
	    return ricaPersonVerificationDAC.iterateTrickleDescrpvStatusInnerSelect( filter );
		  
	  }
}