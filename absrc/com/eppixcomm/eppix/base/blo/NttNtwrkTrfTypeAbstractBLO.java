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

public class NttNtwrkTrfTypeAbstractBLO extends BaseBLO
implements DTOActionTypes, BaseMessages {


static Thrower thrower = Thrower.getThrower( NttNtwrkTrfTypeAbstractBLO.class );


				protected static final String ENTITY_ID = "MSI";

				/** Data Access Controller. */
				protected NttNtwrkTrfTypeDAC nttNtwrkTrfTypeDAC;
				/** DOCUMENT ME! */
				protected Logger logger = thrower.getLogger(  );

				/** Invoked by the BLOBinder to provide this BLO with its DAC. */
				protected void setDAC( DAC dac ) {
					this.nttNtwrkTrfTypeDAC = (NttNtwrkTrfTypeDAC) dac;
				}

				protected Class getDACClass() {
					return NttNtwrkTrfTypeDAC.class;
				}

				public NttNtwrkTrfTypeDMO get( NttNtwrkTrfTypeDMO nttNtwrkTrfTypeDMO )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "get(nttNtwrkTrfTypeDMO)" );

					//
					// Check mandatory parameters.
					//
					thrower.ifParameterMissing( "nttNtwrkTrfTypeDMO", nttNtwrkTrfTypeDMO );

					//
					// Each attribute that is part of the primary key is mandatory
					//
					thrower.ifParameterMissing( "nttNtwrkTrfTypeDMO.actAccId",
						nttNtwrkTrfTypeDMO.getNttNtwrkTariff() );
					
					QueryFilter filter = new QueryFilter();
					filter.add(FilterOp.EQUAL, NttNtwrkTrfTypeDMO.NttNtwrkTariffFilter, nttNtwrkTrfTypeDMO.getNttNtwrkTariff());

					//
					// Attempt to get the NttNtwrkTrfTypeDMO
					//
					NttNtwrkTrfTypeDMO returnNttNtwrkTrfTypeDMO = nttNtwrkTrfTypeDAC.get( filter );

					//
					// Could not find the NttNtwrkTrfTypeDMO
					//
					if ( returnNttNtwrkTrfTypeDMO == null ) {
						thrower.business( Base_ACTACCTYPES_000,
							new Object[] { nttNtwrkTrfTypeDMO.getNttNtwrkTariff() } );
					}

					//
					// Now, based on the values of the flags on this method signature, which in turn,
					// are based on this objects associations, get all associated, embedded objects
					//
					return returnNttNtwrkTrfTypeDMO;
				}
				//==================================================================================================


				public DTOList getList(
					DTOListState   state,
					NttNtwrkTrfTypeDMO nttNtwrkTrfTypeDMO )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "getList( state, nttNtwrkTrfTypeDMO )" );

					return nttNtwrkTrfTypeDAC.getList( state, nttNtwrkTrfTypeDMO );
				}


				public NttNtwrkTrfTypeDMO create( NttNtwrkTrfTypeDMO nttNtwrkTrfTypeDMO )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "create( nttNtwrkTrfTypeDMO )" );

					thrower.ifParameterMissing( "nttNtwrkTrfTypeDMO", nttNtwrkTrfTypeDMO );
					thrower.ifParameterMissing( "nttNtwrkTrfTypeDMO.dpfFolderId",
						nttNtwrkTrfTypeDMO.getNttNtwrkTariff() );


					//
					// Check that this object does not already exist
					//
					if ( exists( nttNtwrkTrfTypeDMO ) ) {
						thrower.business( Base_ACTACCTYPES_001,
							new Object[] { nttNtwrkTrfTypeDMO.getNttNtwrkTariff() } );
					}

					//
					// Now create the record
					//
					nttNtwrkTrfTypeDAC.create( nttNtwrkTrfTypeDMO );

					return nttNtwrkTrfTypeDMO;
				}

				public NttNtwrkTrfTypeDMO modify( NttNtwrkTrfTypeDMO nttNtwrkTrfTypeDMO )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "modify( anttNtwrkTrfTypeDMO )" );

					//
					// Check mandatory parameters (
					//
					// Note: attributes stereotyped <NotModifiable> are ignored
					//
					thrower.ifParameterMissing( "nttNtwrkTrfTypeDMO", nttNtwrkTrfTypeDMO );
					thrower.ifParameterMissing( "nttNtwrkTrfTypeDMO.nttNtwrkTariff",
								nttNtwrkTrfTypeDMO.getNttNtwrkTariff() );

					//
					// For each relationship to single objects (does not matter if they are Embedded or Flattened)
					// either associate to a pre-existing object, or create an object then associate to it
					//

					//
					// Copy the fields to be updated. We do not want to overwrite primary keys etc.
					// All attributes stereotyped as being <NotModifiable> are skipped
					//

//					QueryFilter filter = new QueryFilter();
//					filter.add(FilterOp.EQUAL, NttNtwrkTrfTypeDMO.NttNtwrkTariffFilter, nttNtwrkTrfTypeDMO.getNttNtwrkTariff());

					//
					// Attempt to get the NttNtwrkTrfTypeDMO
					//
