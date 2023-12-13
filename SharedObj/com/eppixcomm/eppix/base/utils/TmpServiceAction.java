package com.eppixcomm.eppix.base.utils;

public class TmpServiceAction  implements Comparable<TmpServiceAction>{
	
	private String tsaServiceAction;
	private String tsaServiceOne;
	private String tsaTariffOne;
	private String tsaAct_chgOne;
	private String tsaDeactChgOne;
	private String tsaSubChg1One;
	private String tsaSubChg2One;
	private String tsaSubChg3One;
	private String tsaMultiOne;
	private String tsaServiceTwo;
	private String tsaTariffTwo;
	private String tsaAct_chgTwo;
	private String tsaDeactChgTwo;
	private String tsaSubChg1Two;
	private String tsaSubChg2Two;
	private String tsaSubChg3Two;
	private String tsaMultiTwo;
	private String tsaServiceType;
	private String tsaProrata;
	private String tsaSimNo;
	

	public int compareTo(TmpServiceAction obj) throws ClassCastException {
		if (!(obj instanceof TmpServiceAction))
		      throw new ClassCastException("TmpServiceAction object Expected.");
		 
		int result = tsaSimNo.compareTo(((TmpServiceAction)obj).tsaSimNo);

		
		if(result != 0){
			return result;
		}else{
			result = tsaServiceOne.compareTo(((TmpServiceAction)obj).tsaServiceOne);
			
			if(result != 0){
				return result;
			}else{
				result = tsaServiceAction.compareTo(((TmpServiceAction)obj).tsaServiceAction);
				
				if(result != 0){
					return result;
				}else{
					result = tsaTariffOne.compareTo(((TmpServiceAction)obj).tsaTariffOne);
				}
			}
		}
		
		
		return result;
	}


	public String getTsaServiceAction() {
		return tsaServiceAction;
	}


	public void setTsaServiceAction(String tsaServiceAction) {
		this.tsaServiceAction = tsaServiceAction;
	}


	public String getTsaServiceOne() {
		return tsaServiceOne;
	}


	public void setTsaServiceOne(String tsaServiceOne) {
		this.tsaServiceOne = tsaServiceOne;
	}


	public String getTsaTariffOne() {
		return tsaTariffOne;
	}


	public void setTsaTariffOne(String tsaTariffOne) {
		this.tsaTariffOne = tsaTariffOne;
	}


	public String getTsaAct_chgOne() {
		return tsaAct_chgOne;
	}


	public void setTsaAct_chgOne(String tsaAct_chgOne) {
		this.tsaAct_chgOne = tsaAct_chgOne;
	}


	public String getTsaDeactChgOne() {
		return tsaDeactChgOne;
	}


	public void setTsaDeactChgOne(String tsaDeactChgOne) {
		this.tsaDeactChgOne = tsaDeactChgOne;
	}


	public String getTsaSubChg1One() {
		return tsaSubChg1One;
	}


	public void setTsaSubChg1One(String tsaSubChg1One) {
		this.tsaSubChg1One = tsaSubChg1One;
	}


	public String getTsaSubChg2One() {
		return tsaSubChg2One;
	}


	public void setTsaSubChg2One(String tsaSubChg2One) {
		this.tsaSubChg2One = tsaSubChg2One;
	}


	public String getTsaSubChg3One() {
		return tsaSubChg3One;
	}


	public void setTsaSubChg3One(String tsaSubChg3One) {
		this.tsaSubChg3One = tsaSubChg3One;
	}


	public String getTsaMultiOne() {
		return tsaMultiOne;
	}


	public void setTsaMultiOne(String tsaMultiOne) {
		this.tsaMultiOne = tsaMultiOne;
	}


	public String getTsaServiceTwo() {
		return tsaServiceTwo;
	}


	public void setTsaServiceTwo(String tsaServiceTwo) {
		this.tsaServiceTwo = tsaServiceTwo;
	}


	public String getTsaTariffTwo() {
		return tsaTariffTwo;
	}


	public void setTsaTariffTwo(String tsaTariffTwo) {
		this.tsaTariffTwo = tsaTariffTwo;
	}


	public String getTsaAct_chgTwo() {
		return tsaAct_chgTwo;
	}


	public void setTsaAct_chgTwo(String tsaAct_chgTwo) {
		this.tsaAct_chgTwo = tsaAct_chgTwo;
	}


	public String getTsaDeactChgTwo() {
		return tsaDeactChgTwo;
	}


	public void setTsaDeactChgTwo(String tsaDeactChgTwo) {
		this.tsaDeactChgTwo = tsaDeactChgTwo;
	}


	public String getTsaSubChg1Two() {
		return tsaSubChg1Two;
	}


	public void setTsaSubChg1Two(String tsaSubChg1Two) {
		this.tsaSubChg1Two = tsaSubChg1Two;
	}


	public String getTsaSubChg2Two() {
		return tsaSubChg2Two;
	}


	public void setTsaSubChg2Two(String tsaSubChg2Two) {
		this.tsaSubChg2Two = tsaSubChg2Two;
	}


	public String getTsaSubChg3Two() {
		return tsaSubChg3Two;
	}


	public void setTsaSubChg3Two(String tsaSubChg3Two) {
		this.tsaSubChg3Two = tsaSubChg3Two;
	}


	public String getTsaMultiTwo() {
		return tsaMultiTwo;
	}


	public void setTsaMultiTwo(String tsaMultiTwo) {
		this.tsaMultiTwo = tsaMultiTwo;
	}


	public String getTsaServiceType() {
		return tsaServiceType;
	}


	public void setTsaServiceType(String tsaServiceType) {
		this.tsaServiceType = tsaServiceType;
	}


	public String getTsaProrata() {
		return tsaProrata;
	}


	public void setTsaProrata(String tsaProrata) {
		this.tsaProrata = tsaProrata;
	}


	public String getTsaSimNo() {
		return tsaSimNo;
	}


	public void setTsaSimNo(String tsaSimNo) {
		this.tsaSimNo = tsaSimNo;
	}
	
	public String toString(){
		
		return "\ntsaServiceAction " + tsaServiceAction +
				"\ntsaServiceOne " + tsaServiceOne +
				"\ntsaTariffOne " + tsaTariffOne +
				"\ntsaAct_chgOne " + tsaAct_chgOne +
				"\ntsaDeactChgOne " + tsaDeactChgOne +
				"\ntsaSubChg1One " + tsaSubChg1One +
				"\ntsaSubChg2One " + tsaSubChg2One +
				"\ntsaSubChg3One " + tsaSubChg3One +
				"\ntsaMultiOne " + tsaMultiOne +
				"\ntsaServiceTwo " + tsaServiceTwo +
				"\ntsaTariffTwo " + tsaTariffTwo +
				"\ntsaAct_chgTwo " + tsaAct_chgTwo +
				"\ntsaDeactChgTwo " + tsaDeactChgTwo +
				"\ntsaSubChg1Two " + tsaSubChg1Two +
				"\ntsaSubChg2Two " + tsaSubChg2Two +
				"\ntsaSubChg3Two " + tsaSubChg3Two +
				"\ntsaMultiTwo " + tsaMultiTwo +
				"\ntsaServiceType " + tsaServiceType +
				"\ntsaProrata " + tsaProrata +
				"\ntsaSimNo " + tsaSimNo;
		
	}

}
