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


/**
 * TODO SJ Implement all standard methods
 * @author sarel.vermeulen
 *
 */
public class SeqMapN2NAbstractBLO extends BaseBLO
implements DTOActionTypes, BaseMessages{
	
	static Thrower thrower = Thrower.getThrower( SeqMapN2NAbstractBLO.class );
	protected Logger logger = thrower.getLogger(  );
	protected SeqMapN2NAbstractDAC seqAbstractDAC;
	protected static final String ENTITY_ID = "SEQMAP";

	protected Class getDACClass() {
		return SeqMapN2NAbstractDAC.class;
	}

	protected void setDAC(DAC dac) {
		
		if(logger.isDebugEnabled()){
			logger.debug("SeqMapN2NAbstractBLO setDAC()");
		}
		
		this.seqAbstractDAC = (SeqMapN2NAbstractDAC)dac;
	}
	
	  /**
	  * Retrieve a actAccTypes data model object from persistent storage. The
	  * seqMapN2NDMO passed in must contain a valid existing actAccTypesId.
	  * Optionally, the return seqMapN2NDMO may be include a flag that indicates if
	  * the actAccTypes object is referenced elsewhere within the module, depending on the value
	  * of the getIsUsed parameter. Finally, optionally, this method can return the set of audit
	  * records for the actAccTypes object depending on the value of the getAudits parameter.
	  * <p>
	  * <B>Possible application exceptions:</B>
	  * <dl><dd>
	  *   <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#ACTACCTYPES_000}</li>
	  *   <li> The normal general errors:
	  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
	  * </dd></dl><br>
	  *
	  * @param  seqMapN2NDMO the actAccTypes object that must contain either the
	  *         unique actAccTypesId or the displayCode/languageCode pair
	  *
	  * @return seqMapN2NDMO the actAccTypes data model object
	  *
	  * @throws EPPIXBusinessException
	  * @throws EPPIXFatalException
	  * @throws EPPIXUnexpectedException
	  */
	  public SeqMapN2NDMO get( SeqMapN2NDMO seqMapN2NDMO )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "get(seqMapN2NDMO)" );

	    //
	    // Check mandatory parameters.
	    //
	    thrower.ifParameterMissing( "seqMapN2NDMO", seqMapN2NDMO );

	    //
	    // Each attribute that is part of the primary key is mandatory
	    //seq_provider_id
	    //seq_n2ntrans_id
	    //seq_netwktrans_id
	    //
	    thrower.ifParameterMissing( "seqMapN2NDMO.getSeqProviderId",
	      seqMapN2NDMO.getSeqProviderId() );
	    
	    thrower.ifParameterMissing( "seqMapN2NDMO.getSeqN2ntransId",
	  	      seqMapN2NDMO.getSeqN2ntransId());
	    
	    thrower.ifParameterMissing( "seqMapN2NDMO.getSeqNetwktransId",
	  	      seqMapN2NDMO.getSeqNetwktransId());

	    //
	    // Attempt to get the SeqMapN2NDMO
	    //	    
	    SeqMapN2NDMO returnSeqMapN2NDMO = seqAbstractDAC.get( seqMapN2NDMO );

	    //
	    // Could not find the SeqMapN2NDMO
	    //
	    if ( returnSeqMapN2NDMO == null ) {
	      thrower.business( Base_SEQMAPN2N_000,
	        new Object[] { seqMapN2NDMO.getSeqProviderId()} );
	    }

	    //
	    // Now, based on the values of the flags on this method signature, which in turn,
	    // are based on this objects associations, get all associated, embedded objects
	    //
	    return returnSeqMapN2NDMO;
	  }
	  //==================================================================================================

	  /**
	   * Return a list of ActAccTypes objects matching the passed in values. A
	   * partial match is performed on the description argument and/or the actAccTypess
	   * displayCode. If no values have been passed in, all ActAccTypes objects are
	   * retrieved. Note: if a language specific description does not exist, then
	   * the ActAccTypes is retrieved with the special 'NOCODE' description.
	   *
	   * @param state previous state of the list
	   * @param seqMapN2NDMO SeqMapN2NDMO object
	   *
	   * @return DTOList of ActAccTypes objects
	   *
	   * @throws EPPIXUnexpectedException
	   */
	//  public DTOList<SeqMapN2NDMO> getList(
