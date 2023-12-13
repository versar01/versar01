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

public class BlhBillLimitHdAbstractBLO extends BaseBLO
implements DTOActionTypes, BaseMessages{

	static Thrower thrower = Thrower.getThrower( BtcBatchControlAbstractBLO.class );
	protected static final String ENTITY_ID = "BLH";

	protected BlhBillLimitHdDAC blhBillLimitHdDAC;
	protected Logger logger = thrower.getLogger(  );
	  
	  
	protected Class getDACClass() {
		return BlhBillLimitHdDAC.class;
	}

	protected void setDAC(DAC dac) {
		this.blhBillLimitHdDAC = (BlhBillLimitHdDAC)dac;
	}

	 public BlhBillLimitHdDMO get( BlhBillLimitHdDMO blhBillLimitHdDMO )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "get(blhBillLimitHdDMO)" );

	    //
	    // Check mandatory parameters.
	    //
	    thrower.ifParameterMissing( "blhBillLimitHdDMO", blhBillLimitHdDMO );

	    //
	    // Each attribute that is part of the primary key is mandatory
	    //
	    thrower.ifParameterMissing( "blhBillLimitHdDMO.blhSubscriberId",
	      blhBillLimitHdDMO.getBlhSubscriberId() );

//	    thrower.ifParameterMissing( "blhBillLimitHdDMO.blhServiceCode",
//	      blhBillLimitHdDMO.getBlhServiceCode());

	    //
	    // Attempt to get the BlhBillLimitHdDMO
	    //
	    BlhBillLimitHdDMO returnBlhBillLimitHdDMO = blhBillLimitHdDAC.get( blhBillLimitHdDMO );

	    //
	    // Could not find the BlhBillLimitHdDMO
	    //
	    if ( returnBlhBillLimitHdDMO == null ) {
	      thrower.business( Base_BLHBILLLIMITHD_000,
	        new Object[] {
	          blhBillLimitHdDMO.getBlhSubscriberId(),
	          blhBillLimitHdDMO.getBlhServiceCode()
	        } );
	    }

	    return returnBlhBillLimitHdDMO;
	  }

