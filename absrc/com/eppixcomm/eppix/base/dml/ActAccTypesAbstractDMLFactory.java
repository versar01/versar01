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
 * This is the DMLFactory for ActAccTypes.
 *
 * @version $Revision: 1.1 $
 * @author $Author$
 * @since $jdk$
 */
public class ActAccTypesAbstractDMLFactory
  extends BaseDMLFactory {
  //~ Static variables/initializers //////////////////////////////////////////

  /** The DMLFactory singleton */
  private static DMLFactory dml = null;

  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new ActAccTypesAbstractDMLFactory object.
   *
   * @throws DMLException DOCUMENT ME!
   */
  protected ActAccTypesAbstractDMLFactory(  )
    throws DMLException {
    ;

    DMLTable table = defTable( "ActAccTypes", // dmlName
        "blo.ActAccTypesDMO", // dmoName
        "ACT_ACC_TYPES", // tableName
        5, // numColumns
        "ACT_ACC_ID, ACT_ACC_TYPE, ACT_MNP_TYPE, ACT_USE_LE, ACT_SEGMENT", // columnList
        "(ACT_ACC_ID)", //primaryKey
        "" // versionCol     
      , false, // generatedKey
        "ACT_ACC_ID, ACT_ACC_TYPE, ACT_MNP_TYPE, ACT_USE_LE, ACT_SEGMENT",
        "", "",
        new String[] {
          "ACT_ACC_ID", "ACT_ACC_TYPE", "ACT_MNP_TYPE", "ACT_USE_LE",
          "ACT_SEGMENT"
        } );

    table.addFilterBy( "equalActAccId", /* PK attribute */
      "(ACT_ACC_ID) = ?" )
         .addFilterBy( "filterByActAccIdMatch", "ACT_ACC_ID LIKE ?" )
         .addFilterBy( "INActAccId", "(ACT_ACC_ID) IN ( ? )" ) // IN

         .addFilterBy( "NOTINActAccId", "(ACT_ACC_ID) NOT IN ( ? )" ) // NOT IN

         .addFilterBy( "notequalActAccId", "(ACT_ACC_ID) != ?" ) // NOTEQUAL

         .addFilterBy( "nullActAccId",
      "(ACT_ACC_ID IS NULL OR LENGTH(TRIM(ACT_ACC_ID)) IS NULL OR LENGTH(TRIM(ACT_ACC_ID)) = 0)" ) // IS NULL

         .addFilterBy( "notnullActAccId", "ACT_ACC_ID IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByActAccIdMatch", "ACT_ACC_ID LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullActAccId",
      "((ACT_ACC_ID) = ? OR ACT_ACC_ID IS NULL)" ) // EQUALORNULL
                                                       // TODO : we may need to wrap this with a TRIM() 

         .addOrderBy( "ActAccIdasc", "ACT_ACC_ID ASC" ) // ORDER ASCENDING

         .addOrderBy( "ActAccIddesc", "ACT_ACC_ID DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalActAccType", "(ACT_ACC_TYPE) = ?" ) // EQUAL

         .addFilterBy( "notequalActAccType", "(ACT_ACC_TYPE) != ?" ) // NOTEQUAL

         .addFilterBy( "nullActAccType",
      "(ACT_ACC_TYPE IS NULL OR LENGTH(TRIM(ACT_ACC_TYPE)) IS NULL OR LENGTH(TRIM(ACT_ACC_TYPE)) = 0)" ) // IS NULL

         .addFilterBy( "notnullActAccType", "ACT_ACC_TYPE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByActAccTypeMatch", "ACT_ACC_TYPE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullActAccType",
      "((ACT_ACC_TYPE) = ? OR ACT_ACC_TYPE IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INActAccType", "(ACT_ACC_TYPE) IN ( ? )" ) // IN

         .addFilterBy( "NOTINActAccType", "(ACT_ACC_TYPE) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "ActAccTypeasc", "ACT_ACC_TYPE ASC" ) // ORDER ASCENDING

         .addOrderBy( "ActAccTypedesc", "ACT_ACC_TYPE DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalActMnpType", "(ACT_MNP_TYPE) = ?" ) // EQUAL

         .addFilterBy( "notequalActMnpType", "(ACT_MNP_TYPE) != ?" ) // NOTEQUAL

         .addFilterBy( "nullActMnpType",
      "(ACT_MNP_TYPE IS NULL OR LENGTH(TRIM(ACT_MNP_TYPE)) IS NULL OR LENGTH(TRIM(ACT_MNP_TYPE)) = 0)" ) // IS NULL

         .addFilterBy( "notnullActMnpType", "ACT_MNP_TYPE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByActMnpTypeMatch", "ACT_MNP_TYPE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullActMnpType",
      "((ACT_MNP_TYPE) = ? OR ACT_MNP_TYPE IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INActMnpType", "(ACT_MNP_TYPE) IN ( ? )" ) // IN

         .addFilterBy( "NOTINActMnpType", "(ACT_MNP_TYPE) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "ActMnpTypeasc", "ACT_MNP_TYPE ASC" ) // ORDER ASCENDING

         .addOrderBy( "ActMnpTypedesc", "ACT_MNP_TYPE DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalActUseLe", "(ACT_USE_LE) = ?" ) // EQUAL

         .addFilterBy( "notequalActUseLe", "(ACT_USE_LE) != ?" ) // NOTEQUAL

         .addFilterBy( "nullActUseLe",
      "(ACT_USE_LE IS NULL OR LENGTH(TRIM(ACT_USE_LE)) IS NULL OR LENGTH(TRIM(ACT_USE_LE)) = 0)" ) // IS NULL

         .addFilterBy( "notnullActUseLe", "ACT_USE_LE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByActUseLeMatch", "ACT_USE_LE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullActUseLe",
      "((ACT_USE_LE) = ? OR ACT_USE_LE IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INActUseLe", "(ACT_USE_LE) IN ( ? )" ) // IN

         .addFilterBy( "NOTINActUseLe", "(ACT_USE_LE) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "ActUseLeasc", "ACT_USE_LE ASC" ) // ORDER ASCENDING

         .addOrderBy( "ActUseLedesc", "ACT_USE_LE DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalActSegment", "(ACT_SEGMENT) = ?" ) // EQUAL

         .addFilterBy( "notequalActSegment", "(ACT_SEGMENT) != ?" ) // NOTEQUAL

         .addFilterBy( "nullActSegment",
      "(ACT_SEGMENT IS NULL OR LENGTH(TRIM(ACT_SEGMENT)) IS NULL OR LENGTH(TRIM(ACT_SEGMENT)) = 0)" ) // IS NULL

         .addFilterBy( "notnullActSegment", "ACT_SEGMENT IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "filterByActSegmentMatch", "ACT_SEGMENT LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullActSegment",
      "((ACT_SEGMENT) = ? OR ACT_SEGMENT IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INActSegment", "(ACT_SEGMENT) IN ( ? )" ) // IN

         .addFilterBy( "NOTINActSegment", "(ACT_SEGMENT) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "ActSegmentasc", "ACT_SEGMENT ASC" ) // ORDER ASCENDING

         .addOrderBy( "ActSegmentdesc", "ACT_SEGMENT DESC" ) // ORDER DESCENDING
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
      dml = new ActAccTypesDMLFactory( );
    }

    return dml;
  }
}
