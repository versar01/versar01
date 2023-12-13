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
 * This is the DMLFactory for VpsPackageServ.
 *
 * @version $Revision: 1.1 $
 * @author $Author$
 * @since $jdk$
 */
public class VpsPackageServAbstractDMLFactory
  extends BaseDMLFactory {
  //~ Static variables/initializers //////////////////////////////////////////

  /** The DMLFactory singleton */
  private static DMLFactory dml = null;

  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new VpsPackageServAbstractDMLFactory object.
   *
   * @throws DMLException DOCUMENT ME!
   */
  protected VpsPackageServAbstractDMLFactory(  )
    throws DMLException {
    ;

    DMLTable table = defTable( "VpsPackageServ", // dmlName
        "blo.VpsPackageServDMO", // dmoName
        "VPS_PACKAGE_SERV", // tableName
        7, // numColumns
        "VPS_PACKAGE_CODE, VPS_SERVICE_CODE, VPS_ALTER_CHARGE, VPS_MULTI_CHARGE, VPS_CHANGE_MULTI, VPS_PRICE_BY_TARIF, VPS_AUTO_CONNECT", // columnList
        "(VPS_PACKAGE_CODE)" + ", (VPS_SERVICE_CODE)", //primaryKey
        "" // versionCol     
      , false, // generatedKey
        "VPS_PACKAGE_CODE, VPS_SERVICE_CODE, VPS_ALTER_CHARGE, VPS_MULTI_CHARGE, VPS_CHANGE_MULTI, VPS_PRICE_BY_TARIF, VPS_AUTO_CONNECT",
        "", "",
        new String[] {
          "VPS_PACKAGE_CODE", "VPS_SERVICE_CODE", "VPS_ALTER_CHARGE",
          "VPS_MULTI_CHARGE", "VPS_CHANGE_MULTI", "VPS_PRICE_BY_TARIF",
          "VPS_AUTO_CONNECT"
        } );

    table.addFilterBy( "equalVpsPackageCode", /* PK attribute */
      "(VPS_PACKAGE_CODE) = ?" )
         .addFilterBy( "filterByVpsPackageCodeMatch",
      "VPS_PACKAGE_CODE LIKE ?" )
         .addFilterBy( "INVpsPackageCode", "(VPS_PACKAGE_CODE) IN ( ? )" ) // IN

         .addFilterBy( "NOTINVpsPackageCode",
      "(VPS_PACKAGE_CODE) NOT IN ( ? )" ) // NOT IN

         .addFilterBy( "notequalVpsPackageCode", "(VPS_PACKAGE_CODE) != ?" ) // NOTEQUAL

         .addFilterBy( "nullVpsPackageCode",
      "(VPS_PACKAGE_CODE IS NULL OR LENGTH((VPS_PACKAGE_CODE)) IS NULL OR LENGTH((VPS_PACKAGE_CODE)) = 0)" ) // IS NULL

         .addFilterBy( "notnullVpsPackageCode", "VPS_PACKAGE_CODE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanVpsPackageCode", "VPS_PACKAGE_CODE < ?" ) // LESS THAN

         .addFilterBy( "greaterthanVpsPackageCode", "VPS_PACKAGE_CODE > ?" ) // GREATER THAN

         .addFilterBy( "filterByVpsPackageCodeMatch",
      "VPS_PACKAGE_CODE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullVpsPackageCode",
      "((VPS_PACKAGE_CODE) = ? OR VPS_PACKAGE_CODE IS NULL)" ) // EQUALORNULL
                                                                   // TODO : we may need to wrap this with a () 

         .addOrderBy( "VpsPackageCodeasc", "VPS_PACKAGE_CODE ASC" ) // ORDER ASCENDING

         .addOrderBy( "VpsPackageCodedesc", "VPS_PACKAGE_CODE DESC" ) // ORDER DESCENDING

         .addFilterBy( "equalVpsServiceCode", /* PK attribute */
      "(VPS_SERVICE_CODE) = ?" )
         .addFilterBy( "filterByVpsServiceCodeMatch",
      "VPS_SERVICE_CODE LIKE ?" )
         .addFilterBy( "INVpsServiceCode", "(VPS_SERVICE_CODE) IN ( ? )" ) // IN

         .addFilterBy( "NOTINVpsServiceCode",
      "(VPS_SERVICE_CODE) NOT IN ( ? )" ) // NOT IN

         .addFilterBy( "notequalVpsServiceCode", "(VPS_SERVICE_CODE) != ?" ) // NOTEQUAL

         .addFilterBy( "nullVpsServiceCode",
      "(VPS_SERVICE_CODE IS NULL OR LENGTH((VPS_SERVICE_CODE)) IS NULL OR LENGTH((VPS_SERVICE_CODE)) = 0)" ) // IS NULL

         .addFilterBy( "notnullVpsServiceCode", "VPS_SERVICE_CODE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanVpsServiceCode", "VPS_SERVICE_CODE < ?" ) // LESS THAN

         .addFilterBy( "greaterthanVpsServiceCode", "VPS_SERVICE_CODE > ?" ) // GREATER THAN

         .addFilterBy( "filterByVpsServiceCodeMatch",
      "VPS_SERVICE_CODE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullVpsServiceCode",
      "((VPS_SERVICE_CODE) = ? OR VPS_SERVICE_CODE IS NULL)" ) // EQUALORNULL
                                                                   // TODO : we may need to wrap this with a () 

         .addOrderBy( "VpsServiceCodeasc", "VPS_SERVICE_CODE ASC" ) // ORDER ASCENDING

         .addOrderBy( "VpsServiceCodedesc", "VPS_SERVICE_CODE DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalVpsAlterCharge", "(VPS_ALTER_CHARGE) = ?" ) // EQUAL

         .addFilterBy( "notequalVpsAlterCharge", "(VPS_ALTER_CHARGE) != ?" ) // NOTEQUAL

         .addFilterBy( "nullVpsAlterCharge",
      "(VPS_ALTER_CHARGE IS NULL OR LENGTH((VPS_ALTER_CHARGE)) IS NULL OR LENGTH((VPS_ALTER_CHARGE)) = 0)" ) // IS NULL

         .addFilterBy( "notnullVpsAlterCharge", "VPS_ALTER_CHARGE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanVpsAlterCharge", "VPS_ALTER_CHARGE < ?" ) // LESS THAN

         .addFilterBy( "greaterthanVpsAlterCharge", "VPS_ALTER_CHARGE > ?" ) // GREATER THAN

         .addFilterBy( "filterByVpsAlterChargeMatch",
      "VPS_ALTER_CHARGE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullVpsAlterCharge",
      "((VPS_ALTER_CHARGE) = ? OR VPS_ALTER_CHARGE IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INVpsAlterCharge", "(VPS_ALTER_CHARGE) IN ( ? )" ) // IN

         .addFilterBy( "NOTINVpsAlterCharge",
      "(VPS_ALTER_CHARGE) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "VpsAlterChargeasc", "VPS_ALTER_CHARGE ASC" ) // ORDER ASCENDING

         .addOrderBy( "VpsAlterChargedesc", "VPS_ALTER_CHARGE DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalVpsMultiCharge", "(VPS_MULTI_CHARGE) = ?" ) // EQUAL

         .addFilterBy( "notequalVpsMultiCharge", "(VPS_MULTI_CHARGE) != ?" ) // NOTEQUAL

         .addFilterBy( "nullVpsMultiCharge",
      "(VPS_MULTI_CHARGE IS NULL OR LENGTH((VPS_MULTI_CHARGE)) IS NULL OR LENGTH((VPS_MULTI_CHARGE)) = 0)" ) // IS NULL

         .addFilterBy( "notnullVpsMultiCharge", "VPS_MULTI_CHARGE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanVpsMultiCharge", "VPS_MULTI_CHARGE < ?" ) // LESS THAN

         .addFilterBy( "greaterthanVpsMultiCharge", "VPS_MULTI_CHARGE > ?" ) // GREATER THAN

         .addFilterBy( "filterByVpsMultiChargeMatch",
      "VPS_MULTI_CHARGE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullVpsMultiCharge",
      "((VPS_MULTI_CHARGE) = ? OR VPS_MULTI_CHARGE IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INVpsMultiCharge", "(VPS_MULTI_CHARGE) IN ( ? )" ) // IN

         .addFilterBy( "NOTINVpsMultiCharge",
      "(VPS_MULTI_CHARGE) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "VpsMultiChargeasc", "VPS_MULTI_CHARGE ASC" ) // ORDER ASCENDING

         .addOrderBy( "VpsMultiChargedesc", "VPS_MULTI_CHARGE DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalVpsChangeMulti", "(VPS_CHANGE_MULTI) = ?" ) // EQUAL

         .addFilterBy( "notequalVpsChangeMulti", "(VPS_CHANGE_MULTI) != ?" ) // NOTEQUAL

         .addFilterBy( "nullVpsChangeMulti",
      "(VPS_CHANGE_MULTI IS NULL OR LENGTH((VPS_CHANGE_MULTI)) IS NULL OR LENGTH((VPS_CHANGE_MULTI)) = 0)" ) // IS NULL

         .addFilterBy( "notnullVpsChangeMulti", "VPS_CHANGE_MULTI IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanVpsChangeMulti", "VPS_CHANGE_MULTI < ?" ) // LESS THAN

         .addFilterBy( "greaterthanVpsChangeMulti", "VPS_CHANGE_MULTI > ?" ) // GREATER THAN

         .addFilterBy( "filterByVpsChangeMultiMatch",
      "VPS_CHANGE_MULTI LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullVpsChangeMulti",
      "((VPS_CHANGE_MULTI) = ? OR VPS_CHANGE_MULTI IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INVpsChangeMulti", "(VPS_CHANGE_MULTI) IN ( ? )" ) // IN

         .addFilterBy( "NOTINVpsChangeMulti",
      "(VPS_CHANGE_MULTI) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "VpsChangeMultiasc", "VPS_CHANGE_MULTI ASC" ) // ORDER ASCENDING

         .addOrderBy( "VpsChangeMultidesc", "VPS_CHANGE_MULTI DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalVpsPriceByTarif", "(VPS_PRICE_BY_TARIF) = ?" ) // EQUAL

         .addFilterBy( "notequalVpsPriceByTarif",
      "(VPS_PRICE_BY_TARIF) != ?" ) // NOTEQUAL

         .addFilterBy( "nullVpsPriceByTarif",
      "(VPS_PRICE_BY_TARIF IS NULL OR LENGTH((VPS_PRICE_BY_TARIF)) IS NULL OR LENGTH((VPS_PRICE_BY_TARIF)) = 0)" ) // IS NULL

         .addFilterBy( "notnullVpsPriceByTarif",
      "VPS_PRICE_BY_TARIF IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanVpsPriceByTarif", "VPS_PRICE_BY_TARIF < ?" ) // LESS THAN

         .addFilterBy( "greaterthanVpsPriceByTarif", "VPS_PRICE_BY_TARIF > ?" ) // GREATER THAN

         .addFilterBy( "filterByVpsPriceByTarifMatch",
      "VPS_PRICE_BY_TARIF LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullVpsPriceByTarif",
      "((VPS_PRICE_BY_TARIF) = ? OR VPS_PRICE_BY_TARIF IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INVpsPriceByTarif",
      "(VPS_PRICE_BY_TARIF) IN ( ? )" ) // IN

         .addFilterBy( "NOTINVpsPriceByTarif",
      "(VPS_PRICE_BY_TARIF) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "VpsPriceByTarifasc", "VPS_PRICE_BY_TARIF ASC" ) // ORDER ASCENDING

         .addOrderBy( "VpsPriceByTarifdesc", "VPS_PRICE_BY_TARIF DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalVpsAutoConnect", "(VPS_AUTO_CONNECT) = ?" ) // EQUAL

         .addFilterBy( "notequalVpsAutoConnect", "(VPS_AUTO_CONNECT) != ?" ) // NOTEQUAL

         .addFilterBy( "nullVpsAutoConnect",
      "(VPS_AUTO_CONNECT IS NULL OR LENGTH((VPS_AUTO_CONNECT)) IS NULL OR LENGTH((VPS_AUTO_CONNECT)) = 0)" ) // IS NULL

         .addFilterBy( "notnullVpsAutoConnect", "VPS_AUTO_CONNECT IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanVpsAutoConnect", "VPS_AUTO_CONNECT < ?" ) // LESS THAN

         .addFilterBy( "greaterthanVpsAutoConnect", "VPS_AUTO_CONNECT > ?" ) // GREATER THAN

         .addFilterBy( "filterByVpsAutoConnectMatch",
      "VPS_AUTO_CONNECT LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullVpsAutoConnect",
      "((VPS_AUTO_CONNECT) = ? OR VPS_AUTO_CONNECT IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INVpsAutoConnect", "(VPS_AUTO_CONNECT) IN ( ? )" ) // IN

         .addFilterBy( "NOTINVpsAutoConnect",
      "(VPS_AUTO_CONNECT) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "VpsAutoConnectasc", "VPS_AUTO_CONNECT ASC" ) // ORDER ASCENDING

         .addOrderBy( "VpsAutoConnectdesc", "VPS_AUTO_CONNECT DESC" ) // ORDER DESCENDING
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
      dml = new VpsPackageServDMLFactory(  );
    }

    return dml;
  }
}
