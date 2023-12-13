package com.eppixcomm.eppix.base.blo;

import java.util.Iterator;
import java.util.List;

//import com.eppixcomm.eppix.common.cache.BcyCache;
//import com.eppixcomm.eppix.common.cache.DealerCache;
//import com.eppixcomm.eppix.common.cache.PptCache;
//import com.eppixcomm.eppix.common.cache.SvrCache;
//import com.eppixcomm.eppix.common.cache.TpCache;
//import com.eppixcomm.eppix.common.cache.TsCache;
//import com.eppixcomm.eppix.common.cache.VpsCache;
//import com.eppixcomm.eppix.common.cache.VsrCache;
//import com.eppixcomm.eppix.common.cache.VstCache;
import com.eppixcomm.eppix.common.data.DAC;
import com.eppixcomm.eppix.common.data.DAOIterator;
import com.eppixcomm.eppix.common.data.DMO;
import com.eppixcomm.eppix.common.util.Actions;
import com.eppixcomm.eppix.common.util.BopContext;
import com.eppixcomm.eppix.common.util.QueryFilter;
import com.eppixcomm.eppix.common.util.FilterOp;
//import com.eppixcomm.eppix.common.data.Direction;
//import com.eppixcomm.eppix.common.data.Period;
import com.eppixcomm.eppix.base.error.EPPIXBusinessException;
import com.eppixcomm.eppix.base.error.EPPIXFatalException;
import com.eppixcomm.eppix.base.error.EPPIXUnexpectedException;
//import com.eppixcomm.eppix.n2n.NodeToNodeRequest;
import com.eppixcomm.eppix.common.util.Date;
import com.eppixcomm.eppix.common.util.General;

public class PPSubscriberActivate extends BaseBLO implements BaseMessages {

  private PPSubscriberActivateDAC dac;

//  private BcyCache bcyCache;
//
//  private PptCache pptCache;
//
//  private TsCache tsCache;
//
//  private VsrCache vsrCache;
//
//  private VstCache vstCache;
//
//  private SvrCache svrCache;
//
//  private DealerCache dealerCache;
//
//  private TpCache tpCache;
//
//  private VpsCache vpsCache;

//  @Override
  protected Class getDACClass() {
    return PPSubscriberActivateDAC.class;
  }
  
//  @Override
  protected void setDAC(DAC dac) {
    this.dac = (PPSubscriberActivateDAC) dac;
  }

