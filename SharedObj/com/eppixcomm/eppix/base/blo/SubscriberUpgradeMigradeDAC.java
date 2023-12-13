package com.eppixcomm.eppix.base.blo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;

import com.eppixcomm.eppix.base.blo.AsrAddServReqDMO;
import com.eppixcomm.eppix.base.blo.AudAddressDMO;
import com.eppixcomm.eppix.base.blo.AuxCustomersDMO;
import com.eppixcomm.eppix.base.blo.BlhBillLimitHdDMO;
import com.eppixcomm.eppix.base.blo.DealersDMO;
import com.eppixcomm.eppix.base.blo.DpfDefPocFolderDMO;
import com.eppixcomm.eppix.base.blo.EapEpxactionPendDMO;
import com.eppixcomm.eppix.base.blo.NgsNetGroupServDMO;
import com.eppixcomm.eppix.base.blo.NmNetmatDMO;
import com.eppixcomm.eppix.base.blo.SbaSubAuxDMO;
import com.eppixcomm.eppix.base.blo.SbdSubDetsDMO;
import com.eppixcomm.eppix.base.blo.SbhdSplitBillHdDMO;
import com.eppixcomm.eppix.base.blo.SbuSubUpgradeDMO;
import com.eppixcomm.eppix.base.blo.SdeServDepositDMO;
import com.eppixcomm.eppix.base.blo.SdrServDepoRuleDMO;
import com.eppixcomm.eppix.base.blo.SpvParamValuesDMO;
import com.eppixcomm.eppix.base.blo.TsTariffServiceDMO;
import com.eppixcomm.eppix.base.blo.TtTypeTextDMO;
import com.eppixcomm.eppix.base.blo.VamActiveMsisdnDMO;
import com.eppixcomm.eppix.base.blo.VasActiveServiceDMO;
import com.eppixcomm.eppix.base.blo.VsrServiceDMO;
import com.eppixcomm.eppix.base.error.EPPIXObjectNotFoundException;
import com.eppixcomm.eppix.base.error.EPPIXSeriousException;
import com.eppixcomm.eppix.common.data.DAOIterator;
import com.eppixcomm.eppix.common.data.IntegerDMO;
import com.eppixcomm.eppix.common.data.StringDMO;
import com.eppixcomm.eppix.common.util.Date;
import com.eppixcomm.eppix.common.util.DateTime;
import com.eppixcomm.eppix.soa.sharedservices.blo.AcnActionDMO;
import com.eppixcomm.eppix.soa.sharedservices.blo.AcvAccCrmValueDMO;
import com.eppixcomm.eppix.soa.sharedservices.blo.ApdApnPopDetsDMO;
import com.eppixcomm.eppix.soa.sharedservices.blo.AuxEncryptedDMO;
import com.eppixcomm.eppix.soa.sharedservices.blo.AuxSlcustmDQO;
import com.eppixcomm.eppix.soa.sharedservices.blo.CmCycleMigrationDMO;
import com.eppixcomm.eppix.soa.sharedservices.blo.CpoCplanOpenDMO;
import com.eppixcomm.eppix.soa.sharedservices.blo.CviCrmValueIndDMO;
import com.eppixcomm.eppix.soa.sharedservices.blo.CycleDMO;
import com.eppixcomm.eppix.soa.sharedservices.blo.DcmDualcallMapDMO;
import com.eppixcomm.eppix.soa.sharedservices.blo.DshDiscHistoryDMO;
import com.eppixcomm.eppix.soa.sharedservices.blo.DsvDgtlServVchDMO;
import com.eppixcomm.eppix.soa.sharedservices.blo.EdEventDelayDMO;
import com.eppixcomm.eppix.soa.sharedservices.blo.EhEppixHierarchyDMO;
import com.eppixcomm.eppix.soa.sharedservices.blo.EhHhDQO;
import com.eppixcomm.eppix.soa.sharedservices.blo.EppEbuPromoPriceDMO;
import com.eppixcomm.eppix.soa.sharedservices.blo.FfhFamfrndHeadDMO;
import com.eppixcomm.eppix.soa.sharedservices.blo.HtHierarchyTypeDMO;
import com.eppixcomm.eppix.soa.sharedservices.blo.IatInsTrackDMO;
import com.eppixcomm.eppix.soa.sharedservices.blo.InxInvoiceXrefDMO;
import com.eppixcomm.eppix.soa.sharedservices.blo.MchMigrChrgeHdrDMO;
import com.eppixcomm.eppix.soa.sharedservices.blo.MmcMigCntrlDMO;
import com.eppixcomm.eppix.soa.sharedservices.blo.MwiMwInterfaceDMO;
import com.eppixcomm.eppix.soa.sharedservices.blo.N2NSubDetailsDQO;
import com.eppixcomm.eppix.soa.sharedservices.blo.PcPartnerConfigDMO;
import com.eppixcomm.eppix.soa.sharedservices.blo.PcPartnerCyclesDMO;
import com.eppixcomm.eppix.soa.sharedservices.blo.PcPgPsDQO;
import com.eppixcomm.eppix.soa.sharedservices.blo.PiPartnerInfoDMO;
import com.eppixcomm.eppix.soa.sharedservices.blo.PicPrtnrInstCdeDMO;
import com.eppixcomm.eppix.soa.sharedservices.blo.PpcPttProdCfgDQO;
import com.eppixcomm.eppix.soa.sharedservices.blo.PphPayPlanHdrDMO;
import com.eppixcomm.eppix.soa.sharedservices.blo.PsPartnerServiceDMO;
import com.eppixcomm.eppix.soa.sharedservices.blo.PsmPrstgSrvMtrxDMO;
import com.eppixcomm.eppix.soa.sharedservices.blo.SbbSubBenefitDMO;
import com.eppixcomm.eppix.soa.sharedservices.blo.SbdsbaDQO;
import com.eppixcomm.eppix.soa.sharedservices.blo.SbeSubEquipHistDMO;
import com.eppixcomm.eppix.soa.sharedservices.blo.SbpSubPartnerDMO;
import com.eppixcomm.eppix.soa.sharedservices.blo.SbtSplitBillDetDMO;
import com.eppixcomm.eppix.soa.sharedservices.blo.ScSerialCustomerDMO;
import com.eppixcomm.eppix.soa.sharedservices.blo.ScvSubCrmValueDMO;
import com.eppixcomm.eppix.soa.sharedservices.blo.SdiDipDirDibChgDQO;
import com.eppixcomm.eppix.soa.sharedservices.blo.SdiSubsDiscountDMO;
import com.eppixcomm.eppix.soa.sharedservices.blo.SlpSalespersonDMO;
import com.eppixcomm.eppix.soa.sharedservices.blo.SpcSpvPshPsdDQO;
import com.eppixcomm.eppix.soa.sharedservices.blo.SptServParaTarDMO;
import com.eppixcomm.eppix.soa.sharedservices.blo.SriServRightDMO;
import com.eppixcomm.eppix.soa.sharedservices.blo.TdTelemtryDeviceDMO;
import com.eppixcomm.eppix.soa.sharedservices.blo.TmpN2NServicesDQO;
import com.eppixcomm.eppix.soa.sharedservices.blo.TpdTextPadDMO;
import com.eppixcomm.eppix.soa.sharedservices.blo.TrgTargetGroupDMO;
import com.eppixcomm.eppix.soa.sharedservices.blo.UdvUserdocDelivDMO;
import com.eppixcomm.eppix.soa.sharedservices.blo.UhrUserHierarchyDMO;
import com.eppixcomm.eppix.soa.sharedservices.blo.UsUserDefDMO;
import com.eppixcomm.eppix.soa.sharedservices.blo.UutUserRightDMO;
import com.eppixcomm.eppix.soa.sharedservices.blo.VasVamDQO;
import com.eppixcomm.eppix.soa.sharedservices.blo.VasVamVsmSubSimDQO;
import com.eppixcomm.eppix.soa.sharedservices.blo.VpsVsrVstDQO;
import com.eppixcomm.eppix.base.utils.TmpPrmsLinksServC;

