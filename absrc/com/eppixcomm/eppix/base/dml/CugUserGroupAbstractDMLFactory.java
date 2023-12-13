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
 * This is the DMLFactory for CugUserGroup.
 *
 * @version $Revision: 1.1 $
 * @author $Author$
 * @since $jdk$
 */
public class CugUserGroupAbstractDMLFactory
  extends BaseDMLFactory {
  //~ Static variables/initializers //////////////////////////////////////////

  /** The DMLFactory singleton */
  private static DMLFactory dml = null;

  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new CugUserGroupAbstractDMLFactory object.
   *
   * @throws DMLException DOCUMENT ME!
   */
  protected CugUserGroupAbstractDMLFactory(  )
    throws DMLException {
    ;

    DMLTable table = defTable( "CugUserGroup", // dmlName
        "blo.CugUserGroupDMO", // dmoName
        "CUG_USER_GROUP", // tableName
        3, // numColumns
        "CUG_ID, CUG_NAME, CUG_INTERN_TARIFF", // columnList
        "CUG_ID", //primaryKey
        "" // versionCol     
      , false, // generatedKey
        "CUG_ID, CUG_NAME, CUG_INTERN_TARIFF", "", "",
        new String[] { "CUG_ID", "CUG_NAME", "CUG_INTERN_TARIFF" } );

    table.addFilterBy( "equalCugId", /* PK attribute */
      "CUG_ID = ?" )
         .addFilterBy( "filterByCugIdMatch", "CUG_ID LIKE ?" )
         .addFilterBy( "INCugId", "CUG_ID IN ( ? )" ) // IN

         .addFilterBy( "NOTINCugId", "CUG_ID NOT IN ( ? )" ) // NOT IN

         .addFilterBy( "notequalCugId", "CUG_ID != ?" ) // NOTEQUAL

         .addFilterBy( "nullCugId",
      "(CUG_ID IS NULL OR LENGTH(CUG_ID) IS NULL OR LENGTH(CUG_ID) = 0)" ) // IS NULL

         .addFilterBy( "notnullCugId", "CUG_ID IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanCugId", "CUG_ID < ?" ) // LESS THAN

         .addFilterBy( "greaterthanCugId", "CUG_ID > ?" ) // GREATER THAN

         .addFilterBy( "filterByCugIdMatch", "CUG_ID LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullCugId", "(CUG_ID = ? OR CUG_ID IS NULL)" ) // EQUALORNULL
                                                                              // TODO : we may need to wrap this with a TRIM() 

         .addOrderBy( "CugIdasc", "CUG_ID ASC" ) // ORDER ASCENDING

         .addOrderBy( "CugIddesc", "CUG_ID DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalCugName", "CUG_NAME = ?" ) // EQUAL

         .addFilterBy( "notequalCugName", "CUG_NAME != ?" ) // NOTEQUAL

         .addFilterBy( "nullCugName",
      "(CUG_NAME IS NULL OR LENGTH(CUG_NAME) IS NULL OR LENGTH(CUG_NAME) = 0)" ) // IS NULL

         .addFilterBy( "notnullCugName", "CUG_NAME IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanCugName", "CUG_NAME < ?" ) // LESS THAN

         .addFilterBy( "greaterthanCugName", "CUG_NAME > ?" ) // GREATER THAN

         .addFilterBy( "filterByCugNameMatch", "CUG_NAME LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullCugName",
      "(CUG_NAME = ? OR CUG_NAME IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INCugName", "CUG_NAME IN ( ? )" ) // IN

         .addFilterBy( "NOTINCugName", "CUG_NAME NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "CugNameasc", "CUG_NAME ASC" ) // ORDER ASCENDING

         .addOrderBy( "CugNamedesc", "CUG_NAME DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalCugInternTariff", "CUG_INTERN_TARIFF = ?" ) // EQUAL

         .addFilterBy( "notequalCugInternTariff", "CUG_INTERN_TARIFF != ?" ) // NOTEQUAL

         .addFilterBy( "nullCugInternTariff",
      "(CUG_INTERN_TARIFF IS NULL OR LENGTH(CUG_INTERN_TARIFF) IS NULL OR LENGTH(CUG_INTERN_TARIFF) = 0)" ) // IS NULL

         .addFilterBy( "notnullCugInternTariff",
      "CUG_INTERN_TARIFF IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanCugInternTariff", "CUG_INTERN_TARIFF < ?" ) // LESS THAN

         .addFilterBy( "greaterthanCugInternTariff", "CUG_INTERN_TARIFF > ?" ) // GREATER THAN

         .addFilterBy( "filterByCugInternTariffMatch",
      "CUG_INTERN_TARIFF LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullCugInternTariff",
      "(CUG_INTERN_TARIFF = ? OR CUG_INTERN_TARIFF IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INCugInternTariff", "CUG_INTERN_TARIFF IN ( ? )" ) // IN

         .addFilterBy( "NOTINCugInternTariff",
      "CUG_INTERN_TARIFF NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "CugInternTariffasc", "CUG_INTERN_TARIFF ASC" ) // ORDER ASCENDING

         .addOrderBy( "CugInternTariffdesc", "CUG_INTERN_TARIFF DESC" ) // ORDER DESCENDING
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
      dml = new CugUserGroupDMLFactory(  );
    }

    return dml;
  }
}
