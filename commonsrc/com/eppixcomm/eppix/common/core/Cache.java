package com.eppixcomm.eppix.common.core;

import com.eppixcomm.eppix.base.blo.BaseBLOBinder;

public class Cache {

  private BaseBLOBinder base;

  public Cache(BaseBLOBinder base) {
    this.base = base;
  }

  protected BaseBLOBinder getBase() {
    synchronized (this) {
      return base;
    }
  }

  protected void setBase(BaseBLOBinder newBase) {
    if (base != newBase) {
      synchronized (this) {
        if (base != newBase) {
          if (base.isClosed()) {
            base = newBase;
          }
        }
      }
    }
  }

}
