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
 * BillCccccyyyymmdd Business Object.
 *
 * @version $Revision: 1.2 $
 * @author $Author$
 * @since $jdk$
 */
public class BillCccccyyyymmddAbstractDACImpl
  extends DAC
  implements BillCccccyyyymmddAbstractDAC {
  //~ Static variables/initializers //////////////////////////////////////////

  /** Error handler/logger. */
  static DAOThrower thrower = DAOThrower.getDAOThrower( BillCccccyyyymmddAbstractDACImpl.class );

  //~ Instance variables /////////////////////////////////////////////////////

  /** DOCUMENT ME! */
  Logger logger = thrower.getLogger(  );

  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new BillCccccyyyymmddDACImpl object.
   *
   * @param dao Data Access Object.
   * @param defaultLanguageCode the working language of the user, dictates
   *        which language specific descriptions are retrieved.
   */
  public BillCccccyyyymmddAbstractDACImpl( 
    UserContext userContext,
    DAO         dao ) {
    super( userContext, dao, thrower );
  }

  public BillCccccyyyymmddAbstractDACImpl( DAO dao ) {
		    super( dao, thrower );
  }
  
  //~ Methods ////////////////////////////////////////////////////////////////

  /**
   * Retrieves a BillCccccyyyymmdd Data Model Object
   *
   * @return a populated BillCccccyyyymmdd Data Model Object or null if not found.
   *
   * @throws EPPIXSeriousException
   */
  public BillCccccyyyymmddDMO get( 
    BillCccccyyyymmddDMO billCccccyyyymmddDMO,
    String               tableName )
    throws EPPIXSeriousException {
    logger.debug( "get( BillCccccyyyymmddDMO )" );

    thrower.ifParameterMissing( "BillCccccyyyymmddDMO", billCccccyyyymmddDMO );

    return (BillCccccyyyymmddDMO) dao.get( billCccccyyyymmddDMO, tableName );
  }

  /**
   * Creates the BillCccccyyyymmdd object in the database.
   *
   * @param BillCccccyyyymmddDMO billCccccyyyymmddDMO
   * @param String tableName
   *
   * @throws EPPIXSeriousException
   */
  public BillCccccyyyymmddDMO create( 
    BillCccccyyyymmddDMO billCccccyyyymmddDMO,
    String               tableName )
    throws EPPIXSeriousException {
    logger.debug( "create( billCccccyyyymmddDMO )" );
    thrower.ifParameterMissing( "BillCccccyyyymmddDMO", billCccccyyyymmddDMO );

    dao.insert( billCccccyyyymmddDMO, tableName );

    // return the data with key
    return billCccccyyyymmddDMO;
  }

  /**
   * Locks and retrieves the BillCccccyyyymmdd object from the database.
   *
   * @param aBillCccccyyyymmdd BillCccccyyyymmdd object
   *
   * @return a populated BillCccccyyyymmdd object or null if not found.
   *
   * @throws EPPIXSeriousException
   */
  public BillCccccyyyymmddDMO lock( 
    BillCccccyyyymmddDMO aBillCccccyyyymmddDMO,
    String               tableName )
    throws EPPIXSeriousException, EPPIXObjectBusyException {
    logger.debug( "lock( aBillCccccyyyymmddDMO )" );

    thrower.ifParameterMissing( "aBillCccccyyyymmddDMO", aBillCccccyyyymmddDMO );

    BillCccccyyyymmddDMO lockedBillCccccyyyymmddDMO = null;

    //
    // Lock the base table on its primary key.
    //
    lockedBillCccccyyyymmddDMO = (BillCccccyyyymmddDMO) dao.lock( "BillCccccyyyymmdd",
        "filterByPrimaryKey",
        new DAOArgs( 1 ).arg( aBillCccccyyyymmddDMO.getBillId(  ) ), tableName );

    return lockedBillCccccyyyymmddDMO;
  }

  /**
   * Modifies the BillCccccyyyymmdd object in the database.
   *
   * @param BillCccccyyyymmddDMO BillCccccyyyymmdd object
   *
   * @throws EPPIXSeriousException
   * @throws EPPIXObjectExpiredException
   * @throws EPPIXObjectNotFoundException
   */
  public void modify( 
    BillCccccyyyymmddDMO billCccccyyyymmddDMO,
    String               tableName )
    throws EPPIXSeriousException, EPPIXObjectExpiredException,
      EPPIXObjectNotFoundException {
    logger.debug( "modify( aBillCccccyyyymmddDMO )" );

    thrower.ifParameterMissing( "aBillCccccyyyymmddDMO", billCccccyyyymmddDMO );

    thrower.ifParameterMissing( "BillCccccyyyymmddDMO.billId",
      billCccccyyyymmddDMO.getBillId(  ) );

    dao.update( billCccccyyyymmddDMO, tableName );
  }

  /**
  * Modifies the BillCccccyyyymmdd object using the specified filter in the database.
  *
  * @param filter object
  *
  * @throws EPPIXSeriousException
  * @throws EPPIXObjectExpiredException
  * @throws EPPIXObjectNotFoundException
  */
  public void modify( 
    QueryFilter filter,
    String      tableName )
    throws EPPIXSeriousException, EPPIXObjectExpiredException,
      EPPIXObjectNotFoundException {
    logger.debug( "modify( filter )" );

    thrower.ifParameterMissing( "filter", filter );

    dao.updateCustom( new BillCccccyyyymmddDMO(  ),
      filterQueryArgs( filter, null ), tableName );
  }

  /**
   * Deletes the BillCccccyyyymmdd object from the database.
   *
   * @param BillCccccyyyymmddDMO BillCccccyyyymmdd object
   *
   * @throws EPPIXSeriousException
   * @throws EPPIXObjectNotFoundException
   * @throws EPPIXObjectExpiredException
   */
  public void delete( 
    BillCccccyyyymmddDMO billCccccyyyymmddDMO,
    String               tableName )
    throws EPPIXSeriousException, EPPIXObjectNotFoundException,
      EPPIXObjectExpiredException {
    logger.debug( "delete( BillCccccyyyymmddDMO )" );

    thrower.ifParameterMissing( "BillCccccyyyymmddDMO", billCccccyyyymmddDMO );

    thrower.ifParameterMissing( "BillCccccyyyymmddDMO.billId",
      billCccccyyyymmddDMO.getBillId(  ) );

    dao.delete( billCccccyyyymmddDMO );
  }

  /**
   * Deletes the BillCccccyyyymmdd object from the database.
   *
   * @param QueryFilterfilter object
   *
   * @throws EPPIXSeriousException
   * @throws EPPIXObjectNotFoundException
   * @throws EPPIXObjectExpiredException
   */
  public void delete( 
    QueryFilter filter,
    String      tableName )
    throws EPPIXSeriousException, EPPIXObjectNotFoundException,
      EPPIXObjectExpiredException {
    logger.debug( "delete( filter )" );

    thrower.ifParameterMissing( "filter", filter );

    DAOParamQueryArgs args = filterQueryArgs( filter, null );

    dao.delete( "BillCccccyyyymmdd", args.getFilterBy(  ), args );
  }

  /**
  * Return true if a BillCccccyyyymmdd object exists.
  *
  * @param BillCccccyyyymmddDMO BillCccccyyyymmddDMO
  * @param String tableName
  *
  * @return true if the BillCccccyyyymmdd object exists.
  *
  * @throws EPPIXSeriousException
  */
  public boolean exists( 
    BillCccccyyyymmddDMO BillCccccyyyymmddDMO,
    String               tableName )
    throws EPPIXSeriousException {
    logger.debug( "exists( BillCccccyyyymmddDMO)" );

    return dao.exists( "BillCccccyyyymmdd", "filterByPrimaryKey",
      new DAOArgs( 1 ).arg( BillCccccyyyymmddDMO.getBillId(  ) ), tableName );
  }

  /**
    * Return true if a BillCccccyyyymmdd object exists.
    *
    * @param filter
    *
    * @return true if the BillCccccyyyymmdd object exists.
    *
    * @throws EPPIXSeriousException
    */
  public boolean exists( 
    QueryFilter filter,
    String      tableName )
    throws EPPIXSeriousException {
    logger.debug( "exists( filter )" );

    return dao.exists( filterQueryArgs( filter, null ), tableName );
  }

  /**
   * Return a list of location objects matching the passed in values. A
   * partial match is performed on the description argument. If no language
   * Code is passed inside the locationDMO then the language passed in the
   * EppixLocale object is used.
   *
   * @param state previous state of the list.
   * @param locationDMO BillCccccyyyymmdd Data Model Object
   *
   * @return DTOList of BillCccccyyyymmdd Data Model Objects.
   *
   * @throws EPPIXSeriousException
   */
  public DTOList getList( 
    DTOListState         state,
    BillCccccyyyymmddDMO billCccccyyyymmddDMO,
    String               tableName )
    throws EPPIXSeriousException {
    logger.debug( "getList( state, billCccccyyyymmddDMO )" );

    return dao.getListAbs( state, paramQueryArgs( billCccccyyyymmddDMO ),
      tableName );
  }

  /**
   * Constructs parameterised query arguments.
   *
   * @param $(dataObjectNameLowerCamel} BillCccccyyyymmddDMO object.
   */
  protected DAOParamQueryArgs paramQueryArgs( 
    BillCccccyyyymmddDMO billCccccyyyymmddDMO ) {
    logger.debug( "paramQueryArgs( billCccccyyyymmddDMO)" );

    DAOParamQueryArgs queryArgs = new DAOParamQueryArgs( "BillCccccyyyymmdd",
        25 * 2 );

    if ( billCccccyyyymmddDMO != null ) {
      // primary key filters...
      Integer billId = billCccccyyyymmddDMO.getBillId(  );

      if ( !DMO.isNull( billId ) ) {
        queryArgs.andFilterBy( "BillId" )
                 .arg( billId );
      }

      // define more filters...
      String handset = billCccccyyyymmddDMO.getHandset(  );

      if ( !DMO.isNull( handset ) ) {
        queryArgs.andFilterBy( "HandsetMatch" )
                 .arg( handset + dao.wildcardForAnySequence(  ) );
      }

      String chaserv = billCccccyyyymmddDMO.getChaserv(  );

      if ( !DMO.isNull( chaserv ) ) {
        queryArgs.andFilterBy( "ChaservMatch" )
                 .arg( chaserv + dao.wildcardForAnySequence(  ) );
      }

      String billind = billCccccyyyymmddDMO.getBillind(  );

      if ( !DMO.isNull( billind ) ) {
        queryArgs.andFilterBy( "BillindMatch" )
                 .arg( billind + dao.wildcardForAnySequence(  ) );
      }

      String sparech = billCccccyyyymmddDMO.getSparech(  );

      if ( !DMO.isNull( sparech ) ) {
        queryArgs.andFilterBy( "SparechMatch" )
                 .arg( sparech + dao.wildcardForAnySequence(  ) );
      }

      String invoiceNo = billCccccyyyymmddDMO.getInvoiceNo(  );

      if ( !DMO.isNull( invoiceNo ) ) {
        queryArgs.andFilterBy( "InvoiceNoMatch" )
                 .arg( invoiceNo + dao.wildcardForAnySequence(  ) );
      }

      String cycleNo = billCccccyyyymmddDMO.getCycleNo(  );

      if ( !DMO.isNull( cycleNo ) ) {
        queryArgs.andFilterBy( "CycleNoMatch" )
                 .arg( cycleNo + dao.wildcardForAnySequence(  ) );
      }

      String vatcode = billCccccyyyymmddDMO.getVatcode(  );

      if ( !DMO.isNull( vatcode ) ) {
        queryArgs.andFilterBy( "VatcodeMatch" )
                 .arg( vatcode + dao.wildcardForAnySequence(  ) );
      }

      String exchOperator = billCccccyyyymmddDMO.getExchOperator(  );

      if ( !DMO.isNull( exchOperator ) ) {
        queryArgs.andFilterBy( "ExchOperatorMatch" )
                 .arg( exchOperator + dao.wildcardForAnySequence(  ) );
      }

      String technology = billCccccyyyymmddDMO.getTechnology(  );

      if ( !DMO.isNull( technology ) ) {
        queryArgs.andFilterBy( "TechnologyMatch" )
                 .arg( technology + dao.wildcardForAnySequence(  ) );
      }

      String packge = billCccccyyyymmddDMO.getPackge(  );

      if ( !DMO.isNull( packge ) ) {
        queryArgs.andFilterBy( "PackgeMatch" )
                 .arg( packge + dao.wildcardForAnySequence(  ) );
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
   * @param tableName DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   *
   * @throws EPPIXSeriousException DOCUMENT ME!
   */
  public DTOList getList( 
    DTOListState state,
    QueryFilter  filter,
    String       tableName )
    throws EPPIXSeriousException {
    logger.debug( "getList( state, filter )" );

    return dao.getListAbs( state, filterQueryArgs( filter, null ), tableName );
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
        ? "BillCccccyyyymmdd" : dmlName, parts.size(  ) );

    Iterator it = parts.iterator();
//    for ( FilterPart part : parts ) {
    
    while(it.hasNext()){
    	FilterPart part = (FilterPart)it.next();
      switch ( part.getIndex(  ) ) {
        case BillCccccyyyymmddDMO.billIdFilter:
          part.andFilterBy( queryArgs, "BillId",
            dao.wildcardForAnySequence(  ) );

          break;

        case BillCccccyyyymmddDMO.subscriberIdFilter:
          part.andFilterBy( queryArgs, "SubscriberId",
            dao.wildcardForAnySequence(  ) );

          break;

        case BillCccccyyyymmddDMO.handsetFilter:
          part.andFilterBy( queryArgs, "Handset",
            dao.wildcardForAnySequence(  ) );

          break;

        case BillCccccyyyymmddDMO.chaservFilter:
          part.andFilterBy( queryArgs, "Chaserv",
            dao.wildcardForAnySequence(  ) );

          break;

        case BillCccccyyyymmddDMO.billindFilter:
          part.andFilterBy( queryArgs, "Billind",
            dao.wildcardForAnySequence(  ) );

          break;

        case BillCccccyyyymmddDMO.billdatFilter:
          part.andFilterBy( queryArgs, "Billdat",
            dao.wildcardForAnySequence(  ) );

          break;

        case BillCccccyyyymmddDMO.costFilter:
          part.andFilterBy( queryArgs, "Cost", dao.wildcardForAnySequence(  ) );

          break;

        case BillCccccyyyymmddDMO.chargeFilter:
          part.andFilterBy( queryArgs, "Charge",
            dao.wildcardForAnySequence(  ) );

          break;

        case BillCccccyyyymmddDMO.sparechFilter:
          part.andFilterBy( queryArgs, "Sparech",
            dao.wildcardForAnySequence(  ) );

          break;

        case BillCccccyyyymmddDMO.invoiceNoFilter:
          part.andFilterBy( queryArgs, "InvoiceNo",
            dao.wildcardForAnySequence(  ) );

          break;

        case BillCccccyyyymmddDMO.twinbillNoFilter:
          part.andFilterBy( queryArgs, "TwinbillNo",
            dao.wildcardForAnySequence(  ) );

          break;

        case BillCccccyyyymmddDMO.vatamtFilter:
          part.andFilterBy( queryArgs, "Vatamt",
            dao.wildcardForAnySequence(  ) );

          break;

        case BillCccccyyyymmddDMO.vatrateFilter:
          part.andFilterBy( queryArgs, "Vatrate",
            dao.wildcardForAnySequence(  ) );

          break;

        case BillCccccyyyymmddDMO.cycleNoFilter:
          part.andFilterBy( queryArgs, "CycleNo",
            dao.wildcardForAnySequence(  ) );

          break;

        case BillCccccyyyymmddDMO.vatcodeFilter:
          part.andFilterBy( queryArgs, "Vatcode",
            dao.wildcardForAnySequence(  ) );

          break;

        case BillCccccyyyymmddDMO.startPeriodFilter:
          part.andFilterBy( queryArgs, "StartPeriod",
            dao.wildcardForAnySequence(  ) );

          break;

        case BillCccccyyyymmddDMO.endPeriodFilter:
          part.andFilterBy( queryArgs, "EndPeriod",
            dao.wildcardForAnySequence(  ) );

          break;

        case BillCccccyyyymmddDMO.batchRunNumFilter:
          part.andFilterBy( queryArgs, "BatchRunNum",
            dao.wildcardForAnySequence(  ) );

          break;

        case BillCccccyyyymmddDMO.timestampFilter:
          part.andFilterBy( queryArgs, "Timestamp",
            dao.wildcardForAnySequence(  ) );

          break;

        case BillCccccyyyymmddDMO.currencyChargeFilter:
          part.andFilterBy( queryArgs, "CurrencyCharge",
            dao.wildcardForAnySequence(  ) );

          break;

        case BillCccccyyyymmddDMO.exchangeRateFilter:
          part.andFilterBy( queryArgs, "ExchangeRate",
            dao.wildcardForAnySequence(  ) );

          break;

        case BillCccccyyyymmddDMO.exchOperatorFilter:
          part.andFilterBy( queryArgs, "ExchOperator",
            dao.wildcardForAnySequence(  ) );

          break;

        case BillCccccyyyymmddDMO.chargeClassIdFilter:
          part.andFilterBy( queryArgs, "ChargeClassId",
            dao.wildcardForAnySequence(  ) );

          break;

        case BillCccccyyyymmddDMO.technologyFilter:
          part.andFilterBy( queryArgs, "Technology",
            dao.wildcardForAnySequence(  ) );

          break;

        case BillCccccyyyymmddDMO.packgeFilter:
          part.andFilterBy( queryArgs, "Packge",
            dao.wildcardForAnySequence(  ) );

          break;
      }
    }

    return queryArgs;
  }

  /**
  * Provides a DAOIterator to iterate over the list of BillCccccyyyymmdd records based
  * on the passed in Filter.
  *
  * @param filter
  * @return
  * @throws EPPIXSeriousException
  */
  public DAOIterator iterate( 
    QueryFilter filter,
    String      tableName )
    throws EPPIXSeriousException {
    logger.debug( "iterate( filter )" );

    return dao.iterator(filterQueryArgs( filter, null ), tableName );
  }

  /**
  * Provides a DAOIterator to iterate using a "FOR UPDATE", over the list of BillCccccyyyymmdd records based
  * on the passed in Filter.
  *
  * @param filter
  * @return
  * @throws EPPIXSeriousException
  */
  public DAOIterator iterateWithLock( 
    QueryFilter filter,
    String      tableName )
    throws EPPIXSeriousException {
    logger.debug( "iterateWithLock( filter )" );

    return dao.iterator( filterQueryArgs( filter, null ), tableName, true );
  }

  /**
   * Retrieves the BillCccccyyyymmdd Data Model Object from a possible list.
   *
   * @param filter
   * @return
   * @throws EPPIXSeriousException
   */
  public BillCccccyyyymmddDMO get( 
    QueryFilter filter,
    String      tableName )
    throws EPPIXSeriousException {
    logger.debug( "get( filter )" );

    DAOParamQueryArgs args = filterQueryArgs( filter, null );

    return (BillCccccyyyymmddDMO) dao.get( args.getDMLName(  ),
      args.getFilterBy(  ), args, tableName );
  }

  /**
   * DOCUMENT ME!
   *
   * @param filter DOCUMENT ME!
   * @param tableName DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   *
   * @throws EPPIXSeriousException DOCUMENT ME!
   */
  public Object max( 
    QueryFilter filter,
    String      tableName )
    throws EPPIXSeriousException {
    logger.debug( "max( filter )" );

    DAOParamQueryArgs args = filterQueryArgs( filter, null );

    return dao.max( args.getDMLName(  ), args.getFilterBy(  ), args,
      args.getMaxField(  ), tableName );
  }

  /**
   * DOCUMENT ME!
   *
   * @param filter DOCUMENT ME!
   * @param tableName DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   *
   * @throws EPPIXSeriousException DOCUMENT ME!
   */
  public Object min( 
    QueryFilter filter,
    String      tableName )
    throws EPPIXSeriousException {
    logger.debug( "min( filter )" );

    DAOParamQueryArgs args = filterQueryArgs( filter, null );

    return dao.min( args.getDMLName(  ), args.getFilterBy(  ), args,
      args.getMaxField(  ), tableName );
  }

  /**
   * Counts (COUNT(*)) the number of rows for the specified filter.
   *
   * @param filter
   * @return the count of rows.
   *
   * @throws EPPIXSeriousException
   */
  public int count( 
    QueryFilter filter,
    String      tableName )
    throws EPPIXSeriousException {
    logger.debug( "count( filter )" );

    DAOParamQueryArgs args = filterQueryArgs( filter, null );

    return dao.count( args.getDMLName(  ), args.getFilterBy(  ), args,
      tableName );
  }
}
