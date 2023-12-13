package com.eppixcomm.eppix.base.dml;


//public class AudAddressAbstractDMLFactory extends BaseDMLFactory {
//	/** The DMLFactory singleton */
//	  private static DMLFactory dml = null;
//	  protected AudAddressAbstractDMLFactory() throws DMLException{
//		  DMLTable table = defTable( "AudAddress", // dmlName
//		            "blo.AudAddressDMO", // dmoName
//		            "AUD_ADDRESS", // tableName
//		            25, // numColumns
//		            "AUD_ADDRID,AUD_ACCOUNT_NO ,AUD_SUBSCRIBER_ID, AUD_ADDRESS_TYPE,AUD_IN_DATE, AUD_INV_EFF_DATE, AUD_CLASSIFICATION, AUD_UNIQUE_ID, AUD_NAME ,AUD_ADDRESS_1, AUD_ADDRESS_2, AUD_ADDRESS_3, AUD_ADDRESS_4, AUD_ADDRESS_5,AUD_ADDRESS_6, AUD_POSTCODE, AUD_TELEPHONE_NO, AUD_TELEPHONE_NO_2, AUD_FAX_NO,AUD_CONTACT, AUD_E_MAIL, AUD_NOTES, AUD_GENERAL_1, AUD_GENERAL_2, AUD_GENERAL_3", // columnList
//		            "APM_ID", //primaryKey
//		            "" // versionCol     
//		          , false, // generatedKey
//		            "AUD_ADDRID,AUD_ACCOUNT_NO ,AUD_SUBSCRIBER_ID, AUD_ADDRESS_TYPE,AUD_IN_DATE, AUD_INV_EFF_DATE, AUD_CLASSIFICATION, AUD_UNIQUE_ID, AUD_NAME ,AUD_ADDRESS_1, AUD_ADDRESS_2, AUD_ADDRESS_3, AUD_ADDRESS_4, AUD_ADDRESS_5,AUD_ADDRESS_6, AUD_POSTCODE, AUD_TELEPHONE_NO, AUD_TELEPHONE_NO_2, AUD_FAX_NO,AUD_CONTACT, AUD_E_MAIL, AUD_NOTES, AUD_GENERAL_1, AUD_GENERAL_2, AUD_GENERAL_3",
//		            "", "",
//		            new String[] {
//				    "AUD_ADDRID","AUD_ACCOUNT_NO ","AUD_SUBSCRIBER_ID"," AUD_ADDRESS_TYPE","AUD_IN_DATE"," AUD_INV_EFF_DATE"," AUD_CLASSIFICATION"," AUD_UNIQUE_ID"," AUD_NAME ","AUD_ADDRESS_1"," AUD_ADDRESS_2"," AUD_ADDRESS_3"," AUD_ADDRESS_4"," AUD_ADDRESS_5","AUD_ADDRESS_6"," AUD_POSTCODE"," AUD_TELEPHONE_NO"," AUD_TELEPHONE_NO_2"," AUD_FAX_NO","AUD_CONTACT"," AUD_E_MAIL"," AUD_NOTES"," AUD_GENERAL_1"," AUD_GENERAL_2"," AUD_GENERAL_3"
//		            }, true );
//
//	  
//	  }
//
//}

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
//package com.eppixcomm.eppix.cdi.dml;

//import com.eppixcomm.eppix.common.dml.DMLException;
//import com.eppixcomm.eppix.common.dml.DMLFactory;
//import com.eppixcomm.eppix.common.dml.DMLTable;

/**
 * This is the DMLFactory for AudAddress.
 *
 * @version $Revision: 1.1 $
 * @author $Author$
 * @since $jdk$
 */
