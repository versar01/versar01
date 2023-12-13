package com.eppixcomm.eppix.base.blo;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.HashMap;

import org.apache.log4j.Logger;

import com.eppixcomm.eppix.base.blo.DOFileReader.DOFileEntry;
import com.eppixcomm.eppix.common.blo.BatchProcess;
import com.eppixcomm.eppix.common.blo.Report;
import com.eppixcomm.eppix.common.data.DAC;
import com.eppixcomm.eppix.common.data.DAOIterator;
import com.eppixcomm.eppix.common.data.DMO;
import com.eppixcomm.eppix.common.util.BopContext;
import com.eppixcomm.eppix.common.util.FilterOp;
import com.eppixcomm.eppix.common.util.QueryFilter;
import com.eppixcomm.eppix.common.data.KeyTable;
import com.eppixcomm.eppix.base.error.EPPIXBusinessException;
import com.eppixcomm.eppix.base.error.EPPIXException;
import com.eppixcomm.eppix.base.error.EPPIXFatalException;
import com.eppixcomm.eppix.base.error.EPPIXObjectNotFoundException;
import com.eppixcomm.eppix.base.error.EPPIXSeriousException;
import com.eppixcomm.eppix.base.error.EPPIXUnexpectedException;
import com.eppixcomm.eppix.base.error.Thrower;
//import com.eppixcomm.eppix.fin.general.GeneralVatDFO;
//import com.eppixcomm.eppix.fin.salesledger.SalesLedgerInvoiceDFO;
//import com.eppixcomm.eppix.fin.salesorder.SalesOrderCostOfSalesDFO;
//import com.eppixcomm.eppix.fin.salesorder.SalesOrderServiceDFO;
import com.eppixcomm.eppix.common.util.Date;
import com.eppixcomm.eppix.common.util.DateTime;
import com.eppixcomm.eppix.common.util.Format;
import com.eppixcomm.eppix.common.util.Time;

