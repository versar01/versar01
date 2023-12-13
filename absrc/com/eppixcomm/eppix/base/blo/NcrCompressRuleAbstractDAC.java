package com.eppixcomm.eppix.base.blo;

import java.util.Iterator;
import java.util.List;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DAOIterator;
import com.eppixcomm.eppix.common.data.DAOParamQueryArgs;
import com.eppixcomm.eppix.common.data.DMO;
import com.eppixcomm.eppix.common.util.FilterPart;
import com.eppixcomm.eppix.common.util.QueryFilter;
import com.eppixcomm.eppix.common.data.DTOList;
import com.eppixcomm.eppix.common.data.DTOListState;
import com.eppixcomm.eppix.base.error.EPPIXObjectBusyException;
import com.eppixcomm.eppix.base.error.EPPIXObjectExpiredException;
import com.eppixcomm.eppix.base.error.EPPIXObjectNotFoundException;
import com.eppixcomm.eppix.base.error.EPPIXSeriousException;

public interface NcrCompressRuleAbstractDAC {

	  public void create( NcrCompressRuleDMO ncrCompressRuleDMO )
	    throws EPPIXSeriousException;

	  public NcrCompressRuleDMO lock( NcrCompressRuleDMO ncrCompressRuleDMO )
	    throws EPPIXSeriousException, EPPIXObjectBusyException;

	  public void modify( QueryFilter filter )
	    throws EPPIXSeriousException, EPPIXObjectExpiredException,
	      EPPIXObjectNotFoundException;

	  public void delete( QueryFilter filter )
	    throws EPPIXSeriousException, EPPIXObjectNotFoundException,
	      EPPIXObjectExpiredException;

	  public boolean exists( QueryFilter filter )
	    throws EPPIXSeriousException;

	  public DTOList getList( 
	    DTOListState    state,
	    NcrCompressRuleDMO ncrCompressRuleDMO )
	    throws EPPIXSeriousException;

	  public DTOList getList( 
	    DTOListState state,
	    QueryFilter  filter )
	    throws EPPIXSeriousException;

	  public DAOIterator iterate( QueryFilter filter )
	    throws EPPIXSeriousException;

	  public DAOIterator iterateWithLock( QueryFilter filter )
	    throws EPPIXSeriousException;

	  public NcrCompressRuleDMO get( QueryFilter filter )
	    throws EPPIXSeriousException;

	  public Object max( QueryFilter filter )
	    throws EPPIXSeriousException;


	  public Object min( QueryFilter filter )
	    throws EPPIXSeriousException;

	  public int count( QueryFilter filter )
	    throws EPPIXSeriousException;

}