//					NttNtwrkTrfTypeDMO returnNttNtwrkTrfTypeDMO = nttNtwrkTrfTypeDAC.get( filter );

					//
					// Modify the nttNtwrkTrfTypeDMO
					
					QueryFilter filter = new QueryFilter();
					filter.add(FilterOp.SET, NttNtwrkTrfTypeDMO.NttAllowMsiSwapFilter, (nttNtwrkTrfTypeDMO.getNttAllowMsiSwap() == null)? null : nttNtwrkTrfTypeDMO.getNttAllowMsiSwap());
					
					if(nttNtwrkTrfTypeDMO.getNttStartDate() != null){
					filter.add(FilterOp.SET, NttNtwrkTrfTypeDMO.NttStartDateFilter, nttNtwrkTrfTypeDMO.getNttStartDate());// == null)? "" : nttNtwrkTrfTypeDMO.getNttStartDate());
					};
					
					if(nttNtwrkTrfTypeDMO.getNttEndDate() != null){					
					filter.add(FilterOp.SET, NttNtwrkTrfTypeDMO.NttEndDateFilter, nttNtwrkTrfTypeDMO.getNttEndDate());// == null)? "" : nttNtwrkTrfTypeDMO.getNttEndDate());
					};
					
					filter.add(FilterOp.SET, NttNtwrkTrfTypeDMO.NttContractPerFilter, (nttNtwrkTrfTypeDMO.getNttContractPer() == null)? null : nttNtwrkTrfTypeDMO.getNttContractPer());
					filter.add(FilterOp.SET, NttNtwrkTrfTypeDMO.NttAllowSpMigrFilter, (nttNtwrkTrfTypeDMO.getNttAllowSpMigr() == null)? null : nttNtwrkTrfTypeDMO.getNttAllowSpMigr());
					filter.add(FilterOp.EQUAL, NttNtwrkTrfTypeDMO.NttNtwrkTariffFilter, nttNtwrkTrfTypeDMO.getNttNtwrkTariff());

					//
					nttNtwrkTrfTypeDAC.modify( filter );

					return nttNtwrkTrfTypeDMO;
				}
				//==================================================================================================


				public void modify( QueryFilter filter )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "modify( filter )" );

					//
					// Modify the nttNtwrkTrfTypeDMO
					//
					nttNtwrkTrfTypeDAC.modify( filter );
				}
			//==================================================================================================

				public void delete( NttNtwrkTrfTypeDMO nttNtwrkTrfTypeDMO )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "delete( nttNtwrkTrfTypeDMO )" );

					thrower.ifParameterMissing( "nttNtwrkTrfTypeDMO", nttNtwrkTrfTypeDMO );

					NttNtwrkTrfTypeDMO updateNttNtwrkTrfTypeDMO = null;

					updateNttNtwrkTrfTypeDMO = get( nttNtwrkTrfTypeDMO );

					// delete self...
					nttNtwrkTrfTypeDAC.delete( nttNtwrkTrfTypeDMO );
				}
			//==================================================================================================

				public void delete( QueryFilter filter )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "delete( filter )" );

					thrower.ifParameterMissing( "filter", filter );

					// delete...
					nttNtwrkTrfTypeDAC.delete( filter );
				}
				//==================================================================================================

				public boolean exists( NttNtwrkTrfTypeDMO nttNtwrkTrfTypeDMO )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "exists(nttNtwrkTrfTypeDMO)" );

					thrower.ifParameterMissing( "nttNtwrkTrfTypeDMO", nttNtwrkTrfTypeDMO );

					thrower.ifParameterMissing( "nttNtwrkTrfTypeDMO.actAccId",
						nttNtwrkTrfTypeDMO.getNttNtwrkTariff());

					return nttNtwrkTrfTypeDAC.exists( nttNtwrkTrfTypeDMO );
				}
				//==================================================================================================


				public boolean exists( QueryFilter filter )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "exists(filter)" );

					return nttNtwrkTrfTypeDAC.exists( filter );
				}
				//==================================================================================================


				public DTOList getList(
					DTOListState state,
					QueryFilter  filter )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "getList( state, filter )" );

					return nttNtwrkTrfTypeDAC.getList( state, filter );
				}

				//==================================================================================================


				public DAOIterator iterate( QueryFilter filter )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "iterateWithLock( filter )" );

					return nttNtwrkTrfTypeDAC.iterate( filter );
				}
				//==================================================================================================


				public DAOIterator iterateWithLock( QueryFilter filter )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "iterateWithLock( filter )" );

					return nttNtwrkTrfTypeDAC.iterateWithLock( filter );
				}
				//==================================================================================================


				public NttNtwrkTrfTypeDMO get( QueryFilter filter )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "get( filter )" );

					//
					// Check mandatory parameters.
					//
					thrower.ifParameterMissing( "filter", filter );

					//
					// Attempt to get the NttNtwrkTrfTypeDMO
					//
					NttNtwrkTrfTypeDMO nttNtwrkTrfTypeDMO = nttNtwrkTrfTypeDAC.get( filter );

					return nttNtwrkTrfTypeDMO;
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

					return nttNtwrkTrfTypeDAC.max( filter );
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

					return nttNtwrkTrfTypeDAC.min( filter );
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

					return Integer.valueOf(nttNtwrkTrfTypeDAC.count( filter ));
				}
	  //==================================================================================================



}