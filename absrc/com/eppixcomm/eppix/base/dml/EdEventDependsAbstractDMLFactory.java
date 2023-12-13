package com.eppixcomm.eppix.base.dml;



/**
 * This is the DMLFactory for EqEventQueue.
 *
 * @version $Revision: 1.1 $
 * @author $Author$
 * @since $jdk$
 */
public class EdEventDependsAbstractDMLFactory
  extends BaseDMLFactory {
  //~ Static variables/initializers //////////////////////////////////////////

  /** The DMLFactory singleton */
  private static DMLFactory dml = null;

  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new EqEventQueueAbstractDMLFactory object.
   *
   * @throws DMLException DOCUMENT ME!
   */
  protected EdEventDependsAbstractDMLFactory(  )
    throws DMLException {
    ;

    DMLTable table = defTable( "EdEventDepends", // dmlName
        "blo.EdEventDependsDMO", // dmoName
        "ED_EVENT_DEPENDS", // tableName
        3, // numColumns
        "ED_PARENT, ED_CHILD, ED_BOND", // columnList
        null, //primaryKey
        "" // versionCol     
      , false, // generatedKey
        "ED_PARENT, ED_CHILD, ED_BOND",
        "", "",
        new String[] {
          "ED_PARENT", "ED_CHILD", "ED_BOND"
        }, false );

//===========================================================================================
    table.addFilterBy( "equalEdParent", "(ED_PARENT) = ?" ) // EQUAL

         .addFilterBy( "notequalEdParent", "(ED_PARENT) != ?" ) // NOTEQUAL

         .addFilterBy( "nullEdParent",
      "(ED_PARENT IS NULL OR LENGTH((ED_PARENT)) = 0)" ) // IS NULL

         .addFilterBy( "notnullEdParent", "ED_PARENT IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanEdParent", "ED_PARENT < ?" ) // LESS THAN

         .addFilterBy( "greaterthanEdParent", "ED_PARENT > ?" ) // GREATER THAN

         .addFilterBy( "filterByEqEdParent", "ED_PARENT LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullEdParent",
      "((ED_PARENT) = ? OR ED_PARENT IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INEdParent", "(ED_PARENT) IN ( ? )" ) // IN

         .addFilterBy( "NOTINEdParent", "(ED_PARENT) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "EdParentasc", "ED_PARENT ASC" ) // ORDER ASCENDING

         .addOrderBy( "EdParentdesc", "ED_PARENT DESC" ) // ORDER DESCENDING
    ;
//===========================================================================================
    table.addFilterBy( "equalEdChild", "(ED_CHILD) = ?" ) // EQUAL

         .addFilterBy( "notequalEdChild", "(ED_CHILD) != ?" ) // NOTEQUAL

         .addFilterBy( "nullEdChild",
      "(ED_CHILD IS NULL OR LENGTH((ED_CHILD)) = 0)" ) // IS NULL

         .addFilterBy( "notnullEdChild", "ED_CHILD IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanEdChild", "ED_CHILD < ?" ) // LESS THAN

         .addFilterBy( "greaterthanEdChild", "ED_CHILD > ?" ) // GREATER THAN

         .addFilterBy( "filterByEdChildMatch", "ED_CHILD LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullEdChild",
      "((ED_CHILD) = ? OR ED_CHILD IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INEdChild", "(ED_CHILD) IN ( ? )" ) // IN

         .addFilterBy( "NOTINEdChild", "(ED_CHILD) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "EdChildasc", "ED_CHILD ASC" ) // ORDER ASCENDING

         .addOrderBy( "EdChilddesc", "ED_CHILD DESC" ) // ORDER DESCENDING
    ;
//===========================================================================================
    table.addFilterBy( "equalEdBond", "(ED_BOND) = ?" ) // EQUAL

         .addFilterBy( "notequalEdBond", "(ED_BOND) != ?" ) // NOTEQUAL

         .addFilterBy( "nullEdBond",
      "(ED_BOND IS NULL OR LENGTH((ED_BOND)) = 0)" ) // IS NULL

         .addFilterBy( "notnullEdBond", "ED_BOND IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanEdBond", "ED_BOND < ?" ) // LESS THAN

         .addFilterBy( "greaterthanEdBond", "ED_BOND > ?" ) // GREATER THAN

         .addFilterBy( "filterByEdBondMatch", "ED_BOND LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullEdBond",
      "((ED_BOND) = ? OR ED_BOND IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INEdBond", "(ED_BOND) IN ( ? )" ) // IN

         .addFilterBy( "NOTINEdBond", "(ED_BOND) NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "EdBondasc", "ED_BOND ASC" ) // ORDER ASCENDING

         .addOrderBy( "EdBonddesc", "ED_BOND DESC" ) // ORDER DESCENDING
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
      dml = new EqEventQueueAbstractDMLFactory(  );
    }

    return dml;
  }
}
