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
 * EanEpxactionNote Business Object.
 *
 * @version $Revision: 1.2 $
 * @author $Author$
 * @since $jdk$
 */
public class EanEpxactionNoteAbstractDACImpl
  extends DAC
  implements EanEpxactionNoteAbstractDAC {
  //~ Static variables/initializers //////////////////////////////////////////

  /** Error handler/logger. */
  static DAOThrower thrower = DAOThrower.getDAOThrower( EanEpxactionNoteAbstractDACImpl.class );

  //~ Instance variables /////////////////////////////////////////////////////

  /** DOCUMENT ME! */
  Logger logger = thrower.getLogger(  );

  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new EanEpxactionNoteDACImpl object.
   *
   * @param dao Data Access Object.
   * @param defaultLanguageCode the working language of the user, dictates
   *        which language specific descriptions are retrieved.
   */
  public EanEpxactionNoteAbstractDACImpl( 
    UserContext userContext,
    DAO         dao ) {
    super( userContext, dao, thrower );
  }

  public EanEpxactionNoteAbstractDACImpl( DAO dao ) {
		    super( dao, thrower );
		  }
  
  //~ Methods ////////////////////////////////////////////////////////////////

  /**
   * Creates the EanEpxactionNote object in the database.
   *
   * @param EanEpxactionNoteDMO eanEpxactionNoteDMO
   *
   * @throws EPPIXSeriousException
   */
  public void create( EanEpxactionNoteDMO eanEpxactionNoteDMO )
    throws EPPIXSeriousException {
    logger.debug( "create( eanEpxactionNoteDMO )" );
    thrower.ifParameterMissing( "EanEpxactionNoteDMO", eanEpxactionNoteDMO );

    dao.insert( eanEpxactionNoteDMO );
  }

  /**
   * Locks and retrieves the EanEpxactionNote object from the database.
   *
   * @param aEanEpxactionNote EanEpxactionNote object
   *
   * @return a populated EanEpxactionNote object or null if not found.
   *
   * @throws EPPIXSeriousException
   */
  public EanEpxactionNoteDMO lock( EanEpxactionNoteDMO aEanEpxactionNoteDMO )
    throws EPPIXSeriousException, EPPIXObjectBusyException {
    logger.debug( "lock( aEanEpxactionNoteDMO )" );

    thrower.ifParameterMissing( "aEanEpxactionNoteDMO", aEanEpxactionNoteDMO );

    EanEpxactionNoteDMO lockedEanEpxactionNoteDMO = null;

    //
    // Lock the base table on its primary key.
    //
    lockedEanEpxactionNoteDMO = (EanEpxactionNoteDMO) dao.lock( "EanEpxactionNote",
        "filterByPrimaryKey", new DAOArgs( 0 ) );

    return lockedEanEpxactionNoteDMO;
  }

  /**
  * Modifies the EanEpxactionNote object using the specified filter in the database.
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

    dao.updateCustom( new EanEpxactionNoteDMO(  ),
      filterQueryArgs( filter, null ) );
  }

  /**
   * Deletes the EanEpxactionNote object from the database.
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

    dao.delete( "EanEpxactionNote", args.getFilterBy(  ), args );
  }

  /**
    * Return true if a EanEpxactionNote object exists.
    *
    * @param filter
    *
    * @return true if the EanEpxactionNote object exists.
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
   * @param locationDMO EanEpxactionNote Data Model Object
   *
   * @return DTOList of EanEpxactionNote Data Model Objects.
   *
   * @throws EPPIXSeriousException
   */
  public DTOList getList( 
    DTOListState        state,
    EanEpxactionNoteDMO eanEpxactionNoteDMO )
    throws EPPIXSeriousException {
    logger.debug( "getList( state, eanEpxactionNoteDMO )" );

    return dao.getListAbs( state, paramQueryArgs( eanEpxactionNoteDMO ) );
  }

  /**
   * Constructs parameterised query arguments.
   *
   * @param $(dataObjectNameLowerCamel} EanEpxactionNoteDMO object.
   */
  protected DAOParamQueryArgs paramQueryArgs( 
    EanEpxactionNoteDMO eanEpxactionNoteDMO ) {
    logger.debug( "paramQueryArgs( eanEpxactionNoteDMO)" );

    DAOParamQueryArgs queryArgs = new DAOParamQueryArgs( "EanEpxactionNote",
        3 * 2 );

    if ( eanEpxactionNoteDMO != null ) {
      // primary key filters...
      // define more filters...
      String eanText = eanEpxactionNoteDMO.getEanText(  );

      if ( !DMO.isNull( eanText ) ) {
        queryArgs.andFilterBy( "EanTextMatch" )
                 .arg( eanText + dao.wildcardForAnySequence(  ) );
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
        ? "EanEpxactionNote" : dmlName, parts.size(  ) );

    Iterator it = parts.iterator();
    while(it.hasNext()){
//    for ( FilterPart part : parts ) {
    	
    FilterPart part = (FilterPart)it.next();
      switch ( part.getIndex(  ) ) {
        case EanEpxactionNoteDMO.eanActionSeqFilter:
          part.andFilterBy( queryArgs, "EanActionSeq",
            dao.wildcardForAnySequence(  ) );

          break;

        case EanEpxactionNoteDMO.eanTextSeqFilter:
          part.andFilterBy( queryArgs, "EanTextSeq",
            dao.wildcardForAnySequence(  ) );

          break;

        case EanEpxactionNoteDMO.eanTextFilter:
          part.andFilterBy( queryArgs, "EanText",
            dao.wildcardForAnySequence(  ) );

          break;
      }
    }

    return queryArgs;
  }

  /**
  * Provides a DAOIterator to iterate over the list of EanEpxactionNote records based
  * on the passed in Filter.
  *
  * @param filter
  * @return
  * @throws EPPIXSeriousException
  */
  public DAOIterator iterate( QueryFilter filter )
    throws EPPIXSeriousException {
    logger.debug( "iterate( filter )" );

    return dao.iterator( filterQueryArgs( filter, null ) );
  }

  /**
  * Provides a DAOIterator to iterate using a "FOR UPDATE", over the list of EanEpxactionNote records based
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

    return dao.iterator( filterQueryArgs( filter, null ), true );
  }

  /**
   * Retrieves the EanEpxactionNote Data Model Object from a possible list.
   *
   * @param filter
   * @return
   * @throws EPPIXSeriousException
   */
  public EanEpxactionNoteDMO get( QueryFilter filter )
    throws EPPIXSeriousException {
    logger.debug( "get( filter )" );

    DAOParamQueryArgs args = filterQueryArgs( filter, null );

    return (EanEpxactionNoteDMO) dao.get( args.getDMLName(  ),
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

