package com.eppixcomm.eppix.base.blo;

import java.util.Iterator;
import java.util.List;

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
import com.eppixcomm.eppix.common.util.DateTime;

public class NtpNetTransPendAbstractDACImpl extends DAC implements NtpNetTransPendAbstractDAC{

	  /** Error handler/logger. */
	static DAOThrower thrower = DAOThrower.getDAOThrower( NmNetmatAbstractDACImpl.class );
	

	protected NtpNetTransPendAbstractDACImpl(DAOThrower thrower, DAO dao, String defaultLanguageCode) {
		super(thrower, dao, defaultLanguageCode);
		// TODO Auto-generated constructor stub
	}
	
	public NtpNetTransPendAbstractDACImpl(DAO dao){
		super(dao, thrower);
	}

	  /**
	   * Retrieves a NtpNetTransPend Data Model Object
	   *
	   * @return a populated NtpNetTransPend Data Model Object or null if not found.
	   *
	   * @throws EPPIXSeriousException
	   */
	  public NtpNetTransPendDMO get( NtpNetTransPendDMO ntpNetTransPendDMO )
	    throws EPPIXSeriousException {
	    logger.debug( "get( NtpNetTransPendDMO )" );

	    thrower.ifParameterMissing( "NtpNetTransPendDMO", ntpNetTransPendDMO );

	    return (NtpNetTransPendDMO) dao.get( ntpNetTransPendDMO );
	  }

	  /**
	   * Creates the NtpNetTransPend object in the database.
	   *
	   * @param NtpNetTransPendDMO ntpNetTransPendDMO
	   *
	   * @throws EPPIXSeriousException
	   */
	  public void create( NtpNetTransPendDMO ntpNetTransPendDMO )
	    throws EPPIXSeriousException {
	    logger.debug( "create( ntpNetTransPendDMO )" );
	    thrower.ifParameterMissing( "NtpNetTransPendDMO", ntpNetTransPendDMO );

	    dao.insert( ntpNetTransPendDMO );
	  }

	  /**
	   * Locks and retrieves the NtpNetTransPend object from the database.
	   *
	   * @param aNtpNetTransPend NtpNetTransPend object
	   *
	   * @return a populated NtpNetTransPend object or null if not found.
	   *
	   * @throws EPPIXSeriousException
	   */
	  public NtpNetTransPendDMO lock( NtpNetTransPendDMO aNtpNetTransPendDMO )
	    throws EPPIXSeriousException, EPPIXObjectBusyException {
	    logger.debug( "lock( aNtpNetTransPendDMO )" );

	    thrower.ifParameterMissing( "aNtpNetTransPendDMO", aNtpNetTransPendDMO );

	    NtpNetTransPendDMO lockedNtpNetTransPendDMO = null;

	    //
	    // Lock the base table on its primary key.
	    //
	    lockedNtpNetTransPendDMO = (NtpNetTransPendDMO) dao.lock( "NtpNetTransPend",
	        "filterByPrimaryKey",
	        new DAOArgs( 1 ).arg( aNtpNetTransPendDMO.getNtpSerialId()));

	    return lockedNtpNetTransPendDMO;
	  }

	  /**
	   * Modifies the NtpNetTransPend object in the database.
	   *
	   * @param NtpNetTransPendDMO NtpNetTransPend object
	   *
	   * @throws EPPIXSeriousException
	   * @throws EPPIXObjectExpiredException
	   * @throws EPPIXObjectNotFoundException
	   */
	  public void modify( NtpNetTransPendDMO ntpNetTransPendDMO )
	    throws EPPIXSeriousException, EPPIXObjectExpiredException,
	      EPPIXObjectNotFoundException {
	    logger.debug( "modify( aNtpNetTransPendDMO )" );

	    thrower.ifParameterMissing( "aNtpNetTransPendDMO", ntpNetTransPendDMO );

	    thrower.ifParameterMissing( "NtpNetTransPendDMO.ntpSerialId",
	      ntpNetTransPendDMO.getNtpSerialId());

	    dao.update( ntpNetTransPendDMO );
	  }

	  /**
	  * Modifies the NtpNetTransPend object using the specified filter in the database.
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

	    dao.updateCustom( new NtpNetTransPendDMO(  ), filterQueryArgs( filter, null ) );
	  }

	  /**
	   * Deletes the NtpNetTransPend object from the database.
	   *
	   * @param NtpNetTransPendDMO NtpNetTransPend object
	   *
	   * @throws EPPIXSeriousException
	   * @throws EPPIXObjectNotFoundException
	   * @throws EPPIXObjectExpiredException
	   */
	  public void delete( NtpNetTransPendDMO ntpNetTransPendDMO )
	    throws EPPIXSeriousException, EPPIXObjectNotFoundException,
	      EPPIXObjectExpiredException {
	    logger.debug( "delete( NtpNetTransPendDMO )" );

	    thrower.ifParameterMissing( "NtpNetTransPendDMO", ntpNetTransPendDMO );

	    thrower.ifParameterMissing( "NtpNetTransPendDMO.ntpSerialId",
	      ntpNetTransPendDMO.getNtpSerialId() );

	    dao.delete( ntpNetTransPendDMO );
	  }

