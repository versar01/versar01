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
 * This table stores the captured values for a Parameterised service.
 * <p>
 *   For each service created for a subscriber, a record on this table will be created per record on spa_service_params.
 * </p>
 *
 * This abstract business logic class holds all the logic for the PsdParamServDet class.
 * It is extended by PsdParamServDet class which holds the additional logic that is required, if any.
 *
 * @author
 * @version $Revision: $
 *
 * @since $jdk$
 */
public abstract class PsdParamServDetAbstractBLO
  extends BaseBLO
  implements DTOActionTypes, BaseMessages {
  //~ Static variables/initializers //////////////////////////////////////////

  /** DOCUMENT ME! */
  static Thrower thrower = Thrower.getThrower( PsdParamServDet.class );
  /** DOCUMENT ME! */
  protected static final String ENTITY_ID = "PSDSD";

  //~ Instance variables /////////////////////////////////////////////////////

  /** DOCUMENT ME! */
  protected Logger logger = thrower.getLogger(  );

  /** Data Access Controller. */
  protected PsdParamServDetDAC psdParamServDetDAC;

  //~ Methods ////////////////////////////////////////////////////////////////

  /** Invoked by the BLOBinder to get the DAC class for this BLO. */
  protected Class getDACClass(  ) {
    return PsdParamServDetDAC.class;
  }

  /** Invoked by the BLOBinder to provide this BLO with its DAC. */
  protected void setDAC( DAC dac ) {
    this.psdParamServDetDAC = (PsdParamServDetDAC) dac;
  }

  /**
  * Retrieve a psdParamServDet data model object from persistent storage. The
  * psdParamServDetDMO passed in must contain a valid existing psdParamServDetId.
  * Optionally, the return psdParamServDetDMO may be include a flag that indicates if
  * the psdParamServDet object is referenced elsewhere within the module, depending on the value
  * of the getIsUsed parameter. Finally, optionally, this method can return the set of audit
  * records for the psdParamServDet object depending on the value of the getAudits parameter.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *   <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#PSDPARAMSERVDET_000}</li>
  *   <li> The normal general errors:
  *          {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>
  * </dd></dl><br>
  *
  * @param  psdParamServDetDMO the psdParamServDet object that must contain either the
  *         unique psdParamServDetId or the displayCode/languageCode pair
  *
  * @return psdParamServDetDMO the psdParamServDet data model object
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXFatalException
  * @throws EPPIXUnexpectedException
  */
  public PsdParamServDetDMO get( PsdParamServDetDMO psdParamServDetDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "get(psdParamServDetDMO)" );

    //
    // Check mandatory parameters.
    //
    thrower.ifParameterMissing( "psdParamServDetDMO", psdParamServDetDMO );

    //
    // Each attribute that is part of the primary key is mandatory
    //
    thrower.ifParameterMissing( "psdParamServDetDMO.psdPshId",
      psdParamServDetDMO.getPsdPshId(  ) );

    thrower.ifParameterMissing( "psdParamServDetDMO.psdParamId",
      psdParamServDetDMO.getPsdParamId(  ) );

    //
    // Attempt to get the PsdParamServDetDMO
    //
    PsdParamServDetDMO returnPsdParamServDetDMO = psdParamServDetDAC.get( psdParamServDetDMO );

    //
    // Could not find the PsdParamServDetDMO
    //
    /**
     * TODO SJ Fixme
     */
    if ( returnPsdParamServDetDMO == null ) {
//      thrower.business( Base_PSDPARAMSERVDET_000,
//        new Object[] {
//          psdParamServDetDMO.getPsdPshId(  ),
//          psdParamServDetDMO.getPsdParamId(  )
//        } );
    }

    //
    // Now, based on the values of the flags on this method signature, which in turn,
    // are based on this objects associations, get all associated, embedded objects
    //
    return returnPsdParamServDetDMO;
  }

  /**
   * Return a list of PsdParamServDet objects matching the passed in values. A
   * partial match is performed on the description argument and/or the psdParamServDets
   * displayCode. If no values have been passed in, all PsdParamServDet objects are
   * retrieved. Note: if a language specific description does not exist, then
   * the PsdParamServDet is retrieved with the special 'NOCODE' description.
   *
   * @param state previous state of the list
   * @param psdParamServDetDMO PsdParamServDetDMO object
   *
   * @return DTOList of PsdParamServDet objects
   *
   * @throws EPPIXUnexpectedException
   */
  public DTOList getList( 
    DTOListState       state,
    PsdParamServDetDMO psdParamServDetDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "getList( state, psdParamServDetDMO )" );

    return psdParamServDetDAC.getList( state, psdParamServDetDMO );
  }

  /**
  * Creates the PsdParamServDet object. As a side effect, following creation
  * of a psdParamServDet an audit object may be created.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param psdParamServDetDMO psdParamServDetDMO object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated psdParamServDetDMO object.
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public PsdParamServDetDMO create( PsdParamServDetDMO psdParamServDetDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "create( psdParamServDetDMO )" );

    thrower.ifParameterMissing( "psdParamServDetDMO", psdParamServDetDMO );

    thrower.ifParameterMissing( "psdParamServDetDMO.psdPshId",
      psdParamServDetDMO.getPsdPshId(  ) );

    thrower.ifParameterMissing( "psdParamServDetDMO.psdParamId",
      psdParamServDetDMO.getPsdParamId(  ) );

    //
    // Check that this object does not already exist 
    //
    /**
     * TODO SJ Fixme
     */
    if ( exists( psdParamServDetDMO ) ) {
//      thrower.business( Base_PSDPARAMSERVDET_001,
//        new Object[] {
//          psdParamServDetDMO.getPsdPshId(  ),
//          psdParamServDetDMO.getPsdParamId(  )
//        } );
    	
    }

    //
    // Now create the psdParamServDet
    //
    psdParamServDetDAC.create( psdParamServDetDMO );

    return psdParamServDetDMO;
  }

  /**
  * Modifies the PsdParamServDet object. On any modification, an audit object
  * is created.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#PSDPARAMSERVDET_002}</li>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param psdParamServDetDMO psdParamServDetDMO object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated psdParamServDetDMO object.
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public PsdParamServDetDMO modify( PsdParamServDetDMO aPsdParamServDetDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "modify( apsdParamServDetDMO )" );

    //
    // Check mandatory parameters (
    //
    // Note: attributes stereotyped <NotModifiable> are ignored
    //
    thrower.ifParameterMissing( "apsdParamServDetDMO", aPsdParamServDetDMO );

    thrower.ifParameterMissing( "aPsdParamServDetDMO.getPsdSerialId",
    	      aPsdParamServDetDMO.getPsdSerialId() ); // attribute
    
    thrower.ifParameterMissing( "aPsdParamServDetDMO.psdPshId",
      aPsdParamServDetDMO.getPsdPshId(  ) ); // attribute

    thrower.ifParameterMissing( "aPsdParamServDetDMO.psdParamId",
      aPsdParamServDetDMO.getPsdParamId(  ) ); // attribute
    
    

    PsdParamServDetDMO updatePsdParamServDetDMO = new PsdParamServDetDMO(  );

//    updatePsdParamServDetDMO.setPsdSerialId( aPsdParamServDetDMO.getPsdSerialId());    
    updatePsdParamServDetDMO.setPsdPshId( aPsdParamServDetDMO.getPsdPshId(  ) );
    updatePsdParamServDetDMO.setPsdParamId( aPsdParamServDetDMO.getPsdParamId(  ) );
    
    updatePsdParamServDetDMO.setPsdActDate( aPsdParamServDetDMO.getPsdActDate());
    updatePsdParamServDetDMO.setPsdTermDate( aPsdParamServDetDMO.getPsdTermDate());
    updatePsdParamServDetDMO.setPsdParamValue( aPsdParamServDetDMO.getPsdParamValue());
    
    updatePsdParamServDetDMO.setPsdN2nString( aPsdParamServDetDMO.getPsdN2nString());
    updatePsdParamServDetDMO.setPsdParamActive( aPsdParamServDetDMO.getPsdParamActive());
    updatePsdParamServDetDMO.setPsdDeacDate(aPsdParamServDetDMO.getPsdDeacDate());
    updatePsdParamServDetDMO.setPsdSubCharge( aPsdParamServDetDMO.getPsdSubCharge());
    updatePsdParamServDetDMO.setPsdChgValue(aPsdParamServDetDMO.getPsdChgValue());
    updatePsdParamServDetDMO.setPsdActType(aPsdParamServDetDMO.getPsdActType());
    updatePsdParamServDetDMO.setPsdActionDate(aPsdParamServDetDMO.getPsdActionDate());
    
    
//    updatePsdParamServDetDMO = get( updatePsdParamServDetDMO );

    //
    // For each relationship to single objects (does not matter if they are Embedded or Flattened)
    // either associate to a pre-existing object, or create an object then associate to it
    //

    //
    // Copy the fields to be updated. We do not want to overwrite primary keys etc.
    // All attributes stereotyped as being <NotModifiable> are skipped
    //
//    updatePsdParamServDetDMO.setPsdParamValue( aPsdParamServDetDMO
//      .getPsdParamValue(  ) );

    //
    // Modify the psdParamServDetDMO
    //
    psdParamServDetDAC.modify( updatePsdParamServDetDMO );

    // Create a new DMO, set keys, and fetch from the database...
    PsdParamServDetDMO returnPsdParamServDetDMO = new PsdParamServDetDMO(  );

    returnPsdParamServDetDMO.setPsdPshId( updatePsdParamServDetDMO.getPsdPshId(  ) );

    returnPsdParamServDetDMO.setPsdParamId( updatePsdParamServDetDMO
      .getPsdParamId(  ) );

    returnPsdParamServDetDMO = get( returnPsdParamServDetDMO );

    return returnPsdParamServDetDMO;
  }

  /**
  * Modifies the PsdParamServDet object.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#ECEVENTCOMMAND_002}</li>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param PsdParamServDetDMO object<br>
  * @param filter object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated psdParamServDetDMO object.
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
    // Modify the psdParamServDetDMO
    //
    psdParamServDetDAC.modify( filter );
  }

  /**
   * Deletes the PsdParamServDet object. On deletion, an audit object is created
   * <p>
   * <B>Possible application exceptions:</B>
   * <dl><dd>Base_PSDPARAMSERVDET_003
   *     <li>{@link #Base#PSDPARAMSERVDET_000} if the PsdParamServDet does not exist.</li>
   *     <li>{@link #Base#PSDPARAMSERVDET_003} if the PsdParamServDet is in use.</li>
   *     <li>The normal general errors:
   *          {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>
   * </dd></dl>
   *  @param PsdParamServDetDMO PsdParamServDet object with embedded displayCode and
   *        languageCode.
   *
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public void delete( PsdParamServDetDMO psdParamServDetDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "delete( psdParamServDetDMO )" );

    thrower.ifParameterMissing( "psdParamServDetDMO", psdParamServDetDMO );

    PsdParamServDetDMO updatePsdParamServDetDMO = null;

    updatePsdParamServDetDMO = get( psdParamServDetDMO );

    // delete self...
    psdParamServDetDAC.delete( psdParamServDetDMO );
  }

  /**
   * Deletes the PsdParamServDet object.
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
    psdParamServDetDAC.delete( filter );
  }

  /**
  * Indicates whether a PsdParamServDet exists in the database
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>
  * </dd></dl>
  *
  *
  * @return true if the PsdParamServDet exists in the database
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public boolean exists( PsdParamServDetDMO psdParamServDetDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "exists(psdParamServDet)" );

    thrower.ifParameterMissing( "psdParamServDetDMO", psdParamServDetDMO );

    thrower.ifParameterMissing( "psdParamServDetDMO.psdPshId",
      psdParamServDetDMO.getPsdPshId(  ) );

    thrower.ifParameterMissing( "psdParamServDetDMO.psdParamId",
      psdParamServDetDMO.getPsdParamId(  ) );

    return psdParamServDetDAC.exists( psdParamServDetDMO );
  }

  /**
   * Indicates whether a PsdParamServDet exists in the database
   * <p>
   * <B>Possible application exceptions:</B>
   * <dl><dd>
   *     <li>The normal general errors:
   *          {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>
   * </dd></dl>
   *
   *
   * @return true if the PsdParamServDet exists in the database
   *
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public boolean exists( QueryFilter filter )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "exists(filter)" );

    return psdParamServDetDAC.exists( filter );
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

    return psdParamServDetDAC.getList( state, filter );
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

    return psdParamServDetDAC.iterate( filter );
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

    return psdParamServDetDAC.iterateWithLock( filter );
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
  public PsdParamServDetDMO get( QueryFilter filter )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "get( filter )" );

    //
    // Check mandatory parameters.
    //
    thrower.ifParameterMissing( "filter", filter );

    //
    // Attempt to get the PsdParamServDetDMO
    //
    PsdParamServDetDMO psdParamServDetDMO = psdParamServDetDAC.get( filter );

    return psdParamServDetDMO;
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

    return psdParamServDetDAC.max( filter );
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

    return psdParamServDetDAC.min( filter );
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
   
   // return Integer.valueOf(psdParamServDetDAC.count(filter));
   // Narayana Sai - 25/07/2008 - Code should Compatible with 1.4 as per MTN Standards
    return new Integer(psdParamServDetDAC.count(filter));
    
  }
}

