package com.eppixcomm.eppix.base.utils;

public class SSRSoaValues {
	private String sourceIdentifier;
	private String transactionId;
	private String accessId;
	private String action;
	private String msisdn;
	private String productCode;
	private String transSeq;
	private String effectiveDate;
	private String productFee;
	private String newSpul;
	private boolean spulAdjusted;
	private boolean productAdded;
	private String errorCode;
	private String errorStr;

	public String getSourceIdentifier() {
		return sourceIdentifier;
	}

	public void setSourceIdentifier(String sourceIdentifier) {
		this.sourceIdentifier = sourceIdentifier;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public String getAccessId() {
		return accessId;
	}

	public void setAccessId(String accessId) {
		this.accessId = accessId;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getMsisdn() {
		return msisdn;
	}

	public void setMsisdn(String msisdn) {
		this.msisdn = msisdn;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getTransSeq() {
		return transSeq;
	}

	public void setTransSeq(String transSeq) {
		this.transSeq = transSeq;
	}

	public String getEffectiveDate() {
		return effectiveDate;
	}

	public void setEffectiveDate(String effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public String getProductFee() {
		return productFee;
	}

	public void setProductFee(String productFee) {
		this.productFee = productFee;
	}

	public String getNewSpul() {
		return newSpul;
	}

	public void setNewSpul(String newSpul) {
		this.newSpul = newSpul;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorStr() {
		return errorStr;
	}

	public void setErrorStr(String errorStr) {
		this.errorStr = errorStr;
	}

	public boolean isSpulAdjusted() {
		return spulAdjusted;
	}

	public void setSpulAdjusted(boolean spulAdjusted) {
		this.spulAdjusted = spulAdjusted;
	}

	public boolean isProductAdded() {
		return productAdded;
	}

	public void setProductAdded(boolean productAdded) {
		this.productAdded = productAdded;
	}

	@Override
	public String toString() {
		return "SSRSoaValues [\nsourceIdentifier=" + sourceIdentifier + "\ntransactionId=" + transactionId + "\naccessId="
				+ accessId + "\naction=" + action + "\nmsisdn=" + msisdn + "\nproductCode=" + productCode
				+ "\ntransSeq=" + transSeq + "\neffectiveDate=" + effectiveDate + "\nproductFee=" + productFee
				+ "\nnewSpul=" + newSpul + "\nspulAdjusted=" + spulAdjusted + "\nproductAdded=" + productAdded
				+ "\nerrorCode=" + errorCode + "\nerrorStr=" + errorStr + "]";
	}

}
