package com.eppixcomm.eppix.common.data;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.List;

import com.eppixcomm.eppix.common.util.Date;
import com.eppixcomm.eppix.common.util.DateTime;
import com.eppixcomm.eppix.common.util.Time;

public class DSO implements Serializable {

  /**
   * 
   */
  private static final long serialVersionUID = 1L;


  public boolean equals(Object obj) {

    // this is a DTO ?
    if ((obj == null) || !(obj instanceof DSO)) {
      return false;
    }

    // the same object ?
    if (obj == this) {
      return true;
    }

    Class clazz = this.getClass();

    if (!clazz.equals(obj.getClass())) {
      return false;
    }

    Method[] methods = clazz.getMethods();

    for (int i = 0; i < methods.length; i++) {

      Method method = methods[i];
      String methodName = method.getName();

      // Ignore this method if it is not a 'get' method.
      if (!methodName.startsWith("get")) {
        continue;
      }

      // Ignore the 'getClass' method.
      if (methodName.equals("getClass")) {
        continue;
      }

      // Ignore this method if it has parameters.
      if (method.getParameterTypes().length != 0) {
        continue;
      }

      // Ignore this method if it has a void return type. 
      Class returnType = method.getReturnType();
      if (returnType == null) {
        continue;
      }

      Object leftValue = null;
      Object rightValue = null;

      try {
        leftValue = method.invoke(this, (Object[]) null);
        rightValue = method.invoke(obj, (Object[]) null);

      } catch (IllegalArgumentException e) {
        return false;
      } catch (IllegalAccessException e) {
        return false;
      } catch (InvocationTargetException e) {
        return false;
      }

      if (leftValue == null) {
        if (rightValue != null) {
          return false;
        }
        continue;
      } else if (rightValue == null) {
        return false;
      }

      //      if (DTO.class.isAssignableFrom(returnType)) {
      //
      //          if (leftValue.equals(obj))
      //          // this is a DTO... 
      ////        assertEquals(msg, (DTO) leftValue, (DTO) rightValue, methodPath);
      //
      //      } else 
      if (List.class.isAssignableFrom(returnType)) {

        List leftList = (List) leftValue;
        List rightList = (List) rightValue;

        int leftSize = leftList.size();
        int rightSize = rightList.size();
        if (leftSize != rightSize) {
          return false;
        }

        for (int dtoIdx = 0; dtoIdx < leftSize; ++dtoIdx) {
          //          assertEquals((DTO) leftList.get(dtoIdx), (DTO) rightList.get(dtoIdx));
        }

      } else {

        if (DateTime.class.isAssignableFrom(returnType)) {

          DateTime leftDT = (DateTime) leftValue;
          DateTime rightDT = (DateTime) rightValue;

          if (!new Date(leftDT.getTime()).equals(new Date(rightDT.getTime()))) {
            return false;
          }

        } else if (Time.class.isAssignableFrom(returnType)) {

          Time leftDT = (Time) leftValue;
          Time rightDT = (Time) rightValue;

          if (leftDT == null || rightDT == null) {
            return false;
          }

        } else if (BigDecimal.class.isAssignableFrom(returnType)) {

          BigDecimal left = (BigDecimal) leftValue;
          BigDecimal right = (BigDecimal) rightValue;

          if (left.doubleValue() != right.doubleValue()) {
            return false;
          }

        }

        else if (!leftValue.equals(rightValue)) {
          return false;
        }
      }
    }

    return true;
  }
}
