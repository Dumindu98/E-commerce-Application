package com.mtit.it18062502.paymentservice.objects;

public class InvoiceRequest {

    private int totalAmount;
    private String customerName;
    private String invoiceDate;

    public int getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getInvoicedate() {
        return invoiceDate;
    }

    public void setInvoicedate(String invoicedate) {
        this.invoiceDate = invoicedate;
    }
}
