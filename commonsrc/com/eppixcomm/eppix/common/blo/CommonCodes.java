/* ====================================================================== *
 * (c) Copyright Eppixcomm Tech Ltd.                                      *
 * All Rights Reserved                                                    *
 *                                                                        *
 * Legal Information                                                      *
 * ====================================================================== */
package com.eppixcomm.eppix.common.blo;

/**
 * Common message codes.
 *
 * @author RobCross
 * @deprecated use CommonMessages
 */
public interface CommonCodes {
  /**
   * CMN/Description/001: Display Code already exists: displayCode=$0,
   * languageCode=$1
   */
  public static final String CMN_DESCRIPTION_001 = "CMN/Description/001";
  /** CMN/Description/002: At least one Display Code must be defined. */
  public static final String CMN_DESCRIPTION_002 = "CMN/Description/002";
  /** CMN/Language/000: Language does not exist: languageId=$0 */
  public static final String CMN_LANGUAGE_000 = "CMN/Language/000";
  /** CMN/Language/001: Language already exists: languageId=$0 */
  public static final String CMN_LANGUAGE_001 = "CMN/Language/001";
  /**
   * CMN/Language/002: Unable to delete Language because it is in use:
   * languageId=$0
   */
  public static final String CMN_LANGUAGE_002 = "CMN/Language/002";
}