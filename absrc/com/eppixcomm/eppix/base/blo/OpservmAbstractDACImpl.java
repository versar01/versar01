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
package com.eppixcomm.eppix.base.blo;

import com.eppixcomm.eppix.common.core.UserContext; // always required for this sort of class
import com.eppixcomm.eppix.common.data.DAC; // always required for this sort of class
import com.eppixcomm.eppix.common.data.DAO; // always required for this sort of class
import com.eppixcomm.eppix.common.data.DAOArgs; // always required for this sort of class
import com.eppixcomm.eppix.common.data.DAOIterator;
import com.eppixcomm.eppix.common.data.DAOParamQueryArgs; // always required for this sort of class
import com.eppixcomm.eppix.common.data.DAOThrower; // always required for this sort of class
import com.eppixcomm.eppix.common.data.DMO; // always required for this sort of class
import com.eppixcomm.eppix.common.util.FilterPart;
import com.eppixcomm.eppix.common.util.QueryFilter;
import com.eppixcomm.eppix.common.data.DTOList; // always required for this sort of class
import com.eppixcomm.eppix.common.data.DTOListState; // always required for this sort of class
import com.eppixcomm.eppix.base.error.EPPIXObjectBusyException; // always required for this sort of class
import com.eppixcomm.eppix.base.error.EPPIXObjectExpiredException; // always required for this sort of class
import com.eppixcomm.eppix.base.error.EPPIXObjectNotFoundException; // always required for this sort of class
import com.eppixcomm.eppix.base.error.EPPIXSeriousException; // always required for this sort of class
import com.eppixcomm.eppix.base.error.EPPIXUnexpectedException; // always required for this sort of class
import com.eppixcomm.eppix.common.util.Date; // always required for this sort of class
import com.eppixcomm.eppix.common.util.DateTime; // always required for this sort of class
import com.eppixcomm.eppix.common.util.Time;

import org.apache.log4j.Logger; // always required for this sort of class

import java.math.BigDecimal; // always required for this sort of class

import java.util.Iterator;
import java.util.List;

/**
 * This is the standard implementation of the Data Access Controller for the
 * Opservm Business Object.
 *
 * @version $Revision: 1.2 $
 * @author $Author$
 * @since $jdk$
 */
