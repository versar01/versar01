package com.eppixcomm.eppix.base.blo;

import org.apache.log4j.Logger;

import com.eppixcomm.eppix.common.data.DAC;
import com.eppixcomm.eppix.common.data.DAOIterator;
import com.eppixcomm.eppix.common.util.QueryFilter;
import com.eppixcomm.eppix.common.data.DTOActionTypes;
import com.eppixcomm.eppix.common.data.DTOList;
import com.eppixcomm.eppix.base.error.EPPIXBusinessException;
import com.eppixcomm.eppix.base.error.EPPIXFatalException;
import com.eppixcomm.eppix.base.error.EPPIXUnexpectedException;
import com.eppixcomm.eppix.base.error.Thrower;

public class NtpNetTransPendAbstractBLO extends BaseBLO
implements DTOActionTypes, BaseMessages {

	  static Thrower thrower = Thrower.getThrower( NmNetmat.class );

	  protected static final String ENTITY_ID = "NTP";

	  //~ Instance variables /////////////////////////////////////////////////////

	  protected Logger logger = thrower.getLogger(  );

	  protected NtpNetTransPendAbstractDAC ntpNetTransPendDAC;

	  //~ Methods ////////////////////////////////////////////////////////////////


	  protected void setDAC( DAC dac ) {
	    this.ntpNetTransPendDAC = (NtpNetTransPendAbstractDAC) dac;
	  }	

	  public NtpNetTransPendDMO get( NtpNetTransPendDMO ntpnetTransPendDMO )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "get(NtpnetTransPendDMO)" );

	    //
	    // Check mandatory parameters.
	    //
	    thrower.ifParameterMissing( "NtpnetTransPendDMO", ntpnetTransPendDMO );

	    //
	    // Each attribute that is part of the primary key is mandatory
	    //

	    //
	    // Attempt to get the NtpNetTransPendDMO
	    //
	    NtpNetTransPendDMO returnNtpNetTransPendDMO = ntpNetTransPendDAC.get( ntpnetTransPendDMO );

	    //
	    // Could not find the NtpNetTransPendDMO
	    //
	    if ( returnNtpNetTransPendDMO == null ) {
	      thrower.business( Base_NMNETMAT_000,
	        new Object[] { ntpnetTransPendDMO } );
	    }

	    //
	    // Now, based on the values of the flags on this method signature, which in turn,
	    // are based on this objects associations, get all associated, embedded objects
	    //
	    return returnNtpNetTransPendDMO;
	  }


	  /**
	  * Creates the NmNetmat object. As a side effect, following creation
	  * of a nmNetmat an audit object may be created.
	  * <p>
	  * <B>Possible application exceptions:</B>
	  * <dl><dd>
	  *     <li>The normal general errors:
	  *          {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>
	  * </dd></dl><br>
	  * @param NtpnetTransPendDMO NtpnetTransPendDMO object<br>
	  *   <dl><dd>
	  *   </dd></dl><br>
	  *
	  * @return populated NtpnetTransPendDMO object.
	  *
	  * @throws EPPIXBusinessException
	  * @throws EPPIXUnexpectedException
	  * @throws EPPIXFatalException
	  */
	  public NtpNetTransPendDMO create( NtpNetTransPendDMO NtpnetTransPendDMO )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "create( NtpnetTransPendDMO )" );

	    thrower.ifParameterMissing( "NtpnetTransPendDMO", NtpnetTransPendDMO );

	    thrower.ifParameterMissing( "NtpnetTransPendDMO.ntpCommand",
	      NtpnetTransPendDMO.getNtpCommand());

	    thrower.ifParameterMissing( "NtpnetTransPendDMO.ntpSendSeq",
	      NtpnetTransPendDMO.getNtpSendSeq());

	    thrower.ifParameterMissing( "NtpnetTransPendDMO.ntpTranType",
	      NtpnetTransPendDMO.getNtpTranType() );

	    thrower.ifParameterMissing( "NtpnetTransPendDMO.ntpSubscriberId",
	      NtpnetTransPendDMO.getNtpSubscriberId());

	    thrower.ifParameterMissing( "NtpnetTransPendDMO.ntpOldValue",
	      NtpnetTransPendDMO.getNtpOldValue());

	    thrower.ifParameterMissing( "NtpnetTransPendDMO.ntpNewValue",
	      NtpnetTransPendDMO.getNtpNewValue());

	    thrower.ifParameterMissing( "NtpnetTransPendDMO.ntpServiceCode",
	      NtpnetTransPendDMO.getNtpServiceCode());

	    thrower.ifParameterMissing( "NtpnetTransPendDMO.ntpTimestamp",
	  	      NtpnetTransPendDMO.getNtpTimestamp());
	    
	    //
	    // Check that this object does not already exist 
	    //
	    if ( exists( NtpnetTransPendDMO ) ) {
	      thrower.business( Base_NMNETMAT_001,
	        new Object[] { NtpnetTransPendDMO } );
	    }

	    //
	    // Now create the nmNetmat
	    //
	    ntpNetTransPendDAC.create( NtpnetTransPendDMO );

	    return NtpnetTransPendDMO;
	  }

	  /**
	  * Modifies the NmNetmat object. On any modification, an audit object
	  * is created.
	  * <p>
	  * <B>Possible application exceptions:</B>
	  * <dl><dd>
	  *     <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#NMNETMAT_002}</li>
	  *     <li>The normal general errors:
	  *          {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>
	  * </dd></dl><br>
	  * @param NtpnetTransPendDMO NtpnetTransPendDMO object<br>
	  *   <dl><dd>
	  *   </dd></dl><br>
	  *
	  * @return populated NtpnetTransPendDMO object.
	  *
	  * @throws EPPIXBusinessException
	  * @throws EPPIXUnexpectedException
	  * @throws EPPIXFatalException
	  * 
	  * TODO SJ: This method id incomplete. 
	  * Complete only id required for this project
	  * 
	  */
	  public NtpNetTransPendDMO modify( NtpNetTransPendDMO aNtpNetTransPendDMO )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "modify( aNtpnetTransPendDMO )" );

	    //
	    // Check mandatory parameters (
	    //
	    // Note: attributes stereotyped <NotModifiable> are ignored
	    //
