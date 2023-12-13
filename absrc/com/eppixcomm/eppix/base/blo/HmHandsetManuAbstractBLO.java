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
import com.eppixcomm.eppix.common.util.FilterOp;
import com.eppixcomm.eppix.common.util.QueryFilter;


public class HmHandsetManuAbstractBLO extends BaseBLO
implements DTOActionTypes, BaseMessages {
	  static Thrower thrower = Thrower.getThrower( HmHandsetManuAbstractBLO.class );
	  protected static final String ENTITY_ID = "HM2";
	  protected HmHandsetManuDAC hmHandsetManuDAC;
	  protected Logger logger = thrower.getLogger(  );
	  
	protected Class getDACClass() {
		return HmHandsetManuDAC.class;
	}
	protected void setDAC(DAC dac) {
		this.hmHandsetManuDAC = (HmHandsetManuDAC)dac;
	}

	

//	  public HmHandsetManuDMO get( HmHandsetManuDMO hmHandsetManuDMO )
//	    throws EPPIXBusinessException, EPPIXUnexpectedException,
//	      EPPIXFatalException {
//	    logger.debug( "get(hmHandsetManuDMO)" );
//
//	    //
//	    // Check mandatory parameters.
//	    //
//	    thrower.ifParameterMissing( "hmHandsetManuDMO", hmHandsetManuDMO );
//
//	    //
//	    // Each attribute that is part of the primary key is mandatory
//	    //
//	    thrower.ifParameterMissing( "hmHandsetManuDMO.hmManuId",
//	      hmHandsetManuDMO.getHmManuId());
//
//	    thrower.ifParameterMissing( "hmHandsetManuDMO.hmDescription",
//	  	      hmHandsetManuDMO.getHmDescription());
//	    //
//	    // Attempt to get the HmHandsetManuDMO
//	    //
//	    HmHandsetManuDMO returnHmHandsetManuDMO = hmHandsetManuDAC.get( hmHandsetManuDMO );
//
//	    //
//	    // Could not find the HmHandsetManuDMO
//	    //
//	    if ( returnHmHandsetManuDMO == null ) {
//	      thrower.business( Base_HMHANDSETMANU_000,
//	        new Object[] { hmHandsetManuDMO.getHmManuId() } );
//	    }
//
//	    //
//	    // Now, based on the values of the flags on this method signature, which in turn,
//	    // are based on this objects associations, get all associated, embedded objects
//	    //
//	    return returnHmHandsetManuDMO;
//	  }
	  //==================================================================================================


	  public DTOList getList(
	    DTOListState   state,
	    HmHandsetManuDMO hmHandsetManuDMO )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "getList( state, hmHandsetManuDMO )" );

	    return hmHandsetManuDAC.getList( state, hmHandsetManuDMO );
	  }


	  public HmHandsetManuDMO create( HmHandsetManuDMO hmHandsetManuDMO )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "create( hmHandsetManuDMO )" );

	    thrower.ifParameterMissing( "hmHandsetManuDMO", hmHandsetManuDMO );

	    thrower.ifParameterMissing( "hmHandsetManuDMO.hmManuId",
	      hmHandsetManuDMO.getHmManuId());

	    thrower.ifParameterMissing( "hmHandsetManuDMO.hmDescription",
	      hmHandsetManuDMO.getHmDescription() );

	    //
	    // Check that this object does not already exist
	    //
	    if ( exists( hmHandsetManuDMO ) ) {
	      thrower.business( Base_HM2HANDSETMODEL_001,
	        new Object[] { hmHandsetManuDMO.getHmManuId()} );
	    }

	    //
	    // Now create the record
	    //
	    hmHandsetManuDAC.create( hmHandsetManuDMO );

	    return hmHandsetManuDMO;
	  }

	  public HmHandsetManuDMO modify( HmHandsetManuDMO aHmHandsetManuDMO )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "modify( ahmHandsetManuDMO )" );

	    //
	    // Check mandatory parameters (
	    //
	    // Note: attributes stereotyped <NotModifiable> are ignored
	    //
	    thrower.ifParameterMissing( "ahmHandsetManuDMO", aHmHandsetManuDMO );

	    thrower.ifParameterMissing( "aHmHandsetManuDMO.hmManuId",
	      aHmHandsetManuDMO.getHmManuId()); // attribute

	    thrower.ifParameterMissing( "aHmHandsetManuDMO.hmDescription",
	      aHmHandsetManuDMO.getHmDescription() ); // attribute

	    QueryFilter filter = new QueryFilter();
	    filter.add(FilterOp.SET, HmHandsetManuDMO.hmDescriptionFilter, aHmHandsetManuDMO.getHmDescription());
	    filter.add(FilterOp.EQUAL, HmHandsetManuDMO.hmManuIdFilter, aHmHandsetManuDMO.getHmManuId());
	    
	    modify( filter );

	    //
	    // Modify the hmHandsetManuDMO
	    //
	    hmHandsetManuDAC.modify( filter );

	    // Create a new HmHandsetManuDMO, set keys, and fetch from the database...
	    HmHandsetManuDMO returnHmHandsetManuDMO = null;

	    filter = new QueryFilter();
	    filter.add(FilterOp.EQUAL, HmHandsetManuDMO.hmManuIdFilter, aHmHandsetManuDMO.getHmManuId());

	    returnHmHandsetManuDMO = get( filter );

	    return returnHmHandsetManuDMO;
	  }
	  //==================================================================================================


	  public void modify( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "modify( filter )" );

	    //
	    // Modify the hmHandsetManuDMO
	    //
	    hmHandsetManuDAC.modify( filter );
	  }
	//==================================================================================================

	  public void delete( HmHandsetManuDMO hmHandsetManuDMO )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "delete( hmHandsetManuDMO )" );

	    thrower.ifParameterMissing( "hmHandsetManuDMO", hmHandsetManuDMO );

	    HmHandsetManuDMO updateHmHandsetManuDMO = null;

	    QueryFilter filter = new QueryFilter();
	    filter.add(FilterOp.EQUAL, HmHandsetManuDMO.hmManuIdFilter, hmHandsetManuDMO.getHmManuId());
