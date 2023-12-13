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

public class VrrVrRecurringAbstractBLO extends BaseBLO
implements DTOActionTypes, BaseMessages {


static Thrower thrower = Thrower.getThrower( VrrVrRecurringAbstractBLO.class );


				protected static final String ENTITY_ID = "VRR";

				/** Data Access Controller. */
				protected VrrVrRecurringDAC vrrVrRecurringDAC;
				/** DOCUMENT ME! */
				protected Logger logger = thrower.getLogger(  );

				/** Invoked by the BLOBinder to provide this BLO with its DAC. */
				protected void setDAC( DAC dac ) {
					this.vrrVrRecurringDAC = (VrrVrRecurringDAC) dac;
				}

				protected Class getDACClass() {
					return VrrVrRecurringDAC.class;
				}

				public VrrVrRecurringDMO get( VrrVrRecurringDMO vrrVrRecurringDMO )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "get(vrrVrRecurringDMO)" );

					//
					// Check mandatory parameters.
					//
					thrower.ifParameterMissing( "vrrVrRecurringDMO", vrrVrRecurringDMO );

					//
					// Each attribute that is part of the primary key is mandatory
					//
					thrower.ifParameterMissing( "vrrVrRecurringDMO.vrrRecurringIdd",
						vrrVrRecurringDMO.getVrrRecurringId() );
					
					QueryFilter filter = new QueryFilter();
					filter.add(FilterOp.EQUAL, VrrVrRecurringDMO.VrrRecurringIdFilter, vrrVrRecurringDMO.getVrrRecurringId());

					//
					// Attempt to get the VrrVrRecurringDMO
					//
					VrrVrRecurringDMO returnVrrVrRecurringDMO = vrrVrRecurringDAC.get( filter );

					//
					// Could not find the VrrVrRecurringDMO
					//
					if ( returnVrrVrRecurringDMO == null ) {
						thrower.business( Base_ACTACCTYPES_000,
							new Object[] { vrrVrRecurringDMO.getVrrRecurringId() } );
					}

					//
					// Now, based on the values of the flags on this method signature, which in turn,
					// are based on this objects associations, get all associated, embedded objects
					//
					return returnVrrVrRecurringDMO;
				}
				//==================================================================================================


				public DTOList getList(
					DTOListState   state,
					VrrVrRecurringDMO vrrVrRecurringDMO )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "getList( state, vrrVrRecurringDMO )" );

					return vrrVrRecurringDAC.getList( state, vrrVrRecurringDMO );
				}


				public VrrVrRecurringDMO create( VrrVrRecurringDMO vrrVrRecurringDMO )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "create( vrrVrRecurringDMO )" );

					thrower.ifParameterMissing( "vrrVrRecurringDMO", vrrVrRecurringDMO );

					thrower.ifParameterMissing( "vrrVrRecurringDMO.vrrRecurringIdd",
							vrrVrRecurringDMO.getVrrRecurringId() );


					//
					// Check that this object does not already exist
					//
					if ( exists( vrrVrRecurringDMO ) ) {
						thrower.business( Base_ACTACCTYPES_001,
							new Object[] { vrrVrRecurringDMO.getVrrRecurringId() } );
					}

					//
					// Now create the record
					//
					vrrVrRecurringDAC.create( vrrVrRecurringDMO );

					return vrrVrRecurringDMO;
				}

				public VrrVrRecurringDMO modify( VrrVrRecurringDMO vrrVrRecurringDMO )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "modify( avrrVrRecurringDMO )" );

					//
					// Check mandatory parameters (
					//
					// Note: attributes stereotyped <NotModifiable> are ignored
					//
					thrower.ifParameterMissing( "vrrVrRecurringDMO", vrrVrRecurringDMO );

					thrower.ifParameterMissing( "vrrVrRecurringDMO.vrrRecurringIdd",
							vrrVrRecurringDMO.getVrrRecurringId() );


					QueryFilter filter = new QueryFilter();
					filter.add(FilterOp.SET, VrrVrRecurringDMO.VrrSubscriberIdFilter, vrrVrRecurringDMO.getVrrSubscriberId());
					filter.add(FilterOp.SET, VrrVrRecurringDMO.VrrReceiverFilter, vrrVrRecurringDMO.getVrrReceiver());
					filter.add(FilterOp.SET, VrrVrRecurringDMO.VrrProviderFilter, vrrVrRecurringDMO.getVrrProvider());
					filter.add(FilterOp.SET, VrrVrRecurringDMO.VrrDateStartFilter, vrrVrRecurringDMO.getVrrDateStart());
					filter.add(FilterOp.SET, VrrVrRecurringDMO.VrrDateTermFilter, vrrVrRecurringDMO.getVrrDateTerm());
					filter.add(FilterOp.SET, VrrVrRecurringDMO.VrrTotRechargesFilter, vrrVrRecurringDMO.getVrrTotRecharges());
					filter.add(FilterOp.SET, VrrVrRecurringDMO.VrrNoBillingFilter, vrrVrRecurringDMO.getVrrNoBilling());
					filter.add(FilterOp.SET, VrrVrRecurringDMO.VrrNoRechargeFilter, vrrVrRecurringDMO.getVrrNoRecharge());
					filter.add(FilterOp.SET, VrrVrRecurringDMO.VrrRechargeAmtFilter, vrrVrRecurringDMO.getVrrRechargeAmt());
					filter.add(FilterOp.SET, VrrVrRecurringDMO.VrrStatusFilter, vrrVrRecurringDMO.getVrrStatus());
					
					filter.add(FilterOp.EQUAL, VrrVrRecurringDMO.VrrRecurringIdFilter, vrrVrRecurringDMO.getVrrRecurringId());


					//
					// Modify the vrrVrRecurringDMO
					//
					vrrVrRecurringDAC.modify( filter );

					
					filter = new QueryFilter();

					filter.add(FilterOp.EQUAL, VrrVrRecurringDMO.VrrRecurringIdFilter, vrrVrRecurringDMO.getVrrRecurringId());
					// Create a new VrrVrRecurringDMO, set keys, and fetch from the database...
					VrrVrRecurringDMO returnVrrVrRecurringDMO = get( filter );

					return returnVrrVrRecurringDMO;
				}
				//==================================================================================================


				public void modify( QueryFilter filter )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "modify( filter )" );

					//
					// Modify the vrrVrRecurringDMO
					//
					vrrVrRecurringDAC.modify( filter );
				}
			//==================================================================================================

				public void delete( VrrVrRecurringDMO vrrVrRecurringDMO )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "delete( vrrVrRecurringDMO )" );

					thrower.ifParameterMissing( "vrrVrRecurringDMO", vrrVrRecurringDMO );
					
					thrower.ifParameterMissing( "vrrVrRecurringDMO.vrrRecurringIdd",
							vrrVrRecurringDMO.getVrrRecurringId() );

					VrrVrRecurringDMO updateVrrVrRecurringDMO = null;

					updateVrrVrRecurringDMO = get( vrrVrRecurringDMO );

					// delete self...
					vrrVrRecurringDAC.delete( vrrVrRecurringDMO );
				}
			//==================================================================================================

				public void delete( QueryFilter filter )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "delete( filter )" );

					thrower.ifParameterMissing( "filter", filter );

					// delete...
					vrrVrRecurringDAC.delete( filter );
				}
				//==================================================================================================

				public boolean exists( VrrVrRecurringDMO vrrVrRecurringDMO )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "exists(vrrVrRecurringDMO)" );

					thrower.ifParameterMissing( "vrrVrRecurringDMO", vrrVrRecurringDMO );
					
					thrower.ifParameterMissing( "vrrVrRecurringDMO.vrrRecurringIdd",
							vrrVrRecurringDMO.getVrrRecurringId() );


					return vrrVrRecurringDAC.exists( vrrVrRecurringDMO );
				}
				//==================================================================================================


				public boolean exists( QueryFilter filter )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "exists(filter)" );

					return vrrVrRecurringDAC.exists( filter );
				}
				//==================================================================================================


				public DTOList getList(
					DTOListState state,
					QueryFilter  filter )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "getList( state, filter )" );

					return vrrVrRecurringDAC.getList( state, filter );
				}

				//==================================================================================================


				public DAOIterator iterate( QueryFilter filter )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "iterateWithLock( filter )" );

					return vrrVrRecurringDAC.iterate( filter );
				}
				//==================================================================================================


				public DAOIterator iterateWithLock( QueryFilter filter )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "iterateWithLock( filter )" );

					return vrrVrRecurringDAC.iterateWithLock( filter );
				}
				//==================================================================================================


				public VrrVrRecurringDMO get( QueryFilter filter )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "get( filter )" );

					//
					// Check mandatory parameters.
					//
					thrower.ifParameterMissing( "filter", filter );

					//
					// Attempt to get the VrrVrRecurringDMO
					//
					VrrVrRecurringDMO vrrVrRecurringDMO = vrrVrRecurringDAC.get( filter );

					return vrrVrRecurringDMO;
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

					return vrrVrRecurringDAC.max( filter );
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

					return vrrVrRecurringDAC.min( filter );
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

					return Integer.valueOf(vrrVrRecurringDAC.count( filter ));
				}
	  //==================================================================================================



}