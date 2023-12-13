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

public class FdFieldDefAbstractBLO extends BaseBLO
implements DTOActionTypes, BaseMessages {


static Thrower thrower = Thrower.getThrower( FdFieldDefAbstractBLO.class );


				protected static final String ENTITY_ID = "FS";

				/** Data Access Controller. */
				protected FdFieldDefDAC fdFieldDefDAC;
				/** DOCUMENT ME! */
				protected Logger logger = thrower.getLogger(  );

				/** Invoked by the BLOBinder to provide this BLO with its DAC. */
				protected void setDAC( DAC dac ) {
					this.fdFieldDefDAC = (FdFieldDefDAC) dac;
				}

				protected Class getDACClass() {
					return FdFieldDefDAC.class;
				}

				public FdFieldDefDMO get( FdFieldDefDMO fdFieldDefDMO )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "get(fdFieldDefDMO)" );

					//
					// Check mandatory parameters.
					//
					thrower.ifParameterMissing( "fdFieldDefDMO", fdFieldDefDMO );

					//
					// Each attribute that is part of the primary key is mandatory
					//
					thrower.ifParameterMissing( "fdFieldDefDMO.fdFieldId",
						fdFieldDefDMO.getFdFieldId());
					
					thrower.ifParameterMissing( "fdFieldDefDMO.fdFieldName",
							fdFieldDefDMO.getFdFieldName());

					//
					// Attempt to get the FdFieldDefDMO
					//
					FdFieldDefDMO returnFdFieldDefDMO = fdFieldDefDAC.get( fdFieldDefDMO );

					//
					// Could not find the FdFieldDefDMO
					//
					if ( returnFdFieldDefDMO == null ) {
						thrower.business( Base_FDFIELDDEFlOOKUP_000,
							new Object[] { fdFieldDefDMO.getFdFieldName() } );
					}

					//
					// Now, based on the values of the flags on this method signature, which in turn,
					// are based on this objects associations, get all associated, embedded objects
					//
					return returnFdFieldDefDMO;
				}
				//==================================================================================================


				public DTOList getList(
					DTOListState   state,
					FdFieldDefDMO fdFieldDefDMO )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "getList( state, fdFieldDefDMO )" );

					return fdFieldDefDAC.getList( state, fdFieldDefDMO );
				}


				public FdFieldDefDMO create( FdFieldDefDMO fdFieldDefDMO )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "create( fdFieldDefDMO )" );

					thrower.ifParameterMissing( "fdFieldDefDMO", fdFieldDefDMO );
//					thrower.ifParameterMissing( "fdFieldDefDMO.dpfFolderId",
//						fdFieldDefDMO.get );


					//
					// Check that this object does not already exist
					//
					if ( exists( fdFieldDefDMO ) ) {
						thrower.business( Base_FDFIELDDEFlOOKUP_001,
							new Object[] { fdFieldDefDMO.getFdFieldName() } );
					}

					//
					// Now create the record
					//
					fdFieldDefDAC.create( fdFieldDefDMO );

					return fdFieldDefDMO;
				}

				public FdFieldDefDMO modify( FdFieldDefDMO fdFieldDefDMO )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "modify( afdFieldDefDMO )" );

					//
					// Check mandatory parameters (
					//
					// Note: attributes stereotyped <NotModifiable> are ignored
					//
					thrower.ifParameterMissing( "fdFieldDefDMO", fdFieldDefDMO );
					thrower.ifParameterMissing( "fdFieldDefDMO.dpfFolderId",
								fdFieldDefDMO.getFdFieldName() );



					QueryFilter filter = new QueryFilter();
					filter.add(FilterOp.SET, FdFieldDefDMO.fdFieldNameFilter, fdFieldDefDMO.getFdFieldName());
					filter.add(FilterOp.SET, FdFieldDefDMO.fdAuditReqdFilter, fdFieldDefDMO.getFdAuditReqd());
					filter.add(FilterOp.SET, FdFieldDefDMO.fdFieldLockedFilter, fdFieldDefDMO.getFdFieldLocked());
					filter.add(FilterOp.SET, FdFieldDefDMO.fdHistDescFilter, fdFieldDefDMO.getFdHistDesc());
					filter.add(FilterOp.EQUAL, FdFieldDefDMO.fdFieldIdFilter, fdFieldDefDMO.getFdFieldName());
					filter.add(FilterOp.EQUAL, FdFieldDefDMO.fdFieldNameFilter, fdFieldDefDMO.getFdFieldName());

					//
					// Modify the fdFieldDefDMO
					//
					fdFieldDefDAC.modify( filter );

					// Create a new FdFieldDefDMO, set keys, and fetch from the database...
					FdFieldDefDMO returnFdFieldDefDMO = new FdFieldDefDMO(  );

					returnFdFieldDefDMO.setFdFieldId(fdFieldDefDMO.getFdFieldId() );

					returnFdFieldDefDMO = get( returnFdFieldDefDMO );

					return returnFdFieldDefDMO;
				}
				//==================================================================================================


				public void modify( QueryFilter filter )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "modify( filter )" );

					//
					// Modify the fdFieldDefDMO
					//
					fdFieldDefDAC.modify( filter );
				}
			//==================================================================================================

				public void delete( FdFieldDefDMO fdFieldDefDMO )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "delete( fdFieldDefDMO )" );

					thrower.ifParameterMissing( "fdFieldDefDMO", fdFieldDefDMO );

					FdFieldDefDMO updateFdFieldDefDMO = null;

					updateFdFieldDefDMO = get( fdFieldDefDMO );

					// delete self...
					fdFieldDefDAC.delete( fdFieldDefDMO );
				}
			//==================================================================================================

				public void delete( QueryFilter filter )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "delete( filter )" );

					thrower.ifParameterMissing( "filter", filter );

					// delete...
					fdFieldDefDAC.delete( filter );
				}
				//==================================================================================================

				public boolean exists( FdFieldDefDMO fdFieldDefDMO )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "exists(fdFieldDefDMO)" );

					thrower.ifParameterMissing( "fdFieldDefDMO", fdFieldDefDMO );

					thrower.ifParameterMissing( "fdFieldDefDMO.actAccId",
						fdFieldDefDMO.getFdFieldName() );

					return fdFieldDefDAC.exists( fdFieldDefDMO );
				}
				//==================================================================================================


				public boolean exists( QueryFilter filter )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "exists(filter)" );

					return fdFieldDefDAC.exists( filter );
				}
				//==================================================================================================


				public DTOList getList(
					DTOListState state,
					QueryFilter  filter )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "getList( state, filter )" );

					return fdFieldDefDAC.getList( state, filter );
				}

				//==================================================================================================


				public DAOIterator iterate( QueryFilter filter )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "iterateWithLock( filter )" );

					return fdFieldDefDAC.iterate( filter );
				}
				//==================================================================================================


				public DAOIterator iterateWithLock( QueryFilter filter )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "iterateWithLock( filter )" );

					return fdFieldDefDAC.iterateWithLock( filter );
				}
				//==================================================================================================


				public FdFieldDefDMO get( QueryFilter filter )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "get( filter )" );

					//
					// Check mandatory parameters.
					//
					thrower.ifParameterMissing( "filter", filter );

					//
					// Attempt to get the FdFieldDefDMO
					//
					FdFieldDefDMO fdFieldDefDMO = fdFieldDefDAC.get( filter );

					return fdFieldDefDMO;
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

					return fdFieldDefDAC.max( filter );
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

					return fdFieldDefDAC.min( filter );
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

					return Integer.valueOf(fdFieldDefDAC.count( filter ));
				}
	  //==================================================================================================

}
