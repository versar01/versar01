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
 * This is used in conjunction with the pgc_program_contrl table to determine the current status of a program.
 *
 * This abstract business logic class holds all the logic for the PgsProgramStatus class.
 * It is extended by PgsProgramStatus class which holds the additional logic that is required, if any.
 *
 * @author
 * @version $Revision: $
 *
 * @since $jdk$
 */
public abstract class PgsProgramStatusAbstractBLO
  extends BaseBLO
  implements DTOActionTypes, BaseMessages {
  //~ Static variables/initializers //////////////////////////////////////////

  /** DOCUMENT ME! */
  static Thrower thrower = Thrower.getThrower( PgsProgramStatus.class );
  /** DOCUMENT ME! */
  protected static final String ENTITY_ID = "PGSS";

  //~ Instance variables /////////////////////////////////////////////////////

  /** DOCUMENT ME! */
  protected Logger logger = thrower.getLogger(  );

  /** Data Access Controller. */
  protected PgsProgramStatusDAC pgsProgramStatusDAC;

  //~ Methods ////////////////////////////////////////////////////////////////

  /** Invoked by the BLOBinder to get the DAC class for this BLO. */
  protected Class getDACClass(  ) {
    return PgsProgramStatusDAC.class;
  }

  /** Invoked by the BLOBinder to provide this BLO with its DAC. */
  protected void setDAC( DAC dac ) {
    this.pgsProgramStatusDAC = (PgsProgramStatusDAC) dac;
  }

  /**
  * Retrieve a pgsProgramStatus data model object from persistent storage. The
  * pgsProgramStatusDMO passed in must contain a valid existing pgsProgramStatusId.
  * Optionally, the return pgsProgramStatusDMO may be include a flag that indicates if
  * the pgsProgramStatus object is referenced elsewhere within the module, depending on the value
  * of the getIsUsed parameter. Finally, optionally, this method can return the set of audit
  * records for the pgsProgramStatus object depending on the value of the getAudits parameter.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *   <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#PGSPROGRAMSTATUS_000}</li>
  *   <li> The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl><br>
  *
  * @param  pgsProgramStatusDMO the pgsProgramStatus object that must contain either the
  *         unique pgsProgramStatusId or the displayCode/languageCode pair
  *
  * @return pgsProgramStatusDMO the pgsProgramStatus data model object
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXFatalException
  * @throws EPPIXUnexpectedException
  */
  public PgsProgramStatusDMO get( PgsProgramStatusDMO pgsProgramStatusDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "get(pgsProgramStatusDMO)" );

    //
    // Check mandatory parameters.
    //
    thrower.ifParameterMissing( "pgsProgramStatusDMO", pgsProgramStatusDMO );

    //
    // Each attribute that is part of the primary key is mandatory
    //
    thrower.ifParameterMissing( "pgsProgramStatusDMO.pgsProgramId",
      pgsProgramStatusDMO.getPgsProgramId(  ) );

    thrower.ifParameterMissing( "pgsProgramStatusDMO.pgsCycle",
      pgsProgramStatusDMO.getPgsCycle(  ) );

    //
    // Attempt to get the PgsProgramStatusDMO
    //
    PgsProgramStatusDMO returnPgsProgramStatusDMO = pgsProgramStatusDAC.get( pgsProgramStatusDMO );

    //
    // Could not find the PgsProgramStatusDMO
    //
    if ( returnPgsProgramStatusDMO == null ) {
      thrower.business( Base_PGSPROGRAMSTATUS_000,
        new Object[] {
          pgsProgramStatusDMO.getPgsProgramId(  ),
          pgsProgramStatusDMO.getPgsCycle(  )
        } );
    }

    //
    // Now, based on the values of the flags on this method signature, which in turn,
    // are based on this objects associations, get all associated, embedded objects
    //
    return returnPgsProgramStatusDMO;
  }

  /**
   * Return a list of PgsProgramStatus objects matching the passed in values. A
   * partial match is performed on the description argument and/or the pgsProgramStatuss
   * displayCode. If no values have been passed in, all PgsProgramStatus objects are
   * retrieved. Note: if a language specific description does not exist, then
   * the PgsProgramStatus is retrieved with the special 'NOCODE' description.
   *
   * @param state previous state of the list
   * @param pgsProgramStatusDMO PgsProgramStatusDMO object
   *
   * @return DTOList of PgsProgramStatus objects
   *
   * @throws EPPIXUnexpectedException
   */
  public DTOList getList( 
    DTOListState        state,
    PgsProgramStatusDMO pgsProgramStatusDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "getList( state, pgsProgramStatusDMO )" );

    return pgsProgramStatusDAC.getList( state, pgsProgramStatusDMO );
  }

  /**
  * Creates the PgsProgramStatus object. As a side effect, following creation
  * of a pgsProgramStatus an audit object may be created.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param pgsProgramStatusDMO pgsProgramStatusDMO object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated pgsProgramStatusDMO object.
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public PgsProgramStatusDMO create( PgsProgramStatusDMO pgsProgramStatusDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "create( pgsProgramStatusDMO )" );

    thrower.ifParameterMissing( "pgsProgramStatusDMO", pgsProgramStatusDMO );

    thrower.ifParameterMissing( "pgsProgramStatusDMO.pgsProgramId",
      pgsProgramStatusDMO.getPgsProgramId(  ) );

    thrower.ifParameterMissing( "pgsProgramStatusDMO.pgsCycle",
      pgsProgramStatusDMO.getPgsCycle(  ) );

    thrower.ifParameterMissing( "pgsProgramStatusDMO.pgsStatus",
      pgsProgramStatusDMO.getPgsStatus(  ) );

    //
    // Check that this object does not already exist 
    //
    if ( exists( pgsProgramStatusDMO ) ) {
      thrower.business( Base_PGSPROGRAMSTATUS_001,
        new Object[] {
          pgsProgramStatusDMO.getPgsProgramId(  ),
          pgsProgramStatusDMO.getPgsCycle(  )
        } );
    }

    //
    // Now create the pgsProgramStatus
    //
    pgsProgramStatusDAC.create( pgsProgramStatusDMO );

    return pgsProgramStatusDMO;
  }

  /**
  * Modifies the PgsProgramStatus object. On any modification, an audit object
  * is created.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#PGSPROGRAMSTATUS_002}</li>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param pgsProgramStatusDMO pgsProgramStatusDMO object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated pgsProgramStatusDMO object.
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public PgsProgramStatusDMO modify( 
    PgsProgramStatusDMO aPgsProgramStatusDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "modify( apgsProgramStatusDMO )" );

    //
    // Check mandatory parameters (
    //
    // Note: attributes stereotyped <NotModifiable> are ignored
    //
    thrower.ifParameterMissing( "apgsProgramStatusDMO", aPgsProgramStatusDMO );

    thrower.ifParameterMissing( "aPgsProgramStatusDMO.pgsProgramId",
      aPgsProgramStatusDMO.getPgsProgramId(  ) ); // attribute

    thrower.ifParameterMissing( "aPgsProgramStatusDMO.pgsCycle",
      aPgsProgramStatusDMO.getPgsCycle(  ) ); // attribute

    thrower.ifParameterMissing( "aPgsProgramStatusDMO.pgsStatus",
      aPgsProgramStatusDMO.getPgsStatus(  ) ); // attribute

    PgsProgramStatusDMO updatePgsProgramStatusDMO = new PgsProgramStatusDMO(  );

    updatePgsProgramStatusDMO.setPgsProgramId( aPgsProgramStatusDMO
      .getPgsProgramId(  ) );

    updatePgsProgramStatusDMO.setPgsCycle( aPgsProgramStatusDMO.getPgsCycle(  ) );

    updatePgsProgramStatusDMO = get( updatePgsProgramStatusDMO );

    //
    // For each relationship to single objects (does not matter if they are Embedded or Flattened)
    // either associate to a pre-existing object, or create an object then associate to it
    //

    //
    // Copy the fields to be updated. We do not want to overwrite primary keys etc.
    // All attributes stereotyped as being <NotModifiable> are skipped
    //
    updatePgsProgramStatusDMO.setPgsDescription( aPgsProgramStatusDMO
      .getPgsDescription(  ) );

    updatePgsProgramStatusDMO.setPgsStatus( aPgsProgramStatusDMO.getPgsStatus(  ) );

    updatePgsProgramStatusDMO.setPgsStatusValue( aPgsProgramStatusDMO
      .getPgsStatusValue(  ) );

    updatePgsProgramStatusDMO.setPgsStatusClass( aPgsProgramStatusDMO
      .getPgsStatusClass(  ) );

    updatePgsProgramStatusDMO.setPgsIsamValue( aPgsProgramStatusDMO
      .getPgsIsamValue(  ) );

    updatePgsProgramStatusDMO.setPgsErrorMess( aPgsProgramStatusDMO
      .getPgsErrorMess(  ) );

    //
    // Modify the pgsProgramStatusDMO
    //
    pgsProgramStatusDAC.modify( updatePgsProgramStatusDMO );

    // Create a new DMO, set keys, and fetch from the database...
    PgsProgramStatusDMO returnPgsProgramStatusDMO = new PgsProgramStatusDMO(  );

    returnPgsProgramStatusDMO.setPgsProgramId( updatePgsProgramStatusDMO
      .getPgsProgramId(  ) );

    returnPgsProgramStatusDMO.setPgsCycle( updatePgsProgramStatusDMO
      .getPgsCycle(  ) );

    returnPgsProgramStatusDMO = get( returnPgsProgramStatusDMO );

    return returnPgsProgramStatusDMO;
  }

  /**
  * Modifies the PgsProgramStatus object.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#ECEVENTCOMMAND_002}</li>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param PgsProgramStatusDMO object<br>
  * @param filter object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated pgsProgramStatusDMO object.
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
    // Modify the pgsProgramStatusDMO
    //
    pgsProgramStatusDAC.modify( filter );
  }

  /**
   * Deletes the PgsProgramStatus object. On deletion, an audit object is created
   * <p>
   * <B>Possible application exceptions:</B>
   * <dl><dd>Base_PGSPROGRAMSTATUS_003
   *     <li>{@link #Base#PGSPROGRAMSTATUS_000} if the PgsProgramStatus does not exist.</li>
   *     <li>{@link #Base#PGSPROGRAMSTATUS_003} if the PgsProgramStatus is in use.</li>
   *     <li>The normal general errors:
   *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
   * </dd></dl>
   *  @param PgsProgramStatusDMO PgsProgramStatus object with embedded displayCode and
   *        languageCode.
   *
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public void delete( PgsProgramStatusDMO pgsProgramStatusDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "delete( pgsProgramStatusDMO )" );

    thrower.ifParameterMissing( "pgsProgramStatusDMO", pgsProgramStatusDMO );

    PgsProgramStatusDMO updatePgsProgramStatusDMO = null;

    updatePgsProgramStatusDMO = get( pgsProgramStatusDMO );

    // delete self...
    pgsProgramStatusDAC.delete( pgsProgramStatusDMO );
  }

  /**
   * Deletes the PgsProgramStatus object.
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
    pgsProgramStatusDAC.delete( filter );
  }

  /**
  * Indicates whether a PgsProgramStatus exists in the database
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl>
  *
  *
  * @return true if the PgsProgramStatus exists in the database
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public boolean exists( PgsProgramStatusDMO pgsProgramStatusDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "exists(pgsProgramStatus)" );

    thrower.ifParameterMissing( "pgsProgramStatusDMO", pgsProgramStatusDMO );

    thrower.ifParameterMissing( "pgsProgramStatusDMO.pgsProgramId",
      pgsProgramStatusDMO.getPgsProgramId(  ) );

    thrower.ifParameterMissing( "pgsProgramStatusDMO.pgsCycle",
      pgsProgramStatusDMO.getPgsCycle(  ) );

    return pgsProgramStatusDAC.exists( pgsProgramStatusDMO );
  }

  /**
   * Indicates whether a PgsProgramStatus exists in the database
   * <p>
   * <B>Possible application exceptions:</B>
   * <dl><dd>
   *     <li>The normal general errors:
   *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
   * </dd></dl>
   *
   *
   * @return true if the PgsProgramStatus exists in the database
   *
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public boolean exists( QueryFilter filter )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "exists(filter)" );

    return pgsProgramStatusDAC.exists( filter );
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

    return pgsProgramStatusDAC.getList( state, filter );
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

    return pgsProgramStatusDAC.iterate( filter );
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
  public DAOIterator iterateWithLock( 
    QueryFilter filter )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "iterateWithLock( filter )" );

    return pgsProgramStatusDAC.iterateWithLock( filter );
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
  public PgsProgramStatusDMO get( QueryFilter filter )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "get( filter )" );

    //
    // Check mandatory parameters.
    //
    thrower.ifParameterMissing( "filter", filter );

    //
    // Attempt to get the PgsProgramStatusDMO
    //
    PgsProgramStatusDMO pgsProgramStatusDMO = pgsProgramStatusDAC.get( filter );

    return pgsProgramStatusDMO;
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

    return pgsProgramStatusDAC.max( filter );
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

    return pgsProgramStatusDAC.min( filter );
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

    return new Integer(pgsProgramStatusDAC.count( filter ));
  }
}
