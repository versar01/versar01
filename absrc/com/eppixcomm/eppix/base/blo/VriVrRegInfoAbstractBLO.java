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

public class VriVrRegInfoAbstractBLO extends BaseBLO
implements DTOActionTypes, BaseMessages {


static Thrower thrower = Thrower.getThrower( VriVrRegInfoAbstractBLO.class );


				protected static final String ENTITY_ID = "VRI";

				/** Data Access Controller. */
				protected VriVrRegInfoDAC vriVrRegInfoDAC;
				/** DOCUMENT ME! */
				protected Logger logger = thrower.getLogger(  );

				/** Invoked by the BLOBinder to provide this BLO with its DAC. */
				protected void setDAC( DAC dac ) {
					this.vriVrRegInfoDAC = (VriVrRegInfoDAC) dac;
				}

				protected Class getDACClass() {
					return VriVrRegInfoDAC.class;
				}

				public VriVrRegInfoDMO get( VriVrRegInfoDMO vriVrRegInfoDMO )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "get(vriVrRegInfoDMO)" );

					//
					// Check mandatory parameters.
					//
					thrower.ifParameterMissing( "vriVrRegInfoDMO", vriVrRegInfoDMO );

					//
					// Each attribute that is part of the primary key is mandatory
					//
					thrower.ifParameterMissing( "vriVrRegInfoDMO.vriMsisdnNo",
						vriVrRegInfoDMO.getVriMsisdnNo() );
					
					QueryFilter filter = new QueryFilter();
					filter.add(FilterOp.EQUAL, VriVrRegInfoDMO.VriMsisdnNoFilter, vriVrRegInfoDMO.getVriMsisdnNo());
					

					//
					// Attempt to get the VriVrRegInfoDMO
					//
					VriVrRegInfoDMO returnVriVrRegInfoDMO = vriVrRegInfoDAC.get( filter );

					//
					// Could not find the VriVrRegInfoDMO
					//
					if ( returnVriVrRegInfoDMO == null ) {
						thrower.business( Base_ACTACCTYPES_000,
							new Object[] { vriVrRegInfoDMO.getVriMsisdnNo()} );
					}

					//
					// Now, based on the values of the flags on this method signature, which in turn,
					// are based on this objects associations, get all associated, embedded objects
					//
					return returnVriVrRegInfoDMO;
				}
				//==================================================================================================


				public DTOList getList(
					DTOListState   state,
					VriVrRegInfoDMO vriVrRegInfoDMO )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "getList( state, vriVrRegInfoDMO )" );

					return vriVrRegInfoDAC.getList( state, vriVrRegInfoDMO );
				}


				public VriVrRegInfoDMO create( VriVrRegInfoDMO vriVrRegInfoDMO )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "create( vriVrRegInfoDMO )" );

					thrower.ifParameterMissing( "vriVrRegInfoDMO", vriVrRegInfoDMO );
					thrower.ifParameterMissing( "vriVrRegInfoDMO.dpfFolderId",
						vriVrRegInfoDMO.getVriMsisdnNo() );


					//
					// Check that this object does not already exist
					//
					if ( exists( vriVrRegInfoDMO ) ) {
						thrower.business( Base_ACTACCTYPES_001,
							new Object[] { vriVrRegInfoDMO.getVriMsisdnNo() } );
					}

					//
					// Now create the record
					//
					vriVrRegInfoDAC.create( vriVrRegInfoDMO );

					return vriVrRegInfoDMO;
				}

				public VriVrRegInfoDMO modify( VriVrRegInfoDMO vriVrRegInfoDMO )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "modify( avriVrRegInfoDMO )" );

					//
					// Check mandatory parameters (
					//
					// Note: attributes stereotyped <NotModifiable> are ignored
					//
					thrower.ifParameterMissing( "vriVrRegInfoDMO", vriVrRegInfoDMO );
					
					thrower.ifParameterMissing( "vriVrRegInfoDMO.vriId",
								vriVrRegInfoDMO.getVriId() );


					QueryFilter filter = new QueryFilter();
