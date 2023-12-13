package com.eppixcomm.eppix.base.utils;

public class SimMaskCheck {
	Integer simLength;
	String containHlr;
	Integer lengthHlr;
	Integer positionHlr;
	Integer positionNumber;
	Integer lengthNumber;
	String contChkDigit;
	Integer lenChkDigit;
	Integer posChkDigit;
	
	public Integer getSimLength() {
		return simLength;
	}
	public void setSimLength(Integer simLength) {
		this.simLength = simLength;
	}
	public String getContainHlr() {
		return containHlr;
	}
	public void setContainHlr(String containHlr) {
		this.containHlr = containHlr;
	}
	public Integer getLengthHlr() {
		return lengthHlr;
	}
	public void setLengthHlr(Integer lengthHlr) {
		this.lengthHlr = lengthHlr;
	}
	public Integer getPositionHlr() {
		return positionHlr;
	}
	public void setPositionHlr(Integer positionHlr) {
		this.positionHlr = positionHlr;
	}
	public Integer getPositionNumber() {
		return positionNumber;
	}
	public void setPositionNumber(Integer positionNumber) {
		this.positionNumber = positionNumber;
	}
	public Integer getLengthNumber() {
		return lengthNumber;
	}
	public void setLengthNumber(Integer lengthNumber) {
		this.lengthNumber = lengthNumber;
	}
	public String getContChkDigit() {
		return contChkDigit;
	}
	public void setContChkDigit(String contChkDigit) {
		this.contChkDigit = contChkDigit;
	}
	public Integer getLenChkDigit() {
		return lenChkDigit;
	}
	public void setLenChkDigit(Integer lenChkDigit) {
		this.lenChkDigit = lenChkDigit;
	}
	public Integer getPosChkDigit() {
		return posChkDigit;
	}
	public void setPosChkDigit(Integer posChkDigit) {
		this.posChkDigit = posChkDigit;
	}
	@Override
	public String toString() {
		return "SimMaskCheck \n" +
				"\nsimLength=" + simLength + 
				"\ncontainHlr="	+ containHlr + 
				"\nlengthHlr=" + lengthHlr + 
				"\npositionHlr=" + positionHlr + 
				"\npositionNumber=" + positionNumber + 
				"\nlengthNumber=" + lengthNumber + 
				"\ncontChkDigit="	+ contChkDigit + 
				"\nlenChkDigit=" + lenChkDigit	+ 
				"\nposChkDigit=" + posChkDigit;
	}

}