public interface SubscriberUpgradeMigradeDAC {
	
	public TsTariffServiceDMO getTsTariffService(String packageCode,
			String serviceCode, String tariffPlan)
			throws EPPIXObjectNotFoundException, EPPIXSeriousException;

	public VamActiveMsisdnDMO getVamSimService(String simNo, String serviceCode)
			throws EPPIXSeriousException;

	public DAOIterator getSbhdIterator(Integer subscriberId, String serviceCode)
			throws EPPIXSeriousException;

	public DAOIterator getSplitBillHeaderIterator(Integer subscriberId)
			throws EPPIXSeriousException;

	public void updateSplitBillHeader(String childAcNo, String childMsisdn,
			String parentAcNo, String parentMsisdn, Date actDate,
			Date deactDate, String status, Integer sbhdSbId)
			throws EPPIXSeriousException;

	public SbhdSplitBillHdDMO getSplitBillHeaderByParentAc(
			Integer subscriberId, String parentAcNo)
			throws EPPIXSeriousException;

	public void insertSbhd(SbhdSplitBillHdDMO sbhdDmo)
			throws EPPIXSeriousException;

	public void updateSbtEndDate() throws EPPIXSeriousException;

	public void insertSbtDetails(SbtSplitBillDetDMO sbtDMo)
			throws EPPIXSeriousException;

	public VasActiveServiceDMO getVasBillLimitByMsisdnTariff(
			String serviceCode, String msisdn, String tariff)
			throws EPPIXSeriousException;

	public VsrServiceDMO getServiceByDealer(String serviceCode, String dealerId)
			throws EPPIXSeriousException;

	public IntegerDMO getMAXSbuSbeNotUpgradeStatusC(Integer supId)
			throws EPPIXSeriousException;

	public AcnActionDMO getAcnAction(String actionType, String actionRsn)
			throws EPPIXSeriousException;

	public DealersDMO getDealrsAct(String dealerId)
			throws EPPIXSeriousException;

	public IntegerDMO getMAXSbuSbe(Integer supId) throws EPPIXSeriousException;

	public SlpSalespersonDMO getSalePersonAct(String salesId, String dealerId)
			throws EPPIXSeriousException;

	public SlpSalespersonDMO getSalePersonAll(String salesId, String dealerId)
			throws EPPIXSeriousException;

	public VamActiveMsisdnDMO getVamMinMSISDNByStatus(String simNo,
			String statusCode) throws EPPIXSeriousException;

	public VamActiveMsisdnDMO getVamMinMSISDNNoStatus(String simNo)
			throws EPPIXSeriousException;

	public IntegerDMO serviceExistsOnSim(String simNo, String serviceCode)
			throws EPPIXSeriousException;

	public PcPartnerConfigDMO getPcBenefit(String benefitType,
			String benefitCode) throws EPPIXSeriousException;

	public IntegerDMO paramServiceCheck(Integer subscriberId,
			String serviceCode, String simNo) throws EPPIXSeriousException;

