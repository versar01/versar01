/* ====================================================================== *
 * (c) Copyright Eppixcomm Tech Ltd.                                      *
 * All Rights Reserved                                                    *
 *                                                                        *
 * Legal Information                                                      *
 * ====================================================================== */
package com.eppixcomm.eppix.base.dml;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.StringTokenizer;

/**
 * DOCUMENT ME!
 * 
 * @author $Author: ljeffs $
 * @version $Revision: 1.5 $
 * @since $jdk$
 */
public class DMLParamQuery extends DMLQuery {
  /** DOCUMENT ME! */
  protected String selectList;

  /** DOCUMENT ME! */
  protected String primaryKey;

  /** DOCUMENT ME! */
  protected String fromTables;

  /** DOCUMENT ME! */
  protected String joinWhere;

  /** DOCUMENT ME! */
  protected FilterByList filters = new FilterByList();

  /** DOCUMENT ME! */
  protected OrderByList orders = new OrderByList();

  protected final int TYPE_AND = 0;

  protected final int TYPE_OR = 1;

  protected int lastType = TYPE_AND;

  /**
   * Creates a new DMLParamQuery object.
   */
  protected DMLParamQuery() {
  }

  /**
   * Creates a new DMLParamQuery object.
   *
   * @param dmlName DOCUMENT ME!
   * @param dmoName DOCUMENT ME!
   * @param selectList DOCUMENT ME!
   * @param primaryKey DOCUMENT ME!
   * @param fromTables DOCUMENT ME!
   * @param joinWhere DOCUMENT ME!
   *
   * @throws DMLException DOCUMENT ME!
   */
  protected DMLParamQuery(String dmlName, String dmoName, String selectList,
      String primaryKey, String fromTables, String joinWhere)
      throws DMLException {
    if ((dmlName == null) || (dmlName.length() == 0)) {
      throw new DMLException("Parameter 'dmlName' is required.");
    }

    if ((dmoName == null) || (dmoName.length() == 0)) {
      throw new DMLException("Parameter 'dmoName' is required.");
    }

    if ((selectList == null) || (selectList.length() == 0)) {
      throw new DMLException("Parameter 'selectList' is required.");
    }

    if ((primaryKey == null) || (selectList.length() == 0)) {
      throw new DMLException("Parameter 'primaryKey' is required.");
    }

    if ((fromTables == null) || (fromTables.length() == 0)) {
      throw new DMLException("Parameter 'fromTables' is required.");
    }

    this.dmlName = dmlName;
    this.dmoName = dmoName;
    this.selectList = selectList;
    this.primaryKey = primaryKey;
    this.fromTables = fromTables;
    this.joinWhere = joinWhere;
    this.addFilterBy("filterByPrimaryKey", primaryKey.replaceAll(",",
        " = ? AND ").concat(" = ?"));
    this.addOrderBy("orderByPrimaryKey", primaryKey);
  }

  /**
   * DOCUMENT ME!
   *
   * @param filterBy DOCUMENT ME!
   * @param condition DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public DMLParamQuery addFilterBy(String filterBy, String condition) {
    filters.add(filterBy.replaceAll("filterBy", ""), condition, true);

    return this;
  }

  /**
   * DOCUMENT ME!
   *
   * @param orderBy DOCUMENT ME!
   * @param columns DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public DMLParamQuery addOrderBy(String orderBy, String columns) {
    orders.add(orderBy, columns);

    return this;
  }

  public String getStmtString(int stmtType, String filterBy, String orderBy)
      throws DMLException {
    return getStmtString(stmtType, filterBy, orderBy, null, null, null);
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

    if (tableName == null) {
      tableName = fromTables;
    }
    switch (stmtType) {
    case STMT_SELECT:
    case STMT_LIST_ABS:
    case STMT_LIST_KEY:
    case STMT_LIST_KEY_NEXT:
    case STMT_LIST_KEY_PREV:
    case STMT_LIST_KEY_DESC:
    case STMT_LIST_KEY_DESC_NEXT:
    case STMT_LIST_KEY_DESC_PREV:
      return "SELECT " + selectList + "\nFROM " + tableName
          + where(stmtType, filterBy) + orderBy(stmtType, orderBy);

    case STMT_LOCK:
      return "SELECT " + selectList + "\nFROM " + tableName
          + where(stmtType, filterBy) + orderBy(stmtType, orderBy)
//          + " FOR UPDATE NOWAIT";
          + " FOR UPDATE";

    case STMT_EXISTS:
      return "SELECT DISTINCT(0)" + "\nFROM " + tableName
          + where(stmtType, filterBy);

    case STMT_COUNT:
      return "SELECT COUNT(*)" + "\nFROM " + tableName
          + where(stmtType, filterBy);

    case STMT_MAX:
      return "SELECT MAX(" + ((maxField == null) ? primaryKey : maxField) + ")"
          + "\nFROM " + tableName + where(stmtType, filterBy);

    case STMT_MIN:
      return "SELECT MIN(" + ((maxField == null) ? primaryKey : maxField) + ")"
          + "\nFROM " + tableName + where(stmtType, filterBy);
    }

    throw new DMLException("Invalid statement type '" + stmtType
        + "' requested for query '" + dmlName + "'.");
  }

  /**
   * DOCUMENT ME!
   *
   * @param stmtType DOCUMENT ME!
   * @param filterBy DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   *
   * @throws DMLException DOCUMENT ME!
   */
  protected String where(int stmtType, String filterBy) throws DMLException {

    // set to default
    lastType = TYPE_AND;

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
    appendWhere(where, listKey(stmtType), TYPE_AND);

    return where.toString();
  }