public class OpservmAbstractDACImpl
  extends DAC
  implements OpservmAbstractDAC {
  //~ Static variables/initializers //////////////////////////////////////////

  /** Error handler/logger. */
  static DAOThrower thrower = DAOThrower.getDAOThrower( OpservmAbstractDACImpl.class );

  //~ Instance variables /////////////////////////////////////////////////////

  /** DOCUMENT ME! */
  Logger logger = thrower.getLogger(  );

  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new OpservmDACImpl object.
   *
   * @param dao Data Access Object.
   * @param defaultLanguageCode the working language of the user, dictates
   *        which language specific descriptions are retrieved.
   */
  protected OpservmAbstractDACImpl( 
    UserContext userContext,
    DAO         dao ) {
    super( userContext, dao, thrower );
  }
  
  public OpservmAbstractDACImpl(DAO  dao ) {
		    super( dao, thrower );
  }  

  //~ Methods ////////////////////////////////////////////////////////////////

  /**
   * Retrieves a Opservm Data Model Object
   *
   * @return a populated Opservm Data Model Object or null if not found.
   *
   * @throws EPPIXSeriousException
   */
  public OpservmDMO get( OpservmDMO opservmDMO )
    throws EPPIXSeriousException {
    logger.debug( "get( OpservmDMO )" );

    thrower.ifParameterMissing( "OpservmDMO", opservmDMO );

    return (OpservmDMO) dao.get( opservmDMO );
  }

  /**
   * Creates the Opservm object in the database.
   *
   * @param OpservmDMO opservmDMO
   *
   * @throws EPPIXSeriousException
   */
  public void create( OpservmDMO opservmDMO )
    throws EPPIXSeriousException {
    logger.debug( "create( opservmDMO )" );
    thrower.ifParameterMissing( "OpservmDMO", opservmDMO );

    dao.insert( opservmDMO );
  }

  /**
   * Locks and retrieves the Opservm object from the database.
   *
   * @param aOpservm Opservm object
   *
   * @return a populated Opservm object or null if not found.
   *
   * @throws EPPIXSeriousException
   */
  public OpservmDMO lock( OpservmDMO aOpservmDMO )
    throws EPPIXSeriousException, EPPIXObjectBusyException {
    logger.debug( "lock( aOpservmDMO )" );

    thrower.ifParameterMissing( "aOpservmDMO", aOpservmDMO );

    OpservmDMO lockedOpservmDMO = null;

    //
    // Lock the base table on its primary key.
    //
    lockedOpservmDMO = (OpservmDMO) dao.lock( "Opservm",
        "filterByPrimaryKey",
        new DAOArgs( 1 ).arg( aOpservmDMO.getProduct(  ) ) );

    return lockedOpservmDMO;
  }

  /**
   * Modifies the Opservm object in the database.
   *
   * @param OpservmDMO Opservm object
   *
   * @throws EPPIXSeriousException
   * @throws EPPIXObjectExpiredException
   * @throws EPPIXObjectNotFoundException
   */
  public void modify( OpservmDMO opservmDMO )
    throws EPPIXSeriousException, EPPIXObjectExpiredException,
      EPPIXObjectNotFoundException {
    logger.debug( "modify( aOpservmDMO )" );

    thrower.ifParameterMissing( "aOpservmDMO", opservmDMO );

    thrower.ifParameterMissing( "OpservmDMO.product",
      opservmDMO.getProduct(  ) );

    dao.update( opservmDMO );
  }

  /**
  * Modifies the Opservm object using the specified filter in the database.
  *
  * @param filter object
  *
  * @throws EPPIXSeriousException
  * @throws EPPIXObjectExpiredException
  * @throws EPPIXObjectNotFoundException
  */
  public void modify( QueryFilter filter )
    throws EPPIXSeriousException, EPPIXObjectExpiredException,
      EPPIXObjectNotFoundException {
    logger.debug( "modify( filter )" );

    thrower.ifParameterMissing( "filter", filter );

    dao.updateCustom( new OpservmDMO(  ), filterQueryArgs( filter, null ) );
  }

  /**
   * Deletes the Opservm object from the database.
   *
   * @param OpservmDMO Opservm object
   *
   * @throws EPPIXSeriousException
   * @throws EPPIXObjectNotFoundException
   * @throws EPPIXObjectExpiredException
   */
  public void delete( OpservmDMO opservmDMO )
    throws EPPIXSeriousException, EPPIXObjectNotFoundException,
      EPPIXObjectExpiredException {
    logger.debug( "delete( OpservmDMO )" );

    thrower.ifParameterMissing( "OpservmDMO", opservmDMO );

    thrower.ifParameterMissing( "OpservmDMO.product",
      opservmDMO.getProduct(  ) );

    dao.delete( opservmDMO );
  }

  /**
   * Deletes the Opservm object from the database.
   *
   * @param QueryFilterfilter object
   *
   * @throws EPPIXSeriousException
   * @throws EPPIXObjectNotFoundException
   * @throws EPPIXObjectExpiredException
   */
  public void delete( QueryFilter filter )
    throws EPPIXSeriousException, EPPIXObjectNotFoundException,
      EPPIXObjectExpiredException {
    logger.debug( "delete( filter )" );

    thrower.ifParameterMissing( "filter", filter );

    DAOParamQueryArgs args = filterQueryArgs( filter, null );

    dao.delete( "Opservm", args.getFilterBy(  ), args );
  }

  /**
  * Return true if a Opservm object exists.
  *
  * @param OpservmDMO OpservmDMO
  *
  * @return true if the Opservm object exists.
  *
  * @throws EPPIXSeriousException
  */
  public boolean exists( OpservmDMO OpservmDMO )
    throws EPPIXSeriousException {
    logger.debug( "exists( OpservmDMO)" );

    return dao.exists( "Opservm", "filterByPrimaryKey",
      new DAOArgs( 1 ).arg( OpservmDMO.getProduct(  ) ) );
  }

  /**
    * Return true if a Opservm object exists.
    *
    * @param filter
    *
    * @return true if the Opservm object exists.
    *
    * @throws EPPIXSeriousException
    */
  public boolean exists( QueryFilter filter )
    throws EPPIXSeriousException {
    logger.debug( "exists( filter )" );

    return dao.exists( filterQueryArgs( filter, null ) );
  }

  /**
   * Return a list of location objects matching the passed in values. A
   * partial match is performed on the description argument. If no language
   * Code is passed inside the locationDMO then the language passed in the
   * EppixLocale object is used.
   *
   * @param state previous state of the list.
   * @param locationDMO Opservm Data Model Object
   *
   * @return DTOList of Opservm Data Model Objects.
   *
   * @throws EPPIXSeriousException
   */
  public DTOList getList( 
    DTOListState state,
    OpservmDMO   opservmDMO )
    throws EPPIXSeriousException {
    logger.debug( "getList( state, opservmDMO )" );

    return dao.getListAbs( state, paramQueryArgs( opservmDMO ) );
  }

  /**
   * Constructs parameterised query arguments.
   *
   * @param $(dataObjectNameLowerCamel} OpservmDMO object.
   */
  protected DAOParamQueryArgs paramQueryArgs( OpservmDMO opservmDMO ) {
    logger.debug( "paramQueryArgs( opservmDMO)" );

    DAOParamQueryArgs queryArgs = new DAOParamQueryArgs( "Opservm", 18 * 2 );

    if ( opservmDMO != null ) {
      // primary key filters...
      String product = opservmDMO.getProduct(  );

      if ( !DMO.isNull( product ) ) {
        queryArgs.andFilterBy( "ProductMatch" )
                 .arg( product + dao.wildcardForAnySequence(  ) );
      }

      // define more filters...
      String description = opservmDMO.getDescription(  );

      if ( !DMO.isNull( description ) ) {
        queryArgs.andFilterBy( "DescriptionMatch" )
                 .arg( description + dao.wildcardForAnySequence(  ) );
      }

      String longDescription = opservmDMO.getLongDescription(  );

      if ( !DMO.isNull( longDescription ) ) {
        queryArgs.andFilterBy( "LongDescriptionMatch" )
                 .arg( longDescription + dao.wildcardForAnySequence(  ) );
      }

      String unitOfSale = opservmDMO.getUnitOfSale(  );

      if ( !DMO.isNull( unitOfSale ) ) {
        queryArgs.andFilterBy( "UnitOfSaleMatch" )
                 .arg( unitOfSale + dao.wildcardForAnySequence(  ) );
      }

      String vatCategory = opservmDMO.getVatCategory(  );

      if ( !DMO.isNull( vatCategory ) ) {
        queryArgs.andFilterBy( "VatCategoryMatch" )
                 .arg( vatCategory + dao.wildcardForAnySequence(  ) );
      }

      String prodDiscCode = opservmDMO.getProdDiscCode(  );

      if ( !DMO.isNull( prodDiscCode ) ) {
        queryArgs.andFilterBy( "ProdDiscCodeMatch" )
                 .arg( prodDiscCode + dao.wildcardForAnySequence(  ) );
      }

      String nominalCategory = opservmDMO.getNominalCategory(  );

      if ( !DMO.isNull( nominalCategory ) ) {
        queryArgs.andFilterBy( "NominalCategoryMatch" )
                 .arg( nominalCategory + dao.wildcardForAnySequence(  ) );
      }

      String productGroupA = opservmDMO.getProductGroupA(  );

      if ( !DMO.isNull( productGroupA ) ) {
        queryArgs.andFilterBy( "ProductGroupAMatch" )
                 .arg( productGroupA + dao.wildcardForAnySequence(  ) );
      }

      String productGroupB = opservmDMO.getProductGroupB(  );

      if ( !DMO.isNull( productGroupB ) ) {
        queryArgs.andFilterBy( "ProductGroupBMatch" )
                 .arg( productGroupB + dao.wildcardForAnySequence(  ) );
      }

      String productGroupC = opservmDMO.getProductGroupC(  );

      if ( !DMO.isNull( productGroupC ) ) {
        queryArgs.andFilterBy( "ProductGroupCMatch" )
                 .arg( productGroupC + dao.wildcardForAnySequence(  ) );
      }

      String unitGroup = opservmDMO.getUnitGroup(  );

      if ( !DMO.isNull( unitGroup ) ) {
        queryArgs.andFilterBy( "UnitGroupMatch" )
                 .arg( unitGroup + dao.wildcardForAnySequence(  ) );
      }

      String vatInclusiveFlag = opservmDMO.getVatInclusiveFlag(  );

      if ( !DMO.isNull( vatInclusiveFlag ) ) {
        queryArgs.andFilterBy( "VatInclusiveFlagMatch" )
                 .arg( vatInclusiveFlag + dao.wildcardForAnySequence(  ) );
      }

      String vatType = opservmDMO.getVatType(  );

      if ( !DMO.isNull( vatType ) ) {
        queryArgs.andFilterBy( "VatTypeMatch" )
                 .arg( vatType + dao.wildcardForAnySequence(  ) );
      }

      String stageCategory = opservmDMO.getStageCategory(  );

      if ( !DMO.isNull( stageCategory ) ) {
        queryArgs.andFilterBy( "StageCategoryMatch" )
                 .arg( stageCategory + dao.wildcardForAnySequence(  ) );
      }
    } else {
      // include all default languageCode filters where appropriate...
    }

    return queryArgs;
  }

  /**
   * DOCUMENT ME!
   *
   * @param state DOCUMENT ME!
   * @param filter DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   *
   * @throws EPPIXSeriousException DOCUMENT ME!
   */
  public DTOList getList( 
    DTOListState state,
    QueryFilter  filter )
    throws EPPIXSeriousException {
    logger.debug( "getList( state, filter )" );

    return dao.getListAbs( state, filterQueryArgs( filter, null ) );
  }

  /**
   * DOCUMENT ME!
   *
   * @param filter DOCUMENT ME!
   * @param dmlName DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  protected DAOParamQueryArgs filterQueryArgs( 
    QueryFilter filter,
    String      dmlName ) {
    List parts = filter.getParts(  );
    DAOParamQueryArgs queryArgs = new DAOParamQueryArgs( ( dmlName == null )
        ? "Opservm" : dmlName, parts.size(  ) );

    Iterator it = parts.iterator();
//    for ( FilterPart part : parts ) {
    while(it.hasNext()){
    	FilterPart part = (FilterPart)it.next();
      switch ( part.getIndex(  ) ) {
        case OpservmDMO.productFilter:
          part.andFilterBy( queryArgs, "Product",
            dao.wildcardForAnySequence(  ) );

          break;

        case OpservmDMO.descriptionFilter:
          part.andFilterBy( queryArgs, "Description",
            dao.wildcardForAnySequence(  ) );

          break;

        case OpservmDMO.longDescriptionFilter:
          part.andFilterBy( queryArgs, "LongDescription",
            dao.wildcardForAnySequence(  ) );

          break;

        case OpservmDMO.unitOfSaleFilter:
          part.andFilterBy( queryArgs, "UnitOfSale",
            dao.wildcardForAnySequence(  ) );

          break;

        case OpservmDMO.vatCategoryFilter:
          part.andFilterBy( queryArgs, "VatCategory",
            dao.wildcardForAnySequence(  ) );

          break;

        case OpservmDMO.prodDiscCodeFilter:
          part.andFilterBy( queryArgs, "ProdDiscCode",
            dao.wildcardForAnySequence(  ) );

          break;

        case OpservmDMO.nominalCategoryFilter:
          part.andFilterBy( queryArgs, "NominalCategory",
            dao.wildcardForAnySequence(  ) );

          break;

        case OpservmDMO.productGroupAFilter:
          part.andFilterBy( queryArgs, "ProductGroupA",
            dao.wildcardForAnySequence(  ) );

          break;

        case OpservmDMO.productGroupBFilter:
          part.andFilterBy( queryArgs, "ProductGroupB",
            dao.wildcardForAnySequence(  ) );

          break;

        case OpservmDMO.productGroupCFilter:
          part.andFilterBy( queryArgs, "ProductGroupC",
            dao.wildcardForAnySequence(  ) );

          break;

        case OpservmDMO.listPriceFilter:
          part.andFilterBy( queryArgs, "ListPrice",
            dao.wildcardForAnySequence(  ) );

          break;

        case OpservmDMO.costFilter:
          part.andFilterBy( queryArgs, "Cost", dao.wildcardForAnySequence(  ) );

          break;

        case OpservmDMO.weightFilter:
          part.andFilterBy( queryArgs, "Weight",
            dao.wildcardForAnySequence(  ) );

          break;

        case OpservmDMO.unitGroupFilter:
          part.andFilterBy( queryArgs, "UnitGroup",
            dao.wildcardForAnySequence(  ) );

          break;

        case OpservmDMO.vatInclusiveFlagFilter:
          part.andFilterBy( queryArgs, "VatInclusiveFlag",
            dao.wildcardForAnySequence(  ) );

          break;

        case OpservmDMO.unitQtyPerPriceFilter:
          part.andFilterBy( queryArgs, "UnitQtyPerPrice",
            dao.wildcardForAnySequence(  ) );

          break;

        case OpservmDMO.vatTypeFilter:
          part.andFilterBy( queryArgs, "VatType",
            dao.wildcardForAnySequence(  ) );

          break;

        case OpservmDMO.stageCategoryFilter:
          part.andFilterBy( queryArgs, "StageCategory",
            dao.wildcardForAnySequence(  ) );

          break;
      }
    }

    return queryArgs;
  }

  /**
  * Provides a DAOIterator to iterate over the list of Opservm records based
  * on the passed in Filter.
  *
  * @param filter
  * @return
  * @throws EPPIXSeriousException
  */
  public DAOIterator iterate( QueryFilter filter )
    throws EPPIXSeriousException {
    logger.debug( "iterate( filter )" );

    return dao.iterator(filterQueryArgs( filter, null ) );
  }

  /**
  * Provides a DAOIterator to iterate using a "FOR UPDATE", over the list of Opservm records based
  * on the passed in Filter.
  *
  * @param filter
  * @return
  * @throws EPPIXSeriousException
  */
  public DAOIterator iterateWithLock( QueryFilter filter )
    throws EPPIXSeriousException {
    logger.debug( "iterateWithLock( filter )" );

    return dao.iterator(filterQueryArgs( filter, null ),
      true );
  }

  /**
   * Retrieves the Opservm Data Model Object from a possible list.
   *
   * @param filter
   * @return
   * @throws EPPIXSeriousException
   */
  public OpservmDMO get( QueryFilter filter )
    throws EPPIXSeriousException {
    logger.debug( "get( filter )" );

    DAOParamQueryArgs args = filterQueryArgs( filter, null );

    return (OpservmDMO) dao.get( args.getDMLName(  ), args.getFilterBy(  ),
      args );
  }

  /**
   * DOCUMENT ME!
   *
   * @param filter DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   *
   * @throws EPPIXSeriousException DOCUMENT ME!
   */
  public Object max( QueryFilter filter )
    throws EPPIXSeriousException {
    logger.debug( "max( filter )" );

    DAOParamQueryArgs args = filterQueryArgs( filter, null );

    return dao.max( args.getDMLName(  ), args.getFilterBy(  ), args,
      args.getMaxField(  ) );
  }

  /**
   * DOCUMENT ME!
   *
   * @param filter DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   *
   * @throws EPPIXSeriousException DOCUMENT ME!
   */
  public Object min( QueryFilter filter )
    throws EPPIXSeriousException {
    logger.debug( "min( filter )" );

    DAOParamQueryArgs args = filterQueryArgs( filter, null );

    return dao.min( args.getDMLName(  ), args.getFilterBy(  ), args,
      args.getMaxField(  ) );
  }

  /**
   * Counts (COUNT(*)) the number of rows for the specified filter.
   *
   * @param filter
   * @return the count of rows.
   *
   * @throws EPPIXSeriousException
   */
  public int count( QueryFilter filter )
    throws EPPIXSeriousException {
    logger.debug( "count( filter )" );

    DAOParamQueryArgs args = filterQueryArgs( filter, null );

    return dao.count( args.getDMLName(  ), args.getFilterBy(  ), args );
  }
}
