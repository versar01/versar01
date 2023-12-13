package com.eppixcomm.eppix.base.blo;

import java.io.Serializable;
import java.math.BigDecimal;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;
import com.eppixcomm.eppix.common.util.DateTime;

public class CrbCustRiskBalDMO  extends DBO implements Serializable{
	private String crbBillAcNo;
	private String crbAccountType	;
	private BigDecimal crbCreditLimit;
	private BigDecimal crbAccBal;	
	private BigDecimal crbUnbillCharges;
	private BigDecimal crbUnbillCalls;
	private Short crbDiff;
	private Short crbNextThreshold;
	private Short crbPrevThreshold;
	private String crbCollPlan;	
	private Short crbMinThreshold;
	private String crbActivateFlag;
	private String crbEapFlag;
	private String crbBlStatus;
	private String crbBlType;
	private BigDecimal crbBlLimit;
	private Short crbBlDiff;
	private BigDecimal crbBlNextThresh;
	private BigDecimal crbBlPrevThresh;
	private Integer crbBlNextAcnId;
	private Integer crbBlPrevAcnId;
	private String crbBlTrigFlag;
	private DateTime crbBlLastUpdate;
	
	public static final int crbBillAcNoFilter = 0;
	public static final int crbBillAcNoSize = 8;

	public static final int crbAccountTypeFilter = 1;
	public static final int crbAccountTypeSize = 3;

	public static final int crbCreditLimitFilter = 2;
	public static final int crbAccBalFilter = 3;
	public static final int crbUnbillChargesFilter = 4;
	public static final int crbUnbillCallsFilter = 5;
	public static final int crbDiffFilter = 6;
	public static final int crbNextThresholdFilter = 7;
	public static final int crbPrevThresholdFilter = 8;

	public static final int crbCollPlanFilter = 9;
	public static final int crbCollPlanSize = 6;

	public static final int crbMinThresholdFilter = 10;

	public static final int crbActivateFlagFilter = 11;
	public static final int crbActivateFlagSize = 1;

	public static final int crbEapFlagFilter = 12;
	public static final int crbEapFlagSize = 1;

	public static final int crbBlStatusFilter = 13;
	public static final int crbBlStatusSize = 1;

	public static final int crbBlTypeFilter = 14;
	public static final int crbBlTypeSize = 1;

	public static final int crbBlLimitFilter = 15;
	public static final int crbBlDiffFilter = 16;
	public static final int crbBlNextThreshFilter = 17;
	public static final int crbBlPrevThreshFilter = 18;
	public static final int crbBlNextAcnIdFilter = 19;
	public static final int crbBlPrevAcnIdFilter = 20;

	public static final int crbBlTrigFlagFilter = 21;
	public static final int crbBlTrigFlagSize = 1;

	public static final int crbBlLastUpdateFilter = 22;
	
	public CrbCustRiskBalDMO(){
		
	}
	
