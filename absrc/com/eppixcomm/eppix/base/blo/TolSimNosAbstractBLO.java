package com.eppixcomm.eppix.base.blo;

import org.apache.log4j.Logger;

import com.eppixcomm.eppix.base.error.EPPIXBusinessException;
import com.eppixcomm.eppix.base.error.EPPIXFatalException;
import com.eppixcomm.eppix.base.error.EPPIXSeriousException;
import com.eppixcomm.eppix.base.error.EPPIXUnexpectedException;
import com.eppixcomm.eppix.base.error.Thrower;
import com.eppixcomm.eppix.common.data.DAC;
import com.eppixcomm.eppix.common.data.DAOIterator;
import com.eppixcomm.eppix.common.data.DTOActionTypes;
import com.eppixcomm.eppix.common.data.DTOList;
import com.eppixcomm.eppix.common.data.DTOListState;
import com.eppixcomm.eppix.common.util.QueryFilter;

public class TolSimNosAbstractBLO extends BaseBLO implements DTOActionTypes,
		BaseMessages {
	static Thrower thrower = Thrower.getThrower(TolSimNosAbstractBLO.class);
	public Logger logger = thrower.getLogger();

	/** Data Access Controller. */
	protected TolSimNosDAC tolSimNosDAC;

	/** Invoked by the BLOBinder to get the DAC class for this BLO. */
	protected Class getDACClass() {
		return TolSimNosDAC.class;
	}

	protected void setDAC(DAC dac) {
		this.tolSimNosDAC = (TolSimNosDAC) dac;

	}

	public TolSimNosDMO get(TolSimNosDMO tolSimNosDMO)
			throws EPPIXSeriousException {
		thrower.ifParameterMissing("tolSimNosDMO", tolSimNosDMO);
		TolSimNosDMO returnTolSimNosDMO = tolSimNosDAC.get(tolSimNosDMO);
		return returnTolSimNosDMO;
	}

	/*
	 * @param state previous state of the list
	 * 
	 * @param tolSimNosDMO TolSimNosDMO object
	 * 
	 * @return DTOList of TolSimNos objects
	 * 
	 * @throws EPPIXUnexpectedException
	 */
	public DTOList getList(DTOListState state, TolSimNosDMO tolSimNosDMO)
			throws EPPIXSeriousException {
		return tolSimNosDAC.getList(state, tolSimNosDMO);
	}

	public TolSimNosDMO create(TolSimNosDMO tolSimNosDMO)
			throws EPPIXUnexpectedException, EPPIXBusinessException {

		thrower.ifParameterMissing("TolSimNosDMO", tolSimNosDMO);
		if (exists(tolSimNosDMO)) {
			thrower.business(
					Base_TOLSIMNOS_001,
					new Object[] { tolSimNosDMO.getTolSimNo(),
							tolSimNosDMO.getTolNetworkId(),
							tolSimNosDMO.getTolImsiNo(),
							tolSimNosDMO.getTolKi(),
							tolSimNosDMO.getTolOnNetwork(),
							tolSimNosDMO.getTolHlr(),
							tolSimNosDMO.getTolPukNo(),
							tolSimNosDMO.getTolStatus(),
							tolSimNosDMO.getTolActiveDate(),
							tolSimNosDMO.getTolAvailDate(),
							tolSimNosDMO.getTolExpiryDate(),
							tolSimNosDMO.getTolWarehouse(),
							tolSimNosDMO.getTolProductCode(),
							tolSimNosDMO.getTolDealerId(),
							tolSimNosDMO.getTolTransportKey(),
							tolSimNosDMO.getTolPinNo(),
							tolSimNosDMO.getTolPukNo2(),
							tolSimNosDMO.getTolPinNo2(),
							tolSimNosDMO.getTolAnalysis1(),
							tolSimNosDMO.getTolAnalysis2(),
							tolSimNosDMO.getTolAnalysis3(),

					});
		}
		tolSimNosDAC.create(tolSimNosDMO);
		return tolSimNosDMO;
	}

	private boolean exists(TolSimNosDMO tolSimNosDMO)
			throws EPPIXSeriousException {
		thrower.ifParameterMissing("TolSimNosDMO", tolSimNosDMO);
		return tolSimNosDAC.exists(tolSimNosDMO);
	}

	/*
	 * @return true if the TsTariffService exists in the database
	 * 
	 * @throws EPPIXBusinessException
	 * 
	 * @throws EPPIXUnexpectedException
	 * 
	 * @throws EPPIXFatalException
	 */
	public boolean exists(QueryFilter filter) throws EPPIXUnexpectedException {

		return tolSimNosDAC.exists(filter);
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @param state
	 *            DOCUMENT ME!
	 * @param filter
	 *            DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 * 
	 * @throws EPPIXBusinessException
	 *             DOCUMENT ME!
	 * @throws EPPIXUnexpectedException
	 *             DOCUMENT ME!
	 * @throws EPPIXFatalException
	 *             DOCUMENT ME!
	 */
	public DTOList getList(DTOListState state, QueryFilter filter)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		return tolSimNosDAC.getList(state, filter);
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @param filter
	 *            DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 * 
	 * @throws EPPIXBusinessException
	 *             DOCUMENT ME!
	 * @throws EPPIXUnexpectedException
	 *             DOCUMENT ME!
	 * @throws EPPIXFatalException
	 *             DOCUMENT ME!
	 */
	public DAOIterator iterate(QueryFilter filter)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {

		return tolSimNosDAC.iterate(filter);
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @param filter
	 *            DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 * 
	 * @throws EPPIXBusinessException
	 *             DOCUMENT ME!
	 * @throws EPPIXUnexpectedException
	 *             DOCUMENT ME!
	 * @throws EPPIXFatalException
	 *             DOCUMENT ME!
	 */
	public DAOIterator iterateWithLock(QueryFilter filter)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {
		logger.debug("iterateWithLock( filter )");

		return tolSimNosDAC.iterateWithLock(filter);
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @param filter
	 *            DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 * 
	 * @throws EPPIXBusinessException
	 *             DOCUMENT ME!
	 * @throws EPPIXUnexpectedException
	 *             DOCUMENT ME!
	 * @throws EPPIXFatalException
	 *             DOCUMENT ME!
	 */
	public TolSimNosDMO get(QueryFilter filter) throws EPPIXBusinessException,
			EPPIXUnexpectedException, EPPIXFatalException {
		logger.debug("get( filter )");

		//
		// Check mandatory parameters.
		//
		thrower.ifParameterMissing("filter", filter);

		//
		// Attempt to get the TsTariffServiceDMO
		//
		TolSimNosDMO tolSimNosDMO = tolSimNosDAC.get(filter);

		return tolSimNosDMO;
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @param filter
	 *            DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 * 
	 * @throws EPPIXBusinessException
	 *             DOCUMENT ME!
	 * @throws EPPIXUnexpectedException
	 *             DOCUMENT ME!
	 * @throws EPPIXFatalException
	 *             DOCUMENT ME!
	 */
	public Object max(QueryFilter filter) throws EPPIXBusinessException,
			EPPIXUnexpectedException, EPPIXFatalException {
		logger.debug("max( filter )");

		//
		// Check mandatory parameters.
		//
		thrower.ifParameterMissing("filter", filter);

		return tolSimNosDAC.max(filter);
	}

	/**
	 * DOCUMENT ME!
	 * 
	 * @param filter
	 *            DOCUMENT ME!
	 * 
	 * @return DOCUMENT ME!
	 * 
	 * @throws EPPIXBusinessException
	 *             DOCUMENT ME!
	 * @throws EPPIXUnexpectedException
	 *             DOCUMENT ME!
	 * @throws EPPIXFatalException
	 *             DOCUMENT ME!
	 */
	public Object min(QueryFilter filter) throws EPPIXBusinessException,
			EPPIXUnexpectedException, EPPIXFatalException {
		logger.debug("min( filter )");

		//
		// Check mandatory parameters.
		//
		thrower.ifParameterMissing("filter", filter);

		return tolSimNosDAC.min(filter);
	}

	/**
	 * Counts the number of rows for the specified filter.
	 * 
	 * @param filter
	 *            the query filter
	 * @return the count of rows.
	 * 
	 * @throws EPPIXBusinessException
	 * @throws EPPIXUnexpectedException
	 * @throws EPPIXFatalException
	 */
	public Integer count(QueryFilter filter) throws EPPIXBusinessException,
			EPPIXUnexpectedException, EPPIXFatalException {
		logger.debug("count( filter )");

		//
		// Check mandatory parameters.
		//
		thrower.ifParameterMissing("filter", filter);

		return new Integer(tolSimNosDAC.count(filter));
	}

	public void modify(QueryFilter filter) throws EPPIXUnexpectedException {
		thrower.ifParameterMissing("filter", filter);
		tolSimNosDAC.modify(filter);
	}

	public TolSimNosDMO modify(TolSimNosDMO tolSimNosDMO)
			throws EPPIXBusinessException, EPPIXUnexpectedException,
			EPPIXFatalException {

		thrower.ifParameterMissing("tolSimNosDMO", tolSimNosDMO);

		TolSimNosDMO updateTolSimNosDMO = new TolSimNosDMO();
		updateTolSimNosDMO.setTolSimNo(tolSimNosDMO.getTolSimNo());
		updateTolSimNosDMO = get(updateTolSimNosDMO);

		updateTolSimNosDMO.setTolNetworkId(tolSimNosDMO.getTolNetworkId());
		updateTolSimNosDMO.setTolImsiNo(tolSimNosDMO.getTolImsiNo());
		updateTolSimNosDMO.setTolKi(tolSimNosDMO.getTolKi());
		updateTolSimNosDMO.setTolOnNetwork(tolSimNosDMO.getTolOnNetwork());
		updateTolSimNosDMO.setTolHlr(tolSimNosDMO.getTolHlr());
		updateTolSimNosDMO.setTolPukNo(tolSimNosDMO.getTolPukNo());
		updateTolSimNosDMO.setTolStatus(tolSimNosDMO.getTolStatus());
		updateTolSimNosDMO.setTolActiveDate(tolSimNosDMO.getTolActiveDate());
		updateTolSimNosDMO.setTolAvailDate(tolSimNosDMO.getTolAvailDate());
		updateTolSimNosDMO.setTolExpiryDate(tolSimNosDMO.getTolExpiryDate());
		updateTolSimNosDMO.setTolWarehouse(tolSimNosDMO.getTolWarehouse());
		updateTolSimNosDMO.setTolProductCode(tolSimNosDMO.getTolProductCode());
		updateTolSimNosDMO.setTolDealerId(tolSimNosDMO.getTolDealerId());
		updateTolSimNosDMO
				.setTolTransportKey(tolSimNosDMO.getTolTransportKey());
		updateTolSimNosDMO.setTolPinNo(tolSimNosDMO.getTolPinNo());
		updateTolSimNosDMO.setTolPukNo2(tolSimNosDMO.getTolPukNo2());
		updateTolSimNosDMO.setTolPinNo2(tolSimNosDMO.getTolPinNo2());
		updateTolSimNosDMO.setTolAnalysis1(tolSimNosDMO.getTolAnalysis1());
		updateTolSimNosDMO.setTolAnalysis2(tolSimNosDMO.getTolAnalysis2());
		updateTolSimNosDMO.setTolAnalysis3(tolSimNosDMO.getTolAnalysis3());

		tolSimNosDAC.modify(updateTolSimNosDMO);

		TolSimNosDMO returnTolSimNosDMO = new TolSimNosDMO();
		returnTolSimNosDMO = get(updateTolSimNosDMO);
		returnTolSimNosDMO.setTolSimNo(updateTolSimNosDMO.getTolSimNo());

		return returnTolSimNosDMO;

	}

	public void delete(QueryFilter filter) throws EPPIXBusinessException, EPPIXUnexpectedException,
	EPPIXFatalException {
		// TODO Auto-generated method stub
		logger.debug("delete( filter )");

		thrower.ifParameterMissing("filter", filter);

		// delete...
		tolSimNosDAC.delete(filter);

	}

	public void delete(TolSimNosDMO tolSimNosDMO) throws EPPIXBusinessException, EPPIXUnexpectedException,
	EPPIXFatalException {
		// TODO Auto-generated method stub

		thrower.ifParameterMissing("TolSimNosDMO", tolSimNosDMO);
		tolSimNosDAC.delete(tolSimNosDMO);

	}

}
