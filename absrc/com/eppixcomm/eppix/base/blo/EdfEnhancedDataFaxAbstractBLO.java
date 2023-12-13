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

public class EdfEnhancedDataFaxAbstractBLO extends BaseBLO implements
		DTOActionTypes, BaseMessages {
	  /** DOCUMENT ME! */
	  static Thrower thrower = Thrower.getThrower( EdfEnhancedDataFaxAbstractBLO.class );
	  /** DOCUMENT ME! */
	  protected static final String ENTITY_ID = "EDF";
	  
	  /** Data Access Controller. */
	  protected EdfEnhancedDataFaxAbstractDAC edfAbstractDAC;
	  /** DOCUMENT ME! */
	  protected Logger logger = thrower.getLogger(  );
	  
	protected Class getDACClass() {
		return EdfEnhancedDataFaxAbstractDAC.class;
	}

	protected void setDAC(DAC dac) {
	    this.edfAbstractDAC = (EdfEnhancedDataFaxAbstractDAC) dac;
	}

	  public EdfEnhancedDataFaxDMO get( EdfEnhancedDataFaxDMO edfEnhancedDataFaxDMO )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "get(edfEnhancedDataFaxDMO)" );

	    //
	    // Check mandatory parameters.
	    //
	    thrower.ifParameterMissing( "edfEnhancedDataFaxDMO", edfEnhancedDataFaxDMO );

	    //
	    // Each attribute that is part of the primary key is mandatory
	    //
	    thrower.ifParameterMissing( "edfEnhancedDataFaxDMO.edfPrimarySim",
	    		edfEnhancedDataFaxDMO.getEdfPrimarySim());

	    //
	    // Attempt to get the EdfEnhancedDataFaxDMO
	    //
	    EdfEnhancedDataFaxDMO returnEdfEnhancedDataFaxDMO = edfAbstractDAC.get( edfEnhancedDataFaxDMO );

	    //
	    // Could not find the EdfEnhancedDataFaxDMO
	    //
	    // TODO: to be confirmed if we need this...
	    if ( returnEdfEnhancedDataFaxDMO == null ) {
	      thrower.business( Base_EDFPRIMSIM_000,
	        new Object[] { edfEnhancedDataFaxDMO.getEdfPrimarySim()} );
	    }

	    //
	    // Now, based on the values of the flags on this method signature, which in turn,
	    // are based on this objects associations, get all associated, embedded objects
	    //
	    return returnEdfEnhancedDataFaxDMO;
	  }
	  //==================================================================================================


