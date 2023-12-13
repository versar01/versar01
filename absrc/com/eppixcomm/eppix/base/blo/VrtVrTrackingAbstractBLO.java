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

public class VrtVrTrackingAbstractBLO extends BaseBLO
implements DTOActionTypes, BaseMessages {


static Thrower thrower = Thrower.getThrower( VrtVrTrackingAbstractBLO.class );


				protected static final String ENTITY_ID = "VRT";

				/** Data Access Controller. */
				protected VrtVrTrackingDAC vrtVrTrackingDAC;
				/** DOCUMENT ME! */
				protected Logger logger = thrower.getLogger(  );

				/** Invoked by the BLOBinder to provide this BLO with its DAC. */
				protected void setDAC( DAC dac ) {
					this.vrtVrTrackingDAC = (VrtVrTrackingDAC) dac;
				}

				protected Class getDACClass() {
					return VrtVrTrackingDAC.class;
				}

				public VrtVrTrackingDMO get( VrtVrTrackingDMO vrtVrTrackingDMO )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "get(vrtVrTrackingDMO)" );

					//
					// Check mandatory parameters.
					//
					thrower.ifParameterMissing( "vrtVrTrackingDMO", vrtVrTrackingDMO );

					//
					// Each attribute that is part of the primary key is mandatory
					//
					thrower.ifParameterMissing( "vrtVrTrackingDMO.vrtRefId",
						vrtVrTrackingDMO.getVrtRefId() );
					
					QueryFilter filter = new QueryFilter();
					filter.add(FilterOp.EQUAL, VrtVrTrackingDMO.VrtRefIdFilter, vrtVrTrackingDMO.getVrtRefId());

					//
					// Attempt to get the VrtVrTrackingDMO
					//
					VrtVrTrackingDMO returnVrtVrTrackingDMO = vrtVrTrackingDAC.get( filter );

					//
					// Could not find the VrtVrTrackingDMO
					//
					if ( returnVrtVrTrackingDMO == null ) {
						thrower.business( Base_ACTACCTYPES_000,
							new Object[] { vrtVrTrackingDMO.getVrtRefId() } );
					}

					//
					// Now, based on the values of the flags on this method signature, which in turn,
					// are based on this objects associations, get all associated, embedded objects
					//
					return returnVrtVrTrackingDMO;
				}
				//==================================================================================================


				public DTOList getList(
					DTOListState   state,
					VrtVrTrackingDMO vrtVrTrackingDMO )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "getList( state, vrtVrTrackingDMO )" );

					return vrtVrTrackingDAC.getList( state, vrtVrTrackingDMO );
				}


				public VrtVrTrackingDMO create( VrtVrTrackingDMO vrtVrTrackingDMO )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "create( vrtVrTrackingDMO )" );

					thrower.ifParameterMissing( "vrtVrTrackingDMO", vrtVrTrackingDMO );

					thrower.ifParameterMissing( "vrtVrTrackingDMO.vrtRefId",
							vrtVrTrackingDMO.getVrtRefId() );


					//
					// Check that this object does not already exist
					//
					if ( exists( vrtVrTrackingDMO ) ) {
						thrower.business( Base_ACTACCTYPES_001,
							new Object[] { vrtVrTrackingDMO.getVrtRefId() } );
					}

					//
					// Now create the record
					//
					vrtVrTrackingDAC.create( vrtVrTrackingDMO );

					return vrtVrTrackingDMO;
				}

				public VrtVrTrackingDMO modify( VrtVrTrackingDMO vrtVrTrackingDMO )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "modify( avrtVrTrackingDMO )" );

					//
					// Check mandatory parameters (
					//
					// Note: attributes stereotyped <NotModifiable> are ignored
					//
					thrower.ifParameterMissing( "vrtVrTrackingDMO", vrtVrTrackingDMO );

					thrower.ifParameterMissing( "vrtVrTrackingDMO.vrtRefId",
							vrtVrTrackingDMO.getVrtRefId() );


					QueryFilter filter = new QueryFilter();
					filter.add(FilterOp.SET, VrtVrTrackingDMO.VrtRequestorFilter, vrtVrTrackingDMO.getVrtRequestor());
					filter.add(FilterOp.SET, VrtVrTrackingDMO.VrtReceiverFilter, vrtVrTrackingDMO.getVrtReceiver());
					filter.add(FilterOp.SET, VrtVrTrackingDMO.VrtProviderFilter, vrtVrTrackingDMO.getVrtProvider());
					filter.add(FilterOp.SET, VrtVrTrackingDMO.VrtRechargeTypeFilter, vrtVrTrackingDMO.getVrtRechargeType());
					filter.add(FilterOp.SET, VrtVrTrackingDMO.VrtRechargeAmtFilter, vrtVrTrackingDMO.getVrtRechargeAmt());
					filter.add(FilterOp.SET, VrtVrTrackingDMO.VrtVrrIdFilter, vrtVrTrackingDMO.getVrtVrrId());
					filter.add(FilterOp.SET, VrtVrTrackingDMO.VrtVriIdFilter, vrtVrTrackingDMO.getVrtVriId());
					filter.add(FilterOp.SET, VrtVrTrackingDMO.VrtReferenceNoFilter, vrtVrTrackingDMO.getVrtReferenceNo());
					filter.add(FilterOp.SET, VrtVrTrackingDMO.VrtDate1Filter, vrtVrTrackingDMO.getVrtDate1());
					filter.add(FilterOp.SET, VrtVrTrackingDMO.VrtDate2Filter, vrtVrTrackingDMO.getVrtDate2());
					filter.add(FilterOp.SET, VrtVrTrackingDMO.VrtDate3Filter, vrtVrTrackingDMO.getVrtDate3());
					filter.add(FilterOp.SET, VrtVrTrackingDMO.VrtMtwTransIdFilter, vrtVrTrackingDMO.getVrtMtwTransId());
					filter.add(FilterOp.SET, VrtVrTrackingDMO.VrtMtwTermIdFilter, vrtVrTrackingDMO.getVrtMtwTermId());
					filter.add(FilterOp.SET, VrtVrTrackingDMO.VrtMtwBatchNumFilter, vrtVrTrackingDMO.getVrtMtwBatchNum());
					filter.add(FilterOp.SET, VrtVrTrackingDMO.VrtMtwPrcreCdFilter, vrtVrTrackingDMO.getVrtMtwPrcreCd());
					filter.add(FilterOp.SET, VrtVrTrackingDMO.VrtMtwRetRefFilter, vrtVrTrackingDMO.getVrtMtwRetRef());
					filter.add(FilterOp.SET, VrtVrTrackingDMO.VrtMtwFundldCdFilter, vrtVrTrackingDMO.getVrtMtwFundldCd());
					filter.add(FilterOp.SET, VrtVrTrackingDMO.VrtMtwLdRspnsFilter, vrtVrTrackingDMO.getVrtMtwLdRspns());
					filter.add(FilterOp.SET, VrtVrTrackingDMO.VrtStatusFilter, vrtVrTrackingDMO.getVrtStatus());
				
					filter.add(FilterOp.EQUAL, VrtVrTrackingDMO.VrtRefIdFilter, vrtVrTrackingDMO.getVrtRefId());


					//
					// Modify the vrtVrTrackingDMO
					//
					vrtVrTrackingDAC.modify( filter );
					
					filter = new QueryFilter();
					filter.add(FilterOp.EQUAL, VrtVrTrackingDMO.VrtRefIdFilter, vrtVrTrackingDMO.getVrtRefId());

					// Create a new VrtVrTrackingDMO, set keys, and fetch from the database...
					VrtVrTrackingDMO returnVrtVrTrackingDMO = get( filter );

					return returnVrtVrTrackingDMO;
				}
				//==================================================================================================


				public void modify( QueryFilter filter )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "modify( filter )" );

					//
					// Modify the vrtVrTrackingDMO
					//
					vrtVrTrackingDAC.modify( filter );
				}
			//==================================================================================================

				public void delete( VrtVrTrackingDMO vrtVrTrackingDMO )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "delete( vrtVrTrackingDMO )" );

					thrower.ifParameterMissing( "vrtVrTrackingDMO", vrtVrTrackingDMO );
					
					thrower.ifParameterMissing( "vrtVrTrackingDMO.vrtRefId",
							vrtVrTrackingDMO.getVrtRefId() );

					VrtVrTrackingDMO updateVrtVrTrackingDMO = null;

					updateVrtVrTrackingDMO = get( vrtVrTrackingDMO );

					// delete self...
					vrtVrTrackingDAC.delete( vrtVrTrackingDMO );
				}
			//==================================================================================================

				public void delete( QueryFilter filter )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "delete( filter )" );

					thrower.ifParameterMissing( "filter", filter );

					// delete...
					vrtVrTrackingDAC.delete( filter );
				}
				//==================================================================================================

				public boolean exists( VrtVrTrackingDMO vrtVrTrackingDMO )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "exists(vrtVrTrackingDMO)" );

					thrower.ifParameterMissing( "vrtVrTrackingDMO", vrtVrTrackingDMO );

					thrower.ifParameterMissing( "vrtVrTrackingDMO.vrtRefId",
							vrtVrTrackingDMO.getVrtRefId() );

					return vrtVrTrackingDAC.exists( vrtVrTrackingDMO );
				}
				//==================================================================================================


				public boolean exists( QueryFilter filter )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "exists(filter)" );

					return vrtVrTrackingDAC.exists( filter );
				}
				//==================================================================================================


				public DTOList getList(
					DTOListState state,
					QueryFilter  filter )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "getList( state, filter )" );

					return vrtVrTrackingDAC.getList( state, filter );
				}

				//==================================================================================================


				public DAOIterator iterate( QueryFilter filter )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "iterateWithLock( filter )" );

					return vrtVrTrackingDAC.iterate( filter );
				}
				//==================================================================================================


				public DAOIterator iterateWithLock( QueryFilter filter )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "iterateWithLock( filter )" );

					return vrtVrTrackingDAC.iterateWithLock( filter );
				}
				//==================================================================================================


				public VrtVrTrackingDMO get( QueryFilter filter )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "get( filter )" );

					//
					// Check mandatory parameters.
					//
					thrower.ifParameterMissing( "filter", filter );

					//
					// Attempt to get the VrtVrTrackingDMO
					//
					VrtVrTrackingDMO vrtVrTrackingDMO = vrtVrTrackingDAC.get( filter );

					return vrtVrTrackingDMO;
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

					return vrtVrTrackingDAC.max( filter );
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

					return vrtVrTrackingDAC.min( filter );
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

					return Integer.valueOf(vrtVrTrackingDAC.count( filter ));
				}
	  //==================================================================================================



}