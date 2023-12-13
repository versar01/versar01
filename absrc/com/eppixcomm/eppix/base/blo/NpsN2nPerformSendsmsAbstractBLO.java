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



public class NpsN2nPerformSendsmsAbstractBLO   extends BaseBLO
implements DTOActionTypes, BaseMessages{
	  /** DOCUMENT ME! */
	  static Thrower thrower = Thrower.getThrower( NpsN2nPerformSendsmsAbstractBLO.class );
	  /** DOCUMENT ME! */
	  protected static final String ENTITY_ID = "NPS";
	  
	  /** Data Access Controller. */
	  protected NpsN2nPerformSendsmsAbstractDAC npsAbstractDAC;
	  /** DOCUMENT ME! */
	  protected Logger logger = thrower.getLogger(  );
	  
	protected Class getDACClass() {
		return NpsN2nPerformSendsmsAbstractDAC.class;
	}

	protected void setDAC(DAC dac) {
	    this.npsAbstractDAC = (NpsN2nPerformSendsmsAbstractDAC) dac;
	}

	  public NpsN2nPerformSendsmsDMO get( NpsN2nPerformSendsmsDMO npsN2nPerformSendsmsDMO )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "get(npsN2nPerformSendsmsDMO)" );

	    //
	    // Check mandatory parameters.
	    //
	    thrower.ifParameterMissing( "npsN2nPerformSendsmsDMO", npsN2nPerformSendsmsDMO );

	    //
	    // Each attribute that is part of the primary key is mandatory
	    //
	    thrower.ifParameterMissing( "npsN2nPerformSendsmsDMO.npsSerial",
	      npsN2nPerformSendsmsDMO.getNpsSerial(  ) );

	    //
	    // Attempt to get the NpsN2nPerformSendsmsDMO
	    //
	    NpsN2nPerformSendsmsDMO returnNpsN2nPerformSendsmsDMO = npsAbstractDAC.get( npsN2nPerformSendsmsDMO );

	    //
	    // Could not find the NpsN2nPerformSendsmsDMO
	    //
	    if ( returnNpsN2nPerformSendsmsDMO == null ) {
	      thrower.business( Base_ACTACCTYPES_000,
	        new Object[] { npsN2nPerformSendsmsDMO.getNpsSerial()} );
	    }

	    //
	    // Now, based on the values of the flags on this method signature, which in turn,
	    // are based on this objects associations, get all associated, embedded objects
	    //
	    return returnNpsN2nPerformSendsmsDMO;
	  }
	  //==================================================================================================


//	  public DTOList getList(
//	    DTOListState   state,
//	    NpsN2nPerformSendsmsDMO npsN2nPerformSendsmsDMO )
//	    throws EPPIXBusinessException, EPPIXUnexpectedException,
//	      EPPIXFatalException {
//	    logger.debug( "getList( state, npsN2nPerformSendsmsDMO )" );
//
//	    return npsAbstractDAC.getList( state, npsN2nPerformSendsmsDMO );
//	  }


	  public NpsN2nPerformSendsmsDMO create( NpsN2nPerformSendsmsDMO npsN2nPerformSendsmsDMO )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "create( npsN2nPerformSendsmsDMO )" );

	    thrower.ifParameterMissing( "npsN2nPerformSendsmsDMO", npsN2nPerformSendsmsDMO );

//	    thrower.ifParameterMissing( "npsN2nPerformSendsmsDMO.npsSerial",
//	      npsN2nPerformSendsmsDMO.getNpsSerial(  ) );

	    thrower.ifParameterMissing( "npsN2nPerformSendsmsDMO.npsFunction",
	      npsN2nPerformSendsmsDMO.getNpsFunction());

//	    thrower.ifParameterMissing( "npsN2nPerformSendsmsDMO.npsOption",
//	      npsN2nPerformSendsmsDMO.getNpsOption());

//	    thrower.ifParameterMissing( "npsN2nPerformSendsmsDMO.npsPortId",
//	      npsN2nPerformSendsmsDMO.getNpsPortId());

	    thrower.ifParameterMissing( "npsN2nPerformSendsmsDMO.npsMsisdn",
	      npsN2nPerformSendsmsDMO.getNpsMsisdn() );

//	    thrower.ifParameterMissing( "npsN2nPerformSendsmsDMO.npsDesc",
//	  	      npsN2nPerformSendsmsDMO.getNpsDesc());
	    
	    thrower.ifParameterMissing( "npsN2nPerformSendsmsDMO.npsSource",
	  	      npsN2nPerformSendsmsDMO.getNpsSource());
	    
