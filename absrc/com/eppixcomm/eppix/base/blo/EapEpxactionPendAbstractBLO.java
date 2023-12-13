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

public class EapEpxactionPendAbstractBLO extends BaseBLO
implements DTOActionTypes, BaseMessages{
	  
	static Thrower thrower = Thrower.getThrower( EapEpxactionPendAbstractBLO.class );

	  protected static final String ENTITY_ID = "EAP";
	  protected EapEpxactionPendDAC eapEpxactionPendDAC;
	  protected Logger logger = thrower.getLogger(  );

	  protected Class getDACClass(  ) {
	    return EapEpxactionPendDAC.class;
	  }

	  protected void setDAC( DAC dac ) {
	    this.eapEpxactionPendDAC = (EapEpxactionPendDAC) dac;
	  }

	  public EapEpxactionPendDMO get( EapEpxactionPendDMO eapEpxactionPendDMO )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "get(eapEpxactionPendDMO)" );

	    thrower.ifParameterMissing( "EapEpxactionPendDMO", eapEpxactionPendDMO );

	    thrower.ifParameterMissing( "EapEpxactionPendDMO.eapSubsystem", eapEpxactionPendDMO.getEapSubsystem());
	    thrower.ifParameterMissing( "EapEpxactionPendDMO.eapActionSeq", eapEpxactionPendDMO.getEapActionSeq());
	    
	    EapEpxactionPendDMO returnEapEpxactionPendDMO = eapEpxactionPendDAC.get( eapEpxactionPendDMO );

	    if ( returnEapEpxactionPendDMO == null ) {
	      thrower.business( Base_UDAUSERDEFACT_000,
	        new Object[] { eapEpxactionPendDMO } );
	    }

	    return returnEapEpxactionPendDMO;
	  }

//	  public DTOList getList(
//	    DTOListState   state,
//	    EapEpxactionPendDMO EapEpxactionPendDMO )
//	    throws EPPIXBusinessException, EPPIXUnexpectedException,
//	      EPPIXFatalException {
//	    logger.debug( "getList( state, EapEpxactionPendDMO )" );
//
//	    return eapEpxactionPendDAC.getList( state, EapEpxactionPendDMO );
//	  }

	  public EapEpxactionPendDMO create( EapEpxactionPendDMO eapEpxactionPendDMO )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "create( EapEpxactionPendDMO )" );

	    thrower.ifParameterMissing( "EapEpxactionPendDMO", eapEpxactionPendDMO );

	    thrower.ifParameterMissing( "EapEpxactionPendDMO.eapSubsystem", eapEpxactionPendDMO.getEapSubsystem());
	    thrower.ifParameterMissing( "EapEpxactionPendDMO.eapActionSeq", eapEpxactionPendDMO.getEapActionSeq());
	    
	    
	    if ( exists( eapEpxactionPendDMO ) ) {
	      thrower.business( Base_UDAUSERDEFACT_001,
	        new Object[] { eapEpxactionPendDMO.getEapSubsystem(), eapEpxactionPendDMO.getEapActionSeq()});
	    }

	    eapEpxactionPendDAC.create( eapEpxactionPendDMO );

	    return eapEpxactionPendDMO;
	  }

