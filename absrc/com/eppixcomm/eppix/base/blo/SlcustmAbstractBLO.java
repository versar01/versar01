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
 * CS3 table - used by Eppix to store customer details Description of the table is as found in the Oracle version of CS3.
 *
 * This abstract business logic class holds all the logic for the Slcustm class.
 * It is extended by Slcustm class which holds the additional logic that is required, if any.
 *
 * @author
 * @version $Revision: $
 *
 * @since $jdk$
 */
public abstract class SlcustmAbstractBLO
  extends BaseBLO
  implements DTOActionTypes, BaseMessages {
  //~ Static variables/initializers //////////////////////////////////////////

  /** DOCUMENT ME! */
  static Thrower thrower = Thrower.getThrower( Slcustm.class );
  /** DOCUMENT ME! */
  protected static final String ENTITY_ID = "SLC";

  //~ Instance variables /////////////////////////////////////////////////////

  /** DOCUMENT ME! */
  protected Logger logger = thrower.getLogger(  );

  /** Data Access Controller. */
  protected SlcustmDAC slcustmDAC;

  //~ Methods ////////////////////////////////////////////////////////////////

  /** Invoked by the BLOBinder to provide this BLO with its DAC. */
  protected void setDAC( DAC dac ) {
    this.slcustmDAC = (SlcustmDAC) dac;
  }

  /**
  * Retrieve a slcustm data model object from persistent storage. The
  * slcustmDMO passed in must contain a valid existing slcustmId.
  * Optionally, the return slcustmDMO may be include a flag that indicates if
  * the slcustm object is referenced elsewhere within the module, depending on the value
  * of the getIsUsed parameter. Finally, optionally, this method can return the set of audit
  * records for the slcustm object depending on the value of the getAudits parameter.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *   <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#SLCUSTM_000}</li>
  *   <li> The normal general errors:
  *          {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>
  * </dd></dl><br>
  *
  * @param  slcustmDMO the slcustm object that must contain either the
  *         unique slcustmId or the displayCode/languageCode pair
  *
  * @return slcustmDMO the slcustm data model object
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXFatalException
  * @throws EPPIXUnexpectedException
  */
  public SlcustmDMO get( SlcustmDMO slcustmDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "get(slcustmDMO)" );

    //
    // Check mandatory parameters.
    //
    thrower.ifParameterMissing( "slcustmDMO", slcustmDMO );

    //
    // Each attribute that is part of the primary key is mandatory
    //
    thrower.ifParameterMissing( "slcustmDMO.customer",
      slcustmDMO.getCustomer(  ) );

    //
    // Attempt to get the SlcustmDMO
    //
    SlcustmDMO returnSlcustmDMO = slcustmDAC.get( slcustmDMO );

    //
    // Could not find the SlcustmDMO
    //
    if ( returnSlcustmDMO == null ) {
      thrower.business( Base_SLCUSTM_000,
        new Object[] { slcustmDMO.getCustomer(  ) } );
    }

    //
    // Now, based on the values of the flags on this method signature, which in turn,
    // are based on this objects associations, get all associated, embedded objects
    //
    return returnSlcustmDMO;
  }

  /**
   * Return a list of Slcustm objects matching the passed in values. A
   * partial match is performed on the description argument and/or the slcustms
   * displayCode. If no values have been passed in, all Slcustm objects are
   * retrieved. Note: if a language specific description does not exist, then
   * the Slcustm is retrieved with the special 'NOCODE' description.
   *
   * @param state previous state of the list
   * @param slcustmDMO SlcustmDMO object
   *
   * @return DTOList of Slcustm objects
   *
   * @throws EPPIXUnexpectedException
   */
