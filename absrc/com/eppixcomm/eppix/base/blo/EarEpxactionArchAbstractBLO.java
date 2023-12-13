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



public class EarEpxactionArchAbstractBLO extends BaseBLO
implements DTOActionTypes, BaseMessages{
	  
	static Thrower thrower = Thrower.getThrower( EarEpxactionArchAbstractBLO.class );

	  protected static final String ENTITY_ID = "EAP";
	  protected EarEpxactionArchDAC earEpxactionArchDAC;
	  protected Logger logger = thrower.getLogger(  );

	  protected Class getDACClass(  ) {
	    return EaaEpxactionAllwDAC.class;
	  }

	  protected void setDAC( DAC dac ) {
	    this.earEpxactionArchDAC = (EarEpxactionArchDAC) dac;
	  }

//	  public EarEpxactionArchDMO get( EarEpxactionArchDMO earEpxactionArchDMO )
//	    throws EPPIXBusinessException, EPPIXUnexpectedException,
//	      EPPIXFatalException {
//	    logger.debug( "get(earEpxactionArchDMO)" );
//
//	    thrower.ifParameterMissing( "EarEpxactionArchDMO", earEpxactionArchDMO );
//
//	    thrower.ifParameterMissing( "EarEpxactionArchDMO.earSubsystem", earEpxactionArchDMO.getEarSubsystem());
//	    thrower.ifParameterMissing( "EarEpxactionArchDMO.earActionSeq", earEpxactionArchDMO.getEarActionSeq());
//	    
//	    EarEpxactionArchDMO returnEarEpxactionArchDMO = earEpxactionArchDAC.get( earEpxactionArchDMO );
//
//	    if ( returnEarEpxactionArchDMO == null ) {
//	      thrower.business( Base_UDAUSERDEFACT_000,
//	        new Object[] { earEpxactionArchDMO } );
//	    }
//
//	    return returnEarEpxactionArchDMO;
//	  }

//	  public DTOList getList(
//	    DTOListState   state,
//	    EarEpxactionArchDMO EarEpxactionArchDMO )
//	    throws EPPIXBusinessException, EPPIXUnexpectedException,
//	      EPPIXFatalException {
//	    logger.debug( "getList( state, EarEpxactionArchDMO )" );
//
//	    return earEpxactionArchDAC.getList( state, EarEpxactionArchDMO );
//	  }

	  public EarEpxactionArchDMO create( EarEpxactionArchDMO earEpxactionArchDMO )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "create( EarEpxactionArchDMO )" );

	    thrower.ifParameterMissing( "EarEpxactionArchDMO", earEpxactionArchDMO );

//	    thrower.ifParameterMissing( "EarEpxactionArchDMO.earSubsystem", earEpxactionArchDMO.getEarSubsystem());
//	    thrower.ifParameterMissing( "EarEpxactionArchDMO.earActionSeq", earEpxactionArchDMO.getEarActionSeq());
	    
	    
//	    if ( exists( earEpxactionArchDMO ) ) {
//	      thrower.business( Base_UDAUSERDEFACT_001,
//	        new Object[] { earEpxactionArchDMO.getEarSubsystem(), earEpxactionArchDMO.getEarActionSeq()});
//	    }

	    earEpxactionArchDAC.create( earEpxactionArchDMO );

	    return earEpxactionArchDMO;
	  }

