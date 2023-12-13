package com.eppixcomm.eppix.base.blo;


import com.eppixcomm.eppix.common.data.DAC;
import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DAOIterator;
import com.eppixcomm.eppix.common.data.DMO;

//import java.util.*;
import com.eppixcomm.eppix.common.util.QueryFilter;
import com.eppixcomm.eppix.common.data.DTOActionTypes;
import com.eppixcomm.eppix.common.data.DTOList;
import com.eppixcomm.eppix.common.data.DTOListState;
import com.eppixcomm.eppix.base.error.EPPIXBusinessException;
import com.eppixcomm.eppix.base.error.EPPIXException;
import com.eppixcomm.eppix.base.error.EPPIXFatalException;
import com.eppixcomm.eppix.base.error.EPPIXObjectBusyException;
import com.eppixcomm.eppix.base.error.EPPIXObjectNotFoundException;
import com.eppixcomm.eppix.base.error.EPPIXSeriousException;
import com.eppixcomm.eppix.base.error.EPPIXUnexpectedException;
import com.eppixcomm.eppix.base.error.Thrower;
import com.eppixcomm.eppix.common.util.Date;
import com.eppixcomm.eppix.common.util.DateTime;
import com.eppixcomm.eppix.common.util.Time;

import org.apache.log4j.Logger;

import java.math.BigDecimal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * needs description
 *
 * This abstract business logic class holds all the logic for the EqEventQueue class.
 * It is extended by EqEventQueue class which holds the additional logic that is required, if any.
 *
 * @author
 * @version $Revision: $
 *
 * @since $jdk$
 */
public abstract class EqEventQueueAbstractBLO
  extends BaseBLO
  implements DTOActionTypes, BaseMessages {
  //~ Static variables/initializers //////////////////////////////////////////

  /** DOCUMENT ME! */
  static Thrower thrower = Thrower.getThrower( EqEventQueue.class );
  /** DOCUMENT ME! */
  protected static final String ENTITY_ID = "EQEQ";

  //~ Instance variables /////////////////////////////////////////////////////

  /** Data Access Controller. */
  protected EqEventQueueDAC eqEventQueueDAC;
  /** DOCUMENT ME! */
  protected Logger logger = thrower.getLogger(  );

  //~ Methods ////////////////////////////////////////////////////////////////

  /** Invoked by the BLOBinder to get the DAC class for this BLO. */
  protected Class getDACClass(  ) {
    return EqEventQueueDAC.class;
  }

  /** Invoked by the BLOBinder to provide this BLO with its DAC. */
  protected void setDAC( DAC dac ) {
    this.eqEventQueueDAC = (EqEventQueueDAC) dac;
  }

  /**
   * Return a list of EqEventQueue objects matching the passed in values. A
   * partial match is performed on the description argument and/or the eqEventQueues
   * displayCode. If no values have been passed in, all EqEventQueue objects are
   * retrieved. Note: if a language specific description does not exist, then
   * the EqEventQueue is retrieved with the special 'NOCODE' description.
   *
   * @param state previous state of the list
   * @param eqEventQueueDMO EqEventQueueDMO object
   *
   * @return DTOList of EqEventQueue objects
   *
   * @throws EPPIXUnexpectedException
   */
  public DTOList getList( 
    DTOListState    state,
    EqEventQueueDMO eqEventQueueDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "getList( state, eqEventQueueDMO )" );

    return eqEventQueueDAC.getList( state, eqEventQueueDMO );
  }

  /**
  * Creates the EqEventQueue object. As a side effect, following creation
  * of a eqEventQueue an audit object may be created.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param eqEventQueueDMO eqEventQueueDMO object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated eqEventQueueDMO object.
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public EqEventQueueDMO create( EqEventQueueDMO eqEventQueueDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "create( eqEventQueueDMO )" );

    thrower.ifParameterMissing( "eqEventQueueDMO", eqEventQueueDMO );

    thrower.ifParameterMissing( "eqEventQueueDMO.eqCommand",
      eqEventQueueDMO.getEqCommand(  ) );

    thrower.ifParameterMissing( "eqEventQueueDMO.eqMessage",
      eqEventQueueDMO.getEqMessage(  ) );

    thrower.ifParameterMissing( "eqEventQueueDMO.eqNetwork",
      eqEventQueueDMO.getEqNetwork(  ) );

    thrower.ifParameterMissing( "eqEventQueueDMO.eqPriority",
      eqEventQueueDMO.getEqPriority(  ) );

//    thrower.ifParameterMissing( "eqEventQueueDMO.eqTechnologyInd",
//      eqEventQueueDMO.getEqTechnologyInd(  ) );

    //
    // Now create the eqEventQueue
    //
    eqEventQueueDAC.create( eqEventQueueDMO );

    return eqEventQueueDMO;
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
  * @param EqEventQueueDMO object<br>
  * @param filter object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated eqEventQueueDMO object.
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
    // Modify the eqEventQueueDMO
    //
    eqEventQueueDAC.modify( filter );
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
    eqEventQueueDAC.delete( filter );
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

    return eqEventQueueDAC.exists( filter );
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
  public DTOList getList( 
    DTOListState state,
    QueryFilter  filter )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "getList( state, filter )" );

    return eqEventQueueDAC.getList( state, filter );
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
  public DAOIterator iterate( QueryFilter filter )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "iterate( filter )" );

    return eqEventQueueDAC.iterate( filter );
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

    return eqEventQueueDAC.iterateWithLock( filter );
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
  public EqEventQueueDMO get( QueryFilter filter )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "get( filter )" );

    //
    // Check mandatory parameters.
    //
    thrower.ifParameterMissing( "filter", filter );

    //
    // Attempt to get the EqEventQueueDMO
    //
    EqEventQueueDMO eqEventQueueDMO = eqEventQueueDAC.get( filter );

    return eqEventQueueDMO;
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

    return eqEventQueueDAC.max( filter );
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

    return eqEventQueueDAC.min( filter );
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

    // return Integer.valueOf(eqEventQueueDAC.count( filter ));
    // Narayana Sai - 25/07/2008 - Code should Compatible with 1.4 as per MTN Standards
      return new Integer(eqEventQueueDAC.count( filter ));
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
  public EqEventQueueDMO lock( EqEventQueueDMO eqEventQueueDMO )
    throws EPPIXSeriousException, EPPIXObjectBusyException {
    logger.debug( "lock( eqEventQueueDMO )" );
    
    thrower.ifParameterMissing( "eqEventQueueDMO", eqEventQueueDMO );
    
    return eqEventQueueDAC.lock(eqEventQueueDMO);
  }  
}

