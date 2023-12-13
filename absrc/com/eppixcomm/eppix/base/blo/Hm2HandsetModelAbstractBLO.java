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



public class Hm2HandsetModelAbstractBLO extends BaseBLO
implements DTOActionTypes, BaseMessages {
	  static Thrower thrower = Thrower.getThrower( Hm2HandsetModelAbstractBLO.class );
	  protected static final String ENTITY_ID = "HM2";
	  protected Hm2HandsetModelDAC hm2HandsetModelDAC;
	  protected Logger logger = thrower.getLogger(  );
	  
	protected Class getDACClass() {
		// TODO Auto-generated method stub
		return Hm2HandsetModelDAC.class;
	}
	protected void setDAC(DAC dac) {
		this.hm2HandsetModelDAC = (Hm2HandsetModelDAC)dac;
	}


	  public Hm2HandsetModelDMO get( Hm2HandsetModelDMO hm2HandsetModelDMO )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "get(hm2HandsetModelDMO)" );

	    //
	    // Check mandatory parameters.
	    //
	    thrower.ifParameterMissing( "hm2HandsetModelDMO", hm2HandsetModelDMO );

	    //
	    // Each attribute that is part of the primary key is mandatory
	    //
	    thrower.ifParameterMissing( "hm2HandsetModelDMO.hm2ModelId",
	      hm2HandsetModelDMO.getHm2ModelId());

	    //
	    // Attempt to get the Hm2HandsetModelDMO
	    //
	    Hm2HandsetModelDMO returnHm2HandsetModelDMO = hm2HandsetModelDAC.get( hm2HandsetModelDMO );

	    //
	    // Could not find the Hm2HandsetModelDMO
	    //
	    if ( returnHm2HandsetModelDMO == null ) {
	      thrower.business( Base_HM2HANDSETMODEL_000,
	        new Object[] { hm2HandsetModelDMO.getHm2ModelId()} );
	    }

	    //
	    // Now, based on the values of the flags on this method signature, which in turn,
	    // are based on this objects associations, get all associated, embedded objects
	    //
	    return returnHm2HandsetModelDMO;
	  }
	  //==================================================================================================


	  public DTOList getList(
	    DTOListState   state,
	    Hm2HandsetModelDMO hm2HandsetModelDMO )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "getList( state, hm2HandsetModelDMO )" );

	    return hm2HandsetModelDAC.getList( state, hm2HandsetModelDMO );
	  }


	  public Hm2HandsetModelDMO create( Hm2HandsetModelDMO hm2HandsetModelDMO )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "create( hm2HandsetModelDMO )" );

	    thrower.ifParameterMissing( "hm2HandsetModelDMO", hm2HandsetModelDMO );

	    thrower.ifParameterMissing( "hm2HandsetModelDMO.hm2ModelId",
	      hm2HandsetModelDMO.getHm2ModelId() );

	    thrower.ifParameterMissing( "hm2HandsetModelDMO.hm2ManuId",
	      hm2HandsetModelDMO.getHm2ManuId() );

	    thrower.ifParameterMissing( "hm2HandsetModelDMO.hm2Model",
	      hm2HandsetModelDMO.getHm2Model() );

	    thrower.ifParameterMissing( "hm2HandsetModelDMO.hm2ActiveInd",
	      hm2HandsetModelDMO.getHm2ActiveInd());


	    //
	    // Check that this object does not already exist
	    //
	    if ( exists( hm2HandsetModelDMO ) ) {
	      thrower.business( Base_HM2HANDSETMODEL_001,
	        new Object[] { hm2HandsetModelDMO.getHm2ModelId() } );
	    }

	    //
	    // Now create the record
	    //
	    hm2HandsetModelDAC.create( hm2HandsetModelDMO );

	    return hm2HandsetModelDMO;
	  }

