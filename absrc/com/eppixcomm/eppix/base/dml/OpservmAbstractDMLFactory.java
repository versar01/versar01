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
 * This is the DMLFactory for Opservm.
 *
 * @version $Revision: 1.1 $
 * @author $Author$
 * @since $jdk$
 */
public class OpservmAbstractDMLFactory
  extends BaseDMLFactory {
  //~ Static variables/initializers //////////////////////////////////////////

  /** The DMLFactory singleton */
  private static DMLFactory dml = null;

  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new OpservmAbstractDMLFactory object.
   *
   * @throws DMLException DOCUMENT ME!
   */
  protected OpservmAbstractDMLFactory(  )
    throws DMLException {
    ;

    DMLTable table = defTable( "Opservm", // dmlName
        "blo.OpservmDMO", // dmoName
        "OPSERVM", // tableName
        18, // numColumns
        "PRODUCT, DESCRIPTION, LONG_DESCRIPTION, UNIT_OF_SALE, VAT_CATEGORY, PROD_DISC_CODE, NOMINAL_CATEGORY, PRODUCT_GROUP_A, PRODUCT_GROUP_B"
        + ", PRODUCT_GROUP_C, LIST_PRICE, COST, WEIGHT, UNIT_GROUP, VAT_INCLUSIVE_FLAG, UNIT_QTY_PER_PRICE, VAT_TYPE, STAGE_CATEGORY", // columnList
        "PRODUCT", //primaryKey
        "" // versionCol     
      , false, // generatedKey
        "PRODUCT, DESCRIPTION, LONG_DESCRIPTION, UNIT_OF_SALE, VAT_CATEGORY, PROD_DISC_CODE, NOMINAL_CATEGORY, PRODUCT_GROUP_A, PRODUCT_GROUP_B"
        + ", PRODUCT_GROUP_C, LIST_PRICE, COST, WEIGHT, UNIT_GROUP, VAT_INCLUSIVE_FLAG, UNIT_QTY_PER_PRICE, VAT_TYPE, STAGE_CATEGORY",
        "", "",
        new String[] {
          "PRODUCT", "DESCRIPTION", "LONG_DESCRIPTION", "UNIT_OF_SALE",
          "VAT_CATEGORY", "PROD_DISC_CODE", "NOMINAL_CATEGORY",
          "PRODUCT_GROUP_A", "PRODUCT_GROUP_B", "PRODUCT_GROUP_C",
          "LIST_PRICE", "COST", "WEIGHT", "UNIT_GROUP", "VAT_INCLUSIVE_FLAG",
          "UNIT_QTY_PER_PRICE", "VAT_TYPE", "STAGE_CATEGORY"
        } );

    table.addFilterBy( "equalProduct", /* PK attribute */
      "PRODUCT = ?" )
         .addFilterBy( "filterByProductMatch", "PRODUCT LIKE ?" )
         .addFilterBy( "INProduct", "PRODUCT IN ( ? )" ) // IN

         .addFilterBy( "NOTINProduct", "PRODUCT NOT IN ( ? )" ) // NOT IN

         .addFilterBy( "notequalProduct", "PRODUCT != ?" ) // NOTEQUAL

         .addFilterBy( "nullProduct",
      "(PRODUCT IS NULL OR LENGTH(PRODUCT) IS NULL OR LENGTH(PRODUCT) = 0)" ) // IS NULL

         .addFilterBy( "notnullProduct", "PRODUCT IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanProduct", "PRODUCT < ?" ) // LESS THAN

         .addFilterBy( "greaterthanProduct", "PRODUCT > ?" ) // GREATER THAN

         .addFilterBy( "filterByProductMatch", "PRODUCT LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullProduct",
      "(PRODUCT = ? OR PRODUCT IS NULL)" ) // EQUALORNULL
                                           // TODO : we may need to wrap this with a TRIM() 

         .addOrderBy( "Productasc", "PRODUCT ASC" ) // ORDER ASCENDING

         .addOrderBy( "Productdesc", "PRODUCT DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalDescription", "DESCRIPTION = ?" ) // EQUAL

         .addFilterBy( "notequalDescription", "DESCRIPTION != ?" ) // NOTEQUAL

         .addFilterBy( "nullDescription",
      "(DESCRIPTION IS NULL OR LENGTH(DESCRIPTION) IS NULL OR LENGTH(DESCRIPTION) = 0)" ) // IS NULL

         .addFilterBy( "notnullDescription", "DESCRIPTION IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanDescription", "DESCRIPTION < ?" ) // LESS THAN

         .addFilterBy( "greaterthanDescription", "DESCRIPTION > ?" ) // GREATER THAN

         .addFilterBy( "filterByDescriptionMatch", "DESCRIPTION LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullDescription",
      "(DESCRIPTION = ? OR DESCRIPTION IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INDescription", "DESCRIPTION IN ( ? )" ) // IN

         .addFilterBy( "NOTINDescription", "DESCRIPTION NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "Descriptionasc", "DESCRIPTION ASC" ) // ORDER ASCENDING

         .addOrderBy( "Descriptiondesc", "DESCRIPTION DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalLongDescription", "LONG_DESCRIPTION = ?" ) // EQUAL

         .addFilterBy( "notequalLongDescription", "LONG_DESCRIPTION != ?" ) // NOTEQUAL

         .addFilterBy( "nullLongDescription",
      "(LONG_DESCRIPTION IS NULL OR LENGTH(LONG_DESCRIPTION) IS NULL OR LENGTH(LONG_DESCRIPTION) = 0)" ) // IS NULL

         .addFilterBy( "notnullLongDescription",
      "LONG_DESCRIPTION IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanLongDescription", "LONG_DESCRIPTION < ?" ) // LESS THAN

         .addFilterBy( "greaterthanLongDescription", "LONG_DESCRIPTION > ?" ) // GREATER THAN

         .addFilterBy( "filterByLongDescriptionMatch",
      "LONG_DESCRIPTION LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullLongDescription",
      "(LONG_DESCRIPTION = ? OR LONG_DESCRIPTION IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INLongDescription", "LONG_DESCRIPTION IN ( ? )" ) // IN

         .addFilterBy( "NOTINLongDescription", "LONG_DESCRIPTION NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "LongDescriptionasc", "LONG_DESCRIPTION ASC" ) // ORDER ASCENDING

         .addOrderBy( "LongDescriptiondesc", "LONG_DESCRIPTION DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalUnitOfSale", "UNIT_OF_SALE = ?" ) // EQUAL

         .addFilterBy( "notequalUnitOfSale", "UNIT_OF_SALE != ?" ) // NOTEQUAL

         .addFilterBy( "nullUnitOfSale",
      "(UNIT_OF_SALE IS NULL OR LENGTH(UNIT_OF_SALE) IS NULL OR LENGTH(UNIT_OF_SALE) = 0)" ) // IS NULL

         .addFilterBy( "notnullUnitOfSale", "UNIT_OF_SALE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanUnitOfSale", "UNIT_OF_SALE < ?" ) // LESS THAN

         .addFilterBy( "greaterthanUnitOfSale", "UNIT_OF_SALE > ?" ) // GREATER THAN

         .addFilterBy( "filterByUnitOfSaleMatch", "UNIT_OF_SALE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullUnitOfSale",
      "(UNIT_OF_SALE = ? OR UNIT_OF_SALE IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INUnitOfSale", "UNIT_OF_SALE IN ( ? )" ) // IN

         .addFilterBy( "NOTINUnitOfSale", "UNIT_OF_SALE NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "UnitOfSaleasc", "UNIT_OF_SALE ASC" ) // ORDER ASCENDING

         .addOrderBy( "UnitOfSaledesc", "UNIT_OF_SALE DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalVatCategory", "VAT_CATEGORY = ?" ) // EQUAL

         .addFilterBy( "notequalVatCategory", "VAT_CATEGORY != ?" ) // NOTEQUAL

         .addFilterBy( "nullVatCategory",
      "(VAT_CATEGORY IS NULL OR LENGTH(VAT_CATEGORY) IS NULL OR LENGTH(VAT_CATEGORY) = 0)" ) // IS NULL

         .addFilterBy( "notnullVatCategory", "VAT_CATEGORY IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanVatCategory", "VAT_CATEGORY < ?" ) // LESS THAN

         .addFilterBy( "greaterthanVatCategory", "VAT_CATEGORY > ?" ) // GREATER THAN

         .addFilterBy( "filterByVatCategoryMatch", "VAT_CATEGORY LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullVatCategory",
      "(VAT_CATEGORY = ? OR VAT_CATEGORY IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INVatCategory", "VAT_CATEGORY IN ( ? )" ) // IN

         .addFilterBy( "NOTINVatCategory", "VAT_CATEGORY NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "VatCategoryasc", "VAT_CATEGORY ASC" ) // ORDER ASCENDING

         .addOrderBy( "VatCategorydesc", "VAT_CATEGORY DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalProdDiscCode", "PROD_DISC_CODE = ?" ) // EQUAL

         .addFilterBy( "notequalProdDiscCode", "PROD_DISC_CODE != ?" ) // NOTEQUAL

         .addFilterBy( "nullProdDiscCode",
      "(PROD_DISC_CODE IS NULL OR LENGTH(PROD_DISC_CODE) IS NULL OR LENGTH(PROD_DISC_CODE) = 0)" ) // IS NULL

         .addFilterBy( "notnullProdDiscCode", "PROD_DISC_CODE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanProdDiscCode", "PROD_DISC_CODE < ?" ) // LESS THAN

         .addFilterBy( "greaterthanProdDiscCode", "PROD_DISC_CODE > ?" ) // GREATER THAN

         .addFilterBy( "filterByProdDiscCodeMatch", "PROD_DISC_CODE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullProdDiscCode",
      "(PROD_DISC_CODE = ? OR PROD_DISC_CODE IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INProdDiscCode", "PROD_DISC_CODE IN ( ? )" ) // IN

         .addFilterBy( "NOTINProdDiscCode", "PROD_DISC_CODE NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "ProdDiscCodeasc", "PROD_DISC_CODE ASC" ) // ORDER ASCENDING

         .addOrderBy( "ProdDiscCodedesc", "PROD_DISC_CODE DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalNominalCategory", "NOMINAL_CATEGORY = ?" ) // EQUAL

         .addFilterBy( "notequalNominalCategory", "NOMINAL_CATEGORY != ?" ) // NOTEQUAL

         .addFilterBy( "nullNominalCategory",
      "(NOMINAL_CATEGORY IS NULL OR LENGTH(NOMINAL_CATEGORY) IS NULL OR LENGTH(NOMINAL_CATEGORY) = 0)" ) // IS NULL

         .addFilterBy( "notnullNominalCategory",
      "NOMINAL_CATEGORY IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanNominalCategory", "NOMINAL_CATEGORY < ?" ) // LESS THAN

         .addFilterBy( "greaterthanNominalCategory", "NOMINAL_CATEGORY > ?" ) // GREATER THAN

         .addFilterBy( "filterByNominalCategoryMatch",
      "NOMINAL_CATEGORY LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullNominalCategory",
      "(NOMINAL_CATEGORY = ? OR NOMINAL_CATEGORY IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INNominalCategory", "NOMINAL_CATEGORY IN ( ? )" ) // IN

         .addFilterBy( "NOTINNominalCategory", "NOMINAL_CATEGORY NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "NominalCategoryasc", "NOMINAL_CATEGORY ASC" ) // ORDER ASCENDING

         .addOrderBy( "NominalCategorydesc", "NOMINAL_CATEGORY DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalProductGroupA", "PRODUCT_GROUP_A = ?" ) // EQUAL

         .addFilterBy( "notequalProductGroupA", "PRODUCT_GROUP_A != ?" ) // NOTEQUAL

         .addFilterBy( "nullProductGroupA",
      "(PRODUCT_GROUP_A IS NULL OR LENGTH(PRODUCT_GROUP_A) IS NULL OR LENGTH(PRODUCT_GROUP_A) = 0)" ) // IS NULL

         .addFilterBy( "notnullProductGroupA", "PRODUCT_GROUP_A IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanProductGroupA", "PRODUCT_GROUP_A < ?" ) // LESS THAN

         .addFilterBy( "greaterthanProductGroupA", "PRODUCT_GROUP_A > ?" ) // GREATER THAN

         .addFilterBy( "filterByProductGroupAMatch", "PRODUCT_GROUP_A LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullProductGroupA",
      "(PRODUCT_GROUP_A = ? OR PRODUCT_GROUP_A IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INProductGroupA", "PRODUCT_GROUP_A IN ( ? )" ) // IN

         .addFilterBy( "NOTINProductGroupA", "PRODUCT_GROUP_A NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "ProductGroupAasc", "PRODUCT_GROUP_A ASC" ) // ORDER ASCENDING

         .addOrderBy( "ProductGroupAdesc", "PRODUCT_GROUP_A DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalProductGroupB", "PRODUCT_GROUP_B = ?" ) // EQUAL

         .addFilterBy( "notequalProductGroupB", "PRODUCT_GROUP_B != ?" ) // NOTEQUAL

         .addFilterBy( "nullProductGroupB",
      "(PRODUCT_GROUP_B IS NULL OR LENGTH(PRODUCT_GROUP_B) IS NULL OR LENGTH(PRODUCT_GROUP_B) = 0)" ) // IS NULL

         .addFilterBy( "notnullProductGroupB", "PRODUCT_GROUP_B IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanProductGroupB", "PRODUCT_GROUP_B < ?" ) // LESS THAN

         .addFilterBy( "greaterthanProductGroupB", "PRODUCT_GROUP_B > ?" ) // GREATER THAN

         .addFilterBy( "filterByProductGroupBMatch", "PRODUCT_GROUP_B LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullProductGroupB",
      "(PRODUCT_GROUP_B = ? OR PRODUCT_GROUP_B IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INProductGroupB", "PRODUCT_GROUP_B IN ( ? )" ) // IN

         .addFilterBy( "NOTINProductGroupB", "PRODUCT_GROUP_B NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "ProductGroupBasc", "PRODUCT_GROUP_B ASC" ) // ORDER ASCENDING

         .addOrderBy( "ProductGroupBdesc", "PRODUCT_GROUP_B DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalProductGroupC", "PRODUCT_GROUP_C = ?" ) // EQUAL

         .addFilterBy( "notequalProductGroupC", "PRODUCT_GROUP_C != ?" ) // NOTEQUAL

         .addFilterBy( "nullProductGroupC",
      "(PRODUCT_GROUP_C IS NULL OR LENGTH(PRODUCT_GROUP_C) IS NULL OR LENGTH(PRODUCT_GROUP_C) = 0)" ) // IS NULL

         .addFilterBy( "notnullProductGroupC", "PRODUCT_GROUP_C IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanProductGroupC", "PRODUCT_GROUP_C < ?" ) // LESS THAN

         .addFilterBy( "greaterthanProductGroupC", "PRODUCT_GROUP_C > ?" ) // GREATER THAN

         .addFilterBy( "filterByProductGroupCMatch", "PRODUCT_GROUP_C LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullProductGroupC",
      "(PRODUCT_GROUP_C = ? OR PRODUCT_GROUP_C IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INProductGroupC", "PRODUCT_GROUP_C IN ( ? )" ) // IN

         .addFilterBy( "NOTINProductGroupC", "PRODUCT_GROUP_C NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "ProductGroupCasc", "PRODUCT_GROUP_C ASC" ) // ORDER ASCENDING

         .addOrderBy( "ProductGroupCdesc", "PRODUCT_GROUP_C DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalListPrice", "LIST_PRICE = ?" ) // EQUAL

         .addFilterBy( "notequalListPrice", "LIST_PRICE != ?" ) // NOTEQUAL

         .addFilterBy( "nullListPrice", "LIST_PRICE IS NULL" ) // IS NULL

         .addFilterBy( "notnullListPrice", "LIST_PRICE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanListPrice", "LIST_PRICE < ?" ) // LESS THAN

         .addFilterBy( "greaterthanListPrice", "LIST_PRICE > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalListPrice", "LIST_PRICE <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalListPrice", "LIST_PRICE >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "filterByListPriceMatch", "LIST_PRICE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "betweenListPrice", "LIST_PRICE BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullListPrice",
      "(LIST_PRICE IS NULL OR LIST_PRICE = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullListPrice",
      "(LIST_PRICE IS NULL OR LIST_PRICE < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullListPrice",
      "(LIST_PRICE IS NULL OR LIST_PRICE > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INListPrice", "LIST_PRICE IN ( ? )" ) // IN

         .addFilterBy( "NOTINListPrice", "LIST_PRICE NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "ListPriceasc", "LIST_PRICE ASC" ) // ORDER ASCENDING

         .addOrderBy( "ListPricedesc", "LIST_PRICE DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalCost", "COST = ?" ) // EQUAL

         .addFilterBy( "notequalCost", "COST != ?" ) // NOTEQUAL

         .addFilterBy( "nullCost", "COST IS NULL" ) // IS NULL

         .addFilterBy( "notnullCost", "COST IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanCost", "COST < ?" ) // LESS THAN

         .addFilterBy( "greaterthanCost", "COST > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalCost", "COST <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalCost", "COST >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "filterByCostMatch", "COST LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "betweenCost", "COST BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullCost", "(COST IS NULL OR COST = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullCost", "(COST IS NULL OR COST < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullCost", "(COST IS NULL OR COST > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INCost", "COST IN ( ? )" ) // IN

         .addFilterBy( "NOTINCost", "COST NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "Costasc", "COST ASC" ) // ORDER ASCENDING

         .addOrderBy( "Costdesc", "COST DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalWeight", "WEIGHT = ?" ) // EQUAL

         .addFilterBy( "notequalWeight", "WEIGHT != ?" ) // NOTEQUAL

         .addFilterBy( "nullWeight", "WEIGHT IS NULL" ) // IS NULL

         .addFilterBy( "notnullWeight", "WEIGHT IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanWeight", "WEIGHT < ?" ) // LESS THAN

         .addFilterBy( "greaterthanWeight", "WEIGHT > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalWeight", "WEIGHT <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalWeight", "WEIGHT >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "filterByWeightMatch", "WEIGHT LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "betweenWeight", "WEIGHT BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullWeight", "(WEIGHT IS NULL OR WEIGHT = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullWeight",
      "(WEIGHT IS NULL OR WEIGHT < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullWeight",
      "(WEIGHT IS NULL OR WEIGHT > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INWeight", "WEIGHT IN ( ? )" ) // IN

         .addFilterBy( "NOTINWeight", "WEIGHT NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "Weightasc", "WEIGHT ASC" ) // ORDER ASCENDING

         .addOrderBy( "Weightdesc", "WEIGHT DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalUnitGroup", "UNIT_GROUP = ?" ) // EQUAL

         .addFilterBy( "notequalUnitGroup", "UNIT_GROUP != ?" ) // NOTEQUAL

         .addFilterBy( "nullUnitGroup",
      "(UNIT_GROUP IS NULL OR LENGTH(UNIT_GROUP) IS NULL OR LENGTH(UNIT_GROUP) = 0)" ) // IS NULL

         .addFilterBy( "notnullUnitGroup", "UNIT_GROUP IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanUnitGroup", "UNIT_GROUP < ?" ) // LESS THAN

         .addFilterBy( "greaterthanUnitGroup", "UNIT_GROUP > ?" ) // GREATER THAN

         .addFilterBy( "filterByUnitGroupMatch", "UNIT_GROUP LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullUnitGroup",
      "(UNIT_GROUP = ? OR UNIT_GROUP IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INUnitGroup", "UNIT_GROUP IN ( ? )" ) // IN

         .addFilterBy( "NOTINUnitGroup", "UNIT_GROUP NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "UnitGroupasc", "UNIT_GROUP ASC" ) // ORDER ASCENDING

         .addOrderBy( "UnitGroupdesc", "UNIT_GROUP DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalVatInclusiveFlag", "VAT_INCLUSIVE_FLAG = ?" ) // EQUAL

         .addFilterBy( "notequalVatInclusiveFlag", "VAT_INCLUSIVE_FLAG != ?" ) // NOTEQUAL

         .addFilterBy( "nullVatInclusiveFlag",
      "(VAT_INCLUSIVE_FLAG IS NULL OR LENGTH(VAT_INCLUSIVE_FLAG) IS NULL OR LENGTH(VAT_INCLUSIVE_FLAG) = 0)" ) // IS NULL

         .addFilterBy( "notnullVatInclusiveFlag",
      "VAT_INCLUSIVE_FLAG IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanVatInclusiveFlag", "VAT_INCLUSIVE_FLAG < ?" ) // LESS THAN

         .addFilterBy( "greaterthanVatInclusiveFlag", "VAT_INCLUSIVE_FLAG > ?" ) // GREATER THAN

         .addFilterBy( "filterByVatInclusiveFlagMatch",
      "VAT_INCLUSIVE_FLAG LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullVatInclusiveFlag",
      "(VAT_INCLUSIVE_FLAG = ? OR VAT_INCLUSIVE_FLAG IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INVatInclusiveFlag", "VAT_INCLUSIVE_FLAG IN ( ? )" ) // IN

         .addFilterBy( "NOTINVatInclusiveFlag",
      "VAT_INCLUSIVE_FLAG NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "VatInclusiveFlagasc", "VAT_INCLUSIVE_FLAG ASC" ) // ORDER ASCENDING

         .addOrderBy( "VatInclusiveFlagdesc", "VAT_INCLUSIVE_FLAG DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalUnitQtyPerPrice", "UNIT_QTY_PER_PRICE = ?" ) // EQUAL

         .addFilterBy( "notequalUnitQtyPerPrice", "UNIT_QTY_PER_PRICE != ?" ) // NOTEQUAL

         .addFilterBy( "nullUnitQtyPerPrice", "UNIT_QTY_PER_PRICE IS NULL" ) // IS NULL

         .addFilterBy( "notnullUnitQtyPerPrice",
      "UNIT_QTY_PER_PRICE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanUnitQtyPerPrice", "UNIT_QTY_PER_PRICE < ?" ) // LESS THAN

         .addFilterBy( "greaterthanUnitQtyPerPrice", "UNIT_QTY_PER_PRICE > ?" ) // GREATER THAN

         .addFilterBy( "lessthanorequalUnitQtyPerPrice",
      "UNIT_QTY_PER_PRICE <= ?" ) // LESS THAN OR EQUAL

         .addFilterBy( "greaterthanorequalUnitQtyPerPrice",
      "UNIT_QTY_PER_PRICE >= ?" ) // GREATER THAN OR EQUAL

         .addFilterBy( "filterByUnitQtyPerPriceMatch",
      "UNIT_QTY_PER_PRICE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "betweenUnitQtyPerPrice",
      "UNIT_QTY_PER_PRICE BETWEEN ? AND ?" ) // BETWEEN

         .addFilterBy( "equalornullUnitQtyPerPrice",
      "(UNIT_QTY_PER_PRICE IS NULL OR UNIT_QTY_PER_PRICE = ?)" ) // EQUALORNULL

         .addFilterBy( "lessthanornullUnitQtyPerPrice",
      "(UNIT_QTY_PER_PRICE IS NULL OR UNIT_QTY_PER_PRICE < ?)" ) // LESSTHANORNULL

         .addFilterBy( "greaterthanornullUnitQtyPerPrice",
      "(UNIT_QTY_PER_PRICE IS NULL OR UNIT_QTY_PER_PRICE > ?)" ) // GREATERTHANORNULL

         .addFilterBy( "INUnitQtyPerPrice", "UNIT_QTY_PER_PRICE IN ( ? )" ) // IN

         .addFilterBy( "NOTINUnitQtyPerPrice",
      "UNIT_QTY_PER_PRICE NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "UnitQtyPerPriceasc", "UNIT_QTY_PER_PRICE ASC" ) // ORDER ASCENDING

         .addOrderBy( "UnitQtyPerPricedesc", "UNIT_QTY_PER_PRICE DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalVatType", "VAT_TYPE = ?" ) // EQUAL

         .addFilterBy( "notequalVatType", "VAT_TYPE != ?" ) // NOTEQUAL

         .addFilterBy( "nullVatType",
      "(VAT_TYPE IS NULL OR LENGTH(VAT_TYPE) IS NULL OR LENGTH(VAT_TYPE) = 0)" ) // IS NULL

         .addFilterBy( "notnullVatType", "VAT_TYPE IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanVatType", "VAT_TYPE < ?" ) // LESS THAN

         .addFilterBy( "greaterthanVatType", "VAT_TYPE > ?" ) // GREATER THAN

         .addFilterBy( "filterByVatTypeMatch", "VAT_TYPE LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullVatType",
      "(VAT_TYPE = ? OR VAT_TYPE IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INVatType", "VAT_TYPE IN ( ? )" ) // IN

         .addFilterBy( "NOTINVatType", "VAT_TYPE NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "VatTypeasc", "VAT_TYPE ASC" ) // ORDER ASCENDING

         .addOrderBy( "VatTypedesc", "VAT_TYPE DESC" ) // ORDER DESCENDING
    ;

    table.addFilterBy( "equalStageCategory", "STAGE_CATEGORY = ?" ) // EQUAL

         .addFilterBy( "notequalStageCategory", "STAGE_CATEGORY != ?" ) // NOTEQUAL

         .addFilterBy( "nullStageCategory",
      "(STAGE_CATEGORY IS NULL OR LENGTH(STAGE_CATEGORY) IS NULL OR LENGTH(STAGE_CATEGORY) = 0)" ) // IS NULL

         .addFilterBy( "notnullStageCategory", "STAGE_CATEGORY IS NOT NULL" ) // IS NOT NULL

         .addFilterBy( "lessthanStageCategory", "STAGE_CATEGORY < ?" ) // LESS THAN

         .addFilterBy( "greaterthanStageCategory", "STAGE_CATEGORY > ?" ) // GREATER THAN

         .addFilterBy( "filterByStageCategoryMatch", "STAGE_CATEGORY LIKE ?" ) // LIKE, BEGINSWITH, ENDSWITH, ANY

         .addFilterBy( "equalornullStageCategory",
      "(STAGE_CATEGORY = ? OR STAGE_CATEGORY IS NULL)" ) // EQUALORNULL

         .addFilterBy( "INStageCategory", "STAGE_CATEGORY IN ( ? )" ) // IN

         .addFilterBy( "NOTINStageCategory", "STAGE_CATEGORY NOT IN ( ? )" ) // NOT IN

         .addOrderBy( "StageCategoryasc", "STAGE_CATEGORY ASC" ) // ORDER ASCENDING

         .addOrderBy( "StageCategorydesc", "STAGE_CATEGORY DESC" ) // ORDER DESCENDING
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
      dml = new OpservmDMLFactory(  );
    }

    return dml;
  }
}
