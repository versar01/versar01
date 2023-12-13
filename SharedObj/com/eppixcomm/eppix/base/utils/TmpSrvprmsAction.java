package com.eppixcomm.eppix.base.utils;

import java.math.BigDecimal;

public class TmpSrvprmsAction  implements Comparable<TmpSrvprmsAction>{
	
	private String tpaSimNo;
	private String tpaParamAction;
	private String tpaServiceOne;
	private Integer tpaParamIdOne;
	private String tpaParamNameOne;
	private String tpaSubCharge;
	private BigDecimal tpaSubPrice;
	private String tpaDeactChg;
	private BigDecimal tpaDeactPrice;
	private String tpaDeactChgInd;
	private String tpaServiceTwo;
	private Integer tpaParamIdTwo;
	private String tpaParamNameTwo;
	private String tpaSubChargeTwo;
	private BigDecimal tpaSubPriceTwo;
	private String tpaActChg;
	private BigDecimal tpaActPrice;
	private String tpaActChgInd;
	private String tpaMigInd;
	private String tpaProrata;
	
	public String getTpaParamAction(){
		return tpaParamAction;
	}
	public void setTpaParamAction(String tpaParamAction) {
		this.tpaParamAction = tpaParamAction;
	}
	public String getTpaServiceOne() {
		return tpaServiceOne;
	}
	public void setTpaServiceOne(String tpaServiceOne) {
		this.tpaServiceOne = tpaServiceOne;
	}
	public Integer getTpaParamIdOne() {
		return tpaParamIdOne;
	}
	public void setTpaParamIdOne(Integer tpaParamIdOne) {
		this.tpaParamIdOne = tpaParamIdOne;
	}
	public String getTpaParamNameOne() {
		return tpaParamNameOne;
	}
	public void setTpaParamNameOne(String tpaParamNameOne) {
		this.tpaParamNameOne = tpaParamNameOne;
	}
	public String getTpaSubCharge() {
		return tpaSubCharge;
	}
	public void setTpaSubCharge(String tpaSubCharge) {
		this.tpaSubCharge = tpaSubCharge;
	}
	public BigDecimal getTpaSubPrice() {
		return tpaSubPrice;
	}
	public void setTpaSubPrice(BigDecimal tpaSubPrice) {
		this.tpaSubPrice = tpaSubPrice;
	}
	public String getTpaDeactChg() {
		return tpaDeactChg;
	}
	public void setTpaDeactChg(String tpaDeactChg) {
		this.tpaDeactChg = tpaDeactChg;
	}
	public BigDecimal getTpaDeactPrice() {
		return tpaDeactPrice;
	}
	public void setTpaDeactPrice(BigDecimal tpaDeactPrice) {
		this.tpaDeactPrice = tpaDeactPrice;
	}
	public String getTpaDeactChgInd() {
		return tpaDeactChgInd;
	}
	public void setTpaDeactChgInd(String tpaDeactChgInd) {
		this.tpaDeactChgInd = tpaDeactChgInd;
	}
	public String getTpaServiceTwo() {
		return tpaServiceTwo;
	}
	public void setTpaServiceTwo(String tpaServiceTwo) {
		this.tpaServiceTwo = tpaServiceTwo;
	}
	public Integer getTpaParamIdTwo() {
		return tpaParamIdTwo;
	}
	public void setTpaParamIdTwo(Integer tpaParamIdTwo) {
		this.tpaParamIdTwo = tpaParamIdTwo;
	}
	public String getTpaParamNameTwo() {
		return tpaParamNameTwo;
	}
	public void setTpaParamNameTwo(String tpaParamNameTwo) {
		this.tpaParamNameTwo = tpaParamNameTwo;
	}
	public String getTpaSubChargeTwo() {
		return tpaSubChargeTwo;
	}
	public void setTpaSubChargeTwo(String tpaSubChargeTwo) {
		this.tpaSubChargeTwo = tpaSubChargeTwo;
	}
	public BigDecimal getTpaSubPriceTwo() {
		return tpaSubPriceTwo;
	}
	public void setTpaSubPriceTwo(BigDecimal tpaSubPriceTwo) {
		this.tpaSubPriceTwo = tpaSubPriceTwo;
	}
	public String getTpaActChg() {
		return tpaActChg;
	}
	public void setTpaActChg(String tpaActChg) {
		this.tpaActChg = tpaActChg;
	}
	public BigDecimal getTpaActPrice() {
		return tpaActPrice;
	}
	public void setTpaActPrice(BigDecimal tpaActPrice) {
		this.tpaActPrice = tpaActPrice;
	}
	public String getTpaActChgInd() {
		return tpaActChgInd;
	}
	public void setTpaActChgInd(String tpaActChgInd) {
		this.tpaActChgInd = tpaActChgInd;
	}
	public String getTpaMigInd() {
		return tpaMigInd;
	}
	public void setTpaMigInd(String tpaMigInd) {
		this.tpaMigInd = tpaMigInd;
	}
	public String getTpaProrata() {
		return tpaProrata;
	}
	public void setTpaProrata(String tpaProrata) {
		this.tpaProrata = tpaProrata;
	}

	public int compareTo(TmpSrvprmsAction obj) {
		
		if (!(obj instanceof TmpSrvprmsAction))
		      throw new ClassCastException("TmpSrvprmsAction object Expected.");
		 
		int result = tpaParamAction.compareTo(((TmpSrvprmsAction)obj).tpaParamAction);
		if(result != 0){
			return result;
		}else{
			result = tpaParamIdOne.compareTo(((TmpSrvprmsAction)obj).tpaParamIdOne);
			
			if(result != 0){
				return result;
			}else{
				result = tpaParamIdTwo.compareTo(((TmpSrvprmsAction)obj).tpaParamIdTwo);
			}
		}
		
		return result;
	}
	@Override
	public String toString() {
		return "\nTmpSrvprmsAction [\ntpaParamAction=" + tpaParamAction
				+ "\ntpaServiceOne=" + tpaServiceOne + "\ntpaParamIdOne="
				+ tpaParamIdOne + "\ntpaParamNameOne=" + tpaParamNameOne
				+ "\ntpaSubCharge=" + tpaSubCharge + "\ntpaSubPrice="
				+ tpaSubPrice + "\ntpaDeactChg=" + tpaDeactChg
				+ "\ntpaDeactPrice=" + tpaDeactPrice + "\ntpaDeactChgInd="
				+ tpaDeactChgInd + "\ntpaServiceTwo=" + tpaServiceTwo
				+ "\ntpaParamIdTwo=" + tpaParamIdTwo + "\ntpaParamNameTwo="
				+ tpaParamNameTwo + "\ntpaSubChargeTwo=" + tpaSubChargeTwo
				+ "\ntpaSubPriceTwo=" + tpaSubPriceTwo + "\ntpaActChg="
				+ tpaActChg + "\ntpaActPrice=" + tpaActPrice
				+ "\ntpaActChgInd=" + tpaActChgInd + "\ntpaMigInd=" + tpaMigInd
				+ "\ntpaProrata=" + tpaProrata + "\ntpaSimNo=" + tpaSimNo + "]";
	}
	public String getTpaSimNo() {
		return tpaSimNo;
	}
	public void setTpaSimNo(String tpaSimNo) {
		this.tpaSimNo = tpaSimNo;
	}
	
	
}

