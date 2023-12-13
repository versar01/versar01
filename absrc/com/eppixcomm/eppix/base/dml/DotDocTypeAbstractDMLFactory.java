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
 * This is the DMLFactory for DotDocType.
 *
 * @version $Revision: 1.1 $
 * @author $Author$
 * @since $jdk$
 */
public class DotDocTypeAbstractDMLFactory
  extends BaseDMLFactory {
  //~ Static variables/initializers //////////////////////////////////////////

  /** The DMLFactory singleton */
  private static DMLFactory dml = null;

  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new DotDocTypeAbstractDMLFactory object.
   *
   * @throws DMLException DOCUMENT ME!
   */
  protected DotDocTypeAbstractDMLFactory(  )
    throws DMLException {
    ;

    DMLTable table = defTable( "DotDocType", // dmlName
        "blo.DotDocTypeDMO", // dmoName
        "DOT_DOC_TYPE", // tableName
        14, // numColumns
        "DOT_TYPE_CODE, DOT_RELATION, DOT_SUBSYSTEM, DOT_ENGINE, DOT_TYPE_FOLDER, DOT_FILENAME_START, DOT_DEF_DELIVERY, DOT_DEF_FORMAT, DOT_ACC_REQD"
        + ", DOT_SUB_REQD, DOT_INV_REQD, DOT_REASON_TYPE, DOT_REASON_CODE, DOT_MANIPULATE", // columnList
        "DOT_TYPE_CODE", //primaryKey
        "" // versionCol     
      , false, // generatedKey
        "DOT_TYPE_CODE, DOT_RELATION, DOT_SUBSYSTEM, DOT_ENGINE, DOT_TYPE_FOLDER, DOT_FILENAME_START, DOT_DEF_DELIVERY, DOT_DEF_FORMAT, DOT_ACC_REQD"
        + ", DOT_SUB_REQD, DOT_INV_REQD, DOT_REASON_TYPE, DOT_REASON_CODE, DOT_MANIPULATE",
        "", "",
        new String[] {
          "DOT_TYPE_CODE", "DOT_RELATION", "DOT_SUBSYSTEM", "DOT_ENGINE",
          "DOT_TYPE_FOLDER", "DOT_FILENAME_START", "DOT_DEF_DELIVERY",
          "DOT_DEF_FORMAT", "DOT_ACC_REQD", "DOT_SUB_REQD", "DOT_INV_REQD",
          "DOT_REASON_TYPE", "DOT_REASON_CODE", "DOT_MANIPULATE"
        } );

    table.addFilterBy( "equalDotTypeCode", /* PK attribute */
      "DOT_TYPE_CODE = ?" )
         .addFilterBy( "filterByDotTypeCodeMatch", "DOT_TYPE_CODE LIKE ?" )
         .addFilterBy( "INDotTypeCode", "DOT_TYPE_CODE IN ( ? )" ) // IN

         .addFilterBy( "NOTINDotTypeCode", "DOT_TYPE_CODE NOT IN ( ? )" ) // NOT IN

         .addFilterBy( "notequalDotTypeCode", "DOT_TYPE_CODE != ?" ) // NOTEQUAL

         .addFilterBy( "nullDotTypeCode",
      "(DOT_TYPE_CODE IS NULL OR LENGTH(DOT_TYPE_CODE) IS NULL OR LENGTH(DOT_TYPE_CODE) = 0)" ) // IS NULL

         .addFilterBy( "notnullDotTypeCode", "DOT_TYPE_CODE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanDotTypeCode", "DOT_TYPE_CODE < ?" ) // LESS THAN

         .addFilterBy( "greaterthanDotTypeCode", "DOT_TYPE_CODE > ?" ) // GREATER THAN

         .addFilterBy( "filterByDotTypeCodeMatch", "DOT_TYPE_CODE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullDotTypeCode",
      "(DOT_TYPE_CODE = ? OR DOT_TYPE_CODE IS NULL)" ) // EQUALORNULL
                                                       // TODO : we may need to wrap this with a TRIM() 

         .addOrderBy( "DotTypeCodeasc", "DOT_TYPE_CODE ASC" ) // ORDER ASCENDING

         .addOrderBy( "DotTypeCodedesc", "DOT_TYPE_CODE DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalDotRelation", "DOT_RELATION = ?" ) // EQUAL

         .addFilterBy( "notequalDotRelation", "DOT_RELATION != ?" ) // NOTEQUAL

         .addFilterBy( "nullDotRelation",
      "(DOT_RELATION IS NULL OR LENGTH(DOT_RELATION) IS NULL OR LENGTH(DOT_RELATION) = 0)" ) // IS NULL

         .addFilterBy( "notnullDotRelation", "DOT_RELATION IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanDotRelation", "DOT_RELATION < ?" ) // LESS THAN

         .addFilterBy( "greaterthanDotRelation", "DOT_RELATION > ?" ) // GREATER THAN

         .addFilterBy( "filterByDotRelationMatch", "DOT_RELATION LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullDotRelation",
      "(DOT_RELATION = ? OR DOT_RELATION IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INDotRelation", "DOT_RELATION IN ( ? )" ) // IN

         .addFilterBy( "NOTINDotRelation", "DOT_RELATION NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "DotRelationasc", "DOT_RELATION ASC" ) // ORDER ASCENDING

         .addOrderBy( "DotRelationdesc", "DOT_RELATION DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalDotSubsystem", "DOT_SUBSYSTEM = ?" ) // EQUAL

         .addFilterBy( "notequalDotSubsystem", "DOT_SUBSYSTEM != ?" ) // NOTEQUAL

         .addFilterBy( "nullDotSubsystem",
      "(DOT_SUBSYSTEM IS NULL OR LENGTH(DOT_SUBSYSTEM) IS NULL OR LENGTH(DOT_SUBSYSTEM) = 0)" ) // IS NULL

         .addFilterBy( "notnullDotSubsystem", "DOT_SUBSYSTEM IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanDotSubsystem", "DOT_SUBSYSTEM < ?" ) // LESS THAN

         .addFilterBy( "greaterthanDotSubsystem", "DOT_SUBSYSTEM > ?" ) // GREATER THAN

         .addFilterBy( "filterByDotSubsystemMatch", "DOT_SUBSYSTEM LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullDotSubsystem",
      "(DOT_SUBSYSTEM = ? OR DOT_SUBSYSTEM IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INDotSubsystem", "DOT_SUBSYSTEM IN ( ? )" ) // IN

         .addFilterBy( "NOTINDotSubsystem", "DOT_SUBSYSTEM NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "DotSubsystemasc", "DOT_SUBSYSTEM ASC" ) // ORDER ASCENDING

         .addOrderBy( "DotSubsystemdesc", "DOT_SUBSYSTEM DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalDotEngine", "DOT_ENGINE = ?" ) // EQUAL

         .addFilterBy( "notequalDotEngine", "DOT_ENGINE != ?" ) // NOTEQUAL

         .addFilterBy( "nullDotEngine",
      "(DOT_ENGINE IS NULL OR LENGTH(DOT_ENGINE) IS NULL OR LENGTH(DOT_ENGINE) = 0)" ) // IS NULL

         .addFilterBy( "notnullDotEngine", "DOT_ENGINE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanDotEngine", "DOT_ENGINE < ?" ) // LESS THAN

         .addFilterBy( "greaterthanDotEngine", "DOT_ENGINE > ?" ) // GREATER THAN

         .addFilterBy( "filterByDotEngineMatch", "DOT_ENGINE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullDotEngine",
      "(DOT_ENGINE = ? OR DOT_ENGINE IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INDotEngine", "DOT_ENGINE IN ( ? )" ) // IN

         .addFilterBy( "NOTINDotEngine", "DOT_ENGINE NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "DotEngineasc", "DOT_ENGINE ASC" ) // ORDER ASCENDING

         .addOrderBy( "DotEnginedesc", "DOT_ENGINE DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalDotTypeFolder", "DOT_TYPE_FOLDER = ?" ) // EQUAL

         .addFilterBy( "notequalDotTypeFolder", "DOT_TYPE_FOLDER != ?" ) // NOTEQUAL

         .addFilterBy( "nullDotTypeFolder",
      "(DOT_TYPE_FOLDER IS NULL OR LENGTH(DOT_TYPE_FOLDER) IS NULL OR LENGTH(DOT_TYPE_FOLDER) = 0)" ) // IS NULL

         .addFilterBy( "notnullDotTypeFolder", "DOT_TYPE_FOLDER IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanDotTypeFolder", "DOT_TYPE_FOLDER < ?" ) // LESS THAN

         .addFilterBy( "greaterthanDotTypeFolder", "DOT_TYPE_FOLDER > ?" ) // GREATER THAN

         .addFilterBy( "filterByDotTypeFolderMatch", "DOT_TYPE_FOLDER LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullDotTypeFolder",
      "(DOT_TYPE_FOLDER = ? OR DOT_TYPE_FOLDER IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INDotTypeFolder", "DOT_TYPE_FOLDER IN ( ? )" ) // IN

         .addFilterBy( "NOTINDotTypeFolder", "DOT_TYPE_FOLDER NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "DotTypeFolderasc", "DOT_TYPE_FOLDER ASC" ) // ORDER ASCENDING

         .addOrderBy( "DotTypeFolderdesc", "DOT_TYPE_FOLDER DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalDotFilenameStart", "DOT_FILENAME_START = ?" ) // EQUAL

         .addFilterBy( "notequalDotFilenameStart", "DOT_FILENAME_START != ?" ) // NOTEQUAL

         .addFilterBy( "nullDotFilenameStart",
      "(DOT_FILENAME_START IS NULL OR LENGTH(DOT_FILENAME_START) IS NULL OR LENGTH(DOT_FILENAME_START) = 0)" ) // IS NULL

         .addFilterBy( "notnullDotFilenameStart",
      "DOT_FILENAME_START IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanDotFilenameStart", "DOT_FILENAME_START < ?" ) // LESS THAN

         .addFilterBy( "greaterthanDotFilenameStart", "DOT_FILENAME_START > ?" ) // GREATER THAN

         .addFilterBy( "filterByDotFilenameStartMatch",
      "DOT_FILENAME_START LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullDotFilenameStart",
      "(DOT_FILENAME_START = ? OR DOT_FILENAME_START IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INDotFilenameStart", "DOT_FILENAME_START IN ( ? )" ) // IN

         .addFilterBy( "NOTINDotFilenameStart",
      "DOT_FILENAME_START NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "DotFilenameStartasc", "DOT_FILENAME_START ASC" ) // ORDER ASCENDING

         .addOrderBy( "DotFilenameStartdesc", "DOT_FILENAME_START DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalDotDefDelivery", "DOT_DEF_DELIVERY = ?" ) // EQUAL

         .addFilterBy( "notequalDotDefDelivery", "DOT_DEF_DELIVERY != ?" ) // NOTEQUAL

         .addFilterBy( "nullDotDefDelivery",
      "(DOT_DEF_DELIVERY IS NULL OR LENGTH(DOT_DEF_DELIVERY) IS NULL OR LENGTH(DOT_DEF_DELIVERY) = 0)" ) // IS NULL

         .addFilterBy( "notnullDotDefDelivery", "DOT_DEF_DELIVERY IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanDotDefDelivery", "DOT_DEF_DELIVERY < ?" ) // LESS THAN

         .addFilterBy( "greaterthanDotDefDelivery", "DOT_DEF_DELIVERY > ?" ) // GREATER THAN

         .addFilterBy( "filterByDotDefDeliveryMatch",
      "DOT_DEF_DELIVERY LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullDotDefDelivery",
      "(DOT_DEF_DELIVERY = ? OR DOT_DEF_DELIVERY IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INDotDefDelivery", "DOT_DEF_DELIVERY IN ( ? )" ) // IN

         .addFilterBy( "NOTINDotDefDelivery", "DOT_DEF_DELIVERY NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "DotDefDeliveryasc", "DOT_DEF_DELIVERY ASC" ) // ORDER ASCENDING

         .addOrderBy( "DotDefDeliverydesc", "DOT_DEF_DELIVERY DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalDotDefFormat", "DOT_DEF_FORMAT = ?" ) // EQUAL

         .addFilterBy( "notequalDotDefFormat", "DOT_DEF_FORMAT != ?" ) // NOTEQUAL

         .addFilterBy( "nullDotDefFormat",
      "(DOT_DEF_FORMAT IS NULL OR LENGTH(DOT_DEF_FORMAT) IS NULL OR LENGTH(DOT_DEF_FORMAT) = 0)" ) // IS NULL

         .addFilterBy( "notnullDotDefFormat", "DOT_DEF_FORMAT IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanDotDefFormat", "DOT_DEF_FORMAT < ?" ) // LESS THAN

         .addFilterBy( "greaterthanDotDefFormat", "DOT_DEF_FORMAT > ?" ) // GREATER THAN

         .addFilterBy( "filterByDotDefFormatMatch", "DOT_DEF_FORMAT LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullDotDefFormat",
      "(DOT_DEF_FORMAT = ? OR DOT_DEF_FORMAT IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INDotDefFormat", "DOT_DEF_FORMAT IN ( ? )" ) // IN

         .addFilterBy( "NOTINDotDefFormat", "DOT_DEF_FORMAT NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "DotDefFormatasc", "DOT_DEF_FORMAT ASC" ) // ORDER ASCENDING

         .addOrderBy( "DotDefFormatdesc", "DOT_DEF_FORMAT DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalDotAccReqd", "DOT_ACC_REQD = ?" ) // EQUAL

         .addFilterBy( "notequalDotAccReqd", "DOT_ACC_REQD != ?" ) // NOTEQUAL

         .addFilterBy( "nullDotAccReqd",
      "(DOT_ACC_REQD IS NULL OR LENGTH(DOT_ACC_REQD) IS NULL OR LENGTH(DOT_ACC_REQD) = 0)" ) // IS NULL

         .addFilterBy( "notnullDotAccReqd", "DOT_ACC_REQD IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanDotAccReqd", "DOT_ACC_REQD < ?" ) // LESS THAN

         .addFilterBy( "greaterthanDotAccReqd", "DOT_ACC_REQD > ?" ) // GREATER THAN

         .addFilterBy( "filterByDotAccReqdMatch", "DOT_ACC_REQD LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullDotAccReqd",
      "(DOT_ACC_REQD = ? OR DOT_ACC_REQD IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INDotAccReqd", "DOT_ACC_REQD IN ( ? )" ) // IN

         .addFilterBy( "NOTINDotAccReqd", "DOT_ACC_REQD NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "DotAccReqdasc", "DOT_ACC_REQD ASC" ) // ORDER ASCENDING

         .addOrderBy( "DotAccReqddesc", "DOT_ACC_REQD DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalDotSubReqd", "DOT_SUB_REQD = ?" ) // EQUAL

         .addFilterBy( "notequalDotSubReqd", "DOT_SUB_REQD != ?" ) // NOTEQUAL

         .addFilterBy( "nullDotSubReqd",
      "(DOT_SUB_REQD IS NULL OR LENGTH(DOT_SUB_REQD) IS NULL OR LENGTH(DOT_SUB_REQD) = 0)" ) // IS NULL

         .addFilterBy( "notnullDotSubReqd", "DOT_SUB_REQD IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanDotSubReqd", "DOT_SUB_REQD < ?" ) // LESS THAN

         .addFilterBy( "greaterthanDotSubReqd", "DOT_SUB_REQD > ?" ) // GREATER THAN

         .addFilterBy( "filterByDotSubReqdMatch", "DOT_SUB_REQD LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullDotSubReqd",
      "(DOT_SUB_REQD = ? OR DOT_SUB_REQD IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INDotSubReqd", "DOT_SUB_REQD IN ( ? )" ) // IN

         .addFilterBy( "NOTINDotSubReqd", "DOT_SUB_REQD NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "DotSubReqdasc", "DOT_SUB_REQD ASC" ) // ORDER ASCENDING

         .addOrderBy( "DotSubReqddesc", "DOT_SUB_REQD DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalDotInvReqd", "DOT_INV_REQD = ?" ) // EQUAL

         .addFilterBy( "notequalDotInvReqd", "DOT_INV_REQD != ?" ) // NOTEQUAL

         .addFilterBy( "nullDotInvReqd",
      "(DOT_INV_REQD IS NULL OR LENGTH(DOT_INV_REQD) IS NULL OR LENGTH(DOT_INV_REQD) = 0)" ) // IS NULL

         .addFilterBy( "notnullDotInvReqd", "DOT_INV_REQD IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanDotInvReqd", "DOT_INV_REQD < ?" ) // LESS THAN

         .addFilterBy( "greaterthanDotInvReqd", "DOT_INV_REQD > ?" ) // GREATER THAN

         .addFilterBy( "filterByDotInvReqdMatch", "DOT_INV_REQD LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullDotInvReqd",
      "(DOT_INV_REQD = ? OR DOT_INV_REQD IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INDotInvReqd", "DOT_INV_REQD IN ( ? )" ) // IN

         .addFilterBy( "NOTINDotInvReqd", "DOT_INV_REQD NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "DotInvReqdasc", "DOT_INV_REQD ASC" ) // ORDER ASCENDING

         .addOrderBy( "DotInvReqddesc", "DOT_INV_REQD DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalDotReasonType", "DOT_REASON_TYPE = ?" ) // EQUAL

         .addFilterBy( "notequalDotReasonType", "DOT_REASON_TYPE != ?" ) // NOTEQUAL

         .addFilterBy( "nullDotReasonType",
      "(DOT_REASON_TYPE IS NULL OR LENGTH(DOT_REASON_TYPE) IS NULL OR LENGTH(DOT_REASON_TYPE) = 0)" ) // IS NULL

         .addFilterBy( "notnullDotReasonType", "DOT_REASON_TYPE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanDotReasonType", "DOT_REASON_TYPE < ?" ) // LESS THAN

         .addFilterBy( "greaterthanDotReasonType", "DOT_REASON_TYPE > ?" ) // GREATER THAN

         .addFilterBy( "filterByDotReasonTypeMatch", "DOT_REASON_TYPE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullDotReasonType",
      "(DOT_REASON_TYPE = ? OR DOT_REASON_TYPE IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INDotReasonType", "DOT_REASON_TYPE IN ( ? )" ) // IN

         .addFilterBy( "NOTINDotReasonType", "DOT_REASON_TYPE NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "DotReasonTypeasc", "DOT_REASON_TYPE ASC" ) // ORDER ASCENDING

         .addOrderBy( "DotReasonTypedesc", "DOT_REASON_TYPE DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalDotReasonCode", "DOT_REASON_CODE = ?" ) // EQUAL

         .addFilterBy( "notequalDotReasonCode", "DOT_REASON_CODE != ?" ) // NOTEQUAL

         .addFilterBy( "nullDotReasonCode",
      "(DOT_REASON_CODE IS NULL OR LENGTH(DOT_REASON_CODE) IS NULL OR LENGTH(DOT_REASON_CODE) = 0)" ) // IS NULL

         .addFilterBy( "notnullDotReasonCode", "DOT_REASON_CODE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanDotReasonCode", "DOT_REASON_CODE < ?" ) // LESS THAN

         .addFilterBy( "greaterthanDotReasonCode", "DOT_REASON_CODE > ?" ) // GREATER THAN

         .addFilterBy( "filterByDotReasonCodeMatch", "DOT_REASON_CODE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullDotReasonCode",
      "(DOT_REASON_CODE = ? OR DOT_REASON_CODE IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INDotReasonCode", "DOT_REASON_CODE IN ( ? )" ) // IN

         .addFilterBy( "NOTINDotReasonCode", "DOT_REASON_CODE NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "DotReasonCodeasc", "DOT_REASON_CODE ASC" ) // ORDER ASCENDING

         .addOrderBy( "DotReasonCodedesc", "DOT_REASON_CODE DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalDotManipulate", "DOT_MANIPULATE = ?" ) // EQUAL

         .addFilterBy( "notequalDotManipulate", "DOT_MANIPULATE != ?" ) // NOTEQUAL

         .addFilterBy( "nullDotManipulate",
      "(DOT_MANIPULATE IS NULL OR LENGTH(DOT_MANIPULATE) IS NULL OR LENGTH(DOT_MANIPULATE) = 0)" ) // IS NULL

         .addFilterBy( "notnullDotManipulate", "DOT_MANIPULATE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanDotManipulate", "DOT_MANIPULATE < ?" ) // LESS THAN

         .addFilterBy( "greaterthanDotManipulate", "DOT_MANIPULATE > ?" ) // GREATER THAN

         .addFilterBy( "filterByDotManipulateMatch", "DOT_MANIPULATE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullDotManipulate",
      "(DOT_MANIPULATE = ? OR DOT_MANIPULATE IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INDotManipulate", "DOT_MANIPULATE IN ( ? )" ) // IN

         .addFilterBy( "NOTINDotManipulate", "DOT_MANIPULATE NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "DotManipulateasc", "DOT_MANIPULATE ASC" ) // ORDER ASCENDING

         .addOrderBy( "DotManipulatedesc", "DOT_MANIPULATE DESC" ) // ORDER DESCENDING
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
      dml = new DotDocTypeDMLFactory(  );
    }

    return dml;
  }
}
