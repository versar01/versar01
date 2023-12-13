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
 * A value object to carry the data for an Opservm.
 *
 *
 * <H3> An Opservm is: </H3>
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
 * <H3> Opservm Value Object: </H3>
 *
 * <!-- indent text -->
 * <TABLE BORDER="0" CELLPADDING="0" CELLSPACING="0">
 * <TR>
 * <TD WIDTH="25">&nbsp;</TD>
 * <TD>
 *
 * <P>
 *     This is a value object (called a Data Model Object or 'DMO').
 *     It is used to pass the data for an opservm into and out of the BASE module.
 *     Because it's purpose is to carry data into and out of the module it is visible outside the module.
 * </P>
 * <P>
 *     This value object carries the data for one opservm. An opservm is:
 * DOCUMENT ME! - by adding a description of this class via the class diagram.
 * </P>
 * <P>
 *     It corresponds to the business logic object Opservm which
 *     contains all the business behaviour of an opservm but is not visible outside the
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
 *    This value object contains fields for all the details of an opservm, namely:
 * </P>
 *


 * <P>
 *    <U>Fields to carry the Attributes of an opservm:</U>
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
 *   <TD ALIGN="left" VALIGN="top"><B>product</B></TD>
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
 *       <A HREF="#getProduct()">
 *           getProduct
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setProduct(java.lang.String)">
 *           setProduct (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>description</B></TD>
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
 *       <A HREF="#getDescription()">
 *           getDescription
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setDescription(java.lang.String)">
 *           setDescription (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>longDescription</B></TD>
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
 *       <A HREF="#getLongDescription()">
 *           getLongDescription
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setLongDescription(java.lang.String)">
 *           setLongDescription (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>unitOfSale</B></TD>
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
 *       <A HREF="#getUnitOfSale()">
 *           getUnitOfSale
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setUnitOfSale(java.lang.String)">
 *           setUnitOfSale (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>vatCategory</B></TD>
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
 *       <A HREF="#getVatCategory()">
 *           getVatCategory
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setVatCategory(java.lang.String)">
 *           setVatCategory (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>prodDiscCode</B></TD>
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
 *       <A HREF="#getProdDiscCode()">
 *           getProdDiscCode
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setProdDiscCode(java.lang.String)">
 *           setProdDiscCode (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>nominalCategory</B></TD>
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
 *       <A HREF="#getNominalCategory()">
 *           getNominalCategory
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setNominalCategory(java.lang.String)">
 *           setNominalCategory (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>productGroupA</B></TD>
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
 *       <A HREF="#getProductGroupA()">
 *           getProductGroupA
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setProductGroupA(java.lang.String)">
 *           setProductGroupA (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>productGroupB</B></TD>
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
 *       <A HREF="#getProductGroupB()">
 *           getProductGroupB
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setProductGroupB(java.lang.String)">
 *           setProductGroupB (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>productGroupC</B></TD>
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
 *       <A HREF="#getProductGroupC()">
 *           getProductGroupC
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setProductGroupC(java.lang.String)">
 *           setProductGroupC (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>listPrice</B></TD>
 *   <TD ALIGN="left" VALIGN="top">BigDecimal</TD>
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
 *       <A HREF="#getListPrice()">
 *           getListPrice
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setListPrice(java.math.BigDecimal)">
 *           setListPrice (BigDecimal)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>cost</B></TD>
 *   <TD ALIGN="left" VALIGN="top">BigDecimal</TD>
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
 *       <A HREF="#getCost()">
 *           getCost
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setCost(java.math.BigDecimal)">
 *           setCost (BigDecimal)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>weight</B></TD>
 *   <TD ALIGN="left" VALIGN="top">BigDecimal</TD>
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
 *       <A HREF="#getWeight()">
 *           getWeight
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setWeight(java.math.BigDecimal)">
 *           setWeight (BigDecimal)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>unitGroup</B></TD>
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
 *       <A HREF="#getUnitGroup()">
 *           getUnitGroup
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setUnitGroup(java.lang.String)">
 *           setUnitGroup (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>vatInclusiveFlag</B></TD>
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
 *       <A HREF="#getVatInclusiveFlag()">
 *           getVatInclusiveFlag
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setVatInclusiveFlag(java.lang.String)">
 *           setVatInclusiveFlag (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>unitQtyPerPrice</B></TD>
 *   <TD ALIGN="left" VALIGN="top">BigDecimal</TD>
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
 *       <A HREF="#getUnitQtyPerPrice()">
 *           getUnitQtyPerPrice
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setUnitQtyPerPrice(java.math.BigDecimal)">
 *           setUnitQtyPerPrice (BigDecimal)
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
 *   <TD ALIGN="left" VALIGN="top"><B>stageCategory</B></TD>
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
 *       <A HREF="#getStageCategory()">
 *           getStageCategory
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setStageCategory(java.lang.String)">
 *           setStageCategory (String)
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


 * @see Opservm
 *
 * @author
 * @version $Revision: $
 *
 * @since $jdk$
 */
public class OpservmDMO
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
      FIELD_TYPE_STRING /* std public attribute: product  */,
      FIELD_TYPE_STRING /* std public attribute: description  */,
      FIELD_TYPE_STRING /* std public attribute: longDescription  */,
      FIELD_TYPE_STRING /* std public attribute: unitOfSale  */,
      FIELD_TYPE_STRING /* std public attribute: vatCategory  */,
      FIELD_TYPE_STRING /* std public attribute: prodDiscCode  */,
      FIELD_TYPE_STRING /* std public attribute: nominalCategory  */,
      FIELD_TYPE_STRING /* std public attribute: productGroupA  */,
      FIELD_TYPE_STRING /* std public attribute: productGroupB  */,
      FIELD_TYPE_STRING /* std public attribute: productGroupC  */,
      FIELD_TYPE_BIGDECIMAL /* std public attribute: listPrice  */,
      FIELD_TYPE_BIGDECIMAL /* std public attribute: cost  */,
      FIELD_TYPE_BIGDECIMAL /* std public attribute: weight  */,
      FIELD_TYPE_STRING /* std public attribute: unitGroup  */,
      FIELD_TYPE_STRING /* std public attribute: vatInclusiveFlag  */,
      FIELD_TYPE_BIGDECIMAL /* std public attribute: unitQtyPerPrice  */,
      FIELD_TYPE_STRING /* std public attribute: vatType  */,
      FIELD_TYPE_STRING /* std public attribute: stageCategory  */
    };
  
  private final int[] fieldSizes = new int[] {
		  productSize,
		  descriptionSize,
		  longDescriptionSize,
		  unitOfSaleSize,
		  vatCategorySize,
		  prodDiscCodeSize,
		  nominalCategorySize,
		  productGroupASize,
		  productGroupBSize,
		  productGroupCSize,
		  0,
		  costFilter,
		  0,
		  unitGroupSize,
		  vatInclusiveFlagSize,
		  0,
		  vatTypeSize,
		  stageCategorySize
  };
      

  public int[] fieldSizes() {
  	return fieldSizes;
  }  

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int productFilter = 0; // filter index
  private static final int productSize = 20; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int descriptionFilter = 1; // filter index
  private static final int descriptionSize = 20; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int longDescriptionFilter = 2; // filter index
  private static final int longDescriptionSize = 40; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int unitOfSaleFilter = 3; // filter index
  private static final int unitOfSaleSize = 10; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int vatCategoryFilter = 4; // filter index
  private static final int vatCategorySize = 1; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int prodDiscCodeFilter = 5; // filter index
  private static final int prodDiscCodeSize = 4; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int nominalCategoryFilter = 6; // filter index
  private static final int nominalCategorySize = 3; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int productGroupAFilter = 7; // filter index
  private static final int productGroupASize = 10; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int productGroupBFilter = 8; // filter index
  private static final int productGroupBSize = 10; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int productGroupCFilter = 9; // filter index
  private static final int productGroupCSize = 10; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int listPriceFilter = 10; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int costFilter = 11; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int weightFilter = 12; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int unitGroupFilter = 13; // filter index
  private static final int unitGroupSize = 1; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int vatInclusiveFlagFilter = 14; // filter index
  private static final int vatInclusiveFlagSize = 1; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int unitQtyPerPriceFilter = 15; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int vatTypeFilter = 16; // filter index
  private static final int vatTypeSize = 10; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int stageCategoryFilter = 17; // filter index
  private static final int stageCategorySize = 10; // field size

  //~ Instance variables /////////////////////////////////////////////////////

  private BigDecimal cost; // Loaded from Schema
  private BigDecimal listPrice; // Loaded from Schema
  private BigDecimal unitQtyPerPrice; // Loaded from Schema
  private BigDecimal weight; // Loaded from Schema
  private String description; // Loaded from Schema
  private String longDescription; // Loaded from Schema
  private String nominalCategory; // Loaded from Schema
  private String prodDiscCode; // Loaded from Schema

  //---------------------
  // Field declarations
  //---------------------
  // all attributes
  private String product; // Loaded from Schema
  private String productGroupA; // Loaded from Schema
  private String productGroupB; // Loaded from Schema
  private String productGroupC; // Loaded from Schema
  private String stageCategory; // Loaded from Schema
  private String unitGroup; // Loaded from Schema
  private String unitOfSale; // Loaded from Schema
  private String vatCategory; // Loaded from Schema
  private String vatInclusiveFlag; // Loaded from Schema
  private String vatType; // Loaded from Schema

  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new OpservmDMO object.
   */
  public OpservmDMO(  ) {
  }

  // Constructor - taking public attributes
  /**
   * Creates a new OpservmDMO object.
   *
   * @param product DOCUMENT ME!
   * @param description DOCUMENT ME!
   * @param longDescription DOCUMENT ME!
   * @param unitOfSale DOCUMENT ME!
   * @param vatCategory DOCUMENT ME!
   * @param prodDiscCode DOCUMENT ME!
   * @param nominalCategory DOCUMENT ME!
   * @param productGroupA DOCUMENT ME!
   * @param productGroupB DOCUMENT ME!
   * @param productGroupC DOCUMENT ME!
   * @param listPrice DOCUMENT ME!
   * @param cost DOCUMENT ME!
   * @param weight DOCUMENT ME!
   * @param unitGroup DOCUMENT ME!
   * @param vatInclusiveFlag DOCUMENT ME!
   * @param unitQtyPerPrice DOCUMENT ME!
   * @param vatType DOCUMENT ME!
   * @param stageCategory DOCUMENT ME!
   */
  public OpservmDMO( 
    final String     product,
    final String     description,
    final String     longDescription,
    final String     unitOfSale,
    final String     vatCategory,
    final String     prodDiscCode,
    final String     nominalCategory,
    final String     productGroupA,
    final String     productGroupB,
    final String     productGroupC,
    final BigDecimal listPrice,
    final BigDecimal cost,
    final BigDecimal weight,
    final String     unitGroup,
    final String     vatInclusiveFlag,
    final BigDecimal unitQtyPerPrice,
    final String     vatType,
    final String     stageCategory ) {
    this.product = product;

    this.description = description;

    this.longDescription = longDescription;

    this.unitOfSale = unitOfSale;

    this.vatCategory = vatCategory;

    this.prodDiscCode = prodDiscCode;

    this.nominalCategory = nominalCategory;

    this.productGroupA = productGroupA;

    this.productGroupB = productGroupB;

    this.productGroupC = productGroupC;

    this.listPrice = listPrice;

    this.cost = cost;

    this.weight = weight;

    this.unitGroup = unitGroup;

    this.vatInclusiveFlag = vatInclusiveFlag;

    this.unitQtyPerPrice = unitQtyPerPrice;

    this.vatType = vatType;

    this.stageCategory = stageCategory;
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
    return new DAOArgs( 1 ).arg( ( this.product == null ) ? null
                                                          : this.product.trim(  ) );
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
      ( product == null ) ? null
                          : ( ( product.length(  ) <= productSize ) ? product
                                                                    : product
      .substring( 0, productSize ) // auto trimmed to fit, if required.
       ),
      ( description == null ) ? null
                              : ( ( description.length(  ) <= descriptionSize )
      ? description
      : description.substring( 0, descriptionSize ) // auto trimmed to fit, if required.
       ),
      ( longDescription == null ) ? null
                                  : ( ( longDescription.length(  ) <= longDescriptionSize )
      ? longDescription
      : longDescription.substring( 0, longDescriptionSize ) // auto trimmed to fit, if required.
       ),
      ( unitOfSale == null ) ? null
                             : ( ( unitOfSale.length(  ) <= unitOfSaleSize )
      ? unitOfSale
      : unitOfSale.substring( 0, unitOfSaleSize ) // auto trimmed to fit, if required.
       ),
      ( vatCategory == null ) ? null
                              : ( ( vatCategory.length(  ) <= vatCategorySize )
      ? vatCategory
      : vatCategory.substring( 0, vatCategorySize ) // auto trimmed to fit, if required.
       ),
      ( prodDiscCode == null ) ? null
                               : ( ( prodDiscCode.length(  ) <= prodDiscCodeSize )
      ? prodDiscCode
      : prodDiscCode.substring( 0, prodDiscCodeSize ) // auto trimmed to fit, if required.
       ),
      ( nominalCategory == null ) ? null
                                  : ( ( nominalCategory.length(  ) <= nominalCategorySize )
      ? nominalCategory
      : nominalCategory.substring( 0, nominalCategorySize ) // auto trimmed to fit, if required.
       ),
      ( productGroupA == null ) ? null
                                : ( ( productGroupA.length(  ) <= productGroupASize )
      ? productGroupA
      : productGroupA.substring( 0, productGroupASize ) // auto trimmed to fit, if required.
       ),
      ( productGroupB == null ) ? null
                                : ( ( productGroupB.length(  ) <= productGroupBSize )
      ? productGroupB
      : productGroupB.substring( 0, productGroupBSize ) // auto trimmed to fit, if required.
       ),
      ( productGroupC == null ) ? null
                                : ( ( productGroupC.length(  ) <= productGroupCSize )
      ? productGroupC
      : productGroupC.substring( 0, productGroupCSize ) // auto trimmed to fit, if required.
       ), listPrice, cost, weight,
      ( unitGroup == null ) ? null
                            : ( ( unitGroup.length(  ) <= unitGroupSize )
      ? unitGroup
      : unitGroup.substring( 0, unitGroupSize ) // auto trimmed to fit, if required.
       ),
      ( vatInclusiveFlag == null ) ? null
                                   : ( ( vatInclusiveFlag.length(  ) <= vatInclusiveFlagSize )
      ? vatInclusiveFlag
      : vatInclusiveFlag.substring( 0, vatInclusiveFlagSize ) // auto trimmed to fit, if required.
       ), unitQtyPerPrice,
      ( vatType == null ) ? null
                          : ( ( vatType.length(  ) <= vatTypeSize ) ? vatType
                                                                    : vatType
      .substring( 0, vatTypeSize ) // auto trimmed to fit, if required.
       ),
      ( stageCategory == null ) ? null
                                : ( ( stageCategory.length(  ) <= stageCategorySize )
      ? stageCategory
      : stageCategory.substring( 0, stageCategorySize ) // auto trimmed to fit, if required.
       )
    };
  }

  /**
   * DOCUMENT ME!
   *
   * @param fields DOCUMENT ME!
   */
  protected void set( final Object[] fields ) {
    product = rtrim( (String) fields[0] );
    description = rtrim( (String) fields[1] );
    longDescription = rtrim( (String) fields[2] );
    unitOfSale = rtrim( (String) fields[3] );
    vatCategory = rtrim( (String) fields[4] );
    prodDiscCode = rtrim( (String) fields[5] );
    nominalCategory = rtrim( (String) fields[6] );
    productGroupA = rtrim( (String) fields[7] );
    productGroupB = rtrim( (String) fields[8] );
    productGroupC = rtrim( (String) fields[9] );
    listPrice = (BigDecimal) fields[10];
    cost = (BigDecimal) fields[11];
    weight = (BigDecimal) fields[12];
    unitGroup = rtrim( (String) fields[13] );
    vatInclusiveFlag = rtrim( (String) fields[14] );
    unitQtyPerPrice = (BigDecimal) fields[15];
    vatType = rtrim( (String) fields[16] );
    stageCategory = rtrim( (String) fields[17] );
  }

  // Get methods ///////////////////////////////////////////////////////////////
  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getProduct(  ) {
    return product;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getDescription(  ) {
    return description;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getLongDescription(  ) {
    return longDescription;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getUnitOfSale(  ) {
    return unitOfSale;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getVatCategory(  ) {
    return vatCategory;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getProdDiscCode(  ) {
    return prodDiscCode;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getNominalCategory(  ) {
    return nominalCategory;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getProductGroupA(  ) {
    return productGroupA;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getProductGroupB(  ) {
    return productGroupB;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getProductGroupC(  ) {
    return productGroupC;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public BigDecimal getListPrice(  ) {
    return listPrice;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public BigDecimal getCost(  ) {
    return cost;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public BigDecimal getWeight(  ) {
    return weight;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getUnitGroup(  ) {
    return unitGroup;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getVatInclusiveFlag(  ) {
    return vatInclusiveFlag;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public BigDecimal getUnitQtyPerPrice(  ) {
    return unitQtyPerPrice;
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
  public String getStageCategory(  ) {
    return stageCategory;
  }

  // Setter methods ///////////////////////////////////////////////////////////////

  //
  // Master setter follows...
  //

  /**
   * Setter that takes all attributes
   */
  public void set( 
    final String     product,
    final String     description,
    final String     longDescription,
    final String     unitOfSale,
    final String     vatCategory,
    final String     prodDiscCode,
    final String     nominalCategory,
    final String     productGroupA,
    final String     productGroupB,
    final String     productGroupC,
    final BigDecimal listPrice,
    final BigDecimal cost,
    final BigDecimal weight,
    final String     unitGroup,
    final String     vatInclusiveFlag,
    final BigDecimal unitQtyPerPrice,
    final String     vatType,
    final String     stageCategory ) {
    this.product = product;
    this.description = description;
    this.longDescription = longDescription;
    this.unitOfSale = unitOfSale;
    this.vatCategory = vatCategory;
    this.prodDiscCode = prodDiscCode;
    this.nominalCategory = nominalCategory;
    this.productGroupA = productGroupA;
    this.productGroupB = productGroupB;
    this.productGroupC = productGroupC;
    this.listPrice = listPrice;
    this.cost = cost;
    this.weight = weight;
    this.unitGroup = unitGroup;
    this.vatInclusiveFlag = vatInclusiveFlag;
    this.unitQtyPerPrice = unitQtyPerPrice;
    this.vatType = vatType;
    this.stageCategory = stageCategory;
  }

  //
  // Public access modifiers if any
  // (provided for attributes that are public in the analysis model)
  //    

  /**
  * Sets the Product field.
  *
  * @param product
  */
  public void setProduct( final String product ) {
    this.product = getPadded(product, productFilter);
  }

  /**
  * Sets the Description field.
  *
  * @param description
  */
  public void setDescription( final String description ) {
    this.description = getPadded(description, descriptionFilter);
  }

  /**
  * Sets the LongDescription field.
  *
  * @param longDescription
  */
  public void setLongDescription( final String longDescription ) {
    this.longDescription = getPadded(longDescription, longDescriptionFilter);
  }

  /**
  * Sets the UnitOfSale field.
  *
  * @param unitOfSale
  */
  public void setUnitOfSale( final String unitOfSale ) {
    this.unitOfSale = getPadded(unitOfSale, unitOfSaleFilter);
  }

  /**
  * Sets the VatCategory field.
  *
  * @param vatCategory
  */
  public void setVatCategory( final String vatCategory ) {
    this.vatCategory = getPadded(vatCategory, vatCategoryFilter);
  }

  /**
  * Sets the ProdDiscCode field.
  *
  * @param prodDiscCode
  */
  public void setProdDiscCode( final String prodDiscCode ) {
    this.prodDiscCode = getPadded(prodDiscCode, prodDiscCodeFilter);
  }

  /**
  * Sets the NominalCategory field.
  *
  * @param nominalCategory
  */
  public void setNominalCategory( final String nominalCategory ) {
    this.nominalCategory = getPadded(nominalCategory, nominalCategoryFilter);
  }

  /**
  * Sets the ProductGroupA field.
  *
  * @param productGroupA
  */
  public void setProductGroupA( final String productGroupA ) {
    this.productGroupA = getPadded(productGroupA, productGroupAFilter);
  }

  /**
  * Sets the ProductGroupB field.
  *
  * @param productGroupB
  */
  public void setProductGroupB( final String productGroupB ) {
    this.productGroupB = getPadded(productGroupB, productGroupBFilter);
  }

  /**
  * Sets the ProductGroupC field.
  *
  * @param productGroupC
  */
  public void setProductGroupC( final String productGroupC ) {
    this.productGroupC = getPadded(productGroupC, productGroupCFilter);
  }

  /**
  * Sets the ListPrice field.
  *
  * @param listPrice
  */
  public void setListPrice( final BigDecimal listPrice ) {
    this.listPrice = listPrice;
  }

  /**
  * Sets the ListPrice field.
  *
  * @param listPrice
  */
  public void setListPrice( final double listPrice ) {
    this.listPrice = new BigDecimal( listPrice );
  }

  /**
  * Sets the Cost field.
  *
  * @param cost
  */
  public void setCost( final BigDecimal cost ) {
    this.cost = cost;
  }

  /**
  * Sets the Cost field.
  *
  * @param cost
  */
  public void setCost( final double cost ) {
    this.cost = new BigDecimal( cost );
  }

  /**
  * Sets the Weight field.
  *
  * @param weight
  */
  public void setWeight( final BigDecimal weight ) {
    this.weight = weight;
  }

  /**
  * Sets the Weight field.
  *
  * @param weight
  */
  public void setWeight( final double weight ) {
    this.weight = new BigDecimal( weight );
  }

  /**
  * Sets the UnitGroup field.
  *
  * @param unitGroup
  */
  public void setUnitGroup( final String unitGroup ) {
    this.unitGroup = getPadded(unitGroup, unitGroupFilter);
  }

  /**
  * Sets the VatInclusiveFlag field.
  *
  * @param vatInclusiveFlag
  */
  public void setVatInclusiveFlag( final String vatInclusiveFlag ) {
    this.vatInclusiveFlag = getPadded(vatInclusiveFlag, vatInclusiveFlagFilter);
  }

  /**
  * Sets the UnitQtyPerPrice field.
  *
  * @param unitQtyPerPrice
  */
  public void setUnitQtyPerPrice( final BigDecimal unitQtyPerPrice ) {
    this.unitQtyPerPrice = unitQtyPerPrice;
  }

  /**
  * Sets the UnitQtyPerPrice field.
  *
  * @param unitQtyPerPrice
  */
  public void setUnitQtyPerPrice( final double unitQtyPerPrice ) {
    this.unitQtyPerPrice = new BigDecimal( unitQtyPerPrice );
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
  * Sets the StageCategory field.
  *
  * @param stageCategory
  */
  public void setStageCategory( final String stageCategory ) {
    this.stageCategory = getPadded(stageCategory, stageCategoryFilter);
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
