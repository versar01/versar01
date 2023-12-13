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

/**
 * Any customer details held in addition to those on CUSTOMER (which is a shadow of the chameleon table and hence can not itself be extended).
 * <p>
 *   
 
 The customers\\\\\\\\\\\\\\\' physical address is no longer stored on this table. It has moved to the aud_address
 *   table, which also holds any other addresses for the customer. The physical address is stored on there with an
 *   address_type of \\\\\\\\\\\\\\\"CPHY\\\\\\\\\\\\\\\".
 * </p>
 *
 * This abstract business logic class holds all the logic for the AuxCustomers class.
 * It is extended by AuxCustomers class which holds the additional logic that is required, if any.
 *
 * @author
 * @version $Revision: $
 *
 * @since $jdk$
 */
public abstract class AuxCustomersAbstractBLO
  extends BaseBLO
  implements DTOActionTypes, BaseMessages {
  //~ Static variables/initializers //////////////////////////////////////////

  /** DOCUMENT ME! */
  static Thrower thrower = Thrower.getThrower( AuxCustomers.class );
  /** DOCUMENT ME! */
  protected static final String ENTITY_ID = "AUX";

  //~ Instance variables /////////////////////////////////////////////////////

  /** Data Access Controller. */
  protected AuxCustomersDAC auxCustomersDAC;
  /** DOCUMENT ME! */
  protected Logger logger = thrower.getLogger(  );

  //~ Methods ////////////////////////////////////////////////////////////////

  /** Invoked by the BLOBinder to provide this BLO with its DAC. */
  protected void setDAC( DAC dac ) {
    this.auxCustomersDAC = (AuxCustomersDAC) dac;
  }

  /**
  * Retrieve a auxCustomers data model object from persistent storage. The
  * auxCustomersDMO passed in must contain a valid existing auxCustomersId.
  * Optionally, the return auxCustomersDMO may be include a flag that indicates if
  * the auxCustomers object is referenced elsewhere within the module, depending on the value
  * of the getIsUsed parameter. Finally, optionally, this method can return the set of audit
  * records for the auxCustomers object depending on the value of the getAudits parameter.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *   <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#AUXCUSTOMERS_000}</li>
  *   <li> The normal general errors:
  *          {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>
  * </dd></dl><br>
  *
  * @param  auxCustomersDMO the auxCustomers object that must contain either the
  *         unique auxCustomersId or the displayCode/languageCode pair
  *
  * @return auxCustomersDMO the auxCustomers data model object
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXFatalException
  * @throws EPPIXUnexpectedException
  */
  public AuxCustomersDMO get( AuxCustomersDMO auxCustomersDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "get(auxCustomersDMO)" );

    //
    // Check mandatory parameters.
    //
    thrower.ifParameterMissing( "auxCustomersDMO", auxCustomersDMO );

    //
    // Each attribute that is part of the primary key is mandatory
    //
    thrower.ifParameterMissing( "auxCustomersDMO.billAcNo",
      auxCustomersDMO.getBillAcNo(  ) );

    //
    // Attempt to get the AuxCustomersDMO
    //
    AuxCustomersDMO returnAuxCustomersDMO = auxCustomersDAC.get( auxCustomersDMO );

    //
    // Could not find the AuxCustomersDMO
    //
    if ( returnAuxCustomersDMO == null ) {
      thrower.business( Base_AUXCUSTOMERS_000,
        new Object[] { auxCustomersDMO.getBillAcNo(  ) } );
    }

    //
    // Now, based on the values of the flags on this method signature, which in turn,
    // are based on this objects associations, get all associated, embedded objects
    //
    return returnAuxCustomersDMO;
  }

  /**
   * Return a list of AuxCustomers objects matching the passed in values. A
   * partial match is performed on the description argument and/or the auxCustomerss
   * displayCode. If no values have been passed in, all AuxCustomers objects are
   * retrieved. Note: if a language specific description does not exist, then
   * the AuxCustomers is retrieved with the special 'NOCODE' description.
   *
   * @param state previous state of the list
   * @param auxCustomersDMO AuxCustomersDMO object
   *
   * @return DTOList of AuxCustomers objects
   *
   * @throws EPPIXUnexpectedException
   */
