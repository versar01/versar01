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



public class SdSimDeactivateAbstractBLO extends BaseBLO
implements DTOActionTypes, BaseMessages{

	  /** DOCUMENT ME! */
	  static Thrower thrower = Thrower.getThrower( SdSimDeactivateAbstractBLO.class );
	  /** DOCUMENT ME! */
	  protected static final String ENTITY_ID = "DOTT";

	  /** Data Access Controller. */
	  protected SdSimDeactivateDAC sdSimDeactivateDAC;
	  /** DOCUMENT ME! */
	  protected Logger logger = thrower.getLogger(  );

	  /** Invoked by the BLOBinder to provide this BLO with its DAC. */
	  protected void setDAC( DAC dac ) {
	    this.sdSimDeactivateDAC = (SdSimDeactivateDAC) dac;
	  }

		protected Class getDACClass() {
			return SdSimDeactivateDAC.class;
		}

//	  public SdSimDeactivateDMO get( SdSimDeactivateDMO sdSimDeactivateDMO )
//	    throws EPPIXBusinessException, EPPIXUnexpectedException,
//	      EPPIXFatalException {
//	    logger.debug( "get(sdSimDeactivateDMO)" );
//
//	    //
//	    // Check mandatory parameters.
//	    //
//	    thrower.ifParameterMissing( "sdSimDeactivateDMO", sdSimDeactivateDMO );
//
//	    //
//	    // Each attribute that is part of the primary key is mandatory
//	    //
//	    thrower.ifParameterMissing( "sdSimDeactivateDMO.sdSimNo",
//	      sdSimDeactivateDMO.getSdSimNo());
//	    
//	    thrower.ifParameterMissing( "sdSimDeactivateDMO.sdDisconCharge1",
//	  	      sdSimDeactivateDMO.getSdDisconCharge1());
//	    
//	    thrower.ifParameterMissing( "sdSimDeactivateDMO.sdDisconCharge2",
//	  	      sdSimDeactivateDMO.getSdDisconCharge2());
//	    
//	    thrower.ifParameterMissing( "sdSimDeactivateDMO.sdDisconCharge3",
//	  	      sdSimDeactivateDMO.getSdDisconCharge3());
//	    
//	    thrower.ifParameterMissing( "sdSimDeactivateDMO.sdDisconCharge4",
//	  	      sdSimDeactivateDMO.getSdDisconCharge4());
//	    
//	    thrower.ifParameterMissing( "sdSimDeactivateDMO.sdDisconCharge5",
//	  	      sdSimDeactivateDMO.getSdDisconCharge5());
//	    
//	    thrower.ifParameterMissing( "sdSimDeactivateDMO.sdElCommand",
//	  	      sdSimDeactivateDMO.getSdElCommand());
//	    
//	    thrower.ifParameterMissing( "sdSimDeactivateDMO.sdErrorComment",
//	  	      sdSimDeactivateDMO.getSdErrorComment());
//	    
//	    thrower.ifParameterMissing( "sdSimDeactivateDMO.sdHandsetNo",
//	  	      sdSimDeactivateDMO.getSdHandsetNo());
//	    
//	    thrower.ifParameterMissing( "sdSimDeactivateDMO.sdLetterType",
//	  	      sdSimDeactivateDMO.getSdLetterType());
//	    
//	    thrower.ifParameterMissing( "sdSimDeactivateDMO.sdReason",
//	  	      sdSimDeactivateDMO.getSdReason());
//	    
//	    thrower.ifParameterMissing( "sdSimDeactivateDMO.sdStatCode",
//	  	      sdSimDeactivateDMO.getSdStatCode());
//	    
//	    thrower.ifParameterMissing( "sdSimDeactivateDMO.sdTransStatus",
//	  	      sdSimDeactivateDMO.getSdTransStatus());
//	    
//	    thrower.ifParameterMissing( "sdSimDeactivateDMO.sdDconnectDate",
//	  	      sdSimDeactivateDMO.getSdDconnectDate());
//	    
//	    thrower.ifParameterMissing( "sdSimDeactivateDMO.sdEppixStamp",
//	  	      sdSimDeactivateDMO.getSdEppixStamp());
//	    
//	    thrower.ifParameterMissing( "sdSimDeactivateDMO.sdProrataToDate",
//	  	      sdSimDeactivateDMO.getSdProrataToDate());
//	    
//	    thrower.ifParameterMissing( "sdSimDeactivateDMO.sdSubscriberId",
//	  	      sdSimDeactivateDMO.getSdSubscriberId());
//
//	    //
//	    // Attempt to get the SdSimDeactivateDMO
//	    //
//	    SdSimDeactivateDMO returnSdSimDeactivateDMO = sdSimDeactivateDAC.get( sdSimDeactivateDMO );
//
//	    //
//	    // Could not find the SdSimDeactivateDMO
//	    //
//	    if ( returnSdSimDeactivateDMO == null ) {
//	      thrower.business( Base_SDSIMDEACTIVATE_000,
//	        new Object[] { sdSimDeactivateDMO.getSdSubscriberId() } );
//	    }
//
//	    //
//	    // Now, based on the values of the flags on this method signature, which in turn,
//	    // are based on this objects associations, get all associated, embedded objects
//	    //
//	    return returnSdSimDeactivateDMO;
//	  }
	  //==================================================================================================


	  public DTOList getList(
	    DTOListState   state,
	    SdSimDeactivateDMO sdSimDeactivateDMO )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "getList( state, sdSimDeactivateDMO )" );

	    return sdSimDeactivateDAC.getList( state, sdSimDeactivateDMO );
	  }


	  public SdSimDeactivateDMO create( SdSimDeactivateDMO sdSimDeactivateDMO )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "create( sdSimDeactivateDMO )" );

	    thrower.ifParameterMissing( "sdSimDeactivateDMO", sdSimDeactivateDMO );

	    thrower.ifParameterMissing( "sdSimDeactivateDMO.sdSimNo",
	  	      sdSimDeactivateDMO.getSdSimNo());
	    
	    /**
	     * SJ: Changes check on mandatory parameters as well check for existence
	     *  for insert failing due to checks.
	     *  
	     *  Only left not null field as mandatory.
	     *  Change 28-11-2014 for STP Optimization
	     */
	  	    
  	    
	  	    thrower.ifParameterMissing( "sdSimDeactivateDMO.sdHandsetNo",
	  	  	      sdSimDeactivateDMO.getSdHandsetNo());
	  	    
	  	    
	  	    thrower.ifParameterMissing( "sdSimDeactivateDMO.sdStatCode",
	  	  	      sdSimDeactivateDMO.getSdStatCode());
	  	    
	  	    thrower.ifParameterMissing( "sdSimDeactivateDMO.sdTransStatus",
	  	  	      sdSimDeactivateDMO.getSdTransStatus());
	  	    
	  	    thrower.ifParameterMissing( "sdSimDeactivateDMO.sdHandsetNo",
		  	  	      sdSimDeactivateDMO.getSdHandsetNo());
	  	    
	  	    
	  	    thrower.ifParameterMissing( "sdSimDeactivateDMO.sdSubscriberId",
	  	  	      sdSimDeactivateDMO.getSdSubscriberId());

	    //
	    // Check that this object does not already exist
	    //
	  	    
	  	    
