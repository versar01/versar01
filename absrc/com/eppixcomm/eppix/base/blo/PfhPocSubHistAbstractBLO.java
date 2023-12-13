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
import com.eppixcomm.eppix.common.util.QueryFilter;

public class PfhPocSubHistAbstractBLO extends BaseBLO
implements DTOActionTypes, BaseMessages {


static Thrower thrower = Thrower.getThrower( PfhPocSubHistAbstractBLO.class );


				protected static final String ENTITY_ID = "FS";

				/** Data Access Controller. */
				protected PfhPocSubHistDAC pfhPocSubHistDAC;
				/** DOCUMENT ME! */
				protected Logger logger = thrower.getLogger(  );

				/** Invoked by the BLOBinder to provide this BLO with its DAC. */
				protected void setDAC( DAC dac ) {
					this.pfhPocSubHistDAC = (PfhPocSubHistDAC) dac;
				}

				protected Class getDACClass() {
					return PfhPocSubHistDAC.class;
				}

//				public PfhPocSubHistDMO get( PfhPocSubHistDMO pfhPocSubHistDMO )
//					throws EPPIXBusinessException, EPPIXUnexpectedException,
//						EPPIXFatalException {
//					logger.debug( "get(pfhPocSubHistDMO)" );
//
//					//
//					// Check mandatory parameters.
//					//
//					thrower.ifParameterMissing( "pfhPocSubHistDMO", pfhPocSubHistDMO );
//
//					//
//					// Each attribute that is part of the primary key is mandatory
//					//
//					thrower.ifParameterMissing( "pfhPocSubHistDMO.actAccId",
//						pfhPocSubHistDMO.getPfhFieldId());
//
//					//
//					// Attempt to get the PfhPocSubHistDMO
//					//
//					PfhPocSubHistDMO returnPfhPocSubHistDMO = pfhPocSubHistDAC.get( pfhPocSubHistDMO );
//
//					//
//					// Could not find the PfhPocSubHistDMO
//					//
//					if ( returnPfhPocSubHistDMO == null ) {
//						thrower.business( Base_ACTACCTYPES_000,
//							new Object[] { pfhPocSubHistDMO.getPfhFieldId() } );
//					}
//
//					//
//					// Now, based on the values of the flags on this method signature, which in turn,
//					// are based on this objects associations, get all associated, embedded objects
//					//
//					return returnPfhPocSubHistDMO;
//				}
				//==================================================================================================


//				public DTOList getList(
//					DTOListState   state,
//					PfhPocSubHistDMO pfhPocSubHistDMO )
//					throws EPPIXBusinessException, EPPIXUnexpectedException,
//						EPPIXFatalException {
//					logger.debug( "getList( state, pfhPocSubHistDMO )" );
//
//					return pfhPocSubHistDAC.getList( state, pfhPocSubHistDMO );
//				}


				public PfhPocSubHistDMO create( PfhPocSubHistDMO pfhPocSubHistDMO )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "create( pfhPocSubHistDMO )" );

					thrower.ifParameterMissing( "pfhPocSubHistDMO", pfhPocSubHistDMO );
					thrower.ifParameterMissing( "pfhPocSubHistDMO.pfhSubscriberId",
						pfhPocSubHistDMO.getPfhSubscriberId() );
					thrower.ifParameterMissing( "pfhPocSubHistDMO.pfhTimestamp",
							pfhPocSubHistDMO.getPfhTimestamp() );
					

					//
					// Now create the record
					//
					pfhPocSubHistDAC.create( pfhPocSubHistDMO );

					return pfhPocSubHistDMO;
				}

