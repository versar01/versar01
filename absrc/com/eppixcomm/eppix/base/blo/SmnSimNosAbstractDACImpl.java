package com.eppixcomm.eppix.base.blo;


import com.eppixcomm.eppix.base.blo.SmnSimNosDMO;
import com.eppixcomm.eppix.common.core.UserContext; // always required for this sort of class
import com.eppixcomm.eppix.common.data.DAC; // always required for this sort of class
import com.eppixcomm.eppix.common.data.DAO; // always required for this sort of class
import com.eppixcomm.eppix.common.data.DAOArgs; // always required for this sort of class
import com.eppixcomm.eppix.common.data.DAOIterator;
import com.eppixcomm.eppix.common.data.DAOParamQueryArgs; // always required for this sort of class
import com.eppixcomm.eppix.common.data.DAOThrower; // always required for this sort of class
import com.eppixcomm.eppix.common.data.DMO; // always required for this sort of class
import com.eppixcomm.eppix.common.util.FilterPart;
import com.eppixcomm.eppix.common.util.QueryFilter;
import com.eppixcomm.eppix.common.data.DTOList; // always required for this sort of class
import com.eppixcomm.eppix.common.data.DTOListState; // always required for this sort of class
import com.eppixcomm.eppix.base.error.EPPIXObjectBusyException; // always required for this sort of class
import com.eppixcomm.eppix.base.error.EPPIXObjectExpiredException; // always required for this sort of class
import com.eppixcomm.eppix.base.error.EPPIXObjectNotFoundException; // always required for this sort of class
import com.eppixcomm.eppix.base.error.EPPIXSeriousException; // always required for this sort of class
import com.eppixcomm.eppix.base.error.EPPIXUnexpectedException; // always required for this sort of class
import com.eppixcomm.eppix.common.util.Date; // always required for this sort of class
import com.eppixcomm.eppix.common.util.DateTime; // always required for this sort of class
import com.eppixcomm.eppix.common.util.Time;

import org.apache.log4j.Logger; // always required for this sort of class

import java.math.BigDecimal; // always required for this sort of class

import java.util.Iterator;
import java.util.List;

/**
 * This is the standard implementation of the Data Access Controller for the
 * SmnSimNos Business Object.
 *
 * @version $Revision: 1.2 $
 * @author $Author$
 * @since $jdk$
 */