	public CrbCustRiskBalDMO(final String crbBillAcNo,
			final String crbAccountType	,
			final BigDecimal crbCreditLimit,
			final BigDecimal crbAccBal,	
			final BigDecimal crbUnbillCharges,
			final BigDecimal crbUnbillCalls,
			final Short crbDiff,
			final Short crbNextThreshold,
			final Short crbPrevThreshold,
			final String crbCollPlan,	
			final Short crbMinThreshold,
			final String crbActivateFlag,
			final String crbEapFlag,
			final String crbBlStatus,
			final String crbBlType,
			final BigDecimal crbBlLimit,
			final Short crbBlDiff,
			final BigDecimal crbBlNextThresh,
			final BigDecimal crbBlPrevThresh,
			final Integer crbBlNextAcnId,
			final Integer crbBlPrevAcnId,
			final String crbBlTrigFlag,
			final DateTime crbBlLastUpdate){
		this.crbBillAcNo = crbBillAcNo;
		this.crbAccountType = crbAccountType;
		this.crbCreditLimit = crbCreditLimit;
		this.crbAccBal = crbAccBal;
		this.crbUnbillCharges = crbUnbillCharges;
		this.crbUnbillCalls = crbUnbillCalls;
		this.crbDiff = crbDiff;
		this.crbNextThreshold = crbNextThreshold;
		this.crbPrevThreshold = crbPrevThreshold;
		this.crbCollPlan = crbCollPlan;
		this.crbMinThreshold = crbMinThreshold;
		this.crbActivateFlag = crbActivateFlag;
		this.crbEapFlag = crbEapFlag;
		this.crbBlStatus = crbBlStatus;
		this.crbBlType = crbBlType;
		this.crbBlLimit = crbBlLimit;
		this.crbBlDiff = crbBlDiff;
		this.crbBlNextThresh = crbBlNextThresh;
		this.crbBlPrevThresh = crbBlPrevThresh;
		this.crbBlNextAcnId = crbBlNextAcnId;
		this.crbBlPrevAcnId = crbBlPrevAcnId;
		this.crbBlTrigFlag = crbBlTrigFlag;
		this.crbBlLastUpdate = crbBlLastUpdate;
	}

	protected void generatedKey(Integer key) {
		// TODO Auto-generated method stub
	}

	protected Object[] get() {
		return new Object[]{
				( crbBillAcNo == null ) ? null : ( ( crbBillAcNo.length(  ) <= crbBillAcNoSize ) ? crbBillAcNo
                 : crbBillAcNo.substring( 0, crbBillAcNoSize )),

				( crbAccountType == null ) ? null : ( ( crbAccountType.length(  ) <= crbAccountTypeSize ) ? crbAccountType
		                 : crbAccountType.substring( 0, crbAccountTypeSize )),
		                 
				crbCreditLimit,
				crbAccBal,
				crbUnbillCharges,
				crbUnbillCalls,
				crbDiff,
				crbNextThreshold,
				crbPrevThreshold,

				( crbCollPlan == null ) ? null : ( ( crbCollPlan.length(  ) <= crbCollPlanSize ) ? crbCollPlan
		                 : crbCollPlan.substring( 0, crbCollPlanSize )),
		                 
				crbMinThreshold,
				
				( crbActivateFlag == null ) ? null : ( ( crbActivateFlag.length(  ) <= crbActivateFlagSize ) ? crbActivateFlag
		                 : crbActivateFlag.substring( 0, crbActivateFlagSize )),
		                 
				( crbEapFlag == null ) ? null : ( ( crbEapFlag.length(  ) <= crbEapFlagSize ) ? crbEapFlag
		                 : crbEapFlag.substring( 0, crbEapFlagSize )),
		                 
				( crbBlStatus == null ) ? null : ( ( crbBlStatus.length(  ) <= crbBlStatusSize ) ? crbBlStatus
		                 : crbBlStatus.substring( 0, crbBlStatusSize )),
		                 
				( crbBlType == null ) ? null : ( ( crbBlType.length(  ) <= crbBlTypeSize ) ? crbBlType
		                 : crbBlType.substring( 0, crbBlTypeSize )),
		                 
				crbBlLimit,
				crbBlDiff,
				crbBlNextThresh,
				crbBlPrevThresh,
				crbBlNextAcnId,
				crbBlPrevAcnId,
				( crbBlTrigFlag == null ) ? null : ( ( crbBlTrigFlag.length(  ) <= crbBlTrigFlagSize ) ? crbBlTrigFlag
		                 : crbBlTrigFlag.substring( 0, crbBlTrigFlagSize )),
		                 
				crbBlLastUpdate
		};
	}

	protected Integer versionNumber() {
		// TODO Auto-generated method stub
		return null;
	}

	protected void versionNumber(Integer versionNumber) {
		// TODO Auto-generated method stub
		
	}
	
