package com.eppixcomm.eppix.common.data;

public class KeyTable {

  private String name;

  private int index;

  public static final KeyTable SYSDIRM = new KeyTable("SYSDIRM", 0);

  public static final KeyTable SKS_KEY_SETTING = new KeyTable(
      "SKS_KEY_SETTING", 1);

  private KeyTable(String string, int i) {
    name = string;
    index = i;
  }

}