	public DAOIterator iterateSimDeact(Integer subscriberId, String simNo,
			String serviceCode) throws EPPIXSeriousException;

	public void deleteEfgFuturQueue(String command)
			throws EPPIXSeriousException;

	public DAOIterator iteratePrimaryMsisdns(Integer subscriberId,
			String msisdnNo) throws EPPIXSeriousException;

	public SdrServDepoRuleDMO getSdrForServicePackageVersion(
			String serviceCode, String packageCode)
			throws EPPIXSeriousException;

	public DAOIterator iterateSdeSubSimServ(Integer subscriberId, String simNo,
			String serviceCode, String status) throws EPPIXSeriousException;

	public DAOIterator iterateSdeSubServSimMsisdnPackage(Integer subscriberId,
			String packageCode, String serviceCode, String simNo, String msisdn)
			throws EPPIXSeriousException;

	public void updateDiqDiscountQual(Integer diqQualId)
			throws EPPIXSeriousException;

	public void insertDshDiscHistory(DshDiscHistoryDMO dshBlo)
			throws EPPIXSeriousException;

	public SdiDipDirDibChgDQO getSdiDipDirDibChgByStartDate(Integer subDiscId,
			Date prorataDate) throws EPPIXSeriousException;

	public SdiDipDirDibChgDQO getSdiDipDirDibChgByEndDate(Integer subDiscId,
			Date prorataDate) throws EPPIXSeriousException;

	public SdiSubsDiscountDMO getSdiBySubscriberDiscEndDate(
			Integer subscriberId, Integer discountId, Date startDate)
			throws EPPIXSeriousException;

	public void terminateSubscriberDiscount(Integer subscriberId,
			Integer qualId, Integer discountId) throws EPPIXSeriousException;

	public DAOIterator getSbeSubEquipBySubscriber(Integer subscriberId)
			throws EPPIXSeriousException;
	
	public SbeSubEquipDMO getSbeEquipBySubscriber(Integer subscriberId)
			throws EPPIXSeriousException;

	public IntegerDMO getHhHierarchyHead(Integer serial)
			throws EPPIXSeriousException;

	public IntegerDMO getCountEppixHierarchyByEntityId(Integer entityId)
			throws EPPIXSeriousException;

	public IntegerDMO getCountVsrSdiByTTGroup(Integer subscriberId, Date endDate)
			throws EPPIXSeriousException;

	public ScSerialCustomerDMO getSerialCustomer(String billAccount)
			throws EPPIXSeriousException;

	public void insSubEquipHistory(SbeSubEquipHistDMO sbeSubEquipHistDMO)
			throws EPPIXSeriousException;

	public void delSbeSubEquipByEquipId(Integer equipId)
			throws EPPIXSeriousException;

	public AcnActionDMO getAcnSerial(Integer actionSerial)
			throws EPPIXSeriousException;

	public UsUserDefDMO getUsUserDef(String login) throws EPPIXSeriousException;

	public IntegerDMO checkAcnMgrUser(Integer actionSerail, String login)
			throws EPPIXSeriousException;

	public IntegerDMO checkAcnMrgTargetGroup(Integer actionSerial, Integer group)
			throws EPPIXSeriousException;

	public UhrUserHierarchyDMO getUhrUserHierarchy(Integer login)
			throws EPPIXSeriousException;

	public TrgTargetGroupDMO getTrgTargetGroupByGrpName(String groupName)
			throws EPPIXSeriousException;

	public TrgTargetGroupDMO getTrgTargetGroupBySerial(Integer groupSerial)
			throws EPPIXSeriousException;

	public InxInvoiceXrefDMO getInxInvoiceXREF(String invoiceNo)
			throws EPPIXSeriousException;

	public void insertTpdTextPad(TpdTextPadDMO tpdDMO)
			throws EPPIXSeriousException;

	public void updateTpdTextPad(short blockAttr, String blockText,
			Integer ownerSerial, String type, short pageNo, short blockNo)
			throws EPPIXSeriousException;

	public SbdsbaDQO getSbdSba(Integer subscriberId)
			throws EPPIXSeriousException;

	public TpdTextPadDMO getTpdTextPad(Integer tpdSerial, String tpdType,
			int tpdPageNo, int tpdBlockNo) throws EPPIXSeriousException;

	public AuxEncryptedDMO getAuxCustEncrypted(String encrpKey1,
			String encrpKey2, String encrpKey3, String encrpKey4,
			String encrpKey5, String billAcNo) throws EPPIXSeriousException;

	public IntegerDMO getMaxTpdBlock(Integer tpdSerial, String tpdType,
			int tpdPageNo) throws EPPIXSeriousException;

	public StringDMO getAuxEncryptKey(String billAcNo)
			throws EPPIXSeriousException;

	public MmcMigCntrlDMO getMmcMigCntrl(String migrateType,
			String migrateFrom, String migrateTo) throws EPPIXSeriousException;

	public VamActiveMsisdnDMO getVamBySbd(Integer subscriberID, String msisdnNo)
			throws EPPIXSeriousException;

	public IntegerDMO getPartnerTarExists(String packageCode, String oldTariff,
			String newTariff) throws EPPIXSeriousException;

	public void delSbpPartner(Integer partnerId, Integer benefitId)
			throws EPPIXSeriousException;

	public IntegerDMO verifyServiceTypeExistsOnSim(String simNo,
			String serviceType) throws EPPIXSeriousException;

	public TsTariffServiceDMO getTsBenefit(Integer partnerId,
			String memberStatus, String packageCode, String tariffPlan)
			throws EPPIXSeriousException;

