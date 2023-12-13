/*============================================================================================= *
 *
 * (c) 2007 Copyright Eppixcomm.
 * All Rights Reserved
 * Legal Information goes here.
 *
 *============================================================================================= */

/**----------------------------------------------------------------------------------------------
 *
 * Version control details:
 *    @version $Revision: $
 *    @author  $Author: $
 *----------------------------------------------------------------------------------------------*/
package com.eppixcomm.eppix.base.blo;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;
import com.eppixcomm.eppix.common.util.FilterOp;
import com.eppixcomm.eppix.common.util.FilterPart;

//---------------------
// imports
//---------------------
import com.eppixcomm.eppix.common.util.QueryFilter;
import com.eppixcomm.eppix.common.util.Date;
import com.eppixcomm.eppix.common.util.DateTime;
import com.eppixcomm.eppix.common.util.Time;

import java.io.Serializable;

import java.math.BigDecimal;

import java.util.ArrayList;
import java.util.List;

//---------------------
// class javadoc
//---------------------
/**
 * A value object to carry the data for a DotDocType.
 *
 *
 * <H3> A DotDocType is: </H3>
 *
 * <!-- indent text -->
 * <TABLE BORDER="0" CELLPADDING="0" CELLSPACING="0">
 * <TR>
 * <TD WIDTH="25">&nbsp;</TD>
 * <TD>
 *
 * Defines a related group of documents.
 * <p>
 *   Each entry defines a document type, such as all threat to bar letters. It does not differentiate between the different
 *   variants of the document that might be used for different categories of account, nor between the different versions of
 *   the document that may accumulate over time. These variations on the document are listed in dod_doc_definition and
 *   dov_doc_version.
 * </p>
 * <p>
 *   When eppix raises a request for a letter it specifies one of these document types.
 * </p>
 *
 * <!-- end indent text -->
 * </TD>
 * </TR>
 * </TABLE>
 *
 *
 * <H3> DotDocType Value Object: </H3>
 *
 * <!-- indent text -->
 * <TABLE BORDER="0" CELLPADDING="0" CELLSPACING="0">
 * <TR>
 * <TD WIDTH="25">&nbsp;</TD>
 * <TD>
 *
 * <P>
 *     This is a value object (called a Data Model Object or 'DMO').
 *     It is used to pass the data for a dotDocType into and out of the BASE module.
 *     Because it's purpose is to carry data into and out of the module it is visible outside the module.
 * </P>
 * <P>
 *     This value object carries the data for one dotDocType. A dotDocType is:
 * Defines a related group of documents.
 * </P>
 * <P>
 *     It corresponds to the business logic object DotDocType which
 *     contains all the business behaviour of a dotDocType but is not visible outside the
 *     BASE module.
 * </P>
 * <P>
 *     As a value object it has few methods.
 *     The methods it does have are not business logic, they are just methods to make constructing and manipulating it easier.
 * </P>
 *
 * <!-- end indent text -->
 * </TD>
 * </TR>
 * </TABLE>
 *
 *
 *
 * <H3> These Value Objects Contain: </H3>
 *
 * <!-- indent text -->
 * <TABLE BORDER="0" CELLPADDING="0" CELLSPACING="0">
 * <TR>
 * <TD WIDTH="25">&nbsp;</TD>
 * <TD>
 *
 * <P>
 *    This value object contains fields for all the details of a dotDocType, namely:
 * </P>
 *


 * <P>
 *    <U>Fields to carry the Attributes of a dotDocType:</U>
 * </P>
 *
 * <!-- indent text -->
 * <TABLE BORDER="0" CELLPADDING="0" CELLSPACING="0">
 * <TR>
 * <TD WIDTH="25">&nbsp;</TD>
 * <TD>
 *
 * <TABLE BORDER="0" CELLPADDING="5" CELLSPACING="3">
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top"></TD>
 *   <TD ALIGN="left" VALIGN="top"><U>Name</U></TD>
 *   <TD ALIGN="left" VALIGN="top"><U>Datatype</U></TD>
 *   <TD ALIGN="left" VALIGN="top"><U>Nullable</U></TD>
 *   <TD ALIGN="left" VALIGN="top"><U>Description</U></TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>dotTypeCode</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Used internally to identify the document group.
 *       <p>
 *         Multilingual description in tt_type_text for group "DOCTYPE"
 *       </p>
 *
 *     <P>
 *       This attribute forms part of the primary key.
 *     </P>
 *
 *
 *
 *
 *
 *     <P>
 *       See:
 *       <BR>
 *       <!-- link to the anchor of the attribute's getter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#getDotTypeCode()">
 *           getDotTypeCode
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setDotTypeCode(java.lang.String)">
 *           setDotTypeCode (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>dotRelation</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Customer / Subscriber document ("C" / "S")
 *
 *
 *
 *
 *
 *
 *     <P>
 *       See:
 *       <BR>
 *       <!-- link to the anchor of the attribute's getter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#getDotRelation()">
 *           getDotRelation
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setDotRelation(java.lang.String)">
 *           setDotRelation (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>dotSubsystem</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       The subsystem to which the document relates
 *
 *
 *
 *
 *
 *
 *     <P>
 *       See:
 *       <BR>
 *       <!-- link to the anchor of the attribute's getter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#getDotSubsystem()">
 *           getDotSubsystem
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setDotSubsystem(java.lang.String)">
 *           setDotSubsystem (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>dotEngine</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       the way the document is formatted
"W" = Word document
 *
 *
 *
 *
 *
 *
 *     <P>
 *       See:
 *       <BR>
 *       <!-- link to the anchor of the attribute's getter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#getDotEngine()">
 *           getDotEngine
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setDotEngine(java.lang.String)">
 *           setDotEngine (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>dotTypeFolder</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       The name of the folder (or folder path) within the root directory where the blanks for all the variants of this document are stored.
 *       <p>
 *         The root directory itself is defined is system key ASLTBLANKS.
 *       </p>
 *
 *
 *
 *
 *
 *
 *     <P>
 *       See:
 *       <BR>
 *       <!-- link to the anchor of the attribute's getter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#getDotTypeFolder()">
 *           getDotTypeFolder
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setDotTypeFolder(java.lang.String)">
 *           setDotTypeFolder (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>dotFilenameStart</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       The first part of the filename for the blanks.
 *       <p>
 *         All the blanks for this document have filenames that start like this.
 *       </p>
 *
 *
 *
 *
 *
 *
 *     <P>
 *       See:
 *       <BR>
 *       <!-- link to the anchor of the attribute's getter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#getDotFilenameStart()">
 *           getDotFilenameStart
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setDotFilenameStart(java.lang.String)">
 *           setDotFilenameStart (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>dotDefDelivery</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Default delivery method for document
 *
 *
 *
 *
 *
 *
 *     <P>
 *       See:
 *       <BR>
 *       <!-- link to the anchor of the attribute's getter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#getDotDefDelivery()">
 *           getDotDefDelivery
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setDotDefDelivery(java.lang.String)">
 *           setDotDefDelivery (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>dotDefFormat</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Default output format for document
 *
 *
 *
 *
 *
 *
 *     <P>
 *       See:
 *       <BR>
 *       <!-- link to the anchor of the attribute's getter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#getDotDefFormat()">
 *           getDotDefFormat
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setDotDefFormat(java.lang.String)">
 *           setDotDefFormat (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>dotAccReqd</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       "Y" if a request for this document must include an account number so that the required data can be extracted.
 *
 *
 *
 *
 *
 *
 *     <P>
 *       See:
 *       <BR>
 *       <!-- link to the anchor of the attribute's getter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#getDotAccReqd()">
 *           getDotAccReqd
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setDotAccReqd(java.lang.String)">
 *           setDotAccReqd (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>dotSubReqd</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       "Y" if a request for this document must include a subscriber number so that the required data can be extracted.
 *
 *
 *
 *
 *
 *
 *     <P>
 *       See:
 *       <BR>
 *       <!-- link to the anchor of the attribute's getter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#getDotSubReqd()">
 *           getDotSubReqd
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setDotSubReqd(java.lang.String)">
 *           setDotSubReqd (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>dotInvReqd</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       "Y" if a request for this document must include an invoice number so that the required data can be extracted.
 *
 *
 *
 *
 *
 *
 *     <P>
 *       See:
 *       <BR>
 *       <!-- link to the anchor of the attribute's getter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#getDotInvReqd()">
 *           getDotInvReqd
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setDotInvReqd(java.lang.String)">
 *           setDotInvReqd (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>dotReasonType</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Null if no reason code is gathered for requests for this document.
 *       <p>
 *         If reasons are to be given then this is the reason type that defines the acceptable group of reasons from which to
 *         pick. xref rc_reason_type
 *       </p>
 *
 *
 *
 *
 *
 *
 *     <P>
 *       See:
 *       <BR>
 *       <!-- link to the anchor of the attribute's getter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#getDotReasonType()">
 *           getDotReasonType
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setDotReasonType(java.lang.String)">
 *           setDotReasonType (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>dotReasonCode</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       The default reason code to use.
 *       <p>
 *         Has to be one of the reasons from the above group of reasons. xref rc_reason_code
 *       </p>
 *
 *
 *
 *
 *
 *
 *     <P>
 *       See:
 *       <BR>
 *       <!-- link to the anchor of the attribute's getter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#getDotReasonCode()">
 *           getDotReasonCode
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setDotReasonCode(java.lang.String)">
 *           setDotReasonCode (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>dotManipulate</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Allow manipulation of frequency of delivery
 *
 *
 *
 *
 *
 *
 *     <P>
 *       See:
 *       <BR>
 *       <!-- link to the anchor of the attribute's getter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#getDotManipulate()">
 *           getDotManipulate
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setDotManipulate(java.lang.String)">
 *           setDotManipulate (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 * </TABLE>
 *
 * <!-- end indent text -->
 * </TD>
 * </TR>
 * </TABLE>
 *


 * <P>
 *   <U>Fields that carry attributes from other value objects (known as 'flattened in' attributes):</U>
 * </P>
 *
 * <!-- indent text -->
 * <TABLE BORDER="0" CELLPADDING="0" CELLSPACING="0">
 * <TR>
 * <TD WIDTH="25">&nbsp;</TD>
 * <TD>
 *
 *   <P>
 *     This value object has no attributes 'flattened in' from other value objects.
 *   </P>
 *
 * <!-- end indent text -->
 * </TD>
 * </TR>
 * </TABLE>
 *


 *
 * <P>
 *   <U>Fields that can carry one or more associated value objects (known as 'embedded' value objects).</U>
 * </P>
 *
 * <!-- indent text -->
 * <TABLE BORDER="0" CELLPADDING="0" CELLSPACING="0">
 * <TR>
 * <TD WIDTH="25">&nbsp;</TD>
 * <TD>
 *
 *   <P>
 *     This value object never contains any embedded value objects.
 *   </P>
 *
 * <!-- end indent text -->
 * </TD>
 * </TR>
 * </TABLE>
 *
 * <!-- end indent text -->
 * </TD>
 * </TR>
 * </TABLE>
 *
 * <H3> These Value Objects Are Contained by: </H3>


 * <P>
 *   <U>Selected Fields Flattened into:</U>
 * </P>
 *
 * <!-- indent text -->
 * <TABLE BORDER="0" CELLPADDING="0" CELLSPACING="0">
 * <TR>
 * <TD WIDTH="25">&nbsp;</TD>
 * <TD>
 *
 *   <P>
 *     No attributes from this value object get 'flattened in' to other value objects.
 *   </P>
 *
 * <!-- end indent text -->
 * </TD>
 * </TR>
 * </TABLE>
 *


 * <P>
 *   <U>Whole Value Object Embedded in:</U>
 * </P>
 * <!-- indent text -->
 * <TABLE BORDER="0" CELLPADDING="0" CELLSPACING="0">
 * <TR>
 * <TD WIDTH="25">&nbsp;</TD>
 * <TD>
 *
 *   <P>
 *     This value object is never embedded in other value objects.
 *   </P>
 *
 * <!-- end indent text -->
 * </TD>
 * </TR>
 * </TABLE>
 *


 * @see DotDocType
 *
 * @author
 * @version $Revision: $
 *
 * @since $jdk$
 */