//  public DTOList<SlcustmDMO> getList( 
//    DTOListState state,
//    SlcustmDMO   slcustmDMO )
//    throws EPPIXBusinessException, EPPIXUnexpectedException,
//      EPPIXFatalException {
//    logger.debug( "getList( state, slcustmDMO )" );
//
//    return slcustmDAC.getList( state, slcustmDMO );
//  }

  /**
  * Creates the Slcustm object. As a side effect, following creation
  * of a slcustm an audit object may be created.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param slcustmDMO slcustmDMO object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated slcustmDMO object.
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public SlcustmDMO create( SlcustmDMO slcustmDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "create( slcustmDMO )" );

    thrower.ifParameterMissing( "slcustmDMO", slcustmDMO );

    thrower.ifParameterMissing( "slcustmDMO.customer",
      slcustmDMO.getCustomer(  ) );

    thrower.ifParameterMissing( "slcustmDMO.alpha", slcustmDMO.getAlpha(  ) );

    //
    // Check that this object does not already exist 
    //
    if ( exists( slcustmDMO ) ) {
      thrower.business( Base_SLCUSTM_001,
        new Object[] { slcustmDMO.getCustomer(  ) } );
    }

    //
    // Now create the slcustm
    //
    slcustmDAC.create( slcustmDMO );

    return slcustmDMO;
  }

  /**
  * Modifies the Slcustm object. On any modification, an audit object
  * is created.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#SLCUSTM_002}</li>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param slcustmDMO slcustmDMO object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated slcustmDMO object.
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public SlcustmDMO modify( SlcustmDMO aSlcustmDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "modify( aslcustmDMO )" );

    //
    // Check mandatory parameters (
    //
    // Note: attributes stereotyped <NotModifiable> are ignored
    //
    thrower.ifParameterMissing( "aslcustmDMO", aSlcustmDMO );

    thrower.ifParameterMissing( "aSlcustmDMO.customer",
      aSlcustmDMO.getCustomer(  ) ); // attribute

    thrower.ifParameterMissing( "aSlcustmDMO.alpha", aSlcustmDMO.getAlpha(  ) ); // attribute

    SlcustmDMO updateSlcustmDMO = new SlcustmDMO(  );

    updateSlcustmDMO.setCustomer( aSlcustmDMO.getCustomer(  ) );

    updateSlcustmDMO = get( updateSlcustmDMO );

    //
    // For each relationship to single objects (does not matter if they are Embedded or Flattened)
    // either associate to a pre-existing object, or create an object then associate to it
    //

    //
    // Copy the fields to be updated. We do not want to overwrite primary keys etc.
    // All attributes stereotyped as being <NotModifiable> are skipped
    //
    updateSlcustmDMO.setAlpha( aSlcustmDMO.getAlpha(  ) );

    updateSlcustmDMO.setName( aSlcustmDMO.getName(  ) );

    updateSlcustmDMO.setAddress1( aSlcustmDMO.getAddress1(  ) );

    updateSlcustmDMO.setAddress2( aSlcustmDMO.getAddress2(  ) );

    updateSlcustmDMO.setAddress3( aSlcustmDMO.getAddress3(  ) );

    updateSlcustmDMO.setAddress4( aSlcustmDMO.getAddress4(  ) );

    updateSlcustmDMO.setAddress5( aSlcustmDMO.getAddress5(  ) );

    updateSlcustmDMO.setCreditCategory( aSlcustmDMO.getCreditCategory(  ) );

    updateSlcustmDMO.setExportIndicator( aSlcustmDMO.getExportIndicator(  ) );

    updateSlcustmDMO.setCustDiscCode( aSlcustmDMO.getCustDiscCode(  ) );

    updateSlcustmDMO.setCurrency( aSlcustmDMO.getCurrency(  ) );

    updateSlcustmDMO.setTerritory( aSlcustmDMO.getTerritory(  ) );

    updateSlcustmDMO.setKlass( aSlcustmDMO.getKlass(  ) );

    updateSlcustmDMO.setRegion( aSlcustmDMO.getRegion(  ) );

    updateSlcustmDMO.setInvoiceCustomer( aSlcustmDMO.getInvoiceCustomer(  ) );

    updateSlcustmDMO.setStatementCustomer( aSlcustmDMO.getStatementCustomer(  ) );

    updateSlcustmDMO.setGroupCustomer( aSlcustmDMO.getGroupCustomer(  ) );

    updateSlcustmDMO.setDateLastIssue( aSlcustmDMO.getDateLastIssue(  ) );

    updateSlcustmDMO.setDateCreated( aSlcustmDMO.getDateCreated(  ) );

    updateSlcustmDMO.setAnalysisCodes1( aSlcustmDMO.getAnalysisCodes1(  ) );

    updateSlcustmDMO.setAnalysisCodes2( aSlcustmDMO.getAnalysisCodes2(  ) );

    updateSlcustmDMO.setAnalysisCodes3( aSlcustmDMO.getAnalysisCodes3(  ) );

    updateSlcustmDMO.setAnalysisCodes4( aSlcustmDMO.getAnalysisCodes4(  ) );

    updateSlcustmDMO.setAnalysisCodes5( aSlcustmDMO.getAnalysisCodes5(  ) );

    updateSlcustmDMO.setReminderCat( aSlcustmDMO.getReminderCat(  ) );

    updateSlcustmDMO.setSettlementCode( aSlcustmDMO.getSettlementCode(  ) );

    updateSlcustmDMO.setSettDaysCode( aSlcustmDMO.getSettDaysCode(  ) );

    updateSlcustmDMO.setPriceList( aSlcustmDMO.getPriceList(  ) );

    updateSlcustmDMO.setLetterCode( aSlcustmDMO.getLetterCode(  ) );

    updateSlcustmDMO.setBalanceFwd( aSlcustmDMO.getBalanceFwd(  ) );

    updateSlcustmDMO.setCreditLimit( aSlcustmDMO.getCreditLimit(  ) );

    updateSlcustmDMO.setYtdSales( aSlcustmDMO.getYtdSales(  ) );

    updateSlcustmDMO.setYtdCostOfSales( aSlcustmDMO.getYtdCostOfSales(  ) );

    updateSlcustmDMO.setCumulativeSales( aSlcustmDMO.getCumulativeSales(  ) );

    updateSlcustmDMO.setOrderBalance( aSlcustmDMO.getOrderBalance(  ) );

    updateSlcustmDMO.setSalesNlCat( aSlcustmDMO.getSalesNlCat(  ) );

    updateSlcustmDMO.setSpecialPrice( aSlcustmDMO.getSpecialPrice(  ) );

    updateSlcustmDMO.setVatRegistration( aSlcustmDMO.getVatRegistration(  ) );

    updateSlcustmDMO.setDirectDebit( aSlcustmDMO.getDirectDebit(  ) );

    updateSlcustmDMO.setInvoicesPrinted( aSlcustmDMO.getInvoicesPrinted(  ) );

    updateSlcustmDMO.setConsolidatedInv( aSlcustmDMO.getConsolidatedInv(  ) );

    updateSlcustmDMO.setCommentOnlyInv( aSlcustmDMO.getCommentOnlyInv(  ) );

    updateSlcustmDMO.setBankAccountNo( aSlcustmDMO.getBankAccountNo(  ) );

    updateSlcustmDMO.setBankSortCode( aSlcustmDMO.getBankSortCode(  ) );

    updateSlcustmDMO.setBankName( aSlcustmDMO.getBankName(  ) );

    updateSlcustmDMO.setBankAddress1( aSlcustmDMO.getBankAddress1(  ) );

    updateSlcustmDMO.setBankAddress2( aSlcustmDMO.getBankAddress2(  ) );

    updateSlcustmDMO.setBankAddress3( aSlcustmDMO.getBankAddress3(  ) );

    updateSlcustmDMO.setBankAddress4( aSlcustmDMO.getBankAddress4(  ) );

    updateSlcustmDMO.setAnalysisCode6( aSlcustmDMO.getAnalysisCode6(  ) );

    updateSlcustmDMO.setProduceStatements( aSlcustmDMO.getProduceStatements(  ) );

    updateSlcustmDMO.setEdiCustomer( aSlcustmDMO.getEdiCustomer(  ) );

    updateSlcustmDMO.setVatType( aSlcustmDMO.getVatType(  ) );

    updateSlcustmDMO.setLanguage( aSlcustmDMO.getLanguage(  ) );

    updateSlcustmDMO.setDeliveryMethod( aSlcustmDMO.getDeliveryMethod(  ) );

    updateSlcustmDMO.setCarrier( aSlcustmDMO.getCarrier(  ) );

    updateSlcustmDMO.setVatRegNumber( aSlcustmDMO.getVatRegNumber(  ) );

    updateSlcustmDMO.setVatExeNumber( aSlcustmDMO.getVatExeNumber(  ) );

    updateSlcustmDMO.setPaydays1( aSlcustmDMO.getPaydays1(  ) );

    updateSlcustmDMO.setPaydays2( aSlcustmDMO.getPaydays2(  ) );

    updateSlcustmDMO.setPaydays3( aSlcustmDMO.getPaydays3(  ) );

    updateSlcustmDMO.setBankBranchCode( aSlcustmDMO.getBankBranchCode(  ) );

    updateSlcustmDMO.setPrintCpWithStat( aSlcustmDMO.getPrintCpWithStat(  ) );

    updateSlcustmDMO.setPaymentMethod( aSlcustmDMO.getPaymentMethod(  ) );

    updateSlcustmDMO.setCustomerClass( aSlcustmDMO.getCustomerClass(  ) );

    updateSlcustmDMO.setSalesType( aSlcustmDMO.getSalesType(  ) );

    updateSlcustmDMO.setCpLowerValue( aSlcustmDMO.getCpLowerValue(  ) );

    updateSlcustmDMO.setAddress6( aSlcustmDMO.getAddress6(  ) );

    updateSlcustmDMO.setFax( aSlcustmDMO.getFax(  ) );

    updateSlcustmDMO.setTelex( aSlcustmDMO.getTelex(  ) );

    updateSlcustmDMO.setBtx( aSlcustmDMO.getBtx(  ) );

    updateSlcustmDMO.setCpCharge( aSlcustmDMO.getCpCharge(  ) );

    updateSlcustmDMO.setControlDigit( aSlcustmDMO.getControlDigit(  ) );

    updateSlcustmDMO.setPayer( aSlcustmDMO.getPayer(  ) );

    updateSlcustmDMO.setResponsibility( aSlcustmDMO.getResponsibility(  ) );

    updateSlcustmDMO.setDespatchHeld( aSlcustmDMO.getDespatchHeld(  ) );

    updateSlcustmDMO.setCreditController( aSlcustmDMO.getCreditController(  ) );

    updateSlcustmDMO.setReminderLetters( aSlcustmDMO.getReminderLetters(  ) );

    updateSlcustmDMO.setSeverityDays1( aSlcustmDMO.getSeverityDays1(  ) );

    updateSlcustmDMO.setSeverityDays2( aSlcustmDMO.getSeverityDays2(  ) );

    updateSlcustmDMO.setSeverityDays3( aSlcustmDMO.getSeverityDays3(  ) );

    updateSlcustmDMO.setSeverityDays4( aSlcustmDMO.getSeverityDays4(  ) );

    updateSlcustmDMO.setSeverityDays5( aSlcustmDMO.getSeverityDays5(  ) );

    updateSlcustmDMO.setSeverityDays6( aSlcustmDMO.getSeverityDays6(  ) );

    updateSlcustmDMO.setDeliveryReason( aSlcustmDMO.getDeliveryReason(  ) );

    updateSlcustmDMO.setShipperCode1( aSlcustmDMO.getShipperCode1(  ) );

    updateSlcustmDMO.setShipperCode2( aSlcustmDMO.getShipperCode2(  ) );

    updateSlcustmDMO.setShipperCode3( aSlcustmDMO.getShipperCode3(  ) );

    updateSlcustmDMO.setShippingNoteInd( aSlcustmDMO.getShippingNoteInd(  ) );

    updateSlcustmDMO.setAccountType( aSlcustmDMO.getAccountType(  ) );

    updateSlcustmDMO.setAdminFee( aSlcustmDMO.getAdminFee(  ) );

    updateSlcustmDMO.setIntrestRate( aSlcustmDMO.getIntrestRate(  ) );

    //
    // Modify the slcustmDMO
    //
    slcustmDAC.modify( updateSlcustmDMO );

    // Create a new DMO, set keys, and fetch from the database...
    SlcustmDMO returnSlcustmDMO = new SlcustmDMO(  );

    returnSlcustmDMO.setCustomer( updateSlcustmDMO.getCustomer(  ) );

    returnSlcustmDMO = get( returnSlcustmDMO );

    return returnSlcustmDMO;
  }

  /**
  * Modifies the Slcustm object.
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#ECEVENTCOMMAND_002}</li>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>
  * </dd></dl><br>
  * @param SlcustmDMO object<br>
  * @param filter object<br>
  *   <dl><dd>
  *   </dd></dl><br>
  *
  * @return populated slcustmDMO object.
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
    // Modify the slcustmDMO
    //
    slcustmDAC.modify( filter );
  }

  /**
   * Deletes the Slcustm object. On deletion, an audit object is created
   * <p>
   * <B>Possible application exceptions:</B>
   * <dl><dd>Base_SLCUSTM_003
   *     <li>{@link #Base#SLCUSTM_000} if the Slcustm does not exist.</li>
   *     <li>{@link #Base#SLCUSTM_003} if the Slcustm is in use.</li>
   *     <li>The normal general errors:
   *          {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>
   * </dd></dl>
   *  @param SlcustmDMO Slcustm object with embedded displayCode and
   *        languageCode.
   *
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public void delete( SlcustmDMO slcustmDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "delete( slcustmDMO )" );

    thrower.ifParameterMissing( "slcustmDMO", slcustmDMO );

    SlcustmDMO updateSlcustmDMO = null;

    updateSlcustmDMO = get( slcustmDMO );

    // delete self...
    slcustmDAC.delete( slcustmDMO );
  }

  /**
   * Deletes the Slcustm object.
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
    slcustmDAC.delete( filter );
  }

  /**
  * Indicates whether a Slcustm exists in the database
  * <p>
  * <B>Possible application exceptions:</B>
  * <dl><dd>
  *     <li>The normal general errors:
  *          {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>
  * </dd></dl>
  *
  *
  * @return true if the Slcustm exists in the database
  *
  * @throws EPPIXBusinessException
  * @throws EPPIXUnexpectedException
  * @throws EPPIXFatalException
  */
  public boolean exists( SlcustmDMO slcustmDMO )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "exists(slcustm)" );

    thrower.ifParameterMissing( "slcustmDMO", slcustmDMO );

    thrower.ifParameterMissing( "slcustmDMO.customer",
      slcustmDMO.getCustomer(  ) );

    return slcustmDAC.exists( slcustmDMO );
  }

  /**
   * Indicates whether a Slcustm exists in the database
   * <p>
   * <B>Possible application exceptions:</B>
   * <dl><dd>
   *     <li>The normal general errors:
   *          {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>
   * </dd></dl>
   *
   *
   * @return true if the Slcustm exists in the database
   *
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
  public boolean exists( QueryFilter filter )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "exists(filter)" );

    return slcustmDAC.exists( filter );
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
//  public DTOList<SlcustmDMO> getList( 
//    DTOListState state,
//    QueryFilter  filter )
//    throws EPPIXBusinessException, EPPIXUnexpectedException,
//      EPPIXFatalException {
//    logger.debug( "getList( state, filter )" );
//
//    return slcustmDAC.getList( state, filter );
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

    return slcustmDAC.iterate( filter );
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

    return slcustmDAC.iterateWithLock( filter );
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
  public SlcustmDMO get( QueryFilter filter )
    throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug( "get( filter )" );

    //
    // Check mandatory parameters.
    //
    thrower.ifParameterMissing( "filter", filter );

    //
    // Attempt to get the SlcustmDMO
    //
    SlcustmDMO slcustmDMO = slcustmDAC.get( filter );

    return slcustmDMO;
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

    return slcustmDAC.max( filter );
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

    return slcustmDAC.min( filter );
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

    return Integer.valueOf(String.valueOf(slcustmDAC.count( filter )));
  }
}
