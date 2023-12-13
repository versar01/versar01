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



public class FntNetTransPendAbstractBLO extends BaseBLO
implements DTOActionTypes, BaseMessages{

	  /** DOCUMENT ME! */
	  static Thrower thrower = Thrower.getThrower( FntNetTransPendAbstractBLO.class );
	  /** DOCUMENT ME! */
	  protected static final String ENTITY_ID = "DOTT";

	  /** Data Access Controller. */
	  protected FntNetTransPendDAC fntNetTransPendDAC;
	  /** DOCUMENT ME! */
	  protected Logger logger = thrower.getLogger(  );

	  /** Invoked by the BLOBinder to provide this BLO with its DAC. */
	  protected void setDAC( DAC dac ) {
	    this.fntNetTransPendDAC = (FntNetTransPendDAC) dac;
	  }

		protected Class getDACClass() {
			return FntNetTransPendDAC.class;
		}

	  public FntNetTransPendDMO get( FntNetTransPendDMO fntNetTransPendDMO )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "get(fntNetTransPendDMO)" );

	    //
	    // Check mandatory parameters.
	    //
	    thrower.ifParameterMissing( "fntNetTransPendDMO", fntNetTransPendDMO );

	    //
	    // Each attribute that is part of the primary key is mandatory
	    //
	    thrower.ifParameterMissing( "fntNetTransPendDMO.fntSerialId",
	      fntNetTransPendDMO.getFntSerialId());

	    //
	    // Attempt to get the FntNetTransendDMO
	    //
	    FntNetTransPendDMO returnFntNetTransendDMO = fntNetTransPendDAC.get( fntNetTransPendDMO );

	    //
	    // Could not find the FntNetTransendDMO
	    //
	    if ( returnFntNetTransendDMO == null ) {
	      thrower.business( Base_FNTNETTRANSPEND_000,
	        new Object[] { fntNetTransPendDMO.getFntSerialId() } );
	    }

	    //
	    // Now, based on the values of the flags on this method signature, which in turn,
	    // are based on this objects associations, get all associated, embedded objects
	    //
	    return returnFntNetTransendDMO;
	  }
	  //==================================================================================================


	  public DTOList getList(
	    DTOListState   state,
	    FntNetTransPendDMO fntNetTransPendDMO )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "getList( state, fntNetTransPendDMO )" );

	    return fntNetTransPendDAC.getList( state, fntNetTransPendDMO );
	  }


	  public FntNetTransPendDMO create( FntNetTransPendDMO fntNetTransPendDMO )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "create( fntNetTransPendDMO )" );

	    thrower.ifParameterMissing( "fntNetTransPendDMO", fntNetTransPendDMO );

	    thrower.ifParameterMissing( "fntNetTransPendDMO.dpfFolderId",
	      fntNetTransPendDMO.getFntCommand() );

	    thrower.ifParameterMissing( "fntNetTransPendDMO.dpfEhId",
	      fntNetTransPendDMO.getFntNewValue() );

	    thrower.ifParameterMissing( "fntNetTransPendDMO.dpfMsisdnNo",
	      fntNetTransPendDMO.getFntOldValue() );

	    thrower.ifParameterMissing( "fntNetTransPendDMO.dpfN2nFolder",
	      fntNetTransPendDMO.getFntServiceCode() );

	    thrower.ifParameterMissing( "fntNetTransPendDMO.dpfName",
	      fntNetTransPendDMO.getFntStatus() );

	    thrower.ifParameterMissing( "fntNetTransPendDMO.dpfProduct",
	  	      fntNetTransPendDMO.getFntTranType() );

	    thrower.ifParameterMissing( "fntNetTransPendDMO.dpfReverseBill",
	  	      fntNetTransPendDMO.getFntSendSeq() );

	    thrower.ifParameterMissing( "fntNetTransPendDMO.dpfSimNo",
	  	      fntNetTransPendDMO.getFntSerialId() );

	    thrower.ifParameterMissing( "fntNetTransPendDMO.dpfStatus",
	  	      fntNetTransPendDMO.getFntSubscriberId() );

	    thrower.ifParameterMissing( "fntNetTransPendDMO.dpfConnectDate",
	  	      fntNetTransPendDMO.getFntTimestamp() );


	    //
	    // Check that this object does not already exist
	    //
	    if ( exists( fntNetTransPendDMO ) ) {
	      thrower.business( Base_FNTNETTRANSPEND_001,
	        new Object[] { fntNetTransPendDMO.getFntSerialId() } );
	    }

	    //
	    // Now create the record
	    //
	    fntNetTransPendDAC.create( fntNetTransPendDMO );

	    return fntNetTransPendDMO;
	  }

	  public FntNetTransPendDMO modify( FntNetTransPendDMO fntNetTransPendDMO )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "modify( afntNetTransPendDMO )" );

	    //
	    // Check mandatory parameters (
	    //
	    // Note: attributes stereotyped <NotModifiable> are ignored
	    //
	    thrower.ifParameterMissing( "fntNetTransPendDMO", fntNetTransPendDMO );

	    thrower.ifParameterMissing( "fntNetTransPendDMO.fntCommand",
	  	      fntNetTransPendDMO.getFntCommand() );

	  	    thrower.ifParameterMissing( "fntNetTransPendDMO.fntNewValue",
	  	      fntNetTransPendDMO.getFntNewValue() );

	  	    thrower.ifParameterMissing( "fntNetTransPendDMO.fntOldValue",
	  	      fntNetTransPendDMO.getFntOldValue() );

	  	    thrower.ifParameterMissing( "fntNetTransPendDMO.fntServiceCode",
	  	      fntNetTransPendDMO.getFntServiceCode() );

	  	    thrower.ifParameterMissing( "fntNetTransPendDMO.fntStatus",
	  	      fntNetTransPendDMO.getFntStatus() );

	  	    thrower.ifParameterMissing( "fntNetTransPendDMO.fntTranType",
	  	  	      fntNetTransPendDMO.getFntTranType() );

	  	    thrower.ifParameterMissing( "fntNetTransPendDMO.fntSendSeq",
	  	  	      fntNetTransPendDMO.getFntSendSeq() );

	  	    thrower.ifParameterMissing( "fntNetTransPendDMO.fntSerialId",
	  	  	      fntNetTransPendDMO.getFntSerialId() );

	  	    thrower.ifParameterMissing( "fntNetTransPendDMO.fntSubscriberId",
	  	  	      fntNetTransPendDMO.getFntSubscriberId() );

	  	    thrower.ifParameterMissing( "fntNetTransPendDMO.fntTimestamp",
	  	  	      fntNetTransPendDMO.getFntTimestamp() );


	    FntNetTransPendDMO updateFntNetTransendDMO = new FntNetTransPendDMO(  );

	    updateFntNetTransendDMO.setFntSerialId(fntNetTransPendDMO.getFntSerialId() );

	    updateFntNetTransendDMO = get( updateFntNetTransendDMO );

	    //
	    // For each relationship to single objects (does not matter if they are Embedded or Flattened)
	    // either associate to a pre-existing object, or create an object then associate to it
	    //

	    //
	    // Copy the fields to be updated. We do not want to overwrite primary keys etc.
	    // All attributes stereotyped as being <NotModifiable> are skipped
	    //
	    updateFntNetTransendDMO.setFntCommand(fntNetTransPendDMO.getFntCommand() );

	    updateFntNetTransendDMO.setFntNewValue(fntNetTransPendDMO.getFntNewValue());

	    updateFntNetTransendDMO.setFntOldValue(fntNetTransPendDMO.getFntOldValue());

	    updateFntNetTransendDMO.setFntSendSeq(fntNetTransPendDMO.getFntSendSeq());

	    updateFntNetTransendDMO.setFntSerialId(fntNetTransPendDMO.getFntSerialId());

	    updateFntNetTransendDMO.setFntServiceCode(fntNetTransPendDMO.getFntServiceCode());

	    updateFntNetTransendDMO.setFntStatus(fntNetTransPendDMO.getFntStatus());

	    updateFntNetTransendDMO.setFntSubscriberId(fntNetTransPendDMO.getFntSubscriberId());

	    updateFntNetTransendDMO.setFntTimestamp(fntNetTransPendDMO.getFntTimestamp());

	    updateFntNetTransendDMO.setFntTranType(fntNetTransPendDMO.getFntTranType());

	    //
	    // Modify the fntNetTransPendDMO
	    //
	    fntNetTransPendDAC.modify( updateFntNetTransendDMO );

	    // Create a new FntNetTransendDMO, set keys, and fetch from the database...
	    FntNetTransPendDMO returnFntNetTransendDMO = new FntNetTransPendDMO(  );

	    returnFntNetTransendDMO.setFntSerialId(updateFntNetTransendDMO.getFntSerialId() );

	    returnFntNetTransendDMO = get( returnFntNetTransendDMO );

	    return returnFntNetTransendDMO;
	  }
	  //==================================================================================================


	  public void modify( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "modify( filter )" );

	    //
	    // Modify the fntNetTransPendDMO
	    //
	    fntNetTransPendDAC.modify( filter );
	  }
	//==================================================================================================

	  public void delete( FntNetTransPendDMO fntNetTransPendDMO )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "delete( fntNetTransPendDMO )" );

	    thrower.ifParameterMissing( "fntNetTransPendDMO", fntNetTransPendDMO );

	    FntNetTransPendDMO updateFntNetTransendDMO = null;

	    updateFntNetTransendDMO = get( fntNetTransPendDMO );

	    // delete self...
	    fntNetTransPendDAC.delete( fntNetTransPendDMO );
	  }
	//==================================================================================================

	  public void delete( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "delete( filter )" );

	    thrower.ifParameterMissing( "filter", filter );

	    // delete...
	    fntNetTransPendDAC.delete( filter );
	  }
	  //==================================================================================================

	  public boolean exists( FntNetTransPendDMO fntNetTransPendDMO )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "exists(fntNetTransPendDMO)" );

	    thrower.ifParameterMissing( "fntNetTransPendDMO", fntNetTransPendDMO );

	    thrower.ifParameterMissing( "fntNetTransPendDMO.fntSerialId",
	      fntNetTransPendDMO.getFntSerialId());

	    return fntNetTransPendDAC.exists( fntNetTransPendDMO );
	  }
	  //==================================================================================================


	  public boolean exists( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "exists(filter)" );

	    return fntNetTransPendDAC.exists( filter );
	  }
	  //==================================================================================================


	  public DTOList getList(
	    DTOListState state,
	    QueryFilter  filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "getList( state, filter )" );

	    return fntNetTransPendDAC.getList( state, filter );
	  }

	  //==================================================================================================


	  public DAOIterator iterate( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "iterateWithLock( filter )" );

	    return fntNetTransPendDAC.iterate( filter );
	  }
	  //==================================================================================================


	  public DAOIterator iterateWithLock( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "iterateWithLock( filter )" );

	    return fntNetTransPendDAC.iterateWithLock( filter );
	  }
	  //==================================================================================================


	  public FntNetTransPendDMO get( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "get( filter )" );

	    //
	    // Check mandatory parameters.
	    //
	    thrower.ifParameterMissing( "filter", filter );

	    //
	    // Attempt to get the FntNetTransendDMO
	    //
	    FntNetTransPendDMO fntNetTransPendDMO = fntNetTransPendDAC.get( filter );

	    return fntNetTransPendDMO;
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

	    return fntNetTransPendDAC.max( filter );
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

	    return fntNetTransPendDAC.min( filter );
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

	    return Integer.valueOf(fntNetTransPendDAC.count( filter ));
	  }
	  //==================================================================================================





}