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

import com.eppixcomm.eppix.base.error.EPPIXObjectBusyException;

import com.eppixcomm.eppix.base.error.EPPIXObjectExpiredException;

import com.eppixcomm.eppix.base.error.EPPIXObjectNotFoundException;

import com.eppixcomm.eppix.base.error.EPPIXSeriousException;



public class UrsUrlSettingAbstractDACImpl

  extends DAC

  implements UrsUrlSettingAbstractDAC {

  //~ Static variables/initializers //////////////////////////////////////////


  /** Error handler/logger. */

  static DAOThrower thrower = DAOThrower.getDAOThrower( UrsUrlSettingAbstractDACImpl.class );


  //~ Instance variables /////////////////////////////////////////////////////


  /** DOCUMENT ME! */

  Logger logger = thrower.getLogger(  );


  //~ Constructors ///////////////////////////////////////////////////////////


  /**

   * Creates a new UrsUrlSettingDACImpl object.

   *

   * @param dao Data Access Object.

   * @param defaultLanguageCode the working language of the user, dictates

   *        which language specific descriptions are retrieved.

   */

  public UrsUrlSettingAbstractDACImpl(


    DAO         dao ) {

    super(  dao, thrower );

  }


  //~ Methods ////////////////////////////////////////////////////////////////


  /**

   * Retrieves a UrsUrlSetting Data Model Object

   *

   * @return a populated UrsUrlSetting Data Model Object or null if not found.

   *

   * @throws EPPIXSeriousException

   */

  public UrsUrlSettingDMO get( UrsUrlSettingDMO ursKeySettingDMO )

    throws EPPIXSeriousException {

    logger.debug( "get( UrsUrlSettingDMO )" );


    thrower.ifParameterMissing( "UrsUrlSettingDMO", ursKeySettingDMO );


    return (UrsUrlSettingDMO) dao.get( ursKeySettingDMO );

  }


  /**

   * Creates the UrsUrlSetting object in the database.

   *

   * @param UrsUrlSettingDMO ursKeySettingDMO

   *

   * @throws EPPIXSeriousException

   */

  public void create( UrsUrlSettingDMO ursKeySettingDMO )

    throws EPPIXSeriousException {

    logger.debug( "create( ursKeySettingDMO )" );

    thrower.ifParameterMissing( "UrsUrlSettingDMO", ursKeySettingDMO );


    dao.insert( ursKeySettingDMO );

  }


  /**

   * Locks and retrieves the UrsUrlSetting object from the database.

   *

   * @param aUrsUrlSetting UrsUrlSetting object

   *

   * @return a populated UrsUrlSetting object or null if not found.

   *

   * @throws EPPIXSeriousException

   */

  public UrsUrlSettingDMO lock( UrsUrlSettingDMO aUrsUrlSettingDMO )

    throws EPPIXSeriousException, EPPIXObjectBusyException {

    logger.debug( "lock( aUrsUrlSettingDMO )" );


    thrower.ifParameterMissing( "aUrsUrlSettingDMO", aUrsUrlSettingDMO );


    UrsUrlSettingDMO lockedUrsUrlSettingDMO = null;


    //

    // Lock the base table on its primary key.

    //

    lockedUrsUrlSettingDMO = (UrsUrlSettingDMO) dao.lock( "UrsUrlSetting",

        "filterByPrimaryKey",

        new DAOArgs( 1 ).arg( aUrsUrlSettingDMO.getUrsUrlCode(  ) ) );


    return lockedUrsUrlSettingDMO;

  }


  /**

   * Modifies the UrsUrlSetting object in the database.

   *

   * @param UrsUrlSettingDMO UrsUrlSetting object

   *

   * @throws EPPIXSeriousException

   * @throws EPPIXObjectExpiredException

   * @throws EPPIXObjectNotFoundException

   */

  public void modify( UrsUrlSettingDMO ursKeySettingDMO )

    throws EPPIXSeriousException, EPPIXObjectExpiredException,

      EPPIXObjectNotFoundException {

    logger.debug( "modify( aUrsUrlSettingDMO )" );


    thrower.ifParameterMissing( "aUrsUrlSettingDMO", ursKeySettingDMO );


    thrower.ifParameterMissing( "UrsUrlSettingDMO.ursKeyCode",

      ursKeySettingDMO.getUrsUrlCode(  ) );


    dao.update( ursKeySettingDMO );

  }


  /**

  * Modifies the UrsUrlSetting object using the specified filter in the database.

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


    dao.updateCustom( new UrsUrlSettingDMO(  ),

      filterQueryArgs( filter, null ) );

  }


  /**

   * Deletes the UrsUrlSetting object from the database.

   *

   * @param UrsUrlSettingDMO UrsUrlSetting object

   *

   * @throws EPPIXSeriousException

   * @throws EPPIXObjectNotFoundException

   * @throws EPPIXObjectExpiredException

   */

  public void delete( UrsUrlSettingDMO ursKeySettingDMO )

    throws EPPIXSeriousException, EPPIXObjectNotFoundException,

      EPPIXObjectExpiredException {

    logger.debug( "delete( UrsUrlSettingDMO )" );


    thrower.ifParameterMissing( "UrsUrlSettingDMO", ursKeySettingDMO );


    thrower.ifParameterMissing( "UrsUrlSettingDMO.ursKeyCode",

      ursKeySettingDMO.getUrsUrlCode(  ) );


    dao.delete( ursKeySettingDMO );

  }


  /**

   * Deletes the UrsUrlSetting object from the database.

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


    dao.delete( "UrsUrlSetting", args.getFilterBy(  ), args );

  }


  /**

  * Return true if a UrsUrlSetting object exists.

  *

  * @param UrsUrlSettingDMO UrsUrlSettingDMO

  *

  * @return true if the UrsUrlSetting object exists.

  *

  * @throws EPPIXSeriousException

  */

  public boolean exists( UrsUrlSettingDMO UrsUrlSettingDMO )

    throws EPPIXSeriousException {

    logger.debug( "exists( UrsUrlSettingDMO)" );


    return dao.exists( "UrsUrlSetting", "filterByPrimaryKey",

      new DAOArgs( 1 ).arg( UrsUrlSettingDMO.getUrsUrlCode(  ) ) );

  }


  /**

    * Return true if a UrsUrlSetting object exists.

    *

    * @param filter

    *

    * @return true if the UrsUrlSetting object exists.

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

   * @param locationDMO UrsUrlSetting Data Model Object

   *

   * @return DTOList of UrsUrlSetting Data Model Objects.

   *

   * @throws EPPIXSeriousException

   */

//  public DTOList<UrsUrlSettingDMO> getList(

//    DTOListState     state,

//    UrsUrlSettingDMO ursKeySettingDMO )

//    throws EPPIXSeriousException {

//    logger.debug( "getList( state, ursKeySettingDMO )" );

//

//    return dao.getListAbs( state, paramQueryArgs( ursKeySettingDMO ) );

//  }


  /**

   * Constructs parameterised query arguments.

   *

   * @param $(dataObjectNameLowerCamel} UrsUrlSettingDMO object.

   */

  protected DAOParamQueryArgs paramQueryArgs(

    UrsUrlSettingDMO ursKeySettingDMO ) {

    logger.debug( "paramQueryArgs( ursKeySettingDMO)" );


    DAOParamQueryArgs queryArgs = new DAOParamQueryArgs( "UrsUrlSetting",

        4 * 2 );


    if ( ursKeySettingDMO != null ) {

      // primary key filters...

      String ursKeyCode = ursKeySettingDMO.getUrsUrlCode(  );


      if ( !DMO.isNull( ursKeyCode ) ) {

        queryArgs.andFilterBy( "UrsUrlCodeMatch" )

                 .arg( ursKeyCode + dao.wildcardForAnySequence(  ) );

      }


      // define more filters...

      String ursValue = ursKeySettingDMO.getUrsValue(  );


      if ( !DMO.isNull( ursValue ) ) {

        queryArgs.andFilterBy( "UrsValueMatch" )

                 .arg( ursValue + dao.wildcardForAnySequence(  ) );

      }


      String ursComment = ursKeySettingDMO.getUrsComment(  );


      if ( !DMO.isNull( ursComment ) ) {

        queryArgs.andFilterBy( "UrsCommentMatch" )

                 .arg( ursComment + dao.wildcardForAnySequence(  ) );

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

//  public DTOList<UrsUrlSettingDMO> getList(

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

        ? "UrsUrlSetting" : dmlName, parts.size(  ) );


    for ( Iterator i = parts.iterator();i.hasNext(); ) {

      FilterPart part = (FilterPart) i.next();

      switch ( part.getIndex(  ) ) {

        case UrsUrlSettingDMO.ursUrlCodeFilter:

          part.andFilterBy( queryArgs, "UrsUrlCode",

            dao.wildcardForAnySequence(  ) );


          break;


        case UrsUrlSettingDMO.ursValueFilter:

          part.andFilterBy( queryArgs, "UrsValue",

            dao.wildcardForAnySequence(  ) );


          break;


        case UrsUrlSettingDMO.ursCommentFilter:

          part.andFilterBy( queryArgs, "UrsComment",

            dao.wildcardForAnySequence(  ) );


          break;


        case UrsUrlSettingDMO.ursTimestampFilter:

          part.andFilterBy( queryArgs, "UrsTimestamp" );


          break;

      }

    }


    return queryArgs;

  }


  /**

  * Provides a DAOIterator to iterate over the list of UrsUrlSetting records based

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

  * Provides a DAOIterator to iterate using a "FOR UPDATE", over the list of UrsUrlSetting records based

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

   * Retrieves the UrsUrlSetting Data Model Object from a possible list.

   *

   * @param filter

   * @return

   * @throws EPPIXSeriousException

   */

  public UrsUrlSettingDMO get( QueryFilter filter )

    throws EPPIXSeriousException {

    logger.debug( "get( filter )" );


    DAOParamQueryArgs args = filterQueryArgs( filter, null );


    return (UrsUrlSettingDMO) dao.get( args.getDMLName(  ),

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