public class DoFileRead extends BaseBLO implements BaseMessages
//, BatchProcess {
{

  // ~ Static variables/initializers
  static Thrower thrower = Thrower.getThrower(DoFileRead.class);

  static Logger logger = thrower.getLogger();

  private static final String batchType = "DOFILEREAD";

  private static final String batchId = "DOFILEREAD";

  private DoFileReadDAC dac;

  private static String instCode;

//  private static EdtDbtordrTypeDMO debitOrderType;
//
//  private static SalesOrderServiceDFO salesOrderService;
//
//  private static GeneralVatDFO generalVat;
//
//  private static SalesOrderCostOfSalesDFO costOfSales;

  private static String keyDOFILERDRF;

  private static String keyDORDXXSTSS;

  private static String keyDORDXXSTSE;

  private static String keyDORDXXEPRS;

  private static String keyDORDXXEPRE;

  private static String keyDORDXXDETL;

  private static String keyDOFLRDCOMT;

  private static boolean isUsingCashRevAdminFee; // cash reversal / admin fee

  private static String cashBatchRef;

  private static String invoiceBatchRef;

  private static String keySLPERIOD;

  private static String keyASUNPBANK;

  private static String keySLYEAR;

  private static String keyASUNPCHRGE;

  private static String keySLNLCONTRL;

  private static double invoiceVATAmount;

  private static double invoiceTotalAmount;

  private static File inputPath;

//  private static HashMap<String, EdrDbtordrReasDMO> reasonCache;

//  @Override
  protected Class getDACClass() {
    return DoFileReadDAC.class;
  }
//  
////  @Override
  protected void setDAC(DAC dac) {
    this.dac = (DoFileReadDAC) dac;
  }
//
//  public BopContext batchStart(BtcBatchControlDMO btc)
//      throws EPPIXObjectNotFoundException, EPPIXException {
//
//    logger.debug("batchStart( )");
//
//    BopContext batchContext = new BopContext();
//
//    try {
//
//      String logPath = base.utils().getPrintFilename();
//
//      // Set up and return a batch context
////      batchContext.setBatchRunNum(btc.getBtcBatchRunNum());
//      batchContext.setBatchId(btc.getBtcBatchId());
//      batchContext.setBatchType(btc.getBtcBatchType());
//      batchContext.setCycle("ALL");
//      batchContext.putData("inputpath", inputPath);
//      // generates exception report
//      batchContext.setErrorLogFile(logPath);
//      batchContext.setQtySucceeded(0);
//      batchContext.setQtyRejected(0);
//
//      // check that we can run this batch
//      PgsProgramStatusDMO pgs = base.utils().programDependencyCheck(batchType,
//          "ALL");
//      // TODO - check pgs for null
//
//      // set up and start the batch
//      btc = base.utils().newBatch(batchType, batchId, btc);
//
//      // update context with new batch num
//      batchContext.setBatchRunNum(btc.getBtcBatchRunNum());
//
//      // institution Code
//      instCode = btc.getBtcParameter1();
//
//      // retrieve the debit order type record
//      debitOrderType = new EdtDbtordrTypeDMO();
//      debitOrderType.setEdtInstCode(instCode);
//      debitOrderType = base.edtDbtordrType().get(debitOrderType);
//
//      checkBatchRequirements();
//
//      createReasonCache();
//
//      // get the system keys required for the batch run
//      getKeys();
//
//      // set btc and pgs to running
//      base.utils().runBatch(btc, pgs);
//
//    } catch (Exception e) {
//      batchContext.setErrorText(e.getMessage());
//    }
//
//    return batchContext;
//  }
//
//  private void createReasonCache() throws EPPIXBusinessException,
//      EPPIXUnexpectedException, EPPIXFatalException {
//    QueryFilter filter = new QueryFilter();
//    filter.add(FilterOp.EQUAL, EdrDbtordrReasDMO.edrInstCodeFilter, instCode);
//
//    DAOIterator i = base.edrDbtordrReas().iterate(filter);
//
//    reasonCache = new HashMap<String, EdrDbtordrReasDMO>();
//
//    while (i.hasNext()) {
//      EdrDbtordrReasDMO edr = (EdrDbtordrReasDMO) i.next();
//
//      reasonCache.put(edr.getEdrReasonCode(), edr);
//    }
//
//    i.close();
//  }
//
//  public void checkBatchRequirements() throws EPPIXSeriousException {
//
//    // edt input and output paths must exist.
//
//    File f = new File(debitOrderType.getEdtInputDir());
//
//    if (!f.isDirectory()) {
//      throw new EPPIXSeriousException("Input path '"
//          + debitOrderType.getEdtInputDir()
//          + "' as specified in edt_dbtordr_type - '"
//          + debitOrderType.getEdtInstCode()
//          + "' is not a directory or does not exist");
//    }
//
//    // input needs to be readable
//    if (!f.canRead()) {
//      throw new EPPIXSeriousException("Input Path '"
//          + debitOrderType.getEdtInputDir()
//          + "' as specified in edt_dbtordr_type - '"
//          + debitOrderType.getEdtInstCode() + "' is not readable");
//    }
//
//    inputPath = f;
//
//    f = new File(debitOrderType.getEdtOutputDir());
//
//    if (!f.isDirectory()) {
//      throw new EPPIXSeriousException("Output path '"
//          + debitOrderType.getEdtInputDir()
//          + "' as specified in edt_dbtordr_type - '"
//          + debitOrderType.getEdtInstCode()
//          + "' is not a directory or does not exist");
//    }
//
//    // output needs to be writeable.
//    if (!f.canWrite()) {
//      throw new EPPIXSeriousException("Output Path '"
//          + debitOrderType.getEdtInputDir()
//          + "' as specified in edt_dbtordr_type - '"
//          + debitOrderType.getEdtInstCode() + "' is not writeable");
//    }
//
//  }
//
  public void getKeys() throws EPPIXBusinessException,
      EPPIXUnexpectedException, EPPIXFatalException {
//
//    keyDOFILERDRF = systemKeys.getKeyValue("DOFILERDRF",
//        KeyTable.SKS_KEY_SETTING);
//
//    keyDORDXXSTSS = systemKeys.getKeyValue("DORD" + instCode + "STSS",
//        KeyTable.SKS_KEY_SETTING);
//
//    keyDORDXXSTSE = systemKeys.getKeyValue("DORD" + instCode + "STSE",
//        KeyTable.SKS_KEY_SETTING);
//
//    keyDORDXXEPRS = systemKeys.getKeyValue("DORD" + instCode + "EPRS",
//        KeyTable.SKS_KEY_SETTING);
//
//    keyDORDXXEPRE = systemKeys.getKeyValue("DORD" + instCode + "EPRE",
//        KeyTable.SKS_KEY_SETTING);
//
//    keyDORDXXDETL = systemKeys.getKeyValue("DORD" + instCode + "DETL",
//        KeyTable.SKS_KEY_SETTING);
//
//    keyDOFLRDCOMT = systemKeys.getKeyValue("DOFLRDCOMT",
//        KeyTable.SKS_KEY_SETTING);
//
//    String cshrevadm = systemKeys.getKeyValue("CSHREVADM",
//        KeyTable.SKS_KEY_SETTING);
//
//    if ("Y".equals(cshrevadm.substring(0, 1).toUpperCase())) {
//      isUsingCashRevAdminFee = true;
//    } else {
//      isUsingCashRevAdminFee = false;
//    }
//
//    // System keys required to raise invoice administration charge
//    // ..for unpaids
//    if (isUsingCashRevAdminFee) {
//
//      keyASUNPBANK = systemKeys.getKeyValue("ASUNPBANK", KeyTable.SYSDIRM);
//
//      keySLPERIOD = base.finance().generalSettings()
//          .getSettingValue("SLPERIOD");
//
//      keySLYEAR = base.finance().generalSettings().getSettingValue("SLYEAR");
//
//      // Charge code for unpaid
//      keyASUNPCHRGE = systemKeys.getKeyValue("ASUNPCHRGE", KeyTable.SYSDIRM);
//
//      keySLNLCONTRL = base.finance().generalSettings().getSettingValue(
//          "SLNLCONTRL");
//
//      Calendar c = Calendar.getInstance();
//      int num = (c.get(Calendar.MONTH) + 1) * 31 + c.get(Calendar.DATE);
//      cashBatchRef = Format.format("SCR%03d", num);
//      invoiceBatchRef = Format.format("SIR%03d", num);
//
//      //  get Charge
//      //      opservm = new OpservmDMO();
//      //      opservm.setProduct(keyASUNPCHRGE);
//      //      base.opservm().get(opservm);
//      salesOrderService = base.finance().salesOrderService().get(keyASUNPCHRGE);
//
//      // get Vat code
//      //			cevatm = new CevatmDMO();
//      //			cevatm.setVatCode(opservm.getVatType());
//      //			base.cevatm().get(cevatm);
//      generalVat = base.finance().generalVat().get(
//          salesOrderService.getVatType());
//
//      // get Admin charge code
//      //      opcosm = new OpcosmDMO();
//      //      opcosm.setCostOfSales("sln" + opservm.getNominalCategory());
//      //      base.opcosm().get(opcosm);
//      costOfSales = base.finance().salesOrderCostOfSales().get(
//          "sln" + salesOrderService.getNominalCategory());
//
//      invoiceVATAmount = salesOrderService.getListPrice().doubleValue()
//          * generalVat.getPercentage().doubleValue() / 100;
//
//      invoiceTotalAmount = salesOrderService.getListPrice().doubleValue()
//          + invoiceVATAmount;
//    }
  }
//
//  public BopContext batchExecute(BopContext context)
//      throws EPPIXObjectNotFoundException, EPPIXException, IOException {
//
//    logger.debug("batchExecute( context )");
//
//    File inputFile = (File) context.getData("inputfile");
//
//    // make sure we get the file pointer
//    if (inputFile != null) {
//
//      // set up the file reader
//      DOFileReader reader = DOFileReaderFactory.getFileReader(instCode,
//          inputFile, keyDORDXXDETL, Integer.parseInt(keyDORDXXSTSS), Integer
//              .parseInt(keyDORDXXSTSE), Integer.parseInt(keyDORDXXEPRS),
//          Integer.parseInt(keyDORDXXEPRE));
//
//      if (reader == null) {
//        // TODO: BaH : No valid reader found... panic !!!
//      }
//
//      while (reader.hasNext()) {
//
//        SlcustmDMO customer = null;
//
//        DOFileEntry entry = (DOFileEntry) reader.next();
//
//        Integer referenceNo = Integer.parseInt(entry.getRefNo());
//        String reason = entry.getReason();
//
//        EprEpxRepositoryDMO epr = new EprEpxRepositoryDMO();
//        epr.setEprRefNo(referenceNo);
//
//        try {
//          epr = base.eprEpxRepository().get(epr);
//        } catch (EPPIXBusinessException e) {
//          if (e.getMessageCode().equals(
//              Base_EPREPXREPOSITORY_000.getMessageCode())) {
//
//            // TODO: BaH : Add to exception report
//
//            continue;
//          } else {
//            throw new EPPIXBusinessException(e);
//          }
//        }
//
//        // get the cached reason
//        EdrDbtordrReasDMO edr = reasonCache.get(reason);
//
//        if (edr == null) {
//          // TODO: BaH : Add to exception report
//          //	messages.getMessage(695);
//
//          continue;
//        }
//
//        // Set EPR status based on reason status
//        // 1 = confirmed, 0 = failure
//        if (edr.getEdrTransStatus() == 1) {
//          // confirmed... set status to "Close"
//          epr.setEprStatus(4);
//        } else {
//          // failed... set status to "Failure"
//          epr.setEprStatus(3);
//        }
//        // set error code
//        epr.setEprErrorCode(edr.getEdrReasonCode());
//        epr.setEprStatusDate(new Date());
//
//        // update EPR with new status
//        base.eprEpxRepository().modify(epr);
//
//        // ++++++++++++++++++++++++++++++
//        // Failed transaction - ie unpaid
//        // ++++++++++++++++++++++++++++++
//        // TODO: BaH : Failed transaction
//        if (epr.getEprStatus() == 3 && isUsingCashRevAdminFee) {
//
//          String refUnpaidInv = 'R' + epr.getEprChmlnRefNo().substring(1);
//          String refUnpaidCsh = 'A' + epr.getEprChmlnRefNo().substring(1);
//
//          // Check if it has been processed before
//          QueryFilter filter = new QueryFilter();
//          filter.add(FilterOp.EQUAL, SlcashmDMO.accountNoFilter, epr
//              .getEprCustomer());
//          filter.add(FilterOp.EQUAL, SlcashmDMO.itemFilter, refUnpaidCsh);
//          filter.add(FilterOp.BEGINSWITH, SlcashmDMO.refernceFilter, "DDEB UN");
//          if (base.slcashm().exists(filter)) {
//            continue;
//          }
//
//          filter = new QueryFilter();
//          filter.add(FilterOp.EQUAL, SlinvmDMO.customerFilter, epr
//              .getEprCustomer());
//          filter.add(FilterOp.EQUAL, SlinvmDMO.itemFilter, refUnpaidInv);
//          filter.add(FilterOp.BEGINSWITH, SlinvmDMO.refernceFilter, "ADMIN F");
//          if (base.slinvm().exists(filter)) {
//            continue;
//          }
//
//          filter = new QueryFilter();
//          filter.add(FilterOp.EQUAL, SlitemmDMO.customerFilter, epr
//              .getEprCustomer());
//          filter.add(FilterOp.EQUAL, SlitemmDMO.itemNoFilter, refUnpaidInv);
//          filter.add(FilterOp.BEGINSWITH, SlitemmDMO.refernceFilter, "ADMIN F");
//          if (base.slitemm().exists(filter)) {
//            continue;
//          }
//
//          customer = new SlcustmDMO();
//          customer.setCustomer(epr.getEprCustomer());
//          customer = base.slcustm().get(customer);
//
//          cshRevIns(epr, debitOrderType, customer);
//
//          invoiceAdmin(epr, debitOrderType, customer);
//        }
//
//        // ++++++++++++++++++++++++++++++++++++++++++++
//        // Remove payment plan installment if necessary
//        // ++++++++++++++++++++++++++++++++++++++++++++
//        if (epr.getEprOriginCode() == 2
//            && (epr.getEprStatus() == 2 || epr.getEprStatus() == 3)) {
//
//          QueryFilter filter = new QueryFilter();
//          filter.add(FilterOp.EQUAL, PpdPayPlanDetDMO.ppdCustomerFilter, epr
//              .getEprCustomer());
//          filter.add(FilterOp.EQUAL, PpdPayPlanDetDMO.ppdDueDateFilter, epr
//              .getEprActionDate());
//
//          base.ppdPayPlanDet().delete(filter);
//
//          // TODO: BaH : Catch errors and report?
//        }
//
//        // ++++++++++++++++++++++++++++++++++++++++++++
//        // create an action manager entry, if necessary
//        // ++++++++++++++++++++++++++++++++++++++++++++
//        // TODO: BaH : create an action manager entry
//        if (edr.getEdrActionId() != null) {
//
//          if ("C".equals(edr.getEdrTargetInd())) {
//
//            CcaCrdControllerDMO controller = null;
//
//            controller = base.ccaCrdController().getAccount(
//                epr.getEprCustomer());
//
//            // TODO: BaH: exception report if not found..
//
//            edr.setEdrTargetInd(controller.getCcaTargetType());
//            edr.setEdrTargetGroup(controller.getCcaTargetGroup());
//            edr.setEdrTargetUser(controller.getCcaTargetUser());
//          }
//
//          // create action manager note
//
//          String noteText = Format.format(
//              "%-s:%-8s-%-10d    %-s:%-.2f    %-s:%-s    %-s:%d=", messages
//                  .getMessage(100073), epr.getEprCustomer(), epr.getEprRefNo(),
//              messages.getMessage(180290), epr.getEprAmount(), edr
//                  .getEdrReasonCode(), edr.getEdrReasonDesc(), messages
//                  .getMessage(146268), epr.getEprOriginCode());
//
//          TtTypeTextDMO typeText = ttTexts.getText("DOEPRORIGN", String
//              .valueOf(epr.getEprOriginCode()));
//
//          noteText += typeText.getTtText().substring(0, 17);
//
//          if (!DMO.isNull(epr.getEprDepositRefNo())) {
//            noteText += messages.getMessage(199010).substring(0, 13) + " "
//                + epr.getEprDepositRefNo().substring(0, 8);
//          }
//
//          DateTime current = DateTime.add(DateTime.DAY, edr.getEdrDaysPerfmd(),
//              new DateTime());
//
//          base.actionManager().noteCreate(edr.getEdrActionId(), "O", current,
//              edr.getEdrTargetInd(), edr.getEdrTargetGroup(),
//              edr.getEdrTargetUser(), epr.getEprCustomer(), "", null, "", "",
//              "", "", noteText, "GSM", context.getBatchId());
//
//        }
//
//        if (edr.getEdrTransStatus() == 1) {
//
//          // +++++++++++++++++++
//          // deposits processing
//          // +++++++++++++++++++
//          if (!DMO.isNull(epr.getEprDepositRefNo())) {
//
//            if ("S".equals(epr.getEprDepositLevel())) {
//              // a Service Deposit
//
//              SdeServDepositDMO sde = new SdeServDepositDMO();
//              sde.setSdeDepositId(Integer.parseInt(epr.getEprDepositRefNo()));
//              // TODO: BaH : ignore errors
//              base.sdeServDeposit().get(sde);
//
//              sde.setSdeAmountPaid(sde.getSdeAmountDue());
//              sde.setSdeDepositStatus(1); // Paid
//              sde.setSdePayDate(new Date());
//
//              // update SDE
//              base.sdeServDeposit().modify(sde);
//
//              if ("N".equals(epr.getEprDepositUpdate())) {
//
//                base.deposits().commitServiceRequest(sde);
//
//              }
//
//            } else if ("C".equals(epr.getEprDepositLevel())) {
//              // A Customer Deposit
//
//              CdeCustDepositDMO cde = new CdeCustDepositDMO();
//              cde.setCdeDepositId(Integer.parseInt(epr.getEprDepositRefNo()));
//              // TODO: BaH : ignore errors (exception report)
//              base.cdeCustDeposit().get(cde);
//
//              cde.setCdeAmountPaid(cde.getCdeAmountDue());
//              cde.setCdeDepositStatus(1); // Paid
//              cde.setCdePayDate(new Date());
//
//              // update CDE
//              base.cdeCustDeposit().modify(cde);
//
//              if ("N".equals(epr.getEprDepositUpdate())) {
//
//                switch (cde.getCdePendingAction()) {
//                case 0: // Open Customer
//                  base.deposits().openCustomerRequest(cde.getCdeCustomerId());
//                  break;
//                case 1: // Credit Limit increase
//                  base.customer().creditLimitUpdateFromPending(
//                      cde.getCdeCustomerId());
//                  break;
//                }
//
//              }
//            } else {
//              // TODO: BaH : unkown deposit level error
//            }
//
//            // update EPR record noting updated deposit
//            epr.setEprDepositUpdate("Y");
//            base.eprEpxRepository().modify(epr);
//
//          }
//
//          // ++++++++++++++++
//          // Prepaid payments
//          // ++++++++++++++++
//          if ("PREPAID".equals(epr.getEprRetRefNo())) {
//
//            // create filter for retrieving PR records
//            QueryFilter filter = new QueryFilter();
//            filter.add(FilterOp.EQUAL, PrPrepaidRecurDMO.prCustomerFilter, epr
//                .getEprCustomer());
//            filter.add(FilterOp.EQUAL, PrPrepaidRecurDMO.prRefNoFilter, epr
//                .getEprRefNo());
//            filter.add(FilterOp.EQUAL, PrPrepaidRecurDMO.prDoProcessIndFilter,
//                0);
//
//            // retrieve matching PR records
//            DAOIterator i = base.prPrepaidRecur().iterate(filter);
//
//            while (i.hasNext()) {
//              PrPrepaidRecurDMO pr = (PrPrepaidRecurDMO) i.next();
//
//              // Insert record into pp_prepaid_payment
//              base.ppPrepaidPayment().create(
//                  new PpPrepaidPaymentDMO(0, pr.getPrSubscriberId(), null,
//                      null, "0", pr.getPrAmount(), (short) 0, null, null));
//
//              // Update recuring record to show that the direct debit
//              // has been processed
//              pr.setPrDoProcessInd(1);
//              base.prPrepaidRecur().modify(pr);
//
//            }
//
//            // close the iterator
//            i.close();
//
//          }
//        }
//
//        // increment successful processing of entry
//        context.setQtySucceeded(context.getQtySucceeded() + 1);
//      }
//    } else {
//      // TODO: BaH : throw some kind of error
//    }
//
//    return context;
//  }
//
//  /**
//   * Creates a new slinvm record for the given epd, edt and slcustm.
//   * 
//   * @param epr
//   * @param edt
//   * @param customer
//   * @throws EPPIXBusinessException
//   * @throws EPPIXUnexpectedException
//   * @throws EPPIXFatalException
//   */
//  private void invoiceAdmin(EprEpxRepositoryDMO epr, EdtDbtordrTypeDMO edt,
//      SlcustmDMO customer) throws EPPIXBusinessException,
//      EPPIXUnexpectedException, EPPIXFatalException {
//
//    // Insert Invoice Item for Admin Charge
//
//    SalesLedgerInvoiceDFO invoice = new SalesLedgerInvoiceDFO();
//
//    invoice.setBatch(invoiceBatchRef);
//    invoice.setCustomer(epr.getEprCustomer());
//    invoice
//        .setItem(Format.format("A%-8s", epr.getEprChmlnRefNo().substring(1)));
//
//    invoice.setPageNo("/001");
//    invoice.setRefernce("ADMIN F" + epr.getEprErrorCode());
//    invoice.setDated(new Date());
//    invoice.setDueDate(new Date());
//    invoice.setName(customer.getName());
//    invoice.setAlpha(customer.getAlpha());
//
//    invoice.setExchangeRate(0);
//    invoice.setTotalAmount(salesOrderService.getListPrice());
//    invoice.setTotalLocalAmt(salesOrderService.getListPrice());
//    invoice.setTotalVat(invoiceVATAmount);
//
//    invoice.setNominalCodes01(keySLNLCONTRL);
//    invoice.setNominalCodes02(generalVat.getControlAcct());
//
//    invoice.setDescription01(costOfSales.getDescription());
//    invoice.setDescription02(generalVat.getDescription());
//
//    invoice.setCurrencyAmounts01(salesOrderService.getListPrice());
//    invoice.setCurrencyAmounts02(invoiceVATAmount);
//    invoice.setCurrencyAmounts03(0);
//    invoice.setCurrencyAmounts04(0);
//    invoice.setCurrencyAmounts05(0);
//    invoice.setCurrencyAmounts06(0);
//    invoice.setCurrencyAmounts07(0);
//    invoice.setCurrencyAmounts08(0);
//    invoice.setCurrencyAmounts09(0);
//    invoice.setCurrencyAmounts10(0);
//
//    invoice.setLocalAmounts01(salesOrderService.getListPrice());
//    invoice.setLocalAmounts02(invoiceVATAmount);
//    invoice.setLocalAmounts03(0);
//    invoice.setLocalAmounts04(0);
//    invoice.setLocalAmounts05(0);
//    invoice.setLocalAmounts06(0);
//    invoice.setLocalAmounts07(0);
//    invoice.setLocalAmounts08(0);
//    invoice.setLocalAmounts09(0);
//    invoice.setLocalAmounts10(0);
//
//    invoice.setDiscountValue(0);
//
//    invoice.setPostingInd("N");
//
//    invoice.setUsername(loginName());
//    invoice.setUserdate(new Date());
//    invoice.setUsertime(new Time().toString());
//
//    invoice.setGoodsVatInd01("G");
//    invoice.setGoodsVatInd02("V");
//
//    invoice.setTaxCodes01(salesOrderService.getVatType());
//    invoice.setTaxCodes02(salesOrderService.getVatType());
//
//    invoice.setEffectiveDate(new Date());
//    invoice.setPeriod(keySLPERIOD);
//    invoice.setSlyear(keySLYEAR);
//
//    base.finance().salesLedgerInvoice().create(invoice);
//
//  }
//
//  /**
//   * Creates a new slcashm record for the given epr, edt and slcustm.
//   * 
//   * @param epr
//   * @param edt
//   * @param customer
//   * @throws EPPIXBusinessException
//   * @throws EPPIXUnexpectedException
//   * @throws EPPIXFatalException
//   */
//  private void cshRevIns(EprEpxRepositoryDMO epr, EdtDbtordrTypeDMO edt,
//      SlcustmDMO customer) throws EPPIXBusinessException,
//      EPPIXUnexpectedException, EPPIXFatalException {
//
//    SlcashmDMO cash = new SlcashmDMO();
//
//    cash.setBatch(cashBatchRef);
//    cash.setAccountNo(customer.getCustomer());
//    cash.setItem(Format.format("R%-8s", epr.getEprChmlnRefNo().substring(1)));
//    cash.setPageNo("/001");
//    cash.setDated(new Date());
//    cash.setBank(Format.format("%-2s", keyASUNPBANK));
//    cash.setName(customer.getName());
//    cash.setAlpha(customer.getAlpha());
//    cash.setCurrency(customer.getCurrency());
//    cash.setRefernce(Format.format("DDEB UN%-3s", epr.getEprErrorCode()));
//    cash.setOpenIndicator(" ");
//    cash.setAmount(epr.getEprAmount().multiply(BigDecimal.valueOf(-1)));
//    cash.setCurrencyAmount(0);
//    cash.setUnallAmount(epr.getEprAmount().multiply(BigDecimal.valueOf(-1)));
//    cash.setUnallCurrAmt(0);
//    cash.setDiscountTaken(0);
//    cash.setExchangeRate(0);
//    cash.setExchangeRate(1);
//
//    //		cash.setItemNumbers01("");
//    //		cash.setItemNumbers02("");
//    //		cash.setItemNumbers03("");
//    //		cash.setItemNumbers04("");
//    //		cash.setItemNumbers05("");
//    //		cash.setItemNumbers06("");
//    //		cash.setItemNumbers07("");
//    //		cash.setItemNumbers08("");
//    //		cash.setItemNumbers09("");
//    //		cash.setItemNumbers10("");
//    //		cash.setItemNumbers11("");
//    //		cash.setItemNumbers12("");
//    //		cash.setItemNumbers13("");
//    //		cash.setItemNumbers14("");
//    //		cash.setItemNumbers15("");
//    //		cash.setItemNumbers16("");
//    //		cash.setItemNumbers17("");
//    //		cash.setItemNumbers18("");
//    //		cash.setItemNumbers19("");
//    //		cash.setItemNumbers20("");
//    //		cash.setItemNumbers21("");
//    //		cash.setItemNumbers22("");
//    //		cash.setItemNumbers23("");
//    //		cash.setItemNumbers24("");
//    //		cash.setItemNumbers25("");
//    //		cash.setItemNumbers26("");
//    //		cash.setItemNumbers27("");
//    //		cash.setItemNumbers28("");
//    //		cash.setItemNumbers29("");
//    //		cash.setItemNumbers30("");
//    //		cash.setItemNumbers31("");
//
//    cash.setItemAmounts01(0);
//    cash.setItemAmounts02(0);
//    cash.setItemAmounts03(0);
//    cash.setItemAmounts04(0);
//    cash.setItemAmounts05(0);
//    cash.setItemAmounts06(0);
//    cash.setItemAmounts07(0);
//    cash.setItemAmounts08(0);
//    cash.setItemAmounts09(0);
//    cash.setItemAmounts10(0);
//    cash.setItemAmounts11(0);
//    cash.setItemAmounts12(0);
//    cash.setItemAmounts13(0);
//    cash.setItemAmounts14(0);
//    cash.setItemAmounts15(0);
//    cash.setItemAmounts16(0);
//    cash.setItemAmounts17(0);
//    cash.setItemAmounts18(0);
//    cash.setItemAmounts19(0);
//    cash.setItemAmounts20(0);
//    cash.setItemAmounts21(0);
//    cash.setItemAmounts22(0);
//    cash.setItemAmounts23(0);
//    cash.setItemAmounts24(0);
//    cash.setItemAmounts25(0);
//    cash.setItemAmounts26(0);
//    cash.setItemAmounts27(0);
//    cash.setItemAmounts28(0);
//    cash.setItemAmounts29(0);
//    cash.setItemAmounts30(0);
//    cash.setItemAmounts31(0);
//
//    cash.setDiscTakenInd01("n");
//    cash.setDiscTakenInd02("n");
//    cash.setDiscTakenInd03("n");
//    cash.setDiscTakenInd04("n");
//    cash.setDiscTakenInd05("n");
//    cash.setDiscTakenInd06("n");
//    cash.setDiscTakenInd07("n");
//    cash.setDiscTakenInd08("n");
//    cash.setDiscTakenInd09("n");
//    cash.setDiscTakenInd10("n");
//    cash.setDiscTakenInd11("n");
//    cash.setDiscTakenInd12("n");
//    cash.setDiscTakenInd13("n");
//    cash.setDiscTakenInd14("n");
//    cash.setDiscTakenInd15("n");
//    cash.setDiscTakenInd16("n");
//    cash.setDiscTakenInd17("n");
//    cash.setDiscTakenInd18("n");
//    cash.setDiscTakenInd19("n");
//    cash.setDiscTakenInd20("n");
//    cash.setDiscTakenInd21("n");
//    cash.setDiscTakenInd22("n");
//    cash.setDiscTakenInd23("n");
//    cash.setDiscTakenInd24("n");
//    cash.setDiscTakenInd25("n");
//    cash.setDiscTakenInd26("n");
//    cash.setDiscTakenInd27("n");
//    cash.setDiscTakenInd28("n");
//    cash.setDiscTakenInd29("n");
//    cash.setDiscTakenInd30("n");
//    cash.setDiscTakenInd31("n");
//
//    cash.setPostingInd("N");
//    //		cash.setAnalysisCodes1("");
//    //		cash.setAnalysisCodes2("");
//    //		cash.setAnalysisCodes3("");
//
//    cash.setUsername(loginName());
//    cash.setUserdate(new Date());
//    cash.setUsertime(new Time().toString());
//
//    //		cash.setDirectDebit("");
//    cash.setEffectiveDate(new Date());
//    cash.setPeriod(keySLPERIOD);
//    cash.setSlyear(keySLYEAR);
//    cash.setControl(" ");
//
//    // insert the slcash record.
//    base.slcashm().create(cash);
//
//  }
//
//  private class ExceptReport extends Report {
//
//    public ExceptReport(String filename, int pageLength, Object[] headerArgs) {
//      super(filename, pageLength, headerArgs);
//
//    }
//
//    @Override
//    public void print(Object... args) {
//      super.print(args);
//
//    }
//
//    @Override
//    public void header() {
//
//    }
//
//  }
}
