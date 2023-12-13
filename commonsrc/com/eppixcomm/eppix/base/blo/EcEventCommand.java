package com.eppixcomm.eppix.base.blo;


import com.eppixcomm.eppix.common.util.FilterOp;
import com.eppixcomm.eppix.common.util.QueryFilter;
import com.eppixcomm.eppix.base.error.EPPIXBusinessException;
import com.eppixcomm.eppix.base.error.EPPIXFatalException;
import com.eppixcomm.eppix.base.error.EPPIXUnexpectedException;
import com.eppixcomm.eppix.common.util.Date;
import com.eppixcomm.eppix.common.util.DateTime;
import com.eppixcomm.eppix.common.util.Time;

/**
 * This table contains list of all events, which need to be communicated from EPPIX to Network Elements as well as events that have been communicated, but were rejected from the Network Elements.
 * <p>
 *   
 
 Related tables:
 @ECD_EVENT_CMD_DET
 @EA_EVENT_AUDIT
 @EAD_EVENT_AUD_DET
 * </p>
 *
 * This class contains any additional logic for EcEventCommand, if any.
 * It extends the EcEventCommandAbstractBLO which holds all the default logic for this class.
 *
 * @author $Author$
 * @version $Revision: 1.2 $
 *
 * @since $jdk$
 */
public class EcEventCommand extends EcEventCommandAbstractBLO {

  /**
   * 
   * 
   * @param oldCommand
   * @param newCommand
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   * 
   */
  public void commandUpdate(String oldCommand, String newCommand)
      throws EPPIXBusinessException, EPPIXUnexpectedException,
      EPPIXFatalException {
    logger.debug("commandUpdate(oldCommand, newCommand)");

    QueryFilter filter = new QueryFilter();
    filter.add(FilterOp.SET, EcEventCommandDMO.ecCommandFilter, newCommand);

    filter.add(FilterOp.EQUAL, EcEventCommandDMO.ecCommandFilter, oldCommand);

    modify(filter);

  }

  /**
   * Creates a new {@link EcEventCommand}, as well as generating the next command.
   * 
   * @param n2n
   * @param event
   * @param subscriberId
   * @throws EPPIXBusinessException
   * @throws EPPIXUnexpectedException
   * @throws EPPIXFatalException
   * 
   * TODO SJ: This method is commented out as it is project specific.
   * The classes implemented in this base project must not contain any project specific 
   * methods
   * 
   */
//  public void createEvent(NodeToNodeServiceDMO n2n, NodeToNodeEvent event,
//      String eventType, Integer subscriberId) throws EPPIXBusinessException,
//      EPPIXUnexpectedException, EPPIXFatalException {
//
//    logger.debug("createEvent(  )");
//
//    // Get a unique ec_command
//    if (n2n.getEventDate().after(new Date())) {
//
//    /**
//     * TODO SJ: Fixme
//     */	
//      //event.setCommand(base.efqFutureQueue().nextId(n2n.getEventDate(), null));
//
//    } else {
//      event.setCommand(DateTime.formatYYYYMMDDHHMMSSSS(new DateTime(System
//          .currentTimeMillis())));
//    }
//
//    EcEventCommandDMO ec = event.getEventCommand();
//    ec.setEcCommand(event.getCommand());
//    ec.setEcStatus("1");
//    ec.setEcDate(new Date());
//    ec.setEcTime(Integer.parseInt(Time.formatHHMMSS(new Time())));
//    ec.setEcNetwork(n2n.getNetworkId());
//    ec.setEcType(eventType);
//    ec.setEcPriority(event.getPriority());
//    ec.setEcSubscriberId(subscriberId);
//    ec.setEcMsisdn(n2n.getMsisdnNo());
//    ec.setEcSim(n2n.getSimNo());
//    ec.setEcOperator(loginName());
//
//    /**
//     * TODO SJ Fixme
//     */
//    //    ec.setEcTty(locale().getLoginAddr());
//    ec.setEcTty("My Login Address");
//    create(ec);
//
//  }
}

