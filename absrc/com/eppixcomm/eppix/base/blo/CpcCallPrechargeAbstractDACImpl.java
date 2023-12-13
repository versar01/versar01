package com.eppixcomm.eppix.base.blo;


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
 * CpcCallPrecharge Business Object.
 *
 * @version $Revision: 1.2 $
 * @author $Author$
 * @since $jdk$
 */
public class CpcCallPrechargeAbstractDACImpl
  extends DAC
  implements CpcCallPrechargeAbstractDAC {
  //~ Static variables/initializers //////////////////////////////////////////

  /** Error handler/logger. */
  static DAOThrower thrower = DAOThrower.getDAOThrower( CpcCallPrechargeAbstractDACImpl.class );

  //~ Instance variables /////////////////////////////////////////////////////

  /** DOCUMENT ME! */
  Logger logger = thrower.getLogger(  );

  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new CpcCallPrechargeDACImpl object.
   *
   * @param dao Data Access Object.
   * @param defaultLanguageCode the working language of the user, dictates
   *        which language specific descriptions are retrieved.
   */
  public CpcCallPrechargeAbstractDACImpl( 
    UserContext userContext,
    DAO         dao ) {
    super( userContext, dao, thrower );
  }
  
  public CpcCallPrechargeAbstractDACImpl( DAO dao ) {
		    super( dao, thrower );
  }

  //~ Methods ////////////////////////////////////////////////////////////////

  /**
   * Retrieves a CpcCallPrecharge Data Model Object
   *
   * @return a populated CpcCallPrecharge Data Model Object or null if not found.
   *
   * @throws EPPIXSeriousException
   */
  public CpcCallPrechargeDMO get( CpcCallPrechargeDMO cpcCallPrechargeDMO )
    throws EPPIXSeriousException {
    logger.debug( "get( CpcCallPrechargeDMO )" );

    thrower.ifParameterMissing( "CpcCallPrechargeDMO", cpcCallPrechargeDMO );

    return (CpcCallPrechargeDMO) dao.get( cpcCallPrechargeDMO );
  }

  /**
   * Creates the CpcCallPrecharge object in the database.
   *
   * @param CpcCallPrechargeDMO cpcCallPrechargeDMO
   *
   * @throws EPPIXSeriousException
   */
  public CpcCallPrechargeDMO create( CpcCallPrechargeDMO cpcCallPrechargeDMO )
    throws EPPIXSeriousException {
    logger.debug( "create( cpcCallPrechargeDMO )" );
    thrower.ifParameterMissing( "CpcCallPrechargeDMO", cpcCallPrechargeDMO );

    dao.insert( cpcCallPrechargeDMO );

    // return the data with key
    return cpcCallPrechargeDMO;
  }

  /**
   * Locks and retrieves the CpcCallPrecharge object from the database.
   *
   * @param aCpcCallPrecharge CpcCallPrecharge object
   *
   * @return a populated CpcCallPrecharge object or null if not found.
   *
   * @throws EPPIXSeriousException
   */
  public CpcCallPrechargeDMO lock( CpcCallPrechargeDMO aCpcCallPrechargeDMO )
    throws EPPIXSeriousException, EPPIXObjectBusyException {
    logger.debug( "lock( aCpcCallPrechargeDMO )" );

    thrower.ifParameterMissing( "aCpcCallPrechargeDMO", aCpcCallPrechargeDMO );

    CpcCallPrechargeDMO lockedCpcCallPrechargeDMO = null;

    //
    // Lock the base table on its primary key.
    //
    lockedCpcCallPrechargeDMO = (CpcCallPrechargeDMO) dao.lock( "CpcCallPrecharge",
        "filterByPrimaryKey",
        new DAOArgs( 1 ).arg( aCpcCallPrechargeDMO.getCpcId(  ) ) );

    return lockedCpcCallPrechargeDMO;
  }

  /**
   * Modifies the CpcCallPrecharge object in the database.
   *
   * @param CpcCallPrechargeDMO CpcCallPrecharge object
   *
   * @throws EPPIXSeriousException
   * @throws EPPIXObjectExpiredException
   * @throws EPPIXObjectNotFoundException
   */
  public void modify( CpcCallPrechargeDMO cpcCallPrechargeDMO )
    throws EPPIXSeriousException, EPPIXObjectExpiredException,
      EPPIXObjectNotFoundException {
    logger.debug( "modify( aCpcCallPrechargeDMO )" );

    thrower.ifParameterMissing( "aCpcCallPrechargeDMO", cpcCallPrechargeDMO );

    thrower.ifParameterMissing( "CpcCallPrechargeDMO.cpcId",
      cpcCallPrechargeDMO.getCpcId(  ) );

    dao.update( cpcCallPrechargeDMO );
  }

  /**
  * Modifies the CpcCallPrecharge object using the specified filter in the database.
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

    dao.updateCustom( new CpcCallPrechargeDMO(  ),
      filterQueryArgs( filter, null ) );
  }

  /**
   * Deletes the CpcCallPrecharge object from the database.
   *
   * @param CpcCallPrechargeDMO CpcCallPrecharge object
   *
   * @throws EPPIXSeriousException
   * @throws EPPIXObjectNotFoundException
   * @throws EPPIXObjectExpiredException
   */
  public void delete( CpcCallPrechargeDMO cpcCallPrechargeDMO )
    throws EPPIXSeriousException, EPPIXObjectNotFoundException,
      EPPIXObjectExpiredException {
    logger.debug( "delete( CpcCallPrechargeDMO )" );

    thrower.ifParameterMissing( "CpcCallPrechargeDMO", cpcCallPrechargeDMO );

    thrower.ifParameterMissing( "CpcCallPrechargeDMO.cpcId",
      cpcCallPrechargeDMO.getCpcId(  ) );

    dao.delete( cpcCallPrechargeDMO );
  }

  /**
   * Deletes the CpcCallPrecharge object from the database.
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

    dao.delete( "CpcCallPrecharge", args.getFilterBy(  ), args );
  }

  /**
  * Return true if a CpcCallPrecharge object exists.
  *
  * @param CpcCallPrechargeDMO CpcCallPrechargeDMO
  *
  * @return true if the CpcCallPrecharge object exists.
  *
  * @throws EPPIXSeriousException
  */
  public boolean exists( CpcCallPrechargeDMO CpcCallPrechargeDMO )
    throws EPPIXSeriousException {
    logger.debug( "exists( CpcCallPrechargeDMO)" );

    return dao.exists( "CpcCallPrecharge", "filterByPrimaryKey",
      new DAOArgs( 1 ).arg( CpcCallPrechargeDMO.getCpcId(  ) ) );
  }

  /**
    * Return true if a CpcCallPrecharge object exists.
    *
    * @param filter
    *
    * @return true if the CpcCallPrecharge object exists.
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
   * @param locationDMO CpcCallPrecharge Data Model Object
   *
   * @return DTOList of CpcCallPrecharge Data Model Objects.
   *
   * @throws EPPIXSeriousException
   */
  public DTOList getList( 
    DTOListState        state,
    CpcCallPrechargeDMO cpcCallPrechargeDMO )
    throws EPPIXSeriousException {
    logger.debug( "getList( state, cpcCallPrechargeDMO )" );

    return dao.getListAbs( state, paramQueryArgs( cpcCallPrechargeDMO ) );
  }

  /**
   * Constructs parameterised query arguments.
   *
   * @param $(dataObjectNameLowerCamel} CpcCallPrechargeDMO object.
   */
  protected DAOParamQueryArgs paramQueryArgs( 
    CpcCallPrechargeDMO cpcCallPrechargeDMO ) {
    logger.debug( "paramQueryArgs( cpcCallPrechargeDMO)" );

    DAOParamQueryArgs queryArgs = new DAOParamQueryArgs( "CpcCallPrecharge",
        14 * 2 );

    if ( cpcCallPrechargeDMO != null ) {
      // primary key filters...
      Integer cpcId = cpcCallPrechargeDMO.getCpcId(  );

      if ( !DMO.isNull( cpcId ) ) {
        queryArgs.andFilterBy( "CpcId" )
                 .arg( cpcId );
      }

      // define more filters...
      String cpcMsisdn = cpcCallPrechargeDMO.getCpcMsisdn();

      if ( !DMO.isNull( cpcMsisdn ) ) {
        queryArgs.andFilterBy( "CpcMsisdnMatch" )
                 .arg( cpcMsisdn + dao.wildcardForAnySequence(  ) );
      }

      String cpcSimNo = cpcCallPrechargeDMO.getCpcSimNo(  );

      if ( !DMO.isNull( cpcSimNo ) ) {
        queryArgs.andFilterBy( "CpcSimNoMatch" )
                 .arg( cpcSimNo + dao.wildcardForAnySequence(  ) );
      }

      String cpcNetworkId = cpcCallPrechargeDMO.getCpcNetworkId(  );

      if ( !DMO.isNull( cpcNetworkId ) ) {
        queryArgs.andFilterBy( "CpcNetworkIdMatch" )
                 .arg( cpcNetworkId + dao.wildcardForAnySequence(  ) );
      }

      String cpcChargeCode = cpcCallPrechargeDMO.getCpcChargeCode(  );

      if ( !DMO.isNull( cpcChargeCode ) ) {
        queryArgs.andFilterBy( "CpcChargeCodeMatch" )
                 .arg( cpcChargeCode + dao.wildcardForAnySequence(  ) );
      }

      String cpcLastInvoice = cpcCallPrechargeDMO.getCpcLastInvoice(  );

      if ( !DMO.isNull( cpcLastInvoice ) ) {
        queryArgs.andFilterBy( "CpcLastInvoiceMatch" )
                 .arg( cpcLastInvoice + dao.wildcardForAnySequence(  ) );
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

    return dao.getListAbs( state, filterQueryArgs( filter, null ) );
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
        ? "CpcCallPrecharge" : dmlName, parts.size(  ) );

    Iterator it = parts.iterator();
    
    while(it.hasNext()){
//    for ( FilterPart part : parts ) {
    	FilterPart part = (FilterPart)it.next();
      switch ( part.getIndex(  ) ) {
        case CpcCallPrechargeDMO.cpcIdFilter:
          part.andFilterBy( queryArgs, "CpcId", dao.wildcardForAnySequence(  ) );

          break;

        case CpcCallPrechargeDMO.cpcSubscriberFilter:
          part.andFilterBy( queryArgs, "CpcSubscriber",
            dao.wildcardForAnySequence(  ) );

          break;

        case CpcCallPrechargeDMO.cpcMsisdnFilter:
          part.andFilterBy( queryArgs, "CpcMsisdnNo",
            dao.wildcardForAnySequence(  ) );

          break;

        case CpcCallPrechargeDMO.cpcSimNoFilter:
          part.andFilterBy( queryArgs, "CpcSimNo",
            dao.wildcardForAnySequence(  ) );

          break;

        case CpcCallPrechargeDMO.cpcNetworkIdFilter:
          part.andFilterBy( queryArgs, "CpcNetworkId",
            dao.wildcardForAnySequence(  ) );

          break;

        case CpcCallPrechargeDMO.cpcChargeCodeFilter:
          part.andFilterBy( queryArgs, "CpcChargeCode",
            dao.wildcardForAnySequence(  ) );

          break;

        case CpcCallPrechargeDMO.cpcPrechargeDateFilter:
          part.andFilterBy( queryArgs, "CpcPrechargeDate",
            dao.wildcardForAnySequence(  ) );

          break;

        case CpcCallPrechargeDMO.cpcAmountFilter:
          part.andFilterBy( queryArgs, "CpcAmount",
            dao.wildcardForAnySequence(  ) );

          break;

        case CpcCallPrechargeDMO.cpcRemainingFilter:
          part.andFilterBy( queryArgs, "CpcRemaining",
            dao.wildcardForAnySequence(  ) );

          break;

        case CpcCallPrechargeDMO.cpcCreatedDateFilter:
          part.andFilterBy( queryArgs, "CpcCreatedDate",
            dao.wildcardForAnySequence(  ) );

          break;

        case CpcCallPrechargeDMO.cpcLastBilldateFilter:
          part.andFilterBy( queryArgs, "CpcLastBilldate",
            dao.wildcardForAnySequence(  ) );

          break;

        case CpcCallPrechargeDMO.cpcLastInvoiceFilter:
          part.andFilterBy( queryArgs, "CpcLastInvoice",
            dao.wildcardForAnySequence(  ) );

          break;

        case CpcCallPrechargeDMO.cpcLastCreditFilter:
          part.andFilterBy( queryArgs, "CpcLastCredit",
            dao.wildcardForAnySequence(  ) );

          break;

      }
    }

    return queryArgs;
  }

  /**
  * Provides a DAOIterator to iterate over the list of CpcCallPrecharge records based
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
  * Provides a DAOIterator to iterate using a "FOR UPDATE", over the list of CpcCallPrecharge records based
  * on the passed in Filter.
  *
  * @param filter
  * @return
  * @throws EPPIXSeriousException
  */
  public DAOIterator iterateWithLock( 
    QueryFilter filter )
    throws EPPIXSeriousException {
    logger.debug( "iterateWithLock( filter )" );

    return dao.iterator(filterQueryArgs( filter, null ), true );
  }

  /**
   * Retrieves the CpcCallPrecharge Data Model Object from a possible list.
   *
   * @param filter
   * @return
   * @throws EPPIXSeriousException
   */
  public CpcCallPrechargeDMO get( QueryFilter filter )
    throws EPPIXSeriousException {
    logger.debug( "get( filter )" );

    DAOParamQueryArgs args = filterQueryArgs( filter, null );

    return (CpcCallPrechargeDMO) dao.get( args.getDMLName(  ),
      args.getFilterBy(  ), args );
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
