package com.eppixcomm.eppix.base.blo;

import org.apache.log4j.Logger;

import com.eppixcomm.eppix.base.error.EPPIXBusinessException;
import com.eppixcomm.eppix.base.error.EPPIXFatalException;
import com.eppixcomm.eppix.base.error.EPPIXUnexpectedException;
import com.eppixcomm.eppix.base.error.Thrower;
import com.eppixcomm.eppix.common.data.DAC;
import com.eppixcomm.eppix.common.data.DAOIterator;
import com.eppixcomm.eppix.common.data.DTOActionTypes;
import com.eppixcomm.eppix.common.util.QueryFilter;

public class SdrServDepoRuleAbstractBLO extends BaseBLO
implements DTOActionTypes, BaseMessages{
	
	  static Thrower thrower = Thrower.getThrower( SdrServDepoRuleAbstractBLO.class );

	  protected static final String ENTITY_ID = "SDR";
	  protected SdrServDepoRuleDAC sdrServDepoRuleDAC;
	  protected Logger logger = thrower.getLogger(  );

	  protected Class getDACClass(  ) {
	    return SdrServDepoRuleDAC.class;
	  }

	  protected void setDAC( DAC dac ) {
	    this.sdrServDepoRuleDAC = (SdrServDepoRuleDAC) dac;
	  }

	  public SdrServDepoRuleDMO get( SdrServDepoRuleDMO sdrServDepoRuleDMO )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "get(sdrServDepoRuleDMO)" );

	    thrower.ifParameterMissing( "SdrServDepoRuleDMO", sdrServDepoRuleDMO );

	    thrower.ifParameterMissing( "SdrServDepoRuleDMO.sdrPackageCode", sdrServDepoRuleDMO.getSdrPackageCode());
	    thrower.ifParameterMissing( "SdrServDepoRuleDMO.sdrServiceCode", sdrServDepoRuleDMO.getSdrServiceCode());
	    thrower.ifParameterMissing( "SdrServDepoRuleDMO.sdrVerRuleNum", sdrServDepoRuleDMO.getSdrVerRuleNum());
	    
	    SdrServDepoRuleDMO returnSdrServDepoRuleDMO = sdrServDepoRuleDAC.get( sdrServDepoRuleDMO );

	    if ( returnSdrServDepoRuleDMO == null ) {
	      thrower.business( Base_SDRSERVDEPORULE_000,
	        new Object[] { sdrServDepoRuleDMO.getSdrPackageCode(), sdrServDepoRuleDMO.getSdrServiceCode(), sdrServDepoRuleDMO.getSdrVerRuleNum() } );
	    }

	    return returnSdrServDepoRuleDMO;
	  }