	protected static final int[] fieldSizes = new int[]{
		crbBillAcNoSize,
		crbAccountTypeSize,
		0,
		0,
		0,
		0,
		0,
		0,
		0,
		crbCollPlanSize,
		0,
		crbActivateFlagSize,
		crbEapFlagSize,
		crbBlStatusSize,
		crbBlTypeSize,
		0,
		0,
		0,
		0,
		0,
		0,
		crbBlTrigFlagSize,
		0
	};

	protected int[] fieldSizes() {
		return fieldSizes;
	}

	  private static final int[] fieldTypes = new int[] {
	      FIELD_TYPE_STRING /* std public attribute: crb_bill_ac_no  */,
	      FIELD_TYPE_STRING /* std public attribute: crb_account_type  */,
	      FIELD_TYPE_BIGDECIMAL /* std public attribute: crb_credit_limit  */,
	      FIELD_TYPE_BIGDECIMAL /* std public attribute: crb_acc_bal  */,
	      FIELD_TYPE_BIGDECIMAL /* std public attribute: crb_unbill_charges  */,
	      FIELD_TYPE_BIGDECIMAL /* std public attribute: crb_unbill_calls  */,
	      FIELD_TYPE_SHORT /* std public attribute: crb_diff  */,
	      FIELD_TYPE_SHORT /* std public attribute: crb_next_threshold  */,
	      FIELD_TYPE_SHORT /* std public attribute: crb_prev_threshold  */,
	      FIELD_TYPE_STRING /* std public attribute: crb_coll_plan  */,
	      FIELD_TYPE_SHORT /* std public attribute: crb_min_threshold  */,
	      FIELD_TYPE_STRING /* std public attribute: crb_activate_flag  */,
	      FIELD_TYPE_STRING /* std public attribute: crb_eap_flag  */,
	      FIELD_TYPE_STRING /* std public attribute: crb_bl_status  */,
	      FIELD_TYPE_STRING /* std public attribute: crb_bl_type  */,
	      FIELD_TYPE_BIGDECIMAL /* std public attribute: crb_bl_limit  */,
	      FIELD_TYPE_SHORT /* std public attribute: crb_bl_diff  */,
	      FIELD_TYPE_BIGDECIMAL /* std public attribute: crb_bl_next_thresh  */,
	      FIELD_TYPE_BIGDECIMAL /* std public attribute: crb_bl_prev_thresh  */,
	      FIELD_TYPE_INTEGER /* std public attribute: crb_bl_next_acn_id  */,
	      FIELD_TYPE_INTEGER /* std public attribute: crb_bl_prev_acn_id  */,
	      FIELD_TYPE_STRING /* std public attribute: crb_bl_trig_flag  */,
	      FIELD_TYPE_DATETIME /* std public attribute: crb_bl_last_update  */
	    };
	  
	protected int[] fieldTypes() {
		return fieldTypes;
	}

	protected DAOArgs primaryKey() {
		return new DAOArgs( 1 ).arg( this.crbBillAcNo );
	}

