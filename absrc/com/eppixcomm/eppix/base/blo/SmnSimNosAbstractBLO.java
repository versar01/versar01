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
public class SmnSimNosAbstractBLO extends BaseBLO
implements DTOActionTypes, BaseMessages{
	
	protected SmnSimNosAbstractDAC smnAbstractDAC; 
	static Thrower thrower = Thrower.getThrower( SmnSimNosAbstractBLO.class );
	protected Logger logger = thrower.getLogger(  );
	protected static final String ENTITY_ID = "SIMNOS";
	

	protected Class getDACClass() {
		return SmnSimNosAbstractDAC.class;
	}

	protected void setDAC(DAC dac) {
		this.smnAbstractDAC = (SmnSimNosAbstractDAC)dac;
	}

	  /**
	  * Retrieve a actAccTypes data model object from persistent storage. The
	  * smnSimNosDMO passed in must contain a valid existing actAccTypesId.
	  * Optionally, the return smnSimNosDMO may be include a flag that indicates if
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
	  * @param  smnSimNosDMO the actAccTypes object that must contain either the
	  *         unique actAccTypesId or the displayCode/languageCode pair
	  *
	  * @return smnSimNosDMO the actAccTypes data model object
	  *
	  * @throws EPPIXBusinessException
	  * @throws EPPIXFatalException
	  * @throws EPPIXUnexpectedException
	  */
	  public SmnSimNosDMO get( SmnSimNosDMO smnSimNosDMO )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "get(smnSimNosDMO)" );

	    //
	    // Check mandatory parameters.
	    //
	    thrower.ifParameterMissing( "smnSimNosDMO", smnSimNosDMO );

	    //
	    // Each attribute that is part of the primary key is mandatory
	    //
	    thrower.ifParameterMissing( "smnSimNosDMO.getSmnSimNo",
	      smnSimNosDMO.getSmnSimNo(  ));

	    //
	    // Attempt to get the SmnSimNosDMO
	    //
	    SmnSimNosDMO returnSmnSimNosDMO = smnAbstractDAC.get( smnSimNosDMO );

	    //
	    // Could not find the SmnSimNosDMO
	    //
	    if ( returnSmnSimNosDMO == null ) {
	      thrower.business( Base_SMNSIMNOS_000,
	        new Object[] { smnSimNosDMO.getSmnSimNo()} );
	    }

	    //
	    // Now, based on the values of the flags on this method signature, which in turn,
	    // are based on this objects associations, get all associated, embedded objects
	    //
	    return returnSmnSimNosDMO;
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
	   * @param smnSimNosDMO SmnSimNosDMO object
	   *
	   * @return DTOList of ActAccTypes objects
	   *
	   * @throws EPPIXUnexpectedException
	   */
	//  public DTOList<SmnSimNosDMO> getList(
//	    DTOListState   state,
//	    SmnSimNosDMO smnSimNosDMO )
//	    throws EPPIXBusinessException, EPPIXUnexpectedException,
//	      EPPIXFatalException {
//	    logger.debug( "getList( state, smnSimNosDMO )" );
	//
