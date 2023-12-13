package com.eppixcomm.eppix.base.utils;

import java.math.BigDecimal;

public class EarlyTerminationValues {

	BigDecimal totSubscriptionLeft = new BigDecimal("0.00");
	BigDecimal totProratedFee = new BigDecimal("0.00");
	BigDecimal totClawback = new BigDecimal("0.00");
	BigDecimal totUnbilledCalls = new BigDecimal("0.00");
	BigDecimal totOutstandingBalance = new BigDecimal("0.00");
    
    
	public BigDecimal getTotSubscriptionLeft() {
		return totSubscriptionLeft;
	}
	public void setTotSubscriptionLeft(BigDecimal totSubscriptionLeft) {
		this.totSubscriptionLeft.add(totSubscriptionLeft);
	}
	public BigDecimal getTotProratedFee() {
		return totProratedFee;
	}
	public void setTotProratedFee(BigDecimal totProratedFee) {
		this.totProratedFee.add(totProratedFee);
	}
	public BigDecimal getTotClawback() {
		return totClawback;
	}
	public void setTotClawback(BigDecimal totClawback) {
		this.totClawback.add(totClawback);
	}
	public BigDecimal getTotUnbilledCalls() {
		return totUnbilledCalls;
	}
	public void setTotUnbilledCalls(BigDecimal totUnbilledCalls) {
		this.totUnbilledCalls.add(totUnbilledCalls);
	}
	public BigDecimal getTotOutstandingBalance() {
		return totOutstandingBalance;
	}
	public void setTotOutstandingBalance(BigDecimal totOutstandingBalance) {
		this.totOutstandingBalance.add(totOutstandingBalance);
	}
    
    
	
}
