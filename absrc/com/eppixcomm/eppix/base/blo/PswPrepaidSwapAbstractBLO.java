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

public class PswPrepaidSwapAbstractBLO extends BaseBLO
implements DTOActionTypes, BaseMessages {


static Thrower thrower = Thrower.getThrower( PswPrepaidSwapAbstractBLO.class );


				protected static final String ENTITY_ID = "FS";

				/** Data Access Controller. */
				protected PswPrepaidSwapDAC pswPrepaidSwapDAC;
				/** DOCUMENT ME! */
				protected Logger logger = thrower.getLogger(  );

				/** Invoked by the BLOBinder to provide this BLO with its DAC. */
				protected void setDAC( DAC dac ) {
					this.pswPrepaidSwapDAC = (PswPrepaidSwapDAC) dac;
				}

				protected Class getDACClass() {
					return PswPrepaidSwapDAC.class;
				}

				public PswPrepaidSwapDMO get( PswPrepaidSwapDMO pswPrepaidSwapDMO )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "get(pswPrepaidSwapDMO)" );

					//
					// Check mandatory parameters.
					//
					thrower.ifParameterMissing( "pswPrepaidSwapDMO", pswPrepaidSwapDMO );

					//
					// Each attribute that is part of the primary key is mandatory
					//
					thrower.ifParameterMissing( "pswPrepaidSwapDMO.pswSubscriberId()",
						pswPrepaidSwapDMO.getPswSubscriberId() );
					
					thrower.ifParameterMissing( "pswPrepaidSwapDMO.pswNewSimNo()",
							pswPrepaidSwapDMO.getPswNewSimNo() );

					//
					// Attempt to get the PswPrepaidSwapDMO
					//
					QueryFilter filter = new QueryFilter();
					filter.add(FilterOp.EQUAL, PswPrepaidSwapDMO.pswSubscriberIdFilter, pswPrepaidSwapDMO.getPswSubscriberId());
					filter.add(FilterOp.EQUAL, PswPrepaidSwapDMO.pswNewSimNoFilter, pswPrepaidSwapDMO.getPswNewSimNo());

					PswPrepaidSwapDMO returnPswPrepaidSwapDMO = this.get(filter);
					
					//
					// Could not find the PswPrepaidSwapDMO
					//
					if ( returnPswPrepaidSwapDMO == null ) {
						thrower.business( Base_ACTACCTYPES_000,
							new Object[] { pswPrepaidSwapDMO.getPswSubscriberId() } );
					}

					//
					// Now, based on the values of the flags on this method signature, which in turn,
					// are based on this objects associations, get all associated, embedded objects
					//
					return returnPswPrepaidSwapDMO;
				}
				//==================================================================================================


