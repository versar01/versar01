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
 * This is the DMLFactory for VamActiveMsisdn.
 *
 * @version $Revision: 1.1 $
 * @author $Author$
 * @since $jdk$
 */
public class VamActiveMsisdnAbstractDMLFactory
  extends BaseDMLFactory {
  //~ Static variables/initializers //////////////////////////////////////////

  /** The DMLFactory singleton */
  private static DMLFactory dml = null;

  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new VamActiveMsisdnAbstractDMLFactory object.
   *
   * @throws DMLException DOCUMENT ME!
   */
  protected VamActiveMsisdnAbstractDMLFactory(  )
    throws DMLException {
    ;

    DMLTable table = defTable( "VamActiveMsisdn", // dmlName
        "blo.VamActiveMsisdnDMO", // dmoName
        "VAM_ACTIVE_MSISDN", // tableName
        37, // numColumns
        "VAM_SUBSCRIBER_ID, VAM_SIM_NO, VAM_MSISDN_NO, VAM_TWINBILL_NO, VAM_STAT_CODE, VAM_CONNECT_DATE, VAM_DCONNECT_DATE, VAM_INTERN_TARIFF, VAM_CONTR_TERMINAT"
        + ", VAM_CONTR_PERIOD, VAM_TERMINAT_NOTIF, VAM_DIR_ENTRY, VAM_ITEMISED, VAM_DEPARTMENT, VAM_SALESMAN, VAM_DEALER_ID, VAM_ABAR_DATE, VAM_SUBS_SUFFIX"
        + ", VAM_MESS_COMMENT, VAM_AIRTIME_NET, VAM_PR_FLAG, VAM_HIERARCHY, VAM_MSISDN_KNOWN, VAM_TARIFF_CHG"
        + ", VAM_ORIG_PROV_ID, VAM_IMP_PROV_ID, VAM_ORIG_SERV_PROV, VAM_IMP_SERV_PROV, VAM_MSISDN_TYPE, VAM_DUMMY"
		+ ", VAM_MSISDN_EXPRTD, VAM_EXPORTED_TO, VAM_ANALYSIS_1, VAM_ANALYSIS_2, VAM_ANALYSIS_3, VAM_ANALYSIS_4, VAM_ANALYSIS_5",// columnList
        "(VAM_MSISDN_NO)", //primaryKey
        "" // versionCol
      , false, // generatedKey
                "VAM_SUBSCRIBER_ID, VAM_SIM_NO, VAM_MSISDN_NO, VAM_TWINBILL_NO, VAM_STAT_CODE, VAM_CONNECT_DATE, VAM_DCONNECT_DATE, VAM_INTERN_TARIFF, VAM_CONTR_TERMINAT"
        + ", VAM_CONTR_PERIOD, VAM_TERMINAT_NOTIF, VAM_DIR_ENTRY, VAM_ITEMISED, VAM_DEPARTMENT, VAM_SALESMAN, VAM_DEALER_ID, VAM_ABAR_DATE, VAM_SUBS_SUFFIX"
        + ", VAM_MESS_COMMENT, VAM_AIRTIME_NET, VAM_PR_FLAG, VAM_HIERARCHY, VAM_MSISDN_KNOWN, VAM_TARIFF_CHG"
        + ", VAM_ORIG_PROV_ID, VAM_IMP_PROV_ID, VAM_ORIG_SERV_PROV, VAM_IMP_SERV_PROV, VAM_MSISDN_TYPE, VAM_DUMMY"
		+ ", VAM_MSISDN_EXPRTD, VAM_EXPORTED_TO, VAM_ANALYSIS_1, VAM_ANALYSIS_2, VAM_ANALYSIS_3, VAM_ANALYSIS_4, VAM_ANALYSIS_5",
        "", "",
        new String[] {
          "VAM_SUBSCRIBER_ID", "VAM_SIM_NO", "VAM_MSISDN_NO",
          "VAM_TWINBILL_NO", "VAM_STAT_CODE", "VAM_CONNECT_DATE",
          "VAM_DCONNECT_DATE", "VAM_INTERN_TARIFF", "VAM_CONTR_TERMINAT",
          "VAM_CONTR_PERIOD", "VAM_TERMINAT_NOTIF", "VAM_DIR_ENTRY",
          "VAM_ITEMISED", "VAM_DEPARTMENT", "VAM_SALESMAN", "VAM_DEALER_ID",
          "VAM_ABAR_DATE", "VAM_SUBS_SUFFIX", "VAM_MESS_COMMENT",
          "VAM_AIRTIME_NET", "VAM_PR_FLAG", "VAM_HIERARCHY",
          "VAM_MSISDN_KNOWN", "VAM_TARIFF_CHG", "VAM_ORIG_PROV_ID",
		  "VAM_IMP_PROV_ID","VAM_ORIG_SERV_PROV","VAM_IMP_SERV_PROV",
  		  "VAM_MSISDN_TYPE","VAM_DUMMY","VAM_MSISDN_EXPRTD","VAM_EXPORTED_TO",
		  "VAM_ANALYSIS_1","VAM_ANALYSIS_2","VAM_ANALYSIS_3","VAM_ANALYSIS_4","VAM_ANALYSIS_5"}
    	);

    table.addFilterBy( "equalVamMsisdnNo", /* PK attribute */
      "(VAM_MSISDN_NO) = ?" )
         .addFilterBy( "filterByVamMsisdnNoMatch", "VAM_MSISDN_NO LIKE ?" )
         .addFilterBy( "INVamMsisdnNo", "VAM_MSISDN_NO IN ( ? )" ) // IN

         .addFilterBy( "NOTINVamMsisdnNo", "VAM_MSISDN_NO NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "VamMsisdnNoasc", "VAM_MSISDN_NO ASC" ) // ORDER ASCENDING

         .addOrderBy( "VamMsisdnNodesc", "VAM_MSISDN_NO DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalVamSubscriberId", "VAM_SUBSCRIBER_ID = ?" ) // EQUAL

         .addFilterBy( "notequalVamSubscriberId", "VAM_SUBSCRIBER_ID != ?" ) // NOTEQUAL

         .addFilterBy( "nullVamSubscriberId", "VAM_SUBSCRIBER_ID IS NULL" ) // IS NULL

         .addFilterBy( "notnullVamSubscriberId",
      "VAM_SUBSCRIBER_ID IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanVamSubscriberId", "VAM_SUBSCRIBER_ID < ?" ) // LESS THAN

         .addFilterBy( "greaterthanVamSubscriberId", "VAM_SUBSCRIBER_ID > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalVamSubscriberId",
      "VAM_SUBSCRIBER_ID <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalVamSubscriberId",
      "VAM_SUBSCRIBER_ID >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "betweenVamSubscriberId",
      "VAM_SUBSCRIBER_ID BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullVamSubscriberId",
      "(VAM_SUBSCRIBER_ID IS NULL OR VAM_SUBSCRIBER_ID = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullVamSubscriberId",
      "(VAM_SUBSCRIBER_ID IS NULL OR VAM_SUBSCRIBER_ID < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullVamSubscriberId",
      "(VAM_SUBSCRIBER_ID IS NULL OR VAM_SUBSCRIBER_ID > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INVamSubscriberId", "VAM_SUBSCRIBER_ID IN ( ? )" ) // IN

         .addFilterBy( "NOTINVamSubscriberId",
      "VAM_SUBSCRIBER_ID NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "VamSubscriberIdasc", "VAM_SUBSCRIBER_ID ASC" ) // ORDER ASCENDING

         .addOrderBy( "VamSubscriberIddesc", "VAM_SUBSCRIBER_ID DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalVamSimNo", "(VAM_SIM_NO) = ?" ) // EQUAL

         .addFilterBy( "notequalVamSimNo", "(VAM_SIM_NO) != ?" ) // NOTEQUAL

         .addFilterBy( "nullVamSimNo",
      "(VAM_SIM_NO IS NULL OR LENGTH((VAM_SIM_NO)) = 0)" ) // IS NULL

         .addFilterBy( "notnullVamSimNo", "VAM_SIM_NO IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByVamSimNoMatch", "VAM_SIM_NO LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullVamSimNo",
      "((VAM_SIM_NO) = ? OR VAM_SIM_NO IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INVamSimNo", "VAM_SIM_NO IN ( ? )" ) // IN

         .addFilterBy( "NOTINVamSimNo", "VAM_SIM_NO NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "VamSimNoasc", "VAM_SIM_NO ASC" ) // ORDER ASCENDING

         .addOrderBy( "VamSimNodesc", "VAM_SIM_NO DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalVamTwinbillNo", "VAM_TWINBILL_NO = ?" ) // EQUAL

         .addFilterBy( "notequalVamTwinbillNo", "VAM_TWINBILL_NO != ?" ) // NOTEQUAL

         .addFilterBy( "nullVamTwinbillNo", "VAM_TWINBILL_NO IS NULL" ) // IS NULL

         .addFilterBy( "notnullVamTwinbillNo", "VAM_TWINBILL_NO IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanVamTwinbillNo", "VAM_TWINBILL_NO < ?" ) // LESS THAN

         .addFilterBy( "greaterthanVamTwinbillNo", "VAM_TWINBILL_NO > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalVamTwinbillNo", "VAM_TWINBILL_NO <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalVamTwinbillNo",
      "VAM_TWINBILL_NO >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "betweenVamTwinbillNo",
      "VAM_TWINBILL_NO BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullVamTwinbillNo",
      "(VAM_TWINBILL_NO IS NULL OR VAM_TWINBILL_NO = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullVamTwinbillNo",
      "(VAM_TWINBILL_NO IS NULL OR VAM_TWINBILL_NO < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullVamTwinbillNo",
      "(VAM_TWINBILL_NO IS NULL OR VAM_TWINBILL_NO > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INVamTwinbillNo", "VAM_TWINBILL_NO IN ( ? )" ) // IN

         .addFilterBy( "NOTINVamTwinbillNo", "VAM_TWINBILL_NO NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "VamTwinbillNoasc", "VAM_TWINBILL_NO ASC" ) // ORDER ASCENDING

         .addOrderBy( "VamTwinbillNodesc", "VAM_TWINBILL_NO DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalVamStatCode", "(VAM_STAT_CODE) = ?" ) // EQUAL

         .addFilterBy( "notequalVamStatCode", "(VAM_STAT_CODE) != ?" ) // NOTEQUAL

         .addFilterBy( "nullVamStatCode",
      "(VAM_STAT_CODE IS NULL OR LENGTH((VAM_STAT_CODE)) = 0)" ) // IS NULL

         .addFilterBy( "notnullVamStatCode", "VAM_STAT_CODE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByVamStatCodeMatch", "VAM_STAT_CODE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullVamStatCode",
      "((VAM_STAT_CODE) = ? OR VAM_STAT_CODE IS NULL)" ) // EQUALORNULL
      
      	.addFilterBy("lessthanVamStatCode", "VAM_STAT_CODE < ?") // SJ: Added as condition for TUX changes 2014/10/15

         .addFilterBy( "INVamStatCode", "VAM_STAT_CODE IN ( ? )" ) // IN

         .addFilterBy( "NOTINVamStatCode", "VAM_STAT_CODE NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "VamStatCodeasc", "VAM_STAT_CODE ASC" ) // ORDER ASCENDING

         .addOrderBy( "VamStatCodedesc", "VAM_STAT_CODE DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalVamConnectDate", "VAM_CONNECT_DATE = ?" ) // EQUAL

         .addFilterBy( "notequalVamConnectDate", "VAM_CONNECT_DATE != ?" ) // NOTEQUAL

         .addFilterBy( "nullVamConnectDate", "VAM_CONNECT_DATE IS NULL" ) // IS NULL

         .addFilterBy( "notnullVamConnectDate", "VAM_CONNECT_DATE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanVamConnectDate", "VAM_CONNECT_DATE < ?" ) // LESS THAN

         .addFilterBy( "greaterthanVamConnectDate", "VAM_CONNECT_DATE > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalVamConnectDate",
      "VAM_CONNECT_DATE <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalVamConnectDate",
      "VAM_CONNECT_DATE >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "betweenVamConnectDate",
      "VAM_CONNECT_DATE BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullVamConnectDate",
      "(VAM_CONNECT_DATE IS NULL OR VAM_CONNECT_DATE = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullVamConnectDate",
      "(VAM_CONNECT_DATE IS NULL OR VAM_CONNECT_DATE < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullVamConnectDate",
      "(VAM_CONNECT_DATE IS NULL OR VAM_CONNECT_DATE > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INVamConnectDate", "VAM_CONNECT_DATE IN ( ? )" ) // IN

         .addFilterBy( "NOTINVamConnectDate", "VAM_CONNECT_DATE NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "VamConnectDateasc", "VAM_CONNECT_DATE ASC" ) // ORDER ASCENDING

         .addOrderBy( "VamConnectDatedesc", "VAM_CONNECT_DATE DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalVamDconnectDate", "VAM_DCONNECT_DATE = ?" ) // EQUAL

         .addFilterBy( "notequalVamDconnectDate", "VAM_DCONNECT_DATE != ?" ) // NOTEQUAL

         .addFilterBy( "nullVamDconnectDate", "VAM_DCONNECT_DATE IS NULL" ) // IS NULL

         .addFilterBy( "notnullVamDconnectDate",
      "VAM_DCONNECT_DATE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanVamDconnectDate", "VAM_DCONNECT_DATE < ?" ) // LESS THAN

         .addFilterBy( "greaterthanVamDconnectDate", "VAM_DCONNECT_DATE > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalVamDconnectDate",
      "VAM_DCONNECT_DATE <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalVamDconnectDate",
      "VAM_DCONNECT_DATE >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "betweenVamDconnectDate",
      "VAM_DCONNECT_DATE BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullVamDconnectDate",
      "(VAM_DCONNECT_DATE IS NULL OR VAM_DCONNECT_DATE = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullVamDconnectDate",
      "(VAM_DCONNECT_DATE IS NULL OR VAM_DCONNECT_DATE < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullVamDconnectDate",
      "(VAM_DCONNECT_DATE IS NULL OR VAM_DCONNECT_DATE > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INVamDconnectDate", "VAM_DCONNECT_DATE IN ( ? )" ) // IN

         .addFilterBy( "NOTINVamDconnectDate",
      "VAM_DCONNECT_DATE NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "VamDconnectDateasc", "VAM_DCONNECT_DATE ASC" ) // ORDER ASCENDING

         .addOrderBy( "VamDconnectDatedesc", "VAM_DCONNECT_DATE DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalVamInternTariff", "(VAM_INTERN_TARIFF) = ?" ) // EQUAL

         .addFilterBy( "notequalVamInternTariff",
      "(VAM_INTERN_TARIFF) != ?" ) // NOTEQUAL

         .addFilterBy( "nullVamInternTariff",
      "(VAM_INTERN_TARIFF IS NULL OR LENGTH((VAM_INTERN_TARIFF)) = 0)" ) // IS NULL

         .addFilterBy( "notnullVamInternTariff",
      "VAM_INTERN_TARIFF IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByVamInternTariffMatch",
      "VAM_INTERN_TARIFF LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullVamInternTariff",
      "((VAM_INTERN_TARIFF) = ? OR VAM_INTERN_TARIFF IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INVamInternTariff", "VAM_INTERN_TARIFF IN ( ? )" ) // IN

         .addFilterBy( "NOTINVamInternTariff",
      "VAM_INTERN_TARIFF NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "VamInternTariffasc", "VAM_INTERN_TARIFF ASC" ) // ORDER ASCENDING

         .addOrderBy( "VamInternTariffdesc", "VAM_INTERN_TARIFF DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalVamContrTerminat", "VAM_CONTR_TERMINAT = ?" ) // EQUAL

         .addFilterBy( "notequalVamContrTerminat", "VAM_CONTR_TERMINAT != ?" ) // NOTEQUAL

         .addFilterBy( "nullVamContrTerminat", "VAM_CONTR_TERMINAT IS NULL" ) // IS NULL

         .addFilterBy( "notnullVamContrTerminat",
      "VAM_CONTR_TERMINAT IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanVamContrTerminat", "VAM_CONTR_TERMINAT < ?" ) // LESS THAN

         .addFilterBy( "greaterthanVamContrTerminat", "VAM_CONTR_TERMINAT > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalVamContrTerminat",
      "VAM_CONTR_TERMINAT <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalVamContrTerminat",
      "VAM_CONTR_TERMINAT >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "betweenVamContrTerminat",
      "VAM_CONTR_TERMINAT BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullVamContrTerminat",
      "(VAM_CONTR_TERMINAT IS NULL OR VAM_CONTR_TERMINAT = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullVamContrTerminat",
      "(VAM_CONTR_TERMINAT IS NULL OR VAM_CONTR_TERMINAT < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullVamContrTerminat",
      "(VAM_CONTR_TERMINAT IS NULL OR VAM_CONTR_TERMINAT > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INVamContrTerminat", "VAM_CONTR_TERMINAT IN ( ? )" ) // IN

         .addFilterBy( "NOTINVamContrTerminat",
      "VAM_CONTR_TERMINAT NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "VamContrTerminatasc", "VAM_CONTR_TERMINAT ASC" ) // ORDER ASCENDING

         .addOrderBy( "VamContrTerminatdesc", "VAM_CONTR_TERMINAT DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalVamContrPeriod", "VAM_CONTR_PERIOD = ?" ) // EQUAL

         .addFilterBy( "notequalVamContrPeriod", "VAM_CONTR_PERIOD != ?" ) // NOTEQUAL

         .addFilterBy( "nullVamContrPeriod", "VAM_CONTR_PERIOD IS NULL" ) // IS NULL

         .addFilterBy( "notnullVamContrPeriod", "VAM_CONTR_PERIOD IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanVamContrPeriod", "VAM_CONTR_PERIOD < ?" ) // LESS THAN

         .addFilterBy( "greaterthanVamContrPeriod", "VAM_CONTR_PERIOD > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalVamContrPeriod",
      "VAM_CONTR_PERIOD <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalVamContrPeriod",
      "VAM_CONTR_PERIOD >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "betweenVamContrPeriod",
      "VAM_CONTR_PERIOD BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullVamContrPeriod",
      "(VAM_CONTR_PERIOD IS NULL OR VAM_CONTR_PERIOD = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullVamContrPeriod",
      "(VAM_CONTR_PERIOD IS NULL OR VAM_CONTR_PERIOD < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullVamContrPeriod",
      "(VAM_CONTR_PERIOD IS NULL OR VAM_CONTR_PERIOD > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INVamContrPeriod", "VAM_CONTR_PERIOD IN ( ? )" ) // IN

         .addFilterBy( "NOTINVamContrPeriod", "VAM_CONTR_PERIOD NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "VamContrPeriodasc", "VAM_CONTR_PERIOD ASC" ) // ORDER ASCENDING

         .addOrderBy( "VamContrPerioddesc", "VAM_CONTR_PERIOD DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalVamTerminatNotif", "VAM_TERMINAT_NOTIF = ?" ) // EQUAL

         .addFilterBy( "notequalVamTerminatNotif", "VAM_TERMINAT_NOTIF != ?" ) // NOTEQUAL

         .addFilterBy( "nullVamTerminatNotif", "VAM_TERMINAT_NOTIF IS NULL" ) // IS NULL

         .addFilterBy( "notnullVamTerminatNotif",
      "VAM_TERMINAT_NOTIF IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanVamTerminatNotif", "VAM_TERMINAT_NOTIF < ?" ) // LESS THAN

         .addFilterBy( "greaterthanVamTerminatNotif", "VAM_TERMINAT_NOTIF > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalVamTerminatNotif",
      "VAM_TERMINAT_NOTIF <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalVamTerminatNotif",
      "VAM_TERMINAT_NOTIF >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "betweenVamTerminatNotif",
      "VAM_TERMINAT_NOTIF BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullVamTerminatNotif",
      "(VAM_TERMINAT_NOTIF IS NULL OR VAM_TERMINAT_NOTIF = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullVamTerminatNotif",
      "(VAM_TERMINAT_NOTIF IS NULL OR VAM_TERMINAT_NOTIF < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullVamTerminatNotif",
      "(VAM_TERMINAT_NOTIF IS NULL OR VAM_TERMINAT_NOTIF > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INVamTerminatNotif", "VAM_TERMINAT_NOTIF IN ( ? )" ) // IN

         .addFilterBy( "NOTINVamTerminatNotif",
      "VAM_TERMINAT_NOTIF NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "VamTerminatNotifasc", "VAM_TERMINAT_NOTIF ASC" ) // ORDER ASCENDING

         .addOrderBy( "VamTerminatNotifdesc", "VAM_TERMINAT_NOTIF DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalVamDirEntry", "(VAM_DIR_ENTRY) = ?" ) // EQUAL

         .addFilterBy( "notequalVamDirEntry", "(VAM_DIR_ENTRY) != ?" ) // NOTEQUAL

         .addFilterBy( "nullVamDirEntry",
      "(VAM_DIR_ENTRY IS NULL OR LENGTH((VAM_DIR_ENTRY)) = 0)" ) // IS NULL

         .addFilterBy( "notnullVamDirEntry", "VAM_DIR_ENTRY IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByVamDirEntryMatch", "VAM_DIR_ENTRY LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullVamDirEntry",
      "((VAM_DIR_ENTRY) = ? OR VAM_DIR_ENTRY IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INVamDirEntry", "VAM_DIR_ENTRY IN ( ? )" ) // IN

         .addFilterBy( "NOTINVamDirEntry", "VAM_DIR_ENTRY NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "VamDirEntryasc", "VAM_DIR_ENTRY ASC" ) // ORDER ASCENDING

         .addOrderBy( "VamDirEntrydesc", "VAM_DIR_ENTRY DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalVamItemised", "(VAM_ITEMISED) = ?" ) // EQUAL

         .addFilterBy( "notequalVamItemised", "(VAM_ITEMISED) != ?" ) // NOTEQUAL

         .addFilterBy( "nullVamItemised",
      "(VAM_ITEMISED IS NULL OR LENGTH((VAM_ITEMISED)) = 0)" ) // IS NULL

         .addFilterBy( "notnullVamItemised", "VAM_ITEMISED IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByVamItemisedMatch", "VAM_ITEMISED LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullVamItemised",
      "((VAM_ITEMISED) = ? OR VAM_ITEMISED IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INVamItemised", "VAM_ITEMISED IN ( ? )" ) // IN

         .addFilterBy( "NOTINVamItemised", "VAM_ITEMISED NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "VamItemisedasc", "VAM_ITEMISED ASC" ) // ORDER ASCENDING

         .addOrderBy( "VamItemiseddesc", "VAM_ITEMISED DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalVamDepartment", "(VAM_DEPARTMENT) = ?" ) // EQUAL

         .addFilterBy( "notequalVamDepartment", "(VAM_DEPARTMENT) != ?" ) // NOTEQUAL

         .addFilterBy( "nullVamDepartment",
      "(VAM_DEPARTMENT IS NULL OR LENGTH((VAM_DEPARTMENT)) = 0)" ) // IS NULL

         .addFilterBy( "notnullVamDepartment", "VAM_DEPARTMENT IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByVamDepartmentMatch", "VAM_DEPARTMENT LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullVamDepartment",
      "((VAM_DEPARTMENT) = ? OR VAM_DEPARTMENT IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INVamDepartment", "VAM_DEPARTMENT IN ( ? )" ) // IN

         .addFilterBy( "NOTINVamDepartment", "VAM_DEPARTMENT NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "VamDepartmentasc", "VAM_DEPARTMENT ASC" ) // ORDER ASCENDING

         .addOrderBy( "VamDepartmentdesc", "VAM_DEPARTMENT DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalVamSalesman", "(VAM_SALESMAN) = ?" ) // EQUAL

         .addFilterBy( "notequalVamSalesman", "(VAM_SALESMAN) != ?" ) // NOTEQUAL

         .addFilterBy( "nullVamSalesman",
      "(VAM_SALESMAN IS NULL OR LENGTH((VAM_SALESMAN)) = 0)" ) // IS NULL

         .addFilterBy( "notnullVamSalesman", "VAM_SALESMAN IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByVamSalesmanMatch", "VAM_SALESMAN LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullVamSalesman",
      "((VAM_SALESMAN) = ? OR VAM_SALESMAN IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INVamSalesman", "VAM_SALESMAN IN ( ? )" ) // IN

         .addFilterBy( "NOTINVamSalesman", "VAM_SALESMAN NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "VamSalesmanasc", "VAM_SALESMAN ASC" ) // ORDER ASCENDING

         .addOrderBy( "VamSalesmandesc", "VAM_SALESMAN DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalVamDealerId", "(VAM_DEALER_ID) = ?" ) // EQUAL

         .addFilterBy( "notequalVamDealerId", "(VAM_DEALER_ID) != ?" ) // NOTEQUAL

         .addFilterBy( "nullVamDealerId",
      "(VAM_DEALER_ID IS NULL OR LENGTH((VAM_DEALER_ID)) = 0)" ) // IS NULL

         .addFilterBy( "notnullVamDealerId", "VAM_DEALER_ID IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByVamDealerIdMatch", "VAM_DEALER_ID LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullVamDealerId",
      "((VAM_DEALER_ID) = ? OR VAM_DEALER_ID IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INVamDealerId", "VAM_DEALER_ID IN ( ? )" ) // IN

         .addFilterBy( "NOTINVamDealerId", "VAM_DEALER_ID NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "VamDealerIdasc", "VAM_DEALER_ID ASC" ) // ORDER ASCENDING

         .addOrderBy( "VamDealerIddesc", "VAM_DEALER_ID DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalVamAbarDate", "VAM_ABAR_DATE = ?" ) // EQUAL

         .addFilterBy( "notequalVamAbarDate", "VAM_ABAR_DATE != ?" ) // NOTEQUAL

         .addFilterBy( "nullVamAbarDate", "VAM_ABAR_DATE IS NULL" ) // IS NULL

         .addFilterBy( "notnullVamAbarDate", "VAM_ABAR_DATE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanVamAbarDate", "VAM_ABAR_DATE < ?" ) // LESS THAN

         .addFilterBy( "greaterthanVamAbarDate", "VAM_ABAR_DATE > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalVamAbarDate", "VAM_ABAR_DATE <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalVamAbarDate", "VAM_ABAR_DATE >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "betweenVamAbarDate", "VAM_ABAR_DATE BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullVamAbarDate",
      "(VAM_ABAR_DATE IS NULL OR VAM_ABAR_DATE = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullVamAbarDate",
      "(VAM_ABAR_DATE IS NULL OR VAM_ABAR_DATE < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullVamAbarDate",
      "(VAM_ABAR_DATE IS NULL OR VAM_ABAR_DATE > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INVamAbarDate", "VAM_ABAR_DATE IN ( ? )" ) // IN

         .addFilterBy( "NOTINVamAbarDate", "VAM_ABAR_DATE NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "VamAbarDateasc", "VAM_ABAR_DATE ASC" ) // ORDER ASCENDING

         .addOrderBy( "VamAbarDatedesc", "VAM_ABAR_DATE DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalVamSubsSuffix", "(VAM_SUBS_SUFFIX) = ?" ) // EQUAL

         .addFilterBy( "notequalVamSubsSuffix", "(VAM_SUBS_SUFFIX) != ?" ) // NOTEQUAL

         .addFilterBy( "nullVamSubsSuffix",
      "(VAM_SUBS_SUFFIX IS NULL OR LENGTH((VAM_SUBS_SUFFIX)) = 0)" ) // IS NULL

         .addFilterBy( "notnullVamSubsSuffix", "VAM_SUBS_SUFFIX IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByVamSubsSuffixMatch", "VAM_SUBS_SUFFIX LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullVamSubsSuffix",
      "((VAM_SUBS_SUFFIX) = ? OR VAM_SUBS_SUFFIX IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INVamSubsSuffix", "VAM_SUBS_SUFFIX IN ( ? )" ) // IN

         .addFilterBy( "NOTINVamSubsSuffix", "VAM_SUBS_SUFFIX NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "VamSubsSuffixasc", "VAM_SUBS_SUFFIX ASC" ) // ORDER ASCENDING

         .addOrderBy( "VamSubsSuffixdesc", "VAM_SUBS_SUFFIX DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalVamMessComment", "(VAM_MESS_COMMENT) = ?" ) // EQUAL

         .addFilterBy( "notequalVamMessComment", "(VAM_MESS_COMMENT) != ?" ) // NOTEQUAL

         .addFilterBy( "nullVamMessComment",
      "(VAM_MESS_COMMENT IS NULL OR LENGTH((VAM_MESS_COMMENT)) = 0)" ) // IS NULL

         .addFilterBy( "notnullVamMessComment", "VAM_MESS_COMMENT IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByVamMessCommentMatch",
      "VAM_MESS_COMMENT LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullVamMessComment",
      "((VAM_MESS_COMMENT) = ? OR VAM_MESS_COMMENT IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INVamMessComment", "VAM_MESS_COMMENT IN ( ? )" ) // IN

         .addFilterBy( "NOTINVamMessComment", "VAM_MESS_COMMENT NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "VamMessCommentasc", "VAM_MESS_COMMENT ASC" ) // ORDER ASCENDING

         .addOrderBy( "VamMessCommentdesc", "VAM_MESS_COMMENT DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalVamAirtimeNet", "(VAM_AIRTIME_NET) = ?" ) // EQUAL

         .addFilterBy( "notequalVamAirtimeNet", "(VAM_AIRTIME_NET) != ?" ) // NOTEQUAL

         .addFilterBy( "nullVamAirtimeNet",
      "(VAM_AIRTIME_NET IS NULL OR LENGTH((VAM_AIRTIME_NET)) = 0)" ) // IS NULL

         .addFilterBy( "notnullVamAirtimeNet", "VAM_AIRTIME_NET IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByVamAirtimeNetMatch", "VAM_AIRTIME_NET LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullVamAirtimeNet",
      "((VAM_AIRTIME_NET) = ? OR VAM_AIRTIME_NET IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INVamAirtimeNet", "VAM_AIRTIME_NET IN ( ? )" ) // IN

         .addFilterBy( "NOTINVamAirtimeNet", "VAM_AIRTIME_NET NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "VamAirtimeNetasc", "VAM_AIRTIME_NET ASC" ) // ORDER ASCENDING

         .addOrderBy( "VamAirtimeNetdesc", "VAM_AIRTIME_NET DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalVamPrFlag", "(VAM_PR_FLAG) = ?" ) // EQUAL

         .addFilterBy( "notequalVamPrFlag", "(VAM_PR_FLAG) != ?" ) // NOTEQUAL

         .addFilterBy( "nullVamPrFlag",
      "(VAM_PR_FLAG IS NULL OR LENGTH((VAM_PR_FLAG)) = 0)" ) // IS NULL

         .addFilterBy( "notnullVamPrFlag", "VAM_PR_FLAG IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByVamPrFlagMatch", "VAM_PR_FLAG LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullVamPrFlag",
      "((VAM_PR_FLAG) = ? OR VAM_PR_FLAG IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INVamPrFlag", "VAM_PR_FLAG IN ( ? )" ) // IN

         .addFilterBy( "NOTINVamPrFlag", "VAM_PR_FLAG NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "VamPrFlagasc", "VAM_PR_FLAG ASC" ) // ORDER ASCENDING

         .addOrderBy( "VamPrFlagdesc", "VAM_PR_FLAG DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalVamHierarchy", "(VAM_HIERARCHY) = ?" ) // EQUAL

         .addFilterBy( "notequalVamHierarchy", "(VAM_HIERARCHY) != ?" ) // NOTEQUAL

         .addFilterBy( "nullVamHierarchy",
      "(VAM_HIERARCHY IS NULL OR LENGTH((VAM_HIERARCHY)) = 0)" ) // IS NULL

         .addFilterBy( "notnullVamHierarchy", "VAM_HIERARCHY IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByVamHierarchyMatch", "VAM_HIERARCHY LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullVamHierarchy",
      "((VAM_HIERARCHY) = ? OR VAM_HIERARCHY IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INVamHierarchy", "VAM_HIERARCHY IN ( ? )" ) // IN

         .addFilterBy( "NOTINVamHierarchy", "VAM_HIERARCHY NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "VamHierarchyasc", "VAM_HIERARCHY ASC" ) // ORDER ASCENDING

         .addOrderBy( "VamHierarchydesc", "VAM_HIERARCHY DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalVamMsisdnKnown", "(VAM_MSISDN_KNOWN) = ?" ) // EQUAL

         .addFilterBy( "notequalVamMsisdnKnown", "(VAM_MSISDN_KNOWN) != ?" ) // NOTEQUAL

         .addFilterBy( "nullVamMsisdnKnown",
      "(VAM_MSISDN_KNOWN IS NULL OR LENGTH((VAM_MSISDN_KNOWN)) = 0)" ) // IS NULL

         .addFilterBy( "notnullVamMsisdnKnown", "VAM_MSISDN_KNOWN IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByVamMsisdnKnownMatch",
      "VAM_MSISDN_KNOWN LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullVamMsisdnKnown",
      "((VAM_MSISDN_KNOWN) = ? OR VAM_MSISDN_KNOWN IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INVamMsisdnKnown", "VAM_MSISDN_KNOWN IN ( ? )" ) // IN

         .addFilterBy( "NOTINVamMsisdnKnown", "VAM_MSISDN_KNOWN NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "VamMsisdnKnownasc", "VAM_MSISDN_KNOWN ASC" ) // ORDER ASCENDING

         .addOrderBy( "VamMsisdnKnowndesc", "VAM_MSISDN_KNOWN DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalVamTariffChg", "VAM_TARIFF_CHG = ?" ) // EQUAL

         .addFilterBy( "notequalVamTariffChg", "VAM_TARIFF_CHG != ?" ) // NOTEQUAL

         .addFilterBy( "nullVamTariffChg", "VAM_TARIFF_CHG IS NULL" ) // IS NULL

         .addFilterBy( "notnullVamTariffChg", "VAM_TARIFF_CHG IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanVamTariffChg", "VAM_TARIFF_CHG < ?" ) // LESS THAN

         .addFilterBy( "greaterthanVamTariffChg", "VAM_TARIFF_CHG > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalVamTariffChg", "VAM_TARIFF_CHG <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalVamTariffChg", "VAM_TARIFF_CHG >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "betweenVamTariffChg", "VAM_TARIFF_CHG BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullVamTariffChg",
      "(VAM_TARIFF_CHG IS NULL OR VAM_TARIFF_CHG = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullVamTariffChg",
      "(VAM_TARIFF_CHG IS NULL OR VAM_TARIFF_CHG < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullVamTariffChg",
      "(VAM_TARIFF_CHG IS NULL OR VAM_TARIFF_CHG > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INVamTariffChg", "VAM_TARIFF_CHG IN ( ? )" ) // IN

         .addFilterBy( "NOTINVamTariffChg", "VAM_TARIFF_CHG NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "VamTariffChgasc", "VAM_TARIFF_CHG ASC" ) // ORDER ASCENDING

         .addOrderBy( "VamTariffChgdesc", "VAM_TARIFF_CHG DESC" ) // ORDER DESCENDING
    ;
    table.addFilterBy( "equalVamOrigProvId", "VAM_ORIG_PROV_ID = ?" ) // EQUAL

         .addFilterBy( "notequalVamOrigProvId", "VAM_ORIG_PROV_ID != ?" ) // NOTEQUAL

         .addFilterBy( "nullVamOrigProvId", "VAM_ORIG_PROV_ID IS NULL" ) // IS NULL

         .addFilterBy( "notnullVamOrigProvId", "VAM_ORIG_PROV_ID IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanVamOrigProvId", "VAM_ORIG_PROV_ID < ?" ) // LESS THAN

         .addFilterBy( "greaterthanVamOrigProvId", "VAM_ORIG_PROV_ID > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalVamOrigProvId", "VAM_ORIG_PROV_ID <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalVamOrigProvId", "VAM_ORIG_PROV_ID >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "betweenVamOrigProvId", "VAM_ORIG_PROV_ID BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullVamOrigProvId",
      "(VAM_ORIG_PROV_ID IS NULL OR VAM_ORIG_PROV_ID = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullVamOrigProvId",
      "(VAM_ORIG_PROV_ID IS NULL OR VAM_ORIG_PROV_ID < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullVamOrigProvId",
      "(VAM_ORIG_PROV_ID IS NULL OR VAM_ORIG_PROV_ID > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INVamOrigProvId", "VAM_ORIG_PROV_ID IN ( ? )" ) // IN

         .addFilterBy( "NOTINVamOrigProvId", "VAM_ORIG_PROV_ID NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "VamOrigProvIdasc", "VAM_ORIG_PROV_ID ASC" ) // ORDER ASCENDING

         .addOrderBy( "VamOrigProvIddesc", "VAM_ORIG_PROV_ID DESC" ) // ORDER DESCENDING
     ;
         table.addFilterBy( "equalVamImpProvId", "VAM_IMP_PROV_ID = ?" ) // EQUAL

	          .addFilterBy( "notequalVamImpProvId", "VAM_IMP_PROV_ID != ?" ) // NOTEQUAL

	          .addFilterBy( "nullVamImpProvId", "VAM_IMP_PROV_ID IS NULL" ) // IS NULL

	          .addFilterBy( "notnullVamImpProvId", "VAM_IMP_PROV_ID IS NOT NULL" ) // IS NOT NULL

	          .addFilterBy( "lessthanVamImpProvId", "VAM_IMP_PROV_ID < ?" ) // LESS THAN

	          .addFilterBy( "greaterthanVamImpProvId", "VAM_IMP_PROV_ID > ?" ) // GREATER THAN

	          .addFilterBy( "lessthanorequalVamImpProvId", "VAM_IMP_PROV_ID <= ?" ) // LESS THAN OR EQUAL

	          .addFilterBy( "greaterthanorequalVamImpProvId", "VAM_IMP_PROV_ID >= ?" ) // GREATER THAN OR EQUAL

	          .addFilterBy( "betweenVamImpProvId", "VAM_IMP_PROV_ID BETWEEN ? AND ?" ) // BETWEEN

	          .addFilterBy( "equalornullVamImpProvId",
	       "(VAM_IMP_PROV_ID IS NULL OR VAM_IMP_PROV_ID = ?)" ) // EQUALORNULL

	          .addFilterBy( "lessthanornullVamImpProvId",
	       "(VAM_IMP_PROV_ID IS NULL OR VAM_IMP_PROV_ID < ?)" ) // LESSTHANORNULL

	          .addFilterBy( "greaterthanornullVamImpProvId",
	       "(VAM_IMP_PROV_ID IS NULL OR VAM_IMP_PROV_ID > ?)" ) // GREATERTHANORNULL

	          .addFilterBy( "INVamImpProvId", "VAM_IMP_PROV_ID IN ( ? )" ) // IN

	          .addFilterBy( "NOTINVamImpProvId", "VAM_IMP_PROV_ID NOT IN ( ? )" ) // NOT IN

	          .addOrderBy( "VamImpProvIdasc", "VAM_IMP_PROV_ID ASC" ) // ORDER ASCENDING

         .addOrderBy( "VamImpProvIddesc", "VAM_IMP_PROV_ID DESC" ) // ORDER DESCENDING
         ;
             table.addFilterBy( "equalVamOrigServProv", "VAM_ORIG_SERV_PROV = ?" ) // EQUAL

		          .addFilterBy( "notequalVamOrigServProv", "VAM_ORIG_SERV_PROV != ?" ) // NOTEQUAL

		          .addFilterBy( "nullVamOrigServProv", "VAM_ORIG_SERV_PROV IS NULL" ) // IS NULL

		          .addFilterBy( "notnullVamOrigServProv", "VAM_ORIG_SERV_PROV IS NOT NULL" ) // IS NOT NULL

		          .addFilterBy( "lessthanVamOrigServProv", "VAM_ORIG_SERV_PROV < ?" ) // LESS THAN

		          .addFilterBy( "greaterthanVamOrigServProv", "VAM_ORIG_SERV_PROV > ?" ) // GREATER THAN

		          .addFilterBy( "lessthanorequalVamOrigServProv", "VAM_ORIG_SERV_PROV <= ?" ) // LESS THAN OR EQUAL

		          .addFilterBy( "greaterthanorequalVamOrigServProv", "VAM_ORIG_SERV_PROV >= ?" ) // GREATER THAN OR EQUAL

		          .addFilterBy( "betweenVamOrigServProv", "VAM_ORIG_SERV_PROV BETWEEN ? AND ?" ) // BETWEEN

		          .addFilterBy( "equalornullVamOrigServProv",
		       "(VAM_ORIG_SERV_PROV IS NULL OR VAM_ORIG_SERV_PROV = ?)" ) // EQUALORNULL

		          .addFilterBy( "lessthanornullVamOrigServProv",
		       "(VAM_ORIG_SERV_PROV IS NULL OR VAM_ORIG_SERV_PROV < ?)" ) // LESSTHANORNULL

		          .addFilterBy( "greaterthanornullVamOrigServProv",
		       "(VAM_ORIG_SERV_PROV IS NULL OR VAM_ORIG_SERV_PROV > ?)" ) // GREATERTHANORNULL

		          .addFilterBy( "INVamOrigServProv", "VAM_ORIG_SERV_PROV IN ( ? )" ) // IN

		          .addFilterBy( "NOTINVamOrigServProv", "VAM_ORIG_SERV_PROV NOT IN ( ? )" ) // NOT IN

		          .addOrderBy( "VamOrigServProvasc", "VAM_ORIG_SERV_PROV ASC" ) // ORDER ASCENDING

         .addOrderBy( "VamOrigServProvdesc", "VAM_ORIG_SERV_PROV DESC" ) // ORDER DESCENDING
         ;
    table.addFilterBy( "equalVamImpServProv", "VAM_MSISDN_EXPRTD = ?" ) // EQUAL

         .addFilterBy( "notequalVamImpServProv", "VAM_MSISDN_EXPRTD != ?" ) // NOTEQUAL

         .addFilterBy( "nullVamImpServProv", "VAM_MSISDN_EXPRTD IS NULL" ) // IS NULL

         .addFilterBy( "notnullVamImpServProv", "VAM_MSISDN_EXPRTD IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanVamImpServProv", "VAM_MSISDN_EXPRTD < ?" ) // LESS THAN

         .addFilterBy( "greaterthanVamImpServProv", "VAM_MSISDN_EXPRTD > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalVamImpServProv", "VAM_MSISDN_EXPRTD <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalVamImpServProv", "VAM_MSISDN_EXPRTD >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "betweenVamImpServProv", "VAM_MSISDN_EXPRTD BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullVamImpServProv",
      "(VAM_MSISDN_EXPRTD IS NULL OR VAM_MSISDN_EXPRTD = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullVamImpServProv",
      "(VAM_MSISDN_EXPRTD IS NULL OR VAM_MSISDN_EXPRTD < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullVamImpServProv",
      "(VAM_MSISDN_EXPRTD IS NULL OR VAM_MSISDN_EXPRTD > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INVamImpServProv", "VAM_MSISDN_EXPRTD IN ( ? )" ) // IN

         .addFilterBy( "NOTINVamImpServProv", "VAM_MSISDN_EXPRTD NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "VamImpServProvasc", "VAM_MSISDN_EXPRTD ASC" ) // ORDER ASCENDING

         .addOrderBy( "VamImpServProvdesc", "VAM_MSISDN_EXPRTD DESC" ) // ORDER DESCENDING
         ;
             table.addFilterBy( "equalVamMsisdnType", "VAM_MSISDN_TYPE = ?" ) // EQUAL

		          .addFilterBy( "notequalVamMsisdnType", "VAM_MSISDN_TYPE != ?" ) // NOTEQUAL

		          .addFilterBy( "nullVamMsisdnType", "VAM_MSISDN_TYPE IS NULL" ) // IS NULL

		          .addFilterBy( "notnullVamMsisdnType", "VAM_MSISDN_TYPE IS NOT NULL" ) // IS NOT NULL

		          .addFilterBy( "lessthanVamMsisdnType", "VAM_MSISDN_TYPE < ?" ) // LESS THAN

		          .addFilterBy( "greaterthanVamMsisdnType", "VAM_MSISDN_TYPE > ?" ) // GREATER THAN

		          .addFilterBy( "lessthanorequalVamMsisdnType", "VAM_MSISDN_TYPE <= ?" ) // LESS THAN OR EQUAL

		          .addFilterBy( "greaterthanorequalVamMsisdnType", "VAM_MSISDN_TYPE >= ?" ) // GREATER THAN OR EQUAL

		          .addFilterBy( "betweenVamMsisdnType", "VAM_MSISDN_TYPE BETWEEN ? AND ?" ) // BETWEEN

		          .addFilterBy( "equalornullVamMsisdnType",
		       "(VAM_MSISDN_TYPE IS NULL OR VAM_MSISDN_TYPE = ?)" ) // EQUALORNULL

		          .addFilterBy( "lessthanornullVamMsisdnType",
		       "(VAM_MSISDN_TYPE IS NULL OR VAM_MSISDN_TYPE < ?)" ) // LESSTHANORNULL

		          .addFilterBy( "greaterthanornullVamMsisdnType",
		       "(VAM_MSISDN_TYPE IS NULL OR VAM_MSISDN_TYPE > ?)" ) // GREATERTHANORNULL

		          .addFilterBy( "INVamMsisdnType", "VAM_MSISDN_TYPE IN ( ? )" ) // IN

		          .addFilterBy( "NOTINVamMsisdnType", "VAM_MSISDN_TYPE NOT IN ( ? )" ) // NOT IN

		          .addOrderBy( "VamMsisdnTypeasc", "VAM_MSISDN_TYPE ASC" ) // ORDER ASCENDING

         .addOrderBy( "VamMsisdnTypedesc", "VAM_MSISDN_TYPE DESC" ) // ORDER DESCENDING
         ;
             table.addFilterBy( "equalVamDummy", "VAM_DUMMY = ?" ) // EQUAL

		          .addFilterBy( "notequalVamDummy", "VAM_DUMMY != ?" ) // NOTEQUAL

		          .addFilterBy( "nullVamDummy", "VAM_DUMMY IS NULL" ) // IS NULL

		          .addFilterBy( "notnullVamDummy", "VAM_DUMMY IS NOT NULL" ) // IS NOT NULL

		          .addFilterBy( "lessthanVamDummy", "VAM_DUMMY < ?" ) // LESS THAN

		          .addFilterBy( "greaterthanVamDummy", "VAM_DUMMY > ?" ) // GREATER THAN

		          .addFilterBy( "lessthanorequalVamDummy", "VAM_DUMMY <= ?" ) // LESS THAN OR EQUAL

		          .addFilterBy( "greaterthanorequalVamDummy", "VAM_DUMMY >= ?" ) // GREATER THAN OR EQUAL

		          .addFilterBy( "betweenVamDummy", "VAM_DUMMY BETWEEN ? AND ?" ) // BETWEEN

		          .addFilterBy( "equalornullVamDummy",
		       "(VAM_DUMMY IS NULL OR VAM_DUMMY = ?)" ) // EQUALORNULL

		          .addFilterBy( "lessthanornullVamDummy",
		       "(VAM_DUMMY IS NULL OR VAM_DUMMY < ?)" ) // LESSTHANORNULL

		          .addFilterBy( "greaterthanornullVamDummy",
		       "(VAM_DUMMY IS NULL OR VAM_DUMMY > ?)" ) // GREATERTHANORNULL

		          .addFilterBy( "INVamDummy", "VAM_DUMMY IN ( ? )" ) // IN

		          .addFilterBy( "NOTINVamDummy", "VAM_DUMMY NOT IN ( ? )" ) // NOT IN

		          .addOrderBy( "VamDummyasc", "VAM_DUMMY ASC" ) // ORDER ASCENDING

         .addOrderBy( "VamDummydesc", "VAM_DUMMY DESC" ) // ORDER DESCENDING
         ;
    table.addFilterBy( "equalVamMsisdnExprtd", "VAM_MSISDN_EXPRTD = ?" ) // EQUAL

         .addFilterBy( "notequalVamMsisdnExprtd", "VAM_MSISDN_EXPRTD != ?" ) // NOTEQUAL

         .addFilterBy( "nullVamMsisdnExprtd", "VAM_MSISDN_EXPRTD IS NULL" ) // IS NULL

         .addFilterBy( "notnullVamMsisdnExprtd", "VAM_MSISDN_EXPRTD IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanVamMsisdnExprtd", "VAM_MSISDN_EXPRTD < ?" ) // LESS THAN

         .addFilterBy( "greaterthanVamMsisdnExprtd", "VAM_MSISDN_EXPRTD > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalVamMsisdnExprtd", "VAM_MSISDN_EXPRTD <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalVamMsisdnExprtd", "VAM_MSISDN_EXPRTD >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "betweenVamMsisdnExprtd", "VAM_MSISDN_EXPRTD BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullVamMsisdnExprtd",
      "(VAM_MSISDN_EXPRTD IS NULL OR VAM_MSISDN_EXPRTD = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullVamMsisdnExprtd",
      "(VAM_MSISDN_EXPRTD IS NULL OR VAM_MSISDN_EXPRTD < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullVamMsisdnExprtd",
      "(VAM_MSISDN_EXPRTD IS NULL OR VAM_MSISDN_EXPRTD > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INVamMsisdnExprtd", "VAM_MSISDN_EXPRTD IN ( ? )" ) // IN

         .addFilterBy( "NOTINVamMsisdnExprtd", "VAM_MSISDN_EXPRTD NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "VamMsisdnExprtdasc", "VAM_MSISDN_EXPRTD ASC" ) // ORDER ASCENDING

         .addOrderBy( "VamMsisdnExprtddesc", "VAM_MSISDN_EXPRTD DESC" ) // ORDER DESCENDING
         ;
             table.addFilterBy( "equalvamExportedTo", "VAM_EXPORTED_TO = ?" ) // EQUAL

		          .addFilterBy( "notequalvamExportedTo", "VAM_EXPORTED_TO != ?" ) // NOTEQUAL

		          .addFilterBy( "nullvamExportedTo", "VAM_EXPORTED_TO IS NULL" ) // IS NULL

		          .addFilterBy( "notnullvamExportedTo", "VAM_EXPORTED_TO IS NOT NULL" ) // IS NOT NULL

		          .addFilterBy( "lessthanvamExportedTo", "VAM_EXPORTED_TO < ?" ) // LESS THAN

		          .addFilterBy( "greaterthanvamExportedTo", "VAM_EXPORTED_TO > ?" ) // GREATER THAN

		          .addFilterBy( "lessthanorequalvamExportedTo", "VAM_EXPORTED_TO <= ?" ) // LESS THAN OR EQUAL

		          .addFilterBy( "greaterthanorequalvamExportedTo", "VAM_EXPORTED_TO >= ?" ) // GREATER THAN OR EQUAL

		          .addFilterBy( "betweenvamExportedTo", "VAM_EXPORTED_TO BETWEEN ? AND ?" ) // BETWEEN

		          .addFilterBy( "equalornullvamExportedTo",
		       "(VAM_EXPORTED_TO IS NULL OR VAM_EXPORTED_TO = ?)" ) // EQUALORNULL

		          .addFilterBy( "lessthanornullvamExportedTo",
		       "(VAM_EXPORTED_TO IS NULL OR VAM_EXPORTED_TO < ?)" ) // LESSTHANORNULL

		          .addFilterBy( "greaterthanornullvamExportedTo",
		       "(VAM_EXPORTED_TO IS NULL OR VAM_EXPORTED_TO > ?)" ) // GREATERTHANORNULL

		          .addFilterBy( "INvamExportedTo", "VAM_EXPORTED_TO IN ( ? )" ) // IN

		          .addFilterBy( "NOTINvamExportedTo", "VAM_EXPORTED_TO NOT IN ( ? )" ) // NOT IN

		          .addOrderBy( "vamExportedToasc", "VAM_EXPORTED_TO ASC" ) // ORDER ASCENDING

         .addOrderBy( "vamExportedTodesc", "VAM_EXPORTED_TO DESC" ) // ORDER DESCENDING
         ;
             table.addFilterBy( "equalVamAnalysis1", "VAM_ANALYSIS_1 = ?" ) // EQUAL

		          .addFilterBy( "notequalVamAnalysis1", "VAM_ANALYSIS_1 != ?" ) // NOTEQUAL

		          .addFilterBy( "nullVamAnalysis1", "VAM_ANALYSIS_1 IS NULL" ) // IS NULL

		          .addFilterBy( "notnullVamAnalysis1", "VAM_ANALYSIS_1 IS NOT NULL" ) // IS NOT NULL

		          .addFilterBy( "lessthanVamAnalysis1", "VAM_ANALYSIS_1 < ?" ) // LESS THAN

		          .addFilterBy( "greaterthanVamAnalysis1", "VAM_ANALYSIS_1 > ?" ) // GREATER THAN

		          .addFilterBy( "lessthanorequalVamAnalysis1", "VAM_ANALYSIS_1 <= ?" ) // LESS THAN OR EQUAL

		          .addFilterBy( "greaterthanorequalVamAnalysis1", "VAM_ANALYSIS_1 >= ?" ) // GREATER THAN OR EQUAL

		          .addFilterBy( "betweenVamAnalysis1", "VAM_ANALYSIS_1 BETWEEN ? AND ?" ) // BETWEEN

		          .addFilterBy( "equalornullVamAnalysis1",
		       "(VAM_ANALYSIS_1 IS NULL OR VAM_ANALYSIS_1 = ?)" ) // EQUALORNULL

		          .addFilterBy( "lessthanornullVamAnalysis1",
		       "(VAM_ANALYSIS_1 IS NULL OR VAM_ANALYSIS_1 < ?)" ) // LESSTHANORNULL

		          .addFilterBy( "greaterthanornullVamAnalysis1",
		       "(VAM_ANALYSIS_1 IS NULL OR VAM_ANALYSIS_1 > ?)" ) // GREATERTHANORNULL

		          .addFilterBy( "INVamAnalysis1", "VAM_ANALYSIS_1 IN ( ? )" ) // IN

		          .addFilterBy( "NOTINVamAnalysis1", "VAM_ANALYSIS_1 NOT IN ( ? )" ) // NOT IN

		          .addOrderBy( "VamAnalysis1asc", "VAM_ANALYSIS_1 ASC" ) // ORDER ASCENDING

         .addOrderBy( "VamAnalysis1desc", "VAM_ANALYSIS_1 DESC" ) // ORDER DESCENDING
         ;

    table.addFilterBy( "equalVamAnalysis2", "VAM_ANALYSIS_2 = ?" ) // EQUAL

         .addFilterBy( "notequalVamAnalysis2", "VAM_ANALYSIS_2 != ?" ) // NOTEQUAL

         .addFilterBy( "nullVamAnalysis2", "VAM_ANALYSIS_2 IS NULL" ) // IS NULL

         .addFilterBy( "notnullVamAnalysis2", "VAM_ANALYSIS_2 IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanVamAnalysis2", "VAM_ANALYSIS_2 < ?" ) // LESS THAN

         .addFilterBy( "greaterthanVamAnalysis2", "VAM_ANALYSIS_2 > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalVamAnalysis2", "VAM_ANALYSIS_2 <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalVamAnalysis2", "VAM_ANALYSIS_2 >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "betweenVamAnalysis2", "VAM_ANALYSIS_2 BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullVamAnalysis2",
      "(VAM_ANALYSIS_2 IS NULL OR VAM_ANALYSIS_2 = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullVamAnalysis2",
      "(VAM_ANALYSIS_2 IS NULL OR VAM_ANALYSIS_2 < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullVamAnalysis2",
      "(VAM_ANALYSIS_2 IS NULL OR VAM_ANALYSIS_2 > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INVamAnalysis2", "VAM_ANALYSIS_2 IN ( ? )" ) // IN

         .addFilterBy( "NOTINVamAnalysis2", "VAM_ANALYSIS_2 NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "VamAnalysis2asc", "VAM_ANALYSIS_2 ASC" ) // ORDER ASCENDING

         .addOrderBy( "VamAnalysis2desc", "VAM_ANALYSIS_2 DESC" ) // ORDER DESCENDING
         ;

    table.addFilterBy( "equalVamAnalysis3", "VAM_ANALYSIS_3 = ?" ) // EQUAL

         .addFilterBy( "notequalVamAnalysis3", "VAM_ANALYSIS_3 != ?" ) // NOTEQUAL

         .addFilterBy( "nullVamAnalysis3", "VAM_ANALYSIS_3 IS NULL" ) // IS NULL

         .addFilterBy( "notnullVamAnalysis3", "VAM_ANALYSIS_3 IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanVamAnalysis3", "VAM_ANALYSIS_3 < ?" ) // LESS THAN

         .addFilterBy( "greaterthanVamAnalysis3", "VAM_ANALYSIS_3 > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalVamAnalysis3", "VAM_ANALYSIS_3 <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalVamAnalysis3", "VAM_ANALYSIS_3 >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "betweenVamAnalysis3", "VAM_ANALYSIS_3 BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullVamAnalysis3",
      "(VAM_ANALYSIS_3 IS NULL OR VAM_ANALYSIS_3 = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullVamAnalysis3",
      "(VAM_ANALYSIS_3 IS NULL OR VAM_ANALYSIS_3 < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullVamAnalysis3",
      "(VAM_ANALYSIS_3 IS NULL OR VAM_ANALYSIS_3 > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INVamAnalysis3", "VAM_ANALYSIS_3 IN ( ? )" ) // IN

         .addFilterBy( "NOTINVamAnalysis3", "VAM_ANALYSIS_3 NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "VamAnalysis3asc", "VAM_ANALYSIS_3 ASC" ) // ORDER ASCENDING

         .addOrderBy( "VamAnalysis3desc", "VAM_ANALYSIS_3 DESC" ) // ORDER DESCENDING
         ;

    table.addFilterBy( "equalVamAnalysis4", "VAM_ANALYSIS_4 = ?" ) // EQUAL

         .addFilterBy( "notequalVamAnalysis4", "VAM_ANALYSIS_4 != ?" ) // NOTEQUAL

         .addFilterBy( "nullVamAnalysis4", "VAM_ANALYSIS_4 IS NULL" ) // IS NULL

         .addFilterBy( "notnullVamAnalysis4", "VAM_ANALYSIS_4 IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanVamAnalysis4", "VAM_ANALYSIS_4 < ?" ) // LESS THAN

         .addFilterBy( "greaterthanVamAnalysis4", "VAM_ANALYSIS_4 > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalVamAnalysis4", "VAM_ANALYSIS_4 <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalVamAnalysis4", "VAM_ANALYSIS_4 >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "betweenVamAnalysis4", "VAM_ANALYSIS_4 BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullVamAnalysis4",
      "(VAM_ANALYSIS_4 IS NULL OR VAM_ANALYSIS_4 = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullVamAnalysis4",
      "(VAM_ANALYSIS_4 IS NULL OR VAM_ANALYSIS_4 < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullVamAnalysis4",
      "(VAM_ANALYSIS_4 IS NULL OR VAM_ANALYSIS_4 > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INVamAnalysis4", "VAM_ANALYSIS_4 IN ( ? )" ) // IN

         .addFilterBy( "NOTINVamAnalysis4", "VAM_ANALYSIS_4 NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "VamAnalysis4asc", "VAM_ANALYSIS_4 ASC" ) // ORDER ASCENDING

         .addOrderBy( "VamAnalysis4desc", "VAM_ANALYSIS_4 DESC" ) // ORDER DESCENDING
         ;

    table.addFilterBy( "equalVamAnalysis5", "VAM_ANALYSIS_5 = ?" ) // EQUAL

         .addFilterBy( "notequalVamAnalysis5", "VAM_ANALYSIS_5 != ?" ) // NOTEQUAL

         .addFilterBy( "nullVamAnalysis5", "VAM_ANALYSIS_5 IS NULL" ) // IS NULL

         .addFilterBy( "notnullVamAnalysis5", "VAM_ANALYSIS_5 IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanVamAnalysis5", "VAM_ANALYSIS_5 < ?" ) // LESS THAN

         .addFilterBy( "greaterthanVamAnalysis5", "VAM_ANALYSIS_5 > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalVamAnalysis5", "VAM_ANALYSIS_5 <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalVamAnalysis5", "VAM_ANALYSIS_5 >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "betweenVamAnalysis5", "VAM_ANALYSIS_5 BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullVamAnalysis5",
      "(VAM_ANALYSIS_5 IS NULL OR VAM_ANALYSIS_5 = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullVamAnalysis5",
      "(VAM_ANALYSIS_5 IS NULL OR VAM_ANALYSIS_5 < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullVamAnalysis5",
      "(VAM_ANALYSIS_5 IS NULL OR VAM_ANALYSIS_5 > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INVamAnalysis5", "VAM_ANALYSIS_5 IN ( ? )" ) // IN

         .addFilterBy( "NOTINVamAnalysis5", "VAM_ANALYSIS_5 NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "VamAnalysis5asc", "VAM_ANALYSIS_5 ASC" ) // ORDER ASCENDING

         .addOrderBy( "VamAnalysis5desc", "VAM_ANALYSIS_5 DESC" ) // ORDER DESCENDING
    ;
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
      dml = new VamActiveMsisdnAbstractDMLFactory(  );
    }

    return dml;
  }
}
