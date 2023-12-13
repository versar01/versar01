package com.eppixcomm.eppix.base.blo;

import com.eppixcomm.eppix.common.data.DAOIterator;
import com.eppixcomm.eppix.common.util.QueryFilter;
import com.eppixcomm.eppix.common.data.DTOList;
import com.eppixcomm.eppix.common.data.DTOListState;
import com.eppixcomm.eppix.base.error.EPPIXObjectBusyException;
import com.eppixcomm.eppix.base.error.EPPIXObjectExpiredException;
import com.eppixcomm.eppix.base.error.EPPIXObjectNotFoundException;
import com.eppixcomm.eppix.base.error.EPPIXSeriousException;

public interface SmhSimHistoryAbstractDAC {

	
	  public SmhSimHistoryDMO get( SmhSimHistoryDMO smhSimHistoryDMO )
	    throws EPPIXSeriousException;

	  public void create( SmhSimHistoryDMO smhSimHistoryDMO )
	    throws EPPIXSeriousException;

//	  public SmhSimHistoryDMO lock( SmhSimHistoryDMO smhSimHistoryDMO )
//	    throws EPPIXSeriousException, EPPIXObjectBusyException;

//	  public void modify( SmhSimHistoryDMO smhSimHistoryDMO )
//	    throws EPPIXSeriousException, EPPIXObjectExpiredException,
//	      EPPIXObjectNotFoundException;

//	  public void delete( SmhSimHistoryDMO smhSimHistoryDMO )
//	    throws EPPIXSeriousException, EPPIXObjectNotFoundException,
//	      EPPIXObjectExpiredException;

//	  public void delete( QueryFilter filter )
//	    throws EPPIXSeriousException, EPPIXObjectNotFoundException,
//	      EPPIXObjectExpiredException;

//	  public void modify( QueryFilter filter )
//	    throws EPPIXSeriousException, EPPIXObjectExpiredException,
//	      EPPIXObjectNotFoundException;

//	  public boolean exists( SmhSimHistoryDMO smhSimHistoryDMO )
//	    throws EPPIXSeriousException;

	  public boolean exists( QueryFilter filter )
	    throws EPPIXSeriousException;

//	  public DTOList getList( 
//	    DTOListState state,
//	    SmhSimHistoryDMO smhSimHistoryDMO )
//	    throws EPPIXSeriousException;

	  public DTOList getList( 
	    DTOListState state,
	    QueryFilter  filter )
	    throws EPPIXSeriousException;

	  public DAOIterator iterate( QueryFilter filter )
	    throws EPPIXSeriousException;

//	  public DAOIterator iterateWithLock( QueryFilter filter )
//	    throws EPPIXSeriousException;

	  public SmhSimHistoryDMO get( QueryFilter filter )
	    throws EPPIXSeriousException;


	  public Object max( QueryFilter filter )
	    throws EPPIXSeriousException;


	  public Object min( QueryFilter filter )
	    throws EPPIXSeriousException;


	  public int count( QueryFilter filter )
	    throws EPPIXSeriousException;	
}
