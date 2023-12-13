/* ====================================================================== *
 * (c) Copyright Eppixcomm Tech Ltd.                                      *
 * All Rights Reserved                                                    *
 *                                                                        *
 * Legal Information                                                      *
 * ====================================================================== */
package com.eppixcomm.eppix.common.data;

public interface DTOActions
{

  public abstract void actionNone();

  /**
   * Marks the DMO for insertion into the database when passed into a
   * DAO.action() method.
   */
  public abstract void actionInsert();

  /**
   * Marks the DMO for updating in the database when passed into a
   * DAO.action() method.
   */
  public abstract void actionUpdate();

  /**
   * Marks the DMO for deletion from the database when passed into a
   * DAO.action() method.
   */
  public abstract void actionDelete();
  
  /**
   * Marks the DMO for change/swap in the database when passed into a
   * DAO.action() method.
   */
  public abstract void actionChange();
  
  /**
   * Marks the DMO for correction in the database when passed into a
   * DAO.action() method.
   */
  public abstract void actionCorrect();    

  /**
   * Marks the DMO for global action scope.
   */
  public abstract void scopeGlobal();    
  
  /**
   * Marks the DMO for local action scope.
   */
  public abstract void scopeLocal();    
  
  
  /**
   * Returns the current state of the action
   */
  public abstract char getAction();

  /**
   * Sets the current state of the action
   */
  public abstract void setAction(char action);
  
  /**
   * Returns the current scope of the action
   */
  public abstract char getScope();  
  
  /**
   * Sets the current scope of the action
   */
  public abstract void setScope(char scope);  
    
}