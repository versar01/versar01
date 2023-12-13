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
 * This is the DMLFactory for DgdDiscGrpDet.
 *
 * @version $Revision: 1.1 $
 * @author $Author$
 * @since $jdk$
 */
public class DgdDiscGrpDetAbstractDMLFactory
  extends BaseDMLFactory {
  //~ Static variables/initializers //////////////////////////////////////////

  /** The DMLFactory singleton */
  private static DMLFactory dml = null;

  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new DgdDiscGrpDetAbstractDMLFactory object.
   *
   * @throws DMLException DOCUMENT ME!
   */
  protected DgdDiscGrpDetAbstractDMLFactory(  )
    throws DMLException {
    ;

    DMLTable table = defTable( "DgdDiscGrpDet", // dmlName
        "blo.DgdDiscGrpDetDMO", // dmoName
        "DGD_DISC_GRP_DET", // tableName
        2, // numColumns
        "DGD_GROUP_ID, DGD_CLASS_ID", // columnList
        null, //primaryKey
        "" // versionCol     
      , false, // generatedKey
        "DGD_GROUP_ID, DGD_CLASS_ID", "", "",
        new String[] { "DGD_GROUP_ID", "DGD_CLASS_ID" }, false );

    ;

    table.addFilterBy( "equalDgdGroupId", "DGD_GROUP_ID = ?" ) // EQUAL

         .addFilterBy( "notequalDgdGroupId", "DGD_GROUP_ID != ?" ) // NOTEQUAL

         .addFilterBy( "nullDgdGroupId", "DGD_GROUP_ID IS NULL" ) // IS NULL

         .addFilterBy( "notnullDgdGroupId", "DGD_GROUP_ID IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanDgdGroupId", "DGD_GROUP_ID < ?" ) // LESS THAN

         .addFilterBy( "greaterthanDgdGroupId", "DGD_GROUP_ID > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalDgdGroupId", "DGD_GROUP_ID <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalDgdGroupId", "DGD_GROUP_ID >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "filterByDgdGroupIdMatch", "DGD_GROUP_ID LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "betweenDgdGroupId", "DGD_GROUP_ID BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullDgdGroupId",
      "(DGD_GROUP_ID IS NULL OR DGD_GROUP_ID = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullDgdGroupId",
      "(DGD_GROUP_ID IS NULL OR DGD_GROUP_ID < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullDgdGroupId",
      "(DGD_GROUP_ID IS NULL OR DGD_GROUP_ID > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INDgdGroupId", "DGD_GROUP_ID IN ( ? )" ) // IN

         .addFilterBy( "NOTINDgdGroupId", "DGD_GROUP_ID NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "DgdGroupIdasc", "DGD_GROUP_ID ASC" ) // ORDER ASCENDING

         .addOrderBy( "DgdGroupIddesc", "DGD_GROUP_ID DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalDgdClassId", "DGD_CLASS_ID = ?" ) // EQUAL

         .addFilterBy( "notequalDgdClassId", "DGD_CLASS_ID != ?" ) // NOTEQUAL

         .addFilterBy( "nullDgdClassId", "DGD_CLASS_ID IS NULL" ) // IS NULL

         .addFilterBy( "notnullDgdClassId", "DGD_CLASS_ID IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanDgdClassId", "DGD_CLASS_ID < ?" ) // LESS THAN

         .addFilterBy( "greaterthanDgdClassId", "DGD_CLASS_ID > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalDgdClassId", "DGD_CLASS_ID <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalDgdClassId", "DGD_CLASS_ID >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "filterByDgdClassIdMatch", "DGD_CLASS_ID LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "betweenDgdClassId", "DGD_CLASS_ID BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullDgdClassId",
      "(DGD_CLASS_ID IS NULL OR DGD_CLASS_ID = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullDgdClassId",
      "(DGD_CLASS_ID IS NULL OR DGD_CLASS_ID < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullDgdClassId",
      "(DGD_CLASS_ID IS NULL OR DGD_CLASS_ID > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INDgdClassId", "DGD_CLASS_ID IN ( ? )" ) // IN

         .addFilterBy( "NOTINDgdClassId", "DGD_CLASS_ID NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "DgdClassIdasc", "DGD_CLASS_ID ASC" ) // ORDER ASCENDING

         .addOrderBy( "DgdClassIddesc", "DGD_CLASS_ID DESC" ) // ORDER DESCENDING
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
      dml = new DgdDiscGrpDetDMLFactory(  );
    }

    return dml;
  }
}
