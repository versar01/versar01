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

import com.eppixcomm.eppix.common.data.DAC;
import com.eppixcomm.eppix.common.data.DAO;
import com.eppixcomm.eppix.common.data.DAOIterator;
import com.eppixcomm.eppix.common.data.DAOParamQueryArgs;
import com.eppixcomm.eppix.common.data.DMO;

//import java.util.*;
import com.eppixcomm.eppix.common.util.QueryFilter;
import com.eppixcomm.eppix.common.data.DTOActionTypes;
import com.eppixcomm.eppix.base.error.EPPIXBusinessException;
import com.eppixcomm.eppix.base.error.EPPIXException;
import com.eppixcomm.eppix.base.error.EPPIXFatalException;
import com.eppixcomm.eppix.base.error.EPPIXObjectNotFoundException;
import com.eppixcomm.eppix.base.error.EPPIXSeriousException;
import com.eppixcomm.eppix.base.error.EPPIXUnexpectedException;
import com.eppixcomm.eppix.base.error.Thrower;
import com.eppixcomm.eppix.common.util.Date;
import com.eppixcomm.eppix.common.util.DateTime;
import com.eppixcomm.eppix.common.util.Time;

import org.apache.log4j.Logger;

import java.math.BigDecimal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * Used to hold all types of addresses.
 * <p>
 *   Currently holds addresses for the customer and the subscriber.
 
 The addresses held can be defined by the
 *   administrator. The types of address are defined in tt_text with a group of \"ADDRESSTYP\" and the behaviour of these
 *   addresses is defined in auc_address_config. There are several hardcoded address types. These are defined in the normal
 *   way but have a special meaning to the system.
 
 Each customer points to one of his addresses through the
 *   aux_invoice_addrid on aux_customers. For this reason care must be taken when deleting entries from this table. 
 
 See
 *   diagram \"Address Book - All Tables\" earlier in this document.
 * </p>
 *
 * This abstract business logic class holds all the logic for the AudAddress class.
 * It is extended by AudAddress class which holds the additional logic that is required, if any.
 *
 * @author
 * @version $Revision: $
 *
 * @since $jdk$
 */
public abstract class AudAddressAbstractBLO
  extends BaseBLO
  implements DTOActionTypes, BaseMessages {
  //~ Static variables/initializers //////////////////////////////////////////

  /** DOCUMENT ME! */
  static Thrower thrower = Thrower.getThrower( AudAddressAbstractBLO.class );
  /** DOCUMENT ME! */
  protected static final String ENTITY_ID = "AUD";

  //~ Instance variables /////////////////////////////////////////////////////

  /** Data Access Controller. */
  protected AudAddressAbstractDAC audAddressDAC;
  /** DOCUMENT ME! */
  protected Logger logger = thrower.getLogger(  );

  //~ Methods ////////////////////////////////////////////////////////////////

  /** Invoked by the BLOBinder to provide this BLO with its DAC. */
  protected void setDAC( DAC dac ) {
    this.audAddressDAC = (AudAddressAbstractDAC) dac;
  }

  /**
  * Retrieve a audAddress data model object from persistent storage. The
  * audAddressDMO passed in must contain a valid existing audAddressId.
  * Optionally, the return audAddressDMO may be include a flag that indicates if
  * the audAddress object is referenced elsewhere within the module, depending on the value
  * of the getIsUsed parameter. Finally, optionally, this method can return the set of audit
  * records for the audAddress object depending on the value of the getAudits parameter.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *   <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#AUDADDRESS_000}</li>
  *   <li> The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl><br>
  *
  * @param  audAddressDMO the audAddress object that must contain either the
  *         unique audAddressId or the displayCode/languageCode pair
  *
  * @return audAddressDMO the audAddress data model object
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXFatalException
  * @throws EPPIXUnexpectedException
  */
  public AudAddressDMO get( AudAddressDMO audAddressDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "get(audAddressDMO)" );

    //
    // Check mandatory parameters.
    //
    thrower.ifParameterMissing( "audAddressDMO", audAddressDMO );

    //
    // Each attribute that is part of the primary key is mandatory
    //
    thrower.ifParameterMissing( "audAddressDMO.audAddrid",
      audAddressDMO.getAudAddrid(  ) );

    //
    // Attempt to get the AudAddressDMO
    //
    AudAddressDMO returnAudAddressDMO = audAddressDAC.get( audAddressDMO );

    //
    // Could not find the AudAddressDMO
    //
    if ( returnAudAddressDMO == null ) {
      thrower.business( Base_AUDADDRESS_000,
        new Object[] { audAddressDMO.getAudAddrid(  ) } );
    }

    //
    // Now, based on the values of the flags on this method signature, which in turn,
    // are based on this objects associations, get all associated, embedded objects
    //
    return returnAudAddressDMO;
  }

  /**
   * Return a list of AudAddress objects matching the passed in values. A
   * partial match is performed on the description argument and/or the audAddresss
   * displayCode. If no values have been passed in, all AudAddress objects are
   * retrieved. Note: if a language specific description does not exist, then
   * the AudAddress is retrieved with the special 'NOCODE' description.
   *
   * @param state previous state of the list
   * @param audAddressDMO AudAddressDMO object
   *
   * @return DTOList of AudAddress objects
   *
   * @throws EPPIXUnexpectedException
   */
