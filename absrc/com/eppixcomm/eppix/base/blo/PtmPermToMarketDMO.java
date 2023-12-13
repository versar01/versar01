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
 * A value object to carry the data for a PtmPermToMarket.
 *
 *
 * <H3> A PtmPermToMarket is: </H3>
 *
 * <!-- indent text -->
 * <TABLE BORDER="0" CELLPADDING="0" CELLSPACING="0">
 * <TR>
 * <TD WIDTH="25">&nbsp;</TD>
 * <TD>
 *
 * DOCUMENT ME! - by adding a description of this class via the class diagram.
 *
 * <!-- end indent text -->
 * </TD>
 * </TR>
 * </TABLE>
 *
 *
 * <H3> PtmPermToMarket Value Object: </H3>
 *
 * <!-- indent text -->
 * <TABLE BORDER="0" CELLPADDING="0" CELLSPACING="0">
 * <TR>
 * <TD WIDTH="25">&nbsp;</TD>
 * <TD>
 *
 * <P>
 *     This is a value object (called a Data Model Object or 'DMO').
 *     It is used to pass the data for a ptmPermToMarket into and out of the BASE module.
 *     Because it's purpose is to carry data into and out of the module it is visible outside the module.
 * </P>
 * <P>
 *     This value object carries the data for one ptmPermToMarket. A ptmPermToMarket is:
 * DOCUMENT ME! - by adding a description of this class via the class diagram.
 * </P>
 * <P>
 *     It corresponds to the business logic object PtmPermToMarket which
 *     contains all the business behaviour of a ptmPermToMarket but is not visible outside the
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
 *    This value object contains fields for all the details of a ptmPermToMarket, namely:
 * </P>
 *


 * <P>
 *    <U>Fields to carry the Attributes of a ptmPermToMarket:</U>
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
 *   <TD ALIGN="left" VALIGN="top"><B>ptmBillAcNo</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *
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
 *       <A HREF="#getPtmBillAcNo()">
 *           getPtmBillAcNo
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setPtmBillAcNo(java.lang.String)">
 *           setPtmBillAcNo (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>ptmInd</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *
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
 *       <A HREF="#getPtmInd()">
 *           getPtmInd
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setPtmInd(java.lang.String)">
 *           setPtmInd (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>ptmTitle</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *
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
 *       <A HREF="#getPtmTitle()">
 *           getPtmTitle
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setPtmTitle(java.lang.String)">
 *           setPtmTitle (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>ptmSurname</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *
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
 *       <A HREF="#getPtmSurname()">
 *           getPtmSurname
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setPtmSurname(java.lang.String)">
 *           setPtmSurname (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>ptmFirstname</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *
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
 *       <A HREF="#getPtmFirstname()">
 *           getPtmFirstname
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setPtmFirstname(java.lang.String)">
 *           setPtmFirstname (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>ptmPrefComms</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *
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
 *       <A HREF="#getPtmPrefComms()">
 *           getPtmPrefComms
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setPtmPrefComms(java.lang.String)">
 *           setPtmPrefComms (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>ptmAudId</B></TD>
 *   <TD ALIGN="left" VALIGN="top">Integer</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *
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
 *       <A HREF="#getPtmAudId()">
 *           getPtmAudId
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setPtmAudId(java.lang.Integer)">
 *           setPtmAudId (Integer)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>ptmAnalysis1</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *
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
 *       <A HREF="#getPtmAnalysis1()">
 *           getPtmAnalysis1
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setPtmAnalysis1(java.lang.String)">
 *           setPtmAnalysis1 (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>ptmAnalysis2</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *
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
 *       <A HREF="#getPtmAnalysis2()">
 *           getPtmAnalysis2
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setPtmAnalysis2(java.lang.String)">
 *           setPtmAnalysis2 (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>ptmAnalysis3</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *
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
 *       <A HREF="#getPtmAnalysis3()">
 *           getPtmAnalysis3
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setPtmAnalysis3(java.lang.String)">
 *           setPtmAnalysis3 (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>ptmAnalysis4</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *
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
 *       <A HREF="#getPtmAnalysis4()">
 *           getPtmAnalysis4
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setPtmAnalysis4(java.lang.String)">
 *           setPtmAnalysis4 (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>ptmAnalysis5</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *
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
 *       <A HREF="#getPtmAnalysis5()">
 *           getPtmAnalysis5
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setPtmAnalysis5(java.lang.String)">
 *           setPtmAnalysis5 (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>ptmAnalysis6</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *
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
 *       <A HREF="#getPtmAnalysis6()">
 *           getPtmAnalysis6
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setPtmAnalysis6(java.lang.String)">
 *           setPtmAnalysis6 (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>ptmAnalysis7</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *
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
 *       <A HREF="#getPtmAnalysis7()">
 *           getPtmAnalysis7
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setPtmAnalysis7(java.lang.String)">
 *           setPtmAnalysis7 (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>ptmAnalysis8</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *
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
 *       <A HREF="#getPtmAnalysis8()">
 *           getPtmAnalysis8
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setPtmAnalysis8(java.lang.String)">
 *           setPtmAnalysis8 (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>ptmAnalysis9</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *
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
 *       <A HREF="#getPtmAnalysis9()">
 *           getPtmAnalysis9
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setPtmAnalysis9(java.lang.String)">
 *           setPtmAnalysis9 (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>ptmAnalysis10</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *
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
 *       <A HREF="#getPtmAnalysis10()">
 *           getPtmAnalysis10
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setPtmAnalysis10(java.lang.String)">
 *           setPtmAnalysis10 (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>ptmAnalysis11</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *
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
 *       <A HREF="#getPtmAnalysis11()">
 *           getPtmAnalysis11
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setPtmAnalysis11(java.lang.String)">
 *           setPtmAnalysis11 (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>ptmAnalysis12</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *
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
 *       <A HREF="#getPtmAnalysis12()">
 *           getPtmAnalysis12
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setPtmAnalysis12(java.lang.String)">
 *           setPtmAnalysis12 (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>ptmAnalysis13</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *
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
 *       <A HREF="#getPtmAnalysis13()">
 *           getPtmAnalysis13
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setPtmAnalysis13(java.lang.String)">
 *           setPtmAnalysis13 (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>ptmAnalysis14</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *
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
 *       <A HREF="#getPtmAnalysis14()">
 *           getPtmAnalysis14
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setPtmAnalysis14(java.lang.String)">
 *           setPtmAnalysis14 (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>ptmAnalysis15</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *
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
 *       <A HREF="#getPtmAnalysis15()">
 *           getPtmAnalysis15
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setPtmAnalysis15(java.lang.String)">
 *           setPtmAnalysis15 (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>ptmAnalysis16</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *
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
 *       <A HREF="#getPtmAnalysis16()">
 *           getPtmAnalysis16
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setPtmAnalysis16(java.lang.String)">
 *           setPtmAnalysis16 (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>ptmAnalysis17</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *
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
 *       <A HREF="#getPtmAnalysis17()">
 *           getPtmAnalysis17
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setPtmAnalysis17(java.lang.String)">
 *           setPtmAnalysis17 (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>ptmAnalysis18</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *
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
 *       <A HREF="#getPtmAnalysis18()">
 *           getPtmAnalysis18
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setPtmAnalysis18(java.lang.String)">
 *           setPtmAnalysis18 (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>ptmAnalysis19</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *
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
 *       <A HREF="#getPtmAnalysis19()">
 *           getPtmAnalysis19
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setPtmAnalysis19(java.lang.String)">
 *           setPtmAnalysis19 (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>ptmAnalysis20</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *
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
 *       <A HREF="#getPtmAnalysis20()">
 *           getPtmAnalysis20
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setPtmAnalysis20(java.lang.String)">
 *           setPtmAnalysis20 (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>ptmAnalysis21</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *
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
 *       <A HREF="#getPtmAnalysis21()">
 *           getPtmAnalysis21
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setPtmAnalysis21(java.lang.String)">
 *           setPtmAnalysis21 (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>ptmAnalysis22</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *
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
 *       <A HREF="#getPtmAnalysis22()">
 *           getPtmAnalysis22
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setPtmAnalysis22(java.lang.String)">
 *           setPtmAnalysis22 (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>ptmAnalysis23</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *
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
 *       <A HREF="#getPtmAnalysis23()">
 *           getPtmAnalysis23
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setPtmAnalysis23(java.lang.String)">
 *           setPtmAnalysis23 (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>ptmAnalysis24</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *
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
 *       <A HREF="#getPtmAnalysis24()">
 *           getPtmAnalysis24
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setPtmAnalysis24(java.lang.String)">
 *           setPtmAnalysis24 (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>ptmAnalysis25</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *
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
 *       <A HREF="#getPtmAnalysis25()">
 *           getPtmAnalysis25
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setPtmAnalysis25(java.lang.String)">
 *           setPtmAnalysis25 (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>ptmAnalysis26</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *
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
 *       <A HREF="#getPtmAnalysis26()">
 *           getPtmAnalysis26
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setPtmAnalysis26(java.lang.String)">
 *           setPtmAnalysis26 (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>ptmAnalysis27</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *
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
 *       <A HREF="#getPtmAnalysis27()">
 *           getPtmAnalysis27
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setPtmAnalysis27(java.lang.String)">
 *           setPtmAnalysis27 (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>ptmAnalysis28</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *
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
 *       <A HREF="#getPtmAnalysis28()">
 *           getPtmAnalysis28
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setPtmAnalysis28(java.lang.String)">
 *           setPtmAnalysis28 (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>ptmAnalysis29</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *
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
 *       <A HREF="#getPtmAnalysis29()">
 *           getPtmAnalysis29
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setPtmAnalysis29(java.lang.String)">
 *           setPtmAnalysis29 (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>ptmAnalysis30</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *
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
 *       <A HREF="#getPtmAnalysis30()">
 *           getPtmAnalysis30
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setPtmAnalysis30(java.lang.String)">
 *           setPtmAnalysis30 (String)
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


 * @see PtmPermToMarket
 *
 * @author
 * @version $Revision: $
 *
 * @since $jdk$
 */
public class PtmPermToMarketDMO
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
      FIELD_TYPE_STRING /* std public attribute: ptmBillAcNo  */,
      FIELD_TYPE_STRING /* std public attribute: ptmInd  */,
      FIELD_TYPE_STRING /* std public attribute: ptmTitle  */,
      FIELD_TYPE_STRING /* std public attribute: ptmSurname  */,
      FIELD_TYPE_STRING /* std public attribute: ptmFirstname  */,
      FIELD_TYPE_STRING /* std public attribute: ptmPrefComms  */,
      FIELD_TYPE_INTEGER /* std public attribute: ptmAudId  */,
      FIELD_TYPE_STRING /* std public attribute: ptmAnalysis1  */,
      FIELD_TYPE_STRING /* std public attribute: ptmAnalysis2  */,
      FIELD_TYPE_STRING /* std public attribute: ptmAnalysis3  */,
      FIELD_TYPE_STRING /* std public attribute: ptmAnalysis4  */,
      FIELD_TYPE_STRING /* std public attribute: ptmAnalysis5  */,
      FIELD_TYPE_STRING /* std public attribute: ptmAnalysis6  */,
      FIELD_TYPE_STRING /* std public attribute: ptmAnalysis7  */,
      FIELD_TYPE_STRING /* std public attribute: ptmAnalysis8  */,
      FIELD_TYPE_STRING /* std public attribute: ptmAnalysis9  */,
      FIELD_TYPE_STRING /* std public attribute: ptmAnalysis10  */,
      FIELD_TYPE_STRING /* std public attribute: ptmAnalysis11  */,
      FIELD_TYPE_STRING /* std public attribute: ptmAnalysis12  */,
      FIELD_TYPE_STRING /* std public attribute: ptmAnalysis13  */,
      FIELD_TYPE_STRING /* std public attribute: ptmAnalysis14  */,
      FIELD_TYPE_STRING /* std public attribute: ptmAnalysis15  */,
      FIELD_TYPE_STRING /* std public attribute: ptmAnalysis16  */,
      FIELD_TYPE_STRING /* std public attribute: ptmAnalysis17  */,
      FIELD_TYPE_STRING /* std public attribute: ptmAnalysis18  */,
      FIELD_TYPE_STRING /* std public attribute: ptmAnalysis19  */,
      FIELD_TYPE_STRING /* std public attribute: ptmAnalysis20  */,
      FIELD_TYPE_STRING /* std public attribute: ptmAnalysis21  */,
      FIELD_TYPE_STRING /* std public attribute: ptmAnalysis22  */,
      FIELD_TYPE_STRING /* std public attribute: ptmAnalysis23  */,
      FIELD_TYPE_STRING /* std public attribute: ptmAnalysis24  */,
      FIELD_TYPE_STRING /* std public attribute: ptmAnalysis25  */,
      FIELD_TYPE_STRING /* std public attribute: ptmAnalysis26  */,
      FIELD_TYPE_STRING /* std public attribute: ptmAnalysis27  */,
      FIELD_TYPE_STRING /* std public attribute: ptmAnalysis28  */,
      FIELD_TYPE_STRING /* std public attribute: ptmAnalysis29  */,
      FIELD_TYPE_STRING /* std public attribute: ptmAnalysis30  */
    };
  
  private final int[] fieldSizes = new int[] {
		  ptmBillAcNoSize,
		  ptmIndSize,
		  ptmTitleSize,
		  ptmSurnameSize,
		  ptmFirstnameSize,
		  ptmPrefCommsSize,
		  0,
		  ptmAnalysis1Size,
		  ptmAnalysis2Size,
		  ptmAnalysis3Size,
		  ptmAnalysis4Size,
		  ptmAnalysis5Size,
		  ptmAnalysis6Size,
		  ptmAnalysis7Size,
		  ptmAnalysis8Size,
		  ptmAnalysis9Size,
		  ptmAnalysis10Size,
		  ptmAnalysis11Size,
		  ptmAnalysis12Size,
		  ptmAnalysis13Size,
		  ptmAnalysis14Size,
		  ptmAnalysis15Size,
		  ptmAnalysis16Size,
		  ptmAnalysis17Size,
		  ptmAnalysis18Size,
		  ptmAnalysis19Size,
		  ptmAnalysis20Size,
		  ptmAnalysis21Size,
		  ptmAnalysis22Size,
		  ptmAnalysis23Size,
		  ptmAnalysis24Size,
		  ptmAnalysis25Size,
		  ptmAnalysis26Size,
		  ptmAnalysis27Size,
		  ptmAnalysis28Size,
		  ptmAnalysis29Size,
		  ptmAnalysis30Size
  };
      

  public int[] fieldSizes() {
  	return fieldSizes;
  }  

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int ptmBillAcNoFilter = 0; // filter index
  private static final int ptmBillAcNoSize = 8; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int ptmIndFilter = 1; // filter index
  private static final int ptmIndSize = 1; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int ptmTitleFilter = 2; // filter index
  private static final int ptmTitleSize = 10; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int ptmSurnameFilter = 3; // filter index
  private static final int ptmSurnameSize = 50; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int ptmFirstnameFilter = 4; // filter index
  private static final int ptmFirstnameSize = 50; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int ptmPrefCommsFilter = 5; // filter index
  private static final int ptmPrefCommsSize = 20; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int ptmAudIdFilter = 6; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int ptmAnalysis1Filter = 7; // filter index
  private static final int ptmAnalysis1Size = 30; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int ptmAnalysis2Filter = 8; // filter index
  private static final int ptmAnalysis2Size = 30; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int ptmAnalysis3Filter = 9; // filter index
  private static final int ptmAnalysis3Size = 30; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int ptmAnalysis4Filter = 10; // filter index
  private static final int ptmAnalysis4Size = 30; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int ptmAnalysis5Filter = 11; // filter index
  private static final int ptmAnalysis5Size = 30; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int ptmAnalysis6Filter = 12; // filter index
  private static final int ptmAnalysis6Size = 30; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int ptmAnalysis7Filter = 13; // filter index
  private static final int ptmAnalysis7Size = 30; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int ptmAnalysis8Filter = 14; // filter index
  private static final int ptmAnalysis8Size = 30; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int ptmAnalysis9Filter = 15; // filter index
  private static final int ptmAnalysis9Size = 30; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int ptmAnalysis10Filter = 16; // filter index
  private static final int ptmAnalysis10Size = 30; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int ptmAnalysis11Filter = 17; // filter index
  private static final int ptmAnalysis11Size = 30; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int ptmAnalysis12Filter = 18; // filter index
  private static final int ptmAnalysis12Size = 30; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int ptmAnalysis13Filter = 19; // filter index
  private static final int ptmAnalysis13Size = 30; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int ptmAnalysis14Filter = 20; // filter index
  private static final int ptmAnalysis14Size = 30; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int ptmAnalysis15Filter = 21; // filter index
  private static final int ptmAnalysis15Size = 30; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int ptmAnalysis16Filter = 22; // filter index
  private static final int ptmAnalysis16Size = 30; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int ptmAnalysis17Filter = 23; // filter index
  private static final int ptmAnalysis17Size = 30; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int ptmAnalysis18Filter = 24; // filter index
  private static final int ptmAnalysis18Size = 30; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int ptmAnalysis19Filter = 25; // filter index
  private static final int ptmAnalysis19Size = 30; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int ptmAnalysis20Filter = 26; // filter index
  private static final int ptmAnalysis20Size = 30; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int ptmAnalysis21Filter = 27; // filter index
  private static final int ptmAnalysis21Size = 30; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int ptmAnalysis22Filter = 28; // filter index
  private static final int ptmAnalysis22Size = 30; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int ptmAnalysis23Filter = 29; // filter index
  private static final int ptmAnalysis23Size = 30; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int ptmAnalysis24Filter = 30; // filter index
  private static final int ptmAnalysis24Size = 30; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int ptmAnalysis25Filter = 31; // filter index
  private static final int ptmAnalysis25Size = 30; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int ptmAnalysis26Filter = 32; // filter index
  private static final int ptmAnalysis26Size = 30; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int ptmAnalysis27Filter = 33; // filter index
  private static final int ptmAnalysis27Size = 30; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int ptmAnalysis28Filter = 34; // filter index
  private static final int ptmAnalysis28Size = 30; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int ptmAnalysis29Filter = 35; // filter index
  private static final int ptmAnalysis29Size = 30; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int ptmAnalysis30Filter = 36; // filter index
  private static final int ptmAnalysis30Size = 30; // field size

  //~ Instance variables /////////////////////////////////////////////////////

  private Integer ptmAudId; // Loaded from Schema
  private String ptmAnalysis1; // Loaded from Schema
  private String ptmAnalysis10; // Loaded from Schema
  private String ptmAnalysis11; // Loaded from Schema
  private String ptmAnalysis12; // Loaded from Schema
  private String ptmAnalysis13; // Loaded from Schema
  private String ptmAnalysis14; // Loaded from Schema
  private String ptmAnalysis15; // Loaded from Schema
  private String ptmAnalysis16; // Loaded from Schema
  private String ptmAnalysis17; // Loaded from Schema
  private String ptmAnalysis18; // Loaded from Schema
  private String ptmAnalysis19; // Loaded from Schema
  private String ptmAnalysis2; // Loaded from Schema
  private String ptmAnalysis20; // Loaded from Schema
  private String ptmAnalysis21; // Loaded from Schema
  private String ptmAnalysis22; // Loaded from Schema
  private String ptmAnalysis23; // Loaded from Schema
  private String ptmAnalysis24; // Loaded from Schema
  private String ptmAnalysis25; // Loaded from Schema
  private String ptmAnalysis26; // Loaded from Schema
  private String ptmAnalysis27; // Loaded from Schema
  private String ptmAnalysis28; // Loaded from Schema
  private String ptmAnalysis29; // Loaded from Schema
  private String ptmAnalysis3; // Loaded from Schema
  private String ptmAnalysis30; // Loaded from Schema
  private String ptmAnalysis4; // Loaded from Schema
  private String ptmAnalysis5; // Loaded from Schema
  private String ptmAnalysis6; // Loaded from Schema
  private String ptmAnalysis7; // Loaded from Schema
  private String ptmAnalysis8; // Loaded from Schema
  private String ptmAnalysis9; // Loaded from Schema

  //---------------------
  // Field declarations
  //---------------------
  // all attributes
  private String ptmBillAcNo; // Loaded from Schema
  private String ptmFirstname; // Loaded from Schema
  private String ptmInd; // Loaded from Schema
  private String ptmPrefComms; // Loaded from Schema
  private String ptmSurname; // Loaded from Schema
  private String ptmTitle; // Loaded from Schema

  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new PtmPermToMarketDMO object.
   */
  public PtmPermToMarketDMO(  ) {
  }

  // Constructor - taking public attributes
  /**
   * Creates a new PtmPermToMarketDMO object.
   *
   * @param ptmBillAcNo DOCUMENT ME!
   * @param ptmInd DOCUMENT ME!
   * @param ptmTitle DOCUMENT ME!
   * @param ptmSurname DOCUMENT ME!
   * @param ptmFirstname DOCUMENT ME!
   * @param ptmPrefComms DOCUMENT ME!
   * @param ptmAudId DOCUMENT ME!
   * @param ptmAnalysis1 DOCUMENT ME!
   * @param ptmAnalysis2 DOCUMENT ME!
   * @param ptmAnalysis3 DOCUMENT ME!
   * @param ptmAnalysis4 DOCUMENT ME!
   * @param ptmAnalysis5 DOCUMENT ME!
   * @param ptmAnalysis6 DOCUMENT ME!
   * @param ptmAnalysis7 DOCUMENT ME!
   * @param ptmAnalysis8 DOCUMENT ME!
   * @param ptmAnalysis9 DOCUMENT ME!
   * @param ptmAnalysis10 DOCUMENT ME!
   * @param ptmAnalysis11 DOCUMENT ME!
   * @param ptmAnalysis12 DOCUMENT ME!
   * @param ptmAnalysis13 DOCUMENT ME!
   * @param ptmAnalysis14 DOCUMENT ME!
   * @param ptmAnalysis15 DOCUMENT ME!
   * @param ptmAnalysis16 DOCUMENT ME!
   * @param ptmAnalysis17 DOCUMENT ME!
   * @param ptmAnalysis18 DOCUMENT ME!
   * @param ptmAnalysis19 DOCUMENT ME!
   * @param ptmAnalysis20 DOCUMENT ME!
   * @param ptmAnalysis21 DOCUMENT ME!
   * @param ptmAnalysis22 DOCUMENT ME!
   * @param ptmAnalysis23 DOCUMENT ME!
   * @param ptmAnalysis24 DOCUMENT ME!
   * @param ptmAnalysis25 DOCUMENT ME!
   * @param ptmAnalysis26 DOCUMENT ME!
   * @param ptmAnalysis27 DOCUMENT ME!
   * @param ptmAnalysis28 DOCUMENT ME!
   * @param ptmAnalysis29 DOCUMENT ME!
   * @param ptmAnalysis30 DOCUMENT ME!
   */
  public PtmPermToMarketDMO( 
    final String  ptmBillAcNo,
    final String  ptmInd,
    final String  ptmTitle,
    final String  ptmSurname,
    final String  ptmFirstname,
    final String  ptmPrefComms,
    final Integer ptmAudId,
    final String  ptmAnalysis1,
    final String  ptmAnalysis2,
    final String  ptmAnalysis3,
    final String  ptmAnalysis4,
    final String  ptmAnalysis5,
    final String  ptmAnalysis6,
    final String  ptmAnalysis7,
    final String  ptmAnalysis8,
    final String  ptmAnalysis9,
    final String  ptmAnalysis10,
    final String  ptmAnalysis11,
    final String  ptmAnalysis12,
    final String  ptmAnalysis13,
    final String  ptmAnalysis14,
    final String  ptmAnalysis15,
    final String  ptmAnalysis16,
    final String  ptmAnalysis17,
    final String  ptmAnalysis18,
    final String  ptmAnalysis19,
    final String  ptmAnalysis20,
    final String  ptmAnalysis21,
    final String  ptmAnalysis22,
    final String  ptmAnalysis23,
    final String  ptmAnalysis24,
    final String  ptmAnalysis25,
    final String  ptmAnalysis26,
    final String  ptmAnalysis27,
    final String  ptmAnalysis28,
    final String  ptmAnalysis29,
    final String  ptmAnalysis30 ) {
    this.ptmBillAcNo = ptmBillAcNo;

    this.ptmInd = ptmInd;

    this.ptmTitle = ptmTitle;

    this.ptmSurname = ptmSurname;

    this.ptmFirstname = ptmFirstname;

    this.ptmPrefComms = ptmPrefComms;

    this.ptmAudId = ptmAudId;

    this.ptmAnalysis1 = ptmAnalysis1;

    this.ptmAnalysis2 = ptmAnalysis2;

    this.ptmAnalysis3 = ptmAnalysis3;

    this.ptmAnalysis4 = ptmAnalysis4;

    this.ptmAnalysis5 = ptmAnalysis5;

    this.ptmAnalysis6 = ptmAnalysis6;

    this.ptmAnalysis7 = ptmAnalysis7;

    this.ptmAnalysis8 = ptmAnalysis8;

    this.ptmAnalysis9 = ptmAnalysis9;

    this.ptmAnalysis10 = ptmAnalysis10;

    this.ptmAnalysis11 = ptmAnalysis11;

    this.ptmAnalysis12 = ptmAnalysis12;

    this.ptmAnalysis13 = ptmAnalysis13;

    this.ptmAnalysis14 = ptmAnalysis14;

    this.ptmAnalysis15 = ptmAnalysis15;

    this.ptmAnalysis16 = ptmAnalysis16;

    this.ptmAnalysis17 = ptmAnalysis17;

    this.ptmAnalysis18 = ptmAnalysis18;

    this.ptmAnalysis19 = ptmAnalysis19;

    this.ptmAnalysis20 = ptmAnalysis20;

    this.ptmAnalysis21 = ptmAnalysis21;

    this.ptmAnalysis22 = ptmAnalysis22;

    this.ptmAnalysis23 = ptmAnalysis23;

    this.ptmAnalysis24 = ptmAnalysis24;

    this.ptmAnalysis25 = ptmAnalysis25;

    this.ptmAnalysis26 = ptmAnalysis26;

    this.ptmAnalysis27 = ptmAnalysis27;

    this.ptmAnalysis28 = ptmAnalysis28;

    this.ptmAnalysis29 = ptmAnalysis29;

    this.ptmAnalysis30 = ptmAnalysis30;
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
    return new DAOArgs( 1 ).arg( ( this.ptmBillAcNo == null ) ? null
                                                              : this.ptmBillAcNo
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
      ( ptmBillAcNo == null ) ? null
                              : ( ( ptmBillAcNo.length(  ) <= ptmBillAcNoSize )
      ? ptmBillAcNo
      : ptmBillAcNo.substring( 0, ptmBillAcNoSize ) // auto trimmed to fit, if required.
       ),
      ( ptmInd == null ) ? null
                         : ( ( ptmInd.length(  ) <= ptmIndSize ) ? ptmInd
                                                                 : ptmInd
      .substring( 0, ptmIndSize ) // auto trimmed to fit, if required.
       ),
      ( ptmTitle == null ) ? null
                           : ( ( ptmTitle.length(  ) <= ptmTitleSize )
      ? ptmTitle
      : ptmTitle.substring( 0, ptmTitleSize ) // auto trimmed to fit, if required.
       ),
      ( ptmSurname == null ) ? null
                             : ( ( ptmSurname.length(  ) <= ptmSurnameSize )
      ? ptmSurname
      : ptmSurname.substring( 0, ptmSurnameSize ) // auto trimmed to fit, if required.
       ),
      ( ptmFirstname == null ) ? null
                               : ( ( ptmFirstname.length(  ) <= ptmFirstnameSize )
      ? ptmFirstname
      : ptmFirstname.substring( 0, ptmFirstnameSize ) // auto trimmed to fit, if required.
       ),
      ( ptmPrefComms == null ) ? null
                               : ( ( ptmPrefComms.length(  ) <= ptmPrefCommsSize )
      ? ptmPrefComms
      : ptmPrefComms.substring( 0, ptmPrefCommsSize ) // auto trimmed to fit, if required.
       ), ptmAudId,
      ( ptmAnalysis1 == null ) ? null
                               : ( ( ptmAnalysis1.length(  ) <= ptmAnalysis1Size )
      ? ptmAnalysis1
      : ptmAnalysis1.substring( 0, ptmAnalysis1Size ) // auto trimmed to fit, if required.
       ),
      ( ptmAnalysis2 == null ) ? null
                               : ( ( ptmAnalysis2.length(  ) <= ptmAnalysis2Size )
      ? ptmAnalysis2
      : ptmAnalysis2.substring( 0, ptmAnalysis2Size ) // auto trimmed to fit, if required.
       ),
      ( ptmAnalysis3 == null ) ? null
                               : ( ( ptmAnalysis3.length(  ) <= ptmAnalysis3Size )
      ? ptmAnalysis3
      : ptmAnalysis3.substring( 0, ptmAnalysis3Size ) // auto trimmed to fit, if required.
       ),
      ( ptmAnalysis4 == null ) ? null
                               : ( ( ptmAnalysis4.length(  ) <= ptmAnalysis4Size )
      ? ptmAnalysis4
      : ptmAnalysis4.substring( 0, ptmAnalysis4Size ) // auto trimmed to fit, if required.
       ),
      ( ptmAnalysis5 == null ) ? null
                               : ( ( ptmAnalysis5.length(  ) <= ptmAnalysis5Size )
      ? ptmAnalysis5
      : ptmAnalysis5.substring( 0, ptmAnalysis5Size ) // auto trimmed to fit, if required.
       ),
      ( ptmAnalysis6 == null ) ? null
                               : ( ( ptmAnalysis6.length(  ) <= ptmAnalysis6Size )
      ? ptmAnalysis6
      : ptmAnalysis6.substring( 0, ptmAnalysis6Size ) // auto trimmed to fit, if required.
       ),
      ( ptmAnalysis7 == null ) ? null
                               : ( ( ptmAnalysis7.length(  ) <= ptmAnalysis7Size )
      ? ptmAnalysis7
      : ptmAnalysis7.substring( 0, ptmAnalysis7Size ) // auto trimmed to fit, if required.
       ),
      ( ptmAnalysis8 == null ) ? null
                               : ( ( ptmAnalysis8.length(  ) <= ptmAnalysis8Size )
      ? ptmAnalysis8
      : ptmAnalysis8.substring( 0, ptmAnalysis8Size ) // auto trimmed to fit, if required.
       ),
      ( ptmAnalysis9 == null ) ? null
                               : ( ( ptmAnalysis9.length(  ) <= ptmAnalysis9Size )
      ? ptmAnalysis9
      : ptmAnalysis9.substring( 0, ptmAnalysis9Size ) // auto trimmed to fit, if required.
       ),
      ( ptmAnalysis10 == null ) ? null
                                : ( ( ptmAnalysis10.length(  ) <= ptmAnalysis10Size )
      ? ptmAnalysis10
      : ptmAnalysis10.substring( 0, ptmAnalysis10Size ) // auto trimmed to fit, if required.
       ),
      ( ptmAnalysis11 == null ) ? null
                                : ( ( ptmAnalysis11.length(  ) <= ptmAnalysis11Size )
      ? ptmAnalysis11
      : ptmAnalysis11.substring( 0, ptmAnalysis11Size ) // auto trimmed to fit, if required.
       ),
      ( ptmAnalysis12 == null ) ? null
                                : ( ( ptmAnalysis12.length(  ) <= ptmAnalysis12Size )
      ? ptmAnalysis12
      : ptmAnalysis12.substring( 0, ptmAnalysis12Size ) // auto trimmed to fit, if required.
       ),
      ( ptmAnalysis13 == null ) ? null
                                : ( ( ptmAnalysis13.length(  ) <= ptmAnalysis13Size )
      ? ptmAnalysis13
      : ptmAnalysis13.substring( 0, ptmAnalysis13Size ) // auto trimmed to fit, if required.
       ),
      ( ptmAnalysis14 == null ) ? null
                                : ( ( ptmAnalysis14.length(  ) <= ptmAnalysis14Size )
      ? ptmAnalysis14
      : ptmAnalysis14.substring( 0, ptmAnalysis14Size ) // auto trimmed to fit, if required.
       ),
      ( ptmAnalysis15 == null ) ? null
                                : ( ( ptmAnalysis15.length(  ) <= ptmAnalysis15Size )
      ? ptmAnalysis15
      : ptmAnalysis15.substring( 0, ptmAnalysis15Size ) // auto trimmed to fit, if required.
       ),
      ( ptmAnalysis16 == null ) ? null
                                : ( ( ptmAnalysis16.length(  ) <= ptmAnalysis16Size )
      ? ptmAnalysis16
      : ptmAnalysis16.substring( 0, ptmAnalysis16Size ) // auto trimmed to fit, if required.
       ),
      ( ptmAnalysis17 == null ) ? null
                                : ( ( ptmAnalysis17.length(  ) <= ptmAnalysis17Size )
      ? ptmAnalysis17
      : ptmAnalysis17.substring( 0, ptmAnalysis17Size ) // auto trimmed to fit, if required.
       ),
      ( ptmAnalysis18 == null ) ? null
                                : ( ( ptmAnalysis18.length(  ) <= ptmAnalysis18Size )
      ? ptmAnalysis18
      : ptmAnalysis18.substring( 0, ptmAnalysis18Size ) // auto trimmed to fit, if required.
       ),
      ( ptmAnalysis19 == null ) ? null
                                : ( ( ptmAnalysis19.length(  ) <= ptmAnalysis19Size )
      ? ptmAnalysis19
      : ptmAnalysis19.substring( 0, ptmAnalysis19Size ) // auto trimmed to fit, if required.
       ),
      ( ptmAnalysis20 == null ) ? null
                                : ( ( ptmAnalysis20.length(  ) <= ptmAnalysis20Size )
      ? ptmAnalysis20
      : ptmAnalysis20.substring( 0, ptmAnalysis20Size ) // auto trimmed to fit, if required.
       ),
      ( ptmAnalysis21 == null ) ? null
                                : ( ( ptmAnalysis21.length(  ) <= ptmAnalysis21Size )
      ? ptmAnalysis21
      : ptmAnalysis21.substring( 0, ptmAnalysis21Size ) // auto trimmed to fit, if required.
       ),
      ( ptmAnalysis22 == null ) ? null
                                : ( ( ptmAnalysis22.length(  ) <= ptmAnalysis22Size )
      ? ptmAnalysis22
      : ptmAnalysis22.substring( 0, ptmAnalysis22Size ) // auto trimmed to fit, if required.
       ),
      ( ptmAnalysis23 == null ) ? null
                                : ( ( ptmAnalysis23.length(  ) <= ptmAnalysis23Size )
      ? ptmAnalysis23
      : ptmAnalysis23.substring( 0, ptmAnalysis23Size ) // auto trimmed to fit, if required.
       ),
      ( ptmAnalysis24 == null ) ? null
                                : ( ( ptmAnalysis24.length(  ) <= ptmAnalysis24Size )
      ? ptmAnalysis24
      : ptmAnalysis24.substring( 0, ptmAnalysis24Size ) // auto trimmed to fit, if required.
       ),
      ( ptmAnalysis25 == null ) ? null
                                : ( ( ptmAnalysis25.length(  ) <= ptmAnalysis25Size )
      ? ptmAnalysis25
      : ptmAnalysis25.substring( 0, ptmAnalysis25Size ) // auto trimmed to fit, if required.
       ),
      ( ptmAnalysis26 == null ) ? null
                                : ( ( ptmAnalysis26.length(  ) <= ptmAnalysis26Size )
      ? ptmAnalysis26
      : ptmAnalysis26.substring( 0, ptmAnalysis26Size ) // auto trimmed to fit, if required.
       ),
      ( ptmAnalysis27 == null ) ? null
                                : ( ( ptmAnalysis27.length(  ) <= ptmAnalysis27Size )
      ? ptmAnalysis27
      : ptmAnalysis27.substring( 0, ptmAnalysis27Size ) // auto trimmed to fit, if required.
       ),
      ( ptmAnalysis28 == null ) ? null
                                : ( ( ptmAnalysis28.length(  ) <= ptmAnalysis28Size )
      ? ptmAnalysis28
      : ptmAnalysis28.substring( 0, ptmAnalysis28Size ) // auto trimmed to fit, if required.
       ),
      ( ptmAnalysis29 == null ) ? null
                                : ( ( ptmAnalysis29.length(  ) <= ptmAnalysis29Size )
      ? ptmAnalysis29
      : ptmAnalysis29.substring( 0, ptmAnalysis29Size ) // auto trimmed to fit, if required.
       ),
      ( ptmAnalysis30 == null ) ? null
                                : ( ( ptmAnalysis30.length(  ) <= ptmAnalysis30Size )
      ? ptmAnalysis30
      : ptmAnalysis30.substring( 0, ptmAnalysis30Size ) // auto trimmed to fit, if required.
       )
    };
  }

  /**
   * DOCUMENT ME!
   *
   * @param fields DOCUMENT ME!
   */
  protected void set( final Object[] fields ) {
    ptmBillAcNo = rtrim( (String) fields[0] );
    ptmInd = rtrim( (String) fields[1] );
    ptmTitle = rtrim( (String) fields[2] );
    ptmSurname = rtrim( (String) fields[3] );
    ptmFirstname = rtrim( (String) fields[4] );
    ptmPrefComms = rtrim( (String) fields[5] );
    ptmAudId = (Integer) fields[6];
    ptmAnalysis1 = rtrim( (String) fields[7] );
    ptmAnalysis2 = rtrim( (String) fields[8] );
    ptmAnalysis3 = rtrim( (String) fields[9] );
    ptmAnalysis4 = rtrim( (String) fields[10] );
    ptmAnalysis5 = rtrim( (String) fields[11] );
    ptmAnalysis6 = rtrim( (String) fields[12] );
    ptmAnalysis7 = rtrim( (String) fields[13] );
    ptmAnalysis8 = rtrim( (String) fields[14] );
    ptmAnalysis9 = rtrim( (String) fields[15] );
    ptmAnalysis10 = rtrim( (String) fields[16] );
    ptmAnalysis11 = rtrim( (String) fields[17] );
    ptmAnalysis12 = rtrim( (String) fields[18] );
    ptmAnalysis13 = rtrim( (String) fields[19] );
    ptmAnalysis14 = rtrim( (String) fields[20] );
    ptmAnalysis15 = rtrim( (String) fields[21] );
    ptmAnalysis16 = rtrim( (String) fields[22] );
    ptmAnalysis17 = rtrim( (String) fields[23] );
    ptmAnalysis18 = rtrim( (String) fields[24] );
    ptmAnalysis19 = rtrim( (String) fields[25] );
    ptmAnalysis20 = rtrim( (String) fields[26] );
    ptmAnalysis21 = rtrim( (String) fields[27] );
    ptmAnalysis22 = rtrim( (String) fields[28] );
    ptmAnalysis23 = rtrim( (String) fields[29] );
    ptmAnalysis24 = rtrim( (String) fields[30] );
    ptmAnalysis25 = rtrim( (String) fields[31] );
    ptmAnalysis26 = rtrim( (String) fields[32] );
    ptmAnalysis27 = rtrim( (String) fields[33] );
    ptmAnalysis28 = rtrim( (String) fields[34] );
    ptmAnalysis29 = rtrim( (String) fields[35] );
    ptmAnalysis30 = rtrim( (String) fields[36] );
  }

  // Get methods ///////////////////////////////////////////////////////////////
  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getPtmBillAcNo(  ) {
    return ptmBillAcNo;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getPtmInd(  ) {
    return ptmInd;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getPtmTitle(  ) {
    return ptmTitle;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getPtmSurname(  ) {
    return ptmSurname;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getPtmFirstname(  ) {
    return ptmFirstname;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getPtmPrefComms(  ) {
    return ptmPrefComms;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public Integer getPtmAudId(  ) {
    return ptmAudId;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getPtmAnalysis1(  ) {
    return ptmAnalysis1;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getPtmAnalysis2(  ) {
    return ptmAnalysis2;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getPtmAnalysis3(  ) {
    return ptmAnalysis3;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getPtmAnalysis4(  ) {
    return ptmAnalysis4;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getPtmAnalysis5(  ) {
    return ptmAnalysis5;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getPtmAnalysis6(  ) {
    return ptmAnalysis6;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getPtmAnalysis7(  ) {
    return ptmAnalysis7;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getPtmAnalysis8(  ) {
    return ptmAnalysis8;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getPtmAnalysis9(  ) {
    return ptmAnalysis9;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getPtmAnalysis10(  ) {
    return ptmAnalysis10;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getPtmAnalysis11(  ) {
    return ptmAnalysis11;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getPtmAnalysis12(  ) {
    return ptmAnalysis12;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getPtmAnalysis13(  ) {
    return ptmAnalysis13;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getPtmAnalysis14(  ) {
    return ptmAnalysis14;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getPtmAnalysis15(  ) {
    return ptmAnalysis15;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getPtmAnalysis16(  ) {
    return ptmAnalysis16;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getPtmAnalysis17(  ) {
    return ptmAnalysis17;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getPtmAnalysis18(  ) {
    return ptmAnalysis18;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getPtmAnalysis19(  ) {
    return ptmAnalysis19;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getPtmAnalysis20(  ) {
    return ptmAnalysis20;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getPtmAnalysis21(  ) {
    return ptmAnalysis21;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getPtmAnalysis22(  ) {
    return ptmAnalysis22;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getPtmAnalysis23(  ) {
    return ptmAnalysis23;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getPtmAnalysis24(  ) {
    return ptmAnalysis24;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getPtmAnalysis25(  ) {
    return ptmAnalysis25;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getPtmAnalysis26(  ) {
    return ptmAnalysis26;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getPtmAnalysis27(  ) {
    return ptmAnalysis27;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getPtmAnalysis28(  ) {
    return ptmAnalysis28;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getPtmAnalysis29(  ) {
    return ptmAnalysis29;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getPtmAnalysis30(  ) {
    return ptmAnalysis30;
  }

  // Setter methods ///////////////////////////////////////////////////////////////

  //
  // Master setter follows...
  //

  /**
   * Setter that takes all attributes
   */
  public void set( 
    final String  ptmBillAcNo,
    final String  ptmInd,
    final String  ptmTitle,
    final String  ptmSurname,
    final String  ptmFirstname,
    final String  ptmPrefComms,
    final Integer ptmAudId,
    final String  ptmAnalysis1,
    final String  ptmAnalysis2,
    final String  ptmAnalysis3,
    final String  ptmAnalysis4,
    final String  ptmAnalysis5,
    final String  ptmAnalysis6,
    final String  ptmAnalysis7,
    final String  ptmAnalysis8,
    final String  ptmAnalysis9,
    final String  ptmAnalysis10,
    final String  ptmAnalysis11,
    final String  ptmAnalysis12,
    final String  ptmAnalysis13,
    final String  ptmAnalysis14,
    final String  ptmAnalysis15,
    final String  ptmAnalysis16,
    final String  ptmAnalysis17,
    final String  ptmAnalysis18,
    final String  ptmAnalysis19,
    final String  ptmAnalysis20,
    final String  ptmAnalysis21,
    final String  ptmAnalysis22,
    final String  ptmAnalysis23,
    final String  ptmAnalysis24,
    final String  ptmAnalysis25,
    final String  ptmAnalysis26,
    final String  ptmAnalysis27,
    final String  ptmAnalysis28,
    final String  ptmAnalysis29,
    final String  ptmAnalysis30 ) {
    this.ptmBillAcNo = ptmBillAcNo;
    this.ptmInd = ptmInd;
    this.ptmTitle = ptmTitle;
    this.ptmSurname = ptmSurname;
    this.ptmFirstname = ptmFirstname;
    this.ptmPrefComms = ptmPrefComms;
    this.ptmAudId = ptmAudId;
    this.ptmAnalysis1 = ptmAnalysis1;
    this.ptmAnalysis2 = ptmAnalysis2;
    this.ptmAnalysis3 = ptmAnalysis3;
    this.ptmAnalysis4 = ptmAnalysis4;
    this.ptmAnalysis5 = ptmAnalysis5;
    this.ptmAnalysis6 = ptmAnalysis6;
    this.ptmAnalysis7 = ptmAnalysis7;
    this.ptmAnalysis8 = ptmAnalysis8;
    this.ptmAnalysis9 = ptmAnalysis9;
    this.ptmAnalysis10 = ptmAnalysis10;
    this.ptmAnalysis11 = ptmAnalysis11;
    this.ptmAnalysis12 = ptmAnalysis12;
    this.ptmAnalysis13 = ptmAnalysis13;
    this.ptmAnalysis14 = ptmAnalysis14;
    this.ptmAnalysis15 = ptmAnalysis15;
    this.ptmAnalysis16 = ptmAnalysis16;
    this.ptmAnalysis17 = ptmAnalysis17;
    this.ptmAnalysis18 = ptmAnalysis18;
    this.ptmAnalysis19 = ptmAnalysis19;
    this.ptmAnalysis20 = ptmAnalysis20;
    this.ptmAnalysis21 = ptmAnalysis21;
    this.ptmAnalysis22 = ptmAnalysis22;
    this.ptmAnalysis23 = ptmAnalysis23;
    this.ptmAnalysis24 = ptmAnalysis24;
    this.ptmAnalysis25 = ptmAnalysis25;
    this.ptmAnalysis26 = ptmAnalysis26;
    this.ptmAnalysis27 = ptmAnalysis27;
    this.ptmAnalysis28 = ptmAnalysis28;
    this.ptmAnalysis29 = ptmAnalysis29;
    this.ptmAnalysis30 = ptmAnalysis30;
  }

  //
  // Public access modifiers if any
  // (provided for attributes that are public in the analysis model)
  //    

  /**
  * Sets the PtmBillAcNo field.
  *
  * @param ptmBillAcNo
  */
  public void setPtmBillAcNo( final String ptmBillAcNo ) {
    this.ptmBillAcNo = getPadded(ptmBillAcNo, ptmBillAcNoFilter);
  }

  /**
  * Sets the PtmInd field.
  *
  * @param ptmInd
  */
  public void setPtmInd( final String ptmInd ) {
    this.ptmInd = getPadded(ptmInd, ptmIndFilter);
  }

  /**
  * Sets the PtmTitle field.
  *
  * @param ptmTitle
  */
  public void setPtmTitle( final String ptmTitle ) {
    this.ptmTitle = getPadded(ptmTitle, ptmTitleFilter);
  }

  /**
  * Sets the PtmSurname field.
  *
  * @param ptmSurname
  */
  public void setPtmSurname( final String ptmSurname ) {
    this.ptmSurname = getPadded(ptmSurname, ptmSurnameFilter);
  }

  /**
  * Sets the PtmFirstname field.
  *
  * @param ptmFirstname
  */
  public void setPtmFirstname( final String ptmFirstname ) {
    this.ptmFirstname = getPadded(ptmFirstname, ptmFirstnameFilter);
  }

  /**
  * Sets the PtmPrefComms field.
  *
  * @param ptmPrefComms
  */
  public void setPtmPrefComms( final String ptmPrefComms ) {
    this.ptmPrefComms = getPadded(ptmPrefComms, ptmPrefCommsFilter);
  }

  /**
  * Sets the PtmAudId field.
  *
  * @param ptmAudId
  */
  public void setPtmAudId( final Integer ptmAudId ) {
    this.ptmAudId = ptmAudId;
  }

  /**
  * Sets the PtmAnalysis1 field.
  *
  * @param ptmAnalysis1
  */
  public void setPtmAnalysis1( final String ptmAnalysis1 ) {
    this.ptmAnalysis1 = getPadded(ptmAnalysis1, ptmAnalysis10Filter);
  }

  /**
  * Sets the PtmAnalysis2 field.
  *
  * @param ptmAnalysis2
  */
  public void setPtmAnalysis2( final String ptmAnalysis2 ) {
    this.ptmAnalysis2 = getPadded(ptmAnalysis2, ptmAnalysis20Filter);
  }

  /**
  * Sets the PtmAnalysis3 field.
  *
  * @param ptmAnalysis3
  */
  public void setPtmAnalysis3( final String ptmAnalysis3 ) {
    this.ptmAnalysis3 = getPadded(ptmAnalysis3, ptmAnalysis30Filter);
  }

  /**
  * Sets the PtmAnalysis4 field.
  *
  * @param ptmAnalysis4
  */
  public void setPtmAnalysis4( final String ptmAnalysis4 ) {
    this.ptmAnalysis4 = getPadded(ptmAnalysis4, ptmAnalysis4Filter);
  }

  /**
  * Sets the PtmAnalysis5 field.
  *
  * @param ptmAnalysis5
  */
  public void setPtmAnalysis5( final String ptmAnalysis5 ) {
    this.ptmAnalysis5 = getPadded(ptmAnalysis5, ptmAnalysis5Filter);
  }

  /**
  * Sets the PtmAnalysis6 field.
  *
  * @param ptmAnalysis6
  */
  public void setPtmAnalysis6( final String ptmAnalysis6 ) {
    this.ptmAnalysis6 = getPadded(ptmAnalysis6, ptmAnalysis6Filter);
  }

  /**
  * Sets the PtmAnalysis7 field.
  *
  * @param ptmAnalysis7
  */
  public void setPtmAnalysis7( final String ptmAnalysis7 ) {
    this.ptmAnalysis7 = getPadded(ptmAnalysis7, ptmAnalysis7Filter);
  }

  /**
  * Sets the PtmAnalysis8 field.
  *
  * @param ptmAnalysis8
  */
  public void setPtmAnalysis8( final String ptmAnalysis8 ) {
    this.ptmAnalysis8 = getPadded(ptmAnalysis8, ptmAnalysis8Filter);
  }

  /**
  * Sets the PtmAnalysis9 field.
  *
  * @param ptmAnalysis9
  */
  public void setPtmAnalysis9( final String ptmAnalysis9 ) {
    this.ptmAnalysis9 = getPadded(ptmAnalysis9, ptmAnalysis9Filter);
  }

  /**
  * Sets the PtmAnalysis10 field.
  *
  * @param ptmAnalysis10
  */
  public void setPtmAnalysis10( final String ptmAnalysis10 ) {
    this.ptmAnalysis10 = getPadded(ptmAnalysis10, ptmAnalysis10Filter);
  }

  /**
  * Sets the PtmAnalysis11 field.
  *
  * @param ptmAnalysis11
  */
  public void setPtmAnalysis11( final String ptmAnalysis11 ) {
    this.ptmAnalysis11 = getPadded(ptmAnalysis11, ptmAnalysis11Filter);
  }

  /**
  * Sets the PtmAnalysis12 field.
  *
  * @param ptmAnalysis12
  */
  public void setPtmAnalysis12( final String ptmAnalysis12 ) {
    this.ptmAnalysis12 = getPadded(ptmAnalysis12, ptmAnalysis12Filter);
  }

  /**
  * Sets the PtmAnalysis13 field.
  *
  * @param ptmAnalysis13
  */
  public void setPtmAnalysis13( final String ptmAnalysis13 ) {
    this.ptmAnalysis13 = getPadded(ptmAnalysis13, ptmAnalysis13Filter);
  }

  /**
  * Sets the PtmAnalysis14 field.
  *
  * @param ptmAnalysis14
  */
  public void setPtmAnalysis14( final String ptmAnalysis14 ) {
    this.ptmAnalysis14 = getPadded(ptmAnalysis14, ptmAnalysis14Filter);
  }

  /**
  * Sets the PtmAnalysis15 field.
  *
  * @param ptmAnalysis15
  */
  public void setPtmAnalysis15( final String ptmAnalysis15 ) {
    this.ptmAnalysis15 = getPadded(ptmAnalysis15, ptmAnalysis15Filter);
  }

  /**
  * Sets the PtmAnalysis16 field.
  *
  * @param ptmAnalysis16
  */
  public void setPtmAnalysis16( final String ptmAnalysis16 ) {
    this.ptmAnalysis16 = getPadded(ptmAnalysis16, ptmAnalysis16Filter);
  }

  /**
  * Sets the PtmAnalysis17 field.
  *
  * @param ptmAnalysis17
  */
  public void setPtmAnalysis17( final String ptmAnalysis17 ) {
    this.ptmAnalysis17 = getPadded(ptmAnalysis17, ptmAnalysis17Filter);
  }

  /**
  * Sets the PtmAnalysis18 field.
  *
  * @param ptmAnalysis18
  */
  public void setPtmAnalysis18( final String ptmAnalysis18 ) {
    this.ptmAnalysis18 = getPadded(ptmAnalysis18, ptmAnalysis18Filter);
  }

  /**
  * Sets the PtmAnalysis19 field.
  *
  * @param ptmAnalysis19
  */
  public void setPtmAnalysis19( final String ptmAnalysis19 ) {
    this.ptmAnalysis19 = getPadded(ptmAnalysis19, ptmAnalysis19Filter);
  }

  /**
  * Sets the PtmAnalysis20 field.
  *
  * @param ptmAnalysis20
  */
  public void setPtmAnalysis20( final String ptmAnalysis20 ) {
    this.ptmAnalysis20 = getPadded(ptmAnalysis20, ptmAnalysis20Filter);
  }

  /**
  * Sets the PtmAnalysis21 field.
  *
  * @param ptmAnalysis21
  */
  public void setPtmAnalysis21( final String ptmAnalysis21 ) {
    this.ptmAnalysis21 = getPadded(ptmAnalysis21, ptmAnalysis21Filter);
  }

  /**
  * Sets the PtmAnalysis22 field.
  *
  * @param ptmAnalysis22
  */
  public void setPtmAnalysis22( final String ptmAnalysis22 ) {
    this.ptmAnalysis22 = getPadded(ptmAnalysis22, ptmAnalysis22Filter);
  }

  /**
  * Sets the PtmAnalysis23 field.
  *
  * @param ptmAnalysis23
  */
  public void setPtmAnalysis23( final String ptmAnalysis23 ) {
    this.ptmAnalysis23 = getPadded(ptmAnalysis23, ptmAnalysis23Filter);
  }

  /**
  * Sets the PtmAnalysis24 field.
  *
  * @param ptmAnalysis24
  */
  public void setPtmAnalysis24( final String ptmAnalysis24 ) {
    this.ptmAnalysis24 = getPadded(ptmAnalysis24, ptmAnalysis24Filter);
  }

  /**
  * Sets the PtmAnalysis25 field.
  *
  * @param ptmAnalysis25
  */
  public void setPtmAnalysis25( final String ptmAnalysis25 ) {
    this.ptmAnalysis25 = getPadded(ptmAnalysis25, ptmAnalysis25Filter);
  }

  /**
  * Sets the PtmAnalysis26 field.
  *
  * @param ptmAnalysis26
  */
  public void setPtmAnalysis26( final String ptmAnalysis26 ) {
    this.ptmAnalysis26 = getPadded(ptmAnalysis26, ptmAnalysis26Filter);
  }

  /**
  * Sets the PtmAnalysis27 field.
  *
  * @param ptmAnalysis27
  */
  public void setPtmAnalysis27( final String ptmAnalysis27 ) {
    this.ptmAnalysis27 = getPadded(ptmAnalysis27, ptmAnalysis27Filter);
  }

  /**
  * Sets the PtmAnalysis28 field.
  *
  * @param ptmAnalysis28
  */
  public void setPtmAnalysis28( final String ptmAnalysis28 ) {
    this.ptmAnalysis28 = getPadded(ptmAnalysis28, ptmAnalysis28Filter);
  }

  /**
  * Sets the PtmAnalysis29 field.
  *
  * @param ptmAnalysis29
  */
  public void setPtmAnalysis29( final String ptmAnalysis29 ) {
    this.ptmAnalysis29 = getPadded(ptmAnalysis29, ptmAnalysis29Filter);
  }

  /**
  * Sets the PtmAnalysis30 field.
  *
  * @param ptmAnalysis30
  */
  public void setPtmAnalysis30( final String ptmAnalysis30 ) {
    this.ptmAnalysis30 = getPadded(ptmAnalysis30, ptmAnalysis30Filter);
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
