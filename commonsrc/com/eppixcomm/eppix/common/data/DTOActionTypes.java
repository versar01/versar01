/* ====================================================================== *
 * (c) Copyright Eppixcomm Tech Ltd.                                      *
 * All Rights Reserved                                                    *
 *                                                                        *
 * Legal Information                                                      *
 * ====================================================================== */
package com.eppixcomm.eppix.common.data;

public interface DTOActionTypes
{
  /** No action is taken when the DMO is passed into a DAO.action() method */
  public final char ACTION_NONE = 'N';

  /** Insert the DMO into the database when passed into a DAO.action() method */
  public final char ACTION_INSERT = 'I';

  /** Update the DMO in the database when passed into a DAO.action() method */
  public final char ACTION_UPDATE = 'U';

  /** Delete the DMO from the database when passed into a DAO.action() method */
  public final char ACTION_DELETE = 'D';
  
  /** Correct the DMO in the database when passed into a DAO.action() method */
  public final char ACTION_CORRECTION = 'C';
  
  /** Change/Swap the DMO in the database when passed into a DAO.action() method */
  public final char ACTION_CHANGE = 'S';    

  /** No scope  fefined for this DMO */
  public final char SCOPE_NONE = '\u0000';
  
  /** The global scope for a DMO implied for a DMO*/
  public final char SCOPE_GLOBAL = 'G';    
  
  /** The local scope for a DMO implied for a DMO*/
  public final char SCOPE_LOCAL = 'L';      
}