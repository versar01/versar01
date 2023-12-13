/*============================================================================================= *
 *
 * (c) 2006 Copyright Eppixcomm.
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
package com.eppixcomm.eppix.common.blo;

import com.eppixcomm.eppix.common.core.UserContext; // always required for this sort of class
import com.eppixcomm.eppix.common.data.DAC; // always required for this sort of class
import com.eppixcomm.eppix.common.data.DAO; // always required for this sort of class
import com.eppixcomm.eppix.common.data.DAOArgs; // always required for this sort of class
import com.eppixcomm.eppix.common.data.DAOParamQueryArgs; // always required for this sort of class
import com.eppixcomm.eppix.common.data.DAOThrower; // always required for this sort of class
import com.eppixcomm.eppix.common.data.DMO; // always required for this sort of class
import com.eppixcomm.eppix.common.util.QueryFilter;
import com.eppixcomm.eppix.common.util.FilterPart;
import com.eppixcomm.eppix.common.data.DTOList; // always required for this sort of class
import com.eppixcomm.eppix.common.data.DTOListState; // always required for this sort of class
import com.eppixcomm.eppix.base.error.EPPIXObjectBusyException; // always required for this sort of class
import com.eppixcomm.eppix.base.error.EPPIXObjectExpiredException; // always required for this sort of class
import com.eppixcomm.eppix.base.error.EPPIXObjectNotFoundException; // always required for this sort of class
import com.eppixcomm.eppix.base.error.EPPIXSeriousException; // always required for this sort of class
import com.eppixcomm.eppix.base.error.EPPIXUnexpectedException; // always required for this sort of class
import com.eppixcomm.eppix.common.util.Date; // always required for this sort of class
import com.eppixcomm.eppix.common.util.DateTime; // always required for this sort of class

import org.apache.log4j.Logger; // always required for this sort of class

import java.math.BigDecimal; // always required for this sort of class

import java.util.Iterator;
import java.util.List;

/**
 * This is the standard implementation of the Data Access Controller for the
 * NextPrn Business Object.
 *
 * @version $Revision: 1.2 $
 * @author Alan Fleming
 * @since $jdk$
 */
