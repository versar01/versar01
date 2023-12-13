package com.eppixcomm.eppix.base.blo;


import com.eppixcomm.eppix.base.blo.AsMessageDMO;
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
 * AsMessage Business Object.
 *
 * @version $Revision: 1.2 $
 * @author $Author$
 * @since $jdk$
 */
public class AsMessageAbstractDACImpl
  extends DAC
  implements AsMessageAbstractDAC {
  //~ Static variables/initializers //////////////////////////////////////////

  /** Error handler/logger. */
  static DAOThrower thrower = DAOThrower.getDAOThrower( AsMessageAbstractDACImpl.class );

  //~ Instance variables /////////////////////////////////////////////////////

  /** DOCUMENT ME! */
  Logger logger = thrower.getLogger(  );

  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new AsMessageDACImpl object.
   *
   * @param dao Data Access Object.
   * @param defaultLanguageCode the working language of the user, dictates
   *        which language specific descriptions are retrieved.
   */
  public AsMessageAbstractDACImpl( 
    UserContext userContext,
    DAO         dao ) {
    super( dao, thrower );
  }

  public AsMessageAbstractDACImpl(DAO dao ) {
		    super( dao, thrower );
		  }
  //~ Methods ////////////////////////////////////////////////////////////////

  /**
   * Retrieves a AsMessage Data Model Object
   *
   * @return a populated AsMessage Data Model Object or null if not found.
   *
   * @throws EPPIXSeriousException
   */
  public AsMessageDMO get( AsMessageDMO asMessageDMO )
    throws EPPIXSeriousException {
    logger.debug( "get( AsMessageDMO )" );

    thrower.ifParameterMissing( "AsMessageDMO", asMessageDMO );

    return (AsMessageDMO) dao.get( asMessageDMO );
  }

  /**
   * Creates the AsMessage object in the database.
   *
   * @param AsMessageDMO asMessageDMO
   *
   * @throws EPPIXSeriousException
   */
  public void create( AsMessageDMO asMessageDMO )
    throws EPPIXSeriousException {
    logger.debug( "create( asMessageDMO )" );
    thrower.ifParameterMissing( "AsMessageDMO", asMessageDMO );

    dao.insert( asMessageDMO );
  }

  /**
   * Locks and retrieves the AsMessage object from the database.
   *
   * @param aAsMessage AsMessage object
   *
   * @return a populated AsMessage object or null if not found.
   *
   * @throws EPPIXSeriousException
   */
  public AsMessageDMO lock( AsMessageDMO aAsMessageDMO )
    throws EPPIXSeriousException, EPPIXObjectBusyException {
    logger.debug( "lock( aAsMessageDMO )" );

    thrower.ifParameterMissing( "aAsMessageDMO", aAsMessageDMO );

    AsMessageDMO lockedAsMessageDMO = null;

    //
    // Lock the base table on its primary key.
    //
    lockedAsMessageDMO = (AsMessageDMO) dao.lock( "AsMessage",
        "filterByPrimaryKey",
        new DAOArgs( 1 ).arg( aAsMessageDMO.getMcode(  ) ) );

    return lockedAsMessageDMO;
  }

  /**
   * Modifies the AsMessage object in the database.
   *
   * @param AsMessageDMO AsMessage object
   *
   * @throws EPPIXSeriousException
   * @throws EPPIXObjectExpiredException
   * @throws EPPIXObjectNotFoundException
   */
  public void modify( AsMessageDMO asMessageDMO )
    throws EPPIXSeriousException, EPPIXObjectExpiredException,
      EPPIXObjectNotFoundException {
    logger.debug( "modify( aAsMessageDMO )" );

    thrower.ifParameterMissing( "aAsMessageDMO", asMessageDMO );

    thrower.ifParameterMissing( "AsMessageDMO.mcode",
      asMessageDMO.getMcode(  ) );

    dao.update( asMessageDMO );
  }

  /**
  * Modifies the AsMessage object using the specified filter in the database.
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

    dao.updateCustom( new AsMessageDMO(  ), filterQueryArgs( filter, null ) );
  }

  /**
   * Deletes the AsMessage object from the database.
   *
   * @param AsMessageDMO AsMessage object
   *
   * @throws EPPIXSeriousException
   * @throws EPPIXObjectNotFoundException
   * @throws EPPIXObjectExpiredException
   */
  public void delete( AsMessageDMO asMessageDMO )
    throws EPPIXSeriousException, EPPIXObjectNotFoundException,
      EPPIXObjectExpiredException {
    logger.debug( "delete( AsMessageDMO )" );

    thrower.ifParameterMissing( "AsMessageDMO", asMessageDMO );

    thrower.ifParameterMissing( "AsMessageDMO.mcode",
      asMessageDMO.getMcode(  ) );

    dao.delete( asMessageDMO );
  }

  /**
   * Deletes the AsMessage object from the database.
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

    dao.delete( "AsMessage", args.getFilterBy(  ), args );
  }

  /**
  * Return true if a AsMessage object exists.
  *
  * @param AsMessageDMO AsMessageDMO
  *
  * @return true if the AsMessage object exists.
  *
  * @throws EPPIXSeriousException
  */
  public boolean exists( AsMessageDMO AsMessageDMO )
    throws EPPIXSeriousException {
    logger.debug( "exists( AsMessageDMO)" );

    return dao.exists( "AsMessage", "filterByPrimaryKey",
      new DAOArgs( 1 ).arg( AsMessageDMO.getMcode(  ) ) );
  }

  /**
    * Return true if a AsMessage object exists.
    *
    * @param filter
    *
    * @return true if the AsMessage object exists.
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
   * @param locationDMO AsMessage Data Model Object
   *
   * @return DTOList of AsMessage Data Model Objects.
   *
   * @throws EPPIXSeriousException
   */
  public DTOList getList( 
    DTOListState state,
    AsMessageDMO asMessageDMO )
    throws EPPIXSeriousException {
    logger.debug( "getList( state, asMessageDMO )" );

    /**
     * TODO SJ: Change to old java compatible code
     */
//    return dao.getListAbs( state, paramQueryArgs( asMessageDMO ) );
    return null;
  }

  /**
   * Constructs parameterised query arguments.
   *
   * @param $(dataObjectNameLowerCamel} AsMessageDMO object.
   */
  protected DAOParamQueryArgs paramQueryArgs( AsMessageDMO asMessageDMO ) {
    logger.debug( "paramQueryArgs( asMessageDMO)" );

    DAOParamQueryArgs queryArgs = new DAOParamQueryArgs( "AsMessage", 2 * 2 );

    if ( asMessageDMO != null ) {
      // primary key filters...
      Integer mcode = asMessageDMO.getMcode(  );

      if ( !DMO.isNull( mcode ) ) {
        queryArgs.andFilterBy( "Mcode" )
                 .arg( mcode );
      }

      // define more filters...
      String mmess = asMessageDMO.getMmess(  );

      if ( !DMO.isNull( mmess ) ) {
        queryArgs.andFilterBy( "MmessMatch" )
                 .arg( mmess + dao.wildcardForAnySequence(  ) );
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
     * TODO SJ: Change to old java compatible code
     */
    return null;
//    return dao.getListAbs( state, filterQueryArgs( filter, null ) );
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
        ? "AsMessage" : dmlName, parts.size(  ) );

    // TODO SJ For loop to be changed to old for loop styl
    Iterator it = parts.iterator();
    
//    for ( FilterPart part : parts ) {
    while(it.hasNext()){
    	FilterPart part = (FilterPart)it.next();
    	
      switch ( part.getIndex(  ) ) {
        case AsMessageDMO.mcodeFilter:
          part.andFilterBy( queryArgs, "Mcode", dao.wildcardForAnySequence(  ) );

          break;

        case AsMessageDMO.mmessFilter:
          part.andFilterBy( queryArgs, "Mmess", dao.wildcardForAnySequence(  ) );

          break;
      }
    }

    return queryArgs;
  }

  /**
  * Provides a DAOIterator to iterate over the list of AsMessage records based
  * on the passed in Filter.
  *
  * @param filter
  * @return
  * @throws EPPIXSeriousException
  * TODO SJ: Change to old java compatible code
  */
  public DAOIterator iterate( QueryFilter filter )
    throws EPPIXSeriousException {
    logger.debug( "iterate( filter )" );

    return dao.iterator( filterQueryArgs( filter, null ) );
  }

  /**
  * Provides a DAOIterator to iterate using a "FOR UPDATE", over the list of AsMessage records based
  * on the passed in Filter.
  *
  * @param filter
  * @return
  * @throws EPPIXSeriousException
  * TODO SJ: If this method is require it need to be changed to old java
  */
  public DAOIterator iterateWithLock( QueryFilter filter )
    throws EPPIXSeriousException {
    logger.debug( "iterateWithLock( filter )" );

    return dao.iterator(filterQueryArgs( filter, null ));
  }

  /**
   * Retrieves the AsMessage Data Model Object from a possible list.
   *
   * @param filter
   * @return
   * @throws EPPIXSeriousException
   */
  public AsMessageDMO get( QueryFilter filter )
    throws EPPIXSeriousException {
    logger.debug( "get( filter )" );

    DAOParamQueryArgs args = filterQueryArgs( filter, null );

    return (AsMessageDMO) dao.get( args.getDMLName(  ), args.getFilterBy(  ),
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

