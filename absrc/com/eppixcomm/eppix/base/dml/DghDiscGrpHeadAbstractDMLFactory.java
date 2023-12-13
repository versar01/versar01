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
 * This is the DMLFactory for DghDiscGrpHead.
 *
 * @version $Revision: 1.1 $
 * @author $Author$
 * @since $jdk$
 */
public class DghDiscGrpHeadAbstractDMLFactory
  extends BaseDMLFactory {
  //~ Static variables/initializers //////////////////////////////////////////

  /** The DMLFactory singleton */
  private static DMLFactory dml = null;

  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new DghDiscGrpHeadAbstractDMLFactory object.
   *
   * @throws DMLException DOCUMENT ME!
   */
  protected DghDiscGrpHeadAbstractDMLFactory(  )
    throws DMLException {
    ;

    DMLTable table = defTable( "DghDiscGrpHead", // dmlName
        "blo.DghDiscGrpHeadDMO", // dmoName
        "DGH_DISC_GRP_HEAD", // tableName
        5, // numColumns
        "DGH_GROUP_ID, DGH_GROUP_DESC, DGH_GROUP_TYPE, DGH_INCLUSION_FROM, DGH_INCLUSION_TO", // columnList
        "DGH_GROUP_ID", //primaryKey
        "" // versionCol     
      , true, // generatedKey
        "DGH_GROUP_ID, DGH_GROUP_DESC, DGH_GROUP_TYPE, DGH_INCLUSION_FROM, DGH_INCLUSION_TO",
        "", "",
        new String[] {
          "DGH_GROUP_ID", "DGH_GROUP_DESC", "DGH_GROUP_TYPE",
          "DGH_INCLUSION_FROM", "DGH_INCLUSION_TO"
        } );

    table.addFilterBy( "equalDghGroupId", /* PK attribute */
      "DGH_GROUP_ID = ?" )
         .addFilterBy( "filterByDghGroupIdMatch", "DGH_GROUP_ID LIKE ?" )
         .addFilterBy( "INDghGroupId", "DGH_GROUP_ID IN ( ? )" ) // IN

         .addFilterBy( "NOTINDghGroupId", "DGH_GROUP_ID NOT IN ( ? )" ) // NOT IN

         .addFilterBy( "notequalDghGroupId", "DGH_GROUP_ID != ?" ) // NOTEQUAL

         .addFilterBy( "nullDghGroupId", "DGH_GROUP_ID IS NULL" ) // IS NULL

         .addFilterBy( "notnullDghGroupId", "DGH_GROUP_ID IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanDghGroupId", "DGH_GROUP_ID < ?" ) // LESS THAN

         .addFilterBy( "greaterthanDghGroupId", "DGH_GROUP_ID > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalDghGroupId", "DGH_GROUP_ID <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalDghGroupId", "DGH_GROUP_ID >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "filterByDghGroupIdMatch", "DGH_GROUP_ID LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "betweenDghGroupId", "DGH_GROUP_ID BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullDghGroupId",
      "(DGH_GROUP_ID IS NULL OR DGH_GROUP_ID = ?)" ) // EQUALORNULL
                                                     // TODO : we may need to wrap this with a TRIM() 

         .addFilterBy( "lessthanornullDghGroupId",
      "(DGH_GROUP_ID IS NULL OR DGH_GROUP_ID < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullDghGroupId",
      "(DGH_GROUP_ID IS NULL OR DGH_GROUP_ID > ?)" ) // GREATERTHANORNULL

         .addOrderBy( "DghGroupIdasc", "DGH_GROUP_ID ASC" ) // ORDER ASCENDING

         .addOrderBy( "DghGroupIddesc", "DGH_GROUP_ID DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalDghGroupDesc", "DGH_GROUP_DESC = ?" ) // EQUAL

         .addFilterBy( "notequalDghGroupDesc", "DGH_GROUP_DESC != ?" ) // NOTEQUAL

         .addFilterBy( "nullDghGroupDesc",
      "(DGH_GROUP_DESC IS NULL OR LENGTH(DGH_GROUP_DESC) IS NULL OR LENGTH(DGH_GROUP_DESC) = 0)" ) // IS NULL

         .addFilterBy( "notnullDghGroupDesc", "DGH_GROUP_DESC IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanDghGroupDesc", "DGH_GROUP_DESC < ?" ) // LESS THAN

         .addFilterBy( "greaterthanDghGroupDesc", "DGH_GROUP_DESC > ?" ) // GREATER THAN

         .addFilterBy( "filterByDghGroupDescMatch", "DGH_GROUP_DESC LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullDghGroupDesc",
      "(DGH_GROUP_DESC = ? OR DGH_GROUP_DESC IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INDghGroupDesc", "DGH_GROUP_DESC IN ( ? )" ) // IN

         .addFilterBy( "NOTINDghGroupDesc", "DGH_GROUP_DESC NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "DghGroupDescasc", "DGH_GROUP_DESC ASC" ) // ORDER ASCENDING

         .addOrderBy( "DghGroupDescdesc", "DGH_GROUP_DESC DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalDghGroupType", "DGH_GROUP_TYPE = ?" ) // EQUAL

         .addFilterBy( "notequalDghGroupType", "DGH_GROUP_TYPE != ?" ) // NOTEQUAL

         .addFilterBy( "nullDghGroupType", "DGH_GROUP_TYPE IS NULL" ) // IS NULL

         .addFilterBy( "notnullDghGroupType", "DGH_GROUP_TYPE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanDghGroupType", "DGH_GROUP_TYPE < ?" ) // LESS THAN

         .addFilterBy( "greaterthanDghGroupType", "DGH_GROUP_TYPE > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalDghGroupType", "DGH_GROUP_TYPE <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalDghGroupType", "DGH_GROUP_TYPE >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "filterByDghGroupTypeMatch", "DGH_GROUP_TYPE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "betweenDghGroupType", "DGH_GROUP_TYPE BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullDghGroupType",
      "(DGH_GROUP_TYPE IS NULL OR DGH_GROUP_TYPE = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullDghGroupType",
      "(DGH_GROUP_TYPE IS NULL OR DGH_GROUP_TYPE < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullDghGroupType",
      "(DGH_GROUP_TYPE IS NULL OR DGH_GROUP_TYPE > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INDghGroupType", "DGH_GROUP_TYPE IN ( ? )" ) // IN

         .addFilterBy( "NOTINDghGroupType", "DGH_GROUP_TYPE NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "DghGroupTypeasc", "DGH_GROUP_TYPE ASC" ) // ORDER ASCENDING

         .addOrderBy( "DghGroupTypedesc", "DGH_GROUP_TYPE DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalDghInclusionFrom", "DGH_INCLUSION_FROM = ?" ) // EQUAL

         .addFilterBy( "notequalDghInclusionFrom", "DGH_INCLUSION_FROM != ?" ) // NOTEQUAL

         .addFilterBy( "nullDghInclusionFrom", "DGH_INCLUSION_FROM IS NULL" ) // IS NULL

         .addFilterBy( "notnullDghInclusionFrom",
      "DGH_INCLUSION_FROM IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanDghInclusionFrom", "DGH_INCLUSION_FROM < ?" ) // LESS THAN

         .addFilterBy( "greaterthanDghInclusionFrom", "DGH_INCLUSION_FROM > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalDghInclusionFrom",
      "DGH_INCLUSION_FROM <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalDghInclusionFrom",
      "DGH_INCLUSION_FROM >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "filterByDghInclusionFromMatch",
      "DGH_INCLUSION_FROM LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "betweenDghInclusionFrom",
      "DGH_INCLUSION_FROM BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullDghInclusionFrom",
      "(DGH_INCLUSION_FROM IS NULL OR DGH_INCLUSION_FROM = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullDghInclusionFrom",
      "(DGH_INCLUSION_FROM IS NULL OR DGH_INCLUSION_FROM < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullDghInclusionFrom",
      "(DGH_INCLUSION_FROM IS NULL OR DGH_INCLUSION_FROM > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INDghInclusionFrom", "DGH_INCLUSION_FROM IN ( ? )" ) // IN

         .addFilterBy( "NOTINDghInclusionFrom",
      "DGH_INCLUSION_FROM NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "DghInclusionFromasc", "DGH_INCLUSION_FROM ASC" ) // ORDER ASCENDING

         .addOrderBy( "DghInclusionFromdesc", "DGH_INCLUSION_FROM DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalDghInclusionTo", "DGH_INCLUSION_TO = ?" ) // EQUAL

         .addFilterBy( "notequalDghInclusionTo", "DGH_INCLUSION_TO != ?" ) // NOTEQUAL

         .addFilterBy( "nullDghInclusionTo", "DGH_INCLUSION_TO IS NULL" ) // IS NULL

         .addFilterBy( "notnullDghInclusionTo", "DGH_INCLUSION_TO IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanDghInclusionTo", "DGH_INCLUSION_TO < ?" ) // LESS THAN

         .addFilterBy( "greaterthanDghInclusionTo", "DGH_INCLUSION_TO > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalDghInclusionTo",
      "DGH_INCLUSION_TO <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalDghInclusionTo",
      "DGH_INCLUSION_TO >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "filterByDghInclusionToMatch",
      "DGH_INCLUSION_TO LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "betweenDghInclusionTo",
      "DGH_INCLUSION_TO BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullDghInclusionTo",
      "(DGH_INCLUSION_TO IS NULL OR DGH_INCLUSION_TO = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullDghInclusionTo",
      "(DGH_INCLUSION_TO IS NULL OR DGH_INCLUSION_TO < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullDghInclusionTo",
      "(DGH_INCLUSION_TO IS NULL OR DGH_INCLUSION_TO > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INDghInclusionTo", "DGH_INCLUSION_TO IN ( ? )" ) // IN

         .addFilterBy( "NOTINDghInclusionTo", "DGH_INCLUSION_TO NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "DghInclusionToasc", "DGH_INCLUSION_TO ASC" ) // ORDER ASCENDING

         .addOrderBy( "DghInclusionTodesc", "DGH_INCLUSION_TO DESC" ) // ORDER DESCENDING
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
      dml = new DghDiscGrpHeadDMLFactory(  );
    }

    return dml;
  }
}
