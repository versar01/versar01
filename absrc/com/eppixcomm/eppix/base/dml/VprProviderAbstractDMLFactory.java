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
 * This is the DMLFactory for VprProvider.
 *
 * @version $Revision: 1.1 $
 * @author $Author$
 * @since $jdk$
 */
public class VprProviderAbstractDMLFactory
  extends BaseDMLFactory {
  //~ Static variables/initializers //////////////////////////////////////////

  /** The DMLFactory singleton */
  private static DMLFactory dml = null;

  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new VprProviderAbstractDMLFactory object.
   *
   * @throws DMLException DOCUMENT ME!
   */
  protected VprProviderAbstractDMLFactory(  )
    throws DMLException {
    ;

    DMLTable table = defTable( "VprProvider", // dmlName
        "blo.VprProviderDMO", // dmoName
        "VPR_PROVIDER", // tableName
        3, // numColumns
        "VPR_PROVIDER_ID, VPR_PROVIDER_NAME, VPR_NETWORK", // columnList
        "(VPR_PROVIDER_ID)", //primaryKey
        "" // versionCol     
      , false, // generatedKey
        "VPR_PROVIDER_ID, VPR_PROVIDER_NAME, VPR_NETWORK",
        "", "",
        new String[] {
          "VPR_PROVIDER_ID", "VPR_PROVIDER_NAME", "VPR_NETWORK"
        } );

    table.addFilterBy( "equalVprProviderId", /* PK attribute */
      "(VPR_PROVIDER_ID) = ?" )
         .addFilterBy( "filterByVprProviderIdMatch", "VPR_PROVIDER_ID LIKE ?" )
         .addFilterBy( "INVprProviderId", "(VPR_PROVIDER_ID) IN ( ? )" ) // IN

         .addFilterBy( "NOTINVprProviderId",
      "(VPR_PROVIDER_ID) NOT IN ( ? )" ) // NOT IN

         .addFilterBy( "notequalVprProviderId", "(VPR_PROVIDER_ID) != ?" ) // NOTEQUAL

         .addFilterBy( "nullVprProviderId",
      "(VPR_PROVIDER_ID IS NULL OR LENGTH((VPR_PROVIDER_ID)) IS NULL OR LENGTH((VPR_PROVIDER_ID)) = 0)" ) // IS NULL

         .addFilterBy( "notnullVprProviderId", "VPR_PROVIDER_ID IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanVprProviderId", "VPR_PROVIDER_ID < ?" ) // LESS THAN

         .addFilterBy( "greaterthanVprProviderId", "VPR_PROVIDER_ID > ?" ) // GREATER THAN

         .addFilterBy( "filterByVprProviderIdMatch", "VPR_PROVIDER_ID LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullVprProviderId",
      "((VPR_PROVIDER_ID) = ? OR VPR_PROVIDER_ID IS NULL)" ) // EQUALORNULL
                                                                 // TODO : we may need to wrap this with a () 

         .addOrderBy( "VprProviderIdasc", "VPR_PROVIDER_ID ASC" ) // ORDER ASCENDING

         .addOrderBy( "VprProviderIddesc", "VPR_PROVIDER_ID DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalVprProviderName", "(VPR_PROVIDER_NAME) = ?" ) // EQUAL

         .addFilterBy( "notequalVprProviderName",
      "(VPR_PROVIDER_NAME) != ?" ) // NOTEQUAL

         .addFilterBy( "nullVprProviderName",
      "(VPR_PROVIDER_NAME IS NULL OR LENGTH((VPR_PROVIDER_NAME)) IS NULL OR LENGTH((VPR_PROVIDER_NAME)) = 0)" ) // IS NULL

         .addFilterBy( "notnullVprProviderName",
      "VPR_PROVIDER_NAME IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanVprProviderName", "VPR_PROVIDER_NAME < ?" ) // LESS THAN

         .addFilterBy( "greaterthanVprProviderName", "VPR_PROVIDER_NAME > ?" ) // GREATER THAN

         .addFilterBy( "filterByVprProviderNameMatch",
      "VPR_PROVIDER_NAME LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullVprProviderName",
      "((VPR_PROVIDER_NAME) = ? OR VPR_PROVIDER_NAME IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INVprProviderName", "(VPR_PROVIDER_NAME) IN ( ? )" ) // IN

         .addFilterBy( "NOTINVprProviderName",
      "(VPR_PROVIDER_NAME) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "VprProviderNameasc", "VPR_PROVIDER_NAME ASC" ) // ORDER ASCENDING

         .addOrderBy( "VprProviderNamedesc", "VPR_PROVIDER_NAME DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalVprNetwork", "(VPR_NETWORK) = ?" ) // EQUAL

         .addFilterBy( "notequalVprNetwork", "(VPR_NETWORK) != ?" ) // NOTEQUAL

         .addFilterBy( "nullVprNetwork",
      "(VPR_NETWORK IS NULL OR LENGTH((VPR_NETWORK)) IS NULL OR LENGTH((VPR_NETWORK)) = 0)" ) // IS NULL

         .addFilterBy( "notnullVprNetwork", "VPR_NETWORK IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanVprNetwork", "VPR_NETWORK < ?" ) // LESS THAN

         .addFilterBy( "greaterthanVprNetwork", "VPR_NETWORK > ?" ) // GREATER THAN

         .addFilterBy( "filterByVprNetworkMatch", "VPR_NETWORK LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullVprNetwork",
      "((VPR_NETWORK) = ? OR VPR_NETWORK IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INVprNetwork", "(VPR_NETWORK) IN ( ? )" ) // IN

         .addFilterBy( "NOTINVprNetwork", "(VPR_NETWORK) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "VprNetworkasc", "VPR_NETWORK ASC" ) // ORDER ASCENDING

         .addOrderBy( "VprNetworkdesc", "VPR_NETWORK DESC" ) // ORDER DESCENDING
    ;

//    table.addFilterBy( "equalVprTechnology", "(VPR_TECHNOLOGY) = ?" ) // EQUAL
//
//         .addFilterBy( "notequalVprTechnology", "(VPR_TECHNOLOGY) != ?" ) // NOTEQUAL
//
//         .addFilterBy( "nullVprTechnology",
//      "(VPR_TECHNOLOGY IS NULL OR LENGTH((VPR_TECHNOLOGY)) IS NULL OR LENGTH((VPR_TECHNOLOGY)) = 0)" ) // IS NULL
//
//         .addFilterBy( "notnullVprTechnology", "VPR_TECHNOLOGY IS NOT NULL" ) // IS NOT NULL
//
//         .addFilterBy( "lessthanVprTechnology", "VPR_TECHNOLOGY < ?" ) // LESS THAN
//
//         .addFilterBy( "greaterthanVprTechnology", "VPR_TECHNOLOGY > ?" ) // GREATER THAN
//
//         .addFilterBy( "filterByVprTechnologyMatch", "VPR_TECHNOLOGY LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY
//
//         .addFilterBy( "equalornullVprTechnology",
//      "((VPR_TECHNOLOGY) = ? OR VPR_TECHNOLOGY IS NULL)" ) // EQUALORNULL
//
//         .addFilterBy( "INVprTechnology", "(VPR_TECHNOLOGY) IN ( ? )" ) // IN
//
//         .addFilterBy( "NOTINVprTechnology",
//      "(VPR_TECHNOLOGY) NOT IN ( ? )" ) // NOT IN
//
//         .addOrderBy( "VprTechnologyasc", "VPR_TECHNOLOGY ASC" ) // ORDER ASCENDING
//
//         .addOrderBy( "VprTechnologydesc", "VPR_TECHNOLOGY DESC" ) // ORDER DESCENDING
//    ;

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
      dml = new VprProviderDMLFactory(  );
    }

    return dml;
  }
}
