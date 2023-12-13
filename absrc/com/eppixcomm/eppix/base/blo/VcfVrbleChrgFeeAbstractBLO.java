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

public class VcfVrbleChrgFeeAbstractBLO extends BaseBLO implements
		DTOActionTypes, BaseMessages {

	static Thrower thrower = Thrower
			.getThrower(VcfVrbleChrgFeeAbstractBLO.class);

	protected static final String ENTITY_ID = "FS";

	/** Data Access Controller. */
	protected VcfVrbleChrgFeeDAC vcfVrbleChrgFeeDAC;
	/** DOCUMENT ME! */
	protected Logger logger = thrower.getLogger();

	/** Invoked by the BLOBinder to provide this BLO with its DAC. */
	protected void setDAC(DAC dac) {
		this.vcfVrbleChrgFeeDAC = (VcfVrbleChrgFeeDAC) dac;
	}

	protected Class getDACClass() {
		return VcfVrbleChrgFeeDAC.class;
	}

	public VcfVrbleChrgFeeDMO get(VcfVrbleChrgFeeDMO vcfVrbleChrgFeeDMO)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("get(vcfVrbleChrgFeeDMO)");

		//
		// Check mandatory parameters.
		//
		thrower.ifParameterMissing("vcfVrbleChrgFeeDMO", vcfVrbleChrgFeeDMO);

		//
		// Each attribute that is part of the primary key is mandatory
		//
		thrower.ifParameterMissing("vcfVrbleChrgFeeDMO.vcfEquipId",
				vcfVrbleChrgFeeDMO.getVcfEquipId());

		//
		// Attempt to get the VcfVrbleChrgFeeDMO
		//
		VcfVrbleChrgFeeDMO returnVcfVrbleChrgFeeDMO = vcfVrbleChrgFeeDAC
				.get(vcfVrbleChrgFeeDMO);

		//
		// Could not find the VcfVrbleChrgFeeDMO
		//
		if (returnVcfVrbleChrgFeeDMO == null) {
			thrower.business(Base_VCFVRBLECHRGFEElOOKUP_000,
					new Object[] { vcfVrbleChrgFeeDMO.getVcfEquipId() });
		}

		//
		// Now, based on the values of the flags on this method signature, which
		// in turn,
		// are based on this objects associations, get all associated, embedded
		// objects
		//
		return returnVcfVrbleChrgFeeDMO;
	}

	// ==================================================================================================

	public DTOList getList(DTOListState state,
			VcfVrbleChrgFeeDMO vcfVrbleChrgFeeDMO)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("getList( state, vcfVrbleChrgFeeDMO )");

		return vcfVrbleChrgFeeDAC.getList(state, vcfVrbleChrgFeeDMO);
	}

	public VcfVrbleChrgFeeDMO create(VcfVrbleChrgFeeDMO vcfVrbleChrgFeeDMO)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("create( vcfVrbleChrgFeeDMO )");

		thrower.ifParameterMissing("vcfVrbleChrgFeeDMO", vcfVrbleChrgFeeDMO);
		thrower.ifParameterMissing("vcfVrbleChrgFeeDMO.getVcfEquipId",
				vcfVrbleChrgFeeDMO.getVcfEquipId());

		//
		// Check that this object does not already exist
		//
		if (exists(vcfVrbleChrgFeeDMO)) {
			thrower.business(Base_ACTACCTYPES_001,
					new Object[] { vcfVrbleChrgFeeDMO.getVcfEquipId() });
		}

		//
		// Now create the record
		//
		vcfVrbleChrgFeeDAC.create(vcfVrbleChrgFeeDMO);

		return vcfVrbleChrgFeeDMO;
	}

