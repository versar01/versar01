package com.eppixcomm.eppix.base.blo;

import java.math.BigDecimal;
import java.util.ArrayList;

import org.apache.log4j.Logger;

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
import com.eppixcomm.eppix.base.blo.SulSubUseLimitDMO;
import com.eppixcomm.eppix.base.blo.TsTariffServiceDMO;
import com.eppixcomm.eppix.base.blo.TtTypeTextDMO;
import com.eppixcomm.eppix.base.blo.VamActiveMsisdnDMO;
import com.eppixcomm.eppix.base.blo.VasActiveServiceDMO;
import com.eppixcomm.eppix.base.blo.VsrServiceDMO;
import com.eppixcomm.eppix.base.error.EPPIXObjectNotFoundException;
import com.eppixcomm.eppix.base.error.EPPIXSeriousException;
import com.eppixcomm.eppix.common.data.DAC;
import com.eppixcomm.eppix.common.data.DAO;
import com.eppixcomm.eppix.common.data.DAOIterator;
import com.eppixcomm.eppix.common.data.DAOParamQueryArgs;
import com.eppixcomm.eppix.common.data.DAOThrower;
import com.eppixcomm.eppix.common.data.IntegerDMO;
import com.eppixcomm.eppix.common.data.StringDMO;
import com.eppixcomm.eppix.common.util.Date;
import com.eppixcomm.eppix.common.util.DateTime;
import com.eppixcomm.eppix.soa.sharedservices.blo.AcnActionDMO;
import com.eppixcomm.eppix.soa.sharedservices.blo.AcvAccCrmValueDMO;
import com.eppixcomm.eppix.soa.sharedservices.blo.ApdApnPopDetsDMO;
import com.eppixcomm.eppix.soa.sharedservices.blo.AuxEncryptedDMO;
import com.eppixcomm.eppix.soa.sharedservices.blo.AuxSbdVamDQO;
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
import com.eppixcomm.eppix.soa.sharedservices.blo.PshPsdDQO;
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
import com.eppixcomm.eppix.soa.sharedservices.blo.TmpPrmslinkservCDMO;
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

