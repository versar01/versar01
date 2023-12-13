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
//import com.eppixcomm.eppix.common.data.DTOList;
//import com.eppixcomm.eppix.common.data.DTOListState;
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
 * This table holds a diverse range of groups of various CAIL defined 'types' used within EPPIX; the idea is to amalgamate the definition of these codes in one table.
 * <p>
 *   Payment types and Autobar status types are stored under their respective 'groups'.
 * </p>
 *
 * This abstract business logic class holds all the logic for the TtTypeText class.
 * It is extended by TtTypeText class which holds the additional logic that is required, if any.
 *
 * @author
 * @version $Revision: $
 *
 * @since $jdk$
 */
public abstract class TtTypeTextAbstractBLO
  extends BaseBLO
  implements DTOActionTypes, BaseMessages {
  //~ Static variables/initializers //////////////////////////////////////////

  /** DOCUMENT ME! */
  static Thrower thrower = Thrower.getThrower( TtTypeText.class );
  /** DOCUMENT ME! */
  protected static final String ENTITY_ID = "TTTT";

  //~ Instance variables /////////////////////////////////////////////////////

  /** DOCUMENT ME! */
  protected Logger logger = thrower.getLogger(  );

  /** Data Access Controller. */
  protected TtTypeTextDAC ttTypeTextDAC;

  //~ Methods ////////////////////////////////////////////////////////////////

  /** Invoked by the BLOBinder to provide this BLO with its DAC. */
  protected void setDAC( DAC dac ) {
    this.ttTypeTextDAC = (TtTypeTextDAC) dac;
  }

  /**
  * Retrieve a ttTypeText data model object from persistent storage. The
  * ttTypeTextDMO passed in must contain a valid existing ttTypeTextId.
  * Optionally, the return ttTypeTextDMO may be include a flag that indicates if
  * the ttTypeText object is referenced elsewhere within the module, depending on the value
  * of the getIsUsed parameter. Finally, optionally, this method can return the set of audit
  * records for the ttTypeText object depending on the value of the getAudits parameter.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *   <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#TTTYPETEXT_000}</li>
  *   <li> The normal general errors:
  *          {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>
  * </dd></dl><br>
  *
  * @param  ttTypeTextDMO the ttTypeText object that must contain either the
  *         unique ttTypeTextId or the displayCode/languageCode pair
  *
  * @return ttTypeTextDMO the ttTypeText data model object
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXFatalException
  * @throws EPPIXUnexpectedException
  */
  public TtTypeTextDMO get( TtTypeTextDMO ttTypeTextDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "get(ttTypeTextDMO)" );

    //
    // Check mandatory parameters.
    //
    thrower.ifParameterMissing( "ttTypeTextDMO", ttTypeTextDMO );

    //
    // Each attribute that is part of the primary key is mandatory
    //
    thrower.ifParameterMissing( "ttTypeTextDMO.ttGroup",
      ttTypeTextDMO.getTtGroup(  ) );

    thrower.ifParameterMissing( "ttTypeTextDMO.ttLang",
      ttTypeTextDMO.getTtLang(  ) );

    thrower.ifParameterMissing( "ttTypeTextDMO.ttType",
      ttTypeTextDMO.getTtType(  ) );

    //
    // Attempt to get the TtTypeTextDMO
    //
    TtTypeTextDMO returnTtTypeTextDMO = ttTypeTextDAC.get( ttTypeTextDMO );

    //
    // Could not find the TtTypeTextDMO
    //
    if ( returnTtTypeTextDMO == null ) {
      thrower.business( Base_TTTYPETEXT_000,
        new Object[] {
          ttTypeTextDMO.getTtGroup(  ), ttTypeTextDMO.getTtLang(  ),
          ttTypeTextDMO.getTtType(  )
        } );
    }

    //
    // Now, based on the values of the flags on this method signature, which in turn,
    // are based on this objects associations, get all associated, embedded objects
    //
    return returnTtTypeTextDMO;
  }

  /**
   * Return a list of TtTypeText objects matching the passed in values. A
   * partial match is performed on the description argument and/or the ttTypeTexts
   * displayCode. If no values have been passed in, all TtTypeText objects are
   * retrieved. Note: if a language specific description does not exist, then
   * the TtTypeText is retrieved with the special 'NOCODE' description.
   *
   * @param state previous state of the list
   * @param ttTypeTextDMO TtTypeTextDMO object
   *
   * @return DTOList of TtTypeText objects
   *
   * @throws EPPIXUnexpectedException
   */
