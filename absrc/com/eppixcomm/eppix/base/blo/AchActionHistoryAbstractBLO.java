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

public class AchActionHistoryAbstractBLO extends BaseBLO
implements DTOActionTypes, BaseMessages {


static Thrower thrower = Thrower.getThrower( AchActionHistoryAbstractBLO.class );


				protected static final String ENTITY_ID = "FS";

				/** Data Access Controller. */
				protected AchActionHistoryDAC achActionHistoryDAC;
				/** DOCUMENT ME! */
				protected Logger logger = thrower.getLogger(  );

				/** Invoked by the BLOBinder to provide this BLO with its DAC. */
				protected void setDAC( DAC dac ) {
					this.achActionHistoryDAC = (AchActionHistoryDAC) dac;
				}

				protected Class getDACClass() {
					return AchActionHistoryDAC.class;
				}

//				public AchActionHistoryDMO get( AchActionHistoryDMO achActionHistoryDMO )
//					throws EPPIXBusinessException, EPPIXUnexpectedException,
//						EPPIXFatalException {
//					logger.debug( "get(achActionHistoryDMO)" );
//
//					//
//					// Check mandatory parameters.
//					//
//					thrower.ifParameterMissing( "achActionHistoryDMO", achActionHistoryDMO );
//
//					//
//					// Each attribute that is part of the primary key is mandatory
//					//
////					thrower.ifParameterMissing( "achActionHistoryDMO.actAccId",
////						achActionHistoryDMO.getDpfFolderId() );
//
//					//
//					// Attempt to get the AchActionHistoryDMO
//					//
//					AchActionHistoryDMO returnAchActionHistoryDMO = achActionHistoryDAC.get( achActionHistoryDMO );
//
//					//
//					// Could not find the AchActionHistoryDMO
//					//
//					if ( returnAchActionHistoryDMO == null ) {
//						thrower.business( Base_ACTACCTYPES_000,
//							new Object[] { achActionHistoryDMO.getDpfFolderId() } );
//					}
//
//					//
//					// Now, based on the values of the flags on this method signature, which in turn,
//					// are based on this objects associations, get all associated, embedded objects
//					//
//					return returnAchActionHistoryDMO;
//				}
				//==================================================================================================


//				public DTOList getList(
//					DTOListState   state,
//					AchActionHistoryDMO achActionHistoryDMO )
//					throws EPPIXBusinessException, EPPIXUnexpectedException,
//						EPPIXFatalException {
//					logger.debug( "getList( state, achActionHistoryDMO )" );
//
//					return achActionHistoryDAC.getList( state, achActionHistoryDMO );
//				}

				//==================================================================================================
				public AchActionHistoryDMO create( AchActionHistoryDMO achActionHistoryDMO )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "create( achActionHistoryDMO )" );

					thrower.ifParameterMissing( "achActionHistoryDMO", achActionHistoryDMO );

					//
					// Check that this object does not already exist
					//
//					if ( exists( achActionHistoryDMO ) ) {
//						thrower.business( Base_ACTACCTYPES_001,
//							new Object[] { achActionHistoryDMO.getDpfFolderId() } );
//					}

					//
					// Now create the record
					//
					achActionHistoryDAC.create( achActionHistoryDMO );

					return achActionHistoryDMO;
				}

				//==================================================================================================
//				public AchActionHistoryDMO modify( AchActionHistoryDMO achActionHistoryDMO )
//					throws EPPIXBusinessException, EPPIXUnexpectedException,
//						EPPIXFatalException {
//					logger.debug( "modify( aachActionHistoryDMO )" );
//
//					//
//					// Check mandatory parameters (
//					//
//					// Note: attributes stereotyped <NotModifiable> are ignored
//					//
//					thrower.ifParameterMissing( "achActionHistoryDMO", achActionHistoryDMO );
//					thrower.ifParameterMissing( "achActionHistoryDMO.dpfFolderId",
//								achActionHistoryDMO.getDpfFolderId() );
//
//
//
//					AchActionHistoryDMO updateAchActionHistoryDMO = new AchActionHistoryDMO(  );
//
//					updateAchActionHistoryDMO.setDpfFolderId(achActionHistoryDMO.getDpfFolderId() );
//
//					updateAchActionHistoryDMO = get( updateAchActionHistoryDMO );
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
//					updateAchActionHistoryDMO.setDpfFolderId(achActionHistoryDMO.getDpfFolderId() );
//
//
//					//
//					// Modify the achActionHistoryDMO
//					//
//					achActionHistoryDAC.modify( updateAchActionHistoryDMO );
//
//					// Create a new AchActionHistoryDMO, set keys, and fetch from the database...
//					AchActionHistoryDMO returnAchActionHistoryDMO = new AchActionHistoryDMO(  );
//
//					returnAchActionHistoryDMO.setDpfFolderId(updateAchActionHistoryDMO.getDpfFolderId() );
//
//					returnAchActionHistoryDMO = get( returnAchActionHistoryDMO );
//
//					return returnAchActionHistoryDMO;
//				}
//==================================================================================================


				public void modify( QueryFilter filter )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "modify( filter )" );

					//
					// Modify the achActionHistoryDMO
					//
					achActionHistoryDAC.modify( filter );
				}
