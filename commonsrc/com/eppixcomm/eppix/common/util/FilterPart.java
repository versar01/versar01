package com.eppixcomm.eppix.common.util;

import com.eppixcomm.eppix.common.data.DAOParamQueryArgs;
import com.eppixcomm.eppix.common.data.DMO;

public class FilterPart {

  private DMO owner;

  private int filterType;

  private int index;

  private Object value;

  private Object highValue;

  private boolean isOr;

  public FilterPart(int filterType, int index, Object value) {
    this(null, filterType, index, value);
  }

  public FilterPart(Class owner, int filterType, int index, Object value) {
    if (filterType != FilterOp.NULL && filterType != FilterOp.MAX
        && filterType != FilterOp.MIN && filterType != FilterOp.NOTNULL) {
//      assert value != null;
    }

    try {
      this.owner = (DMO) owner.newInstance();
    } catch (Exception e) {
    }
    this.filterType = filterType;
    this.index = index;
    this.value = value;

  }

  public FilterPart(int filterType, int index, Object value, boolean or) {
    if (filterType != FilterOp.NULL && filterType != FilterOp.MAX
        && filterType != FilterOp.MIN && filterType != FilterOp.NOTNULL) {
//      assert value != null;
    }

    this.filterType = filterType;
    this.index = index;
    this.value = value;
    this.isOr = or;
  }

  public FilterPart(int filterType, int index, Object lowValue, Object highValue) {
//    assert lowValue != null;
//    assert highValue != null;

    this.filterType = filterType;
    this.index = index;
    this.value = lowValue;
    this.highValue = highValue;
  }

  public int getFilterType() {
    return filterType;
  }

  public void setFilterType(int filterType) {
    this.filterType = filterType;
  }

  public Object getHighValue() {
    return highValue;
  }

  public void setHighValue(Object highValue) {
    this.highValue = highValue;
  }

  public int getIndex() {
    return index;
  }

  public void setIndex(int index) {
    this.index = index;
  }

  public Object getValue() {
    return value;
  }

  public void setValue(Object value) {
    this.value = value;
  }

  public String makeFilterString(String name) {
    switch (filterType) {
    case FilterOp.ANY:
    case FilterOp.BEGINSWITH:
    case FilterOp.ENDSWITH:
    case FilterOp.LIKE:
      return name + "Match";
    case FilterOp.NOTIN:
    case FilterOp.IN:
      return FilterOp.get(filterType) + name + '_' + ((Object[]) value).length;
    default:
      return FilterOp.get(filterType) + name;
    }
  }

  public void andFilterBy(DAOParamQueryArgs args, String name) {

    switch (filterType) {
    case FilterOp.SET:
      args.checkArgs(1);
      args.setEquals(getIndex());
      if (owner == null) {
        args.arg(value);
      } else {
        args.arg(value, owner.types()[getIndex()]);
      }
      break;
    case FilterOp.SET_ADDTO:
      args.setAdd(getIndex());
      if (owner == null) {
        args.arg(value);
      } else {
        args.arg(value, owner.types()[getIndex()]);
      }
      break;
    case FilterOp.SET_SUBTRACTFROM:
      args.setSubtract(getIndex());
      if (owner == null) {
        args.arg(value);
      } else {
        args.arg(value, owner.types()[getIndex()]);
      }
      break;
    case FilterOp.MAX:
      args.setMaxField(index);
      break;
    case FilterOp.MIN:
      args.setMaxField(index);
      break;
    case FilterOp.ORDERBYASC:
    case FilterOp.ORDERBYDESC:
      addOrderBy(args, name);
      break;
    default:
      andFilterBy(args, name, null);
    }
    //		if (filterType != Filters.SET) {
    //			if (filterType == Filters.ORDERBYASC || filterType == Filters.ORDERBYDESC) {
    //				addOrderBy(args, name);
    //			} else {
    //				andFilterBy(args, name, null);
    //			}
    //		}

  }

  private void addOrderBy(DAOParamQueryArgs args, String name) {
    String orderBy = args.getOrderBy();
    if (orderBy == null || orderBy.length() == 0) {
      args.setOrderBy(name
          + ((filterType == FilterOp.ORDERBYASC) ? "asc" : "desc"));
    } else {
      args.setOrderBy(orderBy + ',' + name
          + ((filterType == FilterOp.ORDERBYASC) ? "asc" : "desc"));
    }

  }

