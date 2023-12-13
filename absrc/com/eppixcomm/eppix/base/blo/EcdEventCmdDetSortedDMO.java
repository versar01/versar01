package com.eppixcomm.eppix.base.blo;

import com.eppixcomm.eppix.common.util.DateTime;

public class EcdEventCmdDetSortedDMO extends EcdEventCmdDetDMO implements Comparable{

	private Integer priority;
	private String paramValue;
	private String segment;
	
	public EcdEventCmdDetSortedDMO(){
		super();
		System.out.println("TEXT RECIEVED HERE: ");
	}
	
	public EcdEventCmdDetSortedDMO( 
		    final String ecdCommand,
		    final Short  ecdSeqno,
		    final String ecdDetType,
		    final String ecdText,
		    final String ecdFlag,
		    final DateTime ecdTimeStamp){
		super(ecdCommand,ecdSeqno,
				ecdDetType,ecdText,
				ecdFlag,ecdTimeStamp);
		
		System.out.println("TEXT RECIEVED HERE: " + ecdText);
	}

	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	public String getParamValue() {
		return paramValue;
	}

	public void setParamValue(String paramValue) {
		this.paramValue = paramValue;
	}

	public Integer getPriority() {
		return priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	public String getSegment() {
		return segment;
	}

	public void setSegment(String segment) {
		this.segment = segment;
	}
	

}