//	    thrower.ifParameterMissing( "npsN2nPerformSendsmsDMO.npsTransId",
//	  	      npsN2nPerformSendsmsDMO.getNpsTransId());
	    
//	    thrower.ifParameterMissing( "npsN2nPerformSendsmsDMO.npsSim",
//	  	      npsN2nPerformSendsmsDMO.getNpsSim() );
	    
//	    thrower.ifParameterMissing( "npsN2nPerformSendsmsDMO.npsTimestamp",
//	  	      npsN2nPerformSendsmsDMO.getNpsTimestamp());
	    //
	    // Check that this object does not already exist
	    //
//	    if ( exists( npsN2nPerformSendsmsDMO ) ) {
//	      thrower.business( Base_ACTACCTYPES_001,
//	        new Object[] { npsN2nPerformSendsmsDMO.getNpsSerial()} );
//	    }

	    //
	    // Now create the record
	    //
	    npsAbstractDAC.create( npsN2nPerformSendsmsDMO );

	    return npsN2nPerformSendsmsDMO;
	  }

	  public NpsN2nPerformSendsmsDMO modify( NpsN2nPerformSendsmsDMO npsN2nPerformSendsmsDMO )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "modify( anpsN2nPerformSendsmsDMO )" );

	    //
	    // Check mandatory parameters (
	    //
	    // Note: attributes stereotyped <NotModifiable> are ignored
	    //
	    thrower.ifParameterMissing( "anpsN2nPerformSendsmsDMO", npsN2nPerformSendsmsDMO );

	    thrower.ifParameterMissing( "npsN2nPerformSendsmsDMO.npsFunction",
	  	      npsN2nPerformSendsmsDMO.getNpsFunction());

	  	    thrower.ifParameterMissing( "npsN2nPerformSendsmsDMO.npsOption",
	  	      npsN2nPerformSendsmsDMO.getNpsOption());

	  	    thrower.ifParameterMissing( "npsN2nPerformSendsmsDMO.npsPortId",
	  	      npsN2nPerformSendsmsDMO.getNpsPortId());

	  	    thrower.ifParameterMissing( "npsN2nPerformSendsmsDMO.npsMsisdn",
	  	      npsN2nPerformSendsmsDMO.getNpsMsisdn() );

	  	    thrower.ifParameterMissing( "npsN2nPerformSendsmsDMO.npsDesc",
	  	  	      npsN2nPerformSendsmsDMO.getNpsDesc());
	  	    
	  	    thrower.ifParameterMissing( "npsN2nPerformSendsmsDMO.npsSource",
	  	  	      npsN2nPerformSendsmsDMO.getNpsSource());
	  	    
	  	    thrower.ifParameterMissing( "npsN2nPerformSendsmsDMO.npsTransId",
	  	  	      npsN2nPerformSendsmsDMO.getNpsTransId());
	  	    
	  	    thrower.ifParameterMissing( "npsN2nPerformSendsmsDMO.npsSim",
	  	  	      npsN2nPerformSendsmsDMO.getNpsSim() );
	  	    
	  	    thrower.ifParameterMissing( "npsN2nPerformSendsmsDMO.npsTimestamp",
	  	  	      npsN2nPerformSendsmsDMO.getNpsTimestamp());

	    NpsN2nPerformSendsmsDMO updateNpsN2nPerformSendsmsDMO = new NpsN2nPerformSendsmsDMO(  );

	    updateNpsN2nPerformSendsmsDMO.setNpsSerial(npsN2nPerformSendsmsDMO.getNpsSerial());

	    updateNpsN2nPerformSendsmsDMO = get( updateNpsN2nPerformSendsmsDMO );

	    //
	    // For each relationship to single objects (does not matter if they are Embedded or Flattened)
	    // either associate to a pre-existing object, or create an object then associate to it
	    //

	    //
	    // Copy the fields to be updated. We do not want to overwrite primary keys etc.
	    // All attributes stereotyped as being <NotModifiable> are skipped
	    //
	    updateNpsN2nPerformSendsmsDMO.setNpsFunction(npsN2nPerformSendsmsDMO.getNpsFunction());
	    updateNpsN2nPerformSendsmsDMO.setNpsOption( npsN2nPerformSendsmsDMO.getNpsOption() );
	    updateNpsN2nPerformSendsmsDMO.setNpsPortId(npsN2nPerformSendsmsDMO.getNpsPortId() );
	    updateNpsN2nPerformSendsmsDMO.setNpsMsisdn(npsN2nPerformSendsmsDMO.getNpsMsisdn() );
	    updateNpsN2nPerformSendsmsDMO.setNpsDesc(npsN2nPerformSendsmsDMO.getNpsDesc() );
	    updateNpsN2nPerformSendsmsDMO.setNpsSource(npsN2nPerformSendsmsDMO.getNpsSource() );
	    updateNpsN2nPerformSendsmsDMO.setNpsTransId(npsN2nPerformSendsmsDMO.getNpsTransId() );
	    updateNpsN2nPerformSendsmsDMO.setNpsSim( npsN2nPerformSendsmsDMO.getNpsSim() );
	    updateNpsN2nPerformSendsmsDMO.setNpsTimestamp(npsN2nPerformSendsmsDMO.getNpsTimestamp());
	    //
	    // Modify the npsN2nPerformSendsmsDMO
	    //
	    npsAbstractDAC.modify( updateNpsN2nPerformSendsmsDMO );

	    // Create a new NpsN2nPerformSendsmsDMO, set keys, and fetch from the database...
	    NpsN2nPerformSendsmsDMO returnNpsN2nPerformSendsmsDMO = new NpsN2nPerformSendsmsDMO(  );

	    returnNpsN2nPerformSendsmsDMO.setNpsSerial(updateNpsN2nPerformSendsmsDMO.getNpsSerial());

	    returnNpsN2nPerformSendsmsDMO = get( returnNpsN2nPerformSendsmsDMO );

	    return returnNpsN2nPerformSendsmsDMO;
	  }
	  //==================================================================================================


	  public void modify( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "modify( filter )" );

	    //
	    // Modify the npsN2nPerformSendsmsDMO
	    //
	    npsAbstractDAC.modify( filter );
	  }
	//==================================================================================================

	  public void delete( NpsN2nPerformSendsmsDMO npsN2nPerformSendsmsDMO )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "delete( npsN2nPerformSendsmsDMO )" );

	    thrower.ifParameterMissing( "npsN2nPerformSendsmsDMO", npsN2nPerformSendsmsDMO );

	    NpsN2nPerformSendsmsDMO updateNpsN2nPerformSendsmsDMO = null;

	    updateNpsN2nPerformSendsmsDMO = get( npsN2nPerformSendsmsDMO );

	    // delete self...
	    npsAbstractDAC.delete( npsN2nPerformSendsmsDMO );
	  }
	//==================================================================================================

	  public void delete( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "delete( filter )" );

	    thrower.ifParameterMissing( "filter", filter );

	    // delete...
	    npsAbstractDAC.delete( filter );
	  }
	  //==================================================================================================

	  public boolean exists( NpsN2nPerformSendsmsDMO npsN2nPerformSendsmsDMO )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "exists(npsN2nPerformSendsmsDMO)" );

	    thrower.ifParameterMissing( "npsN2nPerformSendsmsDMO", npsN2nPerformSendsmsDMO );

	    thrower.ifParameterMissing( "npsN2nPerformSendsmsDMO.npsSerial",
	      npsN2nPerformSendsmsDMO.getNpsSerial());

	    return npsAbstractDAC.exists( npsN2nPerformSendsmsDMO );
	  }
	  //==================================================================================================


	  public boolean exists( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "exists(filter)" );

	    return npsAbstractDAC.exists( filter );
	  }
	  //==================================================================================================