//	    DTOListState   state,
//	    SeqMapN2NDMO seqMapN2NDMO )
//	    throws EPPIXBusinessException, EPPIXUnexpectedException,
//	      EPPIXFatalException {
//	    logger.debug( "getList( state, seqMapN2NDMO )" );
	//
//	    return seqAbstractDAC.getList( state, seqMapN2NDMO );
	//  }

	  /**
	  * Creates the ActAccTypes object. As a side effect, following creation
	  * of a actAccTypes an audit object may be created.
	  * <p>
	  * <B>Possible application exceptions:</B>
	  * <dl><dd>
	  *     <li>The normal general errors:
	  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
	  * </dd></dl><br>
	  * @param seqMapN2NDMO seqMapN2NDMO object<br>
	  *   <dl><dd>
	  *   </dd></dl><br>
	  *
	  * @return populated seqMapN2NDMO object.
	  *
	  * @throws EPPIXBusinessException
	  * @throws EPPIXUnexpectedException
	  * @throws EPPIXFatalException
	  */
	  public SeqMapN2NDMO create( SeqMapN2NDMO seqMapN2NDMO )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "create( seqMapN2NDMO )" );

	    thrower.ifParameterMissing( "seqMapN2NDMO", seqMapN2NDMO );

	    thrower.ifParameterMissing( "seqMapN2NDMO.getSeqProviderId",
	      seqMapN2NDMO.getSeqProviderId()) ;

	    thrower.ifParameterMissing( "seqMapN2NDMO.getSeqN2ntransId",
	      seqMapN2NDMO.getSeqN2ntransId() );

	    thrower.ifParameterMissing( "seqMapN2NDMO.getSeqNetwktransId",
	      seqMapN2NDMO.getSeqNetwktransId() );

	    thrower.ifParameterMissing( "seqMapN2NDMO.getSeqStatus",
	      seqMapN2NDMO.getSeqStatus() );

	    thrower.ifParameterMissing( "seqMapN2NDMO.getSeqDatetime",
	      seqMapN2NDMO.getSeqDatetime() );

	    //
	    // Check that this object does not already exist
	    //
	    if ( exists( seqMapN2NDMO ) ) {
	      thrower.business( Base_SEQMAPN2N_001,
	        new Object[] { seqMapN2NDMO.getSeqProviderId()} );
	    }

	    //
	    // Now create the actAccTypes
	    //
	    seqAbstractDAC.create( seqMapN2NDMO );

	    return seqMapN2NDMO;
	  }
	//==================================================================================================

	  /**
	  * Modifies the ActAccTypes object. On any modification, an audit object
	  * is created.
	  * <p>
	  * <B>Possible application exceptions:</B>
	  * <dl><dd>
	  *     <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#ACTACCTYPES_002}</li>
	  *     <li>The normal general errors:
	  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
	  * </dd></dl><br>
	  * @param seqMapN2NDMO seqMapN2NDMO object<br>
	  *   <dl><dd>
	  *   </dd></dl><br>
	  *
	  * @return populated seqMapN2NDMO object.
	  *
	  * @throws EPPIXBusinessException
	  * @throws EPPIXUnexpectedException
	  * @throws EPPIXFatalException
	  */
	  public SeqMapN2NDMO modify( SeqMapN2NDMO aSeqMapN2NDMO )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "modify( aseqMapN2NDMO )" );

	    //
	    // Check mandatory parameters (
	    //
	    // Note: attributes stereotyped <NotModifiable> are ignored
	    //
	    thrower.ifParameterMissing( "aseqMapN2NDMO", aSeqMapN2NDMO );

	    thrower.ifParameterMissing( "aSeqMapN2NDMO.getSeqProviderId",
	      aSeqMapN2NDMO.getSeqProviderId()); // attribute

	    thrower.ifParameterMissing( "aSeqMapN2NDMO.getSeqN2ntransId",
	      aSeqMapN2NDMO.getSeqN2ntransId()); // attribute

	    thrower.ifParameterMissing( "aSeqMapN2NDMO.getSeqNetwktransId",
	      aSeqMapN2NDMO.getSeqNetwktransId()); // attribute

	    thrower.ifParameterMissing( "aSeqMapN2NDMO.getSeqStatus",
	      aSeqMapN2NDMO.getSeqStatus()); // attribute

	    thrower.ifParameterMissing( "aSeqMapN2NDMO.getSeqDatetime",
	      aSeqMapN2NDMO.getSeqDatetime() ); // attribute

	    SeqMapN2NDMO updateSeqMapN2NDMO = new SeqMapN2NDMO(  );

	    updateSeqMapN2NDMO.setSeqProviderId(aSeqMapN2NDMO.getSeqProviderId());
	    updateSeqMapN2NDMO.setSeqN2ntransId(aSeqMapN2NDMO.getSeqN2ntransId());
	    updateSeqMapN2NDMO.setSeqNetwktransId(aSeqMapN2NDMO.getSeqNetwktransId());

	    updateSeqMapN2NDMO = get( updateSeqMapN2NDMO );

	    //
	    // For each relationship to single objects (does not matter if they are Embedded or Flattened)
	    // either associate to a pre-existing object, or create an object then associate to it
	    //

	    //
	    // Copy the fields to be updated. We do not want to overwrite primary keys etc.
	    // All attributes stereotyped as being <NotModifiable> are skipped
	    //

	    updateSeqMapN2NDMO.setSeqStatus( aSeqMapN2NDMO.getSeqStatus());

	    updateSeqMapN2NDMO.setSeqDatetime(aSeqMapN2NDMO.getSeqDatetime());
	    
	    //
	    // Modify the seqMapN2NDMO
	    //
	    seqAbstractDAC.modify( updateSeqMapN2NDMO );

	    // Create a new DMO, set keys, and fetch from the database...
	    SeqMapN2NDMO returnSeqMapN2NDMO = new SeqMapN2NDMO(  );

	    returnSeqMapN2NDMO.setSeqProviderId(updateSeqMapN2NDMO.getSeqProviderId());
	    returnSeqMapN2NDMO.setSeqN2ntransId(updateSeqMapN2NDMO.getSeqN2ntransId());
	    returnSeqMapN2NDMO.setSeqNetwktransId(updateSeqMapN2NDMO.getSeqNetwktransId());
	    returnSeqMapN2NDMO.setSeqStatus( updateSeqMapN2NDMO.getSeqStatus());
	    returnSeqMapN2NDMO.setSeqDatetime(updateSeqMapN2NDMO.getSeqDatetime());	    

	    returnSeqMapN2NDMO = get( returnSeqMapN2NDMO );

	    return returnSeqMapN2NDMO;
	  }
	  //==================================================================================================

	  /**
	  * Modifies the ActAccTypes object.
	  * <p>
	  * <B>Possible application exceptions:</B>
	  * <dl><dd>
	  *     <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#ECEVENTCOMMAND_002}</li>
	  *     <li>The normal general errors:
	  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
	  * </dd></dl><br>
	  * @param SeqMapN2NDMO object<br>
	  * @param filter object<br>
	  *   <dl><dd>
	  *   </dd></dl><br>
	  *
	  * @return populated seqMapN2NDMO object.
	  *
	  * @throws EPPIXBusinessException
	  * @throws EPPIXUnexpectedException
	  * @throws EPPIXFatalException
	  */
	  public void modify( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "modify( filter )" );

	    //
	    // Modify the seqMapN2NDMO
	    //
	    seqAbstractDAC.modify( filter );
	  }
	//==================================================================================================

	  /**
	   * Deletes the ActAccTypes object. On deletion, an audit object is created
	   * <p>
	   * <B>Possible application exceptions:</B>
	   * <dl><dd>Base_ACTACCTYPES_003
	   *     <li>{@link #Base#ACTACCTYPES_000} if the ActAccTypes does not exist.</li>
	   *     <li>{@link #Base#ACTACCTYPES_003} if the ActAccTypes is in use.</li>
	   *     <li>The normal general errors:
	   *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
	   * </dd></dl>
	   *  @param SeqMapN2NDMO ActAccTypes object with embedded displayCode and
	   *        languageCode.
	   *
	   * @throws EPPIXBusinessException
	   * @throws EPPIXUnexpectedException
	   * @throws EPPIXFatalException
	   */
	  public void delete( SeqMapN2NDMO seqMapN2NDMO )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "delete( seqMapN2NDMO )" );

	    thrower.ifParameterMissing( "seqMapN2NDMO", seqMapN2NDMO );

	    SeqMapN2NDMO updateSeqMapN2NDMO = null;

	    updateSeqMapN2NDMO = get( seqMapN2NDMO );

	    // delete self...
	    seqAbstractDAC.delete( seqMapN2NDMO );
	  }
	//==================================================================================================

	  /**
	   * Deletes the ActAccTypes object.
	   * <p>
	   * <B>Possible application exceptions:</B>
	   * <dl><dd>
	   *     <li>The normal general errors:
	   *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
	   * </dd></dl>
	   *  @param QueryFilter filter.
	   *
	   * @throws EPPIXBusinessException
	   * @throws EPPIXUnexpectedException
	   * @throws EPPIXFatalException
	   */
	  public void delete( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "delete( filter )" );

	    thrower.ifParameterMissing( "filter", filter );

	    // delete...
	    seqAbstractDAC.delete( filter );
	  }
	  //==================================================================================================

	  /**
	  * Indicates whether a ActAccTypes exists in the database
	  * <p>
	  * <B>Possible application exceptions:</B>
	  * <dl><dd>
	  *     <li>The normal general errors:
	  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
	  * </dd></dl>
	  *
	  *
	  * @return true if the ActAccTypes exists in the database
	  *
	  * @throws EPPIXBusinessException
	  * @throws EPPIXUnexpectedException
	  * @throws EPPIXFatalException
	  */
	  public boolean exists( SeqMapN2NDMO seqMapN2NDMO )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "exists(actAccTypes)" );

	    thrower.ifParameterMissing( "seqMapN2NDMO", seqMapN2NDMO );

	    thrower.ifParameterMissing( "seqMapN2NDMO.getSeqProviderId",
	      seqMapN2NDMO.getSeqProviderId());
	    
	    thrower.ifParameterMissing( "seqMapN2NDMO.getSeqN2ntransId",
	  	      seqMapN2NDMO.getSeqN2ntransId());
	    
	    thrower.ifParameterMissing( "seqMapN2NDMO.getSeqNetwktransId",
	  	      seqMapN2NDMO.getSeqNetwktransId());

	    return seqAbstractDAC.exists( seqMapN2NDMO );
	  }
	  //==================================================================================================

	  /**
	   * Indicates whether a ActAccTypes exists in the database
	   * <p>
	   * <B>Possible application exceptions:</B>
	   * <dl><dd>
	   *     <li>The normal general errors:
	   *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
	   * </dd></dl>
	   *
	   *
	   * @return true if the ActAccTypes exists in the database
	   *
	   * @throws EPPIXBusinessException
	   * @throws EPPIXUnexpectedException
	   * @throws EPPIXFatalException
	   */
	  public boolean exists( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "exists(filter)" );

	    return seqAbstractDAC.exists( filter );
	  }
	  //==================================================================================================

	  /**
	   * DOCUMENT ME!
	   *
	   * @param state DOCUMENT ME!
	   * @param filter DOCUMENT ME!
	   *
	   * @return DOCUMENT ME!
	   *
	   * @throws EPPIXBusinessException DOCUMENT ME!
	   * @throws EPPIXUnexpectedException DOCUMENT ME!
	   * @throws EPPIXFatalException DOCUMENT ME!
	   */
	//  public DTOList<SeqMapN2NDMO> getList(
