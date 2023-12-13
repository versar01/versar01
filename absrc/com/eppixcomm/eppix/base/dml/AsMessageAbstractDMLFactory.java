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
 * This is the DMLFactory for AsMessage.
 *
 * @version $Revision: 1.1 $
 * @author $Author$
 * @since $jdk$
 */
public class AsMessageAbstractDMLFactory
  extends BaseDMLFactory {
  //~ Static variables/initializers //////////////////////////////////////////

  /** The DMLFactory singleton */
  private static DMLFactory dml = null;

  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new AsMessageAbstractDMLFactory object.
   *
   * @throws DMLException DOCUMENT ME!
   */
  protected AsMessageAbstractDMLFactory(  )
    throws DMLException {
    ;

    DMLTable table = defTable( "AsMessage", // dmlName
        "blo.AsMessageDMO", // dmoName
        "AS_MESSAGE", // tableName
        2, // numColumns
        "MCODE, MMESS", // columnList
        "MCODE", //primaryKey
        "" // versionCol     
      , false, // generatedKey
        "MCODE, MMESS", "", "", new String[] { "MCODE", "MMESS" } );

    table.addFilterBy( "equalMcode", /* PK attribute */
      "MCODE = ?" )
         .addFilterBy( "filterByMcodeMatch", "MCODE LIKE ?" )
         .addFilterBy( "INMcode", "MCODE IN ( ? )" ) // IN

         .addFilterBy( "NOTINMcode", "MCODE NOT IN ( ? )" ) // NOT IN

         .addFilterBy( "notequalMcode", "MCODE != ?" ) // NOTEQUAL

         .addFilterBy( "nullMcode", "MCODE IS NULL" ) // IS NULL

         .addFilterBy( "notnullMcode", "MCODE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanMcode", "MCODE < ?" ) // LESS THAN

         .addFilterBy( "greaterthanMcode", "MCODE > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalMcode", "MCODE <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalMcode", "MCODE >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "filterByMcodeMatch", "MCODE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "betweenMcode", "MCODE BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullMcode", "(MCODE IS NULL OR MCODE = ?)" ) // EQUALORNULL
                                                                            // TODO : we may need to wrap this with a TRIM() 

         .addFilterBy( "lessthanornullMcode", "(MCODE IS NULL OR MCODE < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullMcode",
      "(MCODE IS NULL OR MCODE > ?)" ) // GREATERTHANORNULL

         .addOrderBy( "Mcodeasc", "MCODE ASC" ) // ORDER ASCENDING

         .addOrderBy( "Mcodedesc", "MCODE DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalMmess", "MMESS = ?" ) // EQUAL

         .addFilterBy( "notequalMmess", "MMESS != ?" ) // NOTEQUAL

         .addFilterBy( "nullMmess",
      "(MMESS IS NULL OR LENGTH(MMESS) IS NULL OR LENGTH(MMESS) = 0)" ) // IS NULL

         .addFilterBy( "notnullMmess", "MMESS IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanMmess", "MMESS < ?" ) // LESS THAN

         .addFilterBy( "greaterthanMmess", "MMESS > ?" ) // GREATER THAN

         .addFilterBy( "filterByMmessMatch", "MMESS LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullMmess", "(MMESS = ? OR MMESS IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INMmess", "MMESS IN ( ? )" ) // IN

         .addFilterBy( "NOTINMmess", "MMESS NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "Mmessasc", "MMESS ASC" ) // ORDER ASCENDING

         .addOrderBy( "Mmessdesc", "MMESS DESC" ) // ORDER DESCENDING
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
      dml = new AsMessageDMLFactory(  );
    }

    return dml;
  }
}
