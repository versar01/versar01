package com.eppixcomm.eppix.base.blo;

import org.apache.log4j.Logger;

import com.eppixcomm.eppix.base.error.EPPIXBusinessException;
import com.eppixcomm.eppix.base.error.EPPIXFatalException;
import com.eppixcomm.eppix.base.error.EPPIXUnexpectedException;
import com.eppixcomm.eppix.base.error.Thrower;
import com.eppixcomm.eppix.common.data.DAC;
import com.eppixcomm.eppix.common.data.DAOIterator;
import com.eppixcomm.eppix.common.data.DTOActionTypes;
import com.eppixcomm.eppix.common.data.DTOList;
import com.eppixcomm.eppix.common.data.DTOListState;
import com.eppixcomm.eppix.common.util.QueryFilter;



public class SpvParamValuesAbstractBLO extends BaseBLO
implements DTOActionTypes, BaseMessages{

	  /** DOCUMENT ME! */
	  static Thrower thrower = Thrower.getThrower( SpvParamValuesAbstractBLO.class );
	  /** DOCUMENT ME! */
	  protected static final String ENTITY_ID = "DOTT";

	  /** Data Access Controller. */
	  protected SpvParamValuesDAC spvParamValuesDAC;
	  /** DOCUMENT ME! */
	  protected Logger logger = thrower.getLogger(  );

	  /** Invoked by the BLOBinder to provide this BLO with its DAC. */
	  protected void setDAC( DAC dac ) {
	    this.spvParamValuesDAC = (SpvParamValuesDAC) dac;
	  }

		protected Class getDACClass() {
			return SpvParamValuesDAC.class;
		}

	  public SpvParamValuesDMO get( SpvParamValuesDMO spvParamValuesDMO )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "get(spvParamValuesDMO)" );

	    //
	    // Check mandatory parameters.
	    //
	    thrower.ifParameterMissing( "spvParamValuesDMO", spvParamValuesDMO );

	    //
	    // Each attribute that is part of the primary key is mandatory
	    //
	    thrower.ifParameterMissing( "spvParamValuesDMO.spvParamValue",
	      spvParamValuesDMO.getSpvParamValue() );

	    //
	    // Attempt to get the SpvParamValuesDMO
	    //
	    SpvParamValuesDMO returnSpvParamValuesDMO = spvParamValuesDAC.get( spvParamValuesDMO );

	    //
	    // Could not find the SpvParamValuesDMO
	    //
	    if ( returnSpvParamValuesDMO == null ) {
	      thrower.business( Base_SPVPARAMVALUES_000,
	        new Object[] { spvParamValuesDMO.getSpvParamValue()} );
	    }

	    //
	    // Now, based on the values of the flags on this method signature, which in turn,
	    // are based on this objects associations, get all associated, embedded objects
	    //
	    return returnSpvParamValuesDMO;
	  }
	  //==================================================================================================


	  public DTOList getList(
	    DTOListState   state,
	    SpvParamValuesDMO spvParamValuesDMO )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "getList( state, spvParamValuesDMO )" );

	    return spvParamValuesDAC.getList( state, spvParamValuesDMO );
	  }


	  public SpvParamValuesDMO create( SpvParamValuesDMO spvParamValuesDMO )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "create( spvParamValuesDMO )" );

	    thrower.ifParameterMissing( "spvParamValuesDMO", spvParamValuesDMO );

	    thrower.ifParameterMissing( "spvParamValuesDMO.spvChargeCode",
	      spvParamValuesDMO.getSpvChargeCode());

	    thrower.ifParameterMissing( "spvParamValuesDMO.spvDefaultValue",
	      spvParamValuesDMO.getSpvDefaultValue() );

	    thrower.ifParameterMissing( "spvParamValuesDMO.spvNetwrkCode",
	      spvParamValuesDMO.getSpvNetwrkCode() );

	    thrower.ifParameterMissing( "spvParamValuesDMO.spvParamValue",
	      spvParamValuesDMO.getSpvParamValue());

	    thrower.ifParameterMissing( "spvParamValuesDMO.spvParamId",
	      spvParamValuesDMO.getSpvParamId() );


	    //
	    // Check that this object does not already exist
	    //
	    if ( exists( spvParamValuesDMO ) ) {
	      thrower.business( Base_ACTACCTYPES_001,
	        new Object[] { spvParamValuesDMO.getSpvParamValue()});
	    }

	    //
	    // Now create the record
	    //
	    spvParamValuesDAC.create( spvParamValuesDMO );

	    return spvParamValuesDMO;
	  }

	  public SpvParamValuesDMO modify( SpvParamValuesDMO spvParamValuesDMO )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "modify( aspvParamValuesDMO )" );

	    //
	    // Check mandatory parameters (
	    //
	    // Note: attributes stereotyped <NotModifiable> are ignored
	    //
	    thrower.ifParameterMissing( "spvParamValuesDMO", spvParamValuesDMO );

	    thrower.ifParameterMissing( "spvParamValuesDMO.spvChargeCode",
	  	      spvParamValuesDMO.getSpvChargeCode());

	  	    thrower.ifParameterMissing( "spvParamValuesDMO.spvDefaultValue",
	  	      spvParamValuesDMO.getSpvDefaultValue() );

	  	    thrower.ifParameterMissing( "spvParamValuesDMO.spvNetwrkCode",
	  	      spvParamValuesDMO.getSpvNetwrkCode() );

	  	    thrower.ifParameterMissing( "spvParamValuesDMO.spvParamValue",
	  	      spvParamValuesDMO.getSpvParamValue());

	  	    thrower.ifParameterMissing( "spvParamValuesDMO.spvParamId",
	  	      spvParamValuesDMO.getSpvParamId() );

	    SpvParamValuesDMO updateSpvParamValuesDMO = new SpvParamValuesDMO(  );

	    updateSpvParamValuesDMO.setSpvParamValue(spvParamValuesDMO.getSpvParamValue());

	    updateSpvParamValuesDMO = get( updateSpvParamValuesDMO );

	    //
	    // For each relationship to single objects (does not matter if they are Embedded or Flattened)
	    // either associate to a pre-existing object, or create an object then associate to it
	    //

	    //
	    // Copy the fields to be updated. We do not want to overwrite primary keys etc.
	    // All attributes stereotyped as being <NotModifiable> are skipped
	    //
	    updateSpvParamValuesDMO.setSpvChargeCode(spvParamValuesDMO.getSpvChargeCode() );

	    updateSpvParamValuesDMO.setSpvDefaultValue(spvParamValuesDMO.getSpvDefaultValue());

	    updateSpvParamValuesDMO.setSpvNetwrkCode(spvParamValuesDMO.getSpvNetwrkCode());

	    updateSpvParamValuesDMO.setSpvParamId(spvParamValuesDMO.getSpvParamId());

	    updateSpvParamValuesDMO.setSpvParamValue(spvParamValuesDMO.getSpvParamValue());


	    //
	    // Modify the spvParamValuesDMO
	    //
	    spvParamValuesDAC.modify( updateSpvParamValuesDMO );

	    // Create a new SpvParamValuesDMO, set keys, and fetch from the database...
	    SpvParamValuesDMO returnSpvParamValuesDMO = new SpvParamValuesDMO(  );

	    returnSpvParamValuesDMO.setSpvParamValue(updateSpvParamValuesDMO.getSpvParamValue() );

	    returnSpvParamValuesDMO = get( returnSpvParamValuesDMO );

	    return returnSpvParamValuesDMO;
	  }
	  //==================================================================================================


	  public void modify( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "modify( filter )" );

	    //
	    // Modify the spvParamValuesDMO
	    //
	    spvParamValuesDAC.modify( filter );
	  }
	//==================================================================================================

	  public void delete( SpvParamValuesDMO spvParamValuesDMO )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "delete( spvParamValuesDMO )" );

	    thrower.ifParameterMissing( "spvParamValuesDMO", spvParamValuesDMO );

	    SpvParamValuesDMO updateSpvParamValuesDMO = null;

	    updateSpvParamValuesDMO = get( spvParamValuesDMO );

	    // delete self...
	    spvParamValuesDAC.delete( spvParamValuesDMO );
	  }
	//==================================================================================================

	  public void delete( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "delete( filter )" );

	    thrower.ifParameterMissing( "filter", filter );

	    // delete...
	    spvParamValuesDAC.delete( filter );
	  }
	  //==================================================================================================

	  public boolean exists( SpvParamValuesDMO spvParamValuesDMO )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "exists(spvParamValuesDMO)" );

	    thrower.ifParameterMissing( "spvParamValuesDMO", spvParamValuesDMO );

	    thrower.ifParameterMissing( "spvParamValuesDMO.spvParamValue",
	      spvParamValuesDMO.getSpvParamValue() );

	    return spvParamValuesDAC.exists( spvParamValuesDMO );
	  }
	  //==================================================================================================


	  public boolean exists( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "exists(filter)" );

	    return spvParamValuesDAC.exists( filter );
	  }
	  //==================================================================================================


	  public DTOList getList(
	    DTOListState state,
	    QueryFilter  filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "getList( state, filter )" );

	    return spvParamValuesDAC.getList( state, filter );
	  }

	  //==================================================================================================


	  public DAOIterator iterate( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "iterateWithLock( filter )" );

	    return spvParamValuesDAC.iterate( filter );
	  }
	  //==================================================================================================


	  public DAOIterator iterateWithLock( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "iterateWithLock( filter )" );

	    return spvParamValuesDAC.iterateWithLock( filter );
	  }
	  //==================================================================================================


	  public SpvParamValuesDMO get( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "get( filter )" );

	    //
	    // Check mandatory parameters.
	    //
	    thrower.ifParameterMissing( "filter", filter );

	    //
	    // Attempt to get the SpvParamValuesDMO
	    //
	    SpvParamValuesDMO spvParamValuesDMO = spvParamValuesDAC.get( filter );

	    return spvParamValuesDMO;
	  }
	  //==================================================================================================


	  public Object max( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "max( filter )" );

	    //
	    // Check mandatory parameters.
	    //
	    thrower.ifParameterMissing( "filter", filter );

	    return spvParamValuesDAC.max( filter );
	  }
	  //==================================================================================================


	  public Object min( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "min( filter )" );

	    //
	    // Check mandatory parameters.
	    //
	    thrower.ifParameterMissing( "filter", filter );

	    return spvParamValuesDAC.min( filter );
	  }
	  //==================================================================================================


	  public Integer count( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "count( filter )" );

	    //
	    // Check mandatory parameters.
	    //
	    thrower.ifParameterMissing( "filter", filter );

	    return Integer.valueOf(spvParamValuesDAC.count( filter ));
	  }
	  //==================================================================================================




}