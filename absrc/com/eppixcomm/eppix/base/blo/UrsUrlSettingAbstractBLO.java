package com.eppixcomm.eppix.base.blo;


import com.eppixcomm.eppix.common.data.DAC;

import com.eppixcomm.eppix.common.data.DAOIterator;

import com.eppixcomm.eppix.common.data.DMO;


//import java.util.*;

import com.eppixcomm.eppix.common.util.QueryFilter;

import com.eppixcomm.eppix.common.data.DTOActionTypes;

//import com.eppixcomm.eppix.common.data.DTOList;

//import com.eppixcomm.eppix.common.data.DTOListState;

import com.eppixcomm.eppix.base.error.EPPIXBusinessException;

import com.eppixcomm.eppix.base.error.EPPIXException;

import com.eppixcomm.eppix.base.error.EPPIXFatalException;

import com.eppixcomm.eppix.base.error.EPPIXObjectNotFoundException;

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



public abstract class UrsUrlSettingAbstractBLO  extends BaseBLO  implements DTOActionTypes, BaseMessages {

  //~ Static variables/initializers //////////////////////////////////////////


  /** DOCUMENT ME! */

  static Thrower thrower = Thrower.getThrower( UrsUrlSettingAbstractBLO.class );

  /** DOCUMENT ME! */

  protected static final String ENTITY_ID = "URS";


  //~ Instance variables /////////////////////////////////////////////////////


  /** DOCUMENT ME! */

  protected Logger logger = thrower.getLogger(  );


  /** Data Access Controller. */

  protected UrsUrlSettingDAC ursUrlSettingDAC;


  //~ Methods ////////////////////////////////////////////////////////////////


  /** Invoked by the BLOBinder to provide this BLO with its DAC. */

  protected void setDAC( DAC dac ) {

    this.ursUrlSettingDAC = (UrsUrlSettingDAC) dac;

  }


  /**

  * Retrieve a ursUrlSetting data model object from persistent storage. The

  * ursUrlSettingDMO passed in must contain a valid existing ursUrlSettingId.

  * Optionally, the return ursUrlSettingDMO may be include a flag that indicates if

  * the ursUrlSetting object is referenced elsewhere within the module, depending on the value

  * of the getIsUsed parameter. Finally, optionally, this method can return the set of audit

  * records for the ursUrlSetting object depending on the value of the getAudits parameter.

  * <p>

  * <B>Possible application exceptions:</B>

  * <dl><dd>

  *   <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#URSURLSETTING_000}</li>

  *   <li> The normal general errors:

  *          {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>

  * </dd></dl><br>

  *

  * @param  ursUrlSettingDMO the ursUrlSetting object that must contain either the

  *         unique ursUrlSettingId or the displayCode/languageCode pair

  *

  * @return ursUrlSettingDMO the ursUrlSetting data model object

  *

  * @throws EPPIXBusinessException

  * @throws EPPIXFatalException

  * @throws EPPIXUnexpectedException

  */

  public UrsUrlSettingDMO get( UrsUrlSettingDMO ursUrlSettingDMO )

    throws EPPIXBusinessException, EPPIXUnexpectedException,

      EPPIXFatalException {

    logger.debug( "get(ursUrlSettingDMO)" );


    //

    // Check mandatory parameters.

    //

    thrower.ifParameterMissing( "ursUrlSettingDMO", ursUrlSettingDMO );


    //

    // Each attribute that is part of the primary key is mandatory

    //

    thrower.ifParameterMissing( "ursUrlSettingDMO.ursUrlCode",

      ursUrlSettingDMO.getUrsUrlCode(  ) );


    //

    // Attempt to get the UrsUrlSettingDMO

    //

    UrsUrlSettingDMO returnUrsUrlSettingDMO = ursUrlSettingDAC.get( ursUrlSettingDMO );


    //

    // Could not find the UrsUrlSettingDMO

    //

    if ( returnUrsUrlSettingDMO == null ) {

      thrower.business( Base_URSURLSETTING_000,

        new Object[] { ursUrlSettingDMO.getUrsUrlCode(  ) } );

    }


    //

    // Now, based on the values of the flags on this method signature, which in turn,

    // are based on this objects associations, get all associated, embedded objects

    //

    return returnUrsUrlSettingDMO;

  }


  /**

   * Return a list of UrsUrlSetting objects matching the passed in values. A

   * partial match is performed on the description argument and/or the ursUrlSettings

   * displayCode. If no values have been passed in, all UrsUrlSetting objects are

   * retrieved. Note: if a language specific description does not exist, then

   * the UrsUrlSetting is retrieved with the special 'NOCODE' description.

   *

   * @param state previous state of the list

   * @param ursUrlSettingDMO UrsUrlSettingDMO object

   *

   * @return DTOList of UrsUrlSetting objects

   *

   * @throws EPPIXUnexpectedException

   */

//  public DTOList<UrsUrlSettingDMO> getList(

//    DTOListState     state,

//    UrsUrlSettingDMO ursUrlSettingDMO )

//    throws EPPIXBusinessException, EPPIXUnexpectedException,

//      EPPIXFatalException {

//    logger.debug( "getList( state, ursUrlSettingDMO )" );

//

//    return ursUrlSettingDAC.getList( state, ursUrlSettingDMO );

//  }


