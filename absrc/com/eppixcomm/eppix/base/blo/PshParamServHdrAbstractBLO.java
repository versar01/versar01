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
 * This table is used to group together the captured values for a Parameterised service.
 * <p>
 *   Via this table, the parameter values (psd_param_serv_det) will be linked at the appropriate level. Eg For a service
 *   relevant only at subscriber level, the SIM and MSISDN numbers will be blank.
 * </p>
 *
 * This abstract business logic class holds all the logic for the PshParamServHdr class.
 * It is extended by PshParamServHdr class which holds the additional logic that is required, if any.
 *
 * @author
 * @version $Revision: $
 *
 * @since $jdk$
 */
public abstract class PshParamServHdrAbstractBLO
  extends BaseBLO
  implements DTOActionTypes, BaseMessages {
  //~ Static variables/initializers //////////////////////////////////////////

  /** DOCUMENT ME! */
  static Thrower thrower = Thrower.getThrower( PshParamServHdr.class );
  /** DOCUMENT ME! */
  protected static final String ENTITY_ID = "PSHSH";

  //~ Instance variables /////////////////////////////////////////////////////

  /** DOCUMENT ME! */
  protected Logger logger = thrower.getLogger(  );

  /** Data Access Controller. */
  protected PshParamServHdrDAC pshParamServHdrDAC;

  //~ Methods ////////////////////////////////////////////////////////////////

  /** Invoked by the BLOBinder to get the DAC class for this BLO. */
  protected Class getDACClass(  ) {
    return PshParamServHdrDAC.class;
  }

  /** Invoked by the BLOBinder to provide this BLO with its DAC. */
  protected void setDAC( DAC dac ) {
    this.pshParamServHdrDAC = (PshParamServHdrDAC) dac;
  }

  /**
  * Retrieve a pshParamServHdr data model object from persistent storage. The
  * pshParamServHdrDMO passed in must contain a valid existing pshParamServHdrId.
  * Optionally, the return pshParamServHdrDMO may be include a flag that indicates if
  * the pshParamServHdr object is referenced elsewhere within the module, depending on the value
  * of the getIsUsed parameter. Finally, optionally, this method can return the set of audit
  * records for the pshParamServHdr object depending on the value of the getAudits parameter.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *   <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#PSHPARAMSERVHDR_000}</li>
  *   <li> The normal general errors:
  *          {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>
  * </dd></dl><br>
  *
  * @param  pshParamServHdrDMO the pshParamServHdr object that must contain either the
  *         unique pshParamServHdrId or the displayCode/languageCode pair
  *
  * @return pshParamServHdrDMO the pshParamServHdr data model object
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXFatalException
  * @throws EPPIXUnexpectedException
  */
  public PshParamServHdrDMO get( PshParamServHdrDMO pshParamServHdrDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "get(pshParamServHdrDMO)" );

    //
    // Check mandatory parameters.
    //
    thrower.ifParameterMissing( "pshParamServHdrDMO", pshParamServHdrDMO );

    //
    // Each attribute that is part of the primary key is mandatory
    //
    thrower.ifParameterMissing( "pshParamServHdrDMO.pshId",
      pshParamServHdrDMO.getPshId(  ) );

    //
    // Attempt to get the PshParamServHdrDMO
    //
    PshParamServHdrDMO returnPshParamServHdrDMO = pshParamServHdrDAC.get( pshParamServHdrDMO );

    //
    // Could not find the PshParamServHdrDMO
    //
    /**
     * TODO SJ: FIXME
     */
    if ( returnPshParamServHdrDMO == null ) {
//      thrower.business( Base_PSHPARAMSERVHDR_000,
//        new Object[] { pshParamServHdrDMO.getPshId(  ) } );
      
    }

    //
    // Now, based on the values of the flags on this method signature, which in turn,
    // are based on this objects associations, get all associated, embedded objects
    //
    return returnPshParamServHdrDMO;
  }

  /**
   * Return a list of PshParamServHdr objects matching the passed in values. A
   * partial match is performed on the description argument and/or the pshParamServHdrs
   * displayCode. If no values have been passed in, all PshParamServHdr objects are
   * retrieved. Note: if a language specific description does not exist, then
   * the PshParamServHdr is retrieved with the special 'NOCODE' description.
   *
   * @param state previous state of the list
   * @param pshParamServHdrDMO PshParamServHdrDMO object
   *
   * @return DTOList of PshParamServHdr objects
   *
   * @throws EPPIXUnexpectedException
   */
  public DTOList getList( 
    DTOListState       state,
    PshParamServHdrDMO pshParamServHdrDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "getList( state, pshParamServHdrDMO )" );

    return pshParamServHdrDAC.getList( state, pshParamServHdrDMO );
  }

  /**
  * Creates the PshParamServHdr object. As a side effect, following creation
  * of a pshParamServHdr an audit object may be created.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param pshParamServHdrDMO pshParamServHdrDMO object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated pshParamServHdrDMO object.
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public PshParamServHdrDMO create( PshParamServHdrDMO pshParamServHdrDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "create( pshParamServHdrDMO )" );

    thrower.ifParameterMissing( "pshParamServHdrDMO", pshParamServHdrDMO );

    // Set generated key to 0
    //pshParamServHdrDMO.setPshId(Integer.valueOf(0));
    //Narayana Sai - 25/07/2008 - Code should Compatible with 1.4 as per MTN Standards
     pshParamServHdrDMO.setPshId(new Integer(0));
    thrower.ifParameterMissing( "pshParamServHdrDMO.pshServiceCode",
      pshParamServHdrDMO.getPshServiceCode(  ) );

    thrower.ifParameterMissing( "pshParamServHdrDMO.pshSubscriberId",
      pshParamServHdrDMO.getPshSubscriberId(  ) );

    thrower.ifParameterMissing( "pshParamServHdrDMO.pshArchived",
      pshParamServHdrDMO.getPshArchived(  ) );

    //
    // Now create the pshParamServHdr
    //
    pshParamServHdrDMO = pshParamServHdrDAC.create( pshParamServHdrDMO );

    return pshParamServHdrDMO;
  }

  /**
  * Modifies the PshParamServHdr object. On any modification, an audit object
  * is created.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#PSHPARAMSERVHDR_002}</li>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param pshParamServHdrDMO pshParamServHdrDMO object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated pshParamServHdrDMO object.
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public PshParamServHdrDMO modify( PshParamServHdrDMO aPshParamServHdrDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "modify( apshParamServHdrDMO )" );

    //
    // Check mandatory parameters (
    //
    // Note: attributes stereotyped <NotModifiable> are ignored
    //
    thrower.ifParameterMissing( "apshParamServHdrDMO", aPshParamServHdrDMO );

    thrower.ifParameterMissing( "aPshParamServHdrDMO.pshId",
      aPshParamServHdrDMO.getPshId(  ) ); // attribute

    thrower.ifParameterMissing( "aPshParamServHdrDMO.pshServiceCode",
      aPshParamServHdrDMO.getPshServiceCode(  ) ); // attribute

    thrower.ifParameterMissing( "aPshParamServHdrDMO.pshSubscriberId",
      aPshParamServHdrDMO.getPshSubscriberId(  ) ); // attribute

    thrower.ifParameterMissing( "aPshParamServHdrDMO.pshArchived",
      aPshParamServHdrDMO.getPshArchived(  ) ); // attribute

    PshParamServHdrDMO updatePshParamServHdrDMO = new PshParamServHdrDMO(  );

    updatePshParamServHdrDMO.setPshId( aPshParamServHdrDMO.getPshId(  ) );

    updatePshParamServHdrDMO = get( updatePshParamServHdrDMO );

    //
    // For each relationship to single objects (does not matter if they are Embedded or Flattened)
    // either associate to a pre-existing object, or create an object then associate to it
    //

    //
    // Copy the fields to be updated. We do not want to overwrite primary keys etc.
    // All attributes stereotyped as being <NotModifiable> are skipped
    //
    updatePshParamServHdrDMO.setPshServiceCode( aPshParamServHdrDMO
      .getPshServiceCode(  ) );

    updatePshParamServHdrDMO.setPshSubscriberId( aPshParamServHdrDMO
      .getPshSubscriberId(  ) );

    updatePshParamServHdrDMO.setPshSimNo( aPshParamServHdrDMO.getPshSimNo(  ) );

    updatePshParamServHdrDMO.setPshMsisdnNo( aPshParamServHdrDMO
      .getPshMsisdnNo(  ) );

    updatePshParamServHdrDMO.setPshArchived( aPshParamServHdrDMO
      .getPshArchived(  ) );

    //
    // Modify the pshParamServHdrDMO
    //
    pshParamServHdrDAC.modify( updatePshParamServHdrDMO );

    // Create a new DMO, set keys, and fetch from the database...
    PshParamServHdrDMO returnPshParamServHdrDMO = new PshParamServHdrDMO(  );

    returnPshParamServHdrDMO.setPshId( updatePshParamServHdrDMO.getPshId(  ) );

    returnPshParamServHdrDMO = get( returnPshParamServHdrDMO );

    return returnPshParamServHdrDMO;
  }

  /**
  * Modifies the PshParamServHdr object.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#ECEVENTCOMMAND_002}</li>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param PshParamServHdrDMO object<br>
  * @param filter object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated pshParamServHdrDMO object.
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
    // Modify the pshParamServHdrDMO
    //
    pshParamServHdrDAC.modify( filter );
  }

  /**
   * Deletes the PshParamServHdr object. On deletion, an audit object is created
   * <p>
   * <B>Possible application exceptions:</B>
   * <dl><dd>Base_PSHPARAMSERVHDR_003
   *     <li>{@link #Base#PSHPARAMSERVHDR_000} if the PshParamServHdr does not exist.</li>
   *     <li>{@link #Base#PSHPARAMSERVHDR_003} if the PshParamServHdr is in use.</li>
   *     <li>The normal general errors:
   *          {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>
   * </dd></dl>
   *  @param PshParamServHdrDMO PshParamServHdr object with embedded displayCode and
   *        languageCode.
   *
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public void delete( PshParamServHdrDMO pshParamServHdrDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "delete( pshParamServHdrDMO )" );

    thrower.ifParameterMissing( "pshParamServHdrDMO", pshParamServHdrDMO );

    PshParamServHdrDMO updatePshParamServHdrDMO = null;

    updatePshParamServHdrDMO = get( pshParamServHdrDMO );

    // delete self...
    pshParamServHdrDAC.delete( pshParamServHdrDMO );
  }

  /**
   * Deletes the PshParamServHdr object.
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
    pshParamServHdrDAC.delete( filter );
  }

  /**
  * Indicates whether a PshParamServHdr exists in the database
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>
  * </dd></dl>
  *
  *
  * @return true if the PshParamServHdr exists in the database
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public boolean exists( PshParamServHdrDMO pshParamServHdrDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "exists(pshParamServHdr)" );

    thrower.ifParameterMissing( "pshParamServHdrDMO", pshParamServHdrDMO );

    thrower.ifParameterMissing( "pshParamServHdrDMO.pshId",
      pshParamServHdrDMO.getPshId(  ) );

    return pshParamServHdrDAC.exists( pshParamServHdrDMO );
  }

  /**
   * Indicates whether a PshParamServHdr exists in the database
   * <p>
   * <B>Possible application exceptions:</B>
   * <dl><dd>
   *     <li>The normal general errors:
   *          {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>
   * </dd></dl>
   *
   *
   * @return true if the PshParamServHdr exists in the database
   *
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public boolean exists( QueryFilter filter )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "exists(filter)" );

    return pshParamServHdrDAC.exists( filter );
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

    return pshParamServHdrDAC.getList( state, filter );
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

    return pshParamServHdrDAC.iterate( filter );
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

    return pshParamServHdrDAC.iterateWithLock( filter );
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
  public PshParamServHdrDMO get( QueryFilter filter )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "get( filter )" );

    //
    // Check mandatory parameters.
    //
    thrower.ifParameterMissing( "filter", filter );

    //
    // Attempt to get the PshParamServHdrDMO
    //
    PshParamServHdrDMO pshParamServHdrDMO = pshParamServHdrDAC.get( filter );

    return pshParamServHdrDMO;
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

    return pshParamServHdrDAC.max( filter );
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

    return pshParamServHdrDAC.min( filter );
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

    // return Integer.valueOf(pshParamServHdrDAC.count( filter));
    // Narayana Sai - 25/07/2008 - Code should Compatible with 1.4 as per MTN Standards
    return new Integer(pshParamServHdrDAC.count( filter));
    
  }
}
