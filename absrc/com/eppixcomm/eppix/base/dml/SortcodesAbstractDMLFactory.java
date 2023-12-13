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
 * This is the DMLFactory for Sortcodes.
 *
 * @version $Revision: 1.1 $
 * @author $Author$
 * @since $jdk$
 */
public class SortcodesAbstractDMLFactory
  extends BaseDMLFactory {
  //~ Static variables/initializers //////////////////////////////////////////

  /** The DMLFactory singleton */
  private static DMLFactory dml = null;

  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new SortcodesAbstractDMLFactory object.
   *
   * @throws DMLException DOCUMENT ME!
   */
  protected SortcodesAbstractDMLFactory(  )
    throws DMLException {
    ;

    DMLTable table = defTable( "Sortcodes", // dmlName
        "blo.SortcodesDMO", // dmoName
        "SORTCODES", // tableName
        4, // numColumns
        "SORTCODE, BANK_NAME, TOWN, POSTCODE", // columnList
        "(SORTCODE)", //primaryKey
        "" // versionCol     
      , false, // generatedKey
        "SORTCODE, BANK_NAME, TOWN, POSTCODE", "", "",
        new String[] { "SORTCODE", "BANK_NAME", "TOWN", "POSTCODE" } );

    table.addFilterBy( "equalSortcode", /* PK attribute */
      "(SORTCODE) = ?" )
         .addFilterBy( "filterBySortcodeMatch", "SORTCODE LIKE ?" )
         .addFilterBy( "INSortcode", "(SORTCODE) IN ( ? )" ) // IN

         .addFilterBy( "NOTINSortcode", "(SORTCODE) NOT IN ( ? )" ) // NOT IN

         .addFilterBy( "notequalSortcode", "(SORTCODE) != ?" ) // NOTEQUAL

         .addFilterBy( "nullSortcode",
      "(SORTCODE IS NULL OR LENGTH((SORTCODE)) IS NULL OR LENGTH((SORTCODE)) = 0)" ) // IS NULL

         .addFilterBy( "notnullSortcode", "SORTCODE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterBySortcodeMatch", "SORTCODE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullSortcode",
      "((SORTCODE) = ? OR SORTCODE IS NULL)" ) // EQUALORNULL
                                                   // TODO : we may need to wrap this with a TRIM() 

         .addOrderBy( "Sortcodeasc", "SORTCODE ASC" ) // ORDER ASCENDING

         .addOrderBy( "Sortcodedesc", "SORTCODE DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalBankName", "(BANK_NAME) = ?" ) // EQUAL

         .addFilterBy( "notequalBankName", "(BANK_NAME) != ?" ) // NOTEQUAL

         .addFilterBy( "nullBankName",
      "(BANK_NAME IS NULL OR LENGTH((BANK_NAME)) IS NULL OR LENGTH((BANK_NAME)) = 0)" ) // IS NULL

         .addFilterBy( "notnullBankName", "BANK_NAME IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByBankNameMatch", "BANK_NAME LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullBankName",
      "((BANK_NAME) = ? OR BANK_NAME IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INBankName", "(BANK_NAME) IN ( ? )" ) // IN

         .addFilterBy( "NOTINBankName", "(BANK_NAME) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "BankNameasc", "BANK_NAME ASC" ) // ORDER ASCENDING

         .addOrderBy( "BankNamedesc", "BANK_NAME DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalTown", "(TOWN) = ?" ) // EQUAL

         .addFilterBy( "notequalTown", "(TOWN) != ?" ) // NOTEQUAL

         .addFilterBy( "nullTown",
      "(TOWN IS NULL OR LENGTH((TOWN)) IS NULL OR LENGTH((TOWN)) = 0)" ) // IS NULL

         .addFilterBy( "notnullTown", "TOWN IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByTownMatch", "TOWN LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullTown", "((TOWN) = ? OR TOWN IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INTown", "(TOWN) IN ( ? )" ) // IN

         .addFilterBy( "NOTINTown", "(TOWN) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "Townasc", "TOWN ASC" ) // ORDER ASCENDING

         .addOrderBy( "Towndesc", "TOWN DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalPostcode", "(POSTCODE) = ?" ) // EQUAL

         .addFilterBy( "notequalPostcode", "(POSTCODE) != ?" ) // NOTEQUAL

         .addFilterBy( "nullPostcode",
      "(POSTCODE IS NULL OR LENGTH((POSTCODE)) IS NULL OR LENGTH((POSTCODE)) = 0)" ) // IS NULL

         .addFilterBy( "notnullPostcode", "POSTCODE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByPostcodeMatch", "POSTCODE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullPostcode",
      "((POSTCODE) = ? OR POSTCODE IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INPostcode", "(POSTCODE) IN ( ? )" ) // IN

         .addFilterBy( "NOTINPostcode", "(POSTCODE) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "Postcodeasc", "POSTCODE ASC" ) // ORDER ASCENDING

         .addOrderBy( "Postcodedesc", "POSTCODE DESC" ) // ORDER DESCENDING
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
      dml = new SortcodesDMLFactory(  );
    }

    return dml;
  }
}
