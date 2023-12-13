package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;
import java.math.BigDecimal;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;
import com.eppixcomm.eppix.common.util.Date;

public class SodSimOrderDtPodetmDQO extends DBO implements Serializable {

	private SodSimOrderDtDMO sodDMO;
	private PodetmDMO podetmDMO;

	private String sodOrderNo;
	private String sodOrderLineNo;
	private String sodWarehouse;
	private String sodArticleNo;
	private String sodDescription;
	private String sodUnitCode;
	private String sodLongDesc;
	private String sodNlCategory;
	private Date sodDateRequired;
	private String sodStatus;
	private Date sodDateCompleted;
	private String sodSerialIndic;
	private BigDecimal sodQtyOrdered;
	private BigDecimal sodQtyReceived;
	private String sodProviderId;
	private String sodNetworkPrefix;
	private String sodFirstSim;
	private String sodFirstImsi;
	private BigDecimal sodCostPerSim;
	private String orderNo;
	private String orderLineNo;
	private String lineType;
	private String warehouse;
	private String product;
	private String description;
	private String unitCode;
	private String longDescription;
	private String nlCategory;
	private Date dateRequired;
	private String status;
	private Date dateCompleted;
	private String serialIndic;
	private String deliveryNo1;
	private String deliveryNo2;
	private String deliveryNo3;
	private String vatCode;
	private BigDecimal discount;
	private BigDecimal qtyOrdered;
	private BigDecimal qtyReceived;
	private BigDecimal qtyInvoiced;
	private BigDecimal weight;
	private BigDecimal localExpectCost;
	private BigDecimal localTotalExpect;
	private BigDecimal localTotalActual;
	private BigDecimal foreignExpCost;
	private BigDecimal foreignTotalExp;
	private BigDecimal foreignTotalAct;
	private BigDecimal allocExpectCost;
	private BigDecimal unallocQty;
	private BigDecimal qtyIssued;
	private String mrpFlag;
	private BigDecimal origQty;
	private String spare;
	private String stockUnitDp;
	private String transUnitDp;
	private String unitGroup;
	private String unitOperand;
	private BigDecimal unitFactor;
	private BigDecimal costPerUnit;
	private BigDecimal tranOrigOrderq;
	private BigDecimal tranOrderQty;
	private BigDecimal tranRecdQty;
	private BigDecimal tranInvQty;
	private BigDecimal tranExpCost;
	private BigDecimal tranExpFcost;
	private String levelOfDetail;
	private String tranCode1;
	private String tranCode2;
	private String tranCode3;
	private String grnRequired;
	private String logInvByQty;
	private String newRecThisRun;
	private BigDecimal invValueLogged;
	private BigDecimal invValuePosted;
	private BigDecimal invQtyToDate;
	private String newVatCode;
	private String goodsVatInd;
	private String valueDiscFlag;
	private String discountCode;
	private String pricingUnit;
	private String pricingUnitOp;
	private BigDecimal pricingUnitFact;
	private BigDecimal discountTranU;
	private BigDecimal listCostStockU;
	private BigDecimal listCostTranU;
	private BigDecimal listCostPriceU;
	private BigDecimal costPriceU;
	private BigDecimal discountPriceU;
	private BigDecimal qtyReturned;
	private BigDecimal tranQtyReturned;
	private Date shipDate;
	private String bundleLineRef;

	public static final int sodOrderNoFilter = 0;
	private static final int sodOrderNoSize = 10;

	public static final int sodOrderLineNoFilter = 1;
	private static final int sodOrderLineNoSize = 4;

	public static final int sodWarehouseFilter = 2;
	private static final int sodWarehouseSize = 2;

	public static final int sodArticleNoFilter = 3;
	private static final int sodArticleNoSize = 20;

	public static final int sodDescriptionFilter = 4;
	private static final int sodDescriptionSize = 20;

	public static final int sodUnitCodeFilter = 5;
	private static final int sodUnitCodeSize = 10;

	public static final int sodLongDescFilter = 6;
	private static final int sodLongDescSize = 40;

	public static final int sodNlCategoryFilter = 7;
	private static final int sodNlCategorySize = 3;

	public static final int sodDateRequiredFilter = 8;

	public static final int sodStatusFilter = 9;
	private static final int sodStatusSize = 1;

	public static final int sodDateCompletedFilter = 10;

	public static final int sodSerialIndicFilter = 11;
	private static final int sodSerialIndicSize = 1;

	public static final int sodQtyOrderedFilter = 12;

	public static final int sodQtyReceivedFilter = 13;

	public static final int sodProviderIdFilter = 14;
	private static final int sodProviderIdSize = 10;

	public static final int sodNetworkPrefixFilter = 15;
	private static final int sodNetworkPrefixSize = 5;

	public static final int sodFirstSimFilter = 16;
	private static final int sodFirstSimSize = 14;

	public static final int sodFirstImsiFilter = 17;
	private static final int sodFirstImsiSize = 15;

	public static final int sodCostPerSimFilter = 18;

	public static final int orderNoFilter = 19;
	private static final int orderNoSize = 10;

	public static final int orderLineNoFilter = 20;
	private static final int orderLineNoSize = 4;

	public static final int lineTypeFilter = 21;
	private static final int lineTypeSize = 1;

	public static final int warehouseFilter = 22;
	private static final int warehouseSize = 2;

	public static final int productFilter = 23;
	private static final int productSize = 20;

	public static final int descriptionFilter = 24;
	private static final int descriptionSize = 20;

	public static final int unitCodeFilter = 25;
	private static final int unitCodeSize = 10;

	public static final int longDescriptionFilter = 26;
	private static final int longDescriptionSize = 40;

	public static final int nlCategoryFilter = 27;
	private static final int nlCategorySize = 3;

	public static final int dateRequiredFilter = 28;

	public static final int statusFilter = 29;
	private static final int statusSize = 1;

	public static final int dateCompletedFilter = 30;

	public static final int serialIndicFilter = 31;
	private static final int serialIndicSize = 1;

	public static final int deliveryNo1Filter = 32;
	private static final int deliveryNo1Size = 8;

	public static final int deliveryNo2Filter = 33;
	private static final int deliveryNo2Size = 8;

	public static final int deliveryNo3Filter = 34;
	private static final int deliveryNo3Size = 8;

	public static final int vatCodeFilter = 35;
	private static final int vatCodeSize = 1;

	public static final int discountFilter = 36;

	public static final int qtyOrderedFilter = 37;

	public static final int qtyReceivedFilter = 38;

	public static final int qtyInvoicedFilter = 39;

	public static final int weightFilter = 40;

	public static final int localExpectCostFilter = 41;

	public static final int localTotalExpectFilter = 42;

	public static final int localTotalActualFilter = 43;

	public static final int foreignExpCostFilter = 44;

	public static final int foreignTotalExpFilter = 45;

	public static final int foreignTotalActFilter = 46;

	public static final int allocExpectCostFilter = 47;

	public static final int unallocQtyFilter = 48;

	public static final int qtyIssuedFilter = 49;

	public static final int mrpFlagFilter = 50;
	private static final int mrpFlagSize = 1;

	public static final int origQtyFilter = 51;

	public static final int spareFilter = 52;
	private static final int spareSize = 20;

	public static final int stockUnitDpFilter = 53;
	private static final int stockUnitDpSize = 1;

	public static final int transUnitDpFilter = 54;
	private static final int transUnitDpSize = 1;

	public static final int unitGroupFilter = 55;
	private static final int unitGroupSize = 1;

	public static final int unitOperandFilter = 56;
	private static final int unitOperandSize = 1;

	public static final int unitFactorFilter = 57;

	public static final int costPerUnitFilter = 58;

	public static final int tranOrigOrderqFilter = 59;

	public static final int tranOrderQtyFilter = 60;

	public static final int tranRecdQtyFilter = 61;