public class AudAddressAbstractDMLFactory
  extends BaseDMLFactory {
  //~ Static variables/initializers //////////////////////////////////////////

  /** The DMLFactory singleton */
  private static DMLFactory dml = null;

  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new AudAddressAbstractDMLFactory object.
   *
   * @throws DMLException DOCUMENT ME!
   */
  protected AudAddressAbstractDMLFactory(  )
    throws DMLException {
    ;

    DMLTable table = defTable( "AudAddress", // dmlName
        "blo.AudAddressDMO", // dmoName
        "AUD_ADDRESS", // tableName
        25, // numColumns
        "AUD_ADDRID, AUD_ACCOUNT_NO, AUD_SUBSCRIBER_ID, AUD_ADDRESS_TYPE, AUD_IN_DATE, AUD_INV_EFF_DATE, AUD_CLASSIFICATION, AUD_UNIQUE_ID, AUD_NAME"
        + ", AUD_ADDRESS_1, AUD_ADDRESS_2, AUD_ADDRESS_3, AUD_ADDRESS_4, AUD_ADDRESS_5, AUD_ADDRESS_6, AUD_POSTCODE, AUD_TELEPHONE_NO, AUD_TELEPHONE_NO_2"
        + ", AUD_FAX_NO, AUD_CONTACT, AUD_E_MAIL, AUD_NOTES, AUD_GENERAL_1, AUD_GENERAL_2, AUD_GENERAL_3", // columnList
        "AUD_ADDRID", //primaryKey
        "" // versionCol     
      , true, // generatedKey
        "AUD_ADDRID, AUD_ACCOUNT_NO, AUD_SUBSCRIBER_ID, AUD_ADDRESS_TYPE, AUD_IN_DATE, AUD_INV_EFF_DATE, AUD_CLASSIFICATION, AUD_UNIQUE_ID, AUD_NAME"
        + ", AUD_ADDRESS_1, AUD_ADDRESS_2, AUD_ADDRESS_3, AUD_ADDRESS_4, AUD_ADDRESS_5, AUD_ADDRESS_6, AUD_POSTCODE, AUD_TELEPHONE_NO, AUD_TELEPHONE_NO_2"
        + ", AUD_FAX_NO, AUD_CONTACT, AUD_E_MAIL, AUD_NOTES, AUD_GENERAL_1, AUD_GENERAL_2, AUD_GENERAL_3",
        "", "",
        new String[] {
          "AUD_ADDRID", "AUD_ACCOUNT_NO", "AUD_SUBSCRIBER_ID",
          "AUD_ADDRESS_TYPE", "AUD_IN_DATE", "AUD_INV_EFF_DATE",
          "AUD_CLASSIFICATION", "AUD_UNIQUE_ID", "AUD_NAME", "AUD_ADDRESS_1",
          "AUD_ADDRESS_2", "AUD_ADDRESS_3", "AUD_ADDRESS_4", "AUD_ADDRESS_5",
          "AUD_ADDRESS_6", "AUD_POSTCODE", "AUD_TELEPHONE_NO",
          "AUD_TELEPHONE_NO_2", "AUD_FAX_NO", "AUD_CONTACT", "AUD_E_MAIL",
          "AUD_NOTES", "AUD_GENERAL_1", "AUD_GENERAL_2", "AUD_GENERAL_3"
        } );

    table.addFilterBy( "equalAudAddrid", /* PK attribute */
      "AUD_ADDRID = ?" )
         .addFilterBy( "INAudAddrid", "AUD_ADDRID IN ( ? )" ) // IN

         .addFilterBy( "NOTINAudAddrid", "AUD_ADDRID NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "AudAddridasc", "AUD_ADDRID ASC" ) // ORDER ASCENDING

         .addOrderBy( "AudAddriddesc", "AUD_ADDRID DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalAudAccountNo", "AUD_ACCOUNT_NO = ?" ) // EQUAL

         .addFilterBy( "notequalAudAccountNo", "AUD_ACCOUNT_NO != ?" ) // NOTEQUAL

         .addFilterBy( "nullAudAccountNo",
      "(AUD_ACCOUNT_NO IS NULL OR LENGTH(AUD_ACCOUNT_NO) = 0)" ) // IS NULL

         .addFilterBy( "notnullAudAccountNo", "AUD_ACCOUNT_NO IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByAudAccountNoMatch", "AUD_ACCOUNT_NO LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullAudAccountNo",
      "(AUD_ACCOUNT_NO = ? OR AUD_ACCOUNT_NO IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INAudAccountNo", "AUD_ACCOUNT_NO IN ( ? )" ) // IN

         .addFilterBy( "NOTINAudAccountNo", "AUD_ACCOUNT_NO NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "AudAccountNoasc", "AUD_ACCOUNT_NO ASC" ) // ORDER ASCENDING

         .addOrderBy( "AudAccountNodesc", "AUD_ACCOUNT_NO DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalAudSubscriberId", "AUD_SUBSCRIBER_ID = ?" ) // EQUAL

         .addFilterBy( "notequalAudSubscriberId", "AUD_SUBSCRIBER_ID != ?" ) // NOTEQUAL

         .addFilterBy( "nullAudSubscriberId", "AUD_SUBSCRIBER_ID IS NULL" ) // IS NULL

         .addFilterBy( "notnullAudSubscriberId",
      "AUD_SUBSCRIBER_ID IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanAudSubscriberId", "AUD_SUBSCRIBER_ID < ?" ) // LESS THAN

         .addFilterBy( "greaterthanAudSubscriberId", "AUD_SUBSCRIBER_ID > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalAudSubscriberId",
      "AUD_SUBSCRIBER_ID <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalAudSubscriberId",
      "AUD_SUBSCRIBER_ID >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "betweenAudSubscriberId",
      "AUD_SUBSCRIBER_ID BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullAudSubscriberId",
      "(AUD_SUBSCRIBER_ID IS NULL OR AUD_SUBSCRIBER_ID = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullAudSubscriberId",
      "(AUD_SUBSCRIBER_ID IS NULL OR AUD_SUBSCRIBER_ID < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullAudSubscriberId",
      "(AUD_SUBSCRIBER_ID IS NULL OR AUD_SUBSCRIBER_ID > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INAudSubscriberId", "AUD_SUBSCRIBER_ID IN ( ? )" ) // IN

         .addFilterBy( "NOTINAudSubscriberId",
      "AUD_SUBSCRIBER_ID NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "AudSubscriberIdasc", "AUD_SUBSCRIBER_ID ASC" ) // ORDER ASCENDING

         .addOrderBy( "AudSubscriberIddesc", "AUD_SUBSCRIBER_ID DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalAudAddressType", "AUD_ADDRESS_TYPE = ?" ) // EQUAL

         .addFilterBy( "notequalAudAddressType", "AUD_ADDRESS_TYPE != ?" ) // NOTEQUAL

         .addFilterBy( "nullAudAddressType",
      "(AUD_ADDRESS_TYPE IS NULL OR LENGTH(AUD_ADDRESS_TYPE) = 0)" ) // IS NULL

         .addFilterBy( "notnullAudAddressType", "AUD_ADDRESS_TYPE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByAudAddressTypeMatch",
      "AUD_ADDRESS_TYPE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullAudAddressType",
      "(AUD_ADDRESS_TYPE = ? OR AUD_ADDRESS_TYPE IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INAudAddressType", "AUD_ADDRESS_TYPE IN ( ? )" ) // IN

         .addFilterBy( "NOTINAudAddressType", "AUD_ADDRESS_TYPE NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "AudAddressTypeasc", "AUD_ADDRESS_TYPE ASC" ) // ORDER ASCENDING

         .addOrderBy( "AudAddressTypedesc", "AUD_ADDRESS_TYPE DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalAudInDate", "AUD_IN_DATE = ?" ) // EQUAL

         .addFilterBy( "notequalAudInDate", "AUD_IN_DATE != ?" ) // NOTEQUAL

         .addFilterBy( "nullAudInDate", "AUD_IN_DATE IS NULL" ) // IS NULL

         .addFilterBy( "notnullAudInDate", "AUD_IN_DATE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanAudInDate", "AUD_IN_DATE < ?" ) // LESS THAN

         .addFilterBy( "greaterthanAudInDate", "AUD_IN_DATE > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalAudInDate", "AUD_IN_DATE <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalAudInDate", "AUD_IN_DATE >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "betweenAudInDate", "AUD_IN_DATE BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullAudInDate",
      "(AUD_IN_DATE IS NULL OR AUD_IN_DATE = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullAudInDate",
      "(AUD_IN_DATE IS NULL OR AUD_IN_DATE < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullAudInDate",
      "(AUD_IN_DATE IS NULL OR AUD_IN_DATE > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INAudInDate", "AUD_IN_DATE IN ( ? )" ) // IN

         .addFilterBy( "NOTINAudInDate", "AUD_IN_DATE NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "AudInDateasc", "AUD_IN_DATE ASC" ) // ORDER ASCENDING

         .addOrderBy( "AudInDatedesc", "AUD_IN_DATE DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalAudInvEffDate", "AUD_INV_EFF_DATE = ?" ) // EQUAL

         .addFilterBy( "notequalAudInvEffDate", "AUD_INV_EFF_DATE != ?" ) // NOTEQUAL

         .addFilterBy( "nullAudInvEffDate", "AUD_INV_EFF_DATE IS NULL" ) // IS NULL

         .addFilterBy( "notnullAudInvEffDate", "AUD_INV_EFF_DATE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanAudInvEffDate", "AUD_INV_EFF_DATE < ?" ) // LESS THAN

         .addFilterBy( "greaterthanAudInvEffDate", "AUD_INV_EFF_DATE > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalAudInvEffDate", "AUD_INV_EFF_DATE <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalAudInvEffDate",
      "AUD_INV_EFF_DATE >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "betweenAudInvEffDate",
      "AUD_INV_EFF_DATE BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullAudInvEffDate",
      "(AUD_INV_EFF_DATE IS NULL OR AUD_INV_EFF_DATE = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullAudInvEffDate",
      "(AUD_INV_EFF_DATE IS NULL OR AUD_INV_EFF_DATE < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullAudInvEffDate",
      "(AUD_INV_EFF_DATE IS NULL OR AUD_INV_EFF_DATE > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INAudInvEffDate", "AUD_INV_EFF_DATE IN ( ? )" ) // IN

         .addFilterBy( "NOTINAudInvEffDate", "AUD_INV_EFF_DATE NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "AudInvEffDateasc", "AUD_INV_EFF_DATE ASC" ) // ORDER ASCENDING

         .addOrderBy( "AudInvEffDatedesc", "AUD_INV_EFF_DATE DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalAudClassification",
      "AUD_CLASSIFICATION = ?" ) // EQUAL

         .addFilterBy( "notequalAudClassification",
      "AUD_CLASSIFICATION != ?" ) // NOTEQUAL

         .addFilterBy( "nullAudClassification",
      "(AUD_CLASSIFICATION IS NULL OR LENGTH(AUD_CLASSIFICATION) = 0)" ) // IS NULL

         .addFilterBy( "notnullAudClassification",
      "AUD_CLASSIFICATION IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByAudClassificationMatch",
      "AUD_CLASSIFICATION LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullAudClassification",
      "(AUD_CLASSIFICATION = ? OR AUD_CLASSIFICATION IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INAudClassification", "AUD_CLASSIFICATION IN ( ? )" ) // IN

         .addFilterBy( "NOTINAudClassification",
      "AUD_CLASSIFICATION NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "AudClassificationasc", "AUD_CLASSIFICATION ASC" ) // ORDER ASCENDING

         .addOrderBy( "AudClassificationdesc", "AUD_CLASSIFICATION DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalAudUniqueId", "AUD_UNIQUE_ID = ?" ) // EQUAL

         .addFilterBy( "notequalAudUniqueId", "AUD_UNIQUE_ID != ?" ) // NOTEQUAL

         .addFilterBy( "nullAudUniqueId",
      "(AUD_UNIQUE_ID IS NULL OR LENGTH(AUD_UNIQUE_ID) = 0)" ) // IS NULL

         .addFilterBy( "notnullAudUniqueId", "AUD_UNIQUE_ID IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByAudUniqueIdMatch", "AUD_UNIQUE_ID LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullAudUniqueId",
      "(AUD_UNIQUE_ID = ? OR AUD_UNIQUE_ID IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INAudUniqueId", "AUD_UNIQUE_ID IN ( ? )" ) // IN

         .addFilterBy( "NOTINAudUniqueId", "AUD_UNIQUE_ID NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "AudUniqueIdasc", "AUD_UNIQUE_ID ASC" ) // ORDER ASCENDING

         .addOrderBy( "AudUniqueIddesc", "AUD_UNIQUE_ID DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalAudName", "AUD_NAME = ?" ) // EQUAL

         .addFilterBy( "notequalAudName", "AUD_NAME != ?" ) // NOTEQUAL

         .addFilterBy( "nullAudName",
      "(AUD_NAME IS NULL OR LENGTH(AUD_NAME) = 0)" ) // IS NULL

         .addFilterBy( "notnullAudName", "AUD_NAME IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByAudNameMatch", "AUD_NAME LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullAudName",
      "(AUD_NAME = ? OR AUD_NAME IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INAudName", "AUD_NAME IN ( ? )" ) // IN

         .addFilterBy( "NOTINAudName", "AUD_NAME NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "AudNameasc", "AUD_NAME ASC" ) // ORDER ASCENDING

         .addOrderBy( "AudNamedesc", "AUD_NAME DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalAudAddress1", "AUD_ADDRESS_1 = ?" ) // EQUAL

         .addFilterBy( "notequalAudAddress1", "AUD_ADDRESS_1 != ?" ) // NOTEQUAL

         .addFilterBy( "nullAudAddress1",
      "(AUD_ADDRESS_1 IS NULL OR LENGTH(AUD_ADDRESS_1) = 0)" ) // IS NULL

         .addFilterBy( "notnullAudAddress1", "AUD_ADDRESS_1 IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByAudAddress1Match", "AUD_ADDRESS_1 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullAudAddress1",
      "(AUD_ADDRESS_1 = ? OR AUD_ADDRESS_1 IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INAudAddress1", "AUD_ADDRESS_1 IN ( ? )" ) // IN

         .addFilterBy( "NOTINAudAddress1", "AUD_ADDRESS_1 NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "AudAddress1asc", "AUD_ADDRESS_1 ASC" ) // ORDER ASCENDING

         .addOrderBy( "AudAddress1desc", "AUD_ADDRESS_1 DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalAudAddress2", "AUD_ADDRESS_2 = ?" ) // EQUAL

         .addFilterBy( "notequalAudAddress2", "AUD_ADDRESS_2 != ?" ) // NOTEQUAL

         .addFilterBy( "nullAudAddress2",
      "(AUD_ADDRESS_2 IS NULL OR LENGTH(AUD_ADDRESS_2) = 0)" ) // IS NULL

         .addFilterBy( "notnullAudAddress2", "AUD_ADDRESS_2 IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByAudAddress2Match", "AUD_ADDRESS_2 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullAudAddress2",
      "(AUD_ADDRESS_2 = ? OR AUD_ADDRESS_2 IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INAudAddress2", "AUD_ADDRESS_2 IN ( ? )" ) // IN

         .addFilterBy( "NOTINAudAddress2", "AUD_ADDRESS_2 NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "AudAddress2asc", "AUD_ADDRESS_2 ASC" ) // ORDER ASCENDING

         .addOrderBy( "AudAddress2desc", "AUD_ADDRESS_2 DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalAudAddress3", "AUD_ADDRESS_3 = ?" ) // EQUAL

         .addFilterBy( "notequalAudAddress3", "AUD_ADDRESS_3 != ?" ) // NOTEQUAL

         .addFilterBy( "nullAudAddress3",
      "(AUD_ADDRESS_3 IS NULL OR LENGTH(AUD_ADDRESS_3) = 0)" ) // IS NULL

         .addFilterBy( "notnullAudAddress3", "AUD_ADDRESS_3 IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByAudAddress3Match", "AUD_ADDRESS_3 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullAudAddress3",
      "(AUD_ADDRESS_3 = ? OR AUD_ADDRESS_3 IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INAudAddress3", "AUD_ADDRESS_3 IN ( ? )" ) // IN

         .addFilterBy( "NOTINAudAddress3", "AUD_ADDRESS_3 NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "AudAddress3asc", "AUD_ADDRESS_3 ASC" ) // ORDER ASCENDING

         .addOrderBy( "AudAddress3desc", "AUD_ADDRESS_3 DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalAudAddress4", "AUD_ADDRESS_4 = ?" ) // EQUAL

         .addFilterBy( "notequalAudAddress4", "AUD_ADDRESS_4 != ?" ) // NOTEQUAL

         .addFilterBy( "nullAudAddress4",
      "(AUD_ADDRESS_4 IS NULL OR LENGTH(AUD_ADDRESS_4) = 0)" ) // IS NULL

         .addFilterBy( "notnullAudAddress4", "AUD_ADDRESS_4 IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByAudAddress4Match", "AUD_ADDRESS_4 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullAudAddress4",
      "(AUD_ADDRESS_4 = ? OR AUD_ADDRESS_4 IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INAudAddress4", "AUD_ADDRESS_4 IN ( ? )" ) // IN

         .addFilterBy( "NOTINAudAddress4", "AUD_ADDRESS_4 NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "AudAddress4asc", "AUD_ADDRESS_4 ASC" ) // ORDER ASCENDING

         .addOrderBy( "AudAddress4desc", "AUD_ADDRESS_4 DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalAudAddress5", "AUD_ADDRESS_5 = ?" ) // EQUAL

         .addFilterBy( "notequalAudAddress5", "AUD_ADDRESS_5 != ?" ) // NOTEQUAL

         .addFilterBy( "nullAudAddress5",
      "(AUD_ADDRESS_5 IS NULL OR LENGTH(AUD_ADDRESS_5) = 0)" ) // IS NULL

         .addFilterBy( "notnullAudAddress5", "AUD_ADDRESS_5 IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByAudAddress5Match", "AUD_ADDRESS_5 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullAudAddress5",
      "(AUD_ADDRESS_5 = ? OR AUD_ADDRESS_5 IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INAudAddress5", "AUD_ADDRESS_5 IN ( ? )" ) // IN

         .addFilterBy( "NOTINAudAddress5", "AUD_ADDRESS_5 NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "AudAddress5asc", "AUD_ADDRESS_5 ASC" ) // ORDER ASCENDING

         .addOrderBy( "AudAddress5desc", "AUD_ADDRESS_5 DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalAudAddress6", "AUD_ADDRESS_6 = ?" ) // EQUAL

         .addFilterBy( "notequalAudAddress6", "AUD_ADDRESS_6 != ?" ) // NOTEQUAL

         .addFilterBy( "nullAudAddress6",
      "(AUD_ADDRESS_6 IS NULL OR LENGTH(AUD_ADDRESS_6) = 0)" ) // IS NULL

         .addFilterBy( "notnullAudAddress6", "AUD_ADDRESS_6 IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByAudAddress6Match", "AUD_ADDRESS_6 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullAudAddress6",
      "(AUD_ADDRESS_6 = ? OR AUD_ADDRESS_6 IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INAudAddress6", "AUD_ADDRESS_6 IN ( ? )" ) // IN

         .addFilterBy( "NOTINAudAddress6", "AUD_ADDRESS_6 NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "AudAddress6asc", "AUD_ADDRESS_6 ASC" ) // ORDER ASCENDING

         .addOrderBy( "AudAddress6desc", "AUD_ADDRESS_6 DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalAudPostcode", "AUD_POSTCODE = ?" ) // EQUAL

         .addFilterBy( "notequalAudPostcode", "AUD_POSTCODE != ?" ) // NOTEQUAL

         .addFilterBy( "nullAudPostcode",
      "(AUD_POSTCODE IS NULL OR LENGTH(AUD_POSTCODE) = 0)" ) // IS NULL

         .addFilterBy( "notnullAudPostcode", "AUD_POSTCODE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByAudPostcodeMatch", "AUD_POSTCODE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullAudPostcode",
      "(AUD_POSTCODE = ? OR AUD_POSTCODE IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INAudPostcode", "AUD_POSTCODE IN ( ? )" ) // IN

         .addFilterBy( "NOTINAudPostcode", "AUD_POSTCODE NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "AudPostcodeasc", "AUD_POSTCODE ASC" ) // ORDER ASCENDING

         .addOrderBy( "AudPostcodedesc", "AUD_POSTCODE DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalAudTelephoneNo", "AUD_TELEPHONE_NO = ?" ) // EQUAL

         .addFilterBy( "notequalAudTelephoneNo", "AUD_TELEPHONE_NO != ?" ) // NOTEQUAL

         .addFilterBy( "nullAudTelephoneNo",
      "(AUD_TELEPHONE_NO IS NULL OR LENGTH(AUD_TELEPHONE_NO) = 0)" ) // IS NULL

         .addFilterBy( "notnullAudTelephoneNo", "AUD_TELEPHONE_NO IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByAudTelephoneNoMatch",
      "AUD_TELEPHONE_NO LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullAudTelephoneNo",
      "(AUD_TELEPHONE_NO = ? OR AUD_TELEPHONE_NO IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INAudTelephoneNo", "AUD_TELEPHONE_NO IN ( ? )" ) // IN

         .addFilterBy( "NOTINAudTelephoneNo", "AUD_TELEPHONE_NO NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "AudTelephoneNoasc", "AUD_TELEPHONE_NO ASC" ) // ORDER ASCENDING

         .addOrderBy( "AudTelephoneNodesc", "AUD_TELEPHONE_NO DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalAudTelephoneNo2", "AUD_TELEPHONE_NO_2 = ?" ) // EQUAL

         .addFilterBy( "notequalAudTelephoneNo2",
      "AUD_TELEPHONE_NO_2 != ?" ) // NOTEQUAL

         .addFilterBy( "nullAudTelephoneNo2",
      "(AUD_TELEPHONE_NO_2 IS NULL OR LENGTH(AUD_TELEPHONE_NO_2) = 0)" ) // IS NULL

         .addFilterBy( "notnullAudTelephoneNo2",
      "AUD_TELEPHONE_NO_2 IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByAudTelephoneNo2Match",
      "AUD_TELEPHONE_NO_2 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullAudTelephoneNo2",
      "(AUD_TELEPHONE_NO_2 = ? OR AUD_TELEPHONE_NO_2 IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INAudTelephoneNo2", "AUD_TELEPHONE_NO_2 IN ( ? )" ) // IN

         .addFilterBy( "NOTINAudTelephoneNo2",
      "AUD_TELEPHONE_NO_2 NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "AudTelephoneNo2asc", "AUD_TELEPHONE_NO_2 ASC" ) // ORDER ASCENDING

         .addOrderBy( "AudTelephoneNo2desc", "AUD_TELEPHONE_NO_2 DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalAudFaxNo", "AUD_FAX_NO = ?" ) // EQUAL

         .addFilterBy( "notequalAudFaxNo", "AUD_FAX_NO != ?" ) // NOTEQUAL

         .addFilterBy( "nullAudFaxNo",
      "(AUD_FAX_NO IS NULL OR LENGTH(AUD_FAX_NO) = 0)" ) // IS NULL

         .addFilterBy( "notnullAudFaxNo", "AUD_FAX_NO IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByAudFaxNoMatch", "AUD_FAX_NO LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullAudFaxNo",
      "(AUD_FAX_NO = ? OR AUD_FAX_NO IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INAudFaxNo", "AUD_FAX_NO IN ( ? )" ) // IN

         .addFilterBy( "NOTINAudFaxNo", "AUD_FAX_NO NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "AudFaxNoasc", "AUD_FAX_NO ASC" ) // ORDER ASCENDING

         .addOrderBy( "AudFaxNodesc", "AUD_FAX_NO DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalAudContact", "AUD_CONTACT = ?" ) // EQUAL

         .addFilterBy( "notequalAudContact", "AUD_CONTACT != ?" ) // NOTEQUAL

         .addFilterBy( "nullAudContact",
      "(AUD_CONTACT IS NULL OR LENGTH(AUD_CONTACT) = 0)" ) // IS NULL

         .addFilterBy( "notnullAudContact", "AUD_CONTACT IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByAudContactMatch", "AUD_CONTACT LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullAudContact",
      "(AUD_CONTACT = ? OR AUD_CONTACT IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INAudContact", "AUD_CONTACT IN ( ? )" ) // IN

         .addFilterBy( "NOTINAudContact", "AUD_CONTACT NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "AudContactasc", "AUD_CONTACT ASC" ) // ORDER ASCENDING

         .addOrderBy( "AudContactdesc", "AUD_CONTACT DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalAudEMail", "AUD_E_MAIL = ?" ) // EQUAL

         .addFilterBy( "notequalAudEMail", "AUD_E_MAIL != ?" ) // NOTEQUAL

         .addFilterBy( "nullAudEMail",
      "(AUD_E_MAIL IS NULL OR LENGTH(AUD_E_MAIL) = 0)" ) // IS NULL

         .addFilterBy( "notnullAudEMail", "AUD_E_MAIL IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByAudEMailMatch", "AUD_E_MAIL LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullAudEMail",
      "(AUD_E_MAIL = ? OR AUD_E_MAIL IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INAudEMail", "AUD_E_MAIL IN ( ? )" ) // IN

         .addFilterBy( "NOTINAudEMail", "AUD_E_MAIL NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "AudEMailasc", "AUD_E_MAIL ASC" ) // ORDER ASCENDING

         .addOrderBy( "AudEMaildesc", "AUD_E_MAIL DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalAudNotes", "AUD_NOTES = ?" ) // EQUAL

         .addFilterBy( "notequalAudNotes", "AUD_NOTES != ?" ) // NOTEQUAL

         .addFilterBy( "nullAudNotes",
      "(AUD_NOTES IS NULL OR LENGTH(AUD_NOTES) = 0)" ) // IS NULL

         .addFilterBy( "notnullAudNotes", "AUD_NOTES IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByAudNotesMatch", "AUD_NOTES LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullAudNotes",
      "(AUD_NOTES = ? OR AUD_NOTES IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INAudNotes", "AUD_NOTES IN ( ? )" ) // IN

         .addFilterBy( "NOTINAudNotes", "AUD_NOTES NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "AudNotesasc", "AUD_NOTES ASC" ) // ORDER ASCENDING

         .addOrderBy( "AudNotesdesc", "AUD_NOTES DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalAudGeneral1", "AUD_GENERAL_1 = ?" ) // EQUAL

         .addFilterBy( "notequalAudGeneral1", "AUD_GENERAL_1 != ?" ) // NOTEQUAL

         .addFilterBy( "nullAudGeneral1",
      "(AUD_GENERAL_1 IS NULL OR LENGTH(AUD_GENERAL_1) = 0)" ) // IS NULL

         .addFilterBy( "notnullAudGeneral1", "AUD_GENERAL_1 IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByAudGeneral1Match", "AUD_GENERAL_1 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullAudGeneral1",
      "(AUD_GENERAL_1 = ? OR AUD_GENERAL_1 IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INAudGeneral1", "AUD_GENERAL_1 IN ( ? )" ) // IN

         .addFilterBy( "NOTINAudGeneral1", "AUD_GENERAL_1 NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "AudGeneral1asc", "AUD_GENERAL_1 ASC" ) // ORDER ASCENDING

         .addOrderBy( "AudGeneral1desc", "AUD_GENERAL_1 DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalAudGeneral2", "AUD_GENERAL_2 = ?" ) // EQUAL

         .addFilterBy( "notequalAudGeneral2", "AUD_GENERAL_2 != ?" ) // NOTEQUAL

         .addFilterBy( "nullAudGeneral2",
      "(AUD_GENERAL_2 IS NULL OR LENGTH(AUD_GENERAL_2) = 0)" ) // IS NULL

         .addFilterBy( "notnullAudGeneral2", "AUD_GENERAL_2 IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByAudGeneral2Match", "AUD_GENERAL_2 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullAudGeneral2",
      "(AUD_GENERAL_2 = ? OR AUD_GENERAL_2 IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INAudGeneral2", "AUD_GENERAL_2 IN ( ? )" ) // IN

         .addFilterBy( "NOTINAudGeneral2", "AUD_GENERAL_2 NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "AudGeneral2asc", "AUD_GENERAL_2 ASC" ) // ORDER ASCENDING

         .addOrderBy( "AudGeneral2desc", "AUD_GENERAL_2 DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalAudGeneral3", "AUD_GENERAL_3 = ?" ) // EQUAL

         .addFilterBy( "notequalAudGeneral3", "AUD_GENERAL_3 != ?" ) // NOTEQUAL

         .addFilterBy( "nullAudGeneral3",
      "(AUD_GENERAL_3 IS NULL OR LENGTH(AUD_GENERAL_3) = 0)" ) // IS NULL

         .addFilterBy( "notnullAudGeneral3", "AUD_GENERAL_3 IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByAudGeneral3Match", "AUD_GENERAL_3 LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullAudGeneral3",
      "(AUD_GENERAL_3 = ? OR AUD_GENERAL_3 IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INAudGeneral3", "AUD_GENERAL_3 IN ( ? )" ) // IN

         .addFilterBy( "NOTINAudGeneral3", "AUD_GENERAL_3 NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "AudGeneral3asc", "AUD_GENERAL_3 ASC" ) // ORDER ASCENDING

         .addOrderBy( "AudGeneral3desc", "AUD_GENERAL_3 DESC" ) // ORDER DESCENDING
    ;

    ;
    
    defStaticQuery("getUniqueAudByMaxId", //dmlname
  		  "blo.AudAddressDMO",//dmoname
  			"SELECT * FROM AUD_ADDRESS WHERE AUD_ACCOUNT_NO = ? " +
  			"AND AUD_ADDRESS_TYPE = ? " +
  			"AND AUD_ADDRID = (SELECT MAX(AUD_ADDRID) " +
  			"FROM AUD_ADDRESS " +
  			"WHERE AUD_ACCOUNT_NO = ? " +
  			"AND AUD_ADDRESS_TYPE = ?)", // select statement
  			false); // isMultiRow
    
    defStaticQuery("getUniqueAudByMaxIdMaxInDate", //dmlname
  		  "blo.AudAddressDMO",//dmoname
  			"SELECT * FROM AUD_ADDRESS WHERE AUD_ACCOUNT_NO = ? " +
  			"AND AUD_ADDRESS_TYPE = ? " +
  			"AND AUD_ADDRID = (SELECT MAX(AUD_ADDRID) FROM AUD_ADDRESS where AUD_ACCOUNT_NO = ? AND AUD_ADDRESS_TYPE = ? ) " +
  			"AND AUD_IN_DATE = (SELECT MAX(AUD_IN_DATE) FROM AUD_ADDRESS where AUD_ACCOUNT_NO = ? AND AUD_ADDRESS_TYPE = ? ) " +
  			"FROM AUD_ADDRESS ", // select statement
  			false); // isMultiRow
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
      dml = new AudAddressDMLFactory(  );
    }

    return dml;
  }
}
