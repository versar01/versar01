package com.eppixcomm.eppix.common.util;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.eppixcomm.eppix.common.data.DMO;

/**
 * 
 * @author bruce.henderson
 *
 */
public class QueryFilter implements Serializable {

  public QueryFilter() {
  }

  public QueryFilter(Class clazz) {
      this.clazz = clazz;
  }

  private List parts;
  private Class clazz;

  public void add(FilterPart filter) {
    if (parts == null) {
      parts = new ArrayList();
    }

    parts.add(filter);
  }

  public List getParts() {
    return parts;
  }

  /**
   * Add a filter that doesn't require a value.
   * 
   * e.g. NULL, MAX, MIN, SET.
   * 
   * @param filterType
   * @param index
   */
  public void add(int filterType, int index) {
    add(new FilterPart(clazz, filterType, index, null));
  }

  public  void add(int filterType, int index, Object value) {
    add(new FilterPart(clazz, filterType, index, value));
  }

  public void addOr(int filterType, int index) {
    add(new FilterPart(filterType, index, null, true));
  }

  public  void addOr(int filterType, int index, Object value) {
    add(new FilterPart(filterType, index, value, true));
  }

  public  void add(int filterType, int index, Object lowValue, Object highValue) {
    add(new FilterPart(filterType, index, lowValue, highValue));
  }


  public boolean equals(Object obj) {
    if (obj instanceof QueryFilter) {
      if (parts != null) {

        if (((QueryFilter) obj).getParts() == null) {
          return false;
        }

        if (parts.size() != ((QueryFilter) obj).getParts().size()) {
          return false;
        }

        for (int i = 0; i < parts.size(); i++) {
          FilterPart myPart = (FilterPart) parts.get(i);
          if (!myPart.equals(((QueryFilter) obj).getParts().get(i))) {
            return false;
          }
        }
        return true;
      } else {
        if (((QueryFilter) obj).getParts() != null) {
          return false;
        }
      }
    }

    return super.equals(obj);
  }
}
