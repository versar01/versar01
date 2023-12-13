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

public class TpaTariffAuxAbstractBLO extends BaseBLO
implements DTOActionTypes, BaseMessages {


static Thrower thrower = Thrower.getThrower( TpaTariffAuxAbstractBLO.class );


				protected static final String ENTITY_ID = "TPA";

				/** Data Access Controller. */
				protected TpaTariffAuxDAC tpaTariffAuxDAC;
				/** DOCUMENT ME! */
				protected Logger logger = thrower.getLogger(  );

				/** Invoked by the BLOBinder to provide this BLO with its DAC. */
				protected void setDAC( DAC dac ) {
					this.tpaTariffAuxDAC = (TpaTariffAuxDAC) dac;
				}

				protected Class getDACClass() {
					return TpaTariffAuxDAC.class;
				}

				public TpaTariffAuxDMO get( TpaTariffAuxDMO tpaTariffAuxDMO )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "get(tpaTariffAuxDMO)" );

					//
					// Check mandatory parameters.
					//
					thrower.ifParameterMissing( "tpaTariffAuxDMO", tpaTariffAuxDMO );

					//
					// Each attribute that is part of the primary key is mandatory
					//
					thrower.ifParameterMissing( "tpaTariffAuxDMO.tpaTariff",
						tpaTariffAuxDMO.getTpaTariff() );
					
					QueryFilter filter = new QueryFilter();
					filter.add(FilterOp.EQUAL, TpaTariffAuxDMO.TpaTariffFilter, tpaTariffAuxDMO.getTpaTariff());

					//
					// Attempt to get the TpaTariffAuxDMO
					//
					TpaTariffAuxDMO returnTpaTariffAuxDMO = tpaTariffAuxDAC.get( filter );

					//
					// Could not find the TpaTariffAuxDMO
					//
					if ( returnTpaTariffAuxDMO == null ) {
						thrower.business( Base_ACTACCTYPES_000,
							new Object[] { tpaTariffAuxDMO.getTpaTariff() } );
					}

					//
					// Now, based on the values of the flags on this method signature, which in turn,
					// are based on this objects associations, get all associated, embedded objects
					//
					return returnTpaTariffAuxDMO;
				}
				//==================================================================================================


				public DTOList getList(
					DTOListState   state,
					TpaTariffAuxDMO tpaTariffAuxDMO )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "getList( state, tpaTariffAuxDMO )" );

					return tpaTariffAuxDAC.getList( state, tpaTariffAuxDMO );
				}


				public TpaTariffAuxDMO create( TpaTariffAuxDMO tpaTariffAuxDMO )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "create( tpaTariffAuxDMO )" );

					thrower.ifParameterMissing( "tpaTariffAuxDMO", tpaTariffAuxDMO );
					thrower.ifParameterMissing( "tpaTariffAuxDMO.dpfFolderId",
						tpaTariffAuxDMO.getTpaTariff() );


					//
					// Check that this object does not already exist
					//
					if ( exists( tpaTariffAuxDMO ) ) {
						thrower.business( Base_ACTACCTYPES_001,
							new Object[] { tpaTariffAuxDMO.getTpaTariff() } );
					}

					//
					// Now create the record
					//
					tpaTariffAuxDAC.create( tpaTariffAuxDMO );

					return tpaTariffAuxDMO;
				}

				public TpaTariffAuxDMO modify( TpaTariffAuxDMO tpaTariffAuxDMO )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "modify( atpaTariffAuxDMO )" );

					//
					// Check mandatory parameters (
					//
					// Note: attributes stereotyped <NotModifiable> are ignored
					//
					thrower.ifParameterMissing( "tpaTariffAuxDMO", tpaTariffAuxDMO );
					thrower.ifParameterMissing( "tpaTariffAuxDMO.dpfFolderId",
								tpaTariffAuxDMO.getTpaTariff() );


					QueryFilter filter = new QueryFilter();
					filter.add(FilterOp.SET, TpaTariffAuxDMO.TpaAudienceFilter, tpaTariffAuxDMO.getTpaAudience());
					filter.add(FilterOp.SET, TpaTariffAuxDMO.TpaNormalSubFilter, tpaTariffAuxDMO.getTpaNormalSub());
					filter.add(FilterOp.SET, TpaTariffAuxDMO.TpaPromoSubFilter, tpaTariffAuxDMO.getTpaPromoSub());
					filter.add(FilterOp.EQUAL, TpaTariffAuxDMO.TpaTariffFilter, tpaTariffAuxDMO.getTpaTariff());


					//
					// Modify the tpaTariffAuxDMO
					//
					tpaTariffAuxDAC.modify( filter );

					// Create a new TpaTariffAuxDMO, set keys, and fetch from the database...
					filter = new QueryFilter();
					filter.add(FilterOp.EQUAL, TpaTariffAuxDMO.TpaTariffFilter, tpaTariffAuxDMO.getTpaTariff());

					TpaTariffAuxDMO returnTpaTariffAuxDMO = get( filter );

					return returnTpaTariffAuxDMO;
				}
				//==================================================================================================


				public void modify( QueryFilter filter )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "modify( filter )" );

					//
					// Modify the tpaTariffAuxDMO
					//
					tpaTariffAuxDAC.modify( filter );
				}
			//==================================================================================================

				public void delete( TpaTariffAuxDMO tpaTariffAuxDMO )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "delete( tpaTariffAuxDMO )" );

					thrower.ifParameterMissing( "tpaTariffAuxDMO", tpaTariffAuxDMO );

					TpaTariffAuxDMO updateTpaTariffAuxDMO = null;

					updateTpaTariffAuxDMO = get( tpaTariffAuxDMO );

					// delete self...
					tpaTariffAuxDAC.delete( tpaTariffAuxDMO );
				}
			//==================================================================================================

				public void delete( QueryFilter filter )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "delete( filter )" );

					thrower.ifParameterMissing( "filter", filter );

					// delete...
					tpaTariffAuxDAC.delete( filter );
				}
				//==================================================================================================

				public boolean exists( TpaTariffAuxDMO tpaTariffAuxDMO )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "exists(tpaTariffAuxDMO)" );

					thrower.ifParameterMissing( "tpaTariffAuxDMO", tpaTariffAuxDMO );

					thrower.ifParameterMissing( "tpaTariffAuxDMO.actAccId",
						tpaTariffAuxDMO.getTpaTariff() );

					return tpaTariffAuxDAC.exists( tpaTariffAuxDMO );
				}
				//==================================================================================================


				public boolean exists( QueryFilter filter )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "exists(filter)" );

					return tpaTariffAuxDAC.exists( filter );
				}
				//==================================================================================================


				public DTOList getList(
					DTOListState state,
					QueryFilter  filter )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "getList( state, filter )" );

					return tpaTariffAuxDAC.getList( state, filter );
				}

				//==================================================================================================


				public DAOIterator iterate( QueryFilter filter )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "iterateWithLock( filter )" );

					return tpaTariffAuxDAC.iterate( filter );
				}
				//==================================================================================================


				public DAOIterator iterateWithLock( QueryFilter filter )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "iterateWithLock( filter )" );

					return tpaTariffAuxDAC.iterateWithLock( filter );
				}
				//==================================================================================================


				public TpaTariffAuxDMO get( QueryFilter filter )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "get( filter )" );

					//
					// Check mandatory parameters.
					//
					thrower.ifParameterMissing( "filter", filter );

					//
					// Attempt to get the TpaTariffAuxDMO
					//
					TpaTariffAuxDMO tpaTariffAuxDMO = tpaTariffAuxDAC.get( filter );

					return tpaTariffAuxDMO;
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

					return tpaTariffAuxDAC.max( filter );
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

					return tpaTariffAuxDAC.min( filter );
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

					return Integer.valueOf(tpaTariffAuxDAC.count( filter ));
				}
	  //==================================================================================================



}