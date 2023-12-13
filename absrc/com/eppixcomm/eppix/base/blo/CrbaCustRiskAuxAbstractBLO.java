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

public class CrbaCustRiskAuxAbstractBLO extends BaseBLO
implements DTOActionTypes, BaseMessages {


static Thrower thrower = Thrower.getThrower( CrbaCustRiskAuxAbstractBLO.class );


				protected static final String ENTITY_ID = "CRB";

				/** Data Access Controller. */
				protected CrbaCustRiskAuxDAC crbaCustRiskAuxDAC;
				/** DOCUMENT ME! */
				protected Logger logger = thrower.getLogger(  );

				/** Invoked by the BLOBinder to provide this BLO with its DAC. */
				protected void setDAC( DAC dac ) {
					this.crbaCustRiskAuxDAC = (CrbaCustRiskAuxDAC) dac;
				}

				protected Class getDACClass() {
					return CrbaCustRiskAuxDAC.class;
				}

//				public CrbaCustRiskAuxDMO get( CrbaCustRiskAuxDMO crbaCustRiskAuxDMO )
//					throws EPPIXBusinessException, EPPIXUnexpectedException,
//						EPPIXFatalException {
//					logger.debug( "get(crbaCustRiskAuxDMO)" );
//
//					//
//					// Check mandatory parameters.
//					//
//					thrower.ifParameterMissing( "crbaCustRiskAuxDMO", crbaCustRiskAuxDMO );
//
//					//
//					// Each attribute that is part of the primary key is mandatory
//					//
//					thrower.ifParameterMissing( "crbaCustRiskAuxDMO.crbaBillAcNo",
//						crbaCustRiskAuxDMO.getCrbaBillAcNo() );
//
//					//
//					// Attempt to get the CrbaCustRiskAuxDMO
//					//
//					CrbaCustRiskAuxDMO returnCrbaCustRiskAuxDMO = crbaCustRiskAuxDAC.get( crbaCustRiskAuxDMO );
//
//					//
//					// Could not find the CrbaCustRiskAuxDMO
//					//
//					if ( returnCrbaCustRiskAuxDMO == null ) {
//						thrower.business( Base_CRBACUSTRISKAUX_000,
//							new Object[] { crbaCustRiskAuxDMO.getCrbaBillAcNo() } );
//					}
//
//					//
//					// Now, based on the values of the flags on this method signature, which in turn,
//					// are based on this objects associations, get all associated, embedded objects
//					//
//					return returnCrbaCustRiskAuxDMO;
//				}
				//==================================================================================================


				public DTOList getList(
					DTOListState   state,
					CrbaCustRiskAuxDMO crbaCustRiskAuxDMO )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "getList( state, crbaCustRiskAuxDMO )" );

					return crbaCustRiskAuxDAC.getList( state, crbaCustRiskAuxDMO );
				}


				public CrbaCustRiskAuxDMO create( CrbaCustRiskAuxDMO crbaCustRiskAuxDMO )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "create( crbaCustRiskAuxDMO )" );

					thrower.ifParameterMissing( "crbaCustRiskAuxDMO", crbaCustRiskAuxDMO );
					thrower.ifParameterMissing( "crbaCustRiskAuxDMO.crbaBillAcNo",
						crbaCustRiskAuxDMO.getCrbaBillAcNo() );


					//
					// Check that this object does not already exist
					//
					if ( exists( crbaCustRiskAuxDMO ) ) {
						thrower.business( Base_CRBACUSTRISKAUX_001,
							new Object[] { crbaCustRiskAuxDMO.getCrbaBillAcNo() } );
					}

					//
					// Now create the record
					//
					crbaCustRiskAuxDAC.create( crbaCustRiskAuxDMO );

					return crbaCustRiskAuxDMO;
				}

