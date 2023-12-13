package com.eppixcomm.eppix.base.blo;

import com.eppixcomm.eppix.common.data.IntegerDMO;
import com.eppixcomm.eppix.common.data.DTOList;
import com.eppixcomm.eppix.common.data.DTOListState;
import com.eppixcomm.eppix.base.error.EPPIXSeriousException;

public interface EiEppixIsisAbstractDAC {

	public DTOList getList(DTOListState state, EiEppixIsisDMO eiDMO) 
	throws EPPIXSeriousException;
	
	public DTOList getEiEppixIsisbySpid(DTOListState state, EiEppixIsisDMO eiDMO) 
	throws EPPIXSeriousException;

}