//==================================================================================================


				public void modify( QueryFilter filter, boolean isMultiple )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "modify( filter )" );

					//
					// Modify the achActionHistoryDMO
					//
					achActionHistoryDAC.modify( filter, isMultiple );
				}
				
//==================================================================================================

//				public void delete( AchActionHistoryDMO achActionHistoryDMO )
//					throws EPPIXBusinessException, EPPIXUnexpectedException,
//						EPPIXFatalException {
//					logger.debug( "delete( achActionHistoryDMO )" );
//
//					thrower.ifParameterMissing( "achActionHistoryDMO", achActionHistoryDMO );
//
//					// delete self...
//					achActionHistoryDAC.delete( achActionHistoryDMO );
//				}
			//==================================================================================================

				public void delete( QueryFilter filter )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "delete( filter )" );

					thrower.ifParameterMissing( "filter", filter );

					// delete...
					achActionHistoryDAC.delete( filter );
				}
				//==================================================================================================

//				public boolean exists( AchActionHistoryDMO achActionHistoryDMO )
//					throws EPPIXBusinessException, EPPIXUnexpectedException,
//						EPPIXFatalException {
//					logger.debug( "exists(achActionHistoryDMO)" );
//
//					thrower.ifParameterMissing( "achActionHistoryDMO", achActionHistoryDMO );
//
//					thrower.ifParameterMissing( "achActionHistoryDMO.actAccId",
//						achActionHistoryDMO.getDpfFolderId() );
//
//					return achActionHistoryDAC.exists( achActionHistoryDMO );
//				}
				//==================================================================================================


				public boolean exists( QueryFilter filter )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "exists(filter)" );

					return achActionHistoryDAC.exists( filter );
				}
				//==================================================================================================


//				public DTOList getList(
//					DTOListState state,
//					QueryFilter  filter )
//					throws EPPIXBusinessException, EPPIXUnexpectedException,
//						EPPIXFatalException {
//					logger.debug( "getList( state, filter )" );
//
//					return achActionHistoryDAC.getList( state, filter );
//				}

				//==================================================================================================


				public DAOIterator iterate( QueryFilter filter )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "iterateWithLock( filter )" );

					return achActionHistoryDAC.iterate( filter );
				}
				//==================================================================================================


//				public DAOIterator iterateWithLock( QueryFilter filter )
//					throws EPPIXBusinessException, EPPIXUnexpectedException,
//						EPPIXFatalException {
//					logger.debug( "iterateWithLock( filter )" );
//
//					return achActionHistoryDAC.iterateWithLock( filter );
//				}
				//==================================================================================================


				public AchActionHistoryDMO get( QueryFilter filter )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "get( filter )" );

					//
					// Check mandatory parameters.
					//
					thrower.ifParameterMissing( "filter", filter );

					//
					// Attempt to get the AchActionHistoryDMO
					//
					AchActionHistoryDMO achActionHistoryDMO = achActionHistoryDAC.get( filter );

					return achActionHistoryDMO;
				}
				//==================================================================================================


//				public Object max( QueryFilter filter )
//					throws EPPIXBusinessException, EPPIXUnexpectedException,
//						EPPIXFatalException {
//					logger.debug( "max( filter )" );
//
//					//
//					// Check mandatory parameters.
//					//
//					thrower.ifParameterMissing( "filter", filter );
//
//					return achActionHistoryDAC.max( filter );
//				}
				//==================================================================================================


//				public Object min( QueryFilter filter )
//					throws EPPIXBusinessException, EPPIXUnexpectedException,
//						EPPIXFatalException {
//					logger.debug( "min( filter )" );
//
//					//
//					// Check mandatory parameters.
//					//
//					thrower.ifParameterMissing( "filter", filter );
//
//					return achActionHistoryDAC.min( filter );
//				}
				//==================================================================================================


				public Integer count( QueryFilter filter )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "count( filter )" );

					//
					// Check mandatory parameters.
					//
					thrower.ifParameterMissing( "filter", filter );

					return Integer.valueOf(achActionHistoryDAC.count( filter ));
				}
	  //==================================================================================================


}