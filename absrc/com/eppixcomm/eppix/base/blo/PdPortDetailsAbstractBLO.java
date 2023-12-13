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
 * TODO SJ Complete this class with all standard methods
 * @author sarel.vermeulen
 *
 */
public class PdPortDetailsAbstractBLO extends BaseBLO
implements DTOActionTypes, BaseMessages{
	
	static Thrower thrower = Thrower.getThrower( PdPortDetailsAbstractBLO.class );
	protected Logger logger = thrower.getLogger(  );
	protected PdPortDetailsAbstractDAC pdAbstractDAC;
	protected static final String ENTITY_ID = "PORTDET";

	protected Class getDACClass() {
		return PdPortDetailsAbstractDAC.class;
	}

	protected void setDAC(DAC dac) {
		this.pdAbstractDAC = (PdPortDetailsAbstractDAC)dac;
	}

	  /**
	  * Retrieve a pdPortDetails data model object from persistent storage. The
	  * pdPortDetailsDMO passed in must contain a valid existing pdPortDetailsId.
	  * Optionally, the return pdPortDetailsDMO may be include a flag that indicates if
	  * the pdPortDetails object is referenced elsewhere within the module, depending on the value
	  * of the getIsUsed parameter. Finally, optionally, this method can return the set of audit
	  * records for the pdPortDetails object depending on the value of the getAudits parameter.
	  * <p>
	  * <B>Possible application exceptions:</B>
	  * <dl><dd>
	  *   <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#pdPortDetails_000}</li>
	  *   <li> The normal general errors:
	  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
	  * </dd></dl><br>
	  *
	  * @param  pdPortDetailsDMO the pdPortDetails object that must contain either the
	  *         unique pdPortDetailsId or the displayCode/languageCode pair
	  *
	  * @return pdPortDetailsDMO the pdPortDetails data model object
	  *
	  * @throws EPPIXBusinessException
	  * @throws EPPIXFatalException
	  * @throws EPPIXUnexpectedException
	  */
	  public PdPortDetailsDMO get( PdPortDetailsDMO pdPortDetailsDMO )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "get(pdPortDetailsDMO)" );

	    //
	    // Check mandatory parameters.
	    //
	    thrower.ifParameterMissing( "pdPortDetailsDMO", pdPortDetailsDMO );

	    //
	    // Each attribute that is part of the primary key is mandatory
	    //
	    thrower.ifParameterMissing( "pdPortDetailsDMO.getPdSerial()",
	      pdPortDetailsDMO.getPdSerial());

	    //
	    // Attempt to get the PdPortDetailsDMO
	    //
	    PdPortDetailsDMO returnPdPortDetailsDMO = pdAbstractDAC.get( pdPortDetailsDMO );

	    //
	    // Could not find the PdPortDetailsDMO
	    //
	    if ( returnPdPortDetailsDMO == null ) {
	      thrower.business( Base_PDPORTDETAILS_000,
	        new Object[] { pdPortDetailsDMO.getPdSerial()});
	    }

	    //
	    // Now, based on the values of the flags on this method signature, which in turn,
	    // are based on this objects associations, get all associated, embedded objects
	    //
	    return returnPdPortDetailsDMO;
	  }
	  //==================================================================================================

	  /**
	   * Return a list of pdPortDetails objects matching the passed in values. A
	   * partial match is performed on the description argument and/or the pdPortDetailss
	   * displayCode. If no values have been passed in, all pdPortDetails objects are
	   * retrieved. Note: if a language specific description does not exist, then
	   * the pdPortDetails is retrieved with the special 'NOCODE' description.
	   *
	   * @param state previous state of the list
	   * @param pdPortDetailsDMO PdPortDetailsDMO object
	   *
	   * @return DTOList of pdPortDetails objects
	   *
	   * @throws EPPIXUnexpectedException
	   */
	//  public DTOList<PdPortDetailsDMO> getList(
//	    DTOListState   state,
//	    PdPortDetailsDMO pdPortDetailsDMO )
//	    throws EPPIXBusinessException, EPPIXUnexpectedException,
//	      EPPIXFatalException {
//	    logger.debug( "getList( state, pdPortDetailsDMO )" );
	//