	  /**
	   * Deletes the NtpNetTransPend object from the database.
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

	    dao.delete( "NtpNetTransPend", args.getFilterBy(  ), args );
	  }

	  /**
	  * Return true if a NtpNetTransPend object exists.
	  *
	  * @param NtpNetTransPendDMO NtpNetTransPendDMO
	  *
	  * @return true if the NtpNetTransPend object exists.
	  *
	  * @throws EPPIXSeriousException
	  */
	  public boolean exists( NtpNetTransPendDMO NtpNetTransPendDMO )
	    throws EPPIXSeriousException {
	    logger.debug( "exists( NtpNetTransPendDMO)" );

	    return dao.exists( "NtpNetTransPend", "filterByPrimaryKey",
	      new DAOArgs( 1 ).arg( NtpNetTransPendDMO.getNtpSerialId()));
	  }

	  /**
	    * Return true if a NtpNetTransPend object exists.
	    *
	    * @param filter
	    *
	    * @return true if the NtpNetTransPend object exists.
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
	   * @param locationDMO NtpNetTransPend Data Model Object
	   *
	   * @return DTOList of NtpNetTransPend Data Model Objects.
	   *
	   * @throws EPPIXSeriousException
	   */
	  public DTOList getList( 
	    NtpNetTransPendDMO ntpNetTransPendDMO )
	    throws EPPIXSeriousException {
	    logger.debug( "getList( state, ntpNetTransPendDMO )" );

	    return new DTOList(dao.getList( paramQueryArgs( ntpNetTransPendDMO)));
	  }