//				public CrbaCustRiskAuxDMO modify( CrbaCustRiskAuxDMO crbaCustRiskAuxDMO )
//					throws EPPIXBusinessException, EPPIXUnexpectedException,
//						EPPIXFatalException {
//					logger.debug( "modify( acrbaCustRiskAuxDMO )" );
//
//					//
//					// Check mandatory parameters (
//					//
//					// Note: attributes stereotyped <NotModifiable> are ignored
//					//
//					thrower.ifParameterMissing( "crbaCustRiskAuxDMO", crbaCustRiskAuxDMO );
//					thrower.ifParameterMissing( "crbaCustRiskAuxDMO.crbaBillAcNo",
//								crbaCustRiskAuxDMO.getCrbaBillAcNo() );
//
//
//
//					CrbaCustRiskAuxDMO updateCrbaCustRiskAuxDMO = new CrbaCustRiskAuxDMO(  );
//
//					updateCrbaCustRiskAuxDMO.setCrbaBillAcNo(crbaCustRiskAuxDMO.getCrbaBillAcNo() );
//
//					updateCrbaCustRiskAuxDMO = get( updateCrbaCustRiskAuxDMO );
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
//					updateCrbaCustRiskAuxDMO.setCrbaBillAcNo(crbaCustRiskAuxDMO.getCrbaBillAcNo() );
//
//
//					//
//					// Modify the crbaCustRiskAuxDMO
//					//
//					crbaCustRiskAuxDAC.modify( updateCrbaCustRiskAuxDMO );
//
//					// Create a new CrbaCustRiskAuxDMO, set keys, and fetch from the database...
//					CrbaCustRiskAuxDMO returnCrbaCustRiskAuxDMO = new CrbaCustRiskAuxDMO(  );
//
//					returnCrbaCustRiskAuxDMO.setCrbaBillAcNo(updateCrbaCustRiskAuxDMO.getCrbaBillAcNo() );
//
//					returnCrbaCustRiskAuxDMO = get( returnCrbaCustRiskAuxDMO );
//
//					return returnCrbaCustRiskAuxDMO;
//				}
				//==================================================================================================


				public void modify( QueryFilter filter )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "modify( filter )" );

					//
					// Modify the crbaCustRiskAuxDMO
					//
					crbaCustRiskAuxDAC.modify( filter );
				}
			//==================================================================================================

//				public void delete( CrbaCustRiskAuxDMO crbaCustRiskAuxDMO )
//					throws EPPIXBusinessException, EPPIXUnexpectedException,
//						EPPIXFatalException {
//					logger.debug( "delete( crbaCustRiskAuxDMO )" );
//
//					thrower.ifParameterMissing( "crbaCustRiskAuxDMO", crbaCustRiskAuxDMO );
//
//					CrbaCustRiskAuxDMO updateCrbaCustRiskAuxDMO = null;
//					
//					QueryFilter filter = new QueryFilter();
//					filter.add(FilterOp.EQUAL, CrbaCustRiskAuxDMO.crbaBillAcNoFilter, crbaCustRiskAuxDMO.getCrbaBillAcNo());
//
//					updateCrbaCustRiskAuxDMO = get( filter );
//
//					// delete self...
//					crbaCustRiskAuxDAC.delete( updateCrbaCustRiskAuxDMO );
//				}
			//==================================================================================================

				public void delete( QueryFilter filter )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "delete( filter )" );

					thrower.ifParameterMissing( "filter", filter );

					// delete...
					crbaCustRiskAuxDAC.delete( filter );
				}
				//==================================================================================================

				public boolean exists( CrbaCustRiskAuxDMO crbaCustRiskAuxDMO )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "exists(crbaCustRiskAuxDMO)" );

					thrower.ifParameterMissing( "crbaCustRiskAuxDMO", crbaCustRiskAuxDMO );

					thrower.ifParameterMissing( "crbaCustRiskAuxDMO.crbaBillAcNo",
						crbaCustRiskAuxDMO.getCrbaBillAcNo() );

					return crbaCustRiskAuxDAC.exists( crbaCustRiskAuxDMO );
				}
				//==================================================================================================


				public boolean exists( QueryFilter filter )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "exists(filter)" );

					return crbaCustRiskAuxDAC.exists( filter );
				}
				//==================================================================================================


				public DTOList getList(
					DTOListState state,
					QueryFilter  filter )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "getList( state, filter )" );

					return crbaCustRiskAuxDAC.getList( state, filter );
				}

				//==================================================================================================


				public DAOIterator iterate( QueryFilter filter )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "iterateWithLock( filter )" );

					return crbaCustRiskAuxDAC.iterate( filter );
				}
				//==================================================================================================


				public DAOIterator iterateWithLock( QueryFilter filter )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "iterateWithLock( filter )" );

					return crbaCustRiskAuxDAC.iterateWithLock( filter );
				}
				//==================================================================================================


				public CrbaCustRiskAuxDMO get( QueryFilter filter )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "get( filter )" );

					//
					// Check mandatory parameters.
					//
					thrower.ifParameterMissing( "filter", filter );

					//
					// Attempt to get the CrbaCustRiskAuxDMO
					//
					CrbaCustRiskAuxDMO crbaCustRiskAuxDMO = crbaCustRiskAuxDAC.get( filter );

					return crbaCustRiskAuxDMO;
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

					return crbaCustRiskAuxDAC.max( filter );
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

					return crbaCustRiskAuxDAC.min( filter );
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

					return Integer.valueOf(crbaCustRiskAuxDAC.count( filter ));
				}
	  //==================================================================================================
}