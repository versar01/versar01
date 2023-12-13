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
 * A value object to carry the data for a BtcBatchControl.
 *
 *
 * <H3> A BtcBatchControl is: </H3>
 *
 * <!-- indent text -->
 * <TABLE BORDER="0" CELLPADDING="0" CELLSPACING="0">
 * <TR>
 * <TD WIDTH="25">&nbsp;</TD>
 * <TD>
 *
 * This table will be used to :-
 define allowable batch runs (including program name) and hence provide definitive lookups for the VB batch routine front ends.
 * <p>
 *   
 hold parameters for the required batch run module. Instead of passing these parameters with the program name, the
 *   batch routine will read this table as one of the first things it does. This allows us to have one generic function ( in
 *   the maintenance server ) to initiate batch runs. 
 hold status information for each batch run, including run status and
 *   start time.
 When a batch process ends the status is reset to IDLE
 * </p>
 *
 * <!-- end indent text -->
 * </TD>
 * </TR>
 * </TABLE>
 *
 *
 * <H3> BtcBatchControl Value Object: </H3>
 *
 * <!-- indent text -->
 * <TABLE BORDER="0" CELLPADDING="0" CELLSPACING="0">
 * <TR>
 * <TD WIDTH="25">&nbsp;</TD>
 * <TD>
 *
 * <P>
 *     This is a value object (called a Data Model Object or 'DMO').
 *     It is used to pass the data for a btcBatchControl into and out of the BASE module.
 *     Because it's purpose is to carry data into and out of the module it is visible outside the module.
 * </P>
 * <P>
 *     This value object carries the data for one btcBatchControl. A btcBatchControl is:
 * This table will be used to :-
 define allowable batch runs (including program name) and hence provide definitive lookups for the VB batch routine front ends.
 * </P>
 * <P>
 *     It corresponds to the business logic object BtcBatchControl which
 *     contains all the business behaviour of a btcBatchControl but is not visible outside the
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
 *    This value object contains fields for all the details of a btcBatchControl, namely:
 * </P>
 *


 * <P>
 *    <U>Fields to carry the Attributes of a btcBatchControl:</U>
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
 *   <TD ALIGN="left" VALIGN="top"><B>btcBatchType</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Which batch process is to be run:\"UD\" = Usage discount\"DIRECTDEBIT\" = Direct Debit
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
 *       <A HREF="#getBtcBatchType()">
 *           getBtcBatchType
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setBtcBatchType(java.lang.String)">
 *           setBtcBatchType (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>btcBatchId</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       There may be several jobs defined for the same batch_type.
 *       <p>
 *         The batch id differentiates between them.
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
 *       <A HREF="#getBtcBatchId()">
 *           getBtcBatchId
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setBtcBatchId(java.lang.String)">
 *           setBtcBatchId (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>btcDescription</B></TD>
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
 *       <A HREF="#getBtcDescription()">
 *           getBtcDescription
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setBtcDescription(java.lang.String)">
 *           setBtcDescription (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>btcBatchRunNum</B></TD>
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
 *       <A HREF="#getBtcBatchRunNum()">
 *           getBtcBatchRunNum
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setBtcBatchRunNum(java.lang.Integer)">
 *           setBtcBatchRunNum (Integer)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>btcStartTime</B></TD>
 *   <TD ALIGN="left" VALIGN="top">DateTime</TD>
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
 *       <A HREF="#getBtcStartTime()">
 *           getBtcStartTime
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setBtcStartTime(com.cmgwds.eppix.util.DateTime)">
 *           setBtcStartTime (DateTime)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>btcBatchProgram</B></TD>
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
 *       <A HREF="#getBtcBatchProgram()">
 *           getBtcBatchProgram
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setBtcBatchProgram(java.lang.String)">
 *           setBtcBatchProgram (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>btcParameter1</B></TD>
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
 *       <A HREF="#getBtcParameter1()">
 *           getBtcParameter1
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setBtcParameter1(java.lang.String)">
 *           setBtcParameter1 (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>btcParameter2</B></TD>
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
 *       <A HREF="#getBtcParameter2()">
 *           getBtcParameter2
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setBtcParameter2(java.lang.String)">
 *           setBtcParameter2 (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>btcParameter3</B></TD>
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
 *       <A HREF="#getBtcParameter3()">
 *           getBtcParameter3
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setBtcParameter3(java.lang.String)">
 *           setBtcParameter3 (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>btcParameter4</B></TD>
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
 *       <A HREF="#getBtcParameter4()">
 *           getBtcParameter4
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setBtcParameter4(java.lang.String)">
 *           setBtcParameter4 (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>btcParameter5</B></TD>
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
 *       <A HREF="#getBtcParameter5()">
 *           getBtcParameter5
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setBtcParameter5(java.lang.String)">
 *           setBtcParameter5 (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>btcParameter6</B></TD>
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
 *       <A HREF="#getBtcParameter6()">
 *           getBtcParameter6
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setBtcParameter6(java.lang.String)">
 *           setBtcParameter6 (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>btcParameter7</B></TD>
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
 *       <A HREF="#getBtcParameter7()">
 *           getBtcParameter7
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setBtcParameter7(java.lang.String)">
 *           setBtcParameter7 (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>btcParameter8</B></TD>
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
 *       <A HREF="#getBtcParameter8()">
 *           getBtcParameter8
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setBtcParameter8(java.lang.String)">
 *           setBtcParameter8 (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>btcParameter9</B></TD>
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
 *       <A HREF="#getBtcParameter9()">
 *           getBtcParameter9
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setBtcParameter9(java.lang.String)">
 *           setBtcParameter9 (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>btcParameter10</B></TD>
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
 *       <A HREF="#getBtcParameter10()">
 *           getBtcParameter10
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setBtcParameter10(java.lang.String)">
 *           setBtcParameter10 (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>btcParameter11</B></TD>
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
 *       <A HREF="#getBtcParameter11()">
 *           getBtcParameter11
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setBtcParameter11(java.lang.String)">
 *           setBtcParameter11 (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>btcParameter12</B></TD>
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
 *       <A HREF="#getBtcParameter12()">
 *           getBtcParameter12
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setBtcParameter12(java.lang.String)">
 *           setBtcParameter12 (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>btcParameter13</B></TD>
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
 *       <A HREF="#getBtcParameter13()">
 *           getBtcParameter13
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setBtcParameter13(java.lang.String)">
 *           setBtcParameter13 (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>btcParameter14</B></TD>
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
 *       <A HREF="#getBtcParameter14()">
 *           getBtcParameter14
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setBtcParameter14(java.lang.String)">
 *           setBtcParameter14 (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>btcParameter15</B></TD>
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
 *       <A HREF="#getBtcParameter15()">
 *           getBtcParameter15
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setBtcParameter15(java.lang.String)">
 *           setBtcParameter15 (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>btcProcessId</B></TD>
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
 *       <A HREF="#getBtcProcessId()">
 *           getBtcProcessId
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setBtcProcessId(java.lang.Integer)">
 *           setBtcProcessId (Integer)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>btcLocationId</B></TD>
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
 *       <A HREF="#getBtcLocationId()">
 *           getBtcLocationId
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setBtcLocationId(java.lang.Integer)">
 *           setBtcLocationId (Integer)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>btcBatchRunStat</B></TD>
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
 *       <A HREF="#getBtcBatchRunStat()">
 *           getBtcBatchRunStat
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setBtcBatchRunStat(java.lang.String)">
 *           setBtcBatchRunStat (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>btcBatchRunType</B></TD>
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
 *       <A HREF="#getBtcBatchRunType()">
 *           getBtcBatchRunType
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setBtcBatchRunType(java.lang.String)">
 *           setBtcBatchRunType (String)
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


 * @see BtcBatchControl
 *
 * @author
 * @version $Revision: $
 *
 * @since $jdk$
 */
public class BtcBatchControlDMO
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
      FIELD_TYPE_STRING /* std public attribute: btcBatchType  */,
      FIELD_TYPE_STRING /* std public attribute: btcBatchId  */,
      FIELD_TYPE_STRING /* std public attribute: btcDescription  */,
      FIELD_TYPE_INTEGER /* std public attribute: btcBatchRunNum  */,
      FIELD_TYPE_DATETIME /* std public attribute: btcStartTime  */,
      FIELD_TYPE_STRING /* std public attribute: btcBatchProgram  */,
      FIELD_TYPE_STRING /* std public attribute: btcParameter1  */,
      FIELD_TYPE_STRING /* std public attribute: btcParameter2  */,
      FIELD_TYPE_STRING /* std public attribute: btcParameter3  */,
      FIELD_TYPE_STRING /* std public attribute: btcParameter4  */,
      FIELD_TYPE_STRING /* std public attribute: btcParameter5  */,
      FIELD_TYPE_STRING /* std public attribute: btcParameter6  */,
      FIELD_TYPE_STRING /* std public attribute: btcParameter7  */,
      FIELD_TYPE_STRING /* std public attribute: btcParameter8  */,
      FIELD_TYPE_STRING /* std public attribute: btcParameter9  */,
      FIELD_TYPE_STRING /* std public attribute: btcParameter10  */,
      FIELD_TYPE_STRING /* std public attribute: btcParameter11  */,
      FIELD_TYPE_STRING /* std public attribute: btcParameter12  */,
      FIELD_TYPE_STRING /* std public attribute: btcParameter13  */,
      FIELD_TYPE_STRING /* std public attribute: btcParameter14  */,
      FIELD_TYPE_STRING /* std public attribute: btcParameter15  */,
      FIELD_TYPE_INTEGER /* std public attribute: btcProcessId  */,
      FIELD_TYPE_INTEGER /* std public attribute: btcLocationId  */,
      FIELD_TYPE_STRING /* std public attribute: btcBatchRunStat  */,
      FIELD_TYPE_STRING /* std public attribute: btcBatchRunType  */
    };

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int btcBatchTypeFilter = 0; // filter index
  private static final int btcBatchTypeSize = 15; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int btcBatchIdFilter = 1; // filter index
  private static final int btcBatchIdSize = 10; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int btcDescriptionFilter = 2; // filter index
  private static final int btcDescriptionSize = 60; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int btcBatchRunNumFilter = 3; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int btcStartTimeFilter = 4; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int btcBatchProgramFilter = 5; // filter index
  private static final int btcBatchProgramSize = 20; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int btcParameter1Filter = 6; // filter index
  private static final int btcParameter1Size = 15; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int btcParameter2Filter = 7; // filter index
  private static final int btcParameter2Size = 15; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int btcParameter3Filter = 8; // filter index
  private static final int btcParameter3Size = 15; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int btcParameter4Filter = 9; // filter index
  private static final int btcParameter4Size = 15; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int btcParameter5Filter = 10; // filter index
  private static final int btcParameter5Size = 15; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int btcParameter6Filter = 11; // filter index
  private static final int btcParameter6Size = 15; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int btcParameter7Filter = 12; // filter index
  private static final int btcParameter7Size = 15; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int btcParameter8Filter = 13; // filter index
  private static final int btcParameter8Size = 15; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int btcParameter9Filter = 14; // filter index
  private static final int btcParameter9Size = 15; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int btcParameter10Filter = 15; // filter index
  private static final int btcParameter10Size = 15; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int btcParameter11Filter = 16; // filter index
  private static final int btcParameter11Size = 15; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int btcParameter12Filter = 17; // filter index
  private static final int btcParameter12Size = 15; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int btcParameter13Filter = 18; // filter index
  private static final int btcParameter13Size = 15; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int btcParameter14Filter = 19; // filter index
  private static final int btcParameter14Size = 15; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int btcParameter15Filter = 20; // filter index
  private static final int btcParameter15Size = 15; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int btcProcessIdFilter = 21; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int btcLocationIdFilter = 22; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int btcBatchRunStatFilter = 23; // filter index
  private static final int btcBatchRunStatSize = 15; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int btcBatchRunTypeFilter = 24; // filter index
  private static final int btcBatchRunTypeSize = 10; // field size

  //~ Instance variables /////////////////////////////////////////////////////

  private DateTime btcStartTime; // Loaded from Schema
  private Integer btcBatchRunNum; // Loaded from Schema
  private Integer btcLocationId; // Loaded from Schema
  private Integer btcProcessId; // Loaded from Schema
  private String btcBatchId; // Loaded from Schema
  private String btcBatchProgram; // Loaded from Schema
  private String btcBatchRunStat; // Loaded from Schema
  private String btcBatchRunType; // Loaded from Schema

  //---------------------
  // Field declarations
  //---------------------
  // all attributes
  private String btcBatchType; // Loaded from Schema
  private String btcDescription; // Loaded from Schema
  private String btcParameter1; // Loaded from Schema
  private String btcParameter10; // Loaded from Schema
  private String btcParameter11; // Loaded from Schema
  private String btcParameter12; // Loaded from Schema
  private String btcParameter13; // Loaded from Schema
  private String btcParameter14; // Loaded from Schema
  private String btcParameter15; // Loaded from Schema
  private String btcParameter2; // Loaded from Schema
  private String btcParameter3; // Loaded from Schema
  private String btcParameter4; // Loaded from Schema
  private String btcParameter5; // Loaded from Schema
  private String btcParameter6; // Loaded from Schema
  private String btcParameter7; // Loaded from Schema
  private String btcParameter8; // Loaded from Schema
  private String btcParameter9; // Loaded from Schema

  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new BtcBatchControlDMO object.
   */
  public BtcBatchControlDMO(  ) {
  }

  // Constructor - taking public attributes
  /**
   * Creates a new BtcBatchControlDMO object.
   *
   * @param btcBatchType DOCUMENT ME!
   * @param btcBatchId DOCUMENT ME!
   * @param btcDescription DOCUMENT ME!
   * @param btcBatchRunNum DOCUMENT ME!
   * @param btcStartTime DOCUMENT ME!
   * @param btcBatchProgram DOCUMENT ME!
   * @param btcParameter1 DOCUMENT ME!
   * @param btcParameter2 DOCUMENT ME!
   * @param btcParameter3 DOCUMENT ME!
   * @param btcParameter4 DOCUMENT ME!
   * @param btcParameter5 DOCUMENT ME!
   * @param btcParameter6 DOCUMENT ME!
   * @param btcParameter7 DOCUMENT ME!
   * @param btcParameter8 DOCUMENT ME!
   * @param btcParameter9 DOCUMENT ME!
   * @param btcParameter10 DOCUMENT ME!
   * @param btcParameter11 DOCUMENT ME!
   * @param btcParameter12 DOCUMENT ME!
   * @param btcParameter13 DOCUMENT ME!
   * @param btcParameter14 DOCUMENT ME!
   * @param btcParameter15 DOCUMENT ME!
   * @param btcProcessId DOCUMENT ME!
   * @param btcLocationId DOCUMENT ME!
   * @param btcBatchRunStat DOCUMENT ME!
   * @param btcBatchRunType DOCUMENT ME!
   */
  public BtcBatchControlDMO( 
    final String   btcBatchType,
    final String   btcBatchId,
    final String   btcDescription,
    final Integer  btcBatchRunNum,
    final DateTime btcStartTime,
    final String   btcBatchProgram,
    final String   btcParameter1,
    final String   btcParameter2,
    final String   btcParameter3,
    final String   btcParameter4,
    final String   btcParameter5,
    final String   btcParameter6,
    final String   btcParameter7,
    final String   btcParameter8,
    final String   btcParameter9,
    final String   btcParameter10,
    final String   btcParameter11,
    final String   btcParameter12,
    final String   btcParameter13,
    final String   btcParameter14,
    final String   btcParameter15,
    final Integer  btcProcessId,
    final Integer  btcLocationId,
    final String   btcBatchRunStat,
    final String   btcBatchRunType ) {
    this.btcBatchType = btcBatchType;

    this.btcBatchId = btcBatchId;

    this.btcDescription = btcDescription;

    this.btcBatchRunNum = btcBatchRunNum;

    this.btcStartTime = ( btcStartTime != null )
      ? new DateTime( btcStartTime ) : null;

    this.btcBatchProgram = btcBatchProgram;

    this.btcParameter1 = btcParameter1;

    this.btcParameter2 = btcParameter2;

    this.btcParameter3 = btcParameter3;

    this.btcParameter4 = btcParameter4;

    this.btcParameter5 = btcParameter5;

    this.btcParameter6 = btcParameter6;

    this.btcParameter7 = btcParameter7;

    this.btcParameter8 = btcParameter8;

    this.btcParameter9 = btcParameter9;

    this.btcParameter10 = btcParameter10;

    this.btcParameter11 = btcParameter11;

    this.btcParameter12 = btcParameter12;

    this.btcParameter13 = btcParameter13;

    this.btcParameter14 = btcParameter14;

    this.btcParameter15 = btcParameter15;

    this.btcProcessId = btcProcessId;

    this.btcLocationId = btcLocationId;

    this.btcBatchRunStat = btcBatchRunStat;

    this.btcBatchRunType = btcBatchRunType;
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
    return new DAOArgs( 2 ).arg( ( this.btcBatchType == null ) ? null
                                                               : this.btcBatchType
      .trim(  ) )
                           .arg( ( this.btcBatchId == null ) ? null
                                                             : this.btcBatchId
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
      ( btcBatchType == null ) ? null
                               : ( ( btcBatchType.length(  ) <= btcBatchTypeSize )
      ? btcBatchType
      : btcBatchType.substring( 0, btcBatchTypeSize ) // auto trimmed to fit, if required.
       ),
      ( btcBatchId == null ) ? null
                             : ( ( btcBatchId.length(  ) <= btcBatchIdSize )
      ? btcBatchId
      : btcBatchId.substring( 0, btcBatchIdSize ) // auto trimmed to fit, if required.
       ),
      ( btcDescription == null ) ? null
                                 : ( ( btcDescription.length(  ) <= btcDescriptionSize )
      ? btcDescription
      : btcDescription.substring( 0, btcDescriptionSize ) // auto trimmed to fit, if required.
       ), btcBatchRunNum, btcStartTime,
      ( btcBatchProgram == null ) ? null
                                  : ( ( btcBatchProgram.length(  ) <= btcBatchProgramSize )
      ? btcBatchProgram
      : btcBatchProgram.substring( 0, btcBatchProgramSize ) // auto trimmed to fit, if required.
       ),
      ( btcParameter1 == null ) ? null
                                : ( ( btcParameter1.length(  ) <= btcParameter1Size )
      ? btcParameter1
      : btcParameter1.substring( 0, btcParameter1Size ) // auto trimmed to fit, if required.
       ),
      ( btcParameter2 == null ) ? null
                                : ( ( btcParameter2.length(  ) <= btcParameter2Size )
      ? btcParameter2
      : btcParameter2.substring( 0, btcParameter2Size ) // auto trimmed to fit, if required.
       ),
      ( btcParameter3 == null ) ? null
                                : ( ( btcParameter3.length(  ) <= btcParameter3Size )
      ? btcParameter3
      : btcParameter3.substring( 0, btcParameter3Size ) // auto trimmed to fit, if required.
       ),
      ( btcParameter4 == null ) ? null
                                : ( ( btcParameter4.length(  ) <= btcParameter4Size )
      ? btcParameter4
      : btcParameter4.substring( 0, btcParameter4Size ) // auto trimmed to fit, if required.
       ),
      ( btcParameter5 == null ) ? null
                                : ( ( btcParameter5.length(  ) <= btcParameter5Size )
      ? btcParameter5
      : btcParameter5.substring( 0, btcParameter5Size ) // auto trimmed to fit, if required.
       ),
      ( btcParameter6 == null ) ? null
                                : ( ( btcParameter6.length(  ) <= btcParameter6Size )
      ? btcParameter6
      : btcParameter6.substring( 0, btcParameter6Size ) // auto trimmed to fit, if required.
       ),
      ( btcParameter7 == null ) ? null
                                : ( ( btcParameter7.length(  ) <= btcParameter7Size )
      ? btcParameter7
      : btcParameter7.substring( 0, btcParameter7Size ) // auto trimmed to fit, if required.
       ),
      ( btcParameter8 == null ) ? null
                                : ( ( btcParameter8.length(  ) <= btcParameter8Size )
      ? btcParameter8
      : btcParameter8.substring( 0, btcParameter8Size ) // auto trimmed to fit, if required.
       ),
      ( btcParameter9 == null ) ? null
                                : ( ( btcParameter9.length(  ) <= btcParameter9Size )
      ? btcParameter9
      : btcParameter9.substring( 0, btcParameter9Size ) // auto trimmed to fit, if required.
       ),
      ( btcParameter10 == null ) ? null
                                 : ( ( btcParameter10.length(  ) <= btcParameter10Size )
      ? btcParameter10
      : btcParameter10.substring( 0, btcParameter10Size ) // auto trimmed to fit, if required.
       ),
      ( btcParameter11 == null ) ? null
                                 : ( ( btcParameter11.length(  ) <= btcParameter11Size )
      ? btcParameter11
      : btcParameter11.substring( 0, btcParameter11Size ) // auto trimmed to fit, if required.
       ),
      ( btcParameter12 == null ) ? null
                                 : ( ( btcParameter12.length(  ) <= btcParameter12Size )
      ? btcParameter12
      : btcParameter12.substring( 0, btcParameter12Size ) // auto trimmed to fit, if required.
       ),
      ( btcParameter13 == null ) ? null
                                 : ( ( btcParameter13.length(  ) <= btcParameter13Size )
      ? btcParameter13
      : btcParameter13.substring( 0, btcParameter13Size ) // auto trimmed to fit, if required.
       ),
      ( btcParameter14 == null ) ? null
                                 : ( ( btcParameter14.length(  ) <= btcParameter14Size )
      ? btcParameter14
      : btcParameter14.substring( 0, btcParameter14Size ) // auto trimmed to fit, if required.
       ),
      ( btcParameter15 == null ) ? null
                                 : ( ( btcParameter15.length(  ) <= btcParameter15Size )
      ? btcParameter15
      : btcParameter15.substring( 0, btcParameter15Size ) // auto trimmed to fit, if required.
       ), btcProcessId, btcLocationId,
      ( btcBatchRunStat == null ) ? null
                                  : ( ( btcBatchRunStat.length(  ) <= btcBatchRunStatSize )
      ? btcBatchRunStat
      : btcBatchRunStat.substring( 0, btcBatchRunStatSize ) // auto trimmed to fit, if required.
       ),
      ( btcBatchRunType == null ) ? null
                                  : ( ( btcBatchRunType.length(  ) <= btcBatchRunTypeSize )
      ? btcBatchRunType
      : btcBatchRunType.substring( 0, btcBatchRunTypeSize ) // auto trimmed to fit, if required.
       )
    };
  }

  /**
   * DOCUMENT ME!
   *
   * @param fields DOCUMENT ME!
   */
  protected void set( final Object[] fields ) {
    btcBatchType = rtrim( (String) fields[0] );
    btcBatchId = rtrim( (String) fields[1] );
    btcDescription = rtrim( (String) fields[2] );
    btcBatchRunNum = (Integer) fields[3];
    btcStartTime = (DateTime) fields[4];
    btcBatchProgram = rtrim( (String) fields[5] );
    btcParameter1 = rtrim( (String) fields[6] );
    btcParameter2 = rtrim( (String) fields[7] );
    btcParameter3 = rtrim( (String) fields[8] );
    btcParameter4 = rtrim( (String) fields[9] );
    btcParameter5 = rtrim( (String) fields[10] );
    btcParameter6 = rtrim( (String) fields[11] );
    btcParameter7 = rtrim( (String) fields[12] );
    btcParameter8 = rtrim( (String) fields[13] );
    btcParameter9 = rtrim( (String) fields[14] );
    btcParameter10 = rtrim( (String) fields[15] );
    btcParameter11 = rtrim( (String) fields[16] );
    btcParameter12 = rtrim( (String) fields[17] );
    btcParameter13 = rtrim( (String) fields[18] );
    btcParameter14 = rtrim( (String) fields[19] );
    btcParameter15 = rtrim( (String) fields[20] );
    btcProcessId = (Integer) fields[21];
    btcLocationId = (Integer) fields[22];
    btcBatchRunStat = rtrim( (String) fields[23] );
    btcBatchRunType = rtrim( (String) fields[24] );
  }

  // Get methods ///////////////////////////////////////////////////////////////
  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getBtcBatchType(  ) {
    return btcBatchType;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getBtcBatchId(  ) {
    return btcBatchId;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getBtcDescription(  ) {
    return btcDescription;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public Integer getBtcBatchRunNum(  ) {
    return btcBatchRunNum;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public DateTime getBtcStartTime(  ) {
    return ( btcStartTime != null ) ? new DateTime( btcStartTime ) : null;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getBtcBatchProgram(  ) {
    return btcBatchProgram;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getBtcParameter1(  ) {
    return btcParameter1;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getBtcParameter2(  ) {
    return btcParameter2;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getBtcParameter3(  ) {
    return btcParameter3;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getBtcParameter4(  ) {
    return btcParameter4;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getBtcParameter5(  ) {
    return btcParameter5;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getBtcParameter6(  ) {
    return btcParameter6;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getBtcParameter7(  ) {
    return btcParameter7;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getBtcParameter8(  ) {
    return btcParameter8;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getBtcParameter9(  ) {
    return btcParameter9;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getBtcParameter10(  ) {
    return btcParameter10;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getBtcParameter11(  ) {
    return btcParameter11;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getBtcParameter12(  ) {
    return btcParameter12;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getBtcParameter13(  ) {
    return btcParameter13;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getBtcParameter14(  ) {
    return btcParameter14;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getBtcParameter15(  ) {
    return btcParameter15;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public Integer getBtcProcessId(  ) {
    return btcProcessId;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public Integer getBtcLocationId(  ) {
    return btcLocationId;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getBtcBatchRunStat(  ) {
    return btcBatchRunStat;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getBtcBatchRunType(  ) {
    return btcBatchRunType;
  }

  // Setter methods ///////////////////////////////////////////////////////////////

  //
  // Master setter follows...
  //

  /**
   * Setter that takes all attributes
   */
  public void set( 
    final String   btcBatchType,
    final String   btcBatchId,
    final String   btcDescription,
    final Integer  btcBatchRunNum,
    final DateTime btcStartTime,
    final String   btcBatchProgram,
    final String   btcParameter1,
    final String   btcParameter2,
    final String   btcParameter3,
    final String   btcParameter4,
    final String   btcParameter5,
    final String   btcParameter6,
    final String   btcParameter7,
    final String   btcParameter8,
    final String   btcParameter9,
    final String   btcParameter10,
    final String   btcParameter11,
    final String   btcParameter12,
    final String   btcParameter13,
    final String   btcParameter14,
    final String   btcParameter15,
    final Integer  btcProcessId,
    final Integer  btcLocationId,
    final String   btcBatchRunStat,
    final String   btcBatchRunType ) {
    this.btcBatchType = btcBatchType;
    this.btcBatchId = btcBatchId;
    this.btcDescription = btcDescription;
    this.btcBatchRunNum = btcBatchRunNum;
    this.btcStartTime = ( btcStartTime != null )
      ? new DateTime( btcStartTime ) : null;
    this.btcBatchProgram = btcBatchProgram;
    this.btcParameter1 = btcParameter1;
    this.btcParameter2 = btcParameter2;
    this.btcParameter3 = btcParameter3;
    this.btcParameter4 = btcParameter4;
    this.btcParameter5 = btcParameter5;
    this.btcParameter6 = btcParameter6;
    this.btcParameter7 = btcParameter7;
    this.btcParameter8 = btcParameter8;
    this.btcParameter9 = btcParameter9;
    this.btcParameter10 = btcParameter10;
    this.btcParameter11 = btcParameter11;
    this.btcParameter12 = btcParameter12;
    this.btcParameter13 = btcParameter13;
    this.btcParameter14 = btcParameter14;
    this.btcParameter15 = btcParameter15;
    this.btcProcessId = btcProcessId;
    this.btcLocationId = btcLocationId;
    this.btcBatchRunStat = btcBatchRunStat;
    this.btcBatchRunType = btcBatchRunType;
  }

  //
  // Public access modifiers if any
  // (provided for attributes that are public in the analysis model)
  //    

  /**
  * Sets the BtcBatchType field.
  *
  * @param btcBatchType
  */
  public void setBtcBatchType( final String btcBatchType ) {
    this.btcBatchType = getPadded(btcBatchType, btcBatchTypeFilter);
  }

  /**
  * Sets the BtcBatchId field.
  *
  * @param btcBatchId
  */
  public void setBtcBatchId( final String btcBatchId ) {
    this.btcBatchId = getPadded(btcBatchId, btcBatchIdFilter);
  }

  /**
  * Sets the BtcDescription field.
  *
  * @param btcDescription
  */
  public void setBtcDescription( final String btcDescription ) {
    this.btcDescription = getPadded(btcDescription, btcDescriptionFilter);
  }

  /**
  * Sets the BtcBatchRunNum field.
  *
  * @param btcBatchRunNum
  */
  public void setBtcBatchRunNum( final Integer btcBatchRunNum ) {
    this.btcBatchRunNum = btcBatchRunNum;
  }

  /**
  * Sets the BtcStartTime field.
  *
  * @param btcStartTime
  */
  public void setBtcStartTime( final DateTime btcStartTime ) {
    this.btcStartTime = ( btcStartTime != null )
      ? new DateTime( btcStartTime ) : null;
  }

  /**
  * Sets the BtcBatchProgram field.
  *
  * @param btcBatchProgram
  */
  public void setBtcBatchProgram( final String btcBatchProgram ) {
    this.btcBatchProgram = getPadded(btcBatchProgram, btcBatchProgramFilter);
  }

  /**
  * Sets the BtcParameter1 field.
  *
  * @param btcParameter1
  */
  public void setBtcParameter1( final String btcParameter1 ) {
    this.btcParameter1 = getPadded(btcParameter1, btcParameter10Filter);
  }

  /**
  * Sets the BtcParameter2 field.
  *
  * @param btcParameter2
  */
  public void setBtcParameter2( final String btcParameter2 ) {
    this.btcParameter2 = getPadded(btcParameter2, btcParameter2Filter);
  }

  /**
  * Sets the BtcParameter3 field.
  *
  * @param btcParameter3
  */
  public void setBtcParameter3( final String btcParameter3 ) {
    this.btcParameter3 = getPadded(btcParameter3, btcParameter3Filter);
  }

  /**
  * Sets the BtcParameter4 field.
  *
  * @param btcParameter4
  */
  public void setBtcParameter4( final String btcParameter4 ) {
    this.btcParameter4 = getPadded(btcParameter4, btcParameter4Filter);
  }

  /**
  * Sets the BtcParameter5 field.
  *
  * @param btcParameter5
  */
  public void setBtcParameter5( final String btcParameter5 ) {
    this.btcParameter5 = getPadded(btcParameter5, btcParameter5Filter);
  }

  /**
  * Sets the BtcParameter6 field.
  *
  * @param btcParameter6
  */
  public void setBtcParameter6( final String btcParameter6 ) {
    this.btcParameter6 = getPadded(btcParameter6, btcParameter6Filter);
  }

  /**
  * Sets the BtcParameter7 field.
  *
  * @param btcParameter7
  */
  public void setBtcParameter7( final String btcParameter7 ) {
    this.btcParameter7 = getPadded(btcParameter7, btcParameter7Filter);
  }

  /**
  * Sets the BtcParameter8 field.
  *
  * @param btcParameter8
  */
  public void setBtcParameter8( final String btcParameter8 ) {
    this.btcParameter8 = getPadded(btcParameter8, btcParameter8Filter);
  }

  /**
  * Sets the BtcParameter9 field.
  *
  * @param btcParameter9
  */
  public void setBtcParameter9( final String btcParameter9 ) {
    this.btcParameter9 = getPadded(btcParameter9, btcParameter9Filter);
  }

  /**
  * Sets the BtcParameter10 field.
  *
  * @param btcParameter10
  */
  public void setBtcParameter10( final String btcParameter10 ) {
    this.btcParameter10 = getPadded(btcParameter10, btcParameter10Filter);
  }

  /**
  * Sets the BtcParameter11 field.
  *
  * @param btcParameter11
  */
  public void setBtcParameter11( final String btcParameter11 ) {
    this.btcParameter11 = getPadded(btcParameter11, btcParameter11Filter);
  }

  /**
  * Sets the BtcParameter12 field.
  *
  * @param btcParameter12
  */
  public void setBtcParameter12( final String btcParameter12 ) {
    this.btcParameter12 = getPadded(btcParameter12, btcParameter12Filter);
  }

  /**
  * Sets the BtcParameter13 field.
  *
  * @param btcParameter13
  */
  public void setBtcParameter13( final String btcParameter13 ) {
    this.btcParameter13 = getPadded(btcParameter13, btcParameter13Filter);
  }

  /**
  * Sets the BtcParameter14 field.
  *
  * @param btcParameter14
  */
  public void setBtcParameter14( final String btcParameter14 ) {
    this.btcParameter14 = getPadded(btcParameter14, btcParameter14Filter);
  }

  /**
  * Sets the BtcParameter15 field.
  *
  * @param btcParameter15
  */
  public void setBtcParameter15( final String btcParameter15 ) {
    this.btcParameter15 = getPadded(btcParameter15, btcParameter15Filter);
  }

  /**
  * Sets the BtcProcessId field.
  *
  * @param btcProcessId
  */
  public void setBtcProcessId( final Integer btcProcessId ) {
    this.btcProcessId = btcProcessId;
  }

  /**
  * Sets the BtcLocationId field.
  *
  * @param btcLocationId
  */
  public void setBtcLocationId( final Integer btcLocationId ) {
    this.btcLocationId = btcLocationId;
  }

  /**
  * Sets the BtcBatchRunStat field.
  *
  * @param btcBatchRunStat
  */
  public void setBtcBatchRunStat( final String btcBatchRunStat ) {
    this.btcBatchRunStat = getPadded(btcBatchRunStat, btcBatchRunStatFilter);
  }

  /**
  * Sets the BtcBatchRunType field.
  *
  * @param btcBatchRunType
  */
  public void setBtcBatchRunType( final String btcBatchRunType ) {
    this.btcBatchRunType = getPadded(btcBatchRunType, btcBatchRunTypeFilter);
  }
 
  private final int[] fieldSizes = new int[] {
		  btcBatchTypeSize,
		  btcBatchIdSize,
		 btcDescriptionSize,
		 0,
		 0,
		 btcBatchProgramSize,
		 btcParameter1Size,
		 btcParameter2Size,
		 btcParameter3Size,
		 btcParameter4Size,
		 btcParameter5Size,
		 btcParameter6Size,
		 btcParameter7Size,
		 btcParameter8Size,
		 btcParameter9Size,
		 btcParameter10Size,
		 btcParameter11Size,
		 btcParameter12Size,
		 btcParameter13Size,
		 btcParameter14Size,
		 btcParameter15Size,
		 0,
		 0,
		 btcBatchRunStatSize,
		 btcBatchRunTypeSize
  };
  
protected int[] fieldSizes() {
	return fieldSizes;
}

}