//	    if ( exists( sdSimDeactivateDMO ) ) {
//	      thrower.business( Base_SDSIMDEACTIVATE_001,
//	        new Object[] { sdSimDeactivateDMO.getSdSubscriberId() } );
//	    }

	    //
	    // Now create the record
	    //
	    sdSimDeactivateDAC.create( sdSimDeactivateDMO );

	    return sdSimDeactivateDMO;
	  }

	  public SdSimDeactivateDMO modify( SdSimDeactivateDMO sdSimDeactivateDMO )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "modify( asdSimDeactivateDMO )" );

	    //
	    // Check mandatory parameters (
	    //
	    // Note: attributes stereotyped <NotModifiable> are ignored
	    //
	    thrower.ifParameterMissing( "sdSimDeactivateDMO", sdSimDeactivateDMO );

	    thrower.ifParameterMissing( "sdSimDeactivateDMO.sdSimNo",
	  	      sdSimDeactivateDMO.getSdSimNo());
	  	    
 	    
  	    thrower.ifParameterMissing( "sdSimDeactivateDMO.sdTransStatus",
	  	  	      sdSimDeactivateDMO.getSdTransStatus());


	    thrower.ifParameterMissing( "sdSimDeactivateDMO.sdTransStatus",
	  	      sdSimDeactivateDMO.getSdTransStatus());
	    
	    
	    thrower.ifParameterMissing( "sdSimDeactivateDMO.sdSubscriberId",
	  	      sdSimDeactivateDMO.getSdSubscriberId());
	    
  	    thrower.ifParameterMissing( "sdSimDeactivateDMO.sdHandsetNo",
	  	  	      sdSimDeactivateDMO.getSdHandsetNo());

	    SdSimDeactivateDMO updateSdSimDeactivateDMO = new SdSimDeactivateDMO(  );
	        
		QueryFilter filter = new QueryFilter();
		filter.add(FilterOp.EQUAL, SdSimDeactivateDMO.sdSimNoFilter, sdSimDeactivateDMO.getSdSimNo());
		filter.add(FilterOp.EQUAL, SdSimDeactivateDMO.sdEppixStampFilter, sdSimDeactivateDMO.getSdEppixStamp());
		
		updateSdSimDeactivateDMO = get(filter);

	    //
	    // For each relationship to single objects (does not matter if they are Embedded or Flattened)
	    // either associate to a pre-existing object, or create an object then associate to it
	    //

	    //
	    // Copy the fields to be updated. We do not want to overwrite primary keys etc.
	    // All attributes stereotyped as being <NotModifiable> are skipped
	    //
	    updateSdSimDeactivateDMO.setSdSubscriberId(sdSimDeactivateDMO.getSdSubscriberId() );

	    updateSdSimDeactivateDMO.setSdDconnectDate(sdSimDeactivateDMO.getSdDconnectDate());

	    updateSdSimDeactivateDMO.setSdDisconCharge1(sdSimDeactivateDMO.getSdDisconCharge1());

	    updateSdSimDeactivateDMO.setSdDisconCharge2(sdSimDeactivateDMO.getSdDisconCharge2());

	    updateSdSimDeactivateDMO.setSdDisconCharge3(sdSimDeactivateDMO.getSdDisconCharge3());

	    updateSdSimDeactivateDMO.setSdDisconCharge4(sdSimDeactivateDMO.getSdDisconCharge4());

	    updateSdSimDeactivateDMO.setSdDisconCharge5(sdSimDeactivateDMO.getSdDisconCharge5());

	    updateSdSimDeactivateDMO.setSdElCommand(sdSimDeactivateDMO.getSdElCommand());

	    updateSdSimDeactivateDMO.setSdEppixStamp(sdSimDeactivateDMO.getSdEppixStamp());

	    updateSdSimDeactivateDMO.setSdErrorComment(sdSimDeactivateDMO.getSdErrorComment());

	    updateSdSimDeactivateDMO.setSdHandsetNo(sdSimDeactivateDMO.getSdHandsetNo());

	    updateSdSimDeactivateDMO.setSdLetterType(sdSimDeactivateDMO.getSdLetterType());

	    updateSdSimDeactivateDMO.setSdReason(sdSimDeactivateDMO.getSdReason());

	    updateSdSimDeactivateDMO.setSdSimNo(sdSimDeactivateDMO.getSdSimNo());

	    updateSdSimDeactivateDMO.setSdStatCode(sdSimDeactivateDMO.getSdStatCode());

	    updateSdSimDeactivateDMO.setSdTransStatus(sdSimDeactivateDMO.getSdTransStatus());

	    updateSdSimDeactivateDMO.setSdErrorComment(sdSimDeactivateDMO.getSdErrorComment());

	    updateSdSimDeactivateDMO.setSdHandsetNo(sdSimDeactivateDMO.getSdHandsetNo());
	    //
	    // Modify the sdSimDeactivateDMO
	    //
	    sdSimDeactivateDAC.modify( updateSdSimDeactivateDMO );

	    // Create a new SdSimDeactivateDMO, set keys, and fetch from the database...
	    SdSimDeactivateDMO returnSdSimDeactivateDMO = new SdSimDeactivateDMO(  );

	    returnSdSimDeactivateDMO.setSdSubscriberId(updateSdSimDeactivateDMO.getSdSubscriberId() );

		filter = new QueryFilter();
		filter.add(FilterOp.EQUAL, SdSimDeactivateDMO.sdSimNoFilter, sdSimDeactivateDMO.getSdSimNo());
		filter.add(FilterOp.EQUAL, SdSimDeactivateDMO.sdEppixStampFilter, sdSimDeactivateDMO.getSdEppixStamp());
		
		updateSdSimDeactivateDMO = get(filter);

	    return returnSdSimDeactivateDMO;
	  }
	  //==================================================================================================


	  public void modify( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "modify( filter )" );

	    //
	    // Modify the sdSimDeactivateDMO
	    //
	    sdSimDeactivateDAC.modify( filter );
	  }
	//==================================================================================================

	  public void delete( SdSimDeactivateDMO sdSimDeactivateDMO )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "delete( sdSimDeactivateDMO )" );

	    thrower.ifParameterMissing( "sdSimDeactivateDMO", sdSimDeactivateDMO );

	    SdSimDeactivateDMO updateSdSimDeactivateDMO = null;

		QueryFilter filter = new QueryFilter();
		filter.add(FilterOp.EQUAL, SdSimDeactivateDMO.sdSimNoFilter, sdSimDeactivateDMO.getSdSimNo());
		filter.add(FilterOp.EQUAL, SdSimDeactivateDMO.sdEppixStampFilter, sdSimDeactivateDMO.getSdEppixStamp());
		
		updateSdSimDeactivateDMO = get(filter);

	    // delete self...
	    sdSimDeactivateDAC.delete( sdSimDeactivateDMO );
	  }
	//==================================================================================================

	  public void delete( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "delete( filter )" );

	    thrower.ifParameterMissing( "filter", filter );

	    // delete...
	    sdSimDeactivateDAC.delete( filter );
	  }
	  //==================================================================================================

	  public boolean exists( SdSimDeactivateDMO sdSimDeactivateDMO )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "exists(sdSimDeactivateDMO)" );

	    thrower.ifParameterMissing( "sdSimDeactivateDMO", sdSimDeactivateDMO );

	    thrower.ifParameterMissing( "sdSimDeactivateDMO.sdSubscriberId",
	      sdSimDeactivateDMO.getSdSubscriberId() );

	    return sdSimDeactivateDAC.exists( sdSimDeactivateDMO );
	  }
	  //==================================================================================================


	  public boolean exists( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "exists(filter)" );

	    return sdSimDeactivateDAC.exists( filter );
	  }
	  //==================================================================================================


	  public DTOList getList(
	    DTOListState state,
	    QueryFilter  filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "getList( state, filter )" );

	    return sdSimDeactivateDAC.getList( state, filter );
	  }

	  //==================================================================================================


	  public DAOIterator iterate( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "iterateWithLock( filter )" );

	    return sdSimDeactivateDAC.iterate( filter );
	  }
	  //==================================================================================================


	  public DAOIterator iterateWithLock( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "iterateWithLock( filter )" );

	    return sdSimDeactivateDAC.iterateWithLock( filter );
	  }
	  //==================================================================================================


	  public SdSimDeactivateDMO get( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "get( filter )" );

	    //
	    // Check mandatory parameters.
	    //
	    thrower.ifParameterMissing( "filter", filter );

	    //
	    // Attempt to get the SdSimDeactivateDMO
	    //
	    SdSimDeactivateDMO sdSimDeactivateDMO = sdSimDeactivateDAC.get( filter );

	    return sdSimDeactivateDMO;
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

	    return sdSimDeactivateDAC.max( filter );
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

	    return sdSimDeactivateDAC.min( filter );
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

	    return Integer.valueOf(sdSimDeactivateDAC.count( filter ));
	  }
	  //==================================================================================================



}