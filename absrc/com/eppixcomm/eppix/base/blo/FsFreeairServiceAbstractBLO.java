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

public class FsFreeairServiceAbstractBLO extends BaseBLO
implements DTOActionTypes, BaseMessages {


static Thrower thrower = Thrower.getThrower( FsFreeairServiceAbstractBLO.class );


				protected static final String ENTITY_ID = "FS";

				/** Data Access Controller. */
				protected FsFreeairServiceDAC fsFreeairServiceDAC;
				/** DOCUMENT ME! */
				protected Logger logger = thrower.getLogger(  );

				/** Invoked by the BLOBinder to provide this BLO with its DAC. */
				protected void setDAC( DAC dac ) {
					this.fsFreeairServiceDAC = (FsFreeairServiceDAC) dac;
				}

				protected Class getDACClass() {
					return FsFreeairServiceDAC.class;
				}

				public FsFreeairServiceDMO get( FsFreeairServiceDMO fsFreeairServiceDMO )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "get(fsFreeairServiceDMO)" );

					//
					// Check mandatory parameters.
					//
					thrower.ifParameterMissing( "fsFreeairServiceDMO", fsFreeairServiceDMO );

					//
					// Each attribute that is part of the primary key is mandatory
					//
					thrower.ifParameterMissing( "fsFreeairServiceDMO.actAccId",
						fsFreeairServiceDMO.getFsServiceCode() );
					
					QueryFilter filter = new QueryFilter();
					filter.add(FilterOp.EQUAL, FsFreeairServiceDMO.FsServiceCodeFilter,fsFreeairServiceDMO.getFsServiceCode()); 

					//
					// Attempt to get the FsFreeairServiceDMO
					//
					FsFreeairServiceDMO returnFsFreeairServiceDMO = fsFreeairServiceDAC.get( filter );

					//
					// Could not find the FsFreeairServiceDMO
					//
					if ( returnFsFreeairServiceDMO == null ) {
						thrower.business( Base_FSFREEAIRSERVICElOOKUP_000,
							new Object[] { fsFreeairServiceDMO.getFsServiceCode() } );
					}

					//
					// Now, based on the values of the flags on this method signature, which in turn,
					// are based on this objects associations, get all associated, embedded objects
					//
					return returnFsFreeairServiceDMO;
				}
				//==================================================================================================


				public DTOList getList(
					DTOListState   state,
					FsFreeairServiceDMO fsFreeairServiceDMO )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "getList( state, fsFreeairServiceDMO )" );

					return fsFreeairServiceDAC.getList( state, fsFreeairServiceDMO );
				}


				public FsFreeairServiceDMO create( FsFreeairServiceDMO fsFreeairServiceDMO )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "create( fsFreeairServiceDMO )" );

					thrower.ifParameterMissing( "fsFreeairServiceDMO", fsFreeairServiceDMO );
					thrower.ifParameterMissing( "fsFreeairServiceDMO.dpfFolderId",
						fsFreeairServiceDMO.getFsServiceCode() );


					//
					// Check that this object does not already exist
					//
					if ( exists( fsFreeairServiceDMO ) ) {
						thrower.business( Base_FSFREEAIRSERVICElOOKUP_001,
							new Object[] { fsFreeairServiceDMO.getFsServiceCode() } );
					}

					//
					// Now create the record
					//
					fsFreeairServiceDAC.create( fsFreeairServiceDMO );

					return fsFreeairServiceDMO;
				}

				public FsFreeairServiceDMO modify( FsFreeairServiceDMO fsFreeairServiceDMO )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "modify( afsFreeairServiceDMO )" );

					//
					// Check mandatory parameters (
					//
					// Note: attributes stereotyped <NotModifiable> are ignored
					//
					thrower.ifParameterMissing( "fsFreeairServiceDMO", fsFreeairServiceDMO );
					thrower.ifParameterMissing( "fsFreeairServiceDMO.dpfFolderId",
								fsFreeairServiceDMO.getFsServiceCode() );

					//
					// For each relationship to single objects (does not matter if they are Embedded or Flattened)
					// either associate to a pre-existing object, or create an object then associate to it
					//

					//
					// Copy the fields to be updated. We do not want to overwrite primary keys etc.
					// All attributes stereotyped as being <NotModifiable> are skipped
					//
					
					QueryFilter filter = new QueryFilter();
					
					filter.add(FilterOp.SET, FsFreeairServiceDMO.FsActRuleFilter,fsFreeairServiceDMO.getFsActRule()); 
					filter.add(FilterOp.SET, FsFreeairServiceDMO.FsAirLateCallFilter,fsFreeairServiceDMO.getFsAirLateCall()); 
					
					if(fsFreeairServiceDMO.getFsBillPeriodNo() != null){
						filter.add(FilterOp.SET, FsFreeairServiceDMO.FsBillPeriodNoFilter,fsFreeairServiceDMO.getFsBillPeriodNo());
					}
					
					filter.add(FilterOp.SET, FsFreeairServiceDMO.FsDeactRuleFilter,fsFreeairServiceDMO.getFsDeactRule()); 
					filter.add(FilterOp.SET, FsFreeairServiceDMO.FsFreeSecondsFilter,fsFreeairServiceDMO.getFsFreeSeconds()); 
					filter.add(FilterOp.SET, FsFreeairServiceDMO.FsGroupIdFilter,fsFreeairServiceDMO.getFsGroupId()); 
					filter.add(FilterOp.SET, FsFreeairServiceDMO.FsShareTimeFilter,fsFreeairServiceDMO.getFsShareTime()); 
					filter.add(FilterOp.SET, FsFreeairServiceDMO.FsTakeTimeOverFilter,fsFreeairServiceDMO.getFsTakeTimeOver()); 
					
					filter.add(FilterOp.EQUAL, FsFreeairServiceDMO.FsServiceCodeFilter,fsFreeairServiceDMO.getFsServiceCode()); 



					//
					// Modify the fsFreeairServiceDMO
					//
					fsFreeairServiceDAC.modify(filter);

					// Create a new FsFreeairServiceDMO, set keys, and fetch from the database...
					FsFreeairServiceDMO returnFsFreeairServiceDMO = null;

					filter = new QueryFilter();
					filter.add(FilterOp.EQUAL, FsFreeairServiceDMO.FsServiceCodeFilter,fsFreeairServiceDMO.getFsServiceCode());

					returnFsFreeairServiceDMO = get( filter );

					return returnFsFreeairServiceDMO;
				}
				//==================================================================================================


				public void modify( QueryFilter filter )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "modify( filter )" );

					//
					// Modify the fsFreeairServiceDMO
					//
					fsFreeairServiceDAC.modify( filter );
				}
			//==================================================================================================

				public void delete( FsFreeairServiceDMO fsFreeairServiceDMO )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "delete( fsFreeairServiceDMO )" );

					thrower.ifParameterMissing( "fsFreeairServiceDMO", fsFreeairServiceDMO );

					FsFreeairServiceDMO updateFsFreeairServiceDMO = null;

					updateFsFreeairServiceDMO = get( fsFreeairServiceDMO );

					// delete self...
					fsFreeairServiceDAC.delete( fsFreeairServiceDMO );
				}
			//==================================================================================================

				public void delete( QueryFilter filter )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "delete( filter )" );

					thrower.ifParameterMissing( "filter", filter );

					// delete...
					fsFreeairServiceDAC.delete( filter );
				}
				//==================================================================================================

				public boolean exists( FsFreeairServiceDMO fsFreeairServiceDMO )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "exists(fsFreeairServiceDMO)" );

					thrower.ifParameterMissing( "fsFreeairServiceDMO", fsFreeairServiceDMO );

					thrower.ifParameterMissing( "fsFreeairServiceDMO.actAccId",
						fsFreeairServiceDMO.getFsServiceCode() );

					return fsFreeairServiceDAC.exists( fsFreeairServiceDMO );
				}
				//==================================================================================================


				public boolean exists( QueryFilter filter )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "exists(filter)" );

					return fsFreeairServiceDAC.exists( filter );
				}
				//==================================================================================================


				public DTOList getList(
					DTOListState state,
					QueryFilter  filter )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "getList( state, filter )" );

					return fsFreeairServiceDAC.getList( state, filter );
				}

				//==================================================================================================


				public DAOIterator iterate( QueryFilter filter )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "iterateWithLock( filter )" );

					return fsFreeairServiceDAC.iterate( filter );
				}
				//==================================================================================================


				public DAOIterator iterateWithLock( QueryFilter filter )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "iterateWithLock( filter )" );

					return fsFreeairServiceDAC.iterateWithLock( filter );
				}
				//==================================================================================================


				public FsFreeairServiceDMO get( QueryFilter filter )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "get( filter )" );

					//
					// Check mandatory parameters.
					//
					thrower.ifParameterMissing( "filter", filter );

					//
					// Attempt to get the FsFreeairServiceDMO
					//
					FsFreeairServiceDMO fsFreeairServiceDMO = fsFreeairServiceDAC.get( filter );

					return fsFreeairServiceDMO;
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

					return fsFreeairServiceDAC.max( filter );
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

					return fsFreeairServiceDAC.min( filter );
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

					return Integer.valueOf(fsFreeairServiceDAC.count( filter ));
				}
	  //==================================================================================================



}