  public void andFilterBy(DAOParamQueryArgs args, String name, String wildcard) {

    switch (filterType) {
    case FilterOp.SET:
      args.checkArgs(1);
      args.setEquals(getIndex());
      if (owner == null) {
        args.arg(value);
      } else {
        args.arg(value, owner.types()[getIndex()]);
      }
      break;
    case FilterOp.SET_ADDTO:
      args.checkArgs(1);
      args.setAdd(getIndex());
      if (owner == null) {
        args.arg(value);
      } else {
        args.arg(value, owner.types()[getIndex()]);
      }
      break;
    case FilterOp.SET_SUBTRACTFROM:
      args.checkArgs(1);
      args.setSubtract(getIndex());
      if (owner == null) {
        args.arg(value);
      } else {
        args.arg(value, owner.types()[getIndex()]);
      }
      break;
    case FilterOp.MAX:
      //args.checkArgs(1);
      args.setMaxField(index);
      break;
    case FilterOp.MIN:
      //args.checkArgs(1);
      args.setMaxField(index);
      break;
    case FilterOp.ORDERBYASC:
    case FilterOp.ORDERBYDESC:
      addOrderBy(args, name);
      break;
    default:
      if (isOr) {
        args.checkArgs(1);
        args.orFilterBy(makeFilterString(name));
      } else {
        args.checkArgs(1);
        args.andFilterBy(makeFilterString(name));
      }
      if (value instanceof String) {
        // add argument if not NULL / NOTNULL
        if (filterType != FilterOp.NULL && filterType != FilterOp.NOTNULL) {
        	
          args.checkArgs(1);
          args.arg(makeArgString(wildcard));
        }
      } else {
        // BETWEEN requires two arguments
        if (filterType == FilterOp.BETWEEN) {
          args.checkArgs(2);

          if (owner == null) {
            args.arg(value).arg(highValue);
          } else {
            args.arg(value, owner.types()[getIndex()]).arg(highValue,
                owner.types()[getIndex()]);
          }

        } else if ((filterType == FilterOp.IN)
            || (filterType == FilterOp.NOTIN)) {

          args.checkArgs(((Object[]) value).length);

          // IN / NOTIN - add all the arg parts
          Object[] a = (Object[]) value;

          for (int i = 0; i < a.length; i++) {
            args.arg(a[i]);
          }

        } else {
          if (value == null) {
        	  // Change by SJ: if null returned cannot change to string "null"
//            args.arg(makeArgString(wildcard));
          } else {
            if (owner == null) {
              args.arg(value);
            } else {
              args.arg(value, owner.types()[getIndex()]);
            }
          }
        }
      }
    }

  }

  public String makeArgString(String wildcard) {
    String ret = "";
    switch (filterType) {
    case FilterOp.ANY:
      ret = wildcard;
      break;
    case FilterOp.LIKE:
      // needs to be a String....

      if (value instanceof String) {
        ret = wildcard + value + wildcard;
      } else if (value == null) {
        ret = wildcard;
      }

      break;
    case FilterOp.BEGINSWITH:
      // needs to be a String....

      if (value instanceof String) {
        ret = value + wildcard;
      } else if (value == null) {
        ret = wildcard;
      }
      break;
    case FilterOp.ENDSWITH:
      // needs to be a String....

      if (value instanceof String) {
        ret = wildcard + value;
      } else if (value == null) {
        ret = wildcard;
      }

      break;
    default:
      if (value instanceof String) {
        ret = (String) value;
      } else {
        ret = String.valueOf(value);
      }
    }

    return ret;
  }


  public boolean equals(Object obj) {

    if (obj instanceof FilterPart) {

      if (filterType != ((FilterPart) obj).getFilterType()) {
        return false;
      }

      if (index != ((FilterPart) obj).getIndex()) {
        return false;
      }

      if (value != null) {

        if (value instanceof Object[]) {

          if (!((((FilterPart) obj).getValue()) instanceof Object[])) {
            return false;
          }

          Object[] objArray = (Object[]) ((FilterPart) obj).getValue();

          if (((Object[]) value).length != objArray.length) {
            return false;
          }

          for (int i = 0; i < objArray.length; i++) {

            if (!((Object[]) value)[i].equals(objArray[i])) {
              return false;
            }
          }

        } else if (!value.equals(((FilterPart) obj).getValue())) {
          return false;
        }

      } else if (((FilterPart) obj).getValue() != null) {
        return false;
      }

      if (highValue != null) {

        if (!highValue.equals(((FilterPart) obj).getHighValue())) {
          return false;
        }

      } else if (((FilterPart) obj).getHighValue() != null) {
        return false;
      }

      if (isOr != ((FilterPart) obj).isOr()) {
        return false;
      }

      // passed all the tests!
      return true;

    } else {

      return super.equals(obj);
    }
  }

  public boolean isOr() {
    return isOr;
  }

  public void setOr(boolean isOr) {
    this.isOr = isOr;
  }

  public FilterPart cloneWithIndex(int newIndex) {
    FilterPart part = new FilterPart(filterType, newIndex, value, highValue);
    part.setOr(isOr);
    return part;
  }
}
