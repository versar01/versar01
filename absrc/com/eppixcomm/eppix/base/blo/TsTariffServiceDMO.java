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
import java.util.Arrays;
import java.util.List;

//---------------------
// class javadoc
//---------------------
/**
 * A value object to carry the data for a TsTariffService.
 *
 *
 * <H3> A TsTariffService is: </H3>
 *
 * <!-- indent text -->
 * <TABLE BORDER="0" CELLPADDING="0" CELLSPACING="0">
 * <TR>
 * <TD WIDTH="25">&nbsp;</TD>
 * <TD>
 *
 * Associating packages, tariffs and services.
 * <p>
 *   The TS_TARIFF_SERVICE table holds the charges applicable to a service on a specific tariff.
 * </p>
 *
 * <!-- end indent text -->
 * </TD>
 * </TR>
 * </TABLE>
 *
 *
 * <H3> TsTariffService Value Object: </H3>
 *
 * <!-- indent text -->
 * <TABLE BORDER="0" CELLPADDING="0" CELLSPACING="0">
 * <TR>
 * <TD WIDTH="25">&nbsp;</TD>
 * <TD>
 *
 * <P>
 *     This is a value object (called a Data Model Object or 'DMO').
 *     It is used to pass the data for a tsTariffService into and out of the BASE module.
 *     Because it's purpose is to carry data into and out of the module it is visible outside the module.
 * </P>
 * <P>
 *     This value object carries the data for one tsTariffService. A tsTariffService is:
 * Associating packages, tariffs and services.
 * </P>
 * <P>
 *     It corresponds to the business logic object TsTariffService which
 *     contains all the business behaviour of a tsTariffService but is not visible outside the
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
 *    This value object contains fields for all the details of a tsTariffService, namely:
 * </P>
 *


 * <P>
 *    <U>Fields to carry the Attributes of a tsTariffService:</U>
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
 *   <TD ALIGN="left" VALIGN="top"><B>tsPackageCode</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Package code.
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
 *       <A HREF="#getTsPackageCode()">
 *           getTsPackageCode
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setTsPackageCode(java.lang.String)">
 *           setTsPackageCode (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>tsInternalTariff</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Internal tariff.
 *       <p>
 *         If NULL then this indicates that the prices apply regardless of tariff and that there should be no entries for this
 *         package and service that specify a tariff.
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
 *       <A HREF="#getTsInternalTariff()">
 *           getTsInternalTariff
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setTsInternalTariff(java.lang.String)">
 *           setTsInternalTariff (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>tsServiceCode</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Service code.
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
 *       <A HREF="#getTsServiceCode()">
 *           getTsServiceCode
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setTsServiceCode(java.lang.String)">
 *           setTsServiceCode (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>tsNetServCode</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       This field holds a hardcode which is obtained from the table tt_type_text whose group is tt_group and is equal to "N2NGROUPS".
 *       <p>
 *         The value will actually determine what services are activated on the network and are obained from the table
 *         ngs_net_group_serv.
 *       </p>
 *       <p>
 *         This field will remain null if it is a non-network service and will have to have a value if it is a network service.
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
 *       <A HREF="#getTsNetServCode()">
 *           getTsNetServCode
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setTsNetServCode(java.lang.String)">
 *           setTsNetServCode (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>tsActCharge</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       One off activation charge.
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
 *       <A HREF="#getTsActCharge()">
 *           getTsActCharge
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setTsActCharge(java.lang.String)">
 *           setTsActCharge (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>tsTdeactCharge</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       One off temporary deactivation charge.
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
 *       <A HREF="#getTsTdeactCharge()">
 *           getTsTdeactCharge
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setTsTdeactCharge(java.lang.String)">
 *           setTsTdeactCharge (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>tsReactCharge</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Reactivation charge.
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
 *       <A HREF="#getTsReactCharge()">
 *           getTsReactCharge
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setTsReactCharge(java.lang.String)">
 *           setTsReactCharge (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>tsPdeactCharge</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       One off deactivation charge.
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
 *       <A HREF="#getTsPdeactCharge()">
 *           getTsPdeactCharge
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setTsPdeactCharge(java.lang.String)">
 *           setTsPdeactCharge (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>tsSubCharge1</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       First subscription charge for service.
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
 *       <A HREF="#getTsSubCharge1()">
 *           getTsSubCharge1
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setTsSubCharge1(java.lang.String)">
 *           setTsSubCharge1 (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>tsSubCharge2</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Second subscription charge for service.
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
 *       <A HREF="#getTsSubCharge2()">
 *           getTsSubCharge2
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setTsSubCharge2(java.lang.String)">
 *           setTsSubCharge2 (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>tsSubCharge3</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Third subscription charge for service.
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
 *       <A HREF="#getTsSubCharge3()">
 *           getTsSubCharge3
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setTsSubCharge3(java.lang.String)">
 *           setTsSubCharge3 (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>tsChargePeriod</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       The period which determines how often a service is to be billed.
 *       <p>
 *         Valid values include :- W = Weekly M = Monthly "W" and "M" are hard codes which will be recorded within the
 *         TT_TYPE_TEXT table under the group "BILLING".
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
 *       <A HREF="#getTsChargePeriod()">
 *           getTsChargePeriod
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setTsChargePeriod(java.lang.String)">
 *           setTsChargePeriod (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>tsChargeFreq</B></TD>
 *   <TD ALIGN="left" VALIGN="top">Short</TD>
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
 *       <A HREF="#getTsChargeFreq()">
 *           getTsChargeFreq
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setTsChargeFreq(java.lang.Short)">
 *           setTsChargeFreq (Short)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>tsDiscountRef</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       -
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
 *       <A HREF="#getTsDiscountRef()">
 *           getTsDiscountRef
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setTsDiscountRef(java.lang.String)">
 *           setTsDiscountRef (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>tsActInclusive</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Not used by EPPIX, May be used by third parties to set rules for Service/Tariff at activation.
 *       <p>
 *         N = No Rule D = Default at activation M = Mandatory at activation "D", "N"and "M" are hard codes which will be recorded
 *         within the TT_TYPE_TEXT table under the group "ACTINCLUDE".
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
 *       <A HREF="#getTsActInclusive()">
 *           getTsActInclusive
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setTsActInclusive(java.lang.String)">
 *           setTsActInclusive (String)
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


 * @see TsTariffService
 *
 * @author
 * @version $Revision: $
 *
 * @since $jdk$
 */
