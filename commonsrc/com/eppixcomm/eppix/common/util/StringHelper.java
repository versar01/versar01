package com.eppixcomm.eppix.common.util;

import java.util.StringTokenizer;

public class StringHelper {

  /**
   * Returns the given string with the first character uppercase.
   * 
   * @param string
   */
  public static String toUcase(String string) {

    if (string == null)
      return null;
    else if (string.length() == 0)
      return "";
    else {
      char[] charArray = string.toCharArray();
      charArray[0] = Character.toUpperCase(charArray[0]);
      return new String(charArray);
    }
  }

  /**
   * Returns the given string with the first character lowercase.
   * 
   * @param string
   * @return the formatted string.
   */
  public static String toLcase(String string) {

    if (string == null)
      return null;
    else if (string.length() == 0)
      return "";
    else {
      char[] charArray = string.toCharArray();
      charArray[0] = Character.toLowerCase(charArray[0]);
      return new String(charArray);
    }
  }

  /**
   * Returns the given string with underscores removed and following characters changed to
   * uppercase.
   * 
   * For example : 
   * 
   *     some_table_name
   * 
   * becomes
   * 
   *     someTableName
   * 
   * @param underscoreSeperatedPhrase
   * @return the formatted string.
   */
  public static String underscoreSeperatedToCamelCase(
      String underscoreSeperatedPhrase) {

    if (underscoreSeperatedPhrase == null)
      return null;
    else {

      StringBuffer camelCasePhrase = new StringBuffer(underscoreSeperatedPhrase
          .length());

      StringTokenizer st = new StringTokenizer(underscoreSeperatedPhrase, "_");
      while (st.hasMoreTokens()) {
        camelCasePhrase.append(StringHelper.toUcase(st.nextToken()
            .toLowerCase()));
      }
      return camelCasePhrase.toString();
    }
  }

}