//	  public DTOList getList( 
//	    DTOListState       state,
//	    BlhBillLimitHdDMO blhBillLimitHdDMO )
//	    throws EPPIXBusinessException, EPPIXUnexpectedException,
//	      EPPIXFatalException {
//	    logger.debug( "getList( state, blhBillLimitHdDMO )" );
//
//	    return blhBillLimitHdDAC.getList( state, blhBillLimitHdDMO );
//	  }

	  public BlhBillLimitHdDMO create( BlhBillLimitHdDMO blhBillLimitHdDMO )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "create( blhBillLimitHdDMO )" );

	    thrower.ifParameterMissing( "blhBillLimitHdDMO", blhBillLimitHdDMO );

	    thrower.ifParameterMissing( "blhBillLimitHdDMO.blhSubscriberId",
	      blhBillLimitHdDMO.getBlhSubscriberId());

	    thrower.ifParameterMissing( "blhBillLimitHdDMO.blhServiceCode",
	      blhBillLimitHdDMO.getBlhServiceCode());

	    if ( exists( blhBillLimitHdDMO ) ) {
	      thrower.business( Base_BTCBATCHCONTROL_001,
	        new Object[] {
	          blhBillLimitHdDMO.getBlhSubscriberId(),
	          blhBillLimitHdDMO.getBlhServiceCode()
	        } );
	    }

	    blhBillLimitHdDAC.create( blhBillLimitHdDMO );

	    return blhBillLimitHdDMO;
	  }

	  public BlhBillLimitHdDMO modify( BlhBillLimitHdDMO aBlhBillLimitHdDMO )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "modify( ablhBillLimitHdDMO )" );

	    //
	    // Check mandatory parameters (
	    //
	    // Note: attributes stereotyped <NotModifiable> are ignored
	    //
	    thrower.ifParameterMissing( "ablhBillLimitHdDMO", aBlhBillLimitHdDMO );

	    thrower.ifParameterMissing( "aBlhBillLimitHdDMO.blhSubscriberId",
	      aBlhBillLimitHdDMO.getBlhSubscriberId()); // attribute

	    thrower.ifParameterMissing( "aBlhBillLimitHdDMO.blhServiceCode",
	      aBlhBillLimitHdDMO.getBlhServiceCode()); // attribute

	    BlhBillLimitHdDMO updateBlhBillLimitHdDMO = new BlhBillLimitHdDMO(  );

	    updateBlhBillLimitHdDMO.setBlhSubscriberId( aBlhBillLimitHdDMO.getBlhSubscriberId());

	    updateBlhBillLimitHdDMO.setBlhServiceCode(aBlhBillLimitHdDMO.getBlhServiceCode());

	    updateBlhBillLimitHdDMO = get( updateBlhBillLimitHdDMO );

	    //
	    // For each relationship to single objects (does not matter if they are Embedded or Flattened)
	    // either associate to a pre-existing object, or create an object then associate to it
	    //

	    //
	    // Copy the fields to be updated. We do not want to overwrite primary keys etc.
	    // All attributes stereotyped as being <NotModifiable> are skipped
	    //
	    updateBlhBillLimitHdDMO.setBlhSubscriberId(aBlhBillLimitHdDMO.getBlhSubscriberId());
	    updateBlhBillLimitHdDMO.setBlhServiceCode(aBlhBillLimitHdDMO.getBlhServiceCode());
	    updateBlhBillLimitHdDMO.setBlhBillLimitVal(aBlhBillLimitHdDMO.getBlhBillLimitVal());
	    updateBlhBillLimitHdDMO.setBlhLevel(aBlhBillLimitHdDMO.getBlhLevel());
	    updateBlhBillLimitHdDMO.setBlhType(aBlhBillLimitHdDMO.getBlhType());
	    updateBlhBillLimitHdDMO.setBlhVatInd(aBlhBillLimitHdDMO.getBlhVatInd());
	    updateBlhBillLimitHdDMO.setBlhUnbillUsage(aBlhBillLimitHdDMO.getBlhUnbillUsage());
	    updateBlhBillLimitHdDMO.setBlhUnbillCharges(aBlhBillLimitHdDMO.getBlhUnbillCharges());
	    updateBlhBillLimitHdDMO.setBlhDiff(aBlhBillLimitHdDMO.getBlhDiff());
	    updateBlhBillLimitHdDMO.setBlhUserStatus(aBlhBillLimitHdDMO.getBlhUserStatus());
	    updateBlhBillLimitHdDMO.setBlhNextThreshold(aBlhBillLimitHdDMO.getBlhNextThreshold());
	    updateBlhBillLimitHdDMO.setBlhPrevThreshold(aBlhBillLimitHdDMO.getBlhPrevThreshold());
	    updateBlhBillLimitHdDMO.setBlhNextacnId(aBlhBillLimitHdDMO.getBlhNextacnId());
	    updateBlhBillLimitHdDMO.setBlhPrevacnId(aBlhBillLimitHdDMO.getBlhPrevacnId());
	    updateBlhBillLimitHdDMO.setBlhNetworkAcn(aBlhBillLimitHdDMO.getBlhNetworkAcn());
	    updateBlhBillLimitHdDMO.setBlhTrigFlag(aBlhBillLimitHdDMO.getBlhTrigFlag());
	    updateBlhBillLimitHdDMO.setBlhLastUpdate(aBlhBillLimitHdDMO.getBlhLastUpdate());

	    //
	    // Modify the blhBillLimitHdDMO
	    //
	    blhBillLimitHdDAC.modify( updateBlhBillLimitHdDMO );

	    // Create a new DMO, set keys, and fetch from the database...
	    BlhBillLimitHdDMO returnBlhBillLimitHdDMO = new BlhBillLimitHdDMO(  );

	    returnBlhBillLimitHdDMO.setBlhSubscriberId(updateBlhBillLimitHdDMO.getBlhSubscriberId());

	    returnBlhBillLimitHdDMO.setBlhServiceCode(updateBlhBillLimitHdDMO.getBlhServiceCode());

	    returnBlhBillLimitHdDMO = get( returnBlhBillLimitHdDMO );

	    return returnBlhBillLimitHdDMO;
	  }

	  public void modify( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "modify( filter )" );

	    blhBillLimitHdDAC.modify( filter );
	  }

	  public void delete( BlhBillLimitHdDMO blhBillLimitHdDMO )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "delete( blhBillLimitHdDMO )" );

	    thrower.ifParameterMissing( "blhBillLimitHdDMO", blhBillLimitHdDMO );

	    BlhBillLimitHdDMO updateBlhBillLimitHdDMO = null;

	    updateBlhBillLimitHdDMO = get( blhBillLimitHdDMO );

	    blhBillLimitHdDAC.delete( blhBillLimitHdDMO );
	  }

	  public void delete( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "delete( filter )" );

	    thrower.ifParameterMissing( "filter", filter );

	    // delete...
	    blhBillLimitHdDAC.delete( filter );
	  }

	  public boolean exists( BlhBillLimitHdDMO blhBillLimitHdDMO )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "exists(btcBatchControl)" );

	    thrower.ifParameterMissing( "blhBillLimitHdDMO", blhBillLimitHdDMO );

	    thrower.ifParameterMissing( "blhBillLimitHdDMO.blhSubscriberId",
	      blhBillLimitHdDMO.getBlhSubscriberId());

	    thrower.ifParameterMissing( "blhBillLimitHdDMO.blhServiceCode",
	      blhBillLimitHdDMO.getBlhServiceCode());

	    return blhBillLimitHdDAC.exists( blhBillLimitHdDMO );
	  }

	  public boolean exists( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "exists(filter)" );

	    return blhBillLimitHdDAC.exists( filter );
	  }

//	  public DTOList getList( 
//	    DTOListState state,
//	    QueryFilter  filter )
//	    throws EPPIXBusinessException, EPPIXUnexpectedException,
//	      EPPIXFatalException {
//	    logger.debug( "getList( state, filter )" );
//
//	    return blhBillLimitHdDAC.getList( state, filter );
//	  }

	  public DAOIterator iterate( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "iterate( filter )" );

	    return blhBillLimitHdDAC.iterate( filter );
	  }

	  public DAOIterator iterateWithLock( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "iterateWithLock( filter )" );

	    return blhBillLimitHdDAC.iterateWithLock( filter );
	  }

	  public BlhBillLimitHdDMO get( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "get( filter )" );

	    thrower.ifParameterMissing( "filter", filter );

	    BlhBillLimitHdDMO blhBillLimitHdDMO = blhBillLimitHdDAC.get( filter );

	    return blhBillLimitHdDMO;
	  }

	  public Object max( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "max( filter )" );

	    thrower.ifParameterMissing( "filter", filter );

	    return blhBillLimitHdDAC.max( filter );
	  }

	  public Object min( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "min( filter )" );

	    thrower.ifParameterMissing( "filter", filter );

	    return blhBillLimitHdDAC.min( filter );
	  }

	  public Integer count( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "count( filter )" );
	    thrower.ifParameterMissing( "filter", filter );

	    return new Integer(blhBillLimitHdDAC.count( filter));
	  }

	  
}