//	  public EapEpxactionPendDMO modify( EapEpxactionPendDMO eapEpxactionPendDMO )
//	    throws EPPIXBusinessException, EPPIXUnexpectedException,
//	      EPPIXFatalException {
//	    logger.debug( "modify( eapEpxactionPendDMO )" );
//
//	    thrower.ifParameterMissing( "EapEpxactionPendDMO", eapEpxactionPendDMO );
//
//	    thrower.ifParameterMissing( "EapEpxactionPendDMO.eapSubsystem", eapEpxactionPendDMO.getEapSubsystem());
//	    thrower.ifParameterMissing( "EapEpxactionPendDMO.eapActionSeq", eapEpxactionPendDMO.getEapActionSeq());
//
//
//	    EapEpxactionPendDMO updateEapEpxactionPendDMO = new EapEpxactionPendDMO(  );
//
//	    updateEapEpxactionPendDMO.setEapSubsystem(eapEpxactionPendDMO.getEapSubsystem());
//	    updateEapEpxactionPendDMO.setEapActionSeq(eapEpxactionPendDMO.getEapActionSeq());
//
//	    updateEapEpxactionPendDMO = get( updateEapEpxactionPendDMO );
//
//	    updateEapEpxactionPendDMO.setEapBbillAcNo(eapEpxactionPendDMO.getEapBbillAcNo());
//	    updateEapEpxactionPendDMO.setEapSubscriberId(eapEpxactionPendDMO.getEapSubscriberId());
//	    updateEapEpxactionPendDMO.setEapSimNo(eapEpxactionPendDMO.getEapSimNo());
//	    updateEapEpxactionPendDMO.setEapImsiNo(eapEpxactionPendDMO.getEapImsiNo());
//	    updateEapEpxactionPendDMO.setEapMsisdnNo(eapEpxactionPendDMO.getEapMsisdnNo());
//	    updateEapEpxactionPendDMO.setEapInvoiceNo(eapEpxactionPendDMO.getEapInvoiceNo());
//	    updateEapEpxactionPendDMO.setEapReferenceNo(eapEpxactionPendDMO.getEapReferenceNo());
//	    updateEapEpxactionPendDMO.setEapSubsystem(eapEpxactionPendDMO.getEapSubsystem());
//	    updateEapEpxactionPendDMO.setEapRelation(eapEpxactionPendDMO.getEapRelation());
//	    updateEapEpxactionPendDMO.setEapTrigger(eapEpxactionPendDMO.getEapTrigger());
//	    updateEapEpxactionPendDMO.setEapActionType(eapEpxactionPendDMO.getEapActionType());
////	    updateEapEpxactionPendDMO.setEapActionSeq(eapEpxactionPendDMO.getEapActionSeq());
//	    updateEapEpxactionPendDMO.setEapDocType(eapEpxactionPendDMO.getEapDocType());
//	    updateEapEpxactionPendDMO.setEapServiceCode(eapEpxactionPendDMO.getEapServiceCode());
//	    updateEapEpxactionPendDMO.setEapReasonCode(eapEpxactionPendDMO.getEapReasonCode());
//	    updateEapEpxactionPendDMO.setEapTableName(eapEpxactionPendDMO.getEapTableName());
//	    updateEapEpxactionPendDMO.setEapColumnName(eapEpxactionPendDMO.getEapColumnName());
//	    updateEapEpxactionPendDMO.setEapNewValue(eapEpxactionPendDMO.getEapNewValue());
//	    updateEapEpxactionPendDMO.setEapWhereColumn(eapEpxactionPendDMO.getEapWhereColumn());
//	    updateEapEpxactionPendDMO.setEapWhereType(eapEpxactionPendDMO.getEapWhereType());
//	    updateEapEpxactionPendDMO.setEapChargeCode(eapEpxactionPendDMO.getEapChargeCode());
//	    updateEapEpxactionPendDMO.setEapVoiceMess(eapEpxactionPendDMO.getEapVoiceMess());
//	    updateEapEpxactionPendDMO.setEapAmnActionId(eapEpxactionPendDMO.getEapAmnActionId());
//	    updateEapEpxactionPendDMO.setEapAmnTargType(eapEpxactionPendDMO.getEapAmnTargType());
//	    updateEapEpxactionPendDMO.setEapAmnTargGrp(eapEpxactionPendDMO.getEapAmnTargGrp());
//	    updateEapEpxactionPendDMO.setEapAmnTargUser(eapEpxactionPendDMO.getEapAmnTargUser());
//	    updateEapEpxactionPendDMO.setEapAmnDeadline(eapEpxactionPendDMO.getEapAmnDeadline());
//	    updateEapEpxactionPendDMO.setEapAmnStatus(eapEpxactionPendDMO.getEapAmnStatus());
//	    updateEapEpxactionPendDMO.setEapAmnSource(eapEpxactionPendDMO.getEapAmnSource());
//	    updateEapEpxactionPendDMO.setEapAmnOpenedBy(eapEpxactionPendDMO.getEapAmnOpenedBy());
//	    updateEapEpxactionPendDMO.setEapUdaActionId(eapEpxactionPendDMO.getEapUdaActionId());
//	    updateEapEpxactionPendDMO.setEapStatus(eapEpxactionPendDMO.getEapStatus());
//	    updateEapEpxactionPendDMO.setEapRetryRemain(eapEpxactionPendDMO.getEapRetryRemain());
//	    updateEapEpxactionPendDMO.setEapLastRetry(eapEpxactionPendDMO.getEapLastRetry());
//	    updateEapEpxactionPendDMO.setEapErrorText(eapEpxactionPendDMO.getEapErrorText());
//	    updateEapEpxactionPendDMO.setEapSubmitted(eapEpxactionPendDMO.getEapSubmitted());
//	    updateEapEpxactionPendDMO.setEapActioned(eapEpxactionPendDMO.getEapActioned());
//
//
//	    eapEpxactionPendDAC.modify( updateEapEpxactionPendDMO );
//
//	    // Create a new DMO, set keys, and fetch from the database...
//	    EapEpxactionPendDMO returnEapEpxactionPendDMO = new EapEpxactionPendDMO(  );
//
//	    returnEapEpxactionPendDMO.setEapSubsystem(eapEpxactionPendDMO.getEapSubsystem());
//	    returnEapEpxactionPendDMO.setEapActionSeq(eapEpxactionPendDMO.getEapActionSeq());
//	   
//	    returnEapEpxactionPendDMO = get( returnEapEpxactionPendDMO );
//
//	    return returnEapEpxactionPendDMO;
//	  }


	  public void modify( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "modify( filter )" );
	    
	    eapEpxactionPendDAC.modify( filter );
	  }


	  public void delete( EapEpxactionPendDMO eapEpxactionPendDMO )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "delete( EapEpxactionPendDMO )" );

	    thrower.ifParameterMissing( "EapEpxactionPendDMO", eapEpxactionPendDMO );
	    
	    thrower.ifParameterMissing( "EapEpxactionPendDMO.eapSubsystem", eapEpxactionPendDMO.getEapSubsystem());
	    thrower.ifParameterMissing( "EapEpxactionPendDMO.eapActionSeq", eapEpxactionPendDMO.getEapActionSeq());

	    EapEpxactionPendDMO updateEapEpxactionPendDMO = null;

	    updateEapEpxactionPendDMO = get( eapEpxactionPendDMO );

	    // delete self...
	    eapEpxactionPendDAC.delete( eapEpxactionPendDMO );
	  }


	  public void delete( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "delete( filter )" );

	    thrower.ifParameterMissing( "filter", filter );

	    // delete...
	    eapEpxactionPendDAC.delete( filter );
	  }


	  public boolean exists( EapEpxactionPendDMO eapEpxactionPendDMO )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "exists(eaaEpxactionAllw)" );

	    thrower.ifParameterMissing( "EapEpxactionPendDMO", eapEpxactionPendDMO );

	    thrower.ifParameterMissing( "EapEpxactionPendDMO.eapSubsystem", eapEpxactionPendDMO.getEapSubsystem());
	    thrower.ifParameterMissing( "EapEpxactionPendDMO.eapActionSeq", eapEpxactionPendDMO.getEapActionSeq());


	    return eapEpxactionPendDAC.exists( eapEpxactionPendDMO );
	  }


	  public boolean exists( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "exists(filter)" );

	    return eapEpxactionPendDAC.exists( filter );
	  }

