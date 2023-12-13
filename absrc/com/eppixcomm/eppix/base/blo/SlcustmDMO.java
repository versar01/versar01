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
 * A value object to carry the data for a Slcustm.
 *
 *
 * <H3> A Slcustm is: </H3>
 *
 * <!-- indent text -->
 * <TABLE BORDER="0" CELLPADDING="0" CELLSPACING="0">
 * <TR>
 * <TD WIDTH="25">&nbsp;</TD>
 * <TD>
 *
 * CS3 table - used by Eppix to store customer details Description of the table is as found in the Oracle version of CS3.
 *
 * <!-- end indent text -->
 * </TD>
 * </TR>
 * </TABLE>
 *
 *
 * <H3> Slcustm Value Object: </H3>
 *
 * <!-- indent text -->
 * <TABLE BORDER="0" CELLPADDING="0" CELLSPACING="0">
 * <TR>
 * <TD WIDTH="25">&nbsp;</TD>
 * <TD>
 *
 * <P>
 *     This is a value object (called a Data Model Object or 'DMO').
 *     It is used to pass the data for a slcustm into and out of the BASE module.
 *     Because it's purpose is to carry data into and out of the module it is visible outside the module.
 * </P>
 * <P>
 *     This value object carries the data for one slcustm. A slcustm is:
 * CS3 table - used by Eppix to store customer details Description of the table is as found in the Oracle version of CS3.
 * </P>
 * <P>
 *     It corresponds to the business logic object Slcustm which
 *     contains all the business behaviour of a slcustm but is not visible outside the
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
 *    This value object contains fields for all the details of a slcustm, namely:
 * </P>
 *


 * <P>
 *    <U>Fields to carry the Attributes of a slcustm:</U>
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
 *   <TD ALIGN="left" VALIGN="top"><B>customer</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
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
 *       <A HREF="#getCustomer()">
 *           getCustomer
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setCustomer(java.lang.String)">
 *           setCustomer (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>alpha</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
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
 *       <A HREF="#getAlpha()">
 *           getAlpha
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setAlpha(java.lang.String)">
 *           setAlpha (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>name</B></TD>
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
 *       <A HREF="#getName()">
 *           getName
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setName(java.lang.String)">
 *           setName (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>address1</B></TD>
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
 *       <A HREF="#getAddress1()">
 *           getAddress1
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setAddress1(java.lang.String)">
 *           setAddress1 (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>address2</B></TD>
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
 *       <A HREF="#getAddress2()">
 *           getAddress2
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setAddress2(java.lang.String)">
 *           setAddress2 (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>address3</B></TD>
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
 *       <A HREF="#getAddress3()">
 *           getAddress3
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setAddress3(java.lang.String)">
 *           setAddress3 (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>address4</B></TD>
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
 *       <A HREF="#getAddress4()">
 *           getAddress4
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setAddress4(java.lang.String)">
 *           setAddress4 (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>address5</B></TD>
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
 *       <A HREF="#getAddress5()">
 *           getAddress5
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setAddress5(java.lang.String)">
 *           setAddress5 (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>creditCategory</B></TD>
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
 *       <A HREF="#getCreditCategory()">
 *           getCreditCategory
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setCreditCategory(java.lang.String)">
 *           setCreditCategory (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>exportIndicator</B></TD>
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
 *       <A HREF="#getExportIndicator()">
 *           getExportIndicator
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setExportIndicator(java.lang.String)">
 *           setExportIndicator (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>custDiscCode</B></TD>
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
 *       <A HREF="#getCustDiscCode()">
 *           getCustDiscCode
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setCustDiscCode(java.lang.String)">
 *           setCustDiscCode (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>currency</B></TD>
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
 *       <A HREF="#getCurrency()">
 *           getCurrency
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setCurrency(java.lang.String)">
 *           setCurrency (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>territory</B></TD>
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
 *       <A HREF="#getTerritory()">
 *           getTerritory
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setTerritory(java.lang.String)">
 *           setTerritory (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>klass</B></TD>
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
 *       <A HREF="#getKlass()">
 *           getKlass
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setKlass(java.lang.String)">
 *           setKlass (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>region</B></TD>
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
 *       <A HREF="#getRegion()">
 *           getRegion
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setRegion(java.lang.String)">
 *           setRegion (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>invoiceCustomer</B></TD>
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
 *       <A HREF="#getInvoiceCustomer()">
 *           getInvoiceCustomer
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setInvoiceCustomer(java.lang.String)">
 *           setInvoiceCustomer (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>statementCustomer</B></TD>
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
 *       <A HREF="#getStatementCustomer()">
 *           getStatementCustomer
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setStatementCustomer(java.lang.String)">
 *           setStatementCustomer (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>groupCustomer</B></TD>
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
 *       <A HREF="#getGroupCustomer()">
 *           getGroupCustomer
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setGroupCustomer(java.lang.String)">
 *           setGroupCustomer (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>dateLastIssue</B></TD>
 *   <TD ALIGN="left" VALIGN="top">Date</TD>
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
 *       <A HREF="#getDateLastIssue()">
 *           getDateLastIssue
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setDateLastIssue(com.cmgwds.eppix.util.Date)">
 *           setDateLastIssue (Date)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>dateCreated</B></TD>
 *   <TD ALIGN="left" VALIGN="top">Date</TD>
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
 *       <A HREF="#getDateCreated()">
 *           getDateCreated
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setDateCreated(com.cmgwds.eppix.util.Date)">
 *           setDateCreated (Date)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>analysisCodes1</B></TD>
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
 *       <A HREF="#getAnalysisCodes1()">
 *           getAnalysisCodes1
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setAnalysisCodes1(java.lang.String)">
 *           setAnalysisCodes1 (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>analysisCodes2</B></TD>
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
 *       <A HREF="#getAnalysisCodes2()">
 *           getAnalysisCodes2
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setAnalysisCodes2(java.lang.String)">
 *           setAnalysisCodes2 (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>analysisCodes3</B></TD>
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
 *       <A HREF="#getAnalysisCodes3()">
 *           getAnalysisCodes3
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setAnalysisCodes3(java.lang.String)">
 *           setAnalysisCodes3 (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>analysisCodes4</B></TD>
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
 *       <A HREF="#getAnalysisCodes4()">
 *           getAnalysisCodes4
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setAnalysisCodes4(java.lang.String)">
 *           setAnalysisCodes4 (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>analysisCodes5</B></TD>
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
 *       <A HREF="#getAnalysisCodes5()">
 *           getAnalysisCodes5
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setAnalysisCodes5(java.lang.String)">
 *           setAnalysisCodes5 (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>reminderCat</B></TD>
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
 *       <A HREF="#getReminderCat()">
 *           getReminderCat
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setReminderCat(java.lang.String)">
 *           setReminderCat (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>settlementCode</B></TD>
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
 *       <A HREF="#getSettlementCode()">
 *           getSettlementCode
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setSettlementCode(java.lang.String)">
 *           setSettlementCode (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>settDaysCode</B></TD>
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
 *       <A HREF="#getSettDaysCode()">
 *           getSettDaysCode
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setSettDaysCode(java.lang.String)">
 *           setSettDaysCode (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>priceList</B></TD>
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
 *       <A HREF="#getPriceList()">
 *           getPriceList
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setPriceList(java.lang.String)">
 *           setPriceList (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>letterCode</B></TD>
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
 *       <A HREF="#getLetterCode()">
 *           getLetterCode
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setLetterCode(java.lang.String)">
 *           setLetterCode (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>balanceFwd</B></TD>
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
 *       <A HREF="#getBalanceFwd()">
 *           getBalanceFwd
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setBalanceFwd(java.lang.String)">
 *           setBalanceFwd (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>creditLimit</B></TD>
 *   <TD ALIGN="left" VALIGN="top">BigDecimal</TD>
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
 *       <A HREF="#getCreditLimit()">
 *           getCreditLimit
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setCreditLimit(java.math.BigDecimal)">
 *           setCreditLimit (BigDecimal)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>ytdSales</B></TD>
 *   <TD ALIGN="left" VALIGN="top">BigDecimal</TD>
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
 *       <A HREF="#getYtdSales()">
 *           getYtdSales
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setYtdSales(java.math.BigDecimal)">
 *           setYtdSales (BigDecimal)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>ytdCostOfSales</B></TD>
 *   <TD ALIGN="left" VALIGN="top">BigDecimal</TD>
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
 *       <A HREF="#getYtdCostOfSales()">
 *           getYtdCostOfSales
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setYtdCostOfSales(java.math.BigDecimal)">
 *           setYtdCostOfSales (BigDecimal)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>cumulativeSales</B></TD>
 *   <TD ALIGN="left" VALIGN="top">BigDecimal</TD>
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
 *       <A HREF="#getCumulativeSales()">
 *           getCumulativeSales
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setCumulativeSales(java.math.BigDecimal)">
 *           setCumulativeSales (BigDecimal)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>orderBalance</B></TD>
 *   <TD ALIGN="left" VALIGN="top">BigDecimal</TD>
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
 *       <A HREF="#getOrderBalance()">
 *           getOrderBalance
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setOrderBalance(java.math.BigDecimal)">
 *           setOrderBalance (BigDecimal)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>salesNlCat</B></TD>
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
 *       <A HREF="#getSalesNlCat()">
 *           getSalesNlCat
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setSalesNlCat(java.lang.String)">
 *           setSalesNlCat (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>specialPrice</B></TD>
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
 *       <A HREF="#getSpecialPrice()">
 *           getSpecialPrice
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setSpecialPrice(java.lang.String)">
 *           setSpecialPrice (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>vatRegistration</B></TD>
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
 *       <A HREF="#getVatRegistration()">
 *           getVatRegistration
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setVatRegistration(java.lang.String)">
 *           setVatRegistration (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>directDebit</B></TD>
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
 *       <A HREF="#getDirectDebit()">
 *           getDirectDebit
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setDirectDebit(java.lang.String)">
 *           setDirectDebit (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>invoicesPrinted</B></TD>
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
 *       <A HREF="#getInvoicesPrinted()">
 *           getInvoicesPrinted
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setInvoicesPrinted(java.lang.String)">
 *           setInvoicesPrinted (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>consolidatedInv</B></TD>
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
 *       <A HREF="#getConsolidatedInv()">
 *           getConsolidatedInv
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setConsolidatedInv(java.lang.String)">
 *           setConsolidatedInv (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>commentOnlyInv</B></TD>
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
 *       <A HREF="#getCommentOnlyInv()">
 *           getCommentOnlyInv
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setCommentOnlyInv(java.lang.String)">
 *           setCommentOnlyInv (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>bankAccountNo</B></TD>
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
 *       <A HREF="#getBankAccountNo()">
 *           getBankAccountNo
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setBankAccountNo(java.lang.String)">
 *           setBankAccountNo (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>bankSortCode</B></TD>
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
 *       <A HREF="#getBankSortCode()">
 *           getBankSortCode
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setBankSortCode(java.lang.String)">
 *           setBankSortCode (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>bankName</B></TD>
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
 *       <A HREF="#getBankName()">
 *           getBankName
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setBankName(java.lang.String)">
 *           setBankName (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>bankAddress1</B></TD>
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
 *       <A HREF="#getBankAddress1()">
 *           getBankAddress1
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setBankAddress1(java.lang.String)">
 *           setBankAddress1 (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>bankAddress2</B></TD>
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
 *       <A HREF="#getBankAddress2()">
 *           getBankAddress2
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setBankAddress2(java.lang.String)">
 *           setBankAddress2 (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>bankAddress3</B></TD>
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
 *       <A HREF="#getBankAddress3()">
 *           getBankAddress3
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setBankAddress3(java.lang.String)">
 *           setBankAddress3 (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>bankAddress4</B></TD>
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
 *       <A HREF="#getBankAddress4()">
 *           getBankAddress4
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setBankAddress4(java.lang.String)">
 *           setBankAddress4 (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>analysisCode6</B></TD>
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
 *       <A HREF="#getAnalysisCode6()">
 *           getAnalysisCode6
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setAnalysisCode6(java.lang.String)">
 *           setAnalysisCode6 (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>produceStatements</B></TD>
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
 *       <A HREF="#getProduceStatements()">
 *           getProduceStatements
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setProduceStatements(java.lang.String)">
 *           setProduceStatements (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>ediCustomer</B></TD>
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
 *       <A HREF="#getEdiCustomer()">
 *           getEdiCustomer
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setEdiCustomer(java.lang.String)">
 *           setEdiCustomer (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>vatType</B></TD>
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
 *       <A HREF="#getVatType()">
 *           getVatType
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setVatType(java.lang.String)">
 *           setVatType (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>language</B></TD>
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
 *       <A HREF="#getLanguage()">
 *           getLanguage
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setLanguage(java.lang.String)">
 *           setLanguage (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>deliveryMethod</B></TD>
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
 *       <A HREF="#getDeliveryMethod()">
 *           getDeliveryMethod
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setDeliveryMethod(java.lang.String)">
 *           setDeliveryMethod (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>carrier</B></TD>
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
 *       <A HREF="#getCarrier()">
 *           getCarrier
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setCarrier(java.lang.String)">
 *           setCarrier (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>vatRegNumber</B></TD>
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
 *       <A HREF="#getVatRegNumber()">
 *           getVatRegNumber
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setVatRegNumber(java.lang.String)">
 *           setVatRegNumber (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>vatExeNumber</B></TD>
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
 *       <A HREF="#getVatExeNumber()">
 *           getVatExeNumber
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setVatExeNumber(java.lang.String)">
 *           setVatExeNumber (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>paydays1</B></TD>
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
 *       <A HREF="#getPaydays1()">
 *           getPaydays1
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setPaydays1(java.lang.String)">
 *           setPaydays1 (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>paydays2</B></TD>
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
 *       <A HREF="#getPaydays2()">
 *           getPaydays2
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setPaydays2(java.lang.String)">
 *           setPaydays2 (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>paydays3</B></TD>
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
 *       <A HREF="#getPaydays3()">
 *           getPaydays3
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setPaydays3(java.lang.String)">
 *           setPaydays3 (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>bankBranchCode</B></TD>
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
 *       <A HREF="#getBankBranchCode()">
 *           getBankBranchCode
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setBankBranchCode(java.lang.String)">
 *           setBankBranchCode (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>printCpWithStat</B></TD>
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
 *       <A HREF="#getPrintCpWithStat()">
 *           getPrintCpWithStat
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setPrintCpWithStat(java.lang.String)">
 *           setPrintCpWithStat (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>paymentMethod</B></TD>
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
 *       <A HREF="#getPaymentMethod()">
 *           getPaymentMethod
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setPaymentMethod(java.lang.String)">
 *           setPaymentMethod (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>customerClass</B></TD>
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
 *       <A HREF="#getCustomerClass()">
 *           getCustomerClass
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setCustomerClass(java.lang.String)">
 *           setCustomerClass (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>salesType</B></TD>
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
 *       <A HREF="#getSalesType()">
 *           getSalesType
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setSalesType(java.lang.String)">
 *           setSalesType (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>cpLowerValue</B></TD>
 *   <TD ALIGN="left" VALIGN="top">BigDecimal</TD>
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
 *       <A HREF="#getCpLowerValue()">
 *           getCpLowerValue
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setCpLowerValue(java.math.BigDecimal)">
 *           setCpLowerValue (BigDecimal)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>address6</B></TD>
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
 *       <A HREF="#getAddress6()">
 *           getAddress6
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setAddress6(java.lang.String)">
 *           setAddress6 (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>fax</B></TD>
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
 *       <A HREF="#getFax()">
 *           getFax
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setFax(java.lang.String)">
 *           setFax (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>telex</B></TD>
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
 *       <A HREF="#getTelex()">
 *           getTelex
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setTelex(java.lang.String)">
 *           setTelex (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>btx</B></TD>
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
 *       <A HREF="#getBtx()">
 *           getBtx
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setBtx(java.lang.String)">
 *           setBtx (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>cpCharge</B></TD>
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
 *       <A HREF="#getCpCharge()">
 *           getCpCharge
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setCpCharge(java.lang.String)">
 *           setCpCharge (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>controlDigit</B></TD>
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
 *       <A HREF="#getControlDigit()">
 *           getControlDigit
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setControlDigit(java.lang.String)">
 *           setControlDigit (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>payer</B></TD>
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
 *       <A HREF="#getPayer()">
 *           getPayer
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setPayer(java.lang.String)">
 *           setPayer (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>responsibility</B></TD>
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
 *       <A HREF="#getResponsibility()">
 *           getResponsibility
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setResponsibility(java.lang.String)">
 *           setResponsibility (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>despatchHeld</B></TD>
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
 *       <A HREF="#getDespatchHeld()">
 *           getDespatchHeld
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setDespatchHeld(java.lang.String)">
 *           setDespatchHeld (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>creditController</B></TD>
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
 *       <A HREF="#getCreditController()">
 *           getCreditController
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setCreditController(java.lang.String)">
 *           setCreditController (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>reminderLetters</B></TD>
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
 *       <A HREF="#getReminderLetters()">
 *           getReminderLetters
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setReminderLetters(java.lang.String)">
 *           setReminderLetters (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>severityDays1</B></TD>
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
 *       <A HREF="#getSeverityDays1()">
 *           getSeverityDays1
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setSeverityDays1(java.lang.Integer)">
 *           setSeverityDays1 (Integer)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>severityDays2</B></TD>
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
 *       <A HREF="#getSeverityDays2()">
 *           getSeverityDays2
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setSeverityDays2(java.lang.Integer)">
 *           setSeverityDays2 (Integer)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>severityDays3</B></TD>
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
 *       <A HREF="#getSeverityDays3()">
 *           getSeverityDays3
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setSeverityDays3(java.lang.Integer)">
 *           setSeverityDays3 (Integer)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>severityDays4</B></TD>
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
 *       <A HREF="#getSeverityDays4()">
 *           getSeverityDays4
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setSeverityDays4(java.lang.Integer)">
 *           setSeverityDays4 (Integer)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>severityDays5</B></TD>
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
 *       <A HREF="#getSeverityDays5()">
 *           getSeverityDays5
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setSeverityDays5(java.lang.Integer)">
 *           setSeverityDays5 (Integer)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>severityDays6</B></TD>
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
 *       <A HREF="#getSeverityDays6()">
 *           getSeverityDays6
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setSeverityDays6(java.lang.Integer)">
 *           setSeverityDays6 (Integer)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>deliveryReason</B></TD>
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
 *       <A HREF="#getDeliveryReason()">
 *           getDeliveryReason
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setDeliveryReason(java.lang.String)">
 *           setDeliveryReason (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>shipperCode1</B></TD>
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
 *       <A HREF="#getShipperCode1()">
 *           getShipperCode1
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setShipperCode1(java.lang.String)">
 *           setShipperCode1 (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>shipperCode2</B></TD>
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
 *       <A HREF="#getShipperCode2()">
 *           getShipperCode2
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setShipperCode2(java.lang.String)">
 *           setShipperCode2 (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>shipperCode3</B></TD>
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
 *       <A HREF="#getShipperCode3()">
 *           getShipperCode3
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setShipperCode3(java.lang.String)">
 *           setShipperCode3 (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>shippingNoteInd</B></TD>
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
 *       <A HREF="#getShippingNoteInd()">
 *           getShippingNoteInd
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setShippingNoteInd(java.lang.String)">
 *           setShippingNoteInd (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>accountType</B></TD>
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
 *       <A HREF="#getAccountType()">
 *           getAccountType
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setAccountType(java.lang.String)">
 *           setAccountType (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>adminFee</B></TD>
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
 *       <A HREF="#getAdminFee()">
 *           getAdminFee
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setAdminFee(java.lang.String)">
 *           setAdminFee (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>intrestRate</B></TD>
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
 *       <A HREF="#getIntrestRate()">
 *           getIntrestRate
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setIntrestRate(java.lang.String)">
 *           setIntrestRate (String)
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


 * @see Slcustm
 *
 * @author
 * @version $Revision: $
 *
 * @since $jdk$
 */
public class SlcustmDMO
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
      FIELD_TYPE_STRING /* std public attribute: customer  */,
      FIELD_TYPE_STRING /* std public attribute: alpha  */,
      FIELD_TYPE_STRING /* std public attribute: name  */,
      FIELD_TYPE_STRING /* std public attribute: address1  */,
      FIELD_TYPE_STRING /* std public attribute: address2  */,
      FIELD_TYPE_STRING /* std public attribute: address3  */,
      FIELD_TYPE_STRING /* std public attribute: address4  */,
      FIELD_TYPE_STRING /* std public attribute: address5  */,
      FIELD_TYPE_STRING /* std public attribute: creditCategory  */,
      FIELD_TYPE_STRING /* std public attribute: exportIndicator  */,
      FIELD_TYPE_STRING /* std public attribute: custDiscCode  */,
      FIELD_TYPE_STRING /* std public attribute: currency  */,
      FIELD_TYPE_STRING /* std public attribute: territory  */,
      FIELD_TYPE_STRING /* std public attribute: klass  */,
      FIELD_TYPE_STRING /* std public attribute: region  */,
      FIELD_TYPE_STRING /* std public attribute: invoiceCustomer  */,
      FIELD_TYPE_STRING /* std public attribute: statementCustomer  */,
      FIELD_TYPE_STRING /* std public attribute: groupCustomer  */,
      FIELD_TYPE_DATEONLY /* std public attribute: dateLastIssue  */,
      FIELD_TYPE_DATEONLY /* std public attribute: dateCreated  */,
      FIELD_TYPE_STRING /* std public attribute: analysisCodes1  */,
      FIELD_TYPE_STRING /* std public attribute: analysisCodes2  */,
      FIELD_TYPE_STRING /* std public attribute: analysisCodes3  */,
      FIELD_TYPE_STRING /* std public attribute: analysisCodes4  */,
      FIELD_TYPE_STRING /* std public attribute: analysisCodes5  */,
      FIELD_TYPE_STRING /* std public attribute: reminderCat  */,
      FIELD_TYPE_STRING /* std public attribute: settlementCode  */,
      FIELD_TYPE_STRING /* std public attribute: settDaysCode  */,
      FIELD_TYPE_STRING /* std public attribute: priceList  */,
      FIELD_TYPE_STRING /* std public attribute: letterCode  */,
      FIELD_TYPE_STRING /* std public attribute: balanceFwd  */,
      FIELD_TYPE_BIGDECIMAL /* std public attribute: creditLimit  */,
      FIELD_TYPE_BIGDECIMAL /* std public attribute: ytdSales  */,
      FIELD_TYPE_BIGDECIMAL /* std public attribute: ytdCostOfSales  */,
      FIELD_TYPE_BIGDECIMAL /* std public attribute: cumulativeSales  */,
      FIELD_TYPE_BIGDECIMAL /* std public attribute: orderBalance  */,
      FIELD_TYPE_STRING /* std public attribute: salesNlCat  */,
      FIELD_TYPE_STRING /* std public attribute: specialPrice  */,
      FIELD_TYPE_STRING /* std public attribute: vatRegistration  */,
      FIELD_TYPE_STRING /* std public attribute: directDebit  */,
      FIELD_TYPE_STRING /* std public attribute: invoicesPrinted  */,
      FIELD_TYPE_STRING /* std public attribute: consolidatedInv  */,
      FIELD_TYPE_STRING /* std public attribute: commentOnlyInv  */,
      FIELD_TYPE_STRING /* std public attribute: bankAccountNo  */,
      FIELD_TYPE_STRING /* std public attribute: bankSortCode  */,
      FIELD_TYPE_STRING /* std public attribute: bankName  */,
      FIELD_TYPE_STRING /* std public attribute: bankAddress1  */,
      FIELD_TYPE_STRING /* std public attribute: bankAddress2  */,
      FIELD_TYPE_STRING /* std public attribute: bankAddress3  */,
      FIELD_TYPE_STRING /* std public attribute: bankAddress4  */,
      FIELD_TYPE_STRING /* std public attribute: analysisCode6  */,
      FIELD_TYPE_STRING /* std public attribute: produceStatements  */,
      FIELD_TYPE_STRING /* std public attribute: ediCustomer  */,
      FIELD_TYPE_STRING /* std public attribute: vatType  */,
      FIELD_TYPE_STRING /* std public attribute: language  */,
      FIELD_TYPE_STRING /* std public attribute: deliveryMethod  */,
      FIELD_TYPE_STRING /* std public attribute: carrier  */,
      FIELD_TYPE_STRING /* std public attribute: vatRegNumber  */,
      FIELD_TYPE_STRING /* std public attribute: vatExeNumber  */,
      FIELD_TYPE_STRING /* std public attribute: paydays1  */,
      FIELD_TYPE_STRING /* std public attribute: paydays2  */,
      FIELD_TYPE_STRING /* std public attribute: paydays3  */,
      FIELD_TYPE_STRING /* std public attribute: bankBranchCode  */,
      FIELD_TYPE_STRING /* std public attribute: printCpWithStat  */,
      FIELD_TYPE_STRING /* std public attribute: paymentMethod  */,
      FIELD_TYPE_STRING /* std public attribute: customerClass  */,
      FIELD_TYPE_STRING /* std public attribute: salesType  */,
      FIELD_TYPE_BIGDECIMAL /* std public attribute: cpLowerValue  */,
      FIELD_TYPE_STRING /* std public attribute: address6  */,
      FIELD_TYPE_STRING /* std public attribute: fax  */,
      FIELD_TYPE_STRING /* std public attribute: telex  */,
      FIELD_TYPE_STRING /* std public attribute: btx  */,
      FIELD_TYPE_STRING /* std public attribute: cpCharge  */,
      FIELD_TYPE_STRING /* std public attribute: controlDigit  */,
      FIELD_TYPE_STRING /* std public attribute: payer  */,
      FIELD_TYPE_STRING /* std public attribute: responsibility  */,
      FIELD_TYPE_STRING /* std public attribute: despatchHeld  */,
      FIELD_TYPE_STRING /* std public attribute: creditController  */,
      FIELD_TYPE_STRING /* std public attribute: reminderLetters  */,
      FIELD_TYPE_INTEGER /* std public attribute: severityDays1  */,
      FIELD_TYPE_INTEGER /* std public attribute: severityDays2  */,
      FIELD_TYPE_INTEGER /* std public attribute: severityDays3  */,
      FIELD_TYPE_INTEGER /* std public attribute: severityDays4  */,
      FIELD_TYPE_INTEGER /* std public attribute: severityDays5  */,
      FIELD_TYPE_INTEGER /* std public attribute: severityDays6  */,
      FIELD_TYPE_STRING /* std public attribute: deliveryReason  */,
      FIELD_TYPE_STRING /* std public attribute: shipperCode1  */,
      FIELD_TYPE_STRING /* std public attribute: shipperCode2  */,
      FIELD_TYPE_STRING /* std public attribute: shipperCode3  */,
      FIELD_TYPE_STRING /* std public attribute: shippingNoteInd  */,
      FIELD_TYPE_STRING /* std public attribute: accountType  */,
      FIELD_TYPE_STRING /* std public attribute: adminFee  */,
      FIELD_TYPE_STRING /* std public attribute: intrestRate  */
    };
  
  private final int[] fieldSizes = new int[] {
		  customerSize,
		  alphaSize,
		  nameSize,
		  address1Size,
		  address2Size,
		  address3Size,
		  address4Size,
		  address5Size,
		  creditCategorySize,
		  exportIndicatorSize,
		  custDiscCodeSize,
		  currencySize,
		  territorySize,
		  klassSize,
		  regionSize,
		  invoiceCustomerSize,
		  statementCustomerSize,
		  groupCustomerSize,
		  0,
		  0,
		  analysisCodes1Size,
		  analysisCodes2Size,
		  analysisCodes3Size,
		  analysisCodes4Size,
		  analysisCodes5Size,
		  reminderCatSize,
		  settlementCodeSize,
		  settDaysCodeSize,
		  priceListSize,
		  letterCodeSize,
		  balanceFwdSize,
		  0,
		  0,
		  0,
		  0,
		  0,
		  salesNlCatSize,
		  specialPriceSize,
		  vatRegistrationSize,
		  directDebitSize,
		  invoicesPrintedSize,
		  consolidatedInvSize,
		  commentOnlyInvSize,
		  bankAccountNoSize,
		  bankSortCodeSize,
		  bankNameSize,
		  bankAddress1Size,
		  bankAddress2Size,
		  bankAddress3Size,
		  bankAddress4Size,
		  analysisCode6Size,
		  produceStatementsSize,
		  ediCustomerSize,
		  vatTypeSize,
		  languageSize,
		  deliveryMethodSize,
		  carrierSize,
		  vatRegNumberSize,
		  vatExeNumberSize,
		  paydays1Size,
		  paydays2Size,
		  paydays3Size,
		  bankBranchCodeSize,
		  printCpWithStatSize,
		  paymentMethodSize,
		  customerClassSize,
		  salesTypeSize,
		  0,
		  address6Size,
		  faxSize,
		  telexSize,
		  btxSize,
		  cpChargeSize,
		  controlDigitSize,
		  payerSize,
		  responsibilitySize,
		  despatchHeldSize,
		  creditControllerSize,
		  reminderLettersSize,
		  0,
		  0,
		  0,
		  0,
		  0,
		  0,
		  deliveryReasonSize,
		  shipperCode1Size,
		  shipperCode2Size,
		  shipperCode3Size,
		  shippingNoteIndSize,
		  accountTypeSize,
		  adminFeeSize,
		  intrestRateSize
  };
      

  public int[] fieldSizes() {
  	return fieldSizes;
  }  

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int customerFilter = 0; // filter index
  private static final int customerSize = 8; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int alphaFilter = 1; // filter index
  private static final int alphaSize = 8; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int nameFilter = 2; // filter index
  private static final int nameSize = 32; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int address1Filter = 3; // filter index
  private static final int address1Size = 32; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int address2Filter = 4; // filter index
  private static final int address2Size = 32; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int address3Filter = 5; // filter index
  private static final int address3Size = 32; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int address4Filter = 6; // filter index
  private static final int address4Size = 32; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int address5Filter = 7; // filter index
  private static final int address5Size = 32; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int creditCategoryFilter = 8; // filter index
  private static final int creditCategorySize = 1; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int exportIndicatorFilter = 9; // filter index
  private static final int exportIndicatorSize = 1; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int custDiscCodeFilter = 10; // filter index
  private static final int custDiscCodeSize = 4; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int currencyFilter = 11; // filter index
  private static final int currencySize = 3; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int territoryFilter = 12; // filter index
  private static final int territorySize = 6; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int klassFilter = 13; // filter index
  private static final int klassSize = 6; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int regionFilter = 14; // filter index
  private static final int regionSize = 6; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int invoiceCustomerFilter = 15; // filter index
  private static final int invoiceCustomerSize = 8; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int statementCustomerFilter = 16; // filter index
  private static final int statementCustomerSize = 8; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int groupCustomerFilter = 17; // filter index
  private static final int groupCustomerSize = 8; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int dateLastIssueFilter = 18; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int dateCreatedFilter = 19; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int analysisCodes1Filter = 20; // filter index
  private static final int analysisCodes1Size = 10; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int analysisCodes2Filter = 21; // filter index
  private static final int analysisCodes2Size = 10; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int analysisCodes3Filter = 22; // filter index
  private static final int analysisCodes3Size = 10; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int analysisCodes4Filter = 23; // filter index
  private static final int analysisCodes4Size = 10; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int analysisCodes5Filter = 24; // filter index
  private static final int analysisCodes5Size = 10; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int reminderCatFilter = 25; // filter index
  private static final int reminderCatSize = 3; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int settlementCodeFilter = 26; // filter index
  private static final int settlementCodeSize = 2; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int settDaysCodeFilter = 27; // filter index
  private static final int settDaysCodeSize = 1; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int priceListFilter = 28; // filter index
  private static final int priceListSize = 3; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int letterCodeFilter = 29; // filter index
  private static final int letterCodeSize = 3; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int balanceFwdFilter = 30; // filter index
  private static final int balanceFwdSize = 1; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int creditLimitFilter = 31; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int ytdSalesFilter = 32; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int ytdCostOfSalesFilter = 33; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int cumulativeSalesFilter = 34; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int orderBalanceFilter = 35; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int salesNlCatFilter = 36; // filter index
  private static final int salesNlCatSize = 3; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int specialPriceFilter = 37; // filter index
  private static final int specialPriceSize = 3; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int vatRegistrationFilter = 38; // filter index
  private static final int vatRegistrationSize = 14; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int directDebitFilter = 39; // filter index
  private static final int directDebitSize = 1; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int invoicesPrintedFilter = 40; // filter index
  private static final int invoicesPrintedSize = 1; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int consolidatedInvFilter = 41; // filter index
  private static final int consolidatedInvSize = 1; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int commentOnlyInvFilter = 42; // filter index
  private static final int commentOnlyInvSize = 1; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int bankAccountNoFilter = 43; // filter index
  private static final int bankAccountNoSize = 20; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int bankSortCodeFilter = 44; // filter index
  private static final int bankSortCodeSize = 8; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int bankNameFilter = 45; // filter index
  private static final int bankNameSize = 20; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int bankAddress1Filter = 46; // filter index
  private static final int bankAddress1Size = 30; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int bankAddress2Filter = 47; // filter index
  private static final int bankAddress2Size = 30; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int bankAddress3Filter = 48; // filter index
  private static final int bankAddress3Size = 30; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int bankAddress4Filter = 49; // filter index
  private static final int bankAddress4Size = 30; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int analysisCode6Filter = 50; // filter index
  private static final int analysisCode6Size = 10; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int produceStatementsFilter = 51; // filter index
  private static final int produceStatementsSize = 1; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int ediCustomerFilter = 52; // filter index
  private static final int ediCustomerSize = 1; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int vatTypeFilter = 53; // filter index
  private static final int vatTypeSize = 10; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int languageFilter = 54; // filter index
  private static final int languageSize = 10; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int deliveryMethodFilter = 55; // filter index
  private static final int deliveryMethodSize = 10; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int carrierFilter = 56; // filter index
  private static final int carrierSize = 10; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int vatRegNumberFilter = 57; // filter index
  private static final int vatRegNumberSize = 16; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int vatExeNumberFilter = 58; // filter index
  private static final int vatExeNumberSize = 16; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int paydays1Filter = 59; // filter index
  private static final int paydays1Size = 2; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int paydays2Filter = 60; // filter index
  private static final int paydays2Size = 2; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int paydays3Filter = 61; // filter index
  private static final int paydays3Size = 2; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int bankBranchCodeFilter = 62; // filter index
  private static final int bankBranchCodeSize = 8; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int printCpWithStatFilter = 63; // filter index
  private static final int printCpWithStatSize = 1; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int paymentMethodFilter = 64; // filter index
  private static final int paymentMethodSize = 2; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int customerClassFilter = 65; // filter index
  private static final int customerClassSize = 8; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int salesTypeFilter = 66; // filter index
  private static final int salesTypeSize = 2; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int cpLowerValueFilter = 67; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int address6Filter = 68; // filter index
  private static final int address6Size = 32; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int faxFilter = 69; // filter index
  private static final int faxSize = 30; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int telexFilter = 70; // filter index
  private static final int telexSize = 30; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int btxFilter = 71; // filter index
  private static final int btxSize = 30; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int cpChargeFilter = 72; // filter index
  private static final int cpChargeSize = 1; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int controlDigitFilter = 73; // filter index
  private static final int controlDigitSize = 2; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int payerFilter = 74; // filter index
  private static final int payerSize = 10; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int responsibilityFilter = 75; // filter index
  private static final int responsibilitySize = 10; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int despatchHeldFilter = 76; // filter index
  private static final int despatchHeldSize = 1; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int creditControllerFilter = 77; // filter index
  private static final int creditControllerSize = 3; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int reminderLettersFilter = 78; // filter index
  private static final int reminderLettersSize = 1; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int severityDays1Filter = 79; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int severityDays2Filter = 80; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int severityDays3Filter = 81; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int severityDays4Filter = 82; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int severityDays5Filter = 83; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int severityDays6Filter = 84; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int deliveryReasonFilter = 85; // filter index
  private static final int deliveryReasonSize = 10; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int shipperCode1Filter = 86; // filter index
  private static final int shipperCode1Size = 10; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int shipperCode2Filter = 87; // filter index
  private static final int shipperCode2Size = 10; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int shipperCode3Filter = 88; // filter index
  private static final int shipperCode3Size = 10; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int shippingNoteIndFilter = 89; // filter index
  private static final int shippingNoteIndSize = 1; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int accountTypeFilter = 90; // filter index
  private static final int accountTypeSize = 3; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int adminFeeFilter = 91; // filter index
  private static final int adminFeeSize = 20; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int intrestRateFilter = 92; // filter index
  private static final int intrestRateSize = 20; // field size

  //~ Instance variables /////////////////////////////////////////////////////

  private BigDecimal cpLowerValue; // Loaded from Schema
  private BigDecimal creditLimit; // Loaded from Schema
  private BigDecimal cumulativeSales; // Loaded from Schema
  private BigDecimal orderBalance; // Loaded from Schema
  private BigDecimal ytdCostOfSales; // Loaded from Schema
  private BigDecimal ytdSales; // Loaded from Schema
  private Date dateCreated; // Loaded from Schema
  private Date dateLastIssue; // Loaded from Schema
  private Integer severityDays1; // Loaded from Schema
  private Integer severityDays2; // Loaded from Schema
  private Integer severityDays3; // Loaded from Schema
  private Integer severityDays4; // Loaded from Schema
  private Integer severityDays5; // Loaded from Schema
  private Integer severityDays6; // Loaded from Schema
  private String accountType; // Loaded from Schema
  private String address1; // Loaded from Schema
  private String address2; // Loaded from Schema
  private String address3; // Loaded from Schema
  private String address4; // Loaded from Schema
  private String address5; // Loaded from Schema
  private String address6; // Loaded from Schema
  private String adminFee; // Loaded from Schema
  private String alpha; // Loaded from Schema
  private String analysisCode6; // Loaded from Schema
  private String analysisCodes1; // Loaded from Schema
  private String analysisCodes2; // Loaded from Schema
  private String analysisCodes3; // Loaded from Schema
  private String analysisCodes4; // Loaded from Schema
  private String analysisCodes5; // Loaded from Schema
  private String balanceFwd; // Loaded from Schema
  private String bankAccountNo; // Loaded from Schema
  private String bankAddress1; // Loaded from Schema
  private String bankAddress2; // Loaded from Schema
  private String bankAddress3; // Loaded from Schema
  private String bankAddress4; // Loaded from Schema
  private String bankBranchCode; // Loaded from Schema
  private String bankName; // Loaded from Schema
  private String bankSortCode; // Loaded from Schema
  private String btx; // Loaded from Schema
  private String carrier; // Loaded from Schema
  private String commentOnlyInv; // Loaded from Schema
  private String consolidatedInv; // Loaded from Schema
  private String controlDigit; // Loaded from Schema
  private String cpCharge; // Loaded from Schema
  private String creditCategory; // Loaded from Schema
  private String creditController; // Loaded from Schema
  private String currency; // Loaded from Schema
  private String custDiscCode; // Loaded from Schema

  //---------------------
  // Field declarations
  //---------------------
  // all attributes
  private String customer; // Loaded from Schema
  private String customerClass; // Loaded from Schema
  private String deliveryMethod; // Loaded from Schema
  private String deliveryReason; // Loaded from Schema
  private String despatchHeld; // Loaded from Schema
  private String directDebit; // Loaded from Schema
  private String ediCustomer; // Loaded from Schema
  private String exportIndicator; // Loaded from Schema
  private String fax; // Loaded from Schema
  private String groupCustomer; // Loaded from Schema
  private String intrestRate; // Loaded from Schema
  private String invoiceCustomer; // Loaded from Schema
  private String invoicesPrinted; // Loaded from Schema
  private String klass; // Loaded from Schema
  private String language; // Loaded from Schema
  private String letterCode; // Loaded from Schema
  private String name; // Loaded from Schema
  private String paydays1; // Loaded from Schema
  private String paydays2; // Loaded from Schema
  private String paydays3; // Loaded from Schema
  private String payer; // Loaded from Schema
  private String paymentMethod; // Loaded from Schema
  private String priceList; // Loaded from Schema
  private String printCpWithStat; // Loaded from Schema
  private String produceStatements; // Loaded from Schema
  private String region; // Loaded from Schema
  private String reminderCat; // Loaded from Schema
  private String reminderLetters; // Loaded from Schema
  private String responsibility; // Loaded from Schema
  private String salesNlCat; // Loaded from Schema
  private String salesType; // Loaded from Schema
  private String settDaysCode; // Loaded from Schema
  private String settlementCode; // Loaded from Schema
  private String shipperCode1; // Loaded from Schema
  private String shipperCode2; // Loaded from Schema
  private String shipperCode3; // Loaded from Schema
  private String shippingNoteInd; // Loaded from Schema
  private String specialPrice; // Loaded from Schema
  private String statementCustomer; // Loaded from Schema
  private String telex; // Loaded from Schema
  private String territory; // Loaded from Schema
  private String vatExeNumber; // Loaded from Schema
  private String vatRegNumber; // Loaded from Schema
  private String vatRegistration; // Loaded from Schema
  private String vatType; // Loaded from Schema

  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new SlcustmDMO object.
   */
  public SlcustmDMO(  ) {
  }

  // Constructor - taking public attributes
  /**
   * Creates a new SlcustmDMO object.
   *
   * @param customer DOCUMENT ME!
   * @param alpha DOCUMENT ME!
   * @param name DOCUMENT ME!
   * @param address1 DOCUMENT ME!
   * @param address2 DOCUMENT ME!
   * @param address3 DOCUMENT ME!
   * @param address4 DOCUMENT ME!
   * @param address5 DOCUMENT ME!
   * @param creditCategory DOCUMENT ME!
   * @param exportIndicator DOCUMENT ME!
   * @param custDiscCode DOCUMENT ME!
   * @param currency DOCUMENT ME!
   * @param territory DOCUMENT ME!
   * @param klass DOCUMENT ME!
   * @param region DOCUMENT ME!
   * @param invoiceCustomer DOCUMENT ME!
   * @param statementCustomer DOCUMENT ME!
   * @param groupCustomer DOCUMENT ME!
   * @param dateLastIssue DOCUMENT ME!
   * @param dateCreated DOCUMENT ME!
   * @param analysisCodes1 DOCUMENT ME!
   * @param analysisCodes2 DOCUMENT ME!
   * @param analysisCodes3 DOCUMENT ME!
   * @param analysisCodes4 DOCUMENT ME!
   * @param analysisCodes5 DOCUMENT ME!
   * @param reminderCat DOCUMENT ME!
   * @param settlementCode DOCUMENT ME!
   * @param settDaysCode DOCUMENT ME!
   * @param priceList DOCUMENT ME!
   * @param letterCode DOCUMENT ME!
   * @param balanceFwd DOCUMENT ME!
   * @param creditLimit DOCUMENT ME!
   * @param ytdSales DOCUMENT ME!
   * @param ytdCostOfSales DOCUMENT ME!
   * @param cumulativeSales DOCUMENT ME!
   * @param orderBalance DOCUMENT ME!
   * @param salesNlCat DOCUMENT ME!
   * @param specialPrice DOCUMENT ME!
   * @param vatRegistration DOCUMENT ME!
   * @param directDebit DOCUMENT ME!
   * @param invoicesPrinted DOCUMENT ME!
   * @param consolidatedInv DOCUMENT ME!
   * @param commentOnlyInv DOCUMENT ME!
   * @param bankAccountNo DOCUMENT ME!
   * @param bankSortCode DOCUMENT ME!
   * @param bankName DOCUMENT ME!
   * @param bankAddress1 DOCUMENT ME!
   * @param bankAddress2 DOCUMENT ME!
   * @param bankAddress3 DOCUMENT ME!
   * @param bankAddress4 DOCUMENT ME!
   * @param analysisCode6 DOCUMENT ME!
   * @param produceStatements DOCUMENT ME!
   * @param ediCustomer DOCUMENT ME!
   * @param vatType DOCUMENT ME!
   * @param language DOCUMENT ME!
   * @param deliveryMethod DOCUMENT ME!
   * @param carrier DOCUMENT ME!
   * @param vatRegNumber DOCUMENT ME!
   * @param vatExeNumber DOCUMENT ME!
   * @param paydays1 DOCUMENT ME!
   * @param paydays2 DOCUMENT ME!
   * @param paydays3 DOCUMENT ME!
   * @param bankBranchCode DOCUMENT ME!
   * @param printCpWithStat DOCUMENT ME!
   * @param paymentMethod DOCUMENT ME!
   * @param customerClass DOCUMENT ME!
   * @param salesType DOCUMENT ME!
   * @param cpLowerValue DOCUMENT ME!
   * @param address6 DOCUMENT ME!
   * @param fax DOCUMENT ME!
   * @param telex DOCUMENT ME!
   * @param btx DOCUMENT ME!
   * @param cpCharge DOCUMENT ME!
   * @param controlDigit DOCUMENT ME!
   * @param payer DOCUMENT ME!
   * @param responsibility DOCUMENT ME!
   * @param despatchHeld DOCUMENT ME!
   * @param creditController DOCUMENT ME!
   * @param reminderLetters DOCUMENT ME!
   * @param severityDays1 DOCUMENT ME!
   * @param severityDays2 DOCUMENT ME!
   * @param severityDays3 DOCUMENT ME!
   * @param severityDays4 DOCUMENT ME!
   * @param severityDays5 DOCUMENT ME!
   * @param severityDays6 DOCUMENT ME!
   * @param deliveryReason DOCUMENT ME!
   * @param shipperCode1 DOCUMENT ME!
   * @param shipperCode2 DOCUMENT ME!
   * @param shipperCode3 DOCUMENT ME!
   * @param shippingNoteInd DOCUMENT ME!
   * @param accountType DOCUMENT ME!
   * @param adminFee DOCUMENT ME!
   * @param intrestRate DOCUMENT ME!
   */
  public SlcustmDMO( 
    final String     customer,
    final String     alpha,
    final String     name,
    final String     address1,
    final String     address2,
    final String     address3,
    final String     address4,
    final String     address5,
    final String     creditCategory,
    final String     exportIndicator,
    final String     custDiscCode,
    final String     currency,
    final String     territory,
    final String     klass,
    final String     region,
    final String     invoiceCustomer,
    final String     statementCustomer,
    final String     groupCustomer,
    final Date       dateLastIssue,
    final Date       dateCreated,
    final String     analysisCodes1,
    final String     analysisCodes2,
    final String     analysisCodes3,
    final String     analysisCodes4,
    final String     analysisCodes5,
    final String     reminderCat,
    final String     settlementCode,
    final String     settDaysCode,
    final String     priceList,
    final String     letterCode,
    final String     balanceFwd,
    final BigDecimal creditLimit,
    final BigDecimal ytdSales,
    final BigDecimal ytdCostOfSales,
    final BigDecimal cumulativeSales,
    final BigDecimal orderBalance,
    final String     salesNlCat,
    final String     specialPrice,
    final String     vatRegistration,
    final String     directDebit,
    final String     invoicesPrinted,
    final String     consolidatedInv,
    final String     commentOnlyInv,
    final String     bankAccountNo,
    final String     bankSortCode,
    final String     bankName,
    final String     bankAddress1,
    final String     bankAddress2,
    final String     bankAddress3,
    final String     bankAddress4,
    final String     analysisCode6,
    final String     produceStatements,
    final String     ediCustomer,
    final String     vatType,
    final String     language,
    final String     deliveryMethod,
    final String     carrier,
    final String     vatRegNumber,
    final String     vatExeNumber,
    final String     paydays1,
    final String     paydays2,
    final String     paydays3,
    final String     bankBranchCode,
    final String     printCpWithStat,
    final String     paymentMethod,
    final String     customerClass,
    final String     salesType,
    final BigDecimal cpLowerValue,
    final String     address6,
    final String     fax,
    final String     telex,
    final String     btx,
    final String     cpCharge,
    final String     controlDigit,
    final String     payer,
    final String     responsibility,
    final String     despatchHeld,
    final String     creditController,
    final String     reminderLetters,
    final Integer    severityDays1,
    final Integer    severityDays2,
    final Integer    severityDays3,
    final Integer    severityDays4,
    final Integer    severityDays5,
    final Integer    severityDays6,
    final String     deliveryReason,
    final String     shipperCode1,
    final String     shipperCode2,
    final String     shipperCode3,
    final String     shippingNoteInd,
    final String     accountType,
    final String     adminFee,
    final String     intrestRate ) {
    this.customer = customer;

    this.alpha = alpha;

    this.name = name;

    this.address1 = address1;

    this.address2 = address2;

    this.address3 = address3;

    this.address4 = address4;

    this.address5 = address5;

    this.creditCategory = creditCategory;

    this.exportIndicator = exportIndicator;

    this.custDiscCode = custDiscCode;

    this.currency = currency;

    this.territory = territory;

    this.klass = klass;

    this.region = region;

    this.invoiceCustomer = invoiceCustomer;

    this.statementCustomer = statementCustomer;

    this.groupCustomer = groupCustomer;

    this.dateLastIssue = ( dateLastIssue != null )
      ? new Date( dateLastIssue ) : null;

    this.dateCreated = ( dateCreated != null ) ? new Date( dateCreated ) : null;

    this.analysisCodes1 = analysisCodes1;

    this.analysisCodes2 = analysisCodes2;

    this.analysisCodes3 = analysisCodes3;

    this.analysisCodes4 = analysisCodes4;

    this.analysisCodes5 = analysisCodes5;

    this.reminderCat = reminderCat;

    this.settlementCode = settlementCode;

    this.settDaysCode = settDaysCode;

    this.priceList = priceList;

    this.letterCode = letterCode;

    this.balanceFwd = balanceFwd;

    this.creditLimit = creditLimit;

    this.ytdSales = ytdSales;

    this.ytdCostOfSales = ytdCostOfSales;

    this.cumulativeSales = cumulativeSales;

    this.orderBalance = orderBalance;

    this.salesNlCat = salesNlCat;

    this.specialPrice = specialPrice;

    this.vatRegistration = vatRegistration;

    this.directDebit = directDebit;

    this.invoicesPrinted = invoicesPrinted;

    this.consolidatedInv = consolidatedInv;

    this.commentOnlyInv = commentOnlyInv;

    this.bankAccountNo = bankAccountNo;

    this.bankSortCode = bankSortCode;

    this.bankName = bankName;

    this.bankAddress1 = bankAddress1;

    this.bankAddress2 = bankAddress2;

    this.bankAddress3 = bankAddress3;

    this.bankAddress4 = bankAddress4;

    this.analysisCode6 = analysisCode6;

    this.produceStatements = produceStatements;

    this.ediCustomer = ediCustomer;

    this.vatType = vatType;

    this.language = language;

    this.deliveryMethod = deliveryMethod;

    this.carrier = carrier;

    this.vatRegNumber = vatRegNumber;

    this.vatExeNumber = vatExeNumber;

    this.paydays1 = paydays1;

    this.paydays2 = paydays2;

    this.paydays3 = paydays3;

    this.bankBranchCode = bankBranchCode;

    this.printCpWithStat = printCpWithStat;

    this.paymentMethod = paymentMethod;

    this.customerClass = customerClass;

    this.salesType = salesType;

    this.cpLowerValue = cpLowerValue;

    this.address6 = address6;

    this.fax = fax;

    this.telex = telex;

    this.btx = btx;

    this.cpCharge = cpCharge;

    this.controlDigit = controlDigit;

    this.payer = payer;

    this.responsibility = responsibility;

    this.despatchHeld = despatchHeld;

    this.creditController = creditController;

    this.reminderLetters = reminderLetters;

    this.severityDays1 = severityDays1;

    this.severityDays2 = severityDays2;

    this.severityDays3 = severityDays3;

    this.severityDays4 = severityDays4;

    this.severityDays5 = severityDays5;

    this.severityDays6 = severityDays6;

    this.deliveryReason = deliveryReason;

    this.shipperCode1 = shipperCode1;

    this.shipperCode2 = shipperCode2;

    this.shipperCode3 = shipperCode3;

    this.shippingNoteInd = shippingNoteInd;

    this.accountType = accountType;

    this.adminFee = adminFee;

    this.intrestRate = intrestRate;
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
    return new DAOArgs( 1 ).arg( ( this.customer == null ) ? null
                                                           : this.customer
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
      ( customer == null ) ? null
                           : ( ( customer.length(  ) <= customerSize )
      ? customer
      : customer.substring( 0, customerSize ) // auto trimmed to fit, if required.
       ),
      ( alpha == null ) ? null
                        : ( ( alpha.length(  ) <= alphaSize ) ? alpha
                                                              : alpha
      .substring( 0, alphaSize ) // auto trimmed to fit, if required.
       ),
      ( name == null ) ? null
                       : ( ( name.length(  ) <= nameSize ) ? name
                                                           : name
      .substring( 0, nameSize ) // auto trimmed to fit, if required.
       ),
      ( address1 == null ) ? null
                           : ( ( address1.length(  ) <= address1Size )
      ? address1
      : address1.substring( 0, address1Size ) // auto trimmed to fit, if required.
       ),
      ( address2 == null ) ? null
                           : ( ( address2.length(  ) <= address2Size )
      ? address2
      : address2.substring( 0, address2Size ) // auto trimmed to fit, if required.
       ),
      ( address3 == null ) ? null
                           : ( ( address3.length(  ) <= address3Size )
      ? address3
      : address3.substring( 0, address3Size ) // auto trimmed to fit, if required.
       ),
      ( address4 == null ) ? null
                           : ( ( address4.length(  ) <= address4Size )
      ? address4
      : address4.substring( 0, address4Size ) // auto trimmed to fit, if required.
       ),
      ( address5 == null ) ? null
                           : ( ( address5.length(  ) <= address5Size )
      ? address5
      : address5.substring( 0, address5Size ) // auto trimmed to fit, if required.
       ),
      ( creditCategory == null ) ? null
                                 : ( ( creditCategory.length(  ) <= creditCategorySize )
      ? creditCategory
      : creditCategory.substring( 0, creditCategorySize ) // auto trimmed to fit, if required.
       ),
      ( exportIndicator == null ) ? null
                                  : ( ( exportIndicator.length(  ) <= exportIndicatorSize )
      ? exportIndicator
      : exportIndicator.substring( 0, exportIndicatorSize ) // auto trimmed to fit, if required.
       ),
      ( custDiscCode == null ) ? null
                               : ( ( custDiscCode.length(  ) <= custDiscCodeSize )
      ? custDiscCode
      : custDiscCode.substring( 0, custDiscCodeSize ) // auto trimmed to fit, if required.
       ),
      ( currency == null ) ? null
                           : ( ( currency.length(  ) <= currencySize )
      ? currency
      : currency.substring( 0, currencySize ) // auto trimmed to fit, if required.
       ),
      ( territory == null ) ? null
                            : ( ( territory.length(  ) <= territorySize )
      ? territory
      : territory.substring( 0, territorySize ) // auto trimmed to fit, if required.
       ),
      ( klass == null ) ? null
                        : ( ( klass.length(  ) <= klassSize ) ? klass
                                                              : klass
      .substring( 0, klassSize ) // auto trimmed to fit, if required.
       ),
      ( region == null ) ? null
                         : ( ( region.length(  ) <= regionSize ) ? region
                                                                 : region
      .substring( 0, regionSize ) // auto trimmed to fit, if required.
       ),
      ( invoiceCustomer == null ) ? null
                                  : ( ( invoiceCustomer.length(  ) <= invoiceCustomerSize )
      ? invoiceCustomer
      : invoiceCustomer.substring( 0, invoiceCustomerSize ) // auto trimmed to fit, if required.
       ),
      ( statementCustomer == null ) ? null
                                    : ( ( statementCustomer.length(  ) <= statementCustomerSize )
      ? statementCustomer
      : statementCustomer.substring( 0, statementCustomerSize ) // auto trimmed to fit, if required.
       ),
      ( groupCustomer == null ) ? null
                                : ( ( groupCustomer.length(  ) <= groupCustomerSize )
      ? groupCustomer
      : groupCustomer.substring( 0, groupCustomerSize ) // auto trimmed to fit, if required.
       ), dateLastIssue, dateCreated,
      ( analysisCodes1 == null ) ? null
                                 : ( ( analysisCodes1.length(  ) <= analysisCodes1Size )
      ? analysisCodes1
      : analysisCodes1.substring( 0, analysisCodes1Size ) // auto trimmed to fit, if required.
       ),
      ( analysisCodes2 == null ) ? null
                                 : ( ( analysisCodes2.length(  ) <= analysisCodes2Size )
      ? analysisCodes2
      : analysisCodes2.substring( 0, analysisCodes2Size ) // auto trimmed to fit, if required.
       ),
      ( analysisCodes3 == null ) ? null
                                 : ( ( analysisCodes3.length(  ) <= analysisCodes3Size )
      ? analysisCodes3
      : analysisCodes3.substring( 0, analysisCodes3Size ) // auto trimmed to fit, if required.
       ),
      ( analysisCodes4 == null ) ? null
                                 : ( ( analysisCodes4.length(  ) <= analysisCodes4Size )
      ? analysisCodes4
      : analysisCodes4.substring( 0, analysisCodes4Size ) // auto trimmed to fit, if required.
       ),
      ( analysisCodes5 == null ) ? null
                                 : ( ( analysisCodes5.length(  ) <= analysisCodes5Size )
      ? analysisCodes5
      : analysisCodes5.substring( 0, analysisCodes5Size ) // auto trimmed to fit, if required.
       ),
      ( reminderCat == null ) ? null
                              : ( ( reminderCat.length(  ) <= reminderCatSize )
      ? reminderCat
      : reminderCat.substring( 0, reminderCatSize ) // auto trimmed to fit, if required.
       ),
      ( settlementCode == null ) ? null
                                 : ( ( settlementCode.length(  ) <= settlementCodeSize )
      ? settlementCode
      : settlementCode.substring( 0, settlementCodeSize ) // auto trimmed to fit, if required.
       ),
      ( settDaysCode == null ) ? null
                               : ( ( settDaysCode.length(  ) <= settDaysCodeSize )
      ? settDaysCode
      : settDaysCode.substring( 0, settDaysCodeSize ) // auto trimmed to fit, if required.
       ),
      ( priceList == null ) ? null
                            : ( ( priceList.length(  ) <= priceListSize )
      ? priceList
      : priceList.substring( 0, priceListSize ) // auto trimmed to fit, if required.
       ),
      ( letterCode == null ) ? null
                             : ( ( letterCode.length(  ) <= letterCodeSize )
      ? letterCode
      : letterCode.substring( 0, letterCodeSize ) // auto trimmed to fit, if required.
       ),
      ( balanceFwd == null ) ? null
                             : ( ( balanceFwd.length(  ) <= balanceFwdSize )
      ? balanceFwd
      : balanceFwd.substring( 0, balanceFwdSize ) // auto trimmed to fit, if required.
       ), creditLimit, ytdSales, ytdCostOfSales, cumulativeSales, orderBalance,
      ( salesNlCat == null ) ? null
                             : ( ( salesNlCat.length(  ) <= salesNlCatSize )
      ? salesNlCat
      : salesNlCat.substring( 0, salesNlCatSize ) // auto trimmed to fit, if required.
       ),
      ( specialPrice == null ) ? null
                               : ( ( specialPrice.length(  ) <= specialPriceSize )
      ? specialPrice
      : specialPrice.substring( 0, specialPriceSize ) // auto trimmed to fit, if required.
       ),
      ( vatRegistration == null ) ? null
                                  : ( ( vatRegistration.length(  ) <= vatRegistrationSize )
      ? vatRegistration
      : vatRegistration.substring( 0, vatRegistrationSize ) // auto trimmed to fit, if required.
       ),
      ( directDebit == null ) ? null
                              : ( ( directDebit.length(  ) <= directDebitSize )
      ? directDebit
      : directDebit.substring( 0, directDebitSize ) // auto trimmed to fit, if required.
       ),
      ( invoicesPrinted == null ) ? null
                                  : ( ( invoicesPrinted.length(  ) <= invoicesPrintedSize )
      ? invoicesPrinted
      : invoicesPrinted.substring( 0, invoicesPrintedSize ) // auto trimmed to fit, if required.
       ),
      ( consolidatedInv == null ) ? null
                                  : ( ( consolidatedInv.length(  ) <= consolidatedInvSize )
      ? consolidatedInv
      : consolidatedInv.substring( 0, consolidatedInvSize ) // auto trimmed to fit, if required.
       ),
      ( commentOnlyInv == null ) ? null
                                 : ( ( commentOnlyInv.length(  ) <= commentOnlyInvSize )
      ? commentOnlyInv
      : commentOnlyInv.substring( 0, commentOnlyInvSize ) // auto trimmed to fit, if required.
       ),
      ( bankAccountNo == null ) ? null
                                : ( ( bankAccountNo.length(  ) <= bankAccountNoSize )
      ? bankAccountNo
      : bankAccountNo.substring( 0, bankAccountNoSize ) // auto trimmed to fit, if required.
       ),
      ( bankSortCode == null ) ? null
                               : ( ( bankSortCode.length(  ) <= bankSortCodeSize )
      ? bankSortCode
      : bankSortCode.substring( 0, bankSortCodeSize ) // auto trimmed to fit, if required.
       ),
      ( bankName == null ) ? null
                           : ( ( bankName.length(  ) <= bankNameSize )
      ? bankName
      : bankName.substring( 0, bankNameSize ) // auto trimmed to fit, if required.
       ),
      ( bankAddress1 == null ) ? null
                               : ( ( bankAddress1.length(  ) <= bankAddress1Size )
      ? bankAddress1
      : bankAddress1.substring( 0, bankAddress1Size ) // auto trimmed to fit, if required.
       ),
      ( bankAddress2 == null ) ? null
                               : ( ( bankAddress2.length(  ) <= bankAddress2Size )
      ? bankAddress2
      : bankAddress2.substring( 0, bankAddress2Size ) // auto trimmed to fit, if required.
       ),
      ( bankAddress3 == null ) ? null
                               : ( ( bankAddress3.length(  ) <= bankAddress3Size )
      ? bankAddress3
      : bankAddress3.substring( 0, bankAddress3Size ) // auto trimmed to fit, if required.
       ),
      ( bankAddress4 == null ) ? null
                               : ( ( bankAddress4.length(  ) <= bankAddress4Size )
      ? bankAddress4
      : bankAddress4.substring( 0, bankAddress4Size ) // auto trimmed to fit, if required.
       ),
      ( analysisCode6 == null ) ? null
                                : ( ( analysisCode6.length(  ) <= analysisCode6Size )
      ? analysisCode6
      : analysisCode6.substring( 0, analysisCode6Size ) // auto trimmed to fit, if required.
       ),
      ( produceStatements == null ) ? null
                                    : ( ( produceStatements.length(  ) <= produceStatementsSize )
      ? produceStatements
      : produceStatements.substring( 0, produceStatementsSize ) // auto trimmed to fit, if required.
       ),
      ( ediCustomer == null ) ? null
                              : ( ( ediCustomer.length(  ) <= ediCustomerSize )
      ? ediCustomer
      : ediCustomer.substring( 0, ediCustomerSize ) // auto trimmed to fit, if required.
       ),
      ( vatType == null ) ? null
                          : ( ( vatType.length(  ) <= vatTypeSize ) ? vatType
                                                                    : vatType
      .substring( 0, vatTypeSize ) // auto trimmed to fit, if required.
       ),
      ( language == null ) ? null
                       : ( ( language.length(  ) <= languageSize ) ? language
                                                           : language
      .substring( 0, languageSize ) // auto trimmed to fit, if required.
       ),
      ( deliveryMethod == null ) ? null
                                 : ( ( deliveryMethod.length(  ) <= deliveryMethodSize )
      ? deliveryMethod
      : deliveryMethod.substring( 0, deliveryMethodSize ) // auto trimmed to fit, if required.
       ),
      ( carrier == null ) ? null
                          : ( ( carrier.length(  ) <= carrierSize ) ? carrier
                                                                    : carrier
      .substring( 0, carrierSize ) // auto trimmed to fit, if required.
       ),
      ( vatRegNumber == null ) ? null
                               : ( ( vatRegNumber.length(  ) <= vatRegNumberSize )
      ? vatRegNumber
      : vatRegNumber.substring( 0, vatRegNumberSize ) // auto trimmed to fit, if required.
       ),
      ( vatExeNumber == null ) ? null
                               : ( ( vatExeNumber.length(  ) <= vatExeNumberSize )
      ? vatExeNumber
      : vatExeNumber.substring( 0, vatExeNumberSize ) // auto trimmed to fit, if required.
       ),
      ( paydays1 == null ) ? null
                           : ( ( paydays1.length(  ) <= paydays1Size )
      ? paydays1
      : paydays1.substring( 0, paydays1Size ) // auto trimmed to fit, if required.
       ),
      ( paydays2 == null ) ? null
                           : ( ( paydays2.length(  ) <= paydays2Size )
      ? paydays2
      : paydays2.substring( 0, paydays2Size ) // auto trimmed to fit, if required.
       ),
      ( paydays3 == null ) ? null
                           : ( ( paydays3.length(  ) <= paydays3Size )
      ? paydays3
      : paydays3.substring( 0, paydays3Size ) // auto trimmed to fit, if required.
       ),
      ( bankBranchCode == null ) ? null
                                 : ( ( bankBranchCode.length(  ) <= bankBranchCodeSize )
      ? bankBranchCode
      : bankBranchCode.substring( 0, bankBranchCodeSize ) // auto trimmed to fit, if required.
       ),
      ( printCpWithStat == null ) ? null
                                  : ( ( printCpWithStat.length(  ) <= printCpWithStatSize )
      ? printCpWithStat
      : printCpWithStat.substring( 0, printCpWithStatSize ) // auto trimmed to fit, if required.
       ),
      ( paymentMethod == null ) ? null
                                : ( ( paymentMethod.length(  ) <= paymentMethodSize )
      ? paymentMethod
      : paymentMethod.substring( 0, paymentMethodSize ) // auto trimmed to fit, if required.
       ),
      ( customerClass == null ) ? null
                                : ( ( customerClass.length(  ) <= customerClassSize )
      ? customerClass
      : customerClass.substring( 0, customerClassSize ) // auto trimmed to fit, if required.
       ),
      ( salesType == null ) ? null
                            : ( ( salesType.length(  ) <= salesTypeSize )
      ? salesType
      : salesType.substring( 0, salesTypeSize ) // auto trimmed to fit, if required.
       ), cpLowerValue,
      ( address6 == null ) ? null
                           : ( ( address6.length(  ) <= address6Size )
      ? address6
      : address6.substring( 0, address6Size ) // auto trimmed to fit, if required.
       ),
      ( fax == null ) ? null
                      : ( ( fax.length(  ) <= faxSize ) ? fax
                                                        : fax.substring( 0,
        faxSize ) // auto trimmed to fit, if required.
       ),
      ( telex == null ) ? null
                        : ( ( telex.length(  ) <= telexSize ) ? telex
                                                              : telex
      .substring( 0, telexSize ) // auto trimmed to fit, if required.
       ),
      ( btx == null ) ? null
                      : ( ( btx.length(  ) <= btxSize ) ? btx
                                                        : btx.substring( 0,
        btxSize ) // auto trimmed to fit, if required.
       ),
      ( cpCharge == null ) ? null
                           : ( ( cpCharge.length(  ) <= cpChargeSize )
      ? cpCharge
      : cpCharge.substring( 0, cpChargeSize ) // auto trimmed to fit, if required.
       ),
      ( controlDigit == null ) ? null
                               : ( ( controlDigit.length(  ) <= controlDigitSize )
      ? controlDigit
      : controlDigit.substring( 0, controlDigitSize ) // auto trimmed to fit, if required.
       ),
      ( payer == null ) ? null
                        : ( ( payer.length(  ) <= payerSize ) ? payer
                                                              : payer
      .substring( 0, payerSize ) // auto trimmed to fit, if required.
       ),
      ( responsibility == null ) ? null
                                 : ( ( responsibility.length(  ) <= responsibilitySize )
      ? responsibility
      : responsibility.substring( 0, responsibilitySize ) // auto trimmed to fit, if required.
       ),
      ( despatchHeld == null ) ? null
                               : ( ( despatchHeld.length(  ) <= despatchHeldSize )
      ? despatchHeld
      : despatchHeld.substring( 0, despatchHeldSize ) // auto trimmed to fit, if required.
       ),
      ( creditController == null ) ? null
                                   : ( ( creditController.length(  ) <= creditControllerSize )
      ? creditController
      : creditController.substring( 0, creditControllerSize ) // auto trimmed to fit, if required.
       ),
      ( reminderLetters == null ) ? null
                                  : ( ( reminderLetters.length(  ) <= reminderLettersSize )
      ? reminderLetters
      : reminderLetters.substring( 0, reminderLettersSize ) // auto trimmed to fit, if required.
       ), severityDays1, severityDays2, severityDays3, severityDays4,
      severityDays5, severityDays6,
      ( deliveryReason == null ) ? null
                                 : ( ( deliveryReason.length(  ) <= deliveryReasonSize )
      ? deliveryReason
      : deliveryReason.substring( 0, deliveryReasonSize ) // auto trimmed to fit, if required.
       ),
      ( shipperCode1 == null ) ? null
                               : ( ( shipperCode1.length(  ) <= shipperCode1Size )
      ? shipperCode1
      : shipperCode1.substring( 0, shipperCode1Size ) // auto trimmed to fit, if required.
       ),
      ( shipperCode2 == null ) ? null
                               : ( ( shipperCode2.length(  ) <= shipperCode2Size )
      ? shipperCode2
      : shipperCode2.substring( 0, shipperCode2Size ) // auto trimmed to fit, if required.
       ),
      ( shipperCode3 == null ) ? null
                               : ( ( shipperCode3.length(  ) <= shipperCode3Size )
      ? shipperCode3
      : shipperCode3.substring( 0, shipperCode3Size ) // auto trimmed to fit, if required.
       ),
      ( shippingNoteInd == null ) ? null
                                  : ( ( shippingNoteInd.length(  ) <= shippingNoteIndSize )
      ? shippingNoteInd
      : shippingNoteInd.substring( 0, shippingNoteIndSize ) // auto trimmed to fit, if required.
       ),
      ( accountType == null ) ? null
                              : ( ( accountType.length(  ) <= accountTypeSize )
      ? accountType
      : accountType.substring( 0, accountTypeSize ) // auto trimmed to fit, if required.
       ),
      ( adminFee == null ) ? null
                           : ( ( adminFee.length(  ) <= adminFeeSize )
      ? adminFee
      : adminFee.substring( 0, adminFeeSize ) // auto trimmed to fit, if required.
       ),
      ( intrestRate == null ) ? null
                              : ( ( intrestRate.length(  ) <= intrestRateSize )
      ? intrestRate
      : intrestRate.substring( 0, intrestRateSize ) // auto trimmed to fit, if required.
       )
    };
  }

  /**
   * DOCUMENT ME!
   *
   * @param fields DOCUMENT ME!
   */
  protected void set( final Object[] fields ) {
    customer = rtrim( (String) fields[0] );
    alpha = rtrim( (String) fields[1] );
    name = rtrim( (String) fields[2] );
    address1 = rtrim( (String) fields[3] );
    address2 = rtrim( (String) fields[4] );
    address3 = rtrim( (String) fields[5] );
    address4 = rtrim( (String) fields[6] );
    address5 = rtrim( (String) fields[7] );
    creditCategory = rtrim( (String) fields[8] );
    exportIndicator = rtrim( (String) fields[9] );
    custDiscCode = rtrim( (String) fields[10] );
    currency = rtrim( (String) fields[11] );
    territory = rtrim( (String) fields[12] );
    klass = rtrim( (String) fields[13] );
    region = rtrim( (String) fields[14] );
    invoiceCustomer = rtrim( (String) fields[15] );
    statementCustomer = rtrim( (String) fields[16] );
    groupCustomer = rtrim( (String) fields[17] );
    dateLastIssue = (Date) fields[18];
    dateCreated = (Date) fields[19];
    analysisCodes1 = rtrim( (String) fields[20] );
    analysisCodes2 = rtrim( (String) fields[21] );
    analysisCodes3 = rtrim( (String) fields[22] );
    analysisCodes4 = rtrim( (String) fields[23] );
    analysisCodes5 = rtrim( (String) fields[24] );
    reminderCat = rtrim( (String) fields[25] );
    settlementCode = rtrim( (String) fields[26] );
    settDaysCode = rtrim( (String) fields[27] );
    priceList = rtrim( (String) fields[28] );
    letterCode = rtrim( (String) fields[29] );
    balanceFwd = rtrim( (String) fields[30] );
    creditLimit = (BigDecimal) fields[31];
    ytdSales = (BigDecimal) fields[32];
    ytdCostOfSales = (BigDecimal) fields[33];
    cumulativeSales = (BigDecimal) fields[34];
    orderBalance = (BigDecimal) fields[35];
    salesNlCat = rtrim( (String) fields[36] );
    specialPrice = rtrim( (String) fields[37] );
    vatRegistration = rtrim( (String) fields[38] );
    directDebit = rtrim( (String) fields[39] );
    invoicesPrinted = rtrim( (String) fields[40] );
    consolidatedInv = rtrim( (String) fields[41] );
    commentOnlyInv = rtrim( (String) fields[42] );
    bankAccountNo = rtrim( (String) fields[43] );
    bankSortCode = rtrim( (String) fields[44] );
    bankName = rtrim( (String) fields[45] );
    bankAddress1 = rtrim( (String) fields[46] );
    bankAddress2 = rtrim( (String) fields[47] );
    bankAddress3 = rtrim( (String) fields[48] );
    bankAddress4 = rtrim( (String) fields[49] );
    analysisCode6 = rtrim( (String) fields[50] );
    produceStatements = rtrim( (String) fields[51] );
    ediCustomer = rtrim( (String) fields[52] );
    vatType = rtrim( (String) fields[53] );
    language = rtrim( (String) fields[54] );
    deliveryMethod = rtrim( (String) fields[55] );
    carrier = rtrim( (String) fields[56] );
    vatRegNumber = rtrim( (String) fields[57] );
    vatExeNumber = rtrim( (String) fields[58] );
    paydays1 = rtrim( (String) fields[59] );
    paydays2 = rtrim( (String) fields[60] );
    paydays3 = rtrim( (String) fields[61] );
    bankBranchCode = rtrim( (String) fields[62] );
    printCpWithStat = rtrim( (String) fields[63] );
    paymentMethod = rtrim( (String) fields[64] );
    customerClass = rtrim( (String) fields[65] );
    salesType = rtrim( (String) fields[66] );
    cpLowerValue = (BigDecimal) fields[67];
    address6 = rtrim( (String) fields[68] );
    fax = rtrim( (String) fields[69] );
    telex = rtrim( (String) fields[70] );
    btx = rtrim( (String) fields[71] );
    cpCharge = rtrim( (String) fields[72] );
    controlDigit = rtrim( (String) fields[73] );
    payer = rtrim( (String) fields[74] );
    responsibility = rtrim( (String) fields[75] );
    despatchHeld = rtrim( (String) fields[76] );
    creditController = rtrim( (String) fields[77] );
    reminderLetters = rtrim( (String) fields[78] );
    severityDays1 = (Integer) fields[79];
    severityDays2 = (Integer) fields[80];
    severityDays3 = (Integer) fields[81];
    severityDays4 = (Integer) fields[82];
    severityDays5 = (Integer) fields[83];
    severityDays6 = (Integer) fields[84];
    deliveryReason = rtrim( (String) fields[85] );
    shipperCode1 = rtrim( (String) fields[86] );
    shipperCode2 = rtrim( (String) fields[87] );
    shipperCode3 = rtrim( (String) fields[88] );
    shippingNoteInd = rtrim( (String) fields[89] );
    accountType = rtrim( (String) fields[90] );
    adminFee = rtrim( (String) fields[91] );
    intrestRate = rtrim( (String) fields[92] );
  }

  // Get methods ///////////////////////////////////////////////////////////////
  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getCustomer(  ) {
    return customer;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getAlpha(  ) {
    return alpha;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getName(  ) {
    return name;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getAddress1(  ) {
    return address1;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getAddress2(  ) {
    return address2;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getAddress3(  ) {
    return address3;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getAddress4(  ) {
    return address4;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getAddress5(  ) {
    return address5;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getCreditCategory(  ) {
    return creditCategory;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getExportIndicator(  ) {
    return exportIndicator;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getCustDiscCode(  ) {
    return custDiscCode;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getCurrency(  ) {
    return currency;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getTerritory(  ) {
    return territory;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getKlass(  ) {
    return klass;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getRegion(  ) {
    return region;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getInvoiceCustomer(  ) {
    return invoiceCustomer;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getStatementCustomer(  ) {
    return statementCustomer;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getGroupCustomer(  ) {
    return groupCustomer;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public Date getDateLastIssue(  ) {
    return ( dateLastIssue != null ) ? new Date( dateLastIssue ) : null;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public Date getDateCreated(  ) {
    return ( dateCreated != null ) ? new Date( dateCreated ) : null;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getAnalysisCodes1(  ) {
    return analysisCodes1;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getAnalysisCodes2(  ) {
    return analysisCodes2;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getAnalysisCodes3(  ) {
    return analysisCodes3;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getAnalysisCodes4(  ) {
    return analysisCodes4;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getAnalysisCodes5(  ) {
    return analysisCodes5;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getReminderCat(  ) {
    return reminderCat;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getSettlementCode(  ) {
    return settlementCode;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getSettDaysCode(  ) {
    return settDaysCode;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getPriceList(  ) {
    return priceList;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getLetterCode(  ) {
    return letterCode;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getBalanceFwd(  ) {
    return balanceFwd;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public BigDecimal getCreditLimit(  ) {
    return creditLimit;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public BigDecimal getYtdSales(  ) {
    return ytdSales;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public BigDecimal getYtdCostOfSales(  ) {
    return ytdCostOfSales;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public BigDecimal getCumulativeSales(  ) {
    return cumulativeSales;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public BigDecimal getOrderBalance(  ) {
    return orderBalance;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getSalesNlCat(  ) {
    return salesNlCat;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getSpecialPrice(  ) {
    return specialPrice;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getVatRegistration(  ) {
    return vatRegistration;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getDirectDebit(  ) {
    return directDebit;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getInvoicesPrinted(  ) {
    return invoicesPrinted;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getConsolidatedInv(  ) {
    return consolidatedInv;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getCommentOnlyInv(  ) {
    return commentOnlyInv;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getBankAccountNo(  ) {
    return bankAccountNo;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getBankSortCode(  ) {
    return bankSortCode;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getBankName(  ) {
    return bankName;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getBankAddress1(  ) {
    return bankAddress1;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getBankAddress2(  ) {
    return bankAddress2;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getBankAddress3(  ) {
    return bankAddress3;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getBankAddress4(  ) {
    return bankAddress4;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getAnalysisCode6(  ) {
    return analysisCode6;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getProduceStatements(  ) {
    return produceStatements;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getEdiCustomer(  ) {
    return ediCustomer;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getVatType(  ) {
    return vatType;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getLanguage(  ) {
    return language;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getDeliveryMethod(  ) {
    return deliveryMethod;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getCarrier(  ) {
    return carrier;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getVatRegNumber(  ) {
    return vatRegNumber;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getVatExeNumber(  ) {
    return vatExeNumber;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getPaydays1(  ) {
    return paydays1;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getPaydays2(  ) {
    return paydays2;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getPaydays3(  ) {
    return paydays3;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getBankBranchCode(  ) {
    return bankBranchCode;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getPrintCpWithStat(  ) {
    return printCpWithStat;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getPaymentMethod(  ) {
    return paymentMethod;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getCustomerClass(  ) {
    return customerClass;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getSalesType(  ) {
    return salesType;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public BigDecimal getCpLowerValue(  ) {
    return cpLowerValue;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getAddress6(  ) {
    return address6;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getFax(  ) {
    return fax;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getTelex(  ) {
    return telex;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getBtx(  ) {
    return btx;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getCpCharge(  ) {
    return cpCharge;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getControlDigit(  ) {
    return controlDigit;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getPayer(  ) {
    return payer;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getResponsibility(  ) {
    return responsibility;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getDespatchHeld(  ) {
    return despatchHeld;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getCreditController(  ) {
    return creditController;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getReminderLetters(  ) {
    return reminderLetters;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public Integer getSeverityDays1(  ) {
    return severityDays1;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public Integer getSeverityDays2(  ) {
    return severityDays2;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public Integer getSeverityDays3(  ) {
    return severityDays3;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public Integer getSeverityDays4(  ) {
    return severityDays4;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public Integer getSeverityDays5(  ) {
    return severityDays5;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public Integer getSeverityDays6(  ) {
    return severityDays6;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getDeliveryReason(  ) {
    return deliveryReason;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getShipperCode1(  ) {
    return shipperCode1;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getShipperCode2(  ) {
    return shipperCode2;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getShipperCode3(  ) {
    return shipperCode3;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getShippingNoteInd(  ) {
    return shippingNoteInd;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getAccountType(  ) {
    return accountType;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getAdminFee(  ) {
    return adminFee;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getIntrestRate(  ) {
    return intrestRate;
  }

  // Setter methods ///////////////////////////////////////////////////////////////

  //
  // Master setter follows...
  //

  /**
   * Setter that takes all attributes
   */
  public void set( 
    final String     customer,
    final String     alpha,
    final String     name,
    final String     address1,
    final String     address2,
    final String     address3,
    final String     address4,
    final String     address5,
    final String     creditCategory,
    final String     exportIndicator,
    final String     custDiscCode,
    final String     currency,
    final String     territory,
    final String     klass,
    final String     region,
    final String     invoiceCustomer,
    final String     statementCustomer,
    final String     groupCustomer,
    final Date       dateLastIssue,
    final Date       dateCreated,
    final String     analysisCodes1,
    final String     analysisCodes2,
    final String     analysisCodes3,
    final String     analysisCodes4,
    final String     analysisCodes5,
    final String     reminderCat,
    final String     settlementCode,
    final String     settDaysCode,
    final String     priceList,
    final String     letterCode,
    final String     balanceFwd,
    final BigDecimal creditLimit,
    final BigDecimal ytdSales,
    final BigDecimal ytdCostOfSales,
    final BigDecimal cumulativeSales,
    final BigDecimal orderBalance,
    final String     salesNlCat,
    final String     specialPrice,
    final String     vatRegistration,
    final String     directDebit,
    final String     invoicesPrinted,
    final String     consolidatedInv,
    final String     commentOnlyInv,
    final String     bankAccountNo,
    final String     bankSortCode,
    final String     bankName,
    final String     bankAddress1,
    final String     bankAddress2,
    final String     bankAddress3,
    final String     bankAddress4,
    final String     analysisCode6,
    final String     produceStatements,
    final String     ediCustomer,
    final String     vatType,
    final String     language,
    final String     deliveryMethod,
    final String     carrier,
    final String     vatRegNumber,
    final String     vatExeNumber,
    final String     paydays1,
    final String     paydays2,
    final String     paydays3,
    final String     bankBranchCode,
    final String     printCpWithStat,
    final String     paymentMethod,
    final String     customerClass,
    final String     salesType,
    final BigDecimal cpLowerValue,
    final String     address6,
    final String     fax,
    final String     telex,
    final String     btx,
    final String     cpCharge,
    final String     controlDigit,
    final String     payer,
    final String     responsibility,
    final String     despatchHeld,
    final String     creditController,
    final String     reminderLetters,
    final Integer    severityDays1,
    final Integer    severityDays2,
    final Integer    severityDays3,
    final Integer    severityDays4,
    final Integer    severityDays5,
    final Integer    severityDays6,
    final String     deliveryReason,
    final String     shipperCode1,
    final String     shipperCode2,
    final String     shipperCode3,
    final String     shippingNoteInd,
    final String     accountType,
    final String     adminFee,
    final String     intrestRate ) {
    this.customer = customer;
    this.alpha = alpha;
    this.name = name;
    this.address1 = address1;
    this.address2 = address2;
    this.address3 = address3;
    this.address4 = address4;
    this.address5 = address5;
    this.creditCategory = creditCategory;
    this.exportIndicator = exportIndicator;
    this.custDiscCode = custDiscCode;
    this.currency = currency;
    this.territory = territory;
    this.klass = klass;
    this.region = region;
    this.invoiceCustomer = invoiceCustomer;
    this.statementCustomer = statementCustomer;
    this.groupCustomer = groupCustomer;
    this.dateLastIssue = ( dateLastIssue != null )
      ? new Date( dateLastIssue ) : null;
    this.dateCreated = ( dateCreated != null ) ? new Date( dateCreated ) : null;
    this.analysisCodes1 = analysisCodes1;
    this.analysisCodes2 = analysisCodes2;
    this.analysisCodes3 = analysisCodes3;
    this.analysisCodes4 = analysisCodes4;
    this.analysisCodes5 = analysisCodes5;
    this.reminderCat = reminderCat;
    this.settlementCode = settlementCode;
    this.settDaysCode = settDaysCode;
    this.priceList = priceList;
    this.letterCode = letterCode;
    this.balanceFwd = balanceFwd;
    this.creditLimit = creditLimit;
    this.ytdSales = ytdSales;
    this.ytdCostOfSales = ytdCostOfSales;
    this.cumulativeSales = cumulativeSales;
    this.orderBalance = orderBalance;
    this.salesNlCat = salesNlCat;
    this.specialPrice = specialPrice;
    this.vatRegistration = vatRegistration;
    this.directDebit = directDebit;
    this.invoicesPrinted = invoicesPrinted;
    this.consolidatedInv = consolidatedInv;
    this.commentOnlyInv = commentOnlyInv;
    this.bankAccountNo = bankAccountNo;
    this.bankSortCode = bankSortCode;
    this.bankName = bankName;
    this.bankAddress1 = bankAddress1;
    this.bankAddress2 = bankAddress2;
    this.bankAddress3 = bankAddress3;
    this.bankAddress4 = bankAddress4;
    this.analysisCode6 = analysisCode6;
    this.produceStatements = produceStatements;
    this.ediCustomer = ediCustomer;
    this.vatType = vatType;
    this.language = language;
    this.deliveryMethod = deliveryMethod;
    this.carrier = carrier;
    this.vatRegNumber = vatRegNumber;
    this.vatExeNumber = vatExeNumber;
    this.paydays1 = paydays1;
    this.paydays2 = paydays2;
    this.paydays3 = paydays3;
    this.bankBranchCode = bankBranchCode;
    this.printCpWithStat = printCpWithStat;
    this.paymentMethod = paymentMethod;
    this.customerClass = customerClass;
    this.salesType = salesType;
    this.cpLowerValue = cpLowerValue;
    this.address6 = address6;
    this.fax = fax;
    this.telex = telex;
    this.btx = btx;
    this.cpCharge = cpCharge;
    this.controlDigit = controlDigit;
    this.payer = payer;
    this.responsibility = responsibility;
    this.despatchHeld = despatchHeld;
    this.creditController = creditController;
    this.reminderLetters = reminderLetters;
    this.severityDays1 = severityDays1;
    this.severityDays2 = severityDays2;
    this.severityDays3 = severityDays3;
    this.severityDays4 = severityDays4;
    this.severityDays5 = severityDays5;
    this.severityDays6 = severityDays6;
    this.deliveryReason = deliveryReason;
    this.shipperCode1 = shipperCode1;
    this.shipperCode2 = shipperCode2;
    this.shipperCode3 = shipperCode3;
    this.shippingNoteInd = shippingNoteInd;
    this.accountType = accountType;
    this.adminFee = adminFee;
    this.intrestRate = intrestRate;
  }

  //
  // Public access modifiers if any
  // (provided for attributes that are public in the analysis model)
  //    

  /**
  * Sets the Customer field.
  *
  * @param customer
  */
  public void setCustomer( final String customer ) {
    this.customer = getPadded(customer, customerClassFilter);
  }

  /**
  * Sets the Alpha field.
  *
  * @param alpha
  */
  public void setAlpha( final String alpha ) {
    this.alpha = getPadded(alpha, alphaFilter);
  }

  /**
  * Sets the Name field.
  *
  * @param name
  */
  public void setName( final String name ) {
    this.name = getPadded(name, nameFilter);
  }

  /**
  * Sets the Address1 field.
  *
  * @param address1
  */
  public void setAddress1( final String address1 ) {
    this.address1 = getPadded(address1, address1Filter);
  }

  /**
  * Sets the Address2 field.
  *
  * @param address2
  */
  public void setAddress2( final String address2 ) {
    this.address2 = getPadded(address2, address2Filter);
  }

  /**
  * Sets the Address3 field.
  *
  * @param address3
  */
  public void setAddress3( final String address3 ) {
    this.address3 = getPadded(address3, address3Filter);
  }

  /**
  * Sets the Address4 field.
  *
  * @param address4
  */
  public void setAddress4( final String address4 ) {
    this.address4 = getPadded(address4, address4Filter);
  }

  /**
  * Sets the Address5 field.
  *
  * @param address5
  */
  public void setAddress5( final String address5 ) {
    this.address5 = getPadded(address5, address5Filter);
  }

  /**
  * Sets the CreditCategory field.
  *
  * @param creditCategory
  */
  public void setCreditCategory( final String creditCategory ) {
    this.creditCategory = getPadded(creditCategory, creditCategoryFilter);
  }

  /**
  * Sets the ExportIndicator field.
  *
  * @param exportIndicator
  */
  public void setExportIndicator( final String exportIndicator ) {
    this.exportIndicator = getPadded(exportIndicator, exportIndicatorFilter);
  }

  /**
  * Sets the CustDiscCode field.
  *
  * @param custDiscCode
  */
  public void setCustDiscCode( final String custDiscCode ) {
    this.custDiscCode = getPadded(custDiscCode, custDiscCodeFilter);
  }

  /**
  * Sets the Currency field.
  *
  * @param currency
  */
  public void setCurrency( final String currency ) {
    this.currency = getPadded(currency, currencyFilter);
  }

  /**
  * Sets the Territory field.
  *
  * @param territory
  */
  public void setTerritory( final String territory ) {
    this.territory = getPadded(territory, territoryFilter);
  }

  /**
  * Sets the Klass field.
  *
  * @param klass
  */
  public void setKlass( final String klass ) {
    this.klass = getPadded(klass, klassFilter);
  }

  /**
  * Sets the Region field.
  *
  * @param region
  */
  public void setRegion( final String region ) {
    this.region = getPadded(region, regionFilter);
  }

  /**
  * Sets the InvoiceCustomer field.
  *
  * @param invoiceCustomer
  */
  public void setInvoiceCustomer( final String invoiceCustomer ) {
    this.invoiceCustomer = getPadded(invoiceCustomer, invoiceCustomerFilter);
  }

  /**
  * Sets the StatementCustomer field.
  *
  * @param statementCustomer
  */
  public void setStatementCustomer( final String statementCustomer ) {
    this.statementCustomer = getPadded(statementCustomer, statementCustomerFilter);
  }

  /**
  * Sets the GroupCustomer field.
  *
  * @param groupCustomer
  */
  public void setGroupCustomer( final String groupCustomer ) {
    this.groupCustomer = getPadded(groupCustomer, groupCustomerFilter);
  }

  /**
  * Sets the DateLastIssue field.
  *
  * @param dateLastIssue
  */
  public void setDateLastIssue( final Date dateLastIssue ) {
    this.dateLastIssue = ( dateLastIssue != null )
      ? new Date( dateLastIssue ) : null;
  }

  /**
  * Sets the DateCreated field.
  *
  * @param dateCreated
  */
  public void setDateCreated( final Date dateCreated ) {
    this.dateCreated = ( dateCreated != null ) ? new Date( dateCreated ) : null;
  }

  /**
  * Sets the AnalysisCodes1 field.
  *
  * @param analysisCodes1
  */
  public void setAnalysisCodes1( final String analysisCodes1 ) {
    this.analysisCodes1 = getPadded(analysisCodes1, analysisCodes1Filter);
  }

  /**
  * Sets the AnalysisCodes2 field.
  *
  * @param analysisCodes2
  */
  public void setAnalysisCodes2( final String analysisCodes2 ) {
    this.analysisCodes2 = getPadded(analysisCodes2, analysisCodes2Filter);
  }

  /**
  * Sets the AnalysisCodes3 field.
  *
  * @param analysisCodes3
  */
  public void setAnalysisCodes3( final String analysisCodes3 ) {
    this.analysisCodes3 = getPadded(analysisCodes3, analysisCodes3Filter);
  }

  /**
  * Sets the AnalysisCodes4 field.
  *
  * @param analysisCodes4
  */
  public void setAnalysisCodes4( final String analysisCodes4 ) {
    this.analysisCodes4 = getPadded(analysisCodes4, analysisCodes4Filter);
  }

  /**
  * Sets the AnalysisCodes5 field.
  *
  * @param analysisCodes5
  */
  public void setAnalysisCodes5( final String analysisCodes5 ) {
    this.analysisCodes5 = getPadded(analysisCodes5, analysisCodes5Filter);
  }

  /**
  * Sets the ReminderCat field.
  *
  * @param reminderCat
  */
  public void setReminderCat( final String reminderCat ) {
    this.reminderCat = getPadded(reminderCat, reminderCatFilter);
  }

  /**
  * Sets the SettlementCode field.
  *
  * @param settlementCode
  */
  public void setSettlementCode( final String settlementCode ) {
    this.settlementCode = getPadded(settlementCode, settlementCodeFilter);
  }

  /**
  * Sets the SettDaysCode field.
  *
  * @param settDaysCode
  */
  public void setSettDaysCode( final String settDaysCode ) {
    this.settDaysCode = getPadded(settDaysCode, settDaysCodeFilter);
  }

  /**
  * Sets the PriceList field.
  *
  * @param priceList
  */
  public void setPriceList( final String priceList ) {
    this.priceList = getPadded(priceList, priceListFilter);
  }

  /**
  * Sets the LetterCode field.
  *
  * @param letterCode
  */
  public void setLetterCode( final String letterCode ) {
    this.letterCode = getPadded(letterCode, letterCodeFilter);
  }

  /**
  * Sets the BalanceFwd field.
  *
  * @param balanceFwd
  */
  public void setBalanceFwd( final String balanceFwd ) {
    this.balanceFwd = getPadded(balanceFwd, balanceFwdFilter);
  }

  /**
  * Sets the CreditLimit field.
  *
  * @param creditLimit
  */
  public void setCreditLimit( final BigDecimal creditLimit ) {
    this.creditLimit = creditLimit;
  }

  /**
  * Sets the CreditLimit field.
  *
  * @param creditLimit
  */
  public void setCreditLimit( final double creditLimit ) {
//    this.creditLimit = BigDecimal.valueOf(Long.parseLong(String.valueOf(creditLimit)));
	  this.creditLimit = new BigDecimal(creditLimit);
  }

  /**
  * Sets the YtdSales field.
  *
  * @param ytdSales
  */
  public void setYtdSales( final BigDecimal ytdSales ) {
    this.ytdSales = ytdSales;
  }

  /**
  * Sets the YtdSales field.
  *
  * @param ytdSales
  */
  public void setYtdSales( final double ytdSales ) {
    this.ytdSales = new BigDecimal(ytdSales);
  }

  /**
  * Sets the YtdCostOfSales field.
  *
  * @param ytdCostOfSales
  */
  public void setYtdCostOfSales( final BigDecimal ytdCostOfSales ) {
    this.ytdCostOfSales = ytdCostOfSales;
  }

  /**
  * Sets the YtdCostOfSales field.
  *
  * @param ytdCostOfSales
  */
  public void setYtdCostOfSales( final double ytdCostOfSales ) {
    this.ytdCostOfSales = new BigDecimal(ytdCostOfSales);
  }

  /**
  * Sets the CumulativeSales field.
  *
  * @param cumulativeSales
  */
  public void setCumulativeSales( final BigDecimal cumulativeSales ) {
    this.cumulativeSales = cumulativeSales;
  }

  /**
  * Sets the CumulativeSales field.
  *
  * @param cumulativeSales
  */
  public void setCumulativeSales( final double cumulativeSales ) {
    this.cumulativeSales = new BigDecimal(cumulativeSales);
  }

  /**
  * Sets the OrderBalance field.
  *
  * @param orderBalance
  */
  public void setOrderBalance( final BigDecimal orderBalance ) {
    this.orderBalance = orderBalance;
  }

  /**
  * Sets the OrderBalance field.
  *
  * @param orderBalance
  */
  public void setOrderBalance( final double orderBalance ) {
    this.orderBalance = new BigDecimal(orderBalance);
  }

  /**
  * Sets the SalesNlCat field.
  *
  * @param salesNlCat
  */
  public void setSalesNlCat( final String salesNlCat ) {
    this.salesNlCat = getPadded(salesNlCat, salesNlCatFilter);
  }

  /**
  * Sets the SpecialPrice field.
  *
  * @param specialPrice
  */
  public void setSpecialPrice( final String specialPrice ) {
    this.specialPrice = getPadded(specialPrice, specialPriceFilter);
  }

  /**
  * Sets the VatRegistration field.
  *
  * @param vatRegistration
  */
  public void setVatRegistration( final String vatRegistration ) {
    this.vatRegistration = getPadded(vatRegistration, vatRegistrationFilter);
  }

  /**
  * Sets the DirectDebit field.
  *
  * @param directDebit
  */
  public void setDirectDebit( final String directDebit ) {
    this.directDebit = getPadded(directDebit, directDebitFilter);
  }

  /**
  * Sets the InvoicesPrinted field.
  *
  * @param invoicesPrinted
  */
  public void setInvoicesPrinted( final String invoicesPrinted ) {
    this.invoicesPrinted = getPadded(invoicesPrinted, invoicesPrintedFilter);
  }

  /**
  * Sets the ConsolidatedInv field.
  *
  * @param consolidatedInv
  */
  public void setConsolidatedInv( final String consolidatedInv ) {
    this.consolidatedInv = getPadded(consolidatedInv, consolidatedInvFilter);
  }

  /**
  * Sets the CommentOnlyInv field.
  *
  * @param commentOnlyInv
  */
  public void setCommentOnlyInv( final String commentOnlyInv ) {
    this.commentOnlyInv = getPadded(commentOnlyInv, commentOnlyInvFilter);
  }

  /**
  * Sets the BankAccountNo field.
  *
  * @param bankAccountNo
  */
  public void setBankAccountNo( final String bankAccountNo ) {
    this.bankAccountNo = getPadded(bankAccountNo, bankAccountNoFilter);
  }

  /**
  * Sets the BankSortCode field.
  *
  * @param bankSortCode
  */
  public void setBankSortCode( final String bankSortCode ) {
    this.bankSortCode = getPadded(bankSortCode, bankSortCodeFilter);
  }

  /**
  * Sets the BankName field.
  *
  * @param bankName
  */
  public void setBankName( final String bankName ) {
    this.bankName = getPadded(bankName, bankNameFilter);
  }

  /**
  * Sets the BankAddress1 field.
  *
  * @param bankAddress1
  */
  public void setBankAddress1( final String bankAddress1 ) {
    this.bankAddress1 = getPadded(bankAddress1, bankAddress1Filter);
  }

  /**
  * Sets the BankAddress2 field.
  *
  * @param bankAddress2
  */
  public void setBankAddress2( final String bankAddress2 ) {
    this.bankAddress2 = getPadded(bankAddress2, bankAddress2Filter);
  }

  /**
  * Sets the BankAddress3 field.
  *
  * @param bankAddress3
  */
  public void setBankAddress3( final String bankAddress3 ) {
    this.bankAddress3 = getPadded(bankAddress3, bankAddress3Filter);
  }

  /**
  * Sets the BankAddress4 field.
  *
  * @param bankAddress4
  */
  public void setBankAddress4( final String bankAddress4 ) {
    this.bankAddress4 = getPadded(bankAddress4, bankAddress4Filter);
  }

  /**
  * Sets the AnalysisCode6 field.
  *
  * @param analysisCode6
  */
  public void setAnalysisCode6( final String analysisCode6 ) {
    this.analysisCode6 = getPadded(analysisCode6, analysisCode6Filter);
  }

  /**
  * Sets the ProduceStatements field.
  *
  * @param produceStatements
  */
  public void setProduceStatements( final String produceStatements ) {
    this.produceStatements = getPadded(produceStatements, produceStatementsFilter);
  }

  /**
  * Sets the EdiCustomer field.
  *
  * @param ediCustomer
  */
  public void setEdiCustomer( final String ediCustomer ) {
    this.ediCustomer = getPadded(ediCustomer, ediCustomerFilter);
  }

  /**
  * Sets the VatType field.
  *
  * @param vatType
  */
  public void setVatType( final String vatType ) {
    this.vatType = getPadded(vatType, vatTypeFilter);
  }

  /**
  * Sets the Language field.
  *
  * @param language
  */
  public void setLanguage( final String language ) {
    this.language = getPadded(language, languageFilter);
  }

  /**
  * Sets the DeliveryMethod field.
  *
  * @param deliveryMethod
  */
  public void setDeliveryMethod( final String deliveryMethod ) {
    this.deliveryMethod = getPadded(deliveryMethod, deliveryMethodFilter);
  }

  /**
  * Sets the Carrier field.
  *
  * @param carrier
  */
  public void setCarrier( final String carrier ) {
    this.carrier = getPadded(carrier, carrierFilter);
  }

  /**
  * Sets the VatRegNumber field.
  *
  * @param vatRegNumber
  */
  public void setVatRegNumber( final String vatRegNumber ) {
    this.vatRegNumber = getPadded(vatRegNumber, vatRegNumberFilter);
  }

  /**
  * Sets the VatExeNumber field.
  *
  * @param vatExeNumber
  */
  public void setVatExeNumber( final String vatExeNumber ) {
    this.vatExeNumber = getPadded(vatExeNumber, vatExeNumberFilter);
  }

  /**
  * Sets the Paydays1 field.
  *
  * @param paydays1
  */
  public void setPaydays1( final String paydays1 ) {
    this.paydays1 = getPadded(paydays1, paydays1Filter);
  }

  /**
  * Sets the Paydays2 field.
  *
  * @param paydays2
  */
  public void setPaydays2( final String paydays2 ) {
    this.paydays2 = getPadded(paydays2, paydays2Filter);
  }

  /**
  * Sets the Paydays3 field.
  *
  * @param paydays3
  */
  public void setPaydays3( final String paydays3 ) {
    this.paydays3 = getPadded(paydays3, paydays3Filter);
  }

  /**
  * Sets the BankBranchCode field.
  *
  * @param bankBranchCode
  */
  public void setBankBranchCode( final String bankBranchCode ) {
    this.bankBranchCode = getPadded(bankBranchCode, bankBranchCodeFilter );
  }

  /**
  * Sets the PrintCpWithStat field.
  *
  * @param printCpWithStat
  */
  public void setPrintCpWithStat( final String printCpWithStat ) {
    this.printCpWithStat = getPadded(printCpWithStat, printCpWithStatFilter);
  }

  /**
  * Sets the PaymentMethod field.
  *
  * @param paymentMethod
  */
  public void setPaymentMethod( final String paymentMethod ) {
    this.paymentMethod = getPadded(paymentMethod, paymentMethodFilter);
  }

  /**
  * Sets the CustomerClass field.
  *
  * @param customerClass
  */
  public void setCustomerClass( final String customerClass ) {
    this.customerClass = getPadded(customerClass, customerClassFilter);
  }

  /**
  * Sets the SalesType field.
  *
  * @param salesType
  */
  public void setSalesType( final String salesType ) {
    this.salesType = getPadded(salesType, salesTypeFilter);
  }

  /**
  * Sets the CpLowerValue field.
  *
  * @param cpLowerValue
  */
  public void setCpLowerValue( final BigDecimal cpLowerValue ) {
    this.cpLowerValue = cpLowerValue;
  }

  /**
  * Sets the CpLowerValue field.
  *
  * @param cpLowerValue
  */
  public void setCpLowerValue( final double cpLowerValue ) {
    this.cpLowerValue = new BigDecimal(cpLowerValue);
  }

  /**
  * Sets the Address6 field.
  *
  * @param address6
  */
  public void setAddress6( final String address6 ) {
    this.address6 = getPadded(address6, address6Filter);
  }

  /**
  * Sets the Fax field.
  *
  * @param fax
  */
  public void setFax( final String fax ) {
    this.fax = getPadded(fax, faxFilter);
  }

  /**
  * Sets the Telex field.
  *
  * @param telex
  */
  public void setTelex( final String telex ) {
    this.telex = getPadded(telex, telexFilter);
  }

  /**
  * Sets the Btx field.
  *
  * @param btx
  */
  public void setBtx( final String btx ) {
    this.btx = getPadded(btx, btxFilter);
  }

  /**
  * Sets the CpCharge field.
  *
  * @param cpCharge
  */
  public void setCpCharge( final String cpCharge ) {
    this.cpCharge = getPadded(cpCharge, cpChargeFilter);
  }

  /**
  * Sets the ControlDigit field.
  *
  * @param controlDigit
  */
  public void setControlDigit( final String controlDigit ) {
    this.controlDigit = getPadded(controlDigit, controlDigitFilter);
  }

  /**
  * Sets the Payer field.
  *
  * @param payer
  */
  public void setPayer( final String payer ) {
    this.payer = getPadded(payer, payerFilter);
  }

  /**
  * Sets the Responsibility field.
  *
  * @param responsibility
  */
  public void setResponsibility( final String responsibility ) {
    this.responsibility = getPadded(responsibility, responsibilityFilter);
  }

  /**
  * Sets the DespatchHeld field.
  *
  * @param despatchHeld
  */
  public void setDespatchHeld( final String despatchHeld ) {
    this.despatchHeld = getPadded(despatchHeld, despatchHeldFilter);
  }

  /**
  * Sets the CreditController field.
  *
  * @param creditController
  */
  public void setCreditController( final String creditController ) {
    this.creditController = getPadded(creditController, creditControllerFilter);
  }

  /**
  * Sets the ReminderLetters field.
  *
  * @param reminderLetters
  */
  public void setReminderLetters( final String reminderLetters ) {
    this.reminderLetters = getPadded(reminderLetters, reminderLettersFilter);
  }

  /**
  * Sets the SeverityDays1 field.
  *
  * @param severityDays1
  */
  public void setSeverityDays1( final Integer severityDays1 ) {
    this.severityDays1 = severityDays1;
  }

  /**
  * Sets the SeverityDays2 field.
  *
  * @param severityDays2
  */
  public void setSeverityDays2( final Integer severityDays2 ) {
    this.severityDays2 = severityDays2;
  }

  /**
  * Sets the SeverityDays3 field.
  *
  * @param severityDays3
  */
  public void setSeverityDays3( final Integer severityDays3 ) {
    this.severityDays3 = severityDays3;
  }

  /**
  * Sets the SeverityDays4 field.
  *
  * @param severityDays4
  */
  public void setSeverityDays4( final Integer severityDays4 ) {
    this.severityDays4 = severityDays4;
  }

  /**
  * Sets the SeverityDays5 field.
  *
  * @param severityDays5
  */
  public void setSeverityDays5( final Integer severityDays5 ) {
    this.severityDays5 = severityDays5;
  }

  /**
  * Sets the SeverityDays6 field.
  *
  * @param severityDays6
  */
  public void setSeverityDays6( final Integer severityDays6 ) {
    this.severityDays6 = severityDays6;
  }

  /**
  * Sets the DeliveryReason field.
  *
  * @param deliveryReason
  */
  public void setDeliveryReason( final String deliveryReason ) {
    this.deliveryReason = getPadded(deliveryReason, deliveryReasonFilter);
  }

  /**
  * Sets the ShipperCode1 field.
  *
  * @param shipperCode1
  */
  public void setShipperCode1( final String shipperCode1 ) {
    this.shipperCode1 = getPadded(shipperCode1, shipperCode1Filter);
  }

  /**
  * Sets the ShipperCode2 field.
  *
  * @param shipperCode2
  */
  public void setShipperCode2( final String shipperCode2 ) {
    this.shipperCode2 = getPadded(shipperCode2, shipperCode2Filter);
  }

  /**
  * Sets the ShipperCode3 field.
  *
  * @param shipperCode3
  */
  public void setShipperCode3( final String shipperCode3 ) {
    this.shipperCode3 = getPadded(shipperCode3, shipperCode3Filter);
  }

  /**
  * Sets the ShippingNoteInd field.
  *
  * @param shippingNoteInd
  */
  public void setShippingNoteInd( final String shippingNoteInd ) {
    this.shippingNoteInd = getPadded(shippingNoteInd, shippingNoteIndFilter);
  }

  /**
  * Sets the AccountType field.
  *
  * @param accountType
  */
  public void setAccountType( final String accountType ) {
    this.accountType = getPadded(accountType, accountTypeFilter);
  }

  /**
  * Sets the AdminFee field.
  *
  * @param adminFee
  */
  public void setAdminFee( final String adminFee ) {
    this.adminFee = getPadded(adminFee, adminFeeFilter);
  }

  /**
  * Sets the IntrestRate field.
  *
  * @param intrestRate
  */
  public void setIntrestRate( final String intrestRate ) {
    this.intrestRate = getPadded(intrestRate, intrestRateFilter);
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