//					filter.add(FilterOp.SET, VriVrRegInfoDMO.VriIdFilter, vriVrRegInfoDMO.getVriId());
					filter.add(FilterOp.SET, VriVrRegInfoDMO.VriVraIdFilter, vriVrRegInfoDMO.getVriVraId());
					filter.add(FilterOp.SET, VriVrRegInfoDMO.VriMsisdnNoFilter, vriVrRegInfoDMO.getVriMsisdnNo());
					filter.add(FilterOp.SET, VriVrRegInfoDMO.VriLevelFilter, vriVrRegInfoDMO.getVriLevel());
					filter.add(FilterOp.SET, VriVrRegInfoDMO.VriProviderFilter, vriVrRegInfoDMO.getVriProvider());
					filter.add(FilterOp.SET, VriVrRegInfoDMO.VriOnceOffLimitFilter, vriVrRegInfoDMO.getVriOnceOffLimit());
					filter.add(FilterOp.SET, VriVrRegInfoDMO.VriRecurLimitFilter, vriVrRegInfoDMO.getVriRecurLimit());
					filter.add(FilterOp.SET, VriVrRegInfoDMO.VriLimitTypeFilter, vriVrRegInfoDMO.getVriLimitType());
					
					
					filter.add(FilterOp.EQUAL, VriVrRegInfoDMO.VriIdFilter, vriVrRegInfoDMO.getVriId());


					//
					// Modify the vriVrRegInfoDMO
					//
					vriVrRegInfoDAC.modify( filter );
					
					filter = new QueryFilter();
					filter.add(FilterOp.EQUAL, VriVrRegInfoDMO.VriMsisdnNoFilter, vriVrRegInfoDMO.getVriMsisdnNo());
					

					// Create a new VriVrRegInfoDMO, set keys, and fetch from the database...
					VriVrRegInfoDMO returnVriVrRegInfoDMO = get( filter );

					return returnVriVrRegInfoDMO;
				}
				//==================================================================================================


				public void modify( QueryFilter filter )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "modify( filter )" );

					//
					// Modify the vriVrRegInfoDMO
					//
					vriVrRegInfoDAC.modify( filter );
				}
			//==================================================================================================

				public void delete( VriVrRegInfoDMO vriVrRegInfoDMO )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "delete( vriVrRegInfoDMO )" );

					thrower.ifParameterMissing( "vriVrRegInfoDMO", vriVrRegInfoDMO );

					VriVrRegInfoDMO updateVriVrRegInfoDMO = null;

					updateVriVrRegInfoDMO = get( vriVrRegInfoDMO );

					// delete self...
					vriVrRegInfoDAC.delete( vriVrRegInfoDMO );
				}
			//==================================================================================================

				public void delete( QueryFilter filter )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "delete( filter )" );

					thrower.ifParameterMissing( "filter", filter );

					// delete...
					vriVrRegInfoDAC.delete( filter );
				}
				//==================================================================================================

				public boolean exists( VriVrRegInfoDMO vriVrRegInfoDMO )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "exists(vriVrRegInfoDMO)" );

					thrower.ifParameterMissing( "vriVrRegInfoDMO", vriVrRegInfoDMO );

					thrower.ifParameterMissing( "vriVrRegInfoDMO.actAccId",
						vriVrRegInfoDMO.getVriMsisdnNo());

					return vriVrRegInfoDAC.exists( vriVrRegInfoDMO );
				}
				//==================================================================================================


				public boolean exists( QueryFilter filter )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "exists(filter)" );

					return vriVrRegInfoDAC.exists( filter );
				}
				//==================================================================================================


				public DTOList getList(
					DTOListState state,
					QueryFilter  filter )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "getList( state, filter )" );

					return vriVrRegInfoDAC.getList( state, filter );
				}

				//==================================================================================================


				public DAOIterator iterate( QueryFilter filter )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "iterateWithLock( filter )" );

					return vriVrRegInfoDAC.iterate( filter );
				}
				//==================================================================================================


				public DAOIterator iterateWithLock( QueryFilter filter )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "iterateWithLock( filter )" );

					return vriVrRegInfoDAC.iterateWithLock( filter );
				}
				//==================================================================================================


				public VriVrRegInfoDMO get( QueryFilter filter )
					throws EPPIXBusinessException, EPPIXUnexpectedException,
						EPPIXFatalException {
					logger.debug( "get( filter )" );

					//
					// Check mandatory parameters.
					//
					thrower.ifParameterMissing( "filter", filter );

					//
					// Attempt to get the VriVrRegInfoDMO
					//
					VriVrRegInfoDMO vriVrRegInfoDMO = vriVrRegInfoDAC.get( filter );

					return vriVrRegInfoDMO;
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

					return vriVrRegInfoDAC.max( filter );
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

					return vriVrRegInfoDAC.min( filter );
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

					return Integer.valueOf(vriVrRegInfoDAC.count( filter ));
				}
	  //==================================================================================================



}