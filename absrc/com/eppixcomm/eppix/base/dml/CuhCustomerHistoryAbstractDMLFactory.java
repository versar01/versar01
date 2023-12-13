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
 * This is the DMLFactory for CuhCustomerHistory.
 *
 * @version $Revision: 1.1 $
 * @author $Author$
 * @since $jdk$
 */
public class CuhCustomerHistoryAbstractDMLFactory
  extends BaseDMLFactory {
  //~ Static variables/initializers //////////////////////////////////////////

  /** The DMLFactory singleton */
  private static DMLFactory dml = null;

  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new CuhCustomerHistoryAbstractDMLFactory object.
   *
   * @throws DMLException DOCUMENT ME!
   */
  protected CuhCustomerHistoryAbstractDMLFactory(  )
    throws DMLException {
    ;

    DMLTable table = defTable( "CuhCustomerHistory", // dmlName
        "blo.CuhCustomerHistoryDMO", // dmoName
        "CUH_CUST_HISTORY", // tableName
        8, // numColumns
        "CUH_BILL_AC_NO, CUH_FIELD_ID, CUH_HIST_CODE, CUH_OLD_VALUE, CUH_NEW_VALUE, CUH_USER_ID, CUH_TERMINAL_ID, CUH_TIMESTAMP", // columnList
        null, //primaryKey
        "" // versionCol     
      , false, // generatedKey
        "CUH_BILL_AC_NO_SUBSCRIBER_ID, CUH_FIELD_ID, CUH_HIST_CODE, CUH_OLD_VALUE, CUH_NEW_VALUE, CUH_USER_ID, CUH_TERMINAL_ID, CUH_TIMESTAMP",
        "", "",
        new String[] {
          "CUH_BILL_AC_NO", "CUH_FIELD_ID", "CUH_HIST_CODE",
          "CUH_OLD_VALUE", "CUH_NEW_VALUE", "CUH_USER_ID", "CUH_TERMINAL_ID",
          "CUH_TIMESTAMP"
        }, false );

    ;

    table.addFilterBy( "equalCuhBillAcNo", "CUH_BILL_AC_NO = ?" ) // EQUAL

         .addFilterBy( "notequalCuhBillAcNo", "CUH_BILL_AC_NO != ?" ) // NOTEQUAL

         .addFilterBy( "nullCuhBillAcNo", "CUH_BILL_AC_NO IS NULL" ) // IS NULL

         .addFilterBy( "notnullCuhBillAcNo",
      "CUH_BILL_AC_NO IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanCuhBillAcNo", "CUH_BILL_AC_NO < ?" ) // LESS THAN

         .addFilterBy( "greaterthanCuhBillAcNo", "CUH_BILL_AC_NO > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalCuhBillAcNo",
      "CUH_BILL_AC_NO <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalCuhBillAcNo",
      "CUH_BILL_AC_NO >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "filterByCuhBillAcNoMatch",
      "CUH_BILL_AC_NO LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "betweenCuhBillAcNo",
      "CUH_BILL_AC_NO BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullCuhBillAcNo",
      "(CUH_BILL_AC_NO IS NULL OR CUH_BILL_AC_NO = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullCuhBillAcNo",
      "(CUH_BILL_AC_NO IS NULL OR CUH_BILL_AC_NO < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullCuhBillAcNo",
      "(CUH_BILL_AC_NO IS NULL OR CUH_BILL_AC_NO > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INCuhBillAcNo", "CUH_BILL_AC_NO IN ( ? )" ) // IN

         .addFilterBy( "NOTINCuhBillAcNo",
      "CUH_BILL_AC_NO NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "CuhBillAcNoasc", "CUH_BILL_AC_NO ASC" ) // ORDER ASCENDING

         .addOrderBy( "cuhBillAcNodesc", "CUH_BILL_AC_NO DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalCuhFieldId", "CUH_FIELD_ID = ?" ) // EQUAL

         .addFilterBy( "notequalCuhFieldId", "CUH_FIELD_ID != ?" ) // NOTEQUAL

         .addFilterBy( "nullCuhFieldId", "CUH_FIELD_ID IS NULL" ) // IS NULL

         .addFilterBy( "notnullCuhFieldId", "CUH_FIELD_ID IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanCuhFieldId", "CUH_FIELD_ID < ?" ) // LESS THAN

         .addFilterBy( "greaterthanCuhFieldId", "CUH_FIELD_ID > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalCuhFieldId", "CUH_FIELD_ID <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalCuhFieldId", "CUH_FIELD_ID >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "filterByCuhFieldIdMatch", "CUH_FIELD_ID LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "betweenCuhFieldId", "CUH_FIELD_ID BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullCuhFieldId",
      "(CUH_FIELD_ID IS NULL OR CUH_FIELD_ID = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullCuhFieldId",
      "(CUH_FIELD_ID IS NULL OR CUH_FIELD_ID < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullCuhFieldId",
      "(CUH_FIELD_ID IS NULL OR CUH_FIELD_ID > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INCuhFieldId", "CUH_FIELD_ID IN ( ? )" ) // IN

         .addFilterBy( "NOTINCuhFieldId", "CUH_FIELD_ID NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "CuhFieldIdasc", "CUH_FIELD_ID ASC" ) // ORDER ASCENDING

         .addOrderBy( "CuhFieldIddesc", "CUH_FIELD_ID DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalCuhHistCode", "(CUH_HIST_CODE) = ?" ) // EQUAL

         .addFilterBy( "notequalCuhHistCode", "(CUH_HIST_CODE) != ?" ) // NOTEQUAL

         .addFilterBy( "nullCuhHistCode",
      "(CUH_HIST_CODE IS NULL OR LENGTH((CUH_HIST_CODE)) IS NULL OR LENGTH((CUH_HIST_CODE)) = 0)" ) // IS NULL

         .addFilterBy( "notnullCuhHistCode", "CUH_HIST_CODE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanCuhHistCode", "CUH_HIST_CODE < ?" ) // LESS THAN

         .addFilterBy( "greaterthanCuhHistCode", "CUH_HIST_CODE > ?" ) // GREATER THAN

         .addFilterBy( "filterByCuhHistCodeMatch", "CUH_HIST_CODE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullCuhHistCode",
      "((CUH_HIST_CODE) = ? OR CUH_HIST_CODE IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INCuhHistCode", "(CUH_HIST_CODE) IN ( ? )" ) // IN

         .addFilterBy( "NOTINCuhHistCode", "(CUH_HIST_CODE) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "CuhHistCodeasc", "CUH_HIST_CODE ASC" ) // ORDER ASCENDING

         .addOrderBy( "CuhHistCodedesc", "CUH_HIST_CODE DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalcuhOldValue", "(CUH_OLD_VALUE) = ?" ) // EQUAL

         .addFilterBy( "notequalcuhOldValue", "(CUH_OLD_VALUE) != ?" ) // NOTEQUAL

         .addFilterBy( "nullcuhOldValue",
      "(cuh_OLD_VALUE IS NULL OR LENGTH((CUH_OLD_VALUE)) IS NULL OR LENGTH((CUH_OLD_VALUE)) = 0)" ) // IS NULL

         .addFilterBy( "notnullCuhOldValue", "CUH_OLD_VALUE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanCuhOldValue", "CUH_OLD_VALUE < ?" ) // LESS THAN

         .addFilterBy( "greaterthanCuhOldValue", "CUH_OLD_VALUE > ?" ) // GREATER THAN

         .addFilterBy( "filterByCuhOldValueMatch", "CUH_OLD_VALUE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullCuhOldValue",
      "((CUH_OLD_VALUE) = ? OR CUH_OLD_VALUE IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INCuhOldValue", "(CUH_OLD_VALUE) IN ( ? )" ) // IN

         .addFilterBy( "NOTINCuhOldValue", "(CUH_OLD_VALUE) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "CuhOldValueasc", "CUH_OLD_VALUE ASC" ) // ORDER ASCENDING

         .addOrderBy( "CuhOldValuedesc", "CUH_OLD_VALUE DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalCuhNewValue", "(CUH_NEW_VALUE) = ?" ) // EQUAL

         .addFilterBy( "notequalCuhNewValue", "(CUH_NEW_VALUE) != ?" ) // NOTEQUAL

         .addFilterBy( "nullCuhNewValue",
      "(CUH_NEW_VALUE IS NULL OR LENGTH((CUH_NEW_VALUE)) IS NULL OR LENGTH((CUH_NEW_VALUE)) = 0)" ) // IS NULL

         .addFilterBy( "notnullCuhNewValue", "CUH_NEW_VALUE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanCuhNewValue", "CUH_NEW_VALUE < ?" ) // LESS THAN

         .addFilterBy( "greaterthanCuhNewValue", "CUH_NEW_VALUE > ?" ) // GREATER THAN

         .addFilterBy( "filterByCuhNewValueMatch", "CUH_NEW_VALUE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullCuhNewValue",
      "((CUH_NEW_VALUE) = ? OR CUH_NEW_VALUE IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INCuhNewValue", "(CUH_NEW_VALUE) IN ( ? )" ) // IN

         .addFilterBy( "NOTINCuhNewValue", "(CUH_NEW_VALUE) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "CuhNewValueasc", "CUH_NEW_VALUE ASC" ) // ORDER ASCENDING

         .addOrderBy( "CuhNewValuedesc", "CUH_NEW_VALUE DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalCuhUserId", "(CUH_USER_ID) = ?" ) // EQUAL

         .addFilterBy( "notequalCuhUserId", "(CUH_USER_ID) != ?" ) // NOTEQUAL

         .addFilterBy( "nullCuhUserId",
      "(CUH_USER_ID IS NULL OR LENGTH((CUH_USER_ID)) IS NULL OR LENGTH((CUH_USER_ID)) = 0)" ) // IS NULL

         .addFilterBy( "notnullCuhUserId", "CUH_USER_ID IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanCuhUserId", "CUH_USER_ID < ?" ) // LESS THAN

         .addFilterBy( "greaterthanCuhUserId", "CUH_USER_ID > ?" ) // GREATER THAN

         .addFilterBy( "filterByCuhUserIdMatch", "CUH_USER_ID LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullCuhUserId",
      "((CUH_USER_ID) = ? OR CUH_USER_ID IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INCuhUserId", "(CUH_USER_ID) IN ( ? )" ) // IN

         .addFilterBy( "NOTINCuhUserId", "(CUH_USER_ID) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "CuhUserIdasc", "CUH_USER_ID ASC" ) // ORDER ASCENDING

         .addOrderBy( "CuhUserIddesc", "CUH_USER_ID DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalCuhTerminalId", "(CUH_TERMINAL_ID) = ?" ) // EQUAL

         .addFilterBy( "notequalCuhTerminalId", "(CUH_TERMINAL_ID) != ?" ) // NOTEQUAL

         .addFilterBy( "nullCuhTerminalId",
      "(CUH_TERMINAL_ID IS NULL OR LENGTH((CUH_TERMINAL_ID)) IS NULL OR LENGTH((CUH_TERMINAL_ID)) = 0)" ) // IS NULL

         .addFilterBy( "notnullCuhTerminalId", "CUH_TERMINAL_ID IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanCuhTerminalId", "CUH_TERMINAL_ID < ?" ) // LESS THAN

         .addFilterBy( "greaterthanCuhTerminalId", "CUH_TERMINAL_ID > ?" ) // GREATER THAN

         .addFilterBy( "filterByCuhTerminalIdMatch", "CUH_TERMINAL_ID LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullCuhTerminalId",
      "((CUH_TERMINAL_ID) = ? OR CUH_TERMINAL_ID IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INCuhTerminalId", "(CUH_TERMINAL_ID) IN ( ? )" ) // IN

         .addFilterBy( "NOTINCuhTerminalId",
      "(CUH_TERMINAL_ID) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "CuhTerminalIdasc", "CUH_TERMINAL_ID ASC" ) // ORDER ASCENDING

         .addOrderBy( "CuhTerminalIddesc", "CUH_TERMINAL_ID DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalCuhTimestamp", "CUH_TIMESTAMP = ?" ) // EQUAL

         .addFilterBy( "notequalCuhTimestamp", "CUH_TIMESTAMP != ?" ) // NOTEQUAL

         .addFilterBy( "nullCuhTimestamp", "CUH_TIMESTAMP IS NULL" ) // IS NULL

         .addFilterBy( "notnullCuhTimestamp", "CUH_TIMESTAMP IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanCuhTimestamp", "CUH_TIMESTAMP < ?" ) // LESS THAN

         .addFilterBy( "greaterthanCuhTimestamp", "CUH_TIMESTAMP > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalCuhTimestamp", "CUH_TIMESTAMP <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalCuhTimestamp", "CUH_TIMESTAMP >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "filterByCuhTimestampMatch", "CUH_TIMESTAMP LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "betweenCuhTimestamp", "CUH_TIMESTAMP BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullCuhTimestamp",
      "(CUH_TIMESTAMP IS NULL OR CUH_TIMESTAMP = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullCuhTimestamp",
      "(CUH_TIMESTAMP IS NULL OR CUH_TIMESTAMP < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullCuhTimestamp",
      "(CUH_TIMESTAMP IS NULL OR CUH_TIMESTAMP > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INCuhTimestamp", "CUH_TIMESTAMP IN ( ? )" ) // IN

         .addFilterBy( "NOTINCuhTimestamp", "CUH_TIMESTAMP NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "CuhTimestampasc", "CUH_TIMESTAMP ASC" ) // ORDER ASCENDING

         .addOrderBy( "CuhTimestampdesc", "CUH_TIMESTAMP DESC" ) // ORDER DESCENDING
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
      dml = new CuhCustomerHistoryDMLFactory(  );
    }

    return dml;
  }
}