  /**

  * Creates the UrsUrlSetting object. As a side effect, following creation

  * of a ursUrlSetting an audit object may be created.

  * <p>

  * <B>Possible application exceptions:</B>

  * <dl><dd>

  *     <li>The normal general errors:

  *          {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>

  * </dd></dl><br>

  * @param ursUrlSettingDMO ursUrlSettingDMO object<br>

  *   <dl><dd>

  *   </dd></dl><br>

  *

  * @return populated ursUrlSettingDMO object.

  *

  * @throws EPPIXBusinessException

  * @throws EPPIXUnexpectedException

  * @throws EPPIXFatalException

  */

  public UrsUrlSettingDMO create( UrsUrlSettingDMO ursUrlSettingDMO )

    throws EPPIXBusinessException, EPPIXUnexpectedException,

      EPPIXFatalException {

    logger.debug( "create( ursUrlSettingDMO )" );


    thrower.ifParameterMissing( "ursUrlSettingDMO", ursUrlSettingDMO );


    thrower.ifParameterMissing( "ursUrlSettingDMO.ursUrlCode",

      ursUrlSettingDMO.getUrsUrlCode(  ) );


    //

    // Check that this object does not already exist

    //

    if ( exists( ursUrlSettingDMO ) ) {

      thrower.business( Base_URSURLSETTING_001,

        new Object[] { ursUrlSettingDMO.getUrsUrlCode(  ) } );

    }


    //

    // Now create the ursUrlSetting

    //

    ursUrlSettingDAC.create( ursUrlSettingDMO );


    return ursUrlSettingDMO;

  }


  /**

  * Modifies the UrsUrlSetting object. On any modification, an audit object

  * is created.

  * <p>

  * <B>Possible application exceptions:</B>

  * <dl><dd>

  *     <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#URSURLSETTING_002}</li>

  *     <li>The normal general errors:

  *          {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>

  * </dd></dl><br>

  * @param ursUrlSettingDMO ursUrlSettingDMO object<br>

  *   <dl><dd>

  *   </dd></dl><br>

  *

  * @return populated ursUrlSettingDMO object.

  *

  * @throws EPPIXBusinessException

  * @throws EPPIXUnexpectedException

  * @throws EPPIXFatalException

  */

  public UrsUrlSettingDMO modify( UrsUrlSettingDMO aUrsUrlSettingDMO )

    throws EPPIXBusinessException, EPPIXUnexpectedException,

      EPPIXFatalException {

    logger.debug( "modify( aursUrlSettingDMO )" );


    //

    // Check mandatory parameters (

    //

    // Note: attributes stereotyped <NotModifiable> are ignored

    //

    thrower.ifParameterMissing( "aursUrlSettingDMO", aUrsUrlSettingDMO );


    thrower.ifParameterMissing( "aUrsUrlSettingDMO.ursUrlCode",

      aUrsUrlSettingDMO.getUrsUrlCode(  ) ); // attribute


    UrsUrlSettingDMO updateUrsUrlSettingDMO = new UrsUrlSettingDMO(  );


    updateUrsUrlSettingDMO.setUrsUrlCode( aUrsUrlSettingDMO.getUrsUrlCode(  ) );


    updateUrsUrlSettingDMO = get( updateUrsUrlSettingDMO );


    //

    // For each relationship to single objects (does not matter if they are Embedded or Flattened)

    // either associate to a pre-existing object, or create an object then associate to it

    //


    //

    // Copy the fields to be updated. We do not want to overwrite primary keys etc.

    // All attributes stereotyped as being <NotModifiable> are skipped

    //

    updateUrsUrlSettingDMO.setUrsValue( aUrsUrlSettingDMO.getUrsValue(  ) );


    updateUrsUrlSettingDMO.setUrsComment( aUrsUrlSettingDMO.getUrsComment(  ) );


    updateUrsUrlSettingDMO.setUrsTimestamp( aUrsUrlSettingDMO.getUrsTimestamp(  ) );


    //

    // Modify the ursUrlSettingDMO

    //

    ursUrlSettingDAC.modify( updateUrsUrlSettingDMO );


    // Create a new DMO, set keys, and fetch from the database...

    UrsUrlSettingDMO returnUrsUrlSettingDMO = new UrsUrlSettingDMO(  );


    returnUrsUrlSettingDMO.setUrsUrlCode( updateUrsUrlSettingDMO.getUrsUrlCode(  ) );


    returnUrsUrlSettingDMO = get( returnUrsUrlSettingDMO );


    return returnUrsUrlSettingDMO;

  }