//	    thrower.ifParameterMissing( "aNtpnetTransPendDMO", aNtpNetTransPendDMO );
//
//	    thrower.ifParameterMissing( "aNtpNetTransPendDMO.ntpSerialId",
//	      aNtpNetTransPendDMO.getNtpSerialId()); // attribute
//
//	    thrower.ifParameterMissing( "aNtpNetTransPendDMO.ntpCommand",
//	      aNtpNetTransPendDMO.getNtpCommand()); // attribute
//
//	    thrower.ifParameterMissing( "aNtpNetTransPendDMO.ntpSendSeq",
//	      aNtpNetTransPendDMO.getNtpSendSeq()); // attribute
//
//	    thrower.ifParameterMissing( "aNtpNetTransPendDMO.ntpSubscriberId",
//	      aNtpNetTransPendDMO.getNtpSubscriberId()); // attribute
//
//	    thrower.ifParameterMissing( "aNtpNetTransPendDMO.ntpOldValue",
//	      aNtpNetTransPendDMO.getNtpOldValue()); // attribute
//
//	    thrower.ifParameterMissing( "aNtpNetTransPendDMO.ntpNewValue",
//	      aNtpNetTransPendDMO.getNtpNewValue()); // attribute
//
//	    thrower.ifParameterMissing( "aNtpNetTransPendDMO.ntpServiceCode",
//	      aNtpNetTransPendDMO.getNtpServiceCode()); // attribute
//	    
//	    thrower.ifParameterMissing( "aNtpNetTransPendDMO.ntpStatus",
//	  	      aNtpNetTransPendDMO.getNtpStatus()); // attribute
//	    
//	    thrower.ifParameterMissing( "aNtpNetTransPendDMO.ntpTranType",
//	  	      aNtpNetTransPendDMO.getNtpTranType()); // attribute
//	    
//	    thrower.ifParameterMissing( "aNtpNetTransPendDMO.ntpTimestamp",
//	  	      aNtpNetTransPendDMO.getNtpTimestamp()); // attribute
	    

	    NtpNetTransPendDMO updateNtpNetTransPendDMO = new NtpNetTransPendDMO(  );

