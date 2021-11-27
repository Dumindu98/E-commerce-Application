package com.mtit.it18115376.stockservice.objects;

public class StockResponse {

    private String stockId;
    private String message;

    public String getStockId() {
		return stockId;
	}

	public void setStockId(String stockId) {
		this.stockId = stockId;
	}

	public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