//  public DTOList<AuxCustomersDMO> getList( 
//    DTOListState    state,
//    AuxCustomersDMO auxCustomersDMO )
//    throws EPPIXBusinessException, EPPIXUnexpectedException,
//      EPPIXFatalException {
//    logger.debug( "getList( state, auxCustomersDMO )" );
//
//    return auxCustomersDAC.getList( state, auxCustomersDMO );
//  }

  /**
  * Creates the AuxCustomers object. As a side effect, following creation
  * of a auxCustomers an audit object may be created.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param auxCustomersDMO auxCustomersDMO object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated auxCustomersDMO object.
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public AuxCustomersDMO create( AuxCustomersDMO auxCustomersDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "create( auxCustomersDMO )" );

    thrower.ifParameterMissing( "auxCustomersDMO", auxCustomersDMO );

    thrower.ifParameterMissing( "auxCustomersDMO.auxInvoiceAddrid",
      auxCustomersDMO.getAuxInvoiceAddrid(  ) );

    thrower.ifParameterMissing( "auxCustomersDMO.billAcNo",
      auxCustomersDMO.getBillAcNo(  ) );

    thrower.ifParameterMissing( "auxCustomersDMO.maxNoSubs",
      auxCustomersDMO.getMaxNoSubs(  ) );

    thrower.ifParameterMissing( "auxCustomersDMO.auxPrepaidStat",
      auxCustomersDMO.getAuxPrepaidStat(  ) );

    //
    // Check that this object does not already exist 
    //
    if ( exists( auxCustomersDMO ) ) {
      thrower.business( Base_AUXCUSTOMERS_001,
        new Object[] { auxCustomersDMO.getBillAcNo(  ) } );
    }

    //
    // Now create the auxCustomers
    //
    auxCustomersDAC.create( auxCustomersDMO );

    return auxCustomersDMO;
  }

  /**
  * Modifies the AuxCustomers object. On any modification, an audit object
  * is created.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#AUXCUSTOMERS_002}</li>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param auxCustomersDMO auxCustomersDMO object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated auxCustomersDMO object.
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public AuxCustomersDMO modify( AuxCustomersDMO aAuxCustomersDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "modify( aauxCustomersDMO )" );

    //
    // Check mandatory parameters (
    //
    // Note: attributes stereotyped <NotModifiable> are ignored
    //
    thrower.ifParameterMissing( "aauxCustomersDMO", aAuxCustomersDMO );

    thrower.ifParameterMissing( "aAuxCustomersDMO.auxInvoiceAddrid",
      aAuxCustomersDMO.getAuxInvoiceAddrid(  ) ); // attribute

    thrower.ifParameterMissing( "aAuxCustomersDMO.billAcNo",
      aAuxCustomersDMO.getBillAcNo(  ) ); // attribute

    thrower.ifParameterMissing( "aAuxCustomersDMO.maxNoSubs",
      aAuxCustomersDMO.getMaxNoSubs(  ) ); // attribute

    thrower.ifParameterMissing( "aAuxCustomersDMO.auxPrepaidStat",
      aAuxCustomersDMO.getAuxPrepaidStat(  ) ); // attribute

    AuxCustomersDMO updateAuxCustomersDMO = new AuxCustomersDMO(  );

    updateAuxCustomersDMO.setBillAcNo( aAuxCustomersDMO.getBillAcNo(  ) );

    updateAuxCustomersDMO = get( updateAuxCustomersDMO );

    //
    // For each relationship to single objects (does not matter if they are Embedded or Flattened)
    // either associate to a pre-existing object, or create an object then associate to it
    //

    //
    // Copy the fields to be updated. We do not want to overwrite primary keys etc.
    // All attributes stereotyped as being <NotModifiable> are skipped
    //
    updateAuxCustomersDMO.setAuxTitle( aAuxCustomersDMO.getAuxTitle(  ) );

    updateAuxCustomersDMO.setAuxFirstname( aAuxCustomersDMO.getAuxFirstname(  ) );

    updateAuxCustomersDMO.setAuxInvoiceAddrid( aAuxCustomersDMO
      .getAuxInvoiceAddrid(  ) );

    updateAuxCustomersDMO.setBankName( aAuxCustomersDMO.getBankName(  ) );

    updateAuxCustomersDMO.setBankAddr1( aAuxCustomersDMO.getBankAddr1(  ) );

    updateAuxCustomersDMO.setBankAddr2( aAuxCustomersDMO.getBankAddr2(  ) );

    updateAuxCustomersDMO.setBankAcName( aAuxCustomersDMO.getBankAcName(  ) );

    updateAuxCustomersDMO.setRef( aAuxCustomersDMO.getRef(  ) );

    updateAuxCustomersDMO.setBankScode( aAuxCustomersDMO.getBankScode(  ) );

    updateAuxCustomersDMO.setBankAcNo( aAuxCustomersDMO.getBankAcNo(  ) );

    updateAuxCustomersDMO.setBankAcType( aAuxCustomersDMO.getBankAcType(  ) );

    updateAuxCustomersDMO.setBankPayType( aAuxCustomersDMO.getBankPayType(  ) );

    updateAuxCustomersDMO.setAuxPrefDebitDay( aAuxCustomersDMO
      .getAuxPrefDebitDay(  ) );

    updateAuxCustomersDMO.setProtectCode( aAuxCustomersDMO.getProtectCode(  ) );

    updateAuxCustomersDMO.setHandsetCt( aAuxCustomersDMO.getHandsetCt(  ) );

    updateAuxCustomersDMO.setBankDate( aAuxCustomersDMO.getBankDate(  ) );

    updateAuxCustomersDMO.setConfDate( aAuxCustomersDMO.getConfDate(  ) );

    updateAuxCustomersDMO.setAuxComment( aAuxCustomersDMO.getAuxComment(  ) );

    updateAuxCustomersDMO.setDateOfBirth( aAuxCustomersDMO.getDateOfBirth(  ) );

    updateAuxCustomersDMO.setRefPayDate( aAuxCustomersDMO.getRefPayDate(  ) );

    updateAuxCustomersDMO.setAcClosDate( aAuxCustomersDMO.getAcClosDate(  ) );

    updateAuxCustomersDMO.setNoReasDate( aAuxCustomersDMO.getNoReasDate(  ) );

    updateAuxCustomersDMO.setRemLetDate( aAuxCustomersDMO.getRemLetDate(  ) );

    updateAuxCustomersDMO.setAcTranDate( aAuxCustomersDMO.getAcTranDate(  ) );

    updateAuxCustomersDMO.setNoAcDate( aAuxCustomersDMO.getNoAcDate(  ) );

    updateAuxCustomersDMO.setSrFlag( aAuxCustomersDMO.getSrFlag(  ) );

    updateAuxCustomersDMO.setProcessed( aAuxCustomersDMO.getProcessed(  ) );

    updateAuxCustomersDMO.setPackageCode( aAuxCustomersDMO.getPackageCode(  ) );

    updateAuxCustomersDMO.setAuxAccountType( aAuxCustomersDMO
      .getAuxAccountType(  ) );

    updateAuxCustomersDMO.setAuxBillCycle( aAuxCustomersDMO.getAuxBillCycle(  ) );

    updateAuxCustomersDMO.setCreditCardNo( aAuxCustomersDMO.getCreditCardNo(  ) );

    updateAuxCustomersDMO.setCreditCardName( aAuxCustomersDMO
      .getCreditCardName(  ) );

    updateAuxCustomersDMO.setExpiryDate( aAuxCustomersDMO.getExpiryDate(  ) );

    updateAuxCustomersDMO.setAuxCardCvvNo( aAuxCustomersDMO.getAuxCardCvvNo(  ) );

    updateAuxCustomersDMO.setCreditScore( aAuxCustomersDMO.getCreditScore(  ) );

    updateAuxCustomersDMO.setServProvId( aAuxCustomersDMO.getServProvId(  ) );

    updateAuxCustomersDMO.setDealerId( aAuxCustomersDMO.getDealerId(  ) );

    updateAuxCustomersDMO.setSalesman( aAuxCustomersDMO.getSalesman(  ) );

    updateAuxCustomersDMO.setIdNumber( aAuxCustomersDMO.getIdNumber(  ) );

    updateAuxCustomersDMO.setAccStatus( aAuxCustomersDMO.getAccStatus(  ) );

    updateAuxCustomersDMO.setCompRegNo( aAuxCustomersDMO.getCompRegNo(  ) );

    updateAuxCustomersDMO.setStationaryType( aAuxCustomersDMO
      .getStationaryType(  ) );

    updateAuxCustomersDMO.setMaxNoSubs( aAuxCustomersDMO.getMaxNoSubs(  ) );

    updateAuxCustomersDMO.setAuxCurrency( aAuxCustomersDMO.getAuxCurrency(  ) );

    updateAuxCustomersDMO.setAuxCountryCode( aAuxCustomersDMO
      .getAuxCountryCode(  ) );

    updateAuxCustomersDMO.setAuxGender( aAuxCustomersDMO.getAuxGender(  ) );

    updateAuxCustomersDMO.setAuxSubGrpAccNo( aAuxCustomersDMO
      .getAuxSubGrpAccNo(  ) );

    updateAuxCustomersDMO.setAuxPrepaidStat( aAuxCustomersDMO
      .getAuxPrepaidStat(  ) );

    updateAuxCustomersDMO.setAuxCreditClass( aAuxCustomersDMO
      .getAuxCreditClass(  ) );

    updateAuxCustomersDMO.setAuxAutoLimitInd( aAuxCustomersDMO
      .getAuxAutoLimitInd(  ) );

    updateAuxCustomersDMO.setAuxLmtUpVal( aAuxCustomersDMO.getAuxLmtUpVal(  ) );

    updateAuxCustomersDMO.setAuxLmtDnVal( aAuxCustomersDMO.getAuxLmtDnVal(  ) );

    updateAuxCustomersDMO.setAuxAnalysis1( aAuxCustomersDMO.getAuxAnalysis1(  ) );

    updateAuxCustomersDMO.setAuxAnalysis2( aAuxCustomersDMO.getAuxAnalysis2(  ) );

    updateAuxCustomersDMO.setAuxAnalysis3( aAuxCustomersDMO.getAuxAnalysis3(  ) );

    updateAuxCustomersDMO.setAuxAnalysis4( aAuxCustomersDMO.getAuxAnalysis4(  ) );

    updateAuxCustomersDMO.setAuxAnalysis5( aAuxCustomersDMO.getAuxAnalysis5(  ) );

    updateAuxCustomersDMO.setAuxAnalysis6( aAuxCustomersDMO.getAuxAnalysis6(  ) );

    updateAuxCustomersDMO.setAuxAnalysis7( aAuxCustomersDMO.getAuxAnalysis7(  ) );

    updateAuxCustomersDMO.setAuxAnalysis8( aAuxCustomersDMO.getAuxAnalysis8(  ) );

    updateAuxCustomersDMO.setAuxAnalysis9( aAuxCustomersDMO.getAuxAnalysis9(  ) );

    updateAuxCustomersDMO.setAuxAnalysis10( aAuxCustomersDMO.getAuxAnalysis10(  ) );

    updateAuxCustomersDMO.setAuxAnalysis11( aAuxCustomersDMO.getAuxAnalysis11(  ) );

    updateAuxCustomersDMO.setAuxAnalysis12( aAuxCustomersDMO.getAuxAnalysis12(  ) );

    updateAuxCustomersDMO.setAuxAnalysis13( aAuxCustomersDMO.getAuxAnalysis13(  ) );

    updateAuxCustomersDMO.setAuxAnalysis14( aAuxCustomersDMO.getAuxAnalysis14(  ) );

    updateAuxCustomersDMO.setAuxAnalysis15( aAuxCustomersDMO.getAuxAnalysis15(  ) );

    updateAuxCustomersDMO.setAuxAnalysis16( aAuxCustomersDMO.getAuxAnalysis16(  ) );

    updateAuxCustomersDMO.setAuxAnalysis17( aAuxCustomersDMO.getAuxAnalysis17(  ) );

    updateAuxCustomersDMO.setAuxAnalysis18( aAuxCustomersDMO.getAuxAnalysis18(  ) );

    updateAuxCustomersDMO.setAuxAnalysis19( aAuxCustomersDMO.getAuxAnalysis19(  ) );

    updateAuxCustomersDMO.setAuxAnalysis20( aAuxCustomersDMO.getAuxAnalysis20(  ) );

    updateAuxCustomersDMO.setAuxAnalysis21( aAuxCustomersDMO.getAuxAnalysis21(  ) );

    updateAuxCustomersDMO.setAuxAnalysis22( aAuxCustomersDMO.getAuxAnalysis22(  ) );

    updateAuxCustomersDMO.setAuxAnalysis23( aAuxCustomersDMO.getAuxAnalysis23(  ) );

    updateAuxCustomersDMO.setAuxAnalysis24( aAuxCustomersDMO.getAuxAnalysis24(  ) );

    updateAuxCustomersDMO.setAuxAnalysis25( aAuxCustomersDMO.getAuxAnalysis25(  ) );

    updateAuxCustomersDMO.setAuxAnalysis26( aAuxCustomersDMO.getAuxAnalysis26(  ) );

    updateAuxCustomersDMO.setAuxAnalysis27( aAuxCustomersDMO.getAuxAnalysis27(  ) );

    updateAuxCustomersDMO.setAuxAnalysis28( aAuxCustomersDMO.getAuxAnalysis28(  ) );

    updateAuxCustomersDMO.setAuxAnalysis29( aAuxCustomersDMO.getAuxAnalysis29(  ) );

    updateAuxCustomersDMO.setAuxAnalysis30( aAuxCustomersDMO.getAuxAnalysis30(  ) );

    //
    // Modify the auxCustomersDMO
    //
    auxCustomersDAC.modify( updateAuxCustomersDMO );

    // Create a new DMO, set keys, and fetch from the database...
    AuxCustomersDMO returnAuxCustomersDMO = new AuxCustomersDMO(  );

    returnAuxCustomersDMO.setBillAcNo( updateAuxCustomersDMO.getBillAcNo(  ) );

    returnAuxCustomersDMO = get( returnAuxCustomersDMO );

    return returnAuxCustomersDMO;
  }

  /**
  * Modifies the AuxCustomers object.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#ECEVENTCOMMAND_002}</li>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param AuxCustomersDMO object<br>
  * @param filter object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated auxCustomersDMO object.
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
    // Modify the auxCustomersDMO
    //
    auxCustomersDAC.modify( filter );
  }

  /**
   * Deletes the AuxCustomers object. On deletion, an audit object is created
   * <p>
   * <B>Possible application exceptions:</B>
   * <dl><dd>Base_AUXCUSTOMERS_003
   *     <li>{@link #Base#AUXCUSTOMERS_000} if the AuxCustomers does not exist.</li>
   *     <li>{@link #Base#AUXCUSTOMERS_003} if the AuxCustomers is in use.</li>
   *     <li>The normal general errors:
   *          {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>
   * </dd></dl>
   *  @param AuxCustomersDMO AuxCustomers object with embedded displayCode and
   *        languageCode.
   *
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public void delete( AuxCustomersDMO auxCustomersDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "delete( auxCustomersDMO )" );

    thrower.ifParameterMissing( "auxCustomersDMO", auxCustomersDMO );

    AuxCustomersDMO updateAuxCustomersDMO = null;

    updateAuxCustomersDMO = get( auxCustomersDMO );

    // delete self...
    auxCustomersDAC.delete( auxCustomersDMO );
  }

  /**
   * Deletes the AuxCustomers object.
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
    auxCustomersDAC.delete( filter );
  }

  /**
  * Indicates whether a AuxCustomers exists in the database
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>
  * </dd></dl>
  *
  *
  * @return true if the AuxCustomers exists in the database
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public boolean exists( AuxCustomersDMO auxCustomersDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "exists(auxCustomers)" );

    thrower.ifParameterMissing( "auxCustomersDMO", auxCustomersDMO );

    thrower.ifParameterMissing( "auxCustomersDMO.billAcNo",
      auxCustomersDMO.getBillAcNo(  ) );

    return auxCustomersDAC.exists( auxCustomersDMO );
  }

  /**
   * Indicates whether a AuxCustomers exists in the database
   * <p>
   * <B>Possible application exceptions:</B>
   * <dl><dd>
   *     <li>The normal general errors:
   *          {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>
   * </dd></dl>
   *
   *
   * @return true if the AuxCustomers exists in the database
   *
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public boolean exists( QueryFilter filter )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "exists(filter)" );

    return auxCustomersDAC.exists( filter );
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
//  public DTOList<AuxCustomersDMO> getList( 
//    DTOListState state,
//    QueryFilter  filter )
//    throws EPPIXBusinessException, EPPIXUnexpectedException,
//      EPPIXFatalException {
//    logger.debug( "getList( state, filter )" );
//
//    return auxCustomersDAC.getList( state, filter );
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

    return auxCustomersDAC.iterate( filter );
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

    return auxCustomersDAC.iterateWithLock( filter );
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
  public AuxCustomersDMO get( QueryFilter filter )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "get( filter )" );

    //
    // Check mandatory parameters.
    //
    thrower.ifParameterMissing( "filter", filter );

    //
    // Attempt to get the AuxCustomersDMO
    //
    AuxCustomersDMO auxCustomersDMO = auxCustomersDAC.get( filter );

    return auxCustomersDMO;
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

    return auxCustomersDAC.max( filter );
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

    return auxCustomersDAC.min( filter );
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

    return Integer.valueOf(String.valueOf(auxCustomersDAC.count( filter )));
  }
}
