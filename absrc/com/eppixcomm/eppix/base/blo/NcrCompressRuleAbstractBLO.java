package com.eppixcomm.eppix.base.blo;

import org.apache.log4j.Logger;

import com.eppixcomm.eppix.common.data.DAC;
import com.eppixcomm.eppix.common.data.DAOIterator;
import com.eppixcomm.eppix.common.util.QueryFilter;
import com.eppixcomm.eppix.common.data.DTOActionTypes;
import com.eppixcomm.eppix.common.data.DTOList;
import com.eppixcomm.eppix.common.data.DTOListState;
import com.eppixcomm.eppix.base.error.EPPIXBusinessException;
import com.eppixcomm.eppix.base.error.EPPIXFatalException;
import com.eppixcomm.eppix.base.error.EPPIXObjectBusyException;
import com.eppixcomm.eppix.base.error.EPPIXSeriousException;
import com.eppixcomm.eppix.base.error.EPPIXUnexpectedException;
import com.eppixcomm.eppix.base.error.Thrower;

public class NcrCompressRuleAbstractBLO    extends BaseBLO
implements DTOActionTypes, BaseMessages{

	  /** DOCUMENT ME! */
	  static Thrower thrower = Thrower.getThrower( NcrCompressRuleAbstractBLO.class );
	  /** DOCUMENT ME! */
	  protected static final String ENTITY_ID = "NCR";
	  
	  /** Data Access Controller. */
	  protected NcrCompressRuleAbstractDAC ncrCompressRuleDAC;
	  
	  /** DOCUMENT ME! */
	  protected Logger logger = thrower.getLogger(  );

	  //~ Methods ////////////////////////////////////////////////////////////////

	  /** Invoked by the BLOBinder to get the DAC class for this BLO. */
	  protected Class getDACClass(  ) {
	    return NcrCompressRuleAbstractDAC.class;
	  }	  
	  
	  /** Invoked by the BLOBinder to provide this BLO with its DAC. */
	  protected void setDAC( DAC dac ) {
	    this.ncrCompressRuleDAC = (NcrCompressRuleAbstractDAC) dac;
	  }
	  
	  public DTOList getList( 
			    DTOListState    state,
			    NcrCompressRuleDMO ncrCompressRuleDMO )
			    throws EPPIXBusinessException, EPPIXUnexpectedException,
			      EPPIXFatalException {
			    logger.debug( "getList( state, ncrCompressRuleDMO )" );

			    return ncrCompressRuleDAC.getList( state, ncrCompressRuleDMO );
			  }

			  public NcrCompressRuleDMO create( NcrCompressRuleDMO ncrCompressRuleDMO )
			    throws EPPIXBusinessException, EPPIXUnexpectedException,
			      EPPIXFatalException {
			    logger.debug( "create( ncrCompressRuleDMO )" );

			    thrower.ifParameterMissing( "ncrCompressRuleDMO", ncrCompressRuleDMO );

			    thrower.ifParameterMissing( "ncrCompressRuleDMO.ncrCompressCode",
			    		ncrCompressRuleDMO.getNcrCompressCode());

			    thrower.ifParameterMissing( "ncrCompressRuleDMO.ntrCode",
			    		ncrCompressRuleDMO.getNcrCode());

			    ncrCompressRuleDAC.create( ncrCompressRuleDMO );

			    return ncrCompressRuleDMO;
			  }

			  public void modify( QueryFilter filter )
			    throws EPPIXBusinessException, EPPIXUnexpectedException,
			      EPPIXFatalException {
			    logger.debug( "modify( filter )" );

			    //
			    // Modify the ncrCompressRuleDMO
			    //
			    ncrCompressRuleDAC.modify( filter );
			  }

			  public void delete( QueryFilter filter )
			    throws EPPIXBusinessException, EPPIXUnexpectedException,
			      EPPIXFatalException {
			    logger.debug( "delete( filter )" );

			    thrower.ifParameterMissing( "filter", filter );

			    // delete...
			    ncrCompressRuleDAC.delete( filter );
			  }

			  public boolean exists( QueryFilter filter )
			    throws EPPIXBusinessException, EPPIXUnexpectedException,
			      EPPIXFatalException {
			    logger.debug( "exists(filter)" );

			    return ncrCompressRuleDAC.exists( filter );
			  }

			  //---------------------------------------------------------------------------------------------------------
			  public DTOList getList( 
			    DTOListState state,
			    QueryFilter  filter )
			    throws EPPIXBusinessException, EPPIXUnexpectedException,
			      EPPIXFatalException {
			    logger.debug( "getList( state, filter )" );

			    return ncrCompressRuleDAC.getList( state, filter );
			  }

			  public DAOIterator iterate( QueryFilter filter )
			    throws EPPIXBusinessException, EPPIXUnexpectedException,
			      EPPIXFatalException {
			    logger.debug( "iterate( filter )" );

			    return ncrCompressRuleDAC.iterate( filter );
			  }

			  public DAOIterator iterateWithLock( QueryFilter filter )
			    throws EPPIXBusinessException, EPPIXUnexpectedException,
			      EPPIXFatalException {
			    logger.debug( "iterateWithLock( filter )" );

			    return ncrCompressRuleDAC.iterateWithLock( filter );
			  }

			  public NcrCompressRuleDMO get( QueryFilter filter )
			    throws EPPIXBusinessException, EPPIXUnexpectedException,
			      EPPIXFatalException {
			    logger.debug( "get( filter )" );

			    //
			    // Check mandatory parameters.
			    //
			    thrower.ifParameterMissing( "filter", filter );

			    //
			    // Attempt to get the NcrCompressRuleDMO
			    //
			    NcrCompressRuleDMO ncrCompressRuleDMO = ncrCompressRuleDAC.get( filter );
			    return ncrCompressRuleDMO;
			  }

			  public Object max( QueryFilter filter )
			    throws EPPIXBusinessException, EPPIXUnexpectedException,
			      EPPIXFatalException {
			    logger.debug( "max( filter )" );

			    //
			    // Check mandatory parameters.
			    //
			    thrower.ifParameterMissing( "filter", filter );

			    return ncrCompressRuleDAC.max( filter );
			  }

			  public Object min( QueryFilter filter )
			    throws EPPIXBusinessException, EPPIXUnexpectedException,
			      EPPIXFatalException {
			    logger.debug( "min( filter )" );

			    //
			    // Check mandatory parameters.
			    //
			    thrower.ifParameterMissing( "filter", filter );

			    return ncrCompressRuleDAC.min( filter );
			  }

			  public Integer count( QueryFilter filter )
			    throws EPPIXBusinessException, EPPIXUnexpectedException,
			      EPPIXFatalException {
			    logger.debug( "count( filter )" );

			    thrower.ifParameterMissing( "filter", filter );

			    return new Integer(ncrCompressRuleDAC.count( filter ));
			  }
			  
			  public NcrCompressRuleDMO lock( NcrCompressRuleDMO ncrCompressRuleDMO )
			    throws EPPIXSeriousException, EPPIXObjectBusyException {
			    logger.debug( "lock( ncrCompressRuleDMO )" );
			    
			    thrower.ifParameterMissing( "ncrCompressRuleDMO", ncrCompressRuleDMO );
			    
			    return ncrCompressRuleDAC.lock(ncrCompressRuleDMO);
			  }  	  
}

