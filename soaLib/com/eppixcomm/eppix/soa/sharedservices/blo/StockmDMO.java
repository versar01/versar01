package com.eppixcomm.eppix.soa.sharedservices.blo;

import java.io.Serializable;
import java.math.BigDecimal;

import com.eppixcomm.eppix.common.data.DAOArgs;
import com.eppixcomm.eppix.common.data.DBO;
import com.eppixcomm.eppix.common.util.Date;

public class StockmDMO extends DBO implements Serializable {

	private String warehouse;
	private String product;
	private String alpha;
	private String description;
	private String supersession;
	private Date supsessionDate;
	private String alternatives01;
	private String alternatives02;
	private String alternatives03;
	private String alternatives04;
	private String alternatives05;
	private String alternatives06;
	private String alternatives07;
	private String alternatives08;
	private String alternatives09;
	private String alternatives10;
	private String unitCode;
	private String binNumber;
	private Date issueDate;
	private Date stockDate;
	private Date deliveryDate;
	private String longDescription;
	private String oldVatCode;
	private String abcCategory;
	private String discount;
	private String nominalKey;
	private String purchaseKey;
	private String serialNumbers;
	private String analysisA;
	private String analysisB;
	private String analysisC;
	private String queueSequence;
	private String qtyDecimalPlaces;
	private String mrpBatching;
	private String workingLevel;
	private String makeOrBuy;
	private String purchaseUnit;
	private String sellingUnit;
	private String bulkItem;
	private String drawingNumber;
	private String catalogueNumber;
	private String unitLength;
	private String unitWidth;
	private String unitHeight;
	private String supplier;
	private String batchTraceability;
	private String lastSupplier;
	private String stdCostFreeze;
	private String reorderFreeze;
	private BigDecimal physicalQty;
	private BigDecimal allocatedQty;
	private BigDecimal backOrderQty;
	private BigDecimal forwardOrderQty;
	private BigDecimal onOrderQty;
	private BigDecimal price;
	private BigDecimal weight;
	private BigDecimal standardCost;
	private BigDecimal currentCost;
	private BigDecimal expectedCost;
	private BigDecimal economicReorderQ;
	private BigDecimal leadTime;
	private BigDecimal minStockLevel;
	private BigDecimal averageSalesValu;
	private BigDecimal monthToDate01;
	private BigDecimal monthToDate02;
	private BigDecimal monthToDate03;
	private BigDecimal monthToDate04;
	private BigDecimal monthToDate05;
	private BigDecimal monthToDate06;
	private BigDecimal monthToDate07;
	private BigDecimal monthToDate08;
	private BigDecimal monthToDate09;
	private BigDecimal monthToDate10;
	private BigDecimal yearToDate01;
	private BigDecimal yearToDate02;
	private BigDecimal yearToDate03;
	private BigDecimal yearToDate04;
	private BigDecimal yearToDate05;
	private BigDecimal yearToDate06;
	private BigDecimal yearToDate07;
	private BigDecimal yearToDate08;
	private BigDecimal yearToDate09;
	private BigDecimal yearToDate10;
	private BigDecimal previousSaleVal1;
	private BigDecimal previousSaleVal2;
	private BigDecimal previousSaleVal3;
	private BigDecimal periodIssueQty01;
	private BigDecimal periodIssueQty02;
	private BigDecimal periodIssueQty03;
	private BigDecimal periodIssueQty04;
	private BigDecimal periodIssueQty05;
	private BigDecimal periodIssueQty06;
	private BigDecimal periodIssueQty07;
	private BigDecimal periodIssueQty08;
	private BigDecimal periodIssueQty09;
	private BigDecimal periodIssueQty10;
	private BigDecimal periodIssueQty11;
	private BigDecimal periodIssueQty12;
	private BigDecimal periodIssueQty13;
	private BigDecimal periodIssueVal01;
	private BigDecimal periodIssueVal02;
	private BigDecimal periodIssueVal03;
	private BigDecimal periodIssueVal04;
	private BigDecimal periodIssueVal05;
	private BigDecimal periodIssueVal06;
	private BigDecimal periodIssueVal07;
	private BigDecimal periodIssueVal08;
	private BigDecimal periodIssueVal09;
	private BigDecimal periodIssueVal10;
	private BigDecimal periodIssueVal11;
	private BigDecimal periodIssueVal12;
	private BigDecimal periodIssueVal13;
	private BigDecimal standardLabour;
	private BigDecimal standardOverhead;
	private BigDecimal standardMaterial;
	private BigDecimal standardSubcontra;
	private BigDecimal mrpReorderRoundi;
	private BigDecimal purchaseFactor;
	private BigDecimal sellingFactor;
	private BigDecimal safetyStockLevel;
	private BigDecimal materialOnCost;
	private BigDecimal labourOnCost;
	private BigDecimal overheadOnCost;
	private BigDecimal maximumStockLeve;
	private BigDecimal shelfLife;
	private BigDecimal stockLength;
	private BigDecimal stockWidth;
	private BigDecimal stockHeight;
	private BigDecimal currentMaterial;
	private BigDecimal currentLabour;
	private BigDecimal currentOverhead;
	private BigDecimal currentSubcontrac;
	private BigDecimal uninspectedQty;
	private BigDecimal periodDemand01;
	private BigDecimal periodDemand02;
	private BigDecimal periodDemand03;
	private BigDecimal periodDemand04;
	private BigDecimal periodDemand05;
	private BigDecimal periodDemand06;
	private BigDecimal periodDemand07;
	private BigDecimal periodDemand08;
	private BigDecimal periodDemand09;
	private BigDecimal periodDemand10;
	private BigDecimal periodDemand11;
	private BigDecimal periodDemand12;
	private BigDecimal periodDemand13;
	private BigDecimal safetyDays;
	private BigDecimal reviewDays;
	private BigDecimal reorderDays;
	private BigDecimal prYield;
	private BigDecimal setupCost;
	private BigDecimal dspare01;
	private BigDecimal dspare02;
	private BigDecimal dspare03;
	private BigDecimal dspare04;
	private BigDecimal dspare05;
	private BigDecimal dspare06;
	private BigDecimal dspare07;
	private BigDecimal dspare08;
	private BigDecimal dspare09;
	private BigDecimal dspare10;
	private BigDecimal inspectionYield;
	private BigDecimal holdingCost;
	private Integer inspectCycle;
	private Integer batchReceipts;
	private Integer lowestWhereUsed;
	private Date lastRevalue;
	private Integer lastWhereUsedRu;
	private BigDecimal subOncost;
	private Integer spareInteger;
	private BigDecimal stockTakeToleran;
	private BigDecimal weightLow;
	private String mpsType;
	private String spare;
	private BigDecimal wholesalePrice;
	private BigDecimal worderAllocations;
	private String spare2;
	private String analysisXRef;
	private String vatInclusive;
	private String stockVatType;
	private String buyerId;
	private String levelOfDetail;
	private String pricingDiscount;
	private String despatchUnits;
	private String despatchUnitUse;
	private String stockType;
	private String packaging;
	private String shippingCategory;

	public static final int warehouseFilter = 0;
	private static final int warehouseSize = 2;

	public static final int productFilter = 1;
	private static final int productSize = 20;

	public static final int alphaFilter = 2;
	private static final int alphaSize = 10;

	public static final int descriptionFilter = 3;
	private static final int descriptionSize = 20;

	public static final int supersessionFilter = 4;
	private static final int supersessionSize = 22;

	public static final int supsessionDateFilter = 5;

	public static final int alternatives01Filter = 6;
	private static final int alternatives01Size = 22;

	public static final int alternatives02Filter = 7;
	private static final int alternatives02Size = 22;

	public static final int alternatives03Filter = 8;
	private static final int alternatives03Size = 22;

	public static final int alternatives04Filter = 9;
	private static final int alternatives04Size = 22;

	public static final int alternatives05Filter = 10;
	private static final int alternatives05Size = 22;

	public static final int alternatives06Filter = 11;
	private static final int alternatives06Size = 22;

	public static final int alternatives07Filter = 12;
	private static final int alternatives07Size = 22;

	public static final int alternatives08Filter = 13;
	private static final int alternatives08Size = 22;

	public static final int alternatives09Filter = 14;
	private static final int alternatives09Size = 22;

	public static final int alternatives10Filter = 15;
	private static final int alternatives10Size = 22;

	public static final int unitCodeFilter = 16;
	private static final int unitCodeSize = 10;

	public static final int binNumberFilter = 17;
	private static final int binNumberSize = 10;

	public static final int issueDateFilter = 18;

	public static final int stockDateFilter = 19;

	public static final int deliveryDateFilter = 20;

	public static final int longDescriptionFilter = 21;
	private static final int longDescriptionSize = 40;

	public static final int oldVatCodeFilter = 22;
	private static final int oldVatCodeSize = 1;

	public static final int abcCategoryFilter = 23;
	private static final int abcCategorySize = 1;

	public static final int discountFilter = 24;
	private static final int discountSize = 8;

	public static final int nominalKeyFilter = 25;
	private static final int nominalKeySize = 3;

	public static final int purchaseKeyFilter = 26;
	private static final int purchaseKeySize = 3;

	public static final int serialNumbersFilter = 27;
	private static final int serialNumbersSize = 1;

	public static final int analysisAFilter = 28;
	private static final int analysisASize = 10;

	public static final int analysisBFilter = 29;
	private static final int analysisBSize = 10;

	public static final int analysisCFilter = 30;
	private static final int analysisCSize = 10;

	public static final int queueSequenceFilter = 31;
	private static final int queueSequenceSize = 6;

	public static final int qtyDecimalPlacesFilter = 32;
	private static final int qtyDecimalPlacesSize = 1;

	public static final int mrpBatchingFilter = 33;
	private static final int mrpBatchingSize = 1;

	public static final int workingLevelFilter = 34;
	private static final int workingLevelSize = 1;

	public static final int makeOrBuyFilter = 35;
	private static final int makeOrBuySize = 1;

	public static final int purchaseUnitFilter = 36;
	private static final int purchaseUnitSize = 10;

	public static final int sellingUnitFilter = 37;
	private static final int sellingUnitSize = 10;

	public static final int bulkItemFilter = 38;
	private static final int bulkItemSize = 1;

	public static final int drawingNumberFilter = 39;
	private static final int drawingNumberSize = 20;

	public static final int catalogueNumberFilter = 40;
	private static final int catalogueNumberSize = 20;

	public static final int unitLengthFilter = 41;
	private static final int unitLengthSize = 4;

	public static final int unitWidthFilter = 42;
	private static final int unitWidthSize = 4;

	public static final int unitHeightFilter = 43;
	private static final int unitHeightSize = 4;

	public static final int supplierFilter = 44;
	private static final int supplierSize = 8;

	public static final int batchTraceabilityFilter = 45;
	private static final int batchTraceabilitySize = 1;

	public static final int lastSupplierFilter = 46;
	private static final int lastSupplierSize = 8;

	public static final int stdCostFreezeFilter = 47;
	private static final int stdCostFreezeSize = 1;

	public static final int reorderFreezeFilter = 48;
	private static final int reorderFreezeSize = 1;

	public static final int physicalQtyFilter = 49;

	public static final int allocatedQtyFilter = 50;

	public static final int backOrderQtyFilter = 51;

	public static final int forwardOrderQtyFilter = 52;

	public static final int onOrderQtyFilter = 53;

	public static final int priceFilter = 54;

	public static final int weightFilter = 55;

	public static final int standardCostFilter = 56;

	public static final int currentCostFilter = 57;

	public static final int expectedCostFilter = 58;

	public static final int economicReorderQFilter = 59;

	public static final int leadTimeFilter = 60;

	public static final int minStockLevelFilter = 61;

	public static final int averageSalesValuFilter = 62;

	public static final int monthToDate01Filter = 63;

	public static final int monthToDate02Filter = 64;

	public static final int monthToDate03Filter = 65;

	public static final int monthToDate04Filter = 66;

	public static final int monthToDate05Filter = 67;

	public static final int monthToDate06Filter = 68;

	public static final int monthToDate07Filter = 69;

	public static final int monthToDate08Filter = 70;

	public static final int monthToDate09Filter = 71;

	public static final int monthToDate10Filter = 72;

	public static final int yearToDate01Filter = 73;

	public static final int yearToDate02Filter = 74;

	public static final int yearToDate03Filter = 75;

	public static final int yearToDate04Filter = 76;

	public static final int yearToDate05Filter = 77;

	public static final int yearToDate06Filter = 78;

	public static final int yearToDate07Filter = 79;

	public static final int yearToDate08Filter = 80;

	public static final int yearToDate09Filter = 81;

	public static final int yearToDate10Filter = 82;

	public static final int previousSaleVal1Filter = 83;

	public static final int previousSaleVal2Filter = 84;

	public static final int previousSaleVal3Filter = 85;

	public static final int periodIssueQty01Filter = 86;

	public static final int periodIssueQty02Filter = 87;

	public static final int periodIssueQty03Filter = 88;

	public static final int periodIssueQty04Filter = 89;

	public static final int periodIssueQty05Filter = 90;

	public static final int periodIssueQty06Filter = 91;

	public static final int periodIssueQty07Filter = 92;

	public static final int periodIssueQty08Filter = 93;

	public static final int periodIssueQty09Filter = 94;

	public static final int periodIssueQty10Filter = 95;

	public static final int periodIssueQty11Filter = 96;

	public static final int periodIssueQty12Filter = 97;

	public static final int periodIssueQty13Filter = 98;

	public static final int periodIssueVal01Filter = 99;

	public static final int periodIssueVal02Filter = 100;

	public static final int periodIssueVal03Filter = 101;

	public static final int periodIssueVal04Filter = 102;

	public static final int periodIssueVal05Filter = 103;

	public static final int periodIssueVal06Filter = 104;

	public static final int periodIssueVal07Filter = 105;

	public static final int periodIssueVal08Filter = 106;

	public static final int periodIssueVal09Filter = 107;

	public static final int periodIssueVal10Filter = 108;

	public static final int periodIssueVal11Filter = 109;

	public static final int periodIssueVal12Filter = 110;

	public static final int periodIssueVal13Filter = 111;

	public static final int standardLabourFilter = 112;

	public static final int standardOverheadFilter = 113;

	public static final int standardMaterialFilter = 114;

	public static final int standardSubcontraFilter = 115;

	public static final int mrpReorderRoundiFilter = 116;

	public static final int purchaseFactorFilter = 117;

	public static final int sellingFactorFilter = 118;

	public static final int safetyStockLevelFilter = 119;

