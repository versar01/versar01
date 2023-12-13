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



public abstract class SbaSubAuxAbstractBLO extends BaseBLO
implements DTOActionTypes, BaseMessages {

	  static Thrower thrower = Thrower.getThrower( SbaSubAuxAbstractBLO.class );
	  protected static final String ENTITY_ID = "SBA";
	  protected Logger logger = thrower.getLogger(  );
	  public SbaSubAuxDAC sbaSubAuxDAC;
	
	  public void setDAC( DAC dac ) {
		    this.sbaSubAuxDAC = (SbaSubAuxDAC) dac;
	  }

	  public SbaSubAuxDMO get( SbaSubAuxDMO sbaSubAuxDMO )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "get(sbaSubAuxDMO)" );

	    //
	    // Check mandatory parameters.
	    //
	    thrower.ifParameterMissing( "sbaSubAuxDMO", sbaSubAuxDMO );

	    //
	    // Each attribute that is part of the primary key is mandatory
	    //
	    thrower.ifParameterMissing( "sbaSubAuxDMO.getSbaSubscriberId",
	      sbaSubAuxDMO.getSbaSubscriberId());

	    //
	    // Attempt to get the SbaSubAuxDMO
	    //
	    SbaSubAuxDMO returnSbaSubAuxDMO = sbaSubAuxDAC.get( sbaSubAuxDMO );

	    //
	    // Could not find the SbaSubAuxDMO
	    //
	    if ( returnSbaSubAuxDMO == null ) {
	      thrower.business( Base_SBASUBAUX_000,
	        new Object[] { sbaSubAuxDMO.getSbaSubscriberId(  ) } );
	    }

	    //
	    // Now, based on the values of the flags on this method signature, which in turn,
	    // are based on this objects associations, get all associated, embedded objects
	    //
	    return returnSbaSubAuxDMO;
	  }
	  //==================================================================================================


//	  public DTOList getList(
//	    DTOListState   state,
//	    SbaSubAuxDMO sbaSubAuxDMO )
//	    throws EPPIXBusinessException, EPPIXUnexpectedException,
//	      EPPIXFatalException {
//	    logger.debug( "getList( state, sbaSubAuxDMO )" );
//
//	    return sbaSubAuxDAC.getList( state, sbaSubAuxDMO );
//	  }


	  public SbaSubAuxDMO create( SbaSubAuxDMO sbaSubAuxDMO )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "create( sbaSubAuxDMO )" );

	    thrower.ifParameterMissing( "sbaSubAuxDMO", sbaSubAuxDMO );

	    thrower.ifParameterMissing( "sbaSubAuxDMO.getSbaSubscriberId",
	      sbaSubAuxDMO.getSbaSubscriberId() );

//	    thrower.ifParameterMissing( "sbaSubAuxDMO.actAccType",
//	      sbaSubAuxDMO.getActAccType(  ) );
//
//	    thrower.ifParameterMissing( "sbaSubAuxDMO.actMnpType",
//	      sbaSubAuxDMO.getActMnpType(  ) );
//
//	    thrower.ifParameterMissing( "sbaSubAuxDMO.actUseLe",
//	      sbaSubAuxDMO.getActUseLe(  ) );
//
//	    thrower.ifParameterMissing( "sbaSubAuxDMO.actSegment",
//	      sbaSubAuxDMO.getActSegment(  ) );

	    //
	    // Check that this object does not already exist
	    //
	    if ( exists( sbaSubAuxDMO ) ) {
	      thrower.business( Base_SBASUBAUX_001,
	        new Object[] { sbaSubAuxDMO.getSbaSubscriberId()});
	    }

	    //
	    // Now create the record
	    //
	    sbaSubAuxDAC.create( sbaSubAuxDMO );

	    return sbaSubAuxDMO;
	  }

	  public SbaSubAuxDMO modify( SbaSubAuxDMO aSbaSubAuxDMO )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "modify( asbaSubAuxDMO )" );

	    //
	    // Check mandatory parameters (
	    //
	    // Note: attributes stereotyped <NotModifiable> are ignored
	    //
	    thrower.ifParameterMissing( "asbaSubAuxDMO", aSbaSubAuxDMO );

	    thrower.ifParameterMissing( "aSbaSubAuxDMO.getSbaSubscriberId",
	      aSbaSubAuxDMO.getSbaSubscriberId()); // attribute

