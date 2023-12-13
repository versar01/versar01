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
 * This is the DMLFactory for DipDiscountPlan.
 *
 * @version $Revision: 1.1 $
 * @author $Author$
 * @since $jdk$
 */
public class DipDiscountPlanAbstractDMLFactory
  extends BaseDMLFactory {
  //~ Static variables/initializers //////////////////////////////////////////

  /** The DMLFactory singleton */
  private static DMLFactory dml = null;

  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new DipDiscountPlanAbstractDMLFactory object.
   *
   * @throws DMLException DOCUMENT ME!
   */
  protected DipDiscountPlanAbstractDMLFactory(  )
    throws DMLException {
    ;

    DMLTable table = defTable( "DipDiscountPlan", // dmlName
        "blo.DipDiscountPlanDMO", // dmoName
        "DIP_DISCOUNT_PLAN", // tableName
        3, // numColumns
        "DIP_DISCOUNT_ID, DIP_SEQUENCE, DIP_RULE_REF", // columnList
        "DIP_DISCOUNT_ID" + ", DIP_SEQUENCE", //primaryKey
        "" // versionCol     
      , false, // generatedKey
        "DIP_DISCOUNT_ID, DIP_SEQUENCE, DIP_RULE_REF", "", "",
        new String[] { "DIP_DISCOUNT_ID", "DIP_SEQUENCE", "DIP_RULE_REF" } );

    table.addFilterBy( "equalDipDiscountId", /* PK attribute */
      "DIP_DISCOUNT_ID = ?" )
         .addFilterBy( "filterByDipDiscountIdMatch", "DIP_DISCOUNT_ID LIKE ?" )
         .addFilterBy( "INDipDiscountId", "DIP_DISCOUNT_ID IN ( ? )" ) // IN

         .addFilterBy( "NOTINDipDiscountId", "DIP_DISCOUNT_ID NOT IN ( ? )" ) // NOT IN

         .addFilterBy( "notequalDipDiscountId", "DIP_DISCOUNT_ID != ?" ) // NOTEQUAL

         .addFilterBy( "nullDipDiscountId", "DIP_DISCOUNT_ID IS NULL" ) // IS NULL

         .addFilterBy( "notnullDipDiscountId", "DIP_DISCOUNT_ID IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanDipDiscountId", "DIP_DISCOUNT_ID < ?" ) // LESS THAN

         .addFilterBy( "greaterthanDipDiscountId", "DIP_DISCOUNT_ID > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalDipDiscountId", "DIP_DISCOUNT_ID <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalDipDiscountId",
      "DIP_DISCOUNT_ID >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "filterByDipDiscountIdMatch", "DIP_DISCOUNT_ID LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "betweenDipDiscountId",
      "DIP_DISCOUNT_ID BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullDipDiscountId",
      "(DIP_DISCOUNT_ID IS NULL OR DIP_DISCOUNT_ID = ?)" ) // EQUALORNULL
                                                           // TODO : we may need to wrap this with a TRIM() 

         .addFilterBy( "lessthanornullDipDiscountId",
      "(DIP_DISCOUNT_ID IS NULL OR DIP_DISCOUNT_ID < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullDipDiscountId",
      "(DIP_DISCOUNT_ID IS NULL OR DIP_DISCOUNT_ID > ?)" ) // GREATERTHANORNULL

         .addOrderBy( "DipDiscountIdasc", "DIP_DISCOUNT_ID ASC" ) // ORDER ASCENDING

         .addOrderBy( "DipDiscountIddesc", "DIP_DISCOUNT_ID DESC" ) // ORDER DESCENDING

         .addFilterBy( "equalDipSequence", /* PK attribute */
      "DIP_SEQUENCE = ?" )
         .addFilterBy( "filterByDipSequenceMatch", "DIP_SEQUENCE LIKE ?" )
         .addFilterBy( "INDipSequence", "DIP_SEQUENCE IN ( ? )" ) // IN

         .addFilterBy( "NOTINDipSequence", "DIP_SEQUENCE NOT IN ( ? )" ) // NOT IN

         .addFilterBy( "notequalDipSequence", "DIP_SEQUENCE != ?" ) // NOTEQUAL

         .addFilterBy( "nullDipSequence", "DIP_SEQUENCE IS NULL" ) // IS NULL

         .addFilterBy( "notnullDipSequence", "DIP_SEQUENCE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanDipSequence", "DIP_SEQUENCE < ?" ) // LESS THAN

         .addFilterBy( "greaterthanDipSequence", "DIP_SEQUENCE > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalDipSequence", "DIP_SEQUENCE <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalDipSequence", "DIP_SEQUENCE >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "filterByDipSequenceMatch", "DIP_SEQUENCE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "betweenDipSequence", "DIP_SEQUENCE BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullDipSequence",
      "(DIP_SEQUENCE IS NULL OR DIP_SEQUENCE = ?)" ) // EQUALORNULL
                                                     // TODO : we may need to wrap this with a TRIM() 

         .addFilterBy( "lessthanornullDipSequence",
      "(DIP_SEQUENCE IS NULL OR DIP_SEQUENCE < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullDipSequence",
      "(DIP_SEQUENCE IS NULL OR DIP_SEQUENCE > ?)" ) // GREATERTHANORNULL

         .addOrderBy( "DipSequenceasc", "DIP_SEQUENCE ASC" ) // ORDER ASCENDING

         .addOrderBy( "DipSequencedesc", "DIP_SEQUENCE DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalDipRuleRef", "DIP_RULE_REF = ?" ) // EQUAL

         .addFilterBy( "notequalDipRuleRef", "DIP_RULE_REF != ?" ) // NOTEQUAL

         .addFilterBy( "nullDipRuleRef", "DIP_RULE_REF IS NULL" ) // IS NULL

         .addFilterBy( "notnullDipRuleRef", "DIP_RULE_REF IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanDipRuleRef", "DIP_RULE_REF < ?" ) // LESS THAN

         .addFilterBy( "greaterthanDipRuleRef", "DIP_RULE_REF > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalDipRuleRef", "DIP_RULE_REF <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalDipRuleRef", "DIP_RULE_REF >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "filterByDipRuleRefMatch", "DIP_RULE_REF LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "betweenDipRuleRef", "DIP_RULE_REF BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullDipRuleRef",
      "(DIP_RULE_REF IS NULL OR DIP_RULE_REF = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullDipRuleRef",
      "(DIP_RULE_REF IS NULL OR DIP_RULE_REF < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullDipRuleRef",
      "(DIP_RULE_REF IS NULL OR DIP_RULE_REF > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INDipRuleRef", "DIP_RULE_REF IN ( ? )" ) // IN

         .addFilterBy( "NOTINDipRuleRef", "DIP_RULE_REF NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "DipRuleRefasc", "DIP_RULE_REF ASC" ) // ORDER ASCENDING

         .addOrderBy( "DipRuleRefdesc", "DIP_RULE_REF DESC" ) // ORDER DESCENDING
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
      dml = new DipDiscountPlanDMLFactory(  );
    }

    return dml;
  }
}