	public static final int materialOnCostFilter = 120;

	public static final int labourOnCostFilter = 121;

	public static final int overheadOnCostFilter = 122;

	public static final int maximumStockLeveFilter = 123;

	public static final int shelfLifeFilter = 124;

	public static final int stockLengthFilter = 125;

	public static final int stockWidthFilter = 126;

	public static final int stockHeightFilter = 127;

	public static final int currentMaterialFilter = 128;

	public static final int currentLabourFilter = 129;

	public static final int currentOverheadFilter = 130;

	public static final int currentSubcontracFilter = 131;

	public static final int uninspectedQtyFilter = 132;

	public static final int periodDemand01Filter = 133;

	public static final int periodDemand02Filter = 134;

	public static final int periodDemand03Filter = 135;

	public static final int periodDemand04Filter = 136;

	public static final int periodDemand05Filter = 137;

	public static final int periodDemand06Filter = 138;

	public static final int periodDemand07Filter = 139;

	public static final int periodDemand08Filter = 140;

	public static final int periodDemand09Filter = 141;

	public static final int periodDemand10Filter = 142;

	public static final int periodDemand11Filter = 143;

	public static final int periodDemand12Filter = 144;

	public static final int periodDemand13Filter = 145;

	public static final int safetyDaysFilter = 146;

	public static final int reviewDaysFilter = 147;

	public static final int reorderDaysFilter = 148;

	public static final int prYieldFilter = 149;

	public static final int setupCostFilter = 150;

	public static final int dspare01Filter = 151;

	public static final int dspare02Filter = 152;

	public static final int dspare03Filter = 153;

	public static final int dspare04Filter = 154;

	public static final int dspare05Filter = 155;

	public static final int dspare06Filter = 156;

	public static final int dspare07Filter = 157;

	public static final int dspare08Filter = 158;

	public static final int dspare09Filter = 159;

	public static final int dspare10Filter = 160;

	public static final int inspectionYieldFilter = 161;

	public static final int holdingCostFilter = 162;

	public static final int inspectCycleFilter = 163;

	public static final int batchReceiptsFilter = 164;

	public static final int lowestWhereUsedFilter = 165;

	public static final int lastRevalueFilter = 166;

	public static final int lastWhereUsedRuFilter = 167;

	public static final int subOncostFilter = 168;

	public static final int spareIntegerFilter = 169;

	public static final int stockTakeToleranFilter = 170;

	public static final int weightLowFilter = 171;

	public static final int mpsTypeFilter = 172;
	private static final int mpsTypeSize = 1;

	public static final int spareFilter = 173;
	private static final int spareSize = 6;

	public static final int wholesalePriceFilter = 174;

	public static final int worderAllocationsFilter = 175;

	public static final int spare2Filter = 176;
	private static final int spare2Size = 48;

	public static final int analysisXRefFilter = 177;
	private static final int analysisXRefSize = 3;

	public static final int vatInclusiveFilter = 178;
	private static final int vatInclusiveSize = 1;

	public static final int stockVatTypeFilter = 179;
	private static final int stockVatTypeSize = 10;

	public static final int buyerIdFilter = 180;
	private static final int buyerIdSize = 8;

	public static final int levelOfDetailFilter = 181;
	private static final int levelOfDetailSize = 1;

	public static final int pricingDiscountFilter = 182;
	private static final int pricingDiscountSize = 8;

	public static final int despatchUnitsFilter = 183;
	private static final int despatchUnitsSize = 10;

	public static final int despatchUnitUseFilter = 184;
	private static final int despatchUnitUseSize = 1;

	public static final int stockTypeFilter = 185;
	private static final int stockTypeSize = 1;

	public static final int packagingFilter = 186;
	private static final int packagingSize = 10;

	public static final int shippingCategoryFilter = 187;
	private static final int shippingCategorySize = 10;

	public StockmDMO() {
	};

	public StockmDMO(final String warehouse, final String product,
			final String alpha, final String description,
			final String supersession, final Date supsessionDate,
			final String alternatives01, final String alternatives02,
			final String alternatives03, final String alternatives04,
			final String alternatives05, final String alternatives06,
			final String alternatives07, final String alternatives08,
			final String alternatives09, final String alternatives10,
			final String unitCode, final String binNumber,
			final Date issueDate, final Date stockDate,
			final Date deliveryDate, final String longDescription,
			final String oldVatCode, final String abcCategory,
			final String discount, final String nominalKey,
			final String purchaseKey, final String serialNumbers,
			final String analysisA, final String analysisB,
			final String analysisC, final String queueSequence,
			final String qtyDecimalPlaces, final String mrpBatching,
			final String workingLevel, final String makeOrBuy,
			final String purchaseUnit, final String sellingUnit,
			final String bulkItem, final String drawingNumber,
			final String catalogueNumber, final String unitLength,
			final String unitWidth, final String unitHeight,
			final String supplier, final String batchTraceability,
			final String lastSupplier, final String stdCostFreeze,
			final String reorderFreeze, final BigDecimal physicalQty,
			final BigDecimal allocatedQty, final BigDecimal backOrderQty,
			final BigDecimal forwardOrderQty, final BigDecimal onOrderQty,
			final BigDecimal price, final BigDecimal weight,
			final BigDecimal standardCost, final BigDecimal currentCost,
			final BigDecimal expectedCost, final BigDecimal economicReorderQ,
			final BigDecimal leadTime, final BigDecimal minStockLevel,
			final BigDecimal averageSalesValu, final BigDecimal monthToDate01,
			final BigDecimal monthToDate02, final BigDecimal monthToDate03,
			final BigDecimal monthToDate04, final BigDecimal monthToDate05,
			final BigDecimal monthToDate06, final BigDecimal monthToDate07,
			final BigDecimal monthToDate08, final BigDecimal monthToDate09,
			final BigDecimal monthToDate10, final BigDecimal yearToDate01,
			final BigDecimal yearToDate02, final BigDecimal yearToDate03,
			final BigDecimal yearToDate04, final BigDecimal yearToDate05,
			final BigDecimal yearToDate06, final BigDecimal yearToDate07,
			final BigDecimal yearToDate08, final BigDecimal yearToDate09,
			final BigDecimal yearToDate10, final BigDecimal previousSaleVal1,
			final BigDecimal previousSaleVal2,
			final BigDecimal previousSaleVal3,
			final BigDecimal periodIssueQty01,
			final BigDecimal periodIssueQty02,
			final BigDecimal periodIssueQty03,
			final BigDecimal periodIssueQty04,
			final BigDecimal periodIssueQty05,
			final BigDecimal periodIssueQty06,
			final BigDecimal periodIssueQty07,
			final BigDecimal periodIssueQty08,
			final BigDecimal periodIssueQty09,
			final BigDecimal periodIssueQty10,
			final BigDecimal periodIssueQty11,
			final BigDecimal periodIssueQty12,
			final BigDecimal periodIssueQty13,
			final BigDecimal periodIssueVal01,
			final BigDecimal periodIssueVal02,
			final BigDecimal periodIssueVal03,
			final BigDecimal periodIssueVal04,
			final BigDecimal periodIssueVal05,
			final BigDecimal periodIssueVal06,
			final BigDecimal periodIssueVal07,
			final BigDecimal periodIssueVal08,
			final BigDecimal periodIssueVal09,
			final BigDecimal periodIssueVal10,
			final BigDecimal periodIssueVal11,
			final BigDecimal periodIssueVal12,
			final BigDecimal periodIssueVal13, final BigDecimal standardLabour,
			final BigDecimal standardOverhead,
			final BigDecimal standardMaterial,
			final BigDecimal standardSubcontra,
			final BigDecimal mrpReorderRoundi, final BigDecimal purchaseFactor,
			final BigDecimal sellingFactor, final BigDecimal safetyStockLevel,
			final BigDecimal materialOnCost, final BigDecimal labourOnCost,
			final BigDecimal overheadOnCost, final BigDecimal maximumStockLeve,
			final BigDecimal shelfLife, final BigDecimal stockLength,
			final BigDecimal stockWidth, final BigDecimal stockHeight,
			final BigDecimal currentMaterial, final BigDecimal currentLabour,
			final BigDecimal currentOverhead,
			final BigDecimal currentSubcontrac,
			final BigDecimal uninspectedQty, final BigDecimal periodDemand01,
			final BigDecimal periodDemand02, final BigDecimal periodDemand03,
			final BigDecimal periodDemand04, final BigDecimal periodDemand05,
			final BigDecimal periodDemand06, final BigDecimal periodDemand07,
			final BigDecimal periodDemand08, final BigDecimal periodDemand09,
			final BigDecimal periodDemand10, final BigDecimal periodDemand11,
			final BigDecimal periodDemand12, final BigDecimal periodDemand13,
			final BigDecimal safetyDays, final BigDecimal reviewDays,
			final BigDecimal reorderDays, final BigDecimal prYield,
			final BigDecimal setupCost, final BigDecimal dspare01,
			final BigDecimal dspare02, final BigDecimal dspare03,
			final BigDecimal dspare04, final BigDecimal dspare05,
			final BigDecimal dspare06, final BigDecimal dspare07,
			final BigDecimal dspare08, final BigDecimal dspare09,
			final BigDecimal dspare10, final BigDecimal inspectionYield,
			final BigDecimal holdingCost, final Integer inspectCycle,
			final Integer batchReceipts, final Integer lowestWhereUsed,
			final Date lastRevalue, final Integer lastWhereUsedRu,
			final BigDecimal subOncost, final Integer spareInteger,
			final BigDecimal stockTakeToleran, final BigDecimal weightLow,
			final String mpsType, final String spare,
			final BigDecimal wholesalePrice,
			final BigDecimal worderAllocations, final String spare2,
			final String analysisXRef, final String vatInclusive,
			final String stockVatType, final String buyerId,
			final String levelOfDetail, final String pricingDiscount,
			final String despatchUnits, final String despatchUnitUse,
			final String stockType, final String packaging,
			final String shippingCategory) {

		this.warehouse = warehouse;
		this.product = product;
		this.alpha = alpha;
		this.description = description;
		this.supersession = supersession;
		this.supsessionDate = supsessionDate;
		this.alternatives01 = alternatives01;
		this.alternatives02 = alternatives02;
		this.alternatives03 = alternatives03;
		this.alternatives04 = alternatives04;
		this.alternatives05 = alternatives05;
		this.alternatives06 = alternatives06;
		this.alternatives07 = alternatives07;
		this.alternatives08 = alternatives08;
		this.alternatives09 = alternatives09;
		this.alternatives10 = alternatives10;
		this.unitCode = unitCode;
		this.binNumber = binNumber;
		this.issueDate = issueDate;
		this.stockDate = stockDate;
		this.deliveryDate = deliveryDate;
		this.longDescription = longDescription;
		this.oldVatCode = oldVatCode;
		this.abcCategory = abcCategory;
		this.discount = discount;
		this.nominalKey = nominalKey;
		this.purchaseKey = purchaseKey;
		this.serialNumbers = serialNumbers;
		this.analysisA = analysisA;
		this.analysisB = analysisB;
		this.analysisC = analysisC;
		this.queueSequence = queueSequence;
		this.qtyDecimalPlaces = qtyDecimalPlaces;
		this.mrpBatching = mrpBatching;
		this.workingLevel = workingLevel;
		this.makeOrBuy = makeOrBuy;
		this.purchaseUnit = purchaseUnit;
		this.sellingUnit = sellingUnit;
		this.bulkItem = bulkItem;
		this.drawingNumber = drawingNumber;
		this.catalogueNumber = catalogueNumber;
		this.unitLength = unitLength;
		this.unitWidth = unitWidth;
		this.unitHeight = unitHeight;
		this.supplier = supplier;
		this.batchTraceability = batchTraceability;
		this.lastSupplier = lastSupplier;
		this.stdCostFreeze = stdCostFreeze;
		this.reorderFreeze = reorderFreeze;
		this.physicalQty = physicalQty;
		this.allocatedQty = allocatedQty;
		this.backOrderQty = backOrderQty;
		this.forwardOrderQty = forwardOrderQty;
		this.onOrderQty = onOrderQty;
		this.price = price;
		this.weight = weight;
		this.standardCost = standardCost;
		this.currentCost = currentCost;
		this.expectedCost = expectedCost;
		this.economicReorderQ = economicReorderQ;
		this.leadTime = leadTime;
		this.minStockLevel = minStockLevel;
		this.averageSalesValu = averageSalesValu;
		this.monthToDate01 = monthToDate01;
		this.monthToDate02 = monthToDate02;
		this.monthToDate03 = monthToDate03;
		this.monthToDate04 = monthToDate04;
		this.monthToDate05 = monthToDate05;
		this.monthToDate06 = monthToDate06;
		this.monthToDate07 = monthToDate07;
		this.monthToDate08 = monthToDate08;
		this.monthToDate09 = monthToDate09;
		this.monthToDate10 = monthToDate10;
		this.yearToDate01 = yearToDate01;
		this.yearToDate02 = yearToDate02;
		this.yearToDate03 = yearToDate03;
		this.yearToDate04 = yearToDate04;
		this.yearToDate05 = yearToDate05;
		this.yearToDate06 = yearToDate06;
		this.yearToDate07 = yearToDate07;
		this.yearToDate08 = yearToDate08;
		this.yearToDate09 = yearToDate09;
		this.yearToDate10 = yearToDate10;
		this.previousSaleVal1 = previousSaleVal1;
		this.previousSaleVal2 = previousSaleVal2;
		this.previousSaleVal3 = previousSaleVal3;
		this.periodIssueQty01 = periodIssueQty01;
		this.periodIssueQty02 = periodIssueQty02;
		this.periodIssueQty03 = periodIssueQty03;
		this.periodIssueQty04 = periodIssueQty04;
		this.periodIssueQty05 = periodIssueQty05;
		this.periodIssueQty06 = periodIssueQty06;
		this.periodIssueQty07 = periodIssueQty07;
		this.periodIssueQty08 = periodIssueQty08;
		this.periodIssueQty09 = periodIssueQty09;
		this.periodIssueQty10 = periodIssueQty10;
		this.periodIssueQty11 = periodIssueQty11;
		this.periodIssueQty12 = periodIssueQty12;
		this.periodIssueQty13 = periodIssueQty13;
		this.periodIssueVal01 = periodIssueVal01;
		this.periodIssueVal02 = periodIssueVal02;
		this.periodIssueVal03 = periodIssueVal03;
		this.periodIssueVal04 = periodIssueVal04;
		this.periodIssueVal05 = periodIssueVal05;
		this.periodIssueVal06 = periodIssueVal06;
		this.periodIssueVal07 = periodIssueVal07;
		this.periodIssueVal08 = periodIssueVal08;
		this.periodIssueVal09 = periodIssueVal09;
		this.periodIssueVal10 = periodIssueVal10;
		this.periodIssueVal11 = periodIssueVal11;
		this.periodIssueVal12 = periodIssueVal12;
		this.periodIssueVal13 = periodIssueVal13;
		this.standardLabour = standardLabour;
		this.standardOverhead = standardOverhead;
		this.standardMaterial = standardMaterial;
		this.standardSubcontra = standardSubcontra;
		this.mrpReorderRoundi = mrpReorderRoundi;
		this.purchaseFactor = purchaseFactor;
		this.sellingFactor = sellingFactor;
		this.safetyStockLevel = safetyStockLevel;
		this.materialOnCost = materialOnCost;
		this.labourOnCost = labourOnCost;
		this.overheadOnCost = overheadOnCost;
		this.maximumStockLeve = maximumStockLeve;
		this.shelfLife = shelfLife;
		this.stockLength = stockLength;
		this.stockWidth = stockWidth;
		this.stockHeight = stockHeight;
		this.currentMaterial = currentMaterial;
		this.currentLabour = currentLabour;
		this.currentOverhead = currentOverhead;
		this.currentSubcontrac = currentSubcontrac;
		this.uninspectedQty = uninspectedQty;
		this.periodDemand01 = periodDemand01;
		this.periodDemand02 = periodDemand02;
		this.periodDemand03 = periodDemand03;
		this.periodDemand04 = periodDemand04;
		this.periodDemand05 = periodDemand05;
		this.periodDemand06 = periodDemand06;
		this.periodDemand07 = periodDemand07;
		this.periodDemand08 = periodDemand08;
		this.periodDemand09 = periodDemand09;
		this.periodDemand10 = periodDemand10;
		this.periodDemand11 = periodDemand11;
		this.periodDemand12 = periodDemand12;
		this.periodDemand13 = periodDemand13;
		this.safetyDays = safetyDays;
		this.reviewDays = reviewDays;
		this.reorderDays = reorderDays;
		this.prYield = prYield;
		this.setupCost = setupCost;
		this.dspare01 = dspare01;
		this.dspare02 = dspare02;
		this.dspare03 = dspare03;
		this.dspare04 = dspare04;
		this.dspare05 = dspare05;
		this.dspare06 = dspare06;
		this.dspare07 = dspare07;
		this.dspare08 = dspare08;
		this.dspare09 = dspare09;
		this.dspare10 = dspare10;
		this.inspectionYield = inspectionYield;
		this.holdingCost = holdingCost;
		this.inspectCycle = inspectCycle;
		this.batchReceipts = batchReceipts;
		this.lowestWhereUsed = lowestWhereUsed;
		this.lastRevalue = lastRevalue;
		this.lastWhereUsedRu = lastWhereUsedRu;
		this.subOncost = subOncost;
		this.spareInteger = spareInteger;
		this.stockTakeToleran = stockTakeToleran;
		this.weightLow = weightLow;
		this.mpsType = mpsType;
		this.spare = spare;
		this.wholesalePrice = wholesalePrice;
		this.worderAllocations = worderAllocations;
		this.spare2 = spare2;
		this.analysisXRef = analysisXRef;
		this.vatInclusive = vatInclusive;
		this.stockVatType = stockVatType;
		this.buyerId = buyerId;
		this.levelOfDetail = levelOfDetail;
		this.pricingDiscount = pricingDiscount;
		this.despatchUnits = despatchUnits;
		this.despatchUnitUse = despatchUnitUse;
		this.stockType = stockType;
		this.packaging = packaging;
		this.shippingCategory = shippingCategory;
	};