//				public DTOList getList(
//					DTOListState   state,
//					PswPrepaidSwapDMO pswPrepaidSwapDMO )
//					throws EPPIXBusinessException, EPPIXUnexpectedException,
//						EPPIXFatalException {
//					logger.debug( "getList( state, pswPrepaidSwapDMO )" );
//
//					return pswPrepaidSwapDAC.getList( state, pswPrepaidSwapDMO );
//				}


				public PswPrepaidSwapDMO create( PswPrepaidSwapDMO pswPrepaidSwapDMO )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "create( pswPrepaidSwapDMO )" );

					thrower.ifParameterMissing( "pswPrepaidSwapDMO", pswPrepaidSwapDMO );
					thrower.ifParameterMissing( "pswPrepaidSwapDMO.pswSubscriberId()",
							pswPrepaidSwapDMO.getPswSubscriberId() );
						
						thrower.ifParameterMissing( "pswPrepaidSwapDMO.pswNewSimNo()",
								pswPrepaidSwapDMO.getPswNewSimNo() );


					//
					// Check that this object does not already exist
					//
					if ( exists( pswPrepaidSwapDMO ) ) {
						thrower.business( Base_PswPrepaidSwap_001,
							new Object[] { pswPrepaidSwapDMO.getPswSubscriberId()} );
					}

					//
					// Now create the record
					//
					pswPrepaidSwapDAC.create( pswPrepaidSwapDMO );

					return pswPrepaidSwapDMO;
				}

				public PswPrepaidSwapDMO modify( PswPrepaidSwapDMO pswPrepaidSwapDMO )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "modify( apswPrepaidSwapDMO )" );

					//
					// Check mandatory parameters (
					//
					// Note: attributes stereotyped <NotModifiable> are ignored
					//
					thrower.ifParameterMissing( "pswPrepaidSwapDMO", pswPrepaidSwapDMO );
					thrower.ifParameterMissing( "pswPrepaidSwapDMO.pswSubscriberId()",
							pswPrepaidSwapDMO.getPswSubscriberId() );
						
						thrower.ifParameterMissing( "pswPrepaidSwapDMO.pswNewSimNo()",
								pswPrepaidSwapDMO.getPswNewSimNo() );



					PswPrepaidSwapDMO updatePswPrepaidSwapDMO = new PswPrepaidSwapDMO(  );

					updatePswPrepaidSwapDMO.setPswSubscriberId(pswPrepaidSwapDMO.getPswSubscriberId());
					updatePswPrepaidSwapDMO.setPswNewSimNo(pswPrepaidSwapDMO.getPswNewSimNo());

					updatePswPrepaidSwapDMO = get( updatePswPrepaidSwapDMO );

					//
					// For each relationship to single objects (does not matter if they are Embedded or Flattened)
					// either associate to a pre-existing object, or create an object then associate to it
					//

					//
					// Copy the fields to be updated. We do not want to overwrite primary keys etc.
					// All attributes stereotyped as being <NotModifiable> are skipped
					//
					
					QueryFilter filter = new QueryFilter();
					
					filter.add(FilterOp.SET, PswPrepaidSwapDMO.pswMsisdnNoFilter, pswPrepaidSwapDMO.getPswMsisdnNo());
					filter.add(FilterOp.SET, PswPrepaidSwapDMO.pswOldSimNoFilter, pswPrepaidSwapDMO.getPswOldSimNo());
					filter.add(FilterOp.SET, PswPrepaidSwapDMO.pswReceiptDateFilter, pswPrepaidSwapDMO.getPswReceiptDate());
					filter.add(FilterOp.SET, PswPrepaidSwapDMO.pswStatusDateFilter, pswPrepaidSwapDMO.getPswStatusDate());
					filter.add(FilterOp.SET, PswPrepaidSwapDMO.pswSimStatusFilter, pswPrepaidSwapDMO.getPswSimStatus());

					filter.add(FilterOp.EQUAL, PswPrepaidSwapDMO.pswSubscriberIdFilter, pswPrepaidSwapDMO.getPswSubscriberId());
					filter.add(FilterOp.EQUAL, PswPrepaidSwapDMO.pswNewSimNoFilter, pswPrepaidSwapDMO.getPswNewSimNo());
					//
					// Modify the pswPrepaidSwapDMO
					//
					pswPrepaidSwapDAC.modify( filter );

					// Create a new PswPrepaidSwapDMO, set keys, and fetch from the database...
					PswPrepaidSwapDMO returnPswPrepaidSwapDMO = new PswPrepaidSwapDMO(  );

					returnPswPrepaidSwapDMO.setPswSubscriberId(updatePswPrepaidSwapDMO.getPswSubscriberId() );
					returnPswPrepaidSwapDMO.setPswNewSimNo(updatePswPrepaidSwapDMO.getPswNewSimNo());

					returnPswPrepaidSwapDMO = get( returnPswPrepaidSwapDMO );

					return returnPswPrepaidSwapDMO;
				}
				//==================================================================================================


				public void modify( QueryFilter filter )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "modify( filter )" );

					//
					// Modify the pswPrepaidSwapDMO
					//
					pswPrepaidSwapDAC.modify( filter );
				}
			//==================================================================================================

				public void delete( PswPrepaidSwapDMO pswPrepaidSwapDMO )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "delete( pswPrepaidSwapDMO )" );

					thrower.ifParameterMissing( "pswPrepaidSwapDMO", pswPrepaidSwapDMO );

					PswPrepaidSwapDMO updatePswPrepaidSwapDMO = null;

					updatePswPrepaidSwapDMO = get( pswPrepaidSwapDMO );

					// delete self...
					pswPrepaidSwapDAC.delete( pswPrepaidSwapDMO );
				}
			//==================================================================================================

				public void delete( QueryFilter filter )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "delete( filter )" );

					thrower.ifParameterMissing( "filter", filter );

					// delete...
					pswPrepaidSwapDAC.delete( filter );
				}
				//==================================================================================================

				public boolean exists( PswPrepaidSwapDMO pswPrepaidSwapDMO )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "exists(pswPrepaidSwapDMO)" );

					thrower.ifParameterMissing( "pswPrepaidSwapDMO", pswPrepaidSwapDMO );

					thrower.ifParameterMissing( "pswPrepaidSwapDMO.pswSubscriberId()",
							pswPrepaidSwapDMO.getPswSubscriberId() );
						
						thrower.ifParameterMissing( "pswPrepaidSwapDMO.pswNewSimNo()",
								pswPrepaidSwapDMO.getPswNewSimNo() );

					return pswPrepaidSwapDAC.exists( pswPrepaidSwapDMO );
				}
				//==================================================================================================


				public boolean exists( QueryFilter filter )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "exists(filter)" );

					return pswPrepaidSwapDAC.exists( filter );
				}
				//==================================================================================================


//				public DTOList getList(
//					DTOListState state,
//					QueryFilter  filter )
//					throws EPPIXBusinessException, EPPIXUnexpectedException,
//						EPPIXFatalException {
//					logger.debug( "getList( state, filter )" );
//
//					return pswPrepaidSwapDAC.getList( state, filter );
//				}

				//==================================================================================================


				public DAOIterator iterate( QueryFilter filter )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "iterateWithLock( filter )" );

					return pswPrepaidSwapDAC.iterate( filter );
				}
				//==================================================================================================


//				public DAOIterator iterateWithLock( QueryFilter filter )
//					throws EPPIXBusinessException, EPPIXUnexpectedException,
//						EPPIXFatalException {
//					logger.debug( "iterateWithLock( filter )" );
//
//					return pswPrepaidSwapDAC.iterateWithLock( filter );
//				}
				//==================================================================================================


				public PswPrepaidSwapDMO get( QueryFilter filter )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "get( filter )" );

					//
					// Check mandatory parameters.
					//
					thrower.ifParameterMissing( "filter", filter );

					//
					// Attempt to get the PswPrepaidSwapDMO
					//
					PswPrepaidSwapDMO pswPrepaidSwapDMO = pswPrepaidSwapDAC.get( filter );

					return pswPrepaidSwapDMO;
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

					return pswPrepaidSwapDAC.max( filter );
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

					return pswPrepaidSwapDAC.min( filter );
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

					return Integer.valueOf(pswPrepaidSwapDAC.count( filter ));
				}
	  //==================================================================================================
}