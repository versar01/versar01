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
 * Slcustm Business Object.
 *
 * @version $Revision: 1.2 $
 * @author $Author$
 * @since $jdk$
 */
public class SlcustmAbstractDACImpl
  extends DAC
  implements SlcustmAbstractDAC {
  //~ Static variables/initializers //////////////////////////////////////////

  /** Error handler/logger. */
  static DAOThrower thrower = DAOThrower.getDAOThrower( SlcustmAbstractDACImpl.class );

  //~ Instance variables /////////////////////////////////////////////////////

  /** DOCUMENT ME! */
  Logger logger = thrower.getLogger(  );

  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new SlcustmDACImpl object.
   *
   * @param dao Data Access Object.
   * @param defaultLanguageCode the working language of the user, dictates
   *        which language specific descriptions are retrieved.
   */
  public SlcustmAbstractDACImpl( 
    DAO         dao ) {
    super(  dao, thrower );
  }

  //~ Methods ////////////////////////////////////////////////////////////////

  /**
   * Retrieves a Slcustm Data Model Object
   *
   * @return a populated Slcustm Data Model Object or null if not found.
   *
   * @throws EPPIXSeriousException
   */
  public SlcustmDMO get( SlcustmDMO slcustmDMO )
    throws EPPIXSeriousException {
    logger.debug( "get( SlcustmDMO )" );

    thrower.ifParameterMissing( "SlcustmDMO", slcustmDMO );

    return (SlcustmDMO) dao.get( slcustmDMO );
  }

  /**
   * Creates the Slcustm object in the database.
   *
   * @param SlcustmDMO slcustmDMO
   *
   * @throws EPPIXSeriousException
   */
  public void create( SlcustmDMO slcustmDMO )
    throws EPPIXSeriousException {
    logger.debug( "create( slcustmDMO )" );
    thrower.ifParameterMissing( "SlcustmDMO", slcustmDMO );

    dao.insert( slcustmDMO );
  }

  /**
   * Locks and retrieves the Slcustm object from the database.
   *
   * @param aSlcustm Slcustm object
   *
   * @return a populated Slcustm object or null if not found.
   *
   * @throws EPPIXSeriousException
   */
  public SlcustmDMO lock( SlcustmDMO aSlcustmDMO )
    throws EPPIXSeriousException, EPPIXObjectBusyException {
    logger.debug( "lock( aSlcustmDMO )" );

    thrower.ifParameterMissing( "aSlcustmDMO", aSlcustmDMO );

    SlcustmDMO lockedSlcustmDMO = null;

    //
    // Lock the base table on its primary key.
    //
    lockedSlcustmDMO = (SlcustmDMO) dao.lock( "Slcustm",
        "filterByPrimaryKey",
        new DAOArgs( 1 ).arg( aSlcustmDMO.getCustomer(  ) ) );

    return lockedSlcustmDMO;
  }

  /**
   * Modifies the Slcustm object in the database.
   *
   * @param SlcustmDMO Slcustm object
   *
   * @throws EPPIXSeriousException
   * @throws EPPIXObjectExpiredException
   * @throws EPPIXObjectNotFoundException
   */
  public void modify( SlcustmDMO slcustmDMO )
    throws EPPIXSeriousException, EPPIXObjectExpiredException,
      EPPIXObjectNotFoundException {
    logger.debug( "modify( aSlcustmDMO )" );

    thrower.ifParameterMissing( "aSlcustmDMO", slcustmDMO );

    thrower.ifParameterMissing( "SlcustmDMO.customer",
      slcustmDMO.getCustomer(  ) );

    dao.update( slcustmDMO );
  }

  /**
  * Modifies the Slcustm object using the specified filter in the database.
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

    dao.updateCustom( new SlcustmDMO(  ), filterQueryArgs( filter, null ) );
  }

  /**
   * Deletes the Slcustm object from the database.
   *
   * @param SlcustmDMO Slcustm object
   *
   * @throws EPPIXSeriousException
   * @throws EPPIXObjectNotFoundException
   * @throws EPPIXObjectExpiredException
   */
  public void delete( SlcustmDMO slcustmDMO )
    throws EPPIXSeriousException, EPPIXObjectNotFoundException,
      EPPIXObjectExpiredException {
    logger.debug( "delete( SlcustmDMO )" );

    thrower.ifParameterMissing( "SlcustmDMO", slcustmDMO );

    thrower.ifParameterMissing( "SlcustmDMO.customer",
      slcustmDMO.getCustomer(  ) );

    dao.delete( slcustmDMO );
  }

  /**
   * Deletes the Slcustm object from the database.
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

    dao.delete( "Slcustm", args.getFilterBy(  ), args );
  }

  /**
  * Return true if a Slcustm object exists.
  *
  * @param SlcustmDMO SlcustmDMO
  *
  * @return true if the Slcustm object exists.
  *
  * @throws EPPIXSeriousException
  */
  public boolean exists( SlcustmDMO SlcustmDMO )
    throws EPPIXSeriousException {
    logger.debug( "exists( SlcustmDMO)" );

    return dao.exists( "Slcustm", "filterByPrimaryKey",
      new DAOArgs( 1 ).arg( SlcustmDMO.getCustomer(  ) ) );
  }

  /**
    * Return true if a Slcustm object exists.
    *
    * @param filter
    *
    * @return true if the Slcustm object exists.
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
   * @param locationDMO Slcustm Data Model Object
   *
   * @return DTOList of Slcustm Data Model Objects.
   *
   * @throws EPPIXSeriousException
   */
//  public DTOList<SlcustmDMO> getList( 
//    DTOListState state,
//    SlcustmDMO   slcustmDMO )
//    throws EPPIXSeriousException {
//    logger.debug( "getList( state, slcustmDMO )" );
//
//    return dao.getListAbs( state, paramQueryArgs( slcustmDMO ) );
//  }

  /**
   * Constructs parameterised query arguments.
   *
   * @param $(dataObjectNameLowerCamel} SlcustmDMO object.
   */
  protected DAOParamQueryArgs paramQueryArgs( SlcustmDMO slcustmDMO ) {
    logger.debug( "paramQueryArgs( slcustmDMO)" );

    DAOParamQueryArgs queryArgs = new DAOParamQueryArgs( "Slcustm", 93 * 2 );

    if ( slcustmDMO != null ) {
      // primary key filters...
      String customer = slcustmDMO.getCustomer(  );

      if ( !DMO.isNull( customer ) ) {
        queryArgs.andFilterBy( "CustomerMatch" )
                 .arg( customer + dao.wildcardForAnySequence(  ) );
      }

      // define more filters...
      String alpha = slcustmDMO.getAlpha(  );

      if ( !DMO.isNull( alpha ) ) {
        queryArgs.andFilterBy( "AlphaMatch" )
                 .arg( alpha + dao.wildcardForAnySequence(  ) );
      }

      String name = slcustmDMO.getName(  );

      if ( !DMO.isNull( name ) ) {
        queryArgs.andFilterBy( "NameMatch" )
                 .arg( name + dao.wildcardForAnySequence(  ) );
      }

      String address1 = slcustmDMO.getAddress1(  );

      if ( !DMO.isNull( address1 ) ) {
        queryArgs.andFilterBy( "Address1Match" )
                 .arg( address1 + dao.wildcardForAnySequence(  ) );
      }

      String address2 = slcustmDMO.getAddress2(  );

      if ( !DMO.isNull( address2 ) ) {
        queryArgs.andFilterBy( "Address2Match" )
                 .arg( address2 + dao.wildcardForAnySequence(  ) );
      }

      String address3 = slcustmDMO.getAddress3(  );

      if ( !DMO.isNull( address3 ) ) {
        queryArgs.andFilterBy( "Address3Match" )
                 .arg( address3 + dao.wildcardForAnySequence(  ) );
      }

      String address4 = slcustmDMO.getAddress4(  );

      if ( !DMO.isNull( address4 ) ) {
        queryArgs.andFilterBy( "Address4Match" )
                 .arg( address4 + dao.wildcardForAnySequence(  ) );
      }

      String address5 = slcustmDMO.getAddress5(  );

      if ( !DMO.isNull( address5 ) ) {
        queryArgs.andFilterBy( "Address5Match" )
                 .arg( address5 + dao.wildcardForAnySequence(  ) );
      }

      String creditCategory = slcustmDMO.getCreditCategory(  );

      if ( !DMO.isNull( creditCategory ) ) {
        queryArgs.andFilterBy( "CreditCategoryMatch" )
                 .arg( creditCategory + dao.wildcardForAnySequence(  ) );
      }

      String exportIndicator = slcustmDMO.getExportIndicator(  );

      if ( !DMO.isNull( exportIndicator ) ) {
        queryArgs.andFilterBy( "ExportIndicatorMatch" )
                 .arg( exportIndicator + dao.wildcardForAnySequence(  ) );
      }

      String custDiscCode = slcustmDMO.getCustDiscCode(  );

      if ( !DMO.isNull( custDiscCode ) ) {
        queryArgs.andFilterBy( "CustDiscCodeMatch" )
                 .arg( custDiscCode + dao.wildcardForAnySequence(  ) );
      }

      String currency = slcustmDMO.getCurrency(  );

      if ( !DMO.isNull( currency ) ) {
        queryArgs.andFilterBy( "CurrencyMatch" )
                 .arg( currency + dao.wildcardForAnySequence(  ) );
      }

      String territory = slcustmDMO.getTerritory(  );

      if ( !DMO.isNull( territory ) ) {
        queryArgs.andFilterBy( "TerritoryMatch" )
                 .arg( territory + dao.wildcardForAnySequence(  ) );
      }

      String klass = slcustmDMO.getKlass(  );

      if ( !DMO.isNull( klass ) ) {
        queryArgs.andFilterBy( "KlassMatch" )
                 .arg( klass + dao.wildcardForAnySequence(  ) );
      }

      String region = slcustmDMO.getRegion(  );

      if ( !DMO.isNull( region ) ) {
        queryArgs.andFilterBy( "RegionMatch" )
                 .arg( region + dao.wildcardForAnySequence(  ) );
      }

      String invoiceCustomer = slcustmDMO.getInvoiceCustomer(  );

      if ( !DMO.isNull( invoiceCustomer ) ) {
        queryArgs.andFilterBy( "InvoiceCustomerMatch" )
                 .arg( invoiceCustomer + dao.wildcardForAnySequence(  ) );
      }

      String statementCustomer = slcustmDMO.getStatementCustomer(  );

      if ( !DMO.isNull( statementCustomer ) ) {
        queryArgs.andFilterBy( "StatementCustomerMatch" )
                 .arg( statementCustomer + dao.wildcardForAnySequence(  ) );
      }

      String groupCustomer = slcustmDMO.getGroupCustomer(  );

      if ( !DMO.isNull( groupCustomer ) ) {
        queryArgs.andFilterBy( "GroupCustomerMatch" )
                 .arg( groupCustomer + dao.wildcardForAnySequence(  ) );
      }

      String analysisCodes1 = slcustmDMO.getAnalysisCodes1(  );

      if ( !DMO.isNull( analysisCodes1 ) ) {
        queryArgs.andFilterBy( "AnalysisCodes1Match" )
                 .arg( analysisCodes1 + dao.wildcardForAnySequence(  ) );
      }

      String analysisCodes2 = slcustmDMO.getAnalysisCodes2(  );

      if ( !DMO.isNull( analysisCodes2 ) ) {
        queryArgs.andFilterBy( "AnalysisCodes2Match" )
                 .arg( analysisCodes2 + dao.wildcardForAnySequence(  ) );
      }

      String analysisCodes3 = slcustmDMO.getAnalysisCodes3(  );

      if ( !DMO.isNull( analysisCodes3 ) ) {
        queryArgs.andFilterBy( "AnalysisCodes3Match" )
                 .arg( analysisCodes3 + dao.wildcardForAnySequence(  ) );
      }

      String analysisCodes4 = slcustmDMO.getAnalysisCodes4(  );

      if ( !DMO.isNull( analysisCodes4 ) ) {
        queryArgs.andFilterBy( "AnalysisCodes4Match" )
                 .arg( analysisCodes4 + dao.wildcardForAnySequence(  ) );
      }

      String analysisCodes5 = slcustmDMO.getAnalysisCodes5(  );

      if ( !DMO.isNull( analysisCodes5 ) ) {
        queryArgs.andFilterBy( "AnalysisCodes5Match" )
                 .arg( analysisCodes5 + dao.wildcardForAnySequence(  ) );
      }

      String reminderCat = slcustmDMO.getReminderCat(  );

      if ( !DMO.isNull( reminderCat ) ) {
        queryArgs.andFilterBy( "ReminderCatMatch" )
                 .arg( reminderCat + dao.wildcardForAnySequence(  ) );
      }

      String settlementCode = slcustmDMO.getSettlementCode(  );

      if ( !DMO.isNull( settlementCode ) ) {
        queryArgs.andFilterBy( "SettlementCodeMatch" )
                 .arg( settlementCode + dao.wildcardForAnySequence(  ) );
      }

      String settDaysCode = slcustmDMO.getSettDaysCode(  );

      if ( !DMO.isNull( settDaysCode ) ) {
        queryArgs.andFilterBy( "SettDaysCodeMatch" )
                 .arg( settDaysCode + dao.wildcardForAnySequence(  ) );
      }

      String priceList = slcustmDMO.getPriceList(  );

      if ( !DMO.isNull( priceList ) ) {
        queryArgs.andFilterBy( "PriceListMatch" )
                 .arg( priceList + dao.wildcardForAnySequence(  ) );
      }

      String letterCode = slcustmDMO.getLetterCode(  );

      if ( !DMO.isNull( letterCode ) ) {
        queryArgs.andFilterBy( "LetterCodeMatch" )
                 .arg( letterCode + dao.wildcardForAnySequence(  ) );
      }

      String balanceFwd = slcustmDMO.getBalanceFwd(  );

      if ( !DMO.isNull( balanceFwd ) ) {
        queryArgs.andFilterBy( "BalanceFwdMatch" )
                 .arg( balanceFwd + dao.wildcardForAnySequence(  ) );
      }

      String salesNlCat = slcustmDMO.getSalesNlCat(  );

      if ( !DMO.isNull( salesNlCat ) ) {
        queryArgs.andFilterBy( "SalesNlCatMatch" )
                 .arg( salesNlCat + dao.wildcardForAnySequence(  ) );
      }

      String specialPrice = slcustmDMO.getSpecialPrice(  );

      if ( !DMO.isNull( specialPrice ) ) {
        queryArgs.andFilterBy( "SpecialPriceMatch" )
                 .arg( specialPrice + dao.wildcardForAnySequence(  ) );
      }

      String vatRegistration = slcustmDMO.getVatRegistration(  );

      if ( !DMO.isNull( vatRegistration ) ) {
        queryArgs.andFilterBy( "VatRegistrationMatch" )
                 .arg( vatRegistration + dao.wildcardForAnySequence(  ) );
      }

      String directDebit = slcustmDMO.getDirectDebit(  );

      if ( !DMO.isNull( directDebit ) ) {
        queryArgs.andFilterBy( "DirectDebitMatch" )
                 .arg( directDebit + dao.wildcardForAnySequence(  ) );
      }

      String invoicesPrinted = slcustmDMO.getInvoicesPrinted(  );

      if ( !DMO.isNull( invoicesPrinted ) ) {
        queryArgs.andFilterBy( "InvoicesPrintedMatch" )
                 .arg( invoicesPrinted + dao.wildcardForAnySequence(  ) );
      }

      String consolidatedInv = slcustmDMO.getConsolidatedInv(  );

      if ( !DMO.isNull( consolidatedInv ) ) {
        queryArgs.andFilterBy( "ConsolidatedInvMatch" )
                 .arg( consolidatedInv + dao.wildcardForAnySequence(  ) );
      }

      String commentOnlyInv = slcustmDMO.getCommentOnlyInv(  );

      if ( !DMO.isNull( commentOnlyInv ) ) {
        queryArgs.andFilterBy( "CommentOnlyInvMatch" )
                 .arg( commentOnlyInv + dao.wildcardForAnySequence(  ) );
      }

      String bankAccountNo = slcustmDMO.getBankAccountNo(  );

      if ( !DMO.isNull( bankAccountNo ) ) {
        queryArgs.andFilterBy( "BankAccountNoMatch" )
                 .arg( bankAccountNo + dao.wildcardForAnySequence(  ) );
      }

      String bankSortCode = slcustmDMO.getBankSortCode(  );

      if ( !DMO.isNull( bankSortCode ) ) {
        queryArgs.andFilterBy( "BankSortCodeMatch" )
                 .arg( bankSortCode + dao.wildcardForAnySequence(  ) );
      }

      String bankName = slcustmDMO.getBankName(  );

      if ( !DMO.isNull( bankName ) ) {
        queryArgs.andFilterBy( "BankNameMatch" )
                 .arg( bankName + dao.wildcardForAnySequence(  ) );
      }

      String bankAddress1 = slcustmDMO.getBankAddress1(  );

      if ( !DMO.isNull( bankAddress1 ) ) {
        queryArgs.andFilterBy( "BankAddress1Match" )
                 .arg( bankAddress1 + dao.wildcardForAnySequence(  ) );
      }

      String bankAddress2 = slcustmDMO.getBankAddress2(  );

      if ( !DMO.isNull( bankAddress2 ) ) {
        queryArgs.andFilterBy( "BankAddress2Match" )
                 .arg( bankAddress2 + dao.wildcardForAnySequence(  ) );
      }

      String bankAddress3 = slcustmDMO.getBankAddress3(  );

      if ( !DMO.isNull( bankAddress3 ) ) {
        queryArgs.andFilterBy( "BankAddress3Match" )
                 .arg( bankAddress3 + dao.wildcardForAnySequence(  ) );
      }

      String bankAddress4 = slcustmDMO.getBankAddress4(  );

      if ( !DMO.isNull( bankAddress4 ) ) {
        queryArgs.andFilterBy( "BankAddress4Match" )
                 .arg( bankAddress4 + dao.wildcardForAnySequence(  ) );
      }

      String analysisCode6 = slcustmDMO.getAnalysisCode6(  );

      if ( !DMO.isNull( analysisCode6 ) ) {
        queryArgs.andFilterBy( "AnalysisCode6Match" )
                 .arg( analysisCode6 + dao.wildcardForAnySequence(  ) );
      }

      String produceStatements = slcustmDMO.getProduceStatements(  );

      if ( !DMO.isNull( produceStatements ) ) {
        queryArgs.andFilterBy( "ProduceStatementsMatch" )
                 .arg( produceStatements + dao.wildcardForAnySequence(  ) );
      }

      String ediCustomer = slcustmDMO.getEdiCustomer(  );

      if ( !DMO.isNull( ediCustomer ) ) {
        queryArgs.andFilterBy( "EdiCustomerMatch" )
                 .arg( ediCustomer + dao.wildcardForAnySequence(  ) );
      }

      String vatType = slcustmDMO.getVatType(  );

      if ( !DMO.isNull( vatType ) ) {
        queryArgs.andFilterBy( "VatTypeMatch" )
                 .arg( vatType + dao.wildcardForAnySequence(  ) );
      }

      String language = slcustmDMO.getLanguage(  );

      if ( !DMO.isNull( language ) ) {
        queryArgs.andFilterBy( "LanguageMatch" )
                 .arg( language + dao.wildcardForAnySequence(  ) );
      }

      String deliveryMethod = slcustmDMO.getDeliveryMethod(  );

      if ( !DMO.isNull( deliveryMethod ) ) {
        queryArgs.andFilterBy( "DeliveryMethodMatch" )
                 .arg( deliveryMethod + dao.wildcardForAnySequence(  ) );
      }

      String carrier = slcustmDMO.getCarrier(  );

      if ( !DMO.isNull( carrier ) ) {
        queryArgs.andFilterBy( "CarrierMatch" )
                 .arg( carrier + dao.wildcardForAnySequence(  ) );
      }

      String vatRegNumber = slcustmDMO.getVatRegNumber(  );

      if ( !DMO.isNull( vatRegNumber ) ) {
        queryArgs.andFilterBy( "VatRegNumberMatch" )
                 .arg( vatRegNumber + dao.wildcardForAnySequence(  ) );
      }

      String vatExeNumber = slcustmDMO.getVatExeNumber(  );

      if ( !DMO.isNull( vatExeNumber ) ) {
        queryArgs.andFilterBy( "VatExeNumberMatch" )
                 .arg( vatExeNumber + dao.wildcardForAnySequence(  ) );
      }

      String paydays1 = slcustmDMO.getPaydays1(  );

      if ( !DMO.isNull( paydays1 ) ) {
        queryArgs.andFilterBy( "Paydays1Match" )
                 .arg( paydays1 + dao.wildcardForAnySequence(  ) );
      }

      String paydays2 = slcustmDMO.getPaydays2(  );

      if ( !DMO.isNull( paydays2 ) ) {
        queryArgs.andFilterBy( "Paydays2Match" )
                 .arg( paydays2 + dao.wildcardForAnySequence(  ) );
      }

      String paydays3 = slcustmDMO.getPaydays3(  );

      if ( !DMO.isNull( paydays3 ) ) {
        queryArgs.andFilterBy( "Paydays3Match" )
                 .arg( paydays3 + dao.wildcardForAnySequence(  ) );
      }

      String bankBranchCode = slcustmDMO.getBankBranchCode(  );

      if ( !DMO.isNull( bankBranchCode ) ) {
        queryArgs.andFilterBy( "BankBranchCodeMatch" )
                 .arg( bankBranchCode + dao.wildcardForAnySequence(  ) );
      }

      String printCpWithStat = slcustmDMO.getPrintCpWithStat(  );

      if ( !DMO.isNull( printCpWithStat ) ) {
        queryArgs.andFilterBy( "PrintCpWithStatMatch" )
                 .arg( printCpWithStat + dao.wildcardForAnySequence(  ) );
      }

      String paymentMethod = slcustmDMO.getPaymentMethod(  );

      if ( !DMO.isNull( paymentMethod ) ) {
        queryArgs.andFilterBy( "PaymentMethodMatch" )
                 .arg( paymentMethod + dao.wildcardForAnySequence(  ) );
      }

      String customerClass = slcustmDMO.getCustomerClass(  );

      if ( !DMO.isNull( customerClass ) ) {
        queryArgs.andFilterBy( "CustomerClassMatch" )
                 .arg( customerClass + dao.wildcardForAnySequence(  ) );
      }

      String salesType = slcustmDMO.getSalesType(  );

      if ( !DMO.isNull( salesType ) ) {
        queryArgs.andFilterBy( "SalesTypeMatch" )
                 .arg( salesType + dao.wildcardForAnySequence(  ) );
      }

      String address6 = slcustmDMO.getAddress6(  );

      if ( !DMO.isNull( address6 ) ) {
        queryArgs.andFilterBy( "Address6Match" )
                 .arg( address6 + dao.wildcardForAnySequence(  ) );
      }

      String fax = slcustmDMO.getFax(  );

      if ( !DMO.isNull( fax ) ) {
        queryArgs.andFilterBy( "FaxMatch" )
                 .arg( fax + dao.wildcardForAnySequence(  ) );
      }

      String telex = slcustmDMO.getTelex(  );

      if ( !DMO.isNull( telex ) ) {
        queryArgs.andFilterBy( "TelexMatch" )
                 .arg( telex + dao.wildcardForAnySequence(  ) );
      }

      String btx = slcustmDMO.getBtx(  );

      if ( !DMO.isNull( btx ) ) {
        queryArgs.andFilterBy( "BtxMatch" )
                 .arg( btx + dao.wildcardForAnySequence(  ) );
      }

      String cpCharge = slcustmDMO.getCpCharge(  );

      if ( !DMO.isNull( cpCharge ) ) {
        queryArgs.andFilterBy( "CpChargeMatch" )
                 .arg( cpCharge + dao.wildcardForAnySequence(  ) );
      }

      String controlDigit = slcustmDMO.getControlDigit(  );

      if ( !DMO.isNull( controlDigit ) ) {
        queryArgs.andFilterBy( "ControlDigitMatch" )
                 .arg( controlDigit + dao.wildcardForAnySequence(  ) );
      }

      String payer = slcustmDMO.getPayer(  );

      if ( !DMO.isNull( payer ) ) {
        queryArgs.andFilterBy( "PayerMatch" )
                 .arg( payer + dao.wildcardForAnySequence(  ) );
      }

      String responsibility = slcustmDMO.getResponsibility(  );

      if ( !DMO.isNull( responsibility ) ) {
        queryArgs.andFilterBy( "ResponsibilityMatch" )
                 .arg( responsibility + dao.wildcardForAnySequence(  ) );
      }

      String despatchHeld = slcustmDMO.getDespatchHeld(  );

      if ( !DMO.isNull( despatchHeld ) ) {
        queryArgs.andFilterBy( "DespatchHeldMatch" )
                 .arg( despatchHeld + dao.wildcardForAnySequence(  ) );
      }

      String creditController = slcustmDMO.getCreditController(  );

      if ( !DMO.isNull( creditController ) ) {
        queryArgs.andFilterBy( "CreditControllerMatch" )
                 .arg( creditController + dao.wildcardForAnySequence(  ) );
      }

      String reminderLetters = slcustmDMO.getReminderLetters(  );

      if ( !DMO.isNull( reminderLetters ) ) {
        queryArgs.andFilterBy( "ReminderLettersMatch" )
                 .arg( reminderLetters + dao.wildcardForAnySequence(  ) );
      }

      String deliveryReason = slcustmDMO.getDeliveryReason(  );

      if ( !DMO.isNull( deliveryReason ) ) {
        queryArgs.andFilterBy( "DeliveryReasonMatch" )
                 .arg( deliveryReason + dao.wildcardForAnySequence(  ) );
      }

      String shipperCode1 = slcustmDMO.getShipperCode1(  );

      if ( !DMO.isNull( shipperCode1 ) ) {
        queryArgs.andFilterBy( "ShipperCode1Match" )
                 .arg( shipperCode1 + dao.wildcardForAnySequence(  ) );
      }

      String shipperCode2 = slcustmDMO.getShipperCode2(  );

      if ( !DMO.isNull( shipperCode2 ) ) {
        queryArgs.andFilterBy( "ShipperCode2Match" )
                 .arg( shipperCode2 + dao.wildcardForAnySequence(  ) );
      }

      String shipperCode3 = slcustmDMO.getShipperCode3(  );

      if ( !DMO.isNull( shipperCode3 ) ) {
        queryArgs.andFilterBy( "ShipperCode3Match" )
                 .arg( shipperCode3 + dao.wildcardForAnySequence(  ) );
      }

      String shippingNoteInd = slcustmDMO.getShippingNoteInd(  );

      if ( !DMO.isNull( shippingNoteInd ) ) {
        queryArgs.andFilterBy( "ShippingNoteIndMatch" )
                 .arg( shippingNoteInd + dao.wildcardForAnySequence(  ) );
      }

      String accountType = slcustmDMO.getAccountType(  );

      if ( !DMO.isNull( accountType ) ) {
        queryArgs.andFilterBy( "AccountTypeMatch" )
                 .arg( accountType + dao.wildcardForAnySequence(  ) );
      }

      String adminFee = slcustmDMO.getAdminFee(  );

      if ( !DMO.isNull( adminFee ) ) {
        queryArgs.andFilterBy( "AdminFeeMatch" )
                 .arg( adminFee + dao.wildcardForAnySequence(  ) );
      }

      String intrestRate = slcustmDMO.getIntrestRate(  );

      if ( !DMO.isNull( intrestRate ) ) {
        queryArgs.andFilterBy( "IntrestRateMatch" )
                 .arg( intrestRate + dao.wildcardForAnySequence(  ) );
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
//  public DTOList<SlcustmDMO> getList( 
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
        ? "Slcustm" : dmlName, parts.size(  ) );

    for ( Iterator i = parts.iterator(); i.hasNext(); ) {
      FilterPart part = (FilterPart) i.next();

      switch ( part.getIndex(  ) ) {
        case SlcustmDMO.customerFilter:
          part.andFilterBy( queryArgs, "Customer",
            dao.wildcardForAnySequence(  ) );

          break;

        case SlcustmDMO.alphaFilter:
          part.andFilterBy( queryArgs, "Alpha", dao.wildcardForAnySequence(  ) );

          break;

        case SlcustmDMO.nameFilter:
          part.andFilterBy( queryArgs, "Name", dao.wildcardForAnySequence(  ) );

          break;

        case SlcustmDMO.address1Filter:
          part.andFilterBy( queryArgs, "Address1",
            dao.wildcardForAnySequence(  ) );

          break;

        case SlcustmDMO.address2Filter:
          part.andFilterBy( queryArgs, "Address2",
            dao.wildcardForAnySequence(  ) );

          break;

        case SlcustmDMO.address3Filter:
          part.andFilterBy( queryArgs, "Address3",
            dao.wildcardForAnySequence(  ) );

          break;

        case SlcustmDMO.address4Filter:
          part.andFilterBy( queryArgs, "Address4",
            dao.wildcardForAnySequence(  ) );

          break;

        case SlcustmDMO.address5Filter:
          part.andFilterBy( queryArgs, "Address5",
            dao.wildcardForAnySequence(  ) );

          break;

        case SlcustmDMO.creditCategoryFilter:
          part.andFilterBy( queryArgs, "CreditCategory",
            dao.wildcardForAnySequence(  ) );

          break;

        case SlcustmDMO.exportIndicatorFilter:
          part.andFilterBy( queryArgs, "ExportIndicator",
            dao.wildcardForAnySequence(  ) );

          break;

        case SlcustmDMO.custDiscCodeFilter:
          part.andFilterBy( queryArgs, "CustDiscCode",
            dao.wildcardForAnySequence(  ) );

          break;

        case SlcustmDMO.currencyFilter:
          part.andFilterBy( queryArgs, "Currency",
            dao.wildcardForAnySequence(  ) );

          break;

        case SlcustmDMO.territoryFilter:
          part.andFilterBy( queryArgs, "Territory",
            dao.wildcardForAnySequence(  ) );

          break;

        case SlcustmDMO.klassFilter:
          part.andFilterBy( queryArgs, "Klass", dao.wildcardForAnySequence(  ) );

          break;

        case SlcustmDMO.regionFilter:
          part.andFilterBy( queryArgs, "Region",
            dao.wildcardForAnySequence(  ) );

          break;

        case SlcustmDMO.invoiceCustomerFilter:
          part.andFilterBy( queryArgs, "InvoiceCustomer",
            dao.wildcardForAnySequence(  ) );

          break;

        case SlcustmDMO.statementCustomerFilter:
          part.andFilterBy( queryArgs, "StatementCustomer",
            dao.wildcardForAnySequence(  ) );

          break;

        case SlcustmDMO.groupCustomerFilter:
          part.andFilterBy( queryArgs, "GroupCustomer",
            dao.wildcardForAnySequence(  ) );

          break;

        case SlcustmDMO.dateLastIssueFilter:
          part.andFilterBy( queryArgs, "DateLastIssue" );

          break;

        case SlcustmDMO.dateCreatedFilter:
          part.andFilterBy( queryArgs, "DateCreated" );

          break;

        case SlcustmDMO.analysisCodes1Filter:
          part.andFilterBy( queryArgs, "AnalysisCodes1",
            dao.wildcardForAnySequence(  ) );

          break;

        case SlcustmDMO.analysisCodes2Filter:
          part.andFilterBy( queryArgs, "AnalysisCodes2",
            dao.wildcardForAnySequence(  ) );

          break;

        case SlcustmDMO.analysisCodes3Filter:
          part.andFilterBy( queryArgs, "AnalysisCodes3",
            dao.wildcardForAnySequence(  ) );

          break;

        case SlcustmDMO.analysisCodes4Filter:
          part.andFilterBy( queryArgs, "AnalysisCodes4",
            dao.wildcardForAnySequence(  ) );

          break;

        case SlcustmDMO.analysisCodes5Filter:
          part.andFilterBy( queryArgs, "AnalysisCodes5",
            dao.wildcardForAnySequence(  ) );

          break;

        case SlcustmDMO.reminderCatFilter:
          part.andFilterBy( queryArgs, "ReminderCat",
            dao.wildcardForAnySequence(  ) );

          break;

        case SlcustmDMO.settlementCodeFilter:
          part.andFilterBy( queryArgs, "SettlementCode",
            dao.wildcardForAnySequence(  ) );

          break;

        case SlcustmDMO.settDaysCodeFilter:
          part.andFilterBy( queryArgs, "SettDaysCode",
            dao.wildcardForAnySequence(  ) );

          break;

        case SlcustmDMO.priceListFilter:
          part.andFilterBy( queryArgs, "PriceList",
            dao.wildcardForAnySequence(  ) );

          break;

        case SlcustmDMO.letterCodeFilter:
          part.andFilterBy( queryArgs, "LetterCode",
            dao.wildcardForAnySequence(  ) );

          break;

        case SlcustmDMO.balanceFwdFilter:
          part.andFilterBy( queryArgs, "BalanceFwd",
            dao.wildcardForAnySequence(  ) );

          break;

        case SlcustmDMO.creditLimitFilter:
          part.andFilterBy( queryArgs, "CreditLimit" );

          break;

        case SlcustmDMO.ytdSalesFilter:
          part.andFilterBy( queryArgs, "YtdSales" );

          break;

        case SlcustmDMO.ytdCostOfSalesFilter:
          part.andFilterBy( queryArgs, "YtdCostOfSales" );

          break;

        case SlcustmDMO.cumulativeSalesFilter:
          part.andFilterBy( queryArgs, "CumulativeSales" );

          break;

        case SlcustmDMO.orderBalanceFilter:
          part.andFilterBy( queryArgs, "OrderBalance" );

          break;

        case SlcustmDMO.salesNlCatFilter:
          part.andFilterBy( queryArgs, "SalesNlCat",
            dao.wildcardForAnySequence(  ) );

          break;

        case SlcustmDMO.specialPriceFilter:
          part.andFilterBy( queryArgs, "SpecialPrice",
            dao.wildcardForAnySequence(  ) );

          break;

        case SlcustmDMO.vatRegistrationFilter:
          part.andFilterBy( queryArgs, "VatRegistration",
            dao.wildcardForAnySequence(  ) );

          break;

        case SlcustmDMO.directDebitFilter:
          part.andFilterBy( queryArgs, "DirectDebit",
            dao.wildcardForAnySequence(  ) );

          break;

        case SlcustmDMO.invoicesPrintedFilter:
          part.andFilterBy( queryArgs, "InvoicesPrinted",
            dao.wildcardForAnySequence(  ) );

          break;

        case SlcustmDMO.consolidatedInvFilter:
          part.andFilterBy( queryArgs, "ConsolidatedInv",
            dao.wildcardForAnySequence(  ) );

          break;

        case SlcustmDMO.commentOnlyInvFilter:
          part.andFilterBy( queryArgs, "CommentOnlyInv",
            dao.wildcardForAnySequence(  ) );

          break;

        case SlcustmDMO.bankAccountNoFilter:
          part.andFilterBy( queryArgs, "BankAccountNo",
            dao.wildcardForAnySequence(  ) );

          break;

        case SlcustmDMO.bankSortCodeFilter:
          part.andFilterBy( queryArgs, "BankSortCode",
            dao.wildcardForAnySequence(  ) );

          break;

        case SlcustmDMO.bankNameFilter:
          part.andFilterBy( queryArgs, "BankName",
            dao.wildcardForAnySequence(  ) );

          break;

        case SlcustmDMO.bankAddress1Filter:
          part.andFilterBy( queryArgs, "BankAddress1",
            dao.wildcardForAnySequence(  ) );

          break;

        case SlcustmDMO.bankAddress2Filter:
          part.andFilterBy( queryArgs, "BankAddress2",
            dao.wildcardForAnySequence(  ) );

          break;

        case SlcustmDMO.bankAddress3Filter:
          part.andFilterBy( queryArgs, "BankAddress3",
            dao.wildcardForAnySequence(  ) );

          break;

        case SlcustmDMO.bankAddress4Filter:
          part.andFilterBy( queryArgs, "BankAddress4",
            dao.wildcardForAnySequence(  ) );

          break;

        case SlcustmDMO.analysisCode6Filter:
          part.andFilterBy( queryArgs, "AnalysisCode6",
            dao.wildcardForAnySequence(  ) );

          break;

        case SlcustmDMO.produceStatementsFilter:
          part.andFilterBy( queryArgs, "ProduceStatements",
            dao.wildcardForAnySequence(  ) );

          break;

        case SlcustmDMO.ediCustomerFilter:
          part.andFilterBy( queryArgs, "EdiCustomer",
            dao.wildcardForAnySequence(  ) );

          break;

        case SlcustmDMO.vatTypeFilter:
          part.andFilterBy( queryArgs, "VatType",
            dao.wildcardForAnySequence(  ) );

          break;

        case SlcustmDMO.languageFilter:
          part.andFilterBy( queryArgs, "Language", dao.wildcardForAnySequence(  ) );

          break;

        case SlcustmDMO.deliveryMethodFilter:
          part.andFilterBy( queryArgs, "DeliveryMethod",
            dao.wildcardForAnySequence(  ) );

          break;

        case SlcustmDMO.carrierFilter:
          part.andFilterBy( queryArgs, "Carrier",
            dao.wildcardForAnySequence(  ) );

          break;

        case SlcustmDMO.vatRegNumberFilter:
          part.andFilterBy( queryArgs, "VatRegNumber",
            dao.wildcardForAnySequence(  ) );

          break;

        case SlcustmDMO.vatExeNumberFilter:
          part.andFilterBy( queryArgs, "VatExeNumber",
            dao.wildcardForAnySequence(  ) );

          break;

        case SlcustmDMO.paydays1Filter:
          part.andFilterBy( queryArgs, "Paydays1",
            dao.wildcardForAnySequence(  ) );

          break;

        case SlcustmDMO.paydays2Filter:
          part.andFilterBy( queryArgs, "Paydays2",
            dao.wildcardForAnySequence(  ) );

          break;

        case SlcustmDMO.paydays3Filter:
          part.andFilterBy( queryArgs, "Paydays3",
            dao.wildcardForAnySequence(  ) );

          break;

        case SlcustmDMO.bankBranchCodeFilter:
          part.andFilterBy( queryArgs, "BankBranchCode",
            dao.wildcardForAnySequence(  ) );

          break;

        case SlcustmDMO.printCpWithStatFilter:
          part.andFilterBy( queryArgs, "PrintCpWithStat",
            dao.wildcardForAnySequence(  ) );

          break;

        case SlcustmDMO.paymentMethodFilter:
          part.andFilterBy( queryArgs, "PaymentMethod",
            dao.wildcardForAnySequence(  ) );

          break;

        case SlcustmDMO.customerClassFilter:
          part.andFilterBy( queryArgs, "CustomerClass",
            dao.wildcardForAnySequence(  ) );

          break;

        case SlcustmDMO.salesTypeFilter:
          part.andFilterBy( queryArgs, "SalesType",
            dao.wildcardForAnySequence(  ) );

          break;

        case SlcustmDMO.cpLowerValueFilter:
          part.andFilterBy( queryArgs, "CpLowerValue" );

          break;

        case SlcustmDMO.address6Filter:
          part.andFilterBy( queryArgs, "Address6",
            dao.wildcardForAnySequence(  ) );

          break;

        case SlcustmDMO.faxFilter:
          part.andFilterBy( queryArgs, "Fax", dao.wildcardForAnySequence(  ) );

          break;

        case SlcustmDMO.telexFilter:
          part.andFilterBy( queryArgs, "Telex", dao.wildcardForAnySequence(  ) );

          break;

        case SlcustmDMO.btxFilter:
          part.andFilterBy( queryArgs, "Btx", dao.wildcardForAnySequence(  ) );

          break;

        case SlcustmDMO.cpChargeFilter:
          part.andFilterBy( queryArgs, "CpCharge",
            dao.wildcardForAnySequence(  ) );

          break;

        case SlcustmDMO.controlDigitFilter:
          part.andFilterBy( queryArgs, "ControlDigit",
            dao.wildcardForAnySequence(  ) );

          break;

        case SlcustmDMO.payerFilter:
          part.andFilterBy( queryArgs, "Payer", dao.wildcardForAnySequence(  ) );

          break;

        case SlcustmDMO.responsibilityFilter:
          part.andFilterBy( queryArgs, "Responsibility",
            dao.wildcardForAnySequence(  ) );

          break;

        case SlcustmDMO.despatchHeldFilter:
          part.andFilterBy( queryArgs, "DespatchHeld",
            dao.wildcardForAnySequence(  ) );

          break;

        case SlcustmDMO.creditControllerFilter:
          part.andFilterBy( queryArgs, "CreditController",
            dao.wildcardForAnySequence(  ) );

          break;

        case SlcustmDMO.reminderLettersFilter:
          part.andFilterBy( queryArgs, "ReminderLetters",
            dao.wildcardForAnySequence(  ) );

          break;

        case SlcustmDMO.severityDays1Filter:
          part.andFilterBy( queryArgs, "SeverityDays1" );

          break;

        case SlcustmDMO.severityDays2Filter:
          part.andFilterBy( queryArgs, "SeverityDays2" );

          break;

        case SlcustmDMO.severityDays3Filter:
          part.andFilterBy( queryArgs, "SeverityDays3" );

          break;

        case SlcustmDMO.severityDays4Filter:
          part.andFilterBy( queryArgs, "SeverityDays4" );

          break;

        case SlcustmDMO.severityDays5Filter:
          part.andFilterBy( queryArgs, "SeverityDays5" );

          break;

        case SlcustmDMO.severityDays6Filter:
          part.andFilterBy( queryArgs, "SeverityDays6" );

          break;

        case SlcustmDMO.deliveryReasonFilter:
          part.andFilterBy( queryArgs, "DeliveryReason",
            dao.wildcardForAnySequence(  ) );

          break;

        case SlcustmDMO.shipperCode1Filter:
          part.andFilterBy( queryArgs, "ShipperCode1",
            dao.wildcardForAnySequence(  ) );

          break;

        case SlcustmDMO.shipperCode2Filter:
          part.andFilterBy( queryArgs, "ShipperCode2",
            dao.wildcardForAnySequence(  ) );

          break;

        case SlcustmDMO.shipperCode3Filter:
          part.andFilterBy( queryArgs, "ShipperCode3",
            dao.wildcardForAnySequence(  ) );

          break;

        case SlcustmDMO.shippingNoteIndFilter:
          part.andFilterBy( queryArgs, "ShippingNoteInd",
            dao.wildcardForAnySequence(  ) );

          break;

        case SlcustmDMO.accountTypeFilter:
          part.andFilterBy( queryArgs, "AccountType",
            dao.wildcardForAnySequence(  ) );

          break;

        case SlcustmDMO.adminFeeFilter:
          part.andFilterBy( queryArgs, "AdminFee",
            dao.wildcardForAnySequence(  ) );

          break;

        case SlcustmDMO.intrestRateFilter:
          part.andFilterBy( queryArgs, "IntrestRate",
            dao.wildcardForAnySequence(  ) );

          break;
      }
    }

    return queryArgs;
  }

  /**
  * Provides a DAOIterator to iterate over the list of Slcustm records based
  * on the passed in Filter.
  *
  * @param filter
  * @return
  * @throws EPPIXSeriousException
  */
  public DAOIterator iterate( QueryFilter filter )
    throws EPPIXSeriousException {
    logger.debug( "iterate( filter )" );

    return dao.iterator(  filterQueryArgs( filter, null ) );
  }

  /**
  * Provides a DAOIterator to iterate using a "FOR UPDATE", over the list of Slcustm records based
  * on the passed in Filter.
  *
  * @param filter
  * @return
  * @throws EPPIXSeriousException
  */
  public DAOIterator iterateWithLock( QueryFilter filter )
    throws EPPIXSeriousException {
    logger.debug( "iterateWithLock( filter )" );

    return dao.iterator(  filterQueryArgs( filter, null ),
      true );
  }

  /**
   * Retrieves the Slcustm Data Model Object from a possible list.
   *
   * @param filter
   * @return
   * @throws EPPIXSeriousException
   */
  public SlcustmDMO get( QueryFilter filter )
    throws EPPIXSeriousException {
    logger.debug( "get( filter )" );

    DAOParamQueryArgs args = filterQueryArgs( filter, null );

    return (SlcustmDMO) dao.get( args.getDMLName(  ), args.getFilterBy(  ),
      args );
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
