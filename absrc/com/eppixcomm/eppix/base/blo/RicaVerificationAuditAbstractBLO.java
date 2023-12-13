package com.eppixcomm.eppix.base.blo;

import org.apache.log4j.Logger;

import com.eppixcomm.eppix.base.error.EPPIXBusinessException;
import com.eppixcomm.eppix.base.error.EPPIXFatalException;
import com.eppixcomm.eppix.base.error.EPPIXUnexpectedException;
import com.eppixcomm.eppix.base.error.Thrower;
import com.eppixcomm.eppix.common.data.DAC;
import com.eppixcomm.eppix.common.data.DTOActionTypes;
import com.eppixcomm.eppix.common.util.QueryFilter;



public abstract class RicaVerificationAuditAbstractBLO extends BaseBLO
	  implements DTOActionTypes, BaseMessages {
	  //~ Static variables/initializers //////////////////////////////////////////

	  /** DOCUMENT ME! */
	  static Thrower thrower = Thrower.getThrower( PtmPermToMarketAbstractBLO.class );
	  /** DOCUMENT ME! */
	  protected static final String ENTITY_ID = "RICAUD";

	  //~ Instance variables /////////////////////////////////////////////////////

	  /** DOCUMENT ME! */
	  protected Logger logger = thrower.getLogger(  );

	  /** Data Access Controller. */
	  public RicaVerificationAuditDAC ricaVerificationAuditDAC;

	  //~ Methods ////////////////////////////////////////////////////////////////

	  /** Invoked by the BLOBinder to provide this BLO with its DAC. */
	  public void setDAC( DAC dac ) {
	    this.ricaVerificationAuditDAC = (RicaVerificationAuditDAC) dac;
	  }

//	protected Class getDACClass() {
//
//		return RicaVerificationAuditDAC.class;
//	}

	  public RicaVerificationAuditDMO get( QueryFilter filter )
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
	    RicaVerificationAuditDMO ricaVerificationAuditDMO = ricaVerificationAuditDAC.get( filter );

	    return ricaVerificationAuditDMO;
	  }

	  public void delete( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "delete( filter )" );

	    thrower.ifParameterMissing( "filter", filter );

	    // delete...
	    ricaVerificationAuditDAC.delete( filter );
	  }

	  public void modify( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "modify( filter )" );

	    //
	    // Modify the ricaVerificationAudit
	    //
	    ricaVerificationAuditDAC.modify( filter );
	  }
	  
	  public RicaVerificationAuditDMO create( RicaVerificationAuditDMO ricaVerificationAuditDMO )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "create( ricaVerificationAuditDMO )" );

	    thrower.ifParameterMissing( "RicaVerificationAuditDMO", ricaVerificationAuditDMO );

	    //
	    // Now create the ptmPermToMarket
	    //
	    ricaVerificationAuditDAC.create( ricaVerificationAuditDMO );

	    return ricaVerificationAuditDMO;
	  }
}