public class SmnSimNosAbstractDACImpl
  extends DAC
  implements SmnSimNosAbstractDAC {
  //~ Static variables/initializers //////////////////////////////////////////

  /** Error handler/logger. */
  public static DAOThrower thrower = DAOThrower.getDAOThrower( SmnSimNosAbstractDACImpl.class );

  //~ Instance variables /////////////////////////////////////////////////////

  /** DOCUMENT ME! */
  public Logger logger = thrower.getLogger(  );

  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new SmnSimNosDACImpl object.
   *
   * @param dao Data Access Object.
   * @param defaultLanguageCode the working language of the user, dictates
   *        which language specific descriptions are retrieved.
   */
  public SmnSimNosAbstractDACImpl( 
    UserContext userContext,
    DAO         dao ) {
    super( dao, thrower );
  }

  public SmnSimNosAbstractDACImpl(DAO dao ) {
		    super( dao, thrower );
		  }
  //~ Methods ////////////////////////////////////////////////////////////////

  /**
   * Retrieves a SmnSimNos Data Model Object
   *
   * @return a populated SmnSimNos Data Model Object or null if not found.
   *
   * @throws EPPIXSeriousException
   */
  public SmnSimNosDMO get( SmnSimNosDMO smnSimNosDMO )
    throws EPPIXSeriousException {
    logger.debug( "get( SmnSimNosDMO )" );

    thrower.ifParameterMissing( "SmnSimNosDMO", smnSimNosDMO );

    return (SmnSimNosDMO) dao.get( smnSimNosDMO );
  }

  /**
   * Creates the SmnSimNos object in the database.
   *
   * @param SmnSimNosDMO smnSimNosDMO
   *
   * @throws EPPIXSeriousException
   */
  public void create( SmnSimNosDMO smnSimNosDMO )
    throws EPPIXSeriousException {
    logger.debug( "create( smnSimNosDMO )" );
    thrower.ifParameterMissing( "SmnSimNosDMO", smnSimNosDMO );

    dao.insert( smnSimNosDMO );
  }

  /**
   * Locks and retrieves the SmnSimNos object from the database.
   *
   * @param aSmnSimNos SmnSimNos object
   *
   * @return a populated SmnSimNos object or null if not found.
   *
   * @throws EPPIXSeriousException
   */
  public SmnSimNosDMO lock( SmnSimNosDMO aSmnSimNosDMO )
    throws EPPIXSeriousException, EPPIXObjectBusyException {
    logger.debug( "lock( aSmnSimNosDMO )" );

    thrower.ifParameterMissing( "aSmnSimNosDMO", aSmnSimNosDMO );

    SmnSimNosDMO lockedSmnSimNosDMO = null;

    //
    // Lock the base table on its primary key.
    //
    lockedSmnSimNosDMO = (SmnSimNosDMO) dao.lock( "SmnSimNos",
        "filterByPrimaryKey",
        new DAOArgs( 1 ).arg( aSmnSimNosDMO.getSmnSimNo(  ) ) );

    return lockedSmnSimNosDMO;
  }

  /**
   * Modifies the SmnSimNos object in the database.
   *
   * @param SmnSimNosDMO SmnSimNos object
   *
   * @throws EPPIXSeriousException
   * @throws EPPIXObjectExpiredException
   * @throws EPPIXObjectNotFoundException
   */
  public void modify( SmnSimNosDMO smnSimNosDMO )
    throws EPPIXSeriousException, EPPIXObjectExpiredException,
      EPPIXObjectNotFoundException {
    logger.debug( "modify( aSmnSimNosDMO )" );

    thrower.ifParameterMissing( "aSmnSimNosDMO", smnSimNosDMO );

    thrower.ifParameterMissing( "SmnSimNosDMO.smnSimNo",
      smnSimNosDMO.getSmnSimNo(  ) );

    dao.update( smnSimNosDMO );
  }

  /**
  * Modifies the SmnSimNos object using the specified filter in the database.
  *
  * @param filter object
  *
  * @throws EPPIXSeriousException
  * @throws EPPIXObjectExpiredException
  * @throws EPPIXObjectNotFoundException
  */
  public void modify( QueryFilter filter )
    throws EPPIXSeriousException, EPPIXObjectExpiredException,
      EPPIXObjectNotFoundException {
    logger.debug( "modify( filter )" );

    thrower.ifParameterMissing( "filter", filter );

    dao.updateCustom( new SmnSimNosDMO(  ), filterQueryArgs( filter, null ) );
  }

  /**
   * Deletes the SmnSimNos object from the database.
   *
   * @param SmnSimNosDMO SmnSimNos object
   *
   * @throws EPPIXSeriousException
   * @throws EPPIXObjectNotFoundException
   * @throws EPPIXObjectExpiredException
   */
  public void delete( SmnSimNosDMO smnSimNosDMO )
    throws EPPIXSeriousException, EPPIXObjectNotFoundException,
      EPPIXObjectExpiredException {
    logger.debug( "delete( SmnSimNosDMO )" );

    thrower.ifParameterMissing( "SmnSimNosDMO", smnSimNosDMO );

    thrower.ifParameterMissing( "SmnSimNosDMO.smnSimNo",
      smnSimNosDMO.getSmnSimNo(  ) );

    dao.delete( smnSimNosDMO );
  }

  /**
   * Deletes the SmnSimNos object from the database.
   *
   * @param QueryFilterfilter object
   *
   * @throws EPPIXSeriousException
   * @throws EPPIXObjectNotFoundException
   * @throws EPPIXObjectExpiredException
   */
  public void delete( QueryFilter filter )
    throws EPPIXSeriousException, EPPIXObjectNotFoundException,
      EPPIXObjectExpiredException {
    logger.debug( "delete( filter )" );

    thrower.ifParameterMissing( "filter", filter );

    DAOParamQueryArgs args = filterQueryArgs( filter, null );

    dao.delete( "SmnSimNos", args.getFilterBy(  ), args );
  }

  /**
  * Return true if a SmnSimNos object exists.
  *
  * @param SmnSimNosDMO SmnSimNosDMO
  *
  * @return true if the SmnSimNos object exists.
  *
  * @throws EPPIXSeriousException
  */
  public boolean exists( SmnSimNosDMO SmnSimNosDMO )
    throws EPPIXSeriousException {
    logger.debug( "exists( SmnSimNosDMO)" );

    return dao.exists( "SmnSimNos", "filterByPrimaryKey",
      new DAOArgs( 1 ).arg( SmnSimNosDMO.getSmnSimNo(  ) ) );
  }

  /**
    * Return true if a SmnSimNos object exists.
    *
    * @param filter
    *
    * @return true if the SmnSimNos object exists.
    *
    * @throws EPPIXSeriousException
    */
  public boolean exists( QueryFilter filter )
    throws EPPIXSeriousException {
    logger.debug( "exists( filter )" );

    return dao.exists( filterQueryArgs( filter, null ) );
  }

  /**
   * Return a list of location objects matching the passed in values. A
   * partial match is performed on the description argument. If no language
   * Code is passed inside the locationDMO then the language passed in the
   * EppixLocale object is used.
   *
   * @param state previous state of the list.
   * @param locationDMO SmnSimNos Data Model Object
   *
   * @return DTOList of SmnSimNos Data Model Objects.
   *
   * @throws EPPIXSeriousException
   */
  public DTOList getList( 
    DTOListState state,
    SmnSimNosDMO smnSimNosDMO )
    throws EPPIXSeriousException {
    logger.debug( "getList( state, smnSimNosDMO )" );

    /**
     * TODO SJ Fixme
     */
//    return dao.getListAbs( state, paramQueryArgs( smnSimNosDMO ) );
    return null;
  }

  /**
   * Constructs parameterised query arguments.
   *
   * @param $(dataObjectNameLowerCamel} SmnSimNosDMO object.
   */
  protected DAOParamQueryArgs paramQueryArgs( SmnSimNosDMO smnSimNosDMO ) {
    logger.debug( "paramQueryArgs( smnSimNosDMO)" );

    DAOParamQueryArgs queryArgs = new DAOParamQueryArgs( "SmnSimNos", 21 * 2 );

    if ( smnSimNosDMO != null ) {
      // primary key filters...
      String smnSimNo = smnSimNosDMO.getSmnSimNo(  );

      if ( !DMO.isNull( smnSimNo ) ) {
        queryArgs.andFilterBy( "SmnSimNoMatch" )
                 .arg( smnSimNo + dao.wildcardForAnySequence(  ) );
      }

      // define more filters...
      String smnNetworkId = smnSimNosDMO.getSmnNetworkId(  );

      if ( !DMO.isNull( smnNetworkId ) ) {
        queryArgs.andFilterBy( "SmnNetworkIdMatch" )
                 .arg( smnNetworkId + dao.wildcardForAnySequence(  ) );
      }

      String smnImsiNo = smnSimNosDMO.getSmnImsiNo(  );

      if ( !DMO.isNull( smnImsiNo ) ) {
        queryArgs.andFilterBy( "SmnImsiNoMatch" )
                 .arg( smnImsiNo + dao.wildcardForAnySequence(  ) );
      }

      String smnKi = smnSimNosDMO.getSmnKi(  );

      if ( !DMO.isNull( smnKi ) ) {
        queryArgs.andFilterBy( "SmnKiMatch" )
                 .arg( smnKi + dao.wildcardForAnySequence(  ) );
      }

      String smnOnNetwork = smnSimNosDMO.getSmnOnNetwork(  );

      if ( !DMO.isNull( smnOnNetwork ) ) {
        queryArgs.andFilterBy( "SmnOnNetworkMatch" )
                 .arg( smnOnNetwork + dao.wildcardForAnySequence(  ) );
      }

      String smnHlr = smnSimNosDMO.getSmnHlr(  );

      if ( !DMO.isNull( smnHlr ) ) {
        queryArgs.andFilterBy( "SmnHlrMatch" )
                 .arg( smnHlr + dao.wildcardForAnySequence(  ) );
      }

      String smnPukNo = smnSimNosDMO.getSmnPukNo(  );

      if ( !DMO.isNull( smnPukNo ) ) {
        queryArgs.andFilterBy( "SmnPukNoMatch" )
                 .arg( smnPukNo + dao.wildcardForAnySequence(  ) );
      }

      String smnStatus = smnSimNosDMO.getSmnStatus(  );

      if ( !DMO.isNull( smnStatus ) ) {
        queryArgs.andFilterBy( "SmnStatusMatch" )
                 .arg( smnStatus + dao.wildcardForAnySequence(  ) );
      }

      String smnWarehouse = smnSimNosDMO.getSmnWarehouse(  );

      if ( !DMO.isNull( smnWarehouse ) ) {
        queryArgs.andFilterBy( "SmnWarehouseMatch" )
                 .arg( smnWarehouse + dao.wildcardForAnySequence(  ) );
      }

      String smnProductCode = smnSimNosDMO.getSmnProductCode(  );

      if ( !DMO.isNull( smnProductCode ) ) {
        queryArgs.andFilterBy( "SmnProductCodeMatch" )
                 .arg( smnProductCode + dao.wildcardForAnySequence(  ) );
      }

      String smnDealerId = smnSimNosDMO.getSmnDealerId(  );

      if ( !DMO.isNull( smnDealerId ) ) {
        queryArgs.andFilterBy( "SmnDealerIdMatch" )
                 .arg( smnDealerId + dao.wildcardForAnySequence(  ) );
      }

      String smnTransportKey = smnSimNosDMO.getSmnTransportKey(  );

      if ( !DMO.isNull( smnTransportKey ) ) {
        queryArgs.andFilterBy( "SmnTransportKeyMatch" )
                 .arg( smnTransportKey + dao.wildcardForAnySequence(  ) );
      }

      String smnPinNo = smnSimNosDMO.getSmnPinNo(  );

      if ( !DMO.isNull( smnPinNo ) ) {
        queryArgs.andFilterBy( "SmnPinNoMatch" )
                 .arg( smnPinNo + dao.wildcardForAnySequence(  ) );
      }

      String smnPukNo2 = smnSimNosDMO.getSmnPukNo2(  );

      if ( !DMO.isNull( smnPukNo2 ) ) {
        queryArgs.andFilterBy( "SmnPukNo2Match" )
                 .arg( smnPukNo2 + dao.wildcardForAnySequence(  ) );
      }

      String smnPinNo2 = smnSimNosDMO.getSmnPinNo2(  );

      if ( !DMO.isNull( smnPinNo2 ) ) {
        queryArgs.andFilterBy( "SmnPinNo2Match" )
                 .arg( smnPinNo2 + dao.wildcardForAnySequence(  ) );
      }

      String smnAnalysis1 = smnSimNosDMO.getSmnAnalysis1(  );

      if ( !DMO.isNull( smnAnalysis1 ) ) {
        queryArgs.andFilterBy( "SmnAnalysis1Match" )
                 .arg( smnAnalysis1 + dao.wildcardForAnySequence(  ) );
      }

      String smnAnalysis2 = smnSimNosDMO.getSmnAnalysis2(  );

      if ( !DMO.isNull( smnAnalysis2 ) ) {
        queryArgs.andFilterBy( "SmnAnalysis2Match" )
                 .arg( smnAnalysis2 + dao.wildcardForAnySequence(  ) );
      }

      String smnAnalysis3 = smnSimNosDMO.getSmnAnalysis3(  );

      if ( !DMO.isNull( smnAnalysis3 ) ) {
        queryArgs.andFilterBy( "SmnAnalysis3Match" )
                 .arg( smnAnalysis3 + dao.wildcardForAnySequence(  ) );
      }
    } else {
      // include all default languageCode filters where appropriate...
    }

    return queryArgs;
  }

  /**
   * DOCUMENT ME!
   *
   * @param state DOCUMENT ME!
   * @param filter DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   *
   * @throws EPPIXSeriousException DOCUMENT ME!
   */
  public DTOList getList( 
    DTOListState state,
    QueryFilter  filter )
    throws EPPIXSeriousException {
    logger.debug( "getList( state, filter )" );

    /**
     * TODO SJ Fixme
     */
//    return dao.getListAbs( state, filterQueryArgs( filter, null ) );
    return null;
  }

  /**
   * DOCUMENT ME!
   *
   * @param filter DOCUMENT ME!
   * @param dmlName DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  protected DAOParamQueryArgs filterQueryArgs( 
    QueryFilter filter,
    String      dmlName ) {
    List parts = filter.getParts(  );
    DAOParamQueryArgs queryArgs = new DAOParamQueryArgs( ( dmlName == null )
        ? "SmnSimNos" : dmlName, parts.size(  ) );

    Iterator it = parts.iterator();
//    for ( FilterPart part : parts ) {
    while(it.hasNext()){
    	FilterPart part = (FilterPart)it.next();
      switch ( part.getIndex(  ) ) {
        case SmnSimNosDMO.smnSimNoFilter:
          part.andFilterBy( queryArgs, "SmnSimNo",
            dao.wildcardForAnySequence(  ) );

          break;

        case SmnSimNosDMO.smnNetworkIdFilter:
          part.andFilterBy( queryArgs, "SmnNetworkId",
            dao.wildcardForAnySequence(  ) );

          break;

        case SmnSimNosDMO.smnImsiNoFilter:
          part.andFilterBy( queryArgs, "SmnImsiNo",
            dao.wildcardForAnySequence(  ) );

          break;

        case SmnSimNosDMO.smnKiFilter:
          part.andFilterBy( queryArgs, "SmnKi", dao.wildcardForAnySequence(  ) );

          break;

        case SmnSimNosDMO.smnOnNetworkFilter:
          part.andFilterBy( queryArgs, "SmnOnNetwork",
            dao.wildcardForAnySequence(  ) );

          break;

        case SmnSimNosDMO.smnHlrFilter:
          part.andFilterBy( queryArgs, "SmnHlr",
            dao.wildcardForAnySequence(  ) );

          break;

        case SmnSimNosDMO.smnPukNoFilter:
          part.andFilterBy( queryArgs, "SmnPukNo",
            dao.wildcardForAnySequence(  ) );

          break;

        case SmnSimNosDMO.smnStatusFilter:
          part.andFilterBy( queryArgs, "SmnStatus",
            dao.wildcardForAnySequence(  ) );

          break;

        case SmnSimNosDMO.smnActiveDateFilter:
          part.andFilterBy( queryArgs, "SmnActiveDate",
            dao.wildcardForAnySequence(  ) );

          break;

        case SmnSimNosDMO.smnAvailDateFilter:
          part.andFilterBy( queryArgs, "SmnAvailDate",
            dao.wildcardForAnySequence(  ) );

          break;

        case SmnSimNosDMO.smnExpiryDateFilter:
          part.andFilterBy( queryArgs, "SmnExpiryDate",
            dao.wildcardForAnySequence(  ) );

          break;

        case SmnSimNosDMO.smnWarehouseFilter:
          part.andFilterBy( queryArgs, "SmnWarehouse",
            dao.wildcardForAnySequence(  ) );

          break;

        case SmnSimNosDMO.smnProductCodeFilter:
          part.andFilterBy( queryArgs, "SmnProductCode",
            dao.wildcardForAnySequence(  ) );

          break;

        case SmnSimNosDMO.smnDealerIdFilter:
          part.andFilterBy( queryArgs, "SmnDealerId",
            dao.wildcardForAnySequence(  ) );

          break;

        case SmnSimNosDMO.smnTransportKeyFilter:
          part.andFilterBy( queryArgs, "SmnTransportKey",
            dao.wildcardForAnySequence(  ) );

          break;

        case SmnSimNosDMO.smnPinNoFilter:
          part.andFilterBy( queryArgs, "SmnPinNo",
            dao.wildcardForAnySequence(  ) );

          break;

        case SmnSimNosDMO.smnPukNo2Filter:
          part.andFilterBy( queryArgs, "SmnPukNo2",
            dao.wildcardForAnySequence(  ) );

          break;

        case SmnSimNosDMO.smnPinNo2Filter:
          part.andFilterBy( queryArgs, "SmnPinNo2",
            dao.wildcardForAnySequence(  ) );

          break;

        case SmnSimNosDMO.smnAnalysis1Filter:
          part.andFilterBy( queryArgs, "SmnAnalysis1",
            dao.wildcardForAnySequence(  ) );

          break;

        case SmnSimNosDMO.smnAnalysis2Filter:
          part.andFilterBy( queryArgs, "SmnAnalysis2",
            dao.wildcardForAnySequence(  ) );

          break;

        case SmnSimNosDMO.smnAnalysis3Filter:
          part.andFilterBy( queryArgs, "SmnAnalysis3",
            dao.wildcardForAnySequence(  ) );

          break;
      }
    }

    return queryArgs;
  }

  /**
  * Provides a DAOIterator to iterate over the list of SmnSimNos records based
  * on the passed in Filter.
  *
  * @param filter
  * @return
  * @throws EPPIXSeriousException
  */
  public DAOIterator iterate( QueryFilter filter )
    throws EPPIXSeriousException {
    logger.debug( "iterate( filter )" );

    return dao.iterator(filterQueryArgs( filter, null ) );

  }

  /**
  * Provides a DAOIterator to iterate using a "FOR UPDATE", over the list of SmnSimNos records based
  * on the passed in Filter.
  *
  * @param filter
  * @return
  * @throws EPPIXSeriousException
  * TOD SJ: Replace method with compatible java code
  */
  public DAOIterator iterateWithLock( QueryFilter filter )
    throws EPPIXSeriousException {
    logger.debug( "iterateWithLock( filter )" );

    return dao.iterator( filterQueryArgs( filter, null ),
      true );
  }

  /**
   * Retrieves the SmnSimNos Data Model Object from a possible list.
   *
   * @param filter
   * @return
   * @throws EPPIXSeriousException
   */
  public SmnSimNosDMO get( QueryFilter filter )
    throws EPPIXSeriousException {
    logger.debug( "get( filter )" );

    DAOParamQueryArgs args = filterQueryArgs( filter, null );

    return (SmnSimNosDMO) dao.get( args.getDMLName(  ), args.getFilterBy(  ),
      args );
  }

  /**
   * DOCUMENT ME!
   *
   * @param filter DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   *
   * @throws EPPIXSeriousException DOCUMENT ME!
   */
  public Object max( QueryFilter filter )
    throws EPPIXSeriousException {
    logger.debug( "max( filter )" );

    DAOParamQueryArgs args = filterQueryArgs( filter, null );

    return dao.max( args.getDMLName(  ), args.getFilterBy(  ), args,
      args.getMaxField(  ) );
  }

  /**
   * DOCUMENT ME!
   *
   * @param filter DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   *
   * @throws EPPIXSeriousException DOCUMENT ME!
   */
  public Object min( QueryFilter filter )
    throws EPPIXSeriousException {
    logger.debug( "min( filter )" );

    DAOParamQueryArgs args = filterQueryArgs( filter, null );

    return dao.min( args.getDMLName(  ), args.getFilterBy(  ), args,
      args.getMaxField(  ) );
  }

  /**
   * Counts (COUNT(*)) the number of rows for the specified filter.
   *
   * @param filter
   * @return the count of rows.
   *
   * @throws EPPIXSeriousException
   */
  public int count( QueryFilter filter )
    throws EPPIXSeriousException {
    logger.debug( "count( filter )" );

    DAOParamQueryArgs args = filterQueryArgs( filter, null );

    return dao.count( args.getDMLName(  ), args.getFilterBy(  ), args );
  }
}