//	  public EarEpxactionArchDMO modify( EarEpxactionArchDMO earEpxactionArchDMO )
//	    throws EPPIXBusinessException, EPPIXUnexpectedException,
//	      EPPIXFatalException {
//	    logger.debug( "modify( earEpxactionArchDMO )" );
//
//	    thrower.ifParameterMissing( "EarEpxactionArchDMO", earEpxactionArchDMO );
//
//	    thrower.ifParameterMissing( "EarEpxactionArchDMO.earSubsystem", earEpxactionArchDMO.getEarSubsystem());
//	    thrower.ifParameterMissing( "EarEpxactionArchDMO.earActionSeq", earEpxactionArchDMO.getEarActionSeq());
//
//
//	    EarEpxactionArchDMO updateEarEpxactionArchDMO = new EarEpxactionArchDMO(  );
//
//	    updateEarEpxactionArchDMO.setEarSubsystem(earEpxactionArchDMO.getEarSubsystem());
//	    updateEarEpxactionArchDMO.setEarActionSeq(earEpxactionArchDMO.getEarActionSeq());
//
//	    updateEarEpxactionArchDMO = get( updateEarEpxactionArchDMO );
//
//	    updateEarEpxactionArchDMO.setEarBbillAcNo(earEpxactionArchDMO.getEarBbillAcNo());
//	    updateEarEpxactionArchDMO.setEarSubscriberId(earEpxactionArchDMO.getEarSubscriberId());
//	    updateEarEpxactionArchDMO.setEarSimNo(earEpxactionArchDMO.getEarSimNo());
//	    updateEarEpxactionArchDMO.setEarImsiNo(earEpxactionArchDMO.getEarImsiNo());
//	    updateEarEpxactionArchDMO.setEarMsisdnNo(earEpxactionArchDMO.getEarMsisdnNo());
//	    updateEarEpxactionArchDMO.setEarInvoiceNo(earEpxactionArchDMO.getEarInvoiceNo());
//	    updateEarEpxactionArchDMO.setEarReferenceNo(earEpxactionArchDMO.getEarReferenceNo());
//	    updateEarEpxactionArchDMO.setEarSubsystem(earEpxactionArchDMO.getEarSubsystem());
//	    updateEarEpxactionArchDMO.setEarRelation(earEpxactionArchDMO.getEarRelation());
//	    updateEarEpxactionArchDMO.setEarTrigger(earEpxactionArchDMO.getEarTrigger());
//	    updateEarEpxactionArchDMO.setEarActionType(earEpxactionArchDMO.getEarActionType());
////	    updateEarEpxactionArchDMO.setEarActionSeq(earEpxactionArchDMO.getEarActionSeq());
//	    updateEarEpxactionArchDMO.setEarDocType(earEpxactionArchDMO.getEarDocType());
//	    updateEarEpxactionArchDMO.setEarServiceCode(earEpxactionArchDMO.getEarServiceCode());
//	    updateEarEpxactionArchDMO.setEarReasonCode(earEpxactionArchDMO.getEarReasonCode());
//	    updateEarEpxactionArchDMO.setEarTableName(earEpxactionArchDMO.getEarTableName());
//	    updateEarEpxactionArchDMO.setEarColumnName(earEpxactionArchDMO.getEarColumnName());
//	    updateEarEpxactionArchDMO.setEarNewValue(earEpxactionArchDMO.getEarNewValue());
//	    updateEarEpxactionArchDMO.setEarWhereColumn(earEpxactionArchDMO.getEarWhereColumn());
//	    updateEarEpxactionArchDMO.setEarWhereType(earEpxactionArchDMO.getEarWhereType());
//	    updateEarEpxactionArchDMO.setEarChargeCode(earEpxactionArchDMO.getEarChargeCode());
//	    updateEarEpxactionArchDMO.setEarVoiceMess(earEpxactionArchDMO.getEarVoiceMess());
//	    updateEarEpxactionArchDMO.setEarAmnActionId(earEpxactionArchDMO.getEarAmnActionId());
//	    updateEarEpxactionArchDMO.setEarAmnTargType(earEpxactionArchDMO.getEarAmnTargType());
//	    updateEarEpxactionArchDMO.setEarAmnTargGrp(earEpxactionArchDMO.getEarAmnTargGrp());
//	    updateEarEpxactionArchDMO.setEarAmnTargUser(earEpxactionArchDMO.getEarAmnTargUser());
//	    updateEarEpxactionArchDMO.setEarAmnDeadline(earEpxactionArchDMO.getEarAmnDeadline());
//	    updateEarEpxactionArchDMO.setEarAmnStatus(earEpxactionArchDMO.getEarAmnStatus());
//	    updateEarEpxactionArchDMO.setEarAmnSource(earEpxactionArchDMO.getEarAmnSource());
//	    updateEarEpxactionArchDMO.setEarAmnOpenedBy(earEpxactionArchDMO.getEarAmnOpenedBy());
//	    updateEarEpxactionArchDMO.setEarUdaActionId(earEpxactionArchDMO.getEarUdaActionId());
//	    updateEarEpxactionArchDMO.setEarStatus(earEpxactionArchDMO.getEarStatus());
//	    updateEarEpxactionArchDMO.setEarRetryRemain(earEpxactionArchDMO.getEarRetryRemain());
//	    updateEarEpxactionArchDMO.setEarLastRetry(earEpxactionArchDMO.getEarLastRetry());
//	    updateEarEpxactionArchDMO.setEarErrorText(earEpxactionArchDMO.getEarErrorText());
//	    updateEarEpxactionArchDMO.setEarSubmitted(earEpxactionArchDMO.getEarSubmitted());
//	    updateEarEpxactionArchDMO.setEarActioned(earEpxactionArchDMO.getEarActioned());
//
//
//	    earEpxactionArchDAC.modify( updateEarEpxactionArchDMO );
//
//	    // Create a new DMO, set keys, and fetch from the database...
//	    EarEpxactionArchDMO returnEarEpxactionArchDMO = new EarEpxactionArchDMO(  );
//
//	    returnEarEpxactionArchDMO.setEarSubsystem(earEpxactionArchDMO.getEarSubsystem());
//	    returnEarEpxactionArchDMO.setEarActionSeq(earEpxactionArchDMO.getEarActionSeq());
//	   
//	    returnEarEpxactionArchDMO = get( returnEarEpxactionArchDMO );
//
//	    return returnEarEpxactionArchDMO;
//	  }


	  public void modify( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "modify( filter )" );
	    
	    earEpxactionArchDAC.modify( filter );
	  }