//	    return pdAbstractDAC.getList( state, pdPortDetailsDMO );
	//  }

	  /**
	  * Creates the pdPortDetails object. As a side effect, following creation
	  * of a pdPortDetails an audit object may be created.
	  * <p>
	  * <B>Possible application exceptions:</B>
	  * <dl><dd>
	  *     <li>The normal general errors:
	  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
	  * </dd></dl><br>
	  * @param pdPortDetailsDMO pdPortDetailsDMO object<br>
	  *   <dl><dd>
	  *   </dd></dl><br>
	  *
	  * @return populated pdPortDetailsDMO object.
	  *
	  * @throws EPPIXBusinessException
	  * @throws EPPIXUnexpectedException
	  * @throws EPPIXFatalException
	  */
	  public PdPortDetailsDMO create( PdPortDetailsDMO pdPortDetailsDMO )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "create( pdPortDetailsDMO )" );

	    thrower.ifParameterMissing( "pdPortDetailsDMO", pdPortDetailsDMO );

	    thrower.ifParameterMissing( "pdPortDetailsDMO.getPdInOut",
	      pdPortDetailsDMO.getPdInOut());

	    thrower.ifParameterMissing( "pdPortDetailsDMO.getPdMsisdn",
	      pdPortDetailsDMO.getPdMsisdn());

	    thrower.ifParameterMissing( "pdPortDetailsDMO.getPdN2nSent",
	      pdPortDetailsDMO.getPdN2nSent());

	    thrower.ifParameterMissing( "pdPortDetailsDMO.getPdNetwrk",
	      pdPortDetailsDMO.getPdNetwrk());

//	    thrower.ifParameterMissing( "pdPortDetailsDMO.getPdPortId",
//	      pdPortDetailsDMO.getPdPortId());
	    
	    thrower.ifParameterMissing( "pdPortDetailsDMO.getPdStatus",
	  	      pdPortDetailsDMO.getPdStatus());
	    
	    thrower.ifParameterMissing( "pdPortDetailsDMO.getPdTrans",
	  	      pdPortDetailsDMO.getPdTrans());
	    
	    thrower.ifParameterMissing( "pdPortDetailsDMO.getPdWaitMid",
	  	      pdPortDetailsDMO.getPdWaitMid());
	    
	    thrower.ifParameterMissing( "pdPortDetailsDMO.getPdTimestamp",
	  	      pdPortDetailsDMO.getPdTimestamp());
	    
	    thrower.ifParameterMissing( "pdPortDetailsDMO.getPdTransDate",
	  	      pdPortDetailsDMO.getPdTransDate());

	    //
	    // Check that this object does not already exist
	    //
	    if ( exists( pdPortDetailsDMO ) ) {
	      thrower.business( Base_PDPORTDETAILS_001,
	        new Object[] { pdPortDetailsDMO.getPdSerial()});
	    }

	    //
	    // Now create the pdPortDetails
	    //
	    pdAbstractDAC.create( pdPortDetailsDMO );

	    return pdPortDetailsDMO;
	  }
	//==================================================================================================

	  /**
	  * Modifies the pdPortDetails object. On any modification, an audit object
	  * is created.
	  * <p>
	  * <B>Possible application exceptions:</B>
	  * <dl><dd>
	  *     <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#pdPortDetails_002}</li>
	  *     <li>The normal general errors:
	  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
	  * </dd></dl><br>
	  * @param pdPortDetailsDMO pdPortDetailsDMO object<br>
	  *   <dl><dd>
	  *   </dd></dl><br>
	  *
	  * @return populated pdPortDetailsDMO object.
	  *
	  * @throws EPPIXBusinessException
	  * @throws EPPIXUnexpectedException
	  * @throws EPPIXFatalException
	  */
	  public PdPortDetailsDMO modify( PdPortDetailsDMO pdPortDetailsDMO )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "modify( pdPortDetailsDMO )" );

	    //
	    // Check mandatory parameters (
	    //
	    // Note: attributes stereotyped <NotModifiable> are ignored
	    //
	    thrower.ifParameterMissing( "pdPortDetailsDMO", pdPortDetailsDMO );

	    thrower.ifParameterMissing( "pdPortDetailsDMO.getPdSerial",
	  	      pdPortDetailsDMO.getPdSerial());
	    
	    thrower.ifParameterMissing( "pdPortDetailsDMO.getPdInOut",
	      pdPortDetailsDMO.getPdInOut());

	    thrower.ifParameterMissing( "pdPortDetailsDMO.getPdMsisdn",
	      pdPortDetailsDMO.getPdMsisdn());

	    thrower.ifParameterMissing( "pdPortDetailsDMO.getPdN2nSent",
	      pdPortDetailsDMO.getPdN2nSent());

	    thrower.ifParameterMissing( "pdPortDetailsDMO.getPdNetwrk",
	      pdPortDetailsDMO.getPdNetwrk());

