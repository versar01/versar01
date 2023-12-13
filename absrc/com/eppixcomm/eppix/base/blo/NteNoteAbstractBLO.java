package com.eppixcomm.eppix.base.blo;

import org.apache.log4j.Logger;

import com.eppixcomm.eppix.common.data.DAC;
import com.eppixcomm.eppix.common.data.DAOIterator;
import com.eppixcomm.eppix.common.util.QueryFilter;
import com.eppixcomm.eppix.common.data.DTOActionTypes;
import com.eppixcomm.eppix.common.data.DTOList;
import com.eppixcomm.eppix.common.data.DTOListState;
import com.eppixcomm.eppix.base.error.EPPIXBusinessException;
import com.eppixcomm.eppix.base.error.EPPIXFatalException;
import com.eppixcomm.eppix.base.error.EPPIXObjectBusyException;
import com.eppixcomm.eppix.base.error.EPPIXSeriousException;
import com.eppixcomm.eppix.base.error.EPPIXUnexpectedException;
import com.eppixcomm.eppix.base.error.Thrower;

public class NteNoteAbstractBLO   extends BaseBLO
		implements DTOActionTypes, BaseMessages{
	
	  /** DOCUMENT ME! */
	  static Thrower thrower = Thrower.getThrower( NteNoteAbstractBLO.class );
	  /** DOCUMENT ME! */
	  protected static final String ENTITY_ID = "NTE";
	  
	  /** Data Access Controller. */
	  protected NteNoteDAC nteNoteDAC;
	  /** DOCUMENT ME! */
	  protected Logger logger = thrower.getLogger(  );

	  //~ Methods ////////////////////////////////////////////////////////////////

	  /** Invoked by the BLOBinder to get the DAC class for this BLO. */
	  protected Class getDACClass(  ) {
	    return NteNoteDAC.class;
	  }	  
	  
	  /** Invoked by the BLOBinder to provide this BLO with its DAC. */
	  protected void setDAC( DAC dac ) {
	    this.nteNoteDAC = (NteNoteDAC) dac;
	  }
	  
//	  public DTOList getList( 
//			    DTOListState    state,
//			    NteNoteDMO nteNoteDMO )
//			    throws EPPIXBusinessException, EPPIXUnexpectedException,
//			      EPPIXFatalException {
//			    logger.debug( "getList( state, nteNoteDMO )" );
//
//			    return nteNoteDAC.getList( state, nteNoteDMO );
//			  }

			  /**
			  * Creates the EqEventQueue object. As a side effect, following creation
			  * of a nteNote an audit object may be created.
			  * <p>
			  * <B>Possible application exceptions:</B>
			  * <dl><dd>
			  *     <li>The normal general errors:
			  *          {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>
			  * </dd></dl><br>
			  * @param nteNoteDMO nteNoteDMO object<br>
			  *   <dl><dd>
			  *   </dd></dl><br>
			  *
			  * @return populated nteNoteDMO object.
			  *
			  * @throws EPPIXBusinessException
			  * @throws EPPIXUnexpectedException
			  * @throws EPPIXFatalException
			  */
			  public NteNoteDMO create( NteNoteDMO nteNoteDMO )
			    throws EPPIXBusinessException, EPPIXUnexpectedException,
			      EPPIXFatalException {
			    logger.debug( "create( nteNoteDMO )" );

			    thrower.ifParameterMissing( "nteNoteDMO", nteNoteDMO );

			    /** TODO SJ:
			     * Check for not null values in table
			     */
//			    thrower.ifParameterMissing( "nteNoteDMO.nctCompressCode",
//			      nteNoteDMO.getNctCompressCode());
//
//			    thrower.ifParameterMissing( "nteNoteDMO.ntcCompressType",
//			      nteNoteDMO.getNteNote());

			    nteNoteDAC.create( nteNoteDMO );

			    return nteNoteDMO;
			  }

			  /**
			  * Modifies the EqEventQueue object.
			  * <p>
			  * <B>Possible application exceptions:</B>
			  * <dl><dd>
			  *     <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#ECEVENTCOMMAND_002}</li>
			  *     <li>The normal general errors:
			  *          {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>
			  * </dd></dl><br>
			  * @param NteNoteDMO object<br>
			  * @param filter object<br>
			  *   <dl><dd>
			  *   </dd></dl><br>
			  *
			  * @return populated nteNoteDMO object.
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
			    // Modify the nteNoteDMO
			    //
			    nteNoteDAC.modify( filter );
			  }

			  /**
			   * Deletes the EqEventQueue object.
			   * <p>
			   * <B>Possible application exceptions:</B>
			   * <dl><dd>
			   *     <li>The normal general errors:
			   *          {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>
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
			    nteNoteDAC.delete( filter );
			  }

			  /**
			   * Indicates whether a EqEventQueue exists in the database
			   * <p>
			   * <B>Possible application exceptions:</B>
			   * <dl><dd>
			   *     <li>The normal general errors:
			   *          {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>
			   * </dd></dl>
			   *
			   *
			   * @return true if the EqEventQueue exists in the database
			   *
			   * @throws EPPIXBusinessException
			   * @throws EPPIXUnexpectedException
			   * @throws EPPIXFatalException
			   */
			  public boolean exists( QueryFilter filter )
			    throws EPPIXBusinessException, EPPIXUnexpectedException,
			      EPPIXFatalException {
			    logger.debug( "exists(filter)" );

			    return nteNoteDAC.exists( filter );
			  }

			  //---------------------------------------------------------------------------------------------------------
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
//			  public DTOList getList( 
//			    DTOListState state,
//			    QueryFilter  filter )
//			    throws EPPIXBusinessException, EPPIXUnexpectedException,
//			      EPPIXFatalException {
//			    logger.debug( "getList( state, filter )" );
//
//			    return nteNoteDAC.getList( state, filter );
//			  }

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

			    return nteNoteDAC.iterate( filter );
			  }

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

			    return nteNoteDAC.iterateWithLock( filter );
			  }

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
			  public NteNoteDMO get( QueryFilter filter )
			    throws EPPIXBusinessException, EPPIXUnexpectedException,
			      EPPIXFatalException {
			    logger.debug( "get( filter )" );

			    //
			    // Check mandatory parameters.
			    //
			    thrower.ifParameterMissing( "filter", filter );

			    //
			    // Attempt to get the NteNoteDMO
			    //
			    NteNoteDMO nteNoteDMO = nteNoteDAC.get( filter );

			    return nteNoteDMO;
			  }

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

			    return nteNoteDAC.max( filter );
			  }

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

			    return nteNoteDAC.min( filter );
			  }

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

			    // return Integer.valueOf(nteNoteDAC.count( filter ));
			    // Narayana Sai - 25/07/2008 - Code should Compatible with 1.4 as per MTN Standards
			      return new Integer(nteNoteDAC.count( filter ));
			  }
			  
			  /**
			   * Locks and retrieves the EqEventQueue object from the database.
			   *
			   * @param aEqEventQueue EqEventQueue object
			   *
			   * @return a populated EqEventQueue object or null if not found.
			   *
			   * @throws EPPIXSeriousException
			   */
			  public NteNoteDMO lock( NteNoteDMO nteNoteDMO )
			    throws EPPIXSeriousException, EPPIXObjectBusyException {
			    logger.debug( "lock( nteNoteDMO )" );
			    
			    thrower.ifParameterMissing( "nteNoteDMO", nteNoteDMO );
			    
			    return nteNoteDAC.lock(nteNoteDMO);
			  }  	  

}
