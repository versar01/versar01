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
 * PsdParamServDet Business Object.
 *
 * @version $Revision: 1.2 $
 * @author $Author$
 * @since $jdk$
 */
public class PsdParamServDetAbstractDACImpl
  extends DAC
  implements PsdParamServDetAbstractDAC {
  //~ Static variables/initializers //////////////////////////////////////////

  /** Error handler/logger. */
  static DAOThrower thrower = DAOThrower.getDAOThrower( PsdParamServDetAbstractDACImpl.class );

  //~ Instance variables /////////////////////////////////////////////////////

  /** DOCUMENT ME! */
  Logger logger = thrower.getLogger(  );

  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new PsdParamServDetDACImpl object.
   *
   * @param dao Data Access Object.
   * @param defaultLanguageCode the working language of the user, dictates
   *        which language specific descriptions are retrieved.
   */
  public PsdParamServDetAbstractDACImpl( 
    DAO         dao ) {
    super( dao, thrower );
  }

  //~ Methods ////////////////////////////////////////////////////////////////

  /**
   * Retrieves a PsdParamServDet Data Model Object
   *
   * @return a populated PsdParamServDet Data Model Object or null if not found.
   *
   * @throws EPPIXSeriousException
   */
  public PsdParamServDetDMO get( PsdParamServDetDMO psdParamServDetDMO )
    throws EPPIXSeriousException {
    logger.debug( "get( PsdParamServDetDMO )" );

    thrower.ifParameterMissing( "PsdParamServDetDMO", psdParamServDetDMO );

    PsdParamServDetDMO psdDMO = null;
    try {
    	psdDMO =  (PsdParamServDetDMO) dao.get(psdParamServDetDMO);
	} catch (NullPointerException e) {
		e.printStackTrace();
	}
    
    return psdDMO;
    
  }

  /**
   * Creates the PsdParamServDet object in the database.
   *
   * @param PsdParamServDetDMO psdParamServDetDMO
   *
   * @throws EPPIXSeriousException
   */
  public void create( PsdParamServDetDMO psdParamServDetDMO )
    throws EPPIXSeriousException {
    logger.debug( "create( psdParamServDetDMO )" );
    thrower.ifParameterMissing( "PsdParamServDetDMO", psdParamServDetDMO );

    dao.insert( psdParamServDetDMO );
  }

  /**
   * Locks and retrieves the PsdParamServDet object from the database.
   *
   * @param aPsdParamServDet PsdParamServDet object
   *
   * @return a populated PsdParamServDet object or null if not found.
   *
   * @throws EPPIXSeriousException
   */
  public PsdParamServDetDMO lock( PsdParamServDetDMO aPsdParamServDetDMO )
    throws EPPIXSeriousException, EPPIXObjectBusyException {
    logger.debug( "lock( aPsdParamServDetDMO )" );

    thrower.ifParameterMissing( "aPsdParamServDetDMO", aPsdParamServDetDMO );

    PsdParamServDetDMO lockedPsdParamServDetDMO = null;

    //
    // Lock the base table on its primary key.
    //
    lockedPsdParamServDetDMO = (PsdParamServDetDMO) dao.lock( "PsdParamServDet",
        "filterByPrimaryKey",
        new DAOArgs( 2 ).arg( aPsdParamServDetDMO.getPsdPshId(  ) ).arg( aPsdParamServDetDMO
          .getPsdParamId(  ) ) );

    return lockedPsdParamServDetDMO;
  }

  /**
   * Modifies the PsdParamServDet object in the database.
   *
   * @param PsdParamServDetDMO PsdParamServDet object
   *
   * @throws EPPIXSeriousException
   * @throws EPPIXObjectExpiredException
   * @throws EPPIXObjectNotFoundException
   */
  public void modify( PsdParamServDetDMO psdParamServDetDMO )
    throws EPPIXSeriousException, EPPIXObjectExpiredException,
      EPPIXObjectNotFoundException {
    logger.debug( "modify( aPsdParamServDetDMO )" );

    thrower.ifParameterMissing( "aPsdParamServDetDMO", psdParamServDetDMO );

    thrower.ifParameterMissing( "PsdParamServDetDMO.psdPshId",
      psdParamServDetDMO.getPsdPshId(  ) );

    thrower.ifParameterMissing( "PsdParamServDetDMO.psdParamId",
      psdParamServDetDMO.getPsdParamId(  ) );

    dao.update( psdParamServDetDMO );
  }

  /**
  * Modifies the PsdParamServDet object using the specified filter in the database.
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

    dao.updateCustom( new PsdParamServDetDMO(  ),
      filterQueryArgs( filter, null ) );
  }

  /**
   * Deletes the PsdParamServDet object from the database.
   *
   * @param PsdParamServDetDMO PsdParamServDet object
   *
   * @throws EPPIXSeriousException
   * @throws EPPIXObjectNotFoundException
   * @throws EPPIXObjectExpiredException
   */
  public void delete( PsdParamServDetDMO psdParamServDetDMO )
    throws EPPIXSeriousException, EPPIXObjectNotFoundException,
      EPPIXObjectExpiredException {
    logger.debug( "delete( PsdParamServDetDMO )" );

    thrower.ifParameterMissing( "PsdParamServDetDMO", psdParamServDetDMO );

    thrower.ifParameterMissing( "PsdParamServDetDMO.psdPshId",
      psdParamServDetDMO.getPsdPshId(  ) );

    thrower.ifParameterMissing( "PsdParamServDetDMO.psdParamId",
      psdParamServDetDMO.getPsdParamId(  ) );

    dao.delete( psdParamServDetDMO );
  }

  /**
   * Deletes the PsdParamServDet object from the database.
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

    dao.delete( "PsdParamServDet", args.getFilterBy(  ), args );
  }

  /**
  * Return true if a PsdParamServDet object exists.
  *
  * @param PsdParamServDetDMO PsdParamServDetDMO
  *
  * @return true if the PsdParamServDet object exists.
  *
  * @throws EPPIXSeriousException
  */
  public boolean exists( PsdParamServDetDMO PsdParamServDetDMO )
    throws EPPIXSeriousException {
    logger.debug( "exists( PsdParamServDetDMO)" );

    return dao.exists( "PsdParamServDet", "filterByPrimaryKey",
      new DAOArgs( 3 ).arg( PsdParamServDetDMO.getPsdSerialId()).arg( PsdParamServDetDMO.getPsdPshId(  ) ).arg( PsdParamServDetDMO
        .getPsdParamId(  ) ) );
  }

  /**
    * Return true if a PsdParamServDet object exists.
    *
    * @param filter
    *
    * @return true if the PsdParamServDet object exists.
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
   * @param locationDMO PsdParamServDet Data Model Object
   *
   * @return DTOList of PsdParamServDet Data Model Objects.
   *
   * @throws EPPIXSeriousException
   */
  public DTOList getList( 
    DTOListState       state,
    PsdParamServDetDMO psdParamServDetDMO )
    throws EPPIXSeriousException {
    logger.debug( "getList( state, psdParamServDetDMO )" );

    return new DTOList(dao.getList( paramQueryArgs( psdParamServDetDMO )));
  }

  /**
   * Constructs parameterised query arguments.
   *
   * @param $(dataObjectNameLowerCamel} PsdParamServDetDMO object.
   */
  protected DAOParamQueryArgs paramQueryArgs( 
    PsdParamServDetDMO psdParamServDetDMO ) {
    logger.debug( "paramQueryArgs( psdParamServDetDMO)" );

    DAOParamQueryArgs queryArgs = new DAOParamQueryArgs( "PsdParamServDet",
       13 * 2 );

    if ( psdParamServDetDMO != null ) {

	      Integer PsdSerialId = psdParamServDetDMO.getPsdSerialId();

	      if ( !DMO.isNull( PsdSerialId ) ) {
	        queryArgs.andFilterBy( "PsdSerialIdMatch" )
	                 .arg( PsdSerialId );
	      }


	      Integer PsdPshId = psdParamServDetDMO.getPsdPshId();

	      if ( !DMO.isNull( PsdPshId ) ) {
	        queryArgs.andFilterBy( "PsdPshIdMatch" )
	                 .arg( PsdPshId );
	      }


	      Integer PsdParamId = psdParamServDetDMO.getPsdParamId();

	      if ( !DMO.isNull( PsdParamId ) ) {
	        queryArgs.andFilterBy( "PsdParamIdMatch" )
	                 .arg( PsdParamId );
	      }


	      Date PsdActDate = psdParamServDetDMO.getPsdActDate();

	      if ( !DMO.isNull( PsdActDate ) ) {
	        queryArgs.andFilterBy( "PsdActDateMatch" )
	                 .arg( PsdActDate );
	      }


	      Date PsdTermDate = psdParamServDetDMO.getPsdTermDate();

	      if ( !DMO.isNull( PsdTermDate ) ) {
	        queryArgs.andFilterBy( "PsdTermDateMatch" )
	                 .arg( PsdTermDate );
	      }


	      String PsdParamValue = psdParamServDetDMO.getPsdParamValue();

	      if ( !DMO.isNull( PsdParamValue ) ) {
	        queryArgs.andFilterBy( "PsdParamValueMatch" )
	                 .arg( PsdParamValue );
	      }


	      String PsdN2nString = psdParamServDetDMO.getPsdN2nString();

	      if ( !DMO.isNull( PsdN2nString ) ) {
	        queryArgs.andFilterBy( "PsdN2nStringMatch" )
	                 .arg( PsdN2nString );
	      }


	      String PsdParamActive = psdParamServDetDMO.getPsdParamActive();

	      if ( !DMO.isNull( PsdParamActive ) ) {
	        queryArgs.andFilterBy( "PsdParamActiveMatch" )
	                 .arg( PsdParamActive );
	      }


	      Date PsdDeacDate = psdParamServDetDMO.getPsdDeacDate();

	      if ( !DMO.isNull( PsdDeacDate ) ) {
	        queryArgs.andFilterBy( "PsdDeacDateMatch" )
	                 .arg( PsdDeacDate );
	      }


	      String PsdSubCharge = psdParamServDetDMO.getPsdSubCharge();

	      if ( !DMO.isNull( PsdSubCharge ) ) {
	        queryArgs.andFilterBy( "PsdSubChargeMatch" )
	                 .arg( PsdSubCharge );
	      }


	      Double PsdChgValue = psdParamServDetDMO.getPsdChgValue();

	      if ( !DMO.isNull( PsdChgValue ) ) {
	        queryArgs.andFilterBy( "PsdChgValueMatch" )
	                 .arg( PsdChgValue );
	      }
	      
	      String PsdActType = psdParamServDetDMO.getPsdActType();

	      if ( !DMO.isNull( PsdActType ) ) {
	        queryArgs.andFilterBy( "PsdActTypeMatch" )
	                 .arg( PsdActType );
	      }

	      Date ActionDate = psdParamServDetDMO.getPsdActionDate();

	      if ( !DMO.isNull( ActionDate ) ) {
	        queryArgs.andFilterBy( "ActionDateMatch" )
	                 .arg( ActionDate );
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
        ? "PsdParamServDet" : dmlName, parts.size(  ) );

    Iterator it = parts.iterator();
    while(it.hasNext()){
    	FilterPart part = (FilterPart)it.next();
//    for ( FilterPart part : parts ) {
      switch ( part.getIndex(  ) ) {
        
    	case PsdParamServDetDMO.psdSerialIdFilter:
            part.andFilterBy( queryArgs, "PsdSerialId",
              dao.wildcardForAnySequence(  ) );

            break;
            
      	case PsdParamServDetDMO.psdPshIdFilter:
          part.andFilterBy( queryArgs, "PsdPshId",
            dao.wildcardForAnySequence(  ) );

          break;

        case PsdParamServDetDMO.psdParamIdFilter:
          part.andFilterBy( queryArgs, "PsdParamId",
            dao.wildcardForAnySequence(  ) );

          break;

        case PsdParamServDetDMO.psdActDateFilter:
            part.andFilterBy( queryArgs, "PsdActDate",
              dao.wildcardForAnySequence(  ) );

            break;
            
        case PsdParamServDetDMO.psdTermDateFilter:
            part.andFilterBy( queryArgs, "PsdTermDate",
              dao.wildcardForAnySequence(  ) );

            break;            
          
        case PsdParamServDetDMO.psdParamValueFilter:
          part.andFilterBy( queryArgs, "PsdParamValue",
            dao.wildcardForAnySequence(  ) );

          break;
          
        case PsdParamServDetDMO.psdN2nStringFilter:
            part.andFilterBy( queryArgs, "PsdN2nString",
              dao.wildcardForAnySequence(  ) );

            break;
            
        case PsdParamServDetDMO.psdParamActiveFilter:
            part.andFilterBy( queryArgs, "PsdParamActive",
              dao.wildcardForAnySequence(  ) );

            break;
            
        case PsdParamServDetDMO.psdDeacDateFilter:
            part.andFilterBy( queryArgs, "PsdDeacDate",
              dao.wildcardForAnySequence(  ) );

            break;
            
        case PsdParamServDetDMO.psdSubChargeFilter:
            part.andFilterBy( queryArgs, "PsdSubCharge",
              dao.wildcardForAnySequence(  ) );

            break;   
            
        case PsdParamServDetDMO.psdActTypeFilter:
            part.andFilterBy( queryArgs, "PsdActType",
              dao.wildcardForAnySequence(  ) );

            break;
            
        case PsdParamServDetDMO.psdActionDateFilter:
            part.andFilterBy( queryArgs, "PsdActionDate",
              dao.wildcardForAnySequence(  ) );

            break;  
      }
    }

    return queryArgs;
  }

  /**
  * Provides a DAOIterator to iterate over the list of PsdParamServDet records based
  * on the passed in Filter.
  *
  * @param filter
  * @return
  * @throws EPPIXSeriousException
  * TODO SJ FIXME
  */
  public DAOIterator iterate( QueryFilter filter )
    throws EPPIXSeriousException {
    logger.debug( "iterate( filter )" );

    return dao.iterator(filterQueryArgs( filter, null ) );

  }

  /**
  * Provides a DAOIterator to iterate using a "FOR UPDATE", over the list of PsdParamServDet records based
  * on the passed in Filter.
  *
  * @param filter
  * @return
  * @throws EPPIXSeriousException
  * TODO SJ FIXME
  */
  public DAOIterator iterateWithLock( QueryFilter filter )
    throws EPPIXSeriousException {
    logger.debug( "iterateWithLock( filter )" );

    return dao.iterator(filterQueryArgs( filter, null ), true );

  }

  /**
   * Retrieves the PsdParamServDet Data Model Object from a possible list.
   *
   * @param filter
   * @return
   * @throws EPPIXSeriousException
   */
  public PsdParamServDetDMO get( QueryFilter filter )
    throws EPPIXSeriousException {
    logger.debug( "get( filter )" );

    DAOParamQueryArgs args = filterQueryArgs( filter, null );

    return (PsdParamServDetDMO) dao.get( args.getDMLName(  ),
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