//  public DTOList<AudAddressDMO> getList( 
//    DTOListState  state,
//    AudAddressDMO audAddressDMO )
//    throws EPPIXBusinessException, EPPIXUnexpectedException,
//      EPPIXFatalException {
//    logger.debug( "getList( state, audAddressDMO )" );
//
//    return audAddressDAC.getList( state, audAddressDMO );
//  }

  /**
  * Creates the AudAddress object. As a side effect, following creation
  * of a audAddress an audit object may be created.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param audAddressDMO audAddressDMO object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated audAddressDMO object.
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public AudAddressDMO create( AudAddressDMO audAddressDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "create( audAddressDMO )" );

    thrower.ifParameterMissing( "audAddressDMO", audAddressDMO );

    // Set generated key to 0
    audAddressDMO.setAudAddrid( Integer.valueOf(0));

    thrower.ifParameterMissing( "audAddressDMO.audAccountNo",
      audAddressDMO.getAudAccountNo(  ) );

    thrower.ifParameterMissing( "audAddressDMO.audAddressType",
      audAddressDMO.getAudAddressType(  ) );

    //
    // Now create the audAddress
    //
    audAddressDMO = audAddressDAC.create( audAddressDMO );

    return audAddressDMO;
  }

  /**
  * Modifies the AudAddress object. On any modification, an audit object
  * is created.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#AUDADDRESS_002}</li>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param audAddressDMO audAddressDMO object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated audAddressDMO object.
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public AudAddressDMO modify( AudAddressDMO aAudAddressDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "modify( aaudAddressDMO )" );

    //
    // Check mandatory parameters (
    //
    // Note: attributes stereotyped <NotModifiable> are ignored
    //
    thrower.ifParameterMissing( "aaudAddressDMO", aAudAddressDMO );

    thrower.ifParameterMissing( "aAudAddressDMO.audAddrid",
      aAudAddressDMO.getAudAddrid(  ) ); // attribute

    thrower.ifParameterMissing( "aAudAddressDMO.audAccountNo",
      aAudAddressDMO.getAudAccountNo(  ) ); // attribute

    thrower.ifParameterMissing( "aAudAddressDMO.audAddressType",
      aAudAddressDMO.getAudAddressType(  ) ); // attribute

    AudAddressDMO updateAudAddressDMO = new AudAddressDMO(  );

    updateAudAddressDMO.setAudAddrid( aAudAddressDMO.getAudAddrid(  ) );

    updateAudAddressDMO = get( updateAudAddressDMO );

    //
    // For each relationship to single objects (does not matter if they are Embedded or Flattened)
    // either associate to a pre-existing object, or create an object then associate to it
    //

    //
    // Copy the fields to be updated. We do not want to overwrite primary keys etc.
    // All attributes stereotyped as being <NotModifiable> are skipped
    //
    updateAudAddressDMO.setAudAccountNo( aAudAddressDMO.getAudAccountNo(  ) );

    updateAudAddressDMO.setAudSubscriberId( aAudAddressDMO.getAudSubscriberId(  ) );

    updateAudAddressDMO.setAudAddressType( aAudAddressDMO.getAudAddressType(  ) );

    updateAudAddressDMO.setAudInDate( aAudAddressDMO.getAudInDate(  ) );

    updateAudAddressDMO.setAudInvEffDate( aAudAddressDMO.getAudInvEffDate(  ) );

    updateAudAddressDMO.setAudClassification( aAudAddressDMO
      .getAudClassification(  ) );

    updateAudAddressDMO.setAudUniqueId( aAudAddressDMO.getAudUniqueId(  ) );

    updateAudAddressDMO.setAudName( aAudAddressDMO.getAudName(  ) );

    updateAudAddressDMO.setAudAddress1( aAudAddressDMO.getAudAddress1(  ) );

    updateAudAddressDMO.setAudAddress2( aAudAddressDMO.getAudAddress2(  ) );

    updateAudAddressDMO.setAudAddress3( aAudAddressDMO.getAudAddress3(  ) );

    updateAudAddressDMO.setAudAddress4( aAudAddressDMO.getAudAddress4(  ) );

    updateAudAddressDMO.setAudAddress5( aAudAddressDMO.getAudAddress5(  ) );

    updateAudAddressDMO.setAudAddress6( aAudAddressDMO.getAudAddress6(  ) );

    updateAudAddressDMO.setAudPostcode( aAudAddressDMO.getAudPostcode(  ) );

    updateAudAddressDMO.setAudTelephoneNo( aAudAddressDMO.getAudTelephoneNo(  ) );

    updateAudAddressDMO.setAudTelephoneNo2( aAudAddressDMO.getAudTelephoneNo2(  ) );

    updateAudAddressDMO.setAudFaxNo( aAudAddressDMO.getAudFaxNo(  ) );

    updateAudAddressDMO.setAudContact( aAudAddressDMO.getAudContact(  ) );

    updateAudAddressDMO.setAudEMail( aAudAddressDMO.getAudEMail(  ) );

    updateAudAddressDMO.setAudNotes( aAudAddressDMO.getAudNotes(  ) );

    updateAudAddressDMO.setAudGeneral1( aAudAddressDMO.getAudGeneral1(  ) );

    updateAudAddressDMO.setAudGeneral2( aAudAddressDMO.getAudGeneral2(  ) );

    updateAudAddressDMO.setAudGeneral3( aAudAddressDMO.getAudGeneral3(  ) );

    //
    // Modify the audAddressDMO
    //
    audAddressDAC.modify( updateAudAddressDMO );

    // Create a new DMO, set keys, and fetch from the database...
    AudAddressDMO returnAudAddressDMO = new AudAddressDMO(  );

    returnAudAddressDMO.setAudAddrid( updateAudAddressDMO.getAudAddrid(  ) );

    returnAudAddressDMO = get( returnAudAddressDMO );

    return returnAudAddressDMO;
  }

  /**
  * Modifies the AudAddress object.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#ECEVENTCOMMAND_002}</li>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param AudAddressDMO object<br>
  * @param filter object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated audAddressDMO object.
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public void modify( QueryFilter filter )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "modify( filter )" );

    //
    // Modify the audAddressDMO
    //
    audAddressDAC.modify( filter );
  }

  /**
   * Deletes the AudAddress object. On deletion, an audit object is created
   * <p>
   * <B>Possible application exceptions:</B>
   * <dl><dd>Base_AUDADDRESS_003
   *     <li>{@link #Base#AUDADDRESS_000} if the AudAddress does not exist.</li>
   *     <li>{@link #Base#AUDADDRESS_003} if the AudAddress is in use.</li>
   *     <li>The normal general errors:
   *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
   * </dd></dl>
   *  @param AudAddressDMO AudAddress object with embedded displayCode and
   *        languageCode.
   *
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public void delete( AudAddressDMO audAddressDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "delete( audAddressDMO )" );

    thrower.ifParameterMissing( "audAddressDMO", audAddressDMO );

    AudAddressDMO updateAudAddressDMO = null;

    updateAudAddressDMO = get( audAddressDMO );

    // delete self...
    audAddressDAC.delete( audAddressDMO );
  }

  /**
   * Deletes the AudAddress object.
   * <p>
   * <B>Possible application exceptions:</B>
   * <dl><dd>
   *     <li>The normal general errors:
   *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
   * </dd></dl>
   *  @param QueryFilter filter.
   *
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public void delete( QueryFilter filter )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "delete( filter )" );

    thrower.ifParameterMissing( "filter", filter );

    // delete...
    audAddressDAC.delete( filter );
  }

  /**
  * Indicates whether a AudAddress exists in the database
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl>
  *
  *
  * @return true if the AudAddress exists in the database
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public boolean exists( AudAddressDMO audAddressDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "exists(audAddress)" );

    thrower.ifParameterMissing( "audAddressDMO", audAddressDMO );

    thrower.ifParameterMissing( "audAddressDMO.audAddrid",
      audAddressDMO.getAudAddrid(  ) );

    return audAddressDAC.exists( audAddressDMO );
  }

  /**
   * Indicates whether a AudAddress exists in the database
   * <p>
   * <B>Possible application exceptions:</B>
   * <dl><dd>
   *     <li>The normal general errors:
   *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
   * </dd></dl>
   *
   *
   * @return true if the AudAddress exists in the database
   *
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public boolean exists( QueryFilter filter )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "exists(filter)" );

    return audAddressDAC.exists( filter );
  }

  //---------------------------------------------------------------------------------------------------------
  /**
   * DOCUMENT ME!
   *
   * @param state DOCUMENT ME!
   * @param filter DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   *
   * @throws EPPIXBusinessException DOCUMENT ME!
   * @throws EPPIXUnexpectedException DOCUMENT ME!
   * @throws EPPIXFatalException DOCUMENT ME!
   */