//	    thrower.ifParameterMissing( "pdPortDetailsDMO.getPdPortId",
//	      pdPortDetailsDMO.getPdPortId());
	    
	    thrower.ifParameterMissing( "pdPortDetailsDMO.getPdStatus",
	  	      pdPortDetailsDMO.getPdStatus());
	    
	    thrower.ifParameterMissing( "pdPortDetailsDMO.getPdTrans",
	  	      pdPortDetailsDMO.getPdTrans());
	    
	    thrower.ifParameterMissing( "pdPortDetailsDMO.getPdWaitMid",
	  	      pdPortDetailsDMO.getPdWaitMid());
	    
	    thrower.ifParameterMissing( "pdPortDetailsDMO.getPdTimestamp",
	  	      pdPortDetailsDMO.getPdTimestamp());
	    
	    thrower.ifParameterMissing( "pdPortDetailsDMO.getPdTransDate",
	  	      pdPortDetailsDMO.getPdTransDate());

	    PdPortDetailsDMO updatePdPortDetailsDMO = new PdPortDetailsDMO(  );

	    updatePdPortDetailsDMO.setPdSerial(pdPortDetailsDMO.getPdSerial());

//	    updatePdPortDetailsDMO = get( pdPortDetailsDMO );

	    updatePdPortDetailsDMO.setPdInOut(pdPortDetailsDMO.getPdInOut());
	    updatePdPortDetailsDMO.setPdMsisdn(pdPortDetailsDMO.getPdMsisdn());
	    updatePdPortDetailsDMO.setPdN2nSent(pdPortDetailsDMO.getPdN2nSent());
	    updatePdPortDetailsDMO.setPdNetwrk(pdPortDetailsDMO.getPdNetwrk());
	    updatePdPortDetailsDMO.setPdPortId(pdPortDetailsDMO.getPdPortId());
	    updatePdPortDetailsDMO.setPdStatus(pdPortDetailsDMO.getPdStatus());
	    updatePdPortDetailsDMO.setPdTimestamp(pdPortDetailsDMO.getPdTimestamp());
	    updatePdPortDetailsDMO.setPdTrans(pdPortDetailsDMO.getPdTrans());
	    updatePdPortDetailsDMO.setPdTransDate(pdPortDetailsDMO.getPdTransDate());
	    updatePdPortDetailsDMO.setPdWaitMid(pdPortDetailsDMO.getPdWaitMid());
	    //
	    // Modify the pdPortDetailsDMO
	    //
	    pdAbstractDAC.modify( updatePdPortDetailsDMO );

	    // Create a new DMO, set keys, and fetch from the database...
	    PdPortDetailsDMO returnPdPortDetailsDMO = new PdPortDetailsDMO(  );

	    returnPdPortDetailsDMO.setPdSerial(updatePdPortDetailsDMO.getPdSerial());

	    returnPdPortDetailsDMO = get( returnPdPortDetailsDMO );

	    return returnPdPortDetailsDMO;
	  }
	  //==================================================================================================

	  /**
	  * Modifies the pdPortDetails object.
	  * <p>
	  * <B>Possible application exceptions:</B>
	  * <dl><dd>
	  *     <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#ECEVENTCOMMAND_002}</li>
	  *     <li>The normal general errors:
	  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
	  * </dd></dl><br>
	  * @param PdPortDetailsDMO object<br>
	  * @param filter object<br>
	  *   <dl><dd>
	  *   </dd></dl><br>
	  *
	  * @return populated pdPortDetailsDMO object.
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
	    // Modify the pdPortDetailsDMO
	    //
	    pdAbstractDAC.modify( filter );
	  }
	//==================================================================================================

	  /**
	   * Deletes the pdPortDetails object. On deletion, an audit object is created
	   * <p>
	   * <B>Possible application exceptions:</B>
	   * <dl><dd>Base_pdPortDetails_003
	   *     <li>{@link #Base#pdPortDetails_000} if the pdPortDetails does not exist.</li>
	   *     <li>{@link #Base#pdPortDetails_003} if the pdPortDetails is in use.</li>
	   *     <li>The normal general errors:
	   *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
	   * </dd></dl>
	   *  @param PdPortDetailsDMO pdPortDetails object with embedded displayCode and
	   *        languageCode.
	   *
	   * @throws EPPIXBusinessException
	   * @throws EPPIXUnexpectedException
	   * @throws EPPIXFatalException
	   */
	  public void delete( PdPortDetailsDMO pdPortDetailsDMO )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "delete( pdPortDetailsDMO )" );

	    thrower.ifParameterMissing( "pdPortDetailsDMO", pdPortDetailsDMO );

	    PdPortDetailsDMO updatePdPortDetailsDMO = null;

	    updatePdPortDetailsDMO = get( pdPortDetailsDMO );

	    // delete self...
	    pdAbstractDAC.delete( pdPortDetailsDMO );
	  }
	//==================================================================================================

	  /**
	   * Deletes the pdPortDetails object.
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
	    pdAbstractDAC.delete( filter );
	  }
	  //==================================================================================================

	  /**
	  * Indicates whether a pdPortDetails exists in the database
	  * <p>
	  * <B>Possible application exceptions:</B>
	  * <dl><dd>
	  *     <li>The normal general errors:
	  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
	  * </dd></dl>
	  *
	  *
	  * @return true if the pdPortDetails exists in the database
	  *
	  * @throws EPPIXBusinessException
	  * @throws EPPIXUnexpectedException
	  * @throws EPPIXFatalException
	  */
	  public boolean exists( PdPortDetailsDMO pdPortDetailsDMO )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "exists(pdPortDetailsDMO)" );

	    thrower.ifParameterMissing( "pdPortDetailsDMO", pdPortDetailsDMO );

	    thrower.ifParameterMissing( "pdPortDetailsDMO.getPdSerial",
	      pdPortDetailsDMO.getPdSerial());

	    return pdAbstractDAC.exists( pdPortDetailsDMO );
	  }
	  //==================================================================================================

	  /**
	   * Indicates whether a pdPortDetails exists in the database
	   * <p>
	   * <B>Possible application exceptions:</B>
	   * <dl><dd>
	   *     <li>The normal general errors:
	   *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
	   * </dd></dl>
	   *
	   *
	   * @return true if the pdPortDetails exists in the database
	   *
	   * @throws EPPIXBusinessException
	   * @throws EPPIXUnexpectedException
	   * @throws EPPIXFatalException
	   */
	  public boolean exists( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "exists(filter)" );

	    return pdAbstractDAC.exists( filter );
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
	//  public DTOList<PdPortDetailsDMO> getList(
//	    DTOListState state,
//	    QueryFilter  filter )
//	    throws EPPIXBusinessException, EPPIXUnexpectedException,
//	      EPPIXFatalException {
//	    logger.debug( "getList( state, filter )" );
	//
//	    return pdAbstractDAC.getList( state, filter );
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

	    return pdAbstractDAC.iterate( filter );
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

	    return pdAbstractDAC.iterateWithLock( filter );
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
	  public PdPortDetailsDMO get( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "get( filter )" );

	    //
	    // Check mandatory parameters.
	    //
	    thrower.ifParameterMissing( "filter", filter );

	    //
	    // Attempt to get the PdPortDetailsDMO
	    //	    
	    PdPortDetailsDMO pdPortDetailsDMO = pdAbstractDAC.get( filter );

	    return pdPortDetailsDMO;
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

	    return pdAbstractDAC.max( filter );
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

	    return pdAbstractDAC.min( filter );
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

	    return Integer.valueOf(pdAbstractDAC.count( filter ));
	  }
	  //==================================================================================================
}
