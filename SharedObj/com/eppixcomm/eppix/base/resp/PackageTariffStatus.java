package com.eppixcomm.eppix.base.resp;

public class PackageTariffStatus {
	// Globals
	boolean packageActive;
	boolean tariffActive;

	public boolean isPackageActive() {
		return packageActive;
	}

	public void setPackageActive(boolean packageActive) {
		this.packageActive = packageActive;
	}

	public boolean isTariffActive() {
		return tariffActive;
	}

	public void setTariffActive(boolean tariffActive) {
		this.tariffActive = tariffActive;
	}

}
