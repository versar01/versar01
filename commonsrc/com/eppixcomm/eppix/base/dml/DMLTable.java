/* ====================================================================== *
 * (c) Copyright Eppixcomm Tech Ltd.                                      *
 * All Rights Reserved                                                    *
 *                                                                        *
 * Legal Information                                                      *
 * ====================================================================== */
package com.eppixcomm.eppix.base.dml;

/**
 * DOCUMENT ME!
 *
 * @version $Revision: 1.1 $
 * @author $author$
 * @since $jdk$
 */
public class DMLTable extends DMLParamQuery {
  /** DOCUMENT ME! */
  private String tableName;

  /** DOCUMENT ME! */
  private int numColumns;

  /** DOCUMENT ME! */
  private String columnList;

  /** DOCUMENT ME! */
  private String versionCol;

  /** DOCUMENT ME! */
  private boolean generateKey;

  private boolean hasPrimaryKey;

  private String[] fields;

  /**
   * Creates a new DMLTable object.
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
   * @throws DMLException DOCUMENT ME!
   */
  protected DMLTable(String dmlName, String dmoName, String tableName,
      int numColumns, String columnList, String primaryKey, String versionCol,
      boolean generateKey, String selectList, String fromTables,
      String joinWhere, String[] fields, boolean hasPrimaryKey)
      throws DMLException {
	  
    if ((dmlName == null) || (dmlName.length() == 0)) {
      throw new DMLException("Parameter 'dmlName' is required.");
    }

    if ((dmoName == null) || (dmoName.length() == 0)) {
      throw new DMLException("Parameter 'dmoName' is required.");
    }

    if ((tableName == null) || (tableName.length() == 0)) {
      throw new DMLException("Parameter 'tableName' is required.");
    }

    if (numColumns <= 0) {
      throw new DMLException(
          "Parameter 'numColumns' must be greater than zero.");
    }

    if ((columnList == null) || (columnList.length() == 0)) {
      throw new DMLException("Parameter 'columnList' is required.");
    }

    if (hasPrimaryKey && ((primaryKey == null) || (primaryKey.length() == 0))) {
      throw new DMLException("Parameter 'primaryKey' is required.");
    }

    this.dmlName = dmlName;
    this.dmoName = dmoName;
    this.tableName = tableName;
    this.numColumns = numColumns;
    this.columnList = columnList;
    this.primaryKey = primaryKey;
    this.hasPrimaryKey = hasPrimaryKey;
    this.versionCol = (versionCol == null || versionCol.length() == 0) ? null
        : versionCol;
    this.generateKey = generateKey;
    this.selectList = (selectList == null || selectList.length() == 0) ? columnList
        : selectList;
    this.fromTables = (fromTables == null || fromTables.length() == 0) ? tableName
        : fromTables;
    this.joinWhere = (joinWhere == null || joinWhere.length() == 0) ? null
        : joinWhere;
    this.fields = fields;
    if (hasPrimaryKey) {
      this.addFilterBy("filterByPrimaryKey", primaryKey.replaceAll(",",
          " = ? AND ").concat(" = ?"));
    }
    this.addOrderBy("orderByPrimaryKey", primaryKey);
  }

  protected DMLTable(String dmlName, String dmoName, String tableName,
      int numColumns, String columnList, String primaryKey, String versionCol,
      boolean generateKey, String selectList, String fromTables,
      String joinWhere) throws DMLException {
    this(dmlName, dmoName, tableName, numColumns, columnList, primaryKey,
        versionCol, generateKey, selectList, fromTables, joinWhere, null,
        (primaryKey == null) ? false : true);
  }

  /**
   * DOCUMENT ME!
   *
   * @param stmtType DOCUMENT ME!
   * @param filterBy DOCUMENT ME!
   * @param orderBy DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   *
   * @throws DMLException DOCUMENT ME!
   */
  public String getStmtString(int stmtType, String filterBy, String orderBy,
      String tableName, String maxField, String setArgs) throws DMLException {
    StringBuffer dml;

    switch (stmtType) {
    case STMT_INSERT:
      dml = new StringBuffer(512);
      dml.append("INSERT INTO ");
      dml.append((tableName == null) ? this.tableName : tableName);
      dml.append(" (");
      dml.append(columnList);
      dml.append(") VALUES (?");

      for (int i = 1; i < numColumns; ++i) {
        dml.append(",?");
      }

      dml.append(")");

      return dml.toString();

    case STMT_UPDATE:

      if ((filterBy == null) || (filterBy.length() == 0)) {
        throw new DMLException(
            "Parameter 'filterBy' is required for STMT_UPDATE");
      }

      dml = new StringBuffer(512);
      dml.append("UPDATE ");
      dml.append((tableName == null) ? this.tableName : tableName);
      dml.append(" SET ");
      dml.append(columnList.replaceAll(",", " = ?,"));
      dml.append(" = ?");
      dml.append(where(filterBy));

      return dml.toString();

    case STMT_CUSTOM_UPDATE: // BaH

      if ((filterBy == null) || (filterBy.length() == 0)) {
        throw new DMLException(
            "Parameter 'filterBy' is required for STMT_CUSTOM_UPDATE");
      }

      dml = new StringBuffer(512);
      dml.append("UPDATE ");
      dml.append((tableName == null) ? this.tableName : tableName);
      dml.append(" SET ");
      dml.append(processCustomSet(setArgs));
      dml.append(where(filterBy));

      return dml.toString();

    case STMT_DELETE:
      dml = new StringBuffer(512);
      dml.append("DELETE FROM ");
      dml.append((tableName == null) ? this.tableName : tableName);
      dml.append(where(filterBy));

      return dml.toString();
    }

    return super.getStmtString(stmtType, filterBy, orderBy, tableName,
        maxField, null);
  }