//  public DTOList<AudAddressDMO> getList( 
//    DTOListState state,
//    QueryFilter  filter )
//    throws EPPIXBusinessException, EPPIXUnexpectedException,
//      EPPIXFatalException {
//    logger.debug( "getList( state, filter )" );
//
//    return audAddressDAC.getList( state, filter );
//  }

  /**
   * DOCUMENT ME!
   *
   * @param filter DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   *
   * @throws EPPIXBusinessException DOCUMENT ME!
   * @throws EPPIXUnexpectedException DOCUMENT ME!
   * @throws EPPIXFatalException DOCUMENT ME!
   */
  public DAOIterator iterate( QueryFilter filter )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "iterate( filter )" );

    return audAddressDAC.iterate( filter );
  }

  /**
   * DOCUMENT ME!
   *
   * @param filter DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   *
   * @throws EPPIXBusinessException DOCUMENT ME!
   * @throws EPPIXUnexpectedException DOCUMENT ME!
   * @throws EPPIXFatalException DOCUMENT ME!
   */
  public DAOIterator iterateWithLock( QueryFilter filter )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "iterateWithLock( filter )" );

    return audAddressDAC.iterateWithLock( filter );
  }

  /**
   * DOCUMENT ME!
   *
   * @param filter DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   *
   * @throws EPPIXBusinessException DOCUMENT ME!
   * @throws EPPIXUnexpectedException DOCUMENT ME!
   * @throws EPPIXFatalException DOCUMENT ME!
   */
  public AudAddressDMO get( QueryFilter filter )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "get( filter )" );

    //
    // Check mandatory parameters.
    //
    thrower.ifParameterMissing( "filter", filter );

    //
    // Attempt to get the AudAddressDMO
    //
    AudAddressDMO audAddressDMO = audAddressDAC.get( filter );

    return audAddressDMO;
  }

  /**
   * DOCUMENT ME!
   *
   * @param filter DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   *
   * @throws EPPIXBusinessException DOCUMENT ME!
   * @throws EPPIXUnexpectedException DOCUMENT ME!
   * @throws EPPIXFatalException DOCUMENT ME!
   */
  public Object max( QueryFilter filter )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "max( filter )" );

    //
    // Check mandatory parameters.
    //
    thrower.ifParameterMissing( "filter", filter );

    return audAddressDAC.max( filter );
  }

  /**
   * DOCUMENT ME!
   *
   * @param filter DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   *
   * @throws EPPIXBusinessException DOCUMENT ME!
   * @throws EPPIXUnexpectedException DOCUMENT ME!
   * @throws EPPIXFatalException DOCUMENT ME!
   */
  public Object min( QueryFilter filter )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "min( filter )" );

    //
    // Check mandatory parameters.
    //
    thrower.ifParameterMissing( "filter", filter );

    return audAddressDAC.min( filter );
  }

  /**
   * Counts the number of rows for the specified filter.
   *
   * @param filter the query filter
   * @return the count of rows.
   *
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public Integer count( QueryFilter filter )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "count( filter )" );

    //
    // Check mandatory parameters.
    //
    thrower.ifParameterMissing( "filter", filter );

    return Integer.valueOf(audAddressDAC.count( filter ));
  }
  
  public AudAddressDMO getUniqueAudByMaxId(String accountNumber, String addressType)throws EPPIXSeriousException{
		if(logger.isDebugEnabled()){
			logger.debug("Account number: " + accountNumber);
		}

	    // Check mandatory parameters.
	    thrower.ifParameterMissing( "accountNumber", accountNumber );
	    thrower.ifParameterMissing( "addressType", addressType );
		
		return (AudAddressDMO)audAddressDAC.getUniqueAudByMaxId(accountNumber, addressType);
  }
  
  /** Invoked by the BLOBinder to get the DAC class for this BLO. */
  protected Class getDACClass(  ) {
    return AudAddress.class;
  }
  
}
