package com.eppixcomm.eppix.base.blo;


import com.eppixcomm.eppix.common.data.DAC;
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
import com.eppixcomm.eppix.base.error.EPPIXObjectNotFoundException;
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
 * This table contains list of all events, which need to be communicated from EPPIX to Network Elements as well as events that have been communicated, but were not successfully processed by MaP or the Network Elements.
 * <p>
 *   
 
 Related tables:
 @ECD_EVENT_CMD_DET
 @EA_EVENT_AUDIT
 @EAD_EVENT_AUD_DET
 * </p>
 *
 * This abstract business logic class holds all the logic for the EcEventCommand class.
 * It is extended by EcEventCommand class which holds the additional logic that is required, if any.
 *
 * @author
 * @version $Revision: $
 *
 * @since $jdk$
 */
public abstract class EcEventCommandAbstractBLO
  extends BaseBLO
  implements DTOActionTypes, BaseMessages {
  //~ Static variables/initializers //////////////////////////////////////////

  /** DOCUMENT ME! */
  static Thrower thrower = Thrower.getThrower( EcEventCommand.class );
  /** DOCUMENT ME! */
  protected static final String ENTITY_ID = "ECEC";

  //~ Instance variables /////////////////////////////////////////////////////

  /** Data Access Controller. */
  protected EcEventCommandDAC ecEventCommandDAC;
  /** DOCUMENT ME! */
  protected Logger logger = thrower.getLogger(  );

  //~ Methods ////////////////////////////////////////////////////////////////

  /** Invoked by the BLOBinder to get the DAC class for this BLO. */
  protected Class getDACClass(  ) {
    return EcEventCommandDAC.class;
  }

  /** Invoked by the BLOBinder to provide this BLO with its DAC. */
  protected void setDAC( DAC dac ) {
    this.ecEventCommandDAC = (EcEventCommandDAC) dac;
  }

  /**
  * Retrieve a ecEventCommand data model object from persistent storage. The
  * ecEventCommandDMO passed in must contain a valid existing ecEventCommandId.
  * Optionally, the return ecEventCommandDMO may be include a flag that indicates if
  * the ecEventCommand object is referenced elsewhere within the module, depending on the value
  * of the getIsUsed parameter. Finally, optionally, this method can return the set of audit
  * records for the ecEventCommand object depending on the value of the getAudits parameter.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *   <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#ECEVENTCOMMAND_000}</li>
  *   <li> The normal general errors:
  *          {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>
  * </dd></dl><br>
  *
  * @param  ecEventCommandDMO the ecEventCommand object that must contain either the
  *         unique ecEventCommandId or the displayCode/languageCode pair
  *
  * @return ecEventCommandDMO the ecEventCommand data model object
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXFatalException
  * @throws EPPIXUnexpectedException
  */
  public EcEventCommandDMO get( EcEventCommandDMO ecEventCommandDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "get(ecEventCommandDMO)" );

    //
    // Check mandatory parameters.
    //
    thrower.ifParameterMissing( "ecEventCommandDMO", ecEventCommandDMO );

    //
    // Each attribute that is part of the primary key is mandatory
    //
    thrower.ifParameterMissing( "ecEventCommandDMO.ecCommand",
      ecEventCommandDMO.getEcCommand(  ) );

    //
    // Attempt to get the EcEventCommandDMO
    //
    EcEventCommandDMO returnEcEventCommandDMO = ecEventCommandDAC.get( ecEventCommandDMO );

    //
    // Could not find the EcEventCommandDMO
    //
    /**
     * TODO SJ Fixme
     */
    if ( returnEcEventCommandDMO == null ) {
//      thrower.business( Base_ECEVENTCOMMAND_000,
//        new Object[] { ecEventCommandDMO.getEcCommand(  ) } );
    }

    //
    // Now, based on the values of the flags on this method signature, which in turn,
    // are based on this objects associations, get all associated, embedded objects
    //
    return returnEcEventCommandDMO;
  }

  /**
   * Return a list of EcEventCommand objects matching the passed in values. A
   * partial match is performed on the description argument and/or the ecEventCommands
   * displayCode. If no values have been passed in, all EcEventCommand objects are
   * retrieved. Note: if a language specific description does not exist, then
   * the EcEventCommand is retrieved with the special 'NOCODE' description.
   *
   * @param state previous state of the list
   * @param ecEventCommandDMO EcEventCommandDMO object
   *
   * @return DTOList of EcEventCommand objects
   *
   * @throws EPPIXUnexpectedException
   */
  public DTOList getList( 
    DTOListState      state,
    EcEventCommandDMO ecEventCommandDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "getList( state, ecEventCommandDMO )" );

    return ecEventCommandDAC.getList( state, ecEventCommandDMO );
  }

  /**
  * Creates the EcEventCommand object. As a side effect, following creation
  * of a ecEventCommand an audit object may be created.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param ecEventCommandDMO ecEventCommandDMO object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated ecEventCommandDMO object.
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public EcEventCommandDMO create( EcEventCommandDMO ecEventCommandDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "create( ecEventCommandDMO )" );

    thrower.ifParameterMissing( "ecEventCommandDMO", ecEventCommandDMO );

    thrower.ifParameterMissing( "ecEventCommandDMO.ecCommand",
      ecEventCommandDMO.getEcCommand(  ) );

//    thrower.ifParameterMissing( "ecEventCommandDMO.ecTechnologyInd",
//      ecEventCommandDMO.getEcTechnologyInd(  ) );

    //
    // Check that this object does not already exist 
    //
    /**
     */
    if ( exists( ecEventCommandDMO ) ) {
//      thrower.business( Base_ECEVENTCOMMAND_001,
//        new Object[] { ecEventCommandDMO.getEcCommand(  ) } );
    }

    //
    // Now create the ecEventCommand
    //
    ecEventCommandDAC.create( ecEventCommandDMO );

    return ecEventCommandDMO;
  }

  /**
  * Modifies the EcEventCommand object. On any modification, an audit object
  * is created.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#ECEVENTCOMMAND_002}</li>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param ecEventCommandDMO ecEventCommandDMO object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated ecEventCommandDMO object.
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public EcEventCommandDMO modify( EcEventCommandDMO aEcEventCommandDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "modify( aecEventCommandDMO )" );

    //
    // Check mandatory parameters (
    //
    // Note: attributes stereotyped <NotModifiable> are ignored
    //
    thrower.ifParameterMissing( "aecEventCommandDMO", aEcEventCommandDMO );

    thrower.ifParameterMissing( "aEcEventCommandDMO.ecCommand",
      aEcEventCommandDMO.getEcCommand(  ) ); // attribute

//    thrower.ifParameterMissing( "aEcEventCommandDMO.ecTechnologyInd",
//      aEcEventCommandDMO.getEcTechnologyInd(  ) ); // attribute

    EcEventCommandDMO updateEcEventCommandDMO = new EcEventCommandDMO(  );

    updateEcEventCommandDMO.setEcCommand( aEcEventCommandDMO.getEcCommand(  ) );

    updateEcEventCommandDMO = get( updateEcEventCommandDMO );

    //
    // For each relationship to single objects (does not matter if they are Embedded or Flattened)
    // either associate to a pre-existing object, or create an object then associate to it
    //

    //
    // Copy the fields to be updated. We do not want to overwrite primary keys etc.
    // All attributes stereotyped as being <NotModifiable> are skipped
    //
    updateEcEventCommandDMO.setEcStatus( aEcEventCommandDMO.getEcStatus(  ) );

    updateEcEventCommandDMO.setEcDate( aEcEventCommandDMO.getEcDate(  ) );

    updateEcEventCommandDMO.setEcTime( aEcEventCommandDMO.getEcTime(  ) );

    updateEcEventCommandDMO.setEcMessage( aEcEventCommandDMO.getEcMessage(  ) );

    updateEcEventCommandDMO.setEcNetwork( aEcEventCommandDMO.getEcNetwork(  ) );

    updateEcEventCommandDMO.setEcType( aEcEventCommandDMO.getEcType(  ) );

    updateEcEventCommandDMO.setEcPriority( aEcEventCommandDMO.getEcPriority(  ) );

    updateEcEventCommandDMO.setEcSendSeq( aEcEventCommandDMO.getEcSendSeq(  ) );

    updateEcEventCommandDMO.setEcSubscriberId( aEcEventCommandDMO
      .getEcSubscriberId(  ) );

    updateEcEventCommandDMO.setEcMsisdn(aEcEventCommandDMO
      .getEcMsisdn());

    updateEcEventCommandDMO.setEcSim( aEcEventCommandDMO.getEcSim(  ) );

    updateEcEventCommandDMO.setEcOperator( aEcEventCommandDMO.getEcOperator(  ) );

    updateEcEventCommandDMO.setEcTty( aEcEventCommandDMO.getEcTty(  ) );

//    updateEcEventCommandDMO.setEcTechnologyInd( aEcEventCommandDMO
//      .getEcTechnologyInd(  ) );

    //
    // Modify the ecEventCommandDMO
    //
    ecEventCommandDAC.modify( updateEcEventCommandDMO );

    // Create a new DMO, set keys, and fetch from the database...
    EcEventCommandDMO returnEcEventCommandDMO = new EcEventCommandDMO(  );

    returnEcEventCommandDMO.setEcCommand( updateEcEventCommandDMO.getEcCommand(  ) );

    returnEcEventCommandDMO = get( returnEcEventCommandDMO );

    return returnEcEventCommandDMO;
  }

  /**
  * Modifies the EcEventCommand object.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#ECEVENTCOMMAND_002}</li>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param EcEventCommandDMO object<br>
  * @param filter object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated ecEventCommandDMO object.
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
    // Modify the ecEventCommandDMO
    //
    ecEventCommandDAC.modify( filter );
  }

  /**
   * Deletes the EcEventCommand object. On deletion, an audit object is created
   * <p>
   * <B>Possible application exceptions:</B>
   * <dl><dd>Base_ECEVENTCOMMAND_003
   *     <li>{@link #Base#ECEVENTCOMMAND_000} if the EcEventCommand does not exist.</li>
   *     <li>{@link #Base#ECEVENTCOMMAND_003} if the EcEventCommand is in use.</li>
   *     <li>The normal general errors:
   *          {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>
   * </dd></dl>
   *  @param EcEventCommandDMO EcEventCommand object with embedded displayCode and
   *        languageCode.
   *
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public void delete( EcEventCommandDMO ecEventCommandDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "delete( ecEventCommandDMO )" );

    thrower.ifParameterMissing( "ecEventCommandDMO", ecEventCommandDMO );

    EcEventCommandDMO updateEcEventCommandDMO = null;

    updateEcEventCommandDMO = get( ecEventCommandDMO );

    // delete self...
    ecEventCommandDAC.delete( ecEventCommandDMO );
  }

  /**
   * Deletes the EcEventCommand object.
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
    ecEventCommandDAC.delete( filter );
  }

  /**
  * Indicates whether a EcEventCommand exists in the database
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>
  * </dd></dl>
  *
  *
  * @return true if the EcEventCommand exists in the database
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public boolean exists( EcEventCommandDMO ecEventCommandDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "exists(ecEventCommand)" );

    thrower.ifParameterMissing( "ecEventCommandDMO", ecEventCommandDMO );

    thrower.ifParameterMissing( "ecEventCommandDMO.ecCommand",
      ecEventCommandDMO.getEcCommand(  ) );

    return ecEventCommandDAC.exists( ecEventCommandDMO );
  }

  /**
   * Indicates whether a EcEventCommand exists in the database
   * <p>
   * <B>Possible application exceptions:</B>
   * <dl><dd>
   *     <li>The normal general errors:
   *          {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>
   * </dd></dl>
   *
   *
   * @return true if the EcEventCommand exists in the database
   *
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public boolean exists( QueryFilter filter )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "exists(filter)" );

    return ecEventCommandDAC.exists( filter );
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

    return ecEventCommandDAC.getList( state, filter );
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

    return ecEventCommandDAC.iterate( filter );
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

    return ecEventCommandDAC.iterateWithLock( filter );
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
  public EcEventCommandDMO get( QueryFilter filter )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "get( filter )" );

    //
    // Check mandatory parameters.
    //
    thrower.ifParameterMissing( "filter", filter );

    //
    // Attempt to get the EcEventCommandDMO
    //
    EcEventCommandDMO ecEventCommandDMO = ecEventCommandDAC.get( filter );

    return ecEventCommandDMO;
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

    return ecEventCommandDAC.max( filter );
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

    return ecEventCommandDAC.min( filter );
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

    //return Integer.valueOf(ecEventCommandDAC.count(filter));
    // Narayana Sai - 25/07/2008 - Code should Compatible with 1.4 as per MTN Standards
      return new Integer(ecEventCommandDAC.count(filter));
  }
}

