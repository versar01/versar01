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

//import com.eppixcomm.eppix.common.dml.DMLException;
//import com.eppixcomm.eppix.common.dml.DMLFactory;
//import com.eppixcomm.eppix.common.dml.DMLTable;

/**
 * This is the DMLFactory for VsrService.
 *
 * @version $Revision: 1.1 $
 * @author $Author$
 * @since $jdk$
 */
public class VsrServiceAbstractDMLFactory
  extends BaseDMLFactory {
  //~ Static variables/initializers //////////////////////////////////////////

  /** The DMLFactory singleton */
  private static DMLFactory dml = null;

  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new VsrServiceAbstractDMLFactory object.
   *
   * @throws DMLException DOCUMENT ME!
   */
  protected VsrServiceAbstractDMLFactory(  )
    throws DMLException {
    ;

    DMLTable table = defTable( "VsrService", // dmlName
        "blo.VsrServiceDMO", // dmoName
        "VSR_SERVICE", // tableName
        10, // numColumns
        "VSR_SERVICE_CODE, VSR_SERVICE_TYPE, VSR_SERVICE_DESC, VSR_ORIGINATOR, VSR_SERVICE_CLASS, VSR_TEMP_DEACT, VSR_PRORATA, VSR_PROVIDER_ID, VSR_SHORT_DESC"
        + ", VSR_SUSPEND", // columnList
        "VSR_SERVICE_CODE", //primaryKey
        "" // versionCol     
      , false, // generatedKey
        "VSR_SERVICE_CODE, VSR_SERVICE_TYPE, VSR_SERVICE_DESC, VSR_ORIGINATOR, VSR_SERVICE_CLASS, VSR_TEMP_DEACT, VSR_PRORATA, VSR_PROVIDER_ID, VSR_SHORT_DESC"
        + ", VSR_SUSPEND", "", "",
        new String[] {
          "VSR_SERVICE_CODE", "VSR_SERVICE_TYPE", "VSR_SERVICE_DESC",
          "VSR_ORIGINATOR", "VSR_SERVICE_CLASS", "VSR_TEMP_DEACT",
          "VSR_PRORATA", "VSR_PROVIDER_ID", "VSR_SHORT_DESC", "VSR_SUSPEND"
        } );

    table.addFilterBy( "equalVsrServiceCode", /* PK attribute */
      "VSR_SERVICE_CODE = ?" )
         .addFilterBy( "filterByVsrServiceCodeMatch",
      "VSR_SERVICE_CODE LIKE ?" )
         .addFilterBy( "INVsrServiceCode", "VSR_SERVICE_CODE IN ( ? )" ) // IN

         .addFilterBy( "NOTINVsrServiceCode", "VSR_SERVICE_CODE NOT IN ( ? )" ) // NOT IN

         .addFilterBy( "notequalVsrServiceCode", "VSR_SERVICE_CODE != ?" ) // NOTEQUAL

         .addFilterBy( "nullVsrServiceCode",
      "(VSR_SERVICE_CODE IS NULL OR LENGTH(VSR_SERVICE_CODE) IS NULL OR LENGTH(VSR_SERVICE_CODE) = 0)" ) // IS NULL

         .addFilterBy( "notnullVsrServiceCode", "VSR_SERVICE_CODE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanVsrServiceCode", "VSR_SERVICE_CODE < ?" ) // LESS THAN

         .addFilterBy( "greaterthanVsrServiceCode", "VSR_SERVICE_CODE > ?" ) // GREATER THAN

         .addFilterBy( "filterByVsrServiceCodeMatch",
      "VSR_SERVICE_CODE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullVsrServiceCode",
      "(VSR_SERVICE_CODE = ? OR VSR_SERVICE_CODE IS NULL)" ) // EQUALORNULL
                                                             // TODO : we may need to wrap this with a TRIM() 

         .addOrderBy( "VsrServiceCodeasc", "VSR_SERVICE_CODE ASC" ) // ORDER ASCENDING

         .addOrderBy( "VsrServiceCodedesc", "VSR_SERVICE_CODE DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalVsrServiceType", "VSR_SERVICE_TYPE = ?" ) // EQUAL

         .addFilterBy( "notequalVsrServiceType", "VSR_SERVICE_TYPE != ?" ) // NOTEQUAL

         .addFilterBy( "nullVsrServiceType",
      "(VSR_SERVICE_TYPE IS NULL OR LENGTH(VSR_SERVICE_TYPE) IS NULL OR LENGTH(VSR_SERVICE_TYPE) = 0)" ) // IS NULL

         .addFilterBy( "notnullVsrServiceType", "VSR_SERVICE_TYPE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanVsrServiceType", "VSR_SERVICE_TYPE < ?" ) // LESS THAN

         .addFilterBy( "greaterthanVsrServiceType", "VSR_SERVICE_TYPE > ?" ) // GREATER THAN

         .addFilterBy( "filterByVsrServiceTypeMatch",
      "VSR_SERVICE_TYPE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullVsrServiceType",
      "(VSR_SERVICE_TYPE = ? OR VSR_SERVICE_TYPE IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INVsrServiceType", "VSR_SERVICE_TYPE IN ( ? )" ) // IN

         .addFilterBy( "NOTINVsrServiceType", "VSR_SERVICE_TYPE NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "VsrServiceTypeasc", "VSR_SERVICE_TYPE ASC" ) // ORDER ASCENDING

         .addOrderBy( "VsrServiceTypedesc", "VSR_SERVICE_TYPE DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalVsrServiceDesc", "VSR_SERVICE_DESC = ?" ) // EQUAL

         .addFilterBy( "notequalVsrServiceDesc", "VSR_SERVICE_DESC != ?" ) // NOTEQUAL

         .addFilterBy( "nullVsrServiceDesc",
      "(VSR_SERVICE_DESC IS NULL OR LENGTH(VSR_SERVICE_DESC) IS NULL OR LENGTH(VSR_SERVICE_DESC) = 0)" ) // IS NULL

         .addFilterBy( "notnullVsrServiceDesc", "VSR_SERVICE_DESC IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanVsrServiceDesc", "VSR_SERVICE_DESC < ?" ) // LESS THAN

         .addFilterBy( "greaterthanVsrServiceDesc", "VSR_SERVICE_DESC > ?" ) // GREATER THAN

         .addFilterBy( "filterByVsrServiceDescMatch",
      "VSR_SERVICE_DESC LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullVsrServiceDesc",
      "(VSR_SERVICE_DESC = ? OR VSR_SERVICE_DESC IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INVsrServiceDesc", "VSR_SERVICE_DESC IN ( ? )" ) // IN

         .addFilterBy( "NOTINVsrServiceDesc", "VSR_SERVICE_DESC NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "VsrServiceDescasc", "VSR_SERVICE_DESC ASC" ) // ORDER ASCENDING

         .addOrderBy( "VsrServiceDescdesc", "VSR_SERVICE_DESC DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalVsrOriginator", "VSR_ORIGINATOR = ?" ) // EQUAL

         .addFilterBy( "notequalVsrOriginator", "VSR_ORIGINATOR != ?" ) // NOTEQUAL

         .addFilterBy( "nullVsrOriginator",
      "(VSR_ORIGINATOR IS NULL OR LENGTH(VSR_ORIGINATOR) IS NULL OR LENGTH(VSR_ORIGINATOR) = 0)" ) // IS NULL

         .addFilterBy( "notnullVsrOriginator", "VSR_ORIGINATOR IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanVsrOriginator", "VSR_ORIGINATOR < ?" ) // LESS THAN

         .addFilterBy( "greaterthanVsrOriginator", "VSR_ORIGINATOR > ?" ) // GREATER THAN

         .addFilterBy( "filterByVsrOriginatorMatch", "VSR_ORIGINATOR LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullVsrOriginator",
      "(VSR_ORIGINATOR = ? OR VSR_ORIGINATOR IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INVsrOriginator", "VSR_ORIGINATOR IN ( ? )" ) // IN

         .addFilterBy( "NOTINVsrOriginator", "VSR_ORIGINATOR NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "VsrOriginatorasc", "VSR_ORIGINATOR ASC" ) // ORDER ASCENDING

         .addOrderBy( "VsrOriginatordesc", "VSR_ORIGINATOR DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalVsrServiceClass", "VSR_SERVICE_CLASS = ?" ) // EQUAL

         .addFilterBy( "notequalVsrServiceClass", "VSR_SERVICE_CLASS != ?" ) // NOTEQUAL

         .addFilterBy( "nullVsrServiceClass",
      "(VSR_SERVICE_CLASS IS NULL OR LENGTH(VSR_SERVICE_CLASS) IS NULL OR LENGTH(VSR_SERVICE_CLASS) = 0)" ) // IS NULL

         .addFilterBy( "notnullVsrServiceClass",
      "VSR_SERVICE_CLASS IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanVsrServiceClass", "VSR_SERVICE_CLASS < ?" ) // LESS THAN

         .addFilterBy( "greaterthanVsrServiceClass", "VSR_SERVICE_CLASS > ?" ) // GREATER THAN

         .addFilterBy( "filterByVsrServiceClassMatch",
      "VSR_SERVICE_CLASS LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullVsrServiceClass",
      "(VSR_SERVICE_CLASS = ? OR VSR_SERVICE_CLASS IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INVsrServiceClass", "VSR_SERVICE_CLASS IN ( ? )" ) // IN

         .addFilterBy( "NOTINVsrServiceClass",
      "VSR_SERVICE_CLASS NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "VsrServiceClassasc", "VSR_SERVICE_CLASS ASC" ) // ORDER ASCENDING

         .addOrderBy( "VsrServiceClassdesc", "VSR_SERVICE_CLASS DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalVsrTempDeact", "VSR_TEMP_DEACT = ?" ) // EQUAL

         .addFilterBy( "notequalVsrTempDeact", "VSR_TEMP_DEACT != ?" ) // NOTEQUAL

         .addFilterBy( "nullVsrTempDeact",
      "(VSR_TEMP_DEACT IS NULL OR LENGTH(VSR_TEMP_DEACT) IS NULL OR LENGTH(VSR_TEMP_DEACT) = 0)" ) // IS NULL

         .addFilterBy( "notnullVsrTempDeact", "VSR_TEMP_DEACT IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanVsrTempDeact", "VSR_TEMP_DEACT < ?" ) // LESS THAN

         .addFilterBy( "greaterthanVsrTempDeact", "VSR_TEMP_DEACT > ?" ) // GREATER THAN

         .addFilterBy( "filterByVsrTempDeactMatch", "VSR_TEMP_DEACT LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullVsrTempDeact",
      "(VSR_TEMP_DEACT = ? OR VSR_TEMP_DEACT IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INVsrTempDeact", "VSR_TEMP_DEACT IN ( ? )" ) // IN

         .addFilterBy( "NOTINVsrTempDeact", "VSR_TEMP_DEACT NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "VsrTempDeactasc", "VSR_TEMP_DEACT ASC" ) // ORDER ASCENDING

         .addOrderBy( "VsrTempDeactdesc", "VSR_TEMP_DEACT DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalVsrProrata", "VSR_PRORATA = ?" ) // EQUAL

         .addFilterBy( "notequalVsrProrata", "VSR_PRORATA != ?" ) // NOTEQUAL

         .addFilterBy( "nullVsrProrata",
      "(VSR_PRORATA IS NULL OR LENGTH(VSR_PRORATA) IS NULL OR LENGTH(VSR_PRORATA) = 0)" ) // IS NULL

         .addFilterBy( "notnullVsrProrata", "VSR_PRORATA IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanVsrProrata", "VSR_PRORATA < ?" ) // LESS THAN

         .addFilterBy( "greaterthanVsrProrata", "VSR_PRORATA > ?" ) // GREATER THAN

         .addFilterBy( "filterByVsrProrataMatch", "VSR_PRORATA LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullVsrProrata",
      "(VSR_PRORATA = ? OR VSR_PRORATA IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INVsrProrata", "VSR_PRORATA IN ( ? )" ) // IN

         .addFilterBy( "NOTINVsrProrata", "VSR_PRORATA NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "VsrProrataasc", "VSR_PRORATA ASC" ) // ORDER ASCENDING

         .addOrderBy( "VsrProratadesc", "VSR_PRORATA DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalVsrProviderId", "VSR_PROVIDER_ID = ?" ) // EQUAL

         .addFilterBy( "notequalVsrProviderId", "VSR_PROVIDER_ID != ?" ) // NOTEQUAL

         .addFilterBy( "nullVsrProviderId",
      "(VSR_PROVIDER_ID IS NULL OR LENGTH(VSR_PROVIDER_ID) IS NULL OR LENGTH(VSR_PROVIDER_ID) = 0)" ) // IS NULL

         .addFilterBy( "notnullVsrProviderId", "VSR_PROVIDER_ID IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanVsrProviderId", "VSR_PROVIDER_ID < ?" ) // LESS THAN

         .addFilterBy( "greaterthanVsrProviderId", "VSR_PROVIDER_ID > ?" ) // GREATER THAN

         .addFilterBy( "filterByVsrProviderIdMatch", "VSR_PROVIDER_ID LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullVsrProviderId",
      "(VSR_PROVIDER_ID = ? OR VSR_PROVIDER_ID IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INVsrProviderId", "VSR_PROVIDER_ID IN ( ? )" ) // IN

         .addFilterBy( "NOTINVsrProviderId", "VSR_PROVIDER_ID NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "VsrProviderIdasc", "VSR_PROVIDER_ID ASC" ) // ORDER ASCENDING

         .addOrderBy( "VsrProviderIddesc", "VSR_PROVIDER_ID DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalVsrShortDesc", "VSR_SHORT_DESC = ?" ) // EQUAL

         .addFilterBy( "notequalVsrShortDesc", "VSR_SHORT_DESC != ?" ) // NOTEQUAL

         .addFilterBy( "nullVsrShortDesc",
      "(VSR_SHORT_DESC IS NULL OR LENGTH(VSR_SHORT_DESC) IS NULL OR LENGTH(VSR_SHORT_DESC) = 0)" ) // IS NULL

         .addFilterBy( "notnullVsrShortDesc", "VSR_SHORT_DESC IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanVsrShortDesc", "VSR_SHORT_DESC < ?" ) // LESS THAN

         .addFilterBy( "greaterthanVsrShortDesc", "VSR_SHORT_DESC > ?" ) // GREATER THAN

         .addFilterBy( "filterByVsrShortDescMatch", "VSR_SHORT_DESC LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullVsrShortDesc",
      "(VSR_SHORT_DESC = ? OR VSR_SHORT_DESC IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INVsrShortDesc", "VSR_SHORT_DESC IN ( ? )" ) // IN

         .addFilterBy( "NOTINVsrShortDesc", "VSR_SHORT_DESC NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "VsrShortDescasc", "VSR_SHORT_DESC ASC" ) // ORDER ASCENDING

         .addOrderBy( "VsrShortDescdesc", "VSR_SHORT_DESC DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalVsrSuspend", "VSR_SUSPEND = ?" ) // EQUAL

         .addFilterBy( "notequalVsrSuspend", "VSR_SUSPEND != ?" ) // NOTEQUAL

         .addFilterBy( "nullVsrSuspend",
      "(VSR_SUSPEND IS NULL OR LENGTH(VSR_SUSPEND) IS NULL OR LENGTH(VSR_SUSPEND) = 0)" ) // IS NULL

         .addFilterBy( "notnullVsrSuspend", "VSR_SUSPEND IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanVsrSuspend", "VSR_SUSPEND < ?" ) // LESS THAN

         .addFilterBy( "greaterthanVsrSuspend", "VSR_SUSPEND > ?" ) // GREATER THAN

         .addFilterBy( "filterByVsrSuspendMatch", "VSR_SUSPEND LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullVsrSuspend",
      "(VSR_SUSPEND = ? OR VSR_SUSPEND IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INVsrSuspend", "VSR_SUSPEND IN ( ? )" ) // IN

         .addFilterBy( "NOTINVsrSuspend", "VSR_SUSPEND NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "VsrSuspendasc", "VSR_SUSPEND ASC" ) // ORDER ASCENDING

         .addOrderBy( "VsrSuspenddesc", "VSR_SUSPEND DESC" ) // ORDER DESCENDING
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
      dml = new VsrServiceDMLFactory(  );
    }

    return dml;
  }
}