	public PcPgPsDQO getPcPgPs(Integer partnerId, String memberStatus,
			String packageCode, String tariffPlan, String serviceCode)
			throws EPPIXSeriousException;

	public void createEdEventDelay(EdEventDelayDMO edDMO)
			throws EPPIXSeriousException;

	public SptServParaTarDMO getSptServParamTar(Integer paramId,
			String tariffCode, String packageCode) throws EPPIXSeriousException;

	public IntegerDMO getPsdActiveCount(Integer subscriberId, String serviceCode)
			throws EPPIXSeriousException;

	public ScvSubCrmValueDMO getScv(Integer subscriberId)
			throws EPPIXSeriousException;

	public DAOIterator getVsmUniqueServiceCodeBySubsciber(Integer subscriberId)
			throws EPPIXSeriousException;

	public DAOIterator getEppixHierarchyByTypeSubscriber(Integer ehIdentity)
			throws EPPIXSeriousException;

	public DAOIterator getEppixHierarchyByType(Integer ehIdentity, String type,
			String hierType) throws EPPIXSeriousException;

	public EhEppixHierarchyDMO getEppixHierarchyBySerial(Integer ehSerial)
			throws EPPIXSeriousException;

	public PcPartnerConfigDMO getPcPartnerConfigbyStatusCodeAndTariff(
			String memberStatus, String packageCode, String tariff)
			throws EPPIXSeriousException;

	public IntegerDMO getPiSbpPartnerExists(Integer subscriberId)
			throws EPPIXSeriousException;

	public PiPartnerInfoDMO getPiPartnerByAgreementCode(String agreementCode)
			throws EPPIXSeriousException;

	public DAOIterator getSbbListBySubIdAndPartnerId(Integer subscriberId,
			Integer partnerId) throws EPPIXSeriousException;

	public DAOIterator getSbbListBySubId(Integer subscriberId)
			throws EPPIXSeriousException;

	public PcPartnerConfigDMO getPcPartnerConfigbyPackageCodeAndTariff(
			String packageCode, String tariff) throws EPPIXSeriousException;

	public PcPartnerConfigDMO getPcPartnerConfigbyPackageCode(String packageCode)
			throws EPPIXSeriousException;

	public PpcPttProdCfgDQO getPPCProduct(String product)
			throws EPPIXSeriousException;

	public AuxCustomersDMO getAuxSbd(Integer subscriberId)
			throws EPPIXSeriousException;

	public NmNetmatDMO getNmMsisdnVam(String msisdn)
			throws EPPIXSeriousException;

	public DAOIterator getImsiRestriction(Integer subscriberId, String simNo)
			throws EPPIXSeriousException;

	public DAOIterator getImsiCategory(Integer subscriberId, String simNo)
			throws EPPIXSeriousException;

	public void delEdEventDelay(Integer partnerId, Integer subscriber,
			String simNo, String msisdnNo) throws EPPIXSeriousException;

	public void delEdEventDelayOnActionCode(Integer partnerId,
			Integer subscriber, String simNo, String msisdnNo, String actionCode)
			throws EPPIXSeriousException;

	public StringDMO getVatRateByAccount(String accountVatType,
			String itemVatType) throws EPPIXSeriousException;

	public StringDMO getVatRateByCode(String vatCode)
			throws EPPIXSeriousException;

	public StringDMO getVatPercentageByCode(String vatCode)
			throws EPPIXSeriousException;

	public StringDMO getchgNcode(String chgNCode) throws EPPIXSeriousException;

	public void updateSbpSubPartner(String benefitStatus, String memberStatus,
			String authCode, Integer configId, String tariffPlan,
			Integer subscriberId, Integer partnerId)
			throws EPPIXSeriousException;

	public void updatePsdParametersForPshPsdSerial(Integer pshSubscriberId,
			String pshServiceCode, Integer psdSerialId)
			throws EPPIXSeriousException;

	public DAOIterator iteratePsdParametersForPshPsdSerial(
			Integer pshSubscriberId, String pshServiceCode, Integer psdSerialId)
			throws EPPIXSeriousException;

	public SbpSubPartnerDMO getSbpByPartnerIdAndSubscriberId(Integer partnerId,
			Integer subscriberId) throws EPPIXSeriousException;

	public StringDMO getSbdBillCycle(String billAccNo, String cycleType)
			throws EPPIXSeriousException;

	public StringDMO getPcBillCycle(Integer partnerId, String cycleType,
			String cycleStatus) throws EPPIXSeriousException;

	public void updateEapEpxactionPend(String billAcNo, Integer subscriberId)
			throws EPPIXSeriousException;

	public CycleDMO getCycle(String billCycle) throws EPPIXSeriousException;

	public CycleDMO getCycleByDate(String billCycle, Date date)
			throws EPPIXSeriousException;

	public PcPartnerCyclesDMO getPcPartnerCycleByPartnerId(Integer partnerID,
			String billCycle) throws EPPIXSeriousException;

	public PcPartnerCyclesDMO getPcPartnerCycle(String billCycle)
			throws EPPIXSeriousException;

	public CmCycleMigrationDMO getCmBySubscriberId(Integer subscriberId)
			throws EPPIXSeriousException;

	public DAOIterator getSbdCustListByCustId(String customerId)
			throws EPPIXSeriousException;

	public DAOIterator getCustActSubListByBillAcNo(String billAcNo)
			throws EPPIXSeriousException;

	public DAOIterator getCustActSubListByBillAcNoAndMsisdn(String billAcNo,
			String msisdnNo) throws EPPIXSeriousException;

