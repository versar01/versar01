/* ====================================================================== *
 * (c) Copyright Eppixcomm Tech Ltd.                                      *
 * All Rights Reserved                                                    *
 *                                                                        *
 * Legal Information                                                      *
 * ====================================================================== */
package com.eppixcomm.eppix.base.dml;

import com.eppixcomm.eppix.common.data.DMO;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * DOCUMENT ME!
 *
 * @version $Revision: 1.3 $
 * @author $author$
 * @since $jdk$
 */
public class DMLFactory {
  /** DOCUMENT ME! */
  private String moduleCode;

  /** DOCUMENT ME! */
  private String packageName;

  /** DOCUMENT ME! */
  private String dmlPackage;

  /** DOCUMENT ME! */
  private String dmoPackage;

  /** DOCUMENT ME! */
  private Map dmlList = Collections
      .synchronizedMap(new HashMap());

  /** DOCUMENT ME! */
  private Map dmoList = Collections
      .synchronizedMap(new HashMap());

  //  private boolean hasPrimaryKey = true;

  /**
   * Creates a new DMLFactory object.
   *
   * @param moduleName DOCUMENT ME!
   * @param moduleCode DOCUMENT ME!
   *
   * @throws DMLException DOCUMENT ME!
   */
  protected DMLFactory(String moduleName, String moduleCode)
      throws DMLException {
    if ((moduleName == null) || (moduleName.length() == 0)) {
      throw new DMLException("Parameter 'moduleName' is required.");
    }

    if ((moduleCode == null) || (moduleCode.length() == 0)) {
      throw new DMLException("Parameter 'moduleCode' is required.");
    }

    this.packageName = "com.eppixcomm.eppix.base.";
    this.dmlPackage = packageName + "dml.";
    this.dmoPackage = packageName + "blo.";
    this.moduleCode = moduleCode;
  }

  /**
   * DOCUMENT ME!
   *
   * @param dmlName DOCUMENT ME!
   * @param dmoName DOCUMENT ME!
   * @param tableName DOCUMENT ME!
   * @param numColumns DOCUMENT ME!
   * @param columnList DOCUMENT ME!
   * @param primaryKey DOCUMENT ME!
   * @param versionCol DOCUMENT ME!
   * @param generateKey DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   *
   * @throws DMLException DOCUMENT ME!
   */
  protected DMLTable defTable(String dmlName, String dmoName, String tableName,
      int numColumns, String columnList, String primaryKey, String versionCol,
      boolean generateKey) throws DMLException {
    return defTable(dmlName, dmoName, tableName, numColumns, columnList,
        primaryKey, versionCol, generateKey, null, null, null, null, true);
  }

  /**
   * DOCUMENT ME!
   *
   * @param dmlName DOCUMENT ME!
   * @param dmoName DOCUMENT ME!
   * @param tableName DOCUMENT ME!
   * @param numColumns DOCUMENT ME!
   * @param columnList DOCUMENT ME!
   * @param primaryKey DOCUMENT ME!
   * @param versionCol DOCUMENT ME!
   * @param generateKey DOCUMENT ME!
   * @param selectList DOCUMENT ME!
   * @param fromTables DOCUMENT ME!
   * @param joinWhere DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   *
   * @throws DMLException DOCUMENT ME!
   */
  protected DMLTable defTable(String dmlName, String dmoName, String tableName,
      int numColumns, String columnList, String primaryKey, String versionCol,
      boolean generateKey, String selectList, String fromTables,
      String joinWhere, String[] fields, boolean hasPrimaryKey)
      throws DMLException {
    dmoName = prefixDMOName(dmoName);

    DMLTable table = new DMLTable(dmlName, dmoName, tableName, numColumns,
        columnList, primaryKey, versionCol, generateKey, selectList,
        fromTables, joinWhere, fields, hasPrimaryKey);
    put(dmlName, table);

    DML d = (DML) dmoList.get(dmoName);

    if (d != null) {
      throw new DMLException("DML '" + d.dmlName
          + "' already defined for DMO '" + dmoName + "'.");
    }

    dmoList.put(dmoName, table);

    return table;
  }

