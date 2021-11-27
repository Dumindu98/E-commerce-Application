package com.mtit.it18115376.productservice.objects;


public class ProductRequest {

    private String productName;
    private String stockkeeperName;
    private String productType;
    private String productWeight;
    private String exDate;
    private String productDetails;
    private int qty;

    public String getExDate() {
        return exDate;
    }

    public void setExDate(String exDate) {
        this.exDate = exDate;
    }

    public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

    public String getProductDetails() {
		return productDetails;
	}

	public void setProductDetails(String productDetails) {
		this.productDetails = productDetails;
	}

	public String getProductWeight() {
		return productWeight;
	}

	public void setProductWeight(String productWeight) {
		this.productWeight = productWeight;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}
	
	public String getStockkeeperName() {
		return stockkeeperName;
	}

	public void setStockkeeperName(String stockkeeperName) {
		this.stockkeeperName = stockkeeperName;
	}

	@Override
    public String toString() {
        return "ProductRequest{" +
                "productName='" + productName + '\'' +
                ", productType='" + productType + '\'' +
                ", productWeight='" + productWeight + '\'' +
                ", exDate='" + exDate + '\'' +
                ", productDetails='" + productDetails + '\'' +
                 ", qty='" + qty + '\'' +
                 ", stockkeeperName='" + stockkeeperName + '\'' +
                '}';
    }
}
