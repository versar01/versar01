package com.eppixcomm.eppix.common.blo;

import java.io.IOException;

import com.eppixcomm.eppix.base.blo.BtcBatchControlDMO;
import com.eppixcomm.eppix.common.util.BopContext;
import com.eppixcomm.eppix.base.error.EPPIXBusinessException;
import com.eppixcomm.eppix.base.error.EPPIXException;
import com.eppixcomm.eppix.base.error.EPPIXFatalException;
import com.eppixcomm.eppix.base.error.EPPIXObjectNotFoundException;
import com.eppixcomm.eppix.base.error.EPPIXSeriousException;
import com.eppixcomm.eppix.base.error.EPPIXUnexpectedException;

public interface BatchProcess {

  abstract BopContext batchStart(BtcBatchControlDMO btc)
      throws EPPIXObjectNotFoundException, EPPIXException;

  abstract BopContext batchExecute(BopContext context)
      throws EPPIXObjectNotFoundException, EPPIXException, IOException;

  abstract void checkBatchRequirements() throws EPPIXSeriousException;

  abstract void getKeys() throws EPPIXBusinessException,
      EPPIXUnexpectedException, EPPIXFatalException;
}
