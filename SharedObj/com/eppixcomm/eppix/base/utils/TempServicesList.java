package com.eppixcomm.eppix.base.utils;

import java.util.List;

import com.eppixcomm.eppix.soa.sharedservices.blo.CmpServlinkmsisdnDMO;
import com.eppixcomm.eppix.soa.sharedservices.blo.CmpSimlinkmsisdnDMO;

public class TempServicesList {
	CmpServlinkmsisdnDMO servLinkMsisdnDMO;
	CmpSimlinkmsisdnDMO simLinkMsisdnDMO;
	TmpServiceAction tmpServiceActionDMO;
		
	public TempServicesList(){
		
	}

	public void put(CmpServlinkmsisdnDMO servLinkMsisdnDmo, CmpSimlinkmsisdnDMO simLinkMsisdnDmo, TmpServiceAction tmpServiceActionDmo){
		this.servLinkMsisdnDMO = servLinkMsisdnDmo;
		this.simLinkMsisdnDMO = simLinkMsisdnDmo;
		this.tmpServiceActionDMO = tmpServiceActionDmo;
	}

	public CmpServlinkmsisdnDMO getServLinkMsisdnDMO() {
		return servLinkMsisdnDMO;
	}

	public void setServLinkMsisdnDMO(CmpServlinkmsisdnDMO servLinkMsisdnDMO) {
		this.servLinkMsisdnDMO = servLinkMsisdnDMO;
	}

	public CmpSimlinkmsisdnDMO getSimLinkMsisdnDMO() {
		return simLinkMsisdnDMO;
	}

	public void setSimLinkMsisdnDMO(CmpSimlinkmsisdnDMO simLinkMsisdnDMO) {
		this.simLinkMsisdnDMO = simLinkMsisdnDMO;
	}

	public TmpServiceAction getTmpServiceActionDMO() {
		return tmpServiceActionDMO;
	}

	public void setTmpServiceActionDMO(TmpServiceAction tmpServiceActionDMO) {
		this.tmpServiceActionDMO = tmpServiceActionDMO;
	}

}
