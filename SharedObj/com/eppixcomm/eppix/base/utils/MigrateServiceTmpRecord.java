package com.eppixcomm.eppix.base.utils;

import com.eppixcomm.eppix.base.blo.TsTariffServiceDMO;
import com.eppixcomm.eppix.base.blo.VasActiveServiceDMO;
import com.eppixcomm.eppix.base.blo.VpsPackageServDMO;
import com.eppixcomm.eppix.base.blo.VsrServiceDMO;
import com.eppixcomm.eppix.common.util.Date;
import com.eppixcomm.eppix.soa.sharedservices.blo.PshPsdDQO;

public class MigrateServiceTmpRecord {
	// Globals
//	mr_services ARRAY[1001] OF RECORD
//		os_code						LIKE vsr_service.vsr_service_code,
//		os_action					CHAR(2),
//		os_description				LIKE vsr_service.vsr_service_desc,
//		os_sub1						LIKE vas_active_service.vas_sub_charge1,
//		os_sub2						LIKE vas_active_service.vas_sub_charge2,
//		os_sub3						LIKE vas_active_service.vas_sub_charge3,
//		os_deacCharge				LIKE ts_tariff_service.ts_pdeact_charge,
//		os_charge_deact				CHAR(1),
//		os_multi					LIKE vps_package_serv.vps_multi_charge,
//		ns_code						LIKE vsr_service.vsr_service_code,
//		ns_action					CHAR(2),
//		ns_description				LIKE vsr_service.vsr_service_desc,
//		ns_sub1						LIKE vas_active_service.vas_sub_charge1,
//		ns_sub2						LIKE vas_active_service.vas_sub_charge2,
//		ns_sub3						LIKE vas_active_service.vas_sub_charge3,
//		ns_actcharge				LIKE ts_tariff_service.ts_act_charge,
//		ns_charge_act				CHAR(1),
//		ns_multi					LIKE vps_package_serv.vps_multi_charge,
//		servicetype					LIKE vsr_service.vsr_service_type,
//		prorata_subs				LIKE vsr_service.vsr_prorata,
//		osns_mapped					CHAR(1),
//		sim_no						LIKE smn_sim_nos.smn_sim_no
	
//	l_ParamHeadID           LIKE psh_param_serv_hdr.psh_id,
//	l_Archived              LIKE psh_param_serv_hdr.psh_archived,
//	l_ParamID               LIKE psd_param_serv_det.psd_param_id,
//	l_ParamActDate          LIKE psd_param_serv_det.psd_act_date,
//	l_ParamTermDate         LIKE psd_param_serv_det.psd_term_date,
//	l_ParamValue            LIKE psd_param_serv_det.psd_param_value,
//	l_N2NString             LIKE psd_param_serv_det.psd_n2n_string,
//	l_ParamActive           LIKE psd_param_serv_det.psd_param_active,
//	l_ParamDeactDate        LIKE psd_param_serv_det.psd_deac_date,
//	l_ParamSubCharge		LIKE psd_param_serv_det.psd_sub_charge,		##SR - 03/02/2016 - M2U
//	l_ParamChgValue         LIKE psd_param_serv_det.psd_chg_value,
//	l_ParamActType			LIKE psd_param_serv_det.psd_act_type,		##SR - 03/02/2016 - M2U
//	l_ParamActionDate		LIKE psd_param_serv_det.psd_action_date		##SR - 03/02/2016 - M2U
	
	
//	END RECORD,
	
		private String osCode;
		private String os_action;
		private String os_description;
		private String os_sub1;
		private String os_sub2;
		private String os_sub3;
		private String os_deacCharge;
		private String os_charge_deact;
		private String os_multi;
		private String ns_code;
		private String ns_action;
		private String ns_description;
		private String ns_sub1;
		private String ns_sub2;
		private String ns_sub3;
		private String ns_actcharge;
		private String ns_charge_act;
		private String ns_multi;
		private String servicetype;
		private String prorata_subs;
		private String osns_mapped;
		private String sim_no;
		
