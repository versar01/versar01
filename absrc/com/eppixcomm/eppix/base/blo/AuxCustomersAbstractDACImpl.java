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
 * AuxCustomers Business Object.
 *
 * @version $Revision: 1.2 $
 * @author $Author$
 * @since $jdk$
 */
public class AuxCustomersAbstractDACImpl
  extends DAC
  implements AuxCustomersAbstractDAC {
  //~ Static variables/initializers //////////////////////////////////////////

  /** Error handler/logger. */
  static DAOThrower thrower = DAOThrower.getDAOThrower( AuxCustomersAbstractDACImpl.class );

  //~ Instance variables /////////////////////////////////////////////////////

  /** DOCUMENT ME! */
  Logger logger = thrower.getLogger(  );

  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new AuxCustomersDACImpl object.
   *
   * @param dao Data Access Object.
   * @param defaultLanguageCode the working language of the user, dictates
   *        which language specific descriptions are retrieved.
   */
  public AuxCustomersAbstractDACImpl( 
        DAO         dao ) {
    super( dao, thrower );
  }

  //~ Methods ////////////////////////////////////////////////////////////////

  /**
   * Retrieves a AuxCustomers Data Model Object
   *
   * @return a populated AuxCustomers Data Model Object or null if not found.
   *
   * @throws EPPIXSeriousException
   */
  public AuxCustomersDMO get( AuxCustomersDMO auxCustomersDMO )
    throws EPPIXSeriousException {
    logger.debug( "get( AuxCustomersDMO )" );

    thrower.ifParameterMissing( "AuxCustomersDMO", auxCustomersDMO );

    return (AuxCustomersDMO) dao.get( auxCustomersDMO );
  }

  /**
   * Creates the AuxCustomers object in the database.
   *
   * @param AuxCustomersDMO auxCustomersDMO
   *
   * @throws EPPIXSeriousException
   */
  public void create( AuxCustomersDMO auxCustomersDMO )
    throws EPPIXSeriousException {
    logger.debug( "create( auxCustomersDMO )" );
    thrower.ifParameterMissing( "AuxCustomersDMO", auxCustomersDMO );

    dao.insert( auxCustomersDMO );
  }

  /**
   * Locks and retrieves the AuxCustomers object from the database.
   *
   * @param aAuxCustomers AuxCustomers object
   *
   * @return a populated AuxCustomers object or null if not found.
   *
   * @throws EPPIXSeriousException
   */
  public AuxCustomersDMO lock( AuxCustomersDMO aAuxCustomersDMO )
    throws EPPIXSeriousException, EPPIXObjectBusyException {
    logger.debug( "lock( aAuxCustomersDMO )" );

    thrower.ifParameterMissing( "aAuxCustomersDMO", aAuxCustomersDMO );

    AuxCustomersDMO lockedAuxCustomersDMO = null;

    //
    // Lock the base table on its primary key.
    //
    lockedAuxCustomersDMO = (AuxCustomersDMO) dao.lock( "AuxCustomers",
        "filterByPrimaryKey",
        new DAOArgs( 1 ).arg( aAuxCustomersDMO.getBillAcNo(  ) ) );

    return lockedAuxCustomersDMO;
  }

  /**
   * Modifies the AuxCustomers object in the database.
   *
   * @param AuxCustomersDMO AuxCustomers object
   *
   * @throws EPPIXSeriousException
   * @throws EPPIXObjectExpiredException
   * @throws EPPIXObjectNotFoundException
   */
  public void modify( AuxCustomersDMO auxCustomersDMO )
    throws EPPIXSeriousException, EPPIXObjectExpiredException,
      EPPIXObjectNotFoundException {
    logger.debug( "modify( aAuxCustomersDMO )" );

    thrower.ifParameterMissing( "aAuxCustomersDMO", auxCustomersDMO );

    thrower.ifParameterMissing( "AuxCustomersDMO.billAcNo",
      auxCustomersDMO.getBillAcNo(  ) );

    dao.update( auxCustomersDMO );
  }

  /**
  * Modifies the AuxCustomers object using the specified filter in the database.
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

    dao.updateCustom( new AuxCustomersDMO(  ), filterQueryArgs( filter, null ) );
  }

  /**
   * Deletes the AuxCustomers object from the database.
   *
   * @param AuxCustomersDMO AuxCustomers object
   *
   * @throws EPPIXSeriousException
   * @throws EPPIXObjectNotFoundException
   * @throws EPPIXObjectExpiredException
   */
  public void delete( AuxCustomersDMO auxCustomersDMO )
    throws EPPIXSeriousException, EPPIXObjectNotFoundException,
      EPPIXObjectExpiredException {
    logger.debug( "delete( AuxCustomersDMO )" );

    thrower.ifParameterMissing( "AuxCustomersDMO", auxCustomersDMO );

    thrower.ifParameterMissing( "AuxCustomersDMO.billAcNo",
      auxCustomersDMO.getBillAcNo(  ) );

    dao.delete( auxCustomersDMO );
  }

  /**
   * Deletes the AuxCustomers object from the database.
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

    dao.delete( "AuxCustomers", args.getFilterBy(  ), args );
  }

  /**
  * Return true if a AuxCustomers object exists.
  *
  * @param AuxCustomersDMO AuxCustomersDMO
  *
  * @return true if the AuxCustomers object exists.
  *
  * @throws EPPIXSeriousException
  */
  public boolean exists( AuxCustomersDMO AuxCustomersDMO )
    throws EPPIXSeriousException {
    logger.debug( "exists( AuxCustomersDMO)" );

    return dao.exists( "AuxCustomers", "filterByPrimaryKey",
      new DAOArgs( 1 ).arg( AuxCustomersDMO.getBillAcNo(  ) ) );
  }

  /**
    * Return true if a AuxCustomers object exists.
    *
    * @param filter
    *
    * @return true if the AuxCustomers object exists.
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
   * @param locationDMO AuxCustomers Data Model Object
   *
   * @return DTOList of AuxCustomers Data Model Objects.
   *
   * @throws EPPIXSeriousException
   */
//  public DTOList<AuxCustomersDMO> getList( 
//    DTOListState    state,
//    AuxCustomersDMO auxCustomersDMO )
//    throws EPPIXSeriousException {
//    logger.debug( "getList( state, auxCustomersDMO )" );
//
//    return dao.getListAbs( state, paramQueryArgs( auxCustomersDMO ) );
//  }

  /**
   * Constructs parameterised query arguments.
   *
   * @param $(dataObjectNameLowerCamel} AuxCustomersDMO object.
   */
  protected DAOParamQueryArgs paramQueryArgs( 
    AuxCustomersDMO auxCustomersDMO ) {
    logger.debug( "paramQueryArgs( auxCustomersDMO)" );

    DAOParamQueryArgs queryArgs = new DAOParamQueryArgs( "AuxCustomers",
        86 * 2 );

    if ( auxCustomersDMO != null ) {
      // primary key filters...
      String billAcNo = auxCustomersDMO.getBillAcNo(  );

      if ( !DMO.isNull( billAcNo ) ) {
        queryArgs.andFilterBy( "BillAcNoMatch" )
                 .arg( billAcNo + dao.wildcardForAnySequence(  ) );
      }

      // define more filters...
      String auxTitle = auxCustomersDMO.getAuxTitle(  );

      if ( !DMO.isNull( auxTitle ) ) {
        queryArgs.andFilterBy( "AuxTitleMatch" )
                 .arg( auxTitle + dao.wildcardForAnySequence(  ) );
      }

      String auxFirstname = auxCustomersDMO.getAuxFirstname(  );

      if ( !DMO.isNull( auxFirstname ) ) {
        queryArgs.andFilterBy( "AuxFirstnameMatch" )
                 .arg( auxFirstname + dao.wildcardForAnySequence(  ) );
      }

      String bankName = auxCustomersDMO.getBankName(  );

      if ( !DMO.isNull( bankName ) ) {
        queryArgs.andFilterBy( "BankNameMatch" )
                 .arg( bankName + dao.wildcardForAnySequence(  ) );
      }

      String bankAddr1 = auxCustomersDMO.getBankAddr1(  );

      if ( !DMO.isNull( bankAddr1 ) ) {
        queryArgs.andFilterBy( "BankAddr1Match" )
                 .arg( bankAddr1 + dao.wildcardForAnySequence(  ) );
      }

      String bankAddr2 = auxCustomersDMO.getBankAddr2(  );

      if ( !DMO.isNull( bankAddr2 ) ) {
        queryArgs.andFilterBy( "BankAddr2Match" )
                 .arg( bankAddr2 + dao.wildcardForAnySequence(  ) );
      }

      String bankAcName = auxCustomersDMO.getBankAcName(  );

      if ( !DMO.isNull( bankAcName ) ) {
        queryArgs.andFilterBy( "BankAcNameMatch" )
                 .arg( bankAcName + dao.wildcardForAnySequence(  ) );
      }

      String ref = auxCustomersDMO.getRef(  );

      if ( !DMO.isNull( ref ) ) {
        queryArgs.andFilterBy( "RefMatch" )
                 .arg( ref + dao.wildcardForAnySequence(  ) );
      }

      String bankScode = auxCustomersDMO.getBankScode(  );

      if ( !DMO.isNull( bankScode ) ) {
        queryArgs.andFilterBy( "BankScodeMatch" )
                 .arg( bankScode + dao.wildcardForAnySequence(  ) );
      }

      String bankAcNo = auxCustomersDMO.getBankAcNo(  );

      if ( !DMO.isNull( bankAcNo ) ) {
        queryArgs.andFilterBy( "BankAcNoMatch" )
                 .arg( bankAcNo + dao.wildcardForAnySequence(  ) );
      }

      String bankAcType = auxCustomersDMO.getBankAcType(  );

      if ( !DMO.isNull( bankAcType ) ) {
        queryArgs.andFilterBy( "BankAcTypeMatch" )
                 .arg( bankAcType + dao.wildcardForAnySequence(  ) );
      }

      String bankPayType = auxCustomersDMO.getBankPayType(  );

      if ( !DMO.isNull( bankPayType ) ) {
        queryArgs.andFilterBy( "BankPayTypeMatch" )
                 .arg( bankPayType + dao.wildcardForAnySequence(  ) );
      }

      String protectCode = auxCustomersDMO.getProtectCode(  );

      if ( !DMO.isNull( protectCode ) ) {
        queryArgs.andFilterBy( "ProtectCodeMatch" )
                 .arg( protectCode + dao.wildcardForAnySequence(  ) );
      }

      String auxComment = auxCustomersDMO.getAuxComment(  );

      if ( !DMO.isNull( auxComment ) ) {
        queryArgs.andFilterBy( "AuxCommentMatch" )
                 .arg( auxComment + dao.wildcardForAnySequence(  ) );
      }

      String srFlag = auxCustomersDMO.getSrFlag(  );

      if ( !DMO.isNull( srFlag ) ) {
        queryArgs.andFilterBy( "SrFlagMatch" )
                 .arg( srFlag + dao.wildcardForAnySequence(  ) );
      }

      String processed = auxCustomersDMO.getProcessed(  );

      if ( !DMO.isNull( processed ) ) {
        queryArgs.andFilterBy( "ProcessedMatch" )
                 .arg( processed + dao.wildcardForAnySequence(  ) );
      }

      String packageCode = auxCustomersDMO.getPackageCode(  );

      if ( !DMO.isNull( packageCode ) ) {
        queryArgs.andFilterBy( "PackageCodeMatch" )
                 .arg( packageCode + dao.wildcardForAnySequence(  ) );
      }

      String auxAccountType = auxCustomersDMO.getAuxAccountType(  );

      if ( !DMO.isNull( auxAccountType ) ) {
        queryArgs.andFilterBy( "AuxAccountTypeMatch" )
                 .arg( auxAccountType + dao.wildcardForAnySequence(  ) );
      }

      String auxBillCycle = auxCustomersDMO.getAuxBillCycle(  );

      if ( !DMO.isNull( auxBillCycle ) ) {
        queryArgs.andFilterBy( "AuxBillCycleMatch" )
                 .arg( auxBillCycle + dao.wildcardForAnySequence(  ) );
      }

      String creditCardNo = auxCustomersDMO.getCreditCardNo(  );

      if ( !DMO.isNull( creditCardNo ) ) {
        queryArgs.andFilterBy( "CreditCardNoMatch" )
                 .arg( creditCardNo + dao.wildcardForAnySequence(  ) );
      }

      String creditCardName = auxCustomersDMO.getCreditCardName(  );

      if ( !DMO.isNull( creditCardName ) ) {
        queryArgs.andFilterBy( "CreditCardNameMatch" )
                 .arg( creditCardName + dao.wildcardForAnySequence(  ) );
      }

      String auxCardCvvNo = auxCustomersDMO.getAuxCardCvvNo(  );

      if ( !DMO.isNull( auxCardCvvNo ) ) {
        queryArgs.andFilterBy( "AuxCardCvvNoMatch" )
                 .arg( auxCardCvvNo + dao.wildcardForAnySequence(  ) );
      }

      String dealerId = auxCustomersDMO.getDealerId(  );

      if ( !DMO.isNull( dealerId ) ) {
        queryArgs.andFilterBy( "DealerIdMatch" )
                 .arg( dealerId + dao.wildcardForAnySequence(  ) );
      }

      String salesman = auxCustomersDMO.getSalesman(  );

      if ( !DMO.isNull( salesman ) ) {
        queryArgs.andFilterBy( "SalesmanMatch" )
                 .arg( salesman + dao.wildcardForAnySequence(  ) );
      }

      String idNumber = auxCustomersDMO.getIdNumber(  );

      if ( !DMO.isNull( idNumber ) ) {
        queryArgs.andFilterBy( "IdNumberMatch" )
                 .arg( idNumber + dao.wildcardForAnySequence(  ) );
      }

      String accStatus = auxCustomersDMO.getAccStatus(  );

      if ( !DMO.isNull( accStatus ) ) {
        queryArgs.andFilterBy( "AccStatusMatch" )
                 .arg( accStatus + dao.wildcardForAnySequence(  ) );
      }

      String compRegNo = auxCustomersDMO.getCompRegNo(  );

      if ( !DMO.isNull( compRegNo ) ) {
        queryArgs.andFilterBy( "CompRegNoMatch" )
                 .arg( compRegNo + dao.wildcardForAnySequence(  ) );
      }

      String stationaryType = auxCustomersDMO.getStationaryType(  );

      if ( !DMO.isNull( stationaryType ) ) {
        queryArgs.andFilterBy( "StationaryTypeMatch" )
                 .arg( stationaryType + dao.wildcardForAnySequence(  ) );
      }

      String auxCurrency = auxCustomersDMO.getAuxCurrency(  );

      if ( !DMO.isNull( auxCurrency ) ) {
        queryArgs.andFilterBy( "AuxCurrencyMatch" )
                 .arg( auxCurrency + dao.wildcardForAnySequence(  ) );
      }

      String auxCountryCode = auxCustomersDMO.getAuxCountryCode(  );

      if ( !DMO.isNull( auxCountryCode ) ) {
        queryArgs.andFilterBy( "AuxCountryCodeMatch" )
                 .arg( auxCountryCode + dao.wildcardForAnySequence(  ) );
      }

      String auxGender = auxCustomersDMO.getAuxGender(  );

      if ( !DMO.isNull( auxGender ) ) {
        queryArgs.andFilterBy( "AuxGenderMatch" )
                 .arg( auxGender + dao.wildcardForAnySequence(  ) );
      }

      String auxSubGrpAccNo = auxCustomersDMO.getAuxSubGrpAccNo(  );

      if ( !DMO.isNull( auxSubGrpAccNo ) ) {
        queryArgs.andFilterBy( "AuxSubGrpAccNoMatch" )
                 .arg( auxSubGrpAccNo + dao.wildcardForAnySequence(  ) );
      }

      String auxPrepaidStat = auxCustomersDMO.getAuxPrepaidStat(  );

      if ( !DMO.isNull( auxPrepaidStat ) ) {
        queryArgs.andFilterBy( "AuxPrepaidStatMatch" )
                 .arg( auxPrepaidStat + dao.wildcardForAnySequence(  ) );
      }

      String auxCreditClass = auxCustomersDMO.getAuxCreditClass(  );

      if ( !DMO.isNull( auxCreditClass ) ) {
        queryArgs.andFilterBy( "AuxCreditClassMatch" )
                 .arg( auxCreditClass + dao.wildcardForAnySequence(  ) );
      }

      String auxAutoLimitInd = auxCustomersDMO.getAuxAutoLimitInd(  );

      if ( !DMO.isNull( auxAutoLimitInd ) ) {
        queryArgs.andFilterBy( "AuxAutoLimitIndMatch" )
                 .arg( auxAutoLimitInd + dao.wildcardForAnySequence(  ) );
      }

      String auxAnalysis1 = auxCustomersDMO.getAuxAnalysis1(  );

      if ( !DMO.isNull( auxAnalysis1 ) ) {
        queryArgs.andFilterBy( "AuxAnalysis1Match" )
                 .arg( auxAnalysis1 + dao.wildcardForAnySequence(  ) );
      }

      String auxAnalysis2 = auxCustomersDMO.getAuxAnalysis2(  );

      if ( !DMO.isNull( auxAnalysis2 ) ) {
        queryArgs.andFilterBy( "AuxAnalysis2Match" )
                 .arg( auxAnalysis2 + dao.wildcardForAnySequence(  ) );
      }

      String auxAnalysis3 = auxCustomersDMO.getAuxAnalysis3(  );

      if ( !DMO.isNull( auxAnalysis3 ) ) {
        queryArgs.andFilterBy( "AuxAnalysis3Match" )
                 .arg( auxAnalysis3 + dao.wildcardForAnySequence(  ) );
      }

      String auxAnalysis4 = auxCustomersDMO.getAuxAnalysis4(  );

      if ( !DMO.isNull( auxAnalysis4 ) ) {
        queryArgs.andFilterBy( "AuxAnalysis4Match" )
                 .arg( auxAnalysis4 + dao.wildcardForAnySequence(  ) );
      }

      String auxAnalysis5 = auxCustomersDMO.getAuxAnalysis5(  );

      if ( !DMO.isNull( auxAnalysis5 ) ) {
        queryArgs.andFilterBy( "AuxAnalysis5Match" )
                 .arg( auxAnalysis5 + dao.wildcardForAnySequence(  ) );
      }

      String auxAnalysis6 = auxCustomersDMO.getAuxAnalysis6(  );

      if ( !DMO.isNull( auxAnalysis6 ) ) {
        queryArgs.andFilterBy( "AuxAnalysis6Match" )
                 .arg( auxAnalysis6 + dao.wildcardForAnySequence(  ) );
      }

      String auxAnalysis7 = auxCustomersDMO.getAuxAnalysis7(  );

      if ( !DMO.isNull( auxAnalysis7 ) ) {
        queryArgs.andFilterBy( "AuxAnalysis7Match" )
                 .arg( auxAnalysis7 + dao.wildcardForAnySequence(  ) );
      }

      String auxAnalysis8 = auxCustomersDMO.getAuxAnalysis8(  );

      if ( !DMO.isNull( auxAnalysis8 ) ) {
        queryArgs.andFilterBy( "AuxAnalysis8Match" )
                 .arg( auxAnalysis8 + dao.wildcardForAnySequence(  ) );
      }

      String auxAnalysis9 = auxCustomersDMO.getAuxAnalysis9(  );

      if ( !DMO.isNull( auxAnalysis9 ) ) {
        queryArgs.andFilterBy( "AuxAnalysis9Match" )
                 .arg( auxAnalysis9 + dao.wildcardForAnySequence(  ) );
      }

      String auxAnalysis10 = auxCustomersDMO.getAuxAnalysis10(  );

      if ( !DMO.isNull( auxAnalysis10 ) ) {
        queryArgs.andFilterBy( "AuxAnalysis10Match" )
                 .arg( auxAnalysis10 + dao.wildcardForAnySequence(  ) );
      }

      String auxAnalysis11 = auxCustomersDMO.getAuxAnalysis11(  );

      if ( !DMO.isNull( auxAnalysis11 ) ) {
        queryArgs.andFilterBy( "AuxAnalysis11Match" )
                 .arg( auxAnalysis11 + dao.wildcardForAnySequence(  ) );
      }

      String auxAnalysis12 = auxCustomersDMO.getAuxAnalysis12(  );

      if ( !DMO.isNull( auxAnalysis12 ) ) {
        queryArgs.andFilterBy( "AuxAnalysis12Match" )
                 .arg( auxAnalysis12 + dao.wildcardForAnySequence(  ) );
      }

      String auxAnalysis13 = auxCustomersDMO.getAuxAnalysis13(  );

      if ( !DMO.isNull( auxAnalysis13 ) ) {
        queryArgs.andFilterBy( "AuxAnalysis13Match" )
                 .arg( auxAnalysis13 + dao.wildcardForAnySequence(  ) );
      }

      String auxAnalysis14 = auxCustomersDMO.getAuxAnalysis14(  );

      if ( !DMO.isNull( auxAnalysis14 ) ) {
        queryArgs.andFilterBy( "AuxAnalysis14Match" )
                 .arg( auxAnalysis14 + dao.wildcardForAnySequence(  ) );
      }

      String auxAnalysis15 = auxCustomersDMO.getAuxAnalysis15(  );

      if ( !DMO.isNull( auxAnalysis15 ) ) {
        queryArgs.andFilterBy( "AuxAnalysis15Match" )
                 .arg( auxAnalysis15 + dao.wildcardForAnySequence(  ) );
      }

      String auxAnalysis16 = auxCustomersDMO.getAuxAnalysis16(  );

      if ( !DMO.isNull( auxAnalysis16 ) ) {
        queryArgs.andFilterBy( "AuxAnalysis16Match" )
                 .arg( auxAnalysis16 + dao.wildcardForAnySequence(  ) );
      }

      String auxAnalysis17 = auxCustomersDMO.getAuxAnalysis17(  );

      if ( !DMO.isNull( auxAnalysis17 ) ) {
        queryArgs.andFilterBy( "AuxAnalysis17Match" )
                 .arg( auxAnalysis17 + dao.wildcardForAnySequence(  ) );
      }

      String auxAnalysis18 = auxCustomersDMO.getAuxAnalysis18(  );

      if ( !DMO.isNull( auxAnalysis18 ) ) {
        queryArgs.andFilterBy( "AuxAnalysis18Match" )
                 .arg( auxAnalysis18 + dao.wildcardForAnySequence(  ) );
      }

      String auxAnalysis19 = auxCustomersDMO.getAuxAnalysis19(  );

      if ( !DMO.isNull( auxAnalysis19 ) ) {
        queryArgs.andFilterBy( "AuxAnalysis19Match" )
                 .arg( auxAnalysis19 + dao.wildcardForAnySequence(  ) );
      }

      String auxAnalysis20 = auxCustomersDMO.getAuxAnalysis20(  );

      if ( !DMO.isNull( auxAnalysis20 ) ) {
        queryArgs.andFilterBy( "AuxAnalysis20Match" )
                 .arg( auxAnalysis20 + dao.wildcardForAnySequence(  ) );
      }

      String auxAnalysis21 = auxCustomersDMO.getAuxAnalysis21(  );

      if ( !DMO.isNull( auxAnalysis21 ) ) {
        queryArgs.andFilterBy( "AuxAnalysis21Match" )
                 .arg( auxAnalysis21 + dao.wildcardForAnySequence(  ) );
      }

      String auxAnalysis22 = auxCustomersDMO.getAuxAnalysis22(  );

      if ( !DMO.isNull( auxAnalysis22 ) ) {
        queryArgs.andFilterBy( "AuxAnalysis22Match" )
                 .arg( auxAnalysis22 + dao.wildcardForAnySequence(  ) );
      }

      String auxAnalysis23 = auxCustomersDMO.getAuxAnalysis23(  );

      if ( !DMO.isNull( auxAnalysis23 ) ) {
        queryArgs.andFilterBy( "AuxAnalysis23Match" )
                 .arg( auxAnalysis23 + dao.wildcardForAnySequence(  ) );
      }

      String auxAnalysis24 = auxCustomersDMO.getAuxAnalysis24(  );

      if ( !DMO.isNull( auxAnalysis24 ) ) {
        queryArgs.andFilterBy( "AuxAnalysis24Match" )
                 .arg( auxAnalysis24 + dao.wildcardForAnySequence(  ) );
      }

      String auxAnalysis25 = auxCustomersDMO.getAuxAnalysis25(  );

      if ( !DMO.isNull( auxAnalysis25 ) ) {
        queryArgs.andFilterBy( "AuxAnalysis25Match" )
                 .arg( auxAnalysis25 + dao.wildcardForAnySequence(  ) );
      }

      String auxAnalysis26 = auxCustomersDMO.getAuxAnalysis26(  );

      if ( !DMO.isNull( auxAnalysis26 ) ) {
        queryArgs.andFilterBy( "AuxAnalysis26Match" )
                 .arg( auxAnalysis26 + dao.wildcardForAnySequence(  ) );
      }

      String auxAnalysis27 = auxCustomersDMO.getAuxAnalysis27(  );

      if ( !DMO.isNull( auxAnalysis27 ) ) {
        queryArgs.andFilterBy( "AuxAnalysis27Match" )
                 .arg( auxAnalysis27 + dao.wildcardForAnySequence(  ) );
      }

      String auxAnalysis28 = auxCustomersDMO.getAuxAnalysis28(  );

      if ( !DMO.isNull( auxAnalysis28 ) ) {
        queryArgs.andFilterBy( "AuxAnalysis28Match" )
                 .arg( auxAnalysis28 + dao.wildcardForAnySequence(  ) );
      }

      String auxAnalysis29 = auxCustomersDMO.getAuxAnalysis29(  );

      if ( !DMO.isNull( auxAnalysis29 ) ) {
        queryArgs.andFilterBy( "AuxAnalysis29Match" )
                 .arg( auxAnalysis29 + dao.wildcardForAnySequence(  ) );
      }

      String auxAnalysis30 = auxCustomersDMO.getAuxAnalysis30(  );

      if ( !DMO.isNull( auxAnalysis30 ) ) {
        queryArgs.andFilterBy( "AuxAnalysis30Match" )
                 .arg( auxAnalysis30 + dao.wildcardForAnySequence(  ) );
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
//  public DTOList<AuxCustomersDMO> getList( 
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
        ? "AuxCustomers" : dmlName, parts.size(  ) );

    for ( Iterator i = parts.iterator(); i.hasNext(); ) {
      FilterPart part = (FilterPart) i.next();
      
      switch ( part.getIndex(  ) ) {
        case AuxCustomersDMO.auxTitleFilter:
          part.andFilterBy( queryArgs, "AuxTitle",
            dao.wildcardForAnySequence(  ) );

          break;

        case AuxCustomersDMO.auxFirstnameFilter:
          part.andFilterBy( queryArgs, "AuxFirstname",
            dao.wildcardForAnySequence(  ) );

          break;

        case AuxCustomersDMO.auxInvoiceAddridFilter:
          part.andFilterBy( queryArgs, "AuxInvoiceAddrid" );

          break;

        case AuxCustomersDMO.bankNameFilter:
          part.andFilterBy( queryArgs, "BankName",
            dao.wildcardForAnySequence(  ) );

          break;

        case AuxCustomersDMO.bankAddr1Filter:
          part.andFilterBy( queryArgs, "BankAddr1",
            dao.wildcardForAnySequence(  ) );

          break;

        case AuxCustomersDMO.bankAddr2Filter:
          part.andFilterBy( queryArgs, "BankAddr2",
            dao.wildcardForAnySequence(  ) );

          break;

        case AuxCustomersDMO.bankAcNameFilter:
          part.andFilterBy( queryArgs, "BankAcName",
            dao.wildcardForAnySequence(  ) );

          break;

        case AuxCustomersDMO.refFilter:
          part.andFilterBy( queryArgs, "Ref", dao.wildcardForAnySequence(  ) );

          break;

        case AuxCustomersDMO.bankScodeFilter:
          part.andFilterBy( queryArgs, "BankScode",
            dao.wildcardForAnySequence(  ) );

          break;

        case AuxCustomersDMO.bankAcNoFilter:
          part.andFilterBy( queryArgs, "BankAcNo",
            dao.wildcardForAnySequence(  ) );

          break;

        case AuxCustomersDMO.bankAcTypeFilter:
          part.andFilterBy( queryArgs, "BankAcType",
            dao.wildcardForAnySequence(  ) );

          break;

        case AuxCustomersDMO.bankPayTypeFilter:
          part.andFilterBy( queryArgs, "BankPayType",
            dao.wildcardForAnySequence(  ) );

          break;

        case AuxCustomersDMO.auxPrefDebitDayFilter:
          part.andFilterBy( queryArgs, "AuxPrefDebitDay" );

          break;

        case AuxCustomersDMO.billAcNoFilter:
          part.andFilterBy( queryArgs, "BillAcNo",
            dao.wildcardForAnySequence(  ) );

          break;

        case AuxCustomersDMO.protectCodeFilter:
          part.andFilterBy( queryArgs, "ProtectCode",
            dao.wildcardForAnySequence(  ) );

          break;

        case AuxCustomersDMO.handsetCtFilter:
          part.andFilterBy( queryArgs, "HandsetCt" );

          break;

        case AuxCustomersDMO.bankDateFilter:
          part.andFilterBy( queryArgs, "BankDate" );

          break;

        case AuxCustomersDMO.confDateFilter:
          part.andFilterBy( queryArgs, "ConfDate" );

          break;

        case AuxCustomersDMO.auxCommentFilter:
          part.andFilterBy( queryArgs, "AuxComment",
            dao.wildcardForAnySequence(  ) );

          break;

        case AuxCustomersDMO.dateOfBirthFilter:
          part.andFilterBy( queryArgs, "DateOfBirth" );

          break;

        case AuxCustomersDMO.refPayDateFilter:
          part.andFilterBy( queryArgs, "RefPayDate" );

          break;

        case AuxCustomersDMO.acClosDateFilter:
          part.andFilterBy( queryArgs, "AcClosDate" );

          break;

        case AuxCustomersDMO.noReasDateFilter:
          part.andFilterBy( queryArgs, "NoReasDate" );

          break;

        case AuxCustomersDMO.remLetDateFilter:
          part.andFilterBy( queryArgs, "RemLetDate" );

          break;

        case AuxCustomersDMO.acTranDateFilter:
          part.andFilterBy( queryArgs, "AcTranDate" );

          break;

        case AuxCustomersDMO.noAcDateFilter:
          part.andFilterBy( queryArgs, "NoAcDate" );

          break;

        case AuxCustomersDMO.srFlagFilter:
          part.andFilterBy( queryArgs, "SrFlag",
            dao.wildcardForAnySequence(  ) );

          break;

        case AuxCustomersDMO.processedFilter:
          part.andFilterBy( queryArgs, "Processed",
            dao.wildcardForAnySequence(  ) );

          break;

        case AuxCustomersDMO.packageCodeFilter:
          part.andFilterBy( queryArgs, "PackageCode",
            dao.wildcardForAnySequence(  ) );

          break;

        case AuxCustomersDMO.auxAccountTypeFilter:
          part.andFilterBy( queryArgs, "AuxAccountType",
            dao.wildcardForAnySequence(  ) );

          break;

        case AuxCustomersDMO.auxBillCycleFilter:
          part.andFilterBy( queryArgs, "AuxBillCycle",
            dao.wildcardForAnySequence(  ) );

          break;

        case AuxCustomersDMO.creditCardNoFilter:
          part.andFilterBy( queryArgs, "CreditCardNo",
            dao.wildcardForAnySequence(  ) );

          break;

        case AuxCustomersDMO.creditCardNameFilter:
          part.andFilterBy( queryArgs, "CreditCardName",
            dao.wildcardForAnySequence(  ) );

          break;

        case AuxCustomersDMO.expiryDateFilter:
          part.andFilterBy( queryArgs, "ExpiryDate" );

          break;

        case AuxCustomersDMO.auxCardCvvNoFilter:
          part.andFilterBy( queryArgs, "AuxCardCvvNo",
            dao.wildcardForAnySequence(  ) );

          break;

        case AuxCustomersDMO.creditScoreFilter:
          part.andFilterBy( queryArgs, "CreditScore" );

          break;

        case AuxCustomersDMO.servProvIdFilter:
          part.andFilterBy( queryArgs, "ServProvId" );

          break;

        case AuxCustomersDMO.dealerIdFilter:
          part.andFilterBy( queryArgs, "DealerId",
            dao.wildcardForAnySequence(  ) );

          break;

        case AuxCustomersDMO.salesmanFilter:
          part.andFilterBy( queryArgs, "Salesman",
            dao.wildcardForAnySequence(  ) );

          break;

        case AuxCustomersDMO.idNumberFilter:
          part.andFilterBy( queryArgs, "IdNumber",
            dao.wildcardForAnySequence(  ) );

          break;

        case AuxCustomersDMO.accStatusFilter:
          part.andFilterBy( queryArgs, "AccStatus",
            dao.wildcardForAnySequence(  ) );

          break;

        case AuxCustomersDMO.compRegNoFilter:
          part.andFilterBy( queryArgs, "CompRegNo",
            dao.wildcardForAnySequence(  ) );

          break;

        case AuxCustomersDMO.stationaryTypeFilter:
          part.andFilterBy( queryArgs, "StationaryType",
            dao.wildcardForAnySequence(  ) );

          break;

        case AuxCustomersDMO.maxNoSubsFilter:
          part.andFilterBy( queryArgs, "MaxNoSubs" );

          break;

        case AuxCustomersDMO.auxCurrencyFilter:
          part.andFilterBy( queryArgs, "AuxCurrency",
            dao.wildcardForAnySequence(  ) );

          break;

        case AuxCustomersDMO.auxCountryCodeFilter:
          part.andFilterBy( queryArgs, "AuxCountryCode",
            dao.wildcardForAnySequence(  ) );

          break;

        case AuxCustomersDMO.auxGenderFilter:
          part.andFilterBy( queryArgs, "AuxGender",
            dao.wildcardForAnySequence(  ) );

          break;

        case AuxCustomersDMO.auxSubGrpAccNoFilter:
          part.andFilterBy( queryArgs, "AuxSubGrpAccNo",
            dao.wildcardForAnySequence(  ) );

          break;

        case AuxCustomersDMO.auxPrepaidStatFilter:
          part.andFilterBy( queryArgs, "AuxPrepaidStat",
            dao.wildcardForAnySequence(  ) );

          break;

        case AuxCustomersDMO.auxCreditClassFilter:
          part.andFilterBy( queryArgs, "AuxCreditClass",
            dao.wildcardForAnySequence(  ) );

          break;

        case AuxCustomersDMO.auxAutoLimitIndFilter:
          part.andFilterBy( queryArgs, "AuxAutoLimitInd",
            dao.wildcardForAnySequence(  ) );

          break;

        case AuxCustomersDMO.auxLmtUpValFilter:
          part.andFilterBy( queryArgs, "AuxLmtUpVal" );

          break;

        case AuxCustomersDMO.auxLmtDnValFilter:
          part.andFilterBy( queryArgs, "AuxLmtDnVal" );

          break;

        case AuxCustomersDMO.auxAnalysis1Filter:
          part.andFilterBy( queryArgs, "AuxAnalysis1",
            dao.wildcardForAnySequence(  ) );

          break;

        case AuxCustomersDMO.auxAnalysis2Filter:
          part.andFilterBy( queryArgs, "AuxAnalysis2",
            dao.wildcardForAnySequence(  ) );

          break;

        case AuxCustomersDMO.auxAnalysis3Filter:
          part.andFilterBy( queryArgs, "AuxAnalysis3",
            dao.wildcardForAnySequence(  ) );

          break;

        case AuxCustomersDMO.auxAnalysis4Filter:
          part.andFilterBy( queryArgs, "AuxAnalysis4",
            dao.wildcardForAnySequence(  ) );

          break;

        case AuxCustomersDMO.auxAnalysis5Filter:
          part.andFilterBy( queryArgs, "AuxAnalysis5",
            dao.wildcardForAnySequence(  ) );

          break;

        case AuxCustomersDMO.auxAnalysis6Filter:
          part.andFilterBy( queryArgs, "AuxAnalysis6",
            dao.wildcardForAnySequence(  ) );

          break;

        case AuxCustomersDMO.auxAnalysis7Filter:
          part.andFilterBy( queryArgs, "AuxAnalysis7",
            dao.wildcardForAnySequence(  ) );

          break;

        case AuxCustomersDMO.auxAnalysis8Filter:
          part.andFilterBy( queryArgs, "AuxAnalysis8",
            dao.wildcardForAnySequence(  ) );

          break;

        case AuxCustomersDMO.auxAnalysis9Filter:
          part.andFilterBy( queryArgs, "AuxAnalysis9",
            dao.wildcardForAnySequence(  ) );

          break;

        case AuxCustomersDMO.auxAnalysis10Filter:
          part.andFilterBy( queryArgs, "AuxAnalysis10",
            dao.wildcardForAnySequence(  ) );

          break;

        case AuxCustomersDMO.auxAnalysis11Filter:
          part.andFilterBy( queryArgs, "AuxAnalysis11",
            dao.wildcardForAnySequence(  ) );

          break;

        case AuxCustomersDMO.auxAnalysis12Filter:
          part.andFilterBy( queryArgs, "AuxAnalysis12",
            dao.wildcardForAnySequence(  ) );

          break;

        case AuxCustomersDMO.auxAnalysis13Filter:
          part.andFilterBy( queryArgs, "AuxAnalysis13",
            dao.wildcardForAnySequence(  ) );

          break;

        case AuxCustomersDMO.auxAnalysis14Filter:
          part.andFilterBy( queryArgs, "AuxAnalysis14",
            dao.wildcardForAnySequence(  ) );

          break;

        case AuxCustomersDMO.auxAnalysis15Filter:
          part.andFilterBy( queryArgs, "AuxAnalysis15",
            dao.wildcardForAnySequence(  ) );

          break;

        case AuxCustomersDMO.auxAnalysis16Filter:
          part.andFilterBy( queryArgs, "AuxAnalysis16",
            dao.wildcardForAnySequence(  ) );

          break;

        case AuxCustomersDMO.auxAnalysis17Filter:
          part.andFilterBy( queryArgs, "AuxAnalysis17",
            dao.wildcardForAnySequence(  ) );

          break;

        case AuxCustomersDMO.auxAnalysis18Filter:
          part.andFilterBy( queryArgs, "AuxAnalysis18",
            dao.wildcardForAnySequence(  ) );

          break;

        case AuxCustomersDMO.auxAnalysis19Filter:
          part.andFilterBy( queryArgs, "AuxAnalysis19",
            dao.wildcardForAnySequence(  ) );

          break;

        case AuxCustomersDMO.auxAnalysis20Filter:
          part.andFilterBy( queryArgs, "AuxAnalysis20",
            dao.wildcardForAnySequence(  ) );

          break;

        case AuxCustomersDMO.auxAnalysis21Filter:
          part.andFilterBy( queryArgs, "AuxAnalysis21",
            dao.wildcardForAnySequence(  ) );

          break;

        case AuxCustomersDMO.auxAnalysis22Filter:
          part.andFilterBy( queryArgs, "AuxAnalysis22",
            dao.wildcardForAnySequence(  ) );

          break;

        case AuxCustomersDMO.auxAnalysis23Filter:
          part.andFilterBy( queryArgs, "AuxAnalysis23",
            dao.wildcardForAnySequence(  ) );

          break;

        case AuxCustomersDMO.auxAnalysis24Filter:
          part.andFilterBy( queryArgs, "AuxAnalysis24",
            dao.wildcardForAnySequence(  ) );

          break;

        case AuxCustomersDMO.auxAnalysis25Filter:
          part.andFilterBy( queryArgs, "AuxAnalysis25",
            dao.wildcardForAnySequence(  ) );

          break;

        case AuxCustomersDMO.auxAnalysis26Filter:
          part.andFilterBy( queryArgs, "AuxAnalysis26",
            dao.wildcardForAnySequence(  ) );

          break;

        case AuxCustomersDMO.auxAnalysis27Filter:
          part.andFilterBy( queryArgs, "AuxAnalysis27",
            dao.wildcardForAnySequence(  ) );

          break;

        case AuxCustomersDMO.auxAnalysis28Filter:
          part.andFilterBy( queryArgs, "AuxAnalysis28",
            dao.wildcardForAnySequence(  ) );

          break;

        case AuxCustomersDMO.auxAnalysis29Filter:
          part.andFilterBy( queryArgs, "AuxAnalysis29",
            dao.wildcardForAnySequence(  ) );

          break;

        case AuxCustomersDMO.auxAnalysis30Filter:
          part.andFilterBy( queryArgs, "AuxAnalysis30",
            dao.wildcardForAnySequence(  ) );

          break;
      }
    }

    return queryArgs;
  }

  /**
  * Provides a DAOIterator to iterate over the list of AuxCustomers records based
  * on the passed in Filter.
  *
  * @param filter
  * @return
  * @throws EPPIXSeriousException
  */
  public DAOIterator iterate( QueryFilter filter )
    throws EPPIXSeriousException {
    logger.debug( "iterate( filter )" );

    return dao.iterator( 
      filterQueryArgs( filter, null ) );
  }

  /**
  * Provides a DAOIterator to iterate using a "FOR UPDATE", over the list of AuxCustomers records based
  * on the passed in Filter.
  *
  * @param filter
  * @return
  * @throws EPPIXSeriousException
  */
  public DAOIterator iterateWithLock( QueryFilter filter )
    throws EPPIXSeriousException {
    logger.debug( "iterateWithLock( filter )" );

    return dao.iterator( 
      filterQueryArgs( filter, null ), true );
  }

  /**
   * Retrieves the AuxCustomers Data Model Object from a possible list.
   *
   * @param filter
   * @return
   * @throws EPPIXSeriousException
   */
  public AuxCustomersDMO get( QueryFilter filter )
    throws EPPIXSeriousException {
    logger.debug( "get( filter )" );

    DAOParamQueryArgs args = filterQueryArgs( filter, null );

    return (AuxCustomersDMO) dao.get( args.getDMLName(  ),
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