	  /**
	   * Constructs parameterised query arguments.
	   *
	   * @param $(dataObjectNameLowerCamel} NtpNetTransPendDMO object.
	   */
	  protected DAOParamQueryArgs paramQueryArgs( 
	    NtpNetTransPendDMO ntpNetTransPendDMO ) {
	    logger.debug( "paramQueryArgs( ntpNetTransPendDMO)" );

	    DAOParamQueryArgs queryArgs = new DAOParamQueryArgs( "NtpNetTransPend",
	        10 * 2 );

	    if ( ntpNetTransPendDMO != null ) {
	      // primary key filters...
	      Integer serialId = ntpNetTransPendDMO.getNtpSerialId();

	      if ( !DMO.isNull( serialId)) {
	        queryArgs.andFilterBy( "SerialIdMatch" )
	                 .arg( serialId + dao.wildcardForAnySequence(  ) );
	      }

	      // define more filters...
	      String ntpCommand = ntpNetTransPendDMO.getNtpCommand();

	      if ( !DMO.isNull( ntpCommand ) ) {
	        queryArgs.andFilterBy( "NtpCommandMatch" )
	                 .arg( ntpCommand + dao.wildcardForAnySequence(  ) );
	      }
	      
	      Integer ntpSendSeq = ntpNetTransPendDMO.getNtpSendSeq();

	      if ( !DMO.isNull( ntpSendSeq ) ) {
	        queryArgs.andFilterBy( "NtpSendSeqMatch" )
	                 .arg( ntpSendSeq + dao.wildcardForAnySequence(  ) );
	      }

	      String ntpTranType = ntpNetTransPendDMO.getNtpTranType();

	      if ( !DMO.isNull( ntpTranType ) ) {
	        queryArgs.andFilterBy( "NtpTranTypeMatch" )
	                 .arg( ntpTranType + dao.wildcardForAnySequence());
	      }

	      Integer ntpSubscriberId = ntpNetTransPendDMO.getNtpSubscriberId();

	      if ( !DMO.isNull( ntpSubscriberId ) ) {
	        queryArgs.andFilterBy( "NtpSubscriberIdMatch" )
	                 .arg( ntpSubscriberId + dao.wildcardForAnySequence(  ) );
	      }

	      String ntpOldValue = ntpNetTransPendDMO.getNtpOldValue();

	      if ( !DMO.isNull( ntpOldValue ) ) {
	        queryArgs.andFilterBy( "NtpOldValueMatch" )
	                 .arg( ntpOldValue + dao.wildcardForAnySequence(  ) );
	      }

	      String ntpNewValue = ntpNetTransPendDMO.getNtpNewValue();

	      if ( !DMO.isNull( ntpNewValue ) ) {
	        queryArgs.andFilterBy( "NtpNewValueMatch" )
	                 .arg( ntpNewValue + dao.wildcardForAnySequence(  ) );
	      }

	      String ntpServiceCode = ntpNetTransPendDMO.getNtpServiceCode();

	      if ( !DMO.isNull( ntpServiceCode ) ) {
	        queryArgs.andFilterBy( "NtpServiceCodeMatch" )
	                 .arg( ntpServiceCode + dao.wildcardForAnySequence(  ) );
	      }

	      String ntpStatus = ntpNetTransPendDMO.getNtpStatus();

	      if ( !DMO.isNull( ntpStatus ) ) {
	        queryArgs.andFilterBy( "NtpStatusMatch" )
	                 .arg( ntpStatus + dao.wildcardForAnySequence(  ) );
	      }

	      DateTime ntpTimestamp = ntpNetTransPendDMO.getNtpTimestamp();

	      if ( !DMO.isNull( ntpTimestamp ) ) {
	        queryArgs.andFilterBy( "NtpTimestampMatch" )
	                 .arg( ntpTimestamp + dao.wildcardForAnySequence(  ) );
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
	    QueryFilter  filter )
	    throws EPPIXSeriousException {
	    logger.debug( "getList( filter )" );

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
	        ? "NtpNetTransPend" : dmlName, parts.size() );

	    Iterator it = parts.iterator();
	    
	    while(it.hasNext()){
	    	FilterPart part = (FilterPart)it.next();
//	    for ( FilterPart part : parts ) {
    	
	      switch ( part.getIndex(  ) ) {
	        case NtpNetTransPendDMO.ntpSerialIdFilter:
	          part.andFilterBy( queryArgs, "NtpSerialId",
	            dao.wildcardForAnySequence(  ) );

	          break;

	        case NtpNetTransPendDMO.ntpCommandFilter:
	          part.andFilterBy( queryArgs, "NtpCommand",
	            dao.wildcardForAnySequence(  ) );

	          break;

	        case NtpNetTransPendDMO.ntpSendSeqFilter:
	          part.andFilterBy( queryArgs, "NtpSendSeq",
	            dao.wildcardForAnySequence(  ) );

	          break;
	          
	        // Field did not exists fixed on 29-10-2010  
	        case NtpNetTransPendDMO.ntpTranTypeFilter:
		          part.andFilterBy( queryArgs, "ntpTranType",
		            dao.wildcardForAnySequence(  ) );

		          break;	          

	        case NtpNetTransPendDMO.ntpSubscriberIdFilter:
	          part.andFilterBy( queryArgs, "NtpSubscriberId",
	            dao.wildcardForAnySequence(  ) );

	          break;

	        case NtpNetTransPendDMO.ntpOldValueFilter:
	          part.andFilterBy( queryArgs, "NtpOldValue",
	            dao.wildcardForAnySequence(  ) );

	          break;

	        case NtpNetTransPendDMO.ntpNewValueFilter:
	          part.andFilterBy( queryArgs, "NtpNewValue",
	            dao.wildcardForAnySequence(  ) );

	          break;

	        case NtpNetTransPendDMO.ntpServiceCodeFilter:
	          part.andFilterBy( queryArgs, "NtpServiceCode",
	            dao.wildcardForAnySequence());
	          break;

	        case NtpNetTransPendDMO.ntpStatusFilter:
	          part.andFilterBy( queryArgs, "NtpStatus", dao.wildcardForAnySequence(  ) );

	          break;

	        case NtpNetTransPendDMO.ntpTimestampFilter:
	          part.andFilterBy( queryArgs, "NtpStimestamp",
	            dao.wildcardForAnySequence(  ) );

	          break;
	      }
	    }

	    return queryArgs;
	  }

	  /**
	  * Provides a DAOIterator to iterate over the list of NtpNetTransPend records based
	  * on the passed in Filter.
	  *
	  * @param filter
	  * @return
	  * @throws EPPIXSeriousException
	  */
	  public DAOIterator iterate( QueryFilter filter )
	    throws EPPIXSeriousException {
	    logger.debug( "iterate( filter )" );

	    return dao.iterator(filterQueryArgs( filter, null ), false );
	  }

	  /**
	  * Provides a DAOIterator to iterate using a "FOR UPDATE", over the list of NtpNetTransPend records based
	  * on the passed in Filter.
	  *
	  * @param filter
	  * @return
	  * @throws EPPIXSeriousException
	  * @{@link Deprecated}
	  */
	  public DAOIterator iterateWithLock( QueryFilter filter )
	    throws EPPIXSeriousException {
	    logger.debug( "iterateWithLock( filter )" );

	    return dao.iterator(filterQueryArgs( filter, null ), false );
	  }

	  /**
	   * Retrieves the NtpNetTransPend Data Model Object from a possible list.
	   *
	   * @param filter
	   * @return
	   * @throws EPPIXSeriousException
	   */
	  public NtpNetTransPendDMO get( QueryFilter filter )
	    throws EPPIXSeriousException {
	    logger.debug( "get( filter )" );

	    DAOParamQueryArgs args = filterQueryArgs( filter, null );

	    return (NtpNetTransPendDMO) dao.get( args.getDMLName(  ),
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