//				public PfhPocSubHistDMO modify( PfhPocSubHistDMO pfhPocSubHistDMO )
//					throws EPPIXBusinessException, EPPIXUnexpectedException,
//						EPPIXFatalException {
//					logger.debug( "modify( apfhPocSubHistDMO )" );
//
//					//
//					// Check mandatory parameters (
//					//
//					// Note: attributes stereotyped <NotModifiable> are ignored
//					//
//					thrower.ifParameterMissing( "pfhPocSubHistDMO", pfhPocSubHistDMO );
//					thrower.ifParameterMissing( "pfhPocSubHistDMO.pfhSubscriberId",
//								pfhPocSubHistDMO.getPfhSubscriberId());
//
//
//
//					PfhPocSubHistDMO updatePfhPocSubHistDMO = new PfhPocSubHistDMO(  );
//
//					updatePfhPocSubHistDMO.setPfhSubscriberId(pfhPocSubHistDMO.getPfhSubscriberId() );
//
//					updatePfhPocSubHistDMO = get( updatePfhPocSubHistDMO );
//
//					//
//					// For each relationship to single objects (does not matter if they are Embedded or Flattened)
//					// either associate to a pre-existing object, or create an object then associate to it
//					//
//
//					//
//					// Copy the fields to be updated. We do not want to overwrite primary keys etc.
//					// All attributes stereotyped as being <NotModifiable> are skipped
//					//
//					updatePfhPocSubHistDMO.setPfhSubscriberId(pfhPocSubHistDMO.getPfhSubscriberId() );
//
//
//					//
//					// Modify the pfhPocSubHistDMO
//					//
////					pfhPocSubHistDAC.modify( updatePfhPocSubHistDMO );
//
//					// Create a new PfhPocSubHistDMO, set keys, and fetch from the database...
//					PfhPocSubHistDMO returnPfhPocSubHistDMO = new PfhPocSubHistDMO(  );
//
//					returnPfhPocSubHistDMO.setPfhSubscriberId(updatePfhPocSubHistDMO.getPfhSubscriberId());
//
//					returnPfhPocSubHistDMO = get( returnPfhPocSubHistDMO );
//
//					return returnPfhPocSubHistDMO;
//				}
				//==================================================================================================


				public void modify( QueryFilter filter )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "modify( filter )" );

					//
					// Modify the pfhPocSubHistDMO
					//
					pfhPocSubHistDAC.modify( filter );
				}
			//==================================================================================================

//				public void delete( PfhPocSubHistDMO pfhPocSubHistDMO )
//					throws EPPIXBusinessException, EPPIXUnexpectedException,
//						EPPIXFatalException {
//					logger.debug( "delete( pfhPocSubHistDMO )" );
//
//					thrower.ifParameterMissing( "pfhPocSubHistDMO", pfhPocSubHistDMO );
//
//					PfhPocSubHistDMO updatePfhPocSubHistDMO = null;
//
//					updatePfhPocSubHistDMO = get( pfhPocSubHistDMO );
//
//					// delete self...
//					pfhPocSubHistDAC.delete( pfhPocSubHistDMO );
//				}
			//==================================================================================================

				public void delete( QueryFilter filter )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "delete( filter )" );

					thrower.ifParameterMissing( "filter", filter );

					// delete...
					pfhPocSubHistDAC.delete( filter );
				}
				//==================================================================================================

//				public boolean exists( PfhPocSubHistDMO pfhPocSubHistDMO )
//					throws EPPIXBusinessException, EPPIXUnexpectedException,
//						EPPIXFatalException {
//					logger.debug( "exists(pfhPocSubHistDMO)" );
//
//					thrower.ifParameterMissing( "pfhPocSubHistDMO", pfhPocSubHistDMO );
//
//					thrower.ifParameterMissing( "pfhPocSubHistDMO.actAccId",
//						pfhPocSubHistDMO.getDpfFolderId() );
//
//					return pfhPocSubHistDAC.exists( pfhPocSubHistDMO );
//				}
				//==================================================================================================


				public boolean exists( QueryFilter filter )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "exists(filter)" );

					return pfhPocSubHistDAC.exists( filter );
				}
				//==================================================================================================


//				public DTOList getList(
//					DTOListState state,
//					QueryFilter  filter )
//					throws EPPIXBusinessException, EPPIXUnexpectedException,
//						EPPIXFatalException {
//					logger.debug( "getList( state, filter )" );
//
//					return pfhPocSubHistDAC.getList( state, filter );
//				}

				//==================================================================================================


				public DAOIterator iterate( QueryFilter filter )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "iterate( filter )" );

					return pfhPocSubHistDAC.iterate( filter );
				}
				//==================================================================================================


//				public DAOIterator iterateWithLock( QueryFilter filter )
//					throws EPPIXBusinessException, EPPIXUnexpectedException,
//						EPPIXFatalException {
//					logger.debug( "iterateWithLock( filter )" );
//
//					return pfhPocSubHistDAC.iterateWithLock( filter );
//				}
				//==================================================================================================


				public PfhPocSubHistDMO get( QueryFilter filter )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "get( filter )" );

					//
					// Check mandatory parameters.
					//
					thrower.ifParameterMissing( "filter", filter );

					//
					// Attempt to get the PfhPocSubHistDMO
					//
					PfhPocSubHistDMO pfhPocSubHistDMO = pfhPocSubHistDAC.get( filter );

					return pfhPocSubHistDMO;
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

					return pfhPocSubHistDAC.max( filter );
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

					return pfhPocSubHistDAC.min( filter );
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

					return Integer.valueOf(pfhPocSubHistDAC.count( filter ));
				}
	  //==================================================================================================


}