//	  public DTOList getList(
//	    DTOListState   state,
//	    EdfEnhancedDataFaxDMO edfEnhancedDataFaxDMO )
//	    throws EPPIXBusinessException, EPPIXUnexpectedException,
//	      EPPIXFatalException {
//	    logger.debug( "getList( state, edfEnhancedDataFaxDMO )" );
//
//	    return edfAbstractDAC.getList( state, edfEnhancedDataFaxDMO );
//	  }


	  public EdfEnhancedDataFaxDMO create( EdfEnhancedDataFaxDMO edfEnhancedDataFaxDMO )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "create( edfEnhancedDataFaxDMO )" );

	    thrower.ifParameterMissing( "edfEnhancedDataFaxDMO", edfEnhancedDataFaxDMO );

	    thrower.ifParameterMissing( "edfEnhancedDataFaxDMO.edfPrimarySim",
	    		edfEnhancedDataFaxDMO.getEdfPrimarySim());

	    thrower.ifParameterMissing( "edfEnhancedDataFaxDMO.edfMsisdn",
	    		edfEnhancedDataFaxDMO.getEdfMsisdn());
	    thrower.ifParameterMissing( "edfEnhancedDataFaxDMO.edfTimestamp",
	    		edfEnhancedDataFaxDMO.getEdfTimestamp());
	    
	    //
	    // Now create the record
	    //
	    edfAbstractDAC.create( edfEnhancedDataFaxDMO );

	    return edfEnhancedDataFaxDMO;
	  }

	  public EdfEnhancedDataFaxDMO modify( EdfEnhancedDataFaxDMO edfEnhancedDataFaxDMO )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "modify( edfEnhancedDataFaxDMO )" );

	    //
	    // Check mandatory parameters (
	    //
	    // Note: attributes stereotyped <NotModifiable> are ignored
	    //
	    thrower.ifParameterMissing( "edfEnhancedDataFaxDMO", edfEnhancedDataFaxDMO );

	    thrower.ifParameterMissing( "edfEnhancedDataFaxDMO.edfPrimarySim",
	  	      edfEnhancedDataFaxDMO.getEdfPrimarySim());

	  	    thrower.ifParameterMissing( "edfEnhancedDataFaxDMO.edfMsisdn",
	  	      edfEnhancedDataFaxDMO.getEdfMsisdn());
	  	    
	  	    thrower.ifParameterMissing( "edfEnhancedDataFaxDMO.edfTimestamp",
	  	  	      edfEnhancedDataFaxDMO.getEdfTimestamp());

	    EdfEnhancedDataFaxDMO updateEdfEnhancedDataFaxDMO = new EdfEnhancedDataFaxDMO(  );

	    updateEdfEnhancedDataFaxDMO.setEdfPrimarySim(edfEnhancedDataFaxDMO.getEdfPrimarySim());

	    updateEdfEnhancedDataFaxDMO = get( updateEdfEnhancedDataFaxDMO );

	    //
	    // For each relationship to single objects (does not matter if they are Embedded or Flattened)
	    // either associate to a pre-existing object, or create an object then associate to it
	    //

	    //
	    // Copy the fields to be updated. We do not want to overwrite primary keys etc.
	    // All attributes stereotyped as being <NotModifiable> are skipped
	    //
	    updateEdfEnhancedDataFaxDMO.setEdfMsisdn(edfEnhancedDataFaxDMO.getEdfMsisdn());
	    updateEdfEnhancedDataFaxDMO.setEdfTimestamp(edfEnhancedDataFaxDMO.getEdfTimestamp());
	    //
	    // Modify the edfEnhancedDataFaxDMO
	    //
	    edfAbstractDAC.modify( updateEdfEnhancedDataFaxDMO );

	    // Create a new EdfEnhancedDataFaxDMO, set keys, and fetch from the database...
	    EdfEnhancedDataFaxDMO returnEdfEnhancedDataFaxDMO = new EdfEnhancedDataFaxDMO(  );

	    returnEdfEnhancedDataFaxDMO.setEdfPrimarySim(updateEdfEnhancedDataFaxDMO.getEdfPrimarySim());

	    returnEdfEnhancedDataFaxDMO = get( returnEdfEnhancedDataFaxDMO );

	    return returnEdfEnhancedDataFaxDMO;
	  }
	  //==================================================================================================


	  public void modify( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "modify( filter )" );

	    //
	    // Modify the edfEnhancedDataFaxDMO
	    //
	    edfAbstractDAC.modify( filter );
	  }
	//==================================================================================================

	  public void delete( EdfEnhancedDataFaxDMO edfEnhancedDataFaxDMO )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "delete( edfEnhancedDataFaxDMO )" );

	    thrower.ifParameterMissing( "edfEnhancedDataFaxDMO", edfEnhancedDataFaxDMO );

	    EdfEnhancedDataFaxDMO updateEdfEnhancedDataFaxDMO = null;

	    updateEdfEnhancedDataFaxDMO = get( edfEnhancedDataFaxDMO );

	    // delete self...
	    edfAbstractDAC.delete( edfEnhancedDataFaxDMO );
	  }
	//==================================================================================================

	  public void delete( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "delete( filter )" );

	    thrower.ifParameterMissing( "filter", filter );

	    // delete...
	    edfAbstractDAC.delete( filter );
	  }
	  //==================================================================================================

	  public boolean exists( EdfEnhancedDataFaxDMO edfEnhancedDataFaxDMO )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "exists(edfEnhancedDataFaxDMO)" );

	    thrower.ifParameterMissing( "edfEnhancedDataFaxDMO", edfEnhancedDataFaxDMO );

	    thrower.ifParameterMissing( "edfEnhancedDataFaxDMO.edfPrimarySim",
	      edfEnhancedDataFaxDMO.getEdfPrimarySim());

	    return edfAbstractDAC.exists( edfEnhancedDataFaxDMO );
	  }
	  //==================================================================================================


	  public boolean exists( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "exists(filter)" );

	    return edfAbstractDAC.exists( filter );
	  }
	  //==================================================================================================


//	  public DTOList getList(
//	    DTOListState state,
//	    QueryFilter  filter )
//	    throws EPPIXBusinessException, EPPIXUnexpectedException,
//	      EPPIXFatalException {
//	    logger.debug( "getList( state, filter )" );
//
//	    return edfAbstractDAC.getList( state, filter );
//	  }

//==================================================================================================

	  public DAOIterator iterate( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "iterateWithLock( filter )" );

	    return edfAbstractDAC.iterate( filter );
	  }
	  //==================================================================================================


	  public DAOIterator iterateWithLock( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "iterateWithLock( filter )" );

	    return edfAbstractDAC.iterateWithLock( filter );
	  }
	  //==================================================================================================


	  public EdfEnhancedDataFaxDMO get( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "get( filter )" );

	    //
	    // Check mandatory parameters.
	    //
	    thrower.ifParameterMissing( "filter", filter );

	    //
	    // Attempt to get the EdfEnhancedDataFaxDMO
	    //
	    EdfEnhancedDataFaxDMO edfEnhancedDataFaxDMO = edfAbstractDAC.get( filter );

	    return edfEnhancedDataFaxDMO;
	  }
	  //==================================================================================================


	  public Object max( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "max( filter )" );

	    //
	    // Check mandatory parameters.
	    //
	    thrower.ifParameterMissing( "filter", filter );

	    return edfAbstractDAC.max( filter );
	  }
	  //==================================================================================================


	  public Object min( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "min( filter )" );

	    //
	    // Check mandatory parameters.
	    //
	    thrower.ifParameterMissing( "filter", filter );

	    return edfAbstractDAC.min( filter );
	  }
	  //==================================================================================================


	  public Integer count( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "count( filter )" );

	    //
	    // Check mandatory parameters.
	    //
	    thrower.ifParameterMissing( "filter", filter );

	    return Integer.valueOf(edfAbstractDAC.count( filter ));
	  }
	  //==================================================================================================


}
