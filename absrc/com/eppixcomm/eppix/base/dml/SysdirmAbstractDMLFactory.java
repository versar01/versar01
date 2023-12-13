package com.eppixcomm.eppix.base.dml;



/**
 * This is the DMLFactory for Sysdirm.
 *
 * @version $Revision: 1.1 $
 * @author $Author$
 * @since $jdk$
 */
public class SysdirmAbstractDMLFactory
  extends BaseDMLFactory {
  //~ Static variables/initializers //////////////////////////////////////////

  /** The DMLFactory singleton */
  private static DMLFactory dml = null;

  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new SysdirmAbstractDMLFactory object.
   *
   * @throws DMLException DOCUMENT ME!
   */
  protected SysdirmAbstractDMLFactory(  )
    throws DMLException {
    ;

    DMLTable table = defTable( "Sysdirm", // dmlName
        "blo.SysdirmDMO", // dmoName
        "SYSDIRM", // tableName
        3, // numColumns
        "SYSTEM_KEY, KEY_VALUE, DESCRIPTION", // columnList
        "(SYSTEM_KEY)", //primaryKey
        "" // versionCol     
      , false, // generatedKey
        "SYSTEM_KEY, KEY_VALUE, DESCRIPTION", "", "",
        new String[] { "SYSTEM_KEY", "KEY_VALUE", "DESCRIPTION" } );

    table.addFilterBy( "equalSystemKey", /* PK attribute */
      "(SYSTEM_KEY) = ?" )
         .addFilterBy( "filterBySystemKeyMatch", "SYSTEM_KEY LIKE ?" )
         .addFilterBy( "INSystemKey", "(SYSTEM_KEY) IN ( ? )" ) // IN

         .addFilterBy( "NOTINSystemKey", "(SYSTEM_KEY) NOT IN ( ? )" ) // NOT IN

         .addFilterBy( "notequalSystemKey", "(SYSTEM_KEY) != ?" ) // NOTEQUAL

         .addFilterBy( "nullSystemKey",
      "(SYSTEM_KEY IS NULL OR LENGTH((SYSTEM_KEY)) IS NULL OR LENGTH((SYSTEM_KEY)) = 0)" ) // IS NULL

         .addFilterBy( "notnullSystemKey", "SYSTEM_KEY IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanSystemKey", "SYSTEM_KEY < ?" ) // LESS THAN

         .addFilterBy( "greaterthanSystemKey", "SYSTEM_KEY > ?" ) // GREATER THAN

         .addFilterBy( "filterBySystemKeyMatch", "SYSTEM_KEY LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullSystemKey",
      "((SYSTEM_KEY) = ? OR SYSTEM_KEY IS NULL)" ) // EQUALORNULL
                                                       // TODO : we may need to wrap this with a () 

         .addOrderBy( "SystemKeyasc", "SYSTEM_KEY ASC" ) // ORDER ASCENDING

         .addOrderBy( "SystemKeydesc", "SYSTEM_KEY DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalKeyValue", "(KEY_VALUE) = ?" ) // EQUAL

         .addFilterBy( "notequalKeyValue", "(KEY_VALUE) != ?" ) // NOTEQUAL

         .addFilterBy( "nullKeyValue",
      "(KEY_VALUE IS NULL OR LENGTH((KEY_VALUE)) IS NULL OR LENGTH((KEY_VALUE)) = 0)" ) // IS NULL

         .addFilterBy( "notnullKeyValue", "KEY_VALUE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanKeyValue", "KEY_VALUE < ?" ) // LESS THAN

         .addFilterBy( "greaterthanKeyValue", "KEY_VALUE > ?" ) // GREATER THAN

         .addFilterBy( "filterByKeyValueMatch", "KEY_VALUE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullKeyValue",
      "((KEY_VALUE) = ? OR KEY_VALUE IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INKeyValue", "(KEY_VALUE) IN ( ? )" ) // IN

         .addFilterBy( "NOTINKeyValue", "(KEY_VALUE) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "KeyValueasc", "KEY_VALUE ASC" ) // ORDER ASCENDING

         .addOrderBy( "KeyValuedesc", "KEY_VALUE DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalDescription", "(DESCRIPTION) = ?" ) // EQUAL

         .addFilterBy( "notequalDescription", "(DESCRIPTION) != ?" ) // NOTEQUAL

         .addFilterBy( "nullDescription",
      "(DESCRIPTION IS NULL OR LENGTH((DESCRIPTION)) IS NULL OR LENGTH((DESCRIPTION)) = 0)" ) // IS NULL

         .addFilterBy( "notnullDescription", "DESCRIPTION IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanDescription", "DESCRIPTION < ?" ) // LESS THAN

         .addFilterBy( "greaterthanDescription", "DESCRIPTION > ?" ) // GREATER THAN

         .addFilterBy( "filterByDescriptionMatch", "DESCRIPTION LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullDescription",
      "((DESCRIPTION) = ? OR DESCRIPTION IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INDescription", "(DESCRIPTION) IN ( ? )" ) // IN

         .addFilterBy( "NOTINDescription", "(DESCRIPTION) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "Descriptionasc", "DESCRIPTION ASC" ) // ORDER ASCENDING

         .addOrderBy( "Descriptiondesc", "DESCRIPTION DESC" ) // ORDER DESCENDING
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
      dml = new SysdirmAbstractDMLFactory(  );
    }

    return dml;
  }
}