//	    thrower.ifParameterMissing( "aSbaSubAuxDMO.actAccType",
//	      aSbaSubAuxDMO.getActAccType(  ) ); // attribute
//
//	    thrower.ifParameterMissing( "aSbaSubAuxDMO.actMnpType",
//	      aSbaSubAuxDMO.getActMnpType(  ) ); // attribute
//
//	    thrower.ifParameterMissing( "aSbaSubAuxDMO.actUseLe",
//	      aSbaSubAuxDMO.getActUseLe(  ) ); // attribute
//
//	    thrower.ifParameterMissing( "aSbaSubAuxDMO.actSegment",
//	      aSbaSubAuxDMO.getActSegment(  ) ); // attribute

	    SbaSubAuxDMO updateSbaSubAuxDMO = new SbaSubAuxDMO(  );

	    updateSbaSubAuxDMO.setSbaSubscriberId(aSbaSubAuxDMO.getSbaSubscriberId());

	    updateSbaSubAuxDMO = get( updateSbaSubAuxDMO );

	    //
	    // For each relationship to single objects (does not matter if they are Embedded or Flattened)
	    // either associate to a pre-existing object, or create an object then associate to it
	    //

	    //
	    // Copy the fields to be updated. We do not want to overwrite primary keys etc.
	    // All attributes stereotyped as being <NotModifiable> are skipped
	    //
//	    updateSbaSubAuxDMO.setActAccType( aSbaSubAuxDMO.getActAccType(  ) );
//
//	    updateSbaSubAuxDMO.setActMnpType( aSbaSubAuxDMO.getActMnpType(  ) );
//
//	    updateSbaSubAuxDMO.setActUseLe( aSbaSubAuxDMO.getActUseLe(  ) );
//
//	    updateSbaSubAuxDMO.setActSegment( aSbaSubAuxDMO.getActSegment(  ) );

	    //
	    // Modify the sbaSubAuxDMO
	    //
	    sbaSubAuxDAC.modify( updateSbaSubAuxDMO );

	    // Create a new SbaSubAuxDMO, set keys, and fetch from the database...
	    SbaSubAuxDMO returnSbaSubAuxDMO = new SbaSubAuxDMO(  );

	    returnSbaSubAuxDMO.setSbaSubscriberId(updateSbaSubAuxDMO.getSbaSubscriberId());

	    returnSbaSubAuxDMO = get( returnSbaSubAuxDMO );

	    return returnSbaSubAuxDMO;
	  }
	  //==================================================================================================


	  public void modify( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "modify( filter )" );

	    //
	    // Modify the sbaSubAuxDMO
	    //
	    sbaSubAuxDAC.modify( filter );
	  }
	//==================================================================================================

	  public void delete( SbaSubAuxDMO sbaSubAuxDMO )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "delete( sbaSubAuxDMO )" );

	    thrower.ifParameterMissing( "sbaSubAuxDMO", sbaSubAuxDMO );

	    SbaSubAuxDMO updateSbaSubAuxDMO = null;

	    updateSbaSubAuxDMO = get( sbaSubAuxDMO );

	    // delete self...
	    sbaSubAuxDAC.delete( sbaSubAuxDMO );
	  }
	//==================================================================================================

	  public void delete( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "delete( filter )" );

	    thrower.ifParameterMissing( "filter", filter );

	    // delete...
	    sbaSubAuxDAC.delete( filter );
	  }
	  //==================================================================================================

	  public boolean exists( SbaSubAuxDMO sbaSubAuxDMO )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "exists(sbaSubAuxDMO)" );

	    thrower.ifParameterMissing( "sbaSubAuxDMO", sbaSubAuxDMO );

	    thrower.ifParameterMissing( "sbaSubAuxDMO.getSbaSubscriberId",
	      sbaSubAuxDMO.getSbaSubscriberId());

	    return sbaSubAuxDAC.exists( sbaSubAuxDMO );
	  }
	  //==================================================================================================


	  public boolean exists( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "exists(filter)" );

	    return sbaSubAuxDAC.exists( filter );
	  }
	  //==================================================================================================


//	  public DTOList getList(
//	    DTOListState state,
//	    QueryFilter  filter )
//	    throws EPPIXBusinessException, EPPIXUnexpectedException,
//	      EPPIXFatalException {
//	    logger.debug( "getList( state, filter )" );
//
//	    return sbaSubAuxDAC.getList( state, filter );
//	  }


	  public DAOIterator iterate( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "iterate( filter )" );

	    return sbaSubAuxDAC.iterate( filter );
	  }
	  //==================================================================================================


	  public DAOIterator iterateWithLock( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "iterateWithLock( filter )" );

	    return sbaSubAuxDAC.iterateWithLock( filter );
	  }
	  //==================================================================================================


	  public SbaSubAuxDMO get( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "get( filter )" );

	    //
	    // Check mandatory parameters.
	    //
	    thrower.ifParameterMissing( "filter", filter );

	    //
	    // Attempt to get the SbaSubAuxDMO
	    //
	    SbaSubAuxDMO sbaSubAuxDMO = sbaSubAuxDAC.get( filter );

	    return sbaSubAuxDMO;
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

	    return sbaSubAuxDAC.max( filter );
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

	    return sbaSubAuxDAC.min( filter );
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

	    return Integer.valueOf(sbaSubAuxDAC.count( filter ));
	  }
	  //==================================================================================================



}