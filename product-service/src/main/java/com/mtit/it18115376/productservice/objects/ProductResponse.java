package com.mtit.it18115376.productservice.objects;

public class ProductResponse {

    private String Productid;
    private String message;
    private String stockId;

   
    public String getProductid() {
		return Productid;
	}

	public void setProductid(String productid) {
		Productid = productid;
	}

	public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

	public String getStockId() {
		return stockId;
	}

	public void setStockId(String stockId) {
		this.stockId = stockId;
	}

   
}
