package com.eppixcomm.eppix.base.dml;

import com.eppixcomm.eppix.base.blo.SmhSimHistoryDMO;
import com.eppixcomm.eppix.soa.sharedservices.blo.AuxSbdVamDQO;

public class SimAPNServicesDMLFactory extends BaseDMLFactory {

	private static SimAPNServicesDML dml = null;

	public static DMLFactory getDMLFactory() throws DMLException {
		if (dml == null) {
			dml = new SimAPNServicesDML();
		}
		return dml;
	}

		public SimAPNServicesDMLFactory() throws DMLException{
			super();
			
			defStaticQuery("getAsrBySubscriberSim", ".base.blo.AsrAddServReqDMO", 
					"SELECT * FROM ASR_ADD_SERV_REQ WHERE ASR_SUBSCRIBER_ID = ?  "
					+ "AND ASR_SIM_NO = ? ORDER BY ASR_TRANSACT_ID", true);
			
			defStaticQuery("getSerialCustomer",
					".soa.sharedservices.blo.ScSerialCustomerDMO",
					"SELECT SC_SERIAL, SC_BILL_AC_NO " + "FROM SC_SERIAL_CUSTOMER "
							+ "WHERE SC_BILL_AC_NO = ?", false);
			
			defStaticQuery("getEppixHierarchyByType",
					".soa.sharedservices.blo.EhEppixHierarchyDMO",
					"SELECT EH_SERIAL, EH_ENTITY_ID, EH_TYPE, EH_VALUE, EH_LINK, EH_HIER_TYPE "
							+ "FROM EH_EPPIX_HIERARCHY "
							+ "WHERE EH_ENTITY_ID = ? " + "AND EH_LINK = ? ", false);

			defStaticQuery("getEppixHierarchyBySerial",
					".soa.sharedservices.blo.EhEppixHierarchyDMO",
					"SELECT EH_SERIAL, EH_ENTITY_ID, EH_TYPE, EH_VALUE, EH_LINK, EH_HIER_TYPE "
							+ "FROM EH_EPPIX_HIERARCHY " + "WHERE EH_SERIAL = ? ",
					false);
			
			defStaticQuery("getMasterEhHh", ".soa.sharedservices.blo.EhHhDQO",
					"SELECT eh.*, hh.* FROM eh_eppix_hierarchy eh, hh_hierarchy_head hh "
							+ "WHERE eh.eh_entity_id = hh.hh_serial "
							+ "AND hh.hh_serial = ? " + "AND eh.eh_hier_type = ? "
							+ "AND eh.eh_type = ? ", false);

			defStaticQuery("getMasterLinkEhHh", ".soa.sharedservices.blo.EhHhDQO",
					"SELECT eh.*, hh.* FROM eh_eppix_hierarchy eh, hh_hierarchy_head hh "
							+ "WHERE eh.eh_entity_id = hh.hh_serial "
							+ "AND eh.eh_serial = ? " + "AND eh.eh_hier_type = ? "
							+ "AND eh.eh_type = ? ", false);
			
		defStaticQuery("getPartnerIdLinkHhEh", ".soa.sharedservices.blo.HhHierarchyHeadDMO",
					"SELECT hh_type, hh_serial, hh_name, hh_active_date, hh_deactive_date FROM hh_hierarchy_head"
							+ " WHERE hh_name = ? and hh_type = 'APNMANAGE';", false);
		

		defStaticQuery("getSmhHistory", ".common.data.StringDMO", "select FIRST 1 smh_sim_history.smh_Comment from smh_sim_history "
				+ "where smh_subscriber_id = ? "
				+ "and smh_sim_no = ? "
				+ "and smh_hist_code = 'ETD' "
				+ "order by smh_timestamp desc", false);
		}

}
