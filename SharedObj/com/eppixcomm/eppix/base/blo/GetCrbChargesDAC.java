package com.eppixcomm.eppix.base.blo;

import com.eppixcomm.eppix.base.error.EPPIXSeriousException;
import com.eppixcomm.eppix.common.data.StringDMO;

public interface GetCrbChargesDAC {

	public StringDMO getVatPercentageByCode(String vatCode)
			throws EPPIXSeriousException;
}
