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

public class NeaNetErrActionAbstractBLO   extends BaseBLO
		implements DTOActionTypes, BaseMessages{
	
	  /** DOCUMENT ME! */
	  static Thrower thrower = Thrower.getThrower( NeaNetErrActionAbstractBLO.class );
	  /** DOCUMENT ME! */
	  protected static final String ENTITY_ID = "NEA";
	  
	  /** Data Access Controller. */
	  protected NeaNetErrActionAbstractDAC neaNetErrActionDAC;
	  /** DOCUMENT ME! */
	  protected Logger logger = thrower.getLogger(  );

	  //~ Methods ////////////////////////////////////////////////////////////////

	  /** Invoked by the BLOBinder to get the DAC class for this BLO. */
	  protected Class getDACClass(  ) {
	    return NeaNetErrActionAbstractDAC.class;
	  }	  
	  
	  /** Invoked by the BLOBinder to provide this BLO with its DAC. */
	  protected void setDAC( DAC dac ) {
	    this.neaNetErrActionDAC = (NeaNetErrActionAbstractDAC) dac;
	  }
	  
//	  public DTOList getList( 
//			    DTOListState    state,
//			    NeaNetErrActionDMO neaNetErrActionDMO )
//			    throws EPPIXBusinessException, EPPIXUnexpectedException,
//			      EPPIXFatalException {
//			    logger.debug( "getList( state, neaNetErrActionDMO )" );
//
//			    return neaNetErrActionDAC.getList( state, neaNetErrActionDMO );
//			  }

			  /**
			  * Creates the EqEventQueue object. As a side effect, following creation
			  * of a neaNetErrAction an audit object may be created.
			  * <p>
			  * <B>Possible application exceptions:</B>
			  * <dl><dd>
			  *     <li>The normal general errors:
			  *          {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>
			  * </dd></dl><br>
			  * @param neaNetErrActionDMO neaNetErrActionDMO object<br>
			  *   <dl><dd>
			  *   </dd></dl><br>
			  *
			  * @return populated neaNetErrActionDMO object.
			  *
			  * @throws EPPIXBusinessException
			  * @throws EPPIXUnexpectedException
			  * @throws EPPIXFatalException
			  */
			  public NeaNetErrActionDMO create( NeaNetErrActionDMO neaNetErrActionDMO )
			    throws EPPIXBusinessException, EPPIXUnexpectedException,
			      EPPIXFatalException {
			    logger.debug( "create( neaNetErrActionDMO )" );

			    thrower.ifParameterMissing( "neaNetErrActionDMO", neaNetErrActionDMO );

			    thrower.ifParameterMissing( "neaNetErrActionDMO.neaAction",
			      neaNetErrActionDMO.getNeaAction());

			    thrower.ifParameterMissing( "neaNetErrActionDMO.getNeaError",
			      neaNetErrActionDMO.getNeaError());

			    neaNetErrActionDAC.create( neaNetErrActionDMO );

			    return neaNetErrActionDMO;
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
			  * @param NeaNetErrActionDMO object<br>
			  * @param filter object<br>
			  *   <dl><dd>
			  *   </dd></dl><br>
			  *
			  * @return populated neaNetErrActionDMO object.
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
			    // Modify the neaNetErrActionDMO
			    //
			    neaNetErrActionDAC.modify( filter );
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
			    neaNetErrActionDAC.delete( filter );
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

			    return neaNetErrActionDAC.exists( filter );
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
//			    return neaNetErrActionDAC.getList( state, filter );
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

			    return neaNetErrActionDAC.iterate( filter );
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

			    return neaNetErrActionDAC.iterateWithLock( filter );
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
			  public NeaNetErrActionDMO get( QueryFilter filter )
			    throws EPPIXBusinessException, EPPIXUnexpectedException,
			      EPPIXFatalException {
			    logger.debug( "get( filter )" );

			    //
			    // Check mandatory parameters.
			    //
			    thrower.ifParameterMissing( "filter", filter );

			    //
			    // Attempt to get the NeaNetErrActionDMO
			    //
			    NeaNetErrActionDMO neaNetErrActionDMO = neaNetErrActionDAC.get( filter );

			    return neaNetErrActionDMO;
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

			    return neaNetErrActionDAC.max( filter );
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

			    return neaNetErrActionDAC.min( filter );
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

			    // return Integer.valueOf(neaNetErrActionDAC.count( filter ));
			    // Narayana Sai - 25/07/2008 - Code should Compatible with 1.4 as per MTN Standards
			      return new Integer(neaNetErrActionDAC.count( filter ));
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
			  public NeaNetErrActionDMO lock( NeaNetErrActionDMO neaNetErrActionDMO )
			    throws EPPIXSeriousException, EPPIXObjectBusyException {
			    logger.debug( "lock( neaNetErrActionDMO )" );
			    
			    thrower.ifParameterMissing( "neaNetErrActionDMO", neaNetErrActionDMO );
			    
			    return neaNetErrActionDAC.lock(neaNetErrActionDMO);
			  }  	  

}
