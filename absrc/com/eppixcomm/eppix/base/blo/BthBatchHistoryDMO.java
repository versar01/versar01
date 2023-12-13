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
 * A value object to carry the data for a BthBatchHistory.
 *
 *
 * <H3> A BthBatchHistory is: </H3>
 *
 * <!-- indent text -->
 * <TABLE BORDER="0" CELLPADDING="0" CELLSPACING="0">
 * <TR>
 * <TD WIDTH="25">&nbsp;</TD>
 * <TD>
 *
 * There is one entry in here per attempt at a run of a batch job.
 * <p>
 *   See also the btc_batch_control table which holds one entry per batch job, but not per run of it. A new record is
 *   generated in this table from the generic BatchRun_Start function. The same row is updated when the batch process
 *   finally ends - stored as a permanent record of the run.
 * </p>
 *
 * <!-- end indent text -->
 * </TD>
 * </TR>
 * </TABLE>
 *
 *
 * <H3> BthBatchHistory Value Object: </H3>
 *
 * <!-- indent text -->
 * <TABLE BORDER="0" CELLPADDING="0" CELLSPACING="0">
 * <TR>
 * <TD WIDTH="25">&nbsp;</TD>
 * <TD>
 *
 * <P>
 *     This is a value object (called a Data Model Object or 'DMO').
 *     It is used to pass the data for a bthBatchHistory into and out of the BASE module.
 *     Because it's purpose is to carry data into and out of the module it is visible outside the module.
 * </P>
 * <P>
 *     This value object carries the data for one bthBatchHistory. A bthBatchHistory is:
 * There is one entry in here per attempt at a run of a batch job.
 * </P>
 * <P>
 *     It corresponds to the business logic object BthBatchHistory which
 *     contains all the business behaviour of a bthBatchHistory but is not visible outside the
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
 *    This value object contains fields for all the details of a bthBatchHistory, namely:
 * </P>
 *


 * <P>
 *    <U>Fields to carry the Attributes of a bthBatchHistory:</U>
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
 *   <TD ALIGN="left" VALIGN="top"><B>bthBatchRunNum</B></TD>
 *   <TD ALIGN="left" VALIGN="top">Integer</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       null
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
 *       <A HREF="#getBthBatchRunNum()">
 *           getBthBatchRunNum
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setBthBatchRunNum(java.lang.Integer)">
 *           setBthBatchRunNum (Integer)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>bthBatchType</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       null
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
 *       <A HREF="#getBthBatchType()">
 *           getBthBatchType
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setBthBatchType(java.lang.String)">
 *           setBthBatchType (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>bthBatchId</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       null
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
 *       <A HREF="#getBthBatchId()">
 *           getBthBatchId
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setBthBatchId(java.lang.String)">
 *           setBthBatchId (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>bthParameter1</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       null
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
 *       <A HREF="#getBthParameter1()">
 *           getBthParameter1
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setBthParameter1(java.lang.String)">
 *           setBthParameter1 (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>bthParameter2</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       null
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
 *       <A HREF="#getBthParameter2()">
 *           getBthParameter2
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setBthParameter2(java.lang.String)">
 *           setBthParameter2 (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>bthParameter3</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       null
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
 *       <A HREF="#getBthParameter3()">
 *           getBthParameter3
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setBthParameter3(java.lang.String)">
 *           setBthParameter3 (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>bthParameter4</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       null
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
 *       <A HREF="#getBthParameter4()">
 *           getBthParameter4
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setBthParameter4(java.lang.String)">
 *           setBthParameter4 (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>bthParameter5</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       null
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
 *       <A HREF="#getBthParameter5()">
 *           getBthParameter5
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setBthParameter5(java.lang.String)">
 *           setBthParameter5 (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>bthParameter6</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       null
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
 *       <A HREF="#getBthParameter6()">
 *           getBthParameter6
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setBthParameter6(java.lang.String)">
 *           setBthParameter6 (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>bthParameter7</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       null
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
 *       <A HREF="#getBthParameter7()">
 *           getBthParameter7
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setBthParameter7(java.lang.String)">
 *           setBthParameter7 (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>bthParameter8</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       null
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
 *       <A HREF="#getBthParameter8()">
 *           getBthParameter8
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setBthParameter8(java.lang.String)">
 *           setBthParameter8 (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>bthParameter9</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       null
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
 *       <A HREF="#getBthParameter9()">
 *           getBthParameter9
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setBthParameter9(java.lang.String)">
 *           setBthParameter9 (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>bthParameter10</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       null
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
 *       <A HREF="#getBthParameter10()">
 *           getBthParameter10
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setBthParameter10(java.lang.String)">
 *           setBthParameter10 (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>bthParameter11</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       null
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
 *       <A HREF="#getBthParameter11()">
 *           getBthParameter11
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setBthParameter11(java.lang.String)">
 *           setBthParameter11 (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>bthParameter12</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       null
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
 *       <A HREF="#getBthParameter12()">
 *           getBthParameter12
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setBthParameter12(java.lang.String)">
 *           setBthParameter12 (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>bthParameter13</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       null
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
 *       <A HREF="#getBthParameter13()">
 *           getBthParameter13
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setBthParameter13(java.lang.String)">
 *           setBthParameter13 (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>bthParameter14</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       null
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
 *       <A HREF="#getBthParameter14()">
 *           getBthParameter14
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setBthParameter14(java.lang.String)">
 *           setBthParameter14 (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>bthParameter15</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       null
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
 *       <A HREF="#getBthParameter15()">
 *           getBthParameter15
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setBthParameter15(java.lang.String)">
 *           setBthParameter15 (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>bthStartTime</B></TD>
 *   <TD ALIGN="left" VALIGN="top">DateTime</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       null
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
 *       <A HREF="#getBthStartTime()">
 *           getBthStartTime
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setBthStartTime(com.cmgwds.eppix.util.DateTime)">
 *           setBthStartTime (DateTime)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>bthEndTime</B></TD>
 *   <TD ALIGN="left" VALIGN="top">DateTime</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       null
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
 *       <A HREF="#getBthEndTime()">
 *           getBthEndTime
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setBthEndTime(com.cmgwds.eppix.util.DateTime)">
 *           setBthEndTime (DateTime)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>bthLocationId</B></TD>
 *   <TD ALIGN="left" VALIGN="top">Integer</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       null
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
 *       <A HREF="#getBthLocationId()">
 *           getBthLocationId
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setBthLocationId(java.lang.Integer)">
 *           setBthLocationId (Integer)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>bthRecsProcessed</B></TD>
 *   <TD ALIGN="left" VALIGN="top">Integer</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       null
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
 *       <A HREF="#getBthRecsProcessed()">
 *           getBthRecsProcessed
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setBthRecsProcessed(java.lang.Integer)">
 *           setBthRecsProcessed (Integer)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>bthRecsRejected</B></TD>
 *   <TD ALIGN="left" VALIGN="top">Integer</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       null
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
 *       <A HREF="#getBthRecsRejected()">
 *           getBthRecsRejected
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setBthRecsRejected(java.lang.Integer)">
 *           setBthRecsRejected (Integer)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>bthBatchEndStat</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       null
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
 *       <A HREF="#getBthBatchEndStat()">
 *           getBthBatchEndStat
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setBthBatchEndStat(java.lang.String)">
 *           setBthBatchEndStat (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>bthStatusValue</B></TD>
 *   <TD ALIGN="left" VALIGN="top">Short</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       null
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
 *       <A HREF="#getBthStatusValue()">
 *           getBthStatusValue
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setBthStatusValue(java.lang.Short)">
 *           setBthStatusValue (Short)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>bthStatusClass</B></TD>
 *   <TD ALIGN="left" VALIGN="top">Short</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       null
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
 *       <A HREF="#getBthStatusClass()">
 *           getBthStatusClass
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setBthStatusClass(java.lang.Short)">
 *           setBthStatusClass (Short)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>bthIsamValue</B></TD>
 *   <TD ALIGN="left" VALIGN="top">Short</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       null
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
 *       <A HREF="#getBthIsamValue()">
 *           getBthIsamValue
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setBthIsamValue(java.lang.Short)">
 *           setBthIsamValue (Short)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>bthErrorMess</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       null
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
 *       <A HREF="#getBthErrorMess()">
 *           getBthErrorMess
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setBthErrorMess(java.lang.String)">
 *           setBthErrorMess (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>bthAnalysis1</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       null
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
 *       <A HREF="#getBthAnalysis1()">
 *           getBthAnalysis1
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setBthAnalysis1(java.lang.String)">
 *           setBthAnalysis1 (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>bthAnalysis2</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       null
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
 *       <A HREF="#getBthAnalysis2()">
 *           getBthAnalysis2
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setBthAnalysis2(java.lang.String)">
 *           setBthAnalysis2 (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>bthAnalysis3</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       null
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
 *       <A HREF="#getBthAnalysis3()">
 *           getBthAnalysis3
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setBthAnalysis3(java.lang.String)">
 *           setBthAnalysis3 (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>bthAnalysis4</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       null
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
 *       <A HREF="#getBthAnalysis4()">
 *           getBthAnalysis4
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setBthAnalysis4(java.lang.String)">
 *           setBthAnalysis4 (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>bthAnalysis5</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       null
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
 *       <A HREF="#getBthAnalysis5()">
 *           getBthAnalysis5
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setBthAnalysis5(java.lang.String)">
 *           setBthAnalysis5 (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>bthBatchRunType</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       null
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
 *       <A HREF="#getBthBatchRunType()">
 *           getBthBatchRunType
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setBthBatchRunType(java.lang.String)">
 *           setBthBatchRunType (String)
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


 * @see BthBatchHistory
 *
 * @author
 * @version $Revision: $
 *
 * @since $jdk$
 */
public class BthBatchHistoryDMO
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
      FIELD_TYPE_INTEGER /* std public attribute: bthBatchRunNum  */,
      FIELD_TYPE_STRING /* std public attribute: bthBatchType  */,
      FIELD_TYPE_STRING /* std public attribute: bthBatchId  */,
      FIELD_TYPE_STRING /* std public attribute: bthParameter1  */,
      FIELD_TYPE_STRING /* std public attribute: bthParameter2  */,
      FIELD_TYPE_STRING /* std public attribute: bthParameter3  */,
      FIELD_TYPE_STRING /* std public attribute: bthParameter4  */,
      FIELD_TYPE_STRING /* std public attribute: bthParameter5  */,
      FIELD_TYPE_STRING /* std public attribute: bthParameter6  */,
      FIELD_TYPE_STRING /* std public attribute: bthParameter7  */,
      FIELD_TYPE_STRING /* std public attribute: bthParameter8  */,
      FIELD_TYPE_STRING /* std public attribute: bthParameter9  */,
      FIELD_TYPE_STRING /* std public attribute: bthParameter10  */,
      FIELD_TYPE_STRING /* std public attribute: bthParameter11  */,
      FIELD_TYPE_STRING /* std public attribute: bthParameter12  */,
      FIELD_TYPE_STRING /* std public attribute: bthParameter13  */,
      FIELD_TYPE_STRING /* std public attribute: bthParameter14  */,
      FIELD_TYPE_STRING /* std public attribute: bthParameter15  */,
      FIELD_TYPE_DATETIME /* std public attribute: bthStartTime  */,
      FIELD_TYPE_DATETIME /* std public attribute: bthEndTime  */,
      FIELD_TYPE_INTEGER /* std public attribute: bthLocationId  */,
      FIELD_TYPE_INTEGER /* std public attribute: bthRecsProcessed  */,
      FIELD_TYPE_INTEGER /* std public attribute: bthRecsRejected  */,
      FIELD_TYPE_STRING /* std public attribute: bthBatchEndStat  */,
      FIELD_TYPE_SHORT /* std public attribute: bthStatusValue  */,
      FIELD_TYPE_SHORT /* std public attribute: bthStatusClass  */,
      FIELD_TYPE_SHORT /* std public attribute: bthIsamValue  */,
      FIELD_TYPE_STRING /* std public attribute: bthErrorMess  */,
      FIELD_TYPE_STRING /* std public attribute: bthAnalysis1  */,
      FIELD_TYPE_STRING /* std public attribute: bthAnalysis2  */,
      FIELD_TYPE_STRING /* std public attribute: bthAnalysis3  */,
      FIELD_TYPE_STRING /* std public attribute: bthAnalysis4  */,
      FIELD_TYPE_STRING /* std public attribute: bthAnalysis5  */,
      FIELD_TYPE_STRING /* std public attribute: bthBatchRunType  */
    };

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int bthBatchRunNumFilter = 0; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int bthBatchTypeFilter = 1; // filter index
  private static final int bthBatchTypeSize = 15; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int bthBatchIdFilter = 2; // filter index
  private static final int bthBatchIdSize = 10; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int bthParameter1Filter = 3; // filter index
  private static final int bthParameter1Size = 15; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int bthParameter2Filter = 4; // filter index
  private static final int bthParameter2Size = 15; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int bthParameter3Filter = 5; // filter index
  private static final int bthParameter3Size = 15; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int bthParameter4Filter = 6; // filter index
  private static final int bthParameter4Size = 15; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int bthParameter5Filter = 7; // filter index
  private static final int bthParameter5Size = 15; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int bthParameter6Filter = 8; // filter index
  private static final int bthParameter6Size = 15; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int bthParameter7Filter = 9; // filter index
  private static final int bthParameter7Size = 15; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int bthParameter8Filter = 10; // filter index
  private static final int bthParameter8Size = 15; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int bthParameter9Filter = 11; // filter index
  private static final int bthParameter9Size = 15; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int bthParameter10Filter = 12; // filter index
  private static final int bthParameter10Size = 15; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int bthParameter11Filter = 13; // filter index
  private static final int bthParameter11Size = 15; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int bthParameter12Filter = 14; // filter index
  private static final int bthParameter12Size = 15; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int bthParameter13Filter = 15; // filter index
  private static final int bthParameter13Size = 15; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int bthParameter14Filter = 16; // filter index
  private static final int bthParameter14Size = 15; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int bthParameter15Filter = 17; // filter index
  private static final int bthParameter15Size = 15; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int bthStartTimeFilter = 18; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int bthEndTimeFilter = 19; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int bthLocationIdFilter = 20; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int bthRecsProcessedFilter = 21; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int bthRecsRejectedFilter = 22; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int bthBatchEndStatFilter = 23; // filter index
  private static final int bthBatchEndStatSize = 15; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int bthStatusValueFilter = 24; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int bthStatusClassFilter = 25; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int bthIsamValueFilter = 26; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int bthErrorMessFilter = 27; // filter index
  private static final int bthErrorMessSize = 120; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int bthAnalysis1Filter = 28; // filter index
  private static final int bthAnalysis1Size = 15; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int bthAnalysis2Filter = 29; // filter index
  private static final int bthAnalysis2Size = 15; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int bthAnalysis3Filter = 30; // filter index
  private static final int bthAnalysis3Size = 15; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int bthAnalysis4Filter = 31; // filter index
  private static final int bthAnalysis4Size = 15; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int bthAnalysis5Filter = 32; // filter index
  private static final int bthAnalysis5Size = 15; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int bthBatchRunTypeFilter = 33; // filter index
  private static final int bthBatchRunTypeSize = 10; // field size

  //~ Instance variables /////////////////////////////////////////////////////

  private DateTime bthEndTime; // Loaded from Schema
  private DateTime bthStartTime; // Loaded from Schema

  //---------------------
  // Field declarations
  //---------------------
  // all attributes
  private Integer bthBatchRunNum; // Loaded from Schema
  private Integer bthLocationId; // Loaded from Schema
  private Integer bthRecsProcessed; // Loaded from Schema
  private Integer bthRecsRejected; // Loaded from Schema
  private Short bthIsamValue; // Loaded from Schema
  private Short bthStatusClass; // Loaded from Schema
  private Short bthStatusValue; // Loaded from Schema
  private String bthAnalysis1; // Loaded from Schema
  private String bthAnalysis2; // Loaded from Schema
  private String bthAnalysis3; // Loaded from Schema
  private String bthAnalysis4; // Loaded from Schema
  private String bthAnalysis5; // Loaded from Schema
  private String bthBatchEndStat; // Loaded from Schema
  private String bthBatchId; // Loaded from Schema
  private String bthBatchRunType; // Loaded from Schema
  private String bthBatchType; // Loaded from Schema
  private String bthErrorMess; // Loaded from Schema
  private String bthParameter1; // Loaded from Schema
  private String bthParameter10; // Loaded from Schema
  private String bthParameter11; // Loaded from Schema
  private String bthParameter12; // Loaded from Schema
  private String bthParameter13; // Loaded from Schema
  private String bthParameter14; // Loaded from Schema
  private String bthParameter15; // Loaded from Schema
  private String bthParameter2; // Loaded from Schema
  private String bthParameter3; // Loaded from Schema
  private String bthParameter4; // Loaded from Schema
  private String bthParameter5; // Loaded from Schema
  private String bthParameter6; // Loaded from Schema
  private String bthParameter7; // Loaded from Schema
  private String bthParameter8; // Loaded from Schema
  private String bthParameter9; // Loaded from Schema

  // list of string field sizes
  private final int[] fieldSizes = new int[] {
      0, bthBatchTypeSize, bthBatchIdSize, bthParameter1Size,
      bthParameter2Size, bthParameter3Size, bthParameter4Size,
      bthParameter5Size, bthParameter6Size, bthParameter7Size,
      bthParameter8Size, bthParameter9Size, bthParameter10Size,
      bthParameter11Size, bthParameter12Size, bthParameter13Size,
      bthParameter14Size, bthParameter15Size, 0, 0, 0, 0, 0,
      bthBatchEndStatSize, 0, 0, 0, bthErrorMessSize, bthAnalysis1Size,
      bthAnalysis2Size, bthAnalysis3Size, bthAnalysis4Size, bthAnalysis5Size,
      bthBatchRunTypeSize
    };

  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new BthBatchHistoryDMO object.
   */
  public BthBatchHistoryDMO(  ) {
  }

  // Constructor - taking public attributes
  /**
   * Creates a new BthBatchHistoryDMO object.
   *
   * @param bthBatchRunNum DOCUMENT ME!
   * @param bthBatchType DOCUMENT ME!
   * @param bthBatchId DOCUMENT ME!
   * @param bthParameter1 DOCUMENT ME!
   * @param bthParameter2 DOCUMENT ME!
   * @param bthParameter3 DOCUMENT ME!
   * @param bthParameter4 DOCUMENT ME!
   * @param bthParameter5 DOCUMENT ME!
   * @param bthParameter6 DOCUMENT ME!
   * @param bthParameter7 DOCUMENT ME!
   * @param bthParameter8 DOCUMENT ME!
   * @param bthParameter9 DOCUMENT ME!
   * @param bthParameter10 DOCUMENT ME!
   * @param bthParameter11 DOCUMENT ME!
   * @param bthParameter12 DOCUMENT ME!
   * @param bthParameter13 DOCUMENT ME!
   * @param bthParameter14 DOCUMENT ME!
   * @param bthParameter15 DOCUMENT ME!
   * @param bthStartTime DOCUMENT ME!
   * @param bthEndTime DOCUMENT ME!
   * @param bthLocationId DOCUMENT ME!
   * @param bthRecsProcessed DOCUMENT ME!
   * @param bthRecsRejected DOCUMENT ME!
   * @param bthBatchEndStat DOCUMENT ME!
   * @param bthStatusValue DOCUMENT ME!
   * @param bthStatusClass DOCUMENT ME!
   * @param bthIsamValue DOCUMENT ME!
   * @param bthErrorMess DOCUMENT ME!
   * @param bthAnalysis1 DOCUMENT ME!
   * @param bthAnalysis2 DOCUMENT ME!
   * @param bthAnalysis3 DOCUMENT ME!
   * @param bthAnalysis4 DOCUMENT ME!
   * @param bthAnalysis5 DOCUMENT ME!
   * @param bthBatchRunType DOCUMENT ME!
   */
  public BthBatchHistoryDMO( 
    final Integer  bthBatchRunNum,
    final String   bthBatchType,
    final String   bthBatchId,
    final String   bthParameter1,
    final String   bthParameter2,
    final String   bthParameter3,
    final String   bthParameter4,
    final String   bthParameter5,
    final String   bthParameter6,
    final String   bthParameter7,
    final String   bthParameter8,
    final String   bthParameter9,
    final String   bthParameter10,
    final String   bthParameter11,
    final String   bthParameter12,
    final String   bthParameter13,
    final String   bthParameter14,
    final String   bthParameter15,
    final DateTime bthStartTime,
    final DateTime bthEndTime,
    final Integer  bthLocationId,
    final Integer  bthRecsProcessed,
    final Integer  bthRecsRejected,
    final String   bthBatchEndStat,
    final Short    bthStatusValue,
    final Short    bthStatusClass,
    final Short    bthIsamValue,
    final String   bthErrorMess,
    final String   bthAnalysis1,
    final String   bthAnalysis2,
    final String   bthAnalysis3,
    final String   bthAnalysis4,
    final String   bthAnalysis5,
    final String   bthBatchRunType ) {
    this.bthBatchRunNum = bthBatchRunNum;

    setBthBatchType( bthBatchType );
    setBthBatchId( bthBatchId );
    setBthParameter1( bthParameter1 );
    setBthParameter2( bthParameter2 );
    setBthParameter3( bthParameter3 );
    setBthParameter4( bthParameter4 );
    setBthParameter5( bthParameter5 );
    setBthParameter6( bthParameter6 );
    setBthParameter7( bthParameter7 );
    setBthParameter8( bthParameter8 );
    setBthParameter9( bthParameter9 );
    setBthParameter10( bthParameter10 );
    setBthParameter11( bthParameter11 );
    setBthParameter12( bthParameter12 );
    setBthParameter13( bthParameter13 );
    setBthParameter14( bthParameter14 );
    setBthParameter15( bthParameter15 );

    this.bthStartTime = ( bthStartTime != null )
      ? new DateTime( bthStartTime ) : null;

    this.bthEndTime = ( bthEndTime != null ) ? new DateTime( bthEndTime ) : null;

    this.bthLocationId = bthLocationId;

    this.bthRecsProcessed = bthRecsProcessed;

    this.bthRecsRejected = bthRecsRejected;

    setBthBatchEndStat( bthBatchEndStat );

    this.bthStatusValue = bthStatusValue;

    this.bthStatusClass = bthStatusClass;

    this.bthIsamValue = bthIsamValue;

    setBthErrorMess( bthErrorMess );
    setBthAnalysis1( bthAnalysis1 );
    setBthAnalysis2( bthAnalysis2 );
    setBthAnalysis3( bthAnalysis3 );
    setBthAnalysis4( bthAnalysis4 );
    setBthAnalysis5( bthAnalysis5 );
    setBthBatchRunType( bthBatchRunType );
  }

  //~ Methods ////////////////////////////////////////////////////////////////

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  protected int[] fieldSizes(  ) {
    return fieldSizes;
  }

  // DBO method implementations ////////////////////////////////////////////////

  /**
   * Sets the generated key ( bthBatchRunNum ) value.
   *
   * @param key The generated key value.
   */
  protected void generatedKey( final Integer key ) {
    this.bthBatchRunNum = key;
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
    return new DAOArgs( 1 ).arg( this.bthBatchRunNum );
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
      bthBatchRunNum,
      ( bthBatchType == null ) ? null
                               : ( ( bthBatchType.length(  ) <= bthBatchTypeSize )
      ? bthBatchType
      : bthBatchType.substring( 0, bthBatchTypeSize ) // auto trimmed to fit, if required.
       ),
      ( bthBatchId == null ) ? null
                             : ( ( bthBatchId.length(  ) <= bthBatchIdSize )
      ? bthBatchId
      : bthBatchId.substring( 0, bthBatchIdSize ) // auto trimmed to fit, if required.
       ),
      ( bthParameter1 == null ) ? null
                                : ( ( bthParameter1.length(  ) <= bthParameter1Size )
      ? bthParameter1
      : bthParameter1.substring( 0, bthParameter1Size ) // auto trimmed to fit, if required.
       ),
      ( bthParameter2 == null ) ? null
                                : ( ( bthParameter2.length(  ) <= bthParameter2Size )
      ? bthParameter2
      : bthParameter2.substring( 0, bthParameter2Size ) // auto trimmed to fit, if required.
       ),
      ( bthParameter3 == null ) ? null
                                : ( ( bthParameter3.length(  ) <= bthParameter3Size )
      ? bthParameter3
      : bthParameter3.substring( 0, bthParameter3Size ) // auto trimmed to fit, if required.
       ),
      ( bthParameter4 == null ) ? null
                                : ( ( bthParameter4.length(  ) <= bthParameter4Size )
      ? bthParameter4
      : bthParameter4.substring( 0, bthParameter4Size ) // auto trimmed to fit, if required.
       ),
      ( bthParameter5 == null ) ? null
                                : ( ( bthParameter5.length(  ) <= bthParameter5Size )
      ? bthParameter5
      : bthParameter5.substring( 0, bthParameter5Size ) // auto trimmed to fit, if required.
       ),
      ( bthParameter6 == null ) ? null
                                : ( ( bthParameter6.length(  ) <= bthParameter6Size )
      ? bthParameter6
      : bthParameter6.substring( 0, bthParameter6Size ) // auto trimmed to fit, if required.
       ),
      ( bthParameter7 == null ) ? null
                                : ( ( bthParameter7.length(  ) <= bthParameter7Size )
      ? bthParameter7
      : bthParameter7.substring( 0, bthParameter7Size ) // auto trimmed to fit, if required.
       ),
      ( bthParameter8 == null ) ? null
                                : ( ( bthParameter8.length(  ) <= bthParameter8Size )
      ? bthParameter8
      : bthParameter8.substring( 0, bthParameter8Size ) // auto trimmed to fit, if required.
       ),
      ( bthParameter9 == null ) ? null
                                : ( ( bthParameter9.length(  ) <= bthParameter9Size )
      ? bthParameter9
      : bthParameter9.substring( 0, bthParameter9Size ) // auto trimmed to fit, if required.
       ),
      ( bthParameter10 == null ) ? null
                                 : ( ( bthParameter10.length(  ) <= bthParameter10Size )
      ? bthParameter10
      : bthParameter10.substring( 0, bthParameter10Size ) // auto trimmed to fit, if required.
       ),
      ( bthParameter11 == null ) ? null
                                 : ( ( bthParameter11.length(  ) <= bthParameter11Size )
      ? bthParameter11
      : bthParameter11.substring( 0, bthParameter11Size ) // auto trimmed to fit, if required.
       ),
      ( bthParameter12 == null ) ? null
                                 : ( ( bthParameter12.length(  ) <= bthParameter12Size )
      ? bthParameter12
      : bthParameter12.substring( 0, bthParameter12Size ) // auto trimmed to fit, if required.
       ),
      ( bthParameter13 == null ) ? null
                                 : ( ( bthParameter13.length(  ) <= bthParameter13Size )
      ? bthParameter13
      : bthParameter13.substring( 0, bthParameter13Size ) // auto trimmed to fit, if required.
       ),
      ( bthParameter14 == null ) ? null
                                 : ( ( bthParameter14.length(  ) <= bthParameter14Size )
      ? bthParameter14
      : bthParameter14.substring( 0, bthParameter14Size ) // auto trimmed to fit, if required.
       ),
      ( bthParameter15 == null ) ? null
                                 : ( ( bthParameter15.length(  ) <= bthParameter15Size )
      ? bthParameter15
      : bthParameter15.substring( 0, bthParameter15Size ) // auto trimmed to fit, if required.
       ), bthStartTime, bthEndTime, bthLocationId, bthRecsProcessed,
      bthRecsRejected,
      ( bthBatchEndStat == null ) ? null
                                  : ( ( bthBatchEndStat.length(  ) <= bthBatchEndStatSize )
      ? bthBatchEndStat
      : bthBatchEndStat.substring( 0, bthBatchEndStatSize ) // auto trimmed to fit, if required.
       ), bthStatusValue, bthStatusClass, bthIsamValue,
      ( bthErrorMess == null ) ? null
                               : ( ( bthErrorMess.length(  ) <= bthErrorMessSize )
      ? bthErrorMess
      : bthErrorMess.substring( 0, bthErrorMessSize ) // auto trimmed to fit, if required.
       ),
      ( bthAnalysis1 == null ) ? null
                               : ( ( bthAnalysis1.length(  ) <= bthAnalysis1Size )
      ? bthAnalysis1
      : bthAnalysis1.substring( 0, bthAnalysis1Size ) // auto trimmed to fit, if required.
       ),
      ( bthAnalysis2 == null ) ? null
                               : ( ( bthAnalysis2.length(  ) <= bthAnalysis2Size )
      ? bthAnalysis2
      : bthAnalysis2.substring( 0, bthAnalysis2Size ) // auto trimmed to fit, if required.
       ),
      ( bthAnalysis3 == null ) ? null
                               : ( ( bthAnalysis3.length(  ) <= bthAnalysis3Size )
      ? bthAnalysis3
      : bthAnalysis3.substring( 0, bthAnalysis3Size ) // auto trimmed to fit, if required.
       ),
      ( bthAnalysis4 == null ) ? null
                               : ( ( bthAnalysis4.length(  ) <= bthAnalysis4Size )
      ? bthAnalysis4
      : bthAnalysis4.substring( 0, bthAnalysis4Size ) // auto trimmed to fit, if required.
       ),
      ( bthAnalysis5 == null ) ? null
                               : ( ( bthAnalysis5.length(  ) <= bthAnalysis5Size )
      ? bthAnalysis5
      : bthAnalysis5.substring( 0, bthAnalysis5Size ) // auto trimmed to fit, if required.
       ),
      ( bthBatchRunType == null ) ? null
                                  : ( ( bthBatchRunType.length(  ) <= bthBatchRunTypeSize )
      ? bthBatchRunType
      : bthBatchRunType.substring( 0, bthBatchRunTypeSize ) // auto trimmed to fit, if required.
       )
    };
  }

  /**
   * DOCUMENT ME!
   *
   * @param fields DOCUMENT ME!
   */
  protected void set( final Object[] fields ) {
    bthBatchRunNum = (Integer) fields[0];
    bthBatchType = (String) fields[1];
    bthBatchId = (String) fields[2];
    bthParameter1 = (String) fields[3];
    bthParameter2 = (String) fields[4];
    bthParameter3 = (String) fields[5];
    bthParameter4 = (String) fields[6];
    bthParameter5 = (String) fields[7];
    bthParameter6 = (String) fields[8];
    bthParameter7 = (String) fields[9];
    bthParameter8 = (String) fields[10];
    bthParameter9 = (String) fields[11];
    bthParameter10 = (String) fields[12];
    bthParameter11 = (String) fields[13];
    bthParameter12 = (String) fields[14];
    bthParameter13 = (String) fields[15];
    bthParameter14 = (String) fields[16];
    bthParameter15 = (String) fields[17];
    bthStartTime = (DateTime) fields[18];
    bthEndTime = (DateTime) fields[19];
    bthLocationId = (Integer) fields[20];
    bthRecsProcessed = (Integer) fields[21];
    bthRecsRejected = (Integer) fields[22];
    bthBatchEndStat = (String) fields[23];
    bthStatusValue = (Short) fields[24];
    bthStatusClass = (Short) fields[25];
    bthIsamValue = (Short) fields[26];
    bthErrorMess = (String) fields[27];
    bthAnalysis1 = (String) fields[28];
    bthAnalysis2 = (String) fields[29];
    bthAnalysis3 = (String) fields[30];
    bthAnalysis4 = (String) fields[31];
    bthAnalysis5 = (String) fields[32];
    bthBatchRunType = (String) fields[33];
  }

  // Get methods ///////////////////////////////////////////////////////////////
  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public Integer getBthBatchRunNum(  ) {
    return bthBatchRunNum;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getBthBatchType(  ) {
    return rtrim( bthBatchType );
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getBthBatchId(  ) {
    return rtrim( bthBatchId );
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getBthParameter1(  ) {
    return rtrim( bthParameter1 );
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getBthParameter2(  ) {
    return rtrim( bthParameter2 );
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getBthParameter3(  ) {
    return rtrim( bthParameter3 );
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getBthParameter4(  ) {
    return rtrim( bthParameter4 );
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getBthParameter5(  ) {
    return rtrim( bthParameter5 );
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getBthParameter6(  ) {
    return rtrim( bthParameter6 );
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getBthParameter7(  ) {
    return rtrim( bthParameter7 );
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getBthParameter8(  ) {
    return rtrim( bthParameter8 );
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getBthParameter9(  ) {
    return rtrim( bthParameter9 );
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getBthParameter10(  ) {
    return rtrim( bthParameter10 );
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getBthParameter11(  ) {
    return rtrim( bthParameter11 );
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getBthParameter12(  ) {
    return rtrim( bthParameter12 );
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getBthParameter13(  ) {
    return rtrim( bthParameter13 );
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getBthParameter14(  ) {
    return rtrim( bthParameter14 );
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getBthParameter15(  ) {
    return rtrim( bthParameter15 );
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public DateTime getBthStartTime(  ) {
    return ( bthStartTime != null ) ? new DateTime( bthStartTime ) : null;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public DateTime getBthEndTime(  ) {
    return ( bthEndTime != null ) ? new DateTime( bthEndTime ) : null;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public Integer getBthLocationId(  ) {
    return bthLocationId;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public Integer getBthRecsProcessed(  ) {
    return bthRecsProcessed;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public Integer getBthRecsRejected(  ) {
    return bthRecsRejected;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getBthBatchEndStat(  ) {
    return rtrim( bthBatchEndStat );
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public Short getBthStatusValue(  ) {
    return bthStatusValue;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public Short getBthStatusClass(  ) {
    return bthStatusClass;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public Short getBthIsamValue(  ) {
    return bthIsamValue;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getBthErrorMess(  ) {
    return rtrim( bthErrorMess );
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getBthAnalysis1(  ) {
    return rtrim( bthAnalysis1 );
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getBthAnalysis2(  ) {
    return rtrim( bthAnalysis2 );
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getBthAnalysis3(  ) {
    return rtrim( bthAnalysis3 );
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getBthAnalysis4(  ) {
    return rtrim( bthAnalysis4 );
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getBthAnalysis5(  ) {
    return rtrim( bthAnalysis5 );
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getBthBatchRunType(  ) {
    return rtrim( bthBatchRunType );
  }

  // Setter methods ///////////////////////////////////////////////////////////////

  //
  // Master setter follows...
  //

  /**
   * Setter that takes all attributes
   */
  public void set( 
    final Integer  bthBatchRunNum,
    final String   bthBatchType,
    final String   bthBatchId,
    final String   bthParameter1,
    final String   bthParameter2,
    final String   bthParameter3,
    final String   bthParameter4,
    final String   bthParameter5,
    final String   bthParameter6,
    final String   bthParameter7,
    final String   bthParameter8,
    final String   bthParameter9,
    final String   bthParameter10,
    final String   bthParameter11,
    final String   bthParameter12,
    final String   bthParameter13,
    final String   bthParameter14,
    final String   bthParameter15,
    final DateTime bthStartTime,
    final DateTime bthEndTime,
    final Integer  bthLocationId,
    final Integer  bthRecsProcessed,
    final Integer  bthRecsRejected,
    final String   bthBatchEndStat,
    final Short    bthStatusValue,
    final Short    bthStatusClass,
    final Short    bthIsamValue,
    final String   bthErrorMess,
    final String   bthAnalysis1,
    final String   bthAnalysis2,
    final String   bthAnalysis3,
    final String   bthAnalysis4,
    final String   bthAnalysis5,
    final String   bthBatchRunType ) {
    setBthBatchRunNum( bthBatchRunNum );
    setBthBatchType( bthBatchType );
    setBthBatchId( bthBatchId );
    setBthParameter1( bthParameter1 );
    setBthParameter2( bthParameter2 );
    setBthParameter3( bthParameter3 );
    setBthParameter4( bthParameter4 );
    setBthParameter5( bthParameter5 );
    setBthParameter6( bthParameter6 );
    setBthParameter7( bthParameter7 );
    setBthParameter8( bthParameter8 );
    setBthParameter9( bthParameter9 );
    setBthParameter10( bthParameter10 );
    setBthParameter11( bthParameter11 );
    setBthParameter12( bthParameter12 );
    setBthParameter13( bthParameter13 );
    setBthParameter14( bthParameter14 );
    setBthParameter15( bthParameter15 );
    setBthStartTime( bthStartTime );
    setBthEndTime( bthEndTime );
    setBthLocationId( bthLocationId );
    setBthRecsProcessed( bthRecsProcessed );
    setBthRecsRejected( bthRecsRejected );
    setBthBatchEndStat( bthBatchEndStat );
    setBthStatusValue( bthStatusValue );
    setBthStatusClass( bthStatusClass );
    setBthIsamValue( bthIsamValue );
    setBthErrorMess( bthErrorMess );
    setBthAnalysis1( bthAnalysis1 );
    setBthAnalysis2( bthAnalysis2 );
    setBthAnalysis3( bthAnalysis3 );
    setBthAnalysis4( bthAnalysis4 );
    setBthAnalysis5( bthAnalysis5 );
    setBthBatchRunType( bthBatchRunType );
  }

  //
  // Public access modifiers if any
  // (provided for attributes that are public in the analysis model)
  //    

  /**
  * Sets the BthBatchRunNum field.
  *
  * @param bthBatchRunNum
  */
  public void setBthBatchRunNum( final Integer bthBatchRunNum ) {
    this.bthBatchRunNum = bthBatchRunNum;
  }

  /**
  * Sets the BthBatchType field.
  *
  * @param bthBatchType
  */
  public void setBthBatchType( final String bthBatchType ) {
    this.bthBatchType = getPadded( bthBatchType, bthBatchTypeFilter );
  }

  /**
  * Sets the BthBatchId field.
  *
  * @param bthBatchId
  */
  public void setBthBatchId( final String bthBatchId ) {
    this.bthBatchId = getPadded( bthBatchId, bthBatchIdFilter );
  }

  /**
  * Sets the BthParameter1 field.
  *
  * @param bthParameter1
  */
  public void setBthParameter1( final String bthParameter1 ) {
    this.bthParameter1 = getPadded( bthParameter1, bthParameter1Filter );
  }

  /**
  * Sets the BthParameter2 field.
  *
  * @param bthParameter2
  */
  public void setBthParameter2( final String bthParameter2 ) {
    this.bthParameter2 = getPadded( bthParameter2, bthParameter2Filter );
  }

  /**
  * Sets the BthParameter3 field.
  *
  * @param bthParameter3
  */
  public void setBthParameter3( final String bthParameter3 ) {
    this.bthParameter3 = getPadded( bthParameter3, bthParameter3Filter );
  }

  /**
  * Sets the BthParameter4 field.
  *
  * @param bthParameter4
  */
  public void setBthParameter4( final String bthParameter4 ) {
    this.bthParameter4 = getPadded( bthParameter4, bthParameter4Filter );
  }

  /**
  * Sets the BthParameter5 field.
  *
  * @param bthParameter5
  */
  public void setBthParameter5( final String bthParameter5 ) {
    this.bthParameter5 = getPadded( bthParameter5, bthParameter5Filter );
  }

  /**
  * Sets the BthParameter6 field.
  *
  * @param bthParameter6
  */
  public void setBthParameter6( final String bthParameter6 ) {
    this.bthParameter6 = getPadded( bthParameter6, bthParameter6Filter );
  }

  /**
  * Sets the BthParameter7 field.
  *
  * @param bthParameter7
  */
  public void setBthParameter7( final String bthParameter7 ) {
    this.bthParameter7 = getPadded( bthParameter7, bthParameter7Filter );
  }

  /**
  * Sets the BthParameter8 field.
  *
  * @param bthParameter8
  */
  public void setBthParameter8( final String bthParameter8 ) {
    this.bthParameter8 = getPadded( bthParameter8, bthParameter8Filter );
  }

  /**
  * Sets the BthParameter9 field.
  *
  * @param bthParameter9
  */
  public void setBthParameter9( final String bthParameter9 ) {
    this.bthParameter9 = getPadded( bthParameter9, bthParameter9Filter );
  }

  /**
  * Sets the BthParameter10 field.
  *
  * @param bthParameter10
  */
  public void setBthParameter10( final String bthParameter10 ) {
    this.bthParameter10 = getPadded( bthParameter10, bthParameter10Filter );
  }

  /**
  * Sets the BthParameter11 field.
  *
  * @param bthParameter11
  */
  public void setBthParameter11( final String bthParameter11 ) {
    this.bthParameter11 = getPadded( bthParameter11, bthParameter11Filter );
  }

  /**
  * Sets the BthParameter12 field.
  *
  * @param bthParameter12
  */
  public void setBthParameter12( final String bthParameter12 ) {
    this.bthParameter12 = getPadded( bthParameter12, bthParameter12Filter );
  }

  /**
  * Sets the BthParameter13 field.
  *
  * @param bthParameter13
  */
  public void setBthParameter13( final String bthParameter13 ) {
    this.bthParameter13 = getPadded( bthParameter13, bthParameter13Filter );
  }

  /**
  * Sets the BthParameter14 field.
  *
  * @param bthParameter14
  */
  public void setBthParameter14( final String bthParameter14 ) {
    this.bthParameter14 = getPadded( bthParameter14, bthParameter14Filter );
  }

  /**
  * Sets the BthParameter15 field.
  *
  * @param bthParameter15
  */
  public void setBthParameter15( final String bthParameter15 ) {
    this.bthParameter15 = getPadded( bthParameter15, bthParameter15Filter );
  }

  /**
  * Sets the BthStartTime field.
  *
  * @param bthStartTime
  */
  public void setBthStartTime( final DateTime bthStartTime ) {
    this.bthStartTime = ( bthStartTime != null )
      ? new DateTime( bthStartTime ) : null;
  }

  /**
  * Sets the BthEndTime field.
  *
  * @param bthEndTime
  */
  public void setBthEndTime( final DateTime bthEndTime ) {
    this.bthEndTime = ( bthEndTime != null ) ? new DateTime( bthEndTime ) : null;
  }

  /**
  * Sets the BthLocationId field.
  *
  * @param bthLocationId
  */
  public void setBthLocationId( final Integer bthLocationId ) {
    this.bthLocationId = bthLocationId;
  }

  /**
  * Sets the BthRecsProcessed field.
  *
  * @param bthRecsProcessed
  */
  public void setBthRecsProcessed( final Integer bthRecsProcessed ) {
    this.bthRecsProcessed = bthRecsProcessed;
  }

  /**
  * Sets the BthRecsRejected field.
  *
  * @param bthRecsRejected
  */
  public void setBthRecsRejected( final Integer bthRecsRejected ) {
    this.bthRecsRejected = bthRecsRejected;
  }

  /**
  * Sets the BthBatchEndStat field.
  *
  * @param bthBatchEndStat
  */
  public void setBthBatchEndStat( final String bthBatchEndStat ) {
    this.bthBatchEndStat = getPadded( bthBatchEndStat, bthBatchEndStatFilter );
  }

  /**
  * Sets the BthStatusValue field.
  *
  * @param bthStatusValue
  */
  public void setBthStatusValue( final Short bthStatusValue ) {
    this.bthStatusValue = bthStatusValue;
  }

  /**
  * Sets the BthStatusValue field.
  *
  * @param bthStatusValue
  */
  public void setBthStatusValue( final int bthStatusValue ) {
    this.bthStatusValue = Short.valueOf( (short) bthStatusValue );
  }

  /**
  * Sets the BthStatusClass field.
  *
  * @param bthStatusClass
  */
  public void setBthStatusClass( final Short bthStatusClass ) {
    this.bthStatusClass = bthStatusClass;
  }

  /**
  * Sets the BthStatusClass field.
  *
  * @param bthStatusClass
  */
  public void setBthStatusClass( final int bthStatusClass ) {
    this.bthStatusClass = Short.valueOf( (short) bthStatusClass );
  }

  /**
  * Sets the BthIsamValue field.
  *
  * @param bthIsamValue
  */
  public void setBthIsamValue( final Short bthIsamValue ) {
    this.bthIsamValue = bthIsamValue;
  }

  /**
  * Sets the BthIsamValue field.
  *
  * @param bthIsamValue
  */
  public void setBthIsamValue( final int bthIsamValue ) {
    this.bthIsamValue = Short.valueOf( (short) bthIsamValue );
  }

  /**
  * Sets the BthErrorMess field.
  *
  * @param bthErrorMess
  */
  public void setBthErrorMess( final String bthErrorMess ) {
    this.bthErrorMess = getPadded( bthErrorMess, bthErrorMessFilter );
  }

  /**
  * Sets the BthAnalysis1 field.
  *
  * @param bthAnalysis1
  */
  public void setBthAnalysis1( final String bthAnalysis1 ) {
    this.bthAnalysis1 = getPadded( bthAnalysis1, bthAnalysis1Filter );
  }

  /**
  * Sets the BthAnalysis2 field.
  *
  * @param bthAnalysis2
  */
  public void setBthAnalysis2( final String bthAnalysis2 ) {
    this.bthAnalysis2 = getPadded( bthAnalysis2, bthAnalysis2Filter );
  }

  /**
  * Sets the BthAnalysis3 field.
  *
  * @param bthAnalysis3
  */
  public void setBthAnalysis3( final String bthAnalysis3 ) {
    this.bthAnalysis3 = getPadded( bthAnalysis3, bthAnalysis3Filter );
  }

  /**
  * Sets the BthAnalysis4 field.
  *
  * @param bthAnalysis4
  */
  public void setBthAnalysis4( final String bthAnalysis4 ) {
    this.bthAnalysis4 = getPadded( bthAnalysis4, bthAnalysis4Filter );
  }

  /**
  * Sets the BthAnalysis5 field.
  *
  * @param bthAnalysis5
  */
  public void setBthAnalysis5( final String bthAnalysis5 ) {
    this.bthAnalysis5 = getPadded( bthAnalysis5, bthAnalysis5Filter );
  }

  /**
  * Sets the BthBatchRunType field.
  *
  * @param bthBatchRunType
  */
  public void setBthBatchRunType( final String bthBatchRunType ) {
    this.bthBatchRunType = getPadded( bthBatchRunType, bthBatchRunTypeFilter );
  }

}
