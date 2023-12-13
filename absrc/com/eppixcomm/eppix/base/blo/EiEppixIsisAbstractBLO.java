package com.eppixcomm.eppix.base.blo;

import org.apache.log4j.Logger;

import com.eppixcomm.eppix.common.data.DAC;
import com.eppixcomm.eppix.common.data.IntegerDMO;
import com.eppixcomm.eppix.common.data.DTOActionTypes;
import com.eppixcomm.eppix.common.data.DTOList;
import com.eppixcomm.eppix.common.data.DTOListState;
import com.eppixcomm.eppix.base.error.EPPIXBusinessException;
import com.eppixcomm.eppix.base.error.EPPIXFatalException;
import com.eppixcomm.eppix.base.error.EPPIXUnexpectedException;
import com.eppixcomm.eppix.base.error.Thrower;

public class EiEppixIsisAbstractBLO  extends BaseBLO implements DTOActionTypes , BaseMessages{

	protected EiEppixIsisAbstractDAC eiEppixIsisDAC;
	static Thrower thrower = Thrower.getThrower( EdEventDependsAbstractBLO.class );
	protected Logger logger = thrower.getLogger(  );
	
	protected void setDAC(DAC dac) {
		eiEppixIsisDAC = (EiEppixIsisAbstractDAC)dac;		
	}
	
	  /** Invoked by the BLOBinder to get the DAC class for this BLO. */
	  protected Class getDACClass(  ) {
	    return EiEppixIsisAbstractDAC.class;
	  }
	  
	  /**
	   * This list will return all entries in the table id a 
	   * DMO with no values are passed as a paramter.
	   * 
	   * Else a single DMO with a unique Bill Cycle will be returned
	   * 
	   * @param state
	   * @param eiDMO
	   * @return
	   * @throws EPPIXBusinessException
	   * @throws EPPIXUnexpectedException
	   * @throws EPPIXFatalException
	   */
	  public DTOList getList(DTOListState state,
			    EiEppixIsisDMO eiDMO )
			    throws EPPIXBusinessException, EPPIXUnexpectedException,
			      EPPIXFatalException {
			    logger.debug( "getList( state, eiDMO )" );

			    return eiEppixIsisDAC.getList( state, eiDMO );
	 }
	  
	  public DTOList getEiEppixIsisbySpid(DTOListState state,
			    EiEppixIsisDMO eiDMO )
			    throws EPPIXBusinessException, EPPIXUnexpectedException,
			      EPPIXFatalException {
			    logger.debug( "getList( state, eiDMO )" );

			    return eiEppixIsisDAC.getEiEppixIsisbySpid(state, eiDMO );
	 }	  

}
