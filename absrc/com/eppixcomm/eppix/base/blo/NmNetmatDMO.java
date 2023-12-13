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

import java.io.Serializable;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;

//---------------------
// class javadoc
//---------------------
/**
 * A value object to carry the data for a NmNetmat.
 *
 *
 * <H3> A NmNetmat is: </H3>
 *
 * <!-- indent text -->
 * <TABLE BORDER="0" CELLPADDING="0" CELLSPACING="0">
 * <TR>
 * <TD WIDTH="25">&nbsp;</TD>
 * <TD>
 *
 * null
 *
 * <!-- end indent text -->
 * </TD>
 * </TR>
 * </TABLE>
 *
 *
 * <H3> NmNetmat Value Object: </H3>
 *
 * <!-- indent text -->
 * <TABLE BORDER="0" CELLPADDING="0" CELLSPACING="0">
 * <TR>
 * <TD WIDTH="25">&nbsp;</TD>
 * <TD>
 *
 * <P>
 *     This is a value object (called a Data Model Object or 'DMO').
 *     It is used to pass the data for a nmNetmat into and out of the BASE module.
 *     Because it's purpose is to carry data into and out of the module it is visible outside the module.
 * </P>
 * <P>
 *     This value object carries the data for one nmNetmat. A nmNetmat is:
 * null
 * </P>
 * <P>
 *     It corresponds to the business logic object NmNetmat which
 *     contains all the business behaviour of a nmNetmat but is not visible outside the
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
 *    This value object contains fields for all the details of a nmNetmat, namely:
 * </P>
 *


 * <P>
 *    <U>Fields to carry the Attributes of a nmNetmat:</U>
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
 *   <TD ALIGN="left" VALIGN="top"><B>nmInternalTariff</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Internal tariff.
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
 *       <A HREF="#getNmInternalTariff()">
 *           getNmInternalTariff
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setNmInternalTariff(java.lang.String)">
 *           setNmInternalTariff (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>nmNetworkTariff</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Corresponding network tariff.
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
 *       <A HREF="#getNmNetworkTariff()">
 *           getNmNetworkTariff
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setNmNetworkTariff(java.lang.String)">
 *           setNmNetworkTariff (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>nmContractPeriod</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Contract period.
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
 *       <A HREF="#getNmContractPeriod()">
 *           getNmContractPeriod
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setNmContractPeriod(java.lang.String)">
 *           setNmContractPeriod (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>nmMinCancPeriod</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Minimum contract period.
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
 *       <A HREF="#getNmMinCancPeriod()">
 *           getNmMinCancPeriod
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setNmMinCancPeriod(java.lang.String)">
 *           setNmMinCancPeriod (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>nmHigherMigType</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Recalculation of contract termination date on migration to a higher period.
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
 *       <A HREF="#getNmHigherMigType()">
 *           getNmHigherMigType
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setNmHigherMigType(java.lang.String)">
 *           setNmHigherMigType (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>nmLowerMigType</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Migration to a lower period.
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
 *       <A HREF="#getNmLowerMigType()">
 *           getNmLowerMigType
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setNmLowerMigType(java.lang.String)">
 *           setNmLowerMigType (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>nmSameMigType</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Migration to same period.
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
 *       <A HREF="#getNmSameMigType()">
 *           getNmSameMigType
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setNmSameMigType(java.lang.String)">
 *           setNmSameMigType (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>nmNetworkId</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">false</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Network identification.
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
 *       <A HREF="#getNmNetworkId()">
 *           getNmNetworkId
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setNmNetworkId(java.lang.String)">
 *           setNmNetworkId (String)
 *       </A>
 *     </P>
 *   </TD>
 *  </TR>
 *  <TR>
 *   <TD ALIGN="left" VALIGN="top">
 *       <!-- the attributes are private no matter what their logical visibility -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/privateAttribute.gif" alt="private attribute" title="private attribute" align="center" />
 *   </TD>
 *   <TD ALIGN="left" VALIGN="top"><B>nmNetType</B></TD>
 *   <TD ALIGN="left" VALIGN="top">String</TD>
 *   <TD ALIGN="left" VALIGN="top">true</TD>
 *   <TD ALIGN="left" VALIGN="top">
 *       Only used for D2 where the tariff type is required.
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
 *       <A HREF="#getNmNetType()">
 *           getNmNetType
 *       </A>
 *       <BR>
 *       <!-- link to the anchor of the attribute's setter method. It has the logical visibility specified for the attribute -->
 *       <img src="file://C:/Eppix/Eppixgen/icons/publicMethod.gif" alt="public method" title="public method" align="center" />
 *       <A HREF="#setNmNetType(java.lang.String)">
 *           setNmNetType (String)
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


 * @see NmNetmat
 *
 * @author
 * @version $Revision: $
 *
 * @since $jdk$
 */
