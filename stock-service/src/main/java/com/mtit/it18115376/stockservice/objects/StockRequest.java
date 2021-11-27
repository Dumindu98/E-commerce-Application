package com.mtit.it18115376.stockservice.objects;

public class StockRequest {

    private int totalAmount;
    private String stockkeeperName;
    private String stockremoveDate;
    private String prductStatus;

    public int getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getStockkeeperName() {
		return stockkeeperName;
	}

	public void setStockkeeperName(String stockkeeperName) {
		this.stockkeeperName = stockkeeperName;
	}

    public String getStockremoveDate() {
		return stockremoveDate;
	}

	public void setStockremoveDate(String stockremoveDate) {
		this.stockremoveDate = stockremoveDate;
	}

	public String getPrductStatus() {
		return prductStatus;
	}

	public void setPrductStatus(String prductStatus) {
		this.prductStatus = prductStatus;
	}

	@Override
    public String toString() {
        return "InvoiceRequest{" +
                "totalAmount=" + totalAmount +
                ", stockkeeperName='" + stockkeeperName + '\'' +
                ", stockremoveDate='" + stockremoveDate + '\'' +
                ", prductStatus='" + prductStatus + '\'' +
                '}';
    }
}
