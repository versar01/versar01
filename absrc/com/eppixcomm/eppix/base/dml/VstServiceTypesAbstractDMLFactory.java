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

//import com.eppixcomm.eppix.common.dml.DMLException;
//import com.eppixcomm.eppix.common.dml.DMLFactory;
//import com.eppixcomm.eppix.common.dml.DMLTable;

/**
 * This is the DMLFactory for VstServiceTypes.
 *
 * @version $Revision: 1.1 $
 * @author $Author$
 * @since $jdk$
 */
public class VstServiceTypesAbstractDMLFactory
  extends BaseDMLFactory {
  //~ Static variables/initializers //////////////////////////////////////////

  /** The DMLFactory singleton */
  private static DMLFactory dml = null;

  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new VstServiceTypesAbstractDMLFactory object.
   *
   * @throws DMLException DOCUMENT ME!
   */
  protected VstServiceTypesAbstractDMLFactory(  )
    throws DMLException {
    ;

    DMLTable table = defTable( "VstServiceTypes", // dmlName
        "blo.VstServiceTypesDMO", // dmoName
        "VST_SERVICE_TYPES", // tableName
        12, // numColumns
        "VST_SERVICE_TYPE, VST_SERVICE_DESC, VST_MULTI_CHARGE, VST_SERVICE_CLASS, VST_AUTO_CONNECT, VST_ORIGINATOR, VST_TARIFF_RELATED, VST_PARAMETERISED, VST_PARAMS_LEVEL"
        + ", VST_ARCHIVE_MONTHS, VST_FUTURE_ACT, VST_NODE_LEVEL", // columnList
        "VST_SERVICE_TYPE", //primaryKey
        "" // versionCol     
      , false, // generatedKey
        "VST_SERVICE_TYPE, VST_SERVICE_DESC, VST_MULTI_CHARGE, VST_SERVICE_CLASS, VST_AUTO_CONNECT, VST_ORIGINATOR, VST_TARIFF_RELATED, VST_PARAMETERISED, VST_PARAMS_LEVEL"
        + ", VST_ARCHIVE_MONTHS, VST_FUTURE_ACT, VST_NODE_LEVEL", "", "",
        new String[] {
          "VST_SERVICE_TYPE", "VST_SERVICE_DESC", "VST_MULTI_CHARGE",
          "VST_SERVICE_CLASS", "VST_AUTO_CONNECT", "VST_ORIGINATOR",
          "VST_TARIFF_RELATED", "VST_PARAMETERISED", "VST_PARAMS_LEVEL",
          "VST_ARCHIVE_MONTHS", "VST_FUTURE_ACT", "VST_NODE_LEVEL"
        } );

    table.addFilterBy( "equalVstServiceType", /* PK attribute */
      "VST_SERVICE_TYPE = ?" )
         .addFilterBy( "filterByVstServiceTypeMatch",
      "VST_SERVICE_TYPE LIKE ?" )
         .addFilterBy( "INVstServiceType", "VST_SERVICE_TYPE IN ( ? )" ) // IN

         .addFilterBy( "NOTINVstServiceType", "VST_SERVICE_TYPE NOT IN ( ? )" ) // NOT IN

         .addFilterBy( "notequalVstServiceType", "VST_SERVICE_TYPE != ?" ) // NOTEQUAL

         .addFilterBy( "nullVstServiceType",
      "(VST_SERVICE_TYPE IS NULL OR LENGTH(VST_SERVICE_TYPE) IS NULL OR LENGTH(VST_SERVICE_TYPE) = 0)" ) // IS NULL

         .addFilterBy( "notnullVstServiceType", "VST_SERVICE_TYPE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanVstServiceType", "VST_SERVICE_TYPE < ?" ) // LESS THAN

         .addFilterBy( "greaterthanVstServiceType", "VST_SERVICE_TYPE > ?" ) // GREATER THAN

         .addFilterBy( "filterByVstServiceTypeMatch",
      "VST_SERVICE_TYPE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullVstServiceType",
      "(VST_SERVICE_TYPE = ? OR VST_SERVICE_TYPE IS NULL)" ) // EQUALORNULL
                                                             // TODO : we may need to wrap this with a TRIM() 

         .addOrderBy( "VstServiceTypeasc", "VST_SERVICE_TYPE ASC" ) // ORDER ASCENDING

         .addOrderBy( "VstServiceTypedesc", "VST_SERVICE_TYPE DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalVstServiceDesc", "VST_SERVICE_DESC = ?" ) // EQUAL

         .addFilterBy( "notequalVstServiceDesc", "VST_SERVICE_DESC != ?" ) // NOTEQUAL

         .addFilterBy( "nullVstServiceDesc",
      "(VST_SERVICE_DESC IS NULL OR LENGTH(VST_SERVICE_DESC) IS NULL OR LENGTH(VST_SERVICE_DESC) = 0)" ) // IS NULL

         .addFilterBy( "notnullVstServiceDesc", "VST_SERVICE_DESC IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanVstServiceDesc", "VST_SERVICE_DESC < ?" ) // LESS THAN

         .addFilterBy( "greaterthanVstServiceDesc", "VST_SERVICE_DESC > ?" ) // GREATER THAN

         .addFilterBy( "filterByVstServiceDescMatch",
      "VST_SERVICE_DESC LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullVstServiceDesc",
      "(VST_SERVICE_DESC = ? OR VST_SERVICE_DESC IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INVstServiceDesc", "VST_SERVICE_DESC IN ( ? )" ) // IN

         .addFilterBy( "NOTINVstServiceDesc", "VST_SERVICE_DESC NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "VstServiceDescasc", "VST_SERVICE_DESC ASC" ) // ORDER ASCENDING

         .addOrderBy( "VstServiceDescdesc", "VST_SERVICE_DESC DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalVstMultiCharge", "VST_MULTI_CHARGE = ?" ) // EQUAL

         .addFilterBy( "notequalVstMultiCharge", "VST_MULTI_CHARGE != ?" ) // NOTEQUAL

         .addFilterBy( "nullVstMultiCharge",
      "(VST_MULTI_CHARGE IS NULL OR LENGTH(VST_MULTI_CHARGE) IS NULL OR LENGTH(VST_MULTI_CHARGE) = 0)" ) // IS NULL

         .addFilterBy( "notnullVstMultiCharge", "VST_MULTI_CHARGE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanVstMultiCharge", "VST_MULTI_CHARGE < ?" ) // LESS THAN

         .addFilterBy( "greaterthanVstMultiCharge", "VST_MULTI_CHARGE > ?" ) // GREATER THAN

         .addFilterBy( "filterByVstMultiChargeMatch",
      "VST_MULTI_CHARGE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullVstMultiCharge",
      "(VST_MULTI_CHARGE = ? OR VST_MULTI_CHARGE IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INVstMultiCharge", "VST_MULTI_CHARGE IN ( ? )" ) // IN

         .addFilterBy( "NOTINVstMultiCharge", "VST_MULTI_CHARGE NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "VstMultiChargeasc", "VST_MULTI_CHARGE ASC" ) // ORDER ASCENDING

         .addOrderBy( "VstMultiChargedesc", "VST_MULTI_CHARGE DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalVstServiceClass", "VST_SERVICE_CLASS = ?" ) // EQUAL

         .addFilterBy( "notequalVstServiceClass", "VST_SERVICE_CLASS != ?" ) // NOTEQUAL

         .addFilterBy( "nullVstServiceClass",
      "(VST_SERVICE_CLASS IS NULL OR LENGTH(VST_SERVICE_CLASS) IS NULL OR LENGTH(VST_SERVICE_CLASS) = 0)" ) // IS NULL

         .addFilterBy( "notnullVstServiceClass",
      "VST_SERVICE_CLASS IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanVstServiceClass", "VST_SERVICE_CLASS < ?" ) // LESS THAN

         .addFilterBy( "greaterthanVstServiceClass", "VST_SERVICE_CLASS > ?" ) // GREATER THAN

         .addFilterBy( "filterByVstServiceClassMatch",
      "VST_SERVICE_CLASS LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullVstServiceClass",
      "(VST_SERVICE_CLASS = ? OR VST_SERVICE_CLASS IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INVstServiceClass", "VST_SERVICE_CLASS IN ( ? )" ) // IN

         .addFilterBy( "NOTINVstServiceClass",
      "VST_SERVICE_CLASS NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "VstServiceClassasc", "VST_SERVICE_CLASS ASC" ) // ORDER ASCENDING

         .addOrderBy( "VstServiceClassdesc", "VST_SERVICE_CLASS DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalVstAutoConnect", "VST_AUTO_CONNECT = ?" ) // EQUAL

         .addFilterBy( "notequalVstAutoConnect", "VST_AUTO_CONNECT != ?" ) // NOTEQUAL

         .addFilterBy( "nullVstAutoConnect",
      "(VST_AUTO_CONNECT IS NULL OR LENGTH(VST_AUTO_CONNECT) IS NULL OR LENGTH(VST_AUTO_CONNECT) = 0)" ) // IS NULL

         .addFilterBy( "notnullVstAutoConnect", "VST_AUTO_CONNECT IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanVstAutoConnect", "VST_AUTO_CONNECT < ?" ) // LESS THAN

         .addFilterBy( "greaterthanVstAutoConnect", "VST_AUTO_CONNECT > ?" ) // GREATER THAN

         .addFilterBy( "filterByVstAutoConnectMatch",
      "VST_AUTO_CONNECT LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullVstAutoConnect",
      "(VST_AUTO_CONNECT = ? OR VST_AUTO_CONNECT IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INVstAutoConnect", "VST_AUTO_CONNECT IN ( ? )" ) // IN

         .addFilterBy( "NOTINVstAutoConnect", "VST_AUTO_CONNECT NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "VstAutoConnectasc", "VST_AUTO_CONNECT ASC" ) // ORDER ASCENDING

         .addOrderBy( "VstAutoConnectdesc", "VST_AUTO_CONNECT DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalVstOriginator", "VST_ORIGINATOR = ?" ) // EQUAL

         .addFilterBy( "notequalVstOriginator", "VST_ORIGINATOR != ?" ) // NOTEQUAL

         .addFilterBy( "nullVstOriginator",
      "(VST_ORIGINATOR IS NULL OR LENGTH(VST_ORIGINATOR) IS NULL OR LENGTH(VST_ORIGINATOR) = 0)" ) // IS NULL

         .addFilterBy( "notnullVstOriginator", "VST_ORIGINATOR IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanVstOriginator", "VST_ORIGINATOR < ?" ) // LESS THAN

         .addFilterBy( "greaterthanVstOriginator", "VST_ORIGINATOR > ?" ) // GREATER THAN

         .addFilterBy( "filterByVstOriginatorMatch", "VST_ORIGINATOR LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullVstOriginator",
      "(VST_ORIGINATOR = ? OR VST_ORIGINATOR IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INVstOriginator", "VST_ORIGINATOR IN ( ? )" ) // IN

         .addFilterBy( "NOTINVstOriginator", "VST_ORIGINATOR NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "VstOriginatorasc", "VST_ORIGINATOR ASC" ) // ORDER ASCENDING

         .addOrderBy( "VstOriginatordesc", "VST_ORIGINATOR DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalVstTariffRelated", "VST_TARIFF_RELATED = ?" ) // EQUAL

         .addFilterBy( "notequalVstTariffRelated", "VST_TARIFF_RELATED != ?" ) // NOTEQUAL

         .addFilterBy( "nullVstTariffRelated",
      "(VST_TARIFF_RELATED IS NULL OR LENGTH(VST_TARIFF_RELATED) IS NULL OR LENGTH(VST_TARIFF_RELATED) = 0)" ) // IS NULL

         .addFilterBy( "notnullVstTariffRelated",
      "VST_TARIFF_RELATED IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanVstTariffRelated", "VST_TARIFF_RELATED < ?" ) // LESS THAN

         .addFilterBy( "greaterthanVstTariffRelated", "VST_TARIFF_RELATED > ?" ) // GREATER THAN

         .addFilterBy( "filterByVstTariffRelatedMatch",
      "VST_TARIFF_RELATED LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullVstTariffRelated",
      "(VST_TARIFF_RELATED = ? OR VST_TARIFF_RELATED IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INVstTariffRelated", "VST_TARIFF_RELATED IN ( ? )" ) // IN

         .addFilterBy( "NOTINVstTariffRelated",
      "VST_TARIFF_RELATED NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "VstTariffRelatedasc", "VST_TARIFF_RELATED ASC" ) // ORDER ASCENDING

         .addOrderBy( "VstTariffRelateddesc", "VST_TARIFF_RELATED DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalVstParameterised", "VST_PARAMETERISED = ?" ) // EQUAL

         .addFilterBy( "notequalVstParameterised", "VST_PARAMETERISED != ?" ) // NOTEQUAL

         .addFilterBy( "nullVstParameterised",
      "(VST_PARAMETERISED IS NULL OR LENGTH(VST_PARAMETERISED) IS NULL OR LENGTH(VST_PARAMETERISED) = 0)" ) // IS NULL

         .addFilterBy( "notnullVstParameterised",
      "VST_PARAMETERISED IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanVstParameterised", "VST_PARAMETERISED < ?" ) // LESS THAN

         .addFilterBy( "greaterthanVstParameterised", "VST_PARAMETERISED > ?" ) // GREATER THAN

         .addFilterBy( "filterByVstParameterisedMatch",
      "VST_PARAMETERISED LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullVstParameterised",
      "(VST_PARAMETERISED = ? OR VST_PARAMETERISED IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INVstParameterised", "VST_PARAMETERISED IN ( ? )" ) // IN

         .addFilterBy( "NOTINVstParameterised",
      "VST_PARAMETERISED NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "VstParameterisedasc", "VST_PARAMETERISED ASC" ) // ORDER ASCENDING

         .addOrderBy( "VstParameteriseddesc", "VST_PARAMETERISED DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalVstParamsLevel", "VST_PARAMS_LEVEL = ?" ) // EQUAL

         .addFilterBy( "notequalVstParamsLevel", "VST_PARAMS_LEVEL != ?" ) // NOTEQUAL

         .addFilterBy( "nullVstParamsLevel",
      "(VST_PARAMS_LEVEL IS NULL OR LENGTH(VST_PARAMS_LEVEL) IS NULL OR LENGTH(VST_PARAMS_LEVEL) = 0)" ) // IS NULL

         .addFilterBy( "notnullVstParamsLevel", "VST_PARAMS_LEVEL IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanVstParamsLevel", "VST_PARAMS_LEVEL < ?" ) // LESS THAN

         .addFilterBy( "greaterthanVstParamsLevel", "VST_PARAMS_LEVEL > ?" ) // GREATER THAN

         .addFilterBy( "filterByVstParamsLevelMatch",
      "VST_PARAMS_LEVEL LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullVstParamsLevel",
      "(VST_PARAMS_LEVEL = ? OR VST_PARAMS_LEVEL IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INVstParamsLevel", "VST_PARAMS_LEVEL IN ( ? )" ) // IN

         .addFilterBy( "NOTINVstParamsLevel", "VST_PARAMS_LEVEL NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "VstParamsLevelasc", "VST_PARAMS_LEVEL ASC" ) // ORDER ASCENDING

         .addOrderBy( "VstParamsLeveldesc", "VST_PARAMS_LEVEL DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalVstArchiveMonths", "VST_ARCHIVE_MONTHS = ?" ) // EQUAL

         .addFilterBy( "notequalVstArchiveMonths", "VST_ARCHIVE_MONTHS != ?" ) // NOTEQUAL

         .addFilterBy( "nullVstArchiveMonths", "VST_ARCHIVE_MONTHS IS NULL" ) // IS NULL

         .addFilterBy( "notnullVstArchiveMonths",
      "VST_ARCHIVE_MONTHS IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanVstArchiveMonths", "VST_ARCHIVE_MONTHS < ?" ) // LESS THAN

         .addFilterBy( "greaterthanVstArchiveMonths", "VST_ARCHIVE_MONTHS > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalVstArchiveMonths",
      "VST_ARCHIVE_MONTHS <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalVstArchiveMonths",
      "VST_ARCHIVE_MONTHS >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "filterByVstArchiveMonthsMatch",
      "VST_ARCHIVE_MONTHS LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "betweenVstArchiveMonths",
      "VST_ARCHIVE_MONTHS BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullVstArchiveMonths",
      "(VST_ARCHIVE_MONTHS IS NULL OR VST_ARCHIVE_MONTHS = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullVstArchiveMonths",
      "(VST_ARCHIVE_MONTHS IS NULL OR VST_ARCHIVE_MONTHS < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullVstArchiveMonths",
      "(VST_ARCHIVE_MONTHS IS NULL OR VST_ARCHIVE_MONTHS > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INVstArchiveMonths", "VST_ARCHIVE_MONTHS IN ( ? )" ) // IN

         .addFilterBy( "NOTINVstArchiveMonths",
      "VST_ARCHIVE_MONTHS NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "VstArchiveMonthsasc", "VST_ARCHIVE_MONTHS ASC" ) // ORDER ASCENDING

         .addOrderBy( "VstArchiveMonthsdesc", "VST_ARCHIVE_MONTHS DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalVstFutureAct", "VST_FUTURE_ACT = ?" ) // EQUAL

         .addFilterBy( "notequalVstFutureAct", "VST_FUTURE_ACT != ?" ) // NOTEQUAL

         .addFilterBy( "nullVstFutureAct",
      "(VST_FUTURE_ACT IS NULL OR LENGTH(VST_FUTURE_ACT) IS NULL OR LENGTH(VST_FUTURE_ACT) = 0)" ) // IS NULL

         .addFilterBy( "notnullVstFutureAct", "VST_FUTURE_ACT IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanVstFutureAct", "VST_FUTURE_ACT < ?" ) // LESS THAN

         .addFilterBy( "greaterthanVstFutureAct", "VST_FUTURE_ACT > ?" ) // GREATER THAN

         .addFilterBy( "filterByVstFutureActMatch", "VST_FUTURE_ACT LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullVstFutureAct",
      "(VST_FUTURE_ACT = ? OR VST_FUTURE_ACT IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INVstFutureAct", "VST_FUTURE_ACT IN ( ? )" ) // IN

         .addFilterBy( "NOTINVstFutureAct", "VST_FUTURE_ACT NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "VstFutureActasc", "VST_FUTURE_ACT ASC" ) // ORDER ASCENDING

         .addOrderBy( "VstFutureActdesc", "VST_FUTURE_ACT DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalVstNodeLevel", "VST_NODE_LEVEL = ?" ) // EQUAL

         .addFilterBy( "notequalVstNodeLevel", "VST_NODE_LEVEL != ?" ) // NOTEQUAL

         .addFilterBy( "nullVstNodeLevel",
      "(VST_NODE_LEVEL IS NULL OR LENGTH(VST_NODE_LEVEL) IS NULL OR LENGTH(VST_NODE_LEVEL) = 0)" ) // IS NULL

         .addFilterBy( "notnullVstNodeLevel", "VST_NODE_LEVEL IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanVstNodeLevel", "VST_NODE_LEVEL < ?" ) // LESS THAN

         .addFilterBy( "greaterthanVstNodeLevel", "VST_NODE_LEVEL > ?" ) // GREATER THAN

         .addFilterBy( "filterByVstNodeLevelMatch", "VST_NODE_LEVEL LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullVstNodeLevel",
      "(VST_NODE_LEVEL = ? OR VST_NODE_LEVEL IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INVstNodeLevel", "VST_NODE_LEVEL IN ( ? )" ) // IN

         .addFilterBy( "NOTINVstNodeLevel", "VST_NODE_LEVEL NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "VstNodeLevelasc", "VST_NODE_LEVEL ASC" ) // ORDER ASCENDING

         .addOrderBy( "VstNodeLeveldesc", "VST_NODE_LEVEL DESC" ) // ORDER DESCENDING
    ;

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
      dml = new VstServiceTypesDMLFactory(  );
    }

    return dml;
  }
}
