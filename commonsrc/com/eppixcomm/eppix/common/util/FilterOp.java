package com.eppixcomm.eppix.common.util;

import com.eppixcomm.eppix.base.error.EPPIXBusinessException;

/**
 * Enumeration of Filters available for retrieving sets of data. 
 * 
 * @author bruce.henderson
 *
 */
public class FilterOp {

  /**
   * A = B
   */
  public static final int EQUAL = 0;

  //  {
  //    public String get() {
  //      return "equal";
  //    }
  //
  //    public  FilterPart add(int index, T value) {
  //      return new FilterPart(EQUAL, index, value);
  //    }
  //
  //    /**
  //     * @deprecated
  //     */
  //    public FilterPart add(int index, Object lowValue, Object highValue)
  //        throws EPPIXBusinessException {
  //      throw new EPPIXBusinessException("Not implemented - use other add()");
  //    }
  //  },
  /**
   * A < B
   */
  public static final int LESSTHAN = 1;

  //  {
  //    public String get() {
  //      return "lessthan";
  //    }
  //
  //    public  FilterPart add(int index, T value) {
  //      return new FilterPart(LESSTHAN, index, value);
  //    }
  //
  //    /**
  //     * @deprecated
  //     */
  //    public FilterPart add(int index, Object lowValue, Object highValue)
  //        throws EPPIXBusinessException {
  //      throw new EPPIXBusinessException("Not implemented - use other add()");
  //    }
  //  },
  /**
   * A > B
   */
  public static final int GREATERTHAN = 2;

  //  {
  //    public String get() {
  //      return "greaterthan";
  //    }
  //
  //    public  FilterPart add(int index, T value) {
  //      return new FilterPart(GREATERTHAN, index, value);
  //    }
  //
  //    /**
  //     * @deprecated
  //     */
  //    public FilterPart add(int index, Object lowValue, Object highValue)
  //        throws EPPIXBusinessException {
  //      throw new EPPIXBusinessException("Not implemented - use other add()");
  //    }
  //  },
  /**
   * A <= B
   */
  public static final int LESSTHANOREQUAL = 3;

  //  {
  //    public String get() {
  //      return "lessthanorequal";
  //    }
  //
  //    public  FilterPart add(int index, T value) {
  //      return new FilterPart(LESSTHANOREQUAL, index, value);
  //    }
  //
  //    /**
  //     * @deprecated
  //     */
  //    public FilterPart add(int index, Object lowValue, Object highValue)
  //        throws EPPIXBusinessException {
  //      throw new EPPIXBusinessException("Not implemented - use other add()");
  //    }
  //  },
  /**
   * A >= B
   */
  public static final int GREATERTHANOREQUAL = 4;

  //  {
  //    public String get() {
  //      return "greaterthanorequal";
  //    }
  //
  //    public  FilterPart add(int index, T value) {
  //      return new FilterPart(GREATERTHANOREQUAL, index, value);
  //    }
  //
  //    /**
  //     * @deprecated
  //     */
  //    public FilterPart add(int index, Object lowValue, Object highValue)
  //        throws EPPIXBusinessException {
  //      throw new EPPIXBusinessException("Not implemented - use other add()");
  //    }
  //  },
  /**
   * A between B and C
   */
  public static final int BETWEEN = 5;

  /**
   * A like B
   */
  public static final int LIKE = 6;

  //  {
  //    public String get() {
  //      return "like";
  //    }
  //
  //    public  FilterPart add(int index, T value) {
  //      return new FilterPart(LIKE, index, value);
  //    }
  //
  //    /**
  //     * @deprecated
  //     */
  //    public FilterPart add(int index, Object lowValue, Object highValue)
  //        throws EPPIXBusinessException {
  //      throw new EPPIXBusinessException("Not implemented - use other add()");
  //    }
  //  },
  /**
   * A beginswith B
   */
  public static final int BEGINSWITH = 7;

