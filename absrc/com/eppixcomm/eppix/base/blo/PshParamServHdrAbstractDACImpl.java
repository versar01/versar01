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
 * PshParamServHdr Business Object.
 *
 * @version $Revision: 1.2 $
 * @author $Author$
 * @since $jdk$
 */
public class PshParamServHdrAbstractDACImpl
  extends DAC
  implements PshParamServHdrAbstractDAC {
  //~ Static variables/initializers //////////////////////////////////////////

  /** Error handler/logger. */
  static DAOThrower thrower = DAOThrower.getDAOThrower( PshParamServHdrAbstractDACImpl.class );

  //~ Instance variables /////////////////////////////////////////////////////

  /** DOCUMENT ME! */
  Logger logger = thrower.getLogger(  );

  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new PshParamServHdrDACImpl object.
   *
   * @param dao Data Access Object.
   * @param defaultLanguageCode the working language of the user, dictates
   *        which language specific descriptions are retrieved.
   */
  public PshParamServHdrAbstractDACImpl(DAO dao ) {
    super( dao, thrower );
  }

  //~ Methods ////////////////////////////////////////////////////////////////

  /**
   * Retrieves a PshParamServHdr Data Model Object
   *
   * @return a populated PshParamServHdr Data Model Object or null if not found.
   *
   * @throws EPPIXSeriousException
   */
  public PshParamServHdrDMO get( PshParamServHdrDMO pshParamServHdrDMO )
    throws EPPIXSeriousException {
    logger.debug( "get( PshParamServHdrDMO )" );

    thrower.ifParameterMissing( "PshParamServHdrDMO", pshParamServHdrDMO );

    return (PshParamServHdrDMO) dao.get( pshParamServHdrDMO );
  }

  /**
   * Creates the PshParamServHdr object in the database.
   *
   * @param PshParamServHdrDMO pshParamServHdrDMO
   *
   * @throws EPPIXSeriousException
   */
  public PshParamServHdrDMO create( PshParamServHdrDMO pshParamServHdrDMO )
    throws EPPIXSeriousException {
    logger.debug( "create( pshParamServHdrDMO )" );
    thrower.ifParameterMissing( "PshParamServHdrDMO", pshParamServHdrDMO );

    dao.insert( pshParamServHdrDMO );

    // return the data with key
    return pshParamServHdrDMO;
  }

  /**
   * Locks and retrieves the PshParamServHdr object from the database.
   *
   * @param aPshParamServHdr PshParamServHdr object
   *
   * @return a populated PshParamServHdr object or null if not found.
   *
   * @throws EPPIXSeriousException
   */
  public PshParamServHdrDMO lock( PshParamServHdrDMO aPshParamServHdrDMO )
    throws EPPIXSeriousException, EPPIXObjectBusyException {
    logger.debug( "lock( aPshParamServHdrDMO )" );

    thrower.ifParameterMissing( "aPshParamServHdrDMO", aPshParamServHdrDMO );

    PshParamServHdrDMO lockedPshParamServHdrDMO = null;

    //
    // Lock the base table on its primary key.
    //
    lockedPshParamServHdrDMO = (PshParamServHdrDMO) dao.lock( "PshParamServHdr",
        "filterByPrimaryKey",
        new DAOArgs( 1 ).arg( aPshParamServHdrDMO.getPshId(  ) ) );

    return lockedPshParamServHdrDMO;
  }

  /**
   * Modifies the PshParamServHdr object in the database.
   *
   * @param PshParamServHdrDMO PshParamServHdr object
   *
   * @throws EPPIXSeriousException
   * @throws EPPIXObjectExpiredException
   * @throws EPPIXObjectNotFoundException
   */
  public void modify( PshParamServHdrDMO pshParamServHdrDMO )
    throws EPPIXSeriousException, EPPIXObjectExpiredException,
      EPPIXObjectNotFoundException {
    logger.debug( "modify( aPshParamServHdrDMO )" );

    thrower.ifParameterMissing( "aPshParamServHdrDMO", pshParamServHdrDMO );

    thrower.ifParameterMissing( "PshParamServHdrDMO.pshId",
      pshParamServHdrDMO.getPshId(  ) );

    dao.update( pshParamServHdrDMO );
  }

  /**
  * Modifies the PshParamServHdr object using the specified filter in the database.
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

    dao.updateCustom( new PshParamServHdrDMO(  ),
      filterQueryArgs( filter, null ) );
  }

  /**
   * Deletes the PshParamServHdr object from the database.
   *
   * @param PshParamServHdrDMO PshParamServHdr object
   *
   * @throws EPPIXSeriousException
   * @throws EPPIXObjectNotFoundException
   * @throws EPPIXObjectExpiredException
   */
  public void delete( PshParamServHdrDMO pshParamServHdrDMO )
    throws EPPIXSeriousException, EPPIXObjectNotFoundException,
      EPPIXObjectExpiredException {
    logger.debug( "delete( PshParamServHdrDMO )" );

    thrower.ifParameterMissing( "PshParamServHdrDMO", pshParamServHdrDMO );

    thrower.ifParameterMissing( "PshParamServHdrDMO.pshId",
      pshParamServHdrDMO.getPshId(  ) );

    dao.delete( pshParamServHdrDMO );
  }

  /**
   * Deletes the PshParamServHdr object from the database.
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

    dao.delete( "PshParamServHdr", args.getFilterBy(  ), args );
  }

  /**
  * Return true if a PshParamServHdr object exists.
  *
  * @param PshParamServHdrDMO PshParamServHdrDMO
  *
  * @return true if the PshParamServHdr object exists.
  *
  * @throws EPPIXSeriousException
  */
  public boolean exists( PshParamServHdrDMO PshParamServHdrDMO )
    throws EPPIXSeriousException {
    logger.debug( "exists( PshParamServHdrDMO)" );

    return dao.exists( "PshParamServHdr", "filterByPrimaryKey",
      new DAOArgs( 1 ).arg( PshParamServHdrDMO.getPshId(  ) ) );
  }

  /**
    * Return true if a PshParamServHdr object exists.
    *
    * @param filter
    *
    * @return true if the PshParamServHdr object exists.
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
   * @param locationDMO PshParamServHdr Data Model Object
   *
   * @return DTOList of PshParamServHdr Data Model Objects.
   *
   * @throws EPPIXSeriousException
   */
  public DTOList getList( 
    DTOListState       state,
    PshParamServHdrDMO pshParamServHdrDMO )
    throws EPPIXSeriousException {
    logger.debug( "getList( state, pshParamServHdrDMO )" );

    return new DTOList(dao.getList(paramQueryArgs( pshParamServHdrDMO)));
  }

  /**
   * Constructs parameterised query arguments.
   *
   * @param $(dataObjectNameLowerCamel} PshParamServHdrDMO object.
   */
  protected DAOParamQueryArgs paramQueryArgs( 
    PshParamServHdrDMO pshParamServHdrDMO ) {
    logger.debug( "paramQueryArgs( pshParamServHdrDMO)" );

    DAOParamQueryArgs queryArgs = new DAOParamQueryArgs( "PshParamServHdr",
        6 * 2 );

    if ( pshParamServHdrDMO != null ) {
      // primary key filters...
      Integer pshId = pshParamServHdrDMO.getPshId(  );

      if ( !DMO.isNull( pshId ) ) {
        queryArgs.andFilterBy( "PshId" )
                 .arg( pshId );
      }

      // define more filters...
      String pshServiceCode = pshParamServHdrDMO.getPshServiceCode(  );

      if ( !DMO.isNull( pshServiceCode ) ) {
        queryArgs.andFilterBy( "PshServiceCodeMatch" )
                 .arg( pshServiceCode + dao.wildcardForAnySequence(  ) );
      }

      String pshSimNo = pshParamServHdrDMO.getPshSimNo(  );

      if ( !DMO.isNull( pshSimNo ) ) {
        queryArgs.andFilterBy( "PshSimNoMatch" )
                 .arg( pshSimNo + dao.wildcardForAnySequence(  ) );
      }

      String pshMsisdnNo = pshParamServHdrDMO.getPshMsisdnNo(  );

      if ( !DMO.isNull( pshMsisdnNo ) ) {
        queryArgs.andFilterBy( "PshMsisdnNoMatch" )
                 .arg( pshMsisdnNo + dao.wildcardForAnySequence(  ) );
      }

      String pshArchived = pshParamServHdrDMO.getPshArchived(  );

      if ( !DMO.isNull( pshArchived ) ) {
        queryArgs.andFilterBy( "PshArchivedMatch" )
                 .arg( pshArchived + dao.wildcardForAnySequence(  ) );
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

    return new DTOList(dao.getList( filterQueryArgs( filter, null )));
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
        ? "PshParamServHdr" : dmlName, parts.size(  ) );

    Iterator it = parts.iterator();
    	while(it.hasNext()){
    		FilterPart part = (FilterPart)it.next();
//    for ( FilterPart part : parts ) {
      switch ( part.getIndex(  ) ) {
        case PshParamServHdrDMO.pshIdFilter:
          part.andFilterBy( queryArgs, "PshId", dao.wildcardForAnySequence(  ) );

          break;

        case PshParamServHdrDMO.pshServiceCodeFilter:
          part.andFilterBy( queryArgs, "PshServiceCode",
            dao.wildcardForAnySequence(  ) );

          break;

        case PshParamServHdrDMO.pshSubscriberIdFilter:
          part.andFilterBy( queryArgs, "PshSubscriberId",
            dao.wildcardForAnySequence(  ) );

          break;

        case PshParamServHdrDMO.pshSimNoFilter:
          part.andFilterBy( queryArgs, "PshSimNo",
            dao.wildcardForAnySequence(  ) );

          break;

        case PshParamServHdrDMO.pshMsisdnNoFilter:
          part.andFilterBy( queryArgs, "PshMsisdnNo",
            dao.wildcardForAnySequence(  ) );

          break;

        case PshParamServHdrDMO.pshArchivedFilter:
          part.andFilterBy( queryArgs, "PshArchived",
            dao.wildcardForAnySequence(  ) );

          break;
      }
    }

    return queryArgs;
  }

  /**
  * Provides a DAOIterator to iterate over the list of PshParamServHdr records based
  * on the passed in Filter.
  *
  * @param filter
  * @return
  * @throws EPPIXSeriousException
  * TODO SJ Fixme
  */
  public DAOIterator iterate( QueryFilter filter )
    throws EPPIXSeriousException {
    logger.debug( "iterate( filter )" );

    return dao.iterator(filterQueryArgs( filter, null ) );
//    return null;
  }

  /**
  * Provides a DAOIterator to iterate using a "FOR UPDATE", over the list of PshParamServHdr records based
  * on the passed in Filter.
  *
  * @param filter
  * @return
  * @throws EPPIXSeriousException
  * TODO SJ Fixme
  * 
  */
  public DAOIterator iterateWithLock( QueryFilter filter )
    throws EPPIXSeriousException {
    logger.debug( "iterateWithLock( filter )" );

    return dao.iterator( filterQueryArgs( filter, null ), true );
//    return null;
  }

  /**
   * Retrieves the PshParamServHdr Data Model Object from a possible list.
   *
   * @param filter
   * @return
   * @throws EPPIXSeriousException
   */
  public PshParamServHdrDMO get( QueryFilter filter )
    throws EPPIXSeriousException {
    logger.debug( "get( filter )" );

    DAOParamQueryArgs args = filterQueryArgs( filter, null );

    return (PshParamServHdrDMO) dao.get( args.getDMLName(  ),
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

