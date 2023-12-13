package com.eppixcomm.eppix.base.blo;

import org.apache.log4j.Logger;

import com.eppixcomm.eppix.base.error.EPPIXBusinessException;
import com.eppixcomm.eppix.base.error.EPPIXFatalException;
import com.eppixcomm.eppix.base.error.EPPIXUnexpectedException;
import com.eppixcomm.eppix.base.error.Thrower;
import com.eppixcomm.eppix.common.data.DAC;
import com.eppixcomm.eppix.common.data.DAOIterator;
import com.eppixcomm.eppix.common.data.DTOActionTypes;
import com.eppixcomm.eppix.common.data.DTOList;
import com.eppixcomm.eppix.common.data.DTOListState;
import com.eppixcomm.eppix.common.util.FilterOp;
import com.eppixcomm.eppix.common.util.QueryFilter;

public class ActivationPendAbstractBLO extends BaseBLO
implements DTOActionTypes, BaseMessages {


static Thrower thrower = Thrower.getThrower( ActivationPendAbstractBLO.class );


				protected static final String ENTITY_ID = "ACP";

				/** Data Access Controller. */
				protected ActivationPendDAC activationPendDAC;
				/** DOCUMENT ME! */
				protected Logger logger = thrower.getLogger(  );

				/** Invoked by the BLOBinder to provide this BLO with its DAC. */
				protected void setDAC( DAC dac ) {
					this.activationPendDAC = (ActivationPendDAC) dac;
				}

				protected Class getDACClass() {
					return ActivationPendDAC.class;
				}

				public ActivationPendDMO get( ActivationPendDMO activationPendDMO )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "get(activationPendDMO)" );

					//
					// Check mandatory parameters.
					//
					thrower.ifParameterMissing( "activationPendDMO", activationPendDMO );

					//
					// Each attribute that is part of the primary key is mandatory
					//
					thrower.ifParameterMissing( "activationPendDMO.actAccId",
						activationPendDMO.getMsisdnNo());

					//
					// Attempt to get the ActivationPendDMO
					//
					QueryFilter filter = new QueryFilter();
					filter.add(FilterOp.EQUAL, ActivationPendDMO.MsisdnNoFilter, activationPendDMO.getMsisdnNo());
					
					
					ActivationPendDMO returnActivationPendDMO = activationPendDAC.get( filter );

					//
					// Could not find the ActivationPendDMO
					//
					if ( returnActivationPendDMO == null ) {
						thrower.business( Base_ACTACCTYPES_000,
							new Object[] { activationPendDMO.getMsisdnNo()} );
					}

					//
					// Now, based on the values of the flags on this method signature, which in turn,
					// are based on this objects associations, get all associated, embedded objects
					//
					return returnActivationPendDMO;
				}
				//==================================================================================================


				public DTOList getList(
					DTOListState   state,
					ActivationPendDMO activationPendDMO )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "getList( state, activationPendDMO )" );

					return activationPendDAC.getList( state, activationPendDMO );
				}


				public ActivationPendDMO create( ActivationPendDMO activationPendDMO )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "create( activationPendDMO )" );

					thrower.ifParameterMissing( "activationPendDMO", activationPendDMO );
					thrower.ifParameterMissing( "activationPendDMO.dpfFolderId",
						activationPendDMO.getMsisdnNo());


					//
					// Check that this object does not already exist
					//
					if ( exists( activationPendDMO ) ) {
						thrower.business( Base_ACTACCTYPES_001,
							new Object[] { activationPendDMO.getMsisdnNo()} );
					}

					//
					// Now create the record
					//
					activationPendDAC.create( activationPendDMO );

					return activationPendDMO;
				}

				public ActivationPendDMO modify( ActivationPendDMO activationPendDMO )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "modify( aactivationPendDMO )" );

					//
					// Check mandatory parameters (
					//
					// Note: attributes stereotyped <NotModifiable> are ignored
					//
					thrower.ifParameterMissing( "activationPendDMO", activationPendDMO );
					thrower.ifParameterMissing( "activationPendDMO.msisdnNo",
								activationPendDMO.getMsisdnNo());
					thrower.ifParameterMissing( "activationPendDMO.simNo",
							activationPendDMO.getSimNo());


					//
					// For each relationship to single objects (does not matter if they are Embedded or Flattened)
					// either associate to a pre-existing object, or create an object then associate to it
					//

					//
					// Copy the fields to be updated. We do not want to overwrite primary keys etc.
					// All attributes stereotyped as being <NotModifiable> are skipped
					//
					QueryFilter filter = new QueryFilter();
					filter.add(FilterOp.SET, ActivationPendDMO.SimNoFilter, activationPendDMO.getSimNo());
					filter.add(FilterOp.EQUAL, ActivationPendDMO.MsisdnNoFilter, activationPendDMO.getMsisdnNo());
					
					//
					// Modify the activationPendDMO
					//
					activationPendDAC.modify( filter );

					// Create a new ActivationPendDMO, set keys, and fetch from the database...
					ActivationPendDMO returnActivationPendDMO = new ActivationPendDMO(  );

					returnActivationPendDMO.setMsisdnNo(activationPendDMO.getMsisdnNo() );

					returnActivationPendDMO = get( returnActivationPendDMO );

					return returnActivationPendDMO;
				}
				//==================================================================================================


				public void modify( QueryFilter filter )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "modify( filter )" );

					//
					// Modify the activationPendDMO
					//
					activationPendDAC.modify( filter );
				}
			//==================================================================================================

				public void delete( ActivationPendDMO activationPendDMO )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "delete( activationPendDMO )" );

					thrower.ifParameterMissing( "activationPendDMO", activationPendDMO );

					ActivationPendDMO updateActivationPendDMO = null;

					updateActivationPendDMO = get( activationPendDMO );

					// delete self...
					activationPendDAC.delete( activationPendDMO );
				}
			//==================================================================================================

				public void delete( QueryFilter filter )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "delete( filter )" );

					thrower.ifParameterMissing( "filter", filter );

					// delete...
					activationPendDAC.delete( filter );
				}
				//==================================================================================================

				public boolean exists( ActivationPendDMO activationPendDMO )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "exists(activationPendDMO)" );

					thrower.ifParameterMissing( "activationPendDMO", activationPendDMO );

					thrower.ifParameterMissing( "activationPendDMO.msisdnNo",
						activationPendDMO.getMsisdnNo());

					return activationPendDAC.exists( activationPendDMO );
				}
				//==================================================================================================


				public boolean exists( QueryFilter filter )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "exists(filter)" );

					return activationPendDAC.exists( filter );
				}
				//==================================================================================================


				public DTOList getList(
					DTOListState state,
					QueryFilter  filter )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "getList( state, filter )" );

					return activationPendDAC.getList( state, filter );
				}

				//==================================================================================================


				public DAOIterator iterate( QueryFilter filter )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "iterateWithLock( filter )" );

					return activationPendDAC.iterate( filter );
				}
				//==================================================================================================


				public DAOIterator iterateWithLock( QueryFilter filter )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "iterateWithLock( filter )" );

					return activationPendDAC.iterateWithLock( filter );
				}
				//==================================================================================================


				public ActivationPendDMO get( QueryFilter filter )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "get( filter )" );

					//
					// Check mandatory parameters.
					//
					thrower.ifParameterMissing( "filter", filter );

					//
					// Attempt to get the ActivationPendDMO
					//
					ActivationPendDMO activationPendDMO = activationPendDAC.get( filter );

					return activationPendDMO;
				}
				//==================================================================================================


				public Object max( QueryFilter filter )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "max( filter )" );

					//
					// Check mandatory parameters.
					//
					thrower.ifParameterMissing( "filter", filter );

					return activationPendDAC.max( filter );
				}
				//==================================================================================================


				public Object min( QueryFilter filter )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "min( filter )" );

					//
					// Check mandatory parameters.
					//
					thrower.ifParameterMissing( "filter", filter );

					return activationPendDAC.min( filter );
				}
				//==================================================================================================


				public Integer count( QueryFilter filter )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "count( filter )" );

					//
					// Check mandatory parameters.
					//
					thrower.ifParameterMissing( "filter", filter );

					return Integer.valueOf(activationPendDAC.count( filter ));
				}
	  //==================================================================================================

}