  protected DMLTable defTable(String dmlName, String dmoName, String tableName,
      int numColumns, String columnList, String primaryKey, String versionCol,
      boolean generateKey, String selectList, String fromTables,
      String joinWhere) throws DMLException {
    return defTable(dmlName, dmoName, tableName, numColumns, columnList,
        primaryKey, versionCol, generateKey, selectList, fromTables, joinWhere,
        null, true);
  }

  protected DMLTable defTable(String dmlName, String dmoName, String tableName,
      int numColumns, String columnList, String primaryKey, String versionCol,
      boolean generateKey, String selectList, String fromTables,
      String joinWhere, boolean hasPrimaryKey) throws DMLException {
    return defTable(dmlName, dmoName, tableName, numColumns, columnList,
        primaryKey, versionCol, generateKey, selectList, fromTables, joinWhere,
        null, hasPrimaryKey);
  }

  protected DMLTable defTable(String dmlName, String dmoName, String tableName,
      int numColumns, String columnList, String primaryKey, String versionCol,
      boolean generateKey, String selectList, String fromTables,
      String joinWhere, String[] fields) throws DMLException {
    return defTable(dmlName, dmoName, tableName, numColumns, columnList,
        primaryKey, versionCol, generateKey, selectList, fromTables, joinWhere,
        fields, true);
  }

  /**
   * DOCUMENT ME!
   *
   * @param dmlName DOCUMENT ME!
   * @param dmoName DOCUMENT ME!
   * @param selectList DOCUMENT ME!
   * @param primaryKey DOCUMENT ME!
   * @param fromTables DOCUMENT ME!
   * @param joinWhere DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   *
   * @throws DMLException DOCUMENT ME!
   */
  protected DMLParamQuery defParamQuery(String dmlName, String dmoName,
      String selectList, String primaryKey, String fromTables, String joinWhere)
      throws DMLException {
    dmoName = prefixDMOName(dmoName);

    DMLParamQuery query = new DMLParamQuery(dmlName, dmoName, selectList,
        primaryKey, fromTables, joinWhere);
    dmlList.put(dmlName, query);

    return query;
  }

  /**
   * DOCUMENT ME!
   *
   * @param dmlName DOCUMENT ME!
   * @param dmoName DOCUMENT ME!
   * @param selectStmt DOCUMENT ME!
   * @param isMultiRow DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   *
   * @throws DMLException DOCUMENT ME!
   */
  protected DMLStaticQuery defStaticQuery(String dmlName, String dmoName,
      String selectStmt, boolean isMultiRow) throws DMLException {
    dmoName = prefixDMOName(dmoName);

    DMLStaticQuery query = new DMLStaticQuery(dmlName, dmoName, selectStmt,
        isMultiRow);
    dmlList.put(dmlName, query);

    return query;
  }

  /**
   * DOCUMENT ME!
   *
   * @param dmlName DOCUMENT ME!
   * @param dmoName DOCUMENT ME!
   * @param dmlClassName DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   *
   * @throws DMLException DOCUMENT ME!
   */
  protected DMLDynamicQuery defDynamicQuery(String dmlName, String dmoName,
      String dmlClassName) throws DMLException {
    if ((dmlName == null) || (dmlName.length() == 0)) {
      throw new DMLException("Parameter 'dmlName' is required.");
    }

    if ((dmlClassName == null) || (dmlClassName.length() == 0)) {
      throw new DMLException("Parameter 'dmlClassName' is required.");
    }

    Class dmlClass;

    try {
      dmlClass = Class.forName(dmlPackage + dmlClassName);
    } catch (ClassNotFoundException e) {
      throw new DMLException("DML class '" + dmlClassName + "' not found: "
          + e.toString());
    }

    DMLDynamicQuery query;

    try {
      query = (DMLDynamicQuery) dmlClass.newInstance();
      query.dmlName = dmlName;
      query.dmoName = prefixDMOName(dmoName);
    } catch (InstantiationException e) {
      throw new DMLException("DML class '" + dmlClassName
          + "' not instantiated: " + e.toString());
    } catch (IllegalAccessException e) {
      throw new DMLException(e.toString());
    }

    dmlList.put(dmlName, query);

    return query;
  }

  /**
   * DOCUMENT ME!
   *
   * @param dmlName DOCUMENT ME!
   * @param updateStmt DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   *
   * @throws DMLException DOCUMENT ME!
   */
  public DMLStaticUpdate defStaticUpdate(String dmlName, String updateStmt)
      throws DMLException {
    DMLStaticUpdate update = new DMLStaticUpdate(dmlName, updateStmt);
    dmlList.put(dmlName, update);

    return update;
  }

