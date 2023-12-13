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
import com.eppixcomm.eppix.common.util.DateTime;
import com.eppixcomm.eppix.common.util.FilterOp;
import com.eppixcomm.eppix.common.util.QueryFilter;


/**
 * TODO SJ Implement all standard methods
 * @author sarel.vermeulen
 *
 */
public class SmhSimHistoryAbstractBLO extends BaseBLO
implements DTOActionTypes, BaseMessages{
	
	static Thrower thrower = Thrower.getThrower( SmhSimHistoryAbstractBLO.class );
	protected Logger logger = thrower.getLogger(  );
	protected SmhSimHistoryAbstractDAC smhAbstractDAC;
	protected static final String ENTITY_ID = "SIMH";

	protected Class getDACClass() {
		return SmhSimHistoryAbstractDAC.class;
	}

	protected void setDAC(DAC dac) {
		this.smhAbstractDAC = (SmhSimHistoryAbstractDAC)dac;
	}
	
//	  /**
//	  * Retrieve a actAccTypes data model object from persistent storage. The
//	  * smhSimHistoryDMO passed in must contain a valid existing actAccTypesId.
//	  * Optionally, the return smhSimHistoryDMO may be include a flag that indicates if
//	  * the actAccTypes object is referenced elsewhere within the module, depending on the value
//	  * of the getIsUsed parameter. Finally, optionally, this method can return the set of audit
//	  * records for the actAccTypes object depending on the value of the getAudits parameter.
//	  * <p>
//	  * <B>Possible application exceptions:</B>
//	  * <dl><dd>
//	  *   <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#ACTACCTYPES_000}</li>
//	  *   <li> The normal general errors:
//	  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
//	  * </dd></dl><br>
//	  *
//	  * @param  smhSimHistoryDMO the actAccTypes object that must contain either the
//	  *         unique actAccTypesId or the displayCode/languageCode pair
//	  *
//	  * @return smhSimHistoryDMO the actAccTypes data model object
//	  *
//	  * @throws EPPIXBusinessException
//	  * @throws EPPIXFatalException
//	  * @throws EPPIXUnexpectedException
//	  */
//	  public SmhSimHistoryDMO get( SmhSimHistoryDMO smhSimHistoryDMO )
//	    throws EPPIXBusinessException, EPPIXUnexpectedException,
//	      EPPIXFatalException {
//	    logger.debug( "get(smhSimHistoryDMO)" );
//
//	    //
//	    // Check mandatory parameters.
//	    //
//	    thrower.ifParameterMissing( "smhSimHistoryDMO", smhSimHistoryDMO );
//
//	    //
//	    // Each attribute that is part of the primary key is mandatory
//	    //
//
//	    //
//	    // Attempt to get the SmhSimHistoryDMO
//	    //
//	    SmhSimHistoryDMO returnSmhSimHistoryDMO = smhAbstractDAC.get( smhSimHistoryDMO );
//
//	    //
//	    // Could not find the SmhSimHistoryDMO
//	    //
//	    if ( returnSmhSimHistoryDMO == null ) {
//	      thrower.business( Base_ACTACCTYPES_000,
//	        new Object[] { smhSimHistoryDMO.getActAccId(  ) } );
//	    }
//
//	    //
//	    // Now, based on the values of the flags on this method signature, which in turn,
//	    // are based on this objects associations, get all associated, embedded objects
//	    //
//	    return returnSmhSimHistoryDMO;
//	  }
	  //==================================================================================================

	/**
	 * Creates an SMH entry using the provided parameters.
	 * 
	 * @param subscriberId
	 * @param simNo
	 * @param histCode
	 * @param histComment
	 * @throws EPPIXBusinessException
	 * @throws EPPIXUnexpectedException
	 * @throws EPPIXFatalException
	 */
	public void create(Integer subscriberId, String simNo, String histCode,
			String histComment) throws EPPIXBusinessException,
			EPPIXUnexpectedException, EPPIXFatalException {

		logger.debug("create( subscriberId, simNo, histCode, histComment )");

		SmhSimHistoryDMO smh = new SmhSimHistoryDMO();
		smh.setSmhSubscriberId(subscriberId);
		smh.setSmhSimNo(simNo);
		smh.setSmhHistCode(histCode);
		smh.setSmhComment(histComment);
		smh.setSmhTimestamp(new DateTime());
		smh.setSmhUserId(loginName());
		smh.setSmhTerminalId(locale().getLoginAddr());

		create(smh);

	}	
	  /**
	   * Return a list of ActAccTypes objects matching the passed in values. A
	   * partial match is performed on the description argument and/or the actAccTypess
	   * displayCode. If no values have been passed in, all ActAccTypes objects are
	   * retrieved. Note: if a language specific description does not exist, then
	   * the ActAccTypes is retrieved with the special 'NOCODE' description.
	   *
	   * @param state previous state of the list
	   * @param smhSimHistoryDMO SmhSimHistoryDMO object
	   *
	   * @return DTOList of ActAccTypes objects
	   *
	   * @throws EPPIXUnexpectedException
	   */
//	  public DTOList getList(DTOListState   state,
//	    SmhSimHistoryDMO smhSimHistoryDMO )
//	    throws EPPIXBusinessException, EPPIXUnexpectedException,
//	      EPPIXFatalException {
//	    logger.debug( "getList( state, smhSimHistoryDMO )" );
//	
//	    return smhAbstractDAC.getList( state, smhSimHistoryDMO );
//	  }

	  /**
	  * Creates the ActAccTypes object. As a side effect, following creation
	  * of a actAccTypes an audit object may be created.
	  * <p>
	  * <B>Possible application exceptions:</B>
	  * <dl><dd>
	  *     <li>The normal general errors:
	  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
	  * </dd></dl><br>
	  * @param smhSimHistoryDMO smhSimHistoryDMO object<br>
	  *   <dl><dd>
	  *   </dd></dl><br>
	  *
	  * @return populated smhSimHistoryDMO object.
	  *
	  * @throws EPPIXBusinessException
	  * @throws EPPIXUnexpectedException
	  * @throws EPPIXFatalException
	  */
	  public SmhSimHistoryDMO create( SmhSimHistoryDMO smhSimHistoryDMO )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "create( smhSimHistoryDMO )" );

	    thrower.ifParameterMissing( "smhSimHistoryDMO", smhSimHistoryDMO );

	    thrower.ifParameterMissing( "smhSimHistoryDMO.getSmhSimNo",
	      smhSimHistoryDMO.getSmhSimNo());

	    //
	    // Now create the actAccTypes
	    //
	    smhAbstractDAC.create( smhSimHistoryDMO );

	    return smhSimHistoryDMO;
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
	  * @param smhSimHistoryDMO smhSimHistoryDMO object<br>
	  *   <dl><dd>
	  *   </dd></dl><br>
	  *
	  * @return populated smhSimHistoryDMO object.
	  *
	  * @throws EPPIXBusinessException
	  * @throws EPPIXUnexpectedException
	  * @throws EPPIXFatalException
	  */
