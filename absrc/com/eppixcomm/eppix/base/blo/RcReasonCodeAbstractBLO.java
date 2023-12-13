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

public class RcReasonCodeAbstractBLO extends BaseBLO
implements DTOActionTypes, BaseMessages {


static Thrower thrower = Thrower.getThrower( RcReasonCodeAbstractBLO.class );


				protected static final String ENTITY_ID = "RC";

				/** Data Access Controller. */
				protected RcReasonCodeDAC rcReasonCodeDAC;
				/** DOCUMENT ME! */
				protected Logger logger = thrower.getLogger(  );

				/** Invoked by the BLOBinder to provide this BLO with its DAC. */
				protected void setDAC( DAC dac ) {
					this.rcReasonCodeDAC = (RcReasonCodeDAC) dac;
				}

				protected Class getDACClass() {
					return RcReasonCodeDAC.class;
				}

				public RcReasonCodeDMO get( RcReasonCodeDMO rcReasonCodeDMO )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "get(rcReasonCodeDMO)" );

					//
					// Check mandatory parameters.
					//
					thrower.ifParameterMissing( "rcReasonCodeDMO", rcReasonCodeDMO );

					//
					// Each attribute that is part of the primary key is mandatory
					//
					thrower.ifParameterMissing( "rcReasonCodeDMO.actAccId",
						rcReasonCodeDMO.getRcCode());
					
					QueryFilter filter = new QueryFilter();
					filter.add(FilterOp.EQUAL, RcReasonCodeDMO.RcCodeFilter,rcReasonCodeDMO.getRcCode());

					//
					// Attempt to get the RcReasonCodeDMO
					//
					RcReasonCodeDMO returnRcReasonCodeDMO = rcReasonCodeDAC.get( filter );

					//
					// Could not find the RcReasonCodeDMO
					//
					if ( returnRcReasonCodeDMO == null ) {
						thrower.business( Base_ACTACCTYPES_000,
							new Object[] { rcReasonCodeDMO.getRcCode()});
					}

					//
					// Now, based on the values of the flags on this method signature, which in turn,
					// are based on this objects associations, get all associated, embedded objects
					//
					return returnRcReasonCodeDMO;
				}
				//==================================================================================================


				public DTOList getList(
					DTOListState   state,
					RcReasonCodeDMO rcReasonCodeDMO )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "getList( state, rcReasonCodeDMO )" );

					return rcReasonCodeDAC.getList( state, rcReasonCodeDMO );
				}


				public RcReasonCodeDMO create( RcReasonCodeDMO rcReasonCodeDMO )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "create( rcReasonCodeDMO )" );

					thrower.ifParameterMissing( "rcReasonCodeDMO", rcReasonCodeDMO );
					thrower.ifParameterMissing( "rcReasonCodeDMO.dpfFolderId",
							rcReasonCodeDMO.getRcCode());


					//
					// Check that this object does not already exist
					//
					if ( exists( rcReasonCodeDMO ) ) {
						thrower.business( Base_ACTACCTYPES_001,
							new Object[] { rcReasonCodeDMO.getRcCode() } );
					}

					//
					// Now create the record
					//
					rcReasonCodeDAC.create( rcReasonCodeDMO );

					return rcReasonCodeDMO;
				}

				public RcReasonCodeDMO modify( RcReasonCodeDMO rcReasonCodeDMO )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "modify( arcReasonCodeDMO )" );

					//
					// Check mandatory parameters (
					//
					// Note: attributes stereotyped <NotModifiable> are ignored
					//
					thrower.ifParameterMissing( "rcReasonCodeDMO", rcReasonCodeDMO );
					thrower.ifParameterMissing( "rcReasonCodeDMO.dpfFolderId",
							rcReasonCodeDMO.getRcCode());



					RcReasonCodeDMO updateRcReasonCodeDMO = new RcReasonCodeDMO(  );

					updateRcReasonCodeDMO.setRcCode(rcReasonCodeDMO.getRcCode() );

					updateRcReasonCodeDMO = get( updateRcReasonCodeDMO );

					//
					// For each relationship to single objects (does not matter if they are Embedded or Flattened)
					// either associate to a pre-existing object, or create an object then associate to it
					//

					//
					// Copy the fields to be updated. We do not want to overwrite primary keys etc.
					// All attributes stereotyped as being <NotModifiable> are skipped
					//
					updateRcReasonCodeDMO.setRcCode(rcReasonCodeDMO.getRcCode() );
					
					QueryFilter filter = new QueryFilter();
					filter.add(FilterOp.SET, RcReasonCodeDMO.RcDescFilter, rcReasonCodeDMO.getRcDesc());
					filter.add(FilterOp.SET, RcReasonCodeDMO.RcTypeFilter, rcReasonCodeDMO.getRcType());
					filter.add(FilterOp.EQUAL, RcReasonCodeDMO.RcCodeFilter, rcReasonCodeDMO.getRcCode());


					//
					// Modify the rcReasonCodeDMO
					//
					rcReasonCodeDAC.modify( filter );

					// Create a new RcReasonCodeDMO, set keys, and fetch from the database...
					RcReasonCodeDMO returnRcReasonCodeDMO = new RcReasonCodeDMO(  );

					returnRcReasonCodeDMO.setRcCode(rcReasonCodeDMO.getRcCode() );

					returnRcReasonCodeDMO = get( returnRcReasonCodeDMO );

					return returnRcReasonCodeDMO;
				}
				//==================================================================================================


				public void modify( QueryFilter filter )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "modify( filter )" );

					//
					// Modify the rcReasonCodeDMO
					//
					rcReasonCodeDAC.modify( filter );
				}
			//==================================================================================================

				public void delete( RcReasonCodeDMO rcReasonCodeDMO )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "delete( rcReasonCodeDMO )" );

					thrower.ifParameterMissing( "rcReasonCodeDMO", rcReasonCodeDMO );

					RcReasonCodeDMO updateRcReasonCodeDMO = null;

					updateRcReasonCodeDMO = get( rcReasonCodeDMO );

					// delete self...
					rcReasonCodeDAC.delete( rcReasonCodeDMO );
				}
			//==================================================================================================

				public void delete( QueryFilter filter )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "delete( filter )" );

					thrower.ifParameterMissing( "filter", filter );

					// delete...
					rcReasonCodeDAC.delete( filter );
				}
				//==================================================================================================

				public boolean exists( RcReasonCodeDMO rcReasonCodeDMO )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "exists(rcReasonCodeDMO)" );

					thrower.ifParameterMissing( "rcReasonCodeDMO", rcReasonCodeDMO );

					thrower.ifParameterMissing( "rcReasonCodeDMO.actAccId",
						rcReasonCodeDMO.getRcCode());

					return rcReasonCodeDAC.exists( rcReasonCodeDMO );
				}
				//==================================================================================================


				public boolean exists( QueryFilter filter )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "exists(filter)" );

					return rcReasonCodeDAC.exists( filter );
				}
				//==================================================================================================


				public DTOList getList(
					DTOListState state,
					QueryFilter  filter )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "getList( state, filter )" );

					return rcReasonCodeDAC.getList( state, filter );
				}

				//==================================================================================================


				public DAOIterator iterate( QueryFilter filter )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "iterateWithLock( filter )" );

					return rcReasonCodeDAC.iterate( filter );
				}
				//==================================================================================================


				public DAOIterator iterateWithLock( QueryFilter filter )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "iterateWithLock( filter )" );

					return rcReasonCodeDAC.iterateWithLock( filter );
				}
				//==================================================================================================


				public RcReasonCodeDMO get( QueryFilter filter )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "get( filter )" );

					//
					// Check mandatory parameters.
					//
					thrower.ifParameterMissing( "filter", filter );

					//
					// Attempt to get the RcReasonCodeDMO
					//
					RcReasonCodeDMO rcReasonCodeDMO = rcReasonCodeDAC.get( filter );

					return rcReasonCodeDMO;
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

					return rcReasonCodeDAC.max( filter );
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

					return rcReasonCodeDAC.min( filter );
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

					return Integer.valueOf(rcReasonCodeDAC.count( filter ));
				}
	  //==================================================================================================



}