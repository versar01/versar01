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

import com.eppixcomm.eppix.base.dml.DMLException;
import com.eppixcomm.eppix.base.dml.DMLFactory;
import com.eppixcomm.eppix.base.dml.DMLTable;

/**
 * This is the DMLFactory for Vsr2ServiceAux.
 *
 * @version $Revision: 1.1 $
 * @author $Author$
 * @since $jdk$
 */
public class Vsr2ServiceAuxAbstractDMLFactory
  extends BaseDMLFactory {
  //~ Static variables/initializers //////////////////////////////////////////

  /** The DMLFactory singleton */
  private static DMLFactory dml = null;

  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new Vsr2ServiceAuxAbstractDMLFactory object.
   *
   * @throws DMLException DOCUMENT ME!
   */
  protected Vsr2ServiceAuxAbstractDMLFactory(  )
    throws DMLException {
    ;

    DMLTable table = defTable( "Vsr2ServiceAux", // dmlName
        "blo.Vsr2ServiceAuxDMO", // dmoName
        "VSR2_SERVICE_AUX", // tableName
        5, // numColumns
        "VSR2_SERVICE_CODE, VSR2_SERVICE_ORDER, VSR2_SIM_RELATED, VSR2_ENTRY_TYPE, VSR2_TECHNOLOGY", // columnList
        "(VSR2_SERVICE_CODE)", //primaryKey
        "" // versionCol     
      , false, // generatedKey
        "VSR2_SERVICE_CODE, VSR2_SERVICE_ORDER, VSR2_SIM_RELATED, VSR2_ENTRY_TYPE, VSR2_TECHNOLOGY",
        "", "",
        new String[] {
          "VSR2_SERVICE_CODE", "VSR2_SERVICE_ORDER", "VSR2_SIM_RELATED",
          "VSR2_ENTRY_TYPE", "VSR2_TECHNOLOGY"
        } );

    table.addFilterBy( "equalVsr2ServiceCode", /* PK attribute */
      "(VSR2_SERVICE_CODE) = ?" )
         .addFilterBy( "filterByVsr2ServiceCodeMatch",
      "VSR2_SERVICE_CODE LIKE ?" )
         .addFilterBy( "INVsr2ServiceCode", "(VSR2_SERVICE_CODE) IN ( ? )" ) // IN

         .addFilterBy( "NOTINVsr2ServiceCode",
      "(VSR2_SERVICE_CODE) NOT IN ( ? )" ) // NOT IN

         .addFilterBy( "notequalVsr2ServiceCode",
      "(VSR2_SERVICE_CODE) != ?" ) // NOTEQUAL

         .addFilterBy( "nullVsr2ServiceCode",
      "(VSR2_SERVICE_CODE IS NULL OR LENGTH((VSR2_SERVICE_CODE)) IS NULL OR LENGTH((VSR2_SERVICE_CODE)) = 0)" ) // IS NULL

         .addFilterBy( "notnullVsr2ServiceCode",
      "VSR2_SERVICE_CODE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanVsr2ServiceCode", "VSR2_SERVICE_CODE < ?" ) // LESS THAN

         .addFilterBy( "greaterthanVsr2ServiceCode", "VSR2_SERVICE_CODE > ?" ) // GREATER THAN

         .addFilterBy( "filterByVsr2ServiceCodeMatch",
      "VSR2_SERVICE_CODE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullVsr2ServiceCode",
      "((VSR2_SERVICE_CODE) = ? OR VSR2_SERVICE_CODE IS NULL)" ) // EQUALORNULL
                                                                     // TODO : we may need to wrap this with a () 

         .addOrderBy( "Vsr2ServiceCodeasc", "VSR2_SERVICE_CODE ASC" ) // ORDER ASCENDING

         .addOrderBy( "Vsr2ServiceCodedesc", "VSR2_SERVICE_CODE DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalVsr2ServiceOrder", "VSR2_SERVICE_ORDER = ?" ) // EQUAL

         .addFilterBy( "notequalVsr2ServiceOrder", "VSR2_SERVICE_ORDER != ?" ) // NOTEQUAL

         .addFilterBy( "nullVsr2ServiceOrder", "VSR2_SERVICE_ORDER IS NULL" ) // IS NULL

         .addFilterBy( "notnullVsr2ServiceOrder",
      "VSR2_SERVICE_ORDER IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanVsr2ServiceOrder", "VSR2_SERVICE_ORDER < ?" ) // LESS THAN

         .addFilterBy( "greaterthanVsr2ServiceOrder", "VSR2_SERVICE_ORDER > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalVsr2ServiceOrder",
      "VSR2_SERVICE_ORDER <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalVsr2ServiceOrder",
      "VSR2_SERVICE_ORDER >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "filterByVsr2ServiceOrderMatch",
      "VSR2_SERVICE_ORDER LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "betweenVsr2ServiceOrder",
      "VSR2_SERVICE_ORDER BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullVsr2ServiceOrder",
      "(VSR2_SERVICE_ORDER IS NULL OR VSR2_SERVICE_ORDER = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullVsr2ServiceOrder",
      "(VSR2_SERVICE_ORDER IS NULL OR VSR2_SERVICE_ORDER < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullVsr2ServiceOrder",
      "(VSR2_SERVICE_ORDER IS NULL OR VSR2_SERVICE_ORDER > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INVsr2ServiceOrder", "VSR2_SERVICE_ORDER IN ( ? )" ) // IN

         .addFilterBy( "NOTINVsr2ServiceOrder",
      "VSR2_SERVICE_ORDER NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "Vsr2ServiceOrderasc", "VSR2_SERVICE_ORDER ASC" ) // ORDER ASCENDING

         .addOrderBy( "Vsr2ServiceOrderdesc", "VSR2_SERVICE_ORDER DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalVsr2SimRelated", "VSR2_SIM_RELATED = ?" ) // EQUAL

         .addFilterBy( "notequalVsr2SimRelated", "VSR2_SIM_RELATED != ?" ) // NOTEQUAL

         .addFilterBy( "nullVsr2SimRelated", "VSR2_SIM_RELATED IS NULL" ) // IS NULL

         .addFilterBy( "notnullVsr2SimRelated", "VSR2_SIM_RELATED IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanVsr2SimRelated", "VSR2_SIM_RELATED < ?" ) // LESS THAN

         .addFilterBy( "greaterthanVsr2SimRelated", "VSR2_SIM_RELATED > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalVsr2SimRelated",
      "VSR2_SIM_RELATED <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalVsr2SimRelated",
      "VSR2_SIM_RELATED >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "filterByVsr2SimRelatedMatch",
      "VSR2_SIM_RELATED LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "betweenVsr2SimRelated",
      "VSR2_SIM_RELATED BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullVsr2SimRelated",
      "(VSR2_SIM_RELATED IS NULL OR VSR2_SIM_RELATED = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullVsr2SimRelated",
      "(VSR2_SIM_RELATED IS NULL OR VSR2_SIM_RELATED < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullVsr2SimRelated",
      "(VSR2_SIM_RELATED IS NULL OR VSR2_SIM_RELATED > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INVsr2SimRelated", "VSR2_SIM_RELATED IN ( ? )" ) // IN

         .addFilterBy( "NOTINVsr2SimRelated", "VSR2_SIM_RELATED NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "Vsr2SimRelatedasc", "VSR2_SIM_RELATED ASC" ) // ORDER ASCENDING

         .addOrderBy( "Vsr2SimRelateddesc", "VSR2_SIM_RELATED DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalVsr2EntryType", "(VSR2_ENTRY_TYPE) = ?" ) // EQUAL

         .addFilterBy( "notequalVsr2EntryType", "(VSR2_ENTRY_TYPE) != ?" ) // NOTEQUAL

         .addFilterBy( "nullVsr2EntryType",
      "(VSR2_ENTRY_TYPE IS NULL OR LENGTH((VSR2_ENTRY_TYPE)) IS NULL OR LENGTH((VSR2_ENTRY_TYPE)) = 0)" ) // IS NULL

         .addFilterBy( "notnullVsr2EntryType", "VSR2_ENTRY_TYPE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanVsr2EntryType", "VSR2_ENTRY_TYPE < ?" ) // LESS THAN

         .addFilterBy( "greaterthanVsr2EntryType", "VSR2_ENTRY_TYPE > ?" ) // GREATER THAN

         .addFilterBy( "filterByVsr2EntryTypeMatch", "VSR2_ENTRY_TYPE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullVsr2EntryType",
      "((VSR2_ENTRY_TYPE) = ? OR VSR2_ENTRY_TYPE IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INVsr2EntryType", "(VSR2_ENTRY_TYPE) IN ( ? )" ) // IN

         .addFilterBy( "NOTINVsr2EntryType",
      "(VSR2_ENTRY_TYPE) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "Vsr2EntryTypeasc", "VSR2_ENTRY_TYPE ASC" ) // ORDER ASCENDING

         .addOrderBy( "Vsr2EntryTypedesc", "VSR2_ENTRY_TYPE DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalVsr2Technology", "(VSR2_TECHNOLOGY) = ?" ) // EQUAL

         .addFilterBy( "notequalVsr2Technology", "(VSR2_TECHNOLOGY) != ?" ) // NOTEQUAL

         .addFilterBy( "nullVsr2Technology",
      "(VSR2_TECHNOLOGY IS NULL OR LENGTH((VSR2_TECHNOLOGY)) IS NULL OR LENGTH((VSR2_TECHNOLOGY)) = 0)" ) // IS NULL

         .addFilterBy( "notnullVsr2Technology", "VSR2_TECHNOLOGY IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanVsr2Technology", "VSR2_TECHNOLOGY < ?" ) // LESS THAN

         .addFilterBy( "greaterthanVsr2Technology", "VSR2_TECHNOLOGY > ?" ) // GREATER THAN

         .addFilterBy( "filterByVsr2TechnologyMatch", "VSR2_TECHNOLOGY LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullVsr2Technology",
      "((VSR2_TECHNOLOGY) = ? OR VSR2_TECHNOLOGY IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INVsr2Technology", "(VSR2_TECHNOLOGY) IN ( ? )" ) // IN

         .addFilterBy( "NOTINVsr2Technology",
      "(VSR2_TECHNOLOGY) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "Vsr2Technologyasc", "VSR2_TECHNOLOGY ASC" ) // ORDER ASCENDING

         .addOrderBy( "Vsr2Technologydesc", "VSR2_TECHNOLOGY DESC" ) // ORDER DESCENDING
    ;

//    table.addFilterBy( "equalVsr2AuthReqd", "(VSR2_AUTH_REQD) = ?" ) // EQUAL
//
//         .addFilterBy( "notequalVsr2AuthReqd", "(VSR2_AUTH_REQD) != ?" ) // NOTEQUAL
//
//         .addFilterBy( "nullVsr2AuthReqd",
//      "(VSR2_AUTH_REQD IS NULL OR LENGTH((VSR2_AUTH_REQD)) IS NULL OR LENGTH((VSR2_AUTH_REQD)) = 0)" ) // IS NULL
//
//         .addFilterBy( "notnullVsr2AuthReqd", "VSR2_AUTH_REQD IS NOT NULL" ) // IS NOT NULL
//
//         .addFilterBy( "lessthanVsr2AuthReqd", "VSR2_AUTH_REQD < ?" ) // LESS THAN
//
//         .addFilterBy( "greaterthanVsr2AuthReqd", "VSR2_AUTH_REQD > ?" ) // GREATER THAN
//
//         .addFilterBy( "filterByVsr2AuthReqdMatch", "VSR2_AUTH_REQD LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY
//
//         .addFilterBy( "equalornullVsr2AuthReqd",
//      "((VSR2_AUTH_REQD) = ? OR VSR2_AUTH_REQD IS NULL)" ) // EQUALORNULL
//
//         .addFilterBy( "INVsr2AuthReqd", "(VSR2_AUTH_REQD) IN ( ? )" ) // IN
//
//         .addFilterBy( "NOTINVsr2AuthReqd",
//      "(VSR2_AUTH_REQD) NOT IN ( ? )" ) // NOT IN
//
//         .addOrderBy( "Vsr2AuthReqdasc", "VSR2_AUTH_REQD ASC" ) // ORDER ASCENDING
//
//         .addOrderBy( "Vsr2AuthReqddesc", "VSR2_AUTH_REQD DESC" ) // ORDER DESCENDING
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
      dml = new Vsr2ServiceAuxDMLFactory(  );
    }

    return dml;
  }
}
