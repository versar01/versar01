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



public class DpfDefPocFolderAbstractBLO extends BaseBLO
implements DTOActionTypes, BaseMessages{

	  /** DOCUMENT ME! */
	  static Thrower thrower = Thrower.getThrower( DpfDefPocFolderAbstractBLO.class );
	  /** DOCUMENT ME! */
	  protected static final String ENTITY_ID = "DOTT";
	  
	  /** Data Access Controller. */
	  protected DpfDefPocFolderDAC dpfDefPocFolderDAC;
	  /** DOCUMENT ME! */
	  protected Logger logger = thrower.getLogger(  );
	  
	  /** Invoked by the BLOBinder to provide this BLO with its DAC. */
	  protected void setDAC( DAC dac ) {
	    this.dpfDefPocFolderDAC = (DpfDefPocFolderDAC) dac;
	  }
	  
		protected Class getDACClass() {
			return DpfDefPocFolderDAC.class;
		}
	  
	  public DpfDefPocFolderDMO get( DpfDefPocFolderDMO dpfDefPocFolderDMO )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "get(dpfDefPocFolderDMO)" );

	    //
	    // Check mandatory parameters.
	    //
	    thrower.ifParameterMissing( "dpfDefPocFolderDMO", dpfDefPocFolderDMO );

	    //
	    // Each attribute that is part of the primary key is mandatory
	    //
	    thrower.ifParameterMissing( "dpfDefPocFolderDMO.dpfFolderId",
	      dpfDefPocFolderDMO.getDpfFolderId() );

	    //
	    // Attempt to get the DpfDefPocFolderDMO
	    //
	    DpfDefPocFolderDMO returnDpfDefPocFolderDMO = dpfDefPocFolderDAC.get( dpfDefPocFolderDMO );

	    //
	    // Could not find the DpfDefPocFolderDMO
	    //
	    if ( returnDpfDefPocFolderDMO == null ) {
	      thrower.business( Base_DPFDEFPOCFOLDER_000,
	        new Object[] { dpfDefPocFolderDMO.getDpfFolderId() } );
	    }

	    //
	    // Now, based on the values of the flags on this method signature, which in turn,
	    // are based on this objects associations, get all associated, embedded objects
	    //
	    return returnDpfDefPocFolderDMO;
	  }
	  //==================================================================================================


	  public DTOList getList(
	    DTOListState   state,
	    DpfDefPocFolderDMO dpfDefPocFolderDMO )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "getList( state, dpfDefPocFolderDMO )" );

	    return dpfDefPocFolderDAC.getList( state, dpfDefPocFolderDMO );
	  }


	  public DpfDefPocFolderDMO create( DpfDefPocFolderDMO dpfDefPocFolderDMO )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "create( dpfDefPocFolderDMO )" );

	    thrower.ifParameterMissing( "dpfDefPocFolderDMO", dpfDefPocFolderDMO );

	    thrower.ifParameterMissing( "dpfDefPocFolderDMO.dpfFolderId",
	      dpfDefPocFolderDMO.getDpfFolderId() );

	    thrower.ifParameterMissing( "dpfDefPocFolderDMO.dpfEhId",
	      dpfDefPocFolderDMO.getDpfEhId() );

	    thrower.ifParameterMissing( "dpfDefPocFolderDMO.dpfMsisdnNo",
	      dpfDefPocFolderDMO.getDpfMsisdnNo() );

	    thrower.ifParameterMissing( "dpfDefPocFolderDMO.dpfN2nFolder",
	      dpfDefPocFolderDMO.getDpfN2nFolder() );

	    thrower.ifParameterMissing( "dpfDefPocFolderDMO.dpfName",
	      dpfDefPocFolderDMO.getDpfName() );
	    
	    thrower.ifParameterMissing( "dpfDefPocFolderDMO.dpfProduct",
	  	      dpfDefPocFolderDMO.getDpfProduct() );
	    
	    thrower.ifParameterMissing( "dpfDefPocFolderDMO.dpfReverseBill",
	  	      dpfDefPocFolderDMO.getDpfReverseBill() );
	    
	    thrower.ifParameterMissing( "dpfDefPocFolderDMO.dpfSimNo",
	  	      dpfDefPocFolderDMO.getDpfSimNo() );
	    
	    thrower.ifParameterMissing( "dpfDefPocFolderDMO.dpfStatus",
	  	      dpfDefPocFolderDMO.getDpfStatus() );
	    
	    thrower.ifParameterMissing( "dpfDefPocFolderDMO.dpfConnectDate",
	  	      dpfDefPocFolderDMO.getDpfConnectDate() );
	    
	    thrower.ifParameterMissing( "dpfDefPocFolderDMO.dpfCreationDate",
	  	      dpfDefPocFolderDMO.getDpfCreationDate() );

	    //
	    // Check that this object does not already exist
	    //
	    if ( exists( dpfDefPocFolderDMO ) ) {
	      thrower.business( Base_DPFDEFPOCFOLDER_001,
	        new Object[] { dpfDefPocFolderDMO.getDpfFolderId() } );
	    }

	    //
	    // Now create the record
	    //
	    dpfDefPocFolderDAC.create( dpfDefPocFolderDMO );

	    return dpfDefPocFolderDMO;
	  }

	  public DpfDefPocFolderDMO modify( DpfDefPocFolderDMO dpfDefPocFolderDMO )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "modify( adpfDefPocFolderDMO )" );

	    //
	    // Check mandatory parameters (
	    //
	    // Note: attributes stereotyped <NotModifiable> are ignored
	    //
	    thrower.ifParameterMissing( "dpfDefPocFolderDMO", dpfDefPocFolderDMO );

	    thrower.ifParameterMissing( "dpfDefPocFolderDMO.dpfFolderId",
	  	      dpfDefPocFolderDMO.getDpfFolderId() );

	  	    thrower.ifParameterMissing( "dpfDefPocFolderDMO.dpfEhId",
	  	      dpfDefPocFolderDMO.getDpfEhId() );

	  	    thrower.ifParameterMissing( "dpfDefPocFolderDMO.dpfMsisdnNo",
	  	      dpfDefPocFolderDMO.getDpfMsisdnNo() );

	  	    thrower.ifParameterMissing( "dpfDefPocFolderDMO.dpfN2nFolder",
	  	      dpfDefPocFolderDMO.getDpfN2nFolder() );

	  	    thrower.ifParameterMissing( "dpfDefPocFolderDMO.dpfName",
	  	      dpfDefPocFolderDMO.getDpfName() );
	  	    
	  	    thrower.ifParameterMissing( "dpfDefPocFolderDMO.dpfProduct",
	  	  	      dpfDefPocFolderDMO.getDpfProduct() );
	  	    
	  	    thrower.ifParameterMissing( "dpfDefPocFolderDMO.dpfReverseBill",
	  	  	      dpfDefPocFolderDMO.getDpfReverseBill() );
	  	    
	  	    thrower.ifParameterMissing( "dpfDefPocFolderDMO.dpfSimNo",
	  	  	      dpfDefPocFolderDMO.getDpfSimNo() );
	  	    
	  	    thrower.ifParameterMissing( "dpfDefPocFolderDMO.dpfStatus",
	  	  	      dpfDefPocFolderDMO.getDpfStatus() );
	  	    
	  	    thrower.ifParameterMissing( "dpfDefPocFolderDMO.dpfConnectDate",
	  	  	      dpfDefPocFolderDMO.getDpfConnectDate() );
	  	    
	  	    thrower.ifParameterMissing( "dpfDefPocFolderDMO.dpfCreationDate",
	  	  	      dpfDefPocFolderDMO.getDpfCreationDate() );

	    DpfDefPocFolderDMO updateDpfDefPocFolderDMO = new DpfDefPocFolderDMO(  );

	    updateDpfDefPocFolderDMO.setDpfFolderId(dpfDefPocFolderDMO.getDpfFolderId() );

	    updateDpfDefPocFolderDMO = get( updateDpfDefPocFolderDMO );

	    //
	    // For each relationship to single objects (does not matter if they are Embedded or Flattened)
	    // either associate to a pre-existing object, or create an object then associate to it
	    //

	    //
	    // Copy the fields to be updated. We do not want to overwrite primary keys etc.
	    // All attributes stereotyped as being <NotModifiable> are skipped
	    //
	    updateDpfDefPocFolderDMO.setDpfFolderId(dpfDefPocFolderDMO.getDpfFolderId() );

	    updateDpfDefPocFolderDMO.setDpfConnectDate(dpfDefPocFolderDMO.getDpfConnectDate());

	    updateDpfDefPocFolderDMO.setDpfCreationDate(dpfDefPocFolderDMO.getDpfCreationDate());

	    updateDpfDefPocFolderDMO.setDpfEhId(dpfDefPocFolderDMO.getDpfEhId());
	    
	    updateDpfDefPocFolderDMO.setDpfMsisdnNo(dpfDefPocFolderDMO.getDpfMsisdnNo());
	    
	    updateDpfDefPocFolderDMO.setDpfN2nFolder(dpfDefPocFolderDMO.getDpfN2nFolder());
	    
	    updateDpfDefPocFolderDMO.setDpfName(dpfDefPocFolderDMO.getDpfName());
	    
	    updateDpfDefPocFolderDMO.setDpfProduct(dpfDefPocFolderDMO.getDpfProduct());
	    
	    updateDpfDefPocFolderDMO.setDpfReverseBill(dpfDefPocFolderDMO.getDpfReverseBill());
	    
	    updateDpfDefPocFolderDMO.setDpfSimNo(dpfDefPocFolderDMO.getDpfSimNo());
	    
	    updateDpfDefPocFolderDMO.setDpfStatus(dpfDefPocFolderDMO.getDpfStatus());

	    //
	    // Modify the dpfDefPocFolderDMO
	    //
	    dpfDefPocFolderDAC.modify( updateDpfDefPocFolderDMO );

	    // Create a new DpfDefPocFolderDMO, set keys, and fetch from the database...
	    DpfDefPocFolderDMO returnDpfDefPocFolderDMO = new DpfDefPocFolderDMO(  );

	    returnDpfDefPocFolderDMO.setDpfFolderId(updateDpfDefPocFolderDMO.getDpfFolderId() );

	    returnDpfDefPocFolderDMO = get( returnDpfDefPocFolderDMO );

	    return returnDpfDefPocFolderDMO;
	  }
	  //==================================================================================================


	  public void modify( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "modify( filter )" );

	    //
	    // Modify the dpfDefPocFolderDMO
	    //
	    dpfDefPocFolderDAC.modify( filter );
	  }
	//==================================================================================================

	  public void delete( DpfDefPocFolderDMO dpfDefPocFolderDMO )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "delete( dpfDefPocFolderDMO )" );

	    thrower.ifParameterMissing( "dpfDefPocFolderDMO", dpfDefPocFolderDMO );

	    DpfDefPocFolderDMO updateDpfDefPocFolderDMO = null;

	    updateDpfDefPocFolderDMO = get( dpfDefPocFolderDMO );

	    // delete self...
	    dpfDefPocFolderDAC.delete( dpfDefPocFolderDMO );
	  }
	//==================================================================================================

	  public void delete( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "delete( filter )" );

	    thrower.ifParameterMissing( "filter", filter );

	    // delete...
	    dpfDefPocFolderDAC.delete( filter );
	  }
	  //==================================================================================================

	  public boolean exists( DpfDefPocFolderDMO dpfDefPocFolderDMO )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "exists(dpfDefPocFolderDMO)" );

	    thrower.ifParameterMissing( "dpfDefPocFolderDMO", dpfDefPocFolderDMO );

	    thrower.ifParameterMissing( "dpfDefPocFolderDMO.actAccId",
	      dpfDefPocFolderDMO.getDpfFolderId() );

	    return dpfDefPocFolderDAC.exists( dpfDefPocFolderDMO );
	  }
	  //==================================================================================================


	  public boolean exists( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "exists(filter)" );

	    return dpfDefPocFolderDAC.exists( filter );
	  }
	  //==================================================================================================


	  public DTOList getList(
	    DTOListState state,
	    QueryFilter  filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "getList( state, filter )" );

	    return dpfDefPocFolderDAC.getList( state, filter );
	  }

	  //==================================================================================================


	  public DAOIterator iterate( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "iterateWithLock( filter )" );

	    return dpfDefPocFolderDAC.iterate( filter );
	  }
	  //==================================================================================================


	  public DAOIterator iterateWithLock( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "iterateWithLock( filter )" );

	    return dpfDefPocFolderDAC.iterateWithLock( filter );
	  }
	  //==================================================================================================


	  public DpfDefPocFolderDMO get( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "get( filter )" );

	    //
	    // Check mandatory parameters.
	    //
	    thrower.ifParameterMissing( "filter", filter );

	    //
	    // Attempt to get the DpfDefPocFolderDMO
	    //
	    DpfDefPocFolderDMO dpfDefPocFolderDMO = dpfDefPocFolderDAC.get( filter );

	    return dpfDefPocFolderDMO;
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

	    return dpfDefPocFolderDAC.max( filter );
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

	    return dpfDefPocFolderDAC.min( filter );
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

	    return Integer.valueOf(dpfDefPocFolderDAC.count( filter ));
	  }
	  //==================================================================================================

}