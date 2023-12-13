/* ====================================================================== *
 * (c) Copyright Eppixcomm Tech Ltd.                                      *
 * All Rights Reserved                                                    *
 *                                                                        *
 * Legal Information                                                      *
 * ====================================================================== */
package com.eppixcomm.eppix.base.error;

/**
 * General message codes.
 *
 * @author $Author$
 */
public interface GeneralMessages {
  
  /** A fatal system error has occurred: errorMessage=$0 */
  public static final Message GEN_000 = new Message( "GEN/000", 
    "A fatal system error has occurred: errorMessage=$0" );
    
  /** An unexpected error has occurred: errorMessage=$0 */  
  public static final Message GEN_001 = new Message( "GEN/001", 
    "An unexpected error has occurred: errorMessage=$0" );
    
  /** Mandatory parameter not provided: parameterName=$0 */
  public static final Message GEN_002 = new Message( "GEN/002", 
    "Mandatory parameter not provided: parameterName=$0" );
    
  /** Parameter must not be provided: parameterName=$0 */
  public static final Message GEN_003 = new Message( "GEN/003",
    "Parameter must not be provided: parameterName=$0" );
    
  /** Insufficient security access privileges: errorMessage=$0 */
  public static final Message GEN_004 = new Message( "GEN/004",
    "Insufficient security access privileges: errorMessage=$0" );  
}