  //  {
  //    public String get() {
  //      return "beginswith";
  //    }
  //
  //    public  FilterPart add(int index, T value) {
  //      return new FilterPart(BEGINSWITH, index, value);
  //    }
  //
  //    /**
  //     * @deprecated
  //     */
  //    public FilterPart add(int index, Object lowValue, Object highValue)
  //        throws EPPIXBusinessException {
  //      throw new EPPIXBusinessException("Not implemented - use other add()");
  //    }
  //  },
  /**
   * A ends with B
   */
  public static final int ENDSWITH = 8;

  //  {
  //    public String get() {
  //      return "endswith";
  //    }
  //
  //    public  FilterPart add(int index, T value) {
  //      return new FilterPart(ENDSWITH, index, value);
  //    }
  //
  //    /**
  //     * @deprecated
  //     */
  //    public FilterPart add(int index, Object lowValue, Object highValue)
  //        throws EPPIXBusinessException {
  //      throw new EPPIXBusinessException("Not implemented - use other add()");
  //    }
  //  },
  /**
   * Any A
   */
  public static final int ANY = 9;

  //  {
  //    public String get() {
  //      return "any";
  //    }
  //
  //    public  FilterPart add(int index, T value) {
  //      return new FilterPart(ANY, index, value);
  //    }
  //
  //    /**
  //     * @deprecated
  //     */
  //    public FilterPart add(int index, Object lowValue, Object highValue)
  //        throws EPPIXBusinessException {
  //      throw new EPPIXBusinessException("Not implemented - use other add()");
  //    }
  //  },
  /**
   * (A IS NULL or LENGTH(A) = 0)
   */
  public static final int NULL = 10;
  
  //  {
  //    public String get() {
  //      return "null";
  //    }
  //
  //    public  FilterPart add(int index, T value) {
  //      return new FilterPart(NULL, index, value);
  //    }
  //
  //    /**
  //     * @deprecated
  //     */
  //    public FilterPart add(int index, Object lowValue, Object highValue)
  //        throws EPPIXBusinessException {
  //      throw new EPPIXBusinessException("Not implemented - use other add()");
  //    }
  //  },
  /**
   * ORDER BY A ASC
   */
  public static final int ORDERBYASC = 11;

  //  {
  //    public String get() {
  //      return "orderByAsc";
  //    }
  //
  //    public  FilterPart add(int index, T value) {
  //      return new FilterPart(ORDERBYASC, index, value);
  //    }
  //
  //    /**
  //     * @deprecated
  //     */
  //    public FilterPart add(int index, Object lowValue, Object highValue)
  //        throws EPPIXBusinessException {
  //      throw new EPPIXBusinessException("Not implemented - use other add()");
  //    }
  //  },
  /**
   * ORDER BY A DESC
   */
  public static final int ORDERBYDESC = 12;

  //  {
  //    public String get() {
  //      return "orderByDesc";
  //    }
  //
  //    public  FilterPart add(int index, T value) {
  //      return new FilterPart(ORDERBYDESC, index, value);
  //    }
  //
  //    /**
  //     * @deprecated
  //     */
  //    public FilterPart add(int index, Object lowValue, Object highValue)
  //        throws EPPIXBusinessException {
  //      throw new EPPIXBusinessException("Not implemented - use other add()");
  //    }
  //  },
  public static final int SET = 13;

  //  {
  //    public String get() {
  //      return "SET";
  //    }
  //
  //    public  FilterPart add(int index, T value) {
  //      return new FilterPart(SET, index, value);
  //    }
  //
  //    /**
  //     * @deprecated
  //     */
  //    public FilterPart add(int index, Object lowValue, Object highValue)
  //        throws EPPIXBusinessException {
  //      throw new EPPIXBusinessException("Not implemented - use other add()");
  //    }
  //  },
  /**
   * MAX ( A )
   */
  public static final int MAX = 14;

