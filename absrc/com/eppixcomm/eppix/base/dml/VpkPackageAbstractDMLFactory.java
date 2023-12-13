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
 * This is the DMLFactory for VpkPackage.
 *
 * @version $Revision: 1.1 $
 * @author $Author$
 * @since $jdk$
 */
public class VpkPackageAbstractDMLFactory
  extends BaseDMLFactory {
  //~ Static variables/initializers //////////////////////////////////////////

  /** The DMLFactory singleton */
  private static DMLFactory dml = null;

  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new VpkPackageAbstractDMLFactory object.
   *
   * @throws DMLException DOCUMENT ME!
   */
  protected VpkPackageAbstractDMLFactory(  )
    throws DMLException {
    ;

    DMLTable table = defTable( "VpkPackage", // dmlName
        "blo.VpkPackageDMO", // dmoName
        "VPK_PACKAGE", // tableName
        5, // numColumns
        "VPK_PACKAGE_CODE, VPK_PACKAGE_DESC, VPK_TARPLAN_REF, VPK_CHANGE_TARIFF, VPK_SUSPEND", // columnList
        "VPK_PACKAGE_CODE", //primaryKey
        "" // versionCol     
      , false, // generatedKey
        "VPK_PACKAGE_CODE, VPK_PACKAGE_DESC, VPK_TARPLAN_REF, VPK_CHANGE_TARIFF, VPK_SUSPEND",
        "", "",
        new String[] {
          "VPK_PACKAGE_CODE", "VPK_PACKAGE_DESC", "VPK_TARPLAN_REF",
          "VPK_CHANGE_TARIFF", "VPK_SUSPEND"
        } );

    table.addFilterBy( "equalVpkPackageCode", /* PK attribute */
      "VPK_PACKAGE_CODE = ?" )
         .addFilterBy( "filterByVpkPackageCodeMatch",
      "VPK_PACKAGE_CODE LIKE ?" )
         .addFilterBy( "INVpkPackageCode", "VPK_PACKAGE_CODE IN ( ? )" ) // IN

         .addFilterBy( "NOTINVpkPackageCode", "VPK_PACKAGE_CODE NOT IN ( ? )" ) // NOT IN

         .addFilterBy( "notequalVpkPackageCode", "VPK_PACKAGE_CODE != ?" ) // NOTEQUAL

         .addFilterBy( "nullVpkPackageCode",
      "(VPK_PACKAGE_CODE IS NULL OR LENGTH(VPK_PACKAGE_CODE) IS NULL OR LENGTH(VPK_PACKAGE_CODE) = 0)" ) // IS NULL

         .addFilterBy( "notnullVpkPackageCode", "VPK_PACKAGE_CODE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanVpkPackageCode", "VPK_PACKAGE_CODE < ?" ) // LESS THAN

         .addFilterBy( "greaterthanVpkPackageCode", "VPK_PACKAGE_CODE > ?" ) // GREATER THAN

         .addFilterBy( "filterByVpkPackageCodeMatch",
      "VPK_PACKAGE_CODE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullVpkPackageCode",
      "(VPK_PACKAGE_CODE = ? OR VPK_PACKAGE_CODE IS NULL)" ) // EQUALORNULL
                                                             // TODO : we may need to wrap this with a TRIM() 

         .addOrderBy( "VpkPackageCodeasc", "VPK_PACKAGE_CODE ASC" ) // ORDER ASCENDING

         .addOrderBy( "VpkPackageCodedesc", "VPK_PACKAGE_CODE DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalVpkPackageDesc", "VPK_PACKAGE_DESC = ?" ) // EQUAL

         .addFilterBy( "notequalVpkPackageDesc", "VPK_PACKAGE_DESC != ?" ) // NOTEQUAL

         .addFilterBy( "nullVpkPackageDesc",
      "(VPK_PACKAGE_DESC IS NULL OR LENGTH(VPK_PACKAGE_DESC) IS NULL OR LENGTH(VPK_PACKAGE_DESC) = 0)" ) // IS NULL

         .addFilterBy( "notnullVpkPackageDesc", "VPK_PACKAGE_DESC IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanVpkPackageDesc", "VPK_PACKAGE_DESC < ?" ) // LESS THAN

         .addFilterBy( "greaterthanVpkPackageDesc", "VPK_PACKAGE_DESC > ?" ) // GREATER THAN

         .addFilterBy( "filterByVpkPackageDescMatch",
      "VPK_PACKAGE_DESC LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullVpkPackageDesc",
      "(VPK_PACKAGE_DESC = ? OR VPK_PACKAGE_DESC IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INVpkPackageDesc", "VPK_PACKAGE_DESC IN ( ? )" ) // IN

         .addFilterBy( "NOTINVpkPackageDesc", "VPK_PACKAGE_DESC NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "VpkPackageDescasc", "VPK_PACKAGE_DESC ASC" ) // ORDER ASCENDING

         .addOrderBy( "VpkPackageDescdesc", "VPK_PACKAGE_DESC DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalVpkTarplanRef", "VPK_TARPLAN_REF = ?" ) // EQUAL

         .addFilterBy( "notequalVpkTarplanRef", "VPK_TARPLAN_REF != ?" ) // NOTEQUAL

         .addFilterBy( "nullVpkTarplanRef",
      "(VPK_TARPLAN_REF IS NULL OR LENGTH(VPK_TARPLAN_REF) IS NULL OR LENGTH(VPK_TARPLAN_REF) = 0)" ) // IS NULL

         .addFilterBy( "notnullVpkTarplanRef", "VPK_TARPLAN_REF IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanVpkTarplanRef", "VPK_TARPLAN_REF < ?" ) // LESS THAN

         .addFilterBy( "greaterthanVpkTarplanRef", "VPK_TARPLAN_REF > ?" ) // GREATER THAN

         .addFilterBy( "filterByVpkTarplanRefMatch", "VPK_TARPLAN_REF LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullVpkTarplanRef",
      "(VPK_TARPLAN_REF = ? OR VPK_TARPLAN_REF IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INVpkTarplanRef", "VPK_TARPLAN_REF IN ( ? )" ) // IN

         .addFilterBy( "NOTINVpkTarplanRef", "VPK_TARPLAN_REF NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "VpkTarplanRefasc", "VPK_TARPLAN_REF ASC" ) // ORDER ASCENDING

         .addOrderBy( "VpkTarplanRefdesc", "VPK_TARPLAN_REF DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalVpkChangeTariff", "VPK_CHANGE_TARIFF = ?" ) // EQUAL

         .addFilterBy( "notequalVpkChangeTariff", "VPK_CHANGE_TARIFF != ?" ) // NOTEQUAL

         .addFilterBy( "nullVpkChangeTariff",
      "(VPK_CHANGE_TARIFF IS NULL OR LENGTH(VPK_CHANGE_TARIFF) IS NULL OR LENGTH(VPK_CHANGE_TARIFF) = 0)" ) // IS NULL

         .addFilterBy( "notnullVpkChangeTariff",
      "VPK_CHANGE_TARIFF IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanVpkChangeTariff", "VPK_CHANGE_TARIFF < ?" ) // LESS THAN

         .addFilterBy( "greaterthanVpkChangeTariff", "VPK_CHANGE_TARIFF > ?" ) // GREATER THAN

         .addFilterBy( "filterByVpkChangeTariffMatch",
      "VPK_CHANGE_TARIFF LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullVpkChangeTariff",
      "(VPK_CHANGE_TARIFF = ? OR VPK_CHANGE_TARIFF IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INVpkChangeTariff", "VPK_CHANGE_TARIFF IN ( ? )" ) // IN

         .addFilterBy( "NOTINVpkChangeTariff",
      "VPK_CHANGE_TARIFF NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "VpkChangeTariffasc", "VPK_CHANGE_TARIFF ASC" ) // ORDER ASCENDING

         .addOrderBy( "VpkChangeTariffdesc", "VPK_CHANGE_TARIFF DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalVpkSuspend", "VPK_SUSPEND = ?" ) // EQUAL

         .addFilterBy( "notequalVpkSuspend", "VPK_SUSPEND != ?" ) // NOTEQUAL

         .addFilterBy( "nullVpkSuspend",
      "(VPK_SUSPEND IS NULL OR LENGTH(VPK_SUSPEND) IS NULL OR LENGTH(VPK_SUSPEND) = 0)" ) // IS NULL

         .addFilterBy( "notnullVpkSuspend", "VPK_SUSPEND IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanVpkSuspend", "VPK_SUSPEND < ?" ) // LESS THAN

         .addFilterBy( "greaterthanVpkSuspend", "VPK_SUSPEND > ?" ) // GREATER THAN

         .addFilterBy( "filterByVpkSuspendMatch", "VPK_SUSPEND LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullVpkSuspend",
      "(VPK_SUSPEND = ? OR VPK_SUSPEND IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INVpkSuspend", "VPK_SUSPEND IN ( ? )" ) // IN

         .addFilterBy( "NOTINVpkSuspend", "VPK_SUSPEND NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "VpkSuspendasc", "VPK_SUSPEND ASC" ) // ORDER ASCENDING

         .addOrderBy( "VpkSuspenddesc", "VPK_SUSPEND DESC" ) // ORDER DESCENDING
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
      dml = new VpkPackageDMLFactory(  );
    }

    return dml;
  }
}
