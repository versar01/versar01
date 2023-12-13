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
 * DOCUMENT ME! - by adding a description of this class via the class diagram.
 *
 * This abstract business logic class holds all the logic for the CdiDatabaseInt class.
 * It is extended by CdiDatabaseInt class which holds the additional logic that is required, if any.
 *
 * @author
 * @version $Revision: $
 *
 * @since $jdk$
 */
public abstract class CdiDatabaseIntAbstractBLO
  extends BaseBLO
  implements DTOActionTypes, BaseMessages {
  //~ Static variables/initializers //////////////////////////////////////////

  /** DOCUMENT ME! */
  static Thrower thrower = Thrower.getThrower( CdiDatabaseInt.class );
  /** DOCUMENT ME! */
  protected static final String ENTITY_ID = "CDII";

  //~ Instance variables /////////////////////////////////////////////////////

  /** Data Access Controller. */
  protected CdiDatabaseIntDAC cdiDatabaseIntDAC;
  /** DOCUMENT ME! */
  protected Logger logger = thrower.getLogger(  );

  //~ Methods ////////////////////////////////////////////////////////////////

  /** Invoked by the BLOBinder to provide this BLO with its DAC. */
  protected void setDAC( DAC dac ) {
    this.cdiDatabaseIntDAC = (CdiDatabaseIntDAC) dac;
  }

  /**
  * Retrieve a cdiDatabaseInt data model object from persistent storage. The
  * cdiDatabaseIntDMO passed in must contain a valid existing cdiDatabaseIntId.
  * Optionally, the return cdiDatabaseIntDMO may be include a flag that indicates if
  * the cdiDatabaseInt object is referenced elsewhere within the module, depending on the value
  * of the getIsUsed parameter. Finally, optionally, this method can return the set of audit
  * records for the cdiDatabaseInt object depending on the value of the getAudits parameter.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *   <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#CDIDATABASEINT_000}</li>
  *   <li> The normal general errors:
  *          {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>
  * </dd></dl><br>
  *
  * @param  cdiDatabaseIntDMO the cdiDatabaseInt object that must contain either the
  *         unique cdiDatabaseIntId or the displayCode/languageCode pair
  *
  * @return cdiDatabaseIntDMO the cdiDatabaseInt data model object
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXFatalException
  * @throws EPPIXUnexpectedException
  */
  public CdiDatabaseIntDMO get( CdiDatabaseIntDMO cdiDatabaseIntDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "get(cdiDatabaseIntDMO)" );

    //
    // Check mandatory parameters.
    //
    thrower.ifParameterMissing( "cdiDatabaseIntDMO", cdiDatabaseIntDMO );

    //
    // Each attribute that is part of the primary key is mandatory
    //
    thrower.ifParameterMissing( "cdiDatabaseIntDMO.cdiSerial",
      cdiDatabaseIntDMO.getCdiSerial(  ) );

    //
    // Attempt to get the CdiDatabaseIntDMO
    //
    CdiDatabaseIntDMO returnCdiDatabaseIntDMO = cdiDatabaseIntDAC.get( cdiDatabaseIntDMO );

    //
    // Could not find the CdiDatabaseIntDMO
    //
    if ( returnCdiDatabaseIntDMO == null ) {
      thrower.business( Base_CDIDATABASEINT_000,
        new Object[] { cdiDatabaseIntDMO.getCdiSerial(  ) } );
    }

    //
    // Now, based on the values of the flags on this method signature, which in turn,
    // are based on this objects associations, get all associated, embedded objects
    //
    return returnCdiDatabaseIntDMO;
  }

  /**
   * Return a list of CdiDatabaseInt objects matching the passed in values. A
   * partial match is performed on the description argument and/or the cdiDatabaseInts
   * displayCode. If no values have been passed in, all CdiDatabaseInt objects are
   * retrieved. Note: if a language specific description does not exist, then
   * the CdiDatabaseInt is retrieved with the special 'NOCODE' description.
   *
   * @param state previous state of the list
   * @param cdiDatabaseIntDMO CdiDatabaseIntDMO object
   *
   * @return DTOList of CdiDatabaseInt objects
   *
   * @throws EPPIXUnexpectedException
   */