//	  public SmhSimHistoryDMO modify( SmhSimHistoryDMO aSmhSimHistoryDMO )
//	    throws EPPIXBusinessException, EPPIXUnexpectedException,
//	      EPPIXFatalException {
//	    logger.debug( "modify( asmhSimHistoryDMO )" );
//
//	    //
//	    // Check mandatory parameters (
//	    //
//	    // Note: attributes stereotyped <NotModifiable> are ignored
//	    //
//	    thrower.ifParameterMissing( "asmhSimHistoryDMO", aSmhSimHistoryDMO );
//
//	    thrower.ifParameterMissing( "aSmhSimHistoryDMO.actAccId",
//	      aSmhSimHistoryDMO.getActAccId(  ) ); // attribute
//
//	    thrower.ifParameterMissing( "aSmhSimHistoryDMO.actAccType",
//	      aSmhSimHistoryDMO.getActAccType(  ) ); // attribute
//
//	    thrower.ifParameterMissing( "aSmhSimHistoryDMO.actMnpType",
//	      aSmhSimHistoryDMO.getActMnpType(  ) ); // attribute
//
//	    thrower.ifParameterMissing( "aSmhSimHistoryDMO.actUseLe",
//	      aSmhSimHistoryDMO.getActUseLe(  ) ); // attribute
//
//	    thrower.ifParameterMissing( "aSmhSimHistoryDMO.actSegment",
//	      aSmhSimHistoryDMO.getActSegment(  ) ); // attribute
//
//	    SmhSimHistoryDMO updateSmhSimHistoryDMO = new SmhSimHistoryDMO(  );
//
//	    updateSmhSimHistoryDMO.setActAccId( aSmhSimHistoryDMO.getActAccId(  ) );
//
//	    updateSmhSimHistoryDMO = get( updateSmhSimHistoryDMO );
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
//	    updateSmhSimHistoryDMO.setActAccType( aSmhSimHistoryDMO.getActAccType(  ) );
//
//	    updateSmhSimHistoryDMO.setActMnpType( aSmhSimHistoryDMO.getActMnpType(  ) );
//
//	    updateSmhSimHistoryDMO.setActUseLe( aSmhSimHistoryDMO.getActUseLe(  ) );
//
//	    updateSmhSimHistoryDMO.setActSegment( aSmhSimHistoryDMO.getActSegment(  ) );
//
//	    //
//	    // Modify the smhSimHistoryDMO
//	    //
//	    smhAbstractDAC.modify( updateSmhSimHistoryDMO );
//
//	    // Create a new DMO, set keys, and fetch from the database...
//	    SmhSimHistoryDMO returnSmhSimHistoryDMO = new SmhSimHistoryDMO(  );
//
//	    returnSmhSimHistoryDMO.setActAccId( updateSmhSimHistoryDMO.getActAccId(  ) );
//
//	    returnSmhSimHistoryDMO = get( returnSmhSimHistoryDMO );
//
//	    return returnSmhSimHistoryDMO;
//	  }
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
	  * @param SmhSimHistoryDMO object<br>
	  * @param filter object<br>
	  *   <dl><dd>
	  *   </dd></dl><br>
	  *
	  * @return populated smhSimHistoryDMO object.
	  *
	  * @throws EPPIXBusinessException
	  * @throws EPPIXUnexpectedException
	  * @throws EPPIXFatalException
	  */
