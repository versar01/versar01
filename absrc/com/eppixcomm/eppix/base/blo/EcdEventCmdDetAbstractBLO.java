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
 * This table contains the details for all events, which need to be communicated to Network Elements.
 *
 * This abstract business logic class holds all the logic for the EcdEventCmdDet class.
 * It is extended by EcdEventCmdDet class which holds the additional logic that is required, if any.
 *
 * @author
 * @version $Revision: $
 *
 * @since $jdk$
 */
public abstract class EcdEventCmdDetAbstractBLO
  extends BaseBLO
  implements DTOActionTypes, BaseMessages {
  //~ Static variables/initializers //////////////////////////////////////////

  /** DOCUMENT ME! */
  static Thrower thrower = Thrower.getThrower( EcdEventCmdDet.class );
  /** DOCUMENT ME! */
  protected static final String ENTITY_ID = "ECDCD";

  //~ Instance variables /////////////////////////////////////////////////////

  /** Data Access Controller. */
  protected EcdEventCmdDetDAC ecdEventCmdDetDAC;
  /** DOCUMENT ME! */
  protected Logger logger = thrower.getLogger(  );

  //~ Methods ////////////////////////////////////////////////////////////////

  /** Invoked by the BLOBinder to get the DAC class for this BLO. */
  protected Class getDACClass(  ) {
    return EcdEventCmdDetDAC.class;
  }

  /** Invoked by the BLOBinder to provide this BLO with its DAC. */
  protected void setDAC( DAC dac ) {
    this.ecdEventCmdDetDAC = (EcdEventCmdDetDAC) dac;
  }

  /**
  * Retrieve a ecdEventCmdDet data model object from persistent storage. The
  * ecdEventCmdDetDMO passed in must contain a valid existing ecdEventCmdDetId.
  * Optionally, the return ecdEventCmdDetDMO may be include a flag that indicates if
  * the ecdEventCmdDet object is referenced elsewhere within the module, depending on the value
  * of the getIsUsed parameter. Finally, optionally, this method can return the set of audit
  * records for the ecdEventCmdDet object depending on the value of the getAudits parameter.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *   <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#ECDEVENTCMDDET_000}</li>
  *   <li> The normal general errors:
  *          {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>
  * </dd></dl><br>
  *
  * @param  ecdEventCmdDetDMO the ecdEventCmdDet object that must contain either the
  *         unique ecdEventCmdDetId or the displayCode/languageCode pair
  *
  * @return ecdEventCmdDetDMO the ecdEventCmdDet data model object
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXFatalException
  * @throws EPPIXUnexpectedException
  */
  public EcdEventCmdDetDMO get( EcdEventCmdDetDMO ecdEventCmdDetDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "get(ecdEventCmdDetDMO)" );

    //
    // Check mandatory parameters.
    //
    thrower.ifParameterMissing( "ecdEventCmdDetDMO", ecdEventCmdDetDMO );

    //
    // Each attribute that is part of the primary key is mandatory
    //
    thrower.ifParameterMissing( "ecdEventCmdDetDMO.ecdCommand",
      ecdEventCmdDetDMO.getEcdCommand(  ) );

    thrower.ifParameterMissing( "ecdEventCmdDetDMO.ecdSeqno",
      ecdEventCmdDetDMO.getEcdSeqno(  ) );

    //
    // Attempt to get the EcdEventCmdDetDMO
    //
    EcdEventCmdDetDMO returnEcdEventCmdDetDMO = ecdEventCmdDetDAC.get( ecdEventCmdDetDMO );

    //
    // Could not find the EcdEventCmdDetDMO
    //
    if ( returnEcdEventCmdDetDMO == null ) {
//      thrower.business( Base_ECDEVENTCMDDET_000,
//        new Object[] {
//          ecdEventCmdDetDMO.getEcdCommand(  ),
//          ecdEventCmdDetDMO.getEcdSeqno(  )
//        } );
    }

    //
    // Now, based on the values of the flags on this method signature, which in turn,
    // are based on this objects associations, get all associated, embedded objects
    //
    return returnEcdEventCmdDetDMO;
  }

  /**
   * Return a list of EcdEventCmdDet objects matching the passed in values. A
   * partial match is performed on the description argument and/or the ecdEventCmdDets
   * displayCode. If no values have been passed in, all EcdEventCmdDet objects are
   * retrieved. Note: if a language specific description does not exist, then
   * the EcdEventCmdDet is retrieved with the special 'NOCODE' description.
   *
   * @param state previous state of the list
   * @param ecdEventCmdDetDMO EcdEventCmdDetDMO object
   *
   * @return DTOList of EcdEventCmdDet objects
   *
   * @throws EPPIXUnexpectedException
   */
  public DTOList getList( 
    DTOListState      state,
    EcdEventCmdDetSortedDMO ecdEventCmdDetSortedDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "getList( state, ecdEventCmdDetDMO )" );

    return ecdEventCmdDetDAC.getList( state, ecdEventCmdDetSortedDMO );
  }

  /**
  * Creates the EcdEventCmdDet object. As a side effect, following creation
  * of a ecdEventCmdDet an audit object may be created.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param ecdEventCmdDetDMO ecdEventCmdDetDMO object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated ecdEventCmdDetDMO object.
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public EcdEventCmdDetDMO create( EcdEventCmdDetDMO ecdEventCmdDetDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "create( ecdEventCmdDetDMO )" );

    thrower.ifParameterMissing( "ecdEventCmdDetDMO", ecdEventCmdDetDMO );

    thrower.ifParameterMissing( "ecdEventCmdDetDMO.ecdCommand",
      ecdEventCmdDetDMO.getEcdCommand(  ) );

    thrower.ifParameterMissing( "ecdEventCmdDetDMO.ecdSeqno",
      ecdEventCmdDetDMO.getEcdSeqno(  ) );

    thrower.ifParameterMissing( "ecdEventCmdDetDMO.ecdDetType",
      ecdEventCmdDetDMO.getEcdDetType(  ) );

    thrower.ifParameterMissing( "ecdEventCmdDetDMO.ecdText",
      ecdEventCmdDetDMO.getEcdText(  ) );

    //
    // Check that this object does not already exist 
    //
    if ( exists( ecdEventCmdDetDMO ) ) {
//      thrower.business( Base_ECDEVENTCMDDET_001,
//        new Object[] {
//          ecdEventCmdDetDMO.getEcdCommand(  ),
//          ecdEventCmdDetDMO.getEcdSeqno(  )
//        } );
    }

    //
    // Now create the ecdEventCmdDet
    //
    ecdEventCmdDetDAC.create( ecdEventCmdDetDMO );

    return ecdEventCmdDetDMO;
  }

  /**
  * Modifies the EcdEventCmdDet object. On any modification, an audit object
  * is created.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#ECDEVENTCMDDET_002}</li>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param ecdEventCmdDetDMO ecdEventCmdDetDMO object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated ecdEventCmdDetDMO object.
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public EcdEventCmdDetDMO modify( EcdEventCmdDetDMO aEcdEventCmdDetDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "modify( aecdEventCmdDetDMO )" );

    //
    // Check mandatory parameters (
    //
    // Note: attributes stereotyped <NotModifiable> are ignored
    //
    thrower.ifParameterMissing( "aecdEventCmdDetDMO", aEcdEventCmdDetDMO );

    thrower.ifParameterMissing( "aEcdEventCmdDetDMO.ecdCommand",
      aEcdEventCmdDetDMO.getEcdCommand(  ) ); // attribute

    thrower.ifParameterMissing( "aEcdEventCmdDetDMO.ecdSeqno",
      aEcdEventCmdDetDMO.getEcdSeqno(  ) ); // attribute

    thrower.ifParameterMissing( "aEcdEventCmdDetDMO.ecdDetType",
      aEcdEventCmdDetDMO.getEcdDetType(  ) ); // attribute

    thrower.ifParameterMissing( "aEcdEventCmdDetDMO.ecdText",
      aEcdEventCmdDetDMO.getEcdText(  ) ); // attribute

    EcdEventCmdDetDMO updateEcdEventCmdDetDMO = new EcdEventCmdDetDMO(  );

    updateEcdEventCmdDetDMO.setEcdCommand( aEcdEventCmdDetDMO.getEcdCommand(  ) );

    updateEcdEventCmdDetDMO.setEcdSeqno( aEcdEventCmdDetDMO.getEcdSeqno(  ) );

    updateEcdEventCmdDetDMO = get( updateEcdEventCmdDetDMO );

    //
    // For each relationship to single objects (does not matter if they are Embedded or Flattened)
    // either associate to a pre-existing object, or create an object then associate to it
    //

    //
    // Copy the fields to be updated. We do not want to overwrite primary keys etc.
    // All attributes stereotyped as being <NotModifiable> are skipped
    //
    updateEcdEventCmdDetDMO.setEcdDetType( aEcdEventCmdDetDMO.getEcdDetType(  ) );

    updateEcdEventCmdDetDMO.setEcdText( aEcdEventCmdDetDMO.getEcdText(  ) );

    updateEcdEventCmdDetDMO.setEcdFlag( aEcdEventCmdDetDMO.getEcdFlag(  ) );

    //
    // Modify the ecdEventCmdDetDMO
    //
    ecdEventCmdDetDAC.modify( updateEcdEventCmdDetDMO );

    // Create a new DMO, set keys, and fetch from the database...
    EcdEventCmdDetDMO returnEcdEventCmdDetDMO = new EcdEventCmdDetDMO(  );

    returnEcdEventCmdDetDMO.setEcdCommand( updateEcdEventCmdDetDMO
      .getEcdCommand(  ) );

    returnEcdEventCmdDetDMO.setEcdSeqno( updateEcdEventCmdDetDMO.getEcdSeqno(  ) );

    returnEcdEventCmdDetDMO = get( returnEcdEventCmdDetDMO );

    return returnEcdEventCmdDetDMO;
  }

  /**
  * Modifies the EcdEventCmdDet object.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#ECEVENTCOMMAND_002}</li>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param EcdEventCmdDetDMO object<br>
  * @param filter object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated ecdEventCmdDetDMO object.
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
    // Modify the ecdEventCmdDetDMO
    //
    ecdEventCmdDetDAC.modify( filter );
  }

  /**
   * Deletes the EcdEventCmdDet object. On deletion, an audit object is created
   * <p>
   * <B>Possible application exceptions:</B>
   * <dl><dd>Base_ECDEVENTCMDDET_003
   *     <li>{@link #Base#ECDEVENTCMDDET_000} if the EcdEventCmdDet does not exist.</li>
   *     <li>{@link #Base#ECDEVENTCMDDET_003} if the EcdEventCmdDet is in use.</li>
   *     <li>The normal general errors:
   *          {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>
   * </dd></dl>
   *  @param EcdEventCmdDetDMO EcdEventCmdDet object with embedded displayCode and
   *        languageCode.
   *
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public void delete( EcdEventCmdDetDMO ecdEventCmdDetDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "delete( ecdEventCmdDetDMO )" );

    thrower.ifParameterMissing( "ecdEventCmdDetDMO", ecdEventCmdDetDMO );

    EcdEventCmdDetDMO updateEcdEventCmdDetDMO = null;

    updateEcdEventCmdDetDMO = get( ecdEventCmdDetDMO );

    // delete self...
    ecdEventCmdDetDAC.delete( ecdEventCmdDetDMO );
  }

  /**
   * Deletes the EcdEventCmdDet object.
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
    ecdEventCmdDetDAC.delete( filter );
  }

  /**
  * Indicates whether a EcdEventCmdDet exists in the database
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>
  * </dd></dl>
  *
  *
  * @return true if the EcdEventCmdDet exists in the database
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public boolean exists( EcdEventCmdDetDMO ecdEventCmdDetDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "exists(ecdEventCmdDet)" );

    thrower.ifParameterMissing( "ecdEventCmdDetDMO", ecdEventCmdDetDMO );

    thrower.ifParameterMissing( "ecdEventCmdDetDMO.ecdCommand",
      ecdEventCmdDetDMO.getEcdCommand(  ) );

    thrower.ifParameterMissing( "ecdEventCmdDetDMO.ecdSeqno",
      ecdEventCmdDetDMO.getEcdSeqno(  ) );

    return ecdEventCmdDetDAC.exists( ecdEventCmdDetDMO );
  }

  /**
   * Indicates whether a EcdEventCmdDet exists in the database
   * <p>
   * <B>Possible application exceptions:</B>
   * <dl><dd>
   *     <li>The normal general errors:
   *          {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>
   * </dd></dl>
   *
   *
   * @return true if the EcdEventCmdDet exists in the database
   *
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public boolean exists( QueryFilter filter )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "exists(filter)" );

    return ecdEventCmdDetDAC.exists( filter );
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

    return ecdEventCmdDetDAC.getList( state, filter );
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

    return ecdEventCmdDetDAC.iterate( filter );
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

    return ecdEventCmdDetDAC.iterateWithLock( filter );
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
  public EcdEventCmdDetDMO get( QueryFilter filter )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "get( filter )" );

    //
    // Check mandatory parameters.
    //
    thrower.ifParameterMissing( "filter", filter );

    //
    // Attempt to get the EcdEventCmdDetDMO
    //
    EcdEventCmdDetDMO ecdEventCmdDetDMO = ecdEventCmdDetDAC.get( filter );

    return ecdEventCmdDetDMO;
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

    return ecdEventCmdDetDAC.max( filter );
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

    return ecdEventCmdDetDAC.min( filter );
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

    // return Integer.valueOf(ecdEventCmdDetDAC.count( filter));
   // Narayana Sai - 25/07/2008 - Code should Compatible with 1.4 as per MTN Standards
    return new Integer(ecdEventCmdDetDAC.count( filter));
  }
}

