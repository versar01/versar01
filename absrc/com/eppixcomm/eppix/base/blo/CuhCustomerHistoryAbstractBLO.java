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

import org.apache.log4j.Logger;

import com.eppixcomm.eppix.common.data.DAC;
import com.eppixcomm.eppix.common.data.DAOIterator;
import com.eppixcomm.eppix.common.util.QueryFilter;
import com.eppixcomm.eppix.common.data.DTOActionTypes;
import com.eppixcomm.eppix.common.data.DTOList;
import com.eppixcomm.eppix.common.data.DTOListState;
import com.eppixcomm.eppix.base.error.EPPIXBusinessException;
import com.eppixcomm.eppix.base.error.EPPIXFatalException;
import com.eppixcomm.eppix.base.error.EPPIXUnexpectedException;
import com.eppixcomm.eppix.base.error.Thrower;

/**
 * Holds details about events occurring at Subscriber Level.
 *
 * This abstract business logic class holds all the logic for the CuhCustomerHistory class.
 * It is extended by CuhCustomerHistory class which holds the additional logic that is required, if any.
 *
 * @author
 * @version $Revision: $
 *
 * @since $jdk$
 */
public abstract class CuhCustomerHistoryAbstractBLO
  extends BaseBLO
  implements DTOActionTypes, BaseMessages {
  //~ Static variables/initializers //////////////////////////////////////////

  /** DOCUMENT ME! */
  static Thrower thrower = Thrower.getThrower( CuhCustomerHistoryAbstractBLO.class );
  /** DOCUMENT ME! */
  protected static final String ENTITY_ID = "CUHH";

  //~ Instance variables /////////////////////////////////////////////////////

  /** DOCUMENT ME! */
  protected Logger logger = thrower.getLogger(  );

  /** Data Access Controller. */
  protected CuhCustomerHistoryAbstractDAC CuhCustomerHistoryDAC;

  //~ Methods ////////////////////////////////////////////////////////////////

  /** Invoked by the BLOBinder to get the DAC class for this BLO. */
  protected Class getDACClass(  ) {
    return CuhCustomerHistoryAbstractDAC.class;
  }

  /** Invoked by the BLOBinder to provide this BLO with its DAC. */
  protected void setDAC( DAC dac ) {
    this.CuhCustomerHistoryDAC = (CuhCustomerHistoryAbstractDAC) dac;
  }
  

  /**
   * Return a list of CuhCustomerHistory objects matching the passed in values. A
   * partial match is performed on the description argument and/or the CuhCustomerHistorys
   * displayCode. If no values have been passed in, all CuhCustomerHistory objects are
   * retrieved. Note: if a language specific description does not exist, then
   * the CuhCustomerHistory is retrieved with the special 'NOCODE' description.
   *
   * @param state previous state of the list
   * @param CuhCustomerHistoryDMO CuhCustomerHistoryDMO object
   *
   * @return DTOList of CuhCustomerHistory objects
   *
   * @throws EPPIXUnexpectedException
   */
  public DTOList getList( 
    DTOListState     state,
    CuhCustomerHistoryDMO CuhCustomerHistoryDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "getList( state, CuhCustomerHistoryDMO )" );

    return CuhCustomerHistoryDAC.getList( state, CuhCustomerHistoryDMO );
  }

  /**
  * Creates the CuhCustomerHistory object. As a side effect, following creation
  * of a CuhCustomerHistory an audit object may be created.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param CuhCustomerHistoryDMO CuhCustomerHistoryDMO object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated CuhCustomerHistoryDMO object.
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public CuhCustomerHistoryDMO create( CuhCustomerHistoryDMO CuhCustomerHistoryDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "create( CuhCustomerHistoryDMO )" );

    thrower.ifParameterMissing( "CuhCustomerHistoryDMO", CuhCustomerHistoryDMO );

    thrower.ifParameterMissing( "CuhCustomerHistoryDMO.cuhBillAcNo",
      CuhCustomerHistoryDMO.getCuhBillAcNo(  ) );

    thrower.ifParameterMissing( "CuhCustomerHistoryDMO.cuhTimestamp",
      CuhCustomerHistoryDMO.getCuhTimestamp(  ) );

    //
    // Now create the CuhCustomerHistory
    //
    CuhCustomerHistoryDAC.create( CuhCustomerHistoryDMO );

    return CuhCustomerHistoryDMO;
  }

  /**
  * Modifies the CuhCustomerHistory object.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#ECEVENTCOMMAND_002}</li>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param CuhCustomerHistoryDMO object<br>
  * @param filter object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated CuhCustomerHistoryDMO object.
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
    // Modify the CuhCustomerHistoryDMO
    //
    CuhCustomerHistoryDAC.modify( filter );
  }

  /**
   * Deletes the CuhCustomerHistory object.
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
    CuhCustomerHistoryDAC.delete( filter );
  }

  /**
   * Indicates whether a CuhCustomerHistory exists in the database
   * <p>
   * <B>Possible application exceptions:</B>
   * <dl><dd>
   *     <li>The normal general errors:
   *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
   * </dd></dl>
   *
   *
   * @return true if the CuhCustomerHistory exists in the database
   *
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public boolean exists( QueryFilter filter )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "exists(filter)" );

    return CuhCustomerHistoryDAC.exists( filter );
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

    return CuhCustomerHistoryDAC.getList( state, filter );
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

    return CuhCustomerHistoryDAC.iterate( filter );
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

    return CuhCustomerHistoryDAC.iterateWithLock( filter );
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
  public CuhCustomerHistoryDMO get( QueryFilter filter )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "get( filter )" );

    //
    // Check mandatory parameters.
    //
    thrower.ifParameterMissing( "filter", filter );

    //
    // Attempt to get the CuhCustomerHistoryDMO
    //
    CuhCustomerHistoryDMO CuhCustomerHistoryDMO = CuhCustomerHistoryDAC.get( filter );

    return CuhCustomerHistoryDMO;
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

    return CuhCustomerHistoryDAC.max( filter );
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

    return CuhCustomerHistoryDAC.min( filter );
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
  public int count( QueryFilter filter )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "count( filter )" );

    //
    // Check mandatory parameters.
    //
    thrower.ifParameterMissing( "filter", filter );

    return CuhCustomerHistoryDAC.count( filter );
  }
}
