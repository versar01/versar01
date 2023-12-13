/* ====================================================================== *
 * (c) Copyright Eppixcomm Tech Ltd.                                      *
 * All Rights Reserved                                                    *
 *                                                                        *
 * Legal Information                                                      *
 * ====================================================================== */
package com.eppixcomm.eppix.common.blo;

import java.util.List;

/**
 * Objects implementing this interface are identified by language specific
 * descriptions. A description includes the following data items: -<br>
 * languageCode - a code identifying the language. <br>
 * displayCode - a language specific short code identifying the object. This is
 * distinct for the type of object and language. <br>
 * description - a language specific short description. <br>
 * explanation - a language specific long description. <br>
 * 
 * @author $Author$
 * @version $Revision: 1.3 $
 * 
 * @since $jdk$
 */
public interface HasDescriptions {
  /**
   * Returns the record identifier of the object.
   * 
   * @return record identifier.
   */
  public String getRecordId();

  /**
   * Returns the language code of the object's description.
   * 
   * @return language code.
   */
  public String getLanguageCode();  

  /**
   * Returns the object's language specific short code.
   * 
   * @return display code.
   */
  public String getDisplayCode();

  /**
   * Returns the object's language specific short description.
   * 
   * @return description.
   */
  public String getDescription();

  /**
   * Returns the object's language specific long description.
   * 
   * @return explanation
   */
  public String getExplanation();

  /**
   * Returns a list of alternative language specific descriptions.
   * 
   * @return list of DescriptionDMO
   */
  public List getDescriptions();
  
  /**
   * Sets the language code of the object's description.
   * 
   * @param languageCode the language code.
   */
  public void setLanguageCode(String languageCode);

  /**
   * Sets the embedded list of Description objects.
   * 
   * @param descriptions list of Description objects.
   */
  public void setDescriptions(List descriptions);
}