	private static final int[] fieldSizes = new int[] { warehouseSize,
			productSize, alphaSize, descriptionSize, supersessionSize, 0,
			alternatives01Size, alternatives02Size, alternatives03Size,
			alternatives04Size, alternatives05Size, alternatives06Size,
			alternatives07Size, alternatives08Size, alternatives09Size,
			alternatives10Size, unitCodeSize, binNumberSize, 0, 0, 0,
			longDescriptionSize, oldVatCodeSize, abcCategorySize, discountSize,
			nominalKeySize, purchaseKeySize, serialNumbersSize, analysisASize,
			analysisBSize, analysisCSize, queueSequenceSize,
			qtyDecimalPlacesSize, mrpBatchingSize, workingLevelSize,
			makeOrBuySize, purchaseUnitSize, sellingUnitSize, bulkItemSize,
			drawingNumberSize, catalogueNumberSize, unitLengthSize,
			unitWidthSize, unitHeightSize, supplierSize, batchTraceabilitySize,
			lastSupplierSize, stdCostFreezeSize, reorderFreezeSize, 0, 0, 0, 0,
			0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
			0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
			0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
			0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
			0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
			0, 0, 0, 0, 0, 0, 0, 0, 0, mpsTypeSize, spareSize, 0, 0,
			spare2Size, analysisXRefSize, vatInclusiveSize, stockVatTypeSize,
			buyerIdSize, levelOfDetailSize, pricingDiscountSize,
			despatchUnitsSize, despatchUnitUseSize, stockTypeSize,
			packagingSize, shippingCategorySize };

	private static final int[] fieldTypes = new int[] { FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_DATE, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_DATE,
			FIELD_TYPE_DATE, FIELD_TYPE_DATE, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_BIGDECIMAL, FIELD_TYPE_BIGDECIMAL,
			FIELD_TYPE_BIGDECIMAL, FIELD_TYPE_BIGDECIMAL,
			FIELD_TYPE_BIGDECIMAL, FIELD_TYPE_BIGDECIMAL,
			FIELD_TYPE_BIGDECIMAL, FIELD_TYPE_BIGDECIMAL,
			FIELD_TYPE_BIGDECIMAL, FIELD_TYPE_BIGDECIMAL,
			FIELD_TYPE_BIGDECIMAL, FIELD_TYPE_BIGDECIMAL,
			FIELD_TYPE_BIGDECIMAL, FIELD_TYPE_BIGDECIMAL,
			FIELD_TYPE_BIGDECIMAL, FIELD_TYPE_BIGDECIMAL,
			FIELD_TYPE_BIGDECIMAL, FIELD_TYPE_BIGDECIMAL,
			FIELD_TYPE_BIGDECIMAL, FIELD_TYPE_BIGDECIMAL,
			FIELD_TYPE_BIGDECIMAL, FIELD_TYPE_BIGDECIMAL,
			FIELD_TYPE_BIGDECIMAL, FIELD_TYPE_BIGDECIMAL,
			FIELD_TYPE_BIGDECIMAL, FIELD_TYPE_BIGDECIMAL,
			FIELD_TYPE_BIGDECIMAL, FIELD_TYPE_BIGDECIMAL,
			FIELD_TYPE_BIGDECIMAL, FIELD_TYPE_BIGDECIMAL,
			FIELD_TYPE_BIGDECIMAL, FIELD_TYPE_BIGDECIMAL,
			FIELD_TYPE_BIGDECIMAL, FIELD_TYPE_BIGDECIMAL,
			FIELD_TYPE_BIGDECIMAL, FIELD_TYPE_BIGDECIMAL,
			FIELD_TYPE_BIGDECIMAL, FIELD_TYPE_BIGDECIMAL,
			FIELD_TYPE_BIGDECIMAL, FIELD_TYPE_BIGDECIMAL,
			FIELD_TYPE_BIGDECIMAL, FIELD_TYPE_BIGDECIMAL,
			FIELD_TYPE_BIGDECIMAL, FIELD_TYPE_BIGDECIMAL,
			FIELD_TYPE_BIGDECIMAL, FIELD_TYPE_BIGDECIMAL,
			FIELD_TYPE_BIGDECIMAL, FIELD_TYPE_BIGDECIMAL,
			FIELD_TYPE_BIGDECIMAL, FIELD_TYPE_BIGDECIMAL,
			FIELD_TYPE_BIGDECIMAL, FIELD_TYPE_BIGDECIMAL,
			FIELD_TYPE_BIGDECIMAL, FIELD_TYPE_BIGDECIMAL,
			FIELD_TYPE_BIGDECIMAL, FIELD_TYPE_BIGDECIMAL,
			FIELD_TYPE_BIGDECIMAL, FIELD_TYPE_BIGDECIMAL,
			FIELD_TYPE_BIGDECIMAL, FIELD_TYPE_BIGDECIMAL,
			FIELD_TYPE_BIGDECIMAL, FIELD_TYPE_BIGDECIMAL,
			FIELD_TYPE_BIGDECIMAL, FIELD_TYPE_BIGDECIMAL,
			FIELD_TYPE_BIGDECIMAL, FIELD_TYPE_BIGDECIMAL,
			FIELD_TYPE_BIGDECIMAL, FIELD_TYPE_BIGDECIMAL,
			FIELD_TYPE_BIGDECIMAL, FIELD_TYPE_BIGDECIMAL,
			FIELD_TYPE_BIGDECIMAL, FIELD_TYPE_BIGDECIMAL,
			FIELD_TYPE_BIGDECIMAL, FIELD_TYPE_BIGDECIMAL,
			FIELD_TYPE_BIGDECIMAL, FIELD_TYPE_BIGDECIMAL,
			FIELD_TYPE_BIGDECIMAL, FIELD_TYPE_BIGDECIMAL,
			FIELD_TYPE_BIGDECIMAL, FIELD_TYPE_BIGDECIMAL,
			FIELD_TYPE_BIGDECIMAL, FIELD_TYPE_BIGDECIMAL,
			FIELD_TYPE_BIGDECIMAL, FIELD_TYPE_BIGDECIMAL,
			FIELD_TYPE_BIGDECIMAL, FIELD_TYPE_BIGDECIMAL,
			FIELD_TYPE_BIGDECIMAL, FIELD_TYPE_BIGDECIMAL,
			FIELD_TYPE_BIGDECIMAL, FIELD_TYPE_BIGDECIMAL,
			FIELD_TYPE_BIGDECIMAL, FIELD_TYPE_BIGDECIMAL,
			FIELD_TYPE_BIGDECIMAL, FIELD_TYPE_BIGDECIMAL,
			FIELD_TYPE_BIGDECIMAL, FIELD_TYPE_BIGDECIMAL,
			FIELD_TYPE_BIGDECIMAL, FIELD_TYPE_BIGDECIMAL,
			FIELD_TYPE_BIGDECIMAL, FIELD_TYPE_BIGDECIMAL,
			FIELD_TYPE_BIGDECIMAL, FIELD_TYPE_BIGDECIMAL,
			FIELD_TYPE_BIGDECIMAL, FIELD_TYPE_BIGDECIMAL,
			FIELD_TYPE_BIGDECIMAL, FIELD_TYPE_BIGDECIMAL,
			FIELD_TYPE_BIGDECIMAL, FIELD_TYPE_BIGDECIMAL,
			FIELD_TYPE_BIGDECIMAL, FIELD_TYPE_BIGDECIMAL,
			FIELD_TYPE_BIGDECIMAL, FIELD_TYPE_BIGDECIMAL,
			FIELD_TYPE_BIGDECIMAL, FIELD_TYPE_BIGDECIMAL, FIELD_TYPE_INTEGER,
			FIELD_TYPE_INTEGER, FIELD_TYPE_INTEGER, FIELD_TYPE_DATE,
			FIELD_TYPE_INTEGER, FIELD_TYPE_BIGDECIMAL, FIELD_TYPE_INTEGER,
			FIELD_TYPE_BIGDECIMAL, FIELD_TYPE_BIGDECIMAL, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_BIGDECIMAL, FIELD_TYPE_BIGDECIMAL,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING,
			FIELD_TYPE_STRING, FIELD_TYPE_STRING, FIELD_TYPE_STRING };

	protected void generatedKey(Integer key) {
	}