  /**

  * Modifies the UrsUrlSetting object.

  * <p>

  * <B>Possible application exceptions:</B>

  * <dl><dd>

  *     <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#ECEVENTCOMMAND_002}</li>

  *     <li>The normal general errors:

  *          {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>

  * </dd></dl><br>

  * @param UrsUrlSettingDMO object<br>

  * @param filter object<br>

  *   <dl><dd>

  *   </dd></dl><br>

  *

  * @return populated ursUrlSettingDMO object.

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

    // Modify the ursUrlSettingDMO

    //

    ursUrlSettingDAC.modify( filter );

  }


  /**

   * Deletes the UrsUrlSetting object. On deletion, an audit object is created

   * <p>

   * <B>Possible application exceptions:</B>

   * <dl><dd>Base_URSURLSETTING_003

   *     <li>{@link #Base#URSURLSETTING_000} if the UrsUrlSetting does not exist.</li>

   *     <li>{@link #Base#URSURLSETTING_003} if the UrsUrlSetting is in use.</li>

   *     <li>The normal general errors:

   *          {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>

   * </dd></dl>

   *  @param UrsUrlSettingDMO UrsUrlSetting object with embedded displayCode and

   *        languageCode.

   *

   * @throws EPPIXBusinessException

   * @throws EPPIXUnexpectedException

   * @throws EPPIXFatalException

   */

  public void delete( UrsUrlSettingDMO ursUrlSettingDMO )

    throws EPPIXBusinessException, EPPIXUnexpectedException,

      EPPIXFatalException {

    logger.debug( "delete( ursUrlSettingDMO )" );


    thrower.ifParameterMissing( "ursUrlSettingDMO", ursUrlSettingDMO );


    UrsUrlSettingDMO updateUrsUrlSettingDMO = null;


    updateUrsUrlSettingDMO = get( ursUrlSettingDMO );


    // delete self...

    ursUrlSettingDAC.delete( ursUrlSettingDMO );

  }


  /**

   * Deletes the UrsUrlSetting object.

   * <p>

   * <B>Possible application exceptions:</B>

   * <dl><dd>

   *     <li>The normal general errors:

   *          {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>

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

    ursUrlSettingDAC.delete( filter );

  }


  /**

  * Indicates whether a UrsUrlSetting exists in the database

  * <p>

  * <B>Possible application exceptions:</B>

  * <dl><dd>

  *     <li>The normal general errors:

  *          {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>

  * </dd></dl>

  *

  *

  * @return true if the UrsUrlSetting exists in the database

  *

  * @throws EPPIXBusinessException

  * @throws EPPIXUnexpectedException

  * @throws EPPIXFatalException

  */

  public boolean exists( UrsUrlSettingDMO ursUrlSettingDMO )

    throws EPPIXBusinessException, EPPIXUnexpectedException,

      EPPIXFatalException {

    logger.debug( "exists(ursUrlSetting)" );


    thrower.ifParameterMissing( "ursUrlSettingDMO", ursUrlSettingDMO );


    thrower.ifParameterMissing( "ursUrlSettingDMO.ursUrlCode",

      ursUrlSettingDMO.getUrsUrlCode(  ) );


    return ursUrlSettingDAC.exists( ursUrlSettingDMO );

  }


  /**

   * Indicates whether a UrsUrlSetting exists in the database

   * <p>

   * <B>Possible application exceptions:</B>

   * <dl><dd>

   *     <li>The normal general errors:

   *          {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>

   * </dd></dl>

   *

   *

   * @return true if the UrsUrlSetting exists in the database

   *

   * @throws EPPIXBusinessException

   * @throws EPPIXUnexpectedException

   * @throws EPPIXFatalException

   */

  public boolean exists( QueryFilter filter )

    throws EPPIXBusinessException, EPPIXUnexpectedException,

      EPPIXFatalException {

    logger.debug( "exists(filter)" );


    return ursUrlSettingDAC.exists( filter );

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

//  public DTOList<UrsUrlSettingDMO> getList(

//    DTOListState state,

//    QueryFilter  filter )

//    throws EPPIXBusinessException, EPPIXUnexpectedException,

//      EPPIXFatalException {

//    logger.debug( "getList( state, filter )" );

//

//    return ursUrlSettingDAC.getList( state, filter );

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


    return ursUrlSettingDAC.iterate( filter );

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


    return ursUrlSettingDAC.iterateWithLock( filter );

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

  public UrsUrlSettingDMO get( QueryFilter filter )

    throws EPPIXBusinessException, EPPIXUnexpectedException,

      EPPIXFatalException {

    logger.debug( "get( filter )" );


    //

    // Check mandatory parameters.

    //

    thrower.ifParameterMissing( "filter", filter );


    //

    // Attempt to get the UrsUrlSettingDMO

    //

    UrsUrlSettingDMO ursUrlSettingDMO = ursUrlSettingDAC.get( filter );


    return ursUrlSettingDMO;

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


    return ursUrlSettingDAC.max( filter );

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


    return ursUrlSettingDAC.min( filter );

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


    return Integer.valueOf(String.valueOf(ursUrlSettingDAC.count( filter )));

  }

}
