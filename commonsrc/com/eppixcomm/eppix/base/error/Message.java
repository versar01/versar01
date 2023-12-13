/* ====================================================================== *
 * (c) Copyright Eppixcomm Tech Ltd.                                      *
 * All Rights Reserved                                                    *
 *                                                                        *
 * Legal Information                                                      *
 * ====================================================================== */
package com.eppixcomm.eppix.base.error;

/**
 * Used to bind a technical message description to its code in a message 
 * interface.
 * 
 * @see com.eppixcomm.eppix.base.error.GeneralMessages
 * 
 * @author $Author$
 */
public class Message {

  private String messageCode;
  private String message;

  /**
   * Create a new message object.
   * 
   * @param messageCode code identifying the message.
   * @param message technical description of the error condition with '$' 
   *        placeholders.
   */
  public Message(String messageCode, String message) {
    this.messageCode = messageCode;
    this.message = message;
  }

  /**
   * Gets the message code.
   * 
   * @return message code.
   */
  public String getMessageCode() {
    return messageCode;
  }

  /**
   * Gets the technical message description.
   * 
   * @return technical message description.
   */
  public String getMessage() {
    return message;
  }

  /**
   * Determines whether this message code is equal to the code of the specified 
   * message object.
   * 
   * @return true if this message object has the same code as the specified 
   *         message.
   */
  public boolean equals(Message message) {

    return (message == null)
      ? false
      : (messageCode == null)
      ? false
      : messageCode.equals(message.getMessageCode());
  }
}
