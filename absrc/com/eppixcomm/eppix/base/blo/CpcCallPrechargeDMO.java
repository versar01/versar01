package com.eppixcomm.eppix.base.blo;

import java.io.Serializable;
import java.math.BigDecimal;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;
import com.eppixcomm.eppix.common.util.Date;

//---------------------
// class javadoc
//---------------------
/**
 * A value object to carry the data for a CpcCallPrecharge.
 *
 *
 * <H3> A CpcCallPrecharge is: </H3>
 *
 * <!-- indent text -->
 * <TABLE BORDER="0" CELLPADDING="0" CELLSPACING="0">
 * <TR>
 * <TD WIDTH="25">&nbsp;</TD>
 * <TD>
 *
 * This table holds call pre-charge details.
 *
 * <!-- end indent text -->
 * </TD>
 * </TR>
 * </TABLE>
 *
 *
 * <H3> CpcCallPrecharge Value Object: </H3>
 *
 * <!-- indent text -->
 * <TABLE BORDER="0" CELLPADDING="0" CELLSPACING="0">
 * <TR>
 * <TD WIDTH="25">&nbsp;</TD>
 * <TD>
 *
 * <P>
 *     This is a value object (called a Data Model Object or 'DMO').
 *     It is used to pass the data for a cpcCallPrecharge into and out of the BASE module.
 *     Because it's purpose is to carry data into and out of the module it is visible outside the module.
 * </P>
 * <P>
 *     This value object carries the data for one cpcCallPrecharge. A cpcCallPrecharge is:
 * This table holds call pre-charge details.
 * </P>
 * <P>
 *     It corresponds to the business logic object CpcCallPrecharge which
 *     contains all the business behaviour of a cpcCallPrecharge but is not visible outside the
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
 *    This value object contains fields for all the details of a cpcCallPrecharge, namely:
 * </P>
 *


 * <P>
 *    <U>Fields to carry the Attributes of a cpcCallPrecharge:</U>
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
 *   <TD ALIGN="left" VALIGN="top"><B>cpcId</B></TD>
 *   <TD ALIGN="left" VALIGN="top">Integer</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Call Precharge ID
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
 *       <A HREF="#getCpcId()">
 *           getCpcId
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setCpcId(java.lang.Integer)">
 *           setCpcId (Integer)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>cpcSubscriber</B></TD>
 *   <TD ALIGN="left" VALIGN="top">Integer</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Subscriber ID
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
 *       <A HREF="#getCpcSubscriber()">
 *           getCpcSubscriber
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setCpcSubscriber(java.lang.Integer)">
 *           setCpcSubscriber (Integer)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>cpcDiallingNo</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Dialling number for which this call pre-charge has been generated.
 *       <p>
 *         (changed from cpc_msisdn for version 6.00)
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
 *       <A HREF="#getCpcDiallingNo()">
 *           getCpcDiallingNo
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setCpcDiallingNo(java.lang.String)">
 *           setCpcDiallingNo (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>cpcSimNo</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Sim_no to which Msisdn_no belongs.
 *       <p>
 *         (changed from cpc_sim_no for version 6.00)
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
 *       <A HREF="#getCpcSimNo()">
 *           getCpcSimNo
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setCpcSimNo(java.lang.String)">
 *           setCpcSimNo (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>cpcNetworkId</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Network to which Msisdn relates
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
 *       <A HREF="#getCpcNetworkId()">
 *           getCpcNetworkId
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setCpcNetworkId(java.lang.String)">
 *           setCpcNetworkId (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>cpcChargeCode</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Links to chg_code.
 *       <p>
 *         A charge code which is identified as a calls pre-charge charge code in tt_type_text group "CALLPRECHG"
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
 *       <A HREF="#getCpcChargeCode()">
 *           getCpcChargeCode
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setCpcChargeCode(java.lang.String)">
 *           setCpcChargeCode (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>cpcPrechargeDate</B></TD>
 *   <TD ALIGN="left" VALIGN="top">Date</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Date of the charge to which this pre-charge record relates.
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
 *       <A HREF="#getCpcPrechargeDate()">
 *           getCpcPrechargeDate
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setCpcPrechargeDate(com.cmgwds.eppix.util.Date)">
 *           setCpcPrechargeDate (Date)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>cpcAmount</B></TD>
 *   <TD ALIGN="left" VALIGN="top">BigDecimal</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Value of the pre-charge
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
 *       <A HREF="#getCpcAmount()">
 *           getCpcAmount
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setCpcAmount(java.math.BigDecimal)">
 *           setCpcAmount (BigDecimal)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>cpcRemaining</B></TD>
 *   <TD ALIGN="left" VALIGN="top">BigDecimal</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Value remaining after credits against call charges
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
 *       <A HREF="#getCpcRemaining()">
 *           getCpcRemaining
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setCpcRemaining(java.math.BigDecimal)">
 *           setCpcRemaining (BigDecimal)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>cpcCreatedDate</B></TD>
 *   <TD ALIGN="left" VALIGN="top">Date</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Date on which the pre-charge was created
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
 *       <A HREF="#getCpcCreatedDate()">
 *           getCpcCreatedDate
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setCpcCreatedDate(com.cmgwds.eppix.util.Date)">
 *           setCpcCreatedDate (Date)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>cpcLastBilldate</B></TD>
 *   <TD ALIGN="left" VALIGN="top">Date</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Billdate of most recent invoice for which this pre-charge generated a credit
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
 *       <A HREF="#getCpcLastBilldate()">
 *           getCpcLastBilldate
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setCpcLastBilldate(com.cmgwds.eppix.util.Date)">
 *           setCpcLastBilldate (Date)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>cpcLastInvoice</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Most recent invoice for which this pre-charge generated a credit
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
 *       <A HREF="#getCpcLastInvoice()">
 *           getCpcLastInvoice
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setCpcLastInvoice(java.lang.String)">
 *           setCpcLastInvoice (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>cpcLastCredit</B></TD>
 *   <TD ALIGN="left" VALIGN="top">BigDecimal</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Value of most recent credit generated from this pre-charge
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
 *       <A HREF="#getCpcLastCredit()">
 *           getCpcLastCredit
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setCpcLastCredit(java.math.BigDecimal)">
 *           setCpcLastCredit (BigDecimal)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>cpcTechnology</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Technology of the current Dialling/Sim no.
 *       <p>
 *         (Added for version 6.00)
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
 *       <A HREF="#getCpcTechnology()">
 *           getCpcTechnology
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setCpcTechnology(java.lang.String)">
 *           setCpcTechnology (String)
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


 * @see CpcCallPrecharge
 *
 * @author
 * @version $Revision: $
 *
 * @since $jdk$
 */
