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
import com.eppixcomm.eppix.base.error.EPPIXUnexpectedException;
import com.eppixcomm.eppix.base.error.Thrower;

public class EdEventDependsAbstractBLO extends BaseBLO 
			implements DTOActionTypes, BaseMessages{
	
	protected EdEventDependsAbstractDAC edEventDependsDAC;
	static Thrower thrower = Thrower.getThrower( EdEventDependsAbstractBLO.class );
	protected Logger logger = thrower.getLogger(  );

//~ Methods ////////////////////////////////////////////////////////////////
	
	protected void setDAC(DAC dac) {
		// TODO Auto-generated method stub
		edEventDependsDAC = (EdEventDependsAbstractDAC) dac;
	}

	  /** Invoked by the BLOBinder to get the DAC class for this BLO. */
	  protected Class getDACClass(  ) {
	    return EdEventDependsAbstractDAC.class;
	  }
//=============================================================================
	  public DTOList getList( 
			    DTOListState    state,
			    EdEventDependsDMO edEventDependsDMO )
			    throws EPPIXBusinessException, EPPIXUnexpectedException,
			      EPPIXFatalException {
			    logger.debug( "getList( state, edEventDependsDMO )" );

			    return edEventDependsDAC.getList( state, edEventDependsDMO );
			  }

			  /**
			  * Creates the EdEventDepends object. As a side effect, following creation
			  * of a EdEventDepends an audit object may be created.
			  * <p>
			  * <B>Possible application exceptions:</B>
			  * <dl><dd>
			  *     <li>The normal general errors:
			  *          {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>
			  * </dd></dl><br>
			  * @param EdEventDependsDMO EdEventDependsDMO object<br>
			  *   <dl><dd>
			  *   </dd></dl><br>
			  *
			  * @return populated EdEventDependsDMO object.
			  *
			  * @throws EPPIXBusinessException
			  * @throws EPPIXUnexpectedException
			  * @throws EPPIXFatalException
			  */
			  public EdEventDependsDMO create( EdEventDependsDMO edEventDependsDMO )
			    throws EPPIXBusinessException, EPPIXUnexpectedException,
			      EPPIXFatalException {
			    logger.debug( "create( edEventDependsDMO )" );

			    thrower.ifParameterMissing( "EdEventDependsDMO", edEventDependsDMO );

			    thrower.ifParameterMissing( "EdEventDependsDMO.edParent",
			      edEventDependsDMO.getEdParent());

			    thrower.ifParameterMissing( "EdEventDependsDMO.edChild",
			      edEventDependsDMO.getEdChild());

//			    thrower.ifParameterMissing( "EdEventDependsDMO.edBond",
//			      edEventDependsDMO.getEdBond());

			    //
			    // Now create the EdEventDepends
			    //
			    edEventDependsDAC.create( edEventDependsDMO );

			    return edEventDependsDMO;
			  }

			  /**
			  * Modifies the EdEventDepends object.
			  * <p>
			  * <B>Possible application exceptions:</B>
			  * <dl><dd>
			  *     <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#ECEVENTCOMMAND_002}</li>
			  *     <li>The normal general errors:
			  *          {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>
			  * </dd></dl><br>
			  * @param EdEventDependsDMO object<br>
			  * @param filter object<br>
			  *   <dl><dd>
			  *   </dd></dl><br>
			  *
			  * @return populated EdEventDependsDMO object.
			  *
			  * @throws EPPIXBusinessException
			  * @throws EPPIXUnexpectedException
			  * @throws EPPIXFatalException
			  */
			  public void modify( QueryFilter filter )
			    throws EPPIXBusinessException, EPPIXUnexpectedException,
			      EPPIXFatalException {
			    logger.debug( "modify( filter )" );

			    //
			    // Modify the EdEventDependsDMO
			    //
			    edEventDependsDAC.modify( filter );
			  }

			  /**
			   * Deletes the EdEventDepends object.
			   * <p>
			   * <B>Possible application exceptions:</B>
			   * <dl><dd>
			   *     <li>The normal general errors:
			   *          {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>
			   * </dd></dl>
			   *  @param QueryFilter filter.
			   *
			   * @throws EPPIXBusinessException
			   * @throws EPPIXUnexpectedException
			   * @throws EPPIXFatalException
			   */
			  public void delete( QueryFilter filter )
			    throws EPPIXBusinessException, EPPIXUnexpectedException,
			      EPPIXFatalException {
			    logger.debug( "delete( filter )" );

			    thrower.ifParameterMissing( "filter", filter );

			    // delete...
			    edEventDependsDAC.delete(filter);
			  }

			  /**
			   * Indicates whether a EdEventDepends exists in the database
			   * <p>
			   * <B>Possible application exceptions:</B>
			   * <dl><dd>
			   *     <li>The normal general errors:
			   *          {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>
			   * </dd></dl>
			   *
			   *
			   * @return true if the EdEventDepends exists in the database
			   *
			   * @throws EPPIXBusinessException
			   * @throws EPPIXUnexpectedException
			   * @throws EPPIXFatalException
			   */
			  public boolean exists( QueryFilter filter )
			    throws EPPIXBusinessException, EPPIXUnexpectedException,
			      EPPIXFatalException {
			    logger.debug( "exists(filter)" );

			    return edEventDependsDAC.exists( filter );
			  }

			  //---------------------------------------------------------------------------------------------------------
			  /**
			   * DOCUMENT ME!
			   *
			   * @param state DOCUMENT ME!
			   * @param filter DOCUMENT ME!
			   *
			   * @return DOCUMENT ME!
			   *
			   * @throws EPPIXBusinessException DOCUMENT ME!
			   * @throws EPPIXUnexpectedException DOCUMENT ME!
			   * @throws EPPIXFatalException DOCUMENT ME!
			   */
			  public DTOList getList( 
			    DTOListState state,
			    QueryFilter  filter )
			    throws EPPIXBusinessException, EPPIXUnexpectedException,
			      EPPIXFatalException {
			    logger.debug( "getList( state, filter )" );

			    return edEventDependsDAC.getList( state, filter );
			  }

			  /**
			   * DOCUMENT ME!
			   *
			   * @param filter DOCUMENT ME!
			   *
			   * @return DOCUMENT ME!
			   *
			   * @throws EPPIXBusinessException DOCUMENT ME!
			   * @throws EPPIXUnexpectedException DOCUMENT ME!
			   * @throws EPPIXFatalException DOCUMENT ME!
			   */
			  public DAOIterator iterate( QueryFilter filter )
			    throws EPPIXBusinessException, EPPIXUnexpectedException,
			      EPPIXFatalException {
			    logger.debug( "iterate( filter )" );

			    return edEventDependsDAC.iterate( filter );
			  }

			  /**
			   * DOCUMENT ME!
			   *
			   * @param filter DOCUMENT ME!
			   *
			   * @return DOCUMENT ME!
			   *
			   * @throws EPPIXBusinessException DOCUMENT ME!
			   * @throws EPPIXUnexpectedException DOCUMENT ME!
			   * @throws EPPIXFatalException DOCUMENT ME!
			   */
			  public DAOIterator iterateWithLock( QueryFilter filter )
			    throws EPPIXBusinessException, EPPIXUnexpectedException,
			      EPPIXFatalException {
			    logger.debug( "iterateWithLock( filter )" );

			    return edEventDependsDAC.iterateWithLock( filter );
			  }

			  /**
			   * DOCUMENT ME!
			   *
			   * @param filter DOCUMENT ME!
			   *
			   * @return DOCUMENT ME!
			   *
			   * @throws EPPIXBusinessException DOCUMENT ME!
			   * @throws EPPIXUnexpectedException DOCUMENT ME!
			   * @throws EPPIXFatalException DOCUMENT ME!
			   */
			  public EdEventDependsDMO get( QueryFilter filter )
			    throws EPPIXBusinessException, EPPIXUnexpectedException,
			      EPPIXFatalException {
			    logger.debug( "get( filter )" );

			    //
			    // Check mandatory parameters.
			    //
			    thrower.ifParameterMissing( "filter", filter );

			    //
			    // Attempt to get the EdEventDependsDMO
			    //
			    EdEventDependsDMO edEventDependsDMO = edEventDependsDAC.get( filter );

			    return edEventDependsDMO;
			  }

			  /**
			   * DOCUMENT ME!
			   *
			   * @param filter DOCUMENT ME!
			   *
			   * @return DOCUMENT ME!
			   *
			   * @throws EPPIXBusinessException DOCUMENT ME!
			   * @throws EPPIXUnexpectedException DOCUMENT ME!
			   * @throws EPPIXFatalException DOCUMENT ME!
			   */
			  public Object max( QueryFilter filter )
			    throws EPPIXBusinessException, EPPIXUnexpectedException,
			      EPPIXFatalException {
			    logger.debug( "max( filter )" );

			    //
			    // Check mandatory parameters.
			    //
			    thrower.ifParameterMissing( "filter", filter );

			    return edEventDependsDAC.max( filter );
			  }

			  /**
			   * DOCUMENT ME!
			   *
			   * @param filter DOCUMENT ME!
			   *
			   * @return DOCUMENT ME!
			   *
			   * @throws EPPIXBusinessException DOCUMENT ME!
			   * @throws EPPIXUnexpectedException DOCUMENT ME!
			   * @throws EPPIXFatalException DOCUMENT ME!
			   */
			  public Object min( QueryFilter filter )
			    throws EPPIXBusinessException, EPPIXUnexpectedException,
			      EPPIXFatalException {
			    logger.debug( "min( filter )" );

			    //
			    // Check mandatory parameters.
			    //
			    thrower.ifParameterMissing( "filter", filter );

			    return edEventDependsDAC.min( filter );
			  }

			  /**
			   * Counts the number of rows for the specified filter.
			   *
			   * @param filter the query filter
			   * @return the count of rows.
			   *
			   * @throws EPPIXBusinessException
			   * @throws EPPIXUnexpectedException
			   * @throws EPPIXFatalException
			   */
			  public Integer count( QueryFilter filter )
			    throws EPPIXBusinessException, EPPIXUnexpectedException,
			      EPPIXFatalException {
			    logger.debug( "count( filter )" );

			    //
			    // Check mandatory parameters.
			    //
			    thrower.ifParameterMissing( "filter", filter );

			    // return Integer.valueOf(edEventDependsDAC.count( filter ));
			    // Narayana Sai - 25/07/2008 - Code should Compatible with 1.4 as per MTN Standards
			    return new Integer(edEventDependsDAC.count( filter ));
			  }
	  
//=============================================================================	  

}