//	    updateNtpNetTransPendDMO.setNmInternalTariff( aNtpNetTransPendDMO. );
//
//	    updateNtpNetTransPendDMO = get( updateNtpNetTransPendDMO );

	    //
	    // For each relationship to single objects (does not matter if they are Embedded or Flattened)
	    // either associate to a pre-existing object, or create an object then associate to it
	    //

	    //
	    // Copy the fields to be updated. We do not want to overwrite primary keys etc.
	    // All attributes stereotyped as being <NotModifiable> are skipped
	    //
//	    updateNtpNetTransPendDMO.setNmNetworkTariff( aNtpNetTransPendDMO.getNmNetworkTariff(  ) );
//
//	    updateNtpNetTransPendDMO.setNmContractPeriod( aNtpNetTransPendDMO.getNmContractPeriod(  ) );
//
//	    updateNtpNetTransPendDMO.setNmMinCancPeriod( aNtpNetTransPendDMO.getNmMinCancPeriod(  ) );
//
//	    updateNtpNetTransPendDMO.setNmHigherMigType( aNtpNetTransPendDMO.getNmHigherMigType(  ) );
//
//	    updateNtpNetTransPendDMO.setNmLowerMigType( aNtpNetTransPendDMO.getNmLowerMigType(  ) );
//
//	    updateNtpNetTransPendDMO.setNmSameMigType( aNtpNetTransPendDMO.getNmSameMigType(  ) );
//
//	    updateNtpNetTransPendDMO.setNmNetworkId( aNtpNetTransPendDMO.getNmNetworkId(  ) );
//
//	    updateNtpNetTransPendDMO.setNmNetType( aNtpNetTransPendDMO.getNmNetType(  ) );
//
//	    //
//	    // Modify the NtpnetTransPendDMO
//	    //
//	    ntpNetTransPendDAC.modify( updateNtpNetTransPendDMO );
//
//	    // Create a new DMO, set keys, and fetch from the database...
	    NtpNetTransPendDMO returnNtpNetTransPendDMO = new NtpNetTransPendDMO();