  /**
   * DOCUMENT ME!
   *
   * @param dmlName DOCUMENT ME!
   * @param dmlClassName DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   *
   * @throws DMLException DOCUMENT ME!
   */
  protected DMLDynamicUpdate defDynamicUpdate(String dmlName,
      String dmlClassName) throws DMLException {
    if ((dmlName == null) || (dmlName.length() == 0)) {
      throw new DMLException("Parameter 'dmlName' is required.");
    }

    if ((dmlClassName == null) || (dmlClassName.length() == 0)) {
      throw new DMLException("Parameter 'dmlClassName' is required.");
    }

    Class dmlClass;

    try {
      dmlClass = Class.forName(dmlPackage + dmlClassName);
    } catch (ClassNotFoundException e) {
      throw new DMLException("DML class '" + dmlClassName + "' not found: "
          + e.toString());
    }

    DMLDynamicUpdate update;

    try {
      update = (DMLDynamicUpdate) dmlClass.newInstance();
      update.dmlName = dmlName;
    } catch (InstantiationException e) {
      throw new DMLException("DML class '" + dmlClassName
          + "' not instantiated: " + e.toString());
    } catch (IllegalAccessException e) {
      throw new DMLException(e.toString());
    }

    dmlList.put(dmlName, update);

    return update;
  }

  /**
   * Prefixes the dmoName with the default dmo package name for the module if
   * no sub-package name is provided. If the dmoName already includes a
   * sub-package name, then it is prefixed with the package name for the
   * module.
   *
   * @param dmoName DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   *
   * @throws DMLException DOCUMENT ME!
   */
  private String prefixDMOName(String dmoName) throws DMLException {
    if ((dmoName == null) || (dmoName.length() == 0)) {
      throw new DMLException("Parameter 'dmoName' is required.");
    }
    int i = dmoName.indexOf('.');
    return (i == 0) ? ("com.eppixcomm.eppix" + dmoName)
        : (i > 0) ? (packageName + dmoName) : dmoPackage + dmoName;
  }

