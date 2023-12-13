package com.eppixcomm.eppix.base.blo;

import com.eppixcomm.eppix.common.data.DAOIterator;
import com.eppixcomm.eppix.common.util.QueryFilter;
import com.eppixcomm.eppix.common.data.DTOList;
import com.eppixcomm.eppix.common.data.DTOListState;
import com.eppixcomm.eppix.base.error.EPPIXObjectBusyException;
import com.eppixcomm.eppix.base.error.EPPIXObjectExpiredException;
import com.eppixcomm.eppix.base.error.EPPIXObjectNotFoundException;
import com.eppixcomm.eppix.base.error.EPPIXSeriousException;

public interface SeqMapN2NAbstractDAC{
	  public SeqMapN2NDMO get( SeqMapN2NDMO seqMapN2NDMO )
	    throws EPPIXSeriousException;
	  
	  public DTOList getList( 
	    DTOListState        state,
	    SeqMapN2NDMO seqMapN2NDMO )
	    throws EPPIXSeriousException;
	
	  public DTOList getList( 
	    DTOListState state,
	    QueryFilter  filter )
	    throws EPPIXSeriousException;
	  
	  public void create( SeqMapN2NDMO seqMapN2NDMO )
	    throws EPPIXSeriousException;


	  public SeqMapN2NDMO lock( SeqMapN2NDMO aSeqMapN2NDMO )
	    throws EPPIXSeriousException, EPPIXObjectBusyException;


	  public void modify( SeqMapN2NDMO seqMapN2NDMO )
	    throws EPPIXSeriousException, EPPIXObjectExpiredException,
	      EPPIXObjectNotFoundException;

	  public void delete( SeqMapN2NDMO seqMapN2NDMO )
	    throws EPPIXSeriousException, EPPIXObjectNotFoundException,
	      EPPIXObjectExpiredException;

	  public void delete( QueryFilter filter )
	    throws EPPIXSeriousException, EPPIXObjectNotFoundException,
	      EPPIXObjectExpiredException;


	  public void modify( QueryFilter filter )
	    throws EPPIXSeriousException, EPPIXObjectExpiredException,
	      EPPIXObjectNotFoundException;

	  public boolean exists( SeqMapN2NDMO seqMapN2NDMO )
	    throws EPPIXSeriousException;


	  public boolean exists( QueryFilter filter )
	    throws EPPIXSeriousException;

	  public DAOIterator iterate( QueryFilter filter )
	    throws EPPIXSeriousException;


	  public DAOIterator iterateWithLock( QueryFilter filter )
	    throws EPPIXSeriousException;


	  public SeqMapN2NDMO get( QueryFilter filter )
	    throws EPPIXSeriousException;


	  public Object max( QueryFilter filter )
	    throws EPPIXSeriousException;


	  public Object min( QueryFilter filter )
	    throws EPPIXSeriousException;


	  public int count( QueryFilter filter )
	    throws EPPIXSeriousException;
}
