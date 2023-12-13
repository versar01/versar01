package com.eppixcomm.eppix.base.dml;

import com.eppixcomm.eppix.base.dml.DMLException;
import com.eppixcomm.eppix.base.dml.DMLFactory;
import com.eppixcomm.eppix.base.dml.DMLTable;

/**
 * This is the DMLFactory for PgsProgramStatus.
 *
 * @version $Revision: 1.1 $
 * @author $Author$
 * @since $jdk$
 */
public class PgsProgramStatusAbstractDMLFactory
  extends BaseDMLFactory {
  //~ Static variables/initializers //////////////////////////////////////////

  /** The DMLFactory singleton */
  private static DMLFactory dml = null;

  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new PgsProgramStatusAbstractDMLFactory object.
   *
   * @throws DMLException DOCUMENT ME!
   */
  protected PgsProgramStatusAbstractDMLFactory(  )
    throws DMLException {
    ;

    DMLTable table = defTable( "PgsProgramStatus", // dmlName
        "blo.PgsProgramStatusDMO", // dmoName
        "PGS_PROGRAM_STATUS", // tableName
        8, // numColumns
        "PGS_PROGRAM_ID, PGS_CYCLE, PGS_DESCRIPTION, PGS_STATUS, PGS_STATUS_VALUE, PGS_STATUS_CLASS, PGS_ISAM_VALUE, PGS_ERROR_MESS", // columnList
        "(PGS_PROGRAM_ID)" + ", (PGS_CYCLE)", //primaryKey
        "" // versionCol     
      , false, // generatedKey
        "PGS_PROGRAM_ID, PGS_CYCLE, PGS_DESCRIPTION, PGS_STATUS, PGS_STATUS_VALUE, PGS_STATUS_CLASS, PGS_ISAM_VALUE, PGS_ERROR_MESS",
        "", "",
        new String[] {
          "PGS_PROGRAM_ID", "PGS_CYCLE", "PGS_DESCRIPTION", "PGS_STATUS",
          "PGS_STATUS_VALUE", "PGS_STATUS_CLASS", "PGS_ISAM_VALUE",
          "PGS_ERROR_MESS"
        } );

    table.addFilterBy( "equalPgsProgramId", /* PK attribute */
      "(PGS_PROGRAM_ID) = ?" )
         .addFilterBy( "filterByPgsProgramIdMatch", "PGS_PROGRAM_ID LIKE ?" )
         .addFilterBy( "INPgsProgramId", "(PGS_PROGRAM_ID) IN ( ? )" ) // IN

         .addFilterBy( "NOTINPgsProgramId",
      "(PGS_PROGRAM_ID) NOT IN ( ? )" ) // NOT IN

         .addFilterBy( "notequalPgsProgramId", "(PGS_PROGRAM_ID) != ?" ) // NOTEQUAL

         .addFilterBy( "nullPgsProgramId",
      "(PGS_PROGRAM_ID IS NULL OR LENGTH((PGS_PROGRAM_ID)) IS NULL OR LENGTH((PGS_PROGRAM_ID)) = 0)" ) // IS NULL

         .addFilterBy( "notnullPgsProgramId", "PGS_PROGRAM_ID IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanPgsProgramId", "PGS_PROGRAM_ID < ?" ) // LESS THAN

         .addFilterBy( "greaterthanPgsProgramId", "PGS_PROGRAM_ID > ?" ) // GREATER THAN

         .addFilterBy( "filterByPgsProgramIdMatch", "PGS_PROGRAM_ID LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullPgsProgramId",
      "((PGS_PROGRAM_ID) = ? OR PGS_PROGRAM_ID IS NULL)" ) // EQUALORNULL
                                                               // TODO : we may need to wrap this with a () 

         .addOrderBy( "PgsProgramIdasc", "PGS_PROGRAM_ID ASC" ) // ORDER ASCENDING

         .addOrderBy( "PgsProgramIddesc", "PGS_PROGRAM_ID DESC" ) // ORDER DESCENDING

         .addFilterBy( "equalPgsCycle", /* PK attribute */
      "(PGS_CYCLE) = ?" )
         .addFilterBy( "filterByPgsCycleMatch", "PGS_CYCLE LIKE ?" )
         .addFilterBy( "INPgsCycle", "(PGS_CYCLE) IN ( ? )" ) // IN

         .addFilterBy( "NOTINPgsCycle", "(PGS_CYCLE) NOT IN ( ? )" ) // NOT IN

         .addFilterBy( "notequalPgsCycle", "(PGS_CYCLE) != ?" ) // NOTEQUAL

         .addFilterBy( "nullPgsCycle",
      "(PGS_CYCLE IS NULL OR LENGTH((PGS_CYCLE)) IS NULL OR LENGTH((PGS_CYCLE)) = 0)" ) // IS NULL

         .addFilterBy( "notnullPgsCycle", "PGS_CYCLE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanPgsCycle", "PGS_CYCLE < ?" ) // LESS THAN

         .addFilterBy( "greaterthanPgsCycle", "PGS_CYCLE > ?" ) // GREATER THAN

         .addFilterBy( "filterByPgsCycleMatch", "PGS_CYCLE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullPgsCycle",
      "((PGS_CYCLE) = ? OR PGS_CYCLE IS NULL)" ) // EQUALORNULL
                                                     // TODO : we may need to wrap this with a () 

         .addOrderBy( "PgsCycleasc", "PGS_CYCLE ASC" ) // ORDER ASCENDING

         .addOrderBy( "PgsCycledesc", "PGS_CYCLE DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalPgsDescription", "(PGS_DESCRIPTION) = ?" ) // EQUAL

         .addFilterBy( "notequalPgsDescription", "(PGS_DESCRIPTION) != ?" ) // NOTEQUAL

         .addFilterBy( "nullPgsDescription",
      "(PGS_DESCRIPTION IS NULL OR LENGTH((PGS_DESCRIPTION)) IS NULL OR LENGTH((PGS_DESCRIPTION)) = 0)" ) // IS NULL

         .addFilterBy( "notnullPgsDescription", "PGS_DESCRIPTION IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanPgsDescription", "PGS_DESCRIPTION < ?" ) // LESS THAN

         .addFilterBy( "greaterthanPgsDescription", "PGS_DESCRIPTION > ?" ) // GREATER THAN

         .addFilterBy( "filterByPgsDescriptionMatch", "PGS_DESCRIPTION LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullPgsDescription",
      "((PGS_DESCRIPTION) = ? OR PGS_DESCRIPTION IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INPgsDescription", "(PGS_DESCRIPTION) IN ( ? )" ) // IN

         .addFilterBy( "NOTINPgsDescription",
      "(PGS_DESCRIPTION) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "PgsDescriptionasc", "PGS_DESCRIPTION ASC" ) // ORDER ASCENDING

         .addOrderBy( "PgsDescriptiondesc", "PGS_DESCRIPTION DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalPgsStatus", "(PGS_STATUS) = ?" ) // EQUAL

         .addFilterBy( "notequalPgsStatus", "(PGS_STATUS) != ?" ) // NOTEQUAL

         .addFilterBy( "nullPgsStatus",
      "(PGS_STATUS IS NULL OR LENGTH((PGS_STATUS)) IS NULL OR LENGTH((PGS_STATUS)) = 0)" ) // IS NULL

         .addFilterBy( "notnullPgsStatus", "PGS_STATUS IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanPgsStatus", "PGS_STATUS < ?" ) // LESS THAN

         .addFilterBy( "greaterthanPgsStatus", "PGS_STATUS > ?" ) // GREATER THAN

         .addFilterBy( "filterByPgsStatusMatch", "PGS_STATUS LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullPgsStatus",
      "((PGS_STATUS) = ? OR PGS_STATUS IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INPgsStatus", "(PGS_STATUS) IN ( ? )" ) // IN

         .addFilterBy( "NOTINPgsStatus", "(PGS_STATUS) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "PgsStatusasc", "PGS_STATUS ASC" ) // ORDER ASCENDING

         .addOrderBy( "PgsStatusdesc", "PGS_STATUS DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalPgsStatusValue", "PGS_STATUS_VALUE = ?" ) // EQUAL

         .addFilterBy( "notequalPgsStatusValue", "PGS_STATUS_VALUE != ?" ) // NOTEQUAL

         .addFilterBy( "nullPgsStatusValue", "PGS_STATUS_VALUE IS NULL" ) // IS NULL

         .addFilterBy( "notnullPgsStatusValue", "PGS_STATUS_VALUE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanPgsStatusValue", "PGS_STATUS_VALUE < ?" ) // LESS THAN

         .addFilterBy( "greaterthanPgsStatusValue", "PGS_STATUS_VALUE > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalPgsStatusValue",
      "PGS_STATUS_VALUE <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalPgsStatusValue",
      "PGS_STATUS_VALUE >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "filterByPgsStatusValueMatch",
      "PGS_STATUS_VALUE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "betweenPgsStatusValue",
      "PGS_STATUS_VALUE BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullPgsStatusValue",
      "(PGS_STATUS_VALUE IS NULL OR PGS_STATUS_VALUE = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullPgsStatusValue",
      "(PGS_STATUS_VALUE IS NULL OR PGS_STATUS_VALUE < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullPgsStatusValue",
      "(PGS_STATUS_VALUE IS NULL OR PGS_STATUS_VALUE > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INPgsStatusValue", "PGS_STATUS_VALUE IN ( ? )" ) // IN

         .addFilterBy( "NOTINPgsStatusValue", "PGS_STATUS_VALUE NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "PgsStatusValueasc", "PGS_STATUS_VALUE ASC" ) // ORDER ASCENDING

         .addOrderBy( "PgsStatusValuedesc", "PGS_STATUS_VALUE DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalPgsStatusClass", "PGS_STATUS_CLASS = ?" ) // EQUAL

         .addFilterBy( "notequalPgsStatusClass", "PGS_STATUS_CLASS != ?" ) // NOTEQUAL

         .addFilterBy( "nullPgsStatusClass", "PGS_STATUS_CLASS IS NULL" ) // IS NULL

         .addFilterBy( "notnullPgsStatusClass", "PGS_STATUS_CLASS IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanPgsStatusClass", "PGS_STATUS_CLASS < ?" ) // LESS THAN

         .addFilterBy( "greaterthanPgsStatusClass", "PGS_STATUS_CLASS > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalPgsStatusClass",
      "PGS_STATUS_CLASS <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalPgsStatusClass",
      "PGS_STATUS_CLASS >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "filterByPgsStatusClassMatch",
      "PGS_STATUS_CLASS LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "betweenPgsStatusClass",
      "PGS_STATUS_CLASS BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullPgsStatusClass",
      "(PGS_STATUS_CLASS IS NULL OR PGS_STATUS_CLASS = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullPgsStatusClass",
      "(PGS_STATUS_CLASS IS NULL OR PGS_STATUS_CLASS < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullPgsStatusClass",
      "(PGS_STATUS_CLASS IS NULL OR PGS_STATUS_CLASS > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INPgsStatusClass", "PGS_STATUS_CLASS IN ( ? )" ) // IN

         .addFilterBy( "NOTINPgsStatusClass", "PGS_STATUS_CLASS NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "PgsStatusClassasc", "PGS_STATUS_CLASS ASC" ) // ORDER ASCENDING

         .addOrderBy( "PgsStatusClassdesc", "PGS_STATUS_CLASS DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalPgsIsamValue", "PGS_ISAM_VALUE = ?" ) // EQUAL

         .addFilterBy( "notequalPgsIsamValue", "PGS_ISAM_VALUE != ?" ) // NOTEQUAL

         .addFilterBy( "nullPgsIsamValue", "PGS_ISAM_VALUE IS NULL" ) // IS NULL

         .addFilterBy( "notnullPgsIsamValue", "PGS_ISAM_VALUE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanPgsIsamValue", "PGS_ISAM_VALUE < ?" ) // LESS THAN

         .addFilterBy( "greaterthanPgsIsamValue", "PGS_ISAM_VALUE > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalPgsIsamValue", "PGS_ISAM_VALUE <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalPgsIsamValue", "PGS_ISAM_VALUE >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "filterByPgsIsamValueMatch", "PGS_ISAM_VALUE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "betweenPgsIsamValue", "PGS_ISAM_VALUE BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullPgsIsamValue",
      "(PGS_ISAM_VALUE IS NULL OR PGS_ISAM_VALUE = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullPgsIsamValue",
      "(PGS_ISAM_VALUE IS NULL OR PGS_ISAM_VALUE < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullPgsIsamValue",
      "(PGS_ISAM_VALUE IS NULL OR PGS_ISAM_VALUE > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INPgsIsamValue", "PGS_ISAM_VALUE IN ( ? )" ) // IN

         .addFilterBy( "NOTINPgsIsamValue", "PGS_ISAM_VALUE NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "PgsIsamValueasc", "PGS_ISAM_VALUE ASC" ) // ORDER ASCENDING

         .addOrderBy( "PgsIsamValuedesc", "PGS_ISAM_VALUE DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalPgsErrorMess", "(PGS_ERROR_MESS) = ?" ) // EQUAL

         .addFilterBy( "notequalPgsErrorMess", "(PGS_ERROR_MESS) != ?" ) // NOTEQUAL

         .addFilterBy( "nullPgsErrorMess",
      "(PGS_ERROR_MESS IS NULL OR LENGTH((PGS_ERROR_MESS)) IS NULL OR LENGTH((PGS_ERROR_MESS)) = 0)" ) // IS NULL

         .addFilterBy( "notnullPgsErrorMess", "PGS_ERROR_MESS IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanPgsErrorMess", "PGS_ERROR_MESS < ?" ) // LESS THAN

         .addFilterBy( "greaterthanPgsErrorMess", "PGS_ERROR_MESS > ?" ) // GREATER THAN

         .addFilterBy( "filterByPgsErrorMessMatch", "PGS_ERROR_MESS LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullPgsErrorMess",
      "((PGS_ERROR_MESS) = ? OR PGS_ERROR_MESS IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INPgsErrorMess", "(PGS_ERROR_MESS) IN ( ? )" ) // IN

         .addFilterBy( "NOTINPgsErrorMess",
      "(PGS_ERROR_MESS) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "PgsErrorMessasc", "PGS_ERROR_MESS ASC" ) // ORDER ASCENDING

         .addOrderBy( "PgsErrorMessdesc", "PGS_ERROR_MESS DESC" ) // ORDER DESCENDING
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
      dml = new PgsProgramStatusDMLFactory(  );
    }

    return dml;
  }
}
