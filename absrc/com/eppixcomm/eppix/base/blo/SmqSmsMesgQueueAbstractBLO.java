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

public class SmqSmsMesgQueueAbstractBLO extends BaseBLO
implements DTOActionTypes, BaseMessages {


static Thrower thrower = Thrower.getThrower( SmqSmsMesgQueueAbstractBLO.class );


				protected static final String ENTITY_ID = "FS";

				/** Data Access Controller. */
				protected SmqSmsMesgQueueDAC smqSmsMesgQueueDAC;
				/** DOCUMENT ME! */
				protected Logger logger = thrower.getLogger(  );

				/** Invoked by the BLOBinder to provide this BLO with its DAC. */
				protected void setDAC( DAC dac ) {
					this.smqSmsMesgQueueDAC = (SmqSmsMesgQueueDAC) dac;
				}

				protected Class getDACClass() {
					return SmqSmsMesgQueueDAC.class;
				}

				public SmqSmsMesgQueueDMO get( SmqSmsMesgQueueDMO smqSmsMesgQueueDMO )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "get(smqSmsMesgQueueDMO)" );

					//
					// Check mandatory parameters.
					//
					thrower.ifParameterMissing( "smqSmsMesgQueueDMO", smqSmsMesgQueueDMO );

					//
					// Each attribute that is part of the primary key is mandatory
					//
					thrower.ifParameterMissing( "smqSmsMesgQueueDMO.smqId",
						smqSmsMesgQueueDMO.getSmqId() );
					
					QueryFilter filter = new QueryFilter();
					filter.add(FilterOp.EQUAL, SmqSmsMesgQueueDMO.SmqIdFilter, smqSmsMesgQueueDMO.getSmqId());

					//
					// Attempt to get the SmqSmsMesgQueueDMO
					//
					SmqSmsMesgQueueDMO returnSmqSmsMesgQueueDMO = smqSmsMesgQueueDAC.get( filter );

					//
					// Could not find the SmqSmsMesgQueueDMO
					//
					if ( returnSmqSmsMesgQueueDMO == null ) {
						thrower.business( Base_SMQSMSMESGQUEUElOOKUP_000,
							new Object[] { smqSmsMesgQueueDMO.getSmqId() } );
					}

					//
					// Now, based on the values of the flags on this method signature, which in turn,
					// are based on this objects associations, get all associated, embedded objects
					//
					return returnSmqSmsMesgQueueDMO;
				}
				//==================================================================================================


				public DTOList getList(
					DTOListState   state,
					SmqSmsMesgQueueDMO smqSmsMesgQueueDMO )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "getList( state, smqSmsMesgQueueDMO )" );

					return smqSmsMesgQueueDAC.getList( state, smqSmsMesgQueueDMO );
				}


				public SmqSmsMesgQueueDMO create( SmqSmsMesgQueueDMO smqSmsMesgQueueDMO )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "create( smqSmsMesgQueueDMO )" );

					thrower.ifParameterMissing( "smqSmsMesgQueueDMO", smqSmsMesgQueueDMO );
					thrower.ifParameterMissing( "smqSmsMesgQueueDMO.smqId",
						smqSmsMesgQueueDMO.getSmqId() );


					//
					// Check that this object does not already exist
					//
					if ( exists( smqSmsMesgQueueDMO ) ) {
						thrower.business( Base_SMQSMSMESGQUEUElOOKUP_001,
							new Object[] { smqSmsMesgQueueDMO.getSmqId() } );
					}

					//
					// Now create the record
					//
					smqSmsMesgQueueDAC.create( smqSmsMesgQueueDMO );

					return smqSmsMesgQueueDMO;
				}

				public SmqSmsMesgQueueDMO modify( SmqSmsMesgQueueDMO smqSmsMesgQueueDMO )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "modify( asmqSmsMesgQueueDMO )" );

					//
					// Check mandatory parameters (
					//
					// Note: attributes stereotyped <NotModifiable> are ignored
					//
					thrower.ifParameterMissing( "smqSmsMesgQueueDMO", smqSmsMesgQueueDMO );
					thrower.ifParameterMissing( "smqSmsMesgQueueDMO.smqId",
								smqSmsMesgQueueDMO.getSmqId() );


					//
					// For each relationship to single objects (does not matter if they are Embedded or Flattened)
					// either associate to a pre-existing object, or create an object then associate to it
					//

					//
					// Copy the fields to be updated. We do not want to overwrite primary keys etc.
					// All attributes stereotyped as being <NotModifiable> are skipped
					//
				
					QueryFilter filter = new QueryFilter();
					
					filter.add(FilterOp.SET, SmqSmsMesgQueueDMO.SmqAccNoFilter, smqSmsMesgQueueDMO.getSmqAccNo());
					filter.add(FilterOp.SET, SmqSmsMesgQueueDMO.SmqComment1Filter, smqSmsMesgQueueDMO.getSmqComment1());
					filter.add(FilterOp.SET, SmqSmsMesgQueueDMO.SmqComment2Filter, smqSmsMesgQueueDMO.getSmqComment2());
					filter.add(FilterOp.SET, SmqSmsMesgQueueDMO.SmqDateFilter, smqSmsMesgQueueDMO.getSmqDate());
					filter.add(FilterOp.SET, SmqSmsMesgQueueDMO.SmqMesgIdFilter, smqSmsMesgQueueDMO.getSmqMesgId());
					filter.add(FilterOp.SET, SmqSmsMesgQueueDMO.SmqMsisdnNoFilter, smqSmsMesgQueueDMO.getSmqMsisdnNo());
					filter.add(FilterOp.SET, SmqSmsMesgQueueDMO.SmqNewValueFilter, smqSmsMesgQueueDMO.getSmqNewValue());
					filter.add(FilterOp.SET, SmqSmsMesgQueueDMO.SmqOldValueFilter, smqSmsMesgQueueDMO.getSmqOldValue());
					filter.add(FilterOp.SET, SmqSmsMesgQueueDMO.SmqOperatorFilter, smqSmsMesgQueueDMO.getSmqOperator());
					filter.add(FilterOp.SET, SmqSmsMesgQueueDMO.SmqRetryFilter, smqSmsMesgQueueDMO.getSmqRetry());
					filter.add(FilterOp.SET, SmqSmsMesgQueueDMO.SmqSentMsisdnFilter, smqSmsMesgQueueDMO.getSmqSentMsisdn());
					filter.add(FilterOp.SET, SmqSmsMesgQueueDMO.SmqSimNoFilter, smqSmsMesgQueueDMO.getSmqSimNo());
					filter.add(FilterOp.SET, SmqSmsMesgQueueDMO.SmqStatusFilter, smqSmsMesgQueueDMO.getSmqStatus());
					filter.add(FilterOp.SET, SmqSmsMesgQueueDMO.SmqSubsIdFilter, smqSmsMesgQueueDMO.getSmqSubsId());
					filter.add(FilterOp.SET, SmqSmsMesgQueueDMO.SmqTtyFilter, smqSmsMesgQueueDMO.getSmqTty());
					
					filter.add(FilterOp.EQUAL, SmqSmsMesgQueueDMO.SmqIdFilter, smqSmsMesgQueueDMO.getSmqId());

					//
					// Modify the smqSmsMesgQueueDMO
					//
					smqSmsMesgQueueDAC.modify( filter );

					// Create a new SmqSmsMesgQueueDMO, set keys, and fetch from the database...
					SmqSmsMesgQueueDMO returnSmqSmsMesgQueueDMO = new SmqSmsMesgQueueDMO(  );

					returnSmqSmsMesgQueueDMO.setSmqId(smqSmsMesgQueueDMO.getSmqId() );

					returnSmqSmsMesgQueueDMO = get( returnSmqSmsMesgQueueDMO );

					return returnSmqSmsMesgQueueDMO;
				}
				//==================================================================================================


				public void modify( QueryFilter filter )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "modify( filter )" );

					//
					// Modify the smqSmsMesgQueueDMO
					//
					smqSmsMesgQueueDAC.modify( filter );
				}
			//==================================================================================================

				public void delete( SmqSmsMesgQueueDMO smqSmsMesgQueueDMO )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "delete( smqSmsMesgQueueDMO )" );

					thrower.ifParameterMissing( "smqSmsMesgQueueDMO", smqSmsMesgQueueDMO );

					SmqSmsMesgQueueDMO updateSmqSmsMesgQueueDMO = null;

					updateSmqSmsMesgQueueDMO = get( smqSmsMesgQueueDMO );

					// delete self...
					smqSmsMesgQueueDAC.delete( smqSmsMesgQueueDMO );
				}
			//==================================================================================================

				public void delete( QueryFilter filter )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "delete( filter )" );

					thrower.ifParameterMissing( "filter", filter );

					// delete...
					smqSmsMesgQueueDAC.delete( filter );
				}
				//==================================================================================================

				public boolean exists( SmqSmsMesgQueueDMO smqSmsMesgQueueDMO )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "exists(smqSmsMesgQueueDMO)" );

					thrower.ifParameterMissing( "smqSmsMesgQueueDMO", smqSmsMesgQueueDMO );

					thrower.ifParameterMissing( "smqSmsMesgQueueDMO.actAccId",
						smqSmsMesgQueueDMO.getSmqId() );

					return smqSmsMesgQueueDAC.exists( smqSmsMesgQueueDMO );
				}
				//==================================================================================================


				public boolean exists( QueryFilter filter )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "exists(filter)" );

					return smqSmsMesgQueueDAC.exists( filter );
				}
				//==================================================================================================


				public DTOList getList(
					DTOListState state,
					QueryFilter  filter )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "getList( state, filter )" );

					return smqSmsMesgQueueDAC.getList( state, filter );
				}

				//==================================================================================================


				public DAOIterator iterate( QueryFilter filter )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "iterateWithLock( filter )" );

					return smqSmsMesgQueueDAC.iterate( filter );
				}
				//==================================================================================================


				public DAOIterator iterateWithLock( QueryFilter filter )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "iterateWithLock( filter )" );

					return smqSmsMesgQueueDAC.iterateWithLock( filter );
				}
				//==================================================================================================


				public SmqSmsMesgQueueDMO get( QueryFilter filter )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "get( filter )" );

					//
					// Check mandatory parameters.
					//
					thrower.ifParameterMissing( "filter", filter );

					//
					// Attempt to get the SmqSmsMesgQueueDMO
					//
					SmqSmsMesgQueueDMO smqSmsMesgQueueDMO = smqSmsMesgQueueDAC.get( filter );

					return smqSmsMesgQueueDMO;
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

					return smqSmsMesgQueueDAC.max( filter );
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

					return smqSmsMesgQueueDAC.min( filter );
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

					return Integer.valueOf(smqSmsMesgQueueDAC.count( filter ));
				}
	  //==================================================================================================


}