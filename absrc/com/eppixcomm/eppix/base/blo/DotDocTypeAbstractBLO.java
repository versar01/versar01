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
import com.eppixcomm.eppix.common.data.DAOIterator;
import com.eppixcomm.eppix.common.data.DMO;

//import java.util.*;
import com.eppixcomm.eppix.common.util.QueryFilter;
import com.eppixcomm.eppix.common.data.DTOActionTypes;
import com.eppixcomm.eppix.common.data.DTOList;
import com.eppixcomm.eppix.common.data.DTOListState;
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

/**
 * Defines a related group of documents.
 * <p>
 *   Each entry defines a document type, such as all threat to bar letters. It does not differentiate between the different
 *   variants of the document that might be used for different categories of account, nor between the different versions of
 *   the document that may accumulate over time. These variations on the document are listed in dod_doc_definition and
 *   dov_doc_version.
 * </p>
 * <p>
 *   When eppix raises a request for a letter it specifies one of these document types.
 * </p>
 *
 * This abstract business logic class holds all the logic for the DotDocType class.
 * It is extended by DotDocType class which holds the additional logic that is required, if any.
 *
 * @author
 * @version $Revision: $
 *
 * @since $jdk$
 */
public abstract class DotDocTypeAbstractBLO
  extends BaseBLO
  implements DTOActionTypes, BaseMessages {
  //~ Static variables/initializers //////////////////////////////////////////

  /** DOCUMENT ME! */
  static Thrower thrower = Thrower.getThrower( DotDocType.class );
  /** DOCUMENT ME! */
  protected static final String ENTITY_ID = "DOTT";

  //~ Instance variables /////////////////////////////////////////////////////

  /** Data Access Controller. */
  protected DotDocTypeDAC dotDocTypeDAC;
  /** DOCUMENT ME! */
  protected Logger logger = thrower.getLogger(  );

  //~ Methods ////////////////////////////////////////////////////////////////

  /** Invoked by the BLOBinder to get the DAC class for this BLO. */
  protected Class getDACClass(  ) {
    return DotDocTypeDAC.class;
  }

  /** Invoked by the BLOBinder to provide this BLO with its DAC. */
  protected void setDAC( DAC dac ) {
    this.dotDocTypeDAC = (DotDocTypeDAC) dac;
  }

  /**
  * Retrieve a dotDocType data model object from persistent storage. The
  * dotDocTypeDMO passed in must contain a valid existing dotDocTypeId.
  * Optionally, the return dotDocTypeDMO may be include a flag that indicates if
  * the dotDocType object is referenced elsewhere within the module, depending on the value
  * of the getIsUsed parameter. Finally, optionally, this method can return the set of audit
  * records for the dotDocType object depending on the value of the getAudits parameter.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *   <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#DOTDOCTYPE_000}</li>
  *   <li> The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl><br>
  *
  * @param  dotDocTypeDMO the dotDocType object that must contain either the
  *         unique dotDocTypeId or the displayCode/languageCode pair
  *
  * @return dotDocTypeDMO the dotDocType data model object
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXFatalException
  * @throws EPPIXUnexpectedException
  */
  public DotDocTypeDMO get( DotDocTypeDMO dotDocTypeDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "get(dotDocTypeDMO)" );

    //
    // Check mandatory parameters.
    //
    thrower.ifParameterMissing( "dotDocTypeDMO", dotDocTypeDMO );

    //
    // Each attribute that is part of the primary key is mandatory
    //
    thrower.ifParameterMissing( "dotDocTypeDMO.dotTypeCode",
      dotDocTypeDMO.getDotTypeCode(  ) );

    //
    // Attempt to get the DotDocTypeDMO
    //
    DotDocTypeDMO returnDotDocTypeDMO = dotDocTypeDAC.get( dotDocTypeDMO );

    //
    // Could not find the DotDocTypeDMO
    //
    if ( returnDotDocTypeDMO == null ) {
      thrower.business( Base_DOTDOCTYPE_000,
        new Object[] { dotDocTypeDMO.getDotTypeCode(  ) } );
    }

    //
    // Now, based on the values of the flags on this method signature, which in turn,
    // are based on this objects associations, get all associated, embedded objects
    //
    return returnDotDocTypeDMO;
  }

  /**
   * Return a list of DotDocType objects matching the passed in values. A
   * partial match is performed on the description argument and/or the dotDocTypes
   * displayCode. If no values have been passed in, all DotDocType objects are
   * retrieved. Note: if a language specific description does not exist, then
   * the DotDocType is retrieved with the special 'NOCODE' description.
   *
   * @param state previous state of the list
   * @param dotDocTypeDMO DotDocTypeDMO object
   *
   * @return DTOList of DotDocType objects
   *
   * @throws EPPIXUnexpectedException
   */
  public DTOList getList( 
    DTOListState  state,
    DotDocTypeDMO dotDocTypeDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "getList( state, dotDocTypeDMO )" );

    return dotDocTypeDAC.getList( state, dotDocTypeDMO );
  }

  /**
  * Creates the DotDocType object. As a side effect, following creation
  * of a dotDocType an audit object may be created.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param dotDocTypeDMO dotDocTypeDMO object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated dotDocTypeDMO object.
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public DotDocTypeDMO create( DotDocTypeDMO dotDocTypeDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "create( dotDocTypeDMO )" );

    thrower.ifParameterMissing( "dotDocTypeDMO", dotDocTypeDMO );

    thrower.ifParameterMissing( "dotDocTypeDMO.dotTypeCode",
      dotDocTypeDMO.getDotTypeCode(  ) );

    thrower.ifParameterMissing( "dotDocTypeDMO.dotRelation",
      dotDocTypeDMO.getDotRelation(  ) );

    thrower.ifParameterMissing( "dotDocTypeDMO.dotEngine",
      dotDocTypeDMO.getDotEngine(  ) );

    thrower.ifParameterMissing( "dotDocTypeDMO.dotTypeFolder",
      dotDocTypeDMO.getDotTypeFolder(  ) );

    thrower.ifParameterMissing( "dotDocTypeDMO.dotFilenameStart",
      dotDocTypeDMO.getDotFilenameStart(  ) );

    thrower.ifParameterMissing( "dotDocTypeDMO.dotDefDelivery",
      dotDocTypeDMO.getDotDefDelivery(  ) );

    thrower.ifParameterMissing( "dotDocTypeDMO.dotDefFormat",
      dotDocTypeDMO.getDotDefFormat(  ) );

    thrower.ifParameterMissing( "dotDocTypeDMO.dotAccReqd",
      dotDocTypeDMO.getDotAccReqd(  ) );

    thrower.ifParameterMissing( "dotDocTypeDMO.dotSubReqd",
      dotDocTypeDMO.getDotSubReqd(  ) );

    thrower.ifParameterMissing( "dotDocTypeDMO.dotInvReqd",
      dotDocTypeDMO.getDotInvReqd(  ) );

    thrower.ifParameterMissing( "dotDocTypeDMO.dotManipulate",
      dotDocTypeDMO.getDotManipulate(  ) );

    //
    // Check that this object does not already exist 
    //
    if ( exists( dotDocTypeDMO ) ) {
      thrower.business( Base_DOTDOCTYPE_001,
        new Object[] { dotDocTypeDMO.getDotTypeCode(  ) } );
    }

    //
    // Now create the dotDocType
    //
    dotDocTypeDAC.create( dotDocTypeDMO );

    return dotDocTypeDMO;
  }

  /**
  * Modifies the DotDocType object. On any modification, an audit object
  * is created.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#DOTDOCTYPE_002}</li>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param dotDocTypeDMO dotDocTypeDMO object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated dotDocTypeDMO object.
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public DotDocTypeDMO modify( DotDocTypeDMO aDotDocTypeDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "modify( adotDocTypeDMO )" );

    //
    // Check mandatory parameters (
    //
    // Note: attributes stereotyped <NotModifiable> are ignored
    //
    thrower.ifParameterMissing( "adotDocTypeDMO", aDotDocTypeDMO );

    thrower.ifParameterMissing( "aDotDocTypeDMO.dotTypeCode",
      aDotDocTypeDMO.getDotTypeCode(  ) ); // attribute

    thrower.ifParameterMissing( "aDotDocTypeDMO.dotRelation",
      aDotDocTypeDMO.getDotRelation(  ) ); // attribute

    thrower.ifParameterMissing( "aDotDocTypeDMO.dotEngine",
      aDotDocTypeDMO.getDotEngine(  ) ); // attribute

    thrower.ifParameterMissing( "aDotDocTypeDMO.dotTypeFolder",
      aDotDocTypeDMO.getDotTypeFolder(  ) ); // attribute

    thrower.ifParameterMissing( "aDotDocTypeDMO.dotFilenameStart",
      aDotDocTypeDMO.getDotFilenameStart(  ) ); // attribute

    thrower.ifParameterMissing( "aDotDocTypeDMO.dotDefDelivery",
      aDotDocTypeDMO.getDotDefDelivery(  ) ); // attribute

    thrower.ifParameterMissing( "aDotDocTypeDMO.dotDefFormat",
      aDotDocTypeDMO.getDotDefFormat(  ) ); // attribute

    thrower.ifParameterMissing( "aDotDocTypeDMO.dotAccReqd",
      aDotDocTypeDMO.getDotAccReqd(  ) ); // attribute

    thrower.ifParameterMissing( "aDotDocTypeDMO.dotSubReqd",
      aDotDocTypeDMO.getDotSubReqd(  ) ); // attribute

    thrower.ifParameterMissing( "aDotDocTypeDMO.dotInvReqd",
      aDotDocTypeDMO.getDotInvReqd(  ) ); // attribute

    thrower.ifParameterMissing( "aDotDocTypeDMO.dotManipulate",
      aDotDocTypeDMO.getDotManipulate(  ) ); // attribute

    DotDocTypeDMO updateDotDocTypeDMO = new DotDocTypeDMO(  );

    updateDotDocTypeDMO.setDotTypeCode( aDotDocTypeDMO.getDotTypeCode(  ) );

    updateDotDocTypeDMO = get( updateDotDocTypeDMO );

    //
    // For each relationship to single objects (does not matter if they are Embedded or Flattened)
    // either associate to a pre-existing object, or create an object then associate to it
    //

    //
    // Copy the fields to be updated. We do not want to overwrite primary keys etc.
    // All attributes stereotyped as being <NotModifiable> are skipped
    //
    updateDotDocTypeDMO.setDotRelation( aDotDocTypeDMO.getDotRelation(  ) );

    updateDotDocTypeDMO.setDotSubsystem( aDotDocTypeDMO.getDotSubsystem(  ) );

    updateDotDocTypeDMO.setDotEngine( aDotDocTypeDMO.getDotEngine(  ) );

    updateDotDocTypeDMO.setDotTypeFolder( aDotDocTypeDMO.getDotTypeFolder(  ) );

    updateDotDocTypeDMO.setDotFilenameStart( aDotDocTypeDMO
      .getDotFilenameStart(  ) );

    updateDotDocTypeDMO.setDotDefDelivery( aDotDocTypeDMO.getDotDefDelivery(  ) );

    updateDotDocTypeDMO.setDotDefFormat( aDotDocTypeDMO.getDotDefFormat(  ) );

    updateDotDocTypeDMO.setDotAccReqd( aDotDocTypeDMO.getDotAccReqd(  ) );

    updateDotDocTypeDMO.setDotSubReqd( aDotDocTypeDMO.getDotSubReqd(  ) );

    updateDotDocTypeDMO.setDotInvReqd( aDotDocTypeDMO.getDotInvReqd(  ) );

    updateDotDocTypeDMO.setDotReasonType( aDotDocTypeDMO.getDotReasonType(  ) );

    updateDotDocTypeDMO.setDotReasonCode( aDotDocTypeDMO.getDotReasonCode(  ) );

    updateDotDocTypeDMO.setDotManipulate( aDotDocTypeDMO.getDotManipulate(  ) );

    //
    // Modify the dotDocTypeDMO
    //
    dotDocTypeDAC.modify( updateDotDocTypeDMO );

    // Create a new DMO, set keys, and fetch from the database...
    DotDocTypeDMO returnDotDocTypeDMO = new DotDocTypeDMO(  );

    returnDotDocTypeDMO.setDotTypeCode( updateDotDocTypeDMO.getDotTypeCode(  ) );

    returnDotDocTypeDMO = get( returnDotDocTypeDMO );

    return returnDotDocTypeDMO;
  }

  /**
  * Modifies the DotDocType object.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#ECEVENTCOMMAND_002}</li>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param DotDocTypeDMO object<br>
  * @param filter object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated dotDocTypeDMO object.
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
    // Modify the dotDocTypeDMO
    //
    dotDocTypeDAC.modify( filter );
  }

  /**
   * Deletes the DotDocType object. On deletion, an audit object is created
   * <p>
   * <B>Possible application exceptions:</B>
   * <dl><dd>Base_DOTDOCTYPE_003
   *     <li>{@link #Base#DOTDOCTYPE_000} if the DotDocType does not exist.</li>
   *     <li>{@link #Base#DOTDOCTYPE_003} if the DotDocType is in use.</li>
   *     <li>The normal general errors:
   *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
   * </dd></dl>
   *  @param DotDocTypeDMO DotDocType object with embedded displayCode and
   *        languageCode.
   *
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public void delete( DotDocTypeDMO dotDocTypeDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "delete( dotDocTypeDMO )" );

    thrower.ifParameterMissing( "dotDocTypeDMO", dotDocTypeDMO );

    DotDocTypeDMO updateDotDocTypeDMO = null;

    updateDotDocTypeDMO = get( dotDocTypeDMO );

    // delete self...
    dotDocTypeDAC.delete( dotDocTypeDMO );
  }

  /**
   * Deletes the DotDocType object.
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
    dotDocTypeDAC.delete( filter );
  }

  /**
  * Indicates whether a DotDocType exists in the database
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
  * </dd></dl>
  *
  *
  * @return true if the DotDocType exists in the database
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public boolean exists( DotDocTypeDMO dotDocTypeDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "exists(dotDocType)" );

    thrower.ifParameterMissing( "dotDocTypeDMO", dotDocTypeDMO );

    thrower.ifParameterMissing( "dotDocTypeDMO.dotTypeCode",
      dotDocTypeDMO.getDotTypeCode(  ) );

    return dotDocTypeDAC.exists( dotDocTypeDMO );
  }

  /**
   * Indicates whether a DotDocType exists in the database
   * <p>
   * <B>Possible application exceptions:</B>
   * <dl><dd>
   *     <li>The normal general errors:
   *          {@link com.eppixcomm.eppix.error.GeneralMessages}</li>
   * </dd></dl>
   *
   *
   * @return true if the DotDocType exists in the database
   *
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public boolean exists( QueryFilter filter )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "exists(filter)" );

    return dotDocTypeDAC.exists( filter );
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
  public DTOList getList( 
    DTOListState state,
    QueryFilter  filter )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "getList( state, filter )" );

    return dotDocTypeDAC.getList( state, filter );
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
  public DAOIterator iterate( QueryFilter filter )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "iterate( filter )" );

    return dotDocTypeDAC.iterate( filter );
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

    return dotDocTypeDAC.iterateWithLock( filter );
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
  public DotDocTypeDMO get( QueryFilter filter )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "get( filter )" );

    //
    // Check mandatory parameters.
    //
    thrower.ifParameterMissing( "filter", filter );

    //
    // Attempt to get the DotDocTypeDMO
    //
    DotDocTypeDMO dotDocTypeDMO = dotDocTypeDAC.get( filter );

    return dotDocTypeDMO;
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

    return dotDocTypeDAC.max( filter );
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

    return dotDocTypeDAC.min( filter );
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

    return new Integer(dotDocTypeDAC.count( filter ));
  }
}
