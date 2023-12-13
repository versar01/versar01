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
 * This is the DMLFactory for BcyBillingCycle.
 *
 * @version $Revision: 1.1 $
 * @author $Author$
 * @since $jdk$
 */
public class BcyBillingCycleAbstractDMLFactory
  extends BaseDMLFactory {
  //~ Static variables/initializers //////////////////////////////////////////

  /** The DMLFactory singleton */
  private static DMLFactory dml = null;

  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new BcyBillingCycleAbstractDMLFactory object.
   *
   * @throws DMLException DOCUMENT ME!
   */
  protected BcyBillingCycleAbstractDMLFactory(  )
    throws DMLException {
    ;

    DMLTable table = defTable( "BcyBillingCycle", // dmlName
        "blo.BcyBillingCycleDMO", // dmoName
        "BCY_BILLING_CYCLE", // tableName
        10, // numColumns
        "BCY_BILL_CYCLE, BCY_DESCRIPTION, BCY_PERIOD, BCY_FREQUENCY, BCY_DAY_OF_RUN, BCY_NEXT_RUN, BCY_SUSPENDED, BCY_USE_STATUS, BCY_NEXT_CALL_RUN"
        + ", BCY_IN_ADVANCE", // columnList
        "BCY_BILL_CYCLE", //primaryKey
        "" // versionCol     
      , false, // generatedKey
        "BCY_BILL_CYCLE, BCY_DESCRIPTION, BCY_PERIOD, BCY_FREQUENCY, BCY_DAY_OF_RUN, BCY_NEXT_RUN, BCY_SUSPENDED, BCY_USE_STATUS, BCY_NEXT_CALL_RUN"
        + ", BCY_IN_ADVANCE", "", "",
        new String[] {
          "BCY_BILL_CYCLE", "BCY_DESCRIPTION", "BCY_PERIOD", "BCY_FREQUENCY",
          "BCY_DAY_OF_RUN", "BCY_NEXT_RUN", "BCY_SUSPENDED", "BCY_USE_STATUS",
          "BCY_NEXT_CALL_RUN", "BCY_IN_ADVANCE"
        } );

    table.addFilterBy( "equalBcyBillCycle", /* PK attribute */
      "BCY_BILL_CYCLE = ?" )
         .addFilterBy( "filterByBcyBillCycleMatch", "BCY_BILL_CYCLE LIKE ?" )
         .addFilterBy( "INBcyBillCycle", "BCY_BILL_CYCLE IN ( ? )" ) // IN

         .addFilterBy( "NOTINBcyBillCycle", "BCY_BILL_CYCLE NOT IN ( ? )" ) // NOT IN

         .addFilterBy( "notequalBcyBillCycle", "BCY_BILL_CYCLE != ?" ) // NOTEQUAL

         .addFilterBy( "nullBcyBillCycle",
      "(BCY_BILL_CYCLE IS NULL OR LENGTH(BCY_BILL_CYCLE) IS NULL OR LENGTH(BCY_BILL_CYCLE) = 0)" ) // IS NULL

         .addFilterBy( "notnullBcyBillCycle", "BCY_BILL_CYCLE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanBcyBillCycle", "BCY_BILL_CYCLE < ?" ) // LESS THAN

         .addFilterBy( "greaterthanBcyBillCycle", "BCY_BILL_CYCLE > ?" ) // GREATER THAN

         .addFilterBy( "filterByBcyBillCycleMatch", "BCY_BILL_CYCLE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullBcyBillCycle",
      "(BCY_BILL_CYCLE = ? OR BCY_BILL_CYCLE IS NULL)" ) // EQUALORNULL
                                                         // TODO : we may need to wrap this with a TRIM() 

         .addOrderBy( "BcyBillCycleasc", "BCY_BILL_CYCLE ASC" ) // ORDER ASCENDING

         .addOrderBy( "BcyBillCycledesc", "BCY_BILL_CYCLE DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalBcyDescription", "BCY_DESCRIPTION = ?" ) // EQUAL

         .addFilterBy( "notequalBcyDescription", "BCY_DESCRIPTION != ?" ) // NOTEQUAL

         .addFilterBy( "nullBcyDescription",
      "(BCY_DESCRIPTION IS NULL OR LENGTH(BCY_DESCRIPTION) IS NULL OR LENGTH(BCY_DESCRIPTION) = 0)" ) // IS NULL

         .addFilterBy( "notnullBcyDescription", "BCY_DESCRIPTION IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanBcyDescription", "BCY_DESCRIPTION < ?" ) // LESS THAN

         .addFilterBy( "greaterthanBcyDescription", "BCY_DESCRIPTION > ?" ) // GREATER THAN

         .addFilterBy( "filterByBcyDescriptionMatch", "BCY_DESCRIPTION LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullBcyDescription",
      "(BCY_DESCRIPTION = ? OR BCY_DESCRIPTION IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INBcyDescription", "BCY_DESCRIPTION IN ( ? )" ) // IN

         .addFilterBy( "NOTINBcyDescription", "BCY_DESCRIPTION NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "BcyDescriptionasc", "BCY_DESCRIPTION ASC" ) // ORDER ASCENDING

         .addOrderBy( "BcyDescriptiondesc", "BCY_DESCRIPTION DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalBcyPeriod", "BCY_PERIOD = ?" ) // EQUAL

         .addFilterBy( "notequalBcyPeriod", "BCY_PERIOD != ?" ) // NOTEQUAL

         .addFilterBy( "nullBcyPeriod",
      "(BCY_PERIOD IS NULL OR LENGTH(BCY_PERIOD) IS NULL OR LENGTH(BCY_PERIOD) = 0)" ) // IS NULL

         .addFilterBy( "notnullBcyPeriod", "BCY_PERIOD IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanBcyPeriod", "BCY_PERIOD < ?" ) // LESS THAN

         .addFilterBy( "greaterthanBcyPeriod", "BCY_PERIOD > ?" ) // GREATER THAN

         .addFilterBy( "filterByBcyPeriodMatch", "BCY_PERIOD LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullBcyPeriod",
      "(BCY_PERIOD = ? OR BCY_PERIOD IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INBcyPeriod", "BCY_PERIOD IN ( ? )" ) // IN

         .addFilterBy( "NOTINBcyPeriod", "BCY_PERIOD NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "BcyPeriodasc", "BCY_PERIOD ASC" ) // ORDER ASCENDING

         .addOrderBy( "BcyPerioddesc", "BCY_PERIOD DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalBcyFrequency", "BCY_FREQUENCY = ?" ) // EQUAL

         .addFilterBy( "notequalBcyFrequency", "BCY_FREQUENCY != ?" ) // NOTEQUAL

         .addFilterBy( "nullBcyFrequency", "BCY_FREQUENCY IS NULL" ) // IS NULL

         .addFilterBy( "notnullBcyFrequency", "BCY_FREQUENCY IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanBcyFrequency", "BCY_FREQUENCY < ?" ) // LESS THAN

         .addFilterBy( "greaterthanBcyFrequency", "BCY_FREQUENCY > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalBcyFrequency", "BCY_FREQUENCY <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalBcyFrequency", "BCY_FREQUENCY >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "filterByBcyFrequencyMatch", "BCY_FREQUENCY LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "betweenBcyFrequency", "BCY_FREQUENCY BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullBcyFrequency",
      "(BCY_FREQUENCY IS NULL OR BCY_FREQUENCY = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullBcyFrequency",
      "(BCY_FREQUENCY IS NULL OR BCY_FREQUENCY < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullBcyFrequency",
      "(BCY_FREQUENCY IS NULL OR BCY_FREQUENCY > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INBcyFrequency", "BCY_FREQUENCY IN ( ? )" ) // IN

         .addFilterBy( "NOTINBcyFrequency", "BCY_FREQUENCY NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "BcyFrequencyasc", "BCY_FREQUENCY ASC" ) // ORDER ASCENDING

         .addOrderBy( "BcyFrequencydesc", "BCY_FREQUENCY DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalBcyDayOfRun", "BCY_DAY_OF_RUN = ?" ) // EQUAL

         .addFilterBy( "notequalBcyDayOfRun", "BCY_DAY_OF_RUN != ?" ) // NOTEQUAL

         .addFilterBy( "nullBcyDayOfRun", "BCY_DAY_OF_RUN IS NULL" ) // IS NULL

         .addFilterBy( "notnullBcyDayOfRun", "BCY_DAY_OF_RUN IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanBcyDayOfRun", "BCY_DAY_OF_RUN < ?" ) // LESS THAN

         .addFilterBy( "greaterthanBcyDayOfRun", "BCY_DAY_OF_RUN > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalBcyDayOfRun", "BCY_DAY_OF_RUN <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalBcyDayOfRun", "BCY_DAY_OF_RUN >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "filterByBcyDayOfRunMatch", "BCY_DAY_OF_RUN LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "betweenBcyDayOfRun", "BCY_DAY_OF_RUN BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullBcyDayOfRun",
      "(BCY_DAY_OF_RUN IS NULL OR BCY_DAY_OF_RUN = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullBcyDayOfRun",
      "(BCY_DAY_OF_RUN IS NULL OR BCY_DAY_OF_RUN < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullBcyDayOfRun",
      "(BCY_DAY_OF_RUN IS NULL OR BCY_DAY_OF_RUN > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INBcyDayOfRun", "BCY_DAY_OF_RUN IN ( ? )" ) // IN

         .addFilterBy( "NOTINBcyDayOfRun", "BCY_DAY_OF_RUN NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "BcyDayOfRunasc", "BCY_DAY_OF_RUN ASC" ) // ORDER ASCENDING

         .addOrderBy( "BcyDayOfRundesc", "BCY_DAY_OF_RUN DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalBcyNextRun", "BCY_NEXT_RUN = ?" ) // EQUAL

         .addFilterBy( "notequalBcyNextRun", "BCY_NEXT_RUN != ?" ) // NOTEQUAL

         .addFilterBy( "nullBcyNextRun", "BCY_NEXT_RUN IS NULL" ) // IS NULL

         .addFilterBy( "notnullBcyNextRun", "BCY_NEXT_RUN IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanBcyNextRun", "BCY_NEXT_RUN < ?" ) // LESS THAN

         .addFilterBy( "greaterthanBcyNextRun", "BCY_NEXT_RUN > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalBcyNextRun", "BCY_NEXT_RUN <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalBcyNextRun", "BCY_NEXT_RUN >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "filterByBcyNextRunMatch", "BCY_NEXT_RUN LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "betweenBcyNextRun", "BCY_NEXT_RUN BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullBcyNextRun",
      "(BCY_NEXT_RUN IS NULL OR BCY_NEXT_RUN = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullBcyNextRun",
      "(BCY_NEXT_RUN IS NULL OR BCY_NEXT_RUN < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullBcyNextRun",
      "(BCY_NEXT_RUN IS NULL OR BCY_NEXT_RUN > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INBcyNextRun", "BCY_NEXT_RUN IN ( ? )" ) // IN

         .addFilterBy( "NOTINBcyNextRun", "BCY_NEXT_RUN NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "BcyNextRunasc", "BCY_NEXT_RUN ASC" ) // ORDER ASCENDING

         .addOrderBy( "BcyNextRundesc", "BCY_NEXT_RUN DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalBcySuspended", "BCY_SUSPENDED = ?" ) // EQUAL

         .addFilterBy( "notequalBcySuspended", "BCY_SUSPENDED != ?" ) // NOTEQUAL

         .addFilterBy( "nullBcySuspended",
      "(BCY_SUSPENDED IS NULL OR LENGTH(BCY_SUSPENDED) IS NULL OR LENGTH(BCY_SUSPENDED) = 0)" ) // IS NULL

         .addFilterBy( "notnullBcySuspended", "BCY_SUSPENDED IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanBcySuspended", "BCY_SUSPENDED < ?" ) // LESS THAN

         .addFilterBy( "greaterthanBcySuspended", "BCY_SUSPENDED > ?" ) // GREATER THAN

         .addFilterBy( "filterByBcySuspendedMatch", "BCY_SUSPENDED LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullBcySuspended",
      "(BCY_SUSPENDED = ? OR BCY_SUSPENDED IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INBcySuspended", "BCY_SUSPENDED IN ( ? )" ) // IN

         .addFilterBy( "NOTINBcySuspended", "BCY_SUSPENDED NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "BcySuspendedasc", "BCY_SUSPENDED ASC" ) // ORDER ASCENDING

         .addOrderBy( "BcySuspendeddesc", "BCY_SUSPENDED DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalBcyUseStatus", "BCY_USE_STATUS = ?" ) // EQUAL

         .addFilterBy( "notequalBcyUseStatus", "BCY_USE_STATUS != ?" ) // NOTEQUAL

         .addFilterBy( "nullBcyUseStatus",
      "(BCY_USE_STATUS IS NULL OR LENGTH(BCY_USE_STATUS) IS NULL OR LENGTH(BCY_USE_STATUS) = 0)" ) // IS NULL

         .addFilterBy( "notnullBcyUseStatus", "BCY_USE_STATUS IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanBcyUseStatus", "BCY_USE_STATUS < ?" ) // LESS THAN

         .addFilterBy( "greaterthanBcyUseStatus", "BCY_USE_STATUS > ?" ) // GREATER THAN

         .addFilterBy( "filterByBcyUseStatusMatch", "BCY_USE_STATUS LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullBcyUseStatus",
      "(BCY_USE_STATUS = ? OR BCY_USE_STATUS IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INBcyUseStatus", "BCY_USE_STATUS IN ( ? )" ) // IN

         .addFilterBy( "NOTINBcyUseStatus", "BCY_USE_STATUS NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "BcyUseStatusasc", "BCY_USE_STATUS ASC" ) // ORDER ASCENDING

         .addOrderBy( "BcyUseStatusdesc", "BCY_USE_STATUS DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalBcyNextCallRun", "BCY_NEXT_CALL_RUN = ?" ) // EQUAL

         .addFilterBy( "notequalBcyNextCallRun", "BCY_NEXT_CALL_RUN != ?" ) // NOTEQUAL

         .addFilterBy( "nullBcyNextCallRun", "BCY_NEXT_CALL_RUN IS NULL" ) // IS NULL

         .addFilterBy( "notnullBcyNextCallRun",
      "BCY_NEXT_CALL_RUN IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanBcyNextCallRun", "BCY_NEXT_CALL_RUN < ?" ) // LESS THAN

         .addFilterBy( "greaterthanBcyNextCallRun", "BCY_NEXT_CALL_RUN > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalBcyNextCallRun",
      "BCY_NEXT_CALL_RUN <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalBcyNextCallRun",
      "BCY_NEXT_CALL_RUN >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "filterByBcyNextCallRunMatch",
      "BCY_NEXT_CALL_RUN LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "betweenBcyNextCallRun",
      "BCY_NEXT_CALL_RUN BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullBcyNextCallRun",
      "(BCY_NEXT_CALL_RUN IS NULL OR BCY_NEXT_CALL_RUN = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullBcyNextCallRun",
      "(BCY_NEXT_CALL_RUN IS NULL OR BCY_NEXT_CALL_RUN < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullBcyNextCallRun",
      "(BCY_NEXT_CALL_RUN IS NULL OR BCY_NEXT_CALL_RUN > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INBcyNextCallRun", "BCY_NEXT_CALL_RUN IN ( ? )" ) // IN

         .addFilterBy( "NOTINBcyNextCallRun", "BCY_NEXT_CALL_RUN NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "BcyNextCallRunasc", "BCY_NEXT_CALL_RUN ASC" ) // ORDER ASCENDING

         .addOrderBy( "BcyNextCallRundesc", "BCY_NEXT_CALL_RUN DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalBcyInAdvance", "BCY_IN_ADVANCE = ?" ) // EQUAL

         .addFilterBy( "notequalBcyInAdvance", "BCY_IN_ADVANCE != ?" ) // NOTEQUAL

         .addFilterBy( "nullBcyInAdvance",
      "(BCY_IN_ADVANCE IS NULL OR LENGTH(BCY_IN_ADVANCE) IS NULL OR LENGTH(BCY_IN_ADVANCE) = 0)" ) // IS NULL

         .addFilterBy( "notnullBcyInAdvance", "BCY_IN_ADVANCE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanBcyInAdvance", "BCY_IN_ADVANCE < ?" ) // LESS THAN

         .addFilterBy( "greaterthanBcyInAdvance", "BCY_IN_ADVANCE > ?" ) // GREATER THAN

         .addFilterBy( "filterByBcyInAdvanceMatch", "BCY_IN_ADVANCE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullBcyInAdvance",
      "(BCY_IN_ADVANCE = ? OR BCY_IN_ADVANCE IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INBcyInAdvance", "BCY_IN_ADVANCE IN ( ? )" ) // IN

         .addFilterBy( "NOTINBcyInAdvance", "BCY_IN_ADVANCE NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "BcyInAdvanceasc", "BCY_IN_ADVANCE ASC" ) // ORDER ASCENDING

         .addOrderBy( "BcyInAdvancedesc", "BCY_IN_ADVANCE DESC" ) // ORDER DESCENDING
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
      dml = new BcyBillingCycleDMLFactory(  );
    }

    return dml;
  }
}
