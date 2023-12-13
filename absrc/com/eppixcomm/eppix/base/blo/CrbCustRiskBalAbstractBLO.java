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

public class CrbCustRiskBalAbstractBLO   extends BaseBLO
implements DTOActionTypes, BaseMessages {
	
	  static Thrower thrower = Thrower.getThrower( CrbCustRiskBalAbstractBLO.class );
	  private Logger logger = thrower.getLogger();
	  protected static final String ENTITY_ID = "CRB";
	  protected CrbCustRiskBalDAC crbCustRiskBalDAC;
	
	protected Class getDACClass() {
		return CrbCustRiskBalDAC.class;
	}

	protected void setDAC(DAC dac) {
		this.crbCustRiskBalDAC = (CrbCustRiskBalDAC)dac;
	}

	  public CrbCustRiskBalDMO get(
			    CrbCustRiskBalDMO crbCustRiskBalDMO)
			    throws EPPIXBusinessException, EPPIXUnexpectedException,
			      EPPIXFatalException {
			    logger.debug( "get(crbCustRiskBalDMO)" );

			    //
			    // Check mandatory parameters.
			    //
			    thrower.ifParameterMissing( "crbCustRiskBalDMO", crbCustRiskBalDMO );

			    //
			    // Each attribute that is part of the primary key is mandatory
			    //
			    thrower.ifParameterMissing( "crbCustRiskBalDMO.crbBillAcNo",
			      crbCustRiskBalDMO.getCrbBillAcNo());

			    //
			    // Attempt to get the CrbCustRiskBalDMO
			    //
			    CrbCustRiskBalDMO returnCrbCustRiskBalDMO = crbCustRiskBalDAC.get( crbCustRiskBalDMO);

			    //
			    // Could not find the CrbCustRiskBalDMO
			    //
			    if ( returnCrbCustRiskBalDMO == null ) {
			      thrower.business( Base_CRBCUSTRISKBAL_000,
			        new Object[] { crbCustRiskBalDMO.getCrbBillAcNo()} );
			    }

			    //
			    // Now, based on the values of the flags on this method signature, which in turn,
			    // are based on this objects associations, get all associated, embedded objects
			    //
			    return returnCrbCustRiskBalDMO;
			  }

			  public DTOList getList(
			    DTOListState         state,
			    CrbCustRiskBalDMO crbCustRiskBalDMO)
			    throws EPPIXBusinessException, EPPIXUnexpectedException,
			      EPPIXFatalException {
			    logger.debug( "getList( state, crbCustRiskBalDMO )" );

			    return crbCustRiskBalDAC.getList( state, crbCustRiskBalDMO);
			  }


			  public CrbCustRiskBalDMO create(CrbCustRiskBalDMO crbCustRiskBalDMO)
			    throws EPPIXBusinessException, EPPIXUnexpectedException,
			      EPPIXFatalException {
			    logger.debug( "create( crbCustRiskBalDMO )" );

			    thrower.ifParameterMissing( "crbCustRiskBalDMO", crbCustRiskBalDMO );
			    
			    crbCustRiskBalDMO = crbCustRiskBalDAC.create( crbCustRiskBalDMO);
			    
			    return crbCustRiskBalDMO;
			  }


			  public CrbCustRiskBalDMO modify(CrbCustRiskBalDMO aCrbCustRiskBalDMO)
			    throws EPPIXBusinessException, EPPIXUnexpectedException,
			      EPPIXFatalException {
			    logger.debug( "modify( acrbCustRiskBalDMO )" );

			    //
			    // Check mandatory parameters (
			    //
			    // Note: attributes stereotyped <NotModifiable> are ignored
			    //
			    thrower.ifParameterMissing( "acrbCustRiskBalDMO", aCrbCustRiskBalDMO );

			    thrower.ifParameterMissing( "aCrbCustRiskBalDMO.crbBillAcNo",
			      aCrbCustRiskBalDMO.getCrbBillAcNo() ); // attribute

			    CrbCustRiskBalDMO updateCrbCustRiskBalDMO = new CrbCustRiskBalDMO(  );

			    updateCrbCustRiskBalDMO.setCrbBillAcNo( aCrbCustRiskBalDMO.getCrbBillAcNo());

			    updateCrbCustRiskBalDMO = get( updateCrbCustRiskBalDMO);

			    //===========================================================================================
			    updateCrbCustRiskBalDMO.setCrbBillAcNo(aCrbCustRiskBalDMO.getCrbBillAcNo());
			    updateCrbCustRiskBalDMO.setCrbAccountType(aCrbCustRiskBalDMO.getCrbAccountType());
			    updateCrbCustRiskBalDMO.setCrbCreditLimit(aCrbCustRiskBalDMO.getCrbCreditLimit());
			    updateCrbCustRiskBalDMO.setCrbAccBal(aCrbCustRiskBalDMO.getCrbAccBal());
			    updateCrbCustRiskBalDMO.setCrbUnbillCharges(aCrbCustRiskBalDMO.getCrbUnbillCharges());
			    updateCrbCustRiskBalDMO.setCrbUnbillCalls(aCrbCustRiskBalDMO.getCrbUnbillCalls());
			    updateCrbCustRiskBalDMO.setCrbDiff(aCrbCustRiskBalDMO.getCrbDiff());
			    updateCrbCustRiskBalDMO.setCrbNextThreshold(aCrbCustRiskBalDMO.getCrbNextThreshold());
			    updateCrbCustRiskBalDMO.setCrbPrevThreshold(aCrbCustRiskBalDMO.getCrbPrevThreshold());
			    updateCrbCustRiskBalDMO.setCrbCollPlan(aCrbCustRiskBalDMO.getCrbCollPlan());
			    updateCrbCustRiskBalDMO.setCrbMinThreshold(aCrbCustRiskBalDMO.getCrbMinThreshold());
			    updateCrbCustRiskBalDMO.setCrbActivateFlag(aCrbCustRiskBalDMO.getCrbActivateFlag());
			    updateCrbCustRiskBalDMO.setCrbEapFlag(aCrbCustRiskBalDMO.getCrbEapFlag());
			    updateCrbCustRiskBalDMO.setCrbBlStatus(aCrbCustRiskBalDMO.getCrbBlStatus());
			    updateCrbCustRiskBalDMO.setCrbBlType(aCrbCustRiskBalDMO.getCrbBlType());
			    updateCrbCustRiskBalDMO.setCrbBlLimit(aCrbCustRiskBalDMO.getCrbBlLimit());
			    updateCrbCustRiskBalDMO.setCrbBlDiff(aCrbCustRiskBalDMO.getCrbBlDiff());
			    updateCrbCustRiskBalDMO.setCrbBlNextThresh(aCrbCustRiskBalDMO.getCrbBlNextThresh());
			    updateCrbCustRiskBalDMO.setCrbBlPrevThresh(aCrbCustRiskBalDMO.getCrbBlPrevThresh());
			    updateCrbCustRiskBalDMO.setCrbBlNextAcnId(aCrbCustRiskBalDMO.getCrbBlNextAcnId());
			    updateCrbCustRiskBalDMO.setCrbBlPrevAcnId(aCrbCustRiskBalDMO.getCrbBlPrevAcnId());
			    updateCrbCustRiskBalDMO.setCrbBlTrigFlag(aCrbCustRiskBalDMO.getCrbBlTrigFlag());
			    updateCrbCustRiskBalDMO.setCrbBlLastUpdate(aCrbCustRiskBalDMO.getCrbBlLastUpdate());

			    //
			    // Modify the crbCustRiskBalDMO
			    //
			    crbCustRiskBalDAC.modify( updateCrbCustRiskBalDMO);

			    // Create a new DMO, set keys, and fetch from the database...
			    CrbCustRiskBalDMO returnCrbCustRiskBalDMO = new CrbCustRiskBalDMO(  );

			    returnCrbCustRiskBalDMO.setCrbBillAcNo(updateCrbCustRiskBalDMO.getCrbBillAcNo());

			    returnCrbCustRiskBalDMO = get( returnCrbCustRiskBalDMO);

			    return returnCrbCustRiskBalDMO;
			  }


			  public void modify(
			    QueryFilter filter)
			    throws EPPIXBusinessException, EPPIXUnexpectedException,
			      EPPIXFatalException {
			    logger.debug( "modify( filter )" );

			    //
			    // Modify the crbCustRiskBalDMO
			    //
			    crbCustRiskBalDAC.modify( filter);
			  }


			  public void delete(
			    CrbCustRiskBalDMO crbCustRiskBalDMO)
			    throws EPPIXBusinessException, EPPIXUnexpectedException,
			      EPPIXFatalException {
			    logger.debug( "delete( crbCustRiskBalDMO )" );

			    thrower.ifParameterMissing( "crbCustRiskBalDMO", crbCustRiskBalDMO );

			    CrbCustRiskBalDMO updateCrbCustRiskBalDMO = null;

			    updateCrbCustRiskBalDMO = get( crbCustRiskBalDMO);

			    // delete self...
			    crbCustRiskBalDAC.delete( crbCustRiskBalDMO);
			  }


			  public void delete(
			    QueryFilter filter)
			    throws EPPIXBusinessException, EPPIXUnexpectedException,
			      EPPIXFatalException {
			    logger.debug( "delete( filter )" );

			    thrower.ifParameterMissing( "filter", filter );

			    // delete...
			    crbCustRiskBalDAC.delete( filter);
			  }


			  public boolean exists(CrbCustRiskBalDMO crbCustRiskBalDMO)
			    throws EPPIXBusinessException, EPPIXUnexpectedException,
			      EPPIXFatalException {
			    logger.debug( "exists(crbCustRiskBalDMO)" );

			    thrower.ifParameterMissing( "crbCustRiskBalDMO", crbCustRiskBalDMO );

			    thrower.ifParameterMissing( "crbCustRiskBalDMO.crbBillAcNo",
			      crbCustRiskBalDMO.getCrbBillAcNo() );

			    return crbCustRiskBalDAC.exists( crbCustRiskBalDMO);
			  }


			  public boolean exists(
			    QueryFilter filter)
			    throws EPPIXBusinessException, EPPIXUnexpectedException,
			      EPPIXFatalException {
			    logger.debug( "exists(filter)" );

			    return crbCustRiskBalDAC.exists( filter);
			  }


			  public DTOList getList(
			    DTOListState state,
			    QueryFilter  filter)
			    throws EPPIXBusinessException, EPPIXUnexpectedException,
			      EPPIXFatalException {
			    logger.debug( "getList( state, filter )" );

			    return crbCustRiskBalDAC.getList( state, filter);
			  }


			  public DAOIterator iterate(
			    QueryFilter filter)
			    throws EPPIXBusinessException, EPPIXUnexpectedException,
			      EPPIXFatalException {
			    logger.debug( "iterate( filter )" );

			    return crbCustRiskBalDAC.iterate( filter);
			  }


			  public DAOIterator iterateWithLock(
			    QueryFilter filter)
			    throws EPPIXBusinessException, EPPIXUnexpectedException,
			      EPPIXFatalException {
			    logger.debug( "iterateWithLock( filter )" );

			    return crbCustRiskBalDAC.iterateWithLock( filter);
			  }


			  public CrbCustRiskBalDMO get(QueryFilter filter)
			    throws EPPIXBusinessException, EPPIXUnexpectedException,
			      EPPIXFatalException {
			    logger.debug( "get( filter )" );

			    //
			    // Check mandatory parameters.
			    //
			    thrower.ifParameterMissing( "filter", filter );

			    //
			    // Attempt to get the CrbCustRiskBalDMO
			    //
			    CrbCustRiskBalDMO crbCustRiskBalDMO = crbCustRiskBalDAC.get( filter);

			    return crbCustRiskBalDMO;
			  }


			  public Object max(
			    QueryFilter filter)
			    throws EPPIXBusinessException, EPPIXUnexpectedException,
			      EPPIXFatalException {
			    logger.debug( "max( filter )" );

			    //
			    // Check mandatory parameters.
			    //
			    thrower.ifParameterMissing( "filter", filter );

			    return crbCustRiskBalDAC.max( filter);
			  }


			  public Object min(
			    QueryFilter filter)
			    throws EPPIXBusinessException, EPPIXUnexpectedException,
			      EPPIXFatalException {
			    logger.debug( "min( filter )" );

			    //
			    // Check mandatory parameters.
			    //
			    thrower.ifParameterMissing( "filter", filter );

			    return crbCustRiskBalDAC.min( filter);
			  }


			  public Integer count(
			    QueryFilter filter)
			    throws EPPIXBusinessException, EPPIXUnexpectedException,
			      EPPIXFatalException {
			    logger.debug( "count( filter )" );

			    //
			    // Check mandatory parameters.
			    //
			    thrower.ifParameterMissing( "filter", filter );

			    return new Integer(crbCustRiskBalDAC.count(filter));
			  }
	
}
