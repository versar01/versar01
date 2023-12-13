package com.eppixcomm.eppix.base.utils;

import com.eppixcomm.eppix.soa.sharedservices.blo.CmpServlinkmsisdnDMO;
import com.eppixcomm.eppix.soa.sharedservices.blo.CmpSimlinkmsisdnDMO;

public class TempSrvPrmsLinkList {
	private TmpSrvprmsAction tmpAction;
	private TmpPrmsLinkServ prmLinkServ;
	
	public TempSrvPrmsLinkList(){
		
	}
	
	public void put(TmpSrvprmsAction tmpaction, TmpPrmsLinkServ prmlinkserv){
		this.tmpAction = tmpaction;
		this.prmLinkServ = prmlinkserv;
	}

	public TmpSrvprmsAction getTmpAction() {
		return tmpAction;
	}

	public void setTmpAction(TmpSrvprmsAction tmpAction) {
		this.tmpAction = tmpAction;
	}

	public TmpPrmsLinkServ getPrmLinkServ() {
		return prmLinkServ;
	}

	public void setPrmLinkServ(TmpPrmsLinkServ prmLinkServ) {
		this.prmLinkServ = prmLinkServ;
	}

}
