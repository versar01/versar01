/* ====================================================================== *
 * (c) Copyright Eppixcomm Tech Ltd.                                      *
 * All Rights Reserved                                                    *
 *                                                                        *
 * Legal Information                                                      *
 * ====================================================================== */
package com.eppixcomm.eppix.common.data;

/**
 * Parameterised query arguments. A convenience class used to construct and pass 
 * arguments to DAO methods that are driven by a parameterised query. 
 *  
 * @author $Author$
 */
public class DAOParamQueryArgs extends DAOArgs {

  /** DML name used to identify the parameterised query in the DMLFactory. */
  private String dmlName;

  /** Concatenated filterBy identifier that is passed to the query. */
  private StringBuffer filterByBuffer = new StringBuffer();

  private StringBuffer filterTypes = new StringBuffer();

  /** Name that identifies the order by clause in the DMLFactory. */
  private String orderBy;

  private StringBuffer setBuffer = new StringBuffer();

  /**
   * Create a new DAOParamQueryArgs object.
   * 
   * @param dmlName name used to identify the parameterised query in the 
   *        DMLFactory.
   * @param maxFilterArgs the maximum number of filter arguments that can be 
   *        appended via the arg() methods.
   */
  public DAOParamQueryArgs(String dmlName, int maxFilterArgs) {
    super(maxFilterArgs);
    this.dmlName = dmlName;
  }

  /**
   * Appends a filterBy identifier to the concatenated filterBy identifier that 
   * will be passed to the query. If a filter has already been added then the 
   * 'and' operator ("+") is appended first.
   * 
   * @param filterBy name of a filter (defined for dmlName) in the DMLFactory.
   * 
   * @return this DAOParamQueryArgs object.
   */
  public DAOParamQueryArgs andFilterBy(String filterBy) {

    if (filterBy != null && filterBy.length() > 0) {

      if (filterByBuffer.length() > 0) {
        filterByBuffer.append('+');
      }
      filterByBuffer.append(filterBy);
      filterTypes.append('+');
    }
    return this;
  }

  public DAOParamQueryArgs orFilterBy(String filterBy) {

    if (filterBy != null && filterBy.length() > 0) {

      if (filterTypes.length() == 1 && "+".equals(filterTypes.substring(0, 1))) {
    	  filterByBuffer.append('~');
      }

      if (filterByBuffer.length() > 0) {
        filterByBuffer.append('|');
      }
      filterByBuffer.append(filterBy);
      filterTypes.append('|');
    }
    return this;
  }

  public DAOParamQueryArgs setEquals(int field) {

    //if (field != null && field.length() > 0) {

    if (setBuffer.length() > 0) {
      setBuffer.append('|');
    }
    setBuffer.append('=').append(field);
    // }
    return this;
  }

  public DAOParamQueryArgs setAdd(int field) {

    // if (field != null && field.length() > 0) {

    if (setBuffer.length() > 0) {
      setBuffer.append('|');
    }
    setBuffer.append('+').append(field);
    //  }
    return this;
  }

  public DAOParamQueryArgs setSubtract(int field) {

    //if (field != null && field.length() > 0) {

    if (setBuffer.length() > 0) {
      setBuffer.append('|');
    }
    setBuffer.append('-').append(field);
    //}
    return this;
  }

  /**
   * Retrieves the concatenated filterBy identifier string.
   * 
   * @return filterBy identifier string.
   */
  public String getFilterBy() {
    return filterByBuffer.toString();
  }

  /**
   * Retrieves the DML name string used to identify the parameterised query in 
   * the DMLFactory.
   * 
   * @return DML name string.
   */
  public String getDMLName() {
    return dmlName;
  }

  /**
   * Retrieves the OrderBy identifier string that identifies the order by clause 
   * in the DMLFactory.
   * 
   * @return OrderBy identifier string.
   */
  public String getOrderBy() {
    return orderBy;
  }

  /**
   * Sets the DML name used to identify the parameterised query in the 
   * DMLFactory.
   * 
   * @param dmlName DML name string. 
   * 
   * @return this DAOParamQueryArgs object.
   */
  public DAOParamQueryArgs setDMLName(String dmlName) {
    this.dmlName = dmlName;
    return this;
  }

  /**
   * Sets the orderBy identifier string that identifies the order by clause in 
   * the DMLFactory.
   * 
   * @param orderBy orderBy identifier string. 
   * 
   * @return this DAOParamQueryArgs object.
   */
  public DAOParamQueryArgs setOrderBy(String orderBy) {
    this.orderBy = orderBy;
    return this;
  }

  public String getSetArgs() {
    return setBuffer.toString();
  }

  public String getFilterTypes() {
    return filterTypes.toString();
  }

}