//	  public DTOList getList(
//	    DTOListState   state,
//	    SdrServDepoRuleDMO SdrServDepoRuleDMO )
//	    throws EPPIXBusinessException, EPPIXUnexpectedException,
//	      EPPIXFatalException {
//	    logger.debug( "getList( state, SdrServDepoRuleDMO )" );
//
//	    return sdrServDepoRuleDAC.getList( state, SdrServDepoRuleDMO );
//	  }

	  public SdrServDepoRuleDMO create( SdrServDepoRuleDMO sdrServDepoRuleDMO )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "create( SdrServDepoRuleDMO )" );

	    thrower.ifParameterMissing( "SdrServDepoRuleDMO", sdrServDepoRuleDMO );

	    thrower.ifParameterMissing( "SdrServDepoRuleDMO.sdrPackageCode", sdrServDepoRuleDMO.getSdrPackageCode());
	    thrower.ifParameterMissing( "SdrServDepoRuleDMO.sdrServiceCode", sdrServDepoRuleDMO.getSdrServiceCode());
	    thrower.ifParameterMissing( "SdrServDepoRuleDMO.sdrVerRuleNum", sdrServDepoRuleDMO.getSdrVerRuleNum());
	    
	    if ( exists( sdrServDepoRuleDMO ) ) {
	      thrower.business( Base_SDRSERVDEPORULE_001,
	        new Object[] { sdrServDepoRuleDMO.getSdrPackageCode(), sdrServDepoRuleDMO.getSdrServiceCode(), sdrServDepoRuleDMO.getSdrVerRuleNum()} );
	    }

	    sdrServDepoRuleDAC.create( sdrServDepoRuleDMO );

	    return sdrServDepoRuleDMO;
	  }

	  public SdrServDepoRuleDMO modify( SdrServDepoRuleDMO sdrServDepoRuleDMO )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "modify( sdrServDepoRuleDMO )" );

	    thrower.ifParameterMissing( "SdrServDepoRuleDMO", sdrServDepoRuleDMO );

	    thrower.ifParameterMissing( "SdrServDepoRuleDMO.sdrPackageCode", sdrServDepoRuleDMO.getSdrPackageCode());
	    thrower.ifParameterMissing( "SdrServDepoRuleDMO.sdrServiceCode", sdrServDepoRuleDMO.getSdrServiceCode());
	    thrower.ifParameterMissing( "SdrServDepoRuleDMO.sdrVerRuleNum", sdrServDepoRuleDMO.getSdrVerRuleNum());


	    SdrServDepoRuleDMO updateSdrServDepoRuleDMO = new SdrServDepoRuleDMO(  );

	    updateSdrServDepoRuleDMO.setSdrPackageCode(sdrServDepoRuleDMO.getSdrPackageCode());
	    updateSdrServDepoRuleDMO.setSdrServiceCode(sdrServDepoRuleDMO.getSdrServiceCode());
	    updateSdrServDepoRuleDMO.setSdrVerRuleNum(sdrServDepoRuleDMO.getSdrVerRuleNum());

	    updateSdrServDepoRuleDMO = get( updateSdrServDepoRuleDMO );

	    updateSdrServDepoRuleDMO.setSdrPackageCode(sdrServDepoRuleDMO.getSdrPackageCode());
	    updateSdrServDepoRuleDMO.setSdrServiceCode(sdrServDepoRuleDMO.getSdrServiceCode());
	    updateSdrServDepoRuleDMO.setSdrVerRuleNum(sdrServDepoRuleDMO.getSdrVerRuleNum());
	    updateSdrServDepoRuleDMO.setSdrReasonId(sdrServDepoRuleDMO.getSdrReasonId());
	    updateSdrServDepoRuleDMO.setSdrDepositAmount(sdrServDepoRuleDMO.getSdrDepositAmount());
	    updateSdrServDepoRuleDMO.setSdrReleaseFlag(sdrServDepoRuleDMO.getSdrReleaseFlag());
	    updateSdrServDepoRuleDMO.setSdrReleaseType(sdrServDepoRuleDMO.getSdrReleaseType());
	    updateSdrServDepoRuleDMO.setSdrReleaseTgId(sdrServDepoRuleDMO.getSdrReleaseTgId());
	    updateSdrServDepoRuleDMO.setSdrReleUserId(sdrServDepoRuleDMO.getSdrReleUserId());
	    updateSdrServDepoRuleDMO.setSdrReleLetterId(sdrServDepoRuleDMO.getSdrReleLetterId());
	    updateSdrServDepoRuleDMO.setSdrRelDelayDays(sdrServDepoRuleDMO.getSdrRelDelayDays());
	    updateSdrServDepoRuleDMO.setSdrPendingType(sdrServDepoRuleDMO.getSdrPendingType());
	    updateSdrServDepoRuleDMO.setSdrPendTgId(sdrServDepoRuleDMO.getSdrPendTgId());
	    updateSdrServDepoRuleDMO.setSdrPendUserId(sdrServDepoRuleDMO.getSdrPendUserId());
	    updateSdrServDepoRuleDMO.setSdrPayDelayDays(sdrServDepoRuleDMO.getSdrPayDelayDays());
	    updateSdrServDepoRuleDMO.setSdrOverrideFlag(sdrServDepoRuleDMO.getSdrOverrideFlag());

	    sdrServDepoRuleDAC.modify( updateSdrServDepoRuleDMO );

	    // Create a new DMO, set keys, and fetch from the database...
	    SdrServDepoRuleDMO returnSdrServDepoRuleDMO = new SdrServDepoRuleDMO(  );

	    returnSdrServDepoRuleDMO.setSdrPackageCode(updateSdrServDepoRuleDMO.getSdrPackageCode());
	    returnSdrServDepoRuleDMO.setSdrServiceCode(updateSdrServDepoRuleDMO.getSdrServiceCode());
	    returnSdrServDepoRuleDMO.setSdrVerRuleNum(updateSdrServDepoRuleDMO.getSdrVerRuleNum());
	   
	    returnSdrServDepoRuleDMO = get( returnSdrServDepoRuleDMO );

	    return returnSdrServDepoRuleDMO;
	  }


	  public void modify( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "modify( filter )" );
	    
	    sdrServDepoRuleDAC.modify( filter );
	  }


	  public void delete( SdrServDepoRuleDMO sdrServDepoRuleDMO )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "delete( SdrServDepoRuleDMO )" );

	    thrower.ifParameterMissing( "SdrServDepoRuleDMO", sdrServDepoRuleDMO );
	    
	    thrower.ifParameterMissing( "SdrServDepoRuleDMO.sdrPackageCode", sdrServDepoRuleDMO.getSdrPackageCode());
	    thrower.ifParameterMissing( "SdrServDepoRuleDMO.sdrServiceCode", sdrServDepoRuleDMO.getSdrServiceCode());
	    thrower.ifParameterMissing( "SdrServDepoRuleDMO.sdrVerRuleNum", sdrServDepoRuleDMO.getSdrVerRuleNum());

	    SdrServDepoRuleDMO updateSdrServDepoRuleDMO = null;

	    updateSdrServDepoRuleDMO = get( sdrServDepoRuleDMO );

	    // delete self...
	    sdrServDepoRuleDAC.delete( sdrServDepoRuleDMO );
	  }


	  public void delete( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "delete( filter )" );

	    thrower.ifParameterMissing( "filter", filter );

	    // delete...
	    sdrServDepoRuleDAC.delete( filter );
	  }


	  public boolean exists( SdrServDepoRuleDMO sdrServDepoRuleDMO )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "exists(sdrServDepoRuleDMO)" );

	    thrower.ifParameterMissing( "SdrServDepoRuleDMO", sdrServDepoRuleDMO );

	    thrower.ifParameterMissing( "SdrServDepoRuleDMO.sdrPackageCode", sdrServDepoRuleDMO.getSdrPackageCode());
	    thrower.ifParameterMissing( "SdrServDepoRuleDMO.sdrServiceCode", sdrServDepoRuleDMO.getSdrServiceCode());
	    thrower.ifParameterMissing( "SdrServDepoRuleDMO.sdrVerRuleNum", sdrServDepoRuleDMO.getSdrVerRuleNum());


	    return sdrServDepoRuleDAC.exists( sdrServDepoRuleDMO );
	  }


	  public boolean exists( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "exists(filter)" );

	    return sdrServDepoRuleDAC.exists( filter );
	  }