//	    DTOListState state,
//	    QueryFilter  filter )
//	    throws EPPIXBusinessException, EPPIXUnexpectedException,
//	      EPPIXFatalException {
//	    logger.debug( "getList( state, filter )" );
	//
//	    return seqAbstractDAC.getList( state, filter );
	//  }

	  /**
	   * DOCUMENT ME!
	   *
	   * @param filter DOCUMENT ME!
	   *
	   * @return DOCUMENT ME!
	   *
	   * @throws EPPIXBusinessException DOCUMENT ME!
	   * @throws EPPIXUnexpectedException DOCUMENT ME!
	   * @throws EPPIXFatalException DOCUMENT ME!
	   */
	  public DAOIterator iterate( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "iterate( filter )" );

	    return seqAbstractDAC.iterate( filter );
	  }
	  //==================================================================================================

	  /**
	   * DOCUMENT ME!
	   *
	   * @param filter DOCUMENT ME!
	   *
	   * @return DOCUMENT ME!
	   *
	   * @throws EPPIXBusinessException DOCUMENT ME!
	   * @throws EPPIXUnexpectedException DOCUMENT ME!
	   * @throws EPPIXFatalException DOCUMENT ME!
	   */
	  public DAOIterator iterateWithLock( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "iterateWithLock( filter )" );

	    return seqAbstractDAC.iterateWithLock( filter );
	  }
	  //==================================================================================================

	  /**
	   * DOCUMENT ME!
	   *
	   * @param filter DOCUMENT ME!
	   *
	   * @return DOCUMENT ME!
	   *
	   * @throws EPPIXBusinessException DOCUMENT ME!
	   * @throws EPPIXUnexpectedException DOCUMENT ME!
	   * @throws EPPIXFatalException DOCUMENT ME!
	   */
	  public SeqMapN2NDMO get( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "get( filter )" );

	    //
	    // Check mandatory parameters.
	    //
	    thrower.ifParameterMissing( "filter", filter );

	    //
	    // Attempt to get the SeqMapN2NDMO
	    //
	    SeqMapN2NDMO seqMapN2NDMO = seqAbstractDAC.get( filter );

	    return seqMapN2NDMO;
	  }
	  //==================================================================================================

	  /**
	   * DOCUMENT ME!
	   *
	   * @param filter DOCUMENT ME!
	   *
	   * @return DOCUMENT ME!
	   *
	   * @throws EPPIXBusinessException DOCUMENT ME!
	   * @throws EPPIXUnexpectedException DOCUMENT ME!
	   * @throws EPPIXFatalException DOCUMENT ME!
	   */
	  public Object max( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "max( filter )" );

	    //
	    // Check mandatory parameters.
	    //
	    thrower.ifParameterMissing( "filter", filter );

	    return seqAbstractDAC.max( filter );
	  }
	  //==================================================================================================

	  /**
	   * DOCUMENT ME!
	   *
	   * @param filter DOCUMENT ME!
	   *
	   * @return DOCUMENT ME!
	   *
	   * @throws EPPIXBusinessException DOCUMENT ME!
	   * @throws EPPIXUnexpectedException DOCUMENT ME!
	   * @throws EPPIXFatalException DOCUMENT ME!
	   */
	  public Object min( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "min( filter )" );

	    //
	    // Check mandatory parameters.
	    //
	    thrower.ifParameterMissing( "filter", filter );

	    return seqAbstractDAC.min( filter );
	  }
	  //==================================================================================================

	  /**
	   * Counts the number of rows for the specified filter.
	   *
	   * @param filter the query filter
	   * @return the count of rows.
	   *
	   * @throws EPPIXBusinessException
	   * @throws EPPIXUnexpectedException
	   * @throws EPPIXFatalException
	   */
	  public Integer count( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "count( filter )" );

	    //
	    // Check mandatory parameters.
	    //
	    thrower.ifParameterMissing( "filter", filter );

	    return Integer.valueOf(seqAbstractDAC.count( filter ));
	  }
	  //==================================================================================================

}
