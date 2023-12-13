package com.eppixcomm.eppix.base.dml;



public class UrsUrlSettingAbstractDMLFactory

  extends BaseDMLFactory {

  //~ Static variables/initializers //////////////////////////////////////////


  /** The DMLFactory singleton */

  private static DMLFactory dml = null;


  //~ Constructors ///////////////////////////////////////////////////////////


  /**

   * Creates a new UrsUrlSettingAbstractDMLFactory object.

   *

   * @throws DMLException DOCUMENT ME!

   */

  protected UrsUrlSettingAbstractDMLFactory(  )

    throws DMLException {

    ;


    DMLTable table = defTable( "UrsUrlSetting", // dmlName

        "blo.UrsUrlSettingDMO", // dmoName

        "URS_URL_SETTING", // tableName

        4, // numColumns

        "URS_URL_CODE, URS_VALUE, URS_COMMENT, URS_TIMESTAMP", // columnList

        "(URS_URL_CODE)", //primaryKey

        "" // versionCol

      , false, // generatedKey

        "URS_URL_CODE, URS_VALUE, URS_COMMENT, URS_TIMESTAMP", "", "",

        new String[] {

          "URS_URL_CODE", "URS_VALUE", "URS_COMMENT", "URS_TIMESTAMP"

        } );


    table.addFilterBy( "equalUrsUrlCode", /* PK attribute */

      "(URS_URL_CODE) = ?" )

         .addFilterBy( "filterByUrsUrlCodeMatch", "URS_URL_CODE LIKE ?" )

         .addFilterBy( "INUrsUrlCode", "URS_URL_CODE IN ( ? )" ) // IN


         .addFilterBy( "NOTINUrsUrlCode", "URS_URL_CODE NOT IN ( ? )" ) // NOT IN


         .addOrderBy( "UrsUrlCodeasc", "URS_URL_CODE ASC" ) // ORDER ASCENDING


         .addOrderBy( "UrsUrlCodedesc", "URS_URL_CODE DESC" ) // ORDER DESCENDING

    ;


    table.addFilterBy( "equalUrsValue", "(URS_VALUE) = ?" ) // EQUAL


         .addFilterBy( "notequalUrsValue", "(URS_VALUE) != ?" ) // NOTEQUAL


         .addFilterBy( "nullUrsValue",

      "(URS_VALUE IS NULL OR LENGTH((URS_VALUE)) = 0)" ) // IS NULL


         .addFilterBy( "notnullUrsValue", "URS_VALUE IS NOT NULL" ) // IS NOT NULL


         .addFilterBy( "filterByUrsValueMatch", "URS_VALUE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY


         .addFilterBy( "equalornullUrsValue",

      "((URS_VALUE) = ? OR URS_VALUE IS NULL)" ) // EQUALORNULL


         .addFilterBy( "INUrsValue", "URS_VALUE IN ( ? )" ) // IN


         .addFilterBy( "NOTINUrsValue", "URS_VALUE NOT IN ( ? )" ) // NOT IN


         .addOrderBy( "UrsValueasc", "URS_VALUE ASC" ) // ORDER ASCENDING


         .addOrderBy( "UrsValuedesc", "URS_VALUE DESC" ) // ORDER DESCENDING

    ;


    table.addFilterBy( "equalUrsComment", "(URS_COMMENT) = ?" ) // EQUAL


         .addFilterBy( "notequalUrsComment", "(URS_COMMENT) != ?" ) // NOTEQUAL


         .addFilterBy( "nullUrsComment",

      "(URS_COMMENT IS NULL OR LENGTH((URS_COMMENT)) = 0)" ) // IS NULL


         .addFilterBy( "notnullUrsComment", "URS_COMMENT IS NOT NULL" ) // IS NOT NULL


         .addFilterBy( "filterByUrsCommentMatch", "URS_COMMENT LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY


         .addFilterBy( "equalornullUrsComment",

      "((URS_COMMENT) = ? OR URS_COMMENT IS NULL)" ) // EQUALORNULL


         .addFilterBy( "INUrsComment", "URS_COMMENT IN ( ? )" ) // IN


         .addFilterBy( "NOTINUrsComment", "URS_COMMENT NOT IN ( ? )" ) // NOT IN


         .addOrderBy( "UrsCommentasc", "URS_COMMENT ASC" ) // ORDER ASCENDING


         .addOrderBy( "UrsCommentdesc", "URS_COMMENT DESC" ) // ORDER DESCENDING

    ;


    table.addFilterBy( "equalUrsTimestamp", "URS_TIMESTAMP = ?" ) // EQUAL


         .addFilterBy( "notequalUrsTimestamp", "URS_TIMESTAMP != ?" ) // NOTEQUAL


         .addFilterBy( "nullUrsTimestamp", "URS_TIMESTAMP IS NULL" ) // IS NULL


         .addFilterBy( "notnullUrsTimestamp", "URS_TIMESTAMP IS NOT NULL" ) // IS NOT NULL


         .addFilterBy( "lessthanUrsTimestamp", "URS_TIMESTAMP < ?" ) // LESS THAN


         .addFilterBy( "greaterthanUrsTimestamp", "URS_TIMESTAMP > ?" ) // GREATER THAN


         .addFilterBy( "lessthanorequalUrsTimestamp", "URS_TIMESTAMP <= ?" ) // LESS THAN OR EQUAL


         .addFilterBy( "greaterthanorequalUrsTimestamp", "URS_TIMESTAMP >= ?" ) // GREATER THAN OR EQUAL


         .addFilterBy( "betweenUrsTimestamp", "URS_TIMESTAMP BETWEEN ? AND ?" ) // BETWEEN


         .addFilterBy( "equalornullUrsTimestamp",

      "(URS_TIMESTAMP IS NULL OR URS_TIMESTAMP = ?)" ) // EQUALORNULL


         .addFilterBy( "lessthanornullUrsTimestamp",

      "(URS_TIMESTAMP IS NULL OR URS_TIMESTAMP < ?)" ) // LESSTHANORNULL


         .addFilterBy( "greaterthanornullUrsTimestamp",

      "(URS_TIMESTAMP IS NULL OR URS_TIMESTAMP > ?)" ) // GREATERTHANORNULL


         .addFilterBy( "INUrsTimestamp", "URS_TIMESTAMP IN ( ? )" ) // IN


         .addFilterBy( "NOTINUrsTimestamp", "URS_TIMESTAMP NOT IN ( ? )" ) // NOT IN


         .addOrderBy( "UrsTimestampasc", "URS_TIMESTAMP ASC" ) // ORDER ASCENDING


         .addOrderBy( "UrsTimestampdesc", "URS_TIMESTAMP DESC" ) // ORDER DESCENDING

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

      dml = new UrsUrlSettingAbstractDMLFactory(  );

    }


    return dml;

  }

}