  /**
   * Pre-locks (actpend) a block of sims and msisdns
   * 
   * Essentially, sets up the PAN and ACTIVATION_PEND tables
   * with a block of SIM/MSISDN pairs for prepaid activation. 
   * 
   * @param context
   * @throws EPPIXFatalException 
   * @throws EPPIXUnexpectedException 
   * @throws EPPIXBusinessException 
   */
//  public BopContext lockSimsAndMsisdns(BopContext context)
//      throws EPPIXBusinessException, EPPIXUnexpectedException,
//      EPPIXFatalException {
//
//    DAOIterator simsIterator = null;
//    DAOIterator msisdnsIterator = null;
//
//    try {
//
//      // get the PAL details from the batch context
//      PalPrepaidMaLogDMO pal = (PalPrepaidMaLogDMO) context
//          .getData("prepaidma");
//
//      // ++++++++++
//      // Check the services for validity
//      // Ensures that the package/service information is valid for prepaid.
//      checkServices(pal);
//
//      bcyCache = BcyCache.getInstance(base);
//      pptCache = PptCache.getInstance(base);
//
//      // prepaid type
//      PptPrepaidTypesDMO prepaidType = pptCache.getPrepaidType(pal
//          .getPalPrepaidType());
//
//      //
//      //
//
//      // get list of sims....
//      QueryFilter filter = new QueryFilter();
//      filter.add(FilterOp.GREATERTHANOREQUAL, SmnSimNosDMO.smnSimNoFilter, pal
//          .getPalSimStart());
//      filter.add(FilterOp.EQUAL, SmnSimNosDMO.smnNetworkIdFilter, pal
//          .getPalNetId());
//      filter.add(FilterOp.EQUALORNULL, SmnSimNosDMO.smnDealerIdFilter, pal
//          .getPalDealerId());
//      filter.add(FilterOp.EQUAL, SmnSimNosDMO.smnStatusFilter, "0");
//      filter.add(FilterOp.ORDERBYASC, SmnSimNosDMO.smnSimNoFilter);
//
//      // Sims Iterator
//      simsIterator = base.smnSimNos().iterate(filter);
//
//      // get list of msisdns
//      filter = new QueryFilter();
//      filter.add(FilterOp.GREATERTHANOREQUAL,
//          MsiMsisdnNosDMO.msiMsisdnNoFilter, pal.getPalMsisdnStart());
//      filter.add(FilterOp.EQUAL, MsiMsisdnNosDMO.msiMsisdnNoFilter, pal
//          .getPalNetId());
//      filter.add(FilterOp.NULL, MsiMsisdnNosDMO.msiSimNoFilter);
//      filter.add(FilterOp.EQUAL, MsiMsisdnNosDMO.msiStatusFilter, "9");
//      filter.add(FilterOp.EQUALORNULL, MsiMsisdnNosDMO.msiDealerIdFilter, pal
//          .getPalDealerId());
//
//      msisdnsIterator = base.msiMsisdnNos().iterate(filter);
//
//      int count = 0;
//
//      // loop until we've got enough...
//      while (count < pal.getPalNoActivations()) {
//
//        // there are no more SIMs !
//        if (!simsIterator.hasNext()) {
//          break;
//        }
//
//        SmnSimNosDMO sim = (SmnSimNosDMO) simsIterator.next();
//
//        // SIM cannot be pending activation yet...
//        ActivationPendDMO act = new ActivationPendDMO();
//        act.setSerialNo(sim.getSmnSimNo());
//
//        // it is?  then go onto the next SIM in the list
//        if (base.activationPend().exists(act)) {
//          continue;
//        }
//
//        // Check that the SIM is not already linked to an MSISDN
//        filter = new QueryFilter();
//        filter.add(FilterOp.EQUAL, MsiMsisdnNosDMO.msiSimNoFilter, sim
//            .getSmnSimNo());
//
//        // The SIM is linked ! ... try another one.
//        if (base.msiMsisdnNos().exists(filter)) {
//          continue;
//        }
//
//        // Get the next MSISDN...
//
//        MsiMsisdnNosDMO msi = null;
//
//        while (true) {
//
//          // no more MSISDNs
//          if (!msisdnsIterator.hasNext()) {
//            break;
//          }
//
//          msi = (MsiMsisdnNosDMO) msisdnsIterator.next();
//
//          // if we can validate the MSISDN against the SIM, no need to get another MSISDN
//          if (base.utils().simMsisdnValidateHlr(sim, msi, null)) {
//            break;
//          }
//
//        }
//
//        // no more MSISDNs!
//        if (!msisdnsIterator.hasNext()) {
//          break;
//        }
//
//        // YAY!  We've got a valid SIM and MSISDN... let's add them to the list of
//        // pending numbers...
//
//        // Insert the ACT entry for the SIM
//        act = new ActivationPendDMO();
//        act.setSerialNo(sim.getSmnSimNo());
//        act.setDiallingNo(sim.getSmnSimNo());
//
//        base.activationPend().create(act);
//
//        // Insert the ACT entry for the MSISDN
//        act = new ActivationPendDMO();
//        act.setSerialNo(msi.getMsiMsisdnNo());
//        act.setDiallingNo(msi.getMsiMsisdnNo());
//
//        base.activationPend().create(act);
//
//        // Insert the PAN entry for SIM/MSISDN
//        PanPrepaidMaNumDMO pan = new PanPrepaidMaNumDMO();
//        pan.setPanMsisdnNo(msi.getMsiMsisdnNo());
//        pan.setPanSimNo(sim.getSmnSimNo());
//
//        base.panPrepaidMaNum().create(pan);
//
//        // Increment the success count
//        count++;
//
//      }
//
//    } catch (Exception e) {
//
//      context.setErrorText(e.getMessage());
//
//    } finally {
//
//      if (simsIterator != null) {
//        simsIterator.close();
//      }
//      if (msisdnsIterator != null) {
//        msisdnsIterator.close();
//      }
//    }
//
//    return context;
//  }
//
//  /**
//   * Iterates over the list of SIM/MSISDN pairs in the PAN table, performing the
//   * required activations.
//   * 
//   * 
//   * @param context
//   * @return the context
//   * @throws EPPIXFatalException 
//   * @throws EPPIXUnexpectedException 
//   * @throws EPPIXBusinessException 
//   */
//  public BopContext activatePrepaidBlock(BopContext context)
//      throws EPPIXBusinessException, EPPIXUnexpectedException,
//      EPPIXFatalException {
//
//    DAOIterator panIterator = null;
//
//    try {
//
//      // get the caches
//      tsCache = TsCache.getInstance(base);
//      vsrCache = VsrCache.getInstance(base);
//      vstCache = VstCache.getInstance(base);
//      svrCache = SvrCache.getInstance(base);
//      dealerCache = DealerCache.getInstance(base);
//      vpsCache = VpsCache.getInstance(base);
//
////      NodeToNodeRequest n2nRequest = new NodeToNodeRequest(
////          "Prepaid Mass Activation");
//
//      Date today = new Date();
//
//      // get the PAL details from the batch context
////      PalPrepaidMaLogDMO pal = (PalPrepaidMaLogDMO) context
////          .getData("prepaidma");
//
//      // get the PAN records, which are the list of SIM/MSISDN pairs for processing.
//      QueryFilter filter = new QueryFilter();
////      filter.add(FilterOp.ANY, PanPrepaidMaNumDMO.panSimNoFilter);
//
////      panIterator = base.panPrepaidMaNum().iterate(filter);
//
//      if (panIterator != null) {
//
//        while (panIterator.hasNext()) {
//
////          PanPrepaidMaNumDMO pan = (PanPrepaidMaNumDMO) panIterator.next();
//
////          MsiMsisdnNosDMO msisdn = base.msiMsisdnNos().getForMsisdnNo(
////              pan.getPanMsisdnNo());
//
////          SmnSimNosDMO sim = base.smnSimNos().getForSimNo(pan.getPanSimNo());
//
//          // create the subscriber details
////          SubscriberDetailDQO subscriber = activateSubscriber(pal, pan
////              .getPanMsisdnNo());
//
////          Integer subscriberId = subscriber.getSbd().getSbdSubscriberId();
//
////          DealersDMO dealer = dealerCache.getDealer(pal.getPalDealerId());
////          TpTariffPlanDMO tp = tpCache.getTariffPlan(pal.getPalTariff());
//
//          // Activate Mandatory Services
////          List<TsTariffServiceDMO> services = tsCache.getSortedList(pal
////              .getPalPackage());
//
////          for (TsTariffServiceDMO ts : services) {
////
////            String serviceCode = ts.getTsServiceCode();
////
////            createParameterizedOrBasicService(subscriber, today, msisdn, sim,
////                dealer, tp, serviceCode);
////
////          }
//
//          // Activate other Services
////          for (TsTariffServiceDMO ts : services) {
////
////            String serviceCode = ts.getTsServiceCode();
////
////            createOtherService(subscriber, pal, pan, sim, today, tp,
////                serviceCode);
////
////          }
//
//          // TODO : BaH : set the cycle status to "BILLED" for the current period
//
//          // prepaid type
////          createPPPDetails(subscriberId, pal, msisdn, sim, today);
//
//          // +++++++++++++++++++
//          //      HISTORY
//          // +++++++++++++++++++
//
//          // Create the SIM History entries
////          createHistoryInformation(subscriberId, pal, msisdn, sim);
//
//          // Performing the Node to Node for the Activations
////          base.nodeToNode().activationCommit(n2nRequest, subscriber,
////              pal.getPalPackage());
//
//        }
//      }
//
//      // TODO: BaH : output the NodeToNode stuff
//
//    } catch (Exception e) {
//
//      context.setErrorText(e.getMessage());
//
//    } finally {
//
//      if (panIterator != null) {
////        panIterator.close();
//      }
//
//    }
//
//    return context;
//  }
//
//  /**
//   * Creates SMH and MSH entries.
//   *  
//   * @param subscriberId
//   * @param pal
//   * @param msisdn
//   * @param sim
//   * @throws EPPIXBusinessException
//   * @throws EPPIXUnexpectedException
//   * @throws EPPIXFatalException
//   */
//  protected void createHistoryInformation(Integer subscriberId,
//      PalPrepaidMaLogDMO pal, MsiMsisdnNosDMO msisdn, SmnSimNosDMO sim)
//      throws EPPIXBusinessException, EPPIXUnexpectedException,
//      EPPIXFatalException {
//
//    base.smhSimHistory().create(
//        subscriberId,
//        sim.getSmnSimNo(),
//        "EINA",
//        messages.getMessage(194022) + ", " + messages.getMessage(194023) + " "
//            + pal.getPalPrepaidType());
//
//    String histDesc = messages.getMessage(180705) + ", "
//        + messages.getMessage(122061) + " " + msisdn.getMsiMsisdnNo();
//
//    if (!DMO.isNull(pal.getPalDealerId())) {
//
//      histDesc += ", " + messages.getMessage(116006) + " "
//          + pal.getPalDealerId();
//
//    }
//
//    base.smhSimHistory().create(subscriberId, sim.getSmnSimNo(), "EPPP",
//        histDesc);
//
//    // Create the MSISDN History entries
//    base.mshMsisdnHistory().create(
//        subscriberId,
//        msisdn.getMsiMsisdnNo(),
//        "EINA",
//        messages.getMessage(194022) + ", " + messages.getMessage(194023) + " "
//            + pal.getPalPrepaidType());
//
//    histDesc = messages.getMessage(180705) + ", " + messages.getMessage(114148)
//        + " " + sim.getSmnSimNo();
//
//    if (!DMO.isNull(pal.getPalDealerId())) {
//
//      histDesc += ", " + messages.getMessage(116006) + " "
//          + pal.getPalDealerId();
//
//    }
//
//    base.mshMsisdnHistory().create(subscriberId, msisdn.getMsiMsisdnNo(),
//        "EPPP", histDesc);
//  }
//
//  /**
//   * Populates and inserts a new PPP record.
//   * 
//   * @param subscriberId
//   * @param pal
//   * @param msisdn
//   * @param sim
//   * @param date
//   * @throws EPPIXBusinessException
//   * @throws EPPIXUnexpectedException
//   * @throws EPPIXFatalException
//   */
//  protected void createPPPDetails(Integer subscriberId, PalPrepaidMaLogDMO pal,
//      MsiMsisdnNosDMO msisdn, SmnSimNosDMO sim, Date date)
//      throws EPPIXBusinessException, EPPIXUnexpectedException,
//      EPPIXFatalException {
//
//    PptPrepaidTypesDMO prepaidType = pptCache.getPrepaidType(pal
//        .getPalPrepaidType());
//
//    // Populate the ppp record
//    PppPrepaidPairsDMO ppp = new PppPrepaidPairsDMO();
//
//    ppp.setPppBillAcNo("PPPPPPPP");
//    ppp.setPppSubscriberId(subscriberId);
//    ppp.setPppSerialNo(sim.getSmnSimNo());
//    ppp.setPppImsiNo(sim.getSmnImsiNo());
//    ppp.setPppDiallingNo(msisdn.getMsiMsisdnNo());
//    ppp.setPppType(pal.getPalPrepaidType());
//    ppp.setPppStatus(0);
//    ppp.setPppValidateDate(date);
//    ppp.setPppCreditRemain(prepaidType.getPptCredit());
//
//    if ("D".equals(prepaidType.getPptValidityUnit())) {
//
//      ppp.setPppValidityEnd(Date.addDays(prepaidType.getPptValidity(), date));
//
//    } else if ("M".equals(prepaidType.getPptValidityUnit())) {
//
//      ppp.setPppValidityEnd(General.shiftPeriod(date, Period.MONTH, prepaidType
//          .getPptValidity(), 0, Direction.FORWARD));
//
//    } else if ("Y".equals(prepaidType.getPptValidityUnit())) {
//
//      ppp.setPppValidityEnd(Date.addYears(prepaidType.getPptValidity(), date));
//
//    }
//
//    ppp.setPppPackageCode(pal.getPalPackage());
//    ppp.setPppInternTariff(pal.getPalTariff());
//    ppp.setPppBillCycle(pal.getPalCycle());
//    ppp.setPppTechnology("GSM");
//    ppp.setPppProfile(prepaidType.getPptProfile());
//
//    // create the new ppp record
//    base.pppPrepaidPairs().create(ppp);
//  }
//
//  /**
//   * Performs the create service for Parameterized or Basic.
//   * 
//   * @param subscriber
//   * @param date
//   * @param msisdn
//   * @param sim
//   * @param dealer
//   * @param tp
//   * @param serviceCode
//   * @throws EPPIXBusinessException
//   * @throws EPPIXUnexpectedException
//   * @throws EPPIXFatalException
//   */
//  protected void createParameterizedOrBasicService(
//      SubscriberDetailDQO subscriber, Date date, MsiMsisdnNosDMO msisdn,
//      SmnSimNosDMO sim, DealersDMO dealer, TpTariffPlanDMO tp,
//      String serviceCode) throws EPPIXBusinessException,
//      EPPIXUnexpectedException, EPPIXFatalException {
//
//    VsrServiceDMO vsr = vsrCache.getService(serviceCode);
//
//    String serviceType = vsr.getVsrServiceType();
//
//    VstServiceTypesDMO vst = vstCache.getServiceType(serviceType);
//    Vsr2ServiceAuxDMO vsr2 = vsrCache.getServiceAux(serviceCode);
//
//    // Parameterized Service 
//    if ("Y".equals(vst.getVstParameterised())) {
//
//      base.service().createParameterisedForPrepaid(subscriber, msisdn, sim,
//          vsr, vst, date, tp, false, false);
//
//    }
//
//    // Basic Service
//    if ("B".equals(vsr2.getVsr2EntryType())
//        && "N".equals(vst.getVstParameterised())) {
//
//      base.service().createBasic(subscriber, msisdn, sim, vsr, vst, date, null,
//          null, false, "0", null, null, tp, dealer, null, null, null, null,
//          false, false, false);
//
//    }
//  }
//
//  /**
//   * Performs a service create for NonBasic, Value Added or Itemised.
//   * 
//   * @param subscriber
//   * @param pal
//   * @param pan
//   * @param sim
//   * @param today
//   * @param tp
//   * @param serviceCode
//   * @throws EPPIXBusinessException
//   * @throws EPPIXUnexpectedException
//   * @throws EPPIXFatalException
//   */
//  protected void createOtherService(SubscriberDetailDQO subscriber,
//      PalPrepaidMaLogDMO pal, PanPrepaidMaNumDMO pan, SmnSimNosDMO sim,
//      Date today, TpTariffPlanDMO tp, String serviceCode)
//      throws EPPIXBusinessException, EPPIXUnexpectedException,
//      EPPIXFatalException {
//    VsrServiceDMO vsr = vsrCache.getService(serviceCode);
//
//    String serviceType = vsr.getVsrServiceType();
//
//    VstServiceTypesDMO vst = vstCache.getServiceType(serviceType);
//    Vsr2ServiceAuxDMO vsr2 = vsrCache.getServiceAux(serviceCode);
//
//    VpsPackageServDMO vps = vpsCache.getPackageServ(pal.getPalPackage(),
//        serviceCode);
//
//    // Basic Service
//    if ("I".equals(vsr2.getVsr2EntryType())
//        && "N".equals(vst.getVstParameterised())) {
//
//      base.service().createNonBasic(subscriber, sim, vsr, today, tp, null,
//          null, null, "Y".equals(vps.getVpsMultiCharge()), false, false);
//
//    }
//
//    // Value Added service
//    if ("V".equals(vsr2.getVsr2EntryType())
//        && "N".equals(vst.getVstParameterised())) {
//
//      base.service().createValueAdded(subscriber, vsr, today, null, null, null,
//          false);
//
//    }
//
//    // Itemised service
//    if ("M".equals(vsr2.getVsr2EntryType())
//        && "N".equals(vst.getVstParameterised())) {
//
//      base.service().createItemised(subscriber, pan.getPanMsisdnNo(), vsr,
//          today, null, null, null, "Y".equals(vps.getVpsMultiCharge()), false);
//
//    }
//  }
//
//  /**
//   * 
//   * @param pal
//   * @throws EPPIXBusinessException
//   * @throws EPPIXUnexpectedException
//   * @throws EPPIXFatalException
//   */
//  protected void checkServices(PalPrepaidMaLogDMO pal)
//      throws EPPIXBusinessException, EPPIXUnexpectedException,
//      EPPIXFatalException {
//
//    // list of services
//    List services = tsCache.getSortedList(pal.getPalPackage());
//
//    for (Iterator serviceIterator = services.iterator(); serviceIterator
//        .hasNext();) {
//
//      TsTariffServiceDMO ts = (TsTariffServiceDMO) serviceIterator.next();
//
//      String serviceCode = ts.getTsServiceCode();
//
//      VsrServiceDMO vsr = vsrCache.getService(serviceCode);
//
//      String serviceType = vsr.getVsrServiceType();
//
//      Vsr2ServiceAuxDMO vsr2 = vsrCache.getServiceAux(serviceCode);
//      VstServiceTypesDMO vst = vstCache.getServiceType(serviceType);
//
//      // Exclude FF, FA and DC
//      if (!"FF".equals(serviceType) && !"FA".equals(serviceType)
//          && !"DC".equals(serviceType)) {
//
//        // See if there is a Deposit Associated to the Service
//        SdrServDepoRuleDMO sdr = base.sdrServDepoRule().getServiceDepositRule(
//            pal.getPalPackage(), serviceCode, -1);
//
//        // There is...
//        if (sdr != null) {
//
//          if ("BT".equals(serviceType)) {
//
//            // NOT ALLOWED ... throw an exception and stop the run.
//            throw new EPPIXBusinessException("Basic Service '" + serviceCode
//                + "' on '" + pal.getPalPackage() + "' requires a Deposit. ");
//
//          }
//        }
//      }
//    }
//
//    for (Iterator serviceIterator = services.iterator(); serviceIterator
//        .hasNext();) {
//
//      TsTariffServiceDMO ts = (TsTariffServiceDMO) serviceIterator.next();
//      String serviceCode = ts.getTsServiceCode();
//
//      // ++++++++++
//      // check Excluded services
//
//      List excluded = svrCache.getList(serviceCode, "E");
//
//      // are there excluded services to check?
//      if (excluded != null) {
//
//        for (Iterator exclusions = excluded.iterator(); exclusions.hasNext();) {
//
//          SvrServRuleDMO svr = (SvrServRuleDMO) exclusions.next();
//
//          // Compare services 
//          for (Iterator si = services.iterator(); si.hasNext();) {
//
//            // Found a match... throw a business exception
//            if (svr.getSvrPrimaryServ().equals(
//                ((TsTariffServiceDMO) si.next()).getTsServiceCode())) {
//
//              throw new EPPIXBusinessException("Existing service '"
//                  + svr.getSvrTargetServ() + "' is excluded by '"
//                  + svr.getSvrPrimaryServ() + "'");
//
//            }
//          }
//        }
//      }
//
//      // ++++++++++
//      // check Included services
//
//      excluded = svrCache.getList(serviceCode, "I");
//
//      // are there included services to check?
//      if (excluded != null) {
//
//        for (Iterator inclusions = excluded.iterator(); inclusions.hasNext();) {
//
//          SvrServRuleDMO svr = (SvrServRuleDMO) inclusions.next();
//
//          // Compare services 
//          boolean serviceFound = false;
//
//          for (Iterator si = services.iterator(); si.hasNext();) {
//
//            // Found a match... 
//            if (svr.getSvrPrimaryServ().equals(
//                ((TsTariffServiceDMO) si.next()).getTsServiceCode())) {
//
//              serviceFound = true;
//              break;
//
//            }
//          }
//
//          if (!serviceFound) {
//
//            throw new EPPIXBusinessException("Missing service '"
//                + svr.getSvrTargetServ() + "' is included by '"
//                + svr.getSvrPrimaryServ() + "'");
//          }
//        }
//      }
//    }
//  }
//
//  /**
//   * Creates the prepaid subscriber - sbd, sba and sbc
//   * 
//   * @param pal
//   * @param msisdnNo
//   * @throws EPPIXBusinessException
//   * @throws EPPIXUnexpectedException
//   * @throws EPPIXFatalException
//   */
//  public SubscriberDetailDQO activateSubscriber(PalPrepaidMaLogDMO pal,
//      String msisdnNo) throws EPPIXBusinessException, EPPIXUnexpectedException,
//      EPPIXFatalException {
//
//    SubscriberDetailDQO subscriber = new SubscriberDetailDQO();
//
//    SbdSubDetsDMO sbd = new SbdSubDetsDMO();
//
//    sbd.setSbdDiallingNo(msisdnNo);
//    sbd.setSbdBillAcNo("PPPPPPPP");
//    sbd.setSbdConnectDate(new Date());
//    sbd.setSbdTitle("PP");
//    sbd.setSbdSurname("MSISDN-" + msisdnNo);
//    sbd.setSbdFirstname("PrePaid");
//    sbd.setSbdGender("M");
//    sbd.setSbdBillCycle(pal.getPalCycle());
//    sbd.setSbdPackageCode(pal.getPalPackage());
//    sbd.setSbdTariffPlan(pal.getPalTariff());
//
//    // create the subscriber (sbd)
//    // this generates the unique subscriber id
//    base.sbdSubDets().create(sbd);
//
//    // cache the sbd details
//    subscriber.setSbd(sbd);
//
//    SbaSubAuxDMO sba = new SbaSubAuxDMO();
//
//    sba.setSbaSubscriberId(sbd.getSbdSubscriberId());
//    sba.setSbaMarketing("N");
//    sba.setSbaThirdParty("N");
//    sba.setSbaDealerId(pal.getPalDealerId());
//    sba.setSbaPrepaidStat("PN");
//    sba.setSbaInvAccount("PPPPPPPP");
//    sba.setSbaInvoiceAddrid(0);
//
//    // create the sub aux record
//    base.sbaSubAux().create(sba);
//
//    subscriber.setSba(sba);
//
//    SbcSubCreditDMO sbc = new SbcSubCreditDMO();
//    sbc.setSbcSubscriberId(sbd.getSbdSubscriberId());
//    sbc.setSbcCreditScore(0);
//
//    // create the subscriber credit record.
//    base.sbcSubCredit().create(sbc);
//
//    subscriber.setSbc(sbc);
//
//    // create AUD record.
//    AudAddressDMO aud = new AudAddressDMO();
//    aud.setAudSubscriberId(sbd.getSbdSubscriberId());
//    aud.setAudAccountNo(sbd.getSbdBillAcNo());
//    aud.setAudClassification("SPPP");
//    aud.setAudAddressType("SPHY");
//    aud.setAudInDate(new Date());
//
//    base.audAddress().create(aud);
//
//    // Fetch message for "Subscriber created"
//    String mess = messages.getMessage(108074);
//
//    // Create the history record for subscriber creation
//    base.sbhSubHistory().create(sbd.getSbdSubscriberId(), 0, "ESBC", mess, "");
//
//    // Create action history for subscriber
//    base.actionManager().actionHistory(Actions.SUBSCRIBERCREATE,
//        sbd.getSbdSubscriberId(), null, null, null, null, null, null, null,
//        pal.getPalPackage(), null, pal.getPalCycle(), null, null, null);
//
//    return subscriber;
//  }
}