	protected Object[] get() {
		return new Object[] {
				((this.warehouse == null) ? null
						: (this.warehouse.length() <= warehouseSize) ? this.warehouse
								: this.warehouse.substring(0,
										this.warehouseSize)),
				((this.product == null) ? null
						: (this.product.length() <= productSize) ? this.product
								: this.product.substring(0, this.productSize)),
				((this.alpha == null) ? null
						: (this.alpha.length() <= alphaSize) ? this.alpha
								: this.alpha.substring(0, this.alphaSize)),
				((this.description == null) ? null
						: (this.description.length() <= descriptionSize) ? this.description
								: this.description.substring(0,
										this.descriptionSize)),
				((this.supersession == null) ? null : (this.supersession
						.length() <= supersessionSize) ? this.supersession
						: this.supersession.substring(0, this.supersessionSize)),
				this.supsessionDate,
				((this.alternatives01 == null) ? null : (this.alternatives01
						.length() <= alternatives01Size) ? this.alternatives01
						: this.alternatives01.substring(0,
								this.alternatives01Size)),
				((this.alternatives02 == null) ? null : (this.alternatives02
						.length() <= alternatives02Size) ? this.alternatives02
						: this.alternatives02.substring(0,
								this.alternatives02Size)),
				((this.alternatives03 == null) ? null : (this.alternatives03
						.length() <= alternatives03Size) ? this.alternatives03
						: this.alternatives03.substring(0,
								this.alternatives03Size)),
				((this.alternatives04 == null) ? null : (this.alternatives04
						.length() <= alternatives04Size) ? this.alternatives04
						: this.alternatives04.substring(0,
								this.alternatives04Size)),
				((this.alternatives05 == null) ? null : (this.alternatives05
						.length() <= alternatives05Size) ? this.alternatives05
						: this.alternatives05.substring(0,
								this.alternatives05Size)),
				((this.alternatives06 == null) ? null : (this.alternatives06
						.length() <= alternatives06Size) ? this.alternatives06
						: this.alternatives06.substring(0,
								this.alternatives06Size)),
				((this.alternatives07 == null) ? null : (this.alternatives07
						.length() <= alternatives07Size) ? this.alternatives07
						: this.alternatives07.substring(0,
								this.alternatives07Size)),
				((this.alternatives08 == null) ? null : (this.alternatives08
						.length() <= alternatives08Size) ? this.alternatives08
						: this.alternatives08.substring(0,
								this.alternatives08Size)),
				((this.alternatives09 == null) ? null : (this.alternatives09
						.length() <= alternatives09Size) ? this.alternatives09
						: this.alternatives09.substring(0,
								this.alternatives09Size)),
				((this.alternatives10 == null) ? null : (this.alternatives10
						.length() <= alternatives10Size) ? this.alternatives10
						: this.alternatives10.substring(0,
								this.alternatives10Size)),
				((this.unitCode == null) ? null
						: (this.unitCode.length() <= unitCodeSize) ? this.unitCode
								: this.unitCode.substring(0, this.unitCodeSize)),
				((this.binNumber == null) ? null
						: (this.binNumber.length() <= binNumberSize) ? this.binNumber
								: this.binNumber.substring(0,
										this.binNumberSize)),
				this.issueDate,
				this.stockDate,
				this.deliveryDate,
				((this.longDescription == null) ? null
						: (this.longDescription.length() <= longDescriptionSize) ? this.longDescription
								: this.longDescription.substring(0,
										this.longDescriptionSize)),
				((this.oldVatCode == null) ? null
						: (this.oldVatCode.length() <= oldVatCodeSize) ? this.oldVatCode
								: this.oldVatCode.substring(0,
										this.oldVatCodeSize)),
				((this.abcCategory == null) ? null
						: (this.abcCategory.length() <= abcCategorySize) ? this.abcCategory
								: this.abcCategory.substring(0,
										this.abcCategorySize)),
				((this.discount == null) ? null
						: (this.discount.length() <= discountSize) ? this.discount
								: this.discount.substring(0, this.discountSize)),
				((this.nominalKey == null) ? null
						: (this.nominalKey.length() <= nominalKeySize) ? this.nominalKey
								: this.nominalKey.substring(0,
										this.nominalKeySize)),
				((this.purchaseKey == null) ? null
						: (this.purchaseKey.length() <= purchaseKeySize) ? this.purchaseKey
								: this.purchaseKey.substring(0,
										this.purchaseKeySize)),
				((this.serialNumbers == null) ? null : (this.serialNumbers
						.length() <= serialNumbersSize) ? this.serialNumbers
						: this.serialNumbers.substring(0,
								this.serialNumbersSize)),
				((this.analysisA == null) ? null
						: (this.analysisA.length() <= analysisASize) ? this.analysisA
								: this.analysisA.substring(0,
										this.analysisASize)),
				((this.analysisB == null) ? null
						: (this.analysisB.length() <= analysisBSize) ? this.analysisB
								: this.analysisB.substring(0,
										this.analysisBSize)),
				((this.analysisC == null) ? null
						: (this.analysisC.length() <= analysisCSize) ? this.analysisC
								: this.analysisC.substring(0,
										this.analysisCSize)),
				((this.queueSequence == null) ? null : (this.queueSequence
						.length() <= queueSequenceSize) ? this.queueSequence
						: this.queueSequence.substring(0,
								this.queueSequenceSize)),
				((this.qtyDecimalPlaces == null) ? null
						: (this.qtyDecimalPlaces.length() <= qtyDecimalPlacesSize) ? this.qtyDecimalPlaces
								: this.qtyDecimalPlaces.substring(0,
										this.qtyDecimalPlacesSize)),
				((this.mrpBatching == null) ? null
						: (this.mrpBatching.length() <= mrpBatchingSize) ? this.mrpBatching
								: this.mrpBatching.substring(0,
										this.mrpBatchingSize)),
				((this.workingLevel == null) ? null : (this.workingLevel
						.length() <= workingLevelSize) ? this.workingLevel
						: this.workingLevel.substring(0, this.workingLevelSize)),
				((this.makeOrBuy == null) ? null
						: (this.makeOrBuy.length() <= makeOrBuySize) ? this.makeOrBuy
								: this.makeOrBuy.substring(0,
										this.makeOrBuySize)),
				((this.purchaseUnit == null) ? null : (this.purchaseUnit
						.length() <= purchaseUnitSize) ? this.purchaseUnit
						: this.purchaseUnit.substring(0, this.purchaseUnitSize)),
				((this.sellingUnit == null) ? null
						: (this.sellingUnit.length() <= sellingUnitSize) ? this.sellingUnit
								: this.sellingUnit.substring(0,
										this.sellingUnitSize)),
				((this.bulkItem == null) ? null
						: (this.bulkItem.length() <= bulkItemSize) ? this.bulkItem
								: this.bulkItem.substring(0, this.bulkItemSize)),
				((this.drawingNumber == null) ? null : (this.drawingNumber
						.length() <= drawingNumberSize) ? this.drawingNumber
						: this.drawingNumber.substring(0,
								this.drawingNumberSize)),
				((this.catalogueNumber == null) ? null
						: (this.catalogueNumber.length() <= catalogueNumberSize) ? this.catalogueNumber
								: this.catalogueNumber.substring(0,
										this.catalogueNumberSize)),
				((this.unitLength == null) ? null
						: (this.unitLength.length() <= unitLengthSize) ? this.unitLength
								: this.unitLength.substring(0,
										this.unitLengthSize)),
				((this.unitWidth == null) ? null
						: (this.unitWidth.length() <= unitWidthSize) ? this.unitWidth
								: this.unitWidth.substring(0,
										this.unitWidthSize)),
				((this.unitHeight == null) ? null
						: (this.unitHeight.length() <= unitHeightSize) ? this.unitHeight
								: this.unitHeight.substring(0,
										this.unitHeightSize)),
				((this.supplier == null) ? null
						: (this.supplier.length() <= supplierSize) ? this.supplier
								: this.supplier.substring(0, this.supplierSize)),
				((this.batchTraceability == null) ? null
						: (this.batchTraceability.length() <= batchTraceabilitySize) ? this.batchTraceability
								: this.batchTraceability.substring(0,
										this.batchTraceabilitySize)),
				((this.lastSupplier == null) ? null : (this.lastSupplier
						.length() <= lastSupplierSize) ? this.lastSupplier
						: this.lastSupplier.substring(0, this.lastSupplierSize)),
				((this.stdCostFreeze == null) ? null : (this.stdCostFreeze
						.length() <= stdCostFreezeSize) ? this.stdCostFreeze
						: this.stdCostFreeze.substring(0,
								this.stdCostFreezeSize)),
				((this.reorderFreeze == null) ? null : (this.reorderFreeze
						.length() <= reorderFreezeSize) ? this.reorderFreeze
						: this.reorderFreeze.substring(0,
								this.reorderFreezeSize)),
				this.physicalQty,
				this.allocatedQty,
				this.backOrderQty,
				this.forwardOrderQty,
				this.onOrderQty,
				this.price,
				this.weight,
				this.standardCost,
				this.currentCost,
				this.expectedCost,
				this.economicReorderQ,
				this.leadTime,
				this.minStockLevel,
				this.averageSalesValu,
				this.monthToDate01,
				this.monthToDate02,
				this.monthToDate03,
				this.monthToDate04,
				this.monthToDate05,
				this.monthToDate06,
				this.monthToDate07,
				this.monthToDate08,
				this.monthToDate09,
				this.monthToDate10,
				this.yearToDate01,
				this.yearToDate02,
				this.yearToDate03,
				this.yearToDate04,
				this.yearToDate05,
				this.yearToDate06,
				this.yearToDate07,
				this.yearToDate08,
				this.yearToDate09,
				this.yearToDate10,
				this.previousSaleVal1,
				this.previousSaleVal2,
				this.previousSaleVal3,
				this.periodIssueQty01,
				this.periodIssueQty02,
				this.periodIssueQty03,
				this.periodIssueQty04,
				this.periodIssueQty05,
				this.periodIssueQty06,
				this.periodIssueQty07,
				this.periodIssueQty08,
				this.periodIssueQty09,
				this.periodIssueQty10,
				this.periodIssueQty11,
				this.periodIssueQty12,
				this.periodIssueQty13,
				this.periodIssueVal01,
				this.periodIssueVal02,
				this.periodIssueVal03,
				this.periodIssueVal04,
				this.periodIssueVal05,
				this.periodIssueVal06,
				this.periodIssueVal07,
				this.periodIssueVal08,
				this.periodIssueVal09,
				this.periodIssueVal10,
				this.periodIssueVal11,
				this.periodIssueVal12,
				this.periodIssueVal13,
				this.standardLabour,
				this.standardOverhead,
				this.standardMaterial,
				this.standardSubcontra,
				this.mrpReorderRoundi,
				this.purchaseFactor,
				this.sellingFactor,
				this.safetyStockLevel,
				this.materialOnCost,
				this.labourOnCost,
				this.overheadOnCost,
				this.maximumStockLeve,
				this.shelfLife,
				this.stockLength,
				this.stockWidth,
				this.stockHeight,
				this.currentMaterial,
				this.currentLabour,
				this.currentOverhead,
				this.currentSubcontrac,
				this.uninspectedQty,
				this.periodDemand01,
				this.periodDemand02,
				this.periodDemand03,
				this.periodDemand04,
				this.periodDemand05,
				this.periodDemand06,
				this.periodDemand07,
				this.periodDemand08,
				this.periodDemand09,
				this.periodDemand10,
				this.periodDemand11,
				this.periodDemand12,
				this.periodDemand13,
				this.safetyDays,
				this.reviewDays,
				this.reorderDays,
				this.prYield,
				this.setupCost,
				this.dspare01,
				this.dspare02,
				this.dspare03,
				this.dspare04,
				this.dspare05,
				this.dspare06,
				this.dspare07,
				this.dspare08,
				this.dspare09,
				this.dspare10,
				this.inspectionYield,
				this.holdingCost,
				this.inspectCycle,
				this.batchReceipts,
				this.lowestWhereUsed,
				this.lastRevalue,
				this.lastWhereUsedRu,
				this.subOncost,
				this.spareInteger,
				this.stockTakeToleran,
				this.weightLow,
				((this.mpsType == null) ? null
						: (this.mpsType.length() <= mpsTypeSize) ? this.mpsType
								: this.mpsType.substring(0, this.mpsTypeSize)),
				((this.spare == null) ? null
						: (this.spare.length() <= spareSize) ? this.spare
								: this.spare.substring(0, this.spareSize)),
				this.wholesalePrice,
				this.worderAllocations,
				((this.spare2 == null) ? null
						: (this.spare2.length() <= spare2Size) ? this.spare2
								: this.spare2.substring(0, this.spare2Size)),
				((this.analysisXRef == null) ? null : (this.analysisXRef
						.length() <= analysisXRefSize) ? this.analysisXRef
						: this.analysisXRef.substring(0, this.analysisXRefSize)),
				((this.vatInclusive == null) ? null : (this.vatInclusive
						.length() <= vatInclusiveSize) ? this.vatInclusive
						: this.vatInclusive.substring(0, this.vatInclusiveSize)),
				((this.stockVatType == null) ? null : (this.stockVatType
						.length() <= stockVatTypeSize) ? this.stockVatType
						: this.stockVatType.substring(0, this.stockVatTypeSize)),
				((this.buyerId == null) ? null
						: (this.buyerId.length() <= buyerIdSize) ? this.buyerId
								: this.buyerId.substring(0, this.buyerIdSize)),
				((this.levelOfDetail == null) ? null : (this.levelOfDetail
						.length() <= levelOfDetailSize) ? this.levelOfDetail
						: this.levelOfDetail.substring(0,
								this.levelOfDetailSize)),
				((this.pricingDiscount == null) ? null
						: (this.pricingDiscount.length() <= pricingDiscountSize) ? this.pricingDiscount
								: this.pricingDiscount.substring(0,
										this.pricingDiscountSize)),
				((this.despatchUnits == null) ? null : (this.despatchUnits
						.length() <= despatchUnitsSize) ? this.despatchUnits
						: this.despatchUnits.substring(0,
								this.despatchUnitsSize)),
				((this.despatchUnitUse == null) ? null
						: (this.despatchUnitUse.length() <= despatchUnitUseSize) ? this.despatchUnitUse
								: this.despatchUnitUse.substring(0,
										this.despatchUnitUseSize)),
				((this.stockType == null) ? null
						: (this.stockType.length() <= stockTypeSize) ? this.stockType
								: this.stockType.substring(0,
										this.stockTypeSize)),
				((this.packaging == null) ? null
						: (this.packaging.length() <= packagingSize) ? this.packaging
								: this.packaging.substring(0,
										this.packagingSize)),
				((this.shippingCategory == null) ? null
						: (this.shippingCategory.length() <= shippingCategorySize) ? this.shippingCategory
								: this.shippingCategory.substring(0,
										this.shippingCategorySize)) };
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
		return new DAOArgs(2).arg(this.warehouse).arg(this.product);
	}

