package com.eppixcomm.eppix.base.utils;

import com.eppixcomm.eppix.base.blo.PsdParamServDetDMO;

public class TmpPrmsLinkServ implements Comparable<TmpPrmsLinkServ> {
	private Integer psdSerialId; // TUTD
	private Integer pshId;
	private String pshServiceCode;
	private String pshMsisdnNo;
	private Integer pshSubsriberId;
	private Integer psdParamId;
	private String psdParamValue;
	private Double psdChgValue;

	public Integer getPshId() {
		return pshId;
	}

	public void setPshId(Integer pshId) {
		this.pshId = pshId;
	}

	public String getPshServiceCode() {
		return pshServiceCode;
	}

	public void setPshServiceCode(String pshServiceCode) {
		this.pshServiceCode = pshServiceCode;
	}

	public String getPshMsisdnNo() {
		return pshMsisdnNo;
	}

	public void setPshMsisdnNo(String pshMsisdnNo) {
		this.pshMsisdnNo = pshMsisdnNo;
	}

	public Integer getPshSubsriberId() {
		return pshSubsriberId;
	}

	public void setPshSubsriberId(Integer pshSubsriberId) {
		this.pshSubsriberId = pshSubsriberId;
	}

	public Integer getPsdParamId() {
		return psdParamId;
	}

	public void setPsdParamId(Integer psdParamId) {
		this.psdParamId = psdParamId;
	}

	public String getPsdParamValue() {
		return psdParamValue;
	}

	public void setPsdParamValue(String psdParamValue) {
		this.psdParamValue = psdParamValue;
	}

	public int compareTo(TmpPrmsLinkServ obj) {
		if (!(obj instanceof TmpPrmsLinkServ))
			throw new ClassCastException("TmpPrmsLinkServ object Expected.");

		int result = psdParamId.compareTo(((TmpPrmsLinkServ) obj).psdParamId);
		if (result != 0) {
			return result;
		} else {
			result = pshSubsriberId
					.compareTo(((TmpPrmsLinkServ) obj).pshSubsriberId);
		}

		return result;
	}

	public Integer getPsdSerialId() {
		return psdSerialId;
	}

	public void setPsdSerialId(Integer psdSerialId) {
		this.psdSerialId = psdSerialId;
	}

	public Double getPsdChgValue() {
		return psdChgValue;
	}

	public void setPsdChgValue(Double psdChgValue) {
		this.psdChgValue = psdChgValue;
	}

	@Override
	public String toString() {
		return "\nTmpPrmsLinkServ [\npsdSerialId=" + psdSerialId + "\npshId="
				+ pshId + "\npshServiceCode=" + pshServiceCode
				+ "\npshMsisdnNo=" + pshMsisdnNo + "\npshSubsriberId="
				+ pshSubsriberId + "\npsdParamId=" + psdParamId
				+ "\npsdParamValue=" + psdParamValue + "\npsdChgValue="
				+ psdChgValue + "]";
	}

}