public class CpcCallPrechargeDMO  extends DBO
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
      FIELD_TYPE_INTEGER /* std public attribute: cpcId  */,
      FIELD_TYPE_INTEGER /* std public attribute: cpcSubscriber  */,
      FIELD_TYPE_STRING /* std public attribute: cpcMsisdnNo  */,
      FIELD_TYPE_STRING /* std public attribute: cpcSimNo  */,
      FIELD_TYPE_STRING /* std public attribute: cpcNetworkId  */,
      FIELD_TYPE_STRING /* std public attribute: cpcChargeCode  */,
      FIELD_TYPE_DATEONLY /* std public attribute: cpcPrechargeDate  */,
      FIELD_TYPE_BIGDECIMAL /* std public attribute: cpcAmount  */,
      FIELD_TYPE_BIGDECIMAL /* std public attribute: cpcRemaining  */,
      FIELD_TYPE_DATEONLY /* std public attribute: cpcCreatedDate  */,
      FIELD_TYPE_DATEONLY /* std public attribute: cpcLastBilldate  */,
      FIELD_TYPE_STRING /* std public attribute: cpcLastInvoice  */,
      FIELD_TYPE_BIGDECIMAL /* std public attribute: cpcLastCredit  */
    };
  
  protected int[] fieldSizes = new int[]{
		  0,
		  0,
		  cpcMsisdnSize,
		  cpcSimSize,
		  cpcNetworkIdSize,
		  cpcChargeCodeSize,
		  0,
		  cpcAmountFilter,
		  0,
		  0,
		  0,
		  cpcLastInvoiceSize,
		  0
  };
  
  protected int[] fieldSizes() {
		return fieldSizes;
	}

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int cpcIdFilter = 0; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int cpcSubscriberFilter = 1; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int cpcMsisdnFilter = 2; // filter index
  private static final int cpcMsisdnSize = 15; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int cpcSimNoFilter = 3; // filter index
  private static final int cpcSimSize = 25; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int cpcNetworkIdFilter = 4; // filter index
  private static final int cpcNetworkIdSize = 5; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int cpcChargeCodeFilter = 5; // filter index
  private static final int cpcChargeCodeSize = 5; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int cpcPrechargeDateFilter = 6; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int cpcAmountFilter = 7; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int cpcRemainingFilter = 8; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int cpcCreatedDateFilter = 9; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int cpcLastBilldateFilter = 10; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int cpcLastInvoiceFilter = 11; // filter index
  private static final int cpcLastInvoiceSize = 10; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int cpcLastCreditFilter = 12; // filter index

  //~ Instance variables /////////////////////////////////////////////////////

  private BigDecimal cpcAmount; // Loaded from Schema
  private BigDecimal cpcLastCredit; // Loaded from Schema
  private BigDecimal cpcRemaining; // Loaded from Schema
  private Date cpcCreatedDate; // Loaded from Schema
  private Date cpcLastBilldate; // Loaded from Schema
  private Date cpcPrechargeDate; // Loaded from Schema

  //---------------------
  // Field declarations
  //---------------------
  // all attributes
  private Integer cpcId; // Loaded from Schema
  private Integer cpcSubscriber; // Loaded from Schema
  private String cpcChargeCode; // Loaded from Schema
  private String cpcMsisdn; // Loaded from Schema
  private String cpcLastInvoice; // Loaded from Schema
  private String cpcNetworkId; // Loaded from Schema
  private String cpcSimNo; // Loaded from Schema
  

  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new CpcCallPrechargeDMO object.
   */
  public CpcCallPrechargeDMO(  ) {
  }

  // Constructor - taking public attributes
  /**
   * Creates a new CpcCallPrechargeDMO object.
   *
   * @param cpcId DOCUMENT ME!
   * @param cpcSubscriber DOCUMENT ME!
   * @param cpcMsisdn DOCUMENT ME!
   * @param cpcSimNo DOCUMENT ME!
   * @param cpcNetworkId DOCUMENT ME!
   * @param cpcChargeCode DOCUMENT ME!
   * @param cpcPrechargeDate DOCUMENT ME!
   * @param cpcAmount DOCUMENT ME!
   * @param cpcRemaining DOCUMENT ME!
   * @param cpcCreatedDate DOCUMENT ME!
   * @param cpcLastBilldate DOCUMENT ME!
   * @param cpcLastInvoice DOCUMENT ME!
   * @param cpcLastCredit DOCUMENT ME!
   */
  public CpcCallPrechargeDMO( 
		//  cpc_id
		//  cpc_subscriber
		//  cpc_msisdn
		//  cpc_sim_no
		//  cpc_network_id
		//  cpc_charge_code
		//  cpc_precharge_date
		//  cpc_amount
		//  cpc_remaining
		//  cpc_created_date
		//  cpc_last_billdate
		//  cpc_last_invoice
		//  cpc_last_credit
    final Integer    cpcId,
    final Integer    cpcSubscriber,
    final String     cpcMsisdn,
    final String     cpcSimNo,
    final String     cpcNetworkId,
    final String     cpcChargeCode,
    final Date       cpcPrechargeDate,
    final BigDecimal cpcAmount,
    final BigDecimal cpcRemaining,
    final Date       cpcCreatedDate,
    final Date       cpcLastBilldate,
    final String     cpcLastInvoice,
    final BigDecimal cpcLastCredit ) {
    this.cpcId = cpcId;

    this.cpcSubscriber = cpcSubscriber;

    this.cpcMsisdn = cpcMsisdn;

    this.cpcSimNo = cpcSimNo;

    this.cpcNetworkId = cpcNetworkId;

    this.cpcChargeCode = cpcChargeCode;

    this.cpcPrechargeDate = ( cpcPrechargeDate != null )
      ? new Date( cpcPrechargeDate ) : null;

    this.cpcAmount = cpcAmount;

    this.cpcRemaining = cpcRemaining;

    this.cpcCreatedDate = ( cpcCreatedDate != null )
      ? new Date( cpcCreatedDate ) : null;

    this.cpcLastBilldate = ( cpcLastBilldate != null )
      ? new Date( cpcLastBilldate ) : null;

    this.cpcLastInvoice = cpcLastInvoice;

    this.cpcLastCredit = cpcLastCredit;

  }
  


  //~ Methods ////////////////////////////////////////////////////////////////

  // DBO method implementations ////////////////////////////////////////////////

  /**
   * Sets the generated key ( cpcId ) value.
   *
   * @param key The generated key value.
   */
  protected void generatedKey( final Integer key ) {
    this.cpcId = key;
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
    return new DAOArgs( 1 ).arg( this.cpcId );
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
      cpcId, cpcSubscriber,
      ( cpcMsisdn == null ) ? null
                                : ( ( cpcMsisdn.length(  ) <= cpcMsisdnSize )
      ? cpcMsisdn
      : cpcMsisdn.substring( 0, cpcMsisdnSize ) // auto trimmed to fit, if required.
       ),
      ( cpcSimNo == null ) ? null
                              : ( ( cpcSimNo.length(  ) <= cpcSimSize )
      ? cpcSimNo
      : cpcSimNo.substring( 0, cpcSimSize ) // auto trimmed to fit, if required.
       ),
      ( cpcNetworkId == null ) ? null
                               : ( ( cpcNetworkId.length(  ) <= cpcNetworkIdSize )
      ? cpcNetworkId
      : cpcNetworkId.substring( 0, cpcNetworkIdSize ) // auto trimmed to fit, if required.
       ),
      ( cpcChargeCode == null ) ? null
                                : ( ( cpcChargeCode.length(  ) <= cpcChargeCodeSize )
      ? cpcChargeCode
      : cpcChargeCode.substring( 0, cpcChargeCodeSize ) // auto trimmed to fit, if required.
       ), cpcPrechargeDate, cpcAmount, cpcRemaining, cpcCreatedDate,
      cpcLastBilldate,
      ( cpcLastInvoice == null ) ? null
                                 : ( ( cpcLastInvoice.length(  ) <= cpcLastInvoiceSize )
      ? cpcLastInvoice
      : cpcLastInvoice.substring( 0, cpcLastInvoiceSize ) // auto trimmed to fit, if required.
       ), cpcLastCredit
    };
  }

  /**
   * DOCUMENT ME!
   *
   * @param fields DOCUMENT ME!
   */
  protected void set( final Object[] fields ) {
    cpcId = (Integer) fields[0];
    cpcSubscriber = (Integer) fields[1];
    cpcMsisdn = rtrim( (String) fields[2] );
    cpcSimNo = rtrim( (String) fields[3] );
    cpcNetworkId = rtrim( (String) fields[4] );
    cpcChargeCode = rtrim( (String) fields[5] );
    cpcPrechargeDate = (Date) fields[6];
    cpcAmount = (BigDecimal) fields[7];
    cpcRemaining = (BigDecimal) fields[8];
    cpcCreatedDate = (Date) fields[9];
    cpcLastBilldate = (Date) fields[10];
    cpcLastInvoice = rtrim( (String) fields[11] );
    cpcLastCredit = (BigDecimal) fields[12];
  }

  // Get methods ///////////////////////////////////////////////////////////////
  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public Integer getCpcId(  ) {
    return cpcId;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public Integer getCpcSubscriber(  ) {
    return cpcSubscriber;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getCpcMsisdn(  ) {
    return cpcMsisdn;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getCpcSimNo(  ) {
    return cpcSimNo;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getCpcNetworkId(  ) {
    return cpcNetworkId;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getCpcChargeCode(  ) {
    return cpcChargeCode;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public Date getCpcPrechargeDate(  ) {
    return ( cpcPrechargeDate != null ) ? new Date( cpcPrechargeDate ) : null;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public BigDecimal getCpcAmount(  ) {
    return cpcAmount;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public BigDecimal getCpcRemaining(  ) {
    return cpcRemaining;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public Date getCpcCreatedDate(  ) {
    return ( cpcCreatedDate != null ) ? new Date( cpcCreatedDate ) : null;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public Date getCpcLastBilldate(  ) {
    return ( cpcLastBilldate != null ) ? new Date( cpcLastBilldate ) : null;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getCpcLastInvoice(  ) {
    return cpcLastInvoice;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public BigDecimal getCpcLastCredit(  ) {
    return cpcLastCredit;
  }


  // Setter methods ///////////////////////////////////////////////////////////////

  //
  // Master setter follows...
  //

  /**
   * Setter that takes all attributes
   */
  public void set( 
    final Integer    cpcId,
    final Integer    cpcSubscriber,
    final String     cpcMsisdn,
    final String     cpcSimNo,
    final String     cpcNetworkId,
    final String     cpcChargeCode,
    final Date       cpcPrechargeDate,
    final BigDecimal cpcAmount,
    final BigDecimal cpcRemaining,
    final Date       cpcCreatedDate,
    final Date       cpcLastBilldate,
    final String     cpcLastInvoice,
    final BigDecimal cpcLastCredit,
    final String     cpcTechnology ) {
    this.cpcId = cpcId;
    this.cpcSubscriber = cpcSubscriber;
    this.cpcMsisdn = cpcMsisdn;
    this.cpcSimNo = cpcSimNo;
    this.cpcNetworkId = cpcNetworkId;
    this.cpcChargeCode = cpcChargeCode;
    this.cpcPrechargeDate = ( cpcPrechargeDate != null )
      ? new Date( cpcPrechargeDate ) : null;
    this.cpcAmount = cpcAmount;
    this.cpcRemaining = cpcRemaining;
    this.cpcCreatedDate = ( cpcCreatedDate != null )
      ? new Date( cpcCreatedDate ) : null;
    this.cpcLastBilldate = ( cpcLastBilldate != null )
      ? new Date( cpcLastBilldate ) : null;
    this.cpcLastInvoice = cpcLastInvoice;
    this.cpcLastCredit = cpcLastCredit;
  }

  //
  // Public access modifiers if any
  // (provided for attributes that are public in the analysis model)
  //    

  /**
  * Sets the CpcId field.
  *
  * @param cpcId
  */
  public void setCpcId( final Integer cpcId ) {
    this.cpcId = cpcId;
  }

  /**
  * Sets the CpcSubscriber field.
  *
  * @param cpcSubscriber
  */
  public void setCpcSubscriber( final Integer cpcSubscriber ) {
    this.cpcSubscriber = cpcSubscriber;
  }

  /**
  * Sets the CpcDiallingNo field.
  *
  * @param cpcDiallingNo
  */
  public void setCpcMsisdn( final String cpcMsisdn ) {
    this.cpcMsisdn = cpcMsisdn;
  }

  /**
  * Sets the CpcSimNo field.
  *
  * @param cpcSimNo
  */
  public void setCpcSimNo( final String cpcSimNo ) {
    this.cpcSimNo = cpcSimNo;
  }

  /**
  * Sets the CpcNetworkId field.
  *
  * @param cpcNetworkId
  */
  public void setCpcNetworkId( final String cpcNetworkId ) {
    this.cpcNetworkId = cpcNetworkId;
  }

  /**
  * Sets the CpcChargeCode field.
  *
  * @param cpcChargeCode
  */
  public void setCpcChargeCode( final String cpcChargeCode ) {
    this.cpcChargeCode = cpcChargeCode;
  }

  /**
  * Sets the CpcPrechargeDate field.
  *
  * @param cpcPrechargeDate
  */
  public void setCpcPrechargeDate( final Date cpcPrechargeDate ) {
    this.cpcPrechargeDate = ( cpcPrechargeDate != null )
      ? new Date( cpcPrechargeDate ) : null;
  }

  /**
  * Sets the CpcAmount field.
  *
  * @param cpcAmount
  */
  public void setCpcAmount( final BigDecimal cpcAmount ) {
    this.cpcAmount = cpcAmount;
  }

  /**
  * Sets the CpcAmount field.
  *
  * @param cpcAmount
  */
  public void setCpcAmount( final double cpcAmount ) {
    this.cpcAmount = new BigDecimal( cpcAmount );
  }

  /**
  * Sets the CpcRemaining field.
  *
  * @param cpcRemaining
  */
  public void setCpcRemaining( final BigDecimal cpcRemaining ) {
    this.cpcRemaining = cpcRemaining;
  }

  /**
  * Sets the CpcRemaining field.
  *
  * @param cpcRemaining
  */
  public void setCpcRemaining( final double cpcRemaining ) {
    this.cpcRemaining = new BigDecimal( cpcRemaining );
  }

  /**
  * Sets the CpcCreatedDate field.
  *
  * @param cpcCreatedDate
  */
  public void setCpcCreatedDate( final Date cpcCreatedDate ) {
    this.cpcCreatedDate = ( cpcCreatedDate != null )
      ? new Date( cpcCreatedDate ) : null;
  }

  /**
  * Sets the CpcLastBilldate field.
  *
  * @param cpcLastBilldate
  */
  public void setCpcLastBilldate( final Date cpcLastBilldate ) {
    this.cpcLastBilldate = ( cpcLastBilldate != null )
      ? new Date( cpcLastBilldate ) : null;
  }

  /**
  * Sets the CpcLastInvoice field.
  *
  * @param cpcLastInvoice
  */
  public void setCpcLastInvoice( final String cpcLastInvoice ) {
    this.cpcLastInvoice = cpcLastInvoice;
  }

  /**
  * Sets the CpcLastCredit field.
  *
  * @param cpcLastCredit
  */
  public void setCpcLastCredit( final BigDecimal cpcLastCredit ) {
    this.cpcLastCredit = cpcLastCredit;
  }

  /**
  * Sets the CpcLastCredit field.
  *
  * @param cpcLastCredit
  */
  public void setCpcLastCredit( final double cpcLastCredit ) {
    this.cpcLastCredit = new BigDecimal( cpcLastCredit );
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