	protected void set(Object[] fields) {
		this.warehouse = rtrim((String) fields[0]);
		this.product = rtrim((String) fields[1]);
		this.alpha = rtrim((String) fields[2]);
		this.description = rtrim((String) fields[3]);
		this.supersession = rtrim((String) fields[4]);
		this.supsessionDate = ((fields[5] == null) ? null : new Date(
				fields[5]));
		this.alternatives01 = rtrim((String) fields[6]);
		this.alternatives02 = rtrim((String) fields[7]);
		this.alternatives03 = rtrim((String) fields[8]);
		this.alternatives04 = rtrim((String) fields[9]);
		this.alternatives05 = rtrim((String) fields[10]);
		this.alternatives06 = rtrim((String) fields[11]);
		this.alternatives07 = rtrim((String) fields[12]);
		this.alternatives08 = rtrim((String) fields[13]);
		this.alternatives09 = rtrim((String) fields[14]);
		this.alternatives10 = rtrim((String) fields[15]);
		this.unitCode = rtrim((String) fields[16]);
		this.binNumber = rtrim((String) fields[17]);
		this.issueDate = ((fields[18] == null) ? null : new Date(
				fields[18]));
		this.stockDate = ((fields[19] == null) ? null : new Date(
				fields[19]));
		this.deliveryDate = ((fields[20] == null) ? null : new Date(
				fields[20]));
		this.longDescription = rtrim((String) fields[21]);
		this.oldVatCode = rtrim((String) fields[22]);
		this.abcCategory = rtrim((String) fields[23]);
		this.discount = rtrim((String) fields[24]);
		this.nominalKey = rtrim((String) fields[25]);
		this.purchaseKey = rtrim((String) fields[26]);
		this.serialNumbers = rtrim((String) fields[27]);
		this.analysisA = rtrim((String) fields[28]);
		this.analysisB = rtrim((String) fields[29]);
		this.analysisC = rtrim((String) fields[30]);
		this.queueSequence = rtrim((String) fields[31]);
		this.qtyDecimalPlaces = rtrim((String) fields[32]);
		this.mrpBatching = rtrim((String) fields[33]);
		this.workingLevel = rtrim((String) fields[34]);
		this.makeOrBuy = rtrim((String) fields[35]);
		this.purchaseUnit = rtrim((String) fields[36]);
		this.sellingUnit = rtrim((String) fields[37]);
		this.bulkItem = rtrim((String) fields[38]);
		this.drawingNumber = rtrim((String) fields[39]);
		this.catalogueNumber = rtrim((String) fields[40]);
		this.unitLength = rtrim((String) fields[41]);
		this.unitWidth = rtrim((String) fields[42]);
		this.unitHeight = rtrim((String) fields[43]);
		this.supplier = rtrim((String) fields[44]);
		this.batchTraceability = rtrim((String) fields[45]);
		this.lastSupplier = rtrim((String) fields[46]);
		this.stdCostFreeze = rtrim((String) fields[47]);
		this.reorderFreeze = rtrim((String) fields[48]);
		this.physicalQty = ((BigDecimal) fields[49]);
		this.allocatedQty = ((BigDecimal) fields[50]);
		this.backOrderQty = ((BigDecimal) fields[51]);
		this.forwardOrderQty = ((BigDecimal) fields[52]);
		this.onOrderQty = ((BigDecimal) fields[53]);
		this.price = ((BigDecimal) fields[54]);
		this.weight = ((BigDecimal) fields[55]);
		this.standardCost = ((BigDecimal) fields[56]);
		this.currentCost = ((BigDecimal) fields[57]);
		this.expectedCost = ((BigDecimal) fields[58]);
		this.economicReorderQ = ((BigDecimal) fields[59]);
		this.leadTime = ((BigDecimal) fields[60]);
		this.minStockLevel = ((BigDecimal) fields[61]);
		this.averageSalesValu = ((BigDecimal) fields[62]);
		this.monthToDate01 = ((BigDecimal) fields[63]);
		this.monthToDate02 = ((BigDecimal) fields[64]);
		this.monthToDate03 = ((BigDecimal) fields[65]);
		this.monthToDate04 = ((BigDecimal) fields[66]);
		this.monthToDate05 = ((BigDecimal) fields[67]);
		this.monthToDate06 = ((BigDecimal) fields[68]);
		this.monthToDate07 = ((BigDecimal) fields[69]);
		this.monthToDate08 = ((BigDecimal) fields[70]);
		this.monthToDate09 = ((BigDecimal) fields[71]);
		this.monthToDate10 = ((BigDecimal) fields[72]);
		this.yearToDate01 = ((BigDecimal) fields[73]);
		this.yearToDate02 = ((BigDecimal) fields[74]);
		this.yearToDate03 = ((BigDecimal) fields[75]);
		this.yearToDate04 = ((BigDecimal) fields[76]);
		this.yearToDate05 = ((BigDecimal) fields[77]);
		this.yearToDate06 = ((BigDecimal) fields[78]);
		this.yearToDate07 = ((BigDecimal) fields[79]);
		this.yearToDate08 = ((BigDecimal) fields[80]);
		this.yearToDate09 = ((BigDecimal) fields[81]);
		this.yearToDate10 = ((BigDecimal) fields[82]);
		this.previousSaleVal1 = ((BigDecimal) fields[83]);
		this.previousSaleVal2 = ((BigDecimal) fields[84]);
		this.previousSaleVal3 = ((BigDecimal) fields[85]);
		this.periodIssueQty01 = ((BigDecimal) fields[86]);
		this.periodIssueQty02 = ((BigDecimal) fields[87]);
		this.periodIssueQty03 = ((BigDecimal) fields[88]);
		this.periodIssueQty04 = ((BigDecimal) fields[89]);
		this.periodIssueQty05 = ((BigDecimal) fields[90]);
		this.periodIssueQty06 = ((BigDecimal) fields[91]);
		this.periodIssueQty07 = ((BigDecimal) fields[92]);
		this.periodIssueQty08 = ((BigDecimal) fields[93]);
		this.periodIssueQty09 = ((BigDecimal) fields[94]);
		this.periodIssueQty10 = ((BigDecimal) fields[95]);
		this.periodIssueQty11 = ((BigDecimal) fields[96]);
		this.periodIssueQty12 = ((BigDecimal) fields[97]);
		this.periodIssueQty13 = ((BigDecimal) fields[98]);
		this.periodIssueVal01 = ((BigDecimal) fields[99]);
		this.periodIssueVal02 = ((BigDecimal) fields[100]);
		this.periodIssueVal03 = ((BigDecimal) fields[101]);
		this.periodIssueVal04 = ((BigDecimal) fields[102]);
		this.periodIssueVal05 = ((BigDecimal) fields[103]);
		this.periodIssueVal06 = ((BigDecimal) fields[104]);
		this.periodIssueVal07 = ((BigDecimal) fields[105]);
		this.periodIssueVal08 = ((BigDecimal) fields[106]);
		this.periodIssueVal09 = ((BigDecimal) fields[107]);
		this.periodIssueVal10 = ((BigDecimal) fields[108]);
		this.periodIssueVal11 = ((BigDecimal) fields[109]);
		this.periodIssueVal12 = ((BigDecimal) fields[110]);
		this.periodIssueVal13 = ((BigDecimal) fields[111]);
		this.standardLabour = ((BigDecimal) fields[112]);
		this.standardOverhead = ((BigDecimal) fields[113]);
		this.standardMaterial = ((BigDecimal) fields[114]);
		this.standardSubcontra = ((BigDecimal) fields[115]);
		this.mrpReorderRoundi = ((BigDecimal) fields[116]);
		this.purchaseFactor = ((BigDecimal) fields[117]);
		this.sellingFactor = ((BigDecimal) fields[118]);
		this.safetyStockLevel = ((BigDecimal) fields[119]);
		this.materialOnCost = ((BigDecimal) fields[120]);
		this.labourOnCost = ((BigDecimal) fields[121]);
		this.overheadOnCost = ((BigDecimal) fields[122]);
		this.maximumStockLeve = ((BigDecimal) fields[123]);
		this.shelfLife = ((BigDecimal) fields[124]);
		this.stockLength = ((BigDecimal) fields[125]);
		this.stockWidth = ((BigDecimal) fields[126]);
		this.stockHeight = ((BigDecimal) fields[127]);
		this.currentMaterial = ((BigDecimal) fields[128]);
		this.currentLabour = ((BigDecimal) fields[129]);
		this.currentOverhead = ((BigDecimal) fields[130]);
		this.currentSubcontrac = ((BigDecimal) fields[131]);
		this.uninspectedQty = ((BigDecimal) fields[132]);
		this.periodDemand01 = ((BigDecimal) fields[133]);
		this.periodDemand02 = ((BigDecimal) fields[134]);
		this.periodDemand03 = ((BigDecimal) fields[135]);
		this.periodDemand04 = ((BigDecimal) fields[136]);
		this.periodDemand05 = ((BigDecimal) fields[137]);
		this.periodDemand06 = ((BigDecimal) fields[138]);
		this.periodDemand07 = ((BigDecimal) fields[139]);
		this.periodDemand08 = ((BigDecimal) fields[140]);
		this.periodDemand09 = ((BigDecimal) fields[141]);
		this.periodDemand10 = ((BigDecimal) fields[142]);
		this.periodDemand11 = ((BigDecimal) fields[143]);
		this.periodDemand12 = ((BigDecimal) fields[144]);
		this.periodDemand13 = ((BigDecimal) fields[145]);
		this.safetyDays = ((BigDecimal) fields[146]);
		this.reviewDays = ((BigDecimal) fields[147]);
		this.reorderDays = ((BigDecimal) fields[148]);
		this.prYield = ((BigDecimal) fields[149]);
		this.setupCost = ((BigDecimal) fields[150]);
		this.dspare01 = ((BigDecimal) fields[151]);
		this.dspare02 = ((BigDecimal) fields[152]);
		this.dspare03 = ((BigDecimal) fields[153]);
		this.dspare04 = ((BigDecimal) fields[154]);
		this.dspare05 = ((BigDecimal) fields[155]);
		this.dspare06 = ((BigDecimal) fields[156]);
		this.dspare07 = ((BigDecimal) fields[157]);
		this.dspare08 = ((BigDecimal) fields[158]);
		this.dspare09 = ((BigDecimal) fields[159]);
		this.dspare10 = ((BigDecimal) fields[160]);
		this.inspectionYield = ((BigDecimal) fields[161]);
		this.holdingCost = ((BigDecimal) fields[162]);
		this.inspectCycle = ((Integer) fields[163]);
		this.batchReceipts = ((Integer) fields[164]);
		this.lowestWhereUsed = ((Integer) fields[165]);
		this.lastRevalue = ((fields[166] == null) ? null : new Date(
				fields[166]));
		this.lastWhereUsedRu = ((Integer) fields[167]);
		this.subOncost = ((BigDecimal) fields[168]);
		this.spareInteger = ((Integer) fields[169]);
		this.stockTakeToleran = ((BigDecimal) fields[170]);
		this.weightLow = ((BigDecimal) fields[171]);
		this.mpsType = rtrim((String) fields[172]);
		this.spare = rtrim((String) fields[173]);
		this.wholesalePrice = ((BigDecimal) fields[174]);
		this.worderAllocations = ((BigDecimal) fields[175]);
		this.spare2 = rtrim((String) fields[176]);
		this.analysisXRef = rtrim((String) fields[177]);
		this.vatInclusive = rtrim((String) fields[178]);
		this.stockVatType = rtrim((String) fields[179]);
		this.buyerId = rtrim((String) fields[180]);
		this.levelOfDetail = rtrim((String) fields[181]);
		this.pricingDiscount = rtrim((String) fields[182]);
		this.despatchUnits = rtrim((String) fields[183]);
		this.despatchUnitUse = rtrim((String) fields[184]);
		this.stockType = rtrim((String) fields[185]);
		this.packaging = rtrim((String) fields[186]);
		this.shippingCategory = rtrim((String) fields[187]);
	}