//	  public DTOList getList(
//	    DTOListState state,
//	    QueryFilter  filter )
//	    throws EPPIXBusinessException, EPPIXUnexpectedException,
//	      EPPIXFatalException {
//	    logger.debug( "getList( state, filter )" );
//
//	    return sdrServDepoRuleDAC.getList( state, filter );
//	  }

	  public DAOIterator iterate( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "iterate( filter )" );

	    return sdrServDepoRuleDAC.iterate( filter );
	  }


	  public DAOIterator iterateWithLock( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "iterateWithLock( filter )" );

	    return sdrServDepoRuleDAC.iterateWithLock( filter );
	  }


	  public SdrServDepoRuleDMO get( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "get( filter )" );

	    thrower.ifParameterMissing( "filter", filter );

	    SdrServDepoRuleDMO sdrServDepoRuleDMO = sdrServDepoRuleDAC.get( filter );

	    return sdrServDepoRuleDMO;
	  }


	  public Object max( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "max( filter )" );

	    thrower.ifParameterMissing( "filter", filter );

	    return sdrServDepoRuleDAC.max( filter );
	  }


	  public Object min( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "min( filter )" );

	    thrower.ifParameterMissing( "filter", filter );

	    return sdrServDepoRuleDAC.min( filter );
	  }


	  public Integer count( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "count( filter )" );

	    thrower.ifParameterMissing( "filter", filter );

	    return new Integer(sdrServDepoRuleDAC.count( filter ));
	  }

}
