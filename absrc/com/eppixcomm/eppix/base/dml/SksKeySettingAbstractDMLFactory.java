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
 * This is the DMLFactory for SksKeySetting.
 *
 * @version $Revision: 1.1 $
 * @author $Author$
 * @since $jdk$
 */
public class SksKeySettingAbstractDMLFactory
  extends BaseDMLFactory {
  //~ Static variables/initializers //////////////////////////////////////////

  /** The DMLFactory singleton */
  private static DMLFactory dml = null;

  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new SksKeySettingAbstractDMLFactory object.
   *
   * @throws DMLException DOCUMENT ME!
   */
  protected SksKeySettingAbstractDMLFactory(  )
    throws DMLException {
    ;

    DMLTable table = defTable( "SksKeySetting", // dmlName
        "blo.SksKeySettingDMO", // dmoName
        "SKS_KEY_SETTING", // tableName
        4, // numColumns
        "SKS_KEY_CODE, SKS_VALUE, SKS_COMMENT, SKS_TIMESTAMP", // columnList
        "(SKS_KEY_CODE)", //primaryKey
        "" // versionCol     
      , false, // generatedKey
        "SKS_KEY_CODE, SKS_VALUE, SKS_COMMENT, SKS_TIMESTAMP", "", "",
        new String[] {
          "SKS_KEY_CODE", "SKS_VALUE", "SKS_COMMENT", "SKS_TIMESTAMP"
        } );

    table.addFilterBy( "equalSksKeyCode", /* PK attribute */
      "(SKS_KEY_CODE) = ?" )
         .addFilterBy( "filterBySksKeyCodeMatch", "SKS_KEY_CODE LIKE ?" )
         .addFilterBy( "INSksKeyCode", "SKS_KEY_CODE IN ( ? )" ) // IN

         .addFilterBy( "NOTINSksKeyCode", "SKS_KEY_CODE NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "SksKeyCodeasc", "SKS_KEY_CODE ASC" ) // ORDER ASCENDING

         .addOrderBy( "SksKeyCodedesc", "SKS_KEY_CODE DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalSksValue", "(SKS_VALUE) = ?" ) // EQUAL

         .addFilterBy( "notequalSksValue", "(SKS_VALUE) != ?" ) // NOTEQUAL

         .addFilterBy( "nullSksValue",
      "(SKS_VALUE IS NULL OR LENGTH((SKS_VALUE)) = 0)" ) // IS NULL

         .addFilterBy( "notnullSksValue", "SKS_VALUE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterBySksValueMatch", "SKS_VALUE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullSksValue",
      "((SKS_VALUE) = ? OR SKS_VALUE IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INSksValue", "SKS_VALUE IN ( ? )" ) // IN

         .addFilterBy( "NOTINSksValue", "SKS_VALUE NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "SksValueasc", "SKS_VALUE ASC" ) // ORDER ASCENDING

         .addOrderBy( "SksValuedesc", "SKS_VALUE DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalSksComment", "(SKS_COMMENT) = ?" ) // EQUAL

         .addFilterBy( "notequalSksComment", "(SKS_COMMENT) != ?" ) // NOTEQUAL

         .addFilterBy( "nullSksComment",
      "(SKS_COMMENT IS NULL OR LENGTH((SKS_COMMENT)) = 0)" ) // IS NULL

         .addFilterBy( "notnullSksComment", "SKS_COMMENT IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterBySksCommentMatch", "SKS_COMMENT LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullSksComment",
      "((SKS_COMMENT) = ? OR SKS_COMMENT IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INSksComment", "SKS_COMMENT IN ( ? )" ) // IN

         .addFilterBy( "NOTINSksComment", "SKS_COMMENT NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "SksCommentasc", "SKS_COMMENT ASC" ) // ORDER ASCENDING

         .addOrderBy( "SksCommentdesc", "SKS_COMMENT DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalSksTimestamp", "SKS_TIMESTAMP = ?" ) // EQUAL

         .addFilterBy( "notequalSksTimestamp", "SKS_TIMESTAMP != ?" ) // NOTEQUAL

         .addFilterBy( "nullSksTimestamp", "SKS_TIMESTAMP IS NULL" ) // IS NULL

         .addFilterBy( "notnullSksTimestamp", "SKS_TIMESTAMP IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanSksTimestamp", "SKS_TIMESTAMP < ?" ) // LESS THAN

         .addFilterBy( "greaterthanSksTimestamp", "SKS_TIMESTAMP > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalSksTimestamp", "SKS_TIMESTAMP <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalSksTimestamp", "SKS_TIMESTAMP >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "betweenSksTimestamp", "SKS_TIMESTAMP BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullSksTimestamp",
      "(SKS_TIMESTAMP IS NULL OR SKS_TIMESTAMP = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullSksTimestamp",
      "(SKS_TIMESTAMP IS NULL OR SKS_TIMESTAMP < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullSksTimestamp",
      "(SKS_TIMESTAMP IS NULL OR SKS_TIMESTAMP > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INSksTimestamp", "SKS_TIMESTAMP IN ( ? )" ) // IN

         .addFilterBy( "NOTINSksTimestamp", "SKS_TIMESTAMP NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "SksTimestampasc", "SKS_TIMESTAMP ASC" ) // ORDER ASCENDING

         .addOrderBy( "SksTimestampdesc", "SKS_TIMESTAMP DESC" ) // ORDER DESCENDING
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
      dml = new SksKeySettingAbstractDMLFactory(  );
    }

    return dml;
  }
}
