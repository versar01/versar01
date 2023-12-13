package com.eppixcomm.eppix.base.utils;

public class ServiceCreateNonBasicReturnRecord {

  String command;
  Integer seqNo;
  String ecMessage;
  String networkPrefix;

  public ServiceCreateNonBasicReturnRecord(String command, Integer seqNo,
      String ecMessage, String networkPrefix) {
    this.command = command;
    this.seqNo = seqNo;
    this.ecMessage = ecMessage;
    this.networkPrefix = networkPrefix;
  }

  public String getCommand() {
    return command;
  }

  public void setCommand(String command) {
    this.command = command;
  }

  public Integer getSeqNo() {
    return seqNo;
  }

  public void setSeqNo(Integer seqNo) {
    this.seqNo = seqNo;
  }

  public String getEcMessage() {
    return ecMessage;
  }

  public void setEcMessage(String ecMessage) {
    this.ecMessage = ecMessage;
  }

  public String getNetworkPrefix() {
    return networkPrefix;
  }

  public void setNetworkPrefix(String networkPrefix) {
    this.networkPrefix = networkPrefix;
  }

}