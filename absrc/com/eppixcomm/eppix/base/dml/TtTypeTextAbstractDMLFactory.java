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
 * This is the DMLFactory for TtTypeText.
 *
 * @version $Revision: 1.1 $
 * @author $Author$
 * @since $jdk$
 */
public class TtTypeTextAbstractDMLFactory
  extends BaseDMLFactory {
  //~ Static variables/initializers //////////////////////////////////////////

  /** The DMLFactory singleton */
  private static DMLFactory dml = null;

  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new TtTypeTextAbstractDMLFactory object.
   *
   * @throws DMLException DOCUMENT ME!
   */
  protected TtTypeTextAbstractDMLFactory(  )
    throws DMLException {
    ;

    DMLTable table = defTable( "TtTypeText", // dmlName
        "blo.TtTypeTextDMO", // dmoName
        "TT_TYPE_TEXT", // tableName
        5, // numColumns
        "TT_GROUP, TT_LANG, TT_TYPE, TT_TEXT, TT_CONFIG", // columnList
        "(TT_GROUP)" + ", (TT_LANG)" + ", (TT_TYPE)", //primaryKey
        "" // versionCol     
      , false, // generatedKey
        "TT_GROUP, TT_LANG, TT_TYPE, TT_TEXT, TT_CONFIG", "", "",
        new String[] { "TT_GROUP", "TT_LANG", "TT_TYPE", "TT_TEXT", "TT_CONFIG" } );

    table.addFilterBy( "equalTtGroup", /* PK attribute */
      "(TT_GROUP) = ?" )
         .addFilterBy( "filterByTtGroupMatch", "TT_GROUP LIKE ?" )
         .addFilterBy( "INTtGroup", "TT_GROUP IN ( ? )" ) // IN

         .addFilterBy( "NOTINTtGroup", "TT_GROUP NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "TtGroupasc", "TT_GROUP ASC" ) // ORDER ASCENDING

         .addOrderBy( "TtGroupdesc", "TT_GROUP DESC" ) // ORDER DESCENDING

         .addFilterBy( "equalTtLang", /* PK attribute */
      "(TT_LANG) = ?" )
         .addFilterBy( "filterByTtLangMatch", "TT_LANG LIKE ?" )
         .addFilterBy( "INTtLang", "TT_LANG IN ( ? )" ) // IN

         .addFilterBy( "NOTINTtLang", "TT_LANG NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "TtLangasc", "TT_LANG ASC" ) // ORDER ASCENDING

         .addOrderBy( "TtLangdesc", "TT_LANG DESC" ) // ORDER DESCENDING

         .addFilterBy( "equalTtType", /* PK attribute */
      "(TT_TYPE) = ?" )
         .addFilterBy( "filterByTtTypeMatch", "TT_TYPE LIKE ?" )
         .addFilterBy( "INTtType", "TT_TYPE IN ( ? )" ) // IN

         .addFilterBy( "NOTINTtType", "TT_TYPE NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "TtTypeasc", "TT_TYPE ASC" ) // ORDER ASCENDING

         .addOrderBy( "TtTypedesc", "TT_TYPE DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalTtText", "(TT_TEXT) = ?" ) // EQUAL

         .addFilterBy( "notequalTtText", "(TT_TEXT) != ?" ) // NOTEQUAL

         .addFilterBy( "nullTtText",
      "(TT_TEXT IS NULL OR LENGTH((TT_TEXT)) = 0)" ) // IS NULL

         .addFilterBy( "notnullTtText", "TT_TEXT IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByTtTextMatch", "TT_TEXT LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullTtText",
      "((TT_TEXT) = ? OR TT_TEXT IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INTtText", "TT_TEXT IN ( ? )" ) // IN

         .addFilterBy( "NOTINTtText", "TT_TEXT NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "TtTextasc", "TT_TEXT ASC" ) // ORDER ASCENDING

         .addOrderBy( "TtTextdesc", "TT_TEXT DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalTtConfig", "(TT_CONFIG) = ?" ) // EQUAL

         .addFilterBy( "notequalTtConfig", "(TT_CONFIG) != ?" ) // NOTEQUAL

         .addFilterBy( "nullTtConfig",
      "(TT_CONFIG IS NULL OR LENGTH((TT_CONFIG)) = 0)" ) // IS NULL

         .addFilterBy( "notnullTtConfig", "TT_CONFIG IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByTtConfigMatch", "TT_CONFIG LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullTtConfig",
      "((TT_CONFIG) = ? OR TT_CONFIG IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INTtConfig", "TT_CONFIG IN ( ? )" ) // IN

         .addFilterBy( "NOTINTtConfig", "TT_CONFIG NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "TtConfigasc", "TT_CONFIG ASC" ) // ORDER ASCENDING

         .addOrderBy( "TtConfigdesc", "TT_CONFIG DESC" ) // ORDER DESCENDING
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
      dml = new TtTypeTextAbstractDMLFactory(  );
    }

    return dml;
  }
}