  /**
   * DOCUMENT ME!
   *
   * @param where DOCUMENT ME!
   * @param condition DOCUMENT ME!
   */
  protected void appendWhere(StringBuffer where, String condition, int type) {
    if ((condition != null) && (condition.length() != 0)) {
      if (where.length() == 0) {
        where.append("\nWHERE ");

        if (type != lastType) {
          // from AND to OR 
          if (lastType == TYPE_AND) {
            where.append("(");
          }

          lastType = type;
        }
      } else {

        // switch between AND and OR ?
        if (type != lastType) {
          // from AND to OR 
          if (lastType == TYPE_AND) {
            where.append(" AND (");
          } else {
            // from OR to AND
            where.append(") AND ");
          }
        } else {
          // no change...

          switch (type) {
          case TYPE_OR:
            where.append(" OR ");
            break;
          case TYPE_AND:
            where.append(" AND ");
            break;
          }
        }

        lastType = type;
      }

      where.append(condition);
    } else {
      if (type != lastType) {
        if (lastType == TYPE_OR) {
          where.append(" )");
        }
      }
    }
  }

  /**
   * DOCUMENT ME!
   *
   * @param stmtType DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   *
   * @throws DMLException DOCUMENT ME!
   */
  private String listKey(int stmtType) throws DMLException {
    switch (stmtType) {
    case STMT_LIST_KEY_NEXT:

      if (primaryKey == null) {
        throw new DMLException("Primary key not defined for query '" + dmlName
            + "'.");
      }

      return primaryKey.replaceAll(",", " >= ? AND ").concat(" > ?");

    case STMT_LIST_KEY_PREV:

      if (primaryKey == null) {
        throw new DMLException("Primary key not defined for query '" + dmlName
            + "'.");
      }

      return primaryKey.replaceAll(",", " <= ? AND ").concat(" <= ?");

    case STMT_LIST_KEY_DESC_NEXT:

      if (primaryKey == null) {
        throw new DMLException("Primary key not defined for query '" + dmlName
            + "'.");
      }

      return primaryKey.replaceAll(",", " <= ? AND ").concat(" < ?");

    case STMT_LIST_KEY_DESC_PREV:

      if (primaryKey == null) {
        throw new DMLException("Primary key not defined for query '" + dmlName
            + "'.");
      }

      return primaryKey.replaceAll(",", " >= ? AND ").concat(" >= ?");
    }

    return null;
  }

  /**
   * DOCUMENT ME!
   *
   * @param stmtType DOCUMENT ME!
   * @param orderBy DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   *
   * @throws DMLException DOCUMENT ME!
   */
  private String orderBy(int stmtType, String orderBy) throws DMLException {

    String columns = null;

    switch (stmtType) {
    case STMT_LIST_KEY:
    case STMT_LIST_KEY_NEXT:
    case STMT_LIST_KEY_PREV:
      columns = primaryKey;
      break;

    case STMT_LIST_KEY_DESC:
    case STMT_LIST_KEY_DESC_NEXT:
    case STMT_LIST_KEY_DESC_PREV:
      columns = primaryKey.replaceAll(",", " DESC,").concat(" DESC");
      break;

    default:
      try {
        columns = orders.getColumns(orderBy);
      } catch (DMLException e) {
        if (orderBy != null && orderBy.length() > 0) {
          StringTokenizer s = new StringTokenizer(orderBy, ",");
          while (s.hasMoreTokens()) {
            if (columns == null) {
              columns = orders.getColumns(s.nextToken());
            } else {
              columns += ',' + orders.getColumns(s.nextToken());
            }
          }
        }
      }
      break;
    }

    return (columns == null) ? "" : " ORDER BY " + columns;
  }