//	  public Hm2HandsetModelDMO modify( Hm2HandsetModelDMO aHm2HandsetModelDMO )
//	    throws EPPIXBusinessException, EPPIXUnexpectedException,
//	      EPPIXFatalException {
//	    logger.debug( "modify( ahm2HandsetModelDMO )" );
//
//	    //
//	    // Check mandatory parameters (
//	    //
//	    // Note: attributes stereotyped <NotModifiable> are ignored
//	    //
//	    thrower.ifParameterMissing( "ahm2HandsetModelDMO", aHm2HandsetModelDMO );
//
//	    thrower.ifParameterMissing( "aHm2HandsetModelDMO.hm2ModelId",
//	      aHm2HandsetModelDMO.getHm2ModelId() ); // attribute
//
//	    thrower.ifParameterMissing( "aHm2HandsetModelDMO.hm2ManuId",
//	      aHm2HandsetModelDMO.getHm2ManuId() ); // attribute
//
//	    thrower.ifParameterMissing( "aHm2HandsetModelDMO.hm2Model",
//	      aHm2HandsetModelDMO.getHm2Model() ); // attribute
//
//	    thrower.ifParameterMissing( "aHm2HandsetModelDMO.hm2ActiveInd",
//	      aHm2HandsetModelDMO.getHm2ActiveInd() ); // attribute
//
//	    Hm2HandsetModelDMO updateHm2HandsetModelDMO = new Hm2HandsetModelDMO(  );
//
//	    updateHm2HandsetModelDMO.setHm2ModelId( aHm2HandsetModelDMO.getHm2ModelId() );
//
//	    updateHm2HandsetModelDMO = get( updateHm2HandsetModelDMO );
//
//	    //
//	    // For each relationship to single objects (does not matter if they are Embedded or Flattened)
//	    // either associate to a pre-existing object, or create an object then associate to it
//	    //
//
//	    //
//	    // Copy the fields to be updated. We do not want to overwrite primary keys etc.
//	    // All attributes stereotyped as being <NotModifiable> are skipped
//	    //
//	    updateHm2HandsetModelDMO.setHm2ModelId(aHm2HandsetModelDMO.getHm2ModelId() );
//
//	    updateHm2HandsetModelDMO.setHm2ManuId(aHm2HandsetModelDMO.getHm2ManuId() );
//
//	    updateHm2HandsetModelDMO.setHm2Model( aHm2HandsetModelDMO.getHm2Model() );
//
//	    updateHm2HandsetModelDMO.setHm2ActiveInd( aHm2HandsetModelDMO.getHm2ActiveInd() );
//
//	    //
//	    // Modify the hm2HandsetModelDMO
//	    //
//	    hm2HandsetModelDAC.modify( updateHm2HandsetModelDMO );
//
//	    // Create a new Hm2HandsetModelDMO, set keys, and fetch from the database...
//	    Hm2HandsetModelDMO returnHm2HandsetModelDMO = new Hm2HandsetModelDMO(  );
//
//	    returnHm2HandsetModelDMO.setHm2ModelId( updateHm2HandsetModelDMO.getHm2ModelId() );
//
//	    returnHm2HandsetModelDMO = get( returnHm2HandsetModelDMO );
//
//	    return returnHm2HandsetModelDMO;
//	  }
	  //==================================================================================================


	  public void modify( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "modify( filter )" );

	    //
	    // Modify the hm2HandsetModelDMO
	    //
	    hm2HandsetModelDAC.modify( filter );
	  }
	//==================================================================================================

	  public void delete( Hm2HandsetModelDMO hm2HandsetModelDMO )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "delete( hm2HandsetModelDMO )" );

	    thrower.ifParameterMissing( "hm2HandsetModelDMO", hm2HandsetModelDMO );

	    Hm2HandsetModelDMO updateHm2HandsetModelDMO = null;

	    updateHm2HandsetModelDMO = get( hm2HandsetModelDMO );

	    // delete self...
	    hm2HandsetModelDAC.delete( hm2HandsetModelDMO );
	  }
	//==================================================================================================

	  public void delete( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "delete( filter )" );

	    thrower.ifParameterMissing( "filter", filter );

	    // delete...
	    hm2HandsetModelDAC.delete( filter );
	  }
	  //==================================================================================================

	  public boolean exists( Hm2HandsetModelDMO hm2HandsetModelDMO )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "exists(hm2HandsetModelDMO)" );

	    thrower.ifParameterMissing( "hm2HandsetModelDMO", hm2HandsetModelDMO );

	    thrower.ifParameterMissing( "hm2HandsetModelDMO.hm2ModelId",
	      hm2HandsetModelDMO.getHm2ModelId() );

	    return hm2HandsetModelDAC.exists( hm2HandsetModelDMO );
	  }
	  //==================================================================================================


	  public boolean exists( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "exists(filter)" );

	    return hm2HandsetModelDAC.exists( filter );
	  }
	  //==================================================================================================


	  public DTOList getList(
	    DTOListState state,
	    QueryFilter  filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "getList( state, filter )" );

	    return hm2HandsetModelDAC.getList( state, filter );
	  }


	  public DAOIterator iterate( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "iterate( filter )" );

	    return hm2HandsetModelDAC.iterate( filter );
	  }
	  //==================================================================================================


	  public DAOIterator iterateWithLock( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "iterateWithLock( filter )" );

	    return hm2HandsetModelDAC.iterateWithLock( filter );
	  }
	  //==================================================================================================


	  public Hm2HandsetModelDMO get( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "get( filter )" );

	    //
	    // Check mandatory parameters.
	    //
	    thrower.ifParameterMissing( "filter", filter );

	    //
	    // Attempt to get the Hm2HandsetModelDMO
	    //
	    Hm2HandsetModelDMO hm2HandsetModelDMO = hm2HandsetModelDAC.get( filter );

	    return hm2HandsetModelDMO;
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

	    return hm2HandsetModelDAC.max( filter );
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

	    return hm2HandsetModelDAC.min( filter );
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

	    return Integer.valueOf(hm2HandsetModelDAC.count( filter ));
	  }
	  //==================================================================================================	  



}