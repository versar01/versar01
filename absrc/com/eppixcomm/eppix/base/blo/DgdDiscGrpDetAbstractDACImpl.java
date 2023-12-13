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
 * DgdDiscGrpDet Business Object.
 *
 * @version $Revision: 1.2 $
 * @author $Author$
 * @since $jdk$
 */
public class DgdDiscGrpDetAbstractDACImpl
  extends DAC
  implements DgdDiscGrpDetAbstractDAC {
  //~ Static variables/initializers //////////////////////////////////////////

  /** Error handler/logger. */
  static DAOThrower thrower = DAOThrower.getDAOThrower( DgdDiscGrpDetAbstractDACImpl.class );

  //~ Instance variables /////////////////////////////////////////////////////

  /** DOCUMENT ME! */
  Logger logger = thrower.getLogger(  );

  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new DgdDiscGrpDetDACImpl object.
   *
   * @param dao Data Access Object.
   * @param defaultLanguageCode the working language of the user, dictates
   *        which language specific descriptions are retrieved.
   */
  public DgdDiscGrpDetAbstractDACImpl( 
    UserContext userContext,
    DAO         dao ) {
    super( userContext, dao, thrower );
  }
  
  public DgdDiscGrpDetAbstractDACImpl(DAO dao ) {
		    super( dao, thrower );
		  }  

  //~ Methods ////////////////////////////////////////////////////////////////

  /**
   * Creates the DgdDiscGrpDet object in the database.
   *
   * @param DgdDiscGrpDetDMO dgdDiscGrpDetDMO
   *
   * @throws EPPIXSeriousException
   */
  public void create( DgdDiscGrpDetDMO dgdDiscGrpDetDMO )
    throws EPPIXSeriousException {
    logger.debug( "create( dgdDiscGrpDetDMO )" );
    thrower.ifParameterMissing( "DgdDiscGrpDetDMO", dgdDiscGrpDetDMO );

    dao.insert( dgdDiscGrpDetDMO );
  }

  /**
   * Locks and retrieves the DgdDiscGrpDet object from the database.
   *
   * @param aDgdDiscGrpDet DgdDiscGrpDet object
   *
   * @return a populated DgdDiscGrpDet object or null if not found.
   *
   * @throws EPPIXSeriousException
   */
  public DgdDiscGrpDetDMO lock( DgdDiscGrpDetDMO aDgdDiscGrpDetDMO )
    throws EPPIXSeriousException, EPPIXObjectBusyException {
    logger.debug( "lock( aDgdDiscGrpDetDMO )" );

    thrower.ifParameterMissing( "aDgdDiscGrpDetDMO", aDgdDiscGrpDetDMO );

    DgdDiscGrpDetDMO lockedDgdDiscGrpDetDMO = null;

    //
    // Lock the base table on its primary key.
    //
    lockedDgdDiscGrpDetDMO = (DgdDiscGrpDetDMO) dao.lock( "DgdDiscGrpDet",
        "filterByPrimaryKey", new DAOArgs( 0 ) );

    return lockedDgdDiscGrpDetDMO;
  }

  /**
  * Modifies the DgdDiscGrpDet object using the specified filter in the database.
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

    dao.updateCustom( new DgdDiscGrpDetDMO(  ),
      filterQueryArgs( filter, null ) );
  }

  /**
   * Deletes the DgdDiscGrpDet object from the database.
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

    dao.delete( "DgdDiscGrpDet", args.getFilterBy(  ), args );
  }

  /**
    * Return true if a DgdDiscGrpDet object exists.
    *
    * @param filter
    *
    * @return true if the DgdDiscGrpDet object exists.
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
   * @param locationDMO DgdDiscGrpDet Data Model Object
   *
   * @return DTOList of DgdDiscGrpDet Data Model Objects.
   *
   * @throws EPPIXSeriousException
   */
  public DTOList getList( 
    DTOListState     state,
    DgdDiscGrpDetDMO dgdDiscGrpDetDMO )
    throws EPPIXSeriousException {
    logger.debug( "getList( state, dgdDiscGrpDetDMO )" );

    return dao.getListAbs( state, paramQueryArgs( dgdDiscGrpDetDMO ) );
  }

  /**
   * Constructs parameterised query arguments.
   *
   * @param $(dataObjectNameLowerCamel} DgdDiscGrpDetDMO object.
   */
  protected DAOParamQueryArgs paramQueryArgs( 
    DgdDiscGrpDetDMO dgdDiscGrpDetDMO ) {
    logger.debug( "paramQueryArgs( dgdDiscGrpDetDMO)" );

    DAOParamQueryArgs queryArgs = new DAOParamQueryArgs( "DgdDiscGrpDet",
        2 * 2 );

    if ( dgdDiscGrpDetDMO != null ) {
      // primary key filters...
      // define more filters...
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
        ? "DgdDiscGrpDet" : dmlName, parts.size(  ) );

    Iterator it = parts.iterator();
    
//    for ( FilterPart part : parts ) {
    while(it.hasNext()){
    	FilterPart part = (FilterPart)it.next();
    	
      switch ( part.getIndex(  ) ) {
        case DgdDiscGrpDetDMO.dgdGroupIdFilter:
          part.andFilterBy( queryArgs, "DgdGroupId",
            dao.wildcardForAnySequence(  ) );

          break;

        case DgdDiscGrpDetDMO.dgdClassIdFilter:
          part.andFilterBy( queryArgs, "DgdClassId",
            dao.wildcardForAnySequence(  ) );

          break;
      }
    }

    return queryArgs;
  }

  /**
  * Provides a DAOIterator to iterate over the list of DgdDiscGrpDet records based
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
  * Provides a DAOIterator to iterate using a "FOR UPDATE", over the list of DgdDiscGrpDet records based
  * on the passed in Filter.
  *
  * @param filter
  * @return
  * @throws EPPIXSeriousException
  */
  public DAOIterator iterateWithLock( QueryFilter filter )
    throws EPPIXSeriousException {
    logger.debug( "iterateWithLock( filter )" );

    return dao.iterator(filterQueryArgs( filter, null ), true );
  }

  /**
   * Retrieves the DgdDiscGrpDet Data Model Object from a possible list.
   *
   * @param filter
   * @return
   * @throws EPPIXSeriousException
   */
  public DgdDiscGrpDetDMO get( QueryFilter filter )
    throws EPPIXSeriousException {
    logger.debug( "get( filter )" );

    DAOParamQueryArgs args = filterQueryArgs( filter, null );

    return (DgdDiscGrpDetDMO) dao.get( args.getDMLName(  ),
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
