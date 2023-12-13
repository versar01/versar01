package com.eppixcomm.eppix.base.utils;

public class OrderLine {

	private String orderNo;
	private String lineNo; // LIKE sod_sim_order_dt.sod_order_line_no,
	private String warehouse; // LIKE sod_sim_order_dt.sod_warehouse,
	private String articleNo; // LIKE sod_sim_order_dt.sod_article_no,
	private String firstSim; // LIKE sod_sim_order_dt.sod_first_sim,
	private String lastSim; // LIKE sod_sim_order_dt.sod_first_sim,
	private Integer qtyOrdered; // LIKE sod_sim_order_dt.sod_qty_ordered,
	private Integer qtyReceived; // LIKE podetm.qty_received,
	private Integer qtyMatched; // LIKE podetm.qty_received,
	private Integer positionNumber; // SMALLINT,
	private Integer lengthNumber; // SMALLINT

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getLineNo() {
		return lineNo;
	}

	public void setLineNo(String lineNo) {
		this.lineNo = lineNo;
	}

	public String getWarehouse() {
		return warehouse;
	}

	public void setWarehouse(String warehouse) {
		this.warehouse = warehouse;
	}

	public String getArticleNo() {
		return articleNo;
	}

	public void setArticleNo(String articleNo) {
		this.articleNo = articleNo;
	}

	public String getFirstSim() {
		return firstSim;
	}

	public void setFirstSim(String firstSim) {
		this.firstSim = firstSim;
	}

	public String getLastSim() {
		return lastSim;
	}

	public void setLastSim(String lastSim) {
		this.lastSim = lastSim;
	}

	public Integer getQtyOrdered() {
		return qtyOrdered;
	}

	public void setQtyOrdered(Integer qtyOrdered) {
		this.qtyOrdered = qtyOrdered;
	}

	public Integer getQtyReceived() {
		return qtyReceived;
	}

	public void setQtyReceived(Integer qtyReceived) {
		this.qtyReceived = qtyReceived;
	}

	public Integer getQtyMatched() {
		return qtyMatched;
	}

	public void setQtyMatched(Integer qtyMatched) {
		this.qtyMatched = qtyMatched;
	}

	public Integer getPositionNumber() {
		return positionNumber;
	}

	public void setPositionNumber(Integer positionNumber) {
		this.positionNumber = positionNumber;
	}

	public Integer getLengthNumber() {
		return lengthNumber;
	}

	public void setLengthNumber(Integer lengthNumber) {
		this.lengthNumber = lengthNumber;
	}

	@Override
	public String toString() {
		return "OrderLine " + "\n[orderNo=" + orderNo + "\nlineNo=" + lineNo
				+ "\nwarehouse=" + warehouse + "\narticleNo=" + articleNo
				+ "\nfirstSim=" + firstSim + "\nlastSim=" + lastSim
				+ "\nqtyOrdered=" + qtyOrdered + "\nqtyReceived=" + qtyReceived
				+ "\nqtyMatched=" + qtyMatched + "\npositionNumber="
				+ positionNumber + "\nlengthNumber=" + lengthNumber + "]";
	}
}
