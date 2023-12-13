package com.eppixcomm.eppix.base.blo;

import com.eppixcomm.eppix.base.error.EPPIXObjectExpiredException;
import com.eppixcomm.eppix.base.error.EPPIXObjectNotFoundException;
import com.eppixcomm.eppix.base.error.EPPIXSeriousException;
import com.eppixcomm.eppix.common.data.DAOIterator;
import com.eppixcomm.eppix.common.data.DTOList;
import com.eppixcomm.eppix.common.data.DTOListState;
import com.eppixcomm.eppix.common.util.QueryFilter;

public interface Hm2HandsetModelAbstractDAC{


	  public Hm2HandsetModelDMO get( Hm2HandsetModelDMO hm2HandsetModelDMO )
	    throws EPPIXSeriousException;
	  
	  public void create( Hm2HandsetModelDMO hm2HandsetModelDMO )
	    throws EPPIXSeriousException;

//	  public void modify( Hm2HandsetModelDMO hm2HandsetModelDMO )
//	    throws EPPIXSeriousException, EPPIXObjectExpiredException,
//	      EPPIXObjectNotFoundException;

	  public void delete( Hm2HandsetModelDMO hm2HandsetModelDMO )
	    throws EPPIXSeriousException, EPPIXObjectNotFoundException,
	      EPPIXObjectExpiredException;


	  public void delete( QueryFilter filter )
	    throws EPPIXSeriousException, EPPIXObjectNotFoundException,
	      EPPIXObjectExpiredException;

	  public void modify( QueryFilter filter )
	    throws EPPIXSeriousException, EPPIXObjectExpiredException,
	      EPPIXObjectNotFoundException;

	  public boolean exists( Hm2HandsetModelDMO hm2HandsetModelDMO )
	    throws EPPIXSeriousException;


	  public boolean exists( QueryFilter filter )
	    throws EPPIXSeriousException;


	  public DTOList getList( 
	    DTOListState        state,
	    Hm2HandsetModelDMO hm2HandsetModelDMO )
	    throws EPPIXSeriousException;

	  public DTOList getList( 
	    DTOListState state,
	    QueryFilter  filter )
	    throws EPPIXSeriousException;


	  public DAOIterator iterate( QueryFilter filter )
	    throws EPPIXSeriousException;


	  public DAOIterator iterateWithLock( 
	    QueryFilter filter )
	    throws EPPIXSeriousException;


	  public Hm2HandsetModelDMO get( QueryFilter filter )
	    throws EPPIXSeriousException;


	  public Object max( QueryFilter filter )
	    throws EPPIXSeriousException;


	  public Object min( QueryFilter filter )
	    throws EPPIXSeriousException;


	  public int count( QueryFilter filter )
	    throws EPPIXSeriousException;


}