	public DAOIterator getCrRulelList() throws EPPIXSeriousException;

	public DAOIterator getCrRulelListByRuleId(Integer ruleId)
			throws EPPIXSeriousException;

	public IntegerDMO getCountSbpStatus(String billAcNo, String benefitStatus)
			throws EPPIXSeriousException;

	public ApdApnPopDetsDMO getApdApnPopDets(String msisdn)
			throws EPPIXSeriousException;

	public ApdApnPopDetsDMO getApdApnPopDetsByInvoiceNo(String msisdn,
			String invNo) throws EPPIXSeriousException;

	public PphPayPlanHdrDMO getPph(String accountNo)
			throws EPPIXSeriousException;

	public DAOIterator getCmList(Integer subscriberId)
			throws EPPIXSeriousException;

	public DAOIterator getVasVamVsmSubSimlist(Integer subscriberId, String simNo)
			throws EPPIXSeriousException;

	public StringDMO getMaxEfgCommand(String searchDate)
			throws EPPIXSeriousException;

	public CpoCplanOpenDMO getCpo(String billAcNo, Integer status)
			throws EPPIXSeriousException;

	public NgsNetGroupServDMO getNetServcodePackservtariff(String packageCode,
			String serviceCode, String internTariff)
			throws EPPIXSeriousException;

	public DAOIterator getMsisdnBasicServiceSimVamVsmList(String simNo)
			throws EPPIXSeriousException;

	public SbdSubDetsDMO getSbdSim(String simNo) throws EPPIXSeriousException;

	public StringDMO getNgsNetServCode(String code, String networkId)
			throws EPPIXSeriousException;

	public void modifyEiAsA(String billCycle) throws EPPIXSeriousException;

	public void modifyEiAsD(String billCycle) throws EPPIXSeriousException;

	public void insertCm(Integer subscriberId, Date date, String status,
			String oldCycle, String newCycle, String oldBillAcNo,
			String newBillAcNo, Date timestamp) throws EPPIXSeriousException;

	public void updateCm(Integer subscriberId, String oldBillCycle,
			String newBillCycle, String newStatus, Date timestamp)
			throws EPPIXSeriousException;

	public void updateApd(ApdApnPopDetsDMO apdDMO) throws EPPIXSeriousException;

	public IntegerDMO getCountSbdSubDetsByBillAcNo(String billAcNo)
			throws EPPIXSeriousException;

	public DAOIterator getVsrVasVamVsmList(String simNo)
			throws EPPIXSeriousException;

	public void creatSbbSubBenefit(Integer partnerId, Integer benefitId)
			throws EPPIXSeriousException;

	public IntegerDMO countSmc(Integer subscriberId, String countFLag,
			Date expiryDate) throws EPPIXSeriousException;

	public DAOIterator getSubServices(Integer subscriberId, String tariff)
			throws EPPIXSeriousException;

	public VpsVsrVstDQO getVpsVsrVstServices(String serviceCode,
			String packageCode) throws EPPIXSeriousException;

	public TsTariffServiceDMO getServiceRecord(String serviceCode,
			String packageCode, String tariff) throws EPPIXSeriousException;

	public DAOIterator getSbpBySubscriberId(Integer subscriberId,
			String benefitStatus) throws EPPIXSeriousException;

	public DAOIterator getServRule(String serviceCode, String packageCode,
			String tariff, String serviceType) throws EPPIXSeriousException;

	public IntegerDMO validateTsPackageTariff(String packageCode, String tariff)
			throws EPPIXSeriousException;

	public void updateVasChg123(String subCharge1, String subCharge2,
			String subCharge3, Integer subscriberId, String serviceCode,
			String tariff) throws EPPIXSeriousException;

	public DAOIterator getFflList(Integer subscriberId, String simNo,
			String serviceCode) throws EPPIXSeriousException;

	public void updateFamilyFriendsTermDt(Date termDt, Integer subscriberId,
			String simNo, String serviceCode) throws EPPIXSeriousException;

	public SdeServDepositDMO getSdeSimByPackage(Integer subscriberId,
			String packagedCode, String serviceCode, String simNo,
			String msisdnNo) throws EPPIXSeriousException;

	public SpvParamValuesDMO getSpvParamValue(Integer paramId, String paramValue)
			throws EPPIXSeriousException;

	public DAOIterator getPrstServices() throws EPPIXSeriousException;

	public CviCrmValueIndDMO getCvi(String crmValue)
			throws EPPIXSeriousException;

	public AcvAccCrmValueDMO getAcv(String billAccount)
			throws EPPIXSeriousException;

	public void updateAcvAccCrmValue(String crmValue, String type,
			String billAccount) throws EPPIXSeriousException;

	public void insertScvSubCrmValue(Integer subscriberId, String crmValue,
			String type) throws EPPIXSeriousException;

	public void updateScvSubCrmValueScvType(String value, String type,
			Integer subscriberId) throws EPPIXSeriousException;

	public void updateScvSubCrmValue(String value, Integer subscriberId)
			throws EPPIXSeriousException;

	public void insertScvSubHistory(Integer scvSubscriberId,
			String scvCrmOldValue, String scvCrmNewValue, String scvUserId,
			String scvTerminalId, DateTime scvTimestamp)
			throws EPPIXSeriousException;

	public FfhFamfrndHeadDMO getFfhFamFrndHead(String serviceCode)
			throws EPPIXSeriousException;

	public DAOIterator getTmpServicesRejectList(String simNo)
			throws EPPIXSeriousException;