	public void set(final String warehouse, final String product,
			final String alpha, final String description,
			final String supersession, final Date supsessionDate,
			final String alternatives01, final String alternatives02,
			final String alternatives03, final String alternatives04,
			final String alternatives05, final String alternatives06,
			final String alternatives07, final String alternatives08,
			final String alternatives09, final String alternatives10,
			final String unitCode, final String binNumber,
			final Date issueDate, final Date stockDate,
			final Date deliveryDate, final String longDescription,
			final String oldVatCode, final String abcCategory,
			final String discount, final String nominalKey,
			final String purchaseKey, final String serialNumbers,
			final String analysisA, final String analysisB,
			final String analysisC, final String queueSequence,
			final String qtyDecimalPlaces, final String mrpBatching,
			final String workingLevel, final String makeOrBuy,
			final String purchaseUnit, final String sellingUnit,
			final String bulkItem, final String drawingNumber,
			final String catalogueNumber, final String unitLength,
			final String unitWidth, final String unitHeight,
			final String supplier, final String batchTraceability,
			final String lastSupplier, final String stdCostFreeze,
			final String reorderFreeze, final BigDecimal physicalQty,
			final BigDecimal allocatedQty, final BigDecimal backOrderQty,
			final BigDecimal forwardOrderQty, final BigDecimal onOrderQty,
			final BigDecimal price, final BigDecimal weight,
			final BigDecimal standardCost, final BigDecimal currentCost,
			final BigDecimal expectedCost, final BigDecimal economicReorderQ,
			final BigDecimal leadTime, final BigDecimal minStockLevel,
			final BigDecimal averageSalesValu, final BigDecimal monthToDate01,
			final BigDecimal monthToDate02, final BigDecimal monthToDate03,
			final BigDecimal monthToDate04, final BigDecimal monthToDate05,
			final BigDecimal monthToDate06, final BigDecimal monthToDate07,
			final BigDecimal monthToDate08, final BigDecimal monthToDate09,
			final BigDecimal monthToDate10, final BigDecimal yearToDate01,
			final BigDecimal yearToDate02, final BigDecimal yearToDate03,
			final BigDecimal yearToDate04, final BigDecimal yearToDate05,
			final BigDecimal yearToDate06, final BigDecimal yearToDate07,
			final BigDecimal yearToDate08, final BigDecimal yearToDate09,
			final BigDecimal yearToDate10, final BigDecimal previousSaleVal1,
			final BigDecimal previousSaleVal2,
			final BigDecimal previousSaleVal3,
			final BigDecimal periodIssueQty01,
			final BigDecimal periodIssueQty02,
			final BigDecimal periodIssueQty03,
			final BigDecimal periodIssueQty04,
			final BigDecimal periodIssueQty05,
			final BigDecimal periodIssueQty06,
			final BigDecimal periodIssueQty07,
			final BigDecimal periodIssueQty08,
			final BigDecimal periodIssueQty09,
			final BigDecimal periodIssueQty10,
			final BigDecimal periodIssueQty11,
			final BigDecimal periodIssueQty12,
			final BigDecimal periodIssueQty13,
			final BigDecimal periodIssueVal01,
			final BigDecimal periodIssueVal02,
			final BigDecimal periodIssueVal03,
			final BigDecimal periodIssueVal04,
			final BigDecimal periodIssueVal05,
			final BigDecimal periodIssueVal06,
			final BigDecimal periodIssueVal07,
			final BigDecimal periodIssueVal08,
			final BigDecimal periodIssueVal09,
			final BigDecimal periodIssueVal10,
			final BigDecimal periodIssueVal11,
			final BigDecimal periodIssueVal12,
			final BigDecimal periodIssueVal13, final BigDecimal standardLabour,
			final BigDecimal standardOverhead,
			final BigDecimal standardMaterial,
			final BigDecimal standardSubcontra,
			final BigDecimal mrpReorderRoundi, final BigDecimal purchaseFactor,
			final BigDecimal sellingFactor, final BigDecimal safetyStockLevel,
			final BigDecimal materialOnCost, final BigDecimal labourOnCost,
			final BigDecimal overheadOnCost, final BigDecimal maximumStockLeve,
			final BigDecimal shelfLife, final BigDecimal stockLength,
			final BigDecimal stockWidth, final BigDecimal stockHeight,
			final BigDecimal currentMaterial, final BigDecimal currentLabour,
			final BigDecimal currentOverhead,
			final BigDecimal currentSubcontrac,
			final BigDecimal uninspectedQty, final BigDecimal periodDemand01,
			final BigDecimal periodDemand02, final BigDecimal periodDemand03,
			final BigDecimal periodDemand04, final BigDecimal periodDemand05,
			final BigDecimal periodDemand06, final BigDecimal periodDemand07,
			final BigDecimal periodDemand08, final BigDecimal periodDemand09,
			final BigDecimal periodDemand10, final BigDecimal periodDemand11,
			final BigDecimal periodDemand12, final BigDecimal periodDemand13,
			final BigDecimal safetyDays, final BigDecimal reviewDays,
			final BigDecimal reorderDays, final BigDecimal prYield,
			final BigDecimal setupCost, final BigDecimal dspare01,
			final BigDecimal dspare02, final BigDecimal dspare03,
			final BigDecimal dspare04, final BigDecimal dspare05,
			final BigDecimal dspare06, final BigDecimal dspare07,
			final BigDecimal dspare08, final BigDecimal dspare09,
			final BigDecimal dspare10, final BigDecimal inspectionYield,
			final BigDecimal holdingCost, final Integer inspectCycle,
			final Integer batchReceipts, final Integer lowestWhereUsed,
			final Date lastRevalue, final Integer lastWhereUsedRu,
			final BigDecimal subOncost, final Integer spareInteger,
			final BigDecimal stockTakeToleran, final BigDecimal weightLow,
			final String mpsType, final String spare,
			final BigDecimal wholesalePrice,
			final BigDecimal worderAllocations, final String spare2,
			final String analysisXRef, final String vatInclusive,
			final String stockVatType, final String buyerId,
			final String levelOfDetail, final String pricingDiscount,
			final String despatchUnits, final String despatchUnitUse,
			final String stockType, final String packaging,
			final String shippingCategory) {

		this.warehouse = warehouse;
		this.product = product;
		this.alpha = alpha;
		this.description = description;
		this.supersession = supersession;
		this.supsessionDate = supsessionDate;
		this.alternatives01 = alternatives01;
		this.alternatives02 = alternatives02;
		this.alternatives03 = alternatives03;
		this.alternatives04 = alternatives04;
		this.alternatives05 = alternatives05;
		this.alternatives06 = alternatives06;
		this.alternatives07 = alternatives07;
		this.alternatives08 = alternatives08;
		this.alternatives09 = alternatives09;
		this.alternatives10 = alternatives10;
		this.unitCode = unitCode;
		this.binNumber = binNumber;
		this.issueDate = issueDate;
		this.stockDate = stockDate;
		this.deliveryDate = deliveryDate;
		this.longDescription = longDescription;
		this.oldVatCode = oldVatCode;
		this.abcCategory = abcCategory;
		this.discount = discount;
		this.nominalKey = nominalKey;
		this.purchaseKey = purchaseKey;
		this.serialNumbers = serialNumbers;
		this.analysisA = analysisA;
		this.analysisB = analysisB;
		this.analysisC = analysisC;
		this.queueSequence = queueSequence;
		this.qtyDecimalPlaces = qtyDecimalPlaces;
		this.mrpBatching = mrpBatching;
		this.workingLevel = workingLevel;
		this.makeOrBuy = makeOrBuy;
		this.purchaseUnit = purchaseUnit;
		this.sellingUnit = sellingUnit;
		this.bulkItem = bulkItem;
		this.drawingNumber = drawingNumber;
		this.catalogueNumber = catalogueNumber;
		this.unitLength = unitLength;
		this.unitWidth = unitWidth;
		this.unitHeight = unitHeight;
		this.supplier = supplier;
		this.batchTraceability = batchTraceability;
		this.lastSupplier = lastSupplier;
		this.stdCostFreeze = stdCostFreeze;
		this.reorderFreeze = reorderFreeze;
		this.physicalQty = physicalQty;
		this.allocatedQty = allocatedQty;
		this.backOrderQty = backOrderQty;
		this.forwardOrderQty = forwardOrderQty;
		this.onOrderQty = onOrderQty;
		this.price = price;
		this.weight = weight;
		this.standardCost = standardCost;
		this.currentCost = currentCost;
		this.expectedCost = expectedCost;
		this.economicReorderQ = economicReorderQ;
		this.leadTime = leadTime;
		this.minStockLevel = minStockLevel;
		this.averageSalesValu = averageSalesValu;
		this.monthToDate01 = monthToDate01;
		this.monthToDate02 = monthToDate02;
		this.monthToDate03 = monthToDate03;
		this.monthToDate04 = monthToDate04;
		this.monthToDate05 = monthToDate05;
		this.monthToDate06 = monthToDate06;
		this.monthToDate07 = monthToDate07;
		this.monthToDate08 = monthToDate08;
		this.monthToDate09 = monthToDate09;
		this.monthToDate10 = monthToDate10;
		this.yearToDate01 = yearToDate01;
		this.yearToDate02 = yearToDate02;
		this.yearToDate03 = yearToDate03;
		this.yearToDate04 = yearToDate04;
		this.yearToDate05 = yearToDate05;
		this.yearToDate06 = yearToDate06;
		this.yearToDate07 = yearToDate07;
		this.yearToDate08 = yearToDate08;
		this.yearToDate09 = yearToDate09;
		this.yearToDate10 = yearToDate10;
		this.previousSaleVal1 = previousSaleVal1;
		this.previousSaleVal2 = previousSaleVal2;
		this.previousSaleVal3 = previousSaleVal3;
		this.periodIssueQty01 = periodIssueQty01;
		this.periodIssueQty02 = periodIssueQty02;
		this.periodIssueQty03 = periodIssueQty03;
		this.periodIssueQty04 = periodIssueQty04;
		this.periodIssueQty05 = periodIssueQty05;
		this.periodIssueQty06 = periodIssueQty06;
		this.periodIssueQty07 = periodIssueQty07;
		this.periodIssueQty08 = periodIssueQty08;
		this.periodIssueQty09 = periodIssueQty09;
		this.periodIssueQty10 = periodIssueQty10;
		this.periodIssueQty11 = periodIssueQty11;
		this.periodIssueQty12 = periodIssueQty12;
		this.periodIssueQty13 = periodIssueQty13;
		this.periodIssueVal01 = periodIssueVal01;
		this.periodIssueVal02 = periodIssueVal02;
		this.periodIssueVal03 = periodIssueVal03;
		this.periodIssueVal04 = periodIssueVal04;
		this.periodIssueVal05 = periodIssueVal05;
		this.periodIssueVal06 = periodIssueVal06;
		this.periodIssueVal07 = periodIssueVal07;
		this.periodIssueVal08 = periodIssueVal08;
		this.periodIssueVal09 = periodIssueVal09;
		this.periodIssueVal10 = periodIssueVal10;
		this.periodIssueVal11 = periodIssueVal11;
		this.periodIssueVal12 = periodIssueVal12;
		this.periodIssueVal13 = periodIssueVal13;
		this.standardLabour = standardLabour;
		this.standardOverhead = standardOverhead;
		this.standardMaterial = standardMaterial;
		this.standardSubcontra = standardSubcontra;
		this.mrpReorderRoundi = mrpReorderRoundi;
		this.purchaseFactor = purchaseFactor;
		this.sellingFactor = sellingFactor;
		this.safetyStockLevel = safetyStockLevel;
		this.materialOnCost = materialOnCost;
		this.labourOnCost = labourOnCost;
		this.overheadOnCost = overheadOnCost;
		this.maximumStockLeve = maximumStockLeve;
		this.shelfLife = shelfLife;
		this.stockLength = stockLength;
		this.stockWidth = stockWidth;
		this.stockHeight = stockHeight;
		this.currentMaterial = currentMaterial;
		this.currentLabour = currentLabour;
		this.currentOverhead = currentOverhead;
		this.currentSubcontrac = currentSubcontrac;
		this.uninspectedQty = uninspectedQty;
		this.periodDemand01 = periodDemand01;
		this.periodDemand02 = periodDemand02;
		this.periodDemand03 = periodDemand03;
		this.periodDemand04 = periodDemand04;
		this.periodDemand05 = periodDemand05;
		this.periodDemand06 = periodDemand06;
		this.periodDemand07 = periodDemand07;
		this.periodDemand08 = periodDemand08;
		this.periodDemand09 = periodDemand09;
		this.periodDemand10 = periodDemand10;
		this.periodDemand11 = periodDemand11;
		this.periodDemand12 = periodDemand12;
		this.periodDemand13 = periodDemand13;
		this.safetyDays = safetyDays;
		this.reviewDays = reviewDays;
		this.reorderDays = reorderDays;
		this.prYield = prYield;
		this.setupCost = setupCost;
		this.dspare01 = dspare01;
		this.dspare02 = dspare02;
		this.dspare03 = dspare03;
		this.dspare04 = dspare04;
		this.dspare05 = dspare05;
		this.dspare06 = dspare06;
		this.dspare07 = dspare07;
		this.dspare08 = dspare08;
		this.dspare09 = dspare09;
		this.dspare10 = dspare10;
		this.inspectionYield = inspectionYield;
		this.holdingCost = holdingCost;
		this.inspectCycle = inspectCycle;
		this.batchReceipts = batchReceipts;
		this.lowestWhereUsed = lowestWhereUsed;
		this.lastRevalue = lastRevalue;
		this.lastWhereUsedRu = lastWhereUsedRu;
		this.subOncost = subOncost;
		this.spareInteger = spareInteger;
		this.stockTakeToleran = stockTakeToleran;
		this.weightLow = weightLow;
		this.mpsType = mpsType;
		this.spare = spare;
		this.wholesalePrice = wholesalePrice;
		this.worderAllocations = worderAllocations;
		this.spare2 = spare2;
		this.analysisXRef = analysisXRef;
		this.vatInclusive = vatInclusive;
		this.stockVatType = stockVatType;
		this.buyerId = buyerId;
		this.levelOfDetail = levelOfDetail;
		this.pricingDiscount = pricingDiscount;
		this.despatchUnits = despatchUnits;
		this.despatchUnitUse = despatchUnitUse;
		this.stockType = stockType;
		this.packaging = packaging;
		this.shippingCategory = shippingCategory;
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

	public String getAlpha() {
		return alpha;
	}

	public void setAlpha(String alpha) {
		this.alpha = alpha;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSupersession() {
		return supersession;
	}

	public void setSupersession(String supersession) {
		this.supersession = supersession;
	}

	public Date getSupsessionDate() {
		return supsessionDate;
	}

	public void setSupsessionDate(Date supsessionDate) {
		this.supsessionDate = supsessionDate;
	}

	public String getAlternatives01() {
		return alternatives01;
	}

	public void setAlternatives01(String alternatives01) {
		this.alternatives01 = alternatives01;
	}

	public String getAlternatives02() {
		return alternatives02;
	}

	public void setAlternatives02(String alternatives02) {
		this.alternatives02 = alternatives02;
	}

	public String getAlternatives03() {
		return alternatives03;
	}

	public void setAlternatives03(String alternatives03) {
		this.alternatives03 = alternatives03;
	}

	public String getAlternatives04() {
		return alternatives04;
	}

	public void setAlternatives04(String alternatives04) {
		this.alternatives04 = alternatives04;
	}

	public String getAlternatives05() {
		return alternatives05;
	}

	public void setAlternatives05(String alternatives05) {
		this.alternatives05 = alternatives05;
	}

	public String getAlternatives06() {
		return alternatives06;
	}

	public void setAlternatives06(String alternatives06) {
		this.alternatives06 = alternatives06;
	}

	public String getAlternatives07() {
		return alternatives07;
	}

	public void setAlternatives07(String alternatives07) {
		this.alternatives07 = alternatives07;
	}

	public String getAlternatives08() {
		return alternatives08;
	}

	public void setAlternatives08(String alternatives08) {
		this.alternatives08 = alternatives08;
	}

	public String getAlternatives09() {
		return alternatives09;
	}

	public void setAlternatives09(String alternatives09) {
		this.alternatives09 = alternatives09;
	}

	public String getAlternatives10() {
		return alternatives10;
	}

	public void setAlternatives10(String alternatives10) {
		this.alternatives10 = alternatives10;
	}

	public String getUnitCode() {
		return unitCode;
	}

	public void setUnitCode(String unitCode) {
		this.unitCode = unitCode;
	}

	public String getBinNumber() {
		return binNumber;
	}

	public void setBinNumber(String binNumber) {
		this.binNumber = binNumber;
	}

	public Date getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}

	public Date getStockDate() {
		return stockDate;
	}

	public void setStockDate(Date stockDate) {
		this.stockDate = stockDate;
	}

	public Date getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public String getLongDescription() {
		return longDescription;
	}

	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}

	public String getOldVatCode() {
		return oldVatCode;
	}

	public void setOldVatCode(String oldVatCode) {
		this.oldVatCode = oldVatCode;
	}

	public String getAbcCategory() {
		return abcCategory;
	}

	public void setAbcCategory(String abcCategory) {
		this.abcCategory = abcCategory;
	}

	public String getDiscount() {
		return discount;
	}

	public void setDiscount(String discount) {
		this.discount = discount;
	}

	public String getNominalKey() {
		return nominalKey;
	}

	public void setNominalKey(String nominalKey) {
		this.nominalKey = nominalKey;
	}

	public String getPurchaseKey() {
		return purchaseKey;
	}

	public void setPurchaseKey(String purchaseKey) {
		this.purchaseKey = purchaseKey;
	}

	public String getSerialNumbers() {
		return serialNumbers;
	}

	public void setSerialNumbers(String serialNumbers) {
		this.serialNumbers = serialNumbers;
	}

	public String getAnalysisA() {
		return analysisA;
	}

	public void setAnalysisA(String analysisA) {
		this.analysisA = analysisA;
	}

	public String getAnalysisB() {
		return analysisB;
	}

	public void setAnalysisB(String analysisB) {
		this.analysisB = analysisB;
	}

	public String getAnalysisC() {
		return analysisC;
	}

	public void setAnalysisC(String analysisC) {
		this.analysisC = analysisC;
	}

	public String getQueueSequence() {
		return queueSequence;
	}

	public void setQueueSequence(String queueSequence) {
		this.queueSequence = queueSequence;
	}

	public String getQtyDecimalPlaces() {
		return qtyDecimalPlaces;
	}

	public void setQtyDecimalPlaces(String qtyDecimalPlaces) {
		this.qtyDecimalPlaces = qtyDecimalPlaces;
	}

	public String getMrpBatching() {
		return mrpBatching;
	}

	public void setMrpBatching(String mrpBatching) {
		this.mrpBatching = mrpBatching;
	}

	public String getWorkingLevel() {
		return workingLevel;
	}

	public void setWorkingLevel(String workingLevel) {
		this.workingLevel = workingLevel;
	}

	public String getMakeOrBuy() {
		return makeOrBuy;
	}

	public void setMakeOrBuy(String makeOrBuy) {
		this.makeOrBuy = makeOrBuy;
	}

	public String getPurchaseUnit() {
		return purchaseUnit;
	}

