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



public class SfeSimFutEventAbstractBLO extends BaseBLO
implements DTOActionTypes, BaseMessages{


	  /** DOCUMENT ME! */
	  static Thrower thrower = Thrower.getThrower( SfeSimFutEventAbstractBLO.class );
	  /** DOCUMENT ME! */
	  protected static final String ENTITY_ID = "DOTT";

	  /** Data Access Controller. */
	  protected SfeSimFutEventDAC sfeSimFutEventDAC;
	  /** DOCUMENT ME! */
	  protected Logger logger = thrower.getLogger(  );

	  /** Invoked by the BLOBinder to provide this BLO with its DAC. */
	  protected void setDAC( DAC dac ) {
	    this.sfeSimFutEventDAC = (SfeSimFutEventDAC) dac;
	  }

		protected Class getDACClass() {
			return SfeSimFutEventDAC.class;
		}

	  public SfeSimFutEventDMO get( SfeSimFutEventDMO sfeSimFutEventDMO )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "get(sfeSimFutEventDMO)" );

	    //
	    // Check mandatory parameters.
	    //
	    thrower.ifParameterMissing( "sfeSimFutEventDMO", sfeSimFutEventDMO );

	    //
	    // Each attribute that is part of the primary key is mandatory
	    //
	    thrower.ifParameterMissing( "sfeSimFutEventDMO.sfeServiceCode",
	      sfeSimFutEventDMO.getSfeServiceCode() );

	    //
	    // Attempt to get the SfeSimFutEventDMO
	    //
	    SfeSimFutEventDMO returnSfeSimFutEventDMO = sfeSimFutEventDAC.get( sfeSimFutEventDMO );

	    //
	    // Could not find the SfeSimFutEventDMO
	    //
	    if ( returnSfeSimFutEventDMO == null ) {
	      thrower.business( Base_SFESIMFUTEVENT_000,
	        new Object[] { sfeSimFutEventDMO.getSfeServiceCode() } );
	    }

	    //
	    // Now, based on the values of the flags on this method signature, which in turn,
	    // are based on this objects associations, get all associated, embedded objects
	    //
	    return returnSfeSimFutEventDMO;
	  }
	  //==================================================================================================


	  public DTOList getList(
	    DTOListState   state,
	    SfeSimFutEventDMO sfeSimFutEventDMO )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "getList( state, sfeSimFutEventDMO )" );

	    return sfeSimFutEventDAC.getList( state, sfeSimFutEventDMO );
	  }


	  public SfeSimFutEventDMO create( SfeSimFutEventDMO sfeSimFutEventDMO )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "create( sfeSimFutEventDMO )" );

	    thrower.ifParameterMissing( "sfeSimFutEventDMO", sfeSimFutEventDMO );

	    thrower.ifParameterMissing( "sfeSimFutEventDMO.SfeCommand",
	      sfeSimFutEventDMO.getSfeCommand());

	    thrower.ifParameterMissing( "sfeSimFutEventDMO.SfeErrorComment",
	      sfeSimFutEventDMO.getSfeErrorComment() );

	    thrower.ifParameterMissing( "sfeSimFutEventDMO.SfeFutEventId",
	      sfeSimFutEventDMO.getSfeFutEventId() );

	    thrower.ifParameterMissing( "sfeSimFutEventDMO.SfeMsisdnNo",
	      sfeSimFutEventDMO.getSfeMsisdnNo() );

	    thrower.ifParameterMissing( "sfeSimFutEventDMO.SfeServiceCode",
	      sfeSimFutEventDMO.getSfeServiceCode() );

	    thrower.ifParameterMissing( "sfeSimFutEventDMO.SfeSimNo",
	  	      sfeSimFutEventDMO.getSfeSimNo() );

	    thrower.ifParameterMissing( "sfeSimFutEventDMO.SfeDventDate",
	  	      sfeSimFutEventDMO.getSfeDventDate() );

	    thrower.ifParameterMissing( "sfeSimFutEventDMO.SfeOrigStatus",
	  	      sfeSimFutEventDMO.getSfeOrigStatus() );

	    thrower.ifParameterMissing( "sfeSimFutEventDMO.SfeOrigStatus",
	  	      sfeSimFutEventDMO.getSfeOrigStatus() );

	    thrower.ifParameterMissing( "sfeSimFutEventDMO.SfeSubscriberId",
	  	      sfeSimFutEventDMO.getSfeSubscriberId());


	    //
	    // Check that this object does not already exist
	    //
	    if ( exists( sfeSimFutEventDMO ) ) {
	      thrower.business( Base_SFESIMFUTEVENT_001,
	        new Object[] { sfeSimFutEventDMO.getSfeServiceCode() } );
	    }

	    //
	    // Now create the record
	    //
	    sfeSimFutEventDAC.create( sfeSimFutEventDMO );

	    return sfeSimFutEventDMO;
	  }

	  public SfeSimFutEventDMO modify( SfeSimFutEventDMO sfeSimFutEventDMO )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "modify( asfeSimFutEventDMO )" );

	    //
	    // Check mandatory parameters (
	    //
	    // Note: attributes stereotyped <NotModifiable> are ignored
	    //
	    thrower.ifParameterMissing( "sfeSimFutEventDMO", sfeSimFutEventDMO );

	    thrower.ifParameterMissing( "sfeSimFutEventDMO", sfeSimFutEventDMO );

	    thrower.ifParameterMissing( "sfeSimFutEventDMO.SfeCommand",
	      sfeSimFutEventDMO.getSfeCommand());

	    thrower.ifParameterMissing( "sfeSimFutEventDMO.SfeErrorComment",
	      sfeSimFutEventDMO.getSfeErrorComment() );

	    thrower.ifParameterMissing( "sfeSimFutEventDMO.SfeFutEventId",
	      sfeSimFutEventDMO.getSfeFutEventId() );

	    thrower.ifParameterMissing( "sfeSimFutEventDMO.SfeMsisdnNo",
	      sfeSimFutEventDMO.getSfeMsisdnNo() );

	    thrower.ifParameterMissing( "sfeSimFutEventDMO.SfeServiceCode",
	      sfeSimFutEventDMO.getSfeServiceCode() );

	    thrower.ifParameterMissing( "sfeSimFutEventDMO.SfeSimNo",
	  	      sfeSimFutEventDMO.getSfeSimNo() );

	    thrower.ifParameterMissing( "sfeSimFutEventDMO.SfeDventDate",
	  	      sfeSimFutEventDMO.getSfeDventDate() );

	    thrower.ifParameterMissing( "sfeSimFutEventDMO.SfeOrigStatus",
	  	      sfeSimFutEventDMO.getSfeOrigStatus() );

	    thrower.ifParameterMissing( "sfeSimFutEventDMO.SfeOrigStatus",
	  	      sfeSimFutEventDMO.getSfeOrigStatus() );

	    thrower.ifParameterMissing( "sfeSimFutEventDMO.SfeSubscriberId",
	  	      sfeSimFutEventDMO.getSfeSubscriberId());

	    SfeSimFutEventDMO updateSfeSimFutEventDMO = new SfeSimFutEventDMO(  );

	    updateSfeSimFutEventDMO.setSfeServiceCode(sfeSimFutEventDMO.getSfeServiceCode() );

	    updateSfeSimFutEventDMO = get( updateSfeSimFutEventDMO );

	    //
	    // For each relationship to single objects (does not matter if they are Embedded or Flattened)
	    // either associate to a pre-existing object, or create an object then associate to it
	    //

	    //
	    // Copy the fields to be updated. We do not want to overwrite primary keys etc.
	    // All attributes stereotyped as being <NotModifiable> are skipped
	    //
	    updateSfeSimFutEventDMO.setSfeCommand(sfeSimFutEventDMO.getSfeCommand() );

	    updateSfeSimFutEventDMO.setSfeDventDate(sfeSimFutEventDMO.getSfeDventDate());

	    updateSfeSimFutEventDMO.setSfeErrorComment(sfeSimFutEventDMO.getSfeErrorComment());

	    updateSfeSimFutEventDMO.setSfeFutEventId(sfeSimFutEventDMO.getSfeFutEventId());

	    updateSfeSimFutEventDMO.setSfeMsisdnNo(sfeSimFutEventDMO.getSfeMsisdnNo());

	    updateSfeSimFutEventDMO.setSfeOrigStatus(sfeSimFutEventDMO.getSfeOrigStatus());

	    updateSfeSimFutEventDMO.setSfeServiceCode(sfeSimFutEventDMO.getSfeServiceCode());

	    updateSfeSimFutEventDMO.setSfeSimNo(sfeSimFutEventDMO.getSfeSimNo());

	    updateSfeSimFutEventDMO.setSfeSubscriberId(sfeSimFutEventDMO.getSfeSubscriberId());

	    updateSfeSimFutEventDMO.setSfeTimestamp(sfeSimFutEventDMO.getSfeTimestamp());

	    //
	    // Modify the sfeSimFutEventDMO
	    //
	    sfeSimFutEventDAC.modify( updateSfeSimFutEventDMO );

	    // Create a new SfeSimFutEventDMO, set keys, and fetch from the database...
	    SfeSimFutEventDMO returnSfeSimFutEventDMO = new SfeSimFutEventDMO(  );

	    returnSfeSimFutEventDMO.setSfeServiceCode(updateSfeSimFutEventDMO.getSfeServiceCode() );

	    returnSfeSimFutEventDMO = get( returnSfeSimFutEventDMO );

	    return returnSfeSimFutEventDMO;
	  }
	  //==================================================================================================


	  public void modify( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "modify( filter )" );

	    //
	    // Modify the sfeSimFutEventDMO
	    //
	    sfeSimFutEventDAC.modify( filter );
	  }
	//==================================================================================================

	  public void delete( SfeSimFutEventDMO sfeSimFutEventDMO )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "delete( sfeSimFutEventDMO )" );

	    thrower.ifParameterMissing( "sfeSimFutEventDMO", sfeSimFutEventDMO );

	    SfeSimFutEventDMO updateSfeSimFutEventDMO = null;

	    updateSfeSimFutEventDMO = get( sfeSimFutEventDMO );

	    // delete self...
	    sfeSimFutEventDAC.delete( sfeSimFutEventDMO );
	  }
	//==================================================================================================

	  public void delete( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "delete( filter )" );

	    thrower.ifParameterMissing( "filter", filter );

	    // delete...
	    sfeSimFutEventDAC.delete( filter );
	  }
	  //==================================================================================================

	  public boolean exists( SfeSimFutEventDMO sfeSimFutEventDMO )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "exists(sfeSimFutEventDMO)" );

	    thrower.ifParameterMissing( "sfeSimFutEventDMO", sfeSimFutEventDMO );

	    thrower.ifParameterMissing( "sfeSimFutEventDMO.sfeServiceCode",
	      sfeSimFutEventDMO.getSfeServiceCode() );

	    return sfeSimFutEventDAC.exists( sfeSimFutEventDMO );
	  }
	  //==================================================================================================


	  public boolean exists( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "exists(filter)" );

	    return sfeSimFutEventDAC.exists( filter );
	  }
	  //==================================================================================================


	  public DTOList getList(
	    DTOListState state,
	    QueryFilter  filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "getList( state, filter )" );

	    return sfeSimFutEventDAC.getList( state, filter );
	  }

	  //==================================================================================================


	  public DAOIterator iterate( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "iterate( filter )" );

	    return sfeSimFutEventDAC.iterate( filter );
	  }
	  //==================================================================================================


	  public DAOIterator iterateWithLock( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "iterateWithLock( filter )" );

	    return sfeSimFutEventDAC.iterateWithLock( filter );
	  }
	  //==================================================================================================


	  public SfeSimFutEventDMO get( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "get( filter )" );

	    //
	    // Check mandatory parameters.
	    //
	    thrower.ifParameterMissing( "filter", filter );

	    //
	    // Attempt to get the SfeSimFutEventDMO
	    //
	    SfeSimFutEventDMO sfeSimFutEventDMO = sfeSimFutEventDAC.get( filter );

	    return sfeSimFutEventDMO;
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

	    return sfeSimFutEventDAC.max( filter );
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

	    return sfeSimFutEventDAC.min( filter );
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

	    return Integer.valueOf(sfeSimFutEventDAC.count( filter ));
	  }
	  //==================================================================================================



}