	public IntegerDMO countScvByCrmValue(Integer subscriberId)
			throws EPPIXSeriousException;

	public MchMigrChrgeHdrDMO getMchByOldTariffNewTariff(String type,
			String oldTariff, String newTariff, Integer migrationNo)
			throws EPPIXSeriousException;

	public MchMigrChrgeHdrDMO getMchByNewTariff(String type, String newTariff,
			Integer migrationNo) throws EPPIXSeriousException;

	public DAOIterator getMcdList(Integer mgrPathId)
			throws EPPIXSeriousException;

	public void insertMcdSubMigrCntrl(Integer smcSubscriberId,
			String smcFromPackage, String smcFromTariff,
			String smcFromNtwrkTrf, String smcToPackage, String smcToTariff,
			String smcToNtwrkTrf, Date smcMigrDate, String smcCount,
			Date smcExpiryDate, BigDecimal smcMigrCharge)
			throws EPPIXSeriousException;

	public PsmPrstgSrvMtrxDMO getPsm(String serviceCode)
			throws EPPIXSeriousException;

	public void createMWEvent(MwiMwInterfaceDMO mwDmo)
			throws EPPIXSeriousException;

	public DcmDualcallMapDMO getDcm(String serviceCode)
			throws EPPIXSeriousException;

	public StringDMO getMinVamConnectDate(Integer subscriberId)
			throws EPPIXSeriousException;

	public void createVas(VasActiveServiceDMO vasDMO)
			throws EPPIXSeriousException;

	public VasVamVsmSubSimDQO getBasicVasVamVsm(String simNo,
			String serviceCode, String tariff) throws EPPIXSeriousException;

	public SdeServDepositDMO getSdeSim(Integer subscriberId,
			String serviceCode, String simNo, String msisdnNo)
			throws EPPIXSeriousException;

	public void createMgp(String simNo, String oldTariff, String newTariff,
			Date migrationDate, String freeText) throws EPPIXSeriousException;

	public DAOIterator getVamByVsmServiceCode(String simNo, String serviceCode)
			throws EPPIXSeriousException;

	public DAOIterator getVamSrvPrmsMSISDN(String msisdn, String serviceCode)
			throws EPPIXSeriousException;

	public DAOIterator getVamSrvPrmsSIM(String simNo, String serviceCode)
			throws EPPIXSeriousException;

	public DAOIterator getSdcSimList(Integer subscriberId, String serviceCode,
			String simNo) throws EPPIXSeriousException;

	public void insertTmpServiceReject(String simNo, String serviceCode,
			String ServiceDesc, String reason) throws EPPIXSeriousException;

	public void deleteSul(Integer subscriberId) throws EPPIXSeriousException;

	public DAOIterator getVasVamVsmSimlist(String statusCode, String simNo)
			throws EPPIXSeriousException;

	public void updateAuxBillLmt(String billAccountNo)
			throws EPPIXSeriousException;

	public void UpdateDealerItemValues(String dealerId)
			throws EPPIXSeriousException;

	public IntegerDMO checkexistsVasOtherSim(Integer subscriberId,
			String simNo, String serviceCode, String tariffCode)
			throws EPPIXSeriousException;

	public DAOIterator getSrvPrmTariffDefault(Integer paramId,
			String serviceCode, String tariffCode) throws EPPIXSeriousException;

	public IntegerDMO checkParamTariff(String tariffCode, Integer paramId)
			throws EPPIXSeriousException;

	public DAOIterator getMgrList(String service, String providerId)
			throws EPPIXSeriousException;

	public TsTariffServiceDMO getDefManInd(String packageCode,
			String serviceCode, String tariffCode) throws EPPIXSeriousException;

	public IntegerDMO checkParamPackage(Integer paramId, String packageCode)
			throws EPPIXSeriousException;

	public StringDMO getMSISDNBasicService(String msisdn)
			throws EPPIXSeriousException;

	public DAOIterator getBlaIterator(Integer triggerSerial)
			throws EPPIXSeriousException;

	public void deleteBlnAcn(Integer linkAcn) throws EPPIXSeriousException;

	public VasVamDQO getVasBillLimitBySubscriber(Integer subscriberId,
			String serviceCode) throws EPPIXSeriousException;

	public void deleteBlt(Integer bltSerialId) throws EPPIXSeriousException;

	public void deleteBla(Integer blaSerialId) throws EPPIXSeriousException;

	public DAOIterator getBltBySubscriberServiceCode(Integer subscriberId,
			String serviceCode) throws EPPIXSeriousException;

	public IntegerDMO getUserRestrictionGetAdd(String user, String type1,
			String code1, String type2, String code2, String type3, String code3)
			throws EPPIXSeriousException;

	public IntegerDMO getUserRestrictionGetRemove(String user, String type1,
			String code1, String type2, String code2, String type3, String code3)
			throws EPPIXSeriousException;

	public void insertBackupEapBilmt(EapEpxactionPendDMO eapDMO)
			throws EPPIXSeriousException;

	public void deleteBsaSimAcn(Integer subscriber, String simAcn)
			throws EPPIXSeriousException;

	public IntegerDMO getEapSeq(Integer subscriberId, String msisdnNo,
			String eapAcnType) throws EPPIXSeriousException;

	public DAOIterator getBlhNetAcnIterator(Integer subscriberId, String level)
			throws EPPIXSeriousException;

	public void insertTmpPrmsLinkServC(TmpPrmsLinksServC values)
			throws EPPIXSeriousException;

	public DAOIterator getTmpPrmsLinkServC(Integer SubscriberId)
			throws EPPIXSeriousException;

