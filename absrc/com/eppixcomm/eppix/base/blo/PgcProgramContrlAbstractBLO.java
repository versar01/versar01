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
 * This table allows links to be set up between programs and other programs which it is dependent on.
 * <p>
 *   A program, such as the billing run, can then interrogate this table to retrieve a list of programs whose status it will
 *   need to check.
 * </p>
 *
 * This abstract business logic class holds all the logic for the PgcProgramContrl class.
 * It is extended by PgcProgramContrl class which holds the additional logic that is required, if any.
 *
 * @author
 * @version $Revision: $
 *
 * @since $jdk$
 */
public abstract class PgcProgramContrlAbstractBLO
  extends BaseBLO
  implements DTOActionTypes, BaseMessages {
  //~ Static variables/initializers //////////////////////////////////////////

  /** DOCUMENT ME! */
  static Thrower thrower = Thrower.getThrower( PgcProgramContrl.class );
  /** DOCUMENT ME! */
  protected static final String ENTITY_ID = "PGCC";

  //~ Instance variables /////////////////////////////////////////////////////

  /** DOCUMENT ME! */
  protected Logger logger = thrower.getLogger(  );

  /** Data Access Controller. */
  protected PgcProgramContrlDAC pgcProgramContrlDAC;

  //~ Methods ////////////////////////////////////////////////////////////////

  /** Invoked by the BLOBinder to get the DAC class for this BLO. */
  protected Class getDACClass(  ) {
    return PgcProgramContrlDAC.class;
  }

  /** Invoked by the BLOBinder to provide this BLO with its DAC. */
  protected void setDAC( DAC dac ) {
    this.pgcProgramContrlDAC = (PgcProgramContrlDAC) dac;
  }

  /**
  * Retrieve a pgcProgramContrl data model object from persistent storage. The
  * pgcProgramContrlDMO passed in must contain a valid existing pgcProgramContrlId.
  * Optionally, the return pgcProgramContrlDMO may be include a flag that indicates if
  * the pgcProgramContrl object is referenced elsewhere within the module, depending on the value
  * of the getIsUsed parameter. Finally, optionally, this method can return the set of audit
  * records for the pgcProgramContrl object depending on the value of the getAudits parameter.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *   <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#PGCPROGRAMCONTRL_000}</li>
  *   <li> The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl><br>
  *
  * @param  pgcProgramContrlDMO the pgcProgramContrl object that must contain either the
  *         unique pgcProgramContrlId or the displayCode/languageCode pair
  *
  * @return pgcProgramContrlDMO the pgcProgramContrl data model object
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXFatalException
  * @throws EPPIXUnexpectedException
  */
  public PgcProgramContrlDMO get( PgcProgramContrlDMO pgcProgramContrlDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "get(pgcProgramContrlDMO)" );

    //
    // Check mandatory parameters.
    //
    thrower.ifParameterMissing( "pgcProgramContrlDMO", pgcProgramContrlDMO );

    //
    // Each attribute that is part of the primary key is mandatory
    //
    thrower.ifParameterMissing( "pgcProgramContrlDMO.pgcProgramId",
      pgcProgramContrlDMO.getPgcProgramId(  ) );

    thrower.ifParameterMissing( "pgcProgramContrlDMO.pgcDependencyId",
      pgcProgramContrlDMO.getPgcDependencyId(  ) );

    thrower.ifParameterMissing( "pgcProgramContrlDMO.pgcCycle",
      pgcProgramContrlDMO.getPgcCycle(  ) );

    //
    // Attempt to get the PgcProgramContrlDMO
    //
    PgcProgramContrlDMO returnPgcProgramContrlDMO = pgcProgramContrlDAC.get( pgcProgramContrlDMO );

    //
    // Could not find the PgcProgramContrlDMO
    //
    if ( returnPgcProgramContrlDMO == null ) {
      thrower.business( Base_PGCPROGRAMCONTRL_000,
        new Object[] {
          pgcProgramContrlDMO.getPgcProgramId(  ),
          pgcProgramContrlDMO.getPgcDependencyId(  ),
          pgcProgramContrlDMO.getPgcCycle(  )
        } );
    }

    //
    // Now, based on the values of the flags on this method signature, which in turn,
    // are based on this objects associations, get all associated, embedded objects
    //
    return returnPgcProgramContrlDMO;
  }

  /**
   * Return a list of PgcProgramContrl objects matching the passed in values. A
   * partial match is performed on the description argument and/or the pgcProgramContrls
   * displayCode. If no values have been passed in, all PgcProgramContrl objects are
   * retrieved. Note: if a language specific description does not exist, then
   * the PgcProgramContrl is retrieved with the special 'NOCODE' description.
   *
   * @param state previous state of the list
   * @param pgcProgramContrlDMO PgcProgramContrlDMO object
   *
   * @return DTOList of PgcProgramContrl objects
   *
   * @throws EPPIXUnexpectedException
   */
  public DTOList getList( 
    DTOListState        state,
    PgcProgramContrlDMO pgcProgramContrlDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "getList( state, pgcProgramContrlDMO )" );

    return pgcProgramContrlDAC.getList( state, pgcProgramContrlDMO );
  }

  /**
  * Creates the PgcProgramContrl object. As a side effect, following creation
  * of a pgcProgramContrl an audit object may be created.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param pgcProgramContrlDMO pgcProgramContrlDMO object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated pgcProgramContrlDMO object.
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public PgcProgramContrlDMO create( PgcProgramContrlDMO pgcProgramContrlDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "create( pgcProgramContrlDMO )" );

    thrower.ifParameterMissing( "pgcProgramContrlDMO", pgcProgramContrlDMO );

    thrower.ifParameterMissing( "pgcProgramContrlDMO.pgcProgramId",
      pgcProgramContrlDMO.getPgcProgramId(  ) );

    thrower.ifParameterMissing( "pgcProgramContrlDMO.pgcDependencyId",
      pgcProgramContrlDMO.getPgcDependencyId(  ) );

    thrower.ifParameterMissing( "pgcProgramContrlDMO.pgcCycle",
      pgcProgramContrlDMO.getPgcCycle(  ) );

    thrower.ifParameterMissing( "pgcProgramContrlDMO.pgcResetFlag",
      pgcProgramContrlDMO.getPgcResetFlag(  ) );

    thrower.ifParameterMissing( "pgcProgramContrlDMO.pgcPriority",
      pgcProgramContrlDMO.getPgcPriority(  ) );

    //
    // Check that this object does not already exist 
    //
    if ( exists( pgcProgramContrlDMO ) ) {
      thrower.business( Base_PGCPROGRAMCONTRL_001,
        new Object[] {
          pgcProgramContrlDMO.getPgcProgramId(  ),
          pgcProgramContrlDMO.getPgcDependencyId(  ),
          pgcProgramContrlDMO.getPgcCycle(  )
        } );
    }

    //
    // Now create the pgcProgramContrl
    //
    pgcProgramContrlDAC.create( pgcProgramContrlDMO );

    return pgcProgramContrlDMO;
  }

  /**
  * Modifies the PgcProgramContrl object. On any modification, an audit object
  * is created.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#PGCPROGRAMCONTRL_002}</li>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param pgcProgramContrlDMO pgcProgramContrlDMO object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated pgcProgramContrlDMO object.
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public PgcProgramContrlDMO modify( 
    PgcProgramContrlDMO aPgcProgramContrlDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "modify( apgcProgramContrlDMO )" );

    //
    // Check mandatory parameters (
    //
    // Note: attributes stereotyped <NotModifiable> are ignored
    //
    thrower.ifParameterMissing( "apgcProgramContrlDMO", aPgcProgramContrlDMO );

    thrower.ifParameterMissing( "aPgcProgramContrlDMO.pgcProgramId",
      aPgcProgramContrlDMO.getPgcProgramId(  ) ); // attribute

    thrower.ifParameterMissing( "aPgcProgramContrlDMO.pgcDependencyId",
      aPgcProgramContrlDMO.getPgcDependencyId(  ) ); // attribute

    thrower.ifParameterMissing( "aPgcProgramContrlDMO.pgcCycle",
      aPgcProgramContrlDMO.getPgcCycle(  ) ); // attribute

    thrower.ifParameterMissing( "aPgcProgramContrlDMO.pgcResetFlag",
      aPgcProgramContrlDMO.getPgcResetFlag(  ) ); // attribute

    thrower.ifParameterMissing( "aPgcProgramContrlDMO.pgcPriority",
      aPgcProgramContrlDMO.getPgcPriority(  ) ); // attribute

    PgcProgramContrlDMO updatePgcProgramContrlDMO = new PgcProgramContrlDMO(  );

    updatePgcProgramContrlDMO.setPgcProgramId( aPgcProgramContrlDMO
      .getPgcProgramId(  ) );

    updatePgcProgramContrlDMO.setPgcDependencyId( aPgcProgramContrlDMO
      .getPgcDependencyId(  ) );

    updatePgcProgramContrlDMO.setPgcCycle( aPgcProgramContrlDMO.getPgcCycle(  ) );

    updatePgcProgramContrlDMO = get( updatePgcProgramContrlDMO );

    //
    // For each relationship to single objects (does not matter if they are Embedded or Flattened)
    // either associate to a pre-existing object, or create an object then associate to it
    //

    //
    // Copy the fields to be updated. We do not want to overwrite primary keys etc.
    // All attributes stereotyped as being <NotModifiable> are skipped
    //
    updatePgcProgramContrlDMO.setPgcResetFlag( aPgcProgramContrlDMO
      .getPgcResetFlag(  ) );

    updatePgcProgramContrlDMO.setPgcPriority( aPgcProgramContrlDMO
      .getPgcPriority(  ) );

    //
    // Modify the pgcProgramContrlDMO
    //
    pgcProgramContrlDAC.modify( updatePgcProgramContrlDMO );

    // Create a new DMO, set keys, and fetch from the database...
    PgcProgramContrlDMO returnPgcProgramContrlDMO = new PgcProgramContrlDMO(  );

    returnPgcProgramContrlDMO.setPgcProgramId( updatePgcProgramContrlDMO
      .getPgcProgramId(  ) );

    returnPgcProgramContrlDMO.setPgcDependencyId( updatePgcProgramContrlDMO
      .getPgcDependencyId(  ) );

    returnPgcProgramContrlDMO.setPgcCycle( updatePgcProgramContrlDMO
      .getPgcCycle(  ) );

    returnPgcProgramContrlDMO = get( returnPgcProgramContrlDMO );

    return returnPgcProgramContrlDMO;
  }

  /**
  * Modifies the PgcProgramContrl object.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#ECEVENTCOMMAND_002}</li>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param PgcProgramContrlDMO object<br>
  * @param filter object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated pgcProgramContrlDMO object.
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
    // Modify the pgcProgramContrlDMO
    //
    pgcProgramContrlDAC.modify( filter );
  }

  /**
   * Deletes the PgcProgramContrl object. On deletion, an audit object is created
   * <p>
   * <B>Possible application exceptions:</B>
   * <dl><dd>Base_PGCPROGRAMCONTRL_003
   *     <li>{@link #Base#PGCPROGRAMCONTRL_000} if the PgcProgramContrl does not exist.</li>
   *     <li>{@link #Base#PGCPROGRAMCONTRL_003} if the PgcProgramContrl is in use.</li>
   *     <li>The normal general errors:
   *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
   * </dd></dl>
   *  @param PgcProgramContrlDMO PgcProgramContrl object with embedded displayCode and
   *        languageCode.
   *
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public void delete( PgcProgramContrlDMO pgcProgramContrlDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "delete( pgcProgramContrlDMO )" );

    thrower.ifParameterMissing( "pgcProgramContrlDMO", pgcProgramContrlDMO );

    PgcProgramContrlDMO updatePgcProgramContrlDMO = null;

    updatePgcProgramContrlDMO = get( pgcProgramContrlDMO );

    // delete self...
    pgcProgramContrlDAC.delete( pgcProgramContrlDMO );
  }

  /**
   * Deletes the PgcProgramContrl object.
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
    pgcProgramContrlDAC.delete( filter );
  }

  /**
  * Indicates whether a PgcProgramContrl exists in the database
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl>
  *
  *
  * @return true if the PgcProgramContrl exists in the database
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public boolean exists( PgcProgramContrlDMO pgcProgramContrlDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "exists(pgcProgramContrl)" );

    thrower.ifParameterMissing( "pgcProgramContrlDMO", pgcProgramContrlDMO );

    thrower.ifParameterMissing( "pgcProgramContrlDMO.pgcProgramId",
      pgcProgramContrlDMO.getPgcProgramId(  ) );

    thrower.ifParameterMissing( "pgcProgramContrlDMO.pgcDependencyId",
      pgcProgramContrlDMO.getPgcDependencyId(  ) );

    thrower.ifParameterMissing( "pgcProgramContrlDMO.pgcCycle",
      pgcProgramContrlDMO.getPgcCycle(  ) );

    return pgcProgramContrlDAC.exists( pgcProgramContrlDMO );
  }

  /**
   * Indicates whether a PgcProgramContrl exists in the database
   * <p>
   * <B>Possible application exceptions:</B>
   * <dl><dd>
   *     <li>The normal general errors:
   *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
   * </dd></dl>
   *
   *
   * @return true if the PgcProgramContrl exists in the database
   *
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public boolean exists( QueryFilter filter )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "exists(filter)" );

    return pgcProgramContrlDAC.exists( filter );
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

    return pgcProgramContrlDAC.getList( state, filter );
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

    return pgcProgramContrlDAC.iterate( filter );
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

    return pgcProgramContrlDAC.iterateWithLock( filter );
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
  public PgcProgramContrlDMO get( QueryFilter filter )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "get( filter )" );

    //
    // Check mandatory parameters.
    //
    thrower.ifParameterMissing( "filter", filter );

    //
    // Attempt to get the PgcProgramContrlDMO
    //
    PgcProgramContrlDMO pgcProgramContrlDMO = pgcProgramContrlDAC.get( filter );

    return pgcProgramContrlDMO;
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

    return pgcProgramContrlDAC.max( filter );
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

    return pgcProgramContrlDAC.min( filter );
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

    return new Integer(pgcProgramContrlDAC.count( filter ));
  }
}