  private StringBuffer processCustomSet(String setArgs) {
    StringBuffer setBuffer = new StringBuffer();

    // =   :   A = ?
    // +   :   A = A + ?
    // -   :   A = A - ?
    String[] setParts = setArgs.split("\\|");

    for (int i = 0; i < setParts.length; i++) {

      if (i > 0) {
        setBuffer.append(',');
      }

      char pma = setParts[i].charAt(0);
      int field = Integer.parseInt(setParts[i].substring(1));

      setBuffer.append(fields[field]);

      switch (pma) {
      case '=':
        setBuffer.append(" = ?");
        break;
      case '+':
        setBuffer.append(" = ").append(fields[field]).append(" + ?");
        break;
      case '-':
        setBuffer.append(" = ").append(fields[field]).append(" - ?");
        break;
      }
    }

    return setBuffer;
  }

  /**
   * DOCUMENT ME!
   *
   * @param filterBy DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   *
   * @throws DMLException DOCUMENT ME!
   */
  private String where(String filterBy) throws DMLException {

    // set to default
    lastType = TYPE_AND;
//
//    StringBuffer where = new StringBuffer(256);
//
//    if ((filterBy != null) && (filterBy.length() > 0)) {
//      if (!"NONE".equals(filterBy)) {
//        String[] filterNames = filterBy.replaceAll("filterBy", "").split("\\+");
//
//        for (int i = 0; i < filterNames.length; ++i) {
//
//          // test for "|" ( or ), and sub-split again...
//          String[] subFilterNames = filterNames[i].split("\\|");
//
//          for (int n = 0; n < subFilterNames.length; n++) {
//
//            int type = TYPE_AND;
//
//            if (n > 0) {
//              type = TYPE_OR;
//            }
//
//            appendWhere(where, filters.getCondition(subFilterNames[n]), type);
//          }
//        }
//      }
//    }
//
//    appendWhere(where, null, TYPE_AND);
//
//    if (hasVersion()) { // && !filters.isMultiRow(filterBy)) {
//      appendWhere(where, versionCol + " = ?", TYPE_AND);
//    }
//
//    return where.toString();
//  }
  
  StringBuffer where = new StringBuffer(256);
  appendWhere(where, joinWhere, TYPE_AND);

  if ((filterBy != null) && (filterBy.length() > 0)) {
    if (!"NONE".equals(filterBy)) {
      String[] filterNames = filterBy.replaceAll("filterBy", "").split("\\+");

      for (int i = 0; i < filterNames.length; ++i) {

        // test for "|" ( or ), and sub-split again...
        String[] subFilterNames = filterNames[i].split("\\|");

        for (int n = 0; n < subFilterNames.length; n++) {

          int type = TYPE_AND;

          if ((n > 0) || ((i == 0) && (n == 0)) && subFilterNames.length > 1) {
            if (subFilterNames[n].endsWith("~")) {
              subFilterNames[n] = subFilterNames[n].substring(0,
                  subFilterNames[n].length() - 1);
            } else {
              type = TYPE_OR;
            }
          }

          if (!subFilterNames[n].startsWith("IN")
              && !subFilterNames[n].startsWith("NOTIN")) {
            appendWhere(where, filters.getCondition(subFilterNames[n]), type);
          } else {
            String fn = subFilterNames[n].substring(0, subFilterNames[n]
                .indexOf('_'));
            int count = Integer.parseInt(subFilterNames[n]
                .substring(subFilterNames[n].indexOf('_') + 1));

            String cond = filters.getCondition(fn);

            if (count > 1) {
              for (int m = 1; m < count; m++) {
                cond = cond.replaceFirst("\\?", "? , ?");
              }
            }

            appendWhere(where, cond, type);
          }
        }
      }
    }
  }
  appendWhere(where, null, TYPE_AND);

  if (hasVersion()) { // && !filters.isMultiRow(filterBy)) {
    appendWhere(where, versionCol + " = ?", TYPE_AND);
  }

  return where.toString();
}  

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getTableName() {

    String theTableName = this.tableName.trim();

    int firstSpace = 0;
    firstSpace = theTableName.indexOf(' ');

    return firstSpace == -1 ? theTableName : theTableName.substring(0,
        firstSpace);
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public boolean hasVersion() {
    return versionCol != null;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public boolean hasGeneratedKey() {
    return this.generateKey;
  }

  public boolean isHasPrimaryKey() {
    return hasPrimaryKey;
  }

  public String[] getFields() {
    return fields;
  }
}/* class DMLTable */