public class NmNetmatDMO extends DBO implements Serializable {


	private String nmInternalTariff;
	private String nmNetworkTariff;
	private String nmContractPeriod;
	private String nmNtwrkContrPer;
	private String nmMinCancPeriod;
	private String nmHigherMigType;
	private String nmLowerMigType;
	private String nmSameMigType;
	private String nmNetworkId;
	private String nmNetType;



	public static final int nmInternalTariffFilter = 0;
	private static final int nmInternalTariffSize = 20;


	public static final int nmNetworkTariffFilter = 1;
	private static final int nmNetworkTariffSize = 5;


	public static final int nmContractPeriodFilter = 2;
	private static final int nmContractPeriodSize = 2;


	public static final int nmNtwrkContrPerFilter = 3;
	private static final int nmNtwrkContrPerSize = 2;


	public static final int nmMinCancPeriodFilter = 4;
	private static final int nmMinCancPeriodSize = 2;


	public static final int nmHigherMigTypeFilter = 5;
	private static final int nmHigherMigTypeSize = 1;


	public static final int nmLowerMigTypeFilter = 6;
	private static final int nmLowerMigTypeSize = 1;


	public static final int nmSameMigTypeFilter = 7;
	private static final int nmSameMigTypeSize = 1;


	public static final int nmNetworkIdFilter = 8;
	private static final int nmNetworkIdSize = 5;


	public static final int nmNetTypeFilter = 9;
	private static final int nmNetTypeSize = 5;





	public NmNetmatDMO(){};

	public NmNetmatDMO(final String nmInternalTariff,
	final String nmNetworkTariff,
	final String nmContractPeriod,
	final String nmNtwrkContrPer,
	final String nmMinCancPeriod,
	final String nmHigherMigType,
	final String nmLowerMigType,
	final String nmSameMigType,
	final String nmNetworkId,
	final String nmNetType
	){

	this.nmInternalTariff = nmInternalTariff;
	this.nmNetworkTariff = nmNetworkTariff;
	this.nmContractPeriod = nmContractPeriod;
	this.nmNtwrkContrPer = nmNtwrkContrPer;
	this.nmMinCancPeriod = nmMinCancPeriod;
	this.nmHigherMigType = nmHigherMigType;
	this.nmLowerMigType = nmLowerMigType;
	this.nmSameMigType = nmSameMigType;
	this.nmNetworkId = nmNetworkId;
	this.nmNetType = nmNetType;
	};


	private static final int[] fieldSizes = new int[]{
	nmInternalTariffSize,
	nmNetworkTariffSize,
	nmContractPeriodSize,
	nmNtwrkContrPerSize,
	nmMinCancPeriodSize,
	nmHigherMigTypeSize,
	nmLowerMigTypeSize,
	nmSameMigTypeSize,
	nmNetworkIdSize,
	nmNetTypeSize
	};


	private static final int[] fieldTypes = new int[]{
	FIELD_TYPE_STRING,
	FIELD_TYPE_STRING,
	FIELD_TYPE_STRING,
	FIELD_TYPE_STRING,
	FIELD_TYPE_STRING,
	FIELD_TYPE_STRING,
	FIELD_TYPE_STRING,
	FIELD_TYPE_STRING,
	FIELD_TYPE_STRING,
	FIELD_TYPE_STRING
	};

	protected void generatedKey(Integer key){}


	protected Object[] get() {
			return new Object[]{			((this.nmInternalTariff == null) ? null : (this.nmInternalTariff.length() <= nmInternalTariffSize) ? this.nmInternalTariff : this.nmInternalTariff.substring(0, this.nmInternalTariffSize)),
				((this.nmNetworkTariff == null) ? null : (this.nmNetworkTariff.length() <= nmNetworkTariffSize) ? this.nmNetworkTariff : this.nmNetworkTariff.substring(0, this.nmNetworkTariffSize)),
				((this.nmContractPeriod == null) ? null : (this.nmContractPeriod.length() <= nmContractPeriodSize) ? this.nmContractPeriod : this.nmContractPeriod.substring(0, this.nmContractPeriodSize)),
				((this.nmNtwrkContrPer == null) ? null : (this.nmNtwrkContrPer.length() <= nmNtwrkContrPerSize) ? this.nmNtwrkContrPer : this.nmNtwrkContrPer.substring(0, this.nmNtwrkContrPerSize)),
				((this.nmMinCancPeriod == null) ? null : (this.nmMinCancPeriod.length() <= nmMinCancPeriodSize) ? this.nmMinCancPeriod : this.nmMinCancPeriod.substring(0, this.nmMinCancPeriodSize)),
				((this.nmHigherMigType == null) ? null : (this.nmHigherMigType.length() <= nmHigherMigTypeSize) ? this.nmHigherMigType : this.nmHigherMigType.substring(0, this.nmHigherMigTypeSize)),
				((this.nmLowerMigType == null) ? null : (this.nmLowerMigType.length() <= nmLowerMigTypeSize) ? this.nmLowerMigType : this.nmLowerMigType.substring(0, this.nmLowerMigTypeSize)),
				((this.nmSameMigType == null) ? null : (this.nmSameMigType.length() <= nmSameMigTypeSize) ? this.nmSameMigType : this.nmSameMigType.substring(0, this.nmSameMigTypeSize)),
				((this.nmNetworkId == null) ? null : (this.nmNetworkId.length() <= nmNetworkIdSize) ? this.nmNetworkId : this.nmNetworkId.substring(0, this.nmNetworkIdSize)),
				((this.nmNetType == null) ? null : (this.nmNetType.length() <= nmNetTypeSize) ? this.nmNetType : this.nmNetType.substring(0, this.nmNetTypeSize))
			};
	}