//	  public DTOList getList(
//	    DTOListState state,
//	    QueryFilter  filter )
//	    throws EPPIXBusinessException, EPPIXUnexpectedException,
//	      EPPIXFatalException {
//	    logger.debug( "getList( state, filter )" );
//
//	    return npsAbstractDAC.getList( state, filter );
//	  }

  //==================================================================================================

	  public DAOIterator iterate( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "iterateWithLock( filter )" );

	    return npsAbstractDAC.iterate( filter );
	  }
	  //==================================================================================================


	  public DAOIterator iterateWithLock( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "iterateWithLock( filter )" );

	    return npsAbstractDAC.iterateWithLock( filter );
	  }
	  //==================================================================================================


	  public NpsN2nPerformSendsmsDMO get( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "get( filter )" );

	    //
	    // Check mandatory parameters.
	    //
	    thrower.ifParameterMissing( "filter", filter );

	    //
	    // Attempt to get the NpsN2nPerformSendsmsDMO
	    //
	    NpsN2nPerformSendsmsDMO npsN2nPerformSendsmsDMO = npsAbstractDAC.get( filter );

	    return npsN2nPerformSendsmsDMO;
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

	    return npsAbstractDAC.max( filter );
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

	    return npsAbstractDAC.min( filter );
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

	    return Integer.valueOf(npsAbstractDAC.count( filter ));
	  }
	  //==================================================================================================


}