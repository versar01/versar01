package com.eppixcomm.eppix.base.blo;


import com.eppixcomm.eppix.common.data.DMO;
import com.eppixcomm.eppix.base.error.EPPIXBusinessException;
import com.eppixcomm.eppix.base.error.EPPIXFatalException;
import com.eppixcomm.eppix.base.error.EPPIXUnexpectedException;

/**
 * needs description
 *
 * This class contains any additional logic for EqEventQueue, if any.
 * It extends the EqEventQueueAbstractBLO which holds all the default logic for this class.
 *
 * @author $Author$
 * @version $Revision: 1.2 $
 *
 * @since $jdk$
 * 
 */
public class EqEventQueue extends EqEventQueueAbstractBLO {

  /**
   * Creates a new {@link EqEventQueueDMO} based on the event and priority.
   * 
   * @param event
   * @param priority
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   */
//  public void create(NodeToNodeEvent event, int priority)
//      throws EPPIXBusinessException, EPPIXUnexpectedException,
//      EPPIXFatalException {
//    
//    logger.debug("create( event, priority )");
//
//    EqEventQueueDMO eq = new EqEventQueueDMO();
//    eq.setEqCommand(event.getCommand());
//    
//    if (!DMO.isNull(event.getBasicMessage())) {
//      eq.setEqMessage(event.getBasicMessage());
//    } else {
//      eq.setEqMessage(event.getNonBasicMessage());
//    }
//    
//    eq.setEqNetwork(event.getNetwork());
//    eq.setEqPriority(priority);
////    eq.setEqTechnologyInd("GSM");
//
//    create(eq);
//
//  }
}

