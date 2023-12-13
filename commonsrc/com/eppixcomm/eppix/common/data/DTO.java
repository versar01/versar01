/* ====================================================================== *
 * (c) Copyright Eppixcomm Tech Ltd.                                      *
 * All Rights Reserved                                                    *
 *                                                                        *
 * Legal Information                                                      *
 * ====================================================================== */
package com.eppixcomm.eppix.common.data;

import com.eppixcomm.eppix.base.error.EPPIXSeriousException;
import com.eppixcomm.eppix.base.error.EPPIXUnexpectedException;
import com.eppixcomm.eppix.base.error.Thrower;
import com.eppixcomm.eppix.common.util.Date;
import com.eppixcomm.eppix.common.util.DateTime;

import org.apache.log4j.Logger;

import java.io.IOException;
import java.io.Serializable;
import java.io.StringReader;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author $Author$
 * @version $Revision: 1.14 $
 */
public class DTO implements DTOActions, DTOActionTypes,
    Serializable {

//  private static Thrower thrower = Thrower.getThrower(DTO.class);

//  private static Logger logger = thrower.getLogger();

  //  private Formatters dataFormatters;
//  private List<TransformationException> transformationErrors;

  /** Action indicator */
  protected char _action = ACTION_NONE;

  /** Scope indicator */
  protected char _scope = SCOPE_NONE;

  /**
   * Marks the DMO as requiring no action when passed into a DAO.action()
   * method.
   */
  public void actionNone() {

    _action = ACTION_NONE;
  }

  /**
   * Marks the DMO for insertion into the database when passed into a
   * DAO.action() method.
   */
  public void actionInsert() {

    _action = ACTION_INSERT;
  }

  /**
   * Marks the DMO for updating in the database when passed into a
   * DAO.action() method.
   */
  public void actionUpdate() {

    _action = ACTION_UPDATE;
  }

  /**
   * Marks the DMO for deletion from the database when passed into a
   * DAO.action() method.
   */
  public void actionDelete() {

    _action = ACTION_DELETE;
  }

  /**
   * Marks the DMO for deletion from the database when passed into a
   * DAO.action() method.
   */
  public void actionCorrect() {

    _action = ACTION_CORRECTION;
  }

  /**
   * Marks the DMO for deletion from the database when passed into a
   * DAO.action() method.
   */
  public void actionChange() {

    _action = ACTION_CHANGE;
  }

  /**
   * Marks the DMO for local action scope
   */
  public void scopeLocal() {

    _scope = SCOPE_LOCAL;
  }

  /**
   * Marks the DMO for global action scope
   */
  public void scopeGlobal() {

    _scope = SCOPE_GLOBAL;
  }

  /**
   * Returns the current state of the action
   */
  public char getAction() {

    return _action;
  }

  /**
   * Sets the current state of the action
   */
  public void setAction(char action) {

    _action = action;
  }

  /**
   * Returns the current scope of the action
   */
  public char getScope() {

    return _scope;
  }

  /**
   * Sets the current scope of the action
   */
  public void setScope(char scope) {

    _scope = scope;
  }

 /**
   * Returns true if the String object reference is null or the length of the
   * string is zero.
   *
   * @param s String to test for null condition.
   *
   * @return true if the String is null.
   */
  public static boolean isNull(String s) {
    return (s == null) || (s.length() == 0) || (s.trim().length() == 0);
  }

  /**
   * Returns true if the List object reference is null or contains no
   * elements.
   *
   * @param a List to test for null condition.
   *
   * @return true if the List is null.
   */
  public static boolean isNull(List a) {
    return (a == null) || (a.isEmpty());
  }

  /**
   * Returns true if the object reference is null.
   *
   * @param o object to test for null condition.
   *
   * @return true if the object is null.
   */
  public static boolean isNull(Object o) {
    return (o == null);
  }
  
  /**
   * Returns true if the HashMap object reference is null or contains no
   * elements.
   *
   * @param map the HashMap to test for null condition.
   *
   * @return true if the HashMap is null.
   */
  public static boolean isNull(HashMap map) {
    return (map == null) || map.isEmpty();
  }


  public boolean equals(Object obj) {

    // this is a DTO ?
    if ((obj == null) || !(obj instanceof DTO)) {
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
        leftValue = method.invoke(this, (Object[])null);
        rightValue = method.invoke(obj, (Object[])null);

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

        } else if (!leftValue.equals(rightValue)) {
          return false;
        }
      }
    }

    return true;
  }

}