//	    return smnAbstractDAC.getList( state, smnSimNosDMO );
	//  }

	  /**
	  * Creates the SmnSimNos object. As a side effect, following creation
	  * of a smnSimNos an audit object may be created.
	  * <p>
	  * <B>Possible application exceptions:</B>
	  * <dl><dd>
	  *     <li>The normal general errors:
	  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
	  * </dd></dl><br>
	  * @param smnSimNosDMO smnSimNosDMO object<br>
	  *   <dl><dd>
	  *   </dd></dl><br>
	  *
	  * @return populated smnSimNosDMO object.
	  *
	  * @throws EPPIXBusinessException
	  * @throws EPPIXUnexpectedException
	  * @throws EPPIXFatalException
	  */
	  public SmnSimNosDMO create( SmnSimNosDMO smnSimNosDMO )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "create( smnSimNosDMO )" );

	    thrower.ifParameterMissing( "smnSimNosDMO", smnSimNosDMO );

	    thrower.ifParameterMissing( "smnSimNosDMO.getSmnSimNo",
	      smnSimNosDMO.getSmnSimNo());

	    thrower.ifParameterMissing( "smnSimNosDMO.getSmnNetworkId",
	      smnSimNosDMO.getSmnNetworkId());

	    thrower.ifParameterMissing( "smnSimNosDMO.getSmnOnNetwork",
	      smnSimNosDMO.getSmnOnNetwork());

	    thrower.ifParameterMissing( "smnSimNosDMO.getSmnStatus",
	      smnSimNosDMO.getSmnStatus());
	    
	    //
	    // Check that this object does not already exist
	    //
	    if ( exists( smnSimNosDMO ) ) {
	      thrower.business( Base_SMNSIMNOS_001,
	        new Object[] { smnSimNosDMO.getSmnSimNo()});
	    }

	    //
	    // Now create the actAccTypes
	    //
	    smnAbstractDAC.create( smnSimNosDMO );

	    return smnSimNosDMO;
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
	  * @param smnSimNosDMO smnSimNosDMO object<br>
	  *   <dl><dd>
	  *   </dd></dl><br>
	  *
	  * @return populated smnSimNosDMO object.
	  *
	  * @throws EPPIXBusinessException
	  * @throws EPPIXUnexpectedException
	  * @throws EPPIXFatalException
	  */
	  public SmnSimNosDMO modify( SmnSimNosDMO aSmnSimNosDMO )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "modify( asmnSimNosDMO )" );

	    //
	    // Check mandatory parameters (
	    //
	    // Note: attributes stereotyped <NotModifiable> are ignored
	    //
		thrower.ifParameterMissing("asmnSimNosDMO", aSmnSimNosDMO);

		thrower.ifParameterMissing("smnSimNosDMO.getSmnSimNo", aSmnSimNosDMO
				.getSmnSimNo());

		thrower.ifParameterMissing("smnSimNosDMO.getSmnNetworkId",
				aSmnSimNosDMO.getSmnNetworkId());

		thrower.ifParameterMissing("smnSimNosDMO.getSmnOnNetwork",
				aSmnSimNosDMO.getSmnOnNetwork());

		thrower.ifParameterMissing("smnSimNosDMO.getSmnStatus", aSmnSimNosDMO
				.getSmnStatus());

	    SmnSimNosDMO updateSmnSimNosDMO = new SmnSimNosDMO(  );

	    updateSmnSimNosDMO.setSmnSimNo(aSmnSimNosDMO.getSmnSimNo());

	    updateSmnSimNosDMO = get( updateSmnSimNosDMO );

	    //
	    // For each relationship to single objects (does not matter if they are Embedded or Flattened)
	    // either associate to a pre-existing object, or create an object then associate to it
	    //

	    //
	    // Copy the fields to be updated. We do not want to overwrite primary keys etc.
	    // All attributes stereotyped as being <NotModifiable> are skipped	    
	    //
	    
	    updateSmnSimNosDMO.setSmnActiveDate(aSmnSimNosDMO.getSmnActiveDate());
	    updateSmnSimNosDMO.setSmnAnalysis1(aSmnSimNosDMO.getSmnAnalysis1());
	    updateSmnSimNosDMO.setSmnAnalysis2(aSmnSimNosDMO.getSmnAnalysis2());
	    updateSmnSimNosDMO.setSmnAnalysis3(aSmnSimNosDMO.getSmnAnalysis3());
	    updateSmnSimNosDMO.setSmnAvailDate(aSmnSimNosDMO.getSmnAvailDate());
	    updateSmnSimNosDMO.setSmnDealerId(aSmnSimNosDMO.getSmnDealerId());
	    updateSmnSimNosDMO.setSmnExpiryDate(aSmnSimNosDMO.getSmnExpiryDate());
	    updateSmnSimNosDMO.setSmnHlr(aSmnSimNosDMO.getSmnHlr());
	    updateSmnSimNosDMO.setSmnImsiNo(aSmnSimNosDMO.getSmnImsiNo());
	    updateSmnSimNosDMO.setSmnKi(aSmnSimNosDMO.getSmnKi());
//	    updateSmnSimNosDMO.setSmnNetworkId(smnNetworkId)
//	    updateSmnSimNosDMO.setSmnOnNetwork(smnOnNetwork)
	    updateSmnSimNosDMO.setSmnPinNo(aSmnSimNosDMO.getSmnPinNo());
	    updateSmnSimNosDMO.setSmnPinNo2(aSmnSimNosDMO.getSmnPinNo2());
	    updateSmnSimNosDMO.setSmnProductCode(aSmnSimNosDMO.getSmnProductCode());
	    updateSmnSimNosDMO.setSmnPukNo(aSmnSimNosDMO.getSmnPukNo());
	    updateSmnSimNosDMO.setSmnPukNo2(aSmnSimNosDMO.getSmnPukNo2());