public class TsTariffServiceDMO
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
      FIELD_TYPE_STRING /* std public attribute: tsPackageCode  */,
      FIELD_TYPE_STRING /* std public attribute: tsInternalTariff  */,
      FIELD_TYPE_STRING /* std public attribute: tsServiceCode  */,
      FIELD_TYPE_STRING /* std public attribute: tsNetServCode  */,
      FIELD_TYPE_STRING /* std public attribute: tsActCharge  */,
      FIELD_TYPE_STRING /* std public attribute: tsTdeactCharge  */,
      FIELD_TYPE_STRING /* std public attribute: tsReactCharge  */,
      FIELD_TYPE_STRING /* std public attribute: tsPdeactCharge  */,
      FIELD_TYPE_STRING /* std public attribute: tsSubCharge1  */,
      FIELD_TYPE_STRING /* std public attribute: tsSubCharge2  */,
      FIELD_TYPE_STRING /* std public attribute: tsSubCharge3  */,
      FIELD_TYPE_STRING /* std public attribute: tsChargePeriod  */,
      FIELD_TYPE_SHORT /* std public attribute: tsChargeFreq  */,
      FIELD_TYPE_STRING /* std public attribute: tsDiscountRef  */,
      FIELD_TYPE_STRING /* std public attribute: tsActInclusive  */
    };
  
  private final int[] fieldSizes = new int[] {
		  tsPackageCodeSize,
		  tsInternalTariffSize,
		  tsServiceCodeSize,
		  tsNetServCodeSize,
		  tsActChargeSize,
		  tsTdeactChargeSize,
		  tsReactChargeSize,
		  tsPdeactChargeSize,
		  tsSubCharge1Size,
		  tsSubCharge2Size,
		  tsSubCharge3Size,
		  tsChargePeriodSize,
		  0,
		  tsDiscountRefSize,
		  tsActInclusiveSize
  };
      

  public int[] fieldSizes() {
  	return fieldSizes;
  }  

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int tsPackageCodeFilter = 0; // filter index
  private static final int tsPackageCodeSize = 5; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int tsInternalTariffFilter = 1; // filter index
  private static final int tsInternalTariffSize = 20; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int tsServiceCodeFilter = 2; // filter index
  private static final int tsServiceCodeSize = 4; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int tsNetServCodeFilter = 3; // filter index
  private static final int tsNetServCodeSize = 15; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int tsActChargeFilter = 4; // filter index
  private static final int tsActChargeSize = 5; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int tsTdeactChargeFilter = 5; // filter index
  private static final int tsTdeactChargeSize = 5; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int tsReactChargeFilter = 6; // filter index
  private static final int tsReactChargeSize = 5; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int tsPdeactChargeFilter = 7; // filter index
  private static final int tsPdeactChargeSize = 5; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int tsSubCharge1Filter = 8; // filter index
  private static final int tsSubCharge1Size = 5; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int tsSubCharge2Filter = 9; // filter index
  private static final int tsSubCharge2Size = 5; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int tsSubCharge3Filter = 10; // filter index
  private static final int tsSubCharge3Size = 5; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int tsChargePeriodFilter = 11; // filter index
  private static final int tsChargePeriodSize = 1; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int tsChargeFreqFilter = 12; // filter index

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int tsDiscountRefFilter = 13; // filter index
  private static final int tsDiscountRefSize = 4; // field size

  /** Unique field index used for Filtering. @see com.eppixcomm.eppix.common.util.QueryFilter */
  public static final int tsActInclusiveFilter = 14; // filter index
  private static final int tsActInclusiveSize = 1; // field size

  //~ Instance variables /////////////////////////////////////////////////////

  private Short tsChargeFreq; // Loaded from Schema
  private String tsActCharge; // Loaded from Schema
  private String tsActInclusive; // Loaded from Schema
  private String tsChargePeriod; // Loaded from Schema
  private String tsDiscountRef; // Loaded from Schema
  private String tsInternalTariff; // Loaded from Schema
  private String tsNetServCode; // Loaded from Schema

  //---------------------
  // Field declarations
  //---------------------
  // all attributes
  private String tsPackageCode; // Loaded from Schema
  private String tsPdeactCharge; // Loaded from Schema
  private String tsReactCharge; // Loaded from Schema
  private String tsServiceCode; // Loaded from Schema
  private String tsSubCharge1; // Loaded from Schema
  private String tsSubCharge2; // Loaded from Schema
  private String tsSubCharge3; // Loaded from Schema
  private String tsTdeactCharge; // Loaded from Schema

  //~ Constructors ///////////////////////////////////////////////////////////

  /**
   * Creates a new TsTariffServiceDMO object.
   */
  public TsTariffServiceDMO(  ) {
  }

  // Constructor - taking public attributes
  /**
   * Creates a new TsTariffServiceDMO object.
   *
   * @param tsPackageCode DOCUMENT ME!
   * @param tsInternalTariff DOCUMENT ME!
   * @param tsServiceCode DOCUMENT ME!
   * @param tsNetServCode DOCUMENT ME!
   * @param tsActCharge DOCUMENT ME!
   * @param tsTdeactCharge DOCUMENT ME!
   * @param tsReactCharge DOCUMENT ME!
   * @param tsPdeactCharge DOCUMENT ME!
   * @param tsSubCharge1 DOCUMENT ME!
   * @param tsSubCharge2 DOCUMENT ME!
   * @param tsSubCharge3 DOCUMENT ME!
   * @param tsChargePeriod DOCUMENT ME!
   * @param tsChargeFreq DOCUMENT ME!
   * @param tsDiscountRef DOCUMENT ME!
   * @param tsActInclusive DOCUMENT ME!
   */
  public TsTariffServiceDMO( 
    final String tsPackageCode,
    final String tsInternalTariff,
    final String tsServiceCode,
    final String tsNetServCode,
    final String tsActCharge,
    final String tsTdeactCharge,
    final String tsReactCharge,
    final String tsPdeactCharge,
    final String tsSubCharge1,
    final String tsSubCharge2,
    final String tsSubCharge3,
    final String tsChargePeriod,
    final Short  tsChargeFreq,
    final String tsDiscountRef,
    final String tsActInclusive ) {
    this.tsPackageCode = tsPackageCode;

    this.tsInternalTariff = tsInternalTariff;

    this.tsServiceCode = tsServiceCode;

    this.tsNetServCode = tsNetServCode;

    this.tsActCharge = tsActCharge;

    this.tsTdeactCharge = tsTdeactCharge;

    this.tsReactCharge = tsReactCharge;

    this.tsPdeactCharge = tsPdeactCharge;

    this.tsSubCharge1 = tsSubCharge1;

    this.tsSubCharge2 = tsSubCharge2;

    this.tsSubCharge3 = tsSubCharge3;

    this.tsChargePeriod = tsChargePeriod;

    this.tsChargeFreq = tsChargeFreq;

    this.tsDiscountRef = tsDiscountRef;

    this.tsActInclusive = tsActInclusive;
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
    return new DAOArgs( 3 ).arg( ( this.tsPackageCode == null ) ? null
                                                                : this.tsPackageCode
      .trim(  ) )
                           .arg( ( this.tsInternalTariff == null ) ? null
                                                                   : this.tsInternalTariff
      .trim(  ) )
                           .arg( ( this.tsServiceCode == null ) ? null
                                                                : this.tsServiceCode
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
      ( tsPackageCode == null ) ? null
                                : ( ( tsPackageCode.length(  ) <= tsPackageCodeSize )
      ? tsPackageCode
      : tsPackageCode.substring( 0, tsPackageCodeSize ) // auto trimmed to fit, if required.
       ),
      ( tsInternalTariff == null ) ? null
                                   : ( ( tsInternalTariff.length(  ) <= tsInternalTariffSize )
      ? tsInternalTariff
      : tsInternalTariff.substring( 0, tsInternalTariffSize ) // auto trimmed to fit, if required.
       ),
      ( tsServiceCode == null ) ? null
                                : ( ( tsServiceCode.length(  ) <= tsServiceCodeSize )
      ? tsServiceCode
      : tsServiceCode.substring( 0, tsServiceCodeSize ) // auto trimmed to fit, if required.
       ),
      ( tsNetServCode == null ) ? null
                                : ( ( tsNetServCode.length(  ) <= tsNetServCodeSize )
      ? tsNetServCode
      : tsNetServCode.substring( 0, tsNetServCodeSize ) // auto trimmed to fit, if required.
       ),
      ( tsActCharge == null ) ? null
                              : ( ( tsActCharge.length(  ) <= tsActChargeSize )
      ? tsActCharge
      : tsActCharge.substring( 0, tsActChargeSize ) // auto trimmed to fit, if required.
       ),
      ( tsTdeactCharge == null ) ? null
                                 : ( ( tsTdeactCharge.length(  ) <= tsTdeactChargeSize )
      ? tsTdeactCharge
      : tsTdeactCharge.substring( 0, tsTdeactChargeSize ) // auto trimmed to fit, if required.
       ),
      ( tsReactCharge == null ) ? null
                                : ( ( tsReactCharge.length(  ) <= tsReactChargeSize )
      ? tsReactCharge
      : tsReactCharge.substring( 0, tsReactChargeSize ) // auto trimmed to fit, if required.
       ),
      ( tsPdeactCharge == null ) ? null
                                 : ( ( tsPdeactCharge.length(  ) <= tsPdeactChargeSize )
      ? tsPdeactCharge
      : tsPdeactCharge.substring( 0, tsPdeactChargeSize ) // auto trimmed to fit, if required.
       ),
      ( tsSubCharge1 == null ) ? null
                               : ( ( tsSubCharge1.length(  ) <= tsSubCharge1Size )
      ? tsSubCharge1
      : tsSubCharge1.substring( 0, tsSubCharge1Size ) // auto trimmed to fit, if required.
       ),
      ( tsSubCharge2 == null ) ? null
                               : ( ( tsSubCharge2.length(  ) <= tsSubCharge2Size )
      ? tsSubCharge2
      : tsSubCharge2.substring( 0, tsSubCharge2Size ) // auto trimmed to fit, if required.
       ),
      ( tsSubCharge3 == null ) ? null
                               : ( ( tsSubCharge3.length(  ) <= tsSubCharge3Size )
      ? tsSubCharge3
      : tsSubCharge3.substring( 0, tsSubCharge3Size ) // auto trimmed to fit, if required.
       ),
      ( tsChargePeriod == null ) ? null
                                 : ( ( tsChargePeriod.length(  ) <= tsChargePeriodSize )
      ? tsChargePeriod
      : tsChargePeriod.substring( 0, tsChargePeriodSize ) // auto trimmed to fit, if required.
       ), tsChargeFreq,
      ( tsDiscountRef == null ) ? null
                                : ( ( tsDiscountRef.length(  ) <= tsDiscountRefSize )
      ? tsDiscountRef
      : tsDiscountRef.substring( 0, tsDiscountRefSize ) // auto trimmed to fit, if required.
       ),
      ( tsActInclusive == null ) ? null
                                 : ( ( tsActInclusive.length(  ) <= tsActInclusiveSize )
      ? tsActInclusive
      : tsActInclusive.substring( 0, tsActInclusiveSize ) // auto trimmed to fit, if required.
       )
    };
  }

  /**
   * DOCUMENT ME!
   *
   * @param fields DOCUMENT ME!
   */
  protected void set( final Object[] fields ) {
    tsPackageCode = rtrim( (String) fields[0] );
    tsInternalTariff = rtrim( (String) fields[1] );
    tsServiceCode = rtrim( (String) fields[2] );
    tsNetServCode = rtrim( (String) fields[3] );
    tsActCharge = rtrim( (String) fields[4] );
    tsTdeactCharge = rtrim( (String) fields[5] );
    tsReactCharge = rtrim( (String) fields[6] );
    tsPdeactCharge = rtrim( (String) fields[7] );
    tsSubCharge1 = rtrim( (String) fields[8] );
    tsSubCharge2 = rtrim( (String) fields[9] );
    tsSubCharge3 = rtrim( (String) fields[10] );
    tsChargePeriod = rtrim( (String) fields[11] );
    tsChargeFreq = (Short) fields[12];
    tsDiscountRef = rtrim( (String) fields[13] );
    tsActInclusive = rtrim( (String) fields[14] );
  }

  // Get methods ///////////////////////////////////////////////////////////////
  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getTsPackageCode(  ) {
    return tsPackageCode;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getTsInternalTariff(  ) {
    return tsInternalTariff;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getTsServiceCode(  ) {
    return tsServiceCode;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getTsNetServCode(  ) {
    return tsNetServCode;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getTsActCharge(  ) {
    return tsActCharge;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getTsTdeactCharge(  ) {
    return tsTdeactCharge;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getTsReactCharge(  ) {
    return tsReactCharge;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getTsPdeactCharge(  ) {
    return tsPdeactCharge;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getTsSubCharge1(  ) {
    return tsSubCharge1;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getTsSubCharge2(  ) {
    return tsSubCharge2;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getTsSubCharge3(  ) {
    return tsSubCharge3;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getTsChargePeriod(  ) {
    return tsChargePeriod;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public Short getTsChargeFreq(  ) {
    return tsChargeFreq;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getTsDiscountRef(  ) {
    return tsDiscountRef;
  }

  /**
   * DOCUMENT ME!
   *
   * @return DOCUMENT ME!
   */
  public String getTsActInclusive(  ) {
    return tsActInclusive;
  }

  // Setter methods ///////////////////////////////////////////////////////////////

  //
  // Master setter follows...
  //

  /**
   * Setter that takes all attributes
   */
  public void set( 
    final String tsPackageCode,
    final String tsInternalTariff,
    final String tsServiceCode,
    final String tsNetServCode,
    final String tsActCharge,
    final String tsTdeactCharge,
    final String tsReactCharge,
    final String tsPdeactCharge,
    final String tsSubCharge1,
    final String tsSubCharge2,
    final String tsSubCharge3,
    final String tsChargePeriod,
    final Short  tsChargeFreq,
    final String tsDiscountRef,
    final String tsActInclusive ) {
    this.tsPackageCode = tsPackageCode;
    this.tsInternalTariff = tsInternalTariff;
    this.tsServiceCode = tsServiceCode;
    this.tsNetServCode = tsNetServCode;
    this.tsActCharge = tsActCharge;
    this.tsTdeactCharge = tsTdeactCharge;
    this.tsReactCharge = tsReactCharge;
    this.tsPdeactCharge = tsPdeactCharge;
    this.tsSubCharge1 = tsSubCharge1;
    this.tsSubCharge2 = tsSubCharge2;
    this.tsSubCharge3 = tsSubCharge3;
    this.tsChargePeriod = tsChargePeriod;
    this.tsChargeFreq = tsChargeFreq;
    this.tsDiscountRef = tsDiscountRef;
    this.tsActInclusive = tsActInclusive;
  }

  //
  // Public access modifiers if any
  // (provided for attributes that are public in the analysis model)
  //    

  /**
  * Sets the TsPackageCode field.
  *
  * @param tsPackageCode
  */
  public void setTsPackageCode( final String tsPackageCode ) {
    this.tsPackageCode = getPadded(tsPackageCode, tsPackageCodeFilter);
  }

  /**
  * Sets the TsInternalTariff field.
  *
  * @param tsInternalTariff
  */
  public void setTsInternalTariff( final String tsInternalTariff ) {
    this.tsInternalTariff = getPadded(tsInternalTariff, tsInternalTariffFilter);
  }

  /**
  * Sets the TsServiceCode field.
  *
  * @param tsServiceCode
  */
  public void setTsServiceCode( final String tsServiceCode ) {
    this.tsServiceCode = getPadded(tsServiceCode, tsServiceCodeFilter);
  }

  /**
  * Sets the TsNetServCode field.
  *
  * @param tsNetServCode
  */
  public void setTsNetServCode( final String tsNetServCode ) {
    this.tsNetServCode = getPadded(tsNetServCode, tsNetServCodeFilter);
  }

  /**
  * Sets the TsActCharge field.
  *
  * @param tsActCharge
  */
  public void setTsActCharge( final String tsActCharge ) {
    this.tsActCharge = getPadded(tsActCharge, tsActChargeFilter);
  }

  /**
  * Sets the TsTdeactCharge field.
  *
  * @param tsTdeactCharge
  */
  public void setTsTdeactCharge( final String tsTdeactCharge ) {
    this.tsTdeactCharge = getPadded(tsTdeactCharge, tsTdeactChargeFilter);
  }

  /**
  * Sets the TsReactCharge field.
  *
  * @param tsReactCharge
  */
  public void setTsReactCharge( final String tsReactCharge ) {
    this.tsReactCharge = getPadded(tsReactCharge, tsReactChargeFilter);
  }

  /**
  * Sets the TsPdeactCharge field.
  *
  * @param tsPdeactCharge
  */
  public void setTsPdeactCharge( final String tsPdeactCharge ) {
    this.tsPdeactCharge = getPadded(tsPdeactCharge, tsPdeactChargeFilter);
  }

  /**
  * Sets the TsSubCharge1 field.
  *
  * @param tsSubCharge1
  */
  public void setTsSubCharge1( final String tsSubCharge1 ) {
    this.tsSubCharge1 = getPadded(tsSubCharge1, tsSubCharge1Filter);
  }

  /**
  * Sets the TsSubCharge2 field.
  *
  * @param tsSubCharge2
  */
  public void setTsSubCharge2( final String tsSubCharge2 ) {
    this.tsSubCharge2 = getPadded(tsSubCharge2, tsSubCharge2Filter);
  }

  /**
  * Sets the TsSubCharge3 field.
  *
  * @param tsSubCharge3
  */
  public void setTsSubCharge3( final String tsSubCharge3 ) {
    this.tsSubCharge3 = getPadded(tsSubCharge3, tsSubCharge3Filter);
  }

  /**
  * Sets the TsChargePeriod field.
  *
  * @param tsChargePeriod
  */
  public void setTsChargePeriod( final String tsChargePeriod ) {
    this.tsChargePeriod = getPadded(tsChargePeriod, tsChargePeriodFilter);
  }

  /**
  * Sets the TsChargeFreq field.
  *
  * @param tsChargeFreq
  */
  public void setTsChargeFreq( final Short tsChargeFreq ) {
    this.tsChargeFreq = tsChargeFreq;
  }

  /**
  * Sets the TsChargeFreq field.
  *
  * @param tsChargeFreq
  */
  public void setTsChargeFreq( final int tsChargeFreq ) {
    this.tsChargeFreq = Short.valueOf( (short) tsChargeFreq );
  }

  /**
  * Sets the TsDiscountRef field.
  *
  * @param tsDiscountRef
  */
  public void setTsDiscountRef( final String tsDiscountRef ) {
    this.tsDiscountRef = getPadded(tsDiscountRef, tsDiscountRefFilter);
  }

  /**
  * Sets the TsActInclusive field.
  *
  * @param tsActInclusive
  */
  public void setTsActInclusive( final String tsActInclusive ) {
    this.tsActInclusive = getPadded(tsActInclusive, tsActInclusiveFilter);
  }

@Override
public String toString() {
	return "\nTsTariffServiceDMO [fieldSizes=" + Arrays.toString(fieldSizes)
			+ "\ntsChargeFreq=" + tsChargeFreq + "\ntsActCharge=" + tsActCharge
			+ "\ntsActInclusive=" + tsActInclusive + "\ntsChargePeriod="
			+ tsChargePeriod + "\ntsDiscountRef=" + tsDiscountRef
			+ "\ntsInternalTariff=" + tsInternalTariff + "\ntsNetServCode="
			+ tsNetServCode + "\ntsPackageCode=" + tsPackageCode
			+ "\ntsPdeactCharge=" + tsPdeactCharge + "\ntsReactCharge="
			+ tsReactCharge + "\ntsServiceCode=" + tsServiceCode
			+ "\ntsSubCharge1=" + tsSubCharge1 + "\ntsSubCharge2="
			+ tsSubCharge2 + "\ntsSubCharge3=" + tsSubCharge3
			+ "\ntsTdeactCharge=" + tsTdeactCharge + "]";
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
