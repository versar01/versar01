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
import com.eppixcomm.eppix.base.error.EPPIXObjectBusyException;
import com.eppixcomm.eppix.base.error.EPPIXObjectExpiredException;
import com.eppixcomm.eppix.base.error.EPPIXObjectNotFoundException;
import com.eppixcomm.eppix.base.error.EPPIXSeriousException;

/**
 * This is the standard implementation of the Data Access Controller for the
 * AudAddress Business Object.
 *
 * @version $Revision: 1.2 $
 * @author $Author$
 * @since $jdk$
 */
public class AudAddressAbstractDACImpl
  extends DAC
  implements AudAddressAbstractDAC {
  //~ Static variables/initializers //////////////////////////////////////////

  /** Error handler/logger. */
  static DAOThrower thrower = DAOThrower.getDAOThrower( AudAddressAbstractDACImpl.class );

  //~ Instance variables /////////////////////////////////////////////////////

  /** DOCUMENT ME! */
  Logger logger = thrower.getLogger(  );

  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new AudAddressDACImpl object.
   *
   * @param dao Data Access Object.
   * @param defaultLanguageCode the working language of the user, dictates
   *        which language specific descriptions are retrieved.
   */
  public AudAddressAbstractDACImpl( 
    DAO         dao ) {
    super( dao, thrower );
  }

  //~ Methods ////////////////////////////////////////////////////////////////

  /**
   * Retrieves a AudAddress Data Model Object
   *
   * @return a populated AudAddress Data Model Object or null if not found.
   *
   * @throws EPPIXSeriousException
   */
  public AudAddressDMO get( AudAddressDMO audAddressDMO )
    throws EPPIXSeriousException {
    logger.debug( "get( AudAddressDMO )" );

    thrower.ifParameterMissing( "AudAddressDMO", audAddressDMO );

    return (AudAddressDMO) dao.get( audAddressDMO );
  }

  /**
   * Creates the AudAddress object in the database.
   *
   * @param AudAddressDMO audAddressDMO
   *
   * @throws EPPIXSeriousException
   */
  public AudAddressDMO create( AudAddressDMO audAddressDMO )
    throws EPPIXSeriousException {
    logger.debug( "create( audAddressDMO )" );
    thrower.ifParameterMissing( "AudAddressDMO", audAddressDMO );

    dao.insert( audAddressDMO );

    // return the data with key
    return audAddressDMO;
  }

  /**
   * Locks and retrieves the AudAddress object from the database.
   *
   * @param aAudAddress AudAddress object
   *
   * @return a populated AudAddress object or null if not found.
   *
   * @throws EPPIXSeriousException
   */
  public AudAddressDMO lock( AudAddressDMO aAudAddressDMO )
    throws EPPIXSeriousException, EPPIXObjectBusyException {
    logger.debug( "lock( aAudAddressDMO )" );

    thrower.ifParameterMissing( "aAudAddressDMO", aAudAddressDMO );

    AudAddressDMO lockedAudAddressDMO = null;

    //
    // Lock the base table on its primary key.
    //
    lockedAudAddressDMO = (AudAddressDMO) dao.lock( "AudAddress",
        "filterByPrimaryKey",
        new DAOArgs( 1 ).arg( aAudAddressDMO.getAudAddrid(  ) ) );

    return lockedAudAddressDMO;
  }

  /**
   * Modifies the AudAddress object in the database.
   *
   * @param AudAddressDMO AudAddress object
   *
   * @throws EPPIXSeriousException
   * @throws EPPIXObjectExpiredException
   * @throws EPPIXObjectNotFoundException
   */
  public void modify( AudAddressDMO audAddressDMO )
    throws EPPIXSeriousException, EPPIXObjectExpiredException,
      EPPIXObjectNotFoundException {
    logger.debug( "modify( aAudAddressDMO )" );

    thrower.ifParameterMissing( "aAudAddressDMO", audAddressDMO );

    thrower.ifParameterMissing( "AudAddressDMO.audAddrid",
      audAddressDMO.getAudAddrid(  ) );

    dao.update( audAddressDMO );
  }

  /**
  * Modifies the AudAddress object using the specified filter in the database.
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

    dao.updateCustom( new AudAddressDMO(  ), filterQueryArgs( filter, null ) );
  }

  /**
   * Deletes the AudAddress object from the database.
   *
   * @param AudAddressDMO AudAddress object
   *
   * @throws EPPIXSeriousException
   * @throws EPPIXObjectNotFoundException
   * @throws EPPIXObjectExpiredException
   */
  public void delete( AudAddressDMO audAddressDMO )
    throws EPPIXSeriousException, EPPIXObjectNotFoundException,
      EPPIXObjectExpiredException {
    logger.debug( "delete( AudAddressDMO )" );

    thrower.ifParameterMissing( "AudAddressDMO", audAddressDMO );

    thrower.ifParameterMissing( "AudAddressDMO.audAddrid",
      audAddressDMO.getAudAddrid(  ) );

    dao.delete( audAddressDMO );
  }

  /**
   * Deletes the AudAddress object from the database.
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

    dao.delete( "AudAddress", args.getFilterBy(  ), args );
  }

  /**
  * Return true if a AudAddress object exists.
  *
  * @param AudAddressDMO AudAddressDMO
  *
  * @return true if the AudAddress object exists.
  *
  * @throws EPPIXSeriousException
  */
  public boolean exists( AudAddressDMO AudAddressDMO )
    throws EPPIXSeriousException {
    logger.debug( "exists( AudAddressDMO)" );

    return dao.exists( "AudAddress", "filterByPrimaryKey",
      new DAOArgs( 1 ).arg( AudAddressDMO.getAudAddrid(  ) ) );
  }

  /**
    * Return true if a AudAddress object exists.
    *
    * @param filter
    *
    * @return true if the AudAddress object exists.
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
   * @param locationDMO AudAddress Data Model Object
   *
   * @return DTOList of AudAddress Data Model Objects.
   *
   * @throws EPPIXSeriousException
   */
//  public DTOList<AudAddressDMO> getList( 
//    DTOListState  state,
//    AudAddressDMO audAddressDMO )
//    throws EPPIXSeriousException {
//    logger.debug( "getList( state, audAddressDMO )" );
//
//    return dao.getListAbs( state, paramQueryArgs( audAddressDMO ) );
//  }

  /**
   * Constructs parameterised query arguments.
   *
   * @param $(dataObjectNameLowerCamel} AudAddressDMO object.
   */
  protected DAOParamQueryArgs paramQueryArgs( AudAddressDMO audAddressDMO ) {
    logger.debug( "paramQueryArgs( audAddressDMO)" );

    DAOParamQueryArgs queryArgs = new DAOParamQueryArgs( "AudAddress", 25 * 2 );

    if ( audAddressDMO != null ) {
      // primary key filters...
      Integer audAddrid = audAddressDMO.getAudAddrid(  );

      if ( !DMO.isNull( audAddrid ) ) {
        queryArgs.andFilterBy( "AudAddrid" )
                 .arg( audAddrid );
      }

      // define more filters...
      String audAccountNo = audAddressDMO.getAudAccountNo(  );

      if ( !DMO.isNull( audAccountNo ) ) {
        queryArgs.andFilterBy( "AudAccountNoMatch" )
                 .arg( audAccountNo + dao.wildcardForAnySequence(  ) );
      }

      String audAddressType = audAddressDMO.getAudAddressType(  );

      if ( !DMO.isNull( audAddressType ) ) {
        queryArgs.andFilterBy( "AudAddressTypeMatch" )
                 .arg( audAddressType + dao.wildcardForAnySequence(  ) );
      }

      String audClassification = audAddressDMO.getAudClassification(  );

      if ( !DMO.isNull( audClassification ) ) {
        queryArgs.andFilterBy( "AudClassificationMatch" )
                 .arg( audClassification + dao.wildcardForAnySequence(  ) );
      }

      String audUniqueId = audAddressDMO.getAudUniqueId(  );

      if ( !DMO.isNull( audUniqueId ) ) {
        queryArgs.andFilterBy( "AudUniqueIdMatch" )
                 .arg( audUniqueId + dao.wildcardForAnySequence(  ) );
      }

      String audName = audAddressDMO.getAudName(  );

      if ( !DMO.isNull( audName ) ) {
        queryArgs.andFilterBy( "AudNameMatch" )
                 .arg( audName + dao.wildcardForAnySequence(  ) );
      }

      String audAddress1 = audAddressDMO.getAudAddress1(  );

      if ( !DMO.isNull( audAddress1 ) ) {
        queryArgs.andFilterBy( "AudAddress1Match" )
                 .arg( audAddress1 + dao.wildcardForAnySequence(  ) );
      }

      String audAddress2 = audAddressDMO.getAudAddress2(  );

      if ( !DMO.isNull( audAddress2 ) ) {
        queryArgs.andFilterBy( "AudAddress2Match" )
                 .arg( audAddress2 + dao.wildcardForAnySequence(  ) );
      }

      String audAddress3 = audAddressDMO.getAudAddress3(  );

      if ( !DMO.isNull( audAddress3 ) ) {
        queryArgs.andFilterBy( "AudAddress3Match" )
                 .arg( audAddress3 + dao.wildcardForAnySequence(  ) );
      }

      String audAddress4 = audAddressDMO.getAudAddress4(  );

      if ( !DMO.isNull( audAddress4 ) ) {
        queryArgs.andFilterBy( "AudAddress4Match" )
                 .arg( audAddress4 + dao.wildcardForAnySequence(  ) );
      }

      String audAddress5 = audAddressDMO.getAudAddress5(  );

      if ( !DMO.isNull( audAddress5 ) ) {
        queryArgs.andFilterBy( "AudAddress5Match" )
                 .arg( audAddress5 + dao.wildcardForAnySequence(  ) );
      }

      String audAddress6 = audAddressDMO.getAudAddress6(  );

      if ( !DMO.isNull( audAddress6 ) ) {
        queryArgs.andFilterBy( "AudAddress6Match" )
                 .arg( audAddress6 + dao.wildcardForAnySequence(  ) );
      }

      String audPostcode = audAddressDMO.getAudPostcode(  );

      if ( !DMO.isNull( audPostcode ) ) {
        queryArgs.andFilterBy( "AudPostcodeMatch" )
                 .arg( audPostcode + dao.wildcardForAnySequence(  ) );
      }

      String audTelephoneNo = audAddressDMO.getAudTelephoneNo(  );

      if ( !DMO.isNull( audTelephoneNo ) ) {
        queryArgs.andFilterBy( "AudTelephoneNoMatch" )
                 .arg( audTelephoneNo + dao.wildcardForAnySequence(  ) );
      }

      String audTelephoneNo2 = audAddressDMO.getAudTelephoneNo2(  );

      if ( !DMO.isNull( audTelephoneNo2 ) ) {
        queryArgs.andFilterBy( "AudTelephoneNo2Match" )
                 .arg( audTelephoneNo2 + dao.wildcardForAnySequence(  ) );
      }

      String audFaxNo = audAddressDMO.getAudFaxNo(  );

      if ( !DMO.isNull( audFaxNo ) ) {
        queryArgs.andFilterBy( "AudFaxNoMatch" )
                 .arg( audFaxNo + dao.wildcardForAnySequence(  ) );
      }

      String audContact = audAddressDMO.getAudContact(  );

      if ( !DMO.isNull( audContact ) ) {
        queryArgs.andFilterBy( "AudContactMatch" )
                 .arg( audContact + dao.wildcardForAnySequence(  ) );
      }

      String audEMail = audAddressDMO.getAudEMail(  );

      if ( !DMO.isNull( audEMail ) ) {
        queryArgs.andFilterBy( "AudEMailMatch" )
                 .arg( audEMail + dao.wildcardForAnySequence(  ) );
      }

      String audNotes = audAddressDMO.getAudNotes(  );

      if ( !DMO.isNull( audNotes ) ) {
        queryArgs.andFilterBy( "AudNotesMatch" )
                 .arg( audNotes + dao.wildcardForAnySequence(  ) );
      }

      String audGeneral1 = audAddressDMO.getAudGeneral1(  );

      if ( !DMO.isNull( audGeneral1 ) ) {
        queryArgs.andFilterBy( "AudGeneral1Match" )
                 .arg( audGeneral1 + dao.wildcardForAnySequence(  ) );
      }

      String audGeneral2 = audAddressDMO.getAudGeneral2(  );

      if ( !DMO.isNull( audGeneral2 ) ) {
        queryArgs.andFilterBy( "AudGeneral2Match" )
                 .arg( audGeneral2 + dao.wildcardForAnySequence(  ) );
      }

      String audGeneral3 = audAddressDMO.getAudGeneral3(  );

      if ( !DMO.isNull( audGeneral3 ) ) {
        queryArgs.andFilterBy( "AudGeneral3Match" )
                 .arg( audGeneral3 + dao.wildcardForAnySequence(  ) );
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
//  public DTOList<AudAddressDMO> getList( 
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
        ? "AudAddress" : dmlName, parts.size(  ) );

    for ( Iterator i = parts.iterator(); i.hasNext();) {
      FilterPart part = (FilterPart) i.next();
      
      switch ( part.getIndex(  ) ) {
        case AudAddressDMO.audAddridFilter:
          part.andFilterBy( queryArgs, "AudAddrid" );

          break;

        case AudAddressDMO.audAccountNoFilter:
          part.andFilterBy( queryArgs, "AudAccountNo",
            dao.wildcardForAnySequence(  ) );

          break;

        case AudAddressDMO.audSubscriberIdFilter:
          part.andFilterBy( queryArgs, "AudSubscriberId" );

          break;

        case AudAddressDMO.audAddressTypeFilter:
          part.andFilterBy( queryArgs, "AudAddressType",
            dao.wildcardForAnySequence(  ) );

          break;

        case AudAddressDMO.audInDateFilter:
          part.andFilterBy( queryArgs, "AudInDate" );

          break;

        case AudAddressDMO.audInvEffDateFilter:
          part.andFilterBy( queryArgs, "AudInvEffDate" );

          break;

        case AudAddressDMO.audClassificationFilter:
          part.andFilterBy( queryArgs, "AudClassification",
            dao.wildcardForAnySequence(  ) );

          break;

        case AudAddressDMO.audUniqueIdFilter:
          part.andFilterBy( queryArgs, "AudUniqueId",
            dao.wildcardForAnySequence(  ) );

          break;

        case AudAddressDMO.audNameFilter:
          part.andFilterBy( queryArgs, "AudName",
            dao.wildcardForAnySequence(  ) );

          break;

        case AudAddressDMO.audAddress1Filter:
          part.andFilterBy( queryArgs, "AudAddress1",
            dao.wildcardForAnySequence(  ) );

          break;

        case AudAddressDMO.audAddress2Filter:
          part.andFilterBy( queryArgs, "AudAddress2",
            dao.wildcardForAnySequence(  ) );

          break;

        case AudAddressDMO.audAddress3Filter:
          part.andFilterBy( queryArgs, "AudAddress3",
            dao.wildcardForAnySequence(  ) );

          break;

        case AudAddressDMO.audAddress4Filter:
          part.andFilterBy( queryArgs, "AudAddress4",
            dao.wildcardForAnySequence(  ) );

          break;

        case AudAddressDMO.audAddress5Filter:
          part.andFilterBy( queryArgs, "AudAddress5",
            dao.wildcardForAnySequence(  ) );

          break;

        case AudAddressDMO.audAddress6Filter:
          part.andFilterBy( queryArgs, "AudAddress6",
            dao.wildcardForAnySequence(  ) );

          break;

        case AudAddressDMO.audPostcodeFilter:
          part.andFilterBy( queryArgs, "AudPostcode",
            dao.wildcardForAnySequence(  ) );

          break;

        case AudAddressDMO.audTelephoneNoFilter:
          part.andFilterBy( queryArgs, "AudTelephoneNo",
            dao.wildcardForAnySequence(  ) );

          break;

        case AudAddressDMO.audTelephoneNo2Filter:
          part.andFilterBy( queryArgs, "AudTelephoneNo2",
            dao.wildcardForAnySequence(  ) );

          break;

        case AudAddressDMO.audFaxNoFilter:
          part.andFilterBy( queryArgs, "AudFaxNo",
            dao.wildcardForAnySequence(  ) );

          break;

        case AudAddressDMO.audContactFilter:
          part.andFilterBy( queryArgs, "AudContact",
            dao.wildcardForAnySequence(  ) );

          break;

        case AudAddressDMO.audEMailFilter:
          part.andFilterBy( queryArgs, "AudEMail",
            dao.wildcardForAnySequence(  ) );

          break;

        case AudAddressDMO.audNotesFilter:
          part.andFilterBy( queryArgs, "AudNotes",
            dao.wildcardForAnySequence(  ) );

          break;

        case AudAddressDMO.audGeneral1Filter:
          part.andFilterBy( queryArgs, "AudGeneral1",
            dao.wildcardForAnySequence(  ) );

          break;

        case AudAddressDMO.audGeneral2Filter:
          part.andFilterBy( queryArgs, "AudGeneral2",
            dao.wildcardForAnySequence(  ) );

          break;

        case AudAddressDMO.audGeneral3Filter:
          part.andFilterBy( queryArgs, "AudGeneral3",
            dao.wildcardForAnySequence(  ) );

          break;
      }
    }

    return queryArgs;
  }

  /**
  * Provides a DAOIterator to iterate over the list of AudAddress records based
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
  * Provides a DAOIterator to iterate using a "FOR UPDATE", over the list of AudAddress records based
  * on the passed in Filter.
  *
  * @param filter
  * @return
  * @throws EPPIXSeriousException
  */
  public DAOIterator iterateWithLock( QueryFilter filter )
    throws EPPIXSeriousException {
    logger.debug( "iterateWithLock( filter )" );

    return dao.iterator( filterQueryArgs( filter, null ), true );
  }

  /**
   * Retrieves the AudAddress Data Model Object from a possible list.
   *
   * @param filter
   * @return
   * @throws EPPIXSeriousException
   */
  public AudAddressDMO get( QueryFilter filter )
    throws EPPIXSeriousException {
    logger.debug( "get( filter )" );

    DAOParamQueryArgs args = filterQueryArgs( filter, null );

    return (AudAddressDMO) dao.get( args.getDMLName(  ),
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
  
  public AudAddressDMO getUniqueAudByMaxId(String accountNumber, String addressType)throws EPPIXSeriousException {
		if(logger.isDebugEnabled()){
			logger.debug("getUniqueAudByMaxId(" + accountNumber + ")");
		}
		
		DAOParamQueryArgs args = new DAOParamQueryArgs( "audAddress", 4);
		args.andFilterBy("getUniqueAudByMaxId").arg(accountNumber).arg(addressType).arg(accountNumber).arg(addressType);

//		return dao.getList("getEqCommandByPSID", args);
		return (AudAddressDMO)dao.get("getUniqueAudByMaxId", args);
}
  
}