//	  public void modify( QueryFilter filter )
//	    throws EPPIXBusinessException, EPPIXUnexpectedException,
//	      EPPIXFatalException {
//	    logger.debug( "modify( filter )" );
//
//	    //
//	    // Modify the smhSimHistoryDMO
//	    //
//	    smhAbstractDAC.modify( filter );
//	  }
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
	   *  @param SmhSimHistoryDMO ActAccTypes object with embedded displayCode and
	   *        languageCode.
	   *
	   * @throws EPPIXBusinessException
	   * @throws EPPIXUnexpectedException
	   * @throws EPPIXFatalException
	   */
//	  public void delete( SmhSimHistoryDMO smhSimHistoryDMO )
//	    throws EPPIXBusinessException, EPPIXUnexpectedException,
//	      EPPIXFatalException {
//	    logger.debug( "delete( smhSimHistoryDMO )" );
//
//	    thrower.ifParameterMissing( "smhSimHistoryDMO", smhSimHistoryDMO );
//
//	    SmhSimHistoryDMO updateSmhSimHistoryDMO = null;
//
//	    updateSmhSimHistoryDMO = get( smhSimHistoryDMO );
//
//	    // delete self...
//	    smhAbstractDAC.delete( smhSimHistoryDMO );
//	  }
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
//	  public void delete( QueryFilter filter )
//	    throws EPPIXBusinessException, EPPIXUnexpectedException,
//	      EPPIXFatalException {
//	    logger.debug( "delete( filter )" );
//
//	    thrower.ifParameterMissing( "filter", filter );
//
//	    // delete...
//	    smhAbstractDAC.delete( filter );
//	  }
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
//	  public boolean exists( SmhSimHistoryDMO smhSimHistoryDMO )
//	    throws EPPIXBusinessException, EPPIXUnexpectedException,
//	      EPPIXFatalException {
//	    logger.debug( "exists(actAccTypes)" );
//
//	    thrower.ifParameterMissing( "smhSimHistoryDMO", smhSimHistoryDMO );
//
//	    thrower.ifParameterMissing( "smhSimHistoryDMO.actAccId",
//	      smhSimHistoryDMO.getActAccId(  ) );
//
//	    return smhAbstractDAC.exists( smhSimHistoryDMO );
//	  }
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

	    
	    if(smhAbstractDAC == null){
	    	logger.debug("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@  smhAbstractDAC is null");
	    }else{
	    	logger.debug("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@  smhAbstractDAC is not null");
	    	
	    }
	    return smhAbstractDAC.exists( filter );
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
	//  public DTOList<SmhSimHistoryDMO> getList(
//	    DTOListState state,
//	    QueryFilter  filter )
//	    throws EPPIXBusinessException, EPPIXUnexpectedException,
//	      EPPIXFatalException {
//	    logger.debug( "getList( state, filter )" );
	//
//	    return smhAbstractDAC.getList( state, filter );
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

	    return smhAbstractDAC.iterate( filter );
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
//	  public DAOIterator iterateWithLock( QueryFilter filter )
//	    throws EPPIXBusinessException, EPPIXUnexpectedException,
//	      EPPIXFatalException {
//	    logger.debug( "iterateWithLock( filter )" );
//
//	    return smhAbstractDAC.iterateWithLock( filter );
//	  }
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
	  public SmhSimHistoryDMO get( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "get( filter )" );

	    //
	    // Check mandatory parameters.
	    //
	    thrower.ifParameterMissing( "filter", filter );

	    //
	    // Attempt to get the SmhSimHistoryDMO
	    //
	    SmhSimHistoryDMO smhSimHistoryDMO = smhAbstractDAC.get( filter );

	    return smhSimHistoryDMO;
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

	    return smhAbstractDAC.max( filter );
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

	    return smhAbstractDAC.min( filter );
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

	    return Integer.valueOf(smhAbstractDAC.count( filter ));
	  }
	  //==================================================================================================

}
