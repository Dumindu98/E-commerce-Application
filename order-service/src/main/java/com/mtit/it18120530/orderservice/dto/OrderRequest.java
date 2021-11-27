package com.mtit.it18120530.orderservice.dto;

public class OrderRequest {

	private String customerName;
	private String email;
	private String address;
	private String productName;
	private String quantity;
	
	
	public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}


	public String getQuantity() {
		return quantity;
	}


	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "OrderRequest{" +
				"customerName='" + customerName + '\'' +
				", email='" + email + '\'' +
				", address='" + address + '\'' +
				", productName='" + productName + '\'' +
				", quantity='" + quantity + '\'' +
				'}';
	}
}