//	  public DTOList getList(
//	    DTOListState state,
//	    QueryFilter  filter )
//	    throws EPPIXBusinessException, EPPIXUnexpectedException,
//	      EPPIXFatalException {
//	    logger.debug( "getList( state, filter )" );
//
//	    return eapEpxactionPendDAC.getList( state, filter );
//	  }

	  public DAOIterator iterate( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "iterate( filter )" );

	    return eapEpxactionPendDAC.iterate( filter );
	  }


	  public DAOIterator iterateWithLock( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "iterateWithLock( filter )" );

	    return eapEpxactionPendDAC.iterateWithLock( filter );
	  }


	  public EapEpxactionPendDMO get( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "get( filter )" );

	    thrower.ifParameterMissing( "filter", filter );

	    EapEpxactionPendDMO eapEpxactionPendDMO = eapEpxactionPendDAC.get( filter );

	    return eapEpxactionPendDMO;
	  }


	  public Object max( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "max( filter )" );

	    thrower.ifParameterMissing( "filter", filter );

	    return eapEpxactionPendDAC.max( filter );
	  }


	  public Object min( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "min( filter )" );

	    thrower.ifParameterMissing( "filter", filter );

	    return eapEpxactionPendDAC.min( filter );
	  }


	  public Integer count( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "count( filter )" );

	    thrower.ifParameterMissing( "filter", filter );

	    return new Integer(eapEpxactionPendDAC.count( filter ));
	  }

}