public class DotDocTypeDMO
  extends DBO
  implements Serializable {
  //~ Static variables/initializers //////////////////////////////////////////

  //---------------------
  // Field type declarations
  //---------------------
  /**
   * Defines the internal behaviour of the fields so the internal layers can manipulate them without
   * needing to introspect them.
   * The order of the fields in the definition must match the actual order in this DMO.
   */
  private static final int[] fieldTypes = new int[] {
      FIELD_TYPE_STRING /* std public attribute: dotTypeCode  */,
      FIELD_TYPE_STRING /* std public attribute: dotRelation  */,
      FIELD_TYPE_STRING /* std public attribute: dotSubsystem  */,
      FIELD_TYPE_STRING /* std public attribute: dotEngine  */,
      FIELD_TYPE_STRING /* std public attribute: dotTypeFolder  */,
      FIELD_TYPE_STRING /* std public attribute: dotFilenameStart  */,
      FIELD_TYPE_STRING /* std public attribute: dotDefDelivery  */,
      FIELD_TYPE_STRING /* std public attribute: dotDefFormat  */,
      FIELD_TYPE_STRING /* std public attribute: dotAccReqd  */,
      FIELD_TYPE_STRING /* std public attribute: dotSubReqd  */,
      FIELD_TYPE_STRING /* std public attribute: dotInvReqd  */,
      FIELD_TYPE_STRING /* std public attribute: dotReasonType  */,
      FIELD_TYPE_STRING /* std public attribute: dotReasonCode  */,
      FIELD_TYPE_STRING /* std public attribute: dotManipulate  */
    };
  
  /**
  * TODO SJ Implement the array of field sizes
  *
  */
  private final int[] fieldSizes = new int[] {
		  dotTypeCodeSize,
		  dotRelationSize,
		  dotSubsystemSize,
		   dotEngineSize,
		  dotTypeFolderSize,
		  dotFilenameStartSize,
		  dotDefDeliverySize,
		  dotDefFormatSize,
		  dotAccReqdSize,
		  dotSubReqdSize,
		  dotInvReqdSize,
		  dotReasonTypeSize,
		  dotReasonCodeSize,
		  dotManipulateSize
  };
      

  public int[] fieldSizes() {
  	return fieldSizes;
  }  

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int dotTypeCodeFilter = 0; // filter index
  private static final int dotTypeCodeSize = 10; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int dotRelationFilter = 1; // filter index
  private static final int dotRelationSize = 1; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int dotSubsystemFilter = 2; // filter index
  private static final int dotSubsystemSize = 5; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int dotEngineFilter = 3; // filter index
  private static final int dotEngineSize = 1; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int dotTypeFolderFilter = 4; // filter index
  private static final int dotTypeFolderSize = 70; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int dotFilenameStartFilter = 5; // filter index
  private static final int dotFilenameStartSize = 40; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int dotDefDeliveryFilter = 6; // filter index
  private static final int dotDefDeliverySize = 5; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int dotDefFormatFilter = 7; // filter index
  private static final int dotDefFormatSize = 5; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int dotAccReqdFilter = 8; // filter index
  private static final int dotAccReqdSize = 1; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int dotSubReqdFilter = 9; // filter index
  private static final int dotSubReqdSize = 1; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int dotInvReqdFilter = 10; // filter index
  private static final int dotInvReqdSize = 1; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int dotReasonTypeFilter = 11; // filter index
  private static final int dotReasonTypeSize = 15; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int dotReasonCodeFilter = 12; // filter index
  private static final int dotReasonCodeSize = 4; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int dotManipulateFilter = 13; // filter index
  private static final int dotManipulateSize = 1; // field size

  //~ Instance variables /////////////////////////////////////////////////////

  private String dotAccReqd; // Loaded from Schema
  private String dotDefDelivery; // Loaded from Schema
  private String dotDefFormat; // Loaded from Schema
  private String dotEngine; // Loaded from Schema
  private String dotFilenameStart; // Loaded from Schema
  private String dotInvReqd; // Loaded from Schema
  private String dotManipulate; // Loaded from Schema
  private String dotReasonCode; // Loaded from Schema
  private String dotReasonType; // Loaded from Schema
  private String dotRelation; // Loaded from Schema
  private String dotSubReqd; // Loaded from Schema
  private String dotSubsystem; // Loaded from Schema

  //---------------------
  // Field declarations
  //---------------------
  // all attributes
  private String dotTypeCode; // Loaded from Schema
  private String dotTypeFolder; // Loaded from Schema

  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new DotDocTypeDMO object.
   */
  public DotDocTypeDMO(  ) {
  }

  // Constructor - taking public attributes
  /**
   * Creates a new DotDocTypeDMO object.
   *
   * @param dotTypeCode DOCUMENT ME!
   * @param dotRelation DOCUMENT ME!
   * @param dotSubsystem DOCUMENT ME!
   * @param dotEngine DOCUMENT ME!
   * @param dotTypeFolder DOCUMENT ME!
   * @param dotFilenameStart DOCUMENT ME!
   * @param dotDefDelivery DOCUMENT ME!
   * @param dotDefFormat DOCUMENT ME!
   * @param dotAccReqd DOCUMENT ME!
   * @param dotSubReqd DOCUMENT ME!
   * @param dotInvReqd DOCUMENT ME!
   * @param dotReasonType DOCUMENT ME!
   * @param dotReasonCode DOCUMENT ME!
   * @param dotManipulate DOCUMENT ME!
   */
  public DotDocTypeDMO( 
    final String dotTypeCode,
    final String dotRelation,
    final String dotSubsystem,
    final String dotEngine,
    final String dotTypeFolder,
    final String dotFilenameStart,
    final String dotDefDelivery,
    final String dotDefFormat,
    final String dotAccReqd,
    final String dotSubReqd,
    final String dotInvReqd,
    final String dotReasonType,
    final String dotReasonCode,
    final String dotManipulate ) {
    this.dotTypeCode = dotTypeCode;

    this.dotRelation = dotRelation;

    this.dotSubsystem = dotSubsystem;

    this.dotEngine = dotEngine;

    this.dotTypeFolder = dotTypeFolder;

    this.dotFilenameStart = dotFilenameStart;

    this.dotDefDelivery = dotDefDelivery;

    this.dotDefFormat = dotDefFormat;

    this.dotAccReqd = dotAccReqd;

    this.dotSubReqd = dotSubReqd;

    this.dotInvReqd = dotInvReqd;

    this.dotReasonType = dotReasonType;

    this.dotReasonCode = dotReasonCode;

    this.dotManipulate = dotManipulate;
  }

  //~ Methods ////////////////////////////////////////////////////////////////

  // DBO method implementations ////////////////////////////////////////////////

  /**
   * Not used by this class.
   *
   */
  protected void generatedKey( final Integer key ) {
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  protected Integer versionNumber(  ) {
    return null;
  }

  /**
   * DOCUMENT ME!
   *
   * @param recordVersion DOCUMENT ME!
   */
  protected void versionNumber( final Integer recordVersion ) {
  }

  // DMO method implementations ////////////////////////////////////////////////
  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  protected DAOArgs primaryKey(  ) {
    return new DAOArgs( 1 ).arg( ( this.dotTypeCode == null ) ? null
                                                              : this.dotTypeCode
      .trim(  ) );
  }

  // methods for concrete classes follow...
  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  protected int[] fieldTypes(  ) {
    return fieldTypes;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  protected Object[] get(  ) {
    return new Object[] {
      ( dotTypeCode == null ) ? null
                              : ( ( dotTypeCode.length(  ) <= dotTypeCodeSize )
      ? dotTypeCode
      : dotTypeCode.substring( 0, dotTypeCodeSize ) // auto trimmed to fit, if required.
       ),
      ( dotRelation == null ) ? null
                              : ( ( dotRelation.length(  ) <= dotRelationSize )
      ? dotRelation
      : dotRelation.substring( 0, dotRelationSize ) // auto trimmed to fit, if required.
       ),
      ( dotSubsystem == null ) ? null
                               : ( ( dotSubsystem.length(  ) <= dotSubsystemSize )
      ? dotSubsystem
      : dotSubsystem.substring( 0, dotSubsystemSize ) // auto trimmed to fit, if required.
       ),
      ( dotEngine == null ) ? null
                            : ( ( dotEngine.length(  ) <= dotEngineSize )
      ? dotEngine
      : dotEngine.substring( 0, dotEngineSize ) // auto trimmed to fit, if required.
       ),
      ( dotTypeFolder == null ) ? null
                                : ( ( dotTypeFolder.length(  ) <= dotTypeFolderSize )
      ? dotTypeFolder
      : dotTypeFolder.substring( 0, dotTypeFolderSize ) // auto trimmed to fit, if required.
       ),
      ( dotFilenameStart == null ) ? null
                                   : ( ( dotFilenameStart.length(  ) <= dotFilenameStartSize )
      ? dotFilenameStart
      : dotFilenameStart.substring( 0, dotFilenameStartSize ) // auto trimmed to fit, if required.
       ),
      ( dotDefDelivery == null ) ? null
                                 : ( ( dotDefDelivery.length(  ) <= dotDefDeliverySize )
      ? dotDefDelivery
      : dotDefDelivery.substring( 0, dotDefDeliverySize ) // auto trimmed to fit, if required.
       ),
      ( dotDefFormat == null ) ? null
                               : ( ( dotDefFormat.length(  ) <= dotDefFormatSize )
      ? dotDefFormat
      : dotDefFormat.substring( 0, dotDefFormatSize ) // auto trimmed to fit, if required.
       ),
      ( dotAccReqd == null ) ? null
                             : ( ( dotAccReqd.length(  ) <= dotAccReqdSize )
      ? dotAccReqd
      : dotAccReqd.substring( 0, dotAccReqdSize ) // auto trimmed to fit, if required.
       ),
      ( dotSubReqd == null ) ? null
                             : ( ( dotSubReqd.length(  ) <= dotSubReqdSize )
      ? dotSubReqd
      : dotSubReqd.substring( 0, dotSubReqdSize ) // auto trimmed to fit, if required.
       ),
      ( dotInvReqd == null ) ? null
                             : ( ( dotInvReqd.length(  ) <= dotInvReqdSize )
      ? dotInvReqd
      : dotInvReqd.substring( 0, dotInvReqdSize ) // auto trimmed to fit, if required.
       ),
      ( dotReasonType == null ) ? null
                                : ( ( dotReasonType.length(  ) <= dotReasonTypeSize )
      ? dotReasonType
      : dotReasonType.substring( 0, dotReasonTypeSize ) // auto trimmed to fit, if required.
       ),
      ( dotReasonCode == null ) ? null
                                : ( ( dotReasonCode.length(  ) <= dotReasonCodeSize )
      ? dotReasonCode
      : dotReasonCode.substring( 0, dotReasonCodeSize ) // auto trimmed to fit, if required.
       ),
      ( dotManipulate == null ) ? null
                                : ( ( dotManipulate.length(  ) <= dotManipulateSize )
      ? dotManipulate
      : dotManipulate.substring( 0, dotManipulateSize ) // auto trimmed to fit, if required.
       )
    };
  }

  /**
   * DOCUMENT ME!
   *
   * @param fields DOCUMENT ME!
   */
  protected void set( final Object[] fields ) {
    dotTypeCode = rtrim( (String) fields[0] );
    dotRelation = rtrim( (String) fields[1] );
    dotSubsystem = rtrim( (String) fields[2] );
    dotEngine = rtrim( (String) fields[3] );
    dotTypeFolder = rtrim( (String) fields[4] );
    dotFilenameStart = rtrim( (String) fields[5] );
    dotDefDelivery = rtrim( (String) fields[6] );
    dotDefFormat = rtrim( (String) fields[7] );
    dotAccReqd = rtrim( (String) fields[8] );
    dotSubReqd = rtrim( (String) fields[9] );
    dotInvReqd = rtrim( (String) fields[10] );
    dotReasonType = rtrim( (String) fields[11] );
    dotReasonCode = rtrim( (String) fields[12] );
    dotManipulate = rtrim( (String) fields[13] );
  }

  // Get methods ///////////////////////////////////////////////////////////////
  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getDotTypeCode(  ) {
    return dotTypeCode;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getDotRelation(  ) {
    return dotRelation;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getDotSubsystem(  ) {
    return dotSubsystem;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getDotEngine(  ) {
    return dotEngine;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getDotTypeFolder(  ) {
    return dotTypeFolder;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getDotFilenameStart(  ) {
    return dotFilenameStart;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getDotDefDelivery(  ) {
    return dotDefDelivery;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getDotDefFormat(  ) {
    return dotDefFormat;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getDotAccReqd(  ) {
    return dotAccReqd;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getDotSubReqd(  ) {
    return dotSubReqd;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getDotInvReqd(  ) {
    return dotInvReqd;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getDotReasonType(  ) {
    return dotReasonType;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getDotReasonCode(  ) {
    return dotReasonCode;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getDotManipulate(  ) {
    return dotManipulate;
  }

  // Setter methods ///////////////////////////////////////////////////////////////

  //
  // Master setter follows...
  //

  /**
   * Setter that takes all attributes
   */
  public void set( 
    final String dotTypeCode,
    final String dotRelation,
    final String dotSubsystem,
    final String dotEngine,
    final String dotTypeFolder,
    final String dotFilenameStart,
    final String dotDefDelivery,
    final String dotDefFormat,
    final String dotAccReqd,
    final String dotSubReqd,
    final String dotInvReqd,
    final String dotReasonType,
    final String dotReasonCode,
    final String dotManipulate ) {
    this.dotTypeCode = dotTypeCode;
    this.dotRelation = dotRelation;
    this.dotSubsystem = dotSubsystem;
    this.dotEngine = dotEngine;
    this.dotTypeFolder = dotTypeFolder;
    this.dotFilenameStart = dotFilenameStart;
    this.dotDefDelivery = dotDefDelivery;
    this.dotDefFormat = dotDefFormat;
    this.dotAccReqd = dotAccReqd;
    this.dotSubReqd = dotSubReqd;
    this.dotInvReqd = dotInvReqd;
    this.dotReasonType = dotReasonType;
    this.dotReasonCode = dotReasonCode;
    this.dotManipulate = dotManipulate;
  }

  //
  // Public access modifiers if any
  // (provided for attributes that are public in the analysis model)
  //    

  /**
  * Sets the DotTypeCode field.
  *
  * @param dotTypeCode
  */
  public void setDotTypeCode( final String dotTypeCode ) {
    this.dotTypeCode = getPadded(dotTypeCode, dotTypeCodeFilter);
  }

  /**
  * Sets the DotRelation field.
  *
  * @param dotRelation
  */
  public void setDotRelation( final String dotRelation ) {
    this.dotRelation = getPadded(dotRelation, dotRelationFilter);
  }

  /**
  * Sets the DotSubsystem field.
  *
  * @param dotSubsystem
  */
  public void setDotSubsystem( final String dotSubsystem ) {
    this.dotSubsystem = getPadded(dotSubsystem, dotSubsystemFilter);
  }

  /**
  * Sets the DotEngine field.
  *
  * @param dotEngine
  */
  public void setDotEngine( final String dotEngine ) {
    this.dotEngine = getPadded(dotEngine, dotEngineFilter);
  }

  /**
  * Sets the DotTypeFolder field.
  *
  * @param dotTypeFolder
  */
  public void setDotTypeFolder( final String dotTypeFolder ) {
    this.dotTypeFolder = getPadded(dotTypeFolder, dotTypeFolderFilter);
  }

  /**
  * Sets the DotFilenameStart field.
  *
  * @param dotFilenameStart
  */
  public void setDotFilenameStart( final String dotFilenameStart ) {
    this.dotFilenameStart = getPadded(dotFilenameStart, dotFilenameStartFilter);
  }

  /**
  * Sets the DotDefDelivery field.
  *
  * @param dotDefDelivery
  */
  public void setDotDefDelivery( final String dotDefDelivery ) {
    this.dotDefDelivery = getPadded(dotDefDelivery, dotDefDeliveryFilter);
  }

  /**
  * Sets the DotDefFormat field.
  *
  * @param dotDefFormat
  */
  public void setDotDefFormat( final String dotDefFormat ) {
    this.dotDefFormat = getPadded(dotDefFormat, dotDefFormatFilter);
  }

  /**
  * Sets the DotAccReqd field.
  *
  * @param dotAccReqd
  */
  public void setDotAccReqd( final String dotAccReqd ) {
    this.dotAccReqd = getPadded(dotAccReqd, dotAccReqdFilter);
  }

  /**
  * Sets the DotSubReqd field.
  *
  * @param dotSubReqd
  */
  public void setDotSubReqd( final String dotSubReqd ) {
    this.dotSubReqd = getPadded(dotSubReqd, dotSubReqdFilter);
  }

  /**
  * Sets the DotInvReqd field.
  *
  * @param dotInvReqd
  */
  public void setDotInvReqd( final String dotInvReqd ) {
    this.dotInvReqd = getPadded(dotInvReqd, dotInvReqdFilter);
  }

  /**
  * Sets the DotReasonType field.
  *
  * @param dotReasonType
  */
  public void setDotReasonType( final String dotReasonType ) {
    this.dotReasonType = getPadded(dotReasonType, dotReasonTypeFilter);
  }

  /**
  * Sets the DotReasonCode field.
  *
  * @param dotReasonCode
  */
  public void setDotReasonCode( final String dotReasonCode ) {
    this.dotReasonCode = getPadded(dotReasonCode, dotReasonCodeFilter);
  }

  /**
  * Sets the DotManipulate field.
  *
  * @param dotManipulate
  */
  public void setDotManipulate( final String dotManipulate ) {
    this.dotManipulate = getPadded(dotManipulate, dotManipulateFilter);
  }

  //
  // Protected access modifiers if any
  // (provided for attributes that are protected in the analysis model)
  //    

  //
  // Package/Default access modifiers if any
  // (provided for attributes that are package/default in the analysis model)
  //    

  //
  // Setters for embedded lists of DMOs if any...
  //      
}
