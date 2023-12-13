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
 * This table holds call pre-charge details.
 *
 * This abstract business logic class holds all the logic for the CpcCallPrecharge class.
 * It is extended by CpcCallPrecharge class which holds the additional logic that is required, if any.
 *
 * @author
 * @version $Revision: $
 *
 * @since $jdk$
 */
public abstract class CpcCallPrechargeAbstractBLO
  extends BaseBLO
  implements DTOActionTypes, BaseMessages {
  //~ Static variables/initializers //////////////////////////////////////////

  /** DOCUMENT ME! */
  static Thrower thrower = Thrower.getThrower( CpcCallPrecharge.class );
  /** DOCUMENT ME! */
  protected static final String ENTITY_ID = "CPCP";

  //~ Instance variables /////////////////////////////////////////////////////

  /** Data Access Controller. */
  protected CpcCallPrechargeDAC cpcCallPrechargeDAC;
  /** DOCUMENT ME! */
  protected Logger logger = thrower.getLogger(  );

  //~ Methods ////////////////////////////////////////////////////////////////

  /** Invoked by the BLOBinder to get the DAC class for this BLO. */
  protected Class getDACClass(  ) {
    return CpcCallPrechargeDAC.class;
  }

  /** Invoked by the BLOBinder to provide this BLO with its DAC. */
  protected void setDAC( DAC dac ) {
    this.cpcCallPrechargeDAC = (CpcCallPrechargeDAC) dac;
  }

  /**
  * Retrieve a cpcCallPrecharge data model object from persistent storage. The
  * cpcCallPrechargeDMO passed in must contain a valid existing cpcCallPrechargeId.
  * Optionally, the return cpcCallPrechargeDMO may be include a flag that indicates if
  * the cpcCallPrecharge object is referenced elsewhere within the module, depending on the value
  * of the getIsUsed parameter. Finally, optionally, this method can return the set of audit
  * records for the cpcCallPrecharge object depending on the value of the getAudits parameter.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *   <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#CPCCALLPRECHARGE_000}</li>
  *   <li> The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl><br>
  *
  * @param  cpcCallPrechargeDMO the cpcCallPrecharge object that must contain either the
  *         unique cpcCallPrechargeId or the displayCode/languageCode pair
  *
  * @return cpcCallPrechargeDMO the cpcCallPrecharge data model object
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXFatalException
  * @throws EPPIXUnexpectedException
  */
  public CpcCallPrechargeDMO get( CpcCallPrechargeDMO cpcCallPrechargeDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "get(cpcCallPrechargeDMO)" );

    //
    // Check mandatory parameters.
    //
    thrower.ifParameterMissing( "cpcCallPrechargeDMO", cpcCallPrechargeDMO );

    //
    // Each attribute that is part of the primary key is mandatory
    //
    thrower.ifParameterMissing( "cpcCallPrechargeDMO.cpcId",
      cpcCallPrechargeDMO.getCpcId(  ) );

    //
    // Attempt to get the CpcCallPrechargeDMO
    //
    CpcCallPrechargeDMO returnCpcCallPrechargeDMO = cpcCallPrechargeDAC.get( cpcCallPrechargeDMO );

    //
    // Could not find the CpcCallPrechargeDMO
    //
    if ( returnCpcCallPrechargeDMO == null ) {
      thrower.business( Base_CPCCALLPRECHARGE_000,
        new Object[] { cpcCallPrechargeDMO.getCpcId(  ) } );
    }

    //
    // Now, based on the values of the flags on this method signature, which in turn,
    // are based on this objects associations, get all associated, embedded objects
    //
    return returnCpcCallPrechargeDMO;
  }

  /**
   * Return a list of CpcCallPrecharge objects matching the passed in values. A
   * partial match is performed on the description argument and/or the cpcCallPrecharges
   * displayCode. If no values have been passed in, all CpcCallPrecharge objects are
   * retrieved. Note: if a language specific description does not exist, then
   * the CpcCallPrecharge is retrieved with the special 'NOCODE' description.
   *
   * @param state previous state of the list
   * @param cpcCallPrechargeDMO CpcCallPrechargeDMO object
   *
   * @return DTOList of CpcCallPrecharge objects
   *
   * @throws EPPIXUnexpectedException
   */
  public DTOList getList( 
    DTOListState        state,
    CpcCallPrechargeDMO cpcCallPrechargeDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "getList( state, cpcCallPrechargeDMO )" );

    return cpcCallPrechargeDAC.getList( state, cpcCallPrechargeDMO );
  }

  /**
  * Creates the CpcCallPrecharge object. As a side effect, following creation
  * of a cpcCallPrecharge an audit object may be created.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param cpcCallPrechargeDMO cpcCallPrechargeDMO object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated cpcCallPrechargeDMO object.
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public CpcCallPrechargeDMO create( CpcCallPrechargeDMO cpcCallPrechargeDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "create( cpcCallPrechargeDMO )" );

    thrower.ifParameterMissing( "cpcCallPrechargeDMO", cpcCallPrechargeDMO );

    // Set generated key to 0
    cpcCallPrechargeDMO.setCpcId(new Integer(0));

    thrower.ifParameterMissing( "cpcCallPrechargeDMO.cpcSubscriber",
      cpcCallPrechargeDMO.getCpcSubscriber(  ) );

    thrower.ifParameterMissing( "cpcCallPrechargeDMO.cpcChargeCode",
      cpcCallPrechargeDMO.getCpcChargeCode(  ) );

    thrower.ifParameterMissing( "cpcCallPrechargeDMO.cpcPrechargeDate",
      cpcCallPrechargeDMO.getCpcPrechargeDate(  ) );

    thrower.ifParameterMissing( "cpcCallPrechargeDMO.cpcAmount",
      cpcCallPrechargeDMO.getCpcAmount(  ) );

    thrower.ifParameterMissing( "cpcCallPrechargeDMO.cpcRemaining",
      cpcCallPrechargeDMO.getCpcRemaining(  ) );

    thrower.ifParameterMissing( "cpcCallPrechargeDMO.cpcCreatedDate",
      cpcCallPrechargeDMO.getCpcCreatedDate(  ) );

    thrower.ifParameterMissing( "cpcCallPrechargeDMO.cpcLastCredit",
      cpcCallPrechargeDMO.getCpcLastCredit(  ) );

    //
    // Now create the cpcCallPrecharge
    //
    cpcCallPrechargeDMO = cpcCallPrechargeDAC.create( cpcCallPrechargeDMO );

    return cpcCallPrechargeDMO;
  }

//  /**
//  * Modifies the CpcCallPrecharge object. On any modification, an audit object
//  * is created.
//  * <p>
//  * <B>Possible application exceptions:</B>
//  * <dl><dd>
//  *     <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#CPCCALLPRECHARGE_002}</li>
//  *     <li>The normal general errors:
//  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
//  * </dd></dl><br>
//  * @param cpcCallPrechargeDMO cpcCallPrechargeDMO object<br>
//  *   <dl><dd>
//  *   </dd></dl><br>
//  *
//  * @return populated cpcCallPrechargeDMO object.
//  *
//  * @throws EPPIXBusinessException
//  * @throws EPPIXUnexpectedException
//  * @throws EPPIXFatalException
//  */
//  public CpcCallPrechargeDMO modify( 
//    CpcCallPrechargeDMO aCpcCallPrechargeDMO )
//    throws EPPIXBusinessException, EPPIXUnexpectedException,
//      EPPIXFatalException {
//    logger.debug( "modify( acpcCallPrechargeDMO )" );
//
//    //
//    // Check mandatory parameters (
//    //
//    // Note: attributes stereotyped <NotModifiable> are ignored
//    //
//    thrower.ifParameterMissing( "acpcCallPrechargeDMO", aCpcCallPrechargeDMO );
//
//    thrower.ifParameterMissing( "aCpcCallPrechargeDMO.cpcId",
//      aCpcCallPrechargeDMO.getCpcId(  ) ); // attribute
//
//    thrower.ifParameterMissing( "aCpcCallPrechargeDMO.cpcSubscriber",
//      aCpcCallPrechargeDMO.getCpcSubscriber(  ) ); // attribute
//
//    thrower.ifParameterMissing( "aCpcCallPrechargeDMO.cpcChargeCode",
//      aCpcCallPrechargeDMO.getCpcChargeCode(  ) ); // attribute
//
//    thrower.ifParameterMissing( "aCpcCallPrechargeDMO.cpcPrechargeDate",
//      aCpcCallPrechargeDMO.getCpcPrechargeDate(  ) ); // attribute
//
//    thrower.ifParameterMissing( "aCpcCallPrechargeDMO.cpcAmount",
//      aCpcCallPrechargeDMO.getCpcAmount(  ) ); // attribute
//
//    thrower.ifParameterMissing( "aCpcCallPrechargeDMO.cpcRemaining",
//      aCpcCallPrechargeDMO.getCpcRemaining(  ) ); // attribute
//
//    thrower.ifParameterMissing( "aCpcCallPrechargeDMO.cpcCreatedDate",
//      aCpcCallPrechargeDMO.getCpcCreatedDate(  ) ); // attribute
//
//    thrower.ifParameterMissing( "aCpcCallPrechargeDMO.cpcLastCredit",
//      aCpcCallPrechargeDMO.getCpcLastCredit(  ) ); // attribute
//
//    CpcCallPrechargeDMO updateCpcCallPrechargeDMO = new CpcCallPrechargeDMO(  );
//
//    updateCpcCallPrechargeDMO.setCpcId( aCpcCallPrechargeDMO.getCpcId(  ) );
//
//    updateCpcCallPrechargeDMO = get( updateCpcCallPrechargeDMO );
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
//    updateCpcCallPrechargeDMO.setCpcSubscriber( aCpcCallPrechargeDMO
//      .getCpcSubscriber(  ) );
//
//    updateCpcCallPrechargeDMO.setCpcMsisdn(aCpcCallPrechargeDMO
//      .getCpcMsisdn());
//
//    updateCpcCallPrechargeDMO.setCpcSimNo( aCpcCallPrechargeDMO
//      .getCpcSimNo());
//
//    updateCpcCallPrechargeDMO.setCpcNetworkId( aCpcCallPrechargeDMO
//      .getCpcNetworkId(  ) );
//
//    updateCpcCallPrechargeDMO.setCpcChargeCode( aCpcCallPrechargeDMO
//      .getCpcChargeCode(  ) );
//
//    updateCpcCallPrechargeDMO.setCpcPrechargeDate( aCpcCallPrechargeDMO
//      .getCpcPrechargeDate(  ) );
//
//    updateCpcCallPrechargeDMO.setCpcAmount( aCpcCallPrechargeDMO.getCpcAmount(  ) );
//
//    updateCpcCallPrechargeDMO.setCpcRemaining( aCpcCallPrechargeDMO
//      .getCpcRemaining(  ) );
//
//    updateCpcCallPrechargeDMO.setCpcCreatedDate( aCpcCallPrechargeDMO
//      .getCpcCreatedDate(  ) );
//
//    updateCpcCallPrechargeDMO.setCpcLastBilldate( aCpcCallPrechargeDMO
//      .getCpcLastBilldate(  ) );
//
//    updateCpcCallPrechargeDMO.setCpcLastInvoice( aCpcCallPrechargeDMO
//      .getCpcLastInvoice(  ) );
//
//    updateCpcCallPrechargeDMO.setCpcLastCredit( aCpcCallPrechargeDMO
//      .getCpcLastCredit(  ) );
//
//    //
//    // Modify the cpcCallPrechargeDMO
//    //
//    cpcCallPrechargeDAC.modify( updateCpcCallPrechargeDMO );
//
//    // Create a new DMO, set keys, and fetch from the database...
//    CpcCallPrechargeDMO returnCpcCallPrechargeDMO = new CpcCallPrechargeDMO(  );
//
//    returnCpcCallPrechargeDMO.setCpcId( updateCpcCallPrechargeDMO.getCpcId(  ) );
//
//    returnCpcCallPrechargeDMO = get( returnCpcCallPrechargeDMO );
//
//    return returnCpcCallPrechargeDMO;
//  }

  /**
  * Modifies the CpcCallPrecharge object.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#ECEVENTCOMMAND_002}</li>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param CpcCallPrechargeDMO object<br>
  * @param filter object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated cpcCallPrechargeDMO object.
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
    // Modify the cpcCallPrechargeDMO
    //
    cpcCallPrechargeDAC.modify( filter );
  }

  /**
   * Deletes the CpcCallPrecharge object. On deletion, an audit object is created
   * <p>
   * <B>Possible application exceptions:</B>
   * <dl><dd>Base_CPCCALLPRECHARGE_003
   *     <li>{@link #Base#CPCCALLPRECHARGE_000} if the CpcCallPrecharge does not exist.</li>
   *     <li>{@link #Base#CPCCALLPRECHARGE_003} if the CpcCallPrecharge is in use.</li>
   *     <li>The normal general errors:
   *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
   * </dd></dl>
   *  @param CpcCallPrechargeDMO CpcCallPrecharge object with embedded displayCode and
   *        languageCode.
   *
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public void delete( CpcCallPrechargeDMO cpcCallPrechargeDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "delete( cpcCallPrechargeDMO )" );

    thrower.ifParameterMissing( "cpcCallPrechargeDMO", cpcCallPrechargeDMO );

    CpcCallPrechargeDMO updateCpcCallPrechargeDMO = null;

    updateCpcCallPrechargeDMO = get( cpcCallPrechargeDMO );

    // delete self...
    cpcCallPrechargeDAC.delete( cpcCallPrechargeDMO );
  }

  /**
   * Deletes the CpcCallPrecharge object.
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
    cpcCallPrechargeDAC.delete( filter );
  }

  /**
  * Indicates whether a CpcCallPrecharge exists in the database
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl>
  *
  *
  * @return true if the CpcCallPrecharge exists in the database
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public boolean exists( CpcCallPrechargeDMO cpcCallPrechargeDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "exists(cpcCallPrecharge)" );

    thrower.ifParameterMissing( "cpcCallPrechargeDMO", cpcCallPrechargeDMO );

    thrower.ifParameterMissing( "cpcCallPrechargeDMO.cpcId",
      cpcCallPrechargeDMO.getCpcId(  ) );

    return cpcCallPrechargeDAC.exists( cpcCallPrechargeDMO );
  }

  /**
   * Indicates whether a CpcCallPrecharge exists in the database
   * <p>
   * <B>Possible application exceptions:</B>
   * <dl><dd>
   *     <li>The normal general errors:
   *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
   * </dd></dl>
   *
   *
   * @return true if the CpcCallPrecharge exists in the database
   *
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public boolean exists( QueryFilter filter )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "exists(filter)" );

    return cpcCallPrechargeDAC.exists( filter );
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

    return cpcCallPrechargeDAC.getList( state, filter );
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

    return cpcCallPrechargeDAC.iterate( filter );
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

    return cpcCallPrechargeDAC.iterateWithLock( filter );
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
  public CpcCallPrechargeDMO get( QueryFilter filter )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "get( filter )" );

    //
    // Check mandatory parameters.
    //
    thrower.ifParameterMissing( "filter", filter );

    //
    // Attempt to get the CpcCallPrechargeDMO
    //
    CpcCallPrechargeDMO cpcCallPrechargeDMO = cpcCallPrechargeDAC.get( filter );

    return cpcCallPrechargeDMO;
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

    return cpcCallPrechargeDAC.max( filter );
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

    return cpcCallPrechargeDAC.min( filter );
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

    return new Integer(cpcCallPrechargeDAC.count(filter));
  }
}