	public void setPurchaseUnit(String purchaseUnit) {
		this.purchaseUnit = purchaseUnit;
	}

	public String getSellingUnit() {
		return sellingUnit;
	}

	public void setSellingUnit(String sellingUnit) {
		this.sellingUnit = sellingUnit;
	}

	public String getBulkItem() {
		return bulkItem;
	}

	public void setBulkItem(String bulkItem) {
		this.bulkItem = bulkItem;
	}

	public String getDrawingNumber() {
		return drawingNumber;
	}

	public void setDrawingNumber(String drawingNumber) {
		this.drawingNumber = drawingNumber;
	}

	public String getCatalogueNumber() {
		return catalogueNumber;
	}

	public void setCatalogueNumber(String catalogueNumber) {
		this.catalogueNumber = catalogueNumber;
	}

	public String getUnitLength() {
		return unitLength;
	}

	public void setUnitLength(String unitLength) {
		this.unitLength = unitLength;
	}

	public String getUnitWidth() {
		return unitWidth;
	}

	public void setUnitWidth(String unitWidth) {
		this.unitWidth = unitWidth;
	}

	public String getUnitHeight() {
		return unitHeight;
	}

	public void setUnitHeight(String unitHeight) {
		this.unitHeight = unitHeight;
	}

	public String getSupplier() {
		return supplier;
	}

	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}

	public String getBatchTraceability() {
		return batchTraceability;
	}

	public void setBatchTraceability(String batchTraceability) {
		this.batchTraceability = batchTraceability;
	}

	public String getLastSupplier() {
		return lastSupplier;
	}

	public void setLastSupplier(String lastSupplier) {
		this.lastSupplier = lastSupplier;
	}

	public String getStdCostFreeze() {
		return stdCostFreeze;
	}

	public void setStdCostFreeze(String stdCostFreeze) {
		this.stdCostFreeze = stdCostFreeze;
	}

	public String getReorderFreeze() {
		return reorderFreeze;
	}

	public void setReorderFreeze(String reorderFreeze) {
		this.reorderFreeze = reorderFreeze;
	}

	public BigDecimal getPhysicalQty() {
		return physicalQty;
	}

	public void setPhysicalQty(BigDecimal physicalQty) {
		this.physicalQty = physicalQty;
	}

	public BigDecimal getAllocatedQty() {
		return allocatedQty;
	}

	public void setAllocatedQty(BigDecimal allocatedQty) {
		this.allocatedQty = allocatedQty;
	}

	public BigDecimal getBackOrderQty() {
		return backOrderQty;
	}

	public void setBackOrderQty(BigDecimal backOrderQty) {
		this.backOrderQty = backOrderQty;
	}

	public BigDecimal getForwardOrderQty() {
		return forwardOrderQty;
	}

	public void setForwardOrderQty(BigDecimal forwardOrderQty) {
		this.forwardOrderQty = forwardOrderQty;
	}

	public BigDecimal getOnOrderQty() {
		return onOrderQty;
	}

	public void setOnOrderQty(BigDecimal onOrderQty) {
		this.onOrderQty = onOrderQty;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public BigDecimal getWeight() {
		return weight;
	}

	public void setWeight(BigDecimal weight) {
		this.weight = weight;
	}

	public BigDecimal getStandardCost() {
		return standardCost;
	}

	public void setStandardCost(BigDecimal standardCost) {
		this.standardCost = standardCost;
	}

	public BigDecimal getCurrentCost() {
		return currentCost;
	}

	public void setCurrentCost(BigDecimal currentCost) {
		this.currentCost = currentCost;
	}

	public BigDecimal getExpectedCost() {
		return expectedCost;
	}

	public void setExpectedCost(BigDecimal expectedCost) {
		this.expectedCost = expectedCost;
	}

	public BigDecimal getEconomicReorderQ() {
		return economicReorderQ;
	}

	public void setEconomicReorderQ(BigDecimal economicReorderQ) {
		this.economicReorderQ = economicReorderQ;
	}

	public BigDecimal getLeadTime() {
		return leadTime;
	}

	public void setLeadTime(BigDecimal leadTime) {
		this.leadTime = leadTime;
	}

	public BigDecimal getMinStockLevel() {
		return minStockLevel;
	}

	public void setMinStockLevel(BigDecimal minStockLevel) {
		this.minStockLevel = minStockLevel;
	}

	public BigDecimal getAverageSalesValu() {
		return averageSalesValu;
	}

	public void setAverageSalesValu(BigDecimal averageSalesValu) {
		this.averageSalesValu = averageSalesValu;
	}

	public BigDecimal getMonthToDate01() {
		return monthToDate01;
	}

	public void setMonthToDate01(BigDecimal monthToDate01) {
		this.monthToDate01 = monthToDate01;
	}

	public BigDecimal getMonthToDate02() {
		return monthToDate02;
	}

	public void setMonthToDate02(BigDecimal monthToDate02) {
		this.monthToDate02 = monthToDate02;
	}

	public BigDecimal getMonthToDate03() {
		return monthToDate03;
	}

	public void setMonthToDate03(BigDecimal monthToDate03) {
		this.monthToDate03 = monthToDate03;
	}

	public BigDecimal getMonthToDate04() {
		return monthToDate04;
	}

	public void setMonthToDate04(BigDecimal monthToDate04) {
		this.monthToDate04 = monthToDate04;
	}

	public BigDecimal getMonthToDate05() {
		return monthToDate05;
	}

	public void setMonthToDate05(BigDecimal monthToDate05) {
		this.monthToDate05 = monthToDate05;
	}

	public BigDecimal getMonthToDate06() {
		return monthToDate06;
	}

	public void setMonthToDate06(BigDecimal monthToDate06) {
		this.monthToDate06 = monthToDate06;
	}

	public BigDecimal getMonthToDate07() {
		return monthToDate07;
	}

	public void setMonthToDate07(BigDecimal monthToDate07) {
		this.monthToDate07 = monthToDate07;
	}

	public BigDecimal getMonthToDate08() {
		return monthToDate08;
	}

	public void setMonthToDate08(BigDecimal monthToDate08) {
		this.monthToDate08 = monthToDate08;
	}

	public BigDecimal getMonthToDate09() {
		return monthToDate09;
	}

	public void setMonthToDate09(BigDecimal monthToDate09) {
		this.monthToDate09 = monthToDate09;
	}

	public BigDecimal getMonthToDate10() {
		return monthToDate10;
	}

	public void setMonthToDate10(BigDecimal monthToDate10) {
		this.monthToDate10 = monthToDate10;
	}

	public BigDecimal getYearToDate01() {
		return yearToDate01;
	}

	public void setYearToDate01(BigDecimal yearToDate01) {
		this.yearToDate01 = yearToDate01;
	}

	public BigDecimal getYearToDate02() {
		return yearToDate02;
	}

	public void setYearToDate02(BigDecimal yearToDate02) {
		this.yearToDate02 = yearToDate02;
	}

	public BigDecimal getYearToDate03() {
		return yearToDate03;
	}

	public void setYearToDate03(BigDecimal yearToDate03) {
		this.yearToDate03 = yearToDate03;
	}

	public BigDecimal getYearToDate04() {
		return yearToDate04;
	}

	public void setYearToDate04(BigDecimal yearToDate04) {
		this.yearToDate04 = yearToDate04;
	}

	public BigDecimal getYearToDate05() {
		return yearToDate05;
	}

	public void setYearToDate05(BigDecimal yearToDate05) {
		this.yearToDate05 = yearToDate05;
	}

	public BigDecimal getYearToDate06() {
		return yearToDate06;
	}

	public void setYearToDate06(BigDecimal yearToDate06) {
		this.yearToDate06 = yearToDate06;
	}

	public BigDecimal getYearToDate07() {
		return yearToDate07;
	}

	public void setYearToDate07(BigDecimal yearToDate07) {
		this.yearToDate07 = yearToDate07;
	}

	public BigDecimal getYearToDate08() {
		return yearToDate08;
	}

	public void setYearToDate08(BigDecimal yearToDate08) {
		this.yearToDate08 = yearToDate08;
	}

	public BigDecimal getYearToDate09() {
		return yearToDate09;
	}

	public void setYearToDate09(BigDecimal yearToDate09) {
		this.yearToDate09 = yearToDate09;
	}

	public BigDecimal getYearToDate10() {
		return yearToDate10;
	}

	public void setYearToDate10(BigDecimal yearToDate10) {
		this.yearToDate10 = yearToDate10;
	}

	public BigDecimal getPreviousSaleVal1() {
		return previousSaleVal1;
	}

	public void setPreviousSaleVal1(BigDecimal previousSaleVal1) {
		this.previousSaleVal1 = previousSaleVal1;
	}

	public BigDecimal getPreviousSaleVal2() {
		return previousSaleVal2;
	}

	public void setPreviousSaleVal2(BigDecimal previousSaleVal2) {
		this.previousSaleVal2 = previousSaleVal2;
	}

	public BigDecimal getPreviousSaleVal3() {
		return previousSaleVal3;
	}

	public void setPreviousSaleVal3(BigDecimal previousSaleVal3) {
		this.previousSaleVal3 = previousSaleVal3;
	}

	public BigDecimal getPeriodIssueQty01() {
		return periodIssueQty01;
	}

	public void setPeriodIssueQty01(BigDecimal periodIssueQty01) {
		this.periodIssueQty01 = periodIssueQty01;
	}

	public BigDecimal getPeriodIssueQty02() {
		return periodIssueQty02;
	}

	public void setPeriodIssueQty02(BigDecimal periodIssueQty02) {
		this.periodIssueQty02 = periodIssueQty02;
	}

	public BigDecimal getPeriodIssueQty03() {
		return periodIssueQty03;
	}

	public void setPeriodIssueQty03(BigDecimal periodIssueQty03) {
		this.periodIssueQty03 = periodIssueQty03;
	}

	public BigDecimal getPeriodIssueQty04() {
		return periodIssueQty04;
	}

	public void setPeriodIssueQty04(BigDecimal periodIssueQty04) {
		this.periodIssueQty04 = periodIssueQty04;
	}

	public BigDecimal getPeriodIssueQty05() {
		return periodIssueQty05;
	}

	public void setPeriodIssueQty05(BigDecimal periodIssueQty05) {
		this.periodIssueQty05 = periodIssueQty05;
	}

	public BigDecimal getPeriodIssueQty06() {
		return periodIssueQty06;
	}

	public void setPeriodIssueQty06(BigDecimal periodIssueQty06) {
		this.periodIssueQty06 = periodIssueQty06;
	}

	public BigDecimal getPeriodIssueQty07() {
		return periodIssueQty07;
	}

	public void setPeriodIssueQty07(BigDecimal periodIssueQty07) {
		this.periodIssueQty07 = periodIssueQty07;
	}

	public BigDecimal getPeriodIssueQty08() {
		return periodIssueQty08;
	}

	public void setPeriodIssueQty08(BigDecimal periodIssueQty08) {
		this.periodIssueQty08 = periodIssueQty08;
	}

	public BigDecimal getPeriodIssueQty09() {
		return periodIssueQty09;
	}

	public void setPeriodIssueQty09(BigDecimal periodIssueQty09) {
		this.periodIssueQty09 = periodIssueQty09;
	}

	public BigDecimal getPeriodIssueQty10() {
		return periodIssueQty10;
	}

	public void setPeriodIssueQty10(BigDecimal periodIssueQty10) {
		this.periodIssueQty10 = periodIssueQty10;
	}

	public BigDecimal getPeriodIssueQty11() {
		return periodIssueQty11;
	}

	public void setPeriodIssueQty11(BigDecimal periodIssueQty11) {
		this.periodIssueQty11 = periodIssueQty11;
	}

	public BigDecimal getPeriodIssueQty12() {
		return periodIssueQty12;
	}

	public void setPeriodIssueQty12(BigDecimal periodIssueQty12) {
		this.periodIssueQty12 = periodIssueQty12;
	}

	public BigDecimal getPeriodIssueQty13() {
		return periodIssueQty13;
	}

	public void setPeriodIssueQty13(BigDecimal periodIssueQty13) {
		this.periodIssueQty13 = periodIssueQty13;
	}

	public BigDecimal getPeriodIssueVal01() {
		return periodIssueVal01;
	}

	public void setPeriodIssueVal01(BigDecimal periodIssueVal01) {
		this.periodIssueVal01 = periodIssueVal01;
	}

	public BigDecimal getPeriodIssueVal02() {
		return periodIssueVal02;
	}

	public void setPeriodIssueVal02(BigDecimal periodIssueVal02) {
		this.periodIssueVal02 = periodIssueVal02;
	}

	public BigDecimal getPeriodIssueVal03() {
		return periodIssueVal03;
	}

	public void setPeriodIssueVal03(BigDecimal periodIssueVal03) {
		this.periodIssueVal03 = periodIssueVal03;
	}

	public BigDecimal getPeriodIssueVal04() {
		return periodIssueVal04;
	}

	public void setPeriodIssueVal04(BigDecimal periodIssueVal04) {
		this.periodIssueVal04 = periodIssueVal04;
	}

	public BigDecimal getPeriodIssueVal05() {
		return periodIssueVal05;
	}

	public void setPeriodIssueVal05(BigDecimal periodIssueVal05) {
		this.periodIssueVal05 = periodIssueVal05;
	}

	public BigDecimal getPeriodIssueVal06() {
		return periodIssueVal06;
	}

	public void setPeriodIssueVal06(BigDecimal periodIssueVal06) {
		this.periodIssueVal06 = periodIssueVal06;
	}

	public BigDecimal getPeriodIssueVal07() {
		return periodIssueVal07;
	}

	public void setPeriodIssueVal07(BigDecimal periodIssueVal07) {
		this.periodIssueVal07 = periodIssueVal07;
	}

	public BigDecimal getPeriodIssueVal08() {
		return periodIssueVal08;
	}

	public void setPeriodIssueVal08(BigDecimal periodIssueVal08) {
		this.periodIssueVal08 = periodIssueVal08;
	}

	public BigDecimal getPeriodIssueVal09() {
		return periodIssueVal09;
	}

	public void setPeriodIssueVal09(BigDecimal periodIssueVal09) {
		this.periodIssueVal09 = periodIssueVal09;
	}

	public BigDecimal getPeriodIssueVal10() {
		return periodIssueVal10;
	}

	public void setPeriodIssueVal10(BigDecimal periodIssueVal10) {
		this.periodIssueVal10 = periodIssueVal10;
	}

	public BigDecimal getPeriodIssueVal11() {
		return periodIssueVal11;
	}

	public void setPeriodIssueVal11(BigDecimal periodIssueVal11) {
		this.periodIssueVal11 = periodIssueVal11;
	}

	public BigDecimal getPeriodIssueVal12() {
		return periodIssueVal12;
	}

	public void setPeriodIssueVal12(BigDecimal periodIssueVal12) {
		this.periodIssueVal12 = periodIssueVal12;
	}

	public BigDecimal getPeriodIssueVal13() {
		return periodIssueVal13;
	}

	public void setPeriodIssueVal13(BigDecimal periodIssueVal13) {
		this.periodIssueVal13 = periodIssueVal13;
	}

	public BigDecimal getStandardLabour() {
		return standardLabour;
	}

	public void setStandardLabour(BigDecimal standardLabour) {
		this.standardLabour = standardLabour;
	}

	public BigDecimal getStandardOverhead() {
		return standardOverhead;
	}

	public void setStandardOverhead(BigDecimal standardOverhead) {
		this.standardOverhead = standardOverhead;
	}

	public BigDecimal getStandardMaterial() {
		return standardMaterial;
	}

	public void setStandardMaterial(BigDecimal standardMaterial) {
		this.standardMaterial = standardMaterial;
	}

	public BigDecimal getStandardSubcontra() {
		return standardSubcontra;
	}

	public void setStandardSubcontra(BigDecimal standardSubcontra) {
		this.standardSubcontra = standardSubcontra;
	}

	public BigDecimal getMrpReorderRoundi() {
		return mrpReorderRoundi;
	}

	public void setMrpReorderRoundi(BigDecimal mrpReorderRoundi) {
		this.mrpReorderRoundi = mrpReorderRoundi;
	}

	public BigDecimal getPurchaseFactor() {
		return purchaseFactor;
	}

	public void setPurchaseFactor(BigDecimal purchaseFactor) {
		this.purchaseFactor = purchaseFactor;
	}

	public BigDecimal getSellingFactor() {
		return sellingFactor;
	}

	public void setSellingFactor(BigDecimal sellingFactor) {
		this.sellingFactor = sellingFactor;
	}

	public BigDecimal getSafetyStockLevel() {
		return safetyStockLevel;
	}

	public void setSafetyStockLevel(BigDecimal safetyStockLevel) {
		this.safetyStockLevel = safetyStockLevel;
	}

	public BigDecimal getMaterialOnCost() {
		return materialOnCost;
	}

	public void setMaterialOnCost(BigDecimal materialOnCost) {
		this.materialOnCost = materialOnCost;
	}

	public BigDecimal getLabourOnCost() {
		return labourOnCost;
	}

	public void setLabourOnCost(BigDecimal labourOnCost) {
		this.labourOnCost = labourOnCost;
	}

	public BigDecimal getOverheadOnCost() {
		return overheadOnCost;
	}

	public void setOverheadOnCost(BigDecimal overheadOnCost) {
		this.overheadOnCost = overheadOnCost;
	}

	public BigDecimal getMaximumStockLeve() {
		return maximumStockLeve;
	}

	public void setMaximumStockLeve(BigDecimal maximumStockLeve) {
		this.maximumStockLeve = maximumStockLeve;
	}

	public BigDecimal getShelfLife() {
		return shelfLife;
	}

	public void setShelfLife(BigDecimal shelfLife) {
		this.shelfLife = shelfLife;
	}

	public BigDecimal getStockLength() {
		return stockLength;
	}

	public void setStockLength(BigDecimal stockLength) {
		this.stockLength = stockLength;
	}

	public BigDecimal getStockWidth() {
		return stockWidth;
	}

	public void setStockWidth(BigDecimal stockWidth) {
		this.stockWidth = stockWidth;
	}

	public BigDecimal getStockHeight() {
		return stockHeight;
	}

	public void setStockHeight(BigDecimal stockHeight) {
		this.stockHeight = stockHeight;
	}

	public BigDecimal getCurrentMaterial() {
		return currentMaterial;
	}

	public void setCurrentMaterial(BigDecimal currentMaterial) {
		this.currentMaterial = currentMaterial;
	}

	public BigDecimal getCurrentLabour() {
		return currentLabour;
	}

	public void setCurrentLabour(BigDecimal currentLabour) {
		this.currentLabour = currentLabour;
	}

	public BigDecimal getCurrentOverhead() {
		return currentOverhead;
	}

	public void setCurrentOverhead(BigDecimal currentOverhead) {
		this.currentOverhead = currentOverhead;
	}

	public BigDecimal getCurrentSubcontrac() {
		return currentSubcontrac;
	}

	public void setCurrentSubcontrac(BigDecimal currentSubcontrac) {
		this.currentSubcontrac = currentSubcontrac;
	}

	public BigDecimal getUninspectedQty() {
		return uninspectedQty;
	}

	public void setUninspectedQty(BigDecimal uninspectedQty) {
		this.uninspectedQty = uninspectedQty;
	}

	public BigDecimal getPeriodDemand01() {
		return periodDemand01;
	}

	public void setPeriodDemand01(BigDecimal periodDemand01) {
		this.periodDemand01 = periodDemand01;
	}

	public BigDecimal getPeriodDemand02() {
		return periodDemand02;
	}

	public void setPeriodDemand02(BigDecimal periodDemand02) {
		this.periodDemand02 = periodDemand02;
	}

	public BigDecimal getPeriodDemand03() {
		return periodDemand03;
	}

	public void setPeriodDemand03(BigDecimal periodDemand03) {
		this.periodDemand03 = periodDemand03;
	}

	public BigDecimal getPeriodDemand04() {
		return periodDemand04;
	}

	public void setPeriodDemand04(BigDecimal periodDemand04) {
		this.periodDemand04 = periodDemand04;
	}

	public BigDecimal getPeriodDemand05() {
		return periodDemand05;
	}

	public void setPeriodDemand05(BigDecimal periodDemand05) {
		this.periodDemand05 = periodDemand05;
	}

	public BigDecimal getPeriodDemand06() {
		return periodDemand06;
	}

	public void setPeriodDemand06(BigDecimal periodDemand06) {
		this.periodDemand06 = periodDemand06;
	}

	public BigDecimal getPeriodDemand07() {
		return periodDemand07;
	}

	public void setPeriodDemand07(BigDecimal periodDemand07) {
		this.periodDemand07 = periodDemand07;
	}

	public BigDecimal getPeriodDemand08() {
		return periodDemand08;
	}

	public void setPeriodDemand08(BigDecimal periodDemand08) {
		this.periodDemand08 = periodDemand08;
	}

	public BigDecimal getPeriodDemand09() {
		return periodDemand09;
	}

	public void setPeriodDemand09(BigDecimal periodDemand09) {
		this.periodDemand09 = periodDemand09;
	}

	public BigDecimal getPeriodDemand10() {
		return periodDemand10;
	}

	public void setPeriodDemand10(BigDecimal periodDemand10) {
		this.periodDemand10 = periodDemand10;
	}

	public BigDecimal getPeriodDemand11() {
		return periodDemand11;
	}

	public void setPeriodDemand11(BigDecimal periodDemand11) {
		this.periodDemand11 = periodDemand11;
	}

	public BigDecimal getPeriodDemand12() {
		return periodDemand12;
	}

	public void setPeriodDemand12(BigDecimal periodDemand12) {
		this.periodDemand12 = periodDemand12;
	}

	public BigDecimal getPeriodDemand13() {
		return periodDemand13;
	}

	public void setPeriodDemand13(BigDecimal periodDemand13) {
		this.periodDemand13 = periodDemand13;
	}

	public BigDecimal getSafetyDays() {
		return safetyDays;
	}

	public void setSafetyDays(BigDecimal safetyDays) {
		this.safetyDays = safetyDays;
	}

	public BigDecimal getReviewDays() {
		return reviewDays;
	}

	public void setReviewDays(BigDecimal reviewDays) {
		this.reviewDays = reviewDays;
	}

	public BigDecimal getReorderDays() {
		return reorderDays;
	}

	public void setReorderDays(BigDecimal reorderDays) {
		this.reorderDays = reorderDays;
	}

	public BigDecimal getPrYield() {
		return prYield;
	}

	public void setPrYield(BigDecimal prYield) {
		this.prYield = prYield;
	}

	public BigDecimal getSetupCost() {
		return setupCost;
	}

	public void setSetupCost(BigDecimal setupCost) {
		this.setupCost = setupCost;
	}

	public BigDecimal getDspare01() {
		return dspare01;
	}

	public void setDspare01(BigDecimal dspare01) {
		this.dspare01 = dspare01;
	}

	public BigDecimal getDspare02() {
		return dspare02;
	}

	public void setDspare02(BigDecimal dspare02) {
		this.dspare02 = dspare02;
	}

	public BigDecimal getDspare03() {
		return dspare03;
	}

	public void setDspare03(BigDecimal dspare03) {
		this.dspare03 = dspare03;
	}

	public BigDecimal getDspare04() {
		return dspare04;
	}

	public void setDspare04(BigDecimal dspare04) {
		this.dspare04 = dspare04;
	}

	public BigDecimal getDspare05() {
		return dspare05;
	}

	public void setDspare05(BigDecimal dspare05) {
		this.dspare05 = dspare05;
	}

	public BigDecimal getDspare06() {
		return dspare06;
	}

	public void setDspare06(BigDecimal dspare06) {
		this.dspare06 = dspare06;
	}

	public BigDecimal getDspare07() {
		return dspare07;
	}

	public void setDspare07(BigDecimal dspare07) {
		this.dspare07 = dspare07;
	}

	public BigDecimal getDspare08() {
		return dspare08;
	}

	public void setDspare08(BigDecimal dspare08) {
		this.dspare08 = dspare08;
	}

	public BigDecimal getDspare09() {
		return dspare09;
	}

	public void setDspare09(BigDecimal dspare09) {
		this.dspare09 = dspare09;
	}

	public BigDecimal getDspare10() {
		return dspare10;
	}

	public void setDspare10(BigDecimal dspare10) {
		this.dspare10 = dspare10;
	}

	public BigDecimal getInspectionYield() {
		return inspectionYield;
	}

	public void setInspectionYield(BigDecimal inspectionYield) {
		this.inspectionYield = inspectionYield;
	}

	public BigDecimal getHoldingCost() {
		return holdingCost;
	}

	public void setHoldingCost(BigDecimal holdingCost) {
		this.holdingCost = holdingCost;
	}

	public Integer getInspectCycle() {
		return inspectCycle;
	}

	public void setInspectCycle(Integer inspectCycle) {
		this.inspectCycle = inspectCycle;
	}

	public Integer getBatchReceipts() {
		return batchReceipts;
	}

	public void setBatchReceipts(Integer batchReceipts) {
		this.batchReceipts = batchReceipts;
	}

	public Integer getLowestWhereUsed() {
		return lowestWhereUsed;
	}

	public void setLowestWhereUsed(Integer lowestWhereUsed) {
		this.lowestWhereUsed = lowestWhereUsed;
	}

	public Date getLastRevalue() {
		return lastRevalue;
	}

	public void setLastRevalue(Date lastRevalue) {
		this.lastRevalue = lastRevalue;
	}

	public Integer getLastWhereUsedRu() {
		return lastWhereUsedRu;
	}

	public void setLastWhereUsedRu(Integer lastWhereUsedRu) {
		this.lastWhereUsedRu = lastWhereUsedRu;
	}

	public BigDecimal getSubOncost() {
		return subOncost;
	}

	public void setSubOncost(BigDecimal subOncost) {
		this.subOncost = subOncost;
	}

	public Integer getSpareInteger() {
		return spareInteger;
	}

	public void setSpareInteger(Integer spareInteger) {
		this.spareInteger = spareInteger;
	}

	public BigDecimal getStockTakeToleran() {
		return stockTakeToleran;
	}

	public void setStockTakeToleran(BigDecimal stockTakeToleran) {
		this.stockTakeToleran = stockTakeToleran;
	}

	public BigDecimal getWeightLow() {
		return weightLow;
	}

	public void setWeightLow(BigDecimal weightLow) {
		this.weightLow = weightLow;
	}

	public String getMpsType() {
		return mpsType;
	}

	public void setMpsType(String mpsType) {
		this.mpsType = mpsType;
	}

	public String getSpare() {
		return spare;
	}

	public void setSpare(String spare) {
		this.spare = spare;
	}

	public BigDecimal getWholesalePrice() {
		return wholesalePrice;
	}

	public void setWholesalePrice(BigDecimal wholesalePrice) {
		this.wholesalePrice = wholesalePrice;
	}

	public BigDecimal getWorderAllocations() {
		return worderAllocations;
	}

	public void setWorderAllocations(BigDecimal worderAllocations) {
		this.worderAllocations = worderAllocations;
	}

	public String getSpare2() {
		return spare2;
	}

	public void setSpare2(String spare2) {
		this.spare2 = spare2;
	}

	public String getAnalysisXRef() {
		return analysisXRef;
	}

	public void setAnalysisXRef(String analysisXRef) {
		this.analysisXRef = analysisXRef;
	}

	public String getVatInclusive() {
		return vatInclusive;
	}

	public void setVatInclusive(String vatInclusive) {
		this.vatInclusive = vatInclusive;
	}

	public String getStockVatType() {
		return stockVatType;
	}

	public void setStockVatType(String stockVatType) {
		this.stockVatType = stockVatType;
	}

	public String getBuyerId() {
		return buyerId;
	}

	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}

	public String getLevelOfDetail() {
		return levelOfDetail;
	}

	public void setLevelOfDetail(String levelOfDetail) {
		this.levelOfDetail = levelOfDetail;
	}

	public String getPricingDiscount() {
		return pricingDiscount;
	}

	public void setPricingDiscount(String pricingDiscount) {
		this.pricingDiscount = pricingDiscount;
	}

	public String getDespatchUnits() {
		return despatchUnits;
	}

	public void setDespatchUnits(String despatchUnits) {
		this.despatchUnits = despatchUnits;
	}

	public String getDespatchUnitUse() {
		return despatchUnitUse;
	}

	public void setDespatchUnitUse(String despatchUnitUse) {
		this.despatchUnitUse = despatchUnitUse;
	}

	public String getStockType() {
		return stockType;
	}

	public void setStockType(String stockType) {
		this.stockType = stockType;
	}

	public String getPackaging() {
		return packaging;
	}

	public void setPackaging(String packaging) {
		this.packaging = packaging;
	}

	public String getShippingCategory() {
		return shippingCategory;
	}

	public void setShippingCategory(String shippingCategory) {
		this.shippingCategory = shippingCategory;
	}

}
