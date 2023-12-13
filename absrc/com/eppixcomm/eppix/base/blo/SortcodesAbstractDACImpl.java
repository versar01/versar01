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
 * Sortcodes Business Object.
 *
 * @version $Revision: 1.2 $
 * @author $Author$
 * @since $jdk$
 */
public class SortcodesAbstractDACImpl
  extends DAC
  implements SortcodesAbstractDAC {
  //~ Static variables/initializers //////////////////////////////////////////

  /** Error handler/logger. */
  static DAOThrower thrower = DAOThrower.getDAOThrower( SortcodesAbstractDACImpl.class );

  //~ Instance variables /////////////////////////////////////////////////////

  /** DOCUMENT ME! */
  Logger logger = thrower.getLogger(  );

  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new SortcodesDACImpl object.
   *
   * @param dao Data Access Object.
   * @param defaultLanguageCode the working language of the user, dictates
   *        which language specific descriptions are retrieved.
   */
  public SortcodesAbstractDACImpl( 
    DAO         dao ) {
    super( dao, thrower );
  }

  //~ Methods ////////////////////////////////////////////////////////////////

  /**
   * Retrieves a Sortcodes Data Model Object
   *
   * @return a populated Sortcodes Data Model Object or null if not found.
   *
   * @throws EPPIXSeriousException
   */
  public SortcodesDMO get( SortcodesDMO sortcodesDMO )
    throws EPPIXSeriousException {
    logger.debug( "get( SortcodesDMO )" );

    thrower.ifParameterMissing( "SortcodesDMO", sortcodesDMO );

    return (SortcodesDMO) dao.get( sortcodesDMO );
  }

  /**
   * Creates the Sortcodes object in the database.
   *
   * @param SortcodesDMO sortcodesDMO
   *
   * @throws EPPIXSeriousException
   */
  public void create( SortcodesDMO sortcodesDMO )
    throws EPPIXSeriousException {
    logger.debug( "create( sortcodesDMO )" );
    thrower.ifParameterMissing( "SortcodesDMO", sortcodesDMO );

    dao.insert( sortcodesDMO );
  }

  /**
   * Locks and retrieves the Sortcodes object from the database.
   *
   * @param aSortcodes Sortcodes object
   *
   * @return a populated Sortcodes object or null if not found.
   *
   * @throws EPPIXSeriousException
   */
  public SortcodesDMO lock( SortcodesDMO aSortcodesDMO )
    throws EPPIXSeriousException, EPPIXObjectBusyException {
    logger.debug( "lock( aSortcodesDMO )" );

    thrower.ifParameterMissing( "aSortcodesDMO", aSortcodesDMO );

    SortcodesDMO lockedSortcodesDMO = null;

    //
    // Lock the base table on its primary key.
    //
    lockedSortcodesDMO = (SortcodesDMO) dao.lock( "Sortcodes",
        "filterByPrimaryKey",
        new DAOArgs( 1 ).arg( aSortcodesDMO.getSortcode(  ) ) );

    return lockedSortcodesDMO;
  }

  /**
   * Modifies the Sortcodes object in the database.
   *
   * @param SortcodesDMO Sortcodes object
   *
   * @throws EPPIXSeriousException
   * @throws EPPIXObjectExpiredException
   * @throws EPPIXObjectNotFoundException
   */
  public void modify( SortcodesDMO sortcodesDMO )
    throws EPPIXSeriousException, EPPIXObjectExpiredException,
      EPPIXObjectNotFoundException {
    logger.debug( "modify( aSortcodesDMO )" );

    thrower.ifParameterMissing( "aSortcodesDMO", sortcodesDMO );

    thrower.ifParameterMissing( "SortcodesDMO.sortcode",
      sortcodesDMO.getSortcode(  ) );

    dao.update( sortcodesDMO );
  }

  /**
  * Modifies the Sortcodes object using the specified filter in the database.
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

    dao.updateCustom( new SortcodesDMO(  ), filterQueryArgs( filter, null ) );
  }

  /**
   * Deletes the Sortcodes object from the database.
   *
   * @param SortcodesDMO Sortcodes object
   *
   * @throws EPPIXSeriousException
   * @throws EPPIXObjectNotFoundException
   * @throws EPPIXObjectExpiredException
   */
  public void delete( SortcodesDMO sortcodesDMO )
    throws EPPIXSeriousException, EPPIXObjectNotFoundException,
      EPPIXObjectExpiredException {
    logger.debug( "delete( SortcodesDMO )" );

    thrower.ifParameterMissing( "SortcodesDMO", sortcodesDMO );

    thrower.ifParameterMissing( "SortcodesDMO.sortcode",
      sortcodesDMO.getSortcode(  ) );

    dao.delete( sortcodesDMO );
  }

  /**
   * Deletes the Sortcodes object from the database.
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

    dao.delete( "Sortcodes", args.getFilterBy(  ), args );
  }

  /**
  * Return true if a Sortcodes object exists.
  *
  * @param SortcodesDMO SortcodesDMO
  *
  * @return true if the Sortcodes object exists.
  *
  * @throws EPPIXSeriousException
  */
  public boolean exists( SortcodesDMO SortcodesDMO )
    throws EPPIXSeriousException {
    logger.debug( "exists( SortcodesDMO)" );

    return dao.exists( "Sortcodes", "filterByPrimaryKey",
      new DAOArgs( 1 ).arg( SortcodesDMO.getSortcode(  ) ) );
  }

  /**
    * Return true if a Sortcodes object exists.
    *
    * @param filter
    *
    * @return true if the Sortcodes object exists.
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
   * @param locationDMO Sortcodes Data Model Object
   *
   * @return DTOList of Sortcodes Data Model Objects.
   *
   * @throws EPPIXSeriousException
   */
//  public DTOList<SortcodesDMO> getList( 
//    DTOListState state,
//    SortcodesDMO sortcodesDMO )
//    throws EPPIXSeriousException {
//    logger.debug( "getList( state, sortcodesDMO )" );
//
//    return dao.getListAbs( state, paramQueryArgs( sortcodesDMO ) );
//  }

  /**
   * Constructs parameterised query arguments.
   *
   * @param $(dataObjectNameLowerCamel} SortcodesDMO object.
   */
  protected DAOParamQueryArgs paramQueryArgs( SortcodesDMO sortcodesDMO ) {
    logger.debug( "paramQueryArgs( sortcodesDMO)" );

    DAOParamQueryArgs queryArgs = new DAOParamQueryArgs( "Sortcodes", 4 * 2 );

    if ( sortcodesDMO != null ) {
      // primary key filters...
      String sortcode = sortcodesDMO.getSortcode(  );

      if ( !DMO.isNull( sortcode ) ) {
        queryArgs.andFilterBy( "SortcodeMatch" )
                 .arg( sortcode + dao.wildcardForAnySequence(  ) );
      }

      // define more filters...
      String bankName = sortcodesDMO.getBankName(  );

      if ( !DMO.isNull( bankName ) ) {
        queryArgs.andFilterBy( "BankNameMatch" )
                 .arg( bankName + dao.wildcardForAnySequence(  ) );
      }

      String town = sortcodesDMO.getTown(  );

      if ( !DMO.isNull( town ) ) {
        queryArgs.andFilterBy( "TownMatch" )
                 .arg( town + dao.wildcardForAnySequence(  ) );
      }

      String postcode = sortcodesDMO.getPostcode(  );

      if ( !DMO.isNull( postcode ) ) {
        queryArgs.andFilterBy( "PostcodeMatch" )
                 .arg( postcode + dao.wildcardForAnySequence(  ) );
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
//  public DTOList<SortcodesDMO> getList( 
//    DTOListState state,
//    QueryFilter  filter )
//    throws EPPIXSeriousException {
//    logger.debug( "getList( state, filter )" );
//
//    return dao.getListAbs( state, filterQueryArgs( filter, null ) );
//  }

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
        ? "Sortcodes" : dmlName, parts.size(  ) );

    for ( Iterator i = parts.iterator(); i.hasNext(); ) {
      FilterPart part = (FilterPart) i.next();
      switch ( part.getIndex(  ) ) {
        case SortcodesDMO.sortcodeFilter:
          part.andFilterBy( queryArgs, "Sortcode",
            dao.wildcardForAnySequence(  ) );

          break;

        case SortcodesDMO.bankNameFilter:
          part.andFilterBy( queryArgs, "BankName",
            dao.wildcardForAnySequence(  ) );

          break;

        case SortcodesDMO.townFilter:
          part.andFilterBy( queryArgs, "Town", dao.wildcardForAnySequence(  ) );

          break;

        case SortcodesDMO.postcodeFilter:
          part.andFilterBy( queryArgs, "Postcode",
            dao.wildcardForAnySequence(  ) );

          break;
      }
    }

    return queryArgs;
  }

  /**
  * Provides a DAOIterator to iterate over the list of Sortcodes records based
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
  * Provides a DAOIterator to iterate using a "FOR UPDATE", over the list of Sortcodes records based
  * on the passed in Filter.
  *
  * @param filter
  * @return
  * @throws EPPIXSeriousException
  */
  public DAOIterator iterateWithLock( QueryFilter filter )
    throws EPPIXSeriousException {
    logger.debug( "iterateWithLock( filter )" );

    return dao.iterator( filterQueryArgs( filter, null ),
      true );
  }

  /**
   * Retrieves the Sortcodes Data Model Object from a possible list.
   *
   * @param filter
   * @return
   * @throws EPPIXSeriousException
   */
  public SortcodesDMO get( QueryFilter filter )
    throws EPPIXSeriousException {
    logger.debug( "get( filter )" );

    DAOParamQueryArgs args = filterQueryArgs( filter, null );

    return (SortcodesDMO) dao.get( args.getDMLName(  ), args.getFilterBy(  ),
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
