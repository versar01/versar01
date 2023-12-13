package com.eppixcomm.eppix.common.blo;

public abstract class Report {
  
  private String filename;
  private Object[] headerArgs;
  
  int line = 0;
  int page = 1;
  int pageLength = 22;
  
  public Report(String filename, int pageLength, Object[] headerArgs) {
    this.filename = filename;
    this.pageLength = pageLength;
  }
  
  public void print(Object[] args) {
    if (line == 0 || line >= pageLength) {
      header();
      line = 0;
    }
    line++;
  }
  
  public abstract void header() ;
    
}