  //  {
  //    public String get() {
  //      return "MAX";
  //    }
  //
  //    public  FilterPart add(int index, T value) {
  //      return new FilterPart(MAX, index, value);
  //    }
  //
  //    /**
  //     * @deprecated
  //     */
  //    public FilterPart add(int index, Object lowValue, Object highValue)
  //        throws EPPIXBusinessException {
  //      throw new EPPIXBusinessException("Not implemented - use other add()");
  //    }
  //  },
  /**
   * A IN ( B )
   */
  public static final int IN = 15;

  //  {
  //    public String get() {
  //      return "IN";
  //    }
  //
  //    public  FilterPart add(int index, T value) {
  //      return new FilterPart(IN, index, value);
  //    }
  //
  //    /**
  //     * @deprecated
  //     */
  //    public FilterPart add(int index, Object lowValue, Object highValue)
  //        throws EPPIXBusinessException {
  //      throw new EPPIXBusinessException("Not implemented - use other add()");
  //    }
  //  },
  /**
   * A != B
   */
  public static final int NOTEQUAL = 16;

  //  {
  //    public String get() {
  //      return "notequal";
  //    }
  //
  //    public  FilterPart add(int index, T value) {
  //      return new FilterPart(NOTEQUAL, index, value);
  //    }
  //
  //    /**
  //     * @deprecated
  //     */
  //    public FilterPart add(int index, Object lowValue, Object highValue)
  //        throws EPPIXBusinessException {
  //      throw new EPPIXBusinessException("Not implemented - use other add()");
  //    }
  //  },
  /**
   * A NOT IN ( B )
   */
  public static final int NOTIN = 17;

  //  {
  //    public String get() {
  //      return "NOTIN";
  //    }
  //
  //    public  FilterPart add(int index, T value) {
  //      return new FilterPart(NOTIN, index, value);
  //    }
  //
  //    /**
  //     * @deprecated
  //     */
  //    public FilterPart add(int index, Object lowValue, Object highValue)
  //        throws EPPIXBusinessException {
  //      throw new EPPIXBusinessException("Not implemented - use other add()");
  //    }
  //  },

  /**
   * (A = B OR A IS NULL)
   */
  public static final int EQUALORNULL = 18;

  //  {
  //    public String get() {
  //      return "equalornull";
  //    }
  //
  //    public  FilterPart add(int index, T value) {
  //      return new FilterPart(EQUALORNULL, index, value);
  //    }
  //
  //    /**
  //     * @deprecated
  //     */
  //    public FilterPart add(int index, Object lowValue, Object highValue)
  //        throws EPPIXBusinessException {
  //      throw new EPPIXBusinessException("Not implemented - use other add()");
  //    }
  //  },
  /**
   * MIN ( A )
   */
  public static final int MIN = 19;

  //  {
  //    public String get() {
  //      return "min";
  //    }
  //
  //    public  FilterPart add(int index, T value) {
  //      return new FilterPart(MIN, index, value);
  //    }
  //
  //    /**
  //     * @deprecated
  //     */
  //    public FilterPart add(int index, Object lowValue, Object highValue)
  //        throws EPPIXBusinessException {
  //      throw new EPPIXBusinessException("Not implemented - use other add()");
  //    }
  //  },
  /**
   * A = A - x
   */
  public static final int SET_SUBTRACTFROM = 20;

  //  {
  //    public String get() {
  //      return "SET_SUBTRACTFROM";
  //    }
  //
  //    public  FilterPart add(int index, T value) {
  //      return new FilterPart(SET_SUBTRACTFROM, index, value);
  //    }
  //
  //    /**
  //     * @deprecated
  //     */
  //    public FilterPart add(int index, Object lowValue, Object highValue)
  //        throws EPPIXBusinessException {
  //      throw new EPPIXBusinessException("Not implemented - use other add()");
  //    }
  //  },
  /**
   * A = A + x
   */
  public static final int SET_ADDTO = 21;