//	    updateSmnSimNosDMO.setSmnSimNo(ENTITY_ID)
//	    updateSmnSimNosDMO.setSmnStatus(smnStatus)
	    updateSmnSimNosDMO.setSmnTransportKey(aSmnSimNosDMO.getSmnTransportKey());
	    updateSmnSimNosDMO.setSmnWarehouse(aSmnSimNosDMO.getSmnWarehouse());
    

	    //
	    // Modify the smnSimNosDMO
	    //
	    smnAbstractDAC.modify( updateSmnSimNosDMO );

	    // Create a new DMO, set keys, and fetch from the database...
	    SmnSimNosDMO returnSmnSimNosDMO = new SmnSimNosDMO(  );

	    returnSmnSimNosDMO.setSmnSimNo(updateSmnSimNosDMO.getSmnSimNo());

	    returnSmnSimNosDMO = get( returnSmnSimNosDMO );

	    return returnSmnSimNosDMO;
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
	  * @param SmnSimNosDMO object<br>
	  * @param filter object<br>
	  *   <dl><dd>
	  *   </dd></dl><br>
	  *
	  * @return populated smnSimNosDMO object.
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
	    // Modify the smnSimNosDMO
	    //
	    smnAbstractDAC.modify( filter );
	  }
	//==================================================================================================

	  /**
	   * Deletes the SMNSIMNOS object. On deletion, an audit object is created
	   * <p>
	   * <B>Possible application exceptions:</B>
	   * <dl><dd>Base_SMNSIMNOS_003
	   *     <li>{@link #Base#SMNSIMNOS_000} if the SMNSIMNOS does not exist.</li>
	   *     <li>{@link #Base#SMNSIMNOS_003} if the SMNSIMNOS is in use.</li>
	   *     <li>The normal general errors:
	   *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
	   * </dd></dl>
	   *  @param SmnSimNosDMO SMNSIMNOS object with embedded displayCode and
	   *        languageCode.
	   *
	   * @throws EPPIXBusinessException
	   * @throws EPPIXUnexpectedException
	   * @throws EPPIXFatalException
	   */
	  public void delete( SmnSimNosDMO smnSimNosDMO )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "delete( smnSimNosDMO )" );

	    thrower.ifParameterMissing( "smnSimNosDMO", smnSimNosDMO );

	    SmnSimNosDMO updateSmnSimNosDMO = null;

	    updateSmnSimNosDMO = get( smnSimNosDMO );

	    // delete self...
	    smnAbstractDAC.delete( smnSimNosDMO );
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
	    smnAbstractDAC.delete( filter );
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
	  public boolean exists( SmnSimNosDMO smnSimNosDMO )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "exists(actAccTypes)" );

	    thrower.ifParameterMissing( "smnSimNosDMO", smnSimNosDMO );

	    thrower.ifParameterMissing( "smnSimNosDMO.getSmnSimNo",
	      smnSimNosDMO.getSmnSimNo());

	    return smnAbstractDAC.exists( smnSimNosDMO );
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

	    return smnAbstractDAC.exists( filter );
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
	//  public DTOList<SmnSimNosDMO> getList(
//	    DTOListState state,
//	    QueryFilter  filter )
//	    throws EPPIXBusinessException, EPPIXUnexpectedException,
//	      EPPIXFatalException {
//	    logger.debug( "getList( state, filter )" );
	//
//	    return smnAbstractDAC.getList( state, filter );
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

	    return smnAbstractDAC.iterate( filter );
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

	    return smnAbstractDAC.iterateWithLock( filter );
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
	  public SmnSimNosDMO get( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "get( filter )" );

	    //
	    // Check mandatory parameters.
	    //
	    thrower.ifParameterMissing( "filter", filter );

	    //
	    // Attempt to get the SmnSimNosDMO
	    //
	    SmnSimNosDMO smnSimNosDMO = smnAbstractDAC.get( filter );

	    return smnSimNosDMO;
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

	    return smnAbstractDAC.max( filter );
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

	    return smnAbstractDAC.min( filter );
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

	    return Integer.valueOf(smnAbstractDAC.count( filter ));
	  }
	  //==================================================================================================
}
