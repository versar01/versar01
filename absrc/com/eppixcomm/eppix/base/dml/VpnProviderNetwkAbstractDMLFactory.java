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
 * This is the DMLFactory for VpnProviderNetwk.
 *
 * @version $Revision: 1.1 $
 * @author $Author$
 * @since $jdk$
 */
public class VpnProviderNetwkAbstractDMLFactory
  extends BaseDMLFactory {
  //~ Static variables/initializers //////////////////////////////////////////

  /** The DMLFactory singleton */
  private static DMLFactory dml = null;

  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new VpnProviderNetwkAbstractDMLFactory object.
   *
   * @throws DMLException DOCUMENT ME!
   */
  protected VpnProviderNetwkAbstractDMLFactory(  )
    throws DMLException {
    ;

    DMLTable table = defTable( "VpnProviderNetwk", // dmlName
        "blo.VpnProviderNetwkDMO", // dmoName
        "VPN_PROVIDER_NETWK", // tableName
        4, // numColumns
        "VPN_PROVIDER_ID, VPN_NETWORK_PREFIX, VPN_MSISDN_MASK, VPN_SIM_MASK", // columnList
        "VPN_PROVIDER_ID" + ", VPN_NETWORK_PREFIX", //primaryKey
        "" // versionCol     
      , false, // generatedKey
        "VPN_PROVIDER_ID, VPN_NETWORK_PREFIX, VPN_MSISDN_MASK, VPN_SIM_MASK",
        "", "",
        new String[] {
          "VPN_PROVIDER_ID", "VPN_NETWORK_PREFIX", "VPN_MSISDN_MASK",
          "VPN_SIM_MASK"
        } );

    table.addFilterBy( "equalVpnProviderId", /* PK attribute */
      "VPN_PROVIDER_ID = ?" )
         .addFilterBy( "filterByVpnProviderIdMatch", "VPN_PROVIDER_ID LIKE ?" )
         .addFilterBy( "INVpnProviderId", "VPN_PROVIDER_ID IN ( ? )" ) // IN

         .addFilterBy( "NOTINVpnProviderId", "VPN_PROVIDER_ID NOT IN ( ? )" ) // NOT IN

         .addFilterBy( "notequalVpnProviderId", "VPN_PROVIDER_ID != ?" ) // NOTEQUAL

         .addFilterBy( "nullVpnProviderId",
      "(VPN_PROVIDER_ID IS NULL OR LENGTH(VPN_PROVIDER_ID) IS NULL OR LENGTH(VPN_PROVIDER_ID) = 0)" ) // IS NULL

         .addFilterBy( "notnullVpnProviderId", "VPN_PROVIDER_ID IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanVpnProviderId", "VPN_PROVIDER_ID < ?" ) // LESS THAN

         .addFilterBy( "greaterthanVpnProviderId", "VPN_PROVIDER_ID > ?" ) // GREATER THAN

         .addFilterBy( "filterByVpnProviderIdMatch", "VPN_PROVIDER_ID LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullVpnProviderId",
      "(VPN_PROVIDER_ID = ? OR VPN_PROVIDER_ID IS NULL)" ) // EQUALORNULL
                                                           // TODO : we may need to wrap this with a TRIM() 

         .addOrderBy( "VpnProviderIdasc", "VPN_PROVIDER_ID ASC" ) // ORDER ASCENDING

         .addOrderBy( "VpnProviderIddesc", "VPN_PROVIDER_ID DESC" ) // ORDER DESCENDING

         .addFilterBy( "equalVpnNetworkPrefix", /* PK attribute */
      "VPN_NETWORK_PREFIX = ?" )
         .addFilterBy( "filterByVpnNetworkPrefixMatch",
      "VPN_NETWORK_PREFIX LIKE ?" )
         .addFilterBy( "INVpnNetworkPrefix", "VPN_NETWORK_PREFIX IN ( ? )" ) // IN

         .addFilterBy( "NOTINVpnNetworkPrefix",
      "VPN_NETWORK_PREFIX NOT IN ( ? )" ) // NOT IN

         .addFilterBy( "notequalVpnNetworkPrefix", "VPN_NETWORK_PREFIX != ?" ) // NOTEQUAL

         .addFilterBy( "nullVpnNetworkPrefix",
      "(VPN_NETWORK_PREFIX IS NULL OR LENGTH(VPN_NETWORK_PREFIX) IS NULL OR LENGTH(VPN_NETWORK_PREFIX) = 0)" ) // IS NULL

         .addFilterBy( "notnullVpnNetworkPrefix",
      "VPN_NETWORK_PREFIX IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanVpnNetworkPrefix", "VPN_NETWORK_PREFIX < ?" ) // LESS THAN

         .addFilterBy( "greaterthanVpnNetworkPrefix", "VPN_NETWORK_PREFIX > ?" ) // GREATER THAN

         .addFilterBy( "filterByVpnNetworkPrefixMatch",
      "VPN_NETWORK_PREFIX LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullVpnNetworkPrefix",
      "(VPN_NETWORK_PREFIX = ? OR VPN_NETWORK_PREFIX IS NULL)" ) // EQUALORNULL
                                                                 // TODO : we may need to wrap this with a TRIM() 

         .addOrderBy( "VpnNetworkPrefixasc", "VPN_NETWORK_PREFIX ASC" ) // ORDER ASCENDING

         .addOrderBy( "VpnNetworkPrefixdesc", "VPN_NETWORK_PREFIX DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalVpnMsisdnMask", "VPN_MSISDN_MASK = ?" ) // EQUAL

         .addFilterBy( "notequalVpnMsisdnMask", "VPN_MSISDN_MASK != ?" ) // NOTEQUAL

         .addFilterBy( "nullVpnMsisdnMask",
      "(VPN_MSISDN_MASK IS NULL OR LENGTH(VPN_MSISDN_MASK) IS NULL OR LENGTH(VPN_MSISDN_MASK) = 0)" ) // IS NULL

         .addFilterBy( "notnullVpnMsisdnMask",
      "VPN_MSISDN_MASK IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanVpnMsisdnMask", "VPN_MSISDN_MASK < ?" ) // LESS THAN

         .addFilterBy( "greaterthanVpnMsisdnMask", "VPN_MSISDN_MASK > ?" ) // GREATER THAN

         .addFilterBy( "filterByVpnMsisdnMaskMatch",
      "VPN_MSISDN_MASK LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullVpnMsisdnMask",
      "(VPN_MSISDN_MASK = ? OR VPN_MSISDN_MASK IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INVpnMsisdnMask", "VPN_MSISDN_MASK IN ( ? )" ) // IN

         .addFilterBy( "NOTINVpnMsisdnMask",
      "VPN_MSISDN_MASK NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "VpnMsisdnMaskasc", "VPN_MSISDN_MASK ASC" ) // ORDER ASCENDING

         .addOrderBy( "VpnMsisdnMaskdesc", "VPN_MSISDN_MASK DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalVpnSimMask", "VPN_SIM_MASK = ?" ) // EQUAL

         .addFilterBy( "notequalVpnSimMask", "VPN_SIM_MASK != ?" ) // NOTEQUAL

         .addFilterBy( "nullVpnSimMask",
      "(VPN_SIM_MASK IS NULL OR LENGTH(VPN_SIM_MASK) IS NULL OR LENGTH(VPN_SIM_MASK) = 0)" ) // IS NULL

         .addFilterBy( "notnullVpnSimMask", "VPN_SIM_MASK IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanVpnSimMask", "VPN_SIM_MASK < ?" ) // LESS THAN

         .addFilterBy( "greaterthanVpnSimMask", "VPN_SIM_MASK > ?" ) // GREATER THAN

         .addFilterBy( "filterByVpnSimMaskMatch", "VPN_SIM_MASK LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullVpnSimMask",
      "(VPN_SIM_MASK = ? OR VPN_SIM_MASK IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INVpnSimMask", "VPN_SIM_MASK IN ( ? )" ) // IN

         .addFilterBy( "NOTINVpnSimMask", "VPN_SIM_MASK NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "VpnSimMaskasc", "VPN_SIM_MASK ASC" ) // ORDER ASCENDING

         .addOrderBy( "VpnSimMaskdesc", "VPN_SIM_MASK DESC" ) // ORDER DESCENDING
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
      dml = new VpnProviderNetwkDMLFactory(  );
    }

    return dml;
  }
}