  //  {
  //    public String get() {
  //      return "SET_ADDTO";
  //    }
  //
  //    public  FilterPart add(int index, T value) {
  //      return new FilterPart(SET_ADDTO, index, value);
  //    }
  //
  //    /**
  //     * @deprecated
  //     */
  //    public FilterPart add(int index, Object lowValue, Object highValue)
  //        throws EPPIXBusinessException {
  //      throw new EPPIXBusinessException("Not implemented - use other add()");
  //    }
  //  },
  /**
   * A IS NOT NULL
   */
  public static final int NOTNULL = 22;

  //  {
  //    public String get() {
  //      return "notnull";
  //    }
  //
  //    public  FilterPart add(int index, T value) {
  //      return new FilterPart(NOTNULL, index, value);
  //    }
  //
  //    /**
  //     * @deprecated
  //     */
  //    public FilterPart add(int index, Object lowValue, Object highValue)
  //        throws EPPIXBusinessException {
  //      throw new EPPIXBusinessException("Not implemented - use other add()");
  //    }
  //  },
  /**
   * (A < B OR A IS NULL)
   */
  public static final int LESSTHANORNULL = 23;

  //  {
  //    public String get() {
  //      return "lessthanornull";
  //    }
  //
  //    public  FilterPart add(int index, T value) {
  //      return new FilterPart(LESSTHANORNULL, index, value);
  //    }
  //
  //    /**
  //     * @deprecated
  //     */
  //    public FilterPart add(int index, Object lowValue, Object highValue)
  //        throws EPPIXBusinessException {
  //      throw new EPPIXBusinessException("Not implemented - use other add()");
  //    }
  //  },
  /**
   * (A > B OR A IS NULL)
   */
  public static final int GREATERTHANORNULL = 24;

  //  {
  //    public String get() {
  //      return "greaterthanornull";
  //    }
  //
  //    public  FilterPart add(int index, T value) {
  //      return new FilterPart(GREATERTHANORNULL, index, value);
  //    }
  //
  //    /**
  //     * @deprecated
  //     */
  //    public FilterPart add(int index, Object lowValue, Object highValue)
  //        throws EPPIXBusinessException {
  //      throw new EPPIXBusinessException("Not implemented - use other add()");
  //    }
  //  };

  //  public abstract  FilterPart add(int index, T value)
  //      throws EPPIXBusinessException;
  //
  //  public abstract  FilterPart add(int index, T lowValue, T highValue)
  //      throws EPPIXBusinessException;

  public static String get(int filterType) {
    switch (filterType) {
    case EQUAL:
      return "equal";
    case LESSTHAN:
      return "lessthan";
    case GREATERTHAN:
      return "greaterthan";
    case LESSTHANOREQUAL:
      return "lessthanorequal";
    case GREATERTHANOREQUAL:
      return "greaterthanorequal";
    case BETWEEN:
      return "between";
    case LIKE:
      return "like";
    case BEGINSWITH:
      return "beginswith";
    case ENDSWITH:
      return "endswith";
    case ANY:
      return "any";
    case NULL:
      return "null";
    case ORDERBYASC:
      return "orderByAsc";
    case ORDERBYDESC:
      return "orderByDesc";
    case SET:
      return "SET";
    case MAX:
      return "MAX";
    case IN:
      return "IN";
    case NOTEQUAL:
      return "notequal";
    case NOTIN:
      return "NOTIN";
    case EQUALORNULL:
      return "equalornull";
    case MIN:
      return "min";
    case SET_SUBTRACTFROM:
      return "SET_SUBTRACTFROM";
    case SET_ADDTO:
      return "SET_ADDTO";
    case NOTNULL:
      return "notnull";
    case LESSTHANORNULL:
      return "lessthanornull";
    case GREATERTHANORNULL:

    }
    return null;
  }
}
