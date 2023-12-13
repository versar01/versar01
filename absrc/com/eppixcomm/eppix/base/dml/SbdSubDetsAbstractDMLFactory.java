/*


*/

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
package com.eppixcomm.eppix.base.dml;


/**
 * This is the DMLFactory for SbdSubDets.
 *
 * @version $Revision: 1.1 $
 * @author $Author$
 * @since $jdk$
 */
public class SbdSubDetsAbstractDMLFactory
  extends BaseDMLFactory {
  //~ Static variables/initializers //////////////////////////////////////////

  /** The DMLFactory singleton */
  private static DMLFactory dml = null;

  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new SbdSubDetsAbstractDMLFactory object.
   *
   * @throws DMLException DOCUMENT ME!
   */
  protected SbdSubDetsAbstractDMLFactory(  )
    throws DMLException {
    ;

    DMLTable table = defTable( "SbdSubDets", // dmlName
        "blo.SbdSubDetsDMO", // dmoName
        "SBD_SUB_DETS", // tableName
        17, // numColumns
        "SBD_SUBSCRIBER_ID, SBD_DIALLING_NO, SBD_BILL_AC_NO, SBD_CONNECT_DATE, SBD_DCONNECT_DATE, SBD_TERM_DATE, SBD_TITLE, SBD_SURNAME, SBD_FIRSTNAME"
        + ", SBD_GENDER, SBD_DOB, SBD_PASSWORD, SBD_LOCATION_CODE, SBD_BILL_CYCLE, SBD_PACKAGE_CODE, SBD_BILLED_UPTO, SBD_TARIFF_PLAN", // columnList
        "SBD_SUBSCRIBER_ID", //primaryKey
        "" // versionCol     
      , true, // generatedKey
        "SBD_SUBSCRIBER_ID, SBD_DIALLING_NO, SBD_BILL_AC_NO, SBD_CONNECT_DATE, SBD_DCONNECT_DATE, SBD_TERM_DATE, SBD_TITLE, SBD_SURNAME, SBD_FIRSTNAME"
        + ", SBD_GENDER, SBD_DOB, SBD_PASSWORD, SBD_LOCATION_CODE, SBD_BILL_CYCLE, SBD_PACKAGE_CODE, SBD_BILLED_UPTO, SBD_TARIFF_PLAN",
        "", "",
        new String[] {
          "SBD_SUBSCRIBER_ID", "SBD_DIALLING_NO", "SBD_BILL_AC_NO",
          "SBD_CONNECT_DATE", "SBD_DCONNECT_DATE", "SBD_TERM_DATE",
          "SBD_TITLE", "SBD_SURNAME", "SBD_FIRSTNAME", "SBD_GENDER", "SBD_DOB",
          "SBD_PASSWORD", "SBD_LOCATION_CODE", "SBD_BILL_CYCLE",
          "SBD_PACKAGE_CODE", "SBD_BILLED_UPTO", "SBD_TARIFF_PLAN"
        } );

    table.addFilterBy( "equalSbdSubscriberId", /* PK attribute */
      "SBD_SUBSCRIBER_ID = ?" )
         .addFilterBy( "INSbdSubscriberId", "SBD_SUBSCRIBER_ID IN ( ? )" ) // IN

         .addFilterBy( "NOTINSbdSubscriberId",
      "SBD_SUBSCRIBER_ID NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "SbdSubscriberIdasc", "SBD_SUBSCRIBER_ID ASC" ) // ORDER ASCENDING

         .addOrderBy( "SbdSubscriberIddesc", "SBD_SUBSCRIBER_ID DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalSbdDiallingNo", "(SBD_DIALLING_NO) = ?" ) // EQUAL

         .addFilterBy( "notequalSbdDiallingNo", "(SBD_DIALLING_NO) != ?" ) // NOTEQUAL

         .addFilterBy( "nullSbdDiallingNo",
      "(SBD_DIALLING_NO IS NULL OR LENGTH((SBD_DIALLING_NO)) = 0)" ) // IS NULL

         .addFilterBy( "notnullSbdDiallingNo", "SBD_DIALLING_NO IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterBySbdDiallingNoMatch", "SBD_DIALLING_NO LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullSbdDiallingNo",
      "((SBD_DIALLING_NO) = ? OR SBD_DIALLING_NO IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INSbdDiallingNo", "SBD_DIALLING_NO IN ( ? )" ) // IN

         .addFilterBy( "NOTINSbdDiallingNo", "SBD_DIALLING_NO NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "SbdDiallingNoasc", "SBD_DIALLING_NO ASC" ) // ORDER ASCENDING

         .addOrderBy( "SbdDiallingNodesc", "SBD_DIALLING_NO DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalSbdBillAcNo", "(SBD_BILL_AC_NO) = ?" ) // EQUAL

         .addFilterBy( "notequalSbdBillAcNo", "(SBD_BILL_AC_NO) != ?" ) // NOTEQUAL

         .addFilterBy( "nullSbdBillAcNo",
      "(SBD_BILL_AC_NO IS NULL OR LENGTH((SBD_BILL_AC_NO)) = 0)" ) // IS NULL

         .addFilterBy( "notnullSbdBillAcNo", "SBD_BILL_AC_NO IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterBySbdBillAcNoMatch", "SBD_BILL_AC_NO LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullSbdBillAcNo",
      "((SBD_BILL_AC_NO) = ? OR SBD_BILL_AC_NO IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INSbdBillAcNo", "SBD_BILL_AC_NO IN ( ? )" ) // IN

         .addFilterBy( "NOTINSbdBillAcNo", "SBD_BILL_AC_NO NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "SbdBillAcNoasc", "SBD_BILL_AC_NO ASC" ) // ORDER ASCENDING

         .addOrderBy( "SbdBillAcNodesc", "SBD_BILL_AC_NO DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalSbdConnectDate", "SBD_CONNECT_DATE = ?" ) // EQUAL

         .addFilterBy( "notequalSbdConnectDate", "SBD_CONNECT_DATE != ?" ) // NOTEQUAL

         .addFilterBy( "nullSbdConnectDate", "SBD_CONNECT_DATE IS NULL" ) // IS NULL

         .addFilterBy( "notnullSbdConnectDate", "SBD_CONNECT_DATE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanSbdConnectDate", "SBD_CONNECT_DATE < ?" ) // LESS THAN

         .addFilterBy( "greaterthanSbdConnectDate", "SBD_CONNECT_DATE > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalSbdConnectDate",
      "SBD_CONNECT_DATE <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalSbdConnectDate",
      "SBD_CONNECT_DATE >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "betweenSbdConnectDate",
      "SBD_CONNECT_DATE BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullSbdConnectDate",
      "(SBD_CONNECT_DATE IS NULL OR SBD_CONNECT_DATE = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullSbdConnectDate",
      "(SBD_CONNECT_DATE IS NULL OR SBD_CONNECT_DATE < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullSbdConnectDate",
      "(SBD_CONNECT_DATE IS NULL OR SBD_CONNECT_DATE > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INSbdConnectDate", "SBD_CONNECT_DATE IN ( ? )" ) // IN

         .addFilterBy( "NOTINSbdConnectDate", "SBD_CONNECT_DATE NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "SbdConnectDateasc", "SBD_CONNECT_DATE ASC" ) // ORDER ASCENDING

         .addOrderBy( "SbdConnectDatedesc", "SBD_CONNECT_DATE DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalSbdDconnectDate", "SBD_DCONNECT_DATE = ?" ) // EQUAL

         .addFilterBy( "notequalSbdDconnectDate", "SBD_DCONNECT_DATE != ?" ) // NOTEQUAL

         .addFilterBy( "nullSbdDconnectDate", "SBD_DCONNECT_DATE IS NULL" ) // IS NULL

         .addFilterBy( "notnullSbdDconnectDate",
      "SBD_DCONNECT_DATE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanSbdDconnectDate", "SBD_DCONNECT_DATE < ?" ) // LESS THAN

         .addFilterBy( "greaterthanSbdDconnectDate", "SBD_DCONNECT_DATE > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalSbdDconnectDate",
      "SBD_DCONNECT_DATE <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalSbdDconnectDate",
      "SBD_DCONNECT_DATE >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "betweenSbdDconnectDate",
      "SBD_DCONNECT_DATE BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullSbdDconnectDate",
      "(SBD_DCONNECT_DATE IS NULL OR SBD_DCONNECT_DATE = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullSbdDconnectDate",
      "(SBD_DCONNECT_DATE IS NULL OR SBD_DCONNECT_DATE < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullSbdDconnectDate",
      "(SBD_DCONNECT_DATE IS NULL OR SBD_DCONNECT_DATE > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INSbdDconnectDate", "SBD_DCONNECT_DATE IN ( ? )" ) // IN

         .addFilterBy( "NOTINSbdDconnectDate",
      "SBD_DCONNECT_DATE NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "SbdDconnectDateasc", "SBD_DCONNECT_DATE ASC" ) // ORDER ASCENDING

         .addOrderBy( "SbdDconnectDatedesc", "SBD_DCONNECT_DATE DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalSbdTermDate", "SBD_TERM_DATE = ?" ) // EQUAL

         .addFilterBy( "notequalSbdTermDate", "SBD_TERM_DATE != ?" ) // NOTEQUAL

         .addFilterBy( "nullSbdTermDate", "SBD_TERM_DATE IS NULL" ) // IS NULL

         .addFilterBy( "notnullSbdTermDate", "SBD_TERM_DATE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanSbdTermDate", "SBD_TERM_DATE < ?" ) // LESS THAN

         .addFilterBy( "greaterthanSbdTermDate", "SBD_TERM_DATE > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalSbdTermDate", "SBD_TERM_DATE <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalSbdTermDate", "SBD_TERM_DATE >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "betweenSbdTermDate", "SBD_TERM_DATE BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullSbdTermDate",
      "(SBD_TERM_DATE IS NULL OR SBD_TERM_DATE = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullSbdTermDate",
      "(SBD_TERM_DATE IS NULL OR SBD_TERM_DATE < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullSbdTermDate",
      "(SBD_TERM_DATE IS NULL OR SBD_TERM_DATE > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INSbdTermDate", "SBD_TERM_DATE IN ( ? )" ) // IN

         .addFilterBy( "NOTINSbdTermDate", "SBD_TERM_DATE NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "SbdTermDateasc", "SBD_TERM_DATE ASC" ) // ORDER ASCENDING

         .addOrderBy( "SbdTermDatedesc", "SBD_TERM_DATE DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalSbdTitle", "(SBD_TITLE) = ?" ) // EQUAL

         .addFilterBy( "notequalSbdTitle", "(SBD_TITLE) != ?" ) // NOTEQUAL

         .addFilterBy( "nullSbdTitle",
      "(SBD_TITLE IS NULL OR LENGTH((SBD_TITLE)) = 0)" ) // IS NULL

         .addFilterBy( "notnullSbdTitle", "SBD_TITLE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterBySbdTitleMatch", "SBD_TITLE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullSbdTitle",
      "((SBD_TITLE) = ? OR SBD_TITLE IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INSbdTitle", "SBD_TITLE IN ( ? )" ) // IN

         .addFilterBy( "NOTINSbdTitle", "SBD_TITLE NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "SbdTitleasc", "SBD_TITLE ASC" ) // ORDER ASCENDING

         .addOrderBy( "SbdTitledesc", "SBD_TITLE DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalSbdSurname", "(SBD_SURNAME) = ?" ) // EQUAL

         .addFilterBy( "notequalSbdSurname", "(SBD_SURNAME) != ?" ) // NOTEQUAL

         .addFilterBy( "nullSbdSurname",
      "(SBD_SURNAME IS NULL OR LENGTH((SBD_SURNAME)) = 0)" ) // IS NULL

         .addFilterBy( "notnullSbdSurname", "SBD_SURNAME IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterBySbdSurnameMatch", "SBD_SURNAME LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullSbdSurname",
      "((SBD_SURNAME) = ? OR SBD_SURNAME IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INSbdSurname", "SBD_SURNAME IN ( ? )" ) // IN

         .addFilterBy( "NOTINSbdSurname", "SBD_SURNAME NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "SbdSurnameasc", "SBD_SURNAME ASC" ) // ORDER ASCENDING

         .addOrderBy( "SbdSurnamedesc", "SBD_SURNAME DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalSbdFirstname", "(SBD_FIRSTNAME) = ?" ) // EQUAL

         .addFilterBy( "notequalSbdFirstname", "(SBD_FIRSTNAME) != ?" ) // NOTEQUAL

         .addFilterBy( "nullSbdFirstname",
      "(SBD_FIRSTNAME IS NULL OR LENGTH((SBD_FIRSTNAME)) = 0)" ) // IS NULL

         .addFilterBy( "notnullSbdFirstname", "SBD_FIRSTNAME IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterBySbdFirstnameMatch", "SBD_FIRSTNAME LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullSbdFirstname",
      "((SBD_FIRSTNAME) = ? OR SBD_FIRSTNAME IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INSbdFirstname", "SBD_FIRSTNAME IN ( ? )" ) // IN

         .addFilterBy( "NOTINSbdFirstname", "SBD_FIRSTNAME NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "SbdFirstnameasc", "SBD_FIRSTNAME ASC" ) // ORDER ASCENDING

         .addOrderBy( "SbdFirstnamedesc", "SBD_FIRSTNAME DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalSbdGender", "(SBD_GENDER) = ?" ) // EQUAL

         .addFilterBy( "notequalSbdGender", "(SBD_GENDER) != ?" ) // NOTEQUAL

         .addFilterBy( "nullSbdGender",
      "(SBD_GENDER IS NULL OR LENGTH((SBD_GENDER)) = 0)" ) // IS NULL

         .addFilterBy( "notnullSbdGender", "SBD_GENDER IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterBySbdGenderMatch", "SBD_GENDER LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullSbdGender",
      "((SBD_GENDER) = ? OR SBD_GENDER IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INSbdGender", "SBD_GENDER IN ( ? )" ) // IN

         .addFilterBy( "NOTINSbdGender", "SBD_GENDER NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "SbdGenderasc", "SBD_GENDER ASC" ) // ORDER ASCENDING

         .addOrderBy( "SbdGenderdesc", "SBD_GENDER DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalSbdDob", "SBD_DOB = ?" ) // EQUAL

         .addFilterBy( "notequalSbdDob", "SBD_DOB != ?" ) // NOTEQUAL

         .addFilterBy( "nullSbdDob", "SBD_DOB IS NULL" ) // IS NULL

         .addFilterBy( "notnullSbdDob", "SBD_DOB IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanSbdDob", "SBD_DOB < ?" ) // LESS THAN

         .addFilterBy( "greaterthanSbdDob", "SBD_DOB > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalSbdDob", "SBD_DOB <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalSbdDob", "SBD_DOB >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "betweenSbdDob", "SBD_DOB BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullSbdDob", "(SBD_DOB IS NULL OR SBD_DOB = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullSbdDob",
      "(SBD_DOB IS NULL OR SBD_DOB < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullSbdDob",
      "(SBD_DOB IS NULL OR SBD_DOB > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INSbdDob", "SBD_DOB IN ( ? )" ) // IN

         .addFilterBy( "NOTINSbdDob", "SBD_DOB NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "SbdDobasc", "SBD_DOB ASC" ) // ORDER ASCENDING

         .addOrderBy( "SbdDobdesc", "SBD_DOB DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalSbdPassword", "(SBD_PASSWORD) = ?" ) // EQUAL

         .addFilterBy( "notequalSbdPassword", "(SBD_PASSWORD) != ?" ) // NOTEQUAL

         .addFilterBy( "nullSbdPassword",
      "(SBD_PASSWORD IS NULL OR LENGTH((SBD_PASSWORD)) = 0)" ) // IS NULL

         .addFilterBy( "notnullSbdPassword", "SBD_PASSWORD IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterBySbdPasswordMatch", "SBD_PASSWORD LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullSbdPassword",
      "((SBD_PASSWORD) = ? OR SBD_PASSWORD IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INSbdPassword", "SBD_PASSWORD IN ( ? )" ) // IN

         .addFilterBy( "NOTINSbdPassword", "SBD_PASSWORD NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "SbdPasswordasc", "SBD_PASSWORD ASC" ) // ORDER ASCENDING

         .addOrderBy( "SbdPassworddesc", "SBD_PASSWORD DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalSbdLocationCode", "(SBD_LOCATION_CODE) = ?" ) // EQUAL

         .addFilterBy( "notequalSbdLocationCode",
      "(SBD_LOCATION_CODE) != ?" ) // NOTEQUAL

         .addFilterBy( "nullSbdLocationCode",
      "(SBD_LOCATION_CODE IS NULL OR LENGTH((SBD_LOCATION_CODE)) = 0)" ) // IS NULL

         .addFilterBy( "notnullSbdLocationCode",
      "SBD_LOCATION_CODE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterBySbdLocationCodeMatch",
      "SBD_LOCATION_CODE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullSbdLocationCode",
      "((SBD_LOCATION_CODE) = ? OR SBD_LOCATION_CODE IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INSbdLocationCode", "SBD_LOCATION_CODE IN ( ? )" ) // IN

         .addFilterBy( "NOTINSbdLocationCode",
      "SBD_LOCATION_CODE NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "SbdLocationCodeasc", "SBD_LOCATION_CODE ASC" ) // ORDER ASCENDING

         .addOrderBy( "SbdLocationCodedesc", "SBD_LOCATION_CODE DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalSbdBillCycle", "(SBD_BILL_CYCLE) = ?" ) // EQUAL

         .addFilterBy( "notequalSbdBillCycle", "(SBD_BILL_CYCLE) != ?" ) // NOTEQUAL

         .addFilterBy( "nullSbdBillCycle",
      "(SBD_BILL_CYCLE IS NULL OR LENGTH((SBD_BILL_CYCLE)) = 0)" ) // IS NULL

         .addFilterBy( "notnullSbdBillCycle", "SBD_BILL_CYCLE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterBySbdBillCycleMatch", "SBD_BILL_CYCLE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullSbdBillCycle",
      "((SBD_BILL_CYCLE) = ? OR SBD_BILL_CYCLE IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INSbdBillCycle", "SBD_BILL_CYCLE IN ( ? )" ) // IN

         .addFilterBy( "NOTINSbdBillCycle", "SBD_BILL_CYCLE NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "SbdBillCycleasc", "SBD_BILL_CYCLE ASC" ) // ORDER ASCENDING

         .addOrderBy( "SbdBillCycledesc", "SBD_BILL_CYCLE DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalSbdPackageCode", "(SBD_PACKAGE_CODE) = ?" ) // EQUAL

         .addFilterBy( "notequalSbdPackageCode", "(SBD_PACKAGE_CODE) != ?" ) // NOTEQUAL

         .addFilterBy( "nullSbdPackageCode",
      "(SBD_PACKAGE_CODE IS NULL OR LENGTH((SBD_PACKAGE_CODE)) = 0)" ) // IS NULL

         .addFilterBy( "notnullSbdPackageCode", "SBD_PACKAGE_CODE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterBySbdPackageCodeMatch",
      "SBD_PACKAGE_CODE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullSbdPackageCode",
      "((SBD_PACKAGE_CODE) = ? OR SBD_PACKAGE_CODE IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INSbdPackageCode", "SBD_PACKAGE_CODE IN ( ? )" ) // IN

         .addFilterBy( "NOTINSbdPackageCode", "SBD_PACKAGE_CODE NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "SbdPackageCodeasc", "SBD_PACKAGE_CODE ASC" ) // ORDER ASCENDING

         .addOrderBy( "SbdPackageCodedesc", "SBD_PACKAGE_CODE DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalSbdBilledUpto", "SBD_BILLED_UPTO = ?" ) // EQUAL

         .addFilterBy( "notequalSbdBilledUpto", "SBD_BILLED_UPTO != ?" ) // NOTEQUAL

         .addFilterBy( "nullSbdBilledUpto", "SBD_BILLED_UPTO IS NULL" ) // IS NULL

         .addFilterBy( "notnullSbdBilledUpto", "SBD_BILLED_UPTO IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanSbdBilledUpto", "SBD_BILLED_UPTO < ?" ) // LESS THAN

         .addFilterBy( "greaterthanSbdBilledUpto", "SBD_BILLED_UPTO > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalSbdBilledUpto", "SBD_BILLED_UPTO <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalSbdBilledUpto",
      "SBD_BILLED_UPTO >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "betweenSbdBilledUpto",
      "SBD_BILLED_UPTO BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullSbdBilledUpto",
      "(SBD_BILLED_UPTO IS NULL OR SBD_BILLED_UPTO = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullSbdBilledUpto",
      "(SBD_BILLED_UPTO IS NULL OR SBD_BILLED_UPTO < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullSbdBilledUpto",
      "(SBD_BILLED_UPTO IS NULL OR SBD_BILLED_UPTO > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INSbdBilledUpto", "SBD_BILLED_UPTO IN ( ? )" ) // IN

         .addFilterBy( "NOTINSbdBilledUpto", "SBD_BILLED_UPTO NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "SbdBilledUptoasc", "SBD_BILLED_UPTO ASC" ) // ORDER ASCENDING

         .addOrderBy( "SbdBilledUptodesc", "SBD_BILLED_UPTO DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalSbdTariffPlan", "(SBD_TARIFF_PLAN) = ?" ) // EQUAL

         .addFilterBy( "notequalSbdTariffPlan", "(SBD_TARIFF_PLAN) != ?" ) // NOTEQUAL

         .addFilterBy( "nullSbdTariffPlan",
      "(SBD_TARIFF_PLAN IS NULL OR LENGTH((SBD_TARIFF_PLAN)) = 0)" ) // IS NULL

         .addFilterBy( "notnullSbdTariffPlan", "SBD_TARIFF_PLAN IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterBySbdTariffPlanMatch", "SBD_TARIFF_PLAN LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullSbdTariffPlan",
      "((SBD_TARIFF_PLAN) = ? OR SBD_TARIFF_PLAN IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INSbdTariffPlan", "SBD_TARIFF_PLAN IN ( ? )" ) // IN

         .addFilterBy( "NOTINSbdTariffPlan", "SBD_TARIFF_PLAN NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "SbdTariffPlanasc", "SBD_TARIFF_PLAN ASC" ) // ORDER ASCENDING

         .addOrderBy( "SbdTariffPlandesc", "SBD_TARIFF_PLAN DESC" ) // ORDER DESCENDING
    ;

    ;
    
	defStaticQuery("getSbdBillAccNoBySbaInvAcc", //dmlName, 
			".common.data.StringDMO", //dmoName,
			"select Unique sbd_bill_ac_no" +
			" from sba_sub_aux, sbd_sub_dets" +
			" where sba_subscriber_id = sbd_subscriber_id" +
			" and sba_inv_account = ? ", //selectStmt, 
			true); //isMultiRow)
  }

  //~ Methods ////////////////////////////////////////////////////////////////

  /**
   * Gets the DMLFactory singleton instance.
   *
   * @return the DMLFactory object reference.
   *
   * @throws DMLException if an error is detected when instantiating the
   *         DMLFactory.
   */
  public static DMLFactory getDMLFactory(  )
    throws DMLException {
    if ( dml == null ) {
      dml = new SbdSubDetsAbstractDMLFactory(  );
    }

    return dml;
  }
}