	public void set(final String crbBillAcNo,
			final String crbAccountType	,
			final BigDecimal crbCreditLimit,
			final BigDecimal crbAccBal,	
			final BigDecimal crbUnbillCharges,
			final BigDecimal crbUnbillCalls,
			final Short crbDiff,
			final Short crbNextThreshold,
			final Short crbPrevThreshold,
			final String crbCollPlan,	
			final Short crbMinThreshold,
			final String crbActivateFlag,
			final String crbEapFlag,
			final String crbBlStatus,
			final String crbBlType,
			final BigDecimal crbBlLimit,
			final Short crbBlDiff,
			final BigDecimal crbBlNextThresh,
			final BigDecimal crbBlPrevThresh,
			final Integer crbBlNextAcnId,
			final Integer crbBlPrevAcnId,
			final String crbBlTrigFlag,
			final DateTime crbBlLastUpdate){
		this.crbBillAcNo = crbBillAcNo;
		this.crbAccountType = crbAccountType;
		this.crbCreditLimit = crbCreditLimit;
		this.crbAccBal = crbAccBal;
		this.crbUnbillCharges = crbUnbillCharges;
		this.crbUnbillCalls = crbUnbillCalls;
		this.crbDiff = crbDiff;
		this.crbNextThreshold = crbNextThreshold;
		this.crbPrevThreshold = crbPrevThreshold;
		this.crbCollPlan = crbCollPlan;
		this.crbMinThreshold = crbMinThreshold;
		this.crbActivateFlag = crbActivateFlag;
		this.crbEapFlag = crbEapFlag;
		this.crbBlStatus = crbBlStatus;
		this.crbBlType = crbBlType;
		this.crbBlLimit = crbBlLimit;
		this.crbBlDiff = crbBlDiff;
		this.crbBlNextThresh = crbBlNextThresh;
		this.crbBlPrevThresh = crbBlPrevThresh;
		this.crbBlNextAcnId = crbBlNextAcnId;
		this.crbBlPrevAcnId = crbBlPrevAcnId;
		this.crbBlTrigFlag = crbBlTrigFlag;
		this.crbBlLastUpdate = crbBlLastUpdate;
	}
	protected void set(Object[] fields) {
		crbBillAcNo = rtrim((String)fields[0]);
		crbAccountType = rtrim((String)fields[1]);
		crbCreditLimit = (BigDecimal)fields[2];
		crbAccBal = (BigDecimal)fields[3];
		crbUnbillCharges = (BigDecimal)fields[4];
		crbUnbillCalls = (BigDecimal)fields[5];
		crbDiff = (Short)fields[6];
		crbNextThreshold = (Short)fields[7];
		crbPrevThreshold = (Short)fields[8];
		crbCollPlan = rtrim((String)fields[9]);
		crbMinThreshold = (Short)fields[10];
		crbActivateFlag = rtrim((String)fields[11]);
		crbEapFlag = rtrim((String)fields[12]);
		crbBlStatus = rtrim((String)fields[13]);
		crbBlType = rtrim((String)fields[14]);
		crbBlLimit = (BigDecimal)fields[15];
		crbBlDiff = (Short)fields[16];
		crbBlNextThresh = (BigDecimal)fields[17];
		crbBlPrevThresh = (BigDecimal)fields[18];
		crbBlNextAcnId = (Integer)fields[19];
		crbBlPrevAcnId = (Integer)fields[20];
		crbBlTrigFlag = (String)fields[21];
		crbBlLastUpdate = (DateTime)fields[22];		
	}
	
	public String getCrbBillAcNo() {
		return crbBillAcNo;
	}

	public void setCrbBillAcNo(String crbBillAcNo) {
		this.crbBillAcNo = this.getPadded(crbBillAcNo, crbBillAcNoSize);
	}

	public String getCrbAccountType() {
		return crbAccountType;
	}

	public void setCrbAccountType(String crbAccountType) {
		this.crbAccountType = this.getPadded(crbAccountType, crbAccountTypeSize);
	}

	public BigDecimal getCrbCreditLimit() {
		return crbCreditLimit;
	}

	public void setCrbCreditLimit(BigDecimal crbCreditLimit) {
		this.crbCreditLimit = crbCreditLimit;
	}

	public BigDecimal getCrbAccBal() {
		return crbAccBal;
	}

	public void setCrbAccBal(BigDecimal crbAccBal) {
		this.crbAccBal = crbAccBal;
	}

	public BigDecimal getCrbUnbillCharges() {
		return crbUnbillCharges;
	}

	public void setCrbUnbillCharges(BigDecimal crbUnbillCharges) {
		this.crbUnbillCharges = crbUnbillCharges;
	}

	public BigDecimal getCrbUnbillCalls() {
		return crbUnbillCalls;
	}

	public void setCrbUnbillCalls(BigDecimal crbUnbillCalls) {
		this.crbUnbillCalls = crbUnbillCalls;
	}