//
//	    returnNtpNetTransPendDMO.setNmInternalTariff( updateNtpNetTransPendDMO
//	      .getNmInternalTariff(  ) );
//
//	    returnNtpNetTransPendDMO = get( returnNtpNetTransPendDMO );

	    return returnNtpNetTransPendDMO;
	  }

	  /**
	  * Modifies the NmNetmat object.
	  * <p>
	  * <B>Possible application exceptions:</B>
	  * <dl><dd>
	  *     <li>{@link com.eppixcomm.eppix.base.blo.BaseMessages#Base#ECEVENTCOMMAND_002}</li>
	  *     <li>The normal general errors:
	  *          {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>
	  * </dd></dl><br>
	  * @param NtpNetTransPendDMO object<br>
	  * @param filter object<br>
	  *   <dl><dd>
	  *   </dd></dl><br>
	  *
	  * @return populated NtpnetTransPendDMO object.
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
	    // Modify the NtpnetTransPendDMO
	    //
	    ntpNetTransPendDAC.modify( filter );
	  }

	  /**
	   * Deletes the NmNetmat object. On deletion, an audit object is created
	   * <p>
	   * <B>Possible application exceptions:</B>
	   * <dl><dd>Base_NMNETMAT_003
	   *     <li>{@link #Base#NMNETMAT_000} if the NmNetmat does not exist.</li>
	   *     <li>{@link #Base#NMNETMAT_003} if the NmNetmat is in use.</li>
	   *     <li>The normal general errors:
	   *          {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>
	   * </dd></dl>
	   *  @param NtpNetTransPendDMO NmNetmat object with embedded displayCode and
	   *        languageCode.
	   *
	   * @throws EPPIXBusinessException
	   * @throws EPPIXUnexpectedException
	   * @throws EPPIXFatalException
	   */
	  public void delete( NtpNetTransPendDMO NtpnetTransPendDMO )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "delete( NtpnetTransPendDMO )" );

	    thrower.ifParameterMissing( "NtpnetTransPendDMO", NtpnetTransPendDMO );

	    NtpNetTransPendDMO updateNtpNetTransPendDMO = null;

	    updateNtpNetTransPendDMO = get( NtpnetTransPendDMO );

	    // delete self...
	    ntpNetTransPendDAC.delete( NtpnetTransPendDMO );
	  }

	  /**
	   * Deletes the NmNetmat object.
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
	    ntpNetTransPendDAC.delete( filter );
	  }

	  /**
	  * Indicates whether a NmNetmat exists in the database
	  * <p>
	  * <B>Possible application exceptions:</B>
	  * <dl><dd>
	  *     <li>The normal general errors:
	  *          {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>
	  * </dd></dl>
	  *
	  *
	  * @return true if the NmNetmat exists in the database
	  *
	  * @throws EPPIXBusinessException
	  * @throws EPPIXUnexpectedException
	  * @throws EPPIXFatalException
	  */
	  public boolean exists( NtpNetTransPendDMO NtpnetTransPendDMO )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "exists(nmNetmat)" );

	    thrower.ifParameterMissing( "NtpnetTransPendDMO", NtpnetTransPendDMO );

	    thrower.ifParameterMissing( "NtpnetTransPendDMO.ntpSerialId",
	      NtpnetTransPendDMO.getNtpSerialId());

	    return ntpNetTransPendDAC.exists( NtpnetTransPendDMO );
	  }

	  /**
	   * Indicates whether a NmNetmat exists in the database
	   * <p>
	   * <B>Possible application exceptions:</B>
	   * <dl><dd>
	   *     <li>The normal general errors:
	   *          {@link com.eppixcomm.eppix.base.error.GeneralMessages}</li>
	   * </dd></dl>
	   *
	   *
	   * @return true if the NmNetmat exists in the database
	   *
	   * @throws EPPIXBusinessException
	   * @throws EPPIXUnexpectedException
	   * @throws EPPIXFatalException
	   */
	  public boolean exists( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "exists(filter)" );

	    return ntpNetTransPendDAC.exists( filter );
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
	  public DTOList getList(QueryFilter  filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "getList( state, filter )" );
	
	    return ntpNetTransPendDAC.getList( filter );
	  }

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
	  public DTOList getList(NtpNetTransPendDMO ntpNetTransPendDMO)
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "getList(NtpNetTransPendDMO)" );
	
	    return ntpNetTransPendDAC.getList( ntpNetTransPendDMO );
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

	    return ntpNetTransPendDAC.iterate( filter );
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

	    return ntpNetTransPendDAC.iterateWithLock( filter );
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
	  public NtpNetTransPendDMO get( QueryFilter filter )
	    throws EPPIXBusinessException, EPPIXUnexpectedException,
	      EPPIXFatalException {
	    logger.debug( "get( filter )" );

	    //
	    // Check mandatory parameters.
	    //
	    thrower.ifParameterMissing( "filter", filter );

	    //
	    // Attempt to get the NtpNetTransPendDMO
	    //
	    NtpNetTransPendDMO NtpnetTransPendDMO = ntpNetTransPendDAC.get( filter );

	    return NtpnetTransPendDMO;
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

	    return ntpNetTransPendDAC.max( filter );
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

	    return ntpNetTransPendDAC.min( filter );
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

	    return Integer.valueOf(String.valueOf(ntpNetTransPendDAC.count( filter )));
	  }

	protected Class getDACClass() {
		return NtpNetTransPendAbstractDAC.class;
	}
	  
}