	public void deleteTmpPrmsLinkServC(Integer SubscriberId)
			throws EPPIXSeriousException;

	public BigDecimal getSumHWFeesByAccount(String accountNo)
			throws EPPIXSeriousException;

	public BigDecimal getSumSpulByAccount(String accountNo)
			throws EPPIXSeriousException;

	public VasActiveServiceDMO getVas(Integer subscriberId, String serviceCode,
			String tariffCode) throws EPPIXSeriousException;

	public DAOIterator getParameterizedValues(String serviceCode,
			Integer subscriberId) throws EPPIXSeriousException;

	public EhHhDQO getMasterEhHh(Integer scSerial, String parentType)
			throws EPPIXSeriousException;

	public EhHhDQO getMasterLinkEhHh(Integer ehLink, String parentType)
			throws EPPIXSeriousException;

	public EppEbuPromoPriceDMO getEppBearer(Integer eppHierarchyId,
			String shortName, String status) throws EPPIXSeriousException;

	public TdTelemtryDeviceDMO getTdc(Integer subscriberId)
			throws EPPIXSeriousException;

	public SpcSpvPshPsdDQO getSpcSpvPshPsdBySubServCode(String serviceCode,
			Integer subscriberId) throws EPPIXSeriousException;

	public SbaSubAuxDMO getMsisdnSba(String msisdn)
			throws EPPIXSeriousException;

	public DAOIterator getAuxSbdVamBySub(Integer subscriberId)
			throws EPPIXSeriousException;

	public StringDMO getMaxAcsSwapDate(String accountNo, Integer subscriberId)
			throws EPPIXSeriousException;

	public TtTypeTextDMO getTTAdhoc(String serviceCode)
			throws EPPIXSeriousException;

	public IntegerDMO isInsuranceByAccount(String accountNo)
			throws EPPIXSeriousException;

	public IntegerDMO isInsuranceByMsisdn(String msisdn)
			throws EPPIXSeriousException;

	public IntegerDMO isInsuranceBySubscriber(Integer subscriberId)
			throws EPPIXSeriousException;

	public IntegerDMO checkSubscriberHasInsurance(Integer subscriberId)
			throws EPPIXSeriousException;

	public IatInsTrackDMO getInsuranceTrack(Integer insId,
			Integer subscriberId, String currentMsisdn, String currentAccNo)
			throws EPPIXSeriousException;

	public void insertIatInsTrack(IatInsTrackDMO iatDmo)
			throws EPPIXSeriousException;

	public IntegerDMO getPsdSerialBySubscriber(Integer subscriberId)
			throws EPPIXSeriousException;

	public IntegerDMO getVcfEquipIdBySubscriber(Integer subscriberId)
			throws EPPIXSeriousException;

	public DAOIterator getManyAudWithSubscriberId(String accountNo,
			Integer subscriberId, String addressType)
			throws EPPIXSeriousException;

	public DAOIterator getManyAud(String accountNo, String addressType)
			throws EPPIXSeriousException;

	public PsPartnerServiceDMO getPartnerServiceBenefit(String benefitTyoe,
			String benefitCode) throws EPPIXSeriousException;

	public PicPrtnrInstCdeDMO getPartnerInstructionCode(Integer picId)
			throws EPPIXSeriousException;

	public PiPartnerInfoDMO getPartner(Integer partnerId)
			throws EPPIXSeriousException;

	public AuxSlcustmDQO getSlcustAuxByAccount(String accountNo)
			throws EPPIXSeriousException;

	public SbuSubUpgradeDMO getSbuActive(Integer subscriberId)
			throws EPPIXSeriousException;

	public AudAddressDMO getAudBySubSPHY(String addressType,
			Integer subscriberId) throws EPPIXSeriousException;

	public DsvDgtlServVchDMO getDsvDigital(Integer subscriberId, Date connectDt)
			throws EPPIXSeriousException;

	public void insertDsvDigital(DsvDgtlServVchDMO dsvDMO)
			throws EPPIXSeriousException;

	public BlhBillLimitHdDMO getSul(Integer subscriberId)
			throws EPPIXSeriousException;

	public void updateSul(Date startDate, Date endDate, Double value,
			String type, Integer subscriberId) throws EPPIXSeriousException;

	public void tmpN2NServicesDelete(Integer subscriberId)
			throws EPPIXSeriousException;

	public void tmpN2NCompDelete(Integer subscriberId)
			throws EPPIXSeriousException;

	public void updateTmpN2NServices(Integer subscriberId)
			throws EPPIXSeriousException;

	public void updateTmpN2NCompression(Integer subscriberId)
			throws EPPIXSeriousException;

	public ArrayList<N2NSubDetailsDQO> getN2NSubscriberDetailList(
			Integer subscriberId, boolean compression)
			throws EPPIXSeriousException;

	public boolean simServiceExists(String simNo) throws EPPIXSeriousException;

	public void tmpN2NDcDelete(String simNo) throws EPPIXSeriousException;

	public void tmpN2NDcInsert(String netServCode, String simNo,
			String msisdnNo, String smnSimNo, String sdcSecondMsisdn,
			Integer rowId, boolean serviceExists, String serviceType)
			throws EPPIXSeriousException;

	public boolean isMigrationPending(String simNo)
			throws EPPIXSeriousException;

	public Iterator getVasVamVsmSubSimRowIdlist(Integer subscriberId,
			String simNo) throws EPPIXSeriousException;

	public DAOIterator iterateTmpN2NDc(String simNo)
			throws EPPIXSeriousException;