	public Short getCrbDiff() {
		return crbDiff;
	}

	public void setCrbDiff(Short crbDiff) {
		this.crbDiff = crbDiff;
	}

	public Short getCrbNextThreshold() {
		return crbNextThreshold;
	}

	public void setCrbNextThreshold(Short crbNextThreshold) {
		this.crbNextThreshold = crbNextThreshold;
	}

	public Short getCrbPrevThreshold() {
		return crbPrevThreshold;
	}

	public void setCrbPrevThreshold(Short crbPrevThreshold) {
		this.crbPrevThreshold = crbPrevThreshold;
	}

	public String getCrbCollPlan() {
		return crbCollPlan;
	}

	public void setCrbCollPlan(String crbCollPlan) {
		this.crbCollPlan = this.getPadded(crbCollPlan, crbCollPlanSize);
	}

	public Short getCrbMinThreshold() {
		return crbMinThreshold;
	}

	public void setCrbMinThreshold(Short crbMinThreshold) {
		this.crbMinThreshold = crbMinThreshold;
	}

	public String getCrbActivateFlag() {
		return crbActivateFlag;
	}

	public void setCrbActivateFlag(String crbActivateFlag) {
		this.crbActivateFlag = this.getPadded(crbActivateFlag, crbActivateFlagSize);
	}

	public String getCrbEapFlag() {
		return crbEapFlag;
	}

	public void setCrbEapFlag(String crbEapFlag) {
		this.crbEapFlag = this.getPadded(crbEapFlag, crbEapFlagSize);
	}

	public String getCrbBlStatus() {
		return crbBlStatus;
	}

	public void setCrbBlStatus(String crbBlStatus) {
		this.crbBlStatus = this.getPadded(crbBlStatus, crbBlStatusSize);
	}

	public String getCrbBlType() {
		return crbBlType;
	}

	public void setCrbBlType(String crbBlType) {
		this.crbBlType = this.getPadded(crbBlType, crbBlTypeSize);
	}

	public BigDecimal getCrbBlLimit() {
		return crbBlLimit;
	}

	public void setCrbBlLimit(BigDecimal crbBlLimit) {
		this.crbBlLimit = crbBlLimit;
	}

	public Short getCrbBlDiff() {
		return crbBlDiff;
	}

	public void setCrbBlDiff(Short crbBlDiff) {
		this.crbBlDiff = crbBlDiff;
	}

	public BigDecimal getCrbBlNextThresh() {
		return crbBlNextThresh;
	}

	public void setCrbBlNextThresh(BigDecimal crbBlNextThresh) {
		this.crbBlNextThresh = crbBlNextThresh;
	}

	public BigDecimal getCrbBlPrevThresh() {
		return crbBlPrevThresh;
	}

	public void setCrbBlPrevThresh(BigDecimal crbBlPrevThresh) {
		this.crbBlPrevThresh = crbBlPrevThresh;
	}

	public Integer getCrbBlNextAcnId() {
		return crbBlNextAcnId;
	}

	public void setCrbBlNextAcnId(Integer crbBlNextAcnId) {
		this.crbBlNextAcnId = crbBlNextAcnId;
	}

	public Integer getCrbBlPrevAcnId() {
		return crbBlPrevAcnId;
	}

	public void setCrbBlPrevAcnId(Integer crbBlPrevAcnId) {
		this.crbBlPrevAcnId = crbBlPrevAcnId;
	}

	public String getCrbBlTrigFlag() {
		return crbBlTrigFlag;
	}

	public void setCrbBlTrigFlag(String crbBlTrigFlag) {
		this.crbBlTrigFlag = this.getPadded(crbBlTrigFlag, crbBlTrigFlagSize);
	}

	public DateTime getCrbBlLastUpdate() {
		return crbBlLastUpdate;
	}

	public void setCrbBlLastUpdate(DateTime crbBlLastUpdate) {
		this.crbBlLastUpdate = crbBlLastUpdate;
	}

}
