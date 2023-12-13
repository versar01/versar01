package com.eppixcomm.eppix.base.dml;

import com.eppixcomm.eppix.base.dml.DMLException;
import com.eppixcomm.eppix.base.dml.DMLFactory;
import com.eppixcomm.eppix.base.dml.DMLTable;

/**
 * This is the DMLFactory for PgcProgramContrl.
 *
 * @version $Revision: 1.1 $
 * @author $Author$
 * @since $jdk$
 */
public class PgcProgramContrlAbstractDMLFactory
  extends BaseDMLFactory {
  //~ Static variables/initializers //////////////////////////////////////////

  /** The DMLFactory singleton */
  private static DMLFactory dml = null;

  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new PgcProgramContrlAbstractDMLFactory object.
   *
   * @throws DMLException DOCUMENT ME!
   */
  protected PgcProgramContrlAbstractDMLFactory(  )
    throws DMLException {
    ;

    DMLTable table = defTable( "PgcProgramContrl", // dmlName
        "blo.PgcProgramContrlDMO", // dmoName
        "PGC_PROGRAM_CONTRL", // tableName
        5, // numColumns
        "PGC_PROGRAM_ID, PGC_DEPENDENCY_ID, PGC_CYCLE, PGC_RESET_FLAG, PGC_PRIORITY", // columnList
        "(PGC_PROGRAM_ID)" + ", (PGC_DEPENDENCY_ID)"
        + ", (PGC_CYCLE)", //primaryKey
        "" // versionCol     
      , false, // generatedKey
        "PGC_PROGRAM_ID, PGC_DEPENDENCY_ID, PGC_CYCLE, PGC_RESET_FLAG, PGC_PRIORITY",
        "", "",
        new String[] {
          "PGC_PROGRAM_ID", "PGC_DEPENDENCY_ID", "PGC_CYCLE", "PGC_RESET_FLAG",
          "PGC_PRIORITY"
        } );

    table.addFilterBy( "equalPgcProgramId", /* PK attribute */
      "(PGC_PROGRAM_ID) = ?" )
         .addFilterBy( "filterByPgcProgramIdMatch", "PGC_PROGRAM_ID LIKE ?" )
         .addFilterBy( "INPgcProgramId", "(PGC_PROGRAM_ID) IN ( ? )" ) // IN

         .addFilterBy( "NOTINPgcProgramId",
      "(PGC_PROGRAM_ID) NOT IN ( ? )" ) // NOT IN

         .addFilterBy( "notequalPgcProgramId", "(PGC_PROGRAM_ID) != ?" ) // NOTEQUAL

         .addFilterBy( "nullPgcProgramId",
      "(PGC_PROGRAM_ID IS NULL OR LENGTH((PGC_PROGRAM_ID)) IS NULL OR LENGTH((PGC_PROGRAM_ID)) = 0)" ) // IS NULL

         .addFilterBy( "notnullPgcProgramId", "PGC_PROGRAM_ID IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanPgcProgramId", "PGC_PROGRAM_ID < ?" ) // LESS THAN

         .addFilterBy( "greaterthanPgcProgramId", "PGC_PROGRAM_ID > ?" ) // GREATER THAN

         .addFilterBy( "filterByPgcProgramIdMatch", "PGC_PROGRAM_ID LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullPgcProgramId",
      "((PGC_PROGRAM_ID) = ? OR PGC_PROGRAM_ID IS NULL)" ) // EQUALORNULL
                                                               // TODO : we may need to wrap this with a () 

         .addOrderBy( "PgcProgramIdasc", "PGC_PROGRAM_ID ASC" ) // ORDER ASCENDING

         .addOrderBy( "PgcProgramIddesc", "PGC_PROGRAM_ID DESC" ) // ORDER DESCENDING

         .addFilterBy( "equalPgcDependencyId", /* PK attribute */
      "(PGC_DEPENDENCY_ID) = ?" )
         .addFilterBy( "filterByPgcDependencyIdMatch",
      "PGC_DEPENDENCY_ID LIKE ?" )
         .addFilterBy( "INPgcDependencyId", "(PGC_DEPENDENCY_ID) IN ( ? )" ) // IN

         .addFilterBy( "NOTINPgcDependencyId",
      "(PGC_DEPENDENCY_ID) NOT IN ( ? )" ) // NOT IN

         .addFilterBy( "notequalPgcDependencyId",
      "(PGC_DEPENDENCY_ID) != ?" ) // NOTEQUAL

         .addFilterBy( "nullPgcDependencyId",
      "(PGC_DEPENDENCY_ID IS NULL OR LENGTH((PGC_DEPENDENCY_ID)) IS NULL OR LENGTH((PGC_DEPENDENCY_ID)) = 0)" ) // IS NULL

         .addFilterBy( "notnullPgcDependencyId",
      "PGC_DEPENDENCY_ID IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanPgcDependencyId", "PGC_DEPENDENCY_ID < ?" ) // LESS THAN

         .addFilterBy( "greaterthanPgcDependencyId", "PGC_DEPENDENCY_ID > ?" ) // GREATER THAN

         .addFilterBy( "filterByPgcDependencyIdMatch",
      "PGC_DEPENDENCY_ID LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullPgcDependencyId",
      "((PGC_DEPENDENCY_ID) = ? OR PGC_DEPENDENCY_ID IS NULL)" ) // EQUALORNULL
                                                                     // TODO : we may need to wrap this with a () 

         .addOrderBy( "PgcDependencyIdasc", "PGC_DEPENDENCY_ID ASC" ) // ORDER ASCENDING

         .addOrderBy( "PgcDependencyIddesc", "PGC_DEPENDENCY_ID DESC" ) // ORDER DESCENDING

         .addFilterBy( "equalPgcCycle", /* PK attribute */
      "(PGC_CYCLE) = ?" )
         .addFilterBy( "filterByPgcCycleMatch", "PGC_CYCLE LIKE ?" )
         .addFilterBy( "INPgcCycle", "(PGC_CYCLE) IN ( ? )" ) // IN

         .addFilterBy( "NOTINPgcCycle", "(PGC_CYCLE) NOT IN ( ? )" ) // NOT IN

         .addFilterBy( "notequalPgcCycle", "(PGC_CYCLE) != ?" ) // NOTEQUAL

         .addFilterBy( "nullPgcCycle",
      "(PGC_CYCLE IS NULL OR LENGTH((PGC_CYCLE)) IS NULL OR LENGTH((PGC_CYCLE)) = 0)" ) // IS NULL

         .addFilterBy( "notnullPgcCycle", "PGC_CYCLE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanPgcCycle", "PGC_CYCLE < ?" ) // LESS THAN

         .addFilterBy( "greaterthanPgcCycle", "PGC_CYCLE > ?" ) // GREATER THAN

         .addFilterBy( "filterByPgcCycleMatch", "PGC_CYCLE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullPgcCycle",
      "((PGC_CYCLE) = ? OR PGC_CYCLE IS NULL)" ) // EQUALORNULL
                                                     // TODO : we may need to wrap this with a () 

         .addOrderBy( "PgcCycleasc", "PGC_CYCLE ASC" ) // ORDER ASCENDING

         .addOrderBy( "PgcCycledesc", "PGC_CYCLE DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalPgcResetFlag", "(PGC_RESET_FLAG) = ?" ) // EQUAL

         .addFilterBy( "notequalPgcResetFlag", "(PGC_RESET_FLAG) != ?" ) // NOTEQUAL

         .addFilterBy( "nullPgcResetFlag",
      "(PGC_RESET_FLAG IS NULL OR LENGTH((PGC_RESET_FLAG)) IS NULL OR LENGTH((PGC_RESET_FLAG)) = 0)" ) // IS NULL

         .addFilterBy( "notnullPgcResetFlag", "PGC_RESET_FLAG IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanPgcResetFlag", "PGC_RESET_FLAG < ?" ) // LESS THAN

         .addFilterBy( "greaterthanPgcResetFlag", "PGC_RESET_FLAG > ?" ) // GREATER THAN

         .addFilterBy( "filterByPgcResetFlagMatch", "PGC_RESET_FLAG LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullPgcResetFlag",
      "((PGC_RESET_FLAG) = ? OR PGC_RESET_FLAG IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INPgcResetFlag", "(PGC_RESET_FLAG) IN ( ? )" ) // IN

         .addFilterBy( "NOTINPgcResetFlag",
      "(PGC_RESET_FLAG) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "PgcResetFlagasc", "PGC_RESET_FLAG ASC" ) // ORDER ASCENDING

         .addOrderBy( "PgcResetFlagdesc", "PGC_RESET_FLAG DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalPgcPriority", "PGC_PRIORITY = ?" ) // EQUAL

         .addFilterBy( "notequalPgcPriority", "PGC_PRIORITY != ?" ) // NOTEQUAL

         .addFilterBy( "nullPgcPriority", "PGC_PRIORITY IS NULL" ) // IS NULL

         .addFilterBy( "notnullPgcPriority", "PGC_PRIORITY IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanPgcPriority", "PGC_PRIORITY < ?" ) // LESS THAN

         .addFilterBy( "greaterthanPgcPriority", "PGC_PRIORITY > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalPgcPriority", "PGC_PRIORITY <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalPgcPriority", "PGC_PRIORITY >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "filterByPgcPriorityMatch", "PGC_PRIORITY LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "betweenPgcPriority", "PGC_PRIORITY BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullPgcPriority",
      "(PGC_PRIORITY IS NULL OR PGC_PRIORITY = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullPgcPriority",
      "(PGC_PRIORITY IS NULL OR PGC_PRIORITY < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullPgcPriority",
      "(PGC_PRIORITY IS NULL OR PGC_PRIORITY > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INPgcPriority", "PGC_PRIORITY IN ( ? )" ) // IN

         .addFilterBy( "NOTINPgcPriority", "PGC_PRIORITY NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "PgcPriorityasc", "PGC_PRIORITY ASC" ) // ORDER ASCENDING

         .addOrderBy( "PgcPrioritydesc", "PGC_PRIORITY DESC" ) // ORDER DESCENDING
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
      dml = new PgcProgramContrlDMLFactory(  );
    }

    return dml;
  }
}