//	public VcfVrbleChrgFeeDMO modify(VcfVrbleChrgFeeDMO vcfVrbleChrgFeeDMO)
//			throws EPPIXBusinessException, EPPIXUnexpectedException,
//			EPPIXFatalException {
//		logger.debug("modify( avcfVrbleChrgFeeDMO )");
//
//		//
//		// Check mandatory parameters (
//		//
//		// Note: attributes stereotyped <NotModifiable> are ignored
//		//
//		thrower.ifParameterMissing("vcfVrbleChrgFeeDMO", vcfVrbleChrgFeeDMO);
//		thrower.ifParameterMissing("vcfVrbleChrgFeeDMO.dpfFolderId",
//				vcfVrbleChrgFeeDMO.getVcfEquipId());
//
//		VcfVrbleChrgFeeDMO updateVcfVrbleChrgFeeDMO = new VcfVrbleChrgFeeDMO();
//
//		updateVcfVrbleChrgFeeDMO.setVcfEquipId(vcfVrbleChrgFeeDMO
//				.getVcfEquipId());
//
//		updateVcfVrbleChrgFeeDMO = get(updateVcfVrbleChrgFeeDMO);
//
//		//
//		// For each relationship to single objects (does not matter if they are
//		// Embedded or Flattened)
//		// either associate to a pre-existing object, or create an object then
//		// associate to it
//		//
//
//		//
//		// Copy the fields to be updated. We do not want to overwrite primary
//		// keys etc.
//		// All attributes stereotyped as being <NotModifiable> are skipped
//		//
//		updateVcfVrbleChrgFeeDMO.setVcfEquipId(vcfVrbleChrgFeeDMO
//				.getVcfEquipId());
//
//		//
//		// Modify the vcfVrbleChrgFeeDMO
//		//
//		vcfVrbleChrgFeeDAC.modify(updateVcfVrbleChrgFeeDMO);
//
//		// Create a new VcfVrbleChrgFeeDMO, set keys, and fetch from the
//		// database...
//		VcfVrbleChrgFeeDMO returnVcfVrbleChrgFeeDMO = new VcfVrbleChrgFeeDMO();
//
//		returnVcfVrbleChrgFeeDMO.setVcfEquipId(updateVcfVrbleChrgFeeDMO
//				.getVcfEquipId());
//
//		returnVcfVrbleChrgFeeDMO = get(returnVcfVrbleChrgFeeDMO);
//
//		return returnVcfVrbleChrgFeeDMO;
//	}

	// ==================================================================================================

	public void modify(QueryFilter filter) throws EPPIXBusinessException,
			EPPIXUnexpectedException, EPPIXFatalException {
		logger.debug("modify( filter )");

		//
		// Modify the vcfVrbleChrgFeeDMO
		//
		vcfVrbleChrgFeeDAC.modify(filter);
	}

	// ==================================================================================================

	public void delete(VcfVrbleChrgFeeDMO vcfVrbleChrgFeeDMO)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("delete( vcfVrbleChrgFeeDMO )");

		thrower.ifParameterMissing("vcfVrbleChrgFeeDMO", vcfVrbleChrgFeeDMO);

		VcfVrbleChrgFeeDMO updateVcfVrbleChrgFeeDMO = null;

		updateVcfVrbleChrgFeeDMO = this.get(vcfVrbleChrgFeeDMO);

		// delete self...
		vcfVrbleChrgFeeDAC.delete(vcfVrbleChrgFeeDMO);
	}

	// ==================================================================================================

	public void delete(QueryFilter filter) throws EPPIXBusinessException,
			EPPIXUnexpectedException, EPPIXFatalException {
		logger.debug("delete( filter )");

		thrower.ifParameterMissing("filter", filter);

		// delete...
		vcfVrbleChrgFeeDAC.delete(filter);
	}

	// ==================================================================================================

	public boolean exists(VcfVrbleChrgFeeDMO vcfVrbleChrgFeeDMO)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("exists(vcfVrbleChrgFeeDMO)");

		thrower.ifParameterMissing("vcfVrbleChrgFeeDMO", vcfVrbleChrgFeeDMO);

		thrower.ifParameterMissing("vcfVrbleChrgFeeDMO.actAccId",
				vcfVrbleChrgFeeDMO.getVcfEquipId());

		return vcfVrbleChrgFeeDAC.exists(vcfVrbleChrgFeeDMO);
	}

	// ==================================================================================================

	public boolean exists(QueryFilter filter) throws EPPIXBusinessException,
			EPPIXUnexpectedException, EPPIXFatalException {
		logger.debug("exists(filter)");

		return vcfVrbleChrgFeeDAC.exists(filter);
	}

	// ==================================================================================================

	public DTOList getList(DTOListState state, QueryFilter filter)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("getList( state, filter )");

		return vcfVrbleChrgFeeDAC.getList(state, filter);
	}

	// ==================================================================================================

	public DAOIterator iterate(QueryFilter filter)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("iterateWithLock( filter )");

		return vcfVrbleChrgFeeDAC.iterate(filter);
	}

	// ==================================================================================================

	public DAOIterator iterateWithLock(QueryFilter filter)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("iterateWithLock( filter )");

		return vcfVrbleChrgFeeDAC.iterateWithLock(filter);
	}

	// ==================================================================================================

	public VcfVrbleChrgFeeDMO get(QueryFilter filter)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("get( filter )");

		//
		// Check mandatory parameters.
		//
		thrower.ifParameterMissing("filter", filter);

		//
		// Attempt to get the VcfVrbleChrgFeeDMO
		//
		VcfVrbleChrgFeeDMO vcfVrbleChrgFeeDMO = vcfVrbleChrgFeeDAC.get(filter);

		return vcfVrbleChrgFeeDMO;
	}

	// ==================================================================================================

	public Object max(QueryFilter filter) throws EPPIXBusinessException,
			EPPIXUnexpectedException, EPPIXFatalException {
		logger.debug("max( filter )");

		//
		// Check mandatory parameters.
		//
		thrower.ifParameterMissing("filter", filter);

		return vcfVrbleChrgFeeDAC.max(filter);
	}

	// ==================================================================================================

	public Object min(QueryFilter filter) throws EPPIXBusinessException,
			EPPIXUnexpectedException, EPPIXFatalException {
		logger.debug("min( filter )");

		//
		// Check mandatory parameters.
		//
		thrower.ifParameterMissing("filter", filter);

		return vcfVrbleChrgFeeDAC.min(filter);
	}

	// ==================================================================================================

	public Integer count(QueryFilter filter) throws EPPIXBusinessException,
			EPPIXUnexpectedException, EPPIXFatalException {
		logger.debug("count( filter )");

		//
		// Check mandatory parameters.
		//
		thrower.ifParameterMissing("filter", filter);

		return Integer.valueOf(vcfVrbleChrgFeeDAC.count(filter));
	}
	// ==================================================================================================

}