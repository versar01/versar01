/*============================================================================================= *
 *
 * (c) 2007 Copyright Eppixcomm.
 * All Rights Reserved
 * Legal Information goes here.
 *
 *============================================================================================= */

/**----------------------------------------------------------------------------------------------
 *
 * Version control details:
 *    @version $Revision: $
 *    @author  $Author: $
 *----------------------------------------------------------------------------------------------*/
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
 * null
 *
 * This abstract business logic class holds all the logic for the CnyCurrency class.
 * It is extended by CnyCurrency class which holds the additional logic that is required, if any.
 *
 * @author
 * @version $Revision: $
 *
 * @since $jdk$
 */
public abstract class CnyCurrencyAbstractBLO
  extends BaseBLO
  implements DTOActionTypes, BaseMessages {
  //~ Static variables/initializers //////////////////////////////////////////

  /** DOCUMENT ME! */
  static Thrower thrower = Thrower.getThrower( CnyCurrency.class );
  /** DOCUMENT ME! */
  protected static final String ENTITY_ID = "CNY";

  //~ Instance variables /////////////////////////////////////////////////////

  /** Data Access Controller. */
  protected CnyCurrencyDAC cnyCurrencyDAC;
  /** DOCUMENT ME! */
  protected Logger logger = thrower.getLogger(  );

  //~ Methods ////////////////////////////////////////////////////////////////

  /** Invoked by the BLOBinder to get the DAC class for this BLO. */
  protected Class getDACClass(  ) {
    return CnyCurrencyDAC.class;
  }

  /** Invoked by the BLOBinder to provide this BLO with its DAC. */
  protected void setDAC( DAC dac ) {
    this.cnyCurrencyDAC = (CnyCurrencyDAC) dac;
  }

  /**
  * Retrieve a cnyCurrency data model object from persistent storage. The
  * cnyCurrencyDMO passed in must contain a valid existing cnyCurrencyId.
  * Optionally, the return cnyCurrencyDMO may be include a flag that indicates if
  * the cnyCurrency object is referenced elsewhere within the module, depending on the value
  * of the getIsUsed parameter. Finally, optionally, this method can return the set of audit
  * records for the cnyCurrency object depending on the value of the getAudits parameter.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *   <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#CNYCURRENCY_000}</li>
  *   <li> The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl><br>
  *
  * @param  cnyCurrencyDMO the cnyCurrency object that must contain either the
  *         unique cnyCurrencyId or the displayCode/languageCode pair
  *
  * @return cnyCurrencyDMO the cnyCurrency data model object
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXFatalException
  * @throws EPPIXUnexpectedException
  */
  public CnyCurrencyDMO get( CnyCurrencyDMO cnyCurrencyDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "get(cnyCurrencyDMO)" );

    //
    // Check mandatory parameters.
    //
    thrower.ifParameterMissing( "cnyCurrencyDMO", cnyCurrencyDMO );

    //
    // Each attribute that is part of the primary key is mandatory
    //
    thrower.ifParameterMissing( "cnyCurrencyDMO.cnyCurrencyRef",
      cnyCurrencyDMO.getCnyCurrencyRef(  ) );

    //
    // Attempt to get the CnyCurrencyDMO
    //
    CnyCurrencyDMO returnCnyCurrencyDMO = cnyCurrencyDAC.get( cnyCurrencyDMO );

    //
    // Could not find the CnyCurrencyDMO
    //
    if ( returnCnyCurrencyDMO == null ) {
      thrower.business( Base_CNYCURRENCY_000,
        new Object[] { cnyCurrencyDMO.getCnyCurrencyRef(  ) } );
    }

    //
    // Now, based on the values of the flags on this method signature, which in turn,
    // are based on this objects associations, get all associated, embedded objects
    //
    return returnCnyCurrencyDMO;
  }

  /**
   * Return a list of CnyCurrency objects matching the passed in values. A
   * partial match is performed on the description argument and/or the cnyCurrencys
   * displayCode. If no values have been passed in, all CnyCurrency objects are
   * retrieved. Note: if a language specific description does not exist, then
   * the CnyCurrency is retrieved with the special 'NOCODE' description.
   *
   * @param state previous state of the list
   * @param cnyCurrencyDMO CnyCurrencyDMO object
   *
   * @return DTOList of CnyCurrency objects
   *
   * @throws EPPIXUnexpectedException
   */
  public DTOList getList( 
    DTOListState   state,
    CnyCurrencyDMO cnyCurrencyDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "getList( state, cnyCurrencyDMO )" );

    return cnyCurrencyDAC.getList( state, cnyCurrencyDMO );
  }

  /**
  * Creates the CnyCurrency object. As a side effect, following creation
  * of a cnyCurrency an audit object may be created.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param cnyCurrencyDMO cnyCurrencyDMO object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated cnyCurrencyDMO object.
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public CnyCurrencyDMO create( CnyCurrencyDMO cnyCurrencyDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "create( cnyCurrencyDMO )" );

    thrower.ifParameterMissing( "cnyCurrencyDMO", cnyCurrencyDMO );

    thrower.ifParameterMissing( "cnyCurrencyDMO.cnyCurrencyRef",
      cnyCurrencyDMO.getCnyCurrencyRef(  ) );

    thrower.ifParameterMissing( "cnyCurrencyDMO.cnyCurrencyText",
      cnyCurrencyDMO.getCnyCurrencyText(  ) );

    thrower.ifParameterMissing( "cnyCurrencyDMO.cnyExchangeRate",
      cnyCurrencyDMO.getCnyExchangeRate(  ) );

    thrower.ifParameterMissing( "cnyCurrencyDMO.cnyNoDecs",
      cnyCurrencyDMO.getCnyNoDecs(  ) );

    thrower.ifParameterMissing( "cnyCurrencyDMO.cnyOperator",
      cnyCurrencyDMO.getCnyOperator(  ) );

    thrower.ifParameterMissing( "cnyCurrencyDMO.cnyCurSymbol",
      cnyCurrencyDMO.getCnyCurSymbol(  ) );

    thrower.ifParameterMissing( "cnyCurrencyDMO.cnyGrpSymbol",
      cnyCurrencyDMO.getCnyGrpSymbol(  ) );

    thrower.ifParameterMissing( "cnyCurrencyDMO.cnyDecSymbol",
      cnyCurrencyDMO.getCnyDecSymbol(  ) );

    thrower.ifParameterMissing( "cnyCurrencyDMO.cnyRoundFrom",
      cnyCurrencyDMO.getCnyRoundFrom(  ) );

    thrower.ifParameterMissing( "cnyCurrencyDMO.cnyTimestamp",
      cnyCurrencyDMO.getCnyTimestamp(  ) );

    //
    // Check that this object does not already exist 
    //
    if ( exists( cnyCurrencyDMO ) ) {
      thrower.business( Base_CNYCURRENCY_001,
        new Object[] { cnyCurrencyDMO.getCnyCurrencyRef(  ) } );
    }

    //
    // Now create the cnyCurrency
    //
    cnyCurrencyDAC.create( cnyCurrencyDMO );

    return cnyCurrencyDMO;
  }

  /**
  * Modifies the CnyCurrency object. On any modification, an audit object
  * is created.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#CNYCURRENCY_002}</li>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param cnyCurrencyDMO cnyCurrencyDMO object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated cnyCurrencyDMO object.
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public CnyCurrencyDMO modify( CnyCurrencyDMO aCnyCurrencyDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "modify( acnyCurrencyDMO )" );

    //
    // Check mandatory parameters (
    //
    // Note: attributes stereotyped <NotModifiable> are ignored
    //
    thrower.ifParameterMissing( "acnyCurrencyDMO", aCnyCurrencyDMO );

    thrower.ifParameterMissing( "aCnyCurrencyDMO.cnyCurrencyRef",
      aCnyCurrencyDMO.getCnyCurrencyRef(  ) ); // attribute

    thrower.ifParameterMissing( "aCnyCurrencyDMO.cnyCurrencyText",
      aCnyCurrencyDMO.getCnyCurrencyText(  ) ); // attribute

    thrower.ifParameterMissing( "aCnyCurrencyDMO.cnyExchangeRate",
      aCnyCurrencyDMO.getCnyExchangeRate(  ) ); // attribute

    thrower.ifParameterMissing( "aCnyCurrencyDMO.cnyNoDecs",
      aCnyCurrencyDMO.getCnyNoDecs(  ) ); // attribute

    thrower.ifParameterMissing( "aCnyCurrencyDMO.cnyOperator",
      aCnyCurrencyDMO.getCnyOperator(  ) ); // attribute

    thrower.ifParameterMissing( "aCnyCurrencyDMO.cnyCurSymbol",
      aCnyCurrencyDMO.getCnyCurSymbol(  ) ); // attribute

    thrower.ifParameterMissing( "aCnyCurrencyDMO.cnyGrpSymbol",
      aCnyCurrencyDMO.getCnyGrpSymbol(  ) ); // attribute

    thrower.ifParameterMissing( "aCnyCurrencyDMO.cnyDecSymbol",
      aCnyCurrencyDMO.getCnyDecSymbol(  ) ); // attribute

    thrower.ifParameterMissing( "aCnyCurrencyDMO.cnyRoundFrom",
      aCnyCurrencyDMO.getCnyRoundFrom(  ) ); // attribute

    thrower.ifParameterMissing( "aCnyCurrencyDMO.cnyTimestamp",
      aCnyCurrencyDMO.getCnyTimestamp(  ) ); // attribute

    CnyCurrencyDMO updateCnyCurrencyDMO = new CnyCurrencyDMO(  );

    updateCnyCurrencyDMO.setCnyCurrencyRef( aCnyCurrencyDMO.getCnyCurrencyRef(  ) );

    updateCnyCurrencyDMO = get( updateCnyCurrencyDMO );

    //
    // For each relationship to single objects (does not matter if they are Embedded or Flattened)
    // either associate to a pre-existing object, or create an object then associate to it
    //

    //
    // Copy the fields to be updated. We do not want to overwrite primary keys etc.
    // All attributes stereotyped as being <NotModifiable> are skipped
    //
    updateCnyCurrencyDMO.setCnyCurrencyText( aCnyCurrencyDMO
      .getCnyCurrencyText(  ) );

    updateCnyCurrencyDMO.setCnyExchangeRate( aCnyCurrencyDMO
      .getCnyExchangeRate(  ) );

    updateCnyCurrencyDMO.setCnyNoDecs( aCnyCurrencyDMO.getCnyNoDecs(  ) );

    updateCnyCurrencyDMO.setCnyOperator( aCnyCurrencyDMO.getCnyOperator(  ) );

    updateCnyCurrencyDMO.setCnyCurSymbol( aCnyCurrencyDMO.getCnyCurSymbol(  ) );

    updateCnyCurrencyDMO.setCnyGrpSymbol( aCnyCurrencyDMO.getCnyGrpSymbol(  ) );

    updateCnyCurrencyDMO.setCnyDecSymbol( aCnyCurrencyDMO.getCnyDecSymbol(  ) );

    updateCnyCurrencyDMO.setCnyRoundFrom( aCnyCurrencyDMO.getCnyRoundFrom(  ) );

    updateCnyCurrencyDMO.setCnyTimestamp( aCnyCurrencyDMO.getCnyTimestamp(  ) );

    //
    // Modify the cnyCurrencyDMO
    //
    cnyCurrencyDAC.modify( updateCnyCurrencyDMO );

    // Create a new DMO, set keys, and fetch from the database...
    CnyCurrencyDMO returnCnyCurrencyDMO = new CnyCurrencyDMO(  );

    returnCnyCurrencyDMO.setCnyCurrencyRef( updateCnyCurrencyDMO
      .getCnyCurrencyRef(  ) );

    returnCnyCurrencyDMO = get( returnCnyCurrencyDMO );

    return returnCnyCurrencyDMO;
  }

  /**
  * Modifies the CnyCurrency object.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#ECEVENTCOMMAND_002}</li>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param CnyCurrencyDMO object<br>
  * @param filter object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated cnyCurrencyDMO object.
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
    // Modify the cnyCurrencyDMO
    //
    cnyCurrencyDAC.modify( filter );
  }

  /**
   * Deletes the CnyCurrency object. On deletion, an audit object is created
   * <p>
   * <B>Possible application exceptions:</B>
   * <dl><dd>Base_CNYCURRENCY_003
   *     <li>{@link #Base#CNYCURRENCY_000} if the CnyCurrency does not exist.</li>
   *     <li>{@link #Base#CNYCURRENCY_003} if the CnyCurrency is in use.</li>
   *     <li>The normal general errors:
   *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
   * </dd></dl>
   *  @param CnyCurrencyDMO CnyCurrency object with embedded displayCode and
   *        languageCode.
   *
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public void delete( CnyCurrencyDMO cnyCurrencyDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "delete( cnyCurrencyDMO )" );

    thrower.ifParameterMissing( "cnyCurrencyDMO", cnyCurrencyDMO );

    CnyCurrencyDMO updateCnyCurrencyDMO = null;

    updateCnyCurrencyDMO = get( cnyCurrencyDMO );

    // delete self...
    cnyCurrencyDAC.delete( cnyCurrencyDMO );
  }

  /**
   * Deletes the CnyCurrency object.
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
    cnyCurrencyDAC.delete( filter );
  }

  /**
  * Indicates whether a CnyCurrency exists in the database
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl>
  *
  *
  * @return true if the CnyCurrency exists in the database
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public boolean exists( CnyCurrencyDMO cnyCurrencyDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "exists(cnyCurrency)" );

    thrower.ifParameterMissing( "cnyCurrencyDMO", cnyCurrencyDMO );

    thrower.ifParameterMissing( "cnyCurrencyDMO.cnyCurrencyRef",
      cnyCurrencyDMO.getCnyCurrencyRef(  ) );

    return cnyCurrencyDAC.exists( cnyCurrencyDMO );
  }

  /**
   * Indicates whether a CnyCurrency exists in the database
   * <p>
   * <B>Possible application exceptions:</B>
   * <dl><dd>
   *     <li>The normal general errors:
   *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
   * </dd></dl>
   *
   *
   * @return true if the CnyCurrency exists in the database
   *
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public boolean exists( QueryFilter filter )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "exists(filter)" );

    return cnyCurrencyDAC.exists( filter );
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

    return cnyCurrencyDAC.getList( state, filter );
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

    return cnyCurrencyDAC.iterate( filter );
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

    return cnyCurrencyDAC.iterateWithLock( filter );
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
  public CnyCurrencyDMO get( QueryFilter filter )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "get( filter )" );

    //
    // Check mandatory parameters.
    //
    thrower.ifParameterMissing( "filter", filter );

    //
    // Attempt to get the CnyCurrencyDMO
    //
    CnyCurrencyDMO cnyCurrencyDMO = cnyCurrencyDAC.get( filter );

    return cnyCurrencyDMO;
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

    return cnyCurrencyDAC.max( filter );
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

    return cnyCurrencyDAC.min( filter );
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

    return new Integer(cnyCurrencyDAC.count( filter ));
  }
}