		private Integer paramHeadID;
		private String archived;
		private Integer paramID;
		private Date paramActDate;
		private Date paramTermDate;
		private String paramValue;
		private String n2NString;
		private String paramActive;
		private Date paramDeactDate;
		private String paramSubCharge;
		private Double paramChgValue;
		private String paramActType;
		private Date paramActionDate;

		
		public String getOsCode() {
			return osCode;
		}
		public void setOsCode(String osCode) {
			this.osCode = osCode;
		}
		public String getOs_action() {
			return os_action;
		}
		public void setOs_action(String os_action) {
			this.os_action = os_action;
		}
		public String getOs_description() {
			return os_description;
		}
		public void setOs_description(String os_description) {
			this.os_description = os_description;
		}
		public String getOs_sub1() {
			return os_sub1;
		}
		public void setOs_sub1(String os_sub1) {
			this.os_sub1 = os_sub1;
		}
		public String getOs_sub2() {
			return os_sub2;
		}
		public void setOs_sub2(String os_sub2) {
			this.os_sub2 = os_sub2;
		}
		public String getOs_sub3() {
			return os_sub3;
		}
		public void setOs_sub3(String os_sub3) {
			this.os_sub3 = os_sub3;
		}
		public String getOs_deacCharge() {
			return os_deacCharge;
		}
		public void setOs_deacCharge(String os_deacCharge) {
			this.os_deacCharge = os_deacCharge;
		}
		public String getOs_charge_deact() {
			return os_charge_deact;
		}
		public void setOs_charge_deact(String os_charge_deact) {
			this.os_charge_deact = os_charge_deact;
		}
		public String getOs_multi() {
			return os_multi;
		}
		public void setOs_multi(String os_multi) {
			this.os_multi = os_multi;
		}
		public String getNs_code() {
			return ns_code;
		}
		public void setNs_code(String ns_code) {
			this.ns_code = ns_code;
		}
		public String getNs_action() {
			return ns_action;
		}
		public void setNs_action(String ns_action) {
			this.ns_action = ns_action;
		}
		public String getNs_description() {
			return ns_description;
		}
		public void setNs_description(String ns_description) {
			this.ns_description = ns_description;
		}
		public String getNs_sub1() {
			return ns_sub1;
		}
		public void setNs_sub1(String ns_sub1) {
			this.ns_sub1 = ns_sub1;
		}
		public String getNs_sub2() {
			return ns_sub2;
		}
		public void setNs_sub2(String ns_sub2) {
			this.ns_sub2 = ns_sub2;
		}
		public String getNs_sub3() {
			return ns_sub3;
		}
		public void setNs_sub3(String ns_sub3) {
			this.ns_sub3 = ns_sub3;
		}
		public String getNs_actcharge() {
			return ns_actcharge;
		}
		public void setNs_actcharge(String ns_actcharge) {
			this.ns_actcharge = ns_actcharge;
		}
		public String getNs_charge_act() {
			return ns_charge_act;
		}
		public void setNs_charge_act(String ns_charge_act) {
			this.ns_charge_act = ns_charge_act;
		}
		public String getNs_multi() {
			return ns_multi;
		}
		public void setNs_multi(String ns_multi) {
			this.ns_multi = ns_multi;
		}
		public String getServicetype() {
			return servicetype;
		}
		public void setServicetype(String servicetype) {
			this.servicetype = servicetype;
		}
		public String getProrata_subs() {
			return prorata_subs;
		}
		public void setProrata_subs(String prorata_subs) {
			this.prorata_subs = prorata_subs;
		}
		public String getOsns_mapped() {
			return osns_mapped;
		}
		public void setOsns_mapped(String osns_mapped) {
			this.osns_mapped = osns_mapped;
		}
		public String getSim_no() {
			return sim_no;
		}
		public void setSim_no(String sim_no) {
			this.sim_no = sim_no;
		}
		public Integer getParamHeadID() {
			return paramHeadID;
		}
		public void setParamHeadID(Integer paramHeadID) {
			this.paramHeadID = paramHeadID;
		}
		public String getArchived() {
			return archived;
		}
		public void setArchived(String archived) {
			this.archived = archived;
		}
		public Integer getParamID() {
			return paramID;
		}
		public void setParamID(Integer paramID) {
			this.paramID = paramID;
		}
		public Date getParamActDate() {
			return paramActDate;
		}
		public void setParamActDate(Date paramActDate) {
			this.paramActDate = paramActDate;
		}
		public Date getParamTermDate() {
			return paramTermDate;
		}
		public void setParamTermDate(Date paramTermDate) {
			this.paramTermDate = paramTermDate;
		}
		public String getParamValue() {
			return paramValue;
		}
		public void setParamValue(String paramValue) {
			this.paramValue = paramValue;
		}
		public String getN2NString() {
			return n2NString;
		}
		public void setN2NString(String n2nString) {
			n2NString = n2nString;
		}
		public String getParamActive() {
			return paramActive;
		}
		public void setParamActive(String paramActive) {
			this.paramActive = paramActive;
		}
		public Date getParamDeactDate() {
			return paramDeactDate;
		}
		public void setParamDeactDate(Date paramDeactDate) {
			this.paramDeactDate = paramDeactDate;
		}
		public String getParamSubCharge() {
			return paramSubCharge;
		}
		public void setParamSubCharge(String paramSubCharge) {
			this.paramSubCharge = paramSubCharge;
		}
		public Double getParamChgValue() {
			return paramChgValue;
		}
		public void setParamChgValue(Double paramChgValue) {
			this.paramChgValue = paramChgValue;
		}
		public String getParamActType() {
			return paramActType;
		}
		public void setParamActType(String paramActType) {
			this.paramActType = paramActType;
		}
		public Date getParamActionDate() {
			return paramActionDate;
		}
		public void setParamActionDate(Date paramActionDate) {
			this.paramActionDate = paramActionDate;
		}
		@Override
		public String toString() {
			return "\nMigrateServiceTmpRecord [\nosCode=" + osCode + "\nos_action="
					+ os_action + "\nos_description=" + os_description
					+ "\nos_sub1=" + os_sub1 + "\nos_sub2=" + os_sub2
					+ "\nos_sub3=" + os_sub3 + "\nos_deacCharge="
					+ os_deacCharge + "\nos_charge_deact=" + os_charge_deact
					+ "\nos_multi=" + os_multi + "\nns_code=" + ns_code
					+ "\nns_action=" + ns_action + "\nns_description="
					+ ns_description + "\nns_sub1=" + ns_sub1 + "\nns_sub2="
					+ ns_sub2 + "\nns_sub3=" + ns_sub3 + "\nns_actcharge="
					+ ns_actcharge + "\nns_charge_act=" + ns_charge_act
					+ "\nns_multi=" + ns_multi + "\nservicetype=" + servicetype
					+ "\nprorata_subs=" + prorata_subs + "\nosns_mapped="
					+ osns_mapped + "\nsim_no=" + sim_no + "\nparamHeadID="
					+ paramHeadID + "\narchived=" + archived + "\nparamID="
					+ paramID + "\nparamActDate=" + paramActDate
					+ "\nparamTermDate=" + paramTermDate + "\nparamValue="
					+ paramValue + "\nn2NString=" + n2NString
					+ "\nparamActive=" + paramActive + "\nparamDeactDate="
					+ paramDeactDate + "\nparamSubCharge=" + paramSubCharge
					+ "\nparamChgValue=" + paramChgValue + "\nparamActType="
					+ paramActType + "\nparamActionDate=" + paramActionDate
					+ "]";
		}
		
	
}