public class SubscriberUpgradeMigradeDACImpl  extends DAC implements
SubscriberUpgradeMigradeDAC {
	
	// Globals
		private static DAOThrower thrower = DAOThrower
				.getDAOThrower(SubscriberUpgradeMigradeDACImpl.class);
		private Logger logger = thrower.getLogger();

		public SubscriberUpgradeMigradeDACImpl(DAO dao) {
			super(dao, thrower);
		}

		public SubscriberUpgradeMigradeDACImpl(DAO dao, DAOThrower thrower) {
			super(dao, thrower);
		}

		public TsTariffServiceDMO getTsTariffService(String packageCode,
				String serviceCode, String tariffPlan)
				throws EPPIXObjectNotFoundException, EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("getTsTariffService", 3);
			args.andFilterBy("getTsTariffService").arg(packageCode)
					.arg(serviceCode).arg(tariffPlan);
			return (TsTariffServiceDMO) dao.get("getTsTariffService", args);
		}

		public VamActiveMsisdnDMO getVamSimService(String simNo, String serviceCode)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("getVamSimService", 2);
			args.andFilterBy("getVamSimService").arg(simNo).arg(serviceCode);
			return (VamActiveMsisdnDMO) dao.get("getVamSimService", args);
		}

		public DAOIterator getSbhdIterator(Integer subscriberId, String serviceCode)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("getSbhdIterator", 2);
			args.andFilterBy("getSbhdIterator").arg(subscriberId).arg(serviceCode);
			return (DAOIterator) dao.iterator("getSbhdIterator", args);
		}

		public DAOIterator getSplitBillHeaderIterator(Integer subscriberId)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs(
					"getSplitBillHeaderIterator", 1);
			args.andFilterBy("getSplitBillHeaderIterator").arg(subscriberId);
			return (DAOIterator) dao.iterator("getSplitBillHeaderIterator", args);
		}

		public void updateSplitBillHeader(String childAcNo, String childMsisdn,
				String parentAcNo, String parentMsisdn, Date actDate,
				Date deactDate, String status, Integer sbhdSbId)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("updateSplitBillHeader",
					8);
			args.andFilterBy("updateSplitBillHeader").arg(childAcNo)
					.arg(childMsisdn).arg(parentAcNo).arg(parentMsisdn)
					.arg(actDate).arg(deactDate).arg(status).arg(sbhdSbId);
			dao.execute("updateSplitBillHeader", args);

		}

		public SbhdSplitBillHdDMO getSplitBillHeaderByParentAc(
				Integer subscriberId, String parentAcNo)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs(
					"getSplitBillHeaderByParentAc", 2);
			args.andFilterBy("getSplitBillHeaderByParentAc").arg(subscriberId)
					.arg(parentAcNo);
			return (SbhdSplitBillHdDMO) dao.get("getSplitBillHeaderByParentAc",
					args);
		}

		public void insertSbhd(SbhdSplitBillHdDMO sbhdDmo)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("insertSbhd", 14);
			args.andFilterBy("insertSbhd").arg(sbhdDmo.getSbhdSbId())
					.arg(sbhdDmo.getSbhdSubscriberId())
					.arg(sbhdDmo.getSbhdChildAcNo())
					.arg(sbhdDmo.getSbhdChildMsisdn())
					.arg(sbhdDmo.getSbhdParentAcNo())
					.arg(sbhdDmo.getSbhdParentMsisdn())
					.arg(sbhdDmo.getSbhdCreditAccum())
					.arg(sbhdDmo.getSbhdMigrated())
					.arg(sbhdDmo.getSbhdTotBillAmt()).arg(sbhdDmo.getSbhdDdRd())
					.arg(sbhdDmo.getSbhdActDate()).arg(sbhdDmo.getSbhdDeactDate())
					.arg(sbhdDmo.getSbhdBilledUpto()).arg(sbhdDmo.getSbhdStatus());
			dao.execute("insertSbhd", args);
		}

		public void updateSbtEndDate() throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("updateSbtEndDate", 0);
			dao.execute("updateSbtEndDate", args);
		}

		public void insertSbtDetails(SbtSplitBillDetDMO sbtDmo)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("insertSbtDetails", 10);
			args.andFilterBy("insertSbtDetails").arg(sbtDmo.getSbtSbId())
					.arg(sbtDmo.getSbtDirRuleId()).arg(sbtDmo.getSbtDiscType())
					.arg(sbtDmo.getSbtDiscFixed()).arg(sbtDmo.getSbtDiscPerc())
					.arg(sbtDmo.getSbtServiceCode())
					.arg(sbtDmo.getSbtServiceType()).arg(sbtDmo.getSbtStartDate())
					.arg(sbtDmo.getSbtEndDate()).arg(sbtDmo.getSbtIndicator());
			dao.execute("insertSbtDetails", args);

		}

		public VasActiveServiceDMO getVasBillLimitByMsisdnTariff(
				String serviceCode, String msisdn, String tariff)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs(
					"getVasBillLimitByMsisdnTariff", 3);
			args.andFilterBy("getVasBillLimitByMsisdnTariff").arg(serviceCode)
					.arg(msisdn).arg(tariff);
			return (VasActiveServiceDMO) dao.get("getVasBillLimitByMsisdnTariff",
					args);
		}

		public VsrServiceDMO getServiceByDealer(String serviceCode, String dealerId)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("getServiceByDealer", 2);
			args.andFilterBy("getServiceByDealer").arg(serviceCode).arg(dealerId);
			return (VsrServiceDMO) dao.get("getServiceByDealer", args);
		}

		public IntegerDMO getMAXSbuSbeNotUpgradeStatusC(Integer supId)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs(
					"getMAXSbuSbeNotUpgradeStatusC", 1);
			args.arg(supId);
			return (IntegerDMO) dao.get("getMAXSbuSbeNotUpgradeStatusC", args);
		}

		public AcnActionDMO getAcnAction(String actionType, String actionRsn)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("getAcnAction", 2);
			args.andFilterBy("getAcnAction").arg(actionType).arg(actionRsn);
			return (AcnActionDMO) dao.get("getAcnAction", args);
		}

		public DealersDMO getDealrsAct(String dealerId)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("getDealrsAct", 1);
			args.andFilterBy("getDealrsAct").arg(dealerId);
			return (DealersDMO) dao.get("getDealrsAct", args);
		}

		public IntegerDMO getMAXSbuSbe(Integer supId) throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("getMAXSbuSbe", 1);
			args.arg(supId);
			return (IntegerDMO) dao.get("getMAXSbuSbe", args);
		}

		public SlpSalespersonDMO getSalePersonAct(String salesId, String dealerId)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("getSalePersonAct", 2);
			args.andFilterBy("getSalePersonAct").arg(salesId).arg(dealerId);
			return (SlpSalespersonDMO) dao.get("getSalePersonAct", args);
		}

		public SlpSalespersonDMO getSalePersonAll(String salesId, String dealerId)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("getSalePersonAct", 2);
			args.andFilterBy("getSalePersonAct").arg(salesId).arg(dealerId);
			return (SlpSalespersonDMO) dao.get("getSalePersonAct", args);
		}

		public VamActiveMsisdnDMO getVamMinMSISDNByStatus(String simNo,
				String statusCode) throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs(
					"getVamMinMSISDNByStatus", 4);
			args.arg(simNo).arg(statusCode).arg(simNo).arg(statusCode);
			return (VamActiveMsisdnDMO) dao.get("getVamMinMSISDNByStatus", args);
		}

		public VamActiveMsisdnDMO getVamMinMSISDNNoStatus(String simNo)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs(
					"getVamMinMSISDNNoStatus", 2);
			args.arg(simNo).arg(simNo);
			return (VamActiveMsisdnDMO) dao.get("getVamMinMSISDNNoStatus", args);
		}

		public IntegerDMO serviceExistsOnSim(String simNo, String serviceCode)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("serviceExistsOnSim", 2);
			args.andFilterBy("serviceExistsOnSim").arg(simNo).arg(serviceCode);
			return (IntegerDMO) dao.get("serviceExistsOnSim", args);
		}

		public PcPartnerConfigDMO getPcBenefit(String benefitType,
				String benefitCode) throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("getPcBenefit", 2);
			args.andFilterBy("getPcBenefit").arg(benefitType).arg(benefitCode);
			return (PcPartnerConfigDMO) dao.get("getPcBenefit", args);
		}

		public IntegerDMO paramServiceCheck(Integer subscriberId,
				String serviceCode, String simNo) throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("paramServiceCheck", 3);
			args.arg(subscriberId).arg(serviceCode).arg(simNo);
			return (IntegerDMO) dao.get("paramServiceCheck", args);
		}

		public DAOIterator iterateSimDeact(Integer subscriberId, String simNo,
				String serviceCode) throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("iterateSimDeact", 3);
			args.arg(subscriberId).arg(simNo).arg(serviceCode);
			return (DAOIterator) dao.iterator("iterateSimDeact", args);
		}

		public void deleteEfgFuturQueue(String command)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("deleteEfgFuturQueue", 1);
			args.andFilterBy("deleteEfgFuturQueue").arg(command);
			dao.execute("deleteEfgFuturQueue", args);

		}

		public DAOIterator iteratePrimaryMsisdns(Integer subscriberId,
				String msisdnNo) throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("iteratePrimaryMsisdns",
					2);
			args.arg(subscriberId).arg(msisdnNo);
			return (DAOIterator) dao.iterator("iteratePrimaryMsisdns", args);
		}

		public SdrServDepoRuleDMO getSdrForServicePackageVersion(
				String serviceCode, String packageCode)
				throws EPPIXSeriousException {

			DAOParamQueryArgs args = new DAOParamQueryArgs(
					"getSdrForServicePackageVersion", 4);
			args.arg(serviceCode).arg(packageCode).arg(serviceCode)
					.arg(packageCode);
			return (SdrServDepoRuleDMO) dao.get("getSdrForServicePackageVersion",
					args);
		}

		public DAOIterator iterateSdeSubSimServ(Integer subscriberId, String simNo,
				String serviceCode, String status) throws EPPIXSeriousException {

			DAOParamQueryArgs args = new DAOParamQueryArgs("iterateSdeSubSimServ"
					+ status, 3);
			args.arg(subscriberId).arg(simNo).arg(serviceCode);
			return (DAOIterator) dao
					.iterator("iterateSdeSubSimServ" + status, args);
		}

		public DAOIterator iterateSdeSubServSimMsisdnPackage(Integer subscriberId,
				String packageCode, String serviceCode, String simNo, String msisdn)
				throws EPPIXSeriousException {

			if (packageCode == null) {
				DAOParamQueryArgs args = new DAOParamQueryArgs(
						"iterateSdeSubServSimMsisdn", 4);
				args.arg(subscriberId).arg(serviceCode).arg(simNo).arg(msisdn);
				return (DAOIterator) dao.iterator("iterateSdeSubServSimMsisdn",
						args);

			} else {
				DAOParamQueryArgs args = new DAOParamQueryArgs(
						"iterateSdeSubServSimMsisdnPackage", 5);
				args.arg(subscriberId).arg(serviceCode).arg(simNo).arg(msisdn)
						.arg(packageCode);
				return (DAOIterator) dao.iterator(
						"iterateSdeSubServSimMsisdnPackage", args);
			}
		}

		public void updateDiqDiscountQual(Integer diqQualId)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("updateDiqDiscountQual",
					1);
			args.andFilterBy("updateDiqDiscountQual").arg(diqQualId);
			dao.execute("updateDiqDiscountQual", args);
		}

		public void insertDshDiscHistory(DshDiscHistoryDMO dshDmo)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("insertDshDiscHistory",
					12);

			args.arg(dshDmo.getDshDiscHistId()).arg(dshDmo.getDshSubscriberId())
					.arg(dshDmo.getDshAccount()).arg(dshDmo.getDshDiscPlanId())
					.arg(dshDmo.getDshRuleRef()).arg(dshDmo.getDshRuleId())
					.arg(dshDmo.getDshBandId()).arg(dshDmo.getDshThreshold())
					.arg(dshDmo.getDshDiscountable()).arg(dshDmo.getDshDiscValue())
					.arg(dshDmo.getDshInvoiceNo()).arg(dshDmo.getDshTimestamp());

			dao.execute("insertDshDiscHistory", args);
		}

		public SdiDipDirDibChgDQO getSdiDipDirDibChgByStartDate(Integer subDiscId,
				Date prorataDate) throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs(
					"getSdiDipDirDibChgByStartDate", 1);
			args.andFilterBy("getSdiDipDirDibChgByStartDate").arg(subDiscId)
					.arg(prorataDate);
			return (SdiDipDirDibChgDQO) dao.get("getSdiDipDirDibChgByStartDate",
					args);
		}

		public SdiDipDirDibChgDQO getSdiDipDirDibChgByEndDate(Integer subDiscId,
				Date prorataDate) throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs(
					"getSdiDipDirDibChgByStartDate", 2);
			args.andFilterBy("getSdiDipDirDibChgByStartDate").arg(subDiscId)
					.arg(prorataDate);
			return (SdiDipDirDibChgDQO) dao.get("getSdiDipDirDibChgByStartDate",
					args);
		}

		public SdiSubsDiscountDMO getSdiBySubscriberDiscEndDate(
				Integer subscriberId, Integer discountId, Date startDate)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs(
					"getSdiBySubscriberDiscEndDate", 3);
			args.andFilterBy("getSdiBySubscriberDiscEndDate").arg(subscriberId)
					.arg(discountId).arg(startDate);
			return (SdiSubsDiscountDMO) dao.get("getSdiBySubscriberDiscEndDate",
					args);
		}

		public void terminateSubscriberDiscount(Integer subscriberId,
				Integer qualId, Integer discountId) throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs(
					"terminateSubscriberDiscount", 3);
			args.andFilterBy("terminateSubscriberDiscount").arg(subscriberId)
					.arg(qualId).arg(discountId);
			dao.execute("terminateSubscriberDiscount", args);

		}

		public DAOIterator getSbeSubEquipBySubscriber(Integer subscriberId)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs(
					"getSbeSubEquipBySubscriber", 1);
			args.andFilterBy("getSbeSubEquipBySubscriber").arg(subscriberId);
			return (DAOIterator) dao.iterator("getSbeSubEquipBySubscriber", args);
		}
		
		public SbeSubEquipDMO getSbeEquipBySubscriber(Integer subscriberId)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs(
					"getSbeEquipBySubscriber", 1);
			args.andFilterBy("getSbeEquipBySubscriber").arg(subscriberId);
			return (SbeSubEquipDMO) dao.iterator("getSbeEquipBySubscriber", args);
		}

		public IntegerDMO getHhHierarchyHead(Integer serial)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("getHhHierarchyHead", 1);
			args.andFilterBy("getHhHierarchyHead").arg(serial);
			return (IntegerDMO) dao.get("getHhHierarchyHead", args);
		}

		public IntegerDMO getCountEppixHierarchyByEntityId(Integer entityId)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs(
					"getCountEppixHierarchyByEntityId", 1);
			args.andFilterBy("getCountEppixHierarchyByEntityId").arg(entityId);
			return (IntegerDMO) dao.get("getCountEppixHierarchyByEntityId", args);
		}

		public IntegerDMO getCountVsrSdiByTTGroup(Integer subscriberId, Date endDate)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs(
					"getCountVsrSdiByTTGroup", 2);
			args.andFilterBy("getCountVsrSdiByTTGroup").arg(subscriberId)
					.arg(endDate);
			return (IntegerDMO) dao.get("getCountVsrSdiByTTGroup", args);
		}

		public ScSerialCustomerDMO getSerialCustomer(String billAccount)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("getSerialCustomer", 1);
			args.andFilterBy("getSerialCustomer").arg(billAccount);
			return (ScSerialCustomerDMO) dao.get("getSerialCustomer", args);
		}

		public void insSubEquipHistory(SbeSubEquipHistDMO sbeSubEquipHistDMO)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("insSubEquipHistory", 6);
			args.andFilterBy("insSubEquipHistory")
					.arg(sbeSubEquipHistDMO.getSbeHistEquipId())
					.arg(sbeSubEquipHistDMO.getSbeHistSubId())
					.arg(sbeSubEquipHistDMO.getSbeHistComment())
					.arg(sbeSubEquipHistDMO.getSbeHistAction())
					.arg(sbeSubEquipHistDMO.getSbeHistUserId())
					.arg(sbeSubEquipHistDMO.getSbeHistTimestamp());
			dao.execute("insSubEquipHistory", args);
		}

		public void delSbeSubEquipByEquipId(Integer equipId)
				throws EPPIXSeriousException {

			DAOParamQueryArgs args = new DAOParamQueryArgs(
					"delSbeSubEquipByEquipId", 1);
			args.andFilterBy("delSbeSubEquipByEquipId").arg(equipId);
			dao.execute("delSbeSubEquipByEquipId", args);
		}

		public AcnActionDMO getAcnSerial(Integer actionSerial)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("getAcnSerial", 1);
			args.andFilterBy("getAcnSerial").arg(actionSerial);
			return (AcnActionDMO) dao.get("getAcnSerial", args);
		}

		public UsUserDefDMO getUsUserDef(String login) throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("getUsUserDef", 1);
			args.andFilterBy("getUsUserDef").arg(login);
			return (UsUserDefDMO) dao.get("getUsUserDef", args);
		}

		public IntegerDMO checkAcnMgrUser(Integer actionSerail, String login)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("checkAcnMgrUser", 5);
			args.andFilterBy("checkAcnMgrUser").arg(actionSerail).arg(login)
					.arg(login).arg(login).arg(login);
			return (IntegerDMO) dao.get("checkAcnMgrUser", args);
		}

		public IntegerDMO checkAcnMrgTargetGroup(Integer actionSerial, Integer group)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs(
					"checkAcnMrgTargetGroup", 2);
			args.andFilterBy("checkAcnMrgTargetGroup").arg(actionSerial).arg(group);
			return (IntegerDMO) dao.get("checkAcnMrgTargetGroup", args);
		}

		public UhrUserHierarchyDMO getUhrUserHierarchy(Integer login)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("getUhrUserHierarchy", 1);
			args.andFilterBy("getUhrUserHierarchy").arg(login);
			return (UhrUserHierarchyDMO) dao.get("getUhrUserHierarchy", args);
		}

		public TrgTargetGroupDMO getTrgTargetGroupByGrpName(String groupName)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs(
					"getTrgTargetGroupByGrpName", 1);
			args.andFilterBy("getTrgTargetGroupByGrpName").arg(groupName);
			return (TrgTargetGroupDMO) dao.get("getTrgTargetGroupByGrpName", args);
		}

		public TrgTargetGroupDMO getTrgTargetGroupBySerial(Integer groupSerial)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("getTrgTargetGroup", 1);
			args.andFilterBy("getTrgTargetGroup").arg(groupSerial);
			return (TrgTargetGroupDMO) dao.get("getTrgTargetGroup", args);
		}

		public InxInvoiceXrefDMO getInxInvoiceXREF(String invoiceNo)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("getInxInvoiceXREF", 1);
			args.andFilterBy("getInxInvoiceXREF").arg(invoiceNo);
			return (InxInvoiceXrefDMO) dao.get("getInxInvoiceXREF", args);
		}

		public void insertTpdTextPad(TpdTextPadDMO tpdDMO)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("insertTpdTextPad", 6);

			args.arg(tpdDMO.getTpdOwnerSerial()).arg(tpdDMO.getTpdType())
					.arg(tpdDMO.getTpdPageNo()).arg(tpdDMO.getTpdBlockNo())
					.arg(tpdDMO.getTpdBlockAttr()).arg(tpdDMO.getTpdBlockText());

			dao.execute("insertTpdTextPad", args);
		}

		public void updateTpdTextPad(short blockAttr, String blockText,
				Integer ownerSerial, String type, short pageNo, short blockNo)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("updateTpdTextPad", 6);

			args.arg(blockAttr).arg(blockText).arg(ownerSerial).arg(type)
					.arg(pageNo).arg(blockNo);

			dao.execute("updateTpdTextPad", args);
		}

		public SbdsbaDQO getSbdSba(Integer subscriberId)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("getSbdSba", 1);
			args.andFilterBy("getSbdSba").arg(subscriberId);
			return (SbdsbaDQO) dao.get("getSbdSba", args);
		}

		public TpdTextPadDMO getTpdTextPad(Integer tpdSerial, String tpdType,
				int tpdPageNo, int tpdBlockNo) throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("getTpdTextPad", 4);
			args.andFilterBy("getTpdTextPad").arg(tpdSerial).arg(tpdType)
					.arg(tpdPageNo).arg(tpdBlockNo);
			return (TpdTextPadDMO) dao.get("getTpdTextPad", args);
		}

		public AuxEncryptedDMO getAuxCustEncrypted(String encrpKey1,
				String encrpKey2, String encrpKey3, String encrpKey4,
				String encrpKey5, String billAcNo) throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("getAuxCustEncrypted", 6);
			args.andFilterBy("getAuxCustEncrypted").arg(encrpKey1).arg(encrpKey2)
					.arg(encrpKey3).arg(encrpKey4).arg(encrpKey5).arg(billAcNo);
			return (AuxEncryptedDMO) dao.get("getAuxCustEncrypted", args);
		}

		public IntegerDMO getMaxTpdBlock(Integer tpdSerial, String tpdType,
				int tpdPageNo) throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("getMaxTpdBlock", 3);
			args.andFilterBy("getMaxTpdBlock").arg(tpdSerial).arg(tpdType)
					.arg(tpdPageNo);
			return (IntegerDMO) dao.get("getMaxTpdBlock", args);
		}

		public StringDMO getAuxEncryptKey(String billAcNo)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("getAuxEncryptKey", 1);
			args.andFilterBy("getAuxEncryptKey").arg(billAcNo);
			return (StringDMO) dao.get("getAuxEncryptKey", args);
		}

		public MmcMigCntrlDMO getMmcMigCntrl(String migrateType,
				String migrateFrom, String migrateTo) throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("getMmcMigCntrl", 3);
			args.andFilterBy("getMmcMigCntrl").arg(migrateType).arg(migrateFrom)
					.arg(migrateTo);
			return (MmcMigCntrlDMO) dao.get("getMmcMigCntrl", args);
		}

		public VamActiveMsisdnDMO getVamBySbd(Integer subscriberID, String msisdnNo)
				throws EPPIXSeriousException {

			logger.debug("Subscriber DAC Impl: " + subscriberID);
			logger.debug("MSISND DAC IMPLM: " + msisdnNo);

			DAOParamQueryArgs args = new DAOParamQueryArgs("getVamBySbd", 2);
			args.andFilterBy("getVamBySbd").arg(subscriberID).arg(msisdnNo);

			return (VamActiveMsisdnDMO) dao.get("getVamBySbd", args);
		}

		public IntegerDMO getPartnerTarExists(String packageCode, String oldTariff,
				String newTariff) throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("getPartnerTarExists", 3);
			args.andFilterBy("getPartnerTarExists").arg(packageCode).arg(oldTariff)
					.arg(newTariff);
			return (IntegerDMO) dao.get("getPartnerTarExists", args);
		}

		public void delSbpPartner(Integer partnerId, Integer benefitId)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("delSbeSbpPartner", 2);
			args.andFilterBy("delSbeSbpPartner").arg(partnerId).arg(benefitId);
			dao.delete("delSbeSbpPartner", "delSbeSbpPartner", args);

		}

		public IntegerDMO verifyServiceTypeExistsOnSim(String simNo,
				String serviceType) throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs(
					"verifyServiceTypeExistsOnSim", 2);
			args.andFilterBy("verifyServiceTypeExistsOnSim").arg(simNo)
					.arg(serviceType);
			return (IntegerDMO) dao.get("verifyServiceTypeExistsOnSim", args);
		}

		public TsTariffServiceDMO getTsBenefit(Integer partnerId,
				String memberStatus, String packageCode, String tariffPlan)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("getTsBenefit", 4);
			args.andFilterBy("getTsBenefit").arg(partnerId).arg(memberStatus)
					.arg(packageCode).arg(tariffPlan);
			return (TsTariffServiceDMO) dao.get("getTsBenefit", args);
		}

		public PcPgPsDQO getPcPgPs(Integer partnerId, String memberStatus,
				String packageCode, String tariffPlan, String serviceCode)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("getPcPgPs", 5);
			args.andFilterBy("getPcPgPs").arg(partnerId).arg(memberStatus)
					.arg(packageCode).arg(tariffPlan).arg(serviceCode);
			return (PcPgPsDQO) dao.get("getPcPgPs", args);
		}

		public void createEdEventDelay(EdEventDelayDMO edDMO)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("createEdEventDelay", 17);
			args.andFilterBy("delEdEventDelay").arg(edDMO.getEdPartnerId())
					.arg(edDMO.getEdSubscriberId()).arg(edDMO.getEdSimNo())
					.arg(edDMO.getEdMsisdnNo()).arg(edDMO.getEdSendSeq())
					.arg(edDMO.getEdStatus()).arg(edDMO.getEdCycle())
					.arg(edDMO.getEdActionCode()).arg(edDMO.getEdPartnerStatus())
					.arg(edDMO.getEdOldProduct()).arg(edDMO.getEdNewProduct())
					.arg(edDMO.getEdSuperproduct()).arg(edDMO.getEdPriceplan())
					.arg(edDMO.getEdNewPriceplan()).arg(edDMO.getEdDatetimeStamp())
					.arg(edDMO.getEdN2nTimestamp()).arg(edDMO.getEdComment());

			dao.execute("createEdEventDelay", args);
		}

		public SptServParaTarDMO getSptServParamTar(Integer paramId,
				String tariifCode, String packageCode) throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("getSptServParamTar", 3);
			args.andFilterBy("getSptServParamTar").arg(paramId).arg(tariifCode)
					.arg(packageCode);
			return (SptServParaTarDMO) dao.get("getSptServParamTar", args);
		}

		/**
		 * DML required to be dev
		 */
		public IntegerDMO getPsdActiveCount(Integer subscriberId, String serviceCode)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("getPsdActiveCount", 2);
			args.andFilterBy("getPsdActiveCount").arg(subscriberId).arg(serviceCode);
			return (IntegerDMO) dao.get("getPsdActiveCount", args);
		}

		public ScvSubCrmValueDMO getScv(Integer subscriberId)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("getScv", 1);
			args.andFilterBy("getScv").arg(subscriberId);
			return (ScvSubCrmValueDMO) dao.get("getScv", args);
		}

		public DAOIterator getVsmUniqueServiceCodeBySubsciber(Integer subscriberId)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs(
					"getVsmUniqueServiceCodeBySubsciber", 1);
			args.andFilterBy("getVsmUniqueServiceCodeBySubsciber")
					.arg(subscriberId);
			return dao.iterator("getVsmUniqueServiceCodeBySubsciber", args);
		}

		public DAOIterator getEppixHierarchyByTypeSubscriber(Integer ehIdentity)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs(
					"getEppixHierarchyByTypeSubscriber", 1);
			args.andFilterBy("getEppixHierarchyByTypeSubscriber").arg(ehIdentity);
			return (DAOIterator) dao.iterator("getEppixHierarchyByTypeSubscriber", args);
		}

		public EhEppixHierarchyDMO getEppixHierarchyBySerial(Integer ehSerial)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs(
					"getEppixHierarchyBySerial", 1);
			args.andFilterBy("getEppixHierarchyBySerial").arg(ehSerial);
			return (EhEppixHierarchyDMO) dao.get("getEppixHierarchyBySerial", args);
		}

		public PcPartnerConfigDMO getPcPartnerConfigbyStatusCodeAndTariff(
				String memberStatus, String packageCode, String tariff)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs(
					"getPcPartnerConfigbyStatusCodeAndTariff", 3);
			args.andFilterBy("getPcPartnerConfigbyStatusCodeAndTariff")
					.arg(memberStatus).arg(packageCode).arg(tariff);
			return (PcPartnerConfigDMO) dao.get(
					"getPcPartnerConfigbyStatusCodeAndTariff", args);
		}

		public IntegerDMO getPiSbpPartnerExists(Integer subscriberId)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("getPiSbpPartnerExists",
					1);
			args.andFilterBy("getPiSbpPartnerExists").arg(subscriberId);
			return (IntegerDMO) dao.get("getPiSbpPartnerExists", args);
		}

		public PiPartnerInfoDMO getPiPartnerByAgreementCode(String agreementCode)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs(
					"getPiPartnerByAgreementCode", 1);
			args.andFilterBy("getPiPartnerByAgreementCode").arg(agreementCode);
			return (PiPartnerInfoDMO) dao.get("getPiPartnerByAgreementCode", args);
		}

		public DAOIterator getSbbListBySubIdAndPartnerId(Integer subscriberId,
				Integer partnerId) throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs(
					"getSbbListBySubIdAndPartnerId", 2);
			args.andFilterBy("getSbbListBySubIdAndPartnerId").arg(subscriberId)
					.arg(partnerId);
			return (DAOIterator) dao.iterator("getSbbListBySubIdAndPartnerId",
					args, "");
		}

		public DAOIterator getSbbListBySubId(Integer subscriberId)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("getSbbListBySubId", 1);
			args.andFilterBy("getSbbListBySubId").arg(subscriberId);
			return (DAOIterator) dao.iterator("getSbbListBySubId", args, "");
		}

		public PcPartnerConfigDMO getPcPartnerConfigbyPackageCodeAndTariff(
				String packageCode, String tariff) throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs(
					"getPcPartnerConfigbyPackageCodeAndTariff", 2);
			args.andFilterBy("getPcPartnerConfigbyPackageCodeAndTariff")
					.arg(packageCode).arg(tariff);
			return (PcPartnerConfigDMO) dao.get(
					"getPcPartnerConfigbyPackageCodeAndTariff", args);
		}

		public PcPartnerConfigDMO getPcPartnerConfigbyPackageCode(String packageCode)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs(
					"getPcPartnerConfigbyPackageCode", 1);
			args.andFilterBy("getPcPartnerConfigbyPackageCode").arg(packageCode);
			return (PcPartnerConfigDMO) dao.get("getPcPartnerConfigbyPackageCode",
					args);
		}

		public PpcPttProdCfgDQO getPPCProduct(String product)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("getPPCProduct", 1);
			args.andFilterBy("getPPCProduct").arg(product);
			return (PpcPttProdCfgDQO) dao.get("getPPCProduct", args);
		}

		public AuxCustomersDMO getAuxSbd(Integer subscriberId)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("getAuxSbd", 1);
			args.andFilterBy("getAuxSbd").arg(subscriberId);
			return (AuxCustomersDMO) dao.get("getAuxSbd", args);
		}

		public NmNetmatDMO getNmMsisdnVam(String msisdn)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("getNmMsisdnVam", 1);
			args.andFilterBy("getNmMsisdnVam").arg(msisdn);
			return (NmNetmatDMO) dao.get("getNmMsisdnVam", args);
		}

		public DAOIterator getImsiRestriction(Integer subscriberId, String simNo)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("getImsiRestriction", 2);
			args.andFilterBy("getImsiRestriction").arg(subscriberId).arg(simNo);
			return (DAOIterator) dao.iterator("getImsiRestriction", args);
		}

		public DAOIterator getImsiCategory(Integer subscriberId, String simNo)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("getImsiCategory", 2);
			args.andFilterBy("getImsiCategory").arg(subscriberId).arg(simNo);
			return (DAOIterator) dao.iterator("getImsiCategory", args);
		}

		public void delEdEventDelay(Integer partnerId, Integer subscriber,
				String simNo, String msisdnNo) throws EPPIXSeriousException {

			DAOParamQueryArgs args = new DAOParamQueryArgs("delEdEventDelay", 4);
			args.andFilterBy("delEdEventDelay").arg(partnerId).arg(subscriber)
					.arg(simNo).arg(msisdnNo);

			dao.execute("delEdEventDelay", args);
		}

		public void delEdEventDelayOnActionCode(Integer partnerId,
				Integer subscriber, String simNo, String msisdnNo, String actionCode)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs(
					"delEdEventDelayOnActionCode", 4);
			args.andFilterBy("delEdEventDelayOnActionCode").arg(partnerId)
					.arg(subscriber).arg(simNo).arg(msisdnNo).arg(actionCode);

			dao.execute("delEdEventDelayOnActionCode", args);
		}

		public StringDMO getVatRateByAccount(String accountVatType,
				String itemVatType) throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("getVatRateByAccount", 2);
			args.andFilterBy("getVatRateByAccount").arg(accountVatType)
					.arg(itemVatType);
			return (StringDMO) dao.get("getVatRateByAccount", args);
		}

		public StringDMO getVatRateByCode(String vatCode)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("getVatRateByCode", 1);
			args.andFilterBy("getVatRateByCode").arg(vatCode);
			return (StringDMO) dao.get("getVatRateByCode", args);
		}

		public StringDMO getVatPercentageByCode(String vatCode)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs(
					"getVatPercentageByCode", 1);
			args.andFilterBy("getVatPercentageByCode").arg(vatCode);
			return (StringDMO) dao.get("getVatPercentageByCode", args);
		}

		public StringDMO getchgNcode(String chgNCode) throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("getchgNcode", 1);
			args.andFilterBy("getchgNcode").arg(chgNCode);
			return (StringDMO) dao.get("getchgNcode", args);
		}

		public void updateSbpSubPartner(String benefitStatus, String memberStatus,
				String authCode, Integer configId, String tariffPlan,
				Integer subscriberId, Integer partnerId)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("updateSbpSubPartner", 7);
			args.andFilterBy("updateSbpSubPartner").arg(benefitStatus)
					.arg(memberStatus).arg(authCode).arg(configId).arg(tariffPlan)
					.arg(subscriberId).arg(partnerId);
			dao.execute("updateSbpSubPartner", args);

		}

		public void updatePsdParametersForPshPsdSerial(Integer pshSubscriberId,
				String pshServiceCode, Integer psdSerialId)
				throws EPPIXSeriousException {

			DAOParamQueryArgs args = new DAOParamQueryArgs(
					"updatePsdParametersForPshPsdSerial", 3);
			args.arg(pshSubscriberId).arg(pshServiceCode).arg(psdSerialId);

			dao.execute("updatePsdParametersForPshPsdSerial", args);
		}

		public DAOIterator iteratePsdParametersForPshPsdSerial(
				Integer pshSubscriberId, String pshServiceCode, Integer psdSerialId)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs(
					"iteratePsdParametersForPshPsdSerial", 3);
			args.arg(pshSubscriberId).arg(pshServiceCode).arg(psdSerialId);
			return (DAOIterator) dao.iterator(
					"iteratePsdParametersForPshPsdSerial", args);
		}

		public SbpSubPartnerDMO getSbpByPartnerIdAndSubscriberId(Integer partnerId,
				Integer subscriberId) throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs(
					"getSbpByPartnerIdAndSubscriberId", 2);
			args.andFilterBy("getSbpByPartnerIdAndSubscriberId").arg(partnerId)
					.arg(subscriberId);
			return (SbpSubPartnerDMO) dao.get("getSbpByPartnerIdAndSubscriberId",
					args);
		}

		public StringDMO getSbdBillCycle(String billAccNo, String cycleType)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("getSbdBillCycle", 2);
			args.andFilterBy("getSbdBillCycle").arg(billAccNo).arg(cycleType)
					.arg(cycleType);
			return (StringDMO) dao.get("getSbdBillCycle", args);
		}

		/**
		 * TODO SJ: Still requires the DML factory defStatic query to be DEV.
		 */

		public StringDMO getPcBillCycle(Integer partnerId, String cycleType,
				String cycleStatus) throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("getPcPartnerCycle", 3);
			args.andFilterBy("getPcPartnerCycle").arg(partnerId).arg(cycleType)
					.arg(cycleStatus);
			return (StringDMO) dao.get("getPcPartnerCycle", args);
		}

		public void updateEapEpxactionPend(String billAcNo, Integer subscriberId)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs(
					"updateEapEpxactionPend", 2);
			args.andFilterBy("updateEapEpxactionPend").arg(billAcNo)
					.arg(subscriberId);
			dao.execute("updateEapEpxactionPend", args);

		}

		public CycleDMO getCycle(String billCycle) throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("getCycle", 2);
			args.andFilterBy("getCycle").arg(billCycle).arg(billCycle);
			return (CycleDMO) dao.get("getCycle", args);
		}

		/**
		 * TODO SJ: Neet to dev the DML factory for this DML call.
		 */

		public CycleDMO getCycleByDate(String billCycle, Date date)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("getCycleByDate", 2);
			args.andFilterBy("getCycleByDate").arg(billCycle).arg(billCycle)
					.arg(date);
			return (CycleDMO) dao.get("getCycleByDate", args);
		}

		public PcPartnerCyclesDMO getPcPartnerCycleByPartnerId(Integer partnerID,
				String billCycle) throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs(
					"getPcPartnerCycleByPartnerId", 2);
			args.andFilterBy("getPcPartnerCycleByPartnerId").arg(partnerID)
					.arg(billCycle);
			return (PcPartnerCyclesDMO) dao.get("getPcPartnerCycleByPartnerId",
					args);
		}

		public PcPartnerCyclesDMO getPcPartnerCycle(String billCycle)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("getPcPartnerCycle", 1);
			args.andFilterBy("getPcPartnerCycle").arg(billCycle);
			return (PcPartnerCyclesDMO) dao.get("getPcPartnerCycle", args);
		}

		public CmCycleMigrationDMO getCmBySubscriberId(Integer subscriberId)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("getCmBySubscriberId", 2);
			args.andFilterBy("getCmBySubscriberId").arg(subscriberId)
					.arg(subscriberId);
			return (CmCycleMigrationDMO) dao.get("getCmBySubscriberId", args);
		}

		/**
		 * TODO SJ: Neet to dev the DML factory for this DML call.
		 */

		public DAOIterator getSbdCustListByCustId(String customerId)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("getSbdCustList", 1);
			args.andFilterBy("getSbdCustList").arg(customerId);
			return (DAOIterator) dao.iterator("getSbdCustList", args, "");
		}

		public DAOIterator getCustActSubListByBillAcNo(String billAcNo)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs(
					"getCustActSubListByBillAcNo", 2);
			args.andFilterBy("getCustActSubListByBillAcNo").arg(billAcNo)
					.arg(billAcNo);
			return (DAOIterator) dao.iterator("getCustActSubListByBillAcNo", args,
					"");
		}

		public DAOIterator getCustActSubListByBillAcNoAndMsisdn(String billAcNo,
				String msisdnNo) throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs(
					"getCustActSubListByBillAcNoAndMsisdn", 2);
			args.andFilterBy("getCustActSubListByBillAcNoAndMsisdn").arg(billAcNo)
					.arg(msisdnNo);
			return (DAOIterator) dao.iterator(
					"getCustActSubListByBillAcNoAndMsisdn", args, "");
		}

		public DAOIterator getCrRulelList() throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("getCrRulelList", 1);
			return (DAOIterator) dao.iterator("getCrRulelList", args, "");
		}

		public DAOIterator getCrRulelListByRuleId(Integer ruleId)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs(
					"getCrRulelListByRuleId", 1);
			args.andFilterBy("getCrRulelListByRuleId").arg(ruleId);
			return (DAOIterator) dao.iterator("getCrRulelListByRuleId", args, "");
		}

		public IntegerDMO getCountSbpStatus(String billAcNo, String benefitStatus)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("getCountSbpStatus", 2);
			args.andFilterBy("getCountSbpStatus").arg(billAcNo).arg(benefitStatus);
			return (IntegerDMO) dao.get("getCountSbpStatus", args);
		}

		public ApdApnPopDetsDMO getApdApnPopDets(String msisdn)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("getApdApnPopDets", 1);
			args.andFilterBy("getApdApnPopDets").arg(msisdn);
			return (ApdApnPopDetsDMO) dao.get("getApdApnPopDets", args);
		}

		public ApdApnPopDetsDMO getApdApnPopDetsByInvoiceNo(String msisdn,
				String invNo) throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs(
					"getApdApnPopDetsByInvoiceNo", 2);
			args.andFilterBy("getApdApnPopDetsByInvoiceNo").arg(msisdn).arg(invNo);
			return (ApdApnPopDetsDMO) dao.get("getApdApnPopDetsByInvoiceNo", args);
		}

		public PphPayPlanHdrDMO getPph(String accountNo)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("getPph", 1);
			args.andFilterBy("getPph").arg(accountNo);
			return (PphPayPlanHdrDMO) dao.get("getPph", args);
		}

		public DAOIterator getCmList(Integer subscriberId)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("getCmList", 1);
			args.andFilterBy("getCmList").arg(subscriberId);
			return (DAOIterator) dao.iterator("getCmList", args, "");
		}

		public DAOIterator getVasVamVsmSubSimlist(Integer subscriberId, String simNo)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs(
					"getVasVamVsmSubSimlist", 2);
			args.andFilterBy("getVasVamVsmSubSimlist").arg(subscriberId).arg(simNo);
			return (DAOIterator) dao.iterator("getVasVamVsmSubSimlist", args, "");
		}

		public StringDMO getMaxEfgCommand(String searchDate)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("getMaxEfgCommand", 1);
			args.andFilterBy("getMaxEfgCommand").arg(searchDate);
			return (StringDMO) dao.get("getMaxEfgCommand", args);
		}

		public CpoCplanOpenDMO getCpo(String billAcNo, Integer status)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("getCpo", 2);
			args.andFilterBy("getCpo").arg(billAcNo).arg(status);
			return (CpoCplanOpenDMO) dao.get("getCpo", args);
		}

		public NgsNetGroupServDMO getNetServcodePackservtariff(String packageCode,
				String serviceCode, String internTariff)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs(
					"getNetServcodePackservtariff", 3);
			args.andFilterBy("getNetServcodePackservtariff").arg(packageCode)
					.arg(serviceCode).arg(internTariff);
			return (NgsNetGroupServDMO) dao.get("getNetServcodePackservtariff",
					args);
		}

		public DAOIterator getMsisdnBasicServiceSimVamVsmList(String simNo)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs(
					"getMsisdnBasicServiceSimVamVsmList", 1);
			args.andFilterBy("getMsisdnBasicServiceSimVamVsmList").arg(simNo);
			return (DAOIterator) dao.iterator("getMsisdnBasicServiceSimVamVsmList",
					args);
		}

		public SbdSubDetsDMO getSbdSim(String simNo) throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("getSbdSim", 1);
			args.andFilterBy("getSbdSim").arg(simNo);
			return (SbdSubDetsDMO) dao.get("getSbdSim", args);
		}

		public StringDMO getNgsNetServCode(String code, String networkId)
				throws EPPIXSeriousException {

			DAOParamQueryArgs args = new DAOParamQueryArgs("getNgsNetServCode", 2);
			args.arg(code).arg(networkId);
			return (StringDMO) dao.get("getNgsNetServCode", args);

		}

		public void modifyEiAsA(String billCycle) throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("modifyEiAsA", 1);
			args.andFilterBy("modifyEiAsA").arg(billCycle);
			dao.execute("modifyEiAsA", args);
		}

		public void modifyEiAsD(String billCycle) throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("modifyEiAsD", 1);
			args.andFilterBy("modifyEiAsD").arg(billCycle);
			dao.execute("modifyEiAsD", args);
		}

		public void insertCm(Integer subscriberId, Date date, String status,
				String oldCycle, String newCycle, String oldBillAcNo,
				String newBillAcNo, Date timestamp) throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("insertCm", 9);
			args.andFilterBy("insertCm").arg(subscriberId).arg(date).arg(status)
					.arg(oldCycle).arg(newCycle).arg(oldBillAcNo).arg(newBillAcNo)
					.arg(timestamp);
			dao.execute("insertCm", args);
		}

		public void updateCm(Integer subscriberId, String oldBillCycle,
				String newBillCycle, String newStatus, Date timestamp)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("updateCm", 7);
			args.andFilterBy("updateCm").arg(newStatus).arg(newBillCycle)
					.arg(oldBillCycle).arg(subscriberId).arg(oldBillCycle)
					.arg(newBillCycle).arg(timestamp);
			dao.execute("updateCm", args);
		}

		public void updateApd(ApdApnPopDetsDMO apdDMO) throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("updateApd", 13);
			args.andFilterBy("updateApd").arg(apdDMO.getApdId())
					.arg(apdDMO.getApdName()).arg(apdDMO.getApdMsisdn())
					.arg(apdDMO.getApdActiveNo()).arg(apdDMO.getApdDeactNo())
					.arg(apdDMO.getApdChrgNo()).arg(apdDMO.getApdChrgAmount())
					.arg(apdDMO.getApdStartPeriod()).arg(apdDMO.getApdEndPeriod())
					.arg(apdDMO.getApdCycle()).arg(apdDMO.getApdInvNo())
					.arg(apdDMO.getApdId()).arg(apdDMO.getApdMsisdn());
			dao.execute("updateApd", args);
		}

		public IntegerDMO getCountSbdSubDetsByBillAcNo(String billAcNo)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs(
					"getCountSbdSubDetsByBillAcNo", 1);
			args.andFilterBy("getCountSbdSubDetsByBillAcNo").arg(billAcNo);
			return (IntegerDMO) dao.get("getCountSbdSubDetsByBillAcNo", args);
		}

		public DAOIterator getVsrVasVamVsmList(String simNo)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("getVsrVasVamVsmList", 1);
			args.andFilterBy("getVsrVasVamVsmList").arg(simNo);
			return (DAOIterator) dao.iterator("getVsrVasVamVsmList", args);
		}

		public void creatSbbSubBenefit(Integer partnerId, Integer benefitId)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("creatSbbSubBenefit", 2);
			args.andFilterBy("creatSbbSubBenefit").arg(partnerId).arg(benefitId);
			dao.execute("creatSbbSubBenefit", args);
		}

		public IntegerDMO countSmc(Integer subscriberId, String countFLag,
				Date expiryDate) throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("countSmc", 2);
			args.arg(subscriberId).arg(countFLag).arg(expiryDate);
			return (IntegerDMO) dao.get("countSmc", args);
		}

		public DAOIterator getSubServices(Integer subscriberId, String tariff)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("getSubServices", 2);
			args.andFilterBy("getSubServices").arg(subscriberId).arg(tariff);
			return (DAOIterator) dao.iterator("getSubServices", args);
		}

		public VpsVsrVstDQO getVpsVsrVstServices(String serviceCode,
				String packageCode) throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("getVpsVsrVstServices",
					2);
			args.andFilterBy("getVpsVsrVstServices").arg(serviceCode)
					.arg(packageCode);
			return (VpsVsrVstDQO) dao.get("getVpsVsrVstServices", args);
		}

		public TsTariffServiceDMO getServiceRecord(String serviceCode,
				String packageCode, String tariff) throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("getServiceRecord", 3);
			args.andFilterBy("getServiceRecord").arg(serviceCode).arg(packageCode)
					.arg(tariff);
			return (TsTariffServiceDMO) dao.get("getServiceRecord", args);
		}

		public DAOIterator getSbpBySubscriberId(Integer subscriberId,
				String benefitStatus) throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("getSbpBySubscriberId",
					2);
			args.andFilterBy("getSbpBySubscriberId").arg(subscriberId)
					.arg(benefitStatus);
			return (DAOIterator) dao.iterator("getSbpBySubscriberId", args);
		}

		public DAOIterator getServRule(String serviceCode, String packageCode,
				String tariff, String serviceType) throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("getServRule", 4);
			args.andFilterBy("getServRule").arg(serviceCode).arg(packageCode)
					.arg(tariff).arg(serviceType);
			return (DAOIterator) dao.iterator("getServRule", args);
		}

		public IntegerDMO validateTsPackageTariff(String packageCode, String tariff)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs(
					"validateTsPackageTariff", 2);
			args.andFilterBy("validateTsPackageTariff").arg(packageCode)
					.arg(tariff);
			return (IntegerDMO) dao.get("validateTsPackageTariff", args);
		}

		public void updateVasChg123(String subCharge1, String subCharge2,
				String subCharge3, Integer subscriberId, String serviceCode,
				String tariff) throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("updateVasChg123", 6);
			args.andFilterBy("updateVasChg123").arg(subCharge1).arg(subCharge2)
					.arg(subCharge3).arg(subscriberId).arg(serviceCode).arg(tariff);
			dao.execute("updateVasChg123", args);

		}

		public DAOIterator getFflList(Integer subscriberId, String simNo,
				String serviceCode) throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("getFflList", 3);
			args.andFilterBy("getFflList").arg(subscriberId).arg(simNo)
					.arg(serviceCode);
			return (DAOIterator) dao.iterator("getFflList", args);
		}

		public void updateFamilyFriendsTermDt(Date termDt, Integer subscriberId,
				String simNo, String serviceCode) throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs(
					"updateFamilyFriendsTermDt", 4);
			args.andFilterBy("updateFamilyFriendsTermDt").arg(termDt)
					.arg(subscriberId).arg(simNo).arg(serviceCode);
			dao.execute("updateFamilyFriendsTermDt", args);

		}

		public SdeServDepositDMO getSdeSim(Integer subscriberId,
				String serviceCode, String simNo, String msisdnNo)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("getSdeSim", 4);
			args.andFilterBy("getSdeSim").arg(subscriberId).arg(serviceCode)
					.arg(simNo).arg(msisdnNo);
			return (SdeServDepositDMO) dao.get("getSdeSim", args);
		}

		/*
		 * SJ: found error, used wrong DML in filters and dao get method.
		 * 
		 * 20-04-2015 (non-Javadoc)
		 * 
		 * @see com.eppixcomm.eppix.soa.sharedservices.blo.EppixLibSharedDAC#
		 * getSdeSimByPackage(java.lang.Integer, java.lang.String, java.lang.String,
		 * java.lang.String, java.lang.String)
		 */

		public SdeServDepositDMO getSdeSimByPackage(Integer subscriberId,
				String packagedCode, String serviceCode, String simNo,
				String msisdnNo) throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("getSdeSimByPackage", 5);
			args.andFilterBy("getSdeSimByPackage").arg(subscriberId)
					.arg(serviceCode).arg(simNo).arg(msisdnNo).arg(packagedCode);
			return (SdeServDepositDMO) dao.get("getSdeSimByPackage", args);
		}

		public SpvParamValuesDMO getSpvParamValue(Integer paramId, String paramValue)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("getSpvParamValue", 2);
			args.andFilterBy("getSpvParamValue").arg(paramId).arg(paramValue);
			return (SpvParamValuesDMO) dao.get("getSpvParamValue", args);
		}

		public DAOIterator getPrstServices() throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("getPrstServices", 0);
			args.andFilterBy("getPrstServices");
			return (DAOIterator) dao.iterator("getPrstServices", args);
		}

		public CviCrmValueIndDMO getCvi(String crmValue)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("getCvi", 1);
			args.andFilterBy("getCvi").arg(crmValue);
			return (CviCrmValueIndDMO) dao.get("getCvi", args);
		}

		public AcvAccCrmValueDMO getAcv(String billAccount)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("getAcv", 1);
			args.andFilterBy("getAcv").arg(billAccount);
			return (AcvAccCrmValueDMO) dao.get("getAcv", args);
		}

		public void updateAcvAccCrmValue(String crmValue, String type,
				String billAccount) throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("updateAcvAccCrmValue",
					3);
			args.andFilterBy("updateAcvAccCrmValue").arg(crmValue).arg(type)
					.arg(billAccount);
			dao.execute("updateAcvAccCrmValue", args);
		}

		public void insertScvSubCrmValue(Integer subscriberId, String crmValue,
				String type) throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("insertScvSubCrmValue",
					3);
			args.andFilterBy("insertScvSubCrmValue").arg(subscriberId)
					.arg(crmValue).arg(type);
			dao.execute("insertScvSubCrmValue", args);
		}

		public void updateScvSubCrmValueScvType(String value, String type,
				Integer subscriberId) throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("updateScvSubCrmValue",
					3);
			args.andFilterBy("updateScvSubCrmValue").arg(value).arg(type)
					.arg(subscriberId);
			dao.execute("updateScvSubCrmValue", args);
		}

		public void updateScvSubCrmValue(String value, Integer subscriberId)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("updateScvSubCrmValue",
					2);
			args.andFilterBy("updateScvSubCrmValue").arg(value).arg(subscriberId);
			dao.execute("updateScvSubCrmValue", args);
		}

		public void insertScvSubHistory(Integer scvSubscriberId,
				String scvCrmOldValue, String scvCrmNewValue, String scvUserId,
				String scvTerminalId, DateTime scvTimestamp)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("insertScvSubHistory", 6);
			args.andFilterBy("insertScvSubHistory").arg(scvSubscriberId)
					.arg(scvCrmOldValue).arg(scvCrmNewValue).arg(scvUserId)
					.arg(scvTerminalId).arg(scvTimestamp);
			dao.execute("insertScvSubHistory", args);
		}

		public FfhFamfrndHeadDMO getFfhFamFrndHead(String serviceCode)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("getFfhFamFrndHead", 1);
			args.andFilterBy("getFfhFamFrndHead").arg(serviceCode);
			return (FfhFamfrndHeadDMO) dao.get("getFfhFamFrndHead", args);
		}

		public DAOIterator getTmpServicesRejectList(String simNo)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs(
					"getTmpServicesRejectList", 1);
			args.arg(simNo);
			return (DAOIterator) dao.iterator("getTmpServicesRejectList", args);
		}

		public IntegerDMO countScvByCrmValue(Integer subscriberId)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("countScvByCrmValue", 1);
			args.arg(subscriberId);
			return (IntegerDMO) dao.get("countScvByCrmValue", args);
		}

		public MchMigrChrgeHdrDMO getMchByOldTariffNewTariff(String type,
				String oldTariff, String newTariff, Integer migrationNo)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs(
					"getMchByOldTariffNewTariff", 6);
			args.arg(type).arg(oldTariff).arg(newTariff).arg(oldTariff)
					.arg(newTariff).arg(migrationNo);
			return (MchMigrChrgeHdrDMO) dao.get("getMchByOldTariffNewTariff", args);
		}

		public MchMigrChrgeHdrDMO getMchByNewTariff(String type, String newTariff,
				Integer migrationNo) throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("getMchByNewTariff", 4);
			args.arg(type).arg(newTariff).arg(newTariff).arg(migrationNo);
			return (MchMigrChrgeHdrDMO) dao.get("getMchByNewTariff", args);
		}

		public DAOIterator getMcdList(Integer mgrPathId)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("getMcdList", 1);
			args.arg(mgrPathId);
			return (DAOIterator) dao.iterator("getMcdList", args);
		}

		public void insertMcdSubMigrCntrl(Integer smcSubscriberId,
				String smcFromPackage, String smcFromTariff,
				String smcFromNtwrkTrf, String smcToPackage, String smcToTariff,
				String smcToNtwrkTrf, Date smcMigrDate, String smcCount,
				Date smcExpiryDate, BigDecimal smcMigrCharge)
				throws EPPIXSeriousException {

			DAOParamQueryArgs args = new DAOParamQueryArgs("insertMcdSubMigrCntrl",
					11);

			args.andFilterBy("insertMcdSubMigrCntrl").arg(smcSubscriberId)
					.arg(smcFromPackage).arg(smcFromTariff).arg(smcFromNtwrkTrf)
					.arg(smcToPackage).arg(smcToTariff).arg(smcToNtwrkTrf)
					.arg(smcMigrDate).arg(smcCount).arg(smcExpiryDate)
					.arg(smcMigrCharge);
			dao.execute("insertMcdSubMigrCntrl", args);

		}

		public PsmPrstgSrvMtrxDMO getPsm(String serviceCode)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("getPsm", 1);
			args.arg(serviceCode);
			return (PsmPrstgSrvMtrxDMO) dao.get("getPsm", args);
		}

		public void createMWEvent(MwiMwInterfaceDMO mwDmo)
				throws EPPIXSeriousException {
			thrower.ifParameterMissing("mwDmo", mwDmo);

			DAOParamQueryArgs args = new DAOParamQueryArgs("createMWEvent", 6);
			args.arg(mwDmo.getMwiEventId())
				.arg(mwDmo.getMwiEventType())
				.arg(mwDmo.getMwiStatus())
				.arg(mwDmo.getMwiEventString())
				.arg(mwDmo.getMwiDateCreated())
				.arg(mwDmo.getMwiErrorMess());
			
			logger.debug("\nmwDmo.getMwiEventId(): " + mwDmo.getMwiEventId()
					+ "\nmwDmo.getMwiEventType(): " + mwDmo.getMwiEventType()
					+ "\nmwDmo.getMwiStatus(): " + mwDmo.getMwiStatus()
					+ "\nmwDmo.getMwiEventString(): " + mwDmo.getMwiEventString()
					+ "\nmwDmo.getMwiDateCreated(): " + mwDmo.getMwiDateCreated()
					+ "\nmwDmo.getMwiErrorMess(): " + mwDmo.getMwiErrorMess());
			dao.execute("createMWEvent", args);
		}

		public DcmDualcallMapDMO getDcm(String serviceCode)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("getDcm", 1);
			args.arg(serviceCode);
			return (DcmDualcallMapDMO) dao.get("getDcm", args);
		}

		public VasVamVsmSubSimDQO getBasicVasVamVsm(String simNo,
				String serviceCode, String tariff) throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("getBasicVasVamVsm", 3);
			args.andFilterBy("getBasicVasVamVsm").arg(simNo).arg(serviceCode)
					.arg(tariff);
			return (VasVamVsmSubSimDQO) dao.get("getBasicVasVamVsm", args);
		}

		public StringDMO getMinVamConnectDate(Integer subscriberId)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("getMinVamConnectDate",
					1);
			args.arg(subscriberId);
			return (StringDMO) dao.get("getMinVamConnectDate", args);
		}

		public void createVas(VasActiveServiceDMO vasDMO)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("createVas", 11);
			args.arg(vasDMO.getVasSubscriberId())
					.arg(vasDMO.getVasServiceCode())
					.arg((vasDMO.getVasInternTariff() == null) ? "" : vasDMO
							.getVasInternTariff())
					.arg(vasDMO.getVasServiceType())
					.arg(vasDMO.getVasActDate())
					.arg((vasDMO.getVasDeactDate() == null) ? "" : vasDMO
							.getVasDeactDate()).arg(vasDMO.getVasSubCharge1())
					.arg(vasDMO.getVasSubCharge2()).arg(vasDMO.getVasSubCharge3())
					.arg(vasDMO.getVasTwinbillNo()).arg(vasDMO.getVasMultiCharge());

			dao.execute("createVas", args);

		}

		public void createMgp(String simNo, String oldTariff, String newTariff,
				Date migrationDate, String freeText) throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("createMgp", 5);
			args.andFilterBy("createMgp").arg(simNo).arg(oldTariff).arg(newTariff)
					.arg(migrationDate).arg(freeText);
			dao.execute("createMgp", args);

		}

		public DAOIterator getVamByVsmServiceCode(String simNo, String serviceCode)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs(
					"getVamByVsmServiceCode", 2);
			args.andFilterBy("getVamByVsmServiceCode").arg(simNo).arg(serviceCode);
			return (DAOIterator) dao.iterator("getVamByVsmServiceCode", args);
		}

		public DAOIterator getVamSrvPrmsMSISDN(String msisdn, String serviceCode)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("getVamSrvPrmsMSISDN", 2);
			args.andFilterBy("getVamSrvPrmsMSISDN").arg(msisdn).arg(serviceCode);
			return (DAOIterator) dao.iterator("getVamSrvPrmsMSISDN", args);
		}

		public DAOIterator getVamSrvPrmsSIM(String sim, String serviceCode)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("getVamSrvPrmsSIM", 2);
			args.andFilterBy("getVamSrvPrmsSIM").arg(sim).arg(serviceCode);
			return (DAOIterator) dao.iterator("getVamSrvPrmsSIM", args);
		}

		public DAOIterator getSdcSimList(Integer subscriberId, String serviceCode,
				String simNo) throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("getSdcSimList", 3);
			args.andFilterBy("getSdcSimList").arg(subscriberId).arg(serviceCode)
					.arg(simNo);
			return (DAOIterator) dao.iterator("getSdcSimList", args);
		}

		public void insertTmpServiceReject(String simNo, String serviceCode,
				String ServiceDesc, String reason) throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs(
					"insertTmpServiceReject", 4);
			args.andFilterBy("insertTmpServiceReject").arg(simNo).arg(serviceCode)
					.arg(ServiceDesc).arg(reason);
			dao.execute("insertTmpServiceReject", args);

		}

		public void deleteSul(Integer subscriberId) throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("deleteSul", 1);
			args.andFilterBy("deleteSul").arg(subscriberId);
			dao.execute("deleteSul", args);
		}

		public DAOIterator getVasVamVsmSimlist(String statusCode, String simNo)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("getVasVamVsmSimlist", 2);
			args.andFilterBy("getVasVamVsmSimlist").arg(statusCode).arg(simNo);
			return (DAOIterator) dao.iterator("getVasVamVsmSimlist", args);
		}

		public void updateAuxBillLmt(String billAccountNo)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("updateAuxBillLmt", 2);
			args.andFilterBy("updateAuxBillLmt").arg(billAccountNo)
					.arg(billAccountNo);
			dao.execute("updateAuxBillLmt", args);
		}

		public void UpdateDealerItemValues(String dealerId)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs(
					"UpdateDealerItemValues", 1);
			args.andFilterBy("UpdateDealerItemValues").arg(dealerId);
			dao.execute("UpdateDealerItemValues", args);
		}

		public IntegerDMO checkexistsVasOtherSim(Integer subscriberId,
				String simNo, String serviceCode, String tariffCode)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs(
					"checkexistsVasOtherSim", 4);
			args.andFilterBy("checkexistsVasOtherSim").arg(subscriberId).arg(simNo)
					.arg(serviceCode).arg(tariffCode);
			return (IntegerDMO) dao.get("checkexistsVasOtherSim", args);
		}

		public DAOIterator getSrvPrmTariffDefault(Integer paramId,
				String serviceCode, String tariffCode) throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs(
					"getSrvPrmTariffDefault", 3);
			args.andFilterBy("getSrvPrmTariffDefault").arg(paramId)
					.arg(serviceCode).arg(tariffCode);
			
			System.out.print("DAOIterator getSrvPrmTariffDefault");
			return (DAOIterator) dao.iterator("getSrvPrmTariffDefault", args);
		}

		public IntegerDMO checkParamTariff(String tariffCode, Integer paramId)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("checkParamTariff", 2);
			args.andFilterBy("checkParamTariff").arg(tariffCode).arg(paramId);
			return (IntegerDMO) dao.get("checkParamTariff", args);
		}

		public DAOIterator getMgrList(String service, String providerId)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("getMgrList", 2);
			args.andFilterBy("getMgrList").arg(service).arg(providerId);
			return (DAOIterator) dao.iterator("getMgrList", args);
		}

		public TsTariffServiceDMO getDefManInd(String packageCode,
				String serviceCode, String tariffCode) throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("getDefManInd", 3);
			args.andFilterBy("getDefManInd").arg(packageCode).arg(serviceCode)
					.arg(tariffCode);
			return (TsTariffServiceDMO) dao.get("getDefManInd", args);
		}

		public IntegerDMO checkParamPackage(Integer paramId, String packageCode)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("checkParamPackage", 2);
			args.andFilterBy("checkParamPackage").arg(paramId).arg(packageCode);
			return (IntegerDMO) dao.get("checkParamPackage", args);
		}

		public StringDMO getMSISDNBasicService(String msisdn)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("getMSISDNBasicService",
					1);
			args.andFilterBy("getMSISDNBasicService").arg(msisdn);
			return (StringDMO) dao.get("getMSISDNBasicService", args);
		}

		public DAOIterator getBlaIterator(Integer triggerSerial)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("getBlaIterator", 1);
			args.andFilterBy("getBlaIterator").arg(triggerSerial);
			return (DAOIterator) dao.iterator("getBlaIterator", args);
		}

		public void deleteBlnAcn(Integer linkAcn) throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("deleteBlnAcn", 1);
			args.andFilterBy("deleteBlnAcn").arg(linkAcn);
			dao.execute("deleteBlnAcn", args);
		}

		public VasVamDQO getVasBillLimitBySubscriber(Integer subscriberId,
				String serviceCode) throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs(
					"getVasBillLimitBySubscriber", 2);
			args.andFilterBy("getVasBillLimitBySubscriber").arg(subscriberId)
					.arg(serviceCode);
			return (VasVamDQO) dao.get("getVasBillLimitBySubscriber", args);
		}

		public void deleteBlt(Integer bltSerialId) throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("deleteBlt", 1);
			args.andFilterBy("deleteBlt").arg(bltSerialId);
			dao.execute("deleteBlt", args);
		}

		public void deleteBla(Integer blaSerialId) throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("deleteBla", 1);
			args.andFilterBy("deleteBla").arg(blaSerialId);
			dao.execute("deleteBla", args);

		}

		public DAOIterator getBltBySubscriberServiceCode(Integer subscriberId,
				String serviceCode) throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs(
					"getBltBySubscriberServiceCode", 2);
			args.andFilterBy("getBltBySubscriberServiceCode").arg(subscriberId)
					.arg(serviceCode);
			return (DAOIterator) dao
					.iterator("getBltBySubscriberServiceCode", args);
		}

		public IntegerDMO getUserRestrictionGetAdd(String user, String type1,
				String code1, String type2, String code2, String type3, String code3)
				throws EPPIXSeriousException {
			IntegerDMO result = null;

			int count = 1;

			if (type2 != null) {
				count++;
			}

			if (type3 != null) {
				count++;
			}

			DAOParamQueryArgs args = new DAOParamQueryArgs("userRestrictionGetAdd"
					+ count, 3 + (count * 2));

			args.arg(type1).arg(code1);
			if (type2 != null) {
				args.arg(type2).arg(code2);
			}
			if (type3 != null) {
				args.arg(type3).arg(code3);
			}
			args.arg(user).arg(user).arg(user);

			result = (IntegerDMO) dao.get("userRestrictionGetAdd" + count, args);

			return result;
		}

		public IntegerDMO getUserRestrictionGetRemove(String user, String type1,
				String code1, String type2, String code2, String type3, String code3)
				throws EPPIXSeriousException {
			IntegerDMO result = null;

			int count = 1;

			if (type2 != null) {
				count++;
			}

			if (type3 != null) {
				count++;
			}

			DAOParamQueryArgs args = new DAOParamQueryArgs(
					"userRestrictionGetRemove" + count, 3 + (count * 2));

			args.arg(type1).arg(code1);
			if (type2 != null) {
				args.arg(type2).arg(code2);
			}
			if (type3 != null) {
				args.arg(type3).arg(code3);
			}
			args.arg(user).arg(user).arg(user);

			result = (IntegerDMO) dao.get("userRestrictionGetRemove" + count, args);

			return result;
		}

		public void insertBackupEapBilmt(EapEpxactionPendDMO eapDmo)
				throws EPPIXSeriousException {

			thrower.ifParameterMissing("EapEpxactionPendDMO", eapDmo);

			DAOParamQueryArgs args = new DAOParamQueryArgs("updateVasChg123", 37);
			args.andFilterBy("updateVasChg123").arg(eapDmo.getEapBbillAcNo())
					.arg(eapDmo.getEapSubscriberId()).arg(eapDmo.getEapSimNo())
					.arg(eapDmo.getEapImsiNo()).arg(eapDmo.getEapMsisdnNo())
					.arg(eapDmo.getEapInvoiceNo()).arg(eapDmo.getEapReferenceNo())
					.arg(eapDmo.getEapSubsystem()).arg(eapDmo.getEapRelation())
					.arg(eapDmo.getEapTrigger()).arg(eapDmo.getEapActionType())
					.arg(eapDmo.getEapActionSeq()).arg(eapDmo.getEapDocType())
					.arg(eapDmo.getEapServiceCode()).arg(eapDmo.getEapReasonCode())
					.arg(eapDmo.getEapTableName()).arg(eapDmo.getEapColumnName())
					.arg(eapDmo.getEapNewValue()).arg(eapDmo.getEapWhereColumn())
					.arg(eapDmo.getEapWhereType()).arg(eapDmo.getEapChargeCode())
					.arg(eapDmo.getEapVoiceMess()).arg(eapDmo.getEapAmnActionId())
					.arg(eapDmo.getEapAmnTargType()).arg(eapDmo.getEapAmnTargGrp())
					.arg(eapDmo.getEapAmnTargUser())
					.arg(eapDmo.getEapAmnDeadline()).arg(eapDmo.getEapAmnStatus())
					.arg(eapDmo.getEapAmnSource()).arg(eapDmo.getEapAmnOpenedBy())
					.arg(eapDmo.getEapUdaActionId()).arg(eapDmo.getEapStatus())
					.arg(eapDmo.getEapRetryRemain()).arg(eapDmo.getEapLastRetry())
					.arg(eapDmo.getEapErrorText()).arg(eapDmo.getEapSubmitted())
					.arg(eapDmo.getEapActioned());
			dao.execute("updateVasChg123", args);

		}

		public void deleteBsaSimAcn(Integer subscriber, String simAcn)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("deleteBsaSimAcn", 2);
			args.andFilterBy("deleteBsaSimAcn").arg(subscriber).arg(simAcn);
			dao.execute("deleteBsaSimAcn", args);
		}

		public IntegerDMO getEapSeq(Integer subscriberId, String msisdnNo,
				String eapAcnType) throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("getEapSeq", 3);
			args.andFilterBy("getEapSeq").arg(subscriberId).arg(msisdnNo)
					.arg(eapAcnType);
			return (IntegerDMO) dao.get("getEapSeq", args);
		}

		public DAOIterator getBlhNetAcnIterator(Integer subscriberId, String level)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("getBlhNetAcnIterator",
					2);
			args.andFilterBy("getBlhNetAcnIterator").arg(subscriberId).arg(level);
			return (DAOIterator) dao.iterator("getBlhNetAcnIterator", args);
		}

		public void insertTmpPrmsLinkServC(TmpPrmsLinksServC values)
				throws EPPIXSeriousException {
			thrower.ifParameterMissing("TmpPrmsLinksServC", values);

			DAOParamQueryArgs args = new DAOParamQueryArgs(
					"insertTmpPrmsLinkServC", 15);
			args.andFilterBy("insertTmpPrmsLinkServC")
					.arg(values.getTmpSubId())
					.arg(values.getPshId())
					.arg(values.getServiceType())
					.arg(values.getArchived())
					.arg(values.getParamId())
					.arg(values.getActDate())
					.arg(values.getTermDate())
					.arg(values.getParamValue())
					.arg(values.getN2nString())
					.arg(values.getParamActive())
					.arg(values.getDeacDate())
					.arg(values.getSubCharge())
					.arg(values.getChgValue())
					.arg(values.getActType())
					.arg(values.getActionDate());
			dao.execute("insertTmpPrmsLinkServC", args);

		}

		public DAOIterator getTmpPrmsLinkServC(Integer SubscriberId)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("getTmpPrmsLinkServC", 1);
			args.andFilterBy("getTmpPrmsLinkServC").arg(SubscriberId);
			return (DAOIterator) dao.iterator("getTmpPrmsLinkServC", args);
		}

		public void deleteTmpPrmsLinkServC(Integer SubscriberId)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs(
					"deleteTmpPrmsLinkServC", 1);
			args.andFilterBy("deleteTmpPrmsLinkServC").arg(SubscriberId);
			dao.execute("deleteTmpPrmsLinkServC", args);
		}

		public BigDecimal getSumHWFeesByAccount(String accountNo)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("getSumHWFeesByAccount",
					1);
			args.andFilterBy("getSumHWFeesByAccount").arg(accountNo);

			StringDMO fees = null;
			BigDecimal hdFees = null;

			fees = (StringDMO) dao.get("getSumHWFeesByAccount", args);

			if (fees == null || fees.getString() == null) {
				hdFees = new BigDecimal("0.00");
			} else {

				try {
					hdFees = new BigDecimal(fees.getString());

				} catch (NumberFormatException e) {
					logger.error(e.getMessage());
					hdFees = new BigDecimal("0.00");
				}

			}

			return hdFees;
		}

		public BigDecimal getSumSpulByAccount(String accountNo)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("getSumSpulByAccount", 1);
			args.andFilterBy("getSumSpulByAccount").arg(accountNo);

			StringDMO spul = null;
			BigDecimal SPUL = null;
			spul = (StringDMO) dao.get("getSumSpulByAccount", args);

			if (spul == null) {
				SPUL = new BigDecimal("0.00");
			} else {
				if(spul.getString() == null){
					new BigDecimal("0.00");
				}else{
					SPUL = new BigDecimal(spul.getString());
				}
				
			}

			return SPUL;
		}

		public VasActiveServiceDMO getVas(Integer subscriberId, String serviceCode,
				String tariffCode) throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("getVas", 3);
			args.andFilterBy("getVas").arg(subscriberId).arg(serviceCode)
					.arg(tariffCode);
			return (VasActiveServiceDMO) dao.get("getVas", args);
		}

		public DAOIterator getParameterizedValues(String serviceCode,
				Integer subscriberId) throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs(
					"getParameterizedValues", 2);
			args.andFilterBy("getParameterizedValues").arg(serviceCode)
					.arg(subscriberId);
			return (DAOIterator) dao.iterator("getParameterizedValues", args);
		}

		public DAOIterator getEppixHierarchyByType(Integer ehIdentity, String type,
				String hierType) throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs(
					"getEppixHierarchyByType", 3);
			args.andFilterBy("getEppixHierarchyByType").arg(ehIdentity).arg(type)
					.arg(hierType);
			return (DAOIterator) dao.iterator("getEppixHierarchyByType", args);
		}

		public EhHhDQO getMasterEhHh(Integer scSerial, String parentType)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("getMasterEhHh", 3);
			args.andFilterBy("getMasterEhHh").arg(scSerial).arg(parentType)
					.arg(parentType);
			return (EhHhDQO) dao.get("getMasterEhHh", args);
		}

		public EhHhDQO getMasterLinkEhHh(Integer ehLink, String parentType)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("getMasterLinkEhHh", 3);
			args.andFilterBy("getMasterLinkEhHh").arg(ehLink).arg(parentType)
					.arg(parentType);
			return (EhHhDQO) dao.get("getMasterLinkEhHh", args);
		}

		public EppEbuPromoPriceDMO getEppBearer(Integer eppHierarchyId,
				String shortName, String status) throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("getEppBearer", 3);
			args.andFilterBy("getEppBearer").arg(eppHierarchyId).arg(shortName)
					.arg(status);
			return (EppEbuPromoPriceDMO) dao.get("getEppBearer", args);
		}

		public TdTelemtryDeviceDMO getTdc(Integer subscriberId)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("getTdc", 1);
			args.andFilterBy("getTdc").arg(subscriberId);
			return (TdTelemtryDeviceDMO) dao.get("getTdc", args);
		}

		public SpcSpvPshPsdDQO getSpcSpvPshPsdBySubServCode(String serviceCode,
				Integer subscriberId) throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs(
					"getSpcSpvPshPsdBySubServCode", 2);
			args.andFilterBy("getSpcSpvPshPsdBySubServCode").arg(serviceCode)
					.arg(subscriberId);
			return (SpcSpvPshPsdDQO) dao.get("getSpcSpvPshPsdBySubServCode", args);
		}

		public SbaSubAuxDMO getMsisdnSba(String msisdn)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("getMsisdnSba", 1);
			args.andFilterBy("getMsisdnSba").arg(msisdn);
			return (SbaSubAuxDMO) dao.get("getMsisdnSba", args);
		}

		public DAOIterator getAuxSbdVamBySub(Integer subscriberId)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("getAuxSbdVamBySub", 1);
			args.andFilterBy("getAuxSbdVamBySub").arg(subscriberId);
			return (DAOIterator) dao.iterator("getAuxSbdVamBySub", args);
		}

		public StringDMO getMaxAcsSwapDate(String accountNo, Integer subscriberId)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("getMaxAcsSwapDate", 2);
			args.andFilterBy("getMaxAcsSwapDate").arg(accountNo).arg(subscriberId);
			return (StringDMO) dao.get("getMaxAcsSwapDate", args);
		}

		public TtTypeTextDMO getTTAdhoc(String serviceCode)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("getTTAdhoc", 1);
			args.andFilterBy("getTTAdhoc").arg(serviceCode);
			return (TtTypeTextDMO) dao.get("getTTAdhoc", args);
		}

		public IntegerDMO isInsuranceByAccount(String accountNo)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("isInsuranceByAccount",
					1);
			args.andFilterBy("isInsuranceByAccount").arg(accountNo);
			return (IntegerDMO) dao.get("isInsuranceByAccount", args);
		}

		public IntegerDMO isInsuranceByMsisdn(String msisdn)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("isInsuranceByMsisdn", 1);
			args.andFilterBy("isInsuranceByMsisdn").arg(msisdn);
			return (IntegerDMO) dao.get("isInsuranceByMsisdn", args);
		}

		public IntegerDMO isInsuranceBySubscriber(Integer subscriberId)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs(
					"isInsuranceBySubscriber", 1);
			args.andFilterBy("isInsuranceBySubscriber").arg(subscriberId);
			return (IntegerDMO) dao.get("isInsuranceBySubscriber", args);
		}

		public IntegerDMO checkSubscriberHasInsurance(Integer subscriberId)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs(
					"checkSubscriberHasInsurance", 1);
			args.andFilterBy("checkSubscriberHasInsurance").arg(subscriberId);
			return (IntegerDMO) dao.get("checkSubscriberHasInsurance", args);
		}

		public IatInsTrackDMO getInsuranceTrack(Integer insId,
				Integer subscriberId, String currentMsisdn, String currentAccNo)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("getInsuranceTrack", 4);
			args.andFilterBy("getInsuranceTrack").arg(insId).arg(subscriberId)
					.arg(currentMsisdn).arg(currentAccNo);
			return (IatInsTrackDMO) dao.get("getInsuranceTrack", args);
		}

		public void insertIatInsTrack(IatInsTrackDMO iatDmo)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("insertIatInsTrack", 9);
			args.andFilterBy("insertIatInsTrack").arg(iatDmo.getIatInsId())
					.arg(iatDmo.getIatSubscriberId())
					.arg(iatDmo.getIatCurrentMsisdn())
					.arg(iatDmo.getIatCurrentAccno()).arg(iatDmo.getIatOldValue())
					.arg(iatDmo.getIatOldSbeEquipid())
					.arg(iatDmo.getIatNewSbeEquipid())
					.arg(iatDmo.getIatActionDate()).arg(iatDmo.getIatActionType());
			dao.execute("insertIatInsTrack", args);
		}

		public IntegerDMO getPsdSerialBySubscriber(Integer subscriberId)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs(
					"getPsdSerialBySubscriber", 1);
			args.andFilterBy("getPsdSerialBySubscriber").arg(subscriberId);
			return (IntegerDMO) dao.get("getPsdSerialBySubscriber", args);
		}

		public IntegerDMO getVcfEquipIdBySubscriber(Integer subscriberId)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs(
					"getVcfEquipIdBySubscriber", 1);
			args.andFilterBy("getVcfEquipIdBySubscriber").arg(subscriberId);
			return (IntegerDMO) dao.get("getVcfEquipIdBySubscriber", args);
		}

		public DAOIterator getManyAudWithSubscriberId(String accountNo,
				Integer subscriberId, String addressType)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs(
					"getManyAudWithSubscriberId", 3);
			args.andFilterBy("getManyAudWithSubscriberId").arg(accountNo)
					.arg(subscriberId).arg(addressType);
			return (DAOIterator) dao.iterator("getManyAudWithSubscriberId", args,
					"");

		}

		public DAOIterator getManyAud(String accountNo, String addressType)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("getManyAud", 2);
			args.andFilterBy("getManyAud").arg(accountNo).arg(addressType);
			return (DAOIterator) dao.iterator("getManyAud", args, "");

		}

		public PsPartnerServiceDMO getPartnerServiceBenefit(String benefitTyoe,
				String benefitCode) throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs(
					"getPartnerServiceBenefit", 2);
			args.andFilterBy("getPartnerServiceBenefit").arg(benefitTyoe)
					.arg(benefitCode);
			return (PsPartnerServiceDMO) dao.get("getPartnerServiceBenefit", args);
		}

		public PicPrtnrInstCdeDMO getPartnerInstructionCode(Integer picId)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs(
					"getPartnerInstructionCode", 1);
			args.andFilterBy("getPartnerInstructionCode").arg(picId);
			return (PicPrtnrInstCdeDMO) dao.get("getPartnerInstructionCode", args);
		}

		public PiPartnerInfoDMO getPartner(Integer partnerId)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("getPartner", 1);
			args.andFilterBy("getPartner").arg(partnerId);
			return (PiPartnerInfoDMO) dao.get("getPartner", args);
		}

		public AuxSlcustmDQO getSlcustAuxByAccount(String accountNo)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("getSlcustAuxByAccount",
					2);
			args.andFilterBy("getSlcustAuxByAccount").arg(accountNo).arg(accountNo);
			return (AuxSlcustmDQO) dao.get("getSlcustAuxByAccount", args);
		}

		public SbuSubUpgradeDMO getSbuActive(Integer subscriberId)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("getSbuActive", 2);
			args.andFilterBy("getSbuActive").arg(subscriberId).arg(subscriberId);
			return (SbuSubUpgradeDMO) dao.get("getSbuActive", args);
		}

		public AudAddressDMO getAudBySubSPHY(String addressType,
				Integer subscriberId) throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("getAudBySubSPHY", 4);
			args.andFilterBy("getAudBySubSPHY").arg(addressType).arg(subscriberId)
					.arg(addressType).arg(subscriberId);
			return (AudAddressDMO) dao.get("getAudBySubSPHY", args);
		}

		public DsvDgtlServVchDMO getDsvDigital(Integer subscriberId, Date connectDt)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("getDsvDigital", 2);
			args.andFilterBy("getDsvDigital").arg(subscriberId).arg(connectDt);
			return (DsvDgtlServVchDMO) dao.get("getDsvDigital", args);
		}

		public void insertDsvDigital(DsvDgtlServVchDMO dsvDMO)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("insertDsvDigital", 12);
			args.andFilterBy("insertDsvDigital").arg(dsvDMO.getDsvSerialId())
					.arg(dsvDMO.getDsvTransactionId())
					.arg(dsvDMO.getDsvServiceCode()).arg(dsvDMO.getDsvStatus())
					.arg(dsvDMO.getDsvSubscriberId()).arg(dsvDMO.getDsvMsisdn())
					.arg(dsvDMO.getDsvEmail()).arg(dsvDMO.getDsvReqDate())
					.arg(dsvDMO.getDsvAllocDate()).arg(dsvDMO.getDsvErrorMsg())
					.arg(dsvDMO.getDsvAnalysis1()).arg(dsvDMO.getDsvAnalysis2());
			dao.execute("insertDsvDigital", args);

		}

		public BlhBillLimitHdDMO getSul(Integer subscriberId)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("getSul", 1);
			args.andFilterBy("getSul").arg(subscriberId);
			return (BlhBillLimitHdDMO) dao.get("getSul", args);
		}

		public void updateSul(Date startDate, Date endDate, Double value,
		String type, Integer subscriberId)throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("updateSul", 5);
			args.andFilterBy("updateSul")
					.arg(startDate)
					.arg(endDate)
					.arg(value)
					.arg(type)
					.arg(subscriberId);
			dao.execute("updateSul", args);

		}
		

		public void tmpN2NServicesDelete(Integer subscriberId)
				throws EPPIXSeriousException {

			DAOParamQueryArgs args = new DAOParamQueryArgs("tmpN2NServicesDelete",
					1);
			args.arg(subscriberId);

			dao.execute("tmpN2NServicesDelete", args);
		}

		public void tmpN2NCompDelete(Integer subscriberId)
				throws EPPIXSeriousException {

			DAOParamQueryArgs args = new DAOParamQueryArgs("tmpN2NCompDelete", 1);
			args.arg(subscriberId);

			dao.execute("tmpN2NCompDelete", args);
		}

		public void updateTmpN2NServices(Integer subscriberId)
				throws EPPIXSeriousException {

			DAOParamQueryArgs args = new DAOParamQueryArgs("updateTmpN2NServices",
					1);
			args.arg(subscriberId);

			dao.execute("updateTmpN2NServices", args);
		}

		public void updateTmpN2NCompression(Integer subscriberId)
				throws EPPIXSeriousException {

			DAOParamQueryArgs args = new DAOParamQueryArgs(
					"updateTmpN2NCompression", 1);
			args.arg(subscriberId);

			dao.execute("updateTmpN2NCompression", args);
		}

		public ArrayList<N2NSubDetailsDQO> getN2NSubscriberDetailList(
				Integer subscriberId, boolean compression)
				throws EPPIXSeriousException {
			return null;
		}

		public boolean simServiceExists(String simNo) throws EPPIXSeriousException {

			DAOParamQueryArgs args = new DAOParamQueryArgs("simServiceExists", 1);
			args.arg(simNo);
			
			IntegerDMO simExist = null;		
			boolean exists = false;
			simExist = (IntegerDMO)dao.get("simServiceExists", args);
			
			if(simExist != null && simExist.getIntValue() > 0){
				exists = true;
			}
			
			return exists;
		}

		public void tmpN2NDcDelete(String simNo) throws EPPIXSeriousException {

			DAOParamQueryArgs args = new DAOParamQueryArgs("tmpN2NDcDelete", 1);
			args.arg(simNo);

			dao.execute("tmpN2NDcDelete", args);
		}

		public void tmpN2NDcInsert(String netServCode, String simNo,
				String msisdnNo, String smnSimNo, String sdcSecondMsisdn,
				Integer rowId, boolean serviceExists, String serviceType)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("tmpN2NDcInsert", 8);
			args.arg(netServCode).arg(simNo).arg(msisdnNo).arg(smnSimNo)
					.arg(sdcSecondMsisdn).arg(rowId).arg(serviceExists)
					.arg(serviceType);

			dao.execute("tmpN2NDcInsert", args);

		}

		public boolean isMigrationPending(String simNo)
				throws EPPIXSeriousException {

			DAOParamQueryArgs args = new DAOParamQueryArgs("isMigrationPending", 1);
			args.arg(simNo);

			return dao.exists(args, "isMigrationPending");
		}
		
		public DAOIterator getVasVamVsmSubSimRowIdlist(Integer subscriberId,
				String simNo) throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs(
					"getVasVamVsmSubSimRowIdlist", 2);
			args.arg(subscriberId).arg(simNo);
			return (DAOIterator) dao.iterator("getVasVamVsmSubSimRowIdlist", args,
					"");
		}

		public DAOIterator iterateTmpN2NDc(String simNo)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("iterateTmpN2NDc", 1);
			args.arg(simNo);
			return (DAOIterator) dao.iterator("iterateTmpN2NDc", args);
		}
		
		public void tmpN2NServicesInsert(String vamMsisdnKnown, String vamSimNo,
				String location, Date vsmActivateDate, String vasServiceCode,
				String vasServiceType, String vasInternTariff, String vamMsisdnNo,
				Integer vsmRowId, String vstOriginator, String vsmNodeSent,
				boolean depRequired, Short vsr2ServiceOrder, int actOrder)
				throws EPPIXSeriousException {

			DAOParamQueryArgs args = new DAOParamQueryArgs("tmpN2NServicesInsert",
					14);
			args.arg(vamMsisdnKnown).arg(vamSimNo).arg(location)
					.arg(vsmActivateDate).arg(vasServiceCode).arg(vasServiceType)
					.arg(vasInternTariff).arg(vamMsisdnNo).arg(vsmRowId)
					.arg(vstOriginator).arg(vsmNodeSent).arg(depRequired)
					.arg(vsr2ServiceOrder).arg(actOrder);

			dao.execute("tmpN2NServicesInsert", args);
		}
		
		public void updateVsmDetails(Integer rowId) throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("updateVsmDetails", 1);
			args.arg(rowId);

			dao.execute("updateVsmDetails", args);
		}
		
		public void updatePshDetails(Integer subscriberId, String serviceCode)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("updatePshDetails", 2);
			args.arg(subscriberId).arg(serviceCode);

			dao.execute("updatePshDetails", args);
		}
		
		public SbbSubBenefitDMO getSbbListByPartnerId(Integer partnerId)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("getSbbListByPartnerId",
					1);
			args.arg(partnerId);

			return (SbbSubBenefitDMO) dao.get("getSbbListByPartnerId", args);
		}

		public void updateTmpN2NSim(String simNo, String ncrCode,
				String ncrCompressCode) throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("updateTmpN2NSim", 3);
			args.arg(ncrCompressCode).arg(simNo).arg(ncrCode);

			dao.execute("updateTmpN2NSim", args);
		}

		
		public IntegerDMO getTmpN2NCompCount(String simNo)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("getTmpN2NCompCount", 1);
			args.arg(simNo);

			return (IntegerDMO) dao.get("getTmpN2NCompCount", args);
		}

		
		public DAOIterator iterateNcrCompressRule(int noOfServices)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs(
					"iterateNcrCompressRule", 1);
			args.arg(noOfServices);

			return (DAOIterator) dao.iterator("iterateNcrCompressRule", args);
		}

		
		public boolean tmpN2NCompExists(String simNo, String ncrCode)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("tmpN2NCompExists", 2);
			args.arg(simNo).arg(ncrCode);

			return dao.exists(args, "tmpN2NCompExists");
		}

		
		public void updateTmpN2NServCode(Integer rowId, String ncrCompressCode)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("updateTmpN2NService", 2);
			args.arg(ncrCompressCode).arg(rowId);

			dao.execute("updateTmpN2NService", args);
		}
		
		public DAOIterator iterateTmpN2NCompForSim(Integer subscriberId)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs(
					"iterateTmpN2NCompForSim", 1);
			args.arg(subscriberId);
			return (DAOIterator) dao.iterator("iterateTmpN2NCompForSim", args);
		}
		
		public void tmpN2NCompInsert(String serviceCode, String serviceType,
				String internTariff, String simNo, String msisdnNo, Integer rowid,
				String netServCode, String supService) throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("tmpN2NCompInsert", 8);
			args.arg(serviceCode).arg(serviceType).arg(internTariff).arg(simNo)
					.arg(msisdnNo).arg(rowid).arg(netServCode).arg(supService);

			dao.execute("tmpN2NCompInsert", args);

		}
		
		public TmpN2NServicesDQO getTmpN2NServicesForRowId(Integer rowId)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs(
					"getTmpN2NServicesForRowId", 1);
			args.arg(rowId);

			return (TmpN2NServicesDQO) dao.get("getTmpN2NServicesForRowId", args);
		}

		public DAOIterator iterateTmpN2NServices(Integer subscriberId)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("iterateTmpN2NServices",
					1);
			args.arg(subscriberId);
			return (DAOIterator) dao.iterator("iterateTmpN2NServices", args);
		}
		
		public DAOIterator iterateNcrCompressRule(String compressCode)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs(
					"iterateNcrCompressRule", 1);
			args.arg(compressCode);
			return (DAOIterator) dao.iterator("iterateNcrCompressRule", args);
		}
		
		public DAOIterator iterateTmpN2NSimServ(String simNo, String ncrCode)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("iterateTmpN2NSimServ",
					1);
			args.arg(simNo).arg(ncrCode);
			return (DAOIterator) dao.iterator("iterateTmpN2NSimServ", args);
		}

		public PsPartnerServiceDMO getPsPartner(Integer benefitId)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("getPsPartner", 1);
			args.arg(benefitId);

			return (PsPartnerServiceDMO) dao.get("getPsPartner", args);

		}

		public StringDMO getVasTotalCharge(Integer subscriberId)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("getVasTotalCharge", 1);
			args.andFilterBy("getVasTotalCharge").arg(subscriberId);

			return (StringDMO) dao.get("getVasTotalCharge", args);
		}

		public StringDMO getParamtersTotalCharge(Integer subscriberId)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("getParamtersTotalCharge", 1);
			args.andFilterBy("getParamtersTotalCharge").arg(subscriberId);

			return (StringDMO) dao.get("getParamtersTotalCharge", args);
		}

		public void createTestTran(Date ttrTranDate, String ttrTranType,
				String ttrTransDesc, String ttrTranStatus, String ttrMsisdnNo,
				String ttrBillAcNo, String ttrServer, String ttrDealerId,
				String ttrUserId, String ttrErrorMessage)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("createTestTran", 10);
			args.arg(ttrTranDate)
			.arg(ttrTranType)
			.arg(ttrTransDesc)
			.arg(ttrTranStatus)
			.arg(ttrMsisdnNo)
			.arg(ttrBillAcNo)
			.arg(ttrServer)
			.arg(ttrDealerId)
			.arg(ttrUserId)
			.arg(ttrErrorMessage);

			dao.execute("createTestTran", args);
		}

		public StringDMO uurUrrExists(String userLogin, String userRightId)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("uurUrrExists", 2);
			args.andFilterBy("uurUrrExists").arg(userLogin).arg(userRightId);

			return (StringDMO) dao.get("uurUrrExists", args);
		}

		public UutUserRightDMO getUut(String userLogin, String userRightId)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("getUut", 2);
			args.andFilterBy("getUut").arg(userLogin).arg(userRightId);

			return (UutUserRightDMO) dao.get("getUut", args);
		}

		public SriServRightDMO getSriServRight(String serviceCode,
				String serviceType, Integer paramId, String paramValue,
				String serviceAction) throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("getSriServRight", 5);
			args.andFilterBy("getSriServRight")
			.arg(serviceCode)
			.arg(serviceType)
			.arg(paramId)
			.arg(paramValue)
			.arg(serviceAction);

			return (SriServRightDMO) dao.get("getSriServRight", args);
		}

		public HtHierarchyTypeDMO getHt(String htType) throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("getHt", 1);
			args.andFilterBy("getHt").arg(htType);

			return (HtHierarchyTypeDMO) dao.get("getHt", args);
		}

		public IntegerDMO getPsdSerial(Integer psdPshId, Integer psdParamId)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("getPsdSerial", 2);
			args.andFilterBy("getPsdSerial").arg(psdPshId).arg(psdParamId);

			return (IntegerDMO) dao.get("getPsdSerial", args);
		}

		public void updateVamContractDealer(Integer contractLength,
				Date contractTerminate, String salesman, String dealerId,
				Integer subscriberId) throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("updateVamContractDealer", 5);
			args.andFilterBy("updateVamContractDealer").arg(contractLength).arg(contractTerminate).arg(salesman).arg(dealerId).arg(subscriberId);

			dao.execute("updateVamContractDealer", args);		
		}

		public void updateVamContract(Integer contractLength,
				Date contractTerminate, String salesman, Integer subscriberId)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("updateVamContract", 4);
			args.andFilterBy("updateVamContract").arg(contractLength).arg(contractTerminate).arg(salesman).arg(subscriberId);

			dao.execute("updateVamContract", args);		
		}

		public void updateSbuSubscriberStatus(String upgradeStatus,
				Integer subscriberId) throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("updateSbuSubscriberStatus", 2);
			args.andFilterBy("updateSbuSubscriberStatus").arg(upgradeStatus).arg(subscriberId);

			dao.execute("updateSbuSubscriberStatus", args);		
		}

		public DAOIterator checkIfSubHasSSRBundle(Integer subscriberId)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("checkIfSubHasSSRBundle", 1);
			args.andFilterBy("checkIfSubHasSSRBundle").arg(subscriberId);

			return (DAOIterator) dao.iterator("checkIfSubHasSSRBundle", args);
		}

		public DAOIterator iterateTmpN2NServicesVam(Integer subscriberId)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("iterateTmpN2NServicesVam", 1);
			args.andFilterBy("iterateTmpN2NServicesVam").arg(subscriberId);

			return (DAOIterator) dao.iterator("iterateTmpN2NServicesVam", args);
		}

		public DpfDefPocFolderDMO getDpfSubEcug(Integer subscriberId)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("getDpfSubEcug", 1);
			args.andFilterBy("getDpfSubEcug").arg(subscriberId);

			return (DpfDefPocFolderDMO) dao.get("getDpfSubEcug", args);
		}

		public void updateTdTelementary(Integer subscriberId)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("updateTdTelementary", 1);
			args.andFilterBy("updateTdTelementary").arg(subscriberId);

			dao.execute("updateTdTelementary", args);		
		}

		public AsrAddServReqDMO checkHeliosNotify(Integer subscriberId)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("checkHeliosNotify", 1);
			args.andFilterBy("checkHeliosNotify").arg(subscriberId);

			return (AsrAddServReqDMO) dao.get("checkHeliosNotify", args);
			
		}

		public DAOIterator getSbdBIllAccountByVamSim(String simNo)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("getSbdBIllAccountByVamSim", 1);
			args.andFilterBy("getSbdBIllAccountByVamSim").arg(simNo);

			return (DAOIterator) dao.iterator("getSbdBIllAccountByVamSim", args);
		}

		public StringDMO getMsisdnSbdVamByPocFolder(String accountNo)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("getMsisdnSbdVamByPocFolder", 1);
			args.andFilterBy("getMsisdnSbdVamByPocFolder").arg(accountNo);

			return (StringDMO) dao.get("getMsisdnSbdVamByPocFolder", args);
		}

		public com.eppixcomm.eppix.soa.sharedservices.blo.DpfDefPocFolderDMO getDpfPocFolder(
				String name, Integer folderId) throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("getDpfPocFolder", 2);
			args.andFilterBy("getDpfPocFolder").arg(name).arg(folderId);

			return (com.eppixcomm.eppix.soa.sharedservices.blo.DpfDefPocFolderDMO) dao.get("getDpfPocFolder", args);
		}

		public IntegerDMO getServRuleVas(String serviceCode, Integer subscriberId)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("getServRuleVas", 2);
			args.andFilterBy("getServRuleVas").arg(serviceCode).arg(subscriberId);
			
			return (IntegerDMO) dao.get("getServRuleVas", args);
		}

		public AudAddressDMO getLteAudDetails(String accountNo)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("getLteAudDetails", 1);
			args.andFilterBy("getLteAudDetails").arg(accountNo);
			
			return (AudAddressDMO) dao.get("getLteAudDetails", args);
		}

		public UdvUserdocDelivDMO getUdvCustSubSystem(String accountNo,
				String typeDoc) throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("getUdvCustSubSystem", 2);
			args.andFilterBy("getUdvCustSubSystem").arg(accountNo).arg(typeDoc);
			
			return (UdvUserdocDelivDMO) dao.get("getUdvCustSubSystem", args);
		}

		public StringDMO getChgMaxEffectiveDate(String chgCde, String netid,
				Date chargeDate, String chargef) throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("getChgMaxEffectiveDate", 4);
			args.andFilterBy("getChgMaxEffectiveDate").arg(chgCde).arg(netid).arg(chargeDate).arg(chargef);
			
			return (StringDMO) dao.get("getChgMaxEffectiveDate", args);
		}

		public VasActiveServiceDMO getSubscriberVasServiceCodeTariff(
				Integer subscriberId, String serviceCode, String interTariff)
				throws EPPIXSeriousException {
			DAOParamQueryArgs args = new DAOParamQueryArgs("getSubscriberVasServiceCodeTariff", 3);
			args.andFilterBy("getSubscriberVasServiceCodeTariff").arg(subscriberId).arg(serviceCode).arg(interTariff);
			
			return (VasActiveServiceDMO) dao.get("getSubscriberVasServiceCodeTariff", args);
		}



}