  /**
   * DOCUMENT ME!
   *
   * @version $Revision: 1.5 $
   * @author $author$
   * @since $jdk$
   */
  protected class FilterBy {
    /** DOCUMENT ME! */
    protected String filterBy;

    /** DOCUMENT ME! */
    protected String condition;

    /** DOCUMENT ME! */
    protected boolean isMultiRow;

    /**
     * Creates a new FilterBy object.
     *
     * @param filterBy DOCUMENT ME!
     * @param condition DOCUMENT ME!
     * @param isMultiRow DOCUMENT ME!
     */
    protected FilterBy(String filterBy, String condition, boolean isMultiRow) {
      this.filterBy = filterBy;
      this.condition = condition;
      this.isMultiRow = isMultiRow;
    }

    public String toString() {
      return condition;
    }
  } /* class FilterBy */

  /**
   * DOCUMENT ME!
   *
   * @version $Revision: 1.5 $
   * @author $author$
   * @since $jdk$
   */
  protected class FilterByList {
    /** DOCUMENT ME! */
    HashMap filters = new HashMap();

    /**
     * DOCUMENT ME!
     *
     * @param filterBy DOCUMENT ME!
     * @param condition DOCUMENT ME!
     * @param isMultiRow DOCUMENT ME!
     */
    protected void add(String filterBy, String condition, boolean isMultiRow) {
      filters.put(filterBy.toLowerCase(), new FilterBy(filterBy, condition,
          isMultiRow));
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
    public FilterBy get(String filterBy) throws DMLException {

      FilterBy filter = (FilterBy) filters.get(filterBy.toLowerCase());

      if (filter != null) {
        return filter;
      }

      //			for (Iterator<FilterBy> i = filters.iterator(); i.hasNext();) {
      //				FilterBy filter = i.next();
      //
      //				if (filter.filterBy.equalsIgnoreCase(filterBy)) {
      //
      //					return filter;
      //				}
      //			}

      throw new DMLException("Filter '" + filterBy
          + "' not defined for query '" + DMLParamQuery.this.dmlName + "'.");
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
    protected String getCondition(String filterBy) throws DMLException {
      return (filterBy == null || filterBy.length() == 0) ? null
          : get(filterBy).condition;
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
    protected boolean isMultiRow(String filterBy) throws DMLException {
      return (filterBy == null) || (filterBy.length() == 0)
          || get(filterBy).isMultiRow;
    }
  } /* class FilterByList */

  /**
   * DOCUMENT ME!
   *
   * @version $Revision: 1.5 $
   * @author $author$
   * @since $jdk$
   */
  protected class OrderBy {
    /** DOCUMENT ME! */
    protected String orderBy;

    /** DOCUMENT ME! */
    protected String columns;

    /**
     * Creates a new OrderBy object.
     *
     * @param orderBy DOCUMENT ME!
     * @param columns DOCUMENT ME!
     */
    protected OrderBy(String orderBy, String columns) {
      this.orderBy = orderBy;
      this.columns = columns;
    }
  } /* class OrderBy */

  /**
   * DOCUMENT ME!
   *
   * @version $Revision: 1.5 $
   * @author $author$
   * @since $jdk$
   */
  protected class OrderByList {
    /** DOCUMENT ME! */
    ArrayList orders = new ArrayList();

    /**
     * DOCUMENT ME!
     *
     * @param orderBy DOCUMENT ME!
     * @param columns DOCUMENT ME!
     */
    protected void add(String orderBy, String columns) {
      orders.add(new OrderBy(orderBy, columns));
    }

    /**
     * DOCUMENT ME!
     *
     * @param orderBy DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     *
     * @throws DMLException DOCUMENT ME!
     */
    protected OrderBy get(String orderBy) throws DMLException {
      for (Iterator i = orders.iterator(); i.hasNext();) {
        OrderBy order = (OrderBy) i.next();

        if (order.orderBy.equalsIgnoreCase(orderBy)) {

          return order;
        }
      }

      throw new DMLException("Order by '" + orderBy
          + "' not defined for query '" + DMLParamQuery.this.dmlName + "'.");
    }

    /**
     * DOCUMENT ME!
     *
     * @param orderBy DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     *
     * @throws DMLException DOCUMENT ME!
     */
    protected String getColumns(String orderBy) throws DMLException {
      return (orderBy == null || orderBy.length() == 0) ? null
          : get(orderBy).columns;
    }
  } /* class OrderByList */

  public String getPrimaryKey() {
    return primaryKey;
  }
} /* class DMLParamQuery */