//  public DTOList<CdiDatabaseIntDMO> getList( 
//    DTOListState      state,
//    CdiDatabaseIntDMO cdiDatabaseIntDMO )
//    throws EPPIXBusinessException, EPPIXUnexpectedException,
//      EPPIXFatalException {
//    logger.debug( "getList( state, cdiDatabaseIntDMO )" );
//
//    return cdiDatabaseIntDAC.getList( state, cdiDatabaseIntDMO );
//  }

  /**
  * Creates the CdiDatabaseInt object. As a side effect, following creation
  * of a cdiDatabaseInt an audit object may be created.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param cdiDatabaseIntDMO cdiDatabaseIntDMO object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated cdiDatabaseIntDMO object.
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public CdiDatabaseIntDMO create( CdiDatabaseIntDMO cdiDatabaseIntDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "create( cdiDatabaseIntDMO )" );

    thrower.ifParameterMissing( "cdiDatabaseIntDMO", cdiDatabaseIntDMO );

//    thrower.ifParameterMissing( "cdiDatabaseIntDMO.cdiSerial",
//      cdiDatabaseIntDMO.getCdiSerial(  ) );

    thrower.ifParameterMissing( "cdiDatabaseIntDMO.cdiAccType",
      cdiDatabaseIntDMO.getCdiAccType(  ) );

    thrower.ifParameterMissing( "cdiDatabaseIntDMO.cdiStatus",
      cdiDatabaseIntDMO.getCdiStatus(  ) );

    //
    // Check that this object does not already exist 
    //
//    if ( exists( cdiDatabaseIntDMO ) ) {
//      thrower.business( Base_CDIDATABASEINT_001,
//        new Object[] { cdiDatabaseIntDMO.getCdiSerial(  ) } );
//    }

    //
    // Now create the cdiDatabaseInt
    //
    cdiDatabaseIntDAC.create( cdiDatabaseIntDMO );

    return cdiDatabaseIntDMO;
  }
  
  
  
  public CdiDatabaseIntDMO creatCustomCdi( CdiDatabaseIntDMO cdiDatabaseIntDMO )
  throws EPPIXBusinessException, EPPIXUnexpectedException,
    EPPIXFatalException {
  logger.debug( "create( cdiDatabaseIntDMO )" );

  thrower.ifParameterMissing( "cdiDatabaseIntDMO", cdiDatabaseIntDMO );

  thrower.ifParameterMissing( "cdiDatabaseIntDMO.cdiAccType",
    cdiDatabaseIntDMO.getCdiAccType(  ) );

  thrower.ifParameterMissing( "cdiDatabaseIntDMO.cdiStatus",
    cdiDatabaseIntDMO.getCdiStatus(  ) );


  cdiDatabaseIntDAC.creatCustomCdi( cdiDatabaseIntDMO );

  return cdiDatabaseIntDMO;
}

  /**
  * Modifies the CdiDatabaseInt object. On any modification, an audit object
  * is created.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#CDIDATABASEINT_002}</li>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param cdiDatabaseIntDMO cdiDatabaseIntDMO object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated cdiDatabaseIntDMO object.
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
//  public CdiDatabaseIntDMO modify( CdiDatabaseIntDMO aCdiDatabaseIntDMO )
//    throws EPPIXBusinessException, EPPIXUnexpectedException,
//      EPPIXFatalException {
//    logger.debug( "modify( acdiDatabaseIntDMO )" );
//
//    //
//    // Check mandatory parameters (
//    //
//    // Note: attributes stereotyped <NotModifiable> are ignored
//    //
//    thrower.ifParameterMissing( "acdiDatabaseIntDMO", aCdiDatabaseIntDMO );
//
//    thrower.ifParameterMissing( "aCdiDatabaseIntDMO.cdiSerial",
//      aCdiDatabaseIntDMO.getCdiSerial(  ) ); // attribute
//
//    thrower.ifParameterMissing( "aCdiDatabaseIntDMO.cdiAccType",
//      aCdiDatabaseIntDMO.getCdiAccType(  ) ); // attribute
//
//    thrower.ifParameterMissing( "aCdiDatabaseIntDMO.cdiStatus",
//      aCdiDatabaseIntDMO.getCdiStatus(  ) ); // attribute
//
//    CdiDatabaseIntDMO updateCdiDatabaseIntDMO = new CdiDatabaseIntDMO(  );
//
//    updateCdiDatabaseIntDMO.setCdiSerial( aCdiDatabaseIntDMO.getCdiSerial(  ) );
//
//    updateCdiDatabaseIntDMO = get( updateCdiDatabaseIntDMO );
//
//    //
//    // For each relationship to single objects (does not matter if they are Embedded or Flattened)
//    // either associate to a pre-existing object, or create an object then associate to it
//    //
//
//    //
//    // Copy the fields to be updated. We do not want to overwrite primary keys etc.
//    // All attributes stereotyped as being <NotModifiable> are skipped
//    //
//    updateCdiDatabaseIntDMO.setCdiBillAcNo( aCdiDatabaseIntDMO.getCdiBillAcNo(  ) );
//
//    updateCdiDatabaseIntDMO.setCdiSubscriberId( aCdiDatabaseIntDMO
//      .getCdiSubscriberId(  ) );
//
//    updateCdiDatabaseIntDMO.setCdiAccType( aCdiDatabaseIntDMO.getCdiAccType(  ) );
//
//    updateCdiDatabaseIntDMO.setCdiStatus( aCdiDatabaseIntDMO.getCdiStatus(  ) );
//
//    updateCdiDatabaseIntDMO.setCdiTimestamp( aCdiDatabaseIntDMO
//      .getCdiTimestamp(  ) );
//
//    updateCdiDatabaseIntDMO.setCdiText( aCdiDatabaseIntDMO.getCdiText(  ) );
//
//    //
//    // Modify the cdiDatabaseIntDMO
//    //
//    cdiDatabaseIntDAC.modify( updateCdiDatabaseIntDMO );
//
//    // Create a new DMO, set keys, and fetch from the database...
//    CdiDatabaseIntDMO returnCdiDatabaseIntDMO = new CdiDatabaseIntDMO(  );
//
//    returnCdiDatabaseIntDMO.setCdiSerial( updateCdiDatabaseIntDMO.getCdiSerial(  ) );
//
//    returnCdiDatabaseIntDMO = get( returnCdiDatabaseIntDMO );
//
//    return returnCdiDatabaseIntDMO;
//  }

  /**
  * Modifies the CdiDatabaseInt object.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#ECEVENTCOMMAND_002}</li>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param CdiDatabaseIntDMO object<br>
  * @param filter object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated cdiDatabaseIntDMO object.
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
    // Modify the cdiDatabaseIntDMO
    //
    cdiDatabaseIntDAC.modify( filter );
  }

  /**
   * Deletes the CdiDatabaseInt object. On deletion, an audit object is created
   * <p>
   * <B>Possible application exceptions:</B>
   * <dl><dd>Base_CDIDATABASEINT_003
   *     <li>{@link #Base#CDIDATABASEINT_000} if the CdiDatabaseInt does not exist.</li>
   *     <li>{@link #Base#CDIDATABASEINT_003} if the CdiDatabaseInt is in use.</li>
   *     <li>The normal general errors:
   *          {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>
   * </dd></dl>
   *  @param CdiDatabaseIntDMO CdiDatabaseInt object with embedded displayCode and
   *        languageCode.
   *
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public void delete( CdiDatabaseIntDMO cdiDatabaseIntDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "delete( cdiDatabaseIntDMO )" );

    thrower.ifParameterMissing( "cdiDatabaseIntDMO", cdiDatabaseIntDMO );

    CdiDatabaseIntDMO updateCdiDatabaseIntDMO = null;

    updateCdiDatabaseIntDMO = get( cdiDatabaseIntDMO );

    // delete self...
    cdiDatabaseIntDAC.delete( cdiDatabaseIntDMO );
  }

  /**
   * Deletes the CdiDatabaseInt object.
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
    cdiDatabaseIntDAC.delete( filter );
  }

  /**
  * Indicates whether a CdiDatabaseInt exists in the database
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>
  * </dd></dl>
  *
  *
  * @return true if the CdiDatabaseInt exists in the database
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public boolean exists( CdiDatabaseIntDMO cdiDatabaseIntDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "exists(cdiDatabaseInt)" );

    thrower.ifParameterMissing( "cdiDatabaseIntDMO", cdiDatabaseIntDMO );

    thrower.ifParameterMissing( "cdiDatabaseIntDMO.cdiSerial",
      cdiDatabaseIntDMO.getCdiSerial(  ) );

    return cdiDatabaseIntDAC.exists( cdiDatabaseIntDMO );
  }

  /**
   * Indicates whether a CdiDatabaseInt exists in the database
   * <p>
   * <B>Possible application exceptions:</B>
   * <dl><dd>
   *     <li>The normal general errors:
   *          {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>
   * </dd></dl>
   *
   *
   * @return true if the CdiDatabaseInt exists in the database
   *
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public boolean exists( QueryFilter filter )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "exists(filter)" );

    return cdiDatabaseIntDAC.exists( filter );
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
//  public DTOList getList( 
//    DTOListState state,
//    QueryFilter  filter )
//    throws EPPIXBusinessException, EPPIXUnexpectedException,
//      EPPIXFatalException {
//    logger.debug( "getList( state, filter )" );
//
//    return cdiDatabaseIntDAC.getList( state, filter );
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

    return cdiDatabaseIntDAC.iterate( filter );
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

    return cdiDatabaseIntDAC.iterateWithLock( filter );
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
  public CdiDatabaseIntDMO get( QueryFilter filter )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "get( filter )" );

    //
    // Check mandatory parameters.
    //
    thrower.ifParameterMissing( "filter", filter );

    //
    // Attempt to get the CdiDatabaseIntDMO
    //
    CdiDatabaseIntDMO cdiDatabaseIntDMO = cdiDatabaseIntDAC.get( filter );

    return cdiDatabaseIntDMO;
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

    return cdiDatabaseIntDAC.max( filter );
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

    return cdiDatabaseIntDAC.min( filter );
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

    return Integer.valueOf( String.valueOf(cdiDatabaseIntDAC.count( filter )));
  }
  
  public void upDateCDIStatus(String status, String text, String date, Integer serial){
	  cdiDatabaseIntDAC.updateCDIStatus(status, text, date, serial);
  }
  
}
