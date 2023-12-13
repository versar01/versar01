package com.eppixcomm.eppix.base.blo;

import org.apache.log4j.Logger;

import com.eppixcomm.eppix.common.data.DAC;
import com.eppixcomm.eppix.common.data.DTOActionTypes;
import com.eppixcomm.eppix.common.util.DateTime;
import com.eppixcomm.eppix.base.error.EPPIXBusinessException;
import com.eppixcomm.eppix.base.error.EPPIXFatalException;
import com.eppixcomm.eppix.base.error.EPPIXSeriousException;
import com.eppixcomm.eppix.base.error.EPPIXUnexpectedException;
import com.eppixcomm.eppix.base.error.Thrower;

public class SmhSimHistory   extends SmhSimHistoryAbstractBLO
implements DTOActionTypes, BaseMessages{
	
//	protected SmhSimHistoryAbstractDAC smhSimHistoryDAC;
    static Thrower thrower = Thrower.getThrower( SmhSimHistory.class );
	protected static final String ENTITY_ID = "SYS";
	protected Logger logger = thrower.getLogger(  );

	protected void setDAC(DAC dac) {
//		this.smhSimHistoryDAC = (SmhSimHistoryAbstractDAC)dac;
		super.smhAbstractDAC = (SmhSimHistoryAbstractDAC)dac;
	}

	protected Class getDACClass() {
		return SmhSimHistoryAbstractDAC.class;
	}

}
