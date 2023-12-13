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

import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;

import com.eppixcomm.eppix.common.data.DAC;
import com.eppixcomm.eppix.common.data.DAO;
import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DAOIterator;
import com.eppixcomm.eppix.common.data.DAOParamQueryArgs;
import com.eppixcomm.eppix.common.data.DAOThrower;
import com.eppixcomm.eppix.common.data.DMO;
import com.eppixcomm.eppix.common.util.FilterPart;
import com.eppixcomm.eppix.common.util.QueryFilter;
import com.eppixcomm.eppix.common.data.DTOList;
import com.eppixcomm.eppix.common.data.DTOListState;
import com.eppixcomm.eppix.base.error.EPPIXObjectBusyException;
import com.eppixcomm.eppix.base.error.EPPIXObjectExpiredException;
import com.eppixcomm.eppix.base.error.EPPIXObjectNotFoundException;
import com.eppixcomm.eppix.base.error.EPPIXSeriousException;

/**
 * This is the standard implementation of the Data Access Controller for the
 * VamActiveMsisdn Business Object.
 *
 * @version $Revision: 1.2 $
 * @author $Author$
 * @since $jdk$
 */
public class VamActiveMsisdnAbstractDACImpl
  extends DAC
  implements VamActiveMsisdnAbstractDAC {
  //~ Static variables/initializers //////////////////////////////////////////

  /** Error handler/logger. */
  static DAOThrower thrower = DAOThrower.getDAOThrower( VamActiveMsisdnAbstractDACImpl.class );

  //~ Instance variables /////////////////////////////////////////////////////

  /** DOCUMENT ME! */
  Logger logger = thrower.getLogger(  );

  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new VamActiveMsisdnDACImpl object.
   *
   * @param dao Data Access Object.
   * @param defaultLanguageCode the working language of the user, dictates
   *        which language specific descriptions are retrieved.
   */
  public VamActiveMsisdnAbstractDACImpl( 
    DAO         dao ) {
    super( dao, thrower );
  }

  //~ Methods ////////////////////////////////////////////////////////////////

  /**
   * Retrieves a VamActiveMsisdn Data Model Object
   *
   * @return a populated VamActiveMsisdn Data Model Object or null if not found.
   *
   * @throws EPPIXSeriousException
   */
  public VamActiveMsisdnDMO get( VamActiveMsisdnDMO vamActiveMsisdnDMO )
    throws EPPIXSeriousException {
    logger.debug( "get( VamActiveMsisdnDMO )" );

    thrower.ifParameterMissing( "VamActiveMsisdnDMO", vamActiveMsisdnDMO );

    return (VamActiveMsisdnDMO) dao.get( vamActiveMsisdnDMO );
  }

  /**
   * Creates the VamActiveMsisdn object in the database.
   *
   * @param VamActiveMsisdnDMO vamActiveMsisdnDMO
   *
   * @throws EPPIXSeriousException
   */
  public void create( VamActiveMsisdnDMO vamActiveMsisdnDMO )
    throws EPPIXSeriousException {
    logger.debug( "create( vamActiveMsisdnDMO )" );
    thrower.ifParameterMissing( "VamActiveMsisdnDMO", vamActiveMsisdnDMO );

    dao.insert( vamActiveMsisdnDMO );
  }

  /**
   * Locks and retrieves the VamActiveMsisdn object from the database.
   *
   * @param aVamActiveMsisdn VamActiveMsisdn object
   *
   * @return a populated VamActiveMsisdn object or null if not found.
   *
   * @throws EPPIXSeriousException
   */
  public VamActiveMsisdnDMO lock( VamActiveMsisdnDMO aVamActiveMsisdnDMO )
    throws EPPIXSeriousException, EPPIXObjectBusyException {
    logger.debug( "lock( aVamActiveMsisdnDMO )" );

    thrower.ifParameterMissing( "aVamActiveMsisdnDMO", aVamActiveMsisdnDMO );

    VamActiveMsisdnDMO lockedVamActiveMsisdnDMO = null;

    //
    // Lock the base table on its primary key.
    //
    lockedVamActiveMsisdnDMO = (VamActiveMsisdnDMO) dao.lock( "VamActiveMsisdn",
        "filterByPrimaryKey",
        new DAOArgs( 1 ).arg( aVamActiveMsisdnDMO.getVamMsisdnNo(  ) ) );

    return lockedVamActiveMsisdnDMO;
  }

  /**
   * Modifies the VamActiveMsisdn object in the database.
   *
   * @param VamActiveMsisdnDMO VamActiveMsisdn object
   *
   * @throws EPPIXSeriousException
   * @throws EPPIXObjectExpiredException
   * @throws EPPIXObjectNotFoundException
   */
  public void modify( VamActiveMsisdnDMO vamActiveMsisdnDMO )
    throws EPPIXSeriousException, EPPIXObjectExpiredException,
      EPPIXObjectNotFoundException {
    logger.debug( "modify( aVamActiveMsisdnDMO )" );

    thrower.ifParameterMissing( "aVamActiveMsisdnDMO", vamActiveMsisdnDMO );

    thrower.ifParameterMissing( "VamActiveMsisdnDMO.vamMsisdnNo",
      vamActiveMsisdnDMO.getVamMsisdnNo());

    dao.update( vamActiveMsisdnDMO );
  }

  /**
  * Modifies the VamActiveMsisdn object using the specified filter in the database.
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

    dao.updateCustom( new VamActiveMsisdnDMO(),filterQueryArgs( filter, null ));
  }

  /**
   * Deletes the VamActiveMsisdn object from the database.
   *
   * @param VamActiveMsisdnDMO VamActiveMsisdn object
   *
   * @throws EPPIXSeriousException
   * @throws EPPIXObjectNotFoundException
   * @throws EPPIXObjectExpiredException
   */
  public void delete( VamActiveMsisdnDMO vamActiveMsisdnDMO )
    throws EPPIXSeriousException, EPPIXObjectNotFoundException,
      EPPIXObjectExpiredException {
    logger.debug( "delete( VamActiveMsisdnDMO )" );

    thrower.ifParameterMissing( "VamActiveMsisdnDMO", vamActiveMsisdnDMO );

    thrower.ifParameterMissing( "VamActiveMsisdnDMO.vamMsisdnNo",
      vamActiveMsisdnDMO.getVamMsisdnNo(  ) );

    dao.delete( vamActiveMsisdnDMO );
  }

  /**
   * Deletes the VamActiveMsisdn object from the database.
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

    dao.delete( "VamActiveMsisdn", args.getFilterBy(  ), args );
  }

  /**
  * Return true if a VamActiveMsisdn object exists.
  *
  * @param VamActiveMsisdnDMO VamActiveMsisdnDMO
  *
  * @return true if the VamActiveMsisdn object exists.
  *
  * @throws EPPIXSeriousException
  */
  public boolean exists( VamActiveMsisdnDMO VamActiveMsisdnDMO )
    throws EPPIXSeriousException {
    logger.debug( "exists( VamActiveMsisdnDMO)" );

    return dao.exists( "VamActiveMsisdn", "filterByPrimaryKey",
      new DAOArgs( 1 ).arg( VamActiveMsisdnDMO.getVamMsisdnNo(  ) ) );
  }

  /**
    * Return true if a VamActiveMsisdn object exists.
    *
    * @param filter
    *
    * @return true if the VamActiveMsisdn object exists.
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
   * @param locationDMO VamActiveMsisdn Data Model Object
   *
   * @return DTOList of VamActiveMsisdn Data Model Objects.
   *
   * @throws EPPIXSeriousException
   */
  public DTOList getList( 
    DTOListState       state,
    VamActiveMsisdnDMO vamActiveMsisdnDMO )
    throws EPPIXSeriousException {
    logger.debug( "getList( state, vamActiveMsisdnDMO )" );

    return new DTOList(dao.getList( paramQueryArgs( vamActiveMsisdnDMO )));
  }

  /**
   * Constructs parameterised query arguments.
   *
   * @param $(dataObjectNameLowerCamel} VamActiveMsisdnDMO object.
   */
  protected DAOParamQueryArgs paramQueryArgs( 
    VamActiveMsisdnDMO vamActiveMsisdnDMO ) {
    logger.debug( "paramQueryArgs( vamActiveMsisdnDMO)" );

    DAOParamQueryArgs queryArgs = new DAOParamQueryArgs( "VamActiveMsisdn",
        24 * 2 );

    if ( vamActiveMsisdnDMO != null ) {
      // primary key filters...
      String vamMsisdnNo = vamActiveMsisdnDMO.getVamMsisdnNo(  );

      if ( !DMO.isNull( vamMsisdnNo ) ) {
        queryArgs.andFilterBy( "VamMsisdnNoMatch" )
                 .arg( vamMsisdnNo + dao.wildcardForAnySequence(  ) );
      }

      // define more filters...
      String vamSimNo = vamActiveMsisdnDMO.getVamSimNo(  );

      if ( !DMO.isNull( vamSimNo ) ) {
        queryArgs.andFilterBy( "VamSimNoMatch" )
                 .arg( vamSimNo + dao.wildcardForAnySequence(  ) );
      }

      String vamStatCode = vamActiveMsisdnDMO.getVamStatCode(  );

      if ( !DMO.isNull( vamStatCode ) ) {
        queryArgs.andFilterBy( "VamStatCodeMatch" )
                 .arg( vamStatCode + dao.wildcardForAnySequence(  ) );
      }

      String vamInternTariff = vamActiveMsisdnDMO.getVamInternTariff(  );

      if ( !DMO.isNull( vamInternTariff ) ) {
        queryArgs.andFilterBy( "VamInternTariffMatch" )
                 .arg( vamInternTariff + dao.wildcardForAnySequence(  ) );
      }

      String vamDirEntry = vamActiveMsisdnDMO.getVamDirEntry(  );

      if ( !DMO.isNull( vamDirEntry ) ) {
        queryArgs.andFilterBy( "VamDirEntryMatch" )
                 .arg( vamDirEntry + dao.wildcardForAnySequence(  ) );
      }

      String vamItemised = vamActiveMsisdnDMO.getVamItemised(  );

      if ( !DMO.isNull( vamItemised ) ) {
        queryArgs.andFilterBy( "VamItemisedMatch" )
                 .arg( vamItemised + dao.wildcardForAnySequence(  ) );
      }

      String vamDepartment = vamActiveMsisdnDMO.getVamDepartment(  );

      if ( !DMO.isNull( vamDepartment ) ) {
        queryArgs.andFilterBy( "VamDepartmentMatch" )
                 .arg( vamDepartment + dao.wildcardForAnySequence(  ) );
      }

      String vamSalesman = vamActiveMsisdnDMO.getVamSalesman(  );

      if ( !DMO.isNull( vamSalesman ) ) {
        queryArgs.andFilterBy( "VamSalesmanMatch" )
                 .arg( vamSalesman + dao.wildcardForAnySequence(  ) );
      }

      String vamDealerId = vamActiveMsisdnDMO.getVamDealerId(  );

      if ( !DMO.isNull( vamDealerId ) ) {
        queryArgs.andFilterBy( "VamDealerIdMatch" )
                 .arg( vamDealerId + dao.wildcardForAnySequence(  ) );
      }

      String vamSubsSuffix = vamActiveMsisdnDMO.getVamSubsSuffix(  );

      if ( !DMO.isNull( vamSubsSuffix ) ) {
        queryArgs.andFilterBy( "VamSubsSuffixMatch" )
                 .arg( vamSubsSuffix + dao.wildcardForAnySequence(  ) );
      }

      String vamMessComment = vamActiveMsisdnDMO.getVamMessComment(  );

      if ( !DMO.isNull( vamMessComment ) ) {
        queryArgs.andFilterBy( "VamMessCommentMatch" )
                 .arg( vamMessComment + dao.wildcardForAnySequence(  ) );
      }

      String vamAirtimeNet = vamActiveMsisdnDMO.getVamAirtimeNet(  );

      if ( !DMO.isNull( vamAirtimeNet ) ) {
        queryArgs.andFilterBy( "VamAirtimeNetMatch" )
                 .arg( vamAirtimeNet + dao.wildcardForAnySequence(  ) );
      }

      String vamPrFlag = vamActiveMsisdnDMO.getVamPrFlag(  );

      if ( !DMO.isNull( vamPrFlag ) ) {
        queryArgs.andFilterBy( "VamPrFlagMatch" )
                 .arg( vamPrFlag + dao.wildcardForAnySequence(  ) );
      }

      String vamHierarchy = vamActiveMsisdnDMO.getVamHierarchy(  );

      if ( !DMO.isNull( vamHierarchy ) ) {
        queryArgs.andFilterBy( "VamHierarchyMatch" )
                 .arg( vamHierarchy + dao.wildcardForAnySequence(  ) );
      }

      String vamMsisdnKnown = vamActiveMsisdnDMO.getVamMsisdnKnown(  );

      if ( !DMO.isNull( vamMsisdnKnown ) ) {
        queryArgs.andFilterBy( "VamMsisdnKnownMatch" )
                 .arg( vamMsisdnKnown + dao.wildcardForAnySequence(  ) );
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

    return new DTOList(dao.getList(filterQueryArgs( filter, null )));
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
        ? "VamActiveMsisdn" : dmlName, parts.size(  ) );

    for ( Iterator i = parts.iterator(); i.hasNext(); ) {
      FilterPart part = (FilterPart) i.next();

      switch ( part.getIndex(  ) ) {
        case VamActiveMsisdnDMO.vamSubscriberIdFilter:
          part.andFilterBy( queryArgs, "VamSubscriberId" );

          break;

        case VamActiveMsisdnDMO.vamSimNoFilter:
          part.andFilterBy( queryArgs, "VamSimNo",
            dao.wildcardForAnySequence(  ) );

          break;

        case VamActiveMsisdnDMO.vamMsisdnNoFilter:
          part.andFilterBy( queryArgs, "VamMsisdnNo",
            dao.wildcardForAnySequence(  ) );

          break;

        case VamActiveMsisdnDMO.vamTwinbillNoFilter:
          part.andFilterBy( queryArgs, "VamTwinbillNo" );

          break;

        case VamActiveMsisdnDMO.vamStatCodeFilter:
          part.andFilterBy( queryArgs, "VamStatCode",
            dao.wildcardForAnySequence(  ) );

          break;

        case VamActiveMsisdnDMO.vamConnectDateFilter:
          part.andFilterBy( queryArgs, "VamConnectDate" );

          break;

        case VamActiveMsisdnDMO.vamDconnectDateFilter:
          part.andFilterBy( queryArgs, "VamDconnectDate" );

          break;

        case VamActiveMsisdnDMO.vamInternTariffFilter:
          part.andFilterBy( queryArgs, "VamInternTariff",
            dao.wildcardForAnySequence(  ) );

          break;

        case VamActiveMsisdnDMO.vamContrTerminatFilter:
          part.andFilterBy( queryArgs, "VamContrTerminat" );

          break;

        case VamActiveMsisdnDMO.vamContrPeriodFilter:
          part.andFilterBy( queryArgs, "VamContrPeriod" );

          break;

        case VamActiveMsisdnDMO.vamTerminatNotifFilter:
          part.andFilterBy( queryArgs, "VamTerminatNotif" );

          break;

        case VamActiveMsisdnDMO.vamDirEntryFilter:
          part.andFilterBy( queryArgs, "VamDirEntry",
            dao.wildcardForAnySequence(  ) );

          break;

        case VamActiveMsisdnDMO.vamItemisedFilter:
          part.andFilterBy( queryArgs, "VamItemised",
            dao.wildcardForAnySequence(  ) );

          break;

        case VamActiveMsisdnDMO.vamDepartmentFilter:
          part.andFilterBy( queryArgs, "VamDepartment",
            dao.wildcardForAnySequence(  ) );

          break;

        case VamActiveMsisdnDMO.vamSalesmanFilter:
          part.andFilterBy( queryArgs, "VamSalesman",
            dao.wildcardForAnySequence(  ) );

          break;

        case VamActiveMsisdnDMO.vamDealerIdFilter:
          part.andFilterBy( queryArgs, "VamDealerId",
            dao.wildcardForAnySequence(  ) );

          break;

        case VamActiveMsisdnDMO.vamAbarDateFilter:
          part.andFilterBy( queryArgs, "VamAbarDate" );

          break;

        case VamActiveMsisdnDMO.vamSubsSuffixFilter:
          part.andFilterBy( queryArgs, "VamSubsSuffix",
            dao.wildcardForAnySequence(  ) );

          break;

        case VamActiveMsisdnDMO.vamMessCommentFilter:
          part.andFilterBy( queryArgs, "VamMessComment",
            dao.wildcardForAnySequence(  ) );

          break;

        case VamActiveMsisdnDMO.vamAirtimeNetFilter:
          part.andFilterBy( queryArgs, "VamAirtimeNet",
            dao.wildcardForAnySequence(  ) );

          break;

        case VamActiveMsisdnDMO.vamPrFlagFilter:
          part.andFilterBy( queryArgs, "VamPrFlag",
            dao.wildcardForAnySequence(  ) );

          break;

        case VamActiveMsisdnDMO.vamHierarchyFilter:
          part.andFilterBy( queryArgs, "VamHierarchy",
            dao.wildcardForAnySequence(  ) );

          break;

        case VamActiveMsisdnDMO.vamMsisdnKnownFilter:
          part.andFilterBy( queryArgs, "VamMsisdnKnown",
            dao.wildcardForAnySequence(  ) );

          break;

        case VamActiveMsisdnDMO.vamTariffChgFilter:
          part.andFilterBy( queryArgs, "VamTariffChg" );

          break;
          
        case VamActiveMsisdnDMO.vamOrigProvIdFilter:
        	part.andFilterBy( queryArgs, "VamOrigProvId",
        	dao.wildcardForAnySequence(  ) );
        	break;
        	
        case VamActiveMsisdnDMO.vamImpProvIdFilter:
        	part.andFilterBy( queryArgs, "VamImpProvId",
        	dao.wildcardForAnySequence(  ) );
        	break;
        	
        case VamActiveMsisdnDMO.vamOrigServProvFilter:
        	part.andFilterBy( queryArgs, "VamOrigServProv",
        	dao.wildcardForAnySequence(  ) );
        	break;
        	
        case VamActiveMsisdnDMO.vamImpServProvFilter:
        	part.andFilterBy( queryArgs, "VamImpServProv",
        	dao.wildcardForAnySequence(  ) );
        	break;
        	
        case VamActiveMsisdnDMO.vamMsisdnTypeFilter:
        	part.andFilterBy( queryArgs, "VamMsisdnType",
        	dao.wildcardForAnySequence(  ) );
        	break;
        	
        case VamActiveMsisdnDMO.vamDummyFilter:
        	part.andFilterBy( queryArgs, "VamDummy",
        	dao.wildcardForAnySequence(  ) );
        	break;

        case VamActiveMsisdnDMO.vamMsisdnExprtdFilter:
        	part.andFilterBy( queryArgs, "VamMsisdnExprtd",
        	dao.wildcardForAnySequence(  ) );
        	break;
        	
        case VamActiveMsisdnDMO.vamExportedToFilter:
        	part.andFilterBy( queryArgs, "vamExportedTo",
        	dao.wildcardForAnySequence(  ) );
        	break;
        	
        case VamActiveMsisdnDMO.vamAnalysis1Filter:
        	part.andFilterBy( queryArgs, "VamAnalysis1",
        	dao.wildcardForAnySequence(  ) );
        	break;
        	
        case VamActiveMsisdnDMO.vamAnalysis2Filter:
        	part.andFilterBy( queryArgs, "VamAnalysis2",
        	dao.wildcardForAnySequence(  ) );
        	break;

        case VamActiveMsisdnDMO.vamAnalysis3Filter:
        	part.andFilterBy( queryArgs, "VamAnalysis3",
        	dao.wildcardForAnySequence(  ) );
        	break;
        	
        case VamActiveMsisdnDMO.vamAnalysis4Filter:
        	part.andFilterBy( queryArgs, "VamAnalysis4",
        	dao.wildcardForAnySequence(  ) );
        	break;
        	
        case VamActiveMsisdnDMO.vamAnalysis5Filter:
        	part.andFilterBy( queryArgs, "VamAnalysis5",
        	dao.wildcardForAnySequence(  ) );	
        	break;        	
        	
      }
    }

    return queryArgs;
  }

  /**
  * Provides a DAOIterator to iterate over the list of VamActiveMsisdn records based
  * on the passed in Filter.
  *
  * @param filter
  * @return
  * @throws EPPIXSeriousException
  */
  public DAOIterator iterate( QueryFilter filter )
    throws EPPIXSeriousException {
    logger.debug( "iterate( filter )" );

    return dao.iterator( 
      filterQueryArgs( filter, null ) );
  }

  /**
  * Provides a DAOIterator to iterate using a "FOR UPDATE", over the list of VamActiveMsisdn records based
  * on the passed in Filter.
  *
  * @param filter
  * @return
  * @throws EPPIXSeriousException
  */
  public DAOIterator iterateWithLock( QueryFilter filter )
    throws EPPIXSeriousException {
    logger.debug( "iterateWithLock( filter )" );

    return dao.iterator( 
      filterQueryArgs( filter, null ), true );
  }

  /**
   * Retrieves the VamActiveMsisdn Data Model Object from a possible list.
   *
   * @param filter
   * @return
   * @throws EPPIXSeriousException
   */
  public VamActiveMsisdnDMO get( QueryFilter filter )
    throws EPPIXSeriousException {
    logger.debug( "get( filter )" );

    DAOParamQueryArgs args = filterQueryArgs( filter, null );

    return (VamActiveMsisdnDMO) dao.get( args.getDMLName(  ),
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