//  public DTOList<TtTypeTextDMO> getList( 
//    DTOListState  state,
//    TtTypeTextDMO ttTypeTextDMO )
//    throws EPPIXBusinessException, EPPIXUnexpectedException,
//      EPPIXFatalException {
//    logger.debug( "getList( state, ttTypeTextDMO )" );
//
//    return ttTypeTextDAC.getList( state, ttTypeTextDMO );
//  }

  /**
  * Creates the TtTypeText object. As a side effect, following creation
  * of a ttTypeText an audit object may be created.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param ttTypeTextDMO ttTypeTextDMO object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated ttTypeTextDMO object.
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public TtTypeTextDMO create( TtTypeTextDMO ttTypeTextDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "create( ttTypeTextDMO )" );

    thrower.ifParameterMissing( "ttTypeTextDMO", ttTypeTextDMO );

    thrower.ifParameterMissing( "ttTypeTextDMO.ttGroup",
      ttTypeTextDMO.getTtGroup(  ) );

    thrower.ifParameterMissing( "ttTypeTextDMO.ttLang",
      ttTypeTextDMO.getTtLang(  ) );

    thrower.ifParameterMissing( "ttTypeTextDMO.ttType",
      ttTypeTextDMO.getTtType(  ) );

    thrower.ifParameterMissing( "ttTypeTextDMO.ttConfig",
      ttTypeTextDMO.getTtConfig(  ) );

    //
    // Check that this object does not already exist 
    //
    if ( exists( ttTypeTextDMO ) ) {
      thrower.business( Base_TTTYPETEXT_001,
        new Object[] {
          ttTypeTextDMO.getTtGroup(  ), ttTypeTextDMO.getTtLang(  ),
          ttTypeTextDMO.getTtType(  )
        } );
    }

    //
    // Now create the ttTypeText
    //
    ttTypeTextDAC.create( ttTypeTextDMO );

    return ttTypeTextDMO;
  }

  /**
  * Modifies the TtTypeText object. On any modification, an audit object
  * is created.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#TTTYPETEXT_002}</li>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param ttTypeTextDMO ttTypeTextDMO object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated ttTypeTextDMO object.
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public TtTypeTextDMO modify( TtTypeTextDMO aTtTypeTextDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "modify( attTypeTextDMO )" );

    //
    // Check mandatory parameters (
    //
    // Note: attributes stereotyped <NotModifiable> are ignored
    //
    thrower.ifParameterMissing( "attTypeTextDMO", aTtTypeTextDMO );

    thrower.ifParameterMissing( "aTtTypeTextDMO.ttGroup",
      aTtTypeTextDMO.getTtGroup(  ) ); // attribute

    thrower.ifParameterMissing( "aTtTypeTextDMO.ttLang",
      aTtTypeTextDMO.getTtLang(  ) ); // attribute

    thrower.ifParameterMissing( "aTtTypeTextDMO.ttType",
      aTtTypeTextDMO.getTtType(  ) ); // attribute

    thrower.ifParameterMissing( "aTtTypeTextDMO.ttConfig",
      aTtTypeTextDMO.getTtConfig(  ) ); // attribute

    TtTypeTextDMO updateTtTypeTextDMO = new TtTypeTextDMO(  );

    updateTtTypeTextDMO.setTtGroup( aTtTypeTextDMO.getTtGroup(  ) );

    updateTtTypeTextDMO.setTtLang( aTtTypeTextDMO.getTtLang(  ) );

    updateTtTypeTextDMO.setTtType( aTtTypeTextDMO.getTtType(  ) );

    updateTtTypeTextDMO = get( updateTtTypeTextDMO );

    //
    // For each relationship to single objects (does not matter if they are Embedded or Flattened)
    // either associate to a pre-existing object, or create an object then associate to it
    //

    //
    // Copy the fields to be updated. We do not want to overwrite primary keys etc.
    // All attributes stereotyped as being <NotModifiable> are skipped
    //
    updateTtTypeTextDMO.setTtText( aTtTypeTextDMO.getTtText(  ) );

    updateTtTypeTextDMO.setTtConfig( aTtTypeTextDMO.getTtConfig(  ) );

    //
    // Modify the ttTypeTextDMO
    //
    ttTypeTextDAC.modify( updateTtTypeTextDMO );

    // Create a new DMO, set keys, and fetch from the database...
    TtTypeTextDMO returnTtTypeTextDMO = new TtTypeTextDMO(  );

    returnTtTypeTextDMO.setTtGroup( updateTtTypeTextDMO.getTtGroup(  ) );

    returnTtTypeTextDMO.setTtLang( updateTtTypeTextDMO.getTtLang(  ) );

    returnTtTypeTextDMO.setTtType( updateTtTypeTextDMO.getTtType(  ) );

    returnTtTypeTextDMO = get( returnTtTypeTextDMO );

    return returnTtTypeTextDMO;
  }

  /**
  * Modifies the TtTypeText object.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#ECEVENTCOMMAND_002}</li>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param TtTypeTextDMO object<br>
  * @param filter object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated ttTypeTextDMO object.
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
    // Modify the ttTypeTextDMO
    //
    ttTypeTextDAC.modify( filter );
  }

  /**
   * Deletes the TtTypeText object. On deletion, an audit object is created
   * <p>
   * <B>Possible application exceptions:</B>
   * <dl><dd>Base_TTTYPETEXT_003
   *     <li>{@link #Base#TTTYPETEXT_000} if the TtTypeText does not exist.</li>
   *     <li>{@link #Base#TTTYPETEXT_003} if the TtTypeText is in use.</li>
   *     <li>The normal general errors:
   *          {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>
   * </dd></dl>
   *  @param TtTypeTextDMO TtTypeText object with embedded displayCode and
   *        languageCode.
   *
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public void delete( TtTypeTextDMO ttTypeTextDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "delete( ttTypeTextDMO )" );

    thrower.ifParameterMissing( "ttTypeTextDMO", ttTypeTextDMO );

    TtTypeTextDMO updateTtTypeTextDMO = null;

    updateTtTypeTextDMO = get( ttTypeTextDMO );

    // delete self...
    ttTypeTextDAC.delete( ttTypeTextDMO );
  }

  /**
   * Deletes the TtTypeText object.
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
    ttTypeTextDAC.delete( filter );
  }

  /**
  * Indicates whether a TtTypeText exists in the database
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>
  * </dd></dl>
  *
  *
  * @return true if the TtTypeText exists in the database
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public boolean exists( TtTypeTextDMO ttTypeTextDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "exists(ttTypeText)" );

    thrower.ifParameterMissing( "ttTypeTextDMO", ttTypeTextDMO );

    thrower.ifParameterMissing( "ttTypeTextDMO.ttGroup",
      ttTypeTextDMO.getTtGroup(  ) );

    thrower.ifParameterMissing( "ttTypeTextDMO.ttLang",
      ttTypeTextDMO.getTtLang(  ) );

    thrower.ifParameterMissing( "ttTypeTextDMO.ttType",
      ttTypeTextDMO.getTtType(  ) );

    return ttTypeTextDAC.exists( ttTypeTextDMO );
  }

  /**
   * Indicates whether a TtTypeText exists in the database
   * <p>
   * <B>Possible application exceptions:</B>
   * <dl><dd>
   *     <li>The normal general errors:
   *          {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>
   * </dd></dl>
   *
   *
   * @return true if the TtTypeText exists in the database
   *
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public boolean exists( QueryFilter filter )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "exists(filter)" );

    return ttTypeTextDAC.exists( filter );
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
//  public DTOList<TtTypeTextDMO> getList( 
//    DTOListState state,
//    QueryFilter  filter )
//    throws EPPIXBusinessException, EPPIXUnexpectedException,
//      EPPIXFatalException {
//    logger.debug( "getList( state, filter )" );
//
//    return ttTypeTextDAC.getList( state, filter );
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

    return ttTypeTextDAC.iterate( filter );
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

    return ttTypeTextDAC.iterateWithLock( filter );
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
  public TtTypeTextDMO get( QueryFilter filter )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "get( filter )" );

    //
    // Check mandatory parameters.
    //
    thrower.ifParameterMissing( "filter", filter );

    //
    // Attempt to get the TtTypeTextDMO
    //
    TtTypeTextDMO ttTypeTextDMO = ttTypeTextDAC.get( filter );

    return ttTypeTextDMO;
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

    return ttTypeTextDAC.max( filter );
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

    return ttTypeTextDAC.min( filter );
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

    return Integer.valueOf(String.valueOf(ttTypeTextDAC.count( filter )));
  }
}
