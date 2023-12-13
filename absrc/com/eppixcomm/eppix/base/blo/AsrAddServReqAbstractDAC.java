package com.eppixcomm.eppix.base.blo;

import java.util.Iterator;

import com.eppixcomm.eppix.base.error.EPPIXObjectExpiredException;
import com.eppixcomm.eppix.base.error.EPPIXObjectNotFoundException;
import com.eppixcomm.eppix.base.error.EPPIXSeriousException;
import com.eppixcomm.eppix.common.data.DAOIterator;
import com.eppixcomm.eppix.common.util.QueryFilter;



public interface AsrAddServReqAbstractDAC{


	  public void create( AsrAddServReqDMO asrAddServReqDMO )
	    throws EPPIXSeriousException;

	  public void modify( AsrAddServReqDMO asrAddServReqDMO )
	    throws EPPIXSeriousException, EPPIXObjectExpiredException,
	      EPPIXObjectNotFoundException;

	  public void delete( AsrAddServReqDMO asrAddServReqDMO )
	    throws EPPIXSeriousException, EPPIXObjectNotFoundException,
	      EPPIXObjectExpiredException;


	  public void delete( QueryFilter filter )
	    throws EPPIXSeriousException, EPPIXObjectNotFoundException,
	      EPPIXObjectExpiredException;

	  public void modify( QueryFilter filter )
	    throws EPPIXSeriousException, EPPIXObjectExpiredException,
	      EPPIXObjectNotFoundException;

	  public boolean exists( AsrAddServReqDMO asrAddServReqDMO )
	    throws EPPIXSeriousException;


	  public boolean exists( QueryFilter filter )
	    throws EPPIXSeriousException;

//
//	  public DAOIterator iterate( QueryFilter filter )
//	    throws EPPIXSeriousException;
	  
	  public Iterator iterate( QueryFilter filter )
	    throws EPPIXSeriousException;


	  public DAOIterator iterateWithLock( 
	    QueryFilter filter )
	    throws EPPIXSeriousException;


	  public AsrAddServReqDMO get( QueryFilter filter )
	    throws EPPIXSeriousException;


	  public Object max( QueryFilter filter )
	    throws EPPIXSeriousException;


	  public Object min( QueryFilter filter )
	    throws EPPIXSeriousException;


	  public int count( QueryFilter filter )
	    throws EPPIXSeriousException;




}