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

public class VraVrAccountAbstractBLO extends BaseBLO
implements DTOActionTypes, BaseMessages {


static Thrower thrower = Thrower.getThrower( VraVrAccountAbstractBLO.class );


				protected static final String ENTITY_ID = "VRA";

				/** Data Access Controller. */
				protected VraVrAccountDAC vraVrAccountDAC;
				/** DOCUMENT ME! */
				protected Logger logger = thrower.getLogger(  );

				/** Invoked by the BLOBinder to provide this BLO with its DAC. */
				protected void setDAC( DAC dac ) {
					this.vraVrAccountDAC = (VraVrAccountDAC) dac;
				}

				protected Class getDACClass() {
					return VraVrAccountDAC.class;
				}

				public VraVrAccountDMO get( VraVrAccountDMO vraVrAccountDMO )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "get(vraVrAccountDMO)" );

					//
					// Check mandatory parameters.
					//
					thrower.ifParameterMissing( "vraVrAccountDMO", vraVrAccountDMO );

					//
					// Each attribute that is part of the primary key is mandatory
					//
					thrower.ifParameterMissing( "vraVrAccountDMO.vraId",
						vraVrAccountDMO.getVraId() );

					
					QueryFilter filter = new QueryFilter();
					filter.add(FilterOp.EQUAL, VraVrAccountDMO.VraIdFilter, vraVrAccountDMO.getVraId());
					//
					// Attempt to get the VraVrAccountDMO
					//
					VraVrAccountDMO returnVraVrAccountDMO = vraVrAccountDAC.get( filter );

					//
					// Could not find the VraVrAccountDMO
					//
					if ( returnVraVrAccountDMO == null ) {
						thrower.business( Base_ACTACCTYPES_000,
							new Object[] { vraVrAccountDMO.getVraId() } );
					}

					//
					// Now, based on the values of the flags on this method signature, which in turn,
					// are based on this objects associations, get all associated, embedded objects
					//
					return returnVraVrAccountDMO;
				}
				//==================================================================================================


				public DTOList getList(
					DTOListState   state,
					VraVrAccountDMO vraVrAccountDMO )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "getList( state, vraVrAccountDMO )" );

					return vraVrAccountDAC.getList( state, vraVrAccountDMO );
				}


				public VraVrAccountDMO create( VraVrAccountDMO vraVrAccountDMO )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "create( vraVrAccountDMO )" );

					thrower.ifParameterMissing( "vraVrAccountDMO", vraVrAccountDMO );
					thrower.ifParameterMissing( "vraVrAccountDMO.vraId",
						vraVrAccountDMO.getVraId() );


					//
					// Check that this object does not already exist
					//
					if ( exists( vraVrAccountDMO ) ) {
						thrower.business( Base_ACTACCTYPES_001,
							new Object[] { vraVrAccountDMO.getVraId() } );
					}

					//
					// Now create the record
					//
					vraVrAccountDAC.create( vraVrAccountDMO );

					return vraVrAccountDMO;
				}

				public VraVrAccountDMO modify( VraVrAccountDMO vraVrAccountDMO )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "modify( avraVrAccountDMO )" );

					//
					// Check mandatory parameters (
					//
					// Note: attributes stereotyped <NotModifiable> are ignored
					//
					thrower.ifParameterMissing( "vraVrAccountDMO", vraVrAccountDMO );
					thrower.ifParameterMissing( "vraVrAccountDMO.vraId",
								vraVrAccountDMO.getVraId() );


					QueryFilter filter = new QueryFilter();
					filter.add(FilterOp.SET, VraVrAccountDMO.VraBillAcNoFilter, vraVrAccountDMO.getVraBillAcNo());
					filter.add(FilterOp.SET, VraVrAccountDMO.VraCapValueFilter, vraVrAccountDMO.getVraCapValue());
					filter.add(FilterOp.SET, VraVrAccountDMO.VraEnabledFilter, vraVrAccountDMO.getVraEnabled());
					filter.add(FilterOp.EQUAL, VraVrAccountDMO.VraIdFilter, vraVrAccountDMO.getVraId());

					//
					// Modify the vraVrAccountDMO
					//
					vraVrAccountDAC.modify( filter );
					
					filter = new QueryFilter();
					filter.add(FilterOp.EQUAL, VraVrAccountDMO.VraIdFilter, vraVrAccountDMO.getVraId());

					// Create a new VraVrAccountDMO, set keys, and fetch from the database...
					VraVrAccountDMO returnVraVrAccountDMO = get(filter);

					return returnVraVrAccountDMO;
				}
				//==================================================================================================


				public void modify( QueryFilter filter )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "modify( filter )" );

					//
					// Modify the vraVrAccountDMO
					//
					vraVrAccountDAC.modify( filter );
				}
			//==================================================================================================

				public void delete( VraVrAccountDMO vraVrAccountDMO )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "delete( vraVrAccountDMO )" );

					thrower.ifParameterMissing( "vraVrAccountDMO", vraVrAccountDMO );

					thrower.ifParameterMissing( "vraVrAccountDMO.vraId",
							vraVrAccountDMO.getVraId() );
					
					VraVrAccountDMO updateVraVrAccountDMO = null;

					updateVraVrAccountDMO = get( vraVrAccountDMO );

					// delete self...
					vraVrAccountDAC.delete( vraVrAccountDMO );
				}
			//==================================================================================================

				public void delete( QueryFilter filter )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "delete( filter )" );

					thrower.ifParameterMissing( "filter", filter );

					// delete...
					vraVrAccountDAC.delete( filter );
				}
				//==================================================================================================

				public boolean exists( VraVrAccountDMO vraVrAccountDMO )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "exists(vraVrAccountDMO)" );

					thrower.ifParameterMissing( "vraVrAccountDMO", vraVrAccountDMO );

					thrower.ifParameterMissing( "vraVrAccountDMO.vraId",
						vraVrAccountDMO.getVraId() );

					return vraVrAccountDAC.exists( vraVrAccountDMO );
				}
				//==================================================================================================


				public boolean exists( QueryFilter filter )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "exists(filter)" );

					return vraVrAccountDAC.exists( filter );
				}
				//==================================================================================================


				public DTOList getList(
					DTOListState state,
					QueryFilter  filter )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "getList( state, filter )" );

					return vraVrAccountDAC.getList( state, filter );
				}

				//==================================================================================================


				public DAOIterator iterate( QueryFilter filter )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "iterateWithLock( filter )" );

					return vraVrAccountDAC.iterate( filter );
				}
				//==================================================================================================


				public DAOIterator iterateWithLock( QueryFilter filter )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "iterateWithLock( filter )" );

					return vraVrAccountDAC.iterateWithLock( filter );
				}
				//==================================================================================================


				public VraVrAccountDMO get( QueryFilter filter )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "get( filter )" );

					//
					// Check mandatory parameters.
					//
					thrower.ifParameterMissing( "filter", filter );

					//
					// Attempt to get the VraVrAccountDMO
					//
					VraVrAccountDMO vraVrAccountDMO = vraVrAccountDAC.get( filter );

					return vraVrAccountDMO;
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

					return vraVrAccountDAC.max( filter );
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

					return vraVrAccountDAC.min( filter );
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

					return Integer.valueOf(vraVrAccountDAC.count( filter ));
				}
	  //==================================================================================================



}