  /**
   * DOCUMENT ME!
   *
   * @param dmlName DOCUMENT ME!
   * @param dml DOCUMENT ME!
   *
   * @throws DMLException DOCUMENT ME!
   */
  private void put(String dmlName, DML dml) throws DMLException {
    DML d = (DML) dmlList.get(dmlName);

    if (d != null) {
      throw new DMLException("DML '" + dmlName + "' already defined.");
    }

    dmlList.put(dmlName, dml);
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getModuleCode() {
    return this.moduleCode;
  }

  /**
   * DOCUMENT ME!
   *
   * @param dmlName DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   *
   * @throws DMLException DOCUMENT ME!
   */
  public DMLTable getTable(String dmlName) throws DMLException {
    if ((dmlName == null) || (dmlName.length() == 0)) {
      throw new DMLException("Parameter 'dmlName' is required.");
    }

    DML dml = (DML) dmlList.get(dmlName);

    if (dml == null) {
      throw new DMLException("DML '" + dmlName + "' not defined.");
    }

    if (!(dml instanceof DMLTable)) {
      throw new DMLException("DML '" + dmlName
          + "' does not refer to a table definition.");
    }

    return (DMLTable) dml;
  }

  /**
   * DOCUMENT ME!
   *
   * @param dmo DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   *
   * @throws DMLException DOCUMENT ME!
   */
  public DMLTable getTable(DMO dmo) throws DMLException {
    if (dmo == null) {
      throw new DMLException("Parameter 'dmo' is required.");
    }

    String dmoClassName = dmo.getClass().getName();
    
    DMLTable dml = (DMLTable) dmoList.get(dmoClassName);

    if (dml == null) {
      throw new DMLException("DML not found for DMO class '" + dmoClassName
          + "'.");
    }

    return dml;
  }

  /**
   * DOCUMENT ME!
   *
   * @param dmoClass DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   *
   * @throws DMLException DOCUMENT ME!
   */
  public DMLTable getTable(Class dmoClass) throws DMLException {
    if (dmoClass == null) {
      throw new DMLException("Parameter 'dmoClass' is required.");
    }

    String dmoClassName = dmoClass.getName();
    DMLTable dml = (DMLTable) dmoList.get(dmoClassName);

    if (dml == null) {
      throw new DMLException("DML not found for DMO class '" + dmoClassName
          + "'.");
    }

    return dml;
  }

  /**
   * DOCUMENT ME!
   *
   * @param dmlName DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   *
   * @throws DMLException DOCUMENT ME!
   */
  public DMLParamQuery getParamQuery(String dmlName) throws DMLException {
    if ((dmlName == null) || (dmlName.length() == 0)) {
      throw new DMLException("Parameter 'dmlName' is required.");
    }

    DML dml = (DML) dmlList.get(dmlName);

    if (dml == null) {
      throw new DMLException("DML '" + dmlName + "' not defined.");
    }

    if (!(dml instanceof DMLParamQuery)) {
      throw new DMLException("DML '" + dmlName
          + "' does not refer to a parameterised SQL query definition.");
    }

    return (DMLParamQuery) dml;
  }

  /**
   * DOCUMENT ME!
   *
   * @param dmlName DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   *
   * @throws DMLException DOCUMENT ME!
   */
  public DMLStaticQuery getStaticQuery(String dmlName) throws DMLException {
    if ((dmlName == null) || (dmlName.length() == 0)) {
      throw new DMLException("Parameter 'dmlName' is required.");
    }

    DML dml = (DML) dmlList.get(dmlName);

    if (dml == null) {
      throw new DMLException("DML '" + dmlName + "' not defined.");
    }

    if (!(dml instanceof DMLStaticQuery)) {
      throw new DMLException("DML '" + dmlName
          + "' does not refer to a static SQL query definition.");
    }

    return (DMLStaticQuery) dml;
  }

  /**
   * DOCUMENT ME!
   *
   * @param dmlName DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   *
   * @throws DMLException DOCUMENT ME!
   */
  public DMLDynamicQuery getDynamicQuery(String dmlName) throws DMLException {
    if ((dmlName == null) || (dmlName.length() == 0)) {
      throw new DMLException("Parameter 'dmlName' is required.");
    }

    DML dml = (DML) dmlList.get(dmlName);

    if (dml == null) {
      throw new DMLException("DML '" + dmlName + "' not defined.");
    }

    if (!(dml instanceof DMLDynamicQuery)) {
      throw new DMLException("DML '" + dmlName
          + "' does not refer to a dynamic SQL query definition.");
    }

    return (DMLDynamicQuery) dml;
  }

  /**
   * DOCUMENT ME!
   *
   * @param dmlName DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   *
   * @throws DMLException DOCUMENT ME!
   */
  public DMLStaticUpdate getStaticUpdate(String dmlName) throws DMLException {
    if ((dmlName == null) || (dmlName.length() == 0)) {
      throw new DMLException("Parameter 'dmlName' is required.");
    }

    DML dml = (DML) dmlList.get(dmlName);

    if (dml == null) {
      throw new DMLException("DML '" + dmlName + "' not defined.");
    }

    if (!(dml instanceof DMLStaticUpdate)) {
      throw new DMLException("DML '" + dmlName
          + "' does not refer to a static SQL update definition.");
    }

    return (DMLStaticUpdate) dml;
  }

  /**
   * 
   * @param dmlName
   * @return
   * @throws DMLException
   */
  public boolean dmlExists(String dmlName) throws DMLException {
    if ((dmlName == null) || (dmlName.length() == 0)) {
      throw new DMLException("Parameter 'dmlName' is required.");
    }

    return dmlList.containsKey(dmlName);

  }

  /**
   * DOCUMENT ME!
   *
   * @param dmlName DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   *
   * @throws DMLException DOCUMENT ME!
   */
  public DMLDynamicUpdate getDynamicUpdate(String dmlName) throws DMLException {
    if ((dmlName == null) || (dmlName.length() == 0)) {
      throw new DMLException("Parameter 'dmlName' is required.");
    }

    DML dml = (DML) dmlList.get(dmlName);

    if (dml == null) {
      throw new DMLException("DML '" + dmlName + "' not defined.");
    }

    if (!(dml instanceof DMLDynamicUpdate)) {
      throw new DMLException("DML '" + dmlName
          + "' does not refer to a dynamic SQL update definition.");
    }

    return (DMLDynamicUpdate) dml;
  }
}/* class DMLFactory */