	protected Integer versionNumber() {
		return null;
	}



	protected void versionNumber(Integer versionNumber) {
	}



	protected int[] fieldSizes() {
		return fieldSizes;
	}



	protected int[] fieldTypes() {
		return fieldTypes;
	}



	protected DAOArgs primaryKey() {
		return new DAOArgs(1).arg(this.nmInternalTariff); 
	}

	protected void set(Object[] fields) {
	this.nmInternalTariff = rtrim((String)fields[0]);
	this.nmNetworkTariff = rtrim((String)fields[1]);
	this.nmContractPeriod = rtrim((String)fields[2]);
	this.nmNtwrkContrPer = rtrim((String)fields[3]);
	this.nmMinCancPeriod = rtrim((String)fields[4]);
	this.nmHigherMigType = rtrim((String)fields[5]);
	this.nmLowerMigType = rtrim((String)fields[6]);
	this.nmSameMigType = rtrim((String)fields[7]);
	this.nmNetworkId = rtrim((String)fields[8]);
	this.nmNetType = rtrim((String)fields[9]);
	}


	public void set(
	final String nmInternalTariff,
	final String nmNetworkTariff,
	final String nmContractPeriod,
	final String nmNtwrkContrPer,
	final String nmMinCancPeriod,
	final String nmHigherMigType,
	final String nmLowerMigType,
	final String nmSameMigType,
	final String nmNetworkId,
	final String nmNetType
	)
	{

	this.nmInternalTariff = nmInternalTariff;
	this.nmNetworkTariff = nmNetworkTariff;
	this.nmContractPeriod = nmContractPeriod;
	this.nmNtwrkContrPer = nmNtwrkContrPer;
	this.nmMinCancPeriod = nmMinCancPeriod;
	this.nmHigherMigType = nmHigherMigType;
	this.nmLowerMigType = nmLowerMigType;
	this.nmSameMigType = nmSameMigType;
	this.nmNetworkId = nmNetworkId;
	this.nmNetType = nmNetType;
	}

	public String getNmInternalTariff() {
		return nmInternalTariff;
	}

	public void setNmInternalTariff(String nmInternalTariff) {
		nmInternalTariff = nmInternalTariff;
	}

	public String getNmNetworkTariff() {
		return nmNetworkTariff;
	}

	public void setNmNetworkTariff(String nmNetworkTariff) {
		nmNetworkTariff = nmNetworkTariff;
	}

	public String getNmContractPeriod() {
		return nmContractPeriod;
	}

	public void setNmContractPeriod(String nmContractPeriod) {
		nmContractPeriod = nmContractPeriod;
	}

	public String getNmNtwrkContrPer() {
		return nmNtwrkContrPer;
	}

	public void setNmNtwrkContrPer(String nmNtwrkContrPer) {
		nmNtwrkContrPer = nmNtwrkContrPer;
	}

	public String getNmMinCancPeriod() {
		return nmMinCancPeriod;
	}

	public void setNmMinCancPeriod(String nmMinCancPeriod) {
		nmMinCancPeriod = nmMinCancPeriod;
	}

	public String getNmHigherMigType() {
		return nmHigherMigType;
	}

	public void setNmHigherMigType(String nmHigherMigType) {
		nmHigherMigType = nmHigherMigType;
	}

	public String getNmLowerMigType() {
		return nmLowerMigType;
	}

	public void setNmLowerMigType(String nmLowerMigType) {
		nmLowerMigType = nmLowerMigType;
	}

	public String getNmSameMigType() {
		return nmSameMigType;
	}

	public void setNmSameMigType(String nmSameMigType) {
		nmSameMigType = nmSameMigType;
	}

	public String getNmNetworkId() {
		return nmNetworkId;
	}

	public void setNmNetworkId(String nmNetworkId) {
		nmNetworkId = nmNetworkId;
	}

	public String getNmNetType() {
		return nmNetType;
	}

	public void setNmNetType(String nmNetType) {
		nmNetType = nmNetType;
	}

}