	public static final int tranInvQtyFilter = 62;

	public static final int tranExpCostFilter = 63;

	public static final int tranExpFcostFilter = 64;

	public static final int levelOfDetailFilter = 65;
	private static final int levelOfDetailSize = 1;

	public static final int tranCode1Filter = 66;
	private static final int tranCode1Size = 10;

	public static final int tranCode2Filter = 67;
	private static final int tranCode2Size = 10;

	public static final int tranCode3Filter = 68;
	private static final int tranCode3Size = 10;

	public static final int grnRequiredFilter = 69;
	private static final int grnRequiredSize = 1;

	public static final int logInvByQtyFilter = 70;
	private static final int logInvByQtySize = 1;

	public static final int newRecThisRunFilter = 71;
	private static final int newRecThisRunSize = 1;

	public static final int invValueLoggedFilter = 72;

	public static final int invValuePostedFilter = 73;

	public static final int invQtyToDateFilter = 74;

	public static final int newVatCodeFilter = 75;
	private static final int newVatCodeSize = 3;

	public static final int goodsVatIndFilter = 76;
	private static final int goodsVatIndSize = 1;

	public static final int valueDiscFlagFilter = 77;
	private static final int valueDiscFlagSize = 1;

	public static final int discountCodeFilter = 78;
	private static final int discountCodeSize = 8;

	public static final int pricingUnitFilter = 79;
	private static final int pricingUnitSize = 6;

	public static final int pricingUnitOpFilter = 80;
	private static final int pricingUnitOpSize = 1;

	public static final int pricingUnitFactFilter = 81;

	public static final int discountTranUFilter = 82;

	public static final int listCostStockUFilter = 83;

	public static final int listCostTranUFilter = 84;

	public static final int listCostPriceUFilter = 85;

	public static final int costPriceUFilter = 86;

	public static final int discountPriceUFilter = 87;

	public static final int qtyReturnedFilter = 88;

	public static final int tranQtyReturnedFilter = 89;

	public static final int shipDateFilter = 90;

	public static final int bundleLineRefFilter = 91;
	private static final int bundleLineRefSize = 5;

	public void deConstruct() {
		sodDMO = new SodSimOrderDtDMO(sodOrderNo, sodOrderLineNo, sodWarehouse,
				sodArticleNo, sodDescription, sodUnitCode, sodLongDesc,
				sodNlCategory, sodDateRequired, sodStatus, sodDateCompleted,
				sodSerialIndic, sodQtyOrdered, sodQtyReceived, sodProviderId,
				sodNetworkPrefix, sodFirstSim, sodFirstImsi, sodCostPerSim);
		
		podetmDMO = new PodetmDMO(orderNo, orderLineNo, lineType, sodWarehouse,
				product, description, sodUnitCode, longDescription, nlCategory,
				dateRequired, sodStatus, dateCompleted, serialIndic,
				deliveryNo1, deliveryNo2, deliveryNo3, vatCode, discount,
				qtyOrdered, qtyReceived, qtyInvoiced, weight, localExpectCost,
				localTotalExpect, localTotalActual, foreignExpCost,
				foreignTotalExp, foreignTotalAct, allocExpectCost, unallocQty,
				qtyIssued, mrpFlag, origQty, spare, stockUnitDp, transUnitDp,
				unitGroup, unitOperand, unitFactor, costPerUnit,
				tranOrigOrderq, tranOrderQty, tranRecdQty, tranInvQty,
				tranExpCost, tranExpFcost, levelOfDetail, tranCode1, tranCode2,
				tranCode3, grnRequired, logInvByQty, newRecThisRun,
				invValueLogged, invValuePosted, invQtyToDate, newVatCode,
				goodsVatInd, valueDiscFlag, discountCode, pricingUnit,
				pricingUnitOp, pricingUnitFact, discountTranU, listCostStockU,
				listCostTranU, listCostPriceU, costPriceU, discountPriceU,
				qtyReturned, tranQtyReturned, shipDate, bundleLineRef);
	}

	public SodSimOrderDtPodetmDQO() {
	};

	public SodSimOrderDtPodetmDQO(final String sodOrderNo,
			final String sodOrderLineNo, final String sodWarehouse,
			final String sodArticleNo, final String sodDescription,
			final String sodUnitCode, final String sodLongDesc,
			final String sodNlCategory, final Date sodDateRequired,
			final String sodStatus, final Date sodDateCompleted,
			final String sodSerialIndic, final BigDecimal sodQtyOrdered,
			final BigDecimal sodQtyReceived, final String sodProviderId,
			final String sodNetworkPrefix, final String sodFirstSim,
			final String sodFirstImsi, final BigDecimal sodCostPerSim,
			final String orderNo, final String orderLineNo,
			final String lineType, final String warehouse,
			final String product, final String description,
			final String unitCode, final String longDescription,
			final String nlCategory, final Date dateRequired,
			final String status, final Date dateCompleted,
			final String serialIndic, final String deliveryNo1,
			final String deliveryNo2, final String deliveryNo3,
			final String vatCode, final BigDecimal discount,
			final BigDecimal qtyOrdered, final BigDecimal qtyReceived,
			final BigDecimal qtyInvoiced, final BigDecimal weight,
			final BigDecimal localExpectCost,
			final BigDecimal localTotalExpect,
			final BigDecimal localTotalActual, final BigDecimal foreignExpCost,
			final BigDecimal foreignTotalExp, final BigDecimal foreignTotalAct,
			final BigDecimal allocExpectCost, final BigDecimal unallocQty,
			final BigDecimal qtyIssued, final String mrpFlag,
			final BigDecimal origQty, final String spare,
			final String stockUnitDp, final String transUnitDp,
			final String unitGroup, final String unitOperand,
			final BigDecimal unitFactor, final BigDecimal costPerUnit,
			final BigDecimal tranOrigOrderq, final BigDecimal tranOrderQty,
			final BigDecimal tranRecdQty, final BigDecimal tranInvQty,
			final BigDecimal tranExpCost, final BigDecimal tranExpFcost,
			final String levelOfDetail, final String tranCode1,
			final String tranCode2, final String tranCode3,
			final String grnRequired, final String logInvByQty,
			final String newRecThisRun, final BigDecimal invValueLogged,
			final BigDecimal invValuePosted, final BigDecimal invQtyToDate,
			final String newVatCode, final String goodsVatInd,
			final String valueDiscFlag, final String discountCode,
			final String pricingUnit, final String pricingUnitOp,
			final BigDecimal pricingUnitFact, final BigDecimal discountTranU,
			final BigDecimal listCostStockU, final BigDecimal listCostTranU,
			final BigDecimal listCostPriceU, final BigDecimal costPriceU,
			final BigDecimal discountPriceU, final BigDecimal qtyReturned,
			final BigDecimal tranQtyReturned, final Date shipDate,
			final String bundleLineRef) {

		this.sodOrderNo = sodOrderNo;
		this.sodOrderLineNo = sodOrderLineNo;
		this.sodWarehouse = sodWarehouse;
		this.sodArticleNo = sodArticleNo;
		this.sodDescription = sodDescription;
		this.sodUnitCode = sodUnitCode;
		this.sodLongDesc = sodLongDesc;
		this.sodNlCategory = sodNlCategory;
		this.sodDateRequired = sodDateRequired;
		this.sodStatus = sodStatus;
		this.sodDateCompleted = sodDateCompleted;
		this.sodSerialIndic = sodSerialIndic;
		this.sodQtyOrdered = sodQtyOrdered;
		this.sodQtyReceived = sodQtyReceived;
		this.sodProviderId = sodProviderId;
		this.sodNetworkPrefix = sodNetworkPrefix;
		this.sodFirstSim = sodFirstSim;
		this.sodFirstImsi = sodFirstImsi;
		this.sodCostPerSim = sodCostPerSim;
		this.orderNo = orderNo;
		this.orderLineNo = orderLineNo;
		this.lineType = lineType;
		this.warehouse = warehouse;
		this.product = product;
		this.description = description;
		this.unitCode = unitCode;
		this.longDescription = longDescription;
		this.nlCategory = nlCategory;
		this.dateRequired = dateRequired;
		this.status = status;
		this.dateCompleted = dateCompleted;
		this.serialIndic = serialIndic;
		this.deliveryNo1 = deliveryNo1;
		this.deliveryNo2 = deliveryNo2;
		this.deliveryNo3 = deliveryNo3;
		this.vatCode = vatCode;
		this.discount = discount;
		this.qtyOrdered = qtyOrdered;
		this.qtyReceived = qtyReceived;
		this.qtyInvoiced = qtyInvoiced;
		this.weight = weight;
		this.localExpectCost = localExpectCost;
		this.localTotalExpect = localTotalExpect;
		this.localTotalActual = localTotalActual;
		this.foreignExpCost = foreignExpCost;
		this.foreignTotalExp = foreignTotalExp;
		this.foreignTotalAct = foreignTotalAct;
		this.allocExpectCost = allocExpectCost;
		this.unallocQty = unallocQty;
		this.qtyIssued = qtyIssued;
		this.mrpFlag = mrpFlag;
		this.origQty = origQty;
		this.spare = spare;
		this.stockUnitDp = stockUnitDp;
		this.transUnitDp = transUnitDp;
		this.unitGroup = unitGroup;
		this.unitOperand = unitOperand;
		this.unitFactor = unitFactor;
		this.costPerUnit = costPerUnit;
		this.tranOrigOrderq = tranOrigOrderq;
		this.tranOrderQty = tranOrderQty;
		this.tranRecdQty = tranRecdQty;
		this.tranInvQty = tranInvQty;
		this.tranExpCost = tranExpCost;
		this.tranExpFcost = tranExpFcost;
		this.levelOfDetail = levelOfDetail;
		this.tranCode1 = tranCode1;
		this.tranCode2 = tranCode2;
		this.tranCode3 = tranCode3;
		this.grnRequired = grnRequired;
		this.logInvByQty = logInvByQty;
		this.newRecThisRun = newRecThisRun;
		this.invValueLogged = invValueLogged;
		this.invValuePosted = invValuePosted;
		this.invQtyToDate = invQtyToDate;
		this.newVatCode = newVatCode;
		this.goodsVatInd = goodsVatInd;
		this.valueDiscFlag = valueDiscFlag;
		this.discountCode = discountCode;
		this.pricingUnit = pricingUnit;
		this.pricingUnitOp = pricingUnitOp;
		this.pricingUnitFact = pricingUnitFact;
		this.discountTranU = discountTranU;
		this.listCostStockU = listCostStockU;
		this.listCostTranU = listCostTranU;
		this.listCostPriceU = listCostPriceU;
		this.costPriceU = costPriceU;
		this.discountPriceU = discountPriceU;
		this.qtyReturned = qtyReturned;
		this.tranQtyReturned = tranQtyReturned;
		this.shipDate = shipDate;
		this.bundleLineRef = bundleLineRef;
	};

