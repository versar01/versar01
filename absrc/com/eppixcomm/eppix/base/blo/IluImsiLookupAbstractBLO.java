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

public class IluImsiLookupAbstractBLO extends BaseBLO
implements DTOActionTypes, BaseMessages {


static Thrower thrower = Thrower.getThrower( IluImsiLookupAbstractBLO.class );


				protected static final String ENTITY_ID = "ILU";

				/** Data Access Controller. */
				protected IluImsiLookupDAC iluImsiLookupDAC;
				/** DOCUMENT ME! */
				protected Logger logger = thrower.getLogger(  );

				/** Invoked by the BLOBinder to provide this BLO with its DAC. */
				protected void setDAC( DAC dac ) {
					this.iluImsiLookupDAC = (IluImsiLookupDAC) dac;
				}

				protected Class getDACClass() {
					return IluImsiLookupDAC.class;
				}

				//==================================================================================================

				public DTOList getList(
					DTOListState   state,
					IluImsiLookupDMO iluImsiLookupDMO )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "getList( state, iluImsiLookupDMO )" );

					return iluImsiLookupDAC.getList( state, iluImsiLookupDMO );
				}


				public IluImsiLookupDMO create( IluImsiLookupDMO iluImsiLookupDMO )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "create( iluImsiLookupDMO )" );

					thrower.ifParameterMissing( "iluImsiLookupDMO", iluImsiLookupDMO );
//					thrower.ifParameterMissing( "iluImsiLookupDMO.dpfFolderId",
//						iluImsiLookupDMO.getDpfFolderId() );


					//
					// Check that this object does not already exist
					//
					if ( exists( iluImsiLookupDMO ) ) {
						thrower.business( Base_ILUIMSIlOOKUP_001,
							new Object[] { iluImsiLookupDMO.getIluSimNo()} );
					}

					//
					// Now create the record
					//
					iluImsiLookupDAC.create( iluImsiLookupDMO );

					return iluImsiLookupDMO;
				}

//				public IluImsiLookupDMO modify( IluImsiLookupDMO iluImsiLookupDMO )
//					throws EPPIXBusinessException, EPPIXUnexpectedException,
//						EPPIXFatalException {
//					logger.debug( "modify( ailuImsiLookupDMO )" );
//
//					//
//					// Check mandatory parameters (
//					//
//					// Note: attributes stereotyped <NotModifiable> are ignored
//					//
//					thrower.ifParameterMissing( "iluImsiLookupDMO", iluImsiLookupDMO );
////					thrower.ifParameterMissing( "iluImsiLookupDMO.dpfFolderId",
////								iluImsiLookupDMO.getDpfFolderId() );
//
//
//
//					IluImsiLookupDMO updateIluImsiLookupDMO = new IluImsiLookupDMO(  );
//
//					updateIluImsiLookupDMO.setIluSimNo(iluImsiLookupDMO.getIluSimNo() );
//
////					updateIluImsiLookupDMO = get( updateIluImsiLookupDMO );
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
//					updateIluImsiLookupDMO.setIluSimNo(iluImsiLookupDMO.getIluImsiNo() );
//
//
//					//
//					// Modify the iluImsiLookupDMO
//					//
//					iluImsiLookupDAC.modify( updateIluImsiLookupDMO );
//
//					// Create a new IluImsiLookupDMO, set keys, and fetch from the database...
//					IluImsiLookupDMO returnIluImsiLookupDMO = new IluImsiLookupDMO(  );
//
//					returnIluImsiLookupDMO.setIluSimNo(updateIluImsiLookupDMO.getIluSimNo() );
//
//					returnIluImsiLookupDMO = get( returnIluImsiLookupDMO );
//
//					return returnIluImsiLookupDMO;
//				}
				//==================================================================================================


				public void modify( QueryFilter filter )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "modify( filter )" );

					//
					// Modify the iluImsiLookupDMO
					//
					iluImsiLookupDAC.modify( filter );
				}
			//==================================================================================================

				public void delete( IluImsiLookupDMO iluImsiLookupDMO )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "delete( iluImsiLookupDMO )" );

					thrower.ifParameterMissing( "iluImsiLookupDMO", iluImsiLookupDMO );

					IluImsiLookupDMO updateIluImsiLookupDMO = null;

//					updateIluImsiLookupDMO = get( iluImsiLookupDMO );

					// delete self...
					iluImsiLookupDAC.delete( iluImsiLookupDMO );
				}
			//==================================================================================================

				public void delete( QueryFilter filter )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "delete( filter )" );

					thrower.ifParameterMissing( "filter", filter );

					// delete...
					iluImsiLookupDAC.delete( filter );
				}
				//==================================================================================================

				public boolean exists( IluImsiLookupDMO iluImsiLookupDMO )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "exists(iluImsiLookupDMO)" );

					thrower.ifParameterMissing( "iluImsiLookupDMO", iluImsiLookupDMO );

//					thrower.ifParameterMissing( "iluImsiLookupDMO.actAccId",
//						iluImsiLookupDMO.getDpfFolderId() );

					return iluImsiLookupDAC.exists( iluImsiLookupDMO );
				}
				//==================================================================================================


				public boolean exists( QueryFilter filter )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "exists(filter)" );

					return iluImsiLookupDAC.exists( filter );
				}
				//==================================================================================================


				public DTOList getList(
					DTOListState state,
					QueryFilter  filter )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "getList( state, filter )" );

					return iluImsiLookupDAC.getList( state, filter );
				}

				//==================================================================================================


				public DAOIterator iterate( QueryFilter filter )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "iterateWithLock( filter )" );

					return iluImsiLookupDAC.iterate( filter );
				}
				//==================================================================================================


				public DAOIterator iterateWithLock( QueryFilter filter )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "iterateWithLock( filter )" );

					return iluImsiLookupDAC.iterateWithLock( filter );
				}
				//==================================================================================================


				public IluImsiLookupDMO get( QueryFilter filter )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "get( filter )" );

					//
					// Check mandatory parameters.
					//
					thrower.ifParameterMissing( "filter", filter );

					//
					// Attempt to get the IluImsiLookupDMO
					//
					IluImsiLookupDMO iluImsiLookupDMO = iluImsiLookupDAC.get( filter );

					return iluImsiLookupDMO;
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

					return iluImsiLookupDAC.max( filter );
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

					return iluImsiLookupDAC.min( filter );
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

					return Integer.valueOf(iluImsiLookupDAC.count( filter ));
				}
	  //==================================================================================================
}