//	  public void delete( EarEpxactionArchDMO earEpxactionArchDMO )
//	    throws EPPIXBusinessException, EPPIXUnexpectedException,
//	      EPPIXFatalException {
//	    logger.debug( "delete( EarEpxactionArchDMO )" );
//
//	    thrower.ifParameterMissing( "EarEpxactionArchDMO", earEpxactionArchDMO );
//	    
//	    thrower.ifParameterMissing( "EarEpxactionArchDMO.earSubsystem", earEpxactionArchDMO.getEarSubsystem());
//	    thrower.ifParameterMissing( "EarEpxactionArchDMO.earActionSeq", earEpxactionArchDMO.getEarActionSeq());
//
//	    EarEpxactionArchDMO updateEarEpxactionArchDMO = null;
//
//	    updateEarEpxactionArchDMO = get( earEpxactionArchDMO );
//
//	    // delete self...
//	    earEpxactionArchDAC.delete( earEpxactionArchDMO );
//	  }


	  public void delete( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "delete( filter )" );

	    thrower.ifParameterMissing( "filter", filter );

	    // delete...
	    earEpxactionArchDAC.delete( filter );
	  }


//	  public boolean exists( EarEpxactionArchDMO earEpxactionArchDMO )
//	    throws EPPIXBusinessException, EPPIXUnexpectedException,
//	      EPPIXFatalException {
//	    logger.debug( "exists(eaaEpxactionAllw)" );
//
//	    thrower.ifParameterMissing( "EarEpxactionArchDMO", earEpxactionArchDMO );
//
//	    thrower.ifParameterMissing( "EarEpxactionArchDMO.earSubsystem", earEpxactionArchDMO.getEarSubsystem());
//	    thrower.ifParameterMissing( "EarEpxactionArchDMO.earActionSeq", earEpxactionArchDMO.getEarActionSeq());
//
//
//	    return earEpxactionArchDAC.exists( earEpxactionArchDMO );
//	  }


	  public boolean exists( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "exists(filter)" );

	    return earEpxactionArchDAC.exists( filter );
	  }

//	  public DTOList getList(
//	    DTOListState state,
//	    QueryFilter  filter )
//	    throws EPPIXBusinessException, EPPIXUnexpectedException,
//	      EPPIXFatalException {
//	    logger.debug( "getList( state, filter )" );
//
//	    return earEpxactionArchDAC.getList( state, filter );
//	  }

	  public DAOIterator iterate( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "iterate( filter )" );

	    return earEpxactionArchDAC.iterate( filter );
	  }


	  public DAOIterator iterateWithLock( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "iterateWithLock( filter )" );

	    return earEpxactionArchDAC.iterateWithLock( filter );
	  }


	  public EarEpxactionArchDMO get( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "get( filter )" );

	    thrower.ifParameterMissing( "filter", filter );

	    EarEpxactionArchDMO earEpxactionArchDMO = earEpxactionArchDAC.get( filter );

	    return earEpxactionArchDMO;
	  }


	  public Object max( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "max( filter )" );

	    thrower.ifParameterMissing( "filter", filter );

	    return earEpxactionArchDAC.max( filter );
	  }


	  public Object min( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "min( filter )" );

	    thrower.ifParameterMissing( "filter", filter );

	    return earEpxactionArchDAC.min( filter );
	  }


	  public Integer count( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "count( filter )" );

	    thrower.ifParameterMissing( "filter", filter );

	    return new Integer(earEpxactionArchDAC.count( filter ));
	  }

}