	private static final int[] fieldSizes = new int[] { sodOrderNoSize,
			sodOrderLineNoSize, sodWarehouseSize, sodArticleNoSize,
			sodDescriptionSize, sodUnitCodeSize, sodLongDescSize,
			sodNlCategorySize, 0, sodStatusSize, 0, sodSerialIndicSize, 0, 0,
			sodProviderIdSize, sodNetworkPrefixSize, sodFirstSimSize,
			sodFirstImsiSize, 0, orderNoSize, orderLineNoSize, lineTypeSize,
			warehouseSize, productSize, descriptionSize, unitCodeSize,
			longDescriptionSize, nlCategorySize, 0, statusSize, 0,
			serialIndicSize, deliveryNo1Size, deliveryNo2Size, deliveryNo3Size,
			vatCodeSize, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, mrpFlagSize,
			0, spareSize, stockUnitDpSize, transUnitDpSize, unitGroupSize,
			unitOperandSize, 0, 0, 0, 0, 0, 0, 0, 0, levelOfDetailSize,
			tranCode1Size, tranCode2Size, tranCode3Size, grnRequiredSize,
			logInvByQtySize, newRecThisRunSize, 0, 0, 0, newVatCodeSize,
			goodsVatIndSize, valueDiscFlagSize, discountCodeSize,
			pricingUnitSize, pricingUnitOpSize, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
			bundleLineRefSize };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_DATE, FIELD_TYPE_STRING,
			FIELD_TYPE_DATE, FIELD_TYPE_STRING, FIELD_TYPE_BIGDECIMAL,
			FIELD_TYPE_BIGDECIMAL, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_BIGDECIMAL,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_DATE, FIELD_TYPE_STRING, FIELD_TYPE_DATE,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_BIGDECIMAL,
			FIELD_TYPE_BIGDECIMAL, FIELD_TYPE_BIGDECIMAL,
			FIELD_TYPE_BIGDECIMAL, FIELD_TYPE_BIGDECIMAL,
			FIELD_TYPE_BIGDECIMAL, FIELD_TYPE_BIGDECIMAL,
			FIELD_TYPE_BIGDECIMAL, FIELD_TYPE_BIGDECIMAL,
			FIELD_TYPE_BIGDECIMAL, FIELD_TYPE_BIGDECIMAL,
			FIELD_TYPE_BIGDECIMAL, FIELD_TYPE_BIGDECIMAL,
			FIELD_TYPE_BIGDECIMAL, FIELD_TYPE_STRING, FIELD_TYPE_BIGDECIMAL,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_BIGDECIMAL,
			FIELD_TYPE_BIGDECIMAL, FIELD_TYPE_BIGDECIMAL,
			FIELD_TYPE_BIGDECIMAL, FIELD_TYPE_BIGDECIMAL,
			FIELD_TYPE_BIGDECIMAL, FIELD_TYPE_BIGDECIMAL,
			FIELD_TYPE_BIGDECIMAL, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_BIGDECIMAL,
			FIELD_TYPE_BIGDECIMAL, FIELD_TYPE_BIGDECIMAL, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_BIGDECIMAL,
			FIELD_TYPE_BIGDECIMAL, FIELD_TYPE_BIGDECIMAL,
			FIELD_TYPE_BIGDECIMAL, FIELD_TYPE_BIGDECIMAL,
			FIELD_TYPE_BIGDECIMAL, FIELD_TYPE_BIGDECIMAL,
			FIELD_TYPE_BIGDECIMAL, FIELD_TYPE_BIGDECIMAL, FIELD_TYPE_DATE,
			FIELD_TYPE_STRING };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] {
				((this.sodOrderNo == null) ? null
						: (this.sodOrderNo.length() <= sodOrderNoSize) ? this.sodOrderNo
								: this.sodOrderNo.substring(0,
										this.sodOrderNoSize)),
				((this.sodOrderLineNo == null) ? null : (this.sodOrderLineNo
						.length() <= sodOrderLineNoSize) ? this.sodOrderLineNo
						: this.sodOrderLineNo.substring(0,
								this.sodOrderLineNoSize)),
				((this.sodWarehouse == null) ? null : (this.sodWarehouse
						.length() <= sodWarehouseSize) ? this.sodWarehouse
						: this.sodWarehouse.substring(0, this.sodWarehouseSize)),
				((this.sodArticleNo == null) ? null : (this.sodArticleNo
						.length() <= sodArticleNoSize) ? this.sodArticleNo
						: this.sodArticleNo.substring(0, this.sodArticleNoSize)),
				((this.sodDescription == null) ? null : (this.sodDescription
						.length() <= sodDescriptionSize) ? this.sodDescription
						: this.sodDescription.substring(0,
								this.sodDescriptionSize)),
				((this.sodUnitCode == null) ? null
						: (this.sodUnitCode.length() <= sodUnitCodeSize) ? this.sodUnitCode
								: this.sodUnitCode.substring(0,
										this.sodUnitCodeSize)),
				((this.sodLongDesc == null) ? null
						: (this.sodLongDesc.length() <= sodLongDescSize) ? this.sodLongDesc
								: this.sodLongDesc.substring(0,
										this.sodLongDescSize)),
				((this.sodNlCategory == null) ? null : (this.sodNlCategory
						.length() <= sodNlCategorySize) ? this.sodNlCategory
						: this.sodNlCategory.substring(0,
								this.sodNlCategorySize)),
				this.sodDateRequired,
				((this.sodStatus == null) ? null
						: (this.sodStatus.length() <= sodStatusSize) ? this.sodStatus
								: this.sodStatus.substring(0,
										this.sodStatusSize)),
				this.sodDateCompleted,
				((this.sodSerialIndic == null) ? null : (this.sodSerialIndic
						.length() <= sodSerialIndicSize) ? this.sodSerialIndic
						: this.sodSerialIndic.substring(0,
								this.sodSerialIndicSize)),
				this.sodQtyOrdered,
				this.sodQtyReceived,
				((this.sodProviderId == null) ? null : (this.sodProviderId
						.length() <= sodProviderIdSize) ? this.sodProviderId
						: this.sodProviderId.substring(0,
								this.sodProviderIdSize)),
				((this.sodNetworkPrefix == null) ? null
						: (this.sodNetworkPrefix.length() <= sodNetworkPrefixSize) ? this.sodNetworkPrefix
								: this.sodNetworkPrefix.substring(0,
										this.sodNetworkPrefixSize)),
				((this.sodFirstSim == null) ? null
						: (this.sodFirstSim.length() <= sodFirstSimSize) ? this.sodFirstSim
								: this.sodFirstSim.substring(0,
										this.sodFirstSimSize)),
				((this.sodFirstImsi == null) ? null : (this.sodFirstImsi
						.length() <= sodFirstImsiSize) ? this.sodFirstImsi
						: this.sodFirstImsi.substring(0, this.sodFirstImsiSize)),
				this.sodCostPerSim,
				((this.orderNo == null) ? null
						: (this.orderNo.length() <= orderNoSize) ? this.orderNo
								: this.orderNo.substring(0, this.orderNoSize)),
				((this.orderLineNo == null) ? null
						: (this.orderLineNo.length() <= orderLineNoSize) ? this.orderLineNo
								: this.orderLineNo.substring(0,
										this.orderLineNoSize)),
				((this.lineType == null) ? null
						: (this.lineType.length() <= lineTypeSize) ? this.lineType
								: this.lineType.substring(0, this.lineTypeSize)),
				((this.warehouse == null) ? null
						: (this.warehouse.length() <= warehouseSize) ? this.warehouse
								: this.warehouse.substring(0,
										this.warehouseSize)),
				((this.product == null) ? null
						: (this.product.length() <= productSize) ? this.product
								: this.product.substring(0, this.productSize)),
				((this.description == null) ? null
						: (this.description.length() <= descriptionSize) ? this.description
								: this.description.substring(0,
										this.descriptionSize)),
				((this.unitCode == null) ? null
						: (this.unitCode.length() <= unitCodeSize) ? this.unitCode
								: this.unitCode.substring(0, this.unitCodeSize)),
				((this.longDescription == null) ? null
						: (this.longDescription.length() <= longDescriptionSize) ? this.longDescription
								: this.longDescription.substring(0,
										this.longDescriptionSize)),
				((this.nlCategory == null) ? null
						: (this.nlCategory.length() <= nlCategorySize) ? this.nlCategory
								: this.nlCategory.substring(0,
										this.nlCategorySize)),
				this.dateRequired,
				((this.status == null) ? null
						: (this.status.length() <= statusSize) ? this.status
								: this.status.substring(0, this.statusSize)),
				this.dateCompleted,
				((this.serialIndic == null) ? null
						: (this.serialIndic.length() <= serialIndicSize) ? this.serialIndic
								: this.serialIndic.substring(0,
										this.serialIndicSize)),
				((this.deliveryNo1 == null) ? null
						: (this.deliveryNo1.length() <= deliveryNo1Size) ? this.deliveryNo1
								: this.deliveryNo1.substring(0,
										this.deliveryNo1Size)),
				((this.deliveryNo2 == null) ? null
						: (this.deliveryNo2.length() <= deliveryNo2Size) ? this.deliveryNo2
								: this.deliveryNo2.substring(0,
										this.deliveryNo2Size)),
				((this.deliveryNo3 == null) ? null
						: (this.deliveryNo3.length() <= deliveryNo3Size) ? this.deliveryNo3
								: this.deliveryNo3.substring(0,
										this.deliveryNo3Size)),
				((this.vatCode == null) ? null
						: (this.vatCode.length() <= vatCodeSize) ? this.vatCode
								: this.vatCode.substring(0, this.vatCodeSize)),
				this.discount,
				this.qtyOrdered,
				this.qtyReceived,
				this.qtyInvoiced,
				this.weight,
				this.localExpectCost,
				this.localTotalExpect,
				this.localTotalActual,
				this.foreignExpCost,
				this.foreignTotalExp,
				this.foreignTotalAct,
				this.allocExpectCost,
				this.unallocQty,
				this.qtyIssued,
				((this.mrpFlag == null) ? null
						: (this.mrpFlag.length() <= mrpFlagSize) ? this.mrpFlag
								: this.mrpFlag.substring(0, this.mrpFlagSize)),
				this.origQty,
				((this.spare == null) ? null
						: (this.spare.length() <= spareSize) ? this.spare
								: this.spare.substring(0, this.spareSize)),
				((this.stockUnitDp == null) ? null
						: (this.stockUnitDp.length() <= stockUnitDpSize) ? this.stockUnitDp
								: this.stockUnitDp.substring(0,
										this.stockUnitDpSize)),
				((this.transUnitDp == null) ? null
						: (this.transUnitDp.length() <= transUnitDpSize) ? this.transUnitDp
								: this.transUnitDp.substring(0,
										this.transUnitDpSize)),
				((this.unitGroup == null) ? null
						: (this.unitGroup.length() <= unitGroupSize) ? this.unitGroup
								: this.unitGroup.substring(0,
										this.unitGroupSize)),
				((this.unitOperand == null) ? null
						: (this.unitOperand.length() <= unitOperandSize) ? this.unitOperand
								: this.unitOperand.substring(0,
										this.unitOperandSize)),
				this.unitFactor,
				this.costPerUnit,
				this.tranOrigOrderq,
				this.tranOrderQty,
				this.tranRecdQty,
				this.tranInvQty,
				this.tranExpCost,
				this.tranExpFcost,
				((this.levelOfDetail == null) ? null : (this.levelOfDetail
						.length() <= levelOfDetailSize) ? this.levelOfDetail
						: this.levelOfDetail.substring(0,
								this.levelOfDetailSize)),
				((this.tranCode1 == null) ? null
						: (this.tranCode1.length() <= tranCode1Size) ? this.tranCode1
								: this.tranCode1.substring(0,
										this.tranCode1Size)),
				((this.tranCode2 == null) ? null
						: (this.tranCode2.length() <= tranCode2Size) ? this.tranCode2
								: this.tranCode2.substring(0,
										this.tranCode2Size)),
				((this.tranCode3 == null) ? null
						: (this.tranCode3.length() <= tranCode3Size) ? this.tranCode3
								: this.tranCode3.substring(0,
										this.tranCode3Size)),
				((this.grnRequired == null) ? null
						: (this.grnRequired.length() <= grnRequiredSize) ? this.grnRequired
								: this.grnRequired.substring(0,
										this.grnRequiredSize)),
				((this.logInvByQty == null) ? null
						: (this.logInvByQty.length() <= logInvByQtySize) ? this.logInvByQty
								: this.logInvByQty.substring(0,
										this.logInvByQtySize)),
				((this.newRecThisRun == null) ? null : (this.newRecThisRun
						.length() <= newRecThisRunSize) ? this.newRecThisRun
						: this.newRecThisRun.substring(0,
								this.newRecThisRunSize)),
				this.invValueLogged,
				this.invValuePosted,
				this.invQtyToDate,
				((this.newVatCode == null) ? null
						: (this.newVatCode.length() <= newVatCodeSize) ? this.newVatCode
								: this.newVatCode.substring(0,
										this.newVatCodeSize)),
				((this.goodsVatInd == null) ? null
						: (this.goodsVatInd.length() <= goodsVatIndSize) ? this.goodsVatInd
								: this.goodsVatInd.substring(0,
										this.goodsVatIndSize)),
				((this.valueDiscFlag == null) ? null : (this.valueDiscFlag
						.length() <= valueDiscFlagSize) ? this.valueDiscFlag
						: this.valueDiscFlag.substring(0,
								this.valueDiscFlagSize)),
				((this.discountCode == null) ? null : (this.discountCode
						.length() <= discountCodeSize) ? this.discountCode
						: this.discountCode.substring(0, this.discountCodeSize)),
				((this.pricingUnit == null) ? null
						: (this.pricingUnit.length() <= pricingUnitSize) ? this.pricingUnit
								: this.pricingUnit.substring(0,
										this.pricingUnitSize)),
				((this.pricingUnitOp == null) ? null : (this.pricingUnitOp
						.length() <= pricingUnitOpSize) ? this.pricingUnitOp
						: this.pricingUnitOp.substring(0,
								this.pricingUnitOpSize)),
				this.pricingUnitFact,
				this.discountTranU,
				this.listCostStockU,
				this.listCostTranU,
				this.listCostPriceU,
				this.costPriceU,
				this.discountPriceU,
				this.qtyReturned,
				this.tranQtyReturned,
				this.shipDate,
				((this.bundleLineRef == null) ? null : (this.bundleLineRef
						.length() <= bundleLineRefSize) ? this.bundleLineRef
						: this.bundleLineRef.substring(0,
								this.bundleLineRefSize)) };
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
		return null;
	}

	protected void set(Object[] fields) {
		this.sodOrderNo = rtrim((String) fields[0]);
		this.sodOrderLineNo = rtrim((String) fields[1]);
		this.sodWarehouse = rtrim((String) fields[2]);
		this.sodArticleNo = rtrim((String) fields[3]);
		this.sodDescription = rtrim((String) fields[4]);
		this.sodUnitCode = rtrim((String) fields[5]);
		this.sodLongDesc = rtrim((String) fields[6]);
		this.sodNlCategory = rtrim((String) fields[7]);
		this.sodDateRequired = ((fields[8] == null) ? null
				: new Date(fields[8]));
		this.sodStatus = rtrim((String) fields[9]);
		this.sodDateCompleted = ((fields[10] == null) ? null : new Date(
				fields[10]));
		this.sodSerialIndic = rtrim((String) fields[11]);
		this.sodQtyOrdered = ((BigDecimal) fields[12]);
		this.sodQtyReceived = ((BigDecimal) fields[13]);
		this.sodProviderId = rtrim((String) fields[14]);
		this.sodNetworkPrefix = rtrim((String) fields[15]);
		this.sodFirstSim = rtrim((String) fields[16]);
		this.sodFirstImsi = rtrim((String) fields[17]);
		this.sodCostPerSim = ((BigDecimal) fields[18]);
		this.orderNo = rtrim((String) fields[19]);
		this.orderLineNo = rtrim((String) fields[20]);
		this.lineType = rtrim((String) fields[21]);
		this.warehouse = rtrim((String) fields[22]);
		this.product = rtrim((String) fields[23]);
		this.description = rtrim((String) fields[24]);
		this.unitCode = rtrim((String) fields[25]);
		this.longDescription = rtrim((String) fields[26]);
		this.nlCategory = rtrim((String) fields[27]);
		this.dateRequired = ((fields[28] == null) ? null : new Date(fields[28]));
		this.status = rtrim((String) fields[29]);
		this.dateCompleted = ((fields[30] == null) ? null
				: new Date(fields[30]));
		this.serialIndic = rtrim((String) fields[31]);
		this.deliveryNo1 = rtrim((String) fields[32]);
		this.deliveryNo2 = rtrim((String) fields[33]);
		this.deliveryNo3 = rtrim((String) fields[34]);
		this.vatCode = rtrim((String) fields[35]);
		this.discount = ((BigDecimal) fields[36]);
		this.qtyOrdered = ((BigDecimal) fields[37]);
		this.qtyReceived = ((BigDecimal) fields[38]);
		this.qtyInvoiced = ((BigDecimal) fields[39]);
		this.weight = ((BigDecimal) fields[40]);
		this.localExpectCost = ((BigDecimal) fields[41]);
		this.localTotalExpect = ((BigDecimal) fields[42]);
		this.localTotalActual = ((BigDecimal) fields[43]);
		this.foreignExpCost = ((BigDecimal) fields[44]);
		this.foreignTotalExp = ((BigDecimal) fields[45]);
		this.foreignTotalAct = ((BigDecimal) fields[46]);
		this.allocExpectCost = ((BigDecimal) fields[47]);
		this.unallocQty = ((BigDecimal) fields[48]);
		this.qtyIssued = ((BigDecimal) fields[49]);
		this.mrpFlag = rtrim((String) fields[50]);
		this.origQty = ((BigDecimal) fields[51]);
		this.spare = rtrim((String) fields[52]);
		this.stockUnitDp = rtrim((String) fields[53]);
		this.transUnitDp = rtrim((String) fields[54]);
		this.unitGroup = rtrim((String) fields[55]);
		this.unitOperand = rtrim((String) fields[56]);
		this.unitFactor = ((BigDecimal) fields[57]);
		this.costPerUnit = ((BigDecimal) fields[58]);
		this.tranOrigOrderq = ((BigDecimal) fields[59]);
		this.tranOrderQty = ((BigDecimal) fields[60]);
		this.tranRecdQty = ((BigDecimal) fields[61]);
		this.tranInvQty = ((BigDecimal) fields[62]);
		this.tranExpCost = ((BigDecimal) fields[63]);
		this.tranExpFcost = ((BigDecimal) fields[64]);
		this.levelOfDetail = rtrim((String) fields[65]);
		this.tranCode1 = rtrim((String) fields[66]);
		this.tranCode2 = rtrim((String) fields[67]);
		this.tranCode3 = rtrim((String) fields[68]);
		this.grnRequired = rtrim((String) fields[69]);
		this.logInvByQty = rtrim((String) fields[70]);
		this.newRecThisRun = rtrim((String) fields[71]);
		this.invValueLogged = ((BigDecimal) fields[72]);
		this.invValuePosted = ((BigDecimal) fields[73]);
		this.invQtyToDate = ((BigDecimal) fields[74]);
		this.newVatCode = rtrim((String) fields[75]);
		this.goodsVatInd = rtrim((String) fields[76]);
		this.valueDiscFlag = rtrim((String) fields[77]);
		this.discountCode = rtrim((String) fields[78]);
		this.pricingUnit = rtrim((String) fields[79]);
		this.pricingUnitOp = rtrim((String) fields[80]);
		this.pricingUnitFact = ((BigDecimal) fields[81]);
		this.discountTranU = ((BigDecimal) fields[82]);
		this.listCostStockU = ((BigDecimal) fields[83]);
		this.listCostTranU = ((BigDecimal) fields[84]);
		this.listCostPriceU = ((BigDecimal) fields[85]);
		this.costPriceU = ((BigDecimal) fields[86]);
		this.discountPriceU = ((BigDecimal) fields[87]);
		this.qtyReturned = ((BigDecimal) fields[88]);
		this.tranQtyReturned = ((BigDecimal) fields[89]);
		this.shipDate = ((fields[90] == null) ? null : new Date(fields[90]));
		this.bundleLineRef = rtrim((String) fields[91]);
	}

	public void set(final String sodOrderNo, final String sodOrderLineNo,
			final String sodWarehouse, final String sodArticleNo,
			final String sodDescription, final String sodUnitCode,
			final String sodLongDesc, final String sodNlCategory,
			final Date sodDateRequired, final String sodStatus,
			final Date sodDateCompleted, final String sodSerialIndic,
			final BigDecimal sodQtyOrdered, final BigDecimal sodQtyReceived,
			final String sodProviderId, final String sodNetworkPrefix,
			final String sodFirstSim, final String sodFirstImsi,
			final BigDecimal sodCostPerSim, final String orderNo,
			final String orderLineNo, final String lineType,
			final String warehouse, final String product,
			final String description, final String unitCode,
			final String longDescription, final String nlCategory,
			final Date dateRequired, final String status,
			final Date dateCompleted, final String serialIndic,
			final String deliveryNo1, final String deliveryNo2,
			final String deliveryNo3, final String vatCode,
			final BigDecimal discount, final BigDecimal qtyOrdered,
			final BigDecimal qtyReceived, final BigDecimal qtyInvoiced,
			final BigDecimal weight, final BigDecimal localExpectCost,
			final BigDecimal localTotalExpect,
			final BigDecimal localTotalActual, final BigDecimal foreignExpCost,
			final BigDecimal foreignTotalExp, final BigDecimal foreignTotalAct,
			final BigDecimal allocExpectCost, final BigDecimal unallocQty,
			final BigDecimal qtyIssued, final String mrpFlag,
			final BigDecimal origQty, final String spare,
			final String stockUnitDp, final String transUnitDp,
			final String unitGroup, final String unitOperand,
			final BigDecimal unitFactor, final BigDecimal costPerUnit,
			final BigDecimal tranOrigOrderq, final BigDecimal tranOrderQty,
			final BigDecimal tranRecdQty, final BigDecimal tranInvQty,
			final BigDecimal tranExpCost, final BigDecimal tranExpFcost,
			final String levelOfDetail, final String tranCode1,
			final String tranCode2, final String tranCode3,
			final String grnRequired, final String logInvByQty,
			final String newRecThisRun, final BigDecimal invValueLogged,
			final BigDecimal invValuePosted, final BigDecimal invQtyToDate,
			final String newVatCode, final String goodsVatInd,
			final String valueDiscFlag, final String discountCode,
			final String pricingUnit, final String pricingUnitOp,
			final BigDecimal pricingUnitFact, final BigDecimal discountTranU,
			final BigDecimal listCostStockU, final BigDecimal listCostTranU,
			final BigDecimal listCostPriceU, final BigDecimal costPriceU,
			final BigDecimal discountPriceU, final BigDecimal qtyReturned,
			final BigDecimal tranQtyReturned, final Date shipDate,
			final String bundleLineRef) {

		this.sodOrderNo = sodOrderNo;
		this.sodOrderLineNo = sodOrderLineNo;
		this.sodWarehouse = sodWarehouse;
		this.sodArticleNo = sodArticleNo;
		this.sodDescription = sodDescription;
		this.sodUnitCode = sodUnitCode;
		this.sodLongDesc = sodLongDesc;
		this.sodNlCategory = sodNlCategory;
		this.sodDateRequired = sodDateRequired;
		this.sodStatus = sodStatus;
		this.sodDateCompleted = sodDateCompleted;
		this.sodSerialIndic = sodSerialIndic;
		this.sodQtyOrdered = sodQtyOrdered;
		this.sodQtyReceived = sodQtyReceived;
		this.sodProviderId = sodProviderId;
		this.sodNetworkPrefix = sodNetworkPrefix;
		this.sodFirstSim = sodFirstSim;
		this.sodFirstImsi = sodFirstImsi;
		this.sodCostPerSim = sodCostPerSim;
		this.orderNo = orderNo;
		this.orderLineNo = orderLineNo;
		this.lineType = lineType;
		this.warehouse = warehouse;
		this.product = product;
		this.description = description;
		this.unitCode = unitCode;
		this.longDescription = longDescription;
		this.nlCategory = nlCategory;
		this.dateRequired = dateRequired;
		this.status = status;
		this.dateCompleted = dateCompleted;
		this.serialIndic = serialIndic;
		this.deliveryNo1 = deliveryNo1;
		this.deliveryNo2 = deliveryNo2;
		this.deliveryNo3 = deliveryNo3;
		this.vatCode = vatCode;
		this.discount = discount;
		this.qtyOrdered = qtyOrdered;
		this.qtyReceived = qtyReceived;
		this.qtyInvoiced = qtyInvoiced;
		this.weight = weight;
		this.localExpectCost = localExpectCost;
		this.localTotalExpect = localTotalExpect;
		this.localTotalActual = localTotalActual;
		this.foreignExpCost = foreignExpCost;
		this.foreignTotalExp = foreignTotalExp;
		this.foreignTotalAct = foreignTotalAct;
		this.allocExpectCost = allocExpectCost;
		this.unallocQty = unallocQty;
		this.qtyIssued = qtyIssued;
		this.mrpFlag = mrpFlag;
		this.origQty = origQty;
		this.spare = spare;
		this.stockUnitDp = stockUnitDp;
		this.transUnitDp = transUnitDp;
		this.unitGroup = unitGroup;
		this.unitOperand = unitOperand;
		this.unitFactor = unitFactor;
		this.costPerUnit = costPerUnit;
		this.tranOrigOrderq = tranOrigOrderq;
		this.tranOrderQty = tranOrderQty;
		this.tranRecdQty = tranRecdQty;
		this.tranInvQty = tranInvQty;
		this.tranExpCost = tranExpCost;
		this.tranExpFcost = tranExpFcost;
		this.levelOfDetail = levelOfDetail;
		this.tranCode1 = tranCode1;
		this.tranCode2 = tranCode2;
		this.tranCode3 = tranCode3;
		this.grnRequired = grnRequired;
		this.logInvByQty = logInvByQty;
		this.newRecThisRun = newRecThisRun;
		this.invValueLogged = invValueLogged;
		this.invValuePosted = invValuePosted;
		this.invQtyToDate = invQtyToDate;
		this.newVatCode = newVatCode;
		this.goodsVatInd = goodsVatInd;
		this.valueDiscFlag = valueDiscFlag;
		this.discountCode = discountCode;
		this.pricingUnit = pricingUnit;
		this.pricingUnitOp = pricingUnitOp;
		this.pricingUnitFact = pricingUnitFact;
		this.discountTranU = discountTranU;
		this.listCostStockU = listCostStockU;
		this.listCostTranU = listCostTranU;
		this.listCostPriceU = listCostPriceU;
		this.costPriceU = costPriceU;
		this.discountPriceU = discountPriceU;
		this.qtyReturned = qtyReturned;
		this.tranQtyReturned = tranQtyReturned;
		this.shipDate = shipDate;
		this.bundleLineRef = bundleLineRef;
	}

	public String getSodOrderNo() {
		return sodOrderNo;
	}

	public void setSodOrderNo(String sodOrderNo) {
		this.sodOrderNo = sodOrderNo;
	}

	public String getSodOrderLineNo() {
		return sodOrderLineNo;
	}

	public void setSodOrderLineNo(String sodOrderLineNo) {
		this.sodOrderLineNo = sodOrderLineNo;
	}

	public String getSodWarehouse() {
		return sodWarehouse;
	}

	public void setSodWarehouse(String sodWarehouse) {
		this.sodWarehouse = sodWarehouse;
	}

	public String getSodArticleNo() {
		return sodArticleNo;
	}

	public void setSodArticleNo(String sodArticleNo) {
		this.sodArticleNo = sodArticleNo;
	}

	public String getSodDescription() {
		return sodDescription;
	}

	public void setSodDescription(String sodDescription) {
		this.sodDescription = sodDescription;
	}

	public String getSodUnitCode() {
		return sodUnitCode;
	}

	public void setSodUnitCode(String sodUnitCode) {
		this.sodUnitCode = sodUnitCode;
	}

	public String getSodLongDesc() {
		return sodLongDesc;
	}

	public void setSodLongDesc(String sodLongDesc) {
		this.sodLongDesc = sodLongDesc;
	}

	public String getSodNlCategory() {
		return sodNlCategory;
	}

	public void setSodNlCategory(String sodNlCategory) {
		this.sodNlCategory = sodNlCategory;
	}

	public Date getSodDateRequired() {
		return sodDateRequired;
	}

	public void setSodDateRequired(Date sodDateRequired) {
		this.sodDateRequired = sodDateRequired;
	}

	public String getSodStatus() {
		return sodStatus;
	}

	public void setSodStatus(String sodStatus) {
		this.sodStatus = sodStatus;
	}

	public Date getSodDateCompleted() {
		return sodDateCompleted;
	}

	public void setSodDateCompleted(Date sodDateCompleted) {
		this.sodDateCompleted = sodDateCompleted;
	}

	public String getSodSerialIndic() {
		return sodSerialIndic;
	}

	public void setSodSerialIndic(String sodSerialIndic) {
		this.sodSerialIndic = sodSerialIndic;
	}

	public BigDecimal getSodQtyOrdered() {
		return sodQtyOrdered;
	}

	public void setSodQtyOrdered(BigDecimal sodQtyOrdered) {
		this.sodQtyOrdered = sodQtyOrdered;
	}

	public BigDecimal getSodQtyReceived() {
		return sodQtyReceived;
	}

	public void setSodQtyReceived(BigDecimal sodQtyReceived) {
		this.sodQtyReceived = sodQtyReceived;
	}

	public String getSodProviderId() {
		return sodProviderId;
	}

	public void setSodProviderId(String sodProviderId) {
		this.sodProviderId = sodProviderId;
	}

	public String getSodNetworkPrefix() {
		return sodNetworkPrefix;
	}

	public void setSodNetworkPrefix(String sodNetworkPrefix) {
		this.sodNetworkPrefix = sodNetworkPrefix;
	}

	public String getSodFirstSim() {
		return sodFirstSim;
	}

	public void setSodFirstSim(String sodFirstSim) {
		this.sodFirstSim = sodFirstSim;
	}

	public String getSodFirstImsi() {
		return sodFirstImsi;
	}

	public void setSodFirstImsi(String sodFirstImsi) {
		this.sodFirstImsi = sodFirstImsi;
	}

	public BigDecimal getSodCostPerSim() {
		return sodCostPerSim;
	}

	public void setSodCostPerSim(BigDecimal sodCostPerSim) {
		this.sodCostPerSim = sodCostPerSim;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getOrderLineNo() {
		return orderLineNo;
	}

	public void setOrderLineNo(String orderLineNo) {
		this.orderLineNo = orderLineNo;
	}

	public String getLineType() {
		return lineType;
	}

	public void setLineType(String lineType) {
		this.lineType = lineType;
	}

	public String getWarehouse() {
		return warehouse;
	}

	public void setWarehouse(String warehouse) {
		this.warehouse = warehouse;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getUnitCode() {
		return unitCode;
	}

	public void setUnitCode(String unitCode) {
		this.unitCode = unitCode;
	}

	public String getLongDescription() {
		return longDescription;
	}

	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}

	public String getNlCategory() {
		return nlCategory;
	}

	public void setNlCategory(String nlCategory) {
		this.nlCategory = nlCategory;
	}

	public Date getDateRequired() {
		return dateRequired;
	}

	public void setDateRequired(Date dateRequired) {
		this.dateRequired = dateRequired;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getDateCompleted() {
		return dateCompleted;
	}

	public void setDateCompleted(Date dateCompleted) {
		this.dateCompleted = dateCompleted;
	}

	public String getSerialIndic() {
		return serialIndic;
	}

	public void setSerialIndic(String serialIndic) {
		this.serialIndic = serialIndic;
	}

	public String getDeliveryNo1() {
		return deliveryNo1;
	}

	public void setDeliveryNo1(String deliveryNo1) {
		this.deliveryNo1 = deliveryNo1;
	}

	public String getDeliveryNo2() {
		return deliveryNo2;
	}

	public void setDeliveryNo2(String deliveryNo2) {
		this.deliveryNo2 = deliveryNo2;
	}

	public String getDeliveryNo3() {
		return deliveryNo3;
	}

	public void setDeliveryNo3(String deliveryNo3) {
		this.deliveryNo3 = deliveryNo3;
	}

	public String getVatCode() {
		return vatCode;
	}

	public void setVatCode(String vatCode) {
		this.vatCode = vatCode;
	}

	public BigDecimal getDiscount() {
		return discount;
	}

	public void setDiscount(BigDecimal discount) {
		this.discount = discount;
	}

	public BigDecimal getQtyOrdered() {
		return qtyOrdered;
	}

	public void setQtyOrdered(BigDecimal qtyOrdered) {
		this.qtyOrdered = qtyOrdered;
	}

	public BigDecimal getQtyReceived() {
		return qtyReceived;
	}

	public void setQtyReceived(BigDecimal qtyReceived) {
		this.qtyReceived = qtyReceived;
	}

	public BigDecimal getQtyInvoiced() {
		return qtyInvoiced;
	}

	public void setQtyInvoiced(BigDecimal qtyInvoiced) {
		this.qtyInvoiced = qtyInvoiced;
	}

	public BigDecimal getWeight() {
		return weight;
	}

	public void setWeight(BigDecimal weight) {
		this.weight = weight;
	}

	public BigDecimal getLocalExpectCost() {
		return localExpectCost;
	}

	public void setLocalExpectCost(BigDecimal localExpectCost) {
		this.localExpectCost = localExpectCost;
	}

	public BigDecimal getLocalTotalExpect() {
		return localTotalExpect;
	}

	public void setLocalTotalExpect(BigDecimal localTotalExpect) {
		this.localTotalExpect = localTotalExpect;
	}

	public BigDecimal getLocalTotalActual() {
		return localTotalActual;
	}

	public void setLocalTotalActual(BigDecimal localTotalActual) {
		this.localTotalActual = localTotalActual;
	}

	public BigDecimal getForeignExpCost() {
		return foreignExpCost;
	}

	public void setForeignExpCost(BigDecimal foreignExpCost) {
		this.foreignExpCost = foreignExpCost;
	}

	public BigDecimal getForeignTotalExp() {
		return foreignTotalExp;
	}

	public void setForeignTotalExp(BigDecimal foreignTotalExp) {
		this.foreignTotalExp = foreignTotalExp;
	}

	public BigDecimal getForeignTotalAct() {
		return foreignTotalAct;
	}

	public void setForeignTotalAct(BigDecimal foreignTotalAct) {
		this.foreignTotalAct = foreignTotalAct;
	}

	public BigDecimal getAllocExpectCost() {
		return allocExpectCost;
	}

	public void setAllocExpectCost(BigDecimal allocExpectCost) {
		this.allocExpectCost = allocExpectCost;
	}

	public BigDecimal getUnallocQty() {
		return unallocQty;
	}

	public void setUnallocQty(BigDecimal unallocQty) {
		this.unallocQty = unallocQty;
	}

	public BigDecimal getQtyIssued() {
		return qtyIssued;
	}

	public void setQtyIssued(BigDecimal qtyIssued) {
		this.qtyIssued = qtyIssued;
	}

	public String getMrpFlag() {
		return mrpFlag;
	}

	public void setMrpFlag(String mrpFlag) {
		this.mrpFlag = mrpFlag;
	}

	public BigDecimal getOrigQty() {
		return origQty;
	}

	public void setOrigQty(BigDecimal origQty) {
		this.origQty = origQty;
	}

	public String getSpare() {
		return spare;
	}

	public void setSpare(String spare) {
		this.spare = spare;
	}

	public String getStockUnitDp() {
		return stockUnitDp;
	}

	public void setStockUnitDp(String stockUnitDp) {
		this.stockUnitDp = stockUnitDp;
	}

	public String getTransUnitDp() {
		return transUnitDp;
	}

	public void setTransUnitDp(String transUnitDp) {
		this.transUnitDp = transUnitDp;
	}

	public String getUnitGroup() {
		return unitGroup;
	}

	public void setUnitGroup(String unitGroup) {
		this.unitGroup = unitGroup;
	}

	public String getUnitOperand() {
		return unitOperand;
	}

	public void setUnitOperand(String unitOperand) {
		this.unitOperand = unitOperand;
	}

	public BigDecimal getUnitFactor() {
		return unitFactor;
	}

	public void setUnitFactor(BigDecimal unitFactor) {
		this.unitFactor = unitFactor;
	}

	public BigDecimal getCostPerUnit() {
		return costPerUnit;
	}

	public void setCostPerUnit(BigDecimal costPerUnit) {
		this.costPerUnit = costPerUnit;
	}

	public BigDecimal getTranOrigOrderq() {
		return tranOrigOrderq;
	}

	public void setTranOrigOrderq(BigDecimal tranOrigOrderq) {
		this.tranOrigOrderq = tranOrigOrderq;
	}

	public BigDecimal getTranOrderQty() {
		return tranOrderQty;
	}

	public void setTranOrderQty(BigDecimal tranOrderQty) {
		this.tranOrderQty = tranOrderQty;
	}

	public BigDecimal getTranRecdQty() {
		return tranRecdQty;
	}

	public void setTranRecdQty(BigDecimal tranRecdQty) {
		this.tranRecdQty = tranRecdQty;
	}

	public BigDecimal getTranInvQty() {
		return tranInvQty;
	}

	public void setTranInvQty(BigDecimal tranInvQty) {
		this.tranInvQty = tranInvQty;
	}

	public BigDecimal getTranExpCost() {
		return tranExpCost;
	}

	public void setTranExpCost(BigDecimal tranExpCost) {
		this.tranExpCost = tranExpCost;
	}

	public BigDecimal getTranExpFcost() {
		return tranExpFcost;
	}

	public void setTranExpFcost(BigDecimal tranExpFcost) {
		this.tranExpFcost = tranExpFcost;
	}

	public String getLevelOfDetail() {
		return levelOfDetail;
	}

	public void setLevelOfDetail(String levelOfDetail) {
		this.levelOfDetail = levelOfDetail;
	}

	public String getTranCode1() {
		return tranCode1;
	}

	public void setTranCode1(String tranCode1) {
		this.tranCode1 = tranCode1;
	}

	public String getTranCode2() {
		return tranCode2;
	}

	public void setTranCode2(String tranCode2) {
		this.tranCode2 = tranCode2;
	}

	public String getTranCode3() {
		return tranCode3;
	}

	public void setTranCode3(String tranCode3) {
		this.tranCode3 = tranCode3;
	}

	public String getGrnRequired() {
		return grnRequired;
	}

	public void setGrnRequired(String grnRequired) {
		this.grnRequired = grnRequired;
	}

	public String getLogInvByQty() {
		return logInvByQty;
	}

	public void setLogInvByQty(String logInvByQty) {
		this.logInvByQty = logInvByQty;
	}

	public String getNewRecThisRun() {
		return newRecThisRun;
	}

	public void setNewRecThisRun(String newRecThisRun) {
		this.newRecThisRun = newRecThisRun;
	}

	public BigDecimal getInvValueLogged() {
		return invValueLogged;
	}

	public void setInvValueLogged(BigDecimal invValueLogged) {
		this.invValueLogged = invValueLogged;
	}

	public BigDecimal getInvValuePosted() {
		return invValuePosted;
	}

	public void setInvValuePosted(BigDecimal invValuePosted) {
		this.invValuePosted = invValuePosted;
	}

	public BigDecimal getInvQtyToDate() {
		return invQtyToDate;
	}

	public void setInvQtyToDate(BigDecimal invQtyToDate) {
		this.invQtyToDate = invQtyToDate;
	}

	public String getNewVatCode() {
		return newVatCode;
	}

	public void setNewVatCode(String newVatCode) {
		this.newVatCode = newVatCode;
	}

	public String getGoodsVatInd() {
		return goodsVatInd;
	}

	public void setGoodsVatInd(String goodsVatInd) {
		this.goodsVatInd = goodsVatInd;
	}

	public String getValueDiscFlag() {
		return valueDiscFlag;
	}

	public void setValueDiscFlag(String valueDiscFlag) {
		this.valueDiscFlag = valueDiscFlag;
	}

	public String getDiscountCode() {
		return discountCode;
	}

	public void setDiscountCode(String discountCode) {
		this.discountCode = discountCode;
	}

	public String getPricingUnit() {
		return pricingUnit;
	}

	public void setPricingUnit(String pricingUnit) {
		this.pricingUnit = pricingUnit;
	}

	public String getPricingUnitOp() {
		return pricingUnitOp;
	}

	public void setPricingUnitOp(String pricingUnitOp) {
		this.pricingUnitOp = pricingUnitOp;
	}

	public BigDecimal getPricingUnitFact() {
		return pricingUnitFact;
	}

	public void setPricingUnitFact(BigDecimal pricingUnitFact) {
		this.pricingUnitFact = pricingUnitFact;
	}

	public BigDecimal getDiscountTranU() {
		return discountTranU;
	}

	public void setDiscountTranU(BigDecimal discountTranU) {
		this.discountTranU = discountTranU;
	}

	public BigDecimal getListCostStockU() {
		return listCostStockU;
	}

	public void setListCostStockU(BigDecimal listCostStockU) {
		this.listCostStockU = listCostStockU;
	}

	public BigDecimal getListCostTranU() {
		return listCostTranU;
	}

	public void setListCostTranU(BigDecimal listCostTranU) {
		this.listCostTranU = listCostTranU;
	}

	public BigDecimal getListCostPriceU() {
		return listCostPriceU;
	}

	public void setListCostPriceU(BigDecimal listCostPriceU) {
		this.listCostPriceU = listCostPriceU;
	}

	public BigDecimal getCostPriceU() {
		return costPriceU;
	}

	public void setCostPriceU(BigDecimal costPriceU) {
		this.costPriceU = costPriceU;
	}

	public BigDecimal getDiscountPriceU() {
		return discountPriceU;
	}

	public void setDiscountPriceU(BigDecimal discountPriceU) {
		this.discountPriceU = discountPriceU;
	}

	public BigDecimal getQtyReturned() {
		return qtyReturned;
	}

	public void setQtyReturned(BigDecimal qtyReturned) {
		this.qtyReturned = qtyReturned;
	}

	public BigDecimal getTranQtyReturned() {
		return tranQtyReturned;
	}

	public void setTranQtyReturned(BigDecimal tranQtyReturned) {
		this.tranQtyReturned = tranQtyReturned;
	}

	public Date getShipDate() {
		return shipDate;
	}

	public void setShipDate(Date shipDate) {
		this.shipDate = shipDate;
	}

	public String getBundleLineRef() {
		return bundleLineRef;
	}

	public void setBundleLineRef(String bundleLineRef) {
		this.bundleLineRef = bundleLineRef;
	}

}
