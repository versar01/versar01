/* ====================================================================== *
 * (c) Copyright Eppixcomm Tech Ltd.                                      *
 * All Rights Reserved                                                    *
 *                                                                        *
 * Legal Information                                                      *
 * ====================================================================== */
package com.eppixcomm.eppix.common.blo;

import com.eppixcomm.eppix.base.error.Message;

/**
 * Common messages.
 * 
 * @author $Author$
 */
public interface CommonMessages {

  // Description ///////////////////////////////////////////////////////////////

  /**
   * CMN/Description/001: Display Code already exists: displayCode=$0,
   * languageCode=$1
   */
  public static final Message CMN_DESCRIPTION_001 = new Message(
    "CMN/Description/001",
    "Display Code already exists: displayCode=$0, languageCode=$1");

  /** CMN/Description/002: At least one Display Code must be defined. */
  public static final Message CMN_DESCRIPTION_002 = new Message(
    "CMN/Description/002", "At least one Display Code must be defined.");

  /**
   * CMN/Description/003: A description must be defined for the system language.
   */
  public static final Message CMN_DESCRIPTION_003 = new Message(
    "CMN/Description/003",
    "A description must be defined for the system language: systemLanguage=$0");

  // EnumeratedType ////////////////////////////////////////////////////////////

  /**
   * CMN/EnumeratedType/002: Enumerated Type has been updated by another user:
   * recordId=$0, entityId=$1, recordVersion=$2
   */
  public static final Message CMN_ENUMERATEDTYPE_002 = new Message(
    "CMN/EnumeratedType/002",
    "Enumerated Type has been updated by another user: recordId=$0"
      + ", entityId=$1, recordVersion=$2");

  // Language //////////////////////////////////////////////////////////////////

  /**
   * CMN/Language/000: Language does not exist: languageId=$0
   */
  public static final Message CMN_LANGUAGE_000 = new Message(
    "CMN/Language/000", "Language does not exist: languageId=$0");

  /**
   * CMN/Language/001: Language already exists: languageId=$0
   */
  public static final Message CMN_LANGUAGE_001 = new Message(
    "CMN/Language/001", "Language already exists: languageId=$0");

  /**
   * CMN/Language/002: Language has been updated by another user: languageId=$0,
   * recordVersion=$1
   */
  public static final Message CMN_LANGUAGE_002 = new Message(
    "CMN/Language/002",
    "Language has been updated by another user: languageId=$0, "
      + "recordVersion=$1");

  /**
   * CMN/Language/003: Unable to delete Language because it is in use:
   * languageId=$0
   */
  public static final Message CMN_LANGUAGE_003 = new Message(
    "CMN/Language/003",
    "Unable to delete Language because it is in use: languageId=$0");

  /**
   * CMN/Language/004: Any language that is currently set as 'system language'
   * cannot be deleted; set another language to be 'system language' before
   * attempting to delete this one: languageId=$0
   */
  public static final Message CMN_LANGUAGE_004 = new Message(
    "CMN/Language/004",
    "Any language that is currently set as 'system language' cannot be "
      + "deleted; set another language to be 'system language' before "
      + "attempting to delete this one: languageId=$0");

  /**
   * CMN/Language/005: The status of this language as 'system language' cannot
   * be changed; set another language to be 'system language': languageId=$0
   */
  public static final Message CMN_LANGUAGE_005 = new Message(
    "CMN/Language/005", "The status of this language as 'system language' "
      + "cannot be changed; set another language to be 'system language': "
      + "languageId=$0");

  /**
   * CMN/Language/006: A language flagged as 'System Language' does not exist!
   */
  public static final Message CMN_LANGUAGE_006 = new Message(
    "CMN/Language/006",
    "A language flagged as 'System Language' does not exist!");
  
  // Title /////////////////////////////////////////////////////////////////////

  /**
   * CMN/Title/000: Title does not exist: titleId=$0, displayCode=$1,
   * languageCode=$2
   */
  public static final Message CMN_TITLE_000 = new Message("CMN/Title/000",
    "Title does not exist: titleId=$0, displayCode=$1, " + "languageCode=$2");

  /**
   * CMN/Title/001: Title already exists: displayCode=$0, languageCode=$1
   */
  public static final Message CMN_TITLE_001 = new Message("CMN/Title/001",
    "Title already exists: displayCode=$0, languageCode=$1");

  /**
   * CMN/Title/002: Title has been updated by another user: titleId=$0,
   * displayCode=$1, recordVersion=$2
   */
  public static final Message CMN_TITLE_002 = new Message("CMN/Title/002",
    "Title has been updated by another user: titleId=$0, "
      + "displayCode=$1, recordVersion=$2");

  /**
   * CMN/Title/003: Unable to delete Title because it is in use: titleId=$0,
   * displayCode=$1, languageCode=$2
   */
  public static final Message CMN_TITLE_003 = new Message("CMN/Title/003",
    "Unable to delete Title because it is in use: titleId=$0, "
      + "displayCode=$1, languageCode=$2");
}