	public void tmpN2NServicesInsert(String vamMsisdnKnown, String vamSimNo,
			String location, Date vsmActivateDate, String vasServiceCode,
			String vasServiceType, String vasInternTariff, String vamMsisdnNo,
			Integer vsmRowId, String vstOriginator, String vsmNodeSent,
			boolean depRequired, Short vsr2ServiceOrder, int actOrder)
			throws EPPIXSeriousException;

	public void updateVsmDetails(Integer rowId) throws EPPIXSeriousException;

	public void updatePshDetails(Integer subscriberId, String serviceCode)
			throws EPPIXSeriousException;

	public SbbSubBenefitDMO getSbbListByPartnerId(Integer partnerId)
			throws EPPIXSeriousException;

	public void updateTmpN2NSim(String simNo, String ncrCode,
			String ncrCompressCode) throws EPPIXSeriousException;

	public IntegerDMO getTmpN2NCompCount(String simNo)
			throws EPPIXSeriousException;

	public DAOIterator iterateNcrCompressRule(int noOfServices)
			throws EPPIXSeriousException;

	public boolean tmpN2NCompExists(String simNo, String ncrCode)
			throws EPPIXSeriousException;

	void updateTmpN2NServCode(Integer rowId, String ncrCompressCode)
			throws EPPIXSeriousException;

	public DAOIterator iterateTmpN2NCompForSim(Integer subscriberId)
			throws EPPIXSeriousException;

	public void tmpN2NCompInsert(String serviceCode, String serviceType,
			String internTariff, String simNo, String msisdnNo, Integer rowid,
			String netServCode, String supService) throws EPPIXSeriousException;

	public TmpN2NServicesDQO getTmpN2NServicesForRowId(Integer rowid)
			throws EPPIXSeriousException;

	public DAOIterator iterateTmpN2NServices(Integer subscriberId)
			throws EPPIXSeriousException;

	public DAOIterator iterateNcrCompressRule(String nctCompressCode)
			throws EPPIXSeriousException;

	public DAOIterator iterateTmpN2NSimServ(String simNo, String ncrCode)
			throws EPPIXSeriousException;

	public PsPartnerServiceDMO getPsPartner(Integer benefitId)
			throws EPPIXSeriousException;

	public StringDMO getVasTotalCharge(Integer subscriberId)
			throws EPPIXSeriousException;

	public StringDMO getParamtersTotalCharge(Integer subscriberId)
			throws EPPIXSeriousException;

	public void createTestTran(Date ttrTranDate, String ttrTranType,
			String ttrTransDesc, String ttrTranStatus, String ttrMsisdnNo,
			String ttrBillAcNo, String ttrServer, String ttrDealerId,
			String ttrUserId, String ttrErrorMessage)
			throws EPPIXSeriousException;

	public StringDMO uurUrrExists(String userLogin, String userRightId)
			throws EPPIXSeriousException;

	public UutUserRightDMO getUut(String userLogin, String userRightId)
			throws EPPIXSeriousException;

	public SriServRightDMO getSriServRight(String serviceCode,
			String serviceType, Integer paramId, String paramValue,
			String serviceAction) throws EPPIXSeriousException;

	public HtHierarchyTypeDMO getHt(String htType) throws EPPIXSeriousException;

	public IntegerDMO getPsdSerial(Integer psdPshId, Integer psdParamId)
			throws EPPIXSeriousException;

	public void updateVamContractDealer(Integer contractLength,
			Date contractTerminate, String salesman, String dealerId,
			Integer subscriberId) throws EPPIXSeriousException;

	public void updateVamContract(Integer contractLength,
			Date contractTerminate, String salesman, Integer subscriberId)
			throws EPPIXSeriousException;

	public void updateSbuSubscriberStatus(String upgradeStatus,
			Integer subscriberId) throws EPPIXSeriousException;

	public DAOIterator checkIfSubHasSSRBundle(Integer subscriberId)
			throws EPPIXSeriousException;

	public DAOIterator iterateTmpN2NServicesVam(Integer subscriberId)
			throws EPPIXSeriousException;

	public DpfDefPocFolderDMO getDpfSubEcug(Integer subscriberId)
			throws EPPIXSeriousException;

	public void updateTdTelementary(Integer subscriberId)
			throws EPPIXSeriousException;

	public AsrAddServReqDMO checkHeliosNotify(Integer subscriberId)
			throws EPPIXSeriousException;

	public DAOIterator getSbdBIllAccountByVamSim(String simNo)
			throws EPPIXSeriousException;

	public StringDMO getMsisdnSbdVamByPocFolder(String accountNo)
			throws EPPIXSeriousException;

	public com.eppixcomm.eppix.soa.sharedservices.blo.DpfDefPocFolderDMO getDpfPocFolder(
			String name, Integer folderId) throws EPPIXSeriousException;

	public IntegerDMO getServRuleVas(String serviceCode, Integer subscriberId)
			throws EPPIXSeriousException;

	public AudAddressDMO getLteAudDetails(String accountNo)
			throws EPPIXSeriousException;

	public UdvUserdocDelivDMO getUdvCustSubSystem(String accountNo,
			String typeDoc) throws EPPIXSeriousException;
	
	public StringDMO getChgMaxEffectiveDate(String chgCde, String netid, Date chargeDate, String chargef)throws EPPIXSeriousException;
	
	public VasActiveServiceDMO getSubscriberVasServiceCodeTariff(Integer subscriberId, String serviceCode, String interTariff)throws EPPIXSeriousException;

}
