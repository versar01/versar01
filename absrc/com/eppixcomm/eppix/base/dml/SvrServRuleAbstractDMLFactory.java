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
 * This is the DMLFactory for SvrServRule.
 *
 * @version $Revision: 1.1 $
 * @author $Author$
 * @since $jdk$
 */
public class SvrServRuleAbstractDMLFactory
  extends BaseDMLFactory {
  //~ Static variables/initializers //////////////////////////////////////////

  /** The DMLFactory singleton */
  private static DMLFactory dml = null;

  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new SvrServRuleAbstractDMLFactory object.
   *
   * @throws DMLException DOCUMENT ME!
   */
  protected SvrServRuleAbstractDMLFactory(  )
    throws DMLException {
    ;

    DMLTable table = defTable( "SvrServRule", // dmlName
        "blo.SvrServRuleDMO", // dmoName
        "SVR_SERV_RULE", // tableName
        4, // numColumns
        "SVR_PRIMARY_SERV, SVR_SERV_TYPE, SVR_TARGET_SERV, SVR_SERV_HIERARCHY", // columnList
        "SVR_PRIMARY_SERV" + ", SVR_SERV_TYPE" + ", SVR_TARGET_SERV", //primaryKey
        "" // versionCol     
      , false, // generatedKey
        "SVR_PRIMARY_SERV, SVR_SERV_TYPE, SVR_TARGET_SERV, SVR_SERV_HIERARCHY",
        "", "",
        new String[] {
          "SVR_PRIMARY_SERV", "SVR_SERV_TYPE", "SVR_TARGET_SERV",
          "SVR_SERV_HIERARCHY"
        } );

    table.addFilterBy( "equalSvrPrimaryServ", /* PK attribute */
      "SVR_PRIMARY_SERV = ?" )
         .addFilterBy( "filterBySvrPrimaryServMatch",
      "SVR_PRIMARY_SERV LIKE ?" )
         .addFilterBy( "INSvrPrimaryServ", "SVR_PRIMARY_SERV IN ( ? )" ) // IN

         .addFilterBy( "NOTINSvrPrimaryServ", "SVR_PRIMARY_SERV NOT IN ( ? )" ) // NOT IN

         .addFilterBy( "notequalSvrPrimaryServ", "SVR_PRIMARY_SERV != ?" ) // NOTEQUAL

         .addFilterBy( "nullSvrPrimaryServ",
      "(SVR_PRIMARY_SERV IS NULL OR LENGTH(SVR_PRIMARY_SERV) IS NULL OR LENGTH(SVR_PRIMARY_SERV) = 0)" ) // IS NULL

         .addFilterBy( "notnullSvrPrimaryServ", "SVR_PRIMARY_SERV IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanSvrPrimaryServ", "SVR_PRIMARY_SERV < ?" ) // LESS THAN

         .addFilterBy( "greaterthanSvrPrimaryServ", "SVR_PRIMARY_SERV > ?" ) // GREATER THAN

         .addFilterBy( "filterBySvrPrimaryServMatch",
      "SVR_PRIMARY_SERV LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullSvrPrimaryServ",
      "(SVR_PRIMARY_SERV = ? OR SVR_PRIMARY_SERV IS NULL)" ) // EQUALORNULL
                                                             // TODO : we may need to wrap this with a TRIM() 

         .addOrderBy( "SvrPrimaryServasc", "SVR_PRIMARY_SERV ASC" ) // ORDER ASCENDING

         .addOrderBy( "SvrPrimaryServdesc", "SVR_PRIMARY_SERV DESC" ) // ORDER DESCENDING

         .addFilterBy( "equalSvrServType", /* PK attribute */
      "SVR_SERV_TYPE = ?" )
         .addFilterBy( "filterBySvrServTypeMatch", "SVR_SERV_TYPE LIKE ?" )
         .addFilterBy( "INSvrServType", "SVR_SERV_TYPE IN ( ? )" ) // IN

         .addFilterBy( "NOTINSvrServType", "SVR_SERV_TYPE NOT IN ( ? )" ) // NOT IN

         .addFilterBy( "notequalSvrServType", "SVR_SERV_TYPE != ?" ) // NOTEQUAL

         .addFilterBy( "nullSvrServType",
      "(SVR_SERV_TYPE IS NULL OR LENGTH(SVR_SERV_TYPE) IS NULL OR LENGTH(SVR_SERV_TYPE) = 0)" ) // IS NULL

         .addFilterBy( "notnullSvrServType", "SVR_SERV_TYPE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanSvrServType", "SVR_SERV_TYPE < ?" ) // LESS THAN

         .addFilterBy( "greaterthanSvrServType", "SVR_SERV_TYPE > ?" ) // GREATER THAN

         .addFilterBy( "filterBySvrServTypeMatch", "SVR_SERV_TYPE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullSvrServType",
      "(SVR_SERV_TYPE = ? OR SVR_SERV_TYPE IS NULL)" ) // EQUALORNULL
                                                       // TODO : we may need to wrap this with a TRIM() 

         .addOrderBy( "SvrServTypeasc", "SVR_SERV_TYPE ASC" ) // ORDER ASCENDING

         .addOrderBy( "SvrServTypedesc", "SVR_SERV_TYPE DESC" ) // ORDER DESCENDING

         .addFilterBy( "equalSvrTargetServ", /* PK attribute */
      "SVR_TARGET_SERV = ?" )
         .addFilterBy( "filterBySvrTargetServMatch", "SVR_TARGET_SERV LIKE ?" )
         .addFilterBy( "INSvrTargetServ", "SVR_TARGET_SERV IN ( ? )" ) // IN

         .addFilterBy( "NOTINSvrTargetServ", "SVR_TARGET_SERV NOT IN ( ? )" ) // NOT IN

         .addFilterBy( "notequalSvrTargetServ", "SVR_TARGET_SERV != ?" ) // NOTEQUAL

         .addFilterBy( "nullSvrTargetServ",
      "(SVR_TARGET_SERV IS NULL OR LENGTH(SVR_TARGET_SERV) IS NULL OR LENGTH(SVR_TARGET_SERV) = 0)" ) // IS NULL

         .addFilterBy( "notnullSvrTargetServ", "SVR_TARGET_SERV IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanSvrTargetServ", "SVR_TARGET_SERV < ?" ) // LESS THAN

         .addFilterBy( "greaterthanSvrTargetServ", "SVR_TARGET_SERV > ?" ) // GREATER THAN

         .addFilterBy( "filterBySvrTargetServMatch", "SVR_TARGET_SERV LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullSvrTargetServ",
      "(SVR_TARGET_SERV = ? OR SVR_TARGET_SERV IS NULL)" ) // EQUALORNULL
                                                           // TODO : we may need to wrap this with a TRIM() 

         .addOrderBy( "SvrTargetServasc", "SVR_TARGET_SERV ASC" ) // ORDER ASCENDING

         .addOrderBy( "SvrTargetServdesc", "SVR_TARGET_SERV DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalSvrServHierarchy", "SVR_SERV_HIERARCHY = ?" ) // EQUAL

         .addFilterBy( "notequalSvrServHierarchy", "SVR_SERV_HIERARCHY != ?" ) // NOTEQUAL

         .addFilterBy( "nullSvrServHierarchy",
      "(SVR_SERV_HIERARCHY IS NULL OR LENGTH(SVR_SERV_HIERARCHY) IS NULL OR LENGTH(SVR_SERV_HIERARCHY) = 0)" ) // IS NULL

         .addFilterBy( "notnullSvrServHierarchy",
      "SVR_SERV_HIERARCHY IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanSvrServHierarchy", "SVR_SERV_HIERARCHY < ?" ) // LESS THAN

         .addFilterBy( "greaterthanSvrServHierarchy", "SVR_SERV_HIERARCHY > ?" ) // GREATER THAN

         .addFilterBy( "filterBySvrServHierarchyMatch",
      "SVR_SERV_HIERARCHY LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullSvrServHierarchy",
      "(SVR_SERV_HIERARCHY = ? OR SVR_SERV_HIERARCHY IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INSvrServHierarchy", "SVR_SERV_HIERARCHY IN ( ? )" ) // IN

         .addFilterBy( "NOTINSvrServHierarchy",
      "SVR_SERV_HIERARCHY NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "SvrServHierarchyasc", "SVR_SERV_HIERARCHY ASC" ) // ORDER ASCENDING

         .addOrderBy( "SvrServHierarchydesc", "SVR_SERV_HIERARCHY DESC" ) // ORDER DESCENDING
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
      dml = new SvrServRuleDMLFactory(  );
    }

    return dml;
  }
}
