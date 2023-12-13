package com.eppixcomm.eppix.base.blo;

import org.apache.log4j.Logger;

import com.eppixcomm.eppix.common.data.DAC;
import com.eppixcomm.eppix.common.data.DTOActionTypes;
import com.eppixcomm.eppix.base.error.EPPIXSeriousException;
import com.eppixcomm.eppix.base.error.Thrower;

public class SeqMapN2N  extends SeqMapN2NAbstractBLO 
implements DTOActionTypes, BaseMessages{

	protected SeqMapN2NAbstractDAC seqMapN2NDAC;
	static Thrower thrower = Thrower.getThrower( AneApnNonEppixAbstractBLO.class );
	protected Logger logger = thrower.getLogger(  );

//	protected void setDAC(DAC dac) {
//		// TODO Auto-generated method stub
//		this.seqMapN2NDAC = (SeqMapN2NAbstractDAC)dac;
//	}
	
//	  public void create( SeqMapN2NDMO seqMapN2NDMO )
//	    throws EPPIXSeriousException {
//	    logger.debug( "create( seqMapN2NDMO )" );
//	    
//	    thrower.ifParameterMissing( "seqMapN2NDMO", seqMapN2NDMO );
//
//	    thrower.ifParameterMissing( "seqN2ntransId", seqMapN2NDMO.getSeqN2ntransId());
//	    thrower.ifParameterMissing( "seqNetwktransId", seqMapN2NDMO.getSeqNetwktransId());
//	    thrower.ifParameterMissing( "seqProviderId", seqMapN2NDMO.getSeqProviderId());
//	    thrower.ifParameterMissing( "seqStatus", seqMapN2NDMO.getSeqStatus());
//	    thrower.ifParameterMissing( "seqDatetime", seqMapN2NDMO.getSeqDatetime());
//	    
//	    seqMapN2NDAC.create(seqMapN2NDMO);    
//	    
//	  }

	protected Class getDACClass() {
		return SeqMapN2NAbstractDAC.class;
	}	
}