//	    filter.add(FilterOp.EQUAL, HmHandsetManuDMO.hmDescriptionFilter, hmHandsetManuDMO.getHmDescription());
	    
	    updateHmHandsetManuDMO = get( filter );

	    // delete self...
	    hmHandsetManuDAC.delete( hmHandsetManuDMO );
	  }
	//==================================================================================================

	  public void delete( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "delete( filter )" );

	    thrower.ifParameterMissing( "filter", filter );

	    // delete...
	    hmHandsetManuDAC.delete( filter );
	  }
	  //==================================================================================================

	  public boolean exists( HmHandsetManuDMO hmHandsetManuDMO )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "exists(hmHandsetManuDMO)" );

	    thrower.ifParameterMissing( "hmHandsetManuDMO", hmHandsetManuDMO );

	    thrower.ifParameterMissing( "hmHandsetManuDMO.hmManuId",
	      hmHandsetManuDMO.getHmManuId());

	    return hmHandsetManuDAC.exists( hmHandsetManuDMO );
	  }
	  //==================================================================================================


	  public boolean exists( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "exists(filter)" );

	    return hmHandsetManuDAC.exists( filter );
	  }
	  //==================================================================================================


	  public DTOList getList(
	    DTOListState state,
	    QueryFilter  filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "getList( state, filter )" );

	    return hmHandsetManuDAC.getList( state, filter );
	  }
	//==================================================================================================
	  
	  public DAOIterator iterate( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "iterate( filter )" );

	    return hmHandsetManuDAC.iterate( filter );
	  }
	  //==================================================================================================


	  public DAOIterator iterateWithLock( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "iterateWithLock( filter )" );

	    return hmHandsetManuDAC.iterateWithLock( filter );
	  }
	  //==================================================================================================


	  public HmHandsetManuDMO get( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "get( filter )" );

	    //
	    // Check mandatory parameters.
	    //
	    thrower.ifParameterMissing( "filter", filter );

	    //
	    // Attempt to get the HmHandsetManuDMO
	    //
	    HmHandsetManuDMO hmHandsetManuDMO = hmHandsetManuDAC.get( filter );

	    return hmHandsetManuDMO;
	  }
	  //==================================================================================================


//	  public Object max( QueryFilter filter )
//	    throws EPPIXBusinessException, EPPIXUnexpectedException,
//	      EPPIXFatalException {
//	    logger.debug( "max( filter )" );
//
//	    //
//	    // Check mandatory parameters.
//	    //
//	    thrower.ifParameterMissing( "filter", filter );
//
//	    return hmHandsetManuDAC.max( filter );
//	  }
	  //==================================================================================================


//	  public Object min( QueryFilter filter )
//	    throws EPPIXBusinessException, EPPIXUnexpectedException,
//	      EPPIXFatalException {
//	    logger.debug( "min( filter )" );
//
//	    //
//	    // Check mandatory parameters.
//	    //
//	    thrower.ifParameterMissing( "filter", filter );
//
//	    return hmHandsetManuDAC.min( filter );
//	  }
	  //==================================================================================================


	  public Integer count( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "count( filter )" );

	    //
	    // Check mandatory parameters.
	    //
	    thrower.ifParameterMissing( "filter", filter );

	    return Integer.valueOf(hmHandsetManuDAC.count( filter ));
	  }
	  //==================================================================================================	


}