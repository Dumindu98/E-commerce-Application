package com.mtit.it18115376.productservice.objects;

public class StockRequest {

    private int totalAmount;
    private String stockkeeperName;
    private String stockremoveDate;

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


	
}
