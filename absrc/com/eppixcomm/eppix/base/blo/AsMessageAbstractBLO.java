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
 * Holds all messages used throughout VAS.
 * <p>
 *   A separate table is used to allow easy translation of messages when installing the system at non UK sites - e.g.
 *   AS_ARABIC, AS_FRENCH, AS_GERMAN
 * </p>
 *
 * This abstract business logic class holds all the logic for the AsMessage class.
 * It is extended by AsMessage class which holds the additional logic that is required, if any.
 *
 * @author
 * @version $Revision: $
 *
 * @since $jdk$
 */
public abstract class AsMessageAbstractBLO
  extends BaseBLO
  implements DTOActionTypes, BaseMessages {
  //~ Static variables/initializers //////////////////////////////////////////

  /** DOCUMENT ME! */
  static Thrower thrower = Thrower.getThrower( AsMessage.class );
  /** DOCUMENT ME! */
  protected static final String ENTITY_ID = "ASM";

  //~ Instance variables /////////////////////////////////////////////////////

  /** Data Access Controller. */
  protected AsMessageDAC asMessageDAC;
  /** DOCUMENT ME! */
  protected Logger logger = thrower.getLogger(  );

  //~ Methods ////////////////////////////////////////////////////////////////

  /** Invoked by the BLOBinder to get the DAC class for this BLO. */
  protected Class getDACClass(  ) {
    return AsMessageDAC.class;
  }

  /** Invoked by the BLOBinder to provide this BLO with its DAC. */
  protected void setDAC( DAC dac ) {
    this.asMessageDAC = (AsMessageDAC) dac;
  }

  /**
  * Retrieve a asMessage data model object from persistent storage. The
  * asMessageDMO passed in must contain a valid existing asMessageId.
  * Optionally, the return asMessageDMO may be include a flag that indicates if
  * the asMessage object is referenced elsewhere within the module, depending on the value
  * of the getIsUsed parameter. Finally, optionally, this method can return the set of audit
  * records for the asMessage object depending on the value of the getAudits parameter.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *   <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#ASMESSAGE_000}</li>
  *   <li> The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl><br>
  *
  * @param  asMessageDMO the asMessage object that must contain either the
  *         unique asMessageId or the displayCode/languageCode pair
  *
  * @return asMessageDMO the asMessage data model object
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXFatalException
  * @throws EPPIXUnexpectedException
  */
  public AsMessageDMO get( AsMessageDMO asMessageDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "get(asMessageDMO)" );

    //
    // Check mandatory parameters.
    //
    thrower.ifParameterMissing( "asMessageDMO", asMessageDMO );

    //
    // Each attribute that is part of the primary key is mandatory
    //
    thrower.ifParameterMissing( "asMessageDMO.mcode",
      asMessageDMO.getMcode(  ) );

    //
    // Attempt to get the AsMessageDMO
    //
    AsMessageDMO returnAsMessageDMO = asMessageDAC.get( asMessageDMO );

    //
    // Could not find the AsMessageDMO
    //
    if ( returnAsMessageDMO == null ) {
      thrower.business( Base_ASMESSAGE_000,
        new Object[] { asMessageDMO.getMcode(  ) } );
    }

    //
    // Now, based on the values of the flags on this method signature, which in turn,
    // are based on this objects associations, get all associated, embedded objects
    //
    return returnAsMessageDMO;
  }

  /**
   * Return a list of AsMessage objects matching the passed in values. A
   * partial match is performed on the description argument and/or the asMessages
   * displayCode. If no values have been passed in, all AsMessage objects are
   * retrieved. Note: if a language specific description does not exist, then
   * the AsMessage is retrieved with the special 'NOCODE' description.
   *
   * @param state previous state of the list
   * @param asMessageDMO AsMessageDMO object
   *
   * @return DTOList of AsMessage objects
   *
   * @throws EPPIXUnexpectedException
   */
  public DTOList getList( 
    DTOListState state,
    AsMessageDMO asMessageDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "getList( state, asMessageDMO )" );

    return asMessageDAC.getList( state, asMessageDMO );
  }

  /**
  * Creates the AsMessage object. As a side effect, following creation
  * of a asMessage an audit object may be created.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param asMessageDMO asMessageDMO object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated asMessageDMO object.
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public AsMessageDMO create( AsMessageDMO asMessageDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "create( asMessageDMO )" );

    thrower.ifParameterMissing( "asMessageDMO", asMessageDMO );

    thrower.ifParameterMissing( "asMessageDMO.mcode",
      asMessageDMO.getMcode(  ) );

    //
    // Check that this object does not already exist 
    //
    if ( exists( asMessageDMO ) ) {
      thrower.business( Base_ASMESSAGE_001,
        new Object[] { asMessageDMO.getMcode(  ) } );
    }

    //
    // Now create the asMessage
    //
    asMessageDAC.create( asMessageDMO );

    return asMessageDMO;
  }

  /**
  * Modifies the AsMessage object. On any modification, an audit object
  * is created.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#ASMESSAGE_002}</li>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param asMessageDMO asMessageDMO object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated asMessageDMO object.
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public AsMessageDMO modify( AsMessageDMO aAsMessageDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "modify( aasMessageDMO )" );

    //
    // Check mandatory parameters (
    //
    // Note: attributes stereotyped <NotModifiable> are ignored
    //
    thrower.ifParameterMissing( "aasMessageDMO", aAsMessageDMO );

    thrower.ifParameterMissing( "aAsMessageDMO.mcode",
      aAsMessageDMO.getMcode(  ) ); // attribute

    AsMessageDMO updateAsMessageDMO = new AsMessageDMO(  );

    updateAsMessageDMO.setMcode( aAsMessageDMO.getMcode(  ) );

    updateAsMessageDMO = get( updateAsMessageDMO );

    //
    // For each relationship to single objects (does not matter if they are Embedded or Flattened)
    // either associate to a pre-existing object, or create an object then associate to it
    //

    //
    // Copy the fields to be updated. We do not want to overwrite primary keys etc.
    // All attributes stereotyped as being <NotModifiable> are skipped
    //
    updateAsMessageDMO.setMmess( aAsMessageDMO.getMmess(  ) );

    //
    // Modify the asMessageDMO
    //
    asMessageDAC.modify( updateAsMessageDMO );

    // Create a new DMO, set keys, and fetch from the database...
    AsMessageDMO returnAsMessageDMO = new AsMessageDMO(  );

    returnAsMessageDMO.setMcode( updateAsMessageDMO.getMcode(  ) );

    returnAsMessageDMO = get( returnAsMessageDMO );

    return returnAsMessageDMO;
  }

  /**
  * Modifies the AsMessage object.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#ECEVENTCOMMAND_002}</li>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param AsMessageDMO object<br>
  * @param filter object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated asMessageDMO object.
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
    // Modify the asMessageDMO
    //
    asMessageDAC.modify( filter );
  }

  /**
   * Deletes the AsMessage object. On deletion, an audit object is created
   * <p>
   * <B>Possible application exceptions:</B>
   * <dl><dd>Base_ASMESSAGE_003
   *     <li>{@link #Base#ASMESSAGE_000} if the AsMessage does not exist.</li>
   *     <li>{@link #Base#ASMESSAGE_003} if the AsMessage is in use.</li>
   *     <li>The normal general errors:
   *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
   * </dd></dl>
   *  @param AsMessageDMO AsMessage object with embedded displayCode and
   *        languageCode.
   *
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public void delete( AsMessageDMO asMessageDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "delete( asMessageDMO )" );

    thrower.ifParameterMissing( "asMessageDMO", asMessageDMO );

    AsMessageDMO updateAsMessageDMO = null;

    updateAsMessageDMO = get( asMessageDMO );

    // delete self...
    asMessageDAC.delete( asMessageDMO );
  }

  /**
   * Deletes the AsMessage object.
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
    asMessageDAC.delete( filter );
  }

  /**
  * Indicates whether a AsMessage exists in the database
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl>
  *
  *
  * @return true if the AsMessage exists in the database
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public boolean exists( AsMessageDMO asMessageDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "exists(asMessage)" );

    thrower.ifParameterMissing( "asMessageDMO", asMessageDMO );

    thrower.ifParameterMissing( "asMessageDMO.mcode",
      asMessageDMO.getMcode(  ) );

    return asMessageDAC.exists( asMessageDMO );
  }

  /**
   * Indicates whether a AsMessage exists in the database
   * <p>
   * <B>Possible application exceptions:</B>
   * <dl><dd>
   *     <li>The normal general errors:
   *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
   * </dd></dl>
   *
   *
   * @return true if the AsMessage exists in the database
   *
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public boolean exists( QueryFilter filter )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "exists(filter)" );

    return asMessageDAC.exists( filter );
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

    return asMessageDAC.getList( state, filter );
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

    return asMessageDAC.iterate( filter );
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

    return asMessageDAC.iterateWithLock( filter );
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
  public AsMessageDMO get( QueryFilter filter )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "get( filter )" );

    //
    // Check mandatory parameters.
    //
    thrower.ifParameterMissing( "filter", filter );

    //
    // Attempt to get the AsMessageDMO
    //
    AsMessageDMO asMessageDMO = asMessageDAC.get( filter );

    return asMessageDMO;
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

    return asMessageDAC.max( filter );
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

    return asMessageDAC.min( filter );
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

    return new Integer(asMessageDAC.count( filter));
  }
}