public class NextPrnDACImpl
  extends DAC
  implements NextPrnDAC {
  //~ Static variables/initializers //////////////////////////////////////////

  /** Error handler/logger. */
  private static DAOThrower thrower = DAOThrower.getDAOThrower( 
      NextPrnDACImpl.class );

  //~ Instance variables /////////////////////////////////////////////////////

  private Logger logger = thrower.getLogger(  );

  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new NextPrnDACImpl object.
   *
   * @param dao Data Access Object.
   * @param defaultLanguageCode the working language of the user, dictates
   *        which language specific descriptions are retrieved.
   */
  public NextPrnDACImpl( 
    UserContext userContext,
    DAO         dao ) {
    super( userContext, dao, thrower );
  }

  //~ Methods ////////////////////////////////////////////////////////////////

  /**
   * Retrieves a NextPrn Data Model Object
   *
   * @return a populated NextPrn Data Model Object or null if not found.
   *
   * @throws EPPIXSeriousException
   */
  public NextPrnDMO get( NextPrnDMO nextPrnDMO )
    throws EPPIXSeriousException {
    logger.debug( "get( NextPrnDMO )" );

    thrower.ifParameterMissing( 
      "NextPrnDMO",
      nextPrnDMO );

    return (NextPrnDMO) dao.get( nextPrnDMO );
  }

  /**
   * Creates the NextPrn object in the database.
   *
   * @param NextPrnDMO nextPrnDMO
   *
   * @throws EPPIXSeriousException
   */
  public void create( NextPrnDMO nextPrnDMO )
    throws EPPIXSeriousException {
    logger.debug( "create( nextPrnDMO )" );
    thrower.ifParameterMissing( 
      "NextPrnDMO",
      nextPrnDMO );

    dao.insert( nextPrnDMO );
  }

  /**
   * Locks and retrieves the NextPrn object from the database.
   *
   * @param aNextPrn NextPrn object
   *
   * @return a populated NextPrn object or null if not found.
   *
   * @throws EPPIXSeriousException
   */
  public NextPrnDMO lock( NextPrnDMO aNextPrnDMO )
    throws EPPIXSeriousException, EPPIXObjectBusyException {
    logger.debug( "lock( aNextPrnDMO )" );

    thrower.ifParameterMissing( 
      "aNextPrnDMO",
      aNextPrnDMO );

    NextPrnDMO lockedNextPrnDMO = null;

    //
    // Lock the base table on its primary key.
    //
    lockedNextPrnDMO = (NextPrnDMO) dao.lock( 
        "NextPrn",
        "NONE",
        new DAOArgs( 0 ) );

    return lockedNextPrnDMO;
  }

  /**
   * Modifies the NextPrn object in the database.
   *
   * @param NextPrnDMO NextPrn object
   *
   * @throws EPPIXSeriousException
   * @throws EPPIXObjectExpiredException
   * @throws EPPIXObjectNotFoundException
   */
  public void modify( NextPrnDMO nextPrnDMO )
    throws EPPIXSeriousException, EPPIXObjectExpiredException,
      EPPIXObjectNotFoundException {
    logger.debug( "modify( aNextPrnDMO )" );

    thrower.ifParameterMissing( 
      "aNextPrnDMO",
      nextPrnDMO );

    dao.update( nextPrnDMO, "NONE", new DAOArgs( 0 ) );
  }

  /**
   * Deletes the NextPrn object from the database.
   *
   * @param NextPrnDMO NextPrn object
   *
   * @throws EPPIXSeriousException
   * @throws EPPIXObjectNotFoundException
   * @throws EPPIXObjectExpiredException
   */
  public void delete( NextPrnDMO nextPrnDMO )
    throws EPPIXSeriousException, EPPIXObjectNotFoundException,
      EPPIXObjectExpiredException {
    logger.debug( "delete( NextPrnDMO )" );

    thrower.ifParameterMissing( 
      "NextPrnDMO",
      nextPrnDMO );

    dao.delete( nextPrnDMO );
  }

  /**
  * Return true if a NextPrn object exists.
  *
  * @param NextPrnDMO NextPrnDMO
  *
  * @return true if the NextPrn object exists.
  *
  * @throws EPPIXSeriousException
  */
  public boolean exists( NextPrnDMO NextPrnDMO )
    throws EPPIXSeriousException {
    logger.debug( "exists( NextPrnDMO)" );

    return dao.exists( 
      "NextPrn",
      "filterByPrimaryKey",
      new DAOArgs( 0 ) );
  }

  /**
   * Return a list of location objects matching the passed in values. A
   * partial match is performed on the description argument. If no language
   * Code is passed inside the locationDMO then the language passed in the
   * EppixLocale object is used.
   *
   * @param state previous state of the list.
   * @param locationDMO NextPrn Data Model Object
   *
   * @return DTOList of NextPrn Data Model Objects.
   *
   * @throws EPPIXSeriousException
   */
  public DTOList getList( 
    DTOListState state,
    NextPrnDMO   nextPrnDMO )
    throws EPPIXSeriousException {
    logger.debug( "getList( state, nextPrnDMO )" );

    return dao.getListAbs( 
      state,
      paramQueryArgs( nextPrnDMO ) );
  }

  /**
   * Constructs parameterised query arguments.
   *
   * @param $(dataObjectNameLowerCamel} NextPrnDMO object.
   */
  private DAOParamQueryArgs paramQueryArgs( NextPrnDMO nextPrnDMO ) {
    logger.debug( "paramQueryArgs( nextPrnDMO)" );

    DAOParamQueryArgs queryArgs = new DAOParamQueryArgs( "NextPrn", 1 * 2 );

    if ( nextPrnDMO != null ) {
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
    QueryFilter       filter )
    throws EPPIXSeriousException {
    logger.debug( "getList( state, filter )" );

    return dao.getListAbs( 
      state,
      filterQueryArgs( filter ) );
  }

  private DAOParamQueryArgs filterQueryArgs( QueryFilter filter ) {
    List parts = (List)filter.getParts(  );
    DAOParamQueryArgs queryArgs = new DAOParamQueryArgs( "NextPrn",
        parts.size(  ) );
    
    Iterator it = parts.iterator();
    	while(it.hasNext()){
    		FilterPart part = (FilterPart)it.next();
    		switch ( part.getIndex(  ) ) {
            case NextPrnDMO.nextPrnFilter:
              part.andFilterBy( 
                queryArgs,
                "NextPrn" );

              break;
          }
    	}

//    for ( FilterPart part : parts ) {
//      switch ( part.getIndex(  ) ) {
//        case NextPrnDMO.nextPrnFilter:
//          part.andFilterBy( 
//            queryArgs,
//            "NextPrn" );
//
//          break;
//      }
//    }

    return